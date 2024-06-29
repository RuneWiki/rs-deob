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

@OriginalClass("client!jd")
public class class87 implements Runnable {

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "Lti;")
    public class5 field1495 = null;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "Lti;")
    public class5 field1499 = null;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "Z")
    private boolean field1496 = false;

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "Lti;")
    public class5 field1507 = null;

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "Loh;")
    private class275 field1504 = null;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "Loh;")
    private class275 field1501 = null;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "Ljava/applet/Applet;")
    public Applet field1493 = null;

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field1503;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "Ljava/lang/Thread;")
    private Thread field1497;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public static int field1494 = 3;

    @OriginalMember(owner = "client!jd", name = "u", descriptor = "J")
    public static volatile long field1513;

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "Lrl;")
    private class162 field1508;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "Ljava/lang/String;")
    public static String field1498;

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "Ljava/lang/String;")
    public static String field1500;

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "Ljava/lang/String;")
    public static String field1502;

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "Ljava/lang/String;")
    public static String field1506;

    @OriginalMember(owner = "client!jd", name = "q", descriptor = "Ljava/lang/String;")
    private static String field1509;

    @OriginalMember(owner = "client!jd", name = "r", descriptor = "Ljava/lang/String;")
    public static String field1510;

    @OriginalMember(owner = "client!jd", name = "s", descriptor = "Ljava/lang/String;")
    public static String field1511;

    @OriginalMember(owner = "client!jd", name = "t", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1512;

    @OriginalMember(owner = "client!jd", name = "v", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1514;

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "[Lti;")
    public class5[] field1505;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljava/lang/String;II)Loh;")
    public final class275 method586(String arg0, int arg1, int arg2) {
        if (arg1 <= 23) {
            this.method589((byte) 92);
        }
        return this.method592(arg2, 1, (byte) -123, 0, arg0);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljava/lang/String;I)Loh;")
    public final class275 method587(String arg0, int arg1) {
        return arg1 == 31310 ? this.method592(0, 16, (byte) -120, 0, arg0) : null;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z)Lrl;")
    public final class162 method588(boolean arg0) {
        return arg0 ? this.field1508 : null;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)V")
    public final void method589(byte arg0) {
        int var2 = -109 % ((arg0 - 33) / 63);
        field1513 = class231.method1513(-78) + 5000L;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILjava/lang/String;)Loh;")
    public final class275 method590(int arg0, String arg1) {
        int var3 = -78 / ((44 - arg0) / 52);
        return this.method592(0, 12, (byte) -125, 0, arg1);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILjava/awt/Component;II)Loh;")
    public final class275 method591(int arg0, Component arg1, int arg2, int arg3) {
        if (arg3 <= 61) {
            return null;
        } else {
            Point var5 = arg1.getLocationOnScreen();
            return this.method592(arg2 + var5.x, 14, (byte) -123, var5.y + arg0, (Object) null);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIBILjava/lang/Object;)Loh;")
    private final class275 method592(int arg0, int arg1, byte arg2, int arg3, Object arg4) {
        if (arg2 > -114) {
            field1511 = null;
        }
        class275 var6 = new class275();
        var6.field4847 = arg0;
        var6.field4845 = arg1;
        var6.field4848 = arg4;
        synchronized (this) {
            if (this.field1501 == null) {
                this.field1501 = this.field1504 = var6;
            } else {
                this.field1501.field4846 = var6;
                this.field1501 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILjava/net/URL;)Loh;")
    public final class275 method593(int arg0, URL arg1) {
        return arg0 == 4 ? this.method592(0, 4, (byte) -125, 0, arg1) : null;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILjava/lang/Runnable;I)Loh;")
    public final class275 method594(int arg0, Runnable arg1, int arg2) {
        if (arg0 != -30175) {
            this.field1495 = null;
        }
        return this.method592(arg2, 2, (byte) -127, 0, arg1);
    }

    @OriginalMember(owner = "client!jd", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class275 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1496) {
                        return;
                    }
                    if (this.field1504 != null) {
                        var2 = this.field1504;
                        this.field1504 = this.field1504.field4846;
                        if (this.field1504 == null) {
                            this.field1501 = null;
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
                int var3 = var2.field4845;
                if (var3 == 1) {
                    if (class231.method1513(72) < field1513) {
                        throw new IOException();
                    }
                    var2.field4843 = new Socket(InetAddress.getByName((String) var2.field4848), var2.field4847);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field4848);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field4847);
                    var2.field4843 = var4;
                } else if (var3 == 4) {
                    if (field1513 > class231.method1513(69)) {
                        throw new IOException();
                    }
                    var2.field4843 = new DataInputStream(((URL) var2.field4848).openStream());
                } else if (var3 == 8) {
                    Object[] var6 = (Object[]) var2.field4848;
                    var2.field4843 = ((Class) var6[0]).getDeclaredMethod((String) var6[1], (Class[]) var6[2]);
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field4848;
                    var2.field4843 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else {
                    throw new Exception();
                }
                var2.field4844 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field4844 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IZLjava/awt/Component;)Loh;")
    public final class275 method595(int arg0, boolean arg1, Component arg2) {
        int var4 = -46 % ((-arg0 - 11) / 32);
        return this.method592(arg1 ? 1 : 0, 15, (byte) -115, 0, arg2);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I)Loh;")
    public final class275 method596(String arg0, Class arg1, int arg2) {
        return arg2 < 51 ? null : this.method592(0, 9, (byte) -128, 0, new Object[] { arg1, arg0 });
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;I)Loh;")
    public final class275 method597(String arg0, Class arg1, Class[] arg2, int arg3) {
        if (arg3 != 0) {
            field1500 = null;
        }
        return this.method592(0, 8, (byte) -120, 0, new Object[] { arg1, arg0, arg2 });
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
    public final void method598(int arg0) {
        synchronized (this) {
            if (arg0 != 9054) {
                this.method591(60, (Component) null, 12, -63);
            }
            this.field1496 = true;
            this.notifyAll();
        }
        try {
            this.field1497.join();
        } catch (InterruptedException var8) {
        }
        if (this.field1495 != null) {
            try {
                this.field1495.method47(false);
            } catch (IOException var7) {
            }
        }
        if (this.field1507 != null) {
            try {
                this.field1507.method47(false);
            } catch (IOException var6) {
            }
        }
        if (this.field1505 != null) {
            for (int var3 = 0; var3 < this.field1505.length; var3++) {
                if (this.field1505[var3] != null) {
                    try {
                        this.field1505[var3].method47(false);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field1499 != null) {
            try {
                this.field1499.method47(false);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IZ)Loh;")
    public final class275 method599(int arg0, boolean arg1) {
        if (!arg1) {
            this.run();
        }
        return this.method592(arg0, 3, (byte) -125, 0, (Object) null);
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
    public class87(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        this.field1493 = arg0;
        field1511 = "1.1";
        field1506 = "Unknown";
        try {
            field1506 = System.getProperty("java.vendor");
            field1511 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field1502 = System.getProperty("os.name");
        } catch (Exception var11) {
            field1502 = "Unknown";
        }
        field1510 = field1502.toLowerCase();
        try {
            field1498 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field1498 = "";
        }
        try {
            field1500 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field1500 = "";
        }
        try {
            field1509 = System.getProperty("user.home");
            if (field1509 != null) {
                field1509 = field1509 + "/";
            }
        } catch (Exception var8) {
        }
        if (field1509 == null) {
            field1509 = "~/";
        }
        try {
            this.field1503 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field1514 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field1514 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field1512 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field1512 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field1496 = false;
        this.field1497 = new Thread(this);
        this.field1497.setPriority(10);
        this.field1497.setDaemon(true);
        this.field1497.start();
    }

    static {
        new Hashtable(16);
        field1513 = 0L;
    }
}
