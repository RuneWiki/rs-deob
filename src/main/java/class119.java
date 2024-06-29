import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class119 extends class381 {

    @OriginalMember(owner = "client!eh", name = "u", descriptor = "Lag;")
    private class302 field1664;

    @OriginalMember(owner = "client!eh", name = "q", descriptor = "Lj;")
    private class269 field1660;

    @OriginalMember(owner = "client!eh", name = "A", descriptor = "Lhd;")
    private class17 field1670;

    @OriginalMember(owner = "client!eh", name = "l", descriptor = "I")
    private int field1655;

    @OriginalMember(owner = "client!eh", name = "x", descriptor = "I")
    private int field1667;

    @OriginalMember(owner = "client!eh", name = "v", descriptor = "I")
    private int field1665;

    @OriginalMember(owner = "client!eh", name = "n", descriptor = "I")
    private int field1657;

    @OriginalMember(owner = "client!eh", name = "p", descriptor = "[[F")
    private float[][] field1659;

    @OriginalMember(owner = "client!eh", name = "y", descriptor = "[[F")
    private float[][] field1668;

    @OriginalMember(owner = "client!eh", name = "o", descriptor = "[[F")
    private float[][] field1658;

    @OriginalMember(owner = "client!eh", name = "z", descriptor = "Lap;")
    private class289 field1669;

    @OriginalMember(owner = "client!eh", name = "t", descriptor = "Lfb;")
    private class45 field1663;

    @OriginalMember(owner = "client!eh", name = "r", descriptor = "Laj;")
    private class71 field1661;

    @OriginalMember(owner = "client!eh", name = "D", descriptor = "Lui;")
    private class366 field1673;

    @OriginalMember(owner = "client!eh", name = "s", descriptor = "Lhk;")
    private class203 field1662;

    @OriginalMember(owner = "client!eh", name = "w", descriptor = "Lrs;")
    private class240 field1666;

    @OriginalMember(owner = "client!eh", name = "B", descriptor = "Lrs;")
    private class240 field1671;

    @OriginalMember(owner = "client!eh", name = "m", descriptor = "I")
    private int field1656;

    @OriginalMember(owner = "client!eh", name = "C", descriptor = "I")
    private int field1672;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIIIII)V", line = 10)
    private final void method948(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        long var8 = -1L;
        int var10 = arg0 + (arg5 << this.field1664.field4054);
        int var11 = (arg6 << this.field1664.field4054) + arg1;
        int var12 = this.field1664.method1515(var10, var11);
        if ((arg0 & 0x7F) == 0 || (arg1 & 0x7F) == 0) {
            var8 = (long) var11 & 0xFFFFL << 16 | (long) var10 & 0xFFFFL;
            class381 var13 = this.field1661.method614(-81, var8);
            if (var13 != null) {
                this.method950(true, ((class41) var13).field633);
                return;
            }
        }
        short var14 = (short) (this.field1656++);
        if (var8 != -1L) {
            this.field1661.method612(var8, arg2 ^ 0xFFFF0029, new class41(var14));
        }
        float var15;
        float var16;
        float var17;
        if (arg0 == 0 && arg1 == 0) {
            var15 = this.field1659[arg3][arg4];
            var16 = this.field1658[arg3][arg4];
            var17 = this.field1668[arg3][arg4];
        } else if (this.field1664.field4062 == arg0 && arg1 == 0) {
            var17 = this.field1668[arg3 + 1][arg4];
            var16 = this.field1658[arg3 + 1][arg4];
            var15 = this.field1659[arg3 + 1][arg4];
        } else if (this.field1664.field4062 == arg0 && this.field1664.field4062 == arg1) {
            var15 = this.field1659[arg3 + 1][arg4 + 1];
            var16 = this.field1658[arg3 + 1][arg4 + 1];
            var17 = this.field1668[arg3 + 1][arg4 + 1];
        } else if (arg0 == 0 && this.field1664.field4062 == arg1) {
            var16 = this.field1658[arg3][arg4 + 1];
            var15 = this.field1659[arg3][arg4 + 1];
            var17 = this.field1668[arg3][arg4 + 1];
        } else {
            float var18 = (float) arg0 / (float) this.field1664.field4062;
            float var19 = (float) arg1 / (float) this.field1664.field4062;
            float var20 = this.field1658[arg3][arg4];
            float var21 = this.field1659[arg3][arg4];
            float var22 = this.field1668[arg3][arg4];
            float var23 = this.field1658[arg3 + 1][arg4];
            float var24 = this.field1659[arg3 + 1][arg4];
            float var25 = (this.field1658[arg3 + 1][arg4 + 1] - var23) * var18 + var23;
            float var26 = (this.field1658[arg3][arg4 + 1] - var20) * var18 + var20;
            float var27 = (this.field1659[arg3 + 1][arg4 + 1] - var24) * var18 + var24;
            float var28 = (this.field1668[arg3][arg4 + 1] - var22) * var18 + var22;
            float var29 = this.field1668[arg3 + 1][arg4];
            float var30 = (this.field1659[arg3][arg4 + 1] - var21) * var18 + var21;
            float var31 = (this.field1668[arg3 + 1][arg4 + 1] - var29) * var18 + var29;
            var15 = (var27 - var30) * var19 + var30;
            var16 = (var25 - var26) * var19 + var26;
            var17 = (var31 - var28) * var19 + var28;
        }
        float var32 = (float) (this.field1660.field3618 - var10);
        float var33 = (float) (this.field1660.field3622 - var12);
        float var34 = (float) (this.field1660.field3620 - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var33 * var36;
        float var38 = var34 * var36;
        float var39 = var32 * var36;
        float var40 = var35 / (float) this.field1660.field3625;
        float var41 = 1.0F - (var40 * var40);
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var17 * var38 + var15 * var37 + var16 * var39;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field1660.field3624;
        int var45 = (int) ((float) (var44 >> 16 & 0xFF) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) ((var44 & arg2) >> 8) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (this.field1670.field292) {
            this.field1663.method414((float) var10, -124);
            this.field1663.method414((float) var12, 123);
            this.field1663.method414((float) var11, -111);
        } else {
            this.field1663.method415((float) var10, false);
            this.field1663.method415((float) var12, false);
            this.field1663.method415((float) var11, false);
        }
        if (var47 > 255) {
            var47 = 255;
        }
        this.field1663.method1824(122, var45);
        this.field1663.method1824(arg2 ^ 0xFFB9, var46);
        this.field1663.method1824(67, var47);
        this.field1663.method1824(arg2 ^ 0xFFEC, 255);
        this.method950(true, var14);
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IZII[[Z)V", line = 171)
    public final void method949(int arg0, boolean arg1, int arg2, int arg3, boolean[][] arg4) {
        if (!arg1) {
            this.field1655 = 2;
        }
        if (this.field1673 == null || this.field1655 > arg0 + arg2 || arg0 - arg2 > this.field1667 || this.field1665 > arg2 + arg3 || (arg3 - arg2) > this.field1657) {
            return;
        }
        for (int var6 = this.field1665; var6 <= this.field1657; var6++) {
            for (int var7 = this.field1655; var7 <= this.field1667; var7++) {
                int var8 = var7 - arg0;
                int var9 = var6 - arg3;
                if (var8 > -arg2 && var8 < arg2 && var9 > (-arg2) && arg2 > var9 && arg4[var8 + arg2][var9 + arg2]) {
                    this.field1670.method169((int) (this.field1660.field3623 * 255.0F) << 24);
                    this.field1670.method161(this.field1666);
                    this.field1670.method257(this.field1671);
                    this.field1670.method180();
                    this.field1670.method112(this.field1673, 4, 0, this.field1672);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZS)V", line = 238)
    private final void method950(boolean arg0, short arg1) {
        if (this.field1670.field292) {
            this.field1669.method1877(true, arg1);
        } else {
            this.field1669.method1842(-4, arg1);
        }
        if (arg0) {
            this.field1672++;
        }
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(Lhd;Lag;Lj;[I)V", line = 257)
    public class119(class17 arg0, class302 arg1, class269 arg2, int[] arg3) {
        this.field1664 = arg1;
        this.field1660 = arg2;
        this.field1670 = arg0;
        int var5 = this.field1660.field3625 - (arg1.field4062 >> 1);
        this.field1655 = this.field1660.field3618 - var5 >> arg1.field4054;
        this.field1667 = this.field1660.field3618 + var5 >> arg1.field4054;
        this.field1665 = this.field1660.field3620 - var5 >> arg1.field4054;
        this.field1657 = this.field1660.field3620 + var5 >> arg1.field4054;
        int var6 = this.field1667 + 1 - this.field1655;
        int var7 = this.field1657 + 1 - this.field1665;
        this.field1659 = new float[var6 + 1][var7 + 1];
        this.field1668 = new float[var6 + 1][var7 + 1];
        this.field1658 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var9 = var8 + this.field1665;
            if (var9 > 0 && var9 < (this.field1664.field5751 - 1)) {
                for (int var10 = 0; var10 <= var6; var10++) {
                    int var11 = this.field1655 + var10;
                    if (var11 > 0 && var11 < (this.field1664.field5745 - 1)) {
                        int var12 = arg1.method1509(var11 + 1, var9) - arg1.method1509(var11 - 1, var9);
                        int var13 = arg1.method1509(var11, var9 + 1) - arg1.method1509(var11, var9 - 1);
                        float var14 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + var13 * var13 + 65536)));
                        this.field1658[var10][var8] = (float) var12 * var14;
                        this.field1659[var10][var8] = var14 * -256.0F;
                        this.field1668[var10][var8] = (float) var13 * var14;
                    }
                }
            }
        }
        int var15 = 0;
        int var16 = 0;
        for (int var17 = this.field1665; var17 <= this.field1657; var17++) {
            if (var17 >= 0 && var17 < arg1.field5751) {
                for (int var18 = this.field1655; var18 <= this.field1667; var18++) {
                    if (var18 >= 0 && arg1.field5745 > var18) {
                        int var19 = arg3[var16];
                        int[] var20 = arg1.field4053[var18][var17];
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
                var16 += this.field1667 - this.field1655;
            }
        }
        if (var15 > 0) {
            this.field1669 = new class289(var15 * 2);
            this.field1663 = new class45(var15 * 16);
            this.field1661 = new class71(class443.method2751(true, var15));
            int var21 = 0;
            int var22 = 0;
            for (int var23 = this.field1665; var23 <= this.field1657; var23++) {
                if (var23 >= 0 && var23 < arg1.field5751) {
                    int var24 = 0;
                    for (int var25 = this.field1655; var25 <= this.field1667; var25++) {
                        if (var25 >= 0 && arg1.field5745 > var25) {
                            int var26 = arg3[var22];
                            int[] var27 = arg1.field4053[var25][var23];
                            int[] var28 = arg1.field4065[var25][var23];
                            if (var27 != null && var26 != 0) {
                                if (var26 == 1) {
                                    for (int var29 = 0; var29 < var27.length; var29++) {
                                        this.method948(var27[var29], var28[var29], 65494, var24, var21, var25, var23);
                                    }
                                } else if (var26 == 3) {
                                    this.method948(0, 0, 65494, var24, var21, var25, var23);
                                    this.method948(arg1.field4062, 0, 65494, var24, var21, var25, var23);
                                    this.method948(0, arg1.field4062, 65494, var24, var21, var25, var23);
                                } else if (var26 == 2) {
                                    this.method948(arg1.field4062, 0, 65494, var24, var21, var25, var23);
                                    this.method948(arg1.field4062, arg1.field4062, 65494, var24, var21, var25, var23);
                                    this.method948(0, 0, 65494, var24, var21, var25, var23);
                                } else if (var26 == 5) {
                                    this.method948(arg1.field4062, arg1.field4062, 65494, var24, var21, var25, var23);
                                    this.method948(0, arg1.field4062, 65494, var24, var21, var25, var23);
                                    this.method948(arg1.field4062, 0, 65494, var24, var21, var25, var23);
                                } else if (var26 == 4) {
                                    this.method948(0, arg1.field4062, 65494, var24, var21, var25, var23);
                                    this.method948(0, 0, 65494, var24, var21, var25, var23);
                                    this.method948(arg1.field4062, arg1.field4062, 65494, var24, var21, var25, var23);
                                }
                            }
                        }
                        var22++;
                        var24++;
                    }
                } else {
                    var22 += this.field1667 - this.field1655;
                }
                var21++;
            }
            this.field1673 = this.field1670.method128(5123, this.field1669.field3882, this.field1669.field3938, false);
            this.field1662 = this.field1670.method165(16, this.field1663.field3882, this.field1663.field3938, false);
            this.field1666 = new class240(this.field1670, this.field1662, 5126, 3, 0);
            this.field1671 = new class240(this.field1670, this.field1662, 5121, 4, 12);
        } else {
            this.field1671 = null;
            this.field1673 = null;
            this.field1662 = null;
            this.field1666 = null;
        }
        this.field1658 = this.field1659 = this.field1668 = (float[][]) null;
        this.field1663 = null;
        this.field1661 = null;
        this.field1669 = null;
    }
}
