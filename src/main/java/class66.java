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

@OriginalClass("client!bi")
public class class66 implements Runnable {

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "Ljava/applet/Applet;")
    public Applet field1449 = null;

    @OriginalMember(owner = "client!bi", name = "k", descriptor = "Lo;")
    public class171 field1453 = null;

    @OriginalMember(owner = "client!bi", name = "l", descriptor = "Lkb;")
    private class27 field1454 = null;

    @OriginalMember(owner = "client!bi", name = "o", descriptor = "Lo;")
    public class171 field1457 = null;

    @OriginalMember(owner = "client!bi", name = "p", descriptor = "Z")
    private boolean field1458 = false;

    @OriginalMember(owner = "client!bi", name = "n", descriptor = "Lkb;")
    private class27 field1456 = null;

    @OriginalMember(owner = "client!bi", name = "r", descriptor = "Lo;")
    public class171 field1460 = null;

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field1451;

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "Ljava/lang/Thread;")
    private Thread field1448;

    @OriginalMember(owner = "client!bi", name = "q", descriptor = "I")
    public static int field1459 = 3;

    @OriginalMember(owner = "client!bi", name = "t", descriptor = "J")
    public static volatile long field1462;

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "Lvh;")
    private class42 field1452;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "Ljava/lang/String;")
    public static String field1443;

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "Ljava/lang/String;")
    public static String field1444;

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1445;

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "Ljava/lang/String;")
    private static String field1446;

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "Ljava/lang/String;")
    public static String field1447;

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "Ljava/lang/String;")
    public static String field1450;

    @OriginalMember(owner = "client!bi", name = "s", descriptor = "Ljava/lang/String;")
    public static String field1461;

    @OriginalMember(owner = "client!bi", name = "u", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1463;

    @OriginalMember(owner = "client!bi", name = "v", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1464;

    @OriginalMember(owner = "client!bi", name = "m", descriptor = "[Lo;")
    public class171[] field1455;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILjava/awt/Component;II)Lkb;")
    public final class27 method589(int arg0, Component arg1, int arg2, int arg3) {
        if (arg0 != 0) {
            this.method594(27, -70, (Object) null, -5, false);
        }
        Point var5 = arg1.getLocationOnScreen();
        return this.method594(var5.y + arg3, 14, (Object) null, var5.x + arg2, false);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)V")
    public final void method590(byte arg0) {
        field1462 = class111.method874(30351) + 5000L;
        int var2 = 72 / ((49 - arg0) / 35);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/net/URL;I)Lkb;")
    public final class27 method591(URL arg0, int arg1) {
        return arg1 > -79 ? null : this.method594(0, 4, arg0, 0, false);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lkb;")
    public final class27 method592(Runnable arg0, int arg1, int arg2) {
        return arg1 > -17 ? null : this.method594(0, 2, arg0, arg2, false);
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(B)V")
    public final void method593(byte arg0) {
        synchronized (this) {
            this.field1458 = true;
            this.notifyAll();
        }
        try {
            if (arg0 != -37) {
                return;
            }
            this.field1448.join();
        } catch (InterruptedException var8) {
        }
        if (this.field1460 != null) {
            try {
                this.field1460.method1258(4222);
            } catch (IOException var7) {
            }
        }
        if (this.field1453 != null) {
            try {
                this.field1453.method1258(4222);
            } catch (IOException var6) {
            }
        }
        if (this.field1455 != null) {
            for (int var3 = 0; var3 < this.field1455.length; var3++) {
                if (this.field1455[var3] != null) {
                    try {
                        this.field1455[var3].method1258(4222);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field1457 != null) {
            try {
                this.field1457.method1258(4222);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class27 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1458) {
                        return;
                    }
                    if (this.field1454 != null) {
                        var2 = this.field1454;
                        this.field1454 = this.field1454.field494;
                        if (this.field1454 == null) {
                            this.field1456 = null;
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
                int var3 = var2.field495;
                if (var3 == 1) {
                    if (field1462 > class111.method874(30351)) {
                        throw new IOException();
                    }
                    var2.field492 = new Socket(InetAddress.getByName((String) var2.field496), var2.field497);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field496);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field497);
                    var2.field492 = var4;
                } else if (var3 == 4) {
                    if (field1462 > class111.method874(30351)) {
                        throw new IOException();
                    }
                    var2.field492 = new DataInputStream(((URL) var2.field496).openStream());
                } else if (var3 == 8) {
                    Object[] var5 = (Object[]) var2.field496;
                    var2.field492 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 9) {
                    Object[] var6 = (Object[]) var2.field496;
                    var2.field492 = ((Class) var6[0]).getDeclaredField((String) var6[1]);
                } else {
                    throw new Exception();
                }
                var2.field493 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field493 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IILjava/lang/Object;IZ)Lkb;")
    private final class27 method594(int arg0, int arg1, Object arg2, int arg3, boolean arg4) {
        if (arg4) {
            return null;
        }
        class27 var6 = new class27();
        var6.field495 = arg1;
        var6.field497 = arg3;
        var6.field496 = arg2;
        synchronized (this) {
            if (this.field1456 == null) {
                this.field1456 = this.field1454 = var6;
            } else {
                this.field1456.field494 = var6;
                this.field1456 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;I)Lkb;")
    public final class27 method595(String arg0, Class arg1, Class[] arg2, int arg3) {
        if (arg3 != 0) {
            field1445 = null;
        }
        return this.method594(0, 8, new Object[] { arg1, arg0, arg2 }, 0, false);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)Lvh;")
    public final class42 method596(int arg0) {
        return arg0 == -4866 ? this.field1452 : null;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/lang/String;I)Lkb;")
    public final class27 method597(String arg0, int arg1) {
        if (arg1 != 26083) {
            field1459 = 39;
        }
        return this.method594(0, 16, arg0, 0, false);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Lkb;")
    public final class27 method598(Class arg0, int arg1, String arg2) {
        if (arg1 != 14) {
            this.method593((byte) 1);
        }
        return this.method594(0, 9, new Object[] { arg0, arg2 }, 0, false);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BZLjava/awt/Component;)Lkb;")
    public final class27 method599(byte arg0, boolean arg1, Component arg2) {
        if (arg0 != 49) {
            this.field1455 = null;
        }
        return this.method594(0, 15, arg2, arg1 ? 1 : 0, false);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)Lkb;")
    public final class27 method600(int arg0, int arg1) {
        return arg1 == 0 ? this.method594(0, 3, (Object) null, arg0, false) : null;
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(Ljava/lang/String;I)Lkb;")
    public final class27 method601(String arg0, int arg1) {
        if (arg1 >= -23) {
            this.run();
        }
        return this.method594(0, 12, arg0, 0, false);
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
    public class66(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field1444 = "Unknown";
        this.field1449 = arg0;
        field1461 = "1.1";
        try {
            field1444 = System.getProperty("java.vendor");
            field1461 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field1443 = System.getProperty("os.name");
        } catch (Exception var11) {
            field1443 = "Unknown";
        }
        field1445 = field1443.toLowerCase();
        try {
            field1450 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field1450 = "";
        }
        try {
            field1447 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field1447 = "";
        }
        try {
            field1446 = System.getProperty("user.home");
            if (field1446 != null) {
                field1446 = field1446 + "/";
            }
        } catch (Exception var8) {
        }
        if (field1446 == null) {
            field1446 = "~/";
        }
        try {
            this.field1451 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field1464 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field1464 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field1463 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field1463 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field1458 = false;
        this.field1448 = new Thread(this);
        this.field1448.setPriority(10);
        this.field1448.setDaemon(true);
        this.field1448.start();
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IILjava/lang/String;)Lkb;")
    public final class27 method602(int arg0, int arg1, String arg2) {
        if (arg0 != -16536) {
            this.method593((byte) -43);
        }
        return this.method594(0, 1, arg2, arg1, false);
    }

    static {
        new Hashtable(16);
        field1462 = 0L;
    }
}
