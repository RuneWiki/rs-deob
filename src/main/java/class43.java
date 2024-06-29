import java.applet.Applet;
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

@OriginalClass("client!g")
public class class43 implements Runnable {

    @OriginalMember(owner = "client!g", name = "h", descriptor = "Ljava/io/File;")
    private File field888 = null;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "Ljava/io/File;")
    public File field885 = null;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "I")
    public int field883 = 0;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "Lma;")
    private class81 field884 = null;

    @OriginalMember(owner = "client!g", name = "l", descriptor = "Lne;")
    public class91 field892 = null;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "Ljava/applet/Applet;")
    public Applet field882 = null;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "Lne;")
    public class91 field886 = null;

    @OriginalMember(owner = "client!g", name = "o", descriptor = "Lma;")
    private class81 field895 = null;

    @OriginalMember(owner = "client!g", name = "s", descriptor = "Z")
    private boolean field899 = false;

    @OriginalMember(owner = "client!g", name = "n", descriptor = "Ljava/net/InetAddress;")
    private InetAddress field894;

    @OriginalMember(owner = "client!g", name = "q", descriptor = "Ljava/lang/Thread;")
    private Thread field897;

    @OriginalMember(owner = "client!g", name = "i", descriptor = "I")
    public static int field889 = 3;

    @OriginalMember(owner = "client!g", name = "r", descriptor = "Led;")
    private class33 field898;

    @OriginalMember(owner = "client!g", name = "k", descriptor = "Lhd;")
    private class53 field891;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "Ljava/lang/String;")
    public static String field881;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "Ljava/lang/String;")
    public static String field887;

    @OriginalMember(owner = "client!g", name = "m", descriptor = "Ljava/lang/String;")
    private static String field893;

    @OriginalMember(owner = "client!g", name = "p", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field896;

    @OriginalMember(owner = "client!g", name = "t", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field900;

    @OriginalMember(owner = "client!g", name = "j", descriptor = "[Lne;")
    public class91[] field890;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V")
    public final void method299(int arg0) {
        synchronized (this) {
            this.field899 = true;
            this.notifyAll();
        }
        try {
            this.field897.join();
        } catch (InterruptedException var8) {
        }
        if (this.field891 != null) {
            this.field891.method380(false);
        }
        if (this.field886 != null) {
            try {
                this.field886.method700(124);
            } catch (IOException var7) {
            }
        }
        if (this.field892 != null) {
            try {
                this.field892.method700(117);
            } catch (IOException var6) {
            }
        }
        if (this.field890 != null) {
            for (int var3 = 0; var3 < this.field890.length; var3++) {
                if (this.field890[var3] != null) {
                    try {
                        this.field890[var3].method700(77);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        int var4 = 120 % ((arg0 + 65) / 60);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(II)Lma;")
    public final class81 method300(int arg0, int arg1) {
        if (arg0 != 0) {
            this.method300(-10, 44);
        }
        return this.method302(arg1, null, arg0 + 99, 0, 3);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/String;ILjava/lang/Class;)Lma;")
    public final class81 method301(Class[] arg0, String arg1, int arg2, Class arg3) {
        int var5 = -23 / ((-arg2 - 11) / 61);
        return this.method302(0, new Object[] { arg3, arg1, arg0 }, 76, 0, 9);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ILjava/lang/Object;III)Lma;")
    private final class81 method302(int arg0, Object arg1, int arg2, int arg3, int arg4) {
        class81 var6 = new class81();
        var6.field1824 = arg4;
        var6.field1821 = arg1;
        var6.field1825 = arg0;
        synchronized (this) {
            if (this.field884 == null) {
                this.field884 = this.field895 = var6;
            } else {
                this.field884.field1822 = var6;
                this.field884 = var6;
            }
            this.notify();
        }
        int var8 = 62 % ((17 - arg2) / 34);
        return var6;
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(I)Lhd;")
    public final class53 method303(int arg0) {
        int var2 = 114 % ((arg0 - 91) / 34);
        return this.field891;
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(II)Lma;")
    public final class81 method304(int arg0, int arg1) {
        if (arg0 != 0) {
            this.field895 = null;
        }
        return this.method302(arg1, null, -112, 0, 1);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IILjava/lang/String;B)V")
    private final void method305(int arg0, int arg1, String arg2, byte arg3) {
        if (arg0 < 32 || arg0 > 34) {
            arg0 = 32;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", "/tmp/", field893, "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
        boolean var7 = false;
        if (arg3 > -64) {
            this.method306(null, (byte) 60, null);
        }
        for (int var8 = 0; var8 < 2; var8++) {
            for (int var9 = 0; var9 < var6.length; var9++) {
                for (int var10 = 0; var10 < var5.length; var10++) {
                    try {
                        String var11 = var5[var10];
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
                        if (!var7) {
                            try {
                                File var14 = new File(var12, "uid.dat");
                                if (var8 == 1 && (!var14.exists() || var14.length() < 4L)) {
                                    Random var15 = new Random();
                                    int var16;
                                    for (var16 = -1; var16 == -1; var16 = var15.nextInt()) {
                                    }
                                    DataOutputStream var17 = new DataOutputStream(new FileOutputStream(var14));
                                    var17.writeInt(var16);
                                    var17.close();
                                }
                                if (var14.exists()) {
                                    var7 = true;
                                    DataInputStream var18 = new DataInputStream(new FileInputStream(var14));
                                    this.field883 = var18.readInt() + 1;
                                    var18.close();
                                }
                            } catch (Exception var26) {
                            }
                        }
                        if (this.field888 == null) {
                            try {
                                File var19 = new File(var12, arg2);
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
                                this.field886 = new class91(var21, "rw", 52428800L);
                                this.field890 = new class91[arg1];
                                for (int var22 = 0; var22 < arg1; var22++) {
                                    this.field890[var22] = new class91(new File(var19, "main_file_cache.idx" + var22), "rw", 1048576L);
                                }
                                this.field892 = new class91(new File(var19, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field885 = this.field888 = var19;
                            } catch (Exception var25) {
                                try {
                                    this.field886.method700(16);
                                    for (int var23 = 0; var23 < arg1; var23++) {
                                        this.field890[var23].method700(64);
                                    }
                                    this.field892.method700(52);
                                } catch (Exception var24) {
                                }
                                this.field890 = null;
                                this.field885 = this.field888 = null;
                                this.field886 = this.field892 = null;
                            }
                        }
                    } catch (Exception var27) {
                    }
                    if (var7 && this.field888 != null) {
                        return;
                    }
                }
            }
        }
        if (this.field888 == null) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Ljava/lang/Class;BLjava/lang/String;)Lma;")
    public final class81 method306(Class arg0, byte arg1, String arg2) {
        if (arg1 != -73) {
            this.field898 = null;
        }
        return this.method302(0, new Object[] { arg0, arg2 }, arg1 + 146, 0, 10);
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(I)Lma;")
    public final class81 method307(int arg0) {
        if (arg0 != 0) {
            this.field888 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ILjava/net/URL;)Lma;")
    public final class81 method308(int arg0, URL arg1) {
        if (arg0 != 0) {
            this.field884 = null;
        }
        return this.method302(0, arg1, -125, 0, 4);
    }

    @OriginalMember(owner = "client!g", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class81 var2;
            synchronized (this) {
                while (true) {
                    if (this.field899) {
                        return;
                    }
                    if (this.field895 != null) {
                        var2 = this.field895;
                        this.field895 = this.field895.field1822;
                        if (this.field895 == null) {
                            this.field884 = null;
                        }
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var10) {
                    }
                }
            }
            try {
                int var3 = var2.field1824;
                if (var3 == 1) {
                    var2.field1823 = new Socket(this.field894, var2.field1825);
                } else if (var3 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1821);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1825);
                    var2.field1823 = var6;
                } else if (var3 == 4) {
                    var2.field1823 = new DataInputStream(((URL) var2.field1821).openStream());
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field1821;
                    var2.field1823 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 10) {
                    Object[] var4 = (Object[]) var2.field1821;
                    var2.field1823 = ((Class) var4[0]).getDeclaredField((String) var4[1]);
                } else {
                    throw new Exception();
                }
                var2.field1826 = 1;
            } catch (Exception var9) {
                var2.field1826 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IBLjava/lang/Runnable;)Lma;")
    public final class81 method309(int arg0, byte arg1, Runnable arg2) {
        return arg1 >= -101 ? null : this.method302(arg0, arg2, -95, 0, 2);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(B)Led;")
    public final class33 method310(byte arg0) {
        if (arg0 != 114) {
            this.field890 = null;
        }
        return this.field898;
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(ZLjava/applet/Applet;Ljava/net/InetAddress;ILjava/lang/String;I)V")
    public class43(boolean arg0, Applet arg1, InetAddress arg2, int arg3, String arg4, int arg5) {
        this.field882 = arg1;
        field887 = "1.1";
        this.field894 = arg2;
        field881 = "Unknown";
        try {
            field881 = System.getProperty("java.vendor");
            field887 = System.getProperty("java.version");
        } catch (Exception var10) {
        }
        try {
            field893 = System.getProperty("user.home");
            if (field893 != null) {
                field893 = field893 + "/";
            }
        } catch (Exception var9) {
        }
        if (field893 == null) {
            field893 = "~/";
        }
        try {
            if (arg1 == null) {
                field896 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field896 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var8) {
        }
        try {
            if (arg1 == null) {
                field900 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field900 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var7) {
        }
        if (arg0) {
            this.method305(arg3, arg5, arg4, (byte) -86);
        }
        this.field899 = false;
        this.field897 = new Thread(this);
        this.field897.setPriority(10);
        this.field897.setDaemon(true);
        this.field897.start();
    }
}
