import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class265 extends class467 {

    @OriginalMember(owner = "client!om", name = "y", descriptor = "Ldd;")
    private class471 field3690;

    @OriginalMember(owner = "client!om", name = "w", descriptor = "Lbv;")
    private class282 field3688;

    @OriginalMember(owner = "client!om", name = "K", descriptor = "Llh;")
    private class257 field3702;

    @OriginalMember(owner = "client!om", name = "F", descriptor = "I")
    private int field3697;

    @OriginalMember(owner = "client!om", name = "G", descriptor = "I")
    private int field3698;

    @OriginalMember(owner = "client!om", name = "M", descriptor = "I")
    private int field3704;

    @OriginalMember(owner = "client!om", name = "z", descriptor = "I")
    private int field3691;

    @OriginalMember(owner = "client!om", name = "p", descriptor = "[[F")
    private float[][] field3681;

    @OriginalMember(owner = "client!om", name = "t", descriptor = "[[F")
    private float[][] field3685;

    @OriginalMember(owner = "client!om", name = "H", descriptor = "[[F")
    private float[][] field3699;

    @OriginalMember(owner = "client!om", name = "C", descriptor = "Ltl;")
    private class91 field3694;

    @OriginalMember(owner = "client!om", name = "A", descriptor = "Lrp;")
    private class455 field3692;

    @OriginalMember(owner = "client!om", name = "o", descriptor = "Lqo;")
    private class141 field3680;

    @OriginalMember(owner = "client!om", name = "r", descriptor = "Ltu;")
    private class176 field3683;

    @OriginalMember(owner = "client!om", name = "u", descriptor = "Lgf;")
    private class46 field3686;

    @OriginalMember(owner = "client!om", name = "E", descriptor = "Lit;")
    private class509 field3696;

    @OriginalMember(owner = "client!om", name = "B", descriptor = "Lit;")
    private class509 field3693;

    @OriginalMember(owner = "client!om", name = "n", descriptor = "Lsi;")
    public static class512 field3679 = new class512(3, 5);

    @OriginalMember(owner = "client!om", name = "L", descriptor = "Lsi;")
    public static class512 field3703 = new class512(14, -1);

    @OriginalMember(owner = "client!om", name = "q", descriptor = "I")
    private int field3682;

    @OriginalMember(owner = "client!om", name = "s", descriptor = "I")
    public static int field3684;

    @OriginalMember(owner = "client!om", name = "v", descriptor = "I")
    public static int field3687;

    @OriginalMember(owner = "client!om", name = "x", descriptor = "I")
    public static int field3689;

    @OriginalMember(owner = "client!om", name = "D", descriptor = "I")
    public static int field3695;

    @OriginalMember(owner = "client!om", name = "J", descriptor = "I")
    public static int field3701;

    @OriginalMember(owner = "client!om", name = "O", descriptor = "I")
    private int field3706;

    @OriginalMember(owner = "client!om", name = "N", descriptor = "Lns;")
    public static class438 field3705;

    @OriginalMember(owner = "client!om", name = "I", descriptor = "Z")
    public static boolean field3700;

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(B)V", line = 13)
    public static void method1699(byte arg0) {
        field3679 = null;
        field3705 = null;
        if (arg0 != 40) {
            method1703(null, -80, -22, -47, null);
        }
        field3703 = null;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IIIIIII)V", line = 40)
    private final void method1700(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3695++;
        long var8 = -1L;
        int var10 = (arg5 << this.field3702.field2916) + arg3;
        int var11 = arg2 + (arg6 << this.field3702.field2916);
        int var12 = this.field3702.method853(var10, var11);
        if ((arg3 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
            var8 = ((long) var11 & 0xFFFFL) << 16 | (long) var10 & 0xFFFFL;
            class467 var13 = this.field3680.method943(var8, -1);
            if (var13 != null) {
                this.method1702(((class198) var13).field2795, arg4 - 31854);
                return;
            }
        }
        short var14 = (short) (this.field3706++);
        if (var8 != -1L) {
            this.field3680.method940(var8, -110, new class198(var14));
        }
        float var15;
        float var16;
        float var17;
        if (arg3 == 0 && arg2 == 0) {
            var15 = this.field3685[arg0][arg1];
            var16 = this.field3681[arg0][arg1];
            var17 = this.field3699[arg0][arg1];
        } else if (this.field3702.field2915 == arg3 && arg2 == 0) {
            var17 = this.field3699[arg0 + 1][arg1];
            var15 = this.field3685[arg0 + 1][arg1];
            var16 = this.field3681[arg0 + 1][arg1];
        } else if (this.field3702.field2915 == arg3 && this.field3702.field2915 == arg2) {
            var16 = this.field3681[arg0 + 1][arg1 + 1];
            var17 = this.field3699[arg0 + 1][arg1 + 1];
            var15 = this.field3685[arg0 + 1][arg1 + 1];
        } else if (arg3 == 0 && this.field3702.field2915 == arg2) {
            var15 = this.field3685[arg0][arg1 + 1];
            var17 = this.field3699[arg0][arg1 + 1];
            var16 = this.field3681[arg0][arg1 + 1];
        } else {
            float var18 = (float) arg3 / (float) this.field3702.field2915;
            float var19 = (float) arg2 / (float) this.field3702.field2915;
            float var20 = this.field3699[arg0][arg1];
            float var21 = this.field3681[arg0][arg1];
            float var22 = this.field3685[arg0][arg1];
            float var23 = this.field3699[arg0 + 1][arg1];
            float var24 = this.field3681[arg0 + 1][arg1];
            float var25 = (this.field3685[arg0][arg1 + 1] - var22) * var18 + var22;
            float var26 = (this.field3681[arg0][arg1 + 1] - var21) * var18 + var21;
            float var27 = (this.field3699[arg0][arg1 + 1] - var20) * var18 + var20;
            float var28 = this.field3685[arg0 + 1][arg1];
            float var29 = (this.field3699[arg0 + 1][arg1 + 1] - var23) * var18 + var23;
            float var30 = (this.field3681[arg0 + 1][arg1 + 1] - var24) * var18 + var24;
            var17 = (var29 - var27) * var19 + var27;
            var16 = (var30 - var26) * var19 + var26;
            float var31 = (this.field3685[arg0 + 1][arg1 + 1] - var28) * var18 + var28;
            var15 = (var31 - var25) * var19 + var25;
        }
        float var32 = (float) (this.field3690.method2827(arg4 + 22832) - var10);
        float var33 = (float) (this.field3690.method2825(arg4 - 210) - var12);
        float var34 = (float) (this.field3690.method2832(arg4 ^ 0xF0) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var34 * var36;
        float var38 = var33 * var36;
        float var39 = var32 * var36;
        float var40 = var35 / (float) this.field3690.method2830(127);
        float var41 = 1.0F - var40 * var40;
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var15 * var37 + var16 * var38 + var17 * var39;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field3690.method2833(false);
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
        if (this.field3688.field4197) {
            this.field3692.method2741(108, (float) var10);
            this.field3692.method2741(124, (float) var12);
            this.field3692.method2741(126, (float) var11);
        } else {
            this.field3692.method2737(-101, (float) var10);
            this.field3692.method2737(-124, (float) var12);
            this.field3692.method2737(arg4 ^ 0xFFFFFF51, (float) var11);
        }
        this.field3692.method625(var45, false);
        this.field3692.method625(var46, false);
        this.field3692.method625(var47, false);
        this.field3692.method625(arg4, false);
        this.method1702(var14, -31599);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IIII[[Z)V", line = 206)
    public final void method1701(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4) {
        field3701++;
        if (this.field3683 == null || (arg0 + arg2) < this.field3697 || this.field3698 < (arg0 - arg2) || arg2 + arg3 < this.field3704 || (arg3 - arg2) > this.field3691) {
            return;
        }
        int var6 = 68 / ((-arg1 - 12) / 38);
        for (int var7 = this.field3704; var7 <= this.field3691; var7++) {
            for (int var8 = this.field3697; var8 <= this.field3698; var8++) {
                int var9 = var8 - arg0;
                int var10 = var7 - arg3;
                if (-arg2 < var9 && arg2 > var9 && var10 > (-arg2) && arg2 > var10 && arg4[arg2 + var9][arg2 + var10]) {
                    this.field3688.method1792((int) (this.field3690.method2826(-1) * 255.0F) << 24, 6865);
                    this.field3688.method1790(null, (byte) 43, this.field3696, null, this.field3693);
                    this.field3688.method1829(1, 0, this.field3682, this.field3683, 4);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(SI)V", line = 267)
    private final void method1702(short arg0, int arg1) {
        field3684++;
        if (this.field3688.field4197) {
            this.field3694.method600(arg0, -12891);
        } else {
            this.field3694.method628(-116, arg0);
        }
        if (arg1 != -31599) {
            method1703(null, 8, 82, -103, null);
        }
        this.field3682++;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "([JIII[Ljava/lang/Object;)V", line = 283)
    public static final void method1703(long[] arg0, int arg1, int arg2, int arg3, Object[] arg4) {
        if (arg2 != 5121) {
            method1699((byte) 4);
        }
        field3687++;
        if (arg1 <= arg3) {
            return;
        }
        int var5 = (arg3 + arg1) / 2;
        int var6 = arg3;
        long var7 = arg0[var5];
        arg0[var5] = arg0[arg1];
        arg0[arg1] = var7;
        Object var9 = arg4[var5];
        arg4[var5] = arg4[arg1];
        arg4[arg1] = var9;
        int var10 = ~var7 == Long.MIN_VALUE ? 0 : 1;
        for (int var11 = arg3; var11 < arg1; var11++) {
            if (arg0[var11] < (long) (var11 & var10) + var7) {
                long var12 = arg0[var11];
                arg0[var11] = arg0[var6];
                arg0[var6] = var12;
                Object var14 = arg4[var11];
                arg4[var11] = arg4[var6];
                arg4[var6++] = var14;
            }
        }
        arg0[arg1] = arg0[var6];
        arg0[var6] = var7;
        arg4[arg1] = arg4[var6];
        arg4[var6] = var9;
        method1703(arg0, var6 - 1, 5121, arg3, arg4);
        method1703(arg0, arg1, 5121, var6 + 1, arg4);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Lud;B)Z", line = 340)
    public static final boolean method1704(class63 arg0, byte arg1) {
        field3689++;
        if (arg1 != 35) {
            method1704(null, (byte) 33);
        }
        return class26.field424 == arg0 || class372.field5712 == arg0 || class217.field3010 == arg0 || class493.field7194 == arg0;
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Lbv;Llh;Ldd;[I)V", line = 358)
    public class265(class282 arg0, class257 arg1, class471 arg2, int[] arg3) {
        this.field3690 = arg2;
        this.field3688 = arg0;
        this.field3702 = arg1;
        int var5 = this.field3690.method2830(124) - (arg1.field2915 >> 1);
        this.field3697 = this.field3690.method2827(23087) - var5 >> arg1.field2916;
        this.field3698 = this.field3690.method2827(23087) + var5 >> arg1.field2916;
        this.field3704 = this.field3690.method2832(15) - var5 >> arg1.field2916;
        this.field3691 = var5 + this.field3690.method2832(15) >> arg1.field2916;
        int var6 = this.field3698 - (this.field3697 - 1);
        int var7 = this.field3691 + 1 - this.field3704;
        this.field3681 = new float[var6 + 1][var7 + 1];
        this.field3685 = new float[var6 + 1][var7 + 1];
        this.field3699 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var24 = var8 + this.field3704;
            if (var24 > 0 && var24 < this.field3702.field2914 - 1) {
                for (int var25 = 0; var25 <= var6; var25++) {
                    int var26 = this.field3697 + var25;
                    if (var26 > 0 && this.field3702.field2912 - 1 > var26) {
                        int var27 = arg1.method849(var26 + 1, var24) - arg1.method849(var26 - 1, var24);
                        int var28 = arg1.method849(var26, var24 + 1) - arg1.method849(var26, var24 - 1);
                        float var29 = (float) (1.0D / Math.sqrt((double) (var27 * var27 + var28 * var28 + 65536)));
                        this.field3699[var25][var8] = (float) var27 * var29;
                        this.field3681[var25][var8] = var29 * -256.0F;
                        this.field3685[var25][var8] = (float) var28 * var29;
                    }
                }
            }
        }
        int var9 = 0;
        int var10 = 0;
        for (int var11 = this.field3704; var11 <= this.field3691; var11++) {
            if (var11 >= 0 && arg1.field2914 > var11) {
                for (int var21 = this.field3697; var21 <= this.field3698; var21++) {
                    if (var21 >= 0 && arg1.field2912 > var21) {
                        int var22 = arg3[var10];
                        int[] var23 = arg1.field3562[var21][var11];
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
                var10 += this.field3698 - this.field3697;
            }
        }
        if (var9 > 0) {
            this.field3694 = new class91(var9 * 2);
            this.field3692 = new class455(var9 * 16);
            this.field3680 = new class141(class353.method2231(var9, (byte) -84));
            int var12 = 0;
            int var13 = 0;
            for (int var14 = this.field3704; var14 <= this.field3691; var14++) {
                if (var14 >= 0 && var14 < arg1.field2914) {
                    int var15 = 0;
                    for (int var16 = this.field3697; var16 <= this.field3698; var16++) {
                        if (var16 >= 0 && arg1.field2912 > var16) {
                            int var17 = arg3[var13];
                            int[] var18 = arg1.field3562[var16][var14];
                            int[] var19 = arg1.field3558[var16][var14];
                            if (var18 != null && var17 != 0) {
                                if (var17 == 1) {
                                    for (int var20 = 0; var20 < var18.length; var20++) {
                                        this.method1700(var15, var12, var19[var20], var18[var20], 255, var16, var14);
                                    }
                                } else if (var17 == 3) {
                                    this.method1700(var15, var12, 0, 0, 255, var16, var14);
                                    this.method1700(var15, var12, 0, arg1.field2915, 255, var16, var14);
                                    this.method1700(var15, var12, arg1.field2915, 0, 255, var16, var14);
                                } else if (var17 == 2) {
                                    this.method1700(var15, var12, 0, arg1.field2915, 255, var16, var14);
                                    this.method1700(var15, var12, arg1.field2915, arg1.field2915, 255, var16, var14);
                                    this.method1700(var15, var12, 0, 0, 255, var16, var14);
                                } else if (var17 == 5) {
                                    this.method1700(var15, var12, arg1.field2915, arg1.field2915, 255, var16, var14);
                                    this.method1700(var15, var12, arg1.field2915, 0, 255, var16, var14);
                                    this.method1700(var15, var12, 0, arg1.field2915, 255, var16, var14);
                                } else if (var17 == 4) {
                                    this.method1700(var15, var12, arg1.field2915, 0, 255, var16, var14);
                                    this.method1700(var15, var12, 0, 0, 255, var16, var14);
                                    this.method1700(var15, var12, arg1.field2915, arg1.field2915, 255, var16, var14);
                                }
                            }
                        }
                        var13++;
                        var15++;
                    }
                } else {
                    var13 += this.field3698 - this.field3697;
                }
                var12++;
            }
            this.field3683 = this.field3688.method1816(-29, this.field3694.field1277, false, this.field3694.field1292, 5123);
            this.field3686 = this.field3688.method1812(16, this.field3692.field1277, this.field3692.field1292, -26, false);
            this.field3696 = new class509(this.field3686, 5126, 3, 0);
            this.field3693 = new class509(this.field3686, 5121, 4, 12);
        } else {
            this.field3686 = null;
            this.field3693 = null;
            this.field3696 = null;
            this.field3683 = null;
        }
        this.field3699 = this.field3681 = this.field3685 = null;
        this.field3694 = null;
        this.field3692 = null;
        this.field3680 = null;
    }
}
