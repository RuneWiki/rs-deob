import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class381 extends class363 {

    @OriginalMember(owner = "client!rm", name = "t", descriptor = "[I")
    private int[] field4878;

    @OriginalMember(owner = "client!rm", name = "z", descriptor = "[I")
    private int[] field4884;

    @OriginalMember(owner = "client!rm", name = "v", descriptor = "Lqba;")
    private class377 field4880;

    @OriginalMember(owner = "client!rm", name = "G", descriptor = "Lqba;")
    private class377 field4891;

    @OriginalMember(owner = "client!rm", name = "C", descriptor = "Lqba;")
    private class377 field4887;

    @OriginalMember(owner = "client!rm", name = "E", descriptor = "[Lqba;")
    private class377[] field4889;

    @OriginalMember(owner = "client!rm", name = "x", descriptor = "I")
    public static int field4882 = -1;

    @OriginalMember(owner = "client!rm", name = "D", descriptor = "[[I")
    public static int[][] field4888 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!rm", name = "F", descriptor = "I")
    public static int field4890 = 0;

    @OriginalMember(owner = "client!rm", name = "s", descriptor = "I")
    public static int field4877;

    @OriginalMember(owner = "client!rm", name = "u", descriptor = "I")
    public static int field4879;

    @OriginalMember(owner = "client!rm", name = "w", descriptor = "I")
    public static int field4881;

    @OriginalMember(owner = "client!rm", name = "y", descriptor = "I")
    public static int field4883;

    @OriginalMember(owner = "client!rm", name = "A", descriptor = "I")
    public static int field4885;

    @OriginalMember(owner = "client!rm", name = "H", descriptor = "I")
    public static int field4892;

    @OriginalMember(owner = "client!rm", name = "B", descriptor = "Lxa;")
    public static class468 field4886;

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "(I)V", line = 5)
    public static final void method2188(int arg0) {
        if (arg0 != 1) {
            field4886 = null;
        }
        if (class558.field6980 == null) {
            class92 var1 = new class92();
            byte[] var2 = var1.method679(128, (byte) -69, 16, 128);
            class558.field6980 = class416.method2317(var2, false, -137);
        }
        field4877++;
        if (class637.field8626 == null) {
            class221 var3 = new class221();
            byte[] var4 = var3.method1265(16, (byte) 98, 128, 128);
            class637.field8626 = class416.method2317(var4, false, -137);
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(ZLpfa;Le;DIII)[I", line = 34)
    public final int[] method2189(boolean arg0, class275 arg1, class498 arg2, double arg3, int arg4, int arg5, int arg6) {
        class536.field6746 = arg2;
        class79.field1023 = arg1;
        field4892++;
        for (int var9 = 0; var9 < this.field4889.length; var9++) {
            this.field4889[var9].method2177(arg4, (byte) -125, arg5);
        }
        class612.method3426(arg3, 13);
        int var10 = 20 / ((73 - arg6) / 36);
        class527.method2848((byte) -112, arg5, arg4);
        int[] var11 = new int[arg5 * 4 * arg4];
        int var12 = 0;
        for (int var13 = 0; var13 < arg4; var13++) {
            int[] var16;
            int[] var17;
            int[] var18;
            if (this.field4891.field4853) {
                int[] var19 = this.field4891.method88(var13, -59);
                var16 = var19;
                var17 = var19;
                var18 = var19;
            } else {
                int[][] var15 = this.field4891.method23(var13, (byte) 92);
                var16 = var15[0];
                var17 = var15[1];
                var18 = var15[2];
            }
            if (arg0) {
                var12 = var13;
            }
            int[] var20;
            if (this.field4887.field4853) {
                var20 = this.field4887.method88(var13, -88);
            } else {
                var20 = this.field4887.method23(var13, (byte) 100)[0];
            }
            for (int var21 = arg5 - 1; var21 >= 0; var21--) {
                int var22 = var16[var21] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var23 = var17[var21] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var24 = var18[var21] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                int var25 = class681.field9278[var22];
                int var26 = class681.field9278[var23];
                if (var24 < 0) {
                    var24 = 0;
                }
                int var27 = class681.field9278[var24];
                int var28;
                if (var25 == 0 && var26 == 0 && var27 == 0) {
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
                var11[var12++] = (var28 << 24) + var27 - (-(var25 << 16) - (var26 << 8));
                if (arg0) {
                    var12 += arg5 - 1;
                }
            }
        }
        for (int var14 = 0; var14 < this.field4889.length; var14++) {
            this.field4889[var14].method1721(-101);
        }
        return var11;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(B)V", line = 167)
    public static void method2190(byte arg0) {
        field4886 = null;
        field4888 = null;
        if (arg0 <= 46) {
            field4882 = -32;
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lpfa;Le;I)Z", line = 181)
    public final boolean method2191(class275 arg0, class498 arg1, int arg2) {
        field4883++;
        if (class67.field818 >= 0) {
            for (int var4 = 0; var4 < this.field4884.length; var4++) {
                if (!arg0.method1667(this.field4884[var4], class67.field818, 71)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field4884.length; var5++) {
                if (!arg0.method1669((byte) -89, this.field4884[var5])) {
                    return false;
                }
            }
        }
        int var6 = 0;
        if (arg2 >= -68) {
            field4890 = -2;
        }
        while (this.field4878.length > var6) {
            if (!arg1.method2717(this.field4878[var6], false)) {
                return false;
            }
            var6++;
        }
        return true;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IILpfa;IZLe;)[F", line = 247)
    public final float[] method2192(int arg0, int arg1, class275 arg2, int arg3, boolean arg4, class498 arg5) {
        class79.field1023 = arg2;
        field4879++;
        class536.field6746 = arg5;
        for (int var7 = 0; var7 < this.field4889.length; var7++) {
            this.field4889[var7].method2177(arg1, (byte) -125, arg3);
        }
        class527.method2848((byte) -112, arg3, arg1);
        float[] var8 = new float[arg0 * arg1 * arg3];
        int var9 = 0;
        for (int var10 = 0; var10 < arg1; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field4891.field4853) {
                int[] var16 = this.field4891.method88(var10, arg0 - 84);
                var15 = var16;
                var14 = var16;
                var13 = var16;
            } else {
                int[][] var12 = this.field4891.method23(var10, (byte) 119);
                var13 = var12[0];
                var14 = var12[2];
                var15 = var12[1];
            }
            int[] var17;
            if (this.field4887.field4853) {
                var17 = this.field4887.method88(var10, 68);
            } else {
                var17 = this.field4887.method23(var10, (byte) -81)[0];
            }
            int[] var18;
            if (this.field4880.field4853) {
                var18 = this.field4880.method88(var10, 109);
            } else {
                var18 = this.field4880.method23(var10, (byte) 78)[0];
            }
            if (arg4) {
                var9 = var10 << 2;
            }
            for (int var19 = arg3 - 1; var19 >= 0; var19--) {
                float var20 = (float) var17[var19] / 4096.0F;
                float var21 = ((float) var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                if ((var20 < 0.0F)) {
                    var20 = 0.0F;
                } else if (var20 > 1.0F) {
                    var20 = 1.0F;
                }
                var8[var9++] = (float) var13[var19] * var21;
                var8[var9++] = (float) var15[var19] * var21;
                var8[var9++] = (float) var14[var19] * var21;
                var8[var9++] = var20;
                if (arg4) {
                    var9 += (arg3 << 2) - 4;
                }
            }
        }
        for (int var11 = 0; var11 < this.field4889.length; var11++) {
            this.field4889[var11].method1721(-101);
        }
        return var8;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(ZIBLe;DLpfa;IZ)[I", line = 360)
    public final int[] method2193(boolean arg0, int arg1, byte arg2, class498 arg3, double arg4, class275 arg5, int arg6, boolean arg7) {
        class79.field1023 = arg5;
        class536.field6746 = arg3;
        field4885++;
        if (arg2 != 75) {
            this.method2192(-120, -43, null, -28, true, null);
        }
        for (int var10 = 0; var10 < this.field4889.length; var10++) {
            this.field4889[var10].method2177(arg1, (byte) -125, arg6);
        }
        class612.method3426(arg4, 13);
        class527.method2848((byte) -112, arg6, arg1);
        int[] var11 = new int[arg1 * arg6];
        int var12;
        byte var13;
        int var14;
        if (arg0) {
            var12 = arg6 - 1;
            var14 = -1;
            var13 = -1;
        } else {
            var12 = 0;
            var13 = 1;
            var14 = arg6;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg1; var16++) {
            if (arg7) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field4891.field4853) {
                int[] var22 = this.field4891.method88(var16, arg2 - 158);
                var20 = var22;
                var19 = var22;
                var21 = var22;
            } else {
                int[][] var18 = this.field4891.method23(var16, (byte) -126);
                var19 = var18[1];
                var20 = var18[2];
                var21 = var18[0];
            }
            for (int var23 = var12; var23 != var14; var23 += var13) {
                int var24 = var21[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = var19[var23] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var26 = var20[var23] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                int var27 = class681.field9278[var24];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var28 = class681.field9278[var25];
                int var29 = class681.field9278[var26];
                int var30 = (var27 << 16) + (var28 << 8) + var29;
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg7) {
                    var15 += arg6 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field4889.length; var17++) {
            this.field4889[var17].method1721(-101);
        }
        return var11;
    }

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "()V", line = 502)
    public class381() {
        this.field4878 = new int[0];
        this.field4884 = new int[0];
        this.field4880 = new class411(0);
        this.field4880.field4844 = 1;
        this.field4891 = new class411();
        this.field4891.field4844 = 1;
        this.field4887 = new class411();
        this.field4887.field4844 = 1;
        this.field4889 = new class377[] { this.field4891, this.field4887, this.field4880 };
    }

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(Lji;)V", line = 517)
    public class381(class572 arg0) {
        int var2 = arg0.method3097((byte) 12);
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        this.field4889 = new class377[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            class377 var16 = class292.method1757(arg0, (byte) 109);
            if (var16.method1724(95) >= 0) {
                var3++;
            }
            if (var16.method2178(-1) >= 0) {
                var4++;
            }
            int var17 = var16.field4854.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method3097((byte) 12);
            }
            this.field4889[var6] = var16;
        }
        this.field4884 = new int[var3];
        int var7 = 0;
        this.field4878 = new int[var4];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class377 var11 = this.field4889[var9];
            int var12 = var11.field4854.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field4854[var13] = this.field4889[var5[var9][var13]];
            }
            int var14 = var11.method1724(100);
            int var15 = var11.method2178(-1);
            if (var14 > 0) {
                this.field4884[var7++] = var14;
            }
            if (var15 > 0) {
                this.field4878[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field4891 = this.field4889[arg0.method3097((byte) 12)];
        this.field4887 = this.field4889[arg0.method3097((byte) 12)];
        this.field4880 = this.field4889[arg0.method3097((byte) 12)];
        Object var10 = null;
    }
}
