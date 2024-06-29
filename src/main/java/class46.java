import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class46 {

    @OriginalMember(owner = "client!aj", name = "o", descriptor = "I")
    public int field1000;

    @OriginalMember(owner = "client!aj", name = "q", descriptor = "[Lpj;")
    public class237[] field1002;

    @OriginalMember(owner = "client!aj", name = "p", descriptor = "[I")
    public int[] field1001;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "[S")
    public short[] field987;

    @OriginalMember(owner = "client!aj", name = "w", descriptor = "[B")
    public byte[] field1008;

    @OriginalMember(owner = "client!aj", name = "v", descriptor = "[S")
    public short[] field1007;

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "Lpj;")
    public static class237 field991 = class33.method353("", 61);

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "Lpj;")
    public static class237 field995 = class33.method353("Hierhin gehen", 113);

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "Lpj;")
    private static class237 field994 = class33.method353("white:", 51);

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "Lpj;")
    public static class237 field997 = class33.method353("_", 40);

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "Lpj;")
    public static class237 field992 = field994;

    @OriginalMember(owner = "client!aj", name = "t", descriptor = "Lpj;")
    public static class237 field1005 = class33.method353("Update)2Liste geladen)3", 23);

    @OriginalMember(owner = "client!aj", name = "n", descriptor = "Lpj;")
    public static class237 field999 = field994;

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "Lpj;")
    public static class237 field993 = class33.method353(" zuerst von Ihrer Ignorieren)2Liste(Q", 101);

    @OriginalMember(owner = "client!aj", name = "s", descriptor = "I")
    public static int field1004;

    @OriginalMember(owner = "client!aj", name = "u", descriptor = "I")
    public static int field1006;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "I")
    public static int field996;

    @OriginalMember(owner = "client!aj", name = "m", descriptor = "I")
    public static int field998;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "[Lcj;")
    public static class115[] field986;

    @OriginalMember(owner = "client!aj", name = "r", descriptor = "[S")
    public static short[] field1003;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ZI)I")
    public final int method427(boolean arg0, int arg1) {
        if (arg0) {
            field1004++;
            return this.field1008[arg1] & 0x3;
        } else {
            return -5;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Z)V")
    public static void method428(boolean arg0) {
        field995 = null;
        field1003 = null;
        field994 = null;
        field999 = null;
        field986 = null;
        if (arg0) {
            return;
        }
        field992 = null;
        field991 = null;
        field993 = null;
        field997 = null;
        field1005 = null;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)Z")
    public final boolean method429(int arg0, int arg1) {
        field996++;
        if (arg1 != -1702768738) {
            method432(-124, -22, 97);
        }
        return (this.field1008[arg0] & 0x4) != 0;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)Z")
    public static final boolean method430(int arg0) throws IOException {
        field998++;
        if (class127.field2219 == null) {
            return false;
        }
        int var1 = class127.field2219.method1438(12);
        if (var1 == 0) {
            return false;
        }
        if (class209.field3571 == -1) {
            var1--;
            class127.field2219.method1435(0, 18461, 1, class65.field1288.field644);
            class65.field1288.field647 = 0;
            class209.field3571 = class65.field1288.method361(24705);
            class120.field2130 = class59.field1200[class209.field3571];
        }
        if (class120.field2130 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class127.field2219.method1435(0, 18461, 1, class65.field1288.field644);
            var1--;
            class120.field2130 = class65.field1288.field644[0] & 0xFF;
        }
        if (class120.field2130 == -2) {
            if (var1 <= 1) {
                return false;
            }
            var1 -= 2;
            class127.field2219.method1435(0, 18461, 2, class65.field1288.field644);
            class65.field1288.field647 = 0;
            class120.field2130 = class65.field1288.method339(-16777216);
        }
        if (var1 < class120.field2130) {
            return false;
        }
        class65.field1288.field647 = 0;
        class127.field2219.method1435(0, 18461, class120.field2130, class65.field1288.field644);
        class238.field4157 = 0;
        class167.field2946 = class204.field3493;
        class204.field3493 = class22.field407;
        class22.field407 = class209.field3571;
        if (class209.field3571 == 189) {
            int var2 = class65.field1288.method339(-16777216);
            if (var2 == 65535) {
                var2 = -1;
            }
            int var3 = class65.field1288.method316((byte) -102);
            int var4 = class65.field1288.method339(-16777216);
            class59.method514(var4, var3, var2, false);
            class209.field3571 = -1;
            return true;
        } else if (class209.field3571 == 134) {
            int var5 = class65.field1288.method316((byte) 116);
            int var6 = class65.field1288.method316((byte) -124);
            int var7 = class65.field1288.method339(-16777216);
            int var8 = class65.field1288.method316((byte) -20);
            int var9 = class65.field1288.method316((byte) -105);
            class272.method1811(var8, var7, -79, var9, var6, true, var5);
            class209.field3571 = -1;
            return true;
        } else if (class209.field3571 == 139) {
            class174.method1208(67, class65.field1288);
            class209.field3571 = -1;
            return true;
        } else if (class209.field3571 == 174) {
            class211.method1410(-92, class65.field1288.method324(1));
            class209.field3571 = -1;
            return true;
        } else if (class209.field3571 == 233) {
            class237 var10 = class65.field1288.method324(1);
            int var11 = class65.field1288.method316((byte) 124);
            int var12 = class65.field1288.method343((byte) 69);
            if (var11 >= 1 && var11 <= 8) {
                if (var10.method1580(class32.field673, (byte) 27)) {
                    var10 = null;
                }
                class163.field2901[var11 - 1] = var10;
                class257.field4421[var11 - 1] = var12 == 0;
            }
            class209.field3571 = -1;
            return true;
        } else if (class209.field3571 == 234) {
            class111.field1952 = class65.field1288.method316((byte) 5);
            class209.field3571 = -1;
            return true;
        } else if (class209.field3571 == 13) {
            if (class84.field1573 != -1) {
                class16.method146((byte) -91, class84.field1573, 0);
            }
            class209.field3571 = -1;
            return true;
        } else if (class209.field3571 == 198) {
            int var13 = class65.field1288.method326(true);
            int var14 = (var13 & 0x39412CD3) >> 28;
            int var15 = var13 & 0x3FFF;
            int var16 = (var13 & 0xFFFCFE1) >> 14;
            int var17 = class65.field1288.method339(-16777216);
            if (var17 == 65535) {
                var17 = -1;
            }
            int var18 = class65.field1288.method343((byte) 65);
            int var19 = var18 & 0x3;
            int var20 = var16 - class235.field4087;
            int var21 = var18 >> 2;
            int var22 = var15 - class27.field494;
            int var23 = class71.field1396[var21];
            class97.method734(var21, 2, var14, var23, var19, var22, var17, var20);
            class209.field3571 = -1;
            return true;
        } else if (class209.field3571 == 130) {
            int var24 = class65.field1288.method321((byte) 116);
            if (var24 == 65535) {
                var24 = -1;
            }
            int var25 = class65.field1288.method300(128);
            int var26 = class65.field1288.method322(30880);
            int var27 = class65.field1288.method300(128);
            if (var27 == 65535) {
                var27 = -1;
            }
            int var28 = class65.field1288.method319((byte) -18);
            if (class54.method476(-107, var25)) {
                for (int var29 = var27; var29 <= var24; var29++) {
                    long var30 = ((long) var28 << 32) + ((long) var29);
                    class81 var32 = class232.field4021.method568(var30, -1);
                    if (var32 != null) {
                        var32.method629(0);
                    }
                    class232.field4021.method562(new class166(var26), var30, (byte) 56);
                }
            }
            class209.field3571 = -1;
            return true;
        } else if (class209.field3571 == 39) {
            long var33 = class65.field1288.method298((byte) -106);
            int var35 = class65.field1288.method339(-16777216);
            class237 var36 = class14.method127(var35, -93).method1565((byte) -105, class65.field1288);
            class220.method1467(var36, class146.method995(270, var33).method1581((byte) -95), 1, var35, (class237) null, 19);
            class209.field3571 = -1;
            return true;
        } else if (class209.field3571 == 87) {
            int var37 = class65.field1288.method314(-754926392);
            int var38 = class65.field1288.method321((byte) -92);
            int var39 = class65.field1288.method316((byte) -33);
            class210 var40 = class232.field4022[var37];
            if (var40 != null) {
                class170.method1177(var39, var38, var40, false);
            }
            class209.field3571 = -1;
            return true;
        } else if (class209.field3571 == 142) {
            class127.method900(true);
            class209.field3571 = -1;
            return false;
        } else if (class209.field3571 == 164) {
            int var41 = class65.field1288.method321((byte) 92);
            int var42 = class65.field1288.method295(14179);
            class57.method502(-93, var41, var42);
            class209.field3571 = -1;
            return true;
        } else if (class209.field3571 == 184) {
            int var43 = class65.field1288.method322(30880);
            int var44 = class65.field1288.method321((byte) -93);
            int var45 = class65.field1288.method295(14179);
            if (class54.method476(-118, var44)) {
                class52.method469(var45, var43, 29608);
            }
            class209.field3571 = -1;
            return true;
        } else if (class209.field3571 == 76) {
            int var46 = class65.field1288.method339(-16777216);
            if (var46 == 65535) {
                var46 = -1;
            }
            class62.method526(false, var46);
            class209.field3571 = -1;
            return true;
        } else if (class209.field3571 == 65) {
            int var47 = class65.field1288.method310((byte) 2);
            int var48 = class65.field1288.method314(-754926392);
            if (var48 == 65535) {
                var48 = -1;
            }
            class110.method817(-1, var48, var47);
            class209.field3571 = -1;
            return true;
        } else if (class209.field3571 == 250) {
            class35.method372(16);
            class143.method986(true);
            class209.field3571 = -1;
            class207.field3523 += 32;
            return true;
        } else if (class209.field3571 == 201) {
            byte var49 = class65.field1288.method330(1);
            int var50 = class65.field1288.method339(-16777216);
            class223.method1480(var50, -112, var49);
            class209.field3571 = -1;
            return true;
        } else if (class209.field3571 == 34) {
            long var51 = class65.field1288.method298((byte) -116);
            class237 var53 = class194.method1344(class11.method116(class65.field1288, -124).method1615(90));
            class175.method1212(var53, class146.method995(270, var51).method1581((byte) -100), (byte) 98, 6);
            class209.field3571 = -1;
            return true;
        } else if (class209.field3571 == 16) {
            class27.field495 = class65.field1288.method295(14179);
            class237.field4150 = class65.field1288.method316((byte) 118);
            class209.field3571 = -1;
            return true;
        } else if (class209.field3571 == 54) {
            int var54 = class65.field1288.method322(30880);
            int var55 = class65.field1288.method314(-754926392);
            int var56 = class65.field1288.method319((byte) -18);
            if (class54.method476(21, var55)) {
                class58 var57 = (class58) class164.field2915.method568((long) var54, -1);
                class58 var58 = (class58) class164.field2915.method568((long) var56, -1);
                if (var58 != null) {
                    class210.method1405(19337, var58, var57 == null || var57.field1191 != var58.field1191);
                }
                if (var57 != null) {
                    var57.method629(0);
                    class164.field2915.method562(var57, (long) var56, (byte) 56);
                }
                class141 var59 = class70.method572(20043, var54);
                if (var59 != null) {
                    class128.method911(var59, -17149);
                }
                class141 var60 = class70.method572(20043, var56);
                if (var60 != null) {
                    class128.method911(var60, -17149);
                    class230.method1523(true, var60, 7318);
                }
                if (class84.field1573 != -1) {
                    class16.method146((byte) -91, class84.field1573, 1);
                }
            }
            class209.field3571 = -1;
            return true;
        } else if (class209.field3571 == 19) {
            class36.field815 = 0;
            class209.field3571 = -1;
            return true;
        } else if (class209.field3571 == 247) {
            for (int var61 = 0; var61 < class202.field3471.length; var61++) {
                if (class202.field3471[var61] != class108.field1925[var61]) {
                    class202.field3471[var61] = class108.field1925[var61];
                    class76.method592((byte) -87, var61);
                    class179.field3150[class272.method1817(class207.field3523++, 31)] = var61;
                }
            }
            class209.field3571 = -1;
            return true;
        } else if (class209.field3571 == 96) {
            int var62 = class65.field1288.method319((byte) -18);
            int var63 = class65.field1288.method300(128);
            int var64 = class65.field1288.method321((byte) 61);
            if (class54.method476(-127, var64)) {
                class95.method705((byte) -17, var63, var62);
            }
            class209.field3571 = -1;
            return true;
        } else if (class209.field3571 == 69) {
            int var65 = class65.field1288.method339(-16777216);
            class7.method89(var65, -1);
            class158.field2857[class272.method1817(class230.field3936++, 31)] = class272.method1817(var65, 32767);
            class209.field3571 = -1;
            return true;
        } else if (class209.field3571 == 9) {
            int var66 = class65.field1288.method314(-754926392);
            int var67 = class65.field1288.method339(-16777216);
            int var68 = class65.field1288.method300(128);
            int var69 = class65.field1288.method340(26964);
            int var70 = class65.field1288.method300(128);
            if (class54.method476(54, var68)) {
                class139.method957(var67, var70, var66, var69, 11142);
            }
            class209.field3571 = -1;
            return true;
        } else if (class209.field3571 == 44) {
            class27.field495 = class65.field1288.method295(14179);
            class237.field4150 = class65.field1288.method343((byte) 103);
            while (class120.field2130 > class65.field1288.field647) {
                class209.field3571 = class65.field1288.method316((byte) -38);
                class175.method1213((byte) 90);
            }
            class209.field3571 = -1;
            return true;
        } else if (class209.field3571 == 98) {
            int var71 = class65.field1288.method314(-754926392);
            int var72 = class65.field1288.method319((byte) -18);
            int var73 = class65.field1288.method321((byte) -123);
            if (class54.method476(-125, var73)) {
                class190.method1289(var72, (byte) -121, var71);
            }
            class209.field3571 = -1;
            return true;
        } else if (class209.field3571 == 112) {
            class143.method986(true);
            int var74 = class65.field1288.method343((byte) 81);
            int var75 = class65.field1288.method343((byte) 124);
            int var76 = class65.field1288.method322(30880);
            class29.field582[var75] = var76;
            class242.field4251[var75] = var74;
            class177.field3105[var75] = 1;
            for (int var77 = 0; var77 < 98; var77++) {
                if (class96.field1700[var77] <= var76) {
                    class177.field3105[var75] = var77 + 2;
                }
            }
            class254.field4358[class272.method1817(31, class159.field2864++)] = var75;
            class209.field3571 = -1;
            return true;
        } else if (class209.field3571 == 84) {
            int var78 = class65.field1288.method322(30880);
            int var79 = class65.field1288.method339(-16777216);
            int var80 = class65.field1288.method339(-16777216);
            int var81 = class65.field1288.method339(-16777216);
            if ((var78 >> 30) != 0) {
                int var90 = (var78 & 0x35AAF062) >> 28;
                int var91 = (var78 >> 14 & 0x3FFF) - class235.field4087;
                int var92 = (var78 & 0x3FFF) - class27.field494;
                if (var91 >= 0 && var92 >= 0 && var91 < 104 && var92 < 104) {
                    int var93 = var92 * 128 + 64;
                    int var94 = var91 * 128 + 64;
                    class39 var95 = new class39(var79, var90, var94, var93, class23.method216(-39, var93, var94, var90) - var81, var80, class241.field4246);
                    class47.field1017.method675(new class11(var95), (byte) -101);
                }
            } else if ((var78 >> 29) != 0) {
                int var86 = var78 & 0xFFFF;
                class210 var87 = class232.field4022[var86];
                if (var87 != null) {
                    var87.field3680 = 0;
                    var87.field3734 = var79;
                    var87.field3735 = class241.field4246 + var80;
                    if (class241.field4246 < var87.field3735) {
                        var87.field3680 = -1;
                    }
                    var87.field3721 = var81;
                    if (var87.field3734 == 65535) {
                        var87.field3734 = -1;
                    }
                    var87.field3728 = 0;
                    if (var87.field3734 != -1 && class241.field4246 == var87.field3735) {
                        int var88 = class190.method1288(var87.field3734, (byte) 124).field1054;
                        if (var88 != -1) {
                            class256 var89 = class256.method1732(var88, true);
                            if (var89 != null && var89.field4416 != null) {
                                class95.method706(var87.field3700, false, 0, (byte) 123, var87.field3710, var89);
                            }
                        }
                    }
                }
            } else if (var78 >> 28 != 0) {
                int var82 = var78 & 0xFFFF;
                class271 var83;
                if (class272.field4679 == var82) {
                    var83 = class229.field3911;
                } else {
                    var83 = class232.field4025[var82];
                }
                if (var83 != null) {
                    var83.field3721 = var81;
                    var83.field3734 = var79;
                    var83.field3680 = 0;
                    var83.field3728 = 0;
                    if (var83.field3734 == 65535) {
                        var83.field3734 = -1;
                    }
                    var83.field3735 = class241.field4246 + var80;
                    if (class241.field4246 < var83.field3735) {
                        var83.field3680 = -1;
                    }
                    if (var83.field3734 != -1 && class241.field4246 == var83.field3735) {
                        int var84 = class190.method1288(var83.field3734, (byte) 123).field1054;
                        if (var84 != -1) {
                            class256 var85 = class256.method1732(var84, true);
                            if (var85 != null && var85.field4416 != null) {
                                class95.method706(var83.field3700, class229.field3911 == var83, 0, (byte) 101, var83.field3710, var85);
                            }
                        }
                    }
                }
            }
            class209.field3571 = -1;
            return true;
        } else if (class209.field3571 == 129) {
            class8.field120 = class65.field1288.method321((byte) 117) * 30;
            class143.field2594 = class3.field31;
            class209.field3571 = -1;
            return true;
        } else if (class209.field3571 == 202) {
            class237.field4150 = class65.field1288.method316((byte) 118);
            class27.field495 = class65.field1288.method347(255);
            for (int var96 = class237.field4150; var96 < class237.field4150 + 8; var96++) {
                for (int var98 = class27.field495; var98 < class27.field495 + 8; var98++) {
                    if (class32.field674[class274.field4798][var96][var98] != null) {
                        class32.field674[class274.field4798][var96][var98] = null;
                        class169.method1175(63, var98, var96);
                    }
                }
            }
            for (class61 var97 = (class61) class27.field487.method673(false); var97 != null; var97 = (class61) class27.field487.method680(69)) {
                if (class237.field4150 <= var97.field1228 && var97.field1228 < class237.field4150 + 8 && var97.field1226 >= class27.field495 && var97.field1226 < class27.field495 + 8 && class274.field4798 == var97.field1217) {
                    var97.field1231 = 0;
                }
            }
            class209.field3571 = -1;
            return true;
        } else if (class209.field3571 == 245) {
            int var99 = class65.field1288.method340(26964);
            class141 var100 = class70.method572(20043, var99);
            for (int var101 = 0; var101 < var100.field2548.length; var101++) {
                var100.field2548[var101] = -1;
                var100.field2548[var101] = 0;
            }
            class128.method911(var100, -17149);
            class209.field3571 = -1;
            return true;
        } else if (class209.field3571 == 60) {
            class179.field3143 = class120.field2130 / 8;
            for (int var102 = 0; var102 < class179.field3143; var102++) {
                class17.field289[var102] = class65.field1288.method298((byte) 99);
                class78.field1477[var102] = class146.method995(270, class17.field289[var102]);
            }
            class20.field381 = class3.field31;
            class209.field3571 = -1;
            return true;
        } else if (class209.field3571 == 10) {
            int var103 = class65.field1288.method340(26964);
            int var104 = class65.field1288.method321((byte) -106);
            int var105 = class65.field1288.method305(125);
            if (class54.method476(71, var104)) {
                class112.method827(var105, (byte) 114, var103);
            }
            class209.field3571 = -1;
            return true;
        } else if (class209.field3571 == 116) {
            class163.method1146(0);
            class209.field3571 = -1;
            return true;
        } else if (class209.field3571 == 210) {
            long var106 = class65.field1288.method298((byte) 4);
            long var108 = (long) class65.field1288.method339(-16777216);
            long var110 = (long) class65.field1288.method313((byte) -80);
            int var112 = class65.field1288.method316((byte) -122);
            int var113 = class65.field1288.method339(-16777216);
            long var114 = (var108 << 32) + var110;
            boolean var116 = false;
            int var117 = 0;
            label1127: while (true) {
                if (var117 >= 100) {
                    if (var112 <= 1) {
                        for (int var118 = 0; var118 < class179.field3143; var118++) {
                            if (class17.field289[var118] == var106) {
                                var116 = true;
                                break label1127;
                            }
                        }
                    }
                    break;
                }
                if (class127.field2230[var117] == var114) {
                    var116 = true;
                    break;
                }
                var117++;
            }
            if (!var116 && class94.field1672 == 0) {
                class127.field2230[class155.field2745] = var114;
                class155.field2745 = (class155.field2745 + 1) % 100;
                class237 var119 = class14.method127(var113, -100).method1565((byte) -105, class65.field1288);
                if (var112 == 2) {
                    class220.method1467(var119, class238.method1626(new class237[] { class6.field58, class146.method995(270, var106).method1581((byte) -125) }, -102), 1, var113, (class237) null, 18);
                } else if (var112 == 1) {
                    class220.method1467(var119, class238.method1626(new class237[] { class148.field2627, class146.method995(270, var106).method1581((byte) -95) }, -50), 1, var113, (class237) null, 18);
                } else {
                    class220.method1467(var119, class146.method995(270, var106).method1581((byte) -110), 1, var113, (class237) null, 18);
                }
            }
            class209.field3571 = -1;
            return true;
        } else if (class209.field3571 == 168) {
            int var120 = class65.field1288.method339(-16777216);
            int var121 = class65.field1288.method321((byte) -92);
            class12.field210 = var121;
            class257.field4417 = var120;
            class189.method1285((byte) -114);
            class209.field3571 = -1;
            return true;
        } else if (class209.field3571 == 213) {
            long var122 = class65.field1288.method298((byte) -116);
            int var124 = class65.field1288.method339(-16777216);
            int var125 = class65.field1288.method316((byte) 101);
            class237 var126 = class239.field4202;
            if (var124 > 0) {
                var126 = class65.field1288.method324(1);
            }
            boolean var127 = true;
            if (var122 < 0L) {
                var122 &= Long.MAX_VALUE;
                var127 = false;
            }
            class237 var128 = class146.method995(270, var122).method1581((byte) -91);
            for (int var129 = 0; var129 < class221.field3810; var129++) {
                if (class144.field2601[var129] == var122) {
                    if (class71.field1399[var129] != var124) {
                        class71.field1399[var129] = var124;
                        if (var124 > 0) {
                            class175.method1212(class238.method1626(new class237[] { var128, class208.field3546 }, -70), class239.field4202, (byte) 118, 5);
                        }
                        if (var124 == 0) {
                            class175.method1212(class238.method1626(new class237[] { var128, class101.field1795 }, -12), class239.field4202, (byte) 102, 5);
                        }
                    }
                    var128 = null;
                    class13.field213[var129] = var126;
                    class195.field3402[var129] = var125;
                    class180.field3163[var129] = var127;
                    break;
                }
            }
            if (var128 != null && class221.field3810 < 200) {
                class144.field2601[class221.field3810] = var122;
                class152.field2694[class221.field3810] = var128;
                class71.field1399[class221.field3810] = var124;
                class13.field213[class221.field3810] = var126;
                class195.field3402[class221.field3810] = var125;
                class180.field3163[class221.field3810] = var127;
                class221.field3810++;
            }
            int var130 = class221.field3810;
            class20.field381 = class3.field31;
            boolean var131 = false;
            while (var130 > 0) {
                boolean var132 = true;
                var130--;
                for (int var133 = 0; var133 < var130; var133++) {
                    if (class71.field1399[var133] != class126.field2205 && class71.field1399[var133 + 1] == class126.field2205 || class71.field1399[var133] == 0 && class71.field1399[var133 + 1] != 0) {
                        var132 = false;
                        int var134 = class71.field1399[var133];
                        class71.field1399[var133] = class71.field1399[var133 + 1];
                        class71.field1399[var133 + 1] = var134;
                        class237 var135 = class13.field213[var133];
                        class13.field213[var133] = class13.field213[var133 + 1];
                        class13.field213[var133 + 1] = var135;
                        class237 var136 = class152.field2694[var133];
                        class152.field2694[var133] = class152.field2694[var133 + 1];
                        class152.field2694[var133 + 1] = var136;
                        long var137 = class144.field2601[var133];
                        class144.field2601[var133] = class144.field2601[var133 + 1];
                        class144.field2601[var133 + 1] = var137;
                        int var139 = class195.field3402[var133];
                        class195.field3402[var133] = class195.field3402[var133 + 1];
                        class195.field3402[var133 + 1] = var139;
                        boolean var140 = class180.field3163[var133];
                        class180.field3163[var133] = class180.field3163[var133 + 1];
                        class180.field3163[var133 + 1] = var140;
                    }
                }
                if (var132) {
                    break;
                }
            }
            class209.field3571 = -1;
            return true;
        } else if (class209.field3571 == 154) {
            int var141 = class65.field1288.method316((byte) 103);
            class71 var142 = new class71();
            int var143 = var141 >> 6;
            var142.field1397 = var141 & 0x3F;
            var142.field1388 = class65.field1288.method316((byte) 110);
            if (var142.field1388 >= 0 && var142.field1388 < class164.field2925.length) {
                if (var142.field1397 == 1 || var142.field1397 == 10) {
                    var142.field1391 = class65.field1288.method339(-16777216);
                    class65.field1288.field647 += 3;
                } else if (var142.field1397 >= 2 && var142.field1397 <= 6) {
                    if (var142.field1397 == 2) {
                        var142.field1390 = 64;
                        var142.field1394 = 64;
                    }
                    if (var142.field1397 == 3) {
                        var142.field1394 = 64;
                        var142.field1390 = 0;
                    }
                    if (var142.field1397 == 4) {
                        var142.field1394 = 64;
                        var142.field1390 = 128;
                    }
                    if (var142.field1397 == 5) {
                        var142.field1390 = 64;
                        var142.field1394 = 0;
                    }
                    if (var142.field1397 == 6) {
                        var142.field1394 = 128;
                        var142.field1390 = 64;
                    }
                    var142.field1397 = 2;
                    var142.field1400 = class65.field1288.method339(-16777216);
                    var142.field1387 = class65.field1288.method339(-16777216);
                    var142.field1395 = class65.field1288.method316((byte) -127);
                }
                var142.field1393 = class65.field1288.method339(-16777216);
                if (var142.field1393 == 65535) {
                    var142.field1393 = -1;
                }
                class144.field2599[var143] = var142;
            }
            class209.field3571 = -1;
            return true;
        } else if (class209.field3571 == 155) {
            class57.method500(7079);
            class209.field3571 = -1;
            return true;
        } else if (class209.field3571 == 29) {
            class210.method1409(class268.field4572, class65.field1288, true, class120.field2130);
            class209.field3571 = -1;
            return true;
        } else {
            int var144 = 9 % ((64 - arg0) / 46);
            if (class209.field3571 == 169) {
                class167.field2960 = class3.field31;
                long var145 = class65.field1288.method298((byte) -112);
                if (var145 == 0L) {
                    class113.field1971 = null;
                    class209.field3571 = -1;
                    class190.field3302 = null;
                    class25.field452 = null;
                    class260.field4464 = 0;
                    return true;
                }
                long var147 = class65.field1288.method298((byte) -102);
                class190.field3302 = class146.method995(270, var147);
                class25.field452 = class146.method995(270, var145);
                class252.field4338 = class65.field1288.method325(-105);
                int var149 = class65.field1288.method316((byte) -68);
                if (var149 == 255) {
                    class209.field3571 = -1;
                    return true;
                }
                class196[] var150 = new class196[100];
                class260.field4464 = var149;
                for (int var151 = 0; var151 < class260.field4464; var151++) {
                    var150[var151] = new class196();
                    var150[var151].field1530 = class65.field1288.method298((byte) 97);
                    var150[var151].field3405 = class146.method995(270, var150[var151].field1530);
                    var150[var151].field3414 = class65.field1288.method339(-16777216);
                    var150[var151].field3417 = class65.field1288.method325(-123);
                    var150[var151].field3407 = class65.field1288.method324(1);
                    if (class62.field1254 == var150[var151].field1530) {
                        class65.field1295 = var150[var151].field3417;
                    }
                }
                boolean var152 = false;
                int var153 = class260.field4464;
                while (var153 > 0) {
                    boolean var154 = true;
                    var153--;
                    for (int var155 = 0; var155 < var153; var155++) {
                        if (var150[var155].field3405.method1577(var150[var155 + 1].field3405, (byte) 41) > 0) {
                            var154 = false;
                            class196 var156 = var150[var155];
                            var150[var155] = var150[var155 + 1];
                            var150[var155 + 1] = var156;
                        }
                    }
                    if (var154) {
                        break;
                    }
                }
                class209.field3571 = -1;
                class113.field1971 = var150;
                return true;
            } else if (class209.field3571 == 33) {
                int var157 = class65.field1288.method340(26964);
                int var158 = class65.field1288.method314(-754926392);
                int var159 = class65.field1288.method339(-16777216);
                if (class54.method476(37, var159)) {
                    class230.method1522(var157, false, var158);
                }
                class209.field3571 = -1;
                return true;
            } else if (class209.field3571 == 138) {
                class143.method986(true);
                class25.field463 = class65.field1288.method316((byte) 115);
                class143.field2594 = class3.field31;
                class209.field3571 = -1;
                return true;
            } else if (class209.field3571 == 146) {
                byte[] var160 = new byte[class120.field2130];
                class65.field1288.method367(0, 0, class120.field2130, var160);
                class237 var161 = class97.method723(0, class120.field2130, (byte) -104, var160);
                if (class43.field946 == null && class67.field1311 == 3 || !class67.field1320.startsWith("win") || class126.field2204) {
                    class146.method997(var161, true, false);
                } else {
                    class28.field545 = var161;
                    class39.field882 = true;
                    class234.field4066 = class268.field4572.method553(new String(var161.method1578(-31321), "ISO-8859-1"), 45);
                }
                class209.field3571 = -1;
                return true;
            } else if (class209.field3571 == 206) {
                for (int var162 = 0; var162 < class232.field4025.length; var162++) {
                    if (class232.field4025[var162] != null) {
                        class232.field4025[var162].field3722 = -1;
                    }
                }
                for (int var163 = 0; var163 < class232.field4022.length; var163++) {
                    if (class232.field4022[var163] != null) {
                        class232.field4022[var163].field3722 = -1;
                    }
                }
                class209.field3571 = -1;
                return true;
            } else if (class209.field3571 == 15) {
                long var164 = class65.field1288.method298((byte) 119);
                boolean var166 = false;
                if ((Long.MIN_VALUE & var164) != 0L) {
                    var166 = true;
                }
                int var167 = class65.field1288.method339(-16777216);
                byte var168 = class65.field1288.method325(-100);
                if (var166) {
                    if (class260.field4464 == 0) {
                        class209.field3571 = -1;
                        return true;
                    }
                    long var174 = var164 & Long.MAX_VALUE;
                    boolean var176 = false;
                    int var177;
                    for (var177 = 0; var177 < class260.field4464 && (class113.field1971[var177].field1530 != var174 || class113.field1971[var177].field3414 != var167); var177++) {
                    }
                    if (var177 < class260.field4464) {
                        while (class260.field4464 - 1 > var177) {
                            class113.field1971[var177] = class113.field1971[var177 + 1];
                            var177++;
                        }
                        class260.field4464--;
                        class113.field1971[class260.field4464] = null;
                    }
                } else {
                    class237 var169 = class65.field1288.method324(1);
                    class196 var170 = new class196();
                    var170.field1530 = var164;
                    var170.field3405 = class146.method995(270, var170.field1530);
                    var170.field3414 = var167;
                    var170.field3407 = var169;
                    var170.field3417 = var168;
                    int var171;
                    for (var171 = class260.field4464 - 1; var171 >= 0; var171--) {
                        int var172 = class113.field1971[var171].field3405.method1577(var170.field3405, (byte) 117);
                        if (var172 == 0) {
                            class113.field1971[var171].field3414 = var167;
                            class113.field1971[var171].field3417 = var168;
                            class113.field1971[var171].field3407 = var169;
                            class209.field3571 = -1;
                            if (class62.field1254 == var164) {
                                class65.field1295 = var168;
                            }
                            class167.field2960 = class3.field31;
                            return true;
                        }
                        if (var172 < 0) {
                            break;
                        }
                    }
                    if (class113.field1971.length <= class260.field4464) {
                        class209.field3571 = -1;
                        return true;
                    }
                    for (int var173 = class260.field4464 - 1; var173 > var171; var173--) {
                        class113.field1971[var173 + 1] = class113.field1971[var173];
                    }
                    if (class260.field4464 == 0) {
                        class113.field1971 = new class196[100];
                    }
                    class113.field1971[var171 + 1] = var170;
                    if (class62.field1254 == var164) {
                        class65.field1295 = var168;
                    }
                    class260.field4464++;
                }
                class167.field2960 = class3.field31;
                class209.field3571 = -1;
                return true;
            } else if (class209.field3571 == 195) {
                int var178 = class65.field1288.method322(30880);
                int var179 = class65.field1288.method321((byte) -93);
                int var180 = class65.field1288.method314(-754926392);
                if (var179 == 65535) {
                    var179 = -1;
                }
                if (class54.method476(-126, var180)) {
                    class216.method1455(var178, var179, 4, 1);
                }
                class209.field3571 = -1;
                return true;
            } else if (class209.field3571 == 56) {
                int var181 = class65.field1288.method314(-754926392);
                int var182 = class65.field1288.method302(0);
                int var183 = class65.field1288.method326(true);
                int var184 = class65.field1288.method302(0);
                if (class54.method476(-119, var181)) {
                    class76.method590((byte) 53, var182, var183, var184);
                }
                class209.field3571 = -1;
                return true;
            } else if (class209.field3571 == 253) {
                class91.method690(-17638);
                class209.field3571 = -1;
                return true;
            } else if (class209.field3571 == 235) {
                int var185 = class65.field1288.method316((byte) 122);
                int var186 = class65.field1288.method316((byte) 110);
                int var187 = class65.field1288.method316((byte) -103);
                int var188 = class65.field1288.method316((byte) 99);
                int var189 = class65.field1288.method339(-16777216);
                class185.field3241[var185] = true;
                class24.field434[var185] = var186;
                class139.field2400[var185] = var187;
                class275.field4819[var185] = var188;
                class269.field4594[var185] = var189;
                class209.field3571 = -1;
                return true;
            } else if (class209.field3571 == 22) {
                int var190 = class65.field1288.method326(true);
                int var191 = class65.field1288.method321((byte) 62);
                int var192 = class65.field1288.method295(14179);
                int var193 = class65.field1288.method314(-754926392);
                if (class54.method476(100, var193)) {
                    class58 var194 = (class58) class164.field2915.method568((long) var190, -1);
                    if (var194 != null) {
                        class210.method1405(19337, var194, var194.field1191 != var191);
                    }
                    class68.method557(var190, var192, 77, var191);
                }
                class209.field3571 = -1;
                return true;
            } else if (class209.field3571 == 85) {
                class54.method481(26654, true);
                class209.field3571 = -1;
                return true;
            } else if (class209.field3571 == 95) {
                int var195 = class65.field1288.method316((byte) 126);
                int var196 = class65.field1288.method316((byte) 98);
                int var197 = class65.field1288.method339(-16777216);
                int var198 = class65.field1288.method316((byte) -63);
                int var199 = class65.field1288.method316((byte) -69);
                class220.method1465(var196, var195, -88, var199, var197, var198);
                class209.field3571 = -1;
                return true;
            } else if (class209.field3571 == 227) {
                class166.field2936 = class65.field1288.method316((byte) -117);
                class224.field3865 = class65.field1288.method316((byte) -75);
                class186.field3263 = class65.field1288.method316((byte) -29);
                class209.field3571 = -1;
                return true;
            } else if (class209.field3571 == 140) {
                int var200 = class65.field1288.method319((byte) -18);
                int var201 = class65.field1288.method339(-16777216);
                if (var200 < -70000) {
                    var201 += 32768;
                }
                class141 var202;
                if (var200 >= 0) {
                    var202 = class70.method572(20043, var200);
                } else {
                    var202 = null;
                }
                if (var202 != null) {
                    for (int var203 = 0; var203 < var202.field2548.length; var203++) {
                        var202.field2548[var203] = 0;
                        var202.field2540[var203] = 0;
                    }
                }
                class120.method868(18188, var201);
                int var204 = class65.field1288.method339(-16777216);
                for (int var205 = 0; var205 < var204; var205++) {
                    int var206 = class65.field1288.method347(255);
                    if (var206 == 255) {
                        var206 = class65.field1288.method340(26964);
                    }
                    int var207 = class65.field1288.method321((byte) 124);
                    if (var202 != null && var202.field2548.length > var205) {
                        var202.field2548[var205] = var207;
                        var202.field2540[var205] = var206;
                    }
                    class112.method828(var205, var207 - 1, -76, var201, var206);
                }
                if (var202 != null) {
                    class128.method911(var202, -17149);
                }
                class143.method986(true);
                class158.field2857[class272.method1817(31, class230.field3936++)] = class272.method1817(32767, var201);
                class209.field3571 = -1;
                return true;
            } else if (class209.field3571 == 66) {
                int var208 = class65.field1288.method339(-16777216);
                int var209 = class65.field1288.method319((byte) -18);
                int var210 = class65.field1288.method300(128);
                int var211 = class65.field1288.method314(-754926392);
                if (class54.method476(90, var208)) {
                    class213.method1424(true, (var211 << 16) + var210, var209);
                }
                class209.field3571 = -1;
                return true;
            } else if (class209.field3571 == 17) {
                int var212 = class65.field1288.method339(-16777216);
                class237 var213 = class65.field1288.method324(1);
                Object[] var214 = new Object[var213.method1588(false) + 1];
                for (int var215 = var213.method1588(false) - 1; var215 >= 0; var215--) {
                    if (var213.method1607((byte) -91, var215) == 115) {
                        var214[var215 + 1] = class65.field1288.method324(1);
                    } else {
                        var214[var215 + 1] = Integer.valueOf(class65.field1288.method319((byte) -18));
                    }
                }
                var214[0] = Integer.valueOf(class65.field1288.method319((byte) -18));
                if (class54.method476(9, var212)) {
                    class117 var216 = new class117();
                    var216.field2053 = var214;
                    class229.method1519(-114, var216);
                }
                class209.field3571 = -1;
                return true;
            } else if (class209.field3571 == 23) {
                class143.method986(true);
                class81.field1532 = class65.field1288.method309(-489706920);
                class209.field3571 = -1;
                class143.field2594 = class3.field31;
                return true;
            } else if (class209.field3571 == 125) {
                int var217 = class65.field1288.method339(-16777216);
                int var218 = class65.field1288.method319((byte) -18);
                if (class54.method476(68, var217)) {
                    class58 var219 = (class58) class164.field2915.method568((long) var218, -1);
                    if (var219 != null) {
                        class210.method1405(19337, var219, true);
                    }
                    if (class83.field1552 != null) {
                        class128.method911(class83.field1552, -17149);
                        class83.field1552 = null;
                    }
                }
                class209.field3571 = -1;
                return true;
            } else if (class209.field3571 == 128) {
                int var220 = class65.field1288.method300(128);
                int var221 = class65.field1288.method322(30880);
                class57.method502(-112, var220, var221);
                class209.field3571 = -1;
                return true;
            } else if (class209.field3571 == 67) {
                int var222 = class65.field1288.method321((byte) -119);
                int var223 = class65.field1288.method319((byte) -18);
                class237 var224 = class65.field1288.method324(1);
                if (class54.method476(-114, var222)) {
                    class252.method1710(var223, 26205, var224);
                }
                class209.field3571 = -1;
                return true;
            } else if (class209.field3571 == 183) {
                int var225 = class65.field1288.method321((byte) 77);
                class237 var226 = class65.field1288.method324(1);
                int var227 = class65.field1288.method321((byte) 126);
                if (class54.method476(85, var225)) {
                    class184.method1257(-119, var226, var227);
                }
                class209.field3571 = -1;
                return true;
            } else if (class209.field3571 == 211) {
                int var228 = class65.field1288.method314(-754926392);
                int var229 = class65.field1288.method314(-754926392);
                class237 var230 = class65.field1288.method324(1);
                if (class54.method476(-107, var229)) {
                    class184.method1257(-71, var230, var228);
                }
                class209.field3571 = -1;
                return true;
            } else if (class209.field3571 == 163) {
                int var231 = class65.field1288.method319((byte) -18);
                int var232 = class65.field1288.method339(-16777216);
                if (var231 < -70000) {
                    var232 += 32768;
                }
                class141 var233;
                if (var231 < 0) {
                    var233 = null;
                } else {
                    var233 = class70.method572(20043, var231);
                }
                while (class65.field1288.field647 < class120.field2130) {
                    int var234 = class65.field1288.method303(-105);
                    int var235 = class65.field1288.method339(-16777216);
                    int var236 = 0;
                    if (var235 != 0) {
                        var236 = class65.field1288.method316((byte) -52);
                        if (var236 == 255) {
                            var236 = class65.field1288.method319((byte) -18);
                        }
                    }
                    if (var233 != null && var234 >= 0 && var234 < var233.field2548.length) {
                        var233.field2548[var234] = var235;
                        var233.field2540[var234] = var236;
                    }
                    class112.method828(var234, var235 - 1, 79, var232, var236);
                }
                if (var233 != null) {
                    class128.method911(var233, -17149);
                }
                class143.method986(true);
                class158.field2857[class272.method1817(31, class230.field3936++)] = class272.method1817(var232, 32767);
                class209.field3571 = -1;
                return true;
            } else if (class209.field3571 == 61) {
                int var237 = class65.field1288.method316((byte) 105);
                if (class65.field1288.method316((byte) -109) == 0) {
                    class191.field3321[var237] = new class52();
                } else {
                    class65.field1288.field647--;
                    class191.field3321[var237] = new class52(class65.field1288);
                }
                class209.field3571 = -1;
                class221.field3804 = class3.field31;
                return true;
            } else if (class209.field3571 == 224) {
                int var238 = class65.field1288.method326(true);
                class208.field3545 = class268.field4572.method546(var238, 3);
                class209.field3571 = -1;
                return true;
            } else if (class209.field3571 == 93) {
                class237 var239 = class65.field1288.method324(1);
                if (var239.method1583(class151.field2687, (byte) -124)) {
                    class237 var275 = var239.method1620(63, var239.method1604((byte) 49, class170.field2978), 0);
                    long var276 = var275.method1616(0);
                    boolean var278 = false;
                    for (int var279 = 0; var279 < class179.field3143; var279++) {
                        if (class17.field289[var279] == var276) {
                            var278 = true;
                            break;
                        }
                    }
                    if (!var278 && class94.field1672 == 0) {
                        class175.method1212(class129.field2261, var275, (byte) 104, 4);
                    }
                } else if (var239.method1583(class244.field4282, (byte) -125)) {
                    boolean var269 = false;
                    class237 var270 = var239.method1620(96, var239.method1604((byte) 77, class170.field2978), 0);
                    long var271 = var270.method1616(0);
                    for (int var273 = 0; var273 < class179.field3143; var273++) {
                        if (class17.field289[var273] == var271) {
                            var269 = true;
                            break;
                        }
                    }
                    if (!var269 && class94.field1672 == 0) {
                        class237 var274 = var239.method1620(105, var239.method1588(false) - 9, var239.method1604((byte) 17, class170.field2978) + 1);
                        class175.method1212(var274, var270, (byte) 103, 8);
                    }
                } else if (var239.method1583(class104.field1838, (byte) -119)) {
                    boolean var264 = false;
                    class237 var265 = var239.method1620(78, var239.method1604((byte) 101, class170.field2978), 0);
                    long var266 = var265.method1616(0);
                    for (int var268 = 0; var268 < class179.field3143; var268++) {
                        if (class17.field289[var268] == var266) {
                            var264 = true;
                            break;
                        }
                    }
                    if (!var264 && class94.field1672 == 0) {
                        class175.method1212(class239.field4202, var265, (byte) 104, 10);
                    }
                } else if (var239.method1583(class274.field4756, (byte) -119)) {
                    class237 var240 = var239.method1620(72, var239.method1604((byte) 62, class274.field4756), 0);
                    class175.method1212(var240, class239.field4202, (byte) 115, 11);
                } else if (var239.method1583(class185.field3245, (byte) -116)) {
                    class237 var241 = var239.method1620(113, var239.method1604((byte) 113, class185.field3245), 0);
                    if (class94.field1672 == 0) {
                        class175.method1212(var241, class239.field4202, (byte) 116, 12);
                    }
                } else if (var239.method1583(class45.field985, (byte) -123)) {
                    class237 var263 = var239.method1620(67, var239.method1604((byte) 55, class45.field985), 0);
                    if (class94.field1672 == 0) {
                        class175.method1212(var263, class239.field4202, (byte) 118, 13);
                    }
                } else if (var239.method1583(class34.field731, (byte) -123)) {
                    class237 var258 = var239.method1620(116, var239.method1604((byte) 69, class170.field2978), 0);
                    long var259 = var258.method1616(0);
                    boolean var261 = false;
                    for (int var262 = 0; var262 < class179.field3143; var262++) {
                        if (class17.field289[var262] == var259) {
                            var261 = true;
                            break;
                        }
                    }
                    if (!var261 && class94.field1672 == 0) {
                        class175.method1212(class239.field4202, var258, (byte) 110, 14);
                    }
                } else if (var239.method1583(class20.field384, (byte) -121)) {
                    class237 var242 = var239.method1620(96, var239.method1604((byte) 51, class170.field2978), 0);
                    boolean var243 = false;
                    long var244 = var242.method1616(0);
                    for (int var246 = 0; var246 < class179.field3143; var246++) {
                        if (class17.field289[var246] == var244) {
                            var243 = true;
                            break;
                        }
                    }
                    if (!var243 && class94.field1672 == 0) {
                        class175.method1212(class239.field4202, var242, (byte) 123, 15);
                    }
                } else if (var239.method1583(class96.field1711, (byte) -123)) {
                    class237 var247 = var239.method1620(91, var239.method1604((byte) 124, class170.field2978), 0);
                    boolean var248 = false;
                    long var249 = var247.method1616(0);
                    for (int var251 = 0; var251 < class179.field3143; var251++) {
                        if (class17.field289[var251] == var249) {
                            var248 = true;
                            break;
                        }
                    }
                    if (!var248 && class94.field1672 == 0) {
                        class175.method1212(class239.field4202, var247, (byte) 106, 16);
                    }
                } else if (var239.method1583(class264.field4508, (byte) -122)) {
                    class237 var252 = var239.method1620(80, var239.method1604((byte) 38, class170.field2978), 0);
                    boolean var253 = false;
                    long var254 = var252.method1616(0);
                    for (int var256 = 0; var256 < class179.field3143; var256++) {
                        if (class17.field289[var256] == var254) {
                            var253 = true;
                            break;
                        }
                    }
                    if (!var253 && class94.field1672 == 0) {
                        class237 var257 = var239.method1620(86, var239.method1588(false) - 9, var239.method1604((byte) 73, class170.field2978) - -1);
                        class175.method1212(var257, var252, (byte) 126, 21);
                    }
                } else {
                    class175.method1212(var239, class239.field4202, (byte) 127, 0);
                }
                class209.field3571 = -1;
                return true;
            } else if (class209.field3571 == 193) {
                class54.method481(26654, false);
                class209.field3571 = -1;
                return true;
            } else if (class209.field3571 == 26) {
                int var280 = class65.field1288.method347(255);
                int var281 = class65.field1288.method321((byte) -90);
                int var282 = class65.field1288.method339(-16777216);
                if (class54.method476(-106, var281)) {
                    if (var280 == 2) {
                        class78.method597((byte) 92);
                    }
                    class84.field1573 = var282;
                    class102.method773(0, var282);
                    class101.method769((byte) -101, false);
                    class15.method136(class84.field1573, 127);
                    for (int var283 = 0; var283 < 100; var283++) {
                        class166.field2941[var283] = true;
                    }
                }
                class209.field3571 = -1;
                return true;
            } else if (class209.field3571 == 11) {
                long var284 = class65.field1288.method298((byte) 78);
                class65.field1288.method325(-122);
                long var286 = class65.field1288.method298((byte) 73);
                long var288 = (long) class65.field1288.method339(-16777216);
                long var290 = (long) class65.field1288.method313((byte) -80);
                int var292 = class65.field1288.method316((byte) -72);
                boolean var293 = false;
                long var294 = (var288 << 32) + var290;
                int var296 = class65.field1288.method339(-16777216);
                int var297 = 0;
                label1346: while (true) {
                    if (var297 >= 100) {
                        if (var292 <= 1) {
                            for (int var298 = 0; var298 < class179.field3143; var298++) {
                                if (class17.field289[var298] == var284) {
                                    var293 = true;
                                    break label1346;
                                }
                            }
                        }
                        break;
                    }
                    if (class127.field2230[var297] == var294) {
                        var293 = true;
                        break;
                    }
                    var297++;
                }
                if (!var293 && class94.field1672 == 0) {
                    class127.field2230[class155.field2745] = var294;
                    class155.field2745 = (class155.field2745 + 1) % 100;
                    class237 var299 = class14.method127(var296, -84).method1565((byte) -105, class65.field1288);
                    if (var292 == 2 || var292 == 3) {
                        class220.method1467(var299, class238.method1626(new class237[] { class6.field58, class146.method995(270, var284).method1581((byte) -117) }, -85), 1, var296, class146.method995(270, var286).method1581((byte) -122), 20);
                    } else if (var292 == 1) {
                        class220.method1467(var299, class238.method1626(new class237[] { class148.field2627, class146.method995(270, var284).method1581((byte) -114) }, -83), 1, var296, class146.method995(270, var286).method1581((byte) -90), 20);
                    } else {
                        class220.method1467(var299, class146.method995(270, var284).method1581((byte) -118), 1, var296, class146.method995(270, var286).method1581((byte) -120), 20);
                    }
                }
                class209.field3571 = -1;
                return true;
            } else if (class209.field3571 == 80) {
                int var300 = class65.field1288.method314(-754926392);
                int var301 = class65.field1288.method326(true);
                class223.method1480(var300, -8, var301);
                class209.field3571 = -1;
                return true;
            } else if (class209.field3571 == 177) {
                int var302 = class65.field1288.method321((byte) -125);
                int var303 = class65.field1288.method340(26964);
                if (class54.method476(57, var302)) {
                    int var304 = 0;
                    if (class229.field3911.field4645 != null) {
                        var304 = class229.field3911.field4645.method275(0);
                    }
                    class216.method1455(var303, var304, 4, 3);
                }
                class209.field3571 = -1;
                return true;
            } else if (class209.field3571 == 218) {
                class38.field844 = class65.field1288.method316((byte) -4);
                class209.field3571 = -1;
                class20.field381 = class3.field31;
                return true;
            } else if (class209.field3571 == 101) {
                int var305 = class65.field1288.method316((byte) 122);
                int var306 = class65.field1288.method321((byte) 71);
                int var307 = class65.field1288.method321((byte) 112);
                if (class54.method476(41, var306)) {
                    class95.method705((byte) -17, var307, var305);
                }
                class209.field3571 = -1;
                return true;
            } else if (class209.field3571 == 158) {
                long var308 = class65.field1288.method298((byte) -3);
                class65.field1288.method325(-114);
                long var310 = class65.field1288.method298((byte) -127);
                long var312 = (long) class65.field1288.method339(-16777216);
                long var314 = (long) class65.field1288.method313((byte) -80);
                int var316 = class65.field1288.method316((byte) -102);
                long var317 = (var312 << 32) + var314;
                boolean var319 = false;
                int var320 = 0;
                label1375: while (true) {
                    if (var320 >= 100) {
                        if (var316 <= 1) {
                            if (class239.field4184 == 1 || class53.field1113 == 1) {
                                var319 = true;
                            } else {
                                for (int var321 = 0; var321 < class179.field3143; var321++) {
                                    if (class17.field289[var321] == var308) {
                                        var319 = true;
                                        break label1375;
                                    }
                                }
                            }
                        }
                        break;
                    }
                    if (class127.field2230[var320] == var317) {
                        var319 = true;
                        break;
                    }
                    var320++;
                }
                if (!var319 && class94.field1672 == 0) {
                    class127.field2230[class155.field2745] = var317;
                    class155.field2745 = (class155.field2745 + 1) % 100;
                    class237 var322 = class194.method1344(class11.method116(class65.field1288, -107).method1615(112));
                    if (var316 == 2 || var316 == 3) {
                        class39.method399(9, class146.method995(270, var310).method1581((byte) -128), class238.method1626(new class237[] { class6.field58, class146.method995(270, var308).method1581((byte) -96) }, -38), var322, 52);
                    } else if (var316 == 1) {
                        class39.method399(9, class146.method995(270, var310).method1581((byte) -128), class238.method1626(new class237[] { class148.field2627, class146.method995(270, var308).method1581((byte) -94) }, -12), var322, -126);
                    } else {
                        class39.method399(9, class146.method995(270, var310).method1581((byte) -111), class146.method995(270, var308).method1581((byte) -113), var322, 85);
                    }
                }
                class209.field3571 = -1;
                return true;
            } else if (class209.field3571 == 73) {
                if (class120.field2130 == 0) {
                    class45.field976 = class41.field929;
                } else {
                    class45.field976 = class65.field1288.method324(1);
                }
                class209.field3571 = -1;
                return true;
            } else if (class209.field3571 == 6) {
                int var323 = class65.field1288.method316((byte) -123);
                int var324 = class65.field1288.method316((byte) -74);
                int var325 = class65.field1288.method343((byte) 56);
                class274.field4798 = var325 >> 1;
                class229.field3911.method1803(0, var324, var323, (var325 & 0x1) == 1);
                class209.field3571 = -1;
                return true;
            } else if (class209.field3571 == 14) {
                int var326 = class65.field1288.method326(true);
                int var327 = class65.field1288.method339(-16777216);
                int var328 = class65.field1288.method322(30880);
                int var329 = class65.field1288.method300(128);
                if (var329 == 65535) {
                    var329 = -1;
                }
                if (class54.method476(-119, var327)) {
                    class141 var330 = class70.method572(20043, var328);
                    if (var330.field2536) {
                        class155.method1067((byte) -8, var328, var329, var326);
                        class8 var332 = class112.method829((byte) -82, var329);
                        class139.method957(var332.field122, var332.field143, var332.field151, var328, 11142);
                        class160.method1130((byte) 93, var332.field109, var332.field137, var332.field130, var328);
                    } else if (var329 == -1) {
                        class209.field3571 = -1;
                        var330.field2544 = 0;
                        return true;
                    } else {
                        class8 var331 = class112.method829((byte) -82, var329);
                        var330.field2521 = var331.field151 * 100 / var326;
                        var330.field2456 = var329;
                        var330.field2544 = 4;
                        var330.field2447 = var331.field143;
                        var330.field2531 = var331.field122;
                        class128.method911(var330, -17149);
                    }
                }
                class209.field3571 = -1;
                return true;
            } else if (class209.field3571 == 36) {
                long var333 = class65.field1288.method298((byte) 90);
                boolean var335 = false;
                long var336 = (long) class65.field1288.method339(-16777216);
                long var338 = (long) class65.field1288.method313((byte) -80);
                long var340 = (var336 << 32) + var338;
                int var342 = class65.field1288.method316((byte) 102);
                int var343 = 0;
                label1512: while (true) {
                    if (var343 >= 100) {
                        if (var342 <= 1) {
                            if (class239.field4184 == 1 || class53.field1113 == 1) {
                                var335 = true;
                            } else {
                                for (int var344 = 0; var344 < class179.field3143; var344++) {
                                    if (class17.field289[var344] == var333) {
                                        var335 = true;
                                        break label1512;
                                    }
                                }
                            }
                        }
                        break;
                    }
                    if (class127.field2230[var343] == var340) {
                        var335 = true;
                        break;
                    }
                    var343++;
                }
                if (!var335 && class94.field1672 == 0) {
                    class127.field2230[class155.field2745] = var340;
                    class155.field2745 = (class155.field2745 + 1) % 100;
                    class237 var345 = class194.method1344(class11.method116(class65.field1288, -108).method1615(115));
                    if (var342 == 2 || var342 == 3) {
                        class175.method1212(var345, class238.method1626(new class237[] { class6.field58, class146.method995(270, var333).method1581((byte) -91) }, -48), (byte) 122, 7);
                    } else if (var342 == 1) {
                        class175.method1212(var345, class238.method1626(new class237[] { class148.field2627, class146.method995(270, var333).method1581((byte) -118) }, -37), (byte) 107, 7);
                    } else {
                        class175.method1212(var345, class146.method995(270, var333).method1581((byte) -100), (byte) 125, 3);
                    }
                }
                class209.field3571 = -1;
                return true;
            } else if (class209.field3571 == 239) {
                int var346 = class65.field1288.method300(128);
                int var347 = class65.field1288.method340(26964);
                int var348 = class65.field1288.method300(128);
                if (var346 == 65535) {
                    var346 = -1;
                }
                if (class54.method476(6, var348)) {
                    class216.method1455(var347, var346, 4, 2);
                }
                class209.field3571 = -1;
                return true;
            } else if (class209.field3571 == 82) {
                int var349 = class65.field1288.method339(-16777216);
                int var350 = class65.field1288.method321((byte) -89);
                int var351 = class65.field1288.method314(-754926392);
                int var352 = class65.field1288.method319((byte) -18);
                if (class54.method476(18, var350)) {
                    class216.method1455(var352, var349 | var351 << 16, 4, 7);
                }
                class209.field3571 = -1;
                return true;
            } else if (class209.field3571 == 229 || class209.field3571 == 254 || class209.field3571 == 133 || class209.field3571 == 243 || class209.field3571 == 0 || class209.field3571 == 179 || class209.field3571 == 117 || class209.field3571 == 79 || class209.field3571 == 188 || class209.field3571 == 166 || class209.field3571 == 5 || class209.field3571 == 72) {
                class175.method1213((byte) -62);
                class209.field3571 = -1;
                return true;
            } else {
                class158.method1123("T1 - " + class209.field3571 + "," + class204.field3493 + "," + class167.field2946 + " - " + class120.field2130, (byte) -122, (Throwable) null);
                class127.method900(true);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIILw;II)V")
    public static final void method431(int arg0, int arg1, int arg2, int arg3, class141 arg4, int arg5, int arg6) {
        int var7 = arg0 * arg0 + arg3 * arg3;
        field988++;
        if (var7 > 360000) {
            return;
        }
        if (arg2 != 5953) {
            method431(-96, 85, -7, 34, (class141) null, 123, -11);
        }
        int var8 = Math.min(arg4.field2575 / 2, arg4.field2490 / 2);
        if (var7 <= (var8 * var8)) {
            class69.method561(arg1, class222.field3815[arg6], arg3, arg4, arg5, arg0, arg2 - 5828);
            return;
        }
        var8 -= 10;
        int var9 = class257.field4417 + class13.field222 & 0x7FF;
        int var10 = class150.field2670[var9];
        int var11 = var10 * 256 / (class85.field1577 + 256);
        int var12 = class150.field2676[var9];
        int var13 = var12 * 256 / (class85.field1577 + 256);
        int var14 = arg0 * var11 + arg3 * var13 >> 16;
        int var15 = arg0 * var13 - (arg3 * var11) >> 16;
        double var16 = Math.atan2((double) var14, (double) var15);
        int var18 = (int) ((double) var8 * Math.sin(var16));
        int var19 = (int) (Math.cos(var16) * (double) var8);
        ((class225) class61.field1219[arg6]).method816(arg4.field2575 / 2 + (arg1 + var18) - 10, arg4.field2490 / 2 + arg5 + -var19 + -10, 20, 20, 15, 15, var16, 256);
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(I)V")
    public class46(int arg0) {
        this.field1000 = arg0;
        this.field1002 = new class237[this.field1000];
        this.field1001 = new int[this.field1000];
        this.field987 = new short[this.field1000];
        this.field1008 = new byte[this.field1000];
        this.field1007 = new short[this.field1000];
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(III)Z")
    public static final boolean method432(int arg0, int arg1, int arg2) {
        int var3 = 107 / ((-arg1 - 67) / 51);
        field1006++;
        return (arg0 >> arg2 + 1 & 0x1) != 0;
    }
}
