import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class83 extends class176 {

    @OriginalMember(owner = "client!ic", name = "T", descriptor = "Lob;")
    private class141 field1655 = class8.field136;

    @OriginalMember(owner = "client!ic", name = "L", descriptor = "Lob;")
    private static class141 field1648 = class175.method1195(40, "Unable to connect)3");

    @OriginalMember(owner = "client!ic", name = "O", descriptor = "I")
    public static int field1650 = 0;

    @OriginalMember(owner = "client!ic", name = "D", descriptor = "Lob;")
    public static class141 field1641 = field1648;

    @OriginalMember(owner = "client!ic", name = "X", descriptor = "Lob;")
    private static class141 field1659 = class175.method1195(40, "RuneScape is loading )2 please wait)3)3)3");

    @OriginalMember(owner = "client!ic", name = "V", descriptor = "Lob;")
    public static class141 field1657 = class175.method1195(40, "scrollen:");

    @OriginalMember(owner = "client!ic", name = "Y", descriptor = "Lob;")
    public static class141 field1660 = class175.method1195(40, "Mitglieder)2Welt");

    @OriginalMember(owner = "client!ic", name = "I", descriptor = "Lob;")
    public static class141 field1645 = class175.method1195(40, "Texturen geladen)3");

    @OriginalMember(owner = "client!ic", name = "Z", descriptor = "Lob;")
    public static class141 field1661 = field1648;

    @OriginalMember(owner = "client!ic", name = "J", descriptor = "Lob;")
    public static class141 field1646 = field1659;

    @OriginalMember(owner = "client!ic", name = "cb", descriptor = "Lob;")
    public static class141 field1664 = class175.method1195(40, "; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0");

    @OriginalMember(owner = "client!ic", name = "E", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!ic", name = "F", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!ic", name = "H", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!ic", name = "K", descriptor = "I")
    public int field1647;

    @OriginalMember(owner = "client!ic", name = "N", descriptor = "I")
    public static int field1649;

    @OriginalMember(owner = "client!ic", name = "P", descriptor = "I")
    public static int field1651;

    @OriginalMember(owner = "client!ic", name = "Q", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!ic", name = "S", descriptor = "I")
    private int field1654;

    @OriginalMember(owner = "client!ic", name = "U", descriptor = "I")
    public int field1656;

    @OriginalMember(owner = "client!ic", name = "bb", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!ic", name = "db", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!ic", name = "W", descriptor = "Lmd;")
    private class123 field1658;

    @OriginalMember(owner = "client!ic", name = "R", descriptor = "[I")
    public static int[] field1653;

    @OriginalMember(owner = "client!ic", name = "ab", descriptor = "[Lfa;")
    public static class52[] field1662;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(II)Lob;")
    public final class141 method569(int arg0, int arg1) {
        if (arg1 > -20) {
            field1650 = 69;
        }
        field1651++;
        if (this.field1658 == null) {
            return this.field1655;
        } else {
            class113 var3 = (class113) this.field1658.method792((long) arg0, 22346);
            return var3 == null ? this.field1655 : var3.field2164;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(BILog;)V")
    private final void method570(byte arg0, int arg1, class146 arg2) {
        int var4 = 122 % ((8 - arg0) / 42);
        if (arg1 == 1) {
            this.field1656 = arg2.method991(255);
        } else if (arg1 == 2) {
            this.field1647 = arg2.method991(255);
        } else if (arg1 == 3) {
            this.field1655 = arg2.method1013(-19405);
        } else if (arg1 == 4) {
            this.field1654 = arg2.method979(1029109968);
        } else if (arg1 == 5 || arg1 == 6) {
            int var5 = arg2.method1007(37);
            this.field1658 = new class123(class167.method1148(var5, 25920));
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = arg2.method979(1029109968);
                class213 var8;
                if (arg1 == 5) {
                    var8 = new class113(arg2.method1013(-19405));
                } else {
                    var8 = new class110(arg2.method979(1029109968));
                }
                this.field1658.method797(var8, (long) var7, true);
            }
        }
        field1642++;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILog;)V")
    public final void method571(int arg0, class146 arg1) {
        if (arg0 != 15291) {
            this.field1658 = null;
        }
        while (true) {
            int var3 = arg1.method991(255);
            if (var3 == 0) {
                field1652++;
                return;
            }
            this.method570((byte) 85, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)Z")
    public static final boolean method572(boolean arg0) {
        field1643++;
        if (class29.field562 == null) {
            return false;
        }
        try {
            int var1 = class29.field562.method1096(0);
            if (var1 == 0) {
                return false;
            }
            if (class66.field1286 == -1) {
                var1--;
                class29.field562.method1094(1, (byte) -127, class156.field3014.field2859, 0);
                class156.field3014.field2865 = 0;
                class66.field1286 = class156.field3014.method39(255);
                class187.field3632 = class40.field796[class66.field1286];
            }
            if (class187.field3632 == -1) {
                if (var1 <= 0) {
                    return false;
                }
                class29.field562.method1094(1, (byte) 101, class156.field3014.field2859, 0);
                var1--;
                class187.field3632 = class156.field3014.field2859[0] & 0xFF;
            }
            if (class187.field3632 == -2) {
                if (var1 <= 1) {
                    return false;
                }
                class29.field562.method1094(2, (byte) 125, class156.field3014.field2859, 0);
                var1 -= 2;
                class156.field3014.field2865 = 0;
                class187.field3632 = class156.field3014.method1007(53);
            }
            if (var1 < class187.field3632) {
                return false;
            }
            class156.field3014.field2865 = 0;
            class29.field562.method1094(class187.field3632, (byte) 86, class156.field3014.field2859, 0);
            class196.field3758 = class57.field1105;
            class45.field869 = 0;
            class57.field1105 = class173.field3442;
            class173.field3442 = class66.field1286;
            if (class66.field1286 == 56) {
                for (int var2 = 0; var2 < class116.field2231.length; var2++) {
                    if (class116.field2231[var2] != null) {
                        class116.field2231[var2].field3851 = -1;
                    }
                }
                for (int var3 = 0; var3 < class10.field172.length; var3++) {
                    if (class10.field172[var3] != null) {
                        class10.field172[var3].field3851 = -1;
                    }
                }
                class66.field1286 = -1;
                return true;
            }
            if (class66.field1286 == 88) {
                int var4 = class156.field3014.method991(255);
                int var5 = var4 >> 6;
                class108 var6 = new class108();
                var6.field2077 = var4 & 0x3F;
                var6.field2082 = class156.field3014.method991(255);
                if (var6.field2082 >= 0 && class67.field1314.length > var6.field2082) {
                    if (var6.field2077 == 1 || var6.field2077 == 10) {
                        var6.field2074 = class156.field3014.method1007(127);
                    }
                    if (var6.field2077 >= 2 && var6.field2077 <= 6) {
                        if (var6.field2077 == 2) {
                            var6.field2081 = 64;
                            var6.field2085 = 64;
                        }
                        if (var6.field2077 == 3) {
                            var6.field2081 = 64;
                            var6.field2085 = 0;
                        }
                        if (var6.field2077 == 4) {
                            var6.field2085 = 128;
                            var6.field2081 = 64;
                        }
                        if (var6.field2077 == 5) {
                            var6.field2081 = 0;
                            var6.field2085 = 64;
                        }
                        if (var6.field2077 == 6) {
                            var6.field2085 = 64;
                            var6.field2081 = 128;
                        }
                        var6.field2077 = 2;
                        var6.field2078 = class156.field3014.method1007(76);
                        var6.field2076 = class156.field3014.method1007(78);
                        var6.field2075 = class156.field3014.method991(255);
                    }
                    class200.field3777[var5] = var6;
                }
                class66.field1286 = -1;
                return true;
            }
            if (class66.field1286 == 237) {
                class150.field2892 = class156.field3014.method991(255);
                class114.field2184 = class156.field3014.method991(255);
                class66.field1286 = -1;
                return true;
            }
            if (class66.field1286 == 217) {
                int var7 = class156.field3014.method979(1029109968);
                int var8 = class156.field3014.method1007(31);
                if (var7 < -70000) {
                    var8 += 32768;
                }
                class170 var9;
                if (var7 < 0) {
                    var9 = null;
                } else {
                    var9 = class192.method1268(var7, -69);
                }
                if (var9 != null) {
                    for (int var10 = 0; var10 < var9.field3385.length; var10++) {
                        var9.field3385[var10] = 0;
                        var9.field3319[var10] = 0;
                    }
                }
                class105.method698(-25714, var8);
                int var11 = class156.field3014.method1007(91);
                for (int var12 = 0; var12 < var11; var12++) {
                    int var13 = class156.field3014.method982((byte) -83);
                    int var14 = class156.field3014.method991(255);
                    if (var14 == 255) {
                        var14 = class156.field3014.method985((byte) -70);
                    }
                    if (var9 != null && var12 < var9.field3385.length) {
                        var9.field3385[var12] = var13;
                        var9.field3319[var12] = var14;
                    }
                    class219.method1417(var12, var13 - 1, var8, -20971, var14);
                }
                if (var9 != null) {
                    class38.method252(var9, -114);
                }
                class130.method827((byte) -77);
                class57.field1109[class15.method94(class185.field3608++, 31)] = class15.method94(32767, var8);
                class66.field1286 = -1;
                return true;
            }
            if (class66.field1286 == 114) {
                boolean var15 = class156.field3014.method991(255) == 1;
                int var16 = class156.field3014.method979(1029109968);
                class170 var17 = class192.method1268(var16, -103);
                if (var17.field3292 != var15) {
                    var17.field3292 = var15;
                    class38.method252(var17, -126);
                }
                class66.field1286 = -1;
                return true;
            }
            if (class66.field1286 == 230) {
                int var18 = class187.field3632 + class156.field3014.field2865;
                int var19 = class156.field3014.method1007(42);
                int var20 = class156.field3014.method1007(33);
                if (class18.field322 != var19) {
                    class18.field322 = var19;
                    class163.method1132(-19597, class18.field322);
                    class111.method726(class18.field322, -122);
                    for (int var21 = 0; var21 < 100; var21++) {
                        class141.field2737[var21] = true;
                    }
                }
                while (var20-- > 0) {
                    int var22 = class156.field3014.method979(1029109968);
                    int var23 = class156.field3014.method1007(62);
                    int var24 = class156.field3014.method991(255);
                    class174 var25 = (class174) class173.field3437.method792((long) var22, 22346);
                    if (var25 != null && var25.field3454 != var23) {
                        class12.method77(var25, 1, true);
                        var25 = null;
                    }
                    if (var25 == null) {
                        var25 = class170.method1169(var24, -114, var22, var23);
                    }
                    var25.field3446 = true;
                }
                for (class174 var26 = (class174) class173.field3437.method799((byte) 117); var26 != null; var26 = (class174) class173.field3437.method796((byte) -33)) {
                    if (var26.field3446) {
                        var26.field3446 = false;
                    } else {
                        class12.method77(var26, 1, true);
                    }
                }
                class195.field3729 = new class123(512);
                while (class156.field3014.field2865 < var18) {
                    int var27 = class156.field3014.method979(1029109968);
                    int var28 = class156.field3014.method1007(117);
                    int var29 = class156.field3014.method1007(118);
                    int var30 = class156.field3014.method979(1029109968);
                    for (int var31 = var28; var31 <= var29; var31++) {
                        long var32 = ((long) var27 << 32) + (long) var31;
                        class195.field3729.method797(new class110(var30), var32, true);
                    }
                }
                class66.field1286 = -1;
                return true;
            }
            if (class66.field1286 == 9) {
                long var34 = class156.field3014.method977(516491232);
                boolean var36 = false;
                long var37 = (long) class156.field3014.method1007(113);
                long var39 = (long) class156.field3014.method1012(34);
                long var41 = (var37 << 32) + var39;
                int var43 = class156.field3014.method991(255);
                for (int var44 = 0; var44 < 100; var44++) {
                    if (class57.field1110[var44] == var41) {
                        var36 = true;
                        break;
                    }
                }
                if (var43 <= 1) {
                    for (int var45 = 0; var45 < class96.field1912; var45++) {
                        if (class154.field2999[var45] == var34) {
                            var36 = true;
                            break;
                        }
                    }
                }
                if (!var36 && class19.field329 == 0) {
                    class57.field1110[class225.field4249] = var41;
                    class225.field4249 = (class225.field4249 + 1) % 100;
                    class141 var46 = class137.method858(class179.method1216(class156.field3014, true).method935((byte) -43));
                    if (var43 == 2 || var43 == 3) {
                        class131.method836(7, (byte) -107, class220.method1422(new class141[] { class82.field1635, class206.method1361(var34, 0).method898(71) }, -3), var46);
                    } else if (var43 == 1) {
                        class131.method836(7, (byte) -125, class220.method1422(new class141[] { class209.field3958, class206.method1361(var34, 0).method898(94) }, -3), var46);
                    } else {
                        class131.method836(3, (byte) -106, class206.method1361(var34, 0).method898(27), var46);
                    }
                }
                class66.field1286 = -1;
                return true;
            }
            if (class66.field1286 == 169) {
                class67.field1316 = class156.field3014.method991(255);
                class22.field399 = class156.field3014.method991(255);
                class136.field2597 = class156.field3014.method991(255);
                class66.field1286 = -1;
                return true;
            }
            if (class66.field1286 == 204) {
                class96.field1912 = class187.field3632 / 8;
                for (int var47 = 0; var47 < class96.field1912; var47++) {
                    class154.field2999[var47] = class156.field3014.method977(516491232);
                    class166.field3217[var47] = class206.method1361(class154.field2999[var47], 0);
                }
                class1.field11 = class174.field3461;
                class66.field1286 = -1;
                return true;
            }
            if (class66.field1286 == 206) {
                class106.field2037 = class174.field3461;
                long var48 = class156.field3014.method977(516491232);
                if (var48 == 0L) {
                    class4.field42 = null;
                    class66.field1286 = -1;
                    class97.field1918 = null;
                    class180.field3541 = null;
                    class142.field2744 = 0;
                    return true;
                }
                long var50 = class156.field3014.method977(516491232);
                class97.field1918 = class206.method1361(var50, 0);
                class4.field42 = class206.method1361(var48, 0);
                class124.field2382 = class156.field3014.method1000(1064893128);
                int var52 = class156.field3014.method991(255);
                if (var52 == 255) {
                    class66.field1286 = -1;
                    return true;
                }
                class142.field2744 = var52;
                class215[] var53 = new class215[100];
                for (int var54 = 0; var54 < class142.field2744; var54++) {
                    var53[var54] = new class215();
                    var53[var54].field4067 = class156.field3014.method977(516491232);
                    var53[var54].field4094 = class206.method1361(var53[var54].field4067, 0);
                    var53[var54].field4106 = class156.field3014.method1007(112);
                    var53[var54].field4098 = class156.field3014.method1000(1064893128);
                    var53[var54].field4104 = class156.field3014.method1013(-19405);
                    if (class169.field3250 == var53[var54].field4067) {
                        class117.field2262 = var53[var54].field4098;
                    }
                }
                boolean var55 = false;
                int var56 = class142.field2744;
                while (var56 > 0) {
                    var56--;
                    boolean var57 = true;
                    for (int var58 = 0; var58 < var56; var58++) {
                        if (var53[var58].field4094.method913(var53[var58 + 1].field4094, (byte) -119) > 0) {
                            class215 var59 = var53[var58];
                            var53[var58] = var53[var58 + 1];
                            var57 = false;
                            var53[var58 + 1] = var59;
                        }
                    }
                    if (var57) {
                        break;
                    }
                }
                class180.field3541 = var53;
                class66.field1286 = -1;
                return true;
            }
            if (class66.field1286 == 8) {
                int var60 = class156.field3014.method982((byte) 124);
                class18.field322 = var60;
                class163.method1132(-19597, var60);
                class111.method726(class18.field322, 60);
                for (int var61 = 0; var61 < 100; var61++) {
                    class141.field2737[var61] = true;
                }
                class66.field1286 = -1;
                return true;
            }
            if (class66.field1286 == 196) {
                int var62 = class156.field3014.method974(-711444088);
                int var63 = class156.field3014.method967((byte) -127);
                class141 var64 = class156.field3014.method1013(-19405);
                if (var63 >= 1 && var63 <= 8) {
                    if (var64.method933((byte) -72, class224.field4239)) {
                        var64 = null;
                    }
                    class67.field1308[var63 - 1] = var64;
                    class59.field1145[var63 - 1] = var62 == 0;
                }
                class66.field1286 = -1;
                return true;
            }
            if (class66.field1286 == 151) {
                int var65 = class156.field3014.method982((byte) -30);
                byte var66 = class156.field3014.method1000(1064893128);
                class98.field1947[var65] = var66;
                if (class180.field3538[var65] != var66) {
                    class180.field3538[var65] = var66;
                    class69.method455((byte) -92, var65);
                }
                class172.field3427[class15.method94(31, class32.field648++)] = var65;
                class66.field1286 = -1;
                return true;
            }
            if (arg0) {
                return false;
            }
            if (class66.field1286 == 120) {
                class141 var67 = class156.field3014.method1013(-19405);
                int var68 = class156.field3014.method988(18280);
                class170 var69 = class192.method1268(var68, -74);
                if (!var67.method922((byte) 28, var69.field3325)) {
                    var69.field3325 = var67;
                    class38.method252(var69, -86);
                }
                class66.field1286 = -1;
                return true;
            }
            if (class66.field1286 == 81) {
                class85.method582(class156.field3014, (byte) -101);
                class66.field1286 = -1;
                return true;
            }
            if (class66.field1286 == 184) {
                client.field597 = true;
                class211.field4037 = class156.field3014.method991(255);
                class166.field3221 = class156.field3014.method991(255);
                class162.field3149 = class156.field3014.method1007(35);
                class124.field2378 = class156.field3014.method991(255);
                class60.field1161 = class156.field3014.method991(255);
                if (class60.field1161 >= 100) {
                    int var70 = class211.field4037 * 128 + 64;
                    int var71 = class166.field3221 * 128 + 64;
                    int var72 = class206.method1360(class66.field1287, var70, (byte) 40, var71) - class162.field3149;
                    int var73 = var70 - class178.field3508;
                    int var74 = var72 - class191.field3683;
                    int var75 = var71 - class184.field3589;
                    int var76 = (int) Math.sqrt((double) (var73 * var73 + var75 * var75));
                    class19.field338 = (int) (Math.atan2((double) var74, (double) var76) * 325.949D) & 0x7FF;
                    class175.field3474 = (int) (-325.949D * Math.atan2((double) var73, (double) var75)) & 0x7FF;
                    if (class19.field338 < 128) {
                        class19.field338 = 128;
                    }
                    if (class19.field338 > 383) {
                        class19.field338 = 383;
                    }
                }
                class66.field1286 = -1;
                return true;
            }
            if (class66.field1286 == 231) {
                long var77 = class156.field3014.method977(516491232);
                class141 var79 = class137.method858(class179.method1216(class156.field3014, true).method935((byte) -43));
                class131.method836(6, (byte) -109, class206.method1361(var77, 0).method898(83), var79);
                class66.field1286 = -1;
                return true;
            }
            if (class66.field1286 == 245) {
                client.field597 = false;
                for (int var80 = 0; var80 < 5; var80++) {
                    class190.field3671[var80] = false;
                }
                class66.field1286 = -1;
                return true;
            }
            if (class66.field1286 == 92) {
                class66.field1286 = -1;
                class224.field4233 = 0;
                return true;
            }
            if (class66.field1286 == 125) {
                int var81 = class156.field3014.method979(1029109968);
                class174 var82 = (class174) class173.field3437.method792((long) var81, 22346);
                if (var82 != null) {
                    class12.method77(var82, 1, true);
                }
                if (class181.field3555 != null) {
                    class38.method252(class181.field3555, -100);
                    class181.field3555 = null;
                }
                class66.field1286 = -1;
                return true;
            }
            if (class66.field1286 == 216) {
                int var83 = class156.field3014.method965((byte) -126);
                int var84 = class156.field3014.method1006(-1234576288);
                int var85 = class156.field3014.method1015((byte) 110);
                class170 var86 = class192.method1268(var84, -116);
                var86.field3351 = (var83 << 16) + var85;
                class66.field1286 = -1;
                return true;
            }
            if (class66.field1286 == 178) {
                long var87 = class156.field3014.method977(516491232);
                int var89 = class156.field3014.method1007(56);
                int var90 = class156.field3014.method991(255);
                class141 var91 = class111.field2128;
                if (var89 > 0) {
                    var91 = class156.field3014.method1013(-19405);
                }
                class141 var92 = class206.method1361(var87, 0).method898(61);
                for (int var93 = 0; var93 < class88.field1750; var93++) {
                    if (class131.field2499[var93] == var87) {
                        if (class103.field1993[var93] != var89) {
                            class103.field1993[var93] = var89;
                            if (var89 > 0) {
                                class131.method836(5, (byte) -117, class111.field2128, class220.method1422(new class141[] { var92, class202.field3825 }, -3));
                            }
                            if (var89 == 0) {
                                class131.method836(5, (byte) -97, class111.field2128, class220.method1422(new class141[] { var92, class160.field3113 }, -3));
                            }
                        }
                        class25.field478[var93] = var91;
                        class203.field3897[var93] = var90;
                        var92 = null;
                        break;
                    }
                }
                if (var92 != null && class88.field1750 < 200) {
                    class131.field2499[class88.field1750] = var87;
                    class188.field3640[class88.field1750] = var92;
                    class103.field1993[class88.field1750] = var89;
                    class25.field478[class88.field1750] = var91;
                    class203.field3897[class88.field1750] = var90;
                    class88.field1750++;
                }
                int var94 = class88.field1750;
                class1.field11 = class174.field3461;
                boolean var95 = false;
                while (var94 > 0) {
                    var94--;
                    boolean var96 = true;
                    for (int var97 = 0; var97 < var94; var97++) {
                        if (class103.field1993[var97] != class173.field3443 && class103.field1993[var97 + 1] == class173.field3443 || class103.field1993[var97] == 0 && class103.field1993[var97 + 1] != 0) {
                            var96 = false;
                            int var98 = class103.field1993[var97];
                            class103.field1993[var97] = class103.field1993[var97 + 1];
                            class103.field1993[var97 + 1] = var98;
                            class141 var99 = class25.field478[var97];
                            class25.field478[var97] = class25.field478[var97 + 1];
                            class25.field478[var97 + 1] = var99;
                            class141 var100 = class188.field3640[var97];
                            class188.field3640[var97] = class188.field3640[var97 + 1];
                            class188.field3640[var97 + 1] = var100;
                            long var101 = class131.field2499[var97];
                            class131.field2499[var97] = class131.field2499[var97 + 1];
                            class131.field2499[var97 + 1] = var101;
                            int var103 = class203.field3897[var97];
                            class203.field3897[var97] = class203.field3897[var97 + 1];
                            class203.field3897[var97 + 1] = var103;
                        }
                    }
                    if (var96) {
                        break;
                    }
                }
                class66.field1286 = -1;
                return true;
            }
            if (class66.field1286 == 121) {
                class150.field2892 = class156.field3014.method974(-711444088);
                class114.field2184 = class156.field3014.method991(255);
                for (int var104 = class114.field2184; var104 < class114.field2184 + 8; var104++) {
                    for (int var105 = class150.field2892; var105 < class150.field2892 + 8; var105++) {
                        if (class76.field1559[class66.field1287][var104][var105] != null) {
                            class76.field1559[class66.field1287][var104][var105] = null;
                            class190.method1261(0, var105, var104);
                        }
                    }
                }
                for (class66 var106 = (class66) class216.field4115.method1103((byte) -9); var106 != null; var106 = (class66) class216.field4115.method1106((byte) 123)) {
                    if (var106.field1285 >= class114.field2184 && var106.field1285 < class114.field2184 + 8 && class150.field2892 <= var106.field1290 && var106.field1290 < class150.field2892 + 8 && class66.field1287 == var106.field1276) {
                        var106.field1291 = 0;
                    }
                }
                class66.field1286 = -1;
                return true;
            }
            if (class66.field1286 == 164) {
                int var107 = class156.field3014.method979(1029109968);
                int var108 = class156.field3014.method985((byte) -70);
                int var109 = class156.field3014.method982((byte) 120);
                int var110 = class156.field3014.method982((byte) -112);
                if (var109 == 65535) {
                    var109 = -1;
                }
                if (var110 == 65535) {
                    var110 = -1;
                }
                for (int var111 = var109; var111 <= var110; var111++) {
                    long var112 = ((long) var108 << 32) + (long) var111;
                    class213 var114 = class195.field3729.method792(var112, 22346);
                    if (var114 != null) {
                        var114.method1392(128);
                    }
                    class195.field3729.method797(new class110(var107), var112, !arg0);
                }
                class66.field1286 = -1;
                return true;
            }
            if (class66.field1286 == 74) {
                int var115 = class156.field3014.method1003((byte) 126);
                int var116 = class156.field3014.method988(18280);
                int var117 = class156.field3014.method992((byte) -67);
                class170 var118 = class192.method1268(var116, -62);
                int var119 = var118.field3401 + var117;
                int var120 = var118.field3367 + var115;
                if (var118.field3353 != var120 || var118.field3372 != var119) {
                    var118.field3353 = var120;
                    var118.field3372 = var119;
                    class38.method252(var118, -84);
                }
                class66.field1286 = -1;
                return true;
            }
            if (class66.field1286 == 225) {
                int var121 = class156.field3014.method974(-711444088);
                int var122 = class156.field3014.method1002(-8544);
                int var123 = class156.field3014.method1002(-8544);
                class66.field1287 = var122 >> 1;
                class114.field2176.method1344(var123, var121, -1, (var122 & 0x1) == 1);
                class66.field1286 = -1;
                return true;
            }
            if (class66.field1286 == 134) {
                class141 var124 = class156.field3014.method1013(-19405);
                if (var124.method899(class135.field2583, arg0)) {
                    boolean var125 = false;
                    class141 var126 = var124.method902(var124.method910(class31.field620, (byte) 126), 0, (byte) 97);
                    long var127 = var126.method926(19790);
                    for (int var129 = 0; var129 < class96.field1912; var129++) {
                        if (class154.field2999[var129] == var127) {
                            var125 = true;
                            break;
                        }
                    }
                    if (!var125 && class19.field329 == 0) {
                        class131.method836(4, (byte) -123, var126, class223.field4215);
                    }
                } else if (var124.method899(class138.field2657, false)) {
                    class141 var153 = var124.method902(var124.method910(class31.field620, (byte) 119), 0, (byte) 21);
                    boolean var154 = false;
                    long var155 = var153.method926(19790);
                    for (int var157 = 0; var157 < class96.field1912; var157++) {
                        if (class154.field2999[var157] == var155) {
                            var154 = true;
                            break;
                        }
                    }
                    if (!var154 && class19.field329 == 0) {
                        class141 var158 = var124.method902(var124.method908(arg0) - 9, var124.method910(class31.field620, (byte) 125) + 1, (byte) 33);
                        class131.method836(8, (byte) -100, var153, var158);
                    }
                } else if (var124.method899(class72.field1445, false)) {
                    class141 var148 = var124.method902(var124.method910(class31.field620, (byte) 119), 0, (byte) 91);
                    long var149 = var148.method926(19790);
                    boolean var151 = false;
                    for (int var152 = 0; var152 < class96.field1912; var152++) {
                        if (class154.field2999[var152] == var149) {
                            var151 = true;
                            break;
                        }
                    }
                    if (!var151 && class19.field329 == 0) {
                        class131.method836(10, (byte) -101, var148, class111.field2128);
                    }
                } else if (var124.method899(class97.field1915, false)) {
                    class141 var130 = var124.method902(var124.method910(class97.field1915, (byte) 125), 0, (byte) 9);
                    class131.method836(11, (byte) -126, class111.field2128, var130);
                } else if (var124.method899(class36.field724, false)) {
                    class141 var131 = var124.method902(var124.method910(class36.field724, (byte) 120), 0, (byte) 77);
                    if (class19.field329 == 0) {
                        class131.method836(12, (byte) -110, class111.field2128, var131);
                    }
                } else if (var124.method899(class36.field717, false)) {
                    class141 var147 = var124.method902(var124.method910(class36.field717, (byte) 125), 0, (byte) 22);
                    if (class19.field329 == 0) {
                        class131.method836(13, (byte) -128, class111.field2128, var147);
                    }
                } else if (var124.method899(class41.field806, false)) {
                    class141 var142 = var124.method902(var124.method910(class31.field620, (byte) 127), 0, (byte) 30);
                    long var143 = var142.method926(19790);
                    boolean var145 = false;
                    for (int var146 = 0; var146 < class96.field1912; var146++) {
                        if (class154.field2999[var146] == var143) {
                            var145 = true;
                            break;
                        }
                    }
                    if (!var145 && class19.field329 == 0) {
                        class131.method836(14, (byte) -122, var142, class111.field2128);
                    }
                } else if (var124.method899(class36.field714, false)) {
                    boolean var137 = false;
                    class141 var138 = var124.method902(var124.method910(class31.field620, (byte) 119), 0, (byte) 126);
                    long var139 = var138.method926(19790);
                    for (int var141 = 0; var141 < class96.field1912; var141++) {
                        if (class154.field2999[var141] == var139) {
                            var137 = true;
                            break;
                        }
                    }
                    if (!var137 && class19.field329 == 0) {
                        class131.method836(15, (byte) -95, var138, class111.field2128);
                    }
                } else if (var124.method899(class119.field2309, arg0)) {
                    class141 var132 = var124.method902(var124.method910(class31.field620, (byte) 121), 0, (byte) 39);
                    boolean var133 = false;
                    long var134 = var132.method926(19790);
                    for (int var136 = 0; var136 < class96.field1912; var136++) {
                        if (class154.field2999[var136] == var134) {
                            var133 = true;
                            break;
                        }
                    }
                    if (!var133 && class19.field329 == 0) {
                        class131.method836(16, (byte) -128, var132, class111.field2128);
                    }
                } else {
                    class131.method836(0, (byte) -107, class111.field2128, var124);
                }
                class66.field1286 = -1;
                return true;
            }
            if (class66.field1286 == 42) {
                int var159 = class156.field3014.method963(109);
                int var160 = class156.field3014.method1006(-1234576288);
                class170 var161 = class192.method1268(var160, -58);
                if (var161.field3379 != var159 || var159 == -1) {
                    var161.field3406 = 0;
                    var161.field3379 = var159;
                    var161.field3345 = 0;
                    class38.method252(var161, -82);
                }
                class66.field1286 = -1;
                return true;
            }
            if (class66.field1286 == 146) {
                int var162 = class156.field3014.method1007(83);
                int var163 = class156.field3014.method1006(-1234576288);
                int var164 = var162 >> 10 & 0x1F;
                int var165 = var162 >> 5 & 0x1F;
                class170 var166 = class192.method1268(var163, -104);
                int var167 = var162 & 0x1F;
                int var168 = (var164 << 19) + (var165 << 11) + (var167 << 3);
                if (var166.field3301 != var168) {
                    var166.field3301 = var168;
                    class38.method252(var166, -108);
                }
                class66.field1286 = -1;
                return true;
            }
            if (class66.field1286 == 34) {
                class130.method827((byte) 98);
                class109.field2098 = class156.field3014.method991(255);
                class66.field1286 = -1;
                class90.field1804 = class174.field3461;
                return true;
            }
            if (class66.field1286 == 109) {
                for (int var169 = 0; var169 < class180.field3538.length; var169++) {
                    if (class98.field1947[var169] != class180.field3538[var169]) {
                        class180.field3538[var169] = class98.field1947[var169];
                        class69.method455((byte) -77, var169);
                        class172.field3427[class15.method94(class32.field648++, 31)] = var169;
                    }
                }
                class66.field1286 = -1;
                return true;
            }
            if (class66.field1286 == 162) {
                client.field597 = true;
                class22.field388 = class156.field3014.method991(255);
                class76.field1537 = class156.field3014.method991(255);
                class181.field3562 = class156.field3014.method1007(91);
                class104.field2010 = class156.field3014.method991(255);
                class90.field1796 = class156.field3014.method991(255);
                if (class90.field1796 >= 100) {
                    class184.field3589 = class76.field1537 * 128 + 64;
                    class178.field3508 = class22.field388 * 128 + 64;
                    class191.field3683 = class206.method1360(class66.field1287, class178.field3508, (byte) 40, class184.field3589) - class181.field3562;
                }
                class66.field1286 = -1;
                return true;
            }
            if (class66.field1286 == 72) {
                int var170 = class156.field3014.method1007(69);
                class20.method125((byte) 120, var170);
                class57.field1109[class15.method94(class185.field3608++, 31)] = class15.method94(var170, 32767);
                class66.field1286 = -1;
                return true;
            }
            if (class66.field1286 == 78) {
                if (class18.field322 != -1) {
                    class216.method1411(0, true, class18.field322);
                }
                class66.field1286 = -1;
                return true;
            }
            if (class66.field1286 == 236) {
                int var171 = class156.field3014.method1007(111);
                if (var171 == 65535) {
                    var171 = -1;
                }
                int var172 = class156.field3014.method1006(-1234576288);
                class170 var173 = class192.method1268(var172, -95);
                if (var173.field3315 != 2 || var173.field3327 != var171) {
                    var173.field3315 = 2;
                    var173.field3327 = var171;
                    class38.method252(var173, -122);
                }
                class66.field1286 = -1;
                return true;
            }
            if (class66.field1286 == 38) {
                int var174 = class156.field3014.method982((byte) -99);
                int var175 = class156.field3014.method988(18280);
                int var176 = class156.field3014.method982((byte) -26);
                int var177 = class156.field3014.method982((byte) -117);
                class170 var178 = class192.method1268(var175, -84);
                if (var178.field3272 != var177 || var178.field3306 != var174 || var178.field3290 != var176) {
                    var178.field3306 = var174;
                    var178.field3290 = var176;
                    var178.field3272 = var177;
                    class38.method252(var178, -126);
                }
                class66.field1286 = -1;
                return true;
            }
            if (class66.field1286 == 39) {
                int var179 = class156.field3014.method982((byte) 98);
                if (var179 == 65535) {
                    var179 = -1;
                }
                class192.method1267(var179, (byte) 114);
                class66.field1286 = -1;
                return true;
            }
            if (class66.field1286 == 219) {
                int var180 = class156.field3014.method982((byte) -65);
                if (var180 == 65535) {
                    var180 = -1;
                }
                int var181 = class156.field3014.method1012(60);
                class135.method852(123, var181, var180);
                class66.field1286 = -1;
                return true;
            }
            if (class66.field1286 == 199) {
                class184.field3590 = class156.field3014.method991(255);
                class66.field1286 = -1;
                return true;
            }
            if (class66.field1286 == 51) {
                class86.field1715 = class156.field3014.method1013(-19405);
                class34.method242((byte) 103, class86.field1715);
                class66.field1286 = -1;
                return true;
            }
            if (class66.field1286 == 148) {
                int var182 = class156.field3014.method991(255);
                int var183 = class156.field3014.method991(255);
                int var184 = class156.field3014.method991(255);
                int var185 = class156.field3014.method991(255);
                int var186 = class156.field3014.method1007(72);
                class190.field3671[var182] = true;
                class179.field3534[var182] = var183;
                class139.field2672[var182] = var184;
                class30.field582[var182] = var185;
                class168.field3237[var182] = var186;
                class66.field1286 = -1;
                return true;
            }
            if (class66.field1286 == 108) {
                class29.field567 = class156.field3014.method991(255);
                class1.field11 = class174.field3461;
                class66.field1286 = -1;
                return true;
            }
            if (class66.field1286 == 127) {
                class130.method827((byte) 127);
                class170.field3296 = class156.field3014.method992((byte) -67);
                class66.field1286 = -1;
                class90.field1804 = class174.field3461;
                return true;
            }
            if (class66.field1286 == 135) {
                class84.method578(class156.field3014, class187.field3632, 6358, class69.field1356);
                class66.field1286 = -1;
                return true;
            }
            if (class66.field1286 == 234) {
                class106.field2029 = class156.field3014.method1007(68) * 30;
                class66.field1286 = -1;
                class90.field1804 = class174.field3461;
                return true;
            }
            if (class66.field1286 == 14) {
                int var187 = class156.field3014.method979(1029109968);
                int var188 = class156.field3014.method1007(53);
                if (var187 < -70000) {
                    var188 += 32768;
                }
                class170 var189;
                if (var187 < 0) {
                    var189 = null;
                } else {
                    var189 = class192.method1268(var187, -61);
                }
                while (class156.field3014.field2865 < class187.field3632) {
                    int var190 = class156.field3014.method1010(-2);
                    int var191 = class156.field3014.method1007(47);
                    int var192 = 0;
                    if (var191 != 0) {
                        var192 = class156.field3014.method991(255);
                        if (var192 == 255) {
                            var192 = class156.field3014.method979(1029109968);
                        }
                    }
                    if (var189 != null && var190 >= 0 && var189.field3385.length > var190) {
                        var189.field3385[var190] = var191;
                        var189.field3319[var190] = var192;
                    }
                    class219.method1417(var190, var191 - 1, var188, -20971, var192);
                }
                if (var189 != null) {
                    class38.method252(var189, -102);
                }
                class130.method827((byte) 125);
                class57.field1109[class15.method94(class185.field3608++, 31)] = class15.method94(32767, var188);
                class66.field1286 = -1;
                return true;
            }
            if (class66.field1286 == 46) {
                long var193 = class156.field3014.method977(516491232);
                int var195 = class156.field3014.method1007(53);
                byte var196 = class156.field3014.method1000(1064893128);
                boolean var197 = false;
                if ((var193 & Long.MIN_VALUE) != 0L) {
                    var197 = true;
                }
                if (var197) {
                    if (class142.field2744 == 0) {
                        class66.field1286 = -1;
                        return true;
                    }
                    boolean var203 = false;
                    long var204 = var193 & Long.MAX_VALUE;
                    int var206;
                    for (var206 = 0; var206 < class142.field2744 && (class180.field3541[var206].field4067 != var204 || class180.field3541[var206].field4106 != var195); var206++) {
                    }
                    if (class142.field2744 > var206) {
                        while (class142.field2744 - 1 > var206) {
                            class180.field3541[var206] = class180.field3541[var206 + 1];
                            var206++;
                        }
                        class142.field2744--;
                        class180.field3541[class142.field2744] = null;
                    }
                } else {
                    class141 var198 = class156.field3014.method1013(-19405);
                    class215 var199 = new class215();
                    var199.field4067 = var193;
                    var199.field4094 = class206.method1361(var199.field4067, 0);
                    var199.field4098 = var196;
                    var199.field4106 = var195;
                    var199.field4104 = var198;
                    int var200;
                    for (var200 = class142.field2744 - 1; var200 >= 0; var200--) {
                        int var201 = class180.field3541[var200].field4094.method913(var199.field4094, (byte) -123);
                        if (var201 == 0) {
                            class180.field3541[var200].field4106 = var195;
                            class180.field3541[var200].field4098 = var196;
                            class180.field3541[var200].field4104 = var198;
                            if (class169.field3250 == var193) {
                                class117.field2262 = var196;
                            }
                            class106.field2037 = class174.field3461;
                            class66.field1286 = -1;
                            return true;
                        }
                        if (var201 < 0) {
                            break;
                        }
                    }
                    if (class142.field2744 >= class180.field3541.length) {
                        class66.field1286 = -1;
                        return true;
                    }
                    for (int var202 = class142.field2744 - 1; var202 > var200; var202--) {
                        class180.field3541[var202 + 1] = class180.field3541[var202];
                    }
                    if (class142.field2744 == 0) {
                        class180.field3541 = new class215[100];
                    }
                    class180.field3541[var200 + 1] = var199;
                    class142.field2744++;
                    if (class169.field3250 == var193) {
                        class117.field2262 = var196;
                    }
                }
                class66.field1286 = -1;
                class106.field2037 = class174.field3461;
                return true;
            }
            if (class66.field1286 == 18) {
                class60.method405(true, (byte) -65);
                class66.field1286 = -1;
                return true;
            }
            if (class66.field1286 == 153) {
                long var207 = class156.field3014.method977(516491232);
                class156.field3014.method1000(1064893128);
                long var209 = class156.field3014.method977(516491232);
                long var211 = (long) class156.field3014.method1007(90);
                long var213 = (long) class156.field3014.method1012(107);
                int var215 = class156.field3014.method991(255);
                long var216 = (var211 << 32) + var213;
                boolean var218 = false;
                for (int var219 = 0; var219 < 100; var219++) {
                    if (class57.field1110[var219] == var216) {
                        var218 = true;
                        break;
                    }
                }
                if (var215 <= 1) {
                    for (int var220 = 0; var220 < class96.field1912; var220++) {
                        if (class154.field2999[var220] == var207) {
                            var218 = true;
                            break;
                        }
                    }
                }
                if (!var218 && class19.field329 == 0) {
                    class57.field1110[class225.field4249] = var216;
                    class225.field4249 = (class225.field4249 + 1) % 100;
                    class141 var221 = class137.method858(class179.method1216(class156.field3014, !arg0).method935((byte) -43));
                    if (var215 == 2 || var215 == 3) {
                        class125.method805(-11840, class220.method1422(new class141[] { class82.field1635, class206.method1361(var207, 0).method898(16) }, -3), class206.method1361(var209, 0).method898(47), var221, 9);
                    } else if (var215 == 1) {
                        class125.method805(-11840, class220.method1422(new class141[] { class209.field3958, class206.method1361(var207, 0).method898(27) }, -3), class206.method1361(var209, 0).method898(21), var221, 9);
                    } else {
                        class125.method805(-11840, class206.method1361(var207, 0).method898(103), class206.method1361(var209, 0).method898(116), var221, 9);
                    }
                }
                class66.field1286 = -1;
                return true;
            }
            if (class66.field1286 == 90) {
                int var222 = class156.field3014.method988(18280);
                class170 var223 = class192.method1268(var222, -47);
                var223.field3315 = 3;
                var223.field3327 = class114.field2176.field765.method507(24295);
                class38.method252(var223, -114);
                class66.field1286 = -1;
                return true;
            }
            if (class66.field1286 == 91) {
                class141 var224 = class156.field3014.method1013(-19405);
                Object[] var225 = new Object[var224.method908(false) + 1];
                for (int var226 = var224.method908(false) - 1; var226 >= 0; var226--) {
                    if (var224.method900(126, var226) == 115) {
                        var225[var226 + 1] = class156.field3014.method1013(-19405);
                    } else {
                        var225[var226 + 1] = Integer.valueOf(class156.field3014.method979(1029109968));
                    }
                }
                var225[0] = Integer.valueOf(class156.field3014.method979(1029109968));
                class220 var227 = new class220();
                var227.field4177 = var225;
                class224.method1441(-118, var227);
                class66.field1286 = -1;
                return true;
            }
            if (class66.field1286 == 4) {
                int var228 = class156.field3014.method1007(118);
                int var229 = class156.field3014.method979(1029109968);
                if (var228 == 65535) {
                    var228 = -1;
                }
                int var230 = class156.field3014.method985((byte) -70);
                class170 var231 = class192.method1268(var230, -124);
                if (var231.field3305) {
                    var231.field3402 = var229;
                    var231.field3359 = var228;
                    class50 var233 = class96.method645((byte) -61, var228);
                    var231.field3306 = var233.field959;
                    var231.field3405 = var233.field936;
                    var231.field3381 = var233.field972;
                    var231.field3323 = var233.field967;
                    var231.field3290 = var233.field934;
                    if (var231.field3299 > 0) {
                        var231.field3290 = var231.field3290 * 32 / var231.field3299;
                    }
                    var231.field3272 = var233.field970;
                    class38.method252(var231, -83);
                } else if (var228 == -1) {
                    var231.field3315 = 0;
                    class66.field1286 = -1;
                    return true;
                } else {
                    class50 var232 = class96.method645((byte) -61, var228);
                    var231.field3315 = 4;
                    var231.field3290 = var232.field934 * 100 / var229;
                    var231.field3272 = var232.field970;
                    var231.field3306 = var232.field959;
                    var231.field3327 = var228;
                    class38.method252(var231, -114);
                }
                class66.field1286 = -1;
                return true;
            }
            if (class66.field1286 == 221 || class66.field1286 == 240 || class66.field1286 == 142 || class66.field1286 == 85 || class66.field1286 == 183 || class66.field1286 == 149 || class66.field1286 == 172 || class66.field1286 == 52 || class66.field1286 == 48 || class66.field1286 == 232 || class66.field1286 == 247) {
                class39.method255(2);
                class66.field1286 = -1;
                return true;
            }
            if (class66.field1286 == 66) {
                class32.method238((byte) 122);
                class66.field1286 = -1;
                return false;
            }
            if (class66.field1286 == 99) {
                class18.method110(arg0);
                class66.field1286 = -1;
                return true;
            }
            if (class66.field1286 == 100) {
                for (int var234 = 0; var234 < class221.field4187; var234++) {
                    class173 var235 = class163.method1133(arg0, var234);
                    if (var235 != null && var235.field3435 == 0) {
                        class98.field1947[var234] = 0;
                        class180.field3538[var234] = 0;
                    }
                }
                class130.method827((byte) 98);
                class66.field1286 = -1;
                class32.field648 += 32;
                return true;
            }
            if (class66.field1286 == 128) {
                int var236 = class156.field3014.method979(1029109968);
                class31.field631 = class69.field1356.method1255(var236, (byte) 102);
                class66.field1286 = -1;
                return true;
            }
            if (class66.field1286 == 122) {
                class150.field2892 = class156.field3014.method967((byte) -127);
                class114.field2184 = class156.field3014.method1002(-8544);
                while (class156.field3014.field2865 < class187.field3632) {
                    class66.field1286 = class156.field3014.method991(255);
                    class39.method255(2);
                }
                class66.field1286 = -1;
                return true;
            }
            if (class66.field1286 == 233) {
                int var237 = class156.field3014.method965((byte) -119);
                int var238 = class156.field3014.method985((byte) -70);
                class170 var239 = class192.method1268(var238, -103);
                if (var239 != null && var239.field3392 == 0) {
                    if (var237 > var239.field3316 - var239.field3284) {
                        var237 = var239.field3316 - var239.field3284;
                    }
                    if (var237 < 0) {
                        var237 = 0;
                    }
                    if (var239.field3383 != var237) {
                        var239.field3383 = var237;
                        class38.method252(var239, -119);
                    }
                }
                class66.field1286 = -1;
                return true;
            }
            if (class66.field1286 == 176) {
                class130.method827((byte) 107);
                int var240 = class156.field3014.method967((byte) -127);
                int var241 = class156.field3014.method988(18280);
                int var242 = class156.field3014.method967((byte) -127);
                class38.field768[var242] = var241;
                class36.field728[var242] = var240;
                class68.field1344[var242] = 1;
                for (int var243 = 0; var243 < 98; var243++) {
                    if (var241 >= class45.field867[var243]) {
                        class68.field1344[var242] = var243 + 2;
                    }
                }
                class110.field2125[class15.method94(class59.field1143++, 31)] = var242;
                class66.field1286 = -1;
                return true;
            }
            if (class66.field1286 == 166) {
                class60.method405(false, (byte) -104);
                class66.field1286 = -1;
                return true;
            }
            if (class66.field1286 == 101) {
                int var244 = class156.field3014.method1007(49);
                if (var244 == 65535) {
                    var244 = -1;
                }
                int var245 = class156.field3014.method991(255);
                int var246 = class156.field3014.method1007(55);
                class87.method592(var245, var244, 0, var246);
                class66.field1286 = -1;
                return true;
            }
            if (class66.field1286 == 159) {
                int var247 = class156.field3014.method991(255);
                if (class156.field3014.method991(255) == 0) {
                    class106.field2032[var247] = new class96();
                } else {
                    class156.field3014.field2865--;
                    class106.field2032[var247] = new class96(class156.field3014);
                }
                class70.field1410 = class174.field3461;
                class66.field1286 = -1;
                return true;
            }
            if (class66.field1286 == 44) {
                class7.method55(0);
                class66.field1286 = -1;
                return true;
            }
            if (class66.field1286 == 175) {
                int var248 = class156.field3014.method974(-711444088);
                int var249 = class156.field3014.method985((byte) -70);
                int var250 = class156.field3014.method1015((byte) 110);
                class174 var251 = (class174) class173.field3437.method792((long) var249, 22346);
                if (var251 != null) {
                    class12.method77(var251, 1, var251.field3454 != var250);
                }
                class170.method1169(var248, 100, var249, var250);
                class66.field1286 = -1;
                return true;
            }
            if (class66.field1286 == 220) {
                int var252 = class156.field3014.method1007(56);
                if (var252 == 65535) {
                    var252 = -1;
                }
                int var253 = class156.field3014.method988(18280);
                class170 var254 = class192.method1268(var253, -85);
                if (var254.field3315 != 1 || var254.field3327 != var252) {
                    var254.field3327 = var252;
                    var254.field3315 = 1;
                    class38.method252(var254, -108);
                }
                class66.field1286 = -1;
                return true;
            }
            if (class66.field1286 == 118) {
                int var255 = class156.field3014.method985((byte) -70);
                int var256 = class156.field3014.method982((byte) 107);
                class98.field1947[var256] = var255;
                if (class180.field3538[var256] != var255) {
                    class180.field3538[var256] = var255;
                    class69.method455((byte) -115, var256);
                }
                class172.field3427[class15.method94(31, class32.field648++)] = var256;
                class66.field1286 = -1;
                return true;
            }
            if (class66.field1286 == 186) {
                int var257 = class156.field3014.method1006(-1234576288);
                class170 var258 = class192.method1268(var257, -51);
                for (int var259 = 0; var259 < var258.field3385.length; var259++) {
                    var258.field3385[var259] = -1;
                    var258.field3385[var259] = 0;
                }
                class38.method252(var258, -87);
                class66.field1286 = -1;
                return true;
            }
            if (class66.field1286 == 124) {
                int var260 = class156.field3014.method982((byte) -114);
                int var261 = class156.field3014.method982((byte) -96);
                class175.field3474 = var260;
                class66.field1286 = -1;
                class19.field338 = var261;
                return true;
            }
            class170.method1162("T1 - " + class66.field1286 + "," + class57.field1105 + "," + class196.field3758 + " - " + class187.field3632, null, (byte) -112);
            class32.method238((byte) 113);
        } catch (IOException var265) {
            class4.method20(25005);
        } catch (Exception var266) {
            String var263 = "T2 - " + class66.field1286 + "," + class57.field1105 + "," + class196.field3758 + " - " + class187.field3632 + "," + (class114.field2176.field3870[0] + field1649) + "," + (class114.field2176.field3892[0] + field1644) + " - ";
            for (int var264 = 0; class187.field3632 > var264 && var264 < 50; var264++) {
                var263 = var263 + class156.field3014.field2859[var264] + ",";
            }
            class170.method1162(var263, var266, (byte) -99);
            class32.method238((byte) -39);
        }
        return true;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(B)V")
    public static void method573(byte arg0) {
        field1660 = null;
        field1659 = null;
        field1648 = null;
        field1661 = null;
        field1645 = null;
        field1646 = null;
        field1662 = null;
        field1641 = null;
        field1657 = null;
        int var1 = -28 / ((arg0 - 83) / 42);
        field1653 = null;
        field1664 = null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(BI)I")
    public final int method574(byte arg0, int arg1) {
        field1663++;
        if (this.field1658 == null) {
            return this.field1654;
        }
        if (arg0 < 30) {
            method573((byte) 7);
        }
        class110 var3 = (class110) this.field1658.method792((long) arg1, 22346);
        return var3 == null ? this.field1654 : var3.field2114;
    }
}
