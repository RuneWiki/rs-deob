import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class252 {

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "[[I")
    public static int[][] field4161 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "[I")
    public static int[] field4160 = new int[2500];

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "Ljava/lang/String;")
    public static String field4167 = "glow3:";

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "I")
    public static int field4169 = 0;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
    public static int field4164;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
    public static int field4165;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
    public static int field4166;

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "I")
    public static int field4168;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "Lsi;")
    public static class204 field4163;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "Llc;")
    public static class86 field4159;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "[[[B")
    public static byte[][][] field4162;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)V")
    public static final void method1789(byte arg0) {
        field4164++;
        class40.method307(-104, false);
        class143.field2315 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class206.field3311.length; var2++) {
            if (class16.field183[var2] != -1 && class206.field3311[var2] == null) {
                class206.field3311[var2] = class159.field2599.method643(0, class16.field183[var2], false);
                if (class206.field3311[var2] == null) {
                    var1 = false;
                    class143.field2315++;
                }
            }
            if (class195.field3167[var2] != -1 && class283.field4500[var2] == null) {
                class283.field4500[var2] = class159.field2599.method633(class218.field3483[var2], (byte) -18, 0, class195.field3167[var2]);
                if (class283.field4500[var2] == null) {
                    class143.field2315++;
                    var1 = false;
                }
            }
            if (class85.field1233 != null && class200.field3214[var2] == null && class85.field1233[var2] != -1) {
                class200.field3214[var2] = class159.field2599.method633(class218.field3483[var2], (byte) -18, 0, class85.field1233[var2]);
                if (class200.field3214[var2] == null) {
                    class143.field2315++;
                    var1 = false;
                }
            }
        }
        if (class244.field3958 == null) {
            if (class195.field3162 == null || !class296.field4676.method620(true, class195.field3162.field3546 + "_labels")) {
                class244.field3958 = new class80(0);
            } else if (class296.field4676.method647(arg0 - 16, class195.field3162.field3546 + "_labels")) {
                class244.field3958 = class101.method765(2, class195.field3162.field3546 + "_labels", class296.field4676);
            } else {
                var1 = false;
                class143.field2315++;
            }
        }
        if (!var1) {
            class10.field96 = 1;
            return;
        }
        boolean var3 = true;
        class286.field4549 = 0;
        for (int var4 = 0; var4 < class206.field3311.length; var4++) {
            byte[] var20 = class283.field4500[var4];
            if (var20 != null) {
                int var21 = (class286.field4548[var4] >> 8) * 64 - class282.field4487;
                int var22 = (class286.field4548[var4] & 0xFF) * 64 - class99.field1465;
                if (class100.field1467) {
                    var22 = 10;
                    var21 = 10;
                }
                var3 &= class51.method391(var22, (byte) -92, var21, var20);
            }
        }
        if (!var3) {
            class10.field96 = 2;
            return;
        }
        if (class10.field96 != 0) {
            class12.method94(class132.field2182 + "<br>(100%)", 250, true);
        }
        class126.method908(-125);
        class210.method1531(121);
        boolean var5 = false;
        if (arg0 != -75) {
            field4169 = -40;
        }
        class233.method1646(4, 104, 104, 25, var5);
        for (int var6 = 0; var6 < 4; var6++) {
            class138.field2237[var6].method827((byte) -60);
        }
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var18 = 0; var18 < 104; var18++) {
                for (int var19 = 0; var19 < 104; var19++) {
                    class86.field1277[var7][var18][var19] = 0;
                }
            }
        }
        class118.method864(false, false);
        class126.method908(122);
        System.gc();
        class40.method307(arg0 ^ 0x29, true);
        class227.method1625(104, false);
        if (!class100.field1467) {
            class179.method1338(false, arg0 + 75);
            class40.method307(-118, true);
            class184.method1363(false, 255);
            if (class200.field3214 != null) {
                class33.method255((byte) -19);
            }
        }
        if (class100.field1467) {
            class108.method804((byte) -124, false);
            class40.method307(-97, true);
            class53.method404(93, false);
        }
        class210.method1531(123);
        class40.method307(-104, true);
        class24.method174(false, class138.field2237, class100.field1467 ? class121.field1771 : null, 100);
        class40.method307(-126, true);
        int var8 = class29.field357;
        if (var8 > class58.field826) {
            var8 = class58.field826;
        }
        if (var8 < class58.field826 - 1) {
            int var9 = class58.field826 - 1;
        }
        if (class77.method566((byte) -95)) {
            class179.method1335(0);
        } else {
            class179.method1335(class29.field357);
        }
        class225.method1613((byte) 81);
        for (int var10 = 0; var10 < 104; var10++) {
            for (int var17 = 0; var17 < 104; var17++) {
                class111.method816(var17, 0, var10);
            }
        }
        class131.method943(92);
        class126.method908(-59);
        class164.method1212(false);
        class210.method1531(126);
        if (class85.field1240 != null && class180.field2901 != null && class38.field533 == 25) {
            class125.field1825++;
            class220.field3532.method557(30, 8);
            class220.field3532.method1119(1057001181, (byte) -102);
        }
        if (!class100.field1467) {
            int var11 = (class245.field4024 - 6) / 8;
            int var12 = (class245.field4024 + 6) / 8;
            int var13 = (class44.field647 - 6) / 8;
            int var14 = (class44.field647 + 6) / 8;
            for (int var15 = var11 - 1; var15 <= var12 + 1; var15++) {
                for (int var16 = var13 - 1; var16 <= (var14 + 1); var16++) {
                    if (var11 > var15 || var15 > var12 || var16 < var13 || var14 < var16) {
                        class159.field2599.method625("m" + var15 + "_" + var16, (byte) 29);
                        class159.field2599.method625("l" + var15 + "_" + var16, (byte) 29);
                    }
                }
            }
        }
        if (class38.field533 == 28) {
            class256.method1811(10, true);
        } else {
            class256.method1811(30, true);
            if (class180.field2901 != null) {
                class220.field3532.method557(213, 8);
            }
        }
        class29.method206(arg0 + 75);
        class126.method908(-15);
        class10.method80(-61);
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(B)Z")
    public static final boolean method1790(byte arg0) throws IOException {
        field4165++;
        if (class180.field2901 == null) {
            return false;
        }
        int var1 = class180.field2901.method727(1);
        if (var1 == 0) {
            return false;
        }
        if (class102.field1501 == -1) {
            class180.field2901.method724(class50.field732.field2523, 0, 0, 1);
            var1--;
            class50.field732.field2511 = 0;
            class102.field1501 = class50.field732.method567(false);
            class221.field3534 = class46.field676[class102.field1501];
        }
        if (class221.field3534 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class180.field2901.method724(class50.field732.field2523, arg0 - 77, 0, 1);
            var1--;
            class221.field3534 = class50.field732.field2523[0] & 0xFF;
        }
        if (class221.field3534 == -2) {
            if (var1 <= 1) {
                return false;
            }
            class180.field2901.method724(class50.field732.field2523, arg0 ^ 0x4D, 0, 2);
            var1 -= 2;
            class50.field732.field2511 = 0;
            class221.field3534 = class50.field732.method1126(false);
        }
        if (var1 < class221.field3534) {
            return false;
        }
        class50.field732.field2511 = 0;
        class180.field2901.method724(class50.field732.field2523, 0, 0, class221.field3534);
        class291.field4613 = class277.field4442;
        class277.field4442 = class104.field1512;
        class104.field1512 = class102.field1501;
        class151.field2453 = 0;
        if (class102.field1501 == 240) {
            int var2 = class50.field732.method1132(-15432);
            int var3 = class50.field732.method1072(86);
            int var4 = class50.field732.method1072(arg0 - 160);
            int var5 = class50.field732.method1113(arg0 ^ 0x4B57);
            int var6 = class50.field732.method1071((byte) 59);
            if (var5 == 65535) {
                var5 = -1;
            }
            if (var6 == 65535) {
                var6 = -1;
            }
            if (class46.method341(var4, 27787)) {
                for (int var7 = var5; var7 <= var6; var7++) {
                    long var8 = ((long) var2 << 32) + ((long) var7);
                    class73 var10 = (class73) class190.field3062.method1034(var8, (byte) 21);
                    class73 var11;
                    if (var10 != null) {
                        var11 = new class73(var10.field1063, var3);
                        var10.method1922(-1);
                    } else if (var7 == -1) {
                        var11 = new class73(class122.method891(var2, (byte) -121).field2158.field1063, var3);
                    } else {
                        var11 = new class73(0, var3);
                    }
                    class190.field3062.method1032(false, var11, var8);
                }
            }
            class102.field1501 = -1;
            return true;
        } else if (class102.field1501 == 187) {
            int var12 = class50.field732.method1113(19226);
            int var13 = class50.field732.method1071((byte) 23);
            int var14 = class50.field732.method1085(-72);
            class18 var15 = class169.field2730[var12];
            if (var15 != null) {
                class225.method1611((byte) 74, var15, var13, var14);
            }
            class102.field1501 = -1;
            return true;
        } else if (class102.field1501 == 238) {
            int var16 = class50.field732.method1079(16711680);
            int var17 = var16 >> 28 & 0x3;
            int var18 = var16 & 0x3FFF;
            int var19 = var16 >> 14 & 0x3FFF;
            int var20 = class50.field732.method1071((byte) 92);
            if (var20 == 65535) {
                var20 = -1;
            }
            int var21 = class50.field732.method1085(arg0 - 183);
            int var22 = var19 - class282.field4487;
            int var23 = var21 & 0x3;
            int var24 = var21 >> 2;
            int var25 = var18 - class99.field1465;
            int var26 = class247.field4123[var24];
            class282.method1928(var26, var25, var23, var22, var20, var24, var17, arg0 ^ 0x49);
            class102.field1501 = -1;
            return true;
        } else if (class102.field1501 == 2) {
            int var27 = class50.field732.method1126(false);
            int var28 = class50.field732.method1132(arg0 - 15509);
            class62.method445(var28, var27, (byte) -37);
            class102.field1501 = -1;
            return true;
        } else if (class102.field1501 == 152) {
            int var29 = class50.field732.method1113(19226);
            int var30 = class50.field732.method1097(arg0 ^ 0x33);
            int var31 = class50.field732.method1113(19226);
            if (var31 == 65535) {
                var31 = -1;
            }
            if (class46.method341(var29, 27787)) {
                class20.method131(var30, -1, (byte) -102, var31, 2);
            }
            class102.field1501 = -1;
            return true;
        } else if (class102.field1501 == 176) {
            int var32 = class50.field732.method1111(255);
            if (class50.field732.method1111(255) == 0) {
                class145.field2374[var32] = new class220();
            } else {
                class50.field732.field2511--;
                class145.field2374[var32] = new class220(class50.field732);
            }
            class123.field1797 = class231.field3717;
            class102.field1501 = -1;
            return true;
        } else if (class102.field1501 == 108) {
            int var33 = class50.field732.method1132(arg0 ^ 0xFFFFC3F5);
            int var34 = class50.field732.method1132(-15432);
            int var35 = class50.field732.method1072(78);
            if (var35 == 65535) {
                var35 = -1;
            }
            int var36 = class50.field732.method1113(19226);
            int var37 = class50.field732.method1113(19226);
            if (var36 == 65535) {
                var36 = -1;
            }
            if (class46.method341(var37, 27787)) {
                for (int var38 = var36; var38 <= var35; var38++) {
                    long var39 = ((long) var33 << 32) + (long) var38;
                    class73 var41 = (class73) class190.field3062.method1034(var39, (byte) 21);
                    class73 var42;
                    if (var41 != null) {
                        var42 = new class73(var34, var41.field1066);
                        var41.method1922(-1);
                    } else if (var38 == -1) {
                        var42 = new class73(var34, class122.method891(var33, (byte) -124).field2158.field1066);
                    } else {
                        var42 = new class73(var34, -1);
                    }
                    class190.field3062.method1032(false, var42, var39);
                }
            }
            class102.field1501 = -1;
            return true;
        } else if (class102.field1501 == 31) {
            class240.field3835 = class50.field732.method1111(255);
            class102.field1501 = -1;
            class76.field1089 = class231.field3717;
            return true;
        } else if (class102.field1501 == 52) {
            int var43 = class50.field732.method1097(127);
            class131 var44 = class122.method891(var43, (byte) -128);
            for (int var45 = 0; var45 < var44.field2101.length; var45++) {
                var44.field2101[var45] = -1;
                var44.field2101[var45] = 0;
            }
            class274.method1896(var44, 10);
            class102.field1501 = -1;
            return true;
        } else if (class102.field1501 == 24) {
            int var46 = class50.field732.method1072(91);
            if (var46 == 65535) {
                var46 = -1;
            }
            int var47 = class50.field732.method1118((byte) 112);
            int var48 = class50.field732.method1071((byte) 19);
            if (class46.method341(var48, 27787)) {
                class20.method131(var47, -1, (byte) -122, var46, 1);
            }
            class102.field1501 = -1;
            return true;
        } else if (class102.field1501 == 16) {
            int var49 = class50.field732.method1126(false);
            String var50 = class50.field732.method1078(arg0 - 78);
            Object[] var51 = new Object[var50.length() + 1];
            for (int var52 = var50.length() - 1; var52 >= 0; var52--) {
                if (var50.charAt(var52) == 's') {
                    var51[var52 + 1] = class50.field732.method1078(-1);
                } else {
                    var51[var52 + 1] = Integer.valueOf(class50.field732.method1097(126));
                }
            }
            var51[0] = Integer.valueOf(class50.field732.method1097(127));
            if (class46.method341(var49, 27787)) {
                class294 var53 = new class294();
                var53.field4664 = var51;
                class266.method1852(var53, arg0 ^ 0x4C);
            }
            class102.field1501 = -1;
            return true;
        } else if (class102.field1501 == 87) {
            class116.field1669 = class231.field3717;
            long var54 = class50.field732.method1117(arg0 + 1677260371);
            if (var54 == 0L) {
                class102.field1501 = -1;
                class239.field3821 = null;
                class212.field3397 = null;
                class168.field2704 = 0;
                class242.field3864 = null;
                return true;
            }
            long var56 = class50.field732.method1117(1677260448);
            class242.field3864 = class2.method7(arg0 ^ 0x4D, var56);
            class239.field3821 = class2.method7(0, var54);
            class259.field4243 = class50.field732.method1092((byte) -62);
            int var58 = class50.field732.method1111(255);
            if (var58 == 255) {
                class102.field1501 = -1;
                return true;
            }
            class168.field2704 = var58;
            class185[] var59 = new class185[100];
            for (int var60 = 0; var60 < class168.field2704; var60++) {
                var59[var60] = new class185();
                var59[var60].field4459 = class50.field732.method1117(1677260448);
                var59[var60].field2981 = class2.method7(arg0 ^ 0x4D, var59[var60].field4459);
                var59[var60].field2984 = class50.field732.method1126(false);
                var59[var60].field2982 = class50.field732.method1092((byte) -62);
                var59[var60].field2983 = class50.field732.method1078(arg0 ^ 0xFFFFFFB2);
                if (class266.field4304 == var59[var60].field4459) {
                    class254.field4190 = var59[var60].field2982;
                }
            }
            boolean var61 = false;
            int var62 = class168.field2704;
            while (var62 > 0) {
                boolean var63 = true;
                var62--;
                for (int var64 = 0; var64 < var62; var64++) {
                    if (var59[var64].field2981.compareTo(var59[var64 + 1].field2981) > 0) {
                        class185 var65 = var59[var64];
                        var63 = false;
                        var59[var64] = var59[var64 + 1];
                        var59[var64 + 1] = var65;
                    }
                }
                if (var63) {
                    break;
                }
            }
            class212.field3397 = var59;
            class102.field1501 = -1;
            return true;
        } else if (class102.field1501 == 130) {
            int var66 = class50.field732.method1072(124);
            String var67 = class50.field732.method1078(-1);
            int var68 = class50.field732.method1079(16711680);
            if (class46.method341(var66, 27787)) {
                class26.method187(var68, 2583, var67);
            }
            class102.field1501 = -1;
            return true;
        } else if (class102.field1501 == 232) {
            for (int var69 = 0; var69 < class92.field1374.length; var69++) {
                if (class92.field1374[var69] != null) {
                    class92.field1374[var69].field1932 = -1;
                }
            }
            for (int var70 = 0; var70 < class169.field2730.length; var70++) {
                if (class169.field2730[var70] != null) {
                    class169.field2730[var70].field1932 = -1;
                }
            }
            class102.field1501 = -1;
            return true;
        } else if (class102.field1501 == 114) {
            int var71 = class50.field732.method1085(arg0 ^ 0xFFFFFFEB);
            int var72 = class50.field732.method1116((byte) 112);
            int var73 = class50.field732.method1111(255);
            class58.field826 = var71 >> 1;
            class186.field2993.method204(false, var73, (var71 & 0x1) == 1, var72);
            class102.field1501 = -1;
            return true;
        } else if (class102.field1501 == 155) {
            class44.method331(false);
            class78.field1131 = class50.field732.method1111(255);
            class102.field1501 = -1;
            class46.field673 = class231.field3717;
            return true;
        } else if (class102.field1501 == 245) {
            String var74 = class50.field732.method1078(-1);
            int var75 = class50.field732.method1113(19226);
            int var76 = class50.field732.method1071((byte) 113);
            if (class46.method341(var76, 27787)) {
                class207.method1513(true, var75, var74);
            }
            class102.field1501 = -1;
            return true;
        } else if (class102.field1501 == 159) {
            int var77 = class50.field732.method1126(false);
            int var78 = class50.field732.method1097(127);
            if (class46.method341(var77, arg0 + 27710)) {
                class17 var79 = (class17) class124.field1806.method1034((long) var78, (byte) 21);
                if (var79 != null) {
                    class159.method1187((byte) -32, true, var79);
                }
                if (class211.field3390 != null) {
                    class274.method1896(class211.field3390, 10);
                    class211.field3390 = null;
                }
            }
            class102.field1501 = -1;
            return true;
        } else if (class102.field1501 == 255) {
            int var80 = class50.field732.method1071((byte) 37);
            int var81 = class50.field732.method1118((byte) 73);
            class142.method1013(var80, (byte) -115, var81);
            class102.field1501 = -1;
            return true;
        } else if (class102.field1501 == 213) {
            class50.field732.field2511 += 28;
            if (class50.field732.method1130(-128)) {
                class25.method179(class50.field732.field2511 - 28, class50.field732, -31042);
            }
            class102.field1501 = -1;
            return true;
        } else if (class102.field1501 == 43) {
            if (class211.field3384 != -1) {
                class113.method832((byte) 56, 0, class211.field3384);
            }
            class102.field1501 = -1;
            return true;
        } else if (class102.field1501 == 30) {
            int var82 = class50.field732.method1126(false);
            if (class46.method341(var82, 27787)) {
                class250.method1786(arg0 - 188);
            }
            class102.field1501 = -1;
            return true;
        } else if (class102.field1501 == 253) {
            int var83 = class50.field732.method1096((byte) -98);
            int var84 = class50.field732.method1116((byte) 91);
            String var85 = class50.field732.method1078(-1);
            int var86 = class50.field732.method1126(false);
            if (var86 == 65535) {
                var86 = -1;
            }
            if (var83 >= 1 && var83 <= 8) {
                if (var85.equalsIgnoreCase("null")) {
                    var85 = null;
                }
                class96.field1424[var83 - 1] = var85;
                class98.field1444[var83 - 1] = var86;
                class17.field187[var83 - 1] = var84 == 0;
            }
            class102.field1501 = -1;
            return true;
        } else if (class102.field1501 == 54) {
            int var87 = class50.field732.method1116((byte) 119);
            int var88 = class50.field732.method1113(19226);
            int var89 = class50.field732.method1072(81);
            int var90 = class50.field732.method1132(-15432);
            if (class46.method341(var88, 27787)) {
                class17 var91 = (class17) class124.field1806.method1034((long) var90, (byte) 21);
                if (var91 != null) {
                    class159.method1187((byte) -55, var91.field191 != var89, var91);
                }
                class269.method1865(var90, var87, var89, (byte) 20);
            }
            class102.field1501 = -1;
            return true;
        } else if (class102.field1501 == 148) {
            int var92 = class50.field732.method1126(false);
            int var93 = class50.field732.method1111(arg0 + 178);
            int var94 = class50.field732.method1111(255);
            int var95 = class50.field732.method1126(false);
            int var96 = class50.field732.method1111(255);
            int var97 = class50.field732.method1111(255);
            if (class46.method341(var92, 27787)) {
                class40.method309(var97, var95, var94, var96, var93, false);
            }
            class102.field1501 = -1;
            return true;
        } else if (class102.field1501 == 77) {
            int var98 = class50.field732.method1113(19226);
            int var99 = class50.field732.method1085(arg0 - 136);
            class62.method445(var99, var98, (byte) -37);
            class102.field1501 = -1;
            return true;
        } else if (class102.field1501 == 163) {
            int var100 = class50.field732.method1126(false);
            if (var100 == 65535) {
                var100 = -1;
            }
            int var101 = class50.field732.method1111(255);
            int var102 = class50.field732.method1126(false);
            int var103 = class50.field732.method1111(255);
            class27.method191(var101, var103, var100, (byte) 71, var102);
            class102.field1501 = -1;
            return true;
        } else if (class102.field1501 == 231) {
            int var104 = class50.field732.method1097(arg0 ^ 0x32);
            int var105 = class50.field732.method1126(false);
            class131 var106;
            if (var104 < 0) {
                var106 = null;
            } else {
                var106 = class122.method891(var104, (byte) -121);
            }
            if (var104 < -70000) {
                var105 += 32768;
            }
            while (class50.field732.field2511 < class221.field3534) {
                int var107 = class50.field732.method1103(3);
                int var108 = class50.field732.method1126(false);
                int var109 = 0;
                if (var108 != 0) {
                    var109 = class50.field732.method1111(255);
                    if (var109 == 255) {
                        var109 = class50.field732.method1097(126);
                    }
                }
                if (var106 != null && var107 >= 0 && var106.field2101.length > var107) {
                    var106.field2101[var107] = var108;
                    var106.field2113[var107] = var109;
                }
                class244.method1743((byte) -124, var105, var108 - 1, var109, var107);
            }
            if (var106 != null) {
                class274.method1896(var106, arg0 ^ 0x47);
            }
            class44.method331(false);
            class109.field1572[class179.method1337(31, class217.field3456++)] = class179.method1337(32767, var105);
            class102.field1501 = -1;
            return true;
        } else {
            if (arg0 != 77) {
                method1791((byte) 122);
            }
            if (class102.field1501 == 66) {
                byte[] var110 = new byte[class221.field3534];
                class50.field732.method559(0, class221.field3534, -1697787130, var110);
                String var111 = class83.method605(var110, 0, class221.field3534, 101);
                if (class85.field1240 == null && class7.field62 == 3 || !class7.field73.startsWith("win") || class108.field1569) {
                    class286.method1941(var111, -96, true);
                } else {
                    class277.field4437 = true;
                    class43.field611 = var111;
                    class285.field4508 = class138.field2241.method52(var111, -123);
                }
                class102.field1501 = -1;
                return true;
            } else if (class102.field1501 == 23) {
                long var112 = class50.field732.method1117(1677260448);
                boolean var114 = false;
                int var115 = class50.field732.method1126(false);
                if ((var112 & Long.MIN_VALUE) != 0L) {
                    var114 = true;
                }
                byte var116 = class50.field732.method1092((byte) -62);
                if (var114) {
                    if (class168.field2704 == 0) {
                        class102.field1501 = -1;
                        return true;
                    }
                    long var117 = var112 & Long.MAX_VALUE;
                    boolean var119 = false;
                    int var120;
                    for (var120 = 0; class168.field2704 > var120 && (class212.field3397[var120].field4459 != var117 || class212.field3397[var120].field2984 != var115); var120++) {
                    }
                    if (var120 < class168.field2704) {
                        while (var120 < class168.field2704 - 1) {
                            class212.field3397[var120] = class212.field3397[var120 + 1];
                            var120++;
                        }
                        class168.field2704--;
                        class212.field3397[class168.field2704] = null;
                    }
                } else {
                    String var121 = class50.field732.method1078(-1);
                    class185 var122 = new class185();
                    var122.field4459 = var112;
                    var122.field2981 = class2.method7(0, var122.field4459);
                    var122.field2983 = var121;
                    var122.field2984 = var115;
                    var122.field2982 = var116;
                    int var123;
                    for (var123 = class168.field2704 - 1; var123 >= 0; var123--) {
                        int var124 = class212.field3397[var123].field2981.compareTo(var122.field2981);
                        if (var124 == 0) {
                            class212.field3397[var123].field2984 = var115;
                            class212.field3397[var123].field2982 = var116;
                            class212.field3397[var123].field2983 = var121;
                            if (class266.field4304 == var112) {
                                class254.field4190 = var116;
                            }
                            class116.field1669 = class231.field3717;
                            class102.field1501 = -1;
                            return true;
                        }
                        if (var124 < 0) {
                            break;
                        }
                    }
                    if (class168.field2704 >= class212.field3397.length) {
                        class102.field1501 = -1;
                        return true;
                    }
                    for (int var125 = class168.field2704 - 1; var125 > var123; var125--) {
                        class212.field3397[var125 + 1] = class212.field3397[var125];
                    }
                    if (class168.field2704 == 0) {
                        class212.field3397 = new class185[100];
                    }
                    class212.field3397[var123 + 1] = var122;
                    class168.field2704++;
                    if (class266.field4304 == var112) {
                        class254.field4190 = var116;
                    }
                }
                class116.field1669 = class231.field3717;
                class102.field1501 = -1;
                return true;
            } else if (class102.field1501 == 25) {
                int var126 = class50.field732.method1079(16711680);
                int var127 = class50.field732.method1126(false);
                int var128 = class50.field732.method1113(arg0 ^ 0x4B57);
                int var129 = class50.field732.method1072(115);
                if ((var126 >> 30) != 0) {
                    int var154 = var126 >> 28 & 0x3;
                    int var155 = ((var126 & 0xFFFCA61) >> 14) - class282.field4487;
                    int var156 = (var126 & 0x3FFF) - class99.field1465;
                    if (var155 >= 0 && var156 >= 0 && var155 < 104 && var156 < 104) {
                        int var157 = var155 * 128 + 64;
                        int var158 = var156 * 128 + 64;
                        class2 var159 = new class2(var128, var154, var157, var158, class129.method930(var158, var157, 60, var154) - var127, var129, class264.field4290);
                        class143.field2309.method1385(new class138(var159), true);
                    }
                } else if (var126 >> 29 != 0) {
                    int var130 = var126 & 0xFFFF;
                    class18 var131 = class169.field2730[var130];
                    if (var131 != null) {
                        boolean var132 = true;
                        if (var128 == 65535) {
                            var128 = -1;
                        }
                        if (var128 != -1 && var131.field1934 != -1) {
                            if (var131.field1934 == var128) {
                                class55 var133 = class187.method1387((byte) 121, var128);
                                if (var133.field788 && var133.field794 != -1) {
                                    class141 var134 = class285.method1939(var133.field794, 112);
                                    int var135 = var134.field2273;
                                    if (var135 == 1) {
                                        var132 = false;
                                        var131.field1878 = class264.field4290 + var129;
                                        var131.field1948 = 0;
                                        var131.field1905 = 0;
                                        var131.field1923 = 1;
                                        var131.field1891 = 0;
                                        class263.method1845(var131.field1948, var131.field1910, false, var131.field1979, (byte) -59, var134);
                                    } else if (var135 == 2) {
                                        var131.field1969 = 0;
                                        var132 = false;
                                    }
                                }
                            } else {
                                class55 var136 = class187.method1387((byte) 81, var128);
                                class55 var137 = class187.method1387((byte) 71, var131.field1934);
                                if (var136.field794 != -1 && var137.field794 != -1) {
                                    class141 var138 = class285.method1939(var136.field794, 112);
                                    class141 var139 = class285.method1939(var137.field794, 112);
                                    if (var139.field2278 > var138.field2278) {
                                        var132 = false;
                                    }
                                }
                            }
                        }
                        if (var132) {
                            var131.field1878 = class264.field4290 + var129;
                            var131.field1934 = var128;
                            var131.field1923 = 1;
                            var131.field1891 = 0;
                            var131.field1948 = 0;
                            var131.field1944 = var127;
                            if (var131.field1878 > class264.field4290) {
                                var131.field1948 = -1;
                            }
                            if (var131.field1934 != -1 && class264.field4290 == var131.field1878) {
                                int var140 = class187.method1387((byte) 120, var131.field1934).field794;
                                if (var140 != -1) {
                                    class141 var141 = class285.method1939(var140, arg0 + 35);
                                    if (var141 != null && var141.field2252 != null) {
                                        class263.method1845(0, var131.field1910, false, var131.field1979, (byte) -67, var141);
                                    }
                                }
                            }
                        }
                    }
                } else if ((var126 >> 28) != 0) {
                    int var142 = var126 & 0xFFFF;
                    class29 var143;
                    if (class40.field569 == var142) {
                        var143 = class186.field2993;
                    } else {
                        var143 = class92.field1374[var142];
                    }
                    if (var143 != null) {
                        boolean var144 = true;
                        if (var128 == 65535) {
                            var128 = -1;
                        }
                        if (var128 != -1 && var143.field1934 != -1) {
                            if (var143.field1934 == var128) {
                                class55 var149 = class187.method1387((byte) 10, var128);
                                if (var149.field788 && var149.field794 != -1) {
                                    class141 var150 = class285.method1939(var149.field794, 112);
                                    int var151 = var150.field2273;
                                    if (var151 == 1) {
                                        var144 = false;
                                        var143.field1878 = class264.field4290 + var129;
                                        var143.field1905 = 0;
                                        var143.field1923 = 1;
                                        var143.field1948 = 0;
                                        var143.field1891 = 0;
                                        class263.method1845(var143.field1948, var143.field1910, false, var143.field1979, (byte) -80, var150);
                                    } else if (var151 == 2) {
                                        var143.field1969 = 0;
                                        var144 = false;
                                    }
                                }
                            } else {
                                class55 var145 = class187.method1387((byte) 45, var128);
                                class55 var146 = class187.method1387((byte) 19, var143.field1934);
                                if (var145.field794 != -1 && var146.field794 != -1) {
                                    class141 var147 = class285.method1939(var145.field794, 112);
                                    class141 var148 = class285.method1939(var146.field794, 112);
                                    if (var147.field2278 < var148.field2278) {
                                        var144 = false;
                                    }
                                }
                            }
                        }
                        if (var144) {
                            var143.field1948 = 0;
                            var143.field1944 = var127;
                            var143.field1891 = 0;
                            var143.field1934 = var128;
                            var143.field1878 = class264.field4290 + var129;
                            var143.field1923 = 1;
                            if (var143.field1878 > class264.field4290) {
                                var143.field1948 = -1;
                            }
                            if (var143.field1934 == 65535) {
                                var143.field1934 = -1;
                            }
                            if (var143.field1934 != -1 && class264.field4290 == var143.field1878) {
                                int var152 = class187.method1387((byte) 60, var143.field1934).field794;
                                if (var152 != -1) {
                                    class141 var153 = class285.method1939(var152, 112);
                                    if (var153 != null && var153.field2252 != null) {
                                        class263.method1845(0, var143.field1910, class186.field2993 == var143, var143.field1979, (byte) -39, var153);
                                    }
                                }
                            }
                        }
                    }
                }
                class102.field1501 = -1;
                return true;
            } else if (class102.field1501 == 1) {
                int var160 = class50.field732.method1071((byte) 9);
                int var161 = class50.field732.method1072(arg0 - 139);
                if (var161 == 65535) {
                    var161 = -1;
                }
                int var162 = class50.field732.method1118((byte) 70);
                int var163 = class50.field732.method1097(127);
                if (class46.method341(var160, 27787)) {
                    class131 var164 = class122.method891(var163, (byte) -124);
                    if (var164.field2077) {
                        class109.method807(var163, var161, 45, var162);
                        class62 var166 = class254.method1800(var161, 15017);
                        class38.method294(var166.field906, true, var166.field895, var163, var166.field900);
                        class262.method1837(var166.field907, var166.field880, var166.field934, (byte) -41, var163);
                    } else if (var161 == -1) {
                        class102.field1501 = -1;
                        var164.field2071 = 0;
                        return true;
                    } else {
                        class62 var165 = class254.method1800(var161, arg0 ^ 0x3AE4);
                        var164.field2030 = var165.field900 * 100 / var162;
                        var164.field2034 = var161;
                        var164.field2071 = 4;
                        var164.field2145 = var165.field906;
                        var164.field2149 = var165.field895;
                        class274.method1896(var164, 10);
                    }
                }
                class102.field1501 = -1;
                return true;
            } else if (class102.field1501 == 32) {
                byte var167 = class50.field732.method1121(0);
                int var168 = class50.field732.method1072(-126);
                class142.method1013(var168, (byte) -103, var167);
                class102.field1501 = -1;
                return true;
            } else if (class102.field1501 == 101) {
                class244.method1742(true, false);
                class102.field1501 = -1;
                return true;
            } else if (class102.field1501 == 145) {
                int var169 = class50.field732.method1113(arg0 ^ 0x4B57);
                int var170 = class50.field732.method1072(55);
                int var171 = class50.field732.method1079(16711680);
                if (class46.method341(var169, 27787)) {
                    class164.method1211(1, var170, var171);
                }
                class102.field1501 = -1;
                return true;
            } else if (class102.field1501 == 183) {
                int var172 = class50.field732.method1132(-15432);
                class122.field1776 = class138.field2241.method48(var172, 123);
                class102.field1501 = -1;
                return true;
            } else if (class102.field1501 == 160) {
                for (int var173 = 0; var173 < class243.field3904.length; var173++) {
                    if (field4160[var173] != class243.field3904[var173]) {
                        class243.field3904[var173] = field4160[var173];
                        class273.method1888(var173, -123);
                        class121.field1770[class179.method1337(class150.field2444++, 31)] = var173;
                    }
                }
                class102.field1501 = -1;
                return true;
            } else if (class102.field1501 == 141) {
                int var174 = class50.field732.method1107(99);
                int var175 = class50.field732.method1079(16711680);
                int var176 = class50.field732.method1126(false);
                if (class46.method341(var176, 27787)) {
                    class153.method1136(var174, var175, 0);
                }
                class102.field1501 = -1;
                return true;
            } else if (class102.field1501 == 122) {
                int var177 = class50.field732.method1126(false);
                int var178 = class50.field732.method1113(19226);
                int var179 = class50.field732.method1071((byte) 43);
                int var180 = class50.field732.method1097(126);
                if (class46.method341(var178, 27787)) {
                    class272.method1884((var179 << 16) + var177, arg0 ^ 0x40, var180);
                }
                class102.field1501 = -1;
                return true;
            } else if (class102.field1501 == 246) {
                int var181 = class50.field732.method1126(false);
                if (class46.method341(var181, 27787)) {
                    class46.method347(-101);
                }
                class102.field1501 = -1;
                return true;
            } else if (class102.field1501 == 3) {
                class44.method331(false);
                int var182 = class50.field732.method1097(arg0 + 50);
                int var183 = class50.field732.method1085(-86);
                int var184 = class50.field732.method1096((byte) -58);
                class235.field3764[var183] = var182;
                class227.field3644[var183] = var184;
                class96.field1420[var183] = 1;
                for (int var185 = 0; var185 < 98; var185++) {
                    if (class11.field128[var185] <= var182) {
                        class96.field1420[var183] = var185 + 2;
                    }
                }
                class121.field1775[class179.method1337(31, class180.field2894++)] = var183;
                class102.field1501 = -1;
                return true;
            } else if (class102.field1501 == 241) {
                int var186 = class50.field732.method1071((byte) 17);
                int var187 = class50.field732.method1079(16711680);
                int var188 = class50.field732.method1079(16711680);
                if (class46.method341(var186, arg0 ^ 0x6CC6)) {
                    class17 var189 = (class17) class124.field1806.method1034((long) var187, (byte) 21);
                    class17 var190 = (class17) class124.field1806.method1034((long) var188, (byte) 21);
                    if (var190 != null) {
                        class159.method1187((byte) 100, var189 == null || var189.field191 != var190.field191, var190);
                    }
                    if (var189 != null) {
                        var189.method1922(-1);
                        class124.field1806.method1032(false, var189, (long) var188);
                    }
                    class131 var191 = class122.method891(var187, (byte) -127);
                    if (var191 != null) {
                        class274.method1896(var191, 10);
                    }
                    class131 var192 = class122.method891(var188, (byte) -124);
                    if (var192 != null) {
                        class274.method1896(var192, 10);
                        class289.method1962(var192, false, true);
                    }
                    if (class211.field3384 != -1) {
                        class113.method832((byte) 80, 1, class211.field3384);
                    }
                }
                class102.field1501 = -1;
                return true;
            } else if (class102.field1501 == 179) {
                long var193 = class50.field732.method1117(1677260448);
                long var195 = (long) class50.field732.method1126(false);
                long var197 = (long) class50.field732.method1128((byte) -91);
                int var199 = class50.field732.method1111(255);
                long var200 = (var195 << 32) + var197;
                int var202 = class50.field732.method1126(false);
                boolean var203 = false;
                int var204 = 0;
                label1287: while (true) {
                    if (var204 >= 100) {
                        if (var199 <= 1) {
                            for (int var205 = 0; var205 < class180.field2895; var205++) {
                                if (class81.field1177[var205] == var193) {
                                    var203 = true;
                                    break label1287;
                                }
                            }
                        }
                        break;
                    }
                    if (class232.field3725[var204] == var200) {
                        var203 = true;
                        break;
                    }
                    var204++;
                }
                if (!var203 && class78.field1136 == 0) {
                    class232.field3725[class94.field1406] = var200;
                    class94.field1406 = (class94.field1406 + 1) % 100;
                    String var206 = class288.method1958(-28264, var202).method1329(arg0 ^ 0xFFFFE764, class50.field732);
                    if (var199 == 2) {
                        class245.method1756(arg0 - 1712, var206, var202, "<img=1>" + class241.method1688(37, var193), 18, (String) null);
                    } else if (var199 == 1) {
                        class245.method1756(-1635, var206, var202, "<img=0>" + class241.method1688(37, var193), 18, (String) null);
                    } else {
                        class245.method1756(-1635, var206, var202, class241.method1688(37, var193), 18, (String) null);
                    }
                }
                class102.field1501 = -1;
                return true;
            } else if (class102.field1501 == 202) {
                if (class221.field3534 == 0) {
                    class178.field2887 = class263.field4277;
                } else {
                    class178.field2887 = class50.field732.method1078(-1);
                }
                class102.field1501 = -1;
                return true;
            } else if (class102.field1501 == 36) {
                long var207 = class50.field732.method1117(1677260448);
                String var209 = class170.method1251(class217.method1561(-22880, class120.method875(100, class50.field732)));
                class172.method1276(6, class241.method1688(37, var207), (byte) 40, var209);
                class102.field1501 = -1;
                return true;
            } else if (class102.field1501 == 83) {
                int var210 = class50.field732.method1127((byte) 83);
                int var211 = class50.field732.method1118((byte) 76);
                int var212 = class50.field732.method1090(12107);
                int var213 = class50.field732.method1113(19226);
                if (class46.method341(var213, 27787)) {
                    class55.method408(var212, var210, var211, (byte) -101);
                }
                class102.field1501 = -1;
                return true;
            } else if (class102.field1501 == 117) {
                class61.field860 = class50.field732.method1085(-127);
                class254.field4189 = class50.field732.method1096((byte) -113);
                for (int var214 = class254.field4189; var214 < (class254.field4189 + 8); var214++) {
                    for (int var216 = class61.field860; var216 < (class61.field860 + 8); var216++) {
                        if (class43.field627[class58.field826][var214][var216] != null) {
                            class43.field627[class58.field826][var214][var216] = null;
                            class111.method816(var216, 0, var214);
                        }
                    }
                }
                for (class274 var215 = (class274) class105.field1528.method1384(2); var215 != null; var215 = (class274) class105.field1528.method1388((byte) 123)) {
                    if (var215.field4402 >= class254.field4189 && (class254.field4189 + 8) > var215.field4402 && var215.field4399 >= class61.field860 && (class61.field860 + 8) > var215.field4399 && class58.field826 == var215.field4409) {
                        var215.field4396 = 0;
                    }
                }
                class102.field1501 = -1;
                return true;
            } else if (class102.field1501 == 45) {
                long var217 = class50.field732.method1117(1677260448);
                int var219 = class50.field732.method1126(false);
                String var220 = class288.method1958(-28264, var219).method1329(-6359, class50.field732);
                class245.method1756(-1635, var220, var219, class241.method1688(37, var217), 19, (String) null);
                class102.field1501 = -1;
                return true;
            } else if (class102.field1501 == 184) {
                class244.method1742(true, true);
                class102.field1501 = -1;
                return true;
            } else if (class102.field1501 == 243) {
                class100.field1471 = class50.field732.method1126(false) * 30;
                class102.field1501 = -1;
                class46.field673 = class231.field3717;
                return true;
            } else if (class102.field1501 == 162) {
                class254.field4189 = class50.field732.method1096((byte) -32);
                class61.field860 = class50.field732.method1111(255);
                class102.field1501 = -1;
                return true;
            } else if (class102.field1501 == 20) {
                String var221 = "";
                boolean var222 = true;
                long var223 = class50.field732.method1117(1677260448);
                int var225 = class50.field732.method1126(false);
                int var226 = class50.field732.method1111(arg0 + 178);
                if (var223 < 0L) {
                    var222 = false;
                    var223 &= Long.MAX_VALUE;
                }
                if (var225 > 0) {
                    var221 = class50.field732.method1078(-1);
                }
                String var227 = class241.method1688(37, var223);
                for (int var228 = 0; var228 < class20.field222; var228++) {
                    if (class57.field819[var228] == var223) {
                        if (class105.field1523[var228] != var225) {
                            class105.field1523[var228] = var225;
                            if (var225 > 0) {
                                class172.method1276(5, "", (byte) 40, var227 + class80.field1170);
                            }
                            if (var225 == 0) {
                                class172.method1276(5, "", (byte) 40, var227 + class77.field1120);
                            }
                        }
                        var227 = null;
                        class290.field4596[var228] = var221;
                        class206.field3313[var228] = var226;
                        class42.field584[var228] = var222;
                        break;
                    }
                }
                if (var227 != null && class20.field222 < 200) {
                    class57.field819[class20.field222] = var223;
                    class104.field1508[class20.field222] = var227;
                    class105.field1523[class20.field222] = var225;
                    class290.field4596[class20.field222] = var221;
                    class206.field3313[class20.field222] = var226;
                    class42.field584[class20.field222] = var222;
                    class20.field222++;
                }
                class76.field1089 = class231.field3717;
                boolean var229 = false;
                int var230 = class20.field222;
                while (var230 > 0) {
                    boolean var231 = true;
                    var230--;
                    for (int var232 = 0; var232 < var230; var232++) {
                        if (class105.field1523[var232] != class155.field2554 && class105.field1523[var232 + 1] == class155.field2554 || class105.field1523[var232] == 0 && class105.field1523[var232 + 1] != 0) {
                            var231 = false;
                            int var233 = class105.field1523[var232];
                            class105.field1523[var232] = class105.field1523[var232 + 1];
                            class105.field1523[var232 + 1] = var233;
                            String var234 = class290.field4596[var232];
                            class290.field4596[var232] = class290.field4596[var232 + 1];
                            class290.field4596[var232 + 1] = var234;
                            String var235 = class104.field1508[var232];
                            class104.field1508[var232] = class104.field1508[var232 + 1];
                            class104.field1508[var232 + 1] = var235;
                            long var236 = class57.field819[var232];
                            class57.field819[var232] = class57.field819[var232 + 1];
                            class57.field819[var232 + 1] = var236;
                            int var238 = class206.field3313[var232];
                            class206.field3313[var232] = class206.field3313[var232 + 1];
                            class206.field3313[var232 + 1] = var238;
                            boolean var239 = class42.field584[var232];
                            class42.field584[var232] = class42.field584[var232 + 1];
                            class42.field584[var232 + 1] = var239;
                        }
                    }
                    if (var231) {
                        break;
                    }
                }
                class102.field1501 = -1;
                return true;
            } else if (class102.field1501 == 37) {
                long var240 = class50.field732.method1117(1677260448);
                class50.field732.method1092((byte) -62);
                boolean var242 = false;
                long var243 = class50.field732.method1117(1677260448);
                long var245 = (long) class50.field732.method1126(false);
                long var247 = (long) class50.field732.method1128((byte) -94);
                long var249 = (var245 << 32) + var247;
                int var251 = class50.field732.method1111(255);
                int var252 = 0;
                label1358: while (true) {
                    if (var252 >= 100) {
                        if (var251 <= 1) {
                            if ((!class81.field1174 || class145.field2352) && !class135.field2212) {
                                for (int var253 = 0; var253 < class180.field2895; var253++) {
                                    if (class81.field1177[var253] == var240) {
                                        var242 = true;
                                        break label1358;
                                    }
                                }
                            } else {
                                var242 = true;
                            }
                        }
                        break;
                    }
                    if (class232.field3725[var252] == var249) {
                        var242 = true;
                        break;
                    }
                    var252++;
                }
                if (!var242 && class78.field1136 == 0) {
                    class232.field3725[class94.field1406] = var249;
                    class94.field1406 = (class94.field1406 + 1) % 100;
                    String var254 = class170.method1251(class217.method1561(arg0 - 22957, class120.method875(100, class50.field732)));
                    if (var251 == 2 || var251 == 3) {
                        class198.method1455(class241.method1688(37, var243), 128, "<img=1>" + class241.method1688(37, var240), 9, var254);
                    } else if (var251 == 1) {
                        class198.method1455(class241.method1688(37, var243), 128, "<img=0>" + class241.method1688(37, var240), 9, var254);
                    } else {
                        class198.method1455(class241.method1688(arg0 ^ 0x68, var243), arg0 + 51, class241.method1688(37, var240), 9, var254);
                    }
                }
                class102.field1501 = -1;
                return true;
            } else if (class102.field1501 == 13) {
                class102.field1501 = -1;
                class288.field4580 = 0;
                return true;
            } else if (class102.field1501 == 214) {
                int var255 = class50.field732.method1111(arg0 + 178);
                int var256 = class50.field732.method1072(120);
                int var257 = class50.field732.method1072(-62);
                if (class46.method341(var256, 27787)) {
                    if (var255 == 2) {
                        class126.method907(13751);
                    }
                    class211.field3384 = var257;
                    class92.method725(false, var257);
                    class152.method1115(false, -99);
                    class59.method428((byte) 12, class211.field3384);
                    for (int var258 = 0; var258 < 100; var258++) {
                        class190.field3070[var258] = true;
                    }
                }
                class102.field1501 = -1;
                return true;
            } else if (class102.field1501 == 174) {
                class262.method1836(class50.field732.method1078(-1), (byte) 124);
                class102.field1501 = -1;
                return true;
            } else if (class102.field1501 == 81) {
                long var259 = class50.field732.method1117(1677260448);
                long var261 = (long) class50.field732.method1126(false);
                long var263 = (long) class50.field732.method1128((byte) -100);
                int var265 = class50.field732.method1111(255);
                long var266 = (var261 << 32) + var263;
                boolean var268 = false;
                int var269 = 0;
                label1395: while (true) {
                    if (var269 >= 100) {
                        if (var265 <= 1) {
                            if ((!class81.field1174 || class145.field2352) && !class135.field2212) {
                                for (int var270 = 0; var270 < class180.field2895; var270++) {
                                    if (class81.field1177[var270] == var259) {
                                        var268 = true;
                                        break label1395;
                                    }
                                }
                            } else {
                                var268 = true;
                            }
                        }
                        break;
                    }
                    if (class232.field3725[var269] == var266) {
                        var268 = true;
                        break;
                    }
                    var269++;
                }
                if (!var268 && class78.field1136 == 0) {
                    class232.field3725[class94.field1406] = var266;
                    class94.field1406 = (class94.field1406 + 1) % 100;
                    String var271 = class170.method1251(class217.method1561(-22880, class120.method875(100, class50.field732)));
                    if (var265 == 2 || var265 == 3) {
                        class172.method1276(7, "<img=1>" + class241.method1688(37, var259), (byte) 40, var271);
                    } else if (var265 == 1) {
                        class172.method1276(7, "<img=0>" + class241.method1688(37, var259), (byte) 40, var271);
                    } else {
                        class172.method1276(3, class241.method1688(37, var259), (byte) 40, var271);
                    }
                }
                class102.field1501 = -1;
                return true;
            } else if (class102.field1501 == 64) {
                int var272 = class50.field732.method1097(arg0 + 49);
                int var273 = class50.field732.method1126(false);
                if (var272 < -70000) {
                    var273 += 32768;
                }
                class131 var274;
                if (var272 < 0) {
                    var274 = null;
                } else {
                    var274 = class122.method891(var272, (byte) -126);
                }
                if (var274 != null) {
                    for (int var275 = 0; var275 < var274.field2101.length; var275++) {
                        var274.field2101[var275] = 0;
                        var274.field2113[var275] = 0;
                    }
                }
                class207.method1517(var273, false);
                int var276 = class50.field732.method1126(false);
                for (int var277 = 0; var277 < var276; var277++) {
                    int var278 = class50.field732.method1126(false);
                    int var279 = class50.field732.method1096((byte) -120);
                    if (var279 == 255) {
                        var279 = class50.field732.method1079(16711680);
                    }
                    if (var274 != null && var277 < var274.field2101.length) {
                        var274.field2101[var277] = var278;
                        var274.field2113[var277] = var279;
                    }
                    class244.method1743((byte) -124, var273, var278 - 1, var279, var277);
                }
                if (var274 != null) {
                    class274.method1896(var274, 10);
                }
                class44.method331(false);
                class109.field1572[class179.method1337(31, class217.field3456++)] = class179.method1337(var273, 32767);
                class102.field1501 = -1;
                return true;
            } else if (class102.field1501 == 105) {
                int var280 = class50.field732.method1111(255);
                int var281 = var280 & 0x1F;
                int var282 = var280 >> 5;
                if (var281 == 0) {
                    class96.field1425[var282] = null;
                    class102.field1501 = -1;
                    return true;
                }
                class297 var283 = new class297();
                var283.field4693 = var281;
                var283.field4699 = class50.field732.method1111(255);
                if (var283.field4699 >= 0 && var283.field4699 < class243.field3910.length) {
                    if (var283.field4693 == 1 || var283.field4693 == 10) {
                        var283.field4700 = class50.field732.method1126(false);
                        class50.field732.field2511 += 5;
                    } else if (var283.field4693 >= 2 && var283.field4693 <= 6) {
                        if (var283.field4693 == 2) {
                            var283.field4704 = 64;
                            var283.field4702 = 64;
                        }
                        if (var283.field4693 == 3) {
                            var283.field4704 = 64;
                            var283.field4702 = 0;
                        }
                        if (var283.field4693 == 4) {
                            var283.field4702 = 128;
                            var283.field4704 = 64;
                        }
                        if (var283.field4693 == 5) {
                            var283.field4702 = 64;
                            var283.field4704 = 0;
                        }
                        if (var283.field4693 == 6) {
                            var283.field4704 = 128;
                            var283.field4702 = 64;
                        }
                        var283.field4693 = 2;
                        var283.field4701 = class50.field732.method1126(false);
                        var283.field4708 = class50.field732.method1126(false);
                        var283.field4692 = class50.field732.method1111(arg0 ^ 0xB2);
                        var283.field4690 = class50.field732.method1126(false);
                    }
                    var283.field4703 = class50.field732.method1126(false);
                    if (var283.field4703 == 65535) {
                        var283.field4703 = -1;
                    }
                    class96.field1425[var282] = var283;
                }
                class102.field1501 = -1;
                return true;
            } else if (class102.field1501 == 131) {
                int var284 = class50.field732.method1071((byte) 58);
                int var285 = class50.field732.method1072(arg0 ^ 0xFFFFFFD4);
                int var286 = class50.field732.method1072(77);
                if (class46.method341(var284, 27787)) {
                    class253.method1796(var285, var286, (byte) -97);
                }
                class102.field1501 = -1;
                return true;
            } else if (class102.field1501 == 203) {
                int var287 = class50.field732.method1113(19226);
                int var288 = class50.field732.method1071((byte) 82);
                int var289 = class50.field732.method1072(-66);
                int var290 = class50.field732.method1079(16711680);
                int var291 = class50.field732.method1113(19226);
                if (class46.method341(var288, arg0 ^ 0x6CC6)) {
                    class38.method294(var289, true, var291, var290, var287);
                }
                class102.field1501 = -1;
                return true;
            } else if (class102.field1501 == 80) {
                long var292 = class50.field732.method1117(1677260448);
                class50.field732.method1092((byte) -62);
                long var294 = class50.field732.method1117(1677260448);
                long var296 = (long) class50.field732.method1126(false);
                long var298 = (long) class50.field732.method1128((byte) -118);
                int var300 = class50.field732.method1111(arg0 + 178);
                int var301 = class50.field732.method1126(false);
                long var302 = (var296 << 32) + var298;
                boolean var304 = false;
                int var305 = 0;
                label1443: while (true) {
                    if (var305 >= 100) {
                        if (var300 <= 1) {
                            for (int var306 = 0; var306 < class180.field2895; var306++) {
                                if (class81.field1177[var306] == var292) {
                                    var304 = true;
                                    break label1443;
                                }
                            }
                        }
                        break;
                    }
                    if (class232.field3725[var305] == var302) {
                        var304 = true;
                        break;
                    }
                    var305++;
                }
                if (!var304 && class78.field1136 == 0) {
                    class232.field3725[class94.field1406] = var302;
                    class94.field1406 = (class94.field1406 + 1) % 100;
                    String var307 = class288.method1958(-28264, var301).method1329(-6359, class50.field732);
                    if (var300 == 2 || var300 == 3) {
                        class245.method1756(-1635, var307, var301, "<img=1>" + class241.method1688(arg0 - 40, var292), 20, class241.method1688(37, var294));
                    } else if (var300 == 1) {
                        class245.method1756(-1635, var307, var301, "<img=0>" + class241.method1688(37, var292), 20, class241.method1688(37, var294));
                    } else {
                        class245.method1756(-1635, var307, var301, class241.method1688(37, var292), 20, class241.method1688(arg0 ^ 0x68, var294));
                    }
                }
                class102.field1501 = -1;
                return true;
            } else if (class102.field1501 == 59) {
                class88.method667(true);
                class44.method331(false);
                class102.field1501 = -1;
                class150.field2444 += 32;
                return true;
            } else if (class102.field1501 == 151) {
                class180.field2895 = class221.field3534 / 8;
                for (int var308 = 0; var308 < class180.field2895; var308++) {
                    class81.field1177[var308] = class50.field732.method1117(1677260448);
                    class229.field3700[var308] = class104.method779(class81.field1177[var308], class148.method1051(arg0, -21));
                    class153.field2536[var308] = false;
                }
                class102.field1501 = -1;
                class76.field1089 = class231.field3717;
                return true;
            } else if (class102.field1501 == 82) {
                int var309 = class50.field732.method1071((byte) 15);
                int var310 = class50.field732.method1079(16711680);
                if (class46.method341(var309, 27787)) {
                    int var311 = 0;
                    if (class186.field2993.field346 != null) {
                        var311 = class186.field2993.field346.method83(0);
                    }
                    class20.method131(var310, -1, (byte) -79, var311, 3);
                }
                class102.field1501 = -1;
                return true;
            } else if (class102.field1501 == 190) {
                class123.method894(class50.field732, class138.field2241, class221.field3534, (byte) 70);
                class102.field1501 = -1;
                return true;
            } else if (class102.field1501 == 70) {
                class44.method331(false);
                class260.field4257 = class50.field732.method1090(12107);
                class102.field1501 = -1;
                class46.field673 = class231.field3717;
                return true;
            } else if (class102.field1501 == 154) {
                int var312 = class50.field732.method1126(false);
                int var313 = class50.field732.method1111(255);
                int var314 = class50.field732.method1111(arg0 ^ 0xB2);
                int var315 = class50.field732.method1126(false);
                int var316 = class50.field732.method1111(255);
                int var317 = class50.field732.method1111(255);
                if (class46.method341(var312, arg0 ^ 0x6CC6)) {
                    class259.method1822(var317, var316, true, (byte) -122, var315, var313, var314);
                }
                class102.field1501 = -1;
                return true;
            } else if (class102.field1501 == 242) {
                int var318 = class50.field732.method1072(-102);
                int var319 = class50.field732.method1126(false);
                int var320 = class50.field732.method1072(arg0 + 30);
                int var321 = class50.field732.method1118((byte) 76);
                int var322 = class50.field732.method1072(arg0 - 136);
                if (class46.method341(var318, 27787)) {
                    class20.method131(var321, var322, (byte) -103, var320 | var319 << 16, 7);
                }
                class102.field1501 = -1;
                return true;
            } else if (class102.field1501 == 5) {
                class75.method546((byte) -100);
                class102.field1501 = -1;
                return true;
            } else if (class102.field1501 == 157) {
                int var323 = class50.field732.method1113(arg0 ^ 0x4B57);
                String var324 = class50.field732.method1078(arg0 ^ 0xFFFFFFB2);
                int var325 = class50.field732.method1126(false);
                if (class46.method341(var323, 27787)) {
                    class207.method1513(true, var325, var324);
                }
                class102.field1501 = -1;
                return true;
            } else if (class102.field1501 == 89) {
                int var326 = class50.field732.method1126(false);
                int var327 = class50.field732.method1111(arg0 ^ 0xB2);
                int var328 = class50.field732.method1111(255);
                int var329 = class50.field732.method1111(255);
                int var330 = class50.field732.method1111(255);
                int var331 = class50.field732.method1126(false);
                if (class46.method341(var326, 27787)) {
                    class156.field2574[var327] = true;
                    class196.field3186[var327] = var328;
                    class45.field648[var327] = var329;
                    class11.field120[var327] = var330;
                    class150.field2445[var327] = var331;
                }
                class102.field1501 = -1;
                return true;
            } else if (class102.field1501 == 11) {
                int var332 = class50.field732.method1096((byte) -75);
                int var333 = class50.field732.method1113(arg0 + 19149);
                if (class46.method341(var333, 27787)) {
                    class114.field1649 = var332;
                }
                class102.field1501 = -1;
                return true;
            } else if (class102.field1501 == 119) {
                class225.method1612((byte) -90);
                class102.field1501 = -1;
                return false;
            } else if (class102.field1501 == 84) {
                class254.field4189 = class50.field732.method1116((byte) 104);
                class61.field860 = class50.field732.method1096((byte) -109);
                while (class221.field3534 > class50.field732.field2511) {
                    class102.field1501 = class50.field732.method1111(255);
                    class296.method1990(8222);
                }
                class102.field1501 = -1;
                return true;
            } else if (class102.field1501 == 217) {
                int var334 = class50.field732.method1072(35);
                int var335 = class50.field732.method1126(false);
                int var336 = class50.field732.method1118((byte) 97);
                if (class46.method341(var334, 27787)) {
                    class145.method1040((byte) 103, var335, var336);
                }
                class102.field1501 = -1;
                return true;
            } else if (class102.field1501 == 115) {
                int var337 = class50.field732.method1126(false);
                if (var337 == 65535) {
                    var337 = -1;
                }
                int var338 = class50.field732.method1085(-88);
                class116.method848(var337, var338, -325268312);
                class102.field1501 = -1;
                return true;
            } else if (class102.field1501 == 211) {
                int var339 = class50.field732.method1086(126);
                int var340 = class50.field732.method1071((byte) 99);
                int var341 = class50.field732.method1111(255);
                if (var340 == 65535) {
                    var340 = -1;
                }
                class166.method1222(var339, var341, (byte) 117, var340);
                class102.field1501 = -1;
                return true;
            } else if (class102.field1501 == 6) {
                class216.method1550(31246);
                class102.field1501 = -1;
                return true;
            } else if (class102.field1501 == 172) {
                int var342 = class50.field732.method1071((byte) 104);
                byte var343 = class50.field732.method1125(-95);
                int var344 = class50.field732.method1113(19226);
                if (class46.method341(var344, 27787)) {
                    class164.method1211(1, var342, var343);
                }
                class102.field1501 = -1;
                return true;
            } else if (class102.field1501 == 147) {
                int var345 = class50.field732.method1116((byte) 121);
                int var346 = class50.field732.method1126(false);
                int var347 = class50.field732.method1132(arg0 ^ 0xFFFFC3F5);
                if (class46.method341(var346, 27787)) {
                    class241.method1689(var345, (byte) -20, var347);
                }
                class102.field1501 = -1;
                return true;
            } else if (class102.field1501 == 180) {
                class125.field1823 = class50.field732.method1111(arg0 + 178);
                class90.field1336 = class50.field732.method1111(255);
                class115.field1663 = class50.field732.method1111(255);
                class102.field1501 = -1;
                return true;
            } else if (class102.field1501 == 201 || class102.field1501 == 134 || class102.field1501 == 53 || class102.field1501 == 220 || class102.field1501 == 40 || class102.field1501 == 104 || class102.field1501 == 75 || class102.field1501 == 165 || class102.field1501 == 239 || class102.field1501 == 229 || class102.field1501 == 60 || class102.field1501 == 168 || class102.field1501 == 99 || class102.field1501 == 153) {
                class296.method1990(8222);
                class102.field1501 = -1;
                return true;
            } else if (class102.field1501 == 27) {
                class205.field3280 = class50.field732.method1111(255);
                class102.field1501 = -1;
                return true;
            } else if (class102.field1501 == 41) {
                int var348 = class50.field732.method1126(false);
                class164.method1213(var348, arg0 - 202);
                class109.field1572[class179.method1337(31, class217.field3456++)] = class179.method1337(32767, var348);
                class102.field1501 = -1;
                return true;
            } else if (class102.field1501 == 72) {
                String var349 = class50.field732.method1078(-1);
                if (var349.endsWith(":tradereq:")) {
                    String var350 = var349.substring(0, var349.indexOf(":"));
                    boolean var351 = false;
                    long var352 = class193.method1431(var350, false);
                    for (int var354 = 0; var354 < class180.field2895; var354++) {
                        if (class81.field1177[var354] == var352) {
                            var351 = true;
                            break;
                        }
                    }
                    if (!var351 && class78.field1136 == 0) {
                        class172.method1276(4, var350, (byte) 40, class40.field567);
                    }
                } else if (var349.endsWith(":chalreq:")) {
                    String var384 = var349.substring(0, var349.indexOf(":"));
                    long var385 = class193.method1431(var384, false);
                    boolean var387 = false;
                    for (int var388 = 0; var388 < class180.field2895; var388++) {
                        if (class81.field1177[var388] == var385) {
                            var387 = true;
                            break;
                        }
                    }
                    if (!var387 && class78.field1136 == 0) {
                        String var389 = var349.substring(var349.indexOf(":") + 1, var349.length() + -9);
                        class172.method1276(8, var384, (byte) 40, var389);
                    }
                } else if (var349.endsWith(":assistreq:")) {
                    String var355 = var349.substring(0, var349.indexOf(":"));
                    long var356 = class193.method1431(var355, false);
                    boolean var358 = false;
                    for (int var359 = 0; var359 < class180.field2895; var359++) {
                        if (class81.field1177[var359] == var356) {
                            var358 = true;
                            break;
                        }
                    }
                    if (!var358 && class78.field1136 == 0) {
                        class172.method1276(10, var355, (byte) 40, "");
                    }
                } else if (var349.endsWith(":clan:")) {
                    String var360 = var349.substring(0, var349.indexOf(":clan:"));
                    class172.method1276(11, "", (byte) 40, var360);
                } else if (var349.endsWith(":trade:")) {
                    String var383 = var349.substring(0, var349.indexOf(":trade:"));
                    if (class78.field1136 == 0) {
                        class172.method1276(12, "", (byte) 40, var383);
                    }
                } else if (var349.endsWith(":assist:")) {
                    String var361 = var349.substring(0, var349.indexOf(":assist:"));
                    if (class78.field1136 == 0) {
                        class172.method1276(13, "", (byte) 40, var361);
                    }
                } else if (var349.endsWith(":duelstake:")) {
                    String var378 = var349.substring(0, var349.indexOf(":"));
                    boolean var379 = false;
                    long var380 = class193.method1431(var378, false);
                    for (int var382 = 0; var382 < class180.field2895; var382++) {
                        if (class81.field1177[var382] == var380) {
                            var379 = true;
                            break;
                        }
                    }
                    if (!var379 && class78.field1136 == 0) {
                        class172.method1276(14, var378, (byte) 40, "");
                    }
                } else if (var349.endsWith(":duelfriend:")) {
                    String var362 = var349.substring(0, var349.indexOf(":"));
                    long var363 = class193.method1431(var362, false);
                    boolean var365 = false;
                    for (int var366 = 0; var366 < class180.field2895; var366++) {
                        if (class81.field1177[var366] == var363) {
                            var365 = true;
                            break;
                        }
                    }
                    if (!var365 && class78.field1136 == 0) {
                        class172.method1276(15, var362, (byte) 40, "");
                    }
                } else if (var349.endsWith(":clanreq:")) {
                    String var367 = var349.substring(0, var349.indexOf(":"));
                    long var368 = class193.method1431(var367, false);
                    boolean var370 = false;
                    for (int var371 = 0; var371 < class180.field2895; var371++) {
                        if (class81.field1177[var371] == var368) {
                            var370 = true;
                            break;
                        }
                    }
                    if (!var370 && class78.field1136 == 0) {
                        class172.method1276(16, var367, (byte) 40, "");
                    }
                } else if (var349.endsWith(":allyreq:")) {
                    String var372 = var349.substring(0, var349.indexOf(":"));
                    long var373 = class193.method1431(var372, false);
                    boolean var375 = false;
                    for (int var376 = 0; var376 < class180.field2895; var376++) {
                        if (class81.field1177[var376] == var373) {
                            var375 = true;
                            break;
                        }
                    }
                    if (!var375 && class78.field1136 == 0) {
                        String var377 = var349.substring(var349.indexOf(":") + 1, var349.length() + -9);
                        class172.method1276(21, var372, (byte) 40, var377);
                    }
                } else {
                    class172.method1276(0, "", (byte) 40, var349);
                }
                class102.field1501 = -1;
                return true;
            } else if (class102.field1501 == 144) {
                int var390 = class50.field732.method1113(arg0 ^ 0x4B57);
                int var391 = class50.field732.method1097(126);
                int var392 = class50.field732.method1126(false);
                if (class46.method341(var392, 27787)) {
                    class112.method819(var391, (byte) 107, var390);
                }
                class102.field1501 = -1;
                return true;
            } else {
                class191.method1422((Throwable) null, "T1 - " + class102.field1501 + "," + class277.field4442 + "," + class291.field4613 + " - " + class221.field3534, (byte) 51);
                class225.method1612((byte) 93);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(B)V")
    public static void method1791(byte arg0) {
        field4163 = null;
        field4159 = null;
        field4161 = null;
        if (arg0 < -69) {
            field4162 = null;
            field4160 = null;
            field4167 = null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIII)V")
    public static final void method1792(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4168++;
        if (arg5 != -1) {
            field4162 = null;
        }
        int var6 = class281.method1924(false, class228.field3657, class207.field3328, arg0);
        int var7 = class281.method1924(false, class228.field3657, class207.field3328, arg2);
        int var8 = class281.method1924(false, class211.field3386, class272.field4374, arg4);
        int var9 = class281.method1924(false, class211.field3386, class272.field4374, arg3);
        for (int var10 = var6; var10 <= var7; var10++) {
            class177.method1330(class240.field3831[var10], var8, arg1, arg5 ^ 0xFFFF8217, var9);
        }
    }
}
