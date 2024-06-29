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

@OriginalClass("client!hga")
public class class300 implements Runnable {

    @OriginalMember(owner = "client!hga", name = "h", descriptor = "Z")
    private boolean field4092 = false;

    @OriginalMember(owner = "client!hga", name = "f", descriptor = "Lsca;")
    private class432 field4090 = null;

    @OriginalMember(owner = "client!hga", name = "q", descriptor = "Ljn;")
    public class322 field4101 = null;

    @OriginalMember(owner = "client!hga", name = "c", descriptor = "Z")
    public boolean field4087 = false;

    @OriginalMember(owner = "client!hga", name = "p", descriptor = "Z")
    public boolean field4100 = false;

    @OriginalMember(owner = "client!hga", name = "w", descriptor = "Lsca;")
    private class432 field4107 = null;

    @OriginalMember(owner = "client!hga", name = "z", descriptor = "Ljn;")
    public class322 field4110 = null;

    @OriginalMember(owner = "client!hga", name = "B", descriptor = "Ljn;")
    public class322 field4112 = null;

    @OriginalMember(owner = "client!hga", name = "v", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field4106;

    @OriginalMember(owner = "client!hga", name = "A", descriptor = "[Ljn;")
    public class322[] field4111;

    @OriginalMember(owner = "client!hga", name = "l", descriptor = "Ljava/lang/Object;")
    private Object field4096;

    @OriginalMember(owner = "client!hga", name = "m", descriptor = "Lel;")
    private class719 field4097;

    @OriginalMember(owner = "client!hga", name = "u", descriptor = "Ljava/lang/Object;")
    private Object field4105;

    @OriginalMember(owner = "client!hga", name = "t", descriptor = "Ljava/lang/Object;")
    private Object field4104;

    @OriginalMember(owner = "client!hga", name = "n", descriptor = "Llv;")
    private class354 field4098;

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "Ljava/lang/Thread;")
    private Thread field4085;

    @OriginalMember(owner = "client!hga", name = "x", descriptor = "J")
    private static volatile long field4108 = 0L;

    @OriginalMember(owner = "client!hga", name = "i", descriptor = "I")
    private static int field4093;

    // $FF: synthetic field
    @OriginalMember(owner = "client!hga", name = "C", descriptor = "Ljava/lang/Class;")
    public static Class field4113;

    // $FF: synthetic field
    @OriginalMember(owner = "client!hga", name = "D", descriptor = "Ljava/lang/Class;")
    public static Class field4114;

    // $FF: synthetic field
    @OriginalMember(owner = "client!hga", name = "E", descriptor = "Ljava/lang/Class;")
    public static Class field4115;

    // $FF: synthetic field
    @OriginalMember(owner = "client!hga", name = "F", descriptor = "Ljava/lang/Class;")
    public static Class field4116;

    @OriginalMember(owner = "client!hga", name = "b", descriptor = "Ljava/lang/String;")
    public static String field4086;

    @OriginalMember(owner = "client!hga", name = "d", descriptor = "Ljava/lang/String;")
    private static String field4088;

    @OriginalMember(owner = "client!hga", name = "e", descriptor = "Ljava/lang/String;")
    public static String field4089;

    @OriginalMember(owner = "client!hga", name = "g", descriptor = "Ljava/lang/String;")
    public static String field4091;

    @OriginalMember(owner = "client!hga", name = "j", descriptor = "Ljava/lang/String;")
    private static String field4094;

    @OriginalMember(owner = "client!hga", name = "k", descriptor = "Ljava/lang/String;")
    public static String field4095;

    @OriginalMember(owner = "client!hga", name = "o", descriptor = "Ljava/lang/String;")
    private static String field4099;

    @OriginalMember(owner = "client!hga", name = "s", descriptor = "Ljava/lang/String;")
    public static String field4103;

