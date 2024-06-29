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

@OriginalClass("mapview!ia")
public class class16 implements Runnable {

    @OriginalMember(owner = "mapview!ia", name = "h", descriptor = "I")
    public int field185 = 0;

    @OriginalMember(owner = "mapview!ia", name = "d", descriptor = "Lb;")
    public class3 field181 = null;

    @OriginalMember(owner = "mapview!ia", name = "f", descriptor = "Lu;")
    private class37 field183 = null;

    @OriginalMember(owner = "mapview!ia", name = "i", descriptor = "Lb;")
    public class3 field186 = null;

    @OriginalMember(owner = "mapview!ia", name = "j", descriptor = "Ljava/applet/Applet;")
    public Applet field187 = null;

    @OriginalMember(owner = "mapview!ia", name = "o", descriptor = "Ljava/io/File;")
    private File field192 = null;

    @OriginalMember(owner = "mapview!ia", name = "n", descriptor = "Ljava/io/File;")
    public File field191 = null;

    @OriginalMember(owner = "mapview!ia", name = "r", descriptor = "Lu;")
    private class37 field195 = null;

    @OriginalMember(owner = "mapview!ia", name = "e", descriptor = "Z")
    private boolean field182 = false;

    @OriginalMember(owner = "mapview!ia", name = "m", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field190;

    @OriginalMember(owner = "mapview!ia", name = "p", descriptor = "Ljava/lang/Thread;")
    private Thread field193;

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "I")
    public static int field178 = 3;

    @OriginalMember(owner = "mapview!ia", name = "c", descriptor = "Ljava/lang/String;")
    public static String field180;

    @OriginalMember(owner = "mapview!ia", name = "k", descriptor = "Ljava/lang/String;")
    private static String field188;

    @OriginalMember(owner = "mapview!ia", name = "l", descriptor = "Ljava/lang/String;")
    public static String field189;

