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

@OriginalClass("client!oq")
public class class775 implements Runnable {

    @OriginalMember(owner = "client!oq", name = "m", descriptor = "Z")
    public boolean field10571 = false;

    @OriginalMember(owner = "client!oq", name = "j", descriptor = "Ltba;")
    private class339 field10568 = null;

    @OriginalMember(owner = "client!oq", name = "s", descriptor = "Ltba;")
    private class339 field10577 = null;

    @OriginalMember(owner = "client!oq", name = "l", descriptor = "Lvm;")
    public class80 field10570 = null;

    @OriginalMember(owner = "client!oq", name = "t", descriptor = "Lvm;")
    public class80 field10578 = null;

    @OriginalMember(owner = "client!oq", name = "A", descriptor = "Lvm;")
    public class80 field10585 = null;

    @OriginalMember(owner = "client!oq", name = "w", descriptor = "Z")
    public boolean field10581 = false;

    @OriginalMember(owner = "client!oq", name = "B", descriptor = "Z")
    private boolean field10586 = false;

    @OriginalMember(owner = "client!oq", name = "q", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field10575;

    @OriginalMember(owner = "client!oq", name = "d", descriptor = "[Lvm;")
    public class80[] field10562;

    @OriginalMember(owner = "client!oq", name = "z", descriptor = "Ljava/lang/Object;")
    private Object field10584;

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "Ljava/lang/Object;")
    private Object field10560;

    @OriginalMember(owner = "client!oq", name = "h", descriptor = "Laha;")
    private class94 field10566;

    @OriginalMember(owner = "client!oq", name = "n", descriptor = "Ljava/lang/Object;")
    private Object field10572;

    @OriginalMember(owner = "client!oq", name = "i", descriptor = "Llk;")
    private class265 field10567;

    @OriginalMember(owner = "client!oq", name = "p", descriptor = "Ljava/lang/Thread;")
    private Thread field10574;

