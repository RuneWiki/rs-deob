import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!XDUWEFUG")
public class class63 {

    @OriginalMember(owner = "client!XDUWEFUG", name = "a", descriptor = "Z")
    private boolean field1606 = false;

    @OriginalMember(owner = "client!XDUWEFUG", name = "j", descriptor = "[I")
    private int[] field1615 = new int[5];

    @OriginalMember(owner = "client!XDUWEFUG", name = "k", descriptor = "[I")
    private int[] field1616 = new int[5];

    @OriginalMember(owner = "client!XDUWEFUG", name = "l", descriptor = "[I")
    private int[] field1617 = new int[5];

    @OriginalMember(owner = "client!XDUWEFUG", name = "n", descriptor = "I")
    private int field1619 = 100;

    @OriginalMember(owner = "client!XDUWEFUG", name = "q", descriptor = "I")
    public int field1622 = 500;

    @OriginalMember(owner = "client!XDUWEFUG", name = "v", descriptor = "[I")
    private static int[] field1627 = new int[5];

    @OriginalMember(owner = "client!XDUWEFUG", name = "w", descriptor = "[I")
    private static int[] field1628 = new int[5];

    @OriginalMember(owner = "client!XDUWEFUG", name = "x", descriptor = "[I")
    private static int[] field1629 = new int[5];

    @OriginalMember(owner = "client!XDUWEFUG", name = "y", descriptor = "[I")
    private static int[] field1630 = new int[5];

    @OriginalMember(owner = "client!XDUWEFUG", name = "z", descriptor = "[I")
    private static int[] field1631 = new int[5];

    @OriginalMember(owner = "client!XDUWEFUG", name = "m", descriptor = "I")
    private int field1618;

    @OriginalMember(owner = "client!XDUWEFUG", name = "r", descriptor = "I")
    public int field1623;

    @OriginalMember(owner = "client!XDUWEFUG", name = "b", descriptor = "LLMFHFXBO;")
    private class34 field1607;

    @OriginalMember(owner = "client!XDUWEFUG", name = "c", descriptor = "LLMFHFXBO;")
    private class34 field1608;

    @OriginalMember(owner = "client!XDUWEFUG", name = "d", descriptor = "LLMFHFXBO;")
    private class34 field1609;

    @OriginalMember(owner = "client!XDUWEFUG", name = "e", descriptor = "LLMFHFXBO;")
    private class34 field1610;

    @OriginalMember(owner = "client!XDUWEFUG", name = "f", descriptor = "LLMFHFXBO;")
    private class34 field1611;

    @OriginalMember(owner = "client!XDUWEFUG", name = "g", descriptor = "LLMFHFXBO;")
    private class34 field1612;

    @OriginalMember(owner = "client!XDUWEFUG", name = "h", descriptor = "LLMFHFXBO;")
    private class34 field1613;

    @OriginalMember(owner = "client!XDUWEFUG", name = "i", descriptor = "LLMFHFXBO;")
    private class34 field1614;

    @OriginalMember(owner = "client!XDUWEFUG", name = "p", descriptor = "LLMFHFXBO;")
    private class34 field1621;

    @OriginalMember(owner = "client!XDUWEFUG", name = "o", descriptor = "LBVZJQTSH;")
    private class5 field1620;

    @OriginalMember(owner = "client!XDUWEFUG", name = "s", descriptor = "[I")
    private static int[] field1624;

    @OriginalMember(owner = "client!XDUWEFUG", name = "t", descriptor = "[I")
    private static int[] field1625;

    @OriginalMember(owner = "client!XDUWEFUG", name = "u", descriptor = "[I")
    private static int[] field1626;

