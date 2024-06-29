import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!YXUDALYQ")
public class class69 {

    @OriginalMember(owner = "client!YXUDALYQ", name = "j", descriptor = "[I")
    private int[] field1690 = new int[5];

    @OriginalMember(owner = "client!YXUDALYQ", name = "k", descriptor = "[I")
    private int[] field1691 = new int[5];

    @OriginalMember(owner = "client!YXUDALYQ", name = "l", descriptor = "[I")
    private int[] field1692 = new int[5];

    @OriginalMember(owner = "client!YXUDALYQ", name = "n", descriptor = "I")
    private int field1694 = 100;

    @OriginalMember(owner = "client!YXUDALYQ", name = "q", descriptor = "I")
    public int field1697 = 500;

    @OriginalMember(owner = "client!YXUDALYQ", name = "v", descriptor = "[I")
    private static int[] field1702 = new int[5];

    @OriginalMember(owner = "client!YXUDALYQ", name = "w", descriptor = "[I")
    private static int[] field1703 = new int[5];

    @OriginalMember(owner = "client!YXUDALYQ", name = "x", descriptor = "[I")
    private static int[] field1704 = new int[5];

    @OriginalMember(owner = "client!YXUDALYQ", name = "y", descriptor = "[I")
    private static int[] field1705 = new int[5];

    @OriginalMember(owner = "client!YXUDALYQ", name = "z", descriptor = "[I")
    private static int[] field1706 = new int[5];

    @OriginalMember(owner = "client!YXUDALYQ", name = "a", descriptor = "I")
    private static int field1681;

    @OriginalMember(owner = "client!YXUDALYQ", name = "m", descriptor = "I")
    private int field1693;

    @OriginalMember(owner = "client!YXUDALYQ", name = "r", descriptor = "I")
    public int field1698;

    @OriginalMember(owner = "client!YXUDALYQ", name = "b", descriptor = "LJZEFIVMF;")
    private class25 field1682;

    @OriginalMember(owner = "client!YXUDALYQ", name = "c", descriptor = "LJZEFIVMF;")
    private class25 field1683;

    @OriginalMember(owner = "client!YXUDALYQ", name = "d", descriptor = "LJZEFIVMF;")
    private class25 field1684;

    @OriginalMember(owner = "client!YXUDALYQ", name = "e", descriptor = "LJZEFIVMF;")
    private class25 field1685;

    @OriginalMember(owner = "client!YXUDALYQ", name = "f", descriptor = "LJZEFIVMF;")
    private class25 field1686;

    @OriginalMember(owner = "client!YXUDALYQ", name = "g", descriptor = "LJZEFIVMF;")
    private class25 field1687;

    @OriginalMember(owner = "client!YXUDALYQ", name = "h", descriptor = "LJZEFIVMF;")
    private class25 field1688;

    @OriginalMember(owner = "client!YXUDALYQ", name = "i", descriptor = "LJZEFIVMF;")
    private class25 field1689;

    @OriginalMember(owner = "client!YXUDALYQ", name = "p", descriptor = "LJZEFIVMF;")
    private class25 field1696;

    @OriginalMember(owner = "client!YXUDALYQ", name = "o", descriptor = "LXALWVYUP;")
    private class62 field1695;

    @OriginalMember(owner = "client!YXUDALYQ", name = "s", descriptor = "[I")
    private static int[] field1699;

    @OriginalMember(owner = "client!YXUDALYQ", name = "t", descriptor = "[I")
    private static int[] field1700;

    @OriginalMember(owner = "client!YXUDALYQ", name = "u", descriptor = "[I")
    private static int[] field1701;

