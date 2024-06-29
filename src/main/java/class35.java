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

@OriginalClass("client!da")
public class class35 implements Runnable {

    @OriginalMember(owner = "client!da", name = "b", descriptor = "Lt;")
    public class198 field709 = null;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "Ljava/io/File;")
    private File field717 = null;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "Lha;")
    private class77 field716 = null;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "Lha;")
    private class77 field713 = null;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "Ljava/io/File;")
    public File field722 = null;

    @OriginalMember(owner = "client!da", name = "p", descriptor = "Z")
    private boolean field723 = false;

    @OriginalMember(owner = "client!da", name = "q", descriptor = "Ljava/applet/Applet;")
    public Applet field724 = null;

    @OriginalMember(owner = "client!da", name = "r", descriptor = "Lt;")
    public class198 field725 = null;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "Lt;")
    public class198 field714 = null;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field711;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "Ljava/lang/Thread;")
    private Thread field708;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "I")
    public static int field721 = 3;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "Lrh;")
    private class186 field718;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "Ljava/lang/String;")
    public static String field715;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "Ljava/lang/String;")
    private static String field719;

    @OriginalMember(owner = "client!da", name = "s", descriptor = "Ljava/lang/String;")
    public static String field726;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field710;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field720;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "[Lt;")
    public class198[] field712;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
    public final void method257(int arg0) {
        synchronized (this) {
            this.field723 = true;
            this.notifyAll();
        }
        try {
            this.field708.join();
        } catch (InterruptedException var8) {
        }
        if (arg0 != 0) {
            return;
        }
        if (this.field714 != null) {
            try {
                this.field714.method1243((byte) 127);
            } catch (IOException var7) {
            }
        }
        if (this.field709 != null) {
            try {
                this.field709.method1243((byte) 75);
            } catch (IOException var6) {
            }
        }
        if (this.field712 != null) {
            for (int var3 = 0; var3 < this.field712.length; var3++) {
                if (this.field712[var3] != null) {
                    try {
                        this.field712[var3].method1243((byte) 112);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field725 != null) {
            try {
                this.field725.method1243((byte) 98);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;B)Lha;")
    public final class77 method258(int arg0, String arg1, byte arg2) {
        if (arg2 >= -37) {
            this.method266((byte) -17, -110);
        }
        return this.method259(arg1, (byte) 114, arg0, 0, 1);
    }

    @OriginalMember(owner = "client!da", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class77 var2;
            synchronized (this) {
                while (true) {
                    if (this.field723) {
                        return;
                    }
                    if (this.field716 != null) {
                        var2 = this.field716;
                        this.field716 = this.field716.field1502;
                        if (this.field716 == null) {
                            this.field713 = null;
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
                int var3 = var2.field1505;
                if (var3 == 1) {
                    var2.field1503 = new Socket(InetAddress.getByName((String) var2.field1504), var2.field1506);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field1504);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field1506);
                    var2.field1503 = var4;
                } else if (var3 == 4) {
                    var2.field1503 = new DataInputStream(((URL) var2.field1504).openStream());
                } else if (var3 == 8) {
                    Object[] var6 = (Object[]) var2.field1504;
                    var2.field1503 = ((Class) var6[0]).getDeclaredMethod((String) var6[1], (Class[]) var6[2]);
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field1504;
                    var2.field1503 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else {
                    throw new Exception();
                }
                var2.field1501 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field1501 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/Object;BIII)Lha;")
    private final class77 method259(Object arg0, byte arg1, int arg2, int arg3, int arg4) {
        class77 var6 = new class77();
        var6.field1506 = arg2;
        var6.field1504 = arg0;
        var6.field1505 = arg4;
        synchronized (this) {
            if (this.field713 == null) {
                this.field713 = this.field716 = var6;
            } else {
                this.field713.field1502 = var6;
                this.field713 = var6;
            }
            this.notify();
            int var8 = -127 / ((-arg1 - 23) / 63);
            return var6;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;III)V")
    private final void method260(String arg0, int arg1, int arg2, int arg3) {
        if (arg3 < 32 || arg3 > 34) {
            arg3 = 32;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field719, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg3, ".file_store_" + arg3 };
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
                        if (this.field725 == null) {
                            try {
                                File var13 = new File(var11, "random.dat");
                                if (var7 == 1 || var13.exists()) {
                                    this.field725 = new class198(var13, "rw", 25L);
                                }
                            } catch (Exception var21) {
                                this.field725 = null;
                            }
                        }
                        if (this.field717 == null) {
                            try {
                                File var14 = new File(var11, arg0);
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
                                this.field714 = new class198(var16, "rw", 104857600L);
                                this.field712 = new class198[arg1];
                                for (int var17 = 0; var17 < arg1; var17++) {
                                    this.field712[var17] = new class198(new File(var14, "main_file_cache.idx" + var17), "rw", 1048576L);
                                }
                                this.field709 = new class198(new File(var14, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field722 = this.field717 = var14;
                            } catch (Exception var20) {
                                try {
                                    this.field714.method1243((byte) -104);
                                    for (int var18 = 0; var18 < arg1; var18++) {
                                        this.field712[var18].method1243((byte) -106);
                                    }
                                    this.field709.method1243((byte) -78);
                                } catch (Exception var19) {
                                }
                                this.field722 = this.field717 = null;
                                this.field712 = null;
                                this.field714 = this.field709 = null;
                            }
                        }
                    } catch (Exception var22) {
                    }
                    if (this.field725 != null && this.field717 != null) {
                        return;
                    }
                }
            }
        }
        if (arg2 != -25320) {
            this.run();
        }
        if (this.field717 == null) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Lha;")
    public final class77 method261(int arg0, String arg1, Class arg2) {
        return arg0 > -105 ? null : this.method259(new Object[] { arg2, arg1 }, (byte) 64, 0, 0, 9);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/net/URL;I)Lha;")
    public final class77 method262(URL arg0, int arg1) {
        int var3 = 77 / ((-arg1 - 59) / 55);
        return this.method259(arg0, (byte) -96, 0, 0, 4);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/Runnable;IZ)Lha;")
    public final class77 method263(Runnable arg0, int arg1, boolean arg2) {
        if (arg2) {
            this.method262(null, -23);
        }
        return this.method259(arg0, (byte) 50, arg1, 0, 2);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([Ljava/lang/Class;ILjava/lang/Class;Ljava/lang/String;)Lha;")
    public final class77 method264(Class[] arg0, int arg1, Class arg2, String arg3) {
        int var5 = -46 % ((59 - arg1) / 47);
        return this.method259(new Object[] { arg2, arg3, arg0 }, (byte) -111, 0, 0, 8);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(B)Lrh;")
    public final class186 method265(byte arg0) {
        int var2 = 62 % ((24 - arg0) / 48);
        return this.field718;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BI)Lha;")
    public final class77 method266(byte arg0, int arg1) {
        if (arg0 < 86) {
            this.method260(null, -90, 53, -112);
        }
        return this.method259(null, (byte) -109, arg1, 0, 3);
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
    public class35(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
        field726 = "1.1";
        this.field724 = arg1;
        field715 = "Unknown";
        try {
            field715 = System.getProperty("java.vendor");
            field726 = System.getProperty("java.version");
        } catch (Exception var10) {
        }
        try {
            field719 = System.getProperty("user.home");
            if (field719 != null) {
                field719 = field719 + "/";
            }
        } catch (Exception var9) {
        }
        if (field719 == null) {
            field719 = "~/";
        }
        try {
            this.field711 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var8) {
        }
        try {
            if (arg1 == null) {
                field710 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field710 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var7) {
        }
        try {
            if (arg1 == null) {
                field720 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field720 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        if (arg0) {
            this.method260(arg3, arg4, -25320, arg2);
        }
        this.field723 = false;
        this.field708 = new Thread(this);
        this.field708.setPriority(10);
        this.field708.setDaemon(true);
        this.field708.start();
    }
}
