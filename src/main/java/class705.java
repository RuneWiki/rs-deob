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

@OriginalClass("client!wv")
public class class705 implements Runnable {

    @OriginalMember(owner = "client!wv", name = "g", descriptor = "Lwc;")
    public class355 field9966 = null;

    @OriginalMember(owner = "client!wv", name = "b", descriptor = "Ltj;")
    private class614 field9961 = null;

    @OriginalMember(owner = "client!wv", name = "u", descriptor = "Ltj;")
    private class614 field9980 = null;

    @OriginalMember(owner = "client!wv", name = "d", descriptor = "Lwc;")
    public class355 field9963 = null;

    @OriginalMember(owner = "client!wv", name = "s", descriptor = "Lwc;")
    public class355 field9978 = null;

    @OriginalMember(owner = "client!wv", name = "x", descriptor = "Z")
    public boolean field9983 = false;

    @OriginalMember(owner = "client!wv", name = "z", descriptor = "Z")
    public boolean field9985 = false;

    @OriginalMember(owner = "client!wv", name = "o", descriptor = "Z")
    private boolean field9974 = false;

    @OriginalMember(owner = "client!wv", name = "k", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field9970;

    @OriginalMember(owner = "client!wv", name = "v", descriptor = "[Lwc;")
    public class355[] field9981;

    @OriginalMember(owner = "client!wv", name = "n", descriptor = "Ljava/lang/Object;")
    private Object field9973;

    @OriginalMember(owner = "client!wv", name = "t", descriptor = "Ldr;")
    private class560 field9979;

    @OriginalMember(owner = "client!wv", name = "m", descriptor = "Ljava/lang/Object;")
    private Object field9972;

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "Ljava/lang/Object;")
    private Object field9960;

    @OriginalMember(owner = "client!wv", name = "p", descriptor = "Lgq;")
    private class706 field9975;

    @OriginalMember(owner = "client!wv", name = "h", descriptor = "Ljava/lang/Thread;")
    private Thread field9967;

    @OriginalMember(owner = "client!wv", name = "r", descriptor = "J")
    private static volatile long field9977 = 0L;

    @OriginalMember(owner = "client!wv", name = "i", descriptor = "I")
    private static int field9968;

    // $FF: synthetic field
    @OriginalMember(owner = "client!wv", name = "C", descriptor = "Ljava/lang/Class;")
    public static Class field9988;

    // $FF: synthetic field
    @OriginalMember(owner = "client!wv", name = "D", descriptor = "Ljava/lang/Class;")
    public static Class field9989;

    // $FF: synthetic field
    @OriginalMember(owner = "client!wv", name = "E", descriptor = "Ljava/lang/Class;")
    public static Class field9990;

    // $FF: synthetic field
    @OriginalMember(owner = "client!wv", name = "F", descriptor = "Ljava/lang/Class;")
    public static Class field9991;

    @OriginalMember(owner = "client!wv", name = "c", descriptor = "Ljava/lang/String;")
    public static String field9962;

    @OriginalMember(owner = "client!wv", name = "f", descriptor = "Ljava/lang/String;")
    private static String field9965;

    @OriginalMember(owner = "client!wv", name = "j", descriptor = "Ljava/lang/String;")
    public static String field9969;

    @OriginalMember(owner = "client!wv", name = "l", descriptor = "Ljava/lang/String;")
    public static String field9971;

    @OriginalMember(owner = "client!wv", name = "q", descriptor = "Ljava/lang/String;")
    private static String field9976;

    @OriginalMember(owner = "client!wv", name = "y", descriptor = "Ljava/lang/String;")
    private static String field9984;

    @OriginalMember(owner = "client!wv", name = "A", descriptor = "Ljava/lang/String;")
    public static String field9986;

    @OriginalMember(owner = "client!wv", name = "B", descriptor = "Ljava/lang/String;")
    public static String field9987;

