package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("dg")
public class class123 implements Runnable {

    @ObfuscatedName("dg.y")
    public class47 field1946;

    @ObfuscatedName("dg.h")
    public class133 field1957 = null;

    @ObfuscatedName("dg.r")
    public class133 field1948 = null;

    @ObfuscatedName("dg.e")
    public Thread field1955;

    @ObfuscatedName("dg.k")
    public boolean field1950 = false;

    @ObfuscatedName("dg.b")
    public EventQueue field1949;

    public class123() {
        Statics.field1947 = "Unknown";
        Statics.field1892 = "1.1";
        try {
            Statics.field1947 = System.getProperty("java.vendor");
            Statics.field1892 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1949 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1950 = false;
        this.field1955 = new Thread(this);
        this.field1955.setPriority(10);
        this.field1955.setDaemon(true);
        this.field1955.start();
    }

    @ObfuscatedName("dg.z(I)V")
    public final void method2489() {
        synchronized (this) {
            this.field1950 = true;
            this.notifyAll();
        }
        try {
            this.field1955.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class133 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1950) {
                        return;
                    }
                    if (this.field1957 != null) {
                        var2 = this.field1957;
                        this.field1957 = this.field1957.field2077;
                        if (this.field1957 == null) {
                            this.field1948 = null;
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
                int var5 = var2.field2076;
                if (var5 == 1) {
                    var2.field2075 = new Socket(InetAddress.getByName((String) var2.field2074), var2.field2078);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2074);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2078);
                    var2.field2075 = var6;
                } else if (var5 == 4) {
                    var2.field2075 = new DataInputStream(((URL) var2.field2074).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2078 >> 24 & 0xFF) + "." + (var2.field2078 >> 16 & 0xFF) + "." + (var2.field2078 >> 8 & 0xFF) + "." + (var2.field2078 & 0xFF);
                    var2.field2075 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2071 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2071 = 2;
            }
        }
    }

    @ObfuscatedName("dg.y(IIILjava/lang/Object;I)Len;")
    public final class133 method2490(int arg0, int arg1, int arg2, Object arg3) {
        class133 var5 = new class133();
        var5.field2076 = arg0;
        var5.field2078 = arg1;
        var5.field2074 = arg3;
        synchronized (this) {
            if (this.field1948 == null) {
                this.field1948 = this.field1957 = var5;
            } else {
                this.field1948.field2077 = var5;
                this.field1948 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("dg.h(Ljava/lang/String;II)Len;")
    public final class133 method2505(String arg0, int arg1) {
        return this.method2490(1, arg1, 0, arg0);
    }

    @ObfuscatedName("dg.r(Ljava/lang/Runnable;IS)Len;")
    public final class133 method2492(Runnable arg0, int arg1) {
        return this.method2490(2, arg1, 0, arg0);
    }

    @ObfuscatedName("dg.e(II)Len;")
    public final class133 method2502(int arg0) {
        return this.method2490(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("dg.k(Ljava/net/URL;I)Len;")
    public final class133 method2494(URL arg0) {
        return this.method2490(4, 0, 0, arg0);
    }

    @ObfuscatedName("dg.b(B)Lab;")
    public final class47 method2508() {
        return this.field1946;
    }
}
