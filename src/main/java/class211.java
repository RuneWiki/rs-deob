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

@OriginalClass("client!ag")
public class class211 implements Runnable {

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "Z")
    private boolean field3391 = false;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "Ldm;")
    private class182 field3389 = null;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "Ldm;")
    private class182 field3387 = null;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "Lhg;")
    public class220 field3388 = null;

    @OriginalMember(owner = "client!ag", name = "n", descriptor = "Lhg;")
    public class220 field3396 = null;

    @OriginalMember(owner = "client!ag", name = "s", descriptor = "Lhg;")
    public class220 field3401 = null;

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "Ljava/applet/Applet;")
    public Applet field3390 = null;

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field3393;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "Ljava/lang/Thread;")
    private Thread field3385;

    @OriginalMember(owner = "client!ag", name = "o", descriptor = "I")
    public static int field3397 = 3;

    @OriginalMember(owner = "client!ag", name = "v", descriptor = "J")
    public static volatile long field3404;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "Lhb;")
    private class155 field3383;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "Ljava/lang/String;")
    public static String field3384;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "Ljava/lang/String;")
    public static String field3386;

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "Ljava/lang/String;")
    private static String field3392;

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "Ljava/lang/String;")
    public static String field3394;

    @OriginalMember(owner = "client!ag", name = "m", descriptor = "Ljava/lang/String;")
    public static String field3395;

    @OriginalMember(owner = "client!ag", name = "q", descriptor = "Ljava/lang/String;")
    public static String field3399;

    @OriginalMember(owner = "client!ag", name = "r", descriptor = "Ljava/lang/String;")
    public static String field3400;

    @OriginalMember(owner = "client!ag", name = "t", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field3402;

    @OriginalMember(owner = "client!ag", name = "u", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field3403;

    @OriginalMember(owner = "client!ag", name = "p", descriptor = "[Lhg;")
    public class220[] field3398;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILjava/net/URL;)Ldm;", line = 5)
    public final class182 method1473(int arg0, URL arg1) {
        if (arg0 != 8779) {
            this.method1475(121);
        }
        return this.method1486(21759, 0, 0, 4, arg1);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Ljava/lang/Class;[Ljava/lang/Class;Ljava/lang/String;B)Ldm;", line = 17)
    public final class182 method1474(Class arg0, Class[] arg1, String arg2, byte arg3) {
        if (arg3 != -51) {
            this.method1481(116);
        }
        return this.method1486(21759, 0, 0, 8, new Object[] { arg0, arg2, arg1 });
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)Ldm;", line = 27)
    public final class182 method1475(int arg0) {
        if (arg0 != 7908) {
            this.field3393 = (EventQueue) null;
        }
        return this.method1486(21759, 0, 0, 5, (Object) null);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIBII)Ldm;", line = 43)
    public final class182 method1476(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        int var6 = 72 % ((arg2 + 1) / 43);
        return this.method1486(21759, (arg1 << 16) + arg0, (arg4 << 16) - -arg3, 6, (Object) null);
    }

    @OriginalMember(owner = "client!ag", name = "run", descriptor = "()V", line = 56)
    public final void run() {
        while (true) {
            class182 var2;
            synchronized (this) {
                while (true) {
                    if (this.field3391) {
                        return;
                    }
                    if (this.field3387 != null) {
                        var2 = this.field3387;
                        this.field3387 = this.field3387.field2947;
                        if (this.field3387 == null) {
                            this.field3389 = null;
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
                int var5 = var2.field2943;
                if (var5 == 1) {
                    if (class247.method1762(19166) < field3404) {
                        throw new IOException();
                    }
                    var2.field2945 = new Socket(InetAddress.getByName((String) var2.field2944), var2.field2946);
                } else if (var5 == 2) {
                    Thread var8 = new Thread((Runnable) var2.field2944);
                    var8.setDaemon(true);
                    var8.start();
                    var8.setPriority(var2.field2946);
                    var2.field2945 = var8;
                } else if (var5 == 4) {
                    if (class247.method1762(19166) < field3404) {
                        throw new IOException();
                    }
                    var2.field2945 = new DataInputStream(((URL) var2.field2944).openStream());
                } else if (var5 == 8) {
                    Object[] var6 = (Object[]) ((Object[]) var2.field2944);
                    var2.field2945 = ((Class) var6[0]).getDeclaredMethod((String) var6[1], (Class[]) ((Class[]) var6[2]));
                } else if (var5 == 9) {
                    Object[] var7 = (Object[]) ((Object[]) var2.field2944);
                    var2.field2945 = ((Class) var7[0]).getDeclaredField((String) var7[1]);
                } else {
                    throw new Exception();
                }
                var2.field2948 = 1;
            } catch (ThreadDeath var11) {
                throw var11;
            } catch (Throwable var12) {
                var2.field2948 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(BLjava/lang/String;)Ldm;", line = 154)
    public final class182 method1477(byte arg0, String arg1) {
        if (arg0 <= 48) {
            this.method1476(120, 22, (byte) 35, -23, -16);
        }
        return this.method1486(21759, 0, 0, 16, arg1);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZI)Ldm;", line = 167)
    public final class182 method1478(boolean arg0, int arg1) {
        if (arg0) {
            this.field3388 = (class220) null;
        }
        return this.method1486(21759, 0, arg1, 3, (Object) null);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Ljava/lang/Runnable;II)Ldm;", line = 178)
    public final class182 method1479(Runnable arg0, int arg1, int arg2) {
        if (arg1 < 50) {
            this.method1485((String) null, (Class) null, -40);
        }
        return this.method1486(21759, 0, arg2, 2, arg0);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILjava/lang/Class;)Ldm;", line = 192)
    public final class182 method1480(int arg0, Class arg1) {
        if (arg0 != 0) {
            this.method1477((byte) -56, (String) null);
        }
        return this.method1486(21759, 0, 0, 11, arg1);
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V", line = 447)
    public class211(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field3399 = "Unknown";
        this.field3390 = arg0;
        field3394 = "1.1";
        try {
            field3399 = System.getProperty("java.vendor");
            field3394 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        try {
            field3395 = System.getProperty("os.name");
        } catch (Exception var19) {
            field3395 = "Unknown";
        }
        field3400 = field3395.toLowerCase();
        try {
            field3384 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field3384 = "";
        }
        try {
            field3386 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
            field3386 = "";
        }
        try {
            field3392 = System.getProperty("user.home");
            if (field3392 != null) {
                field3392 = field3392 + "/";
            }
        } catch (Exception var16) {
        }
        if (field3392 == null) {
            field3392 = "~/";
        }
        try {
            this.field3393 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        try {
            if (arg0 == null) {
                field3403 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field3403 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var14) {
        }
        try {
            if (arg0 == null) {
                field3402 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field3402 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var13) {
        }
        this.field3391 = false;
        this.field3385 = new Thread(this);
        this.field3385.setPriority(10);
        this.field3385.setDaemon(true);
        this.field3385.start();
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(I)V", line = 220)
    public final void method1481(int arg0) {
        synchronized (this) {
            this.field3391 = true;
            this.notifyAll();
        }
        if (arg0 <= 74) {
            this.method1473(-112, (URL) null);
        }
        try {
            this.field3385.join();
        } catch (InterruptedException var14) {
        }
        if (this.field3401 != null) {
            try {
                this.field3401.method1580(-3810);
            } catch (IOException var13) {
            }
        }
        if (this.field3396 != null) {
            try {
                this.field3396.method1580(-3810);
            } catch (IOException var12) {
            }
        }
        if (this.field3398 != null) {
            for (int var7 = 0; var7 < this.field3398.length; var7++) {
                if (this.field3398[var7] != null) {
                    try {
                        this.field3398[var7].method1580(-3810);
                    } catch (IOException var11) {
                    }
                }
            }
        }
        if (this.field3388 != null) {
            try {
                this.field3388.method1580(-3810);
            } catch (IOException var10) {
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILjava/awt/Frame;)Ldm;", line = 282)
    public final class182 method1482(int arg0, Frame arg1) {
        if (arg0 != 0) {
            this.field3401 = (class220) null;
        }
        return this.method1486(21759, 0, 0, 7, arg1);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILjava/lang/String;I)Ldm;", line = 293)
    public final class182 method1483(int arg0, String arg1, int arg2) {
        return arg0 == -14479 ? this.method1486(arg0 ^ 0xFFFF938E, 0, arg2, 1, arg1) : (class182) null;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Ljava/awt/Component;BZ)Ldm;", line = 304)
    public final class182 method1484(Component arg0, byte arg1, boolean arg2) {
        if (arg1 > -71) {
            this.method1478(true, 42);
        }
        return this.method1486(21759, 0, arg2 ? 1 : 0, 15, arg0);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I)Ldm;", line = 317)
    public final class182 method1485(String arg0, Class arg1, int arg2) {
        if (arg2 != 988) {
            this.field3401 = (class220) null;
        }
        return this.method1486(arg2 + 20771, 0, 0, 9, new Object[] { arg1, arg0 });
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIILjava/lang/Object;)Ldm;", line = 330)
    private final class182 method1486(int arg0, int arg1, int arg2, int arg3, Object arg4) {
        if (arg0 != 21759) {
            return (class182) null;
        }
        class182 var6 = new class182();
        var6.field2946 = arg2;
        var6.field2943 = arg3;
        var6.field2944 = arg4;
        synchronized (this) {
            if (this.field3389 == null) {
                this.field3389 = this.field3387 = var6;
            } else {
                this.field3389.field2947 = var6;
                this.field3389 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IILjava/awt/Component;I)Ldm;", line = 358)
    public final class182 method1487(int arg0, int arg1, Component arg2, int arg3) {
        if (arg3 <= 85) {
            this.method1484((Component) null, (byte) -96, true);
        }
        Point var5 = arg2.getLocationOnScreen();
        return this.method1486(21759, var5.y + arg0, var5.x + arg1, 14, (Object) null);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(BLjava/lang/Class;)Ldm;", line = 369)
    public final class182 method1488(byte arg0, Class arg1) {
        if (arg0 <= 66) {
            this.method1484((Component) null, (byte) -63, false);
        }
        return this.method1486(21759, 0, 0, 10, arg1);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Z)V", line = 383)
    public final void method1489(boolean arg0) {
        if (!arg0) {
            this.method1486(-92, -71, -33, 118, (Object) null);
        }
        field3404 = class247.method1762(19166) + 5000L;
    }

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "(I)Lhb;", line = 395)
    public final class155 method1490(int arg0) {
        return arg0 == -2298 ? this.field3383 : (class155) null;
    }

    static {
        new Hashtable(16);
        field3404 = 0L;
    }

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "(I)Z", line = 408)
    public final boolean method1491(int arg0) {
        return arg0 <= 25;
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(BLjava/lang/String;)Ldm;", line = 435)
    public final class182 method1492(byte arg0, String arg1) {
        return arg0 <= 44 ? (class182) null : this.method1486(21759, 0, 0, 12, arg1);
    }
}
