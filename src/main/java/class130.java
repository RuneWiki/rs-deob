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

@OriginalClass("client!na")
public class class130 implements Runnable {

    @OriginalMember(owner = "client!na", name = "e", descriptor = "Lnh;")
    public class137 field2452 = null;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "Ljava/io/File;")
    public File field2451 = null;

    @OriginalMember(owner = "client!na", name = "j", descriptor = "Lnh;")
    public class137 field2457 = null;

    @OriginalMember(owner = "client!na", name = "n", descriptor = "Lwg;")
    private class222 field2461 = null;

    @OriginalMember(owner = "client!na", name = "k", descriptor = "Z")
    private boolean field2458 = false;

    @OriginalMember(owner = "client!na", name = "r", descriptor = "Ljava/applet/Applet;")
    public Applet field2465 = null;

    @OriginalMember(owner = "client!na", name = "l", descriptor = "Lwg;")
    private class222 field2459 = null;

    @OriginalMember(owner = "client!na", name = "p", descriptor = "Lnh;")
    public class137 field2463 = null;

    @OriginalMember(owner = "client!na", name = "m", descriptor = "Ljava/io/File;")
    private File field2460 = null;

    @OriginalMember(owner = "client!na", name = "o", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field2462;

    @OriginalMember(owner = "client!na", name = "h", descriptor = "Ljava/lang/Thread;")
    private Thread field2455;

    @OriginalMember(owner = "client!na", name = "g", descriptor = "I")
    public static int field2454 = 3;

    @OriginalMember(owner = "client!na", name = "q", descriptor = "Ltc;")
    private class192 field2464;

    @OriginalMember(owner = "client!na", name = "f", descriptor = "Ljava/lang/String;")
    public static String field2453;

    @OriginalMember(owner = "client!na", name = "i", descriptor = "Ljava/lang/String;")
    public static String field2456;

    @OriginalMember(owner = "client!na", name = "s", descriptor = "Ljava/lang/String;")
    private static String field2466;

    @OriginalMember(owner = "client!na", name = "b", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2449;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2450;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "[Lnh;")
    public class137[] field2448;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V")
    public final void method827(int arg0) {
        synchronized (this) {
            if (arg0 != 0) {
                this.method831((byte) -21, null, null, null);
            }
            this.field2458 = true;
            this.notifyAll();
        }
        try {
            this.field2455.join();
        } catch (InterruptedException var8) {
        }
        if (this.field2457 != null) {
            try {
                this.field2457.method858(-108);
            } catch (IOException var7) {
            }
        }
        if (this.field2452 != null) {
            try {
                this.field2452.method858(112);
            } catch (IOException var6) {
            }
        }
        if (this.field2448 != null) {
            for (int var3 = 0; var3 < this.field2448.length; var3++) {
                if (this.field2448[var3] != null) {
                    try {
                        this.field2448[var3].method858(arg0 ^ 0xFFFFFF96);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field2463 != null) {
            try {
                this.field2463.method858(-101);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Ljava/lang/Object;IIII)Lwg;")
    private final class222 method828(Object arg0, int arg1, int arg2, int arg3, int arg4) {
        class222 var6 = new class222();
        var6.field4257 = arg0;
        if (arg1 >= -7) {
            this.method833(122, (byte) 18, null);
        }
        var6.field4255 = arg2;
        var6.field4258 = arg3;
        synchronized (this) {
            if (this.field2461 == null) {
                this.field2461 = this.field2459 = var6;
            } else {
                this.field2461.field4259 = var6;
                this.field2461 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!na", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class222 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2458) {
                        return;
                    }
                    if (this.field2459 != null) {
                        var2 = this.field2459;
                        this.field2459 = this.field2459.field4259;
                        if (this.field2459 == null) {
                            this.field2461 = null;
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
                int var3 = var2.field4255;
                if (var3 == 1) {
                    var2.field4256 = new Socket(InetAddress.getByName((String) var2.field4257), var2.field4258);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field4257);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field4258);
                    var2.field4256 = var4;
                } else if (var3 == 4) {
                    var2.field4256 = new DataInputStream(((URL) var2.field4257).openStream());
                } else if (var3 == 8) {
                    Object[] var5 = (Object[]) var2.field4257;
                    var2.field4256 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 9) {
                    Object[] var6 = (Object[]) var2.field4257;
                    var2.field4256 = ((Class) var6[0]).getDeclaredField((String) var6[1]);
                } else {
                    throw new Exception();
                }
                var2.field4254 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field4254 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(I)Ltc;")
    public final class192 method829(int arg0) {
        return arg0 > -85 ? null : this.field2464;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I)Lwg;")
    public final class222 method830(String arg0, Class arg1, int arg2) {
        return arg2 == -6752 ? this.method828(new Object[] { arg1, arg0 }, -54, 9, 0, 0) : null;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;)Lwg;")
    public final class222 method831(byte arg0, String arg1, Class arg2, Class[] arg3) {
        if (arg0 != -31) {
            this.field2465 = null;
        }
        return this.method828(new Object[] { arg2, arg1, arg3 }, arg0 - 51, 8, 0, 0);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Ljava/net/URL;I)Lwg;")
    public final class222 method832(URL arg0, int arg1) {
        if (arg1 != 0) {
            this.field2455 = null;
        }
        return this.method828(arg0, -113, 4, 0, 0);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IBLjava/lang/String;)Lwg;")
    public final class222 method833(int arg0, byte arg1, String arg2) {
        if (arg1 > -35) {
            this.method827(-16);
        }
        return this.method828(arg2, -98, 1, arg0, 0);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(II)Lwg;")
    public final class222 method834(int arg0, int arg1) {
        if (arg0 != -10) {
            this.method834(62, 64);
        }
        return this.method828(null, -81, 3, arg1, 0);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IILjava/lang/Runnable;)Lwg;")
    public final class222 method835(int arg0, int arg1, Runnable arg2) {
        if (arg1 != -24542) {
            field2449 = null;
        }
        return this.method828(arg2, -125, 2, arg0, 0);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IILjava/lang/String;Z)V")
    private final void method836(int arg0, int arg1, String arg2, boolean arg3) {
        if (arg0 < 32 || arg0 > 34) {
            arg0 = 32;
        }
        if (arg3) {
            this.field2461 = null;
        }
        String[] var5 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
        String[] var6 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field2466, "/tmp/", "" };
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < var5.length; var8++) {
                for (int var9 = 0; var9 < var6.length; var9++) {
                    try {
                        String var10 = var6[var9];
                        if (var10.length() > 0 && !(new File(var10)).exists()) {
                            continue;
                        }
                        File var11 = new File(var10 + var5[var8]);
                        if (var7 == 1 && !var11.exists()) {
                            boolean var12 = var11.mkdir();
                            if (!var12) {
                                continue;
                            }
                        }
                        if (this.field2463 == null) {
                            try {
                                File var13 = new File(var11, "random.dat");
                                if (var7 == 1 || var13.exists()) {
                                    this.field2463 = new class137(var13, "rw", 25L);
                                }
                            } catch (Exception var21) {
                                this.field2463 = null;
                            }
                        }
                        if (this.field2460 == null) {
                            try {
                                File var14 = new File(var11, arg2);
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
                                this.field2457 = new class137(var16, "rw", 104857600L);
                                this.field2448 = new class137[arg1];
                                for (int var17 = 0; var17 < arg1; var17++) {
                                    this.field2448[var17] = new class137(new File(var14, "main_file_cache.idx" + var17), "rw", 1048576L);
                                }
                                this.field2452 = new class137(new File(var14, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field2451 = this.field2460 = var14;
                            } catch (Exception var20) {
                                try {
                                    this.field2457.method858(-6);
                                    for (int var18 = 0; var18 < arg1; var18++) {
                                        this.field2448[var18].method858(-121);
                                    }
                                    this.field2452.method858(-57);
                                } catch (Exception var19) {
                                }
                                this.field2457 = this.field2452 = null;
                                this.field2451 = this.field2460 = null;
                                this.field2448 = null;
                            }
                        }
                    } catch (Exception var22) {
                    }
                    if (this.field2463 != null && this.field2460 != null) {
                        return;
                    }
                }
            }
        }
        if (this.field2460 == null) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
    public class130(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
        field2456 = "Unknown";
        field2453 = "1.1";
        this.field2465 = arg1;
        try {
            field2456 = System.getProperty("java.vendor");
            field2453 = System.getProperty("java.version");
        } catch (Exception var10) {
        }
        try {
            field2466 = System.getProperty("user.home");
            if (field2466 != null) {
                field2466 = field2466 + "/";
            }
        } catch (Exception var9) {
        }
        if (field2466 == null) {
            field2466 = "~/";
        }
        try {
            this.field2462 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var8) {
        }
        try {
            if (arg1 == null) {
                field2450 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field2450 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var7) {
        }
        try {
            if (arg1 == null) {
                field2449 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field2449 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        if (arg0) {
            this.method836(arg2, arg4, arg3, false);
        }
        this.field2458 = false;
        this.field2455 = new Thread(this);
        this.field2455.setPriority(10);
        this.field2455.setDaemon(true);
        this.field2455.start();
    }
}
