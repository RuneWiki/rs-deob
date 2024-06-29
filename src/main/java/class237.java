import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class237 extends class271 {

    @OriginalMember(owner = "client!gj", name = "j", descriptor = "I")
    private final int field4070;

    @OriginalMember(owner = "client!gj", name = "l", descriptor = "I")
    private final int field4072;

    @OriginalMember(owner = "client!gj", name = "p", descriptor = "I")
    private final int field4076;

    @OriginalMember(owner = "client!gj", name = "t", descriptor = "I")
    private final int field4080;

    @OriginalMember(owner = "client!gj", name = "n", descriptor = "I")
    public static int field4074 = 0;

    @OriginalMember(owner = "client!gj", name = "o", descriptor = "Z")
    public static boolean field4075 = false;

    @OriginalMember(owner = "client!gj", name = "k", descriptor = "Lmb;")
    public static class96 field4071 = null;

    @OriginalMember(owner = "client!gj", name = "w", descriptor = "Lmb;")
    public static class96 field4083 = class243.method1708("(Y<)4col>", (byte) 113);

    @OriginalMember(owner = "client!gj", name = "m", descriptor = "Z")
    public static boolean field4073 = true;

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "I")
    public static int field4068;

    @OriginalMember(owner = "client!gj", name = "i", descriptor = "I")
    public static int field4069;

    @OriginalMember(owner = "client!gj", name = "q", descriptor = "I")
    public static int field4077;

    @OriginalMember(owner = "client!gj", name = "r", descriptor = "I")
    public static int field4078;

    @OriginalMember(owner = "client!gj", name = "s", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!gj", name = "u", descriptor = "I")
    public static int field4081;

    @OriginalMember(owner = "client!gj", name = "v", descriptor = "I")
    public static int field4082;

    @OriginalMember(owner = "client!gj", name = "x", descriptor = "I")
    public static int field4084;

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "(III)V")
    public final void method769(int arg0, int arg1, int arg2) {
        ++field4081;
        int var4 = this.field4072 * arg0 >> 12;
        int var5 = this.field4076 * arg2 >> 12;
        int var6 = this.field4070 * arg0 >> 12;
        int var7 = this.field4080 * arg2 >> 12;
        class201.method1406(super.field4713, super.field4714, var4, (byte) 127, var7, var5, var6);
        if (arg1 != 100) {
            field4075 = false;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IILhg;)V")
    public static final void method1610(int arg0, int arg1, class260 arg2) {
        if (~arg2.field4506 < ~class236.field4053) {
            class6.method64((byte) 90, arg2);
        } else if (class236.field4053 <= arg2.field4559) {
            class68.method477(arg2, (byte) -95);
        } else {
            class43.method335(arg2, (byte) -118);
        }
        if (arg1 != -129) {
            method1610(40, 96, (class260) null);
        }
        ++field4078;
        if (arg2.field4511 < 128 || ~arg2.field4533 > -129 || arg2.field4511 >= 13184 || arg2.field4533 >= 13184) {
            arg2.field4543 = -1;
            arg2.field4526 = -1;
            arg2.field4559 = 0;
            arg2.field4506 = 0;
            arg2.field4511 = arg2.field4528[0] * 128 + 64 * arg2.method366((byte) 95);
            arg2.field4533 = arg2.field4566[0] * 128 + arg2.method366((byte) 95) * 64;
            arg2.method1795((byte) 25);
        }
        if (class236.field4047 == arg2 && (~arg2.field4511 > -1537 || ~arg2.field4533 > -1537 || arg2.field4511 >= 11776 || ~arg2.field4533 <= -11777)) {
            arg2.field4559 = 0;
            arg2.field4543 = -1;
            arg2.field4506 = 0;
            arg2.field4526 = -1;
            arg2.field4511 = arg2.field4528[0] * 128 - -(arg2.method366((byte) 95) * 64);
            arg2.field4533 = arg2.field4566[0] * 128 - -(64 * arg2.method366((byte) 95));
            arg2.method1795((byte) 25);
        }
        class117.method915((byte) -89, arg2);
        class276.method1869(false, arg2);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IBI)V")
    public final void method766(int arg0, byte arg1, int arg2) {
        ++field4084;
        int var4 = this.field4070 * arg0 >> 12;
        int var5 = 73 % ((54 - arg1) / 59);
        int var6 = this.field4080 * arg2 >> 12;
        int var7 = this.field4072 * arg0 >> 12;
        int var8 = this.field4076 * arg2 >> 12;
        class236.method1606(var8, var4, -20268, var6, var7, super.field4718);
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(I)I")
    public static final int method1611(int arg0) {
        int var1 = -91 % ((arg0 - 19) / 61);
        ++field4079;
        return class55.field949;
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(III)V")
    public final void method768(int arg0, int arg1, int arg2) {
        ++field4077;
        int var4 = this.field4070 * arg2 >> 12;
        if (arg0 == 3298) {
            int var5 = this.field4072 * arg2 >> 12;
            int var6 = this.field4080 * arg1 >> 12;
            int var7 = this.field4076 * arg1 >> 12;
            class65.method457((byte) -1, var4, super.field4714, super.field4718, var5, var7, super.field4713, var6);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ZI)V")
    public static final void method1612(boolean arg0, int arg1) {
        ++field4069;
        if (arg1 == 953291916) {
            for (int var2 = 0; ~class132.field2375 < ~var2; ++var2) {
                long var3 = (long) class222.field3797[var2] << 32 | 536870912L;
                class197 var5 = class86.field1450[class222.field3797[var2]];
                if (var5 != null && var5.method362(false) && !arg0 == !var5.field3436.field3917 && var5.field3436.method1556((byte) -128)) {
                    int var6 = var5.field4511 >> 7;
                    int var7 = var5.field4533 >> 7;
                    if (var6 >= 0 && ~var6 > -105 && ~var7 <= -1 && ~var7 > -105) {
                        if (~var5.method366((byte) 95) == -2 && (var5.field4511 & 127) == 64 && (127 & var5.field4533) == 64) {
                            if (~class216.field3705[var6][var7] == ~class51.field899) {
                                continue;
                            }
                            class216.field3705[var6][var7] = class51.field899;
                        }
                        if (!var5.field3436.field3909) {
                            var3 |= Long.MIN_VALUE;
                        }
                        var5.field4503 = class137.method1025(class216.field3712, var5.field4533, var5.field4511, (byte) -94);
                        class252.method1752(class216.field3712, var5.field4511, var5.field4533, var5.field4503, 60 + -64 + var5.method366((byte) 95) * 64, var5, var5.field4534, var3, var5.field4571);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)V")
    public static void method1613(byte arg0) {
        field4083 = null;
        if (arg0 != -82) {
            field4074 = -86;
        }
        field4071 = null;
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(IIIIIII)V")
    public class237(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field4070 = arg0;
        this.field4072 = arg2;
        this.field4076 = arg1;
        this.field4080 = arg3;
    }

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "(I)V")
    public static final void method1614(int arg0) {
        class224.field3817.method83(0);
        if (arg0 == 17319436) {
            ++field4068;
            class74.field1279.method83(0);
        }
    }
}
