import java.applet.Applet;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class80 implements Runnable {

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "Ldg;")
    public class36 field1629 = null;

    @OriginalMember(owner = "client!ih", name = "k", descriptor = "Ldg;")
    public class36 field1636 = null;

    @OriginalMember(owner = "client!ih", name = "n", descriptor = "Lha;")
    private class65 field1639 = null;

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "Lha;")
    private class65 field1633 = null;

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "Ljava/io/File;")
    public File field1635 = null;

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "Ljava/applet/Applet;")
    public Applet field1630 = null;

    @OriginalMember(owner = "client!ih", name = "p", descriptor = "Ljava/io/File;")
    private File field1641 = null;

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "Z")
    private boolean field1632 = false;

    @OriginalMember(owner = "client!ih", name = "r", descriptor = "Ldg;")
    public class36 field1643 = null;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field1627;

    @OriginalMember(owner = "client!ih", name = "o", descriptor = "Ljava/lang/Thread;")
    private Thread field1640;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "I")
    public static int field1626 = 3;

    @OriginalMember(owner = "client!ih", name = "m", descriptor = "Lrb;")
    private class155 field1638;

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "Ljava/lang/String;")
    private static String field1634;

    @OriginalMember(owner = "client!ih", name = "q", descriptor = "Ljava/lang/String;")
    public static String field1642;

    @OriginalMember(owner = "client!ih", name = "s", descriptor = "Ljava/lang/String;")
    public static String field1644;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1628;

    @OriginalMember(owner = "client!ih", name = "l", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1637;

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "[Ldg;")
    public class36[] field1631;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IILjava/lang/String;)Lha;")
    public final class65 method651(int arg0, int arg1, String arg2) {
        if (arg1 != 0) {
            field1637 = null;
        }
        return this.method658(arg2, 1, (byte) 124, 0, arg0);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)V")
    public final void method652(byte arg0) {
        synchronized (this) {
            this.field1632 = true;
            if (arg0 != -50) {
                this.method656(32);
            }
            this.notifyAll();
        }
        try {
            this.field1640.join();
        } catch (InterruptedException var8) {
        }
        if (this.field1629 != null) {
            try {
                this.field1629.method257(-115);
            } catch (IOException var7) {
            }
        }
        if (this.field1636 != null) {
            try {
                this.field1636.method257(-125);
            } catch (IOException var6) {
            }
        }
        if (this.field1631 != null) {
            for (int var3 = 0; var3 < this.field1631.length; var3++) {
                if (this.field1631[var3] != null) {
                    try {
                        this.field1631[var3].method257(-128);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field1643 != null) {
            try {
                this.field1643.method257(arg0 - 70);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IZ)Lha;")
    public final class65 method653(int arg0, boolean arg1) {
        if (!arg1) {
            this.method653(40, true);
        }
        return this.method658(null, 3, (byte) 111, 0, arg0);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Lha;")
    public final class65 method654(Class arg0, String arg1, int arg2) {
        int var4 = -126 % ((arg2 - 6) / 59);
        return this.method658(new Object[] { arg0, arg1 }, 9, (byte) 119, 0, 0);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lha;")
    public final class65 method655(Runnable arg0, int arg1, int arg2) {
        if (arg2 != 1048576) {
            this.field1627 = null;
        }
        return this.method658(arg0, 2, (byte) 124, 0, arg1);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)Lrb;")
    public final class155 method656(int arg0) {
        return arg0 >= -25 ? null : this.field1638;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Ljava/net/URL;B)Lha;")
    public final class65 method657(URL arg0, byte arg1) {
        if (arg1 <= 73) {
            this.method654(null, null, 114);
        }
        return this.method658(arg0, 4, (byte) 118, 0, 0);
    }

    @OriginalMember(owner = "client!ih", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class65 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1632) {
                        return;
                    }
                    if (this.field1639 != null) {
                        var2 = this.field1639;
                        this.field1639 = this.field1639.field1353;
                        if (this.field1639 == null) {
                            this.field1633 = null;
                        }
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var12) {
                    }
                }
            }
            try {
                int var3 = var2.field1350;
                if (var3 == 1) {
                    var2.field1352 = new Socket(InetAddress.getByName((String) var2.field1348), var2.field1349);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field1348);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field1349);
                    var2.field1352 = var4;
                } else if (var3 == 4) {
                    var2.field1352 = new DataInputStream(((URL) var2.field1348).openStream());
                } else if (var3 == 8) {
                    Object[] var5 = (Object[]) var2.field1348;
                    var2.field1352 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 9) {
                    Object[] var6 = (Object[]) var2.field1348;
                    var2.field1352 = ((Class) var6[0]).getDeclaredField((String) var6[1]);
                } else {
                    throw new Exception();
                }
                var2.field1351 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field1351 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Ljava/lang/Object;IBII)Lha;")
    private final class65 method658(Object arg0, int arg1, byte arg2, int arg3, int arg4) {
        class65 var6 = new class65();
        var6.field1350 = arg1;
        var6.field1349 = arg4;
        var6.field1348 = arg0;
        synchronized (this) {
            if (this.field1633 == null) {
                this.field1633 = this.field1639 = var6;
            } else {
                this.field1633.field1353 = var6;
                this.field1633 = var6;
            }
            if (arg2 <= 109) {
                this.method660(80, null, 30, 125);
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;B)Lha;")
    public final class65 method659(String arg0, Class[] arg1, Class arg2, byte arg3) {
        int var5 = 109 / ((-arg3 - 32) / 63);
        return this.method658(new Object[] { arg2, arg0, arg1 }, 8, (byte) 121, 0, 0);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILjava/lang/String;II)V")
    private final void method660(int arg0, String arg1, int arg2, int arg3) {
        if (arg3 < 32 || arg3 > 34) {
            arg3 = 32;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field1634, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg3, ".file_store_" + arg3 };
        if (arg0 != 2994) {
            return;
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < var6.length; var8++) {
                for (int var9 = 0; var9 < var5.length; var9++) {
                    try {
                        String var10 = var5[var9];
                        if (var10.length() > 0 && !(new File(var10)).exists()) {
                            continue;
                        }
                        File var11 = new File(var10 + var6[var8]);
                        if (var7 == 1 && !var11.exists()) {
                            boolean var12 = var11.mkdir();
                            if (!var12) {
                                continue;
                            }
                        }
                        if (this.field1643 == null) {
                            try {
                                File var13 = new File(var11, "random.dat");
                                if (var7 == 1 || var13.exists()) {
                                    this.field1643 = new class36(var13, "rw", 25L);
                                }
                            } catch (Exception var21) {
                                this.field1643 = null;
                            }
                        }
                        if (this.field1641 == null) {
                            try {
                                File var14 = new File(var11, arg1);
                                if (var7 == 1 && !var14.exists()) {
                                    boolean var15 = var14.mkdir();
                                    if (!var15) {
                                        continue;
                                    }
                                }
                                File var16 = new File(var14, "main_file_cache.dat2");
                                if (var7 == 0 && !var16.exists()) {
                                    continue;
                                }
                                this.field1629 = new class36(var16, "rw", 104857600L);
                                this.field1631 = new class36[arg2];
                                for (int var17 = 0; var17 < arg2; var17++) {
                                    this.field1631[var17] = new class36(new File(var14, "main_file_cache.idx" + var17), "rw", 1048576L);
                                }
                                this.field1636 = new class36(new File(var14, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field1635 = this.field1641 = var14;
                            } catch (Exception var20) {
                                try {
                                    this.field1629.method257(arg0 ^ 0xFFFFF43F);
                                    for (int var18 = 0; var18 < arg2; var18++) {
                                        this.field1631[var18].method257(-108);
                                    }
                                    this.field1636.method257(arg0 ^ 0xFFFFF434);
                                } catch (Exception var19) {
                                }
                                this.field1635 = this.field1641 = null;
                                this.field1629 = this.field1636 = null;
                                this.field1631 = null;
                            }
                        }
                    } catch (Exception var22) {
                    }
                    if (this.field1643 != null && this.field1641 != null) {
                        return;
                    }
                }
            }
        }
        if (this.field1641 == null) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
    public class80(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
        field1644 = "1.1";
        this.field1630 = arg1;
        field1642 = "Unknown";
        try {
            field1642 = System.getProperty("java.vendor");
            field1644 = System.getProperty("java.version");
        } catch (Exception var10) {
        }
        try {
            field1634 = System.getProperty("user.home");
            if (field1634 != null) {
                field1634 = field1634 + "/";
            }
        } catch (Exception var9) {
        }
        if (field1634 == null) {
            field1634 = "~/";
        }
        try {
            this.field1627 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var8) {
        }
        try {
            if (arg1 == null) {
                field1628 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field1628 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var7) {
        }
        try {
            if (arg1 == null) {
                field1637 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field1637 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        if (arg0) {
            this.method660(2994, arg3, arg4, arg2);
        }
        this.field1632 = false;
        this.field1640 = new Thread(this);
        this.field1640.setPriority(10);
        this.field1640.setDaemon(true);
        this.field1640.start();
    }
}
