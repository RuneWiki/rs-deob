package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("ds")
public final class class111 implements Runnable {

    @ObfuscatedName("ds.u")
    public InputStream field1742;

    @ObfuscatedName("ds.x")
    public OutputStream field1738;

    @ObfuscatedName("ds.i")
    public Socket field1733;

    @ObfuscatedName("ds.a")
    public boolean field1731 = false;

    @ObfuscatedName("ds.f")
    public class104 field1745;

    @ObfuscatedName("ds.c")
    public class103 field1735;

    @ObfuscatedName("ds.d")
    public byte[] field1737;

    @ObfuscatedName("ds.l")
    public int field1734 = 0;

    @ObfuscatedName("ds.g")
    public int field1739 = 0;

    @ObfuscatedName("ds.z")
    public boolean field1740 = false;

    public class111(Socket arg0, class104 arg1) throws IOException {
        this.field1745 = arg1;
        this.field1733 = arg0;
        this.field1733.setSoTimeout(30000);
        this.field1733.setTcpNoDelay(true);
        this.field1733.setReceiveBufferSize(16384);
        this.field1733.setSendBufferSize(16384);
        this.field1742 = this.field1733.getInputStream();
        this.field1738 = this.field1733.getOutputStream();
    }

    @ObfuscatedName("ds.i(I)V")
    public void method1916() {
        if (this.field1731) {
            return;
        }
        synchronized (this) {
            this.field1731 = true;
            this.notifyAll();
        }
        if (this.field1735 != null) {
            while (this.field1735.field1649 == 0) {
                class162.method1528(1L);
            }
            if (this.field1735.field1649 == 1) {
                try {
                    ((Thread) this.field1735.field1653).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field1735 = null;
    }

    public void finalize() {
        this.method1916();
    }

    @ObfuscatedName("ds.a(I)I")
    public int method1911() throws IOException {
        return this.field1731 ? 0 : this.field1742.read();
    }

    @ObfuscatedName("ds.c(I)I")
    public int method1907() throws IOException {
        return this.field1731 ? 0 : this.field1742.available();
    }

    @ObfuscatedName("ds.g([BIII)V")
    public void method1904(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1731) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field1742.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("ds.z([BIIB)V")
    public void method1908(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1731) {
            return;
        }
        if (this.field1740) {
            this.field1740 = false;
            throw new IOException();
        }
        if (this.field1737 == null) {
            this.field1737 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field1737[this.field1739] = arg0[arg1 + var5];
                this.field1739 = (this.field1739 + 1) % 5000;
                if ((this.field1734 + 4900) % 5000 == this.field1739) {
                    throw new IOException();
                }
            }
            if (this.field1735 == null) {
                this.field1735 = this.field1745.method1815(this, 3);
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
                        if (this.field1739 == this.field1734) {
                            if (this.field1731) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field1734;
                        if (this.field1739 >= this.field1734) {
                            var4 = this.field1739 - this.field1734;
                        } else {
                            var4 = 5000 - this.field1734;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field1738.write(this.field1737, var3, var4);
                    } catch (IOException var12) {
                        this.field1740 = true;
                    }
                    this.field1734 = (this.field1734 + var4) % 5000;
                    try {
                        if (this.field1739 == this.field1734) {
                            this.field1738.flush();
                        }
                    } catch (IOException var11) {
                        this.field1740 = true;
                    }
                    continue;
                }
                try {
                    if (this.field1742 != null) {
                        this.field1742.close();
                    }
                    if (this.field1738 != null) {
                        this.field1738.close();
                    }
                    if (this.field1733 != null) {
                        this.field1733.close();
                    }
                } catch (IOException var10) {
                }
                this.field1737 = null;
                break;
            }
        } catch (Exception var15) {
            class102.method3043((String) null, var15);
        }
    }
}
