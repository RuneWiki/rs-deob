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

@OriginalClass("client!ha")
public class class50 implements Runnable {

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "Lhe;")
    public class54 field1110 = null;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "Ljava/applet/Applet;")
    public Applet field1116 = null;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
    public int field1112 = 0;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "Z")
    private boolean field1117 = false;

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "Lhe;")
    public class54 field1123 = null;

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "Lvb;")
    private class136 field1121 = null;

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "Ljava/io/File;")
    public File field1127 = null;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "Lvb;")
    private class136 field1118 = null;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "Ljava/io/File;")
    private File field1113 = null;

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "Ljava/net/InetAddress;")
    private InetAddress field1122;

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "Ljava/lang/Thread;")
    private Thread field1129;

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "I")
    public static int field1126 = 3;

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "Lad;")
    private class5 field1128;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "Lma;")
    private class81 field1111;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "Ljava/lang/String;")
    public static String field1115;

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "Ljava/lang/String;")
    public static String field1124;

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "Ljava/lang/String;")
    private static String field1125;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1114;

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1119;

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "[Lhe;")
    public class54[] field1120;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;I)Lvb;")
    public final class136 method356(Class[] arg0, Class arg1, String arg2, int arg3) {
        if (arg3 != 0) {
            this.method360(44, 80);
        }
        return this.method367(0, 9, (byte) -110, 0, new Object[] { arg1, arg2, arg0 });
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/lang/String;III)V")
    private final void method357(String arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 1036) {
            this.method367(12, 31, (byte) -120, -100, null);
        }
        if (arg1 < 32 || arg1 > 34) {
            arg1 = 32;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", "/tmp/", field1125, "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
        boolean var7 = false;
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
                                    var7 = true;
                                    DataInputStream var18 = new DataInputStream(new FileInputStream(var14));
                                    this.field1112 = var18.readInt() + 1;
                                    var18.close();
                                }
                            } catch (Exception var26) {
                            }
                        }
                        if (this.field1113 == null) {
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
                                this.field1110 = new class54(var21, "rw", 52428800L);
                                this.field1120 = new class54[arg2];
                                for (int var22 = 0; var22 < arg2; var22++) {
                                    this.field1120[var22] = new class54(new File(var19, "main_file_cache.idx" + var22), "rw", 1048576L);
                                }
                                this.field1123 = new class54(new File(var19, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field1127 = this.field1113 = var19;
                            } catch (Exception var25) {
                                try {
                                    this.field1110.method380((byte) -50);
                                    for (int var23 = 0; var23 < arg2; var23++) {
                                        this.field1120[var23].method380((byte) -50);
                                    }
                                    this.field1123.method380((byte) -50);
                                } catch (Exception var24) {
                                }
                                this.field1127 = this.field1113 = null;
                                this.field1110 = this.field1123 = null;
                                this.field1120 = null;
                            }
                        }
                    } catch (Exception var27) {
                    }
                    if (var7 && this.field1113 != null) {
                        return;
                    }
                }
            }
        }
        if (this.field1113 == null) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lvb;")
    public final class136 method358(Runnable arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            field1125 = null;
        }
        return this.method367(0, 2, (byte) -110, arg1, arg0);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)Lvb;")
    public final class136 method359(int arg0) {
        if (arg0 != 8152) {
            this.field1128 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)Lvb;")
    public final class136 method360(int arg0, int arg1) {
        if (arg1 != 0) {
            this.method367(90, 94, (byte) -16, -122, null);
        }
        return this.method367(0, 1, (byte) -110, arg0, null);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(BLjava/net/URL;)Lvb;")
    public final class136 method361(byte arg0, URL arg1) {
        if (arg0 != -64) {
            field1126 = 127;
        }
        return this.method367(0, 4, (byte) -110, 0, arg1);
    }

    @OriginalMember(owner = "client!ha", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class136 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1117) {
                        return;
                    }
                    if (this.field1121 != null) {
                        var2 = this.field1121;
                        this.field1121 = this.field1121.field3128;
                        if (this.field1121 == null) {
                            this.field1118 = null;
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
                int var3 = var2.field3132;
                if (var3 == 1) {
                    var2.field3129 = new Socket(this.field1122, var2.field3133);
                } else if (var3 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field3130);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field3133);
                    var2.field3129 = var6;
                } else if (var3 == 4) {
                    var2.field3129 = new DataInputStream(((URL) var2.field3130).openStream());
                } else if (var3 == 9) {
                    Object[] var4 = (Object[]) var2.field3130;
                    var2.field3129 = ((Class) var4[0]).getDeclaredMethod((String) var4[1], (Class[]) var4[2]);
                } else if (var3 == 10) {
                    Object[] var5 = (Object[]) var2.field3130;
                    var2.field3129 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else {
                    throw new Exception();
                }
                var2.field3131 = 1;
            } catch (Exception var9) {
                var2.field3131 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(BLjava/lang/Class;Ljava/lang/String;)Lvb;")
    public final class136 method362(byte arg0, Class arg1, String arg2) {
        if (arg0 != 121) {
            this.field1116 = null;
        }
        return this.method367(0, 10, (byte) -110, 0, new Object[] { arg1, arg2 });
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)Lma;")
    public final class81 method363(int arg0) {
        if (arg0 <= 88) {
            this.method365(-74, true);
        }
        return this.field1111;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)Lad;")
    public final class5 method364(byte arg0) {
        int var2 = 55 % ((-arg0 - 53) / 63);
        return this.field1128;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IZ)Lvb;")
    public final class136 method365(int arg0, boolean arg1) {
        return arg1 ? this.method367(0, 3, (byte) -110, arg0, null) : null;
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)V")
    public final void method366(int arg0) {
        if (arg0 != 7904) {
            return;
        }
        synchronized (this) {
            this.field1117 = true;
            this.notifyAll();
        }
        try {
            this.field1129.join();
        } catch (InterruptedException var7) {
        }
        if (this.field1128 != null) {
            this.field1128.method32(9207);
        }
        if (this.field1110 != null) {
            try {
                this.field1110.method380((byte) -50);
            } catch (IOException var6) {
            }
        }
        if (this.field1123 != null) {
            try {
                this.field1123.method380((byte) -50);
            } catch (IOException var5) {
            }
        }
        if (this.field1120 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1120.length; var3++) {
            if (this.field1120[var3] != null) {
                try {
                    this.field1120[var3].method380((byte) -50);
                } catch (IOException var4) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIBILjava/lang/Object;)Lvb;")
    private final class136 method367(int arg0, int arg1, byte arg2, int arg3, Object arg4) {
        class136 var6 = new class136();
        var6.field3133 = arg3;
        var6.field3132 = arg1;
        var6.field3130 = arg4;
        synchronized (this) {
            if (arg2 != -110) {
                this.field1128 = null;
            }
            if (this.field1118 == null) {
                this.field1118 = this.field1121 = var6;
            } else {
                this.field1118.field3128 = var6;
                this.field1118 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(ZLjava/applet/Applet;Ljava/net/InetAddress;ILjava/lang/String;I)V")
    public class50(boolean arg0, Applet arg1, InetAddress arg2, int arg3, String arg4, int arg5) {
        field1124 = "Unknown";
        this.field1122 = arg2;
        this.field1116 = arg1;
        field1115 = "1.1";
        try {
            field1124 = System.getProperty("java.vendor");
            field1115 = System.getProperty("java.version");
        } catch (Exception var10) {
        }
        try {
            field1125 = System.getProperty("user.home");
            if (field1125 != null) {
                field1125 = field1125 + "/";
            }
        } catch (Exception var9) {
        }
        if (field1125 == null) {
            field1125 = "~/";
        }
        try {
            if (arg1 == null) {
                field1119 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field1119 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var8) {
        }
        try {
            if (arg1 == null) {
                field1114 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field1114 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var7) {
        }
        if (arg0) {
            this.method357(arg4, arg3, arg5, 1036);
        }
        this.field1117 = false;
        this.field1129 = new Thread(this);
        this.field1129.setPriority(10);
        this.field1129.setDaemon(true);
        this.field1129.start();
    }
}
