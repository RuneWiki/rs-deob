import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class137 extends class83 {

    @OriginalMember(owner = "client!tm", name = "L", descriptor = "Z")
    public boolean field2275 = false;

    @OriginalMember(owner = "client!tm", name = "M", descriptor = "Lvi;")
    public class270 field2276;

    @OriginalMember(owner = "client!tm", name = "P", descriptor = "I")
    public int field2279;

    @OriginalMember(owner = "client!tm", name = "K", descriptor = "I")
    public int field2274;

    @OriginalMember(owner = "client!tm", name = "E", descriptor = "I")
    public int field2269;

    @OriginalMember(owner = "client!tm", name = "Q", descriptor = "I")
    public int field2280;

    @OriginalMember(owner = "client!tm", name = "H", descriptor = "S")
    private short field2272;

    @OriginalMember(owner = "client!tm", name = "D", descriptor = "S")
    private short field2268;

    @OriginalMember(owner = "client!tm", name = "B", descriptor = "S")
    private short field2266;

    @OriginalMember(owner = "client!tm", name = "F", descriptor = "S")
    private short field2270;

    @OriginalMember(owner = "client!tm", name = "O", descriptor = "S")
    private short field2278;

    @OriginalMember(owner = "client!tm", name = "N", descriptor = "I")
    private int field2277;

    @OriginalMember(owner = "client!tm", name = "I", descriptor = "I")
    private static int field2273 = 12;

    @OriginalMember(owner = "client!tm", name = "G", descriptor = "I")
    private int field2271;

    @OriginalMember(owner = "client!tm", name = "C", descriptor = "S")
    public short field2267;

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "()V", line = 11)
    private final void method1143() {
        int var1 = this.field2276.field4171.field4214;
        if (this.field2276.field4171.field4201[var1] != null) {
            this.field2276.field4171.field4201[var1].method1145();
        }
        this.field2276.field4171.field4201[var1] = this;
        this.field2267 = (short) this.field2276.field4171.field4214;
        this.field2276.field4171.field4214 = var1 + 1 & 0x1FFF;
        this.field2276.field4182.method1745(1, this);
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lvi;IIIIIIIII)V", line = 23)
    public final void method1144(class270 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field2276 = arg0;
        this.field2279 = arg1 << field2273;
        this.field2274 = arg2 << field2273;
        this.field2269 = arg3 << field2273;
        this.field2280 = arg9;
        this.field2268 = this.field2272 = (short) arg8;
        this.field2266 = (short) arg4;
        this.field2270 = (short) arg5;
        this.field2278 = (short) arg6;
        this.field2277 = arg7;
        this.method1143();
    }

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "()V", line = 42)
    private final void method1145() {
        this.field2276.field4171.field4201[this.field2267] = null;
        class273.field4213[class273.field4203] = this;
        class273.field4203 = class273.field4203 + 1 & 0x3FF;
        this.field2276 = null;
        this.method1340(53);
        this.method743((byte) 99);
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(JI)V", line = 52)
    public final void method1146(long arg0, int arg1) {
        if (this.field2276 == null) {
            return;
        }
        this.field2272 = (short) (this.field2272 - arg1);
        if (this.field2272 <= 0) {
            this.method1145();
            return;
        }
        int var4 = this.field2279 >> field2273;
        int var5 = this.field2274 >> field2273;
        int var6 = this.field2269 >> field2273;
        class273 var7 = this.field2276.field4171;
        class121 var8 = this.field2276.field4166;
        if (var8.field1932 != 0) {
            if (this.field2268 - this.field2272 <= var8.field1891) {
                int var9 = var8.field1904 * arg1 + (this.field2280 >> 8 & 0xFF00) + (this.field2271 >> 16 & 0xFF);
                int var10 = var8.field1905 * arg1 + (this.field2271 >> 8 & 0xFF) + (this.field2280 & 0xFF00);
                int var11 = var8.field1906 * arg1 + (this.field2280 & 0xFF << 8) + (this.field2271 & 0xFF);
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
                this.field2280 &= 0xFF000000;
                this.field2280 |= ((var11 & 0xFF00) >> 8) + ((var9 & 0xFF00) << 8) + (var10 & 0xFF00);
                this.field2271 &= 0xFF000000;
                this.field2271 |= (var11 & 0xFF) + ((var9 & 0xFF) << 16) + ((var10 & 0xFF) << 8);
            }
            if (this.field2268 - this.field2272 <= var8.field1908) {
                int var12 = var8.field1896 * arg1 + (this.field2280 >> 16 & 0xFF00) + (this.field2271 >> 24 & 0xFF);
                if (var12 < 0) {
                    var12 = 0;
                } else if (var12 > 65535) {
                    var12 = 65535;
                }
                this.field2280 &= 0xFFFFFF;
                this.field2280 |= (var12 & 0xFF00) << 16;
                this.field2271 &= 0xFFFFFF;
                this.field2271 |= (var12 & 0xFF) << 24;
            }
        }
        if (var8.field1898 != -1 && this.field2268 - this.field2272 <= var8.field1907) {
            this.field2277 += var8.field1915 * arg1;
        }
        int var13 = this.field2266;
        int var14 = this.field2270;
        int var15 = this.field2278;
        boolean var16 = false;
        if (var8.field1886 == 1) {
            int var17 = var4 - this.field2276.field4163;
            int var18 = var5 - this.field2276.field4177;
            int var19 = var6 - this.field2276.field4156;
            int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
            long var21 = (long) (var8.field1921 * var20 * arg1);
            this.field2277 = (int) ((long) this.field2277 - ((long) this.field2277 * var21 >> 18));
        } else if (var8.field1886 == 2) {
            int var23 = var4 - this.field2276.field4163;
            int var24 = var5 - this.field2276.field4177;
            int var25 = var6 - this.field2276.field4156;
            int var26 = var25 * var25 + var23 * var23 + var24 * var24;
            long var27 = (long) (var8.field1921 * var26 * arg1);
            this.field2277 = (int) ((long) this.field2277 - ((long) this.field2277 * var27 >> 28));
        }
        class172 var29 = var7.field4228.field4897;
        for (class172 var30 = var29.field2737; var30 != var29; var30 = var30.field2737) {
            class345 var31 = (class345) var30;
            class122 var32 = var31.field5493.field485;
            if (var32.field1962 != 1) {
                int var33 = var4 - var31.field5494;
                int var34 = var5 - var31.field5484;
                int var35 = var6 - var31.field5492;
                long var36 = (long) (var35 * var35 + var33 * var33 + var34 * var34);
                if (var36 <= var32.field1959) {
                    int var38 = (int) Math.sqrt((double) var36);
                    if (var38 == 0) {
                        var38 = 1;
                    }
                    long var39 = (long) (var31.field5482 * var35 + var31.field5487 * var33 + var32.field1954 * var34) * 65535L / (long) (var32.field1944 * var38);
                    if (var39 >= (long) var32.field1947) {
                        int var41 = 0;
                        if (var32.field1963 == 1) {
                            var41 = (var38 >> 4) * var32.field1964;
                        } else if (var32.field1963 == 2) {
                            var41 = (var38 >> 4) * (var38 >> 4) * var32.field1964;
                        }
                        if (var32.field1958 != 0) {
                            int var42 = (var33 << 15) / var38 * var32.field1944;
                            int var43 = (var34 << 15) / var38 * var32.field1944;
                            int var44 = (var35 << 15) / var38 * var32.field1944;
                            if (var32.field1955 == 0) {
                                var13 += arg1 * var42 >> 15;
                                var14 += arg1 * var43 >> 15;
                                var15 += arg1 * var44 >> 15;
                                var16 = true;
                            } else {
                                this.field2279 += arg1 * var42 >> 15;
                                this.field2274 += arg1 * var43 >> 15;
                                this.field2269 += arg1 * var44 >> 15;
                            }
                        } else if (var32.field1955 == 0) {
                            var13 += (var31.field5487 - var41) * arg1;
                            var14 += (var32.field1954 - var41) * arg1;
                            var15 += (var31.field5482 - var41) * arg1;
                            var16 = true;
                        } else {
                            this.field2279 += (var31.field5487 - var41) * arg1;
                            this.field2274 += (var32.field1954 - var41) * arg1;
                            this.field2269 += (var31.field5482 - var41) * arg1;
                        }
                    }
                }
            }
        }
        if (var8.field1926 != null) {
            for (int var45 = 0; var45 < var8.field1926.length; var45++) {
                class345 var46 = (class345) class273.field4218.method1919(false, (long) var8.field1926[var45]);
                while (var46 != null) {
                    class122 var47 = var46.field5493.field485;
                    int var48 = var4 - var46.field5494;
                    int var49 = var5 - var46.field5484;
                    int var50 = var6 - var46.field5492;
                    long var51 = (long) (var50 * var50 + var48 * var48 + var49 * var49);
                    if (var51 > var47.field1959) {
                        var46 = (class345) class273.field4218.method1920(-115);
                    } else {
                        int var53 = (int) Math.sqrt((double) var51);
                        if (var53 == 0) {
                            var53 = 1;
                        }
                        long var54 = (long) (var46.field5482 * var50 + var46.field5487 * var48 + var47.field1954 * var49) * 65535L / (long) (var47.field1944 * var53);
                        if (var54 < (long) var47.field1947) {
                            var46 = (class345) class273.field4218.method1920(-125);
                        } else {
                            int var56 = 0;
                            if (var47.field1963 == 1) {
                                var56 = (var53 >> 4) * var47.field1964;
                            } else if (var47.field1963 == 2) {
                                var56 = (var53 >> 4) * (var53 >> 4) * var47.field1964;
                            }
                            if (var47.field1958 != 0) {
                                int var57 = (var48 << 15) / var53 * var47.field1944;
                                int var58 = (var49 << 15) / var53 * var47.field1944;
                                int var59 = (var50 << 15) / var53 * var47.field1944;
                                if (var47.field1955 == 0) {
                                    var13 += arg1 * var57 >> 15;
                                    var14 += arg1 * var58 >> 15;
                                    var15 += arg1 * var59 >> 15;
                                    var16 = true;
                                } else {
                                    this.field2279 += arg1 * var57 >> 15;
                                    this.field2274 += arg1 * var58 >> 15;
                                    this.field2269 += arg1 * var59 >> 15;
                                }
                            } else if (var47.field1955 == 0) {
                                var13 += (var46.field5487 - var56) * arg1;
                                var14 += (var47.field1954 - var56) * arg1;
                                var15 += (var46.field5482 - var56) * arg1;
                                var16 = true;
                            } else {
                                this.field2279 += (var46.field5487 - var56) * arg1;
                                this.field2274 += (var47.field1954 - var56) * arg1;
                                this.field2269 += (var46.field5482 - var56) * arg1;
                            }
                            var46 = (class345) class273.field4218.method1920(-116);
                        }
                    }
                }
            }
        }
        if (var8.field1894 != null) {
            if (var8.field1890 == null) {
                var8.field1890 = new int[var8.field1894.length];
                for (int var60 = 0; var60 < var8.field1894.length; var60++) {
                    class79.method727(-9, var8.field1894[var60]);
                    var8.field1890[var60] = ((class164) class90.field1275.method370((byte) -120, (long) var8.field1894[var60])).field2610;
                }
            }
            for (int var61 = 0; var61 < var8.field1890.length; var61++) {
                class122 var62 = class159.field2536[var8.field1890[var61]];
                if (var62.field1955 == 0) {
                    var13 += var62.field1953 * arg1;
                    var14 += var62.field1954 * arg1;
                    var15 += var62.field1952 * arg1;
                    var16 = true;
                } else {
                    this.field2279 += var62.field1953 * arg1;
                    this.field2274 += var62.field1954 * arg1;
                    this.field2269 += var62.field1952 * arg1;
                }
            }
        }
        if (var16) {
            while (true) {
                if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                    this.field2266 = (short) var13;
                    this.field2270 = (short) var14;
                    this.field2278 = (short) var15;
                    break;
                }
                var13 >>= 0x1;
                var14 >>= 0x1;
                var15 >>= 0x1;
                this.field2277 <<= 0x1;
            }
        }
        this.field2279 = (int) ((long) this.field2279 + ((long) this.field2266 * (long) this.field2277 >> 23) * (long) arg1);
        this.field2274 = (int) ((long) this.field2274 + ((long) this.field2270 * (long) this.field2277 >> 23) * (long) arg1);
        this.field2269 = (int) ((long) this.field2269 + ((long) this.field2278 * (long) this.field2277 >> 23) * (long) arg1);
        int var63 = this.field2279 >> 19;
        int var64 = this.field2269 >> 19;
        int var65 = this.field2274 >> field2273;
        if (var65 > 0 || var65 < -65535 || var63 < 0 || var63 >= class154.field2492 || var64 < 0 || var64 >= class166.field2642) {
            this.method1145();
            return;
        }
        int[][][] var66 = class277.field4290;
        int var67 = var66[var7.field4236][var63][var64];
        int var68;
        if (var7.field4236 < 3) {
            var68 = var66[var7.field4236 + 1][var63][var64];
        } else {
            var68 = var66[var7.field4236][var63][var64] - 1024;
        }
        if (var8.field1929) {
            if (var8.field1942 == -1 && var65 > var67) {
                this.method1145();
                return;
            }
            if (var8.field1942 >= 0 && var65 > var66[var8.field1942][var63][var64]) {
                this.method1145();
                return;
            }
            if (var8.field1916 == -1 && var65 < var68) {
                this.method1145();
                return;
            }
            if (var8.field1916 >= 0 && var65 < var66[var8.field1916 + 1][var63][var64]) {
                this.method1145();
                return;
            }
        }
        if (var63 >= var7.field4232 && var63 <= var7.field4241 && var64 >= var7.field4244 && var64 <= var7.field4238 && var65 <= var7.field4239 && var65 >= var7.field4240) {
            this.field2275 = false;
            return;
        }
        this.field2275 = true;
        byte var69 = 3;
        if (var65 > var66[1][var63][var64]) {
            var69 = 0;
        } else if (var65 > var66[2][var63][var64]) {
            var69 = 1;
        } else if (var65 > var66[3][var63][var64]) {
            var69 = 2;
        } else if (var65 < var66[3][var63][var64] - 1024) {
            this.method1145();
            return;
        }
        class329 var70 = class170.field2689[var69][var63][var64];
        if (var70 == null) {
            var70 = class170.field2689[var69][var63][var64] = new class329(var69, var63, var64);
        }
        if (var70.field5061 == null) {
            var70.field5061 = new class33();
            var70.field5078 = (byte) ((int) (arg0 & 0xFFL));
        } else if ((byte) ((int) (arg0 & 0xFFL)) != var70.field5078) {
            var70.field5061.method351((byte) 86);
            var70.field5078 = (byte) ((int) (arg0 & 0xFFL));
        }
        var70.field5061.method348(this, -126);
    }

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Lvi;IIIIIIIII)V", line = 521)
    public class137(class270 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field2276 = arg0;
        this.field2279 = arg1 << field2273;
        this.field2274 = arg2 << field2273;
        this.field2269 = arg3 << field2273;
        this.field2280 = arg9;
        this.field2268 = this.field2272 = (short) arg8;
        this.field2266 = (short) arg4;
        this.field2270 = (short) arg5;
        this.field2278 = (short) arg6;
        this.field2277 = arg7;
        this.method1143();
    }
}
