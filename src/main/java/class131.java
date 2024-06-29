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

@OriginalClass("client!vb")
public class class131 implements Runnable {

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "Z")
    private boolean field2286 = false;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "Ljf;")
    public class8 field2281 = null;

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "Ljava/applet/Applet;")
    public Applet field2294 = null;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "Llk;")
    private class174 field2283 = null;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "Llk;")
    private class174 field2282 = null;

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "Ljf;")
    public class8 field2289 = null;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "Ljf;")
    public class8 field2287 = null;

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field2295;

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "Ljava/lang/Thread;")
    private Thread field2293;

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "I")
    public static int field2288 = 3;

    @OriginalMember(owner = "client!vb", name = "u", descriptor = "J")
    public static volatile long field2300;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "Lti;")
    private class138 field2284;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "Ljava/lang/String;")
    public static String field2280;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "Ljava/lang/String;")
    public static String field2285;

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "Ljava/lang/String;")
    public static String field2290;

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "Ljava/lang/String;")
    public static String field2291;

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "Ljava/lang/String;")
    public static String field2292;

    @OriginalMember(owner = "client!vb", name = "r", descriptor = "Ljava/lang/String;")
    public static String field2297;

    @OriginalMember(owner = "client!vb", name = "s", descriptor = "Ljava/lang/String;")
    private static String field2298;

    @OriginalMember(owner = "client!vb", name = "t", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2299;

    @OriginalMember(owner = "client!vb", name = "v", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2301;

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "[Ljf;")
    public class8[] field2296;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V")
    public final void method904(byte arg0) {
        if (arg0 < 12) {
            this.field2296 = null;
        }
        field2300 = class232.method1544((byte) -86) + 5000L;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZLjava/lang/String;)Llk;")
    public final class174 method905(boolean arg0, String arg1) {
        if (arg0) {
            this.method909((Point) null, -41, (Component) null, 86, -108, (int[]) null);
        }
        return this.method906((byte) -19, arg1, 0, 0, 12);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(BLjava/lang/Object;III)Llk;")
    private final class174 method906(byte arg0, Object arg1, int arg2, int arg3, int arg4) {
        class174 var6 = new class174();
        if (arg0 >= -9) {
            this.field2296 = null;
        }
        var6.field2861 = arg4;
        var6.field2860 = arg2;
        var6.field2858 = arg1;
        synchronized (this) {
            if (this.field2282 == null) {
                this.field2282 = this.field2283 = var6;
            } else {
                this.field2282.field2862 = var6;
                this.field2282 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZILjava/awt/Component;)Llk;")
    public final class174 method907(boolean arg0, int arg1, Component arg2) {
        if (arg1 < 115) {
            this.method911((String) null, -60, (Class) null);
        }
        return this.method906((byte) -121, arg2, arg0 ? 1 : 0, 0, 15);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)Llk;")
    public final class174 method908(int arg0, int arg1) {
        return arg0 == -21199 ? this.method906((byte) -34, (Object) null, arg1, 0, 3) : null;
    }

    @OriginalMember(owner = "client!vb", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class174 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2286) {
                        return;
                    }
                    if (this.field2283 != null) {
                        var2 = this.field2283;
                        this.field2283 = this.field2283.field2862;
                        if (this.field2283 == null) {
                            this.field2282 = null;
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
                int var3 = var2.field2861;
                if (var3 == 1) {
                    if (class232.method1544((byte) -125) < field2300) {
                        throw new IOException();
                    }
                    var2.field2859 = new Socket(InetAddress.getByName((String) var2.field2858), var2.field2860);
                } else if (var3 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2858);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2860);
                    var2.field2859 = var6;
                } else if (var3 == 4) {
                    if (class232.method1544((byte) -93) < field2300) {
                        throw new IOException();
                    }
                    var2.field2859 = new DataInputStream(((URL) var2.field2858).openStream());
                } else if (var3 == 8) {
                    Object[] var4 = (Object[]) var2.field2858;
                    var2.field2859 = ((Class) var4[0]).getDeclaredMethod((String) var4[1], (Class[]) var4[2]);
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field2858;
                    var2.field2859 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else {
                    throw new Exception();
                }
                var2.field2857 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2857 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Ljava/awt/Point;ILjava/awt/Component;II[I)Llk;")
    public final class174 method909(Point arg0, int arg1, Component arg2, int arg3, int arg4, int[] arg5) {
        if (arg4 != 0) {
            this.run();
        }
        return this.method906((byte) -116, new Object[] { arg2, arg5, arg0 }, arg1, arg3, 17);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(BLjava/lang/String;I)Llk;")
    public final class174 method910(byte arg0, String arg1, int arg2) {
        if (arg0 < 95) {
            this.field2283 = null;
        }
        return this.method906((byte) -126, arg1, arg2, 0, 1);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Class;)Llk;")
    public final class174 method911(String arg0, int arg1, Class arg2) {
        return arg1 == -5737 ? this.method906((byte) -122, new Object[] { arg2, arg0 }, 0, 0, 9) : null;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Ljava/awt/Component;III)Llk;")
    public final class174 method912(Component arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 10119) {
            Point var5 = arg0.getLocationOnScreen();
            return this.method906((byte) -103, (Object) null, var5.x + arg1, var5.y + arg3, 14);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZLjava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Llk;")
    public final class174 method913(boolean arg0, Class arg1, String arg2, Class[] arg3) {
        if (!arg0) {
            this.method908(45, 78);
        }
        return this.method906((byte) -84, new Object[] { arg1, arg2, arg3 }, 0, 0, 8);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Ljava/lang/String;I)Llk;")
    public final class174 method914(String arg0, int arg1) {
        return arg1 == 0 ? this.method906((byte) -67, arg0, 0, 0, 16) : null;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)Lti;")
    public final class138 method915(int arg0) {
        if (arg0 >= -63) {
            this.field2293 = null;
        }
        return this.field2284;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILjava/net/URL;)Llk;")
    public final class174 method916(int arg0, URL arg1) {
        if (arg0 != 4) {
            this.method908(-13, 91);
        }
        return this.method906((byte) -41, arg1, 0, 0, 4);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IBLjava/lang/Runnable;)Llk;")
    public final class174 method917(int arg0, byte arg1, Runnable arg2) {
        if (arg1 < 119) {
            this.method905(false, (String) null);
        }
        return this.method906((byte) -37, arg2, arg0, 0, 2);
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)V")
    public final void method918(int arg0) {
        synchronized (this) {
            this.field2286 = true;
            this.notifyAll();
        }
        try {
            this.field2293.join();
        } catch (InterruptedException var8) {
        }
        if (this.field2281 != null) {
            try {
                this.field2281.method51(-118);
            } catch (IOException var7) {
            }
        }
        if (arg0 != 14931) {
            this.method913(false, (Class) null, (String) null, (Class[]) null);
        }
        if (this.field2287 != null) {
            try {
                this.field2287.method51(-108);
            } catch (IOException var6) {
            }
        }
        if (this.field2296 != null) {
            for (int var3 = 0; var3 < this.field2296.length; var3++) {
                if (this.field2296[var3] != null) {
                    try {
                        this.field2296[var3].method51(arg0 ^ 0xFFFFC5D2);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field2289 != null) {
            try {
                this.field2289.method51(-120);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
    public class131(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        this.field2294 = arg0;
        field2292 = "Unknown";
        field2285 = "1.1";
        try {
            field2292 = System.getProperty("java.vendor");
            field2285 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field2280 = System.getProperty("os.name");
        } catch (Exception var11) {
            field2280 = "Unknown";
        }
        field2291 = field2280.toLowerCase();
        try {
            field2290 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field2290 = "";
        }
        try {
            field2297 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field2297 = "";
        }
        try {
            field2298 = System.getProperty("user.home");
            if (field2298 != null) {
                field2298 = field2298 + "/";
            }
        } catch (Exception var8) {
        }
        if (field2298 == null) {
            field2298 = "~/";
        }
        try {
            this.field2295 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field2301 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field2301 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field2299 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field2299 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field2286 = false;
        this.field2293 = new Thread(this);
        this.field2293.setPriority(10);
        this.field2293.setDaemon(true);
        this.field2293.start();
    }

    static {
        new Hashtable(16);
        field2300 = 0L;
    }
}