    @OriginalMember(owner = "client!oq", name = "o", descriptor = "J")
    private static volatile long field10573 = 0L;

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "I")
    private static int field10559;

    // $FF: synthetic field
    @OriginalMember(owner = "client!oq", name = "C", descriptor = "Ljava/lang/Class;")
    public static Class field10587;

    // $FF: synthetic field
    @OriginalMember(owner = "client!oq", name = "D", descriptor = "Ljava/lang/Class;")
    public static Class field10588;

    // $FF: synthetic field
    @OriginalMember(owner = "client!oq", name = "E", descriptor = "Ljava/lang/Class;")
    public static Class field10589;

    // $FF: synthetic field
    @OriginalMember(owner = "client!oq", name = "F", descriptor = "Ljava/lang/Class;")
    public static Class field10590;

    @OriginalMember(owner = "client!oq", name = "c", descriptor = "Ljava/lang/String;")
    public static String field10561;

    @OriginalMember(owner = "client!oq", name = "f", descriptor = "Ljava/lang/String;")
    public static String field10564;

    @OriginalMember(owner = "client!oq", name = "g", descriptor = "Ljava/lang/String;")
    public static String field10565;

    @OriginalMember(owner = "client!oq", name = "k", descriptor = "Ljava/lang/String;")
    private static String field10569;

    @OriginalMember(owner = "client!oq", name = "r", descriptor = "Ljava/lang/String;")
    private static String field10576;

    @OriginalMember(owner = "client!oq", name = "u", descriptor = "Ljava/lang/String;")
    public static String field10579;

    @OriginalMember(owner = "client!oq", name = "x", descriptor = "Ljava/lang/String;")
    private static String field10582;

    @OriginalMember(owner = "client!oq", name = "y", descriptor = "Ljava/lang/String;")
    public static String field10583;

    @OriginalMember(owner = "client!oq", name = "e", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field10563;

    @OriginalMember(owner = "client!oq", name = "v", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field10580;

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(I)Z")
    public final boolean method4230(int arg0) {
        if (arg0 != 5601) {
            return true;
        } else if (!this.field10571) {
            return false;
        } else if (this.field10581) {
            return this.field10566 != null;
        } else {
            return this.field10560 != null;
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(IIIII)Ltba;")
    public final class339 method4231(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return arg0 <= 30 ? null : this.method4249((arg1 << 16) + arg3, null, 6, (arg2 << 16) + arg4, (byte) -101);
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/Class;ILjava/lang/String;)Ltba;")
    public final class339 method4232(Class[] arg0, Class arg1, int arg2, String arg3) {
        if (arg2 != 0) {
            this.field10567 = null;
        }
        return this.method4249(0, new Object[] { arg1, arg3, arg0 }, 8, 0, (byte) -101);
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(Ljava/lang/String;B)Lvm;")
    public static final class80 method4233(String arg0, byte arg1) {
        int var2 = 81 % ((arg1 + 26) / 60);
        return method4240(field10582, arg0, -34, field10559);
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(Ljava/lang/String;ZI)Ltba;")
    public final class339 method4234(String arg0, boolean arg1, int arg2) {
        if (arg2 == 0) {
            return arg1 ? this.method4249(0, arg0, 12, 0, (byte) -101) : this.method4249(0, arg0, 13, 0, (byte) -101);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(ILjava/io/File;[B)Z")
    public final boolean method4235(int arg0, File arg1, byte[] arg2) {
        try {
            FileOutputStream var4 = new FileOutputStream(arg1);
            var4.write(arg2, 0, arg2.length);
            if (arg0 != 9) {
                this.method4242(-97, null);
            }
            var4.close();
            return true;
        } catch (IOException var5) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(II)Ltba;")
    public final class339 method4236(int arg0, int arg1) {
        if (arg1 != 3) {
            this.field10578 = null;
        }
        return this.method4249(arg0, null, 3, 0, (byte) -101);
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(B)V")
    public final void method4237(byte arg0) {
        field10573 = class502.method2786(-7114) + 5000L;
        int var2 = 20 % ((-arg0 - 48) / 41);
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(BLjava/awt/Component;[IIILjava/awt/Point;)Ltba;")
    public final class339 method4238(byte arg0, Component arg1, int[] arg2, int arg3, int arg4, Point arg5) {
        if (arg0 < 78) {
            field10580 = null;
        }
        return this.method4249(arg3, new Object[] { arg1, arg2, arg5 }, 17, arg4, (byte) -101);
    }

    @OriginalMember(owner = "client!oq", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class339 var2;
            synchronized (this) {
                while (true) {
                    if (this.field10586) {
                        return;
                    }
                    if (this.field10568 != null) {
                        var2 = this.field10568;
                        this.field10568 = this.field10568.field4145;
                        if (this.field10568 == null) {
                            this.field10577 = null;
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
                int var3 = var2.field4143;
                if (var3 == 1) {
                    if (class502.method2786(-7114) < field10573) {
                        throw new IOException();
                    }
                    var2.field4142 = new Socket(InetAddress.getByName((String) var2.field4141), var2.field4147);
                } else if (var3 == 22) {
                    if (field10573 > class502.method2786(-7114)) {
                        throw new IOException();
                    }
                    try {
                        var2.field4142 = class614.method3278(-50, var2.field4147, (String) var2.field4141).method18((byte) 3);
                    } catch (class88 var29) {
                        var2.field4142 = var29.getMessage();
                        throw var29;
                    }
                } else if (var3 == 2) {
                    Thread var22 = new Thread((Runnable) var2.field4141);
                    var22.setDaemon(true);
                    var22.start();
                    var22.setPriority(var2.field4147);
                    var2.field4142 = var22;
                } else if (var3 == 4) {
                    if (field10573 > class502.method2786(-7114)) {
                        throw new IOException();
                    }
                    var2.field4142 = new DataInputStream(((URL) var2.field4141).openStream());
                } else if (var3 == 8) {
                    Object[] var21 = (Object[]) var2.field4141;
                    if (this.field10571 && ((Class) var21[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field4142 = ((Class) var21[0]).getDeclaredMethod((String) var21[1], (Class[]) var21[2]);
                } else if (var3 == 9) {
                    Object[] var20 = (Object[]) var2.field4141;
                    if (this.field10571 && ((Class) var20[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field4142 = ((Class) var20[0]).getDeclaredField((String) var20[1]);
                } else if (var3 == 18) {
                    Clipboard var4 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field4142 = var4.getContents(null);
                } else if (var3 == 19) {
                    Transferable var5 = (Transferable) var2.field4141;
                    Clipboard var6 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var6.setContents(var5, null);
                } else if (!this.field10571) {
                    throw new Exception("");
                } else if (var3 == 3) {
                    if (field10573 > class502.method2786(-7114)) {
                        throw new IOException();
                    }
                    String var7 = (var2.field4147 >> 24 & 0xFF) + "." + (var2.field4147 >> 16 & 0xFF) + "." + ((var2.field4147 & 0xFF3B) >> 8) + "." + (var2.field4147 & 0xFF);
                    var2.field4142 = InetAddress.getByName(var7).getHostName();
                } else if (var3 == 21) {
                    if (field10573 > class502.method2786(-7114)) {
                        throw new IOException();
                    }
                    var2.field4142 = InetAddress.getByName((String) var2.field4141).getAddress();
                } else if (var3 == 5) {
                    if (this.field10581) {
                        var2.field4142 = this.field10566.method564((byte) -95);
                    } else {
                        var2.field4142 = Class.forName("ab").getMethod("listmodes").invoke(this.field10560);
                    }
                } else if (var3 == 6) {
                    Frame var19 = new Frame("Jagex Full Screen");
                    var2.field4142 = var19;
                    var19.setResizable(false);
                    if (this.field10581) {
                        this.field10566.method565(var2.field4147 >>> 16, 115, var19, var2.field4146 >> 16, var2.field4146 & 0xFFFF, var2.field4147 & 0xFFFF);
                    } else {
                        Class.forName("ab").getMethod("enter", field10590 == null ? (field10590 = method4250("java.awt.Frame")) : field10590, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.field10560, var19, Integer.valueOf(var2.field4147 >>> 16), new Integer(var2.field4147 & 0xFFFF), Integer.valueOf(var2.field4146 >> 16), new Integer(var2.field4146 & 0xFFFF));
                    }
                } else if (var3 == 7) {
                    if (this.field10581) {
                        this.field10566.method566((Frame) var2.field4141, (byte) -39);
                    } else {
                        Class.forName("ab").getMethod("exit").invoke(this.field10560);
                    }
                } else if (var3 == 12) {
                    class80 var8 = method4240(field10582, (String) var2.field4141, -34, field10559);
                    var2.field4142 = var8;
                } else if (var3 == 13) {
                    class80 var18 = method4240("", (String) var2.field4141, -34, field10559);
                    var2.field4142 = var18;
                } else if (this.field10571 && var3 == 14) {
                    int var9 = var2.field4147;
                    int var10 = var2.field4146;
                    if (this.field10581) {
                        this.field10567.method1675(var10, var9, 120);
                    } else {
                        Class.forName("nha").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.field10572, Integer.valueOf(var9), new Integer(var10));
                    }
                } else if (this.field10571 && var3 == 15) {
                    boolean var16 = var2.field4147 != 0;
                    Component var17 = (Component) var2.field4141;
                    if (this.field10581) {
                        this.field10567.method1674(var16, 86, var17);
                    } else {
                        Class.forName("nha").getDeclaredMethod("showcursor", field10587 == null ? (field10587 = method4250("java.awt.Component")) : field10587, Boolean.TYPE).invoke(this.field10572, var17, Boolean.valueOf(var16));
                    }
                } else if (!this.field10581 && var3 == 17) {
                    Object[] var15 = (Object[]) var2.field4141;
                    Class.forName("nha").getDeclaredMethod("setcustomcursor", field10587 == null ? (field10587 = method4250("java.awt.Component")) : field10587, field10588 == null ? (field10588 = method4250("[I")) : field10588, Integer.TYPE, Integer.TYPE, field10589 == null ? (field10589 = method4250("java.awt.Point")) : field10589).invoke(this.field10572, (Component) var15[0], (int[]) var15[1], Integer.valueOf(var2.field4147), new Integer(var2.field4146), (Point) var15[2]);
                } else if (var3 == 16) {
                    try {
                        if (!field10561.startsWith("win")) {
                            throw new Exception();
                        }
                        String var11 = (String) var2.field4141;
                        if (!var11.startsWith("http://") && !var11.startsWith("https://")) {
                            throw new Exception();
                        }
                        String var12 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                        for (int var13 = 0; var11.length() > var13; var13++) {
                            if (var12.indexOf(var11.charAt(var13)) == -1) {
                                throw new Exception();
                            }
                        }
                        Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var11 + "\"");
                        var2.field4142 = null;
                    } catch (Exception var31) {
                        var2.field4142 = var31;
                        throw var31;
                    }
                } else {
                    throw new Exception("");
                }
                var2.field4144 = 1;
            } catch (ThreadDeath var32) {
                throw var32;
            } catch (Throwable var33) {
                var2.field4144 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(ZIILjava/lang/String;)Ltba;")
    public final class339 method4239(boolean arg0, int arg1, int arg2, String arg3) {
        if (arg1 != 724) {
            this.method4237((byte) -88);
        }
        return this.method4249(arg2, arg3, arg0 ? 22 : 1, 0, (byte) -101);
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)Lvm;")
    private static final class80 method4240(String arg0, String arg1, int arg2, int arg3) {
        String var4;
        if (~arg3 == arg2) {
            var4 = "jagex_" + arg0 + "_preferences" + arg1 + "_rc.dat";
        } else if (arg3 == 34) {
            var4 = "jagex_" + arg0 + "_preferences" + arg1 + "_wip.dat";
        } else {
            var4 = "jagex_" + arg0 + "_preferences" + arg1 + ".dat";
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", field10569, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
        for (int var6 = 0; var6 < var5.length; var6++) {
            String var7 = var5[var6];
            if (var7.length() <= 0 || (new File(var7)).exists()) {
                try {
                    return new class80(new File(var7, var4), "rw", 10000L);
                } catch (Exception var9) {
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(ILjava/awt/Frame;)Ltba;")
    public final class339 method4241(int arg0, Frame arg1) {
        if (arg0 <= 99) {
            this.method4235(-28, null, null);
        }
        return this.method4249(0, arg1, 7, 0, (byte) -101);
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(ILjava/net/URL;)Ltba;")
    public final class339 method4242(int arg0, URL arg1) {
        if (arg0 != -5756) {
            field10582 = null;
        }
        return this.method4249(0, arg1, 4, 0, (byte) -101);
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(Z)Ljava/lang/Object;")
    public final Object method4243(boolean arg0) {
        return arg0 ? this.field10584 : null;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Ltba;")
    public final class339 method4244(Class arg0, String arg1, int arg2) {
        if (arg2 != 255) {
            this.method4236(53, -13);
        }
        return this.method4249(0, new Object[] { arg0, arg1 }, 9, 0, (byte) -101);
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(Ljava/lang/String;I)Ltba;")
    public final class339 method4245(String arg0, int arg1) {
        return arg1 == 65535 ? this.method4249(0, arg0, 16, 0, (byte) -101) : null;
    }

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "(I)Ltba;")
    public final class339 method4246(int arg0) {
        return arg0 == 5 ? this.method4249(0, null, 5, 0, (byte) -101) : null;
    }

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "(B)V")
    public final void method4247(byte arg0) {
        synchronized (this) {
            this.field10586 = true;
            this.notifyAll();
        }
        try {
            if (arg0 != 71) {
                return;
            }
            this.field10574.join();
        } catch (InterruptedException var8) {
        }
        if (this.field10585 != null) {
            try {
                this.field10585.method503((byte) 61);
            } catch (IOException var7) {
            }
        }
        if (this.field10578 != null) {
            try {
                this.field10578.method503((byte) 61);
            } catch (IOException var6) {
            }
        }
        if (this.field10562 != null) {
            for (int var3 = 0; var3 < this.field10562.length; var3++) {
                if (this.field10562[var3] != null) {
                    try {
                        this.field10562[var3].method503((byte) 61);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field10570 != null) {
            try {
                this.field10570.method503((byte) 61);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(Ljava/lang/Runnable;II)Ltba;")
    public final class339 method4248(Runnable arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.method4235(-63, null, null);
        }
        return this.method4249(arg2, arg0, 2, 0, (byte) -101);
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(ILjava/lang/Object;IIB)Ltba;")
    private final class339 method4249(int arg0, Object arg1, int arg2, int arg3, byte arg4) {
        class339 var6 = new class339();
        var6.field4146 = arg3;
        var6.field4141 = arg1;
        var6.field4143 = arg2;
        var6.field4147 = arg0;
        synchronized (this) {
            if (this.field10577 == null) {
                this.field10577 = this.field10568 = var6;
            } else {
                this.field10577.field4145 = var6;
                this.field10577 = var6;
            }
            this.notify();
            if (arg4 != -101) {
                field10583 = null;
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V")
    public class775(int arg0, String arg1, int arg2, boolean arg3) throws Exception {
        this.field10571 = arg3;
        field10559 = arg0;
        field10583 = "Unknown";
        field10582 = arg1;
        field10565 = "1.1";
        try {
            field10583 = System.getProperty("java.vendor");
            field10565 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        if (field10583.toLowerCase().indexOf("microsoft") != -1) {
            this.field10581 = true;
        }
        try {
            field10576 = System.getProperty("os.name");
        } catch (Exception var19) {
            field10576 = "Unknown";
        }
        field10561 = field10576.toLowerCase();
        try {
            field10564 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field10564 = "";
        }
        try {
            field10579 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
            field10579 = "";
        }
        try {
            field10569 = System.getProperty("user.home");
            if (field10569 != null) {
                field10569 = field10569 + "/";
            }
        } catch (Exception var16) {
        }
        if (field10569 == null) {
            field10569 = "~/";
        }
        try {
            this.field10575 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        if (!this.field10581) {
            try {
                field10563 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } catch (Exception var14) {
            }
            try {
                field10580 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } catch (Exception var13) {
            }
        }
        class125.method734(field10559, -103, field10582);
        if (this.field10571) {
            this.field10570 = new class80(class125.method735(null, field10559, "random.dat", 0), "rw", 25L);
            this.field10585 = new class80(class125.method733(75, "main_file_cache.dat2"), "rw", 314572800L);
            this.field10578 = new class80(class125.method733(96, "main_file_cache.idx255"), "rw", 1048576L);
            this.field10562 = new class80[arg2];
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field10562[var5] = new class80(class125.method733(66, "main_file_cache.idx" + var5), "rw", 1048576L);
            }
            if (this.field10581) {
                try {
                    this.field10584 = Class.forName("uba").getDeclaredConstructor().newInstance();
                } catch (Throwable var12) {
                }
            }
            try {
                if (this.field10581) {
                    this.field10566 = new class94();
                } else {
                    this.field10560 = Class.forName("ab").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var11) {
            }
            try {
                if (this.field10581) {
                    this.field10567 = new class265();
                } else {
                    this.field10572 = Class.forName("nha").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var10) {
            }
        }
        if (this.field10571 && !this.field10581) {
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
        this.field10586 = false;
        this.field10574 = new Thread(this);
        this.field10574.setPriority(10);
        this.field10574.setDaemon(true);
        this.field10574.start();
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method4250(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
