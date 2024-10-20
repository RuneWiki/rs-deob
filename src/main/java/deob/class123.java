package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("dz")
public class class123 implements Runnable {

    @ObfuscatedName("dz.k")
    public class47 field1940;

    @ObfuscatedName("dz.e")
    public class133 field1951 = null;

    @ObfuscatedName("dz.w")
    public class133 field1942 = null;

    @ObfuscatedName("dz.m")
    public Thread field1938;

    @ObfuscatedName("dz.u")
    public boolean field1945 = false;

    @ObfuscatedName("dz.j")
    public EventQueue field1943;

    public class123() {
        Statics.field1941 = "Unknown";
        Statics.field1939 = "1.1";
        try {
            Statics.field1941 = System.getProperty("java.vendor");
            Statics.field1939 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1943 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1945 = false;
        this.field1938 = new Thread(this);
        this.field1938.setPriority(10);
        this.field1938.setDaemon(true);
        this.field1938.start();
    }

    @ObfuscatedName("dz.k(I)V")
    public final void method2457() {
        synchronized (this) {
            this.field1945 = true;
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
                    if (this.field1945) {
                        return;
                    }
                    if (this.field1951 != null) {
                        var2 = this.field1951;
                        this.field1951 = this.field1951.field2071;
                        if (this.field1951 == null) {
                            this.field1942 = null;
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
                int var5 = var2.field2074;
                if (var5 == 1) {
                    var2.field2077 = new Socket(InetAddress.getByName((String) var2.field2076), var2.field2075);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2076);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2075);
                    var2.field2077 = var6;
                } else if (var5 == 4) {
                    var2.field2077 = new DataInputStream(((URL) var2.field2076).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2075 >> 24 & 0xFF) + "." + (var2.field2075 >> 16 & 0xFF) + "." + (var2.field2075 >> 8 & 0xFF) + "." + (var2.field2075 & 0xFF);
                    var2.field2077 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2070 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2070 = 2;
            }
        }
    }

    @ObfuscatedName("dz.e(IIILjava/lang/Object;B)Lef;")
    public final class133 method2459(int arg0, int arg1, int arg2, Object arg3) {
        class133 var5 = new class133();
        var5.field2074 = arg0;
        var5.field2075 = arg1;
        var5.field2076 = arg3;
        synchronized (this) {
            if (this.field1942 == null) {
                this.field1942 = this.field1951 = var5;
            } else {
                this.field1942.field2071 = var5;
                this.field1942 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("dz.w(Ljava/lang/String;IB)Lef;")
    public final class133 method2485(String arg0, int arg1) {
        return this.method2459(1, arg1, 0, arg0);
    }

    @ObfuscatedName("dz.m(Ljava/lang/Runnable;II)Lef;")
    public final class133 method2461(Runnable arg0, int arg1) {
        return this.method2459(2, arg1, 0, arg0);
    }

    @ObfuscatedName("dz.u(IB)Lef;")
    public final class133 method2472(int arg0) {
        return this.method2459(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("dz.j(Ljava/net/URL;I)Lef;")
    public final class133 method2484(URL arg0) {
        return this.method2459(4, 0, 0, arg0);
    }

    @ObfuscatedName("dz.o(I)Lat;")
    public final class47 method2464() {
        return this.field1940;
    }
}
