import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class296 extends class128 {

    @OriginalMember(owner = "client!ba", name = "u", descriptor = "I")
    public int field4729 = 0;

    @OriginalMember(owner = "client!ba", name = "E", descriptor = "I")
    public int field4739 = -1;

    @OriginalMember(owner = "client!ba", name = "r", descriptor = "[I")
    public static int[] field4726 = new int[32];

    @OriginalMember(owner = "client!ba", name = "t", descriptor = "I")
    public static int field4728 = 0;

    @OriginalMember(owner = "client!ba", name = "A", descriptor = "[Lvg;")
    public static class32[] field4735 = new class32[29];

    @OriginalMember(owner = "client!ba", name = "D", descriptor = "[Ljava/lang/String;")
    public static String[] field4738 = new String[100];

    @OriginalMember(owner = "client!ba", name = "m", descriptor = "I")
    public static int field4721;

    @OriginalMember(owner = "client!ba", name = "n", descriptor = "I")
    public static int field4722;

    @OriginalMember(owner = "client!ba", name = "o", descriptor = "I")
    public int field4723;

    @OriginalMember(owner = "client!ba", name = "p", descriptor = "I")
    public int field4724;

    @OriginalMember(owner = "client!ba", name = "q", descriptor = "I")
    public static int field4725;

    @OriginalMember(owner = "client!ba", name = "s", descriptor = "I")
    public int field4727;

    @OriginalMember(owner = "client!ba", name = "v", descriptor = "I")
    public int field4730;

    @OriginalMember(owner = "client!ba", name = "w", descriptor = "I")
    public int field4731;

    @OriginalMember(owner = "client!ba", name = "x", descriptor = "I")
    public int field4732;

    @OriginalMember(owner = "client!ba", name = "y", descriptor = "I")
    public static int field4733;

    @OriginalMember(owner = "client!ba", name = "B", descriptor = "I")
    public static int field4736;

    @OriginalMember(owner = "client!ba", name = "C", descriptor = "I")
    public int field4737;

    @OriginalMember(owner = "client!ba", name = "F", descriptor = "I")
    public int field4740;

    @OriginalMember(owner = "client!ba", name = "G", descriptor = "I")
    public static int field4741;

    @OriginalMember(owner = "client!ba", name = "H", descriptor = "I")
    public int field4742;

    @OriginalMember(owner = "client!ba", name = "I", descriptor = "I")
    public static int field4743;

    @OriginalMember(owner = "client!ba", name = "J", descriptor = "I")
    public int field4744;

    @OriginalMember(owner = "client!ba", name = "z", descriptor = "Lbl;")
    public static class146 field4734;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(Z)Z")
    public static final boolean method1962(boolean arg0) throws IOException {
        field4725++;
        if (class208.field3298 == null) {
            return false;
        }
        int var1 = class208.field3298.method972(0);
        if (var1 == 0) {
            return false;
        }
        if (class71.field1208 == -1) {
            class208.field3298.method979(class131.field2053.field2573, -1, 0, 1);
            class131.field2053.field2568 = 0;
            var1--;
            class71.field1208 = class131.field2053.method826((byte) -112);
            class47.field793 = class116.field1865[class71.field1208];
        }
        if (class47.field793 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class208.field3298.method979(class131.field2053.field2573, -1, 0, 1);
            var1--;
            class47.field793 = class131.field2053.field2573[0] & 0xFF;
        }
        if (class47.field793 == -2) {
            if (var1 <= 1) {
                return false;
            }
            class208.field3298.method979(class131.field2053.field2573, -1, 0, 2);
            class131.field2053.field2568 = 0;
            var1 -= 2;
            class47.field793 = class131.field2053.method1142(-18970);
        }
        if (var1 < class47.field793) {
            return false;
        }
        class131.field2053.field2568 = 0;
        class208.field3298.method979(class131.field2053.field2573, -1, 0, class47.field793);
        class89.field1454 = class81.field1342;
        class81.field1342 = class55.field904;
        class273.field4381 = 0;
        class55.field904 = class71.field1208;
        if (class71.field1208 == 138) {
            for (int var2 = 0; var2 < class195.field3160.length; var2++) {
                if (class301.field4817[var2] != class195.field3160[var2]) {
                    class195.field3160[var2] = class301.field4817[var2];
                    class5.method28(var2, !arg0);
                    class190.field3080[class51.method359(class268.field4319++, 31)] = var2;
                }
            }
            class71.field1208 = -1;
            return true;
        } else if (class71.field1208 == 209) {
            class107.method766((byte) 109);
            int var3 = class131.field2053.method1133((byte) 53);
            int var4 = class131.field2053.method1157(65280);
            int var5 = class131.field2053.method1168(65280);
            class88.field1442[var5] = var4;
            class228.field3670[var5] = var3;
            class230.field3729[var5] = 1;
            for (int var6 = 0; var6 < 98; var6++) {
                if (client.field4853[var6] <= var4) {
                    class230.field3729[var5] = var6 + 2;
                }
            }
            field4726[class51.method359(class97.field1560++, 31)] = var5;
            class71.field1208 = -1;
            return true;
        } else if (class71.field1208 == 251) {
            int var7 = class131.field2053.method1151((byte) -122);
            int var8 = class131.field2053.method1145(-119);
            int var9 = class131.field2053.method1143(65280);
            if (var8 == 65535) {
                var8 = -1;
            }
            int var10 = class131.field2053.method1142(-18970);
            if (var10 == 65535) {
                var10 = -1;
            }
            int var11 = class131.field2053.method1142(-18970);
            if (class82.method569(var9, (byte) -118)) {
                for (int var12 = var10; var12 <= var8; var12++) {
                    long var13 = ((long) var7 << 32) + (long) var12;
                    class223 var15 = (class223) class143.field2269.method1059(0, var13);
                    class223 var16;
                    if (var15 != null) {
                        var16 = new class223(var15.field3629, var11);
                        var15.method913(-3542);
                    } else if (var12 == -1) {
                        var16 = new class223(class17.method87(var7, -20055).field3422.field3629, var11);
                    } else {
                        var16 = new class223(0, var11);
                    }
                    class143.field2269.method1052(var13, (byte) -65, var16);
                }
            }
            class71.field1208 = -1;
            return true;
        } else if (class71.field1208 == 165) {
            boolean var17 = class131.field2053.method1133((byte) 53) == 1;
            String var18 = class131.field2053.method1152(-115);
            String var19 = var18;
            if (var17) {
                var19 = class131.field2053.method1152(-71);
            }
            long var20 = (long) class131.field2053.method1142(-18970);
            long var22 = (long) class131.field2053.method1137(31155);
            boolean var24 = false;
            int var25 = class131.field2053.method1133((byte) 53);
            long var26 = (var20 << 32) + var22;
            int var28 = 0;
            while (true) {
                if (var28 >= 100) {
                    if (var25 <= 1) {
                        if (!(!class96.field1542 || class69.field1139) || class83.field1385) {
                            var24 = true;
                        } else if (class4.method22(0, var19)) {
                            var24 = true;
                        }
                    }
                    break;
                }
                if (class64.field1068[var28] == var26) {
                    var24 = true;
                    break;
                }
                var28++;
            }
            if (!var24 && class66.field1104 == 0) {
                class64.field1068[class201.field3223] = var26;
                class201.field3223 = (class201.field3223 + 1) % 100;
                String var29 = class93.method630(class223.method1533((byte) -26, class214.method1487(class131.field2053, 113)));
                if (var25 == 2) {
                    class25.method136("<img=1>" + var19, -1, (String) null, "<img=1>" + var18, (byte) -5, 0, var29, 7);
                } else if (var25 == 1) {
                    class25.method136("<img=0>" + var19, -1, (String) null, "<img=0>" + var18, (byte) -5, 0, var29, 7);
                } else {
                    class25.method136(var19, -1, (String) null, var18, (byte) -5, 0, var29, 3);
                }
            }
            class71.field1208 = -1;
            return true;
        } else if (class71.field1208 == 34 || class71.field1208 == 186 || class71.field1208 == 150 || class71.field1208 == 124 || class71.field1208 == 137 || class71.field1208 == 158 || class71.field1208 == 66 || class71.field1208 == 103 || class71.field1208 == 235 || class71.field1208 == 60 || class71.field1208 == 189 || class71.field1208 == 118 || class71.field1208 == 91 || class71.field1208 == 11) {
            class86.method587(true);
            class71.field1208 = -1;
            return true;
        } else if (class71.field1208 == 201) {
            int var30 = class131.field2053.method1142(-18970);
            String var31 = class131.field2053.method1152(-105);
            Object[] var32 = new Object[var31.length() + 1];
            for (int var33 = var31.length() - 1; var33 >= 0; var33--) {
                if (var31.charAt(var33) == 's') {
                    var32[var33 + 1] = class131.field2053.method1152(-66);
                } else {
                    var32[var33 + 1] = Integer.valueOf(class131.field2053.method1157(65280));
                }
            }
            var32[0] = Integer.valueOf(class131.field2053.method1157(65280));
            if (class82.method569(var30, (byte) -101)) {
                class126 var34 = new class126();
                var34.field1989 = var32;
                class137.method960(200000, var34);
            }
            class71.field1208 = -1;
            return true;
        } else if (class71.field1208 == 40) {
            int var35 = class131.field2053.method1133((byte) 53);
            int var36 = class131.field2053.method1143(65280);
            if (var36 == 65535) {
                var36 = -1;
            }
            int var37 = class131.field2053.method1168(65280);
            String var38 = class131.field2053.method1152(-65);
            if (var35 >= 1 && var35 <= 8) {
                if (var38.equalsIgnoreCase("null")) {
                    var38 = null;
                }
                class61.field999[var35 - 1] = var38;
                class247.field3937[var35 - 1] = var36;
                class267.field4300[var35 - 1] = var37 == 0;
            }
            class71.field1208 = -1;
            return true;
        } else if (class71.field1208 == 179) {
            class1.method7(class131.field2053, class268.field4323, class47.field793, true);
            class71.field1208 = -1;
            return true;
        } else if (class71.field1208 == 12) {
            class107.method766((byte) -112);
            class308.field4930 = class131.field2053.method1146(2);
            class71.field1208 = -1;
            class304.field4874 = class74.field1237;
            return true;
        } else if (class71.field1208 == 87) {
            class309.field4938 = class131.field2053.method1127((byte) 103);
            class165.field2654 = class131.field2053.method1168(65280);
            for (int var39 = class165.field2654; var39 < class165.field2654 + 8; var39++) {
                for (int var41 = class309.field4938; var41 < (class309.field4938 + 8); var41++) {
                    if (class192.field3113[class56.field941][var39][var41] != null) {
                        class192.field3113[class56.field941][var39][var41] = null;
                        class247.method1652(var39, 64, var41);
                    }
                }
            }
            for (class296 var40 = (class296) class62.field1020.method1643((byte) -95); var40 != null; var40 = (class296) class62.field1020.method1642((byte) 108)) {
                if (var40.field4730 >= class165.field2654 && class165.field2654 + 8 > var40.field4730 && class309.field4938 <= var40.field4731 && var40.field4731 < (class309.field4938 + 8) && class56.field941 == var40.field4744) {
                    var40.field4739 = 0;
                }
            }
            class71.field1208 = -1;
            return true;
        } else if (class71.field1208 == 132) {
            int var42 = class131.field2053.method1133((byte) 53);
            int var43 = var42 >> 5;
            int var44 = var42 & 0x1F;
            if (var44 == 0) {
                client.field4852[var43] = null;
                class71.field1208 = -1;
                return true;
            }
            class56 var45 = new class56();
            var45.field942 = var44;
            var45.field935 = class131.field2053.method1133((byte) 53);
            if (var45.field935 >= 0 && class259.field4177.length > var45.field935) {
                if (var45.field942 == 1 || var45.field942 == 10) {
                    var45.field930 = class131.field2053.method1142(-18970);
                    class131.field2053.field2568 += 5;
                } else if (var45.field942 >= 2 && var45.field942 <= 6) {
                    if (var45.field942 == 2) {
                        var45.field937 = 64;
                        var45.field940 = 64;
                    }
                    if (var45.field942 == 3) {
                        var45.field940 = 0;
                        var45.field937 = 64;
                    }
                    if (var45.field942 == 4) {
                        var45.field940 = 128;
                        var45.field937 = 64;
                    }
                    if (var45.field942 == 5) {
                        var45.field940 = 64;
                        var45.field937 = 0;
                    }
                    if (var45.field942 == 6) {
                        var45.field937 = 128;
                        var45.field940 = 64;
                    }
                    var45.field942 = 2;
                    var45.field931 = class131.field2053.method1142(-18970);
                    var45.field934 = class131.field2053.method1142(-18970);
                    var45.field936 = class131.field2053.method1133((byte) 53);
                    var45.field928 = class131.field2053.method1142(-18970);
                }
                var45.field932 = class131.field2053.method1142(-18970);
                if (var45.field932 == 65535) {
                    var45.field932 = -1;
                }
                client.field4852[var43] = var45;
            }
            class71.field1208 = -1;
            return true;
        } else if (class71.field1208 == 233) {
            int var46 = class131.field2053.method1145(-81);
            int var47 = class131.field2053.method1142(-18970);
            String var48 = class131.field2053.method1152(-116);
            if (class82.method569(var47, (byte) -106)) {
                class215.method1495(var48, var46, (byte) 103);
            }
            class71.field1208 = -1;
            return true;
        } else if (class71.field1208 == 77) {
            int var49 = class131.field2053.method1142(-18970);
            int var50 = class131.field2053.method1157(65280);
            if (class82.method569(var49, (byte) -127)) {
                class97 var51 = (class97) class244.field3880.method1059(0, (long) var50);
                if (var51 != null) {
                    class285.method1897(var51, 107, true);
                }
                if (class61.field994 != null) {
                    class117.method834(class61.field994, (byte) -57);
                    class61.field994 = null;
                }
            }
            class71.field1208 = -1;
            return true;
        } else if (class71.field1208 == 183) {
            String var52 = class131.field2053.method1152(-117);
            int var53 = class131.field2053.method1142(-18970);
            String var54 = class46.method330((byte) 83, var53).method592(class131.field2053, -128);
            class25.method136(var52, var53, (String) null, var52, (byte) -5, 0, var54, 19);
            class71.field1208 = -1;
            return true;
        } else if (class71.field1208 == 64) {
            int var55 = class131.field2053.method1151((byte) 39);
            int var56 = class131.field2053.method1143(65280);
            int var57 = class131.field2053.method1145(-51);
            int var58 = class131.field2053.method1147(-9173);
            if (class82.method569(var56, (byte) -111)) {
                class97.method668((byte) -82, var55, (var58 << 16) + var57);
            }
            class71.field1208 = -1;
            return true;
        } else if (class71.field1208 == 172) {
            class190.method1349(-79);
            class71.field1208 = -1;
            return true;
        } else if (class71.field1208 == 247) {
            String var59 = class131.field2053.method1152(-109);
            boolean var60 = class131.field2053.method1133((byte) 53) == 1;
            boolean var61 = false;
            String var62;
            if (var60) {
                var62 = class131.field2053.method1152(-68);
            } else {
                var62 = var59;
            }
            int var63 = class131.field2053.method1142(-18970);
            byte var64 = class131.field2053.method1107((byte) -112);
            if (var64 == -128) {
                var61 = true;
            }
            if (var61) {
                if (class215.field3553 == 0) {
                    class71.field1208 = -1;
                    return true;
                }
                boolean var65 = false;
                int var66;
                for (var66 = 0; class215.field3553 > var66 && (!class305.field4883[var66].field3024.equals(var62) || class305.field4883[var66].field3021 != var63); var66++) {
                }
                if (var66 < class215.field3553) {
                    while (class215.field3553 - 1 > var66) {
                        class305.field4883[var66] = class305.field4883[var66 + 1];
                        var66++;
                    }
                    class215.field3553--;
                    class305.field4883[class215.field3553] = null;
                }
            } else {
                String var67 = class131.field2053.method1152(-62);
                class185 var68 = new class185();
                var68.field3028 = var59;
                var68.field3021 = var63;
                var68.field3027 = var67;
                var68.field3026 = var64;
                var68.field3024 = var62;
                int var69;
                for (var69 = class215.field3553 - 1; var69 >= 0; var69--) {
                    int var70 = class305.field4883[var69].field3024.compareTo(var68.field3024);
                    if (var70 == 0) {
                        class305.field4883[var69].field3021 = var63;
                        class305.field4883[var69].field3026 = var64;
                        class305.field4883[var69].field3027 = var67;
                        if (var62.equals(class239.field3829.field4778)) {
                            class246.field3920 = var64;
                        }
                        class268.field4317 = class74.field1237;
                        class71.field1208 = -1;
                        return true;
                    }
                    if (var70 < 0) {
                        break;
                    }
                }
                if (class305.field4883.length <= class215.field3553) {
                    class71.field1208 = -1;
                    return true;
                }
                for (int var71 = class215.field3553 - 1; var71 > var69; var71--) {
                    class305.field4883[var71 + 1] = class305.field4883[var71];
                }
                if (class215.field3553 == 0) {
                    class305.field4883 = new class185[100];
                }
                class305.field4883[var69 + 1] = var68;
                class215.field3553++;
                if (var62.equals(class239.field3829.field4778)) {
                    class246.field3920 = var64;
                }
            }
            class71.field1208 = -1;
            class268.field4317 = class74.field1237;
            return true;
        } else if (class71.field1208 == 62) {
            boolean var72 = class131.field2053.method1133((byte) 53) == 1;
            String var73 = class131.field2053.method1152(-98);
            String var74 = var73;
            if (var72) {
                var74 = class131.field2053.method1152(-127);
            }
            long var75 = class131.field2053.method1119(!arg0);
            long var77 = (long) class131.field2053.method1142(-18970);
            long var79 = (long) class131.field2053.method1137(31155);
            int var81 = class131.field2053.method1133((byte) 53);
            long var82 = (var77 << 32) + var79;
            boolean var84 = false;
            int var85 = 0;
            while (true) {
                if (var85 >= 100) {
                    if (var81 <= 1) {
                        if (!(!class96.field1542 || class69.field1139) || class83.field1385) {
                            var84 = true;
                        } else if (class4.method22(0, var74)) {
                            var84 = true;
                        }
                    }
                    break;
                }
                if (class64.field1068[var85] == var82) {
                    var84 = true;
                    break;
                }
                var85++;
            }
            if (!var84 && class66.field1104 == 0) {
                class64.field1068[class201.field3223] = var82;
                class201.field3223 = (class201.field3223 + 1) % 100;
                String var86 = class93.method630(class223.method1533((byte) -26, class214.method1487(class131.field2053, 59)));
                if (var81 == 2 || var81 == 3) {
                    class25.method136("<img=1>" + var74, -1, class4.method24(var75, 0), "<img=1>" + var73, (byte) -5, 0, var86, 9);
                } else if (var81 == 1) {
                    class25.method136("<img=0>" + var74, -1, class4.method24(var75, 0), "<img=0>" + var73, (byte) -5, 0, var86, 9);
                } else {
                    class25.method136(var74, -1, class4.method24(var75, 0), var73, (byte) -5, 0, var86, 9);
                }
            }
            class71.field1208 = -1;
            return true;
        } else if (class71.field1208 == 240) {
            int var87 = class131.field2053.method1151((byte) 20);
            class67.field1110 = class268.field4323.method320(var87, (byte) 102);
            class71.field1208 = -1;
            return true;
        } else if (class71.field1208 == 119) {
            class179.field2916 = class131.field2053.method1133((byte) 53);
            class1.field19 = class131.field2053.method1133((byte) 53);
            class305.field4879 = class131.field2053.method1133((byte) 53);
            class71.field1208 = -1;
            return true;
        } else if (class71.field1208 == 216) {
            int var88 = class131.field2053.method1147(-9173);
            int var89 = class131.field2053.method1126((byte) 79);
            int var90 = class131.field2053.method1145(-45);
            class131 var91 = class12.field127[var90];
            if (var91 != null) {
                class182.method1316(119, var91, var88, var89);
            }
            class71.field1208 = -1;
            return true;
        } else if (class71.field1208 == 24) {
            class216.method1500(0);
            class71.field1208 = -1;
            return false;
        } else if (class71.field1208 == 174) {
            int var92 = class131.field2053.method1143(65280);
            int var93 = class131.field2053.method1166((byte) -20);
            if (class82.method569(var92, (byte) 50)) {
                class107.method764(2047, 5, 74, 0, var93);
            }
            class71.field1208 = -1;
            return true;
        } else if (class71.field1208 == 2) {
            class247.method1653(-55);
            class71.field1208 = -1;
            return true;
        } else if (class71.field1208 == 23) {
            int var94 = class131.field2053.method1157(65280);
            class211 var95 = class17.method87(var94, -20055);
            for (int var96 = 0; var96 < var95.field3361.length; var96++) {
                var95.field3361[var96] = -1;
                var95.field3361[var96] = 0;
            }
            class117.method834(var95, (byte) -57);
            class71.field1208 = -1;
            return true;
        } else if (class71.field1208 == 84) {
            int var97 = class131.field2053.method1142(-18970);
            int var98 = class131.field2053.method1145(-14);
            int var99 = class131.field2053.method1143(65280);
            if (class82.method569(var99, (byte) -104)) {
                class293.method1949(var98, 94, var97);
            }
            class71.field1208 = -1;
            return true;
        } else if (class71.field1208 == 95) {
            int var100 = class131.field2053.method1143(65280);
            byte var101 = class131.field2053.method1144((byte) -34);
            int var102 = class131.field2053.method1143(65280);
            if (class82.method569(var100, (byte) 63)) {
                class123.method863(var102, -122, var101);
            }
            class71.field1208 = -1;
            return true;
        } else if (class71.field1208 == 249) {
            int var103 = class131.field2053.method1142(-18970);
            byte var104 = class131.field2053.method1144((byte) -34);
            class209.method1455(arg0, var103, var104);
            class71.field1208 = -1;
            return true;
        } else if (class71.field1208 == 89) {
            int var105 = class131.field2053.method1157(65280);
            int var106 = class131.field2053.method1147(-9173);
            int var107 = class131.field2053.method1147(-9173);
            if (var107 == 65535) {
                var107 = -1;
            }
            int var108 = class131.field2053.method1157(65280);
            if (class82.method569(var106, (byte) 82)) {
                class211 var109 = class17.method87(var108, -20055);
                if (var109.field3337) {
                    class259.method1738(var108, var107, var105, 82);
                    class115 var111 = class81.method562(var107, -20358);
                    class244.method1634(var111.field1852, -1878362036, var111.field1830, var111.field1779, var108);
                    class19.method101(-82, var111.field1834, var108, var111.field1783, var111.field1825);
                } else if (var107 == -1) {
                    var109.field3501 = 0;
                    class71.field1208 = -1;
                    return true;
                } else {
                    class115 var110 = class81.method562(var107, -20358);
                    var109.field3343 = var110.field1779;
                    var109.field3382 = var110.field1830 * 100 / var105;
                    var109.field3485 = var107;
                    var109.field3456 = var110.field1852;
                    var109.field3501 = 4;
                    class117.method834(var109, (byte) -57);
                }
            }
            class71.field1208 = -1;
            return true;
        } else if (class71.field1208 == 142) {
            int var112 = class131.field2053.method1168(65280);
            int var113 = class131.field2053.method1147(-9173);
            class83.method573(var113, var112, (byte) 22);
            class71.field1208 = -1;
            return true;
        } else if (class71.field1208 == 246) {
            int var114 = class131.field2053.method1147(-9173);
            int var115 = class131.field2053.method1151((byte) 39);
            int var116 = class131.field2053.method1142(-18970);
            if (class82.method569(var116, (byte) 50)) {
                class201.method1404(var115, var114, -25219);
            }
            class71.field1208 = -1;
            return true;
        } else if (class71.field1208 == 41) {
            int var117 = class131.field2053.method1142(-18970);
            if (class82.method569(var117, (byte) -114)) {
                class119.method842(109);
            }
            class71.field1208 = -1;
            return true;
        } else if (class71.field1208 == 192) {
            int var118 = class131.field2053.method1142(-18970);
            if (var118 == 65535) {
                var118 = -1;
            }
            int var119 = class131.field2053.method1133((byte) 53);
            int var120 = class131.field2053.method1142(-18970);
            int var121 = class131.field2053.method1133((byte) 53);
            class272.method1818(124, var120, var121, var118, var119);
            class71.field1208 = -1;
            return true;
        } else if (class71.field1208 == 68) {
            int var122 = class131.field2053.method1142(-18970);
            int var123 = class131.field2053.method1142(-18970);
            int var124 = class131.field2053.method1145(-17);
            int var125 = class131.field2053.method1166((byte) -20);
            if (var125 >> 30 != 0) {
                int var126 = (var125 & 0x333DE422) >> 28;
                int var127 = (var125 >> 14 & 0x3FFF) - class276.field4438;
                int var128 = (var125 & 0x3FFF) - class108.field1732;
                if (var127 >= 0 && var128 >= 0 && var127 < 104 && var128 < 104) {
                    int var129 = var127 * 128 + 64;
                    int var130 = var128 * 128 + 64;
                    class141 var131 = new class141(var124, var126, var129, var130, class155.method1060((byte) -12, var126, var130, var129) - var122, var123, class29.field360);
                    class1.field10.method1646(true, new class134(var131));
                }
            } else if ((var125 >> 29) != 0) {
                int var132 = var125 & 0xFFFF;
                class131 var133 = class12.field127[var132];
                if (var133 != null) {
                    if (var124 == 65535) {
                        var124 = -1;
                    }
                    boolean var134 = true;
                    if (var124 != -1 && var133.field669 != -1) {
                        if (var133.field669 == var124) {
                            class55 var139 = class137.method958(var124, (byte) -99);
                            if (var139.field919 && var139.field908 != -1) {
                                class307 var140 = class22.method121(var139.field908, true);
                                int var141 = var140.field4893;
                                if (var141 == 1) {
                                    var133.field623 = class29.field360 + var123;
                                    var133.field640 = 1;
                                    var133.field627 = 0;
                                    var133.field630 = 0;
                                    var134 = false;
                                    var133.field660 = 0;
                                    class274.method1838(var133.field710, false, var140, var133.field627, (byte) -106, var133.field637);
                                } else if (var141 == 2) {
                                    var134 = false;
                                    var133.field617 = 0;
                                }
                            }
                        } else {
                            class55 var135 = class137.method958(var124, (byte) -8);
                            class55 var136 = class137.method958(var133.field669, (byte) -118);
                            if (var135.field908 != -1 && var136.field908 != -1) {
                                class307 var137 = class22.method121(var135.field908, true);
                                class307 var138 = class22.method121(var136.field908, true);
                                if (var137.field4898 < var138.field4898) {
                                    var134 = false;
                                }
                            }
                        }
                    }
                    if (var134) {
                        var133.field623 = class29.field360 + var123;
                        var133.field627 = 0;
                        var133.field669 = var124;
                        var133.field640 = 1;
                        var133.field660 = 0;
                        var133.field698 = var122;
                        if (class29.field360 < var133.field623) {
                            var133.field627 = -1;
                        }
                        if (var133.field669 != -1 && class29.field360 == var133.field623) {
                            int var142 = class137.method958(var133.field669, (byte) -127).field908;
                            if (var142 != -1) {
                                class307 var143 = class22.method121(var142, true);
                                if (var143 != null && var143.field4895 != null) {
                                    class274.method1838(var133.field710, false, var143, 0, (byte) -106, var133.field637);
                                }
                            }
                        }
                    }
                }
            } else if (var125 >> 28 != 0) {
                int var144 = var125 & 0xFFFF;
                class299 var145;
                if (class123.field1961 == var144) {
                    var145 = class239.field3829;
                } else {
                    var145 = class270.field4355[var144];
                }
                if (var145 != null) {
                    if (var124 == 65535) {
                        var124 = -1;
                    }
                    boolean var146 = true;
                    if (var124 != -1 && var145.field669 != -1) {
                        if (var145.field669 == var124) {
                            class55 var147 = class137.method958(var124, (byte) -119);
                            if (var147.field919 && var147.field908 != -1) {
                                class307 var148 = class22.method121(var147.field908, true);
                                int var149 = var148.field4893;
                                if (var149 == 1) {
                                    var145.field627 = 0;
                                    var145.field660 = 0;
                                    var145.field630 = 0;
                                    var146 = false;
                                    var145.field623 = class29.field360 + var123;
                                    var145.field640 = 1;
                                    class274.method1838(var145.field710, false, var148, var145.field627, (byte) -117, var145.field637);
                                } else if (var149 == 2) {
                                    var145.field617 = 0;
                                    var146 = false;
                                }
                            }
                        } else {
                            class55 var150 = class137.method958(var124, (byte) -103);
                            class55 var151 = class137.method958(var145.field669, (byte) -20);
                            if (var150.field908 != -1 && var151.field908 != -1) {
                                class307 var152 = class22.method121(var150.field908, !arg0);
                                class307 var153 = class22.method121(var151.field908, true);
                                if (var152.field4898 < var153.field4898) {
                                    var146 = false;
                                }
                            }
                        }
                    }
                    if (var146) {
                        var145.field623 = class29.field360 + var123;
                        var145.field660 = 0;
                        var145.field698 = var122;
                        var145.field669 = var124;
                        var145.field627 = 0;
                        if (class29.field360 < var145.field623) {
                            var145.field627 = -1;
                        }
                        var145.field640 = 1;
                        if (var145.field669 == 65535) {
                            var145.field669 = -1;
                        }
                        if (var145.field669 != -1 && class29.field360 == var145.field623) {
                            int var154 = class137.method958(var145.field669, (byte) 81).field908;
                            if (var154 != -1) {
                                class307 var155 = class22.method121(var154, !arg0);
                                if (var155 != null && var155.field4895 != null) {
                                    class274.method1838(var145.field710, class239.field3829 == var145, var155, 0, (byte) -121, var145.field637);
                                }
                            }
                        }
                    }
                }
            }
            class71.field1208 = -1;
            return true;
        } else if (class71.field1208 == 188) {
            class150.method1039(4095, false);
            class71.field1208 = -1;
            return true;
        } else if (class71.field1208 == 70) {
            int var156 = class131.field2053.method1142(-18970);
            if (class82.method569(var156, (byte) 62)) {
                class206.method1439(0);
            }
            class71.field1208 = -1;
            return true;
        } else if (class71.field1208 == 237) {
            boolean var157 = class131.field2053.method1133((byte) 53) == 1;
            String var158 = class131.field2053.method1152(-41);
            String var159 = var158;
            if (var157) {
                var159 = class131.field2053.method1152(-82);
            }
            long var160 = (long) class131.field2053.method1142(-18970);
            long var162 = (long) class131.field2053.method1137(31155);
            long var164 = (var160 << 32) + var162;
            boolean var166 = false;
            int var167 = class131.field2053.method1133((byte) 53);
            int var168 = class131.field2053.method1142(-18970);
            int var169 = 0;
            while (true) {
                if (var169 >= 100) {
                    if (var167 <= 1 && class4.method22(0, var159)) {
                        var166 = true;
                    }
                    break;
                }
                if (class64.field1068[var169] == var164) {
                    var166 = true;
                    break;
                }
                var169++;
            }
            if (!var166 && class66.field1104 == 0) {
                class64.field1068[class201.field3223] = var164;
                class201.field3223 = (class201.field3223 + 1) % 100;
                String var170 = class46.method330((byte) 59, var168).method592(class131.field2053, 92);
                if (var167 == 2) {
                    class25.method136("<img=1>" + var159, var168, (String) null, "<img=1>" + var158, (byte) -5, 0, var170, 18);
                } else if (var167 == 1) {
                    class25.method136("<img=0>" + var159, var168, (String) null, "<img=0>" + var158, (byte) -5, 0, var170, 18);
                } else {
                    class25.method136(var159, var168, (String) null, var158, (byte) -5, 0, var170, 18);
                }
            }
            class71.field1208 = -1;
            return true;
        } else if (class71.field1208 == 88) {
            int var171 = class131.field2053.method1160((byte) -114);
            int var172 = class131.field2053.method1147(-9173);
            int var173 = class131.field2053.method1157(65280);
            if (class82.method569(var172, (byte) 62)) {
                class36.method227(var173, 5, var171);
            }
            class71.field1208 = -1;
            return true;
        } else if (class71.field1208 == 69) {
            int var174 = class131.field2053.method1168(65280);
            int var175 = class131.field2053.method1147(-9173);
            int var176 = class131.field2053.method1147(-9173);
            if (class82.method569(var176, (byte) -90)) {
                if (var174 == 2) {
                    client.method2027((byte) -33);
                }
                class22.field284 = var175;
                class141.method995(var175, (byte) -108);
                class278.method1875(12, false);
                class81.method557((byte) -72, class22.field284);
                for (int var177 = 0; var177 < 100; var177++) {
                    class73.field1227[var177] = true;
                }
            }
            class71.field1208 = -1;
            return true;
        } else if (class71.field1208 == 194) {
            class268.field4317 = class74.field1237;
            if (class47.field793 == 0) {
                class305.field4883 = null;
                class71.field1208 = -1;
                class215.field3553 = 0;
                class60.field977 = null;
                class272.field4372 = null;
                return true;
            }
            class272.field4372 = class131.field2053.method1152(-105);
            boolean var178 = class131.field2053.method1133((byte) 53) == 1;
            if (var178) {
                class131.field2053.method1152(-83);
            }
            long var179 = class131.field2053.method1119(true);
            class60.field977 = class123.method865(98, var179);
            class25.field309 = class131.field2053.method1107((byte) -80);
            int var181 = class131.field2053.method1133((byte) 53);
            if (var181 == 255) {
                class71.field1208 = -1;
                return true;
            }
            class215.field3553 = var181;
            class185[] var182 = new class185[100];
            for (int var183 = 0; var183 < class215.field3553; var183++) {
                var182[var183] = new class185();
                var182[var183].field3028 = class131.field2053.method1152(-78);
                boolean var189 = class131.field2053.method1133((byte) 53) == 1;
                if (var189) {
                    var182[var183].field3024 = class131.field2053.method1152(-48);
                } else {
                    var182[var183].field3024 = var182[var183].field3028;
                }
                var182[var183].field3021 = class131.field2053.method1142(-18970);
                var182[var183].field3026 = class131.field2053.method1107((byte) -123);
                var182[var183].field3027 = class131.field2053.method1152(-114);
                if (var182[var183].field3024.equals(class239.field3829.field4778)) {
                    class246.field3920 = var182[var183].field3026;
                }
            }
            boolean var184 = false;
            int var185 = class215.field3553;
            while (var185 > 0) {
                boolean var186 = true;
                var185--;
                for (int var187 = 0; var187 < var185; var187++) {
                    if (var182[var187].field3028.compareTo(var182[var187 + 1].field3028) > 0) {
                        var186 = false;
                        class185 var188 = var182[var187];
                        var182[var187] = var182[var187 + 1];
                        var182[var187 + 1] = var188;
                    }
                }
                if (var186) {
                    break;
                }
            }
            class71.field1208 = -1;
            class305.field4883 = var182;
            return true;
        } else if (class71.field1208 == 199) {
            int var190 = class131.field2053.method1142(-18970);
            int var191 = class131.field2053.method1133((byte) 53);
            int var192 = class131.field2053.method1133((byte) 53);
            int var193 = class131.field2053.method1142(-18970);
            int var194 = class131.field2053.method1133((byte) 53);
            int var195 = class131.field2053.method1133((byte) 53);
            if (class82.method569(var190, (byte) 96)) {
                class264.method1781(true, var192, var191, var193, (byte) 76, var194, var195);
            }
            class71.field1208 = -1;
            return true;
        } else if (class71.field1208 == 159) {
            int var196 = class131.field2053.method1143(65280);
            class87.method590((byte) 83, var196);
            class115.field1803[class51.method359(class312.field4980++, 31)] = class51.method359(var196, 32767);
            class71.field1208 = -1;
            return true;
        } else if (class71.field1208 == 231) {
            if (class47.field793 == 0) {
                class72.field1215 = class279.field4473;
            } else {
                class72.field1215 = class131.field2053.method1152(-98);
            }
            class71.field1208 = -1;
            return true;
        } else if (class71.field1208 == 139) {
            int var197 = class131.field2053.method1133((byte) 53);
            if (class131.field2053.method1133((byte) 53) == 0) {
                class269.field4325[var197] = new class133();
            } else {
                class131.field2053.field2568--;
                class269.field4325[var197] = new class133(class131.field2053);
            }
            class71.field1208 = -1;
            class203.field3246 = class74.field1237;
            return true;
        } else if (class71.field1208 == 28) {
            int var198 = class131.field2053.method1143(65280);
            if (var198 == 65535) {
                var198 = -1;
            }
            int var199 = class131.field2053.method1157(65280);
            int var200 = var199 >> 14 & 0x3FFF;
            int var201 = class131.field2053.method1126((byte) 78);
            int var202 = (var199 & 0x3B2140A3) >> 28;
            int var203 = var200 - class276.field4438;
            int var204 = var201 >> 2;
            int var205 = var199 & 0x3FFF;
            int var206 = var201 & 0x3;
            int var207 = class183.field3012[var204];
            int var208 = var205 - class108.field1732;
            class305.method2043(var202, var207, var208, var204, var198, false, var203, var206);
            class71.field1208 = -1;
            return true;
        } else if (class71.field1208 == 94) {
            int var209 = class131.field2053.method1133((byte) 53);
            String var210 = class131.field2053.method1152(-117);
            boolean var211 = (var209 & 0x1) == 1;
            String var212 = class131.field2053.method1152(-78);
            String var213 = class131.field2053.method1152(-44);
            String var214 = class131.field2053.method1152(-102);
            if (var211) {
                for (int var215 = 0; var215 < class169.field2755; var215++) {
                    if (class269.field4341[var215].equals(var214)) {
                        class263.field4224[var215] = var210;
                        if (var212.equals("")) {
                            class269.field4341[var215] = var210;
                        } else {
                            class269.field4341[var215] = var212;
                        }
                        class79.field1314[var215] = var213;
                        if (var214.equals("")) {
                            class3.field36[var215] = var213;
                        } else {
                            class3.field36[var215] = var214;
                        }
                        break;
                    }
                }
            } else {
                class263.field4224[class169.field2755] = var210;
                if (var212.equals("")) {
                    class269.field4341[class169.field2755] = var210;
                } else {
                    class269.field4341[class169.field2755] = var212;
                }
                class79.field1314[class169.field2755] = var213;
                if (var214.equals("")) {
                    class3.field36[class169.field2755] = var213;
                } else {
                    class3.field36[class169.field2755] = var214;
                }
                class214.field3549[class169.field2755] = class51.method359(2, var209) == 2;
                class169.field2755++;
            }
            class205.field3264 = class74.field1237;
            class71.field1208 = -1;
            return true;
        } else if (class71.field1208 == 86) {
            int var216 = class131.field2053.method1142(-18970);
            int var217 = class131.field2053.method1133((byte) 53);
            int var218 = class131.field2053.method1133((byte) 53);
            int var219 = class131.field2053.method1133((byte) 53);
            int var220 = class131.field2053.method1133((byte) 53);
            int var221 = class131.field2053.method1142(-18970);
            if (class82.method569(var216, (byte) 46)) {
                class195.field3155[var217] = true;
                class151.field2365[var217] = var218;
                class179.field2928[var217] = var219;
                class153.field2376[var217] = var220;
                class234.field3773[var217] = var221;
            }
            class71.field1208 = -1;
            return true;
        } else if (class71.field1208 == 110) {
            int var222 = class131.field2053.method1145(-119);
            int var223 = class131.field2053.method1151((byte) -122);
            String var224 = class131.field2053.method1152(-91);
            if (class82.method569(var222, (byte) 79)) {
                class223.method1532(var223, 2, var224);
            }
            class71.field1208 = -1;
            return true;
        } else if (class71.field1208 == 31) {
            int var225 = class131.field2053.method1143(65280);
            int var226 = class131.field2053.method1157(65280);
            if (var225 == 65535) {
                var225 = -1;
            }
            int var227 = class131.field2053.method1142(-18970);
            if (class82.method569(var227, (byte) 44)) {
                class107.method764(var225, 1, 123, -1, var226);
            }
            class71.field1208 = -1;
            return true;
        } else if (class71.field1208 == 121) {
            class150.method1039(4095, true);
            class71.field1208 = -1;
            return true;
        } else if (class71.field1208 == 36) {
            int var228 = class131.field2053.method1157(65280);
            int var229 = class131.field2053.method1142(-18970);
            class211 var230;
            if (var228 < 0) {
                var230 = null;
            } else {
                var230 = class17.method87(var228, -20055);
            }
            if (var230 != null) {
                for (int var231 = 0; var231 < var230.field3361.length; var231++) {
                    var230.field3361[var231] = 0;
                    var230.field3500[var231] = 0;
                }
            }
            if (var228 < -70000) {
                var229 += 32768;
            }
            class26.method142(0, var229);
            int var232 = class131.field2053.method1142(-18970);
            for (int var233 = 0; var233 < var232; var233++) {
                int var234 = class131.field2053.method1133((byte) 53);
                if (var234 == 255) {
                    var234 = class131.field2053.method1141((byte) 127);
                }
                int var235 = class131.field2053.method1147(-9173);
                if (var230 != null && var230.field3361.length > var233) {
                    var230.field3361[var233] = var235;
                    var230.field3500[var233] = var234;
                }
                class68.method478(var233, var234, var229, false, var235 - 1);
            }
            if (var230 != null) {
                class117.method834(var230, (byte) -57);
            }
            class107.method766((byte) 117);
            class115.field1803[class51.method359(class312.field4980++, 31)] = class51.method359(32767, var229);
            class71.field1208 = -1;
            return true;
        } else if (class71.field1208 == 168) {
            int var236 = class131.field2053.method1141((byte) 74);
            int var237 = class131.field2053.method1160((byte) -114);
            int var238 = class131.field2053.method1143(65280);
            int var239 = class131.field2053.method1149(9639);
            if (class82.method569(var238, (byte) -115)) {
                class196.method1375(var239, 11, var236, var237);
            }
            class71.field1208 = -1;
            return true;
        } else if (class71.field1208 == 223) {
            int var240 = class131.field2053.method1142(-18970);
            if (var240 == 65535) {
                var240 = -1;
            }
            int var241 = class131.field2053.method1141((byte) 105);
            int var242 = class131.field2053.method1142(-18970);
            if (class82.method569(var242, (byte) 77)) {
                class107.method764(var240, 2, 70, -1, var241);
            }
            class71.field1208 = -1;
            return true;
        } else if (class71.field1208 == 196) {
            int var243 = class131.field2053.method1127((byte) 27);
            int var244 = class131.field2053.method1168(65280);
            int var245 = class131.field2053.method1126((byte) 127);
            class56.field941 = var245 >> 1;
            class239.field3829.method1975(var243, (byte) -67, (var245 & 0x1) == 1, var244);
            class71.field1208 = -1;
            return true;
        } else if (class71.field1208 == 187) {
            int var246 = class131.field2053.method1133((byte) 53);
            int var247 = class131.field2053.method1147(-9173);
            int var248 = class131.field2053.method1142(-18970);
            int var249 = class131.field2053.method1166((byte) -20);
            if (class82.method569(var247, (byte) 86)) {
                class97 var250 = (class97) class244.field3880.method1059(0, (long) var249);
                if (var250 != null) {
                    class285.method1897(var250, 93, var250.field1556 != var248);
                }
                class100.method686(var246, var248, -84, var249);
            }
            class71.field1208 = -1;
            return true;
        } else if (class71.field1208 == 152) {
            int var251 = class131.field2053.method1133((byte) 53);
            int var252 = class131.field2053.method1147(-9173);
            if (class82.method569(var252, (byte) 56)) {
                class23.field290 = var251;
            }
            class71.field1208 = -1;
            return true;
        } else if (class71.field1208 == 81) {
            if (class22.field284 != -1) {
                class258.method1733((byte) 95, class22.field284, 0);
            }
            class71.field1208 = -1;
            return true;
        } else if (class71.field1208 == 136) {
            class215.method1496(arg0);
            class107.method766((byte) 90);
            class71.field1208 = -1;
            class268.field4319 += 32;
            return true;
        } else if (class71.field1208 == 195) {
            int var253 = class131.field2053.method1151((byte) -117);
            int var254 = class131.field2053.method1145(-63);
            int var255 = class131.field2053.method1145(-105);
            if (class82.method569(var254, (byte) 123)) {
                class123.method863(var255, -123, var253);
            }
            class71.field1208 = -1;
            return true;
        } else if (class71.field1208 == 131) {
            int var256 = class131.field2053.method1141((byte) 73);
            int var257 = class131.field2053.method1147(-9173);
            int var258 = class131.field2053.method1141((byte) 42);
            if (class82.method569(var257, (byte) 120)) {
                class97 var259 = (class97) class244.field3880.method1059(0, (long) var258);
                class97 var260 = (class97) class244.field3880.method1059(0, (long) var256);
                if (var260 != null) {
                    class285.method1897(var260, 15, var259 == null || var259.field1556 != var260.field1556);
                }
                if (var259 != null) {
                    var259.method913(-3542);
                    class244.field3880.method1052((long) var256, (byte) -65, var259);
                }
                class211 var261 = class17.method87(var258, -20055);
                if (var261 != null) {
                    class117.method834(var261, (byte) -57);
                }
                class211 var262 = class17.method87(var256, -20055);
                if (var262 != null) {
                    class117.method834(var262, (byte) -57);
                    class56.method384(-77, var262, true);
                }
                if (class22.field284 != -1) {
                    class258.method1733((byte) 95, class22.field284, 1);
                }
            }
            class71.field1208 = -1;
            return true;
        } else if (class71.field1208 == 214) {
            class89.method609(class131.field2053.method1152(-89), (byte) 126);
            class71.field1208 = -1;
            return true;
        } else if (class71.field1208 == 113) {
            int var263 = class131.field2053.method1141((byte) 73);
            int var264 = class131.field2053.method1145(-86);
            int var265 = class131.field2053.method1147(-9173);
            int var266 = class131.field2053.method1147(-9173);
            int var267 = class131.field2053.method1143(65280);
            if (class82.method569(var265, (byte) 108)) {
                class244.method1634(var267, -1878362036, var264, var266, var263);
            }
            class71.field1208 = -1;
            return true;
        } else if (class71.field1208 == 228) {
            class131.field2053.field2568 += 28;
            if (class131.field2053.method1121((byte) 7)) {
                class42.method277(class131.field2053, class131.field2053.field2568 - 28, (byte) 11);
            }
            class71.field1208 = -1;
            return true;
        } else if (class71.field1208 == 38) {
            int var268 = class131.field2053.method1147(-9173);
            int var269 = class131.field2053.method1141((byte) 109);
            class209.method1455(false, var268, var269);
            class71.field1208 = -1;
            return true;
        } else if (class71.field1208 == 109) {
            int var270 = class131.field2053.method1114((byte) -13);
            int var271 = class131.field2053.method1157(65280);
            int var272 = class131.field2053.method1133((byte) 53);
            String var273 = "";
            String var274 = var273;
            if ((var272 & 0x1) != 0) {
                var273 = class131.field2053.method1152(-50);
                if ((var272 & 0x2) == 0) {
                    var274 = var273;
                } else {
                    var274 = class131.field2053.method1152(-83);
                }
            }
            String var275 = class131.field2053.method1152(-63);
            if (!var274.equals("") && class4.method22(0, var274)) {
                class71.field1208 = -1;
                return true;
            } else {
                class59.method402(var273, var271, var270, -1, var275, var274);
                class71.field1208 = -1;
                return true;
            }
        } else if (class71.field1208 == 96) {
            String var276 = class131.field2053.method1152(-68);
            String var277 = class93.method630(class223.method1533((byte) -26, class214.method1487(class131.field2053, 47)));
            class59.method402(var276, 0, 6, -1, var277, var276);
            class71.field1208 = -1;
            return true;
        } else if (class71.field1208 == 144) {
            boolean var278 = class131.field2053.method1133((byte) 53) == 1;
            String var279 = class131.field2053.method1152(-111);
            String var280 = class131.field2053.method1152(-55);
            String var281 = "";
            int var282 = class131.field2053.method1142(-18970);
            int var283 = class131.field2053.method1133((byte) 53);
            boolean var284 = false;
            if (var282 > 0) {
                var281 = class131.field2053.method1152(-37);
                var284 = class131.field2053.method1133((byte) 53) == 1;
            }
            for (int var285 = 0; var285 < class124.field1968; var285++) {
                if (var278) {
                    if (var280.equals(class258.field4165[var285])) {
                        class258.field4165[var285] = var279;
                        class308.field4931[var285] = var280;
                        var279 = null;
                        break;
                    }
                } else if (var279.equals(class258.field4165[var285])) {
                    if (class279.field4478[var285] != var282) {
                        class279.field4478[var285] = var282;
                        if (var282 > 0) {
                            class59.method402("", 0, 5, -1, var279 + class25.field316, "");
                        }
                        if (var282 == 0) {
                            class59.method402("", 0, 5, -1, var279 + class22.field285, "");
                        }
                    }
                    class308.field4931[var285] = var280;
                    var279 = null;
                    class103.field1657[var285] = var281;
                    class236.field3797[var285] = var283;
                    class240.field3838[var285] = var284;
                    break;
                }
            }
            boolean var286 = false;
            if (var279 != null && class124.field1968 < 200) {
                class258.field4165[class124.field1968] = var279;
                class308.field4931[class124.field1968] = var280;
                class279.field4478[class124.field1968] = var282;
                class103.field1657[class124.field1968] = var281;
                class236.field3797[class124.field1968] = var283;
                class240.field3838[class124.field1968] = var284;
                class124.field1968++;
            }
            class205.field3264 = class74.field1237;
            int var287 = class124.field1968;
            while (var287 > 0) {
                var287--;
                boolean var288 = true;
                for (int var289 = 0; var289 < var287; var289++) {
                    if (class279.field4478[var289] != class60.field979 && class279.field4478[var289 + 1] == class60.field979 || class279.field4478[var289] == 0 && class279.field4478[var289 + 1] != 0) {
                        var288 = false;
                        int var290 = class279.field4478[var289];
                        class279.field4478[var289] = class279.field4478[var289 + 1];
                        class279.field4478[var289 + 1] = var290;
                        String var291 = class103.field1657[var289];
                        class103.field1657[var289] = class103.field1657[var289 + 1];
                        class103.field1657[var289 + 1] = var291;
                        String var292 = class258.field4165[var289];
                        class258.field4165[var289] = class258.field4165[var289 + 1];
                        class258.field4165[var289 + 1] = var292;
                        String var293 = class308.field4931[var289];
                        class308.field4931[var289] = class308.field4931[var289 + 1];
                        class308.field4931[var289 + 1] = var293;
                        int var294 = class236.field3797[var289];
                        class236.field3797[var289] = class236.field3797[var289 + 1];
                        class236.field3797[var289 + 1] = var294;
                        boolean var295 = class240.field3838[var289];
                        class240.field3838[var289] = class240.field3838[var289 + 1];
                        class240.field3838[var289 + 1] = var295;
                    }
                }
                if (var288) {
                    break;
                }
            }
            class71.field1208 = -1;
            return true;
        } else if (class71.field1208 == 27) {
            class261.field4196 = class131.field2053.method1133((byte) 53);
            class71.field1208 = -1;
            class205.field3264 = class74.field1237;
            return true;
        } else if (class71.field1208 == 148) {
            int var296 = class131.field2053.method1133((byte) 53);
            int var297 = class131.field2053.method1133((byte) 53);
            byte var298 = class131.field2053.method1107((byte) -114);
            if (class53.field883 != var298) {
                class71.field1208 = -1;
                return true;
            }
            class71.field1208 = -1;
            if (var296 == 255) {
                class237.field3804 = 0;
                class86.field1418 = 0;
                class130.field2033 = false;
            } else {
                class130.field2033 = true;
                class237.field3804 = var296;
                class86.field1418 = var297;
            }
            return true;
        } else if (class71.field1208 == 234) {
            class169.field2755 = class131.field2053.method1133((byte) 53);
            for (int var299 = 0; var299 < class169.field2755; var299++) {
                class263.field4224[var299] = class131.field2053.method1152(-47);
                class269.field4341[var299] = class131.field2053.method1152(-92);
                if (class269.field4341[var299].equals("")) {
                    class269.field4341[var299] = class263.field4224[var299];
                }
                class79.field1314[var299] = class131.field2053.method1152(-124);
                class3.field36[var299] = class131.field2053.method1152(-53);
                if (class3.field36[var299].equals("")) {
                    class3.field36[var299] = class79.field1314[var299];
                }
                class214.field3549[var299] = false;
            }
            class71.field1208 = -1;
            class205.field3264 = class74.field1237;
            return true;
        } else if (class71.field1208 == 236) {
            int var300 = class131.field2053.method1142(-18970);
            int var301 = class131.field2053.method1133((byte) 53);
            int var302 = class131.field2053.method1133((byte) 53);
            int var303 = class131.field2053.method1142(-18970);
            int var304 = class131.field2053.method1133((byte) 53);
            int var305 = class131.field2053.method1133((byte) 53);
            if (class82.method569(var300, (byte) 38)) {
                class96.method663(-106, var303, var301, var304, var305, var302);
            }
            class71.field1208 = -1;
            return true;
        } else if (class71.field1208 == 225) {
            int var306 = class131.field2053.method1168(65280);
            int var307 = class131.field2053.method1147(-9173);
            int var308 = class131.field2053.method1151((byte) 84);
            if (class82.method569(var307, (byte) 116)) {
                class168.method1228(var306, var308, (byte) 126);
            }
            class71.field1208 = -1;
            return true;
        } else if (class71.field1208 == 198) {
            int var309 = class131.field2053.method1157(65280);
            int var310 = class131.field2053.method1142(-18970);
            if (var309 < -70000) {
                var310 += 32768;
            }
            class211 var311;
            if (var309 < 0) {
                var311 = null;
            } else {
                var311 = class17.method87(var309, -20055);
            }
            while (class47.field793 > class131.field2053.field2568) {
                int var312 = class131.field2053.method1114((byte) -13);
                int var313 = 0;
                int var314 = class131.field2053.method1142(-18970);
                if (var314 != 0) {
                    var313 = class131.field2053.method1133((byte) 53);
                    if (var313 == 255) {
                        var313 = class131.field2053.method1157(65280);
                    }
                }
                if (var311 != null && var312 >= 0 && var312 < var311.field3361.length) {
                    var311.field3361[var312] = var314;
                    var311.field3500[var312] = var313;
                }
                class68.method478(var312, var313, var310, arg0, var314 - 1);
            }
            if (var311 != null) {
                class117.method834(var311, (byte) -57);
            }
            class107.method766((byte) 126);
            class115.field1803[class51.method359(class312.field4980++, 31)] = class51.method359(var310, 32767);
            class71.field1208 = -1;
            return true;
        } else if (class71.field1208 == 74) {
            boolean var315 = class131.field2053.method1133((byte) 53) == 1;
            String var316 = class131.field2053.method1152(-51);
            String var317 = var316;
            if (var315) {
                var317 = class131.field2053.method1152(-118);
            }
            long var318 = class131.field2053.method1119(!arg0);
            long var320 = (long) class131.field2053.method1142(-18970);
            long var322 = (long) class131.field2053.method1137(31155);
            long var324 = (var320 << 32) + var322;
            boolean var326 = false;
            int var327 = class131.field2053.method1133((byte) 53);
            int var328 = class131.field2053.method1142(-18970);
            int var329 = 0;
            while (true) {
                if (var329 >= 100) {
                    if (var327 <= 1 && class4.method22(0, var317)) {
                        var326 = true;
                    }
                    break;
                }
                if (class64.field1068[var329] == var324) {
                    var326 = true;
                    break;
                }
                var329++;
            }
            if (!var326 && class66.field1104 == 0) {
                class64.field1068[class201.field3223] = var324;
                class201.field3223 = (class201.field3223 + 1) % 100;
                String var330 = class46.method330((byte) 94, var328).method592(class131.field2053, 74);
                if (var327 == 2) {
                    class25.method136("<img=1>" + var317, var328, class4.method24(var318, 0), "<img=1>" + var316, (byte) -5, 0, var330, 20);
                } else if (var327 == 1) {
                    class25.method136("<img=0>" + var317, var328, class4.method24(var318, 0), "<img=0>" + var316, (byte) -5, 0, var330, 20);
                } else {
                    class25.method136(var317, var328, class4.method24(var318, 0), var316, (byte) -5, 0, var330, 20);
                }
            }
            class71.field1208 = -1;
            return true;
        } else if (class71.field1208 == 197) {
            int var331 = class131.field2053.method1142(-18970);
            int var332 = class131.field2053.method1151((byte) 66);
            class83.method573(var331, var332, (byte) 22);
            class71.field1208 = -1;
            return true;
        } else if (class71.field1208 == 53) {
            byte[] var333 = new byte[class47.field793];
            class131.field2053.method821((byte) 108, class47.field793, 0, var333);
            String var334 = class288.method1918(160, 0, var333, class47.field793);
            if (class92.field1494 == null && class45.field759 == 3 || !class45.field760.startsWith("win") || class240.field3837) {
                class95.method653(true, 357801124, var334);
            } else {
                class281.field4494 = var334;
                class146.field2311 = true;
                class285.field4527 = class268.field4323.method317(var334, -121);
            }
            class71.field1208 = -1;
            return true;
        } else if (class71.field1208 == 254) {
            int var335 = class131.field2053.method1166((byte) -20);
            int var336 = class131.field2053.method1143(65280);
            int var337 = class131.field2053.method1157(65280);
            int var338 = class131.field2053.method1142(-18970);
            if (class82.method569(var336, (byte) 120)) {
                class107.method764(var338, 5, 52, var335, var337);
            }
            class71.field1208 = -1;
            return true;
        } else if (class71.field1208 == 102) {
            for (int var339 = 0; var339 < class270.field4355.length; var339++) {
                if (class270.field4355[var339] != null) {
                    class270.field4355[var339].field699 = -1;
                }
            }
            for (int var340 = 0; var340 < class12.field127.length; var340++) {
                if (class12.field127[var340] != null) {
                    class12.field127[var340].field699 = -1;
                }
            }
            class71.field1208 = -1;
            return true;
        } else if (class71.field1208 == 45) {
            int var341 = class131.field2053.method1151((byte) -125);
            int var342 = class131.field2053.method1145(-52);
            if (class82.method569(var342, (byte) 41)) {
                int var343 = 0;
                if (class239.field3829.field4767 != null) {
                    var343 = class239.field3829.field4767.method1772((byte) -124);
                }
                class107.method764(var343, 3, 64, -1, var341);
            }
            class71.field1208 = -1;
            return true;
        } else if (class71.field1208 == 9) {
            int var344 = class131.field2053.method1147(-9173);
            int var345 = class131.field2053.method1142(-18970);
            int var346 = class131.field2053.method1141((byte) 57);
            if (class82.method569(var345, (byte) 61)) {
                class239.method1613(12, var346, var344);
            }
            class71.field1208 = -1;
            return true;
        } else if (class71.field1208 == 255) {
            class165.field2654 = class131.field2053.method1133((byte) 53);
            class309.field4938 = class131.field2053.method1168(65280);
            class71.field1208 = -1;
            return true;
        } else {
            if (arg0) {
                method1964(22, (byte) 87);
            }
            if (class71.field1208 == 190) {
                int var347 = class131.field2053.method1151((byte) -112);
                int var348 = class131.field2053.method1147(-9173);
                int var349 = class131.field2053.method1143(65280);
                if (class82.method569(var348, (byte) 76)) {
                    class88.method602(var349, -61, var347);
                }
                class71.field1208 = -1;
                return true;
            } else if (class71.field1208 == 163) {
                int var350 = class131.field2053.method1142(-18970);
                int var351 = class131.field2053.method1145(-41);
                int var352 = class131.field2053.method1147(-9173);
                int var353 = class131.field2053.method1143(65280);
                int var354 = class131.field2053.method1141((byte) 74);
                if (class82.method569(var353, (byte) -107)) {
                    class107.method764(var352 | var350 << 16, 7, 115, var351, var354);
                }
                class71.field1208 = -1;
                return true;
            } else if (class71.field1208 == 83) {
                int var355 = class131.field2053.method1143(65280);
                if (var355 == 65535) {
                    var355 = -1;
                }
                int var356 = class131.field2053.method1166((byte) -20);
                int var357 = class131.field2053.method1142(-18970);
                if (var357 == 65535) {
                    var357 = -1;
                }
                int var358 = class131.field2053.method1151((byte) 68);
                int var359 = class131.field2053.method1145(-75);
                if (class82.method569(var359, (byte) -95)) {
                    for (int var360 = var357; var360 <= var355; var360++) {
                        long var361 = ((long) var356 << 32) + (long) var360;
                        class223 var363 = (class223) class143.field2269.method1059(0, var361);
                        class223 var364;
                        if (var363 != null) {
                            var364 = new class223(var358, var363.field3638);
                            var363.method913(-3542);
                        } else if (var360 == -1) {
                            var364 = new class223(var358, class17.method87(var356, -20055).field3422.field3638);
                        } else {
                            var364 = new class223(var358, -1);
                        }
                        class143.field2269.method1052(var361, (byte) -65, var364);
                    }
                }
                class71.field1208 = -1;
                return true;
            } else if (class71.field1208 == 17) {
                class178.field2908 = class131.field2053.method1133((byte) 53);
                class71.field1208 = -1;
                return true;
            } else if (class71.field1208 == 29) {
                class309.field4938 = class131.field2053.method1168(65280);
                class165.field2654 = class131.field2053.method1133((byte) 53);
                while (class131.field2053.field2568 < class47.field793) {
                    class71.field1208 = class131.field2053.method1133((byte) 53);
                    class86.method587(true);
                }
                class71.field1208 = -1;
                return true;
            } else if (class71.field1208 == 55) {
                int var365 = class131.field2053.method1147(-9173);
                if (var365 == 65535) {
                    var365 = -1;
                }
                int var366 = class131.field2053.method1168(65280);
                class11.method57(-107, var366, var365);
                class71.field1208 = -1;
                return true;
            } else if (class71.field1208 == 125) {
                int var367 = class131.field2053.method1143(65280);
                int var368 = class131.field2053.method1127((byte) 121);
                if (var367 == 65535) {
                    var367 = -1;
                }
                int var369 = class131.field2053.method1155((byte) -48);
                class236.method1602(var367, var368, -2, var369);
                class71.field1208 = -1;
                return true;
            } else if (class71.field1208 == 61) {
                class107.method766((byte) -101);
                class107.field1692 = class131.field2053.method1133((byte) 53);
                class304.field4874 = class74.field1237;
                class71.field1208 = -1;
                return true;
            } else if (class71.field1208 == 78) {
                String var370 = class131.field2053.method1152(-99);
                int var371 = class131.field2053.method1143(65280);
                int var372 = class131.field2053.method1143(65280);
                if (class82.method569(var371, (byte) -110)) {
                    class215.method1495(var370, var372, (byte) 73);
                }
                class71.field1208 = -1;
                return true;
            } else if (class71.field1208 == 19) {
                class255.field4127 = class131.field2053.method1145(-84) * 30;
                class304.field4874 = class74.field1237;
                class71.field1208 = -1;
                return true;
            } else {
                class19.method94(-119, (Throwable) null, "T1 - " + class71.field1208 + "," + class81.field1342 + "," + class89.field1454 + " - " + class47.field793);
                class216.method1500(0);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "(I)V")
    public static void method1963(int arg0) {
        field4734 = null;
        field4735 = null;
        if (arg0 != -1) {
            method1963(-71);
        }
        field4738 = null;
        field4726 = null;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IB)Lsd;")
    public static final class165 method1964(int arg0, byte arg1) {
        field4743++;
        class165 var2 = (class165) class312.field4981.method694((long) arg0, false);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 >= 32768) {
            var3 = class228.field3684.method1680(arg0 & 0x7FFF, 0, -121);
        } else {
            var3 = class167.field2724.method1680(arg0, 0, -86);
        }
        class165 var4 = new class165();
        if (var3 != null) {
            var4.method1183(0, new class162(var3));
        }
        if (arg0 >= 32768) {
            var4.method1187((byte) 125);
        }
        if (arg1 >= -93) {
            return null;
        } else {
            class312.field4981.method693((long) arg0, 124, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILdk;)V")
    public static final void method1965(int arg0, class251 arg1) {
        class162.field2596 = arg1;
        if (arg0 < -123) {
            field4721++;
        }
    }

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "(I)V")
    public static final void method1966(int arg0) {
        field4741++;
        if (class20.field240 < 128.0F) {
            class20.field240 = 128.0F;
        }
        if (class20.field240 > 383.0F) {
            class20.field240 = 383.0F;
        }
        while (class90.field1456 >= 2048.0F) {
            class90.field1456 -= 2048.0F;
        }
        int var1 = class162.field2580 >> 7;
        while (class90.field1456 < 0.0F) {
            class90.field1456 += 2048.0F;
        }
        if (arg0 > -88) {
            field4722 = 6;
        }
        int var2 = class163.field2646 >> 7;
        int var3 = 0;
        int var4 = class155.method1060((byte) -12, class56.field941, class163.field2646, class162.field2580);
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= (var1 + 4); var5++) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    int var7 = class56.field941;
                    if (var7 < 3 && (class301.field4818[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = (class107.field1702[var7][var5][var6] & 0xFF) * 8 + var4 - class267.field4304[var7][var5][var6];
                    if (var8 > var3) {
                        var3 = var8;
                    }
                }
            }
        }
        int var9 = var3 * 192;
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (class230.field3731 < var9) {
            class230.field3731 += (var9 - class230.field3731) / 24;
        } else if (var9 < class230.field3731) {
            class230.field3731 += (var9 - class230.field3731) / 80;
        }
    }
}
