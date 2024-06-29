import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class135 extends class166 {

    @OriginalMember(owner = "client!pa", name = "r", descriptor = "I")
    public static int field2796 = 7759444;

    @OriginalMember(owner = "client!pa", name = "w", descriptor = "Lcd;")
    public static class23 field2801 = class54.method414("gelb:", -1);

    @OriginalMember(owner = "client!pa", name = "q", descriptor = "[I")
    private static int[] field2795 = new int[32];

    @OriginalMember(owner = "client!pa", name = "x", descriptor = "Lcd;")
    public static class23 field2802 = class54.method414("Lade Wordpack )2 ", -1);

    @OriginalMember(owner = "client!pa", name = "u", descriptor = "Lcf;")
    public static class25 field2799 = new class25();

    @OriginalMember(owner = "client!pa", name = "F", descriptor = "Lcd;")
    public static class23 field2810 = class54.method414("Ein kostenloses Spielkonto erstellen)3", -1);

    @OriginalMember(owner = "client!pa", name = "s", descriptor = "B")
    public byte field2797;

    @OriginalMember(owner = "client!pa", name = "y", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!pa", name = "z", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!pa", name = "A", descriptor = "I")
    public int field2805;

    @OriginalMember(owner = "client!pa", name = "B", descriptor = "I")
    public static int field2806;

    @OriginalMember(owner = "client!pa", name = "C", descriptor = "I")
    public static int field2807;

    @OriginalMember(owner = "client!pa", name = "D", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!pa", name = "E", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!pa", name = "v", descriptor = "Lcd;")
    public class23 field2800;

    @OriginalMember(owner = "client!pa", name = "t", descriptor = "Lfe;")
    public static class51 field2798;

    @OriginalMember(owner = "client!pa", name = "p", descriptor = "[I")
    public static int[] field2794;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(I)V")
    public static final void method860(int arg0) {
        field2808++;
        class36.field741.method997(false);
        class111.field2348.method997(false);
        if (arg0 != -1) {
            method863((byte) -53);
        }
        class43.field909.method997(false);
    }

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "(I)Z")
    public static final boolean method861(int arg0) {
        field2806++;
        if (class109.field2310 == null) {
            return false;
        }
        try {
            int var1 = class109.field2310.method500((byte) -109);
            if (var1 == 0) {
                return false;
            }
            if (class58.field1359 == -1) {
                var1--;
                class109.field2310.method499(0, 1, true, class81.field1769.field3753);
                class81.field1769.field3752 = 0;
                class58.field1359 = class81.field1769.method628(7);
                class199.field3900 = class102.field2177[class58.field1359];
            }
            if (class199.field3900 == -1) {
                if (var1 <= 0) {
                    return false;
                }
                var1--;
                class109.field2310.method499(0, 1, true, class81.field1769.field3753);
                class199.field3900 = class81.field1769.field3753[0] & 0xFF;
            }
            if (class199.field3900 == -2) {
                if (var1 <= 1) {
                    return false;
                }
                class109.field2310.method499(0, 2, true, class81.field1769.field3753);
                var1 -= 2;
                class81.field1769.field3752 = 0;
                class199.field3900 = class81.field1769.method1197(-1);
            }
            if (class199.field3900 > var1) {
                return false;
            }
            class81.field1769.field3752 = 0;
            class109.field2310.method499(0, class199.field3900, true, class81.field1769.field3753);
            class180.field3559 = class81.field1773;
            class81.field1773 = class107.field2286;
            class107.field2286 = class58.field1359;
            class200.field3964 = 0;
            if (class58.field1359 == 235) {
                int var2 = class81.field1769.method1230(9287);
                int var3 = class81.field1769.method1200(-128);
                class47 var4 = class113.method725((byte) 119, var2);
                if (var4 != null && var4.field1127 == 0) {
                    if (var4.field1107 - var4.field1123 < var3) {
                        var3 = var4.field1107 - var4.field1123;
                    }
                    if (var3 < 0) {
                        var3 = 0;
                    }
                    if (var4.field1065 != var3) {
                        var4.field1065 = var3;
                        class3.method12(var4, false);
                    }
                }
                class58.field1359 = -1;
                return true;
            }
            if (class58.field1359 == 246) {
                int var5 = class81.field1769.method1176(3);
                boolean var6 = class81.field1769.method1201(false) == 1;
                class47 var7 = class113.method725((byte) 112, var5);
                if (var7.field1143 != var6) {
                    var7.field1143 = var6;
                    class3.method12(var7, false);
                }
                class58.field1359 = -1;
                return true;
            }
            if (class58.field1359 == 125) {
                class111.method717(126);
                class25.field539 = class81.field1769.method1196(false);
                class58.field1359 = -1;
                class151.field3022 = class13.field296;
                return true;
            }
            if (class58.field1359 == 151) {
                class115.method731(2);
                class58.field1359 = -1;
                return true;
            }
            if (class58.field1359 == 160) {
                class9.field183 = class81.field1769.method1202(-124);
                class174.field3470 = class81.field1769.method1202(-110);
                for (int var8 = class174.field3470; var8 < class174.field3470 + 8; var8++) {
                    for (int var9 = class9.field183; var9 < class9.field183 + 8; var9++) {
                        if (class150.field3006[class59.field1385][var8][var9] != null) {
                            class150.field3006[class59.field1385][var8][var9] = null;
                            class168.method1029(var9, var8, -1);
                        }
                    }
                }
                for (class153 var10 = (class153) class178.field3534.method188((byte) 54); var10 != null; var10 = (class153) class178.field3534.method185((byte) -102)) {
                    if (var10.field3053 >= class174.field3470 && class174.field3470 + 8 > var10.field3053 && class9.field183 <= var10.field3059 && class9.field183 + 8 > var10.field3059 && class59.field1385 == var10.field3062) {
                        var10.field3054 = 0;
                    }
                }
                class58.field1359 = -1;
                return true;
            }
            if (class58.field1359 == 28) {
                int var11 = class81.field1769.method1197(-1);
                if (var11 == 65535) {
                    var11 = -1;
                }
                class75.method534(var11, (byte) 107);
                class58.field1359 = -1;
                return true;
            }
            if (class58.field1359 == 78) {
                int var12 = class81.field1769.method1200(-111);
                int var13 = class81.field1769.method1224((byte) -63);
                if (var12 == 65535) {
                    var12 = -1;
                }
                class170.method1039(-67, var13, var12);
                class58.field1359 = -1;
                return true;
            }
            if (class58.field1359 == 254) {
                int var14 = class81.field1769.method1201(false);
                int var15 = class81.field1769.method1201(false);
                class23 var16 = class81.field1769.method1193((byte) -70);
                if (var15 >= 1 && var15 <= 8) {
                    if (var16.method146(127, class201.field3975)) {
                        var16 = null;
                    }
                    class109.field2320[var15 - 1] = var16;
                    class98.field2095[var15 - 1] = var14 == 0;
                }
                class58.field1359 = -1;
                return true;
            }
            if (class58.field1359 == 170) {
                class157.field3145 = class199.field3900 / 8;
                for (int var17 = 0; var17 < class157.field3145; var17++) {
                    class189.field3758[var17] = class81.field1769.method1217(832087072);
                    class131.field2717[var17] = class39.method326(class189.field3758[var17], -39);
                }
                class58.field1359 = -1;
                class1.field7 = class13.field296;
                return true;
            }
            if (class58.field1359 == 141) {
                long var18 = class81.field1769.method1217(832087072);
                int var20 = class81.field1769.method1197(-1);
                int var21 = class81.field1769.method1202(-43);
                class23 var22 = class39.method326(var18, -86).method164(-12065);
                for (int var23 = 0; var23 < class82.field1780; var23++) {
                    if (class17.field364[var23] == var18) {
                        if (class74.field1680[var23] != var20) {
                            class74.field1680[var23] = var20;
                            if (var20 > 0) {
                                class107.method701(10945, class66.field1566, 5, class3.method14(true, new class23[] { var22, class120.field2500 }));
                            }
                            if (var20 == 0) {
                                class107.method701(10945, class66.field1566, 5, class3.method14(true, new class23[] { var22, class103.field2193 }));
                            }
                        }
                        class65.field1544[var23] = var21;
                        var22 = null;
                        break;
                    }
                }
                if (var22 != null && class82.field1780 < 200) {
                    class17.field364[class82.field1780] = var18;
                    class5.field95[class82.field1780] = var22;
                    class74.field1680[class82.field1780] = var20;
                    class65.field1544[class82.field1780] = var21;
                    class82.field1780++;
                }
                class1.field7 = class13.field296;
                boolean var24 = false;
                int var25 = class82.field1780;
                while (var25 > 0) {
                    boolean var26 = true;
                    var25--;
                    for (int var27 = 0; var27 < var25; var27++) {
                        if (class74.field1680[var27] != class13.field295 && class74.field1680[var27 + 1] == class13.field295 || class74.field1680[var27] == 0 && class74.field1680[var27 + 1] != 0) {
                            var26 = false;
                            int var28 = class74.field1680[var27];
                            class74.field1680[var27] = class74.field1680[var27 + 1];
                            class74.field1680[var27 + 1] = var28;
                            class23 var29 = class5.field95[var27];
                            class5.field95[var27] = class5.field95[var27 + 1];
                            class5.field95[var27 + 1] = var29;
                            long var30 = class17.field364[var27];
                            class17.field364[var27] = class17.field364[var27 + 1];
                            class17.field364[var27 + 1] = var30;
                            int var32 = class65.field1544[var27];
                            class65.field1544[var27] = class65.field1544[var27 + 1];
                            class65.field1544[var27 + 1] = var32;
                        }
                    }
                    if (var26) {
                        break;
                    }
                }
                class58.field1359 = -1;
                return true;
            }
            if (class58.field1359 == 52) {
                class181.field3575 = true;
                class189.field3723 = class81.field1769.method1202(-66);
                class154.field3082 = class81.field1769.method1202(111);
                class134.field2776 = class81.field1769.method1197(-1);
                class80.field1736 = class81.field1769.method1202(119);
                class132.field2732 = class81.field1769.method1202(107);
                if (class132.field2732 >= 100) {
                    class115.field2404 = class154.field3082 * 128 + 64;
                    class119.field2452 = class189.field3723 * 128 + 64;
                    class122.field2530 = class203.method1330((byte) -88, class115.field2404, class119.field2452, class59.field1385) - class134.field2776;
                }
                class58.field1359 = -1;
                return true;
            }
            if (class58.field1359 == 176) {
                int var33 = class81.field1769.method1202(-32);
                if (class81.field1769.method1202(-24) == 0) {
                    class199.field3909[var33] = new class42();
                } else {
                    class81.field1769.field3752--;
                    class199.field3909[var33] = new class42(class81.field1769);
                }
                class134.field2783 = class13.field296;
                class58.field1359 = -1;
                return true;
            }
            if (class58.field1359 == 51) {
                class111.method717(-128);
                class72.field1657 = class81.field1769.method1202(-82);
                class58.field1359 = -1;
                class151.field3022 = class13.field296;
                return true;
            }
            if (class58.field1359 == 233) {
                int var34 = class81.field1769.method1216((byte) 121);
                int var35 = class81.field1769.method1202(-95);
                int var36 = class81.field1769.method1176(3);
                class115 var37 = (class115) class31.field665.method260((long) var36, (byte) 28);
                if (var37 != null) {
                    class51.method400(var37, 119, var37.field2408 != var34);
                }
                class110.method713(var34, var36, var35, -124);
                class58.field1359 = -1;
                return true;
            }
            if (class58.field1359 == 239) {
                class1.method6(true, (byte) -2);
                class58.field1359 = -1;
                return true;
            }
            if (class58.field1359 == 80) {
                int var38 = class81.field1769.method1176(3);
                class67.field1579 = class60.field1398.method877(3, var38);
                class58.field1359 = -1;
                return true;
            }
            if (class58.field1359 == 163) {
                int var39 = class81.field1769.method1187(-125);
                int var40 = class81.field1769.method1230(9287);
                class47 var41 = class113.method725((byte) 99, var40);
                if (var41.field1095 != var39 || var39 == -1) {
                    var41.field1095 = var39;
                    var41.field1146 = 0;
                    var41.field1082 = 0;
                    class3.method12(var41, false);
                }
                class58.field1359 = -1;
                return true;
            }
            if (class58.field1359 == 219) {
                int var42 = class81.field1769.method1202(-15);
                int var43 = class81.field1769.method1201(false);
                int var44 = class81.field1769.method1201(false);
                class59.field1385 = var43 >> 1;
                class134.field2790.method70(var42, (byte) 125, (var43 & 0x1) == 1, var44);
                class58.field1359 = -1;
                return true;
            }
            if (class58.field1359 == 251) {
                class181.field3575 = false;
                for (int var45 = 0; var45 < 5; var45++) {
                    class203.field4006[var45] = false;
                }
                class58.field1359 = -1;
                return true;
            }
            if (class58.field1359 == 30) {
                int var46 = class81.field1769.method1195(407657744);
                class47 var47 = class113.method725((byte) 124, var46);
                var47.field1135 = 3;
                var47.field1032 = class134.field2790.field1328.method1009(5818);
                class3.method12(var47, false);
                class58.field1359 = -1;
                return true;
            }
            if (class58.field1359 == 216) {
                int var48 = class81.field1769.method1202(-89);
                int var49 = class81.field1769.method1202(-29);
                int var50 = class81.field1769.method1202(-84);
                int var51 = class81.field1769.method1202(125);
                class203.field4006[var48] = true;
                class78.field1722[var48] = var49;
                class63.field1496[var48] = var50;
                class44.field925[var48] = var51;
                class132.field2724[var48] = 0;
                class58.field1359 = -1;
                return true;
            }
            if (class58.field1359 == 188) {
                int var52 = class81.field1769.method1195(407657744);
                int var53 = class81.field1769.method1184(-25);
                int var54 = class81.field1769.method1216((byte) 88);
                int var55 = class81.field1769.method1184(-25);
                class47 var56 = class113.method725((byte) 121, var52);
                if (var56.field1073 != var54 || var56.field1048 != var53 || var56.field1040 != var55) {
                    var56.field1073 = var54;
                    var56.field1048 = var53;
                    var56.field1040 = var55;
                    class3.method12(var56, false);
                }
                class58.field1359 = -1;
                return true;
            }
            if (class58.field1359 == 165) {
                long var57 = class81.field1769.method1217(832087072);
                class23 var59 = class37.method284(class89.method587(67, class81.field1769).method151((byte) 107));
                class107.method701(10945, class39.method326(var57, 101).method164(-12065), 6, var59);
                class58.field1359 = -1;
                return true;
            }
            if (class58.field1359 == 68) {
                if (class119.field2450 != -1) {
                    class162.method991(class119.field2450, 0, (byte) 12);
                }
                class58.field1359 = -1;
                return true;
            }
            if (class58.field1359 == 210) {
                int var60 = class81.field1769.method1200(-113);
                if (var60 == 65535) {
                    var60 = -1;
                }
                int var61 = class81.field1769.method1230(9287);
                int var62 = class81.field1769.method1190(-4);
                class47 var63 = class113.method725((byte) 111, var61);
                if (var63.field1027) {
                    var63.field1092 = var62;
                    var63.field1147 = var60;
                    class63 var64 = class85.method565(var60, (byte) 81);
                    var63.field1038 = var64.field1504;
                    var63.field1021 = var64.field1482;
                    var63.field1073 = var64.field1489;
                    var63.field1048 = var64.field1507;
                    var63.field1040 = var64.field1473;
                    var63.field1067 = var64.field1455;
                    if (var63.field1125 > 0) {
                        var63.field1040 = var63.field1040 * 32 / var63.field1125;
                    }
                    class3.method12(var63, false);
                } else if (var60 == -1) {
                    var63.field1135 = 0;
                    class58.field1359 = -1;
                    return true;
                } else {
                    class63 var65 = class85.method565(var60, (byte) 96);
                    var63.field1032 = var60;
                    var63.field1048 = var65.field1507;
                    var63.field1135 = 4;
                    var63.field1040 = var65.field1473 * 100 / var62;
                    var63.field1073 = var65.field1489;
                    class3.method12(var63, false);
                }
                class58.field1359 = -1;
                return true;
            }
            if (class58.field1359 == 100) {
                class53.method408(class81.field1769, -121);
                class58.field1359 = -1;
                return true;
            }
            if (class58.field1359 == 138) {
                class181.field3575 = true;
                class49.field1172 = class81.field1769.method1202(126);
                class49.field1183 = class81.field1769.method1202(-64);
                class29.field639 = class81.field1769.method1197(-1);
                class201.field3970 = class81.field1769.method1202(-84);
                class25.field534 = class81.field1769.method1202(-106);
                if (class25.field534 >= 100) {
                    int var66 = class49.field1183 * 128 + 64;
                    int var67 = class49.field1172 * 128 + 64;
                    int var68 = class203.method1330((byte) -88, var66, var67, class59.field1385) - class29.field639;
                    int var69 = var68 - class122.field2530;
                    int var70 = var67 - class119.field2452;
                    int var71 = var66 - class115.field2404;
                    int var72 = (int) Math.sqrt((double) (var70 * var70 + var71 * var71));
                    class105.field2266 = (int) (Math.atan2((double) var69, (double) var72) * 325.949D) & 0x7FF;
                    class181.field3574 = (int) (Math.atan2((double) var70, (double) var71) * -325.949D) & 0x7FF;
                    if (class105.field2266 < 128) {
                        class105.field2266 = 128;
                    }
                    if (class105.field2266 > 383) {
                        class105.field2266 = 383;
                    }
                }
                class58.field1359 = -1;
                return true;
            }
            int var73 = 7 / ((-arg0 - 43) / 63);
            if (class58.field1359 == 147) {
                class111.method717(-9);
                int var74 = class81.field1769.method1190(-4);
                int var75 = class81.field1769.method1203(-125);
                int var76 = class81.field1769.method1203(-116);
                class156.field3120[var76] = var74;
                class110.field2330[var76] = var75;
                class61.field1420[var76] = 1;
                for (int var77 = 0; var77 < 98; var77++) {
                    if (var74 >= class101.field2167[var77]) {
                        class61.field1420[var76] = var77 + 2;
                    }
                }
                class124.field2551[class27.method198(class67.field1574++, 31)] = var76;
                class58.field1359 = -1;
                return true;
            }
            if (class58.field1359 == 189) {
                int var78 = class81.field1769.method1190(-4);
                class115 var79 = (class115) class31.field665.method260((long) var78, (byte) 28);
                if (var79 != null) {
                    class51.method400(var79, 71, true);
                }
                if (class72.field1644 != null) {
                    class3.method12(class72.field1644, false);
                    class72.field1644 = null;
                }
                class58.field1359 = -1;
                return true;
            }
            if (class58.field1359 == 4) {
                class9.field183 = class81.field1769.method1203(85);
                class174.field3470 = class81.field1769.method1202(104);
                class58.field1359 = -1;
                return true;
            }
            if (class58.field1359 == 178) {
                for (int var80 = 0; var80 < class95.field2007.length; var80++) {
                    if (class95.field2007[var80] != null) {
                        class95.field2007[var80].field288 = -1;
                    }
                }
                for (int var81 = 0; var81 < class91.field1944.length; var81++) {
                    if (class91.field1944[var81] != null) {
                        class91.field1944[var81].field288 = -1;
                    }
                }
                class58.field1359 = -1;
                return true;
            }
            if (class58.field1359 == 143) {
                int var82 = class81.field1769.method1216((byte) 122);
                byte var83 = class81.field1769.method1179(128);
                class165.field3290[var82] = var83;
                if (class54.field1288[var82] != var83) {
                    class54.field1288[var82] = var83;
                    class136.method867(var82, (byte) 125);
                }
                field2795[class27.method198(class8.field158++, 31)] = var82;
                class58.field1359 = -1;
                return true;
            }
            if (class58.field1359 == 121) {
                int var84 = class81.field1769.method1190(-4);
                int var85 = class81.field1769.method1197(-1);
                class47 var86;
                if (var84 < 0) {
                    var86 = null;
                } else {
                    var86 = class113.method725((byte) 101, var84);
                }
                if (var86 != null) {
                    for (int var87 = 0; var87 < var86.field1136.length; var87++) {
                        var86.field1136[var87] = 0;
                        var86.field1024[var87] = 0;
                    }
                }
                if (var84 < -70000) {
                    var85 += 32768;
                }
                class2.method10(var85, 0);
                int var88 = class81.field1769.method1197(-1);
                for (int var89 = 0; var89 < var88; var89++) {
                    int var90 = class81.field1769.method1201(false);
                    if (var90 == 255) {
                        var90 = class81.field1769.method1195(407657744);
                    }
                    int var91 = class81.field1769.method1184(-25);
                    if (var86 != null && var86.field1136.length > var89) {
                        var86.field1136[var89] = var91;
                        var86.field1024[var89] = var90;
                    }
                    class177.method1112(var90, var91 - 1, (byte) 66, var89, var85);
                }
                if (var86 != null) {
                    class3.method12(var86, false);
                }
                class111.method717(-80);
                class174.field3473[class27.method198(class60.field1399++, 31)] = class27.method198(32767, var85);
                class58.field1359 = -1;
                return true;
            }
            if (class58.field1359 == 245) {
                int var92 = class81.field1769.method1197(-1);
                class205.method1335((byte) -21, var92);
                class174.field3473[class27.method198(31, class60.field1399++)] = class27.method198(var92, 32767);
                class58.field1359 = -1;
                return true;
            }
            if (class58.field1359 == 124) {
                int var93 = class81.field1769.method1197(-1);
                int var94 = class81.field1769.method1202(-45);
                int var95 = class81.field1769.method1197(-1);
                class204.method1333(var94, var95, var93, false);
                class58.field1359 = -1;
                return true;
            }
            if (class58.field1359 == 64) {
                class58.field1359 = -1;
                class121.field2517 = 0;
                return true;
            }
            if (class58.field1359 == 45) {
                class136.field2823 = class13.field296;
                long var96 = class81.field1769.method1217(832087072);
                if (var96 == 0L) {
                    class63.field1447 = null;
                    class68.field1602 = null;
                    class165.field3294 = 0;
                    class159.field3189 = null;
                    class58.field1359 = -1;
                    return true;
                }
                long var98 = class81.field1769.method1217(832087072);
                class63.field1447 = class39.method326(var98, 96);
                class68.field1602 = class39.method326(var96, -93);
                class193.field3814 = class81.field1769.method1204(true);
                int var100 = class81.field1769.method1202(-118);
                if (var100 == 255) {
                    class58.field1359 = -1;
                    return true;
                }
                class165.field3294 = var100;
                class135[] var101 = new class135[100];
                for (int var102 = 0; var102 < class165.field3294; var102++) {
                    var101[var102] = new class135();
                    var101[var102].field3317 = class81.field1769.method1217(832087072);
                    var101[var102].field2800 = class39.method326(var101[var102].field3317, -45);
                    var101[var102].field2805 = class81.field1769.method1197(-1);
                    var101[var102].field2797 = class81.field1769.method1204(true);
                    if (class94.field1991 == var101[var102].field3317) {
                        class128.field2659 = var101[var102].field2797;
                    }
                }
                boolean var103 = false;
                int var104 = class165.field3294;
                while (var104 > 0) {
                    var104--;
                    boolean var105 = true;
                    for (int var106 = 0; var106 < var104; var106++) {
                        if (var101[var106].field2800.method141(var101[var106 + 1].field2800, true) > 0) {
                            class135 var107 = var101[var106];
                            var105 = false;
                            var101[var106] = var101[var106 + 1];
                            var101[var106 + 1] = var107;
                        }
                    }
                    if (var105) {
                        break;
                    }
                }
                class159.field3189 = var101;
                class58.field1359 = -1;
                return true;
            }
            if (class58.field1359 == 47) {
                class23 var108 = class81.field1769.method1193((byte) -70);
                int var109 = class81.field1769.method1176(3);
                class47 var110 = class113.method725((byte) 97, var109);
                if (!var108.method161(-4, var110.field1030)) {
                    var110.field1030 = var108;
                    class3.method12(var110, false);
                }
                class58.field1359 = -1;
                return true;
            }
            if (class58.field1359 == 173) {
                class122.method757(true);
                class58.field1359 = -1;
                return false;
            }
            if (class58.field1359 == 115) {
                int var111 = class81.field1769.method1195(407657744);
                int var112 = class81.field1769.method1197(-1);
                int var113 = var112 >> 5 & 0x1F;
                int var114 = var112 >> 10 & 0x1F;
                int var115 = var112 & 0x1F;
                int var116 = (var115 << 3) + ((var114 << 19) + (var113 << 11));
                class47 var117 = class113.method725((byte) 101, var111);
                if (var117.field1112 != var116) {
                    var117.field1112 = var116;
                    class3.method12(var117, false);
                }
                class58.field1359 = -1;
                return true;
            }
            if (class58.field1359 == 181) {
                int var118 = class81.field1769.method1195(407657744);
                class47 var119 = class113.method725((byte) 103, var118);
                for (int var120 = 0; var120 < var119.field1136.length; var120++) {
                    var119.field1136[var120] = -1;
                    var119.field1136[var120] = 0;
                }
                class3.method12(var119, false);
                class58.field1359 = -1;
                return true;
            }
            if (class58.field1359 == 94) {
                int var121 = class81.field1769.method1176(3);
                int var122 = class81.field1769.method1184(-25);
                class47 var123 = class113.method725((byte) 112, var121);
                if (var123.field1135 != 2 || var123.field1032 != var122) {
                    var123.field1032 = var122;
                    var123.field1135 = 2;
                    class3.method12(var123, false);
                }
                class58.field1359 = -1;
                return true;
            }
            if (class58.field1359 == 157) {
                class114.method730(class81.field1769, class60.field1398, class199.field3900, (byte) 46);
                class58.field1359 = -1;
                return true;
            }
            if (class58.field1359 == 97) {
                int var124 = class81.field1769.method1216((byte) 79);
                int var125 = class81.field1769.method1230(9287);
                class165.field3290[var124] = var125;
                if (class54.field1288[var124] != var125) {
                    class54.field1288[var124] = var125;
                    class136.method867(var124, (byte) 109);
                }
                field2795[class27.method198(class8.field158++, 31)] = var124;
                class58.field1359 = -1;
                return true;
            }
            if (class58.field1359 == 242) {
                class23 var126 = class81.field1769.method1193((byte) -70);
                Object[] var127 = new Object[var126.method143(-41) + 1];
                for (int var128 = var126.method143(-41) - 1; var128 >= 0; var128--) {
                    if (var126.method160(var128, 255) == 115) {
                        var127[var128 + 1] = class81.field1769.method1193((byte) -70);
                    } else {
                        var127[var128 + 1] = Integer.valueOf(class81.field1769.method1190(-4));
                    }
                }
                var127[0] = Integer.valueOf(class81.field1769.method1190(-4));
                class144 var129 = new class144();
                var129.field2942 = var127;
                class50.method391(-1142686098, var129);
                class58.field1359 = -1;
                return true;
            }
            if (class58.field1359 == 58) {
                for (int var130 = 0; var130 < class43.field916; var130++) {
                    class160 var131 = class122.method759(-121, var130);
                    if (var131 != null && var131.field3203 == 0) {
                        class165.field3290[var130] = 0;
                        class54.field1288[var130] = 0;
                    }
                }
                class111.method717(122);
                class8.field158 += 32;
                class58.field1359 = -1;
                return true;
            }
            if (class58.field1359 == 111 || class58.field1359 == 11 || class58.field1359 == 42 || class58.field1359 == 5 || class58.field1359 == 88 || class58.field1359 == 9 || class58.field1359 == 150 || class58.field1359 == 15 || class58.field1359 == 236 || class58.field1359 == 76 || class58.field1359 == 13) {
                class34.method248(true);
                class58.field1359 = -1;
                return true;
            }
            if (class58.field1359 == 223) {
                long var132 = class81.field1769.method1217(832087072);
                long var134 = (long) class81.field1769.method1197(-1);
                long var136 = (long) class81.field1769.method1177(true);
                long var138 = (var134 << 32) + var136;
                int var140 = class81.field1769.method1202(-81);
                boolean var141 = false;
                for (int var142 = 0; var142 < 100; var142++) {
                    if (class14.field313[var142] == var138) {
                        var141 = true;
                        break;
                    }
                }
                if (var140 <= 1) {
                    for (int var143 = 0; var143 < class157.field3145; var143++) {
                        if (class189.field3758[var143] == var132) {
                            var141 = true;
                            break;
                        }
                    }
                }
                if (!var141 && class3.field36 == 0) {
                    class14.field313[class193.field3808] = var138;
                    class193.field3808 = (class193.field3808 + 1) % 100;
                    class23 var144 = class37.method284(class89.method587(104, class81.field1769).method151((byte) -107));
                    if (var140 == 2 || var140 == 3) {
                        class107.method701(10945, class3.method14(true, new class23[] { class19.field401, class39.method326(var132, 101).method164(-12065) }), 7, var144);
                    } else if (var140 == 1) {
                        class107.method701(10945, class3.method14(true, new class23[] { class174.field3469, class39.method326(var132, 106).method164(-12065) }), 7, var144);
                    } else {
                        class107.method701(10945, class39.method326(var132, -87).method164(-12065), 3, var144);
                    }
                }
                class58.field1359 = -1;
                return true;
            }
            if (class58.field1359 == 218) {
                long var145 = class81.field1769.method1217(832087072);
                class81.field1769.method1204(true);
                long var147 = class81.field1769.method1217(832087072);
                long var149 = (long) class81.field1769.method1197(-1);
                long var151 = (long) class81.field1769.method1177(true);
                int var153 = class81.field1769.method1202(-91);
                long var154 = (var149 << 32) + var151;
                boolean var156 = false;
                for (int var157 = 0; var157 < 100; var157++) {
                    if (class14.field313[var157] == var154) {
                        var156 = true;
                        break;
                    }
                }
                if (var153 <= 1) {
                    for (int var158 = 0; var158 < class157.field3145; var158++) {
                        if (class189.field3758[var158] == var145) {
                            var156 = true;
                            break;
                        }
                    }
                }
                if (!var156 && class3.field36 == 0) {
                    class14.field313[class193.field3808] = var154;
                    class193.field3808 = (class193.field3808 + 1) % 100;
                    class23 var159 = class37.method284(class89.method587(69, class81.field1769).method151((byte) -114));
                    if (var153 == 2 || var153 == 3) {
                        class183.method1128(9, class39.method326(var147, -50).method164(-12065), (byte) 85, var159, class3.method14(true, new class23[] { class19.field401, class39.method326(var145, -95).method164(-12065) }));
                    } else if (var153 == 1) {
                        class183.method1128(9, class39.method326(var147, -116).method164(-12065), (byte) 85, var159, class3.method14(true, new class23[] { class174.field3469, class39.method326(var145, 109).method164(-12065) }));
                    } else {
                        class183.method1128(9, class39.method326(var147, 120).method164(-12065), (byte) 85, var159, class39.method326(var145, 121).method164(-12065));
                    }
                }
                class58.field1359 = -1;
                return true;
            }
            if (class58.field1359 == 55) {
                class174.field3470 = class81.field1769.method1207((byte) 117);
                class9.field183 = class81.field1769.method1207((byte) 38);
                while (class199.field3900 > class81.field1769.field3752) {
                    class58.field1359 = class81.field1769.method1202(101);
                    class34.method248(true);
                }
                class58.field1359 = -1;
                return true;
            }
            if (class58.field1359 == 190) {
                int var160 = class81.field1769.field3752 + class199.field3900;
                int var161 = class81.field1769.method1197(-1);
                int var162 = class81.field1769.method1197(-1);
                if (class119.field2450 != var161) {
                    class119.field2450 = var161;
                    class1.method1(class119.field2450, 56);
                    class159.method976(class119.field2450, 0);
                    for (int var163 = 0; var163 < 100; var163++) {
                        class172.field3412[var163] = true;
                    }
                }
                while (var162-- > 0) {
                    int var164 = class81.field1769.method1190(-4);
                    int var165 = class81.field1769.method1197(-1);
                    int var166 = class81.field1769.method1202(-118);
                    class115 var167 = (class115) class31.field665.method260((long) var164, (byte) 28);
                    if (var167 != null && var167.field2408 != var165) {
                        class51.method400(var167, 61, true);
                        var167 = null;
                    }
                    if (var167 == null) {
                        var167 = class110.method713(var165, var164, var166, -23);
                    }
                    var167.field2411 = true;
                }
                for (class115 var168 = (class115) class31.field665.method264(61); var168 != null; var168 = (class115) class31.field665.method259(-89)) {
                    if (var168.field2411) {
                        var168.field2411 = false;
                    } else {
                        class51.method400(var168, 74, true);
                    }
                }
                class205.field4032 = new class36(512);
                while (class81.field1769.field3752 < var160) {
                    int var169 = class81.field1769.method1190(-4);
                    int var170 = class81.field1769.method1197(-1);
                    int var171 = class81.field1769.method1197(-1);
                    int var172 = class81.field1769.method1190(-4);
                    for (int var173 = var170; var173 <= var171; var173++) {
                        long var174 = ((long) var169 << 32) + ((long) var173);
                        class205.field4032.method262(var174, -121, new class56(var172));
                    }
                }
                class58.field1359 = -1;
                return true;
            }
            if (class58.field1359 == 86) {
                int var176 = class81.field1769.method1184(-25);
                int var177 = class81.field1769.method1190(-4);
                int var178 = class81.field1769.method1184(-25);
                class47 var179 = class113.method725((byte) 90, var177);
                class58.field1359 = -1;
                var179.field1076 = (var176 << 16) + var178;
                return true;
            }
            if (class58.field1359 == 87) {
                class23 var180 = class81.field1769.method1193((byte) -70);
                if (var180.method147(-111, class110.field2341)) {
                    class23 var181 = var180.method156(0, var180.method168(0, class16.field343), -113);
                    long var182 = var181.method166((byte) -86);
                    boolean var184 = false;
                    for (int var185 = 0; var185 < class157.field3145; var185++) {
                        if (class189.field3758[var185] == var182) {
                            var184 = true;
                            break;
                        }
                    }
                    if (!var184 && class3.field36 == 0) {
                        class107.method701(10945, var181, 4, class60.field1401);
                    }
                } else if (var180.method147(-114, class193.field3815)) {
                    class23 var186 = var180.method156(0, var180.method168(0, class16.field343), -92);
                    boolean var187 = false;
                    long var188 = var186.method166((byte) -128);
                    for (int var190 = 0; var190 < class157.field3145; var190++) {
                        if (class189.field3758[var190] == var188) {
                            var187 = true;
                            break;
                        }
                    }
                    if (!var187 && class3.field36 == 0) {
                        class107.method701(10945, var186, 8, class166.field3311);
                    }
                } else if (var180.method147(-105, class56.field1313)) {
                    class23 var199 = var180.method156(0, var180.method168(0, class16.field343), -90);
                    boolean var200 = false;
                    long var201 = var199.method166((byte) -81);
                    for (int var203 = 0; var203 < class157.field3145; var203++) {
                        if (class189.field3758[var203] == var201) {
                            var200 = true;
                            break;
                        }
                    }
                    if (!var200 && class3.field36 == 0) {
                        class23 var204 = var180.method156(var180.method168(0, class16.field343) + 1, var180.method143(-41) + -9, -71);
                        class107.method701(10945, var199, 8, var204);
                    }
                } else if (var180.method147(-103, class84.field1791)) {
                    class23 var194 = var180.method156(0, var180.method168(0, class16.field343), -126);
                    long var195 = var194.method166((byte) -126);
                    boolean var197 = false;
                    for (int var198 = 0; var198 < class157.field3145; var198++) {
                        if (class189.field3758[var198] == var195) {
                            var197 = true;
                            break;
                        }
                    }
                    if (!var197 && class3.field36 == 0) {
                        class107.method701(10945, var194, 10, class66.field1566);
                    }
                } else if (var180.method147(-112, class166.field3321)) {
                    class23 var191 = var180.method156(0, var180.method168(0, class166.field3321), -111);
                    class107.method701(10945, class66.field1566, 11, var191);
                } else if (var180.method147(-101, class10.field199)) {
                    class23 var192 = var180.method156(0, var180.method168(0, class10.field199), -99);
                    if (class3.field36 == 0) {
                        class107.method701(10945, class66.field1566, 12, var192);
                    }
                } else if (var180.method147(-127, class110.field2328)) {
                    class23 var193 = var180.method156(0, var180.method168(0, class110.field2328), -89);
                    if (class3.field36 == 0) {
                        class107.method701(10945, class66.field1566, 13, var193);
                    }
                } else {
                    class107.method701(10945, class66.field1566, 0, var180);
                }
                class58.field1359 = -1;
                return true;
            }
            if (class58.field1359 == 61) {
                class113.field2380 = class81.field1769.method1202(-77);
                if (class113.field2380 == 1) {
                    class56.field1315 = class81.field1769.method1197(-1);
                }
                if (class113.field2380 >= 2 && class113.field2380 <= 6) {
                    if (class113.field2380 == 2) {
                        class174.field3448 = 64;
                        class75.field1711 = 64;
                    }
                    if (class113.field2380 == 3) {
                        class174.field3448 = 64;
                        class75.field1711 = 0;
                    }
                    if (class113.field2380 == 4) {
                        class75.field1711 = 128;
                        class174.field3448 = 64;
                    }
                    if (class113.field2380 == 5) {
                        class174.field3448 = 0;
                        class75.field1711 = 64;
                    }
                    if (class113.field2380 == 6) {
                        class174.field3448 = 128;
                        class75.field1711 = 64;
                    }
                    class113.field2380 = 2;
                    class68.field1612 = class81.field1769.method1197(-1);
                    class29.field645 = class81.field1769.method1197(-1);
                    class153.field3067 = class81.field1769.method1202(-82);
                }
                if (class113.field2380 == 10) {
                    class189.field3715 = class81.field1769.method1197(-1);
                }
                class58.field1359 = -1;
                return true;
            }
            if (class58.field1359 == 108) {
                class86.field1844 = class81.field1769.method1216((byte) 80) * 30;
                class151.field3022 = class13.field296;
                class58.field1359 = -1;
                return true;
            }
            if (class58.field1359 == 140) {
                int var205 = class81.field1769.method1200(-113);
                if (var205 == 65535) {
                    var205 = -1;
                }
                int var206 = class81.field1769.method1195(407657744);
                int var207 = class81.field1769.method1195(407657744);
                int var208 = class81.field1769.method1197(-1);
                if (var208 == 65535) {
                    var208 = -1;
                }
                for (int var209 = var205; var209 <= var208; var209++) {
                    long var210 = ((long) var207 << 32) + ((long) var209);
                    class166 var212 = class205.field4032.method260(var210, (byte) 28);
                    if (var212 != null) {
                        var212.method1018(15789);
                    }
                    class205.field4032.method262(var210, -124, new class56(var206));
                }
                class58.field1359 = -1;
                return true;
            }
            if (class58.field1359 == 208) {
                int var213 = class81.field1769.method1190(-4);
                int var214 = class81.field1769.method1185(103);
                int var215 = class81.field1769.method1196(false);
                class47 var216 = class113.method725((byte) 100, var213);
                int var217 = var216.field1019 + var215;
                int var218 = var216.field1045 + var214;
                if (var216.field1102 != var217 || var216.field1120 != var218) {
                    var216.field1102 = var217;
                    var216.field1120 = var218;
                    class3.method12(var216, false);
                }
                class58.field1359 = -1;
                return true;
            }
            if (class58.field1359 == 177) {
                boolean var219 = false;
                long var220 = class81.field1769.method1217(832087072);
                if ((Long.MIN_VALUE & var220) != 0L) {
                    var219 = true;
                }
                int var222 = class81.field1769.method1197(-1);
                byte var223 = class81.field1769.method1204(true);
                if (var219) {
                    if (class165.field3294 == 0) {
                        class58.field1359 = -1;
                        return true;
                    }
                    long var224 = var220 & Long.MAX_VALUE;
                    boolean var226 = false;
                    int var227;
                    for (var227 = 0; var227 < class165.field3294 && (class159.field3189[var227].field3317 != var224 || class159.field3189[var227].field2805 != var222); var227++) {
                    }
                    if (var227 < class165.field3294) {
                        while (class165.field3294 - 1 > var227) {
                            class159.field3189[var227] = class159.field3189[var227 + 1];
                            var227++;
                        }
                        class165.field3294--;
                        class159.field3189[class165.field3294] = null;
                    }
                } else {
                    class135 var228 = new class135();
                    var228.field3317 = var220;
                    var228.field2800 = class39.method326(var228.field3317, 95);
                    var228.field2805 = var222;
                    var228.field2797 = var223;
                    int var229;
                    for (var229 = class165.field3294 - 1; var229 >= 0; var229--) {
                        int var230 = class159.field3189[var229].field2800.method141(var228.field2800, true);
                        if (var230 == 0) {
                            class159.field3189[var229].field2805 = var222;
                            class159.field3189[var229].field2797 = var223;
                            if (class94.field1991 == var220) {
                                class128.field2659 = var223;
                            }
                            class136.field2823 = class13.field296;
                            class58.field1359 = -1;
                            return true;
                        }
                        if (var230 < 0) {
                            break;
                        }
                    }
                    if (class165.field3294 >= class159.field3189.length) {
                        class58.field1359 = -1;
                        return true;
                    }
                    for (int var231 = class165.field3294 - 1; var231 > var229; var231--) {
                        class159.field3189[var231 + 1] = class159.field3189[var231];
                    }
                    if (class165.field3294 == 0) {
                        class159.field3189 = new class135[100];
                    }
                    class159.field3189[var229 + 1] = var228;
                    if (class94.field1991 == var220) {
                        class128.field2659 = var223;
                    }
                    class165.field3294++;
                }
                class136.field2823 = class13.field296;
                class58.field1359 = -1;
                return true;
            }
            if (class58.field1359 == 39) {
                int var232 = class81.field1769.method1195(407657744);
                int var233 = class81.field1769.method1200(-121);
                class47 var234 = class113.method725((byte) 109, var232);
                if (var234.field1135 != 1 || var234.field1032 != var233) {
                    var234.field1032 = var233;
                    var234.field1135 = 1;
                    class3.method12(var234, false);
                }
                class58.field1359 = -1;
                return true;
            }
            if (class58.field1359 == 128) {
                int var235 = class81.field1769.method1216((byte) 118);
                class119.field2450 = var235;
                class1.method1(var235, 57);
                class159.method976(class119.field2450, 0);
                for (int var236 = 0; var236 < 100; var236++) {
                    class172.field3412[var236] = true;
                }
                class58.field1359 = -1;
                return true;
            }
            if (class58.field1359 == 131) {
                class69.field1620 = class81.field1769.method1202(113);
                class145.field2955 = class81.field1769.method1202(-87);
                class124.field2539 = class81.field1769.method1202(-105);
                class58.field1359 = -1;
                return true;
            }
            if (class58.field1359 == 142) {
                class73.field1666 = class81.field1769.method1202(119);
                class1.field7 = class13.field296;
                class58.field1359 = -1;
                return true;
            }
            if (class58.field1359 == 29) {
                int var237 = class81.field1769.method1190(-4);
                int var238 = class81.field1769.method1197(-1);
                if (var237 < -70000) {
                    var238 += 32768;
                }
                class47 var239;
                if (var237 >= 0) {
                    var239 = class113.method725((byte) 121, var237);
                } else {
                    var239 = null;
                }
                while (class199.field3900 > class81.field1769.field3752) {
                    int var240 = class81.field1769.method1210(false);
                    int var241 = class81.field1769.method1197(-1);
                    int var242 = 0;
                    if (var241 != 0) {
                        var242 = class81.field1769.method1202(-11);
                        if (var242 == 255) {
                            var242 = class81.field1769.method1190(-4);
                        }
                    }
                    if (var239 != null && var240 >= 0 && var239.field1136.length > var240) {
                        var239.field1136[var240] = var241;
                        var239.field1024[var240] = var242;
                    }
                    class177.method1112(var242, var241 - 1, (byte) 125, var240, var238);
                }
                if (var239 != null) {
                    class3.method12(var239, false);
                }
                class111.method717(124);
                class174.field3473[class27.method198(class60.field1399++, 31)] = class27.method198(var238, 32767);
                class58.field1359 = -1;
                return true;
            }
            if (class58.field1359 == 186) {
                class1.method6(false, (byte) 84);
                class58.field1359 = -1;
                return true;
            }
            if (class58.field1359 == 89) {
                for (int var243 = 0; var243 < class54.field1288.length; var243++) {
                    if (class54.field1288[var243] != class165.field3290[var243]) {
                        class54.field1288[var243] = class165.field3290[var243];
                        class136.method867(var243, (byte) 124);
                        field2795[class27.method198(31, class8.field158++)] = var243;
                    }
                }
                class58.field1359 = -1;
                return true;
            }
            if (class58.field1359 == 57) {
                class146.method923(false);
                class58.field1359 = -1;
                return true;
            }
            if (class58.field1359 == 215) {
                class124.field2547 = class81.field1769.method1202(-29);
                class58.field1359 = -1;
                return true;
            }
            class186.method1145("T1 - " + class58.field1359 + "," + class81.field1773 + "," + class180.field3559 + " - " + class199.field3900, null, 46);
            class122.method757(true);
        } catch (IOException var247) {
            class117.method737(-21734);
        } catch (Exception var248) {
            String var245 = "T2 - " + class58.field1359 + "," + class81.field1773 + "," + class180.field3559 + " - " + class199.field3900 + "," + (class134.field2790.field219[0] + class155.field3099) + "," + (class134.field2790.field230[0] + class94.field1989) + " - ";
            for (int var246 = 0; class199.field3900 > var246 && var246 < 50; var246++) {
                var245 = var245 + class81.field1769.field3753[var246] + ",";
            }
            class186.method1145(var245, var248, 46);
            class122.method757(true);
        }
        return true;
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(B)V")
    public static void method862(byte arg0) {
        field2810 = null;
        if (arg0 >= -14) {
            field2799 = null;
        }
        field2798 = null;
        field2794 = null;
        field2802 = null;
        field2795 = null;
        field2799 = null;
        field2801 = null;
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(B)V")
    public static final void method863(byte arg0) {
        if (arg0 != -52) {
            field2796 = 35;
        }
        field2809++;
        if (class190.field3770 == 0) {
            class205.field4041 = new class127(4, 104, 104, class182.field3596);
            for (int var1 = 0; var1 < 4; var1++) {
                class62.field1435[var1] = new class54(104, 104);
            }
            class143.field2932 = new class38(512, 512);
            class190.field3770 = 20;
            class105.field2271 = class168.field3361;
            class31.field664 = 5;
        } else if (class190.field3770 == 20) {
            int[] var2 = new int[9];
            for (int var3 = 0; var3 < 9; var3++) {
                int var4 = var3 * 32 + 128 + 15;
                int var5 = class140.field2878[var4];
                int var6 = var4 * 3 + 600;
                var2[var3] = var5 * var6 >> 16;
            }
            class127.method780(var2, 500, 800, 512, 334);
            class31.field664 = 10;
            class190.field3770 = 30;
            class105.field2271 = class20.field415;
        } else if (class190.field3770 == 30) {
            class132.field2733 = class94.method612(true, false, 0, true, true);
            class21.field437 = class94.method612(true, false, 1, true, true);
            class61.field1415 = class94.method612(false, true, 2, true, true);
            class15.field333 = class94.method612(true, false, 3, true, true);
            class113.field2375 = class94.method612(true, false, 4, true, true);
            class82.field1779 = class94.method612(true, true, 5, true, true);
            class193.field3812 = class94.method612(true, true, 6, true, false);
            class59.field1376 = class94.method612(true, false, 7, true, true);
            client.field585 = class94.method612(true, false, 8, true, true);
            class1.field13 = class94.method612(false, true, 9, true, true);
            class112.field2360 = class94.method612(true, false, 10, true, true);
            class129.field2673 = class94.method612(true, false, 11, true, true);
            class7.field125 = class94.method612(true, false, 12, true, true);
            class182.field3600 = class94.method612(false, true, 13, true, true);
            class167.field3337 = class94.method612(true, false, 14, true, false);
            class8.field145 = class94.method612(true, false, 15, true, true);
            class105.field2271 = class10.field209;
            class31.field664 = 20;
            class190.field3770 = 40;
        } else if (class190.field3770 == 40) {
            byte var7 = 0;
            int var8 = var7 + class132.field2733.method447(100) * 4 / 100;
            int var9 = var8 + class21.field437.method447(100) * 4 / 100;
            int var10 = var9 + class61.field1415.method447(100) * 2 / 100;
            int var11 = var10 + class15.field333.method447(100) * 2 / 100;
            int var12 = var11 + class113.field2375.method447(100) * 6 / 100;
            int var13 = var12 + class82.field1779.method447(100) * 4 / 100;
            int var14 = var13 + class193.field3812.method447(100) * 2 / 100;
            int var15 = var14 + class59.field1376.method447(100) * 60 / 100;
            int var16 = var15 + client.field585.method447(100) * 2 / 100;
            int var17 = var16 + class1.field13.method447(100) * 2 / 100;
            int var18 = var17 + class112.field2360.method447(100) * 2 / 100;
            int var19 = var18 + class129.field2673.method447(100) * 2 / 100;
            int var20 = var19 + class7.field125.method447(100) * 2 / 100;
            int var21 = var20 + class182.field3600.method447(100) * 2 / 100;
            int var22 = var21 + class167.field3337.method447(100) * 2 / 100;
            int var23 = var22 + class8.field145.method447(100) * 2 / 100;
            if (var23 == 100) {
                class31.field664 = 30;
                class105.field2271 = class42.field904;
                class190.field3770 = 45;
            } else {
                if (var23 != 0) {
                    class105.field2271 = class3.method14(true, new class23[] { class98.field2090, class184.method1132(-1, var23), class31.field670 });
                }
                class31.field664 = 30;
            }
        } else if (class190.field3770 == 45) {
            class170.method1040(22050, 2, 0, !class193.field3810);
            class199 var24 = new class199();
            var24.method1305(0, 9, 128);
            class75.field1713 = class14.method76(-7363, class60.field1398, 0, class27.field558, 22050);
            class75.field1713.method1260((byte) 101, var24);
            class43.method345(false, class8.field145, class113.field2375, var24, class167.field3337);
            class41.field874 = class14.method76(-7363, class60.field1398, 1, class27.field558, 2048);
            class2.field25 = new class192();
            class41.field874.method1260((byte) 101, class2.field25);
            class55.field1301 = new class28(22050, class48.field1163);
            class31.field664 = 35;
            class190.field3770 = 50;
            class105.field2271 = class94.field1990;
        } else if (class190.field3770 == 50) {
            int var25 = 0;
            if (class201.field3971 == null) {
                class201.field3971 = class154.method950(125, class48.field1149, client.field585, class66.field1566, class182.field3600);
            } else {
                var25++;
            }
            if (class14.field301 == null) {
                class14.field301 = class154.method950(-25, class128.field2660, client.field585, class66.field1566, class182.field3600);
            } else {
                var25++;
            }
            if (class189.field3714 == null) {
                class189.field3714 = class154.method950(arg0 + 158, class5.field96, client.field585, class66.field1566, class182.field3600);
            } else {
                var25++;
            }
            if (var25 < 3) {
                class105.field2271 = class3.method14(true, new class23[] { class60.field1405, class184.method1132(-1, var25 * 100 / 3), class31.field670 });
                class31.field664 = 40;
            } else {
                class190.field3770 = 60;
                class105.field2271 = class91.field1948;
                class31.field664 = 40;
            }
        } else if (class190.field3770 == 60) {
            int var26 = class205.method1336(client.field585, class112.field2360, arg0 ^ 0x4);
            int var27 = class65.method484(-96);
            if (var27 > var26) {
                class105.field2271 = class3.method14(true, new class23[] { class51.field1226, class184.method1132(-1, var26 * 100 / var27), class31.field670 });
                class31.field664 = 50;
            } else {
                class31.field664 = 50;
                class105.field2271 = class49.field1186;
                class48.method379(5, (byte) 18);
                class190.field3770 = 70;
            }
        } else if (class190.field3770 == 70) {
            if (class61.field1415.method641((byte) 103)) {
                class177.method1109(arg0 + 4865, class61.field1415);
                class115.method732((byte) 88, class61.field1415);
                class25.method194(class59.field1376, class61.field1415, (byte) -58);
                class16.method84((byte) -92, class61.field1415, class193.field3810, class59.field1376);
                class97.method652((byte) -49, class59.field1376, class61.field1415);
                class191.method1237(class201.field3971, class59.field1376, class186.field3635, class61.field1415, (byte) 83);
                class39.method324(class61.field1415, (byte) 124, class132.field2733, class21.field437);
                class14.method75(1, class61.field1415, class59.field1376);
                class141.method907(class61.field1415, (byte) 115);
                class2.method7((byte) 27, class61.field1415);
                class55.method434(class15.field333, 23223, class59.field1376, client.field585, class182.field3600);
                class14.method77(class61.field1415, true);
                class132.method843(class61.field1415, 0);
                class190.field3770 = 80;
                class31.field664 = 60;
                class105.field2271 = class159.field3193;
            } else {
                class105.field2271 = class3.method14(true, new class23[] { class22.field464, class184.method1132(-1, class61.field1415.method452(8272)), class31.field670 });
                class31.field664 = 60;
            }
        } else if (class190.field3770 == 80) {
            int var28 = 0;
            if (class64.field1515 == null) {
                class64.field1515 = class101.method672(class66.field1566, client.field585, -73, class176.field3498);
            } else {
                var28++;
            }
            if (class170.field3389 == null) {
                class170.field3389 = class101.method672(class66.field1566, client.field585, -93, class29.field640);
            } else {
                var28++;
            }
            if (class44.field919 == null) {
                class44.field919 = class44.method348(arg0 + 108, class66.field1566, client.field585, class48.field1168);
            } else {
                var28++;
            }
            if (class22.field461 == null) {
                class22.field461 = class96.method635(class101.field2166, class66.field1566, (byte) -63, client.field585);
            } else {
                var28++;
            }
            if (class202.field3993 == null) {
                class202.field3993 = class96.method635(class111.field2346, class66.field1566, (byte) -63, client.field585);
            } else {
                var28++;
            }
            if (class178.field3535 == null) {
                class178.field3535 = class96.method635(class143.field2930, class66.field1566, (byte) -63, client.field585);
            } else {
                var28++;
            }
            if (class47.field1049 == null) {
                class47.field1049 = class96.method635(class115.field2410, class66.field1566, (byte) -63, client.field585);
            } else {
                var28++;
            }
            if (class8.field165 == null) {
                class8.field165 = class96.method635(class88.field1885, class66.field1566, (byte) -63, client.field585);
            } else {
                var28++;
            }
            if (class105.field2282 == null) {
                class105.field2282 = class96.method635(class22.field460, class66.field1566, (byte) -63, client.field585);
            } else {
                var28++;
            }
            if (class48.field1165 == null) {
                class48.field1165 = class96.method635(class136.field2814, class66.field1566, (byte) -63, client.field585);
            } else {
                var28++;
            }
            if (class107.field2288 == null) {
                class107.field2288 = class96.method635(class129.field2688, class66.field1566, (byte) -63, client.field585);
            } else {
                var28++;
            }
            if (class155.field3108 == null) {
                class155.field3108 = class44.method348(-47, class66.field1566, client.field585, class53.field1248);
            } else {
                var28++;
            }
            if (class10.field200 == null) {
                class10.field200 = class44.method348(arg0 ^ 0xFFFFFFFB, class66.field1566, client.field585, class12.field235);
            } else {
                var28++;
            }
            if (class168.field3357 == null) {
                class168.field3357 = class2.method11(client.field585, arg0 - 26, class63.field1484, class66.field1566);
            } else {
                var28++;
            }
            if (var28 < 14) {
                class105.field2271 = class3.method14(true, new class23[] { class162.field3255, class184.method1132(-1, var28 * 100 / 14), class31.field670 });
                class31.field664 = 70;
            } else {
                class37.field749 = class10.field200;
                class170.field3389.method295();
                int var29 = (int) (Math.random() * 21.0D) - 10;
                int var30 = (int) (Math.random() * 21.0D) - 10;
                int var31 = (int) (Math.random() * 21.0D) - 10;
                int var32 = (int) (Math.random() * 41.0D) - 20;
                for (int var33 = 0; var33 < class22.field461.length; var33++) {
                    class22.field461[var33].method307(var29 + var32, var30 + var32, var31 + var32);
                }
                class44.field919[0].method838(var29 + var32, var30 + var32, var31 + var32);
                class79.method541(4491);
                class190.field3770 = 90;
                class31.field664 = 70;
                class105.field2271 = class55.field1304;
            }
        } else if (class190.field3770 == 90) {
            if (class1.field13.method641((byte) 112)) {
                class17 var34 = new class17(class1.field13, client.field585, 20, class193.field3810 ? 64 : 128);
                class140.method903(var34);
                class140.method901(0.8F);
                class105.field2271 = class10.field204;
                class190.field3770 = 110;
                class31.field664 = 90;
            } else {
                class105.field2271 = class3.method14(true, new class23[] { class98.field2094, class184.method1132(arg0 ^ 0x33, class1.field13.method452(8272)), class31.field670 });
                class31.field664 = 90;
            }
        } else if (class190.field3770 == 110) {
            class15.field337 = new class201();
            class60.field1398.method870(class15.field337, 10, true);
            class105.field2271 = class84.field1794;
            class31.field664 = 94;
            class190.field3770 = 120;
        } else if (class190.field3770 == 120) {
            if (class112.field2360.method657((byte) 66, class66.field1566, class109.field2322)) {
                class73 var35 = new class73(class112.field2360.method659(class66.field1566, true, class109.field2322));
                class89.method586(var35, arg0 + 16711732);
                class31.field664 = 96;
                class190.field3770 = 130;
                class105.field2271 = class62.field1428;
            } else {
                class105.field2271 = class3.method14(true, new class23[] { class95.field2013, class21.field442 });
                class31.field664 = 96;
            }
        } else if (class190.field3770 == 130) {
            if (!class15.field333.method641((byte) 101)) {
                class105.field2271 = class3.method14(true, new class23[] { class74.field1695, class184.method1132(-1, class15.field333.method452(arg0 ^ -8292) * 4 / 5), class31.field670 });
                class31.field664 = 100;
            } else if (!class7.field125.method641((byte) 103)) {
                class105.field2271 = class3.method14(true, new class23[] { class74.field1695, class184.method1132(-1, class7.field125.method452(8272) / 6 + 80), class31.field670 });
                class31.field664 = 100;
            } else if (class182.field3600.method641((byte) 104)) {
                class31.field664 = 100;
                class105.field2271 = class28.field606;
                class190.field3770 = 140;
            } else {
                class105.field2271 = class3.method14(true, new class23[] { class74.field1695, class184.method1132(-1, class182.field3600.method452(8272) / 20 + 96), class31.field670 });
                class31.field664 = 100;
            }
        } else if (class190.field3770 == 140) {
            class48.method379(10, (byte) 18);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IBI[Lfa;IIIII)V")
    public static final void method864(int arg0, byte arg1, int arg2, class47[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2804++;
        if (arg1 != -53) {
            method860(-116);
        }
        for (int var9 = 0; var9 < arg3.length; var9++) {
            class47 var10 = arg3[var9];
            if (var10 != null && (!var10.field1027 || var10.field1127 == 0 || var10.field1054 || class141.method909(var10, 43) != 0 || class191.field3798 == var10) && var10.field1051 == arg0 && (!var10.field1027 || !class95.method624(-1, var10))) {
                int var11 = var10.field1102 + arg8;
                int var12 = var10.field1120 + arg2;
                if (class17.field361 == var10) {
                    class204.field4023 = var11;
                    class146.field2975 = true;
                    class73.field1665 = var12;
                }
                int var13;
                int var14;
                int var15;
                int var16;
                if (var10.field1127 == 2) {
                    var13 = arg7;
                    var14 = arg6;
                    var15 = arg4;
                    var16 = arg5;
                } else if (var10.field1127 == 9) {
                    int var17 = var12;
                    int var18 = var11 + var10.field1125;
                    int var19 = var12 + var10.field1123;
                    int var20 = var11;
                    if (var11 > var18) {
                        var20 = var18;
                        var18 = var11;
                    }
                    var18++;
                    var14 = arg6 < var20 ? var20 : arg6;
                    var16 = arg5 > var18 ? var18 : arg5;
                    if (var12 > var19) {
                        var17 = var19;
                        var19 = var12;
                    }
                    var19++;
                    var13 = arg7 > var19 ? var19 : arg7;
                    var15 = var17 > arg4 ? var17 : arg4;
                } else {
                    var15 = var12 <= arg4 ? arg4 : var12;
                    int var23 = var10.field1125 + var11;
                    var14 = var11 <= arg6 ? arg6 : var11;
                    var16 = var23 >= arg5 ? arg5 : var23;
                    int var24 = var10.field1123 + var12;
                    var13 = arg7 > var24 ? var24 : arg7;
                }
                if (!var10.field1027 || var16 > var14 && var13 > var15) {
                    if (var10.field1124 == 1337) {
                        class3.method12(var10, false);
                    } else if (var10.field1124 == 1338) {
                        class194.method1261(arg1 ^ 0xD5F5FBE0, var11, var12);
                    } else {
                        if (var10.field1127 == 0) {
                            if (!var10.field1027 && class95.method624(-1, var10) && class62.field1442 != var10) {
                                continue;
                            }
                            method864(var10.field1071, (byte) -53, var12 - var10.field1065, arg3, var15, var16, var14, var13, var11 - var10.field1100);
                            if (var10.field1029 != null) {
                                method864(var10.field1071, (byte) -53, var12 - var10.field1065, var10.field1029, var15, var16, var14, var13, var11 - var10.field1100);
                            }
                            class115 var25 = (class115) class31.field665.method260((long) var10.field1071, (byte) 28);
                            if (var25 != null) {
                                class119.method744(var16, var14, var11, var25.field2408, var15, false, var12, var13);
                            }
                        }
                        if (var10.field1027) {
                            boolean var26;
                            if (var14 <= class78.field1724 && var15 <= class64.field1518 && class78.field1724 < var16 && var13 > class64.field1518) {
                                var26 = true;
                            } else {
                                var26 = false;
                            }
                            boolean var27 = false;
                            if (class105.field2277 == 1 && var26) {
                                var27 = true;
                            }
                            boolean var28 = false;
                            if (class43.field911 == 1 && class65.field1535 >= var14 && var15 <= class43.field912 && var16 > class65.field1535 && var13 > class43.field912) {
                                var28 = true;
                            }
                            if (var28) {
                                class23.method149(class65.field1535 - var11, (byte) 118, class43.field912 - var12, var10);
                            }
                            if (class17.field361 != null && class17.field361 != var10 && var26 && class168.method1032(arg1 + 127, class141.method909(var10, arg1 + -74))) {
                                class63.field1481 = var10;
                            }
                            if (class191.field3798 == var10) {
                                class160.field3218 = true;
                                class153.field3050 = var11;
                                class96.field2030 = var12;
                            }
                            if (var10.field1054) {
                                if (var26 && class89.field1925 != 0 && var10.field1134 != null) {
                                    class144 var29 = new class144();
                                    var29.field2949 = class89.field1925;
                                    var29.field2942 = var10.field1134;
                                    var29.field2939 = var10;
                                    class22.field452.method186(var29, -26692);
                                }
                                if (class17.field361 != null || class191.field3795 != null || class134.field2786) {
                                    var27 = false;
                                    var26 = false;
                                    var28 = false;
                                }
                                if (!var10.field1117 && var28) {
                                    var10.field1117 = true;
                                    if (var10.field1116 != null) {
                                        class144 var30 = new class144();
                                        var30.field2952 = class65.field1535 - var11;
                                        var30.field2949 = class43.field912 - var12;
                                        var30.field2942 = var10.field1116;
                                        var30.field2939 = var10;
                                        class22.field452.method186(var30, -26692);
                                    }
                                }
                                if (var10.field1117 && var27 && var10.field1098 != null) {
                                    class144 var31 = new class144();
                                    var31.field2952 = class78.field1724 - var11;
                                    var31.field2942 = var10.field1098;
                                    var31.field2939 = var10;
                                    var31.field2949 = class64.field1518 - var12;
                                    class22.field452.method186(var31, arg1 ^ 0x6877);
                                }
                                if (var10.field1117 && !var27) {
                                    var10.field1117 = false;
                                    if (var10.field1132 != null) {
                                        class144 var32 = new class144();
                                        var32.field2952 = class78.field1724 - var11;
                                        var32.field2939 = var10;
                                        var32.field2942 = var10.field1132;
                                        var32.field2949 = class64.field1518 - var12;
                                        field2799.method186(var32, -26692);
                                    }
                                }
                                if (var27 && var10.field1026 != null) {
                                    class144 var33 = new class144();
                                    var33.field2939 = var10;
                                    var33.field2952 = class78.field1724 - var11;
                                    var33.field2949 = class64.field1518 - var12;
                                    var33.field2942 = var10.field1026;
                                    class22.field452.method186(var33, -26692);
                                }
                                if (!var10.field1075 && var26) {
                                    var10.field1075 = true;
                                    if (var10.field1086 != null) {
                                        class144 var34 = new class144();
                                        var34.field2942 = var10.field1086;
                                        var34.field2949 = class64.field1518 - var12;
                                        var34.field2939 = var10;
                                        var34.field2952 = class78.field1724 - var11;
                                        class22.field452.method186(var34, -26692);
                                    }
                                }
                                if (var10.field1075 && var26 && var10.field1031 != null) {
                                    class144 var35 = new class144();
                                    var35.field2952 = class78.field1724 - var11;
                                    var35.field2949 = class64.field1518 - var12;
                                    var35.field2942 = var10.field1031;
                                    var35.field2939 = var10;
                                    class22.field452.method186(var35, arg1 ^ 0x6877);
                                }
                                if (var10.field1075 && !var26) {
                                    var10.field1075 = false;
                                    if (var10.field1105 != null) {
                                        class144 var36 = new class144();
                                        var36.field2939 = var10;
                                        var36.field2942 = var10.field1105;
                                        var36.field2949 = class64.field1518 - var12;
                                        var36.field2952 = class78.field1724 - var11;
                                        field2799.method186(var36, -26692);
                                    }
                                }
                                if (var10.field1010 != null) {
                                    class144 var37 = new class144();
                                    var37.field2939 = var10;
                                    var37.field2942 = var10.field1010;
                                    class62.field1436.method186(var37, -26692);
                                }
                                if (var10.field1122 != null && var10.field1046 < class8.field158) {
                                    if (var10.field1140 == null || class8.field158 - var10.field1046 > 32) {
                                        class144 var42 = new class144();
                                        var42.field2939 = var10;
                                        var42.field2942 = var10.field1122;
                                        class22.field452.method186(var42, arg1 ^ 0x6877);
                                    } else {
                                        label385: for (int var38 = var10.field1046; var38 < class8.field158; var38++) {
                                            int var39 = field2795[var38 & 0x1F];
                                            for (int var40 = 0; var40 < var10.field1140.length; var40++) {
                                                if (var10.field1140[var40] == var39) {
                                                    class144 var41 = new class144();
                                                    var41.field2942 = var10.field1122;
                                                    var41.field2939 = var10;
                                                    class22.field452.method186(var41, arg1 - 26639);
                                                    break label385;
                                                }
                                            }
                                        }
                                    }
                                    var10.field1046 = class8.field158;
                                }
                                if (var10.field1096 != null && var10.field1121 < class60.field1399) {
                                    if (var10.field1085 == null || class60.field1399 - var10.field1121 > 32) {
                                        class144 var47 = new class144();
                                        var47.field2942 = var10.field1096;
                                        var47.field2939 = var10;
                                        class22.field452.method186(var47, -26692);
                                    } else {
                                        label365: for (int var43 = var10.field1121; var43 < class60.field1399; var43++) {
                                            int var44 = class174.field3473[var43 & 0x1F];
                                            for (int var45 = 0; var45 < var10.field1085.length; var45++) {
                                                if (var10.field1085[var45] == var44) {
                                                    class144 var46 = new class144();
                                                    var46.field2939 = var10;
                                                    var46.field2942 = var10.field1096;
                                                    class22.field452.method186(var46, -26692);
                                                    break label365;
                                                }
                                            }
                                        }
                                    }
                                    var10.field1121 = class60.field1399;
                                }
                                if (var10.field1050 != null && class67.field1574 > var10.field1006) {
                                    if (var10.field1090 == null || class67.field1574 - var10.field1006 > 32) {
                                        class144 var52 = new class144();
                                        var52.field2942 = var10.field1050;
                                        var52.field2939 = var10;
                                        class22.field452.method186(var52, -26692);
                                    } else {
                                        label345: for (int var48 = var10.field1006; var48 < class67.field1574; var48++) {
                                            int var49 = class124.field2551[var48 & 0x1F];
                                            for (int var50 = 0; var50 < var10.field1090.length; var50++) {
                                                if (var10.field1090[var50] == var49) {
                                                    class144 var51 = new class144();
                                                    var51.field2942 = var10.field1050;
                                                    var51.field2939 = var10;
                                                    class22.field452.method186(var51, -26692);
                                                    break label345;
                                                }
                                            }
                                        }
                                    }
                                    var10.field1006 = class67.field1574;
                                }
                                if (class78.field1720 > var10.field1056 && var10.field1042 != null) {
                                    class144 var53 = new class144();
                                    var53.field2942 = var10.field1042;
                                    var53.field2939 = var10;
                                    class22.field452.method186(var53, arg1 ^ 0x6877);
                                }
                                if (var10.field1056 < class1.field7 && var10.field1055 != null) {
                                    class144 var54 = new class144();
                                    var54.field2942 = var10.field1055;
                                    var54.field2939 = var10;
                                    class22.field452.method186(var54, arg1 - 26639);
                                }
                                if (var10.field1056 < class136.field2823 && var10.field1130 != null) {
                                    class144 var55 = new class144();
                                    var55.field2942 = var10.field1130;
                                    var55.field2939 = var10;
                                    class22.field452.method186(var55, arg1 - 26639);
                                }
                                if (var10.field1056 < class134.field2783 && var10.field1110 != null) {
                                    class144 var56 = new class144();
                                    var56.field2939 = var10;
                                    var56.field2942 = var10.field1110;
                                    class22.field452.method186(var56, -26692);
                                }
                                if (class151.field3022 > var10.field1056 && var10.field1133 != null) {
                                    class144 var57 = new class144();
                                    var57.field2939 = var10;
                                    var57.field2942 = var10.field1133;
                                    class22.field452.method186(var57, arg1 - 26639);
                                }
                                var10.field1056 = class13.field296;
                                if (var10.field1053 != null) {
                                    for (int var58 = 0; var58 < class73.field1664; var58++) {
                                        class144 var59 = new class144();
                                        var59.field2939 = var10;
                                        var59.field2943 = class61.field1407[var58];
                                        var59.field2950 = class194.field3842[var58];
                                        var59.field2942 = var10.field1053;
                                        class22.field452.method186(var59, -26692);
                                    }
                                }
                            }
                        }
                        if (!var10.field1027) {
                            if (class17.field361 != null || class191.field3795 != null || class134.field2786) {
                                return;
                            }
                            if ((var10.field1094 >= 0 || var10.field1091 != 0) && class78.field1724 >= var14 && var15 <= class64.field1518 && var16 > class78.field1724 && class64.field1518 < var13) {
                                if (var10.field1094 >= 0) {
                                    class62.field1442 = arg3[var10.field1094];
                                } else {
                                    class62.field1442 = var10;
                                }
                            }
                            if (var10.field1127 == 8 && class78.field1724 >= var14 && var15 <= class64.field1518 && var16 > class78.field1724 && class64.field1518 < var13) {
                                class200.field3966 = var10;
                            }
                            if (var10.field1107 > var10.field1123) {
                                class82.method557(class64.field1518, var10, class78.field1724, 16, var10.field1107, var11 + var10.field1125, var12, var10.field1123);
                            }
                        }
                    }
                }
            }
        }
    }
}
