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

@OriginalClass("client!qj")
public class class476 implements Runnable {

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "Lbi;")
    public class448 field5903 = null;

    @OriginalMember(owner = "client!qj", name = "t", descriptor = "Lbi;")
    public class448 field5922 = null;

    @OriginalMember(owner = "client!qj", name = "l", descriptor = "Z")
    private boolean field5914 = false;

    @OriginalMember(owner = "client!qj", name = "w", descriptor = "Z")
    public boolean field5925 = false;

    @OriginalMember(owner = "client!qj", name = "n", descriptor = "Lue;")
    private class218 field5916 = null;

    @OriginalMember(owner = "client!qj", name = "o", descriptor = "Lbi;")
    public class448 field5917 = null;

    @OriginalMember(owner = "client!qj", name = "q", descriptor = "Z")
    public boolean field5919 = false;

    @OriginalMember(owner = "client!qj", name = "B", descriptor = "Lue;")
    private class218 field5930 = null;

    @OriginalMember(owner = "client!qj", name = "x", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field5926;

    @OriginalMember(owner = "client!qj", name = "j", descriptor = "[Lbi;")
    public class448[] field5912;

    @OriginalMember(owner = "client!qj", name = "z", descriptor = "Ljava/lang/Object;")
    private Object field5928;

    @OriginalMember(owner = "client!qj", name = "k", descriptor = "Lrq;")
    private class326 field5913;

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "Ljava/lang/Object;")
    private Object field5908;

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "Lmm;")
    private class260 field5911;

    @OriginalMember(owner = "client!qj", name = "s", descriptor = "Ljava/lang/Object;")
    private Object field5921;

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "Ljava/lang/Thread;")
    private Thread field5907;

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "J")
    private static volatile long field5910 = 0L;

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "I")
    private static int field5905;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qj", name = "C", descriptor = "Ljava/lang/Class;")
    public static Class field5931;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qj", name = "D", descriptor = "Ljava/lang/Class;")
    public static Class field5932;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qj", name = "E", descriptor = "Ljava/lang/Class;")
    public static Class field5933;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qj", name = "F", descriptor = "Ljava/lang/Class;")
    public static Class field5934;

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "Ljava/lang/String;")
    private static String field5904;

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "Ljava/lang/String;")
    private static String field5909;

    @OriginalMember(owner = "client!qj", name = "p", descriptor = "Ljava/lang/String;")
    public static String field5918;

    @OriginalMember(owner = "client!qj", name = "r", descriptor = "Ljava/lang/String;")
    public static String field5920;

    @OriginalMember(owner = "client!qj", name = "u", descriptor = "Ljava/lang/String;")
    public static String field5923;

    @OriginalMember(owner = "client!qj", name = "v", descriptor = "Ljava/lang/String;")
    private static String field5924;

    @OriginalMember(owner = "client!qj", name = "y", descriptor = "Ljava/lang/String;")
    public static String field5927;

    @OriginalMember(owner = "client!qj", name = "A", descriptor = "Ljava/lang/String;")
    public static String field5929;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field5906;

    @OriginalMember(owner = "client!qj", name = "m", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field5915;

    // $FF: synthetic method
    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2606(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;I)Lbi;", line = 6)
    private static final class448 method2586(String arg0, byte arg1, String arg2, int arg3) {
        String var4;
        if (arg3 == 33) {
            var4 = "jagex_" + arg0 + "_preferences" + arg2 + "_rc.dat";
        } else if (arg3 == 34) {
            var4 = "jagex_" + arg0 + "_preferences" + arg2 + "_wip.dat";
        } else {
            var4 = "jagex_" + arg0 + "_preferences" + arg2 + ".dat";
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", field5904, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
        for (int var6 = 0; var6 < var5.length; var6++) {
            String var7 = var5[var6];
            if (var7.length() <= 0 || (new File(var7)).exists()) {
                try {
                    return new class448(new File(var7, var4), "rw", 10000L);
                } catch (Exception var9) {
                }
            }
        }
        if (arg1 < 24) {
            method2586(null, (byte) 19, null, 92);
        }
        return null;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILjava/io/File;[B)Z", line = 47)
    public final boolean method2587(int arg0, File arg1, byte[] arg2) {
        try {
            FileOutputStream var4 = new FileOutputStream(arg1);
            var4.write(arg2, 0, arg2.length);
            var4.close();
            if (arg0 != -27251) {
                this.field5903 = null;
            }
            return true;
        } catch (IOException var5) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V", line = 75)
    public final void method2588(int arg0) {
        synchronized (this) {
            this.field5914 = true;
            if (arg0 != -4877) {
                return;
            }
            this.notifyAll();
        }
        try {
            this.field5907.join();
        } catch (InterruptedException var10) {
        }
        if (this.field5917 != null) {
            try {
                this.field5917.method2451(true);
            } catch (IOException var9) {
            }
        }
        if (this.field5903 != null) {
            try {
                this.field5903.method2451(true);
            } catch (IOException var8) {
            }
        }
        if (this.field5912 != null) {
            for (int var3 = 0; var3 < this.field5912.length; var3++) {
                if (this.field5912[var3] != null) {
                    try {
                        this.field5912[var3].method2451(true);
                    } catch (IOException var7) {
                    }
                }
            }
        }
        if (this.field5922 != null) {
            try {
                this.field5922.method2451(true);
            } catch (IOException var6) {
            }
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)Z", line = 131)
    public final boolean method2589(byte arg0) {
        if (arg0 != -63) {
            this.method2590(-116, 119, null, true);
        }
        if (!this.field5919) {
            return false;
        } else if (this.field5925) {
            return this.field5913 != null;
        } else {
            return this.field5908 != null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IILjava/lang/String;Z)Lue;", line = 152)
    public final class218 method2590(int arg0, int arg1, String arg2, boolean arg3) {
        if (arg1 != 0) {
            this.method2593(-40, 38, -30, null, (byte) -42);
        }
        return this.method2593(arg0, 0, arg3 ? 22 : 1, arg2, (byte) 57);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILjava/lang/String;)Lbi;", line = 175)
    public static final class448 method2591(int arg0, String arg1) {
        if (arg0 != -13072) {
            field5906 = null;
        }
        return method2586(field5924, (byte) 85, arg1, field5905);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILjava/lang/Runnable;B)Lue;", line = 187)
    public final class218 method2592(int arg0, Runnable arg1, byte arg2) {
        if (arg2 != 104) {
            this.method2602(-11);
        }
        return this.method2593(arg0, 0, 2, arg1, (byte) -126);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIILjava/lang/Object;B)Lue;", line = 197)
    private final class218 method2593(int arg0, int arg1, int arg2, Object arg3, byte arg4) {
        class218 var6 = new class218();
        var6.field2545 = arg0;
        var6.field2541 = arg1;
        int var7 = 88 / ((arg4 + 35) / 52);
        var6.field2544 = arg3;
        var6.field2542 = arg2;
        synchronized (this) {
            if (this.field5930 == null) {
                this.field5930 = this.field5916 = var6;
            } else {
                this.field5930.field2543 = var6;
                this.field5930 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/String;BLjava/lang/Class;)Lue;", line = 228)
    public final class218 method2594(Class[] arg0, String arg1, byte arg2, Class arg3) {
        if (arg2 <= 24) {
            this.field5913 = null;
        }
        return this.method2593(0, 0, 8, new Object[] { arg3, arg1, arg0 }, (byte) -108);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)Lue;", line = 240)
    public final class218 method2595(int arg0, int arg1) {
        if (arg1 != 65535) {
            this.field5913 = null;
        }
        return this.method2593(arg0, 0, 3, null, (byte) -103);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(BZLjava/lang/String;)Lue;", line = 254)
    public final class218 method2596(byte arg0, boolean arg1, String arg2) {
        if (arg0 < 109) {
            this.field5911 = null;
        }
        return arg1 ? this.method2593(0, 0, 12, arg2, (byte) -119) : this.method2593(0, 0, 13, arg2, (byte) -110);
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(I)Ljava/lang/Object;", line = 269)
    public final Object method2597(int arg0) {
        if (arg0 != 29898) {
            this.method2596((byte) 56, true, null);
        }
        return this.field5928;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIII)Lue;", line = 279)
    public final class218 method2598(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = 121 / ((arg0 + 32) / 47);
        return this.method2593((arg4 << 16) + arg3, (arg2 << 16) - -arg1, 6, null, (byte) 100);
    }

    @OriginalMember(owner = "client!qj", name = "run", descriptor = "()V", line = 288)
    public final void run() {
        while (true) {
            class218 var2;
            synchronized (this) {
                while (true) {
                    if (this.field5914) {
                        return;
                    }
                    if (this.field5916 != null) {
                        var2 = this.field5916;
                        this.field5916 = this.field5916.field2543;
                        if (this.field5916 == null) {
                            this.field5930 = null;
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
                int var3 = var2.field2542;
                if (var3 == 1) {
                    if (class321.method1854(-122) < field5910) {
                        throw new IOException();
                    }
                    var2.field2547 = new Socket(InetAddress.getByName((String) var2.field2544), var2.field2545);
                } else if (var3 == 22) {
                    if (field5910 > class321.method1854(-120)) {
                        throw new IOException();
                    }
                    try {
                        var2.field2547 = class683.method3779((String) var2.field2544, var2.field2545, -103).method757(25);
                    } catch (class386 var29) {
                        var2.field2547 = var29.getMessage();
                        throw var29;
                    }
                } else if (var3 == 2) {
                    Thread var5 = new Thread((Runnable) var2.field2544);
                    var5.setDaemon(true);
                    var5.start();
                    var5.setPriority(var2.field2545);
                    var2.field2547 = var5;
                } else if (var3 == 4) {
                    if (field5910 > class321.method1854(-57)) {
                        throw new IOException();
                    }
                    var2.field2547 = new DataInputStream(((URL) var2.field2544).openStream());
                } else if (var3 == 8) {
                    Object[] var23 = (Object[]) var2.field2544;
                    if (this.field5919 && ((Class) var23[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field2547 = ((Class) var23[0]).getDeclaredMethod((String) var23[1], (Class[]) var23[2]);
                } else if (var3 == 9) {
                    Object[] var22 = (Object[]) var2.field2544;
                    if (this.field5919 && ((Class) var22[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field2547 = ((Class) var22[0]).getDeclaredField((String) var22[1]);
                } else if (var3 == 18) {
                    Clipboard var6 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field2547 = var6.getContents(null);
                } else if (var3 == 19) {
                    Transferable var20 = (Transferable) var2.field2544;
                    Clipboard var21 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var21.setContents(var20, null);
                } else if (!this.field5919) {
                    throw new Exception("");
                } else if (var3 == 3) {
                    if (field5910 > class321.method1854(-63)) {
                        throw new IOException();
                    }
                    String var7 = (var2.field2545 >> 24 & 0xFF) + "." + ((var2.field2545 & 0xFFBD2C) >> 16) + "." + (var2.field2545 >> 8 & 0xFF) + "." + (var2.field2545 & 0xFF);
                    var2.field2547 = InetAddress.getByName(var7).getHostName();
                } else if (var3 == 21) {
                    if (class321.method1854(-62) < field5910) {
                        throw new IOException();
                    }
                    var2.field2547 = InetAddress.getByName((String) var2.field2544).getAddress();
                } else if (var3 == 5) {
                    if (this.field5925) {
                        var2.field2547 = this.field5913.method1877(4);
                    } else {
                        var2.field2547 = Class.forName("bp").getMethod("listmodes").invoke(this.field5908);
                    }
                } else if (var3 == 6) {
                    Frame var19 = new Frame("Jagex Full Screen");
                    var2.field2547 = var19;
                    var19.setResizable(false);
                    if (this.field5925) {
                        this.field5913.method1875(121, var2.field2541 & 0xFFFF, var2.field2545 >>> 16, var19, var2.field2541 >> 16, var2.field2545 & 0xFFFF);
                    } else {
                        Class.forName("bp").getMethod("enter", field5934 == null ? (field5934 = method2606("java.awt.Frame")) : field5934, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.field5908, var19, Integer.valueOf(var2.field2545 >>> 16), new Integer(var2.field2545 & 0xFFFF), Integer.valueOf(var2.field2541 >> 16), new Integer(var2.field2541 & 0xFFFF));
                    }
                } else if (var3 == 7) {
                    if (this.field5925) {
                        this.field5913.method1876((byte) 126, (Frame) var2.field2544);
                    } else {
                        Class.forName("bp").getMethod("exit").invoke(this.field5908);
                    }
                } else if (var3 == 12) {
                    class448 var8 = method2586(field5924, (byte) 57, (String) var2.field2544, field5905);
                    var2.field2547 = var8;
                } else if (var3 == 13) {
                    class448 var18 = method2586("", (byte) 55, (String) var2.field2544, field5905);
                    var2.field2547 = var18;
                } else if (this.field5919 && var3 == 14) {
                    int var9 = var2.field2545;
                    int var10 = var2.field2541;
                    if (this.field5925) {
                        this.field5911.method1561(98, var10, var9);
                    } else {
                        Class.forName("rca").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.field5921, Integer.valueOf(var9), new Integer(var10));
                    }
                } else if (this.field5919 && var3 == 15) {
                    boolean var11 = var2.field2545 != 0;
                    Component var12 = (Component) var2.field2544;
                    if (this.field5925) {
                        this.field5911.method1560(var11, var12, (byte) 63);
                    } else {
                        Class.forName("rca").getDeclaredMethod("showcursor", field5931 == null ? (field5931 = method2606("java.awt.Component")) : field5931, Boolean.TYPE).invoke(this.field5921, var12, Boolean.valueOf(var11));
                    }
                } else if (!this.field5925 && var3 == 17) {
                    Object[] var13 = (Object[]) var2.field2544;
                    Class.forName("rca").getDeclaredMethod("setcustomcursor", field5931 == null ? (field5931 = method2606("java.awt.Component")) : field5931, field5932 == null ? (field5932 = method2606("[I")) : field5932, Integer.TYPE, Integer.TYPE, field5933 == null ? (field5933 = method2606("java.awt.Point")) : field5933).invoke(this.field5921, (Component) var13[0], (int[]) var13[1], Integer.valueOf(var2.field2545), new Integer(var2.field2541), (Point) var13[2]);
                } else if (var3 == 16) {
                    try {
                        if (!field5927.startsWith("win")) {
                            throw new Exception();
                        }
                        String var14 = (String) var2.field2544;
                        if (!var14.startsWith("http://") && !var14.startsWith("https://")) {
                            throw new Exception();
                        }
                        String var15 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                        for (int var16 = 0; var16 < var14.length(); var16++) {
                            if (var15.indexOf(var14.charAt(var16)) == -1) {
                                throw new Exception();
                            }
                        }
                        Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var14 + "\"");
                        var2.field2547 = null;
                    } catch (Exception var31) {
                        var2.field2547 = var31;
                        throw var31;
                    }
                } else {
                    throw new Exception("");
                }
                var2.field2546 = 1;
            } catch (ThreadDeath var32) {
                throw var32;
            } catch (Throwable var33) {
                var2.field2546 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Ljava/net/URL;B)Lue;", line = 585)
    public final class218 method2599(URL arg0, byte arg1) {
        if (arg1 > -27) {
            this.method2599(null, (byte) -43);
        }
        return this.method2593(0, 0, 4, arg0, (byte) -100);
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V", line = 703)
    public class476(int arg0, String arg1, int arg2, boolean arg3) throws Exception {
        this.field5919 = arg3;
        field5923 = "Unknown";
        field5918 = "1.1";
        field5924 = arg1;
        field5905 = arg0;
        try {
            field5923 = System.getProperty("java.vendor");
            field5918 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        if (field5923.toLowerCase().indexOf("microsoft") != -1) {
            this.field5925 = true;
        }
        try {
            field5909 = System.getProperty("os.name");
        } catch (Exception var19) {
            field5909 = "Unknown";
        }
        field5927 = field5909.toLowerCase();
        try {
            field5920 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field5920 = "";
        }
        try {
            field5929 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
            field5929 = "";
        }
        try {
            field5904 = System.getProperty("user.home");
            if (field5904 != null) {
                field5904 = field5904 + "/";
            }
        } catch (Exception var16) {
        }
        if (field5904 == null) {
            field5904 = "~/";
        }
        try {
            this.field5926 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        if (!this.field5925) {
            try {
                field5906 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } catch (Exception var14) {
            }
            try {
                field5915 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } catch (Exception var13) {
            }
        }
        class31.method206(field5924, field5905, 0);
        if (this.field5919) {
            this.field5922 = new class448(class31.method208(null, field5905, -124, "random.dat"), "rw", 25L);
            this.field5917 = new class448(class31.method207(16, "main_file_cache.dat2"), "rw", 209715200L);
            this.field5903 = new class448(class31.method207(16, "main_file_cache.idx255"), "rw", 1048576L);
            this.field5912 = new class448[arg2];
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field5912[var5] = new class448(class31.method207(16, "main_file_cache.idx" + var5), "rw", 1048576L);
            }
            if (this.field5925) {
                try {
                    this.field5928 = Class.forName("wr").getDeclaredConstructor().newInstance();
                } catch (Throwable var12) {
                }
            }
            try {
                if (this.field5925) {
                    this.field5913 = new class326();
                } else {
                    this.field5908 = Class.forName("bp").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var11) {
            }
            try {
                if (this.field5925) {
                    this.field5911 = new class260();
                } else {
                    this.field5921 = Class.forName("rca").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var10) {
            }
        }
        if (this.field5919 && !this.field5925) {
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
        this.field5914 = false;
        this.field5907 = new Thread(this);
        this.field5907.setPriority(10);
        this.field5907.setDaemon(true);
        this.field5907.start();
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(BLjava/lang/String;)Lue;", line = 603)
    public final class218 method2600(byte arg0, String arg1) {
        if (arg0 != 1) {
            this.method2589((byte) 23);
        }
        return this.method2593(0, 0, 16, arg1, (byte) 33);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILjava/lang/Class;Ljava/lang/String;)Lue;", line = 626)
    public final class218 method2601(int arg0, Class arg1, String arg2) {
        if (arg0 != 0) {
            field5918 = null;
        }
        return this.method2593(0, 0, 9, new Object[] { arg1, arg2 }, (byte) 91);
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(I)V", line = 636)
    public final void method2602(int arg0) {
        field5910 = class321.method1854(arg0 ^ 0x5C) + 5000L;
        if (arg0 != -4) {
            this.field5903 = null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILjava/awt/Frame;)Lue;", line = 649)
    public final class218 method2603(int arg0, Frame arg1) {
        if (arg0 != 0) {
            this.field5912 = null;
        }
        return this.method2593(0, 0, 7, arg1, (byte) 124);
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(B)Lue;", line = 659)
    public final class218 method2604(byte arg0) {
        if (arg0 != -108) {
            field5910 = -74L;
        }
        return this.method2593(0, 0, 5, null, (byte) -110);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "([IBLjava/awt/Component;Ljava/awt/Point;II)Lue;", line = 680)
    public final class218 method2605(int[] arg0, byte arg1, Component arg2, Point arg3, int arg4, int arg5) {
        return arg1 >= -77 ? null : this.method2593(arg4, arg5, 17, new Object[] { arg2, arg0, arg3 }, (byte) 68);
    }
}
