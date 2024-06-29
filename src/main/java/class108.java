import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class108 {

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "[Z")
    public static boolean[] field1795 = new boolean[112];

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "Z")
    public static boolean field1799 = false;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "[I")
    public static int[] field1797;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Z)V", line = 6)
    public static final void method823(boolean arg0) {
        field1793++;
        class128 var1 = class302.field4752;
        synchronized (class302.field4752) {
            class61.field954 = class157.field2496;
            class27.field446++;
            if (arg0) {
                if (class206.field3263 < 0) {
                    for (int var2 = 0; var2 < 112; var2++) {
                        field1795[var2] = false;
                    }
                    class206.field3263 = class147.field2374;
                } else {
                    while (class206.field3263 != class147.field2374) {
                        int var3 = class317.field4936[class147.field2374];
                        class147.field2374 = class147.field2374 + 1 & 0x7F;
                        if (var3 < 0) {
                            field1795[~var3] = false;
                        } else {
                            field1795[var3] = true;
                        }
                    }
                }
                class157.field2496 = class242.field3751;
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IBI)V", line = 49)
    public static final void method824(int arg0, byte arg1, int arg2) {
        field1796++;
        if (class213.method1543(25641, arg2)) {
            if (arg1 >= -31) {
                method828(66, (class89) null);
            }
            class230.method1666(class207.field3269[arg2], arg0, -57);
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIZIII)V", line = 80)
    public static final void method825(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field1800++;
        if (arg3) {
            method828(64, (class89) null);
        }
        class210[] var7 = class88.field1341;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class210 var9 = var7[var8];
            if (var9 != null && var9.field3358 == 2) {
                class99.method718(arg2 >> 1, arg1, arg4, (var9.field3361 - class91.field1485 << 7) + var9.field3350, (byte) -67, (var9.field3352 - class177.field2780 << 7) + var9.field3348, var9.field3357 * 2, arg6 >> 1);
                if (class326.field5065 > -1 && class205.field3252 % 20 < 10) {
                    class293.field4614[var9.field3360].method59(class326.field5065 + arg5 - 12, arg0 + -28 - -class67.field1080);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(BIIIIIII)V", line = 112)
    public static final void method826(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = 0;
        int var9 = arg2;
        int var10 = 0;
        field1798++;
        int var11 = arg2 - arg3;
        int var12 = arg1 * arg1;
        int var13 = arg2 * arg2;
        int var14 = arg1 - arg3;
        int var15 = var14 * var14;
        int var16 = var11 * var11;
        int var17 = var13 << 1;
        int var18 = var12 << 1;
        int var19 = var16 << 1;
        int var20 = var11 << 1;
        int var21 = var15 << 1;
        int var22 = arg2 << 1;
        int var23 = (1 - var22) * var12 + var17;
        int var24 = var13 - ((var22 - 1) * var18);
        int var25 = (1 - var20) * var15 + var19;
        int var26 = var16 - ((var20 - 1) * var21);
        int var27 = var13 << 2;
        int var28 = var12 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = (var22 - 3) * var18;
        int var32 = var17 * 3;
        int var33 = var19 * 3;
        int var34 = (var20 - 3) * var21;
        int var35 = (arg2 - 1) * var28;
        int var36 = var27;
        int var37 = var30;
        if (arg0 != -7) {
            return;
        }
        if (arg7 >= class188.field2995 && class195.field3108 >= arg7) {
            int[] var38 = class102.field1729[arg7];
            int var39 = class308.method2129(arg4 - arg1, class116.field1888, class319.field4965, 1252946087);
            int var40 = class308.method2129(arg1 + arg4, class116.field1888, class319.field4965, 1252946087);
            int var41 = class308.method2129(arg4 - var14, class116.field1888, class319.field4965, arg0 ^ 0xB5518F5E);
            int var42 = class308.method2129(arg4 + var14, class116.field1888, class319.field4965, arg0 + 1252946094);
            class86.method614(arg6, -24891, var41, var39, var38);
            class86.method614(arg5, -24891, var42, var41, var38);
            class86.method614(arg6, -24891, var40, var42, var38);
        }
        int var43 = (var11 - 1) * var29;
        while (var9 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var8++;
                    var24 += var36;
                    var36 += var27;
                    var23 += var32;
                    var32 += var27;
                }
            }
            if (var24 < 0) {
                var24 += var36;
                var23 += var32;
                var36 += var27;
                var32 += var27;
                var8++;
            }
            var24 += -var31;
            var31 -= var28;
            var23 += -var35;
            var35 -= var28;
            boolean var44 = var9 <= var11;
            var9--;
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var33;
                        var33 += var30;
                        var26 += var37;
                        var37 += var30;
                        var10++;
                    }
                }
                if (var26 < 0) {
                    var10++;
                    var26 += var37;
                    var25 += var33;
                    var37 += var30;
                    var33 += var30;
                }
                var26 += -var34;
                var25 += -var43;
                var34 -= var29;
                var43 -= var29;
            }
            int var45 = arg7 - var9;
            int var46 = arg7 + var9;
            if (var46 >= class188.field2995 && class195.field3108 >= var45) {
                int var47 = class308.method2129(arg4 + var8, class116.field1888, class319.field4965, 1252946087);
                int var48 = class308.method2129(arg4 - var8, class116.field1888, class319.field4965, 1252946087);
                if (var44) {
                    int var49 = class308.method2129(arg4 + var10, class116.field1888, class319.field4965, arg0 ^ 0xB5518F5E);
                    int var50 = class308.method2129(arg4 - var10, class116.field1888, class319.field4965, arg0 ^ 0xB5518F5E);
                    if (class188.field2995 <= var45) {
                        int[] var51 = class102.field1729[var45];
                        class86.method614(arg6, -24891, var50, var48, var51);
                        class86.method614(arg5, -24891, var49, var50, var51);
                        class86.method614(arg6, arg0 ^ 0x613C, var47, var49, var51);
                    }
                    if (var46 <= class195.field3108) {
                        int[] var52 = class102.field1729[var46];
                        class86.method614(arg6, arg0 - 24884, var50, var48, var52);
                        class86.method614(arg5, arg0 - 24884, var49, var50, var52);
                        class86.method614(arg6, -24891, var47, var49, var52);
                    }
                } else {
                    if (var45 >= class188.field2995) {
                        class86.method614(arg6, -24891, var47, var48, class102.field1729[var45]);
                    }
                    if (var46 <= class195.field3108) {
                        class86.method614(arg6, -24891, var47, var48, class102.field1729[var46]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V", line = 327)
    public static void method827(int arg0) {
        if (arg0 >= -17) {
            method823(true);
        }
        field1797 = null;
        field1795 = null;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILwl;)V", line = 350)
    public static final void method828(int arg0, class89 arg1) {
        field1794++;
        arg1.field1450 = false;
        if (arg1.field1453 != -1) {
            class269 var2 = class6.method28(arg1.field1453, arg0 ^ 0xFFFFFFFD);
            if (var2 == null || var2.field4183 == null) {
                arg1.field1453 = -1;
            } else {
                arg1.field1373++;
                if (arg1.field1438 < var2.field4183.length && var2.field4165[arg1.field1438] < arg1.field1373) {
                    arg1.field1430++;
                    arg1.field1438++;
                    arg1.field1373 = 1;
                    class89.method632(var2, arg1.field1442, (byte) 93, arg1.field1369, class19.field356 == arg1, arg1.field1438);
                }
                if (arg1.field1438 >= var2.field4183.length) {
                    arg1.field1438 = 0;
                    arg1.field1373 = 0;
                    class89.method632(var2, arg1.field1442, (byte) 117, arg1.field1369, class19.field356 == arg1, arg1.field1438);
                }
                arg1.field1430 = arg1.field1438 + 1;
                if (var2.field4183.length <= arg1.field1430) {
                    arg1.field1430 = 0;
                }
            }
        }
        if (arg1.field1417 != arg0 && class205.field3252 >= arg1.field1461) {
            int var3 = class136.method1042((byte) 122, arg1.field1417).field1477;
            if (var3 == -1) {
                arg1.field1417 = -1;
            } else {
                class269 var4 = class6.method28(var3, 2);
                if (var4 == null || var4.field4183 == null) {
                    arg1.field1417 = -1;
                } else {
                    if (arg1.field1449 < 0) {
                        arg1.field1449 = 0;
                        class89.method632(var4, arg1.field1442, (byte) 116, arg1.field1369, class19.field356 == arg1, 0);
                    }
                    arg1.field1440++;
                    if (arg1.field1449 < var4.field4183.length && arg1.field1440 > var4.field4165[arg1.field1449]) {
                        arg1.field1440 = 1;
                        arg1.field1449++;
                        class89.method632(var4, arg1.field1442, (byte) 90, arg1.field1369, class19.field356 == arg1, arg1.field1449);
                    }
                    if (arg1.field1449 >= var4.field4183.length) {
                        arg1.field1417 = -1;
                    }
                    arg1.field1370 = arg1.field1449 + 1;
                    if (arg1.field1370 >= var4.field4183.length) {
                        arg1.field1370 = -1;
                    }
                }
            }
        }
        if (arg1.field1458 != -1 && arg1.field1398 <= 1) {
            class269 var5 = class6.method28(arg1.field1458, arg0 ^ 0xFFFFFFFD);
            if (var5.field4176 == 1 && arg1.field1434 > 0 && arg1.field1415 <= class205.field3252 && arg1.field1376 < class205.field3252) {
                arg1.field1398 = 1;
                return;
            }
        }
        if (arg1.field1458 != -1 && arg1.field1398 == 0) {
            class269 var6 = class6.method28(arg1.field1458, 2);
            if (var6 == null || var6.field4183 == null) {
                arg1.field1458 = -1;
            } else {
                arg1.field1401++;
                if (arg1.field1414 < var6.field4183.length && var6.field4165[arg1.field1414] < arg1.field1401) {
                    arg1.field1414++;
                    arg1.field1401 = 1;
                    class89.method632(var6, arg1.field1442, (byte) 127, arg1.field1369, class19.field356 == arg1, arg1.field1414);
                }
                if (arg1.field1414 >= var6.field4183.length) {
                    arg1.field1410++;
                    arg1.field1414 -= var6.field4174;
                    if (arg1.field1410 >= var6.field4189) {
                        arg1.field1458 = -1;
                    } else if (arg1.field1414 >= 0 && arg1.field1414 < var6.field4183.length) {
                        class89.method632(var6, arg1.field1442, (byte) 118, arg1.field1369, class19.field356 == arg1, arg1.field1414);
                    } else {
                        arg1.field1458 = -1;
                    }
                }
                arg1.field1422 = arg1.field1414 + 1;
                if (arg1.field1422 >= var6.field4183.length) {
                    arg1.field1422 -= var6.field4174;
                    if (arg1.field1410 + 1 >= var6.field4189) {
                        arg1.field1422 = -1;
                    } else if (arg1.field1422 < 0 || var6.field4183.length <= arg1.field1422) {
                        arg1.field1422 = -1;
                    }
                }
                arg1.field1450 = var6.field4180;
            }
        }
        if (arg1.field1398 > 0) {
            arg1.field1398--;
        }
        for (int var7 = 0; var7 < arg1.field1385.length; var7++) {
            class18 var8 = arg1.field1385[var7];
            if (var8 != null) {
                if (var8.field342 > 0) {
                    var8.field342--;
                } else {
                    class269 var9 = class6.method28(var8.field347, 2);
                    if (var9 == null || var9.field4183 == null) {
                        arg1.field1385[var7] = null;
                    } else {
                        var8.field351++;
                        if (var8.field341 < var9.field4183.length && var9.field4165[var8.field341] < var8.field351) {
                            var8.field351 = 1;
                            var8.field341++;
                            class89.method632(var9, arg1.field1442, (byte) 96, arg1.field1369, class19.field356 == arg1, var8.field341);
                        }
                        if (var8.field341 >= var9.field4183.length) {
                            var8.field341 -= var9.field4174;
                            var8.field348++;
                            if (var9.field4189 <= var8.field348) {
                                arg1.field1385[var7] = null;
                            } else if (var8.field341 >= 0 && var8.field341 < var9.field4183.length) {
                                class89.method632(var9, arg1.field1442, (byte) 112, arg1.field1369, class19.field356 == arg1, var8.field341);
                            } else {
                                arg1.field1385[var7] = null;
                            }
                        }
                        var8.field349 = var8.field341 + 1;
                        if (var9.field4183.length <= var8.field349) {
                            var8.field349 -= var9.field4174;
                            if ((var8.field348 + 1) >= var9.field4189) {
                                var8.field349 = -1;
                            } else if (var8.field349 < 0 || var8.field349 >= var9.field4183.length) {
                                var8.field349 = -1;
                            }
                        }
                    }
                }
            }
        }
    }
}
