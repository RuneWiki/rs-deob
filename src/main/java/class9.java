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

@OriginalClass("client!ba")
public class class9 implements Runnable {

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "Ljava/applet/Applet;")
    public Applet field187 = null;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "Z")
    private boolean field184 = false;

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "Ljava/io/File;")
    private File field189 = null;

    @OriginalMember(owner = "client!ba", name = "m", descriptor = "I")
    public int field194 = 0;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "Leb;")
    private class31 field183 = null;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "Lbb;")
    public class10 field186 = null;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "Leb;")
    private class31 field182 = null;

    @OriginalMember(owner = "client!ba", name = "s", descriptor = "Lbb;")
    public class10 field200 = null;

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "Ljava/io/File;")
    public File field193 = null;

    @OriginalMember(owner = "client!ba", name = "q", descriptor = "Ljava/net/InetAddress;")
    private InetAddress field198;

    @OriginalMember(owner = "client!ba", name = "r", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field199;

    @OriginalMember(owner = "client!ba", name = "t", descriptor = "Ljava/lang/Thread;")
    private Thread field201;

    @OriginalMember(owner = "client!ba", name = "n", descriptor = "I")
    public static int field195 = 3;

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "Ln;")
    private class89 field191;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "Ljava/lang/String;")
    private static String field185;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "Ljava/lang/String;")
    public static String field188;

    @OriginalMember(owner = "client!ba", name = "p", descriptor = "Ljava/lang/String;")
    public static String field197;

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field192;

    @OriginalMember(owner = "client!ba", name = "o", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field196;

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "[Lbb;")
    public class10[] field190;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IILjava/lang/Object;II)Leb;")
    private final class31 method61(int arg0, int arg1, Object arg2, int arg3, int arg4) {
        class31 var6 = new class31();
        if (arg0 != 3) {
            this.method63(-65, (byte) -105);
        }
        var6.field939 = arg3;
        var6.field936 = arg2;
        var6.field941 = arg4;
        synchronized (this) {
            if (this.field183 == null) {
                this.field183 = this.field182 = var6;
            } else {
                this.field183.field938 = var6;
                this.field183 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!ba", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class31 var2;
            synchronized (this) {
                while (true) {
                    if (this.field184) {
                        return;
                    }
                    if (this.field182 != null) {
                        var2 = this.field182;
                        this.field182 = this.field182.field938;
                        if (this.field182 == null) {
                            this.field183 = null;
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
                int var3 = var2.field939;
                if (var3 == 1) {
                    var2.field937 = new Socket(this.field198, var2.field941);
                } else if (var3 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field936);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field941);
                    var2.field937 = var6;
                } else if (var3 == 4) {
                    var2.field937 = new DataInputStream(((URL) var2.field936).openStream());
                } else if (var3 == 9) {
                    Object[] var4 = (Object[]) var2.field936;
                    var2.field937 = ((Class) var4[0]).getDeclaredMethod((String) var4[1], (Class[]) var4[2]);
                } else if (var3 == 10) {
                    Object[] var5 = (Object[]) var2.field936;
                    var2.field937 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else {
                    throw new Exception();
                }
                var2.field940 = 1;
            } catch (Exception var9) {
                var2.field940 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(II)Leb;")
    public final class31 method62(int arg0, int arg1) {
        if (arg1 != 17266) {
            this.field198 = null;
        }
        return this.method61(3, 0, null, 1, arg0);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IB)Leb;")
    public final class31 method63(int arg0, byte arg1) {
        if (arg1 <= 100) {
            this.field201 = null;
        }
        return this.method61(3, 0, null, 3, arg0);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IILjava/lang/String;I)V")
    private final void method64(int arg0, int arg1, String arg2, int arg3) {
        if (arg0 > -81) {
            return;
        }
        if (arg1 < 32 || arg1 > 34) {
            arg1 = 32;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", "/tmp/", field185, "" };
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
                                    this.field194 = var18.readInt() + 1;
                                    var18.close();
                                }
                            } catch (Exception var26) {
                            }
                        }
                        if (this.field189 == null) {
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
                                this.field200 = new class10(var21, "rw", 52428800L);
                                this.field190 = new class10[arg3];
                                for (int var22 = 0; var22 < arg3; var22++) {
                                    this.field190[var22] = new class10(new File(var19, "main_file_cache.idx" + var22), "rw", 1048576L);
                                }
                                this.field186 = new class10(new File(var19, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field193 = this.field189 = var19;
                            } catch (Exception var25) {
                                try {
                                    this.field200.method75(-30200);
                                    for (int var23 = 0; var23 < arg3; var23++) {
                                        this.field190[var23].method75(-30200);
                                    }
                                    this.field186.method75(-30200);
                                } catch (Exception var24) {
                                }
                                this.field190 = null;
                                this.field200 = this.field186 = null;
                                this.field193 = this.field189 = null;
                            }
                        }
                    } catch (Exception var27) {
                    }
                    if (var7 && this.field189 != null) {
                        return;
                    }
                }
            }
        }
        if (this.field189 == null) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)Ln;")
    public final class89 method65(byte arg0) {
        if (arg0 != -108) {
            this.method64(-6, -11, null, -39);
        }
        return this.field191;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILjava/lang/Runnable;Z)Leb;")
    public final class31 method66(int arg0, Runnable arg1, boolean arg2) {
        if (!arg2) {
            this.method69(null, (byte) 66, null, null);
        }
        return this.method61(3, 0, arg1, 2, arg0);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILjava/net/URL;)Leb;")
    public final class31 method67(int arg0, URL arg1) {
        int var3 = -18 % ((arg0 - 79) / 33);
        return this.method61(3, 0, arg1, 4, 0);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Leb;")
    public final class31 method68(int arg0, String arg1, Class arg2) {
        if (arg0 != 0) {
            field185 = null;
        }
        return this.method61(3, 0, new Object[] { arg2, arg1 }, 10, 0);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Ljava/lang/Class;BLjava/lang/String;[Ljava/lang/Class;)Leb;")
    public final class31 method69(Class arg0, byte arg1, String arg2, Class[] arg3) {
        int var5 = -53 / ((-arg1 - 36) / 37);
        return this.method61(3, 0, new Object[] { arg0, arg2, arg3 }, 9, 0);
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(ZLjava/applet/Applet;Ljava/net/InetAddress;ILjava/lang/String;I)V")
    public class9(boolean arg0, Applet arg1, InetAddress arg2, int arg3, String arg4, int arg5) {
        this.field198 = arg2;
        field197 = "Unknown";
        this.field187 = arg1;
        field188 = "1.1";
        try {
            field197 = System.getProperty("java.vendor");
            field188 = System.getProperty("java.version");
        } catch (Exception var11) {
        }
        try {
            field185 = System.getProperty("user.home");
            if (field185 != null) {
                field185 = field185 + "/";
            }
        } catch (Exception var10) {
        }
        if (field185 == null) {
            field185 = "~/";
        }
        try {
            this.field199 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var9) {
        }
        try {
            if (arg1 == null) {
                field196 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field196 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var8) {
        }
        try {
            if (arg1 == null) {
                field192 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field192 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var7) {
        }
        if (arg0) {
            this.method64(-109, arg3, arg4, arg5);
        }
        this.field184 = false;
        this.field201 = new Thread(this);
        this.field201.setPriority(10);
        this.field201.setDaemon(true);
        this.field201.start();
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(B)V")
    public final void method70(byte arg0) {
        synchronized (this) {
            this.field184 = true;
            this.notifyAll();
        }
        try {
            this.field201.join();
        } catch (InterruptedException var7) {
        }
        if (this.field200 != null) {
            try {
                this.field200.method75(-30200);
            } catch (IOException var6) {
            }
        }
        if (this.field186 != null) {
            try {
                this.field186.method75(arg0 - 30129);
            } catch (IOException var5) {
            }
        }
        if (this.field190 != null) {
            for (int var3 = 0; var3 < this.field190.length; var3++) {
                if (this.field190[var3] != null) {
                    try {
                        this.field190[var3].method75(-30200);
                    } catch (IOException var4) {
                    }
                }
            }
        }
        if (arg0 == -71) {
            ;
        }
    }
}
