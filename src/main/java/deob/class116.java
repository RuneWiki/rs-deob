package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("bt")
public final class class116 implements Runnable {

    @ObfuscatedName("bt.f")
    public boolean field1808 = false;

    @ObfuscatedName("bt.g")
    public int field1813 = 0;

    @ObfuscatedName("bt.e")
    public int field1806 = 0;

    @ObfuscatedName("bt.n")
    public byte[] field1805;

    @ObfuscatedName("bt.o")
    public Socket field1801;

    @ObfuscatedName("bt.j")
    public InputStream field1807;

    @ObfuscatedName("bt.h")
    public class110 field1803;

    @ObfuscatedName("bt.t")
    public boolean field1802 = false;

    @ObfuscatedName("bt.r")
    public class107 field1799;

    @ObfuscatedName("bt.p")
    public OutputStream field1804;

    @ObfuscatedName("bt.n([BIIB)V")
    public void method1964(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1802) {
            return;
        }
        if (this.field1808) {
            this.field1808 = false;
            throw new IOException();
        }
        if (this.field1805 == null) {
            this.field1805 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field1805[this.field1806] = arg0[arg1 + var5];
                this.field1806 = (this.field1806 + 1) % 5000;
                if ((this.field1813 + 4900) % 5000 == this.field1806) {
                    throw new IOException();
                }
            }
            if (this.field1799 == null) {
                this.field1799 = this.field1803.method1905(this, 3);
            }
            this.notifyAll();
        }
    }

    @ObfuscatedName("bt.h(I)I")
    public int method1968() throws IOException {
        return this.field1802 ? 0 : this.field1807.available();
    }

    @ObfuscatedName("bt.r([BIII)V")
    public void method1969(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1802) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field1807.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    public void run() {
        try {
            while (true) {
                label84: {
                    int var3;
                    int var4;
                    synchronized (this) {
                        if (this.field1813 == this.field1806) {
                            if (this.field1802) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field1813;
                        if (this.field1806 >= this.field1813) {
                            var4 = this.field1806 - this.field1813;
                        } else {
                            var4 = 5000 - this.field1813;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field1804.write(this.field1805, var3, var4);
                    } catch (IOException var12) {
                        this.field1808 = true;
                    }
                    this.field1813 = (this.field1813 + var4) % 5000;
                    try {
                        if (this.field1813 == this.field1806) {
                            this.field1804.flush();
                        }
                    } catch (IOException var11) {
                        this.field1808 = true;
                    }
                    continue;
                }
                try {
                    if (this.field1807 != null) {
                        this.field1807.close();
                    }
                    if (this.field1804 != null) {
                        this.field1804.close();
                    }
                    if (this.field1801 != null) {
                        this.field1801.close();
                    }
                } catch (IOException var10) {
                }
                this.field1805 = null;
                break;
            }
        } catch (Exception var15) {
            class156.method2297((String) null, var15);
        }
    }

    public void finalize() {
        this.method1979();
    }

    @ObfuscatedName("bt.t(B)I")
    public int method1978() throws IOException {
        return this.field1802 ? 0 : this.field1807.read();
    }

    @ObfuscatedName("bt.o(I)V")
    public void method1979() {
        if (this.field1802) {
            return;
        }
        synchronized (this) {
            this.field1802 = true;
            this.notifyAll();
        }
        if (this.field1799 != null) {
            while (this.field1799.field1467 == 0) {
                class30.method1166(1L);
            }
            if (this.field1799.field1467 == 1) {
                try {
                    ((Thread) this.field1799.field1471).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field1799 = null;
    }

    public class116(Socket arg0, class110 arg1) throws IOException {
        this.field1803 = arg1;
        this.field1801 = arg0;
        this.field1801.setSoTimeout(30000);
        this.field1801.setTcpNoDelay(true);
        this.field1807 = this.field1801.getInputStream();
        this.field1804 = this.field1801.getOutputStream();
    }
}
