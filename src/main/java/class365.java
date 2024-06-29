import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class365 {

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "Ljp;")
    private class236 field4940 = new class236(64);

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "Lpc;")
    private class473 field4939;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
    public int field4938;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "[[S")
    public static short[][] field4936 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "I")
    public static int field4945 = -1;

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "Lsn;")
    public static class443 field4944 = new class443("WIP", 2);

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
    public static int field4935;

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
    public static int field4937;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "I")
    public static int field4941;

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "I")
    public static int field4942;

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
    public static int field4943;

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "I")
    public static int field4946;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(BI)Lvq;")
    public final class320 method2126(byte arg0, int arg1) {
        field4941++;
        class236 var3 = this.field4940;
        class320 var4;
        synchronized (this.field4940) {
            var4 = (class320) this.field4940.method1456((long) arg1, 110);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field4939.method2708(19, arg1, (byte) 54);
        class320 var6 = new class320();
        if (var5 != null) {
            var6.method1845(new class379(var5), (byte) -120);
        }
        if (arg0 > -42) {
            return null;
        }
        class236 var7 = this.field4940;
        synchronized (this.field4940) {
            this.field4940.method1462(var6, (long) arg1, -58);
            return var6;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)I")
    public static final int method2127(int arg0) {
        field4935++;
        try {
            if (class290.field3802 == 0) {
                if (class498.method2854(-109) - 5000L < class20.field359) {
                    return 0;
                }
                class487.field6766 = class389.field5281.method1376(1, class231.field3112, class356.field4806);
                class57.field891 = class498.method2854(-125);
                class290.field3802 = 1;
            }
            if (class57.field891 + 30000L < class498.method2854(-116)) {
                return class212.method1343(0, 1000);
            }
            if (class290.field3802 == 1) {
                if (class487.field6766.field6100 == 2) {
                    return class212.method1343(0, 1001);
                }
                if (class487.field6766.field6100 != 1) {
                    return -1;
                }
                class304.field4004 = new class326((Socket) class487.field6766.field6104, class389.field5281);
                class487.field6766 = null;
                int var1 = 0;
                if (class168.field2434) {
                    var1 = class436.field5986;
                }
                class193.field2708.field5173 = 0;
                class193.field2708.method2200(7, class514.field7582.field1514);
                class193.field2708.method2214(68, var1);
                class304.field4004.method1880(class193.field2708.field5152, 103, 0, class193.field2708.field5173);
                class242.method1488((byte) 81);
                int var2 = class304.field4004.method1887((byte) -126);
                class242.method1488((byte) 81);
                if (var2 != 0) {
                    return class212.method1343(0, var2);
                }
                class290.field3802 = 2;
            }
            if (class290.field3802 == 2) {
                if (class304.field4004.method1879(0) < 2) {
                    return -1;
                }
                class402.field5389 = class304.field4004.method1887((byte) -47);
                class402.field5389 <<= 0x8;
                class402.field5389 += class304.field4004.method1887((byte) -124);
                class290.field3802 = 3;
                class42.field621 = new byte[class402.field5389];
                class11.field243 = 0;
            }
            if (class290.field3802 == 3) {
                int var3 = class304.field4004.method1879(0);
                if (var3 < 1) {
                    return -1;
                }
                if (var3 > class402.field5389 - class11.field243) {
                    var3 = class402.field5389 - class11.field243;
                }
                class304.field4004.method1884(var3, class42.field621, class11.field243, (byte) 127);
                class11.field243 += var3;
                if (class402.field5389 > class11.field243) {
                    return -1;
                }
                if (!class420.method2417(-114, class42.field621)) {
                    return class212.method1343(0, 1002);
                }
                class391.field5303 = new class386[class460.field6361];
                int var4 = 0;
                for (int var5 = class147.field2085; var5 <= class114.field1629; var5++) {
                    class386 var6 = class238.method1474(false, var5);
                    if (var6 != null) {
                        class391.field5303[var4++] = var6;
                    }
                }
                class224.field3018 = null;
                class420.field5752 = 0;
                class304.field4004.method1886(-1);
                class290.field3802 = 0;
                class309.field4069 = 0;
                class42.field621 = null;
                class304.field4004 = null;
                class20.field359 = class498.method2854(-120);
                return 0;
            }
        } catch (IOException var8) {
            return class212.method1343(0, 1003);
        }
        int var7 = 124 % ((-arg0 - 9) / 52);
        return -1;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)V")
    public static void method2128(byte arg0) {
        if (arg0 < 96) {
            method2130((byte) -25, 51);
        }
        field4944 = null;
        field4936 = null;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIII)I")
    public static final int method2129(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4943++;
        int var5 = 65536 - class305.field4022[arg1 * 8192 / arg4] >> 1;
        if (arg0 != 4797) {
            method2129(-65, -41, 62, -56, 79);
        }
        return ((65536 - var5) * arg3 >> 16) + (arg2 * var5 >> 16);
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(BI)V")
    public static final void method2130(byte arg0, int arg1) {
        if (arg0 != 124) {
            return;
        }
        class250.field3323 = -1;
        class5.field152 = arg1;
        field4946++;
        class412.field5694 = -1;
        class268.method1614(1604);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "([J[Ljava/lang/Object;III)V")
    public static final void method2131(long[] arg0, Object[] arg1, int arg2, int arg3, int arg4) {
        field4942++;
        if (arg2 < arg3) {
            int var5 = (arg2 + arg3) / 2;
            int var6 = arg2;
            long var7 = arg0[var5];
            arg0[var5] = arg0[arg3];
            arg0[arg3] = var7;
            Object var9 = arg1[var5];
            arg1[var5] = arg1[arg3];
            arg1[arg3] = var9;
            int var10 = ~var7 == Long.MIN_VALUE ? 0 : 1;
            for (int var11 = arg2; var11 < arg3; var11++) {
                if (((long) (var11 & var10) + var7) > arg0[var11]) {
                    long var12 = arg0[var11];
                    arg0[var11] = arg0[var6];
                    arg0[var6] = var12;
                    Object var14 = arg1[var11];
                    arg1[var11] = arg1[var6];
                    arg1[var6++] = var14;
                }
            }
            arg0[arg3] = arg0[var6];
            arg0[var6] = var7;
            arg1[arg3] = arg1[var6];
            arg1[var6] = var9;
            method2131(arg0, arg1, arg2, var6 - 1, 28946);
            method2131(arg0, arg1, var6 + 1, arg3, 28946);
        }
        if (arg4 != 28946) {
            field4945 = -77;
        }
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Lrb;ILpc;)V")
    public class365(class234 arg0, int arg1, class473 arg2) {
        this.field4939 = arg2;
        this.field4938 = this.field4939.method2710(19, (byte) -98);
    }
}
