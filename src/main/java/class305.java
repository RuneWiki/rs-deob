import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class305 {

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "Lwm;")
    public static class152 field5240 = class157.method1048("cookiehost", 100);

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "I")
    public static int field5245 = 0;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "[I")
    public static int[] field5243 = new int[1000];

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "I")
    public static int field5239;

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "I")
    public static int field5241;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
    public static int field5242;

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "I")
    public static int field5246;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "Lrd;")
    public static class171 field5238;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "[Lbg;")
    public static class203[] field5244;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V", line = 30)
    public static void method2126(int arg0) {
        field5244 = null;
        field5243 = null;
        field5240 = null;
        field5238 = null;
        if (arg0 != 0) {
            field5245 = 22;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)[Llb;", line = 43)
    public static final class210[] method2127(byte arg0) {
        if (class260.field4455 == null) {
            class210[] var1 = class185.method1229(class34.field572, 83);
            int var2 = 0;
            class210[] var3 = new class210[var1.length];
            label58: for (int var4 = 0; var4 < var1.length; var4++) {
                class210 var5 = var1[var4];
                if ((var5.field3414 <= 0 || var5.field3414 >= 24) && var5.field3412 >= 800 && var5.field3411 >= 600) {
                    for (int var6 = 0; var6 < var2; var6++) {
                        class210 var7 = var3[var6];
                        if (var5.field3412 == var7.field3412 && var5.field3411 == var7.field3411) {
                            if (var5.field3414 > var7.field3414) {
                                var3[var6] = var5;
                            }
                            continue label58;
                        }
                    }
                    var3[var2] = var5;
                    var2++;
                }
            }
            class260.field4455 = new class210[var2];
            class187.method1244(var3, 0, class260.field4455, 0, var2);
            int[] var8 = new int[class260.field4455.length];
            for (int var9 = 0; var9 < class260.field4455.length; var9++) {
                class210 var10 = class260.field4455[var9];
                var8[var9] = var10.field3412 * var10.field3411;
            }
            class295.method2041(var8, class260.field4455, (byte) 55);
        }
        field5241++;
        if (arg0 > -41) {
            field5244 = (class203[]) null;
        }
        return class260.field4455;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IZ)V", line = 118)
    public static final void method2128(int arg0, boolean arg1) {
        class66.field995 = new int[104];
        if (arg0 <= 89) {
            method2129(96, 66, 120, -88, 64, -81, (class141) null, 14, (class271) null, -110, 106, -20, false, -68);
        }
        class101.field1469 = new int[104];
        class97.field1391 = 99;
        class219.field3563 = new int[104];
        class27.field465 = new int[104];
        class323.field5644 = new int[104];
        field5239++;
        byte var2;
        if (arg1) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class195.field3115 = new byte[var2][104][104];
        class234.field3839 = new byte[var2][104][104];
        class117.field1661 = new byte[var2][104][104];
        class60.field912 = new byte[var2][104][104];
        class281.field4797 = new int[var2][105][105];
        class199.field3218 = new byte[var2][105][105];
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIIILuj;ILw;IIIZI)Lw;", line = 148)
    public static final class271 method2129(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class141 arg6, int arg7, class271 arg8, int arg9, int arg10, int arg11, boolean arg12, int arg13) {
        field5246++;
        long var14 = ((long) arg0 << 32) + (long) ((arg2 << 24) + (arg9 << 16) + arg10) + ((long) arg11 << 48);
        class271 var16 = (class271) class121.field1708.method1620(true, var14);
        if (var16 == null) {
            byte var17;
            if (arg10 == 1) {
                var17 = 9;
            } else if (arg10 == 2) {
                var17 = 12;
            } else if (arg10 == 3) {
                var17 = 15;
            } else if (arg10 == 4) {
                var17 = 18;
            } else {
                var17 = 21;
            }
            byte var18 = 3;
            class220 var19 = new class220(var17 * var18 + 1, var17 * 2 * var18 + -var17, 0);
            int[][] var20 = new int[var18][var17];
            int[] var21 = new int[] { 64, 96, 128 };
            int var22 = var19.method1526(0, 0, 0);
            for (int var23 = 0; var23 < var18; var23++) {
                int var24 = var21[var23];
                int var25 = var21[var23];
                for (int var26 = 0; var26 < var17; var26++) {
                    int var27 = (var26 << 11) / var17;
                    int var28 = arg5 + (class181.field2884[var27] * var24) >> 16;
                    int var29 = class181.field2886[var27] * var25 + arg1 >> 16;
                    var20[var23][var26] = var19.method1526(var28, 0, var29);
                }
            }
            for (int var30 = 0; var30 < var18; var30++) {
                int var31 = (var30 * 256 + 128) / var18;
                int var32 = 256 - var31;
                short var33 = (short) (((arg0 & 0x380) * var32 + (arg11 & 0x380) * var31 & 0x38000) + ((arg0 & 0xFC00) * var32 + (arg11 & 0xFC00) * var31 & 0xFC0000) + ((arg0 & 0x7F) * var32 + (arg11 & 0x7F) * var31 & 0x7F00) >> 8);
                byte var34 = (byte) (arg2 * var31 + arg9 * var32 >> 8);
                for (int var35 = 0; var35 < var17; var35++) {
                    if (var30 == 0) {
                        var19.method1515(var22, var20[0][(var35 + 1) % var17], var20[0][var35], (byte) 1, var33, var34);
                    } else {
                        var19.method1515(var20[var30 - 1][var35], var20[var30 - 1][(var35 + 1) % var17], var20[var30][(var35 + 1) % var17], (byte) 1, var33, var34);
                        var19.method1515(var20[var30 - 1][var35], var20[var30][(var35 + 1) % var17], var20[var30][var35], (byte) 1, var33, var34);
                    }
                }
            }
            var16 = var19.method1521(64, 768, -50, -10, -50);
            class121.field1708.method1614(var16, var14, (byte) 78);
        }
        int var36 = arg10 * 64 - 1;
        int var37 = var36;
        int var38 = -var36;
        int var39 = -var36;
        int var40 = arg8.method147();
        int var41 = var36;
        int var42 = arg8.method149();
        int var43 = arg8.method164();
        if (arg12) {
            if (arg7 > 1664 || arg7 < 384) {
                var38 -= 128;
            }
            if (arg7 > 1152 && arg7 < 1920) {
                var37 = var36 + 128;
            }
            if (arg7 > 128 && arg7 < 896) {
                var39 -= 128;
            }
            if (arg7 > 640 && arg7 < 1408) {
                var41 = var36 + 128;
            }
        }
        if (var37 < var42) {
            var42 = var37;
        }
        if (var39 > var40) {
            var40 = var39;
        }
        if (var43 < var38) {
            var43 = var38;
        }
        class93 var44 = null;
        int var45 = arg8.method154();
        if (arg6 != null) {
            int var46 = arg6.field2177[arg3];
            var44 = class137.method867(var46 >> 16, (byte) 93);
            arg3 = var46 & 0xFFFF;
        }
        if (var45 > var41) {
            var45 = var41;
        }
        class271 var47;
        if (var44 == null) {
            var47 = var16.method140(true, true, true);
            var47.method159((var42 - var40) / 2, 128, (var45 - var43) / 2);
            var47.method139((var40 + var42) / 2, 0, (var43 + var45) / 2);
        } else {
            var47 = var16.method140(!var44.method616(arg3, 243), !var44.method614(arg3, 0), true);
            var47.method159((var42 - var40) / 2, 128, (var45 - var43) / 2);
            var47.method139((var40 + var42) / 2, 0, (var43 + var45) / 2);
            var47.method1862(var44, arg3);
        }
        if (arg7 != arg13) {
            var47.method137(arg7);
        }
        if (class217.field3516) {
            class319 var48 = (class319) var47;
            if (arg4 != class154.method1031(65, arg5 + var40, class23.field400, arg1 + var43) || arg4 != class154.method1031(79, arg5 + var42, class23.field400, arg1 + var45)) {
                for (int var49 = 0; var49 < var48.field5524; var49++) {
                    var48.field5520[var49] += class154.method1031(106, var48.field5510[var49] + arg5, class23.field400, var48.field5534[var49] + arg1) - arg4;
                }
                var48.field5536.field1499 = false;
                var48.field5544.field4423 = false;
            }
        } else {
            class21 var50 = (class21) var47;
            if (arg4 != class154.method1031(115, arg5 + var40, class23.field400, arg1 + var43) || arg4 != class154.method1031(92, arg5 + var42, class23.field400, arg1 + var45)) {
                for (int var51 = 0; var51 < var50.field281; var51++) {
                    var50.field297[var51] += class154.method1031(77, var50.field285[var51] + arg5, class23.field400, var50.field293[var51] + arg1) - arg4;
                }
                var50.field302 = false;
            }
        }
        return var47;
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(B)V", line = 381)
    public static final void method2130(byte arg0) {
        class149.field2315.method1613(-22696);
        class148.field2297.method1613(-22696);
        if (arg0 < 86) {
            field5240 = (class152) null;
        }
        field5242++;
        class70.field1012.method1613(-22696);
    }
}
