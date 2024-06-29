import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public abstract class class64 {

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "Lsf;")
    public static class108 field1027 = class140.method973(255, " )2> ");

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "Lsf;")
    public static class108 field1026 = class140.method973(255, " zuerst von Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "Lsf;")
    public static class108 field1033 = class140.method973(255, "::serverjs5drop");

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "[[Z")
    public static boolean[][] field1034 = new boolean[][] { { true, true, true }, { false, false }, { false, true }, { true, false }, { false, true, true }, { true, false, true }, { false, true, false }, { true, false, false } };

    @OriginalMember(owner = "client!ja", name = "o", descriptor = "Lsf;")
    private static class108 field1036 = class140.method973(255, "Discard");

    @OriginalMember(owner = "client!ja", name = "k", descriptor = "Lsf;")
    public static class108 field1032 = field1036;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "I")
    public static int field1022;

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!ja", name = "n", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "Lvc;")
    public static class193 field1030;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIZLke;IILjh;IIIII)Lke;", line = 8)
    public static final class113 method441(int arg0, int arg1, int arg2, int arg3, boolean arg4, class113 arg5, int arg6, int arg7, class272 arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        long var14 = ((long) arg3 << 48) + ((long) arg11 << 32) + (long) ((arg6 << 16) + arg12 - -(arg10 << 24));
        field1029++;
        class113 var16 = (class113) class327.field5579.method642(var14, (byte) -124);
        if (arg1 != -1153) {
            return (class113) null;
        }
        if (var16 == null) {
            byte var17;
            if (arg12 == 1) {
                var17 = 9;
            } else if (arg12 == 2) {
                var17 = 12;
            } else if (arg12 == 3) {
                var17 = 15;
            } else if (arg12 == 4) {
                var17 = 18;
            } else {
                var17 = 21;
            }
            byte var18 = 3;
            int[] var19 = new int[] { 64, 96, 128 };
            class230 var20 = new class230((var17 * var18) + 1, var17 * var18 * 2 - var17, 0);
            int[][] var21 = new int[var18][var17];
            int var22 = var20.method1545(0, 0, 0);
            for (int var23 = 0; var23 < var18; var23++) {
                int var24 = var19[var23];
                int var25 = var19[var23];
                for (int var26 = 0; var26 < var17; var26++) {
                    int var27 = (var26 << 11) / var17;
                    int var28 = class263.field4653[var27] * var24 + arg13 >> 16;
                    int var29 = class263.field4649[var27] * var25 + arg2 >> 16;
                    var21[var23][var26] = var20.method1545(var28, 0, var29);
                }
            }
            for (int var30 = 0; var30 < var18; var30++) {
                int var31 = (var30 * 256 + 128) / var18;
                int var32 = 256 - var31;
                byte var33 = (byte) (arg6 * var32 + arg10 * var31 >> 8);
                short var34 = (short) (((arg3 & 0x7F) * var31 + (arg11 & 0x7F) * var32 & 0x7F00) + ((arg3 & 0xFC00) * var31 + (arg11 & 0xFC00) * var32 & 0xFC0000) + ((arg3 & 0x380) * var31 + (arg11 & 0x380) * var32 & 0x38000) >> 8);
                for (int var35 = 0; var35 < var17; var35++) {
                    if (var30 == 0) {
                        var20.method1561(var22, var21[0][(var35 + 1) % var17], var21[0][var35], (byte) 1, var34, var33);
                    } else {
                        var20.method1561(var21[var30 - 1][var35], var21[var30 - 1][(var35 + 1) % var17], var21[var30][(var35 + 1) % var17], (byte) 1, var34, var33);
                        var20.method1561(var21[var30 - 1][var35], var21[var30][(var35 + 1) % var17], var21[var30][var35], (byte) 1, var34, var33);
                    }
                }
            }
            var16 = var20.method1555(64, 768, -50, -10, -50);
            class327.field5579.method643((byte) -49, var14, var16);
        }
        int var36 = arg12 * 64 - 1;
        int var37 = var36;
        int var38 = var36;
        int var39 = -var36;
        int var40 = arg5.method292();
        int var41 = arg5.method282();
        int var42 = arg5.method289();
        int var43 = -var36;
        int var44 = arg5.method314();
        class284 var45 = null;
        if (arg4) {
            if (arg0 > 1152 && arg0 < 1920) {
                var37 = var36 + 128;
            }
            if (arg0 > 128 && arg0 < 896) {
                var43 -= 128;
            }
            if (arg0 > 640 && arg0 < 1408) {
                var38 = var36 + 128;
            }
            if (arg0 > 1664 || arg0 < 384) {
                var39 -= 128;
            }
        }
        if (var40 < var43) {
            var40 = var43;
        }
        if (var44 > var38) {
            var44 = var38;
        }
        if (var39 > var42) {
            var42 = var39;
        }
        if (arg8 != null) {
            int var46 = arg8.field4774[arg7];
            var45 = class291.method2083(var46 >> 16, arg1 ^ 0x4FF);
            arg7 = var46 & 0xFFFF;
        }
        if (var37 < var41) {
            var41 = var37;
        }
        class113 var47;
        if (var45 == null) {
            var47 = var16.method288(true, true);
            var47.method304((var41 - var40) / 2, 128, (var44 - var42) / 2);
            var47.method312((var40 + var41) / 2, 0, (var42 + var44) / 2);
        } else {
            var47 = var16.method288(!var45.method2039(arg7, (byte) -126), true);
            var47.method304((var41 - var40) / 2, 128, (var44 - var42) / 2);
            var47.method312((var40 + var41) / 2, 0, (var42 + var44) / 2);
            var47.method310(var45, arg7);
        }
        if (arg0 != 0) {
            var47.method306(arg0);
        }
        if (class231.field4051) {
            class148 var50 = (class148) var47;
            if (arg9 != class45.method321(-73, arg2 + var42, arg13 + var40, class295.field5159) || arg9 != class45.method321(126, arg2 + var44, arg13 - -var41, class295.field5159)) {
                for (int var51 = 0; var51 < var50.field2671; var51++) {
                    var50.field2692[var51] += class45.method321(class84.method565(arg1, 1248), var50.field2674[var51] + arg2, var50.field2679[var51] + arg13, class295.field5159) - arg9;
                }
                var50.field2686.field4891 = false;
                var50.field2667.field4429 = false;
            }
        } else {
            class44 var48 = (class44) var47;
            if (arg9 != class45.method321(115, arg2 + var42, arg13 + var40, class295.field5159) || arg9 != class45.method321(109, arg2 + var44, arg13 + var41, class295.field5159)) {
                for (int var49 = 0; var49 < var48.field583; var49++) {
                    var48.field574[var49] += class45.method321(122, var48.field599[var49] + arg2, var48.field586[var49] + arg13, class295.field5159) - arg9;
                }
                var48.field572 = false;
            }
        }
        return var47;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)V", line = 236)
    public static final void method442(int arg0, int arg1, int arg2) {
        if (arg0 > -31) {
            field1024 = 109;
        }
        field1023++;
        class120 var3 = class248.method1704(7, 97, arg1);
        var3.method844((byte) -28);
        var3.field2066 = arg2;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V", line = 250)
    public static final void method443(int arg0) {
        field1035++;
        class330 var1 = class229.field3987;
        synchronized (class229.field3987) {
            class8.field93 = class108.field1853;
            class114.field1984++;
            if (class206.field3693 >= 0) {
                while (class301.field5233 != class206.field3693) {
                    int var3 = class17.field213[class301.field5233];
                    class301.field5233 = class301.field5233 + 1 & 0x7F;
                    if (var3 < 0) {
                        class144.field2529[~var3] = false;
                    } else {
                        class144.field2529[var3] = true;
                    }
                }
            } else {
                for (int var2 = 0; var2 < 112; var2++) {
                    class144.field2529[var2] = false;
                }
                class206.field3693 = class301.field5233;
            }
            class108.field1853 = class200.field3614;
        }
        if (arg0 >= -91) {
            method442(36, -23, 5);
        }
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)V", line = 297)
    public static void method444(int arg0) {
        field1034 = (boolean[][]) null;
        field1026 = null;
        field1027 = null;
        if (arg0 == 96) {
            field1032 = null;
            field1030 = null;
            field1036 = null;
            field1033 = null;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Z)V", line = 316)
    public static final void method445(boolean arg0) {
        if (!arg0) {
            return;
        }
        field1025++;
        try {
            if (class305.field5312 == 1) {
                int var1 = class324.field5531.method1195(-118);
                if (var1 > 0 && class324.field5531.method1219(-115)) {
                    int var2 = var1 - class223.field3951;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class324.field5531.method1182(arg0, var2);
                    return;
                }
                class324.field5531.method1214(0);
                class324.field5531.method1194(-26612);
                if (class1.field23 == null) {
                    class305.field5312 = 0;
                } else {
                    class305.field5312 = 2;
                }
                class212.field3780 = null;
                class320.field5480 = null;
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class324.field5531.method1214(0);
            class320.field5480 = null;
            class212.field3780 = null;
            class305.field5312 = 0;
            class1.field23 = null;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)I", line = 363)
    public static final int method446(int arg0, int arg1) {
        field1031++;
        return arg1 <= 49 ? -41 : arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(I)V", line = 375)
    public static final void method447(int arg0) {
        if (arg0 != 127) {
            field1033 = (class108) null;
        }
        field1028++;
        class99.field1750.method644((byte) 108);
        class145.field2598.method644((byte) 124);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Laa;I)Laa;")
    public abstract class9 method440(class9 arg0, int arg1);
}
