import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("tg")
public class class182 extends class85 {

    @OriginalMember(owner = "tg", name = "U", descriptor = "I")
    private int field3429 = 1;

    @OriginalMember(owner = "tg", name = "S", descriptor = "I")
    private int field3427 = 1;

    @OriginalMember(owner = "tg", name = "T", descriptor = "I")
    public static int field3428 = 0;

    @OriginalMember(owner = "tg", name = "Q", descriptor = "[I")
    public static int[] field3425 = new int[5];

    @OriginalMember(owner = "tg", name = "W", descriptor = "Lvg;")
    public static class200 field3431 = null;

    @OriginalMember(owner = "tg", name = "Y", descriptor = "Llf;")
    public static class109 field3433 = class35.method275("Hier wechseln", 2);

    @OriginalMember(owner = "tg", name = "X", descriptor = "I")
    public static int field3432 = 0;

    @OriginalMember(owner = "tg", name = "cb", descriptor = "Llf;")
    public static class109 field3437 = class35.method275("M", 2);

    @OriginalMember(owner = "tg", name = "R", descriptor = "I")
    public static int field3426;

    @OriginalMember(owner = "tg", name = "V", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "tg", name = "Z", descriptor = "I")
    public static int field3434;

    @OriginalMember(owner = "tg", name = "ab", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "tg", name = "bb", descriptor = "I")
    public static int field3436;

    @OriginalMember(owner = "tg", name = "a", descriptor = "(II)[I")
    public final int[] method87(int arg0, int arg1) {
        ++field3426;
        int[] var3 = super.field1736.method835(-314, arg1);
        if (arg0 > -49) {
            field3425 = null;
        }
        if (super.field1736.field2253) {
            int var4 = this.field3429 + this.field3429 - -1;
            int[][] var5 = new int[var4][];
            int var6 = this.field3427 - -1 + this.field3427;
            for (int var7 = -this.field3429 + arg1; this.field3429 + arg1 >= var7; ++var7) {
                int var11 = 0;
                int[] var12 = this.method540(class150.field2892 & var7, -6, 0);
                for (int var13 = -this.field3427; ~this.field3427 <= ~var13; ++var13) {
                    var11 += var12[var13 & class29.field624];
                }
                int[] var14 = new int[class57.field1152];
                int var15 = 0;
                while (var15 < class57.field1152) {
                    var14[var15] = var11 / var6;
                    int var16 = var11 - var12[var15 - this.field3427 & class29.field624];
                    ++var15;
                    var11 = var12[class29.field624 & this.field3427 + var15] + var16;
                }
                var5[-arg1 + this.field3429 + var7] = var14;
            }
            for (int var8 = 0; ~var8 > ~class57.field1152; ++var8) {
                int var9 = 0;
                for (int var10 = 0; var10 < var4; ++var10) {
                    var9 += var5[var10][var8];
                }
                var3[var8] = var9 / var4;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "tg", name = "b", descriptor = "(II)[[I")
    public final int[][] method29(int arg0, int arg1) {
        ++field3430;
        if (arg1 != 2177) {
            this.field3427 = -78;
        }
        int[][] var3 = super.field1719.method673((byte) -127, arg0);
        if (super.field1719.field1926) {
            int var4 = this.field3429 - -1 + this.field3429;
            int[][][] var5 = new int[var4][][];
            int var6 = this.field3427 + this.field3427 + 1;
            for (int var7 = -this.field3429 + arg0; var7 <= this.field3429 + arg0; ++var7) {
                int[][] var17 = this.method544(false, class150.field2892 & var7, 0);
                int[][] var18 = new int[3][class57.field1152];
                int var19 = 0;
                int var20 = 0;
                int var21 = 0;
                int[] var22 = var17[0];
                int[] var23 = var17[1];
                int[] var24 = var17[2];
                for (int var25 = -this.field3427; ~var25 >= ~this.field3427; ++var25) {
                    int var35 = var25 & class29.field624;
                    var19 += var22[var35];
                    var21 += var24[var35];
                    var20 += var23[var35];
                }
                int[] var26 = var18[0];
                int[] var27 = var18[1];
                int[] var28 = var18[2];
                int var29 = 0;
                while (var29 < class57.field1152) {
                    var26[var29] = var19 / var6;
                    var27[var29] = var20 / var6;
                    var28[var29] = var21 / var6;
                    int var30 = -this.field3427 + var29 & class29.field624;
                    int var31 = var20 - var23[var30];
                    int var32 = var19 - var22[var30];
                    int var33 = var21 - var24[var30];
                    ++var29;
                    int var34 = this.field3427 + var29 & class29.field624;
                    var21 = var24[var34] + var33;
                    var19 = var22[var34] + var32;
                    var20 = var23[var34] + var31;
                }
                var5[var7 - arg0 + this.field3429] = var18;
            }
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class57.field1152; ++var11) {
                int var12 = 0;
                int var13 = 0;
                int var14 = 0;
                for (int var15 = 0; ~var15 > ~var4; ++var15) {
                    int[][] var16 = var5[var15];
                    var12 += var16[0][var11];
                    var13 += var16[1][var11];
                    var14 += var16[2][var11];
                }
                var8[var11] = var12 / var4;
                var9[var11] = var13 / var4;
                var10[var11] = var14 / var4;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "tg", name = "a", descriptor = "(BILja;)V")
    public final void method31(byte arg0, int arg1, class86 arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    super.field1726 = arg2.method598((byte) 89) == 1;
                }
            } else {
                this.field3429 = arg2.method598((byte) 80);
            }
        } else {
            this.field3427 = arg2.method598((byte) 118);
        }
        ++field3436;
        if (arg0 >= -120) {
            method1239((byte) -97);
        }
    }

    @OriginalMember(owner = "tg", name = "d", descriptor = "(B)V")
    public static void method1239(byte arg0) {
        field3425 = null;
        field3437 = null;
        field3431 = null;
        int var1 = -77 % ((arg0 - -3) / 40);
        field3433 = null;
    }

    @OriginalMember(owner = "tg", name = "<init>", descriptor = "()V")
    public class182() {
        super(1, false);
    }

    @OriginalMember(owner = "tg", name = "a", descriptor = "(IIIII)V")
    public static final void method1240(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = arg1; ~class113.field2239 < ~var5; ++var5) {
            if (arg3 < class60.field1176[var5] + class200.field3956[var5] && ~class60.field1176[var5] > ~(arg3 - -arg0) && ~arg4 > ~(class27.field587[var5] - -class68.field1317[var5]) && ~class27.field587[var5] > ~(arg2 + arg4)) {
                class186.field3538[var5] = true;
            }
        }
        ++field3434;
    }
}
