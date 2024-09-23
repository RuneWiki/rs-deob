import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("YPPCWCLI")
public class class69 {

    @OriginalMember(owner = "YPPCWCLI", name = "a", descriptor = "B")
    private byte field1625 = 44;

    @OriginalMember(owner = "YPPCWCLI", name = "b", descriptor = "Z")
    private boolean field1626 = true;

    @OriginalMember(owner = "YPPCWCLI", name = "d", descriptor = "Z")
    private boolean field1628 = true;

    @OriginalMember(owner = "YPPCWCLI", name = "m", descriptor = "[I")
    private int[] field1637 = new int[5];

    @OriginalMember(owner = "YPPCWCLI", name = "n", descriptor = "[I")
    private int[] field1638 = new int[5];

    @OriginalMember(owner = "YPPCWCLI", name = "o", descriptor = "[I")
    private int[] field1639 = new int[5];

    @OriginalMember(owner = "YPPCWCLI", name = "q", descriptor = "I")
    private int field1641 = 100;

    @OriginalMember(owner = "YPPCWCLI", name = "t", descriptor = "I")
    public int field1644 = 500;

    @OriginalMember(owner = "YPPCWCLI", name = "c", descriptor = "I")
    private static int field1627 = -10185;

    @OriginalMember(owner = "YPPCWCLI", name = "y", descriptor = "[I")
    private static int[] field1649 = new int[5];

    @OriginalMember(owner = "YPPCWCLI", name = "z", descriptor = "[I")
    private static int[] field1650 = new int[5];

    @OriginalMember(owner = "YPPCWCLI", name = "A", descriptor = "[I")
    private static int[] field1651 = new int[5];

    @OriginalMember(owner = "YPPCWCLI", name = "B", descriptor = "[I")
    private static int[] field1652 = new int[5];

    @OriginalMember(owner = "YPPCWCLI", name = "C", descriptor = "[I")
    private static int[] field1653 = new int[5];

    @OriginalMember(owner = "YPPCWCLI", name = "p", descriptor = "I")
    private int field1640;

    @OriginalMember(owner = "YPPCWCLI", name = "u", descriptor = "I")
    public int field1645;

    @OriginalMember(owner = "YPPCWCLI", name = "r", descriptor = "LECVTLYGP;")
    private class16 field1642;

    @OriginalMember(owner = "YPPCWCLI", name = "e", descriptor = "LNSRSHTPL;")
    private class38 field1629;

    @OriginalMember(owner = "YPPCWCLI", name = "f", descriptor = "LNSRSHTPL;")
    private class38 field1630;

    @OriginalMember(owner = "YPPCWCLI", name = "g", descriptor = "LNSRSHTPL;")
    private class38 field1631;

    @OriginalMember(owner = "YPPCWCLI", name = "h", descriptor = "LNSRSHTPL;")
    private class38 field1632;

    @OriginalMember(owner = "YPPCWCLI", name = "i", descriptor = "LNSRSHTPL;")
    private class38 field1633;

    @OriginalMember(owner = "YPPCWCLI", name = "j", descriptor = "LNSRSHTPL;")
    private class38 field1634;

    @OriginalMember(owner = "YPPCWCLI", name = "k", descriptor = "LNSRSHTPL;")
    private class38 field1635;

    @OriginalMember(owner = "YPPCWCLI", name = "l", descriptor = "LNSRSHTPL;")
    private class38 field1636;

    @OriginalMember(owner = "YPPCWCLI", name = "s", descriptor = "LNSRSHTPL;")
    private class38 field1643;

    @OriginalMember(owner = "YPPCWCLI", name = "v", descriptor = "[I")
    private static int[] field1646;

    @OriginalMember(owner = "YPPCWCLI", name = "w", descriptor = "[I")
    private static int[] field1647;

    @OriginalMember(owner = "YPPCWCLI", name = "x", descriptor = "[I")
    private static int[] field1648;

