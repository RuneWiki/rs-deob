package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("dv")
public class class123 implements Runnable {

    @ObfuscatedName("dv.h")
    public class47 field1936;

    @ObfuscatedName("dv.m")
    public class133 field1937 = null;

    @ObfuscatedName("dv.u")
    public class133 field1938 = null;

    @ObfuscatedName("dv.j")
    public Thread field1939;

    @ObfuscatedName("dv.b")
    public boolean field1940 = false;

    @ObfuscatedName("dv.v")
    public EventQueue field1941;

    public class123() {
        Statics.field1942 = "Unknown";
        Statics.field1934 = "1.1";
        try {
            Statics.field1942 = System.getProperty("java.vendor");
            Statics.field1934 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1941 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1940 = false;
        this.field1939 = new Thread(this);
        this.field1939.setPriority(10);
        this.field1939.setDaemon(true);
        this.field1939.start();
    }

    @ObfuscatedName("dv.j(I)V")
    public final void method2438() {
        synchronized (this) {
            this.field1940 = true;
            this.notifyAll();
        }
        try {
            this.field1939.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class133 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1940) {
                        return;
                    }
                    if (this.field1937 != null) {
                        var2 = this.field1937;
                        this.field1937 = this.field1937.field2054;
                        if (this.field1937 == null) {
                            this.field1938 = null;
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
                int var5 = var2.field2053;
                if (var5 == 1) {
                    var2.field2057 = new Socket(InetAddress.getByName((String) var2.field2049), var2.field2055);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2049);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2055);
                    var2.field2057 = var6;
                } else if (var5 == 4) {
                    var2.field2057 = new DataInputStream(((URL) var2.field2049).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2055 >> 24 & 0xFF) + "." + (var2.field2055 >> 16 & 0xFF) + "." + (var2.field2055 >> 8 & 0xFF) + "." + (var2.field2055 & 0xFF);
                    var2.field2057 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2051 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2051 = 2;
            }
        }
    }

    @ObfuscatedName("dv.b(IIILjava/lang/Object;B)Lem;")
    public final class133 method2441(int arg0, int arg1, int arg2, Object arg3) {
        class133 var5 = new class133();
        var5.field2053 = arg0;
        var5.field2055 = arg1;
        var5.field2049 = arg3;
        synchronized (this) {
            if (this.field1938 == null) {
                this.field1938 = this.field1937 = var5;
            } else {
                this.field1938.field2054 = var5;
                this.field1938 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("dv.v(Ljava/lang/String;II)Lem;")
    public final class133 method2442(String arg0, int arg1) {
        return this.method2441(1, arg1, 0, arg0);
    }

    @ObfuscatedName("dv.y(Ljava/lang/Runnable;IB)Lem;")
    public final class133 method2443(Runnable arg0, int arg1) {
        return this.method2441(2, arg1, 0, arg0);
    }

    @ObfuscatedName("dv.w(IB)Lem;")
    public final class133 method2439(int arg0) {
        return this.method2441(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("dv.x(Ljava/net/URL;I)Lem;")
    public final class133 method2445(URL arg0) {
        return this.method2441(4, 0, 0, arg0);
    }

    @ObfuscatedName("dv.k(I)Law;")
    public final class47 method2465() {
        return this.field1936;
    }
}
