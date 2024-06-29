import java.applet.Applet;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Point;
import java.awt.Toolkit;
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

@OriginalClass("client!t")
public class class247 implements Runnable {

    @OriginalMember(owner = "client!t", name = "b", descriptor = "Lfa;")
    private class80 field4364 = null;

    @OriginalMember(owner = "client!t", name = "i", descriptor = "Lka;")
    public class171 field4371 = null;

    @OriginalMember(owner = "client!t", name = "n", descriptor = "Lka;")
    public class171 field4376 = null;

    @OriginalMember(owner = "client!t", name = "q", descriptor = "Ljava/applet/Applet;")
    public Applet field4379 = null;

    @OriginalMember(owner = "client!t", name = "s", descriptor = "Z")
    private boolean field4381 = false;

    @OriginalMember(owner = "client!t", name = "u", descriptor = "Lfa;")
    private class80 field4383 = null;

    @OriginalMember(owner = "client!t", name = "v", descriptor = "Lka;")
    public class171 field4384 = null;

    @OriginalMember(owner = "client!t", name = "d", descriptor = "Ljava/lang/String;")
    private String field4366;

    @OriginalMember(owner = "client!t", name = "k", descriptor = "I")
    private int field4373;

    @OriginalMember(owner = "client!t", name = "r", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field4380;

    @OriginalMember(owner = "client!t", name = "f", descriptor = "[Lka;")
    public class171[] field4368;

    @OriginalMember(owner = "client!t", name = "o", descriptor = "Ljava/lang/Thread;")
    private Thread field4377;

    @OriginalMember(owner = "client!t", name = "e", descriptor = "I")
    public static int field4367 = 3;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field4363 = new Hashtable(16);

    @OriginalMember(owner = "client!t", name = "j", descriptor = "Lqi;")
    private class208 field4372;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "Ljava/lang/String;")
    public static String field4365;

    @OriginalMember(owner = "client!t", name = "g", descriptor = "Ljava/lang/String;")
    private static String field4369;

    @OriginalMember(owner = "client!t", name = "h", descriptor = "Ljava/lang/String;")
    public static String field4370;

    @OriginalMember(owner = "client!t", name = "l", descriptor = "Ljava/lang/String;")
    public static String field4374;

    @OriginalMember(owner = "client!t", name = "m", descriptor = "Ljava/lang/String;")
    public static String field4375;

    @OriginalMember(owner = "client!t", name = "p", descriptor = "Ljava/lang/String;")
    public static String field4378;

    @OriginalMember(owner = "client!t", name = "t", descriptor = "Ljava/lang/String;")
    public static String field4382;

