import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class62 extends class145 {

    @OriginalMember(owner = "client!j", name = "ed", descriptor = "I")
    public int field1526 = 0;

    @OriginalMember(owner = "client!j", name = "Vc", descriptor = "I")
    public int field1517 = 0;

    @OriginalMember(owner = "client!j", name = "cd", descriptor = "Z")
    public boolean field1524 = false;

    @OriginalMember(owner = "client!j", name = "fd", descriptor = "I")
    public int field1527 = -1;

    @OriginalMember(owner = "client!j", name = "md", descriptor = "I")
    public int field1534 = 0;

    @OriginalMember(owner = "client!j", name = "ad", descriptor = "I")
    public int field1522 = -1;

    @OriginalMember(owner = "client!j", name = "Yc", descriptor = "I")
    public int field1520 = 0;

    @OriginalMember(owner = "client!j", name = "qd", descriptor = "I")
    public int field1538 = 0;

    @OriginalMember(owner = "client!j", name = "sd", descriptor = "[[[B")
    public static byte[][][] field1540 = new byte[4][104][104];

    @OriginalMember(owner = "client!j", name = "od", descriptor = "Lca;")
    public static class16 field1536 = new class16();

    @OriginalMember(owner = "client!j", name = "wd", descriptor = "I")
    public static volatile int field1544 = 0;

    @OriginalMember(owner = "client!j", name = "zd", descriptor = "Lmb;")
    public static class84 field1547 = class79.method672(true, "Fehler beim Laden Ihres Spielcharakters)3");

    @OriginalMember(owner = "client!j", name = "Bd", descriptor = "I")
    public static int field1549 = 0;

    @OriginalMember(owner = "client!j", name = "xd", descriptor = "Lmb;")
    public static class84 field1545 = class79.method672(true, "Von:");

    @OriginalMember(owner = "client!j", name = "Dd", descriptor = "Lmb;")
    private static class84 field1551 = class79.method672(true, "go back to the main RuneScape webpage");

    @OriginalMember(owner = "client!j", name = "Ad", descriptor = "Lmb;")
    public static class84 field1548 = field1551;

    @OriginalMember(owner = "client!j", name = "Cd", descriptor = "I")
    public static int field1550 = 0;

    @OriginalMember(owner = "client!j", name = "Ed", descriptor = "I")
    public static int field1552 = 0;

    @OriginalMember(owner = "client!j", name = "Wc", descriptor = "I")
    public int field1518;

    @OriginalMember(owner = "client!j", name = "Xc", descriptor = "I")
    public int field1519;

    @OriginalMember(owner = "client!j", name = "Zc", descriptor = "I")
    public int field1521;

    @OriginalMember(owner = "client!j", name = "bd", descriptor = "I")
    public int field1523;

    @OriginalMember(owner = "client!j", name = "dd", descriptor = "I")
    public static int field1525;

    @OriginalMember(owner = "client!j", name = "hd", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!j", name = "id", descriptor = "I")
    public int field1530;

    @OriginalMember(owner = "client!j", name = "jd", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!j", name = "kd", descriptor = "I")
    public int field1532;

    @OriginalMember(owner = "client!j", name = "ld", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!j", name = "rd", descriptor = "I")
    public int field1539;

    @OriginalMember(owner = "client!j", name = "td", descriptor = "I")
    public int field1541;

    @OriginalMember(owner = "client!j", name = "ud", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!j", name = "pd", descriptor = "Ldd;")
    public class26 field1537;

    @OriginalMember(owner = "client!j", name = "Fd", descriptor = "Lge;")
    public static class47 field1553;

    @OriginalMember(owner = "client!j", name = "gd", descriptor = "Lhc;")
    public class52 field1528;

    @OriginalMember(owner = "client!j", name = "nd", descriptor = "Lmb;")
    public class84 field1535;

    @OriginalMember(owner = "client!j", name = "vd", descriptor = "[I")
    public static int[] field1543;

    @OriginalMember(owner = "client!j", name = "yd", descriptor = "[Lia;")
    public static class57[] field1546;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lhb;B)V")
    public final void method568(class51 arg0, byte arg1) {
        ++field1542;
        arg0.field1128 = 0;
        int var3 = arg0.method373(25094);
        this.field1522 = arg0.method412((byte) -84);
        this.field1527 = arg0.method412((byte) -84);
        this.field1526 = 0;
        int var4 = -1;
        int[] var5 = new int[12];
        for (int var6 = 0; var6 < 12; ++var6) {
            int var7 = arg0.method373(25094);
            if (var7 == 0) {
                var5[var6] = 0;
            } else {
                int var8 = arg0.method373(25094);
                var5[var6] = (var7 << 8) + var8;
                if (~var6 == -1 && var5[0] == 65535) {
                    var4 = arg0.method383(-2056200760);
                    break;
                }
                if (~var5[var6] <= -513) {
                    int var12 = class98.method813(-1, var5[var6] + -512).field264;
                    if (~var12 != -1) {
                        this.field1526 = var12;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; ++var10) {
            int var11 = arg0.method373(25094);
            if (var11 < 0 || ~var11 <= ~class109.field2635[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        super.field3546 = arg0.method383(-2056200760);
        if (super.field3546 == 65535) {
            super.field3546 = -1;
        }
        super.field3530 = arg0.method383(-2056200760);
        if (super.field3530 == 65535) {
            super.field3530 = -1;
        }
        super.field3531 = super.field3530;
        super.field3557 = arg0.method383(-2056200760);
        if (super.field3557 == 65535) {
            super.field3557 = -1;
        }
        super.field3539 = arg0.method383(-2056200760);
        if (super.field3539 == 65535) {
            super.field3539 = -1;
        }
        super.field3485 = arg0.method383(-2056200760);
        if (~super.field3485 == -65536) {
            super.field3485 = -1;
        }
        super.field3559 = arg0.method383(-2056200760);
        if (super.field3559 == 65535) {
            super.field3559 = -1;
        }
        super.field3526 = arg0.method383(-2056200760);
        if (arg1 > -3) {
            this.field1530 = -80;
        }
        if (super.field3526 == 65535) {
            super.field3526 = -1;
        }
        this.field1535 = class15.method91(-20821, arg0.method401(true)).method704(-93);
        this.field1517 = arg0.method373(25094);
        this.field1534 = arg0.method383(-2056200760);
        if (this.field1528 == null) {
            this.field1528 = new class52();
        }
        this.field1528.method432(var5, var4, var9, 122, ~var3 == -2);
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "(B)Z")
    public final boolean method569(byte arg0) {
        ++field1529;
        if (this.field1528 == null) {
            return false;
        } else {
            if (arg0 >= -22) {
                this.method568((class51) null, (byte) -15);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!j", name = "e", descriptor = "(B)V")
    public static void method570(byte arg0) {
        field1545 = null;
        field1543 = null;
        field1548 = null;
        field1551 = null;
        field1546 = null;
        field1553 = null;
        int var1 = -28 / ((arg0 - -23) / 48);
        field1536 = null;
        field1540 = null;
        field1547 = null;
    }

    @OriginalMember(owner = "client!j", name = "g", descriptor = "(I)Ldd;")
    public final class26 method89(int arg0) {
        ++field1533;
        if (this.field1528 == null) {
            return null;
        } else {
            class70 var2 = super.field3558 != -1 && super.field3497 == 0 ? class79.method673(super.field3558, false) : null;
            class70 var3 = ~super.field3537 == 0 || this.field1524 || super.field3546 == super.field3537 && var2 != null ? null : class79.method673(super.field3537, false);
            class26 var4 = this.field1528.method429(super.field3538, super.field3545, var2, var3, (byte) -116);
            if (var4 == null) {
                return null;
            } else {
                var4.method175();
                super.field3552 = var4.field1668;
                if (!this.field1524 && super.field3556 != -1 && ~super.field3532 != 0) {
                    class26 var5 = class109.method894(super.field3556, (byte) 123).method1059(0, super.field3532);
                    if (var5 != null) {
                        var5.method178(0, -super.field3553, 0);
                        class26[] var6 = new class26[] { var4, var5 };
                        var4 = new class26(var6, 2);
                    }
                }
                if (!this.field1524 && this.field1537 != null) {
                    if (class5.field100 >= this.field1538) {
                        this.field1537 = null;
                    }
                    if (~class5.field100 <= ~this.field1520 && ~class5.field100 > ~this.field1538) {
                        class26 var7 = this.field1537;
                        var7.method178(this.field1518 - super.field3549, -this.field1521 + this.field1539, -super.field3535 + this.field1530);
                        if (~super.field3505 == -513) {
                            var7.method184();
                            var7.method184();
                            var7.method184();
                        } else if (super.field3505 == 1024) {
                            var7.method184();
                            var7.method184();
                        } else if (~super.field3505 == -1537) {
                            var7.method184();
                        }
                        class26[] var8 = new class26[] { var4, var7 };
                        var4 = new class26(var8, 2);
                        if (~super.field3505 == -513) {
                            var7.method184();
                        } else if (~super.field3505 != -1025) {
                            if (super.field3505 == 1536) {
                                var7.method184();
                                var7.method184();
                                var7.method184();
                            }
                        } else {
                            var7.method184();
                            var7.method184();
                        }
                        var7.method178(-this.field1518 + super.field3549, -this.field1539 + this.field1521, -this.field1530 + super.field3535);
                    }
                }
                if (arg0 != -6767) {
                    this.method568((class51) null, (byte) -111);
                }
                var4.field592 = true;
                return var4;
            }
        }
    }
}
