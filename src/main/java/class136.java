import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class136 extends class27 {

    @OriginalMember(owner = "client!lm", name = "E", descriptor = "Z")
    public boolean field1860 = false;

    @OriginalMember(owner = "client!lm", name = "G", descriptor = "Lbi;")
    public class32 field1862;

    @OriginalMember(owner = "client!lm", name = "u", descriptor = "I")
    public int field1850;

    @OriginalMember(owner = "client!lm", name = "v", descriptor = "I")
    public int field1851;

    @OriginalMember(owner = "client!lm", name = "x", descriptor = "I")
    public int field1853;

    @OriginalMember(owner = "client!lm", name = "y", descriptor = "I")
    public int field1854;

    @OriginalMember(owner = "client!lm", name = "A", descriptor = "S")
    private short field1856;

    @OriginalMember(owner = "client!lm", name = "C", descriptor = "S")
    private short field1858;

    @OriginalMember(owner = "client!lm", name = "w", descriptor = "S")
    private short field1852;

    @OriginalMember(owner = "client!lm", name = "D", descriptor = "S")
    private short field1859;

    @OriginalMember(owner = "client!lm", name = "F", descriptor = "S")
    private short field1861;

    @OriginalMember(owner = "client!lm", name = "H", descriptor = "I")
    private int field1863;

    @OriginalMember(owner = "client!lm", name = "t", descriptor = "I")
    private static int field1849 = 12;

    @OriginalMember(owner = "client!lm", name = "z", descriptor = "I")
    private int field1855;

    @OriginalMember(owner = "client!lm", name = "B", descriptor = "S")
    public short field1857;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(JI)V", line = 16)
    public final void method1028(long arg0, int arg1) {
        if (this.field1862 == null) {
            return;
        }
        this.field1856 = (short) (this.field1856 - arg1);
        if (this.field1856 <= 0) {
            this.method1029();
            return;
        }
        int var4 = this.field1850 >> field1849;
        int var5 = this.field1851 >> field1849;
        int var6 = this.field1853 >> field1849;
        class187 var7 = this.field1862.field398;
        class149 var8 = this.field1862.field376;
        if (var8.field2070 != 0) {
            if (this.field1858 - this.field1856 <= var8.field2076) {
                int var9 = var8.field2069 * arg1 + (this.field1855 >> 16 & 0xFF) + (this.field1854 >> 8 & 0xFF00);
                int var10 = var8.field2071 * arg1 + (this.field1855 >> 8 & 0xFF) + (this.field1854 & 0xFF00);
                int var11 = var8.field2087 * arg1 + (this.field1854 & 0xFF << 8) + (this.field1855 & 0xFF);
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
                this.field1854 &= 0xFF000000;
                this.field1854 |= ((var11 & 0xFF00) >> 8) + ((var9 & 0xFF00) << 8) + (var10 & 0xFF00);
                this.field1855 &= 0xFF000000;
                this.field1855 |= (var11 & 0xFF) + ((var9 & 0xFF) << 16) + ((var10 & 0xFF) << 8);
            }
            if (this.field1858 - this.field1856 <= var8.field2072) {
                int var12 = var8.field2060 * arg1 + (this.field1855 >> 24 & 0xFF) + (this.field1854 >> 16 & 0xFF00);
                if (var12 < 0) {
                    var12 = 0;
                } else if (var12 > 65535) {
                    var12 = 65535;
                }
                this.field1854 &= 0xFFFFFF;
                this.field1854 |= (var12 & 0xFF00) << 16;
                this.field1855 &= 0xFFFFFF;
                this.field1855 |= (var12 & 0xFF) << 24;
            }
        }
        if (var8.field2074 != -1 && this.field1858 - this.field1856 <= var8.field2094) {
            this.field1863 += var8.field2120 * arg1;
        }
        int var13 = this.field1852;
        int var14 = this.field1859;
        int var15 = this.field1861;
        boolean var16 = false;
        if (var8.field2056 == 1) {
            int var17 = var4 - this.field1862.field367;
            int var18 = var5 - this.field1862.field370;
            int var19 = var6 - this.field1862.field374;
            int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
            long var21 = (long) (var8.field2082 * var20 * arg1);
            this.field1863 = (int) ((long) this.field1863 - ((long) this.field1863 * var21 >> 18));
        } else if (var8.field2056 == 2) {
            int var23 = var4 - this.field1862.field367;
            int var24 = var5 - this.field1862.field370;
            int var25 = var6 - this.field1862.field374;
            int var26 = var25 * var25 + var23 * var23 + var24 * var24;
            long var27 = (long) (var8.field2082 * var26 * arg1);
            this.field1863 = (int) ((long) this.field1863 - ((long) this.field1863 * var27 >> 28));
        }
        class26 var29 = var7.field2575.field704;
        for (class26 var30 = var29.field301; var30 != var29; var30 = var30.field301) {
            class121 var31 = (class121) var30;
            class245 var32 = var31.field1585.field432;
            if (var32.field3580 != 1) {
                int var33 = var4 - var31.field1595;
                int var34 = var5 - var31.field1588;
                int var35 = var6 - var31.field1586;
                long var36 = (long) (var35 * var35 + var33 * var33 + var34 * var34);
                if (var36 <= var32.field3588) {
                    int var38 = (int) Math.sqrt((double) var36);
                    if (var38 == 0) {
                        var38 = 1;
                    }
                    long var39 = (long) (var31.field1587 * var35 + var31.field1590 * var33 + var32.field3575 * var34) * 65535L / (long) (var32.field3576 * var38);
                    if (var39 >= (long) var32.field3579) {
                        int var41 = 0;
                        if (var32.field3566 == 1) {
                            var41 = (var38 >> 4) * var32.field3584;
                        } else if (var32.field3566 == 2) {
                            var41 = (var38 >> 4) * (var38 >> 4) * var32.field3584;
                        }
                        if (var32.field3578 != 0) {
                            int var42 = (var33 << 15) / var38 * var32.field3576;
                            int var43 = (var34 << 15) / var38 * var32.field3576;
                            int var44 = (var35 << 15) / var38 * var32.field3576;
                            if (var32.field3581 == 0) {
                                var13 += arg1 * var42 >> 15;
                                var14 += arg1 * var43 >> 15;
                                var15 += arg1 * var44 >> 15;
                                var16 = true;
                            } else {
                                this.field1850 += arg1 * var42 >> 15;
                                this.field1851 += arg1 * var43 >> 15;
                                this.field1853 += arg1 * var44 >> 15;
                            }
                        } else if (var32.field3581 == 0) {
                            var13 += (var31.field1590 - var41) * arg1;
                            var14 += (var32.field3575 - var41) * arg1;
                            var15 += (var31.field1587 - var41) * arg1;
                            var16 = true;
                        } else {
                            this.field1850 += (var31.field1590 - var41) * arg1;
                            this.field1851 += (var32.field3575 - var41) * arg1;
                            this.field1853 += (var31.field1587 - var41) * arg1;
                        }
                    }
                }
            }
        }
        if (var8.field2118 != null) {
            for (int var45 = 0; var45 < var8.field2118.length; var45++) {
                class121 var46 = (class121) class187.field2555.method2140((byte) -128, (long) var8.field2118[var45]);
                while (var46 != null) {
                    class245 var47 = var46.field1585.field432;
                    int var48 = var4 - var46.field1595;
                    int var49 = var5 - var46.field1588;
                    int var50 = var6 - var46.field1586;
                    long var51 = (long) (var50 * var50 + var48 * var48 + var49 * var49);
                    if (var51 > var47.field3588) {
                        var46 = (class121) class187.field2555.method2139(-5463);
                    } else {
                        int var53 = (int) Math.sqrt((double) var51);
                        if (var53 == 0) {
                            var53 = 1;
                        }
                        long var54 = (long) (var46.field1587 * var50 + var46.field1590 * var48 + var47.field3575 * var49) * 65535L / (long) (var47.field3576 * var53);
                        if (var54 < (long) var47.field3579) {
                            var46 = (class121) class187.field2555.method2139(-5463);
                        } else {
                            int var56 = 0;
                            if (var47.field3566 == 1) {
                                var56 = (var53 >> 4) * var47.field3584;
                            } else if (var47.field3566 == 2) {
                                var56 = (var53 >> 4) * (var53 >> 4) * var47.field3584;
                            }
                            if (var47.field3578 != 0) {
                                int var57 = (var48 << 15) / var53 * var47.field3576;
                                int var58 = (var49 << 15) / var53 * var47.field3576;
                                int var59 = (var50 << 15) / var53 * var47.field3576;
                                if (var47.field3581 == 0) {
                                    var13 += arg1 * var57 >> 15;
                                    var14 += arg1 * var58 >> 15;
                                    var15 += arg1 * var59 >> 15;
                                    var16 = true;
                                } else {
                                    this.field1850 += arg1 * var57 >> 15;
                                    this.field1851 += arg1 * var58 >> 15;
                                    this.field1853 += arg1 * var59 >> 15;
                                }
                            } else if (var47.field3581 == 0) {
                                var13 += (var46.field1590 - var56) * arg1;
                                var14 += (var47.field3575 - var56) * arg1;
                                var15 += (var46.field1587 - var56) * arg1;
                                var16 = true;
                            } else {
                                this.field1850 += (var46.field1590 - var56) * arg1;
                                this.field1851 += (var47.field3575 - var56) * arg1;
                                this.field1853 += (var46.field1587 - var56) * arg1;
                            }
                            var46 = (class121) class187.field2555.method2139(-5463);
                        }
                    }
                }
            }
        }
        if (var8.field2084 != null) {
            if (var8.field2099 == null) {
                var8.field2099 = new int[var8.field2084.length];
                for (int var60 = 0; var60 < var8.field2084.length; var60++) {
                    class210.method1546(var8.field2084[var60], 2);
                    var8.field2099[var60] = ((class7) class119.field1570.method2279((long) var8.field2084[var60], -122)).field67;
                }
            }
            for (int var61 = 0; var61 < var8.field2099.length; var61++) {
                class245 var62 = class318.field4683[var8.field2099[var61]];
                if (var62.field3581 == 0) {
                    var13 += var62.field3570 * arg1;
                    var14 += var62.field3575 * arg1;
                    var15 += var62.field3563 * arg1;
                    var16 = true;
                } else {
                    this.field1850 += var62.field3570 * arg1;
                    this.field1851 += var62.field3575 * arg1;
                    this.field1853 += var62.field3563 * arg1;
                }
            }
        }
        if (var16) {
            while (true) {
                if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                    this.field1852 = (short) var13;
                    this.field1859 = (short) var14;
                    this.field1861 = (short) var15;
                    break;
                }
                var13 >>= 0x1;
                var14 >>= 0x1;
                var15 >>= 0x1;
                this.field1863 <<= 0x1;
            }
        }
        this.field1850 = (int) ((long) this.field1850 + ((long) this.field1852 * (long) this.field1863 >> 23) * (long) arg1);
        this.field1851 = (int) ((long) this.field1851 + ((long) this.field1859 * (long) this.field1863 >> 23) * (long) arg1);
        this.field1853 = (int) ((long) this.field1853 + ((long) this.field1861 * (long) this.field1863 >> 23) * (long) arg1);
        int var63 = this.field1850 >> 19;
        int var64 = this.field1853 >> 19;
        int var65 = this.field1851 >> field1849;
        if (var65 > 0 || var65 < -65535 || var63 < 0 || var63 >= class66.field847 || var64 < 0 || var64 >= class300.field4413) {
            this.method1029();
            return;
        }
        int[][][] var66 = class74.field978;
        int var67 = var66[var7.field2583][var63][var64];
        int var68;
        if (var7.field2583 < 3) {
            var68 = var66[var7.field2583 + 1][var63][var64];
        } else {
            var68 = var66[var7.field2583][var63][var64] - 1024;
        }
        if (var8.field2096) {
            if (var8.field2067 == -1 && var65 > var67) {
                this.method1029();
                return;
            }
            if (var8.field2067 >= 0 && var65 > var66[var8.field2067][var63][var64]) {
                this.method1029();
                return;
            }
            if (var8.field2112 == -1 && var65 < var68) {
                this.method1029();
                return;
            }
            if (var8.field2112 >= 0 && var65 < var66[var8.field2112 + 1][var63][var64]) {
                this.method1029();
                return;
            }
        }
        if (var63 >= var7.field2582 && var63 <= var7.field2593 && var64 >= var7.field2576 && var64 <= var7.field2584 && var65 <= var7.field2578 && var65 >= var7.field2591) {
            this.field1860 = false;
            return;
        }
        this.field1860 = true;
        byte var69 = 3;
        if (var65 > var66[1][var63][var64]) {
            var69 = 0;
        } else if (var65 > var66[2][var63][var64]) {
            var69 = 1;
        } else if (var65 > var66[3][var63][var64]) {
            var69 = 2;
        } else if (var65 < var66[3][var63][var64] - 1024) {
            this.method1029();
            return;
        }
        class119 var70 = class345.field5367[var69][var63][var64];
        if (var70 == null) {
            var70 = class345.field5367[var69][var63][var64] = new class119(var69, var63, var64);
        }
        if (var70.field1572 == null) {
            var70.field1572 = new class359();
            var70.field1547 = (byte) ((int) (arg0 & 0xFFL));
        } else if ((byte) ((int) (arg0 & 0xFFL)) != var70.field1547) {
            var70.field1572.method2496(25480);
            var70.field1547 = (byte) ((int) (arg0 & 0xFFL));
        }
        var70.field1572.method2499(-2260, this);
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "()V", line = 482)
    private final void method1029() {
        this.field1862.field398.field2564[this.field1857] = null;
        class187.field2559[class187.field2563] = this;
        class187.field2563 = class187.field2563 + 1 & 0x3FF;
        this.field1862 = null;
        this.method623(102);
        this.method181(13);
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "()V", line = 492)
    private final void method1030() {
        int var1 = this.field1862.field398.field2557;
        if (this.field1862.field398.field2564[var1] != null) {
            this.field1862.field398.field2564[var1].method1029();
        }
        this.field1862.field398.field2564[var1] = this;
        this.field1857 = (short) this.field1862.field398.field2557;
        this.field1862.field398.field2557 = var1 + 1 & 0x1FFF;
        this.field1862.field394.method670((byte) 100, this);
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lbi;IIIIIIIII)V", line = 505)
    public final void method1031(class32 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field1862 = arg0;
        this.field1850 = arg1 << field1849;
        this.field1851 = arg2 << field1849;
        this.field1853 = arg3 << field1849;
        this.field1854 = arg9;
        this.field1858 = this.field1856 = (short) arg8;
        this.field1852 = (short) arg4;
        this.field1859 = (short) arg5;
        this.field1861 = (short) arg6;
        this.field1863 = arg7;
        this.method1030();
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lbi;IIIIIIIII)V", line = 521)
    public class136(class32 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field1862 = arg0;
        this.field1850 = arg1 << field1849;
        this.field1851 = arg2 << field1849;
        this.field1853 = arg3 << field1849;
        this.field1854 = arg9;
        this.field1858 = this.field1856 = (short) arg8;
        this.field1852 = (short) arg4;
        this.field1859 = (short) arg5;
        this.field1861 = (short) arg6;
        this.field1863 = arg7;
        this.method1030();
    }
}