    @OriginalMember(owner = "YPPCWCLI", name = "a", descriptor = "()V")
    public static final void method585() {
        field1647 = new int[32768];
        for (int var0 = 0; var0 < 32768; var0++) {
            if (Math.random() > 0.5D) {
                field1647[var0] = 1;
            } else {
                field1647[var0] = -1;
            }
        }
        field1648 = new int[32768];
        for (int var1 = 0; var1 < 32768; var1++) {
            field1648[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
        }
        field1646 = new int[220500];
    }

    @OriginalMember(owner = "YPPCWCLI", name = "a", descriptor = "(II)[I")
    public final int[] method586(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field1646[var3] = 0;
        }
        if (arg1 < 10) {
            return field1646;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1629.method340((byte) 0);
        this.field1630.method340((byte) 0);
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field1631 != null) {
            this.field1631.method340((byte) 0);
            this.field1632.method340((byte) 0);
            var6 = (int) ((double) (this.field1631.field1086 - this.field1631.field1085) * 32.768D / var4);
            var7 = (int) ((double) this.field1631.field1085 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field1633 != null) {
            this.field1633.method340((byte) 0);
            this.field1634.method340((byte) 0);
            var9 = (int) ((double) (this.field1633.field1086 - this.field1633.field1085) * 32.768D / var4);
            var10 = (int) ((double) this.field1633.field1085 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field1637[var12] != 0) {
                field1649[var12] = 0;
                field1650[var12] = (int) ((double) this.field1639[var12] * var4);
                field1651[var12] = (this.field1637[var12] << 14) / 100;
                field1652[var12] = (int) ((double) (this.field1629.field1086 - this.field1629.field1085) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1638[var12]) / var4);
                field1653[var12] = (int) ((double) this.field1629.field1085 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var41 = this.field1629.method341(arg0, 49916);
            int var42 = this.field1630.method341(arg0, 49916);
            if (this.field1631 != null) {
                int var43 = this.field1631.method341(arg0, 49916);
                int var44 = this.field1632.method341(arg0, 49916);
                var41 += this.method587(var8, this.field1631.field1087, field1627, var44) >> 1;
                var8 += (var6 * var43 >> 16) + var7;
            }
            if (this.field1633 != null) {
                int var45 = this.field1633.method341(arg0, 49916);
                int var46 = this.field1634.method341(arg0, 49916);
                var42 = var42 * ((this.method587(var11, this.field1633.field1087, field1627, var46) >> 1) + 32768) >> 15;
                var11 += (var9 * var45 >> 16) + var10;
            }
            for (int var47 = 0; var47 < 5; var47++) {
                if (this.field1637[var47] != 0) {
                    int var48 = field1650[var47] + var13;
                    if (var48 < arg0) {
                        field1646[var48] += this.method587(field1649[var47], this.field1629.field1087, field1627, field1651[var47] * var42 >> 15);
                        field1649[var47] += (field1652[var47] * var41 >> 16) + field1653[var47];
                    }
                }
            }
        }
        if (this.field1635 != null) {
            this.field1635.method340((byte) 0);
            this.field1636.method340((byte) 0);
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field1635.method341(arg0, 49916);
                int var19 = this.field1636.method341(arg0, 49916);
                int var20;
                if (var16) {
                    var20 = ((this.field1635.field1086 - this.field1635.field1085) * var18 >> 8) + this.field1635.field1085;
                } else {
                    var20 = ((this.field1635.field1086 - this.field1635.field1085) * var19 >> 8) + this.field1635.field1085;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field1646[var17] = 0;
                }
            }
        }
        if (this.field1640 > 0 && this.field1641 > 0) {
            int var21 = (int) ((double) this.field1640 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field1646[var22] += field1646[var22 - var21] * this.field1641 / 100;
            }
        }
        if (this.field1642.field713[0] > 0 || this.field1642.field713[1] > 0) {
            this.field1643.method340((byte) 0);
            int var23 = this.field1643.method341(arg0 + 1, 49916);
            int var24 = this.field1642.method197(0, 0, (float) var23 / 65536.0F);
            int var25 = this.field1642.method197(0, 1, (float) var23 / 65536.0F);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var37 = (int) ((long) field1646[var24 + var26] * (long) class16.field720 >> 16);
                    for (int var38 = 0; var38 < var24; var38++) {
                        var37 += (int) ((long) field1646[var24 + var26 - var38 - 1] * (long) class16.field718[0][var38] >> 16);
                    }
                    for (int var39 = 0; var39 < var26; var39++) {
                        var37 -= (int) ((long) field1646[var26 - var39 - 1] * (long) class16.field718[1][var39] >> 16);
                    }
                    field1646[var26] = var37;
                    var23 = this.field1643.method341(arg0 + 1, 49916);
                    var26++;
                }
                short var28 = 128;
                int var29 = var28;
                while (true) {
                    if (var29 > arg0 - var24) {
                        var29 = arg0 - var24;
                    }
                    while (var26 < var29) {
                        int var34 = (int) ((long) field1646[var24 + var26] * (long) class16.field720 >> 16);
                        for (int var35 = 0; var35 < var24; var35++) {
                            var34 += (int) ((long) field1646[var24 + var26 - var35 - 1] * (long) class16.field718[0][var35] >> 16);
                        }
                        for (int var36 = 0; var36 < var25; var36++) {
                            var34 -= (int) ((long) field1646[var26 - var36 - 1] * (long) class16.field718[1][var36] >> 16);
                        }
                        field1646[var26] = var34;
                        var23 = this.field1643.method341(arg0 + 1, 49916);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var30 = 0;
                            for (int var31 = var24 + var26 - arg0; var31 < var24; var31++) {
                                var30 += (int) ((long) field1646[var24 + var26 - var31 - 1] * (long) class16.field718[0][var31] >> 16);
                            }
                            for (int var32 = 0; var32 < var25; var32++) {
                                var30 -= (int) ((long) field1646[var26 - var32 - 1] * (long) class16.field718[1][var32] >> 16);
                            }
                            field1646[var26] = var30;
                            this.field1643.method341(arg0 + 1, 49916);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field1642.method197(0, 0, (float) var23 / 65536.0F);
                    var25 = this.field1642.method197(0, 1, (float) var23 / 65536.0F);
                    var29 += var28;
                }
            }
        }
        for (int var40 = 0; var40 < arg0; var40++) {
            if (field1646[var40] < -32768) {
                field1646[var40] = -32768;
            }
            if (field1646[var40] > 32767) {
                field1646[var40] = 32767;
            }
        }
        return field1646;
    }

