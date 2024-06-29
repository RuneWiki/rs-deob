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

@OriginalClass("client!dr")
public class class504 implements Runnable {

    @OriginalMember(owner = "client!dr", name = "h", descriptor = "Z")
    private boolean field7415 = false;

    @OriginalMember(owner = "client!dr", name = "g", descriptor = "Lgq;")
    public class355 field7414 = null;

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "Lgq;")
    public class355 field7410 = null;

    @OriginalMember(owner = "client!dr", name = "k", descriptor = "Ljv;")
    private class56 field7418 = null;

    @OriginalMember(owner = "client!dr", name = "p", descriptor = "Ljv;")
    private class56 field7423 = null;

    @OriginalMember(owner = "client!dr", name = "r", descriptor = "Ljava/applet/Applet;")
    public Applet field7425 = null;

    @OriginalMember(owner = "client!dr", name = "n", descriptor = "Lgq;")
    public class355 field7421 = null;

    @OriginalMember(owner = "client!dr", name = "i", descriptor = "Ljava/lang/String;")
    private String field7416;

    @OriginalMember(owner = "client!dr", name = "d", descriptor = "I")
    private int field7411;

    @OriginalMember(owner = "client!dr", name = "l", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field7419;

    @OriginalMember(owner = "client!dr", name = "q", descriptor = "Ljava/lang/Thread;")
    private Thread field7424;

    @OriginalMember(owner = "client!dr", name = "j", descriptor = "I")
    public static int field7417 = 3;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field7408 = new Hashtable(16);

    @OriginalMember(owner = "client!dr", name = "x", descriptor = "J")
    public static volatile long field7431 = 0L;

    @OriginalMember(owner = "client!dr", name = "f", descriptor = "Lhp;")
    private class215 field7413;

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "Ljava/lang/String;")
    public static String field7409;

    @OriginalMember(owner = "client!dr", name = "e", descriptor = "Ljava/lang/String;")
    public static String field7412;

    @OriginalMember(owner = "client!dr", name = "m", descriptor = "Ljava/lang/String;")
    public static String field7420;

    @OriginalMember(owner = "client!dr", name = "o", descriptor = "Ljava/lang/String;")
    public static String field7422;

    @OriginalMember(owner = "client!dr", name = "s", descriptor = "Ljava/lang/String;")
    public static String field7426;

    @OriginalMember(owner = "client!dr", name = "t", descriptor = "Ljava/lang/String;")
    private static String field7427;

    @OriginalMember(owner = "client!dr", name = "u", descriptor = "Ljava/lang/String;")
    public static String field7428;

    @OriginalMember(owner = "client!dr", name = "w", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field7430;

    @OriginalMember(owner = "client!dr", name = "y", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field7432;

    @OriginalMember(owner = "client!dr", name = "v", descriptor = "[Lgq;")
    public class355[] field7429;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(BI)Ljv;", line = 4)
    public final class56 method2949(byte arg0, int arg1) {
        return arg0 == 28 ? this.method2963(arg1, arg0 ^ 0x69, null, 0, 3) : null;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(B)V", line = 15)
    public final void method2950(byte arg0) {
        synchronized (this) {
            this.field7415 = true;
            int var3 = 82 / ((-arg0 - 35) / 58);
            this.notifyAll();
        }
        try {
            this.field7424.join();
        } catch (InterruptedException var9) {
        }
        if (this.field7410 != null) {
            try {
                this.field7410.method2126(-1);
            } catch (IOException var8) {
            }
        }
        if (this.field7414 != null) {
            try {
                this.field7414.method2126(-1);
            } catch (IOException var7) {
            }
        }
        if (this.field7429 != null) {
            for (int var4 = 0; var4 < this.field7429.length; var4++) {
                if (this.field7429[var4] != null) {
                    try {
                        this.field7429[var4].method2126(-1);
                    } catch (IOException var6) {
                    }
                }
            }
        }
        if (this.field7421 != null) {
            try {
                this.field7421.method2126(-1);
            } catch (IOException var5) {
            }
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Ljava/awt/Frame;I)Ljv;", line = 69)
    public final class56 method2951(Frame arg0, int arg1) {
        if (arg1 != 28944) {
            field7431 = -32L;
        }
        return this.method2963(0, 66, arg0, 0, 7);
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IZLjava/lang/String;)Ljv;", line = 83)
    public final class56 method2952(int arg0, boolean arg1, String arg2) {
        if (arg1) {
            field7422 = null;
        }
        return this.method2963(arg0, 80, arg2, 0, 1);
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIIILjava/lang/Object;)Ljv;", line = 94)
    private final class56 method2953(int arg0, int arg1, int arg2, int arg3, Object arg4) {
        class56 var6 = new class56();
        synchronized (var6) {
            var6.field665 = arg0;
            var6.field668 = arg2;
            if (arg3 >= -53) {
                this.field7419 = null;
            }
            var6.field669 = arg4;
            synchronized (this) {
                if (this.field7423 == null) {
                    this.field7423 = this.field7418 = var6;
                } else {
                    this.field7423.field666 = var6;
                    this.field7423 = var6;
                }
                this.notify();
            }
            try {
                var6.wait();
            } catch (InterruptedException var9) {
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(ILjava/lang/String;)Ljv;", line = 132)
    public final class56 method2954(int arg0, String arg1) {
        if (arg0 != -29744) {
            field7430 = null;
        }
        return this.method2963(0, 63, arg1, 0, 12);
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "([IILjava/awt/Point;BLjava/awt/Component;I)Ljv;", line = 142)
    public final class56 method2955(int[] arg0, int arg1, Point arg2, byte arg3, Component arg4, int arg5) {
        if (arg3 >= -18) {
            field7422 = null;
        }
        return this.method2963(arg1, 104, new Object[] { arg4, arg0, arg2 }, arg5, 17);
    }

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "(B)V", line = 152)
    public final void method2956(byte arg0) {
        int var2 = 21 / ((77 - arg0) / 45);
        field7431 = class246.method1483(5957) + 5000L;
    }

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "(B)Ljv;", line = 162)
    public final class56 method2957(byte arg0) {
        int var2 = -108 / ((arg0 - 1) / 38);
        return this.method2963(0, 103, null, 0, 18);
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(BILjava/lang/String;Ljava/lang/String;)Ljava/io/File;", line = 174)
    public static final File method2958(byte arg0, int arg1, String arg2, String arg3) {
        File var4 = (File) field7408.get(arg2);
        if (var4 != null) {
            return var4;
        }
        if (arg0 > -120) {
            field7412 = null;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field7427, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < var6.length; var8++) {
                for (int var9 = 0; var9 < var5.length; var9++) {
                    String var10 = var5[var9] + var6[var8] + "/" + (arg3 == null ? "" : arg3 + "/") + arg2;
                    RandomAccessFile var11 = null;
                    try {
                        File var12 = new File(var10);
                        if (var7 != 0 || var12.exists()) {
                            String var13 = var5[var9];
                            if (var7 != 1 || var13.length() <= 0 || (new File(var13)).exists()) {
                                (new File(var5[var9] + var6[var8])).mkdir();
                                if (arg3 != null) {
                                    (new File(var5[var9] + var6[var8] + "/" + arg3)).mkdir();
                                }
                                var11 = new RandomAccessFile(var12, "rw");
                                int var14 = var11.read();
                                var11.seek(0L);
                                var11.write(var14);
                                var11.seek(0L);
                                var11.close();
                                field7408.put(arg2, var12);
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
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(ILjava/lang/Class;)Ljv;", line = 263)
    public final class56 method2959(int arg0, Class arg1) {
        if (arg0 != -6986) {
            this.field7424 = null;
        }
        return this.method2963(0, arg0 + 7036, arg1, 0, 20);
    }

    @OriginalMember(owner = "client!dr", name = "run", descriptor = "()V", line = 276)
    public final void run() {
        while (true) {
            class56 var2;
            synchronized (this) {
                while (true) {
                    if (this.field7415) {
                        return;
                    }
                    if (this.field7418 != null) {
                        var2 = this.field7418;
                        this.field7418 = this.field7418.field666;
                        if (this.field7418 == null) {
                            this.field7423 = null;
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
                int var3 = var2.field668;
                if (var3 == 1) {
                    if (class246.method1483(5957) < field7431) {
                        throw new IOException();
                    }
                    var2.field670 = new Socket(InetAddress.getByName((String) var2.field669), var2.field665);
                } else if (var3 == 2) {
                    Thread var9 = new Thread((Runnable) var2.field669);
                    var9.setDaemon(true);
                    var9.start();
                    var9.setPriority(var2.field665);
                    var2.field670 = var9;
                } else if (var3 == 4) {
                    if (class246.method1483(5957) < field7431) {
                        throw new IOException();
                    }
                    var2.field670 = new DataInputStream(((URL) var2.field669).openStream());
                } else if (var3 == 8) {
                    Object[] var4 = (Object[]) var2.field669;
                    var2.field670 = ((Class) var4[0]).getDeclaredMethod((String) var4[1], (Class[]) var4[2]);
                } else if (var3 == 9) {
                    Object[] var8 = (Object[]) var2.field669;
                    var2.field670 = ((Class) var8[0]).getDeclaredField((String) var8[1]);
                } else if (var3 == 18) {
                    Clipboard var7 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field670 = var7.getContents(null);
                } else if (var3 == 19) {
                    Transferable var5 = (Transferable) var2.field669;
                    Clipboard var6 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var6.setContents(var5, null);
                } else {
                    throw new Exception("");
                }
                var2.field667 = 1;
            } catch (ThreadDeath var15) {
                throw var15;
            } catch (Throwable var16) {
                var2.field667 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "(ILjava/lang/String;)[B", line = 396)
    public final byte[] method2960(int arg0, String arg1) {
        if (arg0 == -1) {
            class56 var3 = this.method2953(0, 0, 21, -78, arg1);
            return (byte[]) var3.field670;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(ZLjava/awt/Component;I)Ljv;", line = 409)
    public final class56 method2961(boolean arg0, Component arg1, int arg2) {
        if (arg2 != 0) {
            this.field7414 = null;
        }
        return this.method2963(arg0 ? 1 : 0, 79, arg1, 0, 15);
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Ljava/awt/Component;III)Ljv;", line = 420)
    public final class56 method2962(Component arg0, int arg1, int arg2, int arg3) {
        Point var5 = arg0.getLocationOnScreen();
        if (arg3 != 10000) {
            field7417 = 125;
        }
        return this.method2963(var5.x + arg1, arg3 + -9941, null, var5.y + arg2, 14);
    }

    @OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V", line = 689)
    public class504(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field7426 = "Unknown";
        this.field7416 = arg2;
        field7428 = "1.1";
        this.field7411 = arg1;
        this.field7425 = arg0;
        try {
            field7426 = System.getProperty("java.vendor");
            field7428 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field7409 = System.getProperty("os.name");
        } catch (Exception var11) {
            field7409 = "Unknown";
        }
        field7420 = field7409.toLowerCase();
        try {
            field7412 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field7412 = "";
        }
        try {
            field7422 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field7422 = "";
        }
        try {
            field7427 = System.getProperty("user.home");
            if (field7427 != null) {
                field7427 = field7427 + "/";
            }
        } catch (Exception var8) {
        }
        if (field7427 == null) {
            field7427 = "~/";
        }
        try {
            this.field7419 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field7432 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field7432 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field7430 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field7430 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field7415 = false;
        this.field7424 = new Thread(this);
        this.field7424.setPriority(10);
        this.field7424.setDaemon(true);
        this.field7424.start();
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IILjava/lang/Object;II)Ljv;", line = 439)
    private final class56 method2963(int arg0, int arg1, Object arg2, int arg3, int arg4) {
        class56 var6 = new class56();
        var6.field668 = arg4;
        var6.field669 = arg2;
        var6.field665 = arg0;
        synchronized (this) {
            if (this.field7423 == null) {
                this.field7423 = this.field7418 = var6;
            } else {
                this.field7423.field666 = var6;
                this.field7423 = var6;
            }
            this.notify();
        }
        if (arg1 < 47) {
            this.method2950((byte) 125);
        }
        return var6;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Ljava/lang/String;B)Ljv;", line = 473)
    public final class56 method2964(String arg0, byte arg1) {
        int var3 = 103 % ((arg1 + 38) / 44);
        return this.method2963(0, 92, arg0, 0, 16);
    }

    @OriginalMember(owner = "client!dr", name = "d", descriptor = "(B)Lhp;", line = 482)
    public final class215 method2965(byte arg0) {
        int var2 = -126 % ((arg0 + 56) / 50);
        return this.field7413;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(I)Ljv;", line = 495)
    public final class56 method2966(int arg0) {
        return arg0 == 1 ? this.method2963(0, 106, null, 0, 5) : null;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(BLjava/net/URL;)Ljv;", line = 505)
    public final class56 method2967(byte arg0, URL arg1) {
        int var3 = 17 / ((arg0 + 78) / 43);
        return this.method2963(0, 67, arg1, 0, 4);
    }

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "(I)Z", line = 524)
    public final boolean method2968(int arg0) {
        if (arg0 != 25859) {
            this.field7424 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(BLjava/lang/String;)Ljv;", line = 540)
    public final class56 method2969(byte arg0, String arg1) {
        return arg0 == 29 ? this.method2963(0, 63, arg1, 0, 21) : null;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIIII)Ljv;", line = 550)
    public final class56 method2970(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < 100) {
            this.method2954(-2, null);
        }
        return this.method2963((arg2 << 16) + arg0, 79, null, (arg3 << 16) + arg4, 6);
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Ljava/lang/Runnable;II)Ljv;", line = 560)
    public final class56 method2971(Runnable arg0, int arg1, int arg2) {
        return arg2 == 0 ? this.method2963(arg1, arg2 ^ 0x42, arg0, 0, 2) : null;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;", line = 570)
    public final File method2972(String arg0, int arg1) {
        if (arg1 != 21) {
            field7431 = -36L;
        }
        return method2958((byte) -123, this.field7411, arg0, this.field7416);
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;)Ljv;", line = 580)
    public final class56 method2973(int arg0, String arg1, Class arg2, Class[] arg3) {
        return arg0 == 8 ? this.method2963(0, 64, new Object[] { arg2, arg1, arg3 }, 0, 8) : null;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(BLjava/lang/Class;Ljava/lang/String;)Ljv;", line = 598)
    public final class56 method2974(byte arg0, Class arg1, String arg2) {
        return arg0 == -107 ? this.method2963(0, 115, new Object[] { arg1, arg2 }, 0, 9) : null;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;B)Ljv;", line = 615)
    public final class56 method2975(Transferable arg0, byte arg1) {
        if (arg1 < 108) {
            this.field7415 = true;
        }
        return this.method2963(0, 50, arg0, 0, 19);
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Ljava/lang/Class;B)Ljv;", line = 628)
    public final class56 method2976(Class arg0, byte arg1) {
        int var3 = 38 / ((75 - arg1) / 48);
        return this.method2963(0, 98, arg0, 0, 11);
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Ljava/lang/Class;Z)V", line = 638)
    public final void method2977(Class arg0, boolean arg1) throws Exception {
        Class[] var3 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
        if (arg1) {
            return;
        }
        Runtime var4 = Runtime.getRuntime();
        Method var5 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
        if (!field7420.startsWith("mac")) {
            Method var6 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", var3);
            var5.invoke(var6, Boolean.TRUE);
            var6.invoke(var4, arg0, "jawt");
            var5.invoke(var6, Boolean.FALSE);
        }
        Method var7 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", var3);
        var5.invoke(var7, Boolean.TRUE);
        if (!field7420.startsWith("win")) {
            throw new Exception();
        }
        var7.invoke(var4, arg0, this.method2972("sw3d.dll", 21).toString());
        var5.invoke(var7, Boolean.FALSE);
    }
}