    @OriginalMember(owner = "mapview!ia", name = "g", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field184;

    @OriginalMember(owner = "mapview!ia", name = "q", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field194;

    @OriginalMember(owner = "mapview!ia", name = "b", descriptor = "[Lb;")
    public class3[] field179;

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(ILjava/lang/Runnable;B)Lu;", line = 4)
    public final class37 method100(int arg0, Runnable arg1, byte arg2) {
        return arg2 <= 95 ? (class37) null : this.method101(2, 0, arg1, false, arg0);
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(IILjava/lang/Object;ZI)Lu;", line = 33)
    private final class37 method101(int arg0, int arg1, Object arg2, boolean arg3, int arg4) {
        if (arg3) {
            this.method107(null, 63);
        }
        class37 var6 = new class37();
        var6.field457 = arg2;
        var6.field462 = arg4;
        var6.field461 = arg0;
        synchronized (this) {
            if (this.field183 == null) {
                this.field183 = this.field195 = var6;
            } else {
                this.field183.field459 = var6;
                this.field183 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Lu;", line = 63)
    public final class37 method102(Class arg0, int arg1, String arg2) {
        if (arg1 != 3) {
            this.run();
        }
        return this.method101(10, 0, new Object[] { arg0, arg2 }, false, 0);
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Class;[Ljava/lang/Class;)Lu;", line = 79)
    public final class37 method103(String arg0, int arg1, Class arg2, Class[] arg3) {
        if (arg1 != 9) {
            this.method105(-54, (byte) 92);
        }
        return this.method101(9, 0, new Object[] { arg2, arg0, arg3 }, false, 0);
    }

    @OriginalMember(owner = "mapview!ia", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V", line = 513)
    public class16(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
        this.field187 = arg1;
        field180 = "1.1";
        field189 = "Unknown";
        try {
            field189 = System.getProperty("java.vendor");
            field180 = System.getProperty("java.version");
        } catch (Exception var15) {
        }
        try {
            field188 = System.getProperty("user.home");
            if (field188 != null) {
                field188 = field188 + "/";
            }
        } catch (Exception var14) {
        }
        if (field188 == null) {
            field188 = "~/";
        }
        try {
            this.field190 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var13) {
        }
        try {
            if (arg1 == null) {
                field194 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field194 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var12) {
        }
        try {
            if (arg1 == null) {
                field184 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field184 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var11) {
        }
        if (arg0) {
            this.method108(2, arg3, arg2, arg4);
        }
        this.field182 = false;
        this.field193 = new Thread(this);
        this.field193.setPriority(10);
        this.field193.setDaemon(true);
        this.field193.start();
    }

    @OriginalMember(owner = "mapview!ia", name = "run", descriptor = "()V", line = 95)
    public final void run() {
        while (true) {
            class37 var2;
            synchronized (this) {
                while (true) {
                    if (this.field182) {
                        return;
                    }
                    if (this.field195 != null) {
                        var2 = this.field195;
                        this.field195 = this.field195.field459;
                        if (this.field195 == null) {
                            this.field183 = null;
                        }
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var13) {
                    }
                }
            }
            try {
                int var5 = var2.field461;
                if (var5 == 1) {
                    var2.field460 = new Socket(InetAddress.getByName((String) var2.field457), var2.field462);
                } else if (var5 == 2) {
                    Thread var8 = new Thread((Runnable) var2.field457);
                    var8.setDaemon(true);
                    var8.start();
                    var8.setPriority(var2.field462);
                    var2.field460 = var8;
                } else if (var5 == 4) {
                    var2.field460 = new DataInputStream(((URL) var2.field457).openStream());
                } else if (var5 == 9) {
                    Object[] var7 = (Object[]) var2.field457;
                    var2.field460 = ((Class) var7[0]).getDeclaredMethod((String) var7[1], (Class[]) var7[2]);
                } else if (var5 == 10) {
                    Object[] var6 = (Object[]) var2.field457;
                    var2.field460 = ((Class) var6[0]).getDeclaredField((String) var6[1]);
                } else {
                    throw new Exception();
                }
                var2.field458 = 1;
            } catch (ThreadDeath var11) {
                throw var11;
            } catch (Throwable var12) {
                var2.field458 = 2;
            }
        }
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(B)V", line = 192)
    public final void method104(byte arg0) {
        synchronized (this) {
            this.field182 = true;
            if (arg0 != -28) {
                return;
            }
            this.notifyAll();
        }
        try {
            this.field193.join();
        } catch (InterruptedException var12) {
        }
        if (this.field186 != null) {
            try {
                this.field186.method21((byte) -120);
            } catch (IOException var11) {
            }
        }
        if (this.field181 != null) {
            try {
                this.field181.method21((byte) -65);
            } catch (IOException var10) {
            }
        }
        if (this.field179 == null) {
            return;
        }
        for (int var7 = 0; var7 < this.field179.length; var7++) {
            if (this.field179[var7] != null) {
                try {
                    this.field179[var7].method21((byte) -95);
                } catch (IOException var9) {
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(IB)Lu;", line = 243)
    public final class37 method105(int arg0, byte arg1) {
        if (arg1 != -25) {
            this.field195 = null;
        }
        return this.method101(3, 0, null, false, arg0);
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(Ljava/lang/String;II)Lu;", line = 256)
    public final class37 method106(String arg0, int arg1, int arg2) {
        if (arg1 >= -62) {
            this.field190 = null;
        }
        return this.method101(1, 0, arg0, false, arg2);
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(Ljava/net/URL;I)Lu;", line = 280)
    public final class37 method107(URL arg0, int arg1) {
        if (arg1 != -1555) {
            field184 = null;
        }
        return this.method101(4, 0, arg0, false, 0);
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(ILjava/lang/String;II)V", line = 325)
    private final void method108(int arg0, String arg1, int arg2, int arg3) {
        if (arg2 < 32 || arg2 > 34) {
            arg2 = 32;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", "/tmp/", field188, "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
        boolean var7 = false;
        int var8 = 0;
        if (arg0 != 2) {
            return;
        }
        while (var8 < 2) {
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
                                    this.field185 = var18.readInt() + 1;
                                    var18.close();
                                }
                            } catch (Exception var30) {
                            }
                        }
                        if (this.field192 == null) {
                            try {
                                File var20 = new File(var12, arg1);
                                if (var8 == 1 && !var20.exists()) {
                                    boolean var21 = var20.mkdir();
                                    if (!var21) {
                                        continue;
                                    }
                                }
                                File var22 = new File(var20, "main_file_cache.dat2");
                                if (var8 == 0 && !var22.exists()) {
                                    continue;
                                }
                                this.field186 = new class3(var22, "rw", 52428800L);
                                this.field179 = new class3[arg3];
                                for (int var23 = 0; var23 < arg3; var23++) {
                                    this.field179[var23] = new class3(new File(var20, "main_file_cache.idx" + var23), "rw", 1048576L);
                                }
                                this.field181 = new class3(new File(var20, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field191 = this.field192 = var20;
                            } catch (Exception var29) {
                                try {
                                    this.field186.method21((byte) -68);
                                    for (int var25 = 0; var25 < arg3; var25++) {
                                        this.field179[var25].method21((byte) -91);
                                    }
                                    this.field181.method21((byte) -59);
                                } catch (Exception var28) {
                                }
                                this.field191 = this.field192 = null;
                                this.field186 = this.field181 = null;
                                this.field179 = null;
                            }
                        }
                    } catch (Exception var31) {
                    }
                    if (var7 && this.field192 != null) {
                        return;
                    }
                }
            }
            var8++;
        }
        if (this.field192 == null) {
            throw new RuntimeException();
        }
    }
}
