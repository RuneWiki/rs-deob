import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class109 extends class115 {

    @OriginalMember(owner = "client!ng", name = "bb", descriptor = "I")
    private int field1754 = 1;

    @OriginalMember(owner = "client!ng", name = "R", descriptor = "I")
    private int field1744 = 1;

    @OriginalMember(owner = "client!ng", name = "Q", descriptor = "Lqe;")
    public static class168 field1743 = class66.method448("event_opbase", 111);

    @OriginalMember(owner = "client!ng", name = "X", descriptor = "[I")
    public static int[] field1750 = new int[32];

    @OriginalMember(owner = "client!ng", name = "V", descriptor = "I")
    public static int field1748 = 0;

    @OriginalMember(owner = "client!ng", name = "W", descriptor = "Lqe;")
    private static class168 field1749 = class66.method448("Close", -109);

    @OriginalMember(owner = "client!ng", name = "ab", descriptor = "Lqe;")
    public static class168 field1753 = field1749;

    @OriginalMember(owner = "client!ng", name = "S", descriptor = "I")
    public static int field1745;

    @OriginalMember(owner = "client!ng", name = "T", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!ng", name = "U", descriptor = "I")
    public static int field1747;

    @OriginalMember(owner = "client!ng", name = "Y", descriptor = "I")
    public static int field1751;

    @OriginalMember(owner = "client!ng", name = "Z", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!ng", name = "cb", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!ng", name = "db", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(Z)V")
    public static final void method709(boolean arg0) {
        class84.field1278 = 0;
        ++field1755;
        class58.field794 = 0;
        class110.method714((byte) -116);
        class129.method881((byte) -34);
        if (arg0) {
            field1753 = null;
        }
        class66.method452(126);
        for (int var1 = 0; ~var1 > ~class58.field794; ++var1) {
            int var3 = class38.field518[var1];
            if (~class133.field2326 != ~class229.field3898[var3].field165) {
                if (class229.field3898[var3].field3814.method1195(-54)) {
                    class111.method717(class229.field3898[var3], (byte) -16);
                }
                class229.field3898[var3].field3814 = null;
                class229.field3898[var3] = null;
            }
        }
        if (class31.field377 != class112.field1815.field1821) {
            throw new RuntimeException("gnp1 pos:" + class112.field1815.field1821 + " psize:" + class31.field377);
        } else {
            for (int var2 = 0; ~class82.field1244 < ~var2; ++var2) {
                if (class229.field3898[class51.field690[var2]] == null) {
                    throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class82.field1244);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(BLnh;I)V")
    public final void method3(byte arg0, class112 arg1, int arg2) {
        if (arg0 == 107) {
            ++field1746;
            if (~arg2 != -1) {
                if (arg2 != 1) {
                    if (arg2 == 2) {
                        super.field1879 = arg1.method758(true) == 1;
                    }
                } else {
                    this.field1744 = arg1.method758(true);
                }
            } else {
                this.field1754 = arg1.method758(true);
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(II)[[I")
    public final int[][] method1(int arg0, int arg1) {
        if (arg1 < 11) {
            this.method3((byte) -35, (class112) null, -3);
        }
        ++field1745;
        int[][] var3 = super.field1882.method1242(arg0, -102);
        if (super.field1882.field3344) {
            int var4 = this.field1744 + this.field1744 + 1;
            int var5 = 65536 / var4;
            int[][][] var6 = new int[var4][][];
            int var7 = this.field1754 + this.field1754 + 1;
            int var8 = 65536 / var7;
            for (int var9 = -this.field1744 + arg0; ~var9 >= ~(arg0 - -this.field1744); ++var9) {
                int[][] var19 = this.method789(0, (byte) -124, var9 & class38.field522);
                int var20 = 0;
                int[][] var21 = new int[3][class130.field2297];
                int var22 = 0;
                int[] var23 = var19[0];
                int[] var24 = var19[2];
                int var25 = 0;
                int[] var26 = var19[1];
                for (int var27 = -this.field1754; ~var27 >= ~this.field1754; ++var27) {
                    int var37 = var27 & class134.field2350;
                    var25 += var26[var37];
                    var20 += var23[var37];
                    var22 += var24[var37];
                }
                int[] var28 = var21[0];
                int[] var29 = var21[1];
                int[] var30 = var21[2];
                int var31 = 0;
                while (class130.field2297 > var31) {
                    var28[var31] = var8 * var20 >> 16;
                    var29[var31] = var8 * var25 >> 16;
                    var30[var31] = var8 * var22 >> 16;
                    int var32 = -this.field1754 + var31 & class134.field2350;
                    int var33 = var20 - var23[var32];
                    ++var31;
                    int var34 = var22 - var24[var32];
                    int var35 = var25 - var26[var32];
                    int var36 = this.field1754 + var31 & class134.field2350;
                    var22 = var24[var36] + var34;
                    var25 = var26[var36] + var35;
                    var20 = var23[var36] + var33;
                }
                var6[this.field1744 + var9 + -arg0] = var21;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; ~var13 > ~class130.field2297; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; ~var4 < ~var17; ++var17) {
                    int[][] var18 = var6[var17];
                    var16 += var18[1][var13];
                    var15 += var18[2][var13];
                    var14 += var18[0][var13];
                }
                var10[var13] = var5 * var14 >> 16;
                var11[var13] = var5 * var16 >> 16;
                var12[var13] = var5 * var15 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IB)[I")
    public final int[] method5(int arg0, byte arg1) {
        if (arg1 <= 37) {
            method709(false);
        }
        ++field1752;
        int[] var3 = super.field1872.method182((byte) -123, arg0);
        if (super.field1872.field341) {
            int var4 = this.field1744 - -this.field1744 + 1;
            int var5 = this.field1754 + 1 + this.field1754;
            int var6 = 65536 / var4;
            int var7 = 65536 / var5;
            int[][] var8 = new int[var4][];
            for (int var9 = -this.field1744 + arg0; ~(this.field1744 + arg0) <= ~var9; ++var9) {
                int var13 = 0;
                int[] var14 = this.method792(0, 0, class38.field522 & var9);
                for (int var15 = -this.field1754; this.field1754 >= var15; ++var15) {
                    var13 += var14[var15 & class134.field2350];
                }
                int[] var16 = new int[class130.field2297];
                int var17 = 0;
                while (class130.field2297 > var17) {
                    var16[var17] = var7 * var13 >> 16;
                    int var18 = var13 - var14[class134.field2350 & -this.field1754 + var17];
                    ++var17;
                    var13 = var14[var17 - -this.field1754 & class134.field2350] + var18;
                }
                var8[-arg0 + var9 + this.field1744] = var16;
            }
            for (int var10 = 0; class130.field2297 > var10; ++var10) {
                int var11 = 0;
                for (int var12 = 0; ~var12 > ~var4; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var6 * var11 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(B)V")
    public static void method710(byte arg0) {
        field1743 = null;
        field1753 = null;
        if (arg0 >= 50) {
            field1750 = null;
            field1749 = null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "()V")
    public class109() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method711(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field1756;
        if (arg2 >= 128 && ~arg3 <= -129 && ~arg2 >= -13057 && arg3 <= 13056) {
            int var8 = -arg4 + class236.method1535(arg2, class196.field3401, arg3, arg7);
            int var9 = arg2 - class114.field1854;
            int var10 = var8 - class88.field1372;
            int var11 = arg3 - class105.field1680;
            int var12 = class248.field4297[class189.field3298];
            int var13 = class248.field4297[field1747];
            int var14 = class248.field4301[field1747];
            int var15 = class248.field4301[class189.field3298];
            int var16 = var9 * var14 + var11 * var13 >> 16;
            int var17 = var11 * var14 + -(var9 * var13) >> 16;
            int var19 = var10 * var15 + -(var12 * var17) >> 16;
            int var20 = var10 * var12 - -(var15 * var17) >> 16;
            if (var20 < 50) {
                class178.field3123 = -1;
                class59.field812 = -1;
            } else {
                class59.field812 = (var19 << 9) / var20 + arg0;
                class178.field3123 = (var16 << 9) / var20 + arg5;
            }
        } else {
            class59.field812 = -1;
            class178.field3123 = -1;
        }
    }
}
