import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mfa")
public class class204 implements class255 {

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "I")
    public int field2588;

    @OriginalMember(owner = "client!mfa", name = "c", descriptor = "I")
    public static int field2590 = 0;

    @OriginalMember(owner = "client!mfa", name = "d", descriptor = "I")
    public static int field2591 = 0;

    @OriginalMember(owner = "client!mfa", name = "i", descriptor = "Lqia;")
    public static class547 field2596 = new class547();

    @OriginalMember(owner = "client!mfa", name = "h", descriptor = "F")
    public static float field2595;

    @OriginalMember(owner = "client!mfa", name = "b", descriptor = "I")
    public static int field2589;

    @OriginalMember(owner = "client!mfa", name = "e", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!mfa", name = "f", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!mfa", name = "g", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(Z)Lqi;")
    public final class669 method271(boolean arg0) {
        if (arg0) {
            return null;
        } else {
            field2589++;
            return class508.field7187;
        }
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(ILkba;)V")
    public static final void method1262(int arg0, class24 arg1) {
        if (arg0 >= -78) {
            field2594 = 120;
        }
        if (arg1.field332 != -1) {
            class747 var2 = class646.field8903.method643(arg1.field332, -105);
            if (var2 == null || var2.field10458 == null) {
                arg1.field313 = false;
                arg1.field332 = -1;
            } else {
                label364: {
                    arg1.field413++;
                    if (arg1.field387 < var2.field10458.length && var2.field10453[arg1.field387] < arg1.field413) {
                        arg1.field387++;
                        arg1.field415++;
                        arg1.field413 = 1;
                        if (!arg1.field417) {
                            class107.method729(arg1.field387, var2, arg1, -4855);
                        }
                    }
                    if (arg1.field387 >= var2.field10458.length) {
                        arg1.field413 = 0;
                        arg1.field387 = 0;
                        if (arg1.field313) {
                            arg1.field332 = arg1.method249(-95).method2687((byte) -81);
                            if (arg1.field332 == -1) {
                                arg1.field313 = false;
                                break label364;
                            }
                            var2 = class646.field8903.method643(arg1.field332, -77);
                        }
                        if (!arg1.field417) {
                            class107.method729(arg1.field387, var2, arg1, -4855);
                        }
                    }
                    arg1.field415 = arg1.field387 + 1;
                    if (var2.field10458 == null) {
                        arg1.field332 = -1;
                        arg1.field313 = false;
                    } else if (arg1.field415 >= var2.field10458.length) {
                        arg1.field415 = 0;
                    }
                }
            }
        }
        field2593++;
        if (arg1.field395 != -1 && arg1.field383 <= class266.field3368) {
            class716 var3 = class250.field3177.method3616((byte) 107, arg1.field395);
            int var4 = var3.field10096;
            if (var4 == -1) {
                arg1.field395 = -1;
            } else {
                label365: {
                    class747 var5 = class646.field8903.method643(var4, -74);
                    if (var3.field10105) {
                        if (var5.field10454 == 3) {
                            if (arg1.field434 > 0 && class266.field3368 >= arg1.field339 && class266.field3368 > arg1.field355) {
                                arg1.field395 = -1;
                                break label365;
                            }
                        } else if (var5.field10454 == 1 && arg1.field434 > 0 && arg1.field339 <= class266.field3368 && arg1.field355 < class266.field3368) {
                            arg1.field383 = class266.field3368 + 1;
                            break label365;
                        }
                    }
                    if (var5 == null || var5.field10458 == null) {
                        arg1.field395 = -1;
                    } else {
                        if (arg1.field400 < 0) {
                            arg1.field400 = 0;
                            if (!arg1.field417) {
                                class107.method729(0, var5, arg1, -4855);
                            }
                        }
                        arg1.field419++;
                        if (arg1.field400 < var5.field10458.length && arg1.field419 > var5.field10453[arg1.field400]) {
                            arg1.field400++;
                            arg1.field419 = 1;
                            if (!arg1.field417) {
                                class107.method729(arg1.field400, var5, arg1, -4855);
                            }
                        }
                        if (var5.field10458.length <= arg1.field400) {
                            if (var3.field10105) {
                                arg1.field400 -= var5.field10441;
                                arg1.field396++;
                                if (arg1.field396 >= var5.field10460) {
                                    arg1.field395 = -1;
                                } else if (arg1.field400 < 0 || arg1.field400 >= var5.field10458.length) {
                                    arg1.field395 = -1;
                                } else if (!arg1.field417) {
                                    class107.method729(arg1.field400, var5, arg1, -4855);
                                }
                            } else {
                                arg1.field395 = -1;
                            }
                        }
                        arg1.field361 = arg1.field400 + 1;
                        if (arg1.field361 >= var5.field10458.length) {
                            if (var3.field10105) {
                                arg1.field361 -= var5.field10441;
                                if (var5.field10460 <= (arg1.field396 + 1)) {
                                    arg1.field361 = -1;
                                } else if (arg1.field361 < 0 || arg1.field361 >= var5.field10458.length) {
                                    arg1.field361 = -1;
                                }
                            } else {
                                arg1.field361 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field367 != -1 && arg1.field317 <= class266.field3368) {
            class716 var6 = class250.field3177.method3616((byte) 110, arg1.field367);
            int var7 = var6.field10096;
            if (var7 == -1) {
                arg1.field367 = -1;
            } else {
                label368: {
                    class747 var8 = class646.field8903.method643(var7, -100);
                    if (var6.field10105) {
                        if (var8.field10454 == 3) {
                            if (arg1.field434 > 0 && class266.field3368 >= arg1.field339 && class266.field3368 > arg1.field355) {
                                arg1.field367 = -1;
                                break label368;
                            }
                        } else if (var8.field10454 == 1 && arg1.field434 > 0 && class266.field3368 >= arg1.field339 && arg1.field355 < class266.field3368) {
                            arg1.field317 = class266.field3368 + 1;
                            break label368;
                        }
                    }
                    if (var8 == null || var8.field10458 == null) {
                        arg1.field367 = -1;
                    } else {
                        if (arg1.field329 < 0) {
                            arg1.field329 = 0;
                            if (!arg1.field417) {
                                class107.method729(0, var8, arg1, -4855);
                            }
                        }
                        arg1.field392++;
                        if (arg1.field329 < var8.field10458.length && var8.field10453[arg1.field329] < arg1.field392) {
                            arg1.field392 = 1;
                            arg1.field329++;
                            if (!arg1.field417) {
                                class107.method729(arg1.field329, var8, arg1, -4855);
                            }
                        }
                        if (arg1.field329 >= var8.field10458.length) {
                            if (var6.field10105) {
                                arg1.field329 -= var8.field10441;
                                arg1.field391++;
                                if (var8.field10460 <= arg1.field391) {
                                    arg1.field367 = -1;
                                } else if (arg1.field329 < 0 || var8.field10458.length <= arg1.field329) {
                                    arg1.field367 = -1;
                                } else if (!arg1.field417) {
                                    class107.method729(arg1.field329, var8, arg1, -4855);
                                }
                            } else {
                                arg1.field367 = -1;
                            }
                        }
                        arg1.field338 = arg1.field329 + 1;
                        if (arg1.field338 >= var8.field10458.length) {
                            if (var6.field10105) {
                                arg1.field338 -= var8.field10441;
                                if (arg1.field391 + 1 >= var8.field10460) {
                                    arg1.field338 = -1;
                                } else if (arg1.field338 < 0 || var8.field10458.length <= arg1.field338) {
                                    arg1.field338 = -1;
                                }
                            } else {
                                arg1.field338 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field376 != -1 && arg1.field364 <= 1) {
            class747 var9 = class646.field8903.method643(arg1.field376, -121);
            if (var9.field10454 == 3) {
                if (arg1.field434 > 0 && arg1.field339 <= class266.field3368 && class266.field3368 > arg1.field355) {
                    arg1.field376 = -1;
                    arg1.field408 = null;
                }
            } else if (var9.field10454 == 1 && arg1.field434 > 0 && class266.field3368 >= arg1.field339 && class266.field3368 > arg1.field355) {
                arg1.field364 = 2;
            }
        }
        if (arg1.field376 != -1 && arg1.field364 == 0) {
            class747 var10 = class646.field8903.method643(arg1.field376, -103);
            if (var10 == null || var10.field10458 == null) {
                arg1.field376 = -1;
                arg1.field408 = null;
            } else {
                arg1.field326++;
                if (var10.field10458.length > arg1.field388 && var10.field10453[arg1.field388] < arg1.field326) {
                    arg1.field388++;
                    arg1.field326 = 1;
                    if (!arg1.field417) {
                        class107.method729(arg1.field388, var10, arg1, -4855);
                    }
                }
                if (var10.field10458.length <= arg1.field388) {
                    arg1.field346++;
                    arg1.field388 -= var10.field10441;
                    if (var10.field10460 <= arg1.field346) {
                        arg1.field408 = null;
                        arg1.field376 = -1;
                    } else if (arg1.field388 < 0 || arg1.field388 >= var10.field10458.length) {
                        arg1.field376 = -1;
                        arg1.field408 = null;
                    } else if (!arg1.field417) {
                        class107.method729(arg1.field388, var10, arg1, -4855);
                    }
                }
                arg1.field385 = arg1.field388 + 1;
                if (arg1.field385 >= var10.field10458.length) {
                    arg1.field385 -= var10.field10441;
                    if (var10.field10460 <= (arg1.field346 + 1)) {
                        arg1.field385 = -1;
                    } else if (arg1.field385 < 0 || arg1.field385 >= var10.field10458.length) {
                        arg1.field385 = -1;
                    }
                }
            }
        }
        if (arg1.field364 > 0) {
            arg1.field364--;
        }
        for (int var11 = 0; var11 < arg1.field320.length; var11++) {
            class645 var12 = arg1.field320[var11];
            if (var12 != null) {
                if (var12.field8888 > 0) {
                    var12.field8888--;
                } else {
                    class747 var13 = class646.field8903.method643(var12.field8896, -69);
                    if (var13 == null || var13.field10458 == null) {
                        arg1.field320[var11] = null;
                    } else {
                        var12.field8890++;
                        if (var12.field8887 < var13.field10458.length && var12.field8890 > var13.field10453[var12.field8887]) {
                            var12.field8887++;
                            var12.field8890 = 1;
                            if (!arg1.field417) {
                                class107.method729(var12.field8887, var13, arg1, -4855);
                            }
                        }
                        if (var13.field10458.length <= var12.field8887) {
                            var12.field8894++;
                            var12.field8887 -= var13.field10441;
                            if (var12.field8894 >= var13.field10460) {
                                arg1.field320[var11] = null;
                            } else if (var12.field8887 < 0 || var12.field8887 >= var13.field10458.length) {
                                arg1.field320[var11] = null;
                            } else if (!arg1.field417) {
                                class107.method729(var12.field8887, var13, arg1, -4855);
                            }
                        }
                        var12.field8889 = var12.field8887 + 1;
                        if (var13.field10458.length <= var12.field8889) {
                            var12.field8889 -= var13.field10441;
                            if ((var12.field8894 + 1) >= var13.field10460) {
                                var12.field8889 = -1;
                            } else if (var12.field8889 < 0 || var13.field10458.length <= var12.field8889) {
                                var12.field8889 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "(I)V")
    public class204(int arg0) {
        this.field2588 = arg0;
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(II[B)[B")
    public static final byte[] method1263(int arg0, int arg1, byte[] arg2) {
        field2592++;
        byte[] var3 = new byte[arg1];
        class617.method3389(arg2, 0, var3, 0, arg1);
        if (arg0 <= 12) {
            method1264(false);
        }
        return var3;
    }

    @OriginalMember(owner = "client!mfa", name = "b", descriptor = "(Z)V")
    public static void method1264(boolean arg0) {
        field2596 = null;
        if (!arg0) {
            field2591 = -59;
        }
    }
}
