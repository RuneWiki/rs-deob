import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class308 extends class219 {

    @OriginalMember(owner = "client!ma", name = "K", descriptor = "Lfo;")
    private class228 field4185;

    @OriginalMember(owner = "client!ma", name = "O", descriptor = "S")
    private short field4189;

    @OriginalMember(owner = "client!ma", name = "H", descriptor = "S")
    private short field4182;

    @OriginalMember(owner = "client!ma", name = "I", descriptor = "S")
    private short field4183;

    @OriginalMember(owner = "client!ma", name = "L", descriptor = "S")
    private short field4186;

    @OriginalMember(owner = "client!ma", name = "N", descriptor = "S")
    private short field4188;

    @OriginalMember(owner = "client!ma", name = "M", descriptor = "I")
    private int field4187;

    @OriginalMember(owner = "client!ma", name = "J", descriptor = "I")
    private int field4184;

    @OriginalMember(owner = "client!ma", name = "G", descriptor = "S")
    private short field4181;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "()V", line = 4)
    private final void method1851() {
        this.field4185.field3167.field3391[this.field4181] = null;
        class55.field724[class29.field406] = this;
        class29.field406 = class29.field406 + 1 & 1023;
        this.method2695(0);
        this.method2606(false);
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "()V", line = 16)
    private final void method1852() {
        int var1 = this.field4185.field3167.field3392;
        if (this.field4185.field3167.field3391[var1] != null) {
            this.field4185.field3167.field3391[var1].method1851();
        }
        this.field4185.field3167.field3391[var1] = this;
        this.field4181 = (short) this.field4185.field3167.field3392;
        this.field4185.field3167.field3392 = var1 + 1 & 8191;
        this.field4185.field3173.method2483(this, 0);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lfo;IIIIIIIIIIIZ)V", line = 27)
    public final void method1853(class228 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12) {
        this.field4185 = arg0;
        super.field3076 = arg1 << class26.field325;
        super.field3070 = arg2 << class26.field325;
        super.field3071 = arg3 << class26.field325;
        super.field3077 = arg9;
        this.field4182 = this.field4189 = (short) arg8;
        super.field3075 = arg10;
        super.field3073 = arg11;
        this.field4183 = (short) arg4;
        this.field4186 = (short) arg5;
        this.field4188 = (short) arg6;
        this.field4187 = arg7;
        super.field3079 = this.field4185.field3186.field3031;
        this.method1852();
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(JI)V", line = 48)
    public final void method1854(long arg0, int arg1) {
        this.field4189 = (short) (this.field4189 - arg1);
        if (this.field4189 <= 0) {
            this.method1851();
        } else {
            int var4 = super.field3076 >> class26.field325;
            int var5 = super.field3070 >> class26.field325;
            int var6 = super.field3071 >> class26.field325;
            class240 var7 = this.field4185.field3167;
            class432 var8 = this.field4185.field3157;
            if (var8.field6119 != 0) {
                if (this.field4182 - this.field4189 <= var8.field6116) {
                    int var9 = var8.field6053 * arg1 + (this.field4184 >> 16 & 255) + (super.field3077 >> 8 & 65280);
                    int var10 = var8.field6076 * arg1 + (this.field4184 >> 8 & 255) + (super.field3077 & 65280);
                    int var11 = var8.field6063 * arg1 + (super.field3077 << 8 & 65280) + (this.field4184 & 255);
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
                    super.field3077 &= -16777216;
                    super.field3077 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field4184 &= -16777216;
                    this.field4184 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field4182 - this.field4189 <= var8.field6096) {
                    int var12 = var8.field6103 * arg1 + (this.field4184 >> 24 & 255) + (super.field3077 >> 16 & 65280);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field3077 &= 16777215;
                    super.field3077 |= (var12 & 65280) << 16;
                    this.field4184 &= 16777215;
                    this.field4184 |= (var12 & 255) << 24;
                }
            }
            if (var8.field6120 != -1 && this.field4182 - this.field4189 <= var8.field6109) {
                this.field4187 += var8.field6093 * arg1;
            }
            if (var8.field6073 != -1 && this.field4182 - this.field4189 <= var8.field6110) {
                super.field3075 += var8.field6057 * arg1;
            }
            int var13 = this.field4183;
            int var14 = this.field4186;
            int var15 = this.field4188;
            boolean var16 = false;
            if (var8.field6050 == 1) {
                int var17 = var4 - this.field4185.field3181;
                int var18 = var5 - this.field4185.field3160;
                int var19 = var6 - this.field4185.field3164;
                int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
                long var21 = (long) (var8.field6117 * var20 * arg1);
                this.field4187 = (int) ((long) this.field4187 - ((long) this.field4187 * var21 >> 18));
            } else if (var8.field6050 == 2) {
                int var23 = var4 - this.field4185.field3181;
                int var24 = var5 - this.field4185.field3160;
                int var25 = var6 - this.field4185.field3164;
                int var26 = var25 * var25 + var23 * var23 + var24 * var24;
                long var27 = (long) (var8.field6117 * var26 * arg1);
                this.field4187 = (int) ((long) this.field4187 - ((long) this.field4187 * var27 >> 28));
            }
            if (var8.field6069 != null) {
                class311 var29 = var7.field3395.field2296;
                for (class311 var30 = var29.field4223; var29 != var30; var30 = var30.field4223) {
                    class298 var31 = (class298) var30;
                    class236 var32 = var31.field4092;
                    if (var32.field3353 != 1) {
                        boolean var33 = false;
                        for (int var34 = 0; var34 < var8.field6069.length; ++var34) {
                            if (var8.field6069[var34] == var32.field3350) {
                                var33 = true;
                                break;
                            }
                        }
                        if (var33) {
                            int var35 = var4 - var31.field4087;
                            int var36 = var5 - var31.field4084;
                            int var37 = var6 - var31.field4091;
                            long var38 = (long) (var37 * var37 + var35 * var35 + var36 * var36);
                            if (var38 <= var32.field3362) {
                                int var40 = (int) Math.sqrt((double) var38);
                                if (var40 == 0) {
                                    var40 = 1;
                                }
                                long var41 = (long) (var31.field4083 * var37 + var31.field4085 * var35 + var32.field3352 * var36) * 65535L / (long) (var32.field3367 * var40);
                                if (var41 >= (long) var32.field3351) {
                                    int var43 = 0;
                                    if (var32.field3359 == 1) {
                                        var43 = (var40 >> 4) * var32.field3358;
                                    } else if (var32.field3359 == 2) {
                                        var43 = (var40 >> 4) * (var40 >> 4) * var32.field3358;
                                    }
                                    if (var32.field3368 == 0) {
                                        if (var32.field3366 == 0) {
                                            var13 += (var31.field4085 - var43) * arg1;
                                            var14 += (var32.field3352 - var43) * arg1;
                                            var15 += (var31.field4083 - var43) * arg1;
                                            var16 = true;
                                        } else {
                                            super.field3076 += (var31.field4085 - var43) * arg1;
                                            super.field3070 += (var32.field3352 - var43) * arg1;
                                            super.field3071 += (var31.field4083 - var43) * arg1;
                                        }
                                    } else {
                                        int var44 = (var35 << 15) / var40 * var32.field3367;
                                        int var45 = (var36 << 15) / var40 * var32.field3367;
                                        int var46 = (var37 << 15) / var40 * var32.field3367;
                                        if (var32.field3366 == 0) {
                                            var13 += arg1 * var44 >> 15;
                                            var14 += arg1 * var45 >> 15;
                                            var15 += arg1 * var46 >> 15;
                                            var16 = true;
                                        } else {
                                            super.field3076 += arg1 * var44 >> 15;
                                            super.field3070 += arg1 * var45 >> 15;
                                            super.field3071 += arg1 * var46 >> 15;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field6106 != null) {
                for (int var47 = 0; var47 < var8.field6106.length; ++var47) {
                    class298 var48 = (class298) class85.field1201.method1450((long) var8.field6106[var47], (byte) 87);
                    while (var48 != null) {
                        class236 var49 = var48.field4092;
                        int var50 = var4 - var48.field4087;
                        int var51 = var5 - var48.field4084;
                        int var52 = var6 - var48.field4091;
                        long var53 = (long) (var52 * var52 + var50 * var50 + var51 * var51);
                        if (var53 > var49.field3362) {
                            var48 = (class298) class85.field1201.method1448(true);
                        } else {
                            int var55 = (int) Math.sqrt((double) var53);
                            if (var55 == 0) {
                                var55 = 1;
                            }
                            long var56 = (long) (var48.field4083 * var52 + var48.field4085 * var50 + var49.field3352 * var51) * 65535L / (long) (var49.field3367 * var55);
                            if (var56 < (long) var49.field3351) {
                                var48 = (class298) class85.field1201.method1448(true);
                            } else {
                                int var58 = 0;
                                if (var49.field3359 == 1) {
                                    var58 = (var55 >> 4) * var49.field3358;
                                } else if (var49.field3359 == 2) {
                                    var58 = (var55 >> 4) * (var55 >> 4) * var49.field3358;
                                }
                                if (var49.field3368 == 0) {
                                    if (var49.field3366 == 0) {
                                        var13 += (var48.field4085 - var58) * arg1;
                                        var14 += (var49.field3352 - var58) * arg1;
                                        var15 += (var48.field4083 - var58) * arg1;
                                        var16 = true;
                                    } else {
                                        super.field3076 += (var48.field4085 - var58) * arg1;
                                        super.field3070 += (var49.field3352 - var58) * arg1;
                                        super.field3071 += (var48.field4083 - var58) * arg1;
                                    }
                                } else {
                                    int var59 = (var50 << 15) / var55 * var49.field3367;
                                    int var60 = (var51 << 15) / var55 * var49.field3367;
                                    int var61 = (var52 << 15) / var55 * var49.field3367;
                                    if (var49.field3366 == 0) {
                                        var13 += arg1 * var59 >> 15;
                                        var14 += arg1 * var60 >> 15;
                                        var15 += arg1 * var61 >> 15;
                                        var16 = true;
                                    } else {
                                        super.field3076 += arg1 * var59 >> 15;
                                        super.field3070 += arg1 * var60 >> 15;
                                        super.field3071 += arg1 * var61 >> 15;
                                    }
                                }
                                var48 = (class298) class85.field1201.method1448(true);
                            }
                        }
                    }
                }
            }
            if (var8.field6080 != null) {
                if (var8.field6111 == null) {
                    var8.field6111 = new int[var8.field6080.length];
                    for (int var62 = 0; var62 < var8.field6080.length; ++var62) {
                        class305.method1845(-102, var8.field6080[var62]);
                        var8.field6111[var62] = ((class166) class309.field4193.method837((byte) -72, (long) var8.field6080[var62])).field2342;
                    }
                }
                for (int var63 = 0; var63 < var8.field6111.length; ++var63) {
                    class236 var64 = class131.field1966[var8.field6111[var63]];
                    if (var64.field3366 == 0) {
                        var13 += var64.field3369 * arg1;
                        var14 += var64.field3352 * arg1;
                        var15 += var64.field3370 * arg1;
                        var16 = true;
                    } else {
                        super.field3076 += var64.field3369 * arg1;
                        super.field3070 += var64.field3352 * arg1;
                        super.field3071 += var64.field3370 * arg1;
                    }
                }
            }
            if (var16) {
                while (true) {
                    if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                        this.field4183 = (short) var13;
                        this.field4186 = (short) var14;
                        this.field4188 = (short) var15;
                        break;
                    }
                    var13 >>= 1;
                    var14 >>= 1;
                    var15 >>= 1;
                    this.field4187 <<= 1;
                }
            }
            super.field3076 = (int) ((long) super.field3076 + ((long) this.field4183 * (long) this.field4187 >> 23) * (long) arg1);
            super.field3070 = (int) ((long) super.field3070 + ((long) this.field4186 * (long) this.field4187 >> 23) * (long) arg1);
            super.field3071 = (int) ((long) super.field3071 + ((long) this.field4188 * (long) this.field4187 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Lfo;IIIIIIIIIIIZ)V", line = 441)
    public class308(class228 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12) {
        this.field4185 = arg0;
        super.field3076 = arg1 << class26.field325;
        super.field3070 = arg2 << class26.field325;
        super.field3071 = arg3 << class26.field325;
        super.field3077 = arg9;
        this.field4182 = this.field4189 = (short) arg8;
        super.field3075 = arg10;
        super.field3073 = arg11;
        this.field4183 = (short) arg4;
        this.field4186 = (short) arg5;
        this.field4188 = (short) arg6;
        this.field4187 = arg7;
        super.field3079 = this.field4185.field3186.field3031;
        this.method1852();
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(J)V", line = 461)
    public final void method1855(long arg0) {
        int var3 = super.field3076 >> 19;
        int var4 = super.field3071 >> 19;
        int var5 = super.field3070 >> class26.field325;
        if (var5 <= 0 && var5 >= -65535 && var3 >= 0 && var3 < class284.field3862 && var4 >= 0 && var4 < class354.field4768) {
            class240 var6 = this.field4185.field3167;
            class432 var7 = this.field4185.field3157;
            class323[] var8 = class436.field6160;
            int var9 = var8[var6.field3399].method329(var3, var4);
            int var10;
            if (var6.field3399 < 3) {
                var10 = var8[var6.field3399 + 1].method329(var3, var4);
            } else {
                var10 = var9 - 1024;
            }
            if (var7.field6054) {
                if (var7.field6061 == -1 && var5 > var9) {
                    this.method1851();
                    return;
                }
                if (var7.field6061 >= 0 && var5 > var8[var7.field6061].method329(var3, var4)) {
                    this.method1851();
                    return;
                }
                if (var7.field6087 == -1 && var5 < var10) {
                    this.method1851();
                    return;
                }
                if (var7.field6087 >= 0 && var5 < var8[var7.field6087 + 1].method329(var3, var4)) {
                    this.method1851();
                    return;
                }
            }
            if (var3 >= var6.field3400 && var3 <= var6.field3396 && var4 >= var6.field3397 && var4 <= var6.field3396 && var5 <= var9 && var5 >= var10) {
                var6.field3398.field2485.method387(this, false);
            } else {
                byte var11 = 3;
                if (var5 > var8[1].method329(var3, var4)) {
                    var11 = 0;
                } else if (var5 > var8[2].method329(var3, var4)) {
                    var11 = 1;
                } else if (var5 > var8[3].method329(var3, var4)) {
                    var11 = 2;
                } else if (var5 < var8[3].method329(var3, var4) - 1024) {
                    this.method1851();
                    return;
                }
                class63 var12 = class341.field4617[var11][var3][var4];
                if (var12 == null) {
                    boolean var13 = class341.field4617[0][var3][var4].field873 != null;
                    if (var11 == 3 && var13) {
                        this.method1851();
                        return;
                    }
                    for (int var14 = 1; var14 <= var11; ++var14) {
                        if (class341.field4617[var14][var3][var4] == null) {
                            var12 = class341.field4617[var14][var3][var4] = new class63(var14, var3, var4);
                            if (var13) {
                                ++var12.field851;
                            }
                        }
                    }
                }
                if (var12.field871 == null) {
                    var12.field871 = new class174();
                    var12.field869 = (byte) ((int) (arg0 & 255L));
                } else if ((byte) ((int) (arg0 & 255L)) != var12.field869) {
                    var12.field871 = new class174();
                    var12.field869 = (byte) ((int) (arg0 & 255L));
                }
                var12.field871.field2485.method387(this, false);
            }
        } else {
            this.method1851();
        }
    }
}
