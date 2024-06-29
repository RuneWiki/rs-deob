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

@OriginalClass("client!vl")
public class class6 implements Runnable {

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "Lmc;")
    public class55 field86 = null;

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "Lch;")
    private class208 field85 = null;

    @OriginalMember(owner = "client!vl", name = "n", descriptor = "Lmc;")
    public class55 field96 = null;

    @OriginalMember(owner = "client!vl", name = "m", descriptor = "Ljava/applet/Applet;")
    public Applet field95 = null;

    @OriginalMember(owner = "client!vl", name = "o", descriptor = "Z")
    private boolean field97 = false;

    @OriginalMember(owner = "client!vl", name = "i", descriptor = "Lch;")
    private class208 field91 = null;

    @OriginalMember(owner = "client!vl", name = "r", descriptor = "Lmc;")
    public class55 field100 = null;

    @OriginalMember(owner = "client!vl", name = "j", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field92;

    @OriginalMember(owner = "client!vl", name = "k", descriptor = "Ljava/lang/Thread;")
    private Thread field93;

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "I")
    public static int field87 = 3;

    @OriginalMember(owner = "client!vl", name = "t", descriptor = "J")
    public static volatile long field102;

    @OriginalMember(owner = "client!vl", name = "g", descriptor = "Lpb;")
    private class301 field89;

    @OriginalMember(owner = "client!vl", name = "s", descriptor = "Ljava/lang/String;")
    public static String field101;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "Ljava/lang/String;")
    private static String field83;

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "Ljava/lang/String;")
    public static String field84;

    @OriginalMember(owner = "client!vl", name = "f", descriptor = "Ljava/lang/String;")
    public static String field88;

    @OriginalMember(owner = "client!vl", name = "h", descriptor = "Ljava/lang/String;")
    public static String field90;

    @OriginalMember(owner = "client!vl", name = "p", descriptor = "Ljava/lang/String;")
    public static String field98;

    @OriginalMember(owner = "client!vl", name = "q", descriptor = "Ljava/lang/String;")
    public static String field99;

    @OriginalMember(owner = "client!vl", name = "u", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field103;

    @OriginalMember(owner = "client!vl", name = "v", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field104;

    @OriginalMember(owner = "client!vl", name = "l", descriptor = "[Lmc;")
    public class55[] field94;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "([IILjava/awt/Component;ILjava/awt/Point;I)Lch;", line = 5)
    public final class208 method47(int[] arg0, int arg1, Component arg2, int arg3, Point arg4, int arg5) {
        return arg5 == 2 ? this.method52(new Object[] { arg2, arg0, arg4 }, 17, arg1, arg3, (byte) 76) : (class208) null;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILjava/lang/Class;)Lch;", line = 15)
    public final class208 method48(int arg0, Class arg1) {
        if (arg0 != 0) {
            field99 = (String) null;
        }
        return this.method52(arg1, 10, 0, 0, (byte) 76);
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Lch;", line = 28)
    public final class208 method49(Class arg0, String arg1, int arg2) {
        return arg2 < 17 ? (class208) null : this.method52(new Object[] { arg0, arg1 }, 9, 0, 0, (byte) 76);
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V", line = 42)
    public final void method50(int arg0) {
        field102 = class105.method789((byte) 55) + 5000L;
        int var2 = -21 % ((19 - arg0) / 63);
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IB)Lch;", line = 56)
    public final class208 method51(int arg0, byte arg1) {
        if (arg1 != -51) {
            this.method52((Object) null, 116, 3, -20, (byte) 20);
        }
        return this.method52((Object) null, 3, 0, arg0, (byte) 76);
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Ljava/lang/Object;IIIB)Lch;", line = 72)
    private final class208 method52(Object arg0, int arg1, int arg2, int arg3, byte arg4) {
        class208 var6 = new class208();
        var6.field3183 = arg0;
        var6.field3187 = arg1;
        var6.field3184 = arg3;
        synchronized (this) {
            if (this.field91 == null) {
                this.field91 = this.field85 = var6;
            } else {
                this.field91.field3188 = var6;
                this.field91 = var6;
            }
            if (arg4 != 76) {
                this.method56((byte) -50);
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V", line = 465)
    public class6(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        this.field95 = arg0;
        field99 = "1.1";
        field90 = "Unknown";
        try {
            field90 = System.getProperty("java.vendor");
            field99 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        try {
            field98 = System.getProperty("os.name");
        } catch (Exception var19) {
            field98 = "Unknown";
        }
        field101 = field98.toLowerCase();
        try {
            field84 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field84 = "";
        }
        try {
            field88 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
            field88 = "";
        }
        try {
            field83 = System.getProperty("user.home");
            if (field83 != null) {
                field83 = field83 + "/";
            }
        } catch (Exception var16) {
        }
        if (field83 == null) {
            field83 = "~/";
        }
        try {
            this.field92 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        try {
            if (arg0 == null) {
                field103 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field103 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var14) {
        }
        try {
            if (arg0 == null) {
                field104 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field104 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var13) {
        }
        this.field97 = false;
        this.field93 = new Thread(this);
        this.field93.setPriority(10);
        this.field93.setDaemon(true);
        this.field93.start();
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Ljava/lang/Class;BLjava/lang/String;[Ljava/lang/Class;)Lch;", line = 103)
    public final class208 method53(Class arg0, byte arg1, String arg2, Class[] arg3) {
        return arg1 == 54 ? this.method52(new Object[] { arg0, arg2, arg3 }, 8, 0, 0, (byte) 76) : (class208) null;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILjava/net/URL;)Lch;", line = 115)
    public final class208 method54(int arg0, URL arg1) {
        if (arg0 != 8) {
            this.method65((byte) -52, -92, (String) null);
        }
        return this.method52(arg1, 4, 0, 0, (byte) 76);
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIZLjava/awt/Component;)Lch;", line = 127)
    public final class208 method55(int arg0, int arg1, boolean arg2, Component arg3) {
        if (!arg2) {
            this.method48(31, (Class) null);
        }
        Point var5 = arg3.getLocationOnScreen();
        return this.method52((Object) null, 14, var5.y + arg0, arg1 - -var5.x, (byte) 76);
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)Lch;", line = 139)
    public final class208 method56(byte arg0) {
        if (arg0 < 31) {
            this.method50(79);
        }
        return this.method52((Object) null, 5, 0, 0, (byte) 76);
    }

    @OriginalMember(owner = "client!vl", name = "run", descriptor = "()V", line = 154)
    public final void run() {
        while (true) {
            class208 var2;
            synchronized (this) {
                while (true) {
                    if (this.field97) {
                        return;
                    }
                    if (this.field85 != null) {
                        var2 = this.field85;
                        this.field85 = this.field85.field3188;
                        if (this.field85 == null) {
                            this.field91 = null;
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
                int var5 = var2.field3187;
                if (var5 == 1) {
                    if (field102 > class105.method789((byte) 55)) {
                        throw new IOException();
                    }
                    var2.field3186 = new Socket(InetAddress.getByName((String) var2.field3183), var2.field3184);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field3183);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field3184);
                    var2.field3186 = var6;
                } else if (var5 == 4) {
                    if (class105.method789((byte) 55) < field102) {
                        throw new IOException();
                    }
                    var2.field3186 = new DataInputStream(((URL) var2.field3183).openStream());
                } else if (var5 == 8) {
                    Object[] var8 = (Object[]) ((Object[]) var2.field3183);
                    var2.field3186 = ((Class) var8[0]).getDeclaredMethod((String) var8[1], (Class[]) ((Class[]) var8[2]));
                } else if (var5 == 9) {
                    Object[] var7 = (Object[]) ((Object[]) var2.field3183);
                    var2.field3186 = ((Class) var7[0]).getDeclaredField((String) var7[1]);
                } else {
                    throw new Exception();
                }
                var2.field3185 = 1;
            } catch (ThreadDeath var11) {
                throw var11;
            } catch (Throwable var12) {
                var2.field3185 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Ljava/lang/Runnable;BI)Lch;", line = 254)
    public final class208 method57(Runnable arg0, byte arg1, int arg2) {
        return arg1 == 9 ? this.method52(arg0, 2, 0, arg2, (byte) 76) : (class208) null;
    }

    static {
        new Hashtable(16);
        field102 = 0L;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Ljava/lang/String;Z)Lch;", line = 271)
    public final class208 method58(String arg0, boolean arg1) {
        if (arg1) {
            this.field89 = (class301) null;
        }
        return this.method52(arg0, 16, 0, 0, (byte) 76);
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(B)Lpb;", line = 281)
    public final class301 method59(byte arg0) {
        if (arg0 != -33) {
            this.method50(-9);
        }
        return this.field89;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(BLjava/lang/Class;)Lch;", line = 292)
    public final class208 method60(byte arg0, Class arg1) {
        return arg0 == 127 ? this.method52(arg1, 11, 0, 0, (byte) 76) : (class208) null;
    }

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "(B)Z", line = 305)
    public final boolean method61(byte arg0) {
        if (arg0 > -117) {
            this.field94 = (class55[]) null;
        }
        return false;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIII)Lch;", line = 318)
    public final class208 method62(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return arg4 == 1347532688 ? this.method52((Object) null, 6, (arg2 << 16) + arg3, (arg1 << 16) + arg0, (byte) 76) : (class208) null;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Ljava/awt/Frame;I)Lch;", line = 329)
    public final class208 method63(Frame arg0, int arg1) {
        if (arg1 != 10000) {
            this.method55(-40, 65, true, (Component) null);
        }
        return this.method52(arg0, 7, 0, 0, (byte) 76);
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Ljava/lang/String;I)Lch;", line = 339)
    public final class208 method64(String arg0, int arg1) {
        return arg1 > -124 ? (class208) null : this.method52(arg0, 12, 0, 0, (byte) 76);
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(BILjava/lang/String;)Lch;", line = 358)
    public final class208 method65(byte arg0, int arg1, String arg2) {
        if (arg0 != -31) {
            this.run();
        }
        return this.method52(arg2, 1, 0, arg1, (byte) 76);
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(I)V", line = 381)
    public final void method66(int arg0) {
        synchronized (this) {
            this.field97 = true;
            this.notifyAll();
            if (arg0 != 2095) {
                this.field95 = (Applet) null;
            }
        }
        try {
            this.field93.join();
        } catch (InterruptedException var14) {
        }
        if (this.field100 != null) {
            try {
                this.field100.method395(1);
            } catch (IOException var13) {
            }
        }
        if (this.field96 != null) {
            try {
                this.field96.method395(arg0 ^ 0x82E);
            } catch (IOException var12) {
            }
        }
        if (this.field94 != null) {
            for (int var7 = 0; var7 < this.field94.length; var7++) {
                if (this.field94[var7] != null) {
                    try {
                        this.field94[var7].method395(1);
                    } catch (IOException var11) {
                    }
                }
            }
        }
        if (this.field86 != null) {
            try {
                this.field86.method395(1);
            } catch (IOException var10) {
            }
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Ljava/awt/Component;ZB)Lch;", line = 444)
    public final class208 method67(Component arg0, boolean arg1, byte arg2) {
        return arg2 <= 43 ? (class208) null : this.method52(arg0, 15, 0, arg1 ? 1 : 0, (byte) 76);
    }
}