    @OriginalMember(owner = "client!hga", name = "r", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field4102;

    @OriginalMember(owner = "client!hga", name = "y", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field4109;

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "([BLjava/io/File;Z)Z")
    public final boolean method1864(byte[] arg0, File arg1, boolean arg2) {
        try {
            FileOutputStream var4 = new FileOutputStream(arg1);
            var4.write(arg0, 0, arg0.length);
            var4.close();
            return !arg2;
        } catch (IOException var5) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(Z)Ljava/lang/Object;")
    public final Object method1865(boolean arg0) {
        if (!arg0) {
            this.method1878(false);
        }
        return this.field4096;
    }

    @OriginalMember(owner = "client!hga", name = "b", descriptor = "(Z)Z")
    public final boolean method1866(boolean arg0) {
        if (!arg0) {
            this.field4101 = null;
        }
        if (!this.field4087) {
            return false;
        } else if (this.field4100) {
            return this.field4097 != null;
        } else {
            return this.field4105 != null;
        }
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(ILjava/awt/Frame;)Lsca;")
    public final class432 method1867(int arg0, Frame arg1) {
        if (arg0 != 7) {
            field4094 = null;
        }
        return this.method1874(0, (byte) -78, arg1, 7, 0);
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(B)V")
    public final void method1868(byte arg0) {
        synchronized (this) {
            this.field4092 = true;
            this.notifyAll();
        }
        try {
            if (arg0 != -120) {
                this.field4110 = null;
            }
            this.field4085.join();
        } catch (InterruptedException var8) {
        }
        if (this.field4101 != null) {
            try {
                this.field4101.method2000((byte) 33);
            } catch (IOException var7) {
            }
        }
        if (this.field4112 != null) {
            try {
                this.field4112.method2000((byte) 33);
            } catch (IOException var6) {
            }
        }
        if (this.field4111 != null) {
            for (int var3 = 0; var3 < this.field4111.length; var3++) {
                if (this.field4111[var3] != null) {
                    try {
                        this.field4111[var3].method2000((byte) 33);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field4110 != null) {
            try {
                this.field4110.method2000((byte) 33);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(I)V")
    public final void method1869(int arg0) {
        field4108 = (long) arg0 + class465.method2818(255);
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(Ljava/lang/String;I)Lsca;")
    public final class432 method1870(String arg0, int arg1) {
        if (arg1 != 0) {
            this.method1878(true);
        }
        return this.method1874(0, (byte) -71, arg0, 16, 0);
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(ILjava/net/URL;)Lsca;")
    public final class432 method1871(int arg0, URL arg1) {
        if (arg0 != -17071) {
            this.method1873(null, (byte) 64, null, null);
        }
        return this.method1874(0, (byte) -105, arg1, 4, 0);
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(IZLjava/lang/Runnable;)Lsca;")
    public final class432 method1872(int arg0, boolean arg1, Runnable arg2) {
        if (arg1) {
            this.field4112 = null;
        }
        return this.method1874(0, (byte) -114, arg2, 2, arg0);
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/Class;[Ljava/lang/Class;)Lsca;")
    public final class432 method1873(String arg0, byte arg1, Class arg2, Class[] arg3) {
        if (arg1 != -21) {
            this.field4110 = null;
        }
        return this.method1874(0, (byte) -91, new Object[] { arg2, arg0, arg3 }, 8, 0);
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(IBLjava/lang/Object;II)Lsca;")
    private final class432 method1874(int arg0, byte arg1, Object arg2, int arg3, int arg4) {
        class432 var6 = new class432();
        var6.field6197 = arg4;
        var6.field6196 = arg3;
        var6.field6195 = arg2;
        var6.field6201 = arg0;
        synchronized (this) {
            if (this.field4090 == null) {
                this.field4090 = this.field4107 = var6;
            } else {
                this.field4090.field6199 = var6;
                this.field4090 = var6;
            }
            this.notify();
            if (arg1 >= -60) {
                this.run();
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "([IIIILjava/awt/Point;Ljava/awt/Component;)Lsca;")
    public final class432 method1875(int[] arg0, int arg1, int arg2, int arg3, Point arg4, Component arg5) {
        if (arg1 >= -121) {
            this.field4096 = null;
        }
        return this.method1874(arg2, (byte) -128, new Object[] { arg5, arg0, arg4 }, 17, arg3);
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(IZLjava/lang/String;)Lsca;")
    public final class432 method1876(int arg0, boolean arg1, String arg2) {
        if (arg0 != -13918) {
            this.method1874(115, (byte) 39, null, -7, 107);
        }
        return arg1 ? this.method1874(0, (byte) -121, arg2, 12, 0) : this.method1874(0, (byte) -102, arg2, 13, 0);
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(Ljava/lang/String;B)Ljn;")
    public static final class322 method1877(String arg0, byte arg1) {
        if (arg1 <= 50) {
            field4095 = null;
        }
        return method1879(field4093, field4099, arg0, (byte) -81);
    }

    @OriginalMember(owner = "client!hga", name = "c", descriptor = "(Z)Lsca;")
    public final class432 method1878(boolean arg0) {
        return arg0 ? null : this.method1874(0, (byte) -112, null, 5, 0);
    }

    @OriginalMember(owner = "client!hga", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class432 var2;
            synchronized (this) {
                while (true) {
                    if (this.field4092) {
                        return;
                    }
                    if (this.field4107 != null) {
                        var2 = this.field4107;
                        this.field4107 = this.field4107.field6199;
                        if (this.field4107 == null) {
                            this.field4090 = null;
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
                int var3 = var2.field6196;
                if (var3 == 1) {
                    if (field4108 > class465.method2818(255)) {
                        throw new IOException();
                    }
                    var2.field6200 = new Socket(InetAddress.getByName((String) var2.field6195), var2.field6197);
                } else if (var3 == 22) {
                    if (field4108 > class465.method2818(255)) {
                        throw new IOException();
                    }
                    try {
                        var2.field6200 = class476.method2851((String) var2.field6195, -119, var2.field6197).method1550(-122);
                    } catch (class200 var29) {
                        var2.field6200 = var29.getMessage();
                        throw var29;
                    }
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field6195);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field6197);
                    var2.field6200 = var4;
                } else if (var3 == 4) {
                    if (class465.method2818(255) < field4108) {
                        throw new IOException();
                    }
                    var2.field6200 = new DataInputStream(((URL) var2.field6195).openStream());
                } else if (var3 == 8) {
                    Object[] var5 = (Object[]) var2.field6195;
                    if (this.field4087 && ((Class) var5[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field6200 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 9) {
                    Object[] var22 = (Object[]) var2.field6195;
                    if (this.field4087 && ((Class) var22[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field6200 = ((Class) var22[0]).getDeclaredField((String) var22[1]);
                } else if (var3 == 18) {
                    Clipboard var6 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field6200 = var6.getContents(null);
                } else if (var3 == 19) {
                    Transferable var20 = (Transferable) var2.field6195;
                    Clipboard var21 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var21.setContents(var20, null);
                } else if (!this.field4087) {
                    throw new Exception("");
                } else if (var3 == 3) {
                    if (field4108 > class465.method2818(255)) {
                        throw new IOException();
                    }
                    String var19 = (var2.field6197 >> 24 & 0xFF) + "." + ((var2.field6197 & 0xFFBDA5) >> 16) + "." + (var2.field6197 >> 8 & 0xFF) + "." + (var2.field6197 & 0xFF);
                    var2.field6200 = InetAddress.getByName(var19).getHostName();
                } else if (var3 == 21) {
                    if (class465.method2818(255) < field4108) {
                        throw new IOException();
                    }
                    var2.field6200 = InetAddress.getByName((String) var2.field6195).getAddress();
                } else if (var3 == 5) {
                    if (this.field4100) {
                        var2.field6200 = this.field4097.method4039((byte) 126);
                    } else {
                        var2.field6200 = Class.forName("uca").getMethod("listmodes").invoke(this.field4105);
                    }
                } else if (var3 == 6) {
                    Frame var18 = new Frame("Jagex Full Screen");
                    var2.field6200 = var18;
                    var18.setResizable(false);
                    if (this.field4100) {
                        this.field4097.method4038(0, var2.field6197 >>> 16, var2.field6201 & 0xFFFF, var2.field6201 >> 16, var18, var2.field6197 & 0xFFFF);
                    } else {
                        Class.forName("uca").getMethod("enter", field4116 == null ? (field4116 = method1884("java.awt.Frame")) : field4116, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.field4105, var18, Integer.valueOf(var2.field6197 >>> 16), new Integer(var2.field6197 & 0xFFFF), Integer.valueOf(var2.field6201 >> 16), new Integer(var2.field6201 & 0xFFFF));
                    }
                } else if (var3 == 7) {
                    if (this.field4100) {
                        this.field4097.method4037(-88, (Frame) var2.field6195);
                    } else {
                        Class.forName("uca").getMethod("exit").invoke(this.field4105);
                    }
                } else if (var3 == 12) {
                    class322 var17 = method1879(field4093, field4099, (String) var2.field6195, (byte) -124);
                    var2.field6200 = var17;
                } else if (var3 == 13) {
                    class322 var7 = method1879(field4093, "", (String) var2.field6195, (byte) -73);
                    var2.field6200 = var7;
                } else if (this.field4087 && var3 == 14) {
                    int var15 = var2.field6197;
                    int var16 = var2.field6201;
                    if (this.field4100) {
                        this.field4098.method2254(var16, var15, false);
                    } else {
                        Class.forName("ff").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.field4104, Integer.valueOf(var15), new Integer(var16));
                    }
                } else if (this.field4087 && var3 == 15) {
                    boolean var8 = var2.field6197 != 0;
                    Component var9 = (Component) var2.field6195;
                    if (this.field4100) {
                        this.field4098.method2255(var9, (byte) -35, var8);
                    } else {
                        Class.forName("ff").getDeclaredMethod("showcursor", field4113 == null ? (field4113 = method1884("java.awt.Component")) : field4113, Boolean.TYPE).invoke(this.field4104, var9, Boolean.valueOf(var8));
                    }
                } else if (!this.field4100 && var3 == 17) {
                    Object[] var10 = (Object[]) var2.field6195;
                    Class.forName("ff").getDeclaredMethod("setcustomcursor", field4113 == null ? (field4113 = method1884("java.awt.Component")) : field4113, field4114 == null ? (field4114 = method1884("[I")) : field4114, Integer.TYPE, Integer.TYPE, field4115 == null ? (field4115 = method1884("java.awt.Point")) : field4115).invoke(this.field4104, (Component) var10[0], (int[]) var10[1], Integer.valueOf(var2.field6197), new Integer(var2.field6201), (Point) var10[2]);
                } else if (var3 == 16) {
                    try {
                        if (!field4089.startsWith("win")) {
                            throw new Exception();
                        }
                        String var11 = (String) var2.field6195;
                        if (!var11.startsWith("http://") && !var11.startsWith("https://")) {
                            throw new Exception();
                        }
                        String var12 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                        for (int var13 = 0; var13 < var11.length(); var13++) {
                            if (var12.indexOf(var11.charAt(var13)) == -1) {
                                throw new Exception();
                            }
                        }
                        Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var11 + "\"");
                        var2.field6200 = null;
                    } catch (Exception var31) {
                        var2.field6200 = var31;
                        throw var31;
                    }
                } else {
                    throw new Exception("");
                }
                var2.field6198 = 1;
            } catch (ThreadDeath var32) {
                throw var32;
            } catch (Throwable var33) {
                var2.field6198 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;B)Ljn;")
    private static final class322 method1879(int arg0, String arg1, String arg2, byte arg3) {
        if (arg3 >= -67) {
            method1879(-61, null, null, (byte) -29);
        }
        String var4;
        if (arg0 == 33) {
            var4 = "jagex_" + arg1 + "_preferences" + arg2 + "_rc.dat";
        } else if (arg0 == 34) {
            var4 = "jagex_" + arg1 + "_preferences" + arg2 + "_wip.dat";
        } else {
            var4 = "jagex_" + arg1 + "_preferences" + arg2 + ".dat";
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", field4094, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
        for (int var6 = 0; var6 < var5.length; var6++) {
            String var7 = var5[var6];
            if (var7.length() <= 0 || (new File(var7)).exists()) {
                try {
                    return new class322(new File(var7, var4), "rw", 10000L);
                } catch (Exception var9) {
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(IIIII)Lsca;")
    public final class432 method1880(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return arg3 <= 60 ? null : this.method1874((arg4 << 16) + arg0, (byte) -99, null, 6, (arg2 << 16) + arg1);
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(II)Lsca;")
    public final class432 method1881(int arg0, int arg1) {
        int var3 = -83 / ((-arg0 - 19) / 63);
        return this.method1874(0, (byte) -105, null, 3, arg1);
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;B)Lsca;")
    public final class432 method1882(Class arg0, String arg1, byte arg2) {
        if (arg2 >= -53) {
            this.field4106 = null;
        }
        return this.method1874(0, (byte) -100, new Object[] { arg0, arg1 }, 9, 0);
    }

    @OriginalMember(owner = "client!hga", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V")
    public class300(int arg0, String arg1, int arg2, boolean arg3) throws Exception {
        field4093 = arg0;
        field4086 = "Unknown";
        field4099 = arg1;
        field4095 = "1.1";
        this.field4087 = arg3;
        try {
            field4086 = System.getProperty("java.vendor");
            field4095 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        if (field4086.toLowerCase().indexOf("microsoft") != -1) {
            this.field4100 = true;
        }
        try {
            field4088 = System.getProperty("os.name");
        } catch (Exception var19) {
            field4088 = "Unknown";
        }
        field4089 = field4088.toLowerCase();
        try {
            field4103 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field4103 = "";
        }
        try {
            field4091 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
            field4091 = "";
        }
        try {
            field4094 = System.getProperty("user.home");
            if (field4094 != null) {
                field4094 = field4094 + "/";
            }
        } catch (Exception var16) {
        }
        if (field4094 == null) {
            field4094 = "~/";
        }
        try {
            this.field4106 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        if (!this.field4100) {
            try {
                field4109 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } catch (Exception var14) {
            }
            try {
                field4102 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } catch (Exception var13) {
            }
        }
        class155.method1115(0, field4093, field4099);
        if (this.field4087) {
            this.field4110 = new class322(class155.method1113("random.dat", 0, null, field4093), "rw", 25L);
            this.field4101 = new class322(class155.method1114("main_file_cache.dat2", -122), "rw", 209715200L);
            this.field4112 = new class322(class155.method1114("main_file_cache.idx255", -124), "rw", 1048576L);
            this.field4111 = new class322[arg2];
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field4111[var5] = new class322(class155.method1114("main_file_cache.idx" + var5, -120), "rw", 1048576L);
            }
            if (this.field4100) {
                try {
                    this.field4096 = Class.forName("jb").getDeclaredConstructor().newInstance();
                } catch (Throwable var12) {
                }
            }
            try {
                if (this.field4100) {
                    this.field4097 = new class719();
                } else {
                    this.field4105 = Class.forName("uca").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var11) {
            }
            try {
                if (this.field4100) {
                    this.field4098 = new class354();
                } else {
                    this.field4104 = Class.forName("ff").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var10) {
            }
        }
        if (this.field4087 && !this.field4100) {
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
        this.field4092 = false;
        this.field4085 = new Thread(this);
        this.field4085.setPriority(10);
        this.field4085.setDaemon(true);
        this.field4085.start();
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(ZLjava/lang/String;II)Lsca;")
    public final class432 method1883(boolean arg0, String arg1, int arg2, int arg3) {
        return arg3 == 0 ? this.method1874(0, (byte) -73, arg1, arg0 ? 22 : 1, arg2) : null;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1884(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
