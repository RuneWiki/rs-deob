import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nea")
public class class538 {

    @OriginalMember(owner = "client!nea", name = "p", descriptor = "[I")
    public static int[] field7906 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!nea", name = "t", descriptor = "[I")
    public static int[] field7910 = new int[16];

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "I")
    public int field7891;

    @OriginalMember(owner = "client!nea", name = "b", descriptor = "I")
    public static int field7892;

    @OriginalMember(owner = "client!nea", name = "d", descriptor = "I")
    public static int field7894;

    @OriginalMember(owner = "client!nea", name = "e", descriptor = "I")
    public static int field7895;

    @OriginalMember(owner = "client!nea", name = "f", descriptor = "I")
    public static int field7896;

    @OriginalMember(owner = "client!nea", name = "g", descriptor = "I")
    public static int field7897;

    @OriginalMember(owner = "client!nea", name = "h", descriptor = "I")
    public static int field7898;

    @OriginalMember(owner = "client!nea", name = "i", descriptor = "I")
    public static int field7899;

    @OriginalMember(owner = "client!nea", name = "j", descriptor = "I")
    public static int field7900;

    @OriginalMember(owner = "client!nea", name = "k", descriptor = "I")
    public static int field7901;

    @OriginalMember(owner = "client!nea", name = "m", descriptor = "I")
    public static int field7903;

    @OriginalMember(owner = "client!nea", name = "n", descriptor = "I")
    public static int field7904;

    @OriginalMember(owner = "client!nea", name = "o", descriptor = "I")
    public static int field7905;

    @OriginalMember(owner = "client!nea", name = "q", descriptor = "I")
    public static int field7907;

    @OriginalMember(owner = "client!nea", name = "r", descriptor = "I")
    public int field7908;

    @OriginalMember(owner = "client!nea", name = "s", descriptor = "I")
    public static int field7909;

    @OriginalMember(owner = "client!nea", name = "u", descriptor = "I")
    public static int field7911;

    @OriginalMember(owner = "client!nea", name = "v", descriptor = "I")
    public static int field7912;

    @OriginalMember(owner = "client!nea", name = "w", descriptor = "I")
    public static int field7913;

    @OriginalMember(owner = "client!nea", name = "x", descriptor = "I")
    public int field7914;

    @OriginalMember(owner = "client!nea", name = "y", descriptor = "I")
    public static int field7915;

    @OriginalMember(owner = "client!nea", name = "z", descriptor = "I")
    public static int field7916;

    @OriginalMember(owner = "client!nea", name = "A", descriptor = "I")
    public static int field7917;

    @OriginalMember(owner = "client!nea", name = "B", descriptor = "I")
    public int field7918;

    @OriginalMember(owner = "client!nea", name = "l", descriptor = "J")
    public static long field7902;

