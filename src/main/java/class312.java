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

@OriginalClass("client!ci")
public class class312 implements Runnable {

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "Ljava/applet/Applet;")
    public Applet field4458 = null;

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "Lmg;")
    private class100 field4464 = null;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "Lhi;")
    public class137 field4462 = null;

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "Z")
    private boolean field4460 = false;

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "Lmg;")
    private class100 field4466 = null;

    @OriginalMember(owner = "client!ci", name = "j", descriptor = "Lhi;")
    public class137 field4467 = null;

    @OriginalMember(owner = "client!ci", name = "q", descriptor = "Lhi;")
    public class137 field4474 = null;

    @OriginalMember(owner = "client!ci", name = "u", descriptor = "I")
    private int field4478;

    @OriginalMember(owner = "client!ci", name = "n", descriptor = "Ljava/lang/String;")
    private String field4471;

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field4465;

    @OriginalMember(owner = "client!ci", name = "p", descriptor = "Ljava/lang/Thread;")
    private Thread field4473;

    @OriginalMember(owner = "client!ci", name = "v", descriptor = "I")
    public static int field4479 = 3;

    @OriginalMember(owner = "client!ci", name = "k", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field4468 = new Hashtable(16);

    @OriginalMember(owner = "client!ci", name = "x", descriptor = "J")
    public static volatile long field4481 = 0L;

    @OriginalMember(owner = "client!ci", name = "l", descriptor = "Lql;")
    private class514 field4469;

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "Ljava/lang/String;")
    public static String field4459;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "Ljava/lang/String;")
    private static String field4461;

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "Ljava/lang/String;")
    public static String field4463;

    @OriginalMember(owner = "client!ci", name = "m", descriptor = "Ljava/lang/String;")
    public static String field4470;

    @OriginalMember(owner = "client!ci", name = "o", descriptor = "Ljava/lang/String;")
    public static String field4472;

    @OriginalMember(owner = "client!ci", name = "r", descriptor = "Ljava/lang/String;")
    public static String field4475;

    @OriginalMember(owner = "client!ci", name = "s", descriptor = "Ljava/lang/String;")
    public static String field4476;

    @OriginalMember(owner = "client!ci", name = "w", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field4480;

    @OriginalMember(owner = "client!ci", name = "y", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field4482;

    @OriginalMember(owner = "client!ci", name = "t", descriptor = "[Lhi;")
    public class137[] field4477;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Ljava/awt/Frame;Z)Lmg;")
    public final class100 method1948(Frame arg0, boolean arg1) {
        if (arg1) {
            method1970(33, (byte) 40, null, null);
        }
        return this.method1950(0, 33, 0, arg0, 7);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)V")
    public final void method1949(byte arg0) {
        field4481 = class464.method2773((byte) 103) + 5000L;
        if (arg0 >= -28) {
            this.method1972(null, -67);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIILjava/lang/Object;I)Lmg;")
    private final class100 method1950(int arg0, int arg1, int arg2, Object arg3, int arg4) {
        class100 var6 = new class100();
        var6.field1605 = arg0;
        var6.field1609 = arg4;
        var6.field1607 = arg3;
        synchronized (this) {
            if (this.field4464 == null) {
                this.field4464 = this.field4466 = var6;
            } else {
                this.field4464.field1606 = var6;
                this.field4464 = var6;
            }
            this.notify();
        }
        return arg1 == 33 ? var6 : null;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "([Ljava/lang/Class;ILjava/lang/Class;Ljava/lang/String;)Lmg;")
    public final class100 method1951(Class[] arg0, int arg1, Class arg2, String arg3) {
        if (arg1 >= -70) {
            this.method1963(-36, 26, 75, null);
        }
        return this.method1950(0, 33, 0, new Object[] { arg2, arg3, arg0 }, 8);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILjava/lang/Class;)Lmg;")
    public final class100 method1952(int arg0, Class arg1) {
        int var3 = 99 / ((-arg0 - 55) / 47);
        return this.method1950(0, 33, 0, arg1, 20);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)Lmg;")
    public final class100 method1953(int arg0) {
        return arg0 == 6343 ? this.method1950(0, 33, 0, null, 18) : null;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Ljava/net/URL;I)Lmg;")
    public final class100 method1954(URL arg0, int arg1) {
        if (arg1 < 95) {
            field4463 = null;
        }
        return this.method1950(0, 33, 0, arg0, 4);
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(I)Lmg;")
    public final class100 method1955(int arg0) {
        if (arg0 != -16017) {
            field4481 = 3L;
        }
        return this.method1950(0, 33, 0, null, 5);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)Lmg;")
    public final class100 method1956(int arg0, int arg1) {
        return arg1 == 3 ? this.method1950(arg0, 33, 0, null, 3) : null;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ZLjava/awt/Component;I)Lmg;")
    public final class100 method1957(boolean arg0, Component arg1, int arg2) {
        return arg2 == 0 ? this.method1950(arg0 ? 1 : 0, 33, 0, arg1, 15) : null;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIII)Lmg;")
    public final class100 method1958(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != 29586) {
            field4470 = null;
        }
        return this.method1950((arg3 << 16) + arg2, arg1 + -29553, (arg0 << 16) + arg4, null, 6);
    }

    @OriginalMember(owner = "client!ci", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class100 var2;
            synchronized (this) {
                while (true) {
                    if (this.field4460) {
                        return;
                    }
                    if (this.field4466 != null) {
                        var2 = this.field4466;
                        this.field4466 = this.field4466.field1606;
                        if (this.field4466 == null) {
                            this.field4464 = null;
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
                int var3 = var2.field1609;
                if (var3 == 1) {
                    if (class464.method2773((byte) 103) < field4481) {
                        throw new IOException();
                    }
                    var2.field1608 = new Socket(InetAddress.getByName((String) var2.field1607), var2.field1605);
                } else if (var3 == 2) {
                    Thread var9 = new Thread((Runnable) var2.field1607);
                    var9.setDaemon(true);
                    var9.start();
                    var9.setPriority(var2.field1605);
                    var2.field1608 = var9;
                } else if (var3 == 4) {
                    if (field4481 > class464.method2773((byte) 103)) {
                        throw new IOException();
                    }
                    var2.field1608 = new DataInputStream(((URL) var2.field1607).openStream());
                } else if (var3 == 8) {
                    Object[] var4 = (Object[]) var2.field1607;
                    var2.field1608 = ((Class) var4[0]).getDeclaredMethod((String) var4[1], (Class[]) var4[2]);
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field1607;
                    var2.field1608 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else if (var3 == 18) {
                    Clipboard var6 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field1608 = var6.getContents(null);
                } else if (var3 == 19) {
                    Transferable var7 = (Transferable) var2.field1607;
                    Clipboard var8 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var8.setContents(var7, null);
                } else {
                    throw new Exception("");
                }
                var2.field1604 = 1;
            } catch (ThreadDeath var15) {
                throw var15;
            } catch (Throwable var16) {
                var2.field1604 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IILjava/lang/Runnable;)Lmg;")
    public final class100 method1959(int arg0, int arg1, Runnable arg2) {
        return arg0 > -7 ? null : this.method1950(arg1, 33, 0, arg2, 2);
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(B)Lql;")
    public final class514 method1960(byte arg0) {
        if (arg0 != 43) {
            this.method1950(-79, -16, -67, null, 17);
        }
        return this.field4469;
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(ILjava/lang/Class;)Lmg;")
    public final class100 method1961(int arg0, Class arg1) {
        int var3 = 70 / ((arg0 - 6) / 54);
        return this.method1950(0, 33, 0, arg1, 11);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILjava/lang/String;I)Lmg;")
    public final class100 method1962(int arg0, String arg1, int arg2) {
        if (arg0 != 1) {
            field4461 = null;
        }
        return this.method1950(arg2, 33, 0, arg1, 1);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIILjava/awt/Component;)Lmg;")
    public final class100 method1963(int arg0, int arg1, int arg2, Component arg3) {
        if (arg1 != -22623) {
            this.field4462 = null;
        }
        Point var5 = arg3.getLocationOnScreen();
        return this.method1950(arg0 + var5.x, 33, arg2 + var5.y, null, 14);
    }

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "(I)Z")
    public final boolean method1964(int arg0) {
        if (arg0 > -93) {
            field4480 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "(I)V")
    public final void method1965(int arg0) {
        synchronized (this) {
            this.field4460 = true;
            this.notifyAll();
        }
        if (arg0 >= -30) {
            this.method1957(true, null, -27);
        }
        try {
            this.field4473.join();
        } catch (InterruptedException var8) {
        }
        if (this.field4467 != null) {
            try {
                this.field4467.method1011(7734);
            } catch (IOException var7) {
            }
        }
        if (this.field4462 != null) {
            try {
                this.field4462.method1011(7734);
            } catch (IOException var6) {
            }
        }
        if (this.field4477 != null) {
            for (int var3 = 0; var3 < this.field4477.length; var3++) {
                if (this.field4477[var3] != null) {
                    try {
                        this.field4477[var3].method1011(7734);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field4474 != null) {
            try {
                this.field4474.method1011(7734);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILjava/lang/String;)Lmg;")
    public final class100 method1966(int arg0, String arg1) {
        return arg0 == 33 ? this.method1950(0, 33, 0, arg1, 21) : null;
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(ILjava/lang/String;)Lmg;")
    public final class100 method1967(int arg0, String arg1) {
        return arg0 == 12619 ? this.method1950(0, 33, 0, arg1, 12) : null;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I[IIILjava/awt/Point;Ljava/awt/Component;)Lmg;")
    public final class100 method1968(int arg0, int[] arg1, int arg2, int arg3, Point arg4, Component arg5) {
        return arg2 == -21560 ? this.method1950(arg3, 33, arg0, new Object[] { arg5, arg1, arg4 }, 17) : null;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Ljava/lang/Class;BLjava/lang/String;)Lmg;")
    public final class100 method1969(Class arg0, byte arg1, String arg2) {
        if (arg1 < 50) {
            this.field4477 = null;
        }
        return this.method1950(0, 33, 0, new Object[] { arg0, arg2 }, 9);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IBLjava/lang/String;Ljava/lang/String;)Ljava/io/File;")
    public static final File method1970(int arg0, byte arg1, String arg2, String arg3) {
        if (arg1 != -83) {
            method1970(38, (byte) -2, null, null);
        }
        File var4 = (File) field4468.get(arg3);
        if (var4 != null) {
            return var4;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field4461, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < var6.length; var8++) {
                for (int var9 = 0; var9 < var5.length; var9++) {
                    String var10 = var5[var9] + var6[var8] + "/" + (arg2 == null ? "" : arg2 + "/") + arg3;
                    RandomAccessFile var11 = null;
                    try {
                        File var12 = new File(var10);
                        if (var7 != 0 || var12.exists()) {
                            String var13 = var5[var9];
                            if (var7 != 1 || var13.length() <= 0 || (new File(var13)).exists()) {
                                (new File(var5[var9] + var6[var8])).mkdir();
                                if (arg2 != null) {
                                    (new File(var5[var9] + var6[var8] + "/" + arg2)).mkdir();
                                }
                                var11 = new RandomAccessFile(var12, "rw");
                                int var14 = var11.read();
                                var11.seek(0L);
                                var11.write(var14);
                                var11.seek(0L);
                                var11.close();
                                field4468.put(arg3, var12);
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

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Ljava/lang/String;I)Lmg;")
    public final class100 method1971(String arg0, int arg1) {
        return arg1 >= -32 ? null : this.method1950(0, 33, 0, arg0, 16);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;I)Lmg;")
    public final class100 method1972(Transferable arg0, int arg1) {
        if (arg1 <= 119) {
            this.field4471 = null;
        }
        return this.method1950(0, 33, 0, arg0, 19);
    }

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "(ILjava/lang/String;)Ljava/io/File;")
    public final File method1973(int arg0, String arg1) {
        if (arg0 != 0) {
            field4475 = null;
        }
        return method1970(this.field4478, (byte) -83, this.field4471, arg1);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Ljava/lang/String;B)[B")
    public final byte[] method1974(String arg0, byte arg1) {
        if (arg1 >= -102) {
            field4463 = null;
        }
        class100 var3 = this.method1976(0, 0, 0, 21, arg0);
        return (byte[]) var3.field1608;
    }

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "(ILjava/lang/Class;)V")
    public final void method1975(int arg0, Class arg1) throws Exception {
        Class[] var3 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
        Runtime var4 = Runtime.getRuntime();
        Method var5 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
        if (!field4472.startsWith("mac")) {
            Method var6 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", var3);
            var5.invoke(var6, Boolean.TRUE);
            var6.invoke(var4, arg1, "jawt");
            var5.invoke(var6, Boolean.FALSE);
        }
        Method var7 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", var3);
        if (arg0 != 1) {
            return;
        }
        var5.invoke(var7, Boolean.TRUE);
        if (!field4472.startsWith("win")) {
            throw new Exception();
        }
        var7.invoke(var4, arg1, this.method1973(0, "sw3d.dll").toString());
        var5.invoke(var7, Boolean.FALSE);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIILjava/lang/Object;)Lmg;")
    private final class100 method1976(int arg0, int arg1, int arg2, int arg3, Object arg4) {
        class100 var6 = new class100();
        synchronized (var6) {
            var6.field1605 = arg2;
            var6.field1607 = arg4;
            var6.field1609 = arg3;
            synchronized (this) {
                if (this.field4464 == null) {
                    this.field4464 = this.field4466 = var6;
                } else {
                    this.field4464.field1606 = var6;
                    this.field4464 = var6;
                }
                this.notify();
            }
            try {
                var6.wait();
            } catch (InterruptedException var9) {
            }
            if (arg1 != 0) {
                this.method1961(99, null);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
    public class312(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        this.field4478 = arg1;
        field4470 = "1.1";
        field4475 = "Unknown";
        this.field4458 = arg0;
        this.field4471 = arg2;
        try {
            field4475 = System.getProperty("java.vendor");
            field4470 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field4476 = System.getProperty("os.name");
        } catch (Exception var11) {
            field4476 = "Unknown";
        }
        field4472 = field4476.toLowerCase();
        try {
            field4459 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field4459 = "";
        }
        try {
            field4463 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field4463 = "";
        }
        try {
            field4461 = System.getProperty("user.home");
            if (field4461 != null) {
                field4461 = field4461 + "/";
            }
        } catch (Exception var8) {
        }
        if (field4461 == null) {
            field4461 = "~/";
        }
        try {
            this.field4465 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field4480 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field4480 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field4482 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field4482 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field4460 = false;
        this.field4473 = new Thread(this);
        this.field4473.setPriority(10);
        this.field4473.setDaemon(true);
        this.field4473.start();
    }
}
