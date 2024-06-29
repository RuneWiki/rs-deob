import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class437 {

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
    public int field6476 = 0;

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "I")
    public int field6483 = 2048;

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "I")
    public int field6484 = 2048;

    @OriginalMember(owner = "client!oh", name = "l", descriptor = "I")
    public int field6486 = 0;

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "Lsi;")
    public static class512 field6485 = new class512(0, 7);

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "I")
    public static int field6475;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
    public static int field6477;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "I")
    public static int field6479;

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "I")
    public static int field6480;

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "I")
    public static int field6481;

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "I")
    public static int field6482;

    // $FF: synthetic field
    @OriginalMember(owner = "client!oh", name = "m", descriptor = "Ljava/lang/Class;")
    public static Class field6487;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "Z")
    public static boolean field6478;

    // $FF: synthetic method
    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2618(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILtl;B)V", line = 5)
    private final void method2610(int arg0, class91 arg1, byte arg2) {
        field6482++;
        if (arg2 != 4) {
            return;
        }
        if (arg0 == 1) {
            this.field6486 = arg1.method618((byte) 100);
        } else if (arg0 == 2) {
            this.field6484 = arg1.method631(10494);
        } else if (arg0 == 3) {
            this.field6483 = arg1.method631(10494);
        } else if (arg0 == 4) {
            this.field6476 = arg1.method643((byte) 115);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)I", line = 34)
    public static final int method2611(int arg0, int arg1) {
        return class482.field7024 == null ? 0 : class482.field7024[arg0][arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILtl;)V", line = 38)
    public final void method2612(int arg0, class91 arg1) {
        field6479++;
        while (true) {
            int var3 = arg1.method618((byte) 100);
            if (var3 == 0) {
                if (arg0 == 0) {
                    return;
                } else {
                    this.field6476 = 113;
                    return;
                }
            }
            this.method2610(var3, arg1, (byte) 4);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)V", line = 59)
    public static void method2613(byte arg0) {
        field6485 = null;
        if (arg0 <= 82) {
            method2614(111, -62, -113, -48, 109, -127, -108);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIIIII)V", line = 69)
    public static final void method2614(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class406.field6135 = arg6;
        class169.field2463 = arg5;
        class199.field2806 = arg2;
        if (arg3 != 13265) {
            method2613((byte) 85);
        }
        field6481++;
        class216.field2997 = arg0;
        class327.field5010 = arg4;
        class163.field2388 = arg1;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lap;B)V", line = 87)
    public static final void method2615(class337 arg0, byte arg1) {
        if (arg1 <= 88) {
            field6478 = false;
        }
        arg0.field5284 = false;
        field6480++;
        if (arg0.field5253 != -1) {
            class270 var2 = class260.field3621.method1934(115, arg0.field5253);
            if (var2 == null || var2.field3765 == null) {
                arg0.field5253 = -1;
                arg0.field5294 = false;
            } else {
                label401: {
                    arg0.field5314++;
                    if (arg0.field5246 < var2.field3765.length && var2.field3746[arg0.field5246] < arg0.field5314) {
                        arg0.field5314 = 1;
                        arg0.field5265++;
                        arg0.field5246++;
                        class445.method2678(class339.field5365 == arg0, arg0.field5246, arg0.field2210, var2, arg0.field2217, (byte) 76, arg0.field2215);
                    }
                    if (arg0.field5246 >= var2.field3765.length) {
                        arg0.field5246 = 0;
                        arg0.field5314 = 0;
                        if (arg0.field5294) {
                            arg0.field5253 = arg0.method2181(0).method1480((byte) -10);
                            if (arg0.field5253 == -1) {
                                arg0.field5294 = false;
                                break label401;
                            }
                            var2 = class260.field3621.method1934(126, arg0.field5253);
                        }
                        class445.method2678(class339.field5365 == arg0, arg0.field5246, arg0.field2210, var2, arg0.field2217, (byte) -123, arg0.field2215);
                    }
                    arg0.field5265 = arg0.field5246 + 1;
                    if (var2.field3765.length <= arg0.field5265) {
                        arg0.field5265 = 0;
                    }
                }
            }
        }
        if (arg0.field5304 != -1 && arg0.field5295 <= class405.field6116) {
            class372 var3 = class275.field3826.method108(arg0.field5304, 0);
            int var4 = var3.field5705;
            if (var4 == -1) {
                arg0.field5304 = -1;
            } else {
                label403: {
                    class270 var5 = class260.field3621.method1934(118, var4);
                    if (var3.field5723) {
                        if (var5.field3754 == 3) {
                            if (arg0.field5338 > 0 && arg0.field5285 <= class405.field6116 && class405.field6116 > arg0.field5264) {
                                arg0.field5304 = -1;
                                break label403;
                            }
                        } else if (var5.field3754 == 1 && arg0.field5338 > 0 && arg0.field5285 <= class405.field6116 && class405.field6116 > arg0.field5264) {
                            arg0.field5295 = class405.field6116 + 1;
                            break label403;
                        }
                    }
                    if (var5 == null || var5.field3765 == null) {
                        arg0.field5304 = -1;
                    } else {
                        if (arg0.field5258 < 0) {
                            arg0.field5258 = 0;
                            class445.method2678(class339.field5365 == arg0, 0, arg0.field2210, var5, arg0.field2217, (byte) 98, arg0.field2215);
                        }
                        arg0.field5321++;
                        if (arg0.field5258 < var5.field3765.length && var5.field3746[arg0.field5258] < arg0.field5321) {
                            arg0.field5258++;
                            arg0.field5321 = 1;
                            class445.method2678(class339.field5365 == arg0, arg0.field5258, arg0.field2210, var5, arg0.field2217, (byte) 30, arg0.field2215);
                        }
                        if (arg0.field5258 >= var5.field3765.length) {
                            if (var3.field5723) {
                                arg0.field5311++;
                                arg0.field5258 -= var5.field3737;
                                if (var5.field3758 <= arg0.field5311) {
                                    arg0.field5304 = -1;
                                } else if (arg0.field5258 >= 0 && var5.field3765.length > arg0.field5258) {
                                    class445.method2678(class339.field5365 == arg0, arg0.field5258, arg0.field2210, var5, arg0.field2217, (byte) 100, arg0.field2215);
                                } else {
                                    arg0.field5304 = -1;
                                }
                            } else {
                                arg0.field5304 = -1;
                            }
                        }
                        arg0.field5302 = arg0.field5258 + 1;
                        if (arg0.field5302 >= var5.field3765.length) {
                            if (var3.field5723) {
                                arg0.field5302 -= var5.field3737;
                                if ((arg0.field5311 + 1) >= var5.field3758) {
                                    arg0.field5302 = -1;
                                } else if (arg0.field5302 < 0 || arg0.field5302 >= var5.field3765.length) {
                                    arg0.field5302 = -1;
                                }
                            } else {
                                arg0.field5302 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg0.field5260 != -1 && class405.field6116 >= arg0.field5277) {
            class372 var6 = class275.field3826.method108(arg0.field5260, 0);
            int var7 = var6.field5705;
            if (var7 == -1) {
                arg0.field5260 = -1;
            } else {
                label406: {
                    class270 var8 = class260.field3621.method1934(113, var7);
                    if (var6.field5723) {
                        if (var8.field3754 == 3) {
                            if (arg0.field5338 > 0 && class405.field6116 >= arg0.field5285 && arg0.field5264 < class405.field6116) {
                                arg0.field5260 = -1;
                                break label406;
                            }
                        } else if (var8.field3754 == 1 && arg0.field5338 > 0 && arg0.field5285 <= class405.field6116 && arg0.field5264 < class405.field6116) {
                            arg0.field5277 = class405.field6116 + 1;
                            break label406;
                        }
                    }
                    if (var8 == null || var8.field3765 == null) {
                        arg0.field5260 = -1;
                    } else {
                        if (arg0.field5308 < 0) {
                            arg0.field5308 = 0;
                            class445.method2678(class339.field5365 == arg0, 0, arg0.field2210, var8, arg0.field2217, (byte) 110, arg0.field2215);
                        }
                        arg0.field5313++;
                        if (arg0.field5308 < var8.field3765.length && var8.field3746[arg0.field5308] < arg0.field5313) {
                            arg0.field5308++;
                            arg0.field5313 = 1;
                            class445.method2678(class339.field5365 == arg0, arg0.field5308, arg0.field2210, var8, arg0.field2217, (byte) 119, arg0.field2215);
                        }
                        if (var8.field3765.length <= arg0.field5308) {
                            if (var6.field5723) {
                                arg0.field5244++;
                                arg0.field5308 -= var8.field3737;
                                if (arg0.field5244 >= var8.field3758) {
                                    arg0.field5260 = -1;
                                } else if (arg0.field5308 >= 0 && var8.field3765.length > arg0.field5308) {
                                    class445.method2678(class339.field5365 == arg0, arg0.field5308, arg0.field2210, var8, arg0.field2217, (byte) 25, arg0.field2215);
                                } else {
                                    arg0.field5260 = -1;
                                }
                            } else {
                                arg0.field5260 = -1;
                            }
                        }
                        arg0.field5279 = arg0.field5308 + 1;
                        if (arg0.field5279 >= var8.field3765.length) {
                            if (var6.field5723) {
                                arg0.field5279 -= var8.field3737;
                                if (var8.field3758 <= (arg0.field5244 + 1)) {
                                    arg0.field5279 = -1;
                                } else if (arg0.field5279 < 0 || arg0.field5279 >= var8.field3765.length) {
                                    arg0.field5279 = -1;
                                }
                            } else {
                                arg0.field5279 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg0.field5240 != -1 && arg0.field5301 <= 1) {
            class270 var9 = class260.field3621.method1934(115, arg0.field5240);
            if (var9.field3754 == 3) {
                if (arg0.field5338 > 0 && arg0.field5285 <= class405.field6116 && class405.field6116 > arg0.field5264) {
                    arg0.field5240 = -1;
                }
            } else if (var9.field3754 == 1 && arg0.field5338 > 0 && class405.field6116 >= arg0.field5285 && arg0.field5264 < class405.field6116) {
                arg0.field5301 = 2;
            }
        }
        if (arg0.field5240 != -1 && arg0.field5301 == 0) {
            class270 var10 = class260.field3621.method1934(122, arg0.field5240);
            if (var10 == null || var10.field3765 == null) {
                arg0.field5240 = -1;
            } else {
                arg0.field5256++;
                if (arg0.field5269 < var10.field3765.length && var10.field3746[arg0.field5269] < arg0.field5256) {
                    arg0.field5269++;
                    arg0.field5256 = 1;
                    class445.method2678(class339.field5365 == arg0, arg0.field5269, arg0.field2210, var10, arg0.field2217, (byte) -118, arg0.field2215);
                }
                if (arg0.field5269 >= var10.field3765.length) {
                    arg0.field5322++;
                    arg0.field5269 -= var10.field3737;
                    if (arg0.field5322 >= var10.field3758) {
                        arg0.field5240 = -1;
                    } else if (arg0.field5269 >= 0 && arg0.field5269 < var10.field3765.length) {
                        class445.method2678(class339.field5365 == arg0, arg0.field5269, arg0.field2210, var10, arg0.field2217, (byte) 117, arg0.field2215);
                    } else {
                        arg0.field5240 = -1;
                    }
                }
                arg0.field5266 = arg0.field5269 + 1;
                if (arg0.field5266 >= var10.field3765.length) {
                    arg0.field5266 -= var10.field3737;
                    if (arg0.field5322 + 1 >= var10.field3758) {
                        arg0.field5266 = -1;
                    } else if (arg0.field5266 < 0 || arg0.field5266 >= var10.field3765.length) {
                        arg0.field5266 = -1;
                    }
                }
                arg0.field5284 = var10.field3736;
            }
        }
        if (arg0.field5301 > 0) {
            arg0.field5301--;
        }
        for (int var11 = 0; var11 < arg0.field5288.length; var11++) {
            class113 var12 = arg0.field5288[var11];
            if (var12 != null) {
                if (var12.field1583 > 0) {
                    var12.field1583--;
                } else {
                    class270 var13 = class260.field3621.method1934(125, var12.field1587);
                    if (var13 == null || var13.field3765 == null) {
                        arg0.field5288[var11] = null;
                    } else {
                        var12.field1585++;
                        if (var12.field1579 < var13.field3765.length && var12.field1585 > var13.field3746[var12.field1579]) {
                            var12.field1585 = 1;
                            var12.field1579++;
                            class445.method2678(class339.field5365 == arg0, var12.field1579, arg0.field2210, var13, arg0.field2217, (byte) 93, arg0.field2215);
                        }
                        if (var13.field3765.length <= var12.field1579) {
                            var12.field1574++;
                            var12.field1579 -= var13.field3737;
                            if (var13.field3758 <= var12.field1574) {
                                arg0.field5288[var11] = null;
                            } else if (var12.field1579 >= 0 && var13.field3765.length > var12.field1579) {
                                class445.method2678(class339.field5365 == arg0, var12.field1579, arg0.field2210, var13, arg0.field2217, (byte) -128, arg0.field2215);
                            } else {
                                arg0.field5288[var11] = null;
                            }
                        }
                        var12.field1586 = var12.field1579 + 1;
                        if (var12.field1586 >= var13.field3765.length) {
                            var12.field1586 -= var13.field3737;
                            if (var13.field3758 <= (var12.field1574 + 1)) {
                                var12.field1586 = -1;
                            } else if (var12.field1586 < 0 || var12.field1586 >= var13.field3765.length) {
                                var12.field1586 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "()V", line = 519)
    public static final void method2616() {
        for (int var0 = 0; var0 < class309.field4630; var0++) {
            if (!class473.field6909[var0]) {
                class138 var1 = class515.field7632[var0];
                class471 var2 = var1.field2020;
                int var3 = var1.field2015;
                int var4 = var2.method2830(122) - class380.field5804;
                int var5 = (var4 * 2 >> class386.field5882) + 1;
                int var6 = 0;
                int[] var7 = new int[var5 * var5];
                int var8 = var2.method2827(23087) - var4 >> class386.field5882;
                int var9 = var2.method2832(15) - var4 >> class386.field5882;
                int var10 = var2.method2832(15) + var4 >> class386.field5882;
                if (var9 < 0) {
                    var6 -= var9;
                    var9 = 0;
                }
                if (var10 >= class285.field4248) {
                    var10 = class285.field4248 - 1;
                }
                for (int var11 = var9; var11 <= var10; var11++) {
                    short var12 = var1.field2010[var6];
                    int var13 = var12 >>> 8;
                    int var14 = var5 * var6 + var13;
                    int var15 = (var12 >>> 8) + var8;
                    int var16 = (var12 & 0xFF) + var15 - 1;
                    if (var15 < 0) {
                        var14 -= var15;
                        var15 = 0;
                    }
                    if (var16 >= class492.field7186) {
                        var16 = class492.field7186 - 1;
                    }
                    for (int var17 = var15; var17 <= var16; var17++) {
                        byte var18 = 1;
                        class153 var19 = class432.method2587(var3, var17, var11, field6487 == null ? (field6487 = method2618("vj")) : field6487);
                        if (var19 != null && var19.field2206 != 0) {
                            if (var19.field2206 == 1) {
                                boolean var20 = var17 - 1 >= var15;
                                boolean var21 = var17 + 1 <= var16;
                                if (!var20 && var11 + 1 <= var10) {
                                    short var22 = var1.field2010[var6 + 1];
                                    int var23 = (var22 >>> 8) + var8;
                                    int var24 = (var22 & 0xFF) + var23;
                                    var20 = var17 > var23 && var17 < var24;
                                }
                                if (!var21 && var11 - 1 >= var9) {
                                    short var25 = var1.field2010[var6 - 1];
                                    int var26 = (var25 >>> 8) + var8;
                                    int var27 = (var25 & 0xFF) + var26;
                                    var21 = var17 > var26 && var17 < var27;
                                }
                                if (var20 && !var21) {
                                    var18 = 4;
                                } else if (var21 && !var20) {
                                    var18 = 2;
                                }
                            } else {
                                boolean var28 = var17 - 1 >= var15;
                                boolean var29 = var17 + 1 <= var16;
                                if (!var28 && var11 - 1 >= var9) {
                                    short var30 = var1.field2010[var6 - 1];
                                    int var31 = (var30 >>> 8) + var8;
                                    int var32 = (var30 & 0xFF) + var31;
                                    var28 = var17 > var31 && var17 < var32;
                                }
                                if (!var29 && var11 + 1 <= var10) {
                                    short var33 = var1.field2010[var6 + 1];
                                    int var34 = (var33 >>> 8) + var8;
                                    int var35 = (var33 & 0xFF) + var34;
                                    var29 = var17 > var34 && var17 < var35;
                                }
                                if (var28 && !var29) {
                                    var18 = 3;
                                } else if (var29 && !var28) {
                                    var18 = 5;
                                }
                            }
                        }
                        var7[var14++] = var18;
                    }
                    var6++;
                }
                class473.field6909[var0] = true;
                class455.field6683[var3].method854(var2, var7);
            }
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Ltf;[[BI)V", line = 707)
    public static final void method2617(class167 arg0, byte[][] arg1, int arg2) {
        if (arg2 != 1) {
            field6477 = 48;
        }
        field6475++;
        int var3 = class310.field4643.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = arg1[var4];
            if (var5 != null) {
                int var6 = (class253.field3509[var4] >> 8) * 64 - class82.field1105;
                int var7 = (class253.field3509[var4] & 0xFF) * 64 - field6477;
                class300.method1929((byte) -4);
                arg0.method1173(var6, var7, class337.field5242, class444.field6605, var5, arg2 ^ 0xFFFFC00F);
            }
        }
    }
}
