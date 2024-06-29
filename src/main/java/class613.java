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

@OriginalClass("client!mr")
public class class613 implements Runnable {

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "Z")
    private boolean field8707 = false;

    @OriginalMember(owner = "client!mr", name = "p", descriptor = "Z")
    public boolean field8720 = false;

    @OriginalMember(owner = "client!mr", name = "q", descriptor = "Lfg;")
    private class436 field8721 = null;

    @OriginalMember(owner = "client!mr", name = "e", descriptor = "Lel;")
    public class721 field8709 = null;

    @OriginalMember(owner = "client!mr", name = "k", descriptor = "Lel;")
    public class721 field8715 = null;

    @OriginalMember(owner = "client!mr", name = "l", descriptor = "Lel;")
    public class721 field8716 = null;

    @OriginalMember(owner = "client!mr", name = "B", descriptor = "Z")
    public boolean field8732 = false;

    @OriginalMember(owner = "client!mr", name = "w", descriptor = "Lfg;")
    private class436 field8727 = null;

    @OriginalMember(owner = "client!mr", name = "g", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field8711;

    @OriginalMember(owner = "client!mr", name = "z", descriptor = "[Lel;")
    public class721[] field8730;

    @OriginalMember(owner = "client!mr", name = "x", descriptor = "Ljava/lang/Object;")
    private Object field8728;

    @OriginalMember(owner = "client!mr", name = "i", descriptor = "Ljava/lang/Object;")
    private Object field8713;

    @OriginalMember(owner = "client!mr", name = "j", descriptor = "Lga;")
    private class341 field8714;

    @OriginalMember(owner = "client!mr", name = "n", descriptor = "Lnr;")
    private class152 field8718;

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "Ljava/lang/Object;")
    private Object field8706;

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "Ljava/lang/Thread;")
    private Thread field8705;

    @OriginalMember(owner = "client!mr", name = "A", descriptor = "J")
    private static volatile long field8731 = 0L;

    @OriginalMember(owner = "client!mr", name = "m", descriptor = "I")
    private static int field8717;

    // $FF: synthetic field
    @OriginalMember(owner = "client!mr", name = "C", descriptor = "Ljava/lang/Class;")
    public static Class field8733;

    // $FF: synthetic field
    @OriginalMember(owner = "client!mr", name = "D", descriptor = "Ljava/lang/Class;")
    public static Class field8734;

    // $FF: synthetic field
    @OriginalMember(owner = "client!mr", name = "E", descriptor = "Ljava/lang/Class;")
    public static Class field8735;

    // $FF: synthetic field
    @OriginalMember(owner = "client!mr", name = "F", descriptor = "Ljava/lang/Class;")
    public static Class field8736;

    @OriginalMember(owner = "client!mr", name = "d", descriptor = "Ljava/lang/String;")
    private static String field8708;

    @OriginalMember(owner = "client!mr", name = "f", descriptor = "Ljava/lang/String;")
    public static String field8710;

    @OriginalMember(owner = "client!mr", name = "o", descriptor = "Ljava/lang/String;")
    private static String field8719;

    @OriginalMember(owner = "client!mr", name = "r", descriptor = "Ljava/lang/String;")
    public static String field8722;

    @OriginalMember(owner = "client!mr", name = "s", descriptor = "Ljava/lang/String;")
    public static String field8723;

    @OriginalMember(owner = "client!mr", name = "t", descriptor = "Ljava/lang/String;")
    public static String field8724;

    @OriginalMember(owner = "client!mr", name = "u", descriptor = "Ljava/lang/String;")
    public static String field8725;

    @OriginalMember(owner = "client!mr", name = "y", descriptor = "Ljava/lang/String;")
    private static String field8729;

    @OriginalMember(owner = "client!mr", name = "h", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field8712;

    @OriginalMember(owner = "client!mr", name = "v", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field8726;

    // $FF: synthetic method
    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3597(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Ljava/awt/Frame;Z)Lfg;", line = 5)
    public final class436 method3577(Frame arg0, boolean arg1) {
        if (arg1) {
            this.method3593(122);
        }
        return this.method3587(7, arg0, 0, (byte) 75, 0);
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Z)Z", line = 16)
    public final boolean method3578(boolean arg0) {
        if (arg0) {
            field8722 = null;
        }
        if (!this.field8732) {
            return false;
        } else if (this.field8720) {
            return this.field8714 != null;
        } else {
            return this.field8713 != null;
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Ljava/lang/String;ZIZ)Lfg;", line = 35)
    public final class436 method3579(String arg0, boolean arg1, int arg2, boolean arg3) {
        if (!arg1) {
            field8717 = 3;
        }
        return this.method3587(arg3 ? 22 : 1, arg0, arg2, (byte) 75, 0);
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lfg;", line = 48)
    public final class436 method3580(Runnable arg0, int arg1, int arg2) {
        if (arg1 <= 29) {
            this.method3590((byte) 105, null);
        }
        return this.method3587(2, arg0, arg2, (byte) 75, 0);
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(IIBII)Lfg;", line = 61)
    public final class436 method3581(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 != 114) {
            this.field8709 = null;
        }
        return this.method3587(6, null, (arg4 << 16) + arg0, (byte) 75, (arg3 << 16) + arg1);
    }

    @OriginalMember(owner = "client!mr", name = "run", descriptor = "()V", line = 76)
    public final void run() {
        while (true) {
            class436 var2;
            synchronized (this) {
                while (true) {
                    if (this.field8707) {
                        return;
                    }
                    if (this.field8721 != null) {
                        var2 = this.field8721;
                        this.field8721 = this.field8721.field5972;
                        if (this.field8721 == null) {
                            this.field8727 = null;
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
                int var3 = var2.field5976;
                if (var3 == 1) {
                    if (field8731 > class224.method1457((byte) -62)) {
                        throw new IOException();
                    }
                    var2.field5973 = new Socket(InetAddress.getByName((String) var2.field5971), var2.field5974);
                } else if (var3 == 22) {
                    if (class224.method1457((byte) -62) < field8731) {
                        throw new IOException();
                    }
                    try {
                        var2.field5973 = class236.method1508((byte) 112, var2.field5974, (String) var2.field5971).method1099((byte) 102);
                    } catch (class260 var29) {
                        var2.field5973 = var29.getMessage();
                        throw var29;
                    }
                } else if (var3 == 2) {
                    Thread var22 = new Thread((Runnable) var2.field5971);
                    var22.setDaemon(true);
                    var22.start();
                    var22.setPriority(var2.field5974);
                    var2.field5973 = var22;
                } else if (var3 == 4) {
                    if (class224.method1457((byte) -62) < field8731) {
                        throw new IOException();
                    }
                    var2.field5973 = new DataInputStream(((URL) var2.field5971).openStream());
                } else if (var3 == 8) {
                    Object[] var4 = (Object[]) var2.field5971;
                    if (this.field8732 && ((Class) var4[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field5973 = ((Class) var4[0]).getDeclaredMethod((String) var4[1], (Class[]) var4[2]);
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field5971;
                    if (this.field8732 && ((Class) var5[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field5973 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else if (var3 == 18) {
                    Clipboard var21 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field5973 = var21.getContents(null);
                } else if (var3 == 19) {
                    Transferable var19 = (Transferable) var2.field5971;
                    Clipboard var20 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var20.setContents(var19, null);
                } else if (!this.field8732) {
                    throw new Exception("");
                } else if (var3 == 3) {
                    if (field8731 > class224.method1457((byte) -62)) {
                        throw new IOException();
                    }
                    String var18 = (var2.field5974 >> 24 & 0xFF) + "." + (var2.field5974 >> 16 & 0xFF) + "." + ((var2.field5974 & 0xFF29) >> 8) + "." + (var2.field5974 & 0xFF);
                    var2.field5973 = InetAddress.getByName(var18).getHostName();
                } else if (var3 == 21) {
                    if (field8731 > class224.method1457((byte) -62)) {
                        throw new IOException();
                    }
                    var2.field5973 = InetAddress.getByName((String) var2.field5971).getAddress();
                } else if (var3 == 5) {
                    if (this.field8720) {
                        var2.field5973 = this.field8714.method1968(8787);
                    } else {
                        var2.field5973 = Class.forName("ks").getMethod("listmodes").invoke(this.field8713);
                    }
                } else if (var3 == 6) {
                    Frame var17 = new Frame("Jagex Full Screen");
                    var2.field5973 = var17;
                    var17.setResizable(false);
                    if (this.field8720) {
                        this.field8714.method1969(var2.field5970 & 0xFFFF, var2.field5974 >>> 16, var2.field5970 >> 16, true, var17, var2.field5974 & 0xFFFF);
                    } else {
                        Class.forName("ks").getMethod("enter", field8736 == null ? (field8736 = method3597("java.awt.Frame")) : field8736, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.field8713, var17, Integer.valueOf(var2.field5974 >>> 16), new Integer(var2.field5974 & 0xFFFF), Integer.valueOf(var2.field5970 >> 16), new Integer(var2.field5970 & 0xFFFF));
                    }
                } else if (var3 == 7) {
                    if (this.field8720) {
                        this.field8714.method1967((Frame) var2.field5971, (byte) 46);
                    } else {
                        Class.forName("ks").getMethod("exit").invoke(this.field8713);
                    }
                } else if (var3 == 12) {
                    class721 var16 = method3586((String) var2.field5971, 0, field8729, field8717);
                    var2.field5973 = var16;
                } else if (var3 == 13) {
                    class721 var6 = method3586((String) var2.field5971, 0, "", field8717);
                    var2.field5973 = var6;
                } else if (this.field8732 && var3 == 14) {
                    int var7 = var2.field5974;
                    int var8 = var2.field5970;
                    if (this.field8720) {
                        this.field8718.method972(112, var8, var7);
                    } else {
                        Class.forName("jc").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.field8706, Integer.valueOf(var7), new Integer(var8));
                    }
                } else if (this.field8732 && var3 == 15) {
                    boolean var9 = var2.field5974 != 0;
                    Component var10 = (Component) var2.field5971;
                    if (this.field8720) {
                        this.field8718.method973(var9, var10, 1);
                    } else {
                        Class.forName("jc").getDeclaredMethod("showcursor", field8733 == null ? (field8733 = method3597("java.awt.Component")) : field8733, Boolean.TYPE).invoke(this.field8706, var10, Boolean.valueOf(var9));
                    }
                } else if (!this.field8720 && var3 == 17) {
                    Object[] var15 = (Object[]) var2.field5971;
                    Class.forName("jc").getDeclaredMethod("setcustomcursor", field8733 == null ? (field8733 = method3597("java.awt.Component")) : field8733, field8734 == null ? (field8734 = method3597("[I")) : field8734, Integer.TYPE, Integer.TYPE, field8735 == null ? (field8735 = method3597("java.awt.Point")) : field8735).invoke(this.field8706, (Component) var15[0], (int[]) var15[1], Integer.valueOf(var2.field5974), new Integer(var2.field5970), (Point) var15[2]);
                } else if (var3 == 16) {
                    try {
                        if (!field8710.startsWith("win")) {
                            throw new Exception();
                        }
                        String var11 = (String) var2.field5971;
                        if (!var11.startsWith("http://") && !var11.startsWith("https://")) {
                            throw new Exception();
                        }
                        String var12 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                        int var13 = 0;
                        while (true) {
                            if (var13 >= var11.length()) {
                                Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var11 + "\"");
                                var2.field5973 = null;
                                break;
                            }
                            if (var12.indexOf(var11.charAt(var13)) == -1) {
                                throw new Exception();
                            }
                            var13++;
                        }
                    } catch (Exception var31) {
                        var2.field5973 = var31;
                        throw var31;
                    }
                } else {
                    throw new Exception("");
                }
                var2.field5975 = 1;
            } catch (ThreadDeath var32) {
                throw var32;
            } catch (Throwable var33) {
                var2.field5975 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "([Ljava/lang/Class;ILjava/lang/String;Ljava/lang/Class;)Lfg;", line = 373)
    public final class436 method3582(Class[] arg0, int arg1, String arg2, Class arg3) {
        if (arg1 != 0) {
            this.method3588(-76);
        }
        return this.method3587(8, new Object[] { arg3, arg2, arg0 }, 0, (byte) 75, 0);
    }

    @OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V", line = 698)
    public class613(int arg0, String arg1, int arg2, boolean arg3) throws Exception {
        field8723 = "1.1";
        this.field8732 = arg3;
        field8717 = arg0;
        field8724 = "Unknown";
        field8729 = arg1;
        try {
            field8724 = System.getProperty("java.vendor");
            field8723 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        if (field8724.toLowerCase().indexOf("microsoft") != -1) {
            this.field8720 = true;
        }
        try {
            field8708 = System.getProperty("os.name");
        } catch (Exception var19) {
            field8708 = "Unknown";
        }
        field8710 = field8708.toLowerCase();
        try {
            field8722 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field8722 = "";
        }
        try {
            field8725 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
            field8725 = "";
        }
        try {
            field8719 = System.getProperty("user.home");
            if (field8719 != null) {
                field8719 = field8719 + "/";
            }
        } catch (Exception var16) {
        }
        if (field8719 == null) {
            field8719 = "~/";
        }
        try {
            this.field8711 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        if (!this.field8720) {
            try {
                field8726 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } catch (Exception var14) {
            }
            try {
                field8712 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } catch (Exception var13) {
            }
        }
        class681.method3895(false, field8729, field8717);
        if (this.field8732) {
            this.field8715 = new class721(class681.method3896(null, -1782, field8717, "random.dat"), "rw", 25L);
            this.field8716 = new class721(class681.method3897("main_file_cache.dat2", (byte) 103), "rw", 209715200L);
            this.field8709 = new class721(class681.method3897("main_file_cache.idx255", (byte) -109), "rw", 1048576L);
            this.field8730 = new class721[arg2];
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field8730[var5] = new class721(class681.method3897("main_file_cache.idx" + var5, (byte) -126), "rw", 1048576L);
            }
            if (this.field8720) {
                try {
                    this.field8728 = Class.forName("ns").getDeclaredConstructor().newInstance();
                } catch (Throwable var12) {
                }
            }
            try {
                if (this.field8720) {
                    this.field8714 = new class341();
                } else {
                    this.field8713 = Class.forName("ks").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var11) {
            }
            try {
                if (this.field8720) {
                    this.field8718 = new class152();
                } else {
                    this.field8706 = Class.forName("jc").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var10) {
            }
        }
        if (this.field8732 && !this.field8720) {
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
        this.field8707 = false;
        this.field8705 = new Thread(this);
        this.field8705.setPriority(10);
        this.field8705.setDaemon(true);
        this.field8705.start();
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(II)Lfg;", line = 393)
    public final class436 method3583(int arg0, int arg1) {
        if (arg1 != 2) {
            this.method3583(3, 90);
        }
        return this.method3587(3, null, arg0, (byte) 75, 0);
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(BLjava/net/URL;)Lfg;", line = 403)
    public final class436 method3584(byte arg0, URL arg1) {
        int var3 = 50 % ((-arg0 - 71) / 54);
        return this.method3587(4, arg1, 0, (byte) 75, 0);
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "([BILjava/io/File;)Z", line = 412)
    public final boolean method3585(byte[] arg0, int arg1, File arg2) {
        try {
            if (arg1 <= 81) {
                return false;
            } else {
                FileOutputStream var4 = new FileOutputStream(arg2);
                var4.write(arg0, 0, arg0.length);
                var4.close();
                return true;
            }
        } catch (IOException var5) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Lel;", line = 432)
    private static final class721 method3586(String arg0, int arg1, String arg2, int arg3) {
        String var4;
        if (arg3 == 33) {
            var4 = "jagex_" + arg2 + "_preferences" + arg0 + "_rc.dat";
        } else if (arg3 == 34) {
            var4 = "jagex_" + arg2 + "_preferences" + arg0 + "_wip.dat";
        } else {
            var4 = "jagex_" + arg2 + "_preferences" + arg0 + ".dat";
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", field8719, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
        for (int var6 = arg1; var6 < var5.length; var6++) {
            String var7 = var5[var6];
            if (var7.length() <= 0 || (new File(var7)).exists()) {
                try {
                    return new class721(new File(var7, var4), "rw", 10000L);
                } catch (Exception var9) {
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(ILjava/lang/Object;IBI)Lfg;", line = 473)
    private final class436 method3587(int arg0, Object arg1, int arg2, byte arg3, int arg4) {
        if (arg3 != 75) {
            return null;
        }
        class436 var6 = new class436();
        var6.field5971 = arg1;
        var6.field5974 = arg2;
        var6.field5970 = arg4;
        var6.field5976 = arg0;
        synchronized (this) {
            if (this.field8727 == null) {
                this.field8727 = this.field8721 = var6;
            } else {
                this.field8727.field5972 = var6;
                this.field8727 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(I)V", line = 506)
    public final void method3588(int arg0) {
        if (arg0 >= -22) {
            this.field8728 = null;
        }
        field8731 = class224.method1457((byte) -62) + 5000L;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Ljava/awt/Point;[IIILjava/awt/Component;I)Lfg;", line = 517)
    public final class436 method3589(Point arg0, int[] arg1, int arg2, int arg3, Component arg4, int arg5) {
        int var7 = 57 / ((arg5 - 72) / 40);
        return this.method3587(17, new Object[] { arg4, arg1, arg0 }, arg2, (byte) 75, arg3);
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(BLjava/lang/String;)Lfg;", line = 528)
    public final class436 method3590(byte arg0, String arg1) {
        if (arg0 <= 59) {
            this.field8706 = null;
        }
        return this.method3587(16, arg1, 0, (byte) 75, 0);
    }

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "(I)V", line = 539)
    public final void method3591(int arg0) {
        synchronized (this) {
            this.field8707 = true;
            this.notifyAll();
        }
        try {
            this.field8705.join();
        } catch (InterruptedException var8) {
        }
        if (this.field8716 != null) {
            try {
                this.field8716.method4048(1);
            } catch (IOException var7) {
            }
        }
        if (this.field8709 != null) {
            try {
                this.field8709.method4048(1);
            } catch (IOException var6) {
            }
        }
        if (arg0 != 1048576) {
            return;
        }
        if (this.field8730 != null) {
            for (int var3 = 0; var3 < this.field8730.length; var3++) {
                if (this.field8730[var3] != null) {
                    try {
                        this.field8730[var3].method4048(arg0 - 1048575);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field8715 != null) {
            try {
                this.field8715.method4048(1);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(ILjava/lang/Class;Ljava/lang/String;)Lfg;", line = 604)
    public final class436 method3592(int arg0, Class arg1, String arg2) {
        if (arg0 != 0) {
            this.method3588(111);
        }
        return this.method3587(9, new Object[] { arg1, arg2 }, 0, (byte) 75, 0);
    }

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "(I)Lfg;", line = 616)
    public final class436 method3593(int arg0) {
        if (arg0 >= -60) {
            this.method3578(false);
        }
        return this.method3587(5, null, 0, (byte) 75, 0);
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(ILjava/lang/String;)Lel;", line = 639)
    public static final class721 method3594(int arg0, String arg1) {
        if (arg0 != -9) {
            field8708 = null;
        }
        return method3586(arg1, 0, field8729, field8717);
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(B)Ljava/lang/Object;", line = 661)
    public final Object method3595(byte arg0) {
        return arg0 >= -108 ? null : this.field8728;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(BLjava/lang/String;Z)Lfg;", line = 673)
    public final class436 method3596(byte arg0, String arg1, boolean arg2) {
        if (arg0 < 80) {
            this.field8720 = true;
        }
        return arg2 ? this.method3587(12, arg1, 0, (byte) 75, 0) : this.method3587(13, arg1, 0, (byte) 75, 0);
    }
}
