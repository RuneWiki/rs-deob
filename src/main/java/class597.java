import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oea")
public class class597 extends class583 {

    @OriginalMember(owner = "client!oea", name = "y", descriptor = "[I")
    private int[] field8393;

    @OriginalMember(owner = "client!oea", name = "q", descriptor = "[I")
    private int[] field8385;

    @OriginalMember(owner = "client!oea", name = "D", descriptor = "Ltga;")
    private class56 field8398;

    @OriginalMember(owner = "client!oea", name = "z", descriptor = "Ltga;")
    private class56 field8394;

    @OriginalMember(owner = "client!oea", name = "r", descriptor = "Ltga;")
    private class56 field8386;

    @OriginalMember(owner = "client!oea", name = "v", descriptor = "[Ltga;")
    private class56[] field8390;

    @OriginalMember(owner = "client!oea", name = "E", descriptor = "Z")
    public static boolean field8399 = true;

    @OriginalMember(owner = "client!oea", name = "C", descriptor = "Lkt;")
    public static class155 field8397 = new class155();

    @OriginalMember(owner = "client!oea", name = "G", descriptor = "Lqfa;")
    public static class98 field8401 = new class98(105, -1);

    @OriginalMember(owner = "client!oea", name = "s", descriptor = "I")
    public static int field8387;

    @OriginalMember(owner = "client!oea", name = "t", descriptor = "I")
    public static int field8388;

    @OriginalMember(owner = "client!oea", name = "w", descriptor = "I")
    public static int field8391;

    @OriginalMember(owner = "client!oea", name = "x", descriptor = "I")
    public static int field8392;

    @OriginalMember(owner = "client!oea", name = "A", descriptor = "I")
    public static int field8395;

    @OriginalMember(owner = "client!oea", name = "B", descriptor = "I")
    public static int field8396;

    @OriginalMember(owner = "client!oea", name = "u", descriptor = "Lvc;")
    public static class316 field8389;

