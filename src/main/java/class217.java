import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class217 extends class430 {

    @OriginalMember(owner = "client!mh", name = "Z", descriptor = "Lme;")
    private class294 field3078;

    @OriginalMember(owner = "client!mh", name = "S", descriptor = "S")
    private short field3071;

    @OriginalMember(owner = "client!mh", name = "ab", descriptor = "S")
    private short field3079;

    @OriginalMember(owner = "client!mh", name = "W", descriptor = "S")
    private short field3075;

    @OriginalMember(owner = "client!mh", name = "V", descriptor = "S")
    private short field3074;

    @OriginalMember(owner = "client!mh", name = "T", descriptor = "S")
    private short field3072;

    @OriginalMember(owner = "client!mh", name = "Y", descriptor = "I")
    private int field3077;

    @OriginalMember(owner = "client!mh", name = "X", descriptor = "I")
    private int field3076;

    @OriginalMember(owner = "client!mh", name = "U", descriptor = "S")
    private short field3073;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "()V", line = 3)
    private final void method1368() {
        this.field3078.field4050.field1240[this.field3073] = null;
        class351.field4797[class261.field3640] = this;
        class261.field3640 = class261.field3640 + 1 & 1023;
        this.method2773(26979);
        this.method1495(19801);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lme;IIIIIIIIIIIZ)V", line = 13)
    public final void method1369(class294 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12) {
        this.field3078 = arg0;
        super.field5918 = arg1 << class305.field4176;
        super.field5928 = arg2 << class305.field4176;
        super.field5929 = arg3 << class305.field4176;
        super.field5923 = arg9;
        this.field3079 = this.field3071 = (short) arg8;
        super.field5919 = arg10;
        super.field5921 = arg11;
        this.field3075 = (short) arg4;
        this.field3074 = (short) arg5;
        this.field3072 = (short) arg6;
        this.field3077 = arg7;
        super.field5924 = this.field3078.field4055.field4976;
        this.method1370();
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "()V", line = 32)
    private final void method1370() {
        int var1 = this.field3078.field4050.field1237;
        if (this.field3078.field4050.field1240[var1] != null) {
            this.field3078.field4050.field1240[var1].method1368();
        }
        this.field3078.field4050.field1240[var1] = this;
        this.field3073 = (short) this.field3078.field4050.field1237;
        this.field3078.field4050.field1237 = var1 + 1 & 8191;
        this.field3078.field4051.method2817(false, this);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(JI)V", line = 43)
    public final void method1371(long arg0, int arg1) {
        this.field3071 = (short) (this.field3071 - arg1);
        if (this.field3071 <= 0) {
            this.method1368();
        } else {
            int var4 = super.field5918 >> class305.field4176;
            int var5 = super.field5928 >> class305.field4176;
            int var6 = super.field5929 >> class305.field4176;
            class83 var7 = this.field3078.field4050;
            class152 var8 = this.field3078.field4063;
            if (var8.field2142 != 0) {
                if (this.field3079 - this.field3071 <= var8.field2130) {
                    int var9 = var8.field2160 * arg1 + (super.field5923 >> 8 & 65280) + (this.field3076 >> 16 & 255);
                    int var10 = var8.field2161 * arg1 + (this.field3076 >> 8 & 255) + (super.field5923 & 65280);
                    int var11 = var8.field2143 * arg1 + (super.field5923 << 8 & 65280) + (this.field3076 & 255);
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
                    super.field5923 &= -16777216;
                    super.field5923 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field3076 &= -16777216;
                    this.field3076 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field3079 - this.field3071 <= var8.field2118) {
                    int var12 = var8.field2154 * arg1 + (super.field5923 >> 16 & 65280) + (this.field3076 >> 24 & 255);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field5923 &= 16777215;
                    super.field5923 |= (var12 & 65280) << 16;
                    this.field3076 &= 16777215;
                    this.field3076 |= (var12 & 255) << 24;
                }
            }
            if (var8.field2116 != -1 && this.field3079 - this.field3071 <= var8.field2129) {
                this.field3077 += var8.field2169 * arg1;
            }
            if (var8.field2123 != -1 && this.field3079 - this.field3071 <= var8.field2119) {
                super.field5919 += var8.field2177 * arg1;
            }
            int var13 = this.field3075;
            int var14 = this.field3074;
            int var15 = this.field3072;
            boolean var16 = false;
            if (var8.field2176 == 1) {
                int var17 = var4 - this.field3078.field4064;
                int var18 = var5 - this.field3078.field4032;
                int var19 = var6 - this.field3078.field4030;
                int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
                long var21 = (long) (var8.field2136 * var20 * arg1);
                this.field3077 = (int) ((long) this.field3077 - ((long) this.field3077 * var21 >> 18));
            } else if (var8.field2176 == 2) {
                int var23 = var4 - this.field3078.field4064;
                int var24 = var5 - this.field3078.field4032;
                int var25 = var6 - this.field3078.field4030;
                int var26 = var25 * var25 + var23 * var23 + var24 * var24;
                long var27 = (long) (var8.field2136 * var26 * arg1);
                this.field3077 = (int) ((long) this.field3077 - ((long) this.field3077 * var27 >> 28));
            }
            if (var8.field2168 != null) {
                class180 var29 = var7.field1245.field3504;
                for (class180 var30 = var29.field2610; var29 != var30; var30 = var30.field2610) {
                    class306 var31 = (class306) var30;
                    class69 var32 = var31.field4182;
                    if (var32.field1013 != 1) {
                        boolean var33 = false;
                        for (int var34 = 0; var34 < var8.field2168.length; ++var34) {
                            if (var8.field2168[var34] == var32.field1024) {
                                var33 = true;
                                break;
                            }
                        }
                        if (var33) {
                            int var35 = var4 - var31.field4181;
                            int var36 = var5 - var31.field4180;
                            int var37 = var6 - var31.field4184;
                            long var38 = (long) (var37 * var37 + var35 * var35 + var36 * var36);
                            if (var38 <= var32.field1016) {
                                int var40 = (int) Math.sqrt((double) var38);
                                if (var40 == 0) {
                                    var40 = 1;
                                }
                                long var41 = (long) (var31.field4185 * var37 + var31.field4179 * var35 + var32.field1009 * var36) * 65535L / (long) (var32.field1010 * var40);
                                if (var41 >= (long) var32.field1011) {
                                    int var43 = 0;
                                    if (var32.field1014 == 1) {
                                        var43 = (var40 >> 4) * var32.field1008;
                                    } else if (var32.field1014 == 2) {
                                        var43 = (var40 >> 4) * (var40 >> 4) * var32.field1008;
                                    }
                                    if (var32.field1025 == 0) {
                                        if (var32.field1012 == 0) {
                                            var13 += (var31.field4179 - var43) * arg1;
                                            var14 += (var32.field1009 - var43) * arg1;
                                            var15 += (var31.field4185 - var43) * arg1;
                                            var16 = true;
                                        } else {
                                            super.field5918 += (var31.field4179 - var43) * arg1;
                                            super.field5928 += (var32.field1009 - var43) * arg1;
                                            super.field5929 += (var31.field4185 - var43) * arg1;
                                        }
                                    } else {
                                        int var44 = (var35 << 15) / var40 * var32.field1010;
                                        int var45 = (var36 << 15) / var40 * var32.field1010;
                                        int var46 = (var37 << 15) / var40 * var32.field1010;
                                        if (var32.field1012 == 0) {
                                            var13 += arg1 * var44 >> 15;
                                            var14 += arg1 * var45 >> 15;
                                            var15 += arg1 * var46 >> 15;
                                            var16 = true;
                                        } else {
                                            super.field5918 += arg1 * var44 >> 15;
                                            super.field5928 += arg1 * var45 >> 15;
                                            super.field5929 += arg1 * var46 >> 15;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field2144 != null) {
                for (int var47 = 0; var47 < var8.field2144.length; ++var47) {
                    class306 var48 = (class306) class422.field5809.method2588((long) var8.field2144[var47], 28248);
                    while (var48 != null) {
                        class69 var49 = var48.field4182;
                        int var50 = var4 - var48.field4181;
                        int var51 = var5 - var48.field4180;
                        int var52 = var6 - var48.field4184;
                        long var53 = (long) (var52 * var52 + var50 * var50 + var51 * var51);
                        if (var53 > var49.field1016) {
                            var48 = (class306) class422.field5809.method2589(99);
                        } else {
                            int var55 = (int) Math.sqrt((double) var53);
                            if (var55 == 0) {
                                var55 = 1;
                            }
                            long var56 = (long) (var48.field4185 * var52 + var48.field4179 * var50 + var49.field1009 * var51) * 65535L / (long) (var49.field1010 * var55);
                            if (var56 < (long) var49.field1011) {
                                var48 = (class306) class422.field5809.method2589(68);
                            } else {
                                int var58 = 0;
                                if (var49.field1014 == 1) {
                                    var58 = (var55 >> 4) * var49.field1008;
                                } else if (var49.field1014 == 2) {
                                    var58 = (var55 >> 4) * (var55 >> 4) * var49.field1008;
                                }
                                if (var49.field1025 == 0) {
                                    if (var49.field1012 == 0) {
                                        var13 += (var48.field4179 - var58) * arg1;
                                        var14 += (var49.field1009 - var58) * arg1;
                                        var15 += (var48.field4185 - var58) * arg1;
                                        var16 = true;
                                    } else {
                                        super.field5918 += (var48.field4179 - var58) * arg1;
                                        super.field5928 += (var49.field1009 - var58) * arg1;
                                        super.field5929 += (var48.field4185 - var58) * arg1;
                                    }
                                } else {
                                    int var59 = (var50 << 15) / var55 * var49.field1010;
                                    int var60 = (var51 << 15) / var55 * var49.field1010;
                                    int var61 = (var52 << 15) / var55 * var49.field1010;
                                    if (var49.field1012 == 0) {
                                        var13 += arg1 * var59 >> 15;
                                        var14 += arg1 * var60 >> 15;
                                        var15 += arg1 * var61 >> 15;
                                        var16 = true;
                                    } else {
                                        super.field5918 += arg1 * var59 >> 15;
                                        super.field5928 += arg1 * var60 >> 15;
                                        super.field5929 += arg1 * var61 >> 15;
                                    }
                                }
                                var48 = (class306) class422.field5809.method2589(-64);
                            }
                        }
                    }
                }
            }
            if (var8.field2167 != null) {
                if (var8.field2134 == null) {
                    var8.field2134 = new int[var8.field2167.length];
                    for (int var62 = 0; var62 < var8.field2167.length; ++var62) {
                        class347.method2079(var8.field2167[var62], -1);
                        var8.field2134[var62] = ((class128) class317.field4307.method2614((long) var8.field2167[var62], -113)).field1815;
                    }
                }
                for (int var63 = 0; var63 < var8.field2134.length; ++var63) {
                    class69 var64 = class473.field6631[var8.field2134[var63]];
                    if (var64.field1012 == 0) {
                        var13 += var64.field1017 * arg1;
                        var14 += var64.field1009 * arg1;
                        var15 += var64.field1019 * arg1;
                        var16 = true;
                    } else {
                        super.field5918 += var64.field1017 * arg1;
                        super.field5928 += var64.field1009 * arg1;
                        super.field5929 += var64.field1019 * arg1;
                    }
                }
            }
            if (var16) {
                while (true) {
                    if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                        this.field3075 = (short) var13;
                        this.field3074 = (short) var14;
                        this.field3072 = (short) var15;
                        break;
                    }
                    var13 >>= 1;
                    var14 >>= 1;
                    var15 >>= 1;
                    this.field3077 <<= 1;
                }
            }
            super.field5918 = (int) ((long) super.field5918 + ((long) this.field3075 * (long) this.field3077 >> 23) * (long) arg1);
            super.field5928 = (int) ((long) super.field5928 + ((long) this.field3074 * (long) this.field3077 >> 23) * (long) arg1);
            super.field5929 = (int) ((long) super.field5929 + ((long) this.field3072 * (long) this.field3077 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(J)V", line = 440)
    public final void method1372(long arg0) {
        int var3 = super.field5918 >> 19;
        int var4 = super.field5929 >> 19;
        int var5 = super.field5928 >> class305.field4176;
        if (var5 <= 0 && var5 >= -65535 && var3 >= 0 && var3 < class456.field6299 && var4 >= 0 && var4 < class205.field2946) {
            class83 var6 = this.field3078.field4050;
            class152 var7 = this.field3078.field4063;
            class269[] var8 = class317.field4306;
            int var9 = var8[var6.field1247].method710(var3, var4);
            int var10;
            if (var6.field1247 < class109.field1542 - 1) {
                var10 = var8[var6.field1247 + 1].method710(var3, var4);
            } else {
                var10 = var9 - 1024;
            }
            if (var7.field2133) {
                if (var7.field2179 == -1 && var5 > var9) {
                    this.method1368();
                    return;
                }
                if (var7.field2179 >= 0 && var5 > var8[var7.field2179].method710(var3, var4)) {
                    this.method1368();
                    return;
                }
                if (var7.field2135 == -1 && var5 < var10) {
                    this.method1368();
                    return;
                }
                if (var7.field2135 >= 0 && var5 < var8[var7.field2135 + 1].method710(var3, var4)) {
                    this.method1368();
                    return;
                }
            }
            if (var3 >= var6.field1254 && var3 <= var6.field1253 && var4 >= var6.field1249 && var4 <= var6.field1250 && var5 <= var9 && var5 >= var10) {
                var6.field1252.field6625.method1426(this, 27334);
            } else {
                int var11;
                for (var11 = class109.field1542 - 1; var11 > 0 && var5 > var8[var11].method710(var3, var4); --var11) {
                }
                if (class109.field1542 - 1 == var11 && var8[var11].method710(var3, var4) - var5 > 1024) {
                    this.method1368();
                } else {
                    class406 var12 = class455.field6293[var11][var3][var4];
                    if (var12 == null) {
                        boolean var13 = class455.field6293[0][var3][var4].field5606 != null;
                        if (var11 == 3 && var13) {
                            this.method1368();
                            return;
                        }
                        for (int var14 = 1; var14 <= var11; ++var14) {
                            if (class455.field6293[var14][var3][var4] == null) {
                                var12 = class455.field6293[var14][var3][var4] = new class406(var14, var3, var4);
                                if (var13) {
                                    ++var12.field5620;
                                }
                            }
                        }
                    }
                    if (var12.field5628 == null) {
                        var12.field5628 = new class473();
                        var12.field5626 = (byte) ((int) (arg0 & 255L));
                    } else if ((byte) ((int) (arg0 & 255L)) != var12.field5626) {
                        var12.field5628 = new class473();
                        var12.field5626 = (byte) ((int) (arg0 & 255L));
                    }
                    var12.field5628.field6625.method1426(this, 27334);
                }
            }
        } else {
            this.method1368();
        }
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(Lme;IIIIIIIIIIIZ)V", line = 560)
    public class217(class294 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12) {
        this.field3078 = arg0;
        super.field5918 = arg1 << class305.field4176;
        super.field5928 = arg2 << class305.field4176;
        super.field5929 = arg3 << class305.field4176;
        super.field5923 = arg9;
        this.field3079 = this.field3071 = (short) arg8;
        super.field5919 = arg10;
        super.field5921 = arg11;
        this.field3075 = (short) arg4;
        this.field3074 = (short) arg5;
        this.field3072 = (short) arg6;
        this.field3077 = arg7;
        super.field5924 = this.field3078.field4055.field4976;
        this.method1370();
    }
}
