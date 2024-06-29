import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class527 extends class297 {

    @OriginalMember(owner = "client!fd", name = "O", descriptor = "I")
    private int field7296 = 1;

    @OriginalMember(owner = "client!fd", name = "R", descriptor = "I")
    private int field7299 = 1;

    @OriginalMember(owner = "client!fd", name = "M", descriptor = "I")
    public static int field7294 = -1;

    @OriginalMember(owner = "client!fd", name = "J", descriptor = "[I")
    public static int[] field7291 = new int[1000];

    @OriginalMember(owner = "client!fd", name = "I", descriptor = "I")
    public static int field7290;

    @OriginalMember(owner = "client!fd", name = "K", descriptor = "I")
    public static int field7292;

    @OriginalMember(owner = "client!fd", name = "L", descriptor = "I")
    public static int field7293;

    @OriginalMember(owner = "client!fd", name = "N", descriptor = "I")
    public static int field7295;

    @OriginalMember(owner = "client!fd", name = "P", descriptor = "I")
    public static int field7297;

    @OriginalMember(owner = "client!fd", name = "Q", descriptor = "[J")
    public static long[] field7298;

    @OriginalMember(owner = "client!fd", name = "S", descriptor = "[Lmi;")
    public static class496[] field7300;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIBIII[B[BI)V")
    public static final void method3051(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, byte[] arg6, byte[] arg7, int arg8) {
        ++field7297;
        int var9 = -(arg1 >> 2);
        int var10 = -(arg1 & 3);
        if (arg2 >= -12) {
            method3053(true);
        }
        for (int var11 = -arg4; var11 < 0; ++var11) {
            int var10001;
            for (int var12 = var9; var12 < 0; ++var12) {
                var10001 = arg5++;
                arg6[var10001] = (byte) (arg6[var10001] + -arg7[arg8++]);
                int var14 = arg5++;
                arg6[var14] = (byte) (arg6[var14] + -arg7[arg8++]);
                int var15 = arg5++;
                arg6[var15] = (byte) (arg6[var15] + -arg7[arg8++]);
                int var16 = arg5++;
                arg6[var16] = (byte) (arg6[var16] + -arg7[arg8++]);
            }
            for (int var13 = var10; ~var13 > -1; ++var13) {
                var10001 = arg5++;
                arg6[var10001] = (byte) (arg6[var10001] + -arg7[arg8++]);
            }
            arg5 += arg0;
            arg8 += arg3;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lcea;II)V")
    public final void method17(class215 arg0, int arg1, int arg2) {
        ++field7293;
        if (arg2 != 31015) {
            method3052((byte) 32);
        }
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    super.field4178 = arg0.method1535(arg2 ^ 31192) == 1;
                }
            } else {
                this.field7296 = arg0.method1535(255);
            }
        } else {
            this.field7299 = arg0.method1535(255);
        }
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(II)[I")
    public final int[] method15(int arg0, int arg1) {
        ++field7290;
        int[] var3 = super.field4165.method127(0, arg0);
        if (arg1 != 255) {
            method3053(true);
        }
        if (super.field4165.field266) {
            int var4 = this.field7296 + this.field7296 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field7299 + 1 + this.field7299;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = -this.field7296 + arg0; arg0 - -this.field7296 >= var9; ++var9) {
                int[] var13 = this.method1951(class319.field4394 & var9, 633706337, 0);
                int[] var14 = new int[class525.field7275];
                int var15 = 0;
                for (int var16 = -this.field7299; this.field7299 >= var16; ++var16) {
                    var15 += var13[var16 & class677.field9204];
                }
                int var17 = 0;
                while (var17 < class525.field7275) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[-this.field7299 + var17 & class677.field9204];
                    ++var17;
                    var15 = var13[this.field7299 + var17 & class677.field9204] + var18;
                }
                var8[this.field7296 + var9 + -arg0] = var14;
            }
            for (int var10 = 0; class525.field7275 > var10; ++var10) {
                int var11 = 0;
                for (int var12 = 0; ~var12 > ~var4; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(B)V")
    public static final void method3052(byte arg0) {
        if (arg0 != 27) {
            method3051(-85, 87, (byte) 91, 46, -77, 54, (byte[]) null, (byte[]) null, -117);
        }
        class295.field4138 = -1;
        class136.field2279 = -1;
        class318.field4392 = 0;
        ++field7292;
    }

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "(II)[[I")
    public final int[][] method18(int arg0, int arg1) {
        if (arg1 != -1564599039) {
            return null;
        } else {
            ++field7295;
            int[][] var3 = super.field4166.method2180(arg1 ^ 1564598950, arg0);
            if (super.field4166.field4849) {
                int var4 = this.field7296 + this.field7296 + 1;
                int var5 = 65536 / var4;
                int var6 = this.field7299 + 1 + this.field7299;
                int var7 = 65536 / var6;
                int[][][] var8 = new int[var4][][];
                for (int var9 = -this.field7296 + arg0; var9 <= this.field7296 + arg0; ++var9) {
                    int[][] var19 = this.method1948((byte) 55, class319.field4394 & var9, 0);
                    int[][] var20 = new int[3][class525.field7275];
                    int var21 = 0;
                    int var22 = 0;
                    int var23 = 0;
                    int[] var24 = var19[0];
                    int[] var25 = var19[1];
                    int[] var26 = var19[2];
                    for (int var27 = -this.field7299; ~this.field7299 <= ~var27; ++var27) {
                        int var37 = class677.field9204 & var27;
                        var23 += var26[var37];
                        var21 += var24[var37];
                        var22 += var25[var37];
                    }
                    int[] var28 = var20[0];
                    int[] var29 = var20[1];
                    int[] var30 = var20[2];
                    int var31 = 0;
                    while (~var31 > ~class525.field7275) {
                        var28[var31] = var7 * var21 >> 16;
                        var29[var31] = var7 * var22 >> 16;
                        var30[var31] = var7 * var23 >> 16;
                        int var32 = class677.field9204 & -this.field7299 + var31;
                        int var33 = var21 - var24[var32];
                        ++var31;
                        int var34 = var22 - var25[var32];
                        int var35 = var23 - var26[var32];
                        int var36 = var31 - -this.field7299 & class677.field9204;
                        var23 = var26[var36] + var35;
                        var22 = var25[var36] + var34;
                        var21 = var24[var36] + var33;
                    }
                    var8[this.field7296 + var9 + -arg0] = var20;
                }
                int[] var10 = var3[0];
                int[] var11 = var3[1];
                int[] var12 = var3[2];
                for (int var13 = 0; class525.field7275 > var13; ++var13) {
                    int var14 = 0;
                    int var15 = 0;
                    int var16 = 0;
                    for (int var17 = 0; var17 < var4; ++var17) {
                        int[][] var18 = var8[var17];
                        var14 += var18[0][var13];
                        var15 += var18[1][var13];
                        var16 += var18[2][var13];
                    }
                    var10[var13] = var5 * var14 >> 16;
                    var11[var13] = var5 * var15 >> 16;
                    var12[var13] = var5 * var16 >> 16;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "()V")
    public class527() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(Z)V")
    public static void method3053(boolean arg0) {
        field7291 = null;
        field7298 = null;
        if (!arg0) {
            method3051(79, -54, (byte) -128, -109, 85, -107, (byte[]) null, (byte[]) null, 58);
        }
        field7300 = null;
    }
}
