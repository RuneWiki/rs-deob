import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class176 extends class255 {

    @OriginalMember(owner = "client!ba", name = "I", descriptor = "Z")
    public boolean field2936 = false;

    @OriginalMember(owner = "client!ba", name = "L", descriptor = "Lfd;")
    public class130 field2939;

    @OriginalMember(owner = "client!ba", name = "x", descriptor = "I")
    public int field2925;

    @OriginalMember(owner = "client!ba", name = "z", descriptor = "I")
    public int field2927;

    @OriginalMember(owner = "client!ba", name = "y", descriptor = "I")
    public int field2926;

    @OriginalMember(owner = "client!ba", name = "A", descriptor = "I")
    public int field2928;

    @OriginalMember(owner = "client!ba", name = "G", descriptor = "S")
    private short field2934;

    @OriginalMember(owner = "client!ba", name = "E", descriptor = "S")
    private short field2932;

    @OriginalMember(owner = "client!ba", name = "F", descriptor = "S")
    private short field2933;

    @OriginalMember(owner = "client!ba", name = "B", descriptor = "S")
    private short field2929;

    @OriginalMember(owner = "client!ba", name = "K", descriptor = "S")
    private short field2938;

    @OriginalMember(owner = "client!ba", name = "J", descriptor = "I")
    private int field2937;

    @OriginalMember(owner = "client!ba", name = "D", descriptor = "I")
    private static int field2931 = 12;

    @OriginalMember(owner = "client!ba", name = "H", descriptor = "I")
    private int field2935;

    @OriginalMember(owner = "client!ba", name = "C", descriptor = "S")
    private short field2930;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "()V")
    private final void method1243() {
        this.field2939.field2096.field2986[this.field2930] = null;
        class181.field2985[class181.field2994] = this;
        class181.field2994 = class181.field2994 + 1 & 0x3FF;
        this.field2939 = null;
        this.method2064(20307);
        this.method1727((byte) -54);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lfd;IIIIIIIII)V")
    public final void method1244(class130 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field2939 = arg0;
        this.field2925 = arg1 << field2931;
        this.field2927 = arg2 << field2931;
        this.field2926 = arg3 << field2931;
        this.field2928 = arg9;
        this.field2932 = this.field2934 = (short) arg8;
        this.field2933 = (short) arg4;
        this.field2929 = (short) arg5;
        this.field2938 = (short) arg6;
        this.field2937 = arg7;
        this.method1245();
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "()V")
    private final void method1245() {
        int var1 = this.field2939.field2096.field2999;
        if (this.field2939.field2096.field2986[var1] != null) {
            this.field2939.field2096.field2986[var1].method1243();
        }
        this.field2939.field2096.field2986[var1] = this;
        this.field2930 = (short) this.field2939.field2096.field2999;
        this.field2939.field2096.field2999 = var1 + 1 & 0x1FFF;
        this.field2939.field2067.method726(this, -15473);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(JI)V")
    public final void method1246(long arg0, int arg1) {
        if (this.field2939 == null) {
            return;
        }
        this.field2934 = (short) (this.field2934 - arg1);
        if (this.field2934 <= 0) {
            this.method1243();
            return;
        }
        int var4 = this.field2925 >> field2931;
        int var5 = this.field2927 >> field2931;
        int var6 = this.field2926 >> field2931;
        class181 var7 = this.field2939.field2096;
        class118 var8 = this.field2939.field2099;
        if (var8.field1846 != 0) {
            if (this.field2932 - this.field2934 <= var8.field1855) {
                int var9 = var8.field1845 * arg1 + (this.field2935 >> 16 & 0xFF) + (this.field2928 >> 8 & 0xFF00);
                int var10 = var8.field1830 * arg1 + (this.field2935 >> 8 & 0xFF) + (this.field2928 & 0xFF00);
                int var11 = var8.field1829 * arg1 + (this.field2928 & 0xFF << 8) + (this.field2935 & 0xFF);
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
                this.field2928 &= 0xFF000000;
                this.field2928 |= ((var11 & 0xFF00) >> 8) + ((var9 & 0xFF00) << 8) + (var10 & 0xFF00);
                this.field2935 &= 0xFF000000;
                this.field2935 |= (var11 & 0xFF) + ((var9 & 0xFF) << 16) + ((var10 & 0xFF) << 8);
            }
            if (this.field2932 - this.field2934 <= var8.field1870) {
                int var12 = var8.field1842 * arg1 + (this.field2935 >> 24 & 0xFF) + (this.field2928 >> 16 & 0xFF00);
                if (var12 < 0) {
                    var12 = 0;
                } else if (var12 > 65535) {
                    var12 = 65535;
                }
                this.field2928 &= 0xFFFFFF;
                this.field2928 |= (var12 & 0xFF00) << 16;
                this.field2935 &= 0xFFFFFF;
                this.field2935 |= (var12 & 0xFF) << 24;
            }
        }
        if (var8.field1807 != -1 && this.field2932 - this.field2934 <= var8.field1853) {
            this.field2937 += var8.field1834 * arg1;
        }
        int var13 = this.field2933;
        int var14 = this.field2929;
        int var15 = this.field2938;
        boolean var16 = false;
        if (var8.field1815 == 1) {
            int var17 = var4 - this.field2939.field2074;
            int var18 = var5 - this.field2939.field2086;
            int var19 = var6 - this.field2939.field2085;
            int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
            long var21 = (long) (var8.field1824 * var20 * arg1);
            this.field2937 = (int) ((long) this.field2937 - ((long) this.field2937 * var21 >> 18));
        } else if (var8.field1815 == 2) {
            int var23 = var4 - this.field2939.field2074;
            int var24 = var5 - this.field2939.field2086;
            int var25 = var6 - this.field2939.field2085;
            int var26 = var25 * var25 + var23 * var23 + var24 * var24;
            long var27 = (long) (var8.field1824 * var26 * arg1);
            this.field2937 = (int) ((long) this.field2937 - ((long) this.field2937 * var27 >> 28));
        }
        class137 var29 = var7.field3002.field3510;
        for (class137 var30 = var29.field2216; var30 != var29; var30 = var30.field2216) {
            class295 var57 = (class295) var30;
            class80 var58 = var57.field4810.field1722;
            if (var58.field1282 != 1) {
                int var59 = var4 - var57.field4818;
                int var60 = var5 - var57.field4813;
                int var61 = var6 - var57.field4808;
                long var62 = (long) (var61 * var61 + var59 * var59 + var60 * var60);
                if (var62 <= var58.field1287) {
                    int var64 = (int) Math.sqrt((double) var62);
                    if (var64 == 0) {
                        var64 = 1;
                    }
                    long var65 = (long) (var57.field4811 * var61 + var57.field4816 * var59 + var58.field1291 * var60) * 65535L / (long) (var58.field1278 * var64);
                    if (var65 >= (long) var58.field1299) {
                        int var67 = 0;
                        if (var58.field1280 == 1) {
                            var67 = (var64 >> 4) * var58.field1285;
                        } else if (var58.field1280 == 2) {
                            var67 = (var64 >> 4) * (var64 >> 4) * var58.field1285;
                        }
                        if (var58.field1284 != 0) {
                            int var68 = (var59 << 15) / var64 * var58.field1278;
                            int var69 = (var60 << 15) / var64 * var58.field1278;
                            int var70 = (var61 << 15) / var64 * var58.field1278;
                            if (var58.field1289 == 0) {
                                var13 += arg1 * var68 >> 15;
                                var14 += arg1 * var69 >> 15;
                                var15 += arg1 * var70 >> 15;
                                var16 = true;
                            } else {
                                this.field2925 += arg1 * var68 >> 15;
                                this.field2927 += arg1 * var69 >> 15;
                                this.field2926 += arg1 * var70 >> 15;
                            }
                        } else if (var58.field1289 == 0) {
                            var13 += (var57.field4816 - var67) * arg1;
                            var14 += (var58.field1291 - var67) * arg1;
                            var15 += (var57.field4811 - var67) * arg1;
                            var16 = true;
                        } else {
                            this.field2925 += (var57.field4816 - var67) * arg1;
                            this.field2927 += (var58.field1291 - var67) * arg1;
                            this.field2926 += (var57.field4811 - var67) * arg1;
                        }
                    }
                }
            }
        }
        if (var8.field1869 != null) {
            for (int var31 = 0; var31 < var8.field1869.length; var31++) {
                class295 var32 = (class295) class181.field2988.method996(1, (long) var8.field1869[var31]);
                while (var32 != null) {
                    class80 var33 = var32.field4810.field1722;
                    int var34 = var4 - var32.field4818;
                    int var35 = var5 - var32.field4813;
                    int var36 = var6 - var32.field4808;
                    long var37 = (long) (var36 * var36 + var34 * var34 + var35 * var35);
                    if (var37 > var33.field1287) {
                        var32 = (class295) class181.field2988.method995(40);
                    } else {
                        int var39 = (int) Math.sqrt((double) var37);
                        if (var39 == 0) {
                            var39 = 1;
                        }
                        long var40 = (long) (var32.field4811 * var36 + var32.field4816 * var34 + var33.field1291 * var35) * 65535L / (long) (var33.field1278 * var39);
                        if (var40 < (long) var33.field1299) {
                            var32 = (class295) class181.field2988.method995(40);
                        } else {
                            int var42 = 0;
                            if (var33.field1280 == 1) {
                                var42 = (var39 >> 4) * var33.field1285;
                            } else if (var33.field1280 == 2) {
                                var42 = (var39 >> 4) * (var39 >> 4) * var33.field1285;
                            }
                            if (var33.field1284 != 0) {
                                int var43 = (var34 << 15) / var39 * var33.field1278;
                                int var44 = (var35 << 15) / var39 * var33.field1278;
                                int var45 = (var36 << 15) / var39 * var33.field1278;
                                if (var33.field1289 == 0) {
                                    var13 += arg1 * var43 >> 15;
                                    var14 += arg1 * var44 >> 15;
                                    var15 += arg1 * var45 >> 15;
                                    var16 = true;
                                } else {
                                    this.field2925 += arg1 * var43 >> 15;
                                    this.field2927 += arg1 * var44 >> 15;
                                    this.field2926 += arg1 * var45 >> 15;
                                }
                            } else if (var33.field1289 == 0) {
                                var13 += (var32.field4816 - var42) * arg1;
                                var14 += (var33.field1291 - var42) * arg1;
                                var15 += (var32.field4811 - var42) * arg1;
                                var16 = true;
                            } else {
                                this.field2925 += (var32.field4816 - var42) * arg1;
                                this.field2927 += (var33.field1291 - var42) * arg1;
                                this.field2926 += (var32.field4811 - var42) * arg1;
                            }
                            var32 = (class295) class181.field2988.method995(40);
                        }
                    }
                }
            }
        }
        if (var8.field1809 != null) {
            if (var8.field1843 == null) {
                var8.field1843 = new int[var8.field1809.length];
                for (int var46 = 0; var46 < var8.field1809.length; var46++) {
                    class200.method1377(var8.field1809[var46], 108);
                    var8.field1843[var46] = ((class71) class296.field4830.method371(-105, (long) var8.field1809[var46])).field1138;
                }
            }
            for (int var47 = 0; var47 < var8.field1843.length; var47++) {
                class80 var48 = class210.field3349[var8.field1843[var47]];
                if (var48.field1289 == 0) {
                    var13 += var48.field1295 * arg1;
                    var14 += var48.field1291 * arg1;
                    var15 += var48.field1293 * arg1;
                    var16 = true;
                } else {
                    this.field2925 += var48.field1295 * arg1;
                    this.field2927 += var48.field1291 * arg1;
                    this.field2926 += var48.field1293 * arg1;
                }
            }
        }
        if (var16) {
            while (true) {
                if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                    this.field2933 = (short) var13;
                    this.field2929 = (short) var14;
                    this.field2938 = (short) var15;
                    break;
                }
                var13 >>= 0x1;
                var14 >>= 0x1;
                var15 >>= 0x1;
                this.field2937 <<= 0x1;
            }
        }
        this.field2925 = (int) ((long) this.field2925 + ((long) this.field2933 * (long) this.field2937 >> 23) * (long) arg1);
        this.field2927 = (int) ((long) this.field2927 + ((long) this.field2929 * (long) this.field2937 >> 23) * (long) arg1);
        this.field2926 = (int) ((long) this.field2926 + ((long) this.field2938 * (long) this.field2937 >> 23) * (long) arg1);
        int var49 = this.field2925 >> 19;
        int var50 = this.field2926 >> 19;
        int var51 = this.field2927 >> field2931;
        if (var51 > 0 || var51 < -65535 || var49 < 0 || var49 >= class95.field1504 || var50 < 0 || var50 >= class200.field3208) {
            this.method1243();
            return;
        }
        int[][][] var52 = class166.field2746;
        int var53 = var52[var7.field3014][var49][var50];
        int var54;
        if (var7.field3014 < 3) {
            var54 = var52[var7.field3014 + 1][var49][var50];
        } else {
            var54 = var52[var7.field3014][var49][var50] - 1024;
        }
        if (var8.field1831) {
            if (var8.field1850 == -1 && var51 > var53) {
                this.method1243();
                return;
            }
            if (var8.field1850 >= 0 && var51 > var52[var8.field1850][var49][var50]) {
                this.method1243();
                return;
            }
            if (var8.field1835 == -1 && var51 < var54) {
                this.method1243();
                return;
            }
            if (var8.field1835 >= 0 && var51 < var52[var8.field1835 + 1][var49][var50]) {
                this.method1243();
                return;
            }
        }
        if (var49 >= var7.field3007 && var49 <= var7.field3008 && var50 >= var7.field3013 && var50 <= var7.field3010 && var51 <= var7.field3011 && var51 >= var7.field3015) {
            this.field2936 = false;
            return;
        }
        this.field2936 = true;
        byte var55 = 3;
        if (var51 > var52[1][var49][var50]) {
            var55 = 0;
        } else if (var51 > var52[2][var49][var50]) {
            var55 = 1;
        } else if (var51 > var52[3][var49][var50]) {
            var55 = 2;
        } else if (var51 < var52[3][var49][var50] - 1024) {
            this.method1243();
            return;
        }
        class116 var56 = class307.field4991[var55][var49][var50];
        if (var56 == null) {
            var56 = class307.field4991[var55][var49][var50] = new class116(var55, var49, var50);
        }
        if (var56.field1774 == null) {
            var56.field1774 = new class129();
            var56.field1770 = (byte) ((int) (arg0 & 0xFFL));
        } else if ((byte) ((int) (arg0 & 0xFFL)) != var56.field1770) {
            var56.field1774.method880((byte) 106);
            var56.field1770 = (byte) ((int) (arg0 & 0xFFL));
        }
        var56.field1774.method881(this, (byte) 21);
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(Lfd;IIIIIIIII)V")
    public class176(class130 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field2939 = arg0;
        this.field2925 = arg1 << field2931;
        this.field2927 = arg2 << field2931;
        this.field2926 = arg3 << field2931;
        this.field2928 = arg9;
        this.field2932 = this.field2934 = (short) arg8;
        this.field2933 = (short) arg4;
        this.field2929 = (short) arg5;
        this.field2938 = (short) arg6;
        this.field2937 = arg7;
        this.method1245();
    }
}
