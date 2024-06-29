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

@OriginalClass("client!df")
public class class28 implements Runnable {

    @OriginalMember(owner = "client!df", name = "c", descriptor = "Lcf;")
    private class21 field642 = null;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "Ljava/io/File;")
    public File field640 = null;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "Loa;")
    public class98 field647 = null;

    @OriginalMember(owner = "client!df", name = "l", descriptor = "Ljava/applet/Applet;")
    public Applet field651 = null;

    @OriginalMember(owner = "client!df", name = "k", descriptor = "Lcf;")
    private class21 field650 = null;

    @OriginalMember(owner = "client!df", name = "p", descriptor = "Loa;")
    public class98 field655 = null;

    @OriginalMember(owner = "client!df", name = "o", descriptor = "Ljava/io/File;")
    private File field654 = null;

    @OriginalMember(owner = "client!df", name = "s", descriptor = "Loa;")
    public class98 field658 = null;

    @OriginalMember(owner = "client!df", name = "q", descriptor = "Z")
    private boolean field656 = false;

    @OriginalMember(owner = "client!df", name = "j", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field649;

    @OriginalMember(owner = "client!df", name = "r", descriptor = "Ljava/lang/Thread;")
    private Thread field657;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "I")
    public static int field646 = 3;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "Lic;")
    private class59 field641;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "Ljava/lang/String;")
    public static String field643;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "Ljava/lang/String;")
    public static String field645;

    @OriginalMember(owner = "client!df", name = "n", descriptor = "Ljava/lang/String;")
    private static String field653;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field644;

    @OriginalMember(owner = "client!df", name = "i", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field648;

    @OriginalMember(owner = "client!df", name = "m", descriptor = "[Loa;")
    public class98[] field652;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IBILjava/lang/String;)V")
    private final void method244(int arg0, byte arg1, int arg2, String arg3) {
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field653, "/tmp/", "" };
        if (arg0 < 32 || arg0 > 34) {
            arg0 = 32;
        }
        String[] var6 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < var6.length; var8++) {
                for (int var9 = 0; var9 < var5.length; var9++) {
                    try {
                        String var10 = var5[var9];
                        if (var10.length() > 0 && !(new File(var10)).exists()) {
                            continue;
                        }
                        File var11 = new File(var10 + var6[var8]);
                        if (var7 == 1 && !var11.exists()) {
                            boolean var12 = var11.mkdir();
                            if (!var12) {
                                continue;
                            }
                        }
                        if (this.field647 == null) {
                            try {
                                File var13 = new File(var11, "random.dat");
                                if (var7 == 1 || var13.exists()) {
                                    this.field647 = new class98(var13, "rw", 25L);
                                }
                            } catch (Exception var21) {
                                this.field647 = null;
                            }
                        }
                        if (this.field654 == null) {
                            try {
                                File var14 = new File(var11, arg3);
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
                                this.field655 = new class98(var16, "rw", 52428800L);
                                this.field652 = new class98[arg2];
                                for (int var17 = 0; var17 < arg2; var17++) {
                                    this.field652[var17] = new class98(new File(var14, "main_file_cache.idx" + var17), "rw", 1048576L);
                                }
                                this.field658 = new class98(new File(var14, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field640 = this.field654 = var14;
                            } catch (Exception var20) {
                                try {
                                    this.field655.method791(-24709);
                                    for (int var18 = 0; var18 < arg2; var18++) {
                                        this.field652[var18].method791(-24709);
                                    }
                                    this.field658.method791(-24709);
                                } catch (Exception var19) {
                                }
                                this.field640 = this.field654 = null;
                                this.field655 = this.field658 = null;
                                this.field652 = null;
                            }
                        }
                    } catch (Exception var22) {
                    }
                    if (this.field647 != null && this.field654 != null) {
                        return;
                    }
                }
            }
        }
        if (arg1 > -115) {
            this.field658 = null;
        }
        if (this.field654 == null) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(BI)Lcf;")
    public final class21 method245(byte arg0, int arg1) {
        if (arg0 < 60) {
            this.field651 = null;
        }
        return this.method253(1, 0, null, arg1, 3);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;I)Lcf;")
    public final class21 method246(String arg0, Class arg1, Class[] arg2, int arg3) {
        int var5 = -118 % ((arg3 + 48) / 47);
        return this.method253(1, 0, new Object[] { arg1, arg0, arg2 }, 0, 8);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Lcf;")
    public final class21 method247(Class arg0, int arg1, String arg2) {
        if (arg1 >= -42) {
            this.field652 = null;
        }
        return this.method253(1, 0, new Object[] { arg0, arg2 }, 0, 9);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Ljava/net/URL;Z)Lcf;")
    public final class21 method248(URL arg0, boolean arg1) {
        if (!arg1) {
            this.run();
        }
        return this.method253(1, 0, arg0, 0, 4);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IBLjava/lang/String;)Lcf;")
    public final class21 method249(int arg0, byte arg1, String arg2) {
        int var4 = -49 / ((arg1 + 48) / 44);
        return this.method253(1, 0, arg2, arg0, 1);
    }

    @OriginalMember(owner = "client!df", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class21 var2;
            synchronized (this) {
                while (true) {
                    if (this.field656) {
                        return;
                    }
                    if (this.field642 != null) {
                        var2 = this.field642;
                        this.field642 = this.field642.field515;
                        if (this.field642 == null) {
                            this.field650 = null;
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
                int var3 = var2.field517;
                if (var3 == 1) {
                    var2.field514 = new Socket(InetAddress.getByName((String) var2.field516), var2.field512);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field516);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field512);
                    var2.field514 = var4;
                } else if (var3 == 4) {
                    var2.field514 = new DataInputStream(((URL) var2.field516).openStream());
                } else if (var3 == 8) {
                    Object[] var5 = (Object[]) var2.field516;
                    var2.field514 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 9) {
                    Object[] var6 = (Object[]) var2.field516;
                    var2.field514 = ((Class) var6[0]).getDeclaredField((String) var6[1]);
                } else {
                    throw new Exception();
                }
                var2.field513 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field513 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
    public final void method250(int arg0) {
        synchronized (this) {
            this.field656 = true;
            this.notifyAll();
        }
        int var3 = 67 % ((-arg0 - 3) / 43);
        try {
            this.field657.join();
        } catch (InterruptedException var9) {
        }
        if (this.field655 != null) {
            try {
                this.field655.method791(-24709);
            } catch (IOException var8) {
            }
        }
        if (this.field658 != null) {
            try {
                this.field658.method791(-24709);
            } catch (IOException var7) {
            }
        }
        if (this.field652 != null) {
            for (int var4 = 0; var4 < this.field652.length; var4++) {
                if (this.field652[var4] != null) {
                    try {
                        this.field652[var4].method791(-24709);
                    } catch (IOException var6) {
                    }
                }
            }
        }
        if (this.field647 != null) {
            try {
                this.field647.method791(-24709);
            } catch (IOException var5) {
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(I)Lic;")
    public final class59 method251(int arg0) {
        if (arg0 != 5) {
            this.run();
        }
        return this.field641;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IBLjava/lang/Runnable;)Lcf;")
    public final class21 method252(int arg0, byte arg1, Runnable arg2) {
        if (arg1 != 34) {
            this.run();
        }
        return this.method253(1, 0, arg2, arg0, 2);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IILjava/lang/Object;II)Lcf;")
    private final class21 method253(int arg0, int arg1, Object arg2, int arg3, int arg4) {
        if (arg0 != 1) {
            field645 = null;
        }
        class21 var6 = new class21();
        var6.field517 = arg4;
        var6.field516 = arg2;
        var6.field512 = arg3;
        synchronized (this) {
            if (this.field650 == null) {
                this.field650 = this.field642 = var6;
            } else {
                this.field650.field515 = var6;
                this.field650 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
    public class28(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
        field645 = "1.1";
        this.field651 = arg1;
        field643 = "Unknown";
        try {
            field643 = System.getProperty("java.vendor");
            field645 = System.getProperty("java.version");
        } catch (Exception var10) {
        }
        try {
            field653 = System.getProperty("user.home");
            if (field653 != null) {
                field653 = field653 + "/";
            }
        } catch (Exception var9) {
        }
        if (field653 == null) {
            field653 = "~/";
        }
        try {
            this.field649 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var8) {
        }
        try {
            if (arg1 == null) {
                field648 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field648 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var7) {
        }
        try {
            if (arg1 == null) {
                field644 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field644 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        if (arg0) {
            this.method244(arg2, (byte) -127, arg4, arg3);
        }
        this.field656 = false;
        this.field657 = new Thread(this);
        this.field657.setPriority(10);
        this.field657.setDaemon(true);
        this.field657.start();
    }
}
