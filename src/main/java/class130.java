import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class130 extends class116 {

    @OriginalMember(owner = "client!bm", name = "B", descriptor = "Z")
    public boolean field1807 = false;

    @OriginalMember(owner = "client!bm", name = "D", descriptor = "Lbl;")
    public class145 field1809;

    @OriginalMember(owner = "client!bm", name = "H", descriptor = "I")
    public int field1813;

    @OriginalMember(owner = "client!bm", name = "L", descriptor = "I")
    public int field1817;

    @OriginalMember(owner = "client!bm", name = "z", descriptor = "I")
    public int field1805;

    @OriginalMember(owner = "client!bm", name = "I", descriptor = "I")
    public int field1814;

    @OriginalMember(owner = "client!bm", name = "M", descriptor = "S")
    private short field1818;

    @OriginalMember(owner = "client!bm", name = "J", descriptor = "S")
    private short field1815;

    @OriginalMember(owner = "client!bm", name = "F", descriptor = "S")
    private short field1811;

    @OriginalMember(owner = "client!bm", name = "y", descriptor = "S")
    private short field1804;

    @OriginalMember(owner = "client!bm", name = "K", descriptor = "S")
    private short field1816;

    @OriginalMember(owner = "client!bm", name = "G", descriptor = "I")
    private int field1812;

    @OriginalMember(owner = "client!bm", name = "A", descriptor = "I")
    private static int field1806 = 12;

    @OriginalMember(owner = "client!bm", name = "E", descriptor = "I")
    private int field1810;

    @OriginalMember(owner = "client!bm", name = "C", descriptor = "S")
    private short field1808;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "()V")
    private final void method828() {
        int var1 = this.field1809.field1973.field3408;
        if (this.field1809.field1973.field3403[var1] != null) {
            this.field1809.field1973.field3403[var1].method831();
        }
        this.field1809.field1973.field3403[var1] = this;
        this.field1808 = (short) this.field1809.field1973.field3408;
        this.field1809.field1973.field3408 = var1 + 1 & 0x1FFF;
        this.field1809.field1980.method169(this, 64);
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lbl;IIIIIIIII)V")
    public final void method829(class145 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field1809 = arg0;
        this.field1813 = arg1 << field1806;
        this.field1817 = arg2 << field1806;
        this.field1805 = arg3 << field1806;
        this.field1814 = arg9;
        this.field1815 = this.field1818 = (short) arg8;
        this.field1811 = (short) arg4;
        this.field1804 = (short) arg5;
        this.field1816 = (short) arg6;
        this.field1812 = arg7;
        this.method828();
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(JI)V")
    public final void method830(long arg0, int arg1) {
        if (this.field1809 == null) {
            return;
        }
        this.field1818 = (short) (this.field1818 - arg1);
        if (this.field1818 <= 0) {
            this.method831();
            return;
        }
        int var4 = this.field1813 >> field1806;
        int var5 = this.field1817 >> field1806;
        int var6 = this.field1805 >> field1806;
        class220 var7 = this.field1809.field1973;
        class255 var8 = this.field1809.field2004;
        if (var8.field3987 != 0) {
            if (this.field1815 - this.field1818 <= var8.field4016) {
                int var9 = var8.field3984 * arg1 + (this.field1814 >> 8 & 0xFF00) + (this.field1810 >> 16 & 0xFF);
                int var10 = var8.field4005 * arg1 + (this.field1810 >> 8 & 0xFF) + (this.field1814 & 0xFF00);
                int var11 = var8.field3973 * arg1 + (this.field1814 & 0xFF << 8) + (this.field1810 & 0xFF);
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
                this.field1814 &= 0xFF000000;
                this.field1814 |= ((var11 & 0xFF00) >> 8) + ((var9 & 0xFF00) << 8) + (var10 & 0xFF00);
                this.field1810 &= 0xFF000000;
                this.field1810 |= (var11 & 0xFF) + ((var9 & 0xFF) << 16) + ((var10 & 0xFF) << 8);
            }
            if (this.field1815 - this.field1818 <= var8.field3997) {
                int var12 = var8.field4006 * arg1 + (this.field1814 >> 16 & 0xFF00) + (this.field1810 >> 24 & 0xFF);
                if (var12 < 0) {
                    var12 = 0;
                } else if (var12 > 65535) {
                    var12 = 65535;
                }
                this.field1814 &= 0xFFFFFF;
                this.field1814 |= (var12 & 0xFF00) << 16;
                this.field1810 &= 0xFFFFFF;
                this.field1810 |= (var12 & 0xFF) << 24;
            }
        }
        if (var8.field4008 != -1 && this.field1815 - this.field1818 <= var8.field4028) {
            this.field1812 += var8.field3982 * arg1;
        }
        int var13 = this.field1811;
        int var14 = this.field1804;
        int var15 = this.field1816;
        boolean var16 = false;
        if (var8.field4009 == 1) {
            int var17 = var4 - this.field1809.field2001;
            int var18 = var5 - this.field1809.field1974;
            int var19 = var6 - this.field1809.field1983;
            int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
            long var21 = (long) (var8.field3976 * var20 * arg1);
            this.field1812 = (int) ((long) this.field1812 - ((long) this.field1812 * var21 >> 18));
        } else if (var8.field4009 == 2) {
            int var23 = var4 - this.field1809.field2001;
            int var24 = var5 - this.field1809.field1974;
            int var25 = var6 - this.field1809.field1983;
            int var26 = var25 * var25 + var23 * var23 + var24 * var24;
            long var27 = (long) (var8.field3976 * var26 * arg1);
            this.field1812 = (int) ((long) this.field1812 - ((long) this.field1812 * var27 >> 28));
        }
        class154 var29 = var7.field3416.field808;
        for (class154 var30 = var29.field2144; var30 != var29; var30 = var30.field2144) {
            class134 var57 = (class134) var30;
            class295 var58 = var57.field1844.field791;
            if (var58.field4699 != 1) {
                int var59 = var4 - var57.field1853;
                int var60 = var5 - var57.field1852;
                int var61 = var6 - var57.field1851;
                long var62 = (long) (var61 * var61 + var59 * var59 + var60 * var60);
                if (var62 <= var58.field4698) {
                    int var64 = (int) Math.sqrt((double) var62);
                    if (var64 == 0) {
                        var64 = 1;
                    }
                    long var65 = (long) (var57.field1850 * var61 + var57.field1854 * var59 + var58.field4712 * var60) * 65535L / (long) (var58.field4704 * var64);
                    if (var65 >= (long) var58.field4713) {
                        int var67 = 0;
                        if (var58.field4714 == 1) {
                            var67 = (var64 >> 4) * var58.field4703;
                        } else if (var58.field4714 == 2) {
                            var67 = (var64 >> 4) * (var64 >> 4) * var58.field4703;
                        }
                        if (var58.field4701 != 0) {
                            int var68 = (var59 << 15) / var64 * var58.field4704;
                            int var69 = (var60 << 15) / var64 * var58.field4704;
                            int var70 = (var61 << 15) / var64 * var58.field4704;
                            if (var58.field4722 == 0) {
                                var13 += arg1 * var68 >> 15;
                                var14 += arg1 * var69 >> 15;
                                var15 += arg1 * var70 >> 15;
                                var16 = true;
                            } else {
                                this.field1813 += arg1 * var68 >> 15;
                                this.field1817 += arg1 * var69 >> 15;
                                this.field1805 += arg1 * var70 >> 15;
                            }
                        } else if (var58.field4722 == 0) {
                            var13 += (var57.field1854 - var67) * arg1;
                            var14 += (var58.field4712 - var67) * arg1;
                            var15 += (var57.field1850 - var67) * arg1;
                            var16 = true;
                        } else {
                            this.field1813 += (var57.field1854 - var67) * arg1;
                            this.field1817 += (var58.field4712 - var67) * arg1;
                            this.field1805 += (var57.field1850 - var67) * arg1;
                        }
                    }
                }
            }
        }
        if (var8.field4017 != null) {
            for (int var31 = 0; var31 < var8.field4017.length; var31++) {
                class134 var32 = (class134) class220.field3407.method837(106, (long) var8.field4017[var31]);
                while (var32 != null) {
                    class295 var33 = var32.field1844.field791;
                    int var34 = var4 - var32.field1853;
                    int var35 = var5 - var32.field1852;
                    int var36 = var6 - var32.field1851;
                    long var37 = (long) (var36 * var36 + var34 * var34 + var35 * var35);
                    if (var37 > var33.field4698) {
                        var32 = (class134) class220.field3407.method834((byte) 94);
                    } else {
                        int var39 = (int) Math.sqrt((double) var37);
                        if (var39 == 0) {
                            var39 = 1;
                        }
                        long var40 = (long) (var32.field1850 * var36 + var32.field1854 * var34 + var33.field4712 * var35) * 65535L / (long) (var33.field4704 * var39);
                        if (var40 < (long) var33.field4713) {
                            var32 = (class134) class220.field3407.method834((byte) 76);
                        } else {
                            int var42 = 0;
                            if (var33.field4714 == 1) {
                                var42 = (var39 >> 4) * var33.field4703;
                            } else if (var33.field4714 == 2) {
                                var42 = (var39 >> 4) * (var39 >> 4) * var33.field4703;
                            }
                            if (var33.field4701 != 0) {
                                int var43 = (var34 << 15) / var39 * var33.field4704;
                                int var44 = (var35 << 15) / var39 * var33.field4704;
                                int var45 = (var36 << 15) / var39 * var33.field4704;
                                if (var33.field4722 == 0) {
                                    var13 += arg1 * var43 >> 15;
                                    var14 += arg1 * var44 >> 15;
                                    var15 += arg1 * var45 >> 15;
                                    var16 = true;
                                } else {
                                    this.field1813 += arg1 * var43 >> 15;
                                    this.field1817 += arg1 * var44 >> 15;
                                    this.field1805 += arg1 * var45 >> 15;
                                }
                            } else if (var33.field4722 == 0) {
                                var13 += (var32.field1854 - var42) * arg1;
                                var14 += (var33.field4712 - var42) * arg1;
                                var15 += (var32.field1850 - var42) * arg1;
                                var16 = true;
                            } else {
                                this.field1813 += (var32.field1854 - var42) * arg1;
                                this.field1817 += (var33.field4712 - var42) * arg1;
                                this.field1805 += (var32.field1850 - var42) * arg1;
                            }
                            var32 = (class134) class220.field3407.method834((byte) 88);
                        }
                    }
                }
            }
        }
        if (var8.field4025 != null) {
            if (var8.field4019 == null) {
                var8.field4019 = new int[var8.field4025.length];
                for (int var46 = 0; var46 < var8.field4025.length; var46++) {
                    class177.method1114(1, var8.field4025[var46]);
                    var8.field4019[var46] = ((class313) class47.field682.method1453(true, (long) var8.field4025[var46])).field5027;
                }
            }
            for (int var47 = 0; var47 < var8.field4019.length; var47++) {
                class295 var48 = class190.field2884[var8.field4019[var47]];
                if (var48.field4722 == 0) {
                    var13 += var48.field4715 * arg1;
                    var14 += var48.field4712 * arg1;
                    var15 += var48.field4700 * arg1;
                    var16 = true;
                } else {
                    this.field1813 += var48.field4715 * arg1;
                    this.field1817 += var48.field4712 * arg1;
                    this.field1805 += var48.field4700 * arg1;
                }
            }
        }
        if (var16) {
            while (true) {
                if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                    this.field1811 = (short) var13;
                    this.field1804 = (short) var14;
                    this.field1816 = (short) var15;
                    break;
                }
                var13 >>= 0x1;
                var14 >>= 0x1;
                var15 >>= 0x1;
                this.field1812 <<= 0x1;
            }
        }
        this.field1813 = (int) ((long) this.field1813 + ((long) this.field1811 * (long) this.field1812 >> 23) * (long) arg1);
        this.field1817 = (int) ((long) this.field1817 + ((long) this.field1804 * (long) this.field1812 >> 23) * (long) arg1);
        this.field1805 = (int) ((long) this.field1805 + ((long) this.field1816 * (long) this.field1812 >> 23) * (long) arg1);
        int var49 = this.field1813 >> 19;
        int var50 = this.field1805 >> 19;
        int var51 = this.field1817 >> field1806;
        if (var51 > 0 || var51 < -65535 || var49 < 0 || var49 >= class207.field3086 || var50 < 0 || var50 >= class265.field4271) {
            this.method831();
            return;
        }
        int[][][] var52 = class185.field2812;
        int var53 = var52[var7.field3430][var49][var50];
        int var54;
        if (var7.field3430 < 3) {
            var54 = var52[var7.field3430 + 1][var49][var50];
        } else {
            var54 = var52[var7.field3430][var49][var50] - 1024;
        }
        if (var8.field4012) {
            if (var8.field4004 == -1 && var51 > var53) {
                this.method831();
                return;
            }
            if (var8.field4004 >= 0 && var51 > var52[var8.field4004][var49][var50]) {
                this.method831();
                return;
            }
            if (var8.field3998 == -1 && var51 < var54) {
                this.method831();
                return;
            }
            if (var8.field3998 >= 0 && var51 < var52[var8.field3998 + 1][var49][var50]) {
                this.method831();
                return;
            }
        }
        if (var49 >= var7.field3433 && var49 <= var7.field3428 && var50 >= var7.field3423 && var50 <= var7.field3425 && var51 <= var7.field3426 && var51 >= var7.field3429) {
            this.field1807 = false;
            return;
        }
        this.field1807 = true;
        byte var55 = 3;
        if (var51 > var52[1][var49][var50]) {
            var55 = 0;
        } else if (var51 > var52[2][var49][var50]) {
            var55 = 1;
        } else if (var51 > var52[3][var49][var50]) {
            var55 = 2;
        } else if (var51 < var52[3][var49][var50] - 1024) {
            this.method831();
            return;
        }
        class91 var56 = class246.field3856[var55][var49][var50];
        if (var56 == null) {
            var56 = class246.field3856[var55][var49][var50] = new class91(var55, var49, var50);
        }
        if (var56.field1335 == null) {
            var56.field1335 = new class234();
            var56.field1331 = (byte) ((int) (arg0 & 0xFFL));
        } else if ((byte) ((int) (arg0 & 0xFFL)) != var56.field1331) {
            var56.field1335.method1538(69);
            var56.field1331 = (byte) ((int) (arg0 & 0xFFL));
        }
        var56.field1335.method1535(this, -127);
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "()V")
    private final void method831() {
        this.field1809.field1973.field3403[this.field1808] = null;
        class220.field3404[class220.field3409] = this;
        class220.field3409 = class220.field3409 + 1 & 0x3FF;
        this.field1809 = null;
        this.method20(false);
        this.method742((byte) -87);
    }

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(Lbl;IIIIIIIII)V")
    public class130(class145 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field1809 = arg0;
        this.field1813 = arg1 << field1806;
        this.field1817 = arg2 << field1806;
        this.field1805 = arg3 << field1806;
        this.field1814 = arg9;
        this.field1815 = this.field1818 = (short) arg8;
        this.field1811 = (short) arg4;
        this.field1804 = (short) arg5;
        this.field1816 = (short) arg6;
        this.field1812 = arg7;
        this.method828();
    }
}
