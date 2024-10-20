package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("dh")
public final class class111 implements Runnable {

    @ObfuscatedName("dh.i")
    public OutputStream field1741;

    @ObfuscatedName("dh.e")
    public InputStream field1746;

    @ObfuscatedName("dh.f")
    public Socket field1736;

    @ObfuscatedName("dh.k")
    public boolean field1734 = false;

    @ObfuscatedName("dh.g")
    public class104 field1738;

    @ObfuscatedName("dh.n")
    public class103 field1735;

    @ObfuscatedName("dh.a")
    public byte[] field1740;

    @ObfuscatedName("dh.q")
    public int field1739 = 0;

    @ObfuscatedName("dh.w")
    public int field1742 = 0;

    @ObfuscatedName("dh.v")
    public boolean field1743 = false;

    public class111(Socket arg0, class104 arg1) throws IOException {
        this.field1738 = arg1;
        this.field1736 = arg0;
        this.field1736.setSoTimeout(30000);
        this.field1736.setTcpNoDelay(true);
        this.field1736.setReceiveBufferSize(16384);
        this.field1736.setSendBufferSize(16384);
        this.field1746 = this.field1736.getInputStream();
        this.field1741 = this.field1736.getOutputStream();
    }

    @ObfuscatedName("dh.f(B)V")
    public void method1915() {
        if (this.field1734) {
            return;
        }
        synchronized (this) {
            this.field1734 = true;
            this.notifyAll();
        }
        if (this.field1735 != null) {
            while (this.field1735.field1651 == 0) {
                class162.method150(1L);
            }
            if (this.field1735.field1651 == 1) {
                try {
                    ((Thread) this.field1735.field1653).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field1735 = null;
    }

    public void finalize() {
        this.method1915();
    }

    @ObfuscatedName("dh.k(B)I")
    public int method1910() throws IOException {
        return this.field1734 ? 0 : this.field1746.read();
    }

    @ObfuscatedName("dh.a(B)I")
    public int method1908() throws IOException {
        return this.field1734 ? 0 : this.field1746.available();
    }

    @ObfuscatedName("dh.q([BIII)V")
    public void method1911(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1734) {
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

    @ObfuscatedName("dh.w([BIIB)V")
    public void method1912(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1734) {
            return;
        }
        if (this.field1743) {
            this.field1743 = false;
            throw new IOException();
        }
        if (this.field1740 == null) {
            this.field1740 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field1740[this.field1742] = arg0[arg1 + var5];
                this.field1742 = (this.field1742 + 1) % 5000;
                if ((this.field1739 + 4900) % 5000 == this.field1742) {
                    throw new IOException();
                }
            }
            if (this.field1735 == null) {
                this.field1735 = this.field1738.method1820(this, 3);
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
                        if (this.field1742 == this.field1739) {
                            if (this.field1734) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field1739;
                        if (this.field1742 >= this.field1739) {
                            var4 = this.field1742 - this.field1739;
                        } else {
                            var4 = 5000 - this.field1739;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field1741.write(this.field1740, var3, var4);
                    } catch (IOException var12) {
                        this.field1743 = true;
                    }
                    this.field1739 = (this.field1739 + var4) % 5000;
                    try {
                        if (this.field1742 == this.field1739) {
                            this.field1741.flush();
                        }
                    } catch (IOException var11) {
                        this.field1743 = true;
                    }
                    continue;
                }
                try {
                    if (this.field1746 != null) {
                        this.field1746.close();
                    }
                    if (this.field1741 != null) {
                        this.field1741.close();
                    }
                    if (this.field1736 != null) {
                        this.field1736.close();
                    }
                } catch (IOException var10) {
                }
                this.field1740 = null;
                break;
            }
        } catch (Exception var15) {
            class102.method1780((String) null, var15);
        }
    }
}
