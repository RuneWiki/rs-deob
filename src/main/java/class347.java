import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class347 extends class551 {

    @OriginalMember(owner = "client!qd", name = "D", descriptor = "[I")
    private int[] field5051;

    @OriginalMember(owner = "client!qd", name = "w", descriptor = "[I")
    private int[] field5046;

    @OriginalMember(owner = "client!qd", name = "H", descriptor = "Ltk;")
    private class371 field5055;

    @OriginalMember(owner = "client!qd", name = "v", descriptor = "Ltk;")
    private class371 field5045;

    @OriginalMember(owner = "client!qd", name = "u", descriptor = "Ltk;")
    private class371 field5044;

    @OriginalMember(owner = "client!qd", name = "z", descriptor = "[Ltk;")
    private class371[] field5049;

    @OriginalMember(owner = "client!qd", name = "s", descriptor = "[Ljava/awt/Color;")
    public static Color[] field5042 = new Color[] { new Color(9179409), new Color(3289650) };

    @OriginalMember(owner = "client!qd", name = "I", descriptor = "Lnj;")
    public static class487 field5056 = new class487("Loading title screen - ", "Lade Titelbild - ", "Chargement de l'écran-titre - ", "Carregando tela título - ");

    @OriginalMember(owner = "client!qd", name = "t", descriptor = "I")
    public static int field5043;

    @OriginalMember(owner = "client!qd", name = "x", descriptor = "I")
    public static int field5047;

    @OriginalMember(owner = "client!qd", name = "y", descriptor = "I")
    public static int field5048;

    @OriginalMember(owner = "client!qd", name = "B", descriptor = "I")
    public static int field5050;

    @OriginalMember(owner = "client!qd", name = "F", descriptor = "I")
    public static int field5053;

    @OriginalMember(owner = "client!qd", name = "G", descriptor = "I")
    public static int field5054;

    @OriginalMember(owner = "client!qd", name = "J", descriptor = "Lua;")
    public static class548 field5057;

    @OriginalMember(owner = "client!qd", name = "E", descriptor = "[I")
    public static int[] field5052;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Ln;DIIIZLdda;)[I", line = 5)
    public final int[] method2128(class472 arg0, double arg1, int arg2, int arg3, int arg4, boolean arg5, class597 arg6) {
        class468.field6866 = arg0;
        class158.field2105 = arg6;
        field5048++;
        for (int var9 = 0; var9 < this.field5049.length; var9++) {
            this.field5049[var9].method1478(arg3, arg4, arg2);
        }
        class538.method3159(95, arg1);
        class335.method2094(82, arg2, arg3);
        int[] var10 = new int[arg2 * 4 * arg3];
        int var11 = arg4;
        for (int var12 = 0; var12 < arg2; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field5045.field5360) {
                int[] var14 = this.field5045.method79((byte) -106, var12);
                var15 = var14;
                var16 = var14;
                var17 = var14;
            } else {
                int[][] var18 = this.field5045.method78((byte) 36, var12);
                var17 = var18[0];
                var16 = var18[1];
                var15 = var18[2];
            }
            int[] var19;
            if (this.field5044.field5360) {
                var19 = this.field5044.method79((byte) -94, var12);
            } else {
                var19 = this.field5044.method78((byte) 36, var12)[0];
            }
            if (arg5) {
                var11 = var12;
            }
            for (int var20 = arg3 - 1; var20 >= 0; var20--) {
                int var21 = var17[var20] >> 4;
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
                int var23 = var15[var20] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                int var24 = class516.field7674[var22];
                if (var23 < 0) {
                    var23 = 0;
                }
                int var25 = class516.field7674[var21];
                int var26 = class516.field7674[var23];
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
                var10[var11++] = (var27 << 24) - (-(var24 << 8) - (var25 << 16) - var26);
                if (arg5) {
                    var11 += arg3 - 1;
                }
            }
        }
        for (int var13 = 0; var13 < this.field5049.length; var13++) {
            this.field5049[var13].method1480(58);
        }
        return var10;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(III[FFFIIIII)V", line = 152)
    public static final void method2129(int arg0, int arg1, int arg2, float[] arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field5050++;
        int var11 = arg6 - arg9;
        int var12 = arg2 - arg10;
        int var13 = arg7 - arg8;
        float var14 = arg3[2] * (float) var12 + arg3[1] * (float) var11 + arg3[0] * (float) var13;
        float var15 = arg3[5] * (float) var12 + arg3[3] * (float) var13 + arg3[4] * (float) var11;
        if (arg1 != -15927) {
            field5042 = null;
        }
        float var16 = arg3[8] * (float) var12 + arg3[7] * (float) var11 + arg3[6] * (float) var13;
        float var17 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
        if (arg5 != 1.0F) {
            var17 = arg5 * var17;
        }
        float var18 = var15 + arg4 + 0.5F;
        if (arg0 == 1) {
            float var19 = var17;
            var17 = -var18;
            var18 = var19;
        } else if (arg0 == 2) {
            var18 = -var18;
            var17 = -var17;
        } else if (arg0 == 3) {
            float var20 = var17;
            var17 = var18;
            var18 = -var20;
        }
        class251.field3648 = var18;
        class463.field6698 = var17;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)I", line = 208)
    public static final int method2130(int arg0, int arg1, int arg2) {
        field5053++;
        if (arg2 == 2) {
            return arg1 == 4 || arg1 == 5 ? class528.field7838[arg0 & 0x3] : 256;
        } else {
            return -125;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILn;Ldda;)Z", line = 223)
    public final boolean method2131(int arg0, class472 arg1, class597 arg2) {
        field5047++;
        if (class626.field9176 >= 0) {
            for (int var4 = 0; var4 < this.field5046.length; var4++) {
                if (!arg2.method3461(class626.field9176, this.field5046[var4], 0)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field5046.length; var5++) {
                if (!arg2.method3491(114, this.field5046[var5])) {
                    return false;
                }
            }
        }
        if (arg0 != -9097) {
            method2130(-118, 1, -120);
        }
        for (int var6 = 0; var6 < this.field5051.length; var6++) {
            if (!arg1.method1758((byte) 19, this.field5051[var6])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Ldda;IZLn;IB)[F", line = 278)
    public final float[] method2132(class597 arg0, int arg1, boolean arg2, class472 arg3, int arg4, byte arg5) {
        field5043++;
        class468.field6866 = arg3;
        class158.field2105 = arg0;
        for (int var7 = 0; var7 < this.field5049.length; var7++) {
            this.field5049[var7].method1478(arg1, -123, arg4);
        }
        class335.method2094(-45, arg4, arg1);
        float[] var8 = new float[arg1 * 4 * arg4];
        if (arg5 <= 67) {
            this.method2133(null, null, -0.4820379916938745D, -40, (byte) 73, true, false, 9);
        }
        int var9 = 0;
        for (int var10 = 0; var10 < arg4; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field5045.field5360) {
                int[] var16 = this.field5045.method79((byte) -119, var10);
                var14 = var16;
                var15 = var16;
                var13 = var16;
            } else {
                int[][] var12 = this.field5045.method78((byte) 36, var10);
                var13 = var12[1];
                var14 = var12[0];
                var15 = var12[2];
            }
            int[] var17;
            if (this.field5044.field5360) {
                var17 = this.field5044.method79((byte) -105, var10);
            } else {
                var17 = this.field5044.method78((byte) 36, var10)[0];
            }
            int[] var18;
            if (this.field5055.field5360) {
                var18 = this.field5055.method79((byte) -114, var10);
            } else {
                var18 = this.field5055.method78((byte) 36, var10)[0];
            }
            if (arg2) {
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
                var8[var9++] = (float) var14[var19] * var21;
                var8[var9++] = (float) var13[var19] * var21;
                var8[var9++] = (float) var15[var19] * var21;
                var8[var9++] = var20;
                if (arg2) {
                    var9 += (arg1 << 2) - 4;
                }
            }
        }
        for (int var11 = 0; var11 < this.field5049.length; var11++) {
            this.field5049[var11].method1480(80);
        }
        return var8;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Ln;Ldda;DIBZZI)[I", line = 388)
    public final int[] method2133(class472 arg0, class597 arg1, double arg2, int arg3, byte arg4, boolean arg5, boolean arg6, int arg7) {
        if (arg4 < 82) {
            return null;
        }
        class158.field2105 = arg1;
        field5054++;
        class468.field6866 = arg0;
        for (int var10 = 0; var10 < this.field5049.length; var10++) {
            this.field5049[var10].method1478(arg7, -127, arg3);
        }
        class538.method3159(95, arg2);
        class335.method2094(-33, arg3, arg7);
        int[] var11 = new int[arg3 * arg7];
        int var12;
        byte var13;
        int var14;
        if (arg5) {
            var12 = arg7 - 1;
            var13 = -1;
            var14 = -1;
        } else {
            var14 = arg7;
            var12 = 0;
            var13 = 1;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg3; var16++) {
            if (arg6) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field5045.field5360) {
                int[] var22 = this.field5045.method79((byte) -101, var16);
                var21 = var22;
                var19 = var22;
                var20 = var22;
            } else {
                int[][] var18 = this.field5045.method78((byte) 36, var16);
                var19 = var18[0];
                var20 = var18[2];
                var21 = var18[1];
            }
            for (int var23 = var12; var23 != var14; var23 += var13) {
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
                int var27 = class516.field7674[var24];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var28 = class516.field7674[var25];
                int var29 = class516.field7674[var26];
                int var30 = (var28 << 8) + ((var27 << 16) + var29);
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg6) {
                    var15 += arg7 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field5049.length; var17++) {
            this.field5049[var17].method1480(50);
        }
        return var11;
    }

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "(I)V", line = 535)
    public static void method2134(int arg0) {
        field5052 = null;
        if (arg0 != 255) {
            method2129(-96, 114, -127, null, -1.2693557F, -0.355887F, 71, 67, 7, 90, -86);
        }
        field5042 = null;
        field5056 = null;
        field5057 = null;
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "()V", line = 547)
    public class347() {
        this.field5051 = new int[0];
        this.field5046 = new int[0];
        this.field5055 = new class139(0);
        this.field5055.field5363 = 1;
        this.field5045 = new class139();
        this.field5045.field5363 = 1;
        this.field5044 = new class139();
        this.field5049 = new class371[] { this.field5045, this.field5044, this.field5055 };
        this.field5044.field5363 = 1;
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lps;)V", line = 563)
    public class347(class428 arg0) {
        int var2 = arg0.method2561((byte) -39);
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        this.field5049 = new class371[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            class371 var16 = class641.method3710(false, arg0);
            if (var16.method2093(false) >= 0) {
                var3++;
            }
            if (var16.method1481((byte) 28) >= 0) {
                var4++;
            }
            int var17 = var16.field5372.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method2561((byte) 118);
            }
            this.field5049[var6] = var16;
        }
        this.field5046 = new int[var3];
        int var7 = 0;
        this.field5051 = new int[var4];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class371 var11 = this.field5049[var9];
            int var12 = var11.field5372.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field5372[var13] = this.field5049[var5[var9][var13]];
            }
            int var14 = var11.method2093(false);
            int var15 = var11.method1481((byte) 28);
            if (var14 > 0) {
                this.field5046[var7++] = var14;
            }
            if (var15 > 0) {
                this.field5051[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field5045 = this.field5049[arg0.method2561((byte) -28)];
        this.field5044 = this.field5049[arg0.method2561((byte) -40)];
        Object var10 = null;
        this.field5055 = this.field5049[arg0.method2561((byte) 109)];
    }
}
