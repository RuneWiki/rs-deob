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

@OriginalClass("client!ml")
public class class219 implements Runnable {

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "Z")
    private boolean field3137 = false;

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "Lsm;")
    private class156 field3141 = null;

    @OriginalMember(owner = "client!ml", name = "k", descriptor = "Lsm;")
    private class156 field3147 = null;

    @OriginalMember(owner = "client!ml", name = "l", descriptor = "Lhd;")
    public class443 field3148 = null;

    @OriginalMember(owner = "client!ml", name = "p", descriptor = "Lhd;")
    public class443 field3152 = null;

    @OriginalMember(owner = "client!ml", name = "r", descriptor = "Ljava/applet/Applet;")
    public Applet field3154 = null;

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "Lhd;")
    public class443 field3140 = null;

    @OriginalMember(owner = "client!ml", name = "o", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field3151;

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "Ljava/lang/Thread;")
    private Thread field3139;

    @OriginalMember(owner = "client!ml", name = "m", descriptor = "I")
    public static int field3149 = 3;

    @OriginalMember(owner = "client!ml", name = "u", descriptor = "J")
    public static volatile long field3157;

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "Lsb;")
    private class160 field3142;

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "Ljava/lang/String;")
    public static String field3138;

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "Ljava/lang/String;")
    public static String field3143;

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "Ljava/lang/String;")
    public static String field3144;

    @OriginalMember(owner = "client!ml", name = "j", descriptor = "Ljava/lang/String;")
    public static String field3146;

    @OriginalMember(owner = "client!ml", name = "n", descriptor = "Ljava/lang/String;")
    public static String field3150;

    @OriginalMember(owner = "client!ml", name = "q", descriptor = "Ljava/lang/String;")
    public static String field3153;

    @OriginalMember(owner = "client!ml", name = "s", descriptor = "Ljava/lang/String;")
    private static String field3155;

    @OriginalMember(owner = "client!ml", name = "t", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field3156;

    @OriginalMember(owner = "client!ml", name = "v", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field3158;

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "[Lhd;")
    public class443[] field3145;

    static {
        new Hashtable(16);
        field3157 = 0L;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZLjava/awt/datatransfer/Transferable;)Lsm;", line = 5)
    public final class156 method1520(boolean arg0, Transferable arg1) {
        if (arg0) {
            this.field3137 = false;
        }
        return this.method1529(0, arg1, 19, 0, (byte) 118);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIBLjava/awt/Component;)Lsm;", line = 15)
    public final class156 method1521(int arg0, int arg1, byte arg2, Component arg3) {
        if (arg2 > -38) {
            return null;
        } else {
            Point var5 = arg3.getLocationOnScreen();
            return this.method1529(var5.y + arg0, (Object) null, 14, var5.x + arg1, (byte) 125);
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Z)V", line = 30)
    public final void method1522(boolean arg0) {
        field3157 = class18.method107(-16145) + 5000L;
        if (!arg0) {
            field3156 = null;
        }
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V", line = 589)
    public class219(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field3144 = "1.1";
        field3143 = "Unknown";
        this.field3154 = arg0;
        try {
            field3143 = System.getProperty("java.vendor");
            field3144 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field3153 = System.getProperty("os.name");
        } catch (Exception var11) {
            field3153 = "Unknown";
        }
        field3150 = field3153.toLowerCase();
        try {
            field3138 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field3138 = "";
        }
        try {
            field3146 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field3146 = "";
        }
        try {
            field3155 = System.getProperty("user.home");
            if (field3155 != null) {
                field3155 = field3155 + "/";
            }
        } catch (Exception var8) {
        }
        if (field3155 == null) {
            field3155 = "~/";
        }
        try {
            this.field3151 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field3156 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field3156 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field3158 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field3158 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field3137 = false;
        this.field3139 = new Thread(this);
        this.field3139.setPriority(10);
        this.field3139.setDaemon(true);
        this.field3139.start();
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIII)Lsm;", line = 60)
    public final class156 method1523(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return arg2 == 2089629072 ? this.method1529((arg1 << 16) + arg4, (Object) null, 6, (arg0 << 16) + arg3, (byte) 124) : null;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILjava/lang/String;)Lsm;", line = 70)
    public final class156 method1524(int arg0, String arg1) {
        if (arg0 != 0) {
            field3138 = null;
        }
        return this.method1529(0, arg1, 16, 0, (byte) 124);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)Lsm;", line = 81)
    public final class156 method1525(int arg0) {
        if (arg0 != 0) {
            this.field3140 = null;
        }
        return this.method1529(0, (Object) null, 12, 0, (byte) 119);
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)Lsb;", line = 94)
    public final class160 method1526(int arg0) {
        if (arg0 != 2) {
            field3146 = null;
        }
        return this.field3142;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZLjava/lang/String;)[B", line = 105)
    public final byte[] method1527(boolean arg0, String arg1) {
        class156 var3 = this.method1542(arg1, 21, (byte) -53, 0, 0);
        if (arg0) {
            this.method1535(-72);
        }
        return (byte[]) var3.field2295;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/Class;)Lsm;", line = 121)
    public final class156 method1528(boolean arg0, String arg1, Class arg2) {
        return arg0 ? this.method1529(0, new Object[] { arg2, arg1 }, 9, 0, (byte) 126) : null;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILjava/lang/Object;IIB)Lsm;", line = 131)
    private final class156 method1529(int arg0, Object arg1, int arg2, int arg3, byte arg4) {
        if (arg4 <= 111) {
            field3146 = null;
        }
        class156 var6 = new class156();
        var6.field2297 = arg2;
        var6.field2299 = arg3;
        var6.field2296 = arg1;
        synchronized (this) {
            if (this.field3141 == null) {
                this.field3141 = this.field3147 = var6;
            } else {
                this.field3141.field2300 = var6;
                this.field3141 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(II)Lsm;", line = 161)
    public final class156 method1530(int arg0, int arg1) {
        return arg1 == 3 ? this.method1529(0, (Object) null, 3, arg0, (byte) 121) : null;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZLjava/awt/Frame;)Lsm;", line = 173)
    public final class156 method1531(boolean arg0, Frame arg1) {
        if (!arg0) {
            this.method1527(true, (String) null);
        }
        return this.method1529(0, arg1, 7, 0, (byte) 114);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)Lsm;", line = 183)
    public final class156 method1532(byte arg0) {
        return arg0 == 85 ? this.method1529(0, (Object) null, 5, 0, (byte) 125) : null;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IZLjava/awt/Component;)Lsm;", line = 193)
    public final class156 method1533(int arg0, boolean arg1, Component arg2) {
        return arg0 == 0 ? this.method1529(0, arg2, 15, arg1 ? 1 : 0, (byte) 113) : null;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljava/awt/Point;IILjava/awt/Component;[II)Lsm;", line = 212)
    public final class156 method1534(Point arg0, int arg1, int arg2, Component arg3, int[] arg4, int arg5) {
        if (arg2 != 19) {
            this.method1526(-125);
        }
        return this.method1529(arg1, new Object[] { arg3, arg4, arg0 }, 17, arg5, (byte) 124);
    }

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "(I)Lsm;", line = 227)
    public final class156 method1535(int arg0) {
        return arg0 == 12 ? this.method1529(0, (Object) null, 13, 0, (byte) 122) : null;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILjava/lang/String;I)Lsm;", line = 237)
    public final class156 method1536(int arg0, String arg1, int arg2) {
        return arg2 == 2099 ? this.method1529(0, arg1, 1, arg0, (byte) 124) : null;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljava/lang/Class;I)Lsm;", line = 251)
    public final class156 method1537(Class arg0, int arg1) {
        int var3 = 103 % ((arg1 - 84) / 37);
        return this.method1529(0, arg0, 11, 0, (byte) 121);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IILjava/lang/Runnable;)Lsm;", line = 265)
    public final class156 method1538(int arg0, int arg1, Runnable arg2) {
        if (arg1 <= 40) {
            this.method1521(-100, -82, (byte) -101, (Component) null);
        }
        return this.method1529(0, arg2, 2, arg0, (byte) 116);
    }

    @OriginalMember(owner = "client!ml", name = "run", descriptor = "()V", line = 277)
    public final void run() {
        while (true) {
            class156 var2;
            synchronized (this) {
                while (true) {
                    if (this.field3137) {
                        return;
                    }
                    if (this.field3147 != null) {
                        var2 = this.field3147;
                        this.field3147 = this.field3147.field2300;
                        if (this.field3147 == null) {
                            this.field3141 = null;
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
                int var3 = var2.field2297;
                if (var3 == 1) {
                    if (field3157 > class18.method107(-16145)) {
                        throw new IOException();
                    }
                    var2.field2295 = new Socket(InetAddress.getByName((String) var2.field2296), var2.field2299);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field2296);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field2299);
                    var2.field2295 = var4;
                } else if (var3 == 4) {
                    if (field3157 > class18.method107(-16145)) {
                        throw new IOException();
                    }
                    var2.field2295 = new DataInputStream(((URL) var2.field2296).openStream());
                } else if (var3 == 8) {
                    Object[] var5 = (Object[]) var2.field2296;
                    var2.field2295 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 9) {
                    Object[] var9 = (Object[]) var2.field2296;
                    var2.field2295 = ((Class) var9[0]).getDeclaredField((String) var9[1]);
                } else if (var3 == 18) {
                    Clipboard var6 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field2295 = var6.getContents((Object) null);
                } else if (var3 == 19) {
                    Transferable var7 = (Transferable) var2.field2296;
                    Clipboard var8 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var8.setContents(var7, (ClipboardOwner) null);
                } else {
                    throw new Exception("");
                }
                var2.field2298 = 1;
            } catch (ThreadDeath var15) {
                throw var15;
            } catch (Throwable var16) {
                var2.field2298 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "(I)Z", line = 398)
    public final boolean method1539(int arg0) {
        if (arg0 != 0) {
            this.method1525(66);
        }
        return false;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Class;[Ljava/lang/Class;)Lsm;", line = 412)
    public final class156 method1540(String arg0, int arg1, Class arg2, Class[] arg3) {
        if (arg1 != 27783) {
            this.method1532((byte) -42);
        }
        return this.method1529(0, new Object[] { arg2, arg0, arg3 }, 8, 0, (byte) 123);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILjava/net/URL;)Lsm;", line = 422)
    public final class156 method1541(int arg0, URL arg1) {
        int var3 = -51 / ((30 - arg0) / 37);
        return this.method1529(0, arg1, 4, 0, (byte) 126);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljava/lang/Object;IBII)Lsm;", line = 431)
    private final class156 method1542(Object arg0, int arg1, byte arg2, int arg3, int arg4) {
        class156 var6 = new class156();
        synchronized (var6) {
            var6.field2297 = arg1;
            var6.field2296 = arg0;
            var6.field2299 = arg3;
            synchronized (this) {
                if (this.field3141 == null) {
                    this.field3141 = this.field3147 = var6;
                } else {
                    this.field3141.field2300 = var6;
                    this.field3141 = var6;
                }
                this.notify();
            }
            try {
                var6.wait();
            } catch (InterruptedException var9) {
            }
        }
        return arg2 >= -19 ? null : var6;
    }

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "(I)Lsm;", line = 469)
    public final class156 method1543(int arg0) {
        if (arg0 != 1) {
            field3146 = null;
        }
        return this.method1529(0, (Object) null, 18, 0, (byte) 119);
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(ZLjava/lang/String;)Lsm;", line = 480)
    public final class156 method1544(boolean arg0, String arg1) {
        return arg0 ? this.method1529(0, arg1, 21, 0, (byte) 118) : null;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljava/lang/Class;B)Lsm;", line = 492)
    public final class156 method1545(Class arg0, byte arg1) {
        if (arg1 != -107) {
            this.method1542((Object) null, -49, (byte) -66, -78, 2);
        }
        return this.method1529(0, arg0, 10, 0, (byte) 112);
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(B)V", line = 510)
    public final void method1546(byte arg0) {
        synchronized (this) {
            this.field3137 = true;
            this.notifyAll();
        }
        try {
            this.field3139.join();
            int var3 = 105 / ((arg0 - 71) / 41);
        } catch (InterruptedException var9) {
        }
        if (this.field3140 != null) {
            try {
                this.field3140.method2762(-1);
            } catch (IOException var8) {
            }
        }
        if (this.field3148 != null) {
            try {
                this.field3148.method2762(-1);
            } catch (IOException var7) {
            }
        }
        if (this.field3145 != null) {
            for (int var4 = 0; var4 < this.field3145.length; var4++) {
                if (this.field3145[var4] != null) {
                    try {
                        this.field3145[var4].method2762(-1);
                    } catch (IOException var6) {
                    }
                }
            }
        }
        if (this.field3152 != null) {
            try {
                this.field3152.method2762(-1);
            } catch (IOException var5) {
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILjava/lang/Class;)Lsm;", line = 566)
    public final class156 method1547(int arg0, Class arg1) {
        if (arg0 != 0) {
            this.method1523(100, -71, -3, -15, 82);
        }
        return this.method1529(0, arg1, 20, 0, (byte) 120);
    }
}
