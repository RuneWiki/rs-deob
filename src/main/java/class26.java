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

@OriginalClass("client!gf")
public class class26 implements Runnable {

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "Lec;")
    private class40 field498 = null;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "Lde;")
    public class161 field501 = null;

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "Lde;")
    public class161 field504 = null;

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "Ljava/applet/Applet;")
    public Applet field505 = null;

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "Lde;")
    public class161 field507 = null;

    @OriginalMember(owner = "client!gf", name = "r", descriptor = "Lec;")
    private class40 field515 = null;

    @OriginalMember(owner = "client!gf", name = "s", descriptor = "Z")
    private boolean field516 = false;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field506;

    @OriginalMember(owner = "client!gf", name = "m", descriptor = "Ljava/lang/Thread;")
    private Thread field510;

    @OriginalMember(owner = "client!gf", name = "q", descriptor = "I")
    public static int field514 = 3;

    @OriginalMember(owner = "client!gf", name = "u", descriptor = "J")
    public static volatile long field518;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "Lhg;")
    private class203 field503;

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "Ljava/lang/String;")
    public static String field499;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "Ljava/lang/String;")
    public static String field500;

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "Ljava/lang/String;")
    private static String field502;

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "Ljava/lang/String;")
    public static String field509;

    @OriginalMember(owner = "client!gf", name = "n", descriptor = "Ljava/lang/String;")
    public static String field511;

    @OriginalMember(owner = "client!gf", name = "o", descriptor = "Ljava/lang/String;")
    public static String field512;

    @OriginalMember(owner = "client!gf", name = "p", descriptor = "Ljava/lang/String;")
    public static String field513;

    @OriginalMember(owner = "client!gf", name = "t", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field517;

    @OriginalMember(owner = "client!gf", name = "v", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field519;

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "[Lde;")
    public class161[] field508;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZLjava/awt/Component;B)Lec;")
    public final class40 method177(boolean arg0, Component arg1, byte arg2) {
        if (arg2 > -30) {
            this.method179(43);
        }
        return this.method184(0, arg0 ? 1 : 0, -1, 15, arg1);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V")
    public final void method178(int arg0) {
        field518 = class257.method1736(14361) + 5000L;
        if (arg0 < 55) {
            this.method190(50, -9);
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V")
    public final void method179(int arg0) {
        synchronized (this) {
            this.field516 = true;
            this.notifyAll();
        }
        try {
            this.field510.join();
        } catch (InterruptedException var8) {
        }
        if (this.field504 != null) {
            try {
                this.field504.method1087(-111);
            } catch (IOException var7) {
            }
        }
        if (this.field507 != null) {
            try {
                this.field507.method1087(-100);
            } catch (IOException var6) {
            }
        }
        if (arg0 <= 10) {
            this.field505 = null;
        }
        if (this.field508 != null) {
            for (int var3 = 0; var3 < this.field508.length; var3++) {
                if (this.field508[var3] != null) {
                    try {
                        this.field508[var3].method1087(-109);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field501 != null) {
            try {
                this.field501.method1087(117);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(BLjava/lang/String;)Lec;")
    public final class40 method180(byte arg0, String arg1) {
        if (arg0 < 3) {
            this.field498 = null;
        }
        return this.method184(0, 0, -1, 16, arg1);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ljava/lang/Runnable;IB)Lec;")
    public final class40 method181(Runnable arg0, int arg1, byte arg2) {
        int var4 = -36 / ((arg2 + 37) / 62);
        return this.method184(0, arg1, -1, 2, arg0);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IILjava/awt/Component;I)Lec;")
    public final class40 method182(int arg0, int arg1, Component arg2, int arg3) {
        int var5 = -10 % ((arg0 + 34) / 37);
        Point var6 = arg2.getLocationOnScreen();
        return this.method184(var6.y + arg1, arg3 - -var6.x, -1, 14, (Object) null);
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(BLjava/lang/String;)Lec;")
    public final class40 method183(byte arg0, String arg1) {
        if (arg0 != 106) {
            this.method180((byte) 15, (String) null);
        }
        return this.method184(0, 0, -1, 12, arg1);
    }

    @OriginalMember(owner = "client!gf", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class40 var2;
            synchronized (this) {
                while (true) {
                    if (this.field516) {
                        return;
                    }
                    if (this.field498 != null) {
                        var2 = this.field498;
                        this.field498 = this.field498.field711;
                        if (this.field498 == null) {
                            this.field515 = null;
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
                int var3 = var2.field712;
                if (var3 == 1) {
                    if (class257.method1736(14361) < field518) {
                        throw new IOException();
                    }
                    var2.field709 = new Socket(InetAddress.getByName((String) var2.field714), var2.field710);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field714);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field710);
                    var2.field709 = var4;
                } else if (var3 == 4) {
                    if (field518 > class257.method1736(14361)) {
                        throw new IOException();
                    }
                    var2.field709 = new DataInputStream(((URL) var2.field714).openStream());
                } else if (var3 == 8) {
                    Object[] var6 = (Object[]) var2.field714;
                    var2.field709 = ((Class) var6[0]).getDeclaredMethod((String) var6[1], (Class[]) var6[2]);
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field714;
                    var2.field709 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else {
                    throw new Exception();
                }
                var2.field713 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field713 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIILjava/lang/Object;)Lec;")
    private final class40 method184(int arg0, int arg1, int arg2, int arg3, Object arg4) {
        class40 var6 = new class40();
        var6.field712 = arg3;
        var6.field710 = arg1;
        var6.field714 = arg4;
        synchronized (this) {
            if (arg2 != -1) {
                return null;
            }
            if (this.field515 == null) {
                this.field515 = this.field498 = var6;
            } else {
                this.field515.field711 = var6;
                this.field515 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)Lhg;")
    public final class203 method185(byte arg0) {
        return arg0 == 124 ? this.field503 : null;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ljava/net/URL;Z)Lec;")
    public final class40 method186(URL arg0, boolean arg1) {
        if (!arg1) {
            this.method189((Class[]) null, (String) null, (byte) -118, (Class) null);
        }
        return this.method184(0, 0, -1, 4, arg0);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ljava/lang/String;II)Lec;")
    public final class40 method187(String arg0, int arg1, int arg2) {
        if (arg2 > -7) {
            this.method181((Runnable) null, -47, (byte) 9);
        }
        return this.method184(0, arg1, -1, 1, arg0);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Lec;")
    public final class40 method188(Class arg0, int arg1, String arg2) {
        int var4 = -2 % ((arg1 - 6) / 44);
        return this.method184(0, 0, -1, 9, new Object[] { arg0, arg2 });
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/String;BLjava/lang/Class;)Lec;")
    public final class40 method189(Class[] arg0, String arg1, byte arg2, Class arg3) {
        if (arg2 != -113) {
            this.run();
        }
        return this.method184(0, 0, -1, 8, new Object[] { arg3, arg1, arg0 });
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)Lec;")
    public final class40 method190(int arg0, int arg1) {
        return arg0 == 0 ? this.method184(0, arg1, arg0 - 1, 3, (Object) null) : null;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZIILjava/awt/Component;Ljava/awt/Point;[I)Lec;")
    public final class40 method191(boolean arg0, int arg1, int arg2, Component arg3, Point arg4, int[] arg5) {
        if (!arg0) {
            field512 = null;
        }
        return this.method184(arg2, arg1, -1, 17, new Object[] { arg3, arg5, arg4 });
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
    public class26(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field509 = "Unknown";
        this.field505 = arg0;
        field499 = "1.1";
        try {
            field509 = System.getProperty("java.vendor");
            field499 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field513 = System.getProperty("os.name");
        } catch (Exception var11) {
            field513 = "Unknown";
        }
        field512 = field513.toLowerCase();
        try {
            field511 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field511 = "";
        }
        try {
            field500 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field500 = "";
        }
        try {
            field502 = System.getProperty("user.home");
            if (field502 != null) {
                field502 = field502 + "/";
            }
        } catch (Exception var8) {
        }
        if (field502 == null) {
            field502 = "~/";
        }
        try {
            this.field506 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field519 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field519 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field517 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field517 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field516 = false;
        this.field510 = new Thread(this);
        this.field510.setPriority(10);
        this.field510.setDaemon(true);
        this.field510.start();
    }

    static {
        new Hashtable(16);
        field518 = 0L;
    }
}
