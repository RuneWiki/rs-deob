import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class206 {

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "J")
    public long field3781 = 0L;

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
    public static int field3772 = -1;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "Lli;")
    public static class185 field3776 = class245.method1649("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3", -110);

    @OriginalMember(owner = "client!fd", name = "q", descriptor = "Lli;")
    public static class185 field3786 = class245.method1649("m", 127);

    @OriginalMember(owner = "client!fd", name = "p", descriptor = "Z")
    public static boolean field3785 = false;

    @OriginalMember(owner = "client!fd", name = "t", descriptor = "Lli;")
    private static class185 field3789 = class245.method1649("Examine", 122);

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "Lli;")
    public static class185 field3779 = field3789;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
    public static int field3770;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "I")
    public static int field3771;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
    public static int field3773;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "I")
    public int field3774;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "I")
    public static int field3775;

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "I")
    public static int field3777;

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
    public int field3778;

    @OriginalMember(owner = "client!fd", name = "m", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!fd", name = "n", descriptor = "I")
    public int field3783;

    @OriginalMember(owner = "client!fd", name = "o", descriptor = "I")
    public int field3784;

    @OriginalMember(owner = "client!fd", name = "s", descriptor = "I")
    public int field3788;

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "Lbb;")
    public class75 field3780;

    @OriginalMember(owner = "client!fd", name = "r", descriptor = "Lbb;")
    public class75 field3787;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V")
    public static void method1458(int arg0) {
        field3776 = null;
        field3779 = null;
        if (arg0 != -16183) {
            field3777 = -106;
        }
        field3789 = null;
        field3786 = null;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)Z")
    public static final boolean method1459(int arg0, int arg1) {
        field3773++;
        if (arg0 == -1705783874) {
            return (arg1 & 0x4E6A9DFB) >> 30 != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIIZIIIIIII)Z")
    public static final boolean method1460(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        field3770++;
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var40 = 0; var40 < 104; var40++) {
                class27.field462[var13][var40] = 0;
                class263.field4673[var13][var40] = 99999999;
            }
        }
        int var14 = arg1;
        class27.field462[arg1][arg0] = 99;
        class263.field4673[arg1][arg0] = 0;
        int var15 = arg0;
        byte var16 = 0;
        class173.field3178[var16] = arg1;
        int var17 = 0;
        boolean var18 = false;
        int var41 = var16 + 1;
        class9.field191[var16] = arg0;
        if (arg7 != -1) {
            return false;
        }
        int[][] var19 = class165.field3090[class265.field4703].field757;
        label372: while (var41 != var17) {
            var14 = class173.field3178[var17];
            var15 = class9.field191[var17];
            var17 = var17 + 1 & 0xFFF;
            if (arg11 == var14 && arg2 == var15) {
                var18 = true;
                break;
            }
            if (arg12 != 0) {
                if ((arg12 < 5 || arg12 == 10) && class165.field3090[class265.field4703].method288(arg6, var15, arg11, arg2, arg12 - 1, arg9, (byte) 79, var14)) {
                    var18 = true;
                    break;
                }
                if (arg12 < 10 && class165.field3090[class265.field4703].method290(arg12 - 1, var15, arg6, arg9, var14, (byte) 47, arg11, arg2)) {
                    var18 = true;
                    break;
                }
            }
            if (arg4 != 0 && arg3 != 0 && class165.field3090[class265.field4703].method302(arg2, arg4, var14, arg8, var15, arg6, arg11, arg3, 1)) {
                var18 = true;
                break;
            }
            int var31 = class263.field4673[var14][var15] + 1;
            if (var14 > 0 && class27.field462[var14 - 1][var15] == 0 && (var19[var14 - 1][var15] & 0x12C010E) == 0 && (var19[var14 - 1][arg6 + var15 - 1] & 0x12C0138) == 0) {
                int var32 = 1;
                while (true) {
                    if (arg6 - 1 <= var32) {
                        class173.field3178[var41] = var14 - 1;
                        class9.field191[var41] = var15;
                        class27.field462[var14 - 1][var15] = 2;
                        var41 = var41 + 1 & 0xFFF;
                        class263.field4673[var14 - 1][var15] = var31;
                        break;
                    }
                    if ((var19[var14 - 1][var15 + var32] & 0x12C013E) != 0) {
                        break;
                    }
                    var32++;
                }
            }
            if (var14 < 102 && class27.field462[var14 + 1][var15] == 0 && (var19[arg6 + var14][var15] & 0x12C0183) == 0 && (var19[arg6 + var14][arg6 + var15 - 1] & 0x12C01E0) == 0) {
                int var33 = 1;
                while (true) {
                    if (var33 >= arg6 - 1) {
                        class173.field3178[var41] = var14 + 1;
                        class9.field191[var41] = var15;
                        var41 = var41 + 1 & 0xFFF;
                        class27.field462[var14 + 1][var15] = 8;
                        class263.field4673[var14 + 1][var15] = var31;
                        break;
                    }
                    if ((var19[arg6 + var14][var15 + var33] & 0x12C01E3) != 0) {
                        break;
                    }
                    var33++;
                }
            }
            if (var15 > 0 && class27.field462[var14][var15 - 1] == 0 && (var19[var14][var15 - 1] & 0x12C010E) == 0 && (var19[arg6 + var14 - 1][var15 - 1] & 0x12C0183) == 0) {
                int var34 = 1;
                while (true) {
                    if (var34 >= arg6 - 1) {
                        class173.field3178[var41] = var14;
                        class9.field191[var41] = var15 - 1;
                        class27.field462[var14][var15 - 1] = 1;
                        var41 = var41 + 1 & 0xFFF;
                        class263.field4673[var14][var15 - 1] = var31;
                        break;
                    }
                    if ((var19[var14 + var34][var15 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var34++;
                }
            }
            if (var15 < 102 && class27.field462[var14][var15 + 1] == 0 && (var19[var14][arg6 + var15] & 0x12C0138) == 0 && (var19[var14 + arg6 - 1][arg6 + var15] & 0x12C01E0) == 0) {
                int var35 = 1;
                while (true) {
                    if ((arg6 - 1) <= var35) {
                        class173.field3178[var41] = var14;
                        class9.field191[var41] = var15 + 1;
                        var41 = var41 + 1 & 0xFFF;
                        class27.field462[var14][var15 + 1] = 4;
                        class263.field4673[var14][var15 + 1] = var31;
                        break;
                    }
                    if ((var19[var14 + var35][arg6 + var15] & 0x12C01F8) != 0) {
                        break;
                    }
                    var35++;
                }
            }
            if (var14 > 0 && var15 > 0 && class27.field462[var14 - 1][var15 - 1] == 0 && (var19[var14 - 1][var15 + arg6 - 1 - 1] & 0x12C0138) == 0 && (var19[var14 - 1][var15 - 1] & 0x12C010E) == 0 && (var19[var14 + arg6 - 1 - 1][var15 - 1] & 0x12C0183) == 0) {
                int var36 = 1;
                while (true) {
                    if ((arg6 - 1) <= var36) {
                        class173.field3178[var41] = var14 - 1;
                        class9.field191[var41] = var15 - 1;
                        class27.field462[var14 - 1][var15 - 1] = 3;
                        var41 = var41 + 1 & 0xFFF;
                        class263.field4673[var14 - 1][var15 - 1] = var31;
                        break;
                    }
                    if ((var19[var14 - 1][var36 + var15 - 1] & 0x12C013E) != 0 || (var19[var14 + var36 - 1][var15 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var36++;
                }
            }
            if (var14 < 102 && var15 > 0 && class27.field462[var14 + 1][var15 - 1] == 0 && (var19[var14 + 1][var15 - 1] & 0x12C010E) == 0 && (var19[arg6 + var14][var15 - 1] & 0x12C0183) == 0 && (var19[arg6 + var14][arg6 + var15 - 2] & 0x12C01E0) == 0) {
                int var37 = 1;
                while (true) {
                    if (arg6 - 1 <= var37) {
                        class173.field3178[var41] = var14 + 1;
                        class9.field191[var41] = var15 - 1;
                        class27.field462[var14 + 1][var15 - 1] = 9;
                        class263.field4673[var14 + 1][var15 - 1] = var31;
                        var41 = var41 + 1 & 0xFFF;
                        break;
                    }
                    if ((var19[arg6 + var14][var15 + var37 - 1] & 0x12C01E3) != 0 || (var19[var14 + var37 + 1][var15 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var37++;
                }
            }
            if (var14 > 0 && var15 < 102 && class27.field462[var14 - 1][var15 + 1] == 0 && (var19[var14 - 1][var15 + 1] & 0x12C010E) == 0 && (var19[var14 - 1][arg6 + var15] & 0x12C0138) == 0 && (var19[var14][arg6 + var15] & 0x12C01E0) == 0) {
                int var38 = 1;
                while (true) {
                    if ((arg6 - 1) <= var38) {
                        class173.field3178[var41] = var14 - 1;
                        class9.field191[var41] = var15 + 1;
                        class27.field462[var14 - 1][var15 + 1] = 6;
                        var41 = var41 + 1 & 0xFFF;
                        class263.field4673[var14 - 1][var15 + 1] = var31;
                        break;
                    }
                    if ((var19[var14 - 1][var15 + var38 + 1] & 0x12C013E) != 0 || (var19[var38 + var14 - 1][var15 + arg6] & 0x12C01F8) != 0) {
                        break;
                    }
                    var38++;
                }
            }
            if (var14 < 102 && var15 < 102 && class27.field462[var14 + 1][var15 + 1] == 0 && (var19[var14 + 1][var15 + arg6] & 0x12C0138) == 0 && (var19[arg6 + var14][arg6 + var15] & 0x12C01E0) == 0 && (var19[arg6 + var14][var15 + 1] & 0x12C0183) == 0) {
                for (int var39 = 1; var39 < arg6 - 1; var39++) {
                    if ((var19[var14 + var39 + 1][var15 + arg6] & 0x12C01F8) != 0 || (var19[arg6 + var14][var15 - (-var39 - 1)] & 0x12C01E3) != 0) {
                        continue label372;
                    }
                }
                class173.field3178[var41] = var14 + 1;
                class9.field191[var41] = var15 + 1;
                var41 = var41 + 1 & 0xFFF;
                class27.field462[var14 + 1][var15 + 1] = 12;
                class263.field4673[var14 + 1][var15 + 1] = var31;
            }
        }
        class258.field4587 = 0;
        if (!var18) {
            if (!arg5) {
                return false;
            }
            int var20 = 1000;
            byte var21 = 10;
            int var22 = 100;
            for (int var23 = arg11 - var21; var23 <= (arg11 + var21); var23++) {
                for (int var24 = arg2 - var21; var24 <= (arg2 + var21); var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class263.field4673[var23][var24] < 100) {
                        int var25 = 0;
                        int var26 = 0;
                        if (arg11 > var23) {
                            var26 = arg11 - var23;
                        } else if (arg4 + arg11 - 1 < var23) {
                            var26 = var23 + 1 - arg4 - arg11;
                        }
                        if (var24 < arg2) {
                            var25 = arg2 - var24;
                        } else if (var24 > arg2 + arg3 - 1) {
                            var25 = -arg3 - (arg2 - var24 - 1);
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var20 > var27 || var20 == var27 && var22 > class263.field4673[var23][var24]) {
                            var22 = class263.field4673[var23][var24];
                            var14 = var23;
                            var15 = var24;
                            var20 = var27;
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return false;
            }
            if (arg1 == var14 && arg0 == var15) {
                return false;
            }
            class258.field4587 = 1;
        }
        byte var28 = 0;
        class173.field3178[var28] = var14;
        int var42 = var28 + 1;
        class9.field191[var28] = var15;
        int var29;
        int var30 = var29 = class27.field462[var14][var15];
        while (arg1 != var14 || arg0 != var15) {
            if (var29 != var30) {
                var29 = var30;
                class173.field3178[var42] = var14;
                class9.field191[var42++] = var15;
            }
            if ((var30 & 0x2) != 0) {
                var14++;
            } else if ((var30 & 0x8) != 0) {
                var14--;
            }
            if ((var30 & 0x1) != 0) {
                var15++;
            } else if ((var30 & 0x4) != 0) {
                var15--;
            }
            var30 = class27.field462[var14][var15];
        }
        if (var42 > 0) {
            class237.method1610(var42, (byte) 4, arg10);
            return true;
        } else if (arg10 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)Lkk;")
    public static final class197 method1461(int arg0) {
        field3782++;
        try {
            if (arg0 != 19661118) {
                method1463(26, -38, -80, -85, (class75) null, (class75) null, -29, -98, 65L);
            }
            return (class197) Class.forName("s").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lli;Lli;IB)V")
    public static final void method1462(class185 arg0, class185 arg1, int arg2, byte arg3) {
        class20.field317 = arg1;
        class191.field3533 = arg2;
        class20.field332 = arg0;
        field3775++;
        if (class20.field332.method1329(class20.field336, (byte) 22) || class20.field317.method1329(class20.field336, (byte) 22)) {
            class195.field3588 = 3;
        } else if (class138.field2588 == -1) {
            class195.field3588 = -3;
            class150.field2832 = 0;
            class158.field2997 = 0;
            class253.field4491 = 1;
            class118 var4 = new class118(128);
            var4.method877((byte) 115, 10);
            var4.method856(arg3 ^ 0xFFFF862C, (int) (Math.random() * 99999.0D));
            var4.method856(31133, 527);
            var4.method870(class20.field332.method1327((byte) 101), (byte) 122);
            var4.method842((int) (Math.random() * 9.9999999E7D), -6596);
            var4.method855((byte) 76, class20.field317);
            var4.method842((int) (Math.random() * 9.9999999E7D), -6596);
            if (arg3 == -79) {
                var4.method861(class173.field3169, class37.field568, (byte) 105);
                class182.field3349.field2155 = 0;
                class182.field3349.method877((byte) 110, 164);
                class182.field3349.method877((byte) 125, var4.field2155);
                class182.field3349.method848(var4.field2115, 0, (byte) -117, var4.field2155);
            }
        } else {
            class223.method1548(8);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIILbb;Lbb;IIJ)V")
    public static final void method1463(int arg0, int arg1, int arg2, int arg3, class75 arg4, class75 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class206 var10 = new class206();
        var10.field3781 = arg8;
        var10.field3784 = arg1 * 128 + 64;
        var10.field3774 = arg2 * 128 + 64;
        var10.field3783 = arg3;
        var10.field3787 = arg4;
        var10.field3780 = arg5;
        var10.field3788 = arg6;
        var10.field3778 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class153.field2896[var11][arg1][arg2] == null) {
                class153.field2896[var11][arg1][arg2] = new class198(var11, arg1, arg2);
            }
        }
        class153.field2896[arg0][arg1][arg2].field3640 = var10;
    }
}
