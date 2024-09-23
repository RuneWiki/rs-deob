import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ZOZPAWWH")
public class class71 {

    @OriginalMember(owner = "ZOZPAWWH", name = "j", descriptor = "[I")
    private int[] field1707 = new int[5];

    @OriginalMember(owner = "ZOZPAWWH", name = "k", descriptor = "[I")
    private int[] field1708 = new int[5];

    @OriginalMember(owner = "ZOZPAWWH", name = "l", descriptor = "[I")
    private int[] field1709 = new int[5];

    @OriginalMember(owner = "ZOZPAWWH", name = "n", descriptor = "I")
    private int field1711 = 100;

    @OriginalMember(owner = "ZOZPAWWH", name = "q", descriptor = "I")
    public int field1714 = 500;

    @OriginalMember(owner = "ZOZPAWWH", name = "v", descriptor = "[I")
    private static int[] field1719 = new int[5];

    @OriginalMember(owner = "ZOZPAWWH", name = "w", descriptor = "[I")
    private static int[] field1720 = new int[5];

    @OriginalMember(owner = "ZOZPAWWH", name = "x", descriptor = "[I")
    private static int[] field1721 = new int[5];

    @OriginalMember(owner = "ZOZPAWWH", name = "y", descriptor = "[I")
    private static int[] field1722 = new int[5];

    @OriginalMember(owner = "ZOZPAWWH", name = "z", descriptor = "[I")
    private static int[] field1723 = new int[5];

    @OriginalMember(owner = "ZOZPAWWH", name = "a", descriptor = "I")
    private static int field1698;

    @OriginalMember(owner = "ZOZPAWWH", name = "m", descriptor = "I")
    private int field1710;

    @OriginalMember(owner = "ZOZPAWWH", name = "r", descriptor = "I")
    public int field1715;

    @OriginalMember(owner = "ZOZPAWWH", name = "b", descriptor = "LLRDFYKJP;")
    private class29 field1699;

    @OriginalMember(owner = "ZOZPAWWH", name = "c", descriptor = "LLRDFYKJP;")
    private class29 field1700;

    @OriginalMember(owner = "ZOZPAWWH", name = "d", descriptor = "LLRDFYKJP;")
    private class29 field1701;

    @OriginalMember(owner = "ZOZPAWWH", name = "e", descriptor = "LLRDFYKJP;")
    private class29 field1702;

    @OriginalMember(owner = "ZOZPAWWH", name = "f", descriptor = "LLRDFYKJP;")
    private class29 field1703;

    @OriginalMember(owner = "ZOZPAWWH", name = "g", descriptor = "LLRDFYKJP;")
    private class29 field1704;

    @OriginalMember(owner = "ZOZPAWWH", name = "h", descriptor = "LLRDFYKJP;")
    private class29 field1705;

    @OriginalMember(owner = "ZOZPAWWH", name = "i", descriptor = "LLRDFYKJP;")
    private class29 field1706;

    @OriginalMember(owner = "ZOZPAWWH", name = "p", descriptor = "LLRDFYKJP;")
    private class29 field1713;

    @OriginalMember(owner = "ZOZPAWWH", name = "o", descriptor = "LAWPNKCCI;")
    private class3 field1712;

    @OriginalMember(owner = "ZOZPAWWH", name = "s", descriptor = "[I")
    private static int[] field1716;

    @OriginalMember(owner = "ZOZPAWWH", name = "t", descriptor = "[I")
    private static int[] field1717;

    @OriginalMember(owner = "ZOZPAWWH", name = "u", descriptor = "[I")
    private static int[] field1718;

