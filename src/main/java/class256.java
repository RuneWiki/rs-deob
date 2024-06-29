import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class256 extends class157 {

    @OriginalMember(owner = "client!ii", name = "R", descriptor = "Lcc;")
    public static class209 field4621 = class95.method669(83, "Veuillez patienter)3)3)3");

    @OriginalMember(owner = "client!ii", name = "U", descriptor = "Lcc;")
    public static class209 field4624 = class95.method669(93, "<col=c0ff00>");

    @OriginalMember(owner = "client!ii", name = "X", descriptor = "I")
    public static int field4627 = 0;

    @OriginalMember(owner = "client!ii", name = "O", descriptor = "Laf;")
    public static class68 field4618 = new class68();

    @OriginalMember(owner = "client!ii", name = "Y", descriptor = "J")
    public static long field4628 = 0L;

    @OriginalMember(owner = "client!ii", name = "Z", descriptor = "Lcc;")
    public static class209 field4629 = class95.method669(120, "Sprites geladen)3");

    @OriginalMember(owner = "client!ii", name = "N", descriptor = "I")
    public static int field4617;

    @OriginalMember(owner = "client!ii", name = "P", descriptor = "I")
    public static int field4619;

    @OriginalMember(owner = "client!ii", name = "Q", descriptor = "I")
    public static int field4620;

    @OriginalMember(owner = "client!ii", name = "S", descriptor = "I")
    public static int field4622;

    @OriginalMember(owner = "client!ii", name = "V", descriptor = "I")
    public static int field4625;

    @OriginalMember(owner = "client!ii", name = "W", descriptor = "I")
    public static int field4626;

    @OriginalMember(owner = "client!ii", name = "T", descriptor = "Lve;")
    public static class188 field4623;

    @OriginalMember(owner = "client!ii", name = "ab", descriptor = "[Lal;")
    public static class231[] field4630;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(III)V")
    public static final void method1768(int arg0, int arg1, int arg2) {
        class38.field647[arg2] = arg1;
        if (arg0 != 3) {
            field4630 = null;
        }
        class173 var3 = (class173) class94.field1859.method1755((long) arg2, (byte) -71);
        if (var3 == null) {
            class173 var4 = new class173(class180.method1236(-117) + 500L);
            class94.field1859.method1762(var4, (long) arg2, (byte) 73);
        } else {
            var3.field3161 = 500L + class180.method1236(arg0 + -109);
        }
        ++field4625;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IBLtf;)V")
    public final void method1(int arg0, byte arg1, class106 arg2) {
        ++field4619;
        if (arg1 <= -29) {
            if (arg0 == 0) {
                super.field2877 = ~arg2.method774((byte) 126) == -2;
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(BI)[I")
    public final int[] method4(byte arg0, int arg1) {
        ++field4620;
        if (arg0 != -98) {
            method1771((class209) null, true);
        }
        int[] var3 = super.field2879.method1269(arg1, 17885);
        if (super.field2879.field3363) {
            int[] var4 = this.method1097((byte) 75, 0, arg1);
            int[] var5 = this.method1097((byte) 75, 1, arg1);
            int[] var6 = this.method1097((byte) 75, 2, arg1);
            for (int var7 = 0; ~var7 > ~class226.field4124; ++var7) {
                int var8 = var6[var7];
                if (~var8 == -4097) {
                    var3[var7] = var4[var7];
                } else if (~var8 == -1) {
                    var3[var7] = var5[var7];
                } else {
                    var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIIIIBII)V")
    public static final void method1769(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9) {
        ++field4622;
        if (arg7 != 124) {
            method1771((class209) null, true);
        }
        if (~arg0 == ~arg3 && arg4 == arg8 && arg6 == arg9 && ~arg2 == ~arg5) {
            class137.method955(true, arg8, arg3, arg1, arg2, arg9);
        } else {
            int var10 = arg3;
            int var11 = arg8;
            int var12 = arg8 * 3;
            int var13 = arg3 * 3;
            int var14 = arg4 * 3;
            int var15 = arg0 * 3;
            int var16 = arg5 * 3;
            int var17 = arg6 * 3;
            int var18 = -arg3 + -var17 + arg9 + var15;
            int var19 = arg2 - -var14 - arg8 + -var16;
            int var20 = var17 - -var13 + -var15 + -var15;
            int var21 = -var14 + -var14 + var12 + var16;
            int var22 = -var12 + var14;
            int var23 = -var13 + var15;
            for (int var24 = 128; ~var24 >= -4097; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var21 * var25;
                int var29 = var19 * var26;
                int var30 = var20 * var25;
                int var31 = var22 * var24;
                int var32 = arg8 - -(var28 + var29 + var31 >> 12);
                int var33 = var23 * var24;
                int var34 = (var27 - -var30 + var33 >> 12) + arg3;
                class137.method955(true, var11, var10, arg1, var32, var34);
                var10 = var34;
                var11 = var32;
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "(I)V")
    public static void method1770(int arg0) {
        field4630 = null;
        field4623 = null;
        field4624 = null;
        field4629 = null;
        field4618 = null;
        field4621 = null;
        if (arg0 != 7783) {
            method1770(-18);
        }
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "()V")
    public class256() {
        super(3, false);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lcc;Z)Lcc;")
    public static final class209 method1771(class209 arg0, boolean arg1) {
        ++field4626;
        if (arg1) {
            return null;
        } else {
            int var2 = class116.method822(0, arg0);
            return var2 == -1 ? class280.field4933 : class134.field2548.field3032[var2].method1471(class8.field162, class251.field4515, false);
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)[[I")
    public final int[][] method250(int arg0, int arg1) {
        int[][] var3 = super.field2872.method533(arg1, arg0 + 2);
        if (super.field2872.field1434) {
            int[] var4 = this.method1097((byte) 75, 2, arg1);
            int[][] var5 = this.method1093(arg1, 0, 64);
            int[][] var6 = this.method1093(arg1, 1, 64);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[1];
            int[] var11 = var5[0];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[2];
            int[] var15 = var6[1];
            for (int var16 = 0; class226.field4124 > var16; ++var16) {
                int var17 = var4[var16];
                if (~var17 == -4097) {
                    var7[var16] = var11[var16];
                    var8[var16] = var10[var16];
                    var9[var16] = var12[var16];
                } else if (~var17 == -1) {
                    var7[var16] = var13[var16];
                    var8[var16] = var15[var16];
                    var9[var16] = var14[var16];
                } else {
                    int var18 = -var17 + 4096;
                    var7[var16] = var11[var16] * var17 + var13[var16] * var18 >> 12;
                    var8[var16] = var10[var16] * var17 - -(var15[var16] * var18) >> 12;
                    var9[var16] = var12[var16] * var17 + var14[var16] * var18 >> 12;
                }
            }
        }
        if (arg0 != 1) {
            field4623 = null;
        }
        ++field4617;
        return var3;
    }
}
