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

@OriginalClass("client!we")
public class class147 implements Runnable {

    @OriginalMember(owner = "client!we", name = "d", descriptor = "Lmc;")
    private class85 field3605 = null;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "Lmc;")
    private class85 field3606 = null;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "Lub;")
    public class132 field3609 = null;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "Ljava/applet/Applet;")
    public Applet field3610 = null;

    @OriginalMember(owner = "client!we", name = "o", descriptor = "Lub;")
    public class132 field3616 = null;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "Ljava/io/File;")
    public File field3607 = null;

    @OriginalMember(owner = "client!we", name = "p", descriptor = "Z")
    private boolean field3617 = false;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "I")
    public int field3608 = 0;

    @OriginalMember(owner = "client!we", name = "q", descriptor = "Ljava/io/File;")
    private File field3618 = null;

    @OriginalMember(owner = "client!we", name = "n", descriptor = "Ljava/net/InetAddress;")
    private InetAddress field3615;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "Ljava/lang/Thread;")
    private Thread field3604;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "I")
    public static int field3613 = 3;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "Llb;")
    private class78 field3602;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "Ljava/lang/String;")
    public static String field3603;

    @OriginalMember(owner = "client!we", name = "k", descriptor = "Ljava/lang/String;")
    public static String field3612;

    @OriginalMember(owner = "client!we", name = "m", descriptor = "Ljava/lang/String;")
    private static String field3614;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field3611;

    @OriginalMember(owner = "client!we", name = "r", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field3619;

    @OriginalMember(owner = "client!we", name = "s", descriptor = "[Lub;")
    public class132[] field3620;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I[Ljava/lang/Class;)Lmc;")
    public final class85 method1193(Class arg0, String arg1, int arg2, Class[] arg3) {
        return arg2 == 7 ? this.method1202(-1, 9, new Object[] { arg0, arg1, arg3 }, 0, 0) : null;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Z)Llb;")
    public final class78 method1194(boolean arg0) {
        return arg0 ? null : this.field3602;
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(Z)V")
    public final void method1195(boolean arg0) {
        synchronized (this) {
            this.field3617 = arg0;
            this.notifyAll();
        }
        try {
            this.field3604.join();
        } catch (InterruptedException var7) {
        }
        if (this.field3609 != null) {
            try {
                this.field3609.method1066((byte) 114);
            } catch (IOException var6) {
            }
        }
        if (this.field3616 != null) {
            try {
                this.field3616.method1066((byte) 90);
            } catch (IOException var5) {
            }
        }
        if (this.field3620 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field3620.length; var3++) {
            if (this.field3620[var3] != null) {
                try {
                    this.field3620[var3].method1066((byte) 57);
                } catch (IOException var4) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(BI)Lmc;")
    public final class85 method1196(byte arg0, int arg1) {
        if (arg0 > -74) {
            this.field3620 = null;
        }
        return this.method1202(-1, 3, null, 0, arg1);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/net/URL;B)Lmc;")
    public final class85 method1197(URL arg0, byte arg1) {
        return arg1 < 14 ? null : this.method1202(-1, 4, arg0, 0, 0);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/lang/Runnable;ZI)Lmc;")
    public final class85 method1198(Runnable arg0, boolean arg1, int arg2) {
        return arg1 ? null : this.method1202(-1, 2, arg0, 0, arg2);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILjava/lang/String;IB)V")
    private final void method1199(int arg0, String arg1, int arg2, byte arg3) {
        if (arg0 < 32 || arg0 > 34) {
            arg0 = 32;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", "/tmp/", field3614, "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
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
                                    this.field3608 = var18.readInt() + 1;
                                    var18.close();
                                }
                            } catch (Exception var26) {
                            }
                        }
                        if (this.field3618 == null) {
                            try {
                                File var19 = new File(var12, arg1);
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
                                this.field3609 = new class132(var21, "rw", 52428800L);
                                this.field3620 = new class132[arg2];
                                for (int var22 = 0; var22 < arg2; var22++) {
                                    this.field3620[var22] = new class132(new File(var19, "main_file_cache.idx" + var22), "rw", 1048576L);
                                }
                                this.field3616 = new class132(new File(var19, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field3607 = this.field3618 = var19;
                            } catch (Exception var25) {
                                try {
                                    this.field3609.method1066((byte) 29);
                                    for (int var23 = 0; var23 < arg2; var23++) {
                                        this.field3620[var23].method1066((byte) 27);
                                    }
                                    this.field3616.method1066((byte) 87);
                                } catch (Exception var24) {
                                }
                                this.field3609 = this.field3616 = null;
                                this.field3607 = this.field3618 = null;
                                this.field3620 = null;
                            }
                        }
                    } catch (Exception var27) {
                    }
                    if (var7 && this.field3618 != null) {
                        return;
                    }
                }
            }
        }
        if (arg3 == -80 && this.field3618 == null) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IB)Lmc;")
    public final class85 method1200(int arg0, byte arg1) {
        if (arg1 != -92) {
            this.method1195(true);
        }
        return this.method1202(-1, 1, null, 0, arg0);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;B)Lmc;")
    public final class85 method1201(String arg0, Class arg1, byte arg2) {
        if (arg2 != -71) {
            this.run();
        }
        return this.method1202(-1, 10, new Object[] { arg1, arg0 }, 0, 0);
    }

    @OriginalMember(owner = "client!we", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class85 var2;
            synchronized (this) {
                while (true) {
                    if (this.field3617) {
                        return;
                    }
                    if (this.field3605 != null) {
                        var2 = this.field3605;
                        this.field3605 = this.field3605.field2114;
                        if (this.field3605 == null) {
                            this.field3606 = null;
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
                int var3 = var2.field2115;
                if (var3 == 1) {
                    var2.field2118 = new Socket(this.field3615, var2.field2113);
                } else if (var3 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2116);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2113);
                    var2.field2118 = var6;
                } else if (var3 == 4) {
                    var2.field2118 = new DataInputStream(((URL) var2.field2116).openStream());
                } else if (var3 == 9) {
                    Object[] var4 = (Object[]) var2.field2116;
                    var2.field2118 = ((Class) var4[0]).getDeclaredMethod((String) var4[1], (Class[]) var4[2]);
                } else if (var3 == 10) {
                    Object[] var5 = (Object[]) var2.field2116;
                    var2.field2118 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else {
                    throw new Exception();
                }
                var2.field2117 = 1;
            } catch (Exception var9) {
                var2.field2117 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(ZLjava/applet/Applet;Ljava/net/InetAddress;ILjava/lang/String;I)V")
    public class147(boolean arg0, Applet arg1, InetAddress arg2, int arg3, String arg4, int arg5) {
        this.field3610 = arg1;
        field3603 = "Unknown";
        this.field3615 = arg2;
        field3612 = "1.1";
        try {
            field3603 = System.getProperty("java.vendor");
            field3612 = System.getProperty("java.version");
        } catch (Exception var10) {
        }
        try {
            field3614 = System.getProperty("user.home");
            if (field3614 != null) {
                field3614 = field3614 + "/";
            }
        } catch (Exception var9) {
        }
        if (field3614 == null) {
            field3614 = "~/";
        }
        try {
            if (arg1 == null) {
                field3619 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field3619 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var8) {
        }
        try {
            if (arg1 == null) {
                field3611 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field3611 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var7) {
        }
        if (arg0) {
            this.method1199(arg3, arg4, arg5, (byte) -80);
        }
        this.field3617 = false;
        this.field3604 = new Thread(this);
        this.field3604.setPriority(10);
        this.field3604.setDaemon(true);
        this.field3604.start();
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IILjava/lang/Object;II)Lmc;")
    private final class85 method1202(int arg0, int arg1, Object arg2, int arg3, int arg4) {
        class85 var6 = new class85();
        var6.field2116 = arg2;
        var6.field2115 = arg1;
        var6.field2113 = arg4;
        synchronized (this) {
            if (this.field3606 == null) {
                this.field3606 = this.field3605 = var6;
            } else {
                this.field3606.field2114 = var6;
                this.field3606 = var6;
            }
            if (arg0 != -1) {
                this.method1193(null, null, 36, null);
            }
            this.notify();
            return var6;
        }
    }
}
