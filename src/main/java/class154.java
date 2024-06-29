import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class154 extends class134 {

    @OriginalMember(owner = "client!ab", name = "C", descriptor = "[Ltf;")
    public class114[] field2418 = new class114[5];

    @OriginalMember(owner = "client!ab", name = "B", descriptor = "[I")
    public int[] field2417 = new int[5];

    @OriginalMember(owner = "client!ab", name = "S", descriptor = "I")
    public int field2434 = 0;

    @OriginalMember(owner = "client!ab", name = "K", descriptor = "I")
    public int field2426;

    @OriginalMember(owner = "client!ab", name = "Q", descriptor = "I")
    public int field2432;

    @OriginalMember(owner = "client!ab", name = "A", descriptor = "I")
    public int field2416;

    @OriginalMember(owner = "client!ab", name = "N", descriptor = "I")
    public int field2429;

    @OriginalMember(owner = "client!ab", name = "q", descriptor = "I")
    public static int field2406 = 0;

    @OriginalMember(owner = "client!ab", name = "p", descriptor = "Lwa;")
    public static class281 field2405 = new class281();

    @OriginalMember(owner = "client!ab", name = "x", descriptor = "B")
    public byte field2413;

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!ab", name = "r", descriptor = "I")
    public static int field2407;

    @OriginalMember(owner = "client!ab", name = "s", descriptor = "I")
    public static int field2408;

    @OriginalMember(owner = "client!ab", name = "t", descriptor = "I")
    public static int field2409;

    @OriginalMember(owner = "client!ab", name = "u", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!ab", name = "z", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "client!ab", name = "G", descriptor = "I")
    public int field2422;

    @OriginalMember(owner = "client!ab", name = "J", descriptor = "I")
    public int field2425;

    @OriginalMember(owner = "client!ab", name = "L", descriptor = "I")
    public int field2427;

    @OriginalMember(owner = "client!ab", name = "P", descriptor = "I")
    public int field2431;

    @OriginalMember(owner = "client!ab", name = "R", descriptor = "I")
    public int field2433;

    @OriginalMember(owner = "client!ab", name = "I", descriptor = "Lnl;")
    public class100 field2424;

    @OriginalMember(owner = "client!ab", name = "M", descriptor = "Lkj;")
    public class153 field2428;

    @OriginalMember(owner = "client!ab", name = "T", descriptor = "Lab;")
    public class154 field2435;

    @OriginalMember(owner = "client!ab", name = "O", descriptor = "Lnf;")
    public class166 field2430;

    @OriginalMember(owner = "client!ab", name = "H", descriptor = "Lmb;")
    public class168 field2423;

    @OriginalMember(owner = "client!ab", name = "v", descriptor = "Ll;")
    public class169 field2411;

    @OriginalMember(owner = "client!ab", name = "D", descriptor = "Lnd;")
    public class286 field2419;

    @OriginalMember(owner = "client!ab", name = "y", descriptor = "Lem;")
    public class98 field2414;

    @OriginalMember(owner = "client!ab", name = "w", descriptor = "Z")
    public boolean field2412;

    @OriginalMember(owner = "client!ab", name = "E", descriptor = "Z")
    public boolean field2420;

    @OriginalMember(owner = "client!ab", name = "F", descriptor = "Z")
    public boolean field2421;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(III)V")
    public static final void method1010(int arg0, int arg1, int arg2) {
        field2408++;
        class36 var3 = class161.method1067(7, arg2, (byte) 81);
        var3.method219(-20);
        var3.field465 = arg0;
        if (arg1 >= -21) {
            field2406 = 109;
        }
    }

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "(I)V")
    public static final void method1011(int arg0) {
        field2407++;
        class84.field1315.method145(-97);
        if (arg0 == 1) {
            class100.field1509.method145(arg0 ^ 0xFFFFFF91);
            class160.field2525.method145(-70);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IZ)Lm;")
    public static final class124 method1012(int arg0, boolean arg1) {
        class124 var2 = (class124) class236.field3736.method1343(60, (long) arg0);
        field2410++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class285.field4761.method1877(class220.method1543(arg0, (byte) -125), class82.method551(-24862, arg0), (byte) 65);
        class124 var4 = new class124();
        if (var3 != null) {
            var4.method818(new class202(var3), -14625);
        }
        class236.field3736.method1337(var4, (long) arg0, -1);
        if (arg1) {
            method1016(6, -24, -60, -1, false, -89, -51, -110, 83, 125, 87, -22);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(III)V")
    public class154(int arg0, int arg1, int arg2) {
        this.field2426 = arg2;
        this.field2432 = arg1;
        this.field2429 = this.field2416 = arg0;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)I")
    public static final int method1013(String arg0, int arg1, String arg2, int arg3) {
        field2403++;
        int var4 = 0;
        int var5 = 0;
        int var6 = arg0.length();
        int var7 = arg2.length();
        char var8 = 0;
        char var9 = 0;
        while (var4 - var9 < var6 || (var5 - var8) < var7) {
            if (var6 <= (var4 - var9)) {
                return -1;
            }
            if ((var5 - var8) >= var7) {
                return 1;
            }
            char var22;
            if (var9 == '\u0000') {
                var22 = arg0.charAt(var4++);
            } else {
                var22 = var9;
                boolean var23 = false;
            }
            char var24;
            if (var8 == '\u0000') {
                var24 = arg2.charAt(var5++);
            } else {
                var24 = var8;
                boolean var25 = false;
            }
            var9 = class169.method1119(105, var22);
            var8 = class169.method1119(121, var24);
            char var26 = class208.method1476(true, var22, arg1);
            char var27 = class208.method1476(true, var24, arg1);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class243.method1707(0, var28, arg1) - class243.method1707(0, var29, arg1);
                }
            }
        }
        if (arg3 <= 31) {
            field2405 = null;
        }
        int var10 = Math.min(var6, var7);
        for (int var11 = 0; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg1 == 2) {
                var17 = var6 - var11 - 1;
                var16 = var7 - var11 - 1;
            } else {
                var16 = var11;
                var17 = var11;
            }
            char var18 = arg0.charAt(var17);
            char var19 = arg2.charAt(var16);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class243.method1707(0, var20, arg1) - class243.method1707(0, var21, arg1);
                }
            }
        }
        int var12 = var6 - var7;
        if (var12 != 0) {
            return var12;
        }
        for (int var13 = 0; var13 < var10; var13++) {
            char var14 = arg0.charAt(var13);
            char var15 = arg2.charAt(var13);
            if (var14 != var15) {
                return class243.method1707(0, var14, arg1) - class243.method1707(0, var15, arg1);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILjava/lang/String;C)I")
    public static final int method1014(int arg0, String arg1, char arg2) {
        field2415++;
        int var3 = 0;
        int var4 = arg1.length();
        int var5 = 0;
        if (arg0 <= 76) {
            method1015(89, -37);
        }
        while (var5 < var4) {
            if (arg1.charAt(var5) == arg2) {
                var3++;
            }
            var5++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)V")
    public static final void method1015(int arg0, int arg1) {
        class140.field2161.method147(arg1, (byte) -123);
        field2402++;
        if (arg0 != 0) {
            method1015(8, 95);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIZIIIIIII)V")
    public static final void method1016(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field2404++;
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var36 = 0; var36 < 104; var36++) {
                class171.field2647[var12][var36] = 0;
                class304.field4963[var12][var36] = 99999999;
            }
        }
        if (arg8 != 1) {
            method1017((class273) null, (class273) null, -112);
        }
        class171.field2647[arg2][arg5] = 99;
        int var13 = arg2;
        class304.field4963[arg2][arg5] = 0;
        int var14 = arg5;
        byte var15 = 0;
        class11.field140[var15] = arg2;
        int var37 = var15 + 1;
        class171.field2652[var15] = arg5;
        boolean var16 = false;
        int var17 = 0;
        int[][] var18 = class183.field2841[class165.field2600].field2211;
        label317: while (var37 != var17) {
            var13 = class11.field140[var17];
            var14 = class171.field2652[var17];
            var17 = var17 + 1 & 0xFFF;
            if (arg0 == var13 && arg1 == var14) {
                var16 = true;
                break;
            }
            if (arg11 != 0) {
                if ((arg11 < 5 || arg11 == 10) && class183.field2841[class165.field2600].method960(arg11 - 1, arg9, 9270, arg1, arg6, arg0, var14, var13)) {
                    var16 = true;
                    break;
                }
                if (arg11 < 10 && class183.field2841[class165.field2600].method962(arg1, var14, arg11 - 1, arg6, arg9, (byte) -47, var13, arg0)) {
                    var16 = true;
                    break;
                }
            }
            if (arg10 != 0 && arg7 != 0 && class183.field2841[class165.field2600].method958(arg0, arg6, arg1, arg7, (byte) 105, var14, var13, arg3, arg10)) {
                var16 = true;
                break;
            }
            int var27 = class304.field4963[var13][var14] + 1;
            if (var13 > 0 && class171.field2647[var13 - 1][var14] == 0 && (var18[var13 - 1][var14] & 0x2C010E) == 0 && (var18[var13 - 1][var14 + arg6 - 1] & 0x2C0138) == 0) {
                int var28 = 1;
                while (true) {
                    if (var28 >= arg6 - 1) {
                        class11.field140[var37] = var13 - 1;
                        class171.field2652[var37] = var14;
                        var37 = var37 + 1 & 0xFFF;
                        class171.field2647[var13 - 1][var14] = 2;
                        class304.field4963[var13 - 1][var14] = var27;
                        break;
                    }
                    if ((var18[var13 - 1][var14 + var28] & 0x2C013E) != 0) {
                        break;
                    }
                    var28++;
                }
            }
            if (var13 < 102 && class171.field2647[var13 + 1][var14] == 0 && (var18[arg6 + var13][var14] & 0x2C0183) == 0 && (var18[arg6 + var13][arg6 + var14 - 1] & 0x2C01E0) == 0) {
                int var29 = 1;
                while (true) {
                    if (var29 >= (arg6 - 1)) {
                        class11.field140[var37] = var13 + 1;
                        class171.field2652[var37] = var14;
                        var37 = var37 + 1 & 0xFFF;
                        class171.field2647[var13 + 1][var14] = 8;
                        class304.field4963[var13 + 1][var14] = var27;
                        break;
                    }
                    if ((var18[var13 + arg6][var14 + var29] & 0x2C01E3) != 0) {
                        break;
                    }
                    var29++;
                }
            }
            if (var14 > 0 && class171.field2647[var13][var14 - 1] == 0 && (var18[var13][var14 - 1] & 0x2C010E) == 0 && (var18[arg6 + var13 - 1][var14 - 1] & 0x2C0183) == 0) {
                int var30 = 1;
                while (true) {
                    if (var30 >= (arg6 - 1)) {
                        class11.field140[var37] = var13;
                        class171.field2652[var37] = var14 - 1;
                        class171.field2647[var13][var14 - 1] = 1;
                        class304.field4963[var13][var14 - 1] = var27;
                        var37 = var37 + 1 & 0xFFF;
                        break;
                    }
                    if ((var18[var13 + var30][var14 - 1] & 0x2C018F) != 0) {
                        break;
                    }
                    var30++;
                }
            }
            if (var14 < 102 && class171.field2647[var13][var14 + 1] == 0 && (var18[var13][arg6 + var14] & 0x2C0138) == 0 && (var18[var13 + arg6 - 1][arg6 + var14] & 0x2C01E0) == 0) {
                int var31 = 1;
                while (true) {
                    if (var31 >= arg6 - 1) {
                        class11.field140[var37] = var13;
                        class171.field2652[var37] = var14 + 1;
                        var37 = var37 + 1 & 0xFFF;
                        class171.field2647[var13][var14 + 1] = 4;
                        class304.field4963[var13][var14 + 1] = var27;
                        break;
                    }
                    if ((var18[var13 + var31][var14 + arg6] & 0x2C01F8) != 0) {
                        break;
                    }
                    var31++;
                }
            }
            if (var13 > 0 && var14 > 0 && class171.field2647[var13 - 1][var14 - 1] == 0 && (var18[var13 - 1][var14 - 1] & 0x2C010E) == 0) {
                int var32 = 1;
                while (true) {
                    if (arg6 <= var32) {
                        class11.field140[var37] = var13 - 1;
                        class171.field2652[var37] = var14 - 1;
                        var37 = var37 + 1 & 0xFFF;
                        class171.field2647[var13 - 1][var14 - 1] = 3;
                        class304.field4963[var13 - 1][var14 - 1] = var27;
                        break;
                    }
                    if ((var18[var13 - 1][var32 + var14 - 1] & 0x2C013E) != 0 || (var18[var32 + var13 - 1][var14 - 1] & 0x2C018F) != 0) {
                        break;
                    }
                    var32++;
                }
            }
            if (var13 < 102 && var14 > 0 && class171.field2647[var13 + 1][var14 - 1] == 0 && (var18[arg6 + var13][var14 - 1] & 0x2C0183) == 0) {
                int var33 = 1;
                while (true) {
                    if (var33 >= arg6) {
                        class11.field140[var37] = var13 + 1;
                        class171.field2652[var37] = var14 - 1;
                        var37 = var37 + 1 & 0xFFF;
                        class171.field2647[var13 + 1][var14 - 1] = 9;
                        class304.field4963[var13 + 1][var14 - 1] = var27;
                        break;
                    }
                    if ((var18[arg6 + var13][var33 + var14 - 1] & 0x2C01E3) != 0 || (var18[var13 + var33][var14 - 1] & 0x2C018F) != 0) {
                        break;
                    }
                    var33++;
                }
            }
            if (var13 > 0 && var14 < 102 && class171.field2647[var13 - 1][var14 + 1] == 0 && (var18[var13 - 1][var14 + arg6] & 0x2C0138) == 0) {
                int var34 = 1;
                while (true) {
                    if (arg6 <= var34) {
                        class11.field140[var37] = var13 - 1;
                        class171.field2652[var37] = var14 + 1;
                        var37 = var37 + 1 & 0xFFF;
                        class171.field2647[var13 - 1][var14 + 1] = 6;
                        class304.field4963[var13 - 1][var14 + 1] = var27;
                        break;
                    }
                    if ((var18[var13 - 1][var14 + var34] & 0x2C013E) != 0 || (var18[var34 + var13 - 1][arg6 + var14] & 0x2C01F8) != 0) {
                        break;
                    }
                    var34++;
                }
            }
            if (var13 < 102 && var14 < 102 && class171.field2647[var13 + 1][var14 + 1] == 0 && (var18[arg6 + var13][var14 + arg6] & 0x2C01E0) == 0) {
                for (int var35 = 1; var35 < arg6; var35++) {
                    if ((var18[var13 + var35][var14 + arg6] & 0x2C01F8) != 0 || (var18[arg6 + var13][var14 + var35] & 0x2C01E3) != 0) {
                        continue label317;
                    }
                }
                class11.field140[var37] = var13 + 1;
                class171.field2652[var37] = var14 + 1;
                class171.field2647[var13 + 1][var14 + 1] = 12;
                var37 = var37 + 1 & 0xFFF;
                class304.field4963[var13 + 1][var14 + 1] = var27;
            }
        }
        if (!var16) {
            if (!arg4) {
                return;
            }
            int var19 = 100;
            byte var20 = 10;
            int var21 = 1000;
            for (int var22 = arg0 - var20; var22 <= arg0 + var20; var22++) {
                for (int var23 = arg1 - var20; var23 <= arg1 + var20; var23++) {
                    if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104 && class304.field4963[var22][var23] < 100) {
                        int var24 = 0;
                        if (arg0 > var22) {
                            var24 = arg0 - var22;
                        } else if (var22 > arg0 + arg10 - 1) {
                            var24 = var22 + 1 - arg0 - arg10;
                        }
                        int var25 = 0;
                        if (var23 < arg1) {
                            var25 = arg1 - var23;
                        } else if (var23 > arg1 + arg7 - 1) {
                            var25 = var23 + 1 - arg1 - arg7;
                        }
                        int var26 = var24 * var24 + (var25 * var25);
                        if (var26 < var21 || var21 == var26 && var19 > class304.field4963[var22][var23]) {
                            var21 = var26;
                            var19 = class304.field4963[var22][var23];
                            var14 = var23;
                            var13 = var22;
                        }
                    }
                }
            }
            if (var21 == 1000) {
                return;
            }
            if (arg2 == var13 && arg5 == var14) {
                return;
            }
        }
        class271.field4443 = var14;
        client.field2582 = false;
        class281.field4649 = var13;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lfa;Lfa;I)V")
    public static final void method1017(class273 arg0, class273 arg1, int arg2) {
        class134.field2107 = arg1;
        field2409++;
        class22.field295 = arg0;
        if (arg2 != 1000) {
            field2406 = -18;
        }
        class68.field995 = class134.field2107.method1890(true, 3);
    }

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "(I)V")
    public static void method1018(int arg0) {
        field2405 = null;
        if (arg0 != 1) {
            method1018(100);
        }
    }
}
