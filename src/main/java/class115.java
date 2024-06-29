import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class115 extends class390 {

    @OriginalMember(owner = "client!ik", name = "x", descriptor = "Lbh;")
    private class24 field1659;

    @OriginalMember(owner = "client!ik", name = "m", descriptor = "Ltb;")
    private class227 field1648;

    @OriginalMember(owner = "client!ik", name = "z", descriptor = "Lfq;")
    private class111 field1661;

    @OriginalMember(owner = "client!ik", name = "k", descriptor = "I")
    private int field1646;

    @OriginalMember(owner = "client!ik", name = "p", descriptor = "I")
    private int field1651;

    @OriginalMember(owner = "client!ik", name = "q", descriptor = "I")
    private int field1652;

    @OriginalMember(owner = "client!ik", name = "s", descriptor = "I")
    private int field1654;

    @OriginalMember(owner = "client!ik", name = "B", descriptor = "[[F")
    private float[][] field1663;

    @OriginalMember(owner = "client!ik", name = "w", descriptor = "[[F")
    private float[][] field1658;

    @OriginalMember(owner = "client!ik", name = "y", descriptor = "[[F")
    private float[][] field1660;

    @OriginalMember(owner = "client!ik", name = "t", descriptor = "Lkh;")
    private class11 field1655;

    @OriginalMember(owner = "client!ik", name = "j", descriptor = "Lto;")
    private class6 field1645;

    @OriginalMember(owner = "client!ik", name = "n", descriptor = "Lec;")
    private class129 field1649;

    @OriginalMember(owner = "client!ik", name = "o", descriptor = "Lok;")
    private class138 field1650;

    @OriginalMember(owner = "client!ik", name = "l", descriptor = "Lqb;")
    private class122 field1647;

    @OriginalMember(owner = "client!ik", name = "u", descriptor = "Lq;")
    private class246 field1656;

    @OriginalMember(owner = "client!ik", name = "r", descriptor = "Lq;")
    private class246 field1653;

    @OriginalMember(owner = "client!ik", name = "v", descriptor = "I")
    private int field1657;

    @OriginalMember(owner = "client!ik", name = "A", descriptor = "I")
    private int field1662;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIII[[Z)V", line = 5)
    public final void method801(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4) {
        if (this.field1650 == null || (arg2 + arg3) < this.field1646 || arg2 - arg3 > this.field1651 || this.field1652 > arg1 + arg3 || (arg1 - arg3) > this.field1654) {
            return;
        }
        if (arg0 < 53) {
            this.field1661 = (class111) null;
        }
        for (int var6 = this.field1652; var6 <= this.field1654; var6++) {
            for (int var7 = this.field1646; var7 <= this.field1651; var7++) {
                int var8 = var7 - arg2;
                int var9 = var6 - arg1;
                if ((-arg3) < var8 && var8 < arg3 && -arg3 < var9 && var9 < arg3 && arg4[var8 + arg3][arg3 + var9]) {
                    this.field1648.method1549((int) (this.field1659.field412 * 255.0F) << 24);
                    this.field1648.method1513(this.field1656, (class246) null, this.field1653, (class246) null);
                    this.field1648.method1567(this.field1650, 4, 0, this.field1662);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IS)V", line = 66)
    private final void method802(int arg0, short arg1) {
        if (arg0 != 16733746) {
            return;
        }
        if (this.field1648.field3229) {
            this.field1655.method191(arg1, -124);
        } else {
            this.field1655.method210(arg1, 13579);
        }
        this.field1662++;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIIIII)V", line = 83)
    private final void method803(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        long var8 = -1L;
        int var10 = (arg3 << this.field1661.field1603) + arg5;
        int var11 = (arg4 << this.field1661.field1603) + arg0;
        int var12 = this.field1661.method725(var10, var11);
        if (~(arg5 & 0x7F) == arg6 || (arg0 & 0x7F) == 0) {
            var8 = (long) var10 & 0xFFFFL | (long) var11 & 0xFFFFL << 16;
            class390 var13 = this.field1649.method886(var8, 25651);
            if (var13 != null) {
                this.method802(arg6 + 16733747, ((class352) var13).field4816);
                return;
            }
        }
        short var14 = (short) (this.field1657++);
        if (var8 != -1L) {
            this.field1649.method883((byte) -54, var8, new class352(var14));
        }
        float var15;
        float var16;
        float var17;
        if (arg5 == 0 && arg0 == 0) {
            var15 = this.field1658[arg1][arg2];
            var16 = this.field1660[arg1][arg2];
            var17 = this.field1663[arg1][arg2];
        } else if (this.field1661.field1596 == arg5 && arg0 == 0) {
            var17 = this.field1663[arg1 + 1][arg2];
            var16 = this.field1660[arg1 + 1][arg2];
            var15 = this.field1658[arg1 + 1][arg2];
        } else if (this.field1661.field1596 == arg5 && this.field1661.field1596 == arg0) {
            var15 = this.field1658[arg1 + 1][arg2 + 1];
            var16 = this.field1660[arg1 + 1][arg2 + 1];
            var17 = this.field1663[arg1 + 1][arg2 + 1];
        } else if (arg5 == 0 && this.field1661.field1596 == arg0) {
            var16 = this.field1660[arg1][arg2 + 1];
            var17 = this.field1663[arg1][arg2 + 1];
            var15 = this.field1658[arg1][arg2 + 1];
        } else {
            float var18 = (float) arg5 / (float) this.field1661.field1596;
            float var19 = (float) arg0 / (float) this.field1661.field1596;
            float var20 = this.field1660[arg1][arg2];
            float var21 = this.field1658[arg1][arg2];
            float var22 = this.field1663[arg1][arg2];
            float var23 = this.field1660[arg1 + 1][arg2];
            float var24 = this.field1658[arg1 + 1][arg2];
            float var25 = (this.field1660[arg1 + 1][arg2 + 1] - var23) * var18 + var23;
            float var26 = this.field1663[arg1 + 1][arg2];
            float var27 = (this.field1660[arg1][arg2 + 1] - var20) * var18 + var20;
            float var28 = (this.field1663[arg1][arg2 + 1] - var22) * var18 + var22;
            float var29 = (this.field1658[arg1 + 1][arg2 + 1] - var24) * var18 + var24;
            float var30 = (this.field1658[arg1][arg2 + 1] - var21) * var18 + var21;
            float var31 = (this.field1663[arg1 + 1][arg2 + 1] - var26) * var18 + var26;
            var16 = (var25 - var27) * var19 + var27;
            var15 = (var29 - var30) * var19 + var30;
            var17 = (var31 - var28) * var19 + var28;
        }
        float var32 = (float) (this.field1659.field407 - var10);
        float var33 = (float) (this.field1659.field409 - var12);
        float var34 = (float) (this.field1659.field408 - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var32 * var36;
        float var38 = var33 * var36;
        float var39 = var34 * var36;
        float var40 = var35 / (float) this.field1659.field411;
        float var41 = 1.0F - (var40 * var40);
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
        int var44 = this.field1659.field413;
        int var45 = (int) ((float) ((var44 & 0xFF5632) >> 16) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) ((var44 & 0xFF76) >> 8) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (var47 > 255) {
            var47 = 255;
        }
        if (this.field1648.field3229) {
            this.field1645.method36(true, (float) var10);
            this.field1645.method36(true, (float) var12);
            this.field1645.method36(true, (float) var11);
        } else {
            this.field1645.method37(-1923362568, (float) var10);
            this.field1645.method37(-1923362568, (float) var12);
            this.field1645.method37(-1923362568, (float) var11);
        }
        this.field1645.method173(var45, 255);
        this.field1645.method173(var46, 255);
        this.field1645.method173(var47, arg6 ^ 0xFFFFFF00);
        this.field1645.method173(255, 255);
        this.method802(16733746, var14);
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Ltb;Lfq;Lbh;[I)V", line = 254)
    public class115(class227 arg0, class111 arg1, class24 arg2, int[] arg3) {
        this.field1659 = arg2;
        this.field1648 = arg0;
        this.field1661 = arg1;
        int var5 = this.field1659.field411 - (arg1.field1596 >> 1);
        this.field1646 = this.field1659.field407 - var5 >> arg1.field1603;
        this.field1651 = this.field1659.field407 + var5 >> arg1.field1603;
        this.field1652 = this.field1659.field408 - var5 >> arg1.field1603;
        this.field1654 = this.field1659.field408 + var5 >> arg1.field1603;
        int var6 = this.field1651 + 1 - this.field1646;
        int var7 = this.field1654 + 1 - this.field1652;
        this.field1663 = new float[var6 + 1][var7 + 1];
        this.field1658 = new float[var6 + 1][var7 + 1];
        this.field1660 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var9 = this.field1652 + var8;
            if (var9 > 0 && var9 < this.field1661.field3433 - 1) {
                for (int var10 = 0; var10 <= var6; var10++) {
                    int var11 = this.field1646 + var10;
                    if (var11 > 0 && (this.field1661.field3434 - 1) > var11) {
                        int var12 = arg1.method737(var11 + 1, var9) - arg1.method737(var11 - 1, var9);
                        int var13 = arg1.method737(var11, var9 + 1) - arg1.method737(var11, var9 - 1);
                        float var14 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + (var13 * var13) + 65536)));
                        this.field1660[var10][var8] = (float) var12 * var14;
                        this.field1658[var10][var8] = var14 * -256.0F;
                        this.field1663[var10][var8] = (float) var13 * var14;
                    }
                }
            }
        }
        int var15 = 0;
        int var16 = 0;
        for (int var17 = this.field1652; var17 <= this.field1654; var17++) {
            if (var17 >= 0 && arg1.field3433 > var17) {
                for (int var18 = this.field1646; var18 <= this.field1651; var18++) {
                    if (var18 >= 0 && var18 < arg1.field3434) {
                        int var19 = arg3[var16];
                        int[] var20 = arg1.field1594[var18][var17];
                        if (var20 != null && var19 != 0) {
                            if (var19 == 1) {
                                var15 += var20.length;
                            } else {
                                var15 += 3;
                            }
                        }
                    }
                    var16++;
                }
            } else {
                var16 += this.field1651 - this.field1646;
            }
        }
        if (var15 > 0) {
            this.field1655 = new class11(var15 * 2);
            this.field1645 = new class6(var15 * 16);
            this.field1649 = new class129(class438.method2748((byte) 119, var15));
            int var21 = 0;
            int var22 = 0;
            for (int var23 = this.field1652; var23 <= this.field1654; var23++) {
                if (var23 >= 0 && var23 < arg1.field3433) {
                    int var24 = 0;
                    for (int var25 = this.field1646; var25 <= this.field1651; var25++) {
                        if (var25 >= 0 && arg1.field3434 > var25) {
                            int var26 = arg3[var21];
                            int[] var27 = arg1.field1594[var25][var23];
                            int[] var28 = arg1.field1591[var25][var23];
                            if (var27 != null && var26 != 0) {
                                if (var26 == 1) {
                                    for (int var29 = 0; var29 < var27.length; var29++) {
                                        this.method803(var28[var29], var24, var22, var25, var23, var27[var29], -1);
                                    }
                                } else if (var26 == 3) {
                                    this.method803(0, var24, var22, var25, var23, 0, -1);
                                    this.method803(0, var24, var22, var25, var23, arg1.field1596, -1);
                                    this.method803(arg1.field1596, var24, var22, var25, var23, 0, -1);
                                } else if (var26 == 2) {
                                    this.method803(0, var24, var22, var25, var23, arg1.field1596, -1);
                                    this.method803(arg1.field1596, var24, var22, var25, var23, arg1.field1596, -1);
                                    this.method803(0, var24, var22, var25, var23, 0, -1);
                                } else if (var26 == 5) {
                                    this.method803(arg1.field1596, var24, var22, var25, var23, arg1.field1596, -1);
                                    this.method803(arg1.field1596, var24, var22, var25, var23, 0, -1);
                                    this.method803(0, var24, var22, var25, var23, arg1.field1596, -1);
                                } else if (var26 == 4) {
                                    this.method803(arg1.field1596, var24, var22, var25, var23, 0, -1);
                                    this.method803(0, var24, var22, var25, var23, 0, -1);
                                    this.method803(arg1.field1596, var24, var22, var25, var23, arg1.field1596, -1);
                                }
                            }
                        }
                        var21++;
                        var24++;
                    }
                } else {
                    var21 += this.field1651 - this.field1646;
                }
                var22++;
            }
            this.field1650 = this.field1648.method1535(5123, this.field1655.field230, this.field1655.field191, false);
            this.field1647 = this.field1648.method1554(16, this.field1645.field230, this.field1645.field191, false);
            this.field1656 = new class246(this.field1648, this.field1647, 5126, 3, 0);
            this.field1653 = new class246(this.field1648, this.field1647, 5121, 4, 12);
        } else {
            this.field1653 = null;
            this.field1647 = null;
            this.field1656 = null;
            this.field1650 = null;
        }
        this.field1660 = this.field1658 = this.field1663 = (float[][]) null;
        this.field1645 = null;
        this.field1655 = null;
        this.field1649 = null;
    }
}
