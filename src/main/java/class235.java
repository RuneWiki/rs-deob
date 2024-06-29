import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wda")
public class class235 extends class116 {

    @OriginalMember(owner = "client!wda", name = "f", descriptor = "I")
    private int field2998 = 0;

    @OriginalMember(owner = "client!wda", name = "o", descriptor = "I")
    private int field3007 = 0;

    @OriginalMember(owner = "client!wda", name = "k", descriptor = "I")
    private int field3003 = 0;

    @OriginalMember(owner = "client!wda", name = "D", descriptor = "I")
    private int field3022 = 0;

    @OriginalMember(owner = "client!wda", name = "n", descriptor = "Z")
    private boolean field3006 = false;

    @OriginalMember(owner = "client!wda", name = "j", descriptor = "I")
    private int field3002;

    @OriginalMember(owner = "client!wda", name = "i", descriptor = "Lre;")
    private class582 field3001;

    @OriginalMember(owner = "client!wda", name = "B", descriptor = "I")
    private int field3020;

    @OriginalMember(owner = "client!wda", name = "h", descriptor = "Lgq;")
    private class305 field3000;

    @OriginalMember(owner = "client!wda", name = "b", descriptor = "Z")
    private boolean field2994;

    @OriginalMember(owner = "client!wda", name = "c", descriptor = "Z")
    private boolean field2995;

    @OriginalMember(owner = "client!wda", name = "r", descriptor = "Z")
    private boolean field3010;

    @OriginalMember(owner = "client!wda", name = "v", descriptor = "Z")
    private boolean field3014;

    @OriginalMember(owner = "client!wda", name = "m", descriptor = "I")
    public static int field3005 = 0;

    @OriginalMember(owner = "client!wda", name = "t", descriptor = "[I")
    public static int[] field3012 = new int[25];

    @OriginalMember(owner = "client!wda", name = "p", descriptor = "I")
    public static int field3008 = 16777215;

