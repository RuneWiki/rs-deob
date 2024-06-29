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

@OriginalClass("client!vt")
public class class768 implements Runnable {

    @OriginalMember(owner = "client!vt", name = "d", descriptor = "Z")
    private boolean field10558 = false;

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "Lfe;")
    private class344 field10556 = null;

    @OriginalMember(owner = "client!vt", name = "r", descriptor = "Lfe;")
    private class344 field10572 = null;

    @OriginalMember(owner = "client!vt", name = "v", descriptor = "Z")
    public boolean field10576 = false;

    @OriginalMember(owner = "client!vt", name = "u", descriptor = "Lgba;")
    public class523 field10575 = null;

    @OriginalMember(owner = "client!vt", name = "g", descriptor = "Z")
    public boolean field10561 = false;

    @OriginalMember(owner = "client!vt", name = "k", descriptor = "Lgba;")
    public class523 field10565 = null;

    @OriginalMember(owner = "client!vt", name = "c", descriptor = "Lgba;")
    public class523 field10557 = null;

    @OriginalMember(owner = "client!vt", name = "f", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field10560;

    @OriginalMember(owner = "client!vt", name = "l", descriptor = "[Lgba;")
    public class523[] field10566;

    @OriginalMember(owner = "client!vt", name = "x", descriptor = "Ljava/lang/Object;")
    private Object field10578;

    @OriginalMember(owner = "client!vt", name = "B", descriptor = "Lkq;")
    private class782 field10582;

    @OriginalMember(owner = "client!vt", name = "w", descriptor = "Ljava/lang/Object;")
    private Object field10577;

    @OriginalMember(owner = "client!vt", name = "j", descriptor = "Lew;")
    private class252 field10564;

    @OriginalMember(owner = "client!vt", name = "t", descriptor = "Ljava/lang/Object;")
    private Object field10574;

    @OriginalMember(owner = "client!vt", name = "m", descriptor = "Ljava/lang/Thread;")
    private Thread field10567;

    @OriginalMember(owner = "client!vt", name = "i", descriptor = "J")
    private static volatile long field10563 = 0L;

    @OriginalMember(owner = "client!vt", name = "y", descriptor = "I")
    private static int field10579;

    // $FF: synthetic field
    @OriginalMember(owner = "client!vt", name = "C", descriptor = "Ljava/lang/Class;")
    public static Class field10583;

    // $FF: synthetic field
    @OriginalMember(owner = "client!vt", name = "D", descriptor = "Ljava/lang/Class;")
    public static Class field10584;

    // $FF: synthetic field
    @OriginalMember(owner = "client!vt", name = "E", descriptor = "Ljava/lang/Class;")
    public static Class field10585;

    // $FF: synthetic field
    @OriginalMember(owner = "client!vt", name = "F", descriptor = "Ljava/lang/Class;")
    public static Class field10586;

    @OriginalMember(owner = "client!vt", name = "e", descriptor = "Ljava/lang/String;")
    private static String field10559;

    @OriginalMember(owner = "client!vt", name = "h", descriptor = "Ljava/lang/String;")
    public static String field10562;

    @OriginalMember(owner = "client!vt", name = "n", descriptor = "Ljava/lang/String;")
    public static String field10568;

    @OriginalMember(owner = "client!vt", name = "o", descriptor = "Ljava/lang/String;")
    private static String field10569;

    @OriginalMember(owner = "client!vt", name = "p", descriptor = "Ljava/lang/String;")
    public static String field10570;

    @OriginalMember(owner = "client!vt", name = "s", descriptor = "Ljava/lang/String;")
    public static String field10573;

    @OriginalMember(owner = "client!vt", name = "z", descriptor = "Ljava/lang/String;")
    private static String field10580;

    @OriginalMember(owner = "client!vt", name = "A", descriptor = "Ljava/lang/String;")
    public static String field10581;

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field10555;

    @OriginalMember(owner = "client!vt", name = "q", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field10571;

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(BIIII)Lfe;")
    public final class344 method4228(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = -13 / ((-arg0 - 65) / 59);
        return this.method4245(6, 78, (arg3 << 16) + arg4, (arg1 << 16) + arg2, null);
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(Z)Ljava/lang/Object;")
    public final Object method4229(boolean arg0) {
        if (!arg0) {
            this.method4228((byte) -108, 124, 77, -47, -8);
        }
        return this.field10578;
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(ILjava/lang/String;)Lgba;")
    public static final class523 method4230(int arg0, String arg1) {
        if (arg0 != 0) {
            field10571 = null;
        }
        return method4231(12793, arg1, field10579, field10559);
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)Lgba;")
    private static final class523 method4231(int arg0, String arg1, int arg2, String arg3) {
        String var4;
        if (arg2 == 33) {
            var4 = "jagex_" + arg3 + "_preferences" + arg1 + "_rc.dat";
        } else if (arg2 == 34) {
            var4 = "jagex_" + arg3 + "_preferences" + arg1 + "_wip.dat";
        } else {
            var4 = "jagex_" + arg3 + "_preferences" + arg1 + ".dat";
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", field10580, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
        for (int var6 = 0; var6 < var5.length; var6++) {
            String var7 = var5[var6];
            if (var7.length() <= 0 || (new File(var7)).exists()) {
                try {
                    return new class523(new File(var7, var4), "rw", 10000L);
                } catch (Exception var9) {
                }
            }
        }
        if (arg0 != 12793) {
            method4231(43, null, 28, null);
        }
        return null;
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(ILjava/net/URL;)Lfe;")
    public final class344 method4232(int arg0, URL arg1) {
        if (arg0 != 4) {
            this.field10572 = null;
        }
        return this.method4245(4, 86, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(II)Lfe;")
    public final class344 method4233(int arg0, int arg1) {
        if (arg0 != 0) {
            field10579 = 78;
        }
        return this.method4245(3, 73, 0, arg1, null);
    }

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "(ILjava/lang/String;)Lfe;")
    public final class344 method4234(int arg0, String arg1) {
        return arg0 == 26126 ? this.method4245(16, 67, 0, 0, arg1) : null;
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Lfe;")
    public final class344 method4235(Class arg0, String arg1, int arg2) {
        int var4 = -124 % ((arg2 - 48) / 35);
        return this.method4245(9, 123, 0, 0, new Object[] { arg0, arg1 });
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lfe;")
    public final class344 method4236(Runnable arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            this.method4245(22, 118, -29, -81, null);
        }
        return this.method4245(2, 110, 0, arg1, arg0);
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(I)V")
    public final void method4237(int arg0) {
        synchronized (this) {
            this.field10558 = true;
            this.notifyAll();
        }
        try {
            this.field10567.join();
            int var3 = 21 / ((arg0 + 15) / 59);
        } catch (InterruptedException var9) {
        }
        if (this.field10575 != null) {
            try {
                this.field10575.method3121((byte) 74);
            } catch (IOException var8) {
            }
        }
        if (this.field10565 != null) {
            try {
                this.field10565.method3121((byte) 87);
            } catch (IOException var7) {
            }
        }
        if (this.field10566 != null) {
            for (int var4 = 0; var4 < this.field10566.length; var4++) {
                if (this.field10566[var4] != null) {
                    try {
                        this.field10566[var4].method3121((byte) 103);
                    } catch (IOException var6) {
                    }
                }
            }
        }
        if (this.field10557 != null) {
            try {
                this.field10557.method3121((byte) 99);
            } catch (IOException var5) {
            }
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(ILjava/io/File;[B)Z")
    public final boolean method4238(int arg0, File arg1, byte[] arg2) {
        try {
            if (arg0 >= -94) {
                return false;
            } else {
                FileOutputStream var4 = new FileOutputStream(arg1);
                var4.write(arg2, 0, arg2.length);
                var4.close();
                return true;
            }
        } catch (IOException var5) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(Z[ILjava/awt/Component;IILjava/awt/Point;)Lfe;")
    public final class344 method4239(boolean arg0, int[] arg1, Component arg2, int arg3, int arg4, Point arg5) {
        if (!arg0) {
            this.method4246(null, null, null, -23);
        }
        return this.method4245(17, 88, arg4, arg3, new Object[] { arg2, arg1, arg5 });
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(B)Z")
    public final boolean method4240(byte arg0) {
        if (arg0 != 109) {
            return false;
        } else if (!this.field10576) {
            return false;
        } else if (this.field10561) {
            return this.field10582 != null;
        } else {
            return this.field10577 != null;
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(Ljava/awt/Frame;I)Lfe;")
    public final class344 method4241(Frame arg0, int arg1) {
        return arg1 < 59 ? null : this.method4245(7, 98, 0, 0, arg0);
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(Ljava/lang/String;ZII)Lfe;")
    public final class344 method4242(String arg0, boolean arg1, int arg2, int arg3) {
        return arg2 == 1 ? this.method4245(arg1 ? 22 : 1, arg2 + 72, 0, arg3, arg0) : null;
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(BZLjava/lang/String;)Lfe;")
    public final class344 method4243(byte arg0, boolean arg1, String arg2) {
        if (arg0 >= -115) {
            this.field10557 = null;
        }
        return arg1 ? this.method4245(12, 120, 0, 0, arg2) : this.method4245(13, 90, 0, 0, arg2);
    }

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "(B)Lfe;")
    public final class344 method4244(byte arg0) {
        if (arg0 <= 45) {
            this.method4237(-60);
        }
        return this.method4245(5, 92, 0, 0, null);
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(IIIILjava/lang/Object;)Lfe;")
    private final class344 method4245(int arg0, int arg1, int arg2, int arg3, Object arg4) {
        if (arg1 < 62) {
            return null;
        }
        class344 var6 = new class344();
        var6.field4972 = arg0;
        var6.field4974 = arg2;
        var6.field4969 = arg3;
        var6.field4971 = arg4;
        synchronized (this) {
            if (this.field10556 == null) {
                this.field10556 = this.field10572 = var6;
            } else {
                this.field10556.field4973 = var6;
                this.field10556 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;I)Lfe;")
    public final class344 method4246(String arg0, Class arg1, Class[] arg2, int arg3) {
        return arg3 == 0 ? this.method4245(8, 80, 0, 0, new Object[] { arg1, arg0, arg2 }) : null;
    }

    @OriginalMember(owner = "client!vt", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class344 var2;
            synchronized (this) {
                while (true) {
                    if (this.field10558) {
                        return;
                    }
                    if (this.field10572 != null) {
                        var2 = this.field10572;
                        this.field10572 = this.field10572.field4973;
                        if (this.field10572 == null) {
                            this.field10556 = null;
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
                int var3 = var2.field4972;
                if (var3 == 1) {
                    if (class683.method3903((byte) 4) < field10563) {
                        throw new IOException();
                    }
                    var2.field4975 = new Socket(InetAddress.getByName((String) var2.field4971), var2.field4969);
                } else if (var3 == 22) {
                    if (field10563 > class683.method3903((byte) 4)) {
                        throw new IOException();
                    }
                    try {
                        var2.field4975 = class739.method4104(1, var2.field4969, (String) var2.field4971).method31((byte) -109);
                    } catch (class207 var29) {
                        var2.field4975 = var29.getMessage();
                        throw var29;
                    }
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field4971);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field4969);
                    var2.field4975 = var4;
                } else if (var3 == 4) {
                    if (class683.method3903((byte) 4) < field10563) {
                        throw new IOException();
                    }
                    var2.field4975 = new DataInputStream(((URL) var2.field4971).openStream());
                } else if (var3 == 8) {
                    Object[] var22 = (Object[]) var2.field4971;
                    if (this.field10576 && ((Class) var22[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field4975 = ((Class) var22[0]).getDeclaredMethod((String) var22[1], (Class[]) var22[2]);
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field4971;
                    if (this.field10576 && ((Class) var5[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field4975 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else if (var3 == 18) {
                    Clipboard var21 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field4975 = var21.getContents(null);
                } else if (var3 == 19) {
                    Transferable var6 = (Transferable) var2.field4971;
                    Clipboard var7 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var7.setContents(var6, null);
                } else if (!this.field10576) {
                    throw new Exception("");
                } else if (var3 == 3) {
                    if (class683.method3903((byte) 4) < field10563) {
                        throw new IOException();
                    }
                    String var8 = (var2.field4969 >> 24 & 0xFF) + "." + (var2.field4969 >> 16 & 0xFF) + "." + (var2.field4969 >> 8 & 0xFF) + "." + (var2.field4969 & 0xFF);
                    var2.field4975 = InetAddress.getByName(var8).getHostName();
                } else if (var3 == 21) {
                    if (field10563 > class683.method3903((byte) 4)) {
                        throw new IOException();
                    }
                    var2.field4975 = InetAddress.getByName((String) var2.field4971).getAddress();
                } else if (var3 == 5) {
                    if (this.field10561) {
                        var2.field4975 = this.field10582.method4301(0);
                    } else {
                        var2.field4975 = Class.forName("iu").getMethod("listmodes").invoke(this.field10577);
                    }
                } else if (var3 == 6) {
                    Frame var9 = new Frame("Jagex Full Screen");
                    var2.field4975 = var9;
                    var9.setResizable(false);
                    if (this.field10561) {
                        this.field10582.method4299(var2.field4969 & 0xFFFF, var2.field4974 & 0xFFFF, var2.field4974 >> 16, var2.field4969 >>> 16, var9, 0);
                    } else {
                        Class.forName("iu").getMethod("enter", field10583 == null ? (field10583 = method4248("java.awt.Frame")) : field10583, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.field10577, var9, Integer.valueOf(var2.field4969 >>> 16), new Integer(var2.field4969 & 0xFFFF), Integer.valueOf(var2.field4974 >> 16), new Integer(var2.field4974 & 0xFFFF));
                    }
                } else if (var3 == 7) {
                    if (this.field10561) {
                        this.field10582.method4300((Frame) var2.field4971, 8);
                    } else {
                        Class.forName("iu").getMethod("exit").invoke(this.field10577);
                    }
                } else if (var3 == 12) {
                    class523 var20 = method4231(12793, (String) var2.field4971, field10579, field10559);
                    var2.field4975 = var20;
                } else if (var3 == 13) {
                    class523 var19 = method4231(12793, (String) var2.field4971, field10579, "");
                    var2.field4975 = var19;
                } else if (this.field10576 && var3 == 14) {
                    int var17 = var2.field4969;
                    int var18 = var2.field4974;
                    if (this.field10561) {
                        this.field10564.method1691(var18, -33, var17);
                    } else {
                        Class.forName("qca").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.field10574, Integer.valueOf(var17), new Integer(var18));
                    }
                } else if (this.field10576 && var3 == 15) {
                    boolean var10 = var2.field4969 != 0;
                    Component var11 = (Component) var2.field4971;
                    if (this.field10561) {
                        this.field10564.method1690(var10, 5912, var11);
                    } else {
                        Class.forName("qca").getDeclaredMethod("showcursor", field10584 == null ? (field10584 = method4248("java.awt.Component")) : field10584, Boolean.TYPE).invoke(this.field10574, var11, Boolean.valueOf(var10));
                    }
                } else if (!this.field10561 && var3 == 17) {
                    Object[] var16 = (Object[]) var2.field4971;
                    Class.forName("qca").getDeclaredMethod("setcustomcursor", field10584 == null ? (field10584 = method4248("java.awt.Component")) : field10584, field10585 == null ? (field10585 = method4248("[I")) : field10585, Integer.TYPE, Integer.TYPE, field10586 == null ? (field10586 = method4248("java.awt.Point")) : field10586).invoke(this.field10574, (Component) var16[0], (int[]) var16[1], Integer.valueOf(var2.field4969), new Integer(var2.field4974), (Point) var16[2]);
                } else if (var3 == 16) {
                    try {
                        if (!field10562.startsWith("win")) {
                            throw new Exception();
                        }
                        String var12 = (String) var2.field4971;
                        if (!var12.startsWith("http://") && !var12.startsWith("https://")) {
                            throw new Exception();
                        }
                        String var13 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                        int var14 = 0;
                        while (true) {
                            if (var12.length() <= var14) {
                                Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var12 + "\"");
                                var2.field4975 = null;
                                break;
                            }
                            if (var13.indexOf(var12.charAt(var14)) == -1) {
                                throw new Exception();
                            }
                            var14++;
                        }
                    } catch (Exception var31) {
                        var2.field4975 = var31;
                        throw var31;
                    }
                } else {
                    throw new Exception("");
                }
                var2.field4970 = 1;
            } catch (ThreadDeath var32) {
                throw var32;
            } catch (Throwable var33) {
                var2.field4970 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "(Z)V")
    public final void method4247(boolean arg0) {
        field10563 = class683.method3903((byte) 4) + 5000L;
        if (!arg0) {
            this.run();
        }
    }

    @OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V")
    public class768(int arg0, String arg1, int arg2, boolean arg3) throws Exception {
        this.field10576 = arg3;
        field10579 = arg0;
        field10573 = "1.1";
        field10559 = arg1;
        field10568 = "Unknown";
        try {
            field10568 = System.getProperty("java.vendor");
            field10573 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        if (field10568.toLowerCase().indexOf("microsoft") != -1) {
            this.field10561 = true;
        }
        try {
            field10569 = System.getProperty("os.name");
        } catch (Exception var19) {
            field10569 = "Unknown";
        }
        field10562 = field10569.toLowerCase();
        try {
            field10570 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field10570 = "";
        }
        try {
            field10581 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
            field10581 = "";
        }
        try {
            field10580 = System.getProperty("user.home");
            if (field10580 != null) {
                field10580 = field10580 + "/";
            }
        } catch (Exception var16) {
        }
        if (field10580 == null) {
            field10580 = "~/";
        }
        try {
            this.field10560 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        if (!this.field10561) {
            try {
                field10555 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } catch (Exception var14) {
            }
            try {
                field10571 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } catch (Exception var13) {
            }
        }
        class272.method1770(field10559, field10579, 0);
        if (this.field10576) {
            this.field10557 = new class523(class272.method1771(true, "random.dat", field10579, null), "rw", 25L);
            this.field10575 = new class523(class272.method1772(-16819, "main_file_cache.dat2"), "rw", 314572800L);
            this.field10565 = new class523(class272.method1772(-16819, "main_file_cache.idx255"), "rw", 1048576L);
            this.field10566 = new class523[arg2];
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field10566[var5] = new class523(class272.method1772(-16819, "main_file_cache.idx" + var5), "rw", 1048576L);
            }
            if (this.field10561) {
                try {
                    this.field10578 = Class.forName("nea").getDeclaredConstructor().newInstance();
                } catch (Throwable var12) {
                }
            }
            try {
                if (this.field10561) {
                    this.field10582 = new class782();
                } else {
                    this.field10577 = Class.forName("iu").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var11) {
            }
            try {
                if (this.field10561) {
                    this.field10564 = new class252();
                } else {
                    this.field10574 = Class.forName("qca").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var10) {
            }
        }
        if (this.field10576 && !this.field10561) {
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
        this.field10558 = false;
        this.field10567 = new Thread(this);
        this.field10567.setPriority(10);
        this.field10567.setDaemon(true);
        this.field10567.start();
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method4248(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
