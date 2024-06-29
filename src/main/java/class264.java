import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class264 implements Runnable {

    @OriginalMember(owner = "client!il", name = "d", descriptor = "Lvq;")
    private class22 field3970 = new class22();

    @OriginalMember(owner = "client!il", name = "f", descriptor = "Ljava/lang/Thread;")
    private Thread field3972 = new Thread(this);

    @OriginalMember(owner = "client!il", name = "h", descriptor = "Lfg;")
    public static class18 field3974 = new class18(64);

    @OriginalMember(owner = "client!il", name = "a", descriptor = "I")
    public static int field3967;

    @OriginalMember(owner = "client!il", name = "b", descriptor = "I")
    public static int field3968;

    @OriginalMember(owner = "client!il", name = "c", descriptor = "I")
    public static int field3969;

    @OriginalMember(owner = "client!il", name = "e", descriptor = "I")
    public static int field3971;

    @OriginalMember(owner = "client!il", name = "g", descriptor = "I")
    public static int field3973;

    @OriginalMember(owner = "client!il", name = "i", descriptor = "I")
    public static int field3975;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ZZ[B)Ljava/lang/Object;")
    public static final Object method1885(boolean arg0, boolean arg1, byte[] arg2) {
        field3971++;
        if (!arg0) {
            field3974 = null;
        }
        if (arg2 == null) {
            return null;
        }
        if (arg2.length > 136 && !class254.field3675) {
            try {
                class190 var3 = (class190) Class.forName("ij").getDeclaredConstructor().newInstance();
                var3.method1473(arg2, 16);
                return var3;
            } catch (Throwable var4) {
                class254.field3675 = true;
            }
        }
        return arg1 ? class443.method2769(-128, arg2) : arg2;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V")
    public static void method1886(int arg0) {
        if (arg0 != 0) {
            field3974 = null;
        }
        field3974 = null;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ILon;)V")
    private final void method1887(int arg0, class35 arg1) {
        class22 var3 = this.field3970;
        synchronized (this.field3970) {
            this.field3970.method148((byte) 112, arg1);
            int var4 = -72 % ((-arg0 - 49) / 41);
            this.field3970.notify();
        }
        field3973++;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(II[I)[I")
    public static final int[] method1888(int arg0, int arg1, int[] arg2) {
        field3975++;
        int[] var3 = new int[1152];
        int var4 = arg0;
        for (int var5 = 0; var5 < 32; var5++) {
            for (int var6 = 0; var6 < 36; var6++) {
                int var7 = arg2[var4];
                if (var7 == 0) {
                    if (var6 > 0 && arg2[var4 - 1] != 0) {
                        var7 = arg1;
                    } else if (var5 > 0 && arg2[var4 - 36] != 0) {
                        var7 = arg1;
                    } else if (var6 < 35 && arg2[var4 + 1] != 0) {
                        var7 = arg1;
                    } else if (var5 < 31 && arg2[var4 + 36] != 0) {
                        var7 = arg1;
                    }
                }
                var3[var4++] = var7;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Ljava/lang/String;I)Lfk;")
    public final class23 method1889(String arg0, int arg1) {
        field3967++;
        if (this.field3972 == null) {
            throw new IllegalStateException("");
        } else if (arg0 == null) {
            throw new IllegalArgumentException("");
        } else {
            class23 var3 = new class23(arg0);
            this.method1887(-114, var3);
            int var4 = 110 % ((arg1 + 60) / 47);
            return var3;
        }
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "()V")
    public class264() {
        this.field3972.setDaemon(true);
        this.field3972.start();
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Z)V")
    public final void method1890(boolean arg0) {
        if (arg0) {
            field3974 = null;
        }
        field3969++;
        if (this.field3972 == null) {
            return;
        }
        this.method1887(39, new class35());
        try {
            this.field3972.join();
        } catch (InterruptedException var2) {
        }
        this.field3972 = null;
    }

    @OriginalMember(owner = "client!il", name = "run", descriptor = "()V")
    public final void run() {
        field3968++;
        while (true) {
            class22 var1 = this.field3970;
            class23 var3;
            synchronized (this.field3970) {
                class35 var2;
                for (var2 = this.field3970.method150(0); var2 == null; var2 = this.field3970.method150(0)) {
                    try {
                        this.field3970.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class23)) {
                    return;
                }
                var3 = (class23) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field347).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field345 = var5;
        }
    }
}
