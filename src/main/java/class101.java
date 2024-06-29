import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qca")
public class class101 extends class425 {

    @OriginalMember(owner = "client!qca", name = "w", descriptor = "Lus;")
    private class1 field1785;

    @OriginalMember(owner = "client!qca", name = "s", descriptor = "Loj;")
    private class350 field1781;

    @OriginalMember(owner = "client!qca", name = "z", descriptor = "Lff;")
    private class9 field1788;

    @OriginalMember(owner = "client!qca", name = "u", descriptor = "I")
    private int field1783;

    @OriginalMember(owner = "client!qca", name = "x", descriptor = "I")
    private int field1786;

    @OriginalMember(owner = "client!qca", name = "A", descriptor = "I")
    private int field1789;

    @OriginalMember(owner = "client!qca", name = "v", descriptor = "I")
    private int field1784;

    @OriginalMember(owner = "client!qca", name = "l", descriptor = "[[F")
    private float[][] field1774;

    @OriginalMember(owner = "client!qca", name = "G", descriptor = "[[F")
    private float[][] field1794;

    @OriginalMember(owner = "client!qca", name = "D", descriptor = "[[F")
    private float[][] field1791;

    @OriginalMember(owner = "client!qca", name = "q", descriptor = "I")
    private int field1779;

    @OriginalMember(owner = "client!qca", name = "o", descriptor = "Lqh;")
    private class61 field1777;

    @OriginalMember(owner = "client!qca", name = "k", descriptor = "Lgt;")
    private class424 field1773;

    @OriginalMember(owner = "client!qca", name = "y", descriptor = "Lsl;")
    private class427 field1787;

    @OriginalMember(owner = "client!qca", name = "r", descriptor = "Lcv;")
    private class529 field1780;

    @OriginalMember(owner = "client!qca", name = "p", descriptor = "Lel;")
    private class510 field1778;

    @OriginalMember(owner = "client!qca", name = "E", descriptor = "Lrca;")
    private class423 field1792;

    @OriginalMember(owner = "client!qca", name = "B", descriptor = "Lrca;")
    private class423 field1790;

    @OriginalMember(owner = "client!qca", name = "t", descriptor = "Lfda;")
    public static class294 field1782 = new class294(1);

