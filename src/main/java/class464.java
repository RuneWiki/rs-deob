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

@OriginalClass("client!pi")
public class class464 implements Runnable {

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "Lmca;")
    public class5 field6610 = null;

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "Z")
    public boolean field6611 = false;

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "Lmca;")
    public class5 field6612 = null;

    @OriginalMember(owner = "client!pi", name = "p", descriptor = "Lmca;")
    public class5 field6621 = null;

    @OriginalMember(owner = "client!pi", name = "r", descriptor = "Lbp;")
    private class88 field6623 = null;

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "Z")
    public boolean field6614 = false;

    @OriginalMember(owner = "client!pi", name = "w", descriptor = "Lbp;")
    private class88 field6628 = null;

    @OriginalMember(owner = "client!pi", name = "B", descriptor = "Z")
    private boolean field6633 = false;

    @OriginalMember(owner = "client!pi", name = "t", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field6625;

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "[Lmca;")
    public class5[] field6609;

    @OriginalMember(owner = "client!pi", name = "u", descriptor = "Ljava/lang/Object;")
    private Object field6626;

    @OriginalMember(owner = "client!pi", name = "k", descriptor = "Lcw;")
    private class513 field6616;

    @OriginalMember(owner = "client!pi", name = "x", descriptor = "Ljava/lang/Object;")
    private Object field6629;

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "Ljava/lang/Object;")
    private Object field6607;

    @OriginalMember(owner = "client!pi", name = "z", descriptor = "Lu;")
    private class466 field6631;

    @OriginalMember(owner = "client!pi", name = "n", descriptor = "Ljava/lang/Thread;")
    private Thread field6619;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "J")
    private static volatile long field6608 = 0L;

    @OriginalMember(owner = "client!pi", name = "y", descriptor = "I")
    private static int field6630;

    // $FF: synthetic field
    @OriginalMember(owner = "client!pi", name = "C", descriptor = "Ljava/lang/Class;")
    public static Class field6634;

    // $FF: synthetic field
    @OriginalMember(owner = "client!pi", name = "D", descriptor = "Ljava/lang/Class;")
    public static Class field6635;

    // $FF: synthetic field
    @OriginalMember(owner = "client!pi", name = "E", descriptor = "Ljava/lang/Class;")
    public static Class field6636;

    // $FF: synthetic field
    @OriginalMember(owner = "client!pi", name = "F", descriptor = "Ljava/lang/Class;")
    public static Class field6637;

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "Ljava/lang/String;")
    public static String field6613;

    @OriginalMember(owner = "client!pi", name = "j", descriptor = "Ljava/lang/String;")
    public static String field6615;

    @OriginalMember(owner = "client!pi", name = "l", descriptor = "Ljava/lang/String;")
    private static String field6617;

    @OriginalMember(owner = "client!pi", name = "m", descriptor = "Ljava/lang/String;")
    private static String field6618;

    @OriginalMember(owner = "client!pi", name = "o", descriptor = "Ljava/lang/String;")
    public static String field6620;

    @OriginalMember(owner = "client!pi", name = "q", descriptor = "Ljava/lang/String;")
    public static String field6622;

    @OriginalMember(owner = "client!pi", name = "s", descriptor = "Ljava/lang/String;")
    public static String field6624;

    @OriginalMember(owner = "client!pi", name = "v", descriptor = "Ljava/lang/String;")
    private static String field6627;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field6606;

    @OriginalMember(owner = "client!pi", name = "A", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field6632;

    // $FF: synthetic method
    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2685(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Ljava/lang/String;B)Lbp;", line = 6)
    public final class88 method2665(String arg0, byte arg1) {
        if (arg1 <= 2) {
            this.method2668(null, 117, 86);
        }
        return this.method2667(16, arg0, 0, 0, 10000);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZLjava/io/File;[B)Z", line = 17)
    public final boolean method2666(boolean arg0, File arg1, byte[] arg2) {
        try {
            FileOutputStream var4 = new FileOutputStream(arg1);
            var4.write(arg2, 0, arg2.length);
            var4.close();
            if (arg0) {
                field6624 = null;
            }
            return true;
        } catch (IOException var5) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILjava/lang/Object;III)Lbp;", line = 37)
    private final class88 method2667(int arg0, Object arg1, int arg2, int arg3, int arg4) {
        class88 var6 = new class88();
        var6.field881 = arg3;
        if (arg4 != 10000) {
            field6613 = null;
        }
        var6.field882 = arg1;
        var6.field885 = arg0;
        var6.field880 = arg2;
        synchronized (this) {
            if (this.field6623 == null) {
                this.field6623 = this.field6628 = var6;
            } else {
                this.field6623.field883 = var6;
                this.field6623 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lbp;", line = 78)
    public final class88 method2668(Runnable arg0, int arg1, int arg2) {
        int var4 = -56 % ((arg2 + 60) / 37);
        return this.method2667(2, arg0, 0, arg1, 10000);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)V", line = 89)
    public final void method2669(byte arg0) {
        if (arg0 < 73) {
            this.method2666(false, null, null);
        }
        synchronized (this) {
            this.field6633 = true;
            this.notifyAll();
        }
        try {
            this.field6619.join();
        } catch (InterruptedException var8) {
        }
        if (this.field6612 != null) {
            try {
                this.field6612.method37(-1);
            } catch (IOException var7) {
            }
        }
        if (this.field6610 != null) {
            try {
                this.field6610.method37(-1);
            } catch (IOException var6) {
            }
        }
        if (this.field6609 != null) {
            for (int var3 = 0; var3 < this.field6609.length; var3++) {
                if (this.field6609[var3] != null) {
                    try {
                        this.field6609[var3].method37(-1);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field6621 != null) {
            try {
                this.field6621.method37(-1);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;B)Lbp;", line = 146)
    public final class88 method2670(Class arg0, String arg1, Class[] arg2, byte arg3) {
        return arg3 >= -35 ? null : this.method2667(8, new Object[] { arg0, arg1, arg2 }, 0, 0, 10000);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)Z", line = 156)
    public final boolean method2671(int arg0) {
        if (arg0 != 0) {
            this.method2680(119, -113);
        }
        if (!this.field6614) {
            return false;
        } else if (this.field6611) {
            return this.field6616 != null;
        } else {
            return this.field6629 != null;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)Lmca;", line = 175)
    private static final class5 method2672(int arg0, String arg1, int arg2, String arg3) {
        String var4;
        if (~arg2 == arg0) {
            var4 = "jagex_" + arg3 + "_preferences" + arg1 + "_rc.dat";
        } else if (arg2 == 34) {
            var4 = "jagex_" + arg3 + "_preferences" + arg1 + "_wip.dat";
        } else {
            var4 = "jagex_" + arg3 + "_preferences" + arg1 + ".dat";
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", field6617, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
        for (int var6 = 0; var6 < var5.length; var6++) {
            String var7 = var5[var6];
            if (var7.length() <= 0 || (new File(var7)).exists()) {
                try {
                    return new class5(new File(var7, var4), "rw", 10000L);
                } catch (Exception var9) {
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!pi", name = "run", descriptor = "()V", line = 221)
    public final void run() {
        while (true) {
            class88 var2;
            synchronized (this) {
                while (true) {
                    if (this.field6633) {
                        return;
                    }
                    if (this.field6628 != null) {
                        var2 = this.field6628;
                        this.field6628 = this.field6628.field883;
                        if (this.field6628 == null) {
                            this.field6623 = null;
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
                int var3 = var2.field885;
                if (var3 == 1) {
                    if (field6608 > class557.method3157(-57)) {
                        throw new IOException();
                    }
                    var2.field886 = new Socket(InetAddress.getByName((String) var2.field882), var2.field881);
                } else if (var3 == 22) {
                    if (class557.method3157(-112) < field6608) {
                        throw new IOException();
                    }
                    try {
                        var2.field886 = class405.method2273((byte) 4, (String) var2.field882, var2.field881).method330((byte) -112);
                    } catch (class376 var29) {
                        var2.field886 = var29.getMessage();
                        throw var29;
                    }
                } else if (var3 == 2) {
                    Thread var23 = new Thread((Runnable) var2.field882);
                    var23.setDaemon(true);
                    var23.start();
                    var23.setPriority(var2.field881);
                    var2.field886 = var23;
                } else if (var3 == 4) {
                    if (field6608 > class557.method3157(-79)) {
                        throw new IOException();
                    }
                    var2.field886 = new DataInputStream(((URL) var2.field882).openStream());
                } else if (var3 == 8) {
                    Object[] var22 = (Object[]) var2.field882;
                    if (this.field6614 && ((Class) var22[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field886 = ((Class) var22[0]).getDeclaredMethod((String) var22[1], (Class[]) var22[2]);
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field882;
                    if (this.field6614 && ((Class) var5[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field886 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else if (var3 == 18) {
                    Clipboard var21 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field886 = var21.getContents(null);
                } else if (var3 == 19) {
                    Transferable var6 = (Transferable) var2.field882;
                    Clipboard var7 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var7.setContents(var6, null);
                } else if (!this.field6614) {
                    throw new Exception("");
                } else if (var3 == 3) {
                    if (class557.method3157(-51) < field6608) {
                        throw new IOException();
                    }
                    String var20 = (var2.field881 >> 24 & 0xFF) + "." + ((var2.field881 & 0xFFCE91) >> 16) + "." + (var2.field881 >> 8 & 0xFF) + "." + (var2.field881 & 0xFF);
                    var2.field886 = InetAddress.getByName(var20).getHostName();
                } else if (var3 == 21) {
                    if (class557.method3157(-93) < field6608) {
                        throw new IOException();
                    }
                    var2.field886 = InetAddress.getByName((String) var2.field882).getAddress();
                } else if (var3 == 5) {
                    if (this.field6611) {
                        var2.field886 = this.field6616.method2935(8);
                    } else {
                        var2.field886 = Class.forName("ui").getMethod("listmodes").invoke(this.field6629);
                    }
                } else if (var3 == 6) {
                    Frame var8 = new Frame("Jagex Full Screen");
                    var2.field886 = var8;
                    var8.setResizable(false);
                    if (this.field6611) {
                        this.field6616.method2937(var2.field880 >> 16, var2.field880 & 0xFFFF, var2.field881 >>> 16, var8, var2.field881 & 0xFFFF, (byte) 80);
                    } else {
                        Class.forName("ui").getMethod("enter", field6634 == null ? (field6634 = method2685("java.awt.Frame")) : field6634, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.field6629, var8, Integer.valueOf(var2.field881 >>> 16), new Integer(var2.field881 & 0xFFFF), Integer.valueOf(var2.field880 >> 16), new Integer(var2.field880 & 0xFFFF));
                    }
                } else if (var3 == 7) {
                    if (this.field6611) {
                        this.field6616.method2936((byte) -118, (Frame) var2.field882);
                    } else {
                        Class.forName("ui").getMethod("exit").invoke(this.field6629);
                    }
                } else if (var3 == 12) {
                    class5 var19 = method2672(-34, (String) var2.field882, field6630, field6618);
                    var2.field886 = var19;
                } else if (var3 == 13) {
                    class5 var9 = method2672(-34, (String) var2.field882, field6630, "");
                    var2.field886 = var9;
                } else if (this.field6614 && var3 == 14) {
                    int var17 = var2.field881;
                    int var18 = var2.field880;
                    if (this.field6611) {
                        this.field6631.method2690(var17, false, var18);
                    } else {
                        Class.forName("ln").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.field6607, Integer.valueOf(var17), new Integer(var18));
                    }
                } else if (this.field6614 && var3 == 15) {
                    boolean var15 = var2.field881 != 0;
                    Component var16 = (Component) var2.field882;
                    if (this.field6611) {
                        this.field6631.method2689(var15, 0, var16);
                    } else {
                        Class.forName("ln").getDeclaredMethod("showcursor", field6635 == null ? (field6635 = method2685("java.awt.Component")) : field6635, Boolean.TYPE).invoke(this.field6607, var16, Boolean.valueOf(var15));
                    }
                } else if (!this.field6611 && var3 == 17) {
                    Object[] var10 = (Object[]) var2.field882;
                    Class.forName("ln").getDeclaredMethod("setcustomcursor", field6635 == null ? (field6635 = method2685("java.awt.Component")) : field6635, field6636 == null ? (field6636 = method2685("[I")) : field6636, Integer.TYPE, Integer.TYPE, field6637 == null ? (field6637 = method2685("java.awt.Point")) : field6637).invoke(this.field6607, (Component) var10[0], (int[]) var10[1], Integer.valueOf(var2.field881), new Integer(var2.field880), (Point) var10[2]);
                } else if (var3 == 16) {
                    try {
                        if (!field6624.startsWith("win")) {
                            throw new Exception();
                        }
                        String var11 = (String) var2.field882;
                        if (!var11.startsWith("http://") && !var11.startsWith("https://")) {
                            throw new Exception();
                        }
                        String var12 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                        int var13 = 0;
                        while (true) {
                            if (var13 >= var11.length()) {
                                Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var11 + "\"");
                                var2.field886 = null;
                                break;
                            }
                            if (var12.indexOf(var11.charAt(var13)) == -1) {
                                throw new Exception();
                            }
                            var13++;
                        }
                    } catch (Exception var31) {
                        var2.field886 = var31;
                        throw var31;
                    }
                } else {
                    throw new Exception("");
                }
                var2.field884 = 1;
            } catch (ThreadDeath var32) {
                throw var32;
            } catch (Throwable var33) {
                var2.field884 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V", line = 698)
    public class464(int arg0, String arg1, int arg2, boolean arg3) throws Exception {
        field6630 = arg0;
        field6613 = "Unknown";
        field6618 = arg1;
        field6615 = "1.1";
        this.field6614 = arg3;
        try {
            field6613 = System.getProperty("java.vendor");
            field6615 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        if (field6613.toLowerCase().indexOf("microsoft") != -1) {
            this.field6611 = true;
        }
        try {
            field6627 = System.getProperty("os.name");
        } catch (Exception var19) {
            field6627 = "Unknown";
        }
        field6624 = field6627.toLowerCase();
        try {
            field6620 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field6620 = "";
        }
        try {
            field6622 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
            field6622 = "";
        }
        try {
            field6617 = System.getProperty("user.home");
            if (field6617 != null) {
                field6617 = field6617 + "/";
            }
        } catch (Exception var16) {
        }
        if (field6617 == null) {
            field6617 = "~/";
        }
        try {
            this.field6625 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        if (!this.field6611) {
            try {
                field6606 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } catch (Exception var14) {
            }
            try {
                field6632 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } catch (Exception var13) {
            }
        }
        class195.method1185(field6630, 125, field6618);
        if (this.field6614) {
            this.field6621 = new class5(class195.method1186("random.dat", field6630, null, 1), "rw", 25L);
            this.field6612 = new class5(class195.method1184(22591, "main_file_cache.dat2"), "rw", 209715200L);
            this.field6610 = new class5(class195.method1184(22591, "main_file_cache.idx255"), "rw", 1048576L);
            this.field6609 = new class5[arg2];
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field6609[var5] = new class5(class195.method1184(22591, "main_file_cache.idx" + var5), "rw", 1048576L);
            }
            if (this.field6611) {
                try {
                    this.field6626 = Class.forName("mq").getDeclaredConstructor().newInstance();
                } catch (Throwable var12) {
                }
            }
            try {
                if (this.field6611) {
                    this.field6616 = new class513();
                } else {
                    this.field6629 = Class.forName("ui").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var11) {
            }
            try {
                if (this.field6611) {
                    this.field6631 = new class466();
                } else {
                    this.field6607 = Class.forName("ln").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var10) {
            }
        }
        if (this.field6614 && !this.field6611) {
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
        this.field6633 = false;
        this.field6619 = new Thread(this);
        this.field6619.setPriority(10);
        this.field6619.setDaemon(true);
        this.field6619.start();
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(B)V", line = 525)
    public final void method2673(byte arg0) {
        if (arg0 != -47) {
            this.field6628 = null;
        }
        field6608 = class557.method3157(-123) + 5000L;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZLjava/awt/Frame;)Lbp;", line = 541)
    public final class88 method2674(boolean arg0, Frame arg1) {
        if (!arg0) {
            this.method2682(null, true, (byte) 68);
        }
        return this.method2667(7, arg1, 0, 0, 10000);
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(I)Lbp;", line = 554)
    public final class88 method2675(int arg0) {
        if (arg0 != 10000) {
            this.field6612 = null;
        }
        return this.method2667(5, null, 0, 0, 10000);
    }

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "(B)Ljava/lang/Object;", line = 567)
    public final Object method2676(byte arg0) {
        int var2 = 83 / ((arg0 + 46) / 36);
        return this.field6626;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Lbp;", line = 581)
    public final class88 method2677(Class arg0, String arg1, int arg2) {
        return arg2 > -70 ? null : this.method2667(9, new Object[] { arg0, arg1 }, 0, 0, 10000);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IZILjava/lang/String;)Lbp;", line = 593)
    public final class88 method2678(int arg0, boolean arg1, int arg2, String arg3) {
        if (arg0 != -9787) {
            this.field6616 = null;
        }
        return this.method2667(arg1 ? 22 : 1, arg3, 0, arg2, 10000);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Ljava/lang/String;I)Lmca;", line = 604)
    public static final class5 method2679(String arg0, int arg1) {
        if (arg1 != 5000) {
            method2679(null, 68);
        }
        return method2672(-34, arg0, field6630, field6618);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)Lbp;", line = 614)
    public final class88 method2680(int arg0, int arg1) {
        if (arg0 != 3) {
            this.field6607 = null;
        }
        return this.method2667(3, null, 0, arg1, 10000);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(BLjava/net/URL;)Lbp;", line = 636)
    public final class88 method2681(byte arg0, URL arg1) {
        if (arg0 != 8) {
            method2679(null, -92);
        }
        return this.method2667(4, arg1, 0, 0, 10000);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Ljava/lang/String;ZB)Lbp;", line = 651)
    public final class88 method2682(String arg0, boolean arg1, byte arg2) {
        if (arg2 == -16) {
            return arg1 ? this.method2667(12, arg0, 0, 0, 10000) : this.method2667(13, arg0, 0, 0, 10000);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIB)Lbp;", line = 665)
    public final class88 method2683(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 <= 114) {
            this.field6629 = null;
        }
        return this.method2667(6, null, (arg2 << 16) + arg3, (arg1 << 16) + arg0, 10000);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILjava/awt/Point;[ILjava/awt/Component;II)Lbp;", line = 683)
    public final class88 method2684(int arg0, Point arg1, int[] arg2, Component arg3, int arg4, int arg5) {
        int var7 = 20 / ((arg4 - 13) / 50);
        return this.method2667(17, new Object[] { arg3, arg2, arg1 }, arg5, arg0, 10000);
    }
}
