import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class186 {

    @OriginalMember(owner = "client!ig", name = "m", descriptor = "Z")
    public static boolean field3168 = true;

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "I")
    public static int field3161 = -1;

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "I")
    public static int field3159 = 0;

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "Lub;")
    public static class227 field3162 = class257.method1749("Lade Texturen )2 ", 17263);

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "[I")
    public static int[] field3164 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "Lub;")
    private static class227 field3156 = class257.method1749("Select a world", 17263);

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "Lub;")
    public static class227 field3167 = field3156;

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "Lub;")
    public static class227 field3157 = class257.method1749("(U2", 17263);

    @OriginalMember(owner = "client!ig", name = "v", descriptor = "I")
    public static int field3177 = 0;

    @OriginalMember(owner = "client!ig", name = "t", descriptor = "Lub;")
    public static class227 field3175 = class257.method1749("::fps ", 17263);

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "I")
    public static int field3166;

    @OriginalMember(owner = "client!ig", name = "n", descriptor = "I")
    public static int field3169;

    @OriginalMember(owner = "client!ig", name = "o", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!ig", name = "s", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!ig", name = "u", descriptor = "I")
    public static int field3176;

    @OriginalMember(owner = "client!ig", name = "p", descriptor = "[I")
    public static int[] field3171;

    @OriginalMember(owner = "client!ig", name = "q", descriptor = "[I")
    public static int[] field3172;

    @OriginalMember(owner = "client!ig", name = "r", descriptor = "[Lgb;")
    public static class46[] field3173;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V")
    public static void method1180(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field3175 = null;
        field3167 = null;
        field3173 = null;
        field3171 = null;
        field3157 = null;
        field3164 = null;
        field3172 = null;
        field3156 = null;
        field3162 = null;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILta;)Z")
    public static final boolean method1181(int arg0, class105 arg1) {
        field3160++;
        if (arg1.field1975 == arg0) {
            class100.field1753 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IBLta;II)V")
    public static final void method1182(int arg0, byte arg1, class105 arg2, int arg3, int arg4) {
        int var5 = -58 % ((arg1 + 38) / 59);
        class114.method725((byte) -92);
        field3174++;
        class111.method704(arg4, arg3, arg2.field1977 + arg4, arg2.field1952 + arg3);
        if (class11.field219 == 2 || class11.field219 == 5 || class167.field2798 == null) {
            class111.method698(arg4, arg3, 0, arg2.field1859, arg2.field1843);
        } else {
            int var6 = (class216.field3639.field50 / 32) + 48;
            int var7 = class29.field476 + class254.field4462 & 0x7FF;
            int var8 = 464 - class216.field3639.field99 / 32;
            ((class163) class167.field2798).method783(arg4, arg3, arg2.field1977, arg2.field1952, var6, var8, var7, class91.field1559 + 256, arg2.field1859, arg2.field1843);
            for (int var9 = 0; var9 < class40.field663; var9++) {
                int var42 = class140.field2422[var9] * 4 + 2 - (class216.field3639.field99 / 32);
                int var43 = class12.field229[var9] * 4 + 2 - (class216.field3639.field50 / 32);
                class45 var44 = class220.method1389(class19.field330[var9], (byte) -111);
                if (var44.field754 != null) {
                    var44 = var44.method242(64);
                    if (var44 == null || var44.field746 == -1) {
                        continue;
                    }
                }
                class60.method364(arg4, 97, var43, var42, arg3, class49.field872[var44.field746], arg2);
            }
            for (int var10 = 0; var10 < 104; var10++) {
                for (int var38 = 0; var38 < 104; var38++) {
                    class198 var39 = class80.field1389[class64.field1171][var10][var38];
                    if (var39 != null) {
                        int var40 = var38 * 4 + 2 - (class216.field3639.field99 / 32);
                        int var41 = var10 * 4 + 2 - class216.field3639.field50 / 32;
                        class60.method364(arg4, 113, var41, var40, arg3, class118.field2158[0], arg2);
                    }
                }
            }
            for (int var11 = 0; var11 < class71.field1254; var11++) {
                class195 var34 = class220.field3715[class146.field2517[var11]];
                if (var34 != null && var34.method14((byte) -35)) {
                    class147 var35 = var34.field3315;
                    if (var35 != null && var35.field2563 != null) {
                        var35 = var35.method933(29882);
                    }
                    if (var35 != null && var35.field2579 && var35.field2562) {
                        int var36 = var34.field50 / 32 - (class216.field3639.field50 / 32);
                        int var37 = var34.field99 / 32 - (class216.field3639.field99 / 32);
                        class60.method364(arg4, 104, var36, var37, arg3, class118.field2158[1], arg2);
                    }
                }
            }
            for (int var12 = 0; var12 < class146.field2512; var12++) {
                class225 var26 = class27.field446[class15.field278[var12]];
                if (var26 != null && var26.method14((byte) -35)) {
                    int var27 = var26.field50 / 32 - (class216.field3639.field50 / 32);
                    int var28 = var26.field99 / 32 - class216.field3639.field99 / 32;
                    boolean var29 = false;
                    long var30 = var26.field3819.method1485(122);
                    for (int var32 = 0; var32 < class166.field2781; var32++) {
                        if (class28.field460[var32] == var30 && class151.field2637[var32] != 0) {
                            var29 = true;
                            break;
                        }
                    }
                    boolean var33 = false;
                    if (class216.field3639.field3832 != 0 && var26.field3832 != 0 && class216.field3639.field3832 == var26.field3832) {
                        var33 = true;
                    }
                    if (var29) {
                        class60.method364(arg4, 111, var27, var28, arg3, class118.field2158[3], arg2);
                    } else if (var33) {
                        class60.method364(arg4, 127, var27, var28, arg3, class118.field2158[4], arg2);
                    } else {
                        class60.method364(arg4, 113, var27, var28, arg3, class118.field2158[2], arg2);
                    }
                }
            }
            class190[] var13 = class229.field3994;
            for (int var14 = 0; var14 < var13.length; var14++) {
                class190 var17 = var13[var14];
                if (var17 != null && var17.field3226 != 0 && (class253.field4393 % 20) < 10) {
                    if (var17.field3226 == 1 && var17.field3221 >= 0 && var17.field3221 < class220.field3715.length) {
                        class195 var18 = class220.field3715[var17.field3221];
                        if (var18 != null) {
                            int var19 = var18.field50 / 32 - (class216.field3639.field50 / 32);
                            int var20 = var18.field99 / 32 - class216.field3639.field99 / 32;
                            class104.method636(var19, arg4, var20, arg3, var17.field3220, arg2, (byte) -111);
                        }
                    }
                    if (var17.field3226 == 2) {
                        int var21 = (var17.field3219 - class78.field1367) * 4 - (class216.field3639.field99 / 32 - 2);
                        int var22 = (var17.field3225 - class192.field3267) * 4 + 2 - class216.field3639.field50 / 32;
                        class104.method636(var22, arg4, var21, arg3, var17.field3220, arg2, (byte) -125);
                    }
                    if (var17.field3226 == 10 && var17.field3221 >= 0 && class27.field446.length > var17.field3221) {
                        class225 var23 = class27.field446[var17.field3221];
                        if (var23 != null) {
                            int var24 = var23.field99 / 32 - class216.field3639.field99 / 32;
                            int var25 = var23.field50 / 32 - (class216.field3639.field50 / 32);
                            class104.method636(var25, arg4, var24, arg3, var17.field3220, arg2, (byte) -94);
                        }
                    }
                }
            }
            if (class67.field1213 != 0) {
                int var15 = class67.field1213 * 4 + 2 - (class216.field3639.field50 / 32);
                int var16 = class117.field2145 * 4 - ((class216.field3639.field99 / 32) - 2);
                class60.method364(arg4, 124, var15, var16, arg3, class258.field4508, arg2);
            }
            class111.method694(arg2.field1977 / 2 + (arg4 - 1), arg3 - -(arg2.field1952 / 2) + -1, 3, 3, 16777215);
        }
        class79.field1379[arg0] = true;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(II)I")
    public static final int method1183(int arg0, int arg1) {
        if (arg0 == 3) {
            field3166++;
            return arg1 & 0xFF;
        } else {
            return -35;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lnj;I)V")
    public static final void method1184(class226 arg0, int arg1) {
        field3163++;
        if (arg1 != 32767) {
            method1185(93);
        }
        byte[] var2 = new byte[24];
        if (class16.field295 != null) {
            try {
                int var3 = 0;
                class16.field295.method161(0L, false);
                class16.field295.method166(var2, (byte) 114);
                while (var3 < 24 && var2[var3] == 0) {
                    var3++;
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg0.method1460(24, 0, true, var2);
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)V")
    public static final void method1185(int arg0) {
        field3170++;
        if (class134.field2318 == 146) {
            int var1 = class32.field512.method1447(0);
            int var2 = class32.field512.method1471(arg0 ^ 0x8C);
            int var3 = class229.field3997 + ((var2 & 0x7D) >> 4);
            int var4 = (var2 & 0x7) + class141.field2435;
            int var5 = class32.field512.method1482(arg0 - 243);
            if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
                class203 var6 = new class203();
                var6.field3472 = var5;
                var6.field3470 = var1;
                if (class80.field1389[class64.field1171][var3][var4] == null) {
                    class80.field1389[class64.field1171][var3][var4] = new class198();
                }
                class80.field1389[class64.field1171][var3][var4].method1272(5664, new class67(var6));
                class241.method1609(var3, var4, 64);
            }
            return;
        }
        if (class134.field2318 == 11) {
            int var7 = class32.field512.method1472(arg0 ^ 0x73);
            int var8 = class32.field512.method1447(0);
            int var9 = class32.field512.method1447(0);
            byte var10 = class32.field512.method1438(false);
            byte var11 = class32.field512.method1438(false);
            int var12 = class32.field512.method1471(255);
            int var13 = class141.field2435 + (var12 & 0x7);
            int var14 = class229.field3997 + (var12 >> 4 & 0x7);
            int var15 = class32.field512.method1447(0);
            byte var16 = class32.field512.method1459(0);
            int var17 = class32.field512.method1456(-9944);
            int var18 = var17 >> 2;
            int var19 = var17 & 0x3;
            int var20 = class63.field1149[var18];
            byte var21 = class32.field512.method1428(false);
            class225 var22;
            if (class254.field4473 == var15) {
                var22 = class216.field3639;
            } else {
                var22 = class27.field446[var15];
            }
            if (var22 != null) {
                class45 var23 = class220.method1389(var8, (byte) -105);
                int var24;
                int var25;
                if (var19 == 1 || var19 == 3) {
                    var25 = var23.field810;
                    var24 = var23.field790;
                } else {
                    var24 = var23.field810;
                    var25 = var23.field790;
                }
                int var26 = (var25 >> 1) + var13;
                int var27 = (var24 >> 1) + var14;
                int var28 = (var24 + 1 >> 1) + var14;
                int var29 = (var25 + 1 >> 1) + var13;
                int[][] var30 = class98.field1717[class64.field1171];
                int[][] var31 = null;
                if (class64.field1171 < 3) {
                    var31 = class98.field1717[class64.field1171 + 1];
                }
                int var32 = (var14 << 7) + (var24 << 6);
                int var33 = var30[var28][var26] + var30[var27][var29] + var30[var27][var26] + var30[var28][var29] >> 2;
                int var34 = (var13 << 7) + (var25 << 6);
                class85 var35 = var23.method254(var32, -90, var19, var23.field748, var31, (class209) null, var30, var33, var18, var34, false);
                if (var35 != null) {
                    if (var21 < var10) {
                        byte var36 = var10;
                        var10 = var21;
                        var21 = var36;
                    }
                    class96.method594(0, var7 + 1, var9 - -1, var20, -1, 0, (byte) -109, var13, class64.field1171, var14);
                    var22.field3797 = var13 * 128 + (var25 * 64);
                    var22.field3830 = var14 + var21;
                    var22.field3823 = var10 + var14;
                    var22.field3810 = class253.field4393 + var9;
                    var22.field3801 = var7 + class253.field4393;
                    var22.field3835 = var14 * 128 + var24 * 64;
                    var22.field3827 = var33;
                    var22.field3806 = (class48) var35.field1474;
                    if (var11 > var16) {
                        byte var37 = var11;
                        var11 = var16;
                        var16 = var37;
                    }
                    var22.field3805 = var13 + var16;
                    var22.field3826 = var11 + var13;
                }
            }
        }
        if (class134.field2318 == 207) {
            int var38 = class32.field512.method1481(false);
            int var39 = class32.field512.method1426(false);
            int var40 = (var39 & 0x7) + class141.field2435;
            int var41 = (var39 >> 4 & 0x7) + class229.field3997;
            if (var41 >= 0 && var40 >= 0 && var41 < 104 && var40 < 104) {
                class198 var42 = class80.field1389[class64.field1171][var41][var40];
                if (var42 != null) {
                    for (class67 var43 = (class67) var42.method1277(114); var43 != null; var43 = (class67) var42.method1271(250)) {
                        if ((var38 & 0x7FFF) == var43.field1205.field3472) {
                            var43.method369(-23);
                            break;
                        }
                    }
                    if (var42.method1277(arg0 + 3) == null) {
                        class80.field1389[class64.field1171][var41][var40] = null;
                    }
                    class241.method1609(var41, var40, 64);
                }
            }
        } else if (class134.field2318 == 112) {
            int var44 = class32.field512.method1456(-9944);
            int var45 = var44 >> 2;
            int var46 = class63.field1149[var45];
            int var47 = var44 & 0x3;
            int var48 = class32.field512.method1456(-9944);
            int var49 = (var48 & 0x7) + class141.field2435;
            int var50 = ((var48 & 0x73) >> 4) + class229.field3997;
            if (var50 >= 0 && var49 >= 0 && var50 < 104 && var49 < 104) {
                class96.method594(var45, -1, 0, var46, -1, var47, (byte) -109, var49, class64.field1171, var50);
            }
        } else if (class134.field2318 == 7) {
            int var51 = class32.field512.method1471(255);
            int var52 = (var51 >> 4 & 0xF) + class229.field3997 * 2;
            int var53 = (var51 & 0xF) + class141.field2435 * 2;
            int var54 = var52 + class32.field512.method1428(false);
            int var55 = class32.field512.method1428(false) + var53;
            int var56 = class32.field512.method1433(arg0 ^ 0x8);
            int var57 = class32.field512.method1447(0);
            int var58 = class32.field512.method1471(255) * 4;
            int var59 = class32.field512.method1471(255) * 4;
            int var60 = class32.field512.method1447(0);
            int var61 = class32.field512.method1447(0);
            int var62 = class32.field512.method1471(255);
            int var63 = class32.field512.method1471(255);
            if (var52 >= 0 && var53 >= 0 && var52 < 208 && var53 < 208 && var54 >= 0 && var55 >= 0 && var54 < 208 && var55 < 208 && var57 != 65535) {
                int var64 = var55 * 64;
                int var65 = var53 * 64;
                int var66 = var52 * 64;
                int var67 = var54 * 64;
                class220 var68 = new class220(var57, class64.field1171, var66, var65, class193.method1227(var66, true, class64.field1171, var65) - var58, var60 - -class253.field4393, class253.field4393 + var61, var62, var63, var56, var59);
                var68.method1391(var64, var60 + class253.field4393, class193.method1227(var67, true, class64.field1171, var64) - var59, -1, var67);
                class41.field673.method1272(5664, new class166(var68));
            }
        } else if (class134.field2318 == 188) {
            int var69 = class32.field512.method1447(0);
            int var70 = class32.field512.method1481(false);
            int var71 = class32.field512.method1482(arg0 - 243);
            int var72 = class32.field512.method1426(false);
            int var73 = class141.field2435 + (var72 & 0x7);
            int var74 = ((var72 & 0x75) >> 4) + class229.field3997;
            if (var74 >= 0 && var73 >= 0 && var74 < 104 && var73 < 104 && class254.field4473 != var69) {
                class203 var75 = new class203();
                var75.field3472 = var70;
                var75.field3470 = var71;
                if (class80.field1389[class64.field1171][var74][var73] == null) {
                    class80.field1389[class64.field1171][var74][var73] = new class198();
                }
                class80.field1389[class64.field1171][var74][var73].method1272(5664, new class67(var75));
                class241.method1609(var74, var73, arg0 - 51);
            }
        } else if (class134.field2318 == 123) {
            int var76 = class32.field512.method1471(arg0 ^ 0x8C);
            int var77 = class141.field2435 + (var76 & 0x7);
            int var78 = (var76 >> 4 & 0x7) + class229.field3997;
            int var79 = class32.field512.method1447(0);
            int var80 = class32.field512.method1447(0);
            int var81 = class32.field512.method1447(0);
            if (var78 >= 0 && var77 >= 0 && var78 < 104 && var77 < 104) {
                class198 var82 = class80.field1389[class64.field1171][var78][var77];
                if (var82 != null) {
                    for (class67 var83 = (class67) var82.method1277(arg0 ^ 0x3E); var83 != null; var83 = (class67) var82.method1271(250)) {
                        class203 var84 = var83.field1205;
                        if ((var79 & 0x7FFF) == var84.field3472 && var84.field3470 == var80) {
                            var84.field3470 = var81;
                            break;
                        }
                    }
                    class241.method1609(var78, var77, 64);
                }
            }
        } else {
            if (arg0 != 115) {
                field3164 = null;
            }
            if (class134.field2318 == 65) {
                int var85 = class32.field512.method1426(false);
                int var86 = var85 & 0x3;
                int var87 = var85 >> 2;
                int var88 = class63.field1149[var87];
                int var89 = class32.field512.method1471(arg0 ^ 0x8C);
                int var90 = class229.field3997 + (var89 >> 4 & 0x7);
                int var91 = (var89 & 0x7) + class141.field2435;
                int var92 = class32.field512.method1482(-128);
                if (var90 >= 0 && var91 >= 0 && var90 < 104 && var91 < 104) {
                    class96.method594(var87, -1, 0, var88, var92, var86, (byte) -109, var91, class64.field1171, var90);
                }
            } else if (class134.field2318 == 85) {
                int var93 = class32.field512.method1471(255);
                int var94 = ((var93 & 0x79) >> 4) + class229.field3997;
                int var95 = (var93 & 0x7) + class141.field2435;
                int var96 = class32.field512.method1447(0);
                int var97 = class32.field512.method1471(255);
                int var98 = (var97 & 0xF1) >> 4;
                int var99 = var97 & 0x7;
                if (var96 == 65535) {
                    var96 = -1;
                }
                int var100 = class32.field512.method1471(255);
                if (var94 >= 0 && var95 >= 0 && var94 < 104 && var95 < 104) {
                    int var101 = var98 + 1;
                    if (class216.field3639.field78[0] >= (var94 - var101) && class216.field3639.field78[0] <= (var94 + var101) && class216.field3639.field49[0] >= var95 - var101 && class216.field3639.field49[0] <= (var95 + var101) && class248.field4311 != 0 && var99 > 0 && class144.field2478 < 50 && var96 != -1) {
                        class130.field2281[class144.field2478] = var96;
                        class221.field3747[class144.field2478] = var99;
                        class236.field4101[class144.field2478] = var100;
                        class22.field384[class144.field2478] = null;
                        class34.field585[class144.field2478] = (var94 << 16) + (var95 << 8) + var98;
                        class144.field2478++;
                    }
                }
            } else if (class134.field2318 == 215) {
                int var102 = class32.field512.method1471(255);
                int var103 = ((var102 & 0x76) >> 4) + class229.field3997;
                int var104 = (var102 & 0x7) + class141.field2435;
                int var105 = class32.field512.method1447(0);
                int var106 = class32.field512.method1471(arg0 + 140);
                int var107 = class32.field512.method1447(0);
                if (var103 >= 0 && var104 >= 0 && var103 < 104 && var104 < 104) {
                    int var108 = var103 * 128 + 64;
                    int var109 = var104 * 128 + 64;
                    class18 var110 = new class18(var105, class64.field1171, var108, var109, class193.method1227(var108, true, class64.field1171, var109) - var106, var107, class253.field4393);
                    class235.field4074.method1272(arg0 ^ 0x1653, new class75(var110));
                }
            } else if (class134.field2318 == 25) {
                int var111 = class32.field512.method1439(-116);
                int var112 = ((var111 & 0x73) >> 4) + class229.field3997;
                int var113 = class141.field2435 + (var111 & 0x7);
                int var114 = class32.field512.method1426(false);
                int var115 = var114 & 0x3;
                int var116 = var114 >> 2;
                int var117 = class63.field1149[var116];
                int var118 = class32.field512.method1447(0);
                if (var118 == 65535) {
                    var118 = -1;
                }
                class12.method56(var115, var112, var117, var113, class64.field1171, -4, var118, var116);
            } else if (class134.field2318 == 247) {
                int var119 = class32.field512.method1471(255);
                int var120 = class229.field3997 + ((var119 & 0x79) >> 4);
                int var121 = (var119 & 0x7) + class141.field2435;
                int var122 = var120 + class32.field512.method1428(false);
                int var123 = var121 + class32.field512.method1428(false);
                int var124 = class32.field512.method1433(127);
                int var125 = class32.field512.method1447(0);
                int var126 = class32.field512.method1471(255) * 4;
                int var127 = class32.field512.method1471(255) * 4;
                int var128 = class32.field512.method1447(0);
                int var129 = class32.field512.method1447(0);
                int var130 = class32.field512.method1471(255);
                int var131 = class32.field512.method1471(255);
                if (var120 >= 0 && var121 >= 0 && var120 < 104 && var121 < 104 && var122 >= 0 && var123 >= 0 && var122 < 104 && var123 < 104 && var125 != 65535) {
                    int var132 = var121 * 128 + 64;
                    int var133 = var122 * 128 + 64;
                    int var134 = var123 * 128 + 64;
                    int var135 = var120 * 128 + 64;
                    class220 var136 = new class220(var125, class64.field1171, var135, var132, class193.method1227(var135, true, class64.field1171, var132) - var126, class253.field4393 + var128, class253.field4393 + var129, var130, var131, var124, var127);
                    var136.method1391(var134, class253.field4393 + var128, class193.method1227(var133, true, class64.field1171, var134) + -var127, arg0 - 116, var133);
                    class41.field673.method1272(5664, new class166(var136));
                }
            }
        }
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(I)V")
    public static final void method1186(int arg0) {
        field3169++;
        if (arg0 != 32) {
            method1184((class226) null, -22);
        }
        if (class128.field2259 == 5) {
            class128.field2259 = 6;
        }
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(II)Z")
    public static final boolean method1187(int arg0, int arg1) {
        field3176++;
        if (arg0 < 0) {
            return false;
        }
        if (arg1 != 27651) {
            field3175 = null;
        }
        int var2 = class19.field327[arg0];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        return var2 == 1004;
    }
}