    @OriginalMember(owner = "client!qca", name = "j", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!qca", name = "m", descriptor = "I")
    public static int field1775;

    @OriginalMember(owner = "client!qca", name = "n", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!qca", name = "F", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!qca", name = "H", descriptor = "I")
    private int field1795;

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(BZZLlc;)V")
    public static final void method937(byte arg0, boolean arg1, boolean arg2, class601 arg3) {
        field1776++;
        int var4 = arg3.field8614;
        int var5 = (int) arg3.field6132;
        arg3.method2588(arg0 + 371);
        if (arg2) {
            class173.method1301(var4, 0);
        }
        if (arg0 != -71) {
            method937((byte) -116, true, true, null);
        }
        class1.method99(var4, 121);
        class545 var6 = class415.method2533((byte) -74, var5);
        if (var6 != null) {
            class531.method3088(var6, (byte) 98);
        }
        class646.method3687(true);
        if (!arg1 && class361.field5368 != -1) {
            class467.method2786(class361.field5368, arg0 ^ 0xFFFF7FB9, 1);
        }
        class182 var7 = new class182(class78.field1572);
        for (class601 var8 = (class601) var7.method1336(-1); var8 != null; var8 = (class601) var7.method1337(7698)) {
            if (!var8.method2589(300)) {
                var8 = (class601) var7.method1336(-1);
                if (var8 == null) {
                    return;
                }
            }
            if (var8.field8611 == 3) {
                int var9 = (int) var8.field6132;
                if ((var9 >>> 16) == var4) {
                    method937((byte) -71, arg1, true, var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "([[ZIIII)V")
    public final void method938(boolean[][] arg0, int arg1, int arg2, int arg3, int arg4) {
        field1775++;
        if (this.field1780 == null || arg4 != -2 || this.field1783 > arg1 + arg2 || this.field1786 < arg1 - arg2 || (arg2 + arg3) < this.field1789 || arg3 - arg2 > this.field1784) {
            return;
        }
        for (int var6 = this.field1789; var6 <= this.field1784; var6++) {
            for (int var7 = this.field1783; var7 <= this.field1786; var7++) {
                int var8 = var7 - arg1;
                int var9 = var6 - arg3;
                if (-arg2 < var8 && arg2 > var8 && var9 > -arg2 && var9 < arg2 && arg0[var8 + arg2][arg2 + var9]) {
                    this.field1785.method22((int) (this.field1788.method277(-1) * 255.0F) << 24, false);
                    this.field1785.method184(null, this.field1792, this.field1790, null, (byte) 85);
                    this.field1785.method9(this.field1780, 0, 4, (byte) 90, this.field1779);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(SZ)V")
    private final void method939(short arg0, boolean arg1) {
        if (arg1) {
            this.field1783 = -80;
        }
        field1793++;
        if (this.field1785.field267) {
            this.field1777.method745(arg0, 128);
        } else {
            this.field1777.method689(arg0, !arg1);
        }
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(IIIIIII)V")
    private final void method940(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1772++;
        long var8 = -1L;
        int var10 = arg1 + (arg2 << this.field1781.field1038);
        int var11 = (arg6 << this.field1781.field1038) + arg3;
        int var12 = this.field1781.method552(arg0 + 22649, var10, var11);
        if ((arg1 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
            var8 = ((long) var11 & 0xFFFFL) << 16 | (long) var10 & 0xFFFFL;
            class425 var13 = this.field1787.method2596(var8, 65);
            if (var13 != null) {
                this.method939(((class408) var13).field5906, false);
                return;
            }
        }
        short var14 = (short) (this.field1795++);
        if (var8 != -1L) {
            this.field1787.method2598(new class408(var14), var8, (byte) 8);
        }
        float var15;
        float var16;
        float var17;
        if (arg1 == 0 && arg3 == 0) {
            var15 = this.field1774[arg4][arg5];
            var16 = this.field1791[arg4][arg5];
            var17 = this.field1794[arg4][arg5];
        } else if (this.field1781.field1040 == arg1 && arg3 == 0) {
            var15 = this.field1774[arg4 + 1][arg5];
            var16 = this.field1791[arg4 + 1][arg5];
            var17 = this.field1794[arg4 + 1][arg5];
        } else if (this.field1781.field1040 == arg1 && this.field1781.field1040 == arg3) {
            var17 = this.field1794[arg4 + 1][arg5 + 1];
            var16 = this.field1791[arg4 + 1][arg5 + 1];
            var15 = this.field1774[arg4 + 1][arg5 + 1];
        } else if (arg1 == 0 && this.field1781.field1040 == arg3) {
            var17 = this.field1794[arg4][arg5 + 1];
            var15 = this.field1774[arg4][arg5 + 1];
            var16 = this.field1791[arg4][arg5 + 1];
        } else {
            float var18 = (float) arg1 / (float) this.field1781.field1040;
            float var19 = (float) arg3 / (float) this.field1781.field1040;
            float var20 = this.field1774[arg4][arg5];
            float var21 = this.field1791[arg4][arg5];
            float var22 = this.field1794[arg4][arg5];
            float var23 = this.field1774[arg4 + 1][arg5];
            float var24 = this.field1791[arg4 + 1][arg5];
            float var25 = this.field1794[arg4 + 1][arg5];
            float var26 = (this.field1774[arg4 + 1][arg5 + 1] - var23) * var18 + var23;
            float var27 = (this.field1791[arg4][arg5 + 1] - var21) * var18 + var21;
            float var28 = (this.field1791[arg4 + 1][arg5 + 1] - var24) * var18 + var24;
            float var29 = (this.field1774[arg4][arg5 + 1] - var20) * var18 + var20;
            float var30 = (this.field1794[arg4][arg5 + 1] - var22) * var18 + var22;
            var16 = (var28 - var27) * var19 + var27;
            var15 = (var26 - var29) * var19 + var29;
            float var31 = (this.field1794[arg4 + 1][arg5 + 1] - var25) * var18 + var25;
            var17 = (var31 - var30) * var19 + var30;
        }
        float var32 = (float) (this.field1788.method276(arg0 ^ 0x5877) - var10);
        float var33 = (float) (this.field1788.method273(false) - var12);
        float var34 = (float) (this.field1788.method270(-64) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        if (arg0 != -22648) {
            return;
        }
        float var36 = 1.0F / var35;
        float var37 = var32 * var36;
        float var38 = var33 * var36;
        float var39 = var34 * var36;
        float var40 = var35 / (float) this.field1788.method274((byte) 34);
        float var41 = 1.0F - (var40 * var40);
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var17 * var39 + var15 * var37 + var16 * var38;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field1788.method269(true);
        int var45 = (int) ((float) ((var44 & 0xFFA888) >> 16) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) ((var44 & 0xFFB9) >> 8) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (var47 > 255) {
            var47 = 255;
        }
        if (this.field1785.field267) {
            this.field1773.method2583((float) var10, -86);
            this.field1773.method2583((float) var12, -105);
            this.field1773.method2583((float) var11, -110);
        } else {
            this.field1773.method2584(0, (float) var10);
            this.field1773.method2584(0, (float) var12);
            this.field1773.method2584(0, (float) var11);
        }
        this.field1773.method693((byte) 106, var45);
        this.field1773.method693((byte) 106, var46);
        this.field1773.method693((byte) 106, var47);
        this.field1773.method693((byte) 106, 255);
        this.method939(var14, false);
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(I)V")
    public static void method941(int arg0) {
        field1782 = null;
        if (arg0 != -7909) {
            method937((byte) 21, true, false, null);
        }
    }

    @OriginalMember(owner = "client!qca", name = "<init>", descriptor = "(Lus;Loj;Lff;[I)V")
    public class101(class1 arg0, class350 arg1, class9 arg2, int[] arg3) {
        this.field1785 = arg0;
        this.field1781 = arg1;
        this.field1788 = arg2;
        int var5 = this.field1788.method274((byte) 34) - (arg1.field1040 >> 1);
        this.field1783 = this.field1788.method276(-1) - var5 >> arg1.field1038;
        this.field1786 = var5 + this.field1788.method276(-1) >> arg1.field1038;
        this.field1789 = this.field1788.method270(-60) - var5 >> arg1.field1038;
        this.field1784 = this.field1788.method270(-104) + var5 >> arg1.field1038;
        int var6 = this.field1786 + 1 - this.field1783;
        int var7 = this.field1784 - (this.field1789 - 1);
        this.field1774 = new float[var6 + 1][var7 + 1];
        this.field1794 = new float[var6 + 1][var7 + 1];
        this.field1791 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var25 = this.field1789 + var8;
            if (var25 > 0 && (this.field1781.field1043 - 1) > var25) {
                for (int var26 = 0; var26 <= var6; var26++) {
                    int var27 = var26 + this.field1783;
                    if (var27 > 0 && var27 < this.field1781.field1041 - 1) {
                        int var28 = arg1.method551(var27 + 1, var25, (byte) -110) - arg1.method551(var27 - 1, var25, (byte) -118);
                        int var29 = arg1.method551(var27, var25 + 1, (byte) -99) - arg1.method551(var27, var25 - 1, (byte) -118);
                        float var30 = (float) (1.0D / Math.sqrt((double) (var28 * var28 - (-var29 * var29 - 65536))));
                        this.field1774[var26][var8] = (float) var28 * var30;
                        this.field1791[var26][var8] = var30 * -256.0F;
                        this.field1794[var26][var8] = (float) var29 * var30;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field1789; var10 <= this.field1784; var10++) {
            if (var10 >= 0 && var10 < arg1.field1043) {
                for (int var21 = this.field1783; var21 <= this.field1786; var21++) {
                    if (var21 >= 0 && arg1.field1041 > var21) {
                        int var22 = arg3[var9];
                        int[] var23 = arg1.field5231[var21][var10];
                        if (var23 != null && var22 != 0) {
                            if (var22 == 1) {
                                int var24 = 0;
                                while (var23.length > var24) {
                                    if (var23[var24++] != -1 && var23[var24++] != -1 && var23[var24++] != -1) {
                                        this.field1779 += 3;
                                    }
                                }
                            } else {
                                this.field1779 += 3;
                            }
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field1786 - this.field1783;
            }
        }
        if (this.field1779 > 0) {
            this.field1777 = new class61(this.field1779 * 2);
            this.field1773 = new class424(this.field1779 * 16);
            this.field1787 = new class427(class455.method2740(-1675135295, this.field1779));
            int var11 = 0;
            int var12 = 0;
            for (int var13 = this.field1789; var13 <= this.field1784; var13++) {
                if (var13 >= 0 && arg1.field1043 > var13) {
                    int var14 = 0;
                    for (int var15 = this.field1783; var15 <= this.field1786; var15++) {
                        if (var15 >= 0 && var15 < arg1.field1041) {
                            int var16 = arg3[var11];
                            int[] var17 = arg1.field5231[var15][var13];
                            if (var17 != null && var16 != 0) {
                                if (var16 == 1) {
                                    int[] var18 = arg1.field5218[var15][var13];
                                    int[] var19 = arg1.field5229[var15][var13];
                                    int var20 = 0;
                                    label110: while (true) {
                                        while (true) {
                                            if (var17.length <= var20) {
                                                break label110;
                                            }
                                            if (var17[var20] == -1 || var17[var20 + 1] == -1 || var17[var20 + 2] == -1) {
                                                var20 += 3;
                                            } else {
                                                this.method940(-22648, var18[var20], var15, var19[var20], var14, var12, var13);
                                                var20++;
                                                this.method940(-22648, var18[var20], var15, var19[var20], var14, var12, var13);
                                                var20++;
                                                this.method940(-22648, var18[var20], var15, var19[var20], var14, var12, var13);
                                                var20++;
                                            }
                                        }
                                    }
                                } else if (var16 == 3) {
                                    this.method940(-22648, 0, var15, 0, var14, var12, var13);
                                    this.method940(-22648, arg1.field1040, var15, 0, var14, var12, var13);
                                    this.method940(-22648, 0, var15, arg1.field1040, var14, var12, var13);
                                } else if (var16 == 2) {
                                    this.method940(-22648, arg1.field1040, var15, 0, var14, var12, var13);
                                    this.method940(-22648, arg1.field1040, var15, arg1.field1040, var14, var12, var13);
                                    this.method940(-22648, 0, var15, 0, var14, var12, var13);
                                } else if (var16 == 5) {
                                    this.method940(-22648, arg1.field1040, var15, arg1.field1040, var14, var12, var13);
                                    this.method940(-22648, 0, var15, arg1.field1040, var14, var12, var13);
                                    this.method940(-22648, arg1.field1040, var15, 0, var14, var12, var13);
                                } else if (var16 == 4) {
                                    this.method940(-22648, 0, var15, arg1.field1040, var14, var12, var13);
                                    this.method940(-22648, 0, var15, 0, var14, var12, var13);
                                    this.method940(-22648, arg1.field1040, var15, arg1.field1040, var14, var12, var13);
                                }
                            }
                        }
                        var14++;
                        var11++;
                    }
                } else {
                    var11 += this.field1786 - this.field1783;
                }
                var12++;
            }
            this.field1780 = this.field1785.method150(false, 5123, this.field1777.field1397, 39, this.field1777.field1393);
            this.field1778 = this.field1785.method49(this.field1773.field1397, 16, this.field1773.field1393, false, 11645);
            this.field1792 = new class423(this.field1778, 5126, 3, 0);
            this.field1790 = new class423(this.field1778, 5121, 4, 12);
        } else {
            this.field1778 = null;
            this.field1780 = null;
            this.field1790 = null;
            this.field1792 = null;
        }
        this.field1773 = null;
        this.field1777 = null;
        this.field1787 = null;
        this.field1774 = this.field1791 = this.field1794 = null;
    }
}
