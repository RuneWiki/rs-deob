import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class105 extends class236 {

    @OriginalMember(owner = "client!oe", name = "u", descriptor = "Lsg;")
    private static class30 field2108 = class167.method1221((byte) 33, ")3de");

    @OriginalMember(owner = "client!oe", name = "z", descriptor = "Lsg;")
    private static class30 field2113 = class167.method1221((byte) 33, ")3fr");

    @OriginalMember(owner = "client!oe", name = "w", descriptor = "Lsg;")
    private static class30 field2110 = class167.method1221((byte) 33, ")3en");

    @OriginalMember(owner = "client!oe", name = "x", descriptor = "Lsg;")
    private static class30 field2111 = class167.method1221((byte) 33, "en");

    @OriginalMember(owner = "client!oe", name = "C", descriptor = "Lsg;")
    private static class30 field2116 = class167.method1221((byte) 33, "fr");

    @OriginalMember(owner = "client!oe", name = "G", descriptor = "Lsg;")
    private static class30 field2120 = class167.method1221((byte) 33, "de");

    @OriginalMember(owner = "client!oe", name = "B", descriptor = "[Lsg;")
    public static class30[] field2115 = new class30[] { field2111, field2120, field2116 };

    @OriginalMember(owner = "client!oe", name = "A", descriptor = "[Lsg;")
    private static class30[] field2114 = new class30[] { field2110, field2108, field2113 };

    @OriginalMember(owner = "client!oe", name = "E", descriptor = "B")
    public byte field2118;

    @OriginalMember(owner = "client!oe", name = "s", descriptor = "I")
    public int field2106;

    @OriginalMember(owner = "client!oe", name = "v", descriptor = "I")
    public static int field2109;

    @OriginalMember(owner = "client!oe", name = "y", descriptor = "I")
    public static int field2112;

    @OriginalMember(owner = "client!oe", name = "F", descriptor = "I")
    public static int field2119;

    @OriginalMember(owner = "client!oe", name = "H", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!oe", name = "t", descriptor = "Lsg;")
    public class30 field2107;

    @OriginalMember(owner = "client!oe", name = "D", descriptor = "Lsg;")
    public class30 field2117;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(Z)V")
    public static final void method840(boolean arg0) {
        field2109++;
        class277.field4830.method1650(109);
        class121.field2376.method1650(74);
        class270.field4758.method1650(84);
        if (!arg0) {
            field2110 = null;
        }
        class102.field2071.method1650(77);
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(Z)V")
    public static void method841(boolean arg0) {
        field2113 = null;
        field2114 = null;
        field2110 = null;
        field2108 = null;
        field2111 = null;
        if (arg0) {
            field2120 = null;
            field2116 = null;
            field2115 = null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "([I[IIBI)V")
    public static final void method842(int[] arg0, int[] arg1, int arg2, byte arg3, int arg4) {
        field2112++;
        if (arg2 > arg4) {
            int var5 = (arg4 + arg2) / 2;
            int var6 = arg4;
            int var7 = arg1[var5];
            arg1[var5] = arg1[arg2];
            arg1[arg2] = var7;
            int var8 = arg0[var5];
            arg0[var5] = arg0[arg2];
            arg0[arg2] = var8;
            for (int var9 = arg4; var9 < arg2; var9++) {
                if (arg1[var9] > ((var9 & 0x1) + var7)) {
                    int var10 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6] = var10;
                    int var11 = arg0[var9];
                    arg0[var9] = arg0[var6];
                    arg0[var6++] = var11;
                }
            }
            arg1[arg2] = arg1[var6];
            arg1[var6] = var7;
            arg0[arg2] = arg0[var6];
            arg0[var6] = var8;
            method842(arg0, arg1, var6 - 1, (byte) -3, arg4);
            method842(arg0, arg1, arg2, (byte) -3, var6 + 1);
        }
        if (arg3 != -3) {
            field2108 = null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "(I)Z")
    public static final boolean method843(int arg0) throws IOException {
        field2121++;
        if (class175.field3261 == null) {
            return false;
        }
        int var1 = class175.field3261.method1508(0);
        if (var1 == 0) {
            return false;
        }
        if (class70.field1586 == -1) {
            var1--;
            class175.field3261.method1510(0, class59.field1289.field124, 1, (byte) -6);
            class59.field1289.field146 = 0;
            class70.field1586 = class59.field1289.method1274((byte) -124);
            class163.field3041 = class253.field4469[class70.field1586];
        }
        if (arg0 >= -7) {
            return true;
        }
        if (class163.field3041 == -1) {
            if (var1 <= 0) {
                return false;
            }
            var1--;
            class175.field3261.method1510(0, class59.field1289.field124, 1, (byte) -6);
            class163.field3041 = class59.field1289.field124[0] & 0xFF;
        }
        if (class163.field3041 == -2) {
            if (var1 <= 1) {
                return false;
            }
            class175.field3261.method1510(0, class59.field1289.field124, 2, (byte) -6);
            class59.field1289.field146 = 0;
            var1 -= 2;
            class163.field3041 = class59.field1289.method65((byte) 111);
        }
        if (var1 < class163.field3041) {
            return false;
        }
        class59.field1289.field146 = 0;
        class175.field3261.method1510(0, class59.field1289.field124, class163.field3041, (byte) -6);
        class36.field871 = class52.field1161;
        class179.field3314 = 0;
        class52.field1161 = class196.field3551;
        class196.field3551 = class70.field1586;
        if (class70.field1586 == 251) {
            int var2 = class59.field1289.method92(114);
            int var3 = class59.field1289.method99(false);
            int var4 = class59.field1289.method92(119);
            int var5 = class59.field1289.method79(true);
            if (class50.method501(0, var2)) {
                class119.method907(10522, var3, 7, var4 << 16 | var5);
            }
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 91) {
            class230.method1634((byte) -39);
            class102.field2075 = class59.field1289.method74(96);
            class70.field1586 = -1;
            class134.field2622 = class14.field308;
            return true;
        } else if (class70.field1586 == 150) {
            int var6 = class59.field1289.method63((byte) 68);
            int var7 = class59.field1289.method63((byte) 67);
            int var8 = class59.field1289.method65((byte) 119);
            int var9 = class59.field1289.method63((byte) 96);
            int var10 = class59.field1289.method63((byte) 110);
            class216.method1579(var8, var10, var6, false, var9, var7);
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 111) {
            int var11 = class59.field1289.method81(-1239235384);
            int var12 = class59.field1289.method83(false);
            int var13 = class59.field1289.method79(true);
            if (class50.method501(0, var13)) {
                class235.method1664(var12, var11, -22923);
            }
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 206) {
            class164.method1214(class163.field3041, class190.field3452, class59.field1289, (byte) 54);
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 73) {
            long var14 = class59.field1289.method101(-103);
            long var16 = (long) class59.field1289.method65((byte) 123);
            long var18 = (long) class59.field1289.method60(23888);
            int var20 = class59.field1289.method63((byte) 99);
            long var21 = (var16 << 32) + var18;
            boolean var23 = false;
            int var24 = 0;
            label1066: while (true) {
                if (var24 >= 100) {
                    if (var20 <= 1) {
                        if (class36.field874 == 1 || class230.field4091 == 1) {
                            var23 = true;
                        } else {
                            for (int var25 = 0; var25 < class141.field2730; var25++) {
                                if (class254.field4485[var25] == var14) {
                                    var23 = true;
                                    break label1066;
                                }
                            }
                        }
                    }
                    break;
                }
                if (class20.field363[var24] == var21) {
                    var23 = true;
                    break;
                }
                var24++;
            }
            if (!var23 && class153.field2908 == 0) {
                class20.field363[class93.field1869] = var21;
                class93.field1869 = (class93.field1869 + 1) % 100;
                class30 var26 = class206.method1448(class108.method851(class59.field1289, false).method278(0));
                if (var20 == 2 || var20 == 3) {
                    class268.method1838(7, -1, var26, class160.method1188(new class30[] { class68.field1494, class197.method1422(var14, -126).method256(114) }, 0));
                } else if (var20 == 1) {
                    class268.method1838(7, -1, var26, class160.method1188(new class30[] { class219.field3952, class197.method1422(var14, -121).method256(86) }, 0));
                } else {
                    class268.method1838(3, -1, var26, class197.method1422(var14, -123).method256(85));
                }
            }
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 9) {
            if (class163.field3041 == 0) {
                class252.field4456 = class74.field1663;
            } else {
                class252.field4456 = class59.field1289.method84(0);
            }
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 227) {
            class30 var27 = class59.field1289.method84(0);
            int var28 = class59.field1289.method83(false);
            int var29 = class59.field1289.method65((byte) 108);
            if (class50.method501(0, var29)) {
                class145.method1070(85, var28, var27);
            }
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 179) {
            int var30 = class59.field1289.method70(65280);
            int var31 = class59.field1289.method65((byte) 121);
            class31 var32;
            if (var30 < 0) {
                var32 = null;
            } else {
                var32 = class272.method1858(var30, 65535);
            }
            if (var32 != null) {
                for (int var33 = 0; var33 < var32.field806.length; var33++) {
                    var32.field806[var33] = 0;
                    var32.field708[var33] = 0;
                }
            }
            if (var30 < -70000) {
                var31 += 32768;
            }
            class235.method1669(var31, (byte) -87);
            int var34 = class59.field1289.method65((byte) 115);
            for (int var35 = 0; var35 < var34; var35++) {
                int var36 = class59.field1289.method81(-1239235384);
                int var37 = class59.field1289.method54(103);
                if (var37 == 255) {
                    var37 = class59.field1289.method70(65280);
                }
                if (var32 != null && var35 < var32.field806.length) {
                    var32.field806[var35] = var36;
                    var32.field708[var35] = var37;
                }
                class136.method1021(var31, var35, var36 - 1, var37, (byte) 120);
            }
            if (var32 != null) {
                class254.method1771(var32, 8);
            }
            class230.method1634((byte) -73);
            class247.field4395[class68.method612(31, class257.field4526++)] = class68.method612(var31, 32767);
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 113) {
            int var38 = class59.field1289.method79(true);
            int var39 = class59.field1289.method92(126);
            int var40 = class59.field1289.method67(-78);
            if (var39 == 65535) {
                var39 = -1;
            }
            if (class50.method501(0, var38)) {
                class119.method907(10522, var40, 1, var39);
            }
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 162) {
            int var41 = class59.field1289.method79(true);
            int var42 = class59.field1289.method79(true);
            int var43 = class59.field1289.method83(false);
            int var44 = class59.field1289.method81(-1239235384);
            int var45 = class59.field1289.method79(true);
            if (class50.method501(0, var44)) {
                client.method1489(var43, var45, 8, var41, var42);
            }
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 106) {
            class252.method1755(0);
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 161) {
            int var46 = class59.field1289.method70(65280);
            int var47 = class59.field1289.method79(true);
            int var48 = class59.field1289.method79(true);
            if (class50.method501(0, var47)) {
                class183.method1320((byte) -82, var46, var48);
            }
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 52) {
            int var49 = class59.field1289.method83(false);
            class31 var50 = class272.method1858(var49, 65535);
            for (int var51 = 0; var51 < var50.field806.length; var51++) {
                var50.field806[var51] = -1;
                var50.field806[var51] = 0;
            }
            class254.method1771(var50, 8);
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 51) {
            class6.method37(class59.field1289.method84(0), 101);
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 7) {
            int var52 = class59.field1289.method70(65280);
            int var53 = class59.field1289.method65((byte) 114);
            if (var52 < -70000) {
                var53 += 32768;
            }
            class31 var54;
            if (var52 >= 0) {
                var54 = class272.method1858(var52, 65535);
            } else {
                var54 = null;
            }
            while (class59.field1289.field146 < class163.field3041) {
                int var55 = class59.field1289.method45(false);
                int var56 = class59.field1289.method65((byte) 124);
                int var57 = 0;
                if (var56 != 0) {
                    var57 = class59.field1289.method63((byte) 92);
                    if (var57 == 255) {
                        var57 = class59.field1289.method70(65280);
                    }
                }
                if (var54 != null && var55 >= 0 && var55 < var54.field806.length) {
                    var54.field806[var55] = var56;
                    var54.field708[var55] = var57;
                }
                class136.method1021(var53, var55, var56 - 1, var57, (byte) 124);
            }
            if (var54 != null) {
                class254.method1771(var54, 8);
            }
            class230.method1634((byte) -26);
            class247.field4395[class68.method612(class257.field4526++, 31)] = class68.method612(var53, 32767);
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 10) {
            int var58 = class59.field1289.method86((byte) 43);
            int var59 = class59.field1289.method79(true);
            int var60 = class59.field1289.method70(65280);
            if (class50.method501(0, var59)) {
                class61.method559(var58, 5, var60);
            }
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 110) {
            int var61 = class59.field1289.method63((byte) 112);
            class143 var62 = new class143();
            int var63 = var61 >> 6;
            var62.field2754 = var61 & 0x3F;
            var62.field2758 = class59.field1289.method63((byte) 126);
            if (var62.field2758 >= 0 && var62.field2758 < class9.field172.length) {
                if (var62.field2754 == 1 || var62.field2754 == 10) {
                    var62.field2755 = class59.field1289.method65((byte) 121);
                    class59.field1289.field146 += 3;
                } else if (var62.field2754 >= 2 && var62.field2754 <= 6) {
                    if (var62.field2754 == 2) {
                        var62.field2764 = 64;
                        var62.field2766 = 64;
                    }
                    if (var62.field2754 == 3) {
                        var62.field2764 = 0;
                        var62.field2766 = 64;
                    }
                    if (var62.field2754 == 4) {
                        var62.field2764 = 128;
                        var62.field2766 = 64;
                    }
                    if (var62.field2754 == 5) {
                        var62.field2764 = 64;
                        var62.field2766 = 0;
                    }
                    if (var62.field2754 == 6) {
                        var62.field2766 = 128;
                        var62.field2764 = 64;
                    }
                    var62.field2754 = 2;
                    var62.field2760 = class59.field1289.method65((byte) 109);
                    var62.field2763 = class59.field1289.method65((byte) 125);
                    var62.field2761 = class59.field1289.method63((byte) 124);
                }
                var62.field2753 = class59.field1289.method65((byte) 123);
                if (var62.field2753 == 65535) {
                    var62.field2753 = -1;
                }
                class262.field4620[var63] = var62;
            }
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 138) {
            int var64 = class59.field1289.method69(5002);
            int var65 = class59.field1289.method77((byte) -70);
            int var66 = class59.field1289.method63((byte) 118);
            class159.field2998 = var64 >> 1;
            class247.field4394.method914(var66, var65, (var64 & 0x1) == 1, 0);
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 200) {
            class201.field3586 = class59.field1289.method63((byte) 65);
            class243.field4348 = class59.field1289.method63((byte) 106);
            class90.field1816 = class59.field1289.method63((byte) 74);
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 121) {
            class65.method583((byte) -112);
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 130) {
            int var67 = class59.field1289.method65((byte) 127);
            if (var67 == 65535) {
                var67 = -1;
            }
            int var68 = class59.field1289.method63((byte) 111);
            int var69 = class59.field1289.method65((byte) 126);
            class33.method332(false, var68, var69, var67);
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 194) {
            byte[] var70 = new byte[class163.field3041];
            class59.field1289.method1276(var70, 0, class163.field3041, false);
            class30 var71 = class255.method1775(class163.field3041, var70, 2, 0);
            if (class261.field4614 == null && class66.field1459 == 3 || !class66.field1445.startsWith("win") || class64.field1423) {
                class223.method1601(var71, 12651, true);
            } else {
                class270.field4760 = var71;
                class265.field4669 = true;
                class244.field4356 = class190.field3452.method597(new String(var71.method261(-1), "ISO-8859-1"), 26083);
            }
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 89) {
            class230.method1634((byte) -116);
            int var72 = class59.field1289.method70(65280);
            int var73 = class59.field1289.method54(41);
            int var74 = class59.field1289.method69(5002);
            class29.field557[var73] = var72;
            class146.field2806[var73] = var74;
            class126.field2453[var73] = 1;
            for (int var75 = 0; var75 < 98; var75++) {
                if (var72 >= class48.field1091[var75]) {
                    class126.field2453[var73] = var75 + 2;
                }
            }
            class17.field339[class68.method612(31, class228.field4071++)] = var73;
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 33) {
            class115.field2277 = class59.field1289.method54(95);
            class220.field3972 = class59.field1289.method69(5002);
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 92) {
            class30 var76 = class59.field1289.method84(0);
            if (var76.method272(class119.field2319, 65)) {
                class30 var112 = var76.method274(var76.method255(true, class122.field2392), 0, (byte) -109);
                boolean var113 = false;
                long var114 = var112.method297((byte) -84);
                for (int var116 = 0; var116 < class141.field2730; var116++) {
                    if (class254.field4485[var116] == var114) {
                        var113 = true;
                        break;
                    }
                }
                if (!var113 && class153.field2908 == 0) {
                    class268.method1838(4, -1, class145.field2780, var112);
                }
            } else if (var76.method272(class74.field1664, 65)) {
                class30 var106 = var76.method274(var76.method255(true, class122.field2392), 0, (byte) -118);
                long var107 = var106.method297((byte) -102);
                boolean var109 = false;
                for (int var110 = 0; var110 < class141.field2730; var110++) {
                    if (class254.field4485[var110] == var107) {
                        var109 = true;
                        break;
                    }
                }
                if (!var109 && class153.field2908 == 0) {
                    class30 var111 = var76.method274(var76.method249(-41) - 9, var76.method255(true, class122.field2392) + 1, (byte) -109);
                    class268.method1838(8, -1, var111, var106);
                }
            } else if (var76.method272(class36.field872, 65)) {
                class30 var77 = var76.method274(var76.method255(true, class122.field2392), 0, (byte) -114);
                long var78 = var77.method297((byte) -90);
                boolean var80 = false;
                for (int var81 = 0; var81 < class141.field2730; var81++) {
                    if (class254.field4485[var81] == var78) {
                        var80 = true;
                        break;
                    }
                }
                if (!var80 && class153.field2908 == 0) {
                    class268.method1838(10, -1, class55.field1203, var77);
                }
            } else if (var76.method272(class157.field2974, 65)) {
                class30 var105 = var76.method274(var76.method255(true, class157.field2974), 0, (byte) -124);
                class268.method1838(11, -1, var105, class55.field1203);
            } else if (var76.method272(class202.field3597, 65)) {
                class30 var82 = var76.method274(var76.method255(true, class202.field3597), 0, (byte) 50);
                if (class153.field2908 == 0) {
                    class268.method1838(12, -1, var82, class55.field1203);
                }
            } else if (var76.method272(class24.field466, 65)) {
                class30 var83 = var76.method274(var76.method255(true, class24.field466), 0, (byte) -124);
                if (class153.field2908 == 0) {
                    class268.method1838(13, -1, var83, class55.field1203);
                }
            } else if (var76.method272(class261.field4616, 65)) {
                class30 var100 = var76.method274(var76.method255(true, class122.field2392), 0, (byte) 53);
                boolean var101 = false;
                long var102 = var100.method297((byte) -78);
                for (int var104 = 0; var104 < class141.field2730; var104++) {
                    if (class254.field4485[var104] == var102) {
                        var101 = true;
                        break;
                    }
                }
                if (!var101 && class153.field2908 == 0) {
                    class268.method1838(14, -1, class55.field1203, var100);
                }
            } else if (var76.method272(class260.field4601, 65)) {
                class30 var84 = var76.method274(var76.method255(true, class122.field2392), 0, (byte) -127);
                long var85 = var84.method297((byte) -44);
                boolean var87 = false;
                for (int var88 = 0; var88 < class141.field2730; var88++) {
                    if (class254.field4485[var88] == var85) {
                        var87 = true;
                        break;
                    }
                }
                if (!var87 && class153.field2908 == 0) {
                    class268.method1838(15, -1, class55.field1203, var84);
                }
            } else if (var76.method272(class172.field3223, 65)) {
                class30 var95 = var76.method274(var76.method255(true, class122.field2392), 0, (byte) -120);
                boolean var96 = false;
                long var97 = var95.method297((byte) -120);
                for (int var99 = 0; var99 < class141.field2730; var99++) {
                    if (class254.field4485[var99] == var97) {
                        var96 = true;
                        break;
                    }
                }
                if (!var96 && class153.field2908 == 0) {
                    class268.method1838(16, -1, class55.field1203, var95);
                }
            } else if (var76.method272(class241.field4287, 65)) {
                class30 var89 = var76.method274(var76.method255(true, class122.field2392), 0, (byte) -114);
                boolean var90 = false;
                long var91 = var89.method297((byte) -127);
                for (int var93 = 0; var93 < class141.field2730; var93++) {
                    if (class254.field4485[var93] == var91) {
                        var90 = true;
                        break;
                    }
                }
                if (!var90 && class153.field2908 == 0) {
                    class30 var94 = var76.method274(var76.method249(-42) - 9, var76.method255(true, class122.field2392) - -1, (byte) -127);
                    class268.method1838(21, -1, var94, var89);
                }
            } else {
                class268.method1838(0, -1, var76, class55.field1203);
            }
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 115) {
            class209.method1479(16);
            class230.method1634((byte) -124);
            class204.field3656 += 32;
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 26) {
            for (int var117 = 0; var117 < class142.field2741.length; var117++) {
                if (class254.field4477[var117] != class142.field2741[var117]) {
                    class142.field2741[var117] = class254.field4477[var117];
                    class253.method1761(var117, (byte) 100);
                    class80.field1727[class68.method612(31, class204.field3656++)] = var117;
                }
            }
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 210) {
            int var118 = class59.field1289.method63((byte) 107);
            int var119 = var118 >> 2;
            int var120 = class132.field2609[var119];
            int var121 = var118 & 0x3;
            int var122 = class59.field1289.method83(false);
            int var123 = (var122 & 0x39C57D8D) >> 28;
            int var124 = var122 & 0x3FFF;
            int var125 = class59.field1289.method65((byte) 111);
            int var126 = var124 - class196.field3547;
            int var127 = var122 >> 14 & 0x3FFF;
            if (var125 == 65535) {
                var125 = -1;
            }
            int var128 = var127 - class22.field421;
            class37.method352(var123, var120, var119, var128, var126, var121, (byte) 79, var125);
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 167) {
            class219.field3957 = class59.field1289.method63((byte) 116);
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 220) {
            class210.field3771 = 0;
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 165) {
            byte var129 = class59.field1289.method90(22834);
            int var130 = class59.field1289.method92(125);
            class243.method1718(true, var129, var130);
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 184) {
            int var131 = class59.field1289.method79(true);
            int var132 = class59.field1289.method79(true);
            int var133 = class59.field1289.method77((byte) -56);
            class275 var134 = class125.field2443[var131];
            if (var134 != null) {
                class150.method1088(var134, var132, var133, 105);
            }
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 225) {
            int var135 = class59.field1289.method65((byte) 114);
            class30 var136 = class59.field1289.method84(0);
            Object[] var137 = new Object[var136.method249(-64) + 1];
            for (int var138 = var136.method249(-8) - 1; var138 >= 0; var138--) {
                if (var136.method283(var138, 255) == 115) {
                    var137[var138 + 1] = class59.field1289.method84(0);
                } else {
                    var137[var138 + 1] = Integer.valueOf(class59.field1289.method70(65280));
                }
            }
            var137[0] = Integer.valueOf(class59.field1289.method70(65280));
            if (class50.method501(0, var135)) {
                class183 var139 = new class183();
                var139.field3363 = var137;
                class104.method835(var139, (byte) 41);
            }
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 28) {
            class141.field2730 = class163.field3041 / 8;
            for (int var140 = 0; var140 < class141.field2730; var140++) {
                class254.field4485[var140] = class59.field1289.method101(-122);
                class230.field4093[var140] = class197.method1422(class254.field4485[var140], -127);
            }
            class70.field1586 = -1;
            class210.field3781 = class14.field308;
            return true;
        } else if (class70.field1586 == 8) {
            class70.method655((byte) -31, class59.field1289);
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 48) {
            if (class196.field3548 != -1) {
                class185.method1325(class196.field3548, (byte) -57, 0);
            }
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 78) {
            long var141 = class59.field1289.method101(-116);
            int var143 = class59.field1289.method65((byte) 110);
            boolean var144 = false;
            byte var145 = class59.field1289.method98(1);
            if ((Long.MIN_VALUE & var141) != 0L) {
                var144 = true;
            }
            if (var144) {
                if (class122.field2405 == 0) {
                    class70.field1586 = -1;
                    return true;
                }
                long var151 = var141 & Long.MAX_VALUE;
                boolean var153 = false;
                int var154;
                for (var154 = 0; var154 < class122.field2405 && (class244.field4366[var154].field4215 != var151 || class244.field4366[var154].field2106 != var143); var154++) {
                }
                if (class122.field2405 > var154) {
                    while (var154 < class122.field2405 - 1) {
                        class244.field4366[var154] = class244.field4366[var154 + 1];
                        var154++;
                    }
                    class122.field2405--;
                    class244.field4366[class122.field2405] = null;
                }
            } else {
                class30 var146 = class59.field1289.method84(0);
                class105 var147 = new class105();
                var147.field4215 = var141;
                var147.field2107 = class197.method1422(var147.field4215, -117);
                var147.field2117 = var146;
                var147.field2118 = var145;
                var147.field2106 = var143;
                int var148;
                for (var148 = class122.field2405 - 1; var148 >= 0; var148--) {
                    int var149 = class244.field4366[var148].field2107.method280((byte) 1, var147.field2107);
                    if (var149 == 0) {
                        class244.field4366[var148].field2106 = var143;
                        class244.field4366[var148].field2118 = var145;
                        class244.field4366[var148].field2117 = var146;
                        if (class88.field1799 == var141) {
                            class256.field4515 = var145;
                        }
                        class194.field3500 = class14.field308;
                        class70.field1586 = -1;
                        return true;
                    }
                    if (var149 < 0) {
                        break;
                    }
                }
                if (class244.field4366.length <= class122.field2405) {
                    class70.field1586 = -1;
                    return true;
                }
                for (int var150 = class122.field2405 - 1; var150 > var148; var150--) {
                    class244.field4366[var150 + 1] = class244.field4366[var150];
                }
                if (class122.field2405 == 0) {
                    class244.field4366 = new class105[100];
                }
                class244.field4366[var148 + 1] = var147;
                class122.field2405++;
                if (class88.field1799 == var141) {
                    class256.field4515 = var145;
                }
            }
            class70.field1586 = -1;
            class194.field3500 = class14.field308;
            return true;
        } else if (class70.field1586 == 216) {
            long var155 = class59.field1289.method101(-124);
            class59.field1289.method98(1);
            long var157 = class59.field1289.method101(-113);
            long var159 = (long) class59.field1289.method65((byte) 113);
            long var161 = (long) class59.field1289.method60(23888);
            long var163 = (var159 << 32) + var161;
            int var165 = class59.field1289.method63((byte) 121);
            boolean var166 = false;
            int var167 = 0;
            label1248: while (true) {
                if (var167 >= 100) {
                    if (var165 <= 1) {
                        if (class36.field874 == 1 || class230.field4091 == 1) {
                            var166 = true;
                        } else {
                            for (int var168 = 0; var168 < class141.field2730; var168++) {
                                if (class254.field4485[var168] == var155) {
                                    var166 = true;
                                    break label1248;
                                }
                            }
                        }
                    }
                    break;
                }
                if (class20.field363[var167] == var163) {
                    var166 = true;
                    break;
                }
                var167++;
            }
            if (!var166 && class153.field2908 == 0) {
                class20.field363[class93.field1869] = var163;
                class93.field1869 = (class93.field1869 + 1) % 100;
                class30 var169 = class206.method1448(class108.method851(class59.field1289, false).method278(0));
                if (var165 == 2 || var165 == 3) {
                    class11.method110(class197.method1422(var157, -123).method256(123), class160.method1188(new class30[] { class68.field1494, class197.method1422(var155, -121).method256(122) }, 0), 9, 79, var169);
                } else if (var165 == 1) {
                    class11.method110(class197.method1422(var157, -117).method256(102), class160.method1188(new class30[] { class219.field3952, class197.method1422(var155, -126).method256(91) }, 0), 9, 104, var169);
                } else {
                    class11.method110(class197.method1422(var157, -122).method256(75), class197.method1422(var155, -125).method256(81), 9, -91, var169);
                }
            }
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 187) {
            long var170 = class59.field1289.method101(-98);
            class30 var172 = class206.method1448(class108.method851(class59.field1289, false).method278(0));
            class268.method1838(6, -1, var172, class197.method1422(var170, -125).method256(89));
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 21) {
            class202.field3607 = class59.field1289.method92(106) * 30;
            class70.field1586 = -1;
            class134.field2622 = class14.field308;
            return true;
        } else if (class70.field1586 == 22) {
            int var173 = class59.field1289.method65((byte) 115);
            int var174 = class59.field1289.method63((byte) 67);
            int var175 = class59.field1289.method81(-1239235384);
            if (class50.method501(0, var173)) {
                if (var174 == 2) {
                    class232.method1645((byte) -104);
                }
                class196.field3548 = var175;
                class260.method1800(-91, var175);
                class73.method671(73, false);
                class14.method150(-1, class196.field3548);
                for (int var176 = 0; var176 < 100; var176++) {
                    class14.field288[var176] = true;
                }
            }
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 226) {
            int var177 = class59.field1289.method77((byte) 111);
            int var178 = class59.field1289.method65((byte) 117);
            class131.method998(var177, 26074, var178);
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 62) {
            int var179 = class59.field1289.method63((byte) 65);
            if (class59.field1289.method63((byte) 47) == 0) {
                class73.field1648[var179] = new class141();
            } else {
                class59.field1289.field146--;
                class73.field1648[var179] = new class141(class59.field1289);
            }
            class70.field1586 = -1;
            class185.field3395 = class14.field308;
            return true;
        } else if (class70.field1586 == 198) {
            int var180 = class59.field1289.method81(-1239235384);
            if (var180 == 65535) {
                var180 = -1;
            }
            class94.method760(var180, 126);
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 173) {
            int var181 = class59.field1289.method79(true);
            if (var181 == 65535) {
                var181 = -1;
            }
            int var182 = class59.field1289.method46((byte) -15);
            class154.method1152(var181, -108, var182);
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 54) {
            int var183 = class59.field1289.method81(-1239235384);
            int var184 = class59.field1289.method92(106);
            class110.field2202 = var183;
            class91.field1851 = var184;
            class25.method224((byte) -114);
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 36) {
            class41.method428(31531);
            class70.field1586 = -1;
            return false;
        } else if (class70.field1586 == 136) {
            class194.field3500 = class14.field308;
            long var185 = class59.field1289.method101(-122);
            if (var185 == 0L) {
                class148.field2825 = null;
                class244.field4366 = null;
                class201.field3581 = null;
                class122.field2405 = 0;
                class70.field1586 = -1;
                return true;
            }
            long var187 = class59.field1289.method101(-110);
            class148.field2825 = class197.method1422(var187, -128);
            class201.field3581 = class197.method1422(var185, -128);
            class210.field3780 = class59.field1289.method98(1);
            int var189 = class59.field1289.method63((byte) 86);
            if (var189 == 255) {
                class70.field1586 = -1;
                return true;
            }
            class122.field2405 = var189;
            class105[] var190 = new class105[100];
            for (int var191 = 0; var191 < class122.field2405; var191++) {
                var190[var191] = new class105();
                var190[var191].field4215 = class59.field1289.method101(-104);
                var190[var191].field2107 = class197.method1422(var190[var191].field4215, -128);
                var190[var191].field2106 = class59.field1289.method65((byte) 118);
                var190[var191].field2118 = class59.field1289.method98(1);
                var190[var191].field2117 = class59.field1289.method84(0);
                if (class88.field1799 == var190[var191].field4215) {
                    class256.field4515 = var190[var191].field2118;
                }
            }
            boolean var192 = false;
            int var193 = class122.field2405;
            while (var193 > 0) {
                var193--;
                boolean var194 = true;
                for (int var195 = 0; var195 < var193; var195++) {
                    if (var190[var195].field2107.method280((byte) 1, var190[var195 + 1].field2107) > 0) {
                        class105 var196 = var190[var195];
                        var190[var195] = var190[var195 + 1];
                        var194 = false;
                        var190[var195 + 1] = var196;
                    }
                }
                if (var194) {
                    break;
                }
            }
            class70.field1586 = -1;
            class244.field4366 = var190;
            return true;
        } else if (class70.field1586 == 228) {
            int var197 = class59.field1289.method70(65280);
            class60.field1307 = class190.field3452.method600(var197, 0);
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 232) {
            int var198 = class59.field1289.method92(104);
            int var199 = class59.field1289.method70(65280);
            class243.method1718(true, var199, var198);
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 60) {
            int var200 = class59.field1289.method83(false);
            int var201 = class59.field1289.method81(-1239235384);
            int var202 = class59.field1289.method83(false);
            if (class50.method501(0, var201)) {
                class180 var203 = (class180) class143.field2762.method1168(-3, (long) var200);
                class180 var204 = (class180) class143.field2762.method1168(-3, (long) var202);
                if (var204 != null) {
                    class2.method13((byte) -73, var203 == null || var203.field3335 != var204.field3335, var204);
                }
                if (var203 != null) {
                    var203.method1681(false);
                    class143.field2762.method1164((byte) -96, (long) var202, var203);
                }
                class31 var205 = class272.method1858(var200, 65535);
                if (var205 != null) {
                    class254.method1771(var205, 8);
                }
                class31 var206 = class272.method1858(var202, 65535);
                if (var206 != null) {
                    class254.method1771(var206, 8);
                    class112.method875((byte) 106, var206, true);
                }
                if (class196.field3548 != -1) {
                    class185.method1325(class196.field3548, (byte) -57, 1);
                }
            }
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 131) {
            int var207 = class59.field1289.method79(true);
            class180.method1310(var207, 60);
            class247.field4395[class68.method612(31, class257.field4526++)] = class68.method612(var207, 32767);
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 188) {
            int var208 = class59.field1289.method65((byte) 107);
            int var209 = class59.field1289.method65((byte) 125);
            if (var209 == 65535) {
                var209 = -1;
            }
            int var210 = class59.field1289.method83(false);
            if (class50.method501(0, var208)) {
                class119.method907(10522, var210, 2, var209);
            }
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 234) {
            class277.field4823 = class59.field1289.method63((byte) 60);
            class210.field3781 = class14.field308;
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 23) {
            int var211 = class59.field1289.method65((byte) 118);
            int var212 = class59.field1289.method65((byte) 116);
            int var213 = class59.field1289.method65((byte) 115);
            int var214 = class59.field1289.method70(65280);
            if (class50.method501(0, var213)) {
                class254.method1766(var214, (var211 << 16) + var212, 17);
            }
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 209) {
            int var215 = class59.field1289.method69(5002);
            int var216 = class59.field1289.method54(127);
            class30 var217 = class59.field1289.method84(0);
            if (var215 >= 1 && var215 <= 8) {
                if (var217.method285(class129.field2536, 0)) {
                    var217 = null;
                }
                class157.field2956[var215 - 1] = var217;
                class48.field1105[var215 - 1] = var216 == 0;
            }
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 46) {
            class115.field2277 = class59.field1289.method63((byte) 87);
            class220.field3972 = class59.field1289.method54(120);
            while (class163.field3041 > class59.field1289.field146) {
                class70.field1586 = class59.field1289.method63((byte) 63);
                class245.method1723((byte) 60);
            }
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 125) {
            int var218 = class59.field1289.method99(false);
            int var219 = class59.field1289.method81(-1239235384);
            if (class50.method501(0, var219)) {
                int var220 = 0;
                if (class247.field4394.field2343 != null) {
                    var220 = class247.field4394.field2343.method1327((byte) 81);
                }
                class119.method907(10522, var218, 3, var220);
            }
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 164) {
            class220.field3972 = class59.field1289.method69(5002);
            class115.field2277 = class59.field1289.method69(5002);
            for (int var221 = class115.field2277; var221 < class115.field2277 + 8; var221++) {
                for (int var223 = class220.field3972; var223 < (class220.field3972 + 8); var223++) {
                    if (class103.field2078[class159.field2998][var221][var223] != null) {
                        class103.field2078[class159.field2998][var221][var223] = null;
                        class132.method1001(5640, var221, var223);
                    }
                }
            }
            for (class202 var222 = (class202) class41.field1024.method478(0); var222 != null; var222 = (class202) class41.field1024.method476((byte) 13)) {
                if (var222.field3616 >= class115.field2277 && (class115.field2277 + 8) > var222.field3616 && class220.field3972 <= var222.field3596 && var222.field3596 < (class220.field3972 + 8) && class159.field2998 == var222.field3605) {
                    var222.field3617 = 0;
                }
            }
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 29) {
            for (int var224 = 0; var224 < class75.field1670.length; var224++) {
                if (class75.field1670[var224] != null) {
                    class75.field1670[var224].field1364 = -1;
                }
            }
            for (int var225 = 0; var225 < class125.field2443.length; var225++) {
                if (class125.field2443[var225] != null) {
                    class125.field2443[var225].field1364 = -1;
                }
            }
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 135) {
            int var226 = class59.field1289.method54(70);
            int var227 = class59.field1289.method65((byte) 115);
            int var228 = class59.field1289.method92(106);
            if (class50.method501(0, var227)) {
                class104.method832(62, var228, var226);
            }
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 133) {
            int var229 = class59.field1289.method65((byte) 113);
            int var230 = class59.field1289.method99(false);
            class131.method998(var230, 26074, var229);
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 124) {
            int var231 = class59.field1289.method67(-48);
            int var232 = class59.field1289.method65((byte) 123);
            int var233 = class59.field1289.method65((byte) 114);
            if (class50.method501(0, var232)) {
                class104.method832(74, var233, var231);
            }
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 12) {
            int var234 = class59.field1289.method65((byte) 112);
            int var235 = class59.field1289.method70(65280);
            if (class50.method501(0, var234)) {
                class180 var236 = (class180) class143.field2762.method1168(-3, (long) var235);
                if (var236 != null) {
                    class2.method13((byte) -73, true, var236);
                }
                if (class263.field4661 != null) {
                    class254.method1771(class263.field4661, 8);
                    class263.field4661 = null;
                }
            }
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 27) {
            class30 var237 = class59.field1289.method84(0);
            int var238 = class59.field1289.method79(true);
            int var239 = class59.field1289.method65((byte) 112);
            if (class50.method501(0, var238)) {
                class173.method1268(var237, var239, (byte) -82);
            }
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 178) {
            int var240 = class59.field1289.method63((byte) 106);
            int var241 = class59.field1289.method63((byte) 94);
            int var242 = class59.field1289.method65((byte) 123);
            int var243 = class59.field1289.method63((byte) 54);
            int var244 = class59.field1289.method63((byte) 62);
            class270.method1846(true, var241, var243, var244, var240, 0, var242);
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 68) {
            int var245 = class59.field1289.method79(true);
            int var246 = class59.field1289.method79(true);
            class30 var247 = class59.field1289.method84(0);
            if (class50.method501(0, var246)) {
                class173.method1268(var247, var245, (byte) -82);
            }
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 191) {
            int var248 = class59.field1289.method67(-58);
            int var249 = class59.field1289.method65((byte) 111);
            int var250 = class59.field1289.method65((byte) 119);
            int var251 = class59.field1289.method92(125);
            if (var248 >> 30 != 0) {
                int var252 = var248 >> 28 & 0x3;
                int var253 = (var248 & 0x3FFF) - class196.field3547;
                int var254 = (var248 >> 14 & 0x3FFF) - class22.field421;
                if (var254 >= 0 && var253 >= 0 && var254 < 104 && var253 < 104) {
                    int var255 = var253 * 128 + 64;
                    int var256 = var254 * 128 + 64;
                    class186 var257 = new class186(var251, var252, var256, var255, class31.method303(var256, var255, var252, -4) - var249, var250, class133.field2617);
                    class238.field4237.method477(new class123(var257), (byte) 6);
                }
            } else if (var248 >> 29 != 0) {
                int var262 = var248 & 0xFFFF;
                class275 var263 = class125.field2443[var262];
                if (var263 != null) {
                    var263.field1339 = class133.field2617 + var250;
                    var263.field1345 = var251;
                    var263.field1403 = 0;
                    var263.field1346 = 0;
                    var263.field1369 = var249;
                    if (var263.field1345 == 65535) {
                        var263.field1345 = -1;
                    }
                    if (class133.field2617 < var263.field1339) {
                        var263.field1403 = -1;
                    }
                    if (var263.field1345 != -1 && class133.field2617 == var263.field1339) {
                        int var264 = class263.method1819(var263.field1345, -4).field460;
                        if (var264 != -1) {
                            class138 var265 = class193.method1396(-30590, var264);
                            if (var265 != null && var265.field2699 != null) {
                                class53.method518(var263.field1360, var263.field1336, -127, 0, var265, false);
                            }
                        }
                    }
                }
            } else if (var248 >> 28 != 0) {
                int var258 = var248 & 0xFFFF;
                class120 var259;
                if (class249.field4405 == var258) {
                    var259 = class247.field4394;
                } else {
                    var259 = class75.field1670[var258];
                }
                if (var259 != null) {
                    var259.field1346 = 0;
                    var259.field1403 = 0;
                    var259.field1345 = var251;
                    var259.field1339 = class133.field2617 + var250;
                    var259.field1369 = var249;
                    if (class133.field2617 < var259.field1339) {
                        var259.field1403 = -1;
                    }
                    if (var259.field1345 == 65535) {
                        var259.field1345 = -1;
                    }
                    if (var259.field1345 != -1 && class133.field2617 == var259.field1339) {
                        int var260 = class263.method1819(var259.field1345, -4).field460;
                        if (var260 != -1) {
                            class138 var261 = class193.method1396(-30590, var260);
                            if (var261 != null && var261.field2699 != null) {
                                class53.method518(var259.field1360, var259.field1336, -127, 0, var261, class247.field4394 == var259);
                            }
                        }
                    }
                }
            }
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 40) {
            long var266 = class59.field1289.method101(-112);
            boolean var268 = true;
            int var269 = class59.field1289.method65((byte) 111);
            if (var266 < 0L) {
                var266 &= Long.MAX_VALUE;
                var268 = false;
            }
            int var270 = class59.field1289.method63((byte) 46);
            class30 var271 = class55.field1203;
            if (var269 > 0) {
                var271 = class59.field1289.method84(0);
            }
            class30 var272 = class197.method1422(var266, -121).method256(105);
            for (int var273 = 0; var273 < class117.field2307; var273++) {
                if (class103.field2083[var273] == var266) {
                    if (class90.field1807[var273] != var269) {
                        class90.field1807[var273] = var269;
                        if (var269 > 0) {
                            class268.method1838(5, -1, class160.method1188(new class30[] { var272, class33.field822 }, 0), class55.field1203);
                        }
                        if (var269 == 0) {
                            class268.method1838(5, -1, class160.method1188(new class30[] { var272, class49.field1109 }, 0), class55.field1203);
                        }
                    }
                    var272 = null;
                    class145.field2785[var273] = var271;
                    class130.field2569[var273] = var270;
                    class123.field2417[var273] = var268;
                    break;
                }
            }
            if (var272 != null && class117.field2307 < 200) {
                class103.field2083[class117.field2307] = var266;
                class204.field3661[class117.field2307] = var272;
                class90.field1807[class117.field2307] = var269;
                class145.field2785[class117.field2307] = var271;
                class130.field2569[class117.field2307] = var270;
                class123.field2417[class117.field2307] = var268;
                class117.field2307++;
            }
            boolean var274 = false;
            class210.field3781 = class14.field308;
            int var275 = class117.field2307;
            while (var275 > 0) {
                boolean var276 = true;
                var275--;
                for (int var277 = 0; var277 < var275; var277++) {
                    if (class90.field1807[var277] != class200.field3579 && class90.field1807[var277 + 1] == class200.field3579 || class90.field1807[var277] == 0 && class90.field1807[var277 + 1] != 0) {
                        var276 = false;
                        int var278 = class90.field1807[var277];
                        class90.field1807[var277] = class90.field1807[var277 + 1];
                        class90.field1807[var277 + 1] = var278;
                        class30 var279 = class145.field2785[var277];
                        class145.field2785[var277] = class145.field2785[var277 + 1];
                        class145.field2785[var277 + 1] = var279;
                        class30 var280 = class204.field3661[var277];
                        class204.field3661[var277] = class204.field3661[var277 + 1];
                        class204.field3661[var277 + 1] = var280;
                        long var281 = class103.field2083[var277];
                        class103.field2083[var277] = class103.field2083[var277 + 1];
                        class103.field2083[var277 + 1] = var281;
                        int var283 = class130.field2569[var277];
                        class130.field2569[var277] = class130.field2569[var277 + 1];
                        class130.field2569[var277 + 1] = var283;
                        boolean var284 = class123.field2417[var277];
                        class123.field2417[var277] = class123.field2417[var277 + 1];
                        class123.field2417[var277 + 1] = var284;
                    }
                }
                if (var276) {
                    break;
                }
            }
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 53) {
            class193.method1398(false, -50);
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 37) {
            int var285 = class59.field1289.method81(-1239235384);
            int var286 = class59.field1289.method79(true);
            int var287 = class59.field1289.method92(110);
            if (var287 == 65535) {
                var287 = -1;
            }
            int var288 = class59.field1289.method83(false);
            if (var286 == 65535) {
                var286 = -1;
            }
            int var289 = class59.field1289.method70(65280);
            if (class50.method501(0, var285)) {
                for (int var290 = var286; var290 <= var287; var290++) {
                    long var291 = ((long) var288 << 32) + ((long) var290);
                    class236 var293 = class232.field4130.method1168(-3, var291);
                    if (var293 != null) {
                        var293.method1681(false);
                    }
                    class232.field4130.method1164((byte) -35, var291, new class203(var289));
                }
            }
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 132) {
            int var294 = class59.field1289.method83(false);
            int var295 = class59.field1289.method69(5002);
            int var296 = class59.field1289.method81(-1239235384);
            int var297 = class59.field1289.method81(-1239235384);
            if (class50.method501(0, var296)) {
                class180 var298 = (class180) class143.field2762.method1168(-3, (long) var294);
                if (var298 != null) {
                    class2.method13((byte) -73, var298.field3335 != var297, var298);
                }
                class23.method210(-11999, var295, var297, var294);
            }
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 109) {
            class230.method1634((byte) -23);
            class220.field3979 = class59.field1289.method63((byte) 105);
            class134.field2622 = class14.field308;
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 166) {
            int var299 = class59.field1289.method99(false);
            int var300 = class59.field1289.method67(-58);
            int var301 = class59.field1289.method81(-1239235384);
            int var302 = class59.field1289.method81(-1239235384);
            if (var301 == 65535) {
                var301 = -1;
            }
            if (class50.method501(0, var302)) {
                class31 var303 = class272.method1858(var300, 65535);
                if (var303.field671) {
                    class15.method155(var299, var301, var300, 116);
                    class168 var304 = class201.method1425(86, var301);
                    client.method1489(var300, var304.field3113, 8, var304.field3155, var304.field3138);
                    class146.method1074(true, var304.field3109, var300, var304.field3132, var304.field3161);
                } else if (var301 == -1) {
                    class70.field1586 = -1;
                    var303.field792 = 0;
                    return true;
                } else {
                    class168 var305 = class201.method1425(50, var301);
                    var303.field639 = var305.field3113;
                    var303.field792 = 4;
                    var303.field652 = var305.field3155 * 100 / var299;
                    var303.field685 = var305.field3138;
                    var303.field715 = var301;
                    class254.method1771(var303, 8);
                }
            }
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 212) {
            long var306 = class59.field1289.method101(-105);
            long var308 = (long) class59.field1289.method65((byte) 120);
            long var310 = (long) class59.field1289.method60(23888);
            int var312 = class59.field1289.method63((byte) 124);
            long var313 = (var308 << 32) + var310;
            int var315 = class59.field1289.method65((byte) 113);
            boolean var316 = false;
            int var317 = 0;
            label1360: while (true) {
                if (var317 >= 100) {
                    if (var312 <= 1) {
                        for (int var318 = 0; var318 < class141.field2730; var318++) {
                            if (class254.field4485[var318] == var306) {
                                var316 = true;
                                break label1360;
                            }
                        }
                    }
                    break;
                }
                if (class20.field363[var317] == var313) {
                    var316 = true;
                    break;
                }
                var317++;
            }
            if (!var316 && class153.field2908 == 0) {
                class20.field363[class93.field1869] = var313;
                class93.field1869 = (class93.field1869 + 1) % 100;
                class30 var319 = class254.method1765(var315, -123).method994(0, class59.field1289);
                if (var312 == 2) {
                    class52.method515(class160.method1188(new class30[] { class68.field1494, class197.method1422(var306, -124).method256(100) }, 0), var315, false, (class30) null, var319, 18);
                } else if (var312 == 1) {
                    class52.method515(class160.method1188(new class30[] { class219.field3952, class197.method1422(var306, -119).method256(117) }, 0), var315, false, (class30) null, var319, 18);
                } else {
                    class52.method515(class197.method1422(var306, -122).method256(93), var315, false, (class30) null, var319, 18);
                }
            }
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 157) {
            int var320 = class59.field1289.method63((byte) 65);
            int var321 = class59.field1289.method63((byte) 91);
            int var322 = class59.field1289.method63((byte) 104);
            int var323 = class59.field1289.method63((byte) 124);
            int var324 = class59.field1289.method65((byte) 117);
            class125.field2446[var320] = true;
            class203.field3632[var320] = var321;
            class272.field4768[var320] = var322;
            class246.field4387[var320] = var323;
            class236.field4227[var320] = var324;
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 127) {
            int var325 = class59.field1289.method92(110);
            int var326 = class59.field1289.method70(65280);
            int var327 = class59.field1289.method54(82);
            if (class50.method501(0, var325)) {
                class40.method411(24493, var327, var326);
            }
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 102) {
            long var328 = class59.field1289.method101(-114);
            int var330 = class59.field1289.method65((byte) 110);
            class30 var331 = class254.method1765(var330, 107).method994(0, class59.field1289);
            class52.method515(class197.method1422(var328, -126).method256(117), var330, false, (class30) null, var331, 19);
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 101) {
            int var332 = class59.field1289.method67(-121);
            int var333 = class59.field1289.method74(99);
            int var334 = class59.field1289.method81(-1239235384);
            int var335 = class59.field1289.method86((byte) -118);
            if (class50.method501(0, var334)) {
                class255.method1773(11, var332, var333, var335);
            }
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 107 || class70.field1586 == 241 || class70.field1586 == 18 || class70.field1586 == 50 || class70.field1586 == 153 || class70.field1586 == 183 || class70.field1586 == 214 || class70.field1586 == 134 || class70.field1586 == 39 || class70.field1586 == 74 || class70.field1586 == 85 || class70.field1586 == 81) {
            class245.method1723((byte) 65);
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 193) {
            long var336 = class59.field1289.method101(-111);
            class59.field1289.method98(1);
            long var338 = class59.field1289.method101(-105);
            long var340 = (long) class59.field1289.method65((byte) 112);
            long var342 = (long) class59.field1289.method60(23888);
            int var344 = class59.field1289.method63((byte) 108);
            long var345 = (var340 << 32) + var342;
            int var347 = class59.field1289.method65((byte) 110);
            boolean var348 = false;
            int var349 = 0;
            label1385: while (true) {
                if (var349 >= 100) {
                    if (var344 <= 1) {
                        for (int var350 = 0; var350 < class141.field2730; var350++) {
                            if (class254.field4485[var350] == var336) {
                                var348 = true;
                                break label1385;
                            }
                        }
                    }
                    break;
                }
                if (class20.field363[var349] == var345) {
                    var348 = true;
                    break;
                }
                var349++;
            }
            if (!var348 && class153.field2908 == 0) {
                class20.field363[class93.field1869] = var345;
                class93.field1869 = (class93.field1869 + 1) % 100;
                class30 var351 = class254.method1765(var347, 60).method994(0, class59.field1289);
                if (var344 == 2 || var344 == 3) {
                    class52.method515(class160.method1188(new class30[] { class68.field1494, class197.method1422(var336, -119).method256(120) }, 0), var347, false, class197.method1422(var338, -117).method256(77), var351, 20);
                } else if (var344 == 1) {
                    class52.method515(class160.method1188(new class30[] { class219.field3952, class197.method1422(var336, -120).method256(91) }, 0), var347, false, class197.method1422(var338, -128).method256(101), var351, 20);
                } else {
                    class52.method515(class197.method1422(var336, -125).method256(76), var347, false, class197.method1422(var338, -120).method256(78), var351, 20);
                }
            }
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 96) {
            class32.method326((byte) -94);
            class70.field1586 = -1;
            return true;
        } else if (class70.field1586 == 196) {
            class193.method1398(true, -50);
            class70.field1586 = -1;
            return true;
        } else {
            class93.method751((Throwable) null, "T1 - " + class70.field1586 + "," + class52.field1161 + "," + class36.field871 + " - " + class163.field3041, -8);
            class41.method428(31531);
            return true;
        }
    }
}
