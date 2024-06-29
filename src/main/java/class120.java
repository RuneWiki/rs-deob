import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public class class120 extends class65 {

    @OriginalMember(owner = "client!cw", name = "Eb", descriptor = "I")
    public static int field1672 = 0;

    @OriginalMember(owner = "client!cw", name = "Ab", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!cw", name = "Bb", descriptor = "I")
    public static int field1669;

    @OriginalMember(owner = "client!cw", name = "Db", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!cw", name = "Fb", descriptor = "I")
    public static int field1673;

    @OriginalMember(owner = "client!cw", name = "Gb", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!cw", name = "Hb", descriptor = "I")
    public static int field1675;

    @OriginalMember(owner = "client!cw", name = "Ib", descriptor = "I")
    public static int field1676;

    @OriginalMember(owner = "client!cw", name = "Jb", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!cw", name = "Kb", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!cw", name = "Mb", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!cw", name = "Nb", descriptor = "I")
    private int field1681;

    @OriginalMember(owner = "client!cw", name = "Ob", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!cw", name = "Lb", descriptor = "Lkk;")
    public static class126 field1679;

    @OriginalMember(owner = "client!cw", name = "Cb", descriptor = "Ldp;")
    private class3 field1670;

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(III[B)V")
    public final void method941(int arg0, int arg1, int arg2, byte[] arg3) {
        int var5 = 36 % ((arg0 - -41) / 58);
        for (int var6 = 0; ~var6 > ~arg1; ++var6) {
            arg3[arg2 + var6] = (byte) (super.field783[super.field827++] + -this.field1670.method19((byte) -85));
        }
        ++field1673;
    }

    @OriginalMember(owner = "client!cw", name = "m", descriptor = "(II)V")
    public final void method942(int arg0, int arg1) {
        ++field1682;
        super.field783[super.field827++] = (byte) (arg0 + this.field1670.method19((byte) -127));
        if (arg1 != 13127) {
            this.method945(-86);
        }
    }

    @OriginalMember(owner = "client!cw", name = "t", descriptor = "(I)V")
    public static final void method943(int arg0) {
        class525.method3116((byte) 46, class478.field7044.field3328);
        ++field1676;
        int var1 = (class340.field4713 >> 3) + (class161.field2268 >> 10);
        int var2 = (class486.field7138 >> 10) + (class476.field7013 >> 3);
        class525.field7714 = class435.field6375.field6328 = 0;
        class435.field6375.method2172(8, arg0 ^ arg0, 8);
        byte var3 = 18;
        class307.field4359 = new byte[var3][];
        class413.field6138 = new int[var3];
        class506.field7491 = new int[var3];
        class237.field3484 = new byte[var3][];
        class213.field3061 = new byte[var3][];
        class265.field3914 = new byte[var3][];
        class471.field6962 = new int[var3][4];
        class455.field6700 = new int[var3];
        class289.field4156 = new int[var3];
        class411.field6110 = new int[var3];
        class446.field6598 = new int[var3];
        class264.field3877 = new byte[var3][];
        int var4 = 0;
        for (int var5 = (-(class397.field5828 >> 4) + var1) / 8; ~var5 >= ~(((class397.field5828 >> 4) + var1) / 8); ++var5) {
            for (int var7 = (-(class457.field6713 >> 4) + var2) / 8; ~(((class457.field6713 >> 4) + var2) / 8) <= ~var7; ++var7) {
                int var8 = (var5 << 8) + var7;
                class411.field6110[var4] = var8;
                class413.field6138[var4] = class91.field1256.method2358("m" + var5 + "_" + var7, (byte) 107);
                class506.field7491[var4] = class91.field1256.method2358("l" + var5 + "_" + var7, (byte) -112);
                class455.field6700[var4] = class91.field1256.method2358("n" + var5 + "_" + var7, (byte) -110);
                class289.field4156[var4] = class91.field1256.method2358("um" + var5 + "_" + var7, (byte) 53);
                class446.field6598[var4] = class91.field1256.method2358("ul" + var5 + "_" + var7, (byte) 123);
                if (~class455.field6700[var4] == 0) {
                    class413.field6138[var4] = -1;
                    class506.field7491[var4] = -1;
                    class289.field4156[var4] = -1;
                    class446.field6598[var4] = -1;
                }
                ++var4;
            }
        }
        for (int var6 = var4; ~var6 > ~class455.field6700.length; ++var6) {
            class455.field6700[var6] = -1;
            class413.field6138[var6] = -1;
            class506.field7491[var6] = -1;
            class289.field4156[var6] = -1;
            class446.field6598[var6] = -1;
        }
        class268.method1722(true, (byte) 104, var2, var1, false);
    }

    @OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(I)V")
    public class120(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!cw", name = "n", descriptor = "(B)V")
    public final void method944(byte arg0) {
        int var2 = 14 % ((-17 - arg0) / 47);
        ++field1678;
        super.field827 = (this.field1681 - -7) / 8;
    }

    @OriginalMember(owner = "client!cw", name = "u", descriptor = "(I)V")
    public final void method945(int arg0) {
        ++field1675;
        if (arg0 != -934) {
            this.field1681 = 78;
        }
        this.field1681 = super.field827 * 8;
    }

    @OriginalMember(owner = "client!cw", name = "n", descriptor = "(II)I")
    public final int method946(int arg0, int arg1) {
        if (arg0 != 8) {
            return -43;
        } else {
            ++field1680;
            return arg1 * 8 - this.field1681;
        }
    }

    @OriginalMember(owner = "client!cw", name = "d", descriptor = "(Z)V")
    public static void method947(boolean arg0) {
        if (arg0) {
            method951((class188) null, (byte) 43);
        }
        field1679 = null;
    }

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "([II)V")
    public final void method948(int[] arg0, int arg1) {
        ++field1668;
        if (arg1 != -938442011) {
            field1679 = null;
        }
        this.field1670 = new class3(arg0);
    }

    @OriginalMember(owner = "client!cw", name = "v", descriptor = "(I)I")
    public final int method949(int arg0) {
        ++field1674;
        int var2 = super.field783[super.field827++] - this.field1670.method19((byte) -102) & 255;
        if (arg0 != 1941438248) {
            return 47;
        } else {
            return ~var2 > -129 ? var2 : (super.field783[super.field827++] - this.field1670.method19((byte) -107) & 255) + (var2 + -128 << 8);
        }
    }

    @OriginalMember(owner = "client!cw", name = "w", descriptor = "(I)Z")
    public final boolean method950(int arg0) {
        ++field1669;
        if (arg0 != -6742) {
            field1672 = -30;
        }
        int var2 = super.field783[super.field827] - this.field1670.method21(arg0 + 855265080) & 255;
        return ~var2 <= -129;
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(Luu;B)V")
    public static final void method951(class188 arg0, byte arg1) {
        if (arg1 != -109) {
            method951((class188) null, (byte) 67);
        }
        ++field1677;
        if (class526.field7727 == arg0.field2655) {
            class342.field4736[arg0.field2749] = true;
        }
    }

    @OriginalMember(owner = "client!cw", name = "o", descriptor = "(II)I")
    public final int method952(int arg0, int arg1) {
        ++field1671;
        int var3 = this.field1681 >> 3;
        int var4 = -(this.field1681 & 7) + 8;
        int var5 = 0;
        this.field1681 += arg1;
        if (arg0 >= -46) {
            field1679 = null;
        }
        while (var4 < arg1) {
            var5 += (super.field783[var3++] & class256.field3753[var4]) << -var4 + arg1;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (~arg1 == ~var4) {
            var6 = (super.field783[var3] & class256.field3753[var4]) + var5;
        } else {
            var6 = (super.field783[var3] >> -arg1 + var4 & class256.field3753[arg1]) + var5;
        }
        return var6;
    }
}
