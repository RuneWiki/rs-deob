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

@OriginalClass("client!q")
public class class81 implements Runnable {

    @OriginalMember(owner = "client!q", name = "e", descriptor = "Ljava/applet/Applet;")
    public Applet field1469 = null;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "Lia;")
    private class181 field1468 = null;

    @OriginalMember(owner = "client!q", name = "l", descriptor = "Lia;")
    private class181 field1476 = null;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "Lpe;")
    public class84 field1466 = null;

    @OriginalMember(owner = "client!q", name = "k", descriptor = "Z")
    private boolean field1475 = false;

    @OriginalMember(owner = "client!q", name = "g", descriptor = "Lpe;")
    public class84 field1471 = null;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "Lpe;")
    public class84 field1467 = null;

    @OriginalMember(owner = "client!q", name = "f", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field1470;

    @OriginalMember(owner = "client!q", name = "o", descriptor = "Ljava/lang/Thread;")
    private Thread field1479;

    @OriginalMember(owner = "client!q", name = "i", descriptor = "I")
    public static int field1473 = 3;

    @OriginalMember(owner = "client!q", name = "t", descriptor = "J")
    public static volatile long field1484;

    @OriginalMember(owner = "client!q", name = "q", descriptor = "Lkb;")
    private class28 field1481;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "Ljava/lang/String;")
    public static String field1465;

    @OriginalMember(owner = "client!q", name = "h", descriptor = "Ljava/lang/String;")
    public static String field1472;

    @OriginalMember(owner = "client!q", name = "j", descriptor = "Ljava/lang/String;")
    public static String field1474;

    @OriginalMember(owner = "client!q", name = "m", descriptor = "Ljava/lang/String;")
    public static String field1477;

    @OriginalMember(owner = "client!q", name = "n", descriptor = "Ljava/lang/String;")
    private static String field1478;

    @OriginalMember(owner = "client!q", name = "r", descriptor = "Ljava/lang/String;")
    public static String field1482;

    @OriginalMember(owner = "client!q", name = "s", descriptor = "Ljava/lang/String;")
    public static String field1483;

    @OriginalMember(owner = "client!q", name = "u", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1485;

    @OriginalMember(owner = "client!q", name = "v", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1486;

    @OriginalMember(owner = "client!q", name = "p", descriptor = "[Lpe;")
    public class84[] field1480;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;B)Lia;")
    public final class181 method454(String arg0, Class arg1, byte arg2) {
        if (arg2 != 115) {
            this.method461((String) null, -108, (byte) 13);
        }
        return this.method463(0, new Object[] { arg1, arg0 }, (byte) 66, 0, 9);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(II)Lia;")
    public final class181 method455(int arg0, int arg1) {
        return arg0 == 3 ? this.method463(0, (Object) null, (byte) 66, arg1, 3) : null;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Ljava/lang/String;Z)Lia;")
    public final class181 method456(String arg0, boolean arg1) {
        if (!arg1) {
            this.method465((Component) null, -15, true);
        }
        return this.method463(0, arg0, (byte) 66, 0, 12);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I[Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Lia;")
    public final class181 method457(int arg0, Class[] arg1, Class arg2, String arg3) {
        int var5 = 58 / ((-arg0 - 9) / 36);
        return this.method463(0, new Object[] { arg2, arg3, arg1 }, (byte) 66, 0, 8);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Ljava/awt/Component;III)Lia;")
    public final class181 method458(Component arg0, int arg1, int arg2, int arg3) {
        int var5 = -49 % ((-arg1 - 13) / 32);
        Point var6 = arg0.getLocationOnScreen();
        return this.method463(var6.y + arg2, (Object) null, (byte) 66, var6.x + arg3, 14);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(B)V")
    public final void method459(byte arg0) {
        if (arg0 <= 75) {
            this.field1481 = null;
        }
        field1484 = class205.method1403(-110) + 5000L;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Ljava/lang/Runnable;BI)Lia;")
    public final class181 method460(Runnable arg0, byte arg1, int arg2) {
        if (arg1 < 45) {
            this.field1476 = null;
        }
        return this.method463(0, arg0, (byte) 66, arg2, 2);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Ljava/lang/String;IB)Lia;")
    public final class181 method461(String arg0, int arg1, byte arg2) {
        return arg2 == -46 ? this.method463(0, arg0, (byte) 66, arg1, 1) : null;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Ljava/lang/String;I)Lia;")
    public final class181 method462(String arg0, int arg1) {
        if (arg1 != 0) {
            this.method464(-122, (URL) null);
        }
        return this.method463(0, arg0, (byte) 66, 0, 16);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ILjava/lang/Object;BII)Lia;")
    private final class181 method463(int arg0, Object arg1, byte arg2, int arg3, int arg4) {
        class181 var6 = new class181();
        if (arg2 != 66) {
            this.method457(-117, (Class[]) null, (Class) null, (String) null);
        }
        var6.field3238 = arg4;
        var6.field3243 = arg3;
        var6.field3240 = arg1;
        synchronized (this) {
            if (this.field1476 == null) {
                this.field1476 = this.field1468 = var6;
            } else {
                this.field1476.field3242 = var6;
                this.field1476 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ILjava/net/URL;)Lia;")
    public final class181 method464(int arg0, URL arg1) {
        if (arg0 >= -55) {
            this.field1470 = null;
        }
        return this.method463(0, arg1, (byte) 66, 0, 4);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Ljava/awt/Component;IZ)Lia;")
    public final class181 method465(Component arg0, int arg1, boolean arg2) {
        if (arg1 != 15) {
            this.method461((String) null, -63, (byte) 108);
        }
        return this.method463(0, arg0, (byte) 66, arg2 ? 1 : 0, 15);
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(B)Lkb;")
    public final class28 method466(byte arg0) {
        int var2 = -99 / ((arg0 + 31) / 51);
        return this.field1481;
    }

    @OriginalMember(owner = "client!q", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class181 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1475) {
                        return;
                    }
                    if (this.field1468 != null) {
                        var2 = this.field1468;
                        this.field1468 = this.field1468.field3242;
                        if (this.field1468 == null) {
                            this.field1476 = null;
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
                int var3 = var2.field3238;
                if (var3 == 1) {
                    if (field1484 > class205.method1403(100)) {
                        throw new IOException();
                    }
                    var2.field3239 = new Socket(InetAddress.getByName((String) var2.field3240), var2.field3243);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field3240);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field3243);
                    var2.field3239 = var4;
                } else if (var3 == 4) {
                    if (class205.method1403(-115) < field1484) {
                        throw new IOException();
                    }
                    var2.field3239 = new DataInputStream(((URL) var2.field3240).openStream());
                } else if (var3 == 8) {
                    Object[] var6 = (Object[]) var2.field3240;
                    var2.field3239 = ((Class) var6[0]).getDeclaredMethod((String) var6[1], (Class[]) var6[2]);
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field3240;
                    var2.field3239 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else {
                    throw new Exception();
                }
                var2.field3241 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field3241 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
    public final void method467(int arg0) {
        synchronized (this) {
            this.field1475 = true;
            if (arg0 <= 93) {
                this.method457(106, (Class[]) null, (Class) null, (String) null);
            }
            this.notifyAll();
        }
        try {
            this.field1479.join();
        } catch (InterruptedException var8) {
        }
        if (this.field1467 != null) {
            try {
                this.field1467.method482(-1);
            } catch (IOException var7) {
            }
        }
        if (this.field1471 != null) {
            try {
                this.field1471.method482(-1);
            } catch (IOException var6) {
            }
        }
        if (this.field1480 != null) {
            for (int var3 = 0; var3 < this.field1480.length; var3++) {
                if (this.field1480[var3] != null) {
                    try {
                        this.field1480[var3].method482(-1);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field1466 != null) {
            try {
                this.field1466.method482(-1);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
    public class81(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        this.field1469 = arg0;
        field1474 = "1.1";
        field1465 = "Unknown";
        try {
            field1465 = System.getProperty("java.vendor");
            field1474 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field1483 = System.getProperty("os.name");
        } catch (Exception var11) {
            field1483 = "Unknown";
        }
        field1482 = field1483.toLowerCase();
        try {
            field1477 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field1477 = "";
        }
        try {
            field1472 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field1472 = "";
        }
        try {
            field1478 = System.getProperty("user.home");
            if (field1478 != null) {
                field1478 = field1478 + "/";
            }
        } catch (Exception var8) {
        }
        if (field1478 == null) {
            field1478 = "~/";
        }
        try {
            this.field1470 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field1486 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field1486 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field1485 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field1485 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field1475 = false;
        this.field1479 = new Thread(this);
        this.field1479.setPriority(10);
        this.field1479.setDaemon(true);
        this.field1479.start();
    }

    static {
        new Hashtable(16);
        field1484 = 0L;
    }
}