    @OriginalMember(owner = "client!t", name = "w", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field4385;

    @OriginalMember(owner = "client!t", name = "x", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field4386;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ILjava/lang/Class;)Lfa;")
    public final class80 method1713(int arg0, Class arg1) {
        if (arg0 != -25027) {
            this.method1722(-114);
        }
        return this.method1726(arg1, 0, (byte) -25, 11, 0);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Ljava/net/URL;I)Lfa;")
    public final class80 method1714(URL arg0, int arg1) {
        if (arg1 < 41) {
            field4386 = null;
        }
        return this.method1726(arg0, 0, (byte) -25, 4, 0);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IILjava/lang/Runnable;)Lfa;")
    public final class80 method1715(int arg0, int arg1, Runnable arg2) {
        if (arg1 >= -64) {
            this.method1725((String) null, 81);
        }
        return this.method1726(arg2, arg0, (byte) -25, 2, 0);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V")
    public final void method1716(int arg0) {
        synchronized (this) {
            this.field4381 = true;
            this.notifyAll();
        }
        if (arg0 != 0) {
            return;
        }
        try {
            this.field4377.join();
        } catch (InterruptedException var8) {
        }
        if (this.field4376 != null) {
            try {
                this.field4376.method1149(arg0 - 9424);
            } catch (IOException var7) {
            }
        }
        if (this.field4371 != null) {
            try {
                this.field4371.method1149(-9424);
            } catch (IOException var6) {
            }
        }
        if (this.field4368 != null) {
            for (int var3 = 0; var3 < this.field4368.length; var3++) {
                if (this.field4368[var3] != null) {
                    try {
                        this.field4368[var3].method1149(-9424);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field4384 != null) {
            try {
                this.field4384.method1149(-9424);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ZI)Ljava/io/File;")
    private static final File method1717(String arg0, String arg1, boolean arg2, int arg3) {
        File var4 = (File) field4363.get(arg0);
        if (!arg2) {
            method1717((String) null, (String) null, false, -90);
        }
        if (var4 != null) {
            return var4;
        }
        String[] var5 = new String[] { ".jagex_cache_" + arg3, ".file_store_" + arg3 };
        String[] var6 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field4369, "/tmp/", "" };
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < var5.length; var8++) {
                for (int var9 = 0; var9 < var6.length; var9++) {
                    RandomAccessFile var10 = null;
                    String var11 = var6[var9] + var5[var8] + "/" + (arg1 == null ? "" : arg1 + "/") + arg0;
                    try {
                        File var12 = new File(var11);
                        if (var7 != 0 || var12.exists()) {
                            String var13 = var6[var9];
                            if (var7 != 1 || var13.length() <= 0 || (new File(var13)).exists()) {
                                (new File(var6[var9] + var5[var8])).mkdir();
                                if (arg1 != null) {
                                    (new File(var6[var9] + var5[var8] + "/" + arg1)).mkdir();
                                }
                                var10 = new RandomAccessFile(var12, "rw");
                                int var14 = var10.read();
                                var10.seek(0L);
                                var10.write(var14);
                                var10.seek(0L);
                                var10.close();
                                field4363.put(arg0, var12);
                                return var12;
                            }
                        }
                    } catch (Exception var17) {
                        try {
                            if (var10 != null) {
                                var10.close();
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

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Ljava/awt/Component;IIB)Lfa;")
    public final class80 method1718(Component arg0, int arg1, int arg2, byte arg3) {
        int var5 = -40 % ((17 - arg3) / 54);
        Point var6 = arg0.getLocationOnScreen();
        return this.method1726((Object) null, var6.x + arg1, (byte) -25, 14, var6.y + arg2);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Lfa;")
    public final class80 method1719(Class arg0, String arg1, int arg2) {
        if (arg2 < 103) {
            this.method1720((Component) null, false, 81);
        }
        return this.method1726(new Object[] { arg0, arg1 }, 0, (byte) -25, 9, 0);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Ljava/awt/Component;ZI)Lfa;")
    public final class80 method1720(Component arg0, boolean arg1, int arg2) {
        int var4 = -68 / ((39 - arg2) / 36);
        return this.method1726(arg0, arg1 ? 1 : 0, (byte) -25, 15, 0);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(BLjava/lang/String;I)Lfa;")
    public final class80 method1721(byte arg0, String arg1, int arg2) {
        return arg0 == -96 ? this.method1726(arg1, arg2, (byte) -25, 1, 0) : null;
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(I)Lqi;")
    public final class208 method1722(int arg0) {
        if (arg0 != 1185130032) {
            this.field4371 = null;
        }
        return this.field4372;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;B)Lfa;")
    public final class80 method1723(String arg0, Class[] arg1, Class arg2, byte arg3) {
        int var5 = -12 / ((arg3 - 35) / 32);
        return this.method1726(new Object[] { arg2, arg0, arg1 }, 0, (byte) -25, 8, 0);
    }

    @OriginalMember(owner = "client!t", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class80 var2;
            synchronized (this) {
                while (true) {
                    if (this.field4381) {
                        return;
                    }
                    if (this.field4383 != null) {
                        var2 = this.field4383;
                        this.field4383 = this.field4383.field1357;
                        if (this.field4383 == null) {
                            this.field4364 = null;
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
                int var3 = var2.field1361;
                if (var3 == 1) {
                    var2.field1360 = new Socket(InetAddress.getByName((String) var2.field1359), var2.field1358);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field1359);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field1358);
                    var2.field1360 = var4;
                } else if (var3 == 4) {
                    var2.field1360 = new DataInputStream(((URL) var2.field1359).openStream());
                } else if (var3 == 8) {
                    Object[] var6 = (Object[]) var2.field1359;
                    var2.field1360 = ((Class) var6[0]).getDeclaredMethod((String) var6[1], (Class[]) var6[2]);
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field1359;
                    var2.field1360 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else {
                    throw new Exception();
                }
                var2.field1356 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field1356 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ILjava/lang/String;)Lfa;")
    public final class80 method1724(int arg0, String arg1) {
        if (arg0 != 0) {
            this.field4377 = null;
        }
        return this.method1726(arg1, 0, (byte) -25, 16, 0);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Ljava/lang/String;I)Lfa;")
    public final class80 method1725(String arg0, int arg1) {
        return arg1 > -7 ? null : this.method1726(arg0, 0, (byte) -25, 12, 0);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Ljava/lang/Object;IBII)Lfa;")
    private final class80 method1726(Object arg0, int arg1, byte arg2, int arg3, int arg4) {
        class80 var6 = new class80();
        var6.field1359 = arg0;
        var6.field1358 = arg1;
        if (arg2 != -25) {
            field4386 = null;
        }
        var6.field1361 = arg3;
        synchronized (this) {
            if (this.field4364 == null) {
                this.field4364 = this.field4383 = var6;
            } else {
                this.field4364.field1357 = var6;
                this.field4364 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IB)Lfa;")
    public final class80 method1727(int arg0, byte arg1) {
        return arg1 < 120 ? null : this.method1726((Object) null, arg0, (byte) -25, 3, 0);
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
    public class247(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) throws Exception {
        this.field4366 = arg3;
        this.field4373 = arg2;
        field4370 = "1.1";
        this.field4379 = arg1;
        field4378 = "Unknown";
        try {
            field4378 = System.getProperty("java.vendor");
            field4370 = System.getProperty("java.version");
        } catch (Exception var14) {
        }
        try {
            field4365 = System.getProperty("os.name");
        } catch (Exception var13) {
            field4365 = "Unknown";
        }
        field4375 = field4365.toLowerCase();
        try {
            field4374 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var12) {
            field4374 = "";
        }
        try {
            field4382 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var11) {
            field4382 = "";
        }
        try {
            field4369 = System.getProperty("user.home");
            if (field4369 != null) {
                field4369 = field4369 + "/";
            }
        } catch (Exception var10) {
        }
        if (field4369 == null) {
            field4369 = "~/";
        }
        try {
            this.field4380 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var9) {
        }
        try {
            if (arg1 == null) {
                field4386 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field4386 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var8) {
        }
        try {
            if (arg1 == null) {
                field4385 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field4385 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var7) {
        }
        if (arg0) {
            this.field4384 = new class171(method1717("random.dat", (String) null, true, this.field4373), "rw", 25L);
            this.field4376 = new class171(method1717("main_file_cache.dat2", this.field4366, true, this.field4373), "rw", 104857600L);
            this.field4371 = new class171(method1717("main_file_cache.idx255", this.field4366, true, this.field4373), "rw", 1048576L);
            this.field4368 = new class171[arg4];
            for (int var6 = 0; var6 < arg4; var6++) {
                this.field4368[var6] = new class171(method1717("main_file_cache.idx" + var6, this.field4366, true, this.field4373), "rw", 1048576L);
            }
        }
        this.field4381 = false;
        this.field4377 = new Thread(this);
        this.field4377.setPriority(10);
        this.field4377.setDaemon(true);
        this.field4377.start();
    }
}
