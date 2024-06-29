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

@OriginalClass("client!ve")
public class class226 implements Runnable {

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "Lbc;")
    public class99 field4008 = null;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "Lbc;")
    public class99 field4009 = null;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "Lmh;")
    private class114 field4006 = null;

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "Lbc;")
    public class99 field4016 = null;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "Lmh;")
    private class114 field4013 = null;

    @OriginalMember(owner = "client!ve", name = "t", descriptor = "Ljava/applet/Applet;")
    public Applet field4024 = null;

    @OriginalMember(owner = "client!ve", name = "q", descriptor = "Z")
    private boolean field4021 = false;

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field4018;

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "Ljava/lang/Thread;")
    private Thread field4019;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
    public static int field4010 = 3;

    @OriginalMember(owner = "client!ve", name = "u", descriptor = "J")
    public static volatile long field4025;

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "Lej;")
    private class132 field4017;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "Ljava/lang/String;")
    private static String field4007;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "Ljava/lang/String;")
    public static String field4011;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "Ljava/lang/String;")
    public static String field4012;

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "Ljava/lang/String;")
    public static String field4014;

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "Ljava/lang/String;")
    public static String field4015;

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "Ljava/lang/String;")
    public static String field4020;

    @OriginalMember(owner = "client!ve", name = "r", descriptor = "Ljava/lang/String;")
    public static String field4022;

    @OriginalMember(owner = "client!ve", name = "s", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field4023;

    @OriginalMember(owner = "client!ve", name = "v", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field4026;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "[Lbc;")
    public class99[] field4005;

    @OriginalMember(owner = "client!ve", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class114 var2;
            synchronized (this) {
                while (true) {
                    if (this.field4021) {
                        return;
                    }
                    if (this.field4006 != null) {
                        var2 = this.field4006;
                        this.field4006 = this.field4006.field1995;
                        if (this.field4006 == null) {
                            this.field4013 = null;
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
                int var3 = var2.field1998;
                if (var3 == 1) {
                    if (class136.method950(8954) < field4025) {
                        throw new IOException();
                    }
                    var2.field1997 = new Socket(InetAddress.getByName((String) var2.field1999), var2.field2000);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field1999);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field2000);
                    var2.field1997 = var4;
                } else if (var3 == 4) {
                    if (field4025 > class136.method950(8954)) {
                        throw new IOException();
                    }
                    var2.field1997 = new DataInputStream(((URL) var2.field1999).openStream());
                } else if (var3 == 8) {
                    Object[] var6 = (Object[]) var2.field1999;
                    var2.field1997 = ((Class) var6[0]).getDeclaredMethod((String) var6[1], (Class[]) var6[2]);
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field1999;
                    var2.field1997 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else {
                    throw new Exception();
                }
                var2.field1996 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field1996 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BLjava/awt/Component;Z)Lmh;")
    public final class114 method1525(byte arg0, Component arg1, boolean arg2) {
        if (arg0 < 72) {
            this.method1525((byte) -115, (Component) null, false);
        }
        return this.method1529(arg1, 0, -56, arg2 ? 1 : 0, 15);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I[Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Lmh;")
    public final class114 method1526(int arg0, Class[] arg1, Class arg2, String arg3) {
        if (arg0 < 74) {
            this.method1527((byte) -9);
        }
        return this.method1529(new Object[] { arg2, arg3, arg1 }, 0, -48, 0, 8);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V")
    public final void method1527(byte arg0) {
        field4025 = class136.method950(8954) + 5000L;
        int var2 = 54 % ((arg0 + 17) / 44);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;Z)Lmh;")
    public final class114 method1528(String arg0, Class arg1, boolean arg2) {
        if (arg2) {
            this.field4005 = null;
        }
        return this.method1529(new Object[] { arg1, arg0 }, 0, -116, 0, 9);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Ljava/lang/Object;IIII)Lmh;")
    private final class114 method1529(Object arg0, int arg1, int arg2, int arg3, int arg4) {
        class114 var6 = new class114();
        var6.field1998 = arg4;
        var6.field1999 = arg0;
        var6.field2000 = arg3;
        int var7 = 39 % ((arg2 - 13) / 60);
        synchronized (this) {
            if (this.field4013 == null) {
                this.field4013 = this.field4006 = var6;
            } else {
                this.field4013.field1995 = var6;
                this.field4013 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(B)Lej;")
    public final class132 method1530(byte arg0) {
        return arg0 <= 113 ? null : this.field4017;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IILjava/lang/Runnable;)Lmh;")
    public final class114 method1531(int arg0, int arg1, Runnable arg2) {
        return arg1 > -99 ? null : this.method1529(arg2, 0, -81, arg0, 2);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IILjava/awt/Component;B)Lmh;")
    public final class114 method1532(int arg0, int arg1, Component arg2, byte arg3) {
        Point var5 = arg2.getLocationOnScreen();
        return arg3 > -107 ? null : this.method1529((Object) null, var5.y + arg1, 80, var5.x + arg0, 14);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILjava/lang/String;I)Lmh;")
    public final class114 method1533(int arg0, String arg1, int arg2) {
        if (arg0 != 0) {
            this.method1531(39, -65, (Runnable) null);
        }
        return this.method1529(arg1, 0, arg0 ^ 0xFFFFFFB4, arg2, 1);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BILjava/awt/Point;ILjava/awt/Component;[I)Lmh;")
    public final class114 method1534(byte arg0, int arg1, Point arg2, int arg3, Component arg4, int[] arg5) {
        return arg0 == -16 ? this.method1529(new Object[] { arg4, arg5, arg2 }, arg1, 97, arg3, 17) : null;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
    public final void method1535(int arg0) {
        synchronized (this) {
            this.field4021 = true;
            this.notifyAll();
        }
        try {
            this.field4019.join();
            int var3 = 93 % ((arg0 - 36) / 62);
        } catch (InterruptedException var9) {
        }
        if (this.field4009 != null) {
            try {
                this.field4009.method656(false);
            } catch (IOException var8) {
            }
        }
        if (this.field4008 != null) {
            try {
                this.field4008.method656(false);
            } catch (IOException var7) {
            }
        }
        if (this.field4005 != null) {
            for (int var4 = 0; var4 < this.field4005.length; var4++) {
                if (this.field4005[var4] != null) {
                    try {
                        this.field4005[var4].method656(false);
                    } catch (IOException var6) {
                    }
                }
            }
        }
        if (this.field4016 != null) {
            try {
                this.field4016.method656(false);
            } catch (IOException var5) {
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILjava/lang/String;)Lmh;")
    public final class114 method1536(int arg0, String arg1) {
        if (arg0 != 30581) {
            field4011 = null;
        }
        return this.method1529(arg1, 0, -83, 0, 16);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)Lmh;")
    public final class114 method1537(int arg0, int arg1) {
        if (arg0 != 0) {
            this.method1538((String) null, -73);
        }
        return this.method1529((Object) null, 0, 74, arg1, 3);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Ljava/lang/String;I)Lmh;")
    public final class114 method1538(String arg0, int arg1) {
        if (arg1 != 4) {
            this.field4013 = null;
        }
        return this.method1529(arg0, 0, -104, 0, 12);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BLjava/net/URL;)Lmh;")
    public final class114 method1539(byte arg0, URL arg1) {
        if (arg0 != -116) {
            field4025 = 47L;
        }
        return this.method1529(arg1, 0, -112, 0, 4);
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
    public class226(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        this.field4024 = arg0;
        field4020 = "Unknown";
        field4015 = "1.1";
        try {
            field4020 = System.getProperty("java.vendor");
            field4015 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field4014 = System.getProperty("os.name");
        } catch (Exception var11) {
            field4014 = "Unknown";
        }
        field4011 = field4014.toLowerCase();
        try {
            field4012 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field4012 = "";
        }
        try {
            field4022 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field4022 = "";
        }
        try {
            field4007 = System.getProperty("user.home");
            if (field4007 != null) {
                field4007 = field4007 + "/";
            }
        } catch (Exception var8) {
        }
        if (field4007 == null) {
            field4007 = "~/";
        }
        try {
            this.field4018 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field4023 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field4023 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field4026 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field4026 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field4021 = false;
        this.field4019 = new Thread(this);
        this.field4019.setPriority(10);
        this.field4019.setDaemon(true);
        this.field4019.start();
    }

    static {
        new Hashtable(16);
        field4025 = 0L;
    }
}
