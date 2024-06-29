import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class427 extends class66 {

    @OriginalMember(owner = "client!vq", name = "y", descriptor = "Lcp;")
    private class674 field6487;

    @OriginalMember(owner = "client!vq", name = "J", descriptor = "Ltv;")
    private class521 field6498;

    @OriginalMember(owner = "client!vq", name = "u", descriptor = "Ler;")
    private class92 field6483;

    @OriginalMember(owner = "client!vq", name = "x", descriptor = "I")
    private int field6486;

    @OriginalMember(owner = "client!vq", name = "F", descriptor = "I")
    private int field6494;

    @OriginalMember(owner = "client!vq", name = "L", descriptor = "I")
    private int field6500;

    @OriginalMember(owner = "client!vq", name = "A", descriptor = "I")
    private int field6489;

    @OriginalMember(owner = "client!vq", name = "v", descriptor = "[[F")
    private float[][] field6484;

    @OriginalMember(owner = "client!vq", name = "H", descriptor = "[[F")
    private float[][] field6496;

    @OriginalMember(owner = "client!vq", name = "M", descriptor = "[[F")
    private float[][] field6501;

    @OriginalMember(owner = "client!vq", name = "s", descriptor = "I")
    private int field6481;

    @OriginalMember(owner = "client!vq", name = "I", descriptor = "Lie;")
    private class6 field6497;

    @OriginalMember(owner = "client!vq", name = "O", descriptor = "Ltba;")
    private class148 field6503;

    @OriginalMember(owner = "client!vq", name = "w", descriptor = "Lsba;")
    private class200 field6485;

    @OriginalMember(owner = "client!vq", name = "G", descriptor = "Llga;")
    private class662 field6495;

    @OriginalMember(owner = "client!vq", name = "C", descriptor = "Lvd;")
    private class36 field6491;

    @OriginalMember(owner = "client!vq", name = "K", descriptor = "Lmk;")
    private class51 field6499;

    @OriginalMember(owner = "client!vq", name = "B", descriptor = "Lmk;")
    private class51 field6490;

    @OriginalMember(owner = "client!vq", name = "D", descriptor = "I")
    public static int field6492 = 0;

    @OriginalMember(owner = "client!vq", name = "E", descriptor = "Lhga;")
    public static class158 field6493 = new class158(116, 0);

    @OriginalMember(owner = "client!vq", name = "N", descriptor = "F")
    public static float field6502;

    @OriginalMember(owner = "client!vq", name = "q", descriptor = "I")
    public static int field6479;

    @OriginalMember(owner = "client!vq", name = "r", descriptor = "I")
    public static int field6480;

    @OriginalMember(owner = "client!vq", name = "t", descriptor = "I")
    public static int field6482;

    @OriginalMember(owner = "client!vq", name = "z", descriptor = "I")
    public static int field6488;

    @OriginalMember(owner = "client!vq", name = "P", descriptor = "I")
    private int field6504;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIIIIII)V", line = 5)
    private final void method2702(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6479++;
        long var8 = -1L;
        int var10 = (arg0 << this.field6498.field515) + arg6;
        int var11 = (arg1 << this.field6498.field515) + arg2;
        int var12 = this.field6498.method477(arg3 - 2, var11, var10);
        if ((arg6 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
            var8 = (long) var10 & 0xFFFFL | ((long) var11 & 0xFFFFL) << 16;
            class66 var13 = this.field6485.method1558(var8, (byte) -93);
            if (var13 != null) {
                this.method2705(15901, ((class426) var13).field6472);
                return;
            }
        }
        short var14 = (short) (this.field6504++);
        if (var8 != -1L) {
            this.field6485.method1564(var8, new class426(var14), (byte) 105);
        }
        float var15;
        float var16;
        float var17;
        if (arg6 == 0 && arg2 == 0) {
            var15 = this.field6501[arg4][arg5];
            var16 = this.field6496[arg4][arg5];
            var17 = this.field6484[arg4][arg5];
        } else if (this.field6498.field516 == arg6 && arg2 == 0) {
            var15 = this.field6501[arg4 + 1][arg5];
            var17 = this.field6484[arg4 + 1][arg5];
            var16 = this.field6496[arg4 + 1][arg5];
        } else if (this.field6498.field516 == arg6 && this.field6498.field516 == arg2) {
            var15 = this.field6501[arg4 + 1][arg5 + 1];
            var17 = this.field6484[arg4 + 1][arg5 + 1];
            var16 = this.field6496[arg4 + 1][arg5 + 1];
        } else if (arg6 == 0 && this.field6498.field516 == arg2) {
            var15 = this.field6501[arg4][arg5 + 1];
            var16 = this.field6496[arg4][arg5 + 1];
            var17 = this.field6484[arg4][arg5 + 1];
        } else {
            float var18 = (float) arg6 / (float) this.field6498.field516;
            float var19 = (float) arg2 / (float) this.field6498.field516;
            float var20 = this.field6501[arg4][arg5];
            float var21 = this.field6484[arg4][arg5];
            float var22 = this.field6496[arg4][arg5];
            float var23 = this.field6501[arg4 + 1][arg5];
            float var24 = this.field6484[arg4 + 1][arg5];
            float var25 = this.field6496[arg4 + 1][arg5];
            float var26 = (this.field6484[arg4][arg5 + 1] - var21) * var18 + var21;
            float var27 = (this.field6501[arg4 + 1][arg5 + 1] - var23) * var18 + var23;
            float var28 = (this.field6501[arg4][arg5 + 1] - var20) * var18 + var20;
            float var29 = (this.field6496[arg4][arg5 + 1] - var22) * var18 + var22;
            float var30 = (this.field6484[arg4 + 1][arg5 + 1] - var24) * var18 + var24;
            var15 = (var27 - var28) * var19 + var28;
            var17 = (var30 - var26) * var19 + var26;
            float var31 = (this.field6496[arg4 + 1][arg5 + 1] - var25) * var18 + var25;
            var16 = (var31 - var29) * var19 + var29;
        }
        float var32 = (float) (this.field6487.method3857((byte) -35) - var10);
        float var33 = (float) (this.field6487.method3851((byte) 121) - var12);
        float var34 = (float) (this.field6487.method3859((byte) 117) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var33 * var36;
        float var38 = var32 * var36;
        float var39 = var34 * var36;
        float var40 = var35 / (float) this.field6487.method3860((byte) -118);
        float var41 = (float) arg3 - (var40 * var40);
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var16 * var39 + var15 * var38 + var17 * var37;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field6487.method3854(-1);
        int var45 = (int) ((float) (var44 >> 16 & 0xFF) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) (var44 >> 8 & 0xFF) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (var47 > 255) {
            var47 = 255;
        }
        if (this.field6483.field1410) {
            this.field6503.method1241((byte) -73, (float) var10);
            this.field6503.method1241((byte) -123, (float) var12);
            this.field6503.method1241((byte) -103, (float) var11);
        } else {
            this.field6503.method1243(-119, (float) var10);
            this.field6503.method1243(arg3 ^ 0xFFFFFFC1, (float) var12);
            this.field6503.method1243(arg3 - 76, (float) var11);
        }
        this.field6503.method65(var45, arg3 ^ 0xFFFFFFB2);
        this.field6503.method65(var46, -77);
        this.field6503.method65(var47, arg3 ^ 0xFFFFFFB2);
        this.field6503.method65(255, -77);
        this.method2705(15901, var14);
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(ZLrfa;[[B)V", line = 167)
    public static final void method2703(boolean arg0, class184 arg1, byte[][] arg2) {
        field6480++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        if (!arg0) {
            method2704((byte) -79);
        }
        for (int var4 = 0; var4 < arg1.field1670; var4++) {
            class636.method3698(true);
            for (int var5 = 0; var5 < (class275.field4426 >> 3); var5++) {
                for (int var6 = 0; var6 < (class417.field6374 >> 3); var6++) {
                    int var7 = class463.field6924[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = (var7 & 0x3279FE7) >> 24;
                        if (!arg1.field1661 || var8 == 0) {
                            int var9 = var7 >> 1 & 0x3;
                            int var10 = var7 >> 14 & 0x3FF;
                            int var11 = (var7 & 0x3FF8) >> 3;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class476.field7058.length; var13++) {
                                if (class476.field7058[var13] == var12 && arg2[var13] != null) {
                                    class6 var14 = new class6(arg2[var13]);
                                    arg1.method972(var6 * 8, class10.field172, var14, var5 * 8, var4, var11, var8, var9, 12466, var10);
                                    arg1.method1501(var5 * 8, var3[0] == -1 ? var3 : null, var9, var6 * 8, var8, -102, class627.field8857, var14, var4, var11, var10);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var3[0] != -1) {
            class581.field8273 = class275.field4412.method1401((byte) -85, var3[2], var3[3], class254.field4046, var3[0], var3[1]);
            class579.field8255 = var3[4];
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(B)V", line = 253)
    public static void method2704(byte arg0) {
        field6493 = null;
        int var1 = -101 / ((arg0 - 59) / 40);
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IS)V", line = 265)
    private final void method2705(int arg0, short arg1) {
        field6488++;
        if (this.field6483.field1410) {
            this.field6497.method25(true, arg1);
        } else {
            this.field6497.method49(-1060492440, arg1);
        }
        if (arg0 != 15901) {
            method2703(false, null, null);
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(I[[ZIII)V", line = 296)
    public final void method2706(int arg0, boolean[][] arg1, int arg2, int arg3, int arg4) {
        field6482++;
        if (this.field6495 == null || arg3 + arg0 < this.field6486 || (arg3 - arg0) > this.field6494) {
            return;
        }
        if (arg2 != -19715) {
            this.method2702(-40, -6, -20, 83, -90, -48, 64);
        }
        if (this.field6500 > arg0 + arg4 || (arg4 - arg0) > this.field6489) {
            return;
        }
        for (int var6 = this.field6500; var6 <= this.field6489; var6++) {
            for (int var7 = this.field6486; var7 <= this.field6494; var7++) {
                int var8 = var7 - arg3;
                int var9 = var6 - arg4;
                if ((-arg0) < var8 && var8 < arg0 && -arg0 < var9 && var9 < arg0 && arg1[arg0 + var8][arg0 + var9]) {
                    this.field6483.method893((int) (this.field6487.method3856((byte) -103) * 255.0F) << 24, 123);
                    this.field6483.method858(null, this.field6490, (byte) 80, this.field6499, null);
                    this.field6483.method819(this.field6481, arg2 + 19827, 0, 4, this.field6495);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(Ler;Ltv;Lcp;[I)V", line = 362)
    public class427(class92 arg0, class521 arg1, class674 arg2, int[] arg3) {
        this.field6487 = arg2;
        this.field6498 = arg1;
        this.field6483 = arg0;
        int var5 = this.field6487.method3860((byte) -128) - (arg1.field516 >> 1);
        this.field6486 = this.field6487.method3857((byte) -35) - var5 >> arg1.field515;
        this.field6494 = var5 + this.field6487.method3857((byte) -35) >> arg1.field515;
        this.field6500 = this.field6487.method3859((byte) 117) - var5 >> arg1.field515;
        this.field6489 = var5 + this.field6487.method3859((byte) 117) >> arg1.field515;
        int var6 = this.field6494 + 1 - this.field6486;
        int var7 = this.field6489 + 1 - this.field6500;
        this.field6484 = new float[var6 + 1][var7 + 1];
        this.field6496 = new float[var6 + 1][var7 + 1];
        this.field6501 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var25 = var8 + this.field6500;
            if (var25 > 0 && var25 < (this.field6498.field513 - 1)) {
                for (int var26 = 0; var26 <= var6; var26++) {
                    int var27 = var26 + this.field6486;
                    if (var27 > 0 && (this.field6498.field510 - 1) > var27) {
                        int var28 = arg1.method479(var25, var27 + 1, 121) - arg1.method479(var25, var27 - 1, -113);
                        int var29 = arg1.method479(var25 + 1, var27, -95) - arg1.method479(var25 - 1, var27, -99);
                        float var30 = (float) (1.0D / Math.sqrt((double) (var29 * var29 + var28 * var28 + 65536)));
                        this.field6501[var26][var8] = (float) var28 * var30;
                        this.field6484[var26][var8] = var30 * -256.0F;
                        this.field6496[var26][var8] = (float) var29 * var30;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field6500; var10 <= this.field6489; var10++) {
            if (var10 >= 0 && var10 < arg1.field513) {
                for (int var21 = this.field6486; var21 <= this.field6494; var21++) {
                    if (var21 >= 0 && var21 < arg1.field510) {
                        int var22 = arg3[var9];
                        int[] var23 = arg1.field7539[var21][var10];
                        if (var23 != null && var22 != 0) {
                            if (var22 == 1) {
                                int var24 = 0;
                                while (var24 < var23.length) {
                                    if (var23[var24++] != -1 && var23[var24++] != -1 && var23[var24++] != -1) {
                                        this.field6481 += 3;
                                    }
                                }
                            } else {
                                this.field6481 += 3;
                            }
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field6494 - this.field6486;
            }
        }
        if (this.field6481 > 0) {
            this.field6497 = new class6(this.field6481 * 2);
            this.field6503 = new class148(this.field6481 * 16);
            this.field6485 = new class200(class413.method2636(this.field6481, 127));
            int var11 = 0;
            int var12 = 0;
            for (int var13 = this.field6500; var13 <= this.field6489; var13++) {
                if (var13 >= 0 && arg1.field513 > var13) {
                    int var14 = 0;
                    for (int var15 = this.field6486; var15 <= this.field6494; var15++) {
                        if (var15 >= 0 && arg1.field510 > var15) {
                            int var16 = arg3[var12];
                            int[] var17 = arg1.field7539[var15][var13];
                            if (var17 != null && var16 != 0) {
                                if (var16 == 1) {
                                    int[] var18 = arg1.field7554[var15][var13];
                                    int[] var19 = arg1.field7548[var15][var13];
                                    int var20 = 0;
                                    label112: while (true) {
                                        while (true) {
                                            if (var20 >= var17.length) {
                                                break label112;
                                            }
                                            if (var17[var20] == -1 || var17[var20 + 1] == -1 || var17[var20 + 2] == -1) {
                                                var20 += 3;
                                            } else {
                                                this.method2702(var15, var13, var19[var20], 1, var14, var11, var18[var20]);
                                                var20++;
                                                this.method2702(var15, var13, var19[var20], 1, var14, var11, var18[var20]);
                                                var20++;
                                                this.method2702(var15, var13, var19[var20], 1, var14, var11, var18[var20]);
                                                var20++;
                                            }
                                        }
                                    }
                                } else if (var16 == 3) {
                                    this.method2702(var15, var13, 0, 1, var14, var11, 0);
                                    this.method2702(var15, var13, 0, 1, var14, var11, arg1.field516);
                                    this.method2702(var15, var13, arg1.field516, 1, var14, var11, 0);
                                } else if (var16 == 2) {
                                    this.method2702(var15, var13, 0, 1, var14, var11, arg1.field516);
                                    this.method2702(var15, var13, arg1.field516, 1, var14, var11, arg1.field516);
                                    this.method2702(var15, var13, 0, 1, var14, var11, 0);
                                } else if (var16 == 5) {
                                    this.method2702(var15, var13, arg1.field516, 1, var14, var11, arg1.field516);
                                    this.method2702(var15, var13, arg1.field516, 1, var14, var11, 0);
                                    this.method2702(var15, var13, 0, 1, var14, var11, arg1.field516);
                                } else if (var16 == 4) {
                                    this.method2702(var15, var13, arg1.field516, 1, var14, var11, 0);
                                    this.method2702(var15, var13, 0, 1, var14, var11, 0);
                                    this.method2702(var15, var13, arg1.field516, 1, var14, var11, arg1.field516);
                                }
                            }
                        }
                        var12++;
                        var14++;
                    }
                } else {
                    var12 += this.field6494 - this.field6486;
                }
                var11++;
            }
            this.field6495 = this.field6483.method892(false, this.field6497.field57, 5123, false, this.field6497.field96);
            this.field6491 = this.field6483.method898(16, false, this.field6503.field57, 127, this.field6503.field96);
            this.field6499 = new class51(this.field6491, 5126, 3, 0);
            this.field6490 = new class51(this.field6491, 5121, 4, 12);
        } else {
            this.field6491 = null;
            this.field6499 = null;
            this.field6490 = null;
            this.field6495 = null;
        }
        this.field6497 = null;
        this.field6501 = this.field6484 = this.field6496 = null;
        this.field6485 = null;
        this.field6503 = null;
    }
}
