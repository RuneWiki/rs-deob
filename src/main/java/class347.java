import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class347 {

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "I")
    public static int field5173;

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "I")
    public static int field5174;

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "I")
    public static int field5175;

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "I")
    public static int field5176;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Z)V", line = 3)
    public static final void method2295(boolean arg0) {
        field5173++;
        class399.field5852.method372(121);
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIII)V", line = 15)
    public static final void method2296(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5175++;
        class440 var5 = class186.method1241(arg0, 10, (byte) 56);
        var5.method2756(-1369656528);
        var5.field6375 = arg4;
        if (arg1 == 2) {
            var5.field6374 = arg2;
            var5.field6379 = arg3;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)V", line = 33)
    public static final void method2297(int arg0, int arg1) {
        if (arg1 != -25721) {
            return;
        }
        field5176++;
        if (arg0 == 0) {
            return;
        }
        if (arg0 == 1) {
            class386.method2503(false);
        } else if (arg0 == 2) {
            class410.method2593(-113);
        } else if (arg0 == 3) {
            class145.method1006(false);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ZIILsj;I)V", line = 64)
    public static final void method2298(boolean arg0, int arg1, int arg2, class248 arg3, int arg4) {
        field5174++;
        int var5 = arg3.field3531;
        if (arg3.field3545 == 0) {
            arg3.field3531 = arg3.field3567;
        } else if (arg3.field3545 == 1) {
            arg3.field3531 = arg4 - arg3.field3567;
        } else if (arg3.field3545 == 2) {
            arg3.field3531 = arg3.field3567 * arg4 >> 14;
        } else if (arg3.field3545 == 3) {
            if (arg3.field3555 == 2) {
                arg3.field3531 = arg3.field3567 * 32 + ((arg3.field3567 - 1) * arg3.field3519);
            } else if (arg3.field3555 == 7) {
                arg3.field3531 = (arg3.field3567 - 1) * arg3.field3519 + arg3.field3567 * 115;
            }
        }
        if (arg2 != -11402) {
            return;
        }
        int var6 = arg3.field3564;
        if (arg3.field3658 == 0) {
            arg3.field3564 = arg3.field3661;
        } else if (arg3.field3658 == 1) {
            arg3.field3564 = arg1 - arg3.field3661;
        } else if (arg3.field3658 == 2) {
            arg3.field3564 = arg3.field3661 * arg1 >> 14;
        } else if (arg3.field3658 == 3) {
            if (arg3.field3555 == 2) {
                arg3.field3564 = (arg3.field3661 - 1) * arg3.field3664 + arg3.field3661 * 32;
            } else if (arg3.field3555 == 7) {
                arg3.field3564 = (arg3.field3661 - 1) * arg3.field3664 + arg3.field3661 * 12;
            }
        }
        if (arg3.field3545 == 4) {
            arg3.field3531 = arg3.field3630 * arg3.field3564 / arg3.field3533;
        }
        if (arg3.field3658 == 4) {
            arg3.field3564 = arg3.field3533 * arg3.field3531 / arg3.field3630;
        }
        if (class126.field1649 && (client.method402(arg3).field3108 != 0 || arg3.field3555 == 0)) {
            if (arg3.field3564 < 5 && arg3.field3531 < 5) {
                arg3.field3564 = 5;
                arg3.field3531 = 5;
            } else {
                if (arg3.field3531 <= 0) {
                    arg3.field3531 = 5;
                }
                if (arg3.field3564 <= 0) {
                    arg3.field3564 = 5;
                }
            }
        }
        if (arg3.field3624 == 1337) {
            class427.field6213 = arg3;
        }
        if (arg0 && arg3.field3648 != null && arg3.field3531 != var5 || arg3.field3564 != var6) {
            class452 var7 = new class452();
            var7.field6571 = arg3;
            var7.field6570 = arg3.field3648;
            class406.field5894.method1560(-109, var7);
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lro;)V", line = 172)
    public static final void method2299(class407 arg0) {
        for (int var1 = arg0.field5917; var1 <= arg0.field5924; var1++) {
            for (int var2 = arg0.field5918; var2 <= arg0.field5920; var2++) {
                class77 var3 = class106.field1405[arg0.field5922][var1][var2];
                if (var3 != null) {
                    class356 var4 = var3.field1064;
                    class356 var5 = null;
                    while (var4 != null) {
                        if (var4.field5274 == arg0) {
                            if (var5 == null) {
                                var3.field1064 = var4.field5275;
                            } else {
                                var5.field5275 = var4.field5275;
                            }
                            var4.method2341(262144);
                            break;
                        }
                        var5 = var4;
                        var4 = var4.field5275;
                    }
                    var3.field1075 = 0;
                    for (class356 var6 = var3.field1064; var6 != null; var6 = var6.field5275) {
                        var3.field1075 = (byte) (var3.field1075 | var6.field5267);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(II)V", line = 224)
    public static final void method2300(int arg0, int arg1) {
        class308 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class193 var4 = class142.field1804[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class186.field2554; var5++) {
                    for (int var6 = 0; var6 < class108.field1421; var6++) {
                        var2 = var4.method735(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << 7;
                            int var8 = var5 << 7;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class193 var10 = class142.field1804[var9];
                                if (var10 != null) {
                                    int var11 = var4.method722(var6, var5) - var10.method722(var6, var5);
                                    int var12 = var4.method722(var6 + 1, var5) - var10.method722(var6 + 1, var5);
                                    int var13 = var4.method722(var6 + 1, var5 + 1) - var10.method722(var6 + 1, var5 + 1);
                                    int var14 = var4.method722(var6, var5 + 1) - var10.method722(var6, var5 + 1);
                                    var10.method733(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
