package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("dc")
public final class class111 implements Runnable {

    @ObfuscatedName("dc.x")
    public InputStream field1756;

    @ObfuscatedName("dc.j")
    public OutputStream field1755;

    @ObfuscatedName("dc.c")
    public Socket field1763;

    @ObfuscatedName("dc.d")
    public boolean field1757 = false;

    @ObfuscatedName("dc.w")
    public class104 field1758;

    @ObfuscatedName("dc.h")
    public class103 field1759;

    @ObfuscatedName("dc.u")
    public byte[] field1762;

    @ObfuscatedName("dc.k")
    public int field1761 = 0;

    @ObfuscatedName("dc.g")
    public int field1754 = 0;

    @ObfuscatedName("dc.y")
    public boolean field1760 = false;

    public class111(Socket arg0, class104 arg1) throws IOException {
        this.field1758 = arg1;
        this.field1763 = arg0;
        this.field1763.setSoTimeout(30000);
        this.field1763.setTcpNoDelay(true);
        this.field1763.setReceiveBufferSize(16384);
        this.field1763.setSendBufferSize(16384);
        this.field1756 = this.field1763.getInputStream();
        this.field1755 = this.field1763.getOutputStream();
    }

    @ObfuscatedName("dc.c(B)V")
    public void method1991() {
        if (this.field1757) {
            return;
        }
        synchronized (this) {
            this.field1757 = true;
            this.notifyAll();
        }
        if (this.field1759 != null) {
            while (this.field1759.field1674 == 0) {
                class162.method2485(1L);
            }
            if (this.field1759.field1674 == 1) {
                try {
                    ((Thread) this.field1759.field1678).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field1759 = null;
    }

    public void finalize() {
        this.method1991();
    }

    @ObfuscatedName("dc.d(I)I")
    public int method1994() throws IOException {
        return this.field1757 ? 0 : this.field1756.read();
    }

    @ObfuscatedName("dc.w(B)I")
    public int method1992() throws IOException {
        return this.field1757 ? 0 : this.field1756.available();
    }

    @ObfuscatedName("dc.u([BIIB)V")
    public void method1995(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1757) {
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

    @ObfuscatedName("dc.y([BIII)V")
    public void method1993(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1757) {
            return;
        }
        if (this.field1760) {
            this.field1760 = false;
            throw new IOException();
        }
        if (this.field1762 == null) {
            this.field1762 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field1762[this.field1754] = arg0[arg1 + var5];
                this.field1754 = (this.field1754 + 1) % 5000;
                if ((this.field1761 + 4900) % 5000 == this.field1754) {
                    throw new IOException();
                }
            }
            if (this.field1759 == null) {
                this.field1759 = this.field1758.method1906(this, 3);
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
                        if (this.field1761 == this.field1754) {
                            if (this.field1757) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field1761;
                        if (this.field1754 >= this.field1761) {
                            var4 = this.field1754 - this.field1761;
                        } else {
                            var4 = 5000 - this.field1761;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field1755.write(this.field1762, var3, var4);
                    } catch (IOException var12) {
                        this.field1760 = true;
                    }
                    this.field1761 = (this.field1761 + var4) % 5000;
                    try {
                        if (this.field1761 == this.field1754) {
                            this.field1755.flush();
                        }
                    } catch (IOException var11) {
                        this.field1760 = true;
                    }
                    continue;
                }
                try {
                    if (this.field1756 != null) {
                        this.field1756.close();
                    }
                    if (this.field1755 != null) {
                        this.field1755.close();
                    }
                    if (this.field1763 != null) {
                        this.field1763.close();
                    }
                } catch (IOException var10) {
                }
                this.field1762 = null;
                break;
            }
        } catch (Exception var15) {
            class102.method702((String) null, var15);
        }
    }
}
