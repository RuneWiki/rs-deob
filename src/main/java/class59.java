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

@OriginalClass("client!we")
public class class59 implements Runnable {

    @OriginalMember(owner = "client!we", name = "d", descriptor = "Lhm;")
    public class23 field906 = null;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "Lhm;")
    public class23 field909 = null;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "Ljava/applet/Applet;")
    public Applet field910 = null;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "Lnn;")
    private class45 field911 = null;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "Lnn;")
    private class45 field905 = null;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "Z")
    private boolean field912 = false;

    @OriginalMember(owner = "client!we", name = "s", descriptor = "Lhm;")
    public class23 field921 = null;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field907;

    @OriginalMember(owner = "client!we", name = "o", descriptor = "Ljava/lang/Thread;")
    private Thread field917;

    @OriginalMember(owner = "client!we", name = "m", descriptor = "I")
    public static int field915 = 3;

    @OriginalMember(owner = "client!we", name = "v", descriptor = "J")
    public static volatile long field924;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "Lv;")
    private class82 field914;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "Ljava/lang/String;")
    public static String field903;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "Ljava/lang/String;")
    public static String field904;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "Ljava/lang/String;")
    public static String field908;

    @OriginalMember(owner = "client!we", name = "k", descriptor = "Ljava/lang/String;")
    public static String field913;

    @OriginalMember(owner = "client!we", name = "n", descriptor = "Ljava/lang/String;")
    private static String field916;

    @OriginalMember(owner = "client!we", name = "q", descriptor = "Ljava/lang/String;")
    public static String field919;

    @OriginalMember(owner = "client!we", name = "r", descriptor = "Ljava/lang/String;")
    public static String field920;

    @OriginalMember(owner = "client!we", name = "t", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field922;

    @OriginalMember(owner = "client!we", name = "u", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field923;

    @OriginalMember(owner = "client!we", name = "p", descriptor = "[Lhm;")
    public class23[] field918;

    @OriginalMember(owner = "client!we", name = "run", descriptor = "()V", line = 8)
    public final void run() {
        while (true) {
            class45 var2;
            synchronized (this) {
                while (true) {
                    if (this.field912) {
                        return;
                    }
                    if (this.field911 != null) {
                        var2 = this.field911;
                        this.field911 = this.field911.field714;
                        if (this.field911 == null) {
                            this.field905 = null;
                        }
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var16) {
                    }
                }
            }
            try {
                int var5 = var2.field713;
                if (var5 == 1) {
                    if (field924 > class306.method2102(-289)) {
                        throw new IOException();
                    }
                    var2.field712 = new Socket(InetAddress.getByName((String) var2.field710), var2.field711);
                } else if (var5 == 2) {
                    Thread var11 = new Thread((Runnable) var2.field710);
                    var11.setDaemon(true);
                    var11.start();
                    var11.setPriority(var2.field711);
                    var2.field712 = var11;
                } else if (var5 == 4) {
                    if (class306.method2102(-289) < field924) {
                        throw new IOException();
                    }
                    var2.field712 = new DataInputStream(((URL) var2.field710).openStream());
                } else if (var5 == 8) {
                    Object[] var6 = (Object[]) ((Object[]) var2.field710);
                    var2.field712 = ((Class) var6[0]).getDeclaredMethod((String) var6[1], (Class[]) ((Class[]) var6[2]));
                } else if (var5 == 9) {
                    Object[] var7 = (Object[]) ((Object[]) var2.field710);
                    var2.field712 = ((Class) var7[0]).getDeclaredField((String) var7[1]);
                } else if (var5 == 18) {
                    Clipboard var10 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field712 = var10.getContents((Object) null);
                } else if (var5 == 19) {
                    Transferable var8 = (Transferable) var2.field710;
                    Clipboard var9 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var9.setContents(var8, (ClipboardOwner) null);
                } else {
                    throw new Exception();
                }
                var2.field709 = 1;
            } catch (ThreadDeath var14) {
                throw var14;
            } catch (Throwable var15) {
                var2.field709 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IZLjava/awt/Component;)Lnn;", line = 121)
    public final class45 method530(int arg0, boolean arg1, Component arg2) {
        return arg0 == 2 ? this.method544(15, -5094, arg2, 0, arg1 ? 1 : 0) : (class45) null;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/lang/Class;I)Lnn;", line = 135)
    public final class45 method531(Class arg0, int arg1) {
        return arg1 == -26655 ? this.method544(10, -5094, arg0, 0, 0) : (class45) null;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I[ILjava/awt/Point;ILjava/awt/Component;Z)Lnn;", line = 149)
    public final class45 method532(int arg0, int[] arg1, Point arg2, int arg3, Component arg4, boolean arg5) {
        return arg5 ? (class45) null : this.method544(17, -5094, new Object[] { arg4, arg1, arg2 }, arg0, arg3);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)Z", line = 161)
    public final boolean method533(int arg0) {
        return arg0 == 26720 ? false : false;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;B)Lnn;", line = 175)
    public final class45 method534(Class arg0, String arg1, Class[] arg2, byte arg3) {
        if (arg3 != 87) {
            field903 = (String) null;
        }
        return this.method544(8, arg3 - 5181, new Object[] { arg0, arg1, arg2 }, 0, 0);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/lang/String;B)Lnn;", line = 186)
    public final class45 method535(String arg0, byte arg1) {
        if (arg1 > -111) {
            field915 = 35;
        }
        return this.method544(12, -5094, arg0, 0, 0);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(B)Lnn;", line = 198)
    public final class45 method536(byte arg0) {
        if (arg0 != -96) {
            field922 = (Method) null;
        }
        return this.method544(5, arg0 - 4998, (Object) null, 0, 0);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(BI)Lnn;", line = 211)
    public final class45 method537(byte arg0, int arg1) {
        int var3 = 103 % ((arg0 + 1) / 45);
        return this.method544(3, -5094, (Object) null, 0, arg1);
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(I)Lv;", line = 220)
    public final class82 method538(int arg0) {
        if (arg0 != -1) {
            this.method551((byte) 55, (Runnable) null, 106);
        }
        return this.field914;
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V", line = 514)
    public class59(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field919 = "Unknown";
        field904 = "1.1";
        this.field910 = arg0;
        try {
            field919 = System.getProperty("java.vendor");
            field904 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        try {
            field908 = System.getProperty("os.name");
        } catch (Exception var19) {
            field908 = "Unknown";
        }
        field913 = field908.toLowerCase();
        try {
            field903 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field903 = "";
        }
        try {
            field920 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
            field920 = "";
        }
        try {
            field916 = System.getProperty("user.home");
            if (field916 != null) {
                field916 = field916 + "/";
            }
        } catch (Exception var16) {
        }
        if (field916 == null) {
            field916 = "~/";
        }
        try {
            this.field907 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        try {
            if (arg0 == null) {
                field922 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field922 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var14) {
        }
        try {
            if (arg0 == null) {
                field923 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field923 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var13) {
        }
        this.field912 = false;
        this.field917 = new Thread(this);
        this.field917.setPriority(10);
        this.field917.setDaemon(true);
        this.field917.start();
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(BLjava/net/URL;)Lnn;", line = 240)
    public final class45 method539(byte arg0, URL arg1) {
        return arg0 == 11 ? this.method544(4, -5094, arg1, 0, 0) : (class45) null;
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(Ljava/lang/Class;I)Lnn;", line = 250)
    public final class45 method540(Class arg0, int arg1) {
        if (arg1 != 8) {
            this.method550(51);
        }
        return this.method544(11, -5094, arg0, 0, 0);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ZILjava/lang/String;)Lnn;", line = 267)
    public final class45 method541(boolean arg0, int arg1, String arg2) {
        return arg0 ? (class45) null : this.method544(1, -5094, arg2, 0, arg1);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Z)V", line = 277)
    public final void method542(boolean arg0) {
        if (!arg0) {
            field924 = class306.method2102(-289) + 5000L;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ZLjava/lang/String;)Lnn;", line = 289)
    public final class45 method543(boolean arg0, String arg1) {
        return arg0 ? this.method544(16, -5094, arg1, 0, 0) : (class45) null;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IILjava/lang/Object;II)Lnn;", line = 304)
    private final class45 method544(int arg0, int arg1, Object arg2, int arg3, int arg4) {
        class45 var6 = new class45();
        var6.field710 = arg2;
        var6.field713 = arg0;
        var6.field711 = arg4;
        synchronized (this) {
            if (this.field905 == null) {
                this.field905 = this.field911 = var6;
            } else {
                this.field905.field714 = var6;
                this.field905 = var6;
            }
            if (arg1 != -5094) {
                this.method531((Class) null, -10);
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(B)Lnn;", line = 331)
    public final class45 method545(byte arg0) {
        return arg0 == 101 ? this.method544(18, arg0 ^ 0xFFFFEC7F, (Object) null, 0, 0) : (class45) null;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIBLjava/awt/Component;)Lnn;", line = 345)
    public final class45 method546(int arg0, int arg1, byte arg2, Component arg3) {
        int var5 = 68 % ((51 - arg2) / 37);
        Point var6 = arg3.getLocationOnScreen();
        return this.method544(14, -5094, (Object) null, var6.y + arg0, var6.x + arg1);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/awt/Frame;I)Lnn;", line = 368)
    public final class45 method547(Frame arg0, int arg1) {
        if (arg1 >= -68) {
            this.method548((String) null, (Class) null, (byte) 81);
        }
        return this.method544(7, -5094, arg0, 0, 0);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;B)Lnn;", line = 379)
    public final class45 method548(String arg0, Class arg1, byte arg2) {
        int var4 = -30 % ((-arg2 - 49) / 57);
        return this.method544(9, -5094, new Object[] { arg1, arg0 }, 0, 0);
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(Ljava/lang/Class;I)Lnn;", line = 387)
    public final class45 method549(Class arg0, int arg1) {
        if (arg1 < 7) {
            this.method545((byte) 95);
        }
        return this.method544(20, -5094, arg0, 0, 0);
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(I)V", line = 399)
    public final void method550(int arg0) {
        synchronized (this) {
            this.field912 = true;
            this.notifyAll();
            if (arg0 != 18) {
                this.field906 = (class23) null;
            }
        }
        try {
            this.field917.join();
        } catch (InterruptedException var14) {
        }
        if (this.field906 != null) {
            try {
                this.field906.method229(arg0 + 38);
            } catch (IOException var13) {
            }
        }
        if (this.field921 != null) {
            try {
                this.field921.method229(88);
            } catch (IOException var12) {
            }
        }
        if (this.field918 != null) {
            for (int var7 = 0; var7 < this.field918.length; var7++) {
                if (this.field918[var7] != null) {
                    try {
                        this.field918[var7].method229(74);
                    } catch (IOException var11) {
                    }
                }
            }
        }
        if (this.field909 != null) {
            try {
                this.field909.method229(68);
            } catch (IOException var10) {
            }
        }
    }

    static {
        new Hashtable(16);
        field924 = 0L;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(BLjava/lang/Runnable;I)Lnn;", line = 463)
    public final class45 method551(byte arg0, Runnable arg1, int arg2) {
        if (arg0 <= 72) {
            field904 = (String) null;
        }
        return this.method544(2, -5094, arg1, 0, arg2);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIZ)Lnn;", line = 478)
    public final class45 method552(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg4) {
            this.method540((Class) null, 119);
        }
        return this.method544(6, -5094, (Object) null, (arg1 << 16) + arg3, (arg0 << 16) - -arg2);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;I)Lnn;", line = 491)
    public final class45 method553(Transferable arg0, int arg1) {
        return arg1 == 0 ? this.method544(19, -5094, arg0, 0, 0) : (class45) null;
    }
}
