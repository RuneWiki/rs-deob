import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class241 extends class335 {

    @OriginalMember(owner = "client!om", name = "I", descriptor = "Lsl;")
    private class303 field3411;

    @OriginalMember(owner = "client!om", name = "L", descriptor = "S")
    private short field3414;

    @OriginalMember(owner = "client!om", name = "E", descriptor = "S")
    private short field3407;

    @OriginalMember(owner = "client!om", name = "H", descriptor = "S")
    private short field3410;

    @OriginalMember(owner = "client!om", name = "F", descriptor = "S")
    private short field3408;

    @OriginalMember(owner = "client!om", name = "J", descriptor = "S")
    private short field3412;

    @OriginalMember(owner = "client!om", name = "M", descriptor = "I")
    private int field3415;

    @OriginalMember(owner = "client!om", name = "G", descriptor = "I")
    private int field3409;

    @OriginalMember(owner = "client!om", name = "K", descriptor = "S")
    private short field3413;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "()V", line = 5)
    private final void method1482() {
        int var1 = this.field3411.field4401.field4822;
        if (this.field3411.field4401.field4818[var1] != null) {
            this.field3411.field4401.field4818[var1].method1483();
        }
        this.field3411.field4401.field4818[var1] = this;
        this.field3413 = (short) this.field3411.field4401.field4822;
        this.field3411.field4401.field4822 = var1 + 1 & 8191;
        this.field3411.field4402.method250((byte) -72, this);
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "()V", line = 19)
    private final void method1483() {
        this.field3411.field4401.field4818[this.field3413] = null;
        class173.field2373[class110.field1444] = this;
        class110.field1444 = class110.field1444 + 1 & 1023;
        this.method1435(true);
        this.method2146(false);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(J)V", line = 27)
    public final void method1484(long arg0) {
        int var3 = super.field4863 >> class41.field628 + 12;
        int var4 = super.field4857 >> class41.field628 + 12;
        int var5 = super.field4853 >> class176.field2425;
        if (var5 <= 0 && var5 >= -262144 && var3 >= 0 && var3 < class282.field4031 && var4 >= 0 && var4 < class98.field1339) {
            class332 var6 = this.field3411.field4401;
            class412 var7 = this.field3411.field4391;
            class441[] var8 = class311.field4527;
            int var9 = var8[var6.field4830].method848(var3, var4);
            int var10;
            if (var6.field4830 < class399.field5881 - 1) {
                var10 = var8[var6.field4830 + 1].method848(var3, var4);
            } else {
                var10 = var9 - (8 << class41.field628);
            }
            if (var7.field6055) {
                if (var7.field6074 == -1 && var5 > var9) {
                    this.method1483();
                    return;
                }
                if (var7.field6074 >= 0 && var5 > var8[var7.field6074].method848(var3, var4)) {
                    this.method1483();
                    return;
                }
                if (var7.field6043 == -1 && var5 < var10) {
                    this.method1483();
                    return;
                }
                if (var7.field6043 >= 0 && var5 < var8[var7.field6043 + 1].method848(var3, var4)) {
                    this.method1483();
                    return;
                }
            }
            if (var3 >= var6.field4834 && var3 <= var6.field4835 && var4 >= var6.field4828 && var4 <= var6.field4832 && var5 <= var9 && var5 >= var10) {
                var6.field4831.field2704.method2991(this, (byte) -71);
            } else {
                int var11;
                for (var11 = class399.field5881 - 1; var11 > 0 && var5 > var8[var11].method848(var3, var4); --var11) {
                }
                if (var11 == 0 && var5 > var8[0].method848(var3, var4)) {
                    this.method1483();
                } else if (class399.field5881 - 1 == var11 && var8[var11].method848(var3, var4) - var5 > 8 << class41.field628) {
                    this.method1483();
                } else {
                    class468 var12 = class358.field5312[var11][var3][var4];
                    if (var12 == null) {
                        if (var11 == 0) {
                            var12 = class358.field5312[0][var3][var4] = new class468(0, var3, var4);
                        }
                        boolean var13 = class358.field5312[0][var3][var4].field6779 != null;
                        if (var11 == 3 && var13) {
                            this.method1483();
                            return;
                        }
                        for (int var14 = 1; var14 <= var11; ++var14) {
                            if (class358.field5312[var14][var3][var4] == null) {
                                var12 = class358.field5312[var14][var3][var4] = new class468(var14, var3, var4);
                                if (var13) {
                                    ++var12.field6773;
                                }
                            }
                        }
                    }
                    if (var12.field6764 == null) {
                        var12.field6764 = new class191();
                        var12.field6760 = (byte) ((int) (arg0 & 255L));
                    } else if ((byte) ((int) (arg0 & 255L)) != var12.field6760) {
                        var12.field6764.field2704.method2987(-115);
                        var12.field6764.field2709 = false;
                        var12.field6760 = (byte) ((int) (arg0 & 255L));
                    }
                    var12.field6764.field2704.method2991(this, (byte) 127);
                }
            }
        } else {
            this.method1483();
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(JI)V", line = 156)
    public final void method1485(long arg0, int arg1) {
        this.field3414 = (short) (this.field3414 - arg1);
        if (this.field3414 <= 0) {
            this.method1483();
        } else {
            int var4 = super.field4863 >> class176.field2425;
            int var5 = super.field4853 >> class176.field2425;
            int var6 = super.field4857 >> class176.field2425;
            class332 var7 = this.field3411.field4401;
            class412 var8 = this.field3411.field4391;
            if (var8.field6093 != 0) {
                if (this.field3407 - this.field3414 <= var8.field6080) {
                    int var9 = var8.field6040 * arg1 + (super.field4852 >> 8 & 65280) + (this.field3409 >> 16 & 255);
                    int var10 = var8.field6081 * arg1 + (this.field3409 >> 8 & 255) + (super.field4852 & 65280);
                    int var11 = var8.field6095 * arg1 + (super.field4852 << 8 & 65280) + (this.field3409 & 255);
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
                    super.field4852 &= -16777216;
                    super.field4852 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field3409 &= -16777216;
                    this.field3409 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field3407 - this.field3414 <= var8.field6045) {
                    int var12 = var8.field6068 * arg1 + (super.field4852 >> 16 & 65280) + (this.field3409 >> 24 & 255);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field4852 &= 16777215;
                    super.field4852 |= (var12 & 65280) << 16;
                    this.field3409 &= 16777215;
                    this.field3409 |= (var12 & 255) << 24;
                }
            }
            if (var8.field6046 != -1 && this.field3407 - this.field3414 <= var8.field6084) {
                this.field3415 += var8.field6070 * arg1;
            }
            if (var8.field6052 != -1 && this.field3407 - this.field3414 <= var8.field6088) {
                super.field4856 += var8.field6071 * arg1;
            }
            int var13 = this.field3410;
            int var14 = this.field3408;
            int var15 = this.field3412;
            boolean var16 = false;
            if (var8.field6101 == 1) {
                int var17 = var4 - this.field3411.field4393;
                int var18 = var5 - this.field3411.field4375;
                int var19 = var6 - this.field3411.field4373;
                int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
                long var21 = (long) (var8.field6103 * var20 * arg1);
                this.field3415 = (int) ((long) this.field3415 - ((long) this.field3415 * var21 >> 18));
            } else if (var8.field6101 == 2) {
                int var23 = var4 - this.field3411.field4393;
                int var24 = var5 - this.field3411.field4375;
                int var25 = var6 - this.field3411.field4373;
                int var26 = var25 * var25 + var23 * var23 + var24 * var24;
                long var27 = (long) (var8.field6103 * var26 * arg1);
                this.field3415 = (int) ((long) this.field3415 - ((long) this.field3415 * var27 >> 28));
            }
            if (var8.field6064 != null) {
                class86 var29 = var7.field4827.field5018;
                for (class86 var30 = var29.field1179; var29 != var30; var30 = var30.field1179) {
                    class430 var31 = (class430) var30;
                    class218 var32 = var31.field6314;
                    if (var32.field3060 != 1) {
                        boolean var33 = false;
                        for (int var34 = 0; var34 < var8.field6064.length; ++var34) {
                            if (var8.field6064[var34] == var32.field3067) {
                                var33 = true;
                                break;
                            }
                        }
                        if (var33) {
                            int var35 = var4 - var31.field6323;
                            int var36 = var5 - var31.field6319;
                            int var37 = var6 - var31.field6320;
                            long var38 = (long) (var37 * var37 + var35 * var35 + var36 * var36);
                            if (var38 <= var32.field3061) {
                                int var40 = (int) Math.sqrt((double) var38);
                                if (var40 == 0) {
                                    var40 = 1;
                                }
                                long var41 = (long) (var31.field6316 * var37 + var31.field6317 * var35 + var32.field3055 * var36) * 65535L / (long) (var32.field3054 * var40);
                                if (var41 >= (long) var32.field3059) {
                                    int var43 = 0;
                                    if (var32.field3052 == 1) {
                                        var43 = (var40 >> 4) * var32.field3053;
                                    } else if (var32.field3052 == 2) {
                                        var43 = (var40 >> 4) * (var40 >> 4) * var32.field3053;
                                    }
                                    if (var32.field3050 == 0) {
                                        if (var32.field3058 == 0) {
                                            var13 += (var31.field6317 - var43) * arg1;
                                            var14 += (var32.field3055 - var43) * arg1;
                                            var15 += (var31.field6316 - var43) * arg1;
                                            var16 = true;
                                        } else {
                                            super.field4863 += (var31.field6317 - var43) * arg1;
                                            super.field4853 += (var32.field3055 - var43) * arg1;
                                            super.field4857 += (var31.field6316 - var43) * arg1;
                                        }
                                    } else {
                                        int var44 = (var35 << 15) / var40 * var32.field3054;
                                        int var45 = (var36 << 15) / var40 * var32.field3054;
                                        int var46 = (var37 << 15) / var40 * var32.field3054;
                                        if (var32.field3058 == 0) {
                                            var13 += arg1 * var44 >> 15;
                                            var14 += arg1 * var45 >> 15;
                                            var15 += arg1 * var46 >> 15;
                                            var16 = true;
                                        } else {
                                            super.field4863 += arg1 * var44 >> 15;
                                            super.field4853 += arg1 * var45 >> 15;
                                            super.field4857 += arg1 * var46 >> 15;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field6050 != null) {
                for (int var47 = 0; var47 < var8.field6050.length; ++var47) {
                    class430 var48 = (class430) class400.field5886.method2305(false, (long) var8.field6050[var47]);
                    while (var48 != null) {
                        class218 var49 = var48.field6314;
                        int var50 = var4 - var48.field6323;
                        int var51 = var5 - var48.field6319;
                        int var52 = var6 - var48.field6320;
                        long var53 = (long) (var52 * var52 + var50 * var50 + var51 * var51);
                        if (var53 > var49.field3061) {
                            var48 = (class430) class400.field5886.method2303(-1);
                        } else {
                            int var55 = (int) Math.sqrt((double) var53);
                            if (var55 == 0) {
                                var55 = 1;
                            }
                            long var56 = (long) (var48.field6316 * var52 + var48.field6317 * var50 + var49.field3055 * var51) * 65535L / (long) (var49.field3054 * var55);
                            if (var56 < (long) var49.field3059) {
                                var48 = (class430) class400.field5886.method2303(-1);
                            } else {
                                int var58 = 0;
                                if (var49.field3052 == 1) {
                                    var58 = (var55 >> 4) * var49.field3053;
                                } else if (var49.field3052 == 2) {
                                    var58 = (var55 >> 4) * (var55 >> 4) * var49.field3053;
                                }
                                if (var49.field3050 == 0) {
                                    if (var49.field3058 == 0) {
                                        var13 += (var48.field6317 - var58) * arg1;
                                        var14 += (var49.field3055 - var58) * arg1;
                                        var15 += (var48.field6316 - var58) * arg1;
                                        var16 = true;
                                    } else {
                                        super.field4863 += (var48.field6317 - var58) * arg1;
                                        super.field4853 += (var49.field3055 - var58) * arg1;
                                        super.field4857 += (var48.field6316 - var58) * arg1;
                                    }
                                } else {
                                    int var59 = (var50 << 15) / var55 * var49.field3054;
                                    int var60 = (var51 << 15) / var55 * var49.field3054;
                                    int var61 = (var52 << 15) / var55 * var49.field3054;
                                    if (var49.field3058 == 0) {
                                        var13 += arg1 * var59 >> 15;
                                        var14 += arg1 * var60 >> 15;
                                        var15 += arg1 * var61 >> 15;
                                        var16 = true;
                                    } else {
                                        super.field4863 += arg1 * var59 >> 15;
                                        super.field4853 += arg1 * var60 >> 15;
                                        super.field4857 += arg1 * var61 >> 15;
                                    }
                                }
                                var48 = (class430) class400.field5886.method2303(-1);
                            }
                        }
                    }
                }
            }
            if (var8.field6104 != null) {
                if (var8.field6098 == null) {
                    var8.field6098 = new int[var8.field6104.length];
                    for (int var62 = 0; var62 < var8.field6104.length; ++var62) {
                        class74.method493(false, var8.field6104[var62]);
                        var8.field6098[var62] = ((class304) class451.field6569.method2310((byte) -86, (long) var8.field6104[var62])).field4412;
                    }
                }
                for (int var63 = 0; var63 < var8.field6098.length; ++var63) {
                    class218 var64 = class141.field1839[var8.field6098[var63]];
                    if (var64.field3058 == 0) {
                        var13 += var64.field3063 * arg1;
                        var14 += var64.field3055 * arg1;
                        var15 += var64.field3065 * arg1;
                        var16 = true;
                    } else {
                        super.field4863 += var64.field3063 * arg1;
                        super.field4853 += var64.field3055 * arg1;
                        super.field4857 += var64.field3065 * arg1;
                    }
                }
            }
            if (var16) {
                while (true) {
                    if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                        this.field3410 = (short) var13;
                        this.field3408 = (short) var14;
                        this.field3412 = (short) var15;
                        break;
                    }
                    var13 >>= 1;
                    var14 >>= 1;
                    var15 >>= 1;
                    this.field3415 <<= 1;
                }
            }
            super.field4863 = (int) ((long) super.field4863 + ((long) this.field3410 * (long) this.field3415 >> 23) * (long) arg1);
            super.field4853 = (int) ((long) super.field4853 + ((long) this.field3408 * (long) this.field3415 >> 23) * (long) arg1);
            super.field4857 = (int) ((long) super.field4857 + ((long) this.field3412 * (long) this.field3415 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Lsl;IIIIIIIIIIIZZ)V", line = 552)
    public final void method1486(class303 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field3411 = arg0;
        super.field4863 = arg1 << class176.field2425;
        super.field4853 = arg2 << class176.field2425;
        super.field4857 = arg3 << class176.field2425;
        super.field4852 = arg9;
        this.field3407 = this.field3414 = (short) arg8;
        super.field4856 = arg10;
        super.field4862 = arg11;
        super.field4860 = arg13;
        this.field3410 = (short) arg4;
        this.field3408 = (short) arg5;
        this.field3412 = (short) arg6;
        this.field3415 = arg7;
        super.field4861 = this.field3411.field4386.field877;
        this.method1482();
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Lsl;IIIIIIIIIIIZZ)V", line = 571)
    public class241(class303 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field3411 = arg0;
        super.field4863 = arg1 << class176.field2425;
        super.field4853 = arg2 << class176.field2425;
        super.field4857 = arg3 << class176.field2425;
        super.field4852 = arg9;
        this.field3407 = this.field3414 = (short) arg8;
        super.field4856 = arg10;
        super.field4862 = arg11;
        super.field4860 = arg13;
        this.field3410 = (short) arg4;
        this.field3408 = (short) arg5;
        this.field3412 = (short) arg6;
        this.field3415 = arg7;
        super.field4861 = this.field3411.field4386.field877;
        this.method1482();
    }
}
