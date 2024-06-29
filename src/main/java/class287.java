import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public abstract class class287 {

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "I")
    public static int field4900 = -1;

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "I")
    public static int field4904 = 0;

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "[[S")
    public static short[][] field4901 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "S")
    public static short field4905 = 1;

    @OriginalMember(owner = "client!rj", name = "j", descriptor = "Lmh;")
    public static class62 field4908 = class201.method1405(true, "ul");

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
    public static int field4899;

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "I")
    public static int field4902;

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "I")
    public static int field4903;

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "I")
    public static int field4906;

    @OriginalMember(owner = "client!rj", name = "i", descriptor = "I")
    public static int field4907;

    @OriginalMember(owner = "client!rj", name = "k", descriptor = "I")
    public static int field4909;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILab;IIIIZILs;IIZII)Lab;", line = 25)
    public static final class138 method1961(int arg0, class138 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, class96 arg8, int arg9, int arg10, boolean arg11, int arg12, int arg13) {
        long var14 = ((long) arg2 << 48) + ((long) arg7 << 32) + (long) ((arg5 << 16) + (arg13 << 24) + arg4);
        class138 var16 = (class138) class270.field4575.method1396(0, var14);
        field4906++;
        if (var16 == null) {
            byte var17;
            if (arg4 == 1) {
                var17 = 9;
            } else if (arg4 == 2) {
                var17 = 12;
            } else if (arg4 == 3) {
                var17 = 15;
            } else if (arg4 == 4) {
                var17 = 18;
            } else {
                var17 = 21;
            }
            byte var18 = 3;
            int[] var19 = new int[] { 64, 96, 128 };
            class76 var20 = new class76((var17 * var18) + 1, var17 * 2 * var18 + -var17, 0);
            int var21 = var20.method584(0, 0, 0);
            int[][] var22 = new int[var18][var17];
            for (int var23 = 0; var23 < var18; var23++) {
                int var24 = var19[var23];
                int var25 = var19[var23];
                for (int var26 = 0; var26 < var17; var26++) {
                    int var27 = (var26 << 11) / var17;
                    int var28 = class23.field245[var27] * var24 + arg10 >> 16;
                    int var29 = class23.field254[var27] * var25 + arg9 >> 16;
                    var22[var23][var26] = var20.method584(var28, 0, var29);
                }
            }
            for (int var30 = 0; var30 < var18; var30++) {
                int var31 = (var30 * 256 + 128) / var18;
                int var32 = 256 - var31;
                byte var33 = (byte) (arg5 * var32 + arg13 * var31 >> 8);
                short var34 = (short) (((arg2 & 0xFC00) * var31 + (arg7 & 0xFC00) * var32 & 0xFC0000) + ((arg2 & 0x7F) * var31 + (arg7 & 0x7F) * var32 & 0x7F00) + ((arg2 & 0x380) * var31 + (arg7 & 0x380) * var32 & 0x38000) >> 8);
                for (int var35 = 0; var35 < var17; var35++) {
                    if (var30 == 0) {
                        var20.method579(var21, var22[0][(var35 + 1) % var17], var22[0][var35], (byte) 1, var34, var33);
                    } else {
                        var20.method579(var22[var30 - 1][var35], var22[var30 - 1][(var35 + 1) % var17], var22[var30][(var35 + 1) % var17], (byte) 1, var34, var33);
                        var20.method579(var22[var30 - 1][var35], var22[var30][(var35 + 1) % var17], var22[var30][var35], (byte) 1, var34, var33);
                    }
                }
            }
            var16 = var20.method580(64, 768, -50, -10, -50);
            class270.field4575.method1397(var14, var16, !arg11);
        }
        int var36 = arg4 * 64 - 1;
        int var37 = -var36;
        int var38 = var36;
        int var39 = var36;
        int var40 = -var36;
        if (arg6) {
            if (arg3 > 128 && arg3 < 896) {
                var37 -= 128;
            }
            if (arg3 > 640 && arg3 < 1408) {
                var39 = var36 + 128;
            }
            if (arg3 > 1664 || arg3 < 384) {
                var40 -= 128;
            }
            if (arg3 > 1152 && arg3 < 1920) {
                var38 = var36 + 128;
            }
        }
        int var41 = arg1.method504();
        if (var37 > var41) {
            var41 = var37;
        }
        int var42 = arg1.method503();
        if (var38 < var42) {
            var42 = var38;
        }
        if (arg11) {
            field4901 = (short[][]) ((short[][]) null);
        }
        int var43 = arg1.method479();
        if (var43 < var40) {
            var43 = var40;
        }
        class170 var44 = null;
        int var45 = arg1.method478();
        if (var39 < var45) {
            var45 = var39;
        }
        if (arg8 != null) {
            int var46 = arg8.field1586[arg12];
            var44 = class249.method1733(45, var46 >> 16);
            arg12 = var46 & 0xFFFF;
        }
        class138 var47;
        if (var44 == null) {
            var47 = var16.method482(true, true);
            var47.method499((var42 - var41) / 2, 128, (var45 - var43) / 2);
            var47.method477((var41 + var42) / 2, 0, (var43 + var45) / 2);
        } else {
            var47 = var16.method482(!var44.method1223(arg12, (byte) -127), true);
            var47.method499((var42 - var41) / 2, 128, (var45 - var43) / 2);
            var47.method477((var41 + var42) / 2, 0, (var43 + var45) / 2);
            var47.method493(var44, arg12);
        }
        if (arg3 != 0) {
            var47.method500(arg3);
        }
        class213 var48 = (class213) var47;
        if (class165.method1186((byte) -58, arg9 + var43, arg10 - -var41, class7.field85) != arg0 || class165.method1186((byte) -58, arg9 + var45, arg10 + var42, class7.field85) != arg0) {
            for (int var49 = 0; var49 < var48.field3590; var49++) {
                var48.field3587[var49] += class165.method1186((byte) -58, var48.field3583[var49] + arg9, var48.field3581[var49] + arg10, class7.field85) - arg0;
            }
            var48.field3618.field4367 = false;
            var48.field3588.field2532 = false;
        }
        return var47;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)V", line = 236)
    public static final void method1962(int arg0) {
        field4903++;
        if (!class80.field1341) {
            class195.field3293 = 1;
            class286.field4892[0] = 1005;
            if (class218.field3769 != 0) {
                class113.field1883 = class155.field2501;
                class45.field678 = class2.field25;
            } else if (class235.field4049 == 0) {
                class45.field678 = class275.field4725;
                class113.field1883 = class221.field3795;
            } else {
                class45.field678 = class171.field2786;
                class113.field1883 = class207.field3520;
            }
            class146.field2317[0] = class112.field1853;
            class244.field4151[0] = class275.field4694;
        }
        if (class301.field5183 != -1) {
            class37.method249(arg0 - 5618, class301.field5183);
        }
        for (int var1 = 0; var1 < class221.field3805; var1++) {
            if (class220.field3784[var1]) {
                class159.field2560[var1] = true;
            }
            class57.field839[var1] = class220.field3784[var1];
            class220.field3784[var1] = false;
        }
        class102.field1689 = -1;
        class42.field640 = null;
        class230.field3989 = true;
        class304.field5238 = -1;
        class150.field2368 = class199.field3367;
        if (class301.field5183 != -1) {
            class221.field3805 = 0;
            class140.method1046(-1, class60.field878, class301.field5183, 0, 0, 0, 0, (byte) -122, class306.field5258);
        }
        class311.method2110();
        if (arg0 != 5681) {
            field4901 = (short[][]) ((short[][]) null);
        }
        class194.method1365(true);
        if (class80.field1341) {
            class36.method234(3);
        } else if (class102.field1689 != -1) {
            class227.method1607((byte) -116, class304.field5238, class102.field1689);
        }
        if (class32.field444 == 3) {
            for (int var2 = 0; var2 < class221.field3805; var2++) {
                if (class57.field839[var2]) {
                    class311.method2113(class166.field2725[var2], class199.field3362[var2], class161.field2604[var2], class183.field2935[var2], 16711935, 128);
                } else if (class159.field2560[var2]) {
                    class311.method2113(class166.field2725[var2], class199.field3362[var2], class161.field2604[var2], class183.field2935[var2], 16711680, 128);
                }
            }
        }
        class230.method1628(class7.field85, -5060, class268.field4551.field3814, class268.field4551.field3821, class277.field4757);
        class277.field4757 = 0;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)V", line = 354)
    public static void method1963(byte arg0) {
        field4908 = null;
        if (arg0 != 64) {
            method1967((class26) null, true);
        }
        field4901 = (short[][]) null;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIB)V", line = 370)
    public static final void method1964(int arg0, int arg1, byte arg2) {
        field4899++;
        class151 var3 = class165.method1194((byte) 1, 7, arg0);
        var3.method1088(123);
        if (arg2 > 4) {
            var3.field2395 = arg1;
        }
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(I)V", line = 388)
    public static final void method1965(int arg0) {
        class27.field347++;
        class170.field2772.method1693(61, false);
        for (class146 var1 = (class146) class214.field3632.method317(-128); var1 != null; var1 = (class146) class214.field3632.method314(-99)) {
            if (var1.field2309 == 0) {
                class294.method1993(var1, 3, true);
            }
        }
        if (class81.field1354 != null) {
            class250.method1744(class81.field1354, (byte) -62);
            class81.field1354 = null;
        }
        field4907++;
        if (arg0 != 0) {
            field4908 = (class62) null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILsg;)V", line = 422)
    public static final void method1966(int arg0, class191 arg1) {
        if (arg0 != 128) {
            method1965(29);
        }
        field4909++;
        class191 var2 = class72.method515(arg1, -72);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class60.field878;
            var4 = class306.field5258;
        } else {
            var3 = var2.field3126;
            var4 = var2.field3190;
        }
        class96.method769(false, var3, arg1, 1, var4);
        class53.method341(var3, 20205, var4, arg1);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lhi;Z)V", line = 459)
    public static final void method1967(class26 arg0, boolean arg1) {
        class260.field4370 = arg0;
        field4902++;
        if (arg1) {
            field4905 = 74;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILbf;)Lbf;")
    public abstract class106 method1197(int arg0, class106 arg1);
}
