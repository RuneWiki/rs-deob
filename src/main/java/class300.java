import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class300 extends class394 {

    @OriginalMember(owner = "client!wk", name = "D", descriptor = "Lwg;")
    private class38 field4474;

    @OriginalMember(owner = "client!wk", name = "C", descriptor = "S")
    private short field4473;

    @OriginalMember(owner = "client!wk", name = "E", descriptor = "S")
    private short field4475;

    @OriginalMember(owner = "client!wk", name = "J", descriptor = "S")
    private short field4480;

    @OriginalMember(owner = "client!wk", name = "H", descriptor = "S")
    private short field4478;

    @OriginalMember(owner = "client!wk", name = "G", descriptor = "S")
    private short field4477;

    @OriginalMember(owner = "client!wk", name = "F", descriptor = "I")
    private int field4476;

    @OriginalMember(owner = "client!wk", name = "I", descriptor = "I")
    private int field4479;

    @OriginalMember(owner = "client!wk", name = "K", descriptor = "S")
    private short field4481;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "()V")
    private final void method1870() {
        int var1 = this.field4474.field517.field814;
        if (this.field4474.field517.field818[var1] != null) {
            this.field4474.field517.field818[var1].method1874();
        }
        this.field4474.field517.field818[var1] = this;
        this.field4481 = (short) this.field4474.field517.field814;
        this.field4474.field517.field814 = var1 + 1 & 8191;
        this.field4474.field522.method1597(this, (byte) 50);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(J)V")
    public final void method1871(long arg0) {
        int var3 = super.field5806 >> 19;
        int var4 = super.field5801 >> 19;
        int var5 = super.field5799 >> class73.field982;
        if (var5 <= 0 && var5 >= -65535 && var3 >= 0 && var3 < class412.field5957 && var4 >= 0 && var4 < class315.field4743) {
            class59 var6 = this.field4474.field517;
            class283 var7 = this.field4474.field511;
            class48[] var8 = class479.field6745;
            int var9 = var8[var6.field824].method199(var3, var4);
            int var10;
            if (var6.field824 < class344.field5192 - 1) {
                var10 = var8[var6.field824 + 1].method199(var3, var4);
            } else {
                var10 = var9 - 1024;
            }
            if (var7.field4311) {
                if (var7.field4290 == -1 && var5 > var9) {
                    this.method1874();
                    return;
                }
                if (var7.field4290 >= 0 && var5 > var8[var7.field4290].method199(var3, var4)) {
                    this.method1874();
                    return;
                }
                if (var7.field4281 == -1 && var5 < var10) {
                    this.method1874();
                    return;
                }
                if (var7.field4281 >= 0 && var5 < var8[var7.field4281 + 1].method199(var3, var4)) {
                    this.method1874();
                    return;
                }
            }
            if (var3 >= var6.field830 && var3 <= var6.field823 && var4 >= var6.field828 && var4 <= var6.field827 && var5 <= var9 && var5 >= var10) {
                var6.field825.field3965.method2411((byte) 105, this);
            } else {
                int var11;
                for (var11 = class344.field5192 - 1; var11 > 0 && var5 > var8[var11].method199(var3, var4); --var11) {
                }
                if (class344.field5192 - 1 == var11 && var8[var11].method199(var3, var4) - var5 > 1024) {
                    this.method1874();
                } else {
                    class337 var12 = class170.field2427[var11][var3][var4];
                    if (var12 == null) {
                        if (var11 == 0) {
                            var12 = class170.field2427[0][var3][var4] = new class337(0, var3, var4);
                        }
                        boolean var13 = class170.field2427[0][var3][var4].field5062 != null;
                        if (var11 == 3 && var13) {
                            this.method1874();
                            return;
                        }
                        for (int var14 = 1; var14 <= var11; ++var14) {
                            if (class170.field2427[var14][var3][var4] == null) {
                                var12 = class170.field2427[var14][var3][var4] = new class337(var14, var3, var4);
                                if (var13) {
                                    ++var12.field5051;
                                }
                            }
                        }
                    }
                    if (var12.field5046 == null) {
                        var12.field5046 = new class268();
                        var12.field5059 = (byte) ((int) (arg0 & 255L));
                    } else if ((byte) ((int) (arg0 & 255L)) != var12.field5059) {
                        var12.field5046 = new class268();
                        var12.field5059 = (byte) ((int) (arg0 & 255L));
                    }
                    var12.field5046.field3965.method2411((byte) 100, this);
                }
            }
        } else {
            this.method1874();
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(JI)V")
    public final void method1872(long arg0, int arg1) {
        this.field4473 = (short) (this.field4473 - arg1);
        if (this.field4473 <= 0) {
            this.method1874();
        } else {
            int var4 = super.field5806 >> class73.field982;
            int var5 = super.field5799 >> class73.field982;
            int var6 = super.field5801 >> class73.field982;
            class59 var7 = this.field4474.field517;
            class283 var8 = this.field4474.field511;
            if (var8.field4335 != 0) {
                if (this.field4475 - this.field4473 <= var8.field4344) {
                    int var9 = var8.field4334 * arg1 + (super.field5810 >> 8 & 65280) + (this.field4479 >> 16 & 255);
                    int var10 = var8.field4314 * arg1 + (this.field4479 >> 8 & 255) + (super.field5810 & 65280);
                    int var11 = var8.field4284 * arg1 + (super.field5810 << 8 & 65280) + (this.field4479 & 255);
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
                    super.field5810 &= -16777216;
                    super.field5810 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field4479 &= -16777216;
                    this.field4479 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field4475 - this.field4473 <= var8.field4286) {
                    int var12 = var8.field4309 * arg1 + (super.field5810 >> 16 & 65280) + (this.field4479 >> 24 & 255);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field5810 &= 16777215;
                    super.field5810 |= (var12 & 65280) << 16;
                    this.field4479 &= 16777215;
                    this.field4479 |= (var12 & 255) << 24;
                }
            }
            if (var8.field4322 != -1 && this.field4475 - this.field4473 <= var8.field4276) {
                this.field4476 += var8.field4285 * arg1;
            }
            if (var8.field4341 != -1 && this.field4475 - this.field4473 <= var8.field4292) {
                super.field5807 += var8.field4305 * arg1;
            }
            int var13 = this.field4480;
            int var14 = this.field4478;
            int var15 = this.field4477;
            boolean var16 = false;
            if (var8.field4342 == 1) {
                int var17 = var4 - this.field4474.field529;
                int var18 = var5 - this.field4474.field498;
                int var19 = var6 - this.field4474.field497;
                int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
                long var21 = (long) (var8.field4303 * var20 * arg1);
                this.field4476 = (int) ((long) this.field4476 - ((long) this.field4476 * var21 >> 18));
            } else if (var8.field4342 == 2) {
                int var23 = var4 - this.field4474.field529;
                int var24 = var5 - this.field4474.field498;
                int var25 = var6 - this.field4474.field497;
                int var26 = var25 * var25 + var23 * var23 + var24 * var24;
                long var27 = (long) (var8.field4303 * var26 * arg1);
                this.field4476 = (int) ((long) this.field4476 - ((long) this.field4476 * var27 >> 28));
            }
            if (var8.field4323 != null) {
                class35 var29 = var7.field821.field5951;
                for (class35 var30 = var29.field434; var29 != var30; var30 = var30.field434) {
                    class71 var31 = (class71) var30;
                    class453 var32 = var31.field956;
                    if (var32.field6425 != 1) {
                        boolean var33 = false;
                        for (int var34 = 0; var34 < var8.field4323.length; ++var34) {
                            if (var8.field4323[var34] == var32.field6427) {
                                var33 = true;
                                break;
                            }
                        }
                        if (var33) {
                            int var35 = var4 - var31.field951;
                            int var36 = var5 - var31.field962;
                            int var37 = var6 - var31.field952;
                            long var38 = (long) (var37 * var37 + var35 * var35 + var36 * var36);
                            if (var38 <= var32.field6424) {
                                int var40 = (int) Math.sqrt((double) var38);
                                if (var40 == 0) {
                                    var40 = 1;
                                }
                                long var41 = (long) (var31.field961 * var37 + var31.field958 * var35 + var32.field6429 * var36) * 65535L / (long) (var32.field6423 * var40);
                                if (var41 >= (long) var32.field6442) {
                                    int var43 = 0;
                                    if (var32.field6435 == 1) {
                                        var43 = (var40 >> 4) * var32.field6437;
                                    } else if (var32.field6435 == 2) {
                                        var43 = (var40 >> 4) * (var40 >> 4) * var32.field6437;
                                    }
                                    if (var32.field6433 == 0) {
                                        if (var32.field6421 == 0) {
                                            var13 += (var31.field958 - var43) * arg1;
                                            var14 += (var32.field6429 - var43) * arg1;
                                            var15 += (var31.field961 - var43) * arg1;
                                            var16 = true;
                                        } else {
                                            super.field5806 += (var31.field958 - var43) * arg1;
                                            super.field5799 += (var32.field6429 - var43) * arg1;
                                            super.field5801 += (var31.field961 - var43) * arg1;
                                        }
                                    } else {
                                        int var44 = (var35 << 15) / var40 * var32.field6423;
                                        int var45 = (var36 << 15) / var40 * var32.field6423;
                                        int var46 = (var37 << 15) / var40 * var32.field6423;
                                        if (var32.field6421 == 0) {
                                            var13 += arg1 * var44 >> 15;
                                            var14 += arg1 * var45 >> 15;
                                            var15 += arg1 * var46 >> 15;
                                            var16 = true;
                                        } else {
                                            super.field5806 += arg1 * var44 >> 15;
                                            super.field5799 += arg1 * var45 >> 15;
                                            super.field5801 += arg1 * var46 >> 15;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field4320 != null) {
                for (int var47 = 0; var47 < var8.field4320.length; ++var47) {
                    class71 var48 = (class71) class81.field1143.method2289(0, (long) var8.field4320[var47]);
                    while (var48 != null) {
                        class453 var49 = var48.field956;
                        int var50 = var4 - var48.field951;
                        int var51 = var5 - var48.field962;
                        int var52 = var6 - var48.field952;
                        long var53 = (long) (var52 * var52 + var50 * var50 + var51 * var51);
                        if (var53 > var49.field6424) {
                            var48 = (class71) class81.field1143.method2287(117);
                        } else {
                            int var55 = (int) Math.sqrt((double) var53);
                            if (var55 == 0) {
                                var55 = 1;
                            }
                            long var56 = (long) (var48.field961 * var52 + var48.field958 * var50 + var49.field6429 * var51) * 65535L / (long) (var49.field6423 * var55);
                            if (var56 < (long) var49.field6442) {
                                var48 = (class71) class81.field1143.method2287(118);
                            } else {
                                int var58 = 0;
                                if (var49.field6435 == 1) {
                                    var58 = (var55 >> 4) * var49.field6437;
                                } else if (var49.field6435 == 2) {
                                    var58 = (var55 >> 4) * (var55 >> 4) * var49.field6437;
                                }
                                if (var49.field6433 == 0) {
                                    if (var49.field6421 == 0) {
                                        var13 += (var48.field958 - var58) * arg1;
                                        var14 += (var49.field6429 - var58) * arg1;
                                        var15 += (var48.field961 - var58) * arg1;
                                        var16 = true;
                                    } else {
                                        super.field5806 += (var48.field958 - var58) * arg1;
                                        super.field5799 += (var49.field6429 - var58) * arg1;
                                        super.field5801 += (var48.field961 - var58) * arg1;
                                    }
                                } else {
                                    int var59 = (var50 << 15) / var55 * var49.field6423;
                                    int var60 = (var51 << 15) / var55 * var49.field6423;
                                    int var61 = (var52 << 15) / var55 * var49.field6423;
                                    if (var49.field6421 == 0) {
                                        var13 += arg1 * var59 >> 15;
                                        var14 += arg1 * var60 >> 15;
                                        var15 += arg1 * var61 >> 15;
                                        var16 = true;
                                    } else {
                                        super.field5806 += arg1 * var59 >> 15;
                                        super.field5799 += arg1 * var60 >> 15;
                                        super.field5801 += arg1 * var61 >> 15;
                                    }
                                }
                                var48 = (class71) class81.field1143.method2287(126);
                            }
                        }
                    }
                }
            }
            if (var8.field4302 != null) {
                if (var8.field4317 == null) {
                    var8.field4317 = new int[var8.field4302.length];
                    for (int var62 = 0; var62 < var8.field4302.length; ++var62) {
                        class25.method217(true, var8.field4302[var62]);
                        var8.field4317[var62] = ((class145) class233.field3417.method2305((long) var8.field4302[var62], (byte) 86)).field2054;
                    }
                }
                for (int var63 = 0; var63 < var8.field4317.length; ++var63) {
                    class453 var64 = class483.field6782[var8.field4317[var63]];
                    if (var64.field6421 == 0) {
                        var13 += var64.field6430 * arg1;
                        var14 += var64.field6429 * arg1;
                        var15 += var64.field6438 * arg1;
                        var16 = true;
                    } else {
                        super.field5806 += var64.field6430 * arg1;
                        super.field5799 += var64.field6429 * arg1;
                        super.field5801 += var64.field6438 * arg1;
                    }
                }
            }
            if (var16) {
                while (true) {
                    if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                        this.field4480 = (short) var13;
                        this.field4478 = (short) var14;
                        this.field4477 = (short) var15;
                        break;
                    }
                    var13 >>= 1;
                    var14 >>= 1;
                    var15 >>= 1;
                    this.field4476 <<= 1;
                }
            }
            super.field5806 = (int) ((long) super.field5806 + ((long) this.field4480 * (long) this.field4476 >> 23) * (long) arg1);
            super.field5799 = (int) ((long) super.field5799 + ((long) this.field4478 * (long) this.field4476 >> 23) * (long) arg1);
            super.field5801 = (int) ((long) super.field5801 + ((long) this.field4477 * (long) this.field4476 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lwg;IIIIIIIIIIIZ)V")
    public final void method1873(class38 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12) {
        this.field4474 = arg0;
        super.field5806 = arg1 << class73.field982;
        super.field5799 = arg2 << class73.field982;
        super.field5801 = arg3 << class73.field982;
        super.field5810 = arg9;
        this.field4475 = this.field4473 = (short) arg8;
        super.field5807 = arg10;
        super.field5802 = arg11;
        this.field4480 = (short) arg4;
        this.field4478 = (short) arg5;
        this.field4477 = (short) arg6;
        this.field4476 = arg7;
        super.field5809 = this.field4474.field506.field4175;
        this.method1870();
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "()V")
    private final void method1874() {
        this.field4474.field517.field818[this.field4481] = null;
        class312.field4709[class488.field6843] = this;
        class488.field6843 = class488.field6843 + 1 & 1023;
        this.method1847(true);
        this.method2095(-67);
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(Lwg;IIIIIIIIIIIZ)V")
    public class300(class38 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12) {
        this.field4474 = arg0;
        super.field5806 = arg1 << class73.field982;
        super.field5799 = arg2 << class73.field982;
        super.field5801 = arg3 << class73.field982;
        super.field5810 = arg9;
        this.field4475 = this.field4473 = (short) arg8;
        super.field5807 = arg10;
        super.field5802 = arg11;
        this.field4480 = (short) arg4;
        this.field4478 = (short) arg5;
        this.field4477 = (short) arg6;
        this.field4476 = arg7;
        super.field5809 = this.field4474.field506.field4175;
        this.method1870();
    }
}
