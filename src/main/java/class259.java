import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class259 extends class313 {

    @OriginalMember(owner = "client!jm", name = "J", descriptor = "I")
    private int field4194 = 1;

    @OriginalMember(owner = "client!jm", name = "W", descriptor = "I")
    private int field4207 = 1;

    @OriginalMember(owner = "client!jm", name = "V", descriptor = "Ljava/lang/String;")
    public static String field4206 = "shake:";

    @OriginalMember(owner = "client!jm", name = "S", descriptor = "[I")
    public static int[] field4203 = new int[32];

    @OriginalMember(owner = "client!jm", name = "O", descriptor = "[I")
    public static int[] field4199 = new int[200];

    @OriginalMember(owner = "client!jm", name = "N", descriptor = "Lul;")
    public static class51 field4198 = new class51(64);

    @OriginalMember(owner = "client!jm", name = "I", descriptor = "I")
    public static int field4193;

    @OriginalMember(owner = "client!jm", name = "K", descriptor = "I")
    public static int field4195;

    @OriginalMember(owner = "client!jm", name = "L", descriptor = "I")
    public static int field4196;

    @OriginalMember(owner = "client!jm", name = "M", descriptor = "I")
    public static int field4197;

    @OriginalMember(owner = "client!jm", name = "P", descriptor = "I")
    public static int field4200;

    @OriginalMember(owner = "client!jm", name = "Q", descriptor = "I")
    public static int field4201;

    @OriginalMember(owner = "client!jm", name = "U", descriptor = "I")
    public static int field4205;

    @OriginalMember(owner = "client!jm", name = "R", descriptor = "[Lwb;")
    public static class171[] field4202;

    @OriginalMember(owner = "client!jm", name = "T", descriptor = "[Lfg;")
    public static class236[] field4204;

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "(B)V", line = 7)
    public static void method1797(byte arg0) {
        field4206 = null;
        field4198 = null;
        if (arg0 >= 99) {
            field4203 = null;
            field4202 = null;
            field4204 = null;
            field4199 = null;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(II)[[I", line = 22)
    public final int[][] method299(int arg0, int arg1) {
        if (arg1 != 2) {
            return (int[][]) ((int[][]) null);
        }
        field4196++;
        int[][] var3 = this.field4958.method2404(arg0, (byte) 124);
        if (this.field4958.field5463) {
            int var4 = this.field4194 + this.field4194 + 1;
            int var5 = this.field4207 + this.field4207 + 1;
            int[][][] var6 = new int[var4][][];
            int var7 = 65536 / var5;
            int var8 = 65536 / var4;
            for (int var9 = arg0 - this.field4194; var9 <= (this.field4194 + arg0); var9++) {
                int[][] var10 = this.method2161(0, arg1 + 2, var9 & class132.field2262);
                int var11 = 0;
                int[][] var12 = new int[3][class133.field2269];
                int var13 = 0;
                int var14 = 0;
                int[] var15 = var10[0];
                int[] var16 = var10[2];
                int[] var17 = var10[1];
                for (int var18 = -this.field4207; var18 <= this.field4207; var18++) {
                    int var19 = var18 & class297.field4731;
                    var11 += var15[var19];
                    var13 += var17[var19];
                    var14 += var16[var19];
                }
                int[] var20 = var12[0];
                int[] var21 = var12[1];
                int[] var22 = var12[2];
                int var23 = 0;
                while (class133.field2269 > var23) {
                    var20[var23] = var7 * var11 >> 16;
                    var21[var23] = var7 * var13 >> 16;
                    var22[var23] = var7 * var14 >> 16;
                    int var24 = class297.field4731 & var23 - this.field4207;
                    var23++;
                    int var25 = var14 - var16[var24];
                    int var26 = var11 - var15[var24];
                    int var27 = var13 - var17[var24];
                    int var28 = this.field4207 + var23 & class297.field4731;
                    var13 = var17[var28] + var27;
                    var11 = var15[var28] + var26;
                    var14 = var16[var28] + var25;
                }
                var6[var9 + this.field4194 - arg0] = var12;
            }
            int[] var29 = var3[0];
            int[] var30 = var3[1];
            int[] var31 = var3[2];
            for (int var32 = 0; var32 < class133.field2269; var32++) {
                int var33 = 0;
                int var34 = 0;
                int var35 = 0;
                for (int var36 = 0; var36 < var4; var36++) {
                    int[][] var37 = var6[var36];
                    var33 += var37[1][var32];
                    var34 += var37[0][var32];
                    var35 += var37[2][var32];
                }
                var29[var32] = var8 * var34 >> 16;
                var30[var32] = var8 * var33 >> 16;
                var31[var32] = var8 * var35 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ZLpi;IIBZIIIIII)V", line = 155)
    public static final void method1798(boolean arg0, class336 arg1, int arg2, int arg3, byte arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        if (arg4 >= -94) {
            return;
        }
        field4193++;
        if (arg11 < 0 || arg11 >= 104 || arg10 < 0 || arg10 >= 104) {
            while (true) {
                int var14 = arg1.method2364(-9069);
                if (var14 == 0) {
                    break;
                }
                if (var14 == 1) {
                    arg1.method2364(-9069);
                    break;
                }
                if (var14 <= 49) {
                    arg1.method2364(-9069);
                }
            }
            return;
        }
        if (!arg5 && !arg0) {
            class152.field2683[arg9][arg11][arg10] = 0;
        }
        while (true) {
            int var12 = arg1.method2364(-9069);
            if (var12 == 0) {
                if (arg5) {
                    class137.field2487[0][arg8 + arg11][arg2 + arg10] = class255.field4110[0][arg8 + arg11][arg2 + arg10];
                } else if (arg9 == 0) {
                    class137.field2487[0][arg11 + arg8][arg2 + arg10] = -class152.method1204(30298, arg6 + 556238, arg3 + 932731) * 8;
                } else {
                    class137.field2487[arg9][arg11 + arg8][arg2 + arg10] = class137.field2487[arg9 - 1][arg8 + arg11][arg2 + arg10] - 240;
                }
                break;
            }
            if (var12 == 1) {
                int var13 = arg1.method2364(-9069);
                if (arg5) {
                    class137.field2487[0][arg8 + arg11][arg10 + arg2] = var13 * 8 + class255.field4110[0][arg8 + arg11][arg10 + arg2];
                } else {
                    if (var13 == 1) {
                        var13 = 0;
                    }
                    if (arg9 == 0) {
                        class137.field2487[0][arg8 + arg11][arg2 + arg10] = -var13 * 8;
                    } else {
                        class137.field2487[arg9][arg8 + arg11][arg2 + arg10] = class137.field2487[arg9 - 1][arg11 + arg8][arg2 + arg10] - var13 * 8;
                    }
                }
                break;
            }
            if (var12 > 49) {
                if (var12 > 81) {
                    if (!arg0) {
                        class310.field4912[arg9][arg11][arg10] = (byte) (var12 - 81);
                    }
                } else if (!arg5 && !arg0) {
                    class152.field2683[arg9][arg11][arg10] = (byte) (var12 - 49);
                }
            } else if (arg0) {
                arg1.method2364(-9069);
            } else {
                class193.field3230[arg9][arg11][arg10] = arg1.method2323(114);
                class271.field4319[arg9][arg11][arg10] = (byte) ((var12 - 2) / 4);
                class175.field2993[arg9][arg11][arg10] = (byte) class36.method319(var12 + arg7 - 2, 3);
            }
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IILpi;)V", line = 280)
    public final void method185(int arg0, int arg1, class336 arg2) {
        if (arg0 == 0) {
            this.field4207 = arg2.method2364(-9069);
        } else if (arg0 == 1) {
            this.field4194 = arg2.method2364(-9069);
        } else if (arg0 == 2) {
            this.field4968 = arg2.method2364(-9069) == 1;
        }
        field4200++;
        if (arg1 != -17848) {
            this.field4207 = -45;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "([[ILqb;[[FI[[FIZLik;I[[F[I)V", line = 335)
    public static final void method1799(int[][] arg0, class114 arg1, float[][] arg2, int arg3, float[][] arg4, int arg5, boolean arg6, class281 arg7, int arg8, float[][] arg9, int[] arg10) {
        field4195++;
        int[] var11 = new int[arg10.length / 2];
        if (!arg6) {
            field4199 = (int[]) null;
        }
        for (int var12 = 0; var12 < var11.length; var12++) {
            int var13 = arg10[var12 + var12];
            int var14 = arg10[var12 + var12 + 1];
            if (arg3 == 1) {
                int var15 = var13;
                var13 = var14;
                var14 = 128 - var15;
            } else if (arg3 == 2) {
                var13 = 128 - var13;
                var14 = 128 - var14;
            } else if (arg3 == 3) {
                int var16 = var13;
                var13 = 128 - var14;
                var14 = var16;
            }
            float var17;
            float var18;
            float var19;
            if (var13 == 0 && var14 == 0) {
                var17 = arg9[arg8][arg5];
                var18 = arg2[arg8][arg5];
                var19 = arg4[arg8][arg5];
            } else if (var13 == 128 && var14 == 0) {
                var19 = arg4[arg8 + 1][arg5];
                var17 = arg9[arg8 + 1][arg5];
                var18 = arg2[arg8 + 1][arg5];
            } else if (var13 == 128 && var14 == 128) {
                var17 = arg9[arg8 + 1][arg5 + 1];
                var18 = arg2[arg8 + 1][arg5 + 1];
                var19 = arg4[arg8 + 1][arg5 + 1];
            } else if (var13 == 0 && var14 == 128) {
                var19 = arg4[arg8][arg5 + 1];
                var18 = arg2[arg8][arg5 + 1];
                var17 = arg9[arg8][arg5 + 1];
            } else {
                float var20 = arg2[arg8][arg5];
                float var21 = arg4[arg8][arg5];
                float var22 = arg9[arg8][arg5];
                float var23 = (float) var14 / 128.0F;
                float var24 = (float) var13 / 128.0F;
                float var25 = (arg2[arg8 + 1][arg5] - var20) * var24 + var20;
                float var26 = (arg4[arg8 + 1][arg5] - var21) * var24 + var21;
                float var27 = arg2[arg8][arg5 + 1];
                float var28 = (arg9[arg8 + 1][arg5] - var22) * var24 + var22;
                float var29 = arg4[arg8][arg5 + 1];
                float var30 = (arg4[arg8 + 1][arg5 + 1] - var29) * var24 + var29;
                var19 = (var30 - var26) * var23 + var26;
                float var31 = arg9[arg8][arg5 + 1];
                float var32 = (arg2[arg8 + 1][arg5 + 1] - var27) * var24 + var27;
                float var33 = (arg9[arg8 + 1][arg5 + 1] - var31) * var24 + var31;
                var18 = (var32 - var25) * var23 + var25;
                var17 = (var33 - var28) * var23 + var28;
            }
            int var34 = (arg8 << 7) + var13;
            int var35 = (arg5 << 7) + var14;
            int var36 = class258.method1795(var14, arg5, var13, 128, arg0, arg8);
            var11[var12] = arg7.method1918(arg1, var34, var36, var35, var18, var19, var17);
        }
        arg7.method1917(var11);
    }

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "()V", line = 448)
    public class259() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(II)[I", line = 453)
    public final int[] method111(int arg0, int arg1) {
        field4205++;
        int[] var3 = this.field4961.method1520(-1908965694, arg1);
        if (this.field4961.field3451) {
            int var4 = this.field4194 + this.field4194 + 1;
            int[][] var5 = new int[var4][];
            int var6 = this.field4207 + this.field4207 + 1;
            int var7 = 65536 / var6;
            for (int var8 = arg1 - this.field4194; var8 <= (this.field4194 + arg1); var8++) {
                int[] var9 = this.method2156(0, true, var8 & class132.field2262);
                int var10 = 0;
                int[] var11 = new int[class133.field2269];
                for (int var12 = -this.field4207; var12 <= this.field4207; var12++) {
                    var10 += var9[var12 & class297.field4731];
                }
                int var13 = 0;
                while (class133.field2269 > var13) {
                    var11[var13] = var7 * var10 >> 16;
                    int var14 = var10 - var9[class297.field4731 & var13 - this.field4207];
                    var13++;
                    var10 = var9[this.field4207 + var13 & class297.field4731] + var14;
                }
                var5[var8 + this.field4194 - arg1] = var11;
            }
            int var15 = 65536 / var4;
            for (int var16 = 0; var16 < class133.field2269; var16++) {
                int var17 = 0;
                for (int var18 = 0; var18 < var4; var18++) {
                    var17 += var5[var18][var16];
                }
                var3[var16] = var15 * var17 >> 16;
            }
        }
        if (arg0 != 4) {
            field4199 = (int[]) null;
        }
        return var3;
    }
}
