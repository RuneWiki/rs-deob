import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class45 extends class157 {

    @OriginalMember(owner = "client!kh", name = "S", descriptor = "I")
    private int field896 = 1;

    @OriginalMember(owner = "client!kh", name = "N", descriptor = "I")
    private int field891 = 1;

    @OriginalMember(owner = "client!kh", name = "W", descriptor = "[I")
    public static int[] field900 = new int[100];

    @OriginalMember(owner = "client!kh", name = "V", descriptor = "I")
    public static int field899 = 0;

    @OriginalMember(owner = "client!kh", name = "P", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!kh", name = "R", descriptor = "I")
    public static int field895;

    @OriginalMember(owner = "client!kh", name = "T", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!kh", name = "U", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!kh", name = "X", descriptor = "I")
    public static int field901;

    @OriginalMember(owner = "client!kh", name = "O", descriptor = "Z")
    public static boolean field892;

    @OriginalMember(owner = "client!kh", name = "Q", descriptor = "[I")
    public static int[] field894;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lsj;BII)[Lal;")
    public static final class231[] method337(class49 arg0, byte arg1, int arg2, int arg3) {
        int var4 = 117 % ((-8 - arg1) / 52);
        ++field893;
        return !class117.method833(arg3, arg0, 896, arg2) ? null : class87.method628(false);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IBLtf;)V")
    public final void method1(int arg0, byte arg1, class106 arg2) {
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    super.field2877 = ~arg2.method774((byte) 96) == -2;
                }
            } else {
                this.field891 = arg2.method774((byte) 117);
            }
        } else {
            this.field896 = arg2.method774((byte) 118);
        }
        if (arg1 < -29) {
            ++field895;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIILpb;IJIIII)Z")
    public static final boolean method338(int arg0, int arg1, int arg2, int arg3, class126 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class23.method193(arg0, arg7, arg8, arg9 - arg7 + 1, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "(I)V")
    public static void method339(int arg0) {
        field900 = null;
        field894 = null;
        if (arg0 != 1) {
            field898 = -19;
        }
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "()V")
    public class45() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(BI)[I")
    public final int[] method4(byte arg0, int arg1) {
        if (arg0 != -98) {
            field892 = true;
        }
        ++field901;
        int[] var3 = super.field2879.method1269(arg1, 17885);
        if (super.field2879.field3363) {
            int var4 = this.field891 + this.field891 - -1;
            int var5 = this.field896 + this.field896 + 1;
            int var6 = 65536 / var4;
            int var7 = 65536 / var5;
            int[][] var8 = new int[var4][];
            for (int var9 = -this.field891 + arg1; arg1 - -this.field891 >= var9; ++var9) {
                int[] var13 = this.method1097((byte) 75, 0, class42.field859 & var9);
                int[] var14 = new int[class226.field4124];
                int var15 = 0;
                for (int var16 = -this.field896; this.field896 >= var16; ++var16) {
                    var15 += var13[class249.field4490 & var16];
                }
                int var17 = 0;
                while (~class226.field4124 < ~var17) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[-this.field896 + var17 & class249.field4490];
                    ++var17;
                    var15 = var13[class249.field4490 & this.field896 + var17] + var18;
                }
                var8[this.field891 + var9 + -arg1] = var14;
            }
            for (int var10 = 0; class226.field4124 > var10; ++var10) {
                int var11 = 0;
                for (int var12 = 0; ~var4 < ~var12; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var6 * var11 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)[[I")
    public final int[][] method250(int arg0, int arg1) {
        if (arg0 != 1) {
            field900 = null;
        }
        int[][] var3 = super.field2872.method533(arg1, 3);
        if (super.field2872.field1434) {
            int var4 = this.field891 + 1 + this.field891;
            int var5 = 65536 / var4;
            int var6 = this.field896 - -1 + this.field896;
            int[][][] var7 = new int[var4][][];
            int var8 = 65536 / var6;
            for (int var9 = -this.field891 + arg1; ~var9 >= ~(this.field891 + arg1); ++var9) {
                int[][] var19 = this.method1093(class42.field859 & var9, 0, 64);
                int[][] var20 = new int[3][class226.field4124];
                int var21 = 0;
                int var22 = 0;
                int[] var23 = var19[0];
                int var24 = 0;
                int[] var25 = var19[2];
                int[] var26 = var19[1];
                for (int var27 = -this.field896; ~this.field896 <= ~var27; ++var27) {
                    int var37 = var27 & class249.field4490;
                    var22 += var26[var37];
                    var21 += var23[var37];
                    var24 += var25[var37];
                }
                int[] var28 = var20[2];
                int[] var29 = var20[1];
                int[] var30 = var20[0];
                int var31 = 0;
                while (class226.field4124 > var31) {
                    var30[var31] = var8 * var21 >> 16;
                    var29[var31] = var8 * var22 >> 16;
                    var28[var31] = var8 * var24 >> 16;
                    int var32 = -this.field896 + var31 & class249.field4490;
                    int var33 = var24 - var25[var32];
                    ++var31;
                    int var34 = var22 - var26[var32];
                    int var35 = var21 - var23[var32];
                    int var36 = this.field896 + var31 & class249.field4490;
                    var24 = var25[var36] + var33;
                    var21 = var23[var36] + var35;
                    var22 = var26[var36] + var34;
                }
                var7[-arg1 + this.field891 + var9] = var20;
            }
            int[] var10 = var3[1];
            int[] var11 = var3[2];
            int[] var12 = var3[0];
            for (int var13 = 0; var13 < class226.field4124; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; ~var17 > ~var4; ++var17) {
                    int[][] var18 = var7[var17];
                    var14 += var18[2][var13];
                    var16 += var18[0][var13];
                    var15 += var18[1][var13];
                }
                var12[var13] = var5 * var16 >> 16;
                var10[var13] = var5 * var15 >> 16;
                var11[var13] = var5 * var14 >> 16;
            }
        }
        ++field897;
        return var3;
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "(III)Lca;")
    public static final class264 method340(int arg0, int arg1, int arg2) {
        class109 var3 = class106.field2089[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            for (int var4 = 0; var4 < var3.field2203; ++var4) {
                class264 var5 = var3.field2189[var4];
                if ((var5.field4733 >> 29 & 3L) == 2L && var5.field4746 == arg1 && var5.field4741 == arg2) {
                    class56.method439(var5);
                    return var5;
                }
            }
            return null;
        }
    }
}
