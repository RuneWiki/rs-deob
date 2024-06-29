import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class131 extends class426 {

    @OriginalMember(owner = "client!wh", name = "r", descriptor = "I")
    private int field1664 = 0;

    @OriginalMember(owner = "client!wh", name = "q", descriptor = "Z")
    public boolean field1663 = false;

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "Lvb;")
    public class178 field1660 = new class178();

    @OriginalMember(owner = "client!wh", name = "C", descriptor = "Lvb;")
    private class178 field1675 = new class178();

    @OriginalMember(owner = "client!wh", name = "K", descriptor = "Z")
    private boolean field1683 = false;

    @OriginalMember(owner = "client!wh", name = "o", descriptor = "J")
    private long field1661;

    @OriginalMember(owner = "client!wh", name = "B", descriptor = "Lnba;")
    public class271 field1674;

    @OriginalMember(owner = "client!wh", name = "u", descriptor = "Lau;")
    public class684 field1667;

    @OriginalMember(owner = "client!wh", name = "y", descriptor = "Lkea;")
    public class216 field1671;

    @OriginalMember(owner = "client!wh", name = "w", descriptor = "Lhf;")
    public class363 field1669;

    @OriginalMember(owner = "client!wh", name = "x", descriptor = "Z")
    public static boolean field1670 = false;

    @OriginalMember(owner = "client!wh", name = "v", descriptor = "I")
    public static int field1668 = 0;

    @OriginalMember(owner = "client!wh", name = "p", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!wh", name = "s", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!wh", name = "t", descriptor = "I")
    public int field1666;

    @OriginalMember(owner = "client!wh", name = "z", descriptor = "I")
    public static int field1672;

    @OriginalMember(owner = "client!wh", name = "A", descriptor = "I")
    public static int field1673;

    @OriginalMember(owner = "client!wh", name = "D", descriptor = "I")
    private int field1676;

    @OriginalMember(owner = "client!wh", name = "E", descriptor = "I")
    private int field1677;

    @OriginalMember(owner = "client!wh", name = "F", descriptor = "I")
    private int field1678;

    @OriginalMember(owner = "client!wh", name = "G", descriptor = "I")
    private int field1679;

    @OriginalMember(owner = "client!wh", name = "H", descriptor = "I")
    private int field1680;

    @OriginalMember(owner = "client!wh", name = "I", descriptor = "I")
    private int field1681;

    @OriginalMember(owner = "client!wh", name = "J", descriptor = "I")
    private int field1682;

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lr;Lnba;Lau;J)V", line = 381)
    public class131(class165 arg0, class271 arg1, class684 arg2, long arg3) {
        this.field1661 = arg3;
        this.field1674 = arg1;
        this.field1667 = arg2;
        this.field1671 = this.field1674.method1630(120);
        if (!arg0.method226() && this.field1671.field2753 != -1) {
            this.field1671 = class203.method1234(this.field1671.field2753, -35);
        }
        this.field1669 = new class363();
        this.field1664 = (int) ((double) this.field1664 + Math.random() * 64.0D);
        this.method886(32605);
        this.field1675.field2185 = this.field1660.field2185;
        this.field1675.field2199 = this.field1660.field2199;
        this.field1675.field2193 = this.field1660.field2193;
        this.field1675.field2191 = this.field1660.field2191;
        this.field1675.field2186 = this.field1660.field2186;
        this.field1675.field2194 = this.field1660.field2194;
        this.field1675.field2184 = this.field1660.field2184;
        this.field1675.field2189 = this.field1660.field2189;
        this.field1675.field2192 = this.field1660.field2192;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(JLr;I)V", line = 22)
    public final void method884(long arg0, class165 arg1, int arg2) {
        field1665++;
        class572 var5 = (class572) this.field1669.method2070((byte) -113);
        if (arg2 != -1202531112) {
            this.field1661 = 79L;
        }
        while (var5 != null) {
            var5.method3348(arg1, arg0);
            var5 = (class572) this.field1669.method2068(-2001);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(BLjava/lang/String;)V", line = 47)
    public static final void method885(byte arg0, String arg1) {
        if (arg0 >= 86) {
            field1672++;
            System.out.println("Error: " + class234.method1426(-54, "%0a", arg1, "\n"));
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V", line = 61)
    public final void method886(int arg0) {
        this.field1660.field2194 = this.field1674.field3706;
        this.field1660.field2184 = this.field1674.field3701;
        this.field1660.field2199 = this.field1674.field3696;
        this.field1660.field2189 = this.field1674.field3716;
        field1673++;
        this.field1660.field2186 = this.field1674.field3707;
        this.field1660.field2191 = this.field1674.field3712;
        this.field1660.field2192 = this.field1674.field3709;
        if (arg0 != 32605) {
            this.field1671 = null;
        }
        this.field1660.field2193 = this.field1674.field3705;
        this.field1660.field2185 = this.field1674.field3710;
        if (this.field1660.field2192 == this.field1660.field2191 && this.field1660.field2191 == this.field1660.field2184 && this.field1660.field2189 == this.field1660.field2186 && this.field1660.field2189 == this.field1660.field2185 && this.field1660.field2194 == this.field1660.field2193 && this.field1660.field2199 == this.field1660.field2194) {
            this.field1683 = true;
        } else if (this.field1683) {
            this.field1675.field2193 = this.field1660.field2193;
            this.field1675.field2194 = this.field1660.field2194;
            this.field1675.field2199 = this.field1660.field2199;
            this.field1675.field2186 = this.field1660.field2186;
            this.field1675.field2184 = this.field1660.field2184;
            this.field1675.field2189 = this.field1660.field2189;
            this.field1675.field2192 = this.field1660.field2192;
            this.field1675.field2191 = this.field1660.field2191;
            this.field1675.field2185 = this.field1660.field2185;
            this.field1683 = false;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IJZLr;B)V", line = 101)
    public final void method887(int arg0, long arg1, boolean arg2, class165 arg3, byte arg4) {
        field1662++;
        if (this.field1663) {
            arg2 = false;
        } else if (this.field1671.field2763 > class561.field8107) {
            arg2 = false;
        } else if (class289.field3911[class561.field8107] < class265.field3639) {
            arg2 = false;
        } else if (this.field1683) {
            arg2 = false;
        } else if (this.field1671.field2777 != -1) {
            int var7 = (int) (arg1 - this.field1661);
            if (this.field1671.field2811 || this.field1671.field2777 >= var7) {
                var7 %= this.field1671.field2777;
            } else {
                arg2 = false;
            }
            if (!this.field1671.field2745 && var7 < this.field1671.field2793) {
                arg2 = false;
            }
            if (this.field1671.field2745 && var7 >= this.field1671.field2793) {
                arg2 = false;
            }
        }
        if (arg2) {
            class12.field206++;
            int var8 = (this.field1660.field2192 + this.field1660.field2191 + this.field1660.field2184) / 3;
            int var9 = (this.field1660.field2186 + this.field1660.field2189 + this.field1660.field2185) / 3;
            int var10 = (this.field1660.field2199 + this.field1660.field2194 + this.field1660.field2193) / 3;
            if (this.field1660.field2196 != var8 || this.field1660.field2188 != var9 || this.field1660.field2198 != var10) {
                this.field1660.field2198 = var10;
                this.field1660.field2188 = var9;
                this.field1660.field2196 = var8;
                int var11 = this.field1660.field2191 - this.field1660.field2192;
                int var12 = this.field1660.field2189 - this.field1660.field2186;
                int var13 = this.field1660.field2194 - this.field1660.field2193;
                int var14 = this.field1660.field2184 - this.field1660.field2192;
                int var15 = this.field1660.field2185 - this.field1660.field2186;
                int var16 = this.field1660.field2199 - this.field1660.field2193;
                this.field1681 = var12 * var16 - (var13 * var15);
                this.field1680 = var11 * var15 - (var12 * var14);
                this.field1679 = var13 * var14 - (var11 * var16);
                while (true) {
                    if (this.field1681 <= 32767 && this.field1679 <= 32767 && this.field1680 <= 32767 && this.field1681 >= -32767 && this.field1679 >= -32767 && this.field1680 >= -32767) {
                        int var17 = (int) Math.sqrt((double) (this.field1680 * this.field1680 + (this.field1681 * this.field1681 + (this.field1679 * this.field1679))));
                        if (var17 <= 0) {
                            var17 = 1;
                        }
                        this.field1679 = this.field1679 * 32767 / var17;
                        this.field1680 = this.field1680 * 32767 / var17;
                        this.field1681 = this.field1681 * 32767 / var17;
                        if (this.field1671.field2799 > 0 || this.field1671.field2771 > 0) {
                            int var18 = (int) (Math.atan2((double) this.field1680, (double) this.field1681) * 2607.5945876176133D);
                            int var19 = (int) (Math.atan2((double) this.field1679, Math.sqrt((double) (this.field1681 * this.field1681 + (this.field1680 * this.field1680)))) * 2607.5945876176133D);
                            this.field1676 = this.field1671.field2799 - this.field1671.field2775;
                            this.field1682 = var18 + this.field1671.field2775 - (this.field1676 >> 1);
                            this.field1678 = this.field1671.field2771 - this.field1671.field2773;
                            this.field1677 = this.field1671.field2773 + var19 - (this.field1678 >> 1);
                        }
                        break;
                    }
                    this.field1681 >>= 0x1;
                    this.field1680 >>= 0x1;
                    this.field1679 >>= 0x1;
                }
            }
            this.field1664 += (int) ((double) arg0 * (Math.random() * (double) (this.field1671.field2800 - this.field1671.field2767) + (double) this.field1671.field2767));
            if (this.field1664 > 63) {
                int var20 = this.field1664 >> 6;
                this.field1664 &= 0x3F;
                for (int var21 = 0; var21 < var20; var21++) {
                    int var22;
                    int var23;
                    int var24;
                    if (this.field1671.field2799 <= 0 && this.field1671.field2771 <= 0) {
                        var22 = this.field1681;
                        var23 = this.field1679;
                        var24 = this.field1680;
                    } else {
                        int var25 = this.field1682 + (int) (Math.random() * (double) this.field1676);
                        int var26 = var25 & 0x3FFF;
                        int var27 = class395.field5579[var26];
                        int var28 = class395.field5582[var26];
                        int var29 = this.field1677 + ((int) ((double) this.field1678 * Math.random()));
                        int var30 = var29 & 0x1FFF;
                        int var31 = class395.field5579[var30];
                        int var32 = class395.field5582[var30];
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
                    float var36 = 1.0F - (var34 + var35);
                    int var37 = (int) ((float) this.field1660.field2184 * var36 + (float) this.field1660.field2192 * var34 + (float) this.field1660.field2191 * var35);
                    int var38 = (int) ((float) this.field1660.field2185 * var36 + (float) this.field1660.field2189 * var35 + (float) this.field1660.field2186 * var34);
                    int var39 = (int) ((float) this.field1660.field2199 * var36 + (float) this.field1660.field2194 * var35 + (float) this.field1660.field2193 * var34);
                    int var40 = (int) ((float) this.field1675.field2184 * var36 + (float) this.field1675.field2192 * var34 + (float) this.field1675.field2191 * var35);
                    int var41 = (int) ((float) this.field1675.field2185 * var36 + (float) this.field1675.field2189 * var35 + (float) this.field1675.field2186 * var34);
                    int var42 = (int) ((float) this.field1675.field2199 * var36 + (float) this.field1675.field2194 * var35 + (float) this.field1675.field2193 * var34);
                    int var43 = var37 - var40;
                    int var44 = var38 - var41;
                    int var45 = var39 - var42;
                    int var46 = (int) (Math.random() * (double) var43 + (double) var40);
                    int var47 = (int) (Math.random() * (double) var44 + (double) var41);
                    int var48 = (int) ((double) var42 + (double) var45 * Math.random());
                    int var49 = this.field1671.field2774 + (int) ((double) (this.field1671.field2782 - this.field1671.field2774) * Math.random());
                    int var50 = this.field1671.field2746 + (int) (Math.random() * (double) (this.field1671.field2810 - this.field1671.field2746));
                    int var51 = (int) ((double) (this.field1671.field2769 - this.field1671.field2748) * Math.random()) + this.field1671.field2748;
                    int var54;
                    if (this.field1671.field2761) {
                        double var52 = Math.random();
                        var54 = (int) (Math.random() * (double) this.field1671.field2778 + (double) this.field1671.field2807) << 24 | (int) ((double) this.field1671.field2783 * var52 + (double) this.field1671.field2809) | (int) ((double) this.field1671.field2747 * var52 + (double) this.field1671.field2785) << 16 | (int) ((double) this.field1671.field2797 * var52 + (double) this.field1671.field2759) << 8;
                    } else {
                        var54 = (int) ((double) this.field1671.field2783 * Math.random() + (double) this.field1671.field2809) | (int) ((double) this.field1671.field2785 + (double) this.field1671.field2747 * Math.random()) << 16 | (int) ((double) this.field1671.field2759 + (double) this.field1671.field2797 * Math.random()) << 8 | (int) ((double) this.field1671.field2807 + Math.random() * (double) this.field1671.field2778) << 24;
                    }
                    int var55 = this.field1671.field2742;
                    if (!arg3.method226() && !this.field1671.field2754) {
                        var55 = -1;
                    }
                    if (class551.field8013 == class285.field3861) {
                        new class572(this, var46, var47, var48, var22, var23, var24, var49, var50, var54, var51, var55, this.field1671.field2779, this.field1671.field2781);
                    } else {
                        class572 var56 = class275.field3765[class285.field3861];
                        class285.field3861 = class285.field3861 + 1 & 0x3FF;
                        var56.method3349(this, var46, var47, var48, var22, var23, var24, var49, var50, var54, var51, var55, this.field1671.field2779, this.field1671.field2781);
                    }
                }
            }
        }
        if (!this.field1660.method1115(this.field1675, (byte) -99)) {
            class178 var58 = this.field1675;
            this.field1675 = this.field1660;
            this.field1660 = var58;
            this.field1660.field2194 = this.field1674.field3706;
            this.field1660.field2184 = this.field1674.field3701;
            this.field1660.field2193 = this.field1674.field3705;
            this.field1660.field2192 = this.field1674.field3709;
            this.field1660.field2185 = this.field1674.field3710;
            this.field1660.field2186 = this.field1674.field3707;
            this.field1660.field2191 = this.field1674.field3712;
            this.field1660.field2189 = this.field1674.field3716;
            this.field1660.field2199 = this.field1674.field3696;
        }
        this.field1666 = 0;
        int var59 = -46 / ((arg4 + 49) / 60);
        for (class572 var60 = (class572) this.field1669.method2070((byte) -127); var60 != null; var60 = (class572) this.field1669.method2068(-2001)) {
            var60.method3346(arg1, arg0);
            this.field1666++;
        }
        class498.field6966 += this.field1666;
    }
}
