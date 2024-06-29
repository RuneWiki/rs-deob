import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class430 extends class477 {

    @OriginalMember(owner = "client!of", name = "I", descriptor = "[I")
    private int[] field5981;

    @OriginalMember(owner = "client!of", name = "G", descriptor = "[I")
    private int[] field5979;

    @OriginalMember(owner = "client!of", name = "E", descriptor = "Lvm;")
    private class349 field5977;

    @OriginalMember(owner = "client!of", name = "B", descriptor = "Lvm;")
    private class349 field5974;

    @OriginalMember(owner = "client!of", name = "H", descriptor = "Lvm;")
    private class349 field5980;

    @OriginalMember(owner = "client!of", name = "x", descriptor = "[Lvm;")
    private class349[] field5970;

    @OriginalMember(owner = "client!of", name = "F", descriptor = "Lcb;")
    public static class318 field5978 = new class318(67, 28);

    @OriginalMember(owner = "client!of", name = "K", descriptor = "Z")
    public static boolean field5983 = true;

    @OriginalMember(owner = "client!of", name = "L", descriptor = "I")
    public static int field5984 = 0;

    @OriginalMember(owner = "client!of", name = "J", descriptor = "Lcb;")
    public static class318 field5982 = new class318(35, 14);

    @OriginalMember(owner = "client!of", name = "v", descriptor = "I")
    public static int field5968;

    @OriginalMember(owner = "client!of", name = "w", descriptor = "I")
    public static int field5969;

    @OriginalMember(owner = "client!of", name = "y", descriptor = "I")
    public static int field5971;

    @OriginalMember(owner = "client!of", name = "z", descriptor = "I")
    public static int field5972;

    @OriginalMember(owner = "client!of", name = "A", descriptor = "I")
    public static int field5973;

    @OriginalMember(owner = "client!of", name = "C", descriptor = "I")
    public static int field5975;

    @OriginalMember(owner = "client!of", name = "D", descriptor = "I")
    public static int field5976;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Le;ILpq;ZII)[F", line = 7)
    public final float[] method2474(class479 arg0, int arg1, class159 arg2, boolean arg3, int arg4, int arg5) {
        class98.field1200 = arg2;
        field5971++;
        class38.field419 = arg0;
        for (int var7 = 0; var7 < this.field5970.length; var7++) {
            this.field5970[var7].method2184(arg1, 30229, arg5);
        }
        class261.method1635(-49, arg5, arg1);
        float[] var8 = new float[arg1 * arg5 * 4];
        int var9 = 0;
        if (arg4 != -21217) {
            this.method2479(-85, false, -0.7476970638506755D, null, 118, null, -1);
        }
        for (int var10 = 0; var10 < arg1; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field5974.field5100) {
                int[] var16 = this.field5974.method13((byte) -86, var10);
                var14 = var16;
                var15 = var16;
                var13 = var16;
            } else {
                int[][] var12 = this.field5974.method9(var10, (byte) 95);
                var13 = var12[2];
                var14 = var12[0];
                var15 = var12[1];
            }
            int[] var17;
            if (this.field5980.field5100) {
                var17 = this.field5980.method13((byte) -3, var10);
            } else {
                var17 = this.field5980.method9(var10, (byte) -100)[0];
            }
            int[] var18;
            if (this.field5977.field5100) {
                var18 = this.field5977.method13((byte) -45, var10);
            } else {
                var18 = this.field5977.method9(var10, (byte) 83)[0];
            }
            if (arg3) {
                var9 = var10 << 2;
            }
            for (int var19 = arg5 - 1; var19 >= 0; var19--) {
                float var20 = (float) var17[var19] / 4096.0F;
                float var21 = ((float) var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                if ((var20 < 0.0F)) {
                    var20 = 0.0F;
                } else if (var20 > 1.0F) {
                    var20 = 1.0F;
                }
                var8[var9++] = (float) var14[var19] * var21;
                var8[var9++] = (float) var15[var19] * var21;
                var8[var9++] = (float) var13[var19] * var21;
                var8[var9++] = var20;
                if (arg3) {
                    var9 += (arg5 << 2) - 4;
                }
            }
        }
        for (int var11 = 0; var11 < this.field5970.length; var11++) {
            this.field5970[var11].method2186(0);
        }
        return var8;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IBI)V", line = 117)
    public static final void method2475(int arg0, byte arg1, int arg2) {
        field5968++;
        if (arg1 != 38) {
            method2478((byte) 122);
        }
        class208 var3 = class390.field5608[arg2][arg0];
        if (var3 != null) {
            class326.field4750 = var3.field2737;
            class265.field3638 = var3.field2717;
            class572.field7918 = var3.field2728;
        }
        class143.method977((byte) -100);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(BLpq;Le;)Z", line = 142)
    public final boolean method2476(byte arg0, class159 arg1, class479 arg2) {
        field5973++;
        if (class454.field6200 >= 0) {
            for (int var4 = 0; var4 < this.field5979.length; var4++) {
                if (!arg1.method1081((byte) 35, class454.field6200, this.field5979[var4])) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field5979.length; var5++) {
                if (!arg1.method1086((byte) 125, this.field5979[var5])) {
                    return false;
                }
            }
        }
        int var6 = 81 % ((arg0 - 4) / 55);
        for (int var7 = 0; var7 < this.field5981.length; var7++) {
            if (!arg2.method1732(this.field5981[var7], 39)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(B)V", line = 194)
    public static void method2477(byte arg0) {
        field5978 = null;
        field5982 = null;
        if (arg0 != -23) {
            field5978 = null;
        }
    }

    @OriginalMember(owner = "client!of", name = "d", descriptor = "(B)V", line = 207)
    public static final void method2478(byte arg0) {
        if (arg0 != -124) {
            method2477((byte) 65);
        }
        field5976++;
        int var1 = class72.field935.method1855(28869, class161.field2038);
        if (var1 == 0) {
            class361.field5210 = null;
            class66.method394(0, true);
        } else if (var1 == 1) {
            class298.method1781(0, (byte) 0);
            class66.method394(512, true);
            if (class645.field9140 != null) {
                class476.method2667(23057);
            }
        } else {
            class298.method1781(arg0 ^ 0xFFFFFF84, (byte) (class426.field5928 - 4 & 0xFF));
            class66.method394(2, true);
        }
        class476.field6439 = class432.field5993;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IZDLe;ILpq;I)[I", line = 244)
    public final int[] method2479(int arg0, boolean arg1, double arg2, class479 arg3, int arg4, class159 arg5, int arg6) {
        field5969++;
        class98.field1200 = arg5;
        class38.field419 = arg3;
        for (int var9 = 0; var9 < this.field5970.length; var9++) {
            this.field5970[var9].method2184(arg6, 30229, arg0);
        }
        class21.method119(arg2, (byte) 115);
        class261.method1635(-41, arg0, arg6);
        if (arg4 != 7621) {
            return null;
        }
        int[] var10 = new int[arg0 * 4 * arg6];
        int var11 = 0;
        for (int var12 = 0; var12 < arg6; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field5974.field5100) {
                int[] var14 = this.field5974.method13((byte) -65, var12);
                var15 = var14;
                var16 = var14;
                var17 = var14;
            } else {
                int[][] var18 = this.field5974.method9(var12, (byte) 48);
                var15 = var18[1];
                var16 = var18[0];
                var17 = var18[2];
            }
            int[] var19;
            if (this.field5980.field5100) {
                var19 = this.field5980.method13((byte) -76, var12);
            } else {
                var19 = this.field5980.method9(var12, (byte) 38)[0];
            }
            if (arg1) {
                var11 = var12;
            }
            for (int var20 = arg0 - 1; var20 >= 0; var20--) {
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
                int var24 = class672.field9528[var22];
                int var25 = class672.field9528[var21];
                if (var23 < 0) {
                    var23 = 0;
                }
                int var26 = class672.field9528[var23];
                int var27;
                if (var25 == 0 && var24 == 0 && var26 == 0) {
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
                var10[var11++] = (var25 << 16) + (var27 << 24) + ((var24 << 8) - -var26);
                if (arg1) {
                    var11 += arg0 - 1;
                }
            }
        }
        for (int var13 = 0; var13 < this.field5970.length; var13++) {
            this.field5970[var13].method2186(0);
        }
        return var10;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ZILe;IDILpq;Z)[I", line = 379)
    public final int[] method2480(boolean arg0, int arg1, class479 arg2, int arg3, double arg4, int arg5, class159 arg6, boolean arg7) {
        class38.field419 = arg2;
        field5972++;
        class98.field1200 = arg6;
        for (int var10 = 0; var10 < this.field5970.length; var10++) {
            this.field5970[var10].method2184(arg1, arg3 + 30229, arg5);
        }
        class21.method119(arg4, (byte) 116);
        class261.method1635(-122, arg5, arg1);
        int[] var11 = new int[arg1 * arg5];
        int var12;
        int var13;
        byte var14;
        if (arg0) {
            var12 = -1;
            var13 = arg5 - 1;
            var14 = -1;
        } else {
            var12 = arg5;
            var13 = 0;
            var14 = 1;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg1; var16++) {
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field5974.field5100) {
                int[] var18 = this.field5974.method13((byte) 126, var16);
                var19 = var18;
                var20 = var18;
                var21 = var18;
            } else {
                int[][] var22 = this.field5974.method9(var16, (byte) 124);
                var20 = var22[2];
                var19 = var22[0];
                var21 = var22[1];
            }
            if (arg7) {
                var15 = var16;
            }
            for (int var23 = var13; var23 != var12; var23 += var14) {
                int var24 = var19[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = var21[var23] >> 4;
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
                int var27 = class672.field9528[var24];
                int var28 = class672.field9528[var25];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var29 = class672.field9528[var26];
                int var30 = (var27 << 16) + (var28 << 8) + var29;
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg7) {
                    var15 += arg5 - 1;
                }
            }
        }
        for (int var17 = arg3; var17 < this.field5970.length; var17++) {
            this.field5970[var17].method2186(arg3);
        }
        return var11;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(BIIIIIIIII)V", line = 521)
    public static final void method2481(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 >= -10) {
            return;
        }
        if (arg1 >= class398.field5676 && class298.field3995 >= arg1 && arg5 >= class398.field5676 && class298.field3995 >= arg5 && arg6 >= class398.field5676 && class298.field3995 >= arg6 && class398.field5676 <= arg7 && class298.field3995 >= arg7 && class609.field8313 <= arg2 && arg2 <= class19.field169 && arg8 >= class609.field8313 && arg8 <= class19.field169 && class609.field8313 <= arg3 && class19.field169 >= arg3 && arg9 >= class609.field8313 && arg9 <= class19.field169) {
            class190.method1221(arg9, arg7, arg5, arg1, (byte) 45, arg3, arg2, arg6, arg8, arg4);
        } else {
            class613.method3372(arg7, arg5, arg3, arg1, arg9, 110, arg2, arg6, arg8, arg4);
        }
        field5975++;
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "()V", line = 540)
    public class430() {
        this.field5981 = new int[0];
        this.field5979 = new int[0];
        this.field5977 = new class211(0);
        this.field5977.field5106 = 1;
        this.field5974 = new class211();
        this.field5974.field5106 = 1;
        this.field5980 = new class211();
        this.field5970 = new class349[] { this.field5974, this.field5980, this.field5977 };
        this.field5980.field5106 = 1;
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "(Ldga;)V", line = 555)
    public class430(class138 arg0) {
        int var2 = arg0.method957((byte) -109);
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        this.field5970 = new class349[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            class349 var16 = class265.method1639(false, arg0);
            if (var16.method2185(-60) >= 0) {
                var3++;
            }
            if (var16.method2182(7622) >= 0) {
                var4++;
            }
            int var17 = var16.field5099.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method957((byte) -98);
            }
            this.field5970[var6] = var16;
        }
        this.field5979 = new int[var3];
        int var7 = 0;
        this.field5981 = new int[var4];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class349 var11 = this.field5970[var9];
            int var12 = var11.field5099.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field5099[var13] = this.field5970[var5[var9][var13]];
            }
            int var14 = var11.method2185(104);
            int var15 = var11.method2182(7622);
            if (var14 > 0) {
                this.field5979[var7++] = var14;
            }
            if (var15 > 0) {
                this.field5981[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field5974 = this.field5970[arg0.method957((byte) -128)];
        this.field5980 = this.field5970[arg0.method957((byte) -126)];
        this.field5977 = this.field5970[arg0.method957((byte) -71)];
        Object var10 = null;
    }
}
