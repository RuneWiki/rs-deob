import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class140 extends class271 {

    @OriginalMember(owner = "client!sq", name = "k", descriptor = "Lni;")
    public static class279 field1797 = new class279(5000);

    @OriginalMember(owner = "client!sq", name = "i", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!sq", name = "j", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!sq", name = "l", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!sq", name = "m", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(II)V", line = 3)
    public static final void method977(int arg0, int arg1) {
        field1796++;
        class440 var2 = class186.method1241(arg1, 1, (byte) 56);
        var2.method2749(13828096);
        if (arg0 < 47) {
            method979(-116, (class56) null, -107, 63);
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(ILps;)V", line = 20)
    public static final void method978(int arg0, class162 arg1) {
        field1798++;
        arg1.field2157 = false;
        if (arg1.field2143 != arg0) {
            class233 var2 = class73.method597(arg1.field2143, -1);
            if (var2 == null || var2.field3242 == null) {
                arg1.field2178 = false;
                arg1.field2143 = -1;
            } else {
                label302: {
                    arg1.field2163++;
                    if (arg1.field2167 < var2.field3242.length && arg1.field2163 > var2.field3248[arg1.field2167]) {
                        arg1.field2162++;
                        arg1.field2163 = 1;
                        arg1.field2167++;
                        class379.method2476(arg1.field2167, false, class383.field5609 == arg1, arg1.field5930, var2, arg1.field5921);
                    }
                    if (var2.field3242.length <= arg1.field2167) {
                        arg1.field2163 = 0;
                        arg1.field2167 = 0;
                        if (arg1.field2178) {
                            arg1.field2143 = arg1.method1084(-24211).method1975(0);
                            if (arg1.field2143 == -1) {
                                arg1.field2178 = false;
                                break label302;
                            }
                            var2 = class73.method597(arg1.field2143, -1);
                        }
                        class379.method2476(arg1.field2167, false, class383.field5609 == arg1, arg1.field5930, var2, arg1.field5921);
                    }
                    arg1.field2162 = arg1.field2167 + 1;
                    if (var2.field3242.length <= arg1.field2162) {
                        arg1.field2162 = 0;
                    }
                }
            }
        }
        if (arg1.field2142 != -1 && arg1.field2160 <= class231.field3179) {
            class235 var3 = class263.method1762(arg1.field2142, false);
            int var4 = var3.field3271;
            if (var4 == -1) {
                arg1.field2142 = -1;
            } else {
                label304: {
                    class233 var5 = class73.method597(var4, arg0);
                    if (var3.field3263) {
                        if (var5.field3247 == 3) {
                            if (arg1.field2198 > 0 && arg1.field2172 <= class231.field3179 && class231.field3179 > arg1.field2115) {
                                arg1.field2142 = -1;
                                break label304;
                            }
                        } else if (var5.field3247 == 1 && arg1.field2198 > 0 && arg1.field2172 <= class231.field3179 && arg1.field2115 < class231.field3179) {
                            arg1.field2160 = class231.field3179 + 1;
                            break label304;
                        }
                    }
                    if (var5 == null || var5.field3242 == null) {
                        arg1.field2142 = -1;
                    } else {
                        if (arg1.field2113 < 0) {
                            arg1.field2113 = 0;
                            class379.method2476(0, false, class383.field5609 == arg1, arg1.field5930, var5, arg1.field5921);
                        }
                        arg1.field2117++;
                        if (var5.field3242.length > arg1.field2113 && arg1.field2117 > var5.field3248[arg1.field2113]) {
                            arg1.field2113++;
                            arg1.field2117 = 1;
                            class379.method2476(arg1.field2113, false, class383.field5609 == arg1, arg1.field5930, var5, arg1.field5921);
                        }
                        if (var5.field3242.length <= arg1.field2113) {
                            if (var3.field3263) {
                                arg1.field2113 -= var5.field3244;
                                arg1.field2124++;
                                if (var5.field3252 <= arg1.field2124) {
                                    arg1.field2142 = -1;
                                } else if (arg1.field2113 >= 0 && arg1.field2113 < var5.field3242.length) {
                                    class379.method2476(arg1.field2113, false, class383.field5609 == arg1, arg1.field5930, var5, arg1.field5921);
                                } else {
                                    arg1.field2142 = -1;
                                }
                            } else {
                                arg1.field2142 = -1;
                            }
                        }
                        arg1.field2165 = arg1.field2113 + 1;
                        if (var5.field3242.length <= arg1.field2165) {
                            if (var3.field3263) {
                                arg1.field2165 -= var5.field3244;
                                if (var5.field3252 <= arg1.field2124 + 1) {
                                    arg1.field2165 = -1;
                                } else if (arg1.field2165 < 0 || arg1.field2165 >= var5.field3242.length) {
                                    arg1.field2165 = -1;
                                }
                            } else {
                                arg1.field2165 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field2148 != -1 && arg1.field2151 <= 1) {
            class233 var6 = class73.method597(arg1.field2148, -1);
            if (var6.field3247 == 3) {
                if (arg1.field2198 > 0 && class231.field3179 >= arg1.field2172 && arg1.field2115 < class231.field3179) {
                    arg1.field2148 = -1;
                }
            } else if (var6.field3247 == 1 && arg1.field2198 > 0 && class231.field3179 >= arg1.field2172 && class231.field3179 > arg1.field2115) {
                arg1.field2151 = 2;
            }
        }
        if (arg1.field2148 != -1 && arg1.field2151 == 0) {
            class233 var7 = class73.method597(arg1.field2148, -1);
            if (var7 == null || var7.field3242 == null) {
                arg1.field2148 = -1;
            } else {
                arg1.field2132++;
                if (var7.field3242.length > arg1.field2144 && var7.field3248[arg1.field2144] < arg1.field2132) {
                    arg1.field2144++;
                    arg1.field2132 = 1;
                    class379.method2476(arg1.field2144, false, class383.field5609 == arg1, arg1.field5930, var7, arg1.field5921);
                }
                if (var7.field3242.length <= arg1.field2144) {
                    arg1.field2144 -= var7.field3244;
                    arg1.field2173++;
                    if (arg1.field2173 >= var7.field3252) {
                        arg1.field2148 = -1;
                    } else if (arg1.field2144 >= 0 && arg1.field2144 < var7.field3242.length) {
                        class379.method2476(arg1.field2144, false, class383.field5609 == arg1, arg1.field5930, var7, arg1.field5921);
                    } else {
                        arg1.field2148 = -1;
                    }
                }
                arg1.field2161 = arg1.field2144 + 1;
                if (arg1.field2161 >= var7.field3242.length) {
                    arg1.field2161 -= var7.field3244;
                    if ((arg1.field2173 + 1) >= var7.field3252) {
                        arg1.field2161 = -1;
                    } else if (arg1.field2161 < 0 || arg1.field2161 >= var7.field3242.length) {
                        arg1.field2161 = -1;
                    }
                }
                arg1.field2157 = var7.field3249;
            }
        }
        if (arg1.field2151 > 0) {
            arg1.field2151--;
        }
        for (int var8 = 0; var8 < arg1.field2120.length; var8++) {
            class239 var9 = arg1.field2120[var8];
            if (var9 != null) {
                if (var9.field3355 > 0) {
                    var9.field3355--;
                } else {
                    class233 var10 = class73.method597(var9.field3350, arg0);
                    if (var10 == null || var10.field3242 == null) {
                        arg1.field2120[var8] = null;
                    } else {
                        var9.field3349++;
                        if (var10.field3242.length > var9.field3354 && var10.field3248[var9.field3354] < var9.field3349) {
                            var9.field3354++;
                            var9.field3349 = 1;
                            class379.method2476(var9.field3354, false, class383.field5609 == arg1, arg1.field5930, var10, arg1.field5921);
                        }
                        if (var9.field3354 >= var10.field3242.length) {
                            var9.field3353++;
                            var9.field3354 -= var10.field3244;
                            if (var10.field3252 <= var9.field3353) {
                                arg1.field2120[var8] = null;
                            } else if (var9.field3354 >= 0 && var10.field3242.length > var9.field3354) {
                                class379.method2476(var9.field3354, false, class383.field5609 == arg1, arg1.field5930, var10, arg1.field5921);
                            } else {
                                arg1.field2120[var8] = null;
                            }
                        }
                        var9.field3351 = var9.field3354 + 1;
                        if (var10.field3242.length <= var9.field3351) {
                            var9.field3351 -= var10.field3244;
                            if (var10.field3252 <= var9.field3353 + 1) {
                                var9.field3351 = -1;
                            } else if (var9.field3351 < 0 || var10.field3242.length <= var9.field3351) {
                                var9.field3351 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(ILlk;II)J", line = 331)
    public static final long method979(int arg0, class56 arg1, int arg2, int arg3) {
        field1795++;
        long var4 = 4194304L;
        long var6 = 2147483648L;
        long var8 = Long.MIN_VALUE;
        class212 var10 = class372.method2447(arg1.method116(24186), (byte) -118);
        if (arg2 != 25632) {
            return -30L;
        }
        long var11 = (long) (arg1.method122((byte) -112) | 0x10000 << 14 | arg0 | arg3 << 7 | arg1.method121(28024) << 20);
        if (var10.field2932 == 0) {
            var11 |= var8;
        }
        if (var10.field2901 == 1) {
            var11 |= var4;
        }
        if (var10.field2909) {
            var11 |= var6;
        }
        return var11 | (long) arg1.method116(24186) << 32;
    }

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "(II)V", line = 366)
    public static final void method980(int arg0, int arg1) {
        if (arg0 >= -48) {
            method979(-21, (class56) null, -31, 119);
        }
        field1799++;
        class425 var2 = class410.field5954;
        synchronized (class410.field5954) {
            class298.field4499 = arg1;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(B)V", line = 384)
    public static void method981(byte arg0) {
        if (arg0 >= -86) {
            field1797 = null;
        }
        field1797 = null;
    }
}
