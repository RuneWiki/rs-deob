import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class262 extends class51 {

    @OriginalMember(owner = "client!gm", name = "F", descriptor = "Z")
    public boolean field4408 = false;

    @OriginalMember(owner = "client!gm", name = "K", descriptor = "Lub;")
    public class76 field4413;

    @OriginalMember(owner = "client!gm", name = "G", descriptor = "I")
    public int field4409;

    @OriginalMember(owner = "client!gm", name = "I", descriptor = "I")
    public int field4411;

    @OriginalMember(owner = "client!gm", name = "L", descriptor = "I")
    public int field4414;

    @OriginalMember(owner = "client!gm", name = "J", descriptor = "I")
    public int field4412;

    @OriginalMember(owner = "client!gm", name = "M", descriptor = "S")
    private short field4415;

    @OriginalMember(owner = "client!gm", name = "R", descriptor = "S")
    private short field4419;

    @OriginalMember(owner = "client!gm", name = "O", descriptor = "S")
    private short field4417;

    @OriginalMember(owner = "client!gm", name = "T", descriptor = "S")
    private short field4421;

    @OriginalMember(owner = "client!gm", name = "P", descriptor = "S")
    private short field4418;

    @OriginalMember(owner = "client!gm", name = "H", descriptor = "I")
    private int field4410;

    @OriginalMember(owner = "client!gm", name = "N", descriptor = "I")
    private static int field4416 = 12;

    @OriginalMember(owner = "client!gm", name = "S", descriptor = "I")
    private int field4420;

    @OriginalMember(owner = "client!gm", name = "E", descriptor = "S")
    public short field4407;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(JI)V", line = 7)
    public final void method1996(long arg0, int arg1) {
        if (this.field4413 == null) {
            return;
        }
        this.field4415 = (short) (this.field4415 - arg1);
        if (this.field4415 <= 0) {
            this.method1998();
            return;
        }
        int var4 = this.field4409 >> field4416;
        int var5 = this.field4411 >> field4416;
        int var6 = this.field4414 >> field4416;
        class158 var7 = this.field4413.field1309;
        class210 var8 = this.field4413.field1288;
        if (var8.field3343 != 0) {
            if (this.field4419 - this.field4415 <= var8.field3302) {
                int var9 = var8.field3363 * arg1 + (this.field4420 >> 16 & 0xFF) + (this.field4412 >> 8 & 0xFF00);
                int var10 = var8.field3315 * arg1 + (this.field4420 >> 8 & 0xFF) + (this.field4412 & 0xFF00);
                int var11 = var8.field3329 * arg1 + (this.field4412 & 0xFF << 8) + (this.field4420 & 0xFF);
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
                this.field4412 &= 0xFF000000;
                this.field4412 |= ((var11 & 0xFF00) >> 8) + ((var9 & 0xFF00) << 8) + (var10 & 0xFF00);
                this.field4420 &= 0xFF000000;
                this.field4420 |= (var11 & 0xFF) + ((var9 & 0xFF) << 16) + ((var10 & 0xFF) << 8);
            }
            if (this.field4419 - this.field4415 <= var8.field3345) {
                int var12 = var8.field3338 * arg1 + (this.field4420 >> 24 & 0xFF) + (this.field4412 >> 16 & 0xFF00);
                if (var12 < 0) {
                    var12 = 0;
                } else if (var12 > 65535) {
                    var12 = 65535;
                }
                this.field4412 &= 0xFFFFFF;
                this.field4412 |= (var12 & 0xFF00) << 16;
                this.field4420 &= 0xFFFFFF;
                this.field4420 |= (var12 & 0xFF) << 24;
            }
        }
        if (var8.field3367 != -1 && this.field4419 - this.field4415 <= var8.field3361) {
            this.field4410 += var8.field3349 * arg1;
        }
        int var13 = this.field4417;
        int var14 = this.field4421;
        int var15 = this.field4418;
        boolean var16 = false;
        if (var8.field3334 == 1) {
            int var17 = var4 - this.field4413.field1289;
            int var18 = var5 - this.field4413.field1314;
            int var19 = var6 - this.field4413.field1316;
            int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
            long var21 = (long) (var8.field3332 * var20 * arg1);
            this.field4410 = (int) ((long) this.field4410 - ((long) this.field4410 * var21 >> 18));
        } else if (var8.field3334 == 2) {
            int var23 = var4 - this.field4413.field1289;
            int var24 = var5 - this.field4413.field1314;
            int var25 = var6 - this.field4413.field1316;
            int var26 = var25 * var25 + var23 * var23 + var24 * var24;
            long var27 = (long) (var8.field3332 * var26 * arg1);
            this.field4410 = (int) ((long) this.field4410 - ((long) this.field4410 * var27 >> 28));
        }
        class45 var29 = var7.field2495.field5199;
        for (class45 var30 = var29.field708; var30 != var29; var30 = var30.field708) {
            class23 var31 = (class23) var30;
            class260 var32 = var31.field283.field572;
            if (var32.field4365 != 1) {
                int var33 = var4 - var31.field287;
                int var34 = var5 - var31.field288;
                int var35 = var6 - var31.field272;
                long var36 = (long) (var35 * var35 + var33 * var33 + var34 * var34);
                if (var36 <= var32.field4380) {
                    int var38 = (int) Math.sqrt((double) var36);
                    if (var38 == 0) {
                        var38 = 1;
                    }
                    long var39 = (long) (var31.field276 * var35 + var31.field282 * var33 + var32.field4364 * var34) * 65535L / (long) (var32.field4378 * var38);
                    if (var39 >= (long) var32.field4369) {
                        int var41 = 0;
                        if (var32.field4382 == 1) {
                            var41 = (var38 >> 4) * var32.field4385;
                        } else if (var32.field4382 == 2) {
                            var41 = (var38 >> 4) * (var38 >> 4) * var32.field4385;
                        }
                        if (var32.field4383 != 0) {
                            int var42 = (var33 << 15) / var38 * var32.field4378;
                            int var43 = (var34 << 15) / var38 * var32.field4378;
                            int var44 = (var35 << 15) / var38 * var32.field4378;
                            if (var32.field4376 == 0) {
                                var13 += arg1 * var42 >> 15;
                                var14 += arg1 * var43 >> 15;
                                var15 += arg1 * var44 >> 15;
                                var16 = true;
                            } else {
                                this.field4409 += arg1 * var42 >> 15;
                                this.field4411 += arg1 * var43 >> 15;
                                this.field4414 += arg1 * var44 >> 15;
                            }
                        } else if (var32.field4376 == 0) {
                            var13 += (var31.field282 - var41) * arg1;
                            var14 += (var32.field4364 - var41) * arg1;
                            var15 += (var31.field276 - var41) * arg1;
                            var16 = true;
                        } else {
                            this.field4409 += (var31.field282 - var41) * arg1;
                            this.field4411 += (var32.field4364 - var41) * arg1;
                            this.field4414 += (var31.field276 - var41) * arg1;
                        }
                    }
                }
            }
        }
        if (var8.field3328 != null) {
            for (int var45 = 0; var45 < var8.field3328.length; var45++) {
                class23 var46 = (class23) class158.field2497.method1310(89, (long) var8.field3328[var45]);
                while (var46 != null) {
                    class260 var47 = var46.field283.field572;
                    int var48 = var4 - var46.field287;
                    int var49 = var5 - var46.field288;
                    int var50 = var6 - var46.field272;
                    long var51 = (long) (var50 * var50 + var48 * var48 + var49 * var49);
                    if (var51 > var47.field4380) {
                        var46 = (class23) class158.field2497.method1318(124);
                    } else {
                        int var53 = (int) Math.sqrt((double) var51);
                        if (var53 == 0) {
                            var53 = 1;
                        }
                        long var54 = (long) (var46.field276 * var50 + var46.field282 * var48 + var47.field4364 * var49) * 65535L / (long) (var47.field4378 * var53);
                        if (var54 < (long) var47.field4369) {
                            var46 = (class23) class158.field2497.method1318(122);
                        } else {
                            int var56 = 0;
                            if (var47.field4382 == 1) {
                                var56 = (var53 >> 4) * var47.field4385;
                            } else if (var47.field4382 == 2) {
                                var56 = (var53 >> 4) * (var53 >> 4) * var47.field4385;
                            }
                            if (var47.field4383 != 0) {
                                int var57 = (var48 << 15) / var53 * var47.field4378;
                                int var58 = (var49 << 15) / var53 * var47.field4378;
                                int var59 = (var50 << 15) / var53 * var47.field4378;
                                if (var47.field4376 == 0) {
                                    var13 += arg1 * var57 >> 15;
                                    var14 += arg1 * var58 >> 15;
                                    var15 += arg1 * var59 >> 15;
                                    var16 = true;
                                } else {
                                    this.field4409 += arg1 * var57 >> 15;
                                    this.field4411 += arg1 * var58 >> 15;
                                    this.field4414 += arg1 * var59 >> 15;
                                }
                            } else if (var47.field4376 == 0) {
                                var13 += (var46.field282 - var56) * arg1;
                                var14 += (var47.field4364 - var56) * arg1;
                                var15 += (var46.field276 - var56) * arg1;
                                var16 = true;
                            } else {
                                this.field4409 += (var46.field282 - var56) * arg1;
                                this.field4411 += (var47.field4364 - var56) * arg1;
                                this.field4414 += (var46.field276 - var56) * arg1;
                            }
                            var46 = (class23) class158.field2497.method1318(48);
                        }
                    }
                }
            }
        }
        if (var8.field3335 != null) {
            if (var8.field3313 == null) {
                var8.field3313 = new int[var8.field3335.length];
                for (int var60 = 0; var60 < var8.field3335.length; var60++) {
                    class31.method215(var8.field3335[var60], 107);
                    var8.field3313[var60] = ((class301) class214.field3437.method1268(91, (long) var8.field3335[var60])).field4846;
                }
            }
            for (int var61 = 0; var61 < var8.field3313.length; var61++) {
                class260 var62 = class205.field3245[var8.field3313[var61]];
                if (var62.field4376 == 0) {
                    var13 += var62.field4381 * arg1;
                    var14 += var62.field4364 * arg1;
                    var15 += var62.field4386 * arg1;
                    var16 = true;
                } else {
                    this.field4409 += var62.field4381 * arg1;
                    this.field4411 += var62.field4364 * arg1;
                    this.field4414 += var62.field4386 * arg1;
                }
            }
        }
        if (var16) {
            while (true) {
                if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                    this.field4417 = (short) var13;
                    this.field4421 = (short) var14;
                    this.field4418 = (short) var15;
                    break;
                }
                var13 >>= 0x1;
                var14 >>= 0x1;
                var15 >>= 0x1;
                this.field4410 <<= 0x1;
            }
        }
        this.field4409 = (int) ((long) this.field4409 + ((long) this.field4417 * (long) this.field4410 >> 23) * (long) arg1);
        this.field4411 = (int) ((long) this.field4411 + ((long) this.field4421 * (long) this.field4410 >> 23) * (long) arg1);
        this.field4414 = (int) ((long) this.field4414 + ((long) this.field4418 * (long) this.field4410 >> 23) * (long) arg1);
        int var63 = this.field4409 >> 19;
        int var64 = this.field4414 >> 19;
        int var65 = this.field4411 >> field4416;
        if (var65 > 0 || var65 < -65535 || var63 < 0 || var63 >= class273.field4526 || var64 < 0 || var64 >= class162.field2574) {
            this.method1998();
            return;
        }
        int[][][] var66 = class101.field1656;
        int var67 = var66[var7.field2505][var63][var64];
        int var68;
        if (var7.field2505 < 3) {
            var68 = var66[var7.field2505 + 1][var63][var64];
        } else {
            var68 = var66[var7.field2505][var63][var64] - 1024;
        }
        if (var8.field3327) {
            if (var8.field3330 == -1 && var65 > var67) {
                this.method1998();
                return;
            }
            if (var8.field3330 >= 0 && var65 > var66[var8.field3330][var63][var64]) {
                this.method1998();
                return;
            }
            if (var8.field3356 == -1 && var65 < var68) {
                this.method1998();
                return;
            }
            if (var8.field3356 >= 0 && var65 < var66[var8.field3356 + 1][var63][var64]) {
                this.method1998();
                return;
            }
        }
        if (var63 >= var7.field2500 && var63 <= var7.field2506 && var64 >= var7.field2509 && var64 <= var7.field2513 && var65 <= var7.field2504 && var65 >= var7.field2510) {
            this.field4408 = false;
            return;
        }
        this.field4408 = true;
        byte var69 = 3;
        if (var65 > var66[1][var63][var64]) {
            var69 = 0;
        } else if (var65 > var66[2][var63][var64]) {
            var69 = 1;
        } else if (var65 > var66[3][var63][var64]) {
            var69 = 2;
        } else if (var65 < var66[3][var63][var64] - 1024) {
            this.method1998();
            return;
        }
        class36 var70 = class129.field2184[var69][var63][var64];
        if (var70 == null) {
            var70 = class129.field2184[var69][var63][var64] = new class36(var69, var63, var64);
        }
        if (var70.field547 == null) {
            var70.field547 = new class187();
            var70.field527 = (byte) ((int) (arg0 & 0xFFL));
        } else if ((byte) ((int) (arg0 & 0xFFL)) != var70.field527) {
            var70.field547.method1468(false);
            var70.field527 = (byte) ((int) (arg0 & 0xFFL));
        }
        var70.field547.method1466(this, 0);
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "()V", line = 477)
    private final void method1997() {
        int var1 = this.field4413.field1309.field2489;
        if (this.field4413.field1309.field2482[var1] != null) {
            this.field4413.field1309.field2482[var1].method1998();
        }
        this.field4413.field1309.field2482[var1] = this;
        this.field4407 = (short) this.field4413.field1309.field2489;
        this.field4413.field1309.field2489 = var1 + 1 & 0x1FFF;
        this.field4413.field1290.method247(this, (byte) -89);
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "()V", line = 488)
    private final void method1998() {
        this.field4413.field1309.field2482[this.field4407] = null;
        class158.field2494[class158.field2488] = this;
        class158.field2488 = class158.field2488 + 1 & 0x3FF;
        this.field4413 = null;
        this.method120(126);
        this.method395(false);
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lub;IIIIIIIII)V", line = 497)
    public final void method1999(class76 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field4413 = arg0;
        this.field4409 = arg1 << field4416;
        this.field4411 = arg2 << field4416;
        this.field4414 = arg3 << field4416;
        this.field4412 = arg9;
        this.field4419 = this.field4415 = (short) arg8;
        this.field4417 = (short) arg4;
        this.field4421 = (short) arg5;
        this.field4418 = (short) arg6;
        this.field4410 = arg7;
        this.method1997();
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Lub;IIIIIIIII)V", line = 521)
    public class262(class76 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field4413 = arg0;
        this.field4409 = arg1 << field4416;
        this.field4411 = arg2 << field4416;
        this.field4414 = arg3 << field4416;
        this.field4412 = arg9;
        this.field4419 = this.field4415 = (short) arg8;
        this.field4417 = (short) arg4;
        this.field4421 = (short) arg5;
        this.field4418 = (short) arg6;
        this.field4410 = arg7;
        this.method1997();
    }
}
