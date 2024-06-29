import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class182 {

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "Lio;")
    public static class370 field2576 = new class370();

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
    public static int field2579 = 0;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
    public static int field2577;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
    public static int field2578;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "[[I")
    public static int[][] field2580;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V")
    public static void method1139(byte arg0) {
        field2576 = null;
        field2580 = null;
        if (arg0 >= -62) {
            method1140(null, -90, 67, 118);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lhh;III)V")
    public static final void method1140(class109 arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 3698) {
            field2580 = null;
        }
        if (arg0.field535 == arg2 && arg2 != -1) {
            class78 var4 = class331.field4418.method195(arg2, (byte) 13);
            int var5 = var4.field1282;
            if (var5 == 1) {
                arg0.field584 = arg3;
                arg0.field595 = 1;
                arg0.field566 = 0;
                arg0.field596 = 0;
                arg0.field539 = 0;
                class170.method1085(arg0.field6029, arg0.field6035, false, (byte) 102, arg0.field539, var4, arg0.field6037);
            }
            if (var5 == 2) {
                arg0.field596 = 0;
            }
        } else if (arg2 == -1 || arg0.field535 == -1 || class331.field4418.method195(arg2, (byte) 13).field1276 >= class331.field4418.method195(arg0.field535, (byte) 13).field1276) {
            arg0.field596 = 0;
            arg0.field535 = arg2;
            arg0.field584 = arg3;
            arg0.field539 = 0;
            arg0.field566 = 0;
            arg0.field621 = arg0.field617;
            arg0.field595 = 1;
            if (arg0.field535 != -1) {
                class170.method1085(arg0.field6029, arg0.field6035, false, (byte) -118, arg0.field539, class331.field4418.method195(arg0.field535, (byte) 13), arg0.field6037);
            }
        }
        field2577++;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIBII)V")
    public static final void method1141(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 != 112) {
            field2580 = null;
        }
        field2578++;
        class314 var5 = class483.method2819(8, arg3, arg2 + 21191);
        var5.method1959(19793);
        var5.field4230 = arg4;
        var5.field4223 = arg0;
        var5.field4227 = arg1;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZLbe;)V")
    public static final void method1142(boolean arg0, class33 arg1) {
        field2575++;
        arg1.field543 = 0;
        if (arg1.field554 != -1) {
            class78 var2 = class331.field4418.method195(arg1.field554, (byte) 13);
            if (var2 == null || var2.field1261 == null) {
                arg1.field567 = false;
                arg1.field554 = -1;
            } else {
                label403: {
                    arg1.field571++;
                    if (arg1.field594 < var2.field1261.length && var2.field1260[arg1.field594] < arg1.field571) {
                        arg1.field594++;
                        arg1.field521++;
                        arg1.field571 = 1;
                        class170.method1085(arg1.field6029, arg1.field6035, class645.field9372 == arg1, (byte) 20, arg1.field594, var2, arg1.field6037);
                    }
                    if (var2.field1261.length <= arg1.field594) {
                        arg1.field594 = 0;
                        arg1.field571 = 0;
                        if (arg1.field567) {
                            arg1.field554 = arg1.method349(true).method754((byte) 105);
                            if (arg1.field554 == -1) {
                                arg1.field567 = false;
                                break label403;
                            }
                            var2 = class331.field4418.method195(arg1.field554, (byte) 13);
                        }
                        class170.method1085(arg1.field6029, arg1.field6035, class645.field9372 == arg1, (byte) -118, arg1.field594, var2, arg1.field6037);
                    }
                    arg1.field521 = arg1.field594 + 1;
                    if (var2.field1261.length <= arg1.field521) {
                        arg1.field521 = 0;
                    }
                }
            }
        }
        if (arg1.field556 != -1 && class405.field5763 >= arg1.field576) {
            class258 var3 = class78.field1263.method1564(arg1.field556, 5);
            int var4 = var3.field3583;
            if (var4 == -1) {
                arg1.field556 = -1;
            } else {
                label405: {
                    class78 var5 = class331.field4418.method195(var4, (byte) 13);
                    if (var3.field3590) {
                        if (var5.field1275 == 3) {
                            if (arg1.field621 > 0 && arg1.field538 <= class405.field5763 && class405.field5763 > arg1.field546) {
                                arg1.field556 = -1;
                                break label405;
                            }
                        } else if (var5.field1275 == 1 && arg1.field621 > 0 && arg1.field538 <= class405.field5763 && arg1.field546 < class405.field5763) {
                            arg1.field576 = class405.field5763 + 1;
                            break label405;
                        }
                    }
                    if (var5 == null || var5.field1261 == null) {
                        arg1.field556 = -1;
                    } else {
                        if (arg1.field542 < 0) {
                            arg1.field542 = 0;
                            class170.method1085(arg1.field6029, arg1.field6035, class645.field9372 == arg1, (byte) 30, 0, var5, arg1.field6037);
                        }
                        arg1.field527++;
                        if (var5.field1261.length > arg1.field542 && arg1.field527 > var5.field1260[arg1.field542]) {
                            arg1.field542++;
                            arg1.field527 = 1;
                            class170.method1085(arg1.field6029, arg1.field6035, class645.field9372 == arg1, (byte) -128, arg1.field542, var5, arg1.field6037);
                        }
                        if (arg1.field542 >= var5.field1261.length) {
                            if (var3.field3590) {
                                arg1.field570++;
                                arg1.field542 -= var5.field1270;
                                if (arg1.field570 >= var5.field1284) {
                                    arg1.field556 = -1;
                                } else if (arg1.field542 >= 0 && arg1.field542 < var5.field1261.length) {
                                    class170.method1085(arg1.field6029, arg1.field6035, class645.field9372 == arg1, (byte) -118, arg1.field542, var5, arg1.field6037);
                                } else {
                                    arg1.field556 = -1;
                                }
                            } else {
                                arg1.field556 = -1;
                            }
                        }
                        arg1.field600 = arg1.field542 + 1;
                        if (var5.field1261.length <= arg1.field600) {
                            if (var3.field3590) {
                                arg1.field600 -= var5.field1270;
                                if (var5.field1284 <= arg1.field570 + 1) {
                                    arg1.field600 = -1;
                                } else if (arg1.field600 < 0 || var5.field1261.length <= arg1.field600) {
                                    arg1.field600 = -1;
                                }
                            } else {
                                arg1.field600 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field523 != -1 && class405.field5763 >= arg1.field528) {
            class258 var6 = class78.field1263.method1564(arg1.field523, 5);
            int var7 = var6.field3583;
            if (var7 == -1) {
                arg1.field523 = -1;
            } else {
                label408: {
                    class78 var8 = class331.field4418.method195(var7, (byte) 13);
                    if (var6.field3590) {
                        if (var8.field1275 == 3) {
                            if (arg1.field621 > 0 && arg1.field538 <= class405.field5763 && class405.field5763 > arg1.field546) {
                                arg1.field523 = -1;
                                break label408;
                            }
                        } else if (var8.field1275 == 1 && arg1.field621 > 0 && class405.field5763 >= arg1.field538 && arg1.field546 < class405.field5763) {
                            arg1.field528 = class405.field5763 + 1;
                            break label408;
                        }
                    }
                    if (var8 == null || var8.field1261 == null) {
                        arg1.field523 = -1;
                    } else {
                        if (arg1.field537 < 0) {
                            arg1.field537 = 0;
                            class170.method1085(arg1.field6029, arg1.field6035, class645.field9372 == arg1, (byte) 14, 0, var8, arg1.field6037);
                        }
                        arg1.field589++;
                        if (arg1.field537 < var8.field1261.length && arg1.field589 > var8.field1260[arg1.field537]) {
                            arg1.field589 = 1;
                            arg1.field537++;
                            class170.method1085(arg1.field6029, arg1.field6035, class645.field9372 == arg1, (byte) -128, arg1.field537, var8, arg1.field6037);
                        }
                        if (var8.field1261.length <= arg1.field537) {
                            if (var6.field3590) {
                                arg1.field537 -= var8.field1270;
                                arg1.field553++;
                                if (arg1.field553 >= var8.field1284) {
                                    arg1.field523 = -1;
                                } else if (arg1.field537 >= 0 && arg1.field537 < var8.field1261.length) {
                                    class170.method1085(arg1.field6029, arg1.field6035, class645.field9372 == arg1, (byte) 77, arg1.field537, var8, arg1.field6037);
                                } else {
                                    arg1.field523 = -1;
                                }
                            } else {
                                arg1.field523 = -1;
                            }
                        }
                        arg1.field531 = arg1.field537 + 1;
                        if (var8.field1261.length <= arg1.field531) {
                            if (var6.field3590) {
                                arg1.field531 -= var8.field1270;
                                if (arg1.field553 + 1 >= var8.field1284) {
                                    arg1.field531 = -1;
                                } else if (arg1.field531 < 0 || var8.field1261.length <= arg1.field531) {
                                    arg1.field531 = -1;
                                }
                            } else {
                                arg1.field531 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field535 != -1 && arg1.field584 <= 1) {
            class78 var9 = class331.field4418.method195(arg1.field535, (byte) 13);
            if (var9.field1275 == 3) {
                if (arg1.field621 > 0 && class405.field5763 >= arg1.field538 && arg1.field546 < class405.field5763) {
                    arg1.field535 = -1;
                }
            } else if (var9.field1275 == 1 && arg1.field621 > 0 && arg1.field538 <= class405.field5763 && class405.field5763 > arg1.field546) {
                arg1.field584 = 2;
            }
        }
        if (!arg0) {
            method1141(77, -110, (byte) -14, -89, 90);
        }
        if (arg1.field535 != -1 && arg1.field584 == 0) {
            class78 var10 = class331.field4418.method195(arg1.field535, (byte) 13);
            if (var10 == null || var10.field1261 == null) {
                arg1.field535 = -1;
            } else {
                arg1.field566++;
                if (var10.field1261.length > arg1.field539 && var10.field1260[arg1.field539] < arg1.field566) {
                    arg1.field566 = 1;
                    arg1.field539++;
                    class170.method1085(arg1.field6029, arg1.field6035, class645.field9372 == arg1, (byte) -127, arg1.field539, var10, arg1.field6037);
                }
                if (arg1.field539 >= var10.field1261.length) {
                    arg1.field539 -= var10.field1270;
                    arg1.field596++;
                    if (arg1.field596 >= var10.field1284) {
                        arg1.field535 = -1;
                    } else if (arg1.field539 >= 0 && arg1.field539 < var10.field1261.length) {
                        class170.method1085(arg1.field6029, arg1.field6035, class645.field9372 == arg1, (byte) 52, arg1.field539, var10, arg1.field6037);
                    } else {
                        arg1.field535 = -1;
                    }
                }
                arg1.field595 = arg1.field539 + 1;
                if (arg1.field595 >= var10.field1261.length) {
                    arg1.field595 -= var10.field1270;
                    if (var10.field1284 <= arg1.field596 + 1) {
                        arg1.field595 = -1;
                    } else if (arg1.field595 < 0 || var10.field1261.length <= arg1.field595) {
                        arg1.field595 = -1;
                    }
                }
                arg1.field543 = var10.field1273;
            }
        }
        if (arg1.field584 > 0) {
            arg1.field584--;
        }
        for (int var11 = 0; var11 < arg1.field520.length; var11++) {
            class244 var12 = arg1.field520[var11];
            if (var12 != null) {
                if (var12.field3408 > 0) {
                    var12.field3408--;
                } else {
                    class78 var13 = class331.field4418.method195(var12.field3406, (byte) 13);
                    if (var13 == null || var13.field1261 == null) {
                        arg1.field520[var11] = null;
                    } else {
                        var12.field3409++;
                        if (var12.field3400 < var13.field1261.length && var12.field3409 > var13.field1260[var12.field3400]) {
                            var12.field3400++;
                            var12.field3409 = 1;
                            class170.method1085(arg1.field6029, arg1.field6035, class645.field9372 == arg1, (byte) -118, var12.field3400, var13, arg1.field6037);
                        }
                        if (var13.field1261.length <= var12.field3400) {
                            var12.field3400 -= var13.field1270;
                            var12.field3401++;
                            if (var12.field3401 >= var13.field1284) {
                                arg1.field520[var11] = null;
                            } else if (var12.field3400 >= 0 && var13.field1261.length > var12.field3400) {
                                class170.method1085(arg1.field6029, arg1.field6035, class645.field9372 == arg1, (byte) -122, var12.field3400, var13, arg1.field6037);
                            } else {
                                arg1.field520[var11] = null;
                            }
                        }
                        var12.field3404 = var12.field3400 + 1;
                        if (var12.field3404 >= var13.field1261.length) {
                            var12.field3404 -= var13.field1270;
                            if (var13.field1284 <= var12.field3401 + 1) {
                                var12.field3404 = -1;
                            } else if (var12.field3404 < 0 || var13.field1261.length <= var12.field3404) {
                                var12.field3404 = -1;
                            }
                        }
                    }
                }
            }
        }
    }
}