    @OriginalMember(owner = "client!XDUWEFUG", name = "a", descriptor = "()V")
    public static final void method552() {
        field1625 = new int[32768];
        for (int var0 = 0; var0 < 32768; var0++) {
            if (Math.random() > 0.5D) {
                field1625[var0] = 1;
            } else {
                field1625[var0] = -1;
            }
        }
        field1626 = new int[32768];
        for (int var1 = 0; var1 < 32768; var1++) {
            field1626[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
        }
        field1624 = new int[220500];
    }

    @OriginalMember(owner = "client!XDUWEFUG", name = "a", descriptor = "(II)[I")
    public final int[] method553(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field1624[var3] = 0;
        }
        if (arg1 < 10) {
            return field1624;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1607.method358((byte) 2);
        this.field1608.method358((byte) 2);
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field1609 != null) {
            this.field1609.method358((byte) 2);
            this.field1610.method358((byte) 2);
            var6 = (int) ((double) (this.field1609.field1130 - this.field1609.field1129) * 32.768D / var4);
            var7 = (int) ((double) this.field1609.field1129 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field1611 != null) {
            this.field1611.method358((byte) 2);
            this.field1612.method358((byte) 2);
            var9 = (int) ((double) (this.field1611.field1130 - this.field1611.field1129) * 32.768D / var4);
            var10 = (int) ((double) this.field1611.field1129 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field1615[var12] != 0) {
                field1627[var12] = 0;
                field1628[var12] = (int) ((double) this.field1617[var12] * var4);
                field1629[var12] = (this.field1615[var12] << 14) / 100;
                field1630[var12] = (int) ((double) (this.field1607.field1130 - this.field1607.field1129) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1616[var12]) / var4);
                field1631[var12] = (int) ((double) this.field1607.field1129 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var41 = this.field1607.method359(arg0, 478);
            int var42 = this.field1608.method359(arg0, 478);
            if (this.field1609 != null) {
                int var43 = this.field1609.method359(arg0, 478);
                int var44 = this.field1610.method359(arg0, 478);
                var41 += this.method554(var8, this.field1609.field1131, var44, (byte) 4) >> 1;
                var8 += (var6 * var43 >> 16) + var7;
            }
            if (this.field1611 != null) {
                int var45 = this.field1611.method359(arg0, 478);
                int var46 = this.field1612.method359(arg0, 478);
                var42 = var42 * ((this.method554(var11, this.field1611.field1131, var46, (byte) 4) >> 1) + 32768) >> 15;
                var11 += (var9 * var45 >> 16) + var10;
            }
            for (int var47 = 0; var47 < 5; var47++) {
                if (this.field1615[var47] != 0) {
                    int var48 = field1628[var47] + var13;
                    if (var48 < arg0) {
                        field1624[var48] += this.method554(field1627[var47], this.field1607.field1131, field1629[var47] * var42 >> 15, (byte) 4);
                        field1627[var47] += (field1630[var47] * var41 >> 16) + field1631[var47];
                    }
                }
            }
        }
        if (this.field1613 != null) {
            this.field1613.method358((byte) 2);
            this.field1614.method358((byte) 2);
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field1613.method359(arg0, 478);
                int var19 = this.field1614.method359(arg0, 478);
                int var20;
                if (var16) {
                    var20 = ((this.field1613.field1130 - this.field1613.field1129) * var18 >> 8) + this.field1613.field1129;
                } else {
                    var20 = ((this.field1613.field1130 - this.field1613.field1129) * var19 >> 8) + this.field1613.field1129;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field1624[var17] = 0;
                }
            }
        }
        if (this.field1618 > 0 && this.field1619 > 0) {
            int var21 = (int) ((double) this.field1618 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field1624[var22] += field1624[var22 - var21] * this.field1619 / 100;
            }
        }
        if (this.field1620.field69[0] > 0 || this.field1620.field69[1] > 0) {
            this.field1621.method358((byte) 2);
            int var23 = this.field1621.method359(arg0 + 1, 478);
            int var24 = this.field1620.method25((byte) 8, (float) var23 / 65536.0F, 0);
            int var25 = this.field1620.method25((byte) 8, (float) var23 / 65536.0F, 1);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var37 = (int) ((long) field1624[var24 + var26] * (long) class5.field76 >> 16);
                    for (int var38 = 0; var38 < var24; var38++) {
                        var37 += (int) ((long) field1624[var24 + var26 - var38 - 1] * (long) class5.field74[0][var38] >> 16);
                    }
                    for (int var39 = 0; var39 < var26; var39++) {
                        var37 -= (int) ((long) field1624[var26 - var39 - 1] * (long) class5.field74[1][var39] >> 16);
                    }
                    field1624[var26] = var37;
                    var23 = this.field1621.method359(arg0 + 1, 478);
                    var26++;
                }
                short var28 = 128;
                int var29 = var28;
                while (true) {
                    if (var29 > arg0 - var24) {
                        var29 = arg0 - var24;
                    }
                    while (var26 < var29) {
                        int var34 = (int) ((long) field1624[var24 + var26] * (long) class5.field76 >> 16);
                        for (int var35 = 0; var35 < var24; var35++) {
                            var34 += (int) ((long) field1624[var24 + var26 - var35 - 1] * (long) class5.field74[0][var35] >> 16);
                        }
                        for (int var36 = 0; var36 < var25; var36++) {
                            var34 -= (int) ((long) field1624[var26 - var36 - 1] * (long) class5.field74[1][var36] >> 16);
                        }
                        field1624[var26] = var34;
                        var23 = this.field1621.method359(arg0 + 1, 478);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var30 = 0;
                            for (int var31 = var24 + var26 - arg0; var31 < var24; var31++) {
                                var30 += (int) ((long) field1624[var24 + var26 - var31 - 1] * (long) class5.field74[0][var31] >> 16);
                            }
                            for (int var32 = 0; var32 < var25; var32++) {
                                var30 -= (int) ((long) field1624[var26 - var32 - 1] * (long) class5.field74[1][var32] >> 16);
                            }
                            field1624[var26] = var30;
                            this.field1621.method359(arg0 + 1, 478);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field1620.method25((byte) 8, (float) var23 / 65536.0F, 0);
                    var25 = this.field1620.method25((byte) 8, (float) var23 / 65536.0F, 1);
                    var29 += var28;
                }
            }
        }
        for (int var40 = 0; var40 < arg0; var40++) {
            if (field1624[var40] < -32768) {
                field1624[var40] = -32768;
            }
            if (field1624[var40] > 32767) {
                field1624[var40] = 32767;
            }
        }
        return field1624;
    }

