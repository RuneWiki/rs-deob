import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class245 {

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "I")
    public int field3463;

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "I")
    public int field3467;

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "Lwg;")
    public class245 field3468;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "Lic;")
    public class417 field3459;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "S")
    public static short field3458 = 1;

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field3464 = new String[100];

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
    public int field3456;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
    public int field3457;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
    public static int field3460;

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "I")
    public int field3465;

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)V", line = 8)
    public static void method1657(byte arg0) {
        field3464 = null;
        int var1 = -64 / ((arg0 + 35) / 58);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)I", line = 18)
    public static final int method1658(int arg0, int arg1) {
        field3462++;
        int var2 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
        int var3 = (var2 >>> 2 & 0xF3333333) + (var2 & 0x33333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        if (arg1 >= -46) {
            field3458 = 127;
        }
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILoo;)V", line = 36)
    public static final void method1659(int arg0, class374 arg1) {
        if (arg0 != -19579) {
            method1660((byte[]) null, -17, 64, false);
        }
        arg1.field5283 = false;
        field3461++;
        if (arg1.field5297 != -1) {
            class411 var2 = class108.method761((byte) -82, arg1.field5297);
            if (var2 == null || var2.field5824 == null) {
                arg1.field5297 = -1;
                arg1.field5280 = false;
            } else {
                label304: {
                    arg1.field5256++;
                    if (arg1.field5273 < var2.field5824.length && arg1.field5256 > var2.field5819[arg1.field5273]) {
                        arg1.field5273++;
                        arg1.field5270++;
                        arg1.field5256 = 1;
                        class431.method2721(arg1.field6266, arg1.field6262, var2, arg0 + 19555, class412.field5841 == arg1, arg1.field5273);
                    }
                    if (arg1.field5273 >= var2.field5824.length) {
                        arg1.field5273 = 0;
                        arg1.field5256 = 0;
                        if (arg1.field5280) {
                            arg1.field5297 = arg1.method2388(64).method2698(-70);
                            if (arg1.field5297 == -1) {
                                arg1.field5280 = false;
                                break label304;
                            }
                            var2 = class108.method761((byte) -82, arg1.field5297);
                        }
                        class431.method2721(arg1.field6266, arg1.field6262, var2, -101, class412.field5841 == arg1, arg1.field5273);
                    }
                    arg1.field5270 = arg1.field5273 + 1;
                    if (var2.field5824.length <= arg1.field5270) {
                        arg1.field5270 = 0;
                    }
                }
            }
        }
        if (arg1.field5300 != -1 && arg1.field5320 <= class276.field3837) {
            class80 var3 = class393.method2484(arg1.field5300, -102);
            int var4 = var3.field1125;
            if (var4 == -1) {
                arg1.field5300 = -1;
            } else {
                label306: {
                    class411 var5 = class108.method761((byte) -82, var4);
                    if (var3.field1144) {
                        if (var5.field5820 == 3) {
                            if (arg1.field5328 > 0 && class276.field3837 >= arg1.field5293 && class276.field3837 > arg1.field5265) {
                                arg1.field5300 = -1;
                                break label306;
                            }
                        } else if (var5.field5820 == 1 && arg1.field5328 > 0 && class276.field3837 >= arg1.field5293 && arg1.field5265 < class276.field3837) {
                            arg1.field5320 = class276.field3837 + 1;
                            break label306;
                        }
                    }
                    if (var5 == null || var5.field5824 == null) {
                        arg1.field5300 = -1;
                    } else {
                        if (arg1.field5295 < 0) {
                            arg1.field5295 = 0;
                            class431.method2721(arg1.field6266, arg1.field6262, var5, 127, class412.field5841 == arg1, 0);
                        }
                        arg1.field5257++;
                        if (arg1.field5295 < var5.field5824.length && arg1.field5257 > var5.field5819[arg1.field5295]) {
                            arg1.field5257 = 1;
                            arg1.field5295++;
                            class431.method2721(arg1.field6266, arg1.field6262, var5, -92, class412.field5841 == arg1, arg1.field5295);
                        }
                        if (var5.field5824.length <= arg1.field5295) {
                            if (var3.field1144) {
                                arg1.field5287++;
                                arg1.field5295 -= var5.field5835;
                                if (var5.field5822 <= arg1.field5287) {
                                    arg1.field5300 = -1;
                                } else if (arg1.field5295 >= 0 && arg1.field5295 < var5.field5824.length) {
                                    class431.method2721(arg1.field6266, arg1.field6262, var5, arg0 ^ 0xFFFFB3E3, class412.field5841 == arg1, arg1.field5295);
                                } else {
                                    arg1.field5300 = -1;
                                }
                            } else {
                                arg1.field5300 = -1;
                            }
                        }
                        arg1.field5316 = arg1.field5295 + 1;
                        if (arg1.field5316 >= var5.field5824.length) {
                            if (var3.field1144) {
                                arg1.field5316 -= var5.field5835;
                                if (var5.field5822 <= arg1.field5287 + 1) {
                                    arg1.field5316 = -1;
                                } else if (arg1.field5316 < 0 || arg1.field5316 >= var5.field5824.length) {
                                    arg1.field5316 = -1;
                                }
                            } else {
                                arg1.field5316 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field5264 != -1 && arg1.field5251 <= 1) {
            class411 var6 = class108.method761((byte) -82, arg1.field5264);
            if (var6.field5820 == 3) {
                if (arg1.field5328 > 0 && arg1.field5293 <= class276.field3837 && class276.field3837 > arg1.field5265) {
                    arg1.field5264 = -1;
                }
            } else if (var6.field5820 == 1 && arg1.field5328 > 0 && class276.field3837 >= arg1.field5293 && class276.field3837 > arg1.field5265) {
                arg1.field5251 = 2;
            }
        }
        if (arg1.field5264 != -1 && arg1.field5251 == 0) {
            class411 var7 = class108.method761((byte) -82, arg1.field5264);
            if (var7 == null || var7.field5824 == null) {
                arg1.field5264 = -1;
            } else {
                arg1.field5255++;
                if (var7.field5824.length > arg1.field5319 && var7.field5819[arg1.field5319] < arg1.field5255) {
                    arg1.field5255 = 1;
                    arg1.field5319++;
                    class431.method2721(arg1.field6266, arg1.field6262, var7, 95, class412.field5841 == arg1, arg1.field5319);
                }
                if (var7.field5824.length <= arg1.field5319) {
                    arg1.field5250++;
                    arg1.field5319 -= var7.field5835;
                    if (var7.field5822 <= arg1.field5250) {
                        arg1.field5264 = -1;
                    } else if (arg1.field5319 >= 0 && var7.field5824.length > arg1.field5319) {
                        class431.method2721(arg1.field6266, arg1.field6262, var7, -105, class412.field5841 == arg1, arg1.field5319);
                    } else {
                        arg1.field5264 = -1;
                    }
                }
                arg1.field5266 = arg1.field5319 + 1;
                if (arg1.field5266 >= var7.field5824.length) {
                    arg1.field5266 -= var7.field5835;
                    if (var7.field5822 <= arg1.field5250 + 1) {
                        arg1.field5266 = -1;
                    } else if (arg1.field5266 < 0 || arg1.field5266 >= var7.field5824.length) {
                        arg1.field5266 = -1;
                    }
                }
                arg1.field5283 = var7.field5830;
            }
        }
        if (arg1.field5251 > 0) {
            arg1.field5251--;
        }
        for (int var8 = 0; var8 < arg1.field5296.length; var8++) {
            class66 var9 = arg1.field5296[var8];
            if (var9 != null) {
                if (var9.field985 > 0) {
                    var9.field985--;
                } else {
                    class411 var10 = class108.method761((byte) -82, var9.field980);
                    if (var10 == null || var10.field5824 == null) {
                        arg1.field5296[var8] = null;
                    } else {
                        var9.field973++;
                        if (var10.field5824.length > var9.field982 && var10.field5819[var9.field982] < var9.field973) {
                            var9.field982++;
                            var9.field973 = 1;
                            class431.method2721(arg1.field6266, arg1.field6262, var10, -35, class412.field5841 == arg1, var9.field982);
                        }
                        if (var10.field5824.length <= var9.field982) {
                            var9.field979++;
                            var9.field982 -= var10.field5835;
                            if (var9.field979 >= var10.field5822) {
                                arg1.field5296[var8] = null;
                            } else if (var9.field982 >= 0 && var9.field982 < var10.field5824.length) {
                                class431.method2721(arg1.field6266, arg1.field6262, var10, 105, class412.field5841 == arg1, var9.field982);
                            } else {
                                arg1.field5296[var8] = null;
                            }
                        }
                        var9.field975 = var9.field982 + 1;
                        if (var10.field5824.length <= var9.field975) {
                            var9.field975 -= var10.field5835;
                            if (var9.field979 + 1 >= var10.field5822) {
                                var9.field975 = -1;
                            } else if (var9.field975 < 0 || var9.field975 >= var10.field5824.length) {
                                var9.field975 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "([BIIZ)Z", line = 356)
    public static final boolean method1660(byte[] arg0, int arg1, int arg2, boolean arg3) {
        field3466++;
        boolean var4 = arg3;
        class11 var5 = new class11(arg0);
        int var6 = -1;
        label68: while (true) {
            int var7 = var5.method180(arg3);
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                int var13;
                class64 var16;
                do {
                    int var14;
                    int var15;
                    do {
                        do {
                            do {
                                do {
                                    while (var9) {
                                        int var17 = var5.method175(255);
                                        if (var17 == 0) {
                                            continue label68;
                                        }
                                        var5.method172((byte) 52);
                                    }
                                    int var10 = var5.method175(255);
                                    if (var10 == 0) {
                                        continue label68;
                                    }
                                    var8 += var10 - 1;
                                    int var11 = var8 & 0x3F;
                                    int var12 = var8 >> 6 & 0x3F;
                                    var13 = var5.method172((byte) 52) >> 2;
                                    var14 = arg1 + var12;
                                    var15 = var11 + arg2;
                                } while (var14 <= 0);
                            } while (var15 <= 0);
                        } while (class211.field2954 - 1 <= var14);
                    } while (class290.field4061 - 1 <= var15);
                    var16 = class375.method2395((byte) 110, var6);
                } while (var13 == 22 && !class154.field2169 && var16.field922 == 0 && var16.field906 != 1 && !var16.field955);
                var9 = true;
                if (!var16.method492((byte) -125)) {
                    var4 = false;
                    class279.field3919++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(II)V", line = 446)
    public class245(int arg0, int arg1) {
        this.field3463 = arg0;
        this.field3467 = arg1;
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Lwg;I)V", line = 457)
    public class245(class245 arg0, int arg1) {
        this.field3468 = arg0;
        this.field3459 = this.field3468.field3459;
        this.field3463 = this.field3468.field3463;
        this.field3467 = this.field3468.field3467 + arg1;
    }
}