    @OriginalMember(owner = "client!wv", name = "e", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field9964;

    @OriginalMember(owner = "client!wv", name = "w", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field9982;

    // $FF: synthetic method
    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3969(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(Ljava/lang/String;IZ)Ltj;", line = 9)
    public final class614 method3949(String arg0, int arg1, boolean arg2) {
        if (arg1 != 0) {
            this.method3949(null, 115, false);
        }
        return arg2 ? this.method3962(12, arg1, 0, 0, arg0) : this.method3962(13, arg1, 0, 0, arg0);
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(B)V", line = 28)
    public final void method3950(byte arg0) {
        if (arg0 != -111) {
            field9971 = null;
        }
        field9977 = class254.method1619(true) + 5000L;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(ILjava/net/URL;)Ltj;", line = 41)
    public final class614 method3951(int arg0, URL arg1) {
        if (arg0 != 255) {
            this.method3968(null, -19, (byte) 68);
        }
        return this.method3962(4, 0, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Lwc;", line = 51)
    private static final class355 method3952(String arg0, int arg1, String arg2, int arg3) {
        String var4;
        if (arg3 == 33) {
            var4 = "jagex_" + arg0 + "_preferences" + arg2 + "_rc.dat";
        } else if (arg3 == 34) {
            var4 = "jagex_" + arg0 + "_preferences" + arg2 + "_wip.dat";
        } else {
            var4 = "jagex_" + arg0 + "_preferences" + arg2 + ".dat";
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", field9984, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
        for (int var6 = 0; var6 < var5.length; var6++) {
            String var7 = var5[var6];
            if (var7.length() <= 0 || (new File(var7)).exists()) {
                try {
                    return new class355(new File(var7, var4), "rw", 10000L);
                } catch (Exception var9) {
                }
            }
        }
        if (arg1 != 65535) {
            field9976 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(I[BLjava/io/File;)Z", line = 103)
    public final boolean method3953(int arg0, byte[] arg1, File arg2) {
        if (arg0 <= 65) {
            this.field9981 = null;
        }
        try {
            FileOutputStream var4 = new FileOutputStream(arg2);
            var4.write(arg1, 0, arg1.length);
            var4.close();
            return true;
        } catch (IOException var5) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(ILjava/awt/Frame;)Ltj;", line = 123)
    public final class614 method3954(int arg0, Frame arg1) {
        if (arg0 <= 118) {
            this.method3955(null, null, (byte) -25, null);
        }
        return this.method3962(7, 0, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;B[Ljava/lang/Class;)Ltj;", line = 133)
    public final class614 method3955(Class arg0, String arg1, byte arg2, Class[] arg3) {
        if (arg2 <= 23) {
            method3952(null, -46, null, 32);
        }
        return this.method3962(8, 0, 0, 0, new Object[] { arg0, arg1, arg3 });
    }

    @OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V", line = 707)
    public class705(int arg0, String arg1, int arg2, boolean arg3) throws Exception {
        field9987 = "1.1";
        field9968 = arg0;
        this.field9983 = arg3;
        field9962 = "Unknown";
        field9965 = arg1;
        try {
            field9962 = System.getProperty("java.vendor");
            field9987 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        if (field9962.toLowerCase().indexOf("microsoft") != -1) {
            this.field9985 = true;
        }
        try {
            field9976 = System.getProperty("os.name");
        } catch (Exception var19) {
            field9976 = "Unknown";
        }
        field9971 = field9976.toLowerCase();
        try {
            field9986 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field9986 = "";
        }
        try {
            field9969 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
            field9969 = "";
        }
        try {
            field9984 = System.getProperty("user.home");
            if (field9984 != null) {
                field9984 = field9984 + "/";
            }
        } catch (Exception var16) {
        }
        if (field9984 == null) {
            field9984 = "~/";
        }
        try {
            this.field9970 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        if (!this.field9985) {
            try {
                field9982 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } catch (Exception var14) {
            }
            try {
                field9964 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } catch (Exception var13) {
            }
        }
        class315.method1905(field9965, (byte) -97, field9968);
        if (this.field9983) {
            this.field9966 = new class355(class315.method1903("random.dat", -116, null, field9968), "rw", 25L);
            this.field9963 = new class355(class315.method1904(118, "main_file_cache.dat2"), "rw", 209715200L);
            this.field9978 = new class355(class315.method1904(125, "main_file_cache.idx255"), "rw", 1048576L);
            this.field9981 = new class355[arg2];
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field9981[var5] = new class355(class315.method1904(109, "main_file_cache.idx" + var5), "rw", 1048576L);
            }
            if (this.field9985) {
                try {
                    this.field9973 = Class.forName("vaa").getDeclaredConstructor().newInstance();
                } catch (Throwable var12) {
                }
            }
            try {
                if (this.field9985) {
                    this.field9979 = new class560();
                } else {
                    this.field9972 = Class.forName("li").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var11) {
            }
            try {
                if (this.field9985) {
                    this.field9975 = new class706();
                } else {
                    this.field9960 = Class.forName("gga").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var10) {
            }
        }
        if (this.field9983 && !this.field9985) {
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
        this.field9974 = false;
        this.field9967 = new Thread(this);
        this.field9967.setPriority(10);
        this.field9967.setDaemon(true);
        this.field9967.start();
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(I)V", line = 147)
    public final void method3956(int arg0) {
        synchronized (this) {
            if (arg0 != 0) {
                this.method3953(61, null, null);
            }
            this.field9974 = true;
            this.notifyAll();
        }
        try {
            this.field9967.join();
        } catch (InterruptedException var8) {
        }
        if (this.field9963 != null) {
            try {
                this.field9963.method2152(false);
            } catch (IOException var7) {
            }
        }
        if (this.field9978 != null) {
            try {
                this.field9978.method2152(false);
            } catch (IOException var6) {
            }
        }
        if (this.field9981 != null) {
            for (int var3 = 0; var3 < this.field9981.length; var3++) {
                if (this.field9981[var3] != null) {
                    try {
                        this.field9981[var3].method2152(false);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field9966 != null) {
            try {
                this.field9966.method2152(false);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(Ljava/lang/String;I)Ltj;", line = 207)
    public final class614 method3957(String arg0, int arg1) {
        return arg1 == 16 ? this.method3962(16, arg1 - 16, 0, 0, arg0) : null;
    }

    @OriginalMember(owner = "client!wv", name = "b", descriptor = "(I)Ljava/lang/Object;", line = 218)
    public final Object method3958(int arg0) {
        if (arg0 != 19) {
            this.field9967 = null;
        }
        return this.field9973;
    }

    @OriginalMember(owner = "client!wv", name = "c", descriptor = "(I)Z", line = 230)
    public final boolean method3959(int arg0) {
        if (!this.field9983) {
            return false;
        } else if (arg0 < 90) {
            return true;
        } else if (this.field9985) {
            return this.field9979 != null;
        } else {
            return this.field9972 != null;
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(ILjava/lang/Class;Ljava/lang/String;)Ltj;", line = 249)
    public final class614 method3960(int arg0, Class arg1, String arg2) {
        if (arg0 != 0) {
            field9986 = null;
        }
        return this.method3962(9, 0, 0, 0, new Object[] { arg1, arg2 });
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "([ILjava/awt/Point;IZILjava/awt/Component;)Ltj;", line = 259)
    public final class614 method3961(int[] arg0, Point arg1, int arg2, boolean arg3, int arg4, Component arg5) {
        return arg3 ? this.method3962(17, 0, arg4, arg2, new Object[] { arg5, arg0, arg1 }) : null;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(IIIILjava/lang/Object;)Ltj;", line = 271)
    private final class614 method3962(int arg0, int arg1, int arg2, int arg3, Object arg4) {
        class614 var6 = new class614();
        var6.field8789 = arg2;
        var6.field8788 = arg4;
        var6.field8786 = arg3;
        var6.field8784 = arg0;
        synchronized (this) {
            if (this.field9961 == null) {
                this.field9961 = this.field9980 = var6;
            } else {
                this.field9961.field8783 = var6;
                this.field9961 = var6;
            }
            if (arg1 == 0) {
                this.notify();
                return var6;
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(BZLjava/lang/String;I)Ltj;", line = 309)
    public final class614 method3963(byte arg0, boolean arg1, String arg2, int arg3) {
        return arg0 == -10 ? this.method3962(arg1 ? 22 : 1, 0, 0, arg3, arg2) : null;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(BLjava/lang/String;)Lwc;", line = 331)
    public static final class355 method3964(byte arg0, String arg1) {
        return arg0 == -97 ? method3952(field9965, 65535, arg1, field9968) : null;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(II)Ltj;", line = 345)
    public final class614 method3965(int arg0, int arg1) {
        if (arg0 != -10) {
            this.method3956(-100);
        }
        return this.method3962(3, 0, 0, arg1, null);
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(IIBII)Ltj;", line = 355)
    public final class614 method3966(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 < 72) {
            this.field9972 = null;
        }
        return this.method3962(6, 0, (arg4 << 16) + arg0, (arg3 << 16) + arg1, null);
    }

    @OriginalMember(owner = "client!wv", name = "d", descriptor = "(I)Ltj;", line = 375)
    public final class614 method3967(int arg0) {
        int var2 = -33 / ((arg0 - 85) / 32);
        return this.method3962(5, 0, 0, 0, null);
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(Ljava/lang/Runnable;IB)Ltj;", line = 384)
    public final class614 method3968(Runnable arg0, int arg1, byte arg2) {
        if (arg2 != 13) {
            this.field9972 = null;
        }
        return this.method3962(2, 0, 0, arg1, arg0);
    }

    @OriginalMember(owner = "client!wv", name = "run", descriptor = "()V", line = 398)
    public final void run() {
        while (true) {
            class614 var2;
            synchronized (this) {
                while (true) {
                    if (this.field9974) {
                        return;
                    }
                    if (this.field9980 != null) {
                        var2 = this.field9980;
                        this.field9980 = this.field9980.field8783;
                        if (this.field9980 == null) {
                            this.field9961 = null;
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
                int var3 = var2.field8784;
                if (var3 == 1) {
                    if (field9977 > class254.method1619(true)) {
                        throw new IOException();
                    }
                    var2.field8785 = new Socket(InetAddress.getByName((String) var2.field8788), var2.field8786);
                } else if (var3 == 22) {
                    if (class254.method1619(true) < field9977) {
                        throw new IOException();
                    }
                    try {
                        var2.field8785 = class18.method197(var2.field8786, (byte) 110, (String) var2.field8788).method2546(4);
                    } catch (class419 var29) {
                        var2.field8785 = var29.getMessage();
                        throw var29;
                    }
                } else if (var3 == 2) {
                    Thread var23 = new Thread((Runnable) var2.field8788);
                    var23.setDaemon(true);
                    var23.start();
                    var23.setPriority(var2.field8786);
                    var2.field8785 = var23;
                } else if (var3 == 4) {
                    if (class254.method1619(true) < field9977) {
                        throw new IOException();
                    }
                    var2.field8785 = new DataInputStream(((URL) var2.field8788).openStream());
                } else if (var3 == 8) {
                    Object[] var22 = (Object[]) var2.field8788;
                    if (this.field9983 && ((Class) var22[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field8785 = ((Class) var22[0]).getDeclaredMethod((String) var22[1], (Class[]) var22[2]);
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field8788;
                    if (this.field9983 && ((Class) var5[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field8785 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else if (var3 == 18) {
                    Clipboard var21 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field8785 = var21.getContents(null);
                } else if (var3 == 19) {
                    Transferable var6 = (Transferable) var2.field8788;
                    Clipboard var7 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var7.setContents(var6, null);
                } else if (!this.field9983) {
                    throw new Exception("");
                } else if (var3 == 3) {
                    if (field9977 > class254.method1619(true)) {
                        throw new IOException();
                    }
                    String var8 = (var2.field8786 >> 24 & 0xFF) + "." + (var2.field8786 >> 16 & 0xFF) + "." + ((var2.field8786 & 0xFFAE) >> 8) + "." + (var2.field8786 & 0xFF);
                    var2.field8785 = InetAddress.getByName(var8).getHostName();
                } else if (var3 == 21) {
                    if (class254.method1619(true) < field9977) {
                        throw new IOException();
                    }
                    var2.field8785 = InetAddress.getByName((String) var2.field8788).getAddress();
                } else if (var3 == 5) {
                    if (this.field9985) {
                        var2.field8785 = this.field9979.method3278(24);
                    } else {
                        var2.field8785 = Class.forName("li").getMethod("listmodes").invoke(this.field9972);
                    }
                } else if (var3 == 6) {
                    Frame var9 = new Frame("Jagex Full Screen");
                    var2.field8785 = var9;
                    var9.setResizable(false);
                    if (this.field9985) {
                        this.field9979.method3279(var2.field8786 >>> 16, var2.field8786 & 0xFFFF, var9, var2.field8789 >> 16, 0, var2.field8789 & 0xFFFF);
                    } else {
                        Class.forName("li").getMethod("enter", field9988 == null ? (field9988 = method3969("java.awt.Frame")) : field9988, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.field9972, var9, Integer.valueOf(var2.field8786 >>> 16), new Integer(var2.field8786 & 0xFFFF), Integer.valueOf(var2.field8789 >> 16), new Integer(var2.field8789 & 0xFFFF));
                    }
                } else if (var3 == 7) {
                    if (this.field9985) {
                        this.field9979.method3277((Frame) var2.field8788, (byte) -123);
                    } else {
                        Class.forName("li").getMethod("exit").invoke(this.field9972);
                    }
                } else if (var3 == 12) {
                    class355 var10 = method3952(field9965, 65535, (String) var2.field8788, field9968);
                    var2.field8785 = var10;
                } else if (var3 == 13) {
                    class355 var20 = method3952("", 65535, (String) var2.field8788, field9968);
                    var2.field8785 = var20;
                } else if (this.field9983 && var3 == 14) {
                    int var11 = var2.field8786;
                    int var12 = var2.field8789;
                    if (this.field9985) {
                        this.field9975.method3970(true, var12, var11);
                    } else {
                        Class.forName("gga").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.field9960, Integer.valueOf(var11), new Integer(var12));
                    }
                } else if (this.field9983 && var3 == 15) {
                    boolean var18 = var2.field8786 != 0;
                    Component var19 = (Component) var2.field8788;
                    if (this.field9985) {
                        this.field9975.method3971(var18, var19, -101);
                    } else {
                        Class.forName("gga").getDeclaredMethod("showcursor", field9989 == null ? (field9989 = method3969("java.awt.Component")) : field9989, Boolean.TYPE).invoke(this.field9960, var19, Boolean.valueOf(var18));
                    }
                } else if (!this.field9985 && var3 == 17) {
                    Object[] var17 = (Object[]) var2.field8788;
                    Class.forName("gga").getDeclaredMethod("setcustomcursor", field9989 == null ? (field9989 = method3969("java.awt.Component")) : field9989, field9990 == null ? (field9990 = method3969("[I")) : field9990, Integer.TYPE, Integer.TYPE, field9991 == null ? (field9991 = method3969("java.awt.Point")) : field9991).invoke(this.field9960, (Component) var17[0], (int[]) var17[1], Integer.valueOf(var2.field8786), new Integer(var2.field8789), (Point) var17[2]);
                } else if (var3 == 16) {
                    try {
                        if (!field9971.startsWith("win")) {
                            throw new Exception();
                        }
                        String var13 = (String) var2.field8788;
                        if (!var13.startsWith("http://") && !var13.startsWith("https://")) {
                            throw new Exception();
                        }
                        String var14 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                        for (int var15 = 0; var15 < var13.length(); var15++) {
                            if (var14.indexOf(var13.charAt(var15)) == -1) {
                                throw new Exception();
                            }
                        }
                        Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var13 + "\"");
                        var2.field8785 = null;
                    } catch (Exception var31) {
                        var2.field8785 = var31;
                        throw var31;
                    }
                } else {
                    throw new Exception("");
                }
                var2.field8787 = 1;
            } catch (ThreadDeath var32) {
                throw var32;
            } catch (Throwable var33) {
                var2.field8787 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }
}
