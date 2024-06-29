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
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class135 implements Runnable {

    @OriginalMember(owner = "client!rp", name = "j", descriptor = "Lac;")
    public class216 field1921 = null;

    @OriginalMember(owner = "client!rp", name = "e", descriptor = "Lac;")
    public class216 field1916 = null;

    @OriginalMember(owner = "client!rp", name = "h", descriptor = "Z")
    private boolean field1919 = false;

    @OriginalMember(owner = "client!rp", name = "k", descriptor = "Ljg;")
    private class246 field1922 = null;

    @OriginalMember(owner = "client!rp", name = "r", descriptor = "Z")
    public boolean field1929 = false;

    @OriginalMember(owner = "client!rp", name = "y", descriptor = "Z")
    public boolean field1936 = false;

    @OriginalMember(owner = "client!rp", name = "w", descriptor = "Lac;")
    public class216 field1934 = null;

    @OriginalMember(owner = "client!rp", name = "v", descriptor = "Ljg;")
    private class246 field1933 = null;

    @OriginalMember(owner = "client!rp", name = "p", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field1927;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "[Lac;")
    public class216[] field1912;

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "Ljava/lang/Object;")
    private Object field1914;

    @OriginalMember(owner = "client!rp", name = "i", descriptor = "Ljava/lang/Object;")
    private Object field1920;

    @OriginalMember(owner = "client!rp", name = "s", descriptor = "Lnb;")
    private class98 field1930;

    @OriginalMember(owner = "client!rp", name = "t", descriptor = "Ljava/lang/Object;")
    private Object field1931;

    @OriginalMember(owner = "client!rp", name = "x", descriptor = "Lsda;")
    private class753 field1935;

    @OriginalMember(owner = "client!rp", name = "l", descriptor = "Ljava/lang/Thread;")
    private Thread field1923;

    @OriginalMember(owner = "client!rp", name = "m", descriptor = "J")
    private static volatile long field1924 = 0L;

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "I")
    private static int field1913;

    // $FF: synthetic field
    @OriginalMember(owner = "client!rp", name = "C", descriptor = "Ljava/lang/Class;")
    public static Class field1940;

    // $FF: synthetic field
    @OriginalMember(owner = "client!rp", name = "D", descriptor = "Ljava/lang/Class;")
    public static Class field1941;

    // $FF: synthetic field
    @OriginalMember(owner = "client!rp", name = "E", descriptor = "Ljava/lang/Class;")
    public static Class field1942;

    // $FF: synthetic field
    @OriginalMember(owner = "client!rp", name = "F", descriptor = "Ljava/lang/Class;")
    public static Class field1943;

    @OriginalMember(owner = "client!rp", name = "d", descriptor = "Ljava/lang/String;")
    public static String field1915;

    @OriginalMember(owner = "client!rp", name = "f", descriptor = "Ljava/lang/String;")
    private static String field1917;

    @OriginalMember(owner = "client!rp", name = "n", descriptor = "Ljava/lang/String;")
    public static String field1925;

    @OriginalMember(owner = "client!rp", name = "o", descriptor = "Ljava/lang/String;")
    private static String field1926;

    @OriginalMember(owner = "client!rp", name = "u", descriptor = "Ljava/lang/String;")
    public static String field1932;

    @OriginalMember(owner = "client!rp", name = "z", descriptor = "Ljava/lang/String;")
    public static String field1937;

    @OriginalMember(owner = "client!rp", name = "A", descriptor = "Ljava/lang/String;")
    public static String field1938;

    @OriginalMember(owner = "client!rp", name = "B", descriptor = "Ljava/lang/String;")
    private static String field1939;

    @OriginalMember(owner = "client!rp", name = "g", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1918;

    @OriginalMember(owner = "client!rp", name = "q", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1928;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(B)Z")
    public final boolean method854(byte arg0) {
        if (arg0 != -123) {
            this.field1922 = null;
        }
        if (!this.field1936) {
            return false;
        } else if (this.field1929) {
            return this.field1930 != null;
        } else {
            return this.field1920 != null;
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Ljava/lang/String;B)Lac;")
    public static final class216 method855(String arg0, byte arg1) {
        if (arg1 != 89) {
            method855(null, (byte) 102);
        }
        return method857(field1913, arg0, (byte) -122, field1926);
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(II)Ljg;")
    public final class246 method856(int arg0, int arg1) {
        return arg0 == 3 ? this.method871(true, 0, 3, null, arg1) : null;
    }

    @OriginalMember(owner = "client!rp", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class246 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1919) {
                        return;
                    }
                    if (this.field1922 != null) {
                        var2 = this.field1922;
                        this.field1922 = this.field1922.field3639;
                        if (this.field1922 == null) {
                            this.field1933 = null;
                        }
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var30) {
                    }
                }
            }
            try {
                int var3 = var2.field3636;
                if (var3 == 1) {
                    if (field1924 > class97.method664((byte) -50)) {
                        throw new IOException();
                    }
                    var2.field3638 = new Socket(InetAddress.getByName((String) var2.field3635), var2.field3637);
                } else if (var3 == 22) {
                    if (field1924 > class97.method664((byte) -50)) {
                        throw new IOException();
                    }
                    try {
                        var2.field3638 = class402.method2515(89, (String) var2.field3635, var2.field3637).method1178(-17396);
                    } catch (class119 var29) {
                        var2.field3638 = var29.getMessage();
                        throw var29;
                    }
                } else if (var3 == 2) {
                    Thread var23 = new Thread((Runnable) var2.field3635);
                    var23.setDaemon(true);
                    var23.start();
                    var23.setPriority(var2.field3637);
                    var2.field3638 = var23;
                } else if (var3 == 4) {
                    if (field1924 > class97.method664((byte) -50)) {
                        throw new IOException();
                    }
                    var2.field3638 = new DataInputStream(((URL) var2.field3635).openStream());
                } else if (var3 == 8) {
                    Object[] var5 = (Object[]) var2.field3635;
                    if (this.field1936 && ((Class) var5[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field3638 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 9) {
                    Object[] var6 = (Object[]) var2.field3635;
                    if (this.field1936 && ((Class) var6[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field3638 = ((Class) var6[0]).getDeclaredField((String) var6[1]);
                } else if (var3 == 18) {
                    Clipboard var7 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field3638 = var7.getContents(null);
                } else if (var3 == 19) {
                    Transferable var21 = (Transferable) var2.field3635;
                    Clipboard var22 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var22.setContents(var21, null);
                } else if (!this.field1936) {
                    throw new Exception("");
                } else if (var3 == 3) {
                    if (class97.method664((byte) -50) < field1924) {
                        throw new IOException();
                    }
                    String var20 = (var2.field3637 >> 24 & 0xFF) + "." + ((var2.field3637 & 0xFFF5BF) >> 16) + "." + (var2.field3637 >> 8 & 0xFF) + "." + (var2.field3637 & 0xFF);
                    var2.field3638 = InetAddress.getByName(var20).getHostName();
                } else if (var3 == 21) {
                    if (class97.method664((byte) -50) < field1924) {
                        throw new IOException();
                    }
                    var2.field3638 = InetAddress.getByName((String) var2.field3635).getAddress();
                } else if (var3 == 5) {
                    if (this.field1929) {
                        var2.field3638 = this.field1930.method666(108);
                    } else {
                        var2.field3638 = Class.forName("nu").getMethod("listmodes").invoke(this.field1920);
                    }
                } else if (var3 == 6) {
                    Frame var19 = new Frame("Jagex Full Screen");
                    var2.field3638 = var19;
                    var19.setResizable(false);
                    if (this.field1929) {
                        this.field1930.method667(var19, var2.field3634 & 0xFFFF, var2.field3637 >>> 16, 29, var2.field3637 & 0xFFFF, var2.field3634 >> 16);
                    } else {
                        Class.forName("nu").getMethod("enter", field1943 == null ? (field1943 = method874("java.awt.Frame")) : field1943, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.field1920, var19, Integer.valueOf(var2.field3637 >>> 16), new Integer(var2.field3637 & 0xFFFF), Integer.valueOf(var2.field3634 >> 16), new Integer(var2.field3634 & 0xFFFF));
                    }
                } else if (var3 == 7) {
                    if (this.field1929) {
                        this.field1930.method668(77, (Frame) var2.field3635);
                    } else {
                        Class.forName("nu").getMethod("exit").invoke(this.field1920);
                    }
                } else if (var3 == 12) {
                    class216 var8 = method857(field1913, (String) var2.field3635, (byte) -113, field1926);
                    var2.field3638 = var8;
                } else if (var3 == 13) {
                    class216 var18 = method857(field1913, (String) var2.field3635, (byte) -102, "");
                    var2.field3638 = var18;
                } else if (this.field1936 && var3 == 14) {
                    int var16 = var2.field3637;
                    int var17 = var2.field3634;
                    if (this.field1929) {
                        this.field1935.method4179(var17, var16, 121);
                    } else {
                        Class.forName("lha").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.field1931, Integer.valueOf(var16), new Integer(var17));
                    }
                } else if (this.field1936 && var3 == 15) {
                    boolean var9 = var2.field3637 != 0;
                    Component var10 = (Component) var2.field3635;
                    if (this.field1929) {
                        this.field1935.method4180(var10, var9, false);
                    } else {
                        Class.forName("lha").getDeclaredMethod("showcursor", field1940 == null ? (field1940 = method874("java.awt.Component")) : field1940, Boolean.TYPE).invoke(this.field1931, var10, Boolean.valueOf(var9));
                    }
                } else if (!this.field1929 && var3 == 17) {
                    Object[] var15 = (Object[]) var2.field3635;
                    Class.forName("lha").getDeclaredMethod("setcustomcursor", field1940 == null ? (field1940 = method874("java.awt.Component")) : field1940, field1941 == null ? (field1941 = method874("[I")) : field1941, Integer.TYPE, Integer.TYPE, field1942 == null ? (field1942 = method874("java.awt.Point")) : field1942).invoke(this.field1931, (Component) var15[0], (int[]) var15[1], Integer.valueOf(var2.field3637), new Integer(var2.field3634), (Point) var15[2]);
                } else if (var3 == 16) {
                    try {
                        if (!field1937.startsWith("win")) {
                            throw new Exception();
                        }
                        String var11 = (String) var2.field3635;
                        if (!var11.startsWith("http://") && !var11.startsWith("https://")) {
                            throw new Exception();
                        }
                        String var12 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                        int var13 = 0;
                        while (true) {
                            if (var13 >= var11.length()) {
                                Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var11 + "\"");
                                var2.field3638 = null;
                                break;
                            }
                            if (var12.indexOf(var11.charAt(var13)) == -1) {
                                throw new Exception();
                            }
                            var13++;
                        }
                    } catch (Exception var31) {
                        var2.field3638 = var31;
                        throw var31;
                    }
                } else {
                    throw new Exception("");
                }
                var2.field3633 = 1;
            } catch (ThreadDeath var32) {
                throw var32;
            } catch (Throwable var33) {
                var2.field3633 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(ILjava/lang/String;BLjava/lang/String;)Lac;")
    private static final class216 method857(int arg0, String arg1, byte arg2, String arg3) {
        String var4;
        if (arg0 == 33) {
            var4 = "jagex_" + arg3 + "_preferences" + arg1 + "_rc.dat";
        } else if (arg0 == 34) {
            var4 = "jagex_" + arg3 + "_preferences" + arg1 + "_wip.dat";
        } else {
            var4 = "jagex_" + arg3 + "_preferences" + arg1 + ".dat";
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", field1939, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
        int var6 = 0;
        if (arg2 >= -84) {
            method855(null, (byte) -35);
        }
        while (var6 < var5.length) {
            String var7 = var5[var6];
            if (var7.length() <= 0 || (new File(var7)).exists()) {
                try {
                    return new class216(new File(var7, var4), "rw", 10000L);
                } catch (Exception var9) {
                }
            }
            var6++;
        }
        return null;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I)Ljg;")
    public final class246 method858(String arg0, Class arg1, int arg2) {
        return arg2 == -10027 ? this.method871(true, 0, 9, new Object[] { arg1, arg0 }, 0) : null;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Ljava/net/URL;B)Ljg;")
    public final class246 method859(URL arg0, byte arg1) {
        return arg1 >= -127 ? null : this.method871(true, 0, 4, arg0, 0);
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(I)V")
    public final void method860(int arg0) {
        synchronized (this) {
            this.field1919 = true;
            this.notifyAll();
        }
        try {
            this.field1923.join();
            if (arg0 != 0) {
                this.method870((byte) 12, null);
            }
        } catch (InterruptedException var8) {
        }
        if (this.field1921 != null) {
            try {
                this.field1921.method1273(arg0 ^ 0x3E);
            } catch (IOException var7) {
            }
        }
        if (this.field1916 != null) {
            try {
                this.field1916.method1273(114);
            } catch (IOException var6) {
            }
        }
        if (this.field1912 != null) {
            for (int var3 = 0; var3 < this.field1912.length; var3++) {
                if (this.field1912[var3] != null) {
                    try {
                        this.field1912[var3].method1273(-73);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field1934 != null) {
            try {
                this.field1934.method1273(73);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "(I)Ljava/lang/Object;")
    public final Object method861(int arg0) {
        return arg0 == -1 ? this.field1914 : null;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Ljava/lang/String;BIZ)Ljg;")
    public final class246 method862(String arg0, byte arg1, int arg2, boolean arg3) {
        if (arg1 != -84) {
            this.method870((byte) -13, null);
        }
        return this.method871(true, 0, arg3 ? 22 : 1, arg0, arg2);
    }

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "(B)Ljg;")
    public final class246 method863(byte arg0) {
        if (arg0 != -124) {
            this.method860(6);
        }
        return this.method871(true, 0, 5, null, 0);
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;I)Ljg;")
    public final class246 method864(String arg0, Class[] arg1, Class arg2, int arg3) {
        if (arg3 != 21410) {
            this.method867(null, -75, null, 115, null, 119);
        }
        return this.method871(true, 0, 8, new Object[] { arg2, arg0, arg1 }, 0);
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(B[BLjava/io/File;)Z")
    public final boolean method865(byte arg0, byte[] arg1, File arg2) {
        try {
            FileOutputStream var4 = new FileOutputStream(arg2);
            var4.write(arg1, 0, arg1.length);
            if (arg0 > -77) {
                return false;
            } else {
                var4.close();
                return true;
            }
        } catch (IOException var5) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "(Ljava/lang/String;B)Ljg;")
    public final class246 method866(String arg0, byte arg1) {
        if (arg1 >= -116) {
            this.field1934 = null;
        }
        return this.method871(true, 0, 16, arg0, 0);
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Ljava/awt/Point;I[IILjava/awt/Component;I)Ljg;")
    public final class246 method867(Point arg0, int arg1, int[] arg2, int arg3, Component arg4, int arg5) {
        if (arg5 != 17) {
            field1924 = -62L;
        }
        return this.method871(true, arg1, 17, new Object[] { arg4, arg2, arg0 }, arg3);
    }

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "(I)V")
    public final void method868(int arg0) {
        if (arg0 == -11738) {
            field1924 = class97.method664((byte) -50) + 5000L;
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIIII)Ljg;")
    public final class246 method869(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 6) {
            this.field1929 = true;
        }
        return this.method871(true, (arg0 << 16) + arg4, 6, null, (arg3 << 16) + arg1);
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(BLjava/awt/Frame;)Ljg;")
    public final class246 method870(byte arg0, Frame arg1) {
        int var3 = -122 % ((-arg0 - 17) / 47);
        return this.method871(true, 0, 7, arg1, 0);
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(ZIILjava/lang/Object;I)Ljg;")
    private final class246 method871(boolean arg0, int arg1, int arg2, Object arg3, int arg4) {
        class246 var6 = new class246();
        var6.field3634 = arg1;
        if (!arg0) {
            this.field1921 = null;
        }
        var6.field3636 = arg2;
        var6.field3637 = arg4;
        var6.field3635 = arg3;
        synchronized (this) {
            if (this.field1933 == null) {
                this.field1933 = this.field1922 = var6;
            } else {
                this.field1933.field3639 = var6;
                this.field1933 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V")
    public class135(int arg0, String arg1, int arg2, boolean arg3) throws Exception {
        field1915 = "Unknown";
        field1926 = arg1;
        field1938 = "1.1";
        field1913 = arg0;
        this.field1936 = arg3;
        try {
            field1915 = System.getProperty("java.vendor");
            field1938 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        if (field1915.toLowerCase().indexOf("microsoft") != -1) {
            this.field1929 = true;
        }
        try {
            field1917 = System.getProperty("os.name");
        } catch (Exception var19) {
            field1917 = "Unknown";
        }
        field1937 = field1917.toLowerCase();
        try {
            field1925 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field1925 = "";
        }
        try {
            field1932 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
            field1932 = "";
        }
        try {
            field1939 = System.getProperty("user.home");
            if (field1939 != null) {
                field1939 = field1939 + "/";
            }
        } catch (Exception var16) {
        }
        if (field1939 == null) {
            field1939 = "~/";
        }
        try {
            this.field1927 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        if (!this.field1929) {
            try {
                field1928 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } catch (Exception var14) {
            }
            try {
                field1918 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } catch (Exception var13) {
            }
        }
        class565.method3319(-106, field1913, field1926);
        if (this.field1936) {
            this.field1934 = new class216(class565.method3320(null, field1913, 27649, "random.dat"), "rw", 25L);
            this.field1921 = new class216(class565.method3321((byte) -127, "main_file_cache.dat2"), "rw", 209715200L);
            this.field1916 = new class216(class565.method3321((byte) -48, "main_file_cache.idx255"), "rw", 1048576L);
            this.field1912 = new class216[arg2];
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field1912[var5] = new class216(class565.method3321((byte) -48, "main_file_cache.idx" + var5), "rw", 1048576L);
            }
            if (this.field1929) {
                try {
                    this.field1914 = Class.forName("ku").getDeclaredConstructor().newInstance();
                } catch (Throwable var12) {
                }
            }
            try {
                if (this.field1929) {
                    this.field1930 = new class98();
                } else {
                    this.field1920 = Class.forName("nu").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var11) {
            }
            try {
                if (this.field1929) {
                    this.field1935 = new class753();
                } else {
                    this.field1931 = Class.forName("lha").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var10) {
            }
        }
        if (this.field1936 && !this.field1929) {
            ThreadGroup var6 = Thread.currentThread().getThreadGroup();
            for (ThreadGroup var7 = var6.getParent(); var7 != null; var7 = var7.getParent()) {
                var6 = var7;
            }
            Thread[] var8 = new Thread[1000];
            var6.enumerate(var8);
            for (int var9 = 0; var9 < var8.length; var9++) {
                if (var8[var9] != null && var8[var9].getName().startsWith("AWT")) {
                    var8[var9].setPriority(1);
                }
            }
        }
        this.field1919 = false;
        this.field1923 = new Thread(this);
        this.field1923.setPriority(10);
        this.field1923.setDaemon(true);
        this.field1923.start();
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(IBLjava/lang/Runnable;)Ljg;")
    public final class246 method872(int arg0, byte arg1, Runnable arg2) {
        int var4 = -80 % ((-arg1 - 69) / 36);
        return this.method871(true, 0, 2, arg2, arg0);
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Ljava/lang/String;ZB)Ljg;")
    public final class246 method873(String arg0, boolean arg1, byte arg2) {
        if (arg2 == -21) {
            return arg1 ? this.method871(true, 0, 12, arg0, 0) : this.method871(true, 0, 13, arg0, 0);
        } else {
            return null;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method874(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
