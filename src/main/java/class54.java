import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class54 extends class310 {

    @OriginalMember(owner = "client!hc", name = "U", descriptor = "[Led;")
    public static class306[] field984 = new class306[50];

    @OriginalMember(owner = "client!hc", name = "ab", descriptor = "Z")
    public static boolean field990 = false;

    @OriginalMember(owner = "client!hc", name = "kb", descriptor = "I")
    public static int field1000 = 0;

    @OriginalMember(owner = "client!hc", name = "lb", descriptor = "Lke;")
    public static class256 field1001 = class316.method2202(" x ", 27626);

    @OriginalMember(owner = "client!hc", name = "gb", descriptor = "Lke;")
    private static class256 field996 = class316.method2202("white:", 27626);

    @OriginalMember(owner = "client!hc", name = "db", descriptor = "Lke;")
    public static class256 field993 = field996;

    @OriginalMember(owner = "client!hc", name = "X", descriptor = "Lke;")
    public static class256 field987 = field996;

    @OriginalMember(owner = "client!hc", name = "jb", descriptor = "Lra;")
    public static class41 field999 = new class41(new byte[5000]);

    @OriginalMember(owner = "client!hc", name = "mb", descriptor = "I")
    public static int field1002;

    @OriginalMember(owner = "client!hc", name = "nb", descriptor = "I")
    public static int field1003;

    @OriginalMember(owner = "client!hc", name = "ob", descriptor = "I")
    public static int field1004;

    @OriginalMember(owner = "client!hc", name = "pb", descriptor = "I")
    public static int field1005;

    @OriginalMember(owner = "client!hc", name = "V", descriptor = "I")
    public int field985;

    @OriginalMember(owner = "client!hc", name = "W", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!hc", name = "Z", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "client!hc", name = "bb", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!hc", name = "cb", descriptor = "I")
    public static int field992;

    @OriginalMember(owner = "client!hc", name = "fb", descriptor = "I")
    public static int field995;

    @OriginalMember(owner = "client!hc", name = "hb", descriptor = "I")
    public static int field997;

    @OriginalMember(owner = "client!hc", name = "ib", descriptor = "I")
    public static int field998;

    @OriginalMember(owner = "client!hc", name = "eb", descriptor = "Ltj;")
    public class75 field994;

    @OriginalMember(owner = "client!hc", name = "Y", descriptor = "[B")
    public byte[] field988;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lla;B)Lla;", line = 11)
    public static final class188 method427(class188 arg0, byte arg1) {
        field1005++;
        class188 var2 = client.method829(arg0);
        if (arg1 <= 6) {
            return (class188) null;
        } else {
            if (var2 == null) {
                var2 = arg0.field3460;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "(I)V", line = 28)
    public static void method428(int arg0) {
        field999 = null;
        field1001 = null;
        field984 = null;
        field993 = null;
        field987 = null;
        if (arg0 == 1) {
            field996 = null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "(I)I", line = 46)
    public final int method118(int arg0) {
        field998++;
        if (this.field5342) {
            return 0;
        } else {
            int var2 = 64 % ((29 - arg0) / 42);
            return 100;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZIIIIIIIBIIII)Z", line = 72)
    public static final boolean method429(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9, int arg10, int arg11, int arg12) {
        field1004++;
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var14 = 0; var14 < 104; var14++) {
                class199.field3628[var13][var14] = 0;
                class73.field1332[var13][var14] = 99999999;
            }
        }
        class199.field3628[arg5][arg3] = 99;
        int var15 = arg5;
        int var16 = arg3;
        byte var17 = 0;
        boolean var18 = false;
        int var19 = 0;
        class73.field1332[arg5][arg3] = 0;
        class52.field954[var17] = arg5;
        int var41 = var17 + 1;
        class292.field5058[var17] = arg3;
        if (arg8 <= 43) {
            method436(false);
        }
        int[][] var20 = class124.field2201[class255.field4377].field653;
        label396: while (var41 != var19) {
            var15 = class52.field954[var19];
            var16 = class292.field5058[var19];
            var19 = var19 + 1 & 0xFFF;
            if (arg11 == var15 && arg10 == var16) {
                var18 = true;
                break;
            }
            if (arg7 != 0) {
                if ((arg7 < 5 || arg7 == 10) && class124.field2201[class255.field4377].method274(arg2, -24872, var16, var15, arg12, arg11, arg10, arg7 - 1)) {
                    var18 = true;
                    break;
                }
                if (arg7 < 10 && class124.field2201[class255.field4377].method271(arg2, 32, var16, arg11, arg7 - 1, arg12, var15, arg10)) {
                    var18 = true;
                    break;
                }
            }
            if (arg4 != 0 && arg1 != 0 && class124.field2201[class255.field4377].method270(arg9, arg10, var15, arg12, arg4, arg1, var16, arg11, true)) {
                var18 = true;
                break;
            }
            int var21 = class73.field1332[var15][var16] + 1;
            if (var15 > 0 && class199.field3628[var15 - 1][var16] == 0 && (var20[var15 - 1][var16] & 0x12C010E) == 0 && (var20[var15 - 1][var16 + arg12 - 1] & 0x12C0138) == 0) {
                int var22 = 1;
                while (true) {
                    if (arg12 - 1 <= var22) {
                        class52.field954[var41] = var15 - 1;
                        class292.field5058[var41] = var16;
                        class199.field3628[var15 - 1][var16] = 2;
                        var41 = var41 + 1 & 0xFFF;
                        class73.field1332[var15 - 1][var16] = var21;
                        break;
                    }
                    if ((var20[var15 - 1][var16 + var22] & 0x12C013E) != 0) {
                        break;
                    }
                    var22++;
                }
            }
            if (var15 < 102 && class199.field3628[var15 + 1][var16] == 0 && (var20[arg12 + var15][var16] & 0x12C0183) == 0 && (var20[arg12 + var15][arg12 + var16 - 1] & 0x12C01E0) == 0) {
                int var23 = 1;
                while (true) {
                    if (var23 >= arg12 - 1) {
                        class52.field954[var41] = var15 + 1;
                        class292.field5058[var41] = var16;
                        class199.field3628[var15 + 1][var16] = 8;
                        var41 = var41 + 1 & 0xFFF;
                        class73.field1332[var15 + 1][var16] = var21;
                        break;
                    }
                    if ((var20[arg12 + var15][var16 + var23] & 0x12C01E3) != 0) {
                        break;
                    }
                    var23++;
                }
            }
            if (var16 > 0 && class199.field3628[var15][var16 - 1] == 0 && (var20[var15][var16 - 1] & 0x12C010E) == 0 && (var20[arg12 + var15 - 1][var16 - 1] & 0x12C0183) == 0) {
                int var24 = 1;
                while (true) {
                    if (var24 >= arg12 - 1) {
                        class52.field954[var41] = var15;
                        class292.field5058[var41] = var16 - 1;
                        class199.field3628[var15][var16 - 1] = 1;
                        class73.field1332[var15][var16 - 1] = var21;
                        var41 = var41 + 1 & 0xFFF;
                        break;
                    }
                    if ((var20[var15 + var24][var16 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var24++;
                }
            }
            if (var16 < 102 && class199.field3628[var15][var16 + 1] == 0 && (var20[var15][arg12 + var16] & 0x12C0138) == 0 && (var20[var15 + arg12 - 1][arg12 + var16] & 0x12C01E0) == 0) {
                int var25 = 1;
                while (true) {
                    if (var25 >= arg12 - 1) {
                        class52.field954[var41] = var15;
                        class292.field5058[var41] = var16 + 1;
                        var41 = var41 + 1 & 0xFFF;
                        class199.field3628[var15][var16 + 1] = 4;
                        class73.field1332[var15][var16 + 1] = var21;
                        break;
                    }
                    if ((var20[var15 + var25][arg12 + var16] & 0x12C01F8) != 0) {
                        break;
                    }
                    var25++;
                }
            }
            if (var15 > 0 && var16 > 0 && class199.field3628[var15 - 1][var16 - 1] == 0 && (var20[var15 - 1][var16 + arg12 - 1 - 1] & 0x12C0138) == 0 && (var20[var15 - 1][var16 - 1] & 0x12C010E) == 0 && (var20[var15 - (1 - arg12) - 1][var16 - 1] & 0x12C0183) == 0) {
                int var26 = 1;
                while (true) {
                    if (var26 >= arg12 - 1) {
                        class52.field954[var41] = var15 - 1;
                        class292.field5058[var41] = var16 - 1;
                        var41 = var41 + 1 & 0xFFF;
                        class199.field3628[var15 - 1][var16 - 1] = 3;
                        class73.field1332[var15 - 1][var16 - 1] = var21;
                        break;
                    }
                    if ((var20[var15 - 1][var16 + var26 - 1] & 0x12C013E) != 0 || (var20[var26 + var15 - 1][var16 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var26++;
                }
            }
            if (var15 < 102 && var16 > 0 && class199.field3628[var15 + 1][var16 - 1] == 0 && (var20[var15 + 1][var16 - 1] & 0x12C010E) == 0 && (var20[arg12 + var15][var16 - 1] & 0x12C0183) == 0 && (var20[arg12 + var15][var16 + arg12 - 1 - 1] & 0x12C01E0) == 0) {
                int var27 = 1;
                while (true) {
                    if (var27 >= arg12 - 1) {
                        class52.field954[var41] = var15 + 1;
                        class292.field5058[var41] = var16 - 1;
                        class199.field3628[var15 + 1][var16 - 1] = 9;
                        class73.field1332[var15 + 1][var16 - 1] = var21;
                        var41 = var41 + 1 & 0xFFF;
                        break;
                    }
                    if ((var20[arg12 + var15][var16 + var27 - 1] & 0x12C01E3) != 0 || (var20[var15 + var27 + 1][var16 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var27++;
                }
            }
            if (var15 > 0 && var16 < 102 && class199.field3628[var15 - 1][var16 + 1] == 0 && (var20[var15 - 1][var16 + 1] & 0x12C010E) == 0 && (var20[var15 - 1][arg12 + var16] & 0x12C0138) == 0 && (var20[var15][arg12 + var16] & 0x12C01E0) == 0) {
                int var28 = 1;
                while (true) {
                    if (var28 >= (arg12 - 1)) {
                        class52.field954[var41] = var15 - 1;
                        class292.field5058[var41] = var16 + 1;
                        class199.field3628[var15 - 1][var16 + 1] = 6;
                        var41 = var41 + 1 & 0xFFF;
                        class73.field1332[var15 - 1][var16 + 1] = var21;
                        break;
                    }
                    if ((var20[var15 - 1][var28 + var16 + 1] & 0x12C013E) != 0 || (var20[var15 + var28 - 1][arg12 + var16] & 0x12C01F8) != 0) {
                        break;
                    }
                    var28++;
                }
            }
            if (var15 < 102 && var16 < 102 && class199.field3628[var15 + 1][var16 + 1] == 0 && (var20[var15 + 1][arg12 + var16] & 0x12C0138) == 0 && (var20[arg12 + var15][var16 + arg12] & 0x12C01E0) == 0 && (var20[arg12 + var15][var16 + 1] & 0x12C0183) == 0) {
                for (int var29 = 1; var29 < arg12 - 1; var29++) {
                    if ((var20[var29 + var15 + 1][var16 + arg12] & 0x12C01F8) != 0 || (var20[arg12 + var15][var16 + var29 + 1] & 0x12C01E3) != 0) {
                        continue label396;
                    }
                }
                class52.field954[var41] = var15 + 1;
                class292.field5058[var41] = var16 + 1;
                class199.field3628[var15 + 1][var16 + 1] = 12;
                class73.field1332[var15 + 1][var16 + 1] = var21;
                var41 = var41 + 1 & 0xFFF;
            }
        }
        class91.field1669 = 0;
        if (!var18) {
            if (!arg0) {
                return false;
            }
            int var30 = 1000;
            int var31 = 100;
            byte var32 = 10;
            for (int var33 = arg11 - var32; var33 <= (arg11 + var32); var33++) {
                for (int var34 = arg10 - var32; var34 <= arg10 + var32; var34++) {
                    if (var33 >= 0 && var34 >= 0 && var33 < 104 && var34 < 104 && class73.field1332[var33][var34] < 100) {
                        int var35 = 0;
                        if (var33 < arg11) {
                            var35 = arg11 - var33;
                        } else if (var33 > (arg4 + arg11 - 1)) {
                            var35 = var33 + 1 - arg4 - arg11;
                        }
                        int var36 = 0;
                        if (arg10 > var34) {
                            var36 = arg10 - var34;
                        } else if (arg10 + arg1 - 1 < var34) {
                            var36 = 1 - (arg1 + arg10 - var34);
                        }
                        int var37 = var35 * var35 + (var36 * var36);
                        if (var30 > var37 || var30 == var37 && var31 > class73.field1332[var33][var34]) {
                            var30 = var37;
                            var15 = var33;
                            var31 = class73.field1332[var33][var34];
                            var16 = var34;
                        }
                    }
                }
            }
            if (var30 == 1000) {
                return false;
            }
            if (arg5 == var15 && arg3 == var16) {
                return false;
            }
            class91.field1669 = 1;
        }
        byte var38 = 0;
        class52.field954[var38] = var15;
        int var42 = var38 + 1;
        class292.field5058[var38] = var16;
        int var39;
        int var40 = var39 = class199.field3628[var15][var16];
        while (arg5 != var15 || arg3 != var16) {
            if (var39 != var40) {
                class52.field954[var42] = var15;
                var39 = var40;
                class292.field5058[var42++] = var16;
            }
            if ((var40 & 0x2) != 0) {
                var15++;
            } else if ((var40 & 0x8) != 0) {
                var15--;
            }
            if ((var40 & 0x1) != 0) {
                var16++;
            } else if ((var40 & 0x4) != 0) {
                var16--;
            }
            var40 = class199.field3628[var15][var16];
        }
        if (var42 > 0) {
            class157.method1163(arg6, var42, 25);
            return true;
        } else if (arg6 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(Z)[B", line = 584)
    public final byte[] method117(boolean arg0) {
        field991++;
        if (!arg0) {
            return (byte[]) null;
        } else if (this.field5342) {
            throw new RuntimeException();
        } else {
            return this.field988;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I[BIIII[Lsd;IIZI)V", line = 607)
    public static final void method430(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, class37[] arg6, int arg7, int arg8, boolean arg9, int arg10) {
        if (arg5 != 19661199) {
            method434(112, (class67) null);
        }
        field1002++;
        class41 var11 = new class41(arg1);
        int var12 = -1;
        while (true) {
            int var13 = var11.method306(false);
            if (var13 == 0) {
                return;
            }
            var12 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var11.method354((byte) -124);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 & 0x3F;
                int var17 = (var14 & 0xFCB) >> 6;
                int var18 = var14 >> 12;
                int var19 = var11.method357(false);
                int var20 = var19 >> 2;
                int var21 = var19 & 0x3;
                if (arg2 == var18 && arg7 <= var17 && arg7 + 8 > var17 && var16 >= arg0 && var16 < (arg0 + 8)) {
                    class273 var22 = class271.method1871(arg5 - 19661073, var12);
                    int var23 = class156.method1160(var17 & 0x7, var16 & 0x7, var22.field4711, var22.field4662, true, var21, arg10) + arg4;
                    int var24 = class143.method1046(var22.field4662, var21, var16 & 0x7, var22.field4711, arg10, var17 & 0x7, 2) + arg8;
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class37 var25 = null;
                        if (!arg9) {
                            int var26 = arg3;
                            if ((class308.field5296[1][var23][var24] & 0x2) == 2) {
                                var26 = arg3 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg6[var26];
                            }
                        }
                        class290.method2019(var24, arg10 + var21 & 0x3, !arg9, var20, var12, arg3, var25, (byte) -119, arg9, arg3, var23);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZIIILng;I)V", line = 693)
    public static final void method431(int arg0, boolean arg1, int arg2, int arg3, int arg4, class138 arg5, int arg6) {
        class180.field3190 = arg6;
        class93.field1682 = arg4;
        class308.field5297 = arg0;
        class99.field1771 = arg1;
        field986++;
        class121.field2129 = arg2;
        class83.field1518 = 1;
        class137.field2391 = arg5;
        if (arg3 != 1792) {
            field999 = (class41) null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIZIII)V", line = 720)
    public static final void method432(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field997++;
        class288.field4984 = arg4;
        class49.field894 = arg1;
        class48.field872 = arg5;
        class31.field502 = arg6;
        if (arg2 != -1) {
            method436(true);
        }
        class142.field2495 = arg0;
        if (arg3 && class31.field502 >= 100) {
            class50.field926 = class48.field872 * 128 + 64;
            class72.field1319 = class288.field4984 * 128 + 64;
            class10.field152 = class297.method2080(class50.field926, 107, class255.field4377, class72.field1319) - class142.field2495;
        }
        class192.field3510 = 2;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIIIII)V", line = 745)
    public static final void method433(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field989++;
        if (class298.method2087(arg6, 20330)) {
            client.method831(class50.field921[arg6], arg2, arg7, arg1, arg3, arg5, arg0, arg4);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILgg;)V", line = 761)
    public static final void method434(int arg0, class67 arg1) {
        field995++;
        if (arg1.field1205 == 0 || arg0 != 1) {
            return;
        }
        if (arg1.field1233 != -1 && arg1.field1233 < 32768) {
            class279 var2 = class187.field3281[arg1.field1233];
            if (var2 != null) {
                int var3 = arg1.field1197 - var2.field1197;
                int var4 = arg1.field1192 - var2.field1192;
                if (var4 != 0 || var3 != 0) {
                    arg1.field1213 = (int) (Math.atan2((double) var4, (double) var3) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1.field1233 >= 32768) {
            int var5 = arg1.field1233 - 32768;
            if (class104.field1852 == var5) {
                var5 = 2047;
            }
            class144 var6 = class300.field5172[var5];
            if (var6 != null) {
                int var7 = arg1.field1192 - var6.field1192;
                int var8 = arg1.field1197 - var6.field1197;
                if (var7 != 0 || var8 != 0) {
                    arg1.field1213 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg1.field1247 != 0 || arg1.field1222 != 0) && (arg1.field1239 == 0 || arg1.field1204 > 0)) {
            int var9 = arg1.field1192 - ((arg1.field1247 - class134.field2336 - class134.field2336) * 64);
            int var10 = arg1.field1197 - ((arg1.field1222 - class10.field147 - class10.field147) * 64);
            if (var9 != 0 || var10 != 0) {
                arg1.field1213 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
            }
            arg1.field1222 = 0;
            arg1.field1247 = 0;
        }
        int var11 = arg1.field1213 - arg1.field1191 & 0x7FF;
        if (var11 == 0) {
            arg1.field1223 = 0;
            return;
        }
        arg1.field1223++;
        if (var11 > 1024) {
            arg1.field1191 -= arg1.field1205;
            boolean var12 = true;
            if (var11 < arg1.field1205 || 2048 - arg1.field1205 < var11) {
                arg1.field1191 = arg1.field1213;
                var12 = false;
            }
            if (arg1.field1238 == arg1.field1236 && (arg1.field1223 > 25 || var12)) {
                if (arg1.field1194 == -1) {
                    arg1.field1236 = arg1.field1220;
                } else {
                    arg1.field1236 = arg1.field1194;
                }
            }
        } else {
            arg1.field1191 += arg1.field1205;
            boolean var13 = true;
            if (var11 < arg1.field1205 || var11 > 2048 - arg1.field1205) {
                arg1.field1191 = arg1.field1213;
                var13 = false;
            }
            if (arg1.field1238 == arg1.field1236 && (arg1.field1223 > 25 || var13)) {
                if (arg1.field1232 == -1) {
                    arg1.field1236 = arg1.field1220;
                } else {
                    arg1.field1236 = arg1.field1232;
                }
            }
        }
        arg1.field1191 &= 0x7FF;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIZ)V", line = 891)
    public static final void method435(int arg0, int arg1, int arg2, boolean arg3) {
        field992++;
        if (arg1 < 8000 || arg1 > 48000) {
            throw new IllegalArgumentException();
        }
        class209.field3780 = arg0;
        class175.field3109 = arg1;
        class305.field5277 = arg3;
        if (arg2 != -22929) {
            method434(69, (class67) null);
        }
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(Z)V", line = 918)
    public static final void method436(boolean arg0) {
        field1003++;
        if (!arg0) {
            field996 = (class256) null;
        }
        class98.field1744 = new class175();
    }
}