    @OriginalMember(owner = "ZOZPAWWH", name = "a", descriptor = "()V")
    public static final void method588() {
        field1717 = new int[32768];
        for (int var0 = 0; var0 < 32768; var0++) {
            if (Math.random() > 0.5D) {
                field1717[var0] = 1;
            } else {
                field1717[var0] = -1;
            }
        }
        field1718 = new int[32768];
        for (int var1 = 0; var1 < 32768; var1++) {
            field1718[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
        }
        field1716 = new int[220500];
    }

    @OriginalMember(owner = "ZOZPAWWH", name = "a", descriptor = "(II)[I")
    public final int[] method589(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field1716[var3] = 0;
        }
        if (arg1 < 10) {
            return field1716;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1699.method263(field1698);
        this.field1700.method263(field1698);
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field1701 != null) {
            this.field1701.method263(field1698);
            this.field1702.method263(field1698);
            var6 = (int) ((double) (this.field1701.field893 - this.field1701.field892) * 32.768D / var4);
            var7 = (int) ((double) this.field1701.field892 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field1703 != null) {
            this.field1703.method263(field1698);
            this.field1704.method263(field1698);
            var9 = (int) ((double) (this.field1703.field893 - this.field1703.field892) * 32.768D / var4);
            var10 = (int) ((double) this.field1703.field892 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field1707[var12] != 0) {
                field1719[var12] = 0;
                field1720[var12] = (int) ((double) this.field1709[var12] * var4);
                field1721[var12] = (this.field1707[var12] << 14) / 100;
                field1722[var12] = (int) ((double) (this.field1699.field893 - this.field1699.field892) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1708[var12]) / var4);
                field1723[var12] = (int) ((double) this.field1699.field892 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var41 = this.field1699.method264(arg0, -822);
            int var42 = this.field1700.method264(arg0, -822);
            if (this.field1701 != null) {
                int var43 = this.field1701.method264(arg0, -822);
                int var44 = this.field1702.method264(arg0, -822);
                var41 += this.method590(this.field1701.field894, var44, (byte) -14, var8) >> 1;
                var8 += (var6 * var43 >> 16) + var7;
            }
            if (this.field1703 != null) {
                int var45 = this.field1703.method264(arg0, -822);
                int var46 = this.field1704.method264(arg0, -822);
                var42 = var42 * ((this.method590(this.field1703.field894, var46, (byte) -14, var11) >> 1) + 32768) >> 15;
                var11 += (var9 * var45 >> 16) + var10;
            }
            for (int var47 = 0; var47 < 5; var47++) {
                if (this.field1707[var47] != 0) {
                    int var48 = field1720[var47] + var13;
                    if (var48 < arg0) {
                        field1716[var48] += this.method590(this.field1699.field894, field1721[var47] * var42 >> 15, (byte) -14, field1719[var47]);
                        field1719[var47] += (field1722[var47] * var41 >> 16) + field1723[var47];
                    }
                }
            }
        }
        if (this.field1705 != null) {
            this.field1705.method263(field1698);
            this.field1706.method263(field1698);
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field1705.method264(arg0, -822);
                int var19 = this.field1706.method264(arg0, -822);
                int var20;
                if (var16) {
                    var20 = ((this.field1705.field893 - this.field1705.field892) * var18 >> 8) + this.field1705.field892;
                } else {
                    var20 = ((this.field1705.field893 - this.field1705.field892) * var19 >> 8) + this.field1705.field892;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field1716[var17] = 0;
                }
            }
        }
        if (this.field1710 > 0 && this.field1711 > 0) {
            int var21 = (int) ((double) this.field1710 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field1716[var22] += field1716[var22 - var21] * this.field1711 / 100;
            }
        }
        if (this.field1712.field29[0] > 0 || this.field1712.field29[1] > 0) {
            this.field1713.method263(field1698);
            int var23 = this.field1713.method264(arg0 + 1, -822);
            int var24 = this.field1712.method19((float) var23 / 65536.0F, 0, 5);
            int var25 = this.field1712.method19((float) var23 / 65536.0F, 1, 5);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var37 = (int) ((long) field1716[var24 + var26] * (long) class3.field36 >> 16);
                    for (int var38 = 0; var38 < var24; var38++) {
                        var37 += (int) ((long) field1716[var24 + var26 - var38 - 1] * (long) class3.field34[0][var38] >> 16);
                    }
                    for (int var39 = 0; var39 < var26; var39++) {
                        var37 -= (int) ((long) field1716[var26 - var39 - 1] * (long) class3.field34[1][var39] >> 16);
                    }
                    field1716[var26] = var37;
                    var23 = this.field1713.method264(arg0 + 1, -822);
                    var26++;
                }
                short var28 = 128;
                int var29 = var28;
                while (true) {
                    if (var29 > arg0 - var24) {
                        var29 = arg0 - var24;
                    }
                    while (var26 < var29) {
                        int var34 = (int) ((long) field1716[var24 + var26] * (long) class3.field36 >> 16);
                        for (int var35 = 0; var35 < var24; var35++) {
                            var34 += (int) ((long) field1716[var24 + var26 - var35 - 1] * (long) class3.field34[0][var35] >> 16);
                        }
                        for (int var36 = 0; var36 < var25; var36++) {
                            var34 -= (int) ((long) field1716[var26 - var36 - 1] * (long) class3.field34[1][var36] >> 16);
                        }
                        field1716[var26] = var34;
                        var23 = this.field1713.method264(arg0 + 1, -822);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var30 = 0;
                            for (int var31 = var24 + var26 - arg0; var31 < var24; var31++) {
                                var30 += (int) ((long) field1716[var24 + var26 - var31 - 1] * (long) class3.field34[0][var31] >> 16);
                            }
                            for (int var32 = 0; var32 < var25; var32++) {
                                var30 -= (int) ((long) field1716[var26 - var32 - 1] * (long) class3.field34[1][var32] >> 16);
                            }
                            field1716[var26] = var30;
                            this.field1713.method264(arg0 + 1, -822);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field1712.method19((float) var23 / 65536.0F, 0, 5);
                    var25 = this.field1712.method19((float) var23 / 65536.0F, 1, 5);
                    var29 += var28;
                }
            }
        }
        for (int var40 = 0; var40 < arg0; var40++) {
            if (field1716[var40] < -32768) {
                field1716[var40] = -32768;
            }
            if (field1716[var40] > 32767) {
                field1716[var40] = 32767;
            }
        }
        return field1716;
    }

