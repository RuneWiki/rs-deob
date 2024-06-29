import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class81 {

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "[I")
    public static int[] field1005 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "I")
    public static int field1007 = 0;

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "I")
    public static int field1006;

    @OriginalMember(owner = "client!ho", name = "e", descriptor = "I")
    public static int field1009;

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "[S")
    public static short[] field1008;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)V", line = 17)
    public static void method505(int arg0) {
        field1005 = null;
        if (arg0 != -9) {
            method505(71);
        }
        field1008 = null;
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(I)Z", line = 31)
    public static final boolean method506(int arg0) throws IOException {
        field1009++;
        if (class421.field6216 == null) {
            return false;
        }
        int var1 = class421.field6216.method1102(30000);
        if (var1 == 0) {
            return false;
        }
        if (class208.field3345 == -1) {
            class421.field6216.method1103(0, class158.field2514.field3066, 1, 0);
            class158.field2514.field3044 = 0;
            class208.field3345 = class158.field2514.method2227((byte) -101);
            class345.field5331 = class373.field5634[class208.field3345];
            var1--;
        }
        if (class345.field5331 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class421.field6216.method1103(0, class158.field2514.field3066, 1, 0);
            var1--;
            class345.field5331 = class158.field2514.field3066[0] & 0xFF;
        }
        if (class345.field5331 == -2) {
            if (var1 <= 1) {
                return false;
            }
            class421.field6216.method1103(arg0 - 237, class158.field2514.field3066, 2, 0);
            class158.field2514.field3044 = 0;
            class345.field5331 = class158.field2514.method1272((byte) -104);
            var1 -= 2;
        }
        if (class345.field5331 > var1) {
            return false;
        }
        class158.field2514.field3044 = 0;
        class421.field6216.method1103(arg0 - 237, class158.field2514.field3066, class345.field5331, 0);
        class140.field2165 = 0;
        class433.field6397 = class281.field4507;
        class281.field4507 = class112.field1556;
        class112.field1556 = class208.field3345;
        if (class208.field3345 == 190) {
            int var2 = class158.field2514.method1272((byte) -96);
            if (class77.method481(var2, -61)) {
                class223.method1595(true);
            }
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 82) {
            int var3 = class158.field2514.method1272((byte) -82);
            int var4 = class158.field2514.method1272((byte) -128);
            int var5 = class158.field2514.method1328(255);
            if (class77.method481(var4, -82)) {
                class12.method119(var3, var5, false);
            }
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 161) {
            int var6 = class158.field2514.method1324(arg0 - 22646);
            int var7 = class158.field2514.method1324(arg0 ^ 0xFFFFA89A);
            int var8 = class158.field2514.method1284(8388607);
            int var9 = class158.field2514.method1272((byte) -92);
            if (class77.method481(var9, -104)) {
                class43.method289(var6, var7, var8, (byte) 114);
            }
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == arg0) {
            class287.method1941(false, true);
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 91) {
            int var10 = class158.field2514.method1273((byte) -60);
            int var11 = class158.field2514.method1314(true);
            int var12 = class158.field2514.method1288((byte) 103);
            int var13 = class158.field2514.method1273((byte) -5);
            int var14 = class158.field2514.method1314(true);
            if (class77.method481(var14, -120)) {
                class423.method2629(8, var12, var11, var13, var10);
            }
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 9) {
            for (int var15 = 0; var15 < class403.field6014.length; var15++) {
                if (class403.field6014[var15] != class391.field5869[var15]) {
                    class403.field6014[var15] = class391.field5869[var15];
                    class435.method2680(var15, (byte) -2);
                    class135.field2115[class37.method242(class91.field1128++, 31)] = var15;
                }
            }
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 143) {
            int var16 = class158.field2514.method1288((byte) 91);
            int var17 = class158.field2514.method1279(255);
            int var18 = class158.field2514.method1273((byte) -20);
            if (class77.method481(var18, arg0 ^ 0xFFFFFF46)) {
                class300.method2022(var17, var16, (byte) 45);
            }
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 211) {
            int var19 = class158.field2514.method1272((byte) -89);
            int var20 = class158.field2514.method1272((byte) -100);
            int var21 = class158.field2514.method1328(255);
            if (class77.method481(var20, arg0 ^ 0xFFFFFF24)) {
                class171.method1192(24554, var21, var19);
            }
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 204) {
            class234.field3907 = class158.field2514.method1322(false);
            class245.field4027 = class158.field2514.method1322(false);
            class421.field6221 = class158.field2514.method1322(false);
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 66) {
            int var22 = class158.field2514.method1272((byte) -106);
            int var23 = class158.field2514.method1322(false);
            int var24 = class158.field2514.method1322(false);
            int var25 = class158.field2514.method1322(false);
            int var26 = class158.field2514.method1322(false);
            int var27 = class158.field2514.method1272((byte) -114);
            if (class77.method481(var22, -80)) {
                class8.field107[var23] = true;
                class145.field2278[var23] = var24;
                class343.field5290[var23] = var25;
                class98.field1375[var23] = var26;
                class403.field6013[var23] = var27;
            }
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 26) {
            int var28 = class158.field2514.method1279(255);
            int var29 = class158.field2514.method1313(-82);
            int var30 = class158.field2514.method1273((byte) -40);
            if (class77.method481(var28, -115)) {
                if (var29 == 2) {
                    class447.method2761(9916);
                }
                class306.field4847 = var30;
                class111.method823(var30, -1);
                class354.method2307(arg0 - 129, false);
                class17.method136(class306.field4847);
                for (int var31 = 0; var31 < 100; var31++) {
                    class267.field4296[var31] = true;
                }
            }
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 96) {
            boolean var32 = class158.field2514.method1322(false) == 1;
            String var33 = class158.field2514.method1270(-9970);
            String var34 = var33;
            if (var32) {
                var34 = class158.field2514.method1270(-9970);
            }
            long var35 = (long) class158.field2514.method1272((byte) -54);
            long var37 = (long) class158.field2514.method1275(-1);
            int var39 = class158.field2514.method1322(false);
            long var40 = (var35 << 32) + var37;
            boolean var42 = false;
            int var43 = 0;
            while (true) {
                if (var43 >= 100) {
                    if (var39 <= 1) {
                        if (!(!class52.field651 || class277.field4416) || class333.field5199) {
                            var42 = true;
                        } else if (class309.method2071(93, var34)) {
                            var42 = true;
                        }
                    }
                    break;
                }
                if (class132.field2072[var43] == var40) {
                    var42 = true;
                    break;
                }
                var43++;
            }
            if (!var42 && class413.field6110 == 0) {
                class132.field2072[class68.field858] = var40;
                class68.field858 = (class68.field858 + 1) % 100;
                String var44 = class348.method2272(class341.method2238(true, class201.method1398((byte) 110, class158.field2514)), true);
                if (var39 == 2) {
                    class102.method764(7, (String) null, -4461, "<img=1>" + var33, 0, "<img=1>" + var34, -1, var44);
                } else if (var39 == 1) {
                    class102.method764(7, (String) null, arg0 ^ 0xFFFFEE7E, "<img=0>" + var33, 0, "<img=0>" + var34, -1, var44);
                } else {
                    class102.method764(3, (String) null, arg0 - 4698, var33, 0, var34, -1, var44);
                }
            }
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 53) {
            int var45 = class158.field2514.method1279(arg0 ^ 0x12);
            String var46 = class158.field2514.method1270(arg0 ^ 0xFFFFD9E3);
            int var47 = class158.field2514.method1284(8388607);
            if (class77.method481(var45, -126)) {
                class302.method2029(var47, var46, 10026);
            }
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 68) {
            class424.method2634(-1);
            class58.field735 = class158.field2514.method1322(false);
            class208.field3345 = -1;
            class378.field5705 = class223.field3724;
            return true;
        } else if (class208.field3345 == 128) {
            int var48 = class158.field2514.method1322(false);
            boolean var49 = (var48 & 0x1) == 1;
            String var50 = class158.field2514.method1270(-9970);
            String var51 = class158.field2514.method1270(-9970);
            if (var51.equals("")) {
                var51 = var50;
            }
            String var52 = class158.field2514.method1270(arg0 - 10207);
            String var53 = class158.field2514.method1270(-9970);
            if (var53.equals("")) {
                var53 = var52;
            }
            if (var49) {
                for (int var54 = 0; var54 < class418.field6190; var54++) {
                    if (class315.field4955[var54].equals(var53)) {
                        class269.field4317[var54] = var50;
                        class315.field4955[var54] = var51;
                        class285.field4576[var54] = var52;
                        class21.field282[var54] = var53;
                        break;
                    }
                }
            } else {
                class269.field4317[class418.field6190] = var50;
                class315.field4955[class418.field6190] = var51;
                class285.field4576[class418.field6190] = var52;
                class21.field282[class418.field6190] = var53;
                class396.field5927[class418.field6190] = class37.method242(var48, 2) == 2;
                class418.field6190++;
            }
            class208.field3345 = -1;
            class179.field2921 = class223.field3724;
            return true;
        } else if (class208.field3345 == 202) {
            class193.field3143 = class158.field2514.method1322(false);
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 14) {
            class424.method2634(-1);
            class77.field964 = class158.field2514.method1276((byte) -86);
            class208.field3345 = -1;
            class378.field5705 = class223.field3724;
            return true;
        } else if (class208.field3345 == 61) {
            int var55 = class158.field2514.method1273((byte) -72);
            class321.method2128((byte) -111, var55);
            class280.field4488[class37.method242(31, class91.field1125++)] = class37.method242(32767, var55);
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 92) {
            int var56 = class158.field2514.method1272((byte) -55);
            String var57 = class158.field2514.method1270(arg0 - 10207);
            Object[] var58 = new Object[var57.length() + 1];
            for (int var59 = var57.length() - 1; var59 >= 0; var59--) {
                if (var57.charAt(var59) == 's') {
                    var58[var59 + 1] = class158.field2514.method1270(class121.method873(arg0, -9757));
                } else {
                    var58[var59 + 1] = Integer.valueOf(class158.field2514.method1284(8388607));
                }
            }
            var58[0] = Integer.valueOf(class158.field2514.method1284(8388607));
            if (class77.method481(var56, -49)) {
                class150 var60 = new class150();
                var60.field2352 = var58;
                class17.method135(var60);
            }
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 252) {
            class364.field5543 = class158.field2514.method1322(false);
            class208.field3345 = -1;
            class179.field2921 = class223.field3724;
            return true;
        } else if (class208.field3345 == 12) {
            if (class306.field4847 != -1) {
                class39.method266(0, -4174, class306.field4847);
            }
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 194) {
            boolean var61 = class158.field2514.method1322(false) == 1;
            String var62 = class158.field2514.method1270(arg0 - 10207);
            String var63 = var62;
            if (var61) {
                var63 = class158.field2514.method1270(-9970);
            }
            long var64 = (long) class158.field2514.method1272((byte) -115);
            long var66 = (long) class158.field2514.method1275(-1);
            int var68 = class158.field2514.method1322(false);
            int var69 = class158.field2514.method1272((byte) -79);
            long var70 = (var64 << 32) + var66;
            boolean var72 = false;
            int var73 = 0;
            while (true) {
                if (var73 >= 100) {
                    if (var68 <= 1 && class309.method2071(84, var63)) {
                        var72 = true;
                    }
                    break;
                }
                if (class132.field2072[var73] == var70) {
                    var72 = true;
                    break;
                }
                var73++;
            }
            if (!var72 && class413.field6110 == 0) {
                class132.field2072[class68.field858] = var70;
                class68.field858 = (class68.field858 + 1) % 100;
                String var74 = class344.method2253((byte) -120, var69).method1242((byte) 32, class158.field2514);
                if (var68 == 2) {
                    class102.method764(18, (String) null, arg0 - 4698, "<img=1>" + var62, 0, "<img=1>" + var63, var69, var74);
                } else if (var68 == 1) {
                    class102.method764(18, (String) null, -4461, "<img=0>" + var62, 0, "<img=0>" + var63, var69, var74);
                } else {
                    class102.method764(18, (String) null, -4461, var62, 0, var63, var69, var74);
                }
            }
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 225) {
            int var75 = class158.field2514.method1299(-113);
            int var76 = class158.field2514.method1284(8388607);
            int var77 = class158.field2514.method1322(false);
            String var78 = "";
            String var79 = var78;
            if ((var77 & 0x1) != 0) {
                var78 = class158.field2514.method1270(-9970);
                if ((var77 & 0x2) == 0) {
                    var79 = var78;
                } else {
                    var79 = class158.field2514.method1270(-9970);
                }
            }
            String var80 = class158.field2514.method1270(-9970);
            if (var75 == 99) {
                class394.method2489((byte) -116, var80);
            } else if (var79.equals("") || !class309.method2071(90, var79)) {
                class429.method2656(var75, var76, arg0 ^ 0xFFFFFF12, var78, var80, var79);
            } else {
                class208.field3345 = -1;
                return true;
            }
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 156) {
            class165.method1159(true);
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 206) {
            int var81 = class158.field2514.method1273((byte) -44);
            int var82 = class158.field2514.method1272((byte) -59);
            byte var83 = class158.field2514.method1327((byte) -103);
            if (class77.method481(var81, -114)) {
                class12.method119(var82, var83, false);
            }
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 83) {
            int var84 = class158.field2514.method1272((byte) -69);
            int var85 = class158.field2514.method1284(8388607);
            if (class77.method481(var84, -97)) {
                class196 var86 = (class196) class392.field5891.method1770(-880, (long) var85);
                if (var86 != null) {
                    class140.method1020(true, false, false, var86);
                }
                if (class143.field2262 != null) {
                    class336.method2219((byte) 6, class143.field2262);
                    class143.field2262 = null;
                }
            }
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 58) {
            int var87 = class158.field2514.method1272((byte) -58);
            int var88 = class158.field2514.method1272((byte) -87);
            int var89 = class158.field2514.method1272((byte) -118);
            int var90 = class158.field2514.method1272((byte) -73);
            if (class77.method481(var87, arg0 - 324) && class203.field3266[var88] != null) {
                for (int var91 = var89; var91 < var90; var91++) {
                    int var92 = class158.field2514.method1275(arg0 ^ 0xFFFFFF12);
                    if (class203.field3266[var88].length > var91 && class203.field3266[var88][var91] != null) {
                        class203.field3266[var88][var91].field2742 = var92;
                    }
                }
            }
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 184) {
            int var93 = class158.field2514.method1328(255);
            int var94 = class158.field2514.method1273((byte) -70);
            class107.method809(var94, (byte) -109, var93);
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 22 || class208.field3345 == 201 || class208.field3345 == 232 || class208.field3345 == 125 || class208.field3345 == 142 || class208.field3345 == 159 || class208.field3345 == 157 || class208.field3345 == 38 || class208.field3345 == 73 || class208.field3345 == 249 || class208.field3345 == 80 || class208.field3345 == 119 || class208.field3345 == 199 || class208.field3345 == 227 || class208.field3345 == 196) {
            class97.method733(51);
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 220) {
            int var95 = class158.field2514.method1328(255);
            int var96 = class158.field2514.method1314(true);
            int var97 = class158.field2514.method1328(arg0 ^ 0x12);
            if (class77.method481(var96, -87)) {
                class196 var98 = (class196) class392.field5891.method1770(-880, (long) var95);
                class196 var99 = (class196) class392.field5891.method1770(arg0 ^ 0xFFFFFC7D, (long) var97);
                if (var99 != null) {
                    class140.method1020(var98 == null || var98.field3171 != var99.field3171, false, false, var99);
                }
                if (var98 != null) {
                    var98.method1120(-117);
                    class392.field5891.method1766((long) var97, var98, -80);
                }
                class172 var100 = class196.method1375(var95, (byte) -56);
                if (var100 != null) {
                    class336.method2219((byte) 6, var100);
                }
                class172 var101 = class196.method1375(var97, (byte) -56);
                if (var101 != null) {
                    class336.method2219((byte) 6, var101);
                    class68.method431(1099639664, var101, true);
                }
                if (class306.field4847 != -1) {
                    class39.method266(1, arg0 - 4411, class306.field4847);
                }
            }
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 30) {
            class424.method2634(-1);
            int var102 = class158.field2514.method1326(true);
            int var103 = class158.field2514.method1322(false);
            int var104 = class158.field2514.method1285((byte) -33);
            class209.field3354[var104] = var102;
            class205.field3309[var104] = var103;
            class388.field5849[var104] = 1;
            int var105 = class344.field5299[var104] - 1;
            for (int var106 = 0; var106 < var105; var106++) {
                if (var102 >= class140.field2172[var106]) {
                    class388.field5849[var104] = var106 + 2;
                }
            }
            class441.field6453[class37.method242(class440.field6451++, 31)] = var104;
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 121) {
            if (class395.field5920 != null) {
                class50.method319(false, -1, class317.field4970, arg0 ^ 0x286E, -1);
            }
            byte[] var107 = new byte[class345.field5331];
            class158.field2514.method2230(var107, (byte) -19, 0, class345.field5331);
            String var108 = class284.method1928(0, arg0 ^ 0xFFFFFF12, class345.field5331, var107);
            class312.method2092(3, class63.field822, class128.field2035 == 1, var108, true);
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 8) {
            int var109 = class158.field2514.method1272((byte) -101);
            int var110 = class158.field2514.method1322(false);
            int var111 = class158.field2514.method1322(false);
            int var112 = class158.field2514.method1272((byte) -73);
            int var113 = class158.field2514.method1322(false);
            int var114 = class158.field2514.method1322(false);
            if (class77.method481(var109, -65)) {
                class297.method2003(var113, var111, true, (byte) 77, var110, var112, var114);
            }
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 215) {
            int var115 = class158.field2514.method1279(255);
            int var116 = class158.field2514.method1273((byte) -69);
            int var117 = class158.field2514.method1328(255);
            int var118 = class158.field2514.method1314(true);
            if (class77.method481(var115, -57)) {
                class126.method925(arg0 ^ 0xFFFFFF44, (var118 << 16) + var116, var117);
            }
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 138) {
            int var119 = class158.field2514.method1279(255);
            int var120 = class158.field2514.method1279(arg0 + 18);
            String var121 = class158.field2514.method1270(-9970);
            if (class77.method481(var119, -89)) {
                class39.method264(var121, var120, 31606);
            }
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 146) {
            boolean var122 = class158.field2514.method1322(false) == 1;
            String var123 = class158.field2514.method1270(-9970);
            String var124 = var123;
            if (var122) {
                var124 = class158.field2514.method1270(arg0 - 10207);
            }
            long var125 = class158.field2514.method1290(false);
            long var127 = (long) class158.field2514.method1272((byte) -107);
            long var129 = (long) class158.field2514.method1275(-1);
            int var131 = class158.field2514.method1322(false);
            int var132 = class158.field2514.method1272((byte) -111);
            long var133 = (var127 << 32) + var129;
            boolean var135 = false;
            int var136 = 0;
            while (true) {
                if (var136 >= 100) {
                    if (var131 <= 1 && class309.method2071(84, var124)) {
                        var135 = true;
                    }
                    break;
                }
                if (class132.field2072[var136] == var133) {
                    var135 = true;
                    break;
                }
                var136++;
            }
            if (!var135 && class413.field6110 == 0) {
                class132.field2072[class68.field858] = var133;
                class68.field858 = (class68.field858 + 1) % 100;
                String var137 = class344.method2253((byte) -100, var132).method1242((byte) 65, class158.field2514);
                if (var131 == 2) {
                    class102.method764(20, class133.method977(var125, -95), -4461, "<img=1>" + var123, 0, "<img=1>" + var124, var132, var137);
                } else if (var131 == 1) {
                    class102.method764(20, class133.method977(var125, -59), -4461, "<img=0>" + var123, 0, "<img=0>" + var124, var132, var137);
                } else {
                    class102.method764(20, class133.method977(var125, -54), -4461, var123, 0, var124, var132, var137);
                }
            }
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 150) {
            class287.method1941(true, true);
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 170) {
            class418.field6190 = class158.field2514.method1322(false);
            for (int var138 = 0; var138 < class418.field6190; var138++) {
                class269.field4317[var138] = class158.field2514.method1270(-9970);
                class315.field4955[var138] = class158.field2514.method1270(-9970);
                if (class315.field4955[var138].equals("")) {
                    class315.field4955[var138] = class269.field4317[var138];
                }
                class285.field4576[var138] = class158.field2514.method1270(arg0 - 10207);
                class21.field282[var138] = class158.field2514.method1270(-9970);
                if (class21.field282[var138].equals("")) {
                    class21.field282[var138] = class285.field4576[var138];
                }
                class396.field5927[var138] = false;
            }
            class179.field2921 = class223.field3724;
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 18) {
            int var139 = class158.field2514.method1322(false);
            if (class158.field2514.method1322(false) == 0) {
                class143.field2261[var139] = new class199();
            } else {
                class158.field2514.field3044--;
                class143.field2261[var139] = new class199(class158.field2514);
            }
            class208.field3345 = -1;
            class50.field601 = class223.field3724;
            return true;
        } else if (class208.field3345 == 94) {
            if (class345.field5331 == 0) {
                class61.field790 = class277.field4418;
            } else {
                class61.field790 = class158.field2514.method1270(-9970);
            }
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 213) {
            int var140 = class158.field2514.method1273((byte) -113);
            int var141 = class158.field2514.method1273((byte) -57);
            int var142 = class158.field2514.method1273((byte) -119);
            int var143 = class158.field2514.method1284(8388607);
            if ((var143 >> 30) != 0) {
                int var144 = (var143 & 0x382554D6) >> 28;
                int var145 = (var143 >> 14 & 0x3FFF) - class409.field6048;
                int var146 = (var143 & 0x3FFF) - class444.field6481;
                if (var145 >= 0 && var146 >= 0 && class80.field1003 > var145 && class380.field5751 > var146) {
                    int var147 = var145 * 128 + 64;
                    int var148 = var146 * 128 + 64;
                    class321 var149 = new class321(var142, 0, class183.field2987, var144, var147, class58.method386(var144, (byte) -90, var147, var148) - var141, var148, var145, var145, var146, var146);
                    class236.field3946.method245(arg0 ^ 0x119, new class94(var149));
                }
            } else if ((var143 >> 29) != 0) {
                int var150 = var143 & 0xFFFF;
                class50 var151 = class39.field499[var150];
                if (var151 != null) {
                    if (var142 == 65535) {
                        var142 = -1;
                    }
                    boolean var152 = true;
                    if (var142 != -1 && var151.field1873 != -1) {
                        if (var151.field1873 == var142) {
                            class379 var157 = class115.method839((byte) -57, var142);
                            if (var157.field5731 && var157.field5734 != -1) {
                                class417 var158 = class156.method1099(var157.field5734, arg0 - 119);
                                int var159 = var158.field6172;
                                if (var159 == 0 || var159 == 2) {
                                    var152 = false;
                                } else if (var159 == 1) {
                                    var152 = true;
                                }
                            }
                        } else {
                            class379 var153 = class115.method839((byte) -57, var142);
                            class379 var154 = class115.method839((byte) -57, var151.field1873);
                            if (var153.field5734 != -1 && var154.field5734 != -1) {
                                class417 var155 = class156.method1099(var153.field5734, 56);
                                class417 var156 = class156.method1099(var154.field5734, arg0 ^ 0xB1);
                                if (var156.field6166 > var155.field6166) {
                                    var152 = false;
                                }
                            }
                        }
                    }
                    if (var152) {
                        var151.field1866 = 0;
                        var151.field1826 = var141;
                        var151.field1873 = var142;
                        var151.field1879 = 0;
                        var151.field1867 = 1;
                        var151.field1886 = class183.field2987 + var140;
                        if (class183.field2987 < var151.field1886) {
                            var151.field1879 = -1;
                        }
                        if (var151.field1873 != -1 && class183.field2987 == var151.field1886) {
                            int var160 = class115.method839((byte) -57, var151.field1873).field5734;
                            if (var160 != -1) {
                                class417 var161 = class156.method1099(var160, 71);
                                if (var161 != null && var161.field6177 != null) {
                                    class196.method1374(var151.field722, (byte) -104, 0, var151.field724, false, var161);
                                }
                            }
                        }
                    }
                }
            } else if (var143 >> 28 != 0) {
                int var162 = var143 & 0xFFFF;
                class219 var163;
                if (class39.field500 == var162) {
                    var163 = class261.field4201;
                } else {
                    var163 = class216.field3517[var162];
                }
                if (var163 != null) {
                    if (var142 == 65535) {
                        var142 = -1;
                    }
                    boolean var164 = true;
                    if (var142 != -1 && var163.field1873 != -1) {
                        if (var163.field1873 == var142) {
                            class379 var165 = class115.method839((byte) -57, var142);
                            if (var165.field5731 && var165.field5734 != -1) {
                                class417 var166 = class156.method1099(var165.field5734, 78);
                                int var167 = var166.field6172;
                                if (var167 == 0 || var167 == 2) {
                                    var164 = false;
                                } else if (var167 == 1) {
                                    var164 = true;
                                }
                            }
                        } else {
                            class379 var168 = class115.method839((byte) -57, var142);
                            class379 var169 = class115.method839((byte) -57, var163.field1873);
                            if (var168.field5734 != -1 && var169.field5734 != -1) {
                                class417 var170 = class156.method1099(var168.field5734, arg0 ^ 0x95);
                                class417 var171 = class156.method1099(var169.field5734, 72);
                                if (var171.field6166 > var170.field6166) {
                                    var164 = false;
                                }
                            }
                        }
                    }
                    if (var164) {
                        var163.field1826 = var141;
                        var163.field1866 = 0;
                        var163.field1879 = 0;
                        var163.field1867 = 1;
                        var163.field1873 = var142;
                        var163.field1886 = class183.field2987 + var140;
                        if (var163.field1873 == 65535) {
                            var163.field1873 = -1;
                        }
                        if (class183.field2987 < var163.field1886) {
                            var163.field1879 = -1;
                        }
                        if (var163.field1873 != -1 && class183.field2987 == var163.field1886) {
                            int var172 = class115.method839((byte) -57, var163.field1873).field5734;
                            if (var172 != -1) {
                                class417 var173 = class156.method1099(var172, 111);
                                if (var173 != null && var173.field6177 != null) {
                                    class196.method1374(var163.field722, (byte) -104, 0, var163.field724, class261.field4201 == var163, var173);
                                }
                            }
                        }
                    }
                }
            }
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 197) {
            class53.field667 = class223.field3724;
            if (class345.field5331 == 0) {
                class392.field5890 = null;
                class208.field3345 = -1;
                class108.field1507 = 0;
                class338.field5251 = null;
                class280.field4486 = null;
                return true;
            }
            class338.field5251 = class158.field2514.method1270(-9970);
            boolean var174 = class158.field2514.method1322(false) == 1;
            if (var174) {
                class158.field2514.method1270(-9970);
            }
            long var175 = class158.field2514.method1290(false);
            class280.field4486 = class353.method2302(var175, arg0 ^ 0xE9);
            class234.field3919 = class158.field2514.method1327((byte) -127);
            int var177 = class158.field2514.method1322(false);
            if (var177 == 255) {
                class208.field3345 = -1;
                return true;
            }
            class108.field1507 = var177;
            class353[] var178 = new class353[100];
            for (int var179 = 0; var179 < class108.field1507; var179++) {
                var178[var179] = new class353();
                var178[var179].field5440 = class158.field2514.method1270(-9970);
                boolean var185 = class158.field2514.method1322(false) == 1;
                if (var185) {
                    var178[var179].field5445 = class158.field2514.method1270(arg0 - 10207);
                } else {
                    var178[var179].field5445 = var178[var179].field5440;
                }
                var178[var179].field5439 = class158.field2514.method1272((byte) -118);
                var178[var179].field5438 = class158.field2514.method1327((byte) -117);
                var178[var179].field5444 = class158.field2514.method1270(-9970);
                if (var178[var179].field5445.equals(class261.field4201.field3588)) {
                    class396.field5926 = var178[var179].field5438;
                }
            }
            boolean var180 = false;
            int var181 = class108.field1507;
            while (var181 > 0) {
                boolean var182 = true;
                var181--;
                for (int var183 = 0; var183 < var181; var183++) {
                    if (var178[var183].field5440.compareTo(var178[var183 + 1].field5440) > 0) {
                        class353 var184 = var178[var183];
                        var178[var183] = var178[var183 + 1];
                        var178[var183 + 1] = var184;
                        var182 = false;
                    }
                }
                if (var182) {
                    break;
                }
            }
            class208.field3345 = -1;
            class392.field5890 = var178;
            return true;
        } else if (class208.field3345 == 37) {
            String var186 = class158.field2514.method1270(-9970);
            int var187 = class158.field2514.method1272((byte) -58);
            String var188 = class344.method2253((byte) 127, var187).method1242((byte) 59, class158.field2514);
            class102.method764(19, (String) null, -4461, var186, 0, var186, var187, var188);
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 243) {
            boolean var189 = class158.field2514.method1322(false) == 1;
            String var190 = class158.field2514.method1270(arg0 ^ 0xFFFFD9E3);
            String var191 = class158.field2514.method1270(-9970);
            int var192 = class158.field2514.method1272((byte) -49);
            int var193 = class158.field2514.method1322(false);
            String var194 = "";
            boolean var195 = false;
            if (var192 > 0) {
                var194 = class158.field2514.method1270(arg0 ^ 0xFFFFD9E3);
                var195 = class158.field2514.method1322(false) == 1;
            }
            for (int var196 = 0; var196 < class262.field4215; var196++) {
                if (var189) {
                    if (var191.equals(class338.field5248[var196])) {
                        class338.field5248[var196] = var190;
                        class70.field863[var196] = var191;
                        var190 = null;
                        break;
                    }
                } else if (var190.equals(class338.field5248[var196])) {
                    if (class236.field3948[var196] != var192) {
                        class236.field3948[var196] = var192;
                        if (var192 > 0) {
                            class429.method2656(5, 0, -1, "", var190 + class241.field4000, "");
                        }
                        if (var192 == 0) {
                            class429.method2656(5, 0, -1, "", var190 + class199.field3206, "");
                        }
                    }
                    class70.field863[var196] = var191;
                    class57.field708[var196] = var194;
                    class447.field6517[var196] = var193;
                    var190 = null;
                    class349.field5386[var196] = var195;
                    break;
                }
            }
            if (var190 != null && class262.field4215 < 200) {
                class338.field5248[class262.field4215] = var190;
                class70.field863[class262.field4215] = var191;
                class236.field3948[class262.field4215] = var192;
                class57.field708[class262.field4215] = var194;
                class447.field6517[class262.field4215] = var193;
                class349.field5386[class262.field4215] = var195;
                class262.field4215++;
            }
            class179.field2921 = class223.field3724;
            boolean var197 = false;
            int var198 = class262.field4215;
            while (var198 > 0) {
                boolean var199 = true;
                var198--;
                for (int var200 = 0; var200 < var198; var200++) {
                    if (class236.field3948[var200] != class155.field2434 && class236.field3948[var200 + 1] == class155.field2434 || class236.field3948[var200] == 0 && class236.field3948[var200 + 1] != 0) {
                        int var201 = class236.field3948[var200];
                        class236.field3948[var200] = class236.field3948[var200 + 1];
                        class236.field3948[var200 + 1] = var201;
                        String var202 = class57.field708[var200];
                        class57.field708[var200] = class57.field708[var200 + 1];
                        class57.field708[var200 + 1] = var202;
                        String var203 = class338.field5248[var200];
                        class338.field5248[var200] = class338.field5248[var200 + 1];
                        class338.field5248[var200 + 1] = var203;
                        String var204 = class70.field863[var200];
                        class70.field863[var200] = class70.field863[var200 + 1];
                        class70.field863[var200 + 1] = var204;
                        int var205 = class447.field6517[var200];
                        class447.field6517[var200] = class447.field6517[var200 + 1];
                        class447.field6517[var200 + 1] = var205;
                        boolean var206 = class349.field5386[var200];
                        class349.field5386[var200] = class349.field5386[var200 + 1];
                        class349.field5386[var200 + 1] = var206;
                        var199 = false;
                    }
                }
                if (var199) {
                    break;
                }
            }
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 107) {
            int var207 = class158.field2514.method1279(255);
            int var208 = class158.field2514.method1284(arg0 ^ 0x7FFF12);
            int var209 = class158.field2514.method1280(true);
            if (class77.method481(var207, arg0 ^ 0xFFFFFF42)) {
                class377.method2402(var208, var209, (byte) -55);
            }
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 85) {
            int var210 = class158.field2514.method1273((byte) -25);
            int var211 = class158.field2514.method1326(true);
            if (class77.method481(var210, -88)) {
                class407.method2552(5, arg0 ^ 0xC1, 2047, var211, 0);
            }
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 137) {
            String var212 = class158.field2514.method1270(-9970);
            int var213 = class158.field2514.method1279(255);
            int var214 = class158.field2514.method1314(true);
            if (class77.method481(var214, -65)) {
                class39.method264(var212, var213, arg0 ^ 0x7B9B);
            }
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 21) {
            int var215 = class158.field2514.method1285((byte) -33);
            int var216 = var215 >> 2;
            int var217 = var215 & 0x3;
            int var218 = field1005[var216];
            int var219 = class158.field2514.method1284(8388607);
            int var220 = var219 >> 28 & 0x3;
            int var221 = (var219 & 0xFFFD64F) >> 14;
            int var222 = var219 & 0x3FFF;
            int var223 = class158.field2514.method1279(arg0 ^ 0x12);
            int var224 = var222 - class444.field6481;
            int var225 = var221 - class409.field6048;
            if (var223 == 65535) {
                var223 = -1;
            }
            class223.method1597(arg0 ^ 0xF2, var225, var220, var216, var224, var223, var218, var217);
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 5) {
            int var226 = class158.field2514.method1272((byte) -96);
            if (class77.method481(var226, -125)) {
                class36.method233((byte) -99);
            }
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 103) {
            class298.field4751 = class158.field2514.method1313(-80);
            class102.field1426 = class158.field2514.method1285((byte) -33);
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 173) {
            int var227 = class158.field2514.method1287(false);
            int var228 = class158.field2514.method1272((byte) -88);
            class304.method2047(var228, false, var227);
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 223) {
            int var229 = class158.field2514.method1272((byte) -45);
            int var230 = class158.field2514.method1284(8388607);
            int var231 = class158.field2514.method1272((byte) -83);
            if (var231 == 65535) {
                var231 = -1;
            }
            int var232 = class158.field2514.method1279(arg0 + 18);
            int var233 = class158.field2514.method1279(255);
            if (var233 == 65535) {
                var233 = -1;
            }
            if (class77.method481(var229, arg0 ^ 0xFFFFFF44)) {
                for (int var234 = var233; var234 <= var231; var234++) {
                    long var235 = ((long) var230 << 32) + (long) var234;
                    class53 var237 = (class53) class372.field5628.method1770(arg0 - 1117, var235);
                    class53 var238;
                    if (var237 != null) {
                        var238 = new class53(var237.field671, var232);
                        var237.method1120(120);
                    } else if (var234 == -1) {
                        var238 = new class53(class196.method1375(var230, (byte) -56).field2709.field671, var232);
                    } else {
                        var238 = new class53(0, var232);
                    }
                    class372.field5628.method1766(var235, var238, 80);
                }
            }
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 114) {
            int var239 = class158.field2514.method1285((byte) -33);
            int var240 = class158.field2514.method1314(true);
            int var241 = class158.field2514.method1279(255);
            class50 var242 = class39.field499[var241];
            if (var242 != null) {
                class223.method1599(var240, var242, -27449, var239);
            }
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 112) {
            int var243 = class158.field2514.method1272((byte) -119);
            int var244 = class158.field2514.method1279(255);
            int var245 = class158.field2514.method1288((byte) 71);
            if (class77.method481(var243, -55)) {
                class255.method1758(var245, (byte) 101, var244);
            }
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 44) {
            class112.method831(class158.field2514, 25813, class63.field822, class345.field5331);
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 123) {
            int var246 = class158.field2514.method1279(arg0 ^ 0x12);
            byte var247 = class158.field2514.method1327((byte) -116);
            class107.method809(var246, (byte) -109, var247);
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 50) {
            class411.method2576(false);
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 166) {
            int var248 = class158.field2514.method1284(8388607);
            int var249 = class158.field2514.method1272((byte) -88);
            if (var248 < -70000) {
                var249 += 32768;
            }
            class172 var250;
            if (var248 < 0) {
                var250 = null;
            } else {
                var250 = class196.method1375(var248, (byte) -56);
            }
            while (class158.field2514.field3044 < class345.field5331) {
                int var251 = class158.field2514.method1299(-128);
                int var252 = class158.field2514.method1272((byte) -70);
                int var253 = 0;
                if (var252 != 0) {
                    var253 = class158.field2514.method1322(false);
                    if (var253 == 255) {
                        var253 = class158.field2514.method1284(8388607);
                    }
                }
                if (var250 != null && var251 >= 0 && var251 < var250.field2858.length) {
                    var250.field2858[var251] = var252;
                    var250.field2720[var251] = var253;
                }
                class152.method1076(var253, arg0 ^ 0x1B3, var249, var251, var252 - 1);
            }
            if (var250 != null) {
                class336.method2219((byte) 6, var250);
            }
            class424.method2634(-1);
            class280.field4488[class37.method242(class91.field1125++, 31)] = class37.method242(var249, 32767);
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 181) {
            class102.field1426 = class158.field2514.method1313(arg0 - 275);
            class298.field4751 = class158.field2514.method1287(false);
            for (class9 var254 = (class9) class312.field4924.method1776(true); var254 != null; var254 = (class9) class312.field4924.method1773(-1)) {
                int var256 = (int) (var254.field2539 & 0x3FFFL);
                int var257 = (int) (var254.field2539 >> 14 & 0x3FFFL);
                int var258 = (int) (var254.field2539 >> 28 & 0x3L);
                if (class266.field4286 == var258 && class298.field4751 <= var256 && class298.field4751 + 8 > var256 && var257 >= class102.field1426 && (class102.field1426 + 8) > var257) {
                    var254.method1120(77);
                    class309.method2072(class266.field4286, var257, var256, (byte) -93);
                }
            }
            for (class359 var255 = (class359) class235.field3928.method253((byte) -6); var255 != null; var255 = (class359) class235.field3928.method247((byte) -124)) {
                if (class298.field4751 <= var255.field5490 && class298.field4751 + 8 > var255.field5490 && var255.field5498 >= class102.field1426 && (class102.field1426 + 8) > var255.field5498 && class266.field4286 == var255.field5488) {
                    var255.field5502 = 0;
                }
            }
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 203) {
            int var259 = class158.field2514.method1284(8388607);
            int var260 = class158.field2514.method1279(arg0 + 18);
            if (var260 == 65535) {
                var260 = -1;
            }
            int var261 = class158.field2514.method1273((byte) -98);
            if (var261 == 65535) {
                var261 = -1;
            }
            int var262 = class158.field2514.method1288((byte) 10);
            int var263 = class158.field2514.method1273((byte) -61);
            if (class77.method481(var263, -100)) {
                for (int var264 = var260; var264 <= var261; var264++) {
                    long var265 = ((long) var259 << 32) + (long) var264;
                    class53 var267 = (class53) class372.field5628.method1770(-880, var265);
                    class53 var268;
                    if (var267 != null) {
                        var268 = new class53(var262, var267.field659);
                        var267.method1120(-122);
                    } else if (var264 == -1) {
                        var268 = new class53(var262, class196.method1375(var259, (byte) -56).field2709.field659);
                    } else {
                        var268 = new class53(var262, -1);
                    }
                    class372.field5628.method1766(var265, var268, 89);
                }
            }
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 148) {
            for (int var269 = 0; var269 < class216.field3517.length; var269++) {
                if (class216.field3517[var269] != null) {
                    class216.field3517[var269].field1878 = -1;
                }
            }
            for (int var270 = 0; var270 < class39.field499.length; var270++) {
                if (class39.field499[var270] != null) {
                    class39.field499[var270].field1878 = -1;
                }
            }
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 102) {
            class250.method1734(arg0 - 235);
            class424.method2634(-1);
            class208.field3345 = -1;
            class91.field1128 += 32;
            return true;
        } else if (class208.field3345 == 174) {
            int var271 = class158.field2514.method1314(true);
            if (var271 == 65535) {
                var271 = -1;
            }
            int var272 = class158.field2514.method1285((byte) -33);
            class321.method2135(var272, arg0 + 18, var271);
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 75) {
            int var273 = class158.field2514.method1272((byte) -100);
            if (var273 == 65535) {
                var273 = -1;
            }
            int var274 = class158.field2514.method1287(false);
            int var275 = class158.field2514.method1296((byte) -48);
            class386.method2450(107, var273, var275, var274);
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 178) {
            int var276 = class158.field2514.method1272((byte) -118);
            int var277 = class158.field2514.method1322(false);
            int var278 = class158.field2514.method1322(false);
            int var279 = class158.field2514.method1272((byte) -67);
            int var280 = class158.field2514.method1322(false);
            int var281 = class158.field2514.method1322(false);
            if (class77.method481(var276, -122)) {
                class185.method1260(var277, var279, 2, var281, var280, var278);
            }
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 54) {
            int var282 = class158.field2514.method1272((byte) -64);
            int var283 = class158.field2514.method1288((byte) 27);
            if (class77.method481(var282, -51)) {
                class407.method2552(3, 30, -1, var283, -1);
            }
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 172) {
            int var284 = class158.field2514.method1272((byte) -88);
            if (var284 == 65535) {
                var284 = -1;
            }
            int var285 = class158.field2514.method1326(true);
            int var286 = class158.field2514.method1272((byte) -93);
            if (class77.method481(var286, -77)) {
                class407.method2552(2, 39, var284, var285, -1);
            }
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 130) {
            String var287 = class158.field2514.method1270(-9970);
            boolean var288 = class158.field2514.method1322(false) == 1;
            String var289;
            if (var288) {
                var289 = class158.field2514.method1270(-9970);
            } else {
                var289 = var287;
            }
            int var290 = class158.field2514.method1272((byte) -48);
            byte var291 = class158.field2514.method1327((byte) -122);
            boolean var292 = false;
            if (var291 == -128) {
                var292 = true;
            }
            if (var292) {
                if (class108.field1507 == 0) {
                    class208.field3345 = -1;
                    return true;
                }
                boolean var298 = false;
                int var299;
                for (var299 = 0; class108.field1507 > var299 && (!class392.field5890[var299].field5445.equals(var289) || class392.field5890[var299].field5439 != var290); var299++) {
                }
                if (class108.field1507 > var299) {
                    while (var299 < class108.field1507 - 1) {
                        class392.field5890[var299] = class392.field5890[var299 + 1];
                        var299++;
                    }
                    class108.field1507--;
                    class392.field5890[class108.field1507] = null;
                }
            } else {
                String var293 = class158.field2514.method1270(-9970);
                class353 var294 = new class353();
                var294.field5445 = var289;
                var294.field5439 = var290;
                var294.field5440 = var287;
                var294.field5444 = var293;
                var294.field5438 = var291;
                int var295;
                for (var295 = class108.field1507 - 1; var295 >= 0; var295--) {
                    int var296 = class392.field5890[var295].field5445.compareTo(var294.field5445);
                    if (var296 == 0) {
                        class392.field5890[var295].field5439 = var290;
                        class392.field5890[var295].field5438 = var291;
                        class392.field5890[var295].field5444 = var293;
                        if (var289.equals(class261.field4201.field3588)) {
                            class396.field5926 = var291;
                        }
                        class53.field667 = class223.field3724;
                        class208.field3345 = -1;
                        return true;
                    }
                    if (var296 < 0) {
                        break;
                    }
                }
                if (class108.field1507 >= class392.field5890.length) {
                    class208.field3345 = -1;
                    return true;
                }
                for (int var297 = class108.field1507 - 1; var297 > var295; var297--) {
                    class392.field5890[var297 + 1] = class392.field5890[var297];
                }
                if (class108.field1507 == 0) {
                    class392.field5890 = new class353[100];
                }
                class392.field5890[var295 + 1] = var294;
                class108.field1507++;
                if (var289.equals(class261.field4201.field3588)) {
                    class396.field5926 = var291;
                }
            }
            class53.field667 = class223.field3724;
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 101) {
            int var300 = class158.field2514.method1313(-127);
            int var301 = class158.field2514.method1272((byte) -116);
            if (class77.method481(var301, -99)) {
                class8.field103 = var300;
            }
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 131) {
            int var302 = class158.field2514.method1287(false);
            int var303 = class158.field2514.method1313(arg0 - 291);
            int var304 = class158.field2514.method1285((byte) -33);
            class266.field4286 = var302 >> 1;
            class261.field4201.method1569(var304, (var302 & 0x1) == 1, 14160, var303, class266.field4286);
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 60) {
            int var305 = class158.field2514.method1284(8388607);
            class379.field5747 = class63.field822.method1898(var305, -113);
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 183) {
            class357.method2328(class158.field2514.method1270(arg0 ^ 0xFFFFD9E3), 120);
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 40) {
            String var306 = class158.field2514.method1270(-9970);
            String var307 = class348.method2272(class341.method2238(true, class201.method1398((byte) 110, class158.field2514)), true);
            class429.method2656(6, 0, -1, var306, var307, var306);
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 168) {
            int var308 = class158.field2514.method1272((byte) -76);
            int var309 = class158.field2514.method1314(true);
            int var310 = class158.field2514.method1279(255);
            if (class77.method481(var310, -74)) {
                class415.method2596(var309, var308, 60, 0);
            }
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 43) {
            int var311 = class158.field2514.method1279(255);
            int var312 = class158.field2514.method1284(8388607);
            int var313 = class158.field2514.method1284(8388607);
            int var314 = class158.field2514.method1314(true);
            if (class77.method481(var311, -60)) {
                class407.method2552(5, 86, var314, var312, var313);
            }
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 52) {
            int var315 = class158.field2514.method1328(255);
            class172 var316 = class196.method1375(var315, (byte) -56);
            for (int var317 = 0; var317 < var316.field2858.length; var317++) {
                var316.field2858[var317] = -1;
                var316.field2858[var317] = 0;
            }
            class336.method2219((byte) 6, var316);
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 20) {
            int var318 = class158.field2514.method1322(false);
            int var319 = var318 >> 5;
            int var320 = var318 & 0x1F;
            if (var320 == 0) {
                class256.field4144[var319] = null;
                class208.field3345 = -1;
                return true;
            }
            class136 var321 = new class136();
            var321.field2124 = var320;
            var321.field2132 = class158.field2514.method1322(false);
            if (var321.field2132 >= 0 && var321.field2132 < class245.field4021.length) {
                if (var321.field2124 == 1 || var321.field2124 == 10) {
                    var321.field2121 = class158.field2514.method1272((byte) -67);
                    class158.field2514.field3044 += 5;
                } else if (var321.field2124 >= 2 && var321.field2124 <= 6) {
                    if (var321.field2124 == 2) {
                        var321.field2136 = 64;
                        var321.field2122 = 64;
                    }
                    if (var321.field2124 == 3) {
                        var321.field2122 = 64;
                        var321.field2136 = 0;
                    }
                    if (var321.field2124 == 4) {
                        var321.field2122 = 64;
                        var321.field2136 = 128;
                    }
                    if (var321.field2124 == 5) {
                        var321.field2122 = 0;
                        var321.field2136 = 64;
                    }
                    if (var321.field2124 == 6) {
                        var321.field2122 = 128;
                        var321.field2136 = 64;
                    }
                    var321.field2124 = 2;
                    var321.field2126 = class158.field2514.method1272((byte) -115);
                    var321.field2131 = class158.field2514.method1272((byte) -66);
                    var321.field2138 = class158.field2514.method1322(false);
                    var321.field2125 = class158.field2514.method1272((byte) -65);
                }
                var321.field2129 = class158.field2514.method1272((byte) -92);
                if (var321.field2129 == 65535) {
                    var321.field2129 = -1;
                }
                class256.field4144[var319] = var321;
            }
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 6) {
            int var322 = class158.field2514.method1313(-44);
            int var323 = class158.field2514.method1326(true);
            int var324 = class158.field2514.method1279(255);
            if (class77.method481(var324, -97)) {
                class110.method819(var323, -118, var322);
            }
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 31) {
            int var325 = class158.field2514.method1272((byte) -67);
            if (var325 == 65535) {
                var325 = -1;
            }
            int var326 = class158.field2514.method1288((byte) 55);
            int var327 = class158.field2514.method1328(255);
            int var328 = class158.field2514.method1273((byte) -17);
            if (class77.method481(var328, arg0 - 352)) {
                class172 var329 = class196.method1375(var326, (byte) -56);
                if (var329.field2712) {
                    class8.method96(false, var326, var327, var325);
                    class97 var331 = class155.method1092(true, var325);
                    class423.method2629(arg0 ^ 0xE5, var326, var331.field1369, var331.field1302, var331.field1304);
                    class388.method2454(var331.field1344, var331.field1341, var331.field1303, var326, (byte) 95);
                } else if (var325 == -1) {
                    class208.field3345 = -1;
                    var329.field2779 = 0;
                    return true;
                } else {
                    class97 var330 = class155.method1092(true, var325);
                    var329.field2771 = var330.field1369;
                    var329.field2860 = var330.field1302 * 100 / var327;
                    var329.field2779 = 4;
                    var329.field2818 = var330.field1304;
                    var329.field2794 = var325;
                    class336.method2219((byte) 6, var329);
                }
            }
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 191) {
            int var332 = class158.field2514.method1273((byte) -57);
            int var333 = class158.field2514.method1279(255);
            int var334 = class158.field2514.method1279(255);
            int var335 = class158.field2514.method1314(true);
            int var336 = class158.field2514.method1284(8388607);
            if (class77.method481(var334, -104)) {
                class407.method2552(7, arg0 - 132, var335 | var333 << 16, var336, var332);
            }
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 124) {
            int var337 = class158.field2514.method1322(false);
            int var338 = class158.field2514.method1322(false);
            if (var337 == 255) {
                var338 = -1;
                var337 = -1;
            }
            class127.method936(var338, var337, false);
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 193) {
            class85.field1050 = class158.field2514.method1279(arg0 ^ 0x12) * 30;
            class378.field5705 = class223.field3724;
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 189) {
            int var339 = class158.field2514.method1328(255);
            int var340 = class158.field2514.method1273((byte) -36);
            int var341 = class158.field2514.method1279(255);
            if (var341 == 65535) {
                var341 = -1;
            }
            if (class77.method481(var340, -49)) {
                class407.method2552(1, 68, var341, var339, -1);
            }
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 169) {
            int var342 = class158.field2514.method1322(false);
            int var343 = class158.field2514.method1314(true);
            if (var343 == 65535) {
                var343 = -1;
            }
            String var344 = class158.field2514.method1270(-9970);
            int var345 = class158.field2514.method1322(false);
            if (var342 >= 1 && var342 <= 8) {
                if (var344.equalsIgnoreCase("null")) {
                    var344 = null;
                }
                class223.field3703[var342 - 1] = var344;
                class64.field836[var342 - 1] = var343;
                class343.field5284[var342 - 1] = var345 == 0;
            }
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 214) {
            class102.field1426 = class158.field2514.method1322(false);
            class298.field4751 = class158.field2514.method1287(false);
            while (class345.field5331 > class158.field2514.field3044) {
                class208.field3345 = class158.field2514.method1322(false);
                class97.method733(arg0 ^ 0xFFFFFF6B);
            }
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 245) {
            int var346 = class158.field2514.method1288((byte) 29);
            int var347 = class158.field2514.method1272((byte) -74);
            class304.method2047(var347, false, var346);
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 186) {
            int var348 = class158.field2514.method1288((byte) 27);
            int var349 = class158.field2514.method1273((byte) -4);
            int var350 = class158.field2514.method1273((byte) -100);
            int var351 = class158.field2514.method1285((byte) -33);
            if (class77.method481(var350, -125)) {
                class196 var352 = (class196) class392.field5891.method1770(-880, (long) var348);
                if (var352 != null) {
                    class140.method1020(var352.field3171 != var349, false, false, var352);
                }
                class127.method933(var351, var349, (byte) 89, var348, false);
            }
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 133) {
            class158.field2514.field3044 += 28;
            if (class158.field2514.method1293(true)) {
                class354.method2306((byte) -83, class158.field2514.field3044 - 28, class158.field2514);
            }
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 64) {
            class392.method2474((byte) 116);
            class208.field3345 = -1;
            return false;
        } else if (class208.field3345 == 59) {
            int var353 = class158.field2514.method1272((byte) -47);
            if (var353 == 65535) {
                var353 = -1;
            }
            int var354 = class158.field2514.method1322(false);
            int var355 = class158.field2514.method1272((byte) -78);
            int var356 = class158.field2514.method1322(false);
            class426.method2641(var354, var355, -1, var356, var353);
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 155) {
            boolean var357 = class158.field2514.method1322(false) == 1;
            String var358 = class158.field2514.method1270(-9970);
            String var359 = var358;
            if (var357) {
                var359 = class158.field2514.method1270(-9970);
            }
            long var360 = class158.field2514.method1290(false);
            long var362 = (long) class158.field2514.method1272((byte) -89);
            long var364 = (long) class158.field2514.method1275(arg0 ^ 0xFFFFFF12);
            int var366 = class158.field2514.method1322(false);
            long var367 = (var362 << 32) + var364;
            boolean var369 = false;
            int var370 = 0;
            while (true) {
                if (var370 >= 100) {
                    if (var366 <= 1) {
                        if (!(!class52.field651 || class277.field4416) || class333.field5199) {
                            var369 = true;
                        } else if (class309.method2071(85, var359)) {
                            var369 = true;
                        }
                    }
                    break;
                }
                if (class132.field2072[var370] == var367) {
                    var369 = true;
                    break;
                }
                var370++;
            }
            if (!var369 && class413.field6110 == 0) {
                class132.field2072[class68.field858] = var367;
                class68.field858 = (class68.field858 + 1) % 100;
                String var371 = class348.method2272(class341.method2238(true, class201.method1398((byte) 110, class158.field2514)), true);
                if (var366 == 2 || var366 == 3) {
                    class102.method764(9, class133.method977(var360, -54), -4461, "<img=1>" + var358, 0, "<img=1>" + var359, -1, var371);
                } else if (var366 == 1) {
                    class102.method764(9, class133.method977(var360, -26), arg0 ^ 0xFFFFEE7E, "<img=0>" + var358, 0, "<img=0>" + var359, -1, var371);
                } else {
                    class102.method764(9, class133.method977(var360, -96), -4461, var358, 0, var359, -1, var371);
                }
            }
            class208.field3345 = -1;
            return true;
        } else if (class208.field3345 == 117) {
            int var372 = class158.field2514.method1284(arg0 + 8388370);
            int var373 = class158.field2514.method1272((byte) -123);
            if (var372 < -70000) {
                var373 += 32768;
            }
            class172 var374;
            if (var372 < 0) {
                var374 = null;
            } else {
                var374 = class196.method1375(var372, (byte) -56);
            }
            if (var374 != null) {
                for (int var375 = 0; var375 < var374.field2858.length; var375++) {
                    var374.field2858[var375] = 0;
                    var374.field2720[var375] = 0;
                }
            }
            class190.method1335(var373, -1);
            int var376 = class158.field2514.method1272((byte) -74);
            for (int var377 = 0; var377 < var376; var377++) {
                int var378 = class158.field2514.method1273((byte) -49);
                int var379 = class158.field2514.method1313(arg0 ^ 0xFFFFFF72);
                if (var379 == 255) {
                    var379 = class158.field2514.method1284(8388607);
                }
                if (var374 != null && var377 < var374.field2858.length) {
                    var374.field2858[var377] = var378;
                    var374.field2720[var377] = var379;
                }
                class152.method1076(var379, 350, var373, var377, var378 - 1);
            }
            if (var374 != null) {
                class336.method2219((byte) 6, var374);
            }
            class424.method2634(-1);
            class280.field4488[class37.method242(31, class91.field1125++)] = class37.method242(var373, 32767);
            class208.field3345 = -1;
            return true;
        } else {
            class272.method1845((Throwable) null, 123, "T1 - " + class208.field3345 + "," + class281.field4507 + "," + class433.field6397 + " - " + class345.field5331);
            class392.method2474((byte) -45);
            return true;
        }
    }
}
