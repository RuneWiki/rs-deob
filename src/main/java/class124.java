import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class124 extends class264 {

    @OriginalMember(owner = "client!be", name = "N", descriptor = "I")
    private int field1675 = 1;

    @OriginalMember(owner = "client!be", name = "W", descriptor = "I")
    private int field1684 = 1;

    @OriginalMember(owner = "client!be", name = "P", descriptor = "I")
    public static int field1677 = 0;

    @OriginalMember(owner = "client!be", name = "S", descriptor = "Z")
    public static volatile boolean field1680 = false;

    @OriginalMember(owner = "client!be", name = "U", descriptor = "Lne;")
    public static class118 field1682 = new class118(64);

    @OriginalMember(owner = "client!be", name = "Z", descriptor = "[J")
    public static long[] field1687 = new long[32];

    @OriginalMember(owner = "client!be", name = "O", descriptor = "I")
    public static int field1676;

    @OriginalMember(owner = "client!be", name = "Q", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!be", name = "R", descriptor = "I")
    public static int field1679;

    @OriginalMember(owner = "client!be", name = "T", descriptor = "I")
    public static int field1681;

    @OriginalMember(owner = "client!be", name = "V", descriptor = "I")
    public static int field1683;

    @OriginalMember(owner = "client!be", name = "X", descriptor = "I")
    public static int field1685;

    @OriginalMember(owner = "client!be", name = "Y", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(II[J[Ljava/lang/Object;I)V")
    public static final void method942(int arg0, int arg1, long[] arg2, Object[] arg3, int arg4) {
        if (arg1 < arg4) {
            int var5 = (arg1 + arg4) / 2;
            int var6 = arg1;
            long var7 = arg2[var5];
            arg2[var5] = arg2[arg4];
            arg2[arg4] = var7;
            Object var9 = arg3[var5];
            arg3[var5] = arg3[arg4];
            arg3[arg4] = var9;
            for (int var10 = arg1; var10 < arg4; ++var10) {
                if (~((long) (1 & var10) + var7) < ~arg2[var10]) {
                    long var11 = arg2[var10];
                    arg2[var10] = arg2[var6];
                    arg2[var6] = var11;
                    Object var13 = arg3[var10];
                    arg3[var10] = arg3[var6];
                    arg3[var6++] = var13;
                }
            }
            arg2[arg4] = arg2[var6];
            arg2[var6] = var7;
            arg3[arg4] = arg3[var6];
            arg3[var6] = var9;
            method942(-116, arg1, arg2, arg3, var6 + -1);
            method942(-115, var6 + 1, arg2, arg3, arg4);
        }
        if (arg0 < -107) {
            ++field1681;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IZI)V")
    public static final void method943(int arg0, boolean arg1, int arg2) {
        if (arg2 != 0) {
            if (arg1) {
                class374.field5152 = class89.method744(class33.field338, class74.field1071, 0, 95, class436.field6206, 0);
                class374.field5152.method373(0);
                class194 var3 = class297.method1924(-7962, class282.field4059, class294.field4150, 0);
                class199 var4 = class374.field5152.method367(var3, class355.method2189(class454.field6440, class282.field4059, 0), true);
                class315.method2004((byte) 125, var4, true, class225.field3247.method1078(class66.field967, 100));
                class374.field5152.method343();
                class476.method2822(true);
                class374.field5152.method755(-57);
            }
            try {
                class374.field5152 = class89.method744(class33.field338, class74.field1071, arg2, 74, class436.field6206, class227.field3260 * 2);
            } catch (Throwable var7) {
                arg2 = 0;
                class374.field5152 = class89.method744(class33.field338, class74.field1071, 0, 80, class436.field6206, 0);
            }
        } else {
            class374.field5152 = class89.method744(class33.field338, class74.field1071, arg2, 88, class436.field6206, class227.field3260 * 2);
        }
        ++field1683;
        if (class374.field5152.method299()) {
            class349 var5 = class374.field5152.method444(157286400);
            class374.field5152.method376(var5);
        }
        class377.field5192 = arg2;
        class21.method152((byte) 103);
        if (!class374.field5152.method432()) {
            class285.field4081 = 1;
        }
        if (arg0 <= 31) {
            method945((byte) 127);
        }
        class374.field5152.method357(class285.field4081);
        class374.field5152.method314(0);
        class119.field1654 = class374.field5152.method328();
        class369.field5089 = class374.field5152.method328();
        int var6 = (int) ((double) class36.field388 * 34.46D);
        if (class374.field5152.method330()) {
            var6 += 128;
        }
        class374.field5152.method350(50, var6);
        class374.field5152.method292(!class169.field2453);
        if (class374.field5152.method377()) {
            class172.method1248(class18.field193, (byte) -38);
        }
        class389.method2358(class68.field998 >> 3, 1, class36.field388 >> 3, class374.field5152);
        class161.method1146(1046693472);
        class385.field5284 = false;
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(BI)[[I")
    public final int[][] method5(byte arg0, int arg1) {
        ++field1686;
        int[][] var3 = super.field3816.method1928((byte) 100, arg1);
        if (arg0 != 116) {
            this.method90(-44, 23);
        }
        if (super.field3816.field4208) {
            int var4 = this.field1675 + this.field1675 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field1684 + 1 - -this.field1684;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = -this.field1675 + arg1; var9 <= this.field1675 + arg1; ++var9) {
                int[][] var19 = this.method1782(class301.field4265 & var9, (byte) 114, 0);
                int[][] var20 = new int[3][class478.field6792];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[0];
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field1684; var27 <= this.field1684; ++var27) {
                    int var37 = var27 & class205.field3007;
                    var21 += var24[var37];
                    var22 += var25[var37];
                    var23 += var26[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (var31 < class478.field6792) {
                    var28[var31] = var7 * var21 >> 16;
                    var29[var31] = var7 * var22 >> 16;
                    var30[var31] = var7 * var23 >> 16;
                    int var32 = -this.field1684 + var31 & class205.field3007;
                    int var33 = var22 - var25[var32];
                    int var34 = var21 - var24[var32];
                    int var35 = var23 - var26[var32];
                    ++var31;
                    int var36 = this.field1684 + var31 & class205.field3007;
                    var21 = var24[var36] + var34;
                    var23 = var26[var36] + var35;
                    var22 = var25[var36] + var33;
                }
                var8[-arg1 + var9 + this.field1675] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; ~class478.field6792 < ~var13; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; var17 < var4; ++var17) {
                    int[][] var18 = var8[var17];
                    var16 += var18[2][var13];
                    var14 += var18[0][var13];
                    var15 += var18[1][var13];
                }
                var10[var13] = var5 * var14 >> 16;
                var11[var13] = var5 * var15 >> 16;
                var12[var13] = var5 * var16 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIII)I")
    public static final int method944(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1678;
        int var5 = arg4 & 15;
        int var6 = ~var5 > -9 ? arg3 : arg2;
        int var7 = var5 < 4 ? arg2 : (var5 != 12 && var5 != 14 ? arg1 : arg3);
        return arg0 != 32 ? -48 : (~(var5 & 1) != -1 ? -var6 : var6) + (~(2 & var5) != -1 ? -var7 : var7);
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V")
    public class124() {
        super(1, false);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(BLkk;I)V")
    public final void method7(byte arg0, class161 arg1, int arg2) {
        if (arg0 >= 31) {
            if (arg2 != 0) {
                if (arg2 != 1) {
                    if (arg2 == 2) {
                        super.field3794 = ~arg1.method1172((byte) -108) == -2;
                    }
                } else {
                    this.field1675 = arg1.method1172((byte) 120);
                }
            } else {
                this.field1684 = arg1.method1172((byte) 101);
            }
            ++field1685;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(II)[I")
    public final int[] method90(int arg0, int arg1) {
        ++field1676;
        if (arg1 != 21034) {
            return null;
        } else {
            int[] var3 = super.field3808.method958((byte) 42, arg0);
            if (super.field3808.field1732) {
                int var4 = this.field1675 + this.field1675 + 1;
                int var5 = 65536 / var4;
                int var6 = this.field1684 + this.field1684 + 1;
                int var7 = 65536 / var6;
                int[][] var8 = new int[var4][];
                for (int var9 = -this.field1675 + arg0; ~(this.field1675 + arg0) <= ~var9; ++var9) {
                    int[] var13 = this.method1788(class301.field4265 & var9, (byte) -24, 0);
                    int[] var14 = new int[class478.field6792];
                    int var15 = 0;
                    for (int var16 = -this.field1684; ~this.field1684 <= ~var16; ++var16) {
                        var15 += var13[var16 & class205.field3007];
                    }
                    int var17 = 0;
                    while (~class478.field6792 < ~var17) {
                        var14[var17] = var7 * var15 >> 16;
                        int var18 = var15 - var13[var17 - this.field1684 & class205.field3007];
                        ++var17;
                        var15 = var13[class205.field3007 & var17 - -this.field1684] + var18;
                    }
                    var8[var9 - -this.field1675 + -arg0] = var14;
                }
                for (int var10 = 0; var10 < class478.field6792; ++var10) {
                    int var11 = 0;
                    for (int var12 = 0; var4 > var12; ++var12) {
                        var11 += var8[var12][var10];
                    }
                    var3[var10] = var5 * var11 >> 16;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(B)V")
    public static void method945(byte arg0) {
        field1687 = null;
        field1682 = null;
        if (arg0 != 111) {
            field1680 = true;
        }
    }
}