    @OriginalMember(owner = "client!oea", name = "F", descriptor = "Lhaa;")
    public static class80 field8400;

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(ILd;DIBLfp;Z)[I")
    public final int[] method3359(int arg0, class149 arg1, double arg2, int arg3, byte arg4, class323 arg5, boolean arg6) {
        class119.field1442 = arg1;
        field8392++;
        class234.field3146 = arg5;
        for (int var9 = 0; var9 < this.field8390.length; var9++) {
            this.field8390[var9].method366(arg0, -1, arg3);
        }
        if (arg4 != 68) {
            this.method3359(-128, null, 0.7915966213617012D, -31, (byte) -53, null, false);
        }
        class98.method716(-82, arg2);
        class193.method1196(-11775, arg3, arg0);
        int[] var10 = new int[arg0 * arg3];
        int var11 = 0;
        for (int var12 = 0; var12 < arg0; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field8394.field674) {
                int[] var18 = this.field8394.method24(var12, true);
                var16 = var18;
                var15 = var18;
                var17 = var18;
            } else {
                int[][] var14 = this.field8394.method5(var12, arg4 - 67);
                var15 = var14[1];
                var16 = var14[0];
                var17 = var14[2];
            }
            int[] var19;
            if (this.field8386.field674) {
                var19 = this.field8386.method24(var12, true);
            } else {
                var19 = this.field8386.method5(var12, 1)[0];
            }
            if (arg6) {
                var11 = var12;
            }
            for (int var20 = arg3 - 1; var20 >= 0; var20--) {
                int var21 = var16[var20] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var22 = var15[var20] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var23 = var17[var20] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var24 = class145.field2089[var21];
                int var25 = class145.field2089[var22];
                int var26 = class145.field2089[var23];
                int var27;
                if (var24 == 0 && var25 == 0 && var26 == 0) {
                    var27 = 0;
                } else {
                    var27 = var19[var20] >> 4;
                    if (var27 > 255) {
                        var27 = 255;
                    }
                    if (var27 < 0) {
                        var27 = 0;
                    }
                }
                var10[var11++] = (var27 << 24) + (var24 << 16) - (-(var25 << 8) - var26);
                if (arg6) {
                    var11 += arg3 - 1;
                }
            }
        }
        for (int var13 = 0; var13 < this.field8390.length; var13++) {
            this.field8390[var13].method3((byte) -115);
        }
        return var10;
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(ZLfp;IIZIDLd;)[I")
    public final int[] method3360(boolean arg0, class323 arg1, int arg2, int arg3, boolean arg4, int arg5, double arg6, class149 arg7) {
        if (arg2 != 255) {
            return null;
        }
        class119.field1442 = arg7;
        field8387++;
        class234.field3146 = arg1;
        for (int var10 = 0; var10 < this.field8390.length; var10++) {
            this.field8390[var10].method366(arg3, arg2 ^ 0xFFFFFF00, arg5);
        }
        class98.method716(-110, arg6);
        class193.method1196(-11775, arg5, arg3);
        int[] var11 = new int[arg3 * arg5];
        int var12;
        byte var13;
        int var14;
        if (arg4) {
            var13 = -1;
            var12 = arg5 - 1;
            var14 = -1;
        } else {
            var12 = 0;
            var13 = 1;
            var14 = arg5;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg3; var16++) {
            if (arg0) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field8394.field674) {
                int[] var18 = this.field8394.method24(var16, true);
                var19 = var18;
                var20 = var18;
                var21 = var18;
            } else {
                int[][] var22 = this.field8394.method5(var16, 1);
                var21 = var22[2];
                var19 = var22[1];
                var20 = var22[0];
            }
            for (int var23 = var12; var23 != var14; var23 += var13) {
                int var24 = var20[var23] >> 4;
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
                int var26 = var21[var23] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                int var27 = class145.field2089[var24];
                int var28 = class145.field2089[var25];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var29 = class145.field2089[var26];
                int var30 = (var27 << 16) + (var28 << 8) + var29;
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg0) {
                    var15 += arg5 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field8390.length; var17++) {
            this.field8390[var17].method3((byte) 118);
        }
        return var11;
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(Lfp;Ld;B)Z")
    public final boolean method3361(class323 arg0, class149 arg1, byte arg2) {
        field8391++;
        if (class202.field2641 >= 0) {
            for (int var4 = 0; var4 < this.field8385.length; var4++) {
                if (!arg0.method2097((byte) -114, class202.field2641, this.field8385[var4])) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field8385.length; var5++) {
                if (!arg0.method2088(this.field8385[var5], 127)) {
                    return false;
                }
            }
        }
        int var6 = 0;
        if (arg2 != 87) {
            return true;
        }
        while (var6 < this.field8393.length) {
            if (!arg1.method531(this.field8393[var6], -111)) {
                return false;
            }
            var6++;
        }
        return true;
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(I)V")
    public static void method3362(int arg0) {
        field8400 = null;
        field8401 = null;
        field8389 = null;
        field8397 = null;
        if (arg0 != 7407) {
            method3365((byte) 114, -89);
        }
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(ZILd;Lfp;II)[F")
    public final float[] method3363(boolean arg0, int arg1, class149 arg2, class323 arg3, int arg4, int arg5) {
        if (arg4 != 10028) {
            method3362(-120);
        }
        class119.field1442 = arg2;
        field8396++;
        class234.field3146 = arg3;
        for (int var7 = 0; var7 < this.field8390.length; var7++) {
            this.field8390[var7].method366(arg1, arg4 - 10029, arg5);
        }
        class193.method1196(-11775, arg5, arg1);
        float[] var8 = new float[arg1 * arg5 * 4];
        int var9 = 0;
        for (int var10 = 0; var10 < arg1; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field8394.field674) {
                int[] var16 = this.field8394.method24(var10, true);
                var15 = var16;
                var14 = var16;
                var13 = var16;
            } else {
                int[][] var12 = this.field8394.method5(var10, arg4 ^ 0x272D);
                var13 = var12[0];
                var14 = var12[2];
                var15 = var12[1];
            }
            int[] var17;
            if (this.field8386.field674) {
                var17 = this.field8386.method24(var10, true);
            } else {
                var17 = this.field8386.method5(var10, 1)[0];
            }
            if (arg0) {
                var9 = var10 << 2;
            }
            int[] var18;
            if (this.field8398.field674) {
                var18 = this.field8398.method24(var10, true);
            } else {
                var18 = this.field8398.method5(var10, 1)[0];
            }
            for (int var19 = arg5 - 1; var19 >= 0; var19--) {
                float var20 = (float) var17[var19] / 4096.0F;
                if ((var20 < 0.0F)) {
                    var20 = 0.0F;
                } else if (var20 > 1.0F) {
                    var20 = 1.0F;
                }
                float var21 = ((float) var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                var8[var9++] = (float) var13[var19] * var21;
                var8[var9++] = (float) var15[var19] * var21;
                var8[var9++] = (float) var14[var19] * var21;
                var8[var9++] = var20;
                if (arg0) {
                    var9 += (arg5 << 2) - 4;
                }
            }
        }
        for (int var11 = 0; var11 < this.field8390.length; var11++) {
            this.field8390[var11].method3((byte) -43);
        }
        return var8;
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(IIBI)I")
    public static final int method3364(int arg0, int arg1, byte arg2, int arg3) {
        field8388++;
        int var4 = arg3 / arg1;
        int var5 = arg1 - 1 & arg3;
        int var6 = arg0 / arg1;
        int var7 = arg0 & arg1 - 1;
        int var8 = class261.method1709(255, var6, var4);
        int var9 = class261.method1709(255, var6, var4 + 1);
        int var10 = class261.method1709(255, var6 + 1, var4);
        if (arg2 == 93) {
            int var11 = class261.method1709(arg2 ^ 0xA2, var6 + 1, var4 + 1);
            int var12 = class54.method335(var5, arg1, (byte) 103, var9, var8);
            int var13 = class54.method335(var5, arg1, (byte) 103, var11, var10);
            return class54.method335(var7, arg1, (byte) 103, var13, var12);
        } else {
            return -127;
        }
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(BI)V")
    public static final void method3365(byte arg0, int arg1) {
        field8395++;
        if (arg1 < 0 || arg1 > 2) {
            arg1 = 0;
        }
        int var2 = 126 / ((arg0 - 75) / 51);
        class530.field7471 = arg1;
        class750.field10404 = new class537[class360.field5114[class530.field7471] + 1];
        class237.field3179 = 0;
        class679.field9329 = 0;
    }

    @OriginalMember(owner = "client!oea", name = "<init>", descriptor = "()V")
    public class597() {
        this.field8393 = new int[0];
        this.field8385 = new int[0];
        this.field8398 = new class504(0);
        this.field8398.field676 = 1;
        this.field8394 = new class504();
        this.field8394.field676 = 1;
        this.field8386 = new class504();
        this.field8386.field676 = 1;
        this.field8390 = new class56[] { this.field8394, this.field8386, this.field8398 };
    }

    @OriginalMember(owner = "client!oea", name = "<init>", descriptor = "(Lee;)V")
    public class597(class675 arg0) {
        int var2 = arg0.method3750((byte) 35);
        int var3 = 0;
        int var4 = 0;
        this.field8390 = new class56[var2];
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class56 var16 = class425.method2596(17956, arg0);
            if (var16.method4(8347) >= 0) {
                var3++;
            }
            if (var16.method365(-1) >= 0) {
                var4++;
            }
            int var17 = var16.field667.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method3750((byte) 35);
            }
            this.field8390[var6] = var16;
        }
        this.field8385 = new int[var3];
        this.field8393 = new int[var4];
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class56 var11 = this.field8390[var9];
            int var12 = var11.field667.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field667[var13] = this.field8390[var5[var9][var13]];
            }
            int var14 = var11.method4(8347);
            int var15 = var11.method365(-1);
            if (var14 > 0) {
                this.field8385[var7++] = var14;
            }
            if (var15 > 0) {
                this.field8393[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field8394 = this.field8390[arg0.method3750((byte) 35)];
        this.field8386 = this.field8390[arg0.method3750((byte) 35)];
        Object var10 = null;
        this.field8398 = this.field8390[arg0.method3750((byte) 35)];
    }
}
