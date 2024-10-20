package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("do")
public class class123 implements Runnable {

    @ObfuscatedName("do.s")
    public class47 field1941;

    @ObfuscatedName("do.g")
    public class133 field1948 = null;

    @ObfuscatedName("do.h")
    public class133 field1937 = null;

    @ObfuscatedName("do.l")
    public Thread field1938;

    @ObfuscatedName("do.e")
    public boolean field1939 = false;

    @ObfuscatedName("do.u")
    public EventQueue field1942;

    public class123() {
        Statics.field1935 = "Unknown";
        Statics.field1934 = "1.1";
        try {
            Statics.field1935 = System.getProperty("java.vendor");
            Statics.field1934 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1942 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1939 = false;
        this.field1938 = new Thread(this);
        this.field1938.setPriority(10);
        this.field1938.setDaemon(true);
        this.field1938.start();
    }

    @ObfuscatedName("do.l(I)V")
    public final void method2494() {
        synchronized (this) {
            this.field1939 = true;
            this.notifyAll();
        }
        try {
            this.field1938.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class133 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1939) {
                        return;
                    }
                    if (this.field1948 != null) {
                        var2 = this.field1948;
                        this.field1948 = this.field1948.field2075;
                        if (this.field1948 == null) {
                            this.field1937 = null;
                        }
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var12) {
                    }
                }
            }
            try {
                int var5 = var2.field2073;
                if (var5 == 1) {
                    var2.field2068 = new Socket(InetAddress.getByName((String) var2.field2076), var2.field2074);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2076);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2074);
                    var2.field2068 = var6;
                } else if (var5 == 4) {
                    var2.field2068 = new DataInputStream(((URL) var2.field2076).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2074 >> 24 & 0xFF) + "." + (var2.field2074 >> 16 & 0xFF) + "." + (var2.field2074 >> 8 & 0xFF) + "." + (var2.field2074 & 0xFF);
                    var2.field2068 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2072 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2072 = 2;
            }
        }
    }

    @ObfuscatedName("do.e(IIILjava/lang/Object;I)Let;")
    public final class133 method2483(int arg0, int arg1, int arg2, Object arg3) {
        class133 var5 = new class133();
        var5.field2073 = arg0;
        var5.field2074 = arg1;
        var5.field2076 = arg3;
        synchronized (this) {
            if (this.field1937 == null) {
                this.field1937 = this.field1948 = var5;
            } else {
                this.field1937.field2075 = var5;
                this.field1937 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("do.u(Ljava/lang/String;IB)Let;")
    public final class133 method2480(String arg0, int arg1) {
        return this.method2483(1, arg1, 0, arg0);
    }

    @ObfuscatedName("do.j(Ljava/lang/Runnable;II)Let;")
    public final class133 method2481(Runnable arg0, int arg1) {
        return this.method2483(2, arg1, 0, arg0);
    }

    @ObfuscatedName("do.c(IB)Let;")
    public final class133 method2486(int arg0) {
        return this.method2483(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("do.d(Ljava/net/URL;I)Let;")
    public final class133 method2505(URL arg0) {
        return this.method2483(4, 0, 0, arg0);
    }

    @ObfuscatedName("do.v(I)Lam;")
    public final class47 method2484() {
        return this.field1941;
    }
}
