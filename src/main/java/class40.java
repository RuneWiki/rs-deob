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

@OriginalClass("client!fk")
public class class40 implements Runnable {

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "Ltj;")
    private class169 field615 = null;

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "Lkb;")
    public class31 field621 = null;

    @OriginalMember(owner = "client!fk", name = "n", descriptor = "Lkb;")
    public class31 field628 = null;

    @OriginalMember(owner = "client!fk", name = "l", descriptor = "Ljava/applet/Applet;")
    public Applet field626 = null;

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "Lkb;")
    public class31 field622 = null;

    @OriginalMember(owner = "client!fk", name = "s", descriptor = "Z")
    private boolean field633 = false;

    @OriginalMember(owner = "client!fk", name = "p", descriptor = "Ltj;")
    private class169 field630 = null;

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field617;

    @OriginalMember(owner = "client!fk", name = "q", descriptor = "Ljava/lang/Thread;")
    private Thread field631;

    @OriginalMember(owner = "client!fk", name = "j", descriptor = "I")
    public static int field624 = 3;

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "Loi;")
    private class306 field616;

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "Ljava/lang/String;")
    public static String field618;

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "Ljava/lang/String;")
    public static String field619;

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "Ljava/lang/String;")
    public static String field620;

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "Ljava/lang/String;")
    private static String field623;

    @OriginalMember(owner = "client!fk", name = "k", descriptor = "Ljava/lang/String;")
    public static String field625;

    @OriginalMember(owner = "client!fk", name = "o", descriptor = "Ljava/lang/String;")
    public static String field629;

    @OriginalMember(owner = "client!fk", name = "r", descriptor = "Ljava/lang/String;")
    public static String field632;

    @OriginalMember(owner = "client!fk", name = "t", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field634;

    @OriginalMember(owner = "client!fk", name = "u", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field635;

    @OriginalMember(owner = "client!fk", name = "m", descriptor = "[Lkb;")
    public class31[] field627;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Ljava/lang/Class;[Ljava/lang/Class;Ljava/lang/String;B)Ltj;", line = 7)
    public final class169 method233(Class arg0, Class[] arg1, String arg2, byte arg3) {
        if (arg3 != -27) {
            this.field627 = (class31[]) null;
        }
        return this.method238(118, 0, 0, new Object[] { arg0, arg2, arg1 }, 8);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)Ltj;", line = 18)
    public final class169 method234(int arg0, int arg1) {
        if (arg1 != 11281) {
            field629 = (String) null;
        }
        return this.method238(arg1 ^ 0x2C76, 0, arg0, (Object) null, 3);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ZLjava/lang/String;)Ltj;", line = 29)
    public final class169 method235(boolean arg0, String arg1) {
        if (arg0) {
            field624 = -85;
        }
        return this.method238(91, 0, 0, arg1, 12);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILjava/lang/Class;)Ltj;", line = 40)
    public final class169 method236(int arg0, Class arg1) {
        if (arg0 >= -60) {
            this.field622 = (class31) null;
        }
        return this.method238(-32, 0, 0, arg1, 10);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IILjava/lang/String;)Ltj;", line = 53)
    public final class169 method237(int arg0, int arg1, String arg2) {
        if (arg0 != 0) {
            field620 = (String) null;
        }
        return this.method238(-33, 0, arg1, arg2, 1);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIILjava/lang/Object;I)Ltj;", line = 70)
    private final class169 method238(int arg0, int arg1, int arg2, Object arg3, int arg4) {
        class169 var6 = new class169();
        var6.field2830 = arg4;
        var6.field2835 = arg3;
        var6.field2831 = arg2;
        synchronized (this) {
            if (this.field630 == null) {
                this.field630 = this.field615 = var6;
            } else {
                this.field630.field2834 = var6;
                this.field630 = var6;
            }
            this.notify();
            int var8 = 17 / ((arg0 - 7) / 38);
            return var6;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)V", line = 101)
    public final void method239(byte arg0) {
        synchronized (this) {
            this.field633 = true;
            this.notifyAll();
        }
        try {
            this.field631.join();
            if (arg0 > -116) {
                this.field630 = (class169) null;
            }
        } catch (InterruptedException var14) {
        }
        if (this.field622 != null) {
            try {
                this.field622.method177((byte) -111);
            } catch (IOException var13) {
            }
        }
        if (this.field621 != null) {
            try {
                this.field621.method177((byte) -76);
            } catch (IOException var12) {
            }
        }
        if (this.field627 != null) {
            for (int var7 = 0; var7 < this.field627.length; var7++) {
                if (this.field627[var7] != null) {
                    try {
                        this.field627[var7].method177((byte) -76);
                    } catch (IOException var11) {
                    }
                }
            }
        }
        if (this.field628 != null) {
            try {
                this.field628.method177((byte) -59);
            } catch (IOException var10) {
            }
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)Ltj;", line = 158)
    public final class169 method240(int arg0) {
        return arg0 == -18745 ? this.method238(-116, 0, 0, (Object) null, 5) : (class169) null;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IILjava/lang/Runnable;)Ltj;", line = 168)
    public final class169 method241(int arg0, int arg1, Runnable arg2) {
        return arg0 == 8851 ? this.method238(80, 0, arg1, arg2, 2) : (class169) null;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Ljava/net/URL;I)Ltj;", line = 180)
    public final class169 method242(URL arg0, int arg1) {
        if (arg1 != 1161386192) {
            field632 = (String) null;
        }
        return this.method238(arg1 ^ 0x45395897, 0, 0, arg0, 4);
    }

    @OriginalMember(owner = "client!fk", name = "run", descriptor = "()V", line = 193)
    public final void run() {
        while (true) {
            class169 var2;
            synchronized (this) {
                while (true) {
                    if (this.field633) {
                        return;
                    }
                    if (this.field615 != null) {
                        var2 = this.field615;
                        this.field615 = this.field615.field2834;
                        if (this.field615 == null) {
                            this.field630 = null;
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
                int var5 = var2.field2830;
                if (var5 == 1) {
                    var2.field2832 = new Socket(InetAddress.getByName((String) var2.field2835), var2.field2831);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2835);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2831);
                    var2.field2832 = var6;
                } else if (var5 == 4) {
                    var2.field2832 = new DataInputStream(((URL) var2.field2835).openStream());
                } else if (var5 == 8) {
                    Object[] var8 = (Object[]) ((Object[]) var2.field2835);
                    var2.field2832 = ((Class) var8[0]).getDeclaredMethod((String) var8[1], (Class[]) ((Class[]) var8[2]));
                } else if (var5 == 9) {
                    Object[] var7 = (Object[]) ((Object[]) var2.field2835);
                    var2.field2832 = ((Class) var7[0]).getDeclaredField((String) var7[1]);
                } else {
                    throw new Exception();
                }
                var2.field2833 = 1;
            } catch (ThreadDeath var11) {
                throw var11;
            } catch (Throwable var12) {
                var2.field2833 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V", line = 438)
    public class40(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        this.field626 = arg0;
        field629 = "1.1";
        field620 = "Unknown";
        try {
            field620 = System.getProperty("java.vendor");
            field629 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        try {
            field618 = System.getProperty("os.name");
        } catch (Exception var19) {
            field618 = "Unknown";
        }
        field619 = field618.toLowerCase();
        try {
            field625 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field625 = "";
        }
        try {
            field632 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
            field632 = "";
        }
        try {
            field623 = System.getProperty("user.home");
            if (field623 != null) {
                field623 = field623 + "/";
            }
        } catch (Exception var16) {
        }
        if (field623 == null) {
            field623 = "~/";
        }
        try {
            this.field617 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        try {
            if (arg0 == null) {
                field634 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field634 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var14) {
        }
        try {
            if (arg0 == null) {
                field635 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field635 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var13) {
        }
        this.field633 = false;
        this.field631 = new Thread(this);
        this.field631.setPriority(10);
        this.field631.setDaemon(true);
        this.field631.start();
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Ljava/awt/Frame;I)Ltj;", line = 290)
    public final class169 method243(Frame arg0, int arg1) {
        return arg1 == 1 ? this.method238(-123, 0, 0, arg0, 7) : (class169) null;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ZLjava/awt/Component;B)Ltj;", line = 308)
    public final class169 method244(boolean arg0, Component arg1, byte arg2) {
        return arg2 < 116 ? (class169) null : this.method238(-91, 0, arg0 ? 1 : 0, arg1, 15);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Ljava/lang/String;Z)Ltj;", line = 318)
    public final class169 method245(String arg0, boolean arg1) {
        if (arg1) {
            this.method238(-97, 40, 117, (Object) null, 46);
        }
        return this.method238(-49, 0, 0, arg0, 16);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIBII)Ltj;", line = 330)
    public final class169 method246(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 >= -76) {
            this.field616 = (class306) null;
        }
        return this.method238(79, (arg4 << 16) + arg1, (arg0 << 16) + arg3, (Object) null, 6);
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)Z", line = 341)
    public final boolean method247(int arg0) {
        if (arg0 <= 51) {
            this.field615 = (class169) null;
        }
        return false;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Ljava/awt/Component;IBI)Ltj;", line = 361)
    public final class169 method248(Component arg0, int arg1, byte arg2, int arg3) {
        if (arg2 <= 85) {
            return (class169) null;
        } else {
            Point var5 = arg0.getLocationOnScreen();
            return this.method238(107, var5.y + arg3, var5.x + arg1, (Object) null, 14);
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Ljava/lang/Class;I)Ltj;", line = 375)
    public final class169 method249(Class arg0, int arg1) {
        if (arg1 != 6) {
            this.run();
        }
        return this.method238(-97, 0, 0, arg0, 11);
    }

    static {
        new Hashtable(16);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ZLjava/lang/Class;Ljava/lang/String;)Ltj;", line = 402)
    public final class169 method250(boolean arg0, Class arg1, String arg2) {
        return arg0 ? this.method238(74, 0, 0, new Object[] { arg1, arg2 }, 9) : (class169) null;
    }

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "(I)Loi;", line = 426)
    public final class306 method251(int arg0) {
        if (arg0 >= -17) {
            field634 = (Method) null;
        }
        return this.field616;
    }
}
