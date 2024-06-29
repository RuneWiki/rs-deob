import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class310 extends class17 {

    @OriginalMember(owner = "client!vj", name = "G", descriptor = "[I")
    public static int[] field4515 = new int[13];

    @OriginalMember(owner = "client!vj", name = "J", descriptor = "I")
    public static int field4518 = 0;

    @OriginalMember(owner = "client!vj", name = "K", descriptor = "Ltn;")
    public static class60 field4519 = new class60(10, 3);

    @OriginalMember(owner = "client!vj", name = "F", descriptor = "I")
    public static int field4514;

    @OriginalMember(owner = "client!vj", name = "H", descriptor = "I")
    public static int field4516;

    @OriginalMember(owner = "client!vj", name = "I", descriptor = "I")
    public static int field4517;

    @OriginalMember(owner = "client!vj", name = "L", descriptor = "I")
    public static int field4520;

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "(I)V", line = 4)
    public static void method1878(int arg0) {
        field4519 = null;
        field4515 = null;
        if (arg0 != -32621) {
            field4518 = -98;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(II)[I", line = 15)
    public final int[] method27(int arg0, int arg1) {
        ++field4516;
        int[] var3 = super.field210.method2683(-17, arg0);
        if (arg1 <= 53) {
            method1878(4);
        }
        if (super.field210.field6442) {
            int var4 = class40.field427[arg0];
            for (int var5 = 0; class530.field7763 > var5; ++var5) {
                var3[var5] = this.method1880(var4, class492.field6966[var5], -4) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "()V", line = 49)
    public class310() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Ljg;B)V", line = 67)
    public static final void method1879(class228 arg0, byte arg1) {
        if (arg1 != 109) {
            method1879((class228) null, (byte) 38);
        }
        arg0.field3332 = 0;
        ++field4520;
        if (~arg0.field3337 != 0) {
            class449 var2 = class62.field784.method2566(arg0.field3337, -19);
            if (var2 != null && var2.field6276 != null) {
                label405: {
                    ++arg0.field3290;
                    if (~var2.field6276.length < ~arg0.field3314 && ~arg0.field3290 < ~var2.field6258[arg0.field3314]) {
                        ++arg0.field3325;
                        ++arg0.field3314;
                        arg0.field3290 = 1;
                        class190.method1213(arg0.field3314, arg0.field1896, (byte) 83, var2, arg0.field1904, class246.field3587 == arg0, arg0.field1899);
                    }
                    if (~var2.field6276.length >= ~arg0.field3314) {
                        arg0.field3314 = 0;
                        arg0.field3290 = 0;
                        if (arg0.field3302) {
                            arg0.field3337 = arg0.method1406((byte) 105).method696(-4203);
                            if (~arg0.field3337 == 0) {
                                arg0.field3302 = false;
                                break label405;
                            }
                            var2 = class62.field784.method2566(arg0.field3337, arg1 ^ -128);
                        }
                        class190.method1213(arg0.field3314, arg0.field1896, (byte) -122, var2, arg0.field1904, class246.field3587 == arg0, arg0.field1899);
                    }
                    arg0.field3325 = arg0.field3314 + 1;
                    if (~arg0.field3325 <= ~var2.field6276.length) {
                        arg0.field3325 = 0;
                    }
                }
            } else {
                arg0.field3302 = false;
                arg0.field3337 = -1;
            }
        }
        if (arg0.field3275 != -1 && ~class390.field5481 <= ~arg0.field3296) {
            class508 var3 = class125.field1688.method2457(arg0.field3275, (byte) 87);
            int var4 = var3.field7504;
            if (var4 != -1) {
                label407: {
                    class449 var5 = class62.field784.method2566(var4, -19);
                    if (var3.field7520) {
                        if (var5.field6272 == 3) {
                            if (arg0.field3376 > 0 && ~class390.field5481 <= ~arg0.field3319 && ~arg0.field3365 > ~class390.field5481) {
                                arg0.field3275 = -1;
                                break label407;
                            }
                        } else if (~var5.field6272 == -2 && ~arg0.field3376 < -1 && ~class390.field5481 <= ~arg0.field3319 && class390.field5481 > arg0.field3365) {
                            arg0.field3296 = class390.field5481 - -1;
                            break label407;
                        }
                    }
                    if (var5 != null && var5.field6276 != null) {
                        if (~arg0.field3362 > -1) {
                            arg0.field3362 = 0;
                            class190.method1213(0, arg0.field1896, (byte) 32, var5, arg0.field1904, class246.field3587 == arg0, arg0.field1899);
                        }
                        ++arg0.field3276;
                        if (~var5.field6276.length < ~arg0.field3362 && arg0.field3276 > var5.field6258[arg0.field3362]) {
                            ++arg0.field3362;
                            arg0.field3276 = 1;
                            class190.method1213(arg0.field3362, arg0.field1896, (byte) -126, var5, arg0.field1904, class246.field3587 == arg0, arg0.field1899);
                        }
                        if (~var5.field6276.length >= ~arg0.field3362) {
                            if (var3.field7520) {
                                arg0.field3362 -= var5.field6264;
                                ++arg0.field3293;
                                if (~arg0.field3293 <= ~var5.field6266) {
                                    arg0.field3275 = -1;
                                } else if (arg0.field3362 >= 0 && var5.field6276.length > arg0.field3362) {
                                    class190.method1213(arg0.field3362, arg0.field1896, (byte) -105, var5, arg0.field1904, class246.field3587 == arg0, arg0.field1899);
                                } else {
                                    arg0.field3275 = -1;
                                }
                            } else {
                                arg0.field3275 = -1;
                            }
                        }
                        arg0.field3318 = arg0.field3362 + 1;
                        if (arg0.field3318 >= var5.field6276.length) {
                            if (var3.field7520) {
                                arg0.field3318 -= var5.field6264;
                                if (var5.field6266 <= arg0.field3293 + 1) {
                                    arg0.field3318 = -1;
                                } else if (~arg0.field3318 > -1 || var5.field6276.length <= arg0.field3318) {
                                    arg0.field3318 = -1;
                                }
                            } else {
                                arg0.field3318 = -1;
                            }
                        }
                    } else {
                        arg0.field3275 = -1;
                    }
                }
            } else {
                arg0.field3275 = -1;
            }
        }
        if (~arg0.field3350 != 0 && arg0.field3291 <= class390.field5481) {
            class508 var6 = class125.field1688.method2457(arg0.field3350, (byte) 87);
            int var7 = var6.field7504;
            if (var7 == -1) {
                arg0.field3350 = -1;
            } else {
                label411: {
                    class449 var8 = class62.field784.method2566(var7, arg1 ^ -128);
                    if (var6.field7520) {
                        if (~var8.field6272 != -4) {
                            if (var8.field6272 == 1 && ~arg0.field3376 < -1 && ~arg0.field3319 >= ~class390.field5481 && arg0.field3365 < class390.field5481) {
                                arg0.field3291 = class390.field5481 + 1;
                                break label411;
                            }
                        } else if (~arg0.field3376 < -1 && arg0.field3319 <= class390.field5481 && class390.field5481 > arg0.field3365) {
                            arg0.field3350 = -1;
                            break label411;
                        }
                    }
                    if (var8 != null && var8.field6276 != null) {
                        if (~arg0.field3322 > -1) {
                            arg0.field3322 = 0;
                            class190.method1213(0, arg0.field1896, (byte) -124, var8, arg0.field1904, class246.field3587 == arg0, arg0.field1899);
                        }
                        ++arg0.field3321;
                        if (~arg0.field3322 > ~var8.field6276.length && var8.field6258[arg0.field3322] < arg0.field3321) {
                            arg0.field3321 = 1;
                            ++arg0.field3322;
                            class190.method1213(arg0.field3322, arg0.field1896, (byte) -120, var8, arg0.field1904, class246.field3587 == arg0, arg0.field1899);
                        }
                        if (~arg0.field3322 <= ~var8.field6276.length) {
                            if (var6.field7520) {
                                ++arg0.field3349;
                                arg0.field3322 -= var8.field6264;
                                if (arg0.field3349 >= var8.field6266) {
                                    arg0.field3350 = -1;
                                } else if (arg0.field3322 >= 0 && ~arg0.field3322 > ~var8.field6276.length) {
                                    class190.method1213(arg0.field3322, arg0.field1896, (byte) 20, var8, arg0.field1904, class246.field3587 == arg0, arg0.field1899);
                                } else {
                                    arg0.field3350 = -1;
                                }
                            } else {
                                arg0.field3350 = -1;
                            }
                        }
                        arg0.field3344 = arg0.field3322 + 1;
                        if (~var8.field6276.length >= ~arg0.field3344) {
                            if (!var6.field7520) {
                                arg0.field3344 = -1;
                            } else {
                                arg0.field3344 -= var8.field6264;
                                if (~(arg0.field3349 + 1) > ~var8.field6266) {
                                    if (~arg0.field3344 > -1 || ~var8.field6276.length >= ~arg0.field3344) {
                                        arg0.field3344 = -1;
                                    }
                                } else {
                                    arg0.field3344 = -1;
                                }
                            }
                        }
                    } else {
                        arg0.field3350 = -1;
                    }
                }
            }
        }
        if (~arg0.field3320 != 0 && arg0.field3361 <= 1) {
            class449 var9 = class62.field784.method2566(arg0.field3320, -19);
            if (~var9.field6272 != -4) {
                if (~var9.field6272 == -2 && arg0.field3376 > 0 && ~arg0.field3319 >= ~class390.field5481 && ~class390.field5481 < ~arg0.field3365) {
                    arg0.field3361 = 2;
                }
            } else if (arg0.field3376 > 0 && class390.field5481 >= arg0.field3319 && ~arg0.field3365 > ~class390.field5481) {
                arg0.field3320 = -1;
            }
        }
        if (~arg0.field3320 != 0 && arg0.field3361 == 0) {
            class449 var10 = class62.field784.method2566(arg0.field3320, -19);
            if (var10 != null && var10.field6276 != null) {
                ++arg0.field3277;
                if (~var10.field6276.length < ~arg0.field3312 && arg0.field3277 > var10.field6258[arg0.field3312]) {
                    arg0.field3277 = 1;
                    ++arg0.field3312;
                    class190.method1213(arg0.field3312, arg0.field1896, (byte) 22, var10, arg0.field1904, class246.field3587 == arg0, arg0.field1899);
                }
                if (var10.field6276.length <= arg0.field3312) {
                    arg0.field3312 -= var10.field6264;
                    ++arg0.field3288;
                    if (~arg0.field3288 <= ~var10.field6266) {
                        arg0.field3320 = -1;
                    } else if (~arg0.field3312 <= -1 && ~var10.field6276.length < ~arg0.field3312) {
                        class190.method1213(arg0.field3312, arg0.field1896, (byte) 122, var10, arg0.field1904, class246.field3587 == arg0, arg0.field1899);
                    } else {
                        arg0.field3320 = -1;
                    }
                }
                arg0.field3284 = arg0.field3312 - -1;
                if (arg0.field3284 >= var10.field6276.length) {
                    arg0.field3284 -= var10.field6264;
                    if (~(arg0.field3288 + 1) <= ~var10.field6266) {
                        arg0.field3284 = -1;
                    } else if (arg0.field3284 < 0 || var10.field6276.length <= arg0.field3284) {
                        arg0.field3284 = -1;
                    }
                }
                arg0.field3332 = var10.field6273;
            } else {
                arg0.field3320 = -1;
            }
        }
        if (arg0.field3361 > 0) {
            --arg0.field3361;
        }
        for (int var11 = 0; arg0.field3295.length > var11; ++var11) {
            class265 var12 = arg0.field3295[var11];
            if (var12 != null) {
                if (var12.field3880 > 0) {
                    --var12.field3880;
                } else {
                    class449 var13 = class62.field784.method2566(var12.field3881, -19);
                    if (var13 != null && var13.field6276 != null) {
                        ++var12.field3883;
                        if (var12.field3889 < var13.field6276.length && var13.field6258[var12.field3889] < var12.field3883) {
                            var12.field3883 = 1;
                            ++var12.field3889;
                            class190.method1213(var12.field3889, arg0.field1896, (byte) -110, var13, arg0.field1904, class246.field3587 == arg0, arg0.field1899);
                        }
                        if (var12.field3889 >= var13.field6276.length) {
                            var12.field3889 -= var13.field6264;
                            ++var12.field3885;
                            if (var13.field6266 > var12.field3885) {
                                if (~var12.field3889 <= -1 && ~var12.field3889 > ~var13.field6276.length) {
                                    class190.method1213(var12.field3889, arg0.field1896, (byte) -117, var13, arg0.field1904, class246.field3587 == arg0, arg0.field1899);
                                } else {
                                    arg0.field3295[var11] = null;
                                }
                            } else {
                                arg0.field3295[var11] = null;
                            }
                        }
                        var12.field3886 = var12.field3889 + 1;
                        if (var12.field3886 >= var13.field6276.length) {
                            var12.field3886 -= var13.field6264;
                            if (var13.field6266 <= var12.field3885 + 1) {
                                var12.field3886 = -1;
                            } else if (~var12.field3886 > -1 || var13.field6276.length <= var12.field3886) {
                                var12.field3886 = -1;
                            }
                        }
                    } else {
                        arg0.field3295[var11] = null;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "(III)I", line = 488)
    private final int method1880(int arg0, int arg1, int arg2) {
        ++field4517;
        int var4 = arg0 * 57 + arg1;
        int var5 = var4 << 1 ^ var4;
        if (arg2 != -4) {
            field4518 = 71;
        }
        return -((Integer.MAX_VALUE & (var5 * var5 * 15731 + 789221) * var5 - -1376312589) / 262144) + 4096;
    }
}
