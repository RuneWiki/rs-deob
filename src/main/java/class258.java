import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class258 {

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "[I")
    public static int[] field4495 = new int[500];

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "Loa;")
    public static class99 field4500 = class221.method1463(2844, "Fallen lassen");

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "[S")
    public static short[] field4502 = new short[500];

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
    public static int field4497 = 0;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "Lwk;")
    public static class273 field4499 = new class273(64);

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "Loa;")
    private static class99 field4504 = class221.method1463(2844, "Use");

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "Loa;")
    public static class99 field4503 = field4504;

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "Loa;")
    public static class99 field4505 = class221.method1463(2844, "cookieprefix");

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "I")
    public static int field4494;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
    public static int field4498;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
    public static int field4501;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIBIIIZIIII)Z")
    public static final boolean method1671(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10, int arg11, int arg12) {
        field4494++;
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var40 = 0; var40 < 104; var40++) {
                class11.field85[var13][var40] = 0;
                class232.field4001[var13][var40] = 99999999;
            }
        }
        class11.field85[arg11][arg5] = 99;
        class232.field4001[arg11][arg5] = 0;
        int var14 = arg11;
        int var15 = arg5;
        byte var16 = 0;
        if (arg4 != -70) {
            method1674((byte) -126);
        }
        class222.field3860[var16] = arg11;
        int var17 = 0;
        boolean var18 = false;
        int var41 = var16 + 1;
        class33.field598[var16] = arg5;
        int[][] var19 = class177.field3091[class255.field4407].field2272;
        label372: while (var41 != var17) {
            var15 = class33.field598[var17];
            var14 = class222.field3860[var17];
            var17 = var17 + 1 & 0xFFF;
            if (arg3 == var14 && arg1 == var15) {
                var18 = true;
                break;
            }
            if (arg2 != 0) {
                if ((arg2 < 5 || arg2 == 10) && class177.field3091[class255.field4407].method862(arg0, var14, arg6, arg2 - 1, arg1, 1, arg3, var15)) {
                    var18 = true;
                    break;
                }
                if (arg2 < 10 && class177.field3091[class255.field4407].method877(arg6, arg2 - 1, var15, arg3, 0, arg0, arg1, var14)) {
                    var18 = true;
                    break;
                }
            }
            if (arg9 != 0 && arg12 != 0 && class177.field3091[class255.field4407].method867(arg7, (byte) -12, arg1, arg9, arg12, arg0, var14, arg3, var15)) {
                var18 = true;
                break;
            }
            int var31 = class232.field4001[var14][var15] + 1;
            if (var14 > 0 && class11.field85[var14 - 1][var15] == 0 && (var19[var14 - 1][var15] & 0x12C010E) == 0 && (var19[var14 - 1][var15 + arg0 - 1] & 0x12C0138) == 0) {
                int var32 = 1;
                while (true) {
                    if (var32 >= arg0 - 1) {
                        class222.field3860[var41] = var14 - 1;
                        class33.field598[var41] = var15;
                        class11.field85[var14 - 1][var15] = 2;
                        class232.field4001[var14 - 1][var15] = var31;
                        var41 = var41 + 1 & 0xFFF;
                        break;
                    }
                    if ((var19[var14 - 1][var15 + var32] & 0x12C013E) != 0) {
                        break;
                    }
                    var32++;
                }
            }
            if (var14 < 102 && class11.field85[var14 + 1][var15] == 0 && (var19[var14 + arg0][var15] & 0x12C0183) == 0 && (var19[arg0 + var14][var15 + arg0 - 1] & 0x12C01E0) == 0) {
                int var33 = 1;
                while (true) {
                    if (var33 >= (arg0 - 1)) {
                        class222.field3860[var41] = var14 + 1;
                        class33.field598[var41] = var15;
                        var41 = var41 + 1 & 0xFFF;
                        class11.field85[var14 + 1][var15] = 8;
                        class232.field4001[var14 + 1][var15] = var31;
                        break;
                    }
                    if ((var19[var14 + arg0][var15 + var33] & 0x12C01E3) != 0) {
                        break;
                    }
                    var33++;
                }
            }
            if (var15 > 0 && class11.field85[var14][var15 - 1] == 0 && (var19[var14][var15 - 1] & 0x12C010E) == 0 && (var19[arg0 + var14 - 1][var15 - 1] & 0x12C0183) == 0) {
                int var34 = 1;
                while (true) {
                    if (arg0 - 1 <= var34) {
                        class222.field3860[var41] = var14;
                        class33.field598[var41] = var15 - 1;
                        class11.field85[var14][var15 - 1] = 1;
                        var41 = var41 + 1 & 0xFFF;
                        class232.field4001[var14][var15 - 1] = var31;
                        break;
                    }
                    if ((var19[var14 + var34][var15 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var34++;
                }
            }
            if (var15 < 102 && class11.field85[var14][var15 + 1] == 0 && (var19[var14][arg0 + var15] & 0x12C0138) == 0 && (var19[var14 + arg0 - 1][arg0 + var15] & 0x12C01E0) == 0) {
                int var35 = 1;
                while (true) {
                    if (arg0 - 1 <= var35) {
                        class222.field3860[var41] = var14;
                        class33.field598[var41] = var15 + 1;
                        var41 = var41 + 1 & 0xFFF;
                        class11.field85[var14][var15 + 1] = 4;
                        class232.field4001[var14][var15 + 1] = var31;
                        break;
                    }
                    if ((var19[var14 + var35][var15 + arg0] & 0x12C01F8) != 0) {
                        break;
                    }
                    var35++;
                }
            }
            if (var14 > 0 && var15 > 0 && class11.field85[var14 - 1][var15 - 1] == 0 && (var19[var14 - 1][var15 + arg0 - 1 - 1] & 0x12C0138) == 0 && (var19[var14 - 1][var15 - 1] & 0x12C010E) == 0 && (var19[var14 + arg0 - 1 - 1][var15 - 1] & 0x12C0183) == 0) {
                int var36 = 1;
                while (true) {
                    if (var36 >= (arg0 - 1)) {
                        class222.field3860[var41] = var14 - 1;
                        class33.field598[var41] = var15 - 1;
                        var41 = var41 + 1 & 0xFFF;
                        class11.field85[var14 - 1][var15 - 1] = 3;
                        class232.field4001[var14 - 1][var15 - 1] = var31;
                        break;
                    }
                    if ((var19[var14 - 1][var15 - (1 - var36)] & 0x12C013E) != 0 || (var19[var36 + var14 - 1][var15 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var36++;
                }
            }
            if (var14 < 102 && var15 > 0 && class11.field85[var14 + 1][var15 - 1] == 0 && (var19[var14 + 1][var15 - 1] & 0x12C010E) == 0 && (var19[arg0 + var14][var15 - 1] & 0x12C0183) == 0 && (var19[arg0 + var14][arg0 + var15 - 1 - 1] & 0x12C01E0) == 0) {
                int var37 = 1;
                while (true) {
                    if (var37 >= (arg0 - 1)) {
                        class222.field3860[var41] = var14 + 1;
                        class33.field598[var41] = var15 - 1;
                        class11.field85[var14 + 1][var15 - 1] = 9;
                        var41 = var41 + 1 & 0xFFF;
                        class232.field4001[var14 + 1][var15 - 1] = var31;
                        break;
                    }
                    if ((var19[var14 + arg0][var15 + var37 - 1] & 0x12C01E3) != 0 || (var19[var37 + var14 + 1][var15 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var37++;
                }
            }
            if (var14 > 0 && var15 < 102 && class11.field85[var14 - 1][var15 + 1] == 0 && (var19[var14 - 1][var15 + 1] & 0x12C010E) == 0 && (var19[var14 - 1][arg0 + var15] & 0x12C0138) == 0 && (var19[var14][arg0 + var15] & 0x12C01E0) == 0) {
                int var38 = 1;
                while (true) {
                    if ((arg0 - 1) <= var38) {
                        class222.field3860[var41] = var14 - 1;
                        class33.field598[var41] = var15 + 1;
                        var41 = var41 + 1 & 0xFFF;
                        class11.field85[var14 - 1][var15 + 1] = 6;
                        class232.field4001[var14 - 1][var15 + 1] = var31;
                        break;
                    }
                    if ((var19[var14 - 1][var15 + var38 + 1] & 0x12C013E) != 0 || (var19[var14 + var38 - 1][arg0 + var15] & 0x12C01F8) != 0) {
                        break;
                    }
                    var38++;
                }
            }
            if (var14 < 102 && var15 < 102 && class11.field85[var14 + 1][var15 + 1] == 0 && (var19[var14 + 1][var15 + arg0] & 0x12C0138) == 0 && (var19[arg0 + var14][arg0 + var15] & 0x12C01E0) == 0 && (var19[arg0 + var14][var15 + 1] & 0x12C0183) == 0) {
                for (int var39 = 1; var39 < (arg0 - 1); var39++) {
                    if ((var19[var14 + var39 + 1][var15 + arg0] & 0x12C01F8) != 0 || (var19[arg0 + var14][var15 + var39 + 1] & 0x12C01E3) != 0) {
                        continue label372;
                    }
                }
                class222.field3860[var41] = var14 + 1;
                class33.field598[var41] = var15 + 1;
                var41 = var41 + 1 & 0xFFF;
                class11.field85[var14 + 1][var15 + 1] = 12;
                class232.field4001[var14 + 1][var15 + 1] = var31;
            }
        }
        class186.field3291 = 0;
        if (!var18) {
            if (!arg8) {
                return false;
            }
            int var20 = 1000;
            byte var21 = 10;
            int var22 = 100;
            for (int var23 = arg3 - var21; var23 <= (arg3 + var21); var23++) {
                for (int var24 = arg1 - var21; var24 <= (arg1 + var21); var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class232.field4001[var23][var24] < 100) {
                        int var25 = 0;
                        if (var23 < arg3) {
                            var25 = arg3 - var23;
                        } else if ((arg9 + arg3 - 1) < var23) {
                            var25 = 1 - (arg3 + arg9 - var23);
                        }
                        int var26 = 0;
                        if (var24 < arg1) {
                            var26 = arg1 - var24;
                        } else if ((arg12 + arg1 - 1) < var24) {
                            var26 = 1 - (arg1 + arg12 - var24);
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var20 > var27 || var20 == var27 && var22 > class232.field4001[var23][var24]) {
                            var20 = var27;
                            var22 = class232.field4001[var23][var24];
                            var15 = var24;
                            var14 = var23;
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return false;
            }
            if (arg11 == var14 && arg5 == var15) {
                return false;
            }
            class186.field3291 = 1;
        }
        byte var28 = 0;
        class222.field3860[var28] = var14;
        int var42 = var28 + 1;
        class33.field598[var28] = var15;
        int var29;
        int var30 = var29 = class11.field85[var14][var15];
        while (arg11 != var14 || arg5 != var15) {
            if (var29 != var30) {
                class222.field3860[var42] = var14;
                var29 = var30;
                class33.field598[var42++] = var15;
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
            var30 = class11.field85[var14][var15];
        }
        if (var42 > 0) {
            class262.method1755(false, var42, arg10);
            return true;
        } else if (arg10 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Z)Z")
    public static final boolean method1672(boolean arg0) {
        field4498++;
        try {
            if (class53.field873 == 2) {
                if (class139.field2464 == null) {
                    class139.field2464 = class15.method96(class161.field2860, class145.field2546, class47.field790);
                    if (class139.field2464 == null) {
                        return false;
                    }
                }
                if (class150.field2645 == null) {
                    class150.field2645 = new class181(class129.field2250, class280.field4913);
                }
                if (class116.field2065.method145(22050, class150.field2645, false, client.field2780, class139.field2464)) {
                    class116.field2065.method164((byte) 112);
                    class116.field2065.method146(-123, class48.field797);
                    class116.field2065.method178(class139.field2464, (byte) -125, class90.field1545);
                    class53.field873 = 0;
                    class139.field2464 = null;
                    class161.field2860 = null;
                    class150.field2645 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class116.field2065.method163(106);
            class139.field2464 = null;
            class150.field2645 = null;
            class161.field2860 = null;
            class53.field873 = 0;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IB)I")
    public static final int method1673(int arg0, byte arg1) {
        field4496++;
        if (arg1 >= -65) {
            method1673(-119, (byte) -111);
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V")
    public static void method1674(byte arg0) {
        field4500 = null;
        field4499 = null;
        field4495 = null;
        field4505 = null;
        field4502 = null;
        if (arg0 != -61) {
            method1673(-77, (byte) 17);
        }
        field4503 = null;
        field4504 = null;
    }
}
