import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class209 extends class66 {

    @OriginalMember(owner = "client!er", name = "N", descriptor = "Lqj;")
    public class512 field2690;

    @OriginalMember(owner = "client!er", name = "Q", descriptor = "S")
    private short field2693;

    @OriginalMember(owner = "client!er", name = "I", descriptor = "S")
    private short field2685;

    @OriginalMember(owner = "client!er", name = "J", descriptor = "S")
    private short field2686;

    @OriginalMember(owner = "client!er", name = "P", descriptor = "S")
    private short field2692;

    @OriginalMember(owner = "client!er", name = "K", descriptor = "S")
    private short field2687;

    @OriginalMember(owner = "client!er", name = "M", descriptor = "I")
    private int field2689;

    @OriginalMember(owner = "client!er", name = "O", descriptor = "I")
    private int field2691;

    @OriginalMember(owner = "client!er", name = "L", descriptor = "S")
    private short field2688;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(JI)V", line = 6)
    public final void method1337(long arg0, int arg1) {
        this.field2693 = (short) (this.field2693 - arg1);
        if (this.field2693 <= 0) {
            this.method1340();
        } else {
            int var4 = super.field899 >> 12;
            int var5 = super.field894 >> 12;
            int var6 = super.field895 >> 12;
            class231 var7 = this.field2690.field6705;
            class216 var8 = this.field2690.field6692;
            if (var8.field2833 != 0) {
                if (this.field2685 - this.field2693 <= var8.field2780) {
                    int var9 = var8.field2823 * arg1 + (super.field902 >> 8 & 65280) + (this.field2691 >> 16 & 255);
                    int var10 = var8.field2807 * arg1 + (this.field2691 >> 8 & 255) + (super.field902 & 65280);
                    int var11 = var8.field2813 * arg1 + (super.field902 << 8 & 65280) + (this.field2691 & 255);
                    if (var9 < 0) {
                        var9 = 0;
                    } else if (var9 > 65535) {
                        var9 = 65535;
                    }
                    if (var10 < 0) {
                        var10 = 0;
                    } else if (var10 > 65535) {
                        var10 = 65535;
                    }
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 65535) {
                        var11 = 65535;
                    }
                    super.field902 &= -16777216;
                    super.field902 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field2691 &= -16777216;
                    this.field2691 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field2685 - this.field2693 <= var8.field2787) {
                    int var12 = var8.field2832 * arg1 + (super.field902 >> 16 & 65280) + (this.field2691 >> 24 & 255);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field902 &= 16777215;
                    super.field902 |= (var12 & 65280) << 16;
                    this.field2691 &= 16777215;
                    this.field2691 |= (var12 & 255) << 24;
                }
            }
            if (var8.field2793 != -1 && this.field2685 - this.field2693 <= var8.field2835) {
                this.field2689 += var8.field2814 * arg1;
            }
            if (var8.field2799 != -1 && this.field2685 - this.field2693 <= var8.field2820) {
                super.field903 += var8.field2822 * arg1;
            }
            int var13 = this.field2686;
            int var14 = this.field2692;
            int var15 = this.field2687;
            boolean var16 = false;
            if (var8.field2829 == 1) {
                int var17 = var4 - this.field2690.field6694.field1608;
                int var18 = var5 - this.field2690.field6694.field1613;
                int var19 = var6 - this.field2690.field6694.field1609;
                int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18)) >> 2;
                long var21 = (long) (var8.field2777 * var20 * arg1);
                this.field2689 = (int) ((long) this.field2689 - ((long) this.field2689 * var21 >> 18));
            } else if (var8.field2829 == 2) {
                int var23 = var4 - this.field2690.field6694.field1608;
                int var24 = var5 - this.field2690.field6694.field1613;
                int var25 = var6 - this.field2690.field6694.field1609;
                int var26 = var25 * var25 + var23 * var23 + var24 * var24;
                long var27 = (long) (var8.field2777 * var26 * arg1);
                this.field2689 = (int) ((long) this.field2689 - ((long) this.field2689 * var27 >> 28));
            }
            if (var8.field2812 != null) {
                class424 var29 = var7.field3091.field4702;
                for (class424 var30 = var29.field5500; var29 != var30; var30 = var30.field5500) {
                    class197 var31 = (class197) var30;
                    class641 var32 = var31.field2583;
                    if (var32.field8909 != 1) {
                        boolean var33 = false;
                        for (int var34 = 0; var34 < var8.field2812.length; ++var34) {
                            if (var8.field2812[var34] == var32.field8926) {
                                var33 = true;
                                break;
                            }
                        }
                        if (var33) {
                            int var35 = var4 - var31.field2587;
                            int var36 = var5 - var31.field2588;
                            int var37 = var6 - var31.field2586;
                            long var38 = (long) (var37 * var37 + var35 * var35 + var36 * var36);
                            if (var38 <= var32.field8927) {
                                int var40 = (int) Math.sqrt((double) var38);
                                if (var40 == 0) {
                                    var40 = 1;
                                }
                                long var41 = (long) (var31.field2585 * var37 + var31.field2584 * var35 + var32.field8908 * var36) * 65535L / (long) (var32.field8920 * var40);
                                if (var41 >= (long) var32.field8917) {
                                    int var43 = 0;
                                    if (var32.field8922 == 1) {
                                        var43 = (var40 >> 4) * var32.field8918;
                                    } else if (var32.field8922 == 2) {
                                        var43 = (var40 >> 4) * (var40 >> 4) * var32.field8918;
                                    }
                                    if (var32.field8915 == 0) {
                                        if (var32.field8923 == 0) {
                                            var13 += (var31.field2584 - var43) * arg1;
                                            var14 += (var32.field8908 - var43) * arg1;
                                            var15 += (var31.field2585 - var43) * arg1;
                                            var16 = true;
                                        } else {
                                            super.field899 += (var31.field2584 - var43) * arg1;
                                            super.field894 += (var32.field8908 - var43) * arg1;
                                            super.field895 += (var31.field2585 - var43) * arg1;
                                        }
                                    } else {
                                        int var44 = (var35 << 15) / var40 * var32.field8920;
                                        int var45 = (var36 << 15) / var40 * var32.field8920;
                                        int var46 = (var37 << 15) / var40 * var32.field8920;
                                        if (var32.field8923 == 0) {
                                            var13 += arg1 * var44 >> 15;
                                            var14 += arg1 * var45 >> 15;
                                            var15 += arg1 * var46 >> 15;
                                            var16 = true;
                                        } else {
                                            super.field899 += arg1 * var44 >> 15;
                                            super.field894 += arg1 * var45 >> 15;
                                            super.field895 += arg1 * var46 >> 15;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field2781 != null) {
                for (int var47 = 0; var47 < var8.field2781.length; ++var47) {
                    class197 var48 = (class197) class359.field4655.method3563((long) var8.field2781[var47], -87);
                    while (var48 != null) {
                        class641 var49 = var48.field2583;
                        int var50 = var4 - var48.field2587;
                        int var51 = var5 - var48.field2588;
                        int var52 = var6 - var48.field2586;
                        long var53 = (long) (var52 * var52 + var50 * var50 + var51 * var51);
                        if (var53 > var49.field8927) {
                            var48 = (class197) class359.field4655.method3561(22890);
                        } else {
                            int var55 = (int) Math.sqrt((double) var53);
                            if (var55 == 0) {
                                var55 = 1;
                            }
                            long var56 = (long) (var48.field2585 * var52 + var48.field2584 * var50 + var49.field8908 * var51) * 65535L / (long) (var49.field8920 * var55);
                            if (var56 < (long) var49.field8917) {
                                var48 = (class197) class359.field4655.method3561(22890);
                            } else {
                                int var58 = 0;
                                if (var49.field8922 == 1) {
                                    var58 = (var55 >> 4) * var49.field8918;
                                } else if (var49.field8922 == 2) {
                                    var58 = (var55 >> 4) * (var55 >> 4) * var49.field8918;
                                }
                                if (var49.field8915 == 0) {
                                    if (var49.field8923 == 0) {
                                        var13 += (var48.field2584 - var58) * arg1;
                                        var14 += (var49.field8908 - var58) * arg1;
                                        var15 += (var48.field2585 - var58) * arg1;
                                        var16 = true;
                                    } else {
                                        super.field899 += (var48.field2584 - var58) * arg1;
                                        super.field894 += (var49.field8908 - var58) * arg1;
                                        super.field895 += (var48.field2585 - var58) * arg1;
                                    }
                                } else {
                                    int var59 = (var50 << 15) / var55 * var49.field8920;
                                    int var60 = (var51 << 15) / var55 * var49.field8920;
                                    int var61 = (var52 << 15) / var55 * var49.field8920;
                                    if (var49.field8923 == 0) {
                                        var13 += arg1 * var59 >> 15;
                                        var14 += arg1 * var60 >> 15;
                                        var15 += arg1 * var61 >> 15;
                                        var16 = true;
                                    } else {
                                        super.field899 += arg1 * var59 >> 15;
                                        super.field894 += arg1 * var60 >> 15;
                                        super.field895 += arg1 * var61 >> 15;
                                    }
                                }
                                var48 = (class197) class359.field4655.method3561(22890);
                            }
                        }
                    }
                }
            }
            if (var8.field2804 != null) {
                if (var8.field2831 == null) {
                    var8.field2831 = new int[var8.field2804.length];
                    for (int var62 = 0; var62 < var8.field2804.length; ++var62) {
                        class467.method2596(var8.field2804[var62], (byte) 82);
                        var8.field2831[var62] = ((class195) class194.field2537.method39((long) var8.field2804[var62], 31750)).field2546;
                    }
                }
                for (int var63 = 0; var63 < var8.field2831.length; ++var63) {
                    class641 var64 = class193.field2519[var8.field2831[var63]];
                    if (var64.field8923 == 0) {
                        var13 += var64.field8912 * arg1;
                        var14 += var64.field8908 * arg1;
                        var15 += var64.field8925 * arg1;
                        var16 = true;
                    } else {
                        super.field899 += var64.field8912 * arg1;
                        super.field894 += var64.field8908 * arg1;
                        super.field895 += var64.field8925 * arg1;
                    }
                }
            }
            if (var16) {
                while (true) {
                    if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                        this.field2686 = (short) var13;
                        this.field2692 = (short) var14;
                        this.field2687 = (short) var15;
                        break;
                    }
                    var13 >>= 1;
                    var14 >>= 1;
                    var15 >>= 1;
                    this.field2689 <<= 1;
                }
            }
            super.field899 = (int) ((long) super.field899 + ((long) (this.field2689 << 2) * (long) this.field2686 >> 23) * (long) arg1);
            super.field894 = (int) ((long) super.field894 + ((long) (this.field2689 << 2) * (long) this.field2692 >> 23) * (long) arg1);
            super.field895 = (int) ((long) super.field895 + ((long) (this.field2689 << 2) * (long) this.field2687 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Lqj;IIIIIIIIIIIZZ)V", line = 400)
    public final void method1338(class512 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field2690 = arg0;
        super.field899 = arg1 << 12;
        super.field894 = arg2 << 12;
        super.field895 = arg3 << 12;
        super.field902 = arg9;
        this.field2685 = this.field2693 = (short) arg8;
        super.field903 = arg10;
        super.field905 = arg11;
        super.field892 = arg13;
        this.field2686 = (short) arg4;
        this.field2692 = (short) arg5;
        this.field2687 = (short) arg6;
        this.field2689 = arg7;
        super.field896 = this.field2690.field6691.field7476;
        this.method1341();
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Loa;J)V", line = 420)
    public final void method1339(class43 arg0, long arg1) {
        int var4 = super.field899 >> class291.field3760 + 12;
        int var5 = super.field895 >> class291.field3760 + 12;
        int var6 = super.field894 >> 12;
        if (var6 <= 0 && var6 >= -262144 && var4 >= 0 && var4 < class590.field8010 && var5 >= 0 && var5 < class151.field1933) {
            class231 var7 = this.field2690.field6705;
            class216 var8 = this.field2690.field6692;
            class88[] var9 = class392.field4997;
            int var10 = var7.field3094;
            class530 var11 = class483.field6438[var7.field3094][var4][var5];
            if (var11 != null) {
                var10 = var11.field6897;
            }
            int var12 = var9[var10].method668(var4, var5);
            int var13;
            if (var10 < class20.field223 - 1) {
                var13 = var9[var10 + 1].method668(var4, var5);
            } else {
                var13 = var12 - (8 << class291.field3760);
            }
            if (var8.field2803) {
                if (var8.field2790 == -1 && var6 > var12) {
                    this.method1340();
                    return;
                }
                if (var8.field2790 >= 0 && var6 > var9[var8.field2790].method668(var4, var5)) {
                    this.method1340();
                    return;
                }
                if (var8.field2800 == -1 && var6 < var13) {
                    this.method1340();
                    return;
                }
                if (var8.field2800 >= 0 && var6 < var9[var8.field2800 + 1].method668(var4, var5)) {
                    this.method1340();
                    return;
                }
            }
            if (var4 >= var7.field3096 && var4 <= var7.field3098 && var5 >= var7.field3100 && var5 <= var7.field3093 && var6 <= var12 && var6 >= var13) {
                var7.field3092.field3673.method3182(this, 0);
            } else {
                int var14;
                for (var14 = class20.field223 - 1; var14 > 0 && var6 > var9[var14].method668(var4, var5); --var14) {
                }
                if (var8.field2840 && var14 == 0 && var6 > var9[0].method668(var4, var5)) {
                    this.method1340();
                } else if (class20.field223 - 1 == var14 && var9[var14].method668(var4, var5) - var6 > 8 << class291.field3760) {
                    this.method1340();
                } else {
                    class530 var15 = class483.field6438[var14][var4][var5];
                    if (var15 == null) {
                        if (var14 == 0 || class483.field6438[0][var4][var5] == null) {
                            var15 = class483.field6438[0][var4][var5] = new class530(0, var4, var5);
                        }
                        boolean var16 = class483.field6438[0][var4][var5].field6898 != null;
                        if (var14 == 3 && var16) {
                            this.method1340();
                            return;
                        }
                        for (int var17 = 1; var17 <= var14; ++var17) {
                            if (class483.field6438[var17][var4][var5] == null) {
                                var15 = class483.field6438[var17][var4][var5] = new class530(var17, var4, var5);
                                if (var16) {
                                    ++var15.field6897;
                                }
                            }
                        }
                    }
                    if (var8.field2844) {
                        int var18 = super.field899 >> 12;
                        int var19 = super.field895 >> 12;
                        if (var15.field6879 != null) {
                            class564 var20 = var15.field6879.method72(arg0, 21098);
                            if (var20 != null && var20.method3016(var6, (byte) 56, var19, var18)) {
                                this.method1340();
                                return;
                            }
                        }
                        if (var15.field6886 != null) {
                            class564 var21 = var15.field6886.method72(arg0, 21098);
                            if (var21 != null && var21.method3016(var6, (byte) 44, var19, var18)) {
                                this.method1340();
                                return;
                            }
                        }
                        if (var15.field6878 != null) {
                            class564 var22 = var15.field6878.method72(arg0, 21098);
                            if (var22 != null && var22.method3016(var6, (byte) 127, var19, var18)) {
                                this.method1340();
                                return;
                            }
                        }
                        for (class571 var23 = var15.field6887; var23 != null; var23 = var23.field7445) {
                            class564 var24 = var23.field7444.method72(arg0, 21098);
                            if (var24 != null && var24.method3016(var6, (byte) 50, var19, var18)) {
                                this.method1340();
                                return;
                            }
                        }
                    }
                    var7.field3092.field3673.method3182(this, 0);
                }
            }
        } else {
            this.method1340();
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "()V", line = 600)
    public final void method1340() {
        this.field2690.field6705.field3083[this.field2688] = null;
        class277.field3627[class61.field828] = this;
        class61.field828 = class61.field828 + 1 & 1023;
        this.method2227(32);
        this.method1111(-123);
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "()V", line = 611)
    private final void method1341() {
        int var1 = this.field2690.field6705.field3084;
        if (this.field2690.field6705.field3083[var1] != null) {
            this.field2690.field6705.field3083[var1].method1340();
        }
        this.field2690.field6705.field3083[var1] = this;
        this.field2688 = (short) this.field2690.field6705.field3084;
        this.field2690.field6705.field3084 = var1 + 1 & 8191;
        this.field2690.field6707.method2104((byte) -22, this);
    }

    @OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Lqj;IIIIIIIIIIIZZ)V", line = 622)
    public class209(class512 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field2690 = arg0;
        super.field899 = arg1 << 12;
        super.field894 = arg2 << 12;
        super.field895 = arg3 << 12;
        super.field902 = arg9;
        this.field2685 = this.field2693 = (short) arg8;
        super.field903 = arg10;
        super.field905 = arg11;
        super.field892 = arg13;
        this.field2686 = (short) arg4;
        this.field2692 = (short) arg5;
        this.field2687 = (short) arg6;
        this.field2689 = arg7;
        super.field896 = this.field2690.field6691.field7476;
        this.method1341();
    }
}
