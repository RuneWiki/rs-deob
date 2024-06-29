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

@OriginalClass("client!je")
public class class67 implements Runnable {

    @OriginalMember(owner = "client!je", name = "g", descriptor = "Lbe;")
    private class13 field1668 = null;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "Ljava/io/File;")
    private File field1663 = null;

    @OriginalMember(owner = "client!je", name = "m", descriptor = "Lpf;")
    public class110 field1674 = null;

    @OriginalMember(owner = "client!je", name = "p", descriptor = "Lbe;")
    private class13 field1677 = null;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "Lpf;")
    public class110 field1665 = null;

    @OriginalMember(owner = "client!je", name = "q", descriptor = "Ljava/io/File;")
    public File field1678 = null;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "Lpf;")
    public class110 field1670 = null;

    @OriginalMember(owner = "client!je", name = "s", descriptor = "Z")
    private boolean field1680 = false;

    @OriginalMember(owner = "client!je", name = "r", descriptor = "Ljava/applet/Applet;")
    public Applet field1679 = null;

    @OriginalMember(owner = "client!je", name = "n", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field1675;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "Ljava/lang/Thread;")
    private Thread field1672;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "I")
    public static int field1673 = 3;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "Lqf;")
    private class117 field1666;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "Ljava/lang/String;")
    private static String field1662;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "Ljava/lang/String;")
    public static String field1667;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "Ljava/lang/String;")
    public static String field1669;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1664;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1671;

    @OriginalMember(owner = "client!je", name = "o", descriptor = "[Lpf;")
    public class110[] field1676;

    @OriginalMember(owner = "client!je", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class13 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1680) {
                        return;
                    }
                    if (this.field1668 != null) {
                        var2 = this.field1668;
                        this.field1668 = this.field1668.field257;
                        if (this.field1668 == null) {
                            this.field1677 = null;
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
                int var3 = var2.field253;
                if (var3 == 1) {
                    var2.field254 = new Socket(InetAddress.getByName((String) var2.field255), var2.field256);
                } else if (var3 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field255);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field256);
                    var2.field254 = var6;
                } else if (var3 == 4) {
                    var2.field254 = new DataInputStream(((URL) var2.field255).openStream());
                } else if (var3 == 8) {
                    Object[] var5 = (Object[]) var2.field255;
                    var2.field254 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 9) {
                    Object[] var4 = (Object[]) var2.field255;
                    var2.field254 = ((Class) var4[0]).getDeclaredField((String) var4[1]);
                } else {
                    throw new Exception();
                }
                var2.field252 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field252 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V")
    public final void method535(byte arg0) {
        synchronized (this) {
            if (arg0 != 18) {
                this.method543(null, 118, -117);
            }
            this.field1680 = true;
            this.notifyAll();
        }
        try {
            this.field1672.join();
        } catch (InterruptedException var8) {
        }
        if (this.field1665 != null) {
            try {
                this.field1665.method858(arg0 - 66);
            } catch (IOException var7) {
            }
        }
        if (this.field1670 != null) {
            try {
                this.field1670.method858(arg0 ^ 0xFFFFFFDF);
            } catch (IOException var6) {
            }
        }
        if (this.field1676 != null) {
            for (int var3 = 0; var3 < this.field1676.length; var3++) {
                if (this.field1676[var3] != null) {
                    try {
                        this.field1676[var3].method858(-23);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field1674 != null) {
            try {
                this.field1674.method858(-50);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(BI)Lbe;")
    public final class13 method536(byte arg0, int arg1) {
        int var3 = 81 % ((2 - arg0) / 51);
        return this.method544(null, 3, arg1, 0, -67);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ZLjava/lang/Class;Ljava/lang/String;)Lbe;")
    public final class13 method537(boolean arg0, Class arg1, String arg2) {
        if (!arg0) {
            this.method538((byte) 75, -6, -83, null);
        }
        return this.method544(new Object[] { arg1, arg2 }, 9, 0, 0, -80);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(BIILjava/lang/String;)V")
    private final void method538(byte arg0, int arg1, int arg2, String arg3) {
        if (arg1 < 32 || arg1 > 34) {
            arg1 = 32;
        }
        int var5 = 92 % ((arg0 - 15) / 51);
        String[] var6 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
        String[] var7 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field1662, "/tmp/", "" };
        for (int var8 = 0; var8 < 2; var8++) {
            for (int var9 = 0; var9 < var6.length; var9++) {
                for (int var10 = 0; var10 < var7.length; var10++) {
                    try {
                        String var11 = var7[var10];
                        if (var11.length() > 0 && !(new File(var11)).exists()) {
                            continue;
                        }
                        File var12 = new File(var11 + var6[var9]);
                        if (var8 == 1 && !var12.exists()) {
                            boolean var13 = var12.mkdir();
                            if (!var13) {
                                continue;
                            }
                        }
                        if (this.field1674 == null) {
                            try {
                                File var14 = new File(var12, "random.dat");
                                if (var8 == 1 || var14.exists()) {
                                    this.field1674 = new class110(var14, "rw", 25L);
                                }
                            } catch (Exception var22) {
                                this.field1674 = null;
                            }
                        }
                        if (this.field1663 == null) {
                            try {
                                File var15 = new File(var12, arg3);
                                if (var8 == 1 && !var15.exists()) {
                                    boolean var16 = var15.mkdir();
                                    if (!var16) {
                                        continue;
                                    }
                                }
                                File var17 = new File(var15, "main_file_cache.dat2");
                                if (var8 == 0 && !var17.exists()) {
                                    continue;
                                }
                                this.field1665 = new class110(var17, "rw", 52428800L);
                                this.field1676 = new class110[arg2];
                                for (int var18 = 0; var18 < arg2; var18++) {
                                    this.field1676[var18] = new class110(new File(var15, "main_file_cache.idx" + var18), "rw", 1048576L);
                                }
                                this.field1670 = new class110(new File(var15, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field1678 = this.field1663 = var15;
                            } catch (Exception var21) {
                                try {
                                    this.field1665.method858(-124);
                                    for (int var19 = 0; var19 < arg2; var19++) {
                                        this.field1676[var19].method858(-67);
                                    }
                                    this.field1670.method858(-65);
                                } catch (Exception var20) {
                                }
                                this.field1665 = this.field1670 = null;
                                this.field1678 = this.field1663 = null;
                                this.field1676 = null;
                            }
                        }
                    } catch (Exception var23) {
                    }
                    if (this.field1674 != null && this.field1663 != null) {
                        return;
                    }
                }
            }
        }
        if (this.field1663 == null) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/net/URL;B)Lbe;")
    public final class13 method539(URL arg0, byte arg1) {
        if (arg1 <= 126) {
            this.field1663 = null;
        }
        return this.method544(arg0, 4, 0, 0, -73);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/lang/String;BI)Lbe;")
    public final class13 method540(String arg0, byte arg1, int arg2) {
        if (arg1 != -65) {
            this.field1670 = null;
        }
        return this.method544(arg0, 1, arg2, 0, -74);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;I)Lbe;")
    public final class13 method541(Class[] arg0, Class arg1, String arg2, int arg3) {
        if (arg3 != -16856) {
            this.field1675 = null;
        }
        return this.method544(new Object[] { arg1, arg2, arg0 }, 8, 0, 0, -59);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)Lqf;")
    public final class117 method542(int arg0) {
        return arg0 == 9 ? this.field1666 : null;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lbe;")
    public final class13 method543(Runnable arg0, int arg1, int arg2) {
        return arg2 == 0 ? this.method544(arg0, 2, arg1, 0, -59) : null;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/lang/Object;IIII)Lbe;")
    private final class13 method544(Object arg0, int arg1, int arg2, int arg3, int arg4) {
        class13 var6 = new class13();
        var6.field256 = arg2;
        if (arg4 > -56) {
            this.method544(null, -47, -80, -110, -16);
        }
        var6.field253 = arg1;
        var6.field255 = arg0;
        synchronized (this) {
            if (this.field1677 == null) {
                this.field1677 = this.field1668 = var6;
            } else {
                this.field1677.field257 = var6;
                this.field1677 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
    public class67(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
        field1667 = "Unknown";
        this.field1679 = arg1;
        field1669 = "1.1";
        try {
            field1667 = System.getProperty("java.vendor");
            field1669 = System.getProperty("java.version");
        } catch (Exception var10) {
        }
        try {
            field1662 = System.getProperty("user.home");
            if (field1662 != null) {
                field1662 = field1662 + "/";
            }
        } catch (Exception var9) {
        }
        if (field1662 == null) {
            field1662 = "~/";
        }
        try {
            this.field1675 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var8) {
        }
        try {
            if (arg1 == null) {
                field1664 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field1664 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var7) {
        }
        try {
            if (arg1 == null) {
                field1671 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field1671 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        if (arg0) {
            this.method538((byte) 111, arg2, arg4, arg3);
        }
        this.field1680 = false;
        this.field1672 = new Thread(this);
        this.field1672.setPriority(10);
        this.field1672.setDaemon(true);
        this.field1672.start();
    }
}
