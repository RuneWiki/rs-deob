import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class72 {

    @OriginalMember(owner = "client!c", name = "k", descriptor = "I")
    public int field941;

    @OriginalMember(owner = "client!c", name = "h", descriptor = "I")
    public int field938;

    @OriginalMember(owner = "client!c", name = "m", descriptor = "I")
    public int field943;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "I")
    public int field931;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "Lfe;")
    public static class248 field937 = new class248(64);

    @OriginalMember(owner = "client!c", name = "b", descriptor = "I")
    public static int field932;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "I")
    public static int field933;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "I")
    public static int field934;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "client!c", name = "i", descriptor = "I")
    public static int field939;

    @OriginalMember(owner = "client!c", name = "j", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!c", name = "l", descriptor = "I")
    public static int field942;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "Lnh;")
    public static class328 field936;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II)Z", line = 8)
    public static final boolean method463(int arg0, int arg1) {
        field932++;
        if (class44.field560[arg1]) {
            return true;
        } else if (class138.field2094.method1455(arg1, -95)) {
            int var2 = class138.field2094.method1464((byte) 34, arg1);
            if (var2 == 0) {
                class44.field560[arg1] = true;
                return true;
            }
            if (class278.field4231[arg1] == null) {
                class278.field4231[arg1] = new class329[var2];
            }
            int var3 = 3 / ((-arg0 - 56) / 62);
            for (int var4 = 0; var4 < var2; var4++) {
                if (class278.field4231[arg1][var4] == null) {
                    byte[] var5 = class138.field2094.method1441(var4, (byte) -44, arg1);
                    if (var5 != null) {
                        class329 var6 = class278.field4231[arg1][var4] = new class329();
                        var6.field5086 = (arg1 << 16) + var4;
                        if (var5[0] == -1) {
                            var6.method2249(new class263(var5), -69);
                        } else {
                            var6.method2251(new class263(var5), 126);
                        }
                    }
                }
            }
            class44.field560[arg1] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIIIII)V", line = 69)
    public static final void method464(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field942++;
        if (arg8 != 9608) {
            field939 = -98;
        }
        if (method463(-121, arg3)) {
            class266.method1868(arg2, arg1, arg0, arg6, class278.field4231[arg3], arg7, -1, arg5, (byte) -23, arg4);
        } else if (arg4 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class22.field298[var9] = true;
            }
        } else {
            class22.field298[arg4] = true;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(B)Z", line = 98)
    public static final boolean method465(byte arg0) {
        field933++;
        if (class49.field624) {
            try {
                class25.method168("showVideoAd", class274.field4200.field3963, 120);
                return true;
            } catch (Throwable var2) {
            }
        }
        if (arg0 < 89) {
            method466((String) null, false);
        }
        return false;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;", line = 122)
    public static final String method466(String arg0, boolean arg1) {
        if (arg1) {
            method469(115, -12, 99, -123, -105, 39, 57, 100, 116, -59, -125, false, -60);
        }
        field934++;
        String var2 = class177.method1224(0, class242.method1638(arg0, -14393));
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V", line = 144)
    public static void method467(int arg0) {
        field937 = null;
        if (arg0 != 4) {
            field936 = (class328) null;
        }
        field936 = null;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(II)Lof;", line = 155)
    public static final class272 method468(int arg0, int arg1) {
        field935++;
        class272 var2 = (class272) class228.field3471.method2180((long) arg0, (byte) 31);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class210.field3181.method1441(class96.method683(1954325552, arg0), (byte) -44, class237.method1623((byte) -23, arg0));
        class272 var4 = new class272();
        int var5 = -58 % ((arg1 + 66) / 49);
        var4.field4172 = arg0;
        if (var3 != null) {
            var4.method1922(new class263(var3), true);
        }
        var4.method1925(-31799);
        class228.field3471.method2175((long) arg0, var4, -104);
        return var4;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIIIIIIIZI)Z", line = 180)
    public static final boolean method469(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, boolean arg11, int arg12) {
        field940++;
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var14 = 0; var14 < 104; var14++) {
                class146.field2209[var13][var14] = 0;
                class145.field2201[var13][var14] = 99999999;
            }
        }
        class146.field2209[arg5][arg10] = 99;
        int var15 = arg5;
        class145.field2201[arg5][arg10] = 0;
        int var16 = 0;
        byte var17 = 0;
        int var18 = arg10;
        class97.field1462[var17] = arg5;
        int var41 = var17 + 1;
        class93.field1399[var17] = arg10;
        boolean var19 = false;
        int[][] var20 = class325.field4896[class180.field2697].field2857;
        label394: while (var16 != var41) {
            var18 = class93.field1399[var16];
            var15 = class97.field1462[var16];
            var16 = var16 + 1 & 0xFFF;
            if (arg8 == var15 && arg3 == var18) {
                var19 = true;
                break;
            }
            if (arg6 != 0) {
                if ((arg6 < 5 || arg6 == 10) && class325.field4896[class180.field2697].method1316(var18, arg3, var15, arg6 - 1, arg8, arg9, arg12, 112)) {
                    var19 = true;
                    break;
                }
                if (arg6 < 10 && class325.field4896[class180.field2697].method1312(arg12, arg6 - 1, arg9, -23731, arg3, arg8, var15, var18)) {
                    var19 = true;
                    break;
                }
            }
            if (arg0 != 0 && arg2 != 0 && class325.field4896[class180.field2697].method1300(arg0, arg8, arg2, var15, arg3, arg12, arg1, (byte) 126, var18)) {
                var19 = true;
                break;
            }
            int var21 = class145.field2201[var15][var18] + 1;
            if (var15 > 0 && class146.field2209[var15 - 1][var18] == 0 && (var20[var15 - 1][var18] & 0x12C010E) == 0 && (var20[var15 - 1][arg12 + var18 - 1] & 0x12C0138) == 0) {
                int var22 = 1;
                while (true) {
                    if (arg12 - 1 <= var22) {
                        class97.field1462[var41] = var15 - 1;
                        class93.field1399[var41] = var18;
                        var41 = var41 + 1 & 0xFFF;
                        class146.field2209[var15 - 1][var18] = 2;
                        class145.field2201[var15 - 1][var18] = var21;
                        break;
                    }
                    if ((var20[var15 - 1][var18 + var22] & 0x12C013E) != 0) {
                        break;
                    }
                    var22++;
                }
            }
            if (var15 < 102 && class146.field2209[var15 + 1][var18] == 0 && (var20[arg12 + var15][var18] & 0x12C0183) == 0 && (var20[arg12 + var15][var18 + arg12 - 1] & 0x12C01E0) == 0) {
                int var23 = 1;
                while (true) {
                    if ((arg12 - 1) <= var23) {
                        class97.field1462[var41] = var15 + 1;
                        class93.field1399[var41] = var18;
                        var41 = var41 + 1 & 0xFFF;
                        class146.field2209[var15 + 1][var18] = 8;
                        class145.field2201[var15 + 1][var18] = var21;
                        break;
                    }
                    if ((var20[var15 + arg12][var18 + var23] & 0x12C01E3) != 0) {
                        break;
                    }
                    var23++;
                }
            }
            if (var18 > 0 && class146.field2209[var15][var18 - 1] == 0 && (var20[var15][var18 - 1] & 0x12C010E) == 0 && (var20[arg12 + var15 - 1][var18 - 1] & 0x12C0183) == 0) {
                int var24 = 1;
                while (true) {
                    if (var24 >= arg12 - 1) {
                        class97.field1462[var41] = var15;
                        class93.field1399[var41] = var18 - 1;
                        var41 = var41 + 1 & 0xFFF;
                        class146.field2209[var15][var18 - 1] = 1;
                        class145.field2201[var15][var18 - 1] = var21;
                        break;
                    }
                    if ((var20[var15 + var24][var18 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var24++;
                }
            }
            if (var18 < 102 && class146.field2209[var15][var18 + 1] == 0 && (var20[var15][arg12 + var18] & 0x12C0138) == 0 && (var20[var15 + arg12 - 1][arg12 + var18] & 0x12C01E0) == 0) {
                int var25 = 1;
                while (true) {
                    if (var25 >= arg12 - 1) {
                        class97.field1462[var41] = var15;
                        class93.field1399[var41] = var18 + 1;
                        var41 = var41 + 1 & 0xFFF;
                        class146.field2209[var15][var18 + 1] = 4;
                        class145.field2201[var15][var18 + 1] = var21;
                        break;
                    }
                    if ((var20[var15 + var25][var18 + arg12] & 0x12C01F8) != 0) {
                        break;
                    }
                    var25++;
                }
            }
            if (var15 > 0 && var18 > 0 && class146.field2209[var15 - 1][var18 - 1] == 0 && (var20[var15 - 1][arg12 + var18 - 1 - 1] & 0x12C0138) == 0 && (var20[var15 - 1][var18 - 1] & 0x12C010E) == 0 && (var20[var15 - (-arg12 + 1) - 1][var18 - 1] & 0x12C0183) == 0) {
                int var26 = 1;
                while (true) {
                    if ((arg12 - 1) <= var26) {
                        class97.field1462[var41] = var15 - 1;
                        class93.field1399[var41] = var18 - 1;
                        var41 = var41 + 1 & 0xFFF;
                        class146.field2209[var15 - 1][var18 - 1] = 3;
                        class145.field2201[var15 - 1][var18 - 1] = var21;
                        break;
                    }
                    if ((var20[var15 - 1][var26 + var18 - 1] & 0x12C013E) != 0 || (var20[var15 + var26 - 1][var18 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var26++;
                }
            }
            if (var15 < 102 && var18 > 0 && class146.field2209[var15 + 1][var18 - 1] == 0 && (var20[var15 + 1][var18 - 1] & 0x12C010E) == 0 && (var20[arg12 + var15][var18 - 1] & 0x12C0183) == 0 && (var20[arg12 + var15][var18 + arg12 - 1 - 1] & 0x12C01E0) == 0) {
                int var27 = 1;
                while (true) {
                    if (arg12 - 1 <= var27) {
                        class97.field1462[var41] = var15 + 1;
                        class93.field1399[var41] = var18 - 1;
                        var41 = var41 + 1 & 0xFFF;
                        class146.field2209[var15 + 1][var18 - 1] = 9;
                        class145.field2201[var15 + 1][var18 - 1] = var21;
                        break;
                    }
                    if ((var20[arg12 + var15][var18 + var27 - 1] & 0x12C01E3) != 0 || (var20[var15 + var27 + 1][var18 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var27++;
                }
            }
            if (var15 > 0 && var18 < 102 && class146.field2209[var15 - 1][var18 + 1] == 0 && (var20[var15 - 1][var18 + 1] & 0x12C010E) == 0 && (var20[var15 - 1][arg12 + var18] & 0x12C0138) == 0 && (var20[var15][arg12 + var18] & 0x12C01E0) == 0) {
                int var28 = 1;
                while (true) {
                    if (arg12 - 1 <= var28) {
                        class97.field1462[var41] = var15 - 1;
                        class93.field1399[var41] = var18 + 1;
                        class146.field2209[var15 - 1][var18 + 1] = 6;
                        class145.field2201[var15 - 1][var18 + 1] = var21;
                        var41 = var41 + 1 & 0xFFF;
                        break;
                    }
                    if ((var20[var15 - 1][var18 + var28 + 1] & 0x12C013E) != 0 || (var20[var15 + var28 - 1][var18 + arg12] & 0x12C01F8) != 0) {
                        break;
                    }
                    var28++;
                }
            }
            if (var15 < 102 && var18 < 102 && class146.field2209[var15 + 1][var18 + 1] == 0 && (var20[var15 + 1][arg12 + var18] & 0x12C0138) == 0 && (var20[arg12 + var15][arg12 + var18] & 0x12C01E0) == 0 && (var20[arg12 + var15][var18 + 1] & 0x12C0183) == 0) {
                for (int var29 = 1; var29 < (arg12 - 1); var29++) {
                    if ((var20[var15 + var29 + 1][arg12 + var18] & 0x12C01F8) != 0 || (var20[arg12 + var15][var18 + var29 + 1] & 0x12C01E3) != 0) {
                        continue label394;
                    }
                }
                class97.field1462[var41] = var15 + 1;
                class93.field1399[var41] = var18 + 1;
                class146.field2209[var15 + 1][var18 + 1] = 12;
                var41 = var41 + 1 & 0xFFF;
                class145.field2201[var15 + 1][var18 + 1] = var21;
            }
        }
        class20.field237 = 0;
        if (!var19) {
            if (!arg11) {
                return false;
            }
            int var30 = 1000;
            int var31 = 100;
            byte var32 = 10;
            for (int var33 = arg8 - var32; var33 <= arg8 + var32; var33++) {
                for (int var34 = arg3 - var32; var34 <= arg3 + var32; var34++) {
                    if (var33 >= 0 && var34 >= 0 && var33 < 104 && var34 < 104 && class145.field2201[var33][var34] < 100) {
                        int var35 = 0;
                        if (arg8 > var33) {
                            var35 = arg8 - var33;
                        } else if ((arg8 + arg0 - 1) < var33) {
                            var35 = -arg8 - arg0 - (-1 - var33);
                        }
                        int var36 = 0;
                        if (var34 < arg3) {
                            var36 = arg3 - var34;
                        } else if (var34 > arg2 + arg3 - 1) {
                            var36 = var34 + 1 - arg3 - arg2;
                        }
                        int var37 = var35 * var35 + var36 * var36;
                        if (var37 < var30 || var30 == var37 && class145.field2201[var33][var34] < var31) {
                            var15 = var33;
                            var18 = var34;
                            var30 = var37;
                            var31 = class145.field2201[var33][var34];
                        }
                    }
                }
            }
            if (var30 == 1000) {
                return false;
            }
            if (arg5 == var15 && arg10 == var18) {
                return false;
            }
            class20.field237 = 1;
        }
        byte var38 = 0;
        class97.field1462[var38] = var15;
        if (arg4 != 104) {
            field936 = (class328) null;
        }
        int var42 = var38 + 1;
        class93.field1399[var38] = var18;
        int var39;
        int var40 = var39 = class146.field2209[var15][var18];
        while (arg5 != var15 || arg10 != var18) {
            if (var39 != var40) {
                var39 = var40;
                class97.field1462[var42] = var15;
                class93.field1399[var42++] = var18;
            }
            if ((var40 & 0x1) != 0) {
                var18++;
            } else if ((var40 & 0x4) != 0) {
                var18--;
            }
            if ((var40 & 0x2) != 0) {
                var15++;
            } else if ((var40 & 0x8) != 0) {
                var15--;
            }
            var40 = class146.field2209[var15][var18];
        }
        if (var42 > 0) {
            class311.method2152(var42, (byte) 98, arg7);
            return true;
        } else if (arg7 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "()V", line = 682)
    public class72() {
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "(Lc;)V", line = 684)
    public class72(class72 arg0) {
        this.field941 = arg0.field941;
        this.field938 = arg0.field938;
        this.field943 = arg0.field943;
        this.field931 = arg0.field931;
    }
}
