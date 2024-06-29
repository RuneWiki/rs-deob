import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class64 {

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "[S")
    public static short[] field924 = new short[256];

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "Loo;")
    public static class629 field919 = new class629(8, 3);

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "Ljava/lang/String;")
    public static String field925 = null;

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "Lqe;")
    public static class469 field926 = new class469(85, 11);

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
    public static int field922;

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "I")
    public static int field923;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)V")
    public static final void method566(int arg0, String arg1, int arg2, String arg3) {
        class654.field9174 = 2;
        int var4 = 29 / ((-arg0 - 28) / 63);
        class92.field1284 = arg2;
        field923++;
        class112.method836(arg1, false, 0, arg3);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V")
    public static void method567(int arg0) {
        field925 = null;
        field926 = null;
        field924 = null;
        field919 = null;
        if (arg0 != -5333) {
            method567(-62);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IZI)Z")
    public static final boolean method568(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            method567(29);
        }
        field921++;
        return class346.method2188(arg0, arg2, false) & class111.method833(arg1, arg0, arg2);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(B[B)V")
    public static final void method569(byte arg0, byte[] arg1) {
        field922++;
        if (arg0 != 71) {
            return;
        }
        class645 var2 = new class645(arg1);
        while (true) {
            int var3;
            label49: do {
                while (true) {
                    while (true) {
                        var3 = var2.method3745(-6314);
                        if (var3 == 0) {
                            return;
                        }
                        if (var3 == 1) {
                            int[] var8 = class559.field7998 = new int[6];
                            var8[0] = var2.method3712((byte) -116);
                            var8[1] = var2.method3712((byte) -112);
                            var8[2] = var2.method3712((byte) 42);
                            var8[3] = var2.method3712((byte) -111);
                            var8[4] = var2.method3712((byte) -123);
                            var8[5] = var2.method3712((byte) 15);
                        } else {
                            if (var3 != 4) {
                                continue label49;
                            }
                            int var6 = var2.method3745(-6314);
                            class229.field3365 = new int[var6];
                            for (int var7 = 0; var7 < var6; var7++) {
                                class229.field3365[var7] = var2.method3712((byte) -126);
                                if (class229.field3365[var7] == 65535) {
                                    class229.field3365[var7] = -1;
                                }
                            }
                        }
                    }
                }
            } while (var3 != 5);
            int var4 = var2.method3745(-6314);
            class600.field8493 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                class600.field8493[var5] = var2.method3712((byte) -114);
                if (class600.field8493[var5] == 65535) {
                    class600.field8493[var5] = -1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIIZZIII[ILtea;III[I)I")
    public static final int method570(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5, int arg6, int arg7, int arg8, int[] arg9, class240 arg10, int arg11, int arg12, int arg13, int[] arg14) {
        for (int var15 = 0; var15 < 128; var15++) {
            for (int var35 = 0; var35 < 128; var35++) {
                class460.field6788[var15][var35] = 0;
                class211.field3179[var15][var35] = 99999999;
            }
        }
        field920++;
        if (arg5) {
            return -100;
        }
        boolean var16;
        if (arg13 == 1) {
            var16 = class93.method732((byte) 114, arg7, arg12, arg0, arg8, arg3, arg2, arg1, arg10, arg6, arg11);
        } else if (arg13 == 2) {
            var16 = class359.method2239(arg7, arg12, arg10, arg6, arg3, -1, arg8, arg1, arg2, arg0, arg11);
        } else {
            var16 = class263.method1697(arg0, arg1, arg11, arg6, 53, arg3, arg8, arg2, arg10, arg13, arg12, arg7);
        }
        int var17 = arg1 - 64;
        int var18 = arg0 - 64;
        int var19 = class630.field8796;
        int var20 = class42.field458;
        if (!var16) {
            if (!arg4) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = arg2 - var23; var24 <= (arg2 + var23); var24++) {
                for (int var25 = arg11 - var23; var25 <= arg11 + var23; var25++) {
                    int var26 = var24 - var17;
                    int var27 = var25 - var18;
                    if (var26 >= 0 && var27 >= 0 && var26 < 128 && var27 < 128 && class211.field3179[var26][var27] < 100) {
                        int var28 = 0;
                        if (arg2 > var24) {
                            var28 = arg2 - var24;
                        } else if (var24 > arg7 + arg2 - 1) {
                            var28 = var24 + 1 - arg2 - arg7;
                        }
                        int var29 = 0;
                        if (var25 < arg11) {
                            var29 = arg11 - var25;
                        } else if ((arg3 + arg11 - 1) < var25) {
                            var29 = var25 - (arg3 + arg11 - 1);
                        }
                        int var30 = var28 * var28 + var29 * var29;
                        if (var30 < var21 || var21 == var30 && class211.field3179[var26][var27] < var22) {
                            var21 = var30;
                            var22 = class211.field3179[var26][var27];
                            var19 = var24;
                            var20 = var25;
                        }
                    }
                }
            }
            if (var21 == Integer.MAX_VALUE) {
                return -1;
            }
        }
        if (arg1 == var19 && arg0 == var20) {
            return 0;
        }
        byte var31 = 0;
        class142.field1864[var31] = var19;
        int var37 = var31 + 1;
        class611.field8637[var31] = var20;
        int var32;
        int var33 = var32 = class460.field6788[var19 - var17][var20 - var18];
        while (arg1 != var19 || arg0 != var20) {
            if (var32 != var33) {
                class142.field1864[var37] = var19;
                var32 = var33;
                class611.field8637[var37++] = var20;
            }
            if ((var33 & 0x2) != 0) {
                var19++;
            } else if ((var33 & 0x8) != 0) {
                var19--;
            }
            if ((var33 & 0x1) != 0) {
                var20++;
            } else if ((var33 & 0x4) != 0) {
                var20--;
            }
            var33 = class460.field6788[var19 - var17][var20 - var18];
        }
        int var34 = 0;
        while (var37-- > 0) {
            arg9[var34] = class142.field1864[var37];
            arg14[var34++] = class611.field8637[var37];
            if (var34 >= arg9.length) {
                break;
            }
        }
        return var34;
    }
}
