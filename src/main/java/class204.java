import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class204 extends class326 {

    @OriginalMember(owner = "client!sl", name = "O", descriptor = "I")
    private int field3235 = 585;

    @OriginalMember(owner = "client!sl", name = "M", descriptor = "I")
    public static int field3233 = 255;

    @OriginalMember(owner = "client!sl", name = "Q", descriptor = "Lma;")
    public static class5 field3237 = new class5();

    @OriginalMember(owner = "client!sl", name = "S", descriptor = "F")
    public static float field3239;

    @OriginalMember(owner = "client!sl", name = "J", descriptor = "I")
    public static int field3230;

    @OriginalMember(owner = "client!sl", name = "K", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!sl", name = "N", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!sl", name = "P", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!sl", name = "R", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!sl", name = "I", descriptor = "[I")
    public static int[] field3229;

    @OriginalMember(owner = "client!sl", name = "L", descriptor = "[Lbh;")
    public static class18[] field3232;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IZLvl;)V", line = 8)
    public final void method98(int arg0, boolean arg1, class6 arg2) {
        field3234++;
        if (arg0 == 0) {
            this.field3235 = arg2.method39((byte) 43);
        }
        if (arg1) {
            field3239 = 0.12604281F;
        }
    }

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "(I)V", line = 39)
    public static void method1502(int arg0) {
        field3229 = null;
        field3232 = null;
        field3237 = null;
        if (arg0 != 1) {
            field3239 = -1.0857152F;
        }
    }

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "()V", line = 53)
    public class204() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "(I)Z", line = 57)
    public static final boolean method1503(int arg0) throws IOException {
        field3231++;
        if (class275.field4247 == null) {
            return false;
        }
        int var1 = class275.field4247.method217(30000);
        if (var1 == 0) {
            return false;
        }
        if (class30.field449 == -1) {
            class275.field4247.method219(1, 0, class111.field1544.field115, (byte) 24);
            class111.field1544.field111 = 0;
            class30.field449 = class111.field1544.method1951(arg0 + 99);
            class61.field899 = class225.field3567[class30.field449];
            var1--;
        }
        if (class61.field899 == -1) {
            if (var1 <= 0) {
                return false;
            }
            var1--;
            class275.field4247.method219(1, 0, class111.field1544.field115, (byte) 24);
            class61.field899 = class111.field1544.field115[0] & 0xFF;
        }
        if (class61.field899 == -2) {
            if (var1 <= 1) {
                return false;
            }
            class275.field4247.method219(2, 0, class111.field1544.field115, (byte) 24);
            var1 -= 2;
            class111.field1544.field111 = 0;
            class61.field899 = class111.field1544.method39((byte) 89);
        }
        if (var1 < class61.field899) {
            return false;
        }
        class111.field1544.field111 = 0;
        class275.field4247.method219(class61.field899, 0, class111.field1544.field115, (byte) 24);
        class68.field958 = class326.field5120;
        class107.field1426 = 0;
        class326.field5120 = class327.field5127;
        class327.field5127 = class30.field449;
        if (class30.field449 == 18) {
            int var2 = class111.field1544.method68(-4325);
            int var3 = class111.field1544.method39((byte) 121);
            int var4 = class111.field1544.method72((byte) -66);
            int var5 = class111.field1544.method95((byte) -107);
            if (class60.method499(0, var2)) {
                class249.method1795(var5, (var3 << 16) + var4, (byte) -120);
            }
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 156) {
            int var391 = class111.field1544.method95((byte) -107);
            int var392 = class111.field1544.method89(82);
            class15.method143(var392, arg0 ^ 0x52, var391);
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 241) {
            int var6 = class111.field1544.method95((byte) -107);
            class270.field4199 = class42.field581.method1022(var6, (byte) 87);
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 15) {
            int var7 = class111.field1544.method72((byte) -66);
            String var8 = class111.field1544.method40(false);
            int var9 = class111.field1544.method39((byte) 67);
            if (class60.method499(0, var7)) {
                class147.method1082(28580, var9, var8);
            }
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 160) {
            class213.method1557(false, arg0 ^ 0x2);
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 43) {
            int var385 = class111.field1544.method73((byte) 19);
            int var386 = class111.field1544.method39((byte) 99);
            class136 var387;
            if (var385 >= 0) {
                var387 = class14.method140(var385, 1036508464);
            } else {
                var387 = null;
            }
            if (var385 < -70000) {
                var386 += 32768;
            }
            while (class111.field1544.field111 < class61.field899) {
                int var388 = class111.field1544.method52(-32768);
                int var389 = 0;
                int var390 = class111.field1544.method39((byte) 39);
                if (var390 != 0) {
                    var389 = class111.field1544.method58(-288140008);
                    if (var389 == 255) {
                        var389 = class111.field1544.method73((byte) 19);
                    }
                }
                if (var387 != null && var388 >= 0 && var387.field2146.length > var388) {
                    var387.field2146[var388] = var390;
                    var387.field1992[var388] = var389;
                }
                class62.method507(var386, arg0 - 30346, var388, var389, var390 - 1);
            }
            if (var387 != null) {
                class167.method1250(var387, 412);
            }
            class325.method2286(65);
            class334.field5200[class333.method2319(31, class170.field2804++)] = class333.method2319(var386, 32767);
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 148) {
            long var369 = class111.field1544.method37(-1513731168);
            class111.field1544.method83((byte) -86);
            long var371 = class111.field1544.method37(-1513731168);
            boolean var373 = false;
            long var374 = (long) class111.field1544.method39((byte) 78);
            long var376 = (long) class111.field1544.method31(arg0 ^ 0xFFFFA69A);
            int var378 = class111.field1544.method58(arg0 - 288140010);
            int var379 = class111.field1544.method39((byte) 111);
            long var380 = (var374 << 32) + var376;
            int var382 = 0;
            label1731: while (true) {
                if (var382 < 100) {
                    if (class325.field5103[var382] != var380) {
                        var382++;
                        continue;
                    }
                    var373 = true;
                    break;
                }
                if (var378 <= 1) {
                    for (int var383 = 0; var383 < class162.field2640; var383++) {
                        if (class316.field4982[var383] == var369) {
                            var373 = true;
                            break label1731;
                        }
                    }
                }
                break;
            }
            if (!var373 && class231.field3610 == 0) {
                class325.field5103[class224.field3539] = var380;
                class224.field3539 = (class224.field3539 + 1) % 100;
                String var384 = class142.method1059(-89, var379).method2231(class111.field1544, 80);
                if (var378 == 2 || var378 == 3) {
                    class214.method1563(20, class154.method1118(arg0 + 114, var371), (byte) -37, var384, "<img=1>" + class154.method1118(115, var369), var379);
                } else if (var378 == 1) {
                    class214.method1563(20, class154.method1118(126, var371), (byte) -37, var384, "<img=0>" + class154.method1118(110, var369), var379);
                } else {
                    class214.method1563(20, class154.method1118(124, var371), (byte) -37, var384, class154.method1118(122, var369), var379);
                }
            }
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 10) {
            int var10 = class111.field1544.method42((byte) 108);
            int var11 = class111.field1544.method68(arg0 - 4327);
            int var12 = class111.field1544.method68(arg0 - 4327);
            int var13 = class111.field1544.method73((byte) 19);
            if (class60.method499(0, var12)) {
                class25 var14 = (class25) class210.field3304.method2168((long) var13, (byte) -127);
                if (var14 != null) {
                    class6.method86(var14.field376 != var11, var14, false);
                }
                class26.method246(var13, var11, var10, arg0 ^ 0x14);
            }
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 74) {
            class274.field4236 = class111.field1544.method58(-288140008);
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 213) {
            int var366 = class111.field1544.method85(1);
            int var367 = class111.field1544.method42((byte) 125);
            int var368 = class111.field1544.method38(86);
            class154.field2392 = var366 >> 1;
            class146.field2310.method2339(var367, true, (var366 & 0x1) == 1, var368);
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 169) {
            int var332 = class111.field1544.method72((byte) -66);
            int var333 = class111.field1544.method92(-2697);
            int var334 = class111.field1544.method68(arg0 - 4327);
            int var335 = class111.field1544.method39((byte) 89);
            if ((var333 >> 30) != 0) {
                int var336 = (var333 & 0x3CF30446) >> 28;
                int var337 = (var333 & 0x3FFF) - class198.field3168;
                int var338 = (var333 >> 14 & 0x3FFF) - class326.field5108;
                if (var338 >= 0 && var337 >= 0 && var338 < 104 && var337 < 104) {
                    int var339 = var338 * 128 + 64;
                    int var340 = var337 * 128 + 64;
                    class94 var341 = new class94(var335, var336, var339, var340, class320.method2245((byte) -64, var340, var336, var339) - var332, var334, class229.field3595);
                    class244.field3809.method19(new class123(var341), -1058);
                }
            } else if (var333 >> 29 != 0) {
                int var342 = var333 & 0xFFFF;
                class212 var343 = class59.field870[var342];
                if (var343 != null) {
                    if (var335 == 65535) {
                        var335 = -1;
                    }
                    boolean var344 = true;
                    if (var335 != -1 && var343.field4703 != -1) {
                        if (var343.field4703 == var335) {
                            class234 var345 = class9.method124(var335, 1431655765);
                            if (var345.field3644 && var345.field3647 != -1) {
                                class281 var346 = class295.method2064(0, var345.field3647);
                                int var347 = var346.field4321;
                                if (var347 == 1) {
                                    var344 = false;
                                    var343.field4712 = 1;
                                    var343.field4735 = 0;
                                    var343.field4679 = 0;
                                    var343.field4732 = class229.field3595 + var334;
                                    var343.field4704 = 0;
                                    class91.method658(var346, true, false, var343.field4698, var343.field4679, var343.field4731);
                                } else if (var347 == 2) {
                                    var343.field4711 = 0;
                                    var344 = false;
                                }
                            }
                        } else {
                            class234 var348 = class9.method124(var335, arg0 ^ 0x55555557);
                            class234 var349 = class9.method124(var343.field4703, arg0 + 1431655763);
                            if (var348.field3647 != -1 && var349.field3647 != -1) {
                                class281 var350 = class295.method2064(0, var348.field3647);
                                class281 var351 = class295.method2064(0, var349.field3647);
                                if (var350.field4338 < var351.field4338) {
                                    var344 = false;
                                }
                            }
                        }
                    }
                    if (var344) {
                        var343.field4712 = 1;
                        var343.field4732 = class229.field3595 + var334;
                        var343.field4703 = var335;
                        var343.field4679 = 0;
                        if (class229.field3595 < var343.field4732) {
                            var343.field4679 = -1;
                        }
                        var343.field4704 = 0;
                        var343.field4685 = var332;
                        if (var343.field4703 != -1 && class229.field3595 == var343.field4732) {
                            int var352 = class9.method124(var343.field4703, 1431655765).field3647;
                            if (var352 != -1) {
                                class281 var353 = class295.method2064(0, var352);
                                if (var353 != null && var353.field4319 != null) {
                                    class91.method658(var353, true, false, var343.field4698, 0, var343.field4731);
                                }
                            }
                        }
                    }
                }
            } else if ((var333 >> 28) != 0) {
                int var354 = var333 & 0xFFFF;
                class337 var355;
                if (class92.field1231 == var354) {
                    var355 = class146.field2310;
                } else {
                    var355 = class284.field4403[var354];
                }
                if (var355 != null) {
                    if (var335 == 65535) {
                        var335 = -1;
                    }
                    boolean var356 = true;
                    if (var335 != -1 && var355.field4703 != -1) {
                        if (var355.field4703 == var335) {
                            class234 var361 = class9.method124(var335, 1431655765);
                            if (var361.field3644 && var361.field3647 != -1) {
                                class281 var362 = class295.method2064(0, var361.field3647);
                                int var363 = var362.field4321;
                                if (var363 == 1) {
                                    var355.field4712 = 1;
                                    var356 = false;
                                    var355.field4732 = class229.field3595 + var334;
                                    var355.field4735 = 0;
                                    var355.field4704 = 0;
                                    var355.field4679 = 0;
                                    class91.method658(var362, true, false, var355.field4698, var355.field4679, var355.field4731);
                                } else if (var363 == 2) {
                                    var356 = false;
                                    var355.field4711 = 0;
                                }
                            }
                        } else {
                            class234 var357 = class9.method124(var335, 1431655765);
                            class234 var358 = class9.method124(var355.field4703, 1431655765);
                            if (var357.field3647 != -1 && var358.field3647 != -1) {
                                class281 var359 = class295.method2064(arg0 - 2, var357.field3647);
                                class281 var360 = class295.method2064(0, var358.field3647);
                                if (var360.field4338 > var359.field4338) {
                                    var356 = false;
                                }
                            }
                        }
                    }
                    if (var356) {
                        var355.field4679 = 0;
                        var355.field4685 = var332;
                        var355.field4732 = class229.field3595 + var334;
                        var355.field4704 = 0;
                        var355.field4703 = var335;
                        if (class229.field3595 < var355.field4732) {
                            var355.field4679 = -1;
                        }
                        if (var355.field4703 == 65535) {
                            var355.field4703 = -1;
                        }
                        var355.field4712 = 1;
                        if (var355.field4703 != -1 && class229.field3595 == var355.field4732) {
                            int var364 = class9.method124(var355.field4703, 1431655765).field3647;
                            if (var364 != -1) {
                                class281 var365 = class295.method2064(0, var364);
                                if (var365 != null && var365.field4319 != null) {
                                    class91.method658(var365, true, class146.field2310 == var355, var355.field4698, 0, var355.field4731);
                                }
                            }
                        }
                    }
                }
            }
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 185) {
            long var15 = class111.field1544.method37(-1513731168);
            long var17 = (long) class111.field1544.method39((byte) 75);
            long var19 = (long) class111.field1544.method31(-22888);
            int var21 = class111.field1544.method58(-288140008);
            boolean var22 = false;
            int var23 = class111.field1544.method39((byte) 73);
            long var24 = (var17 << 32) + var19;
            int var26 = 0;
            label1252: while (true) {
                if (var26 < 100) {
                    if (class325.field5103[var26] != var24) {
                        var26++;
                        continue;
                    }
                    var22 = true;
                    break;
                }
                if (var21 <= 1) {
                    for (int var27 = 0; var27 < class162.field2640; var27++) {
                        if (class316.field4982[var27] == var15) {
                            var22 = true;
                            break label1252;
                        }
                    }
                }
                break;
            }
            if (!var22 && class231.field3610 == 0) {
                class325.field5103[class224.field3539] = var24;
                class224.field3539 = (class224.field3539 + 1) % 100;
                String var28 = class142.method1059(arg0 ^ 0xFFFFFFE9, var23).method2231(class111.field1544, 80);
                if (var21 == 2) {
                    class214.method1563(18, (String) null, (byte) -37, var28, "<img=1>" + class154.method1118(110, var15), var23);
                } else if (var21 == 1) {
                    class214.method1563(18, (String) null, (byte) -37, var28, "<img=0>" + class154.method1118(126, var15), var23);
                } else {
                    class214.method1563(18, (String) null, (byte) -37, var28, class154.method1118(110, var15), var23);
                }
            }
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 96 || class30.field449 == 92 || class30.field449 == 121 || class30.field449 == 88 || class30.field449 == 52 || class30.field449 == 20 || class30.field449 == 215 || class30.field449 == 227 || class30.field449 == 104 || class30.field449 == 250 || class30.field449 == 177 || class30.field449 == 214 || class30.field449 == 176 || class30.field449 == 239) {
            class78.method579((byte) -91);
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 45) {
            if (class134.field1966 != null) {
                class308.method2132(false, (byte) 13, class232.field3630, -1, -1);
            }
            byte[] var330 = new byte[class61.field899];
            class111.field1544.method1942(class61.field899, 0, false, var330);
            String var331 = class37.method316(var330, 100, class61.field899, 0);
            if (class184.field2976 == null && class137.field2190 == 3 || !class137.field2193.startsWith("win") || class298.field4592) {
                class136.method997(true, var331, 0);
            } else {
                class127.field1852 = true;
                class81.field1107 = var331;
                class91.field1213 = class42.field581.method1026(arg0 ^ 0x2, var331);
            }
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 63) {
            String var29 = class111.field1544.method40(false);
            int var30 = class111.field1544.method72((byte) -66);
            int var31 = class111.field1544.method39((byte) 53);
            if (class60.method499(0, var30)) {
                class147.method1082(arg0 ^ 0x6FA6, var31, var29);
            }
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 140) {
            int var32 = class111.field1544.method90((byte) -52);
            int var33 = class111.field1544.method89(69);
            int var34 = class111.field1544.method89(63);
            if (var34 == 65535) {
                var34 = -1;
            }
            if (class60.method499(0, var33)) {
                class123.method904(var34, -1, 122, 1, var32);
            }
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 93) {
            int var35 = class111.field1544.method72((byte) -66);
            int var36 = class111.field1544.method72((byte) -66);
            int var37 = class111.field1544.method42((byte) 72);
            if (class60.method499(0, var36)) {
                if (var37 == 2) {
                    class270.method1912((byte) -72);
                }
                class147.field2321 = var35;
                class199.method1466(var35, (byte) -127);
                class197.method1462(false, (byte) -50);
                class107.method731(class147.field2321, 0);
                for (int var38 = 0; var38 < 100; var38++) {
                    class231.field3607[var38] = true;
                }
            }
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == arg0) {
            int var39 = class111.field1544.method68(arg0 ^ 0xFFFFEF19);
            int var40 = class111.field1544.method85(1);
            if (var39 == 65535) {
                var39 = -1;
            }
            int var41 = var40 >> 2;
            int var42 = var40 & 0x3;
            int var43 = class95.field1260[var41];
            int var44 = class111.field1544.method95((byte) -107);
            int var45 = var44 >> 14 & 0x3FFF;
            int var46 = (var44 & 0x393178D6) >> 28;
            int var47 = var44 & 0x3FFF;
            int var48 = var47 - class198.field3168;
            int var49 = var45 - class326.field5108;
            class220.method1612((byte) 61, var43, var39, var42, var48, var46, var49, var41);
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 99) {
            String var289 = class111.field1544.method40(false);
            if (var289.endsWith(":tradereq:")) {
                String var325 = var289.substring(0, var289.indexOf(":"));
                boolean var326 = false;
                long var327 = class83.method608(var325, (byte) 80);
                for (int var329 = 0; var329 < class162.field2640; var329++) {
                    if (class316.field4982[var329] == var327) {
                        var326 = true;
                        break;
                    }
                }
                if (!var326 && class231.field3610 == 0) {
                    class131.method971(var325, (byte) -32, 4, class295.field4578);
                }
            } else if (var289.endsWith(":chalreq:")) {
                String var290 = var289.substring(0, var289.indexOf(":"));
                long var291 = class83.method608(var290, (byte) 76);
                boolean var293 = false;
                for (int var294 = 0; var294 < class162.field2640; var294++) {
                    if (class316.field4982[var294] == var291) {
                        var293 = true;
                        break;
                    }
                }
                if (!var293 && class231.field3610 == 0) {
                    String var295 = var289.substring(var289.indexOf(":") + 1, var289.length() - 9);
                    class131.method971(var290, (byte) -32, 8, var295);
                }
            } else if (var289.endsWith(":assistreq:")) {
                String var296 = var289.substring(0, var289.indexOf(":"));
                long var297 = class83.method608(var296, (byte) -81);
                boolean var299 = false;
                for (int var300 = 0; var300 < class162.field2640; var300++) {
                    if (class316.field4982[var300] == var297) {
                        var299 = true;
                        break;
                    }
                }
                if (!var299 && class231.field3610 == 0) {
                    class131.method971(var296, (byte) -32, 10, "");
                }
            } else if (var289.endsWith(":clan:")) {
                String var324 = var289.substring(0, var289.indexOf(":clan:"));
                class131.method971("", (byte) -32, 11, var324);
            } else if (var289.endsWith(":trade:")) {
                String var323 = var289.substring(0, var289.indexOf(":trade:"));
                if (class231.field3610 == 0) {
                    class131.method971("", (byte) -32, 12, var323);
                }
            } else if (var289.endsWith(":assist:")) {
                String var322 = var289.substring(0, var289.indexOf(":assist:"));
                if (class231.field3610 == 0) {
                    class131.method971("", (byte) -32, 13, var322);
                }
            } else if (var289.endsWith(":duelstake:")) {
                boolean var317 = false;
                String var318 = var289.substring(0, var289.indexOf(":"));
                long var319 = class83.method608(var318, (byte) 61);
                for (int var321 = 0; var321 < class162.field2640; var321++) {
                    if (class316.field4982[var321] == var319) {
                        var317 = true;
                        break;
                    }
                }
                if (!var317 && class231.field3610 == 0) {
                    class131.method971(var318, (byte) -32, 14, "");
                }
            } else if (var289.endsWith(":duelfriend:")) {
                String var301 = var289.substring(0, var289.indexOf(":"));
                long var302 = class83.method608(var301, (byte) -123);
                boolean var304 = false;
                for (int var305 = 0; var305 < class162.field2640; var305++) {
                    if (class316.field4982[var305] == var302) {
                        var304 = true;
                        break;
                    }
                }
                if (!var304 && class231.field3610 == 0) {
                    class131.method971(var301, (byte) -32, 15, "");
                }
            } else if (var289.endsWith(":clanreq:")) {
                boolean var306 = false;
                String var307 = var289.substring(0, var289.indexOf(":"));
                long var308 = class83.method608(var307, (byte) -55);
                for (int var310 = 0; var310 < class162.field2640; var310++) {
                    if (class316.field4982[var310] == var308) {
                        var306 = true;
                        break;
                    }
                }
                if (!var306 && class231.field3610 == 0) {
                    class131.method971(var307, (byte) -32, 16, "");
                }
            } else if (var289.endsWith(":allyreq:")) {
                String var311 = var289.substring(0, var289.indexOf(":"));
                long var312 = class83.method608(var311, (byte) -54);
                boolean var314 = false;
                for (int var315 = 0; var315 < class162.field2640; var315++) {
                    if (class316.field4982[var315] == var312) {
                        var314 = true;
                        break;
                    }
                }
                if (!var314 && class231.field3610 == 0) {
                    String var316 = var289.substring(var289.indexOf(":") + 1, var289.length() + -9);
                    class131.method971(var311, (byte) -32, 21, var316);
                }
            } else {
                class131.method971("", (byte) -32, 0, var289);
            }
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 155) {
            long var285 = class111.field1544.method37(-1513731168);
            int var287 = class111.field1544.method39((byte) 124);
            String var288 = class142.method1059(-78, var287).method2231(class111.field1544, 80);
            class214.method1563(19, (String) null, (byte) -37, var288, class154.method1118(arg0 + 110, var285), var287);
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 152) {
            int var50 = class111.field1544.method72((byte) -66);
            int var51 = class111.field1544.method68(-4325);
            byte var52 = class111.field1544.method77(2);
            if (class60.method499(0, var50)) {
                class135.method986((byte) -90, var51, var52);
            }
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 233) {
            int var53 = class111.field1544.method58(-288140008);
            if (class111.field1544.method58(-288140008) == 0) {
                class47.field611[var53] = new class306();
            } else {
                class111.field1544.field111--;
                class47.field611[var53] = new class306(class111.field1544);
            }
            class251.field3955 = class220.field3487;
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 24) {
            int var281 = class111.field1544.method89(112);
            int var282 = class111.field1544.method72((byte) -66);
            int var283 = class111.field1544.method58(-288140008);
            class212 var284 = class59.field870[var282];
            if (var284 != null) {
                class134.method980(var283, false, var281, var284);
            }
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 106) {
            int var54 = class111.field1544.method39((byte) 112);
            int var55 = class111.field1544.method89(90);
            if (var54 == 65535) {
                var54 = -1;
            }
            int var56 = class111.field1544.method90((byte) -52);
            if (class60.method499(0, var55)) {
                class123.method904(var54, -1, arg0 ^ 0x78, 2, var56);
            }
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 21) {
            int var57 = class111.field1544.method39((byte) 95);
            String var58 = class111.field1544.method40(false);
            Object[] var59 = new Object[var58.length() + 1];
            for (int var60 = var58.length() - 1; var60 >= 0; var60--) {
                if (var58.charAt(var60) == 's') {
                    var59[var60 + 1] = class111.field1544.method40(false);
                } else {
                    var59[var60 + 1] = Integer.valueOf(class111.field1544.method73((byte) 19));
                }
            }
            var59[0] = Integer.valueOf(class111.field1544.method73((byte) 19));
            if (class60.method499(0, var57)) {
                class15 var61 = new class15();
                var61.field243 = var59;
                class172.method1282(var61, (byte) 73);
            }
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 190) {
            int var277 = class111.field1544.method85(1);
            String var278 = class111.field1544.method40(false);
            int var279 = class111.field1544.method58(-288140008);
            int var280 = class111.field1544.method89(109);
            if (var280 == 65535) {
                var280 = -1;
            }
            if (var277 >= 1 && var277 <= 8) {
                if (var278.equalsIgnoreCase("null")) {
                    var278 = null;
                }
                class259.field4079[var277 - 1] = var278;
                class105.field1387[var277 - 1] = var280;
                class255.field4032[var277 - 1] = var279 == 0;
            }
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 158) {
            class20.field306 = class111.field1544.method58(-288140008);
            class294.field4555 = class220.field3487;
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 5) {
            int var273 = class111.field1544.method58(arg0 ^ 0xEED3551A);
            int var274 = var273 & 0x1F;
            int var275 = var273 >> 5;
            if (var274 == 0) {
                class287.field4436[var275] = null;
                class30.field449 = -1;
                return true;
            }
            class182 var276 = new class182();
            var276.field2954 = var274;
            var276.field2954 = var273 & 0x3F;
            var276.field2963 = class111.field1544.method58(-288140008);
            if (var276.field2963 >= 0 && class163.field2644.length > var276.field2963) {
                if (var276.field2954 == 1 || var276.field2954 == 10) {
                    var276.field2951 = class111.field1544.method39((byte) 74);
                    class111.field1544.field111 += 5;
                } else if (var276.field2954 >= 2 && var276.field2954 <= 6) {
                    if (var276.field2954 == 2) {
                        var276.field2962 = 64;
                        var276.field2956 = 64;
                    }
                    if (var276.field2954 == 3) {
                        var276.field2962 = 64;
                        var276.field2956 = 0;
                    }
                    if (var276.field2954 == 4) {
                        var276.field2962 = 64;
                        var276.field2956 = 128;
                    }
                    if (var276.field2954 == 5) {
                        var276.field2962 = 0;
                        var276.field2956 = 64;
                    }
                    if (var276.field2954 == 6) {
                        var276.field2956 = 64;
                        var276.field2962 = 128;
                    }
                    var276.field2954 = 2;
                    var276.field2953 = class111.field1544.method39((byte) 115);
                    var276.field2949 = class111.field1544.method39((byte) 100);
                    var276.field2958 = class111.field1544.method58(-288140008);
                    var276.field2950 = class111.field1544.method39((byte) 82);
                }
                var276.field2961 = class111.field1544.method39((byte) 27);
                if (var276.field2961 == 65535) {
                    var276.field2961 = -1;
                }
                class287.field4436[var275] = var276;
            }
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 150) {
            class277.method1943(arg0 ^ 0x2);
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 179) {
            int var62 = class111.field1544.method72((byte) -66);
            int var63 = class111.field1544.method68(-4325);
            int var64 = class111.field1544.method68(-4325);
            int var65 = class111.field1544.method72((byte) -66);
            int var66 = class111.field1544.method90((byte) -52);
            if (class60.method499(arg0 ^ 0x2, var64)) {
                class123.method904(var63 | var65 << 16, var62, 127, 7, var66);
            }
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 23) {
            for (int var271 = 0; var271 < class284.field4403.length; var271++) {
                if (class284.field4403[var271] != null) {
                    class284.field4403[var271].field4653 = -1;
                }
            }
            for (int var272 = 0; var272 < class59.field870.length; var272++) {
                if (class59.field870[var272] != null) {
                    class59.field870[var272].field4653 = -1;
                }
            }
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 26) {
            int var67 = class111.field1544.method89(arg0 + 68);
            byte var68 = class111.field1544.method93(arg0 - 110);
            class15.method143(var67, 122, var68);
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 145) {
            class27.field407 = class220.field3487;
            long var259 = class111.field1544.method37(-1513731168);
            if (var259 == 0L) {
                class235.field3666 = null;
                class30.field449 = -1;
                class337.field5278 = null;
                class235.field3691 = null;
                class229.field3593 = 0;
                return true;
            }
            long var261 = class111.field1544.method37(arg0 - 1513731170);
            class337.field5278 = class76.method568(var261, (byte) 65);
            class235.field3691 = class76.method568(var259, (byte) -87);
            class241.field3763 = class111.field1544.method83((byte) -107);
            int var263 = class111.field1544.method58(-288140008);
            if (var263 == 255) {
                class30.field449 = -1;
                return true;
            }
            class229.field3593 = var263;
            class32[] var264 = new class32[100];
            for (int var265 = 0; var265 < class229.field3593; var265++) {
                var264[var265] = new class32();
                var264[var265].field4430 = class111.field1544.method37(arg0 - 1513731170);
                var264[var265].field470 = class76.method568(var264[var265].field4430, (byte) -74);
                var264[var265].field477 = class111.field1544.method39((byte) 27);
                var264[var265].field469 = class111.field1544.method83((byte) -91);
                var264[var265].field478 = class111.field1544.method40(false);
                if (class237.field3718 == var264[var265].field4430) {
                    class292.field4516 = var264[var265].field469;
                }
            }
            boolean var266 = false;
            int var267 = class229.field3593;
            while (var267 > 0) {
                boolean var268 = true;
                var267--;
                for (int var269 = 0; var269 < var267; var269++) {
                    if (var264[var269].field470.compareTo(var264[var269 + 1].field470) > 0) {
                        class32 var270 = var264[var269];
                        var268 = false;
                        var264[var269] = var264[var269 + 1];
                        var264[var269 + 1] = var270;
                    }
                }
                if (var268) {
                    break;
                }
            }
            class235.field3666 = var264;
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 170) {
            int var249 = class111.field1544.method95((byte) -107);
            int var250 = class111.field1544.method72((byte) -66);
            int var251 = class111.field1544.method95((byte) -107);
            int var252 = class111.field1544.method39((byte) 34);
            int var253 = class111.field1544.method68(-4325);
            if (var252 == 65535) {
                var252 = -1;
            }
            if (var253 == 65535) {
                var253 = -1;
            }
            if (class60.method499(arg0 - 2, var250)) {
                for (int var254 = var252; var254 <= var253; var254++) {
                    long var255 = ((long) var251 << 32) + (long) var254;
                    class127 var257 = (class127) class282.field4361.method2168(var255, (byte) -93);
                    class127 var258;
                    if (var257 != null) {
                        var258 = new class127(var249, var257.field1850);
                        var257.method2028(13329);
                    } else if (var254 == -1) {
                        var258 = new class127(var249, class14.method140(var251, 1036508464).field2160.field1850);
                    } else {
                        var258 = new class127(var249, -1);
                    }
                    class282.field4361.method2161(var258, var255, arg0 ^ 0xFFFFFFFD);
                }
            }
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 226) {
            int var69 = class111.field1544.method95((byte) -107);
            int var70 = class111.field1544.method68(-4325);
            if (class60.method499(arg0 ^ 0x2, var70)) {
                int var71 = 0;
                if (class146.field2310.field5264 != null) {
                    var71 = class146.field2310.field5264.method429((byte) 100);
                }
                class123.method904(var71, -1, 123, 3, var69);
            }
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 62) {
            int var242 = class111.field1544.method89(arg0 ^ 0x60);
            if (var242 == 65535) {
                var242 = -1;
            }
            int var243 = class111.field1544.method72((byte) -66);
            int var244 = class111.field1544.method90((byte) -52);
            int var245 = class111.field1544.method73((byte) 19);
            if (class60.method499(0, var243)) {
                class136 var246 = class14.method140(var244, 1036508464);
                if (var246.field2164) {
                    class291.method2035(var244, false, var245, var242);
                    class316 var247 = class149.method1092((byte) -104, var242);
                    class69.method545(0, var244, var247.field4989, var247.field5007, var247.field5002);
                    class41.method338(arg0 - 7446, var247.field5001, var247.field4965, var247.field5009, var244);
                } else if (var242 == -1) {
                    class30.field449 = -1;
                    var246.field2166 = 0;
                    return true;
                } else {
                    class316 var248 = class149.method1092((byte) -104, var242);
                    var246.field2096 = var248.field5007;
                    var246.field2168 = var248.field4989 * 100 / var245;
                    var246.field2145 = var248.field5002;
                    var246.field2117 = var242;
                    var246.field2166 = 4;
                    class167.method1250(var246, 412);
                }
            }
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 137) {
            int var236 = class111.field1544.method39((byte) 93);
            int var237 = class111.field1544.method58(-288140008);
            int var238 = class111.field1544.method58(-288140008);
            int var239 = class111.field1544.method39((byte) 38);
            int var240 = class111.field1544.method58(-288140008);
            int var241 = class111.field1544.method58(-288140008);
            if (class60.method499(0, var236)) {
                class294.method2052(var237, var240, arg0 - 6, var238, var241, var239);
            }
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 112) {
            int var226 = class111.field1544.method68(-4325);
            if (var226 == 65535) {
                var226 = -1;
            }
            int var227 = class111.field1544.method68(-4325);
            int var228 = class111.field1544.method72((byte) -66);
            int var229 = class111.field1544.method68(-4325);
            int var230 = class111.field1544.method90((byte) -52);
            if (var229 == 65535) {
                var229 = -1;
            }
            if (class60.method499(arg0 ^ 0x2, var227)) {
                for (int var231 = var229; var231 <= var226; var231++) {
                    long var232 = ((long) var230 << 32) + (long) var231;
                    class127 var234 = (class127) class282.field4361.method2168(var232, (byte) -107);
                    class127 var235;
                    if (var234 != null) {
                        var235 = new class127(var234.field1843, var228);
                        var234.method2028(13329);
                    } else if (var231 == -1) {
                        var235 = new class127(class14.method140(var230, 1036508464).field2160.field1843, var228);
                    } else {
                        var235 = new class127(0, var228);
                    }
                    class282.field4361.method2161(var235, var232, arg0 ^ 0xFFFFFFFD);
                }
            }
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 254) {
            int var220 = class111.field1544.method39((byte) 119);
            int var221 = class111.field1544.method58(arg0 - 288140010);
            int var222 = class111.field1544.method58(-288140008);
            int var223 = class111.field1544.method58(-288140008);
            int var224 = class111.field1544.method58(-288140008);
            int var225 = class111.field1544.method39((byte) 39);
            if (class60.method499(0, var220)) {
                class130.field1918[var221] = true;
                class72.field1003[var221] = var222;
                class57.field790[var221] = var223;
                class11.field205[var221] = var224;
                class311.field4856[var221] = var225;
            }
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 201) {
            if (class61.field899 == 0) {
                class61.field895 = class6.field125;
            } else {
                class61.field895 = class111.field1544.method40(false);
            }
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 247) {
            long var72 = class111.field1544.method37(arg0 - 1513731170);
            String var74 = class321.method2255(class237.method1700(class158.method1147(class111.field1544, -8748), 2));
            class131.method971(class154.method1118(118, var72), (byte) -32, 6, var74);
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 32) {
            String var217 = class111.field1544.method40(false);
            int var218 = class111.field1544.method73((byte) 19);
            int var219 = class111.field1544.method72((byte) -66);
            if (class60.method499(0, var219)) {
                class257.method1859(3, var217, var218);
            }
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 66) {
            int var214 = class111.field1544.method92(-2697);
            int var215 = class111.field1544.method72((byte) -66);
            int var216 = class111.field1544.method46(-28944);
            if (class60.method499(0, var215)) {
                class1.method3((byte) 17, var216, var214);
            }
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 55) {
            class325.method2286(-99);
            int var210 = class111.field1544.method38(66);
            int var211 = class111.field1544.method42((byte) 75);
            int var212 = class111.field1544.method95((byte) -107);
            class79.field1084[var211] = var212;
            class206.field3262[var211] = var210;
            class15.field252[var211] = 1;
            for (int var213 = 0; var213 < 98; var213++) {
                if (class244.field3810[var213] <= var212) {
                    class15.field252[var211] = var213 + 2;
                }
            }
            class311.field4855[class333.method2319(class333.field5193++, 31)] = var211;
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 252) {
            class325.method2286(92);
            class111.field1550 = class111.field1544.method58(-288140008);
            class30.field449 = -1;
            class43.field591 = class220.field3487;
            return true;
        } else if (class30.field449 == 123) {
            int var205 = class111.field1544.method39((byte) 37);
            int var206 = class111.field1544.method72((byte) -66);
            int var207 = class111.field1544.method73((byte) 19);
            int var208 = class111.field1544.method72((byte) -66);
            int var209 = class111.field1544.method89(118);
            if (class60.method499(0, var205)) {
                class69.method545(arg0 - 2, var207, var208, var209, var206);
            }
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 50) {
            class30.field449 = -1;
            class121.field1751 = 0;
            return true;
        } else if (class30.field449 == 219) {
            long var191 = class111.field1544.method37(arg0 - 1513731170);
            boolean var193 = false;
            int var194 = class111.field1544.method39((byte) 57);
            if ((Long.MIN_VALUE & var191) != 0L) {
                var193 = true;
            }
            byte var195 = class111.field1544.method83((byte) -108);
            if (var193) {
                if (class229.field3593 == 0) {
                    class30.field449 = -1;
                    return true;
                }
                boolean var201 = false;
                long var202 = var191 & Long.MAX_VALUE;
                int var204;
                for (var204 = 0; class229.field3593 > var204 && (class235.field3666[var204].field4430 != var202 || class235.field3666[var204].field477 != var194); var204++) {
                }
                if (var204 < class229.field3593) {
                    while ((class229.field3593 - 1) > var204) {
                        class235.field3666[var204] = class235.field3666[var204 + 1];
                        var204++;
                    }
                    class229.field3593--;
                    class235.field3666[class229.field3593] = null;
                }
            } else {
                String var196 = class111.field1544.method40(false);
                class32 var197 = new class32();
                var197.field4430 = var191;
                var197.field470 = class76.method568(var197.field4430, (byte) 72);
                var197.field478 = var196;
                var197.field469 = var195;
                var197.field477 = var194;
                int var198;
                for (var198 = class229.field3593 - 1; var198 >= 0; var198--) {
                    int var199 = class235.field3666[var198].field470.compareTo(var197.field470);
                    if (var199 == 0) {
                        class235.field3666[var198].field477 = var194;
                        class235.field3666[var198].field469 = var195;
                        class235.field3666[var198].field478 = var196;
                        if (class237.field3718 == var191) {
                            class292.field4516 = var195;
                        }
                        class30.field449 = -1;
                        class27.field407 = class220.field3487;
                        return true;
                    }
                    if (var199 < 0) {
                        break;
                    }
                }
                if (class235.field3666.length <= class229.field3593) {
                    class30.field449 = -1;
                    return true;
                }
                for (int var200 = class229.field3593 - 1; var200 > var198; var200--) {
                    class235.field3666[var200 + 1] = class235.field3666[var200];
                }
                if (class229.field3593 == 0) {
                    class235.field3666 = new class32[100];
                }
                class235.field3666[var198 + 1] = var197;
                if (class237.field3718 == var191) {
                    class292.field4516 = var195;
                }
                class229.field3593++;
            }
            class30.field449 = -1;
            class27.field407 = class220.field3487;
            return true;
        } else if (class30.field449 == 243) {
            int var75 = class111.field1544.method73((byte) 19);
            int var76 = class111.field1544.method39((byte) 113);
            if (var75 < -70000) {
                var76 += 32768;
            }
            class136 var77;
            if (var75 >= 0) {
                var77 = class14.method140(var75, 1036508464);
            } else {
                var77 = null;
            }
            if (var77 != null) {
                for (int var78 = 0; var78 < var77.field2146.length; var78++) {
                    var77.field2146[var78] = 0;
                    var77.field1992[var78] = 0;
                }
            }
            class96.method682((byte) -25, var76);
            int var79 = class111.field1544.method39((byte) 89);
            for (int var80 = 0; var80 < var79; var80++) {
                int var81 = class111.field1544.method39((byte) 62);
                int var82 = class111.field1544.method85(1);
                if (var82 == 255) {
                    var82 = class111.field1544.method92(arg0 - 2699);
                }
                if (var77 != null && var80 < var77.field2146.length) {
                    var77.field2146[var80] = var81;
                    var77.field1992[var80] = var82;
                }
                class62.method507(var76, arg0 - 30346, var80, var82, var81 - 1);
            }
            if (var77 != null) {
                class167.method1250(var77, 412);
            }
            class325.method2286(121);
            class334.field5200[class333.method2319(class170.field2804++, 31)] = class333.method2319(var76, 32767);
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 237) {
            int var189 = class111.field1544.method95((byte) -107);
            int var190 = class111.field1544.method89(91);
            class195.method1452(var189, var190, -47);
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 242) {
            class123.method903(arg0 ^ 0x2);
            class325.method2286(-94);
            class30.field449 = -1;
            class2.field21 += 32;
            return true;
        } else if (class30.field449 == 181) {
            class164.field2657 = class111.field1544.method58(-288140008);
            class345.field5353 = class111.field1544.method58(-288140008);
            class156.field2411 = class111.field1544.method58(arg0 - 288140010);
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 78) {
            class282.field4362 = class111.field1544.method42((byte) 10);
            class120.field1673 = class111.field1544.method58(-288140008);
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 1) {
            int var83 = class111.field1544.method42((byte) 12);
            int var84 = class111.field1544.method39((byte) 106);
            if (class60.method499(0, var84)) {
                class200.field3202 = var83;
            }
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 195) {
            long var170 = class111.field1544.method37(arg0 - 1513731170);
            int var172 = class111.field1544.method39((byte) 81);
            int var173 = class111.field1544.method58(-288140008);
            boolean var174 = true;
            String var175 = "";
            if (var170 < 0L) {
                var174 = false;
                var170 &= Long.MAX_VALUE;
            }
            if (var172 > 0) {
                var175 = class111.field1544.method40(false);
            }
            String var176 = class154.method1118(122, var170);
            for (int var177 = 0; var177 < class301.field4626; var177++) {
                if (class23.field352[var177] == var170) {
                    if (class99.field1336[var177] != var172) {
                        class99.field1336[var177] = var172;
                        if (var172 > 0) {
                            class131.method971("", (byte) -32, 5, var176 + class291.field4485);
                        }
                        if (var172 == 0) {
                            class131.method971("", (byte) -32, 5, var176 + class159.field2514);
                        }
                    }
                    class166.field2736[var177] = var175;
                    class270.field4195[var177] = var173;
                    class11.field202[var177] = var174;
                    var176 = null;
                    break;
                }
            }
            if (var176 != null && class301.field4626 < 200) {
                class23.field352[class301.field4626] = var170;
                class55.field768[class301.field4626] = var176;
                class99.field1336[class301.field4626] = var172;
                class166.field2736[class301.field4626] = var175;
                class270.field4195[class301.field4626] = var173;
                class11.field202[class301.field4626] = var174;
                class301.field4626++;
            }
            class294.field4555 = class220.field3487;
            boolean var178 = false;
            int var179 = class301.field4626;
            while (var179 > 0) {
                boolean var180 = true;
                var179--;
                for (int var181 = 0; var181 < var179; var181++) {
                    if (class99.field1336[var181] != class271.field4209 && class99.field1336[var181 + 1] == class271.field4209 || class99.field1336[var181] == 0 && class99.field1336[var181 + 1] != 0) {
                        var180 = false;
                        int var182 = class99.field1336[var181];
                        class99.field1336[var181] = class99.field1336[var181 + 1];
                        class99.field1336[var181 + 1] = var182;
                        String var183 = class166.field2736[var181];
                        class166.field2736[var181] = class166.field2736[var181 + 1];
                        class166.field2736[var181 + 1] = var183;
                        String var184 = class55.field768[var181];
                        class55.field768[var181] = class55.field768[var181 + 1];
                        class55.field768[var181 + 1] = var184;
                        long var185 = class23.field352[var181];
                        class23.field352[var181] = class23.field352[var181 + 1];
                        class23.field352[var181 + 1] = var185;
                        int var187 = class270.field4195[var181];
                        class270.field4195[var181] = class270.field4195[var181 + 1];
                        class270.field4195[var181 + 1] = var187;
                        boolean var188 = class11.field202[var181];
                        class11.field202[var181] = class11.field202[var181 + 1];
                        class11.field202[var181 + 1] = var188;
                    }
                }
                if (var180) {
                    break;
                }
            }
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 97) {
            if (class147.field2321 != -1) {
                class72.method555(0, -111, class147.field2321);
            }
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 14) {
            class111.field1544.field111 += 28;
            if (class111.field1544.method79((byte) 47)) {
                class224.method1634(class111.field1544.field111 - 28, class111.field1544, (byte) -64);
            }
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 206) {
            class325.method2286(-124);
            class175.field2875 = class111.field1544.method78((byte) -13);
            class43.field591 = class220.field3487;
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 102) {
            class162.field2640 = class61.field899 / 8;
            for (int var85 = 0; var85 < class162.field2640; var85++) {
                class316.field4982[var85] = class111.field1544.method37(-1513731168);
                class281.field4349[var85] = class123.method900(512, class316.field4982[var85]);
                class214.field3385[var85] = false;
            }
            class294.field4555 = class220.field3487;
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 49) {
            int var86 = class111.field1544.method39((byte) 46);
            if (var86 == 65535) {
                var86 = -1;
            }
            int var87 = class111.field1544.method58(-288140008);
            int var88 = class111.field1544.method39((byte) 125);
            int var89 = class111.field1544.method58(-288140008);
            class234.method1681(var89, var86, (byte) 39, var87, var88);
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 222) {
            long var90 = class111.field1544.method37(-1513731168);
            class111.field1544.method83((byte) -109);
            long var92 = class111.field1544.method37(arg0 ^ 0xA5C64BA2);
            long var94 = (long) class111.field1544.method39((byte) 48);
            long var96 = (long) class111.field1544.method31(-22888);
            long var98 = (var94 << 32) + var96;
            boolean var100 = false;
            int var101 = class111.field1544.method58(-288140008);
            int var102 = 0;
            label1307: while (true) {
                if (var102 >= 100) {
                    if (var101 <= 1) {
                        if ((!class336.field5241 || class26.field392) && !class83.field1136) {
                            for (int var103 = 0; var103 < class162.field2640; var103++) {
                                if (class316.field4982[var103] == var90) {
                                    var100 = true;
                                    break label1307;
                                }
                            }
                        } else {
                            var100 = true;
                        }
                    }
                    break;
                }
                if (class325.field5103[var102] == var98) {
                    var100 = true;
                    break;
                }
                var102++;
            }
            if (!var100 && class231.field3610 == 0) {
                class325.field5103[class224.field3539] = var98;
                class224.field3539 = (class224.field3539 + 1) % 100;
                String var104 = class321.method2255(class237.method1700(class158.method1147(class111.field1544, -8748), arg0 ^ 0x0));
                if (var101 == 2 || var101 == 3) {
                    class175.method1291(class154.method1118(123, var92), "<img=1>" + class154.method1118(114, var90), 9, -112, var104);
                } else if (var101 == 1) {
                    class175.method1291(class154.method1118(110, var92), "<img=0>" + class154.method1118(113, var90), 9, -89, var104);
                } else {
                    class175.method1291(class154.method1118(126, var92), class154.method1118(125, var90), 9, -81, var104);
                }
            }
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 144) {
            long var157 = class111.field1544.method37(arg0 ^ 0xA5C64BA2);
            long var159 = (long) class111.field1544.method39((byte) 54);
            long var161 = (long) class111.field1544.method31(-22888);
            int var163 = class111.field1544.method58(-288140008);
            long var164 = (var159 << 32) + var161;
            boolean var166 = false;
            int var167 = 0;
            label1410: while (true) {
                if (var167 >= 100) {
                    if (var163 <= 1) {
                        if ((!class336.field5241 || class26.field392) && !class83.field1136) {
                            for (int var168 = 0; var168 < class162.field2640; var168++) {
                                if (class316.field4982[var168] == var157) {
                                    var166 = true;
                                    break label1410;
                                }
                            }
                        } else {
                            var166 = true;
                        }
                    }
                    break;
                }
                if (class325.field5103[var167] == var164) {
                    var166 = true;
                    break;
                }
                var167++;
            }
            if (!var166 && class231.field3610 == 0) {
                class325.field5103[class224.field3539] = var164;
                class224.field3539 = (class224.field3539 + 1) % 100;
                String var169 = class321.method2255(class237.method1700(class158.method1147(class111.field1544, -8748), arg0 ^ 0x0));
                if (var163 == 2 || var163 == 3) {
                    class131.method971("<img=1>" + class154.method1118(116, var157), (byte) -32, 7, var169);
                } else if (var163 == 1) {
                    class131.method971("<img=0>" + class154.method1118(111, var157), (byte) -32, 7, var169);
                } else {
                    class131.method971(class154.method1118(127, var157), (byte) -32, 3, var169);
                }
            }
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 154) {
            class305.method2112((byte) -70);
            class30.field449 = -1;
            return false;
        } else if (class30.field449 == 65) {
            int var156 = class111.field1544.method39((byte) 119);
            if (class60.method499(0, var156)) {
                class304.method2110(arg0 ^ 0x5E);
            }
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 188) {
            int var105 = class111.field1544.method39((byte) 30);
            if (class60.method499(0, var105)) {
                class214.method1565(1);
            }
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 82) {
            for (int var106 = 0; var106 < class220.field3477.length; var106++) {
                if (class256.field4046[var106] != class220.field3477[var106]) {
                    class220.field3477[var106] = class256.field4046[var106];
                    class136.method990(var106, 4268);
                    class107.field1442[class333.method2319(31, class2.field21++)] = var106;
                }
            }
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 111) {
            int var107 = class111.field1544.method72((byte) -66);
            int var108 = class111.field1544.method39((byte) 116);
            int var109 = class111.field1544.method92(-2697);
            if (class60.method499(arg0 ^ 0x2, var108)) {
                class130.method961(var109, var107, 6);
            }
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 223) {
            int var153 = class111.field1544.method39((byte) 64);
            int var154 = class111.field1544.method73((byte) 19);
            int var155 = class111.field1544.method39((byte) 42);
            if (class60.method499(0, var153)) {
                class241.method1719(var154, 111, var155);
            }
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 110) {
            class5.field59 = class111.field1544.method68(-4325) * 30;
            class30.field449 = -1;
            class43.field591 = class220.field3487;
            return true;
        } else if (class30.field449 == 58) {
            class282.field4362 = class111.field1544.method42((byte) 30);
            class120.field1673 = class111.field1544.method58(-288140008);
            while (class61.field899 > class111.field1544.field111) {
                class30.field449 = class111.field1544.method58(arg0 ^ 0xEED3551A);
                class78.method579((byte) 103);
            }
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 67) {
            class5.method17((byte) 68);
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 192) {
            int var110 = class111.field1544.method95((byte) -107);
            int var111 = class111.field1544.method42((byte) 9);
            int var112 = class111.field1544.method68(arg0 - 4327);
            if (class60.method499(arg0 - 2, var112)) {
                class339.method2353(var110, (byte) -86, var111);
            }
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 51) {
            class85.method618(class111.field1544.method40(false), -117);
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 138) {
            int var113 = class111.field1544.method89(arg0 + 91);
            int var114 = class111.field1544.method39((byte) 41);
            int var115 = class111.field1544.method72((byte) -66);
            if (class60.method499(0, var114)) {
                class286.method2020(var115, true, var113);
            }
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 184) {
            int var147 = class111.field1544.method39((byte) 43);
            int var148 = class111.field1544.method58(-288140008);
            int var149 = class111.field1544.method58(-288140008);
            int var150 = class111.field1544.method39((byte) 99);
            int var151 = class111.field1544.method58(-288140008);
            int var152 = class111.field1544.method58(-288140008);
            if (class60.method499(arg0 ^ 0x2, var147)) {
                class267.method1899(var151, var148, var150, var152, 115, true, var149);
            }
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 109) {
            int var145 = class111.field1544.method38(126);
            int var146 = class111.field1544.method89(92);
            if (var146 == 65535) {
                var146 = -1;
            }
            class84.method612(var146, (byte) -95, var145);
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 105) {
            int var116 = class111.field1544.method85(1);
            int var117 = class111.field1544.method31(-22888);
            int var118 = class111.field1544.method89(114);
            if (var118 == 65535) {
                var118 = -1;
            }
            class21.method210(89, var117, var118, var116);
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 209) {
            class213.method1557(true, 0);
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 125) {
            int var138 = class111.field1544.method95((byte) -107);
            int var139 = class111.field1544.method72((byte) -66);
            int var140 = class111.field1544.method92(-2697);
            if (class60.method499(0, var139)) {
                class25 var141 = (class25) class210.field3304.method2168((long) var140, (byte) -128);
                class25 var142 = (class25) class210.field3304.method2168((long) var138, (byte) -128);
                if (var142 != null) {
                    class6.method86(var141 == null || var141.field376 != var142.field376, var142, false);
                }
                if (var141 != null) {
                    var141.method2028(13329);
                    class210.field3304.method2161(var141, (long) var138, -1);
                }
                class136 var143 = class14.method140(var140, 1036508464);
                if (var143 != null) {
                    class167.method1250(var143, 412);
                }
                class136 var144 = class14.method140(var138, 1036508464);
                if (var144 != null) {
                    class167.method1250(var144, 412);
                    class82.method602((byte) 65, var144, true);
                }
                if (class147.field2321 != -1) {
                    class72.method555(1, -92, class147.field2321);
                }
            }
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 124) {
            int var136 = class111.field1544.method58(-288140008);
            int var137 = class111.field1544.method72((byte) -66);
            class195.method1452(var136, var137, 125);
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 198) {
            int var135 = class111.field1544.method68(-4325);
            class161.method1196((byte) -128, var135);
            class334.field5200[class333.method2319(31, class170.field2804++)] = class333.method2319(var135, 32767);
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 44) {
            int var119 = class111.field1544.method90((byte) -52);
            class136 var120 = class14.method140(var119, 1036508464);
            for (int var121 = 0; var121 < var120.field2146.length; var121++) {
                var120.field2146[var121] = -1;
                var120.field2146[var121] = 0;
            }
            class167.method1250(var120, 412);
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 151) {
            int var132 = class111.field1544.method73((byte) 19);
            int var133 = class111.field1544.method72((byte) -66);
            int var134 = class111.field1544.method68(-4325);
            if (class60.method499(0, var133)) {
                class135.method986((byte) -98, var134, var132);
            }
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 117) {
            int var122 = class111.field1544.method39((byte) 113);
            int var123 = class111.field1544.method73((byte) 19);
            if (class60.method499(0, var122)) {
                class25 var124 = (class25) class210.field3304.method2168((long) var123, (byte) -98);
                if (var124 != null) {
                    class6.method86(true, var124, false);
                }
                if (class237.field3723 != null) {
                    class167.method1250(class237.field3723, 412);
                    class237.field3723 = null;
                }
            }
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 255) {
            class120.field1673 = class111.field1544.method38(70);
            class282.field4362 = class111.field1544.method85(1);
            for (int var129 = class120.field1673; var129 < (class120.field1673 + 8); var129++) {
                for (int var130 = class282.field4362; var130 < class282.field4362 + 8; var130++) {
                    if (class304.field4750[class154.field2392][var129][var130] != null) {
                        class304.field4750[class154.field2392][var129][var130] = null;
                        class68.method537(-128, var130, var129);
                    }
                }
            }
            for (class197 var131 = (class197) class68.field959.method22((byte) 117); var131 != null; var131 = (class197) class68.field959.method26((byte) -121)) {
                if (var131.field3158 >= class120.field1673 && var131.field3158 < (class120.field1673 + 8) && class282.field4362 <= var131.field3149 && class282.field4362 + 8 > var131.field3149 && class154.field2392 == var131.field3155) {
                    var131.field3142 = 0;
                }
            }
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 232) {
            int var125 = class111.field1544.method78((byte) -113);
            int var126 = class111.field1544.method78((byte) -29);
            int var127 = class111.field1544.method89(109);
            int var128 = class111.field1544.method92(-2697);
            if (class60.method499(0, var127)) {
                class117.method832(var125, var128, (byte) 94, var126);
            }
            class30.field449 = -1;
            return true;
        } else if (class30.field449 == 101) {
            class169.method1272(class42.field581, class61.field899, arg0 - 130, class111.field1544);
            class30.field449 = -1;
            return true;
        } else {
            client.method949("T1 - " + class30.field449 + "," + class326.field5120 + "," + class68.field958 + " - " + class61.field899, (Throwable) null, 24);
            class305.method2112((byte) -62);
            return true;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIIIB)V", line = 2956)
    public static final void method1504(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        class256.method1853(class284.field4402[arg3], arg1 - arg0, arg2, arg0 + arg1, 0);
        if (arg4 > -4) {
            return;
        }
        int var5 = arg0;
        int var6 = -arg0;
        field3236++;
        int var7 = 0;
        int var8 = -1;
        while (var7 < var5) {
            var8 += 2;
            var6 += var8;
            var7++;
            if (var6 >= 0) {
                var5--;
                int[] var9 = class284.field4402[arg3 + var5];
                int[] var10 = class284.field4402[arg3 - var5];
                int var11 = arg1 - var7;
                int var12 = arg1 + var7;
                var6 -= var5 << 1;
                class256.method1853(var9, var11, arg2, var12, 0);
                class256.method1853(var10, var11, arg2, var12, 0);
            }
            int var13 = arg1 - var5;
            int[] var14 = class284.field4402[arg3 + var7];
            int var15 = arg1 + var5;
            int[] var16 = class284.field4402[arg3 - var7];
            class256.method1853(var14, var13, arg2, var15, 0);
            class256.method1853(var16, var13, arg2, var15, 0);
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lci;B)V", line = 3005)
    public static final void method1505(class201 arg0, byte arg1) {
        short var2 = 256;
        for (int var3 = 0; var3 < class224.field3556.length; var3++) {
            class224.field3556[var3] = 0;
        }
        for (int var4 = 0; var4 < 5000; var4++) {
            int var5 = (int) (Math.random() * 128.0D * (double) var2);
            class224.field3556[var5] = (int) (Math.random() * 284.0D);
        }
        if (arg1 != 78) {
            return;
        }
        field3230++;
        for (int var6 = 0; var6 < 20; var6++) {
            for (int var7 = 1; var7 < (var2 - 1); var7++) {
                for (int var8 = 1; var8 < 127; var8++) {
                    int var9 = (var7 << 7) + var8;
                    class199.field3177[var9] = (class224.field3556[var9 + 1] + class224.field3556[var9 - 128] + class224.field3556[var9 + 128] + class224.field3556[var9 + -1]) / 4;
                }
            }
            int[] var10 = class224.field3556;
            class224.field3556 = class199.field3177;
            class199.field3177 = var10;
        }
        if (arg0 == null) {
            return;
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg0.field290; var12++) {
            for (int var13 = 0; var13 < arg0.field297; var13++) {
                if (arg0.field3212[var11++] != 0) {
                    int var14 = arg0.field298 + var13 + 16;
                    int var15 = arg0.field296 + var12 + 16;
                    int var16 = (var15 << 7) + var14;
                    class224.field3556[var16] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "(III)J", line = 3103)
    public static final long method1506(int arg0, int arg1, int arg2) {
        class124 var3 = class83.field1138[arg0][arg1][arg2];
        return var3 == null || var3.field1775 == null ? 0L : var3.field1775.field1364;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(II)[I", line = 3117)
    public final int[] method103(int arg0, int arg1) {
        field3238++;
        if (arg0 >= -25) {
            return (int[]) null;
        }
        int[] var3 = this.field5112.method1648(arg1, -16687);
        if (this.field5112.field3583) {
            int var4 = class34.field508[arg1];
            for (int var5 = 0; var5 < class166.field2731; var5++) {
                int var6 = class110.field1527[var5];
                if (this.field3235 < var6 && var6 < 4096 - this.field3235 && var4 > (2048 - this.field3235) && (this.field3235 + 2048) > var4) {
                    int var7 = 2048 - var6;
                    int var8 = var7 < 0 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (2048 - this.field3235);
                    var3[var5] = 4096 - var10;
                } else if (var6 > (2048 - this.field3235) && var6 < (this.field3235 + 2048)) {
                    int var11 = var4 - 2048;
                    int var12 = var11 >= 0 ? var11 : -var11;
                    int var13 = var12 - this.field3235;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (2048 - this.field3235);
                } else if (var4 < this.field3235 || (4096 - this.field3235) < var4) {
                    int var19 = var6 - 2048;
                    int var20 = var19 >= 0 ? var19 : -var19;
                    int var21 = var20 - this.field3235;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field3235);
                } else if (this.field3235 <= var6 && var6 <= 4096 - this.field3235) {
                    var3[var5] = 0;
                } else {
                    int var15 = 2048 - var4;
                    int var16 = var15 < 0 ? -var15 : var15;
                    int var17 = var16 << 12;
                    int var18 = var17 / (2048 - this.field3235);
                    var3[var5] = 4096 - var18;
                }
            }
        }
        return var3;
    }
}
