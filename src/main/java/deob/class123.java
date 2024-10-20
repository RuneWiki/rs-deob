package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("dr")
public class class123 implements Runnable {

    @ObfuscatedName("dr.i")
    public class47 field1935;

    @ObfuscatedName("dr.g")
    public class133 field1937 = null;

    @ObfuscatedName("dr.x")
    public class133 field1938 = null;

    @ObfuscatedName("dr.b")
    public Thread field1940;

    @ObfuscatedName("dr.q")
    public boolean field1941 = false;

    @ObfuscatedName("dr.l")
    public EventQueue field1942;

    public class123() {
        Statics.field1943 = "Unknown";
        Statics.field1936 = "1.1";
        try {
            Statics.field1943 = System.getProperty("java.vendor");
            Statics.field1936 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1942 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1941 = false;
        this.field1940 = new Thread(this);
        this.field1940.setPriority(10);
        this.field1940.setDaemon(true);
        this.field1940.start();
    }

    @ObfuscatedName("dr.g(B)V")
    public final void method2481() {
        synchronized (this) {
            this.field1941 = true;
            this.notifyAll();
        }
        try {
            this.field1940.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class133 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1941) {
                        return;
                    }
                    if (this.field1937 != null) {
                        var2 = this.field1937;
                        this.field1937 = this.field1937.field2067;
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
                int var5 = var2.field2064;
                if (var5 == 1) {
                    var2.field2060 = new Socket(InetAddress.getByName((String) var2.field2059), var2.field2065);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2059);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2065);
                    var2.field2060 = var6;
                } else if (var5 == 4) {
                    var2.field2060 = new DataInputStream(((URL) var2.field2059).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2065 >> 24 & 0xFF) + "." + (var2.field2065 >> 16 & 0xFF) + "." + (var2.field2065 >> 8 & 0xFF) + "." + (var2.field2065 & 0xFF);
                    var2.field2060 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2063 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2063 = 2;
            }
        }
    }

    @ObfuscatedName("dr.x(IIILjava/lang/Object;B)Lev;")
    public final class133 method2465(int arg0, int arg1, int arg2, Object arg3) {
        class133 var5 = new class133();
        var5.field2064 = arg0;
        var5.field2065 = arg1;
        var5.field2059 = arg3;
        synchronized (this) {
            if (this.field1938 == null) {
                this.field1938 = this.field1937 = var5;
            } else {
                this.field1938.field2067 = var5;
                this.field1938 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("dr.b(Ljava/lang/String;II)Lev;")
    public final class133 method2462(String arg0, int arg1) {
        return this.method2465(1, arg1, 0, arg0);
    }

    @ObfuscatedName("dr.q(Ljava/lang/Runnable;II)Lev;")
    public final class133 method2463(Runnable arg0, int arg1) {
        return this.method2465(2, arg1, 0, arg0);
    }

    @ObfuscatedName("dr.l(IS)Lev;")
    public final class133 method2485(int arg0) {
        return this.method2465(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("dr.m(Ljava/net/URL;I)Lev;")
    public final class133 method2486(URL arg0) {
        return this.method2465(4, 0, 0, arg0);
    }

    @ObfuscatedName("dr.u(I)Lal;")
    public final class47 method2466() {
        return this.field1935;
    }
}
