import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class45 extends class86 {

    @OriginalMember(owner = "client!nn", name = "I", descriptor = "[I")
    private int[] field666;

    @OriginalMember(owner = "client!nn", name = "E", descriptor = "[I")
    private int[] field663;

    @OriginalMember(owner = "client!nn", name = "B", descriptor = "Lnc;")
    private class149 field660;

    @OriginalMember(owner = "client!nn", name = "C", descriptor = "Lnc;")
    private class149 field661;

    @OriginalMember(owner = "client!nn", name = "J", descriptor = "Lnc;")
    private class149 field667;

    @OriginalMember(owner = "client!nn", name = "K", descriptor = "[Lnc;")
    private class149[] field668;

    @OriginalMember(owner = "client!nn", name = "z", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!nn", name = "A", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!nn", name = "G", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!nn", name = "H", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client!nn", name = "D", descriptor = "J")
    public static long field662;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(ZIILm;ZDZLns;)[I", line = 8)
    public final int[] method341(boolean arg0, int arg1, int arg2, class373 arg3, boolean arg4, double arg5, boolean arg6, class438 arg7) {
        class250.field3470 = arg7;
        if (!arg0) {
            field662 = -31L;
        }
        field659++;
        class186.field2615 = arg3;
        for (int var10 = 0; var10 < this.field668.length; var10++) {
            this.field668[var10].method977(-7589, arg1, arg2);
        }
        class235.method1593(124, arg5);
        class170.method1197(arg1, -1072879284, arg2);
        int[] var11 = new int[arg1 * arg2];
        int var12;
        int var13;
        byte var14;
        if (arg6) {
            var12 = arg1 - 1;
            var14 = -1;
            var13 = -1;
        } else {
            var12 = 0;
            var13 = arg1;
            var14 = 1;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg2; var16++) {
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field661.field2148) {
                int[] var18 = this.field661.method92(-10835, var16);
                var19 = var18;
                var20 = var18;
                var21 = var18;
            } else {
                int[][] var22 = this.field661.method139((byte) -64, var16);
                var19 = var22[0];
                var20 = var22[1];
                var21 = var22[2];
            }
            if (arg4) {
                var15 = var16;
            }
            for (int var23 = var12; var23 != var13; var23 += var14) {
                int var24 = var19[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = var20[var23] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var26 = var21[var23] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                int var27 = class197.field2785[var25];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var28 = class197.field2785[var24];
                int var29 = class197.field2785[var26];
                int var30 = (var28 << 16) + (var27 << 8) + var29;
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg4) {
                    var15 += arg1 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field668.length; var17++) {
            this.field668[var17].method397((byte) -102);
        }
        return var11;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(DILm;ILns;ZI)[I", line = 149)
    public final int[] method342(double arg0, int arg1, class373 arg2, int arg3, class438 arg4, boolean arg5, int arg6) {
        class250.field3470 = arg4;
        class186.field2615 = arg2;
        field658++;
        for (int var9 = 0; var9 < this.field668.length; var9++) {
            this.field668[var9].method977(-7589, arg6, arg3);
        }
        class235.method1593(-75, arg0);
        class170.method1197(arg6, -1072879284, arg3);
        int[] var10 = new int[arg3 * 4 * arg6];
        int var11 = 0;
        int var12 = 106 % ((arg1 + 1) / 54);
        for (int var13 = 0; var13 < arg3; var13++) {
            int[] var16;
            int[] var17;
            int[] var18;
            if (this.field661.field2148) {
                int[] var15 = this.field661.method92(-10835, var13);
                var16 = var15;
                var17 = var15;
                var18 = var15;
            } else {
                int[][] var19 = this.field661.method139((byte) -78, var13);
                var17 = var19[2];
                var16 = var19[1];
                var18 = var19[0];
            }
            if (arg5) {
                var11 = var13;
            }
            int[] var20;
            if (this.field667.field2148) {
                var20 = this.field667.method92(-10835, var13);
            } else {
                var20 = this.field667.method139((byte) -116, var13)[0];
            }
            for (int var21 = arg6 - 1; var21 >= 0; var21--) {
                int var22 = var18[var21] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var23 = var16[var21] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var24 = var17[var21] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                int var25 = class197.field2785[var23];
                int var26 = class197.field2785[var22];
                if (var24 < 0) {
                    var24 = 0;
                }
                int var27 = class197.field2785[var24];
                int var28;
                if (var26 == 0 && var25 == 0 && var27 == 0) {
                    var28 = 0;
                } else {
                    var28 = var20[var21] >> 4;
                    if (var28 > 255) {
                        var28 = 255;
                    }
                    if (var28 < 0) {
                        var28 = 0;
                    }
                }
                var10[var11++] = (var25 << 8) + (var26 << 16) + (var28 << 24) + var27;
                if (arg5) {
                    var11 += arg6 - 1;
                }
            }
        }
        for (int var14 = 0; var14 < this.field668.length; var14++) {
            this.field668[var14].method397((byte) -102);
        }
        return var10;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(ILns;Lm;IIZ)[F", line = 287)
    public final float[] method343(int arg0, class438 arg1, class373 arg2, int arg3, int arg4, boolean arg5) {
        class186.field2615 = arg2;
        field664++;
        class250.field3470 = arg1;
        for (int var7 = 0; var7 < this.field668.length; var7++) {
            this.field668[var7].method977(-7589, arg3, arg4);
        }
        class170.method1197(arg3, -1072879284, arg4);
        int var8 = 56 % ((arg0 - 77) / 42);
        float[] var9 = new float[arg3 * arg4 * 4];
        int var10 = 0;
        for (int var11 = 0; var11 < arg4; var11++) {
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field661.field2148) {
                int[] var13 = this.field661.method92(-10835, var11);
                var14 = var13;
                var15 = var13;
                var16 = var13;
            } else {
                int[][] var17 = this.field661.method139((byte) -69, var11);
                var15 = var17[2];
                var16 = var17[1];
                var14 = var17[0];
            }
            int[] var18;
            if (this.field667.field2148) {
                var18 = this.field667.method92(-10835, var11);
            } else {
                var18 = this.field667.method139((byte) -69, var11)[0];
            }
            if (arg5) {
                var10 = var11 << 2;
            }
            int[] var19;
            if (this.field660.field2148) {
                var19 = this.field660.method92(-10835, var11);
            } else {
                var19 = this.field660.method139((byte) -97, var11)[0];
            }
            for (int var20 = arg3 - 1; var20 >= 0; var20--) {
                float var21 = (float) var18[var20] / 4096.0F;
                if ((var21 < 0.0F)) {
                    var21 = 0.0F;
                } else if (var21 > 1.0F) {
                    var21 = 1.0F;
                }
                float var22 = ((float) var19[var20] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                var9[var10++] = (float) var14[var20] * var22;
                var9[var10++] = (float) var16[var20] * var22;
                var9[var10++] = (float) var15[var20] * var22;
                var9[var10++] = var21;
                if (arg5) {
                    var10 += (arg3 << 2) - 4;
                }
            }
        }
        for (int var12 = 0; var12 < this.field668.length; var12++) {
            this.field668[var12].method397((byte) -102);
        }
        return var9;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lm;BLns;)Z", line = 407)
    public final boolean method344(class373 arg0, byte arg1, class438 arg2) {
        field665++;
        if (class66.field914 < 0) {
            for (int var4 = 0; var4 < this.field666.length; var4++) {
                if (!arg2.method2624(arg1 ^ 0xFFFFFFBC, this.field666[var4])) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field666.length; var5++) {
                if (!arg2.method2647(-97, class66.field914, this.field666[var5])) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field663.length; var6++) {
            if (!arg0.method1556(true, this.field663[var6])) {
                return false;
            }
        }
        return arg1 == 55 ? true : true;
    }

    @OriginalMember(owner = "client!nn", name = "<init>", descriptor = "()V", line = 461)
    public class45() {
        this.field666 = new int[0];
        this.field663 = new int[0];
        this.field660 = new class81(0);
        this.field660.field2149 = 1;
        this.field661 = new class81();
        this.field661.field2149 = 1;
        this.field667 = new class81();
        this.field667.field2149 = 1;
        this.field668 = new class149[] { this.field661, this.field667, this.field660 };
    }

    @OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(Ltl;)V", line = 476)
    public class45(class91 arg0) {
        int var2 = arg0.method618((byte) 100);
        int var3 = 0;
        int var4 = 0;
        this.field668 = new class149[var2];
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class149 var16 = class271.method1735((byte) -115, arg0);
            if (var16.method396(-1) >= 0) {
                var3++;
            }
            if (var16.method980(-1) >= 0) {
                var4++;
            }
            int var17 = var16.field2146.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method618((byte) 100);
            }
            this.field668[var6] = var16;
        }
        this.field666 = new int[var3];
        this.field663 = new int[var4];
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class149 var11 = this.field668[var9];
            int var12 = var11.field2146.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field2146[var13] = this.field668[var5[var9][var13]];
            }
            int var14 = var11.method396(-1);
            int var15 = var11.method980(-1);
            if (var14 > 0) {
                this.field666[var7++] = var14;
            }
            if (var15 > 0) {
                this.field663[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field661 = this.field668[arg0.method618((byte) 100)];
        this.field667 = this.field668[arg0.method618((byte) 100)];
        this.field660 = this.field668[arg0.method618((byte) 100)];
        Object var10 = null;
    }
}
