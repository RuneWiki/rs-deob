import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class100 extends class106 {

    @OriginalMember(owner = "client!ke", name = "L", descriptor = "Lrf;")
    public static class163 field2100 = class53.method392(82, "Cabbage");

    @OriginalMember(owner = "client!ke", name = "Q", descriptor = "Lrf;")
    public static class163 field2104 = class53.method392(-59, "::");

    @OriginalMember(owner = "client!ke", name = "G", descriptor = "Lrf;")
    private static class163 field2095 = class53.method392(67, "Ok");

    @OriginalMember(owner = "client!ke", name = "P", descriptor = "[[I")
    public static int[][] field2103 = new int[104][104];

    @OriginalMember(owner = "client!ke", name = "K", descriptor = "Lrf;")
    public static class163 field2099 = field2095;

    @OriginalMember(owner = "client!ke", name = "N", descriptor = "I")
    public static int field2101 = 0;

    @OriginalMember(owner = "client!ke", name = "F", descriptor = "I")
    public static int field2094;

    @OriginalMember(owner = "client!ke", name = "H", descriptor = "I")
    public static int field2096;

    @OriginalMember(owner = "client!ke", name = "I", descriptor = "I")
    public static int field2097;

    @OriginalMember(owner = "client!ke", name = "J", descriptor = "I")
    public int field2098;

    @OriginalMember(owner = "client!ke", name = "O", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!ke", name = "R", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!ke", name = "S", descriptor = "I")
    public static int field2106;

    @OriginalMember(owner = "client!ke", name = "T", descriptor = "I")
    public int field2107;

    @OriginalMember(owner = "client!ke", name = "U", descriptor = "I")
    public int field2108;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "(I)Z")
    public static final boolean method682(int arg0) {
        field2106++;
        if (class92.field2004 == null) {
            return false;
        }
        try {
            int var1 = class92.field2004.method693(-110);
            if (var1 == 0) {
                return false;
            }
            if (class105.field2185 == -1) {
                class92.field2004.method699(0, true, 1, class105.field2195.field1054);
                var1--;
                class105.field2195.field1033 = 0;
                class105.field2185 = class105.field2195.method335(true);
                class74.field1554 = class181.field3634[class105.field2185];
            }
            if (class74.field1554 == -1) {
                if (var1 <= 0) {
                    return false;
                }
                var1--;
                class92.field2004.method699(0, true, 1, class105.field2195.field1054);
                class74.field1554 = class105.field2195.field1054[0] & 0xFF;
            }
            if (class74.field1554 == -2) {
                if (var1 <= 1) {
                    return false;
                }
                var1 -= 2;
                class92.field2004.method699(0, true, 2, class105.field2195.field1054);
                class105.field2195.field1033 = 0;
                class74.field1554 = class105.field2195.method390((byte) 122);
            }
            if (var1 < class74.field1554) {
                return false;
            }
            class105.field2195.field1033 = 0;
            class92.field2004.method699(0, true, class74.field1554, class105.field2195.field1054);
            class7.field161 = 0;
            class166.field3382 = field2101;
            field2101 = class205.field4022;
            class205.field4022 = class105.field2185;
            if (class105.field2185 == 8) {
                class161.method1009((byte) 71);
                class58.field1171 = class105.field2195.method344(255);
                class105.field2185 = -1;
                class14.field254 = class62.field1325;
                return true;
            }
            if (class105.field2185 == 54) {
                int var2 = class105.field2195.method338((byte) 86);
                int var3 = class105.field2195.method383(84);
                int var4 = class105.field2195.method390((byte) 123);
                class87 var5 = (class87) class138.field2847.method465((long) var3, (byte) 80);
                if (var5 != null) {
                    class32.method211((byte) -3, var5.field1903 != var4, var5);
                }
                class43.method263(0, var3, var2, var4);
                class105.field2185 = -1;
                return true;
            }
            if (class105.field2185 == 88) {
                long var6 = class105.field2195.method379(false);
                int var8 = class105.field2195.method390((byte) 101);
                int var9 = class105.field2195.method344(255);
                class163 var10 = class116.method802(var6, true).method1031(false);
                for (int var11 = 0; var11 < class186.field3717; var11++) {
                    if (class86.field1887[var11] == var6) {
                        if (class115.field2449[var11] != var8) {
                            class115.field2449[var11] = var8;
                            if (var8 > 0) {
                                class43.method267((byte) -48, class180.method1216(new class163[] { var10, class39.field798 }, false), class36.field728, 5);
                            }
                            if (var8 == 0) {
                                class43.method267((byte) -60, class180.method1216(new class163[] { var10, class84.field1858 }, false), class36.field728, 5);
                            }
                        }
                        class52.field1091[var11] = var9;
                        var10 = null;
                        break;
                    }
                }
                if (var10 != null && class186.field3717 < 200) {
                    class86.field1887[class186.field3717] = var6;
                    class87.field1891[class186.field3717] = var10;
                    class115.field2449[class186.field3717] = var8;
                    class52.field1091[class186.field3717] = var9;
                    class186.field3717++;
                }
                boolean var12 = false;
                class109.field2286 = class62.field1325;
                int var13 = class186.field3717;
                while (var13 > 0) {
                    boolean var14 = true;
                    var13--;
                    for (int var15 = 0; var15 < var13; var15++) {
                        if (class115.field2449[var15] != class27.field503 && class115.field2449[var15 + 1] == class27.field503 || class115.field2449[var15] == 0 && class115.field2449[var15 + 1] != 0) {
                            var14 = false;
                            int var16 = class115.field2449[var15];
                            class115.field2449[var15] = class115.field2449[var15 + 1];
                            class115.field2449[var15 + 1] = var16;
                            class163 var17 = class87.field1891[var15];
                            class87.field1891[var15] = class87.field1891[var15 + 1];
                            class87.field1891[var15 + 1] = var17;
                            long var18 = class86.field1887[var15];
                            class86.field1887[var15] = class86.field1887[var15 + 1];
                            class86.field1887[var15 + 1] = var18;
                            int var20 = class52.field1091[var15];
                            class52.field1091[var15] = class52.field1091[var15 + 1];
                            class52.field1091[var15 + 1] = var20;
                        }
                    }
                    if (var14) {
                        break;
                    }
                }
                class105.field2185 = -1;
                return true;
            }
            if (class105.field2185 == 135) {
                int var21 = class105.field2195.method344(255);
                int var22 = class105.field2195.method344(arg0 + 99);
                int var23 = class105.field2195.method344(255);
                int var24 = class105.field2195.method344(255);
                int var25 = class105.field2195.method390((byte) 89);
                class25.field451[var21] = true;
                class59.field1191[var21] = var22;
                class82.field1662[var21] = var23;
                class21.field371[var21] = var24;
                class113.field2383[var21] = var25;
                class105.field2185 = -1;
                return true;
            }
            if (class105.field2185 == 94) {
                int var26 = class105.field2195.method339((byte) -86);
                class127.field2611 = class10.field197.method475(var26, -3);
                class105.field2185 = -1;
                return true;
            }
            if (class105.field2185 == 33) {
                class163 var27 = class105.field2195.method363(19047);
                if (var27.method1040((byte) 40, class128.field2634)) {
                    class163 var28 = var27.method1036(var27.method1035(true, class150.field3107), (byte) 116, 0);
                    long var29 = var28.method1058(25);
                    boolean var31 = false;
                    for (int var32 = 0; var32 < class26.field479; var32++) {
                        if (class130.field2713[var32] == var29) {
                            var31 = true;
                            break;
                        }
                    }
                    if (!var31 && class97.field2053 == 0) {
                        class43.method267((byte) -67, class29.field539, var28, 4);
                    }
                } else if (var27.method1040((byte) 40, class60.field1234)) {
                    class163 var33 = var27.method1036(var27.method1035(true, class150.field3107), (byte) 123, 0);
                    long var34 = var33.method1058(33);
                    boolean var36 = false;
                    for (int var37 = 0; var37 < class26.field479; var37++) {
                        if (class130.field2713[var37] == var34) {
                            var36 = true;
                            break;
                        }
                    }
                    if (!var36 && class97.field2053 == 0) {
                        class163 var38 = var27.method1036(var27.method1029(125) - 9, (byte) 91, var27.method1035(true, class150.field3107) + 1);
                        class43.method267((byte) -114, var38, var33, 8);
                    }
                } else if (var27.method1040((byte) 40, class64.field1347)) {
                    boolean var57 = false;
                    class163 var58 = var27.method1036(var27.method1035(true, class150.field3107), (byte) 123, 0);
                    long var59 = var58.method1058(-126);
                    for (int var61 = 0; var61 < class26.field479; var61++) {
                        if (class130.field2713[var61] == var59) {
                            var57 = true;
                            break;
                        }
                    }
                    if (!var57 && class97.field2053 == 0) {
                        class43.method267((byte) -45, class36.field728, var58, 10);
                    }
                } else if (var27.method1040((byte) 40, class158.field3229)) {
                    class163 var39 = var27.method1036(var27.method1035(true, class158.field3229), (byte) 91, 0);
                    class43.method267((byte) -128, var39, class36.field728, 11);
                } else if (var27.method1040((byte) 40, class59.field1198)) {
                    class163 var56 = var27.method1036(var27.method1035(true, class59.field1198), (byte) 99, 0);
                    if (class97.field2053 == 0) {
                        class43.method267((byte) -103, var56, class36.field728, 12);
                    }
                } else if (var27.method1040((byte) 40, class117.field2478)) {
                    class163 var55 = var27.method1036(var27.method1035(true, class117.field2478), (byte) 93, 0);
                    if (class97.field2053 == 0) {
                        class43.method267((byte) -112, var55, class36.field728, 13);
                    }
                } else if (var27.method1040((byte) 40, class133.field2760)) {
                    class163 var40 = var27.method1036(var27.method1035(true, class150.field3107), (byte) 92, 0);
                    long var41 = var40.method1058(arg0 ^ 0xC9);
                    boolean var43 = false;
                    for (int var44 = 0; var44 < class26.field479; var44++) {
                        if (class130.field2713[var44] == var41) {
                            var43 = true;
                            break;
                        }
                    }
                    if (!var43 && class97.field2053 == 0) {
                        class43.method267((byte) -48, class36.field728, var40, 14);
                    }
                } else if (var27.method1040((byte) 40, class9.field189)) {
                    class163 var50 = var27.method1036(var27.method1035(true, class150.field3107), (byte) 117, 0);
                    long var51 = var50.method1058(arg0 ^ 0x9E);
                    boolean var53 = false;
                    for (int var54 = 0; var54 < class26.field479; var54++) {
                        if (class130.field2713[var54] == var51) {
                            var53 = true;
                            break;
                        }
                    }
                    if (!var53 && class97.field2053 == 0) {
                        class43.method267((byte) -113, class36.field728, var50, 15);
                    }
                } else if (var27.method1040((byte) 40, class103.field2162)) {
                    class163 var45 = var27.method1036(var27.method1035(true, class150.field3107), (byte) 106, 0);
                    boolean var46 = false;
                    long var47 = var45.method1058(-115);
                    for (int var49 = 0; var49 < class26.field479; var49++) {
                        if (class130.field2713[var49] == var47) {
                            var46 = true;
                            break;
                        }
                    }
                    if (!var46 && class97.field2053 == 0) {
                        class43.method267((byte) -63, class36.field728, var45, 16);
                    }
                } else {
                    class43.method267((byte) -60, var27, class36.field728, 0);
                }
                class105.field2185 = -1;
                return true;
            }
            if (class105.field2185 == 241) {
                class57.field1140 = class105.field2195.method344(arg0 + 99);
                class118.field2503 = class105.field2195.method344(arg0 ^ 0x63);
                class186.field3709 = class105.field2195.method344(255);
                class105.field2185 = -1;
                return true;
            }
            if (class105.field2185 == 44) {
                int var62 = class105.field2195.method383(93);
                int var63 = class105.field2195.method382(119);
                int var64 = class105.field2195.method349((byte) 93);
                if (var64 == 65535) {
                    var64 = -1;
                }
                class84 var65 = class138.method907(var63, false);
                if (var65.field1853) {
                    var65.field1821 = var64;
                    var65.field1790 = var62;
                    class4 var66 = class97.method669(arg0 - 249, var64);
                    var65.field1788 = var66.field70;
                    var65.field1759 = var66.field63;
                    var65.field1742 = var66.field84;
                    var65.field1739 = var66.field68;
                    var65.field1802 = var66.field92;
                    var65.field1740 = var66.field96;
                    if (var65.field1746 > 0) {
                        var65.field1802 = var65.field1802 * 32 / var65.field1746;
                    }
                    class194.method1295((byte) -122, var65);
                } else if (var64 == -1) {
                    class105.field2185 = -1;
                    var65.field1816 = 0;
                    return true;
                } else {
                    class4 var67 = class97.method669(arg0 - 271, var64);
                    var65.field1816 = 4;
                    var65.field1739 = var67.field68;
                    var65.field1787 = var64;
                    var65.field1742 = var67.field84;
                    var65.field1802 = var67.field92 * 100 / var62;
                    class194.method1295((byte) -127, var65);
                }
                class105.field2185 = -1;
                return true;
            }
            if (class105.field2185 == 151) {
                int var68 = class105.field2195.method367(75);
                if (var68 == 65535) {
                    var68 = -1;
                }
                int var69 = class105.field2195.method376((byte) 113);
                class84 var70 = class138.method907(var69, false);
                if (var70.field1816 != 1 || var70.field1787 != var68) {
                    var70.field1816 = 1;
                    var70.field1787 = var68;
                    class194.method1295((byte) 77, var70);
                }
                class105.field2185 = -1;
                return true;
            }
            if (class105.field2185 == 215) {
                for (int var71 = 0; var71 < class177.field3576; var71++) {
                    class73 var72 = class93.method653((byte) 123, var71);
                    if (var72 != null && var72.field1542 == 0) {
                        class107.field2223[var71] = 0;
                        class143.field2940[var71] = 0;
                    }
                }
                class161.method1009((byte) 71);
                class7.field158 += 32;
                class105.field2185 = -1;
                return true;
            }
            if (class105.field2185 == 250) {
                int var73 = class105.field2195.method390((byte) 98);
                int var74 = class105.field2195.method382(arg0 ^ 0xE8);
                class84 var75 = class138.method907(var74, false);
                if (var75 != null && var75.field1755 == 0) {
                    if (var73 > var75.field1777 - var75.field1815) {
                        var73 = var75.field1777 - var75.field1815;
                    }
                    if (var73 < 0) {
                        var73 = 0;
                    }
                    if (var75.field1747 != var73) {
                        var75.field1747 = var73;
                        class194.method1295((byte) -10, var75);
                    }
                }
                class105.field2185 = -1;
                return true;
            }
            if (class105.field2185 == 61) {
                int var76 = class105.field2195.method367(-114);
                int var77 = class105.field2195.method367(44);
                int var78 = class105.field2195.method376((byte) 113);
                int var79 = class105.field2195.method387((byte) 88);
                class84 var80 = class138.method907(var78, false);
                if (var80.field1742 != var77 || var80.field1739 != var76 || var80.field1802 != var79) {
                    var80.field1802 = var79;
                    var80.field1739 = var76;
                    var80.field1742 = var77;
                    class194.method1295((byte) -25, var80);
                }
                class105.field2185 = -1;
                return true;
            }
            if (class105.field2185 == 1) {
                int var81 = class105.field2195.method390((byte) 105);
                int var82 = class105.field2195.method344(arg0 + 99);
                if (var81 == 65535) {
                    var81 = -1;
                }
                int var83 = class105.field2195.method390((byte) 113);
                class175.method1184(-1, var81, var83, var82);
                class105.field2185 = -1;
                return true;
            }
            if (class105.field2185 == 225) {
                int var84 = class105.field2195.method376((byte) 113);
                int var85 = class105.field2195.method349((byte) 93);
                int var86 = var85 >> 10 & 0x1F;
                int var87 = var85 >> 5 & 0x1F;
                int var88 = var85 & 0x1F;
                int var89 = (var87 << 11) + ((var86 << 19) + (var88 << 3));
                class84 var90 = class138.method907(var84, false);
                if (var90.field1829 != var89) {
                    var90.field1829 = var89;
                    class194.method1295((byte) -125, var90);
                }
                class105.field2185 = -1;
                return true;
            }
            if (class105.field2185 == 157) {
                class170.field3457 = class105.field2195.method344(255);
                class107.field2219 = class105.field2195.method338((byte) 78);
                class105.field2185 = -1;
                return true;
            }
            if (class105.field2185 == 203) {
                int var91 = class105.field2195.method344(255);
                if (class105.field2195.method344(255) == 0) {
                    class71.field1499[var91] = new class60();
                } else {
                    class105.field2195.field1033--;
                    class71.field1499[var91] = new class60(class105.field2195);
                }
                class13.field241 = class62.field1325;
                class105.field2185 = -1;
                return true;
            }
            if (class105.field2185 == 7) {
                for (int var92 = 0; var92 < class143.field2940.length; var92++) {
                    if (class143.field2940[var92] != class107.field2223[var92]) {
                        class143.field2940[var92] = class107.field2223[var92];
                        class109.method744(-68, var92);
                        class7.field157[class133.method887(31, class7.field158++)] = var92;
                    }
                }
                class105.field2185 = -1;
                return true;
            }
            if (class105.field2185 == 130) {
                class161.method1009((byte) 71);
                int var93 = class105.field2195.method378(false);
                int var94 = class105.field2195.method383(78);
                int var95 = class105.field2195.method378(false);
                class11.field227[var93] = var94;
                class92.field2003[var93] = var95;
                class186.field3711[var93] = 1;
                for (int var96 = 0; var96 < 98; var96++) {
                    if (class26.field474[var96] <= var94) {
                        class186.field3711[var93] = var96 + 2;
                    }
                }
                class134.field2779[class133.method887(31, class193.field3801++)] = var93;
                class105.field2185 = -1;
                return true;
            }
            if (class105.field2185 == 208) {
                class107.field2219 = class105.field2195.method350(false);
                class170.field3457 = class105.field2195.method378(false);
                for (int var97 = class170.field3457; var97 < class170.field3457 + 8; var97++) {
                    for (int var98 = class107.field2219; var98 < class107.field2219 + 8; var98++) {
                        if (class69.field1434[class60.field1227][var97][var98] != null) {
                            class69.field1434[class60.field1227][var97][var98] = null;
                            class88.method616((byte) -17, var98, var97);
                        }
                    }
                }
                for (class64 var99 = (class64) class15.field266.method46(-115); var99 != null; var99 = (class64) class15.field266.method53(arg0 + 7759288)) {
                    if (class170.field3457 <= var99.field1356 && var99.field1356 < class170.field3457 + 8 && class107.field2219 <= var99.field1341 && var99.field1341 < class107.field2219 + 8 && class60.field1227 == var99.field1355) {
                        var99.field1352 = 0;
                    }
                }
                class105.field2185 = -1;
                return true;
            }
            if (class105.field2185 == 201) {
                int var100 = class105.field2195.method338((byte) 97);
                int var101 = class105.field2195.method378(false);
                int var102 = class105.field2195.method344(255);
                class60.field1227 = var101 >> 1;
                class56.field1136.method225(var100, var102, -41, ~(var101 & 0x1) == -2);
                class105.field2185 = -1;
                return true;
            }
            if (class105.field2185 == 79) {
                long var103 = class105.field2195.method379(false);
                class105.field2195.method353(78);
                long var105 = class105.field2195.method379(false);
                long var107 = (long) class105.field2195.method390((byte) 99);
                long var109 = (long) class105.field2195.method340(false);
                int var111 = class105.field2195.method344(255);
                long var112 = (var107 << 32) + var109;
                boolean var114 = false;
                for (int var115 = 0; var115 < 100; var115++) {
                    if (class195.field3850[var115] == var112) {
                        var114 = true;
                        break;
                    }
                }
                if (var111 <= 1) {
                    for (int var116 = 0; var116 < class26.field479; var116++) {
                        if (class130.field2713[var116] == var103) {
                            var114 = true;
                            break;
                        }
                    }
                }
                if (!var114 && class97.field2053 == 0) {
                    class195.field3850[class82.field1648] = var112;
                    class82.field1648 = (class82.field1648 + 1) % 100;
                    class163 var117 = class83.method580(class31.method210(false, class105.field2195).method1037((byte) -128));
                    if (var111 == 2 || var111 == 3) {
                        class129.method846(var117, class116.method802(var105, true).method1031(false), 9, -1, class180.method1216(new class163[] { class38.field793, class116.method802(var103, true).method1031(false) }, false));
                    } else if (var111 == 1) {
                        class129.method846(var117, class116.method802(var105, true).method1031(false), 9, -1, class180.method1216(new class163[] { class27.field509, class116.method802(var103, true).method1031(false) }, false));
                    } else {
                        class129.method846(var117, class116.method802(var105, true).method1031(false), 9, -1, class116.method802(var103, true).method1031(false));
                    }
                }
                class105.field2185 = -1;
                return true;
            }
            if (class105.field2185 == 188) {
                class161.method1009((byte) 71);
                class38.field791 = class105.field2195.method389(353);
                class14.field254 = class62.field1325;
                class105.field2185 = -1;
                return true;
            }
            if (class105.field2185 == 75) {
                class48.method288(true, (byte) 64);
                class105.field2185 = -1;
                return true;
            }
            if (class105.field2185 == 153) {
                int var118 = class105.field2195.method349((byte) 93);
                int var119 = class105.field2195.method387((byte) 88);
                int var120 = class105.field2195.method339((byte) -72);
                class84 var121 = class138.method907(var120, false);
                class105.field2185 = -1;
                var121.field1825 = (var119 << 16) + var118;
                return true;
            }
            if (class105.field2185 == 242) {
                class199.field3941 = true;
                class166.field3380 = class105.field2195.method344(255);
                class17.field296 = class105.field2195.method344(255);
                class199.field3939 = class105.field2195.method390((byte) 119);
                class65.field1372 = class105.field2195.method344(255);
                class117.field2482 = class105.field2195.method344(arg0 ^ 0x63);
                if (class117.field2482 >= 100) {
                    class86.field1882 = class166.field3380 * 128 + 64;
                    class90.field1939 = class17.field296 * 128 + 64;
                    class33.field644 = class175.method1186(class86.field1882, class60.field1227, class90.field1939, 1) - class199.field3939;
                }
                class105.field2185 = -1;
                return true;
            }
            if (class105.field2185 == 213) {
                class188.field3732 = class105.field2195.method387((byte) 88) * 30;
                class14.field254 = class62.field1325;
                class105.field2185 = -1;
                return true;
            }
            if (class105.field2185 == 166) {
                class20.method126(0);
                class105.field2185 = -1;
                return true;
            }
            if (class105.field2185 == 218) {
                class163 var122 = class105.field2195.method363(19047);
                Object[] var123 = new Object[var122.method1029(117) + 1];
                for (int var124 = var122.method1029(118) - 1; var124 >= 0; var124--) {
                    if (var122.method1032(var124, (byte) -5) == 115) {
                        var123[var124 + 1] = class105.field2195.method363(arg0 + 18891);
                    } else {
                        var123[var124 + 1] = Integer.valueOf(class105.field2195.method383(27));
                    }
                }
                var123[0] = Integer.valueOf(class105.field2195.method383(61));
                class118 var125 = new class118();
                var125.field2502 = var123;
                class64.method458((byte) -100, var125);
                class105.field2185 = -1;
                return true;
            }
            if (class105.field2185 == 162) {
                int var126 = class105.field2195.method376((byte) 113);
                int var127 = class105.field2195.method366(-2);
                class84 var128 = class138.method907(var126, false);
                if (var128.field1827 != var127 || var127 == -1) {
                    var128.field1827 = var127;
                    var128.field1715 = 0;
                    var128.field1785 = 0;
                    class194.method1295((byte) 105, var128);
                }
                class105.field2185 = -1;
                return true;
            }
            if (class105.field2185 == 104) {
                if (class62.field1314 != -1) {
                    class31.method208(0, class62.field1314, (byte) -117);
                }
                class105.field2185 = -1;
                return true;
            }
            if (class105.field2185 == 172) {
                int var129 = class105.field2195.method339((byte) 119);
                class84 var130 = class138.method907(var129, false);
                var130.field1816 = 3;
                var130.field1787 = class56.field1136.field795.method788(11);
                class194.method1295((byte) 105, var130);
                class105.field2185 = -1;
                return true;
            }
            if (class105.field2185 == 192) {
                for (int var131 = 0; var131 < class121.field2553.length; var131++) {
                    if (class121.field2553[var131] != null) {
                        class121.field2553[var131].field730 = -1;
                    }
                }
                for (int var132 = 0; var132 < class187.field3723.length; var132++) {
                    if (class187.field3723[var132] != null) {
                        class187.field3723[var132].field730 = -1;
                    }
                }
                class105.field2185 = -1;
                return true;
            }
            if (class105.field2185 == 13) {
                int var133 = class105.field2195.method338((byte) 97);
                class163 var134 = class105.field2195.method363(19047);
                int var135 = class105.field2195.method338((byte) 125);
                if (var135 >= 1 && var135 <= 8) {
                    if (var134.method1038(class87.field1902, arg0 - 156)) {
                        var134 = null;
                    }
                    class9.field180[var135 - 1] = var134;
                    class151.field3110[var135 - 1] = var133 == 0;
                }
                class105.field2185 = -1;
                return true;
            }
            if (class105.field2185 == 226) {
                class179.method1211(-19899);
                class105.field2185 = -1;
                return true;
            }
            if (class105.field2185 == 232) {
                int var136 = class105.field2195.method383(124);
                class87 var137 = (class87) class138.field2847.method465((long) var136, (byte) 72);
                if (var137 != null) {
                    class32.method211((byte) -99, true, var137);
                }
                if (class88.field1924 != null) {
                    class194.method1295((byte) 6, class88.field1924);
                    class88.field1924 = null;
                }
                class105.field2185 = -1;
                return true;
            }
            if (class105.field2185 == 186) {
                long var138 = class105.field2195.method379(false);
                long var140 = (long) class105.field2195.method390((byte) 122);
                long var142 = (long) class105.field2195.method340(false);
                int var144 = class105.field2195.method344(255);
                long var145 = (var140 << 32) + var142;
                boolean var147 = false;
                for (int var148 = 0; var148 < 100; var148++) {
                    if (class195.field3850[var148] == var145) {
                        var147 = true;
                        break;
                    }
                }
                if (var144 <= 1) {
                    for (int var149 = 0; var149 < class26.field479; var149++) {
                        if (class130.field2713[var149] == var138) {
                            var147 = true;
                            break;
                        }
                    }
                }
                if (!var147 && class97.field2053 == 0) {
                    class195.field3850[class82.field1648] = var145;
                    class82.field1648 = (class82.field1648 + 1) % 100;
                    class163 var150 = class83.method580(class31.method210(false, class105.field2195).method1037((byte) 102));
                    if (var144 == 2 || var144 == 3) {
                        class43.method267((byte) -94, var150, class180.method1216(new class163[] { class38.field793, class116.method802(var138, true).method1031(false) }, false), 7);
                    } else if (var144 == 1) {
                        class43.method267((byte) -123, var150, class180.method1216(new class163[] { class27.field509, class116.method802(var138, true).method1031(false) }, false), 7);
                    } else {
                        class43.method267((byte) -109, var150, class116.method802(var138, true).method1031(false), 3);
                    }
                }
                class105.field2185 = -1;
                return true;
            }
            if (class105.field2185 == 108) {
                class5.field106 = class105.field2195.method344(255);
                if (class5.field106 == 1) {
                    class21.field368 = class105.field2195.method390((byte) 117);
                }
                if (class5.field106 >= 2 && class5.field106 <= 6) {
                    if (class5.field106 == 2) {
                        class139.field2873 = 64;
                        class195.field3851 = 64;
                    }
                    if (class5.field106 == 3) {
                        class139.field2873 = 64;
                        class195.field3851 = 0;
                    }
                    if (class5.field106 == 4) {
                        class195.field3851 = 128;
                        class139.field2873 = 64;
                    }
                    if (class5.field106 == 5) {
                        class139.field2873 = 0;
                        class195.field3851 = 64;
                    }
                    if (class5.field106 == 6) {
                        class139.field2873 = 128;
                        class195.field3851 = 64;
                    }
                    class5.field106 = 2;
                    class108.field2249 = class105.field2195.method390((byte) 99);
                    class206.field4024 = class105.field2195.method390((byte) 114);
                    class93.field2014 = class105.field2195.method344(255);
                }
                if (class5.field106 == 10) {
                    class133.field2757 = class105.field2195.method390((byte) 104);
                }
                class105.field2185 = -1;
                return true;
            }
            if (class105.field2185 == 111) {
                int var151 = class105.field2195.method387((byte) 88);
                int var152 = class105.field2195.method383(33);
                class107.field2223[var151] = var152;
                if (class143.field2940[var151] != var152) {
                    class143.field2940[var151] = var152;
                    class109.method744(-106, var151);
                }
                class7.field157[class133.method887(class7.field158++, 31)] = var151;
                class105.field2185 = -1;
                return true;
            }
            if (class105.field2185 == 71) {
                int var153 = class105.field2195.method390((byte) 116);
                byte var154 = class105.field2195.method381((byte) 35);
                class107.field2223[var153] = var154;
                if (class143.field2940[var153] != var154) {
                    class143.field2940[var153] = var154;
                    class109.method744(-73, var153);
                }
                class7.field157[class133.method887(class7.field158++, 31)] = var153;
                class105.field2185 = -1;
                return true;
            }
            if (class105.field2185 == 117) {
                int var155 = class105.field2195.method339((byte) 121);
                class163 var156 = class105.field2195.method363(arg0 + 18891);
                class84 var157 = class138.method907(var155, false);
                if (!var156.method1043(90, var157.field1753)) {
                    var157.field1753 = var156;
                    class194.method1295((byte) -126, var157);
                }
                class105.field2185 = -1;
                return true;
            }
            if (class105.field2185 == 77) {
                class124.field2598 = class62.field1325;
                long var158 = class105.field2195.method379(false);
                if (var158 == 0L) {
                    class105.field2185 = -1;
                    class75.field1563 = 0;
                    class176.field3540 = null;
                    class65.field1387 = null;
                    class113.field2387 = null;
                    return true;
                }
                long var160 = class105.field2195.method379(false);
                class65.field1387 = class116.method802(var160, true);
                class113.field2387 = class116.method802(var158, true);
                class155.field3214 = class105.field2195.method353(arg0 - 116);
                int var162 = class105.field2195.method344(255);
                if (var162 == 255) {
                    class105.field2185 = -1;
                    return true;
                }
                class206[] var163 = new class206[100];
                class75.field1563 = var162;
                for (int var164 = 0; var164 < class75.field1563; var164++) {
                    var163[var164] = new class206();
                    var163[var164].field1950 = class105.field2195.method379(false);
                    var163[var164].field4027 = class116.method802(var163[var164].field1950, true);
                    var163[var164].field4034 = class105.field2195.method390((byte) 89);
                    var163[var164].field4029 = class105.field2195.method353(-105);
                    if (class97.field2081 == var163[var164].field1950) {
                        class205.field4006 = var163[var164].field4029;
                    }
                }
                boolean var165 = false;
                int var166 = class75.field1563;
                while (var166 > 0) {
                    var166--;
                    boolean var167 = true;
                    for (int var168 = 0; var168 < var166; var168++) {
                        if (var163[var168].field4027.method1055(var163[var168 + 1].field4027, 108) > 0) {
                            var167 = false;
                            class206 var169 = var163[var168];
                            var163[var168] = var163[var168 + 1];
                            var163[var168 + 1] = var169;
                        }
                    }
                    if (var167) {
                        break;
                    }
                }
                class176.field3540 = var163;
                class105.field2185 = -1;
                return true;
            }
            if (class105.field2185 == 86) {
                int var170 = class105.field2195.field1033 + class74.field1554;
                int var171 = class105.field2195.method390((byte) 107);
                int var172 = class105.field2195.method390((byte) 100);
                if (class62.field1314 != var171) {
                    class62.field1314 = var171;
                    class120.method820(class62.field1314, true);
                    class41.method257(class62.field1314, (byte) 27);
                    for (int var173 = 0; var173 < 100; var173++) {
                        class181.field3631[var173] = true;
                    }
                }
                while (var172-- > 0) {
                    int var174 = class105.field2195.method383(97);
                    int var175 = class105.field2195.method390((byte) 92);
                    int var176 = class105.field2195.method344(255);
                    class87 var177 = (class87) class138.field2847.method465((long) var174, (byte) -25);
                    if (var177 != null && var177.field1903 != var175) {
                        class32.method211((byte) -118, true, var177);
                        var177 = null;
                    }
                    if (var177 == null) {
                        var177 = class43.method263(0, var174, var176, var175);
                    }
                    var177.field1892 = true;
                }
                for (class87 var178 = (class87) class138.field2847.method468(1); var178 != null; var178 = (class87) class138.field2847.method471(-4984)) {
                    if (var178.field1892) {
                        var178.field1892 = false;
                    } else {
                        class32.method211((byte) -83, true, var178);
                    }
                }
                class7.field141 = new class65(512);
                while (var170 > class105.field2195.field1033) {
                    int var179 = class105.field2195.method383(arg0 ^ 0xCD);
                    int var180 = class105.field2195.method390((byte) 104);
                    int var181 = class105.field2195.method390((byte) 117);
                    int var182 = class105.field2195.method383(arg0 - 52);
                    for (int var183 = var180; var183 <= var181; var183++) {
                        long var184 = ((long) var179 << 32) + (long) var183;
                        class7.field141.method462(-56, new class17(var182), var184);
                    }
                }
                class105.field2185 = -1;
                return true;
            }
            if (class105.field2185 == 196) {
                int var186 = class105.field2195.method383(113);
                boolean var187 = class105.field2195.method378(false) == 1;
                class84 var188 = class138.method907(var186, false);
                if (var187 != var188.field1780) {
                    var188.field1780 = var187;
                    class194.method1295((byte) 118, var188);
                }
                class105.field2185 = -1;
                return true;
            }
            if (class105.field2185 == 124) {
                class113.field2392 = 0;
                class105.field2185 = -1;
                return true;
            }
            if (class105.field2185 == 219) {
                class39.method245((byte) 109);
                class105.field2185 = -1;
                return false;
            }
            if (class105.field2185 == 87) {
                class199.field3941 = true;
                class202.field3992 = class105.field2195.method344(arg0 + 99);
                class181.field3637 = class105.field2195.method344(255);
                class44.field888 = class105.field2195.method390((byte) 115);
                class136.field2797 = class105.field2195.method344(arg0 + 99);
                class44.field896 = class105.field2195.method344(255);
                if (class44.field896 >= 100) {
                    int var189 = class181.field3637 * 128 + 64;
                    int var190 = class202.field3992 * 128 + 64;
                    int var191 = class175.method1186(var190, class60.field1227, var189, 1) - class44.field888;
                    int var192 = var191 - class33.field644;
                    int var193 = var190 - class86.field1882;
                    int var194 = var189 - class90.field1939;
                    int var195 = (int) Math.sqrt((double) (var193 * var193 + var194 * var194));
                    class44.field894 = (int) (Math.atan2((double) var192, (double) var195) * 325.949D) & 0x7FF;
                    class64.field1354 = (int) (-325.949D * Math.atan2((double) var193, (double) var194)) & 0x7FF;
                    if (class44.field894 < 128) {
                        class44.field894 = 128;
                    }
                    if (class44.field894 > 383) {
                        class44.field894 = 383;
                    }
                }
                class105.field2185 = -1;
                return true;
            }
            if (class105.field2185 == arg0) {
                long var196 = class105.field2195.method379(false);
                int var198 = class105.field2195.method390((byte) 102);
                boolean var199 = false;
                byte var200 = class105.field2195.method353(-118);
                if ((Long.MIN_VALUE & var196) != 0L) {
                    var199 = true;
                }
                if (var199) {
                    if (class75.field1563 == 0) {
                        class105.field2185 = -1;
                        return true;
                    }
                    long var201 = var196 & Long.MAX_VALUE;
                    boolean var203 = false;
                    int var204;
                    for (var204 = 0; class75.field1563 > var204 && (class176.field3540[var204].field1950 != var201 || class176.field3540[var204].field4034 != var198); var204++) {
                    }
                    if (class75.field1563 > var204) {
                        while (var204 < class75.field1563 - 1) {
                            class176.field3540[var204] = class176.field3540[var204 + 1];
                            var204++;
                        }
                        class75.field1563--;
                        class176.field3540[class75.field1563] = null;
                    }
                } else {
                    class206 var205 = new class206();
                    var205.field1950 = var196;
                    var205.field4027 = class116.method802(var205.field1950, true);
                    var205.field4029 = var200;
                    var205.field4034 = var198;
                    int var206;
                    for (var206 = class75.field1563 - 1; var206 >= 0; var206--) {
                        int var207 = class176.field3540[var206].field4027.method1055(var205.field4027, 116);
                        if (var207 == 0) {
                            class176.field3540[var206].field4034 = var198;
                            class176.field3540[var206].field4029 = var200;
                            class105.field2185 = -1;
                            if (class97.field2081 == var196) {
                                class205.field4006 = var200;
                            }
                            class124.field2598 = class62.field1325;
                            return true;
                        }
                        if (var207 < 0) {
                            break;
                        }
                    }
                    if (class75.field1563 >= class176.field3540.length) {
                        class105.field2185 = -1;
                        return true;
                    }
                    for (int var208 = class75.field1563 - 1; var208 > var206; var208--) {
                        class176.field3540[var208 + 1] = class176.field3540[var208];
                    }
                    if (class75.field1563 == 0) {
                        class176.field3540 = new class206[100];
                    }
                    class176.field3540[var206 + 1] = var205;
                    if (class97.field2081 == var196) {
                        class205.field4006 = var200;
                    }
                    class75.field1563++;
                }
                class105.field2185 = -1;
                class124.field2598 = class62.field1325;
                return true;
            }
            if (class105.field2185 == 129) {
                class19.field321 = class105.field2195.method344(arg0 ^ 0x63);
                class105.field2185 = -1;
                return true;
            }
            if (class105.field2185 == 116) {
                int var209 = class105.field2195.method390((byte) 115);
                if (var209 == 65535) {
                    var209 = -1;
                }
                int var210 = class105.field2195.method339((byte) 114);
                int var211 = class105.field2195.method382(-86);
                int var212 = class105.field2195.method367(97);
                if (var212 == 65535) {
                    var212 = -1;
                }
                for (int var213 = var212; var213 <= var209; var213++) {
                    long var214 = ((long) var210 << 32) + ((long) var213);
                    class90 var216 = class7.field141.method465(var214, (byte) 114);
                    if (var216 != null) {
                        var216.method630(arg0 ^ 0x90);
                    }
                    class7.field141.method462(arg0 ^ 0xED, new class17(var211), var214);
                }
                class105.field2185 = -1;
                return true;
            }
            if (class105.field2185 == 42) {
                class124.method833(class10.field197, class74.field1554, 0, class105.field2195);
                class105.field2185 = -1;
                return true;
            }
            if (class105.field2185 == 243) {
                int var217 = class105.field2195.method367(arg0 ^ 0xDF);
                class62.field1314 = var217;
                class120.method820(var217, true);
                class41.method257(class62.field1314, (byte) 27);
                for (int var218 = 0; var218 < 100; var218++) {
                    class181.field3631[var218] = true;
                }
                class105.field2185 = -1;
                return true;
            }
            if (class105.field2185 == 78) {
                int var219 = class105.field2195.method339((byte) 0);
                class84 var220 = class138.method907(var219, false);
                for (int var221 = 0; var221 < var220.field1750.length; var221++) {
                    var220.field1750[var221] = -1;
                    var220.field1750[var221] = 0;
                }
                class194.method1295((byte) 19, var220);
                class105.field2185 = -1;
                return true;
            }
            if (class105.field2185 == 84) {
                int var222 = class105.field2195.method383(78);
                int var223 = class105.field2195.method390((byte) 117);
                if (var222 < -70000) {
                    var223 += 32768;
                }
                class84 var224;
                if (var222 >= 0) {
                    var224 = class138.method907(var222, false);
                } else {
                    var224 = null;
                }
                while (class105.field2195.field1033 < class74.field1554) {
                    int var225 = class105.field2195.method354((byte) -117);
                    int var226 = 0;
                    int var227 = class105.field2195.method390((byte) 91);
                    if (var227 != 0) {
                        var226 = class105.field2195.method344(arg0 ^ 0x63);
                        if (var226 == 255) {
                            var226 = class105.field2195.method383(arg0 ^ 0xA7);
                        }
                    }
                    if (var224 != null && var225 >= 0 && var224.field1750.length > var225) {
                        var224.field1750[var225] = var227;
                        var224.field1766[var225] = var226;
                    }
                    class103.method706(var223, var225, 223, var227 - 1, var226);
                }
                if (var224 != null) {
                    class194.method1295((byte) 19, var224);
                }
                class161.method1009((byte) 71);
                class120.field2530[class133.method887(class99.field2089++, 31)] = class133.method887(32767, var223);
                class105.field2185 = -1;
                return true;
            }
            if (class105.field2185 == 50) {
                class26.field479 = class74.field1554 / 8;
                for (int var228 = 0; var228 < class26.field479; var228++) {
                    class130.field2713[var228] = class105.field2195.method379(false);
                    class55.field1118[var228] = class116.method802(class130.field2713[var228], true);
                }
                class105.field2185 = -1;
                class109.field2286 = class62.field1325;
                return true;
            }
            if (class105.field2185 == 20) {
                int var229 = class105.field2195.method390((byte) 120);
                class43.method264(var229, (byte) 53);
                class120.field2530[class133.method887(31, class99.field2089++)] = class133.method887(var229, 32767);
                class105.field2185 = -1;
                return true;
            }
            if (class105.field2185 == 121 || class105.field2185 == 198 || class105.field2185 == 212 || class105.field2185 == 27 || class105.field2185 == 179 || class105.field2185 == 83 || class105.field2185 == 109 || class105.field2185 == 248 || class105.field2185 == 127 || class105.field2185 == 53 || class105.field2185 == 107) {
                class120.method817(1);
                class105.field2185 = -1;
                return true;
            }
            if (class105.field2185 == 112) {
                int var230 = class105.field2195.method371(arg0 - 156);
                int var231 = class105.field2195.method371(0);
                int var232 = class105.field2195.method339((byte) 117);
                class84 var233 = class138.method907(var232, false);
                int var234 = var233.field1839 + var230;
                int var235 = var233.field1784 + var231;
                if (var233.field1725 != var235 || var233.field1744 != var234) {
                    var233.field1725 = var235;
                    var233.field1744 = var234;
                    class194.method1295((byte) -123, var233);
                }
                class105.field2185 = -1;
                return true;
            }
            if (class105.field2185 == 34) {
                class6.field132 = class105.field2195.method344(255);
                class105.field2185 = -1;
                class109.field2286 = class62.field1325;
                return true;
            }
            if (class105.field2185 == 25) {
                class131.method866(24, class105.field2195);
                class105.field2185 = -1;
                return true;
            }
            if (class105.field2185 == 35) {
                class107.field2219 = class105.field2195.method338((byte) 106);
                class170.field3457 = class105.field2195.method344(255);
                while (class74.field1554 > class105.field2195.field1033) {
                    class105.field2185 = class105.field2195.method344(255);
                    class120.method817(arg0 ^ 0x9D);
                }
                class105.field2185 = -1;
                return true;
            }
            if (class105.field2185 == 82) {
                class48.method288(false, (byte) 62);
                class105.field2185 = -1;
                return true;
            }
            if (class105.field2185 == 110) {
                class199.field3941 = false;
                for (int var236 = 0; var236 < 5; var236++) {
                    class25.field451[var236] = false;
                }
                class105.field2185 = -1;
                return true;
            }
            if (class105.field2185 == 11) {
                long var237 = class105.field2195.method379(false);
                class163 var239 = class83.method580(class31.method210(false, class105.field2195).method1037((byte) -121));
                class43.method267((byte) -76, var239, class116.method802(var237, true).method1031(false), 6);
                class105.field2185 = -1;
                return true;
            }
            if (class105.field2185 == 23) {
                int var240 = class105.field2195.method390((byte) 106);
                if (var240 == 65535) {
                    var240 = -1;
                }
                class59.method424(75, var240);
                class105.field2185 = -1;
                return true;
            }
            if (class105.field2185 == 91) {
                int var241 = class105.field2195.method358(-77);
                int var242 = class105.field2195.method390((byte) 122);
                if (var242 == 65535) {
                    var242 = -1;
                }
                class107.method726(var241, var242, 30706);
                class105.field2185 = -1;
                return true;
            }
            if (class105.field2185 == 62) {
                int var243 = class105.field2195.method383(67);
                int var244 = class105.field2195.method390((byte) 122);
                if (var243 < -70000) {
                    var244 += 32768;
                }
                class84 var245;
                if (var243 < 0) {
                    var245 = null;
                } else {
                    var245 = class138.method907(var243, false);
                }
                if (var245 != null) {
                    for (int var246 = 0; var246 < var245.field1750.length; var246++) {
                        var245.field1750[var246] = 0;
                        var245.field1766[var246] = 0;
                    }
                }
                class146.method946(var244, (byte) -126);
                int var247 = class105.field2195.method390((byte) 127);
                for (int var248 = 0; var248 < var247; var248++) {
                    int var249 = class105.field2195.method390((byte) 111);
                    int var250 = class105.field2195.method350(false);
                    if (var250 == 255) {
                        var250 = class105.field2195.method376((byte) 113);
                    }
                    if (var245 != null && var248 < var245.field1750.length) {
                        var245.field1750[var248] = var249;
                        var245.field1766[var248] = var250;
                    }
                    class103.method706(var244, var248, 223, var249 - 1, var250);
                }
                if (var245 != null) {
                    class194.method1295((byte) -127, var245);
                }
                class161.method1009((byte) 71);
                class120.field2530[class133.method887(class99.field2089++, 31)] = class133.method887(var244, 32767);
                class105.field2185 = -1;
                return true;
            }
            if (class105.field2185 == 29) {
                int var251 = class105.field2195.method382(94);
                int var252 = class105.field2195.method349((byte) 93);
                if (var252 == 65535) {
                    var252 = -1;
                }
                class84 var253 = class138.method907(var251, false);
                if (var253.field1816 != 2 || var253.field1787 != var252) {
                    var253.field1816 = 2;
                    var253.field1787 = var252;
                    class194.method1295((byte) -120, var253);
                }
                class105.field2185 = -1;
                return true;
            }
            class152.method980(null, "T1 - " + class105.field2185 + "," + field2101 + "," + class166.field3382 + " - " + class74.field1554, true);
            class39.method245((byte) 101);
        } catch (IOException var257) {
            class117.method807(-1);
        } catch (Exception var258) {
            String var255 = "T2 - " + class105.field2185 + "," + field2101 + "," + class166.field3382 + " - " + class74.field1554 + "," + (class56.field1136.field692[0] + class172.field3493) + "," + (class56.field1136.field718[0] + class69.field1470) + " - ";
            for (int var256 = 0; class74.field1554 > var256 && var256 < 50; var256++) {
                var255 = var255 + class105.field2195.field1054[var256] + ",";
            }
            class152.method980(var258, var255, true);
            class39.method245((byte) 121);
        }
        return true;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIIIIIILs;IZJ)Z")
    public static final boolean method683(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class166 arg8, int arg9, boolean arg10, long arg11) {
        for (int var13 = arg1; var13 < arg1 + arg3; var13++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                if (var13 < 0 || var20 < 0 || var13 >= class80.field1620 || var20 >= class92.field2007) {
                    return false;
                }
                class111 var21 = class97.field2054[arg0][var13][var20];
                if (var21 != null && var21.field2359 >= 5) {
                    return false;
                }
            }
        }
        class121 var14 = new class121();
        var14.field2536 = arg11;
        var14.field2550 = arg0;
        var14.field2537 = arg5;
        var14.field2534 = arg6;
        var14.field2543 = arg7;
        var14.field2546 = arg8;
        var14.field2549 = arg9;
        var14.field2544 = arg1;
        var14.field2542 = arg2;
        var14.field2548 = arg1 + arg3 - 1;
        var14.field2535 = arg2 + arg4 - 1;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var16 = arg2; var16 < arg2 + arg4; var16++) {
                int var17 = 0;
                if (var15 > arg1) {
                    var17++;
                }
                if (var15 < arg1 + arg3 - 1) {
                    var17 += 4;
                }
                if (var16 > arg2) {
                    var17 += 8;
                }
                if (var16 < arg2 + arg4 - 1) {
                    var17 += 2;
                }
                for (int var18 = arg0; var18 >= 0; var18--) {
                    if (class97.field2054[var18][var15][var16] == null) {
                        class97.field2054[var18][var15][var16] = new class111(var18, var15, var16);
                    }
                }
                class111 var19 = class97.field2054[arg0][var15][var16];
                var19.field2344[var19.field2359] = var14;
                var19.field2358[var19.field2359] = var17;
                var19.field2351 |= var17;
                var19.field2359++;
            }
        }
        if (arg10) {
            class21.field375[class150.field3102++] = var14;
        }
        return true;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z)V")
    public static void method684(boolean arg0) {
        field2103 = null;
        field2104 = null;
        if (arg0) {
            field2095 = null;
            field2099 = null;
            field2100 = null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILde;)V")
    public static final void method685(int arg0, class36 arg1) {
        arg1.field699 = 0;
        field2102++;
        if (arg1.field687 == 0) {
            arg1.field737 = 1024;
        }
        if (arg1.field687 == 1) {
            arg1.field737 = 1536;
        }
        int var2 = arg1.field673 - class51.field1023;
        if (arg1.field687 == 2) {
            arg1.field737 = 0;
        }
        if (arg1.field687 == 3) {
            arg1.field737 = 512;
        }
        int var3 = arg1.field714 * 128 + arg1.field684 * 64;
        arg1.field716 += (var3 - arg1.field716) / var2;
        int var4 = arg1.field684 * 64 + arg1.field675 * arg0;
        arg1.field679 += (var4 - arg1.field679) / var2;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILfa;)V")
    public final void method686(int arg0, class52 arg1) {
        if (arg0 <= 65) {
            method688(null, (byte) -95, null);
        }
        field2105++;
        while (true) {
            int var3 = arg1.method344(255);
            if (var3 == 0) {
                return;
            }
            this.method687(-2, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILfa;I)V")
    private final void method687(int arg0, class52 arg1, int arg2) {
        field2094++;
        if (~arg2 == arg0) {
            this.field2098 = arg1.method390((byte) 100);
            this.field2108 = arg1.method344(255);
            this.field2107 = arg1.method344(255);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "([Lrf;B[S)V")
    public static final void method688(class163[] arg0, byte arg1, short[] arg2) {
        class13.method95(arg0.length - 1, 0, arg0, arg2, 1);
        field2097++;
        if (arg1 < 48) {
            method688(null, (byte) -18, null);
        }
    }
}
