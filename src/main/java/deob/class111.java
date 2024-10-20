package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("dx")
public final class class111 implements Runnable {

    @ObfuscatedName("dx.b")
    public InputStream field1732;

    @ObfuscatedName("dx.e")
    public OutputStream field1733;

    @ObfuscatedName("dx.c")
    public Socket field1734;

    @ObfuscatedName("dx.l")
    public boolean field1735 = false;

    @ObfuscatedName("dx.y")
    public class104 field1741;

    @ObfuscatedName("dx.j")
    public class103 field1737;

    @ObfuscatedName("dx.g")
    public byte[] field1738;

    @ObfuscatedName("dx.s")
    public int field1739 = 0;

    @ObfuscatedName("dx.r")
    public int field1740 = 0;

    @ObfuscatedName("dx.t")
    public boolean field1742 = false;

    public class111(Socket arg0, class104 arg1) throws IOException {
        this.field1741 = arg1;
        this.field1734 = arg0;
        this.field1734.setSoTimeout(30000);
        this.field1734.setTcpNoDelay(true);
        this.field1734.setReceiveBufferSize(16384);
        this.field1734.setSendBufferSize(16384);
        this.field1732 = this.field1734.getInputStream();
        this.field1733 = this.field1734.getOutputStream();
    }

    @ObfuscatedName("dx.l(B)V")
    public void method2006() {
        if (this.field1735) {
            return;
        }
        synchronized (this) {
            this.field1735 = true;
            this.notifyAll();
        }
        if (this.field1737 != null) {
            while (this.field1737.field1652 == 0) {
                class162.method2120(1L);
            }
            if (this.field1737.field1652 == 1) {
                try {
                    ((Thread) this.field1737.field1656).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field1737 = null;
    }

    public void finalize() {
        this.method2006();
    }

    @ObfuscatedName("dx.y(I)I")
    public int method1993() throws IOException {
        return this.field1735 ? 0 : this.field1732.read();
    }

    @ObfuscatedName("dx.j(I)I")
    public int method2001() throws IOException {
        return this.field1735 ? 0 : this.field1732.available();
    }

    @ObfuscatedName("dx.t([BIII)V")
    public void method2000(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1735) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field1732.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("dx.k([BIII)V")
    public void method1996(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1735) {
            return;
        }
        if (this.field1742) {
            this.field1742 = false;
            throw new IOException();
        }
        if (this.field1738 == null) {
            this.field1738 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field1738[this.field1740] = arg0[arg1 + var5];
                this.field1740 = (this.field1740 + 1) % 5000;
                if ((this.field1739 + 4900) % 5000 == this.field1740) {
                    throw new IOException();
                }
            }
            if (this.field1737 == null) {
                this.field1737 = this.field1741.method1905(this, 3);
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
                        if (this.field1740 == this.field1739) {
                            if (this.field1735) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field1739;
                        if (this.field1740 >= this.field1739) {
                            var4 = this.field1740 - this.field1739;
                        } else {
                            var4 = 5000 - this.field1739;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field1733.write(this.field1738, var3, var4);
                    } catch (IOException var12) {
                        this.field1742 = true;
                    }
                    this.field1739 = (this.field1739 + var4) % 5000;
                    try {
                        if (this.field1740 == this.field1739) {
                            this.field1733.flush();
                        }
                    } catch (IOException var11) {
                        this.field1742 = true;
                    }
                    continue;
                }
                try {
                    if (this.field1732 != null) {
                        this.field1732.close();
                    }
                    if (this.field1733 != null) {
                        this.field1733.close();
                    }
                    if (this.field1734 != null) {
                        this.field1734.close();
                    }
                } catch (IOException var10) {
                }
                this.field1738 = null;
                break;
            }
        } catch (Exception var15) {
            class102.method24((String) null, var15);
        }
    }
}
