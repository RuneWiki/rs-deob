import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class282 implements Runnable {

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "Lcf;")
    private class92 field4057 = new class92();

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "Ljava/lang/Thread;")
    private Thread field4049 = new Thread(this);

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "I")
    public static int field4058 = 1407;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "Lmo;")
    public static class336 field4052 = new class336(260);

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "[[S")
    public static short[][] field4061 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "I")
    public static int field4050;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "I")
    public static int field4051;

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "I")
    public static int field4053;

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
    public static int field4054;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
    public static int field4055;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
    public static int field4056;

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "I")
    public static int field4059;

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "I")
    public static int field4060;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Ljava/lang/String;B)Lhf;", line = 6)
    public final class445 method1874(String arg0, byte arg1) {
        field4056++;
        if (this.field4049 == null) {
            throw new IllegalStateException("");
        } else if (arg0 == null) {
            throw new IllegalArgumentException("");
        } else {
            class445 var3 = new class445(arg0);
            if (arg1 <= 11) {
                return null;
            } else {
                this.method1879(-9473, var3);
                return var3;
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIII)Z", line = 28)
    public static final boolean method1875(int arg0, int arg1, int arg2, int arg3) {
        if (class395.method2385(arg0, arg1, arg2)) {
            int var4 = arg1 << class380.field5232;
            int var5 = arg2 << class380.field5232;
            return class22.method157(var4 + 1, class340.field4692[arg0].method591(arg1, arg2) + arg3, var5 + 1) && class22.method157(class47.field719 + var4 - 1, class340.field4692[arg0].method591(arg1 + 1, arg2) + arg3, var5 + 1) && class22.method157(class47.field719 + var4 - 1, class340.field4692[arg0].method591(arg1 + 1, arg2 + 1) + arg3, class47.field719 + var5 - 1) && class22.method157(var4 + 1, class340.field4692[arg0].method591(arg1, arg2 + 1) + arg3, class47.field719 + var5 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V", line = 41)
    public final void method1876(int arg0) {
        field4051++;
        if (this.field4049 == null) {
            return;
        }
        this.method1879(arg0 ^ 0xFFFFDAFE, new class449());
        try {
            if (arg0 != 1) {
                field4061 = null;
            }
            this.field4049.join();
        } catch (InterruptedException var2) {
        }
        this.field4049 = null;
    }

    @OriginalMember(owner = "client!mf", name = "run", descriptor = "()V", line = 63)
    public final void run() {
        field4053++;
        while (true) {
            class92 var1 = this.field4057;
            class445 var3;
            synchronized (this.field4057) {
                class449 var2;
                for (var2 = this.field4057.method776((byte) -86); var2 == null; var2 = this.field4057.method776((byte) 89)) {
                    try {
                        this.field4057.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class445)) {
                    return;
                }
                var3 = (class445) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field6345).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field6347 = var5;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Z)V", line = 101)
    public static void method1877(boolean arg0) {
        field4052 = null;
        field4061 = null;
        if (arg0) {
            field4052 = null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)Z", line = 113)
    public static final boolean method1878(byte arg0) {
        if (arg0 >= -71) {
            return true;
        }
        field4050++;
        if (class352.field4847) {
            try {
                class32.method200("showVideoAd", (byte) -94, class436.field6206.field960);
                return true;
            } catch (Throwable var1) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILrs;)V", line = 136)
    private final void method1879(int arg0, class449 arg1) {
        field4055++;
        class92 var3 = this.field4057;
        synchronized (this.field4057) {
            this.field4057.method766(arg1, -1);
            this.field4057.notify();
        }
        if (arg0 != -9473) {
            field4059 = -90;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIIIIZIIII)Z", line = 153)
    public static final boolean method1880(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10) {
        field4054++;
        if (arg0 < 106) {
            method1880(111, 121, -16, -11, -50, 26, false, -10, -8, -4, -121);
        }
        int var11 = class235.method1640(arg7, arg6, class300.field4249[class262.field3781.field4531], arg5, arg9, arg8, arg2, arg3, (byte) -122, arg4, class399.field5473, class262.field3781.method245(4452), class162.field2350, arg10, arg1);
        if (var11 < 1) {
            return false;
        }
        class437.field6218 = class399.field5473[var11 - 1];
        class89.field1266 = class162.field2350[var11 - 1];
        class424.field5871 = false;
        class15.method93(117);
        return true;
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "()V", line = 181)
    public class282() {
        this.field4049.setDaemon(true);
        this.field4049.start();
    }
}
