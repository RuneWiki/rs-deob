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

@OriginalClass("client!d")
public class class244 implements Runnable {

    @OriginalMember(owner = "client!d", name = "a", descriptor = "Ljava/applet/Applet;")
    public Applet field3715 = null;

    @OriginalMember(owner = "client!d", name = "i", descriptor = "Z")
    private boolean field3723 = false;

    @OriginalMember(owner = "client!d", name = "j", descriptor = "Lvj;")
    private class117 field3724 = null;

    @OriginalMember(owner = "client!d", name = "k", descriptor = "Lub;")
    public class91 field3725 = null;

    @OriginalMember(owner = "client!d", name = "l", descriptor = "Lvj;")
    private class117 field3726 = null;

    @OriginalMember(owner = "client!d", name = "r", descriptor = "Lub;")
    public class91 field3732 = null;

    @OriginalMember(owner = "client!d", name = "q", descriptor = "Lub;")
    public class91 field3731 = null;

    @OriginalMember(owner = "client!d", name = "f", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field3720;

    @OriginalMember(owner = "client!d", name = "s", descriptor = "Ljava/lang/Thread;")
    private Thread field3733;

    @OriginalMember(owner = "client!d", name = "c", descriptor = "I")
    public static int field3717 = 3;

    @OriginalMember(owner = "client!d", name = "v", descriptor = "J")
    public static volatile long field3736;

    @OriginalMember(owner = "client!d", name = "h", descriptor = "Ltc;")
    private class183 field3722;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "Ljava/lang/String;")
    private static String field3716;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "Ljava/lang/String;")
    public static String field3718;

    @OriginalMember(owner = "client!d", name = "e", descriptor = "Ljava/lang/String;")
    public static String field3719;

    @OriginalMember(owner = "client!d", name = "g", descriptor = "Ljava/lang/String;")
    public static String field3721;

    @OriginalMember(owner = "client!d", name = "m", descriptor = "Ljava/lang/String;")
    public static String field3727;

    @OriginalMember(owner = "client!d", name = "n", descriptor = "Ljava/lang/String;")
    public static String field3728;

    @OriginalMember(owner = "client!d", name = "p", descriptor = "Ljava/lang/String;")
    public static String field3730;

    @OriginalMember(owner = "client!d", name = "t", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field3734;

    @OriginalMember(owner = "client!d", name = "u", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field3735;

    @OriginalMember(owner = "client!d", name = "o", descriptor = "[Lub;")
    public class91[] field3729;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Ljava/awt/Component;III)Lvj;")
    public final class117 method1632(Component arg0, int arg1, int arg2, int arg3) {
        Point var5 = arg0.getLocationOnScreen();
        if (arg3 < 19) {
            this.method1640((String) null, 26);
        }
        return this.method1643((Object) null, arg2 + var5.x, 0, var5.y + arg1, 14);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Ljava/awt/Component;ZI)Lvj;")
    public final class117 method1633(Component arg0, boolean arg1, int arg2) {
        if (arg2 != 15) {
            this.method1632((Component) null, 18, 117, 95);
        }
        return this.method1643(arg0, arg1 ? 1 : 0, 0, 0, 15);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II)Lvj;")
    public final class117 method1634(int arg0, int arg1) {
        if (arg0 >= -53) {
            field3719 = null;
        }
        return this.method1643((Object) null, arg1, 0, 0, 3);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Ljava/lang/String;Z)Lvj;")
    public final class117 method1635(String arg0, boolean arg1) {
        if (arg1) {
            field3735 = null;
        }
        return this.method1643(arg0, 0, 0, 0, 12);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Ljava/lang/Class;B[Ljava/lang/Class;Ljava/lang/String;)Lvj;")
    public final class117 method1636(Class arg0, byte arg1, Class[] arg2, String arg3) {
        return arg1 == -125 ? this.method1643(new Object[] { arg0, arg3, arg2 }, 0, arg1 + 125, 0, 8) : null;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IZLjava/lang/String;)Lvj;")
    public final class117 method1637(int arg0, boolean arg1, String arg2) {
        if (arg1) {
            this.method1645(15);
        }
        return this.method1643(arg2, arg0, 0, 0, 1);
    }

    @OriginalMember(owner = "client!d", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class117 var2;
            synchronized (this) {
                while (true) {
                    if (this.field3723) {
                        return;
                    }
                    if (this.field3726 != null) {
                        var2 = this.field3726;
                        this.field3726 = this.field3726.field1667;
                        if (this.field3726 == null) {
                            this.field3724 = null;
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
                int var3 = var2.field1666;
                if (var3 == 1) {
                    if (class223.method1433((byte) 25) < field3736) {
                        throw new IOException();
                    }
                    var2.field1665 = new Socket(InetAddress.getByName((String) var2.field1664), var2.field1668);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field1664);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field1668);
                    var2.field1665 = var4;
                } else if (var3 == 4) {
                    if (field3736 > class223.method1433((byte) -91)) {
                        throw new IOException();
                    }
                    var2.field1665 = new DataInputStream(((URL) var2.field1664).openStream());
                } else if (var3 == 8) {
                    Object[] var6 = (Object[]) var2.field1664;
                    var2.field1665 = ((Class) var6[0]).getDeclaredMethod((String) var6[1], (Class[]) var6[2]);
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field1664;
                    var2.field1665 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else {
                    throw new Exception();
                }
                var2.field1663 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field1663 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lvj;")
    public final class117 method1638(int arg0, Runnable arg1, int arg2) {
        if (arg0 != 2) {
            this.method1646(-97);
        }
        return this.method1643(arg1, arg2, 0, 0, 2);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Ljava/lang/Class;BLjava/lang/String;)Lvj;")
    public final class117 method1639(Class arg0, byte arg1, String arg2) {
        if (arg1 != -118) {
            this.method1635((String) null, false);
        }
        return this.method1643(new Object[] { arg0, arg2 }, 0, 0, 0, 9);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Ljava/lang/String;I)Lvj;")
    public final class117 method1640(String arg0, int arg1) {
        if (arg1 != 0) {
            this.method1640((String) null, -100);
        }
        return this.method1643(arg0, 0, 0, 0, 16);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
    public final void method1641(int arg0) {
        synchronized (this) {
            this.field3723 = true;
            this.notifyAll();
        }
        try {
            this.field3733.join();
        } catch (InterruptedException var9) {
        }
        if (this.field3732 != null) {
            try {
                this.field3732.method593(0);
            } catch (IOException var8) {
            }
        }
        if (this.field3725 != null) {
            try {
                this.field3725.method593(0);
            } catch (IOException var7) {
            }
        }
        int var3 = 1 % ((-arg0 - 42) / 35);
        if (this.field3729 != null) {
            for (int var4 = 0; var4 < this.field3729.length; var4++) {
                if (this.field3729[var4] != null) {
                    try {
                        this.field3729[var4].method593(0);
                    } catch (IOException var6) {
                    }
                }
            }
        }
        if (this.field3731 != null) {
            try {
                this.field3731.method593(0);
            } catch (IOException var5) {
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(BLjava/net/URL;)Lvj;")
    public final class117 method1642(byte arg0, URL arg1) {
        if (arg0 <= 66) {
            this.field3715 = null;
        }
        return this.method1643(arg1, 0, 0, 0, 4);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Ljava/lang/Object;IIII)Lvj;")
    private final class117 method1643(Object arg0, int arg1, int arg2, int arg3, int arg4) {
        class117 var6 = new class117();
        var6.field1668 = arg1;
        if (arg2 != 0) {
            this.method1637(-42, true, (String) null);
        }
        var6.field1666 = arg4;
        var6.field1664 = arg0;
        synchronized (this) {
            if (this.field3724 == null) {
                this.field3724 = this.field3726 = var6;
            } else {
                this.field3724.field1667 = var6;
                this.field3724 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ILjava/awt/Component;ILjava/awt/Point;[II)Lvj;")
    public final class117 method1644(int arg0, Component arg1, int arg2, Point arg3, int[] arg4, int arg5) {
        if (arg0 != 2500) {
            this.field3722 = null;
        }
        return this.method1643(new Object[] { arg1, arg4, arg3 }, arg2, arg0 - 2500, arg5, 17);
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(I)V")
    public final void method1645(int arg0) {
        field3736 = class223.method1433((byte) -112) + 5000L;
        if (arg0 != 5000) {
            this.method1644(-121, (Component) null, 42, (Point) null, (int[]) null, -79);
        }
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(I)Ltc;")
    public final class183 method1646(int arg0) {
        return arg0 >= -80 ? null : this.field3722;
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
    public class244(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field3719 = "Unknown";
        this.field3715 = arg0;
        field3727 = "1.1";
        try {
            field3719 = System.getProperty("java.vendor");
            field3727 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field3718 = System.getProperty("os.name");
        } catch (Exception var11) {
            field3718 = "Unknown";
        }
        field3728 = field3718.toLowerCase();
        try {
            field3721 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field3721 = "";
        }
        try {
            field3730 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field3730 = "";
        }
        try {
            field3716 = System.getProperty("user.home");
            if (field3716 != null) {
                field3716 = field3716 + "/";
            }
        } catch (Exception var8) {
        }
        if (field3716 == null) {
            field3716 = "~/";
        }
        try {
            this.field3720 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field3735 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field3735 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field3734 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field3734 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field3723 = false;
        this.field3733 = new Thread(this);
        this.field3733.setPriority(10);
        this.field3733.setDaemon(true);
        this.field3733.start();
    }

    static {
        new Hashtable(16);
        field3736 = 0L;
    }
}
