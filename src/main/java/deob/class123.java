package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("dq")
public class class123 implements Runnable {

    @ObfuscatedName("dq.x")
    public class47 field1936;

    @ObfuscatedName("dq.c")
    public class133 field1930 = null;

    @ObfuscatedName("dq.n")
    public class133 field1927 = null;

    @ObfuscatedName("dq.s")
    public Thread field1932;

    @ObfuscatedName("dq.r")
    public boolean field1933 = false;

    @ObfuscatedName("dq.w")
    public EventQueue field1938;

    public class123() {
        Statics.field1934 = "Unknown";
        Statics.field1931 = "1.1";
        try {
            Statics.field1934 = System.getProperty("java.vendor");
            Statics.field1931 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1938 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1933 = false;
        this.field1932 = new Thread(this);
        this.field1932.setPriority(10);
        this.field1932.setDaemon(true);
        this.field1932.start();
    }

    @ObfuscatedName("dq.n(I)V")
    public final void method2526() {
        synchronized (this) {
            this.field1933 = true;
            this.notifyAll();
        }
        try {
            this.field1932.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class133 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1933) {
                        return;
                    }
                    if (this.field1930 != null) {
                        var2 = this.field1930;
                        this.field1930 = this.field1930.field2061;
                        if (this.field1930 == null) {
                            this.field1927 = null;
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
                int var5 = var2.field2058;
                if (var5 == 1) {
                    var2.field2055 = new Socket(InetAddress.getByName((String) var2.field2060), var2.field2059);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2060);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2059);
                    var2.field2055 = var6;
                } else if (var5 == 4) {
                    var2.field2055 = new DataInputStream(((URL) var2.field2060).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2059 >> 24 & 0xFF) + "." + (var2.field2059 >> 16 & 0xFF) + "." + (var2.field2059 >> 8 & 0xFF) + "." + (var2.field2059 & 0xFF);
                    var2.field2055 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2053 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2053 = 2;
            }
        }
    }

    @ObfuscatedName("dq.s(IIILjava/lang/Object;I)Lei;")
    public final class133 method2527(int arg0, int arg1, int arg2, Object arg3) {
        class133 var5 = new class133();
        var5.field2058 = arg0;
        var5.field2059 = arg1;
        var5.field2060 = arg3;
        synchronized (this) {
            if (this.field1927 == null) {
                this.field1927 = this.field1930 = var5;
            } else {
                this.field1927.field2061 = var5;
                this.field1927 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("dq.r(Ljava/lang/String;II)Lei;")
    public final class133 method2528(String arg0, int arg1) {
        return this.method2527(1, arg1, 0, arg0);
    }

    @ObfuscatedName("dq.w(Ljava/lang/Runnable;II)Lei;")
    public final class133 method2546(Runnable arg0, int arg1) {
        return this.method2527(2, arg1, 0, arg0);
    }

    @ObfuscatedName("dq.u(II)Lei;")
    public final class133 method2547(int arg0) {
        return this.method2527(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("dq.d(Ljava/net/URL;I)Lei;")
    public final class133 method2531(URL arg0) {
        return this.method2527(4, 0, 0, arg0);
    }

    @ObfuscatedName("dq.h(B)Lam;")
    public final class47 method2532() {
        return this.field1936;
    }
}