    @OriginalMember(owner = "client!wda", name = "F", descriptor = "[S")
    public static short[] field3024 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!wda", name = "s", descriptor = "Luv;")
    public static class3 field3011 = new class3(9, 3);

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "I")
    public static int field2993;

    @OriginalMember(owner = "client!wda", name = "d", descriptor = "I")
    public static int field2996;

    @OriginalMember(owner = "client!wda", name = "e", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!wda", name = "g", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!wda", name = "l", descriptor = "I")
    public static int field3004;

    @OriginalMember(owner = "client!wda", name = "q", descriptor = "I")
    public static int field3009;

    @OriginalMember(owner = "client!wda", name = "u", descriptor = "I")
    public static int field3013;

    @OriginalMember(owner = "client!wda", name = "w", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!wda", name = "x", descriptor = "I")
    public static int field3016;

    @OriginalMember(owner = "client!wda", name = "y", descriptor = "I")
    public static int field3017;

    @OriginalMember(owner = "client!wda", name = "z", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!wda", name = "A", descriptor = "I")
    public static int field3019;

    @OriginalMember(owner = "client!wda", name = "C", descriptor = "I")
    public static int field3021;

    @OriginalMember(owner = "client!wda", name = "E", descriptor = "I")
    public static int field3023;

    @OriginalMember(owner = "client!wda", name = "G", descriptor = "I")
    public static int field3025;

    @OriginalMember(owner = "client!wda", name = "H", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(Z)V")
    public static final void method1484(boolean arg0) {
        field3018++;
        if (class76.method438(class630.field9188, 112) || class23.method136(arg0, class630.field9188)) {
            class408.method2434(class434.field5901 >> 12, -100, class196.field2555 >> 12, 5000);
        } else {
            int var1 = class147.field1899.field419[0] >> 3;
            int var2 = class147.field1899.field417[0] >> 3;
            if (var1 >= 0 && (class139.field1760 >> 3) > var1 && var2 >= 0 && var2 < class369.field5135 >> 3) {
                class408.method2434(var2, -102, var1, 5000);
            } else {
                class408.method2434(class369.field5135 >> 4, -96, class139.field1760 >> 4, 0);
            }
        }
        class642.method3708(-24507);
        class3.method8(-13544);
        class594.method3427((byte) 118);
        if (arg0) {
            field3008 = 113;
        }
        class29.method170(-18506);
    }

    @OriginalMember(owner = "client!wda", name = "BA", descriptor = "(III)V")
    public final void method626(int arg0, int arg1, int arg2) {
        field2999++;
    }

    @OriginalMember(owner = "client!wda", name = "DA", descriptor = "(IIIII)V")
    public final void method633(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3026++;
        class186 var6 = this.field3001.method3346((byte) 75);
        class186 var7 = this.field3001.method3299(-8435);
        int var8 = this.field3022 + arg1;
        int var9 = this.field3007 + arg0;
        this.field3000.method49(class6.field57, 27754);
        this.field3001.method3348(-2);
        this.field3001.method3344(29639, this.field3000);
        this.field3001.method3343(arg4, 0);
        this.field3001.method3291(arg2, 2);
        this.field3001.method3300(true, 1, class320.field4434);
        this.field3001.method3307(class320.field4434, 1, 16711680);
        this.field3001.method3334(8, arg3);
        var6.method1138(0, (float) this.field3020, (float) this.field3002, 0.0F);
        var6.method365(var9, var8, 0);
        var7.method1138(0, this.field3000.method1051(-3008, (float) this.field3020), this.field3000.method1053((byte) 3, (float) this.field3002), 1.0F);
        this.field3001.method3321((byte) -126, class620.field8928);
        this.field3001.method3336((byte) 59);
        this.field3001.method3317(1);
        this.field3001.method3323(0);
        this.field3001.method3300(true, 1, class17.field173);
        this.field3001.method3307(class17.field173, 1, 16711680);
    }

    @OriginalMember(owner = "client!wda", name = "ra", descriptor = "(IIIIIII)V")
    public final void method625(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3016++;
        class186 var8 = this.field3001.method3346((byte) 75);
        class186 var9 = this.field3001.method3299(-8435);
        this.field3000.method49(this.field2994 || this.field2995 ? class6.field57 : class96.field1289, 27754);
        this.field3001.method3348(-2);
        this.field3001.method3344(29639, this.field3000);
        this.field3001.method3343(arg6, 0);
        this.field3001.method3291(arg4, 2);
        this.field3001.method3300(true, 1, class320.field4434);
        this.field3001.method3307(class320.field4434, 1, 16711680);
        this.field3001.method3334(8, arg5);
        var9.method1138(0, this.field3000.method1051(-3008, (float) this.field3020), this.field3000.method1053((byte) 3, (float) this.field3002), 1.0F);
        if (this.field3006) {
            arg2 = this.field3002 * arg2 / this.method627();
            arg3 = this.field3020 * arg3 / this.method631();
            arg0 += this.field3007 * arg2 / this.field3002;
            arg1 += this.field3022 * arg3 / this.field3020;
        }
        var8.method1138(0, (float) arg3, (float) arg2, 0.0F);
        var8.method365(arg0, arg1, 0);
        this.field3001.method3321((byte) -128, class620.field8928);
        this.field3001.method3336((byte) 126);
        this.field3001.method3317(1);
        this.field3001.method3323(0);
        this.field3001.method3300(true, 1, class17.field173);
        this.field3001.method3307(class17.field173, 1, 16711680);
    }

    @OriginalMember(owner = "client!wda", name = "c", descriptor = "()I")
    public final int method637() {
        field3013++;
        return this.field3002;
    }

    @OriginalMember(owner = "client!wda", name = "ma", descriptor = "()I")
    public final int method631() {
        field3025++;
        return this.field3020 + this.field3003 + this.field3022;
    }

    @OriginalMember(owner = "client!wda", name = "KA", descriptor = "(IIII)V")
    public final void method623(int arg0, int arg1, int arg2, int arg3) {
        field3009++;
        this.field3003 = arg3;
        this.field3007 = arg0;
        this.field2998 = arg2;
        this.field3022 = arg1;
        this.field3006 = this.field3007 != 0 || this.field3022 != 0 || this.field2998 != 0 || this.field3003 != 0;
    }

    @OriginalMember(owner = "client!wda", name = "CA", descriptor = "(FFFFFFIII)V")
    public final void method636(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        field3004++;
        class186 var10 = this.field3001.method3346((byte) 75);
        class186 var11 = this.field3001.method3299(-8435);
        this.field3000.method49(this.field2994 || this.field2995 ? class6.field57 : class96.field1289, 27754);
        this.field3001.method3348(-2);
        this.field3001.method3344(29639, this.field3000);
        this.field3001.method3343(arg8, 0);
        this.field3001.method3291(arg6, 2);
        this.field3001.method3300(true, 1, class320.field4434);
        this.field3001.method3307(class320.field4434, 1, 16711680);
        this.field3001.method3334(8, arg7);
        if (this.field3006) {
            float var12 = (float) this.method627();
            float var13 = (float) this.method631();
            float var14 = (arg2 - arg0) / var12;
            float var15 = (arg3 - arg1) / var12;
            float var16 = (arg4 - arg0) / var13;
            float var17 = (arg5 - arg1) / var13;
            float var18 = (float) this.field3022 * var16;
            float var19 = (float) this.field3022 * var17;
            float var20 = (float) this.field3007 * var14;
            float var21 = (float) this.field3007 * var15;
            float var22 = (float) this.field2998 * -var14;
            float var23 = (float) this.field2998 * -var15;
            float var24 = (float) this.field3003 * -var16;
            arg4 = arg4 + var20 + var24;
            arg0 = arg0 + var20 + var18;
            arg1 = arg1 + var21 + var19;
            arg2 = arg2 + var22 + var18;
            float var25 = (float) this.field3003 * -var17;
            arg3 = arg3 + var23 + var19;
            arg5 = arg5 + var21 + var25;
        }
        var10.method1131(0.0F, arg2 - arg0, (byte) 19, arg3 - arg1, 1.0F, arg4 - arg0, 0.0F, 0.0F, 0.0F, arg5 - arg1);
        var10.method1146(arg1, arg0, 0.0F, 0);
        var11.method1138(0, this.field3000.method1051(-3008, (float) this.field3020), this.field3000.method1053((byte) 3, (float) this.field3002), 1.0F);
        this.field3001.method3321((byte) -125, class620.field8928);
        this.field3001.method3336((byte) 65);
        this.field3001.method3317(1);
        this.field3001.method3323(0);
        this.field3001.method3300(true, 1, class17.field173);
        this.field3001.method3307(class17.field173, 1, 16711680);
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(FFFFFFLpa;II)V")
    public final void method628(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class594 arg6, int arg7, int arg8) {
        field2993++;
        class186 var10 = this.field3001.method3346((byte) 75);
        class186 var11 = this.field3001.method3299(-8435);
        class78 var12 = (class78) arg6;
        class305 var13 = var12.field1061;
        this.field3000.method49(class96.field1289, 27754);
        this.field3001.method3348(-2);
        this.field3001.method3344(29639, this.field3000);
        this.field3001.method3343(1, 0);
        this.field3001.method3291(1, 2);
        if (this.field3006) {
            float var14 = (float) this.field3002 / (float) this.method627();
            float var15 = (float) this.field3020 / (float) this.method631();
            var10.method1131(0.0F, (arg2 - arg0) * var14, (byte) 19, (arg3 - arg1) * var14, 1.0F, (arg4 - arg0) * var15, 0.0F, 0.0F, 0.0F, (arg5 - arg1) * var15);
            var10.method1146(((float) this.field3022 + arg1) * var15, ((float) this.field3007 + arg0) * var14, 0.0F, 0);
        } else {
            var10.method1131(0.0F, arg2 - arg0, (byte) 19, arg3 - arg1, 1.0F, arg4 - arg0, 0.0F, 0.0F, 0.0F, arg5 - arg1);
            var10.method1146(arg1, arg0, 0.0F, 0);
        }
        var11.method1138(0, this.field3000.method1051(-3008, (float) this.field3020), this.field3000.method1053((byte) 3, (float) this.field3002), 1.0F);
        this.field3001.method3321((byte) -124, class620.field8928);
        this.field3001.method3339((byte) 90, 1);
        this.field3001.method3344(29639, var13);
        this.field3001.method3316(class509.field7093, 109, class443.field6123);
        this.field3001.method3300(true, 0, class17.field173);
        class186 var16 = this.field3001.method3299(-8435);
        var16.method362(var10);
        var16.method365(-arg7, -arg8, 0);
        var16.method1133(false, var13.method1053((byte) 3, 1.0F), 1.0F, var13.method1051(-3008, 1.0F));
        this.field3001.method3321((byte) -122, class620.field8928);
        this.field3001.method3336((byte) 87);
        this.field3001.method3317(1);
        this.field3001.method3323(0);
        this.field3001.method3300(true, 0, class93.field1233);
        this.field3001.method3316(class443.field6123, -125, class443.field6123);
        this.field3001.method3344(29639, null);
        this.field3001.method3339((byte) 90, 0);
        this.field3001.method3323(0);
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(IIIIIIIIILfd;I)Z")
    public static final boolean method1485(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class143 arg9, int arg10) {
        field2997++;
        int var11 = arg10;
        int var12 = arg7;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg10 - var13;
        class76.field1042[var13][var14] = 99;
        int var16 = arg7 - var14;
        if (arg5 != -17321) {
            field3012 = null;
        }
        class296.field3838[var13][var14] = 0;
        byte var17 = 0;
        class599.field8663[var17] = arg10;
        int var18 = 0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class424.field5744[var10001] = arg7;
        int[][] var19 = arg9.field1833;
        while (var26 != var18) {
            var12 = class424.field5744[var18];
            var11 = class599.field8663[var18];
            int var20 = var11 - var15;
            int var21 = var12 - var16;
            var18 = var18 + 1 & 0xFFF;
            int var22 = var11 - arg9.field1822;
            int var23 = var12 - arg9.field1839;
            if (arg1 == -4) {
                if (arg2 == var11 && arg4 == var12) {
                    class54.field725 = var11;
                    class95.field1284 = var12;
                    return true;
                }
            } else if (arg1 == -3) {
                if (class113.method610(21, 2, var12, 2, arg4, arg2, arg8, arg3, var11)) {
                    class95.field1284 = var12;
                    class54.field725 = var11;
                    return true;
                }
            } else if (arg1 == -2) {
                if (arg9.method786(var12, arg2, arg3, arg8, 2, 2, (byte) 83, arg4, arg6, var11)) {
                    class95.field1284 = var12;
                    class54.field725 = var11;
                    return true;
                }
            } else if (arg1 == -1) {
                if (arg9.method784(arg8, arg6, var11, arg4, arg3, var12, arg2, 8, 2)) {
                    class95.field1284 = var12;
                    class54.field725 = var11;
                    return true;
                }
            } else if (arg1 == 0 || arg1 == 1 || arg1 == 2 || arg1 == 3 || arg1 == 9) {
                if (arg9.method775(2, arg0, var11, 18906, var12, arg2, arg1, arg4)) {
                    class95.field1284 = var12;
                    class54.field725 = var11;
                    return true;
                }
            } else if (arg9.method772(arg0, var12, var11, 0, 2, arg1, arg2, arg4)) {
                class54.field725 = var11;
                class95.field1284 = var12;
                return true;
            }
            int var25 = class296.field3838[var20][var21] + 1;
            if (var20 > 0 && class76.field1042[var20 - 1][var21] == 0 && (var19[var22 - 1][var23] & 0x43A40000) == 0 && (var19[var22 - 1][var23 + 1] & 0x4E240000) == 0) {
                class599.field8663[var26] = var11 - 1;
                class424.field5744[var26] = var12;
                class76.field1042[var20 - 1][var21] = 2;
                var26 = var26 + 1 & 0xFFF;
                class296.field3838[var20 - 1][var21] = var25;
            }
            if (var20 < 126 && class76.field1042[var20 + 1][var21] == 0 && (var19[var22 + 2][var23] & 0x60E40000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78240000) == 0) {
                class599.field8663[var26] = var11 + 1;
                class424.field5744[var26] = var12;
                class76.field1042[var20 + 1][var21] = 8;
                var26 = var26 + 1 & 0xFFF;
                class296.field3838[var20 + 1][var21] = var25;
            }
            if (var21 > 0 && class76.field1042[var20][var21 - 1] == 0 && (var19[var22][var23 - 1] & 0x43A40000) == 0 && (var19[var22 + 1][var23 - 1] & 0x60E40000) == 0) {
                class599.field8663[var26] = var11;
                class424.field5744[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class76.field1042[var20][var21 - 1] = 1;
                class296.field3838[var20][var21 - 1] = var25;
            }
            if (var21 < 126 && class76.field1042[var20][var21 + 1] == 0 && (var19[var22][var23 + 2] & 0x4E240000) == 0 && (var19[var22 + 1][var23 + 2] & 0x78240000) == 0) {
                class599.field8663[var26] = var11;
                class424.field5744[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class76.field1042[var20][var21 + 1] = 4;
                class296.field3838[var20][var21 + 1] = var25;
            }
            if (var20 > 0 && var21 > 0 && class76.field1042[var20 - 1][var21 - 1] == 0 && (var19[var22 - 1][var23] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var22][var23 - 1] & 0x63E40000) == 0) {
                class599.field8663[var26] = var11 - 1;
                class424.field5744[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class76.field1042[var20 - 1][var21 - 1] = 3;
                class296.field3838[var20 - 1][var21 - 1] = var25;
            }
            if (var20 < 126 && var21 > 0 && class76.field1042[var20 + 1][var21 - 1] == 0 && (var19[var22 + 1][var23 - 1] & 0x63E40000) == 0 && (var19[var22 + 2][var23 - 1] & 0x60E40000) == 0 && (var19[var22 + 2][var23] & 0x78E40000) == 0) {
                class599.field8663[var26] = var11 + 1;
                class424.field5744[var26] = var12 - 1;
                class76.field1042[var20 + 1][var21 - 1] = 9;
                var26 = var26 + 1 & 0xFFF;
                class296.field3838[var20 + 1][var21 - 1] = var25;
            }
            if (var20 > 0 && var21 < 126 && class76.field1042[var20 - 1][var21 + 1] == 0 && (var19[var22 - 1][var23 + 1] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 + 2] & 0x4E240000) == 0 && (var19[var22][var23 + 2] & 0x7E240000) == 0) {
                class599.field8663[var26] = var11 - 1;
                class424.field5744[var26] = var12 + 1;
                class76.field1042[var20 - 1][var21 + 1] = 6;
                var26 = var26 + 1 & 0xFFF;
                class296.field3838[var20 - 1][var21 + 1] = var25;
            }
            if (var20 < 126 && var21 < 126 && class76.field1042[var20 + 1][var21 + 1] == 0 && (var19[var22 + 1][var23 + 2] & 0x7E240000) == 0 && (var19[var22 + 2][var23 + 2] & 0x78240000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78E40000) == 0) {
                class599.field8663[var26] = var11 + 1;
                class424.field5744[var26] = var12 + 1;
                class76.field1042[var20 + 1][var21 + 1] = 12;
                var26 = var26 + 1 & 0xFFF;
                class296.field3838[var20 + 1][var21 + 1] = var25;
            }
        }
        class54.field725 = var11;
        class95.field1284 = var12;
        return false;
    }

    @OriginalMember(owner = "client!wda", name = "EA", descriptor = "()I")
    public final int method627() {
        field3021++;
        return this.field3002 + this.field2998 + this.field3007;
    }

    @OriginalMember(owner = "client!wda", name = "i", descriptor = "(IIIIIII)V")
    public final void method621(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3017++;
        class186 var8 = this.field3001.method3346((byte) 75);
        class186 var9 = this.field3001.method3299(-8435);
        this.field3000.method49(class6.field57, 27754);
        this.field3001.method3348(-2);
        this.field3001.method3344(29639, this.field3000);
        this.field3001.method3343(arg6, 0);
        this.field3001.method3291(arg4, 2);
        this.field3001.method3300(true, 1, class320.field4434);
        this.field3001.method3307(class320.field4434, 1, 16711680);
        this.field3001.method3334(8, arg5);
        boolean var10 = this.field3014 && this.field3022 == 0 && this.field3003 == 0;
        boolean var11 = this.field3010 && this.field3007 == 0 && this.field2998 == 0;
        if ((var10 & var11)) {
            var9.method1138(0, this.field3000.method1051(-3008, (float) arg3), this.field3000.method1053((byte) 3, (float) arg2), 1.0F);
            var8.method1138(0, (float) arg3, (float) arg2, 0.0F);
            var8.method365(arg0, arg1, 0);
            this.field3001.method3321((byte) -123, class620.field8928);
            this.field3001.method3336((byte) 63);
            this.field3001.method3317(1);
        } else if (var11) {
            int var12 = arg1 + arg3;
            int var13 = this.method631();
            var9.method1138(0, this.field3000.method1051(-3008, (float) this.field3020), this.field3000.method1053((byte) 3, (float) arg2), 1.0F);
            this.field3001.method3321((byte) -124, class620.field8928);
            int var14 = this.field3022 + arg1;
            for (int var15 = this.field3020 + var14; var15 <= var12; var15 += var13) {
                var8.method1138(0, (float) this.field3020, (float) arg2, 0.0F);
                var8.method365(arg0, var14, 0);
                this.field3001.method3336((byte) 97);
                var14 += var13;
                this.field3001.method3317(1);
            }
            if (var12 > var14) {
                int var16 = var12 - var14;
                var9.method1138(0, this.field3000.method1051(-3008, (float) var16), this.field3000.method1053((byte) 3, (float) arg2), 1.0F);
                this.field3001.method3321((byte) -127, class620.field8928);
                var8.method1138(0, (float) var16, (float) arg2, 0.0F);
                var8.method365(arg0, var14, 0);
                this.field3001.method3336((byte) 118);
                this.field3001.method3317(1);
            }
        } else if (var10) {
            int var30 = arg0 + arg2;
            int var31 = this.method627();
            var9.method1138(0, this.field3000.method1051(-3008, (float) arg3), this.field3000.method1053((byte) 3, (float) this.field3002), 1.0F);
            this.field3001.method3321((byte) -127, class620.field8928);
            int var32 = arg0 + this.field3007;
            for (int var33 = this.field3002 + var32; var33 <= var30; var33 += var31) {
                var8.method1138(0, (float) arg3, (float) this.field3002, 0.0F);
                var8.method365(var32, arg1, 0);
                this.field3001.method3336((byte) 63);
                var32 += var31;
                this.field3001.method3317(1);
            }
            if (var30 > var32) {
                int var34 = var30 - var32;
                var9.method1138(0, this.field3000.method1051(-3008, (float) arg3), this.field3000.method1053((byte) 3, (float) var34), 1.0F);
                this.field3001.method3321((byte) -125, class620.field8928);
                var8.method1138(0, (float) arg3, (float) var34, 0.0F);
                var8.method365(var32, arg1, 0);
                this.field3001.method3336((byte) 74);
                this.field3001.method3317(1);
            }
        } else {
            int var17 = arg1 + arg3;
            int var18 = arg0 + arg2;
            int var19 = this.method627();
            int var20 = this.method631();
            int var21 = this.field3022 + arg1;
            for (int var22 = var21 + this.field3020; var22 <= var17; var22 += var20) {
                var9.method1138(0, this.field3000.method1051(-3008, (float) this.field3020), this.field3000.method1053((byte) 3, (float) this.field3002), 1.0F);
                this.field3001.method3321((byte) -121, class620.field8928);
                int var27 = arg0 + this.field3007;
                int var28 = this.field3002 + var27;
                while (var18 >= var28) {
                    var8.method1138(0, (float) this.field3020, (float) this.field3002, 0.0F);
                    var8.method365(var27, var21, 0);
                    this.field3001.method3336((byte) 93);
                    this.field3001.method3317(1);
                    var28 += var19;
                    var27 += var19;
                }
                if (var27 < var18) {
                    int var29 = var18 - var27;
                    var9.method1138(0, this.field3000.method1051(-3008, (float) this.field3020), this.field3000.method1053((byte) 3, (float) var29), 1.0F);
                    this.field3001.method3321((byte) -128, class620.field8928);
                    var8.method1138(0, (float) this.field3020, (float) var29, 0.0F);
                    var8.method365(var27, var21, 0);
                    this.field3001.method3336((byte) 73);
                    this.field3001.method3317(1);
                }
                var21 += var20;
            }
            if (var21 < var17) {
                int var23 = var17 - var21;
                var9.method1138(0, this.field3000.method1051(-3008, (float) var23), this.field3000.method1053((byte) 3, (float) this.field3002), 1.0F);
                this.field3001.method3321((byte) -124, class620.field8928);
                int var24 = this.field3007 + arg0;
                int var25 = this.field3002 + var24;
                while (var25 <= var18) {
                    var8.method1138(0, (float) var23, (float) this.field3002, 0.0F);
                    var8.method365(var24, var21, 0);
                    this.field3001.method3336((byte) 78);
                    this.field3001.method3317(1);
                    var25 += var19;
                    var24 += var19;
                }
                if (var24 < var18) {
                    int var26 = var18 - var24;
                    var9.method1138(0, this.field3000.method1051(-3008, (float) var23), this.field3000.method1053((byte) 3, (float) var26), 1.0F);
                    this.field3001.method3321((byte) -125, class620.field8928);
                    var8.method1138(0, (float) var23, (float) var26, 0.0F);
                    var8.method365(var24, var21, 0);
                    this.field3001.method3336((byte) 66);
                    this.field3001.method3317(1);
                }
            }
        }
        this.field3001.method3323(0);
        this.field3001.method3300(true, 1, class17.field173);
        this.field3001.method3307(class17.field173, 1, 16711680);
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(IILpa;II)V")
    public final void method634(int arg0, int arg1, class594 arg2, int arg3, int arg4) {
        field3023++;
        class78 var6 = (class78) arg2;
        class305 var7 = var6.field1061;
        int var8 = this.field3007 + arg0;
        int var9 = this.field3022 + arg1;
        this.field3000.method49(class6.field57, 27754);
        this.field3001.method3348(-2);
        this.field3001.method3344(29639, this.field3000);
        this.field3001.method3343(1, 0);
        this.field3001.method3291(1, 2);
        class186 var10 = this.field3001.method3346((byte) 75);
        var10.method1138(0, (float) this.field3020, (float) this.field3002, 0.0F);
        var10.method365(var8, var9, 0);
        this.field3001.method3336((byte) 74);
        class186 var11 = this.field3001.method3299(-8435);
        var11.method1138(0, this.field3000.method1051(-3008, (float) this.field3020), this.field3000.method1053((byte) 3, (float) this.field3002), 1.0F);
        this.field3001.method3321((byte) -123, class620.field8928);
        this.field3001.method3339((byte) 90, 1);
        this.field3001.method3344(29639, var7);
        this.field3001.method3316(class509.field7093, 30, class443.field6123);
        this.field3001.method3300(true, 0, class17.field173);
        class186 var12 = this.field3001.method3299(-8435);
        var12.method1138(0, var7.method1051(-3008, (float) this.field3020), var7.method1053((byte) 3, (float) this.field3002), 1.0F);
        var12.method1146(var7.method1051(-3008, (float) (var9 - arg4)), var7.method1053((byte) 3, (float) (var8 - arg3)), 0.0F, 0);
        this.field3001.method3321((byte) -127, class620.field8928);
        this.field3001.method3317(1);
        this.field3001.method3323(0);
        this.field3001.method3300(true, 0, class93.field1233);
        this.field3001.method3316(class443.field6123, -99, class443.field6123);
        this.field3001.method3344(29639, null);
        this.field3001.method3339((byte) 90, 0);
        this.field3001.method3323(0);
    }

    @OriginalMember(owner = "client!wda", name = "P", descriptor = "(IIIIII)V")
    public final void method620(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3019++;
        int[] var7 = this.field3001.method950(arg4, arg5, arg2, arg3);
        if (var7 != null) {
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8] = class292.method1790(var7[var8], -16777216);
            }
            this.method1486(arg0, arg1, arg2, arg3, var7, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(IIII[III)V")
    private final void method1486(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        this.field3000.method1055(arg5, 30519, arg6, arg4, arg0, arg3, arg2, arg1);
        field2996++;
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(I)V")
    public static void method1487(int arg0) {
        if (arg0 == 1) {
            field3024 = null;
            field3012 = null;
            field3011 = null;
        }
    }

    @OriginalMember(owner = "client!wda", name = "la", descriptor = "()I")
    public final int method630() {
        field3015++;
        return this.field3020;
    }

    @OriginalMember(owner = "client!wda", name = "<init>", descriptor = "(Lre;IIZ)V")
    public class235(class582 arg0, int arg1, int arg2, boolean arg3) {
        this.field3002 = arg1;
        this.field3001 = arg0;
        this.field3020 = arg2;
        this.field3000 = arg0.method1161(class280.field3663, arg3 ? class532.field7430 : class149.field1929, arg2, arg1, -61);
        this.field2994 = arg1 != this.field3000.method1050((byte) -90);
        this.field2995 = arg2 != this.field3000.method1059(-23624);
        this.field3010 = !this.field2994 && this.field3000.method1057(115);
        this.field3014 = !this.field2995 && this.field3000.method1057(55);
    }

    @OriginalMember(owner = "client!wda", name = "<init>", descriptor = "(Lre;II[III)V")
    public class235(class582 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field3020 = arg2;
        this.field3002 = arg1;
        this.field3001 = arg0;
        this.field3000 = arg0.method1169(false, arg2, arg4, arg5, arg1, (byte) -63, arg3);
        this.field2994 = this.field3000.method1050((byte) -113) != arg1;
        this.field2995 = arg2 != this.field3000.method1059(-23624);
        this.field3010 = !this.field2994 && this.field3000.method1057(80);
        this.field3014 = !this.field2995 && this.field3000.method1057(111);
    }
}
