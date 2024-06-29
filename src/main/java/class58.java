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

@OriginalClass("client!jk")
public class class58 implements Runnable {

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "Lqc;")
    public class254 field971 = null;

    @OriginalMember(owner = "client!jk", name = "k", descriptor = "Lqc;")
    public class254 field976 = null;

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "Llg;")
    private class266 field972 = null;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "Z")
    private boolean field966 = false;

    @OriginalMember(owner = "client!jk", name = "i", descriptor = "Lqc;")
    public class254 field974 = null;

    @OriginalMember(owner = "client!jk", name = "m", descriptor = "Llg;")
    private class266 field978 = null;

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "Ljava/applet/Applet;")
    public Applet field970 = null;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field969;

    @OriginalMember(owner = "client!jk", name = "p", descriptor = "Ljava/lang/Thread;")
    private Thread field981;

    @OriginalMember(owner = "client!jk", name = "n", descriptor = "I")
    public static int field979 = 3;

    @OriginalMember(owner = "client!jk", name = "t", descriptor = "J")
    public static volatile long field985;

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "Lhj;")
    private class126 field973;

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "Ljava/lang/String;")
    public static String field967;

    @OriginalMember(owner = "client!jk", name = "j", descriptor = "Ljava/lang/String;")
    public static String field975;

    @OriginalMember(owner = "client!jk", name = "l", descriptor = "Ljava/lang/String;")
    public static String field977;

    @OriginalMember(owner = "client!jk", name = "o", descriptor = "Ljava/lang/String;")
    public static String field980;

    @OriginalMember(owner = "client!jk", name = "q", descriptor = "Ljava/lang/String;")
    private static String field982;

    @OriginalMember(owner = "client!jk", name = "r", descriptor = "Ljava/lang/String;")
    public static String field983;

    @OriginalMember(owner = "client!jk", name = "s", descriptor = "Ljava/lang/String;")
    public static String field984;

    @OriginalMember(owner = "client!jk", name = "u", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field986;

    @OriginalMember(owner = "client!jk", name = "v", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field987;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "[Lqc;")
    public class254[] field968;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(BLjava/lang/String;)Llg;")
    public final class266 method362(byte arg0, String arg1) {
        if (arg0 != -75) {
            field979 = 41;
        }
        return this.method364(0, 12, arg1, arg0 + 13, 0);
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(BLjava/awt/Component;II)Llg;")
    public final class266 method363(byte arg0, Component arg1, int arg2, int arg3) {
        Point var5 = arg1.getLocationOnScreen();
        int var6 = 91 / ((-arg0 - 23) / 55);
        return this.method364(var5.x + arg3, 14, (Object) null, -88, var5.y + arg2);
    }

    @OriginalMember(owner = "client!jk", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class266 var2;
            synchronized (this) {
                while (true) {
                    if (this.field966) {
                        return;
                    }
                    if (this.field972 != null) {
                        var2 = this.field972;
                        this.field972 = this.field972.field4622;
                        if (this.field972 == null) {
                            this.field978 = null;
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
                int var3 = var2.field4626;
                if (var3 == 1) {
                    if (field985 > class121.method888((byte) -119)) {
                        throw new IOException();
                    }
                    var2.field4625 = new Socket(InetAddress.getByName((String) var2.field4624), var2.field4627);
                } else if (var3 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field4624);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field4627);
                    var2.field4625 = var6;
                } else if (var3 == 4) {
                    if (field985 > class121.method888((byte) -119)) {
                        throw new IOException();
                    }
                    var2.field4625 = new DataInputStream(((URL) var2.field4624).openStream());
                } else if (var3 == 8) {
                    Object[] var4 = (Object[]) var2.field4624;
                    var2.field4625 = ((Class) var4[0]).getDeclaredMethod((String) var4[1], (Class[]) var4[2]);
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field4624;
                    var2.field4625 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else {
                    throw new Exception();
                }
                var2.field4623 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field4623 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IILjava/lang/Object;II)Llg;")
    private final class266 method364(int arg0, int arg1, Object arg2, int arg3, int arg4) {
        int var6 = -33 % ((28 - arg3) / 56);
        class266 var7 = new class266();
        var7.field4624 = arg2;
        var7.field4626 = arg1;
        var7.field4627 = arg0;
        synchronized (this) {
            if (this.field978 == null) {
                this.field978 = this.field972 = var7;
            } else {
                this.field978.field4622 = var7;
                this.field978 = var7;
            }
            this.notify();
            return var7;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)Lhj;")
    public final class126 method365(int arg0) {
        if (arg0 != -27857) {
            this.field966 = true;
        }
        return this.field973;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(B)V")
    public final void method366(byte arg0) {
        synchronized (this) {
            this.field966 = true;
            this.notifyAll();
        }
        if (arg0 != 88) {
            return;
        }
        try {
            this.field981.join();
        } catch (InterruptedException var8) {
        }
        if (this.field974 != null) {
            try {
                this.field974.method1665(true);
            } catch (IOException var7) {
            }
        }
        if (this.field976 != null) {
            try {
                this.field976.method1665(true);
            } catch (IOException var6) {
            }
        }
        if (this.field968 != null) {
            for (int var3 = 0; var3 < this.field968.length; var3++) {
                if (this.field968[var3] != null) {
                    try {
                        this.field968[var3].method1665(true);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field971 != null) {
            try {
                this.field971.method1665(true);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(II)Llg;")
    public final class266 method367(int arg0, int arg1) {
        if (arg1 <= 13) {
            this.field981 = null;
        }
        return this.method364(arg0, 3, (Object) null, -99, 0);
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(BILjava/lang/Runnable;)Llg;")
    public final class266 method368(byte arg0, int arg1, Runnable arg2) {
        if (arg0 >= -124) {
            this.method369((byte) -107, (String) null);
        }
        return this.method364(arg1, 2, arg2, -46, 0);
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(BLjava/lang/String;)Llg;")
    public final class266 method369(byte arg0, String arg1) {
        return arg0 == -16 ? this.method364(0, 16, arg1, arg0 - 26, 0) : null;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Ljava/net/URL;B)Llg;")
    public final class266 method370(URL arg0, byte arg1) {
        if (arg1 != -106) {
            this.field969 = null;
        }
        return this.method364(0, 4, arg0, -34, 0);
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Z)V")
    public final void method371(boolean arg0) {
        field985 = class121.method888((byte) -119) + 5000L;
        if (arg0) {
            this.field976 = null;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(ZLjava/awt/Component;I)Llg;")
    public final class266 method372(boolean arg0, Component arg1, int arg2) {
        if (arg2 != 0) {
            field984 = null;
        }
        return this.method364(arg0 ? 1 : 0, 15, arg1, 104, 0);
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IILjava/lang/String;)Llg;")
    public final class266 method373(int arg0, int arg1, String arg2) {
        if (arg0 != 0) {
            field986 = null;
        }
        return this.method364(arg1, 1, arg2, 94, 0);
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Ljava/lang/Class;BLjava/lang/String;)Llg;")
    public final class266 method374(Class arg0, byte arg1, String arg2) {
        if (arg1 >= -1) {
            field984 = null;
        }
        return this.method364(0, 9, new Object[] { arg0, arg2 }, -97, 0);
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/Class;ILjava/lang/Class;)Llg;")
    public final class266 method375(String arg0, Class[] arg1, int arg2, Class arg3) {
        if (arg2 != -15129) {
            field967 = null;
        }
        return this.method364(0, 8, new Object[] { arg3, arg0, arg1 }, -101, 0);
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
    public class58(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field967 = "1.1";
        field983 = "Unknown";
        this.field970 = arg0;
        try {
            field983 = System.getProperty("java.vendor");
            field967 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field977 = System.getProperty("os.name");
        } catch (Exception var11) {
            field977 = "Unknown";
        }
        field975 = field977.toLowerCase();
        try {
            field984 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field984 = "";
        }
        try {
            field980 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field980 = "";
        }
        try {
            field982 = System.getProperty("user.home");
            if (field982 != null) {
                field982 = field982 + "/";
            }
        } catch (Exception var8) {
        }
        if (field982 == null) {
            field982 = "~/";
        }
        try {
            this.field969 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field986 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field986 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field987 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field987 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field966 = false;
        this.field981 = new Thread(this);
        this.field981.setPriority(10);
        this.field981.setDaemon(true);
        this.field981.start();
    }

    static {
        new Hashtable(16);
        field985 = 0L;
    }
}
