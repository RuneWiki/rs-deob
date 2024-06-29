import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class259 extends class49 {

    @OriginalMember(owner = "client!gk", name = "u", descriptor = "I")
    public static int field4028 = 0;

    @OriginalMember(owner = "client!gk", name = "q", descriptor = "I")
    public static int field4024 = 100;

    @OriginalMember(owner = "client!gk", name = "w", descriptor = "Z")
    public static boolean field4030 = true;

    @OriginalMember(owner = "client!gk", name = "y", descriptor = "[[S")
    public static short[][] field4032 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!gk", name = "z", descriptor = "Ljava/lang/String;")
    public static String field4033 = "Loading fonts - ";

    @OriginalMember(owner = "client!gk", name = "x", descriptor = "[I")
    public static int[] field4031 = new int[2];

    @OriginalMember(owner = "client!gk", name = "p", descriptor = "I")
    public static int field4023;

    @OriginalMember(owner = "client!gk", name = "r", descriptor = "I")
    public static int field4025;

    @OriginalMember(owner = "client!gk", name = "t", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!gk", name = "v", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!gk", name = "o", descriptor = "Lbm;")
    public static class307 field4022;

    @OriginalMember(owner = "client!gk", name = "s", descriptor = "Lbm;")
    public static class307 field4026;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(II)V", line = 18)
    public static final void method1735(int arg0, int arg1) {
        if (arg1 != 30412) {
            method1735(-55, -61);
        }
        class280.field4319 = 3;
        field4029++;
        class12.field242 = arg0;
        class303.field4601 = 20;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIIZIII)V", line = 37)
    public static final void method1736(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        field4027++;
        if (arg0 == arg5) {
            class296.method1982(arg1, arg3, arg7, arg2, 13, arg6, arg0);
            return;
        }
        if (!arg4) {
            field4030 = false;
        }
        if ((arg2 - arg0) >= class147.field2416 && (arg2 + arg0) <= field4024 && class59.field1162 <= (arg6 - arg5) && class186.field3028 >= (arg5 + arg6)) {
            class279.method1876(arg1, arg2, arg3, arg7, arg0, arg6, arg5, false);
        } else {
            class69.method535(arg0, false, arg3, arg5, arg1, arg6, arg7, arg2);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ILkl;I)I", line = 63)
    public static final int method1737(int arg0, class68 arg1, int arg2) {
        field4025++;
        if (arg1.field1383 == null || arg2 >= arg1.field1383.length) {
            return -2;
        }
        try {
            if (arg0 != 14) {
                return 98;
            }
            int var3 = 0;
            int[] var4 = arg1.field1383[arg2];
            int var5 = 0;
            byte var6 = 0;
            while (true) {
                int var7 = var4[var5++];
                byte var8 = 0;
                int var9 = 0;
                if (var7 == 0) {
                    return var3;
                }
                if (var7 == 15) {
                    var8 = 1;
                }
                if (var7 == 1) {
                    var9 = class327.field5008[var4[var5++]];
                }
                if (var7 == 16) {
                    var8 = 2;
                }
                if (var7 == 2) {
                    var9 = class248.field3866[var4[var5++]];
                }
                if (var7 == 17) {
                    var8 = 3;
                }
                if (var7 == 3) {
                    var9 = class72.field1507[var4[var5++]];
                }
                if (var7 == 4) {
                    int var10 = var4[var5++] << 16;
                    int var11 = var10 + var4[var5++];
                    class68 var12 = class319.method2196(arg0 - 1351736958, var11);
                    int var13 = var4[var5++];
                    if (var13 != -1 && (!class95.method636(22111, var13).field5178 || class15.field277)) {
                        for (int var14 = 0; var14 < var12.field1341.length; var14++) {
                            if ((var13 + 1) == var12.field1341[var14]) {
                                var9 += var12.field1327[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var9 = class40.field771[var4[var5++]];
                }
                if (var7 == 6) {
                    var9 = class133.field2241[class248.field3866[var4[var5++]] - 1];
                }
                if (var7 == 7) {
                    var9 = class40.field771[var4[var5++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var9 = class66.field1265.field4261;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class341.field5290[var15]) {
                            var9 += class248.field3866[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var4[var5++] << 16;
                    int var17 = var16 + var4[var5++];
                    class68 var18 = class319.method2196(arg0 - 1351736958, var17);
                    int var19 = var4[var5++];
                    if (var19 != -1 && (!class95.method636(arg0 + 22097, var19).field5178 || class15.field277)) {
                        for (int var20 = 0; var20 < var18.field1341.length; var20++) {
                            if ((var19 + 1) == var18.field1341[var20]) {
                                var9 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var9 = class246.field3812;
                }
                if (var7 == 12) {
                    var9 = class116.field2046;
                }
                if (var7 == 13) {
                    int var21 = class40.field771[var4[var5++]];
                    int var22 = var4[var5++];
                    var9 = (0x1 << var22 & var21) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var4[var5++];
                    var9 = class281.method1893((byte) 91, var23);
                }
                if (var7 == 18) {
                    var9 = (class66.field1265.field1869 >> 7) + class246.field3818;
                }
                if (var7 == 19) {
                    var9 = (class66.field1265.field1872 >> 7) + class101.field1769;
                }
                if (var7 == 20) {
                    var9 = var4[var5++];
                }
                if (var8 == 0) {
                    if (var6 == 0) {
                        var3 += var9;
                    }
                    if (var6 == 1) {
                        var3 -= var9;
                    }
                    if (var6 == 2 && var9 != 0) {
                        var3 /= var9;
                    }
                    if (var6 == 3) {
                        var3 *= var9;
                    }
                    var6 = 0;
                } else {
                    var6 = var8;
                }
            }
        } catch (Exception var25) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(CII)C", line = 272)
    public static final char method1738(char arg0, int arg1, int arg2) {
        field4023++;
        if (arg0 >= 'À' && arg0 <= 'ÿ') {
            if (arg0 >= 'À' && arg0 <= 'Æ') {
                return 'A';
            }
            if (arg0 == 'Ç') {
                return 'C';
            }
            if (arg0 >= 'È' && arg0 <= 'Ë') {
                return 'E';
            }
            if (arg0 >= 'Ì' && arg0 <= 'Ï') {
                return 'I';
            }
            if (arg0 == 'Ñ' && arg1 != 0) {
                return 'N';
            }
            if (arg0 >= 'Ò' && arg0 <= 'Ö') {
                return 'O';
            }
            if (arg0 >= 'Ù' && arg0 <= 'Ü') {
                return 'U';
            }
            if (arg0 == 'Ý') {
                return 'Y';
            }
            if (arg0 == 'ß') {
                return 's';
            }
            if (arg0 >= 'à' && arg0 <= 'æ') {
                return 'a';
            }
            if (arg0 == 'ç') {
                return 'c';
            }
            if (arg0 >= 'è' && arg0 <= 'ë') {
                return 'e';
            }
            if (arg0 >= 'ì' && arg0 <= 'ï') {
                return 'i';
            }
            if (arg0 == 'ñ' && arg1 != 0) {
                return 'n';
            }
            if (arg0 >= 'ò' && arg0 <= 'ö') {
                return 'o';
            }
            if (arg0 >= 'ù' && arg0 <= 'ü') {
                return 'u';
            }
            if (arg0 == 'ý' || arg0 == 'ÿ') {
                return 'y';
            }
        }
        if (arg0 == 'Œ') {
            return 'O';
        } else if (arg0 == 'œ') {
            return 'o';
        } else if (arg0 == 'Ÿ') {
            return 'Y';
        } else {
            int var3 = -51 % ((arg2 - 24) / 50);
            return arg0;
        }
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(B)V", line = 359)
    public static void method1739(byte arg0) {
        field4022 = null;
        field4032 = (short[][]) null;
        field4031 = null;
        int var1 = -104 % ((arg0) / 46);
        field4033 = null;
        field4026 = null;
    }
}
