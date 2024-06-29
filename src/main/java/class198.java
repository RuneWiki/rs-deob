import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class198 extends class165 {

    @OriginalMember(owner = "client!jb", name = "A", descriptor = "Z")
    public boolean field2910 = false;

    @OriginalMember(owner = "client!jb", name = "H", descriptor = "La;")
    public class258 field2917;

    @OriginalMember(owner = "client!jb", name = "u", descriptor = "I")
    public int field2904;

    @OriginalMember(owner = "client!jb", name = "F", descriptor = "I")
    public int field2915;

    @OriginalMember(owner = "client!jb", name = "G", descriptor = "I")
    public int field2916;

    @OriginalMember(owner = "client!jb", name = "z", descriptor = "I")
    public int field2909;

    @OriginalMember(owner = "client!jb", name = "D", descriptor = "S")
    private short field2913;

    @OriginalMember(owner = "client!jb", name = "E", descriptor = "S")
    private short field2914;

    @OriginalMember(owner = "client!jb", name = "I", descriptor = "S")
    private short field2918;

    @OriginalMember(owner = "client!jb", name = "C", descriptor = "S")
    private short field2912;

    @OriginalMember(owner = "client!jb", name = "v", descriptor = "S")
    private short field2905;

    @OriginalMember(owner = "client!jb", name = "y", descriptor = "I")
    private int field2908;

    @OriginalMember(owner = "client!jb", name = "w", descriptor = "I")
    private static int field2906 = 12;

    @OriginalMember(owner = "client!jb", name = "x", descriptor = "I")
    private int field2907;

    @OriginalMember(owner = "client!jb", name = "B", descriptor = "S")
    private short field2911;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "()V")
    private final void method1397() {
        this.field2917.field3992.field1403[this.field2911] = null;
        class88.field1397[class88.field1399] = this;
        class88.field1399 = class88.field1399 + 1 & 0x3FF;
        this.field2917 = null;
        this.method1969((byte) 93);
        this.method1185(-11201);
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "()V")
    private final void method1398() {
        int var1 = this.field2917.field3992.field1394;
        if (this.field2917.field3992.field1403[var1] != null) {
            this.field2917.field3992.field1403[var1].method1397();
        }
        this.field2917.field3992.field1403[var1] = this;
        this.field2911 = (short) this.field2917.field3992.field1394;
        this.field2917.field3992.field1394 = var1 + 1 & 0x1FFF;
        this.field2917.field3998.method184(80, this);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(JI)V")
    public final void method1399(long arg0, int arg1) {
        if (this.field2917 == null) {
            return;
        }
        this.field2913 = (short) (this.field2913 - arg1);
        if (this.field2913 <= 0) {
            this.method1397();
            return;
        }
        int var4 = this.field2904 >> field2906;
        int var5 = this.field2915 >> field2906;
        int var6 = this.field2916 >> field2906;
        class88 var7 = this.field2917.field3992;
        class124 var8 = this.field2917.field3981;
        if (var8.field2052 != 0) {
            if (this.field2914 - this.field2913 <= var8.field2084) {
                int var9 = var8.field2087 * arg1 + (this.field2909 >> 8 & 0xFF00) + (this.field2907 >> 16 & 0xFF);
                int var10 = var8.field2079 * arg1 + (this.field2907 >> 8 & 0xFF) + (this.field2909 & 0xFF00);
                int var11 = var8.field2050 * arg1 + (this.field2909 & 0xFF << 8) + (this.field2907 & 0xFF);
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
                this.field2909 &= 0xFF000000;
                this.field2909 |= ((var11 & 0xFF00) >> 8) + ((var9 & 0xFF00) << 8) + (var10 & 0xFF00);
                this.field2907 &= 0xFF000000;
                this.field2907 |= (var11 & 0xFF) + ((var9 & 0xFF) << 16) + ((var10 & 0xFF) << 8);
            }
            if (this.field2914 - this.field2913 <= var8.field2102) {
                int var12 = var8.field2054 * arg1 + (this.field2909 >> 16 & 0xFF00) + (this.field2907 >> 24 & 0xFF);
                if (var12 < 0) {
                    var12 = 0;
                } else if (var12 > 65535) {
                    var12 = 65535;
                }
                this.field2909 &= 0xFFFFFF;
                this.field2909 |= (var12 & 0xFF00) << 16;
                this.field2907 &= 0xFFFFFF;
                this.field2907 |= (var12 & 0xFF) << 24;
            }
        }
        if (var8.field2105 != -1 && this.field2914 - this.field2913 <= var8.field2098) {
            this.field2908 += var8.field2083 * arg1;
        }
        int var13 = this.field2918;
        int var14 = this.field2912;
        int var15 = this.field2905;
        boolean var16 = false;
        if (var8.field2076 == 1) {
            int var17 = var4 - this.field2917.field3976;
            int var18 = var5 - this.field2917.field3975;
            int var19 = var6 - this.field2917.field3973;
            int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
            long var21 = (long) (var8.field2112 * var20 * arg1);
            this.field2908 = (int) ((long) this.field2908 - ((long) this.field2908 * var21 >> 18));
        } else if (var8.field2076 == 2) {
            int var23 = var4 - this.field2917.field3976;
            int var24 = var5 - this.field2917.field3975;
            int var25 = var6 - this.field2917.field3973;
            int var26 = var25 * var25 + var23 * var23 + var24 * var24;
            long var27 = (long) (var8.field2112 * var26 * arg1);
            this.field2908 = (int) ((long) this.field2908 - ((long) this.field2908 * var27 >> 28));
        }
        class259 var29 = var7.field1414.field22;
        for (class259 var30 = var29.field4013; var30 != var29; var30 = var30.field4013) {
            class236 var57 = (class236) var30;
            class142 var58 = var57.field3454.field1698;
            if (var58.field2286 != 1) {
                int var59 = var4 - var57.field3444;
                int var60 = var5 - var57.field3449;
                int var61 = var6 - var57.field3446;
                long var62 = (long) (var61 * var61 + var59 * var59 + var60 * var60);
                if (var62 <= var58.field2304) {
                    int var64 = (int) Math.sqrt((double) var62);
                    if (var64 == 0) {
                        var64 = 1;
                    }
                    long var65 = (long) (var57.field3442 * var61 + var57.field3457 * var59 + var58.field2291 * var60) * 65535L / (long) (var58.field2300 * var64);
                    if (var65 >= (long) var58.field2290) {
                        int var67 = 0;
                        if (var58.field2303 == 1) {
                            var67 = (var64 >> 4) * var58.field2287;
                        } else if (var58.field2303 == 2) {
                            var67 = (var64 >> 4) * (var64 >> 4) * var58.field2287;
                        }
                        if (var58.field2289 != 0) {
                            int var68 = (var59 << 15) / var64 * var58.field2300;
                            int var69 = (var60 << 15) / var64 * var58.field2300;
                            int var70 = (var61 << 15) / var64 * var58.field2300;
                            if (var58.field2295 == 0) {
                                var13 += arg1 * var68 >> 15;
                                var14 += arg1 * var69 >> 15;
                                var15 += arg1 * var70 >> 15;
                                var16 = true;
                            } else {
                                this.field2904 += arg1 * var68 >> 15;
                                this.field2915 += arg1 * var69 >> 15;
                                this.field2916 += arg1 * var70 >> 15;
                            }
                        } else if (var58.field2295 == 0) {
                            var13 += (var57.field3457 - var67) * arg1;
                            var14 += (var58.field2291 - var67) * arg1;
                            var15 += (var57.field3442 - var67) * arg1;
                            var16 = true;
                        } else {
                            this.field2904 += (var57.field3457 - var67) * arg1;
                            this.field2915 += (var58.field2291 - var67) * arg1;
                            this.field2916 += (var57.field3442 - var67) * arg1;
                        }
                    }
                }
            }
        }
        if (var8.field2090 != null) {
            for (int var31 = 0; var31 < var8.field2090.length; var31++) {
                class236 var32 = (class236) class88.field1402.method1516(10042, (long) var8.field2090[var31]);
                while (var32 != null) {
                    class142 var33 = var32.field3454.field1698;
                    int var34 = var4 - var32.field3444;
                    int var35 = var5 - var32.field3449;
                    int var36 = var6 - var32.field3446;
                    long var37 = (long) (var36 * var36 + var34 * var34 + var35 * var35);
                    if (var37 > var33.field2304) {
                        var32 = (class236) class88.field1402.method1518((byte) 123);
                    } else {
                        int var39 = (int) Math.sqrt((double) var37);
                        if (var39 == 0) {
                            var39 = 1;
                        }
                        long var40 = (long) (var32.field3442 * var36 + var32.field3457 * var34 + var33.field2291 * var35) * 65535L / (long) (var33.field2300 * var39);
                        if (var40 < (long) var33.field2290) {
                            var32 = (class236) class88.field1402.method1518((byte) 102);
                        } else {
                            int var42 = 0;
                            if (var33.field2303 == 1) {
                                var42 = (var39 >> 4) * var33.field2287;
                            } else if (var33.field2303 == 2) {
                                var42 = (var39 >> 4) * (var39 >> 4) * var33.field2287;
                            }
                            if (var33.field2289 != 0) {
                                int var43 = (var34 << 15) / var39 * var33.field2300;
                                int var44 = (var35 << 15) / var39 * var33.field2300;
                                int var45 = (var36 << 15) / var39 * var33.field2300;
                                if (var33.field2295 == 0) {
                                    var13 += arg1 * var43 >> 15;
                                    var14 += arg1 * var44 >> 15;
                                    var15 += arg1 * var45 >> 15;
                                    var16 = true;
                                } else {
                                    this.field2904 += arg1 * var43 >> 15;
                                    this.field2915 += arg1 * var44 >> 15;
                                    this.field2916 += arg1 * var45 >> 15;
                                }
                            } else if (var33.field2295 == 0) {
                                var13 += (var32.field3457 - var42) * arg1;
                                var14 += (var33.field2291 - var42) * arg1;
                                var15 += (var32.field3442 - var42) * arg1;
                                var16 = true;
                            } else {
                                this.field2904 += (var32.field3457 - var42) * arg1;
                                this.field2915 += (var33.field2291 - var42) * arg1;
                                this.field2916 += (var32.field3442 - var42) * arg1;
                            }
                            var32 = (class236) class88.field1402.method1518((byte) 121);
                        }
                    }
                }
            }
        }
        if (var8.field2097 != null) {
            if (var8.field2115 == null) {
                var8.field2115 = new int[var8.field2097.length];
                for (int var46 = 0; var46 < var8.field2097.length; var46++) {
                    class294.method1994(88, var8.field2097[var46]);
                    var8.field2115[var46] = ((class108) class225.field3304.method1073(-1, (long) var8.field2097[var46])).field1828;
                }
            }
            for (int var47 = 0; var47 < var8.field2115.length; var47++) {
                class142 var48 = class265.field4244[var8.field2115[var47]];
                if (var48.field2295 == 0) {
                    var13 += var48.field2296 * arg1;
                    var14 += var48.field2291 * arg1;
                    var15 += var48.field2307 * arg1;
                    var16 = true;
                } else {
                    this.field2904 += var48.field2296 * arg1;
                    this.field2915 += var48.field2291 * arg1;
                    this.field2916 += var48.field2307 * arg1;
                }
            }
        }
        if (var16) {
            while (true) {
                if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                    this.field2918 = (short) var13;
                    this.field2912 = (short) var14;
                    this.field2905 = (short) var15;
                    break;
                }
                var13 >>= 0x1;
                var14 >>= 0x1;
                var15 >>= 0x1;
                this.field2908 <<= 0x1;
            }
        }
        this.field2904 = (int) ((long) this.field2904 + ((long) this.field2918 * (long) this.field2908 >> 23) * (long) arg1);
        this.field2915 = (int) ((long) this.field2915 + ((long) this.field2912 * (long) this.field2908 >> 23) * (long) arg1);
        this.field2916 = (int) ((long) this.field2916 + ((long) this.field2905 * (long) this.field2908 >> 23) * (long) arg1);
        int var49 = this.field2904 >> 19;
        int var50 = this.field2916 >> 19;
        int var51 = this.field2915 >> field2906;
        if (var51 > 0 || var51 < -65535 || var49 < 0 || var49 >= class159.field2481 || var50 < 0 || var50 >= class7.field67) {
            this.method1397();
            return;
        }
        int[][][] var52 = class103.field1792;
        int var53 = var52[var7.field1426][var49][var50];
        int var54;
        if (var7.field1426 < 3) {
            var54 = var52[var7.field1426 + 1][var49][var50];
        } else {
            var54 = var52[var7.field1426][var49][var50] - 1024;
        }
        if (var8.field2070) {
            if (var8.field2082 == -1 && var51 > var53) {
                this.method1397();
                return;
            }
            if (var8.field2082 >= 0 && var51 > var52[var8.field2082][var49][var50]) {
                this.method1397();
                return;
            }
            if (var8.field2104 == -1 && var51 < var54) {
                this.method1397();
                return;
            }
            if (var8.field2104 >= 0 && var51 < var52[var8.field2104 + 1][var49][var50]) {
                this.method1397();
                return;
            }
        }
        if (var49 >= var7.field1427 && var49 <= var7.field1417 && var50 >= var7.field1428 && var50 <= var7.field1419 && var51 <= var7.field1423 && var51 >= var7.field1431) {
            this.field2910 = false;
            return;
        }
        this.field2910 = true;
        byte var55 = 3;
        if (var51 > var52[1][var49][var50]) {
            var55 = 0;
        } else if (var51 > var52[2][var49][var50]) {
            var55 = 1;
        } else if (var51 > var52[3][var49][var50]) {
            var55 = 2;
        } else if (var51 < var52[3][var49][var50] - 1024) {
            this.method1397();
            return;
        }
        class313 var56 = class223.field3286[var55][var49][var50];
        if (var56 == null) {
            var56 = class223.field3286[var55][var49][var50] = new class313(var55, var49, var50);
        }
        if (var56.field5015 == null) {
            var56.field5015 = new class297();
            var56.field5034 = (byte) ((int) (arg0 & 0xFFL));
        } else if ((byte) ((int) (arg0 & 0xFFL)) != var56.field5034) {
            var56.field5015.method2021((byte) -52);
            var56.field5034 = (byte) ((int) (arg0 & 0xFFL));
        }
        var56.field5015.method2020(this, (byte) 106);
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(La;IIIIIIIII)V")
    public class198(class258 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field2917 = arg0;
        this.field2904 = arg1 << field2906;
        this.field2915 = arg2 << field2906;
        this.field2916 = arg3 << field2906;
        this.field2909 = arg9;
        this.field2914 = this.field2913 = (short) arg8;
        this.field2918 = (short) arg4;
        this.field2912 = (short) arg5;
        this.field2905 = (short) arg6;
        this.field2908 = arg7;
        this.method1398();
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(La;IIIIIIIII)V")
    public final void method1400(class258 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field2917 = arg0;
        this.field2904 = arg1 << field2906;
        this.field2915 = arg2 << field2906;
        this.field2916 = arg3 << field2906;
        this.field2909 = arg9;
        this.field2914 = this.field2913 = (short) arg8;
        this.field2918 = (short) arg4;
        this.field2912 = (short) arg5;
        this.field2905 = (short) arg6;
        this.field2908 = arg7;
        this.method1398();
    }
}
