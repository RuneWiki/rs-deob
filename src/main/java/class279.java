import java.applet.Applet;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.Transferable;
import java.io.DataInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class279 implements Runnable {

    @OriginalMember(owner = "client!ap", name = "e", descriptor = "Z")
    private boolean field4461 = false;

    @OriginalMember(owner = "client!ap", name = "j", descriptor = "Lvd;")
    private class26 field4466 = null;

    @OriginalMember(owner = "client!ap", name = "i", descriptor = "Lvd;")
    private class26 field4465 = null;

    @OriginalMember(owner = "client!ap", name = "h", descriptor = "Ljava/applet/Applet;")
    public Applet field4464 = null;

    @OriginalMember(owner = "client!ap", name = "g", descriptor = "Lk;")
    public class335 field4463 = null;

    @OriginalMember(owner = "client!ap", name = "s", descriptor = "Lk;")
    public class335 field4475 = null;

    @OriginalMember(owner = "client!ap", name = "r", descriptor = "Lk;")
    public class335 field4474 = null;

    @OriginalMember(owner = "client!ap", name = "l", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field4468;

    @OriginalMember(owner = "client!ap", name = "o", descriptor = "Ljava/lang/Thread;")
    private Thread field4471;

    @OriginalMember(owner = "client!ap", name = "d", descriptor = "I")
    public static int field4460 = 3;

    @OriginalMember(owner = "client!ap", name = "v", descriptor = "J")
    public static volatile long field4478;

    @OriginalMember(owner = "client!ap", name = "q", descriptor = "La;")
    private class366 field4473;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "Ljava/lang/String;")
    public static String field4457;

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "Ljava/lang/String;")
    public static String field4458;

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "Ljava/lang/String;")
    public static String field4459;

    @OriginalMember(owner = "client!ap", name = "f", descriptor = "Ljava/lang/String;")
    public static String field4462;

    @OriginalMember(owner = "client!ap", name = "k", descriptor = "Ljava/lang/String;")
    public static String field4467;

    @OriginalMember(owner = "client!ap", name = "m", descriptor = "Ljava/lang/String;")
    private static String field4469;

    @OriginalMember(owner = "client!ap", name = "n", descriptor = "Ljava/lang/String;")
    public static String field4470;

    @OriginalMember(owner = "client!ap", name = "t", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field4476;

    @OriginalMember(owner = "client!ap", name = "u", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field4477;

    @OriginalMember(owner = "client!ap", name = "p", descriptor = "[Lk;")
    public class335[] field4472;

    static {
        new Hashtable(16);
        field4478 = 0L;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;B)Lvd;", line = 8)
    public final class26 method1880(Transferable arg0, byte arg1) {
        if (arg1 != 41) {
            field4462 = null;
        }
        return this.method1905(arg0, 0, 19, false, 0);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Z)La;", line = 21)
    public final class366 method1881(boolean arg0) {
        if (!arg0) {
            field4467 = null;
        }
        return this.field4473;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Ljava/net/URL;I)Lvd;", line = 31)
    public final class26 method1882(URL arg0, int arg1) {
        if (arg1 != 18) {
            this.method1906((String) null, 7);
        }
        return this.method1905(arg0, 0, 4, false, 0);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(BLjava/awt/Frame;)Lvd;", line = 41)
    public final class26 method1883(byte arg0, Frame arg1) {
        if (arg0 >= -35) {
            this.field4463 = null;
        }
        return this.method1905(arg1, 0, 7, false, 0);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(ILjava/lang/Class;)Lvd;", line = 52)
    public final class26 method1884(int arg0, Class arg1) {
        return arg0 == 0 ? this.method1905(arg1, 0, 10, false, 0) : null;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(ILjava/lang/String;)Lvd;", line = 64)
    public final class26 method1885(int arg0, String arg1) {
        if (arg0 != 0) {
            field4462 = null;
        }
        return this.method1905(arg1, 0, 21, false, 0);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Ljava/lang/Class;Z)Lvd;", line = 77)
    public final class26 method1886(Class arg0, boolean arg1) {
        if (!arg1) {
            this.field4466 = null;
        }
        return this.method1905(arg0, 0, 20, false, 0);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(B)Lvd;", line = 87)
    public final class26 method1887(byte arg0) {
        return arg0 == -40 ? this.method1905((Object) null, 0, 12, false, 0) : null;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Lvd;", line = 99)
    public final class26 method1888(Class arg0, int arg1, String arg2) {
        return arg1 > -108 ? null : this.method1905(new Object[] { arg0, arg2 }, 0, 9, false, 0);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(I)Lvd;", line = 110)
    public final class26 method1889(int arg0) {
        if (arg0 != 0) {
            this.method1882((URL) null, 122);
        }
        return this.method1905((Object) null, 0, 5, false, 0);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;I)Lvd;", line = 121)
    public final class26 method1890(Class[] arg0, String arg1, Class arg2, int arg3) {
        if (arg3 != 0) {
            this.field4464 = null;
        }
        return this.method1905(new Object[] { arg2, arg1, arg0 }, 0, 8, false, 0);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIIBI)Lvd;", line = 135)
    public final class26 method1891(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 <= 10) {
            this.method1902((Component) null, 16, -123, (int[]) null, 112, (Point) null);
        }
        return this.method1905((Object) null, (arg0 << 16) + arg2, 6, false, (arg1 << 16) + arg4);
    }

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(ILjava/lang/String;)Lvd;", line = 147)
    public final class26 method1892(int arg0, String arg1) {
        if (arg0 != 0) {
            this.method1881(false);
        }
        return this.method1905(arg1, 0, 16, false, 0);
    }

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(B)Lvd;", line = 161)
    public final class26 method1893(byte arg0) {
        return arg0 == -49 ? this.method1905((Object) null, 0, 13, false, 0) : null;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(ILjava/lang/String;I)Lvd;", line = 171)
    public final class26 method1894(int arg0, String arg1, int arg2) {
        if (arg0 != 0) {
            field4477 = null;
        }
        return this.method1905(arg1, arg2, 1, false, 0);
    }

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(I)V", line = 181)
    public final void method1895(int arg0) {
        synchronized (this) {
            if (arg0 != 5953) {
                return;
            }
            this.field4461 = true;
            this.notifyAll();
        }
        try {
            this.field4471.join();
        } catch (InterruptedException var10) {
        }
        if (this.field4463 != null) {
            try {
                this.field4463.method2210((byte) 96);
            } catch (IOException var9) {
            }
        }
        if (this.field4474 != null) {
            try {
                this.field4474.method2210((byte) 96);
            } catch (IOException var8) {
            }
        }
        if (this.field4472 != null) {
            for (int var3 = 0; var3 < this.field4472.length; var3++) {
                if (this.field4472[var3] != null) {
                    try {
                        this.field4472[var3].method2210((byte) 96);
                    } catch (IOException var7) {
                    }
                }
            }
        }
        if (this.field4475 != null) {
            try {
                this.field4475.method2210((byte) 96);
            } catch (IOException var6) {
            }
        }
    }

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(Z)Z", line = 244)
    public final boolean method1896(boolean arg0) {
        if (!arg0) {
            this.method1898(87, -18);
        }
        return false;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lvd;", line = 262)
    public final class26 method1897(int arg0, Runnable arg1, int arg2) {
        return arg2 == 2 ? this.method1905(arg1, arg0, 2, false, 0) : null;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(II)Lvd;", line = 272)
    public final class26 method1898(int arg0, int arg1) {
        if (arg1 >= -42) {
            this.method1902((Component) null, -125, -11, (int[]) null, 47, (Point) null);
        }
        return this.method1905((Object) null, arg0, 3, false, 0);
    }

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "(I)V", line = 282)
    public final void method1899(int arg0) {
        field4478 = class46.method297(27104) + 5000L;
        if (arg0 <= 69) {
            this.field4473 = null;
        }
    }

    @OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V", line = 594)
    public class279(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field4457 = "1.1";
        this.field4464 = arg0;
        field4458 = "Unknown";
        try {
            field4458 = System.getProperty("java.vendor");
            field4457 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field4470 = System.getProperty("os.name");
        } catch (Exception var11) {
            field4470 = "Unknown";
        }
        field4459 = field4470.toLowerCase();
        try {
            field4462 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field4462 = "";
        }
        try {
            field4467 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field4467 = "";
        }
        try {
            field4469 = System.getProperty("user.home");
            if (field4469 != null) {
                field4469 = field4469 + "/";
            }
        } catch (Exception var8) {
        }
        if (field4469 == null) {
            field4469 = "~/";
        }
        try {
            this.field4468 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field4476 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field4476 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field4477 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field4477 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field4461 = false;
        this.field4471 = new Thread(this);
        this.field4471.setPriority(10);
        this.field4471.setDaemon(true);
        this.field4471.start();
    }

    @OriginalMember(owner = "client!ap", name = "d", descriptor = "(I)Lvd;", line = 295)
    public final class26 method1900(int arg0) {
        if (arg0 <= 69) {
            this.method1893((byte) -31);
        }
        return this.method1905((Object) null, 0, 18, false, 0);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIILjava/lang/Object;I)Lvd;", line = 312)
    private final class26 method1901(int arg0, int arg1, int arg2, Object arg3, int arg4) {
        if (arg0 != 0) {
            return null;
        }
        class26 var6 = new class26();
        synchronized (var6) {
            var6.field306 = arg3;
            var6.field307 = arg1;
            var6.field308 = arg4;
            synchronized (this) {
                if (this.field4466 == null) {
                    this.field4466 = this.field4465 = var6;
                } else {
                    this.field4466.field303 = var6;
                    this.field4466 = var6;
                }
                this.notify();
            }
            try {
                var6.wait();
            } catch (InterruptedException var9) {
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Ljava/awt/Component;II[IILjava/awt/Point;)Lvd;", line = 351)
    public final class26 method1902(Component arg0, int arg1, int arg2, int[] arg3, int arg4, Point arg5) {
        return arg2 < 2 ? null : this.method1905(new Object[] { arg0, arg3, arg5 }, arg1, 17, false, arg4);
    }

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(ILjava/lang/Class;)Lvd;", line = 362)
    public final class26 method1903(int arg0, Class arg1) {
        return arg0 == -17074 ? this.method1905(arg1, 0, 11, false, 0) : null;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Ljava/awt/Component;ZB)Lvd;", line = 372)
    public final class26 method1904(Component arg0, boolean arg1, byte arg2) {
        if (arg2 != -114) {
            this.method1896(true);
        }
        return this.method1905(arg0, arg1 ? 1 : 0, 15, false, 0);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Ljava/lang/Object;IIZI)Lvd;", line = 382)
    private final class26 method1905(Object arg0, int arg1, int arg2, boolean arg3, int arg4) {
        class26 var6 = new class26();
        if (arg3) {
            field4457 = null;
        }
        var6.field307 = arg2;
        var6.field308 = arg1;
        var6.field306 = arg0;
        synchronized (this) {
            if (this.field4466 == null) {
                this.field4466 = this.field4465 = var6;
            } else {
                this.field4466.field303 = var6;
                this.field4466 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!ap", name = "run", descriptor = "()V", line = 412)
    public final void run() {
        while (true) {
            class26 var2;
            synchronized (this) {
                while (true) {
                    if (this.field4461) {
                        return;
                    }
                    if (this.field4465 != null) {
                        var2 = this.field4465;
                        this.field4465 = this.field4465.field303;
                        if (this.field4465 == null) {
                            this.field4466 = null;
                        }
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var17) {
                    }
                }
            }
            try {
                int var3 = var2.field307;
                if (var3 == 1) {
                    if (field4478 > class46.method297(27104)) {
                        throw new IOException();
                    }
                    var2.field305 = new Socket(InetAddress.getByName((String) var2.field306), var2.field308);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field306);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field308);
                    var2.field305 = var4;
                } else if (var3 == 4) {
                    if (class46.method297(27104) < field4478) {
                        throw new IOException();
                    }
                    var2.field305 = new DataInputStream(((URL) var2.field306).openStream());
                } else if (var3 == 8) {
                    Object[] var9 = (Object[]) var2.field306;
                    var2.field305 = ((Class) var9[0]).getDeclaredMethod((String) var9[1], (Class[]) var9[2]);
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field306;
                    var2.field305 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else if (var3 == 18) {
                    Clipboard var6 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field305 = var6.getContents((Object) null);
                } else if (var3 == 19) {
                    Transferable var7 = (Transferable) var2.field306;
                    Clipboard var8 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var8.setContents(var7, (ClipboardOwner) null);
                } else {
                    throw new Exception("");
                }
                var2.field304 = 1;
            } catch (ThreadDeath var15) {
                throw var15;
            } catch (Throwable var16) {
                var2.field304 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Ljava/lang/String;I)[B", line = 546)
    public final byte[] method1906(String arg0, int arg1) {
        if (arg1 >= -79) {
            this.field4472 = null;
        }
        class26 var3 = this.method1901(0, 21, 0, arg0, 0);
        return (byte[]) var3.field305;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IBILjava/awt/Component;)Lvd;", line = 567)
    public final class26 method1907(int arg0, byte arg1, int arg2, Component arg3) {
        if (arg1 == 124) {
            Point var5 = arg3.getLocationOnScreen();
            return this.method1905((Object) null, var5.x + arg0, 14, false, var5.y + arg2);
        } else {
            return null;
        }
    }
}
