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

@OriginalClass("client!ec")
public class class109 implements Runnable {

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "Lwi;")
    public class415 field1612 = null;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "Ljava/applet/Applet;")
    public Applet field1611 = null;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "Z")
    private boolean field1616 = false;

    @OriginalMember(owner = "client!ec", name = "o", descriptor = "Ltf;")
    private class533 field1622 = null;

    @OriginalMember(owner = "client!ec", name = "q", descriptor = "Lwi;")
    public class415 field1624 = null;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "Lwi;")
    public class415 field1615 = null;

    @OriginalMember(owner = "client!ec", name = "r", descriptor = "Ltf;")
    private class533 field1625 = null;

    @OriginalMember(owner = "client!ec", name = "p", descriptor = "Ljava/lang/String;")
    private String field1623;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
    private int field1608;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field1614;

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "Ljava/lang/Thread;")
    private Thread field1617;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
    public static int field1613 = 3;

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field1618 = new Hashtable(16);

    @OriginalMember(owner = "client!ec", name = "w", descriptor = "J")
    public static volatile long field1630 = 0L;

    @OriginalMember(owner = "client!ec", name = "t", descriptor = "Lin;")
    private class168 field1627;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "Ljava/lang/String;")
    public static String field1609;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1610;

    @OriginalMember(owner = "client!ec", name = "m", descriptor = "Ljava/lang/String;")
    public static String field1620;

    @OriginalMember(owner = "client!ec", name = "n", descriptor = "Ljava/lang/String;")
    public static String field1621;

    @OriginalMember(owner = "client!ec", name = "s", descriptor = "Ljava/lang/String;")
    private static String field1626;

    @OriginalMember(owner = "client!ec", name = "u", descriptor = "Ljava/lang/String;")
    public static String field1628;

    @OriginalMember(owner = "client!ec", name = "v", descriptor = "Ljava/lang/String;")
    public static String field1629;

    @OriginalMember(owner = "client!ec", name = "x", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1631;

    @OriginalMember(owner = "client!ec", name = "y", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1632;

    @OriginalMember(owner = "client!ec", name = "l", descriptor = "[Lwi;")
    public class415[] field1619;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Ltf;", line = 3)
    public final class533 method815(int arg0, String arg1, Class arg2) {
        if (arg0 != -11539) {
            this.method839((byte) -82);
        }
        return this.method821(0, new Object[] { arg2, arg1 }, 0, 9, -3);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)Ltf;", line = 13)
    public final class533 method816(int arg0) {
        if (arg0 < 43) {
            this.method834(119);
        }
        return this.method821(0, null, 0, 18, -3);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I[Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Ltf;", line = 23)
    public final class533 method817(int arg0, Class[] arg1, String arg2, Class arg3) {
        if (arg0 != 0) {
            field1629 = null;
        }
        return this.method821(0, new Object[] { arg3, arg2, arg1 }, 0, 8, -3);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/io/File;", line = 34)
    public final File method818(String arg0, byte arg1) {
        if (arg1 != -127) {
            field1626 = null;
        }
        return method835(arg1 ^ 0xFFFFFF80, arg0, this.field1608, this.field1623);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BIIILjava/lang/Object;)Ltf;", line = 45)
    private final class533 method819(byte arg0, int arg1, int arg2, int arg3, Object arg4) {
        class533 var6 = new class533();
        int var7 = 4 / ((arg0 + 10) / 56);
        synchronized (var6) {
            var6.field7852 = arg2;
            var6.field7850 = arg4;
            var6.field7851 = arg3;
            synchronized (this) {
                if (this.field1625 == null) {
                    this.field1625 = this.field1622 = var6;
                } else {
                    this.field1625.field7847 = var6;
                    this.field1625 = var6;
                }
                this.notify();
            }
            try {
                var6.wait();
            } catch (InterruptedException var10) {
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "([ILjava/awt/Point;ILjava/awt/Component;BI)Ltf;", line = 85)
    public final class533 method820(int[] arg0, Point arg1, int arg2, Component arg3, byte arg4, int arg5) {
        int var7 = 21 / ((-arg4 - 45) / 37);
        return this.method821(arg5, new Object[] { arg3, arg0, arg1 }, arg2, 17, -3);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILjava/lang/Object;III)Ltf;", line = 94)
    private final class533 method821(int arg0, Object arg1, int arg2, int arg3, int arg4) {
        class533 var6 = new class533();
        var6.field7851 = arg3;
        var6.field7852 = arg0;
        var6.field7850 = arg1;
        synchronized (this) {
            if (this.field1625 == null) {
                this.field1625 = this.field1622 = var6;
            } else {
                this.field1625.field7847 = var6;
                this.field1625 = var6;
            }
            this.notify();
            if (arg4 != -3) {
                this.method842((byte) -77, null);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILjava/lang/String;)[B", line = 124)
    public final byte[] method822(int arg0, String arg1) {
        if (arg0 != -3650) {
            this.field1624 = null;
        }
        class533 var3 = this.method819((byte) 94, 0, 0, 21, arg1);
        return (byte[]) var3.field7849;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)Z", line = 137)
    public final boolean method823(boolean arg0) {
        if (!arg0) {
            this.method840(null, (byte) -126);
        }
        return false;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ljava/net/URL;Z)Ltf;", line = 151)
    public final class533 method824(URL arg0, boolean arg1) {
        if (!arg1) {
            this.field1627 = null;
        }
        return this.method821(0, arg0, 0, 4, -3);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILjava/lang/String;Z)Ltf;", line = 161)
    public final class533 method825(int arg0, String arg1, boolean arg2) {
        if (arg0 != 0) {
            this.method840(null, (byte) -76);
        }
        return arg2 ? this.method821(0, arg1, 0, 12, -3) : this.method821(0, arg1, 0, 13, -3);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILjava/lang/Class;)Ltf;", line = 178)
    public final class533 method826(int arg0, Class arg1) {
        if (arg0 != 0) {
            field1630 = 63L;
        }
        return this.method821(0, arg1, 0, 20, -3);
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(ILjava/lang/String;)Ltf;", line = 190)
    public final class533 method827(int arg0, String arg1) {
        if (arg0 < 21) {
            this.method840(null, (byte) 52);
        }
        return this.method821(0, arg1, 0, 21, -3);
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V", line = 693)
    public class109(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        this.field1623 = arg2;
        field1628 = "Unknown";
        this.field1608 = arg1;
        this.field1611 = arg0;
        field1609 = "1.1";
        try {
            field1628 = System.getProperty("java.vendor");
            field1609 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field1629 = System.getProperty("os.name");
        } catch (Exception var11) {
            field1629 = "Unknown";
        }
        field1620 = field1629.toLowerCase();
        try {
            field1610 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field1610 = "";
        }
        try {
            field1621 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field1621 = "";
        }
        try {
            field1626 = System.getProperty("user.home");
            if (field1626 != null) {
                field1626 = field1626 + "/";
            }
        } catch (Exception var8) {
        }
        if (field1626 == null) {
            field1626 = "~/";
        }
        try {
            this.field1614 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field1631 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field1631 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field1632 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field1632 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field1616 = false;
        this.field1617 = new Thread(this);
        this.field1617.setPriority(10);
        this.field1617.setDaemon(true);
        this.field1617.start();
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ljava/lang/Runnable;II)Ltf;", line = 209)
    public final class533 method828(Runnable arg0, int arg1, int arg2) {
        if (arg1 <= 14) {
            this.method843(true);
        }
        return this.method821(arg2, arg0, 0, 2, -3);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIB)Ltf;", line = 220)
    public final class533 method829(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 >= -86) {
            field1632 = null;
        }
        return this.method821((arg2 << 16) + arg1, null, (arg0 << 16) + arg3, 6, -3);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZLjava/awt/Component;II)Ltf;", line = 231)
    public final class533 method830(boolean arg0, Component arg1, int arg2, int arg3) {
        if (arg0) {
            return null;
        } else {
            Point var5 = arg1.getLocationOnScreen();
            return this.method821(var5.x + arg3, null, var5.y + arg2, 14, -3);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILjava/awt/Frame;)Ltf;", line = 244)
    public final class533 method831(int arg0, Frame arg1) {
        if (arg0 != 10000) {
            this.method824(null, false);
        }
        return this.method821(0, arg1, 0, 7, arg0 ^ 0xFFFFD8ED);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ljava/lang/String;II)Ltf;", line = 254)
    public final class533 method832(String arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            this.field1623 = null;
        }
        return this.method821(arg1, arg0, 0, 1, -3);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ljava/lang/String;I)Ltf;", line = 269)
    public final class533 method833(String arg0, int arg1) {
        return arg1 == -15248 ? this.method821(0, arg0, 0, 16, -3) : null;
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)Ltf;", line = 295)
    public final class533 method834(int arg0) {
        if (arg0 != 800271248) {
            this.method819((byte) -38, -43, 100, 61, null);
        }
        return this.method821(0, null, 0, 5, -3);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)Ljava/io/File;", line = 313)
    public static final File method835(int arg0, String arg1, int arg2, String arg3) {
        File var4 = (File) field1618.get(arg1);
        if (var4 != null) {
            return var4;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field1626, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
        int var7 = 0;
        if (arg0 != 1) {
            method835(-53, null, 83, null);
        }
        while (var7 < 2) {
            for (int var8 = 0; var8 < var6.length; var8++) {
                for (int var9 = 0; var9 < var5.length; var9++) {
                    String var10 = var5[var9] + var6[var8] + "/" + (arg3 == null ? "" : arg3 + "/") + arg1;
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
                                field1618.put(arg1, var12);
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
            var7++;
        }
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!ec", name = "run", descriptor = "()V", line = 404)
    public final void run() {
        while (true) {
            class533 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1616) {
                        return;
                    }
                    if (this.field1622 != null) {
                        var2 = this.field1622;
                        this.field1622 = this.field1622.field7847;
                        if (this.field1622 == null) {
                            this.field1625 = null;
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
                int var3 = var2.field7851;
                if (var3 == 1) {
                    if (field1630 > class381.method2281((byte) 35)) {
                        throw new IOException();
                    }
                    var2.field7849 = new Socket(InetAddress.getByName((String) var2.field7850), var2.field7852);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field7850);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field7852);
                    var2.field7849 = var4;
                } else if (var3 == 4) {
                    if (class381.method2281((byte) -117) < field1630) {
                        throw new IOException();
                    }
                    var2.field7849 = new DataInputStream(((URL) var2.field7850).openStream());
                } else if (var3 == 8) {
                    Object[] var9 = (Object[]) var2.field7850;
                    var2.field7849 = ((Class) var9[0]).getDeclaredMethod((String) var9[1], (Class[]) var9[2]);
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field7850;
                    var2.field7849 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else if (var3 == 18) {
                    Clipboard var8 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field7849 = var8.getContents(null);
                } else if (var3 == 19) {
                    Transferable var6 = (Transferable) var2.field7850;
                    Clipboard var7 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var7.setContents(var6, null);
                } else {
                    throw new Exception("");
                }
                var2.field7848 = 1;
            } catch (ThreadDeath var15) {
                throw var15;
            } catch (Throwable var16) {
                var2.field7848 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(I)V", line = 524)
    public final void method836(int arg0) {
        if (arg0 < 89) {
            return;
        }
        synchronized (this) {
            this.field1616 = true;
            this.notifyAll();
        }
        try {
            this.field1617.join();
        } catch (InterruptedException var8) {
        }
        if (this.field1624 != null) {
            try {
                this.field1624.method2485(117);
            } catch (IOException var7) {
            }
        }
        if (this.field1615 != null) {
            try {
                this.field1615.method2485(75);
            } catch (IOException var6) {
            }
        }
        if (this.field1619 != null) {
            for (int var3 = 0; var3 < this.field1619.length; var3++) {
                if (this.field1619[var3] != null) {
                    try {
                        this.field1619[var3].method2485(112);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field1612 != null) {
            try {
                this.field1612.method2485(102);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILjava/awt/Component;Z)Ltf;", line = 579)
    public final class533 method837(int arg0, Component arg1, boolean arg2) {
        int var4 = -5 % ((-arg0 - 31) / 34);
        return this.method821(arg2 ? 1 : 0, arg1, 0, 15, -3);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IZ)Ltf;", line = 588)
    public final class533 method838(int arg0, boolean arg1) {
        if (!arg1) {
            this.method829(-104, -100, -112, 58, (byte) -37);
        }
        return this.method821(arg0, null, 0, 3, -3);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)Lin;", line = 603)
    public final class168 method839(byte arg0) {
        int var2 = 61 % ((arg0 - 40) / 32);
        return this.field1627;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;B)Ltf;", line = 617)
    public final class533 method840(Transferable arg0, byte arg1) {
        return arg1 == 125 ? this.method821(0, arg0, 0, 19, -3) : null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BLjava/lang/Class;)V", line = 627)
    public final void method841(byte arg0, Class arg1) throws Exception {
        Class[] var3 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
        Runtime var4 = Runtime.getRuntime();
        Method var5 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
        if (arg0 <= 13) {
            return;
        }
        if (!field1620.startsWith("mac")) {
            Method var6 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", var3);
            var5.invoke(var6, Boolean.TRUE);
            var6.invoke(var4, arg1, "jawt");
            var5.invoke(var6, Boolean.FALSE);
        }
        Method var7 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", var3);
        var5.invoke(var7, Boolean.TRUE);
        if (!field1620.startsWith("win")) {
            throw new Exception();
        }
        var7.invoke(var4, arg1, this.method818("sw3d.dll", (byte) -127).toString());
        var5.invoke(var7, Boolean.FALSE);
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(BLjava/lang/Class;)Ltf;", line = 669)
    public final class533 method842(byte arg0, Class arg1) {
        if (arg0 >= -104) {
            this.field1615 = null;
        }
        return this.method821(0, arg1, 0, 11, -3);
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(Z)V", line = 679)
    public final void method843(boolean arg0) {
        if (arg0) {
            this.method824(null, true);
        }
        field1630 = class381.method2281((byte) 66) + 5000L;
    }
}
