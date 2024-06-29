import java.applet.Applet;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.Transferable;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public class class469 implements Runnable {

    @OriginalMember(owner = "client!hu", name = "c", descriptor = "Z")
    private boolean field6844 = false;

    @OriginalMember(owner = "client!hu", name = "k", descriptor = "Lme;")
    public class497 field6852 = null;

    @OriginalMember(owner = "client!hu", name = "q", descriptor = "Lhh;")
    private class125 field6858 = null;

    @OriginalMember(owner = "client!hu", name = "t", descriptor = "Ljava/applet/Applet;")
    public Applet field6861 = null;

    @OriginalMember(owner = "client!hu", name = "r", descriptor = "Lhh;")
    private class125 field6859 = null;

    @OriginalMember(owner = "client!hu", name = "o", descriptor = "Lme;")
    public class497 field6856 = null;

    @OriginalMember(owner = "client!hu", name = "u", descriptor = "Lme;")
    public class497 field6862 = null;

    @OriginalMember(owner = "client!hu", name = "d", descriptor = "I")
    private int field6845;

    @OriginalMember(owner = "client!hu", name = "e", descriptor = "Ljava/lang/String;")
    private String field6846;

    @OriginalMember(owner = "client!hu", name = "h", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field6849;

    @OriginalMember(owner = "client!hu", name = "s", descriptor = "Ljava/lang/Thread;")
    private Thread field6860;

    @OriginalMember(owner = "client!hu", name = "m", descriptor = "I")
    public static int field6854 = 3;

    @OriginalMember(owner = "client!hu", name = "l", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field6853 = new Hashtable(16);

    @OriginalMember(owner = "client!hu", name = "y", descriptor = "J")
    public static volatile long field6866 = 0L;

    @OriginalMember(owner = "client!hu", name = "p", descriptor = "Lgq;")
    private class531 field6857;

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "Ljava/lang/String;")
    public static String field6842;

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "Ljava/lang/String;")
    public static String field6843;

    @OriginalMember(owner = "client!hu", name = "f", descriptor = "Ljava/lang/String;")
    public static String field6847;

    @OriginalMember(owner = "client!hu", name = "g", descriptor = "Ljava/lang/String;")
    private static String field6848;

    @OriginalMember(owner = "client!hu", name = "i", descriptor = "Ljava/lang/String;")
    public static String field6850;

    @OriginalMember(owner = "client!hu", name = "j", descriptor = "Ljava/lang/String;")
    public static String field6851;

    @OriginalMember(owner = "client!hu", name = "n", descriptor = "Ljava/lang/String;")
    public static String field6855;

    @OriginalMember(owner = "client!hu", name = "w", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field6864;

    @OriginalMember(owner = "client!hu", name = "x", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field6865;

    @OriginalMember(owner = "client!hu", name = "v", descriptor = "[Lme;")
    public class497[] field6863;

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(I)Lhh;", line = 3)
    public final class125 method2790(int arg0) {
        if (arg0 != 5) {
            this.method2809(null, -112);
        }
        return this.method2803(arg0 ^ 0x2715, null, 0, 0, 5);
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;", line = 13)
    public final File method2791(String arg0, int arg1) {
        if (arg1 != 3) {
            method2797(79, (byte) 13, null, null);
        }
        return method2797(this.field6845, (byte) 26, this.field6846, arg0);
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lhh;", line = 24)
    public final class125 method2792(int arg0, Runnable arg1, int arg2) {
        return arg2 == -10265 ? this.method2803(10000, arg1, arg0, 0, 2) : null;
    }

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "(I)V", line = 35)
    public final void method2793(int arg0) {
        synchronized (this) {
            this.field6844 = true;
            this.notifyAll();
        }
        try {
            this.field6860.join();
            if (arg0 != 3584) {
                this.method2801(null, -115);
            }
        } catch (InterruptedException var8) {
        }
        if (this.field6852 != null) {
            try {
                this.field6852.method2961((byte) -27);
            } catch (IOException var7) {
            }
        }
        if (this.field6856 != null) {
            try {
                this.field6856.method2961((byte) -27);
            } catch (IOException var6) {
            }
        }
        if (this.field6863 != null) {
            for (int var3 = 0; var3 < this.field6863.length; var3++) {
                if (this.field6863[var3] != null) {
                    try {
                        this.field6863[var3].method2961((byte) -27);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field6862 != null) {
            try {
                this.field6862.method2961((byte) -27);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(B)Z", line = 90)
    public final boolean method2794(byte arg0) {
        return arg0 < 120;
    }

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "(B)Lgq;", line = 108)
    public final class531 method2795(byte arg0) {
        if (arg0 != -83) {
            this.method2813(null, (byte) -107);
        }
        return this.field6857;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(Ljava/lang/Class;Z)V", line = 119)
    public final void method2796(Class arg0, boolean arg1) throws Exception {
        if (arg1) {
            return;
        }
        Class[] var3 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
        Runtime var4 = Runtime.getRuntime();
        Method var5 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
        if (!field6843.startsWith("mac")) {
            Method var6 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", var3);
            var5.invoke(var6, Boolean.TRUE);
            var6.invoke(var4, arg0, "jawt");
            var5.invoke(var6, Boolean.FALSE);
        }
        Method var7 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", var3);
        var5.invoke(var7, Boolean.TRUE);
        if (!field6843.startsWith("win")) {
            throw new Exception();
        }
        var7.invoke(var4, arg0, this.method2791("sw3d.dll", 3).toString());
        var5.invoke(var7, Boolean.FALSE);
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(IBLjava/lang/String;Ljava/lang/String;)Ljava/io/File;", line = 155)
    public static final File method2797(int arg0, byte arg1, String arg2, String arg3) {
        File var4 = (File) field6853.get(arg3);
        if (var4 != null) {
            return var4;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field6848, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < var6.length; var8++) {
                for (int var9 = 0; var9 < var5.length; var9++) {
                    String var10 = var5[var9] + var6[var8] + "/" + (arg2 == null ? "" : arg2 + "/") + arg3;
                    RandomAccessFile var11 = null;
                    try {
                        File var12 = new File(var10);
                        if (var7 != 0 || var12.exists()) {
                            String var13 = var5[var9];
                            if (var7 != 1 || var13.length() <= 0 || (new File(var13)).exists()) {
                                (new File(var5[var9] + var6[var8])).mkdir();
                                if (arg2 != null) {
                                    (new File(var5[var9] + var6[var8] + "/" + arg2)).mkdir();
                                }
                                var11 = new RandomAccessFile(var12, "rw");
                                int var14 = var11.read();
                                var11.seek(0L);
                                var11.write(var14);
                                var11.seek(0L);
                                var11.close();
                                field6853.put(arg3, var12);
                                return var12;
                            }
                        }
                    } catch (Exception var17) {
                        try {
                            if (var11 != null) {
                                var11.close();
                                Object var15 = null;
                            }
                        } catch (Exception var16) {
                        }
                    }
                }
            }
        }
        if (arg1 == 26) {
            throw new RuntimeException();
        }
        return null;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(B[Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Lhh;", line = 249)
    public final class125 method2798(byte arg0, Class[] arg1, String arg2, Class arg3) {
        if (arg0 >= -2) {
            this.method2818(98);
        }
        return this.method2803(10000, new Object[] { arg3, arg2, arg1 }, 0, 0, 8);
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;B)Lhh;", line = 259)
    public final class125 method2799(Transferable arg0, byte arg1) {
        if (arg1 >= -54) {
            field6854 = -87;
        }
        return this.method2803(10000, arg0, 0, 0, 19);
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(ILjava/net/URL;)Lhh;", line = 275)
    public final class125 method2800(int arg0, URL arg1) {
        if (arg0 != 0) {
            this.field6860 = null;
        }
        return this.method2803(10000, arg1, 0, 0, 4);
    }

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "(Ljava/lang/String;I)[B", line = 285)
    public final byte[] method2801(String arg0, int arg1) {
        class125 var3 = this.method2805(arg1, 0, arg0, false, 0);
        return (byte[]) var3.field1793;
    }

    @OriginalMember(owner = "client!hu", name = "c", descriptor = "(B)V", line = 297)
    public final void method2802(byte arg0) {
        field6866 = class264.method1698(true) + 5000L;
        int var2 = -82 / ((-arg0 - 40) / 51);
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(ILjava/lang/Object;III)Lhh;", line = 311)
    private final class125 method2803(int arg0, Object arg1, int arg2, int arg3, int arg4) {
        class125 var6 = new class125();
        var6.field1795 = arg2;
        var6.field1792 = arg1;
        if (arg0 != 10000) {
            return null;
        }
        var6.field1794 = arg4;
        synchronized (this) {
            if (this.field6858 == null) {
                this.field6858 = this.field6859 = var6;
            } else {
                this.field6858.field1790 = var6;
                this.field6858 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!hu", name = "c", descriptor = "(Ljava/lang/String;I)Lhh;", line = 342)
    public final class125 method2804(String arg0, int arg1) {
        if (arg1 != 24678) {
            this.field6863 = null;
        }
        return this.method2803(10000, arg0, 0, 0, 16);
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(IILjava/lang/Object;ZI)Lhh;", line = 355)
    private final class125 method2805(int arg0, int arg1, Object arg2, boolean arg3, int arg4) {
        class125 var6 = new class125();
        synchronized (var6) {
            var6.field1794 = arg0;
            var6.field1792 = arg2;
            var6.field1795 = arg1;
            synchronized (this) {
                if (arg3) {
                    return null;
                }
                if (this.field6858 == null) {
                    this.field6858 = this.field6859 = var6;
                } else {
                    this.field6858.field1790 = var6;
                    this.field6858 = var6;
                }
                this.notify();
            }
            try {
                var6.wait();
            } catch (InterruptedException var14) {
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!hu", name = "run", descriptor = "()V", line = 392)
    public final void run() {
        while (true) {
            class125 var2;
            synchronized (this) {
                while (true) {
                    if (this.field6844) {
                        return;
                    }
                    if (this.field6859 != null) {
                        var2 = this.field6859;
                        this.field6859 = this.field6859.field1790;
                        if (this.field6859 == null) {
                            this.field6858 = null;
                        }
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var17) {
                    }
                }
            }
            try {
                int var3 = var2.field1794;
                if (var3 == 1) {
                    if (class264.method1698(true) < field6866) {
                        throw new IOException();
                    }
                    var2.field1793 = new Socket(InetAddress.getByName((String) var2.field1792), var2.field1795);
                } else if (var3 == 2) {
                    Thread var9 = new Thread((Runnable) var2.field1792);
                    var9.setDaemon(true);
                    var9.start();
                    var9.setPriority(var2.field1795);
                    var2.field1793 = var9;
                } else if (var3 == 4) {
                    if (field6866 > class264.method1698(true)) {
                        throw new IOException();
                    }
                    var2.field1793 = new DataInputStream(((URL) var2.field1792).openStream());
                } else if (var3 == 8) {
                    Object[] var8 = (Object[]) var2.field1792;
                    var2.field1793 = ((Class) var8[0]).getDeclaredMethod((String) var8[1], (Class[]) var8[2]);
                } else if (var3 == 9) {
                    Object[] var7 = (Object[]) var2.field1792;
                    var2.field1793 = ((Class) var7[0]).getDeclaredField((String) var7[1]);
                } else if (var3 == 18) {
                    Clipboard var6 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field1793 = var6.getContents(null);
                } else if (var3 == 19) {
                    Transferable var4 = (Transferable) var2.field1792;
                    Clipboard var5 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var5.setContents(var4, null);
                } else {
                    throw new Exception("");
                }
                var2.field1791 = 1;
            } catch (ThreadDeath var15) {
                throw var15;
            } catch (Throwable var16) {
                var2.field1791 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!hu", name = "d", descriptor = "(Ljava/lang/String;I)Lhh;", line = 511)
    public final class125 method2806(String arg0, int arg1) {
        if (arg1 >= -90) {
            this.field6857 = null;
        }
        return this.method2803(10000, arg0, 0, 0, 21);
    }

    @OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V", line = 682)
    public class469(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        this.field6861 = arg0;
        field6855 = "Unknown";
        this.field6845 = arg1;
        this.field6846 = arg2;
        field6851 = "1.1";
        try {
            field6855 = System.getProperty("java.vendor");
            field6851 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field6842 = System.getProperty("os.name");
        } catch (Exception var11) {
            field6842 = "Unknown";
        }
        field6843 = field6842.toLowerCase();
        try {
            field6847 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field6847 = "";
        }
        try {
            field6850 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field6850 = "";
        }
        try {
            field6848 = System.getProperty("user.home");
            if (field6848 != null) {
                field6848 = field6848 + "/";
            }
        } catch (Exception var8) {
        }
        if (field6848 == null) {
            field6848 = "~/";
        }
        try {
            this.field6849 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field6864 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field6864 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field6865 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field6865 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field6844 = false;
        this.field6860 = new Thread(this);
        this.field6860.setPriority(10);
        this.field6860.setDaemon(true);
        this.field6860.start();
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(ILjava/lang/Class;Ljava/lang/String;)Lhh;", line = 527)
    public final class125 method2807(int arg0, Class arg1, String arg2) {
        return arg0 == 15 ? this.method2803(10000, new Object[] { arg1, arg2 }, 0, 0, 9) : null;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "([IILjava/awt/Point;Ljava/awt/Component;II)Lhh;", line = 538)
    public final class125 method2808(int[] arg0, int arg1, Point arg2, Component arg3, int arg4, int arg5) {
        if (arg1 != 19865) {
            this.field6862 = null;
        }
        return this.method2803(arg1 ^ 0x6A89, new Object[] { arg3, arg0, arg2 }, arg5, arg4, 17);
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(Ljava/lang/Class;I)Lhh;", line = 549)
    public final class125 method2809(Class arg0, int arg1) {
        if (arg1 != -31183) {
            field6842 = null;
        }
        return this.method2803(10000, arg0, 0, 0, 11);
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(IIIBI)Lhh;", line = 561)
    public final class125 method2810(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 != -30) {
            field6847 = null;
        }
        return this.method2803(10000, null, (arg1 << 16) + arg2, (arg4 << 16) + arg0, 6);
    }

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "(Ljava/lang/Class;I)Lhh;", line = 583)
    public final class125 method2811(Class arg0, int arg1) {
        return arg1 == 0 ? this.method2803(arg1 ^ 0x2710, arg0, 0, 0, 20) : null;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(ZLjava/awt/Frame;)Lhh;", line = 597)
    public final class125 method2812(boolean arg0, Frame arg1) {
        if (arg0) {
            field6843 = null;
        }
        return this.method2803(10000, arg1, 0, 0, 7);
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(Ljava/lang/String;B)Lhh;", line = 610)
    public final class125 method2813(String arg0, byte arg1) {
        int var3 = -111 / ((arg1 + 32) / 60);
        return this.method2803(10000, arg0, 0, 0, 12);
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(ILjava/lang/String;I)Lhh;", line = 619)
    public final class125 method2814(int arg0, String arg1, int arg2) {
        if (arg2 != 0) {
            this.method2809(null, -45);
        }
        return this.method2803(10000, arg1, arg0, 0, 1);
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(ILjava/awt/Component;II)Lhh;", line = 629)
    public final class125 method2815(int arg0, Component arg1, int arg2, int arg3) {
        Point var5 = arg1.getLocationOnScreen();
        if (arg0 != 27730) {
            this.field6857 = null;
        }
        return this.method2803(arg0 - 17730, null, var5.x + arg2, var5.y + arg3, 14);
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(Ljava/awt/Component;ZI)Lhh;", line = 644)
    public final class125 method2816(Component arg0, boolean arg1, int arg2) {
        return arg2 == 0 ? this.method2803(10000, arg0, arg1 ? 1 : 0, 0, 15) : null;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(II)Lhh;", line = 669)
    public final class125 method2817(int arg0, int arg1) {
        if (arg1 != 16) {
            field6854 = -29;
        }
        return this.method2803(arg1 + 9984, null, arg0, 0, 3);
    }

    @OriginalMember(owner = "client!hu", name = "c", descriptor = "(I)Lhh;", line = 760)
    public final class125 method2818(int arg0) {
        if (arg0 != 1) {
            this.method2791(null, -20);
        }
        return this.method2803(10000, null, 0, 0, 18);
    }
}
