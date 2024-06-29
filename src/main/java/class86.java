import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public class class86 extends class623 {

    @OriginalMember(owner = "client!kt", name = "D", descriptor = "[I")
    private int[] field1103;

    @OriginalMember(owner = "client!kt", name = "A", descriptor = "[I")
    private int[] field1100;

    @OriginalMember(owner = "client!kt", name = "w", descriptor = "Luu;")
    private class529 field1096;

    @OriginalMember(owner = "client!kt", name = "z", descriptor = "Luu;")
    private class529 field1099;

    @OriginalMember(owner = "client!kt", name = "s", descriptor = "Luu;")
    private class529 field1092;

    @OriginalMember(owner = "client!kt", name = "B", descriptor = "[Luu;")
    private class529[] field1101;

    @OriginalMember(owner = "client!kt", name = "x", descriptor = "I")
    public static int field1097 = 1;

    @OriginalMember(owner = "client!kt", name = "E", descriptor = "Z")
    public static boolean field1104 = false;

    @OriginalMember(owner = "client!kt", name = "t", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!kt", name = "u", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!kt", name = "v", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!kt", name = "G", descriptor = "I")
    public static int field1105;

    @OriginalMember(owner = "client!kt", name = "C", descriptor = "Lql;")
    public static class187 field1102;

    @OriginalMember(owner = "client!kt", name = "y", descriptor = "[I")
    public static int[] field1098;

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(ZIILd;DILkha;)[I")
    public final int[] method601(boolean arg0, int arg1, int arg2, class96 arg3, double arg4, int arg5, class687 arg6) {
        class44.field666 = arg6;
        field1095++;
        class224.field2961 = arg3;
        for (int var9 = 0; var9 < this.field1101.length; var9++) {
            this.field1101[var9].method2607(arg1 ^ 0xFFFFFF02, arg5, arg2);
        }
        class29.method294(arg4, (byte) -128);
        class101.method679(arg2, 0, arg5);
        int[] var10 = new int[arg2 * arg5];
        int var11 = 0;
        int var12 = 0;
        if (arg1 != 2) {
            this.method605(null, 127, true, 5, null, true);
        }
        while (arg5 > var12) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field1099.field7461) {
                int[] var18 = this.field1099.method191(var12, (byte) 113);
                var17 = var18;
                var15 = var18;
                var16 = var18;
            } else {
                int[][] var14 = this.field1099.method592(var12, 2);
                var15 = var14[1];
                var16 = var14[0];
                var17 = var14[2];
            }
            int[] var19;
            if (this.field1092.field7461) {
                var19 = this.field1092.method191(var12, (byte) 87);
            } else {
                var19 = this.field1092.method592(var12, 2)[0];
            }
            if (arg0) {
                var11 = var12;
            }
            for (int var20 = arg2 - 1; var20 >= 0; var20--) {
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
                int var24 = class471.field6766[var21];
                if (var23 < 0) {
                    var23 = 0;
                }
                int var25 = class471.field6766[var22];
                int var26 = class471.field6766[var23];
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
                var10[var11++] = (var25 << 8) + (var27 << 24) + (var24 << 16) + var26;
                if (arg0) {
                    var11 += arg2 - 1;
                }
            }
            var12++;
        }
        for (int var13 = 0; var13 < this.field1101.length; var13++) {
            this.field1101[var13].method2608((byte) -77);
        }
        return var10;
    }

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "(I)V")
    public static void method602(int arg0) {
        field1102 = null;
        if (arg0 == -16777216) {
            field1098 = null;
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(BLd;Lkha;)Z")
    public final boolean method603(byte arg0, class96 arg1, class687 arg2) {
        field1094++;
        if (class373.field5240 < 0) {
            for (int var4 = 0; var4 < this.field1100.length; var4++) {
                if (!arg2.method3827(this.field1100[var4], (byte) 112)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field1100.length; var5++) {
                if (!arg2.method3811(this.field1100[var5], (byte) 101, class373.field5240)) {
                    return false;
                }
            }
        }
        if (arg0 >= -38) {
            return false;
        }
        for (int var6 = 0; var6 < this.field1103.length; var6++) {
            if (!arg1.method390(this.field1103[var6], -9396)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(ZZIBLd;Lkha;ID)[I")
    public final int[] method604(boolean arg0, boolean arg1, int arg2, byte arg3, class96 arg4, class687 arg5, int arg6, double arg7) {
        class44.field666 = arg5;
        field1105++;
        class224.field2961 = arg4;
        for (int var10 = 0; var10 < this.field1101.length; var10++) {
            this.field1101[var10].method2607(-256, arg6, arg2);
        }
        class29.method294(arg7, (byte) 36);
        class101.method679(arg2, 0, arg6);
        int[] var11 = new int[arg2 * arg6];
        byte var12;
        int var13;
        int var14;
        if (arg0) {
            var12 = -1;
            var13 = arg2 - 1;
            var14 = -1;
        } else {
            var14 = arg2;
            var12 = 1;
            var13 = 0;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg6; var16++) {
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field1099.field7461) {
                int[] var18 = this.field1099.method191(var16, (byte) -87);
                var19 = var18;
                var20 = var18;
                var21 = var18;
            } else {
                int[][] var22 = this.field1099.method592(var16, 2);
                var20 = var22[1];
                var21 = var22[2];
                var19 = var22[0];
            }
            if (arg1) {
                var15 = var16;
            }
            for (int var23 = var13; var23 != var14; var23 += var12) {
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
                int var27 = class471.field6766[var25];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var28 = class471.field6766[var24];
                int var29 = class471.field6766[var26];
                int var30 = (var28 << 16) + (var27 << 8) + var29;
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg1) {
                    var15 += arg2 - 1;
                }
            }
        }
        if (arg3 != 40) {
            this.method604(false, true, 49, (byte) 72, null, null, 14, 1.2655873259578192D);
        }
        for (int var17 = 0; var17 < this.field1101.length; var17++) {
            this.field1101[var17].method2608((byte) -107);
        }
        return var11;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(Ld;IZILkha;Z)[F")
    public final float[] method605(class96 arg0, int arg1, boolean arg2, int arg3, class687 arg4, boolean arg5) {
        class224.field2961 = arg0;
        class44.field666 = arg4;
        field1093++;
        for (int var7 = 0; var7 < this.field1101.length; var7++) {
            this.field1101[var7].method2607(-256, arg3, arg1);
        }
        class101.method679(arg1, 0, arg3);
        float[] var8 = new float[arg1 * arg3 * 4];
        int var9 = 0;
        if (!arg2) {
            return null;
        }
        for (int var10 = 0; var10 < arg3; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field1099.field7461) {
                int[] var12 = this.field1099.method191(var10, (byte) 108);
                var13 = var12;
                var14 = var12;
                var15 = var12;
            } else {
                int[][] var16 = this.field1099.method592(var10, 2);
                var15 = var16[2];
                var13 = var16[0];
                var14 = var16[1];
            }
            int[] var17;
            if (this.field1092.field7461) {
                var17 = this.field1092.method191(var10, (byte) 81);
            } else {
                var17 = this.field1092.method592(var10, 2)[0];
            }
            int[] var18;
            if (this.field1096.field7461) {
                var18 = this.field1096.method191(var10, (byte) -61);
            } else {
                var18 = this.field1096.method592(var10, 2)[0];
            }
            if (arg5) {
                var9 = var10 << 2;
            }
            for (int var19 = arg1 - 1; var19 >= 0; var19--) {
                float var20 = (float) var17[var19] / 4096.0F;
                float var21 = ((float) var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                if ((var20 < 0.0F)) {
                    var20 = 0.0F;
                } else if (var20 > 1.0F) {
                    var20 = 1.0F;
                }
                var8[var9++] = (float) var13[var19] * var21;
                var8[var9++] = (float) var14[var19] * var21;
                var8[var9++] = (float) var15[var19] * var21;
                var8[var9++] = var20;
                if (arg5) {
                    var9 += (arg1 << 2) - 4;
                }
            }
        }
        for (int var11 = 0; var11 < this.field1101.length; var11++) {
            this.field1101[var11].method2608((byte) -63);
        }
        return var8;
    }

    @OriginalMember(owner = "client!kt", name = "<init>", descriptor = "()V")
    public class86() {
        this.field1103 = new int[0];
        this.field1100 = new int[0];
        this.field1096 = new class306(0);
        this.field1096.field7454 = 1;
        this.field1099 = new class306();
        this.field1099.field7454 = 1;
        this.field1092 = new class306();
        this.field1092.field7454 = 1;
        this.field1101 = new class529[] { this.field1099, this.field1092, this.field1096 };
    }

    @OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(Ltn;)V")
    public class86(class179 arg0) {
        int var2 = arg0.method1094(255);
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        this.field1101 = new class529[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            class529 var16 = class272.method1631(false, arg0);
            if (var16.method3027(20152) >= 0) {
                var3++;
            }
            if (var16.method2606(29543) >= 0) {
                var4++;
            }
            int var17 = var16.field7469.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method1094(255);
            }
            this.field1101[var6] = var16;
        }
        this.field1100 = new int[var3];
        int var7 = 0;
        this.field1103 = new int[var4];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class529 var11 = this.field1101[var9];
            int var12 = var11.field7469.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field7469[var13] = this.field1101[var5[var9][var13]];
            }
            int var14 = var11.method3027(20152);
            int var15 = var11.method2606(29543);
            if (var14 > 0) {
                this.field1100[var7++] = var14;
            }
            if (var15 > 0) {
                this.field1103[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field1099 = this.field1101[arg0.method1094(255)];
        this.field1092 = this.field1101[arg0.method1094(255)];
        Object var10 = null;
        this.field1096 = this.field1101[arg0.method1094(255)];
    }
}
