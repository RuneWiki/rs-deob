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

@OriginalClass("client!fe")
public class class41 implements Runnable {

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "Lcf;")
    private class21 field943 = null;

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "Ljava/io/File;")
    public File field949 = null;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "Ljava/io/File;")
    private File field944 = null;

    @OriginalMember(owner = "client!fe", name = "l", descriptor = "Z")
    private boolean field951 = false;

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "Lkd;")
    public class73 field948 = null;

    @OriginalMember(owner = "client!fe", name = "r", descriptor = "Ljava/applet/Applet;")
    public Applet field957 = null;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "Lcf;")
    private class21 field941 = null;

    @OriginalMember(owner = "client!fe", name = "o", descriptor = "Lkd;")
    public class73 field954 = null;

    @OriginalMember(owner = "client!fe", name = "s", descriptor = "I")
    public int field958 = 0;

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field946;

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "Ljava/lang/Thread;")
    private Thread field947;

    @OriginalMember(owner = "client!fe", name = "q", descriptor = "I")
    public static int field956 = 3;

    @OriginalMember(owner = "client!fe", name = "k", descriptor = "Lwd;")
    private class154 field950;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "Ljava/lang/String;")
    public static String field940;

    @OriginalMember(owner = "client!fe", name = "m", descriptor = "Ljava/lang/String;")
    private static String field952;

    @OriginalMember(owner = "client!fe", name = "p", descriptor = "Ljava/lang/String;")
    public static String field955;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field942;

    @OriginalMember(owner = "client!fe", name = "n", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field953;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "[Lkd;")
    public class73[] field945;

    @OriginalMember(owner = "client!fe", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class21 var2;
            synchronized (this) {
                while (true) {
                    if (this.field951) {
                        return;
                    }
                    if (this.field941 != null) {
                        var2 = this.field941;
                        this.field941 = this.field941.field472;
                        if (this.field941 == null) {
                            this.field943 = null;
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
                int var3 = var2.field474;
                if (var3 == 1) {
                    var2.field473 = new Socket(InetAddress.getByName((String) var2.field470), var2.field475);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field470);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field475);
                    var2.field473 = var4;
                } else if (var3 == 4) {
                    var2.field473 = new DataInputStream(((URL) var2.field470).openStream());
                } else if (var3 == 8) {
                    Object[] var5 = (Object[]) var2.field470;
                    var2.field473 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 9) {
                    Object[] var6 = (Object[]) var2.field470;
                    var2.field473 = ((Class) var6[0]).getDeclaredField((String) var6[1]);
                } else {
                    throw new Exception();
                }
                var2.field471 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field471 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)Lwd;")
    public final class154 method302(byte arg0) {
        if (arg0 <= 58) {
            this.method306(null, (byte) -8);
        }
        return this.field950;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(BI)Lcf;")
    public final class21 method303(byte arg0, int arg1) {
        int var3 = -120 / ((-arg0 - 80) / 33);
        return this.method309(arg1, 0, null, 5, 3);
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(B)V")
    public final void method304(byte arg0) {
        synchronized (this) {
            this.field951 = true;
            this.notifyAll();
        }
        try {
            this.field947.join();
        } catch (InterruptedException var7) {
        }
        if (arg0 <= 87) {
            this.method302((byte) 10);
        }
        if (this.field954 != null) {
            try {
                this.field954.method610((byte) -86);
            } catch (IOException var6) {
            }
        }
        if (this.field948 != null) {
            try {
                this.field948.method610((byte) -126);
            } catch (IOException var5) {
            }
        }
        if (this.field945 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field945.length; var3++) {
            if (this.field945[var3] != null) {
                try {
                    this.field945[var3].method610((byte) -101);
                } catch (IOException var4) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/Class;ILjava/lang/String;)Lcf;")
    public final class21 method305(Class[] arg0, Class arg1, int arg2, String arg3) {
        int var5 = -98 / ((arg2 + 37) / 54);
        return this.method309(0, 0, new Object[] { arg1, arg3, arg0 }, 5, 8);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Ljava/net/URL;B)Lcf;")
    public final class21 method306(URL arg0, byte arg1) {
        if (arg1 != -48) {
            field952 = null;
        }
        return this.method309(0, 0, arg0, arg1 + 53, 4);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Lcf;")
    public final class21 method307(Class arg0, int arg1, String arg2) {
        if (arg1 != -25357) {
            this.method308(null, false, -69);
        }
        return this.method309(0, 0, new Object[] { arg0, arg2 }, 5, 9);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Ljava/lang/String;ZI)Lcf;")
    public final class21 method308(String arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.field946 = null;
        }
        return this.method309(arg2, 0, arg0, 5, 1);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IILjava/lang/Object;II)Lcf;")
    private final class21 method309(int arg0, int arg1, Object arg2, int arg3, int arg4) {
        class21 var6 = new class21();
        var6.field475 = arg0;
        var6.field474 = arg4;
        var6.field470 = arg2;
        synchronized (this) {
            if (arg3 != 5) {
                this.method309(-72, -33, null, -70, -55);
            }
            if (this.field943 == null) {
                this.field943 = this.field941 = var6;
            } else {
                this.field943.field472 = var6;
                this.field943 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Ljava/lang/Runnable;IB)Lcf;")
    public final class21 method310(Runnable arg0, int arg1, byte arg2) {
        if (arg2 != -1) {
            this.field954 = null;
        }
        return this.method309(arg1, 0, arg0, 5, 2);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILjava/lang/String;II)V")
    private final void method311(int arg0, String arg1, int arg2, int arg3) {
        if (arg3 < 32 || arg3 > 34) {
            arg3 = 32;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field952, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg3, ".file_store_" + arg3 };
        boolean var7 = false;
        for (int var8 = arg2; var8 < 2; var8++) {
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
                                    this.field958 = var18.readInt() + 1;
                                    var18.close();
                                }
                            } catch (Exception var26) {
                            }
                        }
                        if (this.field944 == null) {
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
                                this.field954 = new class73(var21, "rw", 52428800L);
                                this.field945 = new class73[arg0];
                                for (int var22 = 0; var22 < arg0; var22++) {
                                    this.field945[var22] = new class73(new File(var19, "main_file_cache.idx" + var22), "rw", 1048576L);
                                }
                                this.field948 = new class73(new File(var19, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field949 = this.field944 = var19;
                            } catch (Exception var25) {
                                try {
                                    this.field954.method610((byte) -103);
                                    for (int var23 = 0; var23 < arg0; var23++) {
                                        this.field945[var23].method610((byte) -94);
                                    }
                                    this.field948.method610((byte) -87);
                                } catch (Exception var24) {
                                }
                                this.field949 = this.field944 = null;
                                this.field945 = null;
                                this.field954 = this.field948 = null;
                            }
                        }
                    } catch (Exception var27) {
                    }
                    if (var7 && this.field944 != null) {
                        return;
                    }
                }
            }
        }
        if (this.field944 == null) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
    public class41(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
        this.field957 = arg1;
        field940 = "Unknown";
        field955 = "1.1";
        try {
            field940 = System.getProperty("java.vendor");
            field955 = System.getProperty("java.version");
        } catch (Exception var10) {
        }
        try {
            field952 = System.getProperty("user.home");
            if (field952 != null) {
                field952 = field952 + "/";
            }
        } catch (Exception var9) {
        }
        if (field952 == null) {
            field952 = "~/";
        }
        try {
            this.field946 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var8) {
        }
        try {
            if (arg1 == null) {
                field953 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field953 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var7) {
        }
        try {
            if (arg1 == null) {
                field942 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field942 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        if (arg0) {
            this.method311(arg4, arg3, 0, arg2);
        }
        this.field951 = false;
        this.field947 = new Thread(this);
        this.field947.setPriority(10);
        this.field947.setDaemon(true);
        this.field947.start();
    }
}
