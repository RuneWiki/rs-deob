import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public class class482 extends class681 {

    @OriginalMember(owner = "client!eu", name = "q", descriptor = "Z")
    public boolean field6543 = false;

    @OriginalMember(owner = "client!eu", name = "k", descriptor = "I")
    private int field6537 = 0;

    @OriginalMember(owner = "client!eu", name = "w", descriptor = "Ldi;")
    public class129 field6549 = new class129();

    @OriginalMember(owner = "client!eu", name = "z", descriptor = "Ldi;")
    private class129 field6552 = new class129();

    @OriginalMember(owner = "client!eu", name = "E", descriptor = "Z")
    private boolean field6557 = false;

    @OriginalMember(owner = "client!eu", name = "p", descriptor = "Lqi;")
    public class569 field6542;

    @OriginalMember(owner = "client!eu", name = "n", descriptor = "Lod;")
    public class509 field6540;

    @OriginalMember(owner = "client!eu", name = "u", descriptor = "J")
    private long field6547;

    @OriginalMember(owner = "client!eu", name = "x", descriptor = "Lbm;")
    public class115 field6550;

    @OriginalMember(owner = "client!eu", name = "l", descriptor = "Lan;")
    public class23 field6538;

    @OriginalMember(owner = "client!eu", name = "m", descriptor = "Ljava/lang/String;")
    public static String field6539 = "";

    @OriginalMember(owner = "client!eu", name = "v", descriptor = "I")
    public static int field6548 = 765;

    @OriginalMember(owner = "client!eu", name = "y", descriptor = "[I")
    public static int[] field6551 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!eu", name = "t", descriptor = "Lfh;")
    public static class653 field6546 = new class653();

    @OriginalMember(owner = "client!eu", name = "o", descriptor = "I")
    public int field6541;

    @OriginalMember(owner = "client!eu", name = "r", descriptor = "I")
    public static int field6544;

    @OriginalMember(owner = "client!eu", name = "s", descriptor = "I")
    public static int field6545;

    @OriginalMember(owner = "client!eu", name = "A", descriptor = "I")
    public static int field6553;

    @OriginalMember(owner = "client!eu", name = "B", descriptor = "I")
    private int field6554;

    @OriginalMember(owner = "client!eu", name = "C", descriptor = "I")
    private int field6555;

    @OriginalMember(owner = "client!eu", name = "D", descriptor = "I")
    public static int field6556;

    @OriginalMember(owner = "client!eu", name = "F", descriptor = "I")
    private int field6558;

    @OriginalMember(owner = "client!eu", name = "G", descriptor = "I")
    private int field6559;

    @OriginalMember(owner = "client!eu", name = "H", descriptor = "I")
    private int field6560;

    @OriginalMember(owner = "client!eu", name = "J", descriptor = "I")
    private int field6561;

    @OriginalMember(owner = "client!eu", name = "K", descriptor = "I")
    private int field6562;

    @OriginalMember(owner = "client!eu", name = "L", descriptor = "Lnd;")
    public static class547 field6563;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(Lha;IJZI)V", line = 15)
    public final void method2769(class60 arg0, int arg1, long arg2, boolean arg3, int arg4) {
        field6544++;
        if (this.field6543) {
            arg3 = false;
        } else if (class705.field9772 < this.field6550.field1688) {
            arg3 = false;
        } else if (class708.field9836 > class659.field9185[class705.field9772]) {
            arg3 = false;
        } else if (this.field6557) {
            arg3 = false;
        } else if (this.field6550.field1646 != -1) {
            int var7 = (int) (arg2 - this.field6547);
            if (this.field6550.field1647 || this.field6550.field1646 >= var7) {
                var7 %= this.field6550.field1646;
            } else {
                arg3 = false;
            }
            if (!this.field6550.field1648 && var7 < this.field6550.field1657) {
                arg3 = false;
            }
            if (this.field6550.field1648 && this.field6550.field1657 <= var7) {
                arg3 = false;
            }
        }
        if (arg3) {
            class63.field879++;
            int var8 = (this.field6549.field1825 + this.field6549.field1826 + this.field6549.field1821) / 3;
            int var9 = (this.field6549.field1824 - (-this.field6549.field1835 - this.field6549.field1827)) / 3;
            int var10 = (this.field6549.field1828 + this.field6549.field1833 + this.field6549.field1832) / 3;
            if (this.field6549.field1823 != var8 || this.field6549.field1830 != var9 || this.field6549.field1829 != var10) {
                this.field6549.field1829 = var10;
                this.field6549.field1830 = var9;
                this.field6549.field1823 = var8;
                int var11 = this.field6549.field1821 - this.field6549.field1825;
                int var12 = this.field6549.field1827 - this.field6549.field1824;
                int var13 = this.field6549.field1832 - this.field6549.field1828;
                int var14 = this.field6549.field1826 - this.field6549.field1825;
                int var15 = this.field6549.field1835 - this.field6549.field1824;
                int var16 = this.field6549.field1833 - this.field6549.field1828;
                this.field6559 = var11 * var15 - var12 * var14;
                this.field6555 = var13 * var14 - (var11 * var16);
                this.field6554 = var12 * var16 - var13 * var15;
                while (true) {
                    if (this.field6554 <= 32767 && this.field6555 <= 32767 && this.field6559 <= 32767 && this.field6554 >= -32767 && this.field6555 >= -32767 && this.field6559 >= -32767) {
                        int var17 = (int) Math.sqrt((double) (this.field6554 * this.field6554 + (this.field6555 * this.field6555 + (this.field6559 * this.field6559))));
                        if (var17 <= 0) {
                            var17 = 1;
                        }
                        this.field6559 = this.field6559 * 32767 / var17;
                        this.field6554 = this.field6554 * 32767 / var17;
                        this.field6555 = this.field6555 * 32767 / var17;
                        if (this.field6550.field1697 > 0 || this.field6550.field1649 > 0) {
                            int var18 = (int) (Math.atan2((double) this.field6559, (double) this.field6554) * 2607.5945876176133D);
                            int var19 = (int) (Math.atan2((double) this.field6555, Math.sqrt((double) (this.field6559 * this.field6559 + this.field6554 * this.field6554))) * 2607.5945876176133D);
                            this.field6562 = this.field6550.field1697 - this.field6550.field1680;
                            this.field6558 = var18 + this.field6550.field1680 - (this.field6562 >> 1);
                            this.field6561 = this.field6550.field1649 - this.field6550.field1664;
                            this.field6560 = var19 + this.field6550.field1664 - (this.field6561 >> 1);
                        }
                        break;
                    }
                    this.field6555 >>= 0x1;
                    this.field6559 >>= 0x1;
                    this.field6554 >>= 0x1;
                }
            }
            this.field6537 += (int) ((Math.random() * (double) (this.field6550.field1640 - this.field6550.field1702) + (double) this.field6550.field1702) * (double) arg1);
            if (this.field6537 > 63) {
                int var20 = this.field6537 >> 6;
                this.field6537 &= 0x3F;
                for (int var21 = 0; var21 < var20; var21++) {
                    int var22;
                    int var23;
                    int var24;
                    if (this.field6550.field1697 <= 0 && this.field6550.field1649 <= 0) {
                        var22 = this.field6559;
                        var23 = this.field6554;
                        var24 = this.field6555;
                    } else {
                        int var25 = (int) (Math.random() * (double) this.field6562) + this.field6558;
                        int var26 = var25 & 0x3FFF;
                        int var27 = class16.field320[var26];
                        int var28 = class16.field322[var26];
                        int var29 = (int) ((double) this.field6561 * Math.random()) + this.field6560;
                        int var30 = var29 & 0x1FFF;
                        int var31 = class16.field320[var30];
                        int var32 = class16.field322[var30];
                        byte var33 = 13;
                        var23 = var28 * var31 >> var33;
                        var24 = (var32 << 1) * -1;
                        var22 = var27 * var31 >> var33;
                    }
                    float var34 = (float) Math.random();
                    float var35 = (float) Math.random();
                    if (var34 + var35 > 1.0F) {
                        var34 = 1.0F - var34;
                        var35 = 1.0F - var35;
                    }
                    float var36 = 1.0F - var35 - var34;
                    int var37 = (int) ((float) this.field6549.field1826 * var36 + (float) this.field6549.field1825 * var34 + (float) this.field6549.field1821 * var35);
                    int var38 = (int) ((float) this.field6549.field1835 * var36 + (float) this.field6549.field1827 * var35 + (float) this.field6549.field1824 * var34);
                    int var39 = (int) ((float) this.field6549.field1833 * var36 + (float) this.field6549.field1832 * var35 + (float) this.field6549.field1828 * var34);
                    int var40 = (int) ((float) this.field6552.field1826 * var36 + (float) this.field6552.field1825 * var34 + (float) this.field6552.field1821 * var35);
                    int var41 = (int) ((float) this.field6552.field1835 * var36 + (float) this.field6552.field1827 * var35 + (float) this.field6552.field1824 * var34);
                    int var42 = (int) ((float) this.field6552.field1833 * var36 + (float) this.field6552.field1832 * var35 + (float) this.field6552.field1828 * var34);
                    int var43 = var37 - var40;
                    int var44 = var38 - var41;
                    int var45 = var39 - var42;
                    int var46 = (int) ((double) var43 * Math.random() + (double) var40);
                    int var47 = (int) ((double) var44 * Math.random() + (double) var41);
                    int var48 = (int) ((double) var42 + (double) var45 * Math.random());
                    int var49 = this.field6550.field1686 + ((int) ((double) (this.field6550.field1643 - this.field6550.field1686) * Math.random()));
                    int var50 = this.field6550.field1656 + (int) (Math.random() * (double) (this.field6550.field1700 - this.field6550.field1656));
                    int var51 = this.field6550.field1687 + ((int) ((double) (this.field6550.field1678 - this.field6550.field1687) * Math.random()));
                    int var52;
                    if (this.field6550.field1711) {
                        double var53 = Math.random();
                        var52 = (int) ((double) this.field6550.field1668 + Math.random() * (double) this.field6550.field1679) << 24 | (int) ((double) this.field6550.field1661 * var53 + (double) this.field6550.field1669) << 8 | (int) ((double) this.field6550.field1705 * var53 + (double) this.field6550.field1682) << 16 | (int) ((double) this.field6550.field1658 * var53 + (double) this.field6550.field1675);
                    } else {
                        var52 = (int) ((double) this.field6550.field1679 * Math.random() + (double) this.field6550.field1668) << 24 | (int) ((double) this.field6550.field1669 + (double) this.field6550.field1661 * Math.random()) << 8 | (int) (Math.random() * (double) this.field6550.field1705 + (double) this.field6550.field1682) << 16 | (int) ((double) this.field6550.field1675 + Math.random() * (double) this.field6550.field1658);
                    }
                    int var55 = this.field6550.field1671;
                    if (!arg0.method517() && !this.field6550.field1701) {
                        var55 = -1;
                    }
                    if (class162.field2230 == class140.field1996) {
                        new class191(this, var46, var47, var48, var23, var24, var22, var49, var50, var52, var51, var55, this.field6550.field1642, this.field6550.field1710);
                    } else {
                        class191 var57 = class676.field9443[class140.field1996];
                        class140.field1996 = class140.field1996 + 1 & 0x3FF;
                        var57.method1282(this, var46, var47, var48, var23, var24, var22, var49, var50, var52, var51, var55, this.field6550.field1642, this.field6550.field1710);
                    }
                }
            }
        }
        if (!this.field6549.method963(this.field6552, (byte) -114)) {
            class129 var58 = this.field6552;
            this.field6552 = this.field6549;
            this.field6549 = var58;
            this.field6549.field1827 = this.field6542.field8015;
            this.field6549.field1825 = this.field6542.field8014;
            this.field6549.field1833 = this.field6542.field8007;
            this.field6549.field1826 = this.field6542.field8018;
            this.field6549.field1823 = this.field6552.field1823;
            this.field6549.field1832 = this.field6542.field8003;
            this.field6549.field1830 = this.field6552.field1830;
            this.field6549.field1821 = this.field6542.field8020;
            this.field6549.field1835 = this.field6542.field8019;
            this.field6549.field1829 = this.field6552.field1829;
            this.field6549.field1828 = this.field6542.field8012;
            this.field6549.field1824 = this.field6542.field8013;
        }
        this.field6541 = 0;
        for (class191 var59 = (class191) this.field6538.method162(-22305); var59 != null; var59 = (class191) this.field6538.method158(false)) {
            var59.method1284(arg2, arg1);
            this.field6541++;
        }
        if (arg4 != 30349) {
            method2772(64);
        }
        class97.field1356 += this.field6541;
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(I)V", line = 275)
    public static void method2770(int arg0) {
        field6546 = null;
        if (arg0 != 11414) {
            method2772(-87);
        }
        field6563 = null;
        field6539 = null;
        field6551 = null;
    }

    @OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(Lha;Lqi;Lod;J)V", line = 397)
    public class482(class60 arg0, class569 arg1, class509 arg2, long arg3) {
        this.field6542 = arg1;
        this.field6540 = arg2;
        this.field6547 = arg3;
        this.field6550 = this.field6542.method3265((byte) -26);
        if (!arg0.method517() && this.field6550.field1666 != -1) {
            this.field6550 = class556.method3212(0, this.field6550.field1666);
        }
        this.field6538 = new class23();
        this.field6537 = (int) ((double) this.field6537 + Math.random() * 64.0D);
        this.method2773(-1);
        this.field6552.field1826 = this.field6549.field1826;
        this.field6552.field1835 = this.field6549.field1835;
        this.field6552.field1827 = this.field6549.field1827;
        this.field6552.field1832 = this.field6549.field1832;
        this.field6552.field1825 = this.field6549.field1825;
        this.field6552.field1821 = this.field6549.field1821;
        this.field6552.field1833 = this.field6549.field1833;
        this.field6552.field1824 = this.field6549.field1824;
        this.field6552.field1828 = this.field6549.field1828;
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(Lha;JB)V", line = 299)
    public final void method2771(class60 arg0, long arg1, byte arg2) {
        field6556++;
        if (arg2 >= -71) {
            field6551 = null;
        }
        for (class191 var5 = (class191) this.field6538.method162(-22305); var5 != null; var5 = (class191) this.field6538.method158(false)) {
            var5.method1281(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "(I)I", line = 319)
    public static final int method2772(int arg0) {
        if (arg0 == -1630236671) {
            field6545++;
            return class705.field9772;
        } else {
            return 53;
        }
    }

    @OriginalMember(owner = "client!eu", name = "e", descriptor = "(I)V", line = 350)
    public final void method2773(int arg0) {
        this.field6549.field1835 = this.field6542.field8019;
        this.field6549.field1821 = this.field6542.field8020;
        this.field6549.field1828 = this.field6542.field8012;
        this.field6549.field1826 = this.field6542.field8018;
        this.field6549.field1833 = this.field6542.field8007;
        this.field6549.field1824 = this.field6542.field8013;
        this.field6549.field1832 = this.field6542.field8003;
        this.field6549.field1825 = this.field6542.field8014;
        field6553++;
        if (arg0 != -1) {
            return;
        }
        this.field6549.field1827 = this.field6542.field8015;
        if (this.field6549.field1825 == this.field6549.field1821 && this.field6549.field1826 == this.field6549.field1821 && this.field6549.field1827 == this.field6549.field1824 && this.field6549.field1835 == this.field6549.field1827 && this.field6549.field1832 == this.field6549.field1828 && this.field6549.field1833 == this.field6549.field1832) {
            this.field6557 = true;
        } else if (this.field6557) {
            this.field6552.field1833 = this.field6549.field1833;
            this.field6552.field1827 = this.field6549.field1827;
            this.field6557 = false;
            this.field6552.field1821 = this.field6549.field1821;
            this.field6552.field1824 = this.field6549.field1824;
            this.field6552.field1828 = this.field6549.field1828;
            this.field6552.field1826 = this.field6549.field1826;
            this.field6552.field1825 = this.field6549.field1825;
            this.field6552.field1832 = this.field6549.field1832;
            this.field6552.field1835 = this.field6549.field1835;
        }
    }
}
