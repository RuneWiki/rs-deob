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

@OriginalClass("client!cea")
public class class111 implements Runnable {

    @OriginalMember(owner = "client!cea", name = "e", descriptor = "Z")
    public boolean field1588 = false;

    @OriginalMember(owner = "client!cea", name = "b", descriptor = "Z")
    public boolean field1585 = false;

    @OriginalMember(owner = "client!cea", name = "t", descriptor = "Lji;")
    public class694 field1603 = null;

    @OriginalMember(owner = "client!cea", name = "l", descriptor = "Z")
    private boolean field1595 = false;

    @OriginalMember(owner = "client!cea", name = "x", descriptor = "Lot;")
    private class746 field1607 = null;

    @OriginalMember(owner = "client!cea", name = "y", descriptor = "Lji;")
    public class694 field1608 = null;

    @OriginalMember(owner = "client!cea", name = "r", descriptor = "Lot;")
    private class746 field1601 = null;

    @OriginalMember(owner = "client!cea", name = "u", descriptor = "Lji;")
    public class694 field1604 = null;

    @OriginalMember(owner = "client!cea", name = "q", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field1600;

    @OriginalMember(owner = "client!cea", name = "v", descriptor = "[Lji;")
    public class694[] field1605;

    @OriginalMember(owner = "client!cea", name = "c", descriptor = "Ljava/lang/Object;")
    private Object field1586;

    @OriginalMember(owner = "client!cea", name = "B", descriptor = "Ljava/lang/Object;")
    private Object field1611;

    @OriginalMember(owner = "client!cea", name = "d", descriptor = "Loc;")
    private class468 field1587;

    @OriginalMember(owner = "client!cea", name = "o", descriptor = "Ljava/lang/Object;")
    private Object field1598;

    @OriginalMember(owner = "client!cea", name = "g", descriptor = "Lcc;")
    private class189 field1590;

    @OriginalMember(owner = "client!cea", name = "f", descriptor = "Ljava/lang/Thread;")
    private Thread field1589;

    @OriginalMember(owner = "client!cea", name = "k", descriptor = "J")
    private static volatile long field1594 = 0L;

    @OriginalMember(owner = "client!cea", name = "s", descriptor = "I")
    private static int field1602;

    // $FF: synthetic field
    @OriginalMember(owner = "client!cea", name = "C", descriptor = "Ljava/lang/Class;")
    public static Class field1612;

    // $FF: synthetic field
    @OriginalMember(owner = "client!cea", name = "D", descriptor = "Ljava/lang/Class;")
    public static Class field1613;

    // $FF: synthetic field
    @OriginalMember(owner = "client!cea", name = "E", descriptor = "Ljava/lang/Class;")
    public static Class field1614;

    // $FF: synthetic field
    @OriginalMember(owner = "client!cea", name = "F", descriptor = "Ljava/lang/Class;")
    public static Class field1615;

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "Ljava/lang/String;")
    public static String field1584;

    @OriginalMember(owner = "client!cea", name = "h", descriptor = "Ljava/lang/String;")
    public static String field1591;

    @OriginalMember(owner = "client!cea", name = "i", descriptor = "Ljava/lang/String;")
    public static String field1592;

    @OriginalMember(owner = "client!cea", name = "m", descriptor = "Ljava/lang/String;")
    public static String field1596;

    @OriginalMember(owner = "client!cea", name = "n", descriptor = "Ljava/lang/String;")
    public static String field1597;

    @OriginalMember(owner = "client!cea", name = "p", descriptor = "Ljava/lang/String;")
    private static String field1599;

    @OriginalMember(owner = "client!cea", name = "w", descriptor = "Ljava/lang/String;")
    private static String field1606;

    @OriginalMember(owner = "client!cea", name = "z", descriptor = "Ljava/lang/String;")
    private static String field1609;