    @OriginalMember(owner = "ZOZPAWWH", name = "a", descriptor = "(IIBI)I")
    private final int method590(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 != -14) {
            return field1698;
        } else if (arg0 == 1) {
            return (arg3 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg0 == 2) {
            return field1718[arg3 & 0x7FFF] * arg1 >> 14;
        } else if (arg0 == 3) {
            return ((arg3 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg0 == 4) {
            return field1717[arg3 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "ZOZPAWWH", name = "a", descriptor = "(LMUKVLYLC;Z)V")
    public final void method591(class33 arg0, boolean arg1) {
        this.field1699 = new class29();
        this.field1699.method261(arg0, false);
        if (arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field1700 = new class29();
        this.field1700.method261(arg0, false);
        int var4 = arg0.method292();
        if (var4 != 0) {
            arg0.field954--;
            this.field1701 = new class29();
            this.field1701.method261(arg0, false);
            this.field1702 = new class29();
            this.field1702.method261(arg0, false);
        }
        int var5 = arg0.method292();
        if (var5 != 0) {
            arg0.field954--;
            this.field1703 = new class29();
            this.field1703.method261(arg0, false);
            this.field1704 = new class29();
            this.field1704.method261(arg0, false);
        }
        int var6 = arg0.method292();
        if (var6 != 0) {
            arg0.field954--;
            this.field1705 = new class29();
            this.field1705.method261(arg0, false);
            this.field1706 = new class29();
            this.field1706.method261(arg0, false);
        }
        for (int var7 = 0; var7 < 10; var7++) {
            int var8 = arg0.method306();
            if (var8 == 0) {
                break;
            }
            this.field1707[var7] = var8;
            this.field1708[var7] = arg0.method305();
            this.field1709[var7] = arg0.method306();
        }
        this.field1710 = arg0.method306();
        this.field1711 = arg0.method306();
        this.field1714 = arg0.method294();
        this.field1715 = arg0.method294();
        this.field1712 = new class3();
        this.field1713 = new class29();
        this.field1712.method20(0, arg0, this.field1713);
    }
}
