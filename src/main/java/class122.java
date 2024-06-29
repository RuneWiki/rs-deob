import java.applet.Applet;
import java.awt.Component;
import java.awt.EventQueue;
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

@OriginalClass("client!ca")
public class class122 implements Runnable {

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "Ldg;")
    public class168 field2017 = null;

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "Ldg;")
    public class168 field2016 = null;

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "Lvf;")
    private class60 field2019 = null;

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "Ldg;")
    public class168 field2022 = null;

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "Ljava/applet/Applet;")
    public Applet field2020 = null;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "Z")
    private boolean field2018 = false;

    @OriginalMember(owner = "client!ca", name = "s", descriptor = "Lvf;")
    private class60 field2029 = null;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field2012;

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "Ljava/lang/Thread;")
    private Thread field2026;

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "I")
    public static int field2024 = 3;

    @OriginalMember(owner = "client!ca", name = "t", descriptor = "J")
    public static volatile long field2030;

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "Ljl;")
    private class109 field2021;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "Ljava/lang/String;")
    public static String field2011;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2013;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2014;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "Ljava/lang/String;")
    public static String field2015;

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "Ljava/lang/String;")
    public static String field2023;

    @OriginalMember(owner = "client!ca", name = "q", descriptor = "Ljava/lang/String;")
    private static String field2027;

    @OriginalMember(owner = "client!ca", name = "r", descriptor = "Ljava/lang/String;")
    public static String field2028;

    @OriginalMember(owner = "client!ca", name = "u", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2031;

    @OriginalMember(owner = "client!ca", name = "v", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2032;

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "[Ldg;")
    public class168[] field2025;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IBIILjava/lang/Object;)Lvf;")
    private final class60 method925(int arg0, byte arg1, int arg2, int arg3, Object arg4) {
        class60 var6 = new class60();
        var6.field934 = arg2;
        var6.field931 = arg4;
        if (arg1 != 92) {
            this.field2016 = null;
        }
        var6.field933 = arg0;
        synchronized (this) {
            if (this.field2029 == null) {
                this.field2029 = this.field2019 = var6;
            } else {
                this.field2029.field935 = var6;
                this.field2029 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Ljava/net/URL;I)Lvf;")
    public final class60 method926(URL arg0, int arg1) {
        if (arg1 > 0) {
            this.field2020 = null;
        }
        return this.method925(4, (byte) 92, 0, 0, arg0);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
    public final void method927(int arg0) {
        if (arg0 != -15411) {
            this.field2019 = null;
        }
        field2030 = class3.method14(29853) + 5000L;
    }

    @OriginalMember(owner = "client!ca", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class60 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2018) {
                        return;
                    }
                    if (this.field2019 != null) {
                        var2 = this.field2019;
                        this.field2019 = this.field2019.field935;
                        if (this.field2019 == null) {
                            this.field2029 = null;
                        }
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var15) {
                    }
                }
            }
            try {
                int var3 = var2.field933;
                if (var3 == 1) {
                    if (field2030 > class3.method14(29853)) {
                        throw new IOException();
                    }
                    var2.field932 = new Socket(InetAddress.getByName((String) var2.field931), var2.field934);
                } else if (var3 == 2) {
                    Thread var9 = new Thread((Runnable) var2.field931);
                    var9.setDaemon(true);
                    var9.start();
                    var9.setPriority(var2.field934);
                    var2.field932 = var9;
                } else if (var3 == 4) {
                    if (class3.method14(29853) < field2030) {
                        throw new IOException();
                    }
                    var2.field932 = new DataInputStream(((URL) var2.field931).openStream());
                } else if (var3 == 8) {
                    Object[] var8 = (Object[]) var2.field931;
                    var2.field932 = ((Class) var8[0]).getDeclaredMethod((String) var8[1], (Class[]) var8[2]);
                } else if (var3 == 9) {
                    Object[] var7 = (Object[]) var2.field931;
                    var2.field932 = ((Class) var7[0]).getDeclaredField((String) var7[1]);
                } else if (var3 == 18) {
                    Clipboard var6 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field932 = var6.getContents((Object) null);
                } else if (var3 == 19) {
                    Transferable var4 = (Transferable) var2.field931;
                    Clipboard var5 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var5.setContents(var4, (ClipboardOwner) null);
                } else {
                    throw new Exception();
                }
                var2.field936 = 1;
            } catch (ThreadDeath var13) {
                throw var13;
            } catch (Throwable var14) {
                var2.field936 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Ljava/lang/Class;I)Lvf;")
    public final class60 method928(Class arg0, int arg1) {
        return arg1 == -11628 ? this.method925(11, (byte) 92, 0, 0, arg0) : null;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZLjava/lang/String;)Lvf;")
    public final class60 method929(boolean arg0, String arg1) {
        return arg0 ? this.method925(16, (byte) 92, 0, 0, arg1) : null;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Ljava/lang/String;I)Lvf;")
    public final class60 method930(String arg0, int arg1) {
        return arg1 == 0 ? this.method925(12, (byte) 92, 0, 0, arg0) : null;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)Ljl;")
    public final class109 method931(byte arg0) {
        int var2 = -107 % ((arg0 + 34) / 39);
        return this.field2021;
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)Lvf;")
    public final class60 method932(int arg0) {
        if (arg0 > -40) {
            field2031 = null;
        }
        return this.method925(18, (byte) 92, 0, 0, (Object) null);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Ljava/awt/Component;ZLjava/awt/Point;[III)Lvf;")
    public final class60 method933(Component arg0, boolean arg1, Point arg2, int[] arg3, int arg4, int arg5) {
        if (!arg1) {
            this.field2022 = null;
        }
        return this.method925(17, (byte) 92, arg5, arg4, new Object[] { arg0, arg3, arg2 });
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(BLjava/lang/Class;Ljava/lang/String;)Lvf;")
    public final class60 method934(byte arg0, Class arg1, String arg2) {
        int var4 = -45 / ((arg0 - 21) / 61);
        return this.method925(9, (byte) 92, 0, 0, new Object[] { arg1, arg2 });
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILjava/awt/datatransfer/Transferable;)Lvf;")
    public final class60 method935(int arg0, Transferable arg1) {
        return arg0 == 21211 ? this.method925(19, (byte) 92, 0, 0, arg1) : null;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IILjava/lang/String;)Lvf;")
    public final class60 method936(int arg0, int arg1, String arg2) {
        int var4 = -60 % ((arg0 + 52) / 41);
        return this.method925(1, (byte) 92, arg1, 0, arg2);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(II)Lvf;")
    public final class60 method937(int arg0, int arg1) {
        if (arg0 != 0) {
            this.field2029 = null;
        }
        return this.method925(3, (byte) 92, arg1, 0, (Object) null);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/Class;ILjava/lang/Class;)Lvf;")
    public final class60 method938(String arg0, Class[] arg1, int arg2, Class arg3) {
        return arg2 == 0 ? this.method925(8, (byte) 92, 0, 0, new Object[] { arg3, arg0, arg1 }) : null;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZLjava/lang/Class;)Lvf;")
    public final class60 method939(boolean arg0, Class arg1) {
        if (!arg0) {
            this.field2016 = null;
        }
        return this.method925(20, (byte) 92, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Ljava/awt/Component;IZ)Lvf;")
    public final class60 method940(Component arg0, int arg1, boolean arg2) {
        if (arg1 != 14455) {
            this.field2017 = null;
        }
        return this.method925(15, (byte) 92, arg2 ? 1 : 0, 0, arg0);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IILjava/lang/Runnable;)Lvf;")
    public final class60 method941(int arg0, int arg1, Runnable arg2) {
        return arg1 <= 53 ? null : this.method925(2, (byte) 92, arg0, 0, arg2);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Ljava/awt/Component;III)Lvf;")
    public final class60 method942(Component arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            Point var5 = arg0.getLocationOnScreen();
            return this.method925(14, (byte) 92, var5.x + arg3, arg1 - -var5.y, (Object) null);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "(I)V")
    public final void method943(int arg0) {
        if (arg0 != -6112) {
            this.method930((String) null, 88);
        }
        synchronized (this) {
            this.field2018 = true;
            this.notifyAll();
        }
        try {
            this.field2026.join();
        } catch (InterruptedException var8) {
        }
        if (this.field2016 != null) {
            try {
                this.field2016.method1202(arg0 + 6112);
            } catch (IOException var7) {
            }
        }
        if (this.field2022 != null) {
            try {
                this.field2022.method1202(0);
            } catch (IOException var6) {
            }
        }
        if (this.field2025 != null) {
            for (int var3 = 0; var3 < this.field2025.length; var3++) {
                if (this.field2025[var3] != null) {
                    try {
                        this.field2025[var3].method1202(0);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field2017 != null) {
            try {
                this.field2017.method1202(0);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
    public class122(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field2028 = "1.1";
        this.field2020 = arg0;
        field2014 = "Unknown";
        try {
            field2014 = System.getProperty("java.vendor");
            field2028 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field2013 = System.getProperty("os.name");
        } catch (Exception var11) {
            field2013 = "Unknown";
        }
        field2011 = field2013.toLowerCase();
        try {
            field2023 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field2023 = "";
        }
        try {
            field2015 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field2015 = "";
        }
        try {
            field2027 = System.getProperty("user.home");
            if (field2027 != null) {
                field2027 = field2027 + "/";
            }
        } catch (Exception var8) {
        }
        if (field2027 == null) {
            field2027 = "~/";
        }
        try {
            this.field2012 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field2032 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field2032 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field2031 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field2031 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field2018 = false;
        this.field2026 = new Thread(this);
        this.field2026.setPriority(10);
        this.field2026.setDaemon(true);
        this.field2026.start();
    }

    static {
        new Hashtable(16);
        field2030 = 0L;
    }
}
