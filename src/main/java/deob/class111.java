package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("do")
public final class class111 implements Runnable {

    @ObfuscatedName("do.n")
    public InputStream field1756;

    @ObfuscatedName("do.d")
    public OutputStream field1754;

    @ObfuscatedName("do.m")
    public Socket field1747;

    @ObfuscatedName("do.h")
    public boolean field1748 = false;

    @ObfuscatedName("do.w")
    public class104 field1749;

    @ObfuscatedName("do.r")
    public class103 field1750;

    @ObfuscatedName("do.c")
    public byte[] field1745;

    @ObfuscatedName("do.p")
    public int field1751 = 0;

    @ObfuscatedName("do.g")
    public int field1753 = 0;

    @ObfuscatedName("do.z")
    public boolean field1755 = false;

    public class111(Socket arg0, class104 arg1) throws IOException {
        this.field1749 = arg1;
        this.field1747 = arg0;
        this.field1747.setSoTimeout(30000);
        this.field1747.setTcpNoDelay(true);
        this.field1747.setReceiveBufferSize(16384);
        this.field1747.setSendBufferSize(16384);
        this.field1756 = this.field1747.getInputStream();
        this.field1754 = this.field1747.getOutputStream();
    }

    @ObfuscatedName("do.w(I)V")
    public void method1984() {
        if (this.field1748) {
            return;
        }
        synchronized (this) {
            this.field1748 = true;
            this.notifyAll();
        }
        if (this.field1750 != null) {
            while (this.field1750.field1662 == 0) {
                Statics.method13(1L);
            }
            if (this.field1750.field1662 == 1) {
                try {
                    ((Thread) this.field1750.field1664).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field1750 = null;
    }

    public void finalize() {
        this.method1984();
    }

    @ObfuscatedName("do.r(I)I")
    public int method1967() throws IOException {
        return this.field1748 ? 0 : this.field1756.read();
    }

    @ObfuscatedName("do.c(I)I")
    public int method1968() throws IOException {
        return this.field1748 ? 0 : this.field1756.available();
    }

    @ObfuscatedName("do.z([BIIB)V")
    public void method1969(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1748) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field1756.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("do.q([BIII)V")
    public void method1970(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1748) {
            return;
        }
        if (this.field1755) {
            this.field1755 = false;
            throw new IOException();
        }
        if (this.field1745 == null) {
            this.field1745 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field1745[this.field1753] = arg0[arg1 + var5];
                this.field1753 = (this.field1753 + 1) % 5000;
                if ((this.field1751 + 4900) % 5000 == this.field1753) {
                    throw new IOException();
                }
            }
            if (this.field1750 == null) {
                this.field1750 = this.field1749.method1871(this, 3);
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
                        if (this.field1753 == this.field1751) {
                            if (this.field1748) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field1751;
                        if (this.field1753 >= this.field1751) {
                            var4 = this.field1753 - this.field1751;
                        } else {
                            var4 = 5000 - this.field1751;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field1754.write(this.field1745, var3, var4);
                    } catch (IOException var12) {
                        this.field1755 = true;
                    }
                    this.field1751 = (this.field1751 + var4) % 5000;
                    try {
                        if (this.field1753 == this.field1751) {
                            this.field1754.flush();
                        }
                    } catch (IOException var11) {
                        this.field1755 = true;
                    }
                    continue;
                }
                try {
                    if (this.field1756 != null) {
                        this.field1756.close();
                    }
                    if (this.field1754 != null) {
                        this.field1754.close();
                    }
                    if (this.field1747 != null) {
                        this.field1747.close();
                    }
                } catch (IOException var10) {
                }
                this.field1745 = null;
                break;
            }
        } catch (Exception var15) {
            class102.method755((String) null, var15);
        }
    }
}
