import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class341 extends class60 {

    @OriginalMember(owner = "client!lb", name = "w", descriptor = "Z")
    public boolean field5269 = false;

    @OriginalMember(owner = "client!lb", name = "q", descriptor = "Lii;")
    public class303 field5263;

    @OriginalMember(owner = "client!lb", name = "r", descriptor = "I")
    public int field5264;

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "I")
    public int field5262;

    @OriginalMember(owner = "client!lb", name = "t", descriptor = "I")
    public int field5266;

    @OriginalMember(owner = "client!lb", name = "B", descriptor = "I")
    public int field5274;

    @OriginalMember(owner = "client!lb", name = "x", descriptor = "S")
    private short field5270;

    @OriginalMember(owner = "client!lb", name = "v", descriptor = "S")
    private short field5268;

    @OriginalMember(owner = "client!lb", name = "z", descriptor = "S")
    private short field5272;

    @OriginalMember(owner = "client!lb", name = "s", descriptor = "S")
    private short field5265;

    @OriginalMember(owner = "client!lb", name = "y", descriptor = "S")
    private short field5271;

    @OriginalMember(owner = "client!lb", name = "D", descriptor = "I")
    private int field5276;

    @OriginalMember(owner = "client!lb", name = "A", descriptor = "I")
    private static int field5273 = 12;

    @OriginalMember(owner = "client!lb", name = "u", descriptor = "I")
    private int field5267;

    @OriginalMember(owner = "client!lb", name = "C", descriptor = "S")
    public short field5275;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(JI)V", line = 4)
    public final void method2380(long arg0, int arg1) {
        if (this.field5263 == null) {
            return;
        }
        this.field5270 = (short) (this.field5270 - arg1);
        if (this.field5270 <= 0) {
            this.method2383();
            return;
        }
        int var4 = this.field5264 >> field5273;
        int var5 = this.field5262 >> field5273;
        int var6 = this.field5266 >> field5273;
        class155 var7 = this.field5263.field4532;
        class1 var8 = this.field5263.field4553;
        if (var8.field47 != 0) {
            if (this.field5268 - this.field5270 <= var8.field33) {
                int var9 = var8.field16 * arg1 + (this.field5274 >> 8 & 0xFF00) + (this.field5267 >> 16 & 0xFF);
                int var10 = var8.field38 * arg1 + (this.field5267 >> 8 & 0xFF) + (this.field5274 & 0xFF00);
                int var11 = var8.field32 * arg1 + (this.field5274 & 0xFF << 8) + (this.field5267 & 0xFF);
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
                this.field5274 &= 0xFF000000;
                this.field5274 |= ((var11 & 0xFF00) >> 8) + ((var9 & 0xFF00) << 8) + (var10 & 0xFF00);
                this.field5267 &= 0xFF000000;
                this.field5267 |= (var11 & 0xFF) + ((var9 & 0xFF) << 16) + ((var10 & 0xFF) << 8);
            }
            if (this.field5268 - this.field5270 <= var8.field66) {
                int var12 = var8.field18 * arg1 + (this.field5274 >> 16 & 0xFF00) + (this.field5267 >> 24 & 0xFF);
                if (var12 < 0) {
                    var12 = 0;
                } else if (var12 > 65535) {
                    var12 = 65535;
                }
                this.field5274 &= 0xFFFFFF;
                this.field5274 |= (var12 & 0xFF00) << 16;
                this.field5267 &= 0xFFFFFF;
                this.field5267 |= (var12 & 0xFF) << 24;
            }
        }
        if (var8.field3 != -1 && this.field5268 - this.field5270 <= var8.field56) {
            this.field5276 += var8.field50 * arg1;
        }
        int var13 = this.field5272;
        int var14 = this.field5265;
        int var15 = this.field5271;
        boolean var16 = false;
        if (var8.field31 == 1) {
            int var17 = var4 - this.field5263.field4522;
            int var18 = var5 - this.field5263.field4521;
            int var19 = var6 - this.field5263.field4527;
            int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
            long var21 = (long) (var8.field57 * var20 * arg1);
            this.field5276 = (int) ((long) this.field5276 - ((long) this.field5276 * var21 >> 18));
        } else if (var8.field31 == 2) {
            int var23 = var4 - this.field5263.field4522;
            int var24 = var5 - this.field5263.field4521;
            int var25 = var6 - this.field5263.field4527;
            int var26 = var25 * var25 + var23 * var23 + var24 * var24;
            long var27 = (long) (var8.field57 * var26 * arg1);
            this.field5276 = (int) ((long) this.field5276 - ((long) this.field5276 * var27 >> 28));
        }
        class117 var29 = var7.field2228.field272;
        for (class117 var30 = var29.field1659; var30 != var29; var30 = var30.field1659) {
            class310 var31 = (class310) var30;
            class241 var32 = var31.field4634.field1482;
            if (var32.field3592 != 1) {
                int var33 = var4 - var31.field4638;
                int var34 = var5 - var31.field4637;
                int var35 = var6 - var31.field4633;
                long var36 = (long) (var35 * var35 + var33 * var33 + var34 * var34);
                if (var36 <= var32.field3582) {
                    int var38 = (int) Math.sqrt((double) var36);
                    if (var38 == 0) {
                        var38 = 1;
                    }
                    long var39 = (long) (var31.field4630 * var35 + var31.field4632 * var33 + var32.field3598 * var34) * 65535L / (long) (var32.field3593 * var38);
                    if (var39 >= (long) var32.field3580) {
                        int var41 = 0;
                        if (var32.field3583 == 1) {
                            var41 = (var38 >> 4) * var32.field3587;
                        } else if (var32.field3583 == 2) {
                            var41 = (var38 >> 4) * (var38 >> 4) * var32.field3587;
                        }
                        if (var32.field3597 != 0) {
                            int var42 = (var33 << 15) / var38 * var32.field3593;
                            int var43 = (var34 << 15) / var38 * var32.field3593;
                            int var44 = (var35 << 15) / var38 * var32.field3593;
                            if (var32.field3584 == 0) {
                                var13 += arg1 * var42 >> 15;
                                var14 += arg1 * var43 >> 15;
                                var15 += arg1 * var44 >> 15;
                                var16 = true;
                            } else {
                                this.field5264 += arg1 * var42 >> 15;
                                this.field5262 += arg1 * var43 >> 15;
                                this.field5266 += arg1 * var44 >> 15;
                            }
                        } else if (var32.field3584 == 0) {
                            var13 += (var31.field4632 - var41) * arg1;
                            var14 += (var32.field3598 - var41) * arg1;
                            var15 += (var31.field4630 - var41) * arg1;
                            var16 = true;
                        } else {
                            this.field5264 += (var31.field4632 - var41) * arg1;
                            this.field5262 += (var32.field3598 - var41) * arg1;
                            this.field5266 += (var31.field4630 - var41) * arg1;
                        }
                    }
                }
            }
        }
        if (var8.field60 != null) {
            for (int var45 = 0; var45 < var8.field60.length; var45++) {
                class310 var46 = (class310) class155.field2225.method209((long) var8.field60[var45], 80);
                while (var46 != null) {
                    class241 var47 = var46.field4634.field1482;
                    int var48 = var4 - var46.field4638;
                    int var49 = var5 - var46.field4637;
                    int var50 = var6 - var46.field4633;
                    long var51 = (long) (var50 * var50 + var48 * var48 + var49 * var49);
                    if (var51 > var47.field3582) {
                        var46 = (class310) class155.field2225.method214((byte) 110);
                    } else {
                        int var53 = (int) Math.sqrt((double) var51);
                        if (var53 == 0) {
                            var53 = 1;
                        }
                        long var54 = (long) (var46.field4630 * var50 + var46.field4632 * var48 + var47.field3598 * var49) * 65535L / (long) (var47.field3593 * var53);
                        if (var54 < (long) var47.field3580) {
                            var46 = (class310) class155.field2225.method214((byte) 110);
                        } else {
                            int var56 = 0;
                            if (var47.field3583 == 1) {
                                var56 = (var53 >> 4) * var47.field3587;
                            } else if (var47.field3583 == 2) {
                                var56 = (var53 >> 4) * (var53 >> 4) * var47.field3587;
                            }
                            if (var47.field3597 != 0) {
                                int var57 = (var48 << 15) / var53 * var47.field3593;
                                int var58 = (var49 << 15) / var53 * var47.field3593;
                                int var59 = (var50 << 15) / var53 * var47.field3593;
                                if (var47.field3584 == 0) {
                                    var13 += arg1 * var57 >> 15;
                                    var14 += arg1 * var58 >> 15;
                                    var15 += arg1 * var59 >> 15;
                                    var16 = true;
                                } else {
                                    this.field5264 += arg1 * var57 >> 15;
                                    this.field5262 += arg1 * var58 >> 15;
                                    this.field5266 += arg1 * var59 >> 15;
                                }
                            } else if (var47.field3584 == 0) {
                                var13 += (var46.field4632 - var56) * arg1;
                                var14 += (var47.field3598 - var56) * arg1;
                                var15 += (var46.field4630 - var56) * arg1;
                                var16 = true;
                            } else {
                                this.field5264 += (var46.field4632 - var56) * arg1;
                                this.field5262 += (var47.field3598 - var56) * arg1;
                                this.field5266 += (var46.field4630 - var56) * arg1;
                            }
                            var46 = (class310) class155.field2225.method214((byte) 110);
                        }
                    }
                }
            }
        }
        if (var8.field53 != null) {
            if (var8.field58 == null) {
                var8.field58 = new int[var8.field53.length];
                for (int var60 = 0; var60 < var8.field53.length; var60++) {
                    class73.method604(var8.field53[var60], (byte) 104);
                    var8.field58[var60] = ((class35) class184.field2646.method1405((long) var8.field53[var60], false)).field515;
                }
            }
            for (int var61 = 0; var61 < var8.field58.length; var61++) {
                class241 var62 = class117.field1655[var8.field58[var61]];
                if (var62.field3584 == 0) {
                    var13 += var62.field3581 * arg1;
                    var14 += var62.field3598 * arg1;
                    var15 += var62.field3599 * arg1;
                    var16 = true;
                } else {
                    this.field5264 += var62.field3581 * arg1;
                    this.field5262 += var62.field3598 * arg1;
                    this.field5266 += var62.field3599 * arg1;
                }
            }
        }
        if (var16) {
            while (true) {
                if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                    this.field5272 = (short) var13;
                    this.field5265 = (short) var14;
                    this.field5271 = (short) var15;
                    break;
                }
                var13 >>= 0x1;
                var14 >>= 0x1;
                var15 >>= 0x1;
                this.field5276 <<= 0x1;
            }
        }
        this.field5264 = (int) ((long) this.field5264 + ((long) this.field5272 * (long) this.field5276 >> 23) * (long) arg1);
        this.field5262 = (int) ((long) this.field5262 + ((long) this.field5265 * (long) this.field5276 >> 23) * (long) arg1);
        this.field5266 = (int) ((long) this.field5266 + ((long) this.field5271 * (long) this.field5276 >> 23) * (long) arg1);
        int var63 = this.field5264 >> 19;
        int var64 = this.field5266 >> 19;
        int var65 = this.field5262 >> field5273;
        if (var65 > 0 || var65 < -65535 || var63 < 0 || var63 >= class18.field295 || var64 < 0 || var64 >= class146.field2109) {
            this.method2383();
            return;
        }
        int[][][] var66 = class132.field1930;
        int var67 = var66[var7.field2232][var63][var64];
        int var68;
        if (var7.field2232 < 3) {
            var68 = var66[var7.field2232 + 1][var63][var64];
        } else {
            var68 = var66[var7.field2232][var63][var64] - 1024;
        }
        if (var8.field39) {
            if (var8.field36 == -1 && var65 > var67) {
                this.method2383();
                return;
            }
            if (var8.field36 >= 0 && var65 > var66[var8.field36][var63][var64]) {
                this.method2383();
                return;
            }
            if (var8.field42 == -1 && var65 < var68) {
                this.method2383();
                return;
            }
            if (var8.field42 >= 0 && var65 < var66[var8.field42 + 1][var63][var64]) {
                this.method2383();
                return;
            }
        }
        if (var63 >= var7.field2253 && var63 <= var7.field2239 && var64 >= var7.field2231 && var64 <= var7.field2237 && var65 <= var7.field2229 && var65 >= var7.field2235) {
            this.field5269 = false;
            return;
        }
        this.field5269 = true;
        byte var69 = 3;
        if (var65 > var66[1][var63][var64]) {
            var69 = 0;
        } else if (var65 > var66[2][var63][var64]) {
            var69 = 1;
        } else if (var65 > var66[3][var63][var64]) {
            var69 = 2;
        } else if (var65 < var66[3][var63][var64] - 1024) {
            this.method2383();
            return;
        }
        class167 var70 = class302.field4502[var69][var63][var64];
        if (var70 == null) {
            var70 = class302.field4502[var69][var63][var64] = new class167(var69, var63, var64);
        }
        if (var70.field2404 == null) {
            var70.field2404 = new class235();
            var70.field2391 = (byte) ((int) (arg0 & 0xFFL));
        } else if ((byte) ((int) (arg0 & 0xFFL)) != var70.field2391) {
            var70.field2404.method1751((byte) -75);
            var70.field2391 = (byte) ((int) (arg0 & 0xFFL));
        }
        var70.field2404.method1752(100, this);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lii;IIIIIIIII)V", line = 472)
    public final void method2381(class303 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field5263 = arg0;
        this.field5264 = arg1 << field5273;
        this.field5262 = arg2 << field5273;
        this.field5266 = arg3 << field5273;
        this.field5274 = arg9;
        this.field5268 = this.field5270 = (short) arg8;
        this.field5272 = (short) arg4;
        this.field5265 = (short) arg5;
        this.field5271 = (short) arg6;
        this.field5276 = arg7;
        this.method2382();
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "()V", line = 489)
    private final void method2382() {
        int var1 = this.field5263.field4532.field2215;
        if (this.field5263.field4532.field2223[var1] != null) {
            this.field5263.field4532.field2223[var1].method2383();
        }
        this.field5263.field4532.field2223[var1] = this;
        this.field5275 = (short) this.field5263.field4532.field2215;
        this.field5263.field4532.field2215 = var1 + 1 & 0x1FFF;
        this.field5263.field4539.method868(this, (byte) -126);
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lii;IIIIIIIII)V", line = 513)
    public class341(class303 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field5263 = arg0;
        this.field5264 = arg1 << field5273;
        this.field5262 = arg2 << field5273;
        this.field5266 = arg3 << field5273;
        this.field5274 = arg9;
        this.field5268 = this.field5270 = (short) arg8;
        this.field5272 = (short) arg4;
        this.field5265 = (short) arg5;
        this.field5271 = (short) arg6;
        this.field5276 = arg7;
        this.method2382();
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "()V", line = 527)
    private final void method2383() {
        this.field5263.field4532.field2223[this.field5275] = null;
        class155.field2208[class155.field2224] = this;
        class155.field2224 = class155.field2224 + 1 & 0x3FF;
        this.field5263 = null;
        this.method1389(4096);
        this.method477(-11336);
    }
}