    @OriginalMember(owner = "client!XDUWEFUG", name = "a", descriptor = "(IIIB)I")
    private final int method554(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != 4) {
            this.field1606 = !this.field1606;
        }
        if (arg1 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg2 : -arg2;
        } else if (arg1 == 2) {
            return field1626[arg0 & 0x7FFF] * arg2 >> 14;
        } else if (arg1 == 3) {
            return ((arg0 & 0x7FFF) * arg2 >> 14) - arg2;
        } else if (arg1 == 4) {
            return field1625[arg0 / 2607 & 0x7FFF] * arg2;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!XDUWEFUG", name = "a", descriptor = "(LMNKDCXXG;I)V")
    public final void method555(class37 arg0, int arg1) {
        this.field1607 = new class34();
        this.field1607.method356(arg0, 0);
        if (arg1 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field1608 = new class34();
        this.field1608.method356(arg0, 0);
        int var4 = arg0.method386();
        if (var4 != 0) {
            arg0.field1212--;
            this.field1609 = new class34();
            this.field1609.method356(arg0, 0);
            this.field1610 = new class34();
            this.field1610.method356(arg0, 0);
        }
        int var5 = arg0.method386();
        if (var5 != 0) {
            arg0.field1212--;
            this.field1611 = new class34();
            this.field1611.method356(arg0, 0);
            this.field1612 = new class34();
            this.field1612.method356(arg0, 0);
        }
        int var6 = arg0.method386();
        if (var6 != 0) {
            arg0.field1212--;
            this.field1613 = new class34();
            this.field1613.method356(arg0, 0);
            this.field1614 = new class34();
            this.field1614.method356(arg0, 0);
        }
        for (int var7 = 0; var7 < 10; var7++) {
            int var8 = arg0.method400();
            if (var8 == 0) {
                break;
            }
            this.field1615[var7] = var8;
            this.field1616[var7] = arg0.method399();
            this.field1617[var7] = arg0.method400();
        }
        this.field1618 = arg0.method400();
        this.field1619 = arg0.method400();
        this.field1622 = arg0.method388();
        this.field1623 = arg0.method388();
        this.field1620 = new class5();
        this.field1621 = new class34();
        this.field1620.method26(arg0, false, this.field1621);
    }
}