    @OriginalMember(owner = "client!YXUDALYQ", name = "a", descriptor = "()V")
    public static final void method572() {
        field1700 = new int[32768];
        for (int var0 = 0; var0 < 32768; var0++) {
            if (Math.random() > 0.5D) {
                field1700[var0] = 1;
            } else {
                field1700[var0] = -1;
            }
        }
        field1701 = new int[32768];
        for (int var1 = 0; var1 < 32768; var1++) {
            field1701[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
        }
        field1699 = new int[220500];
    }

    @OriginalMember(owner = "client!YXUDALYQ", name = "a", descriptor = "(II)[I")
    public final int[] method573(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field1699[var3] = 0;
        }
        if (arg1 < 10) {
            return field1699;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1682.method311(false);
        this.field1683.method311(false);
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field1684 != null) {
            this.field1684.method311(false);
            this.field1685.method311(false);
            var6 = (int) ((double) (this.field1684.field778 - this.field1684.field777) * 32.768D / var4);
            var7 = (int) ((double) this.field1684.field777 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field1686 != null) {
            this.field1686.method311(false);
            this.field1687.method311(false);
            var9 = (int) ((double) (this.field1686.field778 - this.field1686.field777) * 32.768D / var4);
            var10 = (int) ((double) this.field1686.field777 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field1690[var12] != 0) {
                field1702[var12] = 0;
                field1703[var12] = (int) ((double) this.field1692[var12] * var4);
                field1704[var12] = (this.field1690[var12] << 14) / 100;
                field1705[var12] = (int) ((double) (this.field1682.field778 - this.field1682.field777) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1691[var12]) / var4);
                field1706[var12] = (int) ((double) this.field1682.field777 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var41 = this.field1682.method312(arg0, field1681);
            int var42 = this.field1683.method312(arg0, field1681);
            if (this.field1684 != null) {
                int var43 = this.field1684.method312(arg0, field1681);
                int var44 = this.field1685.method312(arg0, field1681);
                var41 += this.method574((byte) 77, var44, this.field1684.field779, var8) >> 1;
                var8 += (var6 * var43 >> 16) + var7;
            }
            if (this.field1686 != null) {
                int var45 = this.field1686.method312(arg0, field1681);
                int var46 = this.field1687.method312(arg0, field1681);
                var42 = var42 * ((this.method574((byte) 77, var46, this.field1686.field779, var11) >> 1) + 32768) >> 15;
                var11 += (var9 * var45 >> 16) + var10;
            }
            for (int var47 = 0; var47 < 5; var47++) {
                if (this.field1690[var47] != 0) {
                    int var48 = field1703[var47] + var13;
                    if (var48 < arg0) {
                        field1699[var48] += this.method574((byte) 77, field1704[var47] * var42 >> 15, this.field1682.field779, field1702[var47]);
                        field1702[var47] += (field1705[var47] * var41 >> 16) + field1706[var47];
                    }
                }
            }
        }
        if (this.field1688 != null) {
            this.field1688.method311(false);
            this.field1689.method311(false);
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field1688.method312(arg0, field1681);
                int var19 = this.field1689.method312(arg0, field1681);
                int var20;
                if (var16) {
                    var20 = ((this.field1688.field778 - this.field1688.field777) * var18 >> 8) + this.field1688.field777;
                } else {
                    var20 = ((this.field1688.field778 - this.field1688.field777) * var19 >> 8) + this.field1688.field777;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field1699[var17] = 0;
                }
            }
        }
        if (this.field1693 > 0 && this.field1694 > 0) {
            int var21 = (int) ((double) this.field1693 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field1699[var22] += field1699[var22 - var21] * this.field1694 / 100;
            }
        }
        if (this.field1695.field1516[0] > 0 || this.field1695.field1516[1] > 0) {
            this.field1696.method311(false);
            int var23 = this.field1696.method312(arg0 + 1, field1681);
            int var24 = this.field1695.method484(0, false, (float) var23 / 65536.0F);
            int var25 = this.field1695.method484(1, false, (float) var23 / 65536.0F);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var37 = (int) ((long) field1699[var24 + var26] * (long) class62.field1523 >> 16);
                    for (int var38 = 0; var38 < var24; var38++) {
                        var37 += (int) ((long) field1699[var24 + var26 - var38 - 1] * (long) class62.field1521[0][var38] >> 16);
                    }
                    for (int var39 = 0; var39 < var26; var39++) {
                        var37 -= (int) ((long) field1699[var26 - var39 - 1] * (long) class62.field1521[1][var39] >> 16);
                    }
                    field1699[var26] = var37;
                    var23 = this.field1696.method312(arg0 + 1, field1681);
                    var26++;
                }
                short var28 = 128;
                int var29 = var28;
                while (true) {
                    if (var29 > arg0 - var24) {
                        var29 = arg0 - var24;
                    }
                    while (var26 < var29) {
                        int var34 = (int) ((long) field1699[var24 + var26] * (long) class62.field1523 >> 16);
                        for (int var35 = 0; var35 < var24; var35++) {
                            var34 += (int) ((long) field1699[var24 + var26 - var35 - 1] * (long) class62.field1521[0][var35] >> 16);
                        }
                        for (int var36 = 0; var36 < var25; var36++) {
                            var34 -= (int) ((long) field1699[var26 - var36 - 1] * (long) class62.field1521[1][var36] >> 16);
                        }
                        field1699[var26] = var34;
                        var23 = this.field1696.method312(arg0 + 1, field1681);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var30 = 0;
                            for (int var31 = var24 + var26 - arg0; var31 < var24; var31++) {
                                var30 += (int) ((long) field1699[var24 + var26 - var31 - 1] * (long) class62.field1521[0][var31] >> 16);
                            }
                            for (int var32 = 0; var32 < var25; var32++) {
                                var30 -= (int) ((long) field1699[var26 - var32 - 1] * (long) class62.field1521[1][var32] >> 16);
                            }
                            field1699[var26] = var30;
                            this.field1696.method312(arg0 + 1, field1681);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field1695.method484(0, false, (float) var23 / 65536.0F);
                    var25 = this.field1695.method484(1, false, (float) var23 / 65536.0F);
                    var29 += var28;
                }
            }
        }
        for (int var40 = 0; var40 < arg0; var40++) {
            if (field1699[var40] < -32768) {
                field1699[var40] = -32768;
            }
            if (field1699[var40] > 32767) {
                field1699[var40] = 32767;
            }
        }
        return field1699;
    }

