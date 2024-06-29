import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class180 extends class461 {

    @OriginalMember(owner = "client!ei", name = "Ib", descriptor = "Ljava/util/Calendar;")
    public static Calendar field2519 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!ei", name = "Vb", descriptor = "S")
    public static short field2532 = 32767;

    @OriginalMember(owner = "client!ei", name = "Xb", descriptor = "I")
    public static int field2534 = -1;

    @OriginalMember(owner = "client!ei", name = "H", descriptor = "I")
    public static int field2515;

    @OriginalMember(owner = "client!ei", name = "J", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!ei", name = "Gb", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!ei", name = "Hb", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!ei", name = "Jb", descriptor = "I")
    public static int field2520;

    @OriginalMember(owner = "client!ei", name = "Kb", descriptor = "I")
    public static int field2521;

    @OriginalMember(owner = "client!ei", name = "Lb", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!ei", name = "Mb", descriptor = "I")
    public static int field2523;

    @OriginalMember(owner = "client!ei", name = "Ob", descriptor = "I")
    public static int field2525;

    @OriginalMember(owner = "client!ei", name = "Pb", descriptor = "I")
    private int field2526;

    @OriginalMember(owner = "client!ei", name = "Rb", descriptor = "I")
    public static int field2528;

    @OriginalMember(owner = "client!ei", name = "Tb", descriptor = "I")
    public static int field2530;

    @OriginalMember(owner = "client!ei", name = "Ub", descriptor = "I")
    public static int field2531;

    @OriginalMember(owner = "client!ei", name = "Wb", descriptor = "I")
    public static int field2533;

    @OriginalMember(owner = "client!ei", name = "Nb", descriptor = "Liea;")
    public static class481 field2524;

    @OriginalMember(owner = "client!ei", name = "Qb", descriptor = "Lsh;")
    private class71 field2527;

    @OriginalMember(owner = "client!ei", name = "Sb", descriptor = "Ljn;")
    public static class721 field2529;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(BD)V", line = 5)
    public static final void method1228(byte arg0, double arg1) {
        if (class106.field1534 != arg1) {
            for (int var3 = 0; ~var3 > -257; ++var3) {
                int var4 = (int) (255.0D * Math.pow((double) var3 / 255.0D, arg1));
                class551.field7703[var3] = ~var4 >= -256 ? var4 : 255;
            }
            class106.field1534 = arg1;
        }
        ++field2520;
        int var5 = 104 % ((arg0 - -61) / 47);
    }

    @OriginalMember(owner = "client!ei", name = "u", descriptor = "(I)Lcs;", line = 33)
    public static final class344 method1229(int arg0) {
        ++field2525;
        if (class73.field1026 != null && class283.field3566 != null) {
            if (arg0 != -14631) {
                method1229(64);
            }
            class283.field3566.method3362(arg0 ^ 28089, class73.field1026);
            class344 var1 = (class344) class283.field3566.method3363(-121);
            if (var1 == null) {
                return null;
            } else {
                class278 var2 = class73.field1015.method3085((byte) -122, var1.field4349);
                return var2 != null && var2.field3493 && var2.method1644(class73.field1016, true) ? var1 : class429.method2460(27684);
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "v", descriptor = "(I)Z", line = 59)
    public final boolean method1230(int arg0) {
        ++field2516;
        int var2 = super.field6180[super.field6193] - this.field2527.method639((byte) -83) & 255;
        if (arg0 != 4156) {
            method1239((byte) -38);
        }
        return ~var2 <= -129;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lsh;I)V", line = 79)
    public final void method1231(class71 arg0, int arg1) {
        this.field2527 = arg0;
        ++field2528;
        if (arg1 != 8) {
            method1239((byte) 52);
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(B[BII)V", line = 99)
    public final void method1232(byte arg0, byte[] arg1, int arg2, int arg3) {
        ++field2515;
        if (arg0 >= 5) {
            for (int var5 = 0; arg3 > var5; ++var5) {
                arg1[arg2 + var5] = (byte) (super.field6180[super.field6193++] + -this.field2527.method640(11314));
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "k", descriptor = "(II)V", line = 124)
    public final void method1233(int arg0, int arg1) {
        if (arg1 != 17695) {
            field2532 = 113;
        }
        super.field6180[super.field6193++] = (byte) (this.field2527.method640(11314) + arg0);
        ++field2521;
    }

    @OriginalMember(owner = "client!ei", name = "o", descriptor = "(B)V", line = 140)
    public final void method1234(byte arg0) {
        super.field6193 = (this.field2526 - -7) / 8;
        if (arg0 < 36) {
            this.method1231((class71) null, -25);
        }
        ++field2533;
    }

    @OriginalMember(owner = "client!ei", name = "l", descriptor = "(II)I", line = 151)
    public final int method1235(int arg0, int arg1) {
        ++field2522;
        if (arg1 != -4080) {
            this.method1233(-101, -111);
        }
        int var3 = this.field2526 >> 3;
        int var4 = -(7 & this.field2526) + 8;
        int var5 = 0;
        this.field2526 += arg0;
        while (arg0 > var4) {
            var5 += (super.field6180[var3++] & class220.field2953[var4]) << -var4 + arg0;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (~arg0 == ~var4) {
            var6 = (class220.field2953[var4] & super.field6180[var3]) + var5;
        } else {
            var6 = (super.field6180[var3] >> -arg0 + var4 & class220.field2953[arg0]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "([II)V", line = 183)
    public final void method1236(int[] arg0, int arg1) {
        ++field2531;
        this.field2527 = new class71(arg0);
        if (arg1 < 97) {
            method1239((byte) -53);
        }
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(BI)I", line = 201)
    public final int method1237(byte arg0, int arg1) {
        ++field2517;
        if (arg0 != -107) {
            this.method1234((byte) -56);
        }
        return arg1 * 8 + -this.field2526;
    }

    @OriginalMember(owner = "client!ei", name = "p", descriptor = "(B)I", line = 212)
    public final int method1238(byte arg0) {
        ++field2518;
        int var2 = super.field6180[super.field6193++] - this.field2527.method640(11314) & 255;
        if (~var2 > -129) {
            return var2;
        } else {
            if (arg0 != -14) {
                method1239((byte) 109);
            }
            return (var2 + -128 << 8) - -(255 & super.field6180[super.field6193++] + -this.field2527.method640(11314));
        }
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(I)V", line = 235)
    public class180(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ei", name = "q", descriptor = "(B)V", line = 238)
    public static void method1239(byte arg0) {
        field2524 = null;
        field2529 = null;
        if (arg0 != -47) {
            method1239((byte) -16);
        }
        field2519 = null;
    }

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "(Z)V", line = 250)
    public final void method1240(boolean arg0) {
        ++field2523;
        if (arg0) {
            this.method1230(-79);
        }
        this.field2526 = super.field6193 * 8;
    }
}
