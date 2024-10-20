package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("dt")
public final class class111 implements Runnable {

    @ObfuscatedName("dt.q")
    public InputStream field1757;

    @ObfuscatedName("dt.d")
    public OutputStream field1755;

    @ObfuscatedName("dt.h")
    public Socket field1749;

    @ObfuscatedName("dt.p")
    public boolean field1750 = false;

    @ObfuscatedName("dt.j")
    public class104 field1748;

    @ObfuscatedName("dt.n")
    public class103 field1752;

    @ObfuscatedName("dt.r")
    public byte[] field1753;

    @ObfuscatedName("dt.c")
    public int field1754 = 0;

    @ObfuscatedName("dt.i")
    public int field1758 = 0;

    @ObfuscatedName("dt.o")
    public boolean field1756 = false;

    public class111(Socket arg0, class104 arg1) throws IOException {
        this.field1748 = arg1;
        this.field1749 = arg0;
        this.field1749.setSoTimeout(30000);
        this.field1749.setTcpNoDelay(true);
        this.field1749.setReceiveBufferSize(16384);
        this.field1749.setSendBufferSize(16384);
        this.field1757 = this.field1749.getInputStream();
        this.field1755 = this.field1749.getOutputStream();
    }

    @ObfuscatedName("dt.h(B)V")
    public void method2017() {
        if (this.field1750) {
            return;
        }
        synchronized (this) {
            this.field1750 = true;
            this.notifyAll();
        }
        if (this.field1752 != null) {
            while (this.field1752.field1672 == 0) {
                class162.method2156(1L);
            }
            if (this.field1752.field1672 == 1) {
                try {
                    ((Thread) this.field1752.field1673).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field1752 = null;
    }

    public void finalize() {
        this.method2017();
    }

    @ObfuscatedName("dt.p(I)I")
    public int method2015() throws IOException {
        return this.field1750 ? 0 : this.field1757.read();
    }

    @ObfuscatedName("dt.j(B)I")
    public int method2027() throws IOException {
        return this.field1750 ? 0 : this.field1757.available();
    }

    @ObfuscatedName("dt.n([BIII)V")
    public void method2016(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1750) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field1757.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("dt.c([BIII)V")
    public void method2013(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1750) {
            return;
        }
        if (this.field1756) {
            this.field1756 = false;
            throw new IOException();
        }
        if (this.field1753 == null) {
            this.field1753 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field1753[this.field1758] = arg0[arg1 + var5];
                this.field1758 = (this.field1758 + 1) % 5000;
                if ((this.field1754 + 4900) % 5000 == this.field1758) {
                    throw new IOException();
                }
            }
            if (this.field1752 == null) {
                this.field1752 = this.field1748.method1930(this, 3);
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
                        if (this.field1758 == this.field1754) {
                            if (this.field1750) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field1754;
                        if (this.field1758 >= this.field1754) {
                            var4 = this.field1758 - this.field1754;
                        } else {
                            var4 = 5000 - this.field1754;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field1755.write(this.field1753, var3, var4);
                    } catch (IOException var12) {
                        this.field1756 = true;
                    }
                    this.field1754 = (this.field1754 + var4) % 5000;
                    try {
                        if (this.field1758 == this.field1754) {
                            this.field1755.flush();
                        }
                    } catch (IOException var11) {
                        this.field1756 = true;
                    }
                    continue;
                }
                try {
                    if (this.field1757 != null) {
                        this.field1757.close();
                    }
                    if (this.field1755 != null) {
                        this.field1755.close();
                    }
                    if (this.field1749 != null) {
                        this.field1749.close();
                    }
                } catch (IOException var10) {
                }
                this.field1753 = null;
                break;
            }
        } catch (Exception var15) {
            class102.method811((String) null, var15);
        }
    }
}
