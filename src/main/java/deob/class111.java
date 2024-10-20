package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("dr")
public final class class111 implements Runnable {

    @ObfuscatedName("dr.f")
    public InputStream field1773;

    @ObfuscatedName("dr.i")
    public OutputStream field1764;

    @ObfuscatedName("dr.u")
    public Socket field1775;

    @ObfuscatedName("dr.h")
    public boolean field1766 = false;

    @ObfuscatedName("dr.r")
    public class104 field1765;

    @ObfuscatedName("dr.o")
    public class103 field1768;

    @ObfuscatedName("dr.l")
    public byte[] field1769;

    @ObfuscatedName("dr.n")
    public int field1770 = 0;

    @ObfuscatedName("dr.m")
    public int field1771 = 0;

    @ObfuscatedName("dr.w")
    public boolean field1772 = false;

    public class111(Socket arg0, class104 arg1) throws IOException {
        this.field1765 = arg1;
        this.field1775 = arg0;
        this.field1775.setSoTimeout(30000);
        this.field1775.setTcpNoDelay(true);
        this.field1775.setReceiveBufferSize(16384);
        this.field1775.setSendBufferSize(16384);
        this.field1773 = this.field1775.getInputStream();
        this.field1764 = this.field1775.getOutputStream();
    }

    @ObfuscatedName("dr.r(I)V")
    public void method1986() {
        if (this.field1766) {
            return;
        }
        synchronized (this) {
            this.field1766 = true;
            this.notifyAll();
        }
        if (this.field1768 != null) {
            while (this.field1768.field1687 == 0) {
                class162.method2141(1L);
            }
            if (this.field1768.field1687 == 1) {
                try {
                    ((Thread) this.field1768.field1691).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field1768 = null;
    }

    public void finalize() {
        this.method1986();
    }

    @ObfuscatedName("dr.o(S)I")
    public int method1975() throws IOException {
        return this.field1766 ? 0 : this.field1773.read();
    }

    @ObfuscatedName("dr.l(I)I")
    public int method1981() throws IOException {
        return this.field1766 ? 0 : this.field1773.available();
    }

    @ObfuscatedName("dr.n([BIII)V")
    public void method1977(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1766) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field1773.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("dr.m([BIIB)V")
    public void method1978(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1766) {
            return;
        }
        if (this.field1772) {
            this.field1772 = false;
            throw new IOException();
        }
        if (this.field1769 == null) {
            this.field1769 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field1769[this.field1771] = arg0[arg1 + var5];
                this.field1771 = (this.field1771 + 1) % 5000;
                if ((this.field1770 + 4900) % 5000 == this.field1771) {
                    throw new IOException();
                }
            }
            if (this.field1768 == null) {
                this.field1768 = this.field1765.method1885(this, 3);
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
                        if (this.field1771 == this.field1770) {
                            if (this.field1766) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field1770;
                        if (this.field1771 >= this.field1770) {
                            var4 = this.field1771 - this.field1770;
                        } else {
                            var4 = 5000 - this.field1770;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field1764.write(this.field1769, var3, var4);
                    } catch (IOException var12) {
                        this.field1772 = true;
                    }
                    this.field1770 = (this.field1770 + var4) % 5000;
                    try {
                        if (this.field1771 == this.field1770) {
                            this.field1764.flush();
                        }
                    } catch (IOException var11) {
                        this.field1772 = true;
                    }
                    continue;
                }
                try {
                    if (this.field1773 != null) {
                        this.field1773.close();
                    }
                    if (this.field1764 != null) {
                        this.field1764.close();
                    }
                    if (this.field1775 != null) {
                        this.field1775.close();
                    }
                } catch (IOException var10) {
                }
                this.field1769 = null;
                break;
            }
        } catch (Exception var15) {
            Statics.method1851((String) null, var15);
        }
    }
}
