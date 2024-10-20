package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("dm")
public final class class111 implements Runnable {

    @ObfuscatedName("dm.s")
    public InputStream field1752;

    @ObfuscatedName("dm.c")
    public OutputStream field1747;

    @ObfuscatedName("dm.f")
    public Socket field1748;

    @ObfuscatedName("dm.h")
    public boolean field1758 = false;

    @ObfuscatedName("dm.a")
    public class104 field1750;

    @ObfuscatedName("dm.g")
    public class103 field1751;

    @ObfuscatedName("dm.k")
    public byte[] field1746;

    @ObfuscatedName("dm.u")
    public int field1749 = 0;

    @ObfuscatedName("dm.b")
    public int field1754 = 0;

    @ObfuscatedName("dm.x")
    public boolean field1755 = false;

    public class111(Socket arg0, class104 arg1) throws IOException {
        this.field1750 = arg1;
        this.field1748 = arg0;
        this.field1748.setSoTimeout(30000);
        this.field1748.setTcpNoDelay(true);
        this.field1748.setReceiveBufferSize(16384);
        this.field1748.setSendBufferSize(16384);
        this.field1752 = this.field1748.getInputStream();
        this.field1747 = this.field1748.getOutputStream();
    }

    @ObfuscatedName("dm.k(I)V")
    public void method1893() {
        if (this.field1758) {
            return;
        }
        synchronized (this) {
            this.field1758 = true;
            this.notifyAll();
        }
        if (this.field1751 != null) {
            while (this.field1751.field1664 == 0) {
                class162.method746(1L);
            }
            if (this.field1751.field1664 == 1) {
                try {
                    ((Thread) this.field1751.field1667).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field1751 = null;
    }

    public void finalize() {
        this.method1893();
    }

    @ObfuscatedName("dm.u(I)I")
    public int method1891() throws IOException {
        return this.field1758 ? 0 : this.field1752.read();
    }

    @ObfuscatedName("dm.b(I)I")
    public int method1894() throws IOException {
        return this.field1758 ? 0 : this.field1752.available();
    }

    @ObfuscatedName("dm.x([BIII)V")
    public void method1892(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1758) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field1752.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("dm.r([BIIB)V")
    public void method1902(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1758) {
            return;
        }
        if (this.field1755) {
            this.field1755 = false;
            throw new IOException();
        }
        if (this.field1746 == null) {
            this.field1746 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field1746[this.field1754] = arg0[arg1 + var5];
                this.field1754 = (this.field1754 + 1) % 5000;
                if ((this.field1749 + 4900) % 5000 == this.field1754) {
                    throw new IOException();
                }
            }
            if (this.field1751 == null) {
                this.field1751 = this.field1750.method1806(this, 3);
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
                        if (this.field1754 == this.field1749) {
                            if (this.field1758) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field1749;
                        if (this.field1754 >= this.field1749) {
                            var4 = this.field1754 - this.field1749;
                        } else {
                            var4 = 5000 - this.field1749;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field1747.write(this.field1746, var3, var4);
                    } catch (IOException var12) {
                        this.field1755 = true;
                    }
                    this.field1749 = (this.field1749 + var4) % 5000;
                    try {
                        if (this.field1754 == this.field1749) {
                            this.field1747.flush();
                        }
                    } catch (IOException var11) {
                        this.field1755 = true;
                    }
                    continue;
                }
                try {
                    if (this.field1752 != null) {
                        this.field1752.close();
                    }
                    if (this.field1747 != null) {
                        this.field1747.close();
                    }
                    if (this.field1748 != null) {
                        this.field1748.close();
                    }
                } catch (IOException var10) {
                }
                this.field1746 = null;
                break;
            }
        } catch (Exception var15) {
            class102.method690((String) null, var15);
        }
    }
}
