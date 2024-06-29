import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class379 extends class47 {

    @OriginalMember(owner = "client!uj", name = "D", descriptor = "[I")
    private int[] field5200;

    @OriginalMember(owner = "client!uj", name = "G", descriptor = "[I")
    private int[] field5203;

    @OriginalMember(owner = "client!uj", name = "M", descriptor = "Lol;")
    private class264 field5209;

    @OriginalMember(owner = "client!uj", name = "R", descriptor = "Lol;")
    private class264 field5213;

    @OriginalMember(owner = "client!uj", name = "F", descriptor = "Lol;")
    private class264 field5202;

    @OriginalMember(owner = "client!uj", name = "I", descriptor = "[Lol;")
    private class264[] field5205;

    @OriginalMember(owner = "client!uj", name = "H", descriptor = "[Ljava/lang/String;")
    public static String[] field5204 = new String[100];

    @OriginalMember(owner = "client!uj", name = "Q", descriptor = "I")
    public static int field5212 = -1;

    @OriginalMember(owner = "client!uj", name = "P", descriptor = "Lrc;")
    public static class108 field5211 = new class108(81, 15);

    @OriginalMember(owner = "client!uj", name = "S", descriptor = "Lch;")
    public static class151 field5214 = new class151("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

    @OriginalMember(owner = "client!uj", name = "B", descriptor = "I")
    public static int field5198;

    @OriginalMember(owner = "client!uj", name = "C", descriptor = "I")
    public static int field5199;

    @OriginalMember(owner = "client!uj", name = "E", descriptor = "I")
    public static int field5201;

    @OriginalMember(owner = "client!uj", name = "J", descriptor = "I")
    public static int field5206;

    @OriginalMember(owner = "client!uj", name = "K", descriptor = "I")
    public static int field5207;

    @OriginalMember(owner = "client!uj", name = "L", descriptor = "I")
    public static int field5208;

    @OriginalMember(owner = "client!uj", name = "O", descriptor = "I")
    public static int field5210;

    @OriginalMember(owner = "client!uj", name = "V", descriptor = "Lde;")
    public static class257 field5217;

    @OriginalMember(owner = "client!uj", name = "T", descriptor = "Lnl;")
    public static class435 field5215;

    @OriginalMember(owner = "client!uj", name = "U", descriptor = "[I")
    public static int[] field5216;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZILnl;ZLtq;I)[F", line = 3)
    public final float[] method2307(boolean arg0, int arg1, class435 arg2, boolean arg3, class248 arg4, int arg5) {
        class168.field2431 = arg4;
        field5199++;
        class183.field2758 = arg2;
        for (int var7 = 0; var7 < this.field5205.length; var7++) {
            this.field5205[var7].method1783(arg1, arg5, (byte) -99);
        }
        class168.method1219(arg1, arg5, (byte) -12);
        float[] var8 = new float[arg1 * arg5 * 4];
        int var9 = 0;
        for (int var10 = 0; var10 < arg5; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field5213.field3794) {
                int[] var16 = this.field5213.method90(var10, 21034);
                var13 = var16;
                var14 = var16;
                var15 = var16;
            } else {
                int[][] var12 = this.field5213.method5((byte) 116, var10);
                var13 = var12[2];
                var14 = var12[0];
                var15 = var12[1];
            }
            int[] var17;
            if (this.field5202.field3794) {
                var17 = this.field5202.method90(var10, 21034);
            } else {
                var17 = this.field5202.method5((byte) 116, var10)[0];
            }
            int[] var18;
            if (this.field5209.field3794) {
                var18 = this.field5209.method90(var10, 21034);
            } else {
                var18 = this.field5209.method5((byte) 116, var10)[0];
            }
            if (arg3) {
                var9 = var10 << 2;
            }
            for (int var19 = arg1 - 1; var19 >= 0; var19--) {
                float var20 = (float) var17[var19] / 4096.0F;
                if (var20 < 0.0F) {
                    var20 = 0.0F;
                } else if (var20 > 1.0F) {
                    var20 = 1.0F;
                }
                float var21 = ((float) var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                var8[var9++] = (float) var14[var19] * var21;
                var8[var9++] = (float) var15[var19] * var21;
                var8[var9++] = (float) var13[var19] * var21;
                var8[var9++] = var20;
                if (arg3) {
                    var9 += (arg1 << 2) - 4;
                }
            }
        }
        if (arg0) {
            field5214 = null;
        }
        for (int var11 = 0; var11 < this.field5205.length; var11++) {
            this.field5205[var11].method1669(-8433);
        }
        return var8;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Z)V", line = 121)
    public static void method2308(boolean arg0) {
        field5215 = null;
        field5216 = null;
        field5211 = null;
        field5204 = null;
        field5214 = null;
        if (!arg0) {
            method2313((class39) null, 92);
        }
        field5217 = null;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZILtq;DIBLnl;)[I", line = 140)
    public final int[] method2309(boolean arg0, int arg1, class248 arg2, double arg3, int arg4, byte arg5, class435 arg6) {
        class183.field2758 = arg6;
        if (arg5 >= -63) {
            return null;
        }
        field5207++;
        class168.field2431 = arg2;
        for (int var9 = 0; var9 < this.field5205.length; var9++) {
            this.field5205[var9].method1783(arg4, arg1, (byte) 103);
        }
        class69.method641(2, arg3);
        class168.method1219(arg4, arg1, (byte) -12);
        int[] var10 = new int[arg1 * arg4 * 4];
        int var11 = 0;
        for (int var12 = 0; var12 < arg1; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field5213.field3794) {
                int[] var18 = this.field5213.method90(var12, 21034);
                var17 = var18;
                var16 = var18;
                var15 = var18;
            } else {
                int[][] var14 = this.field5213.method5((byte) 116, var12);
                var15 = var14[1];
                var16 = var14[2];
                var17 = var14[0];
            }
            if (arg0) {
                var11 = var12;
            }
            int[] var19;
            if (this.field5202.field3794) {
                var19 = this.field5202.method90(var12, 21034);
            } else {
                var19 = this.field5202.method5((byte) 116, var12)[0];
            }
            for (int var20 = arg4 - 1; var20 >= 0; var20--) {
                int var21 = var17[var20] >> 4;
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
                int var23 = var16[var20] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var24 = class57.field837[var22];
                int var25 = class57.field837[var21];
                int var26 = class57.field837[var23];
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
                var10[var11++] = (var25 << 16) + (var27 << 24) + (var24 << 8) + var26;
                if (arg0) {
                    var11 += arg4 - 1;
                }
            }
        }
        for (int var13 = 0; var13 < this.field5205.length; var13++) {
            this.field5205[var13].method1669(-8433);
        }
        return var10;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILnl;ILtq;IZZD)[I", line = 274)
    public final int[] method2310(int arg0, class435 arg1, int arg2, class248 arg3, int arg4, boolean arg5, boolean arg6, double arg7) {
        field5198++;
        class168.field2431 = arg3;
        class183.field2758 = arg1;
        for (int var10 = 0; var10 < this.field5205.length; var10++) {
            this.field5205[var10].method1783(arg2, arg0, (byte) -90);
        }
        class69.method641(arg4 ^ 0xFD, arg7);
        class168.method1219(arg2, arg0, (byte) -12);
        int[] var11 = new int[arg0 * arg2];
        byte var12;
        int var13;
        int var14;
        if (arg5) {
            var12 = -1;
            var13 = arg2 - 1;
            var14 = -1;
        } else {
            var14 = arg2;
            var12 = 1;
            var13 = 0;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg0; var16++) {
            if (arg6) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field5213.field3794) {
                int[] var22 = this.field5213.method90(var16, 21034);
                var21 = var22;
                var19 = var22;
                var20 = var22;
            } else {
                int[][] var18 = this.field5213.method5((byte) 116, var16);
                var19 = var18[1];
                var20 = var18[2];
                var21 = var18[0];
            }
            for (int var23 = var13; var23 != var14; var23 += var12) {
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
                int var27 = class57.field837[var25];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var28 = class57.field837[var24];
                int var29 = class57.field837[var26];
                int var30 = (var27 << 8) + ((var28 << 16) + var29);
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg6) {
                    var15 += arg2 - 1;
                }
            }
        }
        if (arg4 == 255) {
            for (int var17 = 0; var17 < this.field5205.length; var17++) {
                this.field5205[var17].method1669(arg4 - 8688);
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIII)V", line = 408)
    public static final void method2311(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5208++;
        float var5 = (float) class330.field4581 / (float) class330.field4600;
        int var6 = arg3;
        int var7 = arg1;
        if (arg4 != -28154) {
            field5211 = null;
        }
        if ((var5 < 1.0F)) {
            var7 = (int) ((float) arg3 * var5);
        } else {
            var6 = (int) ((float) arg1 / var5);
        }
        int var8 = arg0 - (arg3 - var6) / 2;
        int var9 = arg2 - (arg1 - var7) / 2;
        class466.field6571 = -1;
        class309.field4388 = class330.field4600 * var8 / var6;
        class25.field267 = class330.field4581 - (class330.field4581 * var9 / var7);
        class430.field6008 = -1;
        class57.method521((byte) 72);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lnl;ZLtq;)Z", line = 453)
    public final boolean method2312(class435 arg0, boolean arg1, class248 arg2) {
        field5206++;
        if (class432.field6110 >= 0) {
            for (int var4 = 0; var4 < this.field5203.length; var4++) {
                if (!arg0.method2649(1, this.field5203[var4], class432.field6110)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field5203.length; var5++) {
                if (!arg0.method2627((byte) 80, this.field5203[var5])) {
                    return false;
                }
            }
        }
        if (!arg1) {
            return true;
        }
        for (int var6 = 0; var6 < this.field5200.length; var6++) {
            if (!arg2.method1223(-29838, this.field5200[var6])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lgf;I)V", line = 509)
    public static final void method2313(class39 arg0, int arg1) {
        if (arg1 != 0) {
            return;
        }
        field5201++;
        class31 var2 = (class31) class218.field3152.method1104(arg1 - 125, (long) arg0.field5751);
        if (var2 == null) {
            class68.method634((class361) null, arg0.field5811[0], 0, arg1 + 128, arg0.field5807[0], arg0.field4531, arg0, (class267) null);
        } else {
            var2.method198(-110);
        }
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "()V", line = 528)
    public class379() {
        this.field5200 = new int[0];
        this.field5203 = new int[0];
        this.field5209 = new class363(0);
        this.field5209.field3809 = 1;
        this.field5213 = new class363();
        this.field5213.field3809 = 1;
        this.field5202 = new class363();
        this.field5202.field3809 = 1;
        this.field5205 = new class264[] { this.field5213, this.field5202, this.field5209 };
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(Lkk;)V", line = 544)
    public class379(class161 arg0) {
        int var2 = arg0.method1172((byte) 6);
        int var3 = 0;
        int var4 = 0;
        this.field5205 = new class264[var2];
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class264 var16 = class436.method2665(-128, arg0);
            if (var16.method1670(1) >= 0) {
                var3++;
            }
            if (var16.method1781((byte) -118) >= 0) {
                var4++;
            }
            int var17 = var16.field3795.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method1172((byte) -128);
            }
            this.field5205[var6] = var16;
        }
        this.field5203 = new int[var3];
        int var7 = 0;
        this.field5200 = new int[var4];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class264 var11 = this.field5205[var9];
            int var12 = var11.field3795.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field3795[var13] = this.field5205[var5[var9][var13]];
            }
            int var14 = var11.method1670(1);
            int var15 = var11.method1781((byte) -85);
            if (var14 > 0) {
                this.field5203[var7++] = var14;
            }
            if (var15 > 0) {
                this.field5200[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field5213 = this.field5205[arg0.method1172((byte) -121)];
        this.field5202 = this.field5205[arg0.method1172((byte) -114)];
        this.field5209 = this.field5205[arg0.method1172((byte) 58)];
        Object var10 = null;
    }
}
