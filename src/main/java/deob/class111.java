package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("dx")
public final class class111 implements Runnable {

    @ObfuscatedName("dx.d")
    public InputStream field1749;

    @ObfuscatedName("dx.c")
    public OutputStream field1743;

    @ObfuscatedName("dx.n")
    public Socket field1742;

    @ObfuscatedName("dx.q")
    public boolean field1740 = false;

    @ObfuscatedName("dx.t")
    public class104 field1744;

    @ObfuscatedName("dx.p")
    public class103 field1752;

    @ObfuscatedName("dx.u")
    public byte[] field1746;

    @ObfuscatedName("dx.z")
    public int field1747 = 0;

    @ObfuscatedName("dx.l")
    public int field1741 = 0;

    @ObfuscatedName("dx.v")
    public boolean field1750 = false;

    public class111(Socket arg0, class104 arg1) throws IOException {
        this.field1744 = arg1;
        this.field1742 = arg0;
        this.field1742.setSoTimeout(30000);
        this.field1742.setTcpNoDelay(true);
        this.field1742.setReceiveBufferSize(16384);
        this.field1742.setSendBufferSize(16384);
        this.field1749 = this.field1742.getInputStream();
        this.field1743 = this.field1742.getOutputStream();
    }

    @ObfuscatedName("dx.p(B)V")
    public void method1972() {
        if (this.field1740) {
            return;
        }
        synchronized (this) {
            this.field1740 = true;
            this.notifyAll();
        }
        if (this.field1752 != null) {
            while (this.field1752.field1654 == 0) {
                class138.method15(1L);
            }
            if (this.field1752.field1654 == 1) {
                try {
                    ((Thread) this.field1752.field1658).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field1752 = null;
    }

    public void finalize() {
        this.method1972();
    }

    @ObfuscatedName("dx.u(I)I")
    public int method1967() throws IOException {
        return this.field1740 ? 0 : this.field1749.read();
    }

    @ObfuscatedName("dx.w(I)I")
    public int method1969() throws IOException {
        return this.field1740 ? 0 : this.field1749.available();
    }

    @ObfuscatedName("dx.r([BIII)V")
    public void method1952(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1740) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field1749.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("dx.s([BIII)V")
    public void method1953(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1740) {
            return;
        }
        if (this.field1750) {
            this.field1750 = false;
            throw new IOException();
        }
        if (this.field1746 == null) {
            this.field1746 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field1746[this.field1741] = arg0[arg1 + var5];
                this.field1741 = (this.field1741 + 1) % 5000;
                if ((this.field1747 + 4900) % 5000 == this.field1741) {
                    throw new IOException();
                }
            }
            if (this.field1752 == null) {
                this.field1752 = this.field1744.method1852(this, 3);
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
                        if (this.field1747 == this.field1741) {
                            if (this.field1740) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field1747;
                        if (this.field1741 >= this.field1747) {
                            var4 = this.field1741 - this.field1747;
                        } else {
                            var4 = 5000 - this.field1747;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field1743.write(this.field1746, var3, var4);
                    } catch (IOException var12) {
                        this.field1750 = true;
                    }
                    this.field1747 = (this.field1747 + var4) % 5000;
                    try {
                        if (this.field1747 == this.field1741) {
                            this.field1743.flush();
                        }
                    } catch (IOException var11) {
                        this.field1750 = true;
                    }
                    continue;
                }
                try {
                    if (this.field1749 != null) {
                        this.field1749.close();
                    }
                    if (this.field1743 != null) {
                        this.field1743.close();
                    }
                    if (this.field1742 != null) {
                        this.field1742.close();
                    }
                } catch (IOException var10) {
                }
                this.field1746 = null;
                break;
            }
        } catch (Exception var15) {
            class102.method3059((String) null, var15);
        }
    }
}
