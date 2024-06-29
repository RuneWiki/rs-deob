import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class107 extends class224 {

    @OriginalMember(owner = "client!tf", name = "K", descriptor = "I")
    public static int field1645 = -1;

    @OriginalMember(owner = "client!tf", name = "H", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!tf", name = "I", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!tf", name = "L", descriptor = "I")
    public static int field1646;

    @OriginalMember(owner = "client!tf", name = "M", descriptor = "I")
    public static int field1647;

    @OriginalMember(owner = "client!tf", name = "N", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!tf", name = "O", descriptor = "I")
    public static int field1649;

    @OriginalMember(owner = "client!tf", name = "P", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!tf", name = "Q", descriptor = "I")
    public static int field1651;

    @OriginalMember(owner = "client!tf", name = "R", descriptor = "Ldl;")
    public static class123 field1652;

    @OriginalMember(owner = "client!tf", name = "S", descriptor = "Lol;")
    public static class208 field1653;

    @OriginalMember(owner = "client!tf", name = "J", descriptor = "Lph;")
    public static class78 field1644;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "(I)V")
    public static void method698(int arg0) {
        if (arg0 != 0) {
            method702(-88, 12, 0, -64, -55, true, 24);
        }
        field1653 = null;
        field1644 = null;
        field1652 = null;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILlj;)Ljava/lang/String;")
    public static final String method699(int arg0, class25 arg1) {
        ++field1647;
        return arg0 != 32767 ? null : class248.method1667((byte) 124, arg1, 32767);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V")
    public static final void method700(int arg0, int arg1, String arg2, boolean arg3, String arg4, String arg5) {
        for (int var6 = 99; var6 > 0; --var6) {
            class39.field538[var6] = class39.field538[var6 + -1];
            class269.field4286[var6] = class269.field4286[var6 + -1];
            class19.field227[var6] = class19.field227[var6 - 1];
            class115.field1695[var6] = class115.field1695[var6 + -1];
            class22.field266[var6] = class22.field266[var6 + -1];
        }
        class269.field4286[0] = arg2;
        ++class144.field2132;
        ++field1646;
        class39.field538[0] = arg1;
        class40.field542 = class141.field2067;
        class22.field266[0] = arg0;
        if (arg3) {
            class19.field227[0] = arg5;
            class115.field1695[0] = arg4;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IZ)[I")
    public final int[] method14(int arg0, boolean arg1) {
        ++field1642;
        if (!arg1) {
            field1652 = null;
        }
        int[] var3 = super.field3625.method1862(arg0, (byte) 52);
        if (super.field3625.field4425) {
            int[] var4 = this.method1527(arg0, 0, (byte) 84);
            int[] var5 = this.method1527(arg0, 1, (byte) 84);
            int[] var6 = this.method1527(arg0, 2, (byte) 84);
            for (int var7 = 0; ~var7 > ~class78.field1108; ++var7) {
                int var8 = var6[var7];
                if (~var8 == -4097) {
                    var3[var7] = var4[var7];
                } else if (var8 == 0) {
                    var3[var7] = var5[var7];
                } else {
                    var3[var7] = (4096 - var8) * var5[var7] + var4[var7] * var8 >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(II)[[I")
    public final int[][] method15(int arg0, int arg1) {
        if (arg1 != 1) {
            method698(-61);
        }
        int[][] var3 = super.field3616.method1341(false, arg0);
        ++field1650;
        if (super.field3616.field3042) {
            int[] var4 = this.method1527(arg0, 2, (byte) 84);
            int[][] var5 = this.method1532(126, 0, arg0);
            int[][] var6 = this.method1532(66, 1, arg0);
            int[] var7 = var3[1];
            int[] var8 = var5[0];
            int[] var9 = var5[2];
            int[] var10 = var5[1];
            int[] var11 = var3[2];
            int[] var12 = var3[0];
            int[] var13 = var6[1];
            int[] var14 = var6[2];
            int[] var15 = var6[0];
            for (int var16 = 0; var16 < class78.field1108; ++var16) {
                int var17 = var4[var16];
                if (~var17 == -4097) {
                    var12[var16] = var8[var16];
                    var7[var16] = var10[var16];
                    var11[var16] = var9[var16];
                } else if (~var17 != -1) {
                    int var18 = 4096 - var17;
                    var12[var16] = var8[var16] * var17 - -(var15[var16] * var18) >> 12;
                    var7[var16] = var10[var16] * var17 - -(var13[var16] * var18) >> 12;
                    var11[var16] = var9[var16] * var17 + var14[var16] * var18 >> 12;
                } else {
                    var12[var16] = var15[var16];
                    var7[var16] = var13[var16];
                    var11[var16] = var14[var16];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "()V")
    public class107() {
        super(3, false);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(B[BI)I")
    public static final int method701(byte arg0, byte[] arg1, int arg2) {
        if (arg0 < 11) {
            field1645 = 0;
        }
        ++field1643;
        return class135.method915(arg2, -113, 0, arg1);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Llj;IB)V")
    public final void method16(class25 arg0, int arg1, byte arg2) {
        ++field1651;
        if (arg1 == 0) {
            super.field3624 = arg0.method201(255) == 1;
        }
        if (arg2 > -46) {
            method698(-12);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIIIZI)V")
    public static final void method702(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        class58.field817 = arg6;
        class168.field2642 = arg0;
        class243.field3887 = arg2;
        class145.field2145 = arg1;
        ++field1648;
        if (arg4 != 32758) {
            field1644 = null;
        }
        class203.field3177 = arg3;
        if (arg5 && ~class243.field3887 <= -101) {
            class66.field918 = class58.field817 * 128 - -64;
            class54.field750 = class168.field2642 * 128 + 64;
            class96.field1487 = class99.method658(class54.field750, class276.field4398, class66.field918, arg4 ^ -25575) - class203.field3177;
        }
        class278.field4414 = 2;
    }
}
