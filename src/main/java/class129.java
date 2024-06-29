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

@OriginalClass("client!od")
public class class129 implements Runnable {

    @OriginalMember(owner = "client!od", name = "c", descriptor = "Ljava/io/File;")
    public File field2759 = null;

    @OriginalMember(owner = "client!od", name = "h", descriptor = "Lsc;")
    public class164 field2764 = null;

    @OriginalMember(owner = "client!od", name = "n", descriptor = "Z")
    private boolean field2770 = false;

    @OriginalMember(owner = "client!od", name = "e", descriptor = "Lsc;")
    public class164 field2761 = null;

    @OriginalMember(owner = "client!od", name = "k", descriptor = "Ljava/io/File;")
    private File field2767 = null;

    @OriginalMember(owner = "client!od", name = "p", descriptor = "Ljava/applet/Applet;")
    public Applet field2772 = null;

    @OriginalMember(owner = "client!od", name = "m", descriptor = "Lsc;")
    public class164 field2769 = null;

    @OriginalMember(owner = "client!od", name = "r", descriptor = "Lgg;")
    private class61 field2774 = null;

    @OriginalMember(owner = "client!od", name = "s", descriptor = "Lgg;")
    private class61 field2775 = null;

    @OriginalMember(owner = "client!od", name = "g", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field2763;

    @OriginalMember(owner = "client!od", name = "i", descriptor = "Ljava/lang/Thread;")
    private Thread field2765;

    @OriginalMember(owner = "client!od", name = "l", descriptor = "I")
    public static int field2768 = 3;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "Lce;")
    private class24 field2757;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "Ljava/lang/String;")
    private static String field2758;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2760;

    @OriginalMember(owner = "client!od", name = "j", descriptor = "Ljava/lang/String;")
    public static String field2766;

    @OriginalMember(owner = "client!od", name = "f", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2762;

    @OriginalMember(owner = "client!od", name = "o", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2771;

    @OriginalMember(owner = "client!od", name = "q", descriptor = "[Lsc;")
    public class164[] field2773;

    @OriginalMember(owner = "client!od", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class61 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2770) {
                        return;
                    }
                    if (this.field2774 != null) {
                        var2 = this.field2774;
                        this.field2774 = this.field2774.field1487;
                        if (this.field2774 == null) {
                            this.field2775 = null;
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
                int var3 = var2.field1488;
                if (var3 == 1) {
                    var2.field1490 = new Socket(InetAddress.getByName((String) var2.field1489), var2.field1485);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field1489);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field1485);
                    var2.field1490 = var4;
                } else if (var3 == 4) {
                    var2.field1490 = new DataInputStream(((URL) var2.field1489).openStream());
                } else if (var3 == 8) {
                    Object[] var6 = (Object[]) var2.field1489;
                    var2.field1490 = ((Class) var6[0]).getDeclaredMethod((String) var6[1], (Class[]) var6[2]);
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field1489;
                    var2.field1490 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else {
                    throw new Exception();
                }
                var2.field1486 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field1486 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)Lce;")
    public final class24 method950(int arg0) {
        if (arg0 >= -121) {
            field2771 = null;
        }
        return this.field2757;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/lang/String;IZ)Lgg;")
    public final class61 method951(String arg0, int arg1, boolean arg2) {
        return arg2 ? this.method955(0, arg0, arg1, (byte) -112, 1) : null;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;)Lgg;")
    public final class61 method952(byte arg0, String arg1, Class arg2, Class[] arg3) {
        if (arg0 <= 59) {
            this.field2770 = false;
        }
        return this.method955(0, new Object[] { arg2, arg1, arg3 }, 0, (byte) -93, 8);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/lang/Runnable;IB)Lgg;")
    public final class61 method953(Runnable arg0, int arg1, byte arg2) {
        if (arg2 != 65) {
            this.field2759 = null;
        }
        return this.method955(0, arg0, arg1, (byte) -110, 2);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IB)Lgg;")
    public final class61 method954(int arg0, byte arg1) {
        if (arg1 < 6) {
            field2760 = null;
        }
        return this.method955(0, null, arg0, (byte) -108, 3);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ILjava/lang/Object;IBI)Lgg;")
    private final class61 method955(int arg0, Object arg1, int arg2, byte arg3, int arg4) {
        int var6 = -117 / ((-arg3 - 7) / 50);
        class61 var7 = new class61();
        var7.field1488 = arg4;
        var7.field1485 = arg2;
        var7.field1489 = arg1;
        synchronized (this) {
            if (this.field2775 == null) {
                this.field2775 = this.field2774 = var7;
            } else {
                this.field2775.field1487 = var7;
                this.field2775 = var7;
            }
            this.notify();
            return var7;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(BLjava/net/URL;)Lgg;")
    public final class61 method956(byte arg0, URL arg1) {
        int var3 = -113 / ((-arg0 - 59) / 41);
        return this.method955(0, arg1, 0, (byte) 122, 4);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIILjava/lang/String;)V")
    private final void method957(int arg0, int arg1, int arg2, String arg3) {
        if (arg0 < 32 || arg0 > 34) {
            arg0 = 32;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field2758, "/tmp/", "" };
        if (arg2 != -19218) {
            return;
        }
        String[] var6 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
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
                        if (this.field2764 == null) {
                            try {
                                File var13 = new File(var11, "random.dat");
                                if (var7 == 1 || var13.exists()) {
                                    this.field2764 = new class164(var13, "rw", 25L);
                                }
                            } catch (Exception var21) {
                                this.field2764 = null;
                            }
                        }
                        if (this.field2767 == null) {
                            try {
                                File var14 = new File(var11, arg3);
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
                                this.field2761 = new class164(var16, "rw", 52428800L);
                                this.field2773 = new class164[arg1];
                                for (int var17 = 0; var17 < arg1; var17++) {
                                    this.field2773[var17] = new class164(new File(var14, "main_file_cache.idx" + var17), "rw", 1048576L);
                                }
                                this.field2769 = new class164(new File(var14, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field2759 = this.field2767 = var14;
                            } catch (Exception var20) {
                                try {
                                    this.field2761.method1173(12);
                                    for (int var18 = 0; var18 < arg1; var18++) {
                                        this.field2773[var18].method1173(arg2 + 19282);
                                    }
                                    this.field2769.method1173(-121);
                                } catch (Exception var19) {
                                }
                                this.field2773 = null;
                                this.field2759 = this.field2767 = null;
                                this.field2761 = this.field2769 = null;
                            }
                        }
                    } catch (Exception var22) {
                    }
                    if (this.field2764 != null && this.field2767 != null) {
                        return;
                    }
                }
            }
        }
        if (this.field2767 == null) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Lgg;")
    public final class61 method958(Class arg0, int arg1, String arg2) {
        if (arg1 >= -71) {
            field2771 = null;
        }
        return this.method955(0, new Object[] { arg0, arg2 }, 0, (byte) 114, 9);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(B)V")
    public final void method959(byte arg0) {
        synchronized (this) {
            this.field2770 = true;
            this.notifyAll();
        }
        try {
            this.field2765.join();
        } catch (InterruptedException var8) {
        }
        if (this.field2761 != null) {
            try {
                this.field2761.method1173(111);
            } catch (IOException var7) {
            }
        }
        if (this.field2769 != null) {
            try {
                this.field2769.method1173(-123);
            } catch (IOException var6) {
            }
        }
        if (arg0 != -111) {
            return;
        }
        if (this.field2773 != null) {
            for (int var3 = 0; var3 < this.field2773.length; var3++) {
                if (this.field2773[var3] != null) {
                    try {
                        this.field2773[var3].method1173(-118);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field2764 != null) {
            try {
                this.field2764.method1173(52);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
    public class129(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
        field2766 = "Unknown";
        this.field2772 = arg1;
        field2760 = "1.1";
        try {
            field2766 = System.getProperty("java.vendor");
            field2760 = System.getProperty("java.version");
        } catch (Exception var10) {
        }
        try {
            field2758 = System.getProperty("user.home");
            if (field2758 != null) {
                field2758 = field2758 + "/";
            }
        } catch (Exception var9) {
        }
        if (field2758 == null) {
            field2758 = "~/";
        }
        try {
            this.field2763 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var8) {
        }
        try {
            if (arg1 == null) {
                field2762 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field2762 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var7) {
        }
        try {
            if (arg1 == null) {
                field2771 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field2771 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        if (arg0) {
            this.method957(arg2, arg4, -19218, arg3);
        }
        this.field2770 = false;
        this.field2765 = new Thread(this);
        this.field2765.setPriority(10);
        this.field2765.setDaemon(true);
        this.field2765.start();
    }
}
