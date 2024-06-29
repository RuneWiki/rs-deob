import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class2 extends class105 {

    @OriginalMember(owner = "client!pa", name = "Z", descriptor = "I")
    private int field39 = 1;

    @OriginalMember(owner = "client!pa", name = "X", descriptor = "I")
    private int field37 = 1;

    @OriginalMember(owner = "client!pa", name = "R", descriptor = "Lvf;")
    public static class265 field31 = class87.method582(-46, "Ladevorgang )2 bitte warten Sie)3");

    @OriginalMember(owner = "client!pa", name = "V", descriptor = "Lvf;")
    public static class265 field35 = class87.method582(-46, "vert:");

    @OriginalMember(owner = "client!pa", name = "T", descriptor = "Lvf;")
    public static class265 field33 = class87.method582(-46, "compass");

    @OriginalMember(owner = "client!pa", name = "P", descriptor = "Lvf;")
    public static class265 field29 = class87.method582(-46, "Chargement des textures )2 ");

    @OriginalMember(owner = "client!pa", name = "M", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "client!pa", name = "O", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!pa", name = "S", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!pa", name = "U", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!pa", name = "W", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!pa", name = "Y", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!pa", name = "ab", descriptor = "I")
    public static int field40;

    @OriginalMember(owner = "client!pa", name = "N", descriptor = "Lfl;")
    public static class192 field27;

    @OriginalMember(owner = "client!pa", name = "Q", descriptor = "[Lka;")
    public static class160[] field30;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IILng;)V")
    public final void method12(int arg0, int arg1, class135 arg2) {
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    super.field1853 = arg2.method920((byte) 32) == 1;
                }
            } else {
                this.field39 = arg2.method920((byte) 74);
            }
        } else {
            this.field37 = arg2.method920((byte) 92);
        }
        if (arg1 != 255) {
            field33 = null;
        }
        ++field26;
    }

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "(I)I")
    public static final int method13(int arg0) {
        ++field32;
        if (arg0 != 65536) {
            field35 = null;
        }
        class171.field3082 = 0;
        return class216.method1489(-27081);
    }

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "(I)V")
    public static void method14(int arg0) {
        field35 = null;
        if (arg0 == 1) {
            field31 = null;
            field30 = null;
            field27 = null;
            field33 = null;
            field29 = null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "()V")
    public class2() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(III)Lhg;")
    public static final class146 method15(int arg0, int arg1, int arg2) {
        class137 var3 = class200.field3577[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            for (int var4 = 0; var4 < var3.field2502; ++var4) {
                class146 var5 = var3.field2506[var4];
                if ((var5.field2720 >> 29 & 3L) == 2L && var5.field2728 == arg1 && var5.field2719 == arg2) {
                    class106.method709(var5);
                    return var5;
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(II)[I")
    public final int[] method16(int arg0, int arg1) {
        if (arg0 != 8055) {
            method17(43, 64, -56, -20, -67, (byte) 53);
        }
        int[] var3 = super.field1862.method458(arg1, false);
        if (super.field1862.field1236) {
            int var4 = this.field39 + 1 - -this.field39;
            int var5 = this.field37 - -1 + this.field37;
            int var6 = 65536 / var4;
            int var7 = 65536 / var5;
            int[][] var8 = new int[var4][];
            for (int var9 = arg1 - this.field39; ~(this.field39 + arg1) <= ~var9; ++var9) {
                int[] var13 = this.method705(var9 & class11.field377, (byte) -25, 0);
                int[] var14 = new int[class94.field1668];
                int var15 = 0;
                for (int var16 = -this.field37; ~var16 >= ~this.field37; ++var16) {
                    var15 += var13[var16 & class1.field20];
                }
                int var17 = 0;
                while (var17 < class94.field1668) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[-this.field37 + var17 & class1.field20];
                    ++var17;
                    var15 = var13[this.field37 + var17 & class1.field20] + var18;
                }
                var8[this.field39 + var9 + -arg1] = var14;
            }
            for (int var10 = 0; var10 < class94.field1668; ++var10) {
                int var11 = 0;
                for (int var12 = 0; ~var4 < ~var12; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var6 * var11 >> 16;
            }
        }
        ++field38;
        return var3;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIIB)V")
    public static final void method17(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        ++field36;
        if (arg5 <= 38) {
            method15(-26, 43, 117);
        }
        if (arg0 >= class107.field1890 && ~arg3 >= ~class79.field1510 && ~class81.field1521 >= ~arg1 && ~class205.field3681 <= ~arg4) {
            class122.method818(arg2, arg3, arg0, true, arg4, arg1);
        } else {
            class77.method541(arg2, arg4, arg0, 0, arg1, arg3);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IB)[[I")
    public final int[][] method18(int arg0, byte arg1) {
        ++field34;
        int[][] var3 = super.field1870.method569((byte) 69, arg0);
        if (super.field1870.field1567) {
            int var4 = this.field39 + this.field39 - -1;
            int var5 = 65536 / var4;
            int var6 = this.field37 - -this.field37 - -1;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = -this.field39 + arg0; ~var9 >= ~(this.field39 + arg0); ++var9) {
                int[][] var19 = this.method702((byte) 94, class11.field377 & var9, 0);
                int[][] var20 = new int[3][class94.field1668];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[0];
                int[] var25 = var19[2];
                int[] var26 = var19[1];
                for (int var27 = -this.field37; this.field37 >= var27; ++var27) {
                    int var37 = var27 & class1.field20;
                    var22 += var26[var37];
                    var21 += var24[var37];
                    var23 += var25[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (~class94.field1668 < ~var31) {
                    var28[var31] = var7 * var21 >> 16;
                    var29[var31] = var7 * var22 >> 16;
                    var30[var31] = var7 * var23 >> 16;
                    int var32 = -this.field37 + var31 & class1.field20;
                    int var33 = var21 - var24[var32];
                    int var34 = var23 - var25[var32];
                    int var35 = var22 - var26[var32];
                    ++var31;
                    int var36 = class1.field20 & this.field37 + var31;
                    var23 = var25[var36] + var34;
                    var21 = var24[var36] + var33;
                    var22 = var26[var36] + var35;
                }
                var8[-arg0 + this.field39 + var9] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; class94.field1668 > var13; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; var17 < var4; ++var17) {
                    int[][] var18 = var8[var17];
                    var15 += var18[2][var13];
                    var16 += var18[1][var13];
                    var14 += var18[0][var13];
                }
                var10[var13] = var5 * var14 >> 16;
                var11[var13] = var5 * var16 >> 16;
                var12[var13] = var5 * var15 >> 16;
            }
        }
        return arg1 > -110 ? null : var3;
    }
}
