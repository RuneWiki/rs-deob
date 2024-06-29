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

@OriginalClass("client!cb")
public class class255 implements Runnable {

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "Loh;")
    public class14 field4073 = null;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "Z")
    private boolean field4070 = false;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "Lge;")
    private class137 field4072 = null;

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "Loh;")
    public class14 field4080 = null;

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "Loh;")
    public class14 field4083 = null;

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "Lge;")
    private class137 field4085 = null;

    @OriginalMember(owner = "client!cb", name = "v", descriptor = "Ljava/applet/Applet;")
    public Applet field4090 = null;

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field4081;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "Ljava/lang/Thread;")
    private Thread field4074;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
    public static int field4071 = 3;

    @OriginalMember(owner = "client!cb", name = "s", descriptor = "J")
    public static volatile long field4087;

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "Lck;")
    private class213 field4079;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "Ljava/lang/String;")
    public static String field4069;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "Ljava/lang/String;")
    public static String field4075;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "Ljava/lang/String;")
    private static String field4076;

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "Ljava/lang/String;")
    public static String field4077;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "Ljava/lang/String;")
    public static String field4078;

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "Ljava/lang/String;")
    public static String field4082;

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "Ljava/lang/String;")
    public static String field4084;

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field4086;

    @OriginalMember(owner = "client!cb", name = "u", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field4089;

    @OriginalMember(owner = "client!cb", name = "t", descriptor = "[Loh;")
    public class14[] field4088;

    @OriginalMember(owner = "client!cb", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class137 var2;
            synchronized (this) {
                while (true) {
                    if (this.field4070) {
                        return;
                    }
                    if (this.field4085 != null) {
                        var2 = this.field4085;
                        this.field4085 = this.field4085.field2267;
                        if (this.field4085 == null) {
                            this.field4072 = null;
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
                int var3 = var2.field2269;
                if (var3 == 1) {
                    if (field4087 > class182.method1253(20215)) {
                        throw new IOException();
                    }
                    var2.field2266 = new Socket(InetAddress.getByName((String) var2.field2268), var2.field2270);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field2268);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field2270);
                    var2.field2266 = var4;
                } else if (var3 == 4) {
                    if (field4087 > class182.method1253(20215)) {
                        throw new IOException();
                    }
                    var2.field2266 = new DataInputStream(((URL) var2.field2268).openStream());
                } else if (var3 == 8) {
                    Object[] var5 = (Object[]) var2.field2268;
                    var2.field2266 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 9) {
                    Object[] var6 = (Object[]) var2.field2268;
                    var2.field2266 = ((Class) var6[0]).getDeclaredField((String) var6[1]);
                } else {
                    throw new Exception();
                }
                var2.field2271 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2271 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILjava/awt/Component;II)Lge;")
    public final class137 method1665(int arg0, Component arg1, int arg2, int arg3) {
        if (arg2 != 14) {
            this.method1667(100, -58);
        }
        Point var5 = arg1.getLocationOnScreen();
        return this.method1666((byte) 124, (Object) null, arg0 + var5.x, 14, var5.y + arg3);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BLjava/lang/Object;III)Lge;")
    private final class137 method1666(byte arg0, Object arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 124) {
            this.field4088 = null;
        }
        class137 var6 = new class137();
        var6.field2270 = arg2;
        var6.field2268 = arg1;
        var6.field2269 = arg3;
        synchronized (this) {
            if (this.field4072 == null) {
                this.field4072 = this.field4085 = var6;
            } else {
                this.field4072.field2267 = var6;
                this.field4072 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)Lge;")
    public final class137 method1667(int arg0, int arg1) {
        if (arg1 >= -55) {
            field4084 = null;
        }
        return this.method1666((byte) 124, (Object) null, arg0, 3, 0);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)V")
    public final void method1668(byte arg0) {
        field4087 = class182.method1253(20215) + 5000L;
        int var2 = 50 / ((67 - arg0) / 38);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)V")
    public final void method1669(boolean arg0) {
        synchronized (this) {
            this.field4070 = true;
            this.notifyAll();
        }
        try {
            this.field4074.join();
        } catch (InterruptedException var8) {
        }
        if (this.field4080 != null) {
            try {
                this.field4080.method109(-97);
            } catch (IOException var7) {
            }
        }
        if (this.field4073 != null) {
            try {
                this.field4073.method109(-73);
            } catch (IOException var6) {
            }
        }
        if (this.field4088 != null) {
            for (int var3 = 0; var3 < this.field4088.length; var3++) {
                if (this.field4088[var3] != null) {
                    try {
                        this.field4088[var3].method109(-105);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field4083 != null) {
            try {
                this.field4083.method109(-81);
            } catch (IOException var4) {
            }
        }
        if (arg0) {
            field4087 = -13L;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/Class;BLjava/lang/Class;)Lge;")
    public final class137 method1670(String arg0, Class[] arg1, byte arg2, Class arg3) {
        if (arg2 < 59) {
            this.run();
        }
        return this.method1666((byte) 124, new Object[] { arg3, arg0, arg1 }, 0, 8, 0);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BLjava/lang/String;)Lge;")
    public final class137 method1671(byte arg0, String arg1) {
        if (arg0 != -120) {
            this.method1665(-86, (Component) null, 107, -113);
        }
        return this.method1666((byte) 124, arg1, 0, 12, 0);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IILjava/lang/String;)Lge;")
    public final class137 method1672(int arg0, int arg1, String arg2) {
        if (arg0 != -3) {
            this.method1670((String) null, (Class[]) null, (byte) -81, (Class) null);
        }
        return this.method1666((byte) 124, arg2, arg1, 1, 0);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BZLjava/awt/Component;)Lge;")
    public final class137 method1673(byte arg0, boolean arg1, Component arg2) {
        if (arg0 != 54) {
            this.method1666((byte) 8, (Object) null, -69, 100, 120);
        }
        return this.method1666((byte) 124, arg2, arg1 ? 1 : 0, 15, 0);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILjava/lang/String;)Lge;")
    public final class137 method1674(int arg0, String arg1) {
        if (arg0 != 0) {
            field4071 = 19;
        }
        return this.method1666((byte) 124, arg1, 0, 16, 0);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Lge;")
    public final class137 method1675(Class arg0, int arg1, String arg2) {
        if (arg1 != 2504) {
            field4086 = null;
        }
        return this.method1666((byte) 124, new Object[] { arg0, arg2 }, 0, 9, 0);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)Lck;")
    public final class213 method1676(int arg0) {
        int var2 = -108 / ((arg0 - 62) / 54);
        return this.field4079;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IILjava/awt/Component;Ljava/awt/Point;[II)Lge;")
    public final class137 method1677(int arg0, int arg1, Component arg2, Point arg3, int[] arg4, int arg5) {
        return arg1 == 17 ? this.method1666((byte) 124, new Object[] { arg2, arg4, arg3 }, arg0, 17, arg5) : null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Ljava/net/URL;I)Lge;")
    public final class137 method1678(URL arg0, int arg1) {
        if (arg1 != 4) {
            field4076 = null;
        }
        return this.method1666((byte) 124, arg0, 0, 4, 0);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lge;")
    public final class137 method1679(Runnable arg0, int arg1, int arg2) {
        int var4 = -121 / ((-arg1 - 69) / 41);
        return this.method1666((byte) 124, arg0, arg2, 2, 0);
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
    public class255(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field4069 = "Unknown";
        field4077 = "1.1";
        this.field4090 = arg0;
        try {
            field4069 = System.getProperty("java.vendor");
            field4077 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field4078 = System.getProperty("os.name");
        } catch (Exception var11) {
            field4078 = "Unknown";
        }
        field4084 = field4078.toLowerCase();
        try {
            field4075 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field4075 = "";
        }
        try {
            field4082 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field4082 = "";
        }
        try {
            field4076 = System.getProperty("user.home");
            if (field4076 != null) {
                field4076 = field4076 + "/";
            }
        } catch (Exception var8) {
        }
        if (field4076 == null) {
            field4076 = "~/";
        }
        try {
            this.field4081 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field4086 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field4086 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field4089 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field4089 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field4070 = false;
        this.field4074 = new Thread(this);
        this.field4074.setPriority(10);
        this.field4074.setDaemon(true);
        this.field4074.start();
    }

    static {
        new Hashtable(16);
        field4087 = 0L;
    }
}
