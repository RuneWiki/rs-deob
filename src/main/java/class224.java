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

@OriginalClass("client!we")
public class class224 implements Runnable {

    @OriginalMember(owner = "client!we", name = "a", descriptor = "Laa;")
    public class41 field3563 = null;

    @OriginalMember(owner = "client!we", name = "k", descriptor = "Laa;")
    public class41 field3573 = null;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "Ljava/applet/Applet;")
    public Applet field3569 = null;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "Laa;")
    public class41 field3572 = null;

    @OriginalMember(owner = "client!we", name = "q", descriptor = "Lrk;")
    private class252 field3579 = null;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "Z")
    private boolean field3574 = false;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "Lrk;")
    private class252 field3570 = null;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field3568;

    @OriginalMember(owner = "client!we", name = "p", descriptor = "Ljava/lang/Thread;")
    private Thread field3578;

    @OriginalMember(owner = "client!we", name = "n", descriptor = "I")
    public static int field3576 = 3;

    @OriginalMember(owner = "client!we", name = "u", descriptor = "J")
    public static volatile long field3583;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "Lpg;")
    private class103 field3564;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "Ljava/lang/String;")
    public static String field3565;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "Ljava/lang/String;")
    private static String field3566;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "Ljava/lang/String;")
    public static String field3567;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "Ljava/lang/String;")
    public static String field3571;

    @OriginalMember(owner = "client!we", name = "m", descriptor = "Ljava/lang/String;")
    public static String field3575;

    @OriginalMember(owner = "client!we", name = "o", descriptor = "Ljava/lang/String;")
    public static String field3577;

    @OriginalMember(owner = "client!we", name = "s", descriptor = "Ljava/lang/String;")
    public static String field3581;

    @OriginalMember(owner = "client!we", name = "t", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field3582;

    @OriginalMember(owner = "client!we", name = "v", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field3584;

    @OriginalMember(owner = "client!we", name = "r", descriptor = "[Laa;")
    public class41[] field3580;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(BLjava/lang/Class;)Lrk;", line = 6)
    public final class252 method1507(byte arg0, Class arg1) {
        if (arg0 != -13) {
            this.method1517(94, (byte) -88, 41, 34, -46);
        }
        return this.method1524(0, -2, 10, 0, arg1);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IILjava/lang/String;)Lrk;", line = 16)
    public final class252 method1508(int arg0, int arg1, String arg2) {
        if (arg0 >= -28) {
            this.field3573 = (class41) null;
        }
        return this.method1524(0, -2, 1, arg1, arg2);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(BLjava/lang/String;)Lrk;", line = 30)
    public final class252 method1509(byte arg0, String arg1) {
        int var3 = -19 % ((-arg0 - 29) / 38);
        return this.method1524(0, -2, 12, 0, arg1);
    }

    @OriginalMember(owner = "client!we", name = "run", descriptor = "()V", line = 41)
    public final void run() {
        while (true) {
            class252 var2;
            synchronized (this) {
                while (true) {
                    if (this.field3574) {
                        return;
                    }
                    if (this.field3579 != null) {
                        var2 = this.field3579;
                        this.field3579 = this.field3579.field3930;
                        if (this.field3579 == null) {
                            this.field3570 = null;
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
                int var5 = var2.field3933;
                if (var5 == 1) {
                    if (field3583 > class195.method1322(121)) {
                        throw new IOException();
                    }
                    var2.field3929 = new Socket(InetAddress.getByName((String) var2.field3932), var2.field3928);
                } else if (var5 == 2) {
                    Thread var8 = new Thread((Runnable) var2.field3932);
                    var8.setDaemon(true);
                    var8.start();
                    var8.setPriority(var2.field3928);
                    var2.field3929 = var8;
                } else if (var5 == 4) {
                    if (class195.method1322(118) < field3583) {
                        throw new IOException();
                    }
                    var2.field3929 = new DataInputStream(((URL) var2.field3932).openStream());
                } else if (var5 == 8) {
                    Object[] var6 = (Object[]) ((Object[]) var2.field3932);
                    var2.field3929 = ((Class) var6[0]).getDeclaredMethod((String) var6[1], (Class[]) ((Class[]) var6[2]));
                } else if (var5 == 9) {
                    Object[] var7 = (Object[]) ((Object[]) var2.field3932);
                    var2.field3929 = ((Class) var7[0]).getDeclaredField((String) var7[1]);
                } else {
                    throw new Exception();
                }
                var2.field3931 = 1;
            } catch (ThreadDeath var11) {
                throw var11;
            } catch (Throwable var12) {
                var2.field3931 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)Lpg;", line = 146)
    public final class103 method1510(int arg0) {
        if (arg0 != 1) {
            this.field3570 = (class252) null;
        }
        return this.field3564;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "([IILjava/awt/Point;IILjava/awt/Component;)Lrk;", line = 160)
    public final class252 method1511(int[] arg0, int arg1, Point arg2, int arg3, int arg4, Component arg5) {
        return arg1 <= 35 ? (class252) null : this.method1524(arg3, -2, 17, arg4, new Object[] { arg5, arg0, arg2 });
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/lang/Class;I)Lrk;", line = 175)
    public final class252 method1512(Class arg0, int arg1) {
        return arg1 <= 104 ? (class252) null : this.method1524(0, -2, 11, 0, arg0);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/lang/String;I)Lrk;", line = 186)
    public final class252 method1513(String arg0, int arg1) {
        if (arg1 != 16) {
            field3567 = (String) null;
        }
        return this.method1524(0, arg1 - 18, 16, 0, arg0);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Z)V", line = 196)
    public final void method1514(boolean arg0) {
        synchronized (this) {
            this.field3574 = arg0;
            this.notifyAll();
        }
        try {
            this.field3578.join();
        } catch (InterruptedException var14) {
        }
        if (this.field3563 != null) {
            try {
                this.field3563.method302((byte) 9);
            } catch (IOException var13) {
            }
        }
        if (this.field3573 != null) {
            try {
                this.field3573.method302((byte) 120);
            } catch (IOException var12) {
            }
        }
        if (this.field3580 != null) {
            for (int var7 = 0; var7 < this.field3580.length; var7++) {
                if (this.field3580[var7] != null) {
                    try {
                        this.field3580[var7].method302((byte) 120);
                    } catch (IOException var11) {
                    }
                }
            }
        }
        if (this.field3572 != null) {
            try {
                this.field3572.method302((byte) 104);
            } catch (IOException var10) {
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IBLjava/lang/Runnable;)Lrk;", line = 246)
    public final class252 method1515(int arg0, byte arg1, Runnable arg2) {
        if (arg1 != -5) {
            this.field3570 = (class252) null;
        }
        return this.method1524(0, -2, 2, arg0, arg2);
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V", line = 448)
    public class224(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field3565 = "1.1";
        field3571 = "Unknown";
        this.field3569 = arg0;
        try {
            field3571 = System.getProperty("java.vendor");
            field3565 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        try {
            field3577 = System.getProperty("os.name");
        } catch (Exception var19) {
            field3577 = "Unknown";
        }
        field3567 = field3577.toLowerCase();
        try {
            field3575 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field3575 = "";
        }
        try {
            field3581 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
            field3581 = "";
        }
        try {
            field3566 = System.getProperty("user.home");
            if (field3566 != null) {
                field3566 = field3566 + "/";
            }
        } catch (Exception var16) {
        }
        if (field3566 == null) {
            field3566 = "~/";
        }
        try {
            this.field3568 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        try {
            if (arg0 == null) {
                field3584 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field3584 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var14) {
        }
        try {
            if (arg0 == null) {
                field3582 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field3582 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var13) {
        }
        this.field3574 = false;
        this.field3578 = new Thread(this);
        this.field3578.setPriority(10);
        this.field3578.setDaemon(true);
        this.field3578.start();
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILjava/net/URL;)Lrk;", line = 262)
    public final class252 method1516(int arg0, URL arg1) {
        if (arg0 != 4) {
            this.method1522(-73);
        }
        return this.method1524(0, -2, 4, 0, arg1);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IBIII)Lrk;", line = 279)
    public final class252 method1517(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= -18) {
            this.method1516(19, (URL) null);
        }
        return this.method1524((arg4 << 16) + arg2, -2, 6, (arg0 << 16) + arg3, (Object) null);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(II)Lrk;", line = 298)
    public final class252 method1518(int arg0, int arg1) {
        int var3 = -102 / ((-arg1 - 48) / 58);
        return this.method1524(0, -2, 3, arg0, (Object) null);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(B)Lrk;", line = 309)
    public final class252 method1519(byte arg0) {
        if (arg0 > -63) {
            field3581 = (String) null;
        }
        return this.method1524(0, -2, 5, 0, (Object) null);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ZBLjava/awt/Component;)Lrk;", line = 320)
    public final class252 method1520(boolean arg0, byte arg1, Component arg2) {
        return arg1 <= 86 ? (class252) null : this.method1524(0, -2, 15, arg0 ? 1 : 0, arg2);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I[Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Lrk;", line = 332)
    public final class252 method1521(int arg0, Class[] arg1, Class arg2, String arg3) {
        if (arg0 != 0) {
            this.method1513((String) null, -126);
        }
        return this.method1524(0, -2, 8, 0, new Object[] { arg2, arg3, arg1 });
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(I)Z", line = 346)
    public final boolean method1522(int arg0) {
        return arg0 <= 20;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IILjava/awt/Component;I)Lrk;", line = 362)
    public final class252 method1523(int arg0, int arg1, Component arg2, int arg3) {
        if (arg0 < 125) {
            return (class252) null;
        } else {
            Point var5 = arg2.getLocationOnScreen();
            return this.method1524(var5.y + arg3, -2, 14, arg1 + var5.x, (Object) null);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIILjava/lang/Object;)Lrk;", line = 376)
    private final class252 method1524(int arg0, int arg1, int arg2, int arg3, Object arg4) {
        class252 var6 = new class252();
        var6.field3933 = arg2;
        var6.field3928 = arg3;
        var6.field3932 = arg4;
        if (arg1 != -2) {
            this.method1522(-128);
        }
        synchronized (this) {
            if (this.field3570 == null) {
                this.field3570 = this.field3579 = var6;
            } else {
                this.field3570.field3930 = var6;
                this.field3570 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Lrk;", line = 403)
    public final class252 method1525(Class arg0, int arg1, String arg2) {
        if (arg1 != 2) {
            this.method1517(-10, (byte) 60, 89, -109, 103);
        }
        return this.method1524(0, -2, 9, 0, new Object[] { arg0, arg2 });
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILjava/awt/Frame;)Lrk;", line = 414)
    public final class252 method1526(int arg0, Frame arg1) {
        if (arg0 != 7) {
            this.method1514(true);
        }
        return this.method1524(0, arg0 ^ 0xFFFFFFF9, 7, 0, arg1);
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(B)V", line = 434)
    public final void method1527(byte arg0) {
        field3583 = class195.method1322(117) + 5000L;
        if (arg0 <= 98) {
            this.method1519((byte) -114);
        }
    }

    static {
        new Hashtable(16);
        field3583 = 0L;
    }
}
