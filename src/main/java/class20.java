import java.applet.Applet;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Point;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class20 implements Runnable {

    @OriginalMember(owner = "client!bk", name = "k", descriptor = "Lol;")
    private class208 field241 = null;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "Lfh;")
    public class132 field234 = null;

    @OriginalMember(owner = "client!bk", name = "m", descriptor = "Lol;")
    private class208 field243 = null;

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "Ljava/applet/Applet;")
    public Applet field237 = null;

    @OriginalMember(owner = "client!bk", name = "i", descriptor = "Lfh;")
    public class132 field239 = null;

    @OriginalMember(owner = "client!bk", name = "l", descriptor = "Lfh;")
    public class132 field242 = null;

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "Z")
    private boolean field236 = false;

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field235;

    @OriginalMember(owner = "client!bk", name = "q", descriptor = "Ljava/lang/Thread;")
    private Thread field247;

    @OriginalMember(owner = "client!bk", name = "r", descriptor = "I")
    public static int field248 = 3;

    @OriginalMember(owner = "client!bk", name = "u", descriptor = "J")
    public static volatile long field251;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "Lmg;")
    private class265 field232;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "Ljava/lang/String;")
    public static String field231;

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "Ljava/lang/String;")
    private static String field233;

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "Ljava/lang/String;")
    public static String field238;

    @OriginalMember(owner = "client!bk", name = "j", descriptor = "Ljava/lang/String;")
    public static String field240;

    @OriginalMember(owner = "client!bk", name = "n", descriptor = "Ljava/lang/String;")
    public static String field244;

    @OriginalMember(owner = "client!bk", name = "p", descriptor = "Ljava/lang/String;")
    public static String field246;

    @OriginalMember(owner = "client!bk", name = "s", descriptor = "Ljava/lang/String;")
    public static String field249;

    @OriginalMember(owner = "client!bk", name = "t", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field250;

    @OriginalMember(owner = "client!bk", name = "v", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field252;

    @OriginalMember(owner = "client!bk", name = "o", descriptor = "[Lfh;")
    public class132[] field245;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(BILjava/lang/Runnable;)Lol;")
    public final class208 method134(byte arg0, int arg1, Runnable arg2) {
        int var4 = -6 / ((66 - arg0) / 57);
        return this.method135(0, arg1, 2, 0, arg2);
    }

    @OriginalMember(owner = "client!bk", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class208 var2;
            synchronized (this) {
                while (true) {
                    if (this.field236) {
                        return;
                    }
                    if (this.field243 != null) {
                        var2 = this.field243;
                        this.field243 = this.field243.field3248;
                        if (this.field243 == null) {
                            this.field241 = null;
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
                int var3 = var2.field3246;
                if (var3 == 1) {
                    if (field251 > class260.method1785((byte) -109)) {
                        throw new IOException();
                    }
                    var2.field3249 = new Socket(InetAddress.getByName((String) var2.field3244), var2.field3245);
                } else if (var3 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field3244);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field3245);
                    var2.field3249 = var6;
                } else if (var3 == 4) {
                    if (class260.method1785((byte) -104) < field251) {
                        throw new IOException();
                    }
                    var2.field3249 = new DataInputStream(((URL) var2.field3244).openStream());
                } else if (var3 == 8) {
                    Object[] var4 = (Object[]) var2.field3244;
                    var2.field3249 = ((Class) var4[0]).getDeclaredMethod((String) var4[1], (Class[]) var4[2]);
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field3244;
                    var2.field3249 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else {
                    throw new Exception();
                }
                var2.field3247 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field3247 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIILjava/lang/Object;)Lol;")
    private final class208 method135(int arg0, int arg1, int arg2, int arg3, Object arg4) {
        class208 var6 = new class208();
        var6.field3244 = arg4;
        var6.field3245 = arg1;
        var6.field3246 = arg2;
        synchronized (this) {
            if (this.field241 == null) {
                this.field241 = this.field243 = var6;
            } else {
                this.field241.field3248 = var6;
                this.field241 = var6;
            }
            this.notify();
            if (arg3 != 0) {
                field244 = null;
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)V")
    public final void method136(byte arg0) {
        synchronized (this) {
            this.field236 = true;
            this.notifyAll();
        }
        try {
            this.field247.join();
        } catch (InterruptedException var8) {
        }
        if (this.field234 != null) {
            try {
                this.field234.method898((byte) 5);
            } catch (IOException var7) {
            }
        }
        if (this.field242 != null) {
            try {
                this.field242.method898((byte) 5);
            } catch (IOException var6) {
            }
        }
        if (this.field245 != null) {
            for (int var3 = 0; var3 < this.field245.length; var3++) {
                if (this.field245[var3] != null) {
                    try {
                        this.field245[var3].method898((byte) 5);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (arg0 <= -59 && this.field239 != null) {
            try {
                this.field239.method898((byte) 5);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ljava/awt/Component;Ljava/awt/Point;BII[I)Lol;")
    public final class208 method137(Component arg0, Point arg1, byte arg2, int arg3, int arg4, int[] arg5) {
        int var7 = 60 / ((arg2 - 34) / 60);
        return this.method135(arg4, arg3, 17, 0, new Object[] { arg0, arg5, arg1 });
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIILjava/awt/Component;)Lol;")
    public final class208 method138(int arg0, int arg1, int arg2, Component arg3) {
        if (arg0 != 23613) {
            this.method143((byte) -7, (String) null, (Class) null);
        }
        Point var5 = arg3.getLocationOnScreen();
        return this.method135(var5.y + arg2, arg1 - -var5.x, 14, 0, (Object) null);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V")
    public final void method139(int arg0) {
        field251 = class260.method1785((byte) -109) + 5000L;
        if (arg0 != 7931) {
            field251 = -24L;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILjava/lang/String;I)Lol;")
    public final class208 method140(int arg0, String arg1, int arg2) {
        return arg0 == -6412 ? this.method135(0, arg2, 1, arg0 ^ 0xFFFFE6F4, arg1) : null;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I[Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Lol;")
    public final class208 method141(int arg0, Class[] arg1, String arg2, Class arg3) {
        if (arg0 >= -8) {
            this.method140(-89, (String) null, 57);
        }
        return this.method135(0, 0, 8, 0, new Object[] { arg3, arg2, arg1 });
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILjava/lang/String;)Lol;")
    public final class208 method142(int arg0, String arg1) {
        return arg0 == 0 ? this.method135(0, 0, 16, 0, arg1) : null;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Class;)Lol;")
    public final class208 method143(byte arg0, String arg1, Class arg2) {
        if (arg0 >= -60) {
            this.run();
        }
        return this.method135(0, 0, 9, 0, new Object[] { arg2, arg1 });
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ZI)Lol;")
    public final class208 method144(boolean arg0, int arg1) {
        if (!arg0) {
            this.field235 = null;
        }
        return this.method135(0, arg1, 3, 0, (Object) null);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ljava/lang/String;I)Lol;")
    public final class208 method145(String arg0, int arg1) {
        if (arg1 != 10) {
            this.field232 = null;
        }
        return this.method135(0, 0, 12, arg1 ^ 0xA, arg0);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ljava/awt/Component;IZ)Lol;")
    public final class208 method146(Component arg0, int arg1, boolean arg2) {
        return arg1 == -18355 ? this.method135(0, arg2 ? 1 : 0, 15, 0, arg0) : null;
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(I)Lmg;")
    public final class265 method147(int arg0) {
        if (arg0 >= -34) {
            this.method141(-83, (Class[]) null, (String) null, (Class) null);
        }
        return this.field232;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ljava/net/URL;I)Lol;")
    public final class208 method148(URL arg0, int arg1) {
        if (arg1 <= 17) {
            this.method141(-86, (Class[]) null, (String) null, (Class) null);
        }
        return this.method135(0, 0, 4, 0, arg0);
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
    public class20(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        this.field237 = arg0;
        field249 = "1.1";
        field240 = "Unknown";
        try {
            field240 = System.getProperty("java.vendor");
            field249 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field231 = System.getProperty("os.name");
        } catch (Exception var11) {
            field231 = "Unknown";
        }
        field244 = field231.toLowerCase();
        try {
            field238 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field238 = "";
        }
        try {
            field246 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field246 = "";
        }
        try {
            field233 = System.getProperty("user.home");
            if (field233 != null) {
                field233 = field233 + "/";
            }
        } catch (Exception var8) {
        }
        if (field233 == null) {
            field233 = "~/";
        }
        try {
            this.field235 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field250 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field250 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field252 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field252 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field236 = false;
        this.field247 = new Thread(this);
        this.field247.setPriority(10);
        this.field247.setDaemon(true);
        this.field247.start();
    }

    static {
        new Hashtable(16);
        field251 = 0L;
    }
}
