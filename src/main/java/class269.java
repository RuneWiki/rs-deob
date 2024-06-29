import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class269 extends class68 {

    @OriginalMember(owner = "client!jl", name = "G", descriptor = "Z")
    public boolean field4411 = false;

    @OriginalMember(owner = "client!jl", name = "M", descriptor = "Lac;")
    public class143 field4417;

    @OriginalMember(owner = "client!jl", name = "P", descriptor = "I")
    public int field4420;

    @OriginalMember(owner = "client!jl", name = "K", descriptor = "I")
    public int field4415;

    @OriginalMember(owner = "client!jl", name = "N", descriptor = "I")
    public int field4418;

    @OriginalMember(owner = "client!jl", name = "C", descriptor = "I")
    public int field4407;

    @OriginalMember(owner = "client!jl", name = "H", descriptor = "S")
    private short field4412;

    @OriginalMember(owner = "client!jl", name = "L", descriptor = "S")
    private short field4416;

    @OriginalMember(owner = "client!jl", name = "F", descriptor = "S")
    private short field4410;

    @OriginalMember(owner = "client!jl", name = "B", descriptor = "S")
    private short field4406;

    @OriginalMember(owner = "client!jl", name = "D", descriptor = "S")
    private short field4408;

    @OriginalMember(owner = "client!jl", name = "E", descriptor = "I")
    private int field4409;

    @OriginalMember(owner = "client!jl", name = "O", descriptor = "I")
    private static int field4419 = 12;

    @OriginalMember(owner = "client!jl", name = "J", descriptor = "I")
    private int field4414;

    @OriginalMember(owner = "client!jl", name = "I", descriptor = "S")
    private short field4413;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "()V")
    private final void method1847() {
        int var1 = this.field4417.field2240.field1214;
        if (this.field4417.field2240.field1202[var1] != null) {
            this.field4417.field2240.field1202[var1].method1850();
        }
        this.field4417.field2240.field1202[var1] = this;
        this.field4413 = (short) this.field4417.field2240.field1214;
        this.field4417.field2240.field1214 = var1 + 1 & 0x1FFF;
        this.field4417.field2245.method998(this, (byte) -61);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lac;IIIIIIIII)V")
    public final void method1848(class143 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field4417 = arg0;
        this.field4420 = arg1 << field4419;
        this.field4415 = arg2 << field4419;
        this.field4418 = arg3 << field4419;
        this.field4407 = arg9;
        this.field4416 = this.field4412 = (short) arg8;
        this.field4410 = (short) arg4;
        this.field4406 = (short) arg5;
        this.field4408 = (short) arg6;
        this.field4409 = arg7;
        this.method1847();
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(JI)V")
    public final void method1849(long arg0, int arg1) {
        if (this.field4417 == null) {
            return;
        }
        this.field4412 = (short) (this.field4412 - arg1);
        if (this.field4412 <= 0) {
            this.method1850();
            return;
        }
        int var4 = this.field4420 >> field4419;
        int var5 = this.field4415 >> field4419;
        int var6 = this.field4418 >> field4419;
        class77 var7 = this.field4417.field2240;
        class42 var8 = this.field4417.field2254;
        if (var8.field538 != 0) {
            if (this.field4416 - this.field4412 <= var8.field545) {
                int var9 = var8.field528 * arg1 + (this.field4414 >> 16 & 0xFF) + (this.field4407 >> 8 & 0xFF00);
                int var10 = var8.field589 * arg1 + (this.field4414 >> 8 & 0xFF) + (this.field4407 & 0xFF00);
                int var11 = var8.field540 * arg1 + (this.field4407 & 0xFF << 8) + (this.field4414 & 0xFF);
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
                this.field4407 &= 0xFF000000;
                this.field4407 |= ((var11 & 0xFF00) >> 8) + ((var9 & 0xFF00) << 8) + (var10 & 0xFF00);
                this.field4414 &= 0xFF000000;
                this.field4414 |= (var11 & 0xFF) + ((var9 & 0xFF) << 16) + ((var10 & 0xFF) << 8);
            }
            if (this.field4416 - this.field4412 <= var8.field537) {
                int var12 = var8.field581 * arg1 + (this.field4414 >> 24 & 0xFF) + (this.field4407 >> 16 & 0xFF00);
                if (var12 < 0) {
                    var12 = 0;
                } else if (var12 > 65535) {
                    var12 = 65535;
                }
                this.field4407 &= 0xFFFFFF;
                this.field4407 |= (var12 & 0xFF00) << 16;
                this.field4414 &= 0xFFFFFF;
                this.field4414 |= (var12 & 0xFF) << 24;
            }
        }
        if (var8.field574 != -1 && this.field4416 - this.field4412 <= var8.field584) {
            this.field4409 += var8.field582 * arg1;
        }
        int var13 = this.field4410;
        int var14 = this.field4406;
        int var15 = this.field4408;
        boolean var16 = false;
        if (var8.field554 == 1) {
            int var17 = var4 - this.field4417.field2235;
            int var18 = var5 - this.field4417.field2234;
            int var19 = var6 - this.field4417.field2224;
            int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
            long var21 = (long) (var8.field578 * var20 * arg1);
            this.field4409 = (int) ((long) this.field4409 - ((long) this.field4409 * var21 >> 18));
        } else if (var8.field554 == 2) {
            int var23 = var4 - this.field4417.field2235;
            int var24 = var5 - this.field4417.field2234;
            int var25 = var6 - this.field4417.field2224;
            int var26 = var25 * var25 + var23 * var23 + var24 * var24;
            long var27 = (long) (var8.field578 * var26 * arg1);
            this.field4409 = (int) ((long) this.field4409 - ((long) this.field4409 * var27 >> 28));
        }
        class134 var29 = var7.field1220.field4646;
        for (class134 var30 = var29.field2104; var30 != var29; var30 = var30.field2104) {
            class271 var57 = (class271) var30;
            class141 var58 = var57.field4440.field4736;
            if (var58.field2194 != 1) {
                int var59 = var4 - var57.field4436;
                int var60 = var5 - var57.field4434;
                int var61 = var6 - var57.field4449;
                long var62 = (long) (var61 * var61 + var59 * var59 + var60 * var60);
                if (var62 <= var58.field2168) {
                    int var64 = (int) Math.sqrt((double) var62);
                    if (var64 == 0) {
                        var64 = 1;
                    }
                    long var65 = (long) (var57.field4447 * var61 + var57.field4445 * var59 + var58.field2193 * var60) * 65535L / (long) (var58.field2187 * var64);
                    if (var65 >= (long) var58.field2170) {
                        int var67 = 0;
                        if (var58.field2195 == 1) {
                            var67 = (var64 >> 4) * var58.field2188;
                        } else if (var58.field2195 == 2) {
                            var67 = (var64 >> 4) * (var64 >> 4) * var58.field2188;
                        }
                        if (var58.field2175 != 0) {
                            int var68 = (var59 << 15) / var64 * var58.field2187;
                            int var69 = (var60 << 15) / var64 * var58.field2187;
                            int var70 = (var61 << 15) / var64 * var58.field2187;
                            if (var58.field2169 == 0) {
                                var13 += arg1 * var68 >> 15;
                                var14 += arg1 * var69 >> 15;
                                var15 += arg1 * var70 >> 15;
                                var16 = true;
                            } else {
                                this.field4420 += arg1 * var68 >> 15;
                                this.field4415 += arg1 * var69 >> 15;
                                this.field4418 += arg1 * var70 >> 15;
                            }
                        } else if (var58.field2169 == 0) {
                            var13 += (var57.field4445 - var67) * arg1;
                            var14 += (var58.field2193 - var67) * arg1;
                            var15 += (var57.field4447 - var67) * arg1;
                            var16 = true;
                        } else {
                            this.field4420 += (var57.field4445 - var67) * arg1;
                            this.field4415 += (var58.field2193 - var67) * arg1;
                            this.field4418 += (var57.field4447 - var67) * arg1;
                        }
                    }
                }
            }
        }
        if (var8.field560 != null) {
            for (int var31 = 0; var31 < var8.field560.length; var31++) {
                class271 var32 = (class271) class77.field1208.method459(-120, (long) var8.field560[var31]);
                while (var32 != null) {
                    class141 var33 = var32.field4440.field4736;
                    int var34 = var4 - var32.field4436;
                    int var35 = var5 - var32.field4434;
                    int var36 = var6 - var32.field4449;
                    long var37 = (long) (var36 * var36 + var34 * var34 + var35 * var35);
                    if (var37 > var33.field2168) {
                        var32 = (class271) class77.field1208.method456((byte) -127);
                    } else {
                        int var39 = (int) Math.sqrt((double) var37);
                        if (var39 == 0) {
                            var39 = 1;
                        }
                        long var40 = (long) (var32.field4447 * var36 + var32.field4445 * var34 + var33.field2193 * var35) * 65535L / (long) (var33.field2187 * var39);
                        if (var40 < (long) var33.field2170) {
                            var32 = (class271) class77.field1208.method456((byte) -120);
                        } else {
                            int var42 = 0;
                            if (var33.field2195 == 1) {
                                var42 = (var39 >> 4) * var33.field2188;
                            } else if (var33.field2195 == 2) {
                                var42 = (var39 >> 4) * (var39 >> 4) * var33.field2188;
                            }
                            if (var33.field2175 != 0) {
                                int var43 = (var34 << 15) / var39 * var33.field2187;
                                int var44 = (var35 << 15) / var39 * var33.field2187;
                                int var45 = (var36 << 15) / var39 * var33.field2187;
                                if (var33.field2169 == 0) {
                                    var13 += arg1 * var43 >> 15;
                                    var14 += arg1 * var44 >> 15;
                                    var15 += arg1 * var45 >> 15;
                                    var16 = true;
                                } else {
                                    this.field4420 += arg1 * var43 >> 15;
                                    this.field4415 += arg1 * var44 >> 15;
                                    this.field4418 += arg1 * var45 >> 15;
                                }
                            } else if (var33.field2169 == 0) {
                                var13 += (var32.field4445 - var42) * arg1;
                                var14 += (var33.field2193 - var42) * arg1;
                                var15 += (var32.field4447 - var42) * arg1;
                                var16 = true;
                            } else {
                                this.field4420 += (var32.field4445 - var42) * arg1;
                                this.field4415 += (var33.field2193 - var42) * arg1;
                                this.field4418 += (var32.field4447 - var42) * arg1;
                            }
                            var32 = (class271) class77.field1208.method456((byte) -123);
                        }
                    }
                }
            }
        }
        if (var8.field570 != null) {
            if (var8.field562 == null) {
                var8.field562 = new int[var8.field570.length];
                for (int var46 = 0; var46 < var8.field570.length; var46++) {
                    class101.method659((byte) 102, var8.field570[var46]);
                    var8.field562[var46] = ((class221) class75.field1178.method872((byte) -108, (long) var8.field570[var46])).field3542;
                }
            }
            for (int var47 = 0; var47 < var8.field562.length; var47++) {
                class141 var48 = class101.field1525[var8.field562[var47]];
                if (var48.field2169 == 0) {
                    var13 += var48.field2178 * arg1;
                    var14 += var48.field2193 * arg1;
                    var15 += var48.field2167 * arg1;
                    var16 = true;
                } else {
                    this.field4420 += var48.field2178 * arg1;
                    this.field4415 += var48.field2193 * arg1;
                    this.field4418 += var48.field2167 * arg1;
                }
            }
        }
        if (var16) {
            while (true) {
                if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                    this.field4410 = (short) var13;
                    this.field4406 = (short) var14;
                    this.field4408 = (short) var15;
                    break;
                }
                var13 >>= 0x1;
                var14 >>= 0x1;
                var15 >>= 0x1;
                this.field4409 <<= 0x1;
            }
        }
        this.field4420 = (int) ((long) this.field4420 + ((long) this.field4410 * (long) this.field4409 >> 23) * (long) arg1);
        this.field4415 = (int) ((long) this.field4415 + ((long) this.field4406 * (long) this.field4409 >> 23) * (long) arg1);
        this.field4418 = (int) ((long) this.field4418 + ((long) this.field4408 * (long) this.field4409 >> 23) * (long) arg1);
        int var49 = this.field4420 >> 19;
        int var50 = this.field4418 >> 19;
        int var51 = this.field4415 >> field4419;
        if (var51 > 0 || var51 < -65535 || var49 < 0 || var49 >= class183.field2835 || var50 < 0 || var50 >= class90.field1391) {
            this.method1850();
            return;
        }
        int[][][] var52 = class242.field3842;
        int var53 = var52[var7.field1221][var49][var50];
        int var54;
        if (var7.field1221 < 3) {
            var54 = var52[var7.field1221 + 1][var49][var50];
        } else {
            var54 = var52[var7.field1221][var49][var50] - 1024;
        }
        if (var8.field567) {
            if (var8.field532 == -1 && var51 > var53) {
                this.method1850();
                return;
            }
            if (var8.field532 >= 0 && var51 > var52[var8.field532][var49][var50]) {
                this.method1850();
                return;
            }
            if (var8.field557 == -1 && var51 < var54) {
                this.method1850();
                return;
            }
            if (var8.field557 >= 0 && var51 < var52[var8.field557 + 1][var49][var50]) {
                this.method1850();
                return;
            }
        }
        if (var49 >= var7.field1227 && var49 <= var7.field1226 && var50 >= var7.field1232 && var50 <= var7.field1233 && var51 <= var7.field1223 && var51 >= var7.field1231) {
            this.field4411 = false;
            return;
        }
        this.field4411 = true;
        byte var55 = 3;
        if (var51 > var52[1][var49][var50]) {
            var55 = 0;
        } else if (var51 > var52[2][var49][var50]) {
            var55 = 1;
        } else if (var51 > var52[3][var49][var50]) {
            var55 = 2;
        } else if (var51 < var52[3][var49][var50] - 1024) {
            this.method1850();
            return;
        }
        class154 var56 = class27.field346[var55][var49][var50];
        if (var56 == null) {
            var56 = class27.field346[var55][var49][var50] = new class154(var55, var49, var50);
        }
        if (var56.field2424 == null) {
            var56.field2424 = new class100();
            var56.field2413 = (byte) ((int) (arg0 & 0xFFL));
        } else if ((byte) ((int) (arg0 & 0xFFL)) != var56.field2413) {
            var56.field2424.method653((byte) 88);
            var56.field2413 = (byte) ((int) (arg0 & 0xFFL));
        }
        var56.field2424.method654(this, -26706);
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "()V")
    private final void method1850() {
        this.field4417.field2240.field1202[this.field4413] = null;
        class77.field1197[class77.field1204] = this;
        class77.field1204 = class77.field1204 + 1 & 0x3FF;
        this.field4417 = null;
        this.method1574((byte) 112);
        this.method426(-82);
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(Lac;IIIIIIIII)V")
    public class269(class143 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field4417 = arg0;
        this.field4420 = arg1 << field4419;
        this.field4415 = arg2 << field4419;
        this.field4418 = arg3 << field4419;
        this.field4407 = arg9;
        this.field4416 = this.field4412 = (short) arg8;
        this.field4410 = (short) arg4;
        this.field4406 = (short) arg5;
        this.field4408 = (short) arg6;
        this.field4409 = arg7;
        this.method1847();
    }
}
