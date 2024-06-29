import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fga")
public class class340 extends class28 {

    @OriginalMember(owner = "client!fga", name = "F", descriptor = "[I")
    private int[] field4394;

    @OriginalMember(owner = "client!fga", name = "D", descriptor = "[I")
    private int[] field4392;

    @OriginalMember(owner = "client!fga", name = "u", descriptor = "Lku;")
    private class192 field4383;

    @OriginalMember(owner = "client!fga", name = "z", descriptor = "Lku;")
    private class192 field4388;

    @OriginalMember(owner = "client!fga", name = "w", descriptor = "Lku;")
    private class192 field4385;

    @OriginalMember(owner = "client!fga", name = "A", descriptor = "[Lku;")
    private class192[] field4389;

    @OriginalMember(owner = "client!fga", name = "x", descriptor = "I")
    public static int field4386 = 0;

    @OriginalMember(owner = "client!fga", name = "v", descriptor = "I")
    public static int field4384;

    @OriginalMember(owner = "client!fga", name = "y", descriptor = "I")
    public static int field4387;

    @OriginalMember(owner = "client!fga", name = "B", descriptor = "I")
    public static int field4390;

    @OriginalMember(owner = "client!fga", name = "C", descriptor = "I")
    public static int field4391;

    @OriginalMember(owner = "client!fga", name = "E", descriptor = "I")
    public static int field4393;

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(Le;IZLpe;BI)[F", line = 4)
    public final float[] method1968(class702 arg0, int arg1, boolean arg2, class615 arg3, byte arg4, int arg5) {
        class512.field6696 = arg3;
        class415.field5332 = arg0;
        field4391++;
        for (int var7 = 0; var7 < this.field4389.length; var7++) {
            this.field4389[var7].method1254(arg1, (byte) 64, arg5);
        }
        class44.method418(arg1, arg5, -1);
        float[] var8 = new float[arg5 * 4 * arg1];
        int var9 = 0;
        if (arg4 > -113) {
            return null;
        }
        for (int var10 = 0; var10 < arg1; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field4388.field2449) {
                int[] var12 = this.field4388.method118(var10, (byte) -127);
                var13 = var12;
                var14 = var12;
                var15 = var12;
            } else {
                int[][] var16 = this.field4388.method107(var10, (byte) 111);
                var14 = var16[1];
                var15 = var16[2];
                var13 = var16[0];
            }
            int[] var17;
            if (this.field4385.field2449) {
                var17 = this.field4385.method118(var10, (byte) -128);
            } else {
                var17 = this.field4385.method107(var10, (byte) -97)[0];
            }
            if (arg2) {
                var9 = var10 << 2;
            }
            int[] var18;
            if (this.field4383.field2449) {
                var18 = this.field4383.method118(var10, (byte) -128);
            } else {
                var18 = this.field4383.method107(var10, (byte) 54)[0];
            }
            for (int var19 = arg5 - 1; var19 >= 0; var19--) {
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
                if (arg2) {
                    var9 += (arg5 << 2) - 4;
                }
            }
        }
        for (int var11 = 0; var11 < this.field4389.length; var11++) {
            this.field4389[var11].method1255(68);
        }
        return var8;
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(ILe;Lpe;)Z", line = 115)
    public final boolean method1969(int arg0, class702 arg1, class615 arg2) {
        field4390++;
        if (class54.field734 >= 0) {
            for (int var4 = 0; var4 < this.field4392.length; var4++) {
                if (!arg2.method3343(class54.field734, this.field4392[var4], (byte) 115)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field4392.length; var5++) {
                if (!arg2.method3362(this.field4392[var5], -105)) {
                    return false;
                }
            }
        }
        if (arg0 != 22833) {
            this.field4383 = null;
        }
        for (int var6 = 0; var6 < this.field4394.length; var6++) {
            if (!arg1.method3164((byte) -31, this.field4394[var6])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(III)I", line = 172)
    public static final int method1970(int arg0, int arg1, int arg2) {
        field4387++;
        int var3 = 1;
        while (arg0 > 1) {
            if ((arg0 & 0x1) != 0) {
                var3 = arg2 * var3;
            }
            arg0 >>= 0x1;
            arg2 *= arg2;
        }
        if (arg1 != -19603) {
            return 21;
        } else if (arg0 == 1) {
            return arg2 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(Le;DILpe;IIZZ)[I", line = 208)
    public final int[] method1971(class702 arg0, double arg1, int arg2, class615 arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        class415.field5332 = arg0;
        field4384++;
        class512.field6696 = arg3;
        if (arg5 != 1279038120) {
            return null;
        }
        for (int var10 = 0; var10 < this.field4389.length; var10++) {
            this.field4389[var10].method1254(arg4, (byte) 126, arg2);
        }
        class545.method2895(-126, arg1);
        class44.method418(arg4, arg2, -1);
        int[] var11 = new int[arg2 * arg4];
        int var12;
        byte var13;
        int var14;
        if (arg6) {
            var12 = arg2 - 1;
            var13 = -1;
            var14 = -1;
        } else {
            var13 = 1;
            var12 = 0;
            var14 = arg2;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg4; var16++) {
            if (arg7) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field4388.field2449) {
                int[] var18 = this.field4388.method118(var16, (byte) -127);
                var19 = var18;
                var20 = var18;
                var21 = var18;
            } else {
                int[][] var22 = this.field4388.method107(var16, (byte) -125);
                var19 = var22[2];
                var20 = var22[0];
                var21 = var22[1];
            }
            for (int var23 = var12; var23 != var14; var23 += var13) {
                int var24 = var20[var23] >> 4;
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
                int var26 = var19[var23] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                int var27 = class303.field3968[var25];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var28 = class303.field3968[var24];
                int var29 = class303.field3968[var26];
                int var30 = (var27 << 8) + (var28 << 16) + var29;
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg7) {
                    var15 += arg2 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field4389.length; var17++) {
            this.field4389[var17].method1255(-104);
        }
        return var11;
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(IZLe;IILpe;D)[I", line = 349)
    public final int[] method1972(int arg0, boolean arg1, class702 arg2, int arg3, int arg4, class615 arg5, double arg6) {
        class512.field6696 = arg5;
        field4393++;
        class415.field5332 = arg2;
        for (int var9 = 0; var9 < this.field4389.length; var9++) {
            this.field4389[var9].method1254(arg3, (byte) 93, arg4);
        }
        class545.method2895(-111, arg6);
        class44.method418(arg3, arg4, -1);
        int[] var10 = new int[arg4 * 4 * arg3];
        int var11 = 0;
        int var12 = -97 % ((-arg0 - 59) / 35);
        for (int var13 = 0; var13 < arg3; var13++) {
            int[] var16;
            int[] var17;
            int[] var18;
            if (this.field4388.field2449) {
                int[] var19 = this.field4388.method118(var13, (byte) -128);
                var17 = var19;
                var18 = var19;
                var16 = var19;
            } else {
                int[][] var15 = this.field4388.method107(var13, (byte) -50);
                var16 = var15[0];
                var17 = var15[2];
                var18 = var15[1];
            }
            if (arg1) {
                var11 = var13;
            }
            int[] var20;
            if (this.field4385.field2449) {
                var20 = this.field4385.method118(var13, (byte) -126);
            } else {
                var20 = this.field4385.method107(var13, (byte) -57)[0];
            }
            for (int var21 = arg4 - 1; var21 >= 0; var21--) {
                int var22 = var16[var21] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var23 = var18[var21] >> 4;
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
                int var25 = class303.field3968[var22];
                if (var24 < 0) {
                    var24 = 0;
                }
                int var26 = class303.field3968[var23];
                int var27 = class303.field3968[var24];
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
                var10[var11++] = (var25 << 16) + (var28 << 24) + (var26 << 8) + var27;
                if (arg1) {
                    var11 += arg4 - 1;
                }
            }
        }
        for (int var14 = 0; var14 < this.field4389.length; var14++) {
            this.field4389[var14].method1255(81);
        }
        return var10;
    }

    @OriginalMember(owner = "client!fga", name = "<init>", descriptor = "()V", line = 491)
    public class340() {
        this.field4394 = new int[0];
        this.field4392 = new int[0];
        this.field4383 = new class662(0);
        this.field4383.field2454 = 1;
        this.field4388 = new class662();
        this.field4388.field2454 = 1;
        this.field4385 = new class662();
        this.field4385.field2454 = 1;
        this.field4389 = new class192[] { this.field4388, this.field4385, this.field4383 };
    }

    @OriginalMember(owner = "client!fga", name = "<init>", descriptor = "(Lfd;)V", line = 506)
    public class340(class418 arg0) {
        int var2 = arg0.method2396(-26);
        int var3 = 0;
        int var4 = 0;
        this.field4389 = new class192[var2];
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class192 var16 = class437.method2487(arg0, 0);
            if (var16.method1257((byte) 93) >= 0) {
                var3++;
            }
            if (var16.method1259(false) >= 0) {
                var4++;
            }
            int var17 = var16.field2456.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method2396(-125);
            }
            this.field4389[var6] = var16;
        }
        this.field4392 = new int[var3];
        int var7 = 0;
        this.field4394 = new int[var4];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class192 var11 = this.field4389[var9];
            int var12 = var11.field2456.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field2456[var13] = this.field4389[var5[var9][var13]];
            }
            int var14 = var11.method1257((byte) -116);
            int var15 = var11.method1259(false);
            if (var14 > 0) {
                this.field4392[var7++] = var14;
            }
            if (var15 > 0) {
                this.field4394[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field4388 = this.field4389[arg0.method2396(-106)];
        this.field4385 = this.field4389[arg0.method2396(-14)];
        Object var10 = null;
        this.field4383 = this.field4389[arg0.method2396(-128)];
    }
}
