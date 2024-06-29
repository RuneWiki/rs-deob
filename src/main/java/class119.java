import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class119 extends class221 {

    @OriginalMember(owner = "client!mc", name = "C", descriptor = "I")
    private int field1627 = 0;

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "Lfaa;")
    private class139 field1608 = new class139(16);

    @OriginalMember(owner = "client!mc", name = "M", descriptor = "I")
    private int field1636 = 0;

    @OriginalMember(owner = "client!mc", name = "P", descriptor = "Lgca;")
    private class227 field1639 = new class227();

    @OriginalMember(owner = "client!mc", name = "Q", descriptor = "J")
    private long field1640 = 0L;

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "I")
    private int field1609;

    @OriginalMember(owner = "client!mc", name = "x", descriptor = "Lsp;")
    private class589 field1622;

    @OriginalMember(owner = "client!mc", name = "L", descriptor = "Z")
    private boolean field1635;

    @OriginalMember(owner = "client!mc", name = "N", descriptor = "Lgca;")
    private class227 field1637;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "[B")
    private byte[] field1605;

    @OriginalMember(owner = "client!mc", name = "E", descriptor = "Llfa;")
    private class100 field1629;

    @OriginalMember(owner = "client!mc", name = "z", descriptor = "I")
    private int field1624;

    @OriginalMember(owner = "client!mc", name = "R", descriptor = "Z")
    private boolean field1641;

    @OriginalMember(owner = "client!mc", name = "K", descriptor = "I")
    private int field1634;

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "Lmu;")
    private class272 field1611;

    @OriginalMember(owner = "client!mc", name = "J", descriptor = "Lsp;")
    private class589 field1633;

    @OriginalMember(owner = "client!mc", name = "w", descriptor = "Lufa;")
    private class633 field1621;

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "S")
    public static short field1614 = 1;

    @OriginalMember(owner = "client!mc", name = "G", descriptor = "I")
    public static int field1630 = 0;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "Lem;")
    public static class206 field1604 = new class206(22, -2);

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "I")
    public static int field1607;

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!mc", name = "n", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!mc", name = "s", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!mc", name = "t", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!mc", name = "u", descriptor = "I")
    public static int field1619;

    @OriginalMember(owner = "client!mc", name = "v", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!mc", name = "y", descriptor = "I")
    public static int field1623;

    @OriginalMember(owner = "client!mc", name = "A", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!mc", name = "B", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!mc", name = "D", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!mc", name = "H", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!mc", name = "I", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!mc", name = "r", descriptor = "Lfga;")
    private class231 field1616;

    @OriginalMember(owner = "client!mc", name = "O", descriptor = "Z")
    private boolean field1638;

    @OriginalMember(owner = "client!mc", name = "q", descriptor = "[B")
    private byte[] field1615;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(B)I", line = 10)
    public final int method842(byte arg0) {
        if (arg0 != 64) {
            this.field1621 = null;
        }
        field1618++;
        return this.field1616 == null ? 0 : this.field1616.field3195;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I[B[BIIIIII)V", line = 26)
    public static final void method843(int arg0, byte[] arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1607++;
        int var9 = -(arg0 >> 2);
        int var10 = -(arg0 & 0x3);
        if (arg4 > -124) {
            field1614 = 56;
        }
        for (int var11 = -arg6; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg3++;
                arg2[var10001] += arg1[arg7++];
                int var14 = arg3++;
                arg2[var14] += arg1[arg7++];
                int var15 = arg3++;
                arg2[var15] += arg1[arg7++];
                int var16 = arg3++;
                arg2[var16] += arg1[arg7++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg3++;
                arg2[var10001] += arg1[arg7++];
            }
            arg3 += arg8;
            arg7 += arg5;
        }
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(II)I", line = 74)
    public final int method844(int arg0, int arg1) {
        field1603++;
        int var3 = -37 % ((arg0 + 22) / 40);
        class633 var4 = (class633) this.field1608.method970((byte) 89, (long) arg1);
        return var4 == null ? 0 : var4.method569((byte) 57);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)Lufa;", line = 90)
    private final class633 method845(int arg0, int arg1, int arg2) {
        if (arg1 != -1070) {
            return null;
        }
        field1619++;
        class633 var4 = (class633) this.field1608.method970((byte) 89, (long) arg2);
        if (var4 != null && arg0 == 0 && !var4.field8763 && var4.field8762) {
            var4.method2340(85);
            var4 = null;
        }
        if (var4 == null) {
            if (arg0 == 0) {
                if (this.field1622 == null || this.field1615[arg2] == -1) {
                    if (this.field1629.method730((byte) -81)) {
                        return null;
                    }
                    var4 = this.field1629.method729(203266800, true, this.field1609, (byte) 2, arg2);
                } else {
                    var4 = this.field1611.method1668(5, arg2, this.field1622);
                }
            } else if (arg0 == 1) {
                if (this.field1622 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field1611.method1665((byte) 33, this.field1622, arg2);
            } else if (arg0 == 2) {
                if (this.field1622 == null) {
                    throw new RuntimeException();
                }
                if (this.field1615[arg2] != -1) {
                    throw new RuntimeException();
                }
                if (this.field1629.method723(-120)) {
                    return null;
                }
                var4 = this.field1629.method729(203266800, false, this.field1609, (byte) 2, arg2);
            } else {
                throw new RuntimeException();
            }
            this.field1608.method968((long) arg2, var4, arg1 ^ 0x42D);
        }
        if (var4.field8762) {
            return null;
        }
        byte[] var5 = var4.method572(115);
        if (!var4 instanceof class68) {
            try {
                label159: {
                    if (var5 != null && var5.length > 2) {
                        class128.field1828.reset();
                        class128.field1828.update(var5, 0, var5.length - 2);
                        int var12 = (int) class128.field1828.getValue();
                        if (this.field1616.field3199[arg2] != var12) {
                            throw new RuntimeException();
                        }
                        if (this.field1616.field3202 == null || this.field1616.field3202[arg2] == null) {
                            break label159;
                        }
                        byte[] var13 = this.field1616.field3202[arg2];
                        byte[] var14 = class171.method1205(var5, 0, -107, var5.length - 2);
                        int var15 = 0;
                        while (true) {
                            if (var15 >= 64) {
                                break label159;
                            }
                            if (var13[var15] != var14[var15]) {
                                throw new RuntimeException();
                            }
                            var15++;
                        }
                    }
                    throw new RuntimeException();
                }
                this.field1629.field1417 = 0;
                this.field1629.field1415 = 0;
            } catch (RuntimeException var18) {
                this.field1629.method732(-111);
                var4.method2340(arg1 ^ 0x46C);
                if (var4.field8763 && !this.field1629.method730((byte) -59)) {
                    class205 var16 = this.field1629.method729(203266800, true, this.field1609, (byte) 2, arg2);
                    this.field1608.method968((long) arg2, var16, -1);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field1616.field3201[arg2] >>> 8);
            var5[var5.length - 1] = (byte) this.field1616.field3201[arg2];
            if (this.field1622 != null) {
                this.field1611.method1666(-123, this.field1622, var5, arg2);
                if (this.field1615[arg2] != 1) {
                    this.field1627++;
                    this.field1615[arg2] = 1;
                }
            }
            if (!var4.field8763) {
                var4.method2340(90);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class128.field1828.reset();
            class128.field1828.update(var5, 0, var5.length - 2);
            int var6 = (int) class128.field1828.getValue();
            if (this.field1616.field3199[arg2] != var6) {
                throw new RuntimeException();
            }
            if (this.field1616.field3202 != null && this.field1616.field3202[arg2] != null) {
                byte[] var7 = this.field1616.field3202[arg2];
                byte[] var8 = class171.method1205(var5, 0, -100, var5.length - 2);
                for (int var9 = 0; var9 < 64; var9++) {
                    if (var7[var9] != var8[var9]) {
                        throw new RuntimeException();
                    }
                }
            }
            int var10 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field1616.field3201[arg2] & 0xFFFF) != var10) {
                throw new RuntimeException();
            }
            if (this.field1615[arg2] != 1) {
                this.field1627++;
                this.field1615[arg2] = 1;
            }
            if (!var4.field8763) {
                var4.method2340(-93);
            }
            return var4;
        } catch (Exception var17) {
            this.field1615[arg2] = -1;
            var4.method2340(84);
            if (var4.field8763 && !this.field1629.method730((byte) -115)) {
                class205 var11 = this.field1629.method729(203266800, true, this.field1609, (byte) 2, arg2);
                this.field1608.method968((long) arg2, var11, -1);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)Lfga;", line = 364)
    public final class231 method846(byte arg0) {
        field1625++;
        if (arg0 != -125) {
            return null;
        } else if (this.field1616 == null) {
            if (this.field1621 == null) {
                if (this.field1629.method730((byte) -67)) {
                    return null;
                }
                this.field1621 = this.field1629.method729(203266800, true, 255, (byte) 0, this.field1609);
            }
            if (this.field1621.field8762) {
                return null;
            }
            byte[] var2 = this.field1621.method572(120);
            if (this.field1621 instanceof class68) {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field1616 = new class231(var2, this.field1624, this.field1605);
                    if (this.field1616.field3200 != this.field1634) {
                        throw new RuntimeException();
                    }
                } catch (RuntimeException var3) {
                    this.field1616 = null;
                    if (this.field1629.method730((byte) -88)) {
                        this.field1621 = null;
                    } else {
                        this.field1621 = this.field1629.method729(203266800, true, 255, (byte) 0, this.field1609);
                    }
                    return null;
                }
            } else {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field1616 = new class231(var2, this.field1624, this.field1605);
                } catch (RuntimeException var4) {
                    this.field1629.method732(-127);
                    this.field1616 = null;
                    if (this.field1629.method730((byte) -122)) {
                        this.field1621 = null;
                    } else {
                        this.field1621 = this.field1629.method729(203266800, true, 255, (byte) 0, this.field1609);
                    }
                    return null;
                }
                if (this.field1633 != null) {
                    this.field1611.method1666(-60, this.field1633, var2, this.field1609);
                }
            }
            if (this.field1622 != null) {
                this.field1615 = new byte[this.field1616.field3194];
                this.field1627 = 0;
            }
            this.field1621 = null;
            return this.field1616;
        } else {
            return this.field1616;
        }
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)V", line = 464)
    public final void method847(int arg0) {
        field1620++;
        if (this.field1637 != null) {
            if (this.method846((byte) -125) == null) {
                return;
            }
            if (this.field1635) {
                boolean var6 = true;
                for (class401 var7 = this.field1637.method1436(28964); var7 != null; var7 = this.field1637.method1443((byte) 6)) {
                    int var9 = (int) var7.field5623;
                    if (this.field1615[var9] == 0) {
                        this.method845(1, -1070, var9);
                    }
                    if (this.field1615[var9] == 0) {
                        var6 = false;
                    } else {
                        var7.method2340(-126);
                    }
                }
                while (this.field1616.field3196.length > this.field1636) {
                    if (this.field1616.field3196[this.field1636] == 0) {
                        this.field1636++;
                    } else {
                        if (this.field1611.field3712 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field1615[this.field1636] == 0) {
                            this.method845(1, arg0 ^ 0x74A0, this.field1636);
                        }
                        if (this.field1615[this.field1636] == 0) {
                            class401 var8 = new class401();
                            var8.field5623 = this.field1636;
                            var6 = false;
                            this.field1637.method1441(var8, 0);
                        }
                        this.field1636++;
                    }
                }
                if (var6) {
                    this.field1636 = 0;
                    this.field1635 = false;
                }
            } else if (this.field1638) {
                boolean var2 = true;
                for (class401 var3 = this.field1637.method1436(28964); var3 != null; var3 = this.field1637.method1443((byte) 6)) {
                    int var5 = (int) var3.field5623;
                    if (this.field1615[var5] != 1) {
                        this.method845(2, -1070, var5);
                    }
                    if (this.field1615[var5] == 1) {
                        var3.method2340(-87);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field1616.field3196.length > this.field1636) {
                    if (this.field1616.field3196[this.field1636] == 0) {
                        this.field1636++;
                    } else {
                        if (this.field1629.method723(-125)) {
                            var2 = false;
                            break;
                        }
                        if (this.field1615[this.field1636] != 1) {
                            this.method845(2, -1070, this.field1636);
                        }
                        if (this.field1615[this.field1636] != 1) {
                            class401 var4 = new class401();
                            var4.field5623 = this.field1636;
                            var2 = false;
                            this.field1637.method1441(var4, 0);
                        }
                        this.field1636++;
                    }
                }
                if (var2) {
                    this.field1636 = 0;
                    this.field1638 = false;
                }
            } else {
                this.field1637 = null;
            }
        }
        if (arg0 != -28814) {
            this.method846((byte) -71);
        }
        if (!this.field1641 || this.field1640 > class577.method3295((byte) 15)) {
            return;
        }
        for (class633 var10 = (class633) this.field1608.method977(0); var10 != null; var10 = (class633) this.field1608.method975(arg0 + 28813)) {
            if (!var10.field8762) {
                if (var10.field8765) {
                    if (!var10.field8763) {
                        throw new RuntimeException();
                    }
                    var10.method2340(115);
                } else {
                    var10.field8765 = true;
                }
            }
        }
        this.field1640 = class577.method3295((byte) 15) + 1000L;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(III)Lcu;", line = 645)
    public static final class201 method848(int arg0, int arg1, int arg2) {
        class390 var3 = class295.field4051[arg0][arg1][arg2];
        return var3 == null ? null : var3.field5525;
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(II)[B", line = 653)
    public final byte[] method849(int arg0, int arg1) {
        field1617++;
        class633 var3 = this.method845(0, -1070, arg0);
        if (var3 == null) {
            return null;
        }
        if (arg1 != -10122) {
            field1614 = -7;
        }
        byte[] var4 = var3.method572(123);
        var3.method2340(104);
        return var4;
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(I)V", line = 677)
    public final void method850(int arg0) {
        field1626++;
        if (this.field1622 == null) {
            return;
        }
        this.field1638 = true;
        if (this.field1637 == null) {
            this.field1637 = new class227();
        }
        if (arg0 != -29898) {
            field1604 = null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(I)V", line = 696)
    public final void method851(int arg0) {
        field1610++;
        if (this.field1637 == null || this.method846((byte) -125) == null) {
            return;
        }
        for (class401 var2 = this.field1639.method1436(28964); var2 != null; var2 = this.field1639.method1443((byte) 6)) {
            int var3 = (int) var2.field5623;
            if (var3 < 0 || var3 >= this.field1616.field3194 || this.field1616.field3196[var3] == 0) {
                var2.method2340(105);
            } else {
                if (this.field1615[var3] == 0) {
                    this.method845(1, -1070, var3);
                }
                if (this.field1615[var3] == -1) {
                    this.method845(2, -1070, var3);
                }
                if (this.field1615[var3] == 1) {
                    var2.method2340(113);
                }
            }
        }
        if (arg0 != 0) {
            this.field1621 = null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(II)V", line = 740)
    public final void method852(int arg0, int arg1) {
        field1606++;
        if (this.field1622 == null) {
            return;
        }
        for (class401 var3 = this.field1639.method1436(28964); var3 != null; var3 = this.field1639.method1443((byte) 6)) {
            if (((long) arg0) == var3.field5623) {
                return;
            }
        }
        if (arg1 == -18926) {
            class401 var4 = new class401();
            var4.field5623 = arg0;
            this.field1639.method1441(var4, 0);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Z)I", line = 769)
    public final int method853(boolean arg0) {
        if (!arg0) {
            method858(null, -111);
        }
        field1612++;
        if (this.method846((byte) -125) == null) {
            return this.field1621 == null ? 0 : this.field1621.method569((byte) 27);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(B)I", line = 792)
    public final int method854(byte arg0) {
        field1613++;
        if (arg0 != -43) {
            this.field1633 = null;
        }
        if (this.field1616 == null) {
            return 0;
        } else if (this.field1635) {
            class401 var2 = this.field1637.method1436(28964);
            return var2 == null ? 0 : (int) var2.field5623;
        } else {
            return this.field1616.field3195;
        }
    }

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "(B)I", line = 823)
    public final int method855(byte arg0) {
        field1623++;
        return arg0 == 8 ? this.field1627 : -121;
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(ILsp;Lsp;Llfa;Lmu;I[BIZ)V", line = 913)
    public class119(int arg0, class589 arg1, class589 arg2, class100 arg3, class272 arg4, int arg5, byte[] arg6, int arg7, boolean arg8) {
        this.field1609 = arg0;
        this.field1622 = arg1;
        if (this.field1622 == null) {
            this.field1635 = false;
        } else {
            this.field1635 = true;
            this.field1637 = new class227();
        }
        this.field1605 = arg6;
        this.field1629 = arg3;
        this.field1624 = arg5;
        this.field1641 = arg8;
        this.field1634 = arg7;
        this.field1611 = arg4;
        this.field1633 = arg2;
        if (this.field1633 != null) {
            this.field1621 = this.field1611.method1668(5, this.field1609, this.field1633);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lin;BII)V", line = 841)
    public static final void method856(class78 arg0, byte arg1, int arg2, int arg3) {
        field1632++;
        if (class396.field5579 != null || class541.field7327) {
            return;
        }
        if (arg1 >= -127) {
            field1630 = 35;
        }
        if (arg0 == null || class45.method376(118, arg0) == null) {
            return;
        }
        class396.field5579 = arg0;
        class501.field6894 = class45.method376(96, arg0);
        class220.field3073 = arg3;
        class413.field5853 = arg2;
        class498.field6767 = 0;
        class11.field113 = false;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(Z)V", line = 865)
    public static void method857(boolean arg0) {
        if (arg0) {
            field1630 = -29;
        }
        field1604 = null;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "([BI)Ljava/lang/String;", line = 881)
    public static final String method858(byte[] arg0, int arg1) {
        field1628++;
        if (arg1 != 255) {
            method843(-36, null, null, -40, -27, 25, -119, 98, 111);
        }
        return class148.method1088(arg0.length, (byte) 125, arg0, 0);
    }
}
