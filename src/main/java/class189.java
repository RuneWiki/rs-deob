import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class189 {

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "Llc;")
    private static class143 field3417 = class66.method374(" has logged out)3", -1);

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "Z")
    public static boolean field3418 = true;

    @OriginalMember(owner = "client!wj", name = "i", descriptor = "Llc;")
    public static class143 field3423 = class66.method374("Speicher wird zugewiesen)3", -1);

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "I")
    public static int field3420 = 0;

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "Llc;")
    public static class143 field3422 = field3417;

    @OriginalMember(owner = "client!wj", name = "k", descriptor = "J")
    public static long field3425 = 0L;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!wj", name = "j", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "client!wj", name = "l", descriptor = "I")
    public static int field3426;

    @OriginalMember(owner = "client!wj", name = "m", descriptor = "I")
    public static int field3427;

    @OriginalMember(owner = "client!wj", name = "n", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "Z")
    public static boolean field3419;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lgf;III)Z")
    public static final boolean method1223(class7 arg0, int arg1, int arg2, int arg3) {
        byte[] var4 = arg0.method41(-18328, arg3, arg1);
        if (arg2 <= 19) {
            method1223((class7) null, -121, 99, 52);
        }
        field3426++;
        if (var4 == null) {
            return false;
        } else {
            class246.method1633(var4, 8);
            return true;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIIBIZ)V")
    public static final void method1224(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, boolean arg6) {
        class155.field2793 = arg0;
        if (arg4 <= 123) {
            field3424 = 108;
        }
        class247.field4441 = arg3;
        class66.field1231 = arg1;
        class168.field3003 = arg2;
        field3428++;
        class245.field4389 = arg5;
        if (arg6 && class247.field4441 >= 100) {
            class154.field2776 = class245.field4389 * 128 + 64;
            class167.field2992 = class155.field2793 * 128 + 64;
            class92.field1658 = class20.method140(class167.field2992, 83, class154.field2776, class170.field3044) - class168.field3003;
        }
        class21.field349 = 2;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V")
    public static void method1225(int arg0) {
        if (arg0 != 11361) {
            method1227(19, 14, -43, -27, -53, 62, 25, 16);
        }
        field3423 = null;
        field3422 = null;
        field3417 = null;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILh;)V")
    public static final void method1226(int arg0, class190 arg1) {
        field3427++;
        if (arg1.field3465.length - arg1.field3487 < 1) {
            return;
        }
        int var2 = arg1.method1265(121);
        if (var2 < 0 || var2 > 8) {
            return;
        }
        byte var3;
        if (var2 == 8) {
            var3 = 30;
        } else if (var2 == 7) {
            var3 = 29;
        } else if (var2 == 6) {
            var3 = 28;
        } else if (var2 == 5) {
            var3 = 28;
        } else if (var2 == 4) {
            var3 = 24;
        } else if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if (var3 > arg1.field3465.length - arg1.field3487 || arg0 > -81) {
            return;
        }
        class182.field3257 = arg1.method1265(124);
        if (class182.field3257 < 1) {
            class182.field3257 = 1;
        } else if (class182.field3257 > 4) {
            class182.field3257 = 4;
        }
        class235.method1585(arg1.method1265(114) == 1, (byte) 108);
        class285.field5009 = arg1.method1265(115) == 1;
        class225.field4083 = arg1.method1265(127) == 1;
        class43.field847 = arg1.method1265(120) == 1;
        class240.field4333 = arg1.method1265(125) == 1;
        field3418 = arg1.method1265(115) == 1;
        class49.field966 = arg1.method1265(113) == 1;
        class212.field3944 = arg1.method1265(125) == 1;
        class32.field551 = arg1.method1265(126);
        if (class32.field551 > 2) {
            class32.field551 = 2;
        }
        if (var2 < 2) {
            class116.field2070 = arg1.method1265(125) == 1;
            arg1.method1265(119);
        } else {
            class116.field2070 = arg1.method1265(119) == 1;
        }
        class283.field4985 = arg1.method1265(113) == 1;
        class44.field896 = arg1.method1265(115) == 1;
        class74.field1385 = arg1.method1265(114);
        if (class74.field1385 > 2) {
            class74.field1385 = 2;
        }
        class127.field2244 = class74.field1385;
        class88.field1594 = arg1.method1265(125) == 1;
        class240.field4332 = arg1.method1265(118);
        if (class240.field4332 > 127) {
            class240.field4332 = 127;
        }
        class211.field3926 = arg1.method1265(120);
        class58.field1117 = arg1.method1265(125);
        if (class58.field1117 > 127) {
            class58.field1117 = 127;
        }
        if (var2 >= 1) {
            class75.field1400 = arg1.method1275(128);
            class155.field2795 = arg1.method1275(128);
        }
        if (var2 >= 3 && var2 < 6) {
            arg1.method1265(124);
        }
        if (var2 >= 4) {
            class125.method761(arg1.method1265(121));
        }
        if (var2 >= 5) {
            class35.field615 = arg1.method1269(57);
        }
        if (var2 >= 6) {
            class120.field2126 = arg1.method1265(127);
        }
        if (var2 >= 7) {
            class63.field1185 = arg1.method1265(119) == 1;
        }
        if (var2 >= 8) {
            class51.field1019 = arg1.method1265(127) == 1;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method1227(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIZIIIIIIIII)Z")
    public static final boolean method1228(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field3416++;
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var31 = 0; var31 < 104; var31++) {
                class14.field263[var12][var31] = 0;
                class268.field4808[var12][var31] = 99999999;
            }
        }
        int var13 = arg8;
        class14.field263[arg8][arg7] = 99;
        class268.field4808[arg8][arg7] = 0;
        int var14 = arg7;
        byte var15 = 0;
        class221.field4000[var15] = arg8;
        int var16 = 0;
        int var32 = var15 + 1;
        class1.field28[var15] = arg7;
        boolean var17 = false;
        int[][] var18 = class171.field3052[class170.field3044].field1868;
        while (var32 != var16) {
            var13 = class221.field4000[var16];
            var14 = class1.field28[var16];
            var16 = var16 + 1 & 0xFFF;
            if (arg5 == var13 && arg4 == var14) {
                var17 = true;
                break;
            }
            if (arg9 != 0) {
                if ((arg9 < 5 || arg9 == 10) && class171.field3052[class170.field3044].method646(arg4, arg5, arg9 - 1, 0, arg10, 1, var13, var14)) {
                    var17 = true;
                    break;
                }
                if (arg9 < 10 && class171.field3052[class170.field3044].method631(arg4, -1, arg5, var14, arg10, arg9 - 1, var13, 1)) {
                    var17 = true;
                    break;
                }
            }
            if (arg3 != 0 && arg11 != 0 && class171.field3052[class170.field3044].method638((byte) 124, var13, arg6, arg3, arg11, var14, 1, arg5, arg4)) {
                var17 = true;
                break;
            }
            int var30 = class268.field4808[var13][var14] + 1;
            if (var13 > 0 && class14.field263[var13 - 1][var14] == 0 && (var18[var13 - 1][var14] & 0x12C0108) == 0) {
                class221.field4000[var32] = var13 - 1;
                class1.field28[var32] = var14;
                var32 = var32 + 1 & 0xFFF;
                class14.field263[var13 - 1][var14] = 2;
                class268.field4808[var13 - 1][var14] = var30;
            }
            if (var13 < 103 && class14.field263[var13 + 1][var14] == 0 && (var18[var13 + 1][var14] & 0x12C0180) == 0) {
                class221.field4000[var32] = var13 + 1;
                class1.field28[var32] = var14;
                var32 = var32 + 1 & 0xFFF;
                class14.field263[var13 + 1][var14] = 8;
                class268.field4808[var13 + 1][var14] = var30;
            }
            if (var14 > 0 && class14.field263[var13][var14 - 1] == 0 && (var18[var13][var14 - 1] & 0x12C0102) == 0) {
                class221.field4000[var32] = var13;
                class1.field28[var32] = var14 - 1;
                class14.field263[var13][var14 - 1] = 1;
                class268.field4808[var13][var14 - 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var14 < 103 && class14.field263[var13][var14 + 1] == 0 && (var18[var13][var14 + 1] & 0x12C0120) == 0) {
                class221.field4000[var32] = var13;
                class1.field28[var32] = var14 + 1;
                class14.field263[var13][var14 + 1] = 4;
                class268.field4808[var13][var14 + 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var13 > 0 && var14 > 0 && class14.field263[var13 - 1][var14 - 1] == 0 && (var18[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var18[var13 - 1][var14] & 0x12C0108) == 0 && (var18[var13][var14 - 1] & 0x12C0102) == 0) {
                class221.field4000[var32] = var13 - 1;
                class1.field28[var32] = var14 - 1;
                var32 = var32 + 1 & 0xFFF;
                class14.field263[var13 - 1][var14 - 1] = 3;
                class268.field4808[var13 - 1][var14 - 1] = var30;
            }
            if (var13 < 103 && var14 > 0 && class14.field263[var13 + 1][var14 - 1] == 0 && (var18[var13 + 1][var14 - 1] & 0x12C0183) == 0 && (var18[var13 + 1][var14] & 0x12C0180) == 0 && (var18[var13][var14 - 1] & 0x12C0102) == 0) {
                class221.field4000[var32] = var13 + 1;
                class1.field28[var32] = var14 - 1;
                var32 = var32 + 1 & 0xFFF;
                class14.field263[var13 + 1][var14 - 1] = 9;
                class268.field4808[var13 + 1][var14 - 1] = var30;
            }
            if (var13 > 0 && var14 < 103 && class14.field263[var13 - 1][var14 + 1] == 0 && (var18[var13 - 1][var14 + 1] & 0x12C0138) == 0 && (var18[var13 - 1][var14] & 0x12C0108) == 0 && (var18[var13][var14 + 1] & 0x12C0120) == 0) {
                class221.field4000[var32] = var13 - 1;
                class1.field28[var32] = var14 + 1;
                var32 = var32 + 1 & 0xFFF;
                class14.field263[var13 - 1][var14 + 1] = 6;
                class268.field4808[var13 - 1][var14 + 1] = var30;
            }
            if (var13 < 103 && var14 < 103 && class14.field263[var13 + 1][var14 + 1] == 0 && (var18[var13 + 1][var14 + 1] & 0x12C01E0) == 0 && (var18[var13 + 1][var14] & 0x12C0180) == 0 && (var18[var13][var14 + 1] & 0x12C0120) == 0) {
                class221.field4000[var32] = var13 + 1;
                class1.field28[var32] = var14 + 1;
                class14.field263[var13 + 1][var14 + 1] = 12;
                class268.field4808[var13 + 1][var14 + 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
        }
        class15.field267 = 0;
        if (!var17) {
            if (!arg2) {
                return false;
            }
            int var19 = 1000;
            int var20 = 100;
            byte var21 = 10;
            for (int var22 = arg5 - var21; var22 <= arg5 + var21; var22++) {
                for (int var23 = arg4 - var21; var23 <= (arg4 + var21); var23++) {
                    if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104 && class268.field4808[var22][var23] < 100) {
                        int var24 = 0;
                        if (arg5 > var22) {
                            var24 = arg5 - var22;
                        } else if (var22 > (arg5 + arg3 - 1)) {
                            var24 = var22 - (arg3 + arg5 - 1);
                        }
                        int var25 = 0;
                        if (var23 < arg4) {
                            var25 = arg4 - var23;
                        } else if (arg11 + arg4 - 1 < var23) {
                            var25 = var23 + 1 - arg11 - arg4;
                        }
                        int var26 = var24 * var24 + (var25 * var25);
                        if (var26 < var19 || var19 == var26 && class268.field4808[var22][var23] < var20) {
                            var20 = class268.field4808[var22][var23];
                            var14 = var23;
                            var19 = var26;
                            var13 = var22;
                        }
                    }
                }
            }
            if (var19 == 1000) {
                return false;
            }
            if (arg8 == var13 && arg7 == var14) {
                return false;
            }
            class15.field267 = 1;
        }
        byte var27 = 0;
        class221.field4000[var27] = var13;
        int var33 = var27 + 1;
        class1.field28[var27] = var14;
        int var28;
        int var29 = var28 = class14.field263[var13][var14];
        while (arg8 != var13 || arg7 != var14) {
            if (var28 != var29) {
                var28 = var29;
                class221.field4000[var33] = var13;
                class1.field28[var33++] = var14;
            }
            if ((var29 & 0x1) != 0) {
                var14++;
            } else if ((var29 & 0x4) != 0) {
                var14--;
            }
            if ((var29 & 0x2) != 0) {
                var13++;
            } else if ((var29 & 0x8) != 0) {
                var13--;
            }
            var29 = class14.field263[var13][var14];
        }
        if (arg0 > ~var33) {
            class13.method107(var33, 0, arg1);
            return true;
        } else if (arg1 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ZI)Lsd;")
    public static final class23 method1229(boolean arg0, int arg1) {
        field3415++;
        if (arg1 == 0) {
            return new class201();
        } else if (arg1 == 1) {
            return new class79();
        } else if (arg1 == 2) {
            return new class70();
        } else if (arg1 == 3) {
            return new class27();
        } else if (arg1 == 4) {
            return new class68();
        } else if (arg1 == 5) {
            return new class48();
        } else if (arg1 == 6) {
            return new class22();
        } else if (arg1 == 7) {
            return new class41();
        } else if (arg1 == 8) {
            return new class110();
        } else if (arg1 == 9) {
            return new class247();
        } else if (arg1 == 10) {
            return new class36();
        } else if (arg1 == 11) {
            return new class178();
        } else if (arg1 == 12) {
            return new class200();
        } else if (arg1 == 13) {
            return new class155();
        } else if (arg1 == 14) {
            return new class240();
        } else if (arg1 == 15) {
            return new class188();
        } else if (arg1 == 16) {
            return new class126();
        } else if (arg1 == 17) {
            return new class170();
        } else if (arg1 == 18) {
            return new class40();
        } else if (arg1 == 19) {
            return new class128();
        } else if (arg1 == 20) {
            return new class154();
        } else if (arg1 == 21) {
            return new class83();
        } else if (arg1 == 22) {
            return new class207();
        } else if (arg1 == 23) {
            return new class186();
        } else if (arg1 == 24) {
            return new class214();
        } else if (arg1 == 25) {
            return new class231();
        } else if (arg1 == 26) {
            return new class285();
        } else if (arg1 == 27) {
            return new class245();
        } else if (arg1 == 28) {
            return new class234();
        } else if (arg1 == 29) {
            return new class69();
        } else if (arg1 == 30) {
            return new class235();
        } else if (arg1 == 31) {
            return new class75();
        } else if (arg1 == 32) {
            return new class111();
        } else if (arg1 == 33) {
            return new class76();
        } else if (arg1 == 34) {
            return new class10();
        } else if (arg1 == 35) {
            return new class261();
        } else if (arg1 == 36) {
            return new class17();
        } else if (arg1 == 37) {
            return new class243();
        } else if (arg1 == 38) {
            return new class130();
        } else if (arg1 == 39) {
            return new class287();
        } else {
            if (arg0) {
                method1227(115, 95, 122, 0, 80, -112, 43, -14);
            }
            return null;
        }
    }
}
