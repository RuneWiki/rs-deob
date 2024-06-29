import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public abstract class class157 {

    @OriginalMember(owner = "client!r", name = "a", descriptor = "I")
    public static int field1906 = 0;

    @OriginalMember(owner = "client!r", name = "h", descriptor = "I")
    public static int field1913 = 0;

    @OriginalMember(owner = "client!r", name = "i", descriptor = "Ljr;")
    public static class92 field1914 = new class92("", 16);

    @OriginalMember(owner = "client!r", name = "m", descriptor = "Lvj;")
    public static class373 field1918 = new class373(46, -1);

    @OriginalMember(owner = "client!r", name = "o", descriptor = "[F")
    public static float[] field1920 = new float[4];

    @OriginalMember(owner = "client!r", name = "p", descriptor = "Z")
    public static boolean field1921 = false;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    public static int field1907;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "I")
    public static int field1909;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "I")
    public static int field1912;

    @OriginalMember(owner = "client!r", name = "j", descriptor = "I")
    public static int field1915;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!r", name = "n", descriptor = "I")
    public static int field1919;

    @OriginalMember(owner = "client!r", name = "l", descriptor = "J")
    public static long field1917;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BIC)I", line = 18)
    public static final int method860(byte arg0, int arg1, char arg2) {
        field1910++;
        int var3 = arg2 << 4;
        if (arg0 >= -119) {
            method868(false);
        }
        if (Character.isUpperCase(arg2) || Character.isTitleCase(arg2)) {
            arg2 = Character.toLowerCase(arg2);
            var3 = (arg2 << 4) + 1;
        }
        if (arg2 == 'ñ' && arg1 == 0) {
            var3 = 1762;
        }
        return var3;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIILsba;Lsba;ZII[I)V", line = 48)
    public final void method861(int arg0, int arg1, int arg2, int arg3, int arg4, class183 arg5, class183 arg6, boolean arg7, int arg8, int arg9, int[] arg10) {
        field1912++;
        if (arg4 == -1 || !this.method62()) {
            return;
        }
        class424 var12 = arg5.field2215[arg4];
        class147 var13 = var12.field5453;
        if (arg0 != -10766) {
            field1913 = -34;
        }
        class424 var14 = null;
        if (arg6 != null) {
            var14 = arg6.field2215[arg8];
            if (var14.field5453 != var13) {
                var14 = null;
            }
        }
        this.method869(arg3, var14, var12, arg1, null, arg10, false, arg2, arg9, arg7, (byte) -122, var13);
        this.method66();
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IZZI[IIIII[I)V", line = 88)
    private final void method862(int arg0, boolean arg1, boolean arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int[] arg9) {
        field1915++;
        if (arg1) {
            field1920 = null;
        }
        if (arg7 == 1) {
            if (arg0 == 0 || arg0 == 1) {
                int var16 = -arg8;
                arg8 = arg5;
                arg5 = var16;
            } else if (arg0 == 3) {
                int var15 = arg8;
                arg8 = arg5;
                arg5 = var15;
            } else if (arg0 == 2) {
                int var14 = arg8;
                arg8 = -arg5 & 0x3FFF;
                arg5 = var14 & 0x3FFF;
            }
        } else if (arg7 == 2) {
            if (arg0 == 0 || arg0 == 1) {
                arg5 = -arg5;
                arg8 = -arg8;
            } else if (arg0 == 2) {
                arg8 = -arg8 & 0x3FFF;
                arg5 = -arg5 & 0x3FFF;
            }
        } else if (arg7 == 3) {
            if (arg0 == 0 || arg0 == 1) {
                int var13 = arg8;
                arg8 = -arg5;
                arg5 = var13;
            } else if (arg0 == 3) {
                int var11 = arg8;
                arg8 = arg5;
                arg5 = var11;
            } else if (arg0 == 2) {
                int var12 = arg8;
                arg8 = arg5 & 0x3FFF;
                arg5 = -var12 & 0x3FFF;
            }
        }
        if (arg3 == 65535) {
            this.method65(arg0, arg4, arg8, arg6, arg5, arg7, arg2);
        } else {
            this.method84(arg0, arg4, arg8, arg6, arg5, arg2, arg3, arg9);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lsba;IIIZILsba;II)V", line = 191)
    public final void method863(class183 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, class183 arg6, int arg7, int arg8) {
        field1909++;
        if (~arg2 == arg1 || !this.method62()) {
            return;
        }
        class424 var10 = arg6.field2215[arg2];
        class147 var11 = var10.field5453;
        class424 var12 = null;
        if (arg0 != null) {
            var12 = arg0.field2215[arg5];
            if (var12.field5453 != var11) {
                var12 = null;
            }
        }
        this.method869(65535, var12, var10, arg8, null, null, false, arg3, arg7, arg4, (byte) -122, var11);
        this.method66();
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIILsa;II)V", line = 227)
    public final void method864(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class174 arg6, int arg7, int arg8) {
        field1911++;
        boolean var10 = false;
        boolean var11 = false;
        boolean var12 = false;
        int var13 = -arg7 / 2;
        int var14 = -arg4 / 2;
        int var15 = arg6.method847(arg5 + var13, arg3 + var14);
        int var16 = arg7 / 2;
        int var17 = -arg4 / 2;
        int var18 = arg6.method847(arg5 + var16, arg3 - -var17);
        int var19 = -arg7 / 2;
        int var20 = arg4 / 2;
        int var21 = arg6.method847(arg5 + var19, arg3 + var20);
        int var22 = arg7 / 2;
        int var23 = arg4 / 2;
        int var24 = arg6.method847(arg5 + var22, arg3 + var23);
        int var25 = var18 > var15 ? var15 : var18;
        int var26 = var24 > var21 ? var21 : var24;
        int var27 = var18 >= var24 ? var24 : var18;
        int var28 = var21 > var15 ? var15 : var21;
        if (arg4 != 0) {
            int var29 = (int) (Math.atan2((double) (var25 - var26), (double) arg4) * 2607.5945876176133D) & 0x3FFF;
            if (var29 != 0) {
                if (arg2 != 0) {
                    if (var29 > 8192) {
                        int var30 = 16384 - arg2;
                        if (var30 > var29) {
                            var29 = var30;
                        }
                    } else if (arg2 < var29) {
                        var29 = arg2;
                    }
                }
                this.method85(var29);
            }
        }
        int var31 = var15 + var24;
        if (arg7 != 0) {
            int var32 = (int) (Math.atan2((double) (var28 - var27), (double) arg7) * 2607.5945876176133D) & 0x3FFF;
            if (var32 != 0) {
                if (arg0 != 0) {
                    if (var32 > 8192) {
                        int var33 = 16384 - arg0;
                        if (var32 < var33) {
                            var32 = var33;
                        }
                    } else if (var32 > arg0) {
                        var32 = arg0;
                    }
                }
                this.method79(var32);
            }
        }
        if ((var18 + var21) < var31) {
            var31 = var18 + var21;
        }
        int var34 = (var31 >> 1) - arg8;
        if (arg1 != -15794) {
            field1906 = -15;
        }
        if (var34 != 0) {
            this.method98(0, var34, 0);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lsba;IIIIIII[ZZILsba;Lsba;Lsba;I)V", line = 353)
    public final void method865(class183 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[] arg8, boolean arg9, int arg10, class183 arg11, class183 arg12, class183 arg13, int arg14) {
        field1907++;
        if (arg5 == -1) {
            return;
        }
        if (arg8 == null || arg10 == -1) {
            this.method863(arg0, 0, arg5, 0, arg9, arg6, arg13, arg1, arg4);
        } else if (this.method62()) {
            class424 var16 = arg13.field2215[arg5];
            class147 var17 = var16.field5453;
            class424 var18 = null;
            if (arg0 != null) {
                var18 = arg0.field2215[arg6];
                if (var18.field5453 != var17) {
                    var18 = null;
                }
            }
            if (arg3 < 36) {
                field1921 = true;
            }
            this.method869(65535, var18, var16, arg4, arg8, null, false, 0, arg1, arg9, (byte) -122, var17);
            class424 var19 = arg12.field2215[arg10];
            class424 var20 = null;
            if (arg11 != null) {
                var20 = arg11.field2215[arg7];
                if (var20.field5453 != var17) {
                    var20 = null;
                }
            }
            this.method65(0, new int[0], 0, 0, 0, 0, arg9);
            this.method869(65535, var20, var19, arg14, arg8, null, true, 0, arg2, arg9, (byte) -122, var19.field5453);
            this.method66();
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ILmd;)V", line = 408)
    public static final void method866(int arg0, class463 arg1) {
        field1908++;
        arg1.field6435 = 0;
        if (arg1.field6474 != -1) {
            class502 var2 = class393.field5190.method770(arg1.field6474, -116);
            if (var2 == null || var2.field6944 == null) {
                arg1.field6474 = -1;
                arg1.field6430 = false;
            } else {
                label397: {
                    arg1.field6404++;
                    if (var2.field6944.length > arg1.field6403 && arg1.field6404 > var2.field6952[arg1.field6403]) {
                        arg1.field6404 = 1;
                        arg1.field6403++;
                        arg1.field6429++;
                        class614.method3532(arg1.field8660, var2, true, arg1.field8652, arg1.field6403, class103.field1265 == arg1, arg1.field8661);
                    }
                    if (var2.field6944.length <= arg1.field6403) {
                        arg1.field6404 = 0;
                        arg1.field6403 = 0;
                        if (arg1.field6430) {
                            arg1.field6474 = arg1.method2704(0).method1960(arg0 ^ 0xFFFFFFBA);
                            if (arg1.field6474 == -1) {
                                arg1.field6430 = false;
                                break label397;
                            }
                            var2 = class393.field5190.method770(arg1.field6474, arg0 - 95);
                        }
                        class614.method3532(arg1.field8660, var2, true, arg1.field8652, arg1.field6403, class103.field1265 == arg1, arg1.field8661);
                    }
                    arg1.field6429 = arg1.field6403 + 1;
                    if (var2.field6944.length <= arg1.field6429) {
                        arg1.field6429 = 0;
                    }
                }
            }
        }
        if (arg1.field6400 != -1 && class335.field4358 >= arg1.field6426) {
            class356 var3 = class344.field4461.method1393(64, arg1.field6400);
            int var4 = var3.field4667;
            if (var4 == -1) {
                arg1.field6400 = -1;
            } else {
                label399: {
                    class502 var5 = class393.field5190.method770(var4, -124);
                    if (var3.field4657) {
                        if (var5.field6951 == 3) {
                            if (arg1.field6489 > 0 && arg1.field6408 <= class335.field4358 && arg1.field6405 < class335.field4358) {
                                arg1.field6400 = -1;
                                break label399;
                            }
                        } else if (var5.field6951 == 1 && arg1.field6489 > 0 && class335.field4358 >= arg1.field6408 && class335.field4358 > arg1.field6405) {
                            arg1.field6426 = class335.field4358 + 1;
                            break label399;
                        }
                    }
                    if (var5 == null || var5.field6944 == null) {
                        arg1.field6400 = -1;
                    } else {
                        if (arg1.field6469 < 0) {
                            arg1.field6469 = 0;
                            class614.method3532(arg1.field8660, var5, true, arg1.field8652, 0, class103.field1265 == arg1, arg1.field8661);
                        }
                        arg1.field6398++;
                        if (arg1.field6469 < var5.field6944.length && arg1.field6398 > var5.field6952[arg1.field6469]) {
                            arg1.field6469++;
                            arg1.field6398 = 1;
                            class614.method3532(arg1.field8660, var5, true, arg1.field8652, arg1.field6469, class103.field1265 == arg1, arg1.field8661);
                        }
                        if (arg1.field6469 >= var5.field6944.length) {
                            if (var3.field4657) {
                                arg1.field6469 -= var5.field6966;
                                arg1.field6395++;
                                if (arg1.field6395 >= var5.field6965) {
                                    arg1.field6400 = -1;
                                } else if (arg1.field6469 >= 0 && arg1.field6469 < var5.field6944.length) {
                                    class614.method3532(arg1.field8660, var5, true, arg1.field8652, arg1.field6469, class103.field1265 == arg1, arg1.field8661);
                                } else {
                                    arg1.field6400 = -1;
                                }
                            } else {
                                arg1.field6400 = -1;
                            }
                        }
                        arg1.field6470 = arg1.field6469 + 1;
                        if (var5.field6944.length <= arg1.field6470) {
                            if (var3.field4657) {
                                arg1.field6470 -= var5.field6966;
                                if (arg1.field6395 + 1 >= var5.field6965) {
                                    arg1.field6470 = -1;
                                } else if (arg1.field6470 < 0 || arg1.field6470 >= var5.field6944.length) {
                                    arg1.field6470 = -1;
                                }
                            } else {
                                arg1.field6470 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field6397 != -1 && arg1.field6437 <= class335.field4358) {
            class356 var6 = class344.field4461.method1393(arg0 + 65, arg1.field6397);
            int var7 = var6.field4667;
            if (var7 == -1) {
                arg1.field6397 = -1;
            } else {
                label403: {
                    class502 var8 = class393.field5190.method770(var7, arg0 ^ 0x4F);
                    if (var6.field4657) {
                        if (var8.field6951 == 3) {
                            if (arg1.field6489 > 0 && class335.field4358 >= arg1.field6408 && class335.field4358 > arg1.field6405) {
                                arg1.field6397 = -1;
                                break label403;
                            }
                        } else if (var8.field6951 == 1 && arg1.field6489 > 0 && class335.field4358 >= arg1.field6408 && arg1.field6405 < class335.field4358) {
                            arg1.field6437 = class335.field4358 + 1;
                            break label403;
                        }
                    }
                    if (var8 == null || var8.field6944 == null) {
                        arg1.field6397 = -1;
                    } else {
                        if (arg1.field6454 < 0) {
                            arg1.field6454 = 0;
                            class614.method3532(arg1.field8660, var8, true, arg1.field8652, 0, class103.field1265 == arg1, arg1.field8661);
                        }
                        arg1.field6387++;
                        if (arg1.field6454 < var8.field6944.length && arg1.field6387 > var8.field6952[arg1.field6454]) {
                            arg1.field6454++;
                            arg1.field6387 = 1;
                            class614.method3532(arg1.field8660, var8, true, arg1.field8652, arg1.field6454, class103.field1265 == arg1, arg1.field8661);
                        }
                        if (arg1.field6454 >= var8.field6944.length) {
                            if (var6.field4657) {
                                arg1.field6442++;
                                arg1.field6454 -= var8.field6966;
                                if (arg1.field6442 >= var8.field6965) {
                                    arg1.field6397 = -1;
                                } else if (arg1.field6454 >= 0 && var8.field6944.length > arg1.field6454) {
                                    class614.method3532(arg1.field8660, var8, true, arg1.field8652, arg1.field6454, class103.field1265 == arg1, arg1.field8661);
                                } else {
                                    arg1.field6397 = -1;
                                }
                            } else {
                                arg1.field6397 = -1;
                            }
                        }
                        arg1.field6416 = arg1.field6454 + 1;
                        if (var8.field6944.length <= arg1.field6416) {
                            if (var6.field4657) {
                                arg1.field6416 -= var8.field6966;
                                if (var8.field6965 <= arg1.field6442 + 1) {
                                    arg1.field6416 = -1;
                                } else if (arg1.field6416 < 0 || arg1.field6416 >= var8.field6944.length) {
                                    arg1.field6416 = -1;
                                }
                            } else {
                                arg1.field6416 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field6465 != -1 && arg1.field6449 <= 1) {
            class502 var9 = class393.field5190.method770(arg1.field6465, arg0 ^ 0x54);
            if (var9.field6951 == 3) {
                if (arg1.field6489 > 0 && class335.field4358 >= arg1.field6408 && class335.field4358 > arg1.field6405) {
                    arg1.field6465 = -1;
                }
            } else if (var9.field6951 == 1 && arg1.field6489 > 0 && arg1.field6408 <= class335.field4358 && class335.field4358 > arg1.field6405) {
                arg1.field6449 = 2;
            }
        }
        if (arg1.field6465 != -1 && arg1.field6449 == 0) {
            class502 var10 = class393.field5190.method770(arg1.field6465, -105);
            if (var10 == null || var10.field6944 == null) {
                arg1.field6465 = -1;
            } else {
                arg1.field6477++;
                if (arg1.field6390 < var10.field6944.length && arg1.field6477 > var10.field6952[arg1.field6390]) {
                    arg1.field6390++;
                    arg1.field6477 = 1;
                    class614.method3532(arg1.field8660, var10, true, arg1.field8652, arg1.field6390, class103.field1265 == arg1, arg1.field8661);
                }
                if (arg1.field6390 >= var10.field6944.length) {
                    arg1.field6422++;
                    arg1.field6390 -= var10.field6966;
                    if (var10.field6965 <= arg1.field6422) {
                        arg1.field6465 = -1;
                    } else if (arg1.field6390 >= 0 && var10.field6944.length > arg1.field6390) {
                        class614.method3532(arg1.field8660, var10, true, arg1.field8652, arg1.field6390, class103.field1265 == arg1, arg1.field8661);
                    } else {
                        arg1.field6465 = -1;
                    }
                }
                arg1.field6409 = arg1.field6390 + 1;
                if (arg1.field6409 >= var10.field6944.length) {
                    arg1.field6409 -= var10.field6966;
                    if (var10.field6965 <= (arg1.field6422 + 1)) {
                        arg1.field6409 = -1;
                    } else if (arg1.field6409 < 0 || var10.field6944.length <= arg1.field6409) {
                        arg1.field6409 = -1;
                    }
                }
                arg1.field6435 = var10.field6957;
            }
        }
        if (arg0 > ~arg1.field6449) {
            arg1.field6449--;
        }
        for (int var11 = 0; var11 < arg1.field6411.length; var11++) {
            class172 var12 = arg1.field6411[var11];
            if (var12 != null) {
                if (var12.field2089 > 0) {
                    var12.field2089--;
                } else {
                    class502 var13 = class393.field5190.method770(var12.field2088, arg0 - 71);
                    if (var13 == null || var13.field6944 == null) {
                        arg1.field6411[var11] = null;
                    } else {
                        var12.field2091++;
                        if (var13.field6944.length > var12.field2093 && var13.field6952[var12.field2093] < var12.field2091) {
                            var12.field2091 = 1;
                            var12.field2093++;
                            class614.method3532(arg1.field8660, var13, true, arg1.field8652, var12.field2093, class103.field1265 == arg1, arg1.field8661);
                        }
                        if (var13.field6944.length <= var12.field2093) {
                            var12.field2093 -= var13.field6966;
                            var12.field2090++;
                            if (var13.field6965 <= var12.field2090) {
                                arg1.field6411[var11] = null;
                            } else if (var12.field2093 >= 0 && var12.field2093 < var13.field6944.length) {
                                class614.method3532(arg1.field8660, var13, true, arg1.field8652, var12.field2093, class103.field1265 == arg1, arg1.field8661);
                            } else {
                                arg1.field6411[var11] = null;
                            }
                        }
                        var12.field2094 = var12.field2093 + 1;
                        if (var12.field2094 >= var13.field6944.length) {
                            var12.field2094 -= var13.field6966;
                            if (var12.field2090 + 1 >= var13.field6965) {
                                var12.field2094 = -1;
                            } else if (var12.field2094 < 0 || var13.field6944.length <= var12.field2094) {
                                var12.field2094 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IILsba;)V", line = 833)
    public final void method867(int arg0, int arg1, class183 arg2) {
        field1916++;
        if (arg0 == -1 || !this.method62()) {
            return;
        }
        class424 var4 = arg2.field2215[arg0];
        class147 var5 = var4.field5453;
        if (arg1 != -3) {
            return;
        }
        for (int var6 = 0; var6 < var4.field5454; var6++) {
            short var7 = var4.field5455[var6];
            if (var5.field1763[var7]) {
                if (var4.field5468[var6] != -1) {
                    this.method99(0, 0, 0, 0);
                }
                this.method99(var5.field1762[var7], var4.field5462[var6], var4.field5458[var6], var4.field5469[var6]);
            }
        }
        this.method66();
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)V", line = 880)
    public static void method868(boolean arg0) {
        field1920 = null;
        field1914 = null;
        field1918 = null;
        if (!arg0) {
            field1917 = -119L;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ILeaa;Leaa;I[Z[IZIIZBLcda;)V", line = 894)
    private final void method869(int arg0, class424 arg1, class424 arg2, int arg3, boolean[] arg4, int[] arg5, boolean arg6, int arg7, int arg8, boolean arg9, byte arg10, class147 arg11) {
        field1919++;
        if (arg1 == null || arg8 == 0) {
            for (int var38 = 0; var38 < arg2.field5454; var38++) {
                short var39 = arg2.field5455[var38];
                if (arg4 == null || arg4[var39] == arg6 || arg11.field1762[var39] == 0) {
                    short var40 = arg2.field5468[var38];
                    if (var40 != -1) {
                        this.method862(0, false, arg9, arg11.field1760[var40] & arg0, arg11.field1757[var40], 0, 0, arg7, 0, arg5);
                    }
                    this.method862(arg11.field1762[var39], false, arg9, arg11.field1760[var39] & arg0, arg11.field1757[var39], arg2.field5469[var38], arg2.field5458[var38], arg7, arg2.field5462[var38], arg5);
                }
            }
            return;
        }
        int var13 = 0;
        int var14 = 0;
        if (arg10 != -122) {
            return;
        }
        for (int var15 = 0; var15 < arg11.field1764; var15++) {
            boolean var16 = false;
            if (arg2.field5454 > var13 && arg2.field5455[var13] == var15) {
                var16 = true;
            }
            boolean var17 = false;
            if (var14 < arg1.field5454 && arg1.field5455[var14] == var15) {
                var17 = true;
            }
            if (var16 || var17) {
                if (arg4 == null || arg4[var15] == arg6 || arg11.field1762[var15] == 0) {
                    short var18 = 0;
                    int var19 = arg11.field1762[var15];
                    if (var19 == 3 || var19 == 10) {
                        var18 = 128;
                    }
                    short var20;
                    byte var21;
                    short var22;
                    short var23;
                    short var24;
                    if (var16) {
                        var21 = arg2.field5459[var13];
                        var23 = arg2.field5462[var13];
                        var22 = arg2.field5458[var13];
                        var24 = arg2.field5468[var13];
                        var20 = arg2.field5469[var13];
                        var13++;
                    } else {
                        var20 = var18;
                        var21 = 0;
                        var22 = var18;
                        var23 = var18;
                        var24 = -1;
                    }
                    short var25;
                    short var26;
                    short var27;
                    byte var28;
                    short var29;
                    if (var17) {
                        var25 = arg1.field5468[var14];
                        var26 = arg1.field5458[var14];
                        var27 = arg1.field5469[var14];
                        var28 = arg1.field5459[var14];
                        var29 = arg1.field5462[var14];
                        var14++;
                    } else {
                        var29 = var18;
                        var28 = 0;
                        var26 = var18;
                        var25 = -1;
                        var27 = var18;
                    }
                    if (var24 != -1) {
                        this.method862(0, false, arg9, arg0 & arg11.field1760[var24], arg11.field1757[var24], 0, 0, arg7, 0, arg5);
                    } else if (var25 != -1) {
                        this.method862(0, false, arg9, arg11.field1760[var25] & arg0, arg11.field1757[var25], 0, 0, arg7, 0, arg5);
                    }
                    int var33;
                    int var34;
                    int var35;
                    if ((var21 & 0x2) != 0 || (var28 & 0x1) != 0) {
                        var35 = var20;
                        var33 = var23;
                        var34 = var22;
                    } else if (var19 == 2) {
                        int var30 = var29 - var23 & 0x3FFF;
                        int var31 = var26 - var22 & 0x3FFF;
                        if (var31 >= 8192) {
                            var31 -= 16384;
                        }
                        int var32 = var27 - var20 & 0x3FFF;
                        if (var30 >= 8192) {
                            var30 -= 16384;
                        }
                        var33 = arg8 * var30 / arg3 + var23 & 0x3FFF;
                        var34 = arg8 * var31 / arg3 + var22 & 0x3FFF;
                        if (var32 >= 8192) {
                            var32 -= 16384;
                        }
                        var35 = arg8 * var32 / arg3 + var20 & 0x3FFF;
                    } else if (var19 == 9) {
                        int var37 = var29 - var23 & 0x3FFF;
                        if (var37 >= 8192) {
                            var37 -= 16384;
                        }
                        var33 = var23 + (arg8 * var37 / arg3) & 0x3FFF;
                        var35 = 0;
                        var34 = 0;
                    } else if (var19 == 7) {
                        int var36 = var29 - var23 & 0x3F;
                        if (var36 >= 32) {
                            var36 -= 64;
                        }
                        var35 = var20 + ((var27 - var20) * arg8 / arg3);
                        var34 = (var26 - var22) * arg8 / arg3 + var22;
                        var33 = arg8 * var36 / arg3 + var23 & 0x3F;
                    } else {
                        var35 = (var27 - var20) * arg8 / arg3 + var20;
                        var33 = (var29 - var23) * arg8 / arg3 + var23;
                        var34 = (var26 - var22) * arg8 / arg3 + var22;
                    }
                    this.method862(var19, false, arg9, arg0 & arg11.field1760[var15], arg11.field1757[var15], var35, var34, arg7, var33, arg5);
                } else {
                    if (var16) {
                        var13++;
                    }
                    if (var17) {
                        var14++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "EA", descriptor = "(Lk;)Lk;")
    public abstract class483 method81(class483 arg0);

    @OriginalMember(owner = "client!r", name = "g", descriptor = "(I)V")
    public abstract void method58(int arg0);

    @OriginalMember(owner = "client!r", name = "l", descriptor = "(IIII)V")
    public abstract void method99(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "L", descriptor = "(SS)V")
    public abstract void method93(short arg0, short arg1);

    @OriginalMember(owner = "client!r", name = "V", descriptor = "(III)V")
    public abstract void method100(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!r", name = "ba", descriptor = "()I")
    public abstract int method77();

    @OriginalMember(owner = "client!r", name = "Q", descriptor = "()I")
    public abstract int method96();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "()[Lfr;")
    public abstract class348[] method78();

    @OriginalMember(owner = "client!r", name = "ga", descriptor = "()I")
    public abstract int method83();

    @OriginalMember(owner = "client!r", name = "M", descriptor = "()I")
    public abstract int method95();

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V")
    public abstract void method79(int arg0);

    @OriginalMember(owner = "client!r", name = "OA", descriptor = "(I)V")
    public abstract void method92(int arg0);

    @OriginalMember(owner = "client!r", name = "wa", descriptor = "()I")
    public abstract int method90();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lr;IIIZ)V")
    public abstract void method67(class157 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!r", name = "va", descriptor = "()I")
    public abstract int method82();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BIZ)Lr;")
    public abstract class157 method64(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!r", name = "D", descriptor = "(I)V")
    public abstract void method85(int arg0);

    @OriginalMember(owner = "client!r", name = "pa", descriptor = "(SS)V")
    public abstract void method70(short arg0, short arg1);

    @OriginalMember(owner = "client!r", name = "m", descriptor = "(I)V")
    public abstract void method72(int arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lm;Lcf;I)V")
    public abstract void method69(class163 arg0, class517 arg1, int arg2);

    @OriginalMember(owner = "client!r", name = "q", descriptor = "(I)V")
    public abstract void method57(int arg0);

    @OriginalMember(owner = "client!r", name = "BA", descriptor = "(I[IIIIZI[I)V")
    public abstract void method84(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!r", name = "n", descriptor = "()I")
    public abstract int method73();

    @OriginalMember(owner = "client!r", name = "X", descriptor = "()V")
    public abstract void method86();

    @OriginalMember(owner = "client!r", name = "e", descriptor = "()I")
    public abstract int method60();

    @OriginalMember(owner = "client!r", name = "ca", descriptor = "(III)V")
    public abstract void method98(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!r", name = "TA", descriptor = "()I")
    public abstract int method74();

    @OriginalMember(owner = "client!r", name = "sa", descriptor = "()Z")
    public abstract boolean method62();

    @OriginalMember(owner = "client!r", name = "b", descriptor = "()V")
    public abstract void method97();

    @OriginalMember(owner = "client!r", name = "I", descriptor = "(I)V")
    public abstract void method94(int arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lm;Lcf;II)V")
    public abstract void method63(class163 arg0, class517 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIII)V")
    public abstract void method76(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "MA", descriptor = "()V")
    public abstract void method66();

    @OriginalMember(owner = "client!r", name = "ea", descriptor = "(I[IIIIIZ)V")
    public abstract void method65(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!r", name = "c", descriptor = "()[Ldl;")
    public abstract class55[] method59();

    @OriginalMember(owner = "client!r", name = "RA", descriptor = "(IILsa;Lsa;III)V")
    public abstract void method87(int arg0, int arg1, class174 arg2, class174 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!r", name = "d", descriptor = "()Z")
    public abstract boolean method75();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IILm;Z)Z")
    public abstract boolean method91(int arg0, int arg1, class163 arg2, boolean arg3);

    @OriginalMember(owner = "client!r", name = "U", descriptor = "()I")
    public abstract int method71();
}
