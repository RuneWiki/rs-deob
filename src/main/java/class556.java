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

@OriginalClass("client!pe")
public class class556 implements Runnable {

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "Lip;")
    public class647 field7910 = null;

    @OriginalMember(owner = "client!pe", name = "t", descriptor = "Lsba;")
    private class199 field7929 = null;

    @OriginalMember(owner = "client!pe", name = "p", descriptor = "Lip;")
    public class647 field7925 = null;

    @OriginalMember(owner = "client!pe", name = "u", descriptor = "Lsba;")
    private class199 field7930 = null;

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "Z")
    private boolean field7921 = false;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "Lip;")
    public class647 field7913 = null;

    @OriginalMember(owner = "client!pe", name = "o", descriptor = "Z")
    public boolean field7924 = false;

    @OriginalMember(owner = "client!pe", name = "z", descriptor = "Z")
    public boolean field7935 = false;

    @OriginalMember(owner = "client!pe", name = "y", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field7934;

    @OriginalMember(owner = "client!pe", name = "w", descriptor = "[Lip;")
    public class647[] field7932;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "Ljava/lang/Object;")
    private Object field7911;

    @OriginalMember(owner = "client!pe", name = "x", descriptor = "Leg;")
    private class94 field7933;

    @OriginalMember(owner = "client!pe", name = "A", descriptor = "Ljava/lang/Object;")
    private Object field7936;

    @OriginalMember(owner = "client!pe", name = "q", descriptor = "Ljava/lang/Object;")
    private Object field7926;

    @OriginalMember(owner = "client!pe", name = "r", descriptor = "Lrg;")
    private class586 field7927;

    @OriginalMember(owner = "client!pe", name = "v", descriptor = "Ljava/lang/Thread;")
    private Thread field7931;

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "J")
    private static volatile long field7920 = 0L;

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "I")
    private static int field7922;

    // $FF: synthetic field
    @OriginalMember(owner = "client!pe", name = "B", descriptor = "Ljava/lang/Class;")
    public static Class field7937;

    // $FF: synthetic field
    @OriginalMember(owner = "client!pe", name = "C", descriptor = "Ljava/lang/Class;")
    public static Class field7938;

    // $FF: synthetic field
    @OriginalMember(owner = "client!pe", name = "D", descriptor = "Ljava/lang/Class;")
    public static Class field7939;

    // $FF: synthetic field
    @OriginalMember(owner = "client!pe", name = "E", descriptor = "Ljava/lang/Class;")
    public static Class field7940;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "Ljava/lang/String;")
    private static String field7912;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "Ljava/lang/String;")
    private static String field7914;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "Ljava/lang/String;")
    public static String field7915;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "Ljava/lang/String;")
    public static String field7916;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "Ljava/lang/String;")
    private static String field7917;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "Ljava/lang/String;")
    public static String field7918;

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "Ljava/lang/String;")
    public static String field7919;

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field7923;

    @OriginalMember(owner = "client!pe", name = "s", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field7928;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "([BLjava/io/File;I)Z")
    public final boolean method3132(byte[] arg0, File arg1, int arg2) {
        try {
            if (arg2 == -25590) {
                FileOutputStream var4 = new FileOutputStream(arg1);
                var4.write(arg0, 0, arg0.length);
                var4.close();
                return true;
            } else {
                return false;
            }
        } catch (IOException var5) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILjava/lang/Class;Ljava/lang/String;)Lsba;")
    public final class199 method3133(int arg0, Class arg1, String arg2) {
        if (arg0 != 0) {
            this.method3135(119, -116, 84, -55, 118);
        }
        return this.method3145(0, 0, new Object[] { arg1, arg2 }, (byte) 123, 9);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILjava/awt/Frame;)Lsba;")
    public final class199 method3134(int arg0, Frame arg1) {
        if (arg0 != 0) {
            this.method3134(87, null);
        }
        return this.method3145(0, 0, arg1, (byte) 122, 7);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIII)Lsba;")
    public final class199 method3135(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return arg0 == 14 ? this.method3145((arg4 << 16) + arg3, (arg1 << 16) + arg2, null, (byte) 125, 6) : null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IB[ILjava/awt/Component;Ljava/awt/Point;I)Lsba;")
    public final class199 method3136(int arg0, byte arg1, int[] arg2, Component arg3, Point arg4, int arg5) {
        return arg1 == 13 ? this.method3145(arg0, arg5, new Object[] { arg3, arg2, arg4 }, (byte) 122, 17) : null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IB)Lip;")
    private static final class647 method3137(String arg0, String arg1, int arg2, byte arg3) {
        String var4;
        if (arg2 == 33) {
            var4 = "jagex_" + arg0 + "_preferences" + arg1 + "_rc.dat";
        } else if (arg2 == 34) {
            var4 = "jagex_" + arg0 + "_preferences" + arg1 + "_wip.dat";
        } else {
            var4 = "jagex_" + arg0 + "_preferences" + arg1 + ".dat";
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", field7912, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
        for (int var6 = 0; var6 < var5.length; var6++) {
            String var7 = var5[var6];
            if (var7.length() <= 0 || (new File(var7)).exists()) {
                try {
                    return new class647(new File(var7, var4), "rw", 10000L);
                } catch (Exception var9) {
                }
            }
        }
        if (arg3 != -41) {
            method3137(null, null, -32, (byte) 85);
        }
        return null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lsba;")
    public final class199 method3138(Runnable arg0, int arg1, int arg2) {
        int var4 = -96 / ((-arg1 - 79) / 42);
        return this.method3145(0, arg2, arg0, (byte) 126, 2);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)Z")
    public final boolean method3139(int arg0) {
        if (arg0 != 255) {
            this.method3146(71, -60);
        }
        if (!this.field7924) {
            return false;
        } else if (this.field7935) {
            return this.field7933 != null;
        } else {
            return this.field7936 != null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ljava/lang/String;ZI)Lsba;")
    public final class199 method3140(String arg0, boolean arg1, int arg2) {
        int var4 = 90 % ((12 - arg2) / 55);
        return arg1 ? this.method3145(0, 0, arg0, (byte) 125, 12) : this.method3145(0, 0, arg0, (byte) 114, 13);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZLjava/lang/String;)Lip;")
    public static final class647 method3141(boolean arg0, String arg1) {
        if (!arg0) {
            field7916 = null;
        }
        return method3137(field7917, arg1, field7922, (byte) -41);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)Ljava/lang/Object;")
    public final Object method3142(byte arg0) {
        int var2 = 46 % ((arg0 + 61) / 43);
        return this.field7911;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)V")
    public final void method3143(int arg0) {
        field7920 = class641.method3604(false) + (long) arg0;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "([Ljava/lang/Class;BLjava/lang/String;Ljava/lang/Class;)Lsba;")
    public final class199 method3144(Class[] arg0, byte arg1, String arg2, Class arg3) {
        if (arg1 != 97) {
            this.method3144(null, (byte) 87, null, null);
        }
        return this.method3145(0, 0, new Object[] { arg3, arg2, arg0 }, (byte) 113, 8);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IILjava/lang/Object;BI)Lsba;")
    private final class199 method3145(int arg0, int arg1, Object arg2, byte arg3, int arg4) {
        class199 var6 = new class199();
        var6.field2435 = arg4;
        var6.field2431 = arg0;
        var6.field2436 = arg1;
        var6.field2433 = arg2;
        if (arg3 <= 106) {
            this.method3135(98, 10, 123, 79, 75);
        }
        synchronized (this) {
            if (this.field7929 == null) {
                this.field7929 = this.field7930 = var6;
            } else {
                this.field7929.field2432 = var6;
                this.field7929 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!pe", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class199 var2;
            synchronized (this) {
                while (true) {
                    if (this.field7921) {
                        return;
                    }
                    if (this.field7930 != null) {
                        var2 = this.field7930;
                        this.field7930 = this.field7930.field2432;
                        if (this.field7930 == null) {
                            this.field7929 = null;
                        }
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var28) {
                    }
                }
            }
            try {
                int var3 = var2.field2435;
                if (var3 == 1) {
                    if (class641.method3604(false) < field7920) {
                        throw new IOException();
                    }
                    var2.field2434 = new Socket(InetAddress.getByName((String) var2.field2433), var2.field2436);
                } else if (var3 == 22) {
                    if (field7920 > class641.method3604(false)) {
                        throw new IOException();
                    }
                    var2.field2434 = class502.method2886(var2.field2436, (String) var2.field2433, 15351).method1022((byte) 122);
                } else if (var3 == 2) {
                    Thread var22 = new Thread((Runnable) var2.field2433);
                    var22.setDaemon(true);
                    var22.start();
                    var22.setPriority(var2.field2436);
                    var2.field2434 = var22;
                } else if (var3 == 4) {
                    if (class641.method3604(false) < field7920) {
                        throw new IOException();
                    }
                    var2.field2434 = new DataInputStream(((URL) var2.field2433).openStream());
                } else if (var3 == 8) {
                    Object[] var4 = (Object[]) var2.field2433;
                    if (this.field7924 && ((Class) var4[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field2434 = ((Class) var4[0]).getDeclaredMethod((String) var4[1], (Class[]) var4[2]);
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field2433;
                    if (this.field7924 && ((Class) var5[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field2434 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else if (var3 == 18) {
                    Clipboard var6 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field2434 = var6.getContents(null);
                } else if (var3 == 19) {
                    Transferable var7 = (Transferable) var2.field2433;
                    Clipboard var8 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var8.setContents(var7, null);
                } else if (!this.field7924) {
                    throw new Exception("");
                } else if (var3 == 3) {
                    if (class641.method3604(false) < field7920) {
                        throw new IOException();
                    }
                    String var21 = (var2.field2436 >> 24 & 0xFF) + "." + ((var2.field2436 & 0xFFE0AB) >> 16) + "." + ((var2.field2436 & 0xFF81) >> 8) + "." + (var2.field2436 & 0xFF);
                    var2.field2434 = InetAddress.getByName(var21).getHostName();
                } else if (var3 == 21) {
                    if (field7920 > class641.method3604(false)) {
                        throw new IOException();
                    }
                    var2.field2434 = InetAddress.getByName((String) var2.field2433).getAddress();
                } else if (var3 == 5) {
                    if (this.field7935) {
                        var2.field2434 = this.field7933.method589(false);
                    } else {
                        var2.field2434 = Class.forName("fn").getMethod("listmodes").invoke(this.field7936);
                    }
                } else if (var3 == 6) {
                    Frame var9 = new Frame("Jagex Full Screen");
                    var2.field2434 = var9;
                    var9.setResizable(false);
                    if (this.field7935) {
                        this.field7933.method590(-20, var2.field2436 >>> 16, var2.field2431 & 0xFFFF, var9, var2.field2436 & 0xFFFF, var2.field2431 >> 16);
                    } else {
                        Class.forName("fn").getMethod("enter", field7937 == null ? (field7937 = method3152("java.awt.Frame")) : field7937, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.field7936, var9, Integer.valueOf(var2.field2436 >>> 16), new Integer(var2.field2436 & 0xFFFF), Integer.valueOf(var2.field2431 >> 16), new Integer(var2.field2431 & 0xFFFF));
                    }
                } else if (var3 == 7) {
                    if (this.field7935) {
                        this.field7933.method588((Frame) var2.field2433, (byte) -62);
                    } else {
                        Class.forName("fn").getMethod("exit").invoke(this.field7936);
                    }
                } else if (var3 == 12) {
                    class647 var20 = method3137(field7917, (String) var2.field2433, field7922, (byte) -41);
                    var2.field2434 = var20;
                } else if (var3 == 13) {
                    class647 var19 = method3137("", (String) var2.field2433, field7922, (byte) -41);
                    var2.field2434 = var19;
                } else if (this.field7924 && var3 == 14) {
                    int var17 = var2.field2436;
                    int var18 = var2.field2431;
                    if (this.field7935) {
                        this.field7927.method3292(var17, var18, 0);
                    } else {
                        Class.forName("fea").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.field7926, Integer.valueOf(var17), new Integer(var18));
                    }
                } else if (this.field7924 && var3 == 15) {
                    boolean var15 = var2.field2436 != 0;
                    Component var16 = (Component) var2.field2433;
                    if (this.field7935) {
                        this.field7927.method3291(-107, var15, var16);
                    } else {
                        Class.forName("fea").getDeclaredMethod("showcursor", field7938 == null ? (field7938 = method3152("java.awt.Component")) : field7938, Boolean.TYPE).invoke(this.field7926, var16, Boolean.valueOf(var15));
                    }
                } else if (!this.field7935 && var3 == 17) {
                    Object[] var14 = (Object[]) var2.field2433;
                    Class.forName("fea").getDeclaredMethod("setcustomcursor", field7938 == null ? (field7938 = method3152("java.awt.Component")) : field7938, field7939 == null ? (field7939 = method3152("[I")) : field7939, Integer.TYPE, Integer.TYPE, field7940 == null ? (field7940 = method3152("java.awt.Point")) : field7940).invoke(this.field7926, (Component) var14[0], (int[]) var14[1], Integer.valueOf(var2.field2436), new Integer(var2.field2431), (Point) var14[2]);
                } else if (var3 == 16) {
                    try {
                        if (!field7916.startsWith("win")) {
                            throw new Exception();
                        }
                        String var10 = (String) var2.field2433;
                        if (!var10.startsWith("http://") && !var10.startsWith("https://")) {
                            throw new Exception();
                        }
                        String var11 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                        for (int var12 = 0; var12 < var10.length(); var12++) {
                            if (var11.indexOf(var10.charAt(var12)) == -1) {
                                throw new Exception();
                            }
                        }
                        Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var10 + "\"");
                        var2.field2434 = null;
                    } catch (Exception var29) {
                        var2.field2434 = var29;
                        throw var29;
                    }
                } else {
                    throw new Exception("");
                }
                var2.field2437 = 1;
            } catch (ThreadDeath var30) {
                throw var30;
            } catch (Throwable var31) {
                var2.field2437 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)Lsba;")
    public final class199 method3146(int arg0, int arg1) {
        int var3 = 19 % ((59 - arg0) / 61);
        return this.method3145(0, arg1, null, (byte) 122, 3);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Z)Lsba;")
    public final class199 method3147(boolean arg0) {
        if (arg0) {
            this.method3147(false);
        }
        return this.method3145(0, 0, null, (byte) 118, 5);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZLjava/net/URL;)Lsba;")
    public final class199 method3148(boolean arg0, URL arg1) {
        return arg0 ? null : this.method3145(0, 0, arg1, (byte) 116, 4);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IBLjava/lang/String;Z)Lsba;")
    public final class199 method3149(int arg0, byte arg1, String arg2, boolean arg3) {
        return arg1 >= -77 ? null : this.method3145(0, arg0, arg2, (byte) 122, arg3 ? 22 : 1);
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(Z)V")
    public final void method3150(boolean arg0) {
        synchronized (this) {
            this.field7921 = arg0;
            this.notifyAll();
        }
        try {
            this.field7931.join();
        } catch (InterruptedException var8) {
        }
        if (this.field7910 != null) {
            try {
                this.field7910.method3633(0);
            } catch (IOException var7) {
            }
        }
        if (this.field7913 != null) {
            try {
                this.field7913.method3633(0);
            } catch (IOException var6) {
            }
        }
        if (this.field7932 != null) {
            for (int var3 = 0; var3 < this.field7932.length; var3++) {
                if (this.field7932[var3] != null) {
                    try {
                        this.field7932[var3].method3633(0);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field7925 != null) {
            try {
                this.field7925.method3633(0);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ljava/lang/String;I)Lsba;")
    public final class199 method3151(String arg0, int arg1) {
        if (arg1 != 2) {
            field7920 = 127L;
        }
        return this.method3145(0, 0, arg0, (byte) 121, 16);
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V")
    public class556(int arg0, String arg1, int arg2, boolean arg3) throws Exception {
        this.field7924 = arg3;
        field7922 = arg0;
        field7917 = arg1;
        field7918 = "1.1";
        field7919 = "Unknown";
        try {
            field7919 = System.getProperty("java.vendor");
            field7918 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        if (field7919.toLowerCase().indexOf("microsoft") != -1) {
            this.field7935 = true;
        }
        try {
            field7914 = System.getProperty("os.name");
        } catch (Exception var19) {
            field7914 = "Unknown";
        }
        field7916 = field7914.toLowerCase();
        try {
            field7915 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field7915 = "";
        }
        try {
            System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
        }
        try {
            field7912 = System.getProperty("user.home");
            if (field7912 != null) {
                field7912 = field7912 + "/";
            }
        } catch (Exception var16) {
        }
        if (field7912 == null) {
            field7912 = "~/";
        }
        try {
            this.field7934 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        if (!this.field7935) {
            try {
                field7928 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } catch (Exception var14) {
            }
            try {
                field7923 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } catch (Exception var13) {
            }
        }
        class619.method3475(field7917, 0, field7922);
        if (this.field7924) {
            this.field7925 = new class647(class619.method3477("random.dat", null, -4807, field7922), "rw", 25L);
            this.field7910 = new class647(class619.method3476("main_file_cache.dat2", (byte) -85), "rw", 209715200L);
            this.field7913 = new class647(class619.method3476("main_file_cache.idx255", (byte) -127), "rw", 1048576L);
            this.field7932 = new class647[arg2];
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field7932[var5] = new class647(class619.method3476("main_file_cache.idx" + var5, (byte) -88), "rw", 1048576L);
            }
            if (this.field7935) {
                try {
                    this.field7911 = Class.forName("st").getDeclaredConstructor().newInstance();
                } catch (Throwable var12) {
                }
            }
            try {
                if (this.field7935) {
                    this.field7933 = new class94();
                } else {
                    this.field7936 = Class.forName("fn").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var11) {
            }
            try {
                if (this.field7935) {
                    this.field7927 = new class586();
                } else {
                    this.field7926 = Class.forName("fea").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var10) {
            }
        }
        if (this.field7924 && !this.field7935) {
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
        this.field7921 = false;
        this.field7931 = new Thread(this);
        this.field7931.setPriority(10);
        this.field7931.setDaemon(true);
        this.field7931.start();
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3152(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
