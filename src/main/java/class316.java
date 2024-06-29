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

@OriginalClass("client!vc")
public class class316 implements Runnable {

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "Lsga;")
    public class68 field4376 = null;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "Lgca;")
    private class249 field4368 = null;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "Z")
    public boolean field4367 = false;

    @OriginalMember(owner = "client!vc", name = "A", descriptor = "Lsga;")
    public class68 field4392 = null;

    @OriginalMember(owner = "client!vc", name = "t", descriptor = "Z")
    public boolean field4385 = false;

    @OriginalMember(owner = "client!vc", name = "z", descriptor = "Lgca;")
    private class249 field4391 = null;

    @OriginalMember(owner = "client!vc", name = "x", descriptor = "Z")
    private boolean field4389 = false;

    @OriginalMember(owner = "client!vc", name = "r", descriptor = "Lsga;")
    public class68 field4383 = null;

    @OriginalMember(owner = "client!vc", name = "w", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field4388;

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "[Lsga;")
    public class68[] field4375;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "Ljava/lang/Object;")
    private Object field4373;

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "Ljava/lang/Object;")
    private Object field4378;

    @OriginalMember(owner = "client!vc", name = "s", descriptor = "Lil;")
    private class7 field4384;

    @OriginalMember(owner = "client!vc", name = "n", descriptor = "Ljava/lang/Object;")
    private Object field4379;

    @OriginalMember(owner = "client!vc", name = "v", descriptor = "Lbf;")
    private class536 field4387;

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "Ljava/lang/Thread;")
    private Thread field4372;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "J")
    private static volatile long field4370 = 0L;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "I")
    private static int field4369;

    // $FF: synthetic field
    @OriginalMember(owner = "client!vc", name = "C", descriptor = "Ljava/lang/Class;")
    public static Class field4394;

    // $FF: synthetic field
    @OriginalMember(owner = "client!vc", name = "D", descriptor = "Ljava/lang/Class;")
    public static Class field4395;

    // $FF: synthetic field
    @OriginalMember(owner = "client!vc", name = "E", descriptor = "Ljava/lang/Class;")
    public static Class field4396;

    // $FF: synthetic field
    @OriginalMember(owner = "client!vc", name = "F", descriptor = "Ljava/lang/Class;")
    public static Class field4397;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "Ljava/lang/String;")
    private static String field4366;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "Ljava/lang/String;")
    public static String field4371;

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "Ljava/lang/String;")
    public static String field4374;

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "Ljava/lang/String;")
    public static String field4377;

    @OriginalMember(owner = "client!vc", name = "o", descriptor = "Ljava/lang/String;")
    private static String field4380;

    @OriginalMember(owner = "client!vc", name = "p", descriptor = "Ljava/lang/String;")
    private static String field4381;

    @OriginalMember(owner = "client!vc", name = "q", descriptor = "Ljava/lang/String;")
    public static String field4382;

    @OriginalMember(owner = "client!vc", name = "u", descriptor = "Ljava/lang/String;")
    public static String field4386;

    @OriginalMember(owner = "client!vc", name = "y", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field4390;

    @OriginalMember(owner = "client!vc", name = "B", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field4393;

    // $FF: synthetic method
    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2056(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIILjava/lang/Object;I)Lgca;", line = 6)
    private final class249 method2036(int arg0, int arg1, int arg2, Object arg3, int arg4) {
        class249 var6 = new class249();
        var6.field3309 = arg4;
        if (arg0 != -1) {
            this.field4368 = null;
        }
        var6.field3308 = arg3;
        var6.field3314 = arg2;
        var6.field3312 = arg1;
        synchronized (this) {
            if (this.field4391 == null) {
                this.field4391 = this.field4368 = var6;
            } else {
                this.field4391.field3313 = var6;
                this.field4391 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ljava/lang/String;B)Lsga;", line = 39)
    public static final class68 method2037(String arg0, byte arg1) {
        return arg1 > -42 ? null : method2055(field4381, 16895, arg0, field4369);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB[ILjava/awt/Point;Ljava/awt/Component;I)Lgca;", line = 52)
    public final class249 method2038(int arg0, byte arg1, int[] arg2, Point arg3, Component arg4, int arg5) {
        return arg1 == 56 ? this.method2036(-1, 17, arg5, new Object[] { arg4, arg2, arg3 }, arg0) : null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)Lgca;", line = 63)
    public final class249 method2039(int arg0) {
        if (arg0 != 0) {
            this.method2045(98, null, null, null);
        }
        return this.method2036(-1, 5, 0, null, 0);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ljava/net/URL;I)Lgca;", line = 73)
    public final class249 method2040(URL arg0, int arg1) {
        int var3 = -110 / ((arg1 - 71) / 45);
        return this.method2036(-1, 4, 0, arg0, 0);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Lgca;", line = 86)
    public final class249 method2041(Class arg0, String arg1, int arg2) {
        if (arg2 <= 110) {
            field4366 = null;
        }
        return this.method2036(-1, 9, 0, new Object[] { arg0, arg1 }, 0);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ljava/lang/String;IZI)Lgca;", line = 99)
    public final class249 method2042(String arg0, int arg1, boolean arg2, int arg3) {
        return arg3 == 22 ? this.method2036(arg3 ^ 0xFFFFFFE9, arg2 ? 22 : 1, arg1, arg0, 0) : null;
    }

    @OriginalMember(owner = "client!vc", name = "run", descriptor = "()V", line = 110)
    public final void run() {
        while (true) {
            class249 var2;
            synchronized (this) {
                while (true) {
                    if (this.field4389) {
                        return;
                    }
                    if (this.field4368 != null) {
                        var2 = this.field4368;
                        this.field4368 = this.field4368.field3313;
                        if (this.field4368 == null) {
                            this.field4391 = null;
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
                int var3 = var2.field3312;
                if (var3 == 1) {
                    if (class479.method2864((byte) -93) < field4370) {
                        throw new IOException();
                    }
                    var2.field3311 = new Socket(InetAddress.getByName((String) var2.field3308), var2.field3314);
                } else if (var3 == 22) {
                    if (field4370 > class479.method2864((byte) -122)) {
                        throw new IOException();
                    }
                    try {
                        var2.field3311 = class639.method3546(48, var2.field3314, (String) var2.field3308).method1491(-122);
                    } catch (class733 var29) {
                        var2.field3311 = var29.getMessage();
                        throw var29;
                    }
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field3308);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field3314);
                    var2.field3311 = var4;
                } else if (var3 == 4) {
                    if (class479.method2864((byte) -42) < field4370) {
                        throw new IOException();
                    }
                    var2.field3311 = new DataInputStream(((URL) var2.field3308).openStream());
                } else if (var3 == 8) {
                    Object[] var22 = (Object[]) var2.field3308;
                    if (this.field4385 && ((Class) var22[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field3311 = ((Class) var22[0]).getDeclaredMethod((String) var22[1], (Class[]) var22[2]);
                } else if (var3 == 9) {
                    Object[] var21 = (Object[]) var2.field3308;
                    if (this.field4385 && ((Class) var21[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field3311 = ((Class) var21[0]).getDeclaredField((String) var21[1]);
                } else if (var3 == 18) {
                    Clipboard var5 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field3311 = var5.getContents(null);
                } else if (var3 == 19) {
                    Transferable var19 = (Transferable) var2.field3308;
                    Clipboard var20 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var20.setContents(var19, null);
                } else if (!this.field4385) {
                    throw new Exception("");
                } else if (var3 == 3) {
                    if (class479.method2864((byte) -84) < field4370) {
                        throw new IOException();
                    }
                    String var6 = (var2.field3314 >> 24 & 0xFF) + "." + ((var2.field3314 & 0xFF80DE) >> 16) + "." + (var2.field3314 >> 8 & 0xFF) + "." + (var2.field3314 & 0xFF);
                    var2.field3311 = InetAddress.getByName(var6).getHostName();
                } else if (var3 == 21) {
                    if (field4370 > class479.method2864((byte) -60)) {
                        throw new IOException();
                    }
                    var2.field3311 = InetAddress.getByName((String) var2.field3308).getAddress();
                } else if (var3 == 5) {
                    if (this.field4367) {
                        var2.field3311 = this.field4384.method47(0);
                    } else {
                        var2.field3311 = Class.forName("kl").getMethod("listmodes").invoke(this.field4378);
                    }
                } else if (var3 == 6) {
                    Frame var7 = new Frame("Jagex Full Screen");
                    var2.field3311 = var7;
                    var7.setResizable(false);
                    if (this.field4367) {
                        this.field4384.method46((byte) -122, var7, var2.field3314 & 0xFFFF, var2.field3309 & 0xFFFF, var2.field3309 >> 16, var2.field3314 >>> 16);
                    } else {
                        Class.forName("kl").getMethod("enter", field4394 == null ? (field4394 = method2056("java.awt.Frame")) : field4394, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.field4378, var7, Integer.valueOf(var2.field3314 >>> 16), new Integer(var2.field3314 & 0xFFFF), Integer.valueOf(var2.field3309 >> 16), new Integer(var2.field3309 & 0xFFFF));
                    }
                } else if (var3 == 7) {
                    if (this.field4367) {
                        this.field4384.method45(-126, (Frame) var2.field3308);
                    } else {
                        Class.forName("kl").getMethod("exit").invoke(this.field4378);
                    }
                } else if (var3 == 12) {
                    class68 var8 = method2055(field4381, 16895, (String) var2.field3308, field4369);
                    var2.field3311 = var8;
                } else if (var3 == 13) {
                    class68 var18 = method2055("", 16895, (String) var2.field3308, field4369);
                    var2.field3311 = var18;
                } else if (this.field4385 && var3 == 14) {
                    int var9 = var2.field3314;
                    int var10 = var2.field3309;
                    if (this.field4367) {
                        this.field4387.method3106(var10, var9, false);
                    } else {
                        Class.forName("f").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.field4379, Integer.valueOf(var9), new Integer(var10));
                    }
                } else if (this.field4385 && var3 == 15) {
                    boolean var11 = var2.field3314 != 0;
                    Component var12 = (Component) var2.field3308;
                    if (this.field4367) {
                        this.field4387.method3107(var12, var11, 105);
                    } else {
                        Class.forName("f").getDeclaredMethod("showcursor", field4395 == null ? (field4395 = method2056("java.awt.Component")) : field4395, Boolean.TYPE).invoke(this.field4379, var12, Boolean.valueOf(var11));
                    }
                } else if (!this.field4367 && var3 == 17) {
                    Object[] var13 = (Object[]) var2.field3308;
                    Class.forName("f").getDeclaredMethod("setcustomcursor", field4395 == null ? (field4395 = method2056("java.awt.Component")) : field4395, field4396 == null ? (field4396 = method2056("[I")) : field4396, Integer.TYPE, Integer.TYPE, field4397 == null ? (field4397 = method2056("java.awt.Point")) : field4397).invoke(this.field4379, (Component) var13[0], (int[]) var13[1], Integer.valueOf(var2.field3314), new Integer(var2.field3309), (Point) var13[2]);
                } else if (var3 == 16) {
                    try {
                        if (!field4377.startsWith("win")) {
                            throw new Exception();
                        }
                        String var14 = (String) var2.field3308;
                        if (!var14.startsWith("http://") && !var14.startsWith("https://")) {
                            throw new Exception();
                        }
                        String var15 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                        for (int var16 = 0; var14.length() > var16; var16++) {
                            if (var15.indexOf(var14.charAt(var16)) == -1) {
                                throw new Exception();
                            }
                        }
                        Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var14 + "\"");
                        var2.field3311 = null;
                    } catch (Exception var31) {
                        var2.field3311 = var31;
                        throw var31;
                    }
                } else {
                    throw new Exception("");
                }
                var2.field3310 = 1;
            } catch (ThreadDeath var32) {
                throw var32;
            } catch (Throwable var33) {
                var2.field3310 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)Z", line = 408)
    public final boolean method2043(int arg0) {
        if (arg0 != 18) {
            this.field4368 = null;
        }
        if (!this.field4385) {
            return false;
        } else if (this.field4367) {
            return this.field4384 != null;
        } else {
            return this.field4378 != null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILjava/lang/String;)Lgca;", line = 432)
    public final class249 method2044(int arg0, String arg1) {
        if (arg0 <= 35) {
            field4374 = null;
        }
        return this.method2036(-1, 16, 0, arg1, 0);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILjava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)Lgca;", line = 445)
    public final class249 method2045(int arg0, String arg1, Class[] arg2, Class arg3) {
        return arg0 == 255 ? this.method2036(arg0 ^ 0xFFFFFF00, 8, 0, new Object[] { arg3, arg1, arg2 }, 0) : null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lgca;", line = 465)
    public final class249 method2046(int arg0, Runnable arg1, int arg2) {
        if (arg0 != 2) {
            field4386 = null;
        }
        return this.method2036(-1, 2, arg2, arg1, 0);
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(I)V", line = 478)
    public final void method2047(int arg0) {
        if (arg0 > -35) {
            this.method2050(43, null, null);
        }
        field4370 = class479.method2864((byte) -128) + 5000L;
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V", line = 701)
    public class316(int arg0, String arg1, int arg2, boolean arg3) throws Exception {
        field4382 = "1.1";
        this.field4385 = arg3;
        field4374 = "Unknown";
        field4381 = arg1;
        field4369 = arg0;
        try {
            field4374 = System.getProperty("java.vendor");
            field4382 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        if (field4374.toLowerCase().indexOf("microsoft") != -1) {
            this.field4367 = true;
        }
        try {
            field4380 = System.getProperty("os.name");
        } catch (Exception var19) {
            field4380 = "Unknown";
        }
        field4377 = field4380.toLowerCase();
        try {
            field4386 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field4386 = "";
        }
        try {
            field4371 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
            field4371 = "";
        }
        try {
            field4366 = System.getProperty("user.home");
            if (field4366 != null) {
                field4366 = field4366 + "/";
            }
        } catch (Exception var16) {
        }
        if (field4366 == null) {
            field4366 = "~/";
        }
        try {
            this.field4388 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        if (!this.field4367) {
            try {
                field4390 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } catch (Exception var14) {
            }
            try {
                field4393 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } catch (Exception var13) {
            }
        }
        class685.method3834(field4381, field4369, false);
        if (this.field4385) {
            this.field4392 = new class68(class685.method3833("random.dat", null, field4369, (byte) 123), "rw", 25L);
            this.field4383 = new class68(class685.method3835("main_file_cache.dat2", -1), "rw", 209715200L);
            this.field4376 = new class68(class685.method3835("main_file_cache.idx255", -1), "rw", 1048576L);
            this.field4375 = new class68[arg2];
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field4375[var5] = new class68(class685.method3835("main_file_cache.idx" + var5, -1), "rw", 1048576L);
            }
            if (this.field4367) {
                try {
                    this.field4373 = Class.forName("ffa").getDeclaredConstructor().newInstance();
                } catch (Throwable var12) {
                }
            }
            try {
                if (this.field4367) {
                    this.field4384 = new class7();
                } else {
                    this.field4378 = Class.forName("kl").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var11) {
            }
            try {
                if (this.field4367) {
                    this.field4387 = new class536();
                } else {
                    this.field4379 = Class.forName("f").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var10) {
            }
        }
        if (this.field4385 && !this.field4367) {
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
        this.field4389 = false;
        this.field4372 = new Thread(this);
        this.field4372.setPriority(10);
        this.field4372.setDaemon(true);
        this.field4372.start();
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ZLjava/lang/String;I)Lgca;", line = 496)
    public final class249 method2048(boolean arg0, String arg1, int arg2) {
        if (arg2 != -4053) {
            this.method2044(-33, null);
        }
        return arg0 ? this.method2036(arg2 + 4052, 12, 0, arg1, 0) : this.method2036(-1, 13, 0, arg1, 0);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Z)V", line = 511)
    public final void method2049(boolean arg0) {
        synchronized (this) {
            this.field4389 = true;
            if (arg0) {
                return;
            }
            this.notifyAll();
        }
        try {
            this.field4372.join();
        } catch (InterruptedException var10) {
        }
        if (this.field4383 != null) {
            try {
                this.field4383.method562(-13);
            } catch (IOException var9) {
            }
        }
        if (this.field4376 != null) {
            try {
                this.field4376.method562(-87);
            } catch (IOException var8) {
            }
        }
        if (this.field4375 != null) {
            for (int var3 = 0; var3 < this.field4375.length; var3++) {
                if (this.field4375[var3] != null) {
                    try {
                        this.field4375[var3].method562(127);
                    } catch (IOException var7) {
                    }
                }
            }
        }
        if (this.field4392 != null) {
            try {
                this.field4392.method562(124);
            } catch (IOException var6) {
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILjava/io/File;[B)Z", line = 576)
    public final boolean method2050(int arg0, File arg1, byte[] arg2) {
        try {
            FileOutputStream var4 = new FileOutputStream(arg1);
            var4.write(arg2, arg0, arg2.length);
            var4.close();
            return true;
        } catch (IOException var5) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIII)Lgca;", line = 594)
    public final class249 method2051(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = 72 / ((-arg1 - 15) / 33);
        return this.method2036(-1, 6, (arg4 << 16) + arg2, null, (arg3 << 16) + arg0);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB)Lgca;", line = 612)
    public final class249 method2052(int arg0, byte arg1) {
        return arg1 == 0 ? this.method2036(-1, 3, arg0, null, 0) : null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)Ljava/lang/Object;", line = 625)
    public final Object method2053(byte arg0) {
        return arg0 < 101 ? null : this.field4373;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ljava/awt/Frame;I)Lgca;", line = 635)
    public final class249 method2054(Frame arg0, int arg1) {
        if (arg1 >= -50) {
            this.field4383 = null;
        }
        return this.method2036(-1, 7, 0, arg0, 0);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Lsga;", line = 650)
    private static final class68 method2055(String arg0, int arg1, String arg2, int arg3) {
        String var4;
        if (arg3 == 33) {
            var4 = "jagex_" + arg0 + "_preferences" + arg2 + "_rc.dat";
        } else if (arg3 == 34) {
            var4 = "jagex_" + arg0 + "_preferences" + arg2 + "_wip.dat";
        } else {
            var4 = "jagex_" + arg0 + "_preferences" + arg2 + ".dat";
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", field4366, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
        if (arg1 != 16895) {
            field4382 = null;
        }
        for (int var6 = 0; var6 < var5.length; var6++) {
            String var7 = var5[var6];
            if (var7.length() <= 0 || (new File(var7)).exists()) {
                try {
                    return new class68(new File(var7, var4), "rw", 10000L);
                } catch (Exception var9) {
                }
            }
        }
        return null;
    }
}
