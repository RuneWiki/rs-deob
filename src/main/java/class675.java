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

@OriginalClass("client!lc")
public class class675 implements Runnable {

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "Z")
    private boolean field9251 = false;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "Lpga;")
    private class561 field9254 = null;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "Lea;")
    public class573 field9245 = null;

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "Z")
    public boolean field9260 = false;

    @OriginalMember(owner = "client!lc", name = "u", descriptor = "Lea;")
    public class573 field9265 = null;

    @OriginalMember(owner = "client!lc", name = "A", descriptor = "Z")
    public boolean field9271 = false;

    @OriginalMember(owner = "client!lc", name = "t", descriptor = "Lea;")
    public class573 field9264 = null;

    @OriginalMember(owner = "client!lc", name = "B", descriptor = "Lpga;")
    private class561 field9272 = null;

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field9259;

    @OriginalMember(owner = "client!lc", name = "y", descriptor = "[Lea;")
    public class573[] field9269;

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "Ljava/lang/Object;")
    private Object field9257;

    @OriginalMember(owner = "client!lc", name = "v", descriptor = "Ljava/lang/Object;")
    private Object field9266;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "Lpi;")
    private class524 field9249;

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "Ljava/lang/Object;")
    private Object field9256;

    @OriginalMember(owner = "client!lc", name = "x", descriptor = "Lnaa;")
    private class79 field9268;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "Ljava/lang/Thread;")
    private Thread field9248;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "J")
    private static volatile long field9250 = 0L;

    @OriginalMember(owner = "client!lc", name = "r", descriptor = "I")
    private static int field9262;

    // $FF: synthetic field
    @OriginalMember(owner = "client!lc", name = "C", descriptor = "Ljava/lang/Class;")
    public static Class field9273;

    // $FF: synthetic field
    @OriginalMember(owner = "client!lc", name = "D", descriptor = "Ljava/lang/Class;")
    public static Class field9274;

    // $FF: synthetic field
    @OriginalMember(owner = "client!lc", name = "E", descriptor = "Ljava/lang/Class;")
    public static Class field9275;

    // $FF: synthetic field
    @OriginalMember(owner = "client!lc", name = "F", descriptor = "Ljava/lang/Class;")
    public static Class field9276;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "Ljava/lang/String;")
    private static String field9246;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "Ljava/lang/String;")
    private static String field9252;

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "Ljava/lang/String;")
    public static String field9253;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "Ljava/lang/String;")
    private static String field9255;

    @OriginalMember(owner = "client!lc", name = "q", descriptor = "Ljava/lang/String;")
    public static String field9261;

    @OriginalMember(owner = "client!lc", name = "s", descriptor = "Ljava/lang/String;")
    public static String field9263;

    @OriginalMember(owner = "client!lc", name = "w", descriptor = "Ljava/lang/String;")
    public static String field9267;

    @OriginalMember(owner = "client!lc", name = "z", descriptor = "Ljava/lang/String;")
    public static String field9270;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field9247;

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field9258;

    // $FF: synthetic method
    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3806(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!lc", name = "run", descriptor = "()V", line = 7)
    public final void run() {
        while (true) {
            class561 var2;
            synchronized (this) {
                while (true) {
                    if (this.field9251) {
                        return;
                    }
                    if (this.field9272 != null) {
                        var2 = this.field9272;
                        this.field9272 = this.field9272.field7765;
                        if (this.field9272 == null) {
                            this.field9254 = null;
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
                int var3 = var2.field7771;
                if (var3 == 1) {
                    if (class349.method2069(true) < field9250) {
                        throw new IOException();
                    }
                    var2.field7768 = new Socket(InetAddress.getByName((String) var2.field7766), var2.field7767);
                } else if (var3 == 22) {
                    if (class349.method2069(true) < field9250) {
                        throw new IOException();
                    }
                    try {
                        var2.field7768 = class532.method3170(64, var2.field7767, (String) var2.field7766).method1566(0);
                    } catch (class480 var29) {
                        var2.field7768 = var29.getMessage();
                        throw var29;
                    }
                } else if (var3 == 2) {
                    Thread var5 = new Thread((Runnable) var2.field7766);
                    var5.setDaemon(true);
                    var5.start();
                    var5.setPriority(var2.field7767);
                    var2.field7768 = var5;
                } else if (var3 == 4) {
                    if (field9250 > class349.method2069(true)) {
                        throw new IOException();
                    }
                    var2.field7768 = new DataInputStream(((URL) var2.field7766).openStream());
                } else if (var3 == 8) {
                    Object[] var23 = (Object[]) var2.field7766;
                    if (this.field9271 && ((Class) var23[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field7768 = ((Class) var23[0]).getDeclaredMethod((String) var23[1], (Class[]) var23[2]);
                } else if (var3 == 9) {
                    Object[] var6 = (Object[]) var2.field7766;
                    if (this.field9271 && ((Class) var6[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field7768 = ((Class) var6[0]).getDeclaredField((String) var6[1]);
                } else if (var3 == 18) {
                    Clipboard var22 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field7768 = var22.getContents(null);
                } else if (var3 == 19) {
                    Transferable var20 = (Transferable) var2.field7766;
                    Clipboard var21 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var21.setContents(var20, null);
                } else if (!this.field9271) {
                    throw new Exception("");
                } else if (var3 == 3) {
                    if (field9250 > class349.method2069(true)) {
                        throw new IOException();
                    }
                    String var7 = (var2.field7767 >> 24 & 0xFF) + "." + (var2.field7767 >> 16 & 0xFF) + "." + (var2.field7767 >> 8 & 0xFF) + "." + (var2.field7767 & 0xFF);
                    var2.field7768 = InetAddress.getByName(var7).getHostName();
                } else if (var3 == 21) {
                    if (field9250 > class349.method2069(true)) {
                        throw new IOException();
                    }
                    var2.field7768 = InetAddress.getByName((String) var2.field7766).getAddress();
                } else if (var3 == 5) {
                    if (this.field9260) {
                        var2.field7768 = this.field9249.method3143(-125);
                    } else {
                        var2.field7768 = Class.forName("fh").getMethod("listmodes").invoke(this.field9266);
                    }
                } else if (var3 == 6) {
                    Frame var19 = new Frame("Jagex Full Screen");
                    var2.field7768 = var19;
                    var19.setResizable(false);
                    if (this.field9260) {
                        this.field9249.method3141(var2.field7767 & 0xFFFF, var2.field7770 >> 16, var19, var2.field7767 >>> 16, 28795, var2.field7770 & 0xFFFF);
                    } else {
                        Class.forName("fh").getMethod("enter", field9276 == null ? (field9276 = method3806("java.awt.Frame")) : field9276, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.field9266, var19, Integer.valueOf(var2.field7767 >>> 16), new Integer(var2.field7767 & 0xFFFF), Integer.valueOf(var2.field7770 >> 16), new Integer(var2.field7770 & 0xFFFF));
                    }
                } else if (var3 == 7) {
                    if (this.field9260) {
                        this.field9249.method3142(false, (Frame) var2.field7766);
                    } else {
                        Class.forName("fh").getMethod("exit").invoke(this.field9266);
                    }
                } else if (var3 == 12) {
                    class573 var8 = method3795((String) var2.field7766, field9262, field9246, 10000);
                    var2.field7768 = var8;
                } else if (var3 == 13) {
                    class573 var18 = method3795((String) var2.field7766, field9262, "", 10000);
                    var2.field7768 = var18;
                } else if (this.field9271 && var3 == 14) {
                    int var16 = var2.field7767;
                    int var17 = var2.field7770;
                    if (this.field9260) {
                        this.field9268.method718(var17, var16, (byte) -108);
                    } else {
                        Class.forName("ai").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.field9256, Integer.valueOf(var16), new Integer(var17));
                    }
                } else if (this.field9271 && var3 == 15) {
                    boolean var9 = var2.field7767 != 0;
                    Component var10 = (Component) var2.field7766;
                    if (this.field9260) {
                        this.field9268.method717(true, var10, var9);
                    } else {
                        Class.forName("ai").getDeclaredMethod("showcursor", field9273 == null ? (field9273 = method3806("java.awt.Component")) : field9273, Boolean.TYPE).invoke(this.field9256, var10, Boolean.valueOf(var9));
                    }
                } else if (!this.field9260 && var3 == 17) {
                    Object[] var11 = (Object[]) var2.field7766;
                    Class.forName("ai").getDeclaredMethod("setcustomcursor", field9273 == null ? (field9273 = method3806("java.awt.Component")) : field9273, field9274 == null ? (field9274 = method3806("[I")) : field9274, Integer.TYPE, Integer.TYPE, field9275 == null ? (field9275 = method3806("java.awt.Point")) : field9275).invoke(this.field9256, (Component) var11[0], (int[]) var11[1], Integer.valueOf(var2.field7767), new Integer(var2.field7770), (Point) var11[2]);
                } else if (var3 == 16) {
                    try {
                        if (!field9263.startsWith("win")) {
                            throw new Exception();
                        }
                        String var12 = (String) var2.field7766;
                        if (!var12.startsWith("http://") && !var12.startsWith("https://")) {
                            throw new Exception();
                        }
                        String var13 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                        for (int var14 = 0; var14 < var12.length(); var14++) {
                            if (var13.indexOf(var12.charAt(var14)) == -1) {
                                throw new Exception();
                            }
                        }
                        Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var12 + "\"");
                        var2.field7768 = null;
                    } catch (Exception var31) {
                        var2.field7768 = var31;
                        throw var31;
                    }
                } else {
                    throw new Exception("");
                }
                var2.field7769 = 1;
            } catch (ThreadDeath var32) {
                throw var32;
            } catch (Throwable var33) {
                var2.field7769 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(BLjava/net/URL;)Lpga;", line = 301)
    public final class561 method3786(byte arg0, URL arg1) {
        if (arg0 != -67) {
            this.run();
        }
        return this.method3801(0, 0, 4, 0, arg1);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ljava/lang/Class;[Ljava/lang/Class;Ljava/lang/String;B)Lpga;", line = 311)
    public final class561 method3787(Class arg0, Class[] arg1, String arg2, byte arg3) {
        if (arg3 != -53) {
            field9263 = null;
        }
        return this.method3801(0, arg3 + 53, 8, 0, new Object[] { arg0, arg2, arg1 });
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V", line = 322)
    public final void method3788(byte arg0) {
        synchronized (this) {
            this.field9251 = true;
            this.notifyAll();
        }
        try {
            this.field9248.join();
        } catch (InterruptedException var8) {
        }
        if (arg0 != 94) {
            field9261 = null;
        }
        if (this.field9265 != null) {
            try {
                this.field9265.method3319(127);
            } catch (IOException var7) {
            }
        }
        if (this.field9264 != null) {
            try {
                this.field9264.method3319(arg0 ^ 0x20);
            } catch (IOException var6) {
            }
        }
        if (this.field9269 != null) {
            for (int var3 = 0; var3 < this.field9269.length; var3++) {
                if (this.field9269[var3] != null) {
                    try {
                        this.field9269[var3].method3319(126);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field9245 != null) {
            try {
                this.field9245.method3319(122);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)V", line = 378)
    public final void method3789(boolean arg0) {
        field9250 = class349.method2069(!arg0) + 5000L;
        if (arg0) {
            this.field9249 = null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ljava/lang/String;IIZ)Lpga;", line = 390)
    public final class561 method3790(String arg0, int arg1, int arg2, boolean arg3) {
        if (arg1 != 27007) {
            field9258 = null;
        }
        return this.method3801(0, 0, arg3 ? 22 : 1, arg2, arg0);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)Z", line = 402)
    public final boolean method3791(int arg0) {
        if (arg0 >= -85) {
            this.method3794(null, -91, null, null, 9, -4);
        }
        if (!this.field9271) {
            return false;
        } else if (this.field9260) {
            return this.field9249 != null;
        } else {
            return this.field9266 != null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZZLjava/lang/String;)Lpga;", line = 422)
    public final class561 method3792(boolean arg0, boolean arg1, String arg2) {
        if (arg1) {
            return null;
        } else if (arg0) {
            return this.method3801(0, 0, 12, 0, arg2);
        } else {
            return this.method3801(0, 0, 13, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V", line = 704)
    public class675(int arg0, String arg1, int arg2, boolean arg3) throws Exception {
        this.field9271 = arg3;
        field9270 = "Unknown";
        field9246 = arg1;
        field9267 = "1.1";
        field9262 = arg0;
        try {
            field9270 = System.getProperty("java.vendor");
            field9267 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        if (field9270.toLowerCase().indexOf("microsoft") != -1) {
            this.field9260 = true;
        }
        try {
            field9252 = System.getProperty("os.name");
        } catch (Exception var19) {
            field9252 = "Unknown";
        }
        field9263 = field9252.toLowerCase();
        try {
            field9261 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field9261 = "";
        }
        try {
            field9253 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
            field9253 = "";
        }
        try {
            field9255 = System.getProperty("user.home");
            if (field9255 != null) {
                field9255 = field9255 + "/";
            }
        } catch (Exception var16) {
        }
        if (field9255 == null) {
            field9255 = "~/";
        }
        try {
            this.field9259 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        if (!this.field9260) {
            try {
                field9258 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } catch (Exception var14) {
            }
            try {
                field9247 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } catch (Exception var13) {
            }
        }
        class125.method966(field9262, field9246, -3);
        if (this.field9271) {
            this.field9245 = new class573(class125.method965(-3, field9262, null, "random.dat"), "rw", 25L);
            this.field9265 = new class573(class125.method967(1, "main_file_cache.dat2"), "rw", 314572800L);
            this.field9264 = new class573(class125.method967(1, "main_file_cache.idx255"), "rw", 1048576L);
            this.field9269 = new class573[arg2];
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field9269[var5] = new class573(class125.method967(1, "main_file_cache.idx" + var5), "rw", 1048576L);
            }
            if (this.field9260) {
                try {
                    this.field9257 = Class.forName("rba").getDeclaredConstructor().newInstance();
                } catch (Throwable var12) {
                }
            }
            try {
                if (this.field9260) {
                    this.field9249 = new class524();
                } else {
                    this.field9266 = Class.forName("fh").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var11) {
            }
            try {
                if (this.field9260) {
                    this.field9268 = new class79();
                } else {
                    this.field9256 = Class.forName("ai").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var10) {
            }
        }
        if (this.field9271 && !this.field9260) {
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
        this.field9251 = false;
        this.field9248 = new Thread(this);
        this.field9248.setPriority(10);
        this.field9248.setDaemon(true);
        this.field9248.start();
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ljava/lang/String;I)Lpga;", line = 448)
    public final class561 method3793(String arg0, int arg1) {
        if (arg1 <= 121) {
            this.method3793(null, -30);
        }
        return this.method3801(0, 0, 16, 0, arg0);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "([IILjava/awt/Component;Ljava/awt/Point;II)Lpga;", line = 460)
    public final class561 method3794(int[] arg0, int arg1, Component arg2, Point arg3, int arg4, int arg5) {
        if (arg1 != 5) {
            field9270 = null;
        }
        return this.method3801(arg4, arg1 ^ 0x5, 17, arg5, new Object[] { arg2, arg0, arg3 });
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Lea;", line = 470)
    private static final class573 method3795(String arg0, int arg1, String arg2, int arg3) {
        String var4;
        if (arg1 == 33) {
            var4 = "jagex_" + arg2 + "_preferences" + arg0 + "_rc.dat";
        } else if (arg1 == 34) {
            var4 = "jagex_" + arg2 + "_preferences" + arg0 + "_wip.dat";
        } else {
            var4 = "jagex_" + arg2 + "_preferences" + arg0 + ".dat";
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", field9255, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
        if (arg3 != 10000) {
            method3798(null, (byte) -124);
        }
        for (int var6 = 0; var6 < var5.length; var6++) {
            String var7 = var5[var6];
            if (var7.length() <= 0 || (new File(var7)).exists()) {
                try {
                    return new class573(new File(var7, var4), "rw", 10000L);
                } catch (Exception var9) {
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ljava/awt/Frame;I)Lpga;", line = 515)
    public final class561 method3796(Frame arg0, int arg1) {
        return arg1 >= -96 ? null : this.method3801(0, 0, 7, 0, arg0);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Lpga;", line = 527)
    public final class561 method3797(Class arg0, int arg1, String arg2) {
        if (arg1 < 44) {
            this.method3799(26, -85, -4, 14, 54);
        }
        return this.method3801(0, 0, 9, 0, new Object[] { arg0, arg2 });
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ljava/lang/String;B)Lea;", line = 539)
    public static final class573 method3798(String arg0, byte arg1) {
        return arg1 < 71 ? null : method3795(arg0, field9262, field9246, 10000);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIII)Lpga;", line = 552)
    public final class561 method3799(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return arg1 == -10013 ? this.method3801((arg0 << 16) + arg3, 0, 6, (arg2 << 16) + arg4, null) : null;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(Z)Ljava/lang/Object;", line = 566)
    public final Object method3800(boolean arg0) {
        return arg0 ? this.field9257 : null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIILjava/lang/Object;)Lpga;", line = 584)
    private final class561 method3801(int arg0, int arg1, int arg2, int arg3, Object arg4) {
        class561 var6 = new class561();
        var6.field7767 = arg3;
        var6.field7766 = arg4;
        var6.field7771 = arg2;
        var6.field7770 = arg0;
        synchronized (this) {
            if (arg1 != 0) {
                field9261 = null;
            }
            if (this.field9254 == null) {
                this.field9254 = this.field9272 = var6;
            } else {
                this.field9254.field7765 = var6;
                this.field9254 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I[BLjava/io/File;)Z", line = 633)
    public final boolean method3802(int arg0, byte[] arg1, File arg2) {
        try {
            FileOutputStream var4 = new FileOutputStream(arg2);
            if (arg0 != -500006096) {
                this.field9265 = null;
            }
            var4.write(arg1, 0, arg1.length);
            var4.close();
            return true;
        } catch (IOException var5) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(Z)Lpga;", line = 654)
    public final class561 method3803(boolean arg0) {
        if (arg0) {
            this.method3803(false);
        }
        return this.method3801(0, 0, 5, 0, null);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)Lpga;", line = 664)
    public final class561 method3804(int arg0, int arg1) {
        return arg0 < 65 ? null : this.method3801(0, 0, 3, arg1, null);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IILjava/lang/Runnable;)Lpga;", line = 687)
    public final class561 method3805(int arg0, int arg1, Runnable arg2) {
        int var4 = 59 / ((arg1 + 1) / 52);
        return this.method3801(0, 0, 2, arg0, arg2);
    }
}
