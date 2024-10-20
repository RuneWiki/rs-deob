package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("dd")
public final class class111 implements Runnable {

    @ObfuscatedName("dd.b")
    public InputStream field1746;

    @ObfuscatedName("dd.l")
    public OutputStream field1737;

    @ObfuscatedName("dd.i")
    public Socket field1738;

    @ObfuscatedName("dd.t")
    public boolean field1742 = false;

    @ObfuscatedName("dd.k")
    public class104 field1740;

    @ObfuscatedName("dd.h")
    public class103 field1741;

    @ObfuscatedName("dd.n")
    public byte[] field1736;

    @ObfuscatedName("dd.f")
    public int field1743 = 0;

    @ObfuscatedName("dd.a")
    public int field1744 = 0;

    @ObfuscatedName("dd.r")
    public boolean field1745 = false;

    public class111(Socket arg0, class104 arg1) throws IOException {
        this.field1740 = arg1;
        this.field1738 = arg0;
        this.field1738.setSoTimeout(30000);
        this.field1738.setTcpNoDelay(true);
        this.field1738.setReceiveBufferSize(16384);
        this.field1738.setSendBufferSize(16384);
        this.field1746 = this.field1738.getInputStream();
        this.field1737 = this.field1738.getOutputStream();
    }

    @ObfuscatedName("dd.t(I)V")
    public void method1996() {
        if (this.field1742) {
            return;
        }
        synchronized (this) {
            this.field1742 = true;
            this.notifyAll();
        }
        if (this.field1741 != null) {
            while (this.field1741.field1656 == 0) {
                class162.method2157(1L);
            }
            if (this.field1741.field1656 == 1) {
                try {
                    ((Thread) this.field1741.field1660).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field1741 = null;
    }

    public void finalize() {
        this.method1996();
    }

    @ObfuscatedName("dd.k(I)I")
    public int method2020() throws IOException {
        return this.field1742 ? 0 : this.field1746.read();
    }

    @ObfuscatedName("dd.x(I)I")
    public int method2018() throws IOException {
        return this.field1742 ? 0 : this.field1746.available();
    }

    @ObfuscatedName("dd.z([BIIB)V")
    public void method2000(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1742) {
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

    @ObfuscatedName("dd.p([BIII)V")
    public void method2001(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1742) {
            return;
        }
        if (this.field1745) {
            this.field1745 = false;
            throw new IOException();
        }
        if (this.field1736 == null) {
            this.field1736 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field1736[this.field1744] = arg0[arg1 + var5];
                this.field1744 = (this.field1744 + 1) % 5000;
                if ((this.field1743 + 4900) % 5000 == this.field1744) {
                    throw new IOException();
                }
            }
            if (this.field1741 == null) {
                this.field1741 = this.field1740.method1923(this, 3);
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
                        if (this.field1744 == this.field1743) {
                            if (this.field1742) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field1743;
                        if (this.field1744 >= this.field1743) {
                            var4 = this.field1744 - this.field1743;
                        } else {
                            var4 = 5000 - this.field1743;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field1737.write(this.field1736, var3, var4);
                    } catch (IOException var12) {
                        this.field1745 = true;
                    }
                    this.field1743 = (this.field1743 + var4) % 5000;
                    try {
                        if (this.field1744 == this.field1743) {
                            this.field1737.flush();
                        }
                    } catch (IOException var11) {
                        this.field1745 = true;
                    }
                    continue;
                }
                try {
                    if (this.field1746 != null) {
                        this.field1746.close();
                    }
                    if (this.field1737 != null) {
                        this.field1737.close();
                    }
                    if (this.field1738 != null) {
                        this.field1738.close();
                    }
                } catch (IOException var10) {
                }
                this.field1736 = null;
                break;
            }
        } catch (Exception var15) {
            class102.method1864((String) null, var15);
        }
    }
}
