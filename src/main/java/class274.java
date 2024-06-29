import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public class class274 extends class50 {

    @OriginalMember(owner = "client!ss", name = "h", descriptor = "I")
    private int field3568 = 0;

    @OriginalMember(owner = "client!ss", name = "i", descriptor = "Z")
    public boolean field3569 = false;

    @OriginalMember(owner = "client!ss", name = "m", descriptor = "Lur;")
    public class331 field3573 = new class331();

    @OriginalMember(owner = "client!ss", name = "s", descriptor = "Lur;")
    private class331 field3579 = new class331();

    @OriginalMember(owner = "client!ss", name = "u", descriptor = "Z")
    private boolean field3581 = false;

    @OriginalMember(owner = "client!ss", name = "k", descriptor = "Lrca;")
    public class30 field3571;

    @OriginalMember(owner = "client!ss", name = "r", descriptor = "J")
    private long field3578;

    @OriginalMember(owner = "client!ss", name = "l", descriptor = "Lkv;")
    public class16 field3572;

    @OriginalMember(owner = "client!ss", name = "p", descriptor = "Lth;")
    public class112 field3576;

    @OriginalMember(owner = "client!ss", name = "o", descriptor = "Lmb;")
    public class383 field3575;

    @OriginalMember(owner = "client!ss", name = "t", descriptor = "Liba;")
    public static class211 field3580 = new class211(9, 3);

    @OriginalMember(owner = "client!ss", name = "g", descriptor = "I")
    public static int field3567;

    @OriginalMember(owner = "client!ss", name = "j", descriptor = "I")
    public int field3570;

    @OriginalMember(owner = "client!ss", name = "n", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!ss", name = "q", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!ss", name = "v", descriptor = "I")
    private int field3582;

    @OriginalMember(owner = "client!ss", name = "w", descriptor = "I")
    private int field3583;

    @OriginalMember(owner = "client!ss", name = "x", descriptor = "I")
    private int field3584;

    @OriginalMember(owner = "client!ss", name = "y", descriptor = "I")
    private int field3585;

    @OriginalMember(owner = "client!ss", name = "z", descriptor = "I")
    private int field3586;

    @OriginalMember(owner = "client!ss", name = "A", descriptor = "I")
    private int field3587;

    @OriginalMember(owner = "client!ss", name = "C", descriptor = "I")
    private int field3589;

    @OriginalMember(owner = "client!ss", name = "B", descriptor = "Lbo;")
    public static class28 field3588;

    @OriginalMember(owner = "client!ss", name = "D", descriptor = "Lrs;")
    public static class649 field3590;

    @OriginalMember(owner = "client!ss", name = "E", descriptor = "[S")
    public static short[] field3591;

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "(Z)V")
    public static void method1629(boolean arg0) {
        if (!arg0) {
            field3591 = null;
            field3580 = null;
            field3588 = null;
            field3590 = null;
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lr;IJ)V")
    public final void method1630(class98 arg0, int arg1, long arg2) {
        field3577++;
        if (arg1 != -1) {
            method1629(true);
        }
        for (class292 var5 = (class292) this.field3575.method2370(-26173); var5 != null; var5 = (class292) this.field3575.method2369((byte) 125)) {
            var5.method1798(arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(ZJILr;I)V")
    public final void method1631(boolean arg0, long arg1, int arg2, class98 arg3, int arg4) {
        field3567++;
        if (this.field3569) {
            arg0 = false;
        } else if (class311.field4571 < this.field3576.field1690) {
            arg0 = false;
        } else if (class309.field4553[class311.field4571] < class557.field8185) {
            arg0 = false;
        } else if (this.field3581) {
            arg0 = false;
        } else if (this.field3576.field1665 != -1) {
            int var7 = (int) (arg1 - this.field3578);
            if (this.field3576.field1648 || this.field3576.field1665 >= var7) {
                var7 %= this.field3576.field1665;
            } else {
                arg0 = false;
            }
            if (!this.field3576.field1659 && var7 < this.field3576.field1705) {
                arg0 = false;
            }
            if (this.field3576.field1659 && var7 >= this.field3576.field1705) {
                arg0 = false;
            }
        }
        if (arg0) {
            class299.field4394++;
            int var8 = (this.field3573.field4820 + this.field3573.field4809 + this.field3573.field4808) / 3;
            int var9 = (this.field3573.field4815 + this.field3573.field4814 + this.field3573.field4817) / 3;
            int var10 = (this.field3573.field4819 + this.field3573.field4811 + this.field3573.field4816) / 3;
            if (this.field3573.field4807 != var8 || this.field3573.field4813 != var9 || this.field3573.field4812 != var10) {
                this.field3573.field4812 = var10;
                this.field3573.field4807 = var8;
                this.field3573.field4813 = var9;
                int var11 = this.field3573.field4820 - this.field3573.field4809;
                int var12 = this.field3573.field4815 - this.field3573.field4814;
                int var13 = this.field3573.field4811 - this.field3573.field4819;
                int var14 = this.field3573.field4808 - this.field3573.field4809;
                int var15 = this.field3573.field4817 - this.field3573.field4814;
                int var16 = this.field3573.field4816 - this.field3573.field4819;
                this.field3589 = var13 * var14 - var11 * var16;
                this.field3583 = var11 * var15 - (var12 * var14);
                this.field3584 = var12 * var16 - (var13 * var15);
                while (true) {
                    if (this.field3584 <= 32767 && this.field3589 <= 32767 && this.field3583 <= 32767 && this.field3584 >= -32767 && this.field3589 >= -32767 && this.field3583 >= -32767) {
                        int var17 = (int) Math.sqrt((double) (this.field3583 * this.field3583 + this.field3589 * this.field3589 + this.field3584 * this.field3584));
                        if (var17 <= 0) {
                            var17 = 1;
                        }
                        this.field3589 = this.field3589 * 32767 / var17;
                        this.field3584 = this.field3584 * 32767 / var17;
                        this.field3583 = this.field3583 * 32767 / var17;
                        if (this.field3576.field1696 > 0 || this.field3576.field1706 > 0) {
                            int var18 = (int) (Math.atan2((double) this.field3583, (double) this.field3584) * 2607.5945876176133D);
                            int var19 = (int) (Math.atan2((double) this.field3589, Math.sqrt((double) (this.field3584 * this.field3584 + this.field3583 * this.field3583))) * 2607.5945876176133D);
                            this.field3587 = this.field3576.field1696 - this.field3576.field1673;
                            this.field3586 = this.field3576.field1706 - this.field3576.field1694;
                            this.field3585 = var18 + this.field3576.field1673 - (this.field3587 >> 1);
                            this.field3582 = var19 + this.field3576.field1694 - (this.field3586 >> 1);
                        }
                        break;
                    }
                    this.field3589 >>= 0x1;
                    this.field3584 >>= 0x1;
                    this.field3583 >>= 0x1;
                }
            }
            this.field3568 += (int) ((Math.random() * (double) (this.field3576.field1677 - this.field3576.field1700) + (double) this.field3576.field1700) * (double) arg2);
            if (this.field3568 > 63) {
                int var20 = this.field3568 >> 6;
                this.field3568 &= 0x3F;
                for (int var21 = 0; var21 < var20; var21++) {
                    int var22;
                    int var23;
                    int var24;
                    if (this.field3576.field1696 <= 0 && this.field3576.field1706 <= 0) {
                        var22 = this.field3584;
                        var23 = this.field3589;
                        var24 = this.field3583;
                    } else {
                        int var25 = this.field3585 + ((int) ((double) this.field3587 * Math.random()));
                        int var26 = var25 & 0x3FFF;
                        int var27 = class271.field3549[var26];
                        int var28 = class271.field3544[var26];
                        int var29 = (int) ((double) this.field3586 * Math.random()) + this.field3582;
                        int var30 = var29 & 0x1FFF;
                        int var31 = class271.field3549[var30];
                        int var32 = class271.field3544[var30];
                        byte var33 = 13;
                        var22 = var28 * var31 >> var33;
                        var23 = (var32 << 1) * -1;
                        var24 = var27 * var31 >> var33;
                    }
                    float var34 = (float) Math.random();
                    float var35 = (float) Math.random();
                    if (var34 + var35 > 1.0F) {
                        var34 = 1.0F - var34;
                        var35 = 1.0F - var35;
                    }
                    float var36 = 1.0F - (var34 + var35);
                    int var37 = (int) ((float) this.field3573.field4808 * var36 + (float) this.field3573.field4820 * var35 + (float) this.field3573.field4809 * var34);
                    int var38 = (int) ((float) this.field3573.field4817 * var36 + (float) this.field3573.field4815 * var35 + (float) this.field3573.field4814 * var34);
                    int var39 = (int) ((float) this.field3573.field4816 * var36 + (float) this.field3573.field4819 * var34 + (float) this.field3573.field4811 * var35);
                    int var40 = (int) ((float) this.field3579.field4808 * var36 + (float) this.field3579.field4820 * var35 + (float) this.field3579.field4809 * var34);
                    int var41 = (int) ((float) this.field3579.field4817 * var36 + (float) this.field3579.field4815 * var35 + (float) this.field3579.field4814 * var34);
                    int var42 = (int) ((float) this.field3579.field4816 * var36 + (float) this.field3579.field4819 * var34 + (float) this.field3579.field4811 * var35);
                    int var43 = var37 - var40;
                    int var44 = var38 - var41;
                    int var45 = var39 - var42;
                    int var46 = (int) ((double) var40 + (double) var43 * Math.random());
                    int var47 = (int) ((double) var41 + Math.random() * (double) var44);
                    int var48 = (int) ((double) var45 * Math.random() + (double) var42);
                    int var49 = (int) ((double) (this.field3576.field1687 - this.field3576.field1703) * Math.random()) + this.field3576.field1703;
                    int var50 = (int) ((double) (this.field3576.field1678 - this.field3576.field1713) * Math.random()) + this.field3576.field1713;
                    int var51 = (int) (Math.random() * (double) (this.field3576.field1686 - this.field3576.field1647)) + this.field3576.field1647;
                    int var54;
                    if (this.field3576.field1688) {
                        double var52 = Math.random();
                        var54 = (int) ((double) this.field3576.field1667 * Math.random() + (double) this.field3576.field1679) << 24 | (int) ((double) this.field3576.field1681 * var52 + (double) this.field3576.field1718) << 16 | (int) ((double) this.field3576.field1669 * var52 + (double) this.field3576.field1685) << 8 | (int) ((double) this.field3576.field1657 * var52 + (double) this.field3576.field1712);
                    } else {
                        var54 = (int) (Math.random() * (double) this.field3576.field1667 + (double) this.field3576.field1679) << 24 | (int) (Math.random() * (double) this.field3576.field1657 + (double) this.field3576.field1712) | (int) (Math.random() * (double) this.field3576.field1669 + (double) this.field3576.field1685) << 8 | (int) (Math.random() * (double) this.field3576.field1681 + (double) this.field3576.field1718) << 16;
                    }
                    int var55 = this.field3576.field1717;
                    if (!arg3.method645() && !this.field3576.field1698) {
                        var55 = -1;
                    }
                    if (class27.field474 == class259.field3356) {
                        new class292(this, var46, var47, var48, var22, var23, var24, var49, var50, var54, var51, var55, this.field3576.field1652, this.field3576.field1661);
                    } else {
                        class292 var57 = class91.field1384[class259.field3356];
                        class259.field3356 = class259.field3356 + 1 & 0x3FF;
                        var57.method1801(this, var46, var47, var48, var22, var23, var24, var49, var50, var54, var51, var55, this.field3576.field1652, this.field3576.field1661);
                    }
                }
            }
        }
        if (arg4 != 32767) {
            this.field3581 = false;
        }
        if (!this.field3573.method2040(this.field3579, true)) {
            class331 var58 = this.field3579;
            this.field3579 = this.field3573;
            this.field3573 = var58;
            this.field3573.field4819 = this.field3571.field524;
            this.field3573.field4820 = this.field3571.field525;
            this.field3573.field4811 = this.field3571.field523;
            this.field3573.field4817 = this.field3571.field505;
            this.field3573.field4815 = this.field3571.field522;
            this.field3573.field4808 = this.field3571.field510;
            this.field3573.field4814 = this.field3571.field517;
            this.field3573.field4809 = this.field3571.field512;
            this.field3573.field4816 = this.field3571.field519;
        }
        this.field3570 = 0;
        for (class292 var59 = (class292) this.field3575.method2370(arg4 - 58940); var59 != null; var59 = (class292) this.field3575.method2369((byte) -99)) {
            var59.method1800(arg1, arg2);
            this.field3570++;
        }
        class267.field3483 += this.field3570;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(B)V")
    public final void method1632(byte arg0) {
        field3574++;
        this.field3573.field4819 = this.field3571.field524;
        this.field3573.field4811 = this.field3571.field523;
        this.field3573.field4815 = this.field3571.field522;
        this.field3573.field4816 = this.field3571.field519;
        this.field3573.field4809 = this.field3571.field512;
        this.field3573.field4817 = this.field3571.field505;
        if (arg0 != 24) {
            return;
        }
        this.field3573.field4808 = this.field3571.field510;
        this.field3573.field4820 = this.field3571.field525;
        this.field3573.field4814 = this.field3571.field517;
        if (this.field3573.field4820 == this.field3573.field4809 && this.field3573.field4820 == this.field3573.field4808 && this.field3573.field4815 == this.field3573.field4814 && this.field3573.field4817 == this.field3573.field4815 && this.field3573.field4819 == this.field3573.field4811 && this.field3573.field4816 == this.field3573.field4811) {
            this.field3581 = true;
        } else if (this.field3581) {
            this.field3579.field4814 = this.field3573.field4814;
            this.field3579.field4815 = this.field3573.field4815;
            this.field3579.field4820 = this.field3573.field4820;
            this.field3581 = false;
            this.field3579.field4809 = this.field3573.field4809;
            this.field3579.field4819 = this.field3573.field4819;
            this.field3579.field4811 = this.field3573.field4811;
            this.field3579.field4808 = this.field3573.field4808;
            this.field3579.field4817 = this.field3573.field4817;
            this.field3579.field4816 = this.field3573.field4816;
        }
    }

    @OriginalMember(owner = "client!ss", name = "<init>", descriptor = "(Lr;Lrca;Lkv;J)V")
    public class274(class98 arg0, class30 arg1, class16 arg2, long arg3) {
        this.field3571 = arg1;
        this.field3578 = arg3;
        this.field3572 = arg2;
        this.field3576 = this.field3571.method191(9982);
        if (!arg0.method645() && this.field3576.field1683 != -1) {
            this.field3576 = class257.method1537((byte) 114, this.field3576.field1683);
        }
        this.field3575 = new class383();
        this.field3568 = (int) ((double) this.field3568 + Math.random() * 64.0D);
        this.method1632((byte) 24);
        this.field3579.field4820 = this.field3573.field4820;
        this.field3579.field4815 = this.field3573.field4815;
        this.field3579.field4811 = this.field3573.field4811;
        this.field3579.field4809 = this.field3573.field4809;
        this.field3579.field4817 = this.field3573.field4817;
        this.field3579.field4814 = this.field3573.field4814;
        this.field3579.field4819 = this.field3573.field4819;
        this.field3579.field4808 = this.field3573.field4808;
        this.field3579.field4816 = this.field3573.field4816;
    }
}
