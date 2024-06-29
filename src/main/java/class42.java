import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class42 {

    @OriginalMember(owner = "client!h", name = "m", descriptor = "Z")
    public boolean field962 = true;

    @OriginalMember(owner = "client!h", name = "b", descriptor = "I")
    public int field951;

    @OriginalMember(owner = "client!h", name = "o", descriptor = "I")
    public int field964;

    @OriginalMember(owner = "client!h", name = "e", descriptor = "I")
    public int field954;

    @OriginalMember(owner = "client!h", name = "x", descriptor = "I")
    public int field973;

    @OriginalMember(owner = "client!h", name = "g", descriptor = "I")
    public int field956;

    @OriginalMember(owner = "client!h", name = "q", descriptor = "I")
    public int field966;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "Lhb;")
    public static class44 field950 = class102.method810("k", -28606);

    @OriginalMember(owner = "client!h", name = "f", descriptor = "Lhb;")
    private static class44 field955 = class102.method810("You have only just left another world)3", -28606);

    @OriginalMember(owner = "client!h", name = "l", descriptor = "Lhb;")
    public static class44 field961 = class102.method810("(U1", -28606);

    @OriginalMember(owner = "client!h", name = "k", descriptor = "Lhb;")
    public static class44 field960 = field955;

    @OriginalMember(owner = "client!h", name = "r", descriptor = "Lhb;")
    public static class44 field967 = class102.method810("::clientdrop", -28606);

    @OriginalMember(owner = "client!h", name = "u", descriptor = "Lhb;")
    private static class44 field970 = class102.method810("wishes to duel with you)3", -28606);

    @OriginalMember(owner = "client!h", name = "w", descriptor = "Lhb;")
    private static class44 field972 = class102.method810("Password: ", -28606);

    @OriginalMember(owner = "client!h", name = "j", descriptor = "Lhb;")
    private static class44 field959 = class102.method810("To play on this world move to a free area first", -28606);

    @OriginalMember(owner = "client!h", name = "s", descriptor = "Lhb;")
    public static class44 field968 = field970;

    @OriginalMember(owner = "client!h", name = "v", descriptor = "Lhb;")
    private static class44 field971 = class102.method810(" is already on your ignore list", -28606);

    @OriginalMember(owner = "client!h", name = "z", descriptor = "Lhb;")
    public static class44 field975 = field959;

    @OriginalMember(owner = "client!h", name = "A", descriptor = "Lhb;")
    public static class44 field976 = field971;

    @OriginalMember(owner = "client!h", name = "h", descriptor = "Lhb;")
    public static class44 field957 = field972;

    @OriginalMember(owner = "client!h", name = "C", descriptor = "I")
    public static int field977 = 0;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!h", name = "i", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "client!h", name = "n", descriptor = "I")
    public static int field963;

    @OriginalMember(owner = "client!h", name = "p", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!h", name = "t", descriptor = "I")
    public static int field969;

    @OriginalMember(owner = "client!h", name = "y", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lne;B)V", line = 12)
    public static final void method357(class83 arg0, byte arg1) {
        short var2 = 256;
        field969++;
        if (arg1 <= 61) {
            return;
        }
        for (int var3 = 0; var3 < class39.field875.length; var3++) {
            class39.field875[var3] = 0;
        }
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) ((double) var2 * Math.random() * 128.0D);
            class39.field875[var16] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < var2 - 1; var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = (var12 << 7) + var14;
                    class69.field1707[var15] = (class39.field875[var15 + 128] + class39.field875[var15 + 1] + class39.field875[var15 - 1] + class39.field875[var15 + -128]) / 4;
                }
            }
            int[] var13 = class39.field875;
            class39.field875 = class69.field1707;
            class69.field1707 = var13;
        }
        if (arg0 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg0.field2125; var7++) {
            for (int var8 = 0; var8 < arg0.field2127; var8++) {
                if (arg0.field2122[var6++] != 0) {
                    int var9 = arg0.field2128 + var8 + 16;
                    int var10 = arg0.field2123 + var7 + 16;
                    int var11 = (var10 << 7) + var9;
                    class39.field875[var11] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II)Lnb;", line = 120)
    public static final class80 method358(int arg0, int arg1) {
        field958++;
        class80 var2 = (class80) class14.field271.method330((long) arg1, -1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class1.field13.method892(10, arg1, false);
        class80 var4 = new class80();
        var4.field2011 = arg1;
        if (var3 != null) {
            var4.method668((byte) 116, new class131(var3));
        }
        var4.method667(16102);
        if (~var4.field2037 != arg0) {
            var4.method663(method358(0, var4.field2030), method358(0, var4.field2037), -27186);
        }
        if (!class98.field2482 && var4.field2045) {
            var4.field2055 = null;
            var4.field2051 = 0;
            var4.field2004 = class41.field940;
            var4.field2015 = null;
        }
        class14.field271.method332(var4, 0, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V", line = 168)
    public static void method359(int arg0) {
        field959 = null;
        field961 = null;
        field975 = null;
        field960 = null;
        field972 = null;
        field976 = null;
        field957 = null;
        field967 = null;
        field970 = null;
        field968 = null;
        field955 = null;
        field950 = null;
        if (arg0 == 29690) {
            field971 = null;
        }
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(IIIIIIZ)V", line = 1960)
    public class42(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field951 = arg3;
        this.field964 = arg2;
        this.field962 = arg6;
        this.field954 = arg1;
        this.field973 = arg4;
        this.field956 = arg5;
        this.field966 = arg0;
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(I)Z", line = 219)
    public static final boolean method360(int arg0) {
        field952++;
        if (class107.field2711 == null) {
            return false;
        }
        try {
            int var1 = class107.field2711.method327((byte) -68);
            if (var1 == 0) {
                return false;
            }
            if (class39.field882 == -1) {
                class107.field2711.method320(0, class53.field1304.field3172, false, 1);
                class53.field1304.field3182 = 0;
                class39.field882 = class53.field1304.method701(255);
                class14.field275 = class25.field605[class39.field882];
                var1--;
            }
            if (~class14.field275 == arg0) {
                if (var1 <= 0) {
                    return false;
                }
                class107.field2711.method320(0, class53.field1304.field3172, false, 1);
                class14.field275 = class53.field1304.field3172[0] & 0xFF;
                var1--;
            }
            if (class14.field275 == -2) {
                if (var1 <= 1) {
                    return false;
                }
                class107.field2711.method320(0, class53.field1304.field3172, false, 2);
                var1 -= 2;
                class53.field1304.field3182 = 0;
                class14.field275 = class53.field1304.method1001(arg0 ^ 0xFF00);
            }
            if (class14.field275 > var1) {
                return false;
            }
            class53.field1304.field3182 = 0;
            class107.field2711.method320(0, class53.field1304.field3172, false, class14.field275);
            class118.field2903 = class1.field17;
            class1.field17 = class22.field450;
            class116.field2793 = 0;
            class22.field450 = class39.field882;
            if (class39.field882 == 26) {
                class1.field11 = class53.field1304.method995(-74);
                class39.field882 = -1;
                if (class39.field873 == class1.field11) {
                    class88.field2251 = true;
                    if (class1.field11 == 3) {
                        class39.field873 = 1;
                    } else {
                        class39.field873 = 3;
                    }
                }
                return true;
            }
            if (class39.field882 == 9) {
                int var2 = class53.field1304.method991((byte) -85);
                int var3 = class53.field1304.method994((byte) 36);
                class72 var4 = class90.method727(var3, -160);
                var4.field1823 = 1;
                var4.field1808 = var2;
                class39.field882 = -1;
                return true;
            }
            if (class39.field882 == 111) {
                long var5 = class53.field1304.method1000((byte) -57);
                class44 var7 = class43.method370(32767, class53.field1304).method377(12327);
                class49.method460(var7, class43.method361(var5, true).method395(21611), (byte) 91, 6);
                class39.field882 = -1;
                return true;
            }
            if (class39.field882 == 25) {
                int var8 = class53.field1304.method984((byte) -80);
                class72 var9 = class90.method727(var8, -160);
                var9.field1823 = 3;
                var9.field1808 = class72.field1820.field2648.method175(11);
                class39.field882 = -1;
                return true;
            }
            if (class39.field882 == 142) {
                int var10 = class53.field1304.method1001(arg0 ^ 0xFF00);
                class74.method624(-84, var10);
                if (class47.field1152 != -1) {
                    class116.method884(class47.field1152, (byte) -103);
                    class88.field2251 = true;
                    class47.field1152 = -1;
                    class101.field2572 = true;
                }
                if (class98.field2496 != -1) {
                    class116.method884(class98.field2496, (byte) 45);
                    class16.field306 = true;
                    class98.field2496 = -1;
                }
                if (class64.field1632 != -1) {
                    class116.method884(class64.field1632, (byte) -128);
                    class64.field1632 = -1;
                    class131.method1009(30, -126);
                }
                if (class109.field2735 != -1) {
                    class116.method884(class109.field2735, (byte) -117);
                    class109.field2735 = -1;
                }
                if (class125.field3032 != var10) {
                    class116.method884(class125.field3032, (byte) 116);
                    class125.field3032 = var10;
                }
                class131.field3141 = -1;
                if (class79.field1990 != 0) {
                    class16.field306 = true;
                    class79.field1990 = 0;
                }
                class39.field882 = -1;
                return true;
            }
            if (class39.field882 == 48) {
                class118.method918((byte) 106);
                class39.field882 = -1;
                return true;
            }
            if (class39.field882 == 170) {
                class44 var11 = class53.field1304.method976(-116);
                int var12 = class53.field1304.method995(arg0 ^ 0xFFFFFFB9);
                int var13 = class53.field1304.method971(true);
                if (var13 >= 1 && var13 <= 5) {
                    if (var11.method412(arg0, class49.field1207)) {
                        var11 = null;
                    }
                    class64.field1616[var13 - 1] = var11;
                    class27.field620[var13 - 1] = var12 == 0;
                }
                class39.field882 = -1;
                return true;
            }
            if (class39.field882 == 234) {
                class44 var14 = class53.field1304.method976(-119);
                if (var14.method399(class88.field2225, 1)) {
                    class44 var15 = var14.method396((byte) -107, 0, var14.method388(0, class92.field2337));
                    long var16 = var15.method407(true);
                    boolean var18 = false;
                    for (int var19 = 0; var19 < class43.field983; var19++) {
                        if (class51.field1235[var19] == var16) {
                            var18 = true;
                            break;
                        }
                    }
                    if (!var18 && class9.field192 == 0) {
                        class49.method460(class120.field2923, var15, (byte) 123, 4);
                    }
                } else if (var14.method399(class14.field266, 1)) {
                    boolean var20 = false;
                    class44 var21 = var14.method396((byte) -111, 0, var14.method388(0, class92.field2337));
                    long var22 = var21.method407(true);
                    for (int var24 = 0; var24 < class43.field983; var24++) {
                        if (class51.field1235[var24] == var22) {
                            var20 = true;
                            break;
                        }
                    }
                    if (!var20 && class9.field192 == 0) {
                        class49.method460(field968, var21, (byte) 112, 8);
                    }
                } else if (var14.method399(class97.field2475, 1)) {
                    boolean var25 = false;
                    class44 var26 = var14.method396((byte) -103, 0, var14.method388(0, class92.field2337));
                    long var27 = var26.method407(true);
                    for (int var29 = 0; var29 < class43.field983; var29++) {
                        if (class51.field1235[var29] == var27) {
                            var25 = true;
                            break;
                        }
                    }
                    if (!var25 && class9.field192 == 0) {
                        class44 var30 = var14.method396((byte) -93, var14.method388(0, class92.field2337) + 1, var14.method414((byte) 39) - 9);
                        class49.method460(var30, var26, (byte) 94, 8);
                    }
                } else {
                    class49.method460(var14, class51.field1274, (byte) 89, 0);
                }
                class39.field882 = -1;
                return true;
            }
            if (class39.field882 == 126) {
                class77.field1937 = class53.field1304.method972((byte) 112);
                class72.field1828 = class53.field1304.method971(true);
                for (int var31 = class72.field1828; var31 < class72.field1828 + 8; var31++) {
                    for (int var32 = class77.field1937; var32 < class77.field1937 + 8; var32++) {
                        if (class82.field2115[class79.field1993][var31][var32] != null) {
                            class82.field2115[class79.field1993][var31][var32] = null;
                            class36.method341(-49, var32, var31);
                        }
                    }
                }
                for (class125 var33 = (class125) class96.field2437.method443((byte) -111); var33 != null; var33 = (class125) class96.field2437.method434(true)) {
                    if (var33.field3038 >= class72.field1828 && var33.field3038 < class72.field1828 + 8 && class77.field1937 <= var33.field3017 && var33.field3017 < class77.field1937 + 8 && class79.field1993 == var33.field3010) {
                        var33.field3007 = 0;
                    }
                }
                class39.field882 = -1;
                return true;
            }
            if (class39.field882 == 221) {
                class39.field873 = class53.field1304.method972((byte) 105);
                class39.field882 = -1;
                class88.field2251 = true;
                class101.field2572 = true;
                return true;
            }
            if (class39.field882 == 144) {
                class86.field2202 = class53.field1304.method971(true);
                if (class86.field2202 == 1) {
                    class48.field1186 = class53.field1304.method1001(65280);
                }
                if (class86.field2202 >= 2 && class86.field2202 <= 6) {
                    if (class86.field2202 == 2) {
                        class14.field277 = 64;
                        class53.field1311 = 64;
                    }
                    if (class86.field2202 == 3) {
                        class14.field277 = 0;
                        class53.field1311 = 64;
                    }
                    if (class86.field2202 == 4) {
                        class53.field1311 = 64;
                        class14.field277 = 128;
                    }
                    if (class86.field2202 == 5) {
                        class14.field277 = 64;
                        class53.field1311 = 0;
                    }
                    if (class86.field2202 == 6) {
                        class53.field1311 = 128;
                        class14.field277 = 64;
                    }
                    class86.field2202 = 2;
                    class94.field2384 = class53.field1304.method1001(65280);
                    class43.field1009 = class53.field1304.method1001(arg0 ^ 0xFF00);
                    class22.field455 = class53.field1304.method971(true);
                }
                if (class86.field2202 == 10) {
                    class47.field1172 = class53.field1304.method1001(65280);
                }
                class39.field882 = -1;
                return true;
            }
            if (class39.field882 == 246) {
                class39.method344(false, -121);
                class39.field882 = -1;
                return true;
            }
            if (class39.field882 == 17) {
                int var34 = class53.field1304.method984((byte) -49);
                boolean var35 = class53.field1304.method971(true) == 1;
                class72 var36 = class90.method727(var34, -160);
                var36.field1809 = var35;
                class39.field882 = -1;
                return true;
            }
            if (class39.field882 == 115) {
                if (class39.field873 == 12) {
                    class88.field2251 = true;
                }
                class113.field2783 = class53.field1304.method971(true);
                class39.field882 = -1;
                return true;
            }
            if (class39.field882 == 71 || class39.field882 == 33 || class39.field882 == 230 || class39.field882 == 37 || class39.field882 == 158 || class39.field882 == 66 || class39.field882 == 89 || class39.field882 == 163 || class39.field882 == 209 || class39.field882 == 79 || class39.field882 == 116) {
                class57.method534((byte) 40);
                class39.field882 = -1;
                return true;
            }
            if (class39.field882 == 104) {
                int var37 = class53.field1304.method1015(31843);
                class44 var38 = class53.field1304.method976(arg0 ^ 0xFFFFFF81);
                class72 var39 = class90.method727(var37, -160);
                var39.field1794 = var38;
                if (var37 >> 16 == class107.field2728[class39.field873]) {
                    class88.field2251 = true;
                }
                class39.field882 = -1;
                return true;
            }
            if (class39.field882 == 146) {
                for (int var40 = 0; var40 < class21.field440.length; var40++) {
                    if (class21.field440[var40] != class130.field3120[var40]) {
                        class21.field440[var40] = class130.field3120[var40];
                        class69.method596(12872, var40);
                        class88.field2251 = true;
                    }
                }
                class39.field882 = -1;
                return true;
            }
            if (class39.field882 == 50) {
                int var41 = class53.field1304.method1001(65280);
                int var42 = class53.field1304.method971(true);
                int var43 = class53.field1304.method1001(arg0 + 65280);
                if (class47.field1177 != 0 && var42 != 0 && field977 < 50) {
                    class41.field917[field977] = var41;
                    class67.field1680[field977] = var42;
                    class15.field304[field977] = var43;
                    class109.field2742[field977] = null;
                    class11.field205[field977] = 0;
                    field977++;
                }
                class39.field882 = -1;
                return true;
            }
            if (class39.field882 == 135) {
                int var44 = class53.field1304.method979((byte) 122);
                int var45 = class53.field1304.method1015(arg0 ^ 0x7C63);
                int var46 = class53.field1304.method981((byte) -117);
                class72 var47 = class90.method727(var45, -160);
                var47.field1770 = var47.field1825 + var44;
                var47.field1791 = var47.field1777 + var46;
                class39.field882 = -1;
                return true;
            }
            if (class39.field882 == 84) {
                class88.field2251 = true;
                int var48 = class53.field1304.method1020(-119);
                int var49 = class53.field1304.method972((byte) 53);
                int var50 = class53.field1304.method994((byte) 36);
                class77.field1933[var48] = var50;
                class19.field397[var48] = var49;
                class131.field3190[var48] = 1;
                for (int var51 = 0; var51 < 98; var51++) {
                    if (var50 >= class16.field326[var51]) {
                        class131.field3190[var48] = var51 + 2;
                    }
                }
                class39.field882 = -1;
                return true;
            }
            if (class39.field882 == 166) {
                int var52 = class53.field1304.method984((byte) 123);
                int var53 = class53.field1304.method1007((byte) -33);
                class130.field3120[var53] = var52;
                if (class21.field440[var53] != var52) {
                    class21.field440[var53] = var52;
                    class69.method596(12872, var53);
                    if (class74.field1886 != -1) {
                        class16.field306 = true;
                    }
                    class88.field2251 = true;
                }
                class39.field882 = -1;
                return true;
            }
            if (class39.field882 == 109) {
                class33.field802 = true;
                class16.field327 = class53.field1304.method971(true);
                class75.field1914 = class53.field1304.method971(true);
                class9.field175 = class53.field1304.method1001(65280);
                class67.field1684 = class53.field1304.method971(true);
                class35.field849 = class53.field1304.method971(true);
                if (class35.field849 >= 100) {
                    int var54 = class16.field327 * 128 + 64;
                    int var55 = class75.field1914 * 128 + 64;
                    int var56 = class55.method507(var55, class79.field1993, var54, -1) - class9.field175;
                    int var57 = var54 - class130.field3122;
                    int var58 = var55 - class51.field1279;
                    int var59 = var56 - class88.field2236;
                    int var60 = (int) Math.sqrt((double) (var57 * var57 + var58 * var58));
                    class95.field2420 = (int) (Math.atan2((double) var59, (double) var60) * 325.949D) & 0x7FF;
                    class101.field2579 = (int) (Math.atan2((double) var57, (double) var58) * -325.949D) & 0x7FF;
                    if (class95.field2420 < 128) {
                        class95.field2420 = 128;
                    }
                    if (class95.field2420 > 383) {
                        class95.field2420 = 383;
                    }
                }
                class39.field882 = -1;
                return true;
            }
            if (class39.field882 == 112) {
                int var61 = class53.field1304.method969(true);
                class74.method624(arg0 ^ 0x26, var61);
                if (class98.field2496 != -1) {
                    class116.method884(class98.field2496, (byte) -120);
                    class16.field306 = true;
                    class98.field2496 = -1;
                }
                if (class64.field1632 != -1) {
                    class116.method884(class64.field1632, (byte) -110);
                    class64.field1632 = -1;
                    class131.method1009(30, -118);
                }
                if (class109.field2735 != -1) {
                    class116.method884(class109.field2735, (byte) -121);
                    class109.field2735 = -1;
                }
                if (class125.field3032 != -1) {
                    class116.method884(class125.field3032, (byte) -114);
                    class125.field3032 = -1;
                }
                if (class47.field1152 != var61) {
                    class116.method884(class47.field1152, (byte) -106);
                    class47.field1152 = var61;
                }
                class101.field2572 = true;
                class131.field3141 = -1;
                if (class79.field1990 != 0) {
                    class16.field306 = true;
                    class79.field1990 = 0;
                }
                class39.field882 = -1;
                class88.field2251 = true;
                return true;
            }
            if (class39.field882 == 56) {
                for (int var62 = 0; var62 < class82.field2110.length; var62++) {
                    if (class82.field2110[var62] != null) {
                        class82.field2110[var62].field1415 = -1;
                    }
                }
                for (int var63 = 0; var63 < class116.field2845.length; var63++) {
                    if (class116.field2845[var63] != null) {
                        class116.field2845[var63].field1415 = -1;
                    }
                }
                class39.field882 = -1;
                return true;
            }
            if (class39.field882 == 94) {
                int var64 = class53.field1304.method1001(65280);
                int var65 = class53.field1304.method1001(65280);
                if (class98.field2496 != -1) {
                    class116.method884(class98.field2496, (byte) -108);
                    class98.field2496 = -1;
                    class16.field306 = true;
                }
                if (class64.field1632 != -1) {
                    class116.method884(class64.field1632, (byte) -102);
                    class64.field1632 = -1;
                    class131.method1009(30, -95);
                }
                if (class109.field2735 != -1) {
                    class116.method884(class109.field2735, (byte) 9);
                    class109.field2735 = -1;
                }
                if (class125.field3032 != var64) {
                    class116.method884(class125.field3032, (byte) 60);
                    class125.field3032 = var64;
                }
                if (class47.field1152 != var65) {
                    class116.method884(class47.field1152, (byte) 112);
                    class47.field1152 = var65;
                }
                class101.field2572 = true;
                class88.field2251 = true;
                class131.field3141 = -1;
                if (class79.field1990 != 0) {
                    class79.field1990 = 0;
                    class16.field306 = true;
                }
                class39.field882 = -1;
                return true;
            }
            if (class39.field882 == 55) {
                int var66 = class53.field1304.method971(true);
                int var67 = class53.field1304.method971(true);
                int var68 = class53.field1304.method971(true);
                int var69 = class53.field1304.method971(true);
                class100.field2548[var66] = true;
                class122.field2974[var66] = var67;
                class2.field29[var66] = var68;
                class27.field626[var66] = var69;
                class90.field2311[var66] = 0;
                class39.field882 = -1;
                return true;
            }
            if (class39.field882 == 23) {
                class43.field983 = class14.field275 / 8;
                for (int var70 = 0; var70 < class43.field983; var70++) {
                    class51.field1235[var70] = class53.field1304.method1000((byte) -69);
                }
                class39.field882 = -1;
                return true;
            }
            if (class39.field882 == 91) {
                int var71 = class53.field1304.method978((byte) -112);
                if (var71 >= 0) {
                    class74.method624(-88, var71);
                }
                if (class22.field458 != var71) {
                    class116.method884(class22.field458, (byte) -111);
                    class22.field458 = var71;
                }
                class39.field882 = -1;
                return true;
            }
            if (class39.field882 == 202) {
                int var72 = class53.field1304.method994((byte) 36);
                int var73 = class53.field1304.method1007((byte) -33);
                int var74 = var73 >> 5 & 0x1F;
                int var75 = var73 >> 10 & 0x1F;
                class72 var76 = class90.method727(var72, arg0 ^ 0xFFFFFF60);
                int var77 = var73 & 0x1F;
                var76.field1831 = (var77 << 3) + (var74 << 11) + (var75 << 19);
                class39.field882 = -1;
                return true;
            }
            if (class39.field882 == 226) {
                int var78 = class53.field1304.method984((byte) 126);
                int var79 = class53.field1304.method1001(arg0 + 65280);
                class72 var80 = class90.method727(var78, -160);
                class39.field882 = -1;
                var80.field1808 = var79;
                var80.field1823 = 2;
                return true;
            }
            if (class39.field882 == 27) {
                long var81 = class53.field1304.method1000((byte) -67);
                long var83 = (long) class53.field1304.method1001(65280);
                long var85 = (long) class53.field1304.method974(255);
                long var87 = (var83 << 32) + var85;
                int var89 = class53.field1304.method971(true);
                boolean var90 = false;
                for (int var91 = 0; var91 < 100; var91++) {
                    if (class96.field2447[var91] == var87) {
                        var90 = true;
                        break;
                    }
                }
                if (var89 <= 1) {
                    for (int var92 = 0; var92 < class43.field983; var92++) {
                        if (class51.field1235[var92] == var81) {
                            var90 = true;
                            break;
                        }
                    }
                }
                if (!var90 && class9.field192 == 0) {
                    class96.field2447[class95.field2422] = var87;
                    class95.field2422 = (class95.field2422 + 1) % 100;
                    class44 var93 = class43.method370(arg0 ^ 0x7FFF, class53.field1304).method377(12327);
                    if (var89 == 2 || var89 == 3) {
                        class49.method460(var93, class117.method903(new class44[] { class48.field1190, class43.method361(var81, true).method395(21611) }, false), (byte) 95, 7);
                    } else if (var89 == 1) {
                        class49.method460(var93, class117.method903(new class44[] { class5.field122, class43.method361(var81, true).method395(21611) }, false), (byte) 112, 7);
                    } else {
                        class49.method460(var93, class43.method361(var81, true).method395(21611), (byte) 105, 3);
                    }
                }
                class39.field882 = -1;
                return true;
            }
            if (class39.field882 == 40) {
                class5.field117 = class53.field1304.method969(true);
                class39.field882 = -1;
                return true;
            }
            if (class39.field882 == 118) {
                int var94 = class53.field1304.method1015(arg0 ^ 0x7C63);
                int var95 = class53.field1304.method1008(106);
                class72 var96 = class90.method727(var94, -160);
                class39.field882 = -1;
                if (var96.field1752 != var95 || var95 == -1) {
                    var96.field1752 = var95;
                    var96.field1832 = 0;
                    var96.field1796 = 0;
                }
                return true;
            }
            if (class39.field882 == 5) {
                class33.field802 = true;
                class48.field1193 = class53.field1304.method971(true);
                class52.field1298 = class53.field1304.method971(true);
                class35.field851 = class53.field1304.method1001(65280);
                class41.field935 = class53.field1304.method971(true);
                class47.field1170 = class53.field1304.method971(true);
                if (class47.field1170 >= 100) {
                    class130.field3122 = class48.field1193 * 128 + 64;
                    class51.field1279 = class52.field1298 * 128 + 64;
                    class88.field2236 = class55.method507(class51.field1279, class79.field1993, class130.field3122, ~arg0) - class35.field851;
                }
                class39.field882 = -1;
                return true;
            }
            if (class39.field882 == 68) {
                if (class47.field1152 != -1) {
                    class116.method884(class47.field1152, (byte) -99);
                    class88.field2251 = true;
                    class47.field1152 = -1;
                    class101.field2572 = true;
                }
                if (class98.field2496 != -1) {
                    class116.method884(class98.field2496, (byte) 87);
                    class16.field306 = true;
                    class98.field2496 = -1;
                }
                if (class64.field1632 != -1) {
                    class116.method884(class64.field1632, (byte) 65);
                    class64.field1632 = -1;
                    class131.method1009(30, arg0 - 68);
                }
                if (class109.field2735 != -1) {
                    class116.method884(class109.field2735, (byte) 108);
                    class109.field2735 = -1;
                }
                if (class125.field3032 != -1) {
                    class116.method884(class125.field3032, (byte) -103);
                    class125.field3032 = -1;
                }
                class39.field882 = -1;
                if (class79.field1990 != 0) {
                    class16.field306 = true;
                    class79.field1990 = 0;
                }
                class131.field3141 = -1;
                return true;
            }
            if (class39.field882 == 58) {
                int var97 = class53.field1304.method991((byte) -85);
                int var98 = class53.field1304.method994((byte) 36);
                int var99 = class53.field1304.method991((byte) -85);
                int var100 = class53.field1304.method991((byte) -85);
                class72 var101 = class90.method727(var98, arg0 - 160);
                class39.field882 = -1;
                var101.field1834 = var100;
                var101.field1819 = var97;
                var101.field1807 = var99;
                return true;
            }
            if (class39.field882 == 129) {
                int var102 = class53.field1304.method973(-4);
                int var103 = class53.field1304.method991((byte) -85);
                class72 var104 = class90.method727(var102, -160);
                if (var104 != null && var104.field1810 == 0) {
                    if (var103 < 0) {
                        var103 = 0;
                    }
                    if (var104.field1817 - var104.field1760 < var103) {
                        var103 = var104.field1817 - var104.field1760;
                    }
                    var104.field1827 = var103;
                }
                class39.field882 = -1;
                return true;
            }
            if (class39.field882 == 83) {
                int var105 = class53.field1304.method994((byte) 36);
                class89.field2289 = class103.field2626.method514(var105, 112);
                class39.field882 = -1;
                return true;
            }
            if (class39.field882 == 235) {
                class21.field425 = class53.field1304.method971(true);
                class39.field882 = -1;
                return true;
            }
            if (class39.field882 == 179) {
                int var106 = class53.field1304.method1001(65280);
                int var107 = class53.field1304.method991((byte) -85);
                class74.method624(-87, var106);
                if (var107 != -1) {
                    class74.method624(59, var107);
                }
                if (class125.field3032 != -1) {
                    class116.method884(class125.field3032, (byte) 10);
                    class125.field3032 = -1;
                }
                if (class47.field1152 != -1) {
                    class116.method884(class47.field1152, (byte) -106);
                    class47.field1152 = -1;
                }
                if (class98.field2496 != -1) {
                    class116.method884(class98.field2496, (byte) -114);
                    class98.field2496 = -1;
                }
                if (class64.field1632 != var106) {
                    class116.method884(class64.field1632, (byte) -106);
                    class64.field1632 = var106;
                    class131.method1009(35, -96);
                }
                if (class109.field2735 != var106) {
                    class116.method884(class109.field2735, (byte) 104);
                    class109.field2735 = var107;
                }
                class39.field882 = -1;
                class79.field1990 = 0;
                class131.field3141 = -1;
                return true;
            }
            if (class39.field882 == 137) {
                class25.method211(0);
                class39.field882 = -1;
                return true;
            }
            if (class39.field882 == 54) {
                class88.field2251 = true;
                int var108 = class53.field1304.method994((byte) 36);
                class72 var109 = class90.method727(var108, -160);
                int var110 = class53.field1304.method1001(arg0 ^ 0xFF00);
                for (int var111 = 0; var111 < var110; var111++) {
                    int var112 = class53.field1304.method1007((byte) -33);
                    int var113 = class53.field1304.method995(arg0 - 31);
                    if (var113 == 255) {
                        var113 = class53.field1304.method973(arg0 - 4);
                    }
                    if (var109.field1804.length > var111) {
                        var109.field1804[var111] = var112;
                        var109.field1824[var111] = var113;
                    }
                }
                for (int var114 = var110; var114 < var109.field1804.length; var114++) {
                    var109.field1804[var114] = 0;
                    var109.field1824[var114] = 0;
                }
                class39.field882 = -1;
                return true;
            }
            if (class39.field882 == 16) {
                class33.field802 = false;
                for (int var115 = 0; var115 < 5; var115++) {
                    class100.field2548[var115] = false;
                }
                class39.field882 = -1;
                return true;
            }
            if (class39.field882 == 154) {
                long var116 = class53.field1304.method1000((byte) -121);
                int var118 = class53.field1304.method1001(65280);
                class44 var119 = class43.method361(var116, true).method395(21611);
                for (int var120 = 0; var120 < class49.field1208; var120++) {
                    if (class62.field1587[var120] == var116) {
                        if (class25.field600[var120] != var118) {
                            class25.field600[var120] = var118;
                            class88.field2251 = true;
                            if (var118 > 0) {
                                class49.method460(class117.method903(new class44[] { var119, class109.field2744 }, false), class51.field1274, (byte) 94, 5);
                            }
                            if (var118 == 0) {
                                class49.method460(class117.method903(new class44[] { var119, class110.field2754 }, false), class51.field1274, (byte) 109, 5);
                            }
                        }
                        var119 = null;
                        break;
                    }
                }
                boolean var121 = false;
                if (var119 != null && class49.field1208 < 200) {
                    class62.field1587[class49.field1208] = var116;
                    class52.field1300[class49.field1208] = var119;
                    class25.field600[class49.field1208] = var118;
                    class49.field1208++;
                    class88.field2251 = true;
                }
                while (!var121) {
                    var121 = true;
                    for (int var122 = 0; var122 < class49.field1208 - 1; var122++) {
                        if (class25.field600[var122] != class84.field2142 && class25.field600[var122 + 1] == class84.field2142 || class25.field600[var122] == 0 && class25.field600[var122 + 1] != 0) {
                            var121 = false;
                            int var123 = class25.field600[var122];
                            class25.field600[var122] = class25.field600[var122 + 1];
                            class25.field600[var122 + 1] = var123;
                            class44 var124 = class52.field1300[var122];
                            class52.field1300[var122] = class52.field1300[var122 + 1];
                            class52.field1300[var122 + 1] = var124;
                            long var125 = class62.field1587[var122];
                            class62.field1587[var122] = class62.field1587[var122 + 1];
                            class62.field1587[var122 + 1] = var125;
                            class88.field2251 = true;
                        }
                    }
                }
                class39.field882 = -1;
                return true;
            }
            if (class39.field882 == 222) {
                int var127 = class53.field1304.method1008(68);
                if (class74.field1886 != var127) {
                    class116.method884(class74.field1886, (byte) 34);
                    class74.field1886 = var127;
                }
                class16.field306 = true;
                class39.field882 = -1;
                return true;
            }
            if (class39.field882 == 233) {
                class84.method687(class103.field2626, class14.field275, -1, class53.field1304);
                class39.field882 = -1;
                return true;
            }
            if (class39.field882 == 36) {
                int var128 = class53.field1304.method1001(65280);
                byte var129 = class53.field1304.method999((byte) -126);
                class130.field3120[var128] = var129;
                if (class21.field440[var128] != var129) {
                    class21.field440[var128] = var129;
                    class69.method596(12872, var128);
                    class88.field2251 = true;
                    if (class74.field1886 != -1) {
                        class16.field306 = true;
                    }
                }
                class39.field882 = -1;
                return true;
            }
            if (class39.field882 == 123) {
                int var130 = class53.field1304.method991((byte) -85);
                int var131 = class53.field1304.method995(-94);
                if (var130 == 65535) {
                    var130 = -1;
                }
                if (class107.field2728[var131] != var130) {
                    class116.method884(class107.field2728[var131], (byte) 88);
                    class107.field2728[var131] = var130;
                }
                class39.field882 = -1;
                class101.field2572 = true;
                class88.field2251 = true;
                return true;
            }
            if (class39.field882 == 232) {
                int var132 = class53.field1304.method991((byte) -85);
                int var133 = class53.field1304.method1007((byte) -33);
                int var134 = class53.field1304.method973(-4);
                class72 var135 = class90.method727(var134, -160);
                var135.field1775 = (var132 << 16) + var133;
                class39.field882 = -1;
                return true;
            }
            if (class39.field882 == 4) {
                class105.field2686 = class53.field1304.method971(true);
                class88.field2251 = true;
                class39.field882 = -1;
                return true;
            }
            if (class39.field882 == 224) {
                class79.field1990 = 2;
                class16.field306 = true;
                class51.field1257 = class51.field1274;
                class116.field2843 = false;
                class39.field882 = -1;
                return true;
            }
            if (class39.field882 == 201) {
                class35.field853 = class53.field1304.method1001(65280) * 30;
                class39.field882 = -1;
                return true;
            }
            if (class39.field882 == 49) {
                class77.field1937 = class53.field1304.method1020(-124);
                class72.field1828 = class53.field1304.method1020(-119);
                class39.field882 = -1;
                return true;
            }
            if (class39.field882 == 255) {
                int var136 = class53.field1304.method1007((byte) -33);
                class74.method624(49, var136);
                if (class47.field1152 != -1) {
                    class116.method884(class47.field1152, (byte) 78);
                    class101.field2572 = true;
                    class47.field1152 = -1;
                    class88.field2251 = true;
                }
                if (class64.field1632 != -1) {
                    class116.method884(class64.field1632, (byte) 18);
                    class64.field1632 = -1;
                    class131.method1009(30, -127);
                }
                if (class109.field2735 != -1) {
                    class116.method884(class109.field2735, (byte) -102);
                    class109.field2735 = -1;
                }
                if (class125.field3032 != -1) {
                    class116.method884(class125.field3032, (byte) -102);
                    class125.field3032 = -1;
                }
                if (class98.field2496 != var136) {
                    class116.method884(class98.field2496, (byte) -103);
                    class98.field2496 = var136;
                }
                class16.field306 = true;
                class39.field882 = -1;
                class131.field3141 = -1;
                return true;
            }
            if (class39.field882 == 92) {
                if (class39.field873 == 12) {
                    class88.field2251 = true;
                }
                class109.field2732 = class53.field1304.method978((byte) -49);
                class39.field882 = -1;
                return true;
            }
            if (class39.field882 == 195) {
                class79.field1990 = 1;
                class51.field1257 = class51.field1274;
                class116.field2843 = false;
                class39.field882 = -1;
                class16.field306 = true;
                return true;
            }
            if (class39.field882 == 215) {
                class48.field1191 = class53.field1304.method971(true);
                class39.field882 = -1;
                return true;
            }
            if (class39.field882 == 110) {
                class39.method344(true, -96);
                class39.field882 = -1;
                return true;
            }
            if (class39.field882 == 76) {
                for (int var137 = 0; var137 < field965; var137++) {
                    class71 var138 = class81.method674((byte) -127, var137);
                    if (var138 != null && var138.field1739 == 0) {
                        class130.field3120[var137] = 0;
                        class21.field440[var137] = 0;
                    }
                }
                class88.field2251 = true;
                if (class74.field1886 != -1) {
                    class16.field306 = true;
                }
                class39.field882 = -1;
                return true;
            }
            if (class39.field882 == 250) {
                class88.field2251 = true;
                int var139 = class53.field1304.method994((byte) 36);
                class72 var140 = class90.method727(var139, -160);
                while (class53.field1304.field3182 < class14.field275) {
                    int var141 = class53.field1304.method1019(174545128);
                    int var142 = class53.field1304.method1001(65280);
                    int var143 = 0;
                    if (var142 != 0) {
                        var143 = class53.field1304.method971(true);
                        if (var143 == 255) {
                            var143 = class53.field1304.method994((byte) 36);
                        }
                    }
                    if (var141 >= 0 && var140.field1804.length > var141) {
                        var140.field1804[var141] = var142;
                        var140.field1824[var141] = var143;
                    }
                }
                class39.field882 = -1;
                return true;
            }
            if (class39.field882 == 211) {
                class19.method146(arg0 + 10);
                class39.field882 = -1;
                return false;
            }
            if (class39.field882 == 167) {
                class72.field1828 = class53.field1304.method1020(-123);
                class77.field1937 = class53.field1304.method995(-104);
                while (class53.field1304.field3182 < class14.field275) {
                    class39.field882 = class53.field1304.method971(true);
                    class57.method534((byte) 40);
                }
                class39.field882 = -1;
                return true;
            }
            if (class39.field882 == 241) {
                int var144 = class53.field1304.method973(-4);
                class72 var145 = class90.method727(var144, -160);
                for (int var146 = 0; var146 < var145.field1804.length; var146++) {
                    var145.field1804[var146] = -1;
                    var145.field1804[var146] = 0;
                }
                class39.field882 = -1;
                return true;
            }
            if (class39.field882 == 175) {
                int var147 = class53.field1304.method1001(arg0 ^ 0xFF00);
                int var148 = class53.field1304.method1015(31843);
                int var149 = class53.field1304.method1001(65280);
                class72 var150 = class90.method727(var148, arg0 - 160);
                if (var147 == 65535) {
                    class39.field882 = -1;
                    var150.field1823 = 0;
                    return true;
                }
                class80 var151 = method358(0, var147);
                var150.field1834 = var151.field2054 * 100 / var149;
                var150.field1819 = var151.field2050;
                var150.field1808 = var147;
                class39.field882 = -1;
                var150.field1823 = 4;
                var150.field1807 = var151.field2048;
                return true;
            }
            if (class39.field882 == 219) {
                int var152 = class53.field1304.method991((byte) -85);
                if (var152 == 65535) {
                    var152 = -1;
                }
                if (var152 == -1 && class117.field2858 == 0) {
                    class1.method10((byte) 124);
                } else if (var152 != -1 && class15.field286 != var152 && class82.field2119 != 0 && class117.field2858 == 0) {
                    class1.method13(var152, class94.field2398, (byte) -104, 10, false, class82.field2119, 0, 0);
                }
                class39.field882 = -1;
                class15.field286 = var152;
                return true;
            }
            if (class39.field882 == 1) {
                int var153 = class53.field1304.method974(255);
                int var154 = class53.field1304.method991((byte) -85);
                if (var154 == 65535) {
                    var154 = -1;
                }
                if (class82.field2119 != 0 && var154 != -1) {
                    class1.method4(1, class82.field2119, 0, class130.field3114, (byte) -112, var154, false);
                    class117.field2858 = var153;
                }
                class39.field882 = -1;
                return true;
            }
            if (class39.field882 == 143) {
                class90.field2301 = 0;
                class39.field882 = -1;
                return true;
            }
            if (class39.field882 == 28) {
                class89.field2263 = class53.field1304.method971(true);
                class39.field881 = class53.field1304.method971(true);
                class71.field1745 = class53.field1304.method971(true);
                class16.field306 = true;
                class39.field882 = -1;
                class104.field2652 = true;
                return true;
            }
            client.method132("T1 - " + class39.field882 + "," + class1.field17 + "," + class118.field2903 + " - " + class14.field275, null, (byte) 68);
            class19.method146(arg0 + 10);
        } catch (IOException var158) {
            class117.method901((byte) -48);
        } catch (Exception var159) {
            String var156 = "T2 - " + class39.field882 + "," + class1.field17 + "," + class118.field2903 + " - " + class14.field275 + "," + (class104.field2666 + class72.field1820.field1355[0]) + "," + (class72.field1820.field1350[0] + class120.field2936) + " - ";
            for (int var157 = 0; var157 < class14.field275 && var157 < 50; var157++) {
                var156 = var156 + class53.field1304.field3172[var157] + ",";
            }
            client.method132(var156, var159, (byte) 68);
            class19.method146(10);
        }
        return true;
    }
}
