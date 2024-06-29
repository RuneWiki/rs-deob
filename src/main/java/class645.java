import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class645 extends class334 {

    @OriginalMember(owner = "client!gl", name = "F", descriptor = "I")
    private int field9164 = 1;

    @OriginalMember(owner = "client!gl", name = "O", descriptor = "I")
    private int field9171 = 1;

    @OriginalMember(owner = "client!gl", name = "N", descriptor = "Lin;")
    public static class380 field9170 = new class380(119, 4);

    @OriginalMember(owner = "client!gl", name = "P", descriptor = "Lin;")
    public static class380 field9172 = new class380(126, 0);

    @OriginalMember(owner = "client!gl", name = "Q", descriptor = "Lin;")
    public static class380 field9173 = new class380(14, 2);

    @OriginalMember(owner = "client!gl", name = "T", descriptor = "I")
    public static int field9176 = -1;

    @OriginalMember(owner = "client!gl", name = "S", descriptor = "Lhl;")
    public static class353 field9175 = new class353(3, 2);

    @OriginalMember(owner = "client!gl", name = "E", descriptor = "I")
    public static int field9163;

    @OriginalMember(owner = "client!gl", name = "H", descriptor = "I")
    public static int field9165;

    @OriginalMember(owner = "client!gl", name = "I", descriptor = "I")
    public static int field9166;

    @OriginalMember(owner = "client!gl", name = "J", descriptor = "I")
    public static int field9167;

    @OriginalMember(owner = "client!gl", name = "K", descriptor = "I")
    public static int field9168;

    @OriginalMember(owner = "client!gl", name = "L", descriptor = "I")
    public static int field9169;

    @OriginalMember(owner = "client!gl", name = "R", descriptor = "[J")
    public static long[] field9174;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(II)[I")
    public final int[] method28(int arg0, int arg1) {
        ++field9166;
        int[] var3 = super.field4743.method1027((byte) -84, arg0);
        if (super.field4743.field1993) {
            int var4 = this.field9164 - -this.field9164 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field9171 + 1 - -this.field9171;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = arg0 - this.field9164; var9 <= this.field9164 + arg0; ++var9) {
                int[] var13 = this.method2052(0, 0, class147.field2360 & var9);
                int[] var14 = new int[class439.field6099];
                int var15 = 0;
                for (int var16 = -this.field9171; this.field9171 >= var16; ++var16) {
                    var15 += var13[class478.field6578 & var16];
                }
                int var17 = 0;
                while (var17 < class439.field6099) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[var17 - this.field9171 & class478.field6578];
                    ++var17;
                    var15 = var13[var17 - -this.field9171 & class478.field6578] + var18;
                }
                var8[-arg0 + this.field9164 + var9] = var14;
            }
            for (int var10 = 0; ~class439.field6099 < ~var10; ++var10) {
                int var11 = 0;
                for (int var12 = 0; ~var12 > ~var4; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        if (arg1 != -22563988) {
            method3654(114, (class477) null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "()V")
    public class645() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILof;)Lof;")
    public static final class477 method3654(int arg0, class477 arg1) {
        ++field9168;
        class477 var2 = arg1 == null ? new class477() : new class477(arg1);
        var2.method2797((byte) -61, 9, 128);
        if (arg0 != -18547) {
            method3657(true);
        }
        return var2;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method283(boolean arg0, int arg1) {
        if (!arg0) {
            return null;
        } else {
            ++field9165;
            int[][] var3 = super.field4734.method275(26422, arg1);
            if (super.field4734.field425) {
                int var4 = this.field9164 + this.field9164 + 1;
                int var5 = 65536 / var4;
                int var6 = this.field9171 + this.field9171 + 1;
                int var7 = 65536 / var6;
                int[][][] var8 = new int[var4][][];
                for (int var9 = -this.field9164 + arg1; var9 <= arg1 - -this.field9164; ++var9) {
                    int[][] var19 = this.method2053(1, 0, var9 & class147.field2360);
                    int[][] var20 = new int[3][class439.field6099];
                    int var21 = 0;
                    int var22 = 0;
                    int var23 = 0;
                    int[] var24 = var19[0];
                    int[] var25 = var19[1];
                    int[] var26 = var19[2];
                    for (int var27 = -this.field9171; this.field9171 >= var27; ++var27) {
                        int var37 = var27 & class478.field6578;
                        var23 += var26[var37];
                        var22 += var25[var37];
                        var21 += var24[var37];
                    }
                    int[] var28 = var20[0];
                    int[] var29 = var20[1];
                    int[] var30 = var20[2];
                    int var31 = 0;
                    while (class439.field6099 > var31) {
                        var28[var31] = var7 * var21 >> 16;
                        var29[var31] = var7 * var22 >> 16;
                        var30[var31] = var7 * var23 >> 16;
                        int var32 = -this.field9171 + var31 & class478.field6578;
                        int var33 = var22 - var25[var32];
                        int var34 = var21 - var24[var32];
                        ++var31;
                        int var35 = var23 - var26[var32];
                        int var36 = class478.field6578 & this.field9171 + var31;
                        var22 = var25[var36] + var33;
                        var21 = var24[var36] + var34;
                        var23 = var26[var36] + var35;
                    }
                    var8[this.field9164 + var9 - arg1] = var20;
                }
                int[] var10 = var3[0];
                int[] var11 = var3[1];
                int[] var12 = var3[2];
                for (int var13 = 0; ~class439.field6099 < ~var13; ++var13) {
                    int var14 = 0;
                    int var15 = 0;
                    int var16 = 0;
                    for (int var17 = 0; var4 > var17; ++var17) {
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
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IZLol;)V")
    public final void method29(int arg0, boolean arg1, class431 arg2) {
        if (arg1) {
            field9172 = null;
        }
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    super.field4747 = ~arg2.method2557(14929) == -2;
                }
            } else {
                this.field9164 = arg2.method2557(14929);
            }
        } else {
            this.field9171 = arg2.method2557(14929);
        }
        ++field9169;
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(BI)V")
    public static final void method3655(byte arg0, int arg1) {
        ++field9163;
        int var2 = -class586.field8417 + class594.field8494;
        if (var2 >= 100) {
            class783.field10725 = 1;
            class401.field5533 = -1;
            class743.field10323 = -1;
        } else {
            int var3 = (int) class208.field3031;
            if (~var3 > ~(class547.field7577 >> 8)) {
                var3 = class547.field7577 >> 8;
            }
            if (class81.field1203[4] && var3 < class367.field5188[4] - -128) {
                var3 = class367.field5188[4] + 128;
            }
            int var4 = 16383 & (int) class98.field1423 - -class193.field2902;
            if (arg0 == -23) {
                class415.method2439((var3 >> 3) * 3 + 600 << 2, arg0 ^ 722150073, var4, -200 + class577.method3399(class719.field10041.field10350, class719.field10041.field10347, arg0 + -8701, class403.field5560), var3, class335.field4760, arg1, class478.field6577);
                float var5 = -((float) ((-var2 + 100) * (-var2 + 100) * (-var2 + 100)) / 1000000.0F) + 1.0F;
                class733.field10199 = (int) ((float) (-class479.field6589 + class733.field10199) * var5 + (float) class479.field6589);
                class286.field4204 = (int) ((float) (-class401.field5522 + class286.field4204) * var5 + (float) class401.field5522);
                class99.field1437 = (int) ((float) (-class34.field422 + class99.field1437) * var5 + (float) class34.field422);
                class243.field3482 = (int) ((float) (-class177.field2659 + class243.field3482) * var5 + (float) class177.field2659);
                int var6 = class642.field9037 - class688.field9720;
                if (~var6 < -8193) {
                    var6 -= 16384;
                } else if (~var6 > 8191) {
                    var6 += 16384;
                }
                class642.field9037 = (int) ((float) var6 * var5 + (float) class688.field9720);
                class642.field9037 &= 16383;
            }
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIII)I")
    public static final int method3656(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 26289) {
            method3654(84, (class477) null);
        }
        ++field9167;
        if (arg2 < arg1) {
            return arg1;
        } else {
            return ~arg0 > ~arg2 ? arg0 : arg2;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Z)V")
    public static void method3657(boolean arg0) {
        field9175 = null;
        field9172 = null;
        field9170 = null;
        field9173 = null;
        if (arg0) {
            method3656(-56, 23, -88, -90);
        }
        field9174 = null;
    }
}
