import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class247 {

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "[I")
    public static int[] field3483;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "[[B")
    public static byte[][] field3482;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Ljava/lang/String;Z)I")
    public static final int method1502(String arg0, boolean arg1) {
        field3477++;
        if (arg0 == null) {
            return -1;
        } else if (arg1) {
            for (int var2 = 0; var2 < class3.field25; var2++) {
                if (arg0.equalsIgnoreCase(class150.field1823[var2])) {
                    return var2;
                }
            }
            return -1;
        } else {
            return -109;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ILab;ILcr;Ljava/lang/String;IIBLhg;ILbg;I)V")
    public static final void method1503(int arg0, class256 arg1, int arg2, class206 arg3, String arg4, int arg5, int arg6, byte arg7, class313 arg8, int arg9, class406 arg10, int arg11) {
        int var12 = -22 % ((arg7 + 27) / 40);
        field3484++;
        int var13;
        if (class358.field5167 == 4) {
            var13 = (int) class349.field5021 & 0x3FFF;
        } else {
            var13 = (int) class349.field5021 + class367.field5251 & 0x3FFF;
        }
        int var14 = Math.max(arg1.field3597 / 2, arg1.field3707 / 2) + 10;
        int var15 = arg2 * arg2 + arg11 * arg11;
        if (var14 * var14 < var15) {
            return;
        }
        int var16 = class16.field212[var13];
        int var17 = class16.field214[var13];
        if (class358.field5167 != 4) {
            var16 = var16 * 256 / (class415.field6000 + 256);
            var17 = var17 * 256 / (class415.field6000 + 256);
        }
        int var18 = arg2 * var16 + arg11 * var17 >> 15;
        int var19 = arg2 * var17 - (arg11 * var16) >> 15;
        int var20 = arg10.method2425((byte) -119, 100, (class395[]) null, arg4);
        int var21 = var18 - var20 / 2;
        int var22 = arg10.method2416((class395[]) null, arg4, 100, -7563, 0);
        if (var21 >= -arg1.field3597 && arg1.field3597 >= var21 && -arg1.field3707 <= var19 && arg1.field3707 >= var19) {
            arg3.method1139(0, arg8, arg9 + arg1.field3707 / 2 - arg0 - var22 - var19, (int[]) null, 1, arg5, var20, 0, arg9, (class395[]) null, arg1.field3597 / 2 + arg5 + var21, arg4, 0, 0, 50, arg6);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IBLve;ILcj;)V")
    public static final void method1504(int arg0, byte arg1, class331 arg2, int arg3, class198 arg4) {
        field3479++;
        byte var5 = -1;
        if ((arg0 & 0x8) != 0) {
            int var6 = arg2.method885(true);
            int var7 = arg2.method896(arg1 ^ 0xFFFFCCBE);
            arg4.method1016(var6, var7, (byte) 106, class204.field2796);
            arg4.field2469 = class204.field2796 + 300;
            arg4.field2468 = arg2.method940((byte) 61);
        }
        if ((arg0 & 0x200) != 0) {
            arg4.field2473 = arg2.method907(-27652);
            if (arg4.field2473.charAt(0) == '~') {
                arg4.field2473 = arg4.field2473.substring(1);
                class231.method1278(2, arg4.method1085(-83, false), arg1 - 26429, 0, arg4.method1084(true, -123), arg4.field2473);
            } else if (class19.field258 == arg4) {
                class231.method1278(2, arg4.method1085(96, false), -26526, 0, arg4.method1084(true, 122), arg4.field2473);
            }
            arg4.field2515 = 0;
            arg4.field2486 = 150;
            arg4.field2471 = 0;
        }
        if ((arg0 & 0x40) != 0) {
            arg4.field2747 = arg2.method916(21933);
            if (arg4.field2538 == 0) {
                arg4.method1013(arg4.field2747, (byte) 102);
                arg4.field2747 = -1;
            }
        }
        if ((arg0 & 0x20) != 0) {
            class188.field2556[arg3] = arg2.method922(32429);
        }
        if ((arg0 & 0x2) != 0) {
            int var8 = arg2.method882((byte) -117);
            if (var8 == 65535) {
                var8 = -1;
            }
            arg4.field2511 = var8;
        }
        if ((arg0 & 0x100) != 0) {
            arg4.field2462 = arg2.method905(true);
            arg4.field2479 = arg2.method905(true);
            arg4.field2463 = arg2.method926((byte) -122);
            arg4.field2484 = arg2.method905(true);
            arg4.field2509 = arg2.method916(21933) + class204.field2796;
            arg4.field2508 = arg2.method930(255) + class204.field2796;
            arg4.field2460 = arg2.method886((byte) 117);
            if (arg4.field2720 == -1) {
                arg4.field2462 += arg4.field2539[0];
                arg4.field2479 += arg4.field2536[0];
                arg4.field2484 += arg4.field2536[0];
                arg4.field2538 = 1;
                arg4.field2463 += arg4.field2539[0];
            } else {
                arg4.field2462 += arg4.field2720;
                arg4.field2484 += arg4.field2729;
                arg4.field2479 += arg4.field2729;
                arg4.field2463 += arg4.field2720;
                arg4.field2538 = 0;
            }
            arg4.field2537 = 0;
        }
        if ((arg0 & 0x400) != 0) {
            int var9 = arg2.method882((byte) -126);
            int var10 = arg2.method908(-124);
            if (var9 == 65535) {
                var9 = -1;
            }
            boolean var11 = true;
            if (var9 != -1 && arg4.field2485 != -1) {
                if (arg4.field2485 == var9) {
                    class12 var16 = class234.field3258.method2456(var9, 600);
                    if (var16.field164 && var16.field178 != -1) {
                        class207 var17 = class175.field2103.method1267(-47, var16.field178);
                        int var18 = var17.field2848;
                        if (var18 == 0) {
                            var11 = false;
                        } else if (var18 == 1) {
                            var11 = true;
                        } else if (var18 == 2) {
                            arg4.field2507 = 0;
                            var11 = false;
                        }
                    }
                } else {
                    class12 var12 = class234.field3258.method2456(var9, 600);
                    class12 var13 = class234.field3258.method2456(arg4.field2485, arg1 + 697);
                    if (var12.field178 != -1 && var13.field178 != -1) {
                        class207 var14 = class175.field2103.method1267(-112, var12.field178);
                        class207 var15 = class175.field2103.method1267(-56, var13.field178);
                        if (var15.field2860 > var14.field2860) {
                            var11 = false;
                        }
                    }
                }
            }
            if (var11) {
                arg4.field2516 = var10 >> 16;
                int var19 = class204.field2796;
                arg4.field2485 = var9;
                arg4.field2447 = 1;
                arg4.field2478 = 0;
                arg4.field2477 = var19 + (var10 & 0xFFFF);
                arg4.field2494 = 0;
                if (arg4.field2477 > var19) {
                    arg4.field2494 = -1;
                }
                if (arg4.field2485 != -1 && arg4.field2477 == var19) {
                    int var20 = class234.field3258.method2456(arg4.field2485, arg1 ^ 0xFFFFFDC7).field178;
                    if (var20 != -1) {
                        class207 var21 = class175.field2103.method1267(-104, var20);
                        if (var21 != null && var21.field2853 != null) {
                            class126.method602(var21, class19.field258 == arg4, arg4.field1008, 0, arg4.field1005, false, arg4.field994);
                        }
                    }
                }
            }
        }
        if ((arg0 & 0x2000) != 0) {
            var5 = arg2.method905(true);
        }
        if ((arg0 & 0x4000) != 0) {
            int var22 = arg2.method940((byte) 109);
            int[] var23 = new int[var22];
            int[] var24 = new int[var22];
            int[] var25 = new int[var22];
            for (int var26 = 0; var26 < var22; var26++) {
                int var27 = arg2.method930(255);
                if (var27 == 65535) {
                    var27 = -1;
                }
                var23[var26] = var27;
                var24[var26] = arg2.method895((byte) -79);
                var25[var26] = arg2.method882((byte) -126);
            }
            class150.method726(var24, 100, var25, arg4, var23);
        }
        if ((arg0 & 0x1) != 0) {
            int var28 = arg2.method882((byte) -114);
            int var29 = arg2.method896(arg1 + 13186);
            int var30 = arg2.method886((byte) -45);
            int var31 = arg2.field2206;
            boolean var32 = (var28 & 0x8000) != 0;
            if (arg4.field2736 != null && arg4.field2722 != null) {
                boolean var33 = false;
                if (var29 <= 1) {
                    if (!var32 && (class456.field6432 && !class10.field133 || class392.field5586)) {
                        var33 = true;
                    } else if (class127.method603(arg4.field2736, true)) {
                        var33 = true;
                    }
                }
                if (!var33 && class349.field5019 == 0) {
                    class34.field413.field2206 = 0;
                    arg2.method924(class34.field413.field2159, true, var30, 0);
                    class34.field413.field2206 = 0;
                    int var34 = -1;
                    String var35;
                    if (var32) {
                        var28 &= 0x7FFF;
                        class257 var36 = class83.method421(8, class34.field413);
                        var34 = var36.field3713;
                        var35 = var36.field3717.method166(class34.field413, (byte) -91);
                    } else {
                        var35 = class131.method623(60, class427.method2549(arg1 + 97, class171.method839((byte) 23, class34.field413)));
                    }
                    arg4.field2473 = var35.trim();
                    arg4.field2471 = var28 >> 8;
                    arg4.field2486 = 150;
                    arg4.field2515 = var28 & 0xFF;
                    int var37;
                    if (var29 == 1 || var29 == 2) {
                        var37 = var32 ? 17 : 1;
                    } else {
                        var37 = var32 ? 17 : 2;
                    }
                    if (var29 == 2) {
                        class476.method2820("<img=1>" + arg4.method1085(37, false), var34, var35, var37, 0, (byte) -53, "<img=1>" + arg4.method1084(true, 124), (String) null);
                    } else if (var29 == 1) {
                        class476.method2820("<img=0>" + arg4.method1085(113, false), var34, var35, var37, 0, (byte) -45, "<img=0>" + arg4.method1084(true, arg1 ^ 0xFFFFFFE2), (String) null);
                    } else {
                        class476.method2820(arg4.method1085(75, false), var34, var35, var37, 0, (byte) -125, arg4.method1084(true, arg1 ^ 0xFFFFFF8F), (String) null);
                    }
                }
            }
            arg2.field2206 = var30 + var31;
        }
        if (arg1 != -97) {
            return;
        }
        if ((arg0 & 0x1000) != 0) {
            int var38 = arg2.method916(21933);
            arg4.field2512 = arg2.method895((byte) -100);
            arg4.field2464 = arg2.method896(arg1 ^ 0xFFFFCCBE);
            arg4.field2522 = (var38 & 0x8000) != 0;
            arg4.field2454 = var38 & 0x7FFF;
            arg4.field2505 = class204.field2796 + arg4.field2454 + arg4.field2512;
        }
        if ((arg0 & 0x10) != 0) {
            int var39 = arg2.method882((byte) -121);
            if (var39 == 65535) {
                var39 = -1;
            }
            int var40 = arg2.method886((byte) -44);
            class244.method1329(var39, 0, arg4, var40);
        }
        if ((arg0 & 0x80) != 0) {
            int var41 = arg2.method896(13089);
            byte[] var42 = new byte[var41];
            class179 var43 = new class179(var42);
            arg2.method900(0, (byte) -80, var41, var42);
            class360.field5176[arg3] = var43;
            arg4.method1078(var43, true);
        }
        if ((arg0 & 0x800) != 0) {
            int var44 = class204.field2796;
            int var45 = arg2.method885(true);
            int var46 = arg2.method896(13089);
            arg4.method1016(var45, var46, (byte) 121, var44);
        }
        if (arg4.field2720 == -1) {
            return;
        }
        if (var5 == 127) {
            arg4.method1082(arg4.field2729, arg4.field2720, (byte) -115);
            return;
        }
        byte var47;
        if (var5 == -1) {
            var47 = class188.field2556[arg3];
        } else {
            var47 = var5;
        }
        arg4.method1077(arg4.field2720, 92, arg4.field2729, var47);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)V")
    public static final void method1505(int arg0) {
        class413.field5876.method382(-20312);
        field3480++;
        class127.field1573.method2487(119);
        class19.field254.method617(70);
        class173.field2084.method2289((byte) 86);
        class390.field5575.method2501(0);
        class422.field6096.method118(57);
        class175.field2103.method1270((byte) -81);
        class234.field3258.method2451(17088);
        class269.field3860.method991(124);
        class75.field907.method2120((byte) -100);
        class415.field6001.method1927((byte) 83);
        class44.field568.method1307(-127);
        class47.field611.method1892((byte) -19);
        class424.field6126.method1903(-33);
        class422.field6084.method2075((byte) 68);
        class128.field1576.method1324(29);
        class459.field6482.method1236(-8586);
        class312.field4557.method739((byte) -117);
        class319.field4642.method1833((byte) 96);
        class64.field811.method657(-126);
        class170.method827((byte) -52);
        class284.method1782(127);
        class150.method721((byte) -1);
        if (class414.field5904 != class145.field1754) {
            for (int var1 = 0; var1 < class382.field5432.length; var1++) {
                class382.field5432[var1] = null;
            }
            class300.field4469 = 0;
        }
        class354.method2146(0);
        class205.method1120(-115);
        class287.method1817(101);
        class35.method175(-108);
        class22.method137(127);
        class396.field5624.method1165((byte) 118);
        class231.field3205.method1445();
        class420.field6049.method1593((byte) -64);
        class401.method2398(-99);
        if (arg0 <= 54) {
            method1504(-75, (byte) -127, (class331) null, 85, (class198) null);
        }
        class293.field4360.method2769(21354);
        class474.field6660.method2769(21354);
        class198.field2753.method2769(21354);
        class17.field217.method2769(21354);
        class90.field1129.method2769(21354);
        class242.field3319.method2769(21354);
        class93.field1162.method2769(21354);
        class291.field4336.method2769(21354);
        class171.field2022.method2769(21354);
        class200.field2781.method2769(21354);
        class313.field4568.method2769(21354);
        class258.field3728.method2769(21354);
        client.field3937.method2769(21354);
        class39.field470.method2769(21354);
        class74.field900.method2769(21354);
        class4.field51.method2769(21354);
        class83.field1012.method2769(21354);
        class349.field5018.method2769(21354);
        class438.field6283.method2769(21354);
        class78.field936.method2769(21354);
        class160.field1929.method2769(21354);
        class443.field6325.method2769(21354);
        class348.field4956.method2769(21354);
        class353.field5071.method2769(21354);
        class474.field6659.method2769(21354);
        class310.field4541.method2769(21354);
        class198.field2750.method2769(21354);
        class76.field919.method2769(21354);
        class28.field367.method2769(21354);
        class122.field1520.method1165((byte) 118);
        class362.field5213.method1165((byte) 118);
        class319.field4636.method1165((byte) 118);
        class173.field2079.method1165((byte) 118);
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)V")
    public static void method1506(int arg0) {
        field3483 = null;
        if (arg0 != 0) {
            field3483 = null;
        }
        field3482 = null;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IC)C")
    public static final char method1507(int arg0, char arg1) {
        field3478++;
        if (arg1 == 'Æ') {
            return 'E';
        } else if (arg1 == 'æ') {
            return 'e';
        } else if (arg1 == 'ß') {
            return 's';
        } else if (arg0 != 0) {
            return 'U';
        } else if (arg1 == 'Œ') {
            return 'E';
        } else {
            return (char) (arg1 == 'œ' ? 'e' : '\u0000');
        }
    }

    static {
        new class40(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
        field3483 = new int[] { 1, 2, 4, 8 };
        new class40("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
    }
}
