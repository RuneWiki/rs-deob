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
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public class class331 implements Runnable {

    @OriginalMember(owner = "client!lp", name = "l", descriptor = "Lhd;")
    public class633 field4567 = null;

    @OriginalMember(owner = "client!lp", name = "o", descriptor = "Lqo;")
    private class21 field4570 = null;

    @OriginalMember(owner = "client!lp", name = "m", descriptor = "Ljava/applet/Applet;")
    public Applet field4568 = null;

    @OriginalMember(owner = "client!lp", name = "p", descriptor = "Lqo;")
    private class21 field4571 = null;

    @OriginalMember(owner = "client!lp", name = "j", descriptor = "Lhd;")
    public class633 field4565 = null;

    @OriginalMember(owner = "client!lp", name = "f", descriptor = "Z")
    private boolean field4561 = false;

    @OriginalMember(owner = "client!lp", name = "s", descriptor = "Lhd;")
    public class633 field4574 = null;

    @OriginalMember(owner = "client!lp", name = "t", descriptor = "I")
    private int field4575;

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "Ljava/lang/String;")
    private String field4556;

    @OriginalMember(owner = "client!lp", name = "e", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field4560;

    @OriginalMember(owner = "client!lp", name = "r", descriptor = "Ljava/lang/Thread;")
    private Thread field4573;

    @OriginalMember(owner = "client!lp", name = "u", descriptor = "I")
    public static int field4576 = 3;

    @OriginalMember(owner = "client!lp", name = "h", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field4563 = new Hashtable(16);

    @OriginalMember(owner = "client!lp", name = "w", descriptor = "J")
    public static volatile long field4578 = 0L;

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "Lhba;")
    private class10 field4557;

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "Ljava/lang/String;")
    private static String field4558;

    @OriginalMember(owner = "client!lp", name = "d", descriptor = "Ljava/lang/String;")
    public static String field4559;

    @OriginalMember(owner = "client!lp", name = "g", descriptor = "Ljava/lang/String;")
    public static String field4562;

    @OriginalMember(owner = "client!lp", name = "i", descriptor = "Ljava/lang/String;")
    public static String field4564;

    @OriginalMember(owner = "client!lp", name = "k", descriptor = "Ljava/lang/String;")
    public static String field4566;

    @OriginalMember(owner = "client!lp", name = "q", descriptor = "Ljava/lang/String;")
    public static String field4572;

    @OriginalMember(owner = "client!lp", name = "v", descriptor = "Ljava/lang/String;")
    public static String field4577;

    @OriginalMember(owner = "client!lp", name = "x", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field4579;

    @OriginalMember(owner = "client!lp", name = "y", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field4580;

    @OriginalMember(owner = "client!lp", name = "n", descriptor = "[Lhd;")
    public class633[] field4569;

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)V", line = 7)
    public final void method1999(int arg0) {
        synchronized (this) {
            this.field4561 = true;
            this.notifyAll();
        }
        try {
            this.field4573.join();
            if (arg0 >= -64) {
                this.method2001((byte) -65, null);
            }
        } catch (InterruptedException var8) {
        }
        if (this.field4574 != null) {
            try {
                this.field4574.method3685(-5948);
            } catch (IOException var7) {
            }
        }
        if (this.field4565 != null) {
            try {
                this.field4565.method3685(-5948);
            } catch (IOException var6) {
            }
        }
        if (this.field4569 != null) {
            for (int var3 = 0; var3 < this.field4569.length; var3++) {
                if (this.field4569[var3] != null) {
                    try {
                        this.field4569[var3].method3685(-5948);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field4567 != null) {
            try {
                this.field4567.method3685(-5948);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIIILjava/lang/Object;)Lqo;", line = 63)
    private final class21 method2000(int arg0, int arg1, int arg2, int arg3, Object arg4) {
        class21 var6 = new class21();
        synchronized (var6) {
            var6.field204 = arg1;
            var6.field205 = arg0;
            if (arg3 != 170) {
                this.method2010(-125, null);
            }
            var6.field203 = arg4;
            synchronized (this) {
                if (this.field4570 == null) {
                    this.field4570 = this.field4571 = var6;
                } else {
                    this.field4570.field206 = var6;
                    this.field4570 = var6;
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

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(BLjava/net/URL;)Lqo;", line = 100)
    public final class21 method2001(byte arg0, URL arg1) {
        if (arg0 < 107) {
            this.method2002(-66);
        }
        return this.method2020(0, (byte) -30, arg1, 4, 0);
    }

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "(I)Lqo;", line = 110)
    public final class21 method2002(int arg0) {
        int var2 = 89 / ((arg0 + 79) / 42);
        return this.method2020(0, (byte) -30, null, 5, 0);
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(BLjava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)Lqo;", line = 120)
    public final class21 method2003(byte arg0, String arg1, Class[] arg2, Class arg3) {
        int var5 = -57 % ((arg0 + 71) / 46);
        return this.method2020(0, (byte) -30, new Object[] { arg3, arg1, arg2 }, 8, 0);
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IILjava/lang/Runnable;)Lqo;", line = 130)
    public final class21 method2004(int arg0, int arg1, Runnable arg2) {
        if (arg0 != 1406) {
            this.method2012(null, 45);
        }
        return this.method2020(arg1, (byte) -30, arg2, 2, 0);
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(B)Z", line = 141)
    public final boolean method2005(byte arg0) {
        return arg0 == -100 ? false : false;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IILjava/awt/Component;I)Lqo;", line = 157)
    public final class21 method2006(int arg0, int arg1, Component arg2, int arg3) {
        if (arg1 != 10) {
            this.field4561 = true;
        }
        Point var5 = arg2.getLocationOnScreen();
        return this.method2020(var5.x + arg3, (byte) -30, null, 14, var5.y + arg0);
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IZLjava/awt/Component;)Lqo;", line = 169)
    public final class21 method2007(int arg0, boolean arg1, Component arg2) {
        return arg0 <= 83 ? null : this.method2020(arg1 ? 1 : 0, (byte) -30, arg2, 15, 0);
    }

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "(B)Lhba;", line = 179)
    public final class10 method2008(byte arg0) {
        int var2 = -20 % ((arg0 + 55) / 58);
        return this.field4557;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;", line = 197)
    public final File method2009(String arg0, int arg1) {
        if (arg1 != 0) {
            this.field4575 = -84;
        }
        return method2011(this.field4556, true, arg0, this.field4575);
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(ILjava/awt/Frame;)Lqo;", line = 207)
    public final class21 method2010(int arg0, Frame arg1) {
        return arg0 == 0 ? this.method2020(0, (byte) -30, arg1, 7, 0) : null;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;I)Ljava/io/File;", line = 219)
    public static final File method2011(String arg0, boolean arg1, String arg2, int arg3) {
        if (!arg1) {
            method2011(null, true, null, 93);
        }
        File var4 = (File) field4563.get(arg2);
        if (var4 != null) {
            return var4;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field4558, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg3, ".file_store_" + arg3 };
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < var6.length; var8++) {
                for (int var9 = 0; var9 < var5.length; var9++) {
                    String var10 = var5[var9] + var6[var8] + "/" + (arg0 == null ? "" : arg0 + "/") + arg2;
                    RandomAccessFile var11 = null;
                    try {
                        File var12 = new File(var10);
                        if (var7 != 0 || var12.exists()) {
                            String var13 = var5[var9];
                            if (var7 != 1 || var13.length() <= 0 || (new File(var13)).exists()) {
                                (new File(var5[var9] + var6[var8])).mkdir();
                                if (arg0 != null) {
                                    (new File(var5[var9] + var6[var8] + "/" + arg0)).mkdir();
                                }
                                var11 = new RandomAccessFile(var12, "rw");
                                int var14 = var11.read();
                                var11.seek(0L);
                                var11.write(var14);
                                var11.seek(0L);
                                var11.close();
                                field4563.put(arg2, var12);
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

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "(Ljava/lang/String;I)[B", line = 308)
    public final byte[] method2012(String arg0, int arg1) {
        if (arg1 >= -46) {
            return null;
        } else {
            class21 var3 = this.method2000(0, 21, 0, 170, arg0);
            return (byte[]) var3.field201;
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(Ljava/awt/Component;Ljava/awt/Point;I[III)Lqo;", line = 324)
    public final class21 method2013(Component arg0, Point arg1, int arg2, int[] arg3, int arg4, int arg5) {
        if (arg2 >= -75) {
            field4576 = 106;
        }
        return this.method2020(arg4, (byte) -30, new Object[] { arg0, arg3, arg1 }, 17, arg5);
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Class;)Lqo;", line = 334)
    public final class21 method2014(String arg0, int arg1, Class arg2) {
        if (arg1 != 0) {
            field4562 = null;
        }
        return this.method2020(0, (byte) -30, new Object[] { arg2, arg0 }, 9, 0);
    }

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "(I)Lqo;", line = 344)
    public final class21 method2015(int arg0) {
        if (arg0 != 1) {
            this.method2017(-18, -51, 24, -125, -54);
        }
        return this.method2020(0, (byte) -30, null, 18, 0);
    }

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "(Ljava/lang/String;I)Lqo;", line = 354)
    public final class21 method2016(String arg0, int arg1) {
        if (arg1 < 52) {
            this.method2003((byte) 122, null, null, null);
        }
        return this.method2020(0, (byte) -30, arg0, 16, 0);
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIIII)Lqo;", line = 366)
    public final class21 method2017(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 <= 29) {
            this.field4560 = null;
        }
        return this.method2020((arg0 << 16) + arg2, (byte) -30, null, 6, (arg3 << 16) + arg4);
    }

    @OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V", line = 651)
    public class331(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field4572 = "Unknown";
        this.field4575 = arg1;
        this.field4568 = arg0;
        this.field4556 = arg2;
        field4562 = "1.1";
        try {
            field4572 = System.getProperty("java.vendor");
            field4562 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field4559 = System.getProperty("os.name");
        } catch (Exception var11) {
            field4559 = "Unknown";
        }
        field4577 = field4559.toLowerCase();
        try {
            field4566 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field4566 = "";
        }
        try {
            field4564 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field4564 = "";
        }
        try {
            field4558 = System.getProperty("user.home");
            if (field4558 != null) {
                field4558 = field4558 + "/";
            }
        } catch (Exception var8) {
        }
        if (field4558 == null) {
            field4558 = "~/";
        }
        try {
            this.field4560 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field4580 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field4580 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field4579 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field4579 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field4561 = false;
        this.field4573 = new Thread(this);
        this.field4573.setPriority(10);
        this.field4573.setDaemon(true);
        this.field4573.start();
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(ILjava/awt/datatransfer/Transferable;)Lqo;", line = 380)
    public final class21 method2018(int arg0, Transferable arg1) {
        return arg0 == 0 ? this.method2020(0, (byte) -30, arg1, 19, 0) : null;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(Ljava/lang/String;ZZ)Lqo;", line = 391)
    public final class21 method2019(String arg0, boolean arg1, boolean arg2) {
        if (!arg1) {
            field4576 = 67;
        }
        return arg2 ? this.method2020(0, (byte) -30, arg0, 12, 0) : this.method2020(0, (byte) -30, arg0, 13, 0);
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IBLjava/lang/Object;II)Lqo;", line = 406)
    private final class21 method2020(int arg0, byte arg1, Object arg2, int arg3, int arg4) {
        if (arg1 != -30) {
            this.method2022(-117);
        }
        class21 var6 = new class21();
        var6.field205 = arg0;
        var6.field204 = arg3;
        var6.field203 = arg2;
        synchronized (this) {
            if (this.field4570 == null) {
                this.field4570 = this.field4571 = var6;
            } else {
                this.field4570.field206 = var6;
                this.field4570 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(BLjava/lang/String;)Lqo;", line = 437)
    public final class21 method2021(byte arg0, String arg1) {
        int var3 = 102 / ((9 - arg0) / 56);
        return this.method2020(0, (byte) -30, arg1, 21, 0);
    }

    @OriginalMember(owner = "client!lp", name = "d", descriptor = "(I)V", line = 458)
    public final void method2022(int arg0) {
        field4578 = (long) arg0 + class598.method3538(true);
    }

    @OriginalMember(owner = "client!lp", name = "run", descriptor = "()V", line = 470)
    public final void run() {
        while (true) {
            class21 var2;
            synchronized (this) {
                while (true) {
                    if (this.field4561) {
                        return;
                    }
                    if (this.field4571 != null) {
                        var2 = this.field4571;
                        this.field4571 = this.field4571.field206;
                        if (this.field4571 == null) {
                            this.field4570 = null;
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
                int var3 = var2.field204;
                if (var3 == 1) {
                    if (field4578 > class598.method3538(true)) {
                        throw new IOException();
                    }
                    var2.field201 = new Socket(InetAddress.getByName((String) var2.field203), var2.field205);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field203);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field205);
                    var2.field201 = var4;
                } else if (var3 == 4) {
                    if (class598.method3538(true) < field4578) {
                        throw new IOException();
                    }
                    var2.field201 = new DataInputStream(((URL) var2.field203).openStream());
                } else if (var3 == 8) {
                    Object[] var9 = (Object[]) var2.field203;
                    var2.field201 = ((Class) var9[0]).getDeclaredMethod((String) var9[1], (Class[]) var9[2]);
                } else if (var3 == 9) {
                    Object[] var8 = (Object[]) var2.field203;
                    var2.field201 = ((Class) var8[0]).getDeclaredField((String) var8[1]);
                } else if (var3 == 18) {
                    Clipboard var5 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field201 = var5.getContents(null);
                } else if (var3 == 19) {
                    Transferable var6 = (Transferable) var2.field203;
                    Clipboard var7 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var7.setContents(var6, null);
                } else {
                    throw new Exception("");
                }
                var2.field202 = 1;
            } catch (ThreadDeath var15) {
                throw var15;
            } catch (Throwable var16) {
                var2.field202 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(Ljava/lang/String;II)Lqo;", line = 591)
    public final class21 method2023(String arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            this.field4565 = null;
        }
        return this.method2020(arg1, (byte) -30, arg0, 1, 0);
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(II)Lqo;", line = 610)
    public final class21 method2024(int arg0, int arg1) {
        int var3 = 71 % ((arg0 + 48) / 53);
        return this.method2020(arg1, (byte) -30, null, 3, 0);
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(Ljava/io/File;I[B)Z", line = 631)
    public final boolean method2025(File arg0, int arg1, byte[] arg2) {
        try {
            FileOutputStream var4 = new FileOutputStream(arg0);
            var4.write(arg2, arg1, arg2.length);
            var4.close();
            return true;
        } catch (IOException var5) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(ILjava/lang/Class;)V", line = 733)
    public final void method2026(int arg0, Class arg1) throws Exception {
        Class[] var3 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
        if (arg0 != 13558) {
            return;
        }
        Runtime var4 = Runtime.getRuntime();
        Method var5 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
        if (!field4577.startsWith("mac")) {
            Method var6 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", var3);
            var5.invoke(var6, Boolean.TRUE);
            var6.invoke(var4, arg1, "jawt");
            var5.invoke(var6, Boolean.FALSE);
        }
        Method var7 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", var3);
        var5.invoke(var7, Boolean.TRUE);
        if (!field4577.startsWith("win")) {
            throw new Exception();
        }
        var7.invoke(var4, arg1, this.method2009("sw3d.dll", 0).toString());
        var5.invoke(var7, Boolean.FALSE);
    }
}