    @OriginalMember(owner = "YPPCWCLI", name = "a", descriptor = "(IIII)I")
    private final int method587(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != -10185) {
            this.field1628 = !this.field1628;
        }
        if (arg1 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg3 : -arg3;
        } else if (arg1 == 2) {
            return field1648[arg0 & 0x7FFF] * arg3 >> 14;
        } else if (arg1 == 3) {
            return ((arg0 & 0x7FFF) * arg3 >> 14) - arg3;
        } else if (arg1 == 4) {
            return field1647[arg0 / 2607 & 0x7FFF] * arg3;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "YPPCWCLI", name = "a", descriptor = "(BLYOXDZEVD;)V")
    public final void method588(byte arg0, class68 arg1) {
        this.field1629 = new class38();
        this.field1629.method338((byte) 44, arg1);
        this.field1630 = new class38();
        this.field1630.method338((byte) 44, arg1);
        int var3 = arg1.method549();
        if (this.field1625 != arg0) {
            this.field1626 = !this.field1626;
        }
        if (var3 != 0) {
            arg1.field1612--;
            this.field1631 = new class38();
            this.field1631.method338((byte) 44, arg1);
            this.field1632 = new class38();
            this.field1632.method338((byte) 44, arg1);
        }
        int var4 = arg1.method549();
        if (var4 != 0) {
            arg1.field1612--;
            this.field1633 = new class38();
            this.field1633.method338((byte) 44, arg1);
            this.field1634 = new class38();
            this.field1634.method338((byte) 44, arg1);
        }
        int var5 = arg1.method549();
        if (var5 != 0) {
            arg1.field1612--;
            this.field1635 = new class38();
            this.field1635.method338((byte) 44, arg1);
            this.field1636 = new class38();
            this.field1636.method338((byte) 44, arg1);
        }
        for (int var6 = 0; var6 < 10; var6++) {
            int var7 = arg1.method563();
            if (var7 == 0) {
                break;
            }
            this.field1637[var6] = var7;
            this.field1638[var6] = arg1.method562();
            this.field1639[var6] = arg1.method563();
        }
        this.field1640 = arg1.method563();
        this.field1641 = arg1.method563();
        this.field1644 = arg1.method551();
        this.field1645 = arg1.method551();
        this.field1642 = new class16();
        this.field1643 = new class38();
        this.field1642.method198((byte) -38, arg1, this.field1643);
    }
}
