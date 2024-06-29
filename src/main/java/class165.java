import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class165 extends class32 {

    @OriginalMember(owner = "client!va", name = "m", descriptor = "I")
    private int field2531 = 0;

    @OriginalMember(owner = "client!va", name = "F", descriptor = "Z")
    public boolean field2550 = true;

    @OriginalMember(owner = "client!va", name = "I", descriptor = "Z")
    public boolean field2553 = false;

    @OriginalMember(owner = "client!va", name = "s", descriptor = "Luj;")
    public class160 field2537;

    @OriginalMember(owner = "client!va", name = "n", descriptor = "Llg;")
    public class141 field2532;

    @OriginalMember(owner = "client!va", name = "o", descriptor = "Lpn;")
    public class218 field2533;

    @OriginalMember(owner = "client!va", name = "r", descriptor = "J")
    private long field2536;

    @OriginalMember(owner = "client!va", name = "M", descriptor = "Lso;")
    public class127 field2557;

    @OriginalMember(owner = "client!va", name = "k", descriptor = "I")
    private int field2529;

    @OriginalMember(owner = "client!va", name = "l", descriptor = "I")
    private int field2530;

    @OriginalMember(owner = "client!va", name = "p", descriptor = "I")
    private int field2534;

    @OriginalMember(owner = "client!va", name = "q", descriptor = "I")
    private int field2535;

    @OriginalMember(owner = "client!va", name = "t", descriptor = "I")
    public static int field2538;

    @OriginalMember(owner = "client!va", name = "u", descriptor = "I")
    private int field2539;

    @OriginalMember(owner = "client!va", name = "v", descriptor = "I")
    private int field2540;

    @OriginalMember(owner = "client!va", name = "w", descriptor = "I")
    private int field2541;

    @OriginalMember(owner = "client!va", name = "x", descriptor = "I")
    private int field2542;

    @OriginalMember(owner = "client!va", name = "y", descriptor = "I")
    public int field2543;

    @OriginalMember(owner = "client!va", name = "z", descriptor = "I")
    private int field2544;

    @OriginalMember(owner = "client!va", name = "A", descriptor = "I")
    private int field2545;

    @OriginalMember(owner = "client!va", name = "B", descriptor = "I")
    public static int field2546;

    @OriginalMember(owner = "client!va", name = "C", descriptor = "I")
    public int field2547;

    @OriginalMember(owner = "client!va", name = "D", descriptor = "I")
    public int field2548;

    @OriginalMember(owner = "client!va", name = "E", descriptor = "I")
    public int field2549;

    @OriginalMember(owner = "client!va", name = "G", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!va", name = "H", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!va", name = "J", descriptor = "I")
    private int field2554;

    @OriginalMember(owner = "client!va", name = "K", descriptor = "I")
    private int field2555;

    @OriginalMember(owner = "client!va", name = "L", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!va", name = "N", descriptor = "I")
    private int field2558;

    @OriginalMember(owner = "client!va", name = "O", descriptor = "I")
    private int field2559;

    @OriginalMember(owner = "client!va", name = "P", descriptor = "I")
    private int field2560;

    @OriginalMember(owner = "client!va", name = "Q", descriptor = "I")
    private int field2561;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V", line = 16)
    public static final void method1181(int arg0) {
        field2538++;
        if (arg0 != 63) {
            field2546 = -109;
        }
        class225.field3397.method383((byte) -48);
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Luj;Llg;J)V", line = 312)
    public class165(class160 arg0, class141 arg1, long arg2) {
        this.field2537 = arg0;
        this.field2532 = arg1;
        this.field2533 = new class218();
        this.field2536 = arg2;
        this.field2531 = (int) ((double) this.field2531 + Math.random() * 64.0D);
        this.field2557 = this.field2537.field2463;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIIIIIIBI)V", line = 59)
    public final void method1182(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9) {
        this.field2558 = arg0;
        this.field2530 = arg5;
        field2552++;
        this.field2541 = arg4;
        this.field2554 = arg1;
        this.field2542 = arg2;
        this.field2560 = arg3;
        if (arg8 > -23) {
            return;
        }
        int var11 = (this.field2558 + this.field2554 + this.field2542) / 3 + this.field2532.field2198;
        this.field2561 = arg6;
        this.field2534 = arg9;
        this.field2539 = arg7;
        int var12 = (this.field2561 + this.field2530 + this.field2539) / 3 + this.field2532.field2197;
        int var13 = (this.field2560 + this.field2541 + this.field2534) / 3 + this.field2532.field2213;
        if (this.field2547 != var11 || this.field2543 != var13 || this.field2549 != var12) {
            this.field2547 = var11;
            this.field2550 = true;
            this.field2549 = var12;
            this.field2543 = var13;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIZBJI)V", line = 92)
    public final void method1183(int arg0, int arg1, boolean arg2, byte arg3, long arg4, int arg5) {
        field2551++;
        if (this.field2553) {
            arg2 = false;
        } else if (this.field2557.field1795 > class141.field2187) {
            arg2 = false;
        } else if (class141.field2180 > class189.field2849[class141.field2187]) {
            arg2 = false;
        } else if (this.field2558 == this.field2542 && this.field2558 == this.field2554 && this.field2560 == this.field2541 && this.field2541 == this.field2534 && this.field2539 == this.field2530 && this.field2561 == this.field2539) {
            arg2 = false;
        } else if (this.field2557.field1798 != -1) {
            int var8 = (int) (arg4 - this.field2536);
            if (this.field2557.field1851 || this.field2557.field1798 >= var8) {
                var8 %= this.field2557.field1798;
            } else {
                arg2 = false;
            }
            if (!this.field2557.field1800 && this.field2557.field1846 > var8) {
                arg2 = false;
            }
            if (this.field2557.field1800 && this.field2557.field1846 <= var8) {
                arg2 = false;
            }
        }
        if (arg2) {
            this.field2531 += (int) ((double) arg0 * (Math.random() * (double) (this.field2557.field1855 - this.field2557.field1835) + (double) this.field2557.field1835));
            if (this.field2531 > 63) {
                int var9 = this.field2531 >> 6;
                this.field2531 &= 0x3F;
                if (this.field2550) {
                    int var10 = this.field2541 - this.field2560;
                    int var11 = this.field2558 - this.field2542;
                    int var12 = this.field2539 - this.field2530;
                    int var13 = this.field2554 - this.field2542;
                    int var14 = this.field2534 - this.field2560;
                    int var15 = this.field2561 - this.field2530;
                    this.field2535 = var12 * var13 - (var11 * var15);
                    this.field2559 = var10 * var15 - (var12 * var14);
                    this.field2529 = var11 * var14 - (var10 * var13);
                    while (true) {
                        if (this.field2559 <= 32767 && this.field2535 <= 32767 && this.field2529 <= 32767 && this.field2559 >= -32767 && this.field2535 >= -32767 && this.field2529 >= -32767) {
                            int var16 = (int) Math.sqrt((double) (this.field2529 * this.field2529 + this.field2559 * this.field2559 + this.field2535 * this.field2535));
                            if (var16 <= 0) {
                                var16 = 1;
                            }
                            this.field2535 = this.field2535 * 32767 / var16;
                            this.field2559 = this.field2559 * 32767 / var16;
                            this.field2529 = this.field2529 * 32767 / var16;
                            if (this.field2557.field1834 > 0 || this.field2557.field1802 > 0) {
                                int var18 = (int) (Math.atan2((double) this.field2529, (double) this.field2559) * 2047.0D / 6.283185307179586D);
                                int var19 = (int) (Math.atan2((double) this.field2535, Math.sqrt((double) (this.field2559 * this.field2559 + this.field2529 * this.field2529))) * 2047.0D / 6.283185307179586D);
                                this.field2544 = this.field2557.field1834 - this.field2557.field1839;
                                this.field2545 = this.field2557.field1802 - this.field2557.field1819;
                                int var20 = var18 - this.field2532.field2201;
                                this.field2540 = this.field2557.field1839 + var20 - (this.field2544 / 2);
                                this.field2555 = var19 - (this.field2545 / 2 - this.field2557.field1819);
                            } else if (this.field2532.field2201 != 0) {
                                int var17 = this.field2559 * arg1 + this.field2529 * arg5 >> 16;
                                this.field2529 = this.field2529 * arg1 - (this.field2559 * arg5) >> 16;
                                this.field2559 = var17;
                            }
                            this.field2550 = false;
                            break;
                        }
                        this.field2535 >>= 0x1;
                        this.field2529 >>= 0x1;
                        this.field2559 >>= 0x1;
                    }
                }
                for (int var21 = 0; var21 < var9; var21++) {
                    int var22;
                    int var23;
                    int var24;
                    if (this.field2557.field1834 <= 0 && this.field2557.field1802 <= 0) {
                        var22 = this.field2559;
                        var23 = this.field2529;
                        var24 = this.field2535;
                    } else {
                        int var25 = this.field2540 + ((int) ((double) this.field2544 * Math.random()));
                        int var26 = var25 & 0x7FF;
                        int var27 = class104.field1426[var26] >> 1;
                        int var28 = class104.field1435[var26] >> 1;
                        int var29 = this.field2555 + (int) (Math.random() * (double) this.field2545);
                        int var30 = var29 & 0x3FF;
                        int var31 = class104.field1435[var30] >> 1;
                        int var32 = class104.field1426[var30] >> 1;
                        var24 = var31 * -1;
                        var22 = var28 * var32 >> 15;
                        var23 = var27 * var32 >> 15;
                    }
                    int var33 = (int) (Math.random() * 255.0D);
                    int var34 = (int) (Math.random() * 255.0D);
                    int var35 = (255 - var33) * var34 >> 8;
                    int var36 = 255 - var35 - var33;
                    int var37 = this.field2534 * var36 + this.field2560 * var33 + this.field2541 * var35 >> 8;
                    int var38 = this.field2561 * var36 + this.field2539 * var35 + this.field2530 * var33 >> 8;
                    int var39 = this.field2542 * var33 + (this.field2558 * var35) + (this.field2554 * var36) >> 8;
                    if (this.field2532.field2201 != 0) {
                        int var40 = arg5 * var38 + (arg1 * var39) >> 16;
                        var38 = arg1 * var38 - (arg5 * var39) >> 16;
                        var39 = var40;
                    }
                    int var41 = this.field2557.field1857 + ((int) (Math.random() * (double) (this.field2557.field1838 - this.field2557.field1857)));
                    int var42 = (int) ((double) (this.field2557.field1841 - this.field2557.field1803) * Math.random()) + this.field2557.field1803;
                    int var43;
                    if (this.field2557.field1840) {
                        double var44 = Math.random();
                        var43 = (int) ((double) this.field2557.field1797 * var44 + (double) this.field2557.field1813) << 24 | (int) ((double) this.field2557.field1796 * var44 + (double) this.field2557.field1827) | (int) ((double) this.field2557.field1806 * var44 + (double) this.field2557.field1837) << 16 | (int) ((double) this.field2557.field1794 * var44 + (double) this.field2557.field1820) << 8;
                    } else {
                        var43 = (int) (Math.random() * (double) this.field2557.field1797 + (double) this.field2557.field1813) << 24 | (int) ((double) this.field2557.field1796 * Math.random() + (double) this.field2557.field1827) | (int) (Math.random() * (double) this.field2557.field1806 + (double) this.field2557.field1837) << 16 | (int) (Math.random() * (double) this.field2557.field1794 + (double) this.field2557.field1820) << 8;
                    }
                    if (class141.field2174 == class141.field2166) {
                        new class83(this, this.field2532.field2198 + var39, this.field2532.field2213 + var37, this.field2532.field2197 + var38, var22, var24, var23, var42, var41, var43);
                    } else {
                        class83 var46 = class141.field2178[class141.field2174];
                        class141.field2174 = class141.field2174 + 1 & 0x3FF;
                        var46.method534(this, this.field2532.field2198 + var39, this.field2532.field2213 - -var37, this.field2532.field2197 + var38, var22, var24, var23, var42, var41, var43);
                    }
                }
            }
        }
        this.field2548 = 0;
        class83 var48 = (class83) this.field2533.method1522((byte) -49);
        if (arg3 != 6) {
            method1181(-46);
        }
        while (var48 != null) {
            var48.method535(arg4, arg0);
            this.field2548++;
            var48 = (class83) this.field2533.method1518(25127);
        }
        class141.field2172 += this.field2548;
    }
}
