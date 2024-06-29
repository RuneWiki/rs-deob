import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class148 extends class64 {

    @OriginalMember(owner = "client!gb", name = "D", descriptor = "Z")
    public boolean field2601 = false;

    @OriginalMember(owner = "client!gb", name = "E", descriptor = "Lo;")
    public class248 field2602;

    @OriginalMember(owner = "client!gb", name = "K", descriptor = "I")
    public int field2608;

    @OriginalMember(owner = "client!gb", name = "L", descriptor = "I")
    public int field2609;

    @OriginalMember(owner = "client!gb", name = "N", descriptor = "I")
    public int field2611;

    @OriginalMember(owner = "client!gb", name = "G", descriptor = "I")
    public int field2604;

    @OriginalMember(owner = "client!gb", name = "B", descriptor = "S")
    private short field2599;

    @OriginalMember(owner = "client!gb", name = "F", descriptor = "S")
    private short field2603;

    @OriginalMember(owner = "client!gb", name = "I", descriptor = "S")
    private short field2606;

    @OriginalMember(owner = "client!gb", name = "O", descriptor = "S")
    private short field2612;

    @OriginalMember(owner = "client!gb", name = "P", descriptor = "S")
    private short field2613;

    @OriginalMember(owner = "client!gb", name = "M", descriptor = "I")
    private int field2610;

    @OriginalMember(owner = "client!gb", name = "J", descriptor = "I")
    private static int field2607 = 12;

    @OriginalMember(owner = "client!gb", name = "H", descriptor = "I")
    private int field2605;

    @OriginalMember(owner = "client!gb", name = "C", descriptor = "S")
    private short field2600;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lo;IIIIIIIII)V")
    public final void method996(class248 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field2602 = arg0;
        this.field2608 = arg1 << field2607;
        this.field2609 = arg2 << field2607;
        this.field2611 = arg3 << field2607;
        this.field2604 = arg9;
        this.field2603 = this.field2599 = (short) arg8;
        this.field2606 = (short) arg4;
        this.field2612 = (short) arg5;
        this.field2613 = (short) arg6;
        this.field2610 = arg7;
        this.method999();
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(JI)V")
    public final void method997(long arg0, int arg1) {
        if (this.field2602 == null) {
            return;
        }
        this.field2599 = (short) (this.field2599 - arg1);
        if (this.field2599 <= 0) {
            this.method998();
            return;
        }
        int var4 = this.field2608 >> field2607;
        int var5 = this.field2609 >> field2607;
        int var6 = this.field2611 >> field2607;
        class136 var7 = this.field2602.field4282;
        class25 var8 = this.field2602.field4271;
        if (var8.field406 != 0) {
            if (this.field2603 - this.field2599 <= var8.field434) {
                int var9 = var8.field433 * arg1 + (this.field2605 >> 16 & 0xFF) + (this.field2604 >> 8 & 0xFF00);
                int var10 = var8.field427 * arg1 + (this.field2605 >> 8 & 0xFF) + (this.field2604 & 0xFF00);
                int var11 = var8.field377 * arg1 + (this.field2604 & 0xFF << 8) + (this.field2605 & 0xFF);
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
                this.field2604 &= 0xFF000000;
                this.field2604 |= ((var11 & 0xFF00) >> 8) + ((var9 & 0xFF00) << 8) + (var10 & 0xFF00);
                this.field2605 &= 0xFF000000;
                this.field2605 |= (var11 & 0xFF) + ((var9 & 0xFF) << 16) + ((var10 & 0xFF) << 8);
            }
            if (this.field2603 - this.field2599 <= var8.field423) {
                int var12 = var8.field439 * arg1 + (this.field2605 >> 24 & 0xFF) + (this.field2604 >> 16 & 0xFF00);
                if (var12 < 0) {
                    var12 = 0;
                } else if (var12 > 65535) {
                    var12 = 65535;
                }
                this.field2604 &= 0xFFFFFF;
                this.field2604 |= (var12 & 0xFF00) << 16;
                this.field2605 &= 0xFFFFFF;
                this.field2605 |= (var12 & 0xFF) << 24;
            }
        }
        if (var8.field402 != -1 && this.field2603 - this.field2599 <= var8.field383) {
            this.field2610 += var8.field375 * arg1;
        }
        int var13 = this.field2606;
        int var14 = this.field2612;
        int var15 = this.field2613;
        boolean var16 = false;
        if (var8.field389 == 1) {
            int var17 = var4 - this.field2602.field4262;
            int var18 = var5 - this.field2602.field4260;
            int var19 = var6 - this.field2602.field4276;
            int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
            long var21 = (long) (var8.field397 * var20 * arg1);
            this.field2610 = (int) ((long) this.field2610 - ((long) this.field2610 * var21 >> 18));
        } else if (var8.field389 == 2) {
            int var23 = var4 - this.field2602.field4262;
            int var24 = var5 - this.field2602.field4260;
            int var25 = var6 - this.field2602.field4276;
            int var26 = var25 * var25 + var23 * var23 + var24 * var24;
            long var27 = (long) (var8.field397 * var26 * arg1);
            this.field2610 = (int) ((long) this.field2610 - ((long) this.field2610 * var27 >> 28));
        }
        class125 var29 = var7.field2386.field1335;
        for (class125 var30 = var29.field2184; var30 != var29; var30 = var30.field2184) {
            class272 var56 = (class272) var30;
            class252 var57 = var56.field4807.field3455;
            if (var57.field4367 != 1) {
                int var58 = var4 - var56.field4794;
                int var59 = var5 - var56.field4810;
                int var60 = var6 - var56.field4795;
                long var61 = (long) (var60 * var60 + var58 * var58 + var59 * var59);
                if (var61 <= var57.field4356) {
                    int var63 = (int) Math.sqrt((double) var61);
                    if (var63 == 0) {
                        var63 = 1;
                    }
                    long var64 = (long) (var56.field4803 * var60 + var56.field4793 * var58 + var57.field4365 * var59) * 65535L / (long) (var57.field4359 * var63);
                    if (var64 >= (long) var57.field4350) {
                        int var66 = 0;
                        if (var57.field4362 == 1) {
                            var66 = (var63 >> 4) * var57.field4354;
                        } else if (var57.field4362 == 2) {
                            var66 = (var63 >> 4) * (var63 >> 4) * var57.field4354;
                        }
                        if (var57.field4353 != 0) {
                            int var67 = (var58 << 15) / var63 * var57.field4359;
                            int var68 = (var59 << 15) / var63 * var57.field4359;
                            int var69 = (var60 << 15) / var63 * var57.field4359;
                            if (var57.field4351 == 0) {
                                var13 += arg1 * var67 >> 15;
                                var14 += arg1 * var68 >> 15;
                                var15 += arg1 * var69 >> 15;
                                var16 = true;
                            } else {
                                this.field2608 += arg1 * var67 >> 15;
                                this.field2609 += arg1 * var68 >> 15;
                                this.field2611 += arg1 * var69 >> 15;
                            }
                        } else if (var57.field4351 == 0) {
                            var13 += (var56.field4793 - var66) * arg1;
                            var14 += (var57.field4365 - var66) * arg1;
                            var15 += (var56.field4803 - var66) * arg1;
                            var16 = true;
                        } else {
                            this.field2608 += (var56.field4793 - var66) * arg1;
                            this.field2609 += (var57.field4365 - var66) * arg1;
                            this.field2611 += (var56.field4803 - var66) * arg1;
                        }
                    }
                }
            }
        }
        if (var8.field398 != null) {
            for (int var31 = 0; var31 < var8.field398.length; var31++) {
                class272 var32 = (class272) class136.field2373.method1641((byte) -73, (long) var8.field398[var31]);
                while (var32 != null) {
                    class252 var33 = var32.field4807.field3455;
                    int var34 = var4 - var32.field4794;
                    int var35 = var5 - var32.field4810;
                    int var36 = var6 - var32.field4795;
                    long var37 = (long) (var36 * var36 + var34 * var34 + var35 * var35);
                    if (var37 > var33.field4356) {
                        var32 = (class272) class136.field2373.method1644((byte) 72);
                    } else {
                        int var39 = (int) Math.sqrt((double) var37);
                        if (var39 == 0) {
                            var39 = 1;
                        }
                        long var40 = (long) (var32.field4803 * var36 + var32.field4793 * var34 + var33.field4365 * var35) * 65535L / (long) (var33.field4359 * var39);
                        if (var40 < (long) var33.field4350) {
                            var32 = (class272) class136.field2373.method1644((byte) 77);
                        } else {
                            int var42 = 0;
                            if (var33.field4362 == 1) {
                                var42 = (var39 >> 4) * var33.field4354;
                            } else if (var33.field4362 == 2) {
                                var42 = (var39 >> 4) * (var39 >> 4) * var33.field4354;
                            }
                            if (var33.field4353 != 0) {
                                int var43 = (var34 << 15) / var39 * var33.field4359;
                                int var44 = (var35 << 15) / var39 * var33.field4359;
                                int var45 = (var36 << 15) / var39 * var33.field4359;
                                if (var33.field4351 == 0) {
                                    var13 += arg1 * var43 >> 15;
                                    var14 += arg1 * var44 >> 15;
                                    var15 += arg1 * var45 >> 15;
                                    var16 = true;
                                } else {
                                    this.field2608 += arg1 * var43 >> 15;
                                    this.field2609 += arg1 * var44 >> 15;
                                    this.field2611 += arg1 * var45 >> 15;
                                }
                            } else if (var33.field4351 == 0) {
                                var13 += (var32.field4793 - var42) * arg1;
                                var14 += (var33.field4365 - var42) * arg1;
                                var15 += (var32.field4803 - var42) * arg1;
                                var16 = true;
                            } else {
                                this.field2608 += (var32.field4793 - var42) * arg1;
                                this.field2609 += (var33.field4365 - var42) * arg1;
                                this.field2611 += (var32.field4803 - var42) * arg1;
                            }
                            var32 = (class272) class136.field2373.method1644((byte) 18);
                        }
                    }
                }
            }
        }
        if (var8.field379 != null) {
            for (int var46 = 0; var46 < var8.field379.length; var46++) {
                class252 var47 = class218.method1453((byte) -96, var8.field379[var46]);
                if (var47.field4351 == 0) {
                    var13 += var47.field4363 * arg1;
                    var14 += var47.field4365 * arg1;
                    var15 += var47.field4366 * arg1;
                    var16 = true;
                } else {
                    this.field2608 += var47.field4363 * arg1;
                    this.field2609 += var47.field4365 * arg1;
                    this.field2611 += var47.field4366 * arg1;
                }
            }
        }
        if (var16) {
            while (true) {
                if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                    this.field2606 = (short) var13;
                    this.field2612 = (short) var14;
                    this.field2613 = (short) var15;
                    break;
                }
                var13 >>= 0x1;
                var14 >>= 0x1;
                var15 >>= 0x1;
                this.field2610 <<= 0x1;
            }
        }
        this.field2608 = (int) ((long) this.field2608 + ((long) this.field2606 * (long) this.field2610 >> 23) * (long) arg1);
        this.field2609 = (int) ((long) this.field2609 + ((long) this.field2612 * (long) this.field2610 >> 23) * (long) arg1);
        this.field2611 = (int) ((long) this.field2611 + ((long) this.field2613 * (long) this.field2610 >> 23) * (long) arg1);
        int var48 = this.field2608 >> 19;
        int var49 = this.field2611 >> 19;
        int var50 = this.field2609 >> field2607;
        if (var50 > 0 || var50 < -65535 || var48 < 0 || var48 >= class253.field4372 || var49 < 0 || var49 >= class172.field3051) {
            this.method998();
            return;
        }
        int[][][] var51 = class189.field3337;
        int var52 = var51[var7.field2399][var48][var49];
        int var53;
        if (var7.field2399 < 3) {
            var53 = var51[var7.field2399 + 1][var48][var49];
        } else {
            var53 = var51[var7.field2399][var48][var49] - 1024;
        }
        if (var8.field417) {
            if (var8.field413 == -1 && var50 > var52) {
                this.method998();
                return;
            }
            if (var8.field413 >= 0 && var50 > var51[var8.field413][var48][var49]) {
                this.method998();
                return;
            }
            if (var8.field408 == -1 && var50 < var53) {
                this.method998();
                return;
            }
            if (var8.field408 >= 0 && var50 < var51[var8.field408 + 1][var48][var49]) {
                this.method998();
                return;
            }
        }
        if (var48 >= var7.field2398 && var48 <= var7.field2402 && var49 >= var7.field2391 && var49 <= var7.field2393 && var50 <= var7.field2396 && var50 >= var7.field2394) {
            this.field2601 = false;
            return;
        }
        this.field2601 = true;
        byte var54 = 3;
        if (var50 > var51[1][var48][var49]) {
            var54 = 0;
        } else if (var50 > var51[2][var48][var49]) {
            var54 = 1;
        } else if (var50 > var51[3][var48][var49]) {
            var54 = 2;
        } else if (var50 < var51[3][var48][var49] - 1024) {
            this.method998();
            return;
        }
        class216 var55 = class128.field2236[var54][var48][var49];
        if (var55 == null) {
            var55 = class128.field2236[var54][var48][var49] = new class216(var54, var48, var49);
        }
        if (var55.field3749 == null) {
            var55.field3749 = new class19();
            var55.field3751 = (byte) ((int) (arg0 & 0xFFL));
        } else if ((byte) ((int) (arg0 & 0xFFL)) != var55.field3751) {
            var55.field3749.method113(0);
            var55.field3751 = (byte) ((int) (arg0 & 0xFFL));
        }
        var55.field3749.method118(104, this);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "()V")
    private final void method998() {
        this.field2602.field4282.field2381[this.field2600] = null;
        class136.field2377[class136.field2370] = this;
        class136.field2370 = class136.field2370 + 1 & 0x3FF;
        this.field2602 = null;
        this.method1828(-1072);
        this.method422(123);
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "()V")
    private final void method999() {
        int var1 = this.field2602.field4282.field2369;
        if (this.field2602.field4282.field2381[var1] != null) {
            this.field2602.field4282.field2381[var1].method998();
        }
        this.field2602.field4282.field2381[var1] = this;
        this.field2600 = (short) this.field2602.field4282.field2369;
        this.field2602.field4282.field2369 = var1 + 1 & 0x1FFF;
        this.field2602.field4254.method395((byte) 73, this);
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lo;IIIIIIIII)V")
    public class148(class248 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field2602 = arg0;
        this.field2608 = arg1 << field2607;
        this.field2609 = arg2 << field2607;
        this.field2611 = arg3 << field2607;
        this.field2604 = arg9;
        this.field2603 = this.field2599 = (short) arg8;
        this.field2606 = (short) arg4;
        this.field2612 = (short) arg5;
        this.field2613 = (short) arg6;
        this.field2610 = arg7;
        this.method999();
    }
}
