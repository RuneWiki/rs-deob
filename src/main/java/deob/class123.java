package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("di")
public class class123 implements Runnable {

    @ObfuscatedName("di.x")
    public class47 field1940;

    @ObfuscatedName("di.j")
    public class133 field1943 = null;

    @ObfuscatedName("di.o")
    public class133 field1942 = null;

    @ObfuscatedName("di.n")
    public Thread field1944;

    @ObfuscatedName("di.y")
    public boolean field1939 = false;

    @ObfuscatedName("di.f")
    public EventQueue field1941;

    public class123() {
        Statics.field1945 = "Unknown";
        Statics.field1823 = "1.1";
        try {
            Statics.field1945 = System.getProperty("java.vendor");
            Statics.field1823 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1941 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1939 = false;
        this.field1944 = new Thread(this);
        this.field1944.setPriority(10);
        this.field1944.setDaemon(true);
        this.field1944.start();
    }

    @ObfuscatedName("di.u(B)V")
    public final void method2483() {
        synchronized (this) {
            this.field1939 = true;
            this.notifyAll();
        }
        try {
            this.field1944.join();
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
                    if (this.field1943 != null) {
                        var2 = this.field1943;
                        this.field1943 = this.field1943.field2066;
                        if (this.field1943 == null) {
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
                    var2.field2069 = new Socket(InetAddress.getByName((String) var2.field2073), var2.field2072);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2073);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2072);
                    var2.field2069 = var6;
                } else if (var5 == 4) {
                    var2.field2069 = new DataInputStream(((URL) var2.field2073).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2072 >> 24 & 0xFF) + "." + (var2.field2072 >> 16 & 0xFF) + "." + (var2.field2072 >> 8 & 0xFF) + "." + (var2.field2072 & 0xFF);
                    var2.field2069 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2070 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2070 = 2;
            }
        }
    }

    @ObfuscatedName("di.x(IIILjava/lang/Object;I)Lej;")
    public final class133 method2489(int arg0, int arg1, int arg2, Object arg3) {
        class133 var5 = new class133();
        var5.field2074 = arg0;
        var5.field2072 = arg1;
        var5.field2073 = arg3;
        synchronized (this) {
            if (this.field1942 == null) {
                this.field1942 = this.field1943 = var5;
            } else {
                this.field1942.field2066 = var5;
                this.field1942 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("di.j(Ljava/lang/String;II)Lej;")
    public final class133 method2486(String arg0, int arg1) {
        return this.method2489(1, arg1, 0, arg0);
    }

    @ObfuscatedName("di.o(Ljava/lang/Runnable;IB)Lej;")
    public final class133 method2487(Runnable arg0, int arg1) {
        return this.method2489(2, arg1, 0, arg0);
    }

    @ObfuscatedName("di.n(IB)Lej;")
    public final class133 method2494(int arg0) {
        return this.method2489(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("di.y(Ljava/net/URL;I)Lej;")
    public final class133 method2488(URL arg0) {
        return this.method2489(4, 0, 0, arg0);
    }

    @ObfuscatedName("di.f(I)Lam;")
    public final class47 method2490() {
        return this.field1940;
    }
}
