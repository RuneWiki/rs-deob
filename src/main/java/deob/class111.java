package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("da")
public final class class111 implements Runnable {

    @ObfuscatedName("da.k")
    public InputStream field1746;

    @ObfuscatedName("da.y")
    public OutputStream field1751;

    @ObfuscatedName("da.o")
    public Socket field1745;

    @ObfuscatedName("da.r")
    public boolean field1744 = false;

    @ObfuscatedName("da.w")
    public class104 field1747;

    @ObfuscatedName("da.j")
    public class103 field1743;

    @ObfuscatedName("da.q")
    public byte[] field1749;

    @ObfuscatedName("da.d")
    public int field1748 = 0;

    @ObfuscatedName("da.n")
    public int field1750 = 0;

    @ObfuscatedName("da.c")
    public boolean field1752 = false;

    public class111(Socket arg0, class104 arg1) throws IOException {
        this.field1747 = arg1;
        this.field1745 = arg0;
        this.field1745.setSoTimeout(30000);
        this.field1745.setTcpNoDelay(true);
        this.field1745.setReceiveBufferSize(16384);
        this.field1745.setSendBufferSize(16384);
        this.field1746 = this.field1745.getInputStream();
        this.field1751 = this.field1745.getOutputStream();
    }

    @ObfuscatedName("da.w(B)V")
    public void method1945() {
        if (this.field1744) {
            return;
        }
        synchronized (this) {
            this.field1744 = true;
            this.notifyAll();
        }
        if (this.field1743 != null) {
            while (this.field1743.field1668 == 0) {
                class169.method3344(1L);
            }
            if (this.field1743.field1668 == 1) {
                try {
                    ((Thread) this.field1743.field1676).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field1743 = null;
    }

    public void finalize() {
        this.method1945();
    }

    @ObfuscatedName("da.j(B)I")
    public int method1930() throws IOException {
        return this.field1744 ? 0 : this.field1746.read();
    }

    @ObfuscatedName("da.c(B)I")
    public int method1933() throws IOException {
        return this.field1744 ? 0 : this.field1746.available();
    }

    @ObfuscatedName("da.g([BIIS)V")
    public void method1934(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1744) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field1746.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("da.i([BIIB)V")
    public void method1935(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1744) {
            return;
        }
        if (this.field1752) {
            this.field1752 = false;
            throw new IOException();
        }
        if (this.field1749 == null) {
            this.field1749 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field1749[this.field1750] = arg0[arg1 + var5];
                this.field1750 = (this.field1750 + 1) % 5000;
                if ((this.field1748 + 4900) % 5000 == this.field1750) {
                    throw new IOException();
                }
            }
            if (this.field1743 == null) {
                this.field1743 = this.field1747.method1831(this, 3);
            }
            this.notifyAll();
        }
    }

    public void run() {
        try {
            while (true) {
                label84: {
                    int var3;
                    int var4;
                    synchronized (this) {
                        if (this.field1750 == this.field1748) {
                            if (this.field1744) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field1748;
                        if (this.field1750 >= this.field1748) {
                            var4 = this.field1750 - this.field1748;
                        } else {
                            var4 = 5000 - this.field1748;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field1751.write(this.field1749, var3, var4);
                    } catch (IOException var12) {
                        this.field1752 = true;
                    }
                    this.field1748 = (this.field1748 + var4) % 5000;
                    try {
                        if (this.field1750 == this.field1748) {
                            this.field1751.flush();
                        }
                    } catch (IOException var11) {
                        this.field1752 = true;
                    }
                    continue;
                }
                try {
                    if (this.field1746 != null) {
                        this.field1746.close();
                    }
                    if (this.field1751 != null) {
                        this.field1751.close();
                    }
                    if (this.field1745 != null) {
                        this.field1745.close();
                    }
                } catch (IOException var10) {
                }
                this.field1749 = null;
                break;
            }
        } catch (Exception var15) {
            class102.method706((String) null, var15);
        }
    }
}
