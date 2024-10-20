package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("dm")
public final class class111 implements Runnable {

    @ObfuscatedName("dm.p")
    public InputStream field1746;

    @ObfuscatedName("dm.g")
    public OutputStream field1747;

    @ObfuscatedName("dm.x")
    public Socket field1751;

    @ObfuscatedName("dm.q")
    public boolean field1749 = false;

    @ObfuscatedName("dm.d")
    public class104 field1748;

    @ObfuscatedName("dm.k")
    public class103 field1750;

    @ObfuscatedName("dm.j")
    public byte[] field1755;

    @ObfuscatedName("dm.s")
    public int field1753 = 0;

    @ObfuscatedName("dm.o")
    public int field1754 = 0;

    @ObfuscatedName("dm.a")
    public boolean field1752 = false;

    public class111(Socket arg0, class104 arg1) throws IOException {
        this.field1748 = arg1;
        this.field1751 = arg0;
        this.field1751.setSoTimeout(30000);
        this.field1751.setTcpNoDelay(true);
        this.field1751.setReceiveBufferSize(16384);
        this.field1751.setSendBufferSize(16384);
        this.field1746 = this.field1751.getInputStream();
        this.field1747 = this.field1751.getOutputStream();
    }

    @ObfuscatedName("dm.q(I)V")
    public void method1921() {
        if (this.field1749) {
            return;
        }
        synchronized (this) {
            this.field1749 = true;
            this.notifyAll();
        }
        if (this.field1750 != null) {
            while (this.field1750.field1668 == 0) {
                class162.method1858(1L);
            }
            if (this.field1750.field1668 == 1) {
                try {
                    ((Thread) this.field1750.field1665).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field1750 = null;
    }

    public void finalize() {
        this.method1921();
    }

    @ObfuscatedName("dm.d(B)I")
    public int method1927() throws IOException {
        return this.field1749 ? 0 : this.field1746.read();
    }

    @ObfuscatedName("dm.k(B)I")
    public int method1916() throws IOException {
        return this.field1749 ? 0 : this.field1746.available();
    }

    @ObfuscatedName("dm.j([BIII)V")
    public void method1917(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1749) {
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

    @ObfuscatedName("dm.s([BIIB)V")
    public void method1935(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1749) {
            return;
        }
        if (this.field1752) {
            this.field1752 = false;
            throw new IOException();
        }
        if (this.field1755 == null) {
            this.field1755 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field1755[this.field1754] = arg0[arg1 + var5];
                this.field1754 = (this.field1754 + 1) % 5000;
                if ((this.field1753 + 4900) % 5000 == this.field1754) {
                    throw new IOException();
                }
            }
            if (this.field1750 == null) {
                this.field1750 = this.field1748.method1838(this, 3);
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
                        if (this.field1754 == this.field1753) {
                            if (this.field1749) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field1753;
                        if (this.field1754 >= this.field1753) {
                            var4 = this.field1754 - this.field1753;
                        } else {
                            var4 = 5000 - this.field1753;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field1747.write(this.field1755, var3, var4);
                    } catch (IOException var12) {
                        this.field1752 = true;
                    }
                    this.field1753 = (this.field1753 + var4) % 5000;
                    try {
                        if (this.field1754 == this.field1753) {
                            this.field1747.flush();
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
                    if (this.field1747 != null) {
                        this.field1747.close();
                    }
                    if (this.field1751 != null) {
                        this.field1751.close();
                    }
                } catch (IOException var10) {
                }
                this.field1755 = null;
                break;
            }
        } catch (Exception var15) {
            class102.method1103((String) null, var15);
        }
    }
}
