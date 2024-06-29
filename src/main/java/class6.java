import java.awt.Component;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class6 extends class86 {

    @OriginalMember(owner = "client!wj", name = "u", descriptor = "J")
    public long field106;

    @OriginalMember(owner = "client!wj", name = "q", descriptor = "I")
    public static int field102 = 0;

    @OriginalMember(owner = "client!wj", name = "w", descriptor = "I")
    public static int field108 = 0;

    @OriginalMember(owner = "client!wj", name = "y", descriptor = "Lta;")
    public static class262 field110 = new class262(5);

    @OriginalMember(owner = "client!wj", name = "B", descriptor = "[[B")
    public static byte[][] field113 = new byte[250][];

    @OriginalMember(owner = "client!wj", name = "A", descriptor = "I")
    public static int field112 = -1;

    @OriginalMember(owner = "client!wj", name = "o", descriptor = "I")
    public static int field100;

    @OriginalMember(owner = "client!wj", name = "p", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!wj", name = "r", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!wj", name = "s", descriptor = "I")
    public static int field104;

    @OriginalMember(owner = "client!wj", name = "t", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "client!wj", name = "v", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "client!wj", name = "x", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!wj", name = "z", descriptor = "I")
    public static int field111;

    @OriginalMember(owner = "client!wj", name = "D", descriptor = "I")
    public static int field115;

    @OriginalMember(owner = "client!wj", name = "C", descriptor = "Ljava/awt/Frame;")
    public static Frame field114;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Ljava/lang/Object;Lja;Z)V")
    public static final void method73(Object arg0, class59 arg1, boolean arg2) {
        if (arg2) {
            return;
        }
        field100++;
        if (arg1.field935 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg1.field935.peekEvent() != null; var3++) {
            class42.method354(1L, false);
        }
        if (arg0 != null) {
            arg1.field935.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ZBLjava/lang/String;I)I")
    public static final int method74(boolean arg0, byte arg1, String arg2, int arg3) {
        if (arg1 < 13) {
            return 104;
        }
        field103++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        boolean var4 = false;
        int var5 = 0;
        int var6 = arg2.length();
        boolean var7 = false;
        for (int var8 = 0; var8 < var6; var8++) {
            char var9 = arg2.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var7 = true;
                    continue;
                }
                if (var9 == '+' && arg0) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (var11 >= arg3) {
                throw new NumberFormatException();
            }
            if (var7) {
                var11 = -var11;
            }
            int var10 = arg3 * var5 + var11;
            if ((var10 / arg3) != var5) {
                throw new NumberFormatException();
            }
            var5 = var10;
            var4 = true;
        }
        if (!var4) {
            throw new NumberFormatException();
        }
        return var5;
    }

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "(I)V")
    public static void method75(int arg0) {
        field113 = null;
        field110 = null;
        if (arg0 != 903) {
            method76((class176) null, 33, -112);
        }
        field114 = null;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Luf;II)[Lcg;")
    public static final class168[] method76(class176 arg0, int arg1, int arg2) {
        field105++;
        if (class223.method1489(arg1, arg0, (byte) 40)) {
            if (arg2 != 0) {
                method75(-16);
            }
            return class74.method586(-113);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method77(Component arg0, int arg1) {
        field101++;
        arg0.addMouseListener(class276.field4349);
        if (arg1 >= 72) {
            arg0.addMouseMotionListener(class276.field4349);
            arg0.addFocusListener(class276.field4349);
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(III)I")
    public static final int method78(int arg0, int arg1, int arg2) {
        field109++;
        int var3 = class217.method1452(arg1 - 1, arg2 + -1, -1) + (class217.method1452(arg1 + 1, arg2 - 1, -1) - (-class217.method1452(arg1 - 1, arg2 + 1, arg0 ^ 0x8A0) - class217.method1452(arg1 + 1, arg2 + 1, -1)));
        int var4 = class217.method1452(arg1 - 1, arg2, -1) + class217.method1452(arg1 + 1, arg2, arg0 + 2208) - (-class217.method1452(arg1, arg2 + -1, -1) - class217.method1452(arg1, arg2 + 1, -1));
        if (arg0 != -2209) {
            method73((Object) null, (class59) null, false);
        }
        int var5 = class217.method1452(arg1, arg2, -1);
        return var3 / 16 + (var4 / 8) + (var5 / 4);
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "()V")
    public class6() {
    }

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "(I)V")
    public static final void method79(int arg0) {
        field107++;
        if (arg0 > -61) {
            return;
        }
        if (class146.field2259 == 18) {
            int var1 = class239.field3692.method333((byte) -59);
            int var2 = (var1 & 0x7) + class163.field2483;
            int var3 = (var1 >> 4 & 0x7) + class158.field2426;
            int var4 = var3 + class239.field3692.method322((byte) 61);
            int var5 = class239.field3692.method322((byte) 84) + var2;
            int var6 = class239.field3692.method306(77);
            int var7 = class239.field3692.method293(99);
            int var8 = class239.field3692.method333((byte) -59) * 4;
            int var9 = class239.field3692.method333((byte) -59) * 4;
            int var10 = class239.field3692.method293(100);
            int var11 = class239.field3692.method293(99);
            int var12 = class239.field3692.method333((byte) -59);
            int var13 = class239.field3692.method333((byte) -59);
            if (var12 == 255) {
                var12 = -1;
            }
            if (var3 >= 0 && var2 >= 0 && var3 < 104 && var2 < 104 && var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104 && var7 != 65535) {
                int var14 = var4 * 128 + 64;
                int var15 = var3 * 128 + 64;
                int var16 = var2 * 128 + 64;
                class47 var17 = new class47(var7, class274.field4318, var15, var16, class224.method1502((byte) -128, class274.field4318, var16, var15) - var8, class267.field4256 + var10, class267.field4256 + var11, var12, var13, var6, var9);
                int var18 = var5 * 128 + 64;
                var17.method390(var18, class267.field4256 + var10, class224.method1502((byte) -125, class274.field4318, var18, var14) + -var9, var14, (byte) 72);
                class13.field229.method1013(312991604, new class245(var17));
            }
        } else if (class146.field2259 == 81) {
            int var19 = class239.field3692.method333((byte) -59);
            int var20 = (var19 >> 4 & 0x7) + class158.field2426;
            int var21 = (var19 & 0x7) + class163.field2483;
            int var22 = class239.field3692.method293(120);
            if (var22 == 65535) {
                var22 = -1;
            }
            int var23 = class239.field3692.method333((byte) -59);
            int var24 = class239.field3692.method333((byte) -59);
            int var25 = class239.field3692.method333((byte) -59);
            int var26 = var23 >> 4 & 0xF;
            int var27 = var23 & 0x7;
            if (var20 >= 0 && var21 >= 0 && var20 < 104 && var21 < 104) {
                int var28 = var26 + 1;
                if (var20 - var28 <= class261.field4058.field4204[0] && (var20 + var28) >= class261.field4058.field4204[0] && class261.field4058.field4143[0] >= (var21 - var28) && var21 + var28 >= class261.field4058.field4143[0] && class253.field3896 != 0 && var27 > 0 && class88.field1443 < 50 && var22 != -1) {
                    class94.field1528[class88.field1443] = var22;
                    class94.field1517[class88.field1443] = var27;
                    class48.field786[class88.field1443] = var24;
                    class163.field2482[class88.field1443] = null;
                    class206.field3199[class88.field1443] = (var21 << 8) + (var20 << 16) + var26;
                    class1.field15[class88.field1443] = var25;
                    class88.field1443++;
                }
            }
        } else if (class146.field2259 == 132) {
            int var29 = class239.field3692.method333((byte) -59);
            int var30 = (var29 >> 4 & 0xF) + class158.field2426 * 2;
            int var31 = (var29 & 0xF) + class163.field2483 * 2;
            int var32 = var30 + class239.field3692.method322((byte) 58);
            int var33 = var31 + class239.field3692.method322((byte) 92);
            int var34 = class239.field3692.method306(91);
            int var35 = class239.field3692.method293(108);
            int var36 = class239.field3692.method333((byte) -59) * 4;
            int var37 = class239.field3692.method333((byte) -59) * 4;
            int var38 = class239.field3692.method293(119);
            int var39 = class239.field3692.method293(-127);
            int var40 = class239.field3692.method333((byte) -59);
            if (var40 == 255) {
                var40 = -1;
            }
            int var41 = class239.field3692.method333((byte) -59);
            if (var30 >= 0 && var31 >= 0 && var30 < 208 && var31 < 208 && var32 >= 0 && var33 >= 0 && var32 < 208 && var33 < 208 && var35 != 65535) {
                int var42 = var30 * 64;
                int var43 = var33 * 64;
                int var44 = var32 * 64;
                int var45 = var31 * 64;
                class47 var46 = new class47(var35, class274.field4318, var42, var45, class224.method1502((byte) -128, class274.field4318, var45, var42) - var36, class267.field4256 + var38, var39 + class267.field4256, var40, var41, var34, var37);
                var46.method390(var43, class267.field4256 + var38, -var37 + class224.method1502((byte) -127, class274.field4318, var43, var44), var44, (byte) 126);
                class13.field229.method1013(312991604, new class245(var46));
            }
        } else if (class146.field2259 == 111) {
            int var47 = class239.field3692.method297((byte) -120);
            int var48 = (var47 >> 4 & 0x7) + class158.field2426;
            int var49 = (var47 & 0x7) + class163.field2483;
            int var50 = class239.field3692.method313(113);
            int var51 = class239.field3692.method293(-45);
            int var52 = class239.field3692.method313(124);
            if (var48 >= 0 && var49 >= 0 && var48 < 104 && var49 < 104 && class294.field4623 != var50) {
                class222 var53 = new class222();
                var53.field3477 = var52;
                var53.field3464 = var51;
                if (class293.field4613[class274.field4318][var48][var49] == null) {
                    class293.field4613[class274.field4318][var48][var49] = new class149();
                }
                class293.field4613[class274.field4318][var48][var49].method1013(312991604, new class50(var53));
                class195.method1307(-128, var49, var48);
            }
        } else if (class146.field2259 == 137) {
            int var54 = class239.field3692.method333((byte) -59);
            int var55 = (var54 & 0x7) + class163.field2483;
            int var56 = class158.field2426 + (var54 >> 4 & 0x7);
            int var57 = class239.field3692.method293(-37);
            int var58 = class239.field3692.method293(106);
            int var59 = class239.field3692.method293(90);
            if (var56 >= 0 && var55 >= 0 && var56 < 104 && var55 < 104) {
                class149 var60 = class293.field4613[class274.field4318][var56][var55];
                if (var60 != null) {
                    for (class50 var61 = (class50) var60.method1010(108); var61 != null; var61 = (class50) var60.method1008((byte) 88)) {
                        class222 var62 = var61.field803;
                        if ((var57 & 0x7FFF) == var62.field3477 && var62.field3464 == var58) {
                            var62.field3464 = var59;
                            break;
                        }
                    }
                    class195.method1307(-128, var55, var56);
                }
            }
        } else if (class146.field2259 == 138) {
            int var63 = class239.field3692.method297((byte) -120);
            int var64 = var63 >> 2;
            int var65 = class77.field1309[var64];
            int var66 = class239.field3692.method325(255);
            int var67 = (var66 >> 4 & 0x7) + class158.field2426;
            int var68 = (var66 & 0x7) + class163.field2483;
            int var69 = var63 & 0x3;
            if (var67 >= 0 && var68 >= 0 && var67 < 104 && var68 < 104) {
                class237.method1595(var69, var64, 0, class274.field4318, var68, -1, var67, var65, -1, 0);
            }
        } else if (class146.field2259 == 82) {
            int var70 = class239.field3692.method293(93);
            int var71 = class239.field3692.method333((byte) -59);
            int var72 = (var71 >> 4 & 0x7) + class158.field2426;
            int var73 = (var71 & 0x7) + class163.field2483;
            int var74 = class239.field3692.method313(124);
            if (var72 >= 0 && var73 >= 0 && var72 < 104 && var73 < 104) {
                class222 var75 = new class222();
                var75.field3464 = var74;
                var75.field3477 = var70;
                if (class293.field4613[class274.field4318][var72][var73] == null) {
                    class293.field4613[class274.field4318][var72][var73] = new class149();
                }
                class293.field4613[class274.field4318][var72][var73].method1013(312991604, new class50(var75));
                class195.method1307(-127, var73, var72);
            }
        } else if (class146.field2259 == 172) {
            int var76 = class239.field3692.method333((byte) -59);
            int var77 = (var76 >> 4 & 0xF) + class158.field2426 * 2;
            int var78 = (var76 & 0xF) + class163.field2483 * 2;
            int var79 = var77 + class239.field3692.method322((byte) 68);
            int var80 = var78 + class239.field3692.method322((byte) 48);
            int var81 = class239.field3692.method306(60);
            int var82 = class239.field3692.method306(106);
            int var83 = class239.field3692.method293(102);
            int var84 = class239.field3692.method322((byte) 80);
            int var85 = class239.field3692.method333((byte) -59) * 4;
            int var86 = class239.field3692.method293(126);
            int var87 = class239.field3692.method293(116);
            int var88 = class239.field3692.method333((byte) -59);
            int var89 = class239.field3692.method333((byte) -59);
            if (var88 == 255) {
                var88 = -1;
            }
            if (var77 >= 0 && var78 >= 0 && var77 < 208 && var78 < 208 && var79 >= 0 && var80 >= 0 && var79 < 208 && var80 < 208 && var83 != 65535) {
                int var90 = var79 * 64;
                int var91 = var77 * 64;
                int var92 = var80 * 64;
                int var93 = var78 * 64;
                if (var81 != 0) {
                    int var96;
                    class264 var97;
                    if (var81 < 0) {
                        int var94 = -var81 - 1;
                        int var95 = var94 & 0x7FF;
                        var96 = (var94 & 0x7C28) >> 11;
                        if (class294.field4623 == var95) {
                            var97 = class261.field4058;
                        } else {
                            var97 = class41.field675[var95];
                        }
                    } else {
                        int var98 = var81 - 1;
                        var96 = (var98 & 0x78C0) >> 11;
                        int var99 = var98 & 0x7FF;
                        var97 = class72.field1144[var99];
                    }
                    if (var97 != null) {
                        class8 var100 = var97.method1801((byte) 110);
                        if (var100.field137 != null && var100.field137[var96] != null) {
                            var84 -= var100.field137[var96][1];
                            int var101 = var100.field137[var96][0];
                            int var102 = class97.field1557[var97.field4159];
                            int var103 = var100.field137[var96][2];
                            int var104 = class97.field1556[var97.field4159];
                            int var105 = var101 * var104 + var102 * var103 >> 16;
                            int var106 = var103 * var104 - (var101 * var102) >> 16;
                            var93 += var106;
                            var91 += var105;
                        }
                    }
                }
                class47 var108 = new class47(var83, class274.field4318, var91, var93, class224.method1502((byte) -128, class274.field4318, var93, var91) - var84, var86 - -class267.field4256, class267.field4256 + var87, var88, var89, var82, var85);
                var108.method390(var92, class267.field4256 + var86, class224.method1502((byte) -127, class274.field4318, var92, var90) + -var85, var90, (byte) 67);
                class13.field229.method1013(312991604, new class245(var108));
            }
        } else if (class146.field2259 == 6) {
            int var109 = class239.field3692.method333((byte) -59);
            int var110 = (var109 & 0x7) + class163.field2483;
            int var111 = (var109 >> 4 & 0x7) + class158.field2426;
            int var112 = class239.field3692.method293(110);
            int var113 = class239.field3692.method333((byte) -59);
            int var114 = class239.field3692.method293(-80);
            if (var111 >= 0 && var110 >= 0 && var111 < 104 && var110 < 104) {
                int var115 = var111 * 128 + 64;
                int var116 = var110 * 128 + 64;
                class133 var117 = new class133(var112, class274.field4318, var115, var116, class224.method1502((byte) -127, class274.field4318, var116, var115) - var113, var114, class267.field4256);
                class1.field2.method1013(312991604, new class15(var117));
            }
        } else if (class146.field2259 == 214) {
            int var118 = class239.field3692.method293(-24);
            int var119 = class239.field3692.method325(255);
            int var120 = (var119 >> 4 & 0x7) + class158.field2426;
            int var121 = class163.field2483 + (var119 & 0x7);
            if (var120 >= 0 && var121 >= 0 && var120 < 104 && var121 < 104) {
                class149 var122 = class293.field4613[class274.field4318][var120][var121];
                if (var122 != null) {
                    for (class50 var123 = (class50) var122.method1010(122); var123 != null; var123 = (class50) var122.method1008((byte) 88)) {
                        if ((var118 & 0x7FFF) == var123.field803.field3477) {
                            var123.method693(-88);
                            break;
                        }
                    }
                    if (var122.method1010(125) == null) {
                        class293.field4613[class274.field4318][var120][var121] = null;
                    }
                    class195.method1307(-126, var121, var120);
                }
            }
        } else if (class146.field2259 == 213) {
            int var124 = class239.field3692.method293(-29);
            int var125 = class239.field3692.method333((byte) -59);
            class85.method690(2276, var124).method570(81, var125);
        } else {
            if (class146.field2259 == 211) {
                int var126 = class239.field3692.method306(59);
                byte var127 = class239.field3692.method328((byte) 117);
                byte var128 = class239.field3692.method322((byte) 21);
                int var129 = class239.field3692.method283(255);
                int var130 = class239.field3692.method333((byte) -59);
                int var131 = ((var130 & 0x79) >> 4) + class158.field2426;
                int var132 = (var130 & 0x7) + class163.field2483;
                int var133 = class239.field3692.method293(100);
                byte var134 = class239.field3692.method303((byte) 0);
                byte var135 = class239.field3692.method322((byte) 126);
                int var136 = class239.field3692.method333((byte) -59);
                int var137 = var136 >> 2;
                int var138 = var136 & 0x3;
                int var139 = class239.field3692.method293(92);
                class259.method1716(var126, var138, var129, var128, var134, var139, var137, var132, (byte) 37, var135, var133, var127, var131);
            }
            if (class146.field2259 == 130) {
                int var140 = class239.field3692.method333((byte) -59);
                int var141 = class158.field2426 + (var140 >> 4 & 0x7);
                int var142 = (var140 & 0x7) + class163.field2483;
                int var143 = class239.field3692.method333((byte) -59);
                int var144 = var143 & 0x3;
                int var145 = var143 >> 2;
                int var146 = class77.field1309[var145];
                int var147 = class239.field3692.method283(255);
                if (var141 >= 0 && var142 >= 0 && var141 < 104 && var142 < 104) {
                    class237.method1595(var144, var145, 0, class274.field4318, var142, -1, var141, var146, var147, 0);
                }
            } else if (class146.field2259 == 76) {
                int var148 = class239.field3692.method297((byte) -120);
                int var149 = var148 >> 2;
                int var150 = var148 & 0x3;
                int var151 = class77.field1309[var149];
                int var152 = class239.field3692.method333((byte) -59);
                int var153 = (var152 & 0x7) + class163.field2483;
                int var154 = class158.field2426 + (var152 >> 4 & 0x7);
                int var155 = class239.field3692.method283(255);
                if (var155 == 65535) {
                    var155 = -1;
                }
                class203.method1361(var154, class274.field4318, var155, var149, var150, 0, var153, var151);
            }
        }
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(J)V")
    public class6(long arg0) {
        this.field106 = arg0;
    }
}
