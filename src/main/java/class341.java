import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class341 extends class355 {

    @OriginalMember(owner = "client!u", name = "K", descriptor = "Lpp;")
    private class380 field4352;

    @OriginalMember(owner = "client!u", name = "I", descriptor = "S")
    private short field4350;

    @OriginalMember(owner = "client!u", name = "H", descriptor = "S")
    private short field4349;

    @OriginalMember(owner = "client!u", name = "G", descriptor = "S")
    private short field4348;

    @OriginalMember(owner = "client!u", name = "J", descriptor = "S")
    private short field4351;

    @OriginalMember(owner = "client!u", name = "L", descriptor = "S")
    private short field4353;

    @OriginalMember(owner = "client!u", name = "F", descriptor = "I")
    private int field4347;

    @OriginalMember(owner = "client!u", name = "M", descriptor = "I")
    private int field4354;

    @OriginalMember(owner = "client!u", name = "N", descriptor = "S")
    private short field4355;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lpp;IIIIIIIIIIIZZ)V")
    public final void method2007(class380 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field4352 = arg0;
        super.field4558 = arg1 << class338.field4324;
        super.field4552 = arg2 << class338.field4324;
        super.field4557 = arg3 << class338.field4324;
        super.field4562 = arg9;
        this.field4349 = this.field4350 = (short) arg8;
        super.field4553 = arg10;
        super.field4556 = arg11;
        super.field4559 = arg13;
        this.field4348 = (short) arg4;
        this.field4351 = (short) arg5;
        this.field4353 = (short) arg6;
        this.field4347 = arg7;
        super.field4560 = this.field4352.field4926.field6901;
        this.method2009();
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "()V")
    private final void method2008() {
        this.field4352.field4931.field4232[this.field4355] = null;
        class519.field7676[class14.field239] = this;
        class14.field239 = class14.field239 + 1 & 1023;
        this.method2336((byte) 112);
        this.method240(3);
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "()V")
    private final void method2009() {
        int var1 = this.field4352.field4931.field4237;
        if (this.field4352.field4931.field4232[var1] != null) {
            this.field4352.field4931.field4232[var1].method2008();
        }
        this.field4352.field4931.field4232[var1] = this;
        this.field4355 = (short) this.field4352.field4931.field4237;
        this.field4352.field4931.field4237 = var1 + 1 & 8191;
        this.field4352.field4943.method2124(this, 123);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(JI)V")
    public final void method2010(long arg0, int arg1) {
        this.field4350 = (short) (this.field4350 - arg1);
        if (this.field4350 <= 0) {
            this.method2008();
        } else {
            int var4 = super.field4558 >> class338.field4324;
            int var5 = super.field4552 >> class338.field4324;
            int var6 = super.field4557 >> class338.field4324;
            class330 var7 = this.field4352.field4931;
            class292 var8 = this.field4352.field4935;
            if (var8.field3734 != 0) {
                if (this.field4349 - this.field4350 <= var8.field3756) {
                    int var9 = var8.field3742 * arg1 + (super.field4562 >> 8 & 65280) + (this.field4354 >> 16 & 255);
                    int var10 = var8.field3731 * arg1 + (this.field4354 >> 8 & 255) + (super.field4562 & 65280);
                    int var11 = var8.field3736 * arg1 + (super.field4562 << 8 & 65280) + (this.field4354 & 255);
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
                    super.field4562 &= -16777216;
                    super.field4562 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field4354 &= -16777216;
                    this.field4354 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field4349 - this.field4350 <= var8.field3796) {
                    int var12 = var8.field3777 * arg1 + (super.field4562 >> 16 & 65280) + (this.field4354 >> 24 & 255);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field4562 &= 16777215;
                    super.field4562 |= (var12 & 65280) << 16;
                    this.field4354 &= 16777215;
                    this.field4354 |= (var12 & 255) << 24;
                }
            }
            if (var8.field3735 != -1 && this.field4349 - this.field4350 <= var8.field3733) {
                this.field4347 += var8.field3730 * arg1;
            }
            if (var8.field3765 != -1 && this.field4349 - this.field4350 <= var8.field3729) {
                super.field4553 += var8.field3767 * arg1;
            }
            int var13 = this.field4348;
            int var14 = this.field4351;
            int var15 = this.field4353;
            boolean var16 = false;
            if (var8.field3753 == 1) {
                int var17 = var4 - this.field4352.field4929;
                int var18 = var5 - this.field4352.field4922;
                int var19 = var6 - this.field4352.field4939;
                int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
                long var21 = (long) (var8.field3743 * var20 * arg1);
                this.field4347 = (int) ((long) this.field4347 - ((long) this.field4347 * var21 >> 18));
            } else if (var8.field3753 == 2) {
                int var23 = var4 - this.field4352.field4929;
                int var24 = var5 - this.field4352.field4922;
                int var25 = var6 - this.field4352.field4939;
                int var26 = var25 * var25 + var23 * var23 + var24 * var24;
                long var27 = (long) (var8.field3743 * var26 * arg1);
                this.field4347 = (int) ((long) this.field4347 - ((long) this.field4347 * var27 >> 28));
            }
            if (var8.field3762 != null) {
                class508 var29 = var7.field4240.field64;
                for (class508 var30 = var29.field7454; var29 != var30; var30 = var30.field7454) {
                    class90 var31 = (class90) var30;
                    class388 var32 = var31.field1256;
                    if (var32.field5090 != 1) {
                        boolean var33 = false;
                        for (int var34 = 0; var34 < var8.field3762.length; ++var34) {
                            if (var8.field3762[var34] == var32.field5103) {
                                var33 = true;
                                break;
                            }
                        }
                        if (var33) {
                            int var35 = var4 - var31.field1253;
                            int var36 = var5 - var31.field1254;
                            int var37 = var6 - var31.field1250;
                            long var38 = (long) (var37 * var37 + var35 * var35 + var36 * var36);
                            if (var38 <= var32.field5102) {
                                int var40 = (int) Math.sqrt((double) var38);
                                if (var40 == 0) {
                                    var40 = 1;
                                }
                                long var41 = (long) (var31.field1248 * var37 + var31.field1258 * var35 + var32.field5097 * var36) * 65535L / (long) (var32.field5082 * var40);
                                if (var41 >= (long) var32.field5099) {
                                    int var43 = 0;
                                    if (var32.field5096 == 1) {
                                        var43 = (var40 >> 4) * var32.field5092;
                                    } else if (var32.field5096 == 2) {
                                        var43 = (var40 >> 4) * (var40 >> 4) * var32.field5092;
                                    }
                                    if (var32.field5091 == 0) {
                                        if (var32.field5084 == 0) {
                                            var13 += (var31.field1258 - var43) * arg1;
                                            var14 += (var32.field5097 - var43) * arg1;
                                            var15 += (var31.field1248 - var43) * arg1;
                                            var16 = true;
                                        } else {
                                            super.field4558 += (var31.field1258 - var43) * arg1;
                                            super.field4552 += (var32.field5097 - var43) * arg1;
                                            super.field4557 += (var31.field1248 - var43) * arg1;
                                        }
                                    } else {
                                        int var44 = (var35 << 15) / var40 * var32.field5082;
                                        int var45 = (var36 << 15) / var40 * var32.field5082;
                                        int var46 = (var37 << 15) / var40 * var32.field5082;
                                        if (var32.field5084 == 0) {
                                            var13 += arg1 * var44 >> 15;
                                            var14 += arg1 * var45 >> 15;
                                            var15 += arg1 * var46 >> 15;
                                            var16 = true;
                                        } else {
                                            super.field4558 += arg1 * var44 >> 15;
                                            super.field4552 += arg1 * var45 >> 15;
                                            super.field4557 += arg1 * var46 >> 15;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field3792 != null) {
                for (int var47 = 0; var47 < var8.field3792.length; ++var47) {
                    class90 var48 = (class90) class505.field7429.method743((long) var8.field3792[var47], 0);
                    while (var48 != null) {
                        class388 var49 = var48.field1256;
                        int var50 = var4 - var48.field1253;
                        int var51 = var5 - var48.field1254;
                        int var52 = var6 - var48.field1250;
                        long var53 = (long) (var52 * var52 + var50 * var50 + var51 * var51);
                        if (var53 > var49.field5102) {
                            var48 = (class90) class505.field7429.method742(-127);
                        } else {
                            int var55 = (int) Math.sqrt((double) var53);
                            if (var55 == 0) {
                                var55 = 1;
                            }
                            long var56 = (long) (var48.field1248 * var52 + var48.field1258 * var50 + var49.field5097 * var51) * 65535L / (long) (var49.field5082 * var55);
                            if (var56 < (long) var49.field5099) {
                                var48 = (class90) class505.field7429.method742(-111);
                            } else {
                                int var58 = 0;
                                if (var49.field5096 == 1) {
                                    var58 = (var55 >> 4) * var49.field5092;
                                } else if (var49.field5096 == 2) {
                                    var58 = (var55 >> 4) * (var55 >> 4) * var49.field5092;
                                }
                                if (var49.field5091 == 0) {
                                    if (var49.field5084 == 0) {
                                        var13 += (var48.field1258 - var58) * arg1;
                                        var14 += (var49.field5097 - var58) * arg1;
                                        var15 += (var48.field1248 - var58) * arg1;
                                        var16 = true;
                                    } else {
                                        super.field4558 += (var48.field1258 - var58) * arg1;
                                        super.field4552 += (var49.field5097 - var58) * arg1;
                                        super.field4557 += (var48.field1248 - var58) * arg1;
                                    }
                                } else {
                                    int var59 = (var50 << 15) / var55 * var49.field5082;
                                    int var60 = (var51 << 15) / var55 * var49.field5082;
                                    int var61 = (var52 << 15) / var55 * var49.field5082;
                                    if (var49.field5084 == 0) {
                                        var13 += arg1 * var59 >> 15;
                                        var14 += arg1 * var60 >> 15;
                                        var15 += arg1 * var61 >> 15;
                                        var16 = true;
                                    } else {
                                        super.field4558 += arg1 * var59 >> 15;
                                        super.field4552 += arg1 * var60 >> 15;
                                        super.field4557 += arg1 * var61 >> 15;
                                    }
                                }
                                var48 = (class90) class505.field7429.method742(-108);
                            }
                        }
                    }
                }
            }
            if (var8.field3780 != null) {
                if (var8.field3779 == null) {
                    var8.field3779 = new int[var8.field3780.length];
                    for (int var62 = 0; var62 < var8.field3780.length; ++var62) {
                        class65.method366((byte) 110, var8.field3780[var62]);
                        var8.field3779[var62] = ((class206) class376.field4893.method2085((long) var8.field3780[var62], -5423)).field2681;
                    }
                }
                for (int var63 = 0; var63 < var8.field3779.length; ++var63) {
                    class388 var64 = class448.field6223[var8.field3779[var63]];
                    if (var64.field5084 == 0) {
                        var13 += var64.field5087 * arg1;
                        var14 += var64.field5097 * arg1;
                        var15 += var64.field5079 * arg1;
                        var16 = true;
                    } else {
                        super.field4558 += var64.field5087 * arg1;
                        super.field4552 += var64.field5097 * arg1;
                        super.field4557 += var64.field5079 * arg1;
                    }
                }
            }
            if (var16) {
                while (true) {
                    if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                        this.field4348 = (short) var13;
                        this.field4351 = (short) var14;
                        this.field4353 = (short) var15;
                        break;
                    }
                    var13 >>= 1;
                    var14 >>= 1;
                    var15 >>= 1;
                    this.field4347 <<= 1;
                }
            }
            super.field4558 = (int) ((long) super.field4558 + ((long) this.field4348 * (long) this.field4347 >> 23) * (long) arg1);
            super.field4552 = (int) ((long) super.field4552 + ((long) this.field4351 * (long) this.field4347 >> 23) * (long) arg1);
            super.field4557 = (int) ((long) super.field4557 + ((long) this.field4353 * (long) this.field4347 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(J)V")
    public final void method2011(long arg0) {
        int var3 = super.field4558 >> class169.field2206 + 12;
        int var4 = super.field4557 >> class169.field2206 + 12;
        int var5 = super.field4552 >> class338.field4324;
        if (var5 <= 0 && var5 >= -262144 && var3 >= 0 && var3 < class166.field2155 && var4 >= 0 && var4 < class13.field230) {
            class330 var6 = this.field4352.field4931;
            class292 var7 = this.field4352.field4935;
            class251[] var8 = class92.field1285;
            int var9 = var8[var6.field4242].method1187(var3, var4);
            int var10;
            if (var6.field4242 < class412.field5495 - 1) {
                var10 = var8[var6.field4242 + 1].method1187(var3, var4);
            } else {
                var10 = var9 - (8 << class169.field2206);
            }
            if (var7.field3764) {
                if (var7.field3754 == -1 && var5 > var9) {
                    this.method2008();
                    return;
                }
                if (var7.field3754 >= 0 && var5 > var8[var7.field3754].method1187(var3, var4)) {
                    this.method2008();
                    return;
                }
                if (var7.field3763 == -1 && var5 < var10) {
                    this.method2008();
                    return;
                }
                if (var7.field3763 >= 0 && var5 < var8[var7.field3763 + 1].method1187(var3, var4)) {
                    this.method2008();
                    return;
                }
            }
            if (var3 >= var6.field4248 && var3 <= var6.field4241 && var4 >= var6.field4245 && var4 <= var6.field4243 && var5 <= var9 && var5 >= var10) {
                var6.field4247.field3665.method2826(this, -117);
            } else {
                int var11;
                for (var11 = class412.field5495 - 1; var11 > 0 && var5 > var8[var11].method1187(var3, var4); --var11) {
                }
                if (var11 == 0 && var5 > var8[0].method1187(var3, var4)) {
                    this.method2008();
                } else if (class412.field5495 - 1 == var11 && var8[var11].method1187(var3, var4) - var5 > 8 << class169.field2206) {
                    this.method2008();
                } else {
                    class510 var12 = class470.field6877[var11][var3][var4];
                    if (var12 == null) {
                        if (var11 == 0) {
                            var12 = class470.field6877[0][var3][var4] = new class510(0, var3, var4);
                        }
                        boolean var13 = class470.field6877[0][var3][var4].field7483 != null;
                        if (var11 == 3 && var13) {
                            this.method2008();
                            return;
                        }
                        for (int var14 = 1; var14 <= var11; ++var14) {
                            if (class470.field6877[var14][var3][var4] == null) {
                                var12 = class470.field6877[var14][var3][var4] = new class510(var14, var3, var4);
                                if (var13) {
                                    ++var12.field7500;
                                }
                            }
                        }
                    }
                    if (var12.field7501 == null) {
                        var12.field7501 = new class287();
                        var12.field7498 = (byte) ((int) (arg0 & 255L));
                    } else if ((byte) ((int) (arg0 & 255L)) != var12.field7498) {
                        var12.field7501.field3665.method2829(87);
                        var12.field7501.field3667 = false;
                        var12.field7498 = (byte) ((int) (arg0 & 255L));
                    }
                    var12.field7501.field3665.method2826(this, -48);
                }
            }
        } else {
            this.method2008();
        }
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lpp;IIIIIIIIIIIZZ)V")
    public class341(class380 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field4352 = arg0;
        super.field4558 = arg1 << class338.field4324;
        super.field4552 = arg2 << class338.field4324;
        super.field4557 = arg3 << class338.field4324;
        super.field4562 = arg9;
        this.field4349 = this.field4350 = (short) arg8;
        super.field4553 = arg10;
        super.field4556 = arg11;
        super.field4559 = arg13;
        this.field4348 = (short) arg4;
        this.field4351 = (short) arg5;
        this.field4353 = (short) arg6;
        this.field4347 = arg7;
        super.field4560 = this.field4352.field4926.field6901;
        this.method2009();
    }
}
