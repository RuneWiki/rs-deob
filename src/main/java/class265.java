import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class265 extends class34 {

    @OriginalMember(owner = "client!rh", name = "Q", descriptor = "I")
    private int field4137 = 1;

    @OriginalMember(owner = "client!rh", name = "V", descriptor = "I")
    private int field4142 = 1;

    @OriginalMember(owner = "client!rh", name = "T", descriptor = "[I")
    public static int[] field4140 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!rh", name = "Z", descriptor = "J")
    public static long field4146 = 0L;

    @OriginalMember(owner = "client!rh", name = "ab", descriptor = "[S")
    public static short[] field4147 = new short[500];

    @OriginalMember(owner = "client!rh", name = "R", descriptor = "I")
    public static int field4138;

    @OriginalMember(owner = "client!rh", name = "S", descriptor = "I")
    public static int field4139;

    @OriginalMember(owner = "client!rh", name = "W", descriptor = "I")
    public static int field4143;

    @OriginalMember(owner = "client!rh", name = "X", descriptor = "I")
    public static int field4144;

    @OriginalMember(owner = "client!rh", name = "Y", descriptor = "I")
    public static int field4145;

    @OriginalMember(owner = "client!rh", name = "U", descriptor = "Ljg;")
    public static class287 field4141;

    @OriginalMember(owner = "client!rh", name = "P", descriptor = "[[[I")
    public static int[][][] field4136;

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "()V")
    public class265() {
        super(1, false);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IILca;)V")
    public final void method50(int arg0, int arg1, class54 arg2) {
        ++field4145;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    super.field604 = arg2.method407(arg0 + 249) == 1;
                }
            } else {
                this.field4137 = arg2.method407(arg0 ^ 249);
            }
        } else {
            this.field4142 = arg2.method407(255);
        }
        if (arg0 != 6) {
            method1797(23, 72, 23);
        }
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(III)Lok;")
    public static final class101 method1795(int arg0, int arg1, int arg2) {
        class201 var3 = class3.field40[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class101 var4 = var3.field3035;
            var3.field3035 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "(II)[I")
    public final int[] method43(int arg0, int arg1) {
        ++field4138;
        if (arg0 <= 75) {
            this.method52((byte) 17, 16);
        }
        int[] var3 = super.field610.method228(24856, arg1);
        if (super.field610.field597) {
            int var4 = this.field4137 + 1 + this.field4137;
            int var5 = 65536 / var4;
            int[][] var6 = new int[var4][];
            int var7 = this.field4142 + this.field4142 + 1;
            int var8 = 65536 / var7;
            for (int var9 = arg1 - this.field4137; this.field4137 + arg1 >= var9; ++var9) {
                int[] var13 = this.method230(var9 & class201.field3014, -15337, 0);
                int[] var14 = new int[class226.field3527];
                int var15 = 0;
                for (int var16 = -this.field4142; ~this.field4142 <= ~var16; ++var16) {
                    var15 += var13[var16 & class167.field2457];
                }
                int var17 = 0;
                while (var17 < class226.field3527) {
                    var14[var17] = var8 * var15 >> 16;
                    int var18 = var15 - var13[class167.field2457 & -this.field4142 + var17];
                    ++var17;
                    var15 = var13[this.field4142 + var17 & class167.field2457] + var18;
                }
                var6[var9 - -this.field4137 - arg1] = var14;
            }
            for (int var10 = 0; var10 < class226.field3527; ++var10) {
                int var11 = 0;
                for (int var12 = 0; ~var12 > ~var4; ++var12) {
                    var11 += var6[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(Z)V")
    public static void method1796(boolean arg0) {
        field4136 = null;
        field4141 = null;
        if (arg0) {
            field4147 = null;
            field4140 = null;
        }
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "(III)I")
    public static final int method1797(int arg0, int arg1, int arg2) {
        ++field4139;
        class270 var3 = (class270) class155.field2273.method306((long) arg0, 16216);
        if (arg1 != -20755) {
            field4147 = null;
        }
        if (var3 == null) {
            return 0;
        } else {
            return arg2 >= 0 && ~arg2 > ~var3.field4216.length ? var3.field4216[arg2] : 0;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BI)[[I")
    public final int[][] method52(byte arg0, int arg1) {
        ++field4144;
        int var3 = 108 % ((-54 - arg0) / 44);
        int[][] var4 = super.field618.method91(-125, arg1);
        if (super.field618.field211) {
            int var5 = this.field4137 + this.field4137 + 1;
            int var6 = 65536 / var5;
            int var7 = this.field4142 - -1 + this.field4142;
            int var8 = 65536 / var7;
            int[][][] var9 = new int[var5][][];
            for (int var10 = -this.field4137 + arg1; this.field4137 + arg1 >= var10; ++var10) {
                int[][] var20 = this.method231(var10 & class201.field3014, (byte) 119, 0);
                int[][] var21 = new int[3][class226.field3527];
                int var22 = 0;
                int var23 = 0;
                int var24 = 0;
                int[] var25 = var20[0];
                int[] var26 = var20[1];
                int[] var27 = var20[2];
                for (int var28 = -this.field4142; ~var28 >= ~this.field4142; ++var28) {
                    int var38 = var28 & class167.field2457;
                    var22 += var26[var38];
                    var23 += var25[var38];
                    var24 += var27[var38];
                }
                int[] var29 = var21[0];
                int[] var30 = var21[1];
                int[] var31 = var21[2];
                int var32 = 0;
                while (~class226.field3527 < ~var32) {
                    var29[var32] = var8 * var23 >> 16;
                    var30[var32] = var8 * var22 >> 16;
                    var31[var32] = var8 * var24 >> 16;
                    int var33 = class167.field2457 & -this.field4142 + var32;
                    int var34 = var22 - var26[var33];
                    int var35 = var24 - var27[var33];
                    int var36 = var23 - var25[var33];
                    ++var32;
                    int var37 = class167.field2457 & var32 - -this.field4142;
                    var23 = var25[var37] + var36;
                    var22 = var26[var37] + var34;
                    var24 = var27[var37] + var35;
                }
                var9[var10 - (-this.field4137 + arg1)] = var21;
            }
            int[] var11 = var4[1];
            int[] var12 = var4[0];
            int[] var13 = var4[2];
            for (int var14 = 0; ~var14 > ~class226.field3527; ++var14) {
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                for (int var18 = 0; var18 < var5; ++var18) {
                    int[][] var19 = var9[var18];
                    var16 += var19[1][var14];
                    var17 += var19[2][var14];
                    var15 += var19[0][var14];
                }
                var12[var14] = var6 * var15 >> 16;
                var11[var14] = var6 * var16 >> 16;
                var13[var14] = var6 * var17 >> 16;
            }
        }
        return var4;
    }
}
