import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class701 extends class659 {

    @OriginalMember(owner = "client!fb", name = "H", descriptor = "[I")
    private int[] field9290;

    @OriginalMember(owner = "client!fb", name = "D", descriptor = "[I")
    private int[] field9286;

    @OriginalMember(owner = "client!fb", name = "G", descriptor = "Lpha;")
    private class175 field9289;

    @OriginalMember(owner = "client!fb", name = "z", descriptor = "Lpha;")
    private class175 field9283;

    @OriginalMember(owner = "client!fb", name = "t", descriptor = "Lpha;")
    private class175 field9277;

    @OriginalMember(owner = "client!fb", name = "v", descriptor = "[Lpha;")
    private class175[] field9279;

    @OriginalMember(owner = "client!fb", name = "y", descriptor = "I")
    public static int field9282 = 0;

    @OriginalMember(owner = "client!fb", name = "F", descriptor = "I")
    public static int field9288 = 0;

    @OriginalMember(owner = "client!fb", name = "w", descriptor = "I")
    public static int field9280 = 1;

    @OriginalMember(owner = "client!fb", name = "J", descriptor = "I")
    public static int field9291 = 1405;

    @OriginalMember(owner = "client!fb", name = "r", descriptor = "I")
    public static int field9275;

    @OriginalMember(owner = "client!fb", name = "s", descriptor = "I")
    public static int field9276;

    @OriginalMember(owner = "client!fb", name = "u", descriptor = "I")
    public static int field9278;

    @OriginalMember(owner = "client!fb", name = "x", descriptor = "I")
    public static int field9281;

    @OriginalMember(owner = "client!fb", name = "A", descriptor = "I")
    public static int field9284;

    @OriginalMember(owner = "client!fb", name = "E", descriptor = "I")
    public static int field9287;

    @OriginalMember(owner = "client!fb", name = "B", descriptor = "Ldp;")
    public static class3 field9285;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V", line = 4)
    public static void method3821(int arg0) {
        if (arg0 == 16309) {
            field9285 = null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZIBILuq;Ld;)[F", line = 31)
    public final float[] method3822(boolean arg0, int arg1, byte arg2, int arg3, class172 arg4, class161 arg5) {
        field9278++;
        class588.field8020 = arg5;
        class582.field7913 = arg4;
        for (int var7 = 0; var7 < this.field9279.length; var7++) {
            this.field9279[var7].method1204(arg1, arg3, (byte) -87);
        }
        class685.method3757(-5975, arg3, arg1);
        float[] var8 = new float[arg1 * arg3 * 4];
        int var9 = 0;
        for (int var10 = 0; var10 < arg1; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field9283.field2305) {
                int[] var16 = this.field9283.method47(true, var10);
                var15 = var16;
                var14 = var16;
                var13 = var16;
            } else {
                int[][] var12 = this.field9283.method238(var10, (byte) -93);
                var13 = var12[1];
                var14 = var12[0];
                var15 = var12[2];
            }
            int[] var17;
            if (this.field9277.field2305) {
                var17 = this.field9277.method47(true, var10);
            } else {
                var17 = this.field9277.method238(var10, (byte) -98)[0];
            }
            int[] var18;
            if (this.field9289.field2305) {
                var18 = this.field9289.method47(true, var10);
            } else {
                var18 = this.field9289.method238(var10, (byte) -66)[0];
            }
            if (arg0) {
                var9 = var10 << 2;
            }
            for (int var19 = arg3 - 1; var19 >= 0; var19--) {
                float var20 = (float) var17[var19] / 4096.0F;
                if (var20 < 0.0F) {
                    var20 = 0.0F;
                } else if (var20 > 1.0F) {
                    var20 = 1.0F;
                }
                float var21 = ((float) var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                var8[var9++] = (float) var14[var19] * var21;
                var8[var9++] = (float) var13[var19] * var21;
                var8[var9++] = (float) var15[var19] * var21;
                var8[var9++] = var20;
                if (arg0) {
                    var9 += (arg3 << 2) - 4;
                }
            }
        }
        for (int var11 = 0; var11 < this.field9279.length; var11++) {
            this.field9279[var11].method1203((byte) 40);
        }
        if (arg2 > -126) {
            this.method3825(-55, -73, false, null, -101, 0.8005689566784338D, null, false);
        }
        return var8;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILd;Luq;DZIZ)[I", line = 142)
    public final int[] method3823(int arg0, class161 arg1, class172 arg2, double arg3, boolean arg4, int arg5, boolean arg6) {
        class582.field7913 = arg2;
        class588.field8020 = arg1;
        field9287++;
        for (int var9 = 0; var9 < this.field9279.length; var9++) {
            this.field9279[var9].method1204(arg5, arg0, (byte) -87);
        }
        class182.method1233(1, arg3);
        class685.method3757(-5975, arg0, arg5);
        int[] var10 = new int[arg0 * arg5];
        int var11 = 0;
        if (!arg6) {
            this.field9277 = null;
        }
        for (int var12 = 0; var12 < arg5; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field9283.field2305) {
                int[] var18 = this.field9283.method47(true, var12);
                var16 = var18;
                var15 = var18;
                var17 = var18;
            } else {
                int[][] var14 = this.field9283.method238(var12, (byte) -92);
                var15 = var14[2];
                var16 = var14[0];
                var17 = var14[1];
            }
            if (arg4) {
                var11 = var12;
            }
            int[] var19;
            if (this.field9277.field2305) {
                var19 = this.field9277.method47(true, var12);
            } else {
                var19 = this.field9277.method238(var12, (byte) -49)[0];
            }
            for (int var20 = arg0 - 1; var20 >= 0; var20--) {
                int var21 = var16[var20] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var22 = var17[var20] >> 4;
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
                int var24 = class496.field6974[var22];
                if (var23 < 0) {
                    var23 = 0;
                }
                int var25 = class496.field6974[var21];
                int var26 = class496.field6974[var23];
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
                var10[var11++] = (var27 << 24) + (var25 << 16) + (var24 << 8) + var26;
                if (arg4) {
                    var11 += arg0 - 1;
                }
            }
        }
        for (int var13 = 0; var13 < this.field9279.length; var13++) {
            this.field9279[var13].method1203((byte) 40);
        }
        return var10;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILd;Luq;)Z", line = 279)
    public final boolean method3824(int arg0, class161 arg1, class172 arg2) {
        field9276++;
        if (arg0 > class406.field5756) {
            for (int var4 = 0; var4 < this.field9286.length; var4++) {
                if (!arg2.method1185(this.field9286[var4], arg0 + 9330)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field9286.length; var5++) {
                if (!arg2.method1174(class406.field5756, this.field9286[var5], 1)) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field9290.length; var6++) {
            if (!arg1.method1112(29302, this.field9290[var6])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIZLuq;IDLd;Z)[I", line = 344)
    public final int[] method3825(int arg0, int arg1, boolean arg2, class172 arg3, int arg4, double arg5, class161 arg6, boolean arg7) {
        field9284++;
        class588.field8020 = arg6;
        class582.field7913 = arg3;
        for (int var10 = 0; var10 < this.field9279.length; var10++) {
            this.field9279[var10].method1204(arg0, arg4, (byte) -87);
        }
        class182.method1233(1, arg5);
        class685.method3757(-5975, arg4, arg0);
        int[] var11 = new int[arg0 * arg4];
        int var12;
        byte var13;
        int var14;
        if (arg2) {
            var12 = arg4 - 1;
            var13 = -1;
            var14 = -1;
        } else {
            var12 = 0;
            var14 = arg4;
            var13 = 1;
        }
        int var15 = arg1;
        for (int var16 = 0; var16 < arg0; var16++) {
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field9283.field2305) {
                int[] var22 = this.field9283.method47(true, var16);
                var19 = var22;
                var20 = var22;
                var21 = var22;
            } else {
                int[][] var18 = this.field9283.method238(var16, (byte) -74);
                var19 = var18[1];
                var20 = var18[0];
                var21 = var18[2];
            }
            if (arg7) {
                var15 = var16;
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
                int var27 = class496.field6974[var25];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var28 = class496.field6974[var24];
                int var29 = class496.field6974[var26];
                int var30 = (var27 << 8) + ((var28 << 16) + var29);
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg7) {
                    var15 += arg4 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field9279.length; var17++) {
            this.field9279[var17].method1203((byte) 40);
        }
        return var11;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIIBII)V", line = 478)
    public static final void method3826(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        field9281++;
        int var8 = 0;
        int var9 = arg3;
        int var10 = 0;
        int var11 = arg7 - arg1;
        int var12 = arg3 - arg1;
        int var13 = arg7 * arg7;
        int var14 = arg3 * arg3;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg3 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - ((var21 - 1) * var18);
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - ((var22 - 1) * var20);
        int var27 = 119 % ((arg5 + 29) / 41);
        int var28 = var13 << 2;
        int var29 = var14 << 2;
        int var30 = var15 << 2;
        int var31 = var16 << 2;
        int var32 = var17 * 3;
        int var33 = (var21 - 3) * var18;
        int var34 = var19 * 3;
        int var35 = (var22 - 3) * var20;
        int var36 = var29;
        int var37 = (arg3 - 1) * var28;
        int var38 = var31;
        int var39 = (var12 - 1) * var30;
        int[] var40 = class228.field2951[arg4];
        class464.method2733(arg0, arg6 - arg7, -var11 + arg6, -22816, var40);
        class464.method2733(arg2, arg6 - var11, arg6 + var11, -22816, var40);
        class464.method2733(arg0, arg6 + var11, arg6 + arg7, -22816, var40);
        while (var9 > 0) {
            boolean var41 = var9 <= var12;
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var32;
                    var24 += var36;
                    var32 += var29;
                    var8++;
                    var36 += var29;
                }
            }
            if (var41) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var26 += var38;
                        var25 += var34;
                        var34 += var31;
                        var38 += var31;
                        var10++;
                    }
                }
                if (var26 < 0) {
                    var25 += var34;
                    var26 += var38;
                    var38 += var31;
                    var10++;
                    var34 += var31;
                }
                var25 += -var39;
                var26 += -var35;
                var39 -= var30;
                var35 -= var30;
            }
            if (var24 < 0) {
                var23 += var32;
                var24 += var36;
                var36 += var29;
                var8++;
                var32 += var29;
            }
            var24 += -var33;
            var23 += -var37;
            var37 -= var28;
            var33 -= var28;
            var9--;
            int var42 = arg4 - var9;
            int var43 = arg4 + var9;
            int var44 = arg6 + var8;
            int var45 = arg6 - var8;
            if (var41) {
                int var46 = arg6 + var10;
                int var47 = arg6 - var10;
                class464.method2733(arg0, var45, var47, -22816, class228.field2951[var42]);
                class464.method2733(arg2, var47, var46, -22816, class228.field2951[var42]);
                class464.method2733(arg0, var46, var44, -22816, class228.field2951[var42]);
                class464.method2733(arg0, var45, var47, -22816, class228.field2951[var43]);
                class464.method2733(arg2, var47, var46, -22816, class228.field2951[var43]);
                class464.method2733(arg0, var46, var44, -22816, class228.field2951[var43]);
            } else {
                class464.method2733(arg0, var45, var44, -22816, class228.field2951[var42]);
                class464.method2733(arg0, var45, var44, -22816, class228.field2951[var43]);
            }
        }
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "()V", line = 648)
    public class701() {
        this.field9290 = new int[0];
        this.field9286 = new int[0];
        this.field9289 = new class281(0);
        this.field9289.field2309 = 1;
        this.field9283 = new class281();
        this.field9283.field2309 = 1;
        this.field9277 = new class281();
        this.field9279 = new class175[] { this.field9283, this.field9277, this.field9289 };
        this.field9277.field2309 = 1;
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Ldt;)V", line = 663)
    public class701(class254 arg0) {
        int var2 = arg0.method1731((byte) 64);
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        this.field9279 = new class175[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            class175 var16 = class617.method3424(arg0, -114);
            if (var16.method1207(true) >= 0) {
                var3++;
            }
            if (var16.method1201(127) >= 0) {
                var4++;
            }
            int var17 = var16.field2321.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method1731((byte) 64);
            }
            this.field9279[var6] = var16;
        }
        this.field9286 = new int[var3];
        int var7 = 0;
        this.field9290 = new int[var4];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class175 var11 = this.field9279[var9];
            int var12 = var11.field2321.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field2321[var13] = this.field9279[var5[var9][var13]];
            }
            int var14 = var11.method1207(true);
            int var15 = var11.method1201(123);
            if (var14 > 0) {
                this.field9286[var7++] = var14;
            }
            if (var15 > 0) {
                this.field9290[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field9283 = this.field9279[arg0.method1731((byte) 64)];
        this.field9277 = this.field9279[arg0.method1731((byte) 64)];
        Object var10 = null;
        this.field9289 = this.field9279[arg0.method1731((byte) 64)];
    }
}
