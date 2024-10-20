package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("ek")
public final class class132 extends class328 implements Runnable {

    @ObfuscatedName("ek.f")
    public InputStream field1492;

    @ObfuscatedName("ek.o")
    public Socket field1491;

    @ObfuscatedName("ek.u")
    public OutputStream field1490;

    @ObfuscatedName("ek.p")
    public boolean field1496 = false;

    @ObfuscatedName("ek.b")
    public class128 field1493;

    @ObfuscatedName("ek.e")
    public class134 field1494;

    @ObfuscatedName("ek.k")
    public byte[] field1501;

    @ObfuscatedName("ek.g")
    public int field1502 = 0;

    @ObfuscatedName("ek.h")
    public int field1497 = 0;

    @ObfuscatedName("ek.n")
    public boolean field1498 = false;

    @ObfuscatedName("ek.l")
    public final int field1495;

    @ObfuscatedName("ek.m")
    public final int field1500;

    public class132(Socket arg0, class128 arg1, int arg2) throws IOException {
        this.field1493 = arg1;
        this.field1491 = arg0;
        this.field1495 = arg2;
        this.field1500 = arg2 - 100;
        this.field1491.setSoTimeout(30000);
        this.field1491.setTcpNoDelay(true);
        this.field1491.setReceiveBufferSize(65536);
        this.field1491.setSendBufferSize(65536);
        this.field1492 = this.field1491.getInputStream();
        this.field1490 = this.field1491.getOutputStream();
    }

    @ObfuscatedName("ek.f(I)V")
    public void method2268() {
        if (this.field1496) {
            return;
        }
        synchronized (this) {
            this.field1496 = true;
            this.notifyAll();
        }
        if (this.field1494 != null) {
            while (this.field1494.field1515 == 0) {
                class380.method4072(1L);
            }
            if (this.field1494.field1515 == 1) {
                try {
                    ((Thread) this.field1494.field1519).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field1494 = null;
    }

    public void finalize() {
        this.method2268();
    }

    @ObfuscatedName("ek.o(B)I")
    public int method2260() throws IOException {
        return this.field1496 ? 0 : this.field1492.read();
    }

    @ObfuscatedName("ek.u(B)I")
    public int method2261() throws IOException {
        return this.field1496 ? 0 : this.field1492.available();
    }

    @ObfuscatedName("ek.p(II)Z")
    public boolean method2262(int arg0) throws IOException {
        if (this.field1496) {
            return false;
        } else {
            return this.field1492.available() >= arg0;
        }
    }

    @ObfuscatedName("ek.b([BIIB)I")
    public int method2291(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1496) {
            return 0;
        }
        int var4 = arg2;
        while (arg2 > 0) {
            int var5 = this.field1492.read(arg0, arg1, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 += var5;
            arg2 -= var5;
        }
        return var4;
    }

    @ObfuscatedName("ek.e([BIII)V")
    public void method2264(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1496) {
            return;
        }
        if (this.field1498) {
            this.field1498 = false;
            throw new IOException();
        }
        if (this.field1501 == null) {
            this.field1501 = new byte[this.field1495];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field1501[this.field1497] = arg0[arg1 + var5];
                this.field1497 = (this.field1497 + 1) % this.field1495;
                if ((this.field1502 + this.field1500) % this.field1495 == this.field1497) {
                    throw new IOException();
                }
            }
            if (this.field1494 == null) {
                this.field1494 = this.field1493.method2223(this, 3);
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
                        if (this.field1502 == this.field1497) {
                            if (this.field1496) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field1502;
                        if (this.field1497 >= this.field1502) {
                            var4 = this.field1497 - this.field1502;
                        } else {
                            var4 = this.field1495 - this.field1502;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field1490.write(this.field1501, var3, var4);
                    } catch (IOException var12) {
                        this.field1498 = true;
                    }
                    this.field1502 = (this.field1502 + var4) % this.field1495;
                    try {
                        if (this.field1502 == this.field1497) {
                            this.field1490.flush();
                        }
                    } catch (IOException var11) {
                        this.field1498 = true;
                    }
                    continue;
                }
                try {
                    if (this.field1492 != null) {
                        this.field1492.close();
                    }
                    if (this.field1490 != null) {
                        this.field1490.close();
                    }
                    if (this.field1491 != null) {
                        this.field1491.close();
                    }
                } catch (IOException var10) {
                }
                this.field1501 = null;
                break;
            }
        } catch (Exception var15) {
            class405.method3718((String) null, var15);
        }
    }

    @ObfuscatedName("ek.k([BIII)V")
    public void method2265(byte[] arg0, int arg1, int arg2) throws IOException {
        this.method2264(arg0, arg1, arg2);
    }
}
