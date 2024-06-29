import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class395 extends class168 {

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "I")
    public static int field5623;

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "I")
    public static int field5624;

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "I")
    public static int field5625;

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "I")
    public static int field5626;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(II)V", line = 5)
    public static final void method2382(int arg0, int arg1) {
        field5625++;
        class275 var2 = class213.method1433((byte) 102, 8, arg0);
        var2.method1774((byte) -43);
        if (arg1 > 89) {
            ;
        }
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(II)V", line = 18)
    public static final void method2383(int arg0, int arg1) {
        field5624++;
        int var2 = class24.field349 - class45.field885;
        if (var2 >= 100) {
            class294.field4381 = 1;
            return;
        }
        int var3 = (int) class524.field7655;
        if ((class463.field6717 >> 8) > var3) {
            var3 = class463.field6717 >> 8;
        }
        if (class172.field2551[4] && var3 < class77.field1260[4] + 128) {
            var3 = class77.field1260[4] + 128;
        }
        int var4 = (int) class508.field7354 + class505.field7304 & 0x3FFF;
        class77.method590(-105, class486.field7048, class78.field1279, class224.method1515(class364.field5293.field6961, class364.field5293.field6965, class123.field1944, -631749433) - 50, arg1, var3, var4, (var3 >> 3) * 3 + 600 << 0);
        float var5 = 1.0F - (float) ((100 - var2) * (100 - var2) * (100 - var2)) / 1000000.0F;
        class254.field3756 = (int) ((float) (class254.field3756 - class203.field3134) * var5 + (float) class203.field3134);
        class315.field4688 = (int) ((float) (class315.field4688 - class84.field1332) * var5 + (float) class84.field1332);
        class397.field5649 = (int) ((float) (class397.field5649 - class459.field6657) * var5 + (float) class459.field6657);
        class62.field1086 = (int) ((float) (class62.field1086 - class412.field5836) * var5 + (float) class412.field5836);
        int var6 = class171.field2548 - class8.field58;
        if (var6 > 8192) {
            var6 -= 16384;
        } else if (var6 < -8192) {
            var6 += 16384;
        }
        class171.field2548 = (int) ((float) var6 * var5 + (float) class8.field58);
        class171.field2548 &= 0x3FFF;
        if (arg0 >= -48) {
            method2383(-97, 91);
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(B)V", line = 68)
    public static final void method2384(byte arg0) {
        if (arg0 < 84) {
            method2385(null, 51);
        }
        field5626++;
        class345.field5086 = new class118();
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Luc;I)V", line = 84)
    public static final void method2385(class23 arg0, int arg1) {
        arg0.field245 = 0;
        field5623++;
        if (arg0.field248 != -1) {
            class183 var2 = class96.field1526.method2717(arg1 ^ 0x4089, arg0.field248);
            if (var2 == null || var2.field2692 == null) {
                arg0.field240 = false;
                arg0.field248 = -1;
            } else {
                label404: {
                    arg0.field234++;
                    if (arg0.field256 < var2.field2692.length && var2.field2713[arg0.field256] < arg0.field234) {
                        arg0.field316++;
                        arg0.field234 = 1;
                        arg0.field256++;
                        class511.method2983(arg0.field6961, arg0.field256, arg0.field6965, -64, class364.field5293 == arg0, var2, arg0.field6956);
                    }
                    if (var2.field2692.length <= arg0.field256) {
                        arg0.field256 = 0;
                        arg0.field234 = 0;
                        if (arg0.field240) {
                            arg0.field248 = arg0.method139((byte) 122).method1563(0);
                            if (arg0.field248 == -1) {
                                arg0.field240 = false;
                                break label404;
                            }
                            var2 = class96.field1526.method2717(-102, arg0.field248);
                        }
                        class511.method2983(arg0.field6961, arg0.field256, arg0.field6965, -64, class364.field5293 == arg0, var2, arg0.field6956);
                    }
                    arg0.field316 = arg0.field256 + 1;
                    if (var2.field2692.length <= arg0.field316) {
                        arg0.field316 = 0;
                    }
                }
            }
        }
        if (arg0.field286 != -1 && class24.field349 >= arg0.field289) {
            class394 var3 = class69.field1133.method1312(arg0.field286, (byte) -39);
            int var4 = var3.field5596;
            if (var4 == -1) {
                arg0.field286 = -1;
            } else {
                label406: {
                    class183 var5 = class96.field1526.method2717(-100, var4);
                    if (var3.field5607) {
                        if (var5.field2704 == 3) {
                            if (arg0.field335 > 0 && class24.field349 >= arg0.field308 && class24.field349 > arg0.field314) {
                                arg0.field286 = -1;
                                break label406;
                            }
                        } else if (var5.field2704 == 1 && arg0.field335 > 0 && class24.field349 >= arg0.field308 && arg0.field314 < class24.field349) {
                            arg0.field289 = class24.field349 + 1;
                            break label406;
                        }
                    }
                    if (var5 == null || var5.field2692 == null) {
                        arg0.field286 = -1;
                    } else {
                        if (arg0.field283 < 0) {
                            arg0.field283 = 0;
                            class511.method2983(arg0.field6961, 0, arg0.field6965, -64, class364.field5293 == arg0, var5, arg0.field6956);
                        }
                        arg0.field255++;
                        if (var5.field2692.length > arg0.field283 && arg0.field255 > var5.field2713[arg0.field283]) {
                            arg0.field283++;
                            arg0.field255 = 1;
                            class511.method2983(arg0.field6961, arg0.field283, arg0.field6965, arg1 ^ 0x40E9, class364.field5293 == arg0, var5, arg0.field6956);
                        }
                        if (arg0.field283 >= var5.field2692.length) {
                            if (var3.field5607) {
                                arg0.field252++;
                                arg0.field283 -= var5.field2691;
                                if (var5.field2712 <= arg0.field252) {
                                    arg0.field286 = -1;
                                } else if (arg0.field283 >= 0 && arg0.field283 < var5.field2692.length) {
                                    class511.method2983(arg0.field6961, arg0.field283, arg0.field6965, -64, class364.field5293 == arg0, var5, arg0.field6956);
                                } else {
                                    arg0.field286 = -1;
                                }
                            } else {
                                arg0.field286 = -1;
                            }
                        }
                        arg0.field293 = arg0.field283 + 1;
                        if (var5.field2692.length <= arg0.field293) {
                            if (var3.field5607) {
                                arg0.field293 -= var5.field2691;
                                if ((arg0.field252 + 1) >= var5.field2712) {
                                    arg0.field293 = -1;
                                } else if (arg0.field293 < 0 || var5.field2692.length <= arg0.field293) {
                                    arg0.field293 = -1;
                                }
                            } else {
                                arg0.field293 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1 != -16599) {
            return;
        }
        if (arg0.field250 != -1 && class24.field349 >= arg0.field311) {
            class394 var6 = class69.field1133.method1312(arg0.field250, (byte) -39);
            int var7 = var6.field5596;
            if (var7 == -1) {
                arg0.field250 = -1;
            } else {
                label409: {
                    class183 var8 = class96.field1526.method2717(-115, var7);
                    if (var6.field5607) {
                        if (var8.field2704 == 3) {
                            if (arg0.field335 > 0 && arg0.field308 <= class24.field349 && class24.field349 > arg0.field314) {
                                arg0.field250 = -1;
                                break label409;
                            }
                        } else if (var8.field2704 == 1 && arg0.field335 > 0 && class24.field349 >= arg0.field308 && class24.field349 > arg0.field314) {
                            arg0.field311 = class24.field349 + 1;
                            break label409;
                        }
                    }
                    if (var8 == null || var8.field2692 == null) {
                        arg0.field250 = -1;
                    } else {
                        if (arg0.field259 < 0) {
                            arg0.field259 = 0;
                            class511.method2983(arg0.field6961, 0, arg0.field6965, arg1 + 16535, class364.field5293 == arg0, var8, arg0.field6956);
                        }
                        arg0.field309++;
                        if (arg0.field259 < var8.field2692.length && arg0.field309 > var8.field2713[arg0.field259]) {
                            arg0.field309 = 1;
                            arg0.field259++;
                            class511.method2983(arg0.field6961, arg0.field259, arg0.field6965, arg1 + 16535, class364.field5293 == arg0, var8, arg0.field6956);
                        }
                        if (var8.field2692.length <= arg0.field259) {
                            if (var6.field5607) {
                                arg0.field284++;
                                arg0.field259 -= var8.field2691;
                                if (var8.field2712 <= arg0.field284) {
                                    arg0.field250 = -1;
                                } else if (arg0.field259 >= 0 && arg0.field259 < var8.field2692.length) {
                                    class511.method2983(arg0.field6961, arg0.field259, arg0.field6965, -64, class364.field5293 == arg0, var8, arg0.field6956);
                                } else {
                                    arg0.field250 = -1;
                                }
                            } else {
                                arg0.field250 = -1;
                            }
                        }
                        arg0.field262 = arg0.field259 + 1;
                        if (arg0.field262 >= var8.field2692.length) {
                            if (var6.field5607) {
                                arg0.field262 -= var8.field2691;
                                if (arg0.field284 + 1 >= var8.field2712) {
                                    arg0.field262 = -1;
                                } else if (arg0.field262 < 0 || var8.field2692.length <= arg0.field262) {
                                    arg0.field262 = -1;
                                }
                            } else {
                                arg0.field262 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg0.field274 != -1 && arg0.field261 <= 1) {
            class183 var9 = class96.field1526.method2717(arg1 + 16491, arg0.field274);
            if (var9.field2704 == 3) {
                if (arg0.field335 > 0 && arg0.field308 <= class24.field349 && arg0.field314 < class24.field349) {
                    arg0.field274 = -1;
                }
            } else if (var9.field2704 == 1 && arg0.field335 > 0 && arg0.field308 <= class24.field349 && arg0.field314 < class24.field349) {
                arg0.field261 = 2;
            }
        }
        if (arg0.field274 != -1 && arg0.field261 == 0) {
            class183 var10 = class96.field1526.method2717(arg1 + 16472, arg0.field274);
            if (var10 == null || var10.field2692 == null) {
                arg0.field274 = -1;
            } else {
                arg0.field243++;
                if (var10.field2692.length > arg0.field320 && arg0.field243 > var10.field2713[arg0.field320]) {
                    arg0.field320++;
                    arg0.field243 = 1;
                    class511.method2983(arg0.field6961, arg0.field320, arg0.field6965, -64, class364.field5293 == arg0, var10, arg0.field6956);
                }
                if (arg0.field320 >= var10.field2692.length) {
                    arg0.field269++;
                    arg0.field320 -= var10.field2691;
                    if (arg0.field269 >= var10.field2712) {
                        arg0.field274 = -1;
                    } else if (arg0.field320 >= 0 && var10.field2692.length > arg0.field320) {
                        class511.method2983(arg0.field6961, arg0.field320, arg0.field6965, arg1 ^ 0x40E9, class364.field5293 == arg0, var10, arg0.field6956);
                    } else {
                        arg0.field274 = -1;
                    }
                }
                arg0.field251 = arg0.field320 + 1;
                if (var10.field2692.length <= arg0.field251) {
                    arg0.field251 -= var10.field2691;
                    if (var10.field2712 <= arg0.field269 + 1) {
                        arg0.field251 = -1;
                    } else if (arg0.field251 < 0 || arg0.field251 >= var10.field2692.length) {
                        arg0.field251 = -1;
                    }
                }
                arg0.field245 = var10.field2701;
            }
        }
        if (arg0.field261 > 0) {
            arg0.field261--;
        }
        for (int var11 = 0; var11 < arg0.field313.length; var11++) {
            class490 var12 = arg0.field313[var11];
            if (var12 != null) {
                if (var12.field7065 > 0) {
                    var12.field7065--;
                } else {
                    class183 var13 = class96.field1526.method2717(-95, var12.field7066);
                    if (var13 == null || var13.field2692 == null) {
                        arg0.field313[var11] = null;
                    } else {
                        var12.field7067++;
                        if (var12.field7061 < var13.field2692.length && var13.field2713[var12.field7061] < var12.field7067) {
                            var12.field7061++;
                            var12.field7067 = 1;
                            class511.method2983(arg0.field6961, var12.field7061, arg0.field6965, -64, class364.field5293 == arg0, var13, arg0.field6956);
                        }
                        if (var12.field7061 >= var13.field2692.length) {
                            var12.field7063++;
                            var12.field7061 -= var13.field2691;
                            if (var12.field7063 >= var13.field2712) {
                                arg0.field313[var11] = null;
                            } else if (var12.field7061 >= 0 && var12.field7061 < var13.field2692.length) {
                                class511.method2983(arg0.field6961, var12.field7061, arg0.field6965, -64, class364.field5293 == arg0, var13, arg0.field6956);
                            } else {
                                arg0.field313[var11] = null;
                            }
                        }
                        var12.field7062 = var12.field7061 + 1;
                        if (var13.field2692.length <= var12.field7062) {
                            var12.field7062 -= var13.field2691;
                            if ((var12.field7063 + 1) >= var13.field2712) {
                                var12.field7062 = -1;
                            } else if (var12.field7062 < 0 || var12.field7062 >= var13.field2692.length) {
                                var12.field7062 = -1;
                            }
                        }
                    }
                }
            }
        }
    }
}