    @OriginalMember(owner = "client!YXUDALYQ", name = "a", descriptor = "(BIII)I")
    private final int method574(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 77) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (arg2 == 1) {
            return (arg3 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1701[arg3 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg3 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1700[arg3 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!YXUDALYQ", name = "a", descriptor = "(LFTMSICIZ;I)V")
    public final void method575(class13 arg0, int arg1) {
        this.field1682 = new class25();
        this.field1682.method309(arg0, 799);
        this.field1683 = new class25();
        this.field1683.method309(arg0, 799);
        int var3 = arg0.method213();
        if (var3 != 0) {
            arg0.field643--;
            this.field1684 = new class25();
            this.field1684.method309(arg0, 799);
            this.field1685 = new class25();
            this.field1685.method309(arg0, 799);
        }
        int var4 = arg0.method213();
        if (var4 != 0) {
            arg0.field643--;
            this.field1686 = new class25();
            this.field1686.method309(arg0, 799);
            this.field1687 = new class25();
            this.field1687.method309(arg0, 799);
        }
        int var5 = arg0.method213();
        if (var5 != 0) {
            arg0.field643--;
            this.field1688 = new class25();
            this.field1688.method309(arg0, 799);
            this.field1689 = new class25();
            this.field1689.method309(arg0, 799);
        }
        for (int var6 = 0; var6 < 10; var6++) {
            int var7 = arg0.method227();
            if (var7 == 0) {
                break;
            }
            this.field1690[var6] = var7;
            this.field1691[var6] = arg0.method226();
            this.field1692[var6] = arg0.method227();
        }
        this.field1693 = arg0.method227();
        this.field1694 = arg0.method227();
        this.field1697 = arg0.method215();
        this.field1698 = arg0.method215();
        int var8 = 49 / arg1;
        this.field1695 = new class62();
        this.field1696 = new class25();
        this.field1695.method485(this.field1696, arg0, -5817);
    }
}
