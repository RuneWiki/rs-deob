import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class386 extends class638 {

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "Z")
    public boolean field5774 = false;

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "I")
    private int field5771 = 0;

    @OriginalMember(owner = "client!cg", name = "v", descriptor = "Lrba;")
    public class536 field5784 = new class536();

    @OriginalMember(owner = "client!cg", name = "w", descriptor = "Lrba;")
    private class536 field5785 = new class536();

    @OriginalMember(owner = "client!cg", name = "A", descriptor = "Z")
    private boolean field5789 = false;

    @OriginalMember(owner = "client!cg", name = "p", descriptor = "Lem;")
    public class627 field5778;

    @OriginalMember(owner = "client!cg", name = "s", descriptor = "J")
    private long field5781;

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "Lou;")
    public class157 field5776;

    @OriginalMember(owner = "client!cg", name = "q", descriptor = "Lvfa;")
    public class88 field5779;

    @OriginalMember(owner = "client!cg", name = "o", descriptor = "Lfa;")
    public class564 field5777;

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "Lri;")
    public static class342 field5775 = new class342();

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "I")
    public static int field5770;

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "I")
    public static int field5773;

    @OriginalMember(owner = "client!cg", name = "r", descriptor = "I")
    public int field5780;

    @OriginalMember(owner = "client!cg", name = "t", descriptor = "I")
    public static int field5782;

    @OriginalMember(owner = "client!cg", name = "u", descriptor = "I")
    public static int field5783;

    @OriginalMember(owner = "client!cg", name = "x", descriptor = "I")
    public static int field5786;

    @OriginalMember(owner = "client!cg", name = "y", descriptor = "I")
    private int field5787;

    @OriginalMember(owner = "client!cg", name = "z", descriptor = "I")
    private int field5788;

    @OriginalMember(owner = "client!cg", name = "B", descriptor = "I")
    private int field5790;

    @OriginalMember(owner = "client!cg", name = "C", descriptor = "I")
    private int field5791;

    @OriginalMember(owner = "client!cg", name = "D", descriptor = "I")
    private int field5792;

    @OriginalMember(owner = "client!cg", name = "F", descriptor = "I")
    private int field5793;

    @OriginalMember(owner = "client!cg", name = "G", descriptor = "I")
    private int field5794;

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "Lla;")
    public static class422 field5772;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)V")
    public static final void method2415(byte arg0) {
        field5773++;
        class564[] var1 = class472.field6858;
        synchronized (class472.field6858) {
            if (arg0 < 8) {
                field5782 = -45;
            }
            for (int var2 = 0; var2 < class472.field6858.length; var2++) {
                class472.field6858[var2] = new class564();
                class736.field10371[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(B)V")
    public static void method2416(byte arg0) {
        field5772 = null;
        if (arg0 >= -7) {
            field5772 = null;
        }
        field5775 = null;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lha;IJ)V")
    public final void method2417(class544 arg0, int arg1, long arg2) {
        class653 var5 = (class653) this.field5777.method3272(arg1 - 112);
        if (arg1 != -1) {
            method2416((byte) 43);
        }
        while (var5 != null) {
            var5.method3674(arg0, arg2);
            var5 = (class653) this.field5777.method3274(false);
        }
        field5770++;
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(B)V")
    public final void method2418(byte arg0) {
        this.field5784.field7683 = this.field5776.field2445;
        this.field5784.field7681 = this.field5776.field2435;
        this.field5784.field7689 = this.field5776.field2427;
        this.field5784.field7685 = this.field5776.field2436;
        this.field5784.field7675 = this.field5776.field2438;
        this.field5784.field7680 = this.field5776.field2430;
        if (arg0 <= 15) {
            return;
        }
        this.field5784.field7686 = this.field5776.field2443;
        field5786++;
        this.field5784.field7687 = this.field5776.field2431;
        this.field5784.field7682 = this.field5776.field2439;
        if (this.field5784.field7686 == this.field5784.field7675 && this.field5784.field7686 == this.field5784.field7682 && this.field5784.field7687 == this.field5784.field7681 && this.field5784.field7681 == this.field5784.field7680 && this.field5784.field7689 == this.field5784.field7683 && this.field5784.field7689 == this.field5784.field7685) {
            this.field5789 = true;
        } else if (this.field5789) {
            this.field5785.field7680 = this.field5784.field7680;
            this.field5785.field7675 = this.field5784.field7675;
            this.field5785.field7689 = this.field5784.field7689;
            this.field5785.field7682 = this.field5784.field7682;
            this.field5785.field7686 = this.field5784.field7686;
            this.field5785.field7681 = this.field5784.field7681;
            this.field5785.field7687 = this.field5784.field7687;
            this.field5789 = false;
            this.field5785.field7685 = this.field5784.field7685;
            this.field5785.field7683 = this.field5784.field7683;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZZLha;JI)V")
    public final void method2419(boolean arg0, boolean arg1, class544 arg2, long arg3, int arg4) {
        if (this.field5774) {
            arg0 = false;
        } else if (class630.field8864 < this.field5779.field1291) {
            arg0 = false;
        } else if (class634.field8916[class630.field8864] < class673.field9526) {
            arg0 = false;
        } else if (this.field5789) {
            arg0 = false;
        } else if (this.field5779.field1333 != -1) {
            int var7 = (int) (arg3 - this.field5781);
            if (this.field5779.field1350 || var7 <= this.field5779.field1333) {
                var7 %= this.field5779.field1333;
            } else {
                arg0 = false;
            }
            if (!this.field5779.field1293 && var7 < this.field5779.field1352) {
                arg0 = false;
            }
            if (this.field5779.field1293 && var7 >= this.field5779.field1352) {
                arg0 = false;
            }
        }
        field5783++;
        if (arg0) {
            class377.field5675++;
            int var8 = (this.field5784.field7682 + this.field5784.field7675 + this.field5784.field7686) / 3;
            int var9 = (this.field5784.field7687 + this.field5784.field7681 + this.field5784.field7680) / 3;
            int var10 = (this.field5784.field7685 + this.field5784.field7683 + this.field5784.field7689) / 3;
            if (this.field5784.field7674 != var8 || this.field5784.field7677 != var9 || this.field5784.field7679 != var10) {
                this.field5784.field7674 = var8;
                this.field5784.field7679 = var10;
                this.field5784.field7677 = var9;
                int var11 = this.field5784.field7686 - this.field5784.field7675;
                int var12 = this.field5784.field7681 - this.field5784.field7687;
                int var13 = this.field5784.field7689 - this.field5784.field7683;
                int var14 = this.field5784.field7682 - this.field5784.field7675;
                int var15 = this.field5784.field7680 - this.field5784.field7687;
                int var16 = this.field5784.field7685 - this.field5784.field7683;
                this.field5793 = var13 * var14 - var11 * var16;
                this.field5790 = var12 * var16 - (var13 * var15);
                this.field5791 = var11 * var15 - (var12 * var14);
                while (true) {
                    if (this.field5790 <= 32767 && this.field5793 <= 32767 && this.field5791 <= 32767 && this.field5790 >= -32767 && this.field5793 >= -32767 && this.field5791 >= -32767) {
                        int var17 = (int) Math.sqrt((double) (this.field5790 * this.field5790 + this.field5793 * this.field5793 + this.field5791 * this.field5791));
                        if (var17 <= 0) {
                            var17 = 1;
                        }
                        this.field5791 = this.field5791 * 32767 / var17;
                        this.field5790 = this.field5790 * 32767 / var17;
                        this.field5793 = this.field5793 * 32767 / var17;
                        if (this.field5779.field1298 > 0 || this.field5779.field1337 > 0) {
                            int var18 = (int) (Math.atan2((double) this.field5791, (double) this.field5790) * 2607.5945876176133D);
                            int var19 = (int) (Math.atan2((double) this.field5793, Math.sqrt((double) (this.field5791 * this.field5791 + this.field5790 * this.field5790))) * 2607.5945876176133D);
                            this.field5787 = this.field5779.field1298 - this.field5779.field1284;
                            this.field5792 = this.field5779.field1284 + var18 - (this.field5787 >> 1);
                            this.field5788 = this.field5779.field1337 - this.field5779.field1345;
                            this.field5794 = this.field5779.field1345 + var19 - (this.field5788 >> 1);
                        }
                        break;
                    }
                    this.field5791 >>= 0x1;
                    this.field5790 >>= 0x1;
                    this.field5793 >>= 0x1;
                }
            }
            this.field5771 += (int) ((double) arg4 * ((double) (this.field5779.field1331 - this.field5779.field1349) * Math.random() + (double) this.field5779.field1349));
            if (this.field5771 > 63) {
                int var20 = this.field5771 >> 6;
                this.field5771 &= 0x3F;
                for (int var21 = 0; var21 < var20; var21++) {
                    int var22;
                    int var23;
                    int var24;
                    if (this.field5779.field1298 <= 0 && this.field5779.field1337 <= 0) {
                        var22 = this.field5790;
                        var23 = this.field5793;
                        var24 = this.field5791;
                    } else {
                        int var25 = (int) ((double) this.field5787 * Math.random()) + this.field5792;
                        int var26 = var25 & 0x3FFF;
                        int var27 = class582.field8226[var26];
                        int var28 = class582.field8230[var26];
                        int var29 = (int) ((double) this.field5788 * Math.random()) + this.field5794;
                        int var30 = var29 & 0x1FFF;
                        int var31 = class582.field8226[var30];
                        int var32 = class582.field8230[var30];
                        byte var33 = 13;
                        var23 = (var32 << 1) * -1;
                        var22 = var28 * var31 >> var33;
                        var24 = var27 * var31 >> var33;
                    }
                    float var34 = (float) Math.random();
                    float var35 = (float) Math.random();
                    if (var34 + var35 > 1.0F) {
                        var34 = 1.0F - var34;
                        var35 = 1.0F - var35;
                    }
                    float var36 = 1.0F - var34 - var35;
                    int var37 = (int) ((float) this.field5784.field7682 * var36 + (float) this.field5784.field7686 * var35 + (float) this.field5784.field7675 * var34);
                    int var38 = (int) ((float) this.field5784.field7680 * var36 + (float) this.field5784.field7687 * var34 + (float) this.field5784.field7681 * var35);
                    int var39 = (int) ((float) this.field5784.field7685 * var36 + (float) this.field5784.field7689 * var35 + (float) this.field5784.field7683 * var34);
                    int var40 = (int) ((float) this.field5785.field7682 * var36 + (float) this.field5785.field7686 * var35 + (float) this.field5785.field7675 * var34);
                    int var41 = (int) ((float) this.field5785.field7680 * var36 + (float) this.field5785.field7687 * var34 + (float) this.field5785.field7681 * var35);
                    int var42 = (int) ((float) this.field5785.field7685 * var36 + (float) this.field5785.field7689 * var35 + (float) this.field5785.field7683 * var34);
                    int var43 = var37 - var40;
                    int var44 = var38 - var41;
                    int var45 = var39 - var42;
                    int var46 = (int) (Math.random() * (double) var43 + (double) var40);
                    int var47 = (int) ((double) var41 + Math.random() * (double) var44);
                    int var48 = (int) (Math.random() * (double) var45 + (double) var42);
                    int var49 = (int) ((double) (this.field5779.field1300 - this.field5779.field1302) * Math.random()) + this.field5779.field1302;
                    int var50 = this.field5779.field1296 + ((int) (Math.random() * (double) (this.field5779.field1330 - this.field5779.field1296)));
                    int var51 = this.field5779.field1336 + (int) ((double) (this.field5779.field1305 - this.field5779.field1336) * Math.random());
                    int var54;
                    if (this.field5779.field1317) {
                        double var52 = Math.random();
                        var54 = (int) ((double) this.field5779.field1306 * var52 + (double) this.field5779.field1288) | (int) ((double) this.field5779.field1334 * var52 + (double) this.field5779.field1313) << 16 | (int) ((double) this.field5779.field1353 * var52 + (double) this.field5779.field1355) << 8 | (int) (Math.random() * (double) this.field5779.field1341 + (double) this.field5779.field1307) << 24;
                    } else {
                        var54 = (int) ((double) this.field5779.field1288 + Math.random() * (double) this.field5779.field1306) | (int) ((double) this.field5779.field1353 * Math.random() + (double) this.field5779.field1355) << 8 | (int) ((double) this.field5779.field1313 + (double) this.field5779.field1334 * Math.random()) << 16 | (int) ((double) this.field5779.field1307 + Math.random() * (double) this.field5779.field1341) << 24;
                    }
                    int var55 = this.field5779.field1348;
                    if (!arg2.method254() && !this.field5779.field1301) {
                        var55 = -1;
                    }
                    if (class721.field10107 == class430.field6292) {
                        new class653(this, var46, var47, var48, var22, var23, var24, var49, var50, var54, var51, var55, this.field5779.field1325, this.field5779.field1343);
                    } else {
                        class653 var56 = class15.field154[class430.field6292];
                        class430.field6292 = class430.field6292 + 1 & 0x3FF;
                        var56.method3676(this, var46, var47, var48, var22, var23, var24, var49, var50, var54, var51, var55, this.field5779.field1325, this.field5779.field1343);
                    }
                }
            }
        }
        if (!this.field5784.method3156(this.field5785, 1000)) {
            class536 var58 = this.field5785;
            this.field5785 = this.field5784;
            this.field5784 = var58;
            this.field5784.field7681 = this.field5776.field2435;
            this.field5784.field7687 = this.field5776.field2431;
            this.field5784.field7686 = this.field5776.field2443;
            this.field5784.field7679 = this.field5785.field7679;
            this.field5784.field7677 = this.field5785.field7677;
            this.field5784.field7683 = this.field5776.field2445;
            this.field5784.field7680 = this.field5776.field2430;
            this.field5784.field7685 = this.field5776.field2436;
            this.field5784.field7689 = this.field5776.field2427;
            this.field5784.field7674 = this.field5785.field7674;
            this.field5784.field7675 = this.field5776.field2438;
            this.field5784.field7682 = this.field5776.field2439;
        }
        if (arg1) {
            method2416((byte) 35);
        }
        this.field5780 = 0;
        for (class653 var59 = (class653) this.field5777.method3272(-122); var59 != null; var59 = (class653) this.field5777.method3274(arg1)) {
            var59.method3673(arg3, arg4);
            this.field5780++;
        }
        class3.field17 += this.field5780;
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Lha;Lou;Lem;J)V")
    public class386(class544 arg0, class157 arg1, class627 arg2, long arg3) {
        this.field5778 = arg2;
        this.field5781 = arg3;
        this.field5776 = arg1;
        this.field5779 = this.field5776.method1176(1);
        if (!arg0.method254() && this.field5779.field1294 != -1) {
            this.field5779 = class31.method160(108, this.field5779.field1294);
        }
        this.field5777 = new class564();
        this.field5771 = (int) ((double) this.field5771 + Math.random() * 64.0D);
        this.method2418((byte) 61);
        this.field5785.field7683 = this.field5784.field7683;
        this.field5785.field7680 = this.field5784.field7680;
        this.field5785.field7682 = this.field5784.field7682;
        this.field5785.field7689 = this.field5784.field7689;
        this.field5785.field7681 = this.field5784.field7681;
        this.field5785.field7685 = this.field5784.field7685;
        this.field5785.field7686 = this.field5784.field7686;
        this.field5785.field7687 = this.field5784.field7687;
        this.field5785.field7675 = this.field5784.field7675;
    }
}
