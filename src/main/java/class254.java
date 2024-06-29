import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class254 extends class295 {

    @OriginalMember(owner = "client!ae", name = "F", descriptor = "Lqba;")
    public class408 field3291;

    @OriginalMember(owner = "client!ae", name = "K", descriptor = "S")
    private short field3296;

    @OriginalMember(owner = "client!ae", name = "G", descriptor = "S")
    private short field3292;

    @OriginalMember(owner = "client!ae", name = "J", descriptor = "S")
    private short field3295;

    @OriginalMember(owner = "client!ae", name = "E", descriptor = "S")
    private short field3290;

    @OriginalMember(owner = "client!ae", name = "H", descriptor = "S")
    private short field3293;

    @OriginalMember(owner = "client!ae", name = "L", descriptor = "I")
    private int field3297;

    @OriginalMember(owner = "client!ae", name = "I", descriptor = "I")
    private int field3294;

    @OriginalMember(owner = "client!ae", name = "M", descriptor = "S")
    private short field3298;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(JI)V", line = 4)
    public final void method1511(long arg0, int arg1) {
        this.field3296 = (short) (this.field3296 - arg1);
        if (this.field3296 <= 0) {
            this.method1515();
        } else {
            int var4 = super.field3964 >> 12;
            int var5 = super.field3965 >> 12;
            int var6 = super.field3963 >> 12;
            class550 var7 = this.field3291.field5749;
            class327 var8 = this.field3291.field5747;
            if (var8.field4399 != 0) {
                if (this.field3292 - this.field3296 <= var8.field4400) {
                    int var9 = var8.field4378 * arg1 + (super.field3966 >> 8 & 65280) + (this.field3294 >> 16 & 255);
                    int var10 = var8.field4368 * arg1 + (this.field3294 >> 8 & 255) + (super.field3966 & 65280);
                    int var11 = var8.field4362 * arg1 + (super.field3966 << 8 & 65280) + (this.field3294 & 255);
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
                    super.field3966 &= -16777216;
                    super.field3966 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field3294 &= -16777216;
                    this.field3294 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field3292 - this.field3296 <= var8.field4396) {
                    int var12 = var8.field4419 * arg1 + (super.field3966 >> 16 & 65280) + (this.field3294 >> 24 & 255);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field3966 &= 16777215;
                    super.field3966 |= (var12 & 65280) << 16;
                    this.field3294 &= 16777215;
                    this.field3294 |= (var12 & 255) << 24;
                }
            }
            if (var8.field4380 != -1 && this.field3292 - this.field3296 <= var8.field4426) {
                this.field3297 += var8.field4421 * arg1;
            }
            if (var8.field4415 != -1 && this.field3292 - this.field3296 <= var8.field4417) {
                super.field3967 += var8.field4377 * arg1;
            }
            double var13 = (double) this.field3295;
            double var15 = (double) this.field3290;
            double var17 = (double) this.field3293;
            boolean var19 = false;
            if (var8.field4374 == 1) {
                int var20 = var4 - this.field3291.field5753.field2886;
                int var21 = var5 - this.field3291.field5753.field2888;
                int var22 = var6 - this.field3291.field5753.field2892;
                int var23 = (int) Math.sqrt((double) (var22 * var22 + var20 * var20 + var21 * var21)) >> 2;
                long var24 = (long) (var8.field4434 * var23 * arg1);
                this.field3297 = (int) ((long) this.field3297 - ((long) this.field3297 * var24 >> 18));
            } else if (var8.field4374 == 2) {
                int var26 = var4 - this.field3291.field5753.field2886;
                int var27 = var5 - this.field3291.field5753.field2888;
                int var28 = var6 - this.field3291.field5753.field2892;
                int var29 = var28 * var28 + var26 * var26 + var27 * var27;
                long var30 = (long) (var8.field4434 * var29 * arg1);
                this.field3297 = (int) ((long) this.field3297 - ((long) this.field3297 * var30 >> 28));
            }
            if (var8.field4363 != null) {
                class55 var32 = var7.field7786.field1438;
                for (class55 var33 = var32.field564; var32 != var33; var33 = var33.field564) {
                    class324 var34 = (class324) var33;
                    class711 var35 = var34.field4343;
                    if (var35.field9924 != 1) {
                        boolean var36 = false;
                        for (int var37 = 0; var37 < var8.field4363.length; ++var37) {
                            if (var8.field4363[var37] == var35.field9926) {
                                var36 = true;
                                break;
                            }
                        }
                        if (var36) {
                            double var38 = (double) (var4 - var34.field4342);
                            double var40 = (double) (var5 - var34.field4344);
                            double var42 = (double) (var6 - var34.field4352);
                            double var44 = var42 * var42 + var38 * var38 + var40 * var40;
                            if (!(var44 > (double) var35.field9933)) {
                                double var46 = Math.sqrt(var44);
                                if (var46 == 0.0D) {
                                    var46 = 1.0D;
                                }
                                double var48 = ((double) var34.field4350 * var42 + (double) var34.field4346 * var38 + (double) var35.field9928 * var40) * 65535.0D / ((double) var35.field9935 * var46);
                                if (!(var48 < (double) var35.field9931)) {
                                    double var50 = 0.0D;
                                    if (var35.field9936 == 1) {
                                        var50 = var46 / 16.0D * (double) var35.field9929;
                                    } else if (var35.field9936 == 2) {
                                        var50 = var46 / 16.0D * (var46 / 16.0D) * (double) var35.field9929;
                                    }
                                    if (var35.field9932 == 0) {
                                        if (var35.field9930 == 0) {
                                            var13 += ((double) var34.field4346 - var50) * (double) arg1;
                                            var15 += ((double) var35.field9928 - var50) * (double) arg1;
                                            var17 += ((double) var34.field4350 - var50) * (double) arg1;
                                            var19 = true;
                                        } else {
                                            super.field3964 = (int) ((double) super.field3964 + ((double) var34.field4346 - var50) * (double) arg1);
                                            super.field3965 = (int) ((double) super.field3965 + ((double) var35.field9928 - var50) * (double) arg1);
                                            super.field3963 = (int) ((double) super.field3963 + ((double) var34.field4350 - var50) * (double) arg1);
                                        }
                                    } else {
                                        double var52 = var38 / var46 * (double) var35.field9935;
                                        double var54 = var40 / var46 * (double) var35.field9935;
                                        double var56 = var42 / var46 * (double) var35.field9935;
                                        if (var35.field9930 == 0) {
                                            var13 += (double) arg1 * var52;
                                            var15 += (double) arg1 * var54;
                                            var17 += (double) arg1 * var56;
                                            var19 = true;
                                        } else {
                                            super.field3964 = (int) ((double) super.field3964 + (double) arg1 * var52);
                                            super.field3965 = (int) ((double) super.field3965 + (double) arg1 * var54);
                                            super.field3963 = (int) ((double) super.field3963 + (double) arg1 * var56);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field4370 != null) {
                for (int var58 = 0; var58 < var8.field4370.length; ++var58) {
                    class324 var59 = (class324) class719.field10063.method3173((long) var8.field4370[var58], (byte) -91);
                    while (var59 != null) {
                        class711 var60 = var59.field4343;
                        double var61 = (double) (var4 - var59.field4342);
                        double var63 = (double) (var5 - var59.field4344);
                        double var65 = (double) (var6 - var59.field4352);
                        double var67 = var65 * var65 + var61 * var61 + var63 * var63;
                        if (var67 > (double) var60.field9933) {
                            var59 = (class324) class719.field10063.method3174(false);
                        } else {
                            double var69 = Math.sqrt(var67);
                            if (var69 == 0.0D) {
                                var69 = 1.0D;
                            }
                            double var71 = ((double) var59.field4350 * var65 + (double) var59.field4346 * var61 + (double) var60.field9928 * var63) * 65535.0D / ((double) var60.field9935 * var69);
                            if (var71 < (double) var60.field9931) {
                                var59 = (class324) class719.field10063.method3174(false);
                            } else {
                                double var73 = 0.0D;
                                if (var60.field9936 == 1) {
                                    var73 = var69 / 16.0D * (double) var60.field9929;
                                } else if (var60.field9936 == 2) {
                                    var73 = var69 / 16.0D * (var69 / 16.0D) * (double) var60.field9929;
                                }
                                if (var60.field9932 == 0) {
                                    if (var60.field9930 == 0) {
                                        var13 += ((double) var59.field4346 - var73) * (double) arg1;
                                        var15 += ((double) var60.field9928 - var73) * (double) arg1;
                                        var17 += ((double) var59.field4350 - var73) * (double) arg1;
                                        var19 = true;
                                    } else {
                                        super.field3964 = (int) ((double) super.field3964 + ((double) var59.field4346 - var73) * (double) arg1);
                                        super.field3965 = (int) ((double) super.field3965 + ((double) var60.field9928 - var73) * (double) arg1);
                                        super.field3963 = (int) ((double) super.field3963 + ((double) var59.field4350 - var73) * (double) arg1);
                                    }
                                } else {
                                    double var75 = var61 / var69 * (double) var60.field9935;
                                    double var77 = var63 / var69 * (double) var60.field9935;
                                    double var79 = var65 / var69 * (double) var60.field9935;
                                    if (var60.field9930 == 0) {
                                        var13 += (double) arg1 * var75;
                                        var15 += (double) arg1 * var77;
                                        var17 += (double) arg1 * var79;
                                        var19 = true;
                                    } else {
                                        super.field3964 = (int) ((double) super.field3964 + (double) arg1 * var75);
                                        super.field3965 = (int) ((double) super.field3965 + (double) arg1 * var77);
                                        super.field3963 = (int) ((double) super.field3963 + (double) arg1 * var79);
                                    }
                                }
                                var59 = (class324) class719.field10063.method3174(false);
                            }
                        }
                    }
                }
            }
            if (var8.field4411 != null) {
                if (var8.field4407 == null) {
                    var8.field4407 = new int[var8.field4411.length];
                    for (int var81 = 0; var81 < var8.field4411.length; ++var81) {
                        class245.method1474(var8.field4411[var81], 31866);
                        var8.field4407[var81] = ((class629) class351.field4692.method2552((long) var8.field4411[var81], -1)).field8775;
                    }
                }
                for (int var82 = 0; var82 < var8.field4407.length; ++var82) {
                    class711 var83 = class387.field5467[var8.field4407[var82]];
                    if (var83.field9930 == 0) {
                        var13 += (double) (var83.field9922 * arg1);
                        var15 += (double) (var83.field9928 * arg1);
                        var17 += (double) (var83.field9921 * arg1);
                        var19 = true;
                    } else {
                        super.field3964 += var83.field9922 * arg1;
                        super.field3965 += var83.field9928 * arg1;
                        super.field3963 += var83.field9921 * arg1;
                    }
                }
            }
            if (var19) {
                while (true) {
                    if (!(var13 > 32767.0D) && !(var15 > 32767.0D) && !(var17 > 32767.0D) && !(var13 < -32767.0D) && !(var15 < -32767.0D) && !(var17 < -32767.0D)) {
                        this.field3295 = (short) ((int) var13);
                        this.field3290 = (short) ((int) var15);
                        this.field3293 = (short) ((int) var17);
                        break;
                    }
                    var13 /= 2.0D;
                    var15 /= 2.0D;
                    var17 /= 2.0D;
                    this.field3297 <<= 1;
                }
            }
            super.field3964 = (int) ((long) super.field3964 + ((long) (this.field3297 << 2) * (long) this.field3295 >> 23) * (long) arg1);
            super.field3965 = (int) ((long) super.field3965 + ((long) (this.field3297 << 2) * (long) this.field3290 >> 23) * (long) arg1);
            super.field3963 = (int) ((long) super.field3963 + ((long) (this.field3297 << 2) * (long) this.field3293 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "()V", line = 401)
    private final void method1512() {
        int var1 = this.field3291.field5749.field7777;
        if (this.field3291.field5749.field7779[var1] != null) {
            this.field3291.field5749.field7779[var1].method1515();
        }
        this.field3291.field5749.field7779[var1] = this;
        this.field3298 = (short) this.field3291.field5749.field7777;
        this.field3291.field5749.field7777 = var1 + 1 & 8191;
        this.field3291.field5759.method118(true, this);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lha;J)V", line = 412)
    public final void method1513(class60 arg0, long arg1) {
        int var4 = super.field3964 >> class443.field6172 + 12;
        int var5 = super.field3963 >> class443.field6172 + 12;
        int var6 = super.field3965 >> 12;
        if (var6 <= 0 && var6 >= -262144 && var4 >= 0 && var4 < class68.field743 && var5 >= 0 && var5 < class480.field6629) {
            class550 var7 = this.field3291.field5749;
            class327 var8 = this.field3291.field5747;
            class281[] var9 = class25.field188;
            int var10 = var7.field7790;
            class624 var11 = class77.field947[var7.field7790][var4][var5];
            if (var11 != null) {
                var10 = var11.field8726;
            }
            int var12 = var9[var10].method1685(var5, -12639, var4);
            int var13;
            if (var10 < class307.field4170 - 1) {
                var13 = var9[var10 + 1].method1685(var5, -12639, var4);
            } else {
                var13 = var12 - (8 << class443.field6172);
            }
            if (var8.field4371) {
                if (var8.field4414 == -1 && var6 > var12) {
                    this.method1515();
                    return;
                }
                if (var8.field4414 >= 0 && var6 > var9[var8.field4414].method1685(var5, -12639, var4)) {
                    this.method1515();
                    return;
                }
                if (var8.field4423 == -1 && var6 < var13) {
                    this.method1515();
                    return;
                }
                if (var8.field4423 >= 0 && var6 < var9[var8.field4423 + 1].method1685(var5, -12639, var4)) {
                    this.method1515();
                    return;
                }
            }
            int var14;
            for (var14 = class307.field4170 - 1; var14 > 0 && var6 > var9[var14].method1685(var5, -12639, var4); --var14) {
            }
            if (var8.field4416 && var14 == 0 && var6 > var9[0].method1685(var5, -12639, var4)) {
                this.method1515();
            } else if (class307.field4170 - 1 == var14 && var9[var14].method1685(var5, -12639, var4) - var6 > 8 << class443.field6172) {
                this.method1515();
            } else {
                class624 var15 = class77.field947[var14][var4][var5];
                if (var15 == null) {
                    if (var14 == 0 || class77.field947[0][var4][var5] == null) {
                        var15 = class77.field947[0][var4][var5] = new class624(0);
                    }
                    boolean var16 = class77.field947[0][var4][var5].field8734 != null;
                    if (var14 == 3 && var16) {
                        this.method1515();
                        return;
                    }
                    for (int var17 = 1; var17 <= var14; ++var17) {
                        if (class77.field947[var17][var4][var5] == null) {
                            var15 = class77.field947[var17][var4][var5] = new class624(var17);
                            if (var16) {
                                ++var15.field8726;
                            }
                        }
                    }
                }
                if (var8.field4430) {
                    int var18 = super.field3964 >> 12;
                    int var19 = super.field3963 >> 12;
                    if (var15.field8728 != null) {
                        class90 var20 = var15.field8728.method134((byte) -53, arg0);
                        if (var20 != null && var20.method643(var18, var6, var19, 0)) {
                            this.method1515();
                            return;
                        }
                    }
                    if (var15.field8737 != null) {
                        class90 var21 = var15.field8737.method134((byte) -53, arg0);
                        if (var21 != null && var21.method643(var18, var6, var19, 0)) {
                            this.method1515();
                            return;
                        }
                    }
                    if (var15.field8736 != null) {
                        class90 var22 = var15.field8736.method134((byte) -53, arg0);
                        if (var22 != null && var22.method643(var18, var6, var19, 0)) {
                            this.method1515();
                            return;
                        }
                    }
                    for (class603 var23 = var15.field8729; var23 != null; var23 = var23.field8413) {
                        class90 var24 = var23.field8410.method134((byte) -53, arg0);
                        if (var24 != null && var24.method643(var18, var6, var19, 0)) {
                            this.method1515();
                            return;
                        }
                    }
                }
                var7.field7788.field8165.method1888(this, 8);
            }
        } else {
            this.method1515();
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lqba;IIIIIIIIIIIZZ)V", line = 588)
    public final void method1514(class408 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field3291 = arg0;
        super.field3964 = arg1 << 12;
        super.field3965 = arg2 << 12;
        super.field3963 = arg3 << 12;
        super.field3966 = arg9;
        this.field3292 = this.field3296 = (short) arg8;
        super.field3967 = arg10;
        super.field3968 = arg11;
        super.field3962 = arg13;
        this.field3295 = (short) arg4;
        this.field3290 = (short) arg5;
        this.field3293 = (short) arg6;
        this.field3297 = arg7;
        super.field3973 = this.field3291.field5746.field9082;
        this.method1512();
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "()V", line = 608)
    public final void method1515() {
        this.field3291.field5749.field7779[this.field3298] = null;
        class150.field1910[class306.field4164] = this;
        class306.field4164 = class306.field4164 + 1 & 1023;
        this.method975((byte) -75);
        this.method1955(-37);
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Lqba;IIIIIIIIIIIZZ)V", line = 616)
    public class254(class408 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field3291 = arg0;
        super.field3964 = arg1 << 12;
        super.field3965 = arg2 << 12;
        super.field3963 = arg3 << 12;
        super.field3966 = arg9;
        this.field3292 = this.field3296 = (short) arg8;
        super.field3967 = arg10;
        super.field3968 = arg11;
        super.field3962 = arg13;
        this.field3295 = (short) arg4;
        this.field3290 = (short) arg5;
        this.field3293 = (short) arg6;
        this.field3297 = arg7;
        super.field3973 = this.field3291.field5746.field9082;
        this.method1512();
    }
}
