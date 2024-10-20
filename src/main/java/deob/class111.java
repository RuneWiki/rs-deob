package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("dj")
public final class class111 implements Runnable {

    @ObfuscatedName("dj.o")
    public Socket field1762;

    @ObfuscatedName("dj.m")
    public InputStream field1761;

    @ObfuscatedName("dj.b")
    public OutputStream field1752;

    @ObfuscatedName("dj.g")
    public boolean field1754 = false;

    @ObfuscatedName("dj.h")
    public class104 field1755;

    @ObfuscatedName("dj.v")
    public class103 field1756;

    @ObfuscatedName("dj.l")
    public byte[] field1757;

    @ObfuscatedName("dj.c")
    public int field1753 = 0;

    @ObfuscatedName("dj.u")
    public int field1758 = 0;

    @ObfuscatedName("dj.k")
    public boolean field1760 = false;

    public class111(Socket arg0, class104 arg1) throws IOException {
        this.field1755 = arg1;
        this.field1762 = arg0;
        this.field1762.setSoTimeout(30000);
        this.field1762.setTcpNoDelay(true);
        this.field1762.setReceiveBufferSize(16384);
        this.field1762.setSendBufferSize(16384);
        this.field1761 = this.field1762.getInputStream();
        this.field1752 = this.field1762.getOutputStream();
    }

    @ObfuscatedName("dj.b(B)V")
    public void method1915() {
        if (this.field1754) {
            return;
        }
        synchronized (this) {
            this.field1754 = true;
            this.notifyAll();
        }
        if (this.field1756 != null) {
            while (this.field1756.field1665 == 0) {
                class162.method238(1L);
            }
            if (this.field1756.field1665 == 1) {
                try {
                    ((Thread) this.field1756.field1663).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field1756 = null;
    }

    public void finalize() {
        this.method1915();
    }

    @ObfuscatedName("dj.g(I)I")
    public int method1901() throws IOException {
        return this.field1754 ? 0 : this.field1761.read();
    }

    @ObfuscatedName("dj.l(I)I")
    public int method1902() throws IOException {
        return this.field1754 ? 0 : this.field1761.available();
    }

    @ObfuscatedName("dj.c([BIII)V")
    public void method1903(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1754) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field1761.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("dj.u([BIII)V")
    public void method1904(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1754) {
            return;
        }
        if (this.field1760) {
            this.field1760 = false;
            throw new IOException();
        }
        if (this.field1757 == null) {
            this.field1757 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field1757[this.field1758] = arg0[arg1 + var5];
                this.field1758 = (this.field1758 + 1) % 5000;
                if ((this.field1753 + 4900) % 5000 == this.field1758) {
                    throw new IOException();
                }
            }
            if (this.field1756 == null) {
                this.field1756 = this.field1755.method1833(this, 3);
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
                        if (this.field1758 == this.field1753) {
                            if (this.field1754) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field1753;
                        if (this.field1758 >= this.field1753) {
                            var4 = this.field1758 - this.field1753;
                        } else {
                            var4 = 5000 - this.field1753;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field1752.write(this.field1757, var3, var4);
                    } catch (IOException var12) {
                        this.field1760 = true;
                    }
                    this.field1753 = (this.field1753 + var4) % 5000;
                    try {
                        if (this.field1758 == this.field1753) {
                            this.field1752.flush();
                        }
                    } catch (IOException var11) {
                        this.field1760 = true;
                    }
                    continue;
                }
                try {
                    if (this.field1761 != null) {
                        this.field1761.close();
                    }
                    if (this.field1752 != null) {
                        this.field1752.close();
                    }
                    if (this.field1762 != null) {
                        this.field1762.close();
                    }
                } catch (IOException var10) {
                }
                this.field1757 = null;
                break;
            }
        } catch (Exception var15) {
            class102.method1762((String) null, var15);
        }
    }
}
