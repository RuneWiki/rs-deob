import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class44 extends class665 {

    @OriginalMember(owner = "client!gp", name = "z", descriptor = "[I")
    private int[] field657;

    @OriginalMember(owner = "client!gp", name = "t", descriptor = "[I")
    private int[] field651;

    @OriginalMember(owner = "client!gp", name = "u", descriptor = "Leca;")
    private class694 field652;

    @OriginalMember(owner = "client!gp", name = "w", descriptor = "Leca;")
    private class694 field654;

    @OriginalMember(owner = "client!gp", name = "y", descriptor = "Leca;")
    private class694 field656;

    @OriginalMember(owner = "client!gp", name = "A", descriptor = "[Leca;")
    private class694[] field658;

    @OriginalMember(owner = "client!gp", name = "D", descriptor = "Lvh;")
    public static class328 field661 = new class328(260);

    @OriginalMember(owner = "client!gp", name = "F", descriptor = "Z")
    public static boolean field663 = false;

    @OriginalMember(owner = "client!gp", name = "H", descriptor = "[[Z")
    public static boolean[][] field665 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

    @OriginalMember(owner = "client!gp", name = "v", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "client!gp", name = "x", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!gp", name = "B", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!gp", name = "C", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!gp", name = "E", descriptor = "I")
    public static int field662;

    @OriginalMember(owner = "client!gp", name = "G", descriptor = "Lvfa;")
    public static class616 field664;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lpj;Le;B)Z", line = 4)
    public final boolean method244(class132 arg0, class489 arg1, byte arg2) {
        field660++;
        if (class399.field5535 >= 0) {
            for (int var4 = 0; var4 < this.field657.length; var4++) {
                if (!arg0.method931((byte) 125, this.field657[var4], class399.field5535)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field657.length; var5++) {
                if (!arg0.method947(-71, this.field657[var5])) {
                    return false;
                }
            }
        }
        if (arg2 != -9) {
            this.method244(null, null, (byte) 88);
        }
        for (int var6 = 0; var6 < this.field651.length; var6++) {
            if (!arg1.method590(this.field651[var6], (byte) -50)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(BZDIILpj;ZLe;)[I", line = 56)
    public final int[] method245(byte arg0, boolean arg1, double arg2, int arg3, int arg4, class132 arg5, boolean arg6, class489 arg7) {
        field653++;
        class273.field3860 = arg5;
        class277.field3882 = arg7;
        for (int var10 = 0; var10 < this.field658.length; var10++) {
            this.field658[var10].method2403(arg3, arg4, -256);
        }
        class457.method2633(arg2, -256);
        class687.method3782(arg3, arg0 + 124, arg4);
        int[] var11 = new int[arg3 * arg4];
        if (arg0 != -124) {
            this.method245((byte) 50, false, 0.607842310602332D, -128, 112, null, false, null);
        }
        int var12;
        byte var13;
        int var14;
        if (arg1) {
            var14 = -1;
            var13 = -1;
            var12 = arg3 - 1;
        } else {
            var12 = 0;
            var13 = 1;
            var14 = arg3;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg4; var16++) {
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field654.field9744) {
                int[] var18 = this.field654.method39(115, var16);
                var19 = var18;
                var20 = var18;
                var21 = var18;
            } else {
                int[][] var22 = this.field654.method15(-22151, var16);
                var19 = var22[2];
                var21 = var22[1];
                var20 = var22[0];
            }
            if (arg6) {
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
                int var27 = class579.field7772[var25];
                int var28 = class579.field7772[var24];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var29 = class579.field7772[var26];
                int var30 = (var27 << 8) + (var28 << 16) + var29;
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg6) {
                    var15 += arg3 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field658.length; var17++) {
            this.field658[var17].method14(arg0 + 71828448);
        }
        return var11;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(BI)Z", line = 200)
    public static final boolean method246(byte arg0, int arg1) {
        int var2 = 6 % ((30 - arg0) / 57);
        field659++;
        return arg1 == 60 || arg1 == 5 || arg1 == 1012 || arg1 == 23 || arg1 == 50;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(Le;ZILpj;IDI)[I", line = 220)
    public final int[] method247(class489 arg0, boolean arg1, int arg2, class132 arg3, int arg4, double arg5, int arg6) {
        class277.field3882 = arg0;
        field655++;
        class273.field3860 = arg3;
        for (int var9 = 0; var9 < this.field658.length; var9++) {
            this.field658[var9].method2403(arg2, arg4, -256);
        }
        class457.method2633(arg5, -256);
        class687.method3782(arg2, 0, arg4);
        int[] var10 = new int[arg4 * 4 * arg2];
        int var11 = 0;
        if (arg6 != -90970558) {
            this.field658 = null;
        }
        for (int var12 = 0; var12 < arg4; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field654.field9744) {
                int[] var18 = this.field654.method39(arg6 ^ 0xFA93E63E, var12);
                var15 = var18;
                var17 = var18;
                var16 = var18;
            } else {
                int[][] var14 = this.field654.method15(arg6 + 90948407, var12);
                var15 = var14[0];
                var16 = var14[1];
                var17 = var14[2];
            }
            int[] var19;
            if (this.field656.field9744) {
                var19 = this.field656.method39(arg6 + 90970679, var12);
            } else {
                var19 = this.field656.method15(-22151, var12)[0];
            }
            if (arg1) {
                var11 = var12;
            }
            for (int var20 = arg2 - 1; var20 >= 0; var20--) {
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
                int var24 = class579.field7772[var22];
                int var25 = class579.field7772[var21];
                if (var23 < 0) {
                    var23 = 0;
                }
                int var26 = class579.field7772[var23];
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
                var10[var11++] = (var27 << 24) + (var25 << 16) + var26 + (var24 << 8);
                if (arg1) {
                    var11 += arg2 - 1;
                }
            }
        }
        for (int var13 = 0; var13 < this.field658.length; var13++) {
            this.field658[var13].method14(71828324);
        }
        return var10;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(I)V", line = 361)
    public static void method248(int arg0) {
        field664 = null;
        field665 = null;
        field661 = null;
        if (arg0 != 0) {
            field664 = null;
        }
    }

    @OriginalMember(owner = "client!gp", name = "<init>", descriptor = "()V", line = 372)
    public class44() {
        this.field657 = new int[0];
        this.field651 = new int[0];
        this.field652 = new class678(0);
        this.field652.field9738 = 1;
        this.field654 = new class678();
        this.field654.field9738 = 1;
        this.field656 = new class678();
        this.field656.field9738 = 1;
        this.field658 = new class694[] { this.field654, this.field656, this.field652 };
    }

    @OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(Ljr;)V", line = 387)
    public class44(class96 arg0) {
        int var2 = arg0.method718(93);
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        this.field658 = new class694[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            class694 var16 = class328.method1996(-19644, arg0);
            if (var16.method16(1) >= 0) {
                var3++;
            }
            if (var16.method2402(18289) >= 0) {
                var4++;
            }
            int var17 = var16.field9749.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method718(95);
            }
            this.field658[var6] = var16;
        }
        this.field657 = new int[var3];
        this.field651 = new int[var4];
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class694 var11 = this.field658[var9];
            int var12 = var11.field9749.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field9749[var13] = this.field658[var5[var9][var13]];
            }
            int var14 = var11.method16(1);
            int var15 = var11.method2402(18289);
            if (var14 > 0) {
                this.field657[var7++] = var14;
            }
            if (var15 > 0) {
                this.field651[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field654 = this.field658[arg0.method718(-89)];
        this.field656 = this.field658[arg0.method718(92)];
        Object var10 = null;
        this.field652 = this.field658[arg0.method718(-70)];
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIZLe;Lpj;I)[F", line = 479)
    public final float[] method249(int arg0, int arg1, boolean arg2, class489 arg3, class132 arg4, int arg5) {
        field662++;
        int var7 = 96 % ((arg0 - 51) / 45);
        class277.field3882 = arg3;
        class273.field3860 = arg4;
        for (int var8 = 0; var8 < this.field658.length; var8++) {
            this.field658[var8].method2403(arg1, arg5, -256);
        }
        class687.method3782(arg1, 0, arg5);
        float[] var9 = new float[arg5 * 4 * arg1];
        int var10 = 0;
        for (int var11 = 0; var11 < arg5; var11++) {
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field654.field9744) {
                int[] var13 = this.field654.method39(114, var11);
                var14 = var13;
                var15 = var13;
                var16 = var13;
            } else {
                int[][] var17 = this.field654.method15(-22151, var11);
                var16 = var17[0];
                var14 = var17[2];
                var15 = var17[1];
            }
            int[] var18;
            if (this.field656.field9744) {
                var18 = this.field656.method39(115, var11);
            } else {
                var18 = this.field656.method15(-22151, var11)[0];
            }
            int[] var19;
            if (this.field652.field9744) {
                var19 = this.field652.method39(122, var11);
            } else {
                var19 = this.field652.method15(-22151, var11)[0];
            }
            if (arg2) {
                var10 = var11 << 2;
            }
            for (int var20 = arg1 - 1; var20 >= 0; var20--) {
                float var21 = (float) var18[var20] / 4096.0F;
                float var22 = ((float) var19[var20] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                if (var21 < 0.0F) {
                    var21 = 0.0F;
                } else if (var21 > 1.0F) {
                    var21 = 1.0F;
                }
                var9[var10++] = (float) var16[var20] * var22;
                var9[var10++] = (float) var15[var20] * var22;
                var9[var10++] = (float) var14[var20] * var22;
                var9[var10++] = var21;
                if (arg2) {
                    var10 += (arg1 << 2) - 4;
                }
            }
        }
        for (int var12 = 0; var12 < this.field658.length; var12++) {
            this.field658[var12].method14(71828324);
        }
        return var9;
    }
}
