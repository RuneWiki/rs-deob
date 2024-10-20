package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("dj")
public class class125 implements Runnable {

    @ObfuscatedName("dj.z")
    public class48 field1931;

    @ObfuscatedName("dj.b")
    public class135 field1932 = null;

    @ObfuscatedName("dj.k")
    public class135 field1941 = null;

    @ObfuscatedName("dj.c")
    public Thread field1934;

    @ObfuscatedName("dj.w")
    public boolean field1935 = false;

    @ObfuscatedName("dj.l")
    public EventQueue field1936;

    public class125() {
        Statics.field1937 = "Unknown";
        Statics.field1929 = "1.1";
        try {
            Statics.field1937 = System.getProperty("java.vendor");
            Statics.field1929 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1936 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1935 = false;
        this.field1934 = new Thread(this);
        this.field1934.setPriority(10);
        this.field1934.setDaemon(true);
        this.field1934.start();
    }

    @ObfuscatedName("dj.b(I)V")
    public final void method2439() {
        synchronized (this) {
            this.field1935 = true;
            this.notifyAll();
        }
        try {
            this.field1934.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class135 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1935) {
                        return;
                    }
                    if (this.field1932 != null) {
                        var2 = this.field1932;
                        this.field1932 = this.field1932.field2052;
                        if (this.field1932 == null) {
                            this.field1941 = null;
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
                int var5 = var2.field2051;
                if (var5 == 1) {
                    var2.field2059 = new Socket(InetAddress.getByName((String) var2.field2058), var2.field2056);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2058);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2056);
                    var2.field2059 = var6;
                } else if (var5 == 4) {
                    var2.field2059 = new DataInputStream(((URL) var2.field2058).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2056 >> 24 & 0xFF) + "." + (var2.field2056 >> 16 & 0xFF) + "." + (var2.field2056 >> 8 & 0xFF) + "." + (var2.field2056 & 0xFF);
                    var2.field2059 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2055 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2055 = 2;
            }
        }
    }

    @ObfuscatedName("dj.k(IIILjava/lang/Object;I)Lew;")
    public final class135 method2440(int arg0, int arg1, int arg2, Object arg3) {
        class135 var5 = new class135();
        var5.field2051 = arg0;
        var5.field2056 = arg1;
        var5.field2058 = arg3;
        synchronized (this) {
            if (this.field1941 == null) {
                this.field1941 = this.field1932 = var5;
            } else {
                this.field1941.field2052 = var5;
                this.field1941 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("dj.c(Ljava/lang/String;II)Lew;")
    public final class135 method2441(String arg0, int arg1) {
        return this.method2440(1, arg1, 0, arg0);
    }

    @ObfuscatedName("dj.w(Ljava/lang/Runnable;IB)Lew;")
    public final class135 method2442(Runnable arg0, int arg1) {
        return this.method2440(2, arg1, 0, arg0);
    }

    @ObfuscatedName("dj.l(II)Lew;")
    public final class135 method2443(int arg0) {
        return this.method2440(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("dj.n(Ljava/net/URL;I)Lew;")
    public final class135 method2444(URL arg0) {
        return this.method2440(4, 0, 0, arg0);
    }

    @ObfuscatedName("dj.d(I)Law;")
    public final class48 method2445() {
        return this.field1931;
    }
}
