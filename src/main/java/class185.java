import java.awt.FontMetrics;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class185 extends class171 {

    @OriginalMember(owner = "client!ag", name = "C", descriptor = "Lha;")
    public static class46 field3295 = class271.method1828("Loaded world list data", -46);

    @OriginalMember(owner = "client!ag", name = "J", descriptor = "Lha;")
    public static class46 field3302 = class271.method1828("(U0a )2 via: ", -46);

    @OriginalMember(owner = "client!ag", name = "G", descriptor = "Lha;")
    private static class46 field3299 = class271.method1828("You can(Wt add yourself to your own friend list)3", -46);

    @OriginalMember(owner = "client!ag", name = "K", descriptor = "Lha;")
    private static class46 field3303 = class271.method1828("skill: ", -46);

    @OriginalMember(owner = "client!ag", name = "E", descriptor = "Lha;")
    public static class46 field3297 = field3299;

    @OriginalMember(owner = "client!ag", name = "H", descriptor = "Lha;")
    public static class46 field3300 = field3303;

    @OriginalMember(owner = "client!ag", name = "B", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!ag", name = "D", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!ag", name = "F", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!ag", name = "L", descriptor = "I")
    public int field3304;

    @OriginalMember(owner = "client!ag", name = "M", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!ag", name = "O", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!ag", name = "P", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!ag", name = "Q", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!ag", name = "R", descriptor = "I")
    public static int field3310;

    @OriginalMember(owner = "client!ag", name = "S", descriptor = "I")
    private int field3311;

    @OriginalMember(owner = "client!ag", name = "T", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!ag", name = "N", descriptor = "Lha;")
    public class46 field3306;

    @OriginalMember(owner = "client!ag", name = "I", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field3301;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZLwe;)V")
    public final void method1334(boolean arg0, class75 arg1) {
        field3312++;
        if (arg0) {
            method1342(49);
        }
        while (true) {
            int var3 = arg1.method558(1);
            if (var3 == 0) {
                return;
            }
            this.method1338((byte) 3, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lmi;B)V")
    public static final void method1335(class81 arg0, byte arg1) {
        if (arg1 >= -115) {
            return;
        }
        field3307++;
        class269 var2 = (class269) class47.field820.method1601(69, arg0.field1528.method349((byte) 59));
        if (var2 == null) {
            return;
        }
        if (var2.field4671 != null) {
            class236.field4116.method1711(var2.field4671);
            var2.field4671 = null;
        }
        var2.method501(0);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(BZ)V")
    public static final void method1336(byte arg0, boolean arg1) {
        class267.method1789(arg0 ^ 0xFFFFFFD1);
        field3305++;
        if (class135.field2448 != 30 && class135.field2448 != 25) {
            return;
        }
        class277.field4822++;
        if (class277.field4822 < 50 && !arg1) {
            return;
        }
        if (arg0 != -69) {
            method1339(-113, 111, 86, 86, (byte) -110, 70, 64, 61, -7, 7, 7, true, 77);
        }
        class277.field4822 = 0;
        if (!class140.field2507 && class71.field1214 != null) {
            class242.field4302++;
            class58.field967.method285((byte) -90, 115);
            try {
                class71.field1214.method860(0, class58.field967.field1368, class58.field967.field1380, 122);
                class58.field967.field1380 = 0;
            } catch (IOException var2) {
                class140.field2507 = true;
            }
        }
        class267.method1789(105);
    }

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "(B)Z")
    public final boolean method1337(byte arg0) {
        field3310++;
        if (arg0 != 61) {
            field3299 = null;
        }
        return this.field3311 == 115;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(BILwe;)V")
    private final void method1338(byte arg0, int arg1, class75 arg2) {
        if (arg0 != 3) {
            return;
        }
        if (arg1 == 1) {
            this.field3311 = arg2.method558(arg0 - 2);
        } else if (arg1 == 2) {
            this.field3304 = arg2.method562((byte) -71);
        } else if (arg1 == 5) {
            this.field3306 = arg2.method577(0);
        }
        field3296++;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIIBIIIIIIZI)Z")
    public static final boolean method1339(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, boolean arg11, int arg12) {
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var40 = 0; var40 < 104; var40++) {
                class112.field2120[var13][var40] = 0;
                class247.field4370[var13][var40] = 99999999;
            }
        }
        class112.field2120[arg10][arg5] = 99;
        field3294++;
        class247.field4370[arg10][arg5] = 0;
        int var14 = arg10;
        int var15 = arg5;
        boolean var16 = false;
        int var17 = 0;
        byte var18 = 0;
        class162.field2877[var18] = arg10;
        int var41 = var18 + 1;
        class96.field1794[var18] = arg5;
        int[][] var19 = class183.field3282[class135.field2450].field2718;
        label372: while (var17 != var41) {
            var14 = class162.field2877[var17];
            var15 = class96.field1794[var17];
            var17 = var17 + 1 & 0xFFF;
            if (arg7 == var14 && arg0 == var15) {
                var16 = true;
                break;
            }
            if (arg9 != 0) {
                if ((arg9 < 5 || arg9 == 10) && class183.field3282[class135.field2450].method1127(arg7, false, arg9 - 1, arg2, var14, arg0, arg3, var15)) {
                    var16 = true;
                    break;
                }
                if (arg9 < 10 && class183.field3282[class135.field2450].method1121((byte) 112, arg0, var14, var15, arg9 - 1, arg3, arg7, arg2)) {
                    var16 = true;
                    break;
                }
            }
            if (arg6 != 0 && arg12 != 0 && class183.field3282[class135.field2450].method1117(arg12, arg6, arg8, arg2, false, var14, arg0, arg7, var15)) {
                var16 = true;
                break;
            }
            int var31 = class247.field4370[var14][var15] + 1;
            if (var14 > 0 && class112.field2120[var14 - 1][var15] == 0 && (var19[var14 - 1][var15] & 0x12C010E) == 0 && (var19[var14 - 1][arg2 + var15 - 1] & 0x12C0138) == 0) {
                int var32 = 1;
                while (true) {
                    if (arg2 - 1 <= var32) {
                        class162.field2877[var41] = var14 - 1;
                        class96.field1794[var41] = var15;
                        class112.field2120[var14 - 1][var15] = 2;
                        var41 = var41 + 1 & 0xFFF;
                        class247.field4370[var14 - 1][var15] = var31;
                        break;
                    }
                    if ((var19[var14 - 1][var15 + var32] & 0x12C013E) != 0) {
                        break;
                    }
                    var32++;
                }
            }
            if (var14 < 102 && class112.field2120[var14 + 1][var15] == 0 && (var19[arg2 + var14][var15] & 0x12C0183) == 0 && (var19[arg2 + var14][var15 + arg2 - 1] & 0x12C01E0) == 0) {
                int var33 = 1;
                while (true) {
                    if ((arg2 - 1) <= var33) {
                        class162.field2877[var41] = var14 + 1;
                        class96.field1794[var41] = var15;
                        var41 = var41 + 1 & 0xFFF;
                        class112.field2120[var14 + 1][var15] = 8;
                        class247.field4370[var14 + 1][var15] = var31;
                        break;
                    }
                    if ((var19[arg2 + var14][var15 + var33] & 0x12C01E3) != 0) {
                        break;
                    }
                    var33++;
                }
            }
            if (var15 > 0 && class112.field2120[var14][var15 - 1] == 0 && (var19[var14][var15 - 1] & 0x12C010E) == 0 && (var19[var14 + arg2 - 1][var15 - 1] & 0x12C0183) == 0) {
                int var34 = 1;
                while (true) {
                    if (var34 >= (arg2 - 1)) {
                        class162.field2877[var41] = var14;
                        class96.field1794[var41] = var15 - 1;
                        class112.field2120[var14][var15 - 1] = 1;
                        var41 = var41 + 1 & 0xFFF;
                        class247.field4370[var14][var15 - 1] = var31;
                        break;
                    }
                    if ((var19[var14 + var34][var15 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var34++;
                }
            }
            if (var15 < 102 && class112.field2120[var14][var15 + 1] == 0 && (var19[var14][arg2 + var15] & 0x12C0138) == 0 && (var19[var14 + arg2 - 1][arg2 + var15] & 0x12C01E0) == 0) {
                int var35 = 1;
                while (true) {
                    if (var35 >= arg2 - 1) {
                        class162.field2877[var41] = var14;
                        class96.field1794[var41] = var15 + 1;
                        class112.field2120[var14][var15 + 1] = 4;
                        var41 = var41 + 1 & 0xFFF;
                        class247.field4370[var14][var15 + 1] = var31;
                        break;
                    }
                    if ((var19[var14 + var35][arg2 + var15] & 0x12C01F8) != 0) {
                        break;
                    }
                    var35++;
                }
            }
            if (var14 > 0 && var15 > 0 && class112.field2120[var14 - 1][var15 - 1] == 0 && (var19[var14 - 1][var15 + arg2 - 2] & 0x12C0138) == 0 && (var19[var14 - 1][var15 - 1] & 0x12C010E) == 0 && (var19[arg2 + var14 - 1 - 1][var15 - 1] & 0x12C0183) == 0) {
                int var36 = 1;
                while (true) {
                    if (var36 >= arg2 - 1) {
                        class162.field2877[var41] = var14 - 1;
                        class96.field1794[var41] = var15 - 1;
                        class112.field2120[var14 - 1][var15 - 1] = 3;
                        var41 = var41 + 1 & 0xFFF;
                        class247.field4370[var14 - 1][var15 - 1] = var31;
                        break;
                    }
                    if ((var19[var14 - 1][var15 + var36 - 1] & 0x12C013E) != 0 || (var19[var14 + var36 - 1][var15 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var36++;
                }
            }
            if (var14 < 102 && var15 > 0 && class112.field2120[var14 + 1][var15 - 1] == 0 && (var19[var14 + 1][var15 - 1] & 0x12C010E) == 0 && (var19[arg2 + var14][var15 - 1] & 0x12C0183) == 0 && (var19[var14 + arg2][arg2 + var15 - 1 - 1] & 0x12C01E0) == 0) {
                int var37 = 1;
                while (true) {
                    if (var37 >= arg2 - 1) {
                        class162.field2877[var41] = var14 + 1;
                        class96.field1794[var41] = var15 - 1;
                        var41 = var41 + 1 & 0xFFF;
                        class112.field2120[var14 + 1][var15 - 1] = 9;
                        class247.field4370[var14 + 1][var15 - 1] = var31;
                        break;
                    }
                    if ((var19[arg2 + var14][var15 + var37 - 1] & 0x12C01E3) != 0 || (var19[var37 + var14 + 1][var15 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var37++;
                }
            }
            if (var14 > 0 && var15 < 102 && class112.field2120[var14 - 1][var15 + 1] == 0 && (var19[var14 - 1][var15 + 1] & 0x12C010E) == 0 && (var19[var14 - 1][arg2 + var15] & 0x12C0138) == 0 && (var19[var14][var15 + arg2] & 0x12C01E0) == 0) {
                int var38 = 1;
                while (true) {
                    if (arg2 - 1 <= var38) {
                        class162.field2877[var41] = var14 - 1;
                        class96.field1794[var41] = var15 + 1;
                        var41 = var41 + 1 & 0xFFF;
                        class112.field2120[var14 - 1][var15 + 1] = 6;
                        class247.field4370[var14 - 1][var15 + 1] = var31;
                        break;
                    }
                    if ((var19[var14 - 1][var15 + var38 + 1] & 0x12C013E) != 0 || (var19[var38 + var14 - 1][arg2 + var15] & 0x12C01F8) != 0) {
                        break;
                    }
                    var38++;
                }
            }
            if (var14 < 102 && var15 < 102 && class112.field2120[var14 + 1][var15 + 1] == 0 && (var19[var14 + 1][arg2 + var15] & 0x12C0138) == 0 && (var19[arg2 + var14][arg2 + var15] & 0x12C01E0) == 0 && (var19[var14 + arg2][var15 + 1] & 0x12C0183) == 0) {
                for (int var39 = 1; var39 < arg2 - 1; var39++) {
                    if ((var19[var14 + var39 + 1][arg2 + var15] & 0x12C01F8) != 0 || (var19[arg2 + var14][var15 + var39 + 1] & 0x12C01E3) != 0) {
                        continue label372;
                    }
                }
                class162.field2877[var41] = var14 + 1;
                class96.field1794[var41] = var15 + 1;
                var41 = var41 + 1 & 0xFFF;
                class112.field2120[var14 + 1][var15 + 1] = 12;
                class247.field4370[var14 + 1][var15 + 1] = var31;
            }
        }
        class200.field3575 = 0;
        if (!var16) {
            if (!arg11) {
                return false;
            }
            int var20 = 1000;
            int var21 = 100;
            byte var22 = 10;
            for (int var23 = arg7 - var22; var23 <= (arg7 + var22); var23++) {
                for (int var24 = arg0 - var22; var24 <= (arg0 + var22); var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class247.field4370[var23][var24] < 100) {
                        int var25 = 0;
                        if (arg7 > var23) {
                            var25 = arg7 - var23;
                        } else if (arg6 + arg7 - 1 < var23) {
                            var25 = var23 + 1 - (arg6 + arg7);
                        }
                        int var26 = 0;
                        if (var24 < arg0) {
                            var26 = arg0 - var24;
                        } else if (arg12 + arg0 - 1 < var24) {
                            var26 = var24 + 1 - arg12 - arg0;
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var20 > var27 || var20 == var27 && class247.field4370[var23][var24] < var21) {
                            var15 = var24;
                            var21 = class247.field4370[var23][var24];
                            var20 = var27;
                            var14 = var23;
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return false;
            }
            if (arg10 == var14 && arg5 == var15) {
                return false;
            }
            class200.field3575 = 1;
        }
        byte var28 = 0;
        if (arg4 != -36) {
            method1342(-15);
        }
        class162.field2877[var28] = var14;
        int var42 = var28 + 1;
        class96.field1794[var28] = var15;
        int var29;
        int var30 = var29 = class112.field2120[var14][var15];
        while (arg10 != var14 || arg5 != var15) {
            if (var29 != var30) {
                var29 = var30;
                class162.field2877[var42] = var14;
                class96.field1794[var42++] = var15;
            }
            if ((var30 & 0x1) != 0) {
                var15++;
            } else if ((var30 & 0x4) != 0) {
                var15--;
            }
            if ((var30 & 0x2) != 0) {
                var14++;
            } else if ((var30 & 0x8) != 0) {
                var14--;
            }
            var30 = class112.field2120[var14][var15];
        }
        if (var42 > 0) {
            class148.method1096(arg1, var42, (byte) 56);
            return true;
        } else if (arg1 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IILhi;IB)V")
    public static final void method1340(int arg0, int arg1, class24 arg2, int arg3, byte arg4) {
        field3298++;
        int var5 = 73 % ((arg4 + 74) / 52);
        if (class269.field4658 >= 3) {
            class262.method1758(arg1, arg3, 0, arg2.field458, arg2.field354);
        } else {
            ((class21) class51.field891).method130(arg1, arg3, arg2.field468, arg2.field341, class51.field891.field4578 / 2, class51.field891.field4581 / 2, class249.field4414, 256, arg2.field458, arg2.field354);
        }
        class52.field905[arg0] = true;
    }

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "(I)V")
    public static void method1341(int arg0) {
        field3299 = null;
        field3301 = null;
        field3302 = null;
        field3300 = null;
        field3295 = null;
        field3303 = null;
        field3297 = null;
        if (arg0 < 30) {
            field3297 = null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "(I)[Lc;")
    public static final class267[] method1342(int arg0) {
        class267[] var1 = new class267[class246.field4365];
        field3309++;
        for (int var2 = 0; var2 < class246.field4365; var2++) {
            var1[var2] = new class179(class222.field3911, class3.field45, class56.field939[var2], class215.field3816[var2], class219.field3858[var2], class118.field2209[var2], class273.field4765[var2], class107.field1980);
        }
        if (arg0 >= -67) {
            field3301 = null;
        }
        class242.method1661(29720);
        return var1;
    }
}
