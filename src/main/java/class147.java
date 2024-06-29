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

@OriginalClass("client!pf")
public class class147 implements Runnable {

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "Lk;")
    private class96 field2649 = null;

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "Z")
    private boolean field2648 = false;

    @OriginalMember(owner = "client!pf", name = "p", descriptor = "Lk;")
    private class96 field2660 = null;

    @OriginalMember(owner = "client!pf", name = "n", descriptor = "Ljava/applet/Applet;")
    public Applet field2658 = null;

    @OriginalMember(owner = "client!pf", name = "l", descriptor = "Ljava/io/File;")
    public File field2656 = null;

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "Lmg;")
    public class121 field2650 = null;

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "Lmg;")
    public class121 field2654 = null;

    @OriginalMember(owner = "client!pf", name = "r", descriptor = "Lmg;")
    public class121 field2662 = null;

    @OriginalMember(owner = "client!pf", name = "s", descriptor = "Ljava/io/File;")
    private File field2663 = null;

    @OriginalMember(owner = "client!pf", name = "m", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field2657;

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "Ljava/lang/Thread;")
    private Thread field2653;

    @OriginalMember(owner = "client!pf", name = "o", descriptor = "I")
    public static int field2659 = 3;

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "Lkf;")
    private class102 field2646;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "Ljava/lang/String;")
    private static String field2647;

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "Ljava/lang/String;")
    public static String field2651;

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "Ljava/lang/String;")
    public static String field2652;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2645;

    @OriginalMember(owner = "client!pf", name = "q", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2661;

    @OriginalMember(owner = "client!pf", name = "k", descriptor = "[Lmg;")
    public class121[] field2655;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/Class;BLjava/lang/String;)Lk;")
    public final class96 method898(Class[] arg0, Class arg1, byte arg2, String arg3) {
        if (arg2 > -114) {
            this.method904(null, -11, null);
        }
        return this.method905(0, 0, (byte) -91, 8, new Object[] { arg1, arg3, arg0 });
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILjava/lang/String;I)Lk;")
    public final class96 method899(int arg0, String arg1, int arg2) {
        if (arg2 <= 102) {
            this.method898(null, null, (byte) -12, null);
        }
        return this.method905(arg0, 0, (byte) -91, 1, arg1);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
    public final void method900(int arg0) {
        synchronized (this) {
            this.field2648 = true;
            this.notifyAll();
        }
        try {
            this.field2653.join();
        } catch (InterruptedException var8) {
        }
        if (this.field2654 != null) {
            try {
                this.field2654.method733(0);
            } catch (IOException var7) {
            }
        }
        if (this.field2650 != null) {
            try {
                this.field2650.method733(0);
            } catch (IOException var6) {
            }
        }
        if (this.field2655 != null) {
            for (int var3 = 0; var3 < this.field2655.length; var3++) {
                if (this.field2655[var3] != null) {
                    try {
                        this.field2655[var3].method733(0);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (arg0 == 3 && this.field2662 != null) {
            try {
                this.field2662.method733(0);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(BLjava/net/URL;)Lk;")
    public final class96 method901(byte arg0, URL arg1) {
        int var3 = 39 / ((-arg0 - 73) / 46);
        return this.method905(0, 0, (byte) -91, 4, arg1);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)Lkf;")
    public final class102 method902(byte arg0) {
        return arg0 == 38 ? this.field2646 : null;
    }

    @OriginalMember(owner = "client!pf", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class96 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2648) {
                        return;
                    }
                    if (this.field2660 != null) {
                        var2 = this.field2660;
                        this.field2660 = this.field2660.field1770;
                        if (this.field2660 == null) {
                            this.field2649 = null;
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
                int var3 = var2.field1766;
                if (var3 == 1) {
                    var2.field1767 = new Socket(InetAddress.getByName((String) var2.field1769), var2.field1768);
                } else if (var3 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1769);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1768);
                    var2.field1767 = var6;
                } else if (var3 == 4) {
                    var2.field1767 = new DataInputStream(((URL) var2.field1769).openStream());
                } else if (var3 == 8) {
                    Object[] var4 = (Object[]) var2.field1769;
                    var2.field1767 = ((Class) var4[0]).getDeclaredMethod((String) var4[1], (Class[]) var4[2]);
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field1769;
                    var2.field1767 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else {
                    throw new Exception();
                }
                var2.field1765 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field1765 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IILjava/lang/Runnable;)Lk;")
    public final class96 method903(int arg0, int arg1, Runnable arg2) {
        int var4 = 0 / ((arg1 + 10) / 59);
        return this.method905(arg0, 0, (byte) -91, 2, arg2);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Lk;")
    public final class96 method904(Class arg0, int arg1, String arg2) {
        return arg1 == 9 ? this.method905(0, 0, (byte) -91, 9, new Object[] { arg0, arg2 }) : null;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIBILjava/lang/Object;)Lk;")
    private final class96 method905(int arg0, int arg1, byte arg2, int arg3, Object arg4) {
        class96 var6 = new class96();
        var6.field1766 = arg3;
        var6.field1769 = arg4;
        var6.field1768 = arg0;
        synchronized (this) {
            if (arg2 != -91) {
                this.method898(null, null, (byte) 3, null);
            }
            if (this.field2649 == null) {
                this.field2649 = this.field2660 = var6;
            } else {
                this.field2649.field1770 = var6;
                this.field2649 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Ljava/lang/String;III)V")
    private final void method906(String arg0, int arg1, int arg2, int arg3) {
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field2647, "/tmp/", "" };
        if (arg3 < 32 || arg3 > 34) {
            arg3 = 32;
        }
        String[] var6 = new String[] { ".jagex_cache_" + arg3, ".file_store_" + arg3 };
        if (arg2 > -98) {
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
                        if (this.field2662 == null) {
                            try {
                                File var13 = new File(var11, "random.dat");
                                if (var7 == 1 || var13.exists()) {
                                    this.field2662 = new class121(var13, "rw", 25L);
                                }
                            } catch (Exception var21) {
                                this.field2662 = null;
                            }
                        }
                        if (this.field2663 == null) {
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
                                this.field2654 = new class121(var16, "rw", 104857600L);
                                this.field2655 = new class121[arg1];
                                for (int var17 = 0; var17 < arg1; var17++) {
                                    this.field2655[var17] = new class121(new File(var14, "main_file_cache.idx" + var17), "rw", 1048576L);
                                }
                                this.field2650 = new class121(new File(var14, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field2656 = this.field2663 = var14;
                            } catch (Exception var20) {
                                try {
                                    this.field2654.method733(0);
                                    for (int var18 = 0; var18 < arg1; var18++) {
                                        this.field2655[var18].method733(0);
                                    }
                                    this.field2650.method733(0);
                                } catch (Exception var19) {
                                }
                                this.field2655 = null;
                                this.field2656 = this.field2663 = null;
                                this.field2654 = this.field2650 = null;
                            }
                        }
                    } catch (Exception var22) {
                    }
                    if (this.field2662 != null && this.field2663 != null) {
                        return;
                    }
                }
            }
        }
        if (this.field2663 == null) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)Lk;")
    public final class96 method907(int arg0, int arg1) {
        int var3 = -43 / ((arg1 + 22) / 49);
        return this.method905(arg0, 0, (byte) -91, 3, null);
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
    public class147(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
        this.field2658 = arg1;
        field2651 = "Unknown";
        field2652 = "1.1";
        try {
            field2651 = System.getProperty("java.vendor");
            field2652 = System.getProperty("java.version");
        } catch (Exception var10) {
        }
        try {
            field2647 = System.getProperty("user.home");
            if (field2647 != null) {
                field2647 = field2647 + "/";
            }
        } catch (Exception var9) {
        }
        if (field2647 == null) {
            field2647 = "~/";
        }
        try {
            this.field2657 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var8) {
        }
        try {
            if (arg1 == null) {
                field2645 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field2645 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var7) {
        }
        try {
            if (arg1 == null) {
                field2661 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field2661 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        if (arg0) {
            this.method906(arg3, arg4, -101, arg2);
        }
        this.field2648 = false;
        this.field2653 = new Thread(this);
        this.field2653.setPriority(10);
        this.field2653.setDaemon(true);
        this.field2653.start();
    }
}
