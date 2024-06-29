import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class41 extends class337 {

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "Lod;")
    private class349 field593;

    @OriginalMember(owner = "client!ha", name = "F", descriptor = "Lon;")
    private class220 field606;

    @OriginalMember(owner = "client!ha", name = "B", descriptor = "Lkt;")
    private class107 field602;

    @OriginalMember(owner = "client!ha", name = "C", descriptor = "I")
    private int field603;

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "I")
    private int field596;

    @OriginalMember(owner = "client!ha", name = "N", descriptor = "I")
    private int field613;

    @OriginalMember(owner = "client!ha", name = "z", descriptor = "I")
    private int field600;

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "[[F")
    private float[][] field591;

    @OriginalMember(owner = "client!ha", name = "D", descriptor = "[[F")
    private float[][] field604;

    @OriginalMember(owner = "client!ha", name = "x", descriptor = "[[F")
    private float[][] field598;

    @OriginalMember(owner = "client!ha", name = "I", descriptor = "Lnc;")
    private class21 field609;

    @OriginalMember(owner = "client!ha", name = "H", descriptor = "Lap;")
    private class332 field608;

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "Lbg;")
    private class323 field595;

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "Lbg;")
    private class323 field601;

    @OriginalMember(owner = "client!ha", name = "y", descriptor = "Ldh;")
    private class209 field599;

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "Lrk;")
    private class25 field590;

    @OriginalMember(owner = "client!ha", name = "w", descriptor = "Lwa;")
    private class433 field597;

    @OriginalMember(owner = "client!ha", name = "E", descriptor = "Lri;")
    public static class73 field605 = new class73(26, 0);

    @OriginalMember(owner = "client!ha", name = "M", descriptor = "Llt;")
    public static class475 field612 = new class475("red:", "rot:", "rouge:", "vermelho:");

    @OriginalMember(owner = "client!ha", name = "O", descriptor = "Llt;")
    public static class475 field614 = new class475("M", "M", "M", "M");

    @OriginalMember(owner = "client!ha", name = "P", descriptor = "Lri;")
    public static class73 field615 = new class73(48, 12);

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "I")
    private int field592;

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!ha", name = "G", descriptor = "I")
    private int field607;

    @OriginalMember(owner = "client!ha", name = "J", descriptor = "I")
    public static int field610;

    @OriginalMember(owner = "client!ha", name = "L", descriptor = "I")
    public static int field611;

    @OriginalMember(owner = "client!ha", name = "Q", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!ha", name = "R", descriptor = "[[I")
    public static int[][] field617;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V", line = 10)
    public static void method244(int arg0) {
        if (arg0 >= -44) {
            return;
        }
        field617 = null;
        field615 = null;
        field614 = null;
        field612 = null;
        field605 = null;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(III)Z", line = 26)
    public static final boolean method245(int arg0, int arg1, int arg2) {
        field594++;
        if (arg1 != 384) {
            method244(-35);
        }
        return (arg0 & 0x180) != 0;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIII)V", line = 44)
    private final void method246(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field611++;
        long var8 = -1L;
        int var10 = (arg1 << this.field606.field372) + arg6;
        int var11 = arg2 + (arg5 << this.field606.field372);
        int var12 = this.field606.method202(var10, var11);
        if ((arg6 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
            var8 = 0xFFFFL << 16 & (long) var11 << 16 | (long) var10 & 0xFFFFL;
            class337 var13 = this.field597.method2605(false, var8);
            if (var13 != null) {
                this.method247(((class139) var13).field2085, (byte) -70);
                return;
            }
        }
        short var14 = (short) (this.field592++);
        if (var8 != -1L) {
            this.field597.method2606(new class139(var14), var8, 0);
        }
        float var15;
        float var16;
        float var17;
        if (arg6 == 0 && arg2 == 0) {
            var15 = this.field591[arg4][arg3];
            var16 = this.field598[arg4][arg3];
            var17 = this.field604[arg4][arg3];
        } else if (this.field606.field365 == arg6 && arg2 == 0) {
            var16 = this.field598[arg4 + 1][arg3];
            var15 = this.field591[arg4 + 1][arg3];
            var17 = this.field604[arg4 + 1][arg3];
        } else if (this.field606.field365 == arg6 && this.field606.field365 == arg2) {
            var16 = this.field598[arg4 + 1][arg3 + 1];
            var15 = this.field591[arg4 + 1][arg3 + 1];
            var17 = this.field604[arg4 + 1][arg3 + 1];
        } else if (arg6 == 0 && this.field606.field365 == arg2) {
            var17 = this.field604[arg4][arg3 + 1];
            var16 = this.field598[arg4][arg3 + 1];
            var15 = this.field591[arg4][arg3 + 1];
        } else {
            float var18 = (float) arg6 / (float) this.field606.field365;
            float var19 = (float) arg2 / (float) this.field606.field365;
            float var20 = this.field598[arg4][arg3];
            float var21 = this.field591[arg4][arg3];
            float var22 = this.field604[arg4][arg3];
            float var23 = this.field598[arg4 + 1][arg3];
            float var24 = this.field591[arg4 + 1][arg3];
            float var25 = (this.field598[arg4 + 1][arg3 + 1] - var23) * var18 + var23;
            float var26 = (this.field604[arg4][arg3 + 1] - var22) * var18 + var22;
            float var27 = this.field604[arg4 + 1][arg3];
            float var28 = (this.field598[arg4][arg3 + 1] - var20) * var18 + var20;
            float var29 = (this.field591[arg4 + 1][arg3 + 1] - var24) * var18 + var24;
            float var30 = (this.field591[arg4][arg3 + 1] - var21) * var18 + var21;
            float var31 = (this.field604[arg4 + 1][arg3 + 1] - var27) * var18 + var27;
            var16 = (var25 - var28) * var19 + var28;
            var15 = (var29 - var30) * var19 + var30;
            var17 = (var31 - var26) * var19 + var26;
        }
        float var32 = (float) (this.field602.method654((byte) 31) - var10);
        float var33 = (float) (this.field602.method663(arg0 ^ arg0) - var12);
        float var34 = (float) (this.field602.method656(128) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var34 * var36;
        float var38 = var32 * var36;
        float var39 = var33 * var36;
        float var40 = var35 / (float) this.field602.method661((byte) -71);
        float var41 = 1.0F - (var40 * var40);
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var17 * var37 + var15 * var39 + var16 * var38;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field602.method660(arg0 ^ 0x6CB0A989);
        int var45 = (int) ((float) ((var44 & 0xFF9C15) >> 16) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) ((var44 & 0xFF09) >> 8) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (var47 > 255) {
            var47 = 255;
        }
        if (this.field593.field5313) {
            this.field590.method157((float) var10, 93);
            this.field590.method157((float) var12, 71);
            this.field590.method157((float) var11, arg0 ^ 0x934F268B);
        } else {
            this.field590.method159((float) var10, (byte) -37);
            this.field590.method159((float) var12, (byte) -37);
            this.field590.method159((float) var11, (byte) -37);
        }
        this.field590.method1410(var45, -27645);
        this.field590.method1410(var46, arg0 ^ 0x934F4D13);
        this.field590.method1410(var47, -27645);
        this.field590.method1410(255, -27645);
        this.method247(var14, (byte) -70);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(SB)V", line = 216)
    private final void method247(short arg0, byte arg1) {
        field610++;
        if (this.field593.field5313) {
            this.field599.method1413(-128, arg0);
        } else {
            this.field599.method1453((byte) -90, arg0);
        }
        if (arg1 != -70) {
            field616 = -7;
        }
        this.field607++;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I[[ZIBI)V", line = 238)
    public final void method248(int arg0, boolean[][] arg1, int arg2, byte arg3, int arg4) {
        field589++;
        if (this.field608 == null || (arg0 + arg4) < this.field603 || this.field596 < (arg0 - arg4) || arg3 >= -11 || this.field613 > arg2 + arg4 || this.field600 < arg2 - arg4) {
            return;
        }
        for (int var6 = this.field613; var6 <= this.field600; var6++) {
            for (int var7 = this.field603; var7 <= this.field596; var7++) {
                int var8 = var7 - arg0;
                int var9 = var6 - arg2;
                if (var8 > (-arg4) && var8 < arg4 && (-arg4) < var9 && var9 < arg4 && arg1[arg4 + var8][arg4 + var9]) {
                    this.field593.method2155((int) (this.field602.method658(0) * 255.0F) << 24, 59);
                    this.field593.method2173((byte) 123, null, this.field601, null, this.field595);
                    this.field593.method2136(this.field607, 4, 0, this.field608, (byte) 101);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Lod;Lon;Lkt;[I)V", line = 299)
    public class41(class349 arg0, class220 arg1, class107 arg2, int[] arg3) {
        this.field593 = arg0;
        this.field606 = arg1;
        this.field602 = arg2;
        int var5 = this.field602.method661((byte) -121) - (arg1.field365 >> 1);
        this.field603 = this.field602.method654((byte) 31) - var5 >> arg1.field372;
        this.field596 = var5 + this.field602.method654((byte) 31) >> arg1.field372;
        this.field613 = this.field602.method656(128) - var5 >> arg1.field372;
        this.field600 = var5 + this.field602.method656(128) >> arg1.field372;
        int var6 = this.field596 - (this.field603 - 1);
        int var7 = this.field600 + 1 - this.field613;
        this.field591 = new float[var6 + 1][var7 + 1];
        this.field604 = new float[var6 + 1][var7 + 1];
        this.field598 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var24 = this.field613 + var8;
            if (var24 > 0 && (this.field606.field369 - 1) > var24) {
                for (int var25 = 0; var25 <= var6; var25++) {
                    int var26 = this.field603 + var25;
                    if (var26 > 0 && this.field606.field370 - 1 > var26) {
                        int var27 = arg1.method201(var26 + 1, var24) - arg1.method201(var26 - 1, var24);
                        int var28 = arg1.method201(var26, var24 + 1) - arg1.method201(var26, var24 - 1);
                        float var29 = (float) (1.0D / Math.sqrt((double) (var27 * var27 + (var28 * var28) + 65536)));
                        this.field598[var25][var8] = (float) var27 * var29;
                        this.field591[var25][var8] = var29 * -256.0F;
                        this.field604[var25][var8] = (float) var28 * var29;
                    }
                }
            }
        }
        int var9 = 0;
        int var10 = 0;
        for (int var11 = this.field613; var11 <= this.field600; var11++) {
            if (var11 >= 0 && arg1.field369 > var11) {
                for (int var21 = this.field603; var21 <= this.field596; var21++) {
                    if (var21 >= 0 && var21 < arg1.field370) {
                        int var22 = arg3[var10];
                        int[] var23 = arg1.field3250[var21][var11];
                        if (var23 != null && var22 != 0) {
                            if (var22 == 1) {
                                var9 += var23.length;
                            } else {
                                var9 += 3;
                            }
                        }
                    }
                    var10++;
                }
            } else {
                var10 += this.field596 - this.field603;
            }
        }
        if (var9 <= 0) {
            this.field609 = null;
            this.field608 = null;
            this.field595 = null;
            this.field601 = null;
        } else {
            this.field599 = new class209(var9 * 2);
            this.field590 = new class25(var9 * 16);
            this.field597 = new class433(class476.method2841(var9, true));
            int var12 = 0;
            int var13 = 0;
            for (int var14 = this.field613; var14 <= this.field600; var14++) {
                if (var14 >= 0 && var14 < arg1.field369) {
                    int var15 = 0;
                    for (int var16 = this.field603; var16 <= this.field596; var16++) {
                        if (var16 >= 0 && var16 < arg1.field370) {
                            int var17 = arg3[var13];
                            int[] var18 = arg1.field3250[var16][var14];
                            int[] var19 = arg1.field3235[var16][var14];
                            if (var18 != null && var17 != 0) {
                                if (var17 == 1) {
                                    for (int var20 = 0; var20 < var18.length; var20++) {
                                        this.method246(1823529232, var16, var19[var20], var12, var15, var14, var18[var20]);
                                    }
                                } else if (var17 == 3) {
                                    this.method246(1823529232, var16, 0, var12, var15, var14, 0);
                                    this.method246(1823529232, var16, 0, var12, var15, var14, arg1.field365);
                                    this.method246(1823529232, var16, arg1.field365, var12, var15, var14, 0);
                                } else if (var17 == 2) {
                                    this.method246(1823529232, var16, 0, var12, var15, var14, arg1.field365);
                                    this.method246(1823529232, var16, arg1.field365, var12, var15, var14, arg1.field365);
                                    this.method246(1823529232, var16, 0, var12, var15, var14, 0);
                                } else if (var17 == 5) {
                                    this.method246(1823529232, var16, arg1.field365, var12, var15, var14, arg1.field365);
                                    this.method246(1823529232, var16, arg1.field365, var12, var15, var14, 0);
                                    this.method246(1823529232, var16, 0, var12, var15, var14, arg1.field365);
                                } else if (var17 == 4) {
                                    this.method246(1823529232, var16, arg1.field365, var12, var15, var14, 0);
                                    this.method246(1823529232, var16, 0, var12, var15, var14, 0);
                                    this.method246(1823529232, var16, arg1.field365, var12, var15, var14, arg1.field365);
                                }
                            }
                        }
                        var13++;
                        var15++;
                    }
                } else {
                    var13 += this.field596 - this.field603;
                }
                var12++;
            }
            this.field608 = this.field593.method2127(this.field599.field3037, 5123, false, this.field599.field3036, 87360);
            this.field609 = this.field593.method2166((byte) -23, 16, this.field590.field3037, false, this.field590.field3036);
            this.field595 = new class323(this.field609, 5126, 3, 0);
            this.field601 = new class323(this.field609, 5121, 4, 12);
        }
        this.field598 = this.field591 = this.field604 = null;
        this.field590 = null;
        this.field597 = null;
        this.field599 = null;
    }
}
