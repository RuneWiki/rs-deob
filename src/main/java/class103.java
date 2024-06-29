import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class103 extends class17 {

    @OriginalMember(owner = "client!kf", name = "N", descriptor = "Z")
    public boolean field1827 = false;

    @OriginalMember(owner = "client!kf", name = "K", descriptor = "Lcj;")
    public class306 field1824;

    @OriginalMember(owner = "client!kf", name = "R", descriptor = "I")
    public int field1831;

    @OriginalMember(owner = "client!kf", name = "Q", descriptor = "I")
    public int field1830;

    @OriginalMember(owner = "client!kf", name = "T", descriptor = "I")
    public int field1833;

    @OriginalMember(owner = "client!kf", name = "O", descriptor = "I")
    public int field1828;

    @OriginalMember(owner = "client!kf", name = "W", descriptor = "S")
    private short field1836;

    @OriginalMember(owner = "client!kf", name = "X", descriptor = "S")
    private short field1837;

    @OriginalMember(owner = "client!kf", name = "M", descriptor = "S")
    private short field1826;

    @OriginalMember(owner = "client!kf", name = "P", descriptor = "S")
    private short field1829;

    @OriginalMember(owner = "client!kf", name = "V", descriptor = "S")
    private short field1835;

    @OriginalMember(owner = "client!kf", name = "U", descriptor = "I")
    private int field1834;

    @OriginalMember(owner = "client!kf", name = "S", descriptor = "I")
    private static int field1832 = 12;

    @OriginalMember(owner = "client!kf", name = "J", descriptor = "I")
    private int field1823;

    @OriginalMember(owner = "client!kf", name = "L", descriptor = "S")
    public short field1825;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "()V", line = 9)
    private final void method711() {
        int var1 = this.field1824.field5206.field4938;
        if (this.field1824.field5206.field4936[var1] != null) {
            this.field1824.field5206.field4936[var1].method714();
        }
        this.field1824.field5206.field4936[var1] = this;
        this.field1825 = (short) this.field1824.field5206.field4938;
        this.field1824.field5206.field4938 = var1 + 1 & 0x1FFF;
        this.field1824.field5203.method1753(this, (byte) -34);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(JI)V", line = 21)
    public final void method712(long arg0, int arg1) {
        if (this.field1824 == null) {
            return;
        }
        this.field1836 = (short) (this.field1836 - arg1);
        if (this.field1836 <= 0) {
            this.method714();
            return;
        }
        int var4 = this.field1831 >> field1832;
        int var5 = this.field1830 >> field1832;
        int var6 = this.field1833 >> field1832;
        class295 var7 = this.field1824.field5206;
        class296 var8 = this.field1824.field5195;
        if (var8.field5045 != 0) {
            if (this.field1837 - this.field1836 <= var8.field4990) {
                int var9 = var8.field5037 * arg1 + (this.field1828 >> 8 & 0xFF00) + (this.field1823 >> 16 & 0xFF);
                int var10 = var8.field5044 * arg1 + (this.field1823 >> 8 & 0xFF) + (this.field1828 & 0xFF00);
                int var11 = var8.field5001 * arg1 + (this.field1828 & 0xFF << 8) + (this.field1823 & 0xFF);
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
                this.field1828 &= 0xFF000000;
                this.field1828 |= ((var11 & 0xFF00) >> 8) + ((var9 & 0xFF00) << 8) + (var10 & 0xFF00);
                this.field1823 &= 0xFF000000;
                this.field1823 |= (var11 & 0xFF) + ((var9 & 0xFF) << 16) + ((var10 & 0xFF) << 8);
            }
            if (this.field1837 - this.field1836 <= var8.field5046) {
                int var12 = var8.field5011 * arg1 + (this.field1828 >> 16 & 0xFF00) + (this.field1823 >> 24 & 0xFF);
                if (var12 < 0) {
                    var12 = 0;
                } else if (var12 > 65535) {
                    var12 = 65535;
                }
                this.field1828 &= 0xFFFFFF;
                this.field1828 |= (var12 & 0xFF00) << 16;
                this.field1823 &= 0xFFFFFF;
                this.field1823 |= (var12 & 0xFF) << 24;
            }
        }
        if (var8.field5000 != -1 && this.field1837 - this.field1836 <= var8.field5034) {
            this.field1834 += var8.field4999 * arg1;
        }
        int var13 = this.field1826;
        int var14 = this.field1829;
        int var15 = this.field1835;
        boolean var16 = false;
        if (var8.field5017 == 1) {
            int var17 = var4 - this.field1824.field5216;
            int var18 = var5 - this.field1824.field5196;
            int var19 = var6 - this.field1824.field5219;
            int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
            long var21 = (long) (var8.field5004 * var20 * arg1);
            this.field1834 = (int) ((long) this.field1834 - ((long) this.field1834 * var21 >> 18));
        } else if (var8.field5017 == 2) {
            int var23 = var4 - this.field1824.field5216;
            int var24 = var5 - this.field1824.field5196;
            int var25 = var6 - this.field1824.field5219;
            int var26 = var25 * var25 + var23 * var23 + var24 * var24;
            long var27 = (long) (var8.field5004 * var26 * arg1);
            this.field1834 = (int) ((long) this.field1834 - ((long) this.field1834 * var27 >> 28));
        }
        class141 var29 = var7.field4951.field4665;
        for (class141 var30 = var29.field2423; var30 != var29; var30 = var30.field2423) {
            class112 var31 = (class112) var30;
            class269 var32 = var31.field2015.field4638;
            if (var32.field4570 != 1) {
                int var33 = var4 - var31.field2027;
                int var34 = var5 - var31.field2023;
                int var35 = var6 - var31.field2021;
                long var36 = (long) (var35 * var35 + var33 * var33 + var34 * var34);
                if (var36 <= var32.field4561) {
                    int var38 = (int) Math.sqrt((double) var36);
                    if (var38 == 0) {
                        var38 = 1;
                    }
                    long var39 = (long) (var31.field2012 * var35 + var31.field2020 * var33 + var32.field4569 * var34) * 65535L / (long) (var32.field4562 * var38);
                    if (var39 >= (long) var32.field4568) {
                        int var41 = 0;
                        if (var32.field4551 == 1) {
                            var41 = (var38 >> 4) * var32.field4566;
                        } else if (var32.field4551 == 2) {
                            var41 = (var38 >> 4) * (var38 >> 4) * var32.field4566;
                        }
                        if (var32.field4564 != 0) {
                            int var42 = (var33 << 15) / var38 * var32.field4562;
                            int var43 = (var34 << 15) / var38 * var32.field4562;
                            int var44 = (var35 << 15) / var38 * var32.field4562;
                            if (var32.field4558 == 0) {
                                var13 += arg1 * var42 >> 15;
                                var14 += arg1 * var43 >> 15;
                                var15 += arg1 * var44 >> 15;
                                var16 = true;
                            } else {
                                this.field1831 += arg1 * var42 >> 15;
                                this.field1830 += arg1 * var43 >> 15;
                                this.field1833 += arg1 * var44 >> 15;
                            }
                        } else if (var32.field4558 == 0) {
                            var13 += (var31.field2020 - var41) * arg1;
                            var14 += (var32.field4569 - var41) * arg1;
                            var15 += (var31.field2012 - var41) * arg1;
                            var16 = true;
                        } else {
                            this.field1831 += (var31.field2020 - var41) * arg1;
                            this.field1830 += (var32.field4569 - var41) * arg1;
                            this.field1833 += (var31.field2012 - var41) * arg1;
                        }
                    }
                }
            }
        }
        if (var8.field5015 != null) {
            for (int var45 = 0; var45 < var8.field5015.length; var45++) {
                class112 var46 = (class112) class295.field4941.method255(-7518, (long) var8.field5015[var45]);
                while (var46 != null) {
                    class269 var47 = var46.field2015.field4638;
                    int var48 = var4 - var46.field2027;
                    int var49 = var5 - var46.field2023;
                    int var50 = var6 - var46.field2021;
                    long var51 = (long) (var50 * var50 + var48 * var48 + var49 * var49);
                    if (var51 > var47.field4561) {
                        var46 = (class112) class295.field4941.method259(10576);
                    } else {
                        int var53 = (int) Math.sqrt((double) var51);
                        if (var53 == 0) {
                            var53 = 1;
                        }
                        long var54 = (long) (var46.field2012 * var50 + var46.field2020 * var48 + var47.field4569 * var49) * 65535L / (long) (var47.field4562 * var53);
                        if (var54 < (long) var47.field4568) {
                            var46 = (class112) class295.field4941.method259(10576);
                        } else {
                            int var56 = 0;
                            if (var47.field4551 == 1) {
                                var56 = (var53 >> 4) * var47.field4566;
                            } else if (var47.field4551 == 2) {
                                var56 = (var53 >> 4) * (var53 >> 4) * var47.field4566;
                            }
                            if (var47.field4564 != 0) {
                                int var57 = (var48 << 15) / var53 * var47.field4562;
                                int var58 = (var49 << 15) / var53 * var47.field4562;
                                int var59 = (var50 << 15) / var53 * var47.field4562;
                                if (var47.field4558 == 0) {
                                    var13 += arg1 * var57 >> 15;
                                    var14 += arg1 * var58 >> 15;
                                    var15 += arg1 * var59 >> 15;
                                    var16 = true;
                                } else {
                                    this.field1831 += arg1 * var57 >> 15;
                                    this.field1830 += arg1 * var58 >> 15;
                                    this.field1833 += arg1 * var59 >> 15;
                                }
                            } else if (var47.field4558 == 0) {
                                var13 += (var46.field2020 - var56) * arg1;
                                var14 += (var47.field4569 - var56) * arg1;
                                var15 += (var46.field2012 - var56) * arg1;
                                var16 = true;
                            } else {
                                this.field1831 += (var46.field2020 - var56) * arg1;
                                this.field1830 += (var47.field4569 - var56) * arg1;
                                this.field1833 += (var46.field2012 - var56) * arg1;
                            }
                            var46 = (class112) class295.field4941.method259(10576);
                        }
                    }
                }
            }
        }
        if (var8.field5041 != null) {
            for (int var60 = 0; var60 < var8.field5041.length; var60++) {
                class269 var61 = class307.method2120(1, var8.field5041[var60]);
                if (var61.field4558 == 0) {
                    var13 += var61.field4552 * arg1;
                    var14 += var61.field4569 * arg1;
                    var15 += var61.field4567 * arg1;
                    var16 = true;
                } else {
                    this.field1831 += var61.field4552 * arg1;
                    this.field1830 += var61.field4569 * arg1;
                    this.field1833 += var61.field4567 * arg1;
                }
            }
        }
        if (var16) {
            while (true) {
                if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                    this.field1826 = (short) var13;
                    this.field1829 = (short) var14;
                    this.field1835 = (short) var15;
                    break;
                }
                var13 >>= 0x1;
                var14 >>= 0x1;
                var15 >>= 0x1;
                this.field1834 <<= 0x1;
            }
        }
        this.field1831 = (int) ((long) this.field1831 + ((long) this.field1826 * (long) this.field1834 >> 23) * (long) arg1);
        this.field1830 = (int) ((long) this.field1830 + ((long) this.field1829 * (long) this.field1834 >> 23) * (long) arg1);
        this.field1833 = (int) ((long) this.field1833 + ((long) this.field1835 * (long) this.field1834 >> 23) * (long) arg1);
        int var62 = this.field1831 >> 19;
        int var63 = this.field1833 >> 19;
        int var64 = this.field1830 >> field1832;
        if (var64 > 0 || var64 < -65535 || var62 < 0 || var62 >= class89.field1605 || var63 < 0 || var63 >= class38.field658) {
            this.method714();
            return;
        }
        int[][][] var65 = class245.field4255;
        int var66 = var65[var7.field4973][var62][var63];
        int var67;
        if (var7.field4973 < 3) {
            var67 = var65[var7.field4973 + 1][var62][var63];
        } else {
            var67 = var65[var7.field4973][var62][var63] - 1024;
        }
        if (var8.field5035) {
            if (var8.field5007 == -1 && var64 > var66) {
                this.method714();
                return;
            }
            if (var8.field5007 >= 0 && var64 > var65[var8.field5007][var62][var63]) {
                this.method714();
                return;
            }
            if (var8.field5032 == -1 && var64 < var67) {
                this.method714();
                return;
            }
            if (var8.field5032 >= 0 && var64 < var65[var8.field5032 + 1][var62][var63]) {
                this.method714();
                return;
            }
        }
        if (var62 >= var7.field4967 && var62 <= var7.field4962 && var63 >= var7.field4963 && var63 <= var7.field4964 && var64 <= var7.field4975 && var64 >= var7.field4970) {
            this.field1827 = false;
            return;
        }
        this.field1827 = true;
        byte var68 = 3;
        if (var64 > var65[1][var62][var63]) {
            var68 = 0;
        } else if (var64 > var65[2][var62][var63]) {
            var68 = 1;
        } else if (var64 > var65[3][var62][var63]) {
            var68 = 2;
        } else if (var64 < var65[3][var62][var63] - 1024) {
            this.method714();
            return;
        }
        class16 var69 = class15.field120[var68][var62][var63];
        if (var69 == null) {
            var69 = class15.field120[var68][var62][var63] = new class16(var68, var62, var63);
        }
        if (var69.field150 == null) {
            var69.field150 = new class256();
            var69.field167 = (byte) ((int) (arg0 & 0xFFL));
        } else if ((byte) ((int) (arg0 & 0xFFL)) != var69.field167) {
            var69.field150.method1834(78);
            var69.field167 = (byte) ((int) (arg0 & 0xFFL));
        }
        var69.field150.method1830(this, 1);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lcj;IIIIIIIII)V", line = 473)
    public final void method713(class306 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field1824 = arg0;
        this.field1831 = arg1 << field1832;
        this.field1830 = arg2 << field1832;
        this.field1833 = arg3 << field1832;
        this.field1828 = arg9;
        this.field1837 = this.field1836 = (short) arg8;
        this.field1826 = (short) arg4;
        this.field1829 = (short) arg5;
        this.field1835 = (short) arg6;
        this.field1834 = arg7;
        this.method711();
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Lcj;IIIIIIIII)V", line = 506)
    public class103(class306 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field1824 = arg0;
        this.field1831 = arg1 << field1832;
        this.field1830 = arg2 << field1832;
        this.field1833 = arg3 << field1832;
        this.field1828 = arg9;
        this.field1837 = this.field1836 = (short) arg8;
        this.field1826 = (short) arg4;
        this.field1829 = (short) arg5;
        this.field1835 = (short) arg6;
        this.field1834 = arg7;
        this.method711();
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "()V", line = 499)
    private final void method714() {
        this.field1824.field5206.field4936[this.field1825] = null;
        class295.field4933[class295.field4932] = this;
        class295.field4932 = class295.field4932 + 1 & 0x3FF;
        this.field1824 = null;
        this.method1339(0);
        this.method98(412);
    }
}