    @OriginalMember(owner = "client!cea", name = "j", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1593;

    @OriginalMember(owner = "client!cea", name = "A", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1610;

    // $FF: synthetic method
    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method926(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "([IILjava/awt/Component;ILjava/awt/Point;B)Lot;", line = 10)
    public final class746 method906(int[] arg0, int arg1, Component arg2, int arg3, Point arg4, byte arg5) {
        if (arg5 < 104) {
            field1599 = null;
        }
        return this.method924(arg3, arg1, -6, new Object[] { arg2, arg0, arg4 }, 17);
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(Ljava/lang/String;ZI)Lot;", line = 21)
    public final class746 method907(String arg0, boolean arg1, int arg2) {
        if (arg2 != -14087) {
            this.method914(null, null, null, 37);
        }
        return arg1 ? this.method924(0, 0, arg2 + 14081, arg0, 12) : this.method924(0, 0, -6, arg0, 13);
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(Ljava/lang/String;B)Lot;", line = 41)
    public final class746 method908(String arg0, byte arg1) {
        if (arg1 != -51) {
            this.method925(-108);
        }
        return this.method924(0, 0, -6, arg0, 16);
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(I)Lot;", line = 52)
    public final class746 method909(int arg0) {
        if (arg0 != 23132) {
            field1584 = null;
        }
        return this.method924(0, 0, -6, null, 5);
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(ILjava/awt/Frame;)Lot;", line = 76)
    public final class746 method910(int arg0, Frame arg1) {
        if (arg0 != 1) {
            field1596 = null;
        }
        return this.method924(0, 0, arg0 ^ 0xFFFFFFFB, arg1, 7);
    }

    @OriginalMember(owner = "client!cea", name = "b", descriptor = "(I)V", line = 86)
    public final void method911(int arg0) {
        if (arg0 == 5000) {
            field1594 = class337.method2062(false) + 5000L;
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)Lji;", line = 102)
    private static final class694 method912(int arg0, String arg1, String arg2, int arg3) {
        String var4;
        if (~arg3 == arg0) {
            var4 = "jagex_" + arg1 + "_preferences" + arg2 + "_rc.dat";
        } else if (arg3 == 34) {
            var4 = "jagex_" + arg1 + "_preferences" + arg2 + "_wip.dat";
        } else {
            var4 = "jagex_" + arg1 + "_preferences" + arg2 + ".dat";
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", field1606, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
        for (int var6 = 0; var6 < var5.length; var6++) {
            String var7 = var5[var6];
            if (var7.length() <= 0 || (new File(var7)).exists()) {
                try {
                    return new class694(new File(var7, var4), "rw", 10000L);
                } catch (Exception var9) {
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!cea", name = "run", descriptor = "()V", line = 140)
    public final void run() {
        while (true) {
            class746 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1595) {
                        return;
                    }
                    if (this.field1607 != null) {
                        var2 = this.field1607;
                        this.field1607 = this.field1607.field10366;
                        if (this.field1607 == null) {
                            this.field1601 = null;
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
                int var3 = var2.field10367;
                if (var3 == 1) {
                    if (class337.method2062(false) < field1594) {
                        throw new IOException();
                    }
                    var2.field10371 = new Socket(InetAddress.getByName((String) var2.field10370), var2.field10368);
                } else if (var3 == 22) {
                    if (field1594 > class337.method2062(false)) {
                        throw new IOException();
                    }
                    try {
                        var2.field10371 = class503.method2938(var2.field10368, (byte) -93, (String) var2.field10370).method1861(16);
                    } catch (class717 var29) {
                        var2.field10371 = var29.getMessage();
                        throw var29;
                    }
                } else if (var3 == 2) {
                    Thread var5 = new Thread((Runnable) var2.field10370);
                    var5.setDaemon(true);
                    var5.start();
                    var5.setPriority(var2.field10368);
                    var2.field10371 = var5;
                } else if (var3 == 4) {
                    if (class337.method2062(false) < field1594) {
                        throw new IOException();
                    }
                    var2.field10371 = new DataInputStream(((URL) var2.field10370).openStream());
                } else if (var3 == 8) {
                    Object[] var6 = (Object[]) var2.field10370;
                    if (this.field1585 && ((Class) var6[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field10371 = ((Class) var6[0]).getDeclaredMethod((String) var6[1], (Class[]) var6[2]);
                } else if (var3 == 9) {
                    Object[] var7 = (Object[]) var2.field10370;
                    if (this.field1585 && ((Class) var7[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field10371 = ((Class) var7[0]).getDeclaredField((String) var7[1]);
                } else if (var3 == 18) {
                    Clipboard var8 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field10371 = var8.getContents(null);
                } else if (var3 == 19) {
                    Transferable var9 = (Transferable) var2.field10370;
                    Clipboard var10 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var10.setContents(var9, null);
                } else if (!this.field1585) {
                    throw new Exception("");
                } else if (var3 == 3) {
                    if (class337.method2062(false) < field1594) {
                        throw new IOException();
                    }
                    String var23 = (var2.field10368 >> 24 & 0xFF) + "." + (var2.field10368 >> 16 & 0xFF) + "." + ((var2.field10368 & 0xFFC4) >> 8) + "." + (var2.field10368 & 0xFF);
                    var2.field10371 = InetAddress.getByName(var23).getHostName();
                } else if (var3 == 21) {
                    if (field1594 > class337.method2062(false)) {
                        throw new IOException();
                    }
                    var2.field10371 = InetAddress.getByName((String) var2.field10370).getAddress();
                } else if (var3 == 5) {
                    if (this.field1588) {
                        var2.field10371 = this.field1587.method2735((byte) 15);
                    } else {
                        var2.field10371 = Class.forName("me").getMethod("listmodes").invoke(this.field1611);
                    }
                } else if (var3 == 6) {
                    Frame var22 = new Frame("Jagex Full Screen");
                    var2.field10371 = var22;
                    var22.setResizable(false);
                    if (this.field1588) {
                        this.field1587.method2737(-20, var2.field10368 & 0xFFFF, var2.field10368 >>> 16, var2.field10369 & 0xFFFF, var22, var2.field10369 >> 16);
                    } else {
                        Class.forName("me").getMethod("enter", field1615 == null ? (field1615 = method926("java.awt.Frame")) : field1615, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.field1611, var22, Integer.valueOf(var2.field10368 >>> 16), new Integer(var2.field10368 & 0xFFFF), Integer.valueOf(var2.field10369 >> 16), new Integer(var2.field10369 & 0xFFFF));
                    }
                } else if (var3 == 7) {
                    if (this.field1588) {
                        this.field1587.method2736(126, (Frame) var2.field10370);
                    } else {
                        Class.forName("me").getMethod("exit").invoke(this.field1611);
                    }
                } else if (var3 == 12) {
                    class694 var11 = method912(-34, field1609, (String) var2.field10370, field1602);
                    var2.field10371 = var11;
                } else if (var3 == 13) {
                    class694 var21 = method912(-34, "", (String) var2.field10370, field1602);
                    var2.field10371 = var21;
                } else if (this.field1585 && var3 == 14) {
                    int var19 = var2.field10368;
                    int var20 = var2.field10369;
                    if (this.field1588) {
                        this.field1590.method1364(var20, var19, 28841);
                    } else {
                        Class.forName("c").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.field1598, Integer.valueOf(var19), new Integer(var20));
                    }
                } else if (this.field1585 && var3 == 15) {
                    boolean var17 = var2.field10368 != 0;
                    Component var18 = (Component) var2.field10370;
                    if (this.field1588) {
                        this.field1590.method1363(var18, var17, 52);
                    } else {
                        Class.forName("c").getDeclaredMethod("showcursor", field1612 == null ? (field1612 = method926("java.awt.Component")) : field1612, Boolean.TYPE).invoke(this.field1598, var18, Boolean.valueOf(var17));
                    }
                } else if (!this.field1588 && var3 == 17) {
                    Object[] var16 = (Object[]) var2.field10370;
                    Class.forName("c").getDeclaredMethod("setcustomcursor", field1612 == null ? (field1612 = method926("java.awt.Component")) : field1612, field1613 == null ? (field1613 = method926("[I")) : field1613, Integer.TYPE, Integer.TYPE, field1614 == null ? (field1614 = method926("java.awt.Point")) : field1614).invoke(this.field1598, (Component) var16[0], (int[]) var16[1], Integer.valueOf(var2.field10368), new Integer(var2.field10369), (Point) var16[2]);
                } else if (var3 == 16) {
                    try {
                        if (!field1584.startsWith("win")) {
                            throw new Exception();
                        }
                        String var12 = (String) var2.field10370;
                        if (!var12.startsWith("http://") && !var12.startsWith("https://")) {
                            throw new Exception();
                        }
                        String var13 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                        int var14 = 0;
                        while (true) {
                            if (var12.length() <= var14) {
                                Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var12 + "\"");
                                var2.field10371 = null;
                                break;
                            }
                            if (var13.indexOf(var12.charAt(var14)) == -1) {
                                throw new Exception();
                            }
                            var14++;
                        }
                    } catch (Exception var31) {
                        var2.field10371 = var31;
                        throw var31;
                    }
                } else {
                    throw new Exception("");
                }
                var2.field10365 = 1;
            } catch (ThreadDeath var32) {
                throw var32;
            } catch (Throwable var33) {
                var2.field10365 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!cea", name = "c", descriptor = "(I)Ljava/lang/Object;", line = 433)
    public final Object method913(int arg0) {
        return arg0 > -38 ? null : this.field1586;
    }

    @OriginalMember(owner = "client!cea", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V", line = 698)
    public class111(int arg0, String arg1, int arg2, boolean arg3) throws Exception {
        field1609 = arg1;
        field1592 = "1.1";
        field1591 = "Unknown";
        this.field1585 = arg3;
        field1602 = arg0;
        try {
            field1591 = System.getProperty("java.vendor");
            field1592 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        if (field1591.toLowerCase().indexOf("microsoft") != -1) {
            this.field1588 = true;
        }
        try {
            field1599 = System.getProperty("os.name");
        } catch (Exception var19) {
            field1599 = "Unknown";
        }
        field1584 = field1599.toLowerCase();
        try {
            field1596 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field1596 = "";
        }
        try {
            field1597 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
            field1597 = "";
        }
        try {
            field1606 = System.getProperty("user.home");
            if (field1606 != null) {
                field1606 = field1606 + "/";
            }
        } catch (Exception var16) {
        }
        if (field1606 == null) {
            field1606 = "~/";
        }
        try {
            this.field1600 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        if (!this.field1588) {
            try {
                field1610 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } catch (Exception var14) {
            }
            try {
                field1593 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } catch (Exception var13) {
            }
        }
        class32.method266((byte) 72, field1609, field1602);
        if (this.field1585) {
            this.field1608 = new class694(class32.method265(0, null, field1602, "random.dat"), "rw", 25L);
            this.field1603 = new class694(class32.method264(26007, "main_file_cache.dat2"), "rw", 209715200L);
            this.field1604 = new class694(class32.method264(26007, "main_file_cache.idx255"), "rw", 1048576L);
            this.field1605 = new class694[arg2];
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field1605[var5] = new class694(class32.method264(26007, "main_file_cache.idx" + var5), "rw", 1048576L);
            }
            if (this.field1588) {
                try {
                    this.field1586 = Class.forName("pja").getDeclaredConstructor().newInstance();
                } catch (Throwable var12) {
                }
            }
            try {
                if (this.field1588) {
                    this.field1587 = new class468();
                } else {
                    this.field1611 = Class.forName("me").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var11) {
            }
            try {
                if (this.field1588) {
                    this.field1590 = new class189();
                } else {
                    this.field1598 = Class.forName("c").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var10) {
            }
        }
        if (this.field1585 && !this.field1588) {
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
        this.field1595 = false;
        this.field1589 = new Thread(this);
        this.field1589.setPriority(10);
        this.field1589.setDaemon(true);
        this.field1589.start();
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(Ljava/lang/Class;[Ljava/lang/Class;Ljava/lang/String;I)Lot;", line = 447)
    public final class746 method914(Class arg0, Class[] arg1, String arg2, int arg3) {
        return arg3 < 77 ? null : this.method924(0, 0, -6, new Object[] { arg0, arg2, arg1 }, 8);
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(Ljava/lang/Class;BLjava/lang/String;)Lot;", line = 458)
    public final class746 method915(Class arg0, byte arg1, String arg2) {
        return arg1 == -34 ? this.method924(0, 0, -6, new Object[] { arg0, arg2 }, 9) : null;
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(B)Z", line = 468)
    public final boolean method916(byte arg0) {
        if (!this.field1585) {
            return false;
        }
        if (arg0 != 57) {
            this.method918(-60, -95, null);
        }
        if (this.field1588) {
            return this.field1587 != null;
        } else {
            return this.field1611 != null;
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(Ljava/lang/String;BIZ)Lot;", line = 486)
    public final class746 method917(String arg0, byte arg1, int arg2, boolean arg3) {
        if (arg1 > -27) {
            this.field1608 = null;
        }
        return this.method924(0, arg2, -6, arg0, arg3 ? 22 : 1);
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(IILjava/lang/Runnable;)Lot;", line = 505)
    public final class746 method918(int arg0, int arg1, Runnable arg2) {
        if (arg0 != -6) {
            field1606 = null;
        }
        return this.method924(0, arg1, -6, arg2, 2);
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(ILjava/lang/String;)Lji;", line = 515)
    public static final class694 method919(int arg0, String arg1) {
        if (arg0 != 0) {
            method919(17, null);
        }
        return method912(-34, field1609, arg1, field1602);
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(Ljava/io/File;B[B)Z", line = 525)
    public final boolean method920(File arg0, byte arg1, byte[] arg2) {
        try {
            FileOutputStream var4 = new FileOutputStream(arg0);
            var4.write(arg2, 0, arg2.length);
            var4.close();
            if (arg1 > -53) {
                method919(122, null);
            }
            return true;
        } catch (IOException var5) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(BI)Lot;", line = 546)
    public final class746 method921(byte arg0, int arg1) {
        return arg0 <= 33 ? null : this.method924(0, arg1, -6, null, 3);
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(ILjava/net/URL;)Lot;", line = 556)
    public final class746 method922(int arg0, URL arg1) {
        if (arg0 != 0) {
            this.method921((byte) -118, -43);
        }
        return this.method924(0, 0, -6, arg1, 4);
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(IIIII)Lot;", line = 580)
    public final class746 method923(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 <= 46) {
            this.field1605 = null;
        }
        return this.method924((arg3 << 16) + arg1, (arg2 << 16) - -arg0, -6, null, 6);
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(IIILjava/lang/Object;I)Lot;", line = 598)
    private final class746 method924(int arg0, int arg1, int arg2, Object arg3, int arg4) {
        if (arg2 != -6) {
            this.method909(-43);
        }
        class746 var6 = new class746();
        var6.field10369 = arg0;
        var6.field10370 = arg3;
        var6.field10368 = arg1;
        var6.field10367 = arg4;
        synchronized (this) {
            if (this.field1601 == null) {
                this.field1601 = this.field1607 = var6;
            } else {
                this.field1601.field10366 = var6;
                this.field1601 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!cea", name = "d", descriptor = "(I)V", line = 628)
    public final void method925(int arg0) {
        synchronized (this) {
            this.field1595 = true;
            this.notifyAll();
        }
        try {
            this.field1589.join();
        } catch (InterruptedException var8) {
        }
        if (arg0 <= 11) {
            method919(-6, null);
        }
        if (this.field1603 != null) {
            try {
                this.field1603.method3900(117);
            } catch (IOException var7) {
            }
        }
        if (this.field1604 != null) {
            try {
                this.field1604.method3900(127);
            } catch (IOException var6) {
            }
        }
        if (this.field1605 != null) {
            for (int var3 = 0; var3 < this.field1605.length; var3++) {
                if (this.field1605[var3] != null) {
                    try {
                        this.field1605[var3].method3900(127);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field1608 != null) {
            try {
                this.field1608.method3900(106);
            } catch (IOException var4) {
            }
        }
    }
}
