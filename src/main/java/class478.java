import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class478 extends class449 {

    @OriginalMember(owner = "client!ej", name = "s", descriptor = "I")
    public int field6789;

    @OriginalMember(owner = "client!ej", name = "q", descriptor = "[I")
    public static int[] field6787 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!ej", name = "r", descriptor = "I")
    public static int field6788;

    @OriginalMember(owner = "client!ej", name = "t", descriptor = "I")
    public static int field6790;

    @OriginalMember(owner = "client!ej", name = "u", descriptor = "I")
    public static int field6791;

    @OriginalMember(owner = "client!ej", name = "v", descriptor = "I")
    public static int field6792;

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "(I)V", line = 3)
    public static void method2828(int arg0) {
        if (arg0 >= -119) {
            field6792 = -23;
        }
        field6787 = null;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(CIB)C", line = 15)
    public static final char method2829(char arg0, int arg1, byte arg2) {
        field6791++;
        if (arg2 >= -18) {
            return (char) 65443;
        }
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
            return arg0;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIII)V", line = 102)
    public static final void method2830(int arg0, int arg1, int arg2, int arg3) {
        field6788++;
        if (class385.field5285 == null) {
            return;
        }
        long var4 = (long) (arg3 << 14 | arg2 << 28 | arg1);
        class223 var6 = (class223) class427.field5956.method1104(-124, var4);
        if (var6 == null) {
            class35.method214(arg2, arg1, arg3);
            return;
        }
        class143 var7 = (class143) var6.field3219.method775(1);
        if (var7 == null) {
            class35.method214(arg2, arg1, arg3);
            return;
        }
        class164 var8 = (class164) class35.method214(arg2, arg1, arg3);
        int var9 = -76 / ((arg0 + 26) / 62);
        if (var8 == null) {
            var8 = new class164();
        } else {
            var8.field2384 = var8.field2381 = -1;
        }
        var8.field2394 = var7.field1992;
        var8.field2397 = var7.field1987;
        label44: while (true) {
            class143 var10 = (class143) var6.field3219.method763(0);
            if (var10 == null) {
                break;
            }
            if (var8.field2397 != var10.field1987) {
                var8.field2392 = var10.field1992;
                var8.field2384 = var10.field1987;
                while (true) {
                    class143 var11 = (class143) var6.field3219.method763(0);
                    if (var11 == null) {
                        break label44;
                    }
                    if (var8.field2397 != var11.field1987 && var8.field2384 != var11.field1987) {
                        var8.field2381 = var11.field1987;
                        var8.field2383 = var11.field1992;
                    }
                }
            }
        }
        int var12 = class407.method2440((arg1 << 7) + 64, -16490, (arg3 << 7) + 64, arg2);
        class418.method2510(arg2, arg1, arg3, var12, var8);
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "()V", line = 185)
    public class478() {
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(I)V", line = 187)
    public class478(int arg0) {
        this.field6789 = arg0;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(B)V", line = 195)
    public static final void method2831(byte arg0) {
        if (class409.field5606 > 0) {
            class409.field5606--;
        }
        field6790++;
        if (class89.field1270 > 1) {
            class416.field5725 = class86.field1217;
            class89.field1270--;
        }
        if (class225.field3246) {
            class225.field3246 = false;
            class480.method2836(arg0 ^ 0x15EB);
            return;
        }
        if (!class205.field3005) {
            class445.method2702(23770);
        }
        for (int var1 = 0; var1 < 100 && class241.method1676((byte) 81); var1++) {
        }
        if (class347.field4787 != 30) {
            return;
        }
        class174.method1260(class418.field5779.method1982((byte) 26), -89, class311.field4403);
        if (class475.field6713 == null) {
            if (class112.field1576 <= class10.method51(-3183)) {
                class475.field6713 = class304.field4317.method1874(class41.field552, (byte) 53);
            }
        } else if (class475.field6713.field6347 != -1) {
            class336.method2111(class218.field3161, 126);
            class311.field4403.method1173(class475.field6713.field6347, (byte) 120);
            class475.field6713 = null;
            class112.field1576 = class10.method51(-3183) + 30000L;
        }
        if (class69.field1012 != null || class10.method51(arg0 ^ 0xC09) - 2000L > class18.field183) {
            boolean var2 = false;
            int var3 = class311.field4403.field2298;
            for (class271 var4 = (class271) class238.field3485.method775(1); var4 != null && (class311.field4403.field2298 - var3) < 240; var4 = (class271) class238.field3485.method763(0)) {
                var4.method2714(-123);
                int var5 = var4.method938(1);
                if (var5 < 0) {
                    var5 = 0;
                } else if (var5 > 65534) {
                    var5 = 65534;
                }
                int var6 = var4.method936(0);
                if (var6 < 0) {
                    var6 = 0;
                } else if (var6 > 65534) {
                    var6 = 65534;
                }
                boolean var7 = false;
                if (var4.method938(1) == -1 && var4.method936(arg0 + 104) == -1) {
                    var5 = -1;
                    var7 = true;
                    var6 = -1;
                }
                if (class393.field5425 != var6 || class361.field4974 != var5) {
                    if (!var2) {
                        class336.method2111(class233.field3394, 99);
                        class204.field2993++;
                        class311.field4403.method1180((byte) -110, 0);
                        var3 = class311.field4403.field2298;
                        var2 = true;
                    }
                    int var8 = var6 - class393.field5425;
                    class393.field5425 = var6;
                    int var9 = var5 - class361.field4974;
                    class361.field4974 = var5;
                    int var10 = (int) ((var4.method939((byte) 113) - class18.field183) / 20L);
                    if (var10 < 8 && var8 >= -32 && var8 <= 31 && var9 >= -32 && var9 <= 31) {
                        var9 += 32;
                        var8 += 32;
                        class311.field4403.method1173((var8 << 6) + ((var10 << 12) + var9), (byte) 127);
                    } else if (var10 < 32 && var8 >= -128 && var8 <= 127 && var9 >= -128 && var9 <= 127) {
                        class311.field4403.method1180((byte) -110, var10 + 128);
                        var9 += 128;
                        var8 += 128;
                        class311.field4403.method1173((var8 << 8) + var9, (byte) 126);
                    } else if (var10 < 32) {
                        class311.field4403.method1180((byte) -110, var10 + 192);
                        if (var7) {
                            class311.field4403.method1177(Integer.MIN_VALUE, -73);
                        } else {
                            class311.field4403.method1177(var5 << 16 | var6, -39);
                        }
                    } else {
                        class311.field4403.method1173(var10 + 57344, (byte) 116);
                        if (var7) {
                            class311.field4403.method1177(Integer.MIN_VALUE, -101);
                        } else {
                            class311.field4403.method1177(var5 << 16 | var6, -85);
                        }
                    }
                    class18.field183 = var4.method939((byte) 91);
                }
            }
            if (var2) {
                class311.field4403.method1138(class311.field4403.field2298 - var3, 1);
            }
        }
        if (class69.field1012 != null) {
            long var11 = (class69.field1012.method939((byte) 125) - class142.field1983) / 50L;
            class142.field1983 = class69.field1012.method939((byte) 121);
            if (var11 > 32767L) {
                var11 = 32767L;
            }
            int var13 = class69.field1012.method938(1);
            if (var13 < 0) {
                var13 = 0;
            } else if (var13 > 65535) {
                var13 = 65535;
            }
            int var14 = class69.field1012.method936(arg0 + 104);
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 65535) {
                var14 = 65535;
            }
            byte var15 = 0;
            if (class69.field1012.method937(5) == 2) {
                var15 = 1;
            }
            int var16 = (int) var11;
            class336.method2111(class106.field1488, 89);
            class75.field1076++;
            class311.field4403.method1187(var16 | var15 << 15, (byte) -18);
            class311.field4403.method1177(var14 | var13 << 16, -80);
        }
        if (class484.field6858 > 0) {
            int var17 = 0;
            for (int var18 = 0; var18 < class484.field6858; var18++) {
                if (class399.field5469[var18].method475(-2)) {
                    var17++;
                }
            }
            if (var17 > 0) {
                class336.method2111(class233.field3403, 118);
                if (var17 > 75) {
                    var17 = 75;
                }
                class368.field5062++;
                class311.field4403.method1180((byte) -110, var17 * 3);
                for (int var19 = 0; var19 < class484.field6858; var19++) {
                    class46 var20 = class399.field5469[var19];
                    if (var20.method475(-2)) {
                        long var21 = (var20.method470(7) - class67.field986) / 50L;
                        class67.field986 = var20.method470(7);
                        if (var21 > 65535L) {
                            var21 = 65535L;
                        }
                        class311.field4403.method1180((byte) -110, var20.method471(-1));
                        class311.field4403.method1173((int) var21, (byte) 114);
                    }
                }
            }
        }
        if (class443.field6298 > 0) {
            class443.field6298--;
        }
        if (class303.field4311 && class443.field6298 <= 0) {
            class443.field6298 = 20;
            class303.field4311 = false;
            class454.field6432++;
            class336.method2111(class225.field3245, 120);
            class311.field4403.method1140((int) class421.field5826 >> 3, 6293);
            class311.field4403.method1187((int) class91.field1281 >> 3, (byte) -18);
        }
        if (arg0 != -104) {
            field6792 = 91;
        }
        if (class190.field2853 && !class424.field5877) {
            class187.field2798++;
            class424.field5877 = true;
            class336.method2111(class116.field1618, 126);
            class311.field4403.method1180((byte) -110, 1);
        }
        if (!class190.field2853 && class424.field5877) {
            class424.field5877 = false;
            class187.field2798++;
            class336.method2111(class116.field1618, 99);
            class311.field4403.method1180((byte) -110, 0);
        }
        if (!class385.field5284) {
            class96.field1353++;
            class336.method2111(class477.field6758, 117);
            class311.field4403.method1194(arg0 - 13861, class36.method217(arg0 ^ 0xFFFFFFB9));
            class385.field5284 = true;
        }
        if (class385.field5285 != null) {
            if (class390.field5393 == 2) {
                class228.method1552(arg0 ^ 0x1A);
            } else if (class390.field5393 == 3) {
                class168.method1220((byte) 123);
            }
        }
        if (class309.field4387) {
            class309.field4387 = false;
        } else {
            class301.field4259 /= 2.0F;
        }
        if (class107.field1498) {
            class107.field1498 = false;
        } else {
            class95.field1340 /= 2.0F;
        }
        class192.method1343((byte) 64);
        if (class347.field4787 != 30) {
            return;
        }
        class436.method2668(arg0 ^ 0x7BF2);
        class34.method208(80);
        class279.method1866(-16777216);
        class329.method2061(-30746);
        class46.field711++;
        if (class46.field711 > 750) {
            class480.method2836(-5517);
            return;
        }
        class110.method870(true);
        class303.method1953((byte) -99);
        class313.method1992((byte) -128);
        for (int var23 = class416.field5691.method1725(true, 9928); var23 != -1; var23 = class416.field5691.method1725(false, 9928)) {
            class219.method1509(false, var23);
            class325.field4542[class88.method739(class62.field911++, 31)] = var23;
        }
        for (class334 var24 = class440.method2677(-127); var24 != null; var24 = class440.method2677(-120)) {
            int var25 = var24.method2102(24611);
            int var26 = var24.method2105(true);
            if (var25 == 1) {
                class339.field4689[var26] = var24.field4648;
                class199.field2947 |= class394.field5443[var26];
                class30.field313[class88.method739(31, class187.field2801++)] = var26;
            } else if (var25 == 2) {
                class401.field5505[var26] = var24.field4645;
                class462.field6527[class88.method739(class280.field4020++, 31)] = var26;
            } else if (var25 == 3) {
                class172 var48 = class361.method2217(var26, arg0 ^ 0x3F3AD428);
                if (!var24.field4645.equals(var48.field2476)) {
                    var48.field2476 = var24.field4645;
                    class184.method1314(var48, 120);
                }
            } else if (var25 == 4) {
                class172 var27 = class361.method2217(var26, -1060820048);
                int var28 = var24.field4648;
                int var29 = var24.field4635;
                int var30 = var24.field4636;
                if (var27.field2488 != var28 || var27.field2551 != var29 || var27.field2492 != var30) {
                    var27.field2488 = var28;
                    var27.field2551 = var29;
                    var27.field2492 = var30;
                    class184.method1314(var27, 119);
                }
            } else if (var25 == 5) {
                class172 var31 = class361.method2217(var26, -1060820048);
                if (var24.field4648 != var31.field2597 || var24.field4648 == -1) {
                    var31.field2559 = 1;
                    var31.field2528 = 0;
                    var31.field2597 = var24.field4648;
                    var31.field2585 = 0;
                    class184.method1314(var31, 100);
                }
            } else if (var25 == 6) {
                int var42 = var24.field4648;
                int var43 = var42 >> 10 & 0x1F;
                int var44 = var42 >> 5 & 0x1F;
                int var45 = var42 & 0x1F;
                int var46 = (var45 << 3) + (var43 << 19) + (var44 << 11);
                class172 var47 = class361.method2217(var26, -1060820048);
                if (var47.field2482 != var46) {
                    var47.field2482 = var46;
                    class184.method1314(var47, 65);
                }
            } else if (var25 == 7) {
                class172 var32 = class361.method2217(var26, arg0 - 1060819944);
                boolean var33 = var24.field4648 == 1;
                if (var33 != var32.field2567) {
                    var32.field2567 = var33;
                    class184.method1314(var32, 73);
                }
            } else if (var25 == 8) {
                class172 var34 = class361.method2217(var26, arg0 - 1060819944);
                if (var24.field4648 != var34.field2578 || var24.field4635 != var34.field2556 || var24.field4636 != var34.field2519) {
                    var34.field2578 = var24.field4648;
                    var34.field2556 = var24.field4635;
                    var34.field2519 = var24.field4636;
                    if (var34.field2483 != -1) {
                        if (var34.field2521 > 0) {
                            var34.field2519 = var34.field2519 * 32 / var34.field2521;
                        } else if (var34.field2580 > 0) {
                            var34.field2519 = var34.field2519 * 32 / var34.field2580;
                        }
                    }
                    class184.method1314(var34, 101);
                }
            } else if (var25 == 9) {
                class172 var35 = class361.method2217(var26, -1060820048);
                if (var24.field4648 != var35.field2483 || var24.field4635 != var35.field2608) {
                    var35.field2608 = var24.field4635;
                    var35.field2483 = var24.field4648;
                    class184.method1314(var35, 126);
                }
            } else if (var25 == 10) {
                class172 var36 = class361.method2217(var26, -1060820048);
                if (var24.field4648 != var36.field2596 || var24.field4635 != var36.field2581 || var24.field4636 != var36.field2491) {
                    var36.field2596 = var24.field4648;
                    var36.field2581 = var24.field4635;
                    var36.field2491 = var24.field4636;
                    class184.method1314(var36, 116);
                }
            } else if (var25 == 11) {
                class172 var37 = class361.method2217(var26, arg0 ^ 0x3F3AD428);
                var37.field2466 = var37.field2552 = var24.field4635;
                var37.field2601 = 0;
                var37.field2502 = var37.field2536 = var24.field4648;
                var37.field2533 = 0;
                class184.method1314(var37, 91);
            } else if (var25 == 12) {
                class172 var40 = class361.method2217(var26, -1060820048);
                int var41 = var24.field4648;
                if (var40 != null && var40.field2602 == 0) {
                    if (var40.field2506 - var40.field2579 < var41) {
                        var41 = var40.field2506 - var40.field2579;
                    }
                    if (var41 < 0) {
                        var41 = 0;
                    }
                    if (var40.field2518 != var41) {
                        var40.field2518 = var41;
                        class184.method1314(var40, 126);
                    }
                }
            } else if (var25 == 14) {
                class172 var38 = class361.method2217(var26, -1060820048);
                var38.field2495 = var24.field4648;
            } else if (var25 == 15) {
                class437.field6218 = var24.field4648;
                class424.field5871 = true;
                class89.field1266 = var24.field4635;
            } else if (var25 == 16) {
                class172 var39 = class361.method2217(var26, -1060820048);
                var39.field2471 = var24.field4648;
            }
        }
        if (class483.field6826 != 0) {
            class323.field4515 += 20;
            if (class323.field4515 >= 400) {
                class483.field6826 = 0;
            }
        }
        class385.field5283++;
        if (class67.field970 != null) {
            class56.field825++;
            if (class56.field825 >= 15) {
                class184.method1314(class67.field970, 108);
                class67.field970 = null;
            }
        }
        class119.field1648 = null;
        class442.field6293 = false;
        class487.field6893 = false;
        class125.field1697 = null;
        class230.method1623((byte) 121, -1, (class172) null, -1);
        class427.method2555((class172) null, -1, arg0 ^ -28, -1);
        class448.method2710((byte) -127);
        class86.field1217++;
        if (class454.field6430) {
            class336.method2111(class56.field830, 107);
            class391.field5401++;
            class311.field4403.method1158(class129.field1773 << 14 | class127.field1736 << 28 | class59.field848, -123);
            class454.field6430 = false;
        }
        while (true) {
            class472 var49;
            class172 var50;
            class172 var51;
            do {
                var49 = (class472) class450.field6398.method776((byte) -90);
                if (var49 == null) {
                    while (true) {
                        class472 var52;
                        class172 var53;
                        class172 var54;
                        do {
                            var52 = (class472) class484.field6857.method776((byte) 89);
                            if (var52 == null) {
                                while (true) {
                                    class472 var55;
                                    class172 var56;
                                    class172 var57;
                                    do {
                                        var55 = (class472) class262.field3780.method776((byte) 58);
                                        if (var55 == null) {
                                            if (class125.field1697 == null) {
                                                class169.field2446 = 0;
                                            }
                                            if (class464.field6538 != null) {
                                                class392.method2372(-105);
                                            }
                                            if (class255.field3661 > 0 && class162.field2363.method1820((byte) -96, 82) && class162.field2363.method1820((byte) -96, 81) && class255.field3668 != 0) {
                                                int var58 = class262.field3781.field4531 - class255.field3668;
                                                if (var58 < 0) {
                                                    var58 = 0;
                                                } else if (var58 > 3) {
                                                    var58 = 3;
                                                }
                                                class449.method2716(class262.field3781.field5811[0] + class279.field4012, var58, class262.field3781.field5807[0] + class189.field2810, (byte) -122);
                                            }
                                            class129.method969((byte) 25);
                                            for (int var59 = 0; var59 < 5; var59++) {
                                                int var10002 = class406.field5543[var59]++;
                                            }
                                            if (class199.field2947 && (class10.method51(-3183) - 60000L) > class7.field44) {
                                                class367.method2244(4);
                                            }
                                            class476.field6744++;
                                            if (class476.field6744 > 500) {
                                                class476.field6744 = 0;
                                                int var60 = (int) (Math.random() * 8.0D);
                                                if ((var60 & 0x2) == 2) {
                                                    class243.field3534 += class94.field1317;
                                                }
                                                if ((var60 & 0x4) == 4) {
                                                    class270.field3935 += class137.field1912;
                                                }
                                                if ((var60 & 0x1) == 1) {
                                                    class37.field396 += class437.field6216;
                                                }
                                            }
                                            if (class37.field396 < -50) {
                                                class437.field6216 = 2;
                                            }
                                            if (class37.field396 > 50) {
                                                class437.field6216 = -2;
                                            }
                                            if (class243.field3534 < -55) {
                                                class94.field1317 = 2;
                                            }
                                            if (class243.field3534 > 55) {
                                                class94.field1317 = -2;
                                            }
                                            if (class270.field3935 < -40) {
                                                class137.field1912 = 1;
                                            }
                                            class34.field368++;
                                            if (class270.field3935 > 40) {
                                                class137.field1912 = -1;
                                            }
                                            if (class34.field368 > 500) {
                                                class34.field368 = 0;
                                                int var61 = (int) (Math.random() * 8.0D);
                                                if ((var61 & 0x1) == 1) {
                                                    class462.field6529 += class133.field1868;
                                                }
                                                if ((var61 & 0x2) == 2) {
                                                    class20.field216 += class193.field2877;
                                                }
                                            }
                                            if (class462.field6529 < -60) {
                                                class133.field1868 = 2;
                                            }
                                            if (class462.field6529 > 60) {
                                                class133.field1868 = -2;
                                            }
                                            if (class20.field216 < -20) {
                                                class193.field2877 = 1;
                                            }
                                            class371.field5101++;
                                            if (class20.field216 > 10) {
                                                class193.field2877 = -1;
                                            }
                                            if (class371.field5101 > 50) {
                                                class343.field4735++;
                                                class336.method2111(class8.field61, 96);
                                            }
                                            if (class218.field3162) {
                                                class368.method2252(0);
                                                class218.field3162 = false;
                                            }
                                            try {
                                                if (class394.field5440 != null && class311.field4403.field2298 > 0) {
                                                    class176.field2666 += class311.field4403.field2298;
                                                    class394.field5440.method2090(0, class311.field4403.field2262, (byte) -45, class311.field4403.field2298);
                                                    class311.field4403.field2298 = 0;
                                                    class371.field5101 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var62) {
                                                class480.method2836(arg0 ^ 0x15EB);
                                                return;
                                            }
                                        }
                                        var56 = var55.field6642;
                                        if (var56.field2527 < 0) {
                                            break;
                                        }
                                        var57 = class361.method2217(var56.field2532, -1060820048);
                                    } while (var57 == null || var57.field2541 == null || var57.field2541.length <= var56.field2527 || var57.field2541[var56.field2527] != var56);
                                    class457.method2745(var55);
                                }
                            }
                            var53 = var52.field6642;
                            if (var53.field2527 < 0) {
                                break;
                            }
                            var54 = class361.method2217(var53.field2532, -1060820048);
                        } while (var54 == null || var54.field2541 == null || var54.field2541.length <= var53.field2527 || var54.field2541[var53.field2527] != var53);
                        class457.method2745(var52);
                    }
                }
                var50 = var49.field6642;
                if (var50.field2527 < 0) {
                    break;
                }
                var51 = class361.method2217(var50.field2532, -1060820048);
            } while (var51 == null || var51.field2541 == null || var50.field2527 >= var51.field2541.length || var51.field2541[var50.field2527] != var50);
            class457.method2745(var49);
        }
    }
}
