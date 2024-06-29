import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class491 extends class96 {

    @OriginalMember(owner = "client!cm", name = "M", descriptor = "[I")
    private int[] field7506;

    @OriginalMember(owner = "client!cm", name = "E", descriptor = "[I")
    private int[] field7498;

    @OriginalMember(owner = "client!cm", name = "I", descriptor = "Llk;")
    private class397 field7502;

    @OriginalMember(owner = "client!cm", name = "O", descriptor = "Llk;")
    private class397 field7508;

    @OriginalMember(owner = "client!cm", name = "G", descriptor = "Llk;")
    private class397 field7500;

    @OriginalMember(owner = "client!cm", name = "B", descriptor = "[Llk;")
    private class397[] field7495;

    @OriginalMember(owner = "client!cm", name = "H", descriptor = "Ldc;")
    public static class5 field7501 = new class5(8);

    @OriginalMember(owner = "client!cm", name = "C", descriptor = "I")
    public static int field7496;

    @OriginalMember(owner = "client!cm", name = "D", descriptor = "I")
    public static int field7497;

    @OriginalMember(owner = "client!cm", name = "F", descriptor = "I")
    public static int field7499;

    @OriginalMember(owner = "client!cm", name = "J", descriptor = "I")
    public static int field7503;

    @OriginalMember(owner = "client!cm", name = "K", descriptor = "I")
    public static int field7504;

    @OriginalMember(owner = "client!cm", name = "L", descriptor = "I")
    public static int field7505;

    @OriginalMember(owner = "client!cm", name = "N", descriptor = "I")
    public static int field7507;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIZZDLps;Lhe;I)[I")
    public final int[] method2948(int arg0, int arg1, boolean arg2, boolean arg3, double arg4, class59 arg5, class239 arg6, int arg7) {
        class163.field2132 = arg5;
        field7496++;
        class284.field4057 = arg6;
        for (int var10 = 0; var10 < this.field7495.length; var10++) {
            this.field7495[var10].method1050(-30579, arg0, arg7);
        }
        class46.method350(arg4, (byte) 70);
        class283.method1718(arg0, 24, arg7);
        int[] var11 = new int[arg0 * arg7];
        byte var12;
        int var13;
        int var14;
        if (arg2) {
            var12 = -1;
            var13 = arg0 - 1;
            var14 = -1;
        } else {
            var12 = 1;
            var13 = 0;
            var14 = arg0;
        }
        if (arg1 < 45) {
            this.field7500 = null;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg7; var16++) {
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field7508.field5859) {
                int[] var22 = this.field7508.method31(-780833076, var16);
                var21 = var22;
                var19 = var22;
                var20 = var22;
            } else {
                int[][] var18 = this.field7508.method486((byte) 84, var16);
                var19 = var18[0];
                var20 = var18[2];
                var21 = var18[1];
            }
            if (arg3) {
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
                int var27 = class370.field5554[var24];
                int var28 = class370.field5554[var25];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var29 = class370.field5554[var26];
                int var30 = (var27 << 16) + var29 + (var28 << 8);
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg3) {
                    var15 += arg0 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field7495.length; var17++) {
            this.field7495[var17].method485(true);
        }
        return var11;
    }

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "(B)V")
    public static void method2949(byte arg0) {
        int var1 = 78 / ((arg0 + 2) / 37);
        field7501 = null;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILhe;Lps;ZDIB)[I")
    public final int[] method2950(int arg0, class239 arg1, class59 arg2, boolean arg3, double arg4, int arg5, byte arg6) {
        class163.field2132 = arg2;
        field7499++;
        class284.field4057 = arg1;
        int var9 = 33 % ((arg6 - 71) / 48);
        for (int var10 = 0; var10 < this.field7495.length; var10++) {
            this.field7495[var10].method1050(-30579, arg5, arg0);
        }
        class46.method350(arg4, (byte) 70);
        class283.method1718(arg5, 123, arg0);
        int[] var11 = new int[arg0 * 4 * arg5];
        int var12 = 0;
        for (int var13 = 0; var13 < arg0; var13++) {
            int[] var16;
            int[] var17;
            int[] var18;
            if (this.field7508.field5859) {
                int[] var15 = this.field7508.method31(-780833076, var13);
                var16 = var15;
                var17 = var15;
                var18 = var15;
            } else {
                int[][] var19 = this.field7508.method486((byte) 104, var13);
                var18 = var19[2];
                var17 = var19[0];
                var16 = var19[1];
            }
            if (arg3) {
                var12 = var13;
            }
            int[] var20;
            if (this.field7500.field5859) {
                var20 = this.field7500.method31(-780833076, var13);
            } else {
                var20 = this.field7500.method486((byte) 86, var13)[0];
            }
            for (int var21 = arg5 - 1; var21 >= 0; var21--) {
                int var22 = var17[var21] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var23 = var16[var21] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var24 = var18[var21] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                int var25 = class370.field5554[var22];
                if (var24 < 0) {
                    var24 = 0;
                }
                int var26 = class370.field5554[var23];
                int var27 = class370.field5554[var24];
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
                var11[var12++] = (var25 << 16) + (var28 << 24) + (var26 << 8) + var27;
                if (arg3) {
                    var12 += arg5 - 1;
                }
            }
        }
        for (int var14 = 0; var14 < this.field7495.length; var14++) {
            this.field7495[var14].method485(true);
        }
        return var11;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILqo;IIIIIIII[II[IIZ)I")
    public static final int method2951(int arg0, class19 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int[] arg10, int arg11, int[] arg12, int arg13, boolean arg14) {
        field7503++;
        for (int var15 = 0; var15 < 128; var15++) {
            for (int var35 = 0; var35 < 128; var35++) {
                class409.field6004[var15][var35] = 0;
                class379.field5659[var15][var35] = 99999999;
            }
        }
        boolean var16;
        if (arg0 == 1) {
            var16 = class364.method2225(arg1, arg9, arg8, arg7, arg13, arg3, arg4, arg6, arg2, arg5, arg11 ^ 0x5A);
        } else if (arg0 == 2) {
            var16 = class335.method2026(arg8, arg1, arg5, arg6, arg2, arg9, arg4, arg11 ^ 0x51, arg13, arg7, arg3);
        } else {
            var16 = class489.method2938(arg4, arg3, arg0, arg5, arg2, arg8, arg1, arg13, arg7, arg9, arg6, -125);
        }
        int var17 = arg6 - 64;
        int var18 = arg5 - 64;
        int var19 = class505.field7711;
        int var20 = class488.field7462;
        if (!var16) {
            if (!arg14) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = arg13 - var23; var24 <= arg13 + var23; var24++) {
                for (int var25 = arg9 - var23; var25 <= arg9 + var23; var25++) {
                    int var26 = var24 - var17;
                    int var27 = var25 - var18;
                    if (var26 >= 0 && var27 >= 0 && var26 < 128 && var27 < 128 && class379.field5659[var26][var27] < 100) {
                        int var28 = 0;
                        if (arg13 > var24) {
                            var28 = arg13 - var24;
                        } else if (var24 > (arg2 + arg13 - 1)) {
                            var28 = var24 + 1 - arg2 - arg13;
                        }
                        int var29 = 0;
                        if (var25 < arg9) {
                            var29 = arg9 - var25;
                        } else if ((arg8 + arg9 - 1) < var25) {
                            var29 = -arg8 - (arg9 - var25 - 1);
                        }
                        int var30 = var28 * var28 + var29 * var29;
                        if (var30 < var21 || var21 == var30 && class379.field5659[var26][var27] < var22) {
                            var21 = var30;
                            var20 = var25;
                            var22 = class379.field5659[var26][var27];
                            var19 = var24;
                        }
                    }
                }
            }
            if (var21 == Integer.MAX_VALUE) {
                return -1;
            }
        }
        if (arg6 == var19 && arg5 == var20) {
            return 0;
        }
        byte var31 = 0;
        class501.field7658[var31] = var19;
        int var37 = var31 + 1;
        class71.field1051[var31] = var20;
        int var32;
        int var33 = var32 = class409.field6004[var19 - var17][var20 - var18];
        while (arg6 != var19 || arg5 != var20) {
            if (var32 != var33) {
                var32 = var33;
                class501.field7658[var37] = var19;
                class71.field1051[var37++] = var20;
            }
            if ((var33 & 0x2) != 0) {
                var19++;
            } else if ((var33 & 0x8) != 0) {
                var19--;
            }
            if ((var33 & 0x1) != 0) {
                var20++;
            } else if ((var33 & 0x4) != 0) {
                var20--;
            }
            var33 = class409.field6004[var19 - var17][var20 - var18];
        }
        int var34 = 0;
        while ((var37--) > 0) {
            arg10[var34] = class501.field7658[var37];
            arg12[var34++] = class71.field1051[var37];
            if (var34 >= arg10.length) {
                break;
            }
        }
        if (arg11 == -1) {
            return var34;
        } else {
            return -58;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lps;ILhe;)Z")
    public final boolean method2952(class59 arg0, int arg1, class239 arg2) {
        field7497++;
        if (class239.field3340 < 0) {
            for (int var4 = 0; var4 < this.field7506.length; var4++) {
                if (!arg2.method1442(this.field7506[var4], (byte) -111)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field7506.length; var5++) {
                if (!arg2.method1445(arg1 ^ 0xFFFFFFC5, this.field7506[var5], class239.field3340)) {
                    return false;
                }
            }
        }
        if (arg1 != -1) {
            method2954((byte) -120);
        }
        for (int var6 = 0; var6 < this.field7498.length; var6++) {
            if (!arg0.method428(-14471, this.field7498[var6])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lhe;Lps;IIIZ)[F")
    public final float[] method2953(class239 arg0, class59 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        class163.field2132 = arg1;
        class284.field4057 = arg0;
        field7504++;
        for (int var7 = arg4; var7 < this.field7495.length; var7++) {
            this.field7495[var7].method1050(-30579, arg2, arg3);
        }
        class283.method1718(arg2, 83, arg3);
        float[] var8 = new float[arg3 * 4 * arg2];
        int var9 = 0;
        for (int var10 = 0; var10 < arg3; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field7508.field5859) {
                int[] var16 = this.field7508.method31(-780833076, var10);
                var13 = var16;
                var15 = var16;
                var14 = var16;
            } else {
                int[][] var12 = this.field7508.method486((byte) 105, var10);
                var13 = var12[2];
                var14 = var12[0];
                var15 = var12[1];
            }
            int[] var17;
            if (this.field7500.field5859) {
                var17 = this.field7500.method31(-780833076, var10);
            } else {
                var17 = this.field7500.method486((byte) 82, var10)[0];
            }
            int[] var18;
            if (this.field7502.field5859) {
                var18 = this.field7502.method31(arg4 - 780833076, var10);
            } else {
                var18 = this.field7502.method486((byte) 126, var10)[0];
            }
            if (arg5) {
                var9 = var10 << 2;
            }
            for (int var19 = arg2 - 1; var19 >= 0; var19--) {
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
                if (arg5) {
                    var9 += (arg2 << 2) - 4;
                }
            }
        }
        for (int var11 = 0; var11 < this.field7495.length; var11++) {
            this.field7495[var11].method485(true);
        }
        return var8;
    }

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "(B)[Ltq;")
    public static final class426[] method2954(byte arg0) {
        if (arg0 != -98) {
            method2949((byte) 79);
        }
        field7505++;
        return new class426[] { class503.field7678, class112.field1467, class201.field2788, class248.field3548, class355.field5124, class423.field6255, class342.field4971, class126.field1624, class506.field7715, class464.field6728, class230.field3219, class100.field1368, class361.field5399, class360.field5340, class7.field119 };
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(III)I")
    public static final int method2955(int arg0, int arg1, int arg2) {
        if (arg1 != 11620) {
            return 20;
        }
        field7507++;
        if (arg0 == -1) {
            return 12345678;
        }
        int var3 = (arg0 & 0x7F) * arg2 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "()V")
    public class491() {
        this.field7506 = new int[0];
        this.field7498 = new int[0];
        this.field7502 = new class111(0);
        this.field7502.field5846 = 1;
        this.field7508 = new class111();
        this.field7508.field5846 = 1;
        this.field7500 = new class111();
        this.field7500.field5846 = 1;
        this.field7495 = new class397[] { this.field7508, this.field7500, this.field7502 };
    }

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(Lae;)V")
    public class491(class156 arg0) {
        int var2 = arg0.method941((byte) 126);
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        this.field7495 = new class397[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            class397 var16 = class176.method1102(111, arg0);
            if (var16.method484((byte) 25) >= 0) {
                var3++;
            }
            if (var16.method1049(902) >= 0) {
                var4++;
            }
            int var17 = var16.field5861.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method941((byte) 123);
            }
            this.field7495[var6] = var16;
        }
        this.field7506 = new int[var3];
        int var7 = 0;
        this.field7498 = new int[var4];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class397 var11 = this.field7495[var9];
            int var12 = var11.field5861.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field5861[var13] = this.field7495[var5[var9][var13]];
            }
            int var14 = var11.method484((byte) 25);
            int var15 = var11.method1049(902);
            if (var14 > 0) {
                this.field7506[var7++] = var14;
            }
            if (var15 > 0) {
                this.field7498[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field7508 = this.field7495[arg0.method941((byte) 126)];
        this.field7500 = this.field7495[arg0.method941((byte) 123)];
        this.field7502 = this.field7495[arg0.method941((byte) 123)];
        Object var10 = null;
    }
}
