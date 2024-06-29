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

@OriginalClass("client!si")
public class class56 implements Runnable {

    @OriginalMember(owner = "client!si", name = "a", descriptor = "Lbd;")
    private class81 field652 = null;

    @OriginalMember(owner = "client!si", name = "p", descriptor = "Lbd;")
    private class81 field667 = null;

    @OriginalMember(owner = "client!si", name = "k", descriptor = "Luj;")
    public class264 field662 = null;

    @OriginalMember(owner = "client!si", name = "m", descriptor = "Ljava/applet/Applet;")
    public Applet field664 = null;

    @OriginalMember(owner = "client!si", name = "j", descriptor = "Z")
    private boolean field661 = false;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "Luj;")
    public class264 field654 = null;

    @OriginalMember(owner = "client!si", name = "t", descriptor = "Luj;")
    public class264 field671 = null;

    @OriginalMember(owner = "client!si", name = "f", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field657;

    @OriginalMember(owner = "client!si", name = "u", descriptor = "Ljava/lang/Thread;")
    private Thread field672;

    @OriginalMember(owner = "client!si", name = "h", descriptor = "I")
    public static int field659 = 3;

    @OriginalMember(owner = "client!si", name = "v", descriptor = "J")
    public static volatile long field673;

    @OriginalMember(owner = "client!si", name = "n", descriptor = "Lna;")
    private class147 field665;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "Ljava/lang/String;")
    public static String field653;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "Ljava/lang/String;")
    public static String field655;

    @OriginalMember(owner = "client!si", name = "e", descriptor = "Ljava/lang/String;")
    private static String field656;

    @OriginalMember(owner = "client!si", name = "g", descriptor = "Ljava/lang/String;")
    public static String field658;

    @OriginalMember(owner = "client!si", name = "i", descriptor = "Ljava/lang/String;")
    public static String field660;

    @OriginalMember(owner = "client!si", name = "o", descriptor = "Ljava/lang/String;")
    public static String field666;

    @OriginalMember(owner = "client!si", name = "q", descriptor = "Ljava/lang/String;")
    public static String field668;

    @OriginalMember(owner = "client!si", name = "r", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field669;

    @OriginalMember(owner = "client!si", name = "s", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field670;

    @OriginalMember(owner = "client!si", name = "l", descriptor = "[Luj;")
    public class264[] field663;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ILjava/awt/Component;Z)Lbd;")
    public final class81 method339(int arg0, Component arg1, boolean arg2) {
        return arg0 == 0 ? this.method348(22719, 15, arg1, arg2 ? 1 : 0, 0) : null;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(BLjava/lang/Class;Ljava/lang/String;)Lbd;")
    public final class81 method340(byte arg0, Class arg1, String arg2) {
        if (arg0 != -48) {
            this.method340((byte) 67, (Class) null, (String) null);
        }
        return this.method348(arg0 + 22767, 9, new Object[] { arg1, arg2 }, 0, 0);
    }

    @OriginalMember(owner = "client!si", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class81 var2;
            synchronized (this) {
                while (true) {
                    if (this.field661) {
                        return;
                    }
                    if (this.field667 != null) {
                        var2 = this.field667;
                        this.field667 = this.field667.field962;
                        if (this.field667 == null) {
                            this.field652 = null;
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
                int var3 = var2.field959;
                if (var3 == 1) {
                    if (field673 > class86.method509(false)) {
                        throw new IOException();
                    }
                    var2.field958 = new Socket(InetAddress.getByName((String) var2.field961), var2.field957);
                } else if (var3 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field961);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field957);
                    var2.field958 = var6;
                } else if (var3 == 4) {
                    if (field673 > class86.method509(false)) {
                        throw new IOException();
                    }
                    var2.field958 = new DataInputStream(((URL) var2.field961).openStream());
                } else if (var3 == 8) {
                    Object[] var4 = (Object[]) var2.field961;
                    var2.field958 = ((Class) var4[0]).getDeclaredMethod((String) var4[1], (Class[]) var4[2]);
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field961;
                    var2.field958 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else {
                    throw new Exception();
                }
                var2.field960 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field960 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IILjava/lang/Runnable;)Lbd;")
    public final class81 method341(int arg0, int arg1, Runnable arg2) {
        if (arg0 != 11569) {
            this.field663 = null;
        }
        return this.method348(arg0 ^ 0x758E, 2, arg2, arg1, 0);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(BLjava/awt/Component;II)Lbd;")
    public final class81 method342(byte arg0, Component arg1, int arg2, int arg3) {
        if (arg0 == -98) {
            Point var5 = arg1.getLocationOnScreen();
            return this.method348(22719, 14, (Object) null, arg3 + var5.x, arg2 - -var5.y);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(BLjava/lang/String;)Lbd;")
    public final class81 method343(byte arg0, String arg1) {
        if (arg0 != -34) {
            field670 = null;
        }
        return this.method348(22719, 12, arg1, 0, 0);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(B)V")
    public final void method344(byte arg0) {
        synchronized (this) {
            this.field661 = true;
            this.notifyAll();
        }
        try {
            this.field672.join();
        } catch (InterruptedException var8) {
        }
        if (this.field654 != null) {
            try {
                this.field654.method1688(-3327);
            } catch (IOException var7) {
            }
        }
        if (this.field671 != null) {
            try {
                this.field671.method1688(arg0 - 3261);
            } catch (IOException var6) {
            }
        }
        if (arg0 != -66) {
            this.field661 = false;
        }
        if (this.field663 != null) {
            for (int var3 = 0; var3 < this.field663.length; var3++) {
                if (this.field663[var3] != null) {
                    try {
                        this.field663[var3].method1688(arg0 ^ 0xCBF);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field662 != null) {
            try {
                this.field662.method1688(-3327);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Ljava/net/URL;B)Lbd;")
    public final class81 method345(URL arg0, byte arg1) {
        return arg1 == 80 ? this.method348(arg1 ^ 0x58EF, 4, arg0, 0, 0) : null;
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(B)Lna;")
    public final class147 method346(byte arg0) {
        return arg0 > -62 ? null : this.field665;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Z)V")
    public final void method347(boolean arg0) {
        field673 = class86.method509(arg0) + 5000L;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IILjava/lang/Object;II)Lbd;")
    private final class81 method348(int arg0, int arg1, Object arg2, int arg3, int arg4) {
        class81 var6 = new class81();
        var6.field961 = arg2;
        var6.field959 = arg1;
        if (arg0 != 22719) {
            this.field671 = null;
        }
        var6.field957 = arg3;
        synchronized (this) {
            if (this.field652 == null) {
                this.field652 = this.field667 = var6;
            } else {
                this.field652.field962 = var6;
                this.field652 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IILjava/lang/String;)Lbd;")
    public final class81 method349(int arg0, int arg1, String arg2) {
        if (arg0 != 0) {
            this.method352((String) null, -105);
        }
        return this.method348(22719, 1, arg2, arg1, 0);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;I)Lbd;")
    public final class81 method350(Class arg0, String arg1, Class[] arg2, int arg3) {
        if (arg3 != 0) {
            this.field661 = true;
        }
        return this.method348(22719, 8, new Object[] { arg0, arg1, arg2 }, 0, 0);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IB)Lbd;")
    public final class81 method351(int arg0, byte arg1) {
        if (arg1 != 15) {
            this.field661 = false;
        }
        return this.method348(22719, 3, (Object) null, arg0, 0);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Ljava/lang/String;I)Lbd;")
    public final class81 method352(String arg0, int arg1) {
        if (arg1 != 5557) {
            this.field663 = null;
        }
        return this.method348(22719, 16, arg0, 0, 0);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I[IILjava/awt/Component;Ljava/awt/Point;B)Lbd;")
    public final class81 method353(int arg0, int[] arg1, int arg2, Component arg3, Point arg4, byte arg5) {
        int var7 = -33 / ((35 - arg5) / 39);
        return this.method348(22719, 17, new Object[] { arg3, arg1, arg4 }, arg2, arg0);
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
    public class56(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field653 = "Unknown";
        this.field664 = arg0;
        field668 = "1.1";
        try {
            field653 = System.getProperty("java.vendor");
            field668 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field660 = System.getProperty("os.name");
        } catch (Exception var11) {
            field660 = "Unknown";
        }
        field666 = field660.toLowerCase();
        try {
            field658 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field658 = "";
        }
        try {
            field655 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field655 = "";
        }
        try {
            field656 = System.getProperty("user.home");
            if (field656 != null) {
                field656 = field656 + "/";
            }
        } catch (Exception var8) {
        }
        if (field656 == null) {
            field656 = "~/";
        }
        try {
            this.field657 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field669 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field669 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field670 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field670 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field661 = false;
        this.field672 = new Thread(this);
        this.field672.setPriority(10);
        this.field672.setDaemon(true);
        this.field672.start();
    }

    static {
        new Hashtable(16);
        field673 = 0L;
    }
}
