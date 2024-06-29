import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class130 extends class238 {

    @OriginalMember(owner = "client!jf", name = "o", descriptor = "Leo;")
    private class178 field1691;

    @OriginalMember(owner = "client!jf", name = "y", descriptor = "Lmi;")
    private class315 field1701;

    @OriginalMember(owner = "client!jf", name = "n", descriptor = "Lag;")
    private class445 field1690;

    @OriginalMember(owner = "client!jf", name = "A", descriptor = "I")
    private int field1703;

    @OriginalMember(owner = "client!jf", name = "w", descriptor = "I")
    private int field1699;

    @OriginalMember(owner = "client!jf", name = "u", descriptor = "I")
    private int field1697;

    @OriginalMember(owner = "client!jf", name = "t", descriptor = "I")
    private int field1696;

    @OriginalMember(owner = "client!jf", name = "r", descriptor = "[[F")
    private float[][] field1694;

    @OriginalMember(owner = "client!jf", name = "x", descriptor = "[[F")
    private float[][] field1700;

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "[[F")
    private float[][] field1689;

    @OriginalMember(owner = "client!jf", name = "s", descriptor = "Lrp;")
    private class276 field1695;

    @OriginalMember(owner = "client!jf", name = "p", descriptor = "Ljt;")
    private class60 field1692;

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "Lcp;")
    private class470 field1688;

    @OriginalMember(owner = "client!jf", name = "C", descriptor = "Lhs;")
    private class196 field1705;

    @OriginalMember(owner = "client!jf", name = "D", descriptor = "Lht;")
    private class378 field1706;

    @OriginalMember(owner = "client!jf", name = "v", descriptor = "Lga;")
    private class254 field1698;

    @OriginalMember(owner = "client!jf", name = "z", descriptor = "Lga;")
    private class254 field1702;

    @OriginalMember(owner = "client!jf", name = "q", descriptor = "I")
    private int field1693;

    @OriginalMember(owner = "client!jf", name = "B", descriptor = "I")
    private int field1704;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(BS)V")
    private final void method818(byte arg0, short arg1) {
        if (arg0 <= 68) {
            this.method820(89, (boolean[][]) ((boolean[][]) null), 47, (byte) -1, 103);
        }
        if (this.field1701.field4514) {
            this.field1695.method1711(false, arg1);
        } else {
            this.field1695.method1691(arg1, (byte) -117);
        }
        this.field1704++;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIIBII)V")
    private final void method819(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        long var8 = -1L;
        int var10 = arg6 + (arg0 << this.field1690.field6145);
        int var11 = (arg1 << this.field1690.field6145) + arg2;
        int var12 = this.field1690.method1209(var10, var11);
        if ((arg6 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
            var8 = (long) var11 & 0xFFFFL << 16 | (long) var10 & 0xFFFFL;
            class238 var13 = this.field1688.method2761(var8, (byte) -112);
            if (var13 != null) {
                this.method818((byte) 86, ((class68) var13).field859);
                return;
            }
        }
        short var14 = (short) (this.field1693++);
        if (var8 != -1L) {
            this.field1688.method2767(-1, var8, new class68(var14));
        }
        float var15;
        float var16;
        float var17;
        if (arg6 == 0 && arg2 == 0) {
            var15 = this.field1694[arg3][arg5];
            var16 = this.field1700[arg3][arg5];
            var17 = this.field1689[arg3][arg5];
        } else if (this.field1690.field6147 == arg6 && arg2 == 0) {
            var15 = this.field1694[arg3 + 1][arg5];
            var17 = this.field1689[arg3 + 1][arg5];
            var16 = this.field1700[arg3 + 1][arg5];
        } else if (this.field1690.field6147 == arg6 && this.field1690.field6147 == arg2) {
            var16 = this.field1700[arg3 + 1][arg5 + 1];
            var17 = this.field1689[arg3 + 1][arg5 + 1];
            var15 = this.field1694[arg3 + 1][arg5 + 1];
        } else if (arg6 == 0 && this.field1690.field6147 == arg2) {
            var15 = this.field1694[arg3][arg5 + 1];
            var17 = this.field1689[arg3][arg5 + 1];
            var16 = this.field1700[arg3][arg5 + 1];
        } else {
            float var18 = (float) arg6 / (float) this.field1690.field6147;
            float var19 = (float) arg2 / (float) this.field1690.field6147;
            float var20 = this.field1694[arg3][arg5];
            float var21 = this.field1700[arg3][arg5];
            float var22 = this.field1689[arg3][arg5];
            float var23 = this.field1694[arg3 + 1][arg5];
            float var24 = this.field1700[arg3 + 1][arg5];
            float var25 = (this.field1694[arg3 + 1][arg5 + 1] - var23) * var18 + var23;
            float var26 = (this.field1700[arg3][arg5 + 1] - var21) * var18 + var21;
            float var27 = (this.field1689[arg3][arg5 + 1] - var22) * var18 + var22;
            float var28 = this.field1689[arg3 + 1][arg5];
            float var29 = (this.field1700[arg3 + 1][arg5 + 1] - var24) * var18 + var24;
            float var30 = (this.field1694[arg3][arg5 + 1] - var20) * var18 + var20;
            var15 = (var25 - var30) * var19 + var30;
            var16 = (var29 - var26) * var19 + var26;
            float var31 = (this.field1689[arg3 + 1][arg5 + 1] - var28) * var18 + var28;
            var17 = (var31 - var27) * var19 + var27;
        }
        if (arg4 > -91) {
            this.field1700 = (float[][]) ((float[][]) null);
        }
        float var32 = (float) (this.field1691.field2552 - var10);
        float var33 = (float) (this.field1691.field2547 - var12);
        float var34 = (float) (this.field1691.field2546 - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var33 * var36;
        float var38 = var32 * var36;
        float var39 = var34 * var36;
        float var40 = var35 / (float) this.field1691.field2557;
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
        int var44 = this.field1691.field2558;
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
        if (this.field1701.field4514) {
            this.field1692.method374((float) var10, (byte) -59);
            this.field1692.method374((float) var12, (byte) -111);
            this.field1692.method374((float) var11, (byte) -64);
        } else {
            this.field1692.method373(-113, (float) var10);
            this.field1692.method373(-123, (float) var12);
            this.field1692.method373(-115, (float) var11);
        }
        this.field1692.method1753(true, var45);
        this.field1692.method1753(true, var46);
        this.field1692.method1753(true, var47);
        this.field1692.method1753(true, 255);
        this.method818((byte) 84, var14);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I[[ZIBI)V")
    public final void method820(int arg0, boolean[][] arg1, int arg2, byte arg3, int arg4) {
        if (this.field1705 == null || this.field1703 > (arg2 + arg4) || this.field1699 < (arg2 - arg4) || this.field1697 > (arg0 + arg4) || this.field1696 < (arg0 - arg4)) {
            return;
        }
        for (int var6 = this.field1697; var6 <= this.field1696; var6++) {
            for (int var7 = this.field1703; var7 <= this.field1699; var7++) {
                int var8 = var7 - arg2;
                int var9 = var6 - arg0;
                if (-arg4 < var8 && arg4 > var8 && (-arg4) < var9 && var9 < arg4 && arg1[arg4 + var8][arg4 + var9]) {
                    this.field1701.method1987((int) (this.field1691.field2555 * 255.0F) << 24);
                    this.field1701.method2008(this.field1698, (class254) null, this.field1702, (class254) null);
                    this.field1701.method1998(this.field1705, 4, 0, this.field1704);
                    return;
                }
            }
        }
        if (arg3 >= -81) {
            this.method820(-118, (boolean[][]) ((boolean[][]) null), 118, (byte) -105, -99);
        }
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lmi;Lag;Leo;[I)V")
    public class130(class315 arg0, class445 arg1, class178 arg2, int[] arg3) {
        this.field1691 = arg2;
        this.field1701 = arg0;
        this.field1690 = arg1;
        int var5 = this.field1691.field2557 - (arg1.field6147 >> 1);
        this.field1703 = this.field1691.field2552 - var5 >> arg1.field6145;
        this.field1699 = this.field1691.field2552 + var5 >> arg1.field6145;
        this.field1697 = this.field1691.field2546 - var5 >> arg1.field6145;
        this.field1696 = this.field1691.field2546 + var5 >> arg1.field6145;
        int var6 = this.field1699 + 1 - this.field1703;
        int var7 = this.field1696 + 1 - this.field1697;
        this.field1694 = new float[var6 + 1][var7 + 1];
        this.field1700 = new float[var6 + 1][var7 + 1];
        this.field1689 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var9 = this.field1697 + var8;
            if (var9 > 0 && var9 < this.field1690.field5970 - 1) {
                for (int var10 = 0; var10 <= var6; var10++) {
                    int var11 = var10 + this.field1703;
                    if (var11 > 0 && var11 < this.field1690.field5967 - 1) {
                        int var12 = arg1.method1218(var11 + 1, var9) - arg1.method1218(var11 - 1, var9);
                        int var13 = arg1.method1218(var11, var9 + 1) - arg1.method1218(var11, var9 - 1);
                        float var14 = (float) (1.0D / Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536)));
                        this.field1694[var10][var8] = (float) var12 * var14;
                        this.field1700[var10][var8] = var14 * -256.0F;
                        this.field1689[var10][var8] = (float) var13 * var14;
                    }
                }
            }
        }
        int var15 = 0;
        int var16 = 0;
        for (int var17 = this.field1697; var17 <= this.field1696; var17++) {
            if (var17 >= 0 && var17 < arg1.field5970) {
                for (int var18 = this.field1703; var18 <= this.field1699; var18++) {
                    if (var18 >= 0 && arg1.field5967 > var18) {
                        int var19 = arg3[var16];
                        int[] var20 = arg1.field6141[var18][var17];
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
                var16 += this.field1699 - this.field1703;
            }
        }
        if (var15 > 0) {
            this.field1695 = new class276(var15 * 2);
            this.field1692 = new class60(var15 * 16);
            this.field1688 = new class470(class276.method1708(1256978000, var15));
            int var21 = 0;
            int var22 = 0;
            for (int var23 = this.field1697; var23 <= this.field1696; var23++) {
                if (var23 >= 0 && arg1.field5970 > var23) {
                    int var24 = 0;
                    for (int var25 = this.field1703; var25 <= this.field1699; var25++) {
                        if (var25 >= 0 && var25 < arg1.field5967) {
                            int var26 = arg3[var21];
                            int[] var27 = arg1.field6141[var25][var23];
                            int[] var28 = arg1.field6136[var25][var23];
                            if (var27 != null && var26 != 0) {
                                if (var26 == 1) {
                                    for (int var29 = 0; var29 < var27.length; var29++) {
                                        this.method819(var25, var23, var28[var29], var24, (byte) -108, var22, var27[var29]);
                                    }
                                } else if (var26 == 3) {
                                    this.method819(var25, var23, 0, var24, (byte) -104, var22, 0);
                                    this.method819(var25, var23, 0, var24, (byte) -104, var22, arg1.field6147);
                                    this.method819(var25, var23, arg1.field6147, var24, (byte) -127, var22, 0);
                                } else if (var26 == 2) {
                                    this.method819(var25, var23, 0, var24, (byte) -123, var22, arg1.field6147);
                                    this.method819(var25, var23, arg1.field6147, var24, (byte) -103, var22, arg1.field6147);
                                    this.method819(var25, var23, 0, var24, (byte) -127, var22, 0);
                                } else if (var26 == 5) {
                                    this.method819(var25, var23, arg1.field6147, var24, (byte) -109, var22, arg1.field6147);
                                    this.method819(var25, var23, arg1.field6147, var24, (byte) -117, var22, 0);
                                    this.method819(var25, var23, 0, var24, (byte) -116, var22, arg1.field6147);
                                } else if (var26 == 4) {
                                    this.method819(var25, var23, arg1.field6147, var24, (byte) -112, var22, 0);
                                    this.method819(var25, var23, 0, var24, (byte) -121, var22, 0);
                                    this.method819(var25, var23, arg1.field6147, var24, (byte) -98, var22, arg1.field6147);
                                }
                            }
                        }
                        var24++;
                        var21++;
                    }
                } else {
                    var21 += this.field1699 - this.field1703;
                }
                var22++;
            }
            this.field1705 = this.field1701.method1990(5123, this.field1695.field4064, this.field1695.field4021, false);
            this.field1706 = this.field1701.method2004(16, this.field1692.field4064, this.field1692.field4021, false);
            this.field1698 = new class254(this.field1701, this.field1706, 5126, 3, 0);
            this.field1702 = new class254(this.field1701, this.field1706, 5121, 4, 12);
        } else {
            this.field1702 = null;
            this.field1705 = null;
            this.field1698 = null;
            this.field1706 = null;
        }
        this.field1688 = null;
        this.field1695 = null;
        this.field1692 = null;
        this.field1694 = this.field1700 = this.field1689 = (float[][]) null;
    }
}