    @OriginalMember(owner = "client!nea", name = "c", descriptor = "[[I")
    public int[][] field7893;

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(I)V")
    public static void method3151(int arg0) {
        field7910 = null;
        field7906 = null;
        if (arg0 > -32) {
            method3169(-70);
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(IIZZIIBI)V")
    public final void method3152(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, byte arg6, int arg7) {
        field7894++;
        int var9 = 256;
        int var10 = -63 % ((arg6 - 57) / 57);
        if (arg3) {
            var9 |= 0x20000;
        }
        int var11 = arg7 - this.field7891;
        int var12 = arg1 - this.field7908;
        if (arg5 == 1 || arg5 == 3) {
            int var13 = arg4;
            arg4 = arg0;
            arg0 = var13;
        }
        if (arg2) {
            var9 |= 0x40000000;
        }
        for (int var14 = var11; var14 < arg4 + var11; var14++) {
            if (var14 >= 0 && var14 < this.field7918) {
                for (int var15 = var12; var15 < (arg0 + var12); var15++) {
                    if (var15 >= 0 && var15 < this.field7914) {
                        this.method3164(1, var15, var9, var14);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(IIIIIII)V")
    public static final void method3153(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field7917++;
        int var7 = class643.field9134;
        if (arg5 != -16777216) {
            field7892 = -50;
        }
        int[] var8 = class98.field1458;
        class620.field8839 = 0;
        for (int var9 = 0; var9 < (class310.field4304 + var7); var9++) {
            class528 var32 = null;
            class141 var33;
            if (var7 <= var9) {
                var33 = ((class6) class314.field4359.method2818(arg5 + 16754413, (long) class253.field3667[-var7 + var9])).field49;
                var32 = ((class88) var33).field1309;
                if (var32.field7758 != null) {
                    var32 = var32.method3110(class230.field3404, false);
                    if (var32 == null) {
                        continue;
                    }
                }
            } else {
                var33 = class76.field1186[var8[var9]];
            }
            if (var33.field2386 >= 0 && (client.field1377 == var33.field2364 || class103.field1708.field3158 == var33.field3158)) {
                class30.method279(arg0, arg1 >> 1, var33.method655(false), arg3 >> 1, arg4, var33, false);
                if (class166.field2737[0] >= 0) {
                    if (var33.field2350 != null && (var9 >= var7 || class334.field4666 == 0 || class334.field4666 == 3 || class334.field4666 == 1 && class70.method576(((class270) var33).field3848, -1963318678)) && class620.field8839 < class638.field9059) {
                        class638.field9063[class620.field8839] = class246.field3584.method2870(true, var33.field2350) / 2;
                        class638.field9058[class620.field8839] = class166.field2737[0];
                        class638.field9057[class620.field8839] = class166.field2737[1];
                        class638.field9062[class620.field8839] = var33.field2419;
                        class638.field9060[class620.field8839] = var33.field2366;
                        class638.field9061[class620.field8839] = var33.field2409;
                        class638.field9064[class620.field8839] = var33.field2350;
                        class620.field8839++;
                    }
                    int var34 = class166.field2737[1] + arg2;
                    int var45;
                    if (var33.field2389 || class148.field2508 >= var33.field2435) {
                        var45 = var34 - Math.max(class246.field3584.field7038, class688.field9762[0].method17());
                    } else {
                        boolean var35 = true;
                        byte var36 = 1;
                        int var38;
                        if (var9 < var7) {
                            class270 var37 = class76.field1186[var8[var9]];
                            var38 = var33.method1093(true).field9599;
                            if (var37.field3886) {
                                var36 = 2;
                            }
                        } else {
                            var38 = var32.field7742;
                            if (var38 == -1) {
                                var38 = var33.method1093(true).field9599;
                            }
                        }
                        class257[] var39 = class688.field9762;
                        if (var38 != -1) {
                            class257[] var40 = (class257[]) class43.field583.method941((long) var38, arg5 + 16777216);
                            if (var40 == null) {
                                class628[] var41 = class628.method3544(class468.field6754, var38, 0);
                                if (var41 != null) {
                                    var40 = new class257[var41.length];
                                    for (int var42 = 0; var42 < var41.length; var42++) {
                                        var40[var42] = class637.field9048.method772(var41[var42], true);
                                    }
                                    class43.field583.method949((long) var38, true, var40);
                                }
                            }
                            if (var40 != null && var40.length >= 2) {
                                var39 = var40;
                            }
                        }
                        if (var39.length <= var36) {
                            var36 = 1;
                        }
                        class257 var43 = var39[0];
                        class257 var44 = var39[var36];
                        var45 = var34 - Math.max(class246.field3584.field7038, var43.method17());
                        int var46 = class166.field2737[0] + arg6 - (var43.method12() >> 1);
                        int var47 = var43.method12() * var33.field2449 / 255;
                        if (var33.field2449 > 0 && var47 < 2) {
                            var47 = 2;
                        }
                        var43.method1638(var46, var45);
                        class637.field9048.method818(var46, var45, var46 + var47, var43.method17() + var45);
                        var44.method1638(var46, var45);
                        class637.field9048.method771(arg6, arg2, arg1 + arg6, arg2 + arg3);
                    }
                    var45 -= 2;
                    if (!var33.field2389) {
                        if (var33.field2396 > class148.field2508) {
                            class257 var48 = class60.field882[var33.field2411 ? 2 : 0];
                            class257 var49 = class60.field882[var33.field2411 ? 3 : 1];
                            boolean var50 = true;
                            int var51;
                            if ((var33 instanceof class88)) {
                                var51 = var32.field7788;
                                if (var51 == -1) {
                                    var51 = var33.method1093(true).field9564;
                                }
                            } else {
                                var51 = var33.method1093(true).field9564;
                            }
                            if (var51 != -1) {
                                class257[] var52 = (class257[]) class696.field9884.method941((long) var51, 0);
                                if (var52 == null) {
                                    class628[] var53 = class628.method3544(class468.field6754, var51, 0);
                                    if (var53 != null) {
                                        var52 = new class257[var53.length];
                                        for (int var54 = 0; var54 < var53.length; var54++) {
                                            var52[var54] = class637.field9048.method772(var53[var54], true);
                                        }
                                        class696.field9884.method949((long) var51, true, var52);
                                    }
                                }
                                if (var52 != null && var52.length == 4) {
                                    var49 = var52[var33.field2411 ? 3 : 1];
                                    var48 = var52[var33.field2411 ? 2 : 0];
                                }
                            }
                            int var55 = var33.field2396 - class148.field2508;
                            int var58;
                            if (var33.field2406 < var55) {
                                int var56 = var55 - var33.field2406;
                                int var57 = var33.field2370 == 0 ? 0 : (var33.field2387 - var56) / var33.field2370 * var33.field2370;
                                var58 = var48.method12() * var57 / var33.field2387;
                            } else {
                                var58 = var48.method12();
                            }
                            int var59 = var48.method17();
                            var45 -= var59;
                            int var60 = class166.field2737[0] + arg6 - (var48.method12() >> 1);
                            var48.method1638(var60, var45);
                            class637.field9048.method818(var60, var45, var58 + var60, var45 + var59);
                            var49.method1638(var60, var45);
                            class637.field9048.method771(arg6, arg2, arg1 + arg6, arg2 - -arg3);
                            var45 -= 2;
                        }
                        if (var9 < var7) {
                            class270 var62 = (class270) var33;
                            if (var62.field3866 != -1) {
                                var45 -= 25;
                                class243.field3567[var62.field3866].method1638(class166.field2737[0] + arg6 - 12, var45);
                                var45 -= 2;
                            }
                            if (var62.field3877 != -1) {
                                var45 -= 25;
                                class99.field1480[var62.field3877].method1638(arg6 + class166.field2737[0] - 12, var45);
                                var45 -= 2;
                            }
                        } else if (var32.field7789 >= 0 && class99.field1480.length > var32.field7789) {
                            class257 var61 = class99.field1480[var32.field7789];
                            var45 -= 25;
                            var61.method1638(class166.field2737[0] + arg6 - (var61.method12() >> 1), var45);
                            var45 -= 2;
                        }
                    }
                    int var10000;
                    if (!var33 instanceof class270) {
                        int var69 = 0;
                        class258[] var70 = class481.field6873;
                        for (int var71 = 0; var71 < var70.length; var71++) {
                            class258 var76 = var70[var71];
                            if (var76 != null && var76.field3709 == 1 && class253.field3667[var9 - var7] == var76.field3705) {
                                class257 var77 = class149.field2517[var76.field3701];
                                if (var69 < var77.method17()) {
                                    var69 = var77.method17();
                                }
                                if ((class148.field2508 % 20) < 10) {
                                    var77.method1638(class166.field2737[0] + arg6 - 12, var45 + -var77.method17());
                                }
                            }
                        }
                        if (var69 > 0) {
                            var10000 = var45 - (var69 + 2);
                        }
                    } else if (var9 >= 0) {
                        int var63 = 0;
                        class258[] var64 = class481.field6873;
                        for (int var65 = 0; var65 < var64.length; var65++) {
                            class258 var67 = var64[var65];
                            if (var67 != null && var67.field3709 == 10 && var8[var9] == var67.field3705) {
                                class257 var68 = class149.field2517[var67.field3701];
                                if (var68.method17() > var63) {
                                    var63 = var68.method17();
                                }
                                var68.method1638(class166.field2737[0] + arg6 - 12, var45 + -var68.method17());
                            }
                        }
                        if (var63 > 0) {
                            var10000 = var45 - (var63 + 2);
                        }
                    }
                    for (int var73 = 0; var73 < 4; var73++) {
                        if (var33.field2351[var73] > class148.field2508) {
                            int var74 = var33.method655(false) / 2;
                            class30.method279(arg0, arg1 >> 1, var74, arg3 >> 1, arg4, var33, false);
                            if (class166.field2737[0] > -1) {
                                int var75 = class346.field4895[var33.field2407[var73]].method12();
                                if (var73 == 1) {
                                    class166.field2737[1] -= 20;
                                }
                                if (var73 == 2) {
                                    class166.field2737[0] -= var75 - 9;
                                    class166.field2737[1] -= 10;
                                }
                                if (var73 == 3) {
                                    class166.field2737[0] += var75 - 9;
                                    class166.field2737[1] -= 10;
                                }
                                class346.field4895[var33.field2407[var73]].method1638(class166.field2737[0] + arg6 - (var75 >> 1), class166.field2737[1] + arg2 + -12);
                                class424.field6054.method2399(-1, class166.field2737[0] + arg6 - 1, arg2 + 3 - -class166.field2737[1], 0, Integer.toString(var33.field2403[var73]), (byte) 109);
                            }
                        }
                    }
                }
            }
        }
        for (int var10 = 0; var10 < class598.field8642; var10++) {
            int var28 = class264.field3795[var10];
            class141 var29;
            if (var28 < 2048) {
                var29 = class76.field1186[var28];
            } else {
                var29 = ((class6) class314.field4359.method2818(arg5 ^ 0xFFA6ED, (long) (var28 - 2048))).field49;
            }
            int var30 = class240.field3527[var10];
            class141 var31;
            if (var30 >= 2048) {
                var31 = ((class6) class314.field4359.method2818(arg5 + 16754413, (long) (var30 + -2048))).field49;
            } else {
                var31 = class76.field1186[var30];
            }
            class277.method1726(arg1, arg6, arg4, var29, 255, arg3, arg0, --var29.field2363, arg2, var31);
        }
        int var11 = class246.field3584.field7041 + class246.field3584.field7038 + 2;
        for (int var12 = 0; var12 < class620.field8839; var12++) {
            int var13 = class638.field9058[var12];
            int var14 = class638.field9057[var12];
            int var15 = class638.field9063[var12];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var27 = 0; var27 < var12; var27++) {
                    if (var14 + 2 > class638.field9057[var27] + -var11 && (var14 - var11) < (class638.field9057[var27] + 2) && (class638.field9063[var27] + class638.field9058[var27]) > (var13 - var15) && class638.field9058[var27] - class638.field9063[var27] < var13 - -var15 && (class638.field9057[var27] - var11) < var14) {
                        var14 = class638.field9057[var27] - var11;
                        var16 = true;
                    }
                }
            }
            class638.field9057[var12] = var14;
            String var17 = class638.field9064[var12];
            if (class696.field9882 == 0) {
                int var18 = 16776960;
                if (class638.field9062[var12] < 6) {
                    var18 = class625.field8907[class638.field9062[var12]];
                }
                if (class638.field9062[var12] == 6) {
                    var18 = (client.field1377 % 20) < 10 ? 16711680 : 16776960;
                }
                if (class638.field9062[var12] == 7) {
                    var18 = (client.field1377 % 20) < 10 ? 255 : 65535;
                }
                if (class638.field9062[var12] == 8) {
                    var18 = (client.field1377 % 20) >= 10 ? 8454016 : 45056;
                }
                if (class638.field9062[var12] == 9) {
                    int var19 = 150 - class638.field9061[var12];
                    if (var19 < 50) {
                        var18 = var19 * 1280 + 16711680;
                    } else if (var19 < 100) {
                        var18 = 16384000 - (var19 * 327680 - 16776960);
                    } else if (var19 < 150) {
                        var18 = 65280 - (500 - (var19 * 5));
                    }
                }
                if (class638.field9062[var12] == 10) {
                    int var20 = 150 - class638.field9061[var12];
                    if (var20 < 50) {
                        var18 = (var20 * 5) + 16711680;
                    } else if (var20 < 100) {
                        var18 = 16711935 - ((var20 - 50) * 327680);
                    } else if (var20 < 150) {
                        var18 = -(var20 * 5) - (-((var20 - 100) * 327680 + 255) - 500);
                    }
                }
                if (class638.field9062[var12] == 11) {
                    int var21 = 150 - class638.field9061[var12];
                    if (var21 < 50) {
                        var18 = 16777215 - var21 * 327685;
                    } else if (var21 < 100) {
                        var18 = 65280 - (16384250 - (var21 * 327685));
                    } else if (var21 < 150) {
                        var18 = 16777215 + 32768000 - var21 * 327680;
                    }
                }
                int var22 = var18 | 0xFF000000;
                if (class638.field9060[var12] == 0) {
                    class148.field2503.method2399(var22, arg6 + var13, arg2 + var14, -16777216, var17, (byte) 109);
                }
                if (class638.field9060[var12] == 1) {
                    class148.field2503.method2387(arg6 + var13, arg2 + var14, var17, var22, (byte) -47, client.field1377, -16777216);
                }
                if (class638.field9060[var12] == 2) {
                    class148.field2503.method2400(var22, var17, -16777216, arg6 + var13, arg2 + var14, client.field1377, 5);
                }
                if (class638.field9060[var12] == 3) {
                    class148.field2503.method2385(-16777216, arg6 + var13, arg2 - -var14, (byte) 42, 150 - class638.field9061[var12], var22, client.field1377, var17);
                }
                if (class638.field9060[var12] == 4) {
                    int var23 = (150 - class638.field9061[var12]) * (class246.field3584.method2870(true, var17) + 100) / 150;
                    class637.field9048.method818(arg6 + var13 - 50, arg2, arg6 + var13 + 50, arg2 + arg3);
                    class148.field2503.method2394((byte) 113, arg6 + var13 + 50 - var23, var17, -16777216, var22, arg2 + var14);
                    class637.field9048.method771(arg6, arg2, arg1 + arg6, arg2 + arg3);
                }
                if (class638.field9060[var12] == 5) {
                    int var24 = 150 - class638.field9061[var12];
                    int var25 = 0;
                    if (var24 < 25) {
                        var25 = var24 - 25;
                    } else if (var24 > 125) {
                        var25 = var24 - 125;
                    }
                    int var26 = class246.field3584.field7041 + class246.field3584.field7038;
                    class637.field9048.method818(arg6, arg2 + var14 - (var26 + 1), arg1 + arg6, arg2 + var14 + 5);
                    class148.field2503.method2399(var22, arg6 + var13, var14 + var25 + arg2, -16777216, var17, (byte) 109);
                    class637.field9048.method771(arg6, arg2, arg6 + arg1, arg2 + arg3);
                }
            } else {
                class148.field2503.method2399(-256, arg6 + var13, arg2 - -var14, -16777216, var17, (byte) 109);
            }
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method3154(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field7909++;
        if (arg2 == 1) {
            if (arg4 == arg7 && arg1 == arg5) {
                return true;
            }
        } else if (arg7 <= arg4 && arg2 + arg7 - 1 >= arg4 && arg1 >= arg1 && arg1 <= (arg2 + arg1 - 1)) {
            return true;
        }
        int var9 = arg7 - this.field7891;
        int var10 = arg1 - this.field7908;
        int var11 = arg4 - this.field7891;
        int var12 = -14 % ((arg0 + 54) / 48);
        int var13 = arg5 - this.field7908;
        if (arg2 == 1) {
            if (arg3 == 6 || arg3 == 7) {
                if (arg3 == 7) {
                    arg6 = arg6 + 2 & 0x3;
                }
                if (arg6 == 0) {
                    if (var11 + 1 == var9 && var10 == var13 && (this.field7893[var9][var13] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var10 - 1) == var13 && (this.field7893[var9][var13] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if ((var11 - 1) == var9 && var10 == var13 && (this.field7893[var9][var13] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var10 - 1) == var13 && (this.field7893[var9][var13] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if (var11 - 1 == var9 && var10 == var13 && (this.field7893[var9][var13] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 + 1 == var13 && (this.field7893[var9][var13] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var11 + 1 == var9 && var10 == var13 && (this.field7893[var9][var13] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 + 1 == var13 && (this.field7893[var9][var13] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 8) {
                if (var9 == var11 && var10 + 1 == var13 && (this.field7893[var9][var13] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var11 && var10 - 1 == var13 && (this.field7893[var9][var13] & 0x2) == 0) {
                    return true;
                }
                if (var11 - 1 == var9 && var10 == var13 && (this.field7893[var9][var13] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var9 && var10 == var13 && (this.field7893[var9][var13] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var14 = arg2 + var9 - 1;
            int var15 = arg2 + var13 - 1;
            if (arg3 == 6 || arg3 == 7) {
                if (arg3 == 7) {
                    arg6 = arg6 + 2 & 0x3;
                }
                if (arg6 == 0) {
                    if ((var11 + 1) == var9 && var13 <= var10 && var15 >= var10 && (this.field7893[var9][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var11 <= var14 && var10 - arg2 == var13 && (this.field7893[var11][var15] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var11 - arg2 == var9 && var10 >= var13 && var10 <= var15 && (this.field7893[var14][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var11 <= var14 && (var10 - arg2) == var13 && (this.field7893[var11][var15] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if ((var11 - arg2) == var9 && var13 <= var10 && var15 >= var10 && (this.field7893[var14][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var11 <= var14 && var10 + 1 == var13 && (this.field7893[var11][var13] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if ((var11 + 1) == var9 && var13 <= var10 && var15 >= var10 && (this.field7893[var9][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var14 >= var11 && var10 + 1 == var13 && (this.field7893[var11][var13] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 8) {
                if (var9 <= var11 && var14 >= var11 && (var10 + 1) == var13 && (this.field7893[var11][var13] & 0x20) == 0) {
                    return true;
                }
                if (var11 >= var9 && var11 <= var14 && var10 - arg2 == var13 && (this.field7893[var11][var15] & 0x2) == 0) {
                    return true;
                }
                if (var11 - arg2 == var9 && var10 >= var13 && var10 <= var15 && (this.field7893[var14][var10] & 0x8) == 0) {
                    return true;
                }
                if (var11 + 1 == var9 && var10 >= var13 && var10 <= var15 && (this.field7893[var9][var10] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(III)V")
    public final void method3155(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field7908;
        int var5 = 56 / ((arg0 + 84) / 35);
        field7897++;
        int var6 = arg1 - this.field7891;
        this.field7893[var6][var4] = class248.method1593(this.field7893[var6][var4], -262145);
    }

    @OriginalMember(owner = "client!nea", name = "b", descriptor = "(IIIIIIII)Z")
    public final boolean method3156(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field7899++;
        if (arg1 == 1) {
            if (arg4 == arg5 && arg0 == arg6) {
                return true;
            }
        } else if (arg4 >= arg5 && (arg5 + arg1 - 1) >= arg4 && arg6 <= arg6 && (arg1 + arg6 - 1) >= arg6) {
            return true;
        }
        int var9 = arg6 - this.field7908;
        int var10 = arg5 - this.field7891;
        int var11 = arg0 - this.field7908;
        if (arg7 != -1) {
            field7895 = 59;
        }
        int var12 = arg4 - this.field7891;
        if (arg1 == 1) {
            if (arg2 == 0) {
                if (arg3 == 0) {
                    if (var12 - 1 == var10 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && var9 + 1 == var11 && (this.field7893[var10][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var9 - 1 == var11 && (this.field7893[var10][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var10 == var12 && (var9 + 1) == var11) {
                        return true;
                    }
                    if (var12 - 1 == var10 && var9 == var11 && (this.field7893[var10][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var10 && var9 == var11 && (this.field7893[var10][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if ((var12 + 1) == var10 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && var9 + 1 == var11 && (this.field7893[var10][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var9 - 1 == var11 && (this.field7893[var10][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var10 == var12 && var9 - 1 == var11) {
                        return true;
                    }
                    if ((var12 - 1) == var10 && var9 == var11 && (this.field7893[var10][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var10 && var9 == var11 && (this.field7893[var10][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 2) {
                if (arg3 == 0) {
                    if (var12 - 1 == var10 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && var9 + 1 == var11) {
                        return true;
                    }
                    if ((var12 + 1) == var10 && var9 == var11 && (this.field7893[var10][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var9 - 1) == var11 && (this.field7893[var10][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var12 - 1 == var10 && var9 == var11 && (this.field7893[var10][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var9 + 1 == var11) {
                        return true;
                    }
                    if ((var12 + 1) == var10 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && var9 - 1 == var11 && (this.field7893[var10][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if ((var12 - 1) == var10 && var9 == var11 && (this.field7893[var10][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var9 + 1 == var11 && (this.field7893[var10][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var10 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && (var9 - 1) == var11) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if ((var12 - 1) == var10 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && (var9 + 1) == var11 && (this.field7893[var10][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var10 && var9 == var11 && (this.field7893[var10][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var9 - 1) == var11) {
                        return true;
                    }
                }
            }
            if (arg2 == 9) {
                if (var10 == var12 && var9 + 1 == var11 && (this.field7893[var10][var11] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var12 && (var9 - 1) == var11 && (this.field7893[var10][var11] & 0x2) == 0) {
                    return true;
                }
                if ((var12 - 1) == var10 && var9 == var11 && (this.field7893[var10][var11] & 0x8) == 0) {
                    return true;
                }
                if ((var12 + 1) == var10 && var9 == var11 && (this.field7893[var10][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg1 + var10 - 1;
            int var14 = arg1 + var11 - 1;
            if (arg2 == 0) {
                if (arg3 == 0) {
                    if ((var12 - arg1) == var10 && var11 <= var9 && var9 <= var14) {
                        return true;
                    }
                    if (var10 <= var12 && var12 <= var13 && (var9 + 1) == var11 && (this.field7893[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 <= var12 && var12 <= var13 && var9 - arg1 == var11 && (this.field7893[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var10 <= var12 && var12 <= var13 && (var9 + 1) == var11) {
                        return true;
                    }
                    if ((var12 - arg1) == var10 && var11 <= var9 && var14 >= var9 && (this.field7893[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var10 && var9 >= var11 && var9 <= var14 && (this.field7893[var10][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var12 + 1 == var10 && var11 <= var9 && var9 <= var14) {
                        return true;
                    }
                    if (var10 <= var12 && var13 >= var12 && var9 + 1 == var11 && (this.field7893[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 <= var12 && var12 <= var13 && var9 - arg1 == var11 && (this.field7893[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var12 >= var10 && var13 >= var12 && (var9 - arg1) == var11) {
                        return true;
                    }
                    if (var12 - arg1 == var10 && var9 >= var11 && var14 >= var9 && (this.field7893[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var10 && var11 <= var9 && var14 >= var9 && (this.field7893[var10][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 2) {
                if (arg3 == 0) {
                    if (var12 - arg1 == var10 && var9 >= var11 && var14 >= var9) {
                        return true;
                    }
                    if (var12 >= var10 && var13 >= var12 && var9 + 1 == var11) {
                        return true;
                    }
                    if (var12 + 1 == var10 && var9 >= var11 && var9 <= var14 && (this.field7893[var10][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 <= var12 && var12 <= var13 && (var9 - arg1) == var11 && (this.field7893[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var12 - arg1 == var10 && var11 <= var9 && var9 <= var14 && (this.field7893[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 <= var12 && var13 >= var12 && (var9 + 1) == var11) {
                        return true;
                    }
                    if (var12 + 1 == var10 && var11 <= var9 && var9 <= var14) {
                        return true;
                    }
                    if (var12 >= var10 && var13 >= var12 && (var9 - arg1) == var11 && (this.field7893[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var12 - arg1 == var10 && var11 <= var9 && var14 >= var9 && (this.field7893[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 >= var10 && var13 >= var12 && var9 + 1 == var11 && (this.field7893[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var10 && var9 >= var11 && var14 >= var9) {
                        return true;
                    }
                    if (var10 <= var12 && var12 <= var13 && var9 - arg1 == var11) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if ((var12 - arg1) == var10 && var9 >= var11 && var14 >= var9) {
                        return true;
                    }
                    if (var12 >= var10 && var12 <= var13 && var9 + 1 == var11 && (this.field7893[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var10 && var9 >= var11 && var9 <= var14 && (this.field7893[var10][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 <= var12 && var12 <= var13 && (var9 - arg1) == var11) {
                        return true;
                    }
                }
            }
            if (arg2 == 9) {
                if (var12 >= var10 && var13 >= var12 && var9 + 1 == var11 && (this.field7893[var12][var11] & 0x2C0120) == 0) {
                    return true;
                }
                if (var10 <= var12 && var13 >= var12 && var9 - arg1 == var11 && (this.field7893[var12][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if (var12 - arg1 == var10 && var11 <= var9 && var14 >= var9 && (this.field7893[var13][var9] & 0x2C0108) == 0) {
                    return true;
                }
                if (var12 + 1 == var10 && var11 <= var9 && var9 <= var14 && (this.field7893[var10][var9] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(ZZIIIII)V")
    public final void method3157(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field7912++;
        int var8 = 256;
        if (arg0) {
            var8 |= 0x20000;
        }
        if (arg1) {
            var8 |= 0x40000000;
        }
        int var9 = arg4 - this.field7908;
        int var10 = arg5 - this.field7891;
        if (arg6 >= -34) {
            this.method3165(false);
        }
        for (int var11 = var10; var11 < arg2 + var10; var11++) {
            if (var11 >= 0 && this.field7918 > var11) {
                for (int var12 = var9; var12 < (arg3 + var9); var12++) {
                    if (var12 >= 0 && var12 < this.field7914) {
                        this.method3163(var11, var8, var12, true);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nea", name = "b", descriptor = "(III)V")
    public final void method3158(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field7908;
        if (arg0 != 0) {
            field7903 = 61;
        }
        int var5 = arg2 - this.field7891;
        field7905++;
        this.field7893[var5][var4] = class460.method2676(this.field7893[var5][var4], 2097152);
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(BII)V")
    public final void method3159(byte arg0, int arg1, int arg2) {
        field7896++;
        int var4 = arg1 - this.field7891;
        int var5 = arg2 - this.field7908;
        this.field7893[var4][var5] = class248.method1593(this.field7893[var4][var5], -2097153);
        if (arg0 != -91) {
            field7895 = -106;
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZ)V")
    public static final void method3160(int arg0, int arg1, int arg2, int arg3, byte[][][] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, byte arg11, int arg12, int arg13, boolean arg14, boolean arg15) {
        class112.field1802 = class490.field7029.method802() > 0;
        class109.field1768 = arg15;
        class371.field5135 = arg1 >> class49.field637;
        class22.field303 = arg3 >> class49.field637;
        class311.field4314 = arg1;
        class475.field6813 = arg3;
        class88.field1321 = arg2;
        class608.field8742 = class371.field5135 - class668.field9389;
        if (class608.field8742 < 0) {
            class215.field3243 = -class608.field8742;
            class608.field8742 = 0;
        } else {
            class215.field3243 = 0;
        }
        class31.field458 = class22.field303 - class668.field9389;
        if (class31.field458 < 0) {
            class366.field5079 = -class31.field458;
            class31.field458 = 0;
        } else {
            class366.field5079 = 0;
        }
        class684.field9729 = class668.field9389 + class371.field5135;
        if (class684.field9729 > class33.field474) {
            class684.field9729 = class33.field474;
        }
        class172.field2786 = class668.field9389 + class22.field303;
        if (class172.field2786 > class687.field9758) {
            class172.field2786 = class687.field9758;
        }
        boolean[][] var16 = class678.field9661;
        boolean[][] var17 = class513.field7625;
        if (class109.field1768) {
            for (int var18 = 0; var18 < class668.field9389 + class668.field9389 + 2; var18++) {
                for (int var21 = 0; var21 < class668.field9389 + class668.field9389 + 2; var21++) {
                    int var22 = class371.field5135 + var18 - class668.field9389;
                    int var23 = class22.field303 + var21 - class668.field9389;
                    if (var22 >= 0 && var23 >= 0 && var22 < class33.field474 && var23 < class687.field9758) {
                        int var24 = var22 << class49.field637;
                        int var25 = var23 << class49.field637;
                        int var26 = class621.field8841[class621.field8841.length - 1].method3858(var23, var22, (byte) 75) - (0x3E8 << class49.field637 - 7);
                        int var27 = class340.field4723 == null ? class621.field8841[0].method3858(var23, var22, (byte) 103) + class457.field6576 : class340.field4723[0].method3858(var23, var22, (byte) 100) + class457.field6576;
                        class513.field7625[var18][var21] = class490.field7029.method788(var24, var26, var25, var24, var27, var25);
                    } else {
                        class513.field7625[var18][var21] = false;
                    }
                }
            }
            for (int var19 = 0; var19 < class668.field9389 + class668.field9389 + 1; var19++) {
                for (int var20 = 0; var20 < class668.field9389 + class668.field9389 + 1; var20++) {
                    class678.field9661[var19][var20] = class513.field7625[var19][var20] || class513.field7625[var19 + 1][var20] || class513.field7625[var19][var20 + 1] || class513.field7625[var19 + 1][var20 + 1];
                }
            }
            class396.field5728 = arg5;
            class353.field4951 = arg6;
            class91.field1341 = arg7;
            class465.field6726 = arg8;
            class155.field2553 = arg9;
            class631.method3563(arg10, false, class490.field7029);
        } else {
            if (class546.field8009 == null) {
                class546.field8009 = new boolean[class33.field474 + class33.field474 + 1][class687.field9758 + class33.field474 + 1];
                for (int var28 = 0; var28 < class546.field8009.length; var28++) {
                    for (int var29 = 0; var29 < class546.field8009[0].length; var29++) {
                        class546.field8009[var28][var29] = true;
                    }
                }
            }
            class513.field7625 = class546.field8009;
            class678.field9661 = class546.field8009;
            class608.field8742 = 0;
            class31.field458 = 0;
            class684.field9729 = class33.field474;
            class172.field2786 = class687.field9758;
            class550.field8071 = 0;
        }
        class253.method1618(class490.field7029, (byte) -44);
        for (class690 var30 = (class690) class221.field3305.method3313((byte) 104); var30 != null; var30 = (class690) class221.field3305.method3308(3)) {
            var30.method3421(3);
            class567.method3316((byte) -61, var30);
        }
        if (class112.field1802) {
            for (int var31 = 0; var31 < class410.field5858; var31++) {
                class126.field2067[var31].method38((byte) -110, arg14, arg0);
            }
        }
        if (class215.field3244) {
            class65.field941 = class490.field7029.method826();
            class490.field7029.method764(class547.field8027);
            int var32 = (class547.field8027[2] - class547.field8027[0]) / class255.field3675;
            for (int var33 = 0; var33 < class255.field3675 - 1; var33++) {
                class599.field8655[var33] = (var33 + 1) * var32 + class697.field9887[var33];
            }
            for (int var34 = 0; var34 < class355.field4980.length; var34++) {
                class355.field4980[var34].method1303();
            }
        }
        if (class667.field9371 != null) {
            if (class215.field3244) {
                class666.method3751(0);
            }
            class699.method3928(true);
            class490.field7029.method760(-1, 1583160, 40, 127);
            class230.method1509(true, arg4, arg10, arg11);
            if (class215.field3244) {
                class49.method388();
            }
            class490.field7029.method821();
            class699.method3928(false);
        }
        class230.method1509(false, arg4, arg10, arg11);
        if (class215.field3244) {
            for (int var35 = 0; var35 < class596.field8626; var35++) {
                class390.field5686[var35] = class128.field2095[var35];
            }
            class666.method3751(0);
            for (int var36 = 0; var36 < class355.field4980.length; var36++) {
                class355.field4980[var36].method1303();
            }
        }
        if (class215.field3244) {
            class49.method388();
            for (int var37 = 0; var37 < class596.field8626; var37++) {
                class128.field2095[var37] = class390.field5686[var37];
            }
            if (class34.field487 == 2) {
                int var10002;
                if (class464.field6645[0] < class464.field6645[1]) {
                    if (class697.field9887[0] + class599.field8655[0] > class547.field8027[0]) {
                        var10002 = class697.field9887[0]++;
                    }
                } else if (class464.field6645[0] > class464.field6645[1] && class697.field9887[0] + class599.field8655[0] < class547.field8027[2]) {
                    var10002 = class697.field9887[0]--;
                }
            }
        }
        if (!class109.field1768) {
            class678.field9661 = var16;
            class513.field7625 = var17;
        }
        class511.method3042();
    }

    @OriginalMember(owner = "client!nea", name = "c", descriptor = "(III)V")
    public final void method3161(int arg0, int arg1, int arg2) {
        field7915++;
        int var4 = arg0 - this.field7908;
        int var5 = arg1 - this.field7891;
        int var6 = -17 / ((arg2 + 66) / 35);
        this.field7893[var5][var4] = class460.method2676(this.field7893[var5][var4], 262144);
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(IZIZIZI)V")
    public final void method3162(int arg0, boolean arg1, int arg2, boolean arg3, int arg4, boolean arg5, int arg6) {
        int var8 = arg4 - this.field7891;
        field7900++;
        int var9 = arg0 - this.field7908;
        if (!arg3) {
            return;
        }
        if (arg2 == 0) {
            if (arg6 == 0) {
                this.method3164(1, var9, 128, var8);
                this.method3164(1, var9, 8, var8 - 1);
            }
            if (arg6 == 1) {
                this.method3164(1, var9, 2, var8);
                this.method3164(1, var9 + 1, 32, var8);
            }
            if (arg6 == 2) {
                this.method3164(1, var9, 8, var8);
                this.method3164(1, var9, 128, var8 + 1);
            }
            if (arg6 == 3) {
                this.method3164(1, var9, 32, var8);
                this.method3164(1, var9 - 1, 2, var8);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg6 == 0) {
                this.method3164(1, var9, 1, var8);
                this.method3164(1, var9 + 1, 16, var8 - 1);
            }
            if (arg6 == 1) {
                this.method3164(1, var9, 4, var8);
                this.method3164(1, var9 + 1, 64, var8 + 1);
            }
            if (arg6 == 2) {
                this.method3164(1, var9, 16, var8);
                this.method3164(1, var9 - 1, 1, var8 + 1);
            }
            if (arg6 == 3) {
                this.method3164(1, var9, 64, var8);
                this.method3164(1, var9 - 1, 4, var8 - 1);
            }
        }
        if (arg2 == 2) {
            if (arg6 == 0) {
                this.method3164(1, var9, 130, var8);
                this.method3164(1, var9, 8, var8 - 1);
                this.method3164(1, var9 + 1, 32, var8);
            }
            if (arg6 == 1) {
                this.method3164(1, var9, 10, var8);
                this.method3164(1, var9 + 1, 32, var8);
                this.method3164(1, var9, 128, var8 + 1);
            }
            if (arg6 == 2) {
                this.method3164(1, var9, 40, var8);
                this.method3164(1, var9, 128, var8 + 1);
                this.method3164(1, var9 - 1, 2, var8);
            }
            if (arg6 == 3) {
                this.method3164(1, var9, 160, var8);
                this.method3164(1, var9 - 1, 2, var8);
                this.method3164(1, var9, 8, var8 - 1);
            }
        }
        if (arg5) {
            if (arg2 == 0) {
                if (arg6 == 0) {
                    this.method3164(1, var9, 65536, var8);
                    this.method3164(1, var9, 4096, var8 - 1);
                }
                if (arg6 == 1) {
                    this.method3164(1, var9, 1024, var8);
                    this.method3164(1, var9 + 1, 16384, var8);
                }
                if (arg6 == 2) {
                    this.method3164(1, var9, 4096, var8);
                    this.method3164(1, var9, 65536, var8 + 1);
                }
                if (arg6 == 3) {
                    this.method3164(1, var9, 16384, var8);
                    this.method3164(1, var9 - 1, 1024, var8);
                }
            }
            if (arg2 == 1 || arg2 == 3) {
                if (arg6 == 0) {
                    this.method3164(1, var9, 512, var8);
                    this.method3164(1, var9 + 1, 8192, var8 - 1);
                }
                if (arg6 == 1) {
                    this.method3164(1, var9, 2048, var8);
                    this.method3164(1, var9 + 1, 32768, var8 + 1);
                }
                if (arg6 == 2) {
                    this.method3164(1, var9, 8192, var8);
                    this.method3164(1, var9 - 1, 512, var8 + 1);
                }
                if (arg6 == 3) {
                    this.method3164(1, var9, 32768, var8);
                    this.method3164(1, var9 - 1, 2048, var8 - 1);
                }
            }
            if (arg2 == 2) {
                if (arg6 == 0) {
                    this.method3164(1, var9, 66560, var8);
                    this.method3164(1, var9, 4096, var8 - 1);
                    this.method3164(1, var9 + 1, 16384, var8);
                }
                if (arg6 == 1) {
                    this.method3164(1, var9, 5120, var8);
                    this.method3164(1, var9 + 1, 16384, var8);
                    this.method3164(1, var9, 65536, var8 + 1);
                }
                if (arg6 == 2) {
                    this.method3164(1, var9, 20480, var8);
                    this.method3164(1, var9, 65536, var8 + 1);
                    this.method3164(1, var9 - 1, 1024, var8);
                }
                if (arg6 == 3) {
                    this.method3164(1, var9, 81920, var8);
                    this.method3164(1, var9 - 1, 1024, var8);
                    this.method3164(1, var9, 4096, var8 - 1);
                }
            }
        }
        if (!arg1) {
            return;
        }
        if (arg2 == 0) {
            if (arg6 == 0) {
                this.method3164(1, var9, 536870912, var8);
                this.method3164(1, var9, 33554432, var8 - 1);
            }
            if (arg6 == 1) {
                this.method3164(1, var9, 8388608, var8);
                this.method3164(1, var9 + 1, 134217728, var8);
            }
            if (arg6 == 2) {
                this.method3164(1, var9, 33554432, var8);
                this.method3164(1, var9, 536870912, var8 + 1);
            }
            if (arg6 == 3) {
                this.method3164(1, var9, 134217728, var8);
                this.method3164(1, var9 - 1, 8388608, var8);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg6 == 0) {
                this.method3164(1, var9, 4194304, var8);
                this.method3164(1, var9 + 1, 67108864, var8 - 1);
            }
            if (arg6 == 1) {
                this.method3164(1, var9, 16777216, var8);
                this.method3164(1, var9 + 1, 268435456, var8 + 1);
            }
            if (arg6 == 2) {
                this.method3164(1, var9, 67108864, var8);
                this.method3164(1, var9 - 1, 4194304, var8 + 1);
            }
            if (arg6 == 3) {
                this.method3164(1, var9, 268435456, var8);
                this.method3164(1, var9 - 1, 16777216, var8 - 1);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg6 == 0) {
            this.method3164(1, var9, 545259520, var8);
            this.method3164(1, var9, 33554432, var8 - 1);
            this.method3164(1, var9 + 1, 134217728, var8);
        }
        if (arg6 == 1) {
            this.method3164(1, var9, 41943040, var8);
            this.method3164(1, var9 + 1, 134217728, var8);
            this.method3164(1, var9, 536870912, var8 + 1);
        }
        if (arg6 == 2) {
            this.method3164(1, var9, 167772160, var8);
            this.method3164(1, var9, 536870912, var8 + 1);
            this.method3164(1, var9 - 1, 8388608, var8);
        }
        if (arg6 == 3) {
            this.method3164(1, var9, 671088640, var8);
            this.method3164(1, var9 - 1, 8388608, var8);
            this.method3164(1, var9, 33554432, var8 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(IIIZ)V")
    private final void method3163(int arg0, int arg1, int arg2, boolean arg3) {
        if (!arg3) {
            field7902 = -71L;
        }
        field7916++;
        this.field7893[arg0][arg2] = class460.method2676(this.field7893[arg0][arg2], arg1);
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(IIII)V")
    private final void method3164(int arg0, int arg1, int arg2, int arg3) {
        this.field7893[arg3][arg1] = class248.method1593(this.field7893[arg3][arg1], ~arg2);
        field7904++;
        if (arg0 != 1) {
            field7892 = 21;
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(Z)V")
    public final void method3165(boolean arg0) {
        if (!arg0) {
            this.method3167(65, false, 8, 45, true, 80, false);
        }
        for (int var2 = 0; var2 < this.field7918; var2++) {
            for (int var3 = 0; var3 < this.field7914; var3++) {
                if (var2 == 0 || var3 == 0 || this.field7918 - 5 <= var2 || var3 >= this.field7914 - 5) {
                    this.field7893[var2][var3] = -1;
                } else {
                    this.field7893[var2][var3] = 2097152;
                }
            }
        }
        field7907++;
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(IIIIZIIII)Z")
    public final boolean method3166(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8) {
        field7913++;
        if (arg8 > 1) {
            return class550.method3231(100, arg8, arg1, arg5, arg8, arg0, arg3, arg2, arg7) ? true : this.method3168(-103, arg7, arg1, arg6, arg0, arg2, arg8, arg8, arg5, arg3);
        }
        if (!arg4) {
            this.method3158(12, 12, 49);
        }
        int var10 = arg5 + arg3 - 1;
        int var11 = arg7 + arg2 - 1;
        if (arg1 >= arg5 && var10 >= arg1 && arg7 <= arg0 && var11 >= arg0) {
            return true;
        } else if (arg5 - 1 == arg1 && arg0 >= arg7 && arg0 <= var11 && (this.field7893[arg1 - this.field7891][arg0 - this.field7908] & 0x8) == 0 && (arg6 & 0x8) == 0) {
            return true;
        } else if ((var10 + 1) == arg1 && arg0 >= arg7 && var11 >= arg0 && (this.field7893[arg1 - this.field7891][arg0 - this.field7908] & 0x80) == 0 && (arg6 & 0x2) == 0) {
            return true;
        } else if ((arg7 - 1) == arg0 && arg5 <= arg1 && arg1 <= var10 && (this.field7893[arg1 - this.field7891][arg0 - this.field7908] & 0x2) == 0 && (arg6 & 0x4) == 0) {
            return true;
        } else {
            return var11 + 1 == arg0 && arg1 >= arg5 && var10 >= arg1 && (this.field7893[arg1 - this.field7891][arg0 - this.field7908] & 0x20) == 0 && (arg6 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(IZIIZIZ)V")
    public final void method3167(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5, boolean arg6) {
        field7901++;
        int var8 = arg0 - this.field7891;
        int var9 = arg3 - this.field7908;
        if (arg2 == 0) {
            if (arg5 == 0) {
                this.method3163(var8, 128, var9, true);
                this.method3163(var8 - 1, 8, var9, !arg4);
            }
            if (arg5 == 1) {
                this.method3163(var8, 2, var9, true);
                this.method3163(var8, 32, var9 + 1, true);
            }
            if (arg5 == 2) {
                this.method3163(var8, 8, var9, true);
                this.method3163(var8 + 1, 128, var9, !arg4);
            }
            if (arg5 == 3) {
                this.method3163(var8, 32, var9, true);
                this.method3163(var8, 2, var9 - 1, true);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg5 == 0) {
                this.method3163(var8, 1, var9, !arg4);
                this.method3163(var8 - 1, 16, var9 + 1, true);
            }
            if (arg5 == 1) {
                this.method3163(var8, 4, var9, true);
                this.method3163(var8 + 1, 64, var9 + 1, true);
            }
            if (arg5 == 2) {
                this.method3163(var8, 16, var9, true);
                this.method3163(var8 + 1, 1, var9 - 1, true);
            }
            if (arg5 == 3) {
                this.method3163(var8, 64, var9, !arg4);
                this.method3163(var8 - 1, 4, var9 - 1, true);
            }
        }
        if (arg4) {
            this.method3168(30, -18, -40, -52, 115, -91, -101, 101, 113, 31);
        }
        if (arg2 == 2) {
            if (arg5 == 0) {
                this.method3163(var8, 130, var9, true);
                this.method3163(var8 - 1, 8, var9, true);
                this.method3163(var8, 32, var9 + 1, true);
            }
            if (arg5 == 1) {
                this.method3163(var8, 10, var9, true);
                this.method3163(var8, 32, var9 + 1, true);
                this.method3163(var8 + 1, 128, var9, true);
            }
            if (arg5 == 2) {
                this.method3163(var8, 40, var9, true);
                this.method3163(var8 + 1, 128, var9, true);
                this.method3163(var8, 2, var9 - 1, true);
            }
            if (arg5 == 3) {
                this.method3163(var8, 160, var9, true);
                this.method3163(var8, 2, var9 - 1, !arg4);
                this.method3163(var8 - 1, 8, var9, true);
            }
        }
        if (arg6) {
            if (arg2 == 0) {
                if (arg5 == 0) {
                    this.method3163(var8, 65536, var9, true);
                    this.method3163(var8 - 1, 4096, var9, true);
                }
                if (arg5 == 1) {
                    this.method3163(var8, 1024, var9, true);
                    this.method3163(var8, 16384, var9 + 1, !arg4);
                }
                if (arg5 == 2) {
                    this.method3163(var8, 4096, var9, true);
                    this.method3163(var8 + 1, 65536, var9, true);
                }
                if (arg5 == 3) {
                    this.method3163(var8, 16384, var9, !arg4);
                    this.method3163(var8, 1024, var9 - 1, true);
                }
            }
            if (arg2 == 1 || arg2 == 3) {
                if (arg5 == 0) {
                    this.method3163(var8, 512, var9, true);
                    this.method3163(var8 - 1, 8192, var9 + 1, true);
                }
                if (arg5 == 1) {
                    this.method3163(var8, 2048, var9, true);
                    this.method3163(var8 + 1, 32768, var9 + 1, true);
                }
                if (arg5 == 2) {
                    this.method3163(var8, 8192, var9, true);
                    this.method3163(var8 + 1, 512, var9 - 1, true);
                }
                if (arg5 == 3) {
                    this.method3163(var8, 32768, var9, true);
                    this.method3163(var8 - 1, 2048, var9 - 1, true);
                }
            }
            if (arg2 == 2) {
                if (arg5 == 0) {
                    this.method3163(var8, 66560, var9, true);
                    this.method3163(var8 - 1, 4096, var9, true);
                    this.method3163(var8, 16384, var9 + 1, true);
                }
                if (arg5 == 1) {
                    this.method3163(var8, 5120, var9, true);
                    this.method3163(var8, 16384, var9 + 1, !arg4);
                    this.method3163(var8 + 1, 65536, var9, true);
                }
                if (arg5 == 2) {
                    this.method3163(var8, 20480, var9, !arg4);
                    this.method3163(var8 + 1, 65536, var9, true);
                    this.method3163(var8, 1024, var9 - 1, true);
                }
                if (arg5 == 3) {
                    this.method3163(var8, 81920, var9, true);
                    this.method3163(var8, 1024, var9 - 1, true);
                    this.method3163(var8 - 1, 4096, var9, !arg4);
                }
            }
        }
        if (!arg1) {
            return;
        }
        if (arg2 == 0) {
            if (arg5 == 0) {
                this.method3163(var8, 536870912, var9, !arg4);
                this.method3163(var8 - 1, 33554432, var9, true);
            }
            if (arg5 == 1) {
                this.method3163(var8, 8388608, var9, true);
                this.method3163(var8, 134217728, var9 + 1, !arg4);
            }
            if (arg5 == 2) {
                this.method3163(var8, 33554432, var9, !arg4);
                this.method3163(var8 + 1, 536870912, var9, true);
            }
            if (arg5 == 3) {
                this.method3163(var8, 134217728, var9, true);
                this.method3163(var8, 8388608, var9 - 1, true);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg5 == 0) {
                this.method3163(var8, 4194304, var9, true);
                this.method3163(var8 - 1, 67108864, var9 + 1, true);
            }
            if (arg5 == 1) {
                this.method3163(var8, 16777216, var9, true);
                this.method3163(var8 + 1, 268435456, var9 + 1, true);
            }
            if (arg5 == 2) {
                this.method3163(var8, 67108864, var9, true);
                this.method3163(var8 + 1, 4194304, var9 - 1, true);
            }
            if (arg5 == 3) {
                this.method3163(var8, 268435456, var9, true);
                this.method3163(var8 - 1, 16777216, var9 - 1, true);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method3163(var8, 545259520, var9, !arg4);
            this.method3163(var8 - 1, 33554432, var9, true);
            this.method3163(var8, 134217728, var9 + 1, true);
        }
        if (arg5 == 1) {
            this.method3163(var8, 41943040, var9, !arg4);
            this.method3163(var8, 134217728, var9 + 1, true);
            this.method3163(var8 + 1, 536870912, var9, true);
        }
        if (arg5 == 2) {
            this.method3163(var8, 167772160, var9, true);
            this.method3163(var8 + 1, 536870912, var9, true);
            this.method3163(var8, 8388608, var9 - 1, !arg4);
        }
        if (arg5 == 3) {
            this.method3163(var8, 671088640, var9, true);
            this.method3163(var8, 8388608, var9 - 1, true);
            this.method3163(var8 - 1, 33554432, var9, !arg4);
            return;
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(IIIIIIIIII)Z")
    public final boolean method3168(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field7911++;
        int var11 = arg2 + arg6;
        if (arg0 >= -7) {
            this.method3164(9, -106, 109, 33);
        }
        int var12 = arg4 + arg7;
        int var13 = arg8 + arg9;
        int var14 = arg1 + arg5;
        if (arg2 == var13 && (arg3 & 0x2) == 0) {
            int var15 = arg1 >= arg4 ? arg1 : arg4;
            int var16 = var12 >= var14 ? var14 : var12;
            while (var15 < var16) {
                if ((this.field7893[var13 - this.field7891 - 1][var15 - this.field7908] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg8 == var11 && (arg3 & 0x8) == 0) {
            int var17 = arg1 < arg4 ? arg4 : arg1;
            int var18 = var12 >= var14 ? var14 : var12;
            while (var17 < var18) {
                if ((this.field7893[arg8 - this.field7891][var17 - this.field7908] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg4 == var14 && (arg3 & 0x1) == 0) {
            int var19 = arg2 > arg8 ? arg2 : arg8;
            int var20 = var13 <= var11 ? var13 : var11;
            while (var20 > var19) {
                if ((this.field7893[var19 - this.field7891][var14 - this.field7908 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg1 == var12 && (arg3 & 0x4) == 0) {
            int var21 = arg8 >= arg2 ? arg8 : arg2;
            int var22 = var11 >= var13 ? var13 : var11;
            while (var21 < var22) {
                if ((this.field7893[var21 - this.field7891][arg1 - this.field7908] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!nea", name = "b", descriptor = "(I)V")
    public static final void method3169(int arg0) {
        if (class540.field7926 < 102) {
            class540.field7926 += 6;
        }
        field7898++;
        if (class94.field1402 != -1 && class221.field3302 < class254.method1619(true)) {
            for (int var1 = class94.field1402; var1 < class465.field6654.length; var1++) {
                if (class465.field6654[var1].startsWith("pause")) {
                    int var2 = 5;
                    try {
                        var2 = Integer.parseInt(class465.field6654[var1].substring(6));
                    } catch (Exception var13) {
                    }
                    class28.method269(arg0 + 47009, "Pausing for " + var2 + " seconds...");
                    class94.field1402 = var1 + 1;
                    class221.field3302 = class254.method1619(true) + (long) (var2 * 1000);
                    return;
                }
                class476.field6818 = class465.field6654[var1];
                class418.method2476(0, false);
            }
            class94.field1402 = -1;
        }
        if (class165.field2730 != 0) {
            class303.field4250 -= class165.field2730 * 5;
            if (class303.field4250 >= class487.field6943) {
                class303.field4250 = class487.field6943 - 1;
            }
            class165.field2730 = 0;
            if (class303.field4250 < 0) {
                class303.field4250 = 0;
            }
        }
        for (int var3 = 0; var3 < class443.field6418; var3++) {
            class414 var4 = class336.field4674[var3];
            int var5 = var4.method2464((byte) -128);
            char var6 = var4.method2467(24968);
            int var7 = var4.method2465(-13747);
            if (var5 == 84) {
                class418.method2476(0, false);
            }
            if (var5 == 80) {
                class418.method2476(0, true);
            } else if (var5 == 66 && (var7 & 0x4) != 0) {
                if (class477.field6830 != null) {
                    String var11 = "";
                    for (int var12 = class679.field9668.length - 1; var12 >= 0; var12--) {
                        if (class679.field9668[var12] != null && class679.field9668[var12].length() > 0) {
                            var11 = var11 + class679.field9668[var12] + '\n';
                        }
                    }
                    class477.field6830.setContents(new StringSelection(var11), null);
                }
            } else if (var5 == 67 && (var7 & 0x4) != 0) {
                if (class477.field6830 != null) {
                    Transferable var8 = class477.field6830.getContents(null);
                    if (var8 != null) {
                        try {
                            String var9 = (String) var8.getTransferData(DataFlavor.stringFlavor);
                            if (var9 != null) {
                                String[] var10 = class6.method26(var9, (byte) 61, '\n');
                                class72.method586(var10, (byte) -78);
                            }
                        } catch (Exception var14) {
                        }
                    }
                }
            } else if (var5 == 85 && class149.field2511 > 0) {
                class476.field6818 = class476.field6818.substring(0, class149.field2511 - 1) + class476.field6818.substring(class149.field2511);
                class149.field2511--;
            } else if (var5 == 101 && class149.field2511 < class476.field6818.length()) {
                class476.field6818 = class476.field6818.substring(0, class149.field2511) + class476.field6818.substring(class149.field2511 + 1);
            } else if (var5 == 96 && class149.field2511 > 0) {
                class149.field2511--;
            } else if (var5 == 97 && class149.field2511 < class476.field6818.length()) {
                class149.field2511++;
            } else if (var5 == 102) {
                class149.field2511 = 0;
            } else if (var5 == 103) {
                class149.field2511 = class476.field6818.length();
            } else if (var5 == 104 && class679.field9668.length > class685.field9735) {
                class685.field9735++;
                class5.method23(11683);
                class149.field2511 = class476.field6818.length();
            } else if (var5 == 105 && class685.field9735 > 0) {
                class685.field9735--;
                class5.method23(11683);
                class149.field2511 = class476.field6818.length();
            } else if (class242.method1564(var6, 1) || var6 == '\\' || var6 == '/' || var6 == '.' || var6 == ':' || var6 == ',' || var6 == ' ' || var6 == '_' || var6 == '-' || var6 == '+' || var6 == '[' || var6 == ']') {
                class476.field6818 = class476.field6818.substring(0, class149.field2511) + class336.field4674[var3].method2467(24968) + class476.field6818.substring(class149.field2511);
                class149.field2511++;
            }
        }
        if (arg0 != -14693) {
            field7910 = null;
        }
        class30.field453 = 0;
        class443.field6418 = 0;
        class498.method2983(95);
    }
}
