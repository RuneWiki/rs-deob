import java.applet.Applet;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Frame;
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

@OriginalClass("client!ib")
public class class28 implements Runnable {

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "Lvb;")
    private class166 field473 = null;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "Ljava/applet/Applet;")
    public Applet field469 = null;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "Lve;")
    public class197 field467 = null;

    @OriginalMember(owner = "client!ib", name = "p", descriptor = "Z")
    private boolean field482 = false;

    @OriginalMember(owner = "client!ib", name = "o", descriptor = "Lvb;")
    private class166 field481 = null;

    @OriginalMember(owner = "client!ib", name = "q", descriptor = "Lve;")
    public class197 field483 = null;

    @OriginalMember(owner = "client!ib", name = "r", descriptor = "Lve;")
    public class197 field484 = null;

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field475;

    @OriginalMember(owner = "client!ib", name = "s", descriptor = "Ljava/lang/Thread;")
    private Thread field485;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "I")
    public static int field470 = 3;

    @OriginalMember(owner = "client!ib", name = "t", descriptor = "J")
    public static volatile long field486;

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "Lhm;")
    private class44 field478;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "Ljava/lang/String;")
    public static String field468;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "Ljava/lang/String;")
    public static String field471;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "Ljava/lang/String;")
    public static String field472;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "Ljava/lang/String;")
    public static String field474;

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "Ljava/lang/String;")
    public static String field476;

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "Ljava/lang/String;")
    private static String field477;

    @OriginalMember(owner = "client!ib", name = "m", descriptor = "Ljava/lang/String;")
    public static String field479;

    @OriginalMember(owner = "client!ib", name = "u", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field487;

    @OriginalMember(owner = "client!ib", name = "v", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field488;

    @OriginalMember(owner = "client!ib", name = "n", descriptor = "[Lve;")
    public class197[] field480;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IILjava/awt/Component;Z)Lvb;", line = 10)
    public final class166 method222(int arg0, int arg1, Component arg2, boolean arg3) {
        Point var5 = arg2.getLocationOnScreen();
        if (arg3) {
            field468 = (String) null;
        }
        return this.method232(var5.x + arg1, true, 14, arg0 + var5.y, (Object) null);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Z)V", line = 24)
    public final void method223(boolean arg0) {
        synchronized (this) {
            this.field482 = arg0;
            this.notifyAll();
        }
        try {
            this.field485.join();
        } catch (InterruptedException var14) {
        }
        if (this.field467 != null) {
            try {
                this.field467.method1476((byte) 124);
            } catch (IOException var13) {
            }
        }
        if (this.field484 != null) {
            try {
                this.field484.method1476((byte) 124);
            } catch (IOException var12) {
            }
        }
        if (this.field480 != null) {
            for (int var7 = 0; var7 < this.field480.length; var7++) {
                if (this.field480[var7] != null) {
                    try {
                        this.field480[var7].method1476((byte) 124);
                    } catch (IOException var11) {
                    }
                }
            }
        }
        if (this.field483 != null) {
            try {
                this.field483.method1476((byte) 124);
            } catch (IOException var10) {
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)Lvb;", line = 82)
    public final class166 method224(int arg0, int arg1) {
        if (arg1 != 0) {
            field488 = (Method) null;
        }
        return this.method232(arg0, true, 3, 0, (Object) null);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILjava/awt/Frame;)Lvb;", line = 94)
    public final class166 method225(int arg0, Frame arg1) {
        if (arg0 >= -40) {
            field471 = (String) null;
        }
        return this.method232(0, true, 7, 0, arg1);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;B)Lvb;", line = 112)
    public final class166 method226(String arg0, Class arg1, byte arg2) {
        return arg2 > -75 ? (class166) null : this.method232(0, true, 9, 0, new Object[] { arg1, arg0 });
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "([Ljava/lang/Class;ILjava/lang/String;Ljava/lang/Class;)Lvb;", line = 122)
    public final class166 method227(Class[] arg0, int arg1, String arg2, Class arg3) {
        return arg1 > -66 ? (class166) null : this.method232(0, true, 8, 0, new Object[] { arg3, arg2, arg0 });
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)Lvb;", line = 132)
    public final class166 method228(int arg0) {
        if (arg0 > -82) {
            this.field483 = (class197) null;
        }
        return this.method232(0, true, 5, 0, (Object) null);
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V", line = 421)
    public class28(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        this.field469 = arg0;
        field468 = "Unknown";
        field474 = "1.1";
        try {
            field468 = System.getProperty("java.vendor");
            field474 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        try {
            field479 = System.getProperty("os.name");
        } catch (Exception var19) {
            field479 = "Unknown";
        }
        field472 = field479.toLowerCase();
        try {
            field471 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field471 = "";
        }
        try {
            field476 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
            field476 = "";
        }
        try {
            field477 = System.getProperty("user.home");
            if (field477 != null) {
                field477 = field477 + "/";
            }
        } catch (Exception var16) {
        }
        if (field477 == null) {
            field477 = "~/";
        }
        try {
            this.field475 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        try {
            if (arg0 == null) {
                field487 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field487 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var14) {
        }
        try {
            if (arg0 == null) {
                field488 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field488 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var13) {
        }
        this.field482 = false;
        this.field485 = new Thread(this);
        this.field485.setPriority(10);
        this.field485.setDaemon(true);
        this.field485.start();
    }

    @OriginalMember(owner = "client!ib", name = "run", descriptor = "()V", line = 151)
    public final void run() {
        while (true) {
            class166 var2;
            synchronized (this) {
                while (true) {
                    if (this.field482) {
                        return;
                    }
                    if (this.field481 != null) {
                        var2 = this.field481;
                        this.field481 = this.field481.field2932;
                        if (this.field481 == null) {
                            this.field473 = null;
                        }
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var13) {
                    }
                }
            }
            try {
                int var5 = var2.field2931;
                if (var5 == 1) {
                    if (class300.method2048((byte) 18) < field486) {
                        throw new IOException();
                    }
                    var2.field2933 = new Socket(InetAddress.getByName((String) var2.field2930), var2.field2935);
                } else if (var5 == 2) {
                    Thread var8 = new Thread((Runnable) var2.field2930);
                    var8.setDaemon(true);
                    var8.start();
                    var8.setPriority(var2.field2935);
                    var2.field2933 = var8;
                } else if (var5 == 4) {
                    if (class300.method2048((byte) 18) < field486) {
                        throw new IOException();
                    }
                    var2.field2933 = new DataInputStream(((URL) var2.field2930).openStream());
                } else if (var5 == 8) {
                    Object[] var6 = (Object[]) ((Object[]) var2.field2930);
                    var2.field2933 = ((Class) var6[0]).getDeclaredMethod((String) var6[1], (Class[]) ((Class[]) var6[2]));
                } else if (var5 == 9) {
                    Object[] var7 = (Object[]) ((Object[]) var2.field2930);
                    var2.field2933 = ((Class) var7[0]).getDeclaredField((String) var7[1]);
                } else {
                    throw new Exception();
                }
                var2.field2934 = 1;
            } catch (ThreadDeath var11) {
                throw var11;
            } catch (Throwable var12) {
                var2.field2934 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Ljava/lang/String;I)Lvb;", line = 251)
    public final class166 method229(String arg0, int arg1) {
        if (arg1 >= -114) {
            this.method229((String) null, 121);
        }
        return this.method232(0, true, 12, 0, arg0);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZLjava/awt/Component;Z)Lvb;", line = 269)
    public final class166 method230(boolean arg0, Component arg1, boolean arg2) {
        return arg0 ? this.method232(arg2 ? 1 : 0, arg0, 15, 0, arg1) : (class166) null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIB)Lvb;", line = 280)
    public final class166 method231(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        return arg4 >= -107 ? (class166) null : this.method232((arg1 << 16) + arg2, true, 6, (arg0 << 16) + arg3, (Object) null);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IZIILjava/lang/Object;)Lvb;", line = 292)
    private final class166 method232(int arg0, boolean arg1, int arg2, int arg3, Object arg4) {
        class166 var6 = new class166();
        if (!arg1) {
            this.method229((String) null, -116);
        }
        var6.field2930 = arg4;
        var6.field2935 = arg0;
        var6.field2931 = arg2;
        synchronized (this) {
            if (this.field473 == null) {
                this.field473 = this.field481 = var6;
            } else {
                this.field473.field2932 = var6;
                this.field473 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V", line = 332)
    public final void method233(int arg0) {
        field486 = class300.method2048((byte) 18) + 5000L;
        if (arg0 != -26794) {
            this.method229((String) null, -5);
        }
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(Z)Lhm;", line = 352)
    public final class44 method234(boolean arg0) {
        if (arg0) {
            field472 = (String) null;
        }
        return this.field478;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(BLjava/lang/String;)Lvb;", line = 364)
    public final class166 method235(byte arg0, String arg1) {
        int var3 = 62 % ((arg0) / 46);
        return this.method232(0, true, 16, 0, arg1);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Ljava/net/URL;I)Lvb;", line = 372)
    public final class166 method236(URL arg0, int arg1) {
        if (arg1 != 0) {
            field479 = (String) null;
        }
        return this.method232(0, true, 4, 0, arg0);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IILjava/lang/String;)Lvb;", line = 382)
    public final class166 method237(int arg0, int arg1, String arg2) {
        if (arg1 != -6303) {
            this.method241((byte) 127, (Runnable) null, 110);
        }
        return this.method232(arg0, true, 1, 0, arg2);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILjava/lang/Class;)Lvb;", line = 400)
    public final class166 method238(int arg0, Class arg1) {
        int var3 = -56 / ((56 - arg0) / 55);
        return this.method232(0, true, 10, 0, arg1);
    }

    static {
        new Hashtable(16);
        field486 = 0L;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(BLjava/lang/Class;)Lvb;", line = 412)
    public final class166 method239(byte arg0, Class arg1) {
        if (arg0 != 20) {
            this.field481 = (class166) null;
        }
        return this.method232(0, true, 11, 0, arg1);
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(I)Z", line = 507)
    public final boolean method240(int arg0) {
        if (arg0 != 0) {
            this.method223(true);
        }
        return false;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(BLjava/lang/Runnable;I)Lvb;", line = 522)
    public final class166 method241(byte arg0, Runnable arg1, int arg2) {
        int var4 = 3 / ((-arg0 - 42) / 52);
        return this.method232(arg2, true, 2, 0, arg1);
    }
}
