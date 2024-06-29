import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class16 {

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "[I")
    public static int[] field456 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
    public static int field454 = 0;

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "Lvf;")
    public static class265 field459 = class87.method582(-46, "Chargement des polices )2 ");

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "Lvf;")
    public static class265 field455 = class87.method582(-46, "M-Bmoire en cours d(Wattribution");

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "Lvf;")
    public static class265 field457 = class87.method582(-46, "showVideoAd");

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "Lvf;")
    public static class265 field460 = class87.method582(-46, "Librairie 3D d-Bmarr-Be");

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "I")
    public static int field463 = 0;

    @OriginalMember(owner = "client!ga", name = "l", descriptor = "[I")
    public static int[] field465 = new int[2];

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!ga", name = "m", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "Lfl;")
    public static class192 field462;

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "[I")
    public static int[] field461;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)Z")
    public static final boolean method115(int arg0) throws IOException {
        field466++;
        if (class197.field3520 == null) {
            return false;
        }
        int var1 = class197.field3520.method987((byte) 53);
        if (var1 == 0) {
            return false;
        }
        if (class93.field1650 == -1) {
            var1--;
            class197.field3520.method986(1, 0, class207.field3730.field2483, 13418);
            class207.field3730.field2449 = 0;
            class93.field1650 = class207.field3730.method1861(arg0 - 19217);
            class221.field3966 = class23.field682[class93.field1650];
        }
        if (class221.field3966 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class197.field3520.method986(1, 0, class207.field3730.field2483, arg0 ^ 0x7EFE);
            var1--;
            class221.field3966 = class207.field3730.field2483[0] & 0xFF;
        }
        if (class221.field3966 == -2) {
            if (var1 <= 1) {
                return false;
            }
            class197.field3520.method986(2, 0, class207.field3730.field2483, arg0 ^ 0x7EFE);
            var1 -= 2;
            class207.field3730.field2449 = 0;
            class221.field3966 = class207.field3730.method927(127);
        }
        if (class221.field3966 > var1) {
            return false;
        }
        class207.field3730.field2449 = 0;
        class197.field3520.method986(class221.field3966, 0, class207.field3730.field2483, 13418);
        class178.field3168 = class279.field4931;
        class198.field3545 = 0;
        class279.field4931 = class278.field4915;
        class278.field4915 = class93.field1650;
        if (class93.field1650 == 26) {
            int var2 = class207.field3730.method927(125);
            int var3 = class207.field3730.method900(107);
            int var4 = class207.field3730.method927(127);
            int var5 = class207.field3730.method915((byte) 43);
            if (class241.method1610(1, var4)) {
                class174.method1140(43, (var3 << 16) + var2, var5);
            }
            class93.field1650 = -1;
            return true;
        } else if (class93.field1650 == 67) {
            int var6 = class207.field3730.method910(false);
            int var7 = class207.field3730.method910(false);
            int var8 = class207.field3730.method906(2);
            if (class241.method1610(1, var6)) {
                class237.method1584(var7, (byte) 60, var8);
            }
            class93.field1650 = -1;
            return true;
        } else if (class93.field1650 == 161) {
            int var9 = class207.field3730.method915((byte) 73);
            int var10 = class207.field3730.method900(arg0 - 18984);
            class1.method11((byte) 89, var10, var9);
            class93.field1650 = -1;
            return true;
        } else if (class93.field1650 == 163) {
            int var11 = class207.field3730.method900(66);
            int var12 = class207.field3730.method933(arg0 ^ 0xFFFFB54E);
            class264.method1762(arg0 ^ 0x4B60, var12, var11);
            class93.field1650 = -1;
            return true;
        } else {
            if (arg0 != 19092) {
                field455 = null;
            }
            if (class93.field1650 == 188) {
                int var13 = class207.field3730.method893(false);
                int var14 = class207.field3730.method914(arg0 ^ 0x4A94);
                int var15 = class207.field3730.method893(false);
                class216.field3902 = var13 >> 1;
                class214.field3827.method823(-120, var14, var15, (var13 & 0x1) == 1);
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 19) {
                int var16 = class207.field3730.method949(3933);
                int var17 = class207.field3730.method910(false);
                int var18 = class207.field3730.method920((byte) 26);
                int var19 = class207.field3730.method910(false);
                if (class241.method1610(1, var17)) {
                    class181 var20 = (class181) class49.field1042.method1842(-1, (long) var16);
                    if (var20 != null) {
                        class40.method338(var20, -2, var20.field3217 != var19);
                    }
                    class155.method1056(var16, var18, var19, -2);
                }
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 230) {
                class281.field4962 = class207.field3730.method920((byte) 39);
                class111.field1936 = class207.field3730.method920((byte) 35);
                class125.field2244 = class207.field3730.method920((byte) 64);
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 149) {
                int var21 = class207.field3730.method910(false);
                int var22 = class207.field3730.method906(arg0 - 19090);
                int var23 = class207.field3730.method900(88);
                if (class241.method1610(1, var23)) {
                    class231.method1563(false, var21, var22);
                }
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 195) {
                class265 var24 = class207.field3730.method942(false);
                int var25 = class207.field3730.method901((byte) -128);
                int var26 = class207.field3730.method949(3933);
                if (class241.method1610(1, var25)) {
                    class110.method729(var24, var26, (byte) -108);
                }
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 100) {
                class135.method912(false, 0);
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 72) {
                int var27 = class207.field3730.method949(arg0 ^ 0x45C9);
                int var28 = class207.field3730.method927(arg0 - 18967);
                class6 var29;
                if (var27 < 0) {
                    var29 = null;
                } else {
                    var29 = class21.method204(var27, arg0 - 35349);
                }
                if (var29 != null) {
                    for (int var30 = 0; var30 < var29.field92.length; var30++) {
                        var29.field92[var30] = 0;
                        var29.field218[var30] = 0;
                    }
                }
                if (var27 < -70000) {
                    var28 += 32768;
                }
                class149.method1024(var28, (byte) -2);
                int var31 = class207.field3730.method927(126);
                for (int var32 = 0; var32 < var31; var32++) {
                    int var33 = class207.field3730.method914(0);
                    if (var33 == 255) {
                        var33 = class207.field3730.method933(118);
                    }
                    int var34 = class207.field3730.method901((byte) -127);
                    if (var29 != null && var29.field92.length > var32) {
                        var29.field92[var32] = var34;
                        var29.field218[var32] = var33;
                    }
                    class276.method1885(var28, arg0 - 32405, var33, var32, var34 - 1);
                }
                if (var29 != null) {
                    class176.method1145((byte) -115, var29);
                }
                class52.method408(false);
                class146.field2734[class203.method1395(class5.field68++, 31)] = class203.method1395(32767, var28);
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 183) {
                int var35 = class207.field3730.method927(arg0 ^ 0x4AEB);
                int var36 = class207.field3730.method949(3933);
                if (class241.method1610(1, var35)) {
                    class181 var37 = (class181) class49.field1042.method1842(-1, (long) var36);
                    if (var37 != null) {
                        class40.method338(var37, -2, true);
                    }
                    if (class209.field3760 != null) {
                        class176.method1145((byte) 114, class209.field3760);
                        class209.field3760 = null;
                    }
                }
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 43) {
                long var38 = class207.field3730.method943(-91);
                long var40 = (long) class207.field3730.method927(arg0 ^ 0x4AEB);
                boolean var42 = false;
                long var43 = (long) class207.field3730.method909(-917770352);
                int var45 = class207.field3730.method920((byte) 54);
                long var46 = (var40 << 32) + var43;
                int var48 = 0;
                label1134: while (true) {
                    if (var48 >= 100) {
                        if (var45 <= 1) {
                            if ((!class262.field4583 || class203.field3632) && !class101.field1792) {
                                for (int var49 = 0; var49 < class262.field4582; var49++) {
                                    if (class4.field55[var49] == var38) {
                                        var42 = true;
                                        break label1134;
                                    }
                                }
                            } else {
                                var42 = true;
                            }
                        }
                        break;
                    }
                    if (class262.field4584[var48] == var46) {
                        var42 = true;
                        break;
                    }
                    var48++;
                }
                if (!var42 && class219.field3945 == 0) {
                    class262.field4584[class202.field3620] = var46;
                    class202.field3620 = (class202.field3620 + 1) % 100;
                    class265 var50 = class115.method751(class218.method1499(class207.field3730, (byte) -39).method1805(122));
                    if (var45 == 2 || var45 == 3) {
                        class259.method1725(-126, var50, 7, class148.method1022(10, new class265[] { class214.field3832, class103.method691(var38, 22723).method1765(true) }));
                    } else if (var45 == 1) {
                        class259.method1725(-127, var50, 7, class148.method1022(arg0 ^ 0x4A9E, new class265[] { class179.field3192, class103.method691(var38, 22723).method1765(true) }));
                    } else {
                        class259.method1725(-63, var50, 3, class103.method691(var38, 22723).method1765(true));
                    }
                }
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 222) {
                if (class221.field3966 == 0) {
                    class193.field3479 = class211.field3789;
                } else {
                    class193.field3479 = class207.field3730.method942(false);
                }
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 151) {
                int var51 = class207.field3730.method920((byte) 72);
                int var52 = class207.field3730.method901((byte) -128);
                int var53 = class207.field3730.method893(false);
                if (var52 == 65535) {
                    var52 = -1;
                }
                class265 var54 = class207.field3730.method942(false);
                if (var51 >= 1 && var51 <= 8) {
                    if (var54.method1791(class276.field4867, (byte) -98)) {
                        var54 = null;
                    }
                    class143.field2660[var51 - 1] = var54;
                    class27.field719[var51 - 1] = var52;
                    class79.field1496[var51 - 1] = var53 == 0;
                }
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 6) {
                long var55 = class207.field3730.method943(-46);
                int var57 = class207.field3730.method927(arg0 ^ 0x4AEB);
                boolean var58 = true;
                int var59 = class207.field3730.method920((byte) 71);
                class265 var60 = class4.field66;
                if (var55 < 0L) {
                    var58 = false;
                    var55 &= Long.MAX_VALUE;
                }
                if (var57 > 0) {
                    var60 = class207.field3730.method942(false);
                }
                class265 var61 = class103.method691(var55, 22723).method1765(true);
                for (int var62 = 0; var62 < class89.field1603; var62++) {
                    if (class9.field286[var62] == var55) {
                        if (class196.field3508[var62] != var57) {
                            class196.field3508[var62] = var57;
                            if (var57 > 0) {
                                class259.method1725(-115, class148.method1022(arg0 ^ 0x4A9E, new class265[] { var61, class176.field3145 }), 5, class4.field66);
                            }
                            if (var57 == 0) {
                                class259.method1725(-76, class148.method1022(10, new class265[] { var61, class275.field4851 }), 5, class4.field66);
                            }
                        }
                        var61 = null;
                        class58.field1183[var62] = var60;
                        class58.field1182[var62] = var59;
                        class73.field1392[var62] = var58;
                        break;
                    }
                }
                if (var61 != null && class89.field1603 < 200) {
                    class9.field286[class89.field1603] = var55;
                    class198.field3530[class89.field1603] = var61;
                    class196.field3508[class89.field1603] = var57;
                    class58.field1183[class89.field1603] = var60;
                    class58.field1182[class89.field1603] = var59;
                    class73.field1392[class89.field1603] = var58;
                    class89.field1603++;
                }
                boolean var63 = false;
                class242.field4231 = class135.field2455;
                int var64 = class89.field1603;
                while (var64 > 0) {
                    boolean var65 = true;
                    var64--;
                    for (int var66 = 0; var66 < var64; var66++) {
                        if (class196.field3508[var66] != class206.field3700 && class196.field3508[var66 + 1] == class206.field3700 || class196.field3508[var66] == 0 && class196.field3508[var66 + 1] != 0) {
                            var65 = false;
                            int var67 = class196.field3508[var66];
                            class196.field3508[var66] = class196.field3508[var66 + 1];
                            class196.field3508[var66 + 1] = var67;
                            class265 var68 = class58.field1183[var66];
                            class58.field1183[var66] = class58.field1183[var66 + 1];
                            class58.field1183[var66 + 1] = var68;
                            class265 var69 = class198.field3530[var66];
                            class198.field3530[var66] = class198.field3530[var66 + 1];
                            class198.field3530[var66 + 1] = var69;
                            long var70 = class9.field286[var66];
                            class9.field286[var66] = class9.field286[var66 + 1];
                            class9.field286[var66 + 1] = var70;
                            int var72 = class58.field1182[var66];
                            class58.field1182[var66] = class58.field1182[var66 + 1];
                            class58.field1182[var66 + 1] = var72;
                            boolean var73 = class73.field1392[var66];
                            class73.field1392[var66] = class73.field1392[var66 + 1];
                            class73.field1392[var66 + 1] = var73;
                        }
                    }
                    if (var65) {
                        break;
                    }
                }
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 228) {
                long var74 = class207.field3730.method943(112);
                class265 var76 = class115.method751(class218.method1499(class207.field3730, (byte) -39).method1805(122));
                class259.method1725(-93, var76, 6, class103.method691(var74, arg0 ^ 0x1257).method1765(true));
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 134) {
                class39.method328((byte) -128);
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 140) {
                int var77 = class207.field3730.method927(126);
                int var78 = class207.field3730.method927(125);
                class118.field2087 = var77;
                class79.field1500 = var78;
                if (class254.field4361 == 2) {
                    class202.field3613 = class118.field2087;
                    class8.field272 = class79.field1500;
                }
                method118(-4);
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 193) {
                long var79 = class207.field3730.method943(-98);
                int var81 = class207.field3730.method927(arg0 ^ 0x4AE9);
                class265 var82 = class145.method1004(var81, 14015).method323((byte) -115, class207.field3730);
                client.method1468(class103.method691(var79, 22723).method1765(true), var81, (class265) null, 79, var82, 19);
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 60) {
                int var83 = class207.field3730.method920((byte) 44);
                int var84 = class207.field3730.method920((byte) 122);
                int var85 = class207.field3730.method920((byte) 100);
                int var86 = class207.field3730.method920((byte) 92);
                int var87 = class207.field3730.method927(126);
                class261.field4561[var83] = true;
                class135.field2445[var83] = var84;
                class56.field1144[var83] = var85;
                class32.field810[var83] = var86;
                class172.field3096[var83] = var87;
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 81) {
                int var88 = class207.field3730.method920((byte) 48);
                int var89 = class207.field3730.method920((byte) 92);
                int var90 = class207.field3730.method927(127);
                int var91 = class207.field3730.method920((byte) 110);
                int var92 = class207.field3730.method920((byte) 103);
                class1.method6(var92, var90, true, arg0 ^ 0xFFFFBDE8, var91, var89, var88);
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 74) {
                class52.method408(false);
                int var93 = class207.field3730.method920((byte) 104);
                int var94 = class207.field3730.method906(arg0 - 19090);
                int var95 = class207.field3730.method925(-3);
                class49.field1036[var95] = var94;
                class50.field1055[var95] = var93;
                class39.field904[var95] = 1;
                for (int var96 = 0; var96 < 98; var96++) {
                    if (class216.field3901[var96] <= var94) {
                        class39.field904[var95] = var96 + 2;
                    }
                }
                class248.field4303[class203.method1395(class70.field1359++, 31)] = var95;
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 38) {
                class112.field1957 = class207.field3730.method920((byte) 49);
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 20) {
                int var97 = class207.field3730.method915((byte) 98);
                class6 var98 = class21.method204(var97, -16257);
                for (int var99 = 0; var99 < var98.field92.length; var99++) {
                    var98.field92[var99] = -1;
                    var98.field92[var99] = 0;
                }
                class176.method1145((byte) 120, var98);
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 125) {
                int var100 = class207.field3730.method900(arg0 - 19019);
                class265 var101 = class207.field3730.method942(false);
                int var102 = class207.field3730.method910(false);
                if (class241.method1610(1, var102)) {
                    class125.method837(var101, var100, true);
                }
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 78) {
                class279.field4927 = class207.field3730.method920((byte) 57);
                class181.field3218 = class207.field3730.method914(0);
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 215) {
                class262.field4582 = class221.field3966 / 8;
                for (int var103 = 0; var103 < class262.field4582; var103++) {
                    class4.field55[var103] = class207.field3730.method943(-61);
                    class110.field1928[var103] = class103.method691(class4.field55[var103], 22723);
                }
                class93.field1650 = -1;
                class242.field4231 = class135.field2455;
                return true;
            } else if (class93.field1650 == 110) {
                int var104 = class207.field3730.method920((byte) 119);
                int var105 = var104 >> 6;
                class244 var106 = new class244();
                var106.field4253 = var104 & 0x3F;
                var106.field4254 = class207.field3730.method920((byte) 98);
                if (var106.field4254 >= 0 && var106.field4254 < class162.field2945.length) {
                    if (var106.field4253 == 1 || var106.field4253 == 10) {
                        var106.field4252 = class207.field3730.method927(arg0 - 18965);
                        class207.field3730.field2449 += 3;
                    } else if (var106.field4253 >= 2 && var106.field4253 <= 6) {
                        if (var106.field4253 == 2) {
                            var106.field4264 = 64;
                            var106.field4261 = 64;
                        }
                        if (var106.field4253 == 3) {
                            var106.field4264 = 64;
                            var106.field4261 = 0;
                        }
                        if (var106.field4253 == 4) {
                            var106.field4264 = 64;
                            var106.field4261 = 128;
                        }
                        if (var106.field4253 == 5) {
                            var106.field4264 = 0;
                            var106.field4261 = 64;
                        }
                        if (var106.field4253 == 6) {
                            var106.field4264 = 128;
                            var106.field4261 = 64;
                        }
                        var106.field4253 = 2;
                        var106.field4265 = class207.field3730.method927(126);
                        var106.field4267 = class207.field3730.method927(126);
                        var106.field4266 = class207.field3730.method920((byte) 107);
                    }
                    var106.field4256 = class207.field3730.method927(125);
                    if (var106.field4256 == 65535) {
                        var106.field4256 = -1;
                    }
                    class30.field771[var105] = var106;
                }
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 109) {
                int var107 = class207.field3730.method901((byte) -128);
                int var108 = class207.field3730.method915((byte) 45);
                if (var107 == 65535) {
                    var107 = -1;
                }
                int var109 = class207.field3730.method915((byte) 106);
                int var110 = class207.field3730.method900(54);
                int var111 = class207.field3730.method910(false);
                if (var110 == 65535) {
                    var110 = -1;
                }
                if (class241.method1610(arg0 ^ 0x4A95, var111)) {
                    for (int var112 = var107; var112 <= var110; var112++) {
                        long var113 = ((long) var108 << 32) + (long) var112;
                        class12 var115 = class239.field4173.method1842(arg0 - 19093, var113);
                        if (var115 != null) {
                            var115.method97(158);
                        }
                        class239.field4173.method1838(var113, new class203(var109), (byte) 8);
                    }
                }
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 171) {
                int var116 = class207.field3730.method901((byte) -128);
                int var117 = class207.field3730.method901((byte) -127);
                int var118 = class207.field3730.method901((byte) -127);
                int var119 = class207.field3730.method915((byte) 124);
                if (class241.method1610(1, var116)) {
                    class237.method1583(var118 | var117 << 16, var119, false, 7);
                }
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 173) {
                class59.method445(-114);
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 155) {
                class275.field4852 = class135.field2455;
                long var120 = class207.field3730.method943(-57);
                if (var120 == 0L) {
                    class198.field3547 = null;
                    class45.field1014 = null;
                    class93.field1650 = -1;
                    class212.field3810 = null;
                    class154.field2856 = 0;
                    return true;
                }
                long var122 = class207.field3730.method943(125);
                class45.field1014 = class103.method691(var122, 22723);
                class212.field3810 = class103.method691(var120, arg0 + 3631);
                class196.field3507 = class207.field3730.method929((byte) -3);
                int var124 = class207.field3730.method920((byte) 99);
                if (var124 == 255) {
                    class93.field1650 = -1;
                    return true;
                }
                class154.field2856 = var124;
                class113[] var125 = new class113[100];
                for (int var126 = 0; var126 < class154.field2856; var126++) {
                    var125[var126] = new class113();
                    var125[var126].field393 = class207.field3730.method943(-46);
                    var125[var126].field1987 = class103.method691(var125[var126].field393, arg0 + 3631);
                    var125[var126].field1989 = class207.field3730.method927(126);
                    var125[var126].field1993 = class207.field3730.method929((byte) -3);
                    var125[var126].field1985 = class207.field3730.method942(false);
                    if (class276.field4873 == var125[var126].field393) {
                        class236.field4123 = var125[var126].field1993;
                    }
                }
                boolean var127 = false;
                int var128 = class154.field2856;
                while (var128 > 0) {
                    boolean var129 = true;
                    var128--;
                    for (int var130 = 0; var130 < var128; var130++) {
                        if (var125[var130].field1987.method1766(var125[var130 + 1].field1987, (byte) -65) > 0) {
                            class113 var131 = var125[var130];
                            var129 = false;
                            var125[var130] = var125[var130 + 1];
                            var125[var130 + 1] = var131;
                        }
                    }
                    if (var129) {
                        break;
                    }
                }
                class198.field3547 = var125;
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 203) {
                int var132 = class207.field3730.method910(false);
                if (var132 == 65535) {
                    var132 = -1;
                }
                class14.method105(true, var132);
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 211) {
                int var133 = class207.field3730.method927(126);
                int var134 = class207.field3730.method909(-917770352);
                if (var133 == 65535) {
                    var133 = -1;
                }
                class239.method1598(var134, 0, var133);
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 3) {
                for (int var135 = 0; var135 < class209.field3766.length; var135++) {
                    if (class209.field3766[var135] != null) {
                        class209.field3766[var135].field2570 = -1;
                    }
                }
                for (int var136 = 0; var136 < class4.field67.length; var136++) {
                    if (class4.field67[var136] != null) {
                        class4.field67[var136].field2570 = -1;
                    }
                }
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 10) {
                int var137 = class207.field3730.method920((byte) 110);
                if (class207.field3730.method920((byte) 68) == 0) {
                    class167.field3037[var137] = new class188();
                } else {
                    class207.field3730.field2449--;
                    class167.field3037[var137] = new class188(class207.field3730);
                }
                class93.field1650 = -1;
                class140.field2574 = class135.field2455;
                return true;
            } else if (class93.field1650 == 52) {
                int var138 = class207.field3730.method927(arg0 ^ 0x4AE9);
                if (var138 == 65535) {
                    var138 = -1;
                }
                int var139 = class207.field3730.method920((byte) 86);
                int var140 = class207.field3730.method927(125);
                class1.method8(var139, var140, 0, var138);
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 164) {
                int var141 = class207.field3730.method900(arg0 - 18986);
                int var142 = class207.field3730.method910(false);
                int var143 = class207.field3730.method933(-29);
                if (var141 == 65535) {
                    var141 = -1;
                }
                if (class241.method1610(arg0 - 19091, var142)) {
                    class237.method1583(var141, var143, false, 2);
                }
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 167) {
                class273.field4845 = class207.field3730.method920((byte) 36);
                class93.field1650 = -1;
                class242.field4231 = class135.field2455;
                return true;
            } else if (class93.field1650 == 135) {
                class270.method1855(arg0 ^ 0xFFFFB56F);
                class93.field1650 = -1;
                return false;
            } else if (class93.field1650 == 182) {
                int var144 = class207.field3730.method920((byte) 112);
                int var145 = class207.field3730.method920((byte) 44);
                int var146 = class207.field3730.method927(arg0 ^ 0x4AEB);
                int var147 = class207.field3730.method920((byte) 52);
                int var148 = class207.field3730.method920((byte) 127);
                class122.method813(var147, var148, var144, var145, var146, false);
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 1) {
                long var149 = class207.field3730.method943(-74);
                class207.field3730.method929((byte) -3);
                long var151 = class207.field3730.method943(115);
                long var153 = (long) class207.field3730.method927(125);
                boolean var155 = false;
                long var156 = (long) class207.field3730.method909(-917770352);
                int var158 = class207.field3730.method920((byte) 76);
                long var159 = (var153 << 32) + var156;
                int var161 = class207.field3730.method927(125);
                int var162 = 0;
                label1247: while (true) {
                    if (var162 >= 100) {
                        if (var158 <= 1) {
                            for (int var163 = 0; var163 < class262.field4582; var163++) {
                                if (class4.field55[var163] == var149) {
                                    var155 = true;
                                    break label1247;
                                }
                            }
                        }
                        break;
                    }
                    if (class262.field4584[var162] == var159) {
                        var155 = true;
                        break;
                    }
                    var162++;
                }
                if (!var155 && class219.field3945 == 0) {
                    class262.field4584[class202.field3620] = var159;
                    class202.field3620 = (class202.field3620 + 1) % 100;
                    class265 var164 = class145.method1004(var161, arg0 - 5077).method323((byte) -108, class207.field3730);
                    if (var158 == 2 || var158 == 3) {
                        client.method1468(class148.method1022(10, new class265[] { class214.field3832, class103.method691(var149, 22723).method1765(true) }), var161, class103.method691(var151, 22723).method1765(true), arg0 ^ 0xFFFFB502, var164, 20);
                    } else if (var158 == 1) {
                        client.method1468(class148.method1022(10, new class265[] { class179.field3192, class103.method691(var149, 22723).method1765(true) }), var161, class103.method691(var151, 22723).method1765(true), -108, var164, 20);
                    } else {
                        client.method1468(class103.method691(var149, 22723).method1765(true), var161, class103.method691(var151, 22723).method1765(true), 88, var164, 20);
                    }
                }
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 175) {
                int var165 = class207.field3730.method910(false);
                class123.method830(var165, 8404);
                class146.field2734[class203.method1395(class5.field68++, 31)] = class203.method1395(var165, 32767);
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 254) {
                class161.field2936 = 0;
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 244) {
                long var166 = class207.field3730.method943(arg0 ^ 0xFFFFB52D);
                class207.field3730.method929((byte) -3);
                long var168 = class207.field3730.method943(113);
                long var170 = (long) class207.field3730.method927(arg0 - 18965);
                boolean var172 = false;
                long var173 = (long) class207.field3730.method909(arg0 - 917789444);
                int var175 = class207.field3730.method920((byte) 67);
                long var176 = (var170 << 32) + var173;
                int var178 = 0;
                label1279: while (true) {
                    if (var178 >= 100) {
                        if (var175 <= 1) {
                            if ((!class262.field4583 || class203.field3632) && !class101.field1792) {
                                for (int var179 = 0; var179 < class262.field4582; var179++) {
                                    if (class4.field55[var179] == var166) {
                                        var172 = true;
                                        break label1279;
                                    }
                                }
                            } else {
                                var172 = true;
                            }
                        }
                        break;
                    }
                    if (class262.field4584[var178] == var176) {
                        var172 = true;
                        break;
                    }
                    var178++;
                }
                if (!var172 && class219.field3945 == 0) {
                    class262.field4584[class202.field3620] = var176;
                    class202.field3620 = (class202.field3620 + 1) % 100;
                    class265 var180 = class115.method751(class218.method1499(class207.field3730, (byte) -39).method1805(123));
                    if (var175 == 2 || var175 == 3) {
                        class133.method886(class103.method691(var168, 22723).method1765(true), class148.method1022(10, new class265[] { class214.field3832, class103.method691(var166, arg0 ^ 0x1257).method1765(true) }), var180, 9, arg0 - 19219);
                    } else if (var175 == 1) {
                        class133.method886(class103.method691(var168, 22723).method1765(true), class148.method1022(10, new class265[] { class179.field3192, class103.method691(var166, 22723).method1765(true) }), var180, 9, arg0 - 19201);
                    } else {
                        class133.method886(class103.method691(var168, 22723).method1765(true), class103.method691(var166, 22723).method1765(true), var180, 9, -111);
                    }
                }
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 141) {
                class265 var181 = class207.field3730.method942(false);
                if (var181.method1783(class210.field3772, 0)) {
                    class265 var182 = var181.method1772(var181.method1792(arg0 ^ 0x4A94, class57.field1165), 0, (byte) 120);
                    boolean var183 = false;
                    long var184 = var182.method1793(43);
                    for (int var186 = 0; var186 < class262.field4582; var186++) {
                        if (class4.field55[var186] == var184) {
                            var183 = true;
                            break;
                        }
                    }
                    if (!var183 && class219.field3945 == 0) {
                        class259.method1725(-85, class36.field845, 4, var182);
                    }
                } else if (var181.method1783(class236.field4117, 0)) {
                    class265 var187 = var181.method1772(var181.method1792(0, class57.field1165), 0, (byte) 103);
                    long var188 = var187.method1793(43);
                    boolean var190 = false;
                    for (int var191 = 0; var191 < class262.field4582; var191++) {
                        if (class4.field55[var191] == var188) {
                            var190 = true;
                            break;
                        }
                    }
                    if (!var190 && class219.field3945 == 0) {
                        class265 var192 = var181.method1772(var181.method1808((byte) -15) - 9, var181.method1792(0, class57.field1165) + 1, (byte) 81);
                        class259.method1725(arg0 - 19216, var192, 8, var187);
                    }
                } else if (var181.method1783(class133.field2404, 0)) {
                    class265 var217 = var181.method1772(var181.method1792(0, class57.field1165), 0, (byte) 64);
                    long var218 = var217.method1793(43);
                    boolean var220 = false;
                    for (int var221 = 0; var221 < class262.field4582; var221++) {
                        if (class4.field55[var221] == var218) {
                            var220 = true;
                            break;
                        }
                    }
                    if (!var220 && class219.field3945 == 0) {
                        class259.method1725(-87, class4.field66, 10, var217);
                    }
                } else if (var181.method1783(class121.field2157, 0)) {
                    class265 var193 = var181.method1772(var181.method1792(0, class121.field2157), 0, (byte) 105);
                    class259.method1725(arg0 ^ 0xFFFFB50B, var193, 11, class4.field66);
                } else if (var181.method1783(class22.field659, 0)) {
                    class265 var194 = var181.method1772(var181.method1792(0, class22.field659), 0, (byte) 88);
                    if (class219.field3945 == 0) {
                        class259.method1725(arg0 - 19149, var194, 12, class4.field66);
                    }
                } else if (var181.method1783(class58.field1189, 0)) {
                    class265 var195 = var181.method1772(var181.method1792(arg0 - 19092, class58.field1189), 0, (byte) 122);
                    if (class219.field3945 == 0) {
                        class259.method1725(arg0 - 19153, var195, 13, class4.field66);
                    }
                } else if (var181.method1783(class23.field685, arg0 - 19092)) {
                    class265 var212 = var181.method1772(var181.method1792(0, class57.field1165), 0, (byte) 72);
                    boolean var213 = false;
                    long var214 = var212.method1793(43);
                    for (int var216 = 0; var216 < class262.field4582; var216++) {
                        if (class4.field55[var216] == var214) {
                            var213 = true;
                            break;
                        }
                    }
                    if (!var213 && class219.field3945 == 0) {
                        class259.method1725(-127, class4.field66, 14, var212);
                    }
                } else if (var181.method1783(class93.field1660, arg0 ^ 0x4A94)) {
                    boolean var207 = false;
                    class265 var208 = var181.method1772(var181.method1792(0, class57.field1165), 0, (byte) 108);
                    long var209 = var208.method1793(43);
                    for (int var211 = 0; var211 < class262.field4582; var211++) {
                        if (class4.field55[var211] == var209) {
                            var207 = true;
                            break;
                        }
                    }
                    if (!var207 && class219.field3945 == 0) {
                        class259.method1725(-62, class4.field66, 15, var208);
                    }
                } else if (var181.method1783(class30.field765, 0)) {
                    class265 var196 = var181.method1772(var181.method1792(0, class57.field1165), 0, (byte) 94);
                    long var197 = var196.method1793(arg0 - 19049);
                    boolean var199 = false;
                    for (int var200 = 0; var200 < class262.field4582; var200++) {
                        if (class4.field55[var200] == var197) {
                            var199 = true;
                            break;
                        }
                    }
                    if (!var199 && class219.field3945 == 0) {
                        class259.method1725(-73, class4.field66, 16, var196);
                    }
                } else if (var181.method1783(class40.field919, 0)) {
                    class265 var201 = var181.method1772(var181.method1792(arg0 - 19092, class57.field1165), 0, (byte) 87);
                    long var202 = var201.method1793(arg0 ^ 0x4ABF);
                    boolean var204 = false;
                    for (int var205 = 0; var205 < class262.field4582; var205++) {
                        if (class4.field55[var205] == var202) {
                            var204 = true;
                            break;
                        }
                    }
                    if (!var204 && class219.field3945 == 0) {
                        class265 var206 = var181.method1772(var181.method1808((byte) -15) - 9, var181.method1792(0, class57.field1165) + 1, (byte) 74);
                        class259.method1725(-113, var206, 21, var201);
                    }
                } else {
                    class259.method1725(-69, var181, 0, class4.field66);
                }
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 130) {
                class122.method821(0);
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 197) {
                long var222 = class207.field3730.method943(114);
                long var224 = (long) class207.field3730.method927(arg0 - 18966);
                long var226 = (long) class207.field3730.method909(-917770352);
                int var228 = class207.field3730.method920((byte) 117);
                int var229 = class207.field3730.method927(126);
                long var230 = (var224 << 32) + var226;
                boolean var232 = false;
                int var233 = 0;
                label1364: while (true) {
                    if (var233 >= 100) {
                        if (var228 <= 1) {
                            for (int var234 = 0; var234 < class262.field4582; var234++) {
                                if (class4.field55[var234] == var222) {
                                    var232 = true;
                                    break label1364;
                                }
                            }
                        }
                        break;
                    }
                    if (class262.field4584[var233] == var230) {
                        var232 = true;
                        break;
                    }
                    var233++;
                }
                if (!var232 && class219.field3945 == 0) {
                    class262.field4584[class202.field3620] = var230;
                    class202.field3620 = (class202.field3620 + 1) % 100;
                    class265 var235 = class145.method1004(var229, 14015).method323((byte) -126, class207.field3730);
                    if (var228 == 2) {
                        client.method1468(class148.method1022(10, new class265[] { class214.field3832, class103.method691(var222, 22723).method1765(true) }), var229, (class265) null, arg0 - 18991, var235, 18);
                    } else if (var228 == 1) {
                        client.method1468(class148.method1022(10, new class265[] { class179.field3192, class103.method691(var222, 22723).method1765(true) }), var229, (class265) null, -119, var235, 18);
                    } else {
                        client.method1468(class103.method691(var222, arg0 ^ 0x1257).method1765(true), var229, (class265) null, 14, var235, 18);
                    }
                }
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 15) {
                int var236 = class207.field3730.method949(3933);
                int var237 = class207.field3730.method901((byte) -127);
                int var238 = class207.field3730.method927(126);
                int var239 = class207.field3730.method933(99);
                if (var238 == 65535) {
                    var238 = -1;
                }
                if (class241.method1610(arg0 - 19091, var237)) {
                    class6 var240 = class21.method204(var239, arg0 - 35349);
                    if (var240.field226) {
                        class108.method719(var238, 0, var236, var239);
                        class261 var242 = class54.method418(var238, 0);
                        class106.method708(var242.field4526, var242.field4511, var239, var242.field4514, (byte) -91);
                        class186.method1277(arg0 - 19082, var242.field4569, var239, var242.field4549, var242.field4501);
                    } else if (var238 == -1) {
                        var240.field102 = 0;
                        class93.field1650 = -1;
                        return true;
                    } else {
                        class261 var241 = class54.method418(var238, 0);
                        var240.field102 = 4;
                        var240.field222 = var238;
                        var240.field235 = var241.field4526 * 100 / var236;
                        var240.field123 = var241.field4511;
                        var240.field124 = var241.field4514;
                        class176.method1145((byte) -35, var240);
                    }
                }
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 209) {
                class52.method408(false);
                class15.field448 = class207.field3730.method920((byte) 124);
                class167.field3043 = class135.field2455;
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 70) {
                int var243 = class207.field3730.method900(107);
                int var244 = class207.field3730.method933(arg0 ^ 0xFFFFB52C);
                int var245 = class207.field3730.method900(arg0 - 19017);
                int var246 = class207.field3730.method901((byte) -127);
                if ((var244 >> 30) != 0) {
                    int var247 = ((var244 & 0xFFFDFCB) >> 14) - class64.field1248;
                    int var248 = (var244 & 0x3FFF) - class231.field4073;
                    int var249 = (var244 & 0x38319564) >> 28;
                    if (var247 >= 0 && var248 >= 0 && var247 < 104 && var248 < 104) {
                        int var250 = var248 * 128 + 64;
                        int var251 = var247 * 128 + 64;
                        class198 var252 = new class198(var243, var249, var251, var250, class67.method483(var250, -121, var251, var249) - var246, var245, class93.field1655);
                        class6.field99.method785(new class260(var252), -29);
                    }
                } else if (var244 >> 29 != 0) {
                    int var253 = var244 & 0xFFFF;
                    class23 var254 = class4.field67[var253];
                    if (var254 != null) {
                        if (var243 == 65535) {
                            var243 = -1;
                        }
                        boolean var255 = true;
                        if (var243 != -1 && var254.field2585 != -1 && class174.method1142(class210.method1441(var243, arg0 ^ 0x88D0DE24).field3720, false).field3888 < class174.method1142(class210.method1441(var254.field2585, -1999596368).field3720, false).field3888) {
                            var255 = false;
                        }
                        if (var255) {
                            var254.field2585 = var243;
                            var254.field2583 = var246;
                            var254.field2561 = class93.field1655 + var245;
                            var254.field2538 = 0;
                            var254.field2602 = 0;
                            if (var254.field2561 > class93.field1655) {
                                var254.field2602 = -1;
                            }
                            if (var254.field2585 != -1 && class93.field1655 == var254.field2561) {
                                int var256 = class210.method1441(var254.field2585, -1999596368).field3720;
                                if (var256 != -1) {
                                    class216 var257 = class174.method1142(var256, false);
                                    if (var257 != null && var257.field3890 != null) {
                                        class268.method1832(var257, false, 0, var254.field2600, -2, var254.field2564);
                                    }
                                }
                            }
                        }
                    }
                } else if (var244 >> 28 != 0) {
                    int var258 = var244 & 0xFFFF;
                    class122 var259;
                    if (class45.field1012 == var258) {
                        var259 = class214.field3827;
                    } else {
                        var259 = class209.field3766[var258];
                    }
                    if (var259 != null) {
                        boolean var260 = true;
                        if (var243 == 65535) {
                            var243 = -1;
                        }
                        if (var243 != -1 && var259.field2585 != -1 && class174.method1142(class210.method1441(var243, -1999596368).field3720, false).field3888 < class174.method1142(class210.method1441(var259.field2585, -1999596368).field3720, false).field3888) {
                            var260 = false;
                        }
                        if (var260) {
                            var259.field2561 = class93.field1655 + var245;
                            var259.field2585 = var243;
                            if (var259.field2585 == 65535) {
                                var259.field2585 = -1;
                            }
                            var259.field2538 = 0;
                            var259.field2602 = 0;
                            var259.field2583 = var246;
                            if (class93.field1655 < var259.field2561) {
                                var259.field2602 = -1;
                            }
                            if (var259.field2585 != -1 && class93.field1655 == var259.field2561) {
                                int var261 = class210.method1441(var259.field2585, -1999596368).field3720;
                                if (var261 != -1) {
                                    class216 var262 = class174.method1142(var261, false);
                                    if (var262 != null && var262.field3890 != null) {
                                        class268.method1832(var262, class214.field3827 == var259, 0, var259.field2600, -2, var259.field2564);
                                    }
                                }
                            }
                        }
                    }
                }
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 129) {
                int var263 = class207.field3730.method894(-118);
                int var264 = class207.field3730.method910(false);
                int var265 = class207.field3730.method944(-37828720);
                int var266 = class207.field3730.method933(-64);
                if (class241.method1610(arg0 - 19091, var264)) {
                    class82.method562(var266, var263, var265, arg0 - 19092);
                }
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 142) {
                int var267 = class207.field3730.method927(arg0 - 18965);
                class265 var268 = class207.field3730.method942(false);
                Object[] var269 = new Object[var268.method1808((byte) -15) + 1];
                for (int var270 = var268.method1808((byte) -15) - 1; var270 >= 0; var270--) {
                    if (var268.method1799(var270, -1) == 115) {
                        var269[var270 + 1] = class207.field3730.method942(false);
                    } else {
                        var269[var270 + 1] = Integer.valueOf(class207.field3730.method949(3933));
                    }
                }
                var269[0] = Integer.valueOf(class207.field3730.method949(3933));
                if (class241.method1610(1, var267)) {
                    class277 var271 = new class277();
                    var271.field4883 = var269;
                    class192.method1318(var271, 200000);
                }
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 221) {
                int var272 = class207.field3730.method910(false);
                int var273 = class207.field3730.method927(125);
                class265 var274 = class207.field3730.method942(false);
                if (class241.method1610(1, var273)) {
                    class125.method837(var274, var272, true);
                }
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 35) {
                int var275 = class207.field3730.method949(3933);
                int var276 = class207.field3730.method927(arg0 - 18965);
                int var277 = class207.field3730.method893(false);
                if (class241.method1610(1, var276)) {
                    class67.method480(var275, (byte) -19, var277);
                }
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 36) {
                class279.field4927 = class207.field3730.method920((byte) 45);
                class181.field3218 = class207.field3730.method920((byte) 57);
                for (int var278 = class181.field3218; var278 < (class181.field3218 + 8); var278++) {
                    for (int var280 = class279.field4927; var280 < (class279.field4927 + 8); var280++) {
                        if (class210.field3768[class216.field3902][var278][var280] != null) {
                            class210.field3768[class216.field3902][var278][var280] = null;
                            class131.method876(var280, arg0 - 19091, var278);
                        }
                    }
                }
                for (class142 var279 = (class142) class53.field1105.method789((byte) -80); var279 != null; var279 = (class142) class53.field1105.method787((byte) -76)) {
                    if (var279.field2638 >= class181.field3218 && (class181.field3218 + 8) > var279.field2638 && class279.field4927 <= var279.field2637 && (class279.field4927 + 8) > var279.field2637 && class216.field3902 == var279.field2641) {
                        var279.field2640 = 0;
                    }
                }
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 69) {
                class121.method808(arg0 - 19098, class207.field3730);
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 165) {
                class135.method912(true, 0);
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 107) {
                for (int var281 = 0; var281 < class256.field4385.length; var281++) {
                    if (class256.field4385[var281] != class182.field3228[var281]) {
                        class256.field4385[var281] = class182.field3228[var281];
                        class134.method888((byte) -125, var281);
                        class91.field1637[class203.method1395(31, class280.field4946++)] = var281;
                    }
                }
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 121) {
                int var282 = class207.field3730.method949(3933);
                int var283 = class207.field3730.method933(112);
                int var284 = class207.field3730.method927(126);
                if (class241.method1610(1, var284)) {
                    class181 var285 = (class181) class49.field1042.method1842(-1, (long) var282);
                    class181 var286 = (class181) class49.field1042.method1842(-1, (long) var283);
                    if (var286 != null) {
                        class40.method338(var286, -2, var285 == null || var285.field3217 != var286.field3217);
                    }
                    if (var285 != null) {
                        var285.method97(158);
                        class49.field1042.method1838((long) var283, var285, (byte) 8);
                    }
                    class6 var287 = class21.method204(var282, arg0 - 35349);
                    if (var287 != null) {
                        class176.method1145((byte) -33, var287);
                    }
                    class6 var288 = class21.method204(var283, arg0 ^ 0xFFFF8AEB);
                    if (var288 != null) {
                        class176.method1145((byte) 63, var288);
                        class126.method841(true, (byte) 96, var288);
                    }
                    if (class8.field271 != -1) {
                        class93.method637(1, class8.field271, 104);
                    }
                }
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 160) {
                int var289 = class207.field3730.method901((byte) -127);
                int var290 = class207.field3730.method915((byte) 101);
                int var291 = class207.field3730.method900(78);
                if (class241.method1610(1, var291)) {
                    class39.method329(var289, var290, 1);
                }
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 33) {
                int var292 = class207.field3730.method910(false);
                int var293 = class207.field3730.method949(3933);
                int var294 = class207.field3730.method918(-98);
                if (class241.method1610(1, var292)) {
                    class164.method1084(var294, 5, var293);
                }
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 27) {
                byte[] var295 = new byte[class221.field3966];
                class207.field3730.method1857(var295, class221.field3966, 0, (byte) 121);
                class265 var296 = class7.method51(0, 12047, class221.field3966, var295);
                if (class49.field1044 == null && class226.field4010 == 3 || !class226.field4011.startsWith("win") || class56.field1137) {
                    class105.method703((byte) -85, true, var296);
                } else {
                    class236.field4126 = var296;
                    class10.field340 = true;
                    class119.field2106 = class281.field4957.method1536(30581, new String(var296.method1787(0), "ISO-8859-1"));
                }
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 102) {
                long var297 = class207.field3730.method943(arg0 - 18965);
                boolean var299 = false;
                if ((var297 & Long.MIN_VALUE) != 0L) {
                    var299 = true;
                }
                int var300 = class207.field3730.method927(125);
                byte var301 = class207.field3730.method929((byte) -3);
                if (var299) {
                    if (class154.field2856 == 0) {
                        class93.field1650 = -1;
                        return true;
                    }
                    long var307 = var297 & Long.MAX_VALUE;
                    boolean var309 = false;
                    int var310;
                    for (var310 = 0; var310 < class154.field2856 && (class198.field3547[var310].field393 != var307 || class198.field3547[var310].field1989 != var300); var310++) {
                    }
                    if (class154.field2856 > var310) {
                        while (var310 < class154.field2856 - 1) {
                            class198.field3547[var310] = class198.field3547[var310 + 1];
                            var310++;
                        }
                        class154.field2856--;
                        class198.field3547[class154.field2856] = null;
                    }
                } else {
                    class265 var302 = class207.field3730.method942(false);
                    class113 var303 = new class113();
                    var303.field393 = var297;
                    var303.field1987 = class103.method691(var303.field393, arg0 ^ 0x1257);
                    var303.field1989 = var300;
                    var303.field1993 = var301;
                    var303.field1985 = var302;
                    int var304;
                    for (var304 = class154.field2856 - 1; var304 >= 0; var304--) {
                        int var305 = class198.field3547[var304].field1987.method1766(var303.field1987, (byte) 108);
                        if (var305 == 0) {
                            class198.field3547[var304].field1989 = var300;
                            class198.field3547[var304].field1993 = var301;
                            class198.field3547[var304].field1985 = var302;
                            class93.field1650 = -1;
                            if (class276.field4873 == var297) {
                                class236.field4123 = var301;
                            }
                            class275.field4852 = class135.field2455;
                            return true;
                        }
                        if (var305 < 0) {
                            break;
                        }
                    }
                    if (class198.field3547.length <= class154.field2856) {
                        class93.field1650 = -1;
                        return true;
                    }
                    for (int var306 = class154.field2856 - 1; var306 > var304; var306--) {
                        class198.field3547[var306 + 1] = class198.field3547[var306];
                    }
                    if (class154.field2856 == 0) {
                        class198.field3547 = new class113[100];
                    }
                    class198.field3547[var304 + 1] = var303;
                    class154.field2856++;
                    if (class276.field4873 == var297) {
                        class236.field4123 = var301;
                    }
                }
                class275.field4852 = class135.field2455;
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 106) {
                class23.method224((byte) -115, class207.field3730, class221.field3966, class281.field4957);
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 44) {
                int var311 = class207.field3730.method949(3933);
                class59.field1192 = class281.field4957.method1537(0, var311);
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 169) {
                int var312 = class207.field3730.method915((byte) 82);
                int var313 = (var312 & 0x3A50530E) >> 28;
                int var314 = var312 >> 14 & 0x3FFF;
                int var315 = var312 & 0x3FFF;
                int var316 = class207.field3730.method910(false);
                if (var316 == 65535) {
                    var316 = -1;
                }
                int var317 = class207.field3730.method920((byte) 76);
                int var318 = var315 - class231.field4073;
                int var319 = var317 >> 2;
                int var320 = var317 & 0x3;
                int var321 = var314 - class64.field1248;
                int var322 = class49.field1048[var319];
                class153.method1046(var318, var319, var316, var313, var321, var322, 87, var320);
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 239) {
                int var323 = class207.field3730.method900(62);
                byte var324 = class207.field3730.method929((byte) -3);
                class1.method11((byte) 126, var323, var324);
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 104) {
                int var325 = class207.field3730.method900(100);
                int var326 = class207.field3730.method915((byte) 85);
                if (class241.method1610(1, var325)) {
                    int var327 = 0;
                    if (class214.field3827.field2194 != null) {
                        var327 = class214.field3827.field2194.method516(1854271604);
                    }
                    class237.method1583(var327, var326, false, 3);
                }
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 185) {
                class263.field4585 = class207.field3730.method901((byte) -128) * 30;
                class167.field3043 = class135.field2455;
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 152) {
                int var328 = class207.field3730.method910(false);
                int var329 = class207.field3730.method901((byte) -127);
                int var330 = class207.field3730.method910(false);
                int var331 = class207.field3730.method906(2);
                int var332 = class207.field3730.method901((byte) -127);
                if (class241.method1610(1, var328)) {
                    class106.method708(var329, var332, var331, var330, (byte) -90);
                }
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 241) {
                int var333 = class207.field3730.method901((byte) -128);
                int var334 = class207.field3730.method927(125);
                int var335 = class207.field3730.method893(false);
                if (class241.method1610(arg0 - 19091, var333)) {
                    if (var335 == 2) {
                        class199.method1373(arg0 - 19018);
                    }
                    class8.field271 = var334;
                    class281.method1914(-1, var334);
                    class232.method1568(false, true);
                    class116.method778(class8.field271, (byte) 101);
                    for (int var336 = 0; var336 < 100; var336++) {
                        class135.field2481[var336] = true;
                    }
                }
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 51) {
                if (class8.field271 != -1) {
                    class93.method637(0, class8.field271, 104);
                }
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 237) {
                class181.field3218 = class207.field3730.method914(0);
                class279.field4927 = class207.field3730.method920((byte) 111);
                while (class221.field3966 > class207.field3730.field2449) {
                    class93.field1650 = class207.field3730.method920((byte) 77);
                    class137.method951(arg0 ^ 0x4AE0);
                }
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 143) {
                int var337 = class207.field3730.method901((byte) -128);
                int var338 = class207.field3730.method925(-3);
                class264.method1762(500, var338, var337);
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 99) {
                int var339 = class207.field3730.method925(-3);
                int var340 = class207.field3730.method910(false);
                int var341 = class207.field3730.method901((byte) -127);
                class23 var342 = class4.field67[var341];
                if (var342 != null) {
                    class275.method1877(var339, var342, var340, (byte) -87);
                }
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 31 || class93.field1650 == 145 || class93.field1650 == 136 || class93.field1650 == 84 || class93.field1650 == 131 || class93.field1650 == 59 || class93.field1650 == 94 || class93.field1650 == 97 || class93.field1650 == 76 || class93.field1650 == 139 || class93.field1650 == 111 || class93.field1650 == 253) {
                class137.method951(73);
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 186) {
                class168.method1109(class207.field3730.method942(false), 0);
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 45) {
                int var343 = class207.field3730.method927(125);
                int var344 = class207.field3730.method893(false);
                int var345 = class207.field3730.method901((byte) -128);
                if (class241.method1610(1, var343)) {
                    class39.method329(var345, var344, arg0 - 19091);
                }
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 216) {
                int var346 = class207.field3730.method906(2);
                int var347 = class207.field3730.method927(arg0 ^ 0x4AEA);
                int var348 = class207.field3730.method927(126);
                if (var348 == 65535) {
                    var348 = -1;
                }
                if (class241.method1610(1, var347)) {
                    class237.method1583(var348, var346, false, 1);
                }
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 101) {
                class52.method408(false);
                class200.field3579 = class207.field3730.method894(-108);
                class93.field1650 = -1;
                class167.field3043 = class135.field2455;
                return true;
            } else if (class93.field1650 == 88) {
                int var349 = class207.field3730.method949(arg0 - 15159);
                int var350 = class207.field3730.method927(125);
                class6 var351;
                if (var349 >= 0) {
                    var351 = class21.method204(var349, -16257);
                } else {
                    var351 = null;
                }
                if (var349 < -70000) {
                    var350 += 32768;
                }
                while (class221.field3966 > class207.field3730.field2449) {
                    int var352 = class207.field3730.method947(27126);
                    int var353 = class207.field3730.method927(arg0 ^ 0x4AEB);
                    int var354 = 0;
                    if (var353 != 0) {
                        var354 = class207.field3730.method920((byte) 40);
                        if (var354 == 255) {
                            var354 = class207.field3730.method949(3933);
                        }
                    }
                    if (var351 != null && var352 >= 0 && var351.field92.length > var352) {
                        var351.field92[var352] = var353;
                        var351.field218[var352] = var354;
                    }
                    class276.method1885(var350, -13313, var354, var352, var353 - 1);
                }
                if (var351 != null) {
                    class176.method1145((byte) -78, var351);
                }
                class52.method408(false);
                class146.field2734[class203.method1395(31, class5.field68++)] = class203.method1395(32767, var350);
                class93.field1650 = -1;
                return true;
            } else if (class93.field1650 == 98) {
                class203.method1393((byte) -107);
                class52.method408(false);
                class93.field1650 = -1;
                class280.field4946 += 32;
                return true;
            } else {
                class4.method28(97, (Throwable) null, "T1 - " + class93.field1650 + "," + class279.field4931 + "," + class178.field3168 + " - " + class221.field3966);
                class270.method1855(-5);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)V")
    public static void method116(byte arg0) {
        field465 = null;
        field460 = null;
        field459 = null;
        if (arg0 > -108) {
            field460 = null;
        }
        field461 = null;
        field457 = null;
        field455 = null;
        field462 = null;
        field456 = null;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIII)Z")
    public static final boolean method117(int arg0, int arg1, int arg2, int arg3) {
        if (class124.method834(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class155.method1053(var4 + 1, class279.field4936[arg0][arg1][arg2] + arg3, var5 + 1) && class155.method1053(var4 + 128 - 1, class279.field4936[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class155.method1053(var4 + 128 - 1, class279.field4936[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class155.method1053(var4 + 1, class279.field4936[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)V")
    public static final void method118(int arg0) {
        class79.field1500 &= 0x7FF;
        if (class118.field2087 < 128) {
            class118.field2087 = 128;
        }
        if (class118.field2087 > 383) {
            class118.field2087 = 383;
        }
        int var1 = class169.field3067 >> 7;
        int var2 = class230.field4060 >> 7;
        int var3 = class67.method483(class230.field4060, arg0 - 116, class169.field3067, class216.field3902);
        field458++;
        int var4 = 0;
        if (~var1 < arg0 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= (var1 + 4); var5++) {
                for (int var6 = var2 - 4; var6 <= (var2 + 4); var6++) {
                    int var7 = class216.field3902;
                    if (var7 < 3 && (class230.field4064[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = (class48.field1023[var7][var5][var6] & 0xFF) * 8 + (var3 - class279.field4936[var7][var5][var6]);
                    if (var4 < var8) {
                        var4 = var8;
                    }
                }
            }
        }
        int var9 = var4 * 192;
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (class57.field1177 < var9) {
            class57.field1177 += (var9 - class57.field1177) / 24;
        } else if (var9 < class57.field1177) {
            class57.field1177 += (var9 - class57.field1177) / 80;
            return;
        }
    }
}
