import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class68 extends class2 {

    @OriginalMember(owner = "client!tb", name = "s", descriptor = "Lqk;")
    private static class207 field1210 = class24.method212(255, "Face here");

    @OriginalMember(owner = "client!tb", name = "r", descriptor = "[I")
    public static int[] field1209 = new int[100];

    @OriginalMember(owner = "client!tb", name = "p", descriptor = "Lqk;")
    public static class207 field1207 = class24.method212(255, "<img=0>");

    @OriginalMember(owner = "client!tb", name = "w", descriptor = "[I")
    public static int[] field1214 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!tb", name = "A", descriptor = "[I")
    public static int[] field1218 = new int[14];

    @OriginalMember(owner = "client!tb", name = "v", descriptor = "Lqk;")
    public static class207 field1213 = field1210;

    @OriginalMember(owner = "client!tb", name = "z", descriptor = "Z")
    public static boolean field1217 = false;

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "I")
    public static int field1206;

    @OriginalMember(owner = "client!tb", name = "q", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!tb", name = "u", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!tb", name = "x", descriptor = "I")
    public static int field1215;

    @OriginalMember(owner = "client!tb", name = "y", descriptor = "I")
    public static int field1216;

    @OriginalMember(owner = "client!tb", name = "B", descriptor = "I")
    public static int field1219;

    @OriginalMember(owner = "client!tb", name = "t", descriptor = "[I")
    public static int[] field1211;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)Z")
    public static final boolean method489(int arg0) throws IOException {
        field1216++;
        if (class98.field1738 == null) {
            return false;
        }
        int var1 = class98.field1738.method891(1);
        if (var1 == 0) {
            return false;
        }
        if (class280.field4915 == -1) {
            var1--;
            class98.field1738.method889(class17.field262.field2568, (byte) -110, 1, 0);
            class17.field262.field2593 = 0;
            class280.field4915 = class17.field262.method769(255);
            class245.field4437 = class6.field92[class280.field4915];
        }
        if (class245.field4437 == -1) {
            if (var1 <= 0) {
                return false;
            }
            var1--;
            class98.field1738.method889(class17.field262.field2568, (byte) -58, 1, 0);
            class245.field4437 = class17.field262.field2568[0] & 0xFF;
        }
        if (class245.field4437 == -2) {
            if (var1 <= 1) {
                return false;
            }
            var1 -= 2;
            class98.field1738.method889(class17.field262.field2568, (byte) -28, 2, 0);
            class17.field262.field2593 = 0;
            class245.field4437 = class17.field262.method1050(arg0 + 1272006666);
        }
        if (class245.field4437 > var1) {
            return false;
        }
        class17.field262.field2593 = 0;
        class98.field1738.method889(class17.field262.field2568, (byte) 118, class245.field4437, 0);
        class132.field2293 = 0;
        class245.field4443 = class249.field4515;
        class249.field4515 = class190.field3349;
        class190.field3349 = class280.field4915;
        if (class280.field4915 == 236) {
            int var2 = class17.field262.method1062(arg0 ^ 0xFFFFFFBB);
            int var3 = class17.field262.method1076(65280);
            class252.method1765((byte) -65, var3, var2);
            class280.field4915 = -1;
            return true;
        } else if (class280.field4915 == 123) {
            class97.method687(-22455);
            class280.field4915 = -1;
            return false;
        } else if (class280.field4915 == 125) {
            int var4 = class17.field262.method1060(-91);
            int var5 = class17.field262.method1055(38);
            int var6 = class17.field262.method1047(92);
            if (class270.method1845((byte) 127, var6)) {
                class47 var7 = (class47) class171.field3028.method1867((long) var5, true);
                class47 var8 = (class47) class171.field3028.method1867((long) var4, true);
                if (var8 != null) {
                    class150.method1091(-11138, var7 == null || var7.field934 != var8.field934, var8);
                }
                if (var7 != null) {
                    var7.method1346((byte) -16);
                    class171.field3028.method1863((byte) 80, var7, (long) var4);
                }
                class220 var9 = class233.method1667(var5, 98);
                if (var9 != null) {
                    class82.method614((byte) 89, var9);
                }
                class220 var10 = class233.method1667(var4, arg0 + 116);
                if (var10 != null) {
                    class82.method614((byte) 74, var10);
                    class191.method1333(var10, true, arg0 ^ 0xDB6F88E);
                }
                if (class165.field2915 != -1) {
                    class41.method313(1, true, class165.field2915);
                }
            }
            class280.field4915 = -1;
            return true;
        } else if (class280.field4915 == 155) {
            int var11 = class17.field262.method1079(arg0 + 14030);
            int var12 = class17.field262.method1052(-1);
            int var13 = class17.field262.method1047(arg0 ^ 0xFFFFFFD2);
            if (var13 == 65535) {
                var13 = -1;
            }
            int var14 = class17.field262.method1079(13932);
            int var15 = class17.field262.method1050(1272006568);
            if (var15 == 65535) {
                var15 = -1;
            }
            if (class270.method1845((byte) 126, var14)) {
                for (int var16 = var13; var16 <= var15; var16++) {
                    long var17 = ((long) var12 << 32) + (long) var16;
                    class117 var19 = (class117) class282.field4962.method1867(var17, true);
                    class117 var20;
                    if (var19 != null) {
                        var20 = new class117(var19.field2021, var11);
                        var19.method1346((byte) -16);
                    } else if (var16 == -1) {
                        var20 = new class117(class233.method1667(var12, arg0 + 208).field4053.field2021, var11);
                    } else {
                        var20 = new class117(0, var11);
                    }
                    class282.field4962.method1863((byte) 102, var20, var17);
                }
            }
            class280.field4915 = -1;
            return true;
        } else if (class280.field4915 == 173) {
            class250.method1755(class17.field262, 104);
            class280.field4915 = -1;
            return true;
        } else if (class280.field4915 == 115) {
            int var21 = class17.field262.method1050(arg0 + 1272006666);
            int var22 = class17.field262.method1045((byte) -114);
            int var23 = class17.field262.method1045((byte) -68);
            int var24 = class17.field262.method1050(1272006568);
            int var25 = class17.field262.method1045((byte) 88);
            int var26 = class17.field262.method1045((byte) -32);
            if (class270.method1845((byte) 127, var21)) {
                class14.method79(var26, arg0 + 44, var24, var22, var23, var25);
            }
            class280.field4915 = -1;
            return true;
        } else if (class280.field4915 == 225) {
            int var27 = class17.field262.method1079(arg0 + 14030);
            int var28 = class17.field262.method1079(13932);
            int var29 = class17.field262.method1060(119);
            int var30 = class17.field262.method1047(99);
            int var31 = class17.field262.method1079(13932);
            if (class270.method1845((byte) 127, var28)) {
                class236.method1682(var29, var31 | var30 << 16, var27, 7, 118);
            }
            class280.field4915 = -1;
            return true;
        } else if (class280.field4915 == 111) {
            int var32 = class17.field262.method1050(1272006568);
            int var33 = class17.field262.method1047(104);
            if (var32 == 65535) {
                var32 = -1;
            }
            int var34 = class17.field262.method1055(-121);
            int var35 = class17.field262.method1055(66);
            int var36 = class17.field262.method1050(arg0 + 1272006666);
            if (var36 == 65535) {
                var36 = -1;
            }
            if (class270.method1845((byte) 126, var33)) {
                for (int var37 = var36; var37 <= var32; var37++) {
                    long var38 = ((long) var35 << 32) + (long) var37;
                    class117 var40 = (class117) class282.field4962.method1867(var38, true);
                    class117 var41;
                    if (var40 != null) {
                        var41 = new class117(var34, var40.field2034);
                        var40.method1346((byte) -16);
                    } else if (var37 == -1) {
                        var41 = new class117(var34, class233.method1667(var35, 47).field4053.field2034);
                    } else {
                        var41 = new class117(var34, -1);
                    }
                    class282.field4962.method1863((byte) 56, var41, var38);
                }
            }
            class280.field4915 = -1;
            return true;
        } else if (class280.field4915 == 223) {
            long var42 = class17.field262.method1043(false);
            int var44 = class17.field262.method1050(arg0 ^ 0xB42EB836);
            byte var45 = class17.field262.method1084((byte) 49);
            boolean var46 = false;
            if ((Long.MIN_VALUE & var42) != 0L) {
                var46 = true;
            }
            if (var46) {
                if (class277.field4866 == 0) {
                    class280.field4915 = -1;
                    return true;
                }
                boolean var52 = false;
                long var53 = var42 & Long.MAX_VALUE;
                int var55;
                for (var55 = 0; class277.field4866 > var55 && (class105.field1859[var55].field3407 != var53 || class105.field1859[var55].field1004 != var44); var55++) {
                }
                if (class277.field4866 > var55) {
                    while (class277.field4866 - 1 > var55) {
                        class105.field1859[var55] = class105.field1859[var55 + 1];
                        var55++;
                    }
                    class277.field4866--;
                    class105.field1859[class277.field4866] = null;
                }
            } else {
                class207 var47 = class17.field262.method1034(-27220);
                class52 var48 = new class52();
                var48.field3407 = var42;
                var48.field1002 = class21.method125(arg0 ^ 0xFFFFFFF2, var48.field3407);
                var48.field1003 = var47;
                var48.field1004 = var44;
                var48.field1006 = var45;
                int var49;
                for (var49 = class277.field4866 - 1; var49 >= 0; var49--) {
                    int var50 = class105.field1859[var49].field1002.method1424(122, var48.field1002);
                    if (var50 == 0) {
                        class105.field1859[var49].field1004 = var44;
                        class105.field1859[var49].field1006 = var45;
                        class105.field1859[var49].field1003 = var47;
                        if (class89.field1606 == var42) {
                            class3.field54 = var45;
                        }
                        class280.field4915 = -1;
                        class171.field3034 = class193.field3395;
                        return true;
                    }
                    if (var50 < 0) {
                        break;
                    }
                }
                if (class105.field1859.length <= class277.field4866) {
                    class280.field4915 = -1;
                    return true;
                }
                for (int var51 = class277.field4866 - 1; var51 > var49; var51--) {
                    class105.field1859[var51 + 1] = class105.field1859[var51];
                }
                if (class277.field4866 == 0) {
                    class105.field1859 = new class52[100];
                }
                class105.field1859[var49 + 1] = var48;
                if (class89.field1606 == var42) {
                    class3.field54 = var45;
                }
                class277.field4866++;
            }
            class171.field3034 = class193.field3395;
            class280.field4915 = -1;
            return true;
        } else if (class280.field4915 == 217) {
            int var56 = class17.field262.method1060(-76);
            int var57 = class17.field262.method1047(119);
            if (var57 == 65535) {
                var57 = -1;
            }
            int var58 = class17.field262.method1079(13932);
            if (class270.method1845((byte) 127, var58)) {
                class236.method1682(var56, var57, -1, 2, 93);
            }
            class280.field4915 = -1;
            return true;
        } else if (class280.field4915 == 87) {
            int var59 = class17.field262.method1045((byte) 120);
            if (class17.field262.method1045((byte) -91) == 0) {
                class154.field2671[var59] = new class265();
            } else {
                class17.field262.field2593--;
                class154.field2671[var59] = new class265(class17.field262);
            }
            class273.field4804 = class193.field3395;
            class280.field4915 = -1;
            return true;
        } else if (class280.field4915 == 136) {
            int var60 = class17.field262.method1050(1272006568);
            int var61 = class17.field262.method1076(65280);
            if (class270.method1845((byte) 127, var60)) {
                class47 var62 = (class47) class171.field3028.method1867((long) var61, true);
                if (var62 != null) {
                    class150.method1091(-11138, true, var62);
                }
                if (class89.field1605 != null) {
                    class82.method614((byte) 114, class89.field1605);
                    class89.field1605 = null;
                }
            }
            class280.field4915 = -1;
            return true;
        } else if (class280.field4915 == 86) {
            long var63 = class17.field262.method1043(false);
            int var65 = class17.field262.method1050(1272006568);
            class207 var66 = class83.method621(var65, arg0 ^ 0x6C).method1527(class17.field262, (byte) -105);
            class74.method539(arg0 ^ 0xFFFFFFC7, var66, class21.method125(-57, var63).method1423(115), 19, (class207) null, var65);
            class280.field4915 = -1;
            return true;
        } else if (class280.field4915 == 22) {
            int var67 = class17.field262.method1076(65280);
            int var68 = class17.field262.method1075(arg0 ^ 0xFFFEFF9E);
            int var69 = class17.field262.method1050(arg0 + 1272006666);
            if (class270.method1845((byte) 127, var69)) {
                class170.method1224(var67, var68, false);
            }
            class280.field4915 = -1;
            return true;
        } else if (class280.field4915 == 103) {
            for (int var70 = 0; var70 < class83.field1535.length; var70++) {
                if (class85.field1543[var70] != class83.field1535[var70]) {
                    class83.field1535[var70] = class85.field1543[var70];
                    class140.method968(var70, arg0 ^ 0xFFFFFF97);
                    class129.field2246[class121.method860(31, class19.field316++)] = var70;
                }
            }
            class280.field4915 = -1;
            return true;
        } else if (class280.field4915 == 138) {
            class44.field864 = class17.field262.method1059(true);
            class134.field2328 = class17.field262.method1073(false);
            for (int var71 = class134.field2328; var71 < (class134.field2328 + 8); var71++) {
                for (int var73 = class44.field864; var73 < (class44.field864 + 8); var73++) {
                    if (class276.field4844[class93.field1645][var71][var73] != null) {
                        class276.field4844[class93.field1645][var71][var73] = null;
                        class223.method1580(var73, -99999999, var71);
                    }
                }
            }
            for (class196 var72 = (class196) class250.field4527.method922((byte) 72); var72 != null; var72 = (class196) class250.field4527.method928(-68)) {
                if (class134.field2328 <= var72.field3448 && class134.field2328 + 8 > var72.field3448 && var72.field3451 >= class44.field864 && class44.field864 + 8 > var72.field3451 && class93.field1645 == var72.field3447) {
                    var72.field3456 = 0;
                }
            }
            class280.field4915 = -1;
            return true;
        } else if (class280.field4915 == 245) {
            long var74 = class17.field262.method1043(false);
            class207 var76 = class226.method1606(class136.method944((byte) 17, class17.field262).method1459(0));
            class71.method511(23692, class21.method125(-48, var74).method1423(122), 6, var76);
            class280.field4915 = -1;
            return true;
        } else if (class280.field4915 == 222) {
            class54.field1013 = class245.field4437 / 8;
            for (int var77 = 0; var77 < class54.field1013; var77++) {
                class282.field4963[var77] = class17.field262.method1043(false);
                class234.field4335[var77] = class21.method125(-68, class282.field4963[var77]);
            }
            class280.field4915 = -1;
            class177.field3201 = class193.field3395;
            return true;
        } else if (class280.field4915 == 250) {
            class287.method1961(0);
            int var78 = class17.field262.method1073(false);
            int var79 = class17.field262.method1073(false);
            int var80 = class17.field262.method1052(arg0 ^ 0x61);
            class62.field1135[var79] = var80;
            class247.field4486[var79] = var78;
            class119.field2059[var79] = 1;
            for (int var81 = 0; var81 < 98; var81++) {
                if (class155.field2726[var81] <= var80) {
                    class119.field2059[var79] = var81 + 2;
                }
            }
            class34.field672[class121.method860(class246.field4455++, 31)] = var79;
            class280.field4915 = -1;
            return true;
        } else if (class280.field4915 == 229) {
            class134.field2328 = class17.field262.method1072(255);
            class44.field864 = class17.field262.method1045((byte) 111);
            class280.field4915 = -1;
            return true;
        } else if (class280.field4915 == 33) {
            long var82 = class17.field262.method1043(false);
            int var84 = class17.field262.method1050(1272006568);
            boolean var85 = true;
            int var86 = class17.field262.method1045((byte) 109);
            if (var82 < 0L) {
                var85 = false;
                var82 &= Long.MAX_VALUE;
            }
            class207 var87 = class100.field1800;
            if (var84 > 0) {
                var87 = class17.field262.method1034(-27220);
            }
            class207 var88 = class21.method125(-125, var82).method1423(115);
            for (int var89 = 0; var89 < class25.field534; var89++) {
                if (class150.field2640[var89] == var82) {
                    if (class34.field679[var89] != var84) {
                        class34.field679[var89] = var84;
                        if (var84 > 0) {
                            class71.method511(arg0 + 23790, class100.field1800, 5, class105.method757(false, new class207[] { var88, class169.field2977 }));
                        }
                        if (var84 == 0) {
                            class71.method511(arg0 ^ 0xFFFFA312, class100.field1800, 5, class105.method757(false, new class207[] { var88, class55.field1029 }));
                        }
                    }
                    var88 = null;
                    class118.field2042[var89] = var87;
                    class275.field4811[var89] = var86;
                    class31.field630[var89] = var85;
                    break;
                }
            }
            if (var88 != null && class25.field534 < 200) {
                class150.field2640[class25.field534] = var82;
                class129.field2240[class25.field534] = var88;
                class34.field679[class25.field534] = var84;
                class118.field2042[class25.field534] = var87;
                class275.field4811[class25.field534] = var86;
                class31.field630[class25.field534] = var85;
                class25.field534++;
            }
            class177.field3201 = class193.field3395;
            int var90 = class25.field534;
            boolean var91 = false;
            while (var90 > 0) {
                boolean var92 = true;
                var90--;
                for (int var93 = 0; var93 < var90; var93++) {
                    if (class34.field679[var93] != class173.field3089 && class34.field679[var93 + 1] == class173.field3089 || class34.field679[var93] == 0 && class34.field679[var93 + 1] != 0) {
                        var92 = false;
                        int var94 = class34.field679[var93];
                        class34.field679[var93] = class34.field679[var93 + 1];
                        class34.field679[var93 + 1] = var94;
                        class207 var95 = class118.field2042[var93];
                        class118.field2042[var93] = class118.field2042[var93 + 1];
                        class118.field2042[var93 + 1] = var95;
                        class207 var96 = class129.field2240[var93];
                        class129.field2240[var93] = class129.field2240[var93 + 1];
                        class129.field2240[var93 + 1] = var96;
                        long var97 = class150.field2640[var93];
                        class150.field2640[var93] = class150.field2640[var93 + 1];
                        class150.field2640[var93 + 1] = var97;
                        int var99 = class275.field4811[var93];
                        class275.field4811[var93] = class275.field4811[var93 + 1];
                        class275.field4811[var93 + 1] = var99;
                        boolean var100 = class31.field630[var93];
                        class31.field630[var93] = class31.field630[var93 + 1];
                        class31.field630[var93 + 1] = var100;
                    }
                }
                if (var92) {
                    break;
                }
            }
            class280.field4915 = -1;
            return true;
        } else if (class280.field4915 == 93) {
            int var101 = class17.field262.method1060(-77);
            int var102 = class17.field262.method1050(1272006568);
            int var103 = class17.field262.method1062(105);
            if (class270.method1845((byte) 126, var102)) {
                class8.method46(-26863, var101, var103);
            }
            class280.field4915 = -1;
            return true;
        } else if (class280.field4915 == 144) {
            byte[] var104 = new byte[class245.field4437];
            class17.field262.method778(class245.field4437, var104, 7, 0);
            class207 var105 = class140.method971(class245.field4437, 0, 2, var104);
            if (class272.field4794 == null && (class229.field4193 == 3 || !class229.field4205.startsWith("win") || class192.field3389)) {
                class190.method1326(true, var105, false);
            } else {
                class31.field624 = true;
                class161.field2852 = var105;
                class185.field3284 = class20.field326.method1629(true, new String(var105.method1451(127), "ISO-8859-1"));
            }
            class280.field4915 = -1;
            return true;
        } else if (class280.field4915 == 11) {
            class171.field3034 = class193.field3395;
            long var106 = class17.field262.method1043(false);
            if (var106 == 0L) {
                class277.field4866 = 0;
                class39.field789 = null;
                class280.field4915 = -1;
                class81.field1467 = null;
                class105.field1859 = null;
                return true;
            }
            long var108 = class17.field262.method1043(false);
            class81.field1467 = class21.method125(-79, var108);
            class39.field789 = class21.method125(117, var106);
            class44.field872 = class17.field262.method1084((byte) 49);
            int var110 = class17.field262.method1045((byte) -48);
            if (var110 == 255) {
                class280.field4915 = -1;
                return true;
            }
            class277.field4866 = var110;
            class52[] var111 = new class52[100];
            for (int var112 = 0; var112 < class277.field4866; var112++) {
                var111[var112] = new class52();
                var111[var112].field3407 = class17.field262.method1043(false);
                var111[var112].field1002 = class21.method125(arg0 ^ 0xFFFFFFE8, var111[var112].field3407);
                var111[var112].field1004 = class17.field262.method1050(arg0 ^ 0xB42EB836);
                var111[var112].field1006 = class17.field262.method1084((byte) 49);
                var111[var112].field1003 = class17.field262.method1034(-27220);
                if (class89.field1606 == var111[var112].field3407) {
                    class3.field54 = var111[var112].field1006;
                }
            }
            boolean var113 = false;
            int var114 = class277.field4866;
            while (var114 > 0) {
                boolean var115 = true;
                var114--;
                for (int var116 = 0; var116 < var114; var116++) {
                    if (var111[var116].field1002.method1424(125, var111[var116 + 1].field1002) > 0) {
                        class52 var117 = var111[var116];
                        var111[var116] = var111[var116 + 1];
                        var115 = false;
                        var111[var116 + 1] = var117;
                    }
                }
                if (var115) {
                    break;
                }
            }
            class280.field4915 = -1;
            class105.field1859 = var111;
            return true;
        } else if (class280.field4915 == 211) {
            int var118 = class17.field262.method1076(65280);
            int var119 = class17.field262.method1050(arg0 + 1272006666);
            class220 var120;
            if (var118 >= 0) {
                var120 = class233.method1667(var118, arg0 ^ 0xFFFFFFD7);
            } else {
                var120 = null;
            }
            if (var120 != null) {
                for (int var121 = 0; var121 < var120.field3963.length; var121++) {
                    var120.field3963[var121] = 0;
                    var120.field3939[var121] = 0;
                }
            }
            if (var118 < -70000) {
                var119 += 32768;
            }
            class191.method1328(var119, 0);
            int var122 = class17.field262.method1050(1272006568);
            for (int var123 = 0; var123 < var122; var123++) {
                int var124 = class17.field262.method1079(13932);
                int var125 = class17.field262.method1072(arg0 + 353);
                if (var125 == 255) {
                    var125 = class17.field262.method1055(-128);
                }
                if (var120 != null && var123 < var120.field3963.length) {
                    var120.field3963[var123] = var124;
                    var120.field3939[var123] = var125;
                }
                class131.method919(var123, var124 - 1, 0, var125, var119);
            }
            if (var120 != null) {
                class82.method614((byte) 65, var120);
            }
            class287.method1961(0);
            class74.field1354[class121.method860(31, class215.field3828++)] = class121.method860(32767, var119);
            class280.field4915 = -1;
            return true;
        } else if (class280.field4915 == 62) {
            int var126 = class17.field262.method1050(1272006568);
            class200.method1395(64, var126);
            class74.field1354[class121.method860(31, class215.field3828++)] = class121.method860(var126, 32767);
            class280.field4915 = -1;
            return true;
        } else if (class280.field4915 == 246) {
            int var127 = class17.field262.method1050(1272006568);
            class207 var128 = class17.field262.method1034(-27220);
            int var129 = class17.field262.method1079(arg0 + 14030);
            if (class270.method1845((byte) 127, var129)) {
                class197.method1372(var128, var127, 30139);
            }
            class280.field4915 = -1;
            return true;
        } else if (class280.field4915 == 40) {
            int var130 = class17.field262.method1079(arg0 ^ 0xFFFFC9F2);
            int var131 = class17.field262.method1052(-1);
            int var132 = class17.field262.method1062(arg0 ^ 0xFFFFFFE7);
            if (class270.method1845((byte) 126, var130)) {
                class198.method1375(var131, (byte) -126, var132);
            }
            class280.field4915 = -1;
            return true;
        } else if (class280.field4915 == 70) {
            class44.field864 = class17.field262.method1045((byte) 88);
            class134.field2328 = class17.field262.method1073(false);
            while (class17.field262.field2593 < class245.field4437) {
                class280.field4915 = class17.field262.method1045((byte) 91);
                class188.method1314(3);
            }
            class280.field4915 = -1;
            return true;
        } else if (class280.field4915 == 204) {
            int var133 = class17.field262.method1076(arg0 + 65378);
            int var134 = class17.field262.method1050(1272006568);
            class220 var135;
            if (var133 >= 0) {
                var135 = class233.method1667(var133, arg0 ^ 0xFFFFFFE4);
            } else {
                var135 = null;
            }
            if (var133 < -70000) {
                var134 += 32768;
            }
            while (class245.field4437 > class17.field262.field2593) {
                int var136 = class17.field262.method1067(-32768);
                int var137 = 0;
                int var138 = class17.field262.method1050(1272006568);
                if (var138 != 0) {
                    var137 = class17.field262.method1045((byte) -71);
                    if (var137 == 255) {
                        var137 = class17.field262.method1076(arg0 + 65378);
                    }
                }
                if (var135 != null && var136 >= 0 && var135.field3963.length > var136) {
                    var135.field3963[var136] = var138;
                    var135.field3939[var136] = var137;
                }
                class131.method919(var136, var138 - 1, arg0 + 98, var137, var134);
            }
            if (var135 != null) {
                class82.method614((byte) 39, var135);
            }
            class287.method1961(arg0 + 98);
            class74.field1354[class121.method860(class215.field3828++, 31)] = class121.method860(32767, var134);
            class280.field4915 = -1;
            return true;
        } else if (class280.field4915 == 44) {
            int var139 = class17.field262.method1055(59);
            int var140 = class17.field262.method1047(106);
            int var141 = class17.field262.method1079(13932);
            int var142 = class17.field262.method1047(123);
            if (class270.method1845((byte) 127, var140)) {
                class164.method1188((var141 << 16) + var142, (byte) -111, var139);
            }
            class280.field4915 = -1;
            return true;
        } else if (class280.field4915 == 212) {
            class113.method810(true, (byte) -93);
            class280.field4915 = -1;
            return true;
        } else if (class280.field4915 == 108) {
            class287.method1961(0);
            class36.field687 = class17.field262.method1045((byte) 99);
            class99.field1779 = class193.field3395;
            class280.field4915 = -1;
            return true;
        } else if (class280.field4915 == 96) {
            int var143 = class17.field262.method1050(1272006568);
            int var144 = class17.field262.method1045((byte) 109);
            int var145 = class17.field262.method1045((byte) 109);
            int var146 = class17.field262.method1045((byte) 85);
            int var147 = class17.field262.method1045((byte) -103);
            int var148 = class17.field262.method1050(1272006568);
            if (class270.method1845((byte) 126, var143)) {
                class174.field3126[var144] = true;
                class56.field1051[var144] = var145;
                class48.field949[var144] = var146;
                class247.field4481[var144] = var147;
                class279.field4895[var144] = var148;
            }
            class280.field4915 = -1;
            return true;
        } else if (class280.field4915 == 170) {
            int var149 = class17.field262.method1045((byte) -97);
            int var150 = class17.field262.method1072(255);
            int var151 = class17.field262.method1059(true);
            class93.field1645 = var149 >> 1;
            class202.field3565.method88((byte) -99, (var149 & 0x1) == 1, var151, var150);
            class280.field4915 = -1;
            return true;
        } else if (class280.field4915 == 226) {
            class20.method118(class17.field262, true, class245.field4437, class20.field326);
            class280.field4915 = -1;
            return true;
        } else if (class280.field4915 == 71) {
            int var152 = class17.field262.method1052(-1);
            int var153 = var152 & 0x3FFF;
            int var154 = var152 >> 28 & 0x3;
            int var155 = var152 >> 14 & 0x3FFF;
            int var156 = class17.field262.method1079(13932);
            if (var156 == 65535) {
                var156 = -1;
            }
            int var157 = class17.field262.method1059(true);
            int var158 = var157 & 0x3;
            int var159 = var153 - class180.field3231;
            int var160 = var155 - class21.field349;
            int var161 = var157 >> 2;
            int var162 = class18.field280[var161];
            class21.method127(var160, var161, var156, var158, var154, var162, var159, (byte) -95);
            class280.field4915 = -1;
            return true;
        } else if (class280.field4915 == 188) {
            int var163 = class17.field262.method1050(1272006568);
            int var164 = class17.field262.method1050(arg0 ^ 0xB42EB836);
            int var165 = class17.field262.method1079(13932);
            if (class270.method1845((byte) 126, var164)) {
                class266.field4711 = var165;
                class25.field533 = var163;
                if (class132.field2290 == 2) {
                    class101.field1819 = class266.field4711;
                    class228.field4186 = class25.field533;
                }
                class105.method761(arg0 + 94);
            }
            class280.field4915 = -1;
            return true;
        } else if (class280.field4915 == 142) {
            class113.method810(false, (byte) -89);
            class280.field4915 = -1;
            return true;
        } else if (class280.field4915 == 2) {
            class56.method420(arg0 + 98);
            class280.field4915 = -1;
            return true;
        } else if (class280.field4915 == 72) {
            int var166 = class17.field262.method1079(13932);
            int var167 = class17.field262.method1076(arg0 ^ 0xFFFF009E);
            if (var166 == 65535) {
                var166 = -1;
            }
            int var168 = class17.field262.method1079(13932);
            int var169 = class17.field262.method1052(-1);
            if (class270.method1845((byte) 126, var168)) {
                class220 var170 = class233.method1667(var169, 89);
                if (var170.field4010) {
                    class44.method334(var169, var167, 4096, var166);
                    class173 var171 = class117.method829(var166, (byte) 65);
                    class36.method264(var171.field3122, var171.field3049, var171.field3061, var169, (byte) 88);
                    class120.method856(var171.field3119, var171.field3059, var169, var171.field3088, arg0 - 27);
                } else if (var166 == -1) {
                    var170.field3944 = 0;
                    class280.field4915 = -1;
                    return true;
                } else {
                    class173 var172 = class117.method829(var166, (byte) 104);
                    var170.field3875 = var172.field3049;
                    var170.field4047 = var166;
                    var170.field3987 = var172.field3061;
                    var170.field3881 = var172.field3122 * 100 / var167;
                    var170.field3944 = 4;
                    class82.method614((byte) 54, var170);
                }
            }
            class280.field4915 = -1;
            return true;
        } else if (class280.field4915 == 7) {
            int var173 = class17.field262.method1052(arg0 ^ 0x61);
            int var174 = class17.field262.method1062(36);
            int var175 = class17.field262.method1050(1272006568);
            int var176 = class17.field262.method1047(83);
            int var177 = class17.field262.method1062(124);
            if (class270.method1845((byte) 127, var177)) {
                class36.method264(var176, var174, var175, var173, (byte) 125);
            }
            class280.field4915 = -1;
            return true;
        } else if (class280.field4915 == 189) {
            int var178 = class17.field262.method1047(arg0 ^ 0xFFFFFFE4);
            int var179 = class17.field262.method1079(13932);
            int var180 = class17.field262.method1073(false);
            class256 var181 = class79.field1449[var179];
            if (var181 != null) {
                class208.method1476(var181, -5636, var178, var180);
            }
            class280.field4915 = -1;
            return true;
        } else if (class280.field4915 == 172) {
            int var182 = class17.field262.method1055(-116);
            class81.field1468 = class20.field326.method1641(false, var182);
            class280.field4915 = -1;
            return true;
        } else if (class280.field4915 == 151) {
            int var183 = class17.field262.method1045((byte) -127);
            int var184 = class17.field262.method1050(1272006568);
            if (var184 == 65535) {
                var184 = -1;
            }
            int var185 = class17.field262.method1045((byte) -103);
            class207 var186 = class17.field262.method1034(arg0 ^ 0x6A32);
            if (var183 >= 1 && var183 <= 8) {
                if (var186.method1462(class150.field2628, true)) {
                    var186 = null;
                }
                class40.field808[var183 - 1] = var186;
                class108.field1919[var183 - 1] = var184;
                class183.field3251[var183 - 1] = var185 == 0;
            }
            class280.field4915 = -1;
            return true;
        } else if (class280.field4915 == 74) {
            class280.field4923 = class17.field262.method1050(arg0 ^ 0xB42EB836) * 30;
            class99.field1779 = class193.field3395;
            class280.field4915 = -1;
            return true;
        } else if (class280.field4915 == 42) {
            int var187 = class17.field262.method1062(79);
            if (var187 == 65535) {
                var187 = -1;
            }
            class110.method791(var187, (byte) 57);
            class280.field4915 = -1;
            return true;
        } else if (class280.field4915 == 126) {
            int var188 = class17.field262.method1047(121);
            if (var188 == 65535) {
                var188 = -1;
            }
            int var189 = class17.field262.method1065((byte) 39);
            class3.method12(0, var189, var188);
            class280.field4915 = -1;
            return true;
        } else if (class280.field4915 == 117) {
            int var190 = class17.field262.method1050(1272006568);
            class207 var191 = class17.field262.method1034(-27220);
            Object[] var192 = new Object[var191.method1450((byte) -117) + 1];
            for (int var193 = var191.method1450((byte) -126) - 1; var193 >= 0; var193--) {
                if (var191.method1457(var193, -12675) == 115) {
                    var192[var193 + 1] = class17.field262.method1034(-27220);
                } else {
                    var192[var193 + 1] = Integer.valueOf(class17.field262.method1076(arg0 + 65378));
                }
            }
            var192[0] = Integer.valueOf(class17.field262.method1076(65280));
            if (class270.method1845((byte) 127, var190)) {
                class206 var194 = new class206();
                var194.field3616 = var192;
                class69.method501(-82, var194);
            }
            class280.field4915 = -1;
            return true;
        } else if (class280.field4915 == 66) {
            int var195 = class17.field262.method1052(-1);
            class207 var196 = class17.field262.method1034(-27220);
            int var197 = class17.field262.method1062(57);
            if (class270.method1845((byte) 126, var197)) {
                class133.method936(var195, 2, var196);
            }
            class280.field4915 = -1;
            return true;
        } else if (class280.field4915 == 112) {
            int var198 = class17.field262.method1050(arg0 ^ 0xB42EB836);
            if (var198 == 65535) {
                var198 = -1;
            }
            int var199 = class17.field262.method1045((byte) 84);
            int var200 = class17.field262.method1050(1272006568);
            class197.method1368(var200, var199, true, var198);
            class280.field4915 = -1;
            return true;
        } else if (class280.field4915 == 248) {
            class24.method206((byte) 115);
            class280.field4915 = -1;
            return true;
        } else if (class280.field4915 == 12) {
            long var201 = class17.field262.method1043(false);
            class17.field262.method1084((byte) 49);
            long var203 = class17.field262.method1043(false);
            long var205 = (long) class17.field262.method1050(1272006568);
            long var207 = (long) class17.field262.method1065((byte) 42);
            long var209 = (var205 << 32) + var207;
            int var211 = class17.field262.method1045((byte) -117);
            boolean var212 = false;
            int var213 = 0;
            label1328: while (true) {
                if (var213 >= 100) {
                    if (var211 <= 1) {
                        if ((!class8.field112 || class78.field1427) && !class92.field1638) {
                            for (int var214 = 0; var214 < class54.field1013; var214++) {
                                if (class282.field4963[var214] == var201) {
                                    var212 = true;
                                    break label1328;
                                }
                            }
                        } else {
                            var212 = true;
                        }
                    }
                    break;
                }
                if (class133.field2304[var213] == var209) {
                    var212 = true;
                    break;
                }
                var213++;
            }
            if (!var212 && class56.field1043 == 0) {
                class133.field2304[class227.field4171] = var209;
                class227.field4171 = (class227.field4171 + 1) % 100;
                class207 var215 = class226.method1606(class136.method944((byte) 17, class17.field262).method1459(arg0 ^ 0xFFFFFF9E));
                if (var211 == 2 || var211 == 3) {
                    class246.method1732(var215, class105.method757(false, new class207[] { class270.field4779, class21.method125(arg0 ^ 0x2F, var201).method1423(arg0 + 217) }), class21.method125(-123, var203).method1423(122), 9, -122);
                } else if (var211 == 1) {
                    class246.method1732(var215, class105.method757(false, new class207[] { class276.field4849, class21.method125(-35, var201).method1423(126) }), class21.method125(arg0 ^ 0x73, var203).method1423(118), 9, -121);
                } else {
                    class246.method1732(var215, class21.method125(arg0 ^ 0x7D, var201).method1423(120), class21.method125(arg0 + 204, var203).method1423(126), 9, arg0 ^ 0xFFFFFFB3);
                }
            }
            class280.field4915 = -1;
            return true;
        } else if (class280.field4915 == 209) {
            int var216 = class17.field262.method1076(arg0 ^ 0xFFFF009E);
            class220 var217 = class233.method1667(var216, 26);
            for (int var218 = 0; var218 < var217.field3963.length; var218++) {
                var217.field3963[var218] = -1;
                var217.field3963[var218] = 0;
            }
            class82.method614((byte) 39, var217);
            class280.field4915 = -1;
            return true;
        } else if (class280.field4915 == 227) {
            int var219 = class17.field262.method1050(1272006568);
            int var220 = class17.field262.method1045((byte) 112);
            int var221 = class17.field262.method1045((byte) 79);
            int var222 = class17.field262.method1050(arg0 ^ 0xB42EB836);
            int var223 = class17.field262.method1045((byte) 94);
            int var224 = class17.field262.method1045((byte) -25);
            if (class270.method1845((byte) 127, var219)) {
                class107.method771(false, var222, var224, var221, true, var220, var223);
            }
            class280.field4915 = -1;
            return true;
        } else if (class280.field4915 == 203) {
            if (class165.field2915 != -1) {
                class41.method313(0, true, class165.field2915);
            }
            class280.field4915 = -1;
            return true;
        } else if (class280.field4915 == 215) {
            int var225 = class17.field262.method1062(arg0 + 164);
            int var226 = class17.field262.method1060(-105);
            if (class270.method1845((byte) 127, var225)) {
                int var227 = 0;
                if (class202.field3565.field229 != null) {
                    var227 = class202.field3565.field229.method371(arg0 ^ 0xEDCBA9E6);
                }
                class236.method1682(var226, var227, -1, 3, 32);
            }
            class280.field4915 = -1;
            return true;
        } else if (class280.field4915 == 120) {
            int var228 = class17.field262.method1052(-1);
            int var229 = class17.field262.method1047(82);
            int var230 = class17.field262.method1047(89);
            int var231 = class17.field262.method1047(119);
            if (var228 >> 30 != 0) {
                int var242 = (var228 >> 14 & 0x3FFF) - class21.field349;
                int var243 = var228 >> 28 & 0x3;
                int var244 = (var228 & 0x3FFF) - class180.field3231;
                if (var242 >= 0 && var244 >= 0 && var242 < 104 && var244 < 104) {
                    int var245 = var244 * 128 + 64;
                    int var246 = var242 * 128 + 64;
                    class259 var247 = new class259(var231, var243, var246, var245, class22.method139(var246, var245, arg0 ^ 0xFFFFA235, var243) - var229, var230, class160.field2844);
                    class43.field838.method931(new class25(var247), 119);
                }
            } else if (var228 >> 29 != 0) {
                int var232 = var228 & 0xFFFF;
                class256 var233 = class79.field1449[var232];
                if (var233 != null) {
                    if (var231 == 65535) {
                        var231 = -1;
                    }
                    boolean var234 = true;
                    if (var231 != -1 && var233.field5105 != -1 && class16.method101((byte) 57, class165.method1192(var231, arg0 ^ 0x1C).field4332).field1169 < class16.method101((byte) 116, class165.method1192(var233.field5105, -102).field4332).field1169) {
                        var234 = false;
                    }
                    if (var234) {
                        var233.field5012 = 1;
                        var233.field5096 = var229;
                        var233.field5088 = 0;
                        var233.field5059 = class160.field2844 + var230;
                        var233.field5105 = var231;
                        var233.field5080 = 0;
                        if (class160.field2844 < var233.field5059) {
                            var233.field5080 = -1;
                        }
                        if (var233.field5105 != -1 && class160.field2844 == var233.field5059) {
                            int var235 = class165.method1192(var233.field5105, arg0 - 15).field4332;
                            if (var235 != -1) {
                                class65 var236 = class16.method101((byte) -127, var235);
                                if (var236 != null && var236.field1180 != null) {
                                    class69.method497(var233.field5104, false, 0, arg0 + 30, var233.field5072, var236);
                                }
                            }
                        }
                    }
                }
            } else if ((var228 >> 28) != 0) {
                int var237 = var228 & 0xFFFF;
                class14 var238;
                if (class19.field313 == var237) {
                    var238 = class202.field3565;
                } else {
                    var238 = class169.field2953[var237];
                }
                if (var238 != null) {
                    if (var231 == 65535) {
                        var231 = -1;
                    }
                    boolean var239 = true;
                    if (var231 != -1 && var238.field5105 != -1 && class16.method101((byte) 74, class165.method1192(var231, -101).field4332).field1169 < class16.method101((byte) -87, class165.method1192(var238.field5105, -106).field4332).field1169) {
                        var239 = false;
                    }
                    if (var239) {
                        var238.field5088 = 0;
                        var238.field5059 = class160.field2844 + var230;
                        var238.field5080 = 0;
                        var238.field5105 = var231;
                        var238.field5096 = var229;
                        if (class160.field2844 < var238.field5059) {
                            var238.field5080 = -1;
                        }
                        if (var238.field5105 == 65535) {
                            var238.field5105 = -1;
                        }
                        var238.field5012 = 1;
                        if (var238.field5105 != -1 && class160.field2844 == var238.field5059) {
                            int var240 = class165.method1192(var238.field5105, -101).field4332;
                            if (var240 != -1) {
                                class65 var241 = class16.method101((byte) 99, var240);
                                if (var241 != null && var241.field1180 != null) {
                                    class69.method497(var238.field5104, class202.field3565 == var238, 0, -104, var238.field5072, var241);
                                }
                            }
                        }
                    }
                }
            }
            class280.field4915 = -1;
            return true;
        } else if (class280.field4915 == 237) {
            class157.method1151(28756);
            class287.method1961(0);
            class19.field316 += 32;
            class280.field4915 = -1;
            return true;
        } else if (class280.field4915 == 24) {
            int var248 = class17.field262.method1076(65280);
            int var249 = class17.field262.method1047(76);
            int var250 = class17.field262.method1047(arg0 + 190);
            int var251 = class17.field262.method1073(false);
            if (class270.method1845((byte) 127, var250)) {
                class47 var252 = (class47) class171.field3028.method1867((long) var248, true);
                if (var252 != null) {
                    class150.method1091(-11138, var252.field934 != var249, var252);
                }
                class189.method1318((byte) 80, var251, var248, var249);
            }
            class280.field4915 = -1;
            return true;
        } else if (class280.field4915 == 167) {
            int var253 = class17.field262.method1050(1272006568);
            int var254 = class17.field262.method1073(false);
            int var255 = class17.field262.method1079(13932);
            if (class270.method1845((byte) 127, var255)) {
                if (var254 == 2) {
                    class21.method122((byte) 96);
                }
                class165.field2915 = var253;
                class188.method1311(var253, 20404);
                class202.method1404(arg0 - 19582, false);
                class153.method1097(class165.field2915, (byte) -20);
                for (int var256 = 0; var256 < 100; var256++) {
                    class140.field2431[var256] = true;
                }
            }
            class280.field4915 = -1;
            return true;
        } else if (class280.field4915 == 253) {
            int var257 = class17.field262.method1062(36);
            byte var258 = class17.field262.method1084((byte) 49);
            class252.method1765((byte) -69, var258, var257);
            class280.field4915 = -1;
            return true;
        } else if (class280.field4915 == 175) {
            int var259 = class17.field262.method1045((byte) -77);
            int var260 = var259 >> 6;
            class156 var261 = new class156();
            var261.field2749 = var259 & 0x3F;
            var261.field2750 = class17.field262.method1045((byte) 102);
            if (var261.field2750 >= 0 && var261.field2750 < class67.field1191.length) {
                if (var261.field2749 == 1 || var261.field2749 == 10) {
                    var261.field2740 = class17.field262.method1050(1272006568);
                    class17.field262.field2593 += 3;
                } else if (var261.field2749 >= 2 && var261.field2749 <= 6) {
                    if (var261.field2749 == 2) {
                        var261.field2733 = 64;
                        var261.field2738 = 64;
                    }
                    if (var261.field2749 == 3) {
                        var261.field2738 = 64;
                        var261.field2733 = 0;
                    }
                    if (var261.field2749 == 4) {
                        var261.field2733 = 128;
                        var261.field2738 = 64;
                    }
                    if (var261.field2749 == 5) {
                        var261.field2738 = 0;
                        var261.field2733 = 64;
                    }
                    if (var261.field2749 == 6) {
                        var261.field2733 = 64;
                        var261.field2738 = 128;
                    }
                    var261.field2749 = 2;
                    var261.field2756 = class17.field262.method1050(1272006568);
                    var261.field2732 = class17.field262.method1050(1272006568);
                    var261.field2736 = class17.field262.method1045((byte) 119);
                }
                var261.field2746 = class17.field262.method1050(1272006568);
                if (var261.field2746 == 65535) {
                    var261.field2746 = -1;
                }
                class170.field3025[var260] = var261;
            }
            class280.field4915 = -1;
            return true;
        } else if (class280.field4915 == 76) {
            class138.field2397 = class17.field262.method1045((byte) 96);
            class280.field4915 = -1;
            class177.field3201 = class193.field3395;
            return true;
        } else if (class280.field4915 == 185) {
            int var262 = class17.field262.method1062(65);
            int var263 = class17.field262.method1076(arg0 ^ 0xFFFF009E);
            int var264 = class17.field262.method1050(1272006568);
            if (var264 == 65535) {
                var264 = -1;
            }
            if (class270.method1845((byte) 127, var262)) {
                class236.method1682(var263, var264, -1, 1, 29);
            }
            class280.field4915 = -1;
            return true;
        } else if (class280.field4915 == 121) {
            class247.method1734(arg0 ^ 0x3AD8, class17.field262.method1034(-27220));
            class280.field4915 = -1;
            return true;
        } else if (class280.field4915 == 214) {
            if (class245.field4437 == 0) {
                class273.field4806 = class107.field1905;
            } else {
                class273.field4806 = class17.field262.method1034(-27220);
            }
            class280.field4915 = -1;
            return true;
        } else if (class280.field4915 == 187) {
            int var265 = class17.field262.method1062(75);
            int var266 = class17.field262.method1062(39);
            int var267 = class17.field262.method1073(false);
            if (class270.method1845((byte) 126, var266)) {
                class198.method1375(var267, (byte) -124, var265);
            }
            class280.field4915 = -1;
            return true;
        } else if (class280.field4915 == 145) {
            int var268 = class17.field262.method1073(false);
            int var269 = class17.field262.method1060(-52);
            int var270 = class17.field262.method1062(57);
            if (class270.method1845((byte) 127, var270)) {
                class266.method1826((byte) 95, var268, var269);
            }
            class280.field4915 = -1;
            return true;
        } else if (class280.field4915 == 14) {
            class287.method1961(arg0 ^ 0xFFFFFF9E);
            class40.field800 = class17.field262.method1075(65536);
            class99.field1779 = class193.field3395;
            class280.field4915 = -1;
            return true;
        } else if (class280.field4915 == 16) {
            int var271 = class17.field262.method1079(arg0 ^ 0xFFFFC9F2);
            int var272 = class17.field262.method1055(84);
            int var273 = class17.field262.method1062(43);
            if (class270.method1845((byte) 127, var273)) {
                class18.method109(var271, var272, -126);
            }
            class280.field4915 = -1;
            return true;
        } else if (class280.field4915 == 152) {
            long var274 = class17.field262.method1043(false);
            long var276 = (long) class17.field262.method1050(arg0 ^ 0xB42EB836);
            long var278 = (long) class17.field262.method1065((byte) 105);
            int var280 = class17.field262.method1045((byte) 88);
            boolean var281 = false;
            long var282 = (var276 << 32) + var278;
            int var284 = 0;
            label1385: while (true) {
                if (var284 >= 100) {
                    if (var280 <= 1) {
                        if ((!class8.field112 || class78.field1427) && !class92.field1638) {
                            for (int var285 = 0; var285 < class54.field1013; var285++) {
                                if (class282.field4963[var285] == var274) {
                                    var281 = true;
                                    break label1385;
                                }
                            }
                        } else {
                            var281 = true;
                        }
                    }
                    break;
                }
                if (class133.field2304[var284] == var282) {
                    var281 = true;
                    break;
                }
                var284++;
            }
            if (!var281 && class56.field1043 == 0) {
                class133.field2304[class227.field4171] = var282;
                class227.field4171 = (class227.field4171 + 1) % 100;
                class207 var286 = class226.method1606(class136.method944((byte) 17, class17.field262).method1459(0));
                if (var280 == 2 || var280 == 3) {
                    class71.method511(23692, class105.method757(false, new class207[] { class270.field4779, class21.method125(93, var274).method1423(119) }), 7, var286);
                } else if (var280 == 1) {
                    class71.method511(23692, class105.method757(false, new class207[] { class276.field4849, class21.method125(arg0 ^ 0xFFFFFFC3, var274).method1423(122) }), 7, var286);
                } else {
                    class71.method511(23692, class21.method125(100, var274).method1423(arg0 + 225), 3, var286);
                }
            }
            class280.field4915 = -1;
            return true;
        } else if (class280.field4915 == 101) {
            class82.field1507 = class17.field262.method1045((byte) -66);
            class279.field4897 = class17.field262.method1045((byte) -45);
            class18.field276 = class17.field262.method1045((byte) -123);
            class280.field4915 = -1;
            return true;
        } else if (class280.field4915 == 69) {
            int var287 = class17.field262.method1052(-1);
            int var288 = class17.field262.method1062(arg0 ^ 0xFFFFFFD9);
            class215.method1542(var287, 128, var288);
            class280.field4915 = -1;
            return true;
        } else if (class280.field4915 == 140) {
            int var289 = class17.field262.method1056(2048857896);
            int var290 = class17.field262.method1069((byte) 113);
            int var291 = class17.field262.method1055(56);
            int var292 = class17.field262.method1079(13932);
            if (class270.method1845((byte) 126, var292)) {
                class191.method1334(var289, var290, arg0 + 203, var291);
            }
            class280.field4915 = -1;
            return true;
        } else if (class280.field4915 == 139) {
            class207 var293 = class17.field262.method1034(-27220);
            if (var293.method1434(class47.field925, (byte) -81)) {
                class207 var329 = var293.method1427(-17195, 0, var293.method1467(-1, class236.field4359));
                long var330 = var329.method1428(arg0 ^ 0xFFFFFF9E);
                boolean var332 = false;
                for (int var333 = 0; var333 < class54.field1013; var333++) {
                    if (class282.field4963[var333] == var330) {
                        var332 = true;
                        break;
                    }
                }
                if (!var332 && class56.field1043 == 0) {
                    class71.method511(23692, var329, 4, class51.field993);
                }
            } else if (var293.method1434(class207.field3686, (byte) -115)) {
                class207 var323 = var293.method1427(-17195, 0, var293.method1467(-1, class236.field4359));
                long var324 = var323.method1428(0);
                boolean var326 = false;
                for (int var327 = 0; var327 < class54.field1013; var327++) {
                    if (class282.field4963[var327] == var324) {
                        var326 = true;
                        break;
                    }
                }
                if (!var326 && class56.field1043 == 0) {
                    class207 var328 = var293.method1427(-17195, var293.method1467(-1, class236.field4359) + 1, var293.method1450((byte) -116) + -9);
                    class71.method511(23692, var323, 8, var328);
                }
            } else if (var293.method1434(class160.field2841, (byte) -95)) {
                boolean var294 = false;
                class207 var295 = var293.method1427(-17195, 0, var293.method1467(-1, class236.field4359));
                long var296 = var295.method1428(arg0 + 98);
                for (int var298 = 0; var298 < class54.field1013; var298++) {
                    if (class282.field4963[var298] == var296) {
                        var294 = true;
                        break;
                    }
                }
                if (!var294 && class56.field1043 == 0) {
                    class71.method511(23692, var295, 10, class100.field1800);
                }
            } else if (var293.method1434(class245.field4445, (byte) -126)) {
                class207 var299 = var293.method1427(-17195, 0, var293.method1467(-1, class245.field4445));
                class71.method511(23692, class100.field1800, 11, var299);
            } else if (var293.method1434(class230.field4215, (byte) -112)) {
                class207 var322 = var293.method1427(-17195, 0, var293.method1467(-1, class230.field4215));
                if (class56.field1043 == 0) {
                    class71.method511(23692, class100.field1800, 12, var322);
                }
            } else if (var293.method1434(class241.field4389, (byte) -69)) {
                class207 var321 = var293.method1427(-17195, 0, var293.method1467(-1, class241.field4389));
                if (class56.field1043 == 0) {
                    class71.method511(arg0 ^ 0xFFFFA312, class100.field1800, 13, var321);
                }
            } else if (var293.method1434(class245.field4449, (byte) -119)) {
                class207 var300 = var293.method1427(-17195, 0, var293.method1467(-1, class236.field4359));
                long var301 = var300.method1428(arg0 ^ 0xFFFFFF9E);
                boolean var303 = false;
                for (int var304 = 0; var304 < class54.field1013; var304++) {
                    if (class282.field4963[var304] == var301) {
                        var303 = true;
                        break;
                    }
                }
                if (!var303 && class56.field1043 == 0) {
                    class71.method511(arg0 ^ 0xFFFFA312, var300, 14, class100.field1800);
                }
            } else if (var293.method1434(class15.field246, (byte) -85)) {
                class207 var316 = var293.method1427(-17195, 0, var293.method1467(-1, class236.field4359));
                long var317 = var316.method1428(0);
                boolean var319 = false;
                for (int var320 = 0; var320 < class54.field1013; var320++) {
                    if (class282.field4963[var320] == var317) {
                        var319 = true;
                        break;
                    }
                }
                if (!var319 && class56.field1043 == 0) {
                    class71.method511(arg0 + 23790, var316, 15, class100.field1800);
                }
            } else if (var293.method1434(class199.field3488, (byte) -93)) {
                boolean var305 = false;
                class207 var306 = var293.method1427(arg0 - 17097, 0, var293.method1467(arg0 + 97, class236.field4359));
                long var307 = var306.method1428(arg0 ^ 0xFFFFFF9E);
                for (int var309 = 0; var309 < class54.field1013; var309++) {
                    if (class282.field4963[var309] == var307) {
                        var305 = true;
                        break;
                    }
                }
                if (!var305 && class56.field1043 == 0) {
                    class71.method511(23692, var306, 16, class100.field1800);
                }
            } else if (var293.method1434(class93.field1651, (byte) -120)) {
                class207 var310 = var293.method1427(-17195, 0, var293.method1467(arg0 ^ 0x61, class236.field4359));
                boolean var311 = false;
                long var312 = var310.method1428(0);
                for (int var314 = 0; var314 < class54.field1013; var314++) {
                    if (class282.field4963[var314] == var312) {
                        var311 = true;
                        break;
                    }
                }
                if (!var311 && class56.field1043 == 0) {
                    class207 var315 = var293.method1427(-17195, var293.method1467(-1, class236.field4359) + 1, var293.method1450((byte) -115) + -9);
                    class71.method511(23692, var310, 21, var315);
                }
            } else {
                class71.method511(23692, class100.field1800, 0, var293);
            }
            class280.field4915 = -1;
            return true;
        } else if (class280.field4915 == 55) {
            int var334 = class17.field262.method1050(1272006568);
            int var335 = class17.field262.method1079(13932);
            class207 var336 = class17.field262.method1034(-27220);
            if (class270.method1845((byte) 126, var334)) {
                class197.method1372(var336, var335, 30139);
            }
            class280.field4915 = -1;
            return true;
        } else {
            if (arg0 != -98) {
                field1214 = null;
            }
            if (class280.field4915 == 178) {
                for (int var337 = 0; var337 < class169.field2953.length; var337++) {
                    if (class169.field2953[var337] != null) {
                        class169.field2953[var337].field5052 = -1;
                    }
                }
                for (int var338 = 0; var338 < class79.field1449.length; var338++) {
                    if (class79.field1449[var338] != null) {
                        class79.field1449[var338].field5052 = -1;
                    }
                }
                class280.field4915 = -1;
                return true;
            } else if (class280.field4915 == 154) {
                class185.field3283 = class17.field262.method1045((byte) -91);
                class280.field4915 = -1;
                return true;
            } else if (class280.field4915 == 3) {
                class280.field4915 = -1;
                class117.field2015 = 0;
                return true;
            } else if (class280.field4915 == 240) {
                long var339 = class17.field262.method1043(false);
                class17.field262.method1084((byte) 49);
                long var341 = class17.field262.method1043(false);
                long var343 = (long) class17.field262.method1050(1272006568);
                long var345 = (long) class17.field262.method1065((byte) 22);
                boolean var347 = false;
                long var348 = (var343 << 32) + var345;
                int var350 = class17.field262.method1045((byte) -112);
                int var351 = class17.field262.method1050(arg0 ^ 0xB42EB836);
                int var352 = 0;
                label1475: while (true) {
                    if (var352 >= 100) {
                        if (var350 <= 1) {
                            for (int var353 = 0; var353 < class54.field1013; var353++) {
                                if (class282.field4963[var353] == var339) {
                                    var347 = true;
                                    break label1475;
                                }
                            }
                        }
                        break;
                    }
                    if (class133.field2304[var352] == var348) {
                        var347 = true;
                        break;
                    }
                    var352++;
                }
                if (!var347 && class56.field1043 == 0) {
                    class133.field2304[class227.field4171] = var348;
                    class227.field4171 = (class227.field4171 + 1) % 100;
                    class207 var354 = class83.method621(var351, -88).method1527(class17.field262, (byte) -105);
                    if (var350 == 2 || var350 == 3) {
                        class74.method539(107, var354, class105.method757(false, new class207[] { class270.field4779, class21.method125(-43, var339).method1423(116) }), 20, class21.method125(arg0 + 222, var341).method1423(arg0 ^ 0xFFFFFFE6), var351);
                    } else if (var350 == 1) {
                        class74.method539(117, var354, class105.method757(false, new class207[] { class276.field4849, class21.method125(93, var339).method1423(120) }), 20, class21.method125(-116, var341).method1423(arg0 + 225), var351);
                    } else {
                        class74.method539(-40, var354, class21.method125(-33, var339).method1423(123), 20, class21.method125(-114, var341).method1423(arg0 + 223), var351);
                    }
                }
                class280.field4915 = -1;
                return true;
            } else if (class280.field4915 == 49) {
                int var355 = class17.field262.method1073(false);
                int var356 = class17.field262.method1062(98);
                class215.method1542(var355, 128, var356);
                class280.field4915 = -1;
                return true;
            } else if (class280.field4915 == 83) {
                long var357 = class17.field262.method1043(false);
                long var359 = (long) class17.field262.method1050(1272006568);
                long var361 = (long) class17.field262.method1065((byte) 99);
                boolean var363 = false;
                int var364 = class17.field262.method1045((byte) 89);
                int var365 = class17.field262.method1050(1272006568);
                long var366 = (var359 << 32) + var361;
                int var368 = 0;
                label1610: while (true) {
                    if (var368 >= 100) {
                        if (var364 <= 1) {
                            for (int var369 = 0; var369 < class54.field1013; var369++) {
                                if (class282.field4963[var369] == var357) {
                                    var363 = true;
                                    break label1610;
                                }
                            }
                        }
                        break;
                    }
                    if (class133.field2304[var368] == var366) {
                        var363 = true;
                        break;
                    }
                    var368++;
                }
                if (!var363 && class56.field1043 == 0) {
                    class133.field2304[class227.field4171] = var366;
                    class227.field4171 = (class227.field4171 + 1) % 100;
                    class207 var370 = class83.method621(var365, 120).method1527(class17.field262, (byte) -105);
                    if (var364 == 2) {
                        class74.method539(89, var370, class105.method757(false, new class207[] { class270.field4779, class21.method125(85, var357).method1423(116) }), 18, (class207) null, var365);
                    } else if (var364 == 1) {
                        class74.method539(126, var370, class105.method757(false, new class207[] { class276.field4849, class21.method125(-14, var357).method1423(arg0 + 216) }), 18, (class207) null, var365);
                    } else {
                        class74.method539(92, var370, class21.method125(arg0 + 66, var357).method1423(127), 18, (class207) null, var365);
                    }
                }
                class280.field4915 = -1;
                return true;
            } else if (class280.field4915 == 106 || class280.field4915 == 165 || class280.field4915 == 186 || class280.field4915 == 98 || class280.field4915 == 52 || class280.field4915 == 231 || class280.field4915 == 190 || class280.field4915 == 54 || class280.field4915 == 208 || class280.field4915 == 60 || class280.field4915 == 79 || class280.field4915 == 194 || class280.field4915 == 147) {
                class188.method1314(arg0 ^ 0xFFFFFF9D);
                class280.field4915 = -1;
                return true;
            } else if (class280.field4915 == 168) {
                int var371 = class17.field262.method1050(arg0 + 1272006666);
                if (class270.method1845((byte) 127, var371)) {
                    class119.method852((byte) 35);
                }
                class280.field4915 = -1;
                return true;
            } else {
                class202.method1402("T1 - " + class280.field4915 + "," + class249.field4515 + "," + class245.field4443 + " - " + class245.field4437, 32701, (Throwable) null);
                class97.method687(-22455);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(B)V")
    public static final void method490(byte arg0) {
        if (class280.field4923 > 1) {
            class99.field1779 = class193.field3395;
            class280.field4923--;
        }
        field1219++;
        if (class51.field994 > 0) {
            class51.field994--;
        }
        if (class167.field2930) {
            class167.field2930 = false;
            class60.method445(arg0 + 28551);
            return;
        }
        for (int var1 = 0; var1 < 100 && class40.method303(24006); var1++) {
        }
        if (class250.field4524 != 30) {
            return;
        }
        class70.method507(class261.field4645, arg0 - 6, 212);
        Object var2 = class45.field887.field2931;
        synchronized (class45.field887.field2931) {
            if (!class288.field5139) {
                class45.field887.field2939 = 0;
            } else if (class270.field4778 != 0 || class45.field887.field2939 >= 40) {
                class261.field4645.method767(174, (byte) 49);
                class261.field4645.method1041(true, 0);
                class39.field784++;
                int var3 = class261.field4645.field2593;
                int var4 = 0;
                for (int var5 = 0; class45.field887.field2939 > var5 && class261.field4645.field2593 - var3 < 240; var5++) {
                    var4++;
                    int var6 = class45.field887.field2938[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    boolean var7 = false;
                    int var8 = class45.field887.field2942[var5];
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 65534) {
                        var8 = 65534;
                    }
                    if (class45.field887.field2938[var5] == -1 && class45.field887.field2942[var5] == -1) {
                        var6 = -1;
                        var8 = -1;
                        var7 = true;
                    }
                    if (class107.field1899 != var8 || class280.field4918 != var6) {
                        int var9 = var8 - class107.field1899;
                        class107.field1899 = var8;
                        int var10 = var6 - class280.field4918;
                        class280.field4918 = var6;
                        if (class197.field3468 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var10 += 32;
                            var9 += 32;
                            class261.field4645.method1083(false, (class197.field3468 << 12) + (var9 << 6) + var10);
                            class197.field3468 = 0;
                        } else if (class197.field3468 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                            var10 += 128;
                            var9 += 128;
                            class261.field4645.method1041(true, class197.field3468 + 128);
                            class261.field4645.method1083(false, (var9 << 8) + var10);
                            class197.field3468 = 0;
                        } else if (class197.field3468 < 32) {
                            class261.field4645.method1041(true, class197.field3468 + 192);
                            if (var7) {
                                class261.field4645.method1068(Integer.MIN_VALUE, 116);
                            } else {
                                class261.field4645.method1068(var8 | var6 << 16, 119);
                            }
                            class197.field3468 = 0;
                        } else {
                            class261.field4645.method1083(false, class197.field3468 + 57344);
                            if (var7) {
                                class261.field4645.method1068(Integer.MIN_VALUE, arg0 ^ 0x25);
                            } else {
                                class261.field4645.method1068(var8 | var6 << 16, 107);
                            }
                            class197.field3468 = 0;
                        }
                    } else if (class197.field3468 < 2047) {
                        class197.field3468++;
                    }
                }
                class261.field4645.method1074(class261.field4645.field2593 - var3, arg0 ^ 0x788B7572);
                if (var4 < class45.field887.field2939) {
                    class45.field887.field2939 -= var4;
                    for (int var11 = 0; var11 < class45.field887.field2939; var11++) {
                        class45.field887.field2942[var11] = class45.field887.field2942[var4 + var11];
                        class45.field887.field2938[var11] = class45.field887.field2938[var11 + var4];
                    }
                } else {
                    class45.field887.field2939 = 0;
                }
            }
        }
        if (class270.field4778 != 0) {
            class160.field2834++;
            long var12 = (class241.field4403 - class57.field1054) / 50L;
            class57.field1054 = class241.field4403;
            int var14 = class47.field939;
            if (var12 > 32767L) {
                var12 = 32767L;
            }
            int var15 = class121.field2092;
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 65535) {
                var14 = 65535;
            }
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            byte var16 = 0;
            if (class270.field4778 == 2) {
                var16 = 1;
            }
            class261.field4645.method767(78, (byte) 44);
            int var17 = (int) var12;
            class261.field4645.method1042(var16 << 15 | var17, -113);
            class261.field4645.method1063(arg0 - 173, var14 << 16 | var15);
        }
        if (class223.field4087 > 0) {
            class223.field4087--;
        }
        if (class214.field3808) {
            for (int var18 = 0; var18 < class113.field1975; var18++) {
                int var19 = class107.field1909[var18];
                if (var19 == 98 || var19 == 99 || var19 == 96 || var19 == 97) {
                    class233.field4291 = true;
                    break;
                }
            }
        } else if (class165.field2920[96] || class165.field2920[97] || class165.field2920[98] || class165.field2920[99]) {
            class233.field4291 = true;
        }
        if (class233.field4291 && class223.field4087 <= 0) {
            class3.field50++;
            class223.field4087 = 20;
            class233.field4291 = false;
            class261.field4645.method767(191, (byte) 96);
            class261.field4645.method1033((byte) 16, class25.field533);
            class261.field4645.method1083(false, class266.field4711);
        }
        if (class150.field2631 && !class260.field4642) {
            class260.field4642 = true;
            class261.field4645.method767(201, (byte) 85);
            class87.field1589++;
            class261.field4645.method1041(true, 1);
        }
        if (!class150.field2631 && class260.field4642) {
            class260.field4642 = false;
            class261.field4645.method767(201, (byte) 49);
            class87.field1589++;
            class261.field4645.method1041(true, 0);
        }
        if (!class269.field4768) {
            class261.field4645.method767(133, (byte) 45);
            class163.field2876++;
            class261.field4645.method1051(class220.method1560((byte) 48), -44);
            class269.field4768 = true;
        }
        if (arg0 != 85) {
            method495(79, -113, (byte) 114);
        }
        class217.method1551((byte) 45);
        if (class250.field4524 != 30) {
            return;
        }
        class151.method1093(-23132);
        class73.method528(0);
        class275.method1872((byte) 118);
        class132.field2293++;
        if (class132.field2293 > 750) {
            class60.method445(28636);
            return;
        }
        class228.method1624(arg0 ^ 0xFFFFDCE9);
        class173.method1239(-122);
        class214.method1532(-109);
        if (class231.field4240 != null) {
            class113.method811(-1);
        }
        for (int var20 = class41.method312(true, (byte) 73); var20 != -1; var20 = class41.method312(false, (byte) 12)) {
            class140.method968(var20, 9);
            class129.field2246[class121.method860(31, class19.field316++)] = var20;
        }
        for (class90 var21 = class94.method682((byte) 88); var21 != null; var21 = class94.method682((byte) 88)) {
            int var22 = var21.method650((byte) -76);
            int var23 = var21.method654((byte) -43);
            if (var22 == 1) {
                class186.field3291[var23] = var21.field1621;
                class161.field2851[class121.method860(31, class85.field1557++)] = var23;
            } else if (var22 == 2) {
                class40.field797[var23] = var21.field1615;
                class286.field5113[class121.method860(31, class187.field3306++)] = var23;
            } else if (var22 == 3) {
                class220 var44 = class233.method1667(var23, 79);
                if (!var21.field1615.method1436(var44.field3998, (byte) 48)) {
                    var44.field3998 = var21.field1615;
                    class82.method614((byte) 104, var44);
                }
            } else if (var22 == 4) {
                class220 var24 = class233.method1667(var23, arg0 ^ 0x35);
                int var25 = var21.field1621;
                int var26 = var21.field1613;
                int var27 = var21.field1612;
                if (var24.field3944 != var25 || var24.field4047 != var26 || var24.field4016 != var27) {
                    var24.field4016 = var27;
                    var24.field4047 = var26;
                    var24.field3944 = var25;
                    class82.method614((byte) 114, var24);
                }
            } else if (var22 == 5) {
                class220 var28 = class233.method1667(var23, 55);
                if (var21.field1621 != var28.field3882 || var21.field1621 == -1) {
                    var28.field4012 = 1;
                    var28.field4017 = 0;
                    var28.field3882 = var21.field1621;
                    var28.field4033 = 0;
                    class82.method614((byte) 66, var28);
                }
            } else if (var22 == 6) {
                int var38 = var21.field1621;
                int var39 = (var38 & 0x7D8B) >> 10;
                int var40 = var38 >> 5 & 0x1F;
                int var41 = var38 & 0x1F;
                int var42 = (var41 << 3) + (var39 << 19) + (var40 << 11);
                class220 var43 = class233.method1667(var23, arg0 ^ 0x3B);
                if (var43.field3993 != var42) {
                    var43.field3993 = var42;
                    class82.method614((byte) 112, var43);
                }
            } else if (var22 == 7) {
                class220 var29 = class233.method1667(var23, 70);
                boolean var30 = var21.field1621 == 1;
                if (var29.field3904 != var30) {
                    var29.field3904 = var30;
                    class82.method614((byte) 111, var29);
                }
            } else if (var22 == 8) {
                class220 var37 = class233.method1667(var23, 121);
                if (var21.field1621 != var37.field3987 || var21.field1613 != var37.field3875 || var21.field1612 != var37.field3881) {
                    var37.field3875 = var21.field1613;
                    var37.field3881 = var21.field1612;
                    var37.field3987 = var21.field1621;
                    if (var37.field3884 != -1) {
                        if (var37.field4063 > 0) {
                            var37.field3881 = var37.field3881 * 32 / var37.field4063;
                        } else if (var37.field3995 > 0) {
                            var37.field3881 = var37.field3881 * 32 / var37.field3995;
                        }
                    }
                    class82.method614((byte) 39, var37);
                }
            } else if (var22 == 9) {
                class220 var31 = class233.method1667(var23, 81);
                if (var21.field1621 != var31.field3884 || var21.field1613 != var31.field3911) {
                    var31.field3911 = var21.field1613;
                    var31.field3884 = var21.field1621;
                    class82.method614((byte) 64, var31);
                }
            } else if (var22 == 10) {
                class220 var36 = class233.method1667(var23, 33);
                if (var21.field1621 != var36.field3877 || var21.field1613 != var36.field3977 || var21.field1612 != var36.field3920) {
                    var36.field3920 = var21.field1612;
                    var36.field3977 = var21.field1613;
                    var36.field3877 = var21.field1621;
                    class82.method614((byte) 46, var36);
                }
            } else if (var22 == 11) {
                class220 var32 = class233.method1667(var23, 50);
                var32.field3912 = var32.field3878 = var21.field1613;
                var32.field3950 = 0;
                var32.field3909 = var32.field4005 = var21.field1621;
                var32.field3889 = 0;
                class82.method614((byte) 112, var32);
            } else if (var22 == 12) {
                class220 var33 = class233.method1667(var23, arg0 - 43);
                int var34 = var21.field1621;
                if (var33 != null && var33.field3988 == 0) {
                    if (var34 > var33.field3991 - var33.field3948) {
                        var34 = var33.field3991 - var33.field3948;
                    }
                    if (var34 < 0) {
                        var34 = 0;
                    }
                    if (var33.field4059 != var34) {
                        var33.field4059 = var34;
                        class82.method614((byte) 113, var33);
                    }
                }
            } else if (var22 == 13) {
                class220 var35 = class233.method1667(var23, 26);
                var35.field4020 = var21.field1621;
            }
        }
        if (class178.field3209 != 0) {
            class22.field377 += 20;
            if (class22.field377 >= 400) {
                class178.field3209 = 0;
            }
        }
        class20.field325++;
        if (class41.field816 != null) {
            class14.field212++;
            if (class14.field212 >= 15) {
                class82.method614((byte) 122, class41.field816);
                class41.field816 = null;
            }
        }
        if (class70.field1245 != null) {
            class82.method614((byte) 116, class70.field1245);
            class279.field4905++;
            if (class287.field5123 + 5 < class20.field322 || class20.field322 < class287.field5123 - 5 || (class267.field4721 + 5) < class268.field4747 || (class267.field4721 - 5) > class268.field4747) {
                class199.field3493 = true;
            }
            if (class247.field4479 == 0) {
                if (class199.field3493 && class279.field4905 >= 5) {
                    if (class70.field1245 == class185.field3282 && class283.field4978 != class167.field2937) {
                        class220 var45 = class70.field1245;
                        class288.field5145++;
                        byte var46 = 0;
                        if (class283.field4968 == 1 && var45.field3960 == 206) {
                            var46 = 1;
                        }
                        if (var45.field3963[class167.field2937] <= 0) {
                            var46 = 0;
                        }
                        if (client.method1112(var45).method823((byte) 71)) {
                            int var49 = class167.field2937;
                            int var50 = class283.field4978;
                            var45.field3963[var49] = var45.field3963[var50];
                            var45.field3939[var49] = var45.field3939[var50];
                            var45.field3963[var50] = -1;
                            var45.field3939[var50] = 0;
                        } else if (var46 == 1) {
                            int var47 = class283.field4978;
                            int var48 = class167.field2937;
                            while (var47 != var48) {
                                if (var48 < var47) {
                                    var45.method1564(var47 - 1, var47, arg0 ^ 0x56);
                                    var47--;
                                } else if (var47 < var48) {
                                    var45.method1564(var47 + 1, var47, 3);
                                    var47++;
                                }
                            }
                        } else {
                            var45.method1564(class167.field2937, class283.field4978, 3);
                        }
                        class261.field4645.method767(60, (byte) 108);
                        class261.field4645.method1033((byte) 16, class283.field4978);
                        class261.field4645.method1083(false, class167.field2937);
                        class261.field4645.method1082(arg0 - 337, var46);
                        class261.field4645.method1068(class70.field1245.field3933, 126);
                    }
                } else if ((class276.field4848 == 1 || class174.method1251(class268.field4751 - 1, 17412)) && class268.field4751 > 2) {
                    class158.method1153(15);
                } else if (class268.field4751 > 0) {
                    class160.method1166((byte) 64);
                }
                class270.field4778 = 0;
                class70.field1245 = null;
                class14.field212 = 10;
            }
        }
        class113.field1975 = 0;
        class55.field1026 = false;
        class220 var51 = class115.field1991;
        class270.field4783 = false;
        class220 var52 = class204.field3597;
        class115.field1991 = null;
        class204.field3597 = null;
        class9.field121 = null;
        while (class117.method822(arg0 ^ 0x55) && class113.field1975 < 128) {
            class107.field1909[class113.field1975] = class252.field4537;
            class131.field2274[class113.field1975] = class128.field2234;
            class113.field1975++;
        }
        class231.field4240 = null;
        if (class165.field2915 != -1) {
            class133.method937(class244.field4428, class165.field2915, 0, 0, 0, class31.field625, 0, arg0 ^ 0xFFFFFFD2);
        }
        class193.field3395++;
        while (true) {
            class206 var53;
            class220 var54;
            class220 var55;
            do {
                var53 = (class206) class16.field251.method927(false);
                if (var53 == null) {
                    while (true) {
                        class206 var56;
                        class220 var57;
                        class220 var58;
                        do {
                            var56 = (class206) class83.field1526.method927(false);
                            if (var56 == null) {
                                while (true) {
                                    class206 var59;
                                    class220 var60;
                                    class220 var61;
                                    do {
                                        var59 = (class206) class129.field2251.method927(false);
                                        if (var59 == null) {
                                            if (class231.field4240 == null) {
                                                class55.field1039 = 0;
                                            }
                                            if (class33.field659 != null) {
                                                class265.method1823(110);
                                            }
                                            if (class123.field2134 > 0 && class165.field2920[82] && class165.field2920[81] && class249.field4514 != 0) {
                                                int var62 = class93.field1645 - class249.field4514;
                                                if (var62 < 0) {
                                                    var62 = 0;
                                                } else if (var62 > 3) {
                                                    var62 = 3;
                                                }
                                                class133.method935(class202.field3565.field5074[0] + class180.field3231, var62, class202.field3565.field5022[0] + class21.field349, true);
                                            }
                                            if (class123.field2134 > 0 && class165.field2920[82] && class165.field2920[81]) {
                                                if (class33.field665 != -1) {
                                                    class133.method935(class27.field559 + class180.field3231, class93.field1645, class33.field665 + class21.field349, true);
                                                }
                                                class67.field1200 = 0;
                                                class81.field1476 = 0;
                                            } else if (class81.field1476 == 2) {
                                                if (class33.field665 != -1) {
                                                    class261.field4645.method767(168, (byte) 99);
                                                    class113.field1963++;
                                                    class261.field4645.method1033((byte) 16, class27.field559 + class180.field3231);
                                                    class261.field4645.method1085(class13.field176, (byte) 75);
                                                    class261.field4645.method1083(false, class231.field4236);
                                                    class261.field4645.method1033((byte) 16, class21.field349 + class33.field665);
                                                    class22.field377 = 0;
                                                    class204.field3599 = class121.field2092;
                                                    class13.field193 = class47.field939;
                                                    class178.field3209 = 1;
                                                }
                                                class81.field1476 = 0;
                                            } else if (class67.field1200 == 2) {
                                                if (class33.field665 != -1) {
                                                    class261.field4645.method767(97, (byte) 34);
                                                    class237.field4363++;
                                                    class261.field4645.method1033((byte) 16, class33.field665 + class21.field349);
                                                    class261.field4645.method1083(false, class27.field559 + class180.field3231);
                                                    class204.field3599 = class121.field2092;
                                                    class178.field3209 = 1;
                                                    class13.field193 = class47.field939;
                                                    class22.field377 = 0;
                                                }
                                                class67.field1200 = 0;
                                            } else if (class33.field665 != -1 && class81.field1476 == 0 && class67.field1200 == 0) {
                                                boolean var63 = class74.method538(class202.field3565.field5074[0], class202.field3565.field5022[0], -8673, 0, class33.field665, 0, 0, true, class27.field559, 0, 0, 0);
                                                if (var63) {
                                                    class178.field3209 = 1;
                                                    class22.field377 = 0;
                                                    class13.field193 = class47.field939;
                                                    class204.field3599 = class121.field2092;
                                                }
                                            }
                                            class33.field665 = -1;
                                            class159.method1160(false);
                                            if (class204.field3597 != var52) {
                                                if (var52 != null) {
                                                    class82.method614((byte) 111, var52);
                                                }
                                                if (class204.field3597 != null) {
                                                    class82.method614((byte) 116, class204.field3597);
                                                }
                                            }
                                            if (class115.field1991 != var51 && class31.field622 == class153.field2660) {
                                                if (var51 != null) {
                                                    class82.method614((byte) 117, var51);
                                                }
                                                if (class115.field1991 != null) {
                                                    class82.method614((byte) 101, class115.field1991);
                                                }
                                            }
                                            if (class115.field1991 == null) {
                                                if (class153.field2660 > 0) {
                                                    class153.field2660--;
                                                }
                                            } else if (class153.field2660 < class31.field622) {
                                                class153.field2660++;
                                                if (class31.field622 == class153.field2660) {
                                                    class82.method614((byte) 55, class115.field1991);
                                                }
                                            }
                                            if (class132.field2290 == 1) {
                                                class47.method360(true);
                                            } else if (class132.field2290 == 2) {
                                                class97.method686((byte) 111);
                                            } else {
                                                class41.method310(arg0 ^ 0x54);
                                            }
                                            for (int var64 = 0; var64 < 5; var64++) {
                                                int var10002 = class279.field4895[var64]++;
                                            }
                                            int var65 = class194.method1348(false);
                                            int var66 = class246.method1727(true);
                                            if (var65 > 15000 && var66 > 15000) {
                                                class51.field994 = 250;
                                                class219.field3861++;
                                                class65.method473(-28987, 14500);
                                                class261.field4645.method767(164, (byte) 116);
                                            }
                                            if (class185.field3284 != null && class185.field3284.field1696 == 1) {
                                                if (class185.field3284.field1699 != null) {
                                                    class190.method1326(class31.field624, class161.field2852, false);
                                                }
                                                class185.field3284 = null;
                                                class31.field624 = false;
                                                class161.field2852 = null;
                                            }
                                            class82.field1511++;
                                            class201.field3558++;
                                            if (class201.field3558 > 500) {
                                                class201.field3558 = 0;
                                                int var67 = (int) (Math.random() * 8.0D);
                                                if ((var67 & 0x4) == 4) {
                                                    class20.field328 += class85.field1539;
                                                }
                                                if ((var67 & 0x2) == 2) {
                                                    class286.field5112 += class141.field2444;
                                                }
                                                if ((var67 & 0x1) == 1) {
                                                    class136.field2341 += class228.field4181;
                                                }
                                            }
                                            if (class136.field2341 < -50) {
                                                class228.field4181 = 2;
                                            }
                                            if (class286.field5112 < -55) {
                                                class141.field2444 = 2;
                                            }
                                            if (class136.field2341 > 50) {
                                                class228.field4181 = -2;
                                            }
                                            if (class20.field328 < -40) {
                                                class85.field1539 = 1;
                                            }
                                            if (class20.field328 > 40) {
                                                class85.field1539 = -1;
                                            }
                                            class263.field4682++;
                                            if (class286.field5112 > 55) {
                                                class141.field2444 = -2;
                                            }
                                            if (class263.field4682 > 500) {
                                                class263.field4682 = 0;
                                                int var68 = (int) (Math.random() * 8.0D);
                                                if ((var68 & 0x1) == 1) {
                                                    class70.field1254 += class67.field1198;
                                                }
                                                if ((var68 & 0x2) == 2) {
                                                    class225.field4098 += class16.field255;
                                                }
                                            }
                                            if (class225.field4098 < -20) {
                                                class16.field255 = 1;
                                            }
                                            if (class70.field1254 < -60) {
                                                class67.field1198 = 2;
                                            }
                                            if (class225.field4098 > 10) {
                                                class16.field255 = -1;
                                            }
                                            if (class70.field1254 > 60) {
                                                class67.field1198 = -2;
                                            }
                                            if (class82.field1511 > 50) {
                                                class261.field4645.method767(10, (byte) 87);
                                                class178.field3211++;
                                            }
                                            if (class115.field1984) {
                                                class54.method409(-43);
                                                class115.field1984 = false;
                                            }
                                            try {
                                                if (class98.field1738 != null && class261.field4645.field2593 > 0) {
                                                    class98.field1738.method894(0, class261.field4645.field2568, class261.field4645.field2593, -51);
                                                    class82.field1511 = 0;
                                                    class261.field4645.field2593 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var69) {
                                                class60.method445(28636);
                                                return;
                                            }
                                        }
                                        var60 = var59.field3614;
                                        if (var60.field3893 < 0) {
                                            break;
                                        }
                                        var61 = class233.method1667(var60.field4045, 124);
                                    } while (var61 == null || var61.field3959 == null || var60.field3893 >= var61.field3959.length || var61.field3959[var60.field3893] != var60);
                                    class69.method501(arg0 - 26, var59);
                                }
                            }
                            var57 = var56.field3614;
                            if (var57.field3893 < 0) {
                                break;
                            }
                            var58 = class233.method1667(var57.field4045, 26);
                        } while (var58 == null || var58.field3959 == null || var57.field3893 >= var58.field3959.length || var58.field3959[var57.field3893] != var57);
                        class69.method501(62, var56);
                    }
                }
                var54 = var53.field3614;
                if (var54.field3893 < 0) {
                    break;
                }
                var55 = class233.method1667(var54.field4045, arg0 ^ 0x48);
            } while (var55 == null || var55.field3959 == null || var54.field3893 >= var55.field3959.length || var55.field3959[var54.field3893] != var54);
            class69.method501(72, var53);
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(II)V")
    public static final void method491(int arg0, int arg1) {
        if (arg0 != 32307) {
            return;
        }
        class276.field4842 = arg1;
        field1208++;
        class62.field1137 = -1;
        class48.field950 = -1;
        class288.method1965(1);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z)V")
    public static void method492(boolean arg0) {
        field1211 = null;
        if (arg0) {
            return;
        }
        field1207 = null;
        field1213 = null;
        field1209 = null;
        field1218 = null;
        field1214 = null;
        field1210 = null;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(III)Lli;")
    public static final class288 method493(int arg0, int arg1, int arg2) {
        class174 var3 = class82.field1498[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field3138; var4++) {
            class288 var5 = var3.field3140[var4];
            if ((var5.field5129 >> 29 & 0x3L) == 2L && var5.field5150 == arg1 && var5.field5140 == arg2) {
                class16.method99(var5);
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIILv;IIIIZ)V")
    public static final void method494(int arg0, int arg1, int arg2, class149 arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        field1212++;
        if (arg1 != 0) {
            method495(11, -3, (byte) 24);
        }
        if (arg2 < 0 || arg2 >= 104 || arg0 < 0 || arg0 >= 104) {
            while (true) {
                int var11 = arg3.method1045((byte) 83);
                if (var11 == 0) {
                    return;
                }
                if (var11 == 1) {
                    arg3.method1045((byte) -17);
                    return;
                }
                if (var11 <= 49) {
                    arg3.method1045((byte) 103);
                }
            }
        }
        if (!arg8) {
            class271.field4791[arg7][arg2][arg0] = 0;
        }
        while (true) {
            int var9 = arg3.method1045((byte) -67);
            if (var9 == 0) {
                if (arg8) {
                    class163.field2881[0][arg2][arg0] = class3.field47[0][arg2][arg0];
                    return;
                } else if (arg7 == 0) {
                    class163.field2881[0][arg2][arg0] = -class214.method1530(-99, arg0 + arg6 + 556238, arg2 + arg4 + 932731) * 8;
                    return;
                } else {
                    class163.field2881[arg7][arg2][arg0] = class163.field2881[arg7 - 1][arg2][arg0] - 240;
                    return;
                }
            }
            if (var9 == 1) {
                int var10 = arg3.method1045((byte) -122);
                if (arg8) {
                    class163.field2881[0][arg2][arg0] = var10 * 8 + class3.field47[0][arg2][arg0];
                    return;
                }
                if (var10 == 1) {
                    var10 = 0;
                }
                if (arg7 != 0) {
                    class163.field2881[arg7][arg2][arg0] = class163.field2881[arg7 - 1][arg2][arg0] - (var10 * 8);
                    return;
                }
                class163.field2881[0][arg2][arg0] = -var10 * 8;
                return;
            }
            if (var9 <= 49) {
                class255.field4563[arg7][arg2][arg0] = arg3.method1084((byte) 49);
                class266.field4719[arg7][arg2][arg0] = (byte) ((var9 - 2) / 4);
                class92.field1632[arg7][arg2][arg0] = (byte) class121.method860(var9 + arg5 - 2, 3);
            } else if (var9 > 81) {
                class163.field2875[arg7][arg2][arg0] = (byte) (var9 - 81);
            } else if (!arg8) {
                class271.field4791[arg7][arg2][arg0] = (byte) (var9 - 49);
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIB)V")
    public static final void method495(int arg0, int arg1, byte arg2) {
        class83.field1535[arg0] = arg1;
        field1215++;
        if (arg2 > -65) {
            return;
        }
        class59 var3 = (class59) class157.field2763.method1867((long) arg0, true);
        if (var3 == null) {
            class59 var4 = new class59(class53.method405(56) + 500L);
            class157.field2763.method1863((byte) -95, var4, (long) arg0);
        } else {
            var3.field1078 = class53.method405(14) + 500L;
        }
    }
}
