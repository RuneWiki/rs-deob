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

@OriginalClass("client!cg")
public class class48 implements Runnable {

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "Leg;")
    public class37 field603 = null;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "Lwa;")
    private class243 field604 = null;

    @OriginalMember(owner = "client!cg", name = "q", descriptor = "Leg;")
    public class37 field614 = null;

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "Lwa;")
    private class243 field607 = null;

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "Ljava/applet/Applet;")
    public Applet field609 = null;

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "Leg;")
    public class37 field605 = null;

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "Z")
    private boolean field606 = false;

    @OriginalMember(owner = "client!cg", name = "s", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field616;

    @OriginalMember(owner = "client!cg", name = "p", descriptor = "Ljava/lang/Thread;")
    private Thread field613;

    @OriginalMember(owner = "client!cg", name = "r", descriptor = "I")
    public static int field615 = 3;

    @OriginalMember(owner = "client!cg", name = "t", descriptor = "J")
    public static volatile long field617;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "Lsk;")
    private class248 field598;

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "Ljava/lang/String;")
    public static String field599;

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "Ljava/lang/String;")
    public static String field600;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "Ljava/lang/String;")
    public static String field601;

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "Ljava/lang/String;")
    public static String field608;

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "Ljava/lang/String;")
    private static String field610;

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "Ljava/lang/String;")
    public static String field611;

    @OriginalMember(owner = "client!cg", name = "o", descriptor = "Ljava/lang/String;")
    public static String field612;

    @OriginalMember(owner = "client!cg", name = "u", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field618;

    @OriginalMember(owner = "client!cg", name = "v", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field619;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "[Leg;")
    public class37[] field602;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIILjava/lang/Object;I)Lwa;")
    private final class243 method264(int arg0, int arg1, int arg2, Object arg3, int arg4) {
        class243 var6 = new class243();
        var6.field3993 = arg3;
        if (arg4 != 0) {
            this.method274(false, 119);
        }
        var6.field3991 = arg1;
        var6.field3994 = arg2;
        synchronized (this) {
            if (this.field604 == null) {
                this.field604 = this.field607 = var6;
            } else {
                this.field604.field3996 = var6;
                this.field604 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V")
    public final void method265(int arg0) {
        synchronized (this) {
            if (arg0 != -31804) {
                this.method269((byte) -112, 46, (String) null);
            }
            this.field606 = true;
            this.notifyAll();
        }
        try {
            this.field613.join();
        } catch (InterruptedException var8) {
        }
        if (this.field605 != null) {
            try {
                this.field605.method197(117);
            } catch (IOException var7) {
            }
        }
        if (this.field603 != null) {
            try {
                this.field603.method197(arg0 ^ 0x7C56);
            } catch (IOException var6) {
            }
        }
        if (this.field602 != null) {
            for (int var3 = 0; var3 < this.field602.length; var3++) {
                if (this.field602[var3] != null) {
                    try {
                        this.field602[var3].method197(115);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field614 != null) {
            try {
                this.field614.method197(arg0 + 31863);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)V")
    public final void method266(int arg0) {
        field617 = class249.method1723((byte) 25) + 5000L;
        if (arg0 >= -116) {
            this.method269((byte) 15, 82, (String) null);
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IILjava/awt/Component;I)Lwa;")
    public final class243 method267(int arg0, int arg1, Component arg2, int arg3) {
        if (arg0 != 14) {
            this.field602 = null;
        }
        Point var5 = arg2.getLocationOnScreen();
        return this.method264(var5.y + arg3, 14, var5.x + arg1, (Object) null, 0);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ILjava/net/URL;)Lwa;")
    public final class243 method268(int arg0, URL arg1) {
        int var3 = 13 % ((arg0 - 45) / 38);
        return this.method264(0, 4, 0, arg1, 0);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(BILjava/lang/String;)Lwa;")
    public final class243 method269(byte arg0, int arg1, String arg2) {
        if (arg0 <= 12) {
            this.method276((Class) null, (Class[]) null, (String) null, -32);
        }
        return this.method264(0, 1, arg1, arg2, 0);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ILjava/awt/Component;Ljava/awt/Point;[III)Lwa;")
    public final class243 method270(int arg0, Component arg1, Point arg2, int[] arg3, int arg4, int arg5) {
        if (arg5 > -53) {
            this.method271(106, (Runnable) null, -44);
        }
        return this.method264(arg4, 17, arg0, new Object[] { arg1, arg3, arg2 }, 0);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lwa;")
    public final class243 method271(int arg0, Runnable arg1, int arg2) {
        if (arg2 != 2) {
            this.method274(false, -63);
        }
        return this.method264(0, 2, arg0, arg1, arg2 - 2);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Lwa;")
    public final class243 method272(Class arg0, int arg1, String arg2) {
        return arg1 == 0 ? this.method264(0, 9, 0, new Object[] { arg0, arg2 }, 0) : null;
    }

    @OriginalMember(owner = "client!cg", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class243 var2;
            synchronized (this) {
                while (true) {
                    if (this.field606) {
                        return;
                    }
                    if (this.field607 != null) {
                        var2 = this.field607;
                        this.field607 = this.field607.field3996;
                        if (this.field607 == null) {
                            this.field604 = null;
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
                int var3 = var2.field3991;
                if (var3 == 1) {
                    if (field617 > class249.method1723((byte) 113)) {
                        throw new IOException();
                    }
                    var2.field3992 = new Socket(InetAddress.getByName((String) var2.field3993), var2.field3994);
                } else if (var3 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field3993);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field3994);
                    var2.field3992 = var6;
                } else if (var3 == 4) {
                    if (class249.method1723((byte) 9) < field617) {
                        throw new IOException();
                    }
                    var2.field3992 = new DataInputStream(((URL) var2.field3993).openStream());
                } else if (var3 == 8) {
                    Object[] var4 = (Object[]) var2.field3993;
                    var2.field3992 = ((Class) var4[0]).getDeclaredMethod((String) var4[1], (Class[]) var4[2]);
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field3993;
                    var2.field3992 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else {
                    throw new Exception();
                }
                var2.field3995 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field3995 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ILjava/awt/Component;Z)Lwa;")
    public final class243 method273(int arg0, Component arg1, boolean arg2) {
        if (arg0 != 294665200) {
            field600 = null;
        }
        return this.method264(0, 15, arg2 ? 1 : 0, arg1, arg0 ^ 0x11903BF0);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZI)Lwa;")
    public final class243 method274(boolean arg0, int arg1) {
        return arg0 ? null : this.method264(0, 3, arg1, (Object) null, 0);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Ljava/lang/String;I)Lwa;")
    public final class243 method275(String arg0, int arg1) {
        if (arg1 <= 44) {
            this.method275((String) null, 54);
        }
        return this.method264(0, 16, 0, arg0, 0);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Ljava/lang/Class;[Ljava/lang/Class;Ljava/lang/String;I)Lwa;")
    public final class243 method276(Class arg0, Class[] arg1, String arg2, int arg3) {
        return arg3 > -39 ? null : this.method264(0, 8, 0, new Object[] { arg0, arg2, arg1 }, 0);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(BLjava/lang/String;)Lwa;")
    public final class243 method277(byte arg0, String arg1) {
        int var3 = 66 / ((39 - arg0) / 42);
        return this.method264(0, 12, 0, arg1, 0);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)Lsk;")
    public final class248 method278(byte arg0) {
        if (arg0 > -83) {
            this.field603 = null;
        }
        return this.field598;
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
    public class48(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        this.field609 = arg0;
        field600 = "1.1";
        field611 = "Unknown";
        try {
            field611 = System.getProperty("java.vendor");
            field600 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field599 = System.getProperty("os.name");
        } catch (Exception var11) {
            field599 = "Unknown";
        }
        field608 = field599.toLowerCase();
        try {
            field612 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field612 = "";
        }
        try {
            field601 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field601 = "";
        }
        try {
            field610 = System.getProperty("user.home");
            if (field610 != null) {
                field610 = field610 + "/";
            }
        } catch (Exception var8) {
        }
        if (field610 == null) {
            field610 = "~/";
        }
        try {
            this.field616 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field619 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field619 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field618 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field618 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field606 = false;
        this.field613 = new Thread(this);
        this.field613.setPriority(10);
        this.field613.setDaemon(true);
        this.field613.start();
    }

    static {
        new Hashtable(16);
        field617 = 0L;
    }
}
