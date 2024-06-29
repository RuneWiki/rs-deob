import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class580 extends class656 {

    @OriginalMember(owner = "client!v", name = "x", descriptor = "Lmu;")
    private class304 field7611;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "Lrda;")
    private class663 field7597;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "Ltn;")
    private class87 field7596;

    @OriginalMember(owner = "client!v", name = "n", descriptor = "I")
    private int field7601;

    @OriginalMember(owner = "client!v", name = "B", descriptor = "I")
    private int field7615;

    @OriginalMember(owner = "client!v", name = "p", descriptor = "I")
    private int field7603;

    @OriginalMember(owner = "client!v", name = "F", descriptor = "I")
    private int field7617;

    @OriginalMember(owner = "client!v", name = "s", descriptor = "[[F")
    private float[][] field7606;

    @OriginalMember(owner = "client!v", name = "G", descriptor = "[[F")
    private float[][] field7618;

    @OriginalMember(owner = "client!v", name = "L", descriptor = "[[F")
    private float[][] field7622;

    @OriginalMember(owner = "client!v", name = "H", descriptor = "I")
    private int field7619;

    @OriginalMember(owner = "client!v", name = "J", descriptor = "Lee;")
    private class677 field7620;

    @OriginalMember(owner = "client!v", name = "v", descriptor = "Luf;")
    private class451 field7609;

    @OriginalMember(owner = "client!v", name = "l", descriptor = "Ldu;")
    private class360 field7599;

    @OriginalMember(owner = "client!v", name = "m", descriptor = "Las;")
    private class154 field7600;

    @OriginalMember(owner = "client!v", name = "w", descriptor = "Lcs;")
    private class345 field7610;

    @OriginalMember(owner = "client!v", name = "u", descriptor = "Lim;")
    private class572 field7608;

    @OriginalMember(owner = "client!v", name = "y", descriptor = "Lim;")
    private class572 field7612;

    @OriginalMember(owner = "client!v", name = "k", descriptor = "[[F")
    public static float[][] field7598 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

    @OriginalMember(owner = "client!v", name = "K", descriptor = "I")
    public static int field7621 = 0;

    @OriginalMember(owner = "client!v", name = "A", descriptor = "Z")
    public static boolean field7614 = false;

    @OriginalMember(owner = "client!v", name = "o", descriptor = "F")
    public static float field7602;

    @OriginalMember(owner = "client!v", name = "q", descriptor = "F")
    public static float field7604;

    @OriginalMember(owner = "client!v", name = "r", descriptor = "I")
    public static int field7605;

    @OriginalMember(owner = "client!v", name = "z", descriptor = "I")
    private int field7613;

    @OriginalMember(owner = "client!v", name = "D", descriptor = "I")
    public static int field7616;

    @OriginalMember(owner = "client!v", name = "M", descriptor = "I")
    public static int field7623;

    @OriginalMember(owner = "client!v", name = "t", descriptor = "[[Lvfa;")
    public static class672[][] field7607;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIIIII)V", line = 22)
    private final void method3178(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field7623++;
        long var8 = -1L;
        int var10 = (arg3 << this.field7611.field3990) + arg0;
        int var11 = (arg2 << this.field7611.field3990) + arg6;
        int var12 = this.field7611.method1750((byte) 105, var10, var11);
        if ((arg0 & 0x7F) == 0 || (arg6 & 0x7F) == 0) {
            var8 = ((long) var11 & 0xFFFFL) << 16 | (long) var10 & 0xFFFFL;
            class656 var13 = this.field7599.method2135(var8, (byte) 31);
            if (var13 != null) {
                this.method3181(((class361) var13).field5089, -117);
                return;
            }
        }
        short var14 = (short) (this.field7613++);
        if (var8 != -1L) {
            this.field7599.method2143(-1, new class361(var14), var8);
        }
        float var15;
        float var16;
        float var17;
        if (arg0 == 0 && arg6 == 0) {
            var15 = this.field7606[arg4][arg5];
            var16 = this.field7622[arg4][arg5];
            var17 = this.field7618[arg4][arg5];
        } else if (this.field7611.field3989 == arg0 && arg6 == 0) {
            var17 = this.field7618[arg4 + 1][arg5];
            var15 = this.field7606[arg4 + 1][arg5];
            var16 = this.field7622[arg4 + 1][arg5];
        } else if (this.field7611.field3989 == arg0 && this.field7611.field3989 == arg6) {
            var16 = this.field7622[arg4 + 1][arg5 + 1];
            var15 = this.field7606[arg4 + 1][arg5 + 1];
            var17 = this.field7618[arg4 + 1][arg5 + 1];
        } else if (arg0 == 0 && this.field7611.field3989 == arg6) {
            var17 = this.field7618[arg4][arg5 + 1];
            var16 = this.field7622[arg4][arg5 + 1];
            var15 = this.field7606[arg4][arg5 + 1];
        } else {
            float var18 = (float) arg0 / (float) this.field7611.field3989;
            float var19 = (float) arg6 / (float) this.field7611.field3989;
            float var20 = this.field7606[arg4][arg5];
            float var21 = this.field7622[arg4][arg5];
            float var22 = this.field7618[arg4][arg5];
            float var23 = this.field7606[arg4 + 1][arg5];
            float var24 = this.field7622[arg4 + 1][arg5];
            float var25 = (this.field7622[arg4 + 1][arg5 + 1] - var24) * var18 + var24;
            float var26 = (this.field7622[arg4][arg5 + 1] - var21) * var18 + var21;
            float var27 = (this.field7606[arg4][arg5 + 1] - var20) * var18 + var20;
            float var28 = this.field7618[arg4 + 1][arg5];
            float var29 = (this.field7606[arg4 + 1][arg5 + 1] - var23) * var18 + var23;
            float var30 = (this.field7618[arg4][arg5 + 1] - var22) * var18 + var22;
            var15 = (var29 - var27) * var19 + var27;
            var16 = (var25 - var26) * var19 + var26;
            float var31 = (this.field7618[arg4 + 1][arg5 + 1] - var28) * var18 + var28;
            var17 = (var31 - var30) * var19 + var30;
        }
        float var32 = (float) (this.field7596.method665(109) - var10);
        float var33 = (float) (this.field7596.method669(-22096) - var12);
        float var34 = (float) (this.field7596.method670((byte) -75) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = (float) arg1 / var35;
        float var37 = var33 * var36;
        float var38 = var32 * var36;
        float var39 = var34 * var36;
        float var40 = var35 / (float) this.field7596.method673(-55);
        float var41 = 1.0F - var40 * var40;
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var17 * var39 + var15 * var38 + var16 * var37;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field7596.method671(false);
        int var45 = (int) ((float) ((var44 & 0xFF047E) >> 16) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) ((var44 & 0xFF9E) >> 8) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (this.field7597.field9021) {
            this.field7609.method2574(110, (float) var10);
            this.field7609.method2574(112, (float) var12);
            this.field7609.method2574(arg1 ^ 0x62, (float) var11);
        } else {
            this.field7609.method2573(4440, (float) var10);
            this.field7609.method2573(arg1 + 4439, (float) var12);
            this.field7609.method2573(arg1 ^ 0x1159, (float) var11);
        }
        if (var47 > 255) {
            var47 = 255;
        }
        this.field7609.method3823(-20, var45);
        this.field7609.method3823(-45, var46);
        this.field7609.method3823(-124, var47);
        this.field7609.method3823(-94, 255);
        this.method3181(var14, -79);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(B)V", line = 189)
    public static void method3179(byte arg0) {
        field7607 = null;
        if (arg0 == 99) {
            field7598 = null;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IZII[[Z)V", line = 202)
    public final void method3180(int arg0, boolean arg1, int arg2, int arg3, boolean[][] arg4) {
        field7616++;
        if (!arg1) {
            this.field7596 = null;
        }
        if (this.field7600 == null || arg0 + arg3 < this.field7601 || (arg3 - arg0) > this.field7615 || (arg0 + arg2) < this.field7603 || (arg2 - arg0) > this.field7617) {
            return;
        }
        for (int var6 = this.field7603; var6 <= this.field7617; var6++) {
            for (int var7 = this.field7601; var7 <= this.field7615; var7++) {
                int var8 = var7 - arg3;
                int var9 = var6 - arg2;
                if (var8 > -arg0 && var8 < arg0 && -arg0 < var9 && arg0 > var9 && arg4[arg0 + var8][arg0 + var9]) {
                    this.field7597.method3651(-76, (int) (this.field7596.method666((byte) 110) * 255.0F) << 24);
                    this.field7597.method3593(32886, null, this.field7608, null, this.field7612);
                    this.field7597.method3647(this.field7600, 0, (byte) -87, 4, this.field7619);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lrda;Lmu;Ltn;[I)V", line = 269)
    public class580(class663 arg0, class304 arg1, class87 arg2, int[] arg3) {
        this.field7611 = arg1;
        this.field7597 = arg0;
        this.field7596 = arg2;
        int var5 = this.field7596.method673(-61) - (arg1.field3989 >> 1);
        this.field7601 = this.field7596.method665(114) - var5 >> arg1.field3990;
        this.field7615 = var5 + this.field7596.method665(112) >> arg1.field3990;
        this.field7603 = this.field7596.method670((byte) -99) - var5 >> arg1.field3990;
        this.field7617 = var5 + this.field7596.method670((byte) -83) >> arg1.field3990;
        int var6 = this.field7615 + 1 - this.field7601;
        int var7 = this.field7617 + 1 - this.field7603;
        this.field7606 = new float[var6 + 1][var7 + 1];
        this.field7618 = new float[var6 + 1][var7 + 1];
        this.field7622 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var25 = this.field7603 + var8;
            if (var25 > 0 && this.field7611.field3996 - 1 > var25) {
                for (int var26 = 0; var26 <= var6; var26++) {
                    int var27 = this.field7601 + var26;
                    if (var27 > 0 && (this.field7611.field3992 - 1) > var27) {
                        int var28 = arg1.method1742(var27 + 1, 103, var25) - arg1.method1742(var27 - 1, 105, var25);
                        int var29 = arg1.method1742(var27, 121, var25 + 1) - arg1.method1742(var27, 88, var25 - 1);
                        float var30 = (float) (1.0D / Math.sqrt((double) (var29 * var29 + (var28 * var28 + 65536))));
                        this.field7606[var26][var8] = (float) var28 * var30;
                        this.field7622[var26][var8] = var30 * -256.0F;
                        this.field7618[var26][var8] = (float) var29 * var30;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field7603; var10 <= this.field7617; var10++) {
            if (var10 >= 0 && arg1.field3996 > var10) {
                for (int var21 = this.field7601; var21 <= this.field7615; var21++) {
                    if (var21 >= 0 && var21 < arg1.field3992) {
                        int var22 = arg3[var9];
                        int[] var23 = arg1.field4320[var21][var10];
                        if (var23 != null && var22 != 0) {
                            if (var22 == 1) {
                                int var24 = 0;
                                while (var23.length > var24) {
                                    if (var23[var24++] != -1 && var23[var24++] != -1 && var23[var24++] != -1) {
                                        this.field7619 += 3;
                                    }
                                }
                            } else {
                                this.field7619 += 3;
                            }
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field7615 - this.field7601;
            }
        }
        if (this.field7619 > 0) {
            this.field7620 = new class677(this.field7619 * 2);
            this.field7609 = new class451(this.field7619 * 16);
            this.field7599 = new class360(class737.method4119(this.field7619, (byte) -128));
            int var11 = 0;
            int var12 = 0;
            for (int var13 = this.field7603; var13 <= this.field7617; var13++) {
                if (var13 >= 0 && arg1.field3996 > var13) {
                    int var14 = 0;
                    for (int var15 = this.field7601; var15 <= this.field7615; var15++) {
                        if (var15 >= 0 && arg1.field3992 > var15) {
                            int var16 = arg3[var12];
                            int[] var17 = arg1.field4320[var15][var13];
                            if (var17 != null && var16 != 0) {
                                if (var16 == 1) {
                                    int[] var18 = arg1.field4314[var15][var13];
                                    int[] var19 = arg1.field4309[var15][var13];
                                    int var20 = 0;
                                    label111: while (true) {
                                        while (true) {
                                            if (var20 >= var17.length) {
                                                break label111;
                                            }
                                            if (var17[var20] == -1 || var17[var20 + 1] == -1 || var17[var20 + 2] == -1) {
                                                var20 += 3;
                                            } else {
                                                this.method3178(var18[var20], 1, var13, var15, var14, var11, var19[var20]);
                                                var20++;
                                                this.method3178(var18[var20], 1, var13, var15, var14, var11, var19[var20]);
                                                var20++;
                                                this.method3178(var18[var20], 1, var13, var15, var14, var11, var19[var20]);
                                                var20++;
                                            }
                                        }
                                    }
                                } else if (var16 == 3) {
                                    this.method3178(0, 1, var13, var15, var14, var11, 0);
                                    this.method3178(arg1.field3989, 1, var13, var15, var14, var11, 0);
                                    this.method3178(0, 1, var13, var15, var14, var11, arg1.field3989);
                                } else if (var16 == 2) {
                                    this.method3178(arg1.field3989, 1, var13, var15, var14, var11, 0);
                                    this.method3178(arg1.field3989, 1, var13, var15, var14, var11, arg1.field3989);
                                    this.method3178(0, 1, var13, var15, var14, var11, 0);
                                } else if (var16 == 5) {
                                    this.method3178(arg1.field3989, 1, var13, var15, var14, var11, arg1.field3989);
                                    this.method3178(0, 1, var13, var15, var14, var11, arg1.field3989);
                                    this.method3178(arg1.field3989, 1, var13, var15, var14, var11, 0);
                                } else if (var16 == 4) {
                                    this.method3178(0, 1, var13, var15, var14, var11, arg1.field3989);
                                    this.method3178(0, 1, var13, var15, var14, var11, 0);
                                    this.method3178(arg1.field3989, 1, var13, var15, var14, var11, arg1.field3989);
                                }
                            }
                        }
                        var12++;
                        var14++;
                    }
                } else {
                    var12 += this.field7615 - this.field7601;
                }
                var11++;
            }
            this.field7600 = this.field7597.method3627(5123, (byte) -85, this.field7620.field9399, this.field7620.field9419, false);
            this.field7610 = this.field7597.method3619((byte) 90, this.field7609.field9419, false, 16, this.field7609.field9399);
            this.field7608 = new class572(this.field7610, 5126, 3, 0);
            this.field7612 = new class572(this.field7610, 5121, 4, 12);
        } else {
            this.field7612 = null;
            this.field7610 = null;
            this.field7608 = null;
            this.field7600 = null;
        }
        this.field7606 = this.field7622 = this.field7618 = null;
        this.field7609 = null;
        this.field7620 = null;
        this.field7599 = null;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(SI)V", line = 515)
    private final void method3181(short arg0, int arg1) {
        if (arg1 > -36) {
            this.method3181((short) -69, -32);
        }
        if (this.field7597.field9021) {
            this.field7620.method3831(1182, arg0);
        } else {
            this.field7620.method3819(arg0, 46);
        }
        field7605++;
    }
}
