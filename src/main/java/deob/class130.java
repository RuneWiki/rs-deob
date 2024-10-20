package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("bc")
public class class130 implements Runnable {

    @ObfuscatedName("bc.d")
    public EventQueue field1940;

    @ObfuscatedName("bc.b")
    public class186 field1942;

    @ObfuscatedName("bc.m")
    public class157 field1937 = null;

    @ObfuscatedName("bc.i")
    public class157 field1936 = null;

    @ObfuscatedName("bc.z")
    public Thread field1938;

    @ObfuscatedName("bc.x")
    public boolean field1939 = false;

    @ObfuscatedName("bc.x(Ljava/lang/String;II)Lcf;")
    public final class157 method2222(String arg0, int arg1) {
        return this.method2223(1, arg1, 0, arg0);
    }

    @ObfuscatedName("bc.z(IIILjava/lang/Object;B)Lcf;")
    public final class157 method2223(int arg0, int arg1, int arg2, Object arg3) {
        class157 var5 = new class157();
        var5.field2365 = arg0;
        var5.field2366 = arg1;
        var5.field2368 = arg3;
        synchronized (this) {
            if (this.field1937 == null) {
                this.field1937 = this.field1936 = var5;
            } else {
                this.field1937.field2367 = var5;
                this.field1937 = var5;
            }
            this.notify();
            return var5;
        }
    }

    public class130() {
        Statics.field1935 = "Unknown";
        Statics.field1944 = "1.1";
        try {
            Statics.field1935 = System.getProperty("java.vendor");
            Statics.field1944 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1940 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1939 = false;
        this.field1938 = new Thread(this);
        this.field1938.setPriority(10);
        this.field1938.setDaemon(true);
        this.field1938.start();
    }

    @ObfuscatedName("bc.d(Ljava/lang/Runnable;IB)Lcf;")
    public final class157 method2224(Runnable arg0, int arg1) {
        return this.method2223(2, arg1, 0, arg0);
    }

    @ObfuscatedName("bc.y(I)Laf;")
    public final class186 method2227() {
        return this.field1942;
    }

    public final void run() {
        while (true) {
            class157 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1939) {
                        return;
                    }
                    if (this.field1936 != null) {
                        var2 = this.field1936;
                        this.field1936 = this.field1936.field2367;
                        if (this.field1936 == null) {
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
                int var5 = var2.field2365;
                if (var5 == 1) {
                    var2.field2360 = new Socket(InetAddress.getByName((String) var2.field2368), var2.field2366);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2368);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2366);
                    var2.field2360 = var6;
                } else if (var5 == 4) {
                    var2.field2360 = new DataInputStream(((URL) var2.field2368).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2366 >> 24 & 0xFF) + "." + (var2.field2366 >> 16 & 0xFF) + "." + (var2.field2366 >> 8 & 0xFF) + "." + (var2.field2366 & 0xFF);
                    var2.field2360 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2364 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2364 = 2;
            }
        }
    }

    @ObfuscatedName("bc.m(I)V")
    public final void method2243() {
        synchronized (this) {
            this.field1939 = true;
            this.notifyAll();
        }
        try {
            this.field1938.join();
        } catch (InterruptedException var4) {
        }
    }

    @ObfuscatedName("bc.g(Ljava/net/URL;I)Lcf;")
    public final class157 method2244(URL arg0) {
        return this.method2223(4, 0, 0, arg0);
    }

    @ObfuscatedName("bc.j(II)Lcf;")
    public final class157 method2248(int arg0) {
        return this.method2223(3, arg0, 0, (Object) null);
    }
}
