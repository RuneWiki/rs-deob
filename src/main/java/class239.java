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

@OriginalClass("client!md")
public class class239 implements Runnable {

    @OriginalMember(owner = "client!md", name = "d", descriptor = "Lch;")
    public class132 field3833 = null;

    @OriginalMember(owner = "client!md", name = "h", descriptor = "Lch;")
    public class132 field3837 = null;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "Ljava/applet/Applet;")
    public Applet field3832 = null;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "Lvk;")
    private class160 field3834 = null;

    @OriginalMember(owner = "client!md", name = "m", descriptor = "Lvk;")
    private class160 field3842 = null;

    @OriginalMember(owner = "client!md", name = "s", descriptor = "Lch;")
    public class132 field3848 = null;

    @OriginalMember(owner = "client!md", name = "r", descriptor = "Z")
    private boolean field3847 = false;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field3836;

    @OriginalMember(owner = "client!md", name = "n", descriptor = "Ljava/lang/Thread;")
    private Thread field3843;

    @OriginalMember(owner = "client!md", name = "o", descriptor = "I")
    public static int field3844 = 3;

    @OriginalMember(owner = "client!md", name = "u", descriptor = "J")
    public static volatile long field3850;

    @OriginalMember(owner = "client!md", name = "f", descriptor = "Lkd;")
    private class70 field3835;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "Ljava/lang/String;")
    public static String field3830;

    @OriginalMember(owner = "client!md", name = "b", descriptor = "Ljava/lang/String;")
    public static String field3831;

    @OriginalMember(owner = "client!md", name = "j", descriptor = "Ljava/lang/String;")
    private static String field3839;

    @OriginalMember(owner = "client!md", name = "k", descriptor = "Ljava/lang/String;")
    public static String field3840;

    @OriginalMember(owner = "client!md", name = "l", descriptor = "Ljava/lang/String;")
    public static String field3841;

    @OriginalMember(owner = "client!md", name = "p", descriptor = "Ljava/lang/String;")
    public static String field3845;

    @OriginalMember(owner = "client!md", name = "q", descriptor = "Ljava/lang/String;")
    public static String field3846;

    @OriginalMember(owner = "client!md", name = "t", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field3849;

    @OriginalMember(owner = "client!md", name = "v", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field3851;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "[Lch;")
    public class132[] field3838;

    @OriginalMember(owner = "client!md", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class160 var2;
            synchronized (this) {
                while (true) {
                    if (this.field3847) {
                        return;
                    }
                    if (this.field3834 != null) {
                        var2 = this.field3834;
                        this.field3834 = this.field3834.field2397;
                        if (this.field3834 == null) {
                            this.field3842 = null;
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
                int var3 = var2.field2400;
                if (var3 == 1) {
                    if (class98.method665(true) < field3850) {
                        throw new IOException();
                    }
                    var2.field2401 = new Socket(InetAddress.getByName((String) var2.field2396), var2.field2398);
                } else if (var3 == 2) {
                    Thread var9 = new Thread((Runnable) var2.field2396);
                    var9.setDaemon(true);
                    var9.start();
                    var9.setPriority(var2.field2398);
                    var2.field2401 = var9;
                } else if (var3 == 4) {
                    if (class98.method665(true) < field3850) {
                        throw new IOException();
                    }
                    var2.field2401 = new DataInputStream(((URL) var2.field2396).openStream());
                } else if (var3 == 8) {
                    Object[] var8 = (Object[]) var2.field2396;
                    var2.field2401 = ((Class) var8[0]).getDeclaredMethod((String) var8[1], (Class[]) var8[2]);
                } else if (var3 == 9) {
                    Object[] var7 = (Object[]) var2.field2396;
                    var2.field2401 = ((Class) var7[0]).getDeclaredField((String) var7[1]);
                } else if (var3 == 18) {
                    Clipboard var6 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field2401 = var6.getContents((Object) null);
                } else if (var3 == 19) {
                    Transferable var4 = (Transferable) var2.field2396;
                    Clipboard var5 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var5.setContents(var4, (ClipboardOwner) null);
                } else {
                    throw new Exception();
                }
                var2.field2399 = 1;
            } catch (ThreadDeath var13) {
                throw var13;
            } catch (Throwable var14) {
                var2.field2399 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Z)Lkd;")
    public final class70 method1670(boolean arg0) {
        if (arg0) {
            this.method1682(-128, (Component) null, -98, (Point) null, (byte) -14, (int[]) null);
        }
        return this.field3835;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Ljava/awt/Component;IZ)Lvk;")
    public final class160 method1671(Component arg0, int arg1, boolean arg2) {
        if (arg1 > -91) {
            this.field3834 = null;
        }
        return this.method1678(arg2 ? 1 : 0, false, 15, 0, arg0);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)Lvk;")
    public final class160 method1672(int arg0) {
        if (arg0 != 8770) {
            field3846 = null;
        }
        return this.method1678(0, false, 18, 0, (Object) null);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ILjava/awt/datatransfer/Transferable;)Lvk;")
    public final class160 method1673(int arg0, Transferable arg1) {
        if (arg0 != 18292) {
            this.field3835 = null;
        }
        return this.method1678(0, false, 19, 0, arg1);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ILjava/awt/Component;II)Lvk;")
    public final class160 method1674(int arg0, Component arg1, int arg2, int arg3) {
        if (arg0 != 0) {
            this.method1676(63, (Class) null);
        }
        Point var5 = arg1.getLocationOnScreen();
        return this.method1678(var5.x + arg2, false, 14, var5.y + arg3, (Object) null);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IZ)Lvk;")
    public final class160 method1675(int arg0, boolean arg1) {
        if (!arg1) {
            field3844 = 75;
        }
        return this.method1678(arg0, false, 3, 0, (Object) null);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ILjava/lang/Class;)Lvk;")
    public final class160 method1676(int arg0, Class arg1) {
        if (arg0 != -8877) {
            field3844 = 75;
        }
        return this.method1678(0, false, 20, 0, arg1);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ILjava/net/URL;)Lvk;")
    public final class160 method1677(int arg0, URL arg1) {
        int var3 = -78 % ((-arg0 - 37) / 43);
        return this.method1678(0, false, 4, 0, arg1);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IZIILjava/lang/Object;)Lvk;")
    private final class160 method1678(int arg0, boolean arg1, int arg2, int arg3, Object arg4) {
        if (arg1) {
            return null;
        }
        class160 var6 = new class160();
        var6.field2400 = arg2;
        var6.field2396 = arg4;
        var6.field2398 = arg0;
        synchronized (this) {
            if (this.field3842 == null) {
                this.field3842 = this.field3834 = var6;
            } else {
                this.field3842.field2397 = var6;
                this.field3842 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Ljava/lang/Class;B)Lvk;")
    public final class160 method1679(Class arg0, byte arg1) {
        if (arg1 != 17) {
            this.method1672(104);
        }
        return this.method1678(0, false, 11, 0, arg0);
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(I)V")
    public final void method1680(int arg0) {
        if (arg0 != 0) {
            this.field3834 = null;
        }
        synchronized (this) {
            this.field3847 = true;
            this.notifyAll();
        }
        try {
            this.field3843.join();
        } catch (InterruptedException var8) {
        }
        if (this.field3833 != null) {
            try {
                this.field3833.method841(-976);
            } catch (IOException var7) {
            }
        }
        if (this.field3848 != null) {
            try {
                this.field3848.method841(-976);
            } catch (IOException var6) {
            }
        }
        if (this.field3838 != null) {
            for (int var3 = 0; var3 < this.field3838.length; var3++) {
                if (this.field3838[var3] != null) {
                    try {
                        this.field3838[var3].method841(-976);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field3837 != null) {
            try {
                this.field3837.method841(-976);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(I)V")
    public final void method1681(int arg0) {
        field3850 = class98.method665(true) + 5000L;
        int var2 = -20 / ((arg0 + 17) / 34);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ILjava/awt/Component;ILjava/awt/Point;B[I)Lvk;")
    public final class160 method1682(int arg0, Component arg1, int arg2, Point arg3, byte arg4, int[] arg5) {
        int var7 = 111 % ((arg4 - 16) / 45);
        return this.method1678(arg0, false, 17, arg2, new Object[] { arg1, arg5, arg3 });
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;B[Ljava/lang/Class;)Lvk;")
    public final class160 method1683(Class arg0, String arg1, byte arg2, Class[] arg3) {
        if (arg2 <= 46) {
            field3831 = null;
        }
        return this.method1678(0, false, 8, 0, new Object[] { arg0, arg1, arg3 });
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lvk;")
    public final class160 method1684(int arg0, Runnable arg1, int arg2) {
        if (arg0 != 0) {
            this.method1674(11, (Component) null, 47, 111);
        }
        return this.method1678(arg2, false, 2, 0, arg1);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IILjava/lang/String;)Lvk;")
    public final class160 method1685(int arg0, int arg1, String arg2) {
        return arg0 < 99 ? null : this.method1678(arg1, false, 1, 0, arg2);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BLjava/lang/String;)Lvk;")
    public final class160 method1686(byte arg0, String arg1) {
        return arg0 <= 109 ? null : this.method1678(0, false, 16, 0, arg1);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Ljava/lang/String;Z)Lvk;")
    public final class160 method1687(String arg0, boolean arg1) {
        if (arg1) {
            this.method1676(-118, (Class) null);
        }
        return this.method1678(0, false, 12, 0, arg0);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I)Lvk;")
    public final class160 method1688(String arg0, Class arg1, int arg2) {
        return arg2 > -50 ? null : this.method1678(0, false, 9, 0, new Object[] { arg1, arg0 });
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
    public class239(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        this.field3832 = arg0;
        field3831 = "1.1";
        field3841 = "Unknown";
        try {
            field3841 = System.getProperty("java.vendor");
            field3831 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field3846 = System.getProperty("os.name");
        } catch (Exception var11) {
            field3846 = "Unknown";
        }
        field3830 = field3846.toLowerCase();
        try {
            field3845 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field3845 = "";
        }
        try {
            field3840 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field3840 = "";
        }
        try {
            field3839 = System.getProperty("user.home");
            if (field3839 != null) {
                field3839 = field3839 + "/";
            }
        } catch (Exception var8) {
        }
        if (field3839 == null) {
            field3839 = "~/";
        }
        try {
            this.field3836 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field3849 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field3849 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field3851 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field3851 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field3847 = false;
        this.field3843 = new Thread(this);
        this.field3843.setPriority(10);
        this.field3843.setDaemon(true);
        this.field3843.start();
    }

    static {
        new Hashtable(16);
        field3850 = 0L;
    }
}
