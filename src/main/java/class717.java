import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class717 extends class626 {

    @OriginalMember(owner = "client!dr", name = "s", descriptor = "Loea;")
    private class594 field10025;

    @OriginalMember(owner = "client!dr", name = "k", descriptor = "Lbh;")
    private class36 field10017;

    @OriginalMember(owner = "client!dr", name = "m", descriptor = "Luea;")
    private class315 field10019;

    @OriginalMember(owner = "client!dr", name = "E", descriptor = "I")
    private int field10037;

    @OriginalMember(owner = "client!dr", name = "l", descriptor = "I")
    private int field10018;

    @OriginalMember(owner = "client!dr", name = "j", descriptor = "I")
    private int field10016;

    @OriginalMember(owner = "client!dr", name = "F", descriptor = "I")
    private int field10038;

    @OriginalMember(owner = "client!dr", name = "n", descriptor = "[[F")
    private float[][] field10020;

    @OriginalMember(owner = "client!dr", name = "x", descriptor = "[[F")
    private float[][] field10030;

    @OriginalMember(owner = "client!dr", name = "h", descriptor = "[[F")
    private float[][] field10014;

    @OriginalMember(owner = "client!dr", name = "A", descriptor = "I")
    private int field10033;

    @OriginalMember(owner = "client!dr", name = "u", descriptor = "Lud;")
    private class35 field10027;

    @OriginalMember(owner = "client!dr", name = "t", descriptor = "Lmea;")
    private class427 field10026;

    @OriginalMember(owner = "client!dr", name = "y", descriptor = "Lmp;")
    private class758 field10031;

    @OriginalMember(owner = "client!dr", name = "p", descriptor = "Lff;")
    private class9 field10022;

    @OriginalMember(owner = "client!dr", name = "r", descriptor = "Ltda;")
    private class635 field10024;

    @OriginalMember(owner = "client!dr", name = "C", descriptor = "Ldda;")
    private class379 field10035;

    @OriginalMember(owner = "client!dr", name = "i", descriptor = "Ldda;")
    private class379 field10015;

    @OriginalMember(owner = "client!dr", name = "z", descriptor = "[I")
    public static int[] field10032 = new int[128];

    @OriginalMember(owner = "client!dr", name = "D", descriptor = "[I")
    public static int[] field10036;

    @OriginalMember(owner = "client!dr", name = "o", descriptor = "I")
    public static int field10021;

    @OriginalMember(owner = "client!dr", name = "q", descriptor = "I")
    public static int field10023;

    @OriginalMember(owner = "client!dr", name = "v", descriptor = "I")
    private int field10028;

    @OriginalMember(owner = "client!dr", name = "w", descriptor = "I")
    public static int field10029;

    @OriginalMember(owner = "client!dr", name = "G", descriptor = "I")
    public static int field10039;

    @OriginalMember(owner = "client!dr", name = "B", descriptor = "Lsha;")
    public static class725 field10034;

    static {
        for (int var0 = 0; var0 < field10032.length; var0++) {
            field10032[var0] = -1;
        }
        for (int var1 = 65; var1 <= 90; var1++) {
            field10032[var1] = var1 - 65;
        }
        for (int var2 = 97; var2 <= 122; var2++) {
            field10032[var2] = var2 + 26 - 97;
        }
        for (int var3 = 48; var3 <= 57; var3++) {
            field10032[var3] = var3 + 52 - 48;
        }
        field10032[45] = field10032[47] = 63;
        field10032[42] = field10032[43] = 62;
        field10036 = new int[1];
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(BS)V", line = 5)
    private final void method4000(byte arg0, short arg1) {
        int var3 = -119 % ((85 - arg0) / 38);
        field10029++;
        if (this.field10025.field8682) {
            this.field10027.method223(1493807496, arg1);
        } else {
            this.field10027.method237(false, arg1);
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIIIIII)V", line = 29)
    private final void method4001(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field10021++;
        long var8 = (long) arg1;
        int var10 = (arg5 << this.field10019.field3915) + arg4;
        int var11 = (arg2 << this.field10019.field3915) + arg6;
        int var12 = this.field10019.method1827(-3458, var10, var11);
        if ((arg4 & 0x7F) == 0 || (arg6 & 0x7F) == 0) {
            var8 = ((long) var11 & 0xFFFFL) << 16 | (long) var10 & 0xFFFFL;
            class626 var13 = this.field10031.method4203(true, var8);
            if (var13 != null) {
                this.method4000((byte) -28, ((class239) var13).field3369);
                return;
            }
        }
        short var14 = (short) (this.field10028++);
        if (var8 != -1L) {
            this.field10031.method4211(new class239(var14), (byte) 25, var8);
        }
        float var15;
        float var16;
        float var17;
        if (arg4 == 0 && arg6 == 0) {
            var15 = this.field10020[arg0][arg3];
            var16 = this.field10030[arg0][arg3];
            var17 = this.field10014[arg0][arg3];
        } else if (this.field10019.field3920 == arg4 && arg6 == 0) {
            var17 = this.field10014[arg0 + 1][arg3];
            var15 = this.field10020[arg0 + 1][arg3];
            var16 = this.field10030[arg0 + 1][arg3];
        } else if (this.field10019.field3920 == arg4 && this.field10019.field3920 == arg6) {
            var17 = this.field10014[arg0 + 1][arg3 + 1];
            var16 = this.field10030[arg0 + 1][arg3 + 1];
            var15 = this.field10020[arg0 + 1][arg3 + 1];
        } else if (arg4 == 0 && this.field10019.field3920 == arg6) {
            var16 = this.field10030[arg0][arg3 + 1];
            var17 = this.field10014[arg0][arg3 + 1];
            var15 = this.field10020[arg0][arg3 + 1];
        } else {
            float var18 = (float) arg4 / (float) this.field10019.field3920;
            float var19 = (float) arg6 / (float) this.field10019.field3920;
            float var20 = this.field10014[arg0][arg3];
            float var21 = this.field10030[arg0][arg3];
            float var22 = this.field10020[arg0][arg3];
            float var23 = this.field10014[arg0 + 1][arg3];
            float var24 = this.field10030[arg0 + 1][arg3];
            float var25 = (this.field10030[arg0 + 1][arg3 + 1] - var24) * var18 + var24;
            float var26 = (this.field10014[arg0][arg3 + 1] - var20) * var18 + var20;
            float var27 = (this.field10014[arg0 + 1][arg3 + 1] - var23) * var18 + var23;
            float var28 = (this.field10020[arg0][arg3 + 1] - var22) * var18 + var22;
            float var29 = this.field10020[arg0 + 1][arg3];
            float var30 = (this.field10030[arg0][arg3 + 1] - var21) * var18 + var21;
            float var31 = (this.field10020[arg0 + 1][arg3 + 1] - var29) * var18 + var29;
            var17 = (var27 - var26) * var19 + var26;
            var16 = (var25 - var30) * var19 + var30;
            var15 = (var31 - var28) * var19 + var28;
        }
        float var32 = (float) (this.field10017.method290((byte) -107) - var10);
        float var33 = (float) (this.field10017.method298(false) - var12);
        float var34 = (float) (this.field10017.method291(0) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var33 * var36;
        float var38 = var34 * var36;
        float var39 = var32 * var36;
        float var40 = var35 / (float) this.field10017.method294(74);
        float var41 = 1.0F - var40 * var40;
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var15 * var38 + var16 * var37 + var17 * var39;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field10017.method292(6865);
        int var45 = (int) ((float) ((var44 & 0xFFB26B) >> 16) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) ((var44 & 0xFFF7) >> 8) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (this.field10025.field8682) {
            this.field10026.method2597((byte) 46, (float) var10);
            this.field10026.method2597((byte) 46, (float) var12);
            this.field10026.method2597((byte) 46, (float) var11);
        } else {
            this.field10026.method2596(arg1 + 74, (float) var10);
            this.field10026.method2596(127, (float) var12);
            this.field10026.method2596(105, (float) var11);
        }
        if (var47 > 255) {
            var47 = 255;
        }
        this.field10026.method263((byte) 105, var45);
        this.field10026.method263((byte) -96, var46);
        this.field10026.method263((byte) 63, var47);
        this.field10026.method263((byte) -97, 255);
        this.method4000((byte) 125, var14);
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIII[[Z)V", line = 199)
    public final void method4002(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4) {
        field10023++;
        if (this.field10022 == null || this.field10037 > arg0 + arg1 || this.field10018 < (arg0 - arg1) || (arg1 + arg2) < this.field10016 || arg3 != -1462600 || this.field10038 < arg2 - arg1) {
            return;
        }
        for (int var6 = this.field10016; var6 <= this.field10038; var6++) {
            for (int var7 = this.field10037; var7 <= this.field10018; var7++) {
                int var8 = var7 - arg0;
                int var9 = var6 - arg2;
                if ((-arg1) < var8 && var8 < arg1 && var9 > -arg1 && arg1 > var9 && arg4[var8 + arg1][var9 + arg1]) {
                    this.field10025.method3461((byte) 126, (int) (this.field10017.method296((byte) 3) * 255.0F) << 24);
                    this.field10025.method3409(this.field10035, null, this.field10015, null, (byte) 125);
                    this.field10025.method3420((byte) -121, this.field10033, this.field10022, 0, 4);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(I)V", line = 302)
    public static void method4003(int arg0) {
        field10036 = null;
        field10032 = null;
        if (arg0 != 42) {
            method4003(86);
        }
        field10034 = null;
    }

    @OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(Loea;Luea;Lbh;[I)V", line = 316)
    public class717(class594 arg0, class315 arg1, class36 arg2, int[] arg3) {
        this.field10025 = arg0;
        this.field10017 = arg2;
        this.field10019 = arg1;
        int var5 = this.field10017.method294(122) - (arg1.field3920 >> 1);
        this.field10037 = this.field10017.method290((byte) -124) - var5 >> arg1.field3915;
        this.field10018 = var5 + this.field10017.method290((byte) -120) >> arg1.field3915;
        this.field10016 = this.field10017.method291(0) - var5 >> arg1.field3915;
        this.field10038 = this.field10017.method291(0) + var5 >> arg1.field3915;
        int var6 = this.field10018 + 1 - this.field10037;
        int var7 = this.field10038 + 1 - this.field10016;
        this.field10020 = new float[var6 + 1][var7 + 1];
        this.field10030 = new float[var6 + 1][var7 + 1];
        this.field10014 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var25 = this.field10016 + var8;
            if (var25 > 0 && this.field10019.field3914 - 1 > var25) {
                for (int var26 = 0; var26 <= var6; var26++) {
                    int var27 = var26 + this.field10037;
                    if (var27 > 0 && var27 < (this.field10019.field3924 - 1)) {
                        int var28 = arg1.method1825(var25, -128, var27 + 1) - arg1.method1825(var25, -128, var27 - 1);
                        int var29 = arg1.method1825(var25 + 1, -128, var27) - arg1.method1825(var25 - 1, -128, var27);
                        float var30 = (float) (1.0D / Math.sqrt((double) (var28 * var28 + (var29 * var29) + 65536)));
                        this.field10014[var26][var8] = (float) var28 * var30;
                        this.field10030[var26][var8] = var30 * -256.0F;
                        this.field10020[var26][var8] = (float) var29 * var30;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field10016; var10 <= this.field10038; var10++) {
            if (var10 >= 0 && arg1.field3914 > var10) {
                for (int var21 = this.field10037; var21 <= this.field10018; var21++) {
                    if (var21 >= 0 && var21 < arg1.field3924) {
                        int var22 = arg3[var9];
                        int[] var23 = arg1.field4470[var21][var10];
                        if (var23 != null && var22 != 0) {
                            if (var22 == 1) {
                                int var24 = 0;
                                while (var23.length > var24) {
                                    if (var23[var24++] != -1 && var23[var24++] != -1 && var23[var24++] != -1) {
                                        this.field10033 += 3;
                                    }
                                }
                            } else {
                                this.field10033 += 3;
                            }
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field10018 - this.field10037;
            }
        }
        if (this.field10033 > 0) {
            this.field10027 = new class35(this.field10033 * 2);
            this.field10026 = new class427(this.field10033 * 16);
            this.field10031 = new class758(class613.method3530(false, this.field10033));
            int var11 = 0;
            int var12 = 0;
            for (int var13 = this.field10016; var13 <= this.field10038; var13++) {
                if (var13 >= 0 && var13 < arg1.field3914) {
                    int var14 = 0;
                    for (int var15 = this.field10037; var15 <= this.field10018; var15++) {
                        if (var15 >= 0 && arg1.field3924 > var15) {
                            int var16 = arg3[var12];
                            int[] var17 = arg1.field4470[var15][var13];
                            if (var17 != null && var16 != 0) {
                                if (var16 == 1) {
                                    int[] var18 = arg1.field4467[var15][var13];
                                    int[] var19 = arg1.field4469[var15][var13];
                                    int var20 = 0;
                                    label111: while (true) {
                                        while (true) {
                                            if (var20 >= var17.length) {
                                                break label111;
                                            }
                                            if (var17[var20] == -1 || var17[var20 + 1] == -1 || var17[var20 + 2] == -1) {
                                                var20 += 3;
                                            } else {
                                                this.method4001(var14, -1, var13, var11, var18[var20], var15, var19[var20]);
                                                var20++;
                                                this.method4001(var14, -1, var13, var11, var18[var20], var15, var19[var20]);
                                                var20++;
                                                this.method4001(var14, -1, var13, var11, var18[var20], var15, var19[var20]);
                                                var20++;
                                            }
                                        }
                                    }
                                } else if (var16 == 3) {
                                    this.method4001(var14, -1, var13, var11, 0, var15, 0);
                                    this.method4001(var14, -1, var13, var11, arg1.field3920, var15, 0);
                                    this.method4001(var14, -1, var13, var11, 0, var15, arg1.field3920);
                                } else if (var16 == 2) {
                                    this.method4001(var14, -1, var13, var11, arg1.field3920, var15, 0);
                                    this.method4001(var14, -1, var13, var11, arg1.field3920, var15, arg1.field3920);
                                    this.method4001(var14, -1, var13, var11, 0, var15, 0);
                                } else if (var16 == 5) {
                                    this.method4001(var14, -1, var13, var11, arg1.field3920, var15, arg1.field3920);
                                    this.method4001(var14, -1, var13, var11, 0, var15, arg1.field3920);
                                    this.method4001(var14, -1, var13, var11, arg1.field3920, var15, 0);
                                } else if (var16 == 4) {
                                    this.method4001(var14, -1, var13, var11, 0, var15, arg1.field3920);
                                    this.method4001(var14, -1, var13, var11, 0, var15, 0);
                                    this.method4001(var14, -1, var13, var11, arg1.field3920, var15, arg1.field3920);
                                }
                            }
                        }
                        var12++;
                        var14++;
                    }
                } else {
                    var12 += this.field10018 - this.field10037;
                }
                var11++;
            }
            this.field10022 = this.field10025.method3415(this.field10027.field469, 4, 5123, false, this.field10027.field483);
            this.field10024 = this.field10025.method3418(false, this.field10026.field483, -2, 16, this.field10026.field469);
            this.field10035 = new class379(this.field10024, 5126, 3, 0);
            this.field10015 = new class379(this.field10024, 5121, 4, 12);
        } else {
            this.field10035 = null;
            this.field10022 = null;
            this.field10015 = null;
            this.field10024 = null;
        }
        this.field10027 = null;
        this.field10014 = this.field10030 = this.field10020 = null;
        this.field10031 = null;
        this.field10026 = null;
    }
}
