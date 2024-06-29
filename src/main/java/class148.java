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

@OriginalClass("client!w")
public class class148 implements Runnable {

    @OriginalMember(owner = "client!w", name = "c", descriptor = "Lic;")
    public class59 field3618 = null;

    @OriginalMember(owner = "client!w", name = "j", descriptor = "Ljc;")
    private class65 field3625 = null;

    @OriginalMember(owner = "client!w", name = "l", descriptor = "Ljava/io/File;")
    private File field3627 = null;

    @OriginalMember(owner = "client!w", name = "g", descriptor = "Z")
    private boolean field3622 = false;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "Ljava/io/File;")
    public File field3617 = null;

    @OriginalMember(owner = "client!w", name = "n", descriptor = "Ljava/applet/Applet;")
    public Applet field3629 = null;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "Ljc;")
    private class65 field3619 = null;

    @OriginalMember(owner = "client!w", name = "m", descriptor = "Lic;")
    public class59 field3628 = null;

    @OriginalMember(owner = "client!w", name = "s", descriptor = "I")
    public int field3634 = 0;

    @OriginalMember(owner = "client!w", name = "h", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field3623;

    @OriginalMember(owner = "client!w", name = "e", descriptor = "Ljava/lang/Thread;")
    private Thread field3620;

    @OriginalMember(owner = "client!w", name = "k", descriptor = "I")
    public static int field3626 = 3;

    @OriginalMember(owner = "client!w", name = "q", descriptor = "Lve;")
    private class147 field3632;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "Ljava/lang/String;")
    public static String field3616;

    @OriginalMember(owner = "client!w", name = "p", descriptor = "Ljava/lang/String;")
    private static String field3631;

    @OriginalMember(owner = "client!w", name = "r", descriptor = "Ljava/lang/String;")
    public static String field3633;

    @OriginalMember(owner = "client!w", name = "f", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field3621;

    @OriginalMember(owner = "client!w", name = "o", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field3630;

    @OriginalMember(owner = "client!w", name = "i", descriptor = "[Lic;")
    public class59[] field3624;

    @OriginalMember(owner = "client!w", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class65 var2;
            synchronized (this) {
                while (true) {
                    if (this.field3622) {
                        return;
                    }
                    if (this.field3625 != null) {
                        var2 = this.field3625;
                        this.field3625 = this.field3625.field1694;
                        if (this.field3625 == null) {
                            this.field3619 = null;
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
                int var3 = var2.field1698;
                if (var3 == 1) {
                    var2.field1693 = new Socket(InetAddress.getByName((String) var2.field1696), var2.field1697);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field1696);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field1697);
                    var2.field1693 = var4;
                } else if (var3 == 4) {
                    var2.field1693 = new DataInputStream(((URL) var2.field1696).openStream());
                } else if (var3 == 8) {
                    Object[] var6 = (Object[]) var2.field1696;
                    var2.field1693 = ((Class) var6[0]).getDeclaredMethod((String) var6[1], (Class[]) var6[2]);
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field1696;
                    var2.field1693 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else {
                    throw new Exception();
                }
                var2.field1695 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field1695 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ILjava/lang/Runnable;B)Ljc;")
    public final class65 method1176(int arg0, Runnable arg1, byte arg2) {
        int var4 = -3 / ((arg2 - 12) / 51);
        return this.method1185(0, 2, -89, arg0, arg1);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/String;ZLjava/lang/Class;)Ljc;")
    public final class65 method1177(Class[] arg0, String arg1, boolean arg2, Class arg3) {
        return arg2 ? this.method1185(0, 8, -114, 0, new Object[] { arg3, arg1, arg0 }) : null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IILjava/lang/String;)Ljc;")
    public final class65 method1178(int arg0, int arg1, String arg2) {
        if (arg0 != 2280) {
            this.field3620 = null;
        }
        return this.method1185(0, 1, -123, arg1, arg2);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(B)Lve;")
    public final class147 method1179(byte arg0) {
        if (arg0 != 19) {
            field3631 = null;
        }
        return this.field3632;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Class;)Ljc;")
    public final class65 method1180(String arg0, int arg1, Class arg2) {
        return arg1 == 0 ? this.method1185(0, 9, -119, 0, new Object[] { arg2, arg0 }) : null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Ljava/lang/String;IIB)V")
    private final void method1181(String arg0, int arg1, int arg2, byte arg3) {
        if (arg2 < 32 || arg2 > 34) {
            arg2 = 32;
        }
        boolean var5 = false;
        String[] var6 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", "/tmp/", field3631, "" };
        String[] var7 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
        if (arg3 != -46) {
            this.method1184(19, -110);
        }
        for (int var8 = 0; var8 < 2; var8++) {
            for (int var9 = 0; var9 < var7.length; var9++) {
                for (int var10 = 0; var10 < var6.length; var10++) {
                    try {
                        String var11 = var6[var10];
                        if (var11.length() > 0 && !(new File(var11)).exists()) {
                            continue;
                        }
                        File var12 = new File(var11 + var7[var9]);
                        if (var8 == 1 && !var12.exists()) {
                            boolean var13 = var12.mkdir();
                            if (!var13) {
                                continue;
                            }
                        }
                        if (!var5) {
                            try {
                                File var14 = new File(var12, "uid.dat");
                                if (var8 == 1 && (!var14.exists() || var14.length() < 4L)) {
                                    int var15 = -1;
                                    Random var16 = new Random();
                                    while (var15 == -1) {
                                        var15 = var16.nextInt();
                                    }
                                    DataOutputStream var17 = new DataOutputStream(new FileOutputStream(var14));
                                    var17.writeInt(var15);
                                    var17.close();
                                }
                                if (var14.exists()) {
                                    var5 = true;
                                    DataInputStream var18 = new DataInputStream(new FileInputStream(var14));
                                    this.field3634 = var18.readInt() + 1;
                                    var18.close();
                                }
                            } catch (Exception var26) {
                            }
                        }
                        if (this.field3627 == null) {
                            try {
                                File var19 = new File(var12, arg0);
                                if (var8 == 1 && !var19.exists()) {
                                    boolean var20 = var19.mkdir();
                                    if (!var20) {
                                        continue;
                                    }
                                }
                                File var21 = new File(var19, "main_file_cache.dat2");
                                if (var8 == 0 && !var21.exists()) {
                                    continue;
                                }
                                this.field3618 = new class59(var21, "rw", 52428800L);
                                this.field3624 = new class59[arg1];
                                for (int var22 = 0; var22 < arg1; var22++) {
                                    this.field3624[var22] = new class59(new File(var19, "main_file_cache.idx" + var22), "rw", 1048576L);
                                }
                                this.field3628 = new class59(new File(var19, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field3617 = this.field3627 = var19;
                            } catch (Exception var25) {
                                try {
                                    this.field3618.method497(-86);
                                    for (int var23 = 0; var23 < arg1; var23++) {
                                        this.field3624[var23].method497(-93);
                                    }
                                    this.field3628.method497(arg3 ^ 0x7B);
                                } catch (Exception var24) {
                                }
                                this.field3624 = null;
                                this.field3618 = this.field3628 = null;
                                this.field3617 = this.field3627 = null;
                            }
                        }
                    } catch (Exception var27) {
                    }
                    if (var5 && this.field3627 != null) {
                        return;
                    }
                }
            }
        }
        if (this.field3627 == null) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
    public final void method1182(int arg0) {
        synchronized (this) {
            this.field3622 = true;
            this.notifyAll();
        }
        try {
            this.field3620.join();
            int var3 = -19 % ((arg0 + 16) / 39);
        } catch (InterruptedException var8) {
        }
        if (this.field3618 != null) {
            try {
                this.field3618.method497(-126);
            } catch (IOException var7) {
            }
        }
        if (this.field3628 != null) {
            try {
                this.field3628.method497(-116);
            } catch (IOException var6) {
            }
        }
        if (this.field3624 == null) {
            return;
        }
        for (int var4 = 0; var4 < this.field3624.length; var4++) {
            if (this.field3624[var4] != null) {
                try {
                    this.field3624[var4].method497(-67);
                } catch (IOException var5) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ILjava/net/URL;)Ljc;")
    public final class65 method1183(int arg0, URL arg1) {
        if (arg0 != -6884) {
            this.method1185(-109, -118, 127, 119, null);
        }
        return this.method1185(0, 4, -53, 0, arg1);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(II)Ljc;")
    public final class65 method1184(int arg0, int arg1) {
        if (arg0 != -1) {
            this.field3620 = null;
        }
        return this.method1185(0, 3, arg0 - 94, arg1, null);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIILjava/lang/Object;)Ljc;")
    private final class65 method1185(int arg0, int arg1, int arg2, int arg3, Object arg4) {
        class65 var6 = new class65();
        var6.field1697 = arg3;
        var6.field1698 = arg1;
        var6.field1696 = arg4;
        synchronized (this) {
            if (arg2 >= -21) {
                this.field3622 = true;
            }
            if (this.field3619 == null) {
                this.field3619 = this.field3625 = var6;
            } else {
                this.field3619.field1694 = var6;
                this.field3619 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
    public class148(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
        field3633 = "1.1";
        field3616 = "Unknown";
        this.field3629 = arg1;
        try {
            field3616 = System.getProperty("java.vendor");
            field3633 = System.getProperty("java.version");
        } catch (Exception var10) {
        }
        try {
            field3631 = System.getProperty("user.home");
            if (field3631 != null) {
                field3631 = field3631 + "/";
            }
        } catch (Exception var9) {
        }
        if (field3631 == null) {
            field3631 = "~/";
        }
        try {
            this.field3623 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var8) {
        }
        try {
            if (arg1 == null) {
                field3621 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field3621 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var7) {
        }
        try {
            if (arg1 == null) {
                field3630 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field3630 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        if (arg0) {
            this.method1181(arg3, arg4, arg2, (byte) -46);
        }
        this.field3622 = false;
        this.field3620 = new Thread(this);
        this.field3620.setPriority(10);
        this.field3620.setDaemon(true);
        this.field3620.start();
    }
}
