import java.applet.Applet;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class72 implements Runnable {

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "Lka;")
    public class70 field1491 = null;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "Ljava/io/File;")
    public File field1487 = null;

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "Lnc;")
    private class93 field1496 = null;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "Lka;")
    public class70 field1493 = null;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "Ljava/applet/Applet;")
    public Applet field1492 = null;

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "Ljava/io/File;")
    private File field1498 = null;

    @OriginalMember(owner = "client!kc", name = "p", descriptor = "I")
    public int field1502 = 0;

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "Lnc;")
    private class93 field1494 = null;

    @OriginalMember(owner = "client!kc", name = "m", descriptor = "Z")
    private boolean field1499 = false;

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field1497;

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "Ljava/lang/Thread;")
    private Thread field1495;

    @OriginalMember(owner = "client!kc", name = "o", descriptor = "I")
    public static int field1501 = 3;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "Laa;")
    private class2 field1488;

    @OriginalMember(owner = "client!kc", name = "n", descriptor = "Ljava/lang/String;")
    public static String field1500;

    @OriginalMember(owner = "client!kc", name = "q", descriptor = "Ljava/lang/String;")
    public static String field1503;

    @OriginalMember(owner = "client!kc", name = "s", descriptor = "Ljava/lang/String;")
    private static String field1505;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1490;

    @OriginalMember(owner = "client!kc", name = "r", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1504;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "[Lka;")
    public class70[] field1489;

    @OriginalMember(owner = "client!kc", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class93 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1499) {
                        return;
                    }
                    if (this.field1494 != null) {
                        var2 = this.field1494;
                        this.field1494 = this.field1494.field2129;
                        if (this.field1494 == null) {
                            this.field1496 = null;
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
                int var3 = var2.field2132;
                if (var3 == 1) {
                    var2.field2130 = new Socket(InetAddress.getByName((String) var2.field2131), var2.field2133);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field2131);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field2133);
                    var2.field2130 = var4;
                } else if (var3 == 4) {
                    var2.field2130 = new DataInputStream(((URL) var2.field2131).openStream());
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field2131;
                    var2.field2130 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 10) {
                    Object[] var6 = (Object[]) var2.field2131;
                    var2.field2130 = ((Class) var6[0]).getDeclaredField((String) var6[1]);
                } else {
                    throw new Exception();
                }
                var2.field2134 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2134 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILjava/lang/String;I)Lnc;")
    public final class93 method578(int arg0, String arg1, int arg2) {
        if (arg2 != -13550) {
            this.field1496 = null;
        }
        return this.method584(arg0, 111, arg1, 1, 0);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I[Ljava/lang/Class;)Lnc;")
    public final class93 method579(Class arg0, String arg1, int arg2, Class[] arg3) {
        return arg2 >= -9 ? null : this.method584(0, 118, new Object[] { arg0, arg1, arg3 }, 9, 0);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Z)V")
    public final void method580(boolean arg0) {
        synchronized (this) {
            this.field1499 = arg0;
            this.notifyAll();
        }
        try {
            this.field1495.join();
        } catch (InterruptedException var7) {
        }
        if (this.field1491 != null) {
            try {
                this.field1491.method560(16);
            } catch (IOException var6) {
            }
        }
        if (this.field1493 != null) {
            try {
                this.field1493.method560(117);
            } catch (IOException var5) {
            }
        }
        if (this.field1489 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1489.length; var3++) {
            if (this.field1489[var3] != null) {
                try {
                    this.field1489[var3].method560(121);
                } catch (IOException var4) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IILjava/lang/Runnable;)Lnc;")
    public final class93 method581(int arg0, int arg1, Runnable arg2) {
        if (arg1 != 25093) {
            this.field1498 = null;
        }
        return this.method584(arg0, 110, arg2, 2, 0);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;B)Lnc;")
    public final class93 method582(String arg0, Class arg1, byte arg2) {
        return arg2 == -84 ? this.method584(0, 113, new Object[] { arg1, arg0 }, 10, 0) : null;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)Lnc;")
    public final class93 method583(int arg0, int arg1) {
        if (arg1 != 2) {
            this.method581(24, -124, null);
        }
        return this.method584(arg0, -10, null, 3, 0);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IILjava/lang/Object;II)Lnc;")
    private final class93 method584(int arg0, int arg1, Object arg2, int arg3, int arg4) {
        class93 var6 = new class93();
        var6.field2131 = arg2;
        var6.field2133 = arg0;
        var6.field2132 = arg3;
        synchronized (this) {
            int var8 = 123 % ((55 - arg1) / 50);
            if (this.field1496 == null) {
                this.field1496 = this.field1494 = var6;
            } else {
                this.field1496.field2129 = var6;
                this.field1496 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)Laa;")
    public final class2 method585(int arg0) {
        if (arg0 != 0) {
            this.field1499 = false;
        }
        return this.field1488;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIILjava/lang/String;)V")
    private final void method586(int arg0, int arg1, int arg2, String arg3) {
        int var5 = 94 / ((arg1 + 38) / 35);
        String[] var6 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", "/tmp/", field1505, "" };
        if (arg0 < 32 || arg0 > 34) {
            arg0 = 32;
        }
        String[] var7 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
        boolean var8 = false;
        for (int var9 = 0; var9 < 2; var9++) {
            for (int var10 = 0; var10 < var7.length; var10++) {
                for (int var11 = 0; var11 < var6.length; var11++) {
                    try {
                        String var12 = var6[var11];
                        if (var12.length() > 0 && !(new File(var12)).exists()) {
                            continue;
                        }
                        File var13 = new File(var12 + var7[var10]);
                        if (var9 == 1 && !var13.exists()) {
                            boolean var14 = var13.mkdir();
                            if (!var14) {
                                continue;
                            }
                        }
                        if (!var8) {
                            try {
                                File var15 = new File(var13, "uid.dat");
                                if (var9 == 1 && (!var15.exists() || var15.length() < 4L)) {
                                    int var16 = -1;
                                    Random var17 = new Random();
                                    while (var16 == -1) {
                                        var16 = var17.nextInt();
                                    }
                                    DataOutputStream var18 = new DataOutputStream(new FileOutputStream(var15));
                                    var18.writeInt(var16);
                                    var18.close();
                                }
                                if (var15.exists()) {
                                    var8 = true;
                                    DataInputStream var19 = new DataInputStream(new FileInputStream(var15));
                                    this.field1502 = var19.readInt() + 1;
                                    var19.close();
                                }
                            } catch (Exception var27) {
                            }
                        }
                        if (this.field1498 == null) {
                            try {
                                File var20 = new File(var13, arg3);
                                if (var9 == 1 && !var20.exists()) {
                                    boolean var21 = var20.mkdir();
                                    if (!var21) {
                                        continue;
                                    }
                                }
                                File var22 = new File(var20, "main_file_cache.dat2");
                                if (var9 == 0 && !var22.exists()) {
                                    continue;
                                }
                                this.field1491 = new class70(var22, "rw", 52428800L);
                                this.field1489 = new class70[arg2];
                                for (int var23 = 0; var23 < arg2; var23++) {
                                    this.field1489[var23] = new class70(new File(var20, "main_file_cache.idx" + var23), "rw", 1048576L);
                                }
                                this.field1493 = new class70(new File(var20, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field1487 = this.field1498 = var20;
                            } catch (Exception var26) {
                                try {
                                    this.field1491.method560(115);
                                    for (int var24 = 0; var24 < arg2; var24++) {
                                        this.field1489[var24].method560(111);
                                    }
                                    this.field1493.method560(54);
                                } catch (Exception var25) {
                                }
                                this.field1491 = this.field1493 = null;
                                this.field1487 = this.field1498 = null;
                                this.field1489 = null;
                            }
                        }
                    } catch (Exception var28) {
                    }
                    if (var8 && this.field1498 != null) {
                        return;
                    }
                }
            }
        }
        if (this.field1498 == null) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/net/URL;I)Lnc;")
    public final class93 method587(URL arg0, int arg1) {
        if (arg1 != -17597) {
            this.method581(58, -97, null);
        }
        return this.method584(0, -37, arg0, 4, 0);
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
    public class72(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
        field1503 = "Unknown";
        this.field1492 = arg1;
        field1500 = "1.1";
        try {
            field1503 = System.getProperty("java.vendor");
            field1500 = System.getProperty("java.version");
        } catch (Exception var10) {
        }
        try {
            field1505 = System.getProperty("user.home");
            if (field1505 != null) {
                field1505 = field1505 + "/";
            }
        } catch (Exception var9) {
        }
        if (field1505 == null) {
            field1505 = "~/";
        }
        try {
            this.field1497 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var8) {
        }
        try {
            if (arg1 == null) {
                field1504 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field1504 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var7) {
        }
        try {
            if (arg1 == null) {
                field1490 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field1490 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        if (arg0) {
            this.method586(arg2, 64, arg4, arg3);
        }
        this.field1499 = false;
        this.field1495 = new Thread(this);
        this.field1495.setPriority(10);
        this.field1495.setDaemon(true);
        this.field1495.start();
    }
}
