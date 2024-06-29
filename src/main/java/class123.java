import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class123 {

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "I")
    public static int field1751 = 0;

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "Lqj;")
    public static class196 field1755 = class80.method502("Cabbage", -48);

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!gj", name = "i", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "Log;")
    public static class38 field1750;

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "[I")
    public static int[] field1756;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIIIII)I")
    public static final int method750(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg4 & 0x1) == 1) {
            int var7 = arg1;
            arg1 = arg2;
            arg2 = var7;
        }
        field1754++;
        int var8 = arg5 & 0x3;
        if (var8 == 0) {
            return arg3;
        }
        if (arg0 != 11158) {
            field1750 = null;
        }
        if (var8 == 1) {
            return arg6;
        } else if (var8 == 2) {
            return 7 + 1 - arg3 - arg1;
        } else {
            return 1 + 7 - arg2 - arg6;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ZI)[B")
    public static final synchronized byte[] method751(boolean arg0, int arg1) {
        field1752++;
        if (arg1 == 100 && class96.field1412 > 0) {
            byte[] var2 = class127.field1795[--class96.field1412];
            class127.field1795[class96.field1412] = null;
            return var2;
        }
        if (!arg0) {
            field1751 = 23;
        }
        if (arg1 == 5000 && class150.field2413 > 0) {
            byte[] var3 = class225.field4042[--class150.field2413];
            class225.field4042[class150.field2413] = null;
            return var3;
        } else if (arg1 == 30000 && class109.field1560 > 0) {
            byte[] var4 = class6.field56[--class109.field1560];
            class6.field56[class109.field1560] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)V")
    public static void method752(byte arg0) {
        field1750 = null;
        field1756 = null;
        if (arg0 > 82) {
            field1755 = null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IBIII)V")
    public static final void method753(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field1757++;
        if (arg1 != 64) {
            field1756 = null;
        }
        if (arg2 >= class93.field1361 && arg2 <= class23.field291) {
            int var5 = class186.method1217(class188.field3296, class95.field1388, arg3, 18291);
            int var6 = class186.method1217(class188.field3296, class95.field1388, arg4, arg1 + 18227);
            class166.method1071(var6, var5, arg0, -95, arg2);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIIILp;ZII)V")
    public static final void method754(int arg0, int arg1, int arg2, int arg3, int arg4, class56 arg5, boolean arg6, int arg7, int arg8) {
        field1749++;
        if (arg1 >= 0 && arg1 < 104 && arg8 >= 0 && arg8 < 104) {
            if (!arg6) {
                class88.field1300[arg7][arg1][arg8] = 0;
            }
            while (true) {
                int var9 = arg5.method367(1);
                if (var9 == 0) {
                    if (arg6) {
                        class42.field480[0][arg1][arg8] = class203.field3667[0][arg1][arg8];
                    } else if (arg7 == 0) {
                        class42.field480[0][arg1][arg8] = -class5.method19(arg1 + arg0 + 932731, arg8 - -arg4 + 556238, -118) * 8;
                    } else {
                        class42.field480[arg7][arg1][arg8] = class42.field480[arg7 - 1][arg1][arg8] - 240;
                    }
                    break;
                }
                if (var9 == 1) {
                    int var10 = arg5.method367(1);
                    if (arg6) {
                        class42.field480[0][arg1][arg8] = var10 * 8 + class203.field3667[0][arg1][arg8];
                    } else {
                        if (var10 == 1) {
                            var10 = 0;
                        }
                        if (arg7 == 0) {
                            class42.field480[0][arg1][arg8] = -var10 * 8;
                        } else {
                            class42.field480[arg7][arg1][arg8] = class42.field480[arg7 - 1][arg1][arg8] - var10 * 8;
                        }
                    }
                    break;
                }
                if (var9 <= 49) {
                    class87.field1287[arg7][arg1][arg8] = arg5.method350(16);
                    class195.field3433[arg7][arg1][arg8] = (byte) ((var9 - 2) / 4);
                    class10.field107[arg7][arg1][arg8] = (byte) class65.method409(var9 + arg3 - 2, 3);
                } else if (var9 > 81) {
                    class150.field2415[arg7][arg1][arg8] = (byte) (var9 - 81);
                } else if (!arg6) {
                    class88.field1300[arg7][arg1][arg8] = (byte) (var9 - 49);
                }
            }
        } else {
            while (true) {
                int var11 = arg5.method367(1);
                if (var11 == 0) {
                    break;
                }
                if (var11 == 1) {
                    arg5.method367(1);
                    break;
                }
                if (var11 <= 49) {
                    arg5.method367(1);
                }
            }
        }
        int var12 = -98 / ((68 - arg2) / 47);
    }
}
