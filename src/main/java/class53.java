import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class53 extends class170 {

    @OriginalMember(owner = "client!il", name = "T", descriptor = "Lmh;")
    public static class128 field1029 = class22.method156(123, "<col=ff3000>");

    @OriginalMember(owner = "client!il", name = "X", descriptor = "I")
    public static int field1033 = 0;

    @OriginalMember(owner = "client!il", name = "cb", descriptor = "[Lmh;")
    public static class128[] field1038 = new class128[100];

    @OriginalMember(owner = "client!il", name = "db", descriptor = "Lmh;")
    private static class128 field1039 = class22.method156(124, "Loaded sprites");

    @OriginalMember(owner = "client!il", name = "R", descriptor = "Lmh;")
    public static class128 field1027 = field1039;

    @OriginalMember(owner = "client!il", name = "S", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!il", name = "U", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!il", name = "V", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!il", name = "W", descriptor = "I")
    public static int field1032;

    @OriginalMember(owner = "client!il", name = "Y", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!il", name = "Z", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!il", name = "bb", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!il", name = "ab", descriptor = "Ldj;")
    public static class314 field1036;

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(IIBI)Lib;", line = 22)
    public static final class88 method360(int arg0, int arg1, byte arg2, int arg3) {
        field1031++;
        class88 var4 = new class88();
        var4.field1510 = arg3;
        var4.field1508 = arg0;
        class182.field3198.method730(var4, (long) arg1, (byte) -87);
        if (arg2 != 61) {
            return (class88) null;
        }
        class74.method485(128, arg3);
        class10 var5 = class233.method1606(true, arg1);
        if (var5 != null) {
            class7.method48(var5, 0);
        }
        if (class36.field739 != null) {
            class7.method48(class36.field739, 0);
            class36.field739 = null;
        }
        int var6 = class275.field4769;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class99.method621(4089, class117.field1979[var7])) {
                class64.method434(var7, (byte) -61);
            }
        }
        if (class275.field4769 == 1) {
            class271.field4721 = false;
            class118.method710(class226.field3946, class219.field3864, class292.field5005, (byte) -122, class309.field5242);
        } else {
            class118.method710(class226.field3946, class219.field3864, class292.field5005, (byte) -125, class309.field5242);
            int var8 = client.field4159.method2070(class301.field5112);
            for (int var9 = 0; var9 < class275.field4769; var9++) {
                int var10 = client.field4159.method2070(class50.method342((byte) 46, var9));
                if (var10 > var8) {
                    var8 = var10;
                }
            }
            class292.field5005 = var8 + 8;
            class219.field3864 = class275.field4769 * 15 + 22;
        }
        if (var5 != null) {
            class15.method112(var5, false, false);
        }
        class181.method1237(arg3, arg2 + 24);
        if (class196.field3433 != -1) {
            class309.method2105(class196.field3433, (byte) 102, 1);
        }
        return var4;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIIIZBIIIIII)Z", line = 103)
    public static final boolean method361(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        field1034++;
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var14 = 0; var14 < 104; var14++) {
                class128.field2229[var13][var14] = 0;
                class42.field851[var13][var14] = 99999999;
            }
        }
        int var15 = arg1;
        byte var16 = 0;
        int var17 = 14 / ((-arg6 - 68) / 37);
        int var18 = arg9;
        class128.field2229[arg1][arg9] = 99;
        class42.field851[arg1][arg9] = 0;
        boolean var19 = false;
        int var20 = 0;
        class103.field1770[var16] = arg1;
        int var42 = var16 + 1;
        class104.field1776[var16] = arg9;
        int[][] var21 = class180.field3158[class133.field2315].field4306;
        label390: while (var42 != var20) {
            var15 = class103.field1770[var20];
            var18 = class104.field1776[var20];
            var20 = var20 + 1 & 0xFFF;
            if (arg0 == var15 && arg12 == var18) {
                var19 = true;
                break;
            }
            if (arg2 != 0) {
                if ((arg2 < 5 || arg2 == 10) && class180.field3158[class133.field2315].method1744(arg0, (byte) -102, var15, arg10, arg12, var18, arg2 - 1, arg3)) {
                    var19 = true;
                    break;
                }
                if (arg2 < 10 && class180.field3158[class133.field2315].method1742(var18, arg2 - 1, arg10, arg12, arg0, var15, arg3, -16941)) {
                    var19 = true;
                    break;
                }
            }
            if (arg7 != 0 && arg11 != 0 && class180.field3158[class133.field2315].method1743(arg11, (byte) 109, arg3, arg12, arg0, var18, var15, arg4, arg7)) {
                var19 = true;
                break;
            }
            int var22 = class42.field851[var15][var18] + 1;
            if (var15 > 0 && class128.field2229[var15 - 1][var18] == 0 && (var21[var15 - 1][var18] & 0x12C010E) == 0 && (var21[var15 - 1][var18 + arg3 - 1] & 0x12C0138) == 0) {
                int var23 = 1;
                while (true) {
                    if (var23 >= arg3 - 1) {
                        class103.field1770[var42] = var15 - 1;
                        class104.field1776[var42] = var18;
                        var42 = var42 + 1 & 0xFFF;
                        class128.field2229[var15 - 1][var18] = 2;
                        class42.field851[var15 - 1][var18] = var22;
                        break;
                    }
                    if ((var21[var15 - 1][var18 + var23] & 0x12C013E) != 0) {
                        break;
                    }
                    var23++;
                }
            }
            if (var15 < 102 && class128.field2229[var15 + 1][var18] == 0 && (var21[arg3 + var15][var18] & 0x12C0183) == 0 && (var21[var15 + arg3][arg3 + var18 - 1] & 0x12C01E0) == 0) {
                int var24 = 1;
                while (true) {
                    if (arg3 - 1 <= var24) {
                        class103.field1770[var42] = var15 + 1;
                        class104.field1776[var42] = var18;
                        class128.field2229[var15 + 1][var18] = 8;
                        class42.field851[var15 + 1][var18] = var22;
                        var42 = var42 + 1 & 0xFFF;
                        break;
                    }
                    if ((var21[var15 + arg3][var18 + var24] & 0x12C01E3) != 0) {
                        break;
                    }
                    var24++;
                }
            }
            if (var18 > 0 && class128.field2229[var15][var18 - 1] == 0 && (var21[var15][var18 - 1] & 0x12C010E) == 0 && (var21[arg3 + var15 - 1][var18 - 1] & 0x12C0183) == 0) {
                int var25 = 1;
                while (true) {
                    if (var25 >= arg3 - 1) {
                        class103.field1770[var42] = var15;
                        class104.field1776[var42] = var18 - 1;
                        class128.field2229[var15][var18 - 1] = 1;
                        class42.field851[var15][var18 - 1] = var22;
                        var42 = var42 + 1 & 0xFFF;
                        break;
                    }
                    if ((var21[var15 + var25][var18 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var25++;
                }
            }
            if (var18 < 102 && class128.field2229[var15][var18 + 1] == 0 && (var21[var15][arg3 + var18] & 0x12C0138) == 0 && (var21[var15 + arg3 - 1][arg3 + var18] & 0x12C01E0) == 0) {
                int var26 = 1;
                while (true) {
                    if ((arg3 - 1) <= var26) {
                        class103.field1770[var42] = var15;
                        class104.field1776[var42] = var18 + 1;
                        class128.field2229[var15][var18 + 1] = 4;
                        class42.field851[var15][var18 + 1] = var22;
                        var42 = var42 + 1 & 0xFFF;
                        break;
                    }
                    if ((var21[var15 + var26][arg3 + var18] & 0x12C01F8) != 0) {
                        break;
                    }
                    var26++;
                }
            }
            if (var15 > 0 && var18 > 0 && class128.field2229[var15 - 1][var18 - 1] == 0 && (var21[var15 - 1][arg3 + var18 - 1 - 1] & 0x12C0138) == 0 && (var21[var15 - 1][var18 - 1] & 0x12C010E) == 0 && (var21[arg3 + var15 - 1 - 1][var18 - 1] & 0x12C0183) == 0) {
                int var27 = 1;
                while (true) {
                    if ((arg3 - 1) <= var27) {
                        class103.field1770[var42] = var15 - 1;
                        class104.field1776[var42] = var18 - 1;
                        class128.field2229[var15 - 1][var18 - 1] = 3;
                        class42.field851[var15 - 1][var18 - 1] = var22;
                        var42 = var42 + 1 & 0xFFF;
                        break;
                    }
                    if ((var21[var15 - 1][var18 + var27 - 1] & 0x12C013E) != 0 || (var21[var27 + var15 - 1][var18 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var27++;
                }
            }
            if (var15 < 102 && var18 > 0 && class128.field2229[var15 + 1][var18 - 1] == 0 && (var21[var15 + 1][var18 - 1] & 0x12C010E) == 0 && (var21[arg3 + var15][var18 - 1] & 0x12C0183) == 0 && (var21[arg3 + var15][var18 + arg3 - 2] & 0x12C01E0) == 0) {
                int var28 = 1;
                while (true) {
                    if (arg3 - 1 <= var28) {
                        class103.field1770[var42] = var15 + 1;
                        class104.field1776[var42] = var18 - 1;
                        class128.field2229[var15 + 1][var18 - 1] = 9;
                        class42.field851[var15 + 1][var18 - 1] = var22;
                        var42 = var42 + 1 & 0xFFF;
                        break;
                    }
                    if ((var21[arg3 + var15][var18 + var28 - 1] & 0x12C01E3) != 0 || (var21[var15 + var28 + 1][var18 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var28++;
                }
            }
            if (var15 > 0 && var18 < 102 && class128.field2229[var15 - 1][var18 + 1] == 0 && (var21[var15 - 1][var18 + 1] & 0x12C010E) == 0 && (var21[var15 - 1][arg3 + var18] & 0x12C0138) == 0 && (var21[var15][var18 + arg3] & 0x12C01E0) == 0) {
                int var29 = 1;
                while (true) {
                    if (var29 >= (arg3 - 1)) {
                        class103.field1770[var42] = var15 - 1;
                        class104.field1776[var42] = var18 + 1;
                        var42 = var42 + 1 & 0xFFF;
                        class128.field2229[var15 - 1][var18 + 1] = 6;
                        class42.field851[var15 - 1][var18 + 1] = var22;
                        break;
                    }
                    if ((var21[var15 - 1][var18 + var29 + 1] & 0x12C013E) != 0 || (var21[var15 + var29 - 1][var18 + arg3] & 0x12C01F8) != 0) {
                        break;
                    }
                    var29++;
                }
            }
            if (var15 < 102 && var18 < 102 && class128.field2229[var15 + 1][var18 + 1] == 0 && (var21[var15 + 1][arg3 + var18] & 0x12C0138) == 0 && (var21[arg3 + var15][arg3 + var18] & 0x12C01E0) == 0 && (var21[arg3 + var15][var18 + 1] & 0x12C0183) == 0) {
                for (int var30 = 1; var30 < arg3 - 1; var30++) {
                    if ((var21[var15 + var30 + 1][arg3 + var18] & 0x12C01F8) != 0 || (var21[arg3 + var15][var18 - (-var30 - 1)] & 0x12C01E3) != 0) {
                        continue label390;
                    }
                }
                class103.field1770[var42] = var15 + 1;
                class104.field1776[var42] = var18 + 1;
                class128.field2229[var15 + 1][var18 + 1] = 12;
                class42.field851[var15 + 1][var18 + 1] = var22;
                var42 = var42 + 1 & 0xFFF;
            }
        }
        class190.field3298 = 0;
        if (!var19) {
            if (!arg5) {
                return false;
            }
            int var31 = 1000;
            byte var32 = 10;
            int var33 = 100;
            for (int var34 = arg0 - var32; var34 <= (arg0 + var32); var34++) {
                for (int var35 = arg12 - var32; var35 <= arg12 + var32; var35++) {
                    if (var34 >= 0 && var35 >= 0 && var34 < 104 && var35 < 104 && class42.field851[var34][var35] < 100) {
                        int var36 = 0;
                        if (arg0 > var34) {
                            var36 = arg0 - var34;
                        } else if (var34 > arg0 + arg7 - 1) {
                            var36 = var34 + 1 - arg7 - arg0;
                        }
                        int var37 = 0;
                        if (var35 < arg12) {
                            var37 = arg12 - var35;
                        } else if ((arg12 + arg11 - 1) < var35) {
                            var37 = var35 - (arg11 + arg12 - 1);
                        }
                        int var38 = var36 * var36 + var37 * var37;
                        if (var31 > var38 || var31 == var38 && var33 > class42.field851[var34][var35]) {
                            var18 = var35;
                            var33 = class42.field851[var34][var35];
                            var31 = var38;
                            var15 = var34;
                        }
                    }
                }
            }
            if (var31 == 1000) {
                return false;
            }
            if (arg1 == var15 && arg9 == var18) {
                return false;
            }
            class190.field3298 = 1;
        }
        byte var39 = 0;
        class103.field1770[var39] = var15;
        int var43 = var39 + 1;
        class104.field1776[var39] = var18;
        int var40;
        int var41 = var40 = class128.field2229[var15][var18];
        while (arg1 != var15 || arg9 != var18) {
            if (var40 != var41) {
                var40 = var41;
                class103.field1770[var43] = var15;
                class104.field1776[var43++] = var18;
            }
            if ((var41 & 0x1) != 0) {
                var18++;
            } else if ((var41 & 0x4) != 0) {
                var18--;
            }
            if ((var41 & 0x2) != 0) {
                var15++;
            } else if ((var41 & 0x8) != 0) {
                var15--;
            }
            var41 = class128.field2229[var15][var18];
        }
        if (var43 > 0) {
            class283.method1964((byte) -96, arg8, var43);
            return true;
        } else if (arg8 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!il", name = "d", descriptor = "(I)V", line = 617)
    public static final void method362(int arg0) {
        for (int var1 = arg0; var1 < class314.field5335; var1++) {
            int var2 = class158.field2715[var1];
            class123 var3 = class140.field2405[var2];
            int var4 = class54.field1051.method1325(7627);
            if ((var4 & 0x2) != 0) {
                var4 += class54.field1051.method1325(7627) << 8;
            }
            class256.method1803((byte) 120, var4, var2, var3);
        }
        field1030++;
    }

    @OriginalMember(owner = "client!il", name = "e", descriptor = "(B)V", line = 642)
    public static void method363(byte arg0) {
        field1036 = null;
        field1027 = null;
        if (arg0 <= -18) {
            field1038 = null;
            field1039 = null;
            field1029 = null;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(BI)[I", line = 660)
    public final int[] method69(byte arg0, int arg1) {
        if (arg0 != 85) {
            method363((byte) 114);
        }
        field1032++;
        return class118.field2002;
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "()V", line = 676)
    public class53() {
        super(0, true);
    }
}
