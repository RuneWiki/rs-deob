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
public class class92 implements Runnable {

    @OriginalMember(owner = "client!we", name = "b", descriptor = "Z")
    private boolean field1548 = false;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "Lek;")
    public class270 field1556 = null;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "Lii;")
    private class247 field1550 = null;

    @OriginalMember(owner = "client!we", name = "n", descriptor = "Lek;")
    public class270 field1560 = null;

    @OriginalMember(owner = "client!we", name = "o", descriptor = "Ljava/applet/Applet;")
    public Applet field1561 = null;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "Lek;")
    public class270 field1558 = null;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "Lii;")
    private class247 field1554 = null;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field1555;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "Ljava/lang/Thread;")
    private Thread field1553;

    @OriginalMember(owner = "client!we", name = "p", descriptor = "I")
    public static int field1562 = 3;

    @OriginalMember(owner = "client!we", name = "u", descriptor = "J")
    public static volatile long field1567;

    @OriginalMember(owner = "client!we", name = "r", descriptor = "Lwb;")
    private class86 field1564;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1549;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "Ljava/lang/String;")
    public static String field1551;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "Ljava/lang/String;")
    public static String field1552;

    @OriginalMember(owner = "client!we", name = "k", descriptor = "Ljava/lang/String;")
    public static String field1557;

    @OriginalMember(owner = "client!we", name = "m", descriptor = "Ljava/lang/String;")
    public static String field1559;

    @OriginalMember(owner = "client!we", name = "q", descriptor = "Ljava/lang/String;")
    public static String field1563;

    @OriginalMember(owner = "client!we", name = "s", descriptor = "Ljava/lang/String;")
    private static String field1565;

    @OriginalMember(owner = "client!we", name = "t", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1566;

    @OriginalMember(owner = "client!we", name = "v", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1568;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "[Lek;")
    public class270[] field1547;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/lang/Class;I)Lii;", line = 4)
    public final class247 method676(Class arg0, int arg1) {
        return arg1 == 0 ? this.method677(0, 11, arg1 + 100, arg0, 0) : (class247) null;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIILjava/lang/Object;I)Lii;", line = 21)
    private final class247 method677(int arg0, int arg1, int arg2, Object arg3, int arg4) {
        class247 var6 = new class247();
        if (arg2 < 6) {
            this.field1558 = (class270) null;
        }
        var6.field4122 = arg1;
        var6.field4124 = arg4;
        var6.field4126 = arg3;
        synchronized (this) {
            if (this.field1554 == null) {
                this.field1554 = this.field1550 = var6;
            } else {
                this.field1554.field4121 = var6;
                this.field1554 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/lang/Class;B)Lii;", line = 53)
    public final class247 method678(Class arg0, byte arg1) {
        int var3 = -61 / ((arg1 - 36) / 48);
        return this.method677(0, 10, 63, arg0, 0);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIII)Lii;", line = 63)
    public final class247 method679(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != -174) {
            field1565 = (String) null;
        }
        return this.method677((arg3 << 16) + arg2, 6, 73, (Object) null, (arg0 << 16) + arg4);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IBLjava/awt/Component;I)Lii;", line = 76)
    public final class247 method680(int arg0, byte arg1, Component arg2, int arg3) {
        Point var5 = arg2.getLocationOnScreen();
        if (arg1 != 23) {
            this.field1547 = (class270[]) null;
        }
        return this.method677(var5.y + arg0, 14, 64, (Object) null, var5.x + arg3);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ZLjava/lang/String;)Lii;", line = 88)
    public final class247 method681(boolean arg0, String arg1) {
        if (arg0) {
            field1567 = -30L;
        }
        return this.method677(0, 12, 47, arg1, 0);
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V", line = 344)
    public class92(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field1549 = "Unknown";
        this.field1561 = arg0;
        field1559 = "1.1";
        try {
            field1549 = System.getProperty("java.vendor");
            field1559 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        try {
            field1552 = System.getProperty("os.name");
        } catch (Exception var19) {
            field1552 = "Unknown";
        }
        field1557 = field1552.toLowerCase();
        try {
            field1563 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field1563 = "";
        }
        try {
            field1551 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
            field1551 = "";
        }
        try {
            field1565 = System.getProperty("user.home");
            if (field1565 != null) {
                field1565 = field1565 + "/";
            }
        } catch (Exception var16) {
        }
        if (field1565 == null) {
            field1565 = "~/";
        }
        try {
            this.field1555 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        try {
            if (arg0 == null) {
                field1566 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field1566 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var14) {
        }
        try {
            if (arg0 == null) {
                field1568 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field1568 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var13) {
        }
        this.field1548 = false;
        this.field1553 = new Thread(this);
        this.field1553.setPriority(10);
        this.field1553.setDaemon(true);
        this.field1553.start();
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)Lii;", line = 106)
    public final class247 method682(int arg0) {
        if (arg0 != 0) {
            this.field1556 = (class270) null;
        }
        return this.method677(0, 5, 74, (Object) null, 0);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IILjava/lang/String;)Lii;", line = 116)
    public final class247 method683(int arg0, int arg1, String arg2) {
        if (arg1 != 0) {
            this.method683(7, 113, (String) null);
        }
        return this.method677(0, 1, arg1 ^ 0x1C, arg2, arg0);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILjava/net/URL;)Lii;", line = 134)
    public final class247 method684(int arg0, URL arg1) {
        return arg0 == 0 ? this.method677(0, 4, 41, arg1, 0) : (class247) null;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILjava/lang/Runnable;B)Lii;", line = 147)
    public final class247 method685(int arg0, Runnable arg1, byte arg2) {
        int var4 = 104 % ((9 - arg2) / 58);
        return this.method677(0, 2, 126, arg1, arg0);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I[Ljava/lang/Class;)Lii;", line = 160)
    public final class247 method686(String arg0, Class arg1, int arg2, Class[] arg3) {
        return arg2 == 0 ? this.method677(0, 8, 58, new Object[] { arg1, arg0, arg3 }, 0) : (class247) null;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(BLjava/lang/String;)Lii;", line = 172)
    public final class247 method687(byte arg0, String arg1) {
        if (arg0 != 21) {
            field1565 = (String) null;
        }
        return this.method677(0, 16, 97, arg1, 0);
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(I)V", line = 182)
    public final void method688(int arg0) {
        if (arg0 != 2) {
            this.method677(-98, -29, 22, (Object) null, -60);
        }
        field1567 = class130.method935(false) + 5000L;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ZI)Lii;", line = 197)
    public final class247 method689(boolean arg0, int arg1) {
        if (!arg0) {
            this.field1558 = (class270) null;
        }
        return this.method677(0, 3, 29, (Object) null, arg1);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILjava/awt/Component;Z)Lii;", line = 215)
    public final class247 method690(int arg0, Component arg1, boolean arg2) {
        return arg0 == 15 ? this.method677(0, 15, 87, arg1, arg2 ? 1 : 0) : (class247) null;
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(I)Lwb;", line = 225)
    public final class86 method691(int arg0) {
        if (arg0 != 1) {
            this.field1550 = (class247) null;
        }
        return this.field1564;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/awt/Frame;I)Lii;", line = 236)
    public final class247 method692(Frame arg0, int arg1) {
        if (arg1 > -87) {
            field1566 = (Method) null;
        }
        return this.method677(0, 7, 25, arg0, 0);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(B)V", line = 248)
    public final void method693(byte arg0) {
        synchronized (this) {
            this.field1548 = true;
            this.notifyAll();
        }
        try {
            this.field1553.join();
        } catch (InterruptedException var15) {
        }
        int var5 = -65 / ((arg0 - 58) / 51);
        if (this.field1558 != null) {
            try {
                this.field1558.method1879(-9784);
            } catch (IOException var14) {
            }
        }
        if (this.field1560 != null) {
            try {
                this.field1560.method1879(-9784);
            } catch (IOException var13) {
            }
        }
        if (this.field1547 != null) {
            for (int var8 = 0; var8 < this.field1547.length; var8++) {
                if (this.field1547[var8] != null) {
                    try {
                        this.field1547[var8].method1879(-9784);
                    } catch (IOException var12) {
                    }
                }
            }
        }
        if (this.field1556 != null) {
            try {
                this.field1556.method1879(-9784);
            } catch (IOException var11) {
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "d", descriptor = "(I)Z", line = 308)
    public final boolean method694(int arg0) {
        int var2 = -6 % ((4 - arg0) / 59);
        return false;
    }

    static {
        new Hashtable(16);
        field1567 = 0L;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I)Lii;", line = 327)
    public final class247 method695(String arg0, Class arg1, int arg2) {
        if (arg2 < 33) {
            this.method685(89, (Runnable) null, (byte) -54);
        }
        return this.method677(0, 9, 63, new Object[] { arg1, arg0 }, 0);
    }

    @OriginalMember(owner = "client!we", name = "run", descriptor = "()V", line = 426)
    public final void run() {
        while (true) {
            class247 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1548) {
                        return;
                    }
                    if (this.field1550 != null) {
                        var2 = this.field1550;
                        this.field1550 = this.field1550.field4121;
                        if (this.field1550 == null) {
                            this.field1554 = null;
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
                int var5 = var2.field4122;
                if (var5 == 1) {
                    if (class130.method935(false) < field1567) {
                        throw new IOException();
                    }
                    var2.field4123 = new Socket(InetAddress.getByName((String) var2.field4126), var2.field4124);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field4126);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field4124);
                    var2.field4123 = var6;
                } else if (var5 == 4) {
                    if (field1567 > class130.method935(false)) {
                        throw new IOException();
                    }
                    var2.field4123 = new DataInputStream(((URL) var2.field4126).openStream());
                } else if (var5 == 8) {
                    Object[] var8 = (Object[]) ((Object[]) var2.field4126);
                    var2.field4123 = ((Class) var8[0]).getDeclaredMethod((String) var8[1], (Class[]) ((Class[]) var8[2]));
                } else if (var5 == 9) {
                    Object[] var7 = (Object[]) ((Object[]) var2.field4126);
                    var2.field4123 = ((Class) var7[0]).getDeclaredField((String) var7[1]);
                } else {
                    throw new Exception();
                }
                var2.field4125 = 1;
            } catch (ThreadDeath var11) {
                throw var11;
            } catch (Throwable var12) {
                var2.field4125 = 2;
            }
        }
    }
}
