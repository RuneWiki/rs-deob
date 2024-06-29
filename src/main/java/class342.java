import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class342 extends class7 {

    @OriginalMember(owner = "client!cr", name = "v", descriptor = "[I")
    private int[] field5269;

    @OriginalMember(owner = "client!cr", name = "C", descriptor = "[I")
    private int[] field5275;

    @OriginalMember(owner = "client!cr", name = "I", descriptor = "Lna;")
    private class30 field5280;

    @OriginalMember(owner = "client!cr", name = "L", descriptor = "Lna;")
    private class30 field5283;

    @OriginalMember(owner = "client!cr", name = "B", descriptor = "Lna;")
    private class30 field5274;

    @OriginalMember(owner = "client!cr", name = "w", descriptor = "[Lna;")
    private class30[] field5270;

    @OriginalMember(owner = "client!cr", name = "J", descriptor = "I")
    public static int field5281 = 0;

    @OriginalMember(owner = "client!cr", name = "x", descriptor = "I")
    public static int field5271;

    @OriginalMember(owner = "client!cr", name = "y", descriptor = "I")
    public static int field5272;

    @OriginalMember(owner = "client!cr", name = "z", descriptor = "I")
    public static int field5273;

    @OriginalMember(owner = "client!cr", name = "G", descriptor = "I")
    public static int field5278;

    @OriginalMember(owner = "client!cr", name = "H", descriptor = "I")
    public static int field5279;

    @OriginalMember(owner = "client!cr", name = "K", descriptor = "I")
    public static int field5282;

    @OriginalMember(owner = "client!cr", name = "D", descriptor = "Lmo;")
    public static class447 field5276;

    @OriginalMember(owner = "client!cr", name = "F", descriptor = "Lmo;")
    public static class447 field5277;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lmo;BLah;ZII)[F")
    public final float[] method2242(class447 arg0, byte arg1, class215 arg2, boolean arg3, int arg4, int arg5) {
        field5272++;
        class111.field1545 = arg2;
        class422.field6242 = arg0;
        for (int var7 = 0; var7 < this.field5270.length; var7++) {
            this.field5270[var7].method202((byte) 112, arg4, arg5);
        }
        class299.method2017((byte) 47, arg5, arg4);
        float[] var8 = new float[arg4 * arg5 * 4];
        int var9 = 0;
        for (int var10 = 0; var10 < arg4; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field5283.field376) {
                int[] var12 = this.field5283.method116(var10, (byte) 93);
                var13 = var12;
                var14 = var12;
                var15 = var12;
            } else {
                int[][] var16 = this.field5283.method203((byte) -93, var10);
                var14 = var16[2];
                var15 = var16[1];
                var13 = var16[0];
            }
            int[] var17;
            if (this.field5274.field376) {
                var17 = this.field5274.method116(var10, (byte) 122);
            } else {
                var17 = this.field5274.method203((byte) -93, var10)[0];
            }
            int[] var18;
            if (this.field5280.field376) {
                var18 = this.field5280.method116(var10, (byte) 72);
            } else {
                var18 = this.field5280.method203((byte) -93, var10)[0];
            }
            if (arg3) {
                var9 = var10 << 2;
            }
            for (int var19 = arg5 - 1; var19 >= 0; var19--) {
                float var20 = (float) var17[var19] / 4096.0F;
                float var21 = ((float) var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                if (var20 < 0.0F) {
                    var20 = 0.0F;
                } else if (var20 > 1.0F) {
                    var20 = 1.0F;
                }
                var8[var9++] = (float) var13[var19] * var21;
                var8[var9++] = (float) var15[var19] * var21;
                var8[var9++] = (float) var14[var19] * var21;
                var8[var9++] = var20;
                if (arg3) {
                    var9 += (arg5 << 2) - 4;
                }
            }
        }
        if (arg1 != -81) {
            method2244(28, (byte) -53);
        }
        for (int var11 = 0; var11 < this.field5270.length; var11++) {
            this.field5270[var11].method207((byte) -117);
        }
        return var8;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(DZLah;IIZILmo;)[I")
    public final int[] method2243(double arg0, boolean arg1, class215 arg2, int arg3, int arg4, boolean arg5, int arg6, class447 arg7) {
        class111.field1545 = arg2;
        field5273++;
        if (arg6 != -256) {
            this.field5275 = null;
        }
        class422.field6242 = arg7;
        for (int var10 = 0; var10 < this.field5270.length; var10++) {
            this.field5270[var10].method202((byte) 112, arg4, arg3);
        }
        class340.method2237(arg6 ^ 0xFFFFFF46, arg0);
        class299.method2017((byte) 47, arg3, arg4);
        int[] var11 = new int[arg3 * arg4];
        int var12;
        int var13;
        byte var14;
        if (arg1) {
            var12 = arg3 - 1;
            var13 = -1;
            var14 = -1;
        } else {
            var12 = 0;
            var14 = 1;
            var13 = arg3;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg4; var16++) {
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field5283.field376) {
                int[] var18 = this.field5283.method116(var16, (byte) 112);
                var19 = var18;
                var20 = var18;
                var21 = var18;
            } else {
                int[][] var22 = this.field5283.method203((byte) -93, var16);
                var21 = var22[2];
                var20 = var22[0];
                var19 = var22[1];
            }
            if (arg5) {
                var15 = var16;
            }
            for (int var23 = var12; var23 != var13; var23 += var14) {
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
                int var27 = class392.field5894[var25];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var28 = class392.field5894[var24];
                int var29 = class392.field5894[var26];
                int var30 = (var27 << 8) + (var28 << 16) + var29;
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg5) {
                    var15 += arg3 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field5270.length; var17++) {
            this.field5270[var17].method207((byte) -117);
        }
        return var11;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IB)V")
    public static final void method2244(int arg0, byte arg1) {
        class52 var2 = class308.field4876;
        synchronized (class308.field4876) {
            class308.field4876.method337(arg0, (byte) -118);
        }
        if (arg1 != -75) {
            method2244(109, (byte) 28);
        }
        field5271++;
        class52 var3 = class86.field1081;
        synchronized (class86.field1081) {
            class86.field1081.method337(arg0, (byte) -128);
        }
        class52 var4 = class30.field373;
        synchronized (class30.field373) {
            class30.field373.method337(arg0, (byte) -117);
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(DIBLah;Lmo;ZI)[I")
    public final int[] method2245(double arg0, int arg1, byte arg2, class215 arg3, class447 arg4, boolean arg5, int arg6) {
        field5279++;
        class111.field1545 = arg3;
        class422.field6242 = arg4;
        for (int var9 = 0; var9 < this.field5270.length; var9++) {
            this.field5270[var9].method202((byte) 112, arg6, arg1);
        }
        class340.method2237(103, arg0);
        class299.method2017((byte) 47, arg1, arg6);
        if (arg2 > -73) {
            this.method2242((class447) null, (byte) -109, (class215) null, false, -23, -64);
        }
        int[] var10 = new int[arg6 * 4 * arg1];
        int var11 = 0;
        for (int var12 = 0; var12 < arg6; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field5283.field376) {
                int[] var18 = this.field5283.method116(var12, (byte) 74);
                var16 = var18;
                var17 = var18;
                var15 = var18;
            } else {
                int[][] var14 = this.field5283.method203((byte) -93, var12);
                var15 = var14[0];
                var16 = var14[1];
                var17 = var14[2];
            }
            int[] var19;
            if (this.field5274.field376) {
                var19 = this.field5274.method116(var12, (byte) 64);
            } else {
                var19 = this.field5274.method203((byte) -93, var12)[0];
            }
            if (arg5) {
                var11 = var12;
            }
            for (int var20 = arg1 - 1; var20 >= 0; var20--) {
                int var21 = var15[var20] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var22 = var16[var20] >> 4;
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
                int var24 = class392.field5894[var21];
                int var25 = class392.field5894[var22];
                if (var23 < 0) {
                    var23 = 0;
                }
                int var26 = class392.field5894[var23];
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
                var10[var11++] = (var27 << 24) + (var24 << 16) + (var25 << 8) + var26;
                if (arg5) {
                    var11 += arg1 - 1;
                }
            }
        }
        for (int var13 = 0; var13 < this.field5270.length; var13++) {
            this.field5270[var13].method207((byte) -117);
        }
        return var10;
    }

    @OriginalMember(owner = "client!cr", name = "f", descriptor = "(I)V")
    public static void method2246(int arg0) {
        field5277 = null;
        if (arg0 != 0) {
            method2246(-39);
        }
        field5276 = null;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(BLmo;Lah;)Z")
    public final boolean method2247(byte arg0, class447 arg1, class215 arg2) {
        field5278++;
        if (class431.field6355 > 0) {
            for (int var4 = 0; var4 < this.field5275.length; var4++) {
                if (!arg1.method2775(this.field5275[var4], (byte) -37, class431.field6355)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field5275.length; var5++) {
                if (!arg1.method2762(1, this.field5275[var5])) {
                    return false;
                }
            }
        }
        if (arg0 <= 56) {
            return true;
        }
        for (int var6 = 0; var6 < this.field5269.length; var6++) {
            if (!arg2.method985(this.field5269[var6], (byte) -16)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!cr", name = "g", descriptor = "(I)V")
    public static final void method2248(int arg0) {
        field5282++;
        if (arg0 > ~class407.field6044) {
            class392.method2474((byte) 122);
        } else {
            class68.field853 = class421.field6216;
            class421.field6216 = null;
            class128.method953(16205, 40);
        }
    }

    @OriginalMember(owner = "client!cr", name = "<init>", descriptor = "()V")
    public class342() {
        this.field5269 = new int[0];
        this.field5275 = new int[0];
        this.field5280 = new class448(0);
        this.field5280.field363 = 1;
        this.field5283 = new class448();
        this.field5283.field363 = 1;
        this.field5274 = new class448();
        this.field5274.field363 = 1;
        this.field5270 = new class30[] { this.field5283, this.field5274, this.field5280 };
    }

    @OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(Ljg;)V")
    public class342(class186 arg0) {
        int var2 = arg0.method1322(false);
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        this.field5270 = new class30[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            class30 var16 = class378.method2406(arg0, 0);
            if (var16.method204(97) >= 0) {
                var3++;
            }
            if (var16.method201((byte) -35) >= 0) {
                var4++;
            }
            int var17 = var16.field370.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method1322(false);
            }
            this.field5270[var6] = var16;
        }
        this.field5275 = new int[var3];
        this.field5269 = new int[var4];
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class30 var11 = this.field5270[var9];
            int var12 = var11.field370.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field370[var13] = this.field5270[var5[var9][var13]];
            }
            int var14 = var11.method204(105);
            int var15 = var11.method201((byte) -111);
            if (var14 > 0) {
                this.field5275[var7++] = var14;
            }
            if (var15 > 0) {
                this.field5269[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field5283 = this.field5270[arg0.method1322(false)];
        this.field5274 = this.field5270[arg0.method1322(false)];
        this.field5280 = this.field5270[arg0.method1322(false)];
        Object var10 = null;
    }
}
