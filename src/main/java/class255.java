import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class255 extends class233 {

    @OriginalMember(owner = "client!ns", name = "W", descriptor = "Lth;")
    private class389 field3390;

    @OriginalMember(owner = "client!ns", name = "X", descriptor = "S")
    private short field3391;

    @OriginalMember(owner = "client!ns", name = "Y", descriptor = "S")
    private short field3392;

    @OriginalMember(owner = "client!ns", name = "T", descriptor = "S")
    private short field3387;

    @OriginalMember(owner = "client!ns", name = "R", descriptor = "S")
    private short field3385;

    @OriginalMember(owner = "client!ns", name = "U", descriptor = "S")
    private short field3388;

    @OriginalMember(owner = "client!ns", name = "S", descriptor = "I")
    private int field3386;

    @OriginalMember(owner = "client!ns", name = "V", descriptor = "I")
    private int field3389;

    @OriginalMember(owner = "client!ns", name = "Z", descriptor = "S")
    private short field3393;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(J)V")
    public final void method1428(long arg0) {
        int var3 = super.field3088 >> 19;
        int var4 = super.field3091 >> 19;
        int var5 = super.field3094 >> class462.field6253;
        if (var5 <= 0 && var5 >= -65535 && var3 >= 0 && var3 < class143.field2058 && var4 >= 0 && var4 < class91.field1344) {
            class256 var6 = this.field3390.field5391;
            class373 var7 = this.field3390.field5397;
            class177[] var8 = class221.field2945;
            int var9 = var8[var6.field3411].method371(var3, var4);
            int var10;
            if (var6.field3411 < class142.field2056 - 1) {
                var10 = var8[var6.field3411 + 1].method371(var3, var4);
            } else {
                var10 = var9 - 1024;
            }
            if (var7.field5087) {
                if (var7.field5096 == -1 && var5 > var9) {
                    this.method1432();
                    return;
                }
                if (var7.field5096 >= 0 && var5 > var8[var7.field5096].method371(var3, var4)) {
                    this.method1432();
                    return;
                }
                if (var7.field5106 == -1 && var5 < var10) {
                    this.method1432();
                    return;
                }
                if (var7.field5106 >= 0 && var5 < var8[var7.field5106 + 1].method371(var3, var4)) {
                    this.method1432();
                    return;
                }
            }
            if (var3 >= var6.field3407 && var3 <= var6.field3406 && var4 >= var6.field3412 && var4 <= var6.field3405 && var5 <= var9 && var5 >= var10) {
                var6.field3408.field4574.method1804(this, 20408);
            } else {
                int var11;
                for (var11 = class142.field2056 - 1; var11 > 0 && var5 > var8[var11].method371(var3, var4); --var11) {
                }
                if (var11 == 0 && var5 > var8[0].method371(var3, var4)) {
                    this.method1432();
                } else if (class142.field2056 - 1 == var11 && var8[var11].method371(var3, var4) - var5 > 1024) {
                    this.method1432();
                } else {
                    class491 var12 = class289.field3897[var11][var3][var4];
                    if (var12 == null) {
                        if (var11 == 0) {
                            var12 = class289.field3897[0][var3][var4] = new class491(0, var3, var4);
                        }
                        boolean var13 = class289.field3897[0][var3][var4].field6862 != null;
                        if (var11 == 3 && var13) {
                            this.method1432();
                            return;
                        }
                        for (int var14 = 1; var14 <= var11; ++var14) {
                            if (class289.field3897[var14][var3][var4] == null) {
                                var12 = class289.field3897[var14][var3][var4] = new class491(var14, var3, var4);
                                if (var13) {
                                    ++var12.field6836;
                                }
                            }
                        }
                    }
                    if (var12.field6853 == null) {
                        var12.field6853 = new class342();
                        var12.field6861 = (byte) ((int) (arg0 & 255L));
                    } else if ((byte) ((int) (arg0 & 255L)) != var12.field6861) {
                        var12.field6853.field4574.method1805(127);
                        var12.field6853.field4580 = false;
                        var12.field6861 = (byte) ((int) (arg0 & 255L));
                    }
                    var12.field6853.field4574.method1804(this, 20408);
                }
            }
        } else {
            this.method1432();
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "()V")
    private final void method1429() {
        int var1 = this.field3390.field5391.field3400;
        if (this.field3390.field5391.field3399[var1] != null) {
            this.field3390.field5391.field3399[var1].method1432();
        }
        this.field3390.field5391.field3399[var1] = this;
        this.field3393 = (short) this.field3390.field5391.field3400;
        this.field3390.field5391.field3400 = var1 + 1 & 8191;
        this.field3390.field5377.method2767(-1830, this);
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lth;IIIIIIIIIIIZZ)V")
    public final void method1430(class389 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field3390 = arg0;
        super.field3088 = arg1 << class462.field6253;
        super.field3094 = arg2 << class462.field6253;
        super.field3091 = arg3 << class462.field6253;
        super.field3093 = arg9;
        this.field3392 = this.field3391 = (short) arg8;
        super.field3096 = arg10;
        super.field3098 = arg11;
        super.field3085 = arg13;
        this.field3387 = (short) arg4;
        this.field3385 = (short) arg5;
        this.field3388 = (short) arg6;
        this.field3386 = arg7;
        super.field3086 = this.field3390.field5372.field1902;
        this.method1429();
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(JI)V")
    public final void method1431(long arg0, int arg1) {
        this.field3391 = (short) (this.field3391 - arg1);
        if (this.field3391 <= 0) {
            this.method1432();
        } else {
            int var4 = super.field3088 >> class462.field6253;
            int var5 = super.field3094 >> class462.field6253;
            int var6 = super.field3091 >> class462.field6253;
            class256 var7 = this.field3390.field5391;
            class373 var8 = this.field3390.field5397;
            if (var8.field5098 != 0) {
                if (this.field3392 - this.field3391 <= var8.field5149) {
                    int var9 = var8.field5108 * arg1 + (this.field3389 >> 16 & 255) + (super.field3093 >> 8 & 65280);
                    int var10 = var8.field5086 * arg1 + (this.field3389 >> 8 & 255) + (super.field3093 & 65280);
                    int var11 = var8.field5110 * arg1 + (super.field3093 << 8 & 65280) + (this.field3389 & 255);
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
                    super.field3093 &= -16777216;
                    super.field3093 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field3389 &= -16777216;
                    this.field3389 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field3392 - this.field3391 <= var8.field5130) {
                    int var12 = var8.field5103 * arg1 + (this.field3389 >> 24 & 255) + (super.field3093 >> 16 & 65280);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field3093 &= 16777215;
                    super.field3093 |= (var12 & 65280) << 16;
                    this.field3389 &= 16777215;
                    this.field3389 |= (var12 & 255) << 24;
                }
            }
            if (var8.field5117 != -1 && this.field3392 - this.field3391 <= var8.field5141) {
                this.field3386 += var8.field5088 * arg1;
            }
            if (var8.field5142 != -1 && this.field3392 - this.field3391 <= var8.field5127) {
                super.field3096 += var8.field5126 * arg1;
            }
            int var13 = this.field3387;
            int var14 = this.field3385;
            int var15 = this.field3388;
            boolean var16 = false;
            if (var8.field5116 == 1) {
                int var17 = var4 - this.field3390.field5388;
                int var18 = var5 - this.field3390.field5396;
                int var19 = var6 - this.field3390.field5369;
                int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
                long var21 = (long) (var8.field5099 * var20 * arg1);
                this.field3386 = (int) ((long) this.field3386 - ((long) this.field3386 * var21 >> 18));
            } else if (var8.field5116 == 2) {
                int var23 = var4 - this.field3390.field5388;
                int var24 = var5 - this.field3390.field5396;
                int var25 = var6 - this.field3390.field5369;
                int var26 = var25 * var25 + var23 * var23 + var24 * var24;
                long var27 = (long) (var8.field5099 * var26 * arg1);
                this.field3386 = (int) ((long) this.field3386 - ((long) this.field3386 * var27 >> 28));
            }
            if (var8.field5093 != null) {
                class445 var29 = var7.field3404.field1573;
                for (class445 var30 = var29.field6046; var29 != var30; var30 = var30.field6046) {
                    class93 var31 = (class93) var30;
                    class239 var32 = var31.field1365;
                    if (var32.field3168 != 1) {
                        boolean var33 = false;
                        for (int var34 = 0; var34 < var8.field5093.length; ++var34) {
                            if (var8.field5093[var34] == var32.field3181) {
                                var33 = true;
                                break;
                            }
                        }
                        if (var33) {
                            int var35 = var4 - var31.field1369;
                            int var36 = var5 - var31.field1358;
                            int var37 = var6 - var31.field1370;
                            long var38 = (long) (var37 * var37 + var35 * var35 + var36 * var36);
                            if (var38 <= var32.field3182) {
                                int var40 = (int) Math.sqrt((double) var38);
                                if (var40 == 0) {
                                    var40 = 1;
                                }
                                long var41 = (long) (var31.field1360 * var37 + var31.field1357 * var35 + var32.field3180 * var36) * 65535L / (long) (var32.field3171 * var40);
                                if (var41 >= (long) var32.field3169) {
                                    int var43 = 0;
                                    if (var32.field3190 == 1) {
                                        var43 = (var40 >> 4) * var32.field3183;
                                    } else if (var32.field3190 == 2) {
                                        var43 = (var40 >> 4) * (var40 >> 4) * var32.field3183;
                                    }
                                    if (var32.field3178 == 0) {
                                        if (var32.field3174 == 0) {
                                            var13 += (var31.field1357 - var43) * arg1;
                                            var14 += (var32.field3180 - var43) * arg1;
                                            var15 += (var31.field1360 - var43) * arg1;
                                            var16 = true;
                                        } else {
                                            super.field3088 += (var31.field1357 - var43) * arg1;
                                            super.field3094 += (var32.field3180 - var43) * arg1;
                                            super.field3091 += (var31.field1360 - var43) * arg1;
                                        }
                                    } else {
                                        int var44 = (var35 << 15) / var40 * var32.field3171;
                                        int var45 = (var36 << 15) / var40 * var32.field3171;
                                        int var46 = (var37 << 15) / var40 * var32.field3171;
                                        if (var32.field3174 == 0) {
                                            var13 += arg1 * var44 >> 15;
                                            var14 += arg1 * var45 >> 15;
                                            var15 += arg1 * var46 >> 15;
                                            var16 = true;
                                        } else {
                                            super.field3088 += arg1 * var44 >> 15;
                                            super.field3094 += arg1 * var45 >> 15;
                                            super.field3091 += arg1 * var46 >> 15;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field5138 != null) {
                for (int var47 = 0; var47 < var8.field5138.length; ++var47) {
                    class93 var48 = (class93) class30.field393.method613(2327, (long) var8.field5138[var47]);
                    while (var48 != null) {
                        class239 var49 = var48.field1365;
                        int var50 = var4 - var48.field1369;
                        int var51 = var5 - var48.field1358;
                        int var52 = var6 - var48.field1370;
                        long var53 = (long) (var52 * var52 + var50 * var50 + var51 * var51);
                        if (var53 > var49.field3182) {
                            var48 = (class93) class30.field393.method614(12);
                        } else {
                            int var55 = (int) Math.sqrt((double) var53);
                            if (var55 == 0) {
                                var55 = 1;
                            }
                            long var56 = (long) (var48.field1360 * var52 + var48.field1357 * var50 + var49.field3180 * var51) * 65535L / (long) (var49.field3171 * var55);
                            if (var56 < (long) var49.field3169) {
                                var48 = (class93) class30.field393.method614(12);
                            } else {
                                int var58 = 0;
                                if (var49.field3190 == 1) {
                                    var58 = (var55 >> 4) * var49.field3183;
                                } else if (var49.field3190 == 2) {
                                    var58 = (var55 >> 4) * (var55 >> 4) * var49.field3183;
                                }
                                if (var49.field3178 == 0) {
                                    if (var49.field3174 == 0) {
                                        var13 += (var48.field1357 - var58) * arg1;
                                        var14 += (var49.field3180 - var58) * arg1;
                                        var15 += (var48.field1360 - var58) * arg1;
                                        var16 = true;
                                    } else {
                                        super.field3088 += (var48.field1357 - var58) * arg1;
                                        super.field3094 += (var49.field3180 - var58) * arg1;
                                        super.field3091 += (var48.field1360 - var58) * arg1;
                                    }
                                } else {
                                    int var59 = (var50 << 15) / var55 * var49.field3171;
                                    int var60 = (var51 << 15) / var55 * var49.field3171;
                                    int var61 = (var52 << 15) / var55 * var49.field3171;
                                    if (var49.field3174 == 0) {
                                        var13 += arg1 * var59 >> 15;
                                        var14 += arg1 * var60 >> 15;
                                        var15 += arg1 * var61 >> 15;
                                        var16 = true;
                                    } else {
                                        super.field3088 += arg1 * var59 >> 15;
                                        super.field3094 += arg1 * var60 >> 15;
                                        super.field3091 += arg1 * var61 >> 15;
                                    }
                                }
                                var48 = (class93) class30.field393.method614(12);
                            }
                        }
                    }
                }
            }
            if (var8.field5131 != null) {
                if (var8.field5092 == null) {
                    var8.field5092 = new int[var8.field5131.length];
                    for (int var62 = 0; var62 < var8.field5131.length; ++var62) {
                        class56.method408(var8.field5131[var62], 1);
                        var8.field5092[var62] = ((class37) class445.field6055.method1528((long) var8.field5131[var62], 69)).field555;
                    }
                }
                for (int var63 = 0; var63 < var8.field5092.length; ++var63) {
                    class239 var64 = class135.field1972[var8.field5092[var63]];
                    if (var64.field3174 == 0) {
                        var13 += var64.field3192 * arg1;
                        var14 += var64.field3180 * arg1;
                        var15 += var64.field3172 * arg1;
                        var16 = true;
                    } else {
                        super.field3088 += var64.field3192 * arg1;
                        super.field3094 += var64.field3180 * arg1;
                        super.field3091 += var64.field3172 * arg1;
                    }
                }
            }
            if (var16) {
                while (true) {
                    if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                        this.field3387 = (short) var13;
                        this.field3385 = (short) var14;
                        this.field3388 = (short) var15;
                        break;
                    }
                    var13 >>= 1;
                    var14 >>= 1;
                    var15 >>= 1;
                    this.field3386 <<= 1;
                }
            }
            super.field3088 = (int) ((long) super.field3088 + ((long) this.field3387 * (long) this.field3386 >> 23) * (long) arg1);
            super.field3094 = (int) ((long) super.field3094 + ((long) this.field3385 * (long) this.field3386 >> 23) * (long) arg1);
            super.field3091 = (int) ((long) super.field3091 + ((long) this.field3388 * (long) this.field3386 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "()V")
    private final void method1432() {
        this.field3390.field5391.field3399[this.field3393] = null;
        class480.field6626[class136.field1981] = this;
        class136.field1981 = class136.field1981 + 1 & 1023;
        this.method1541(-3);
        this.method2630((byte) -116);
    }

    @OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Lth;IIIIIIIIIIIZZ)V")
    public class255(class389 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field3390 = arg0;
        super.field3088 = arg1 << class462.field6253;
        super.field3094 = arg2 << class462.field6253;
        super.field3091 = arg3 << class462.field6253;
        super.field3093 = arg9;
        this.field3392 = this.field3391 = (short) arg8;
        super.field3096 = arg10;
        super.field3098 = arg11;
        super.field3085 = arg13;
        this.field3387 = (short) arg4;
        this.field3385 = (short) arg5;
        this.field3388 = (short) arg6;
        this.field3386 = arg7;
        super.field3086 = this.field3390.field5372.field1902;
        this.method1429();
    }
}
