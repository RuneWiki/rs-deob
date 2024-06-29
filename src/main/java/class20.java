import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class20 {

    @OriginalMember(owner = "client!db", name = "c", descriptor = "Lke;")
    public static class65 field477 = class1.method17(" Sekunde(Xn(Y -Ubertragen)3", -125);

    @OriginalMember(owner = "client!db", name = "i", descriptor = "Lke;")
    public static class65 field483 = class1.method17("backvmid1", -122);

    @OriginalMember(owner = "client!db", name = "g", descriptor = "Lqd;")
    public static class100 field481 = new class100(64);

    @OriginalMember(owner = "client!db", name = "p", descriptor = "Lke;")
    public static class65 field490 = class1.method17(" (X", -112);

    @OriginalMember(owner = "client!db", name = "s", descriptor = "I")
    public static int field493 = -1;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "I")
    public int field475;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "I")
    public int field478;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "I")
    public int field480;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!db", name = "j", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!db", name = "l", descriptor = "I")
    public int field486;

    @OriginalMember(owner = "client!db", name = "t", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!db", name = "m", descriptor = "J")
    public static long field487;

    @OriginalMember(owner = "client!db", name = "q", descriptor = "Lta;")
    public static class112 field491;

    @OriginalMember(owner = "client!db", name = "n", descriptor = "Lca;")
    public static class13 field488;

    @OriginalMember(owner = "client!db", name = "r", descriptor = "Li;")
    public static class51 field492;

    // $FF: synthetic field
    @OriginalMember(owner = "client!db", name = "u", descriptor = "Ljava/lang/Class;")
    public static Class field495;

    @OriginalMember(owner = "client!db", name = "o", descriptor = "[[I")
    public static int[][] field489;

    // $FF: synthetic method
    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method169(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V", line = 16)
    public static final void method164(byte arg0) {
        if (arg0 != -52) {
            method165((byte) 95);
        }
        field484++;
        if (class4.field74 == null) {
            return;
        }
        long var1 = System.currentTimeMillis();
        if (class112.field2769 >= var1) {
            return;
        }
        class4.field74.method384(var1);
        int var3 = (int) (var1 - class112.field2769);
        class112.field2769 = var1;
        synchronized (field495 == null ? (field495 = method169("m")) : field495) {
            class46.field1205 += class66.field1776 * var3;
            int var5 = (class46.field1205 - class66.field1776 * 2000) / 1000;
            if (var5 > 0) {
                if (class114.field2871 != null) {
                    class114.field2871.method212(var5);
                }
                class46.field1205 -= var5 * 1000;
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(B)Z", line = 58)
    public static final boolean method165(byte arg0) {
        field482++;
        if (class98.field2541 == null) {
            return false;
        }
        if (arg0 != -120) {
            method168((byte) 66);
        }
        try {
            int var1 = class98.field2541.method81(-22925);
            if (var1 == 0) {
                return false;
            }
            if (class113.field2823 == -1) {
                class98.field2541.method83(class58.field1575.field994, 1, -15520, 0);
                class58.field1575.field998 = 0;
                class113.field2823 = class58.field1575.method646(arg0 + 28204);
                class54.field1392 = class73.field1957[class113.field2823];
                var1--;
            }
            if (class54.field1392 == -1) {
                if (var1 <= 0) {
                    return false;
                }
                class98.field2541.method83(class58.field1575.field994, 1, -15520, 0);
                var1--;
                class54.field1392 = class58.field1575.field994[0] & 0xFF;
            }
            if (class54.field1392 == -2) {
                if (var1 <= 1) {
                    return false;
                }
                var1 -= 2;
                class98.field2541.method83(class58.field1575.field994, 2, -15520, 0);
                class58.field1575.field998 = 0;
                class54.field1392 = class58.field1575.method326(255);
            }
            if (var1 < class54.field1392) {
                return false;
            }
            class58.field1575.field998 = 0;
            class98.field2541.method83(class58.field1575.field994, class54.field1392, -15520, 0);
            class13.field277 = 0;
            class1.field41 = class123.field2995;
            class123.field2995 = class7.field144;
            class7.field144 = class113.field2823;
            if (class113.field2823 == 192) {
                int var2 = class58.field1575.method329(144752608);
                int var3 = class58.field1575.method326(255);
                int var4 = class58.field1575.method324(-21);
                int var5 = class58.field1575.method326(arg0 ^ 0xFFFFFF77);
                class27 var6 = class110.method903(var2, -86);
                class113.field2823 = -1;
                var6.field707 = var5;
                var6.field661 = var4;
                var6.field663 = var3;
                return true;
            }
            if (class113.field2823 == 157) {
                int var7 = class58.field1575.method314(false);
                class116.method947(0, var7);
                if (class66.field1767 != -1) {
                    class24.method195(true, class66.field1767);
                    class116.field2910 = true;
                    class66.field1767 = -1;
                    class128.field3089 = true;
                }
                if (class10.field213 != -1) {
                    class24.method195(true, class10.field213);
                    class10.field213 = -1;
                    class75.method663((byte) -121, 30);
                }
                if (class102.field2644 != -1) {
                    class24.method195(true, class102.field2644);
                    class102.field2644 = -1;
                }
                if (class93.field2472 != -1) {
                    class24.method195(true, class93.field2472);
                    class93.field2472 = -1;
                }
                if (class117.field2939 != var7) {
                    class24.method195(true, class117.field2939);
                    class117.field2939 = var7;
                }
                class39.field996 = true;
                class113.field2823 = -1;
                class13.field278 = false;
                return true;
            }
            if (class113.field2823 == 242) {
                int var8 = class58.field1575.method337(arg0 + 1662);
                int var9 = class58.field1575.method314(false);
                int var10 = var9 & 0x1F;
                int var11 = var9 >> 10 & 0x1F;
                int var12 = var9 >> 5 & 0x1F;
                class27 var13 = class110.method903(var8, -87);
                class113.field2823 = -1;
                var13.field693 = (var10 << 3) + (var11 << 19) + (var12 << 11);
                return true;
            }
            if (class113.field2823 == 58) {
                int var14 = class58.field1575.method346((byte) -6);
                int var15 = class58.field1575.method342(-122);
                class65 var16 = class58.field1575.method303((byte) 83);
                if (var15 >= 1 && var15 <= 5) {
                    if (var16.method546((byte) 103, class76.field2027)) {
                        var16 = null;
                    }
                    class121.field2986[var15 - 1] = var16;
                    class70.field1816[var15 - 1] = var14 == 0;
                }
                class113.field2823 = -1;
                return true;
            }
            if (class113.field2823 == 39) {
                int var17 = class58.field1575.method326(255);
                int var18 = class58.field1575.method334(101);
                int var19 = class58.field1575.method326(arg0 ^ 0xFFFFFF77);
                if (class27.field706 != 0 && var18 != 0 && class4.field73 < 50) {
                    class62.field1652[class4.field73] = var17;
                    class28.field742[class4.field73] = var18;
                    class7.field130[class4.field73] = var19;
                    class81.field2154[class4.field73] = null;
                    class90.field2390[class4.field73] = 0;
                    class4.field73++;
                }
                class113.field2823 = -1;
                return true;
            }
            if (class113.field2823 == 164) {
                int var20 = class58.field1575.method326(arg0 + 375);
                int var21 = class58.field1575.method324(-106);
                if (class117.field2939 != -1) {
                    class24.method195(true, class117.field2939);
                    class117.field2939 = -1;
                    class39.field996 = true;
                }
                if (class10.field213 != -1) {
                    class24.method195(true, class10.field213);
                    class10.field213 = -1;
                    class75.method663((byte) -127, 30);
                }
                if (class102.field2644 != -1) {
                    class24.method195(true, class102.field2644);
                    class102.field2644 = -1;
                }
                if (class93.field2472 != var20) {
                    class24.method195(true, class93.field2472);
                    class93.field2472 = var20;
                }
                if (class66.field1767 != var21) {
                    class24.method195(true, class66.field1767);
                    class66.field1767 = var21;
                }
                class113.field2823 = -1;
                class13.field278 = false;
                class128.field3089 = true;
                if (class116.field2916 != 0) {
                    class39.field996 = true;
                    class116.field2916 = 0;
                }
                class116.field2910 = true;
                return true;
            }
            if (class113.field2823 == 94) {
                int var22 = class58.field1575.method314(false);
                int var23 = class58.field1575.method329(144752608);
                class27 var24 = class110.method903(var23, -107);
                if (var24 != null && var24.field671 == 0) {
                    if (var22 < 0) {
                        var22 = 0;
                    }
                    if (var24.field673 - var24.field708 < var22) {
                        var22 = var24.field673 - var24.field708;
                    }
                    var24.field710 = var22;
                }
                class113.field2823 = -1;
                return true;
            }
            if (class113.field2823 == 162) {
                class77.method678(16, false);
                class113.field2823 = -1;
                return true;
            }
            if (class113.field2823 == 111) {
                int var25 = class58.field1575.method337(1542);
                int var26 = class58.field1575.method300(125);
                class27 var27 = class110.method903(var25, -98);
                var27.field699 = var26;
                class113.field2823 = -1;
                var27.field687 = 1;
                return true;
            }
            if (class113.field2823 == 226) {
                int var28 = class58.field1575.method314(false);
                int var29 = class58.field1575.method347(arg0 + 375);
                class27 var30 = class110.method903(var29, -127);
                var30.field687 = 2;
                class113.field2823 = -1;
                var30.field699 = var28;
                return true;
            }
            if (class113.field2823 == 238) {
                for (int var31 = 0; var31 < class55.field1415; var31++) {
                    class76 var32 = class1.method16(var31, arg0 ^ 0xFFFFFF98);
                    if (var32 != null && var32.field2034 == 0) {
                        class24.field597[var31] = 0;
                        class32.field843[var31] = 0;
                    }
                }
                class116.field2910 = true;
                if (class51.field1312 != -1) {
                    class39.field996 = true;
                }
                class113.field2823 = -1;
                return true;
            }
            if (class113.field2823 == 34) {
                int var33 = class58.field1575.method345(2);
                int var34 = class58.field1575.method306(-67);
                class27 var35 = class110.method903(var34, -99);
                if (var35.field721 != var33 || var33 == -1) {
                    var35.field674 = 0;
                    var35.field721 = var33;
                    var35.field657 = 0;
                }
                class113.field2823 = -1;
                return true;
            }
            if (class113.field2823 == 209) {
                class116.field2910 = true;
                int var36 = class58.field1575.method329(144752608);
                class27 var37 = class110.method903(var36, -111);
                while (class54.field1392 > class58.field1575.field998) {
                    int var38 = class58.field1575.method311((byte) -128);
                    int var39 = class58.field1575.method326(255);
                    int var40 = class58.field1575.method334(123);
                    if (var40 == 255) {
                        var40 = class58.field1575.method329(144752608);
                    }
                    if (var38 >= 0 && var37.field676.length > var38) {
                        var37.field676[var38] = var39;
                        var37.field700[var38] = var40;
                    }
                }
                class113.field2823 = -1;
                return true;
            }
            if (class113.field2823 == 234) {
                class88.field2354 = class58.field1575.method346((byte) -6);
                class128.field3104 = class58.field1575.method334(arg0 ^ 0xFFFFFFFE);
                class113.field2823 = -1;
                return true;
            }
            if (class113.field2823 == 116) {
                int var41 = class58.field1575.method324(-9);
                byte var42 = class58.field1575.method335(-53);
                class24.field597[var41] = var42;
                if (class32.field843[var41] != var42) {
                    class32.field843[var41] = var42;
                    class32.method254(-123, var41);
                    class116.field2910 = true;
                    if (class51.field1312 != -1) {
                        class39.field996 = true;
                    }
                }
                class113.field2823 = -1;
                return true;
            }
            if (class113.field2823 == 153) {
                long var43 = class58.field1575.method344(144752608);
                class65 var45 = class21.method170(arg0 + 120, class58.field1575).method558((byte) 59);
                class101.method841(var45, 6, class26.method216(arg0 ^ 0xFFFFBDC4, var43).method560(-84), arg0 ^ 0xFFFFD677);
                class113.field2823 = -1;
                return true;
            }
            if (class113.field2823 == 147) {
                class125.method991((byte) 87);
                class113.field2823 = -1;
                return true;
            }
            if (class113.field2823 == 165) {
                boolean var46 = class58.field1575.method317(0) == 1;
                int var47 = class58.field1575.method329(arg0 ^ 0xF75F4068);
                class27 var48 = class110.method903(var47, arg0 + 10);
                class113.field2823 = -1;
                var48.field655 = var46;
                return true;
            }
            if (class113.field2823 == 201) {
                class113.field2823 = -1;
                class10.field218 = false;
                class100.field2593 = class100.field2591;
                class39.field996 = true;
                class116.field2916 = 2;
                return true;
            }
            if (class113.field2823 == 163) {
                class101.field2625 = true;
                class70.field1814 = class58.field1575.method334(115);
                class47.field1220 = class58.field1575.method334(124);
                class26.field639 = class58.field1575.method326(255);
                class64.field1690 = class58.field1575.method334(112);
                class53.field1339 = class58.field1575.method334(arg0 + 245);
                if (class53.field1339 >= 100) {
                    int var49 = class47.field1220 * 128 + 64;
                    int var50 = class70.field1814 * 128 + 64;
                    int var51 = class58.method495(var49, var50, true, class19.field462) - class26.field639;
                    int var52 = var50 - class102.field2642;
                    int var53 = var49 - class51.field1293;
                    int var54 = var51 - class5.field102;
                    int var55 = (int) Math.sqrt((double) (var52 * var52 + var53 * var53));
                    class76.field2038 = (int) (Math.atan2((double) var54, (double) var55) * 325.949D) & 0x7FF;
                    class51.field1295 = (int) (-325.949D * Math.atan2((double) var52, (double) var53)) & 0x7FF;
                    if (class76.field2038 < 128) {
                        class76.field2038 = 128;
                    }
                    if (class76.field2038 > 383) {
                        class76.field2038 = 383;
                    }
                }
                class113.field2823 = -1;
                return true;
            }
            if (class113.field2823 == 221) {
                int var56 = class58.field1575.method326(255);
                int var57 = class58.field1575.method306(119);
                class24.field597[var56] = var57;
                if (class32.field843[var56] != var57) {
                    class32.field843[var56] = var57;
                    class32.method254(-128, var56);
                    class116.field2910 = true;
                    if (class51.field1312 != -1) {
                        class39.field996 = true;
                    }
                }
                class113.field2823 = -1;
                return true;
            }
            if (class113.field2823 == 98) {
                class6.field108 = class58.field1575.method334(arg0 ^ 0xFFFFFFE1);
                class114.field2865 = class58.field1575.method334(arg0 ^ 0xFFFFFFE3);
                class93.field2442 = class58.field1575.method334(110);
                class39.field996 = true;
                class60.field1611 = true;
                class113.field2823 = -1;
                return true;
            }
            if (class113.field2823 == 133) {
                for (int var58 = 0; var58 < class52.field1324.length; var58++) {
                    if (class52.field1324[var58] != null) {
                        class52.field1324[var58].field1072 = -1;
                    }
                }
                for (int var59 = 0; var59 < class31.field817.length; var59++) {
                    if (class31.field817[var59] != null) {
                        class31.field817[var59].field1072 = -1;
                    }
                }
                class113.field2823 = -1;
                return true;
            }
            if (class113.field2823 == 29) {
                class31.method247(-83, class54.field1392, class58.field1575, class72.field1891);
                class113.field2823 = -1;
                return true;
            }
            if (class113.field2823 == 28) {
                class10.field218 = false;
                class100.field2593 = class100.field2591;
                class39.field996 = true;
                class113.field2823 = -1;
                class116.field2916 = 1;
                return true;
            }
            if (class113.field2823 == 130) {
                if (class89.field2368 == 12) {
                    class116.field2910 = true;
                }
                class57.field1540 = class58.field1575.method334(121);
                class113.field2823 = -1;
                return true;
            }
            if (class113.field2823 == 173) {
                int var60 = class58.field1575.method314(false);
                class116.method947(0, var60);
                if (class66.field1767 != -1) {
                    class24.method195(true, class66.field1767);
                    class66.field1767 = -1;
                    class128.field3089 = true;
                    class116.field2910 = true;
                }
                if (class117.field2939 != -1) {
                    class24.method195(true, class117.field2939);
                    class117.field2939 = -1;
                    class39.field996 = true;
                }
                if (class10.field213 != -1) {
                    class24.method195(true, class10.field213);
                    class10.field213 = -1;
                    class75.method663((byte) -125, 30);
                }
                if (class102.field2644 != -1) {
                    class24.method195(true, class102.field2644);
                    class102.field2644 = -1;
                }
                if (class93.field2472 != var60) {
                    class24.method195(true, class93.field2472);
                    class93.field2472 = var60;
                }
                if (class116.field2916 != 0) {
                    class116.field2916 = 0;
                    class39.field996 = true;
                }
                class113.field2823 = -1;
                class13.field278 = false;
                return true;
            }
            if (class113.field2823 == 183) {
                for (int var61 = 0; var61 < class32.field843.length; var61++) {
                    if (class32.field843[var61] != class24.field597[var61]) {
                        class32.field843[var61] = class24.field597[var61];
                        class32.method254(-98, var61);
                        class116.field2910 = true;
                    }
                }
                class113.field2823 = -1;
                return true;
            }
            if (class113.field2823 == 127) {
                class77.method678(arg0 + 136, true);
                class113.field2823 = -1;
                return true;
            }
            if (class113.field2823 == 139) {
                int var62 = class58.field1575.method345(2);
                if (var62 >= 0) {
                    class116.method947(arg0 ^ 0xFFFFFF88, var62);
                }
                if (class57.field1521 != var62) {
                    class24.method195(true, class57.field1521);
                    class57.field1521 = var62;
                }
                class113.field2823 = -1;
                return true;
            }
            if (class113.field2823 == 57) {
                class81.field2144 = class58.field1575.method334(101);
                class113.field2823 = -1;
                return true;
            }
            if (class113.field2823 == 241) {
                class51.field1311 = class54.field1392 / 8;
                for (int var63 = 0; var63 < class51.field1311; var63++) {
                    class35.field885[var63] = class58.field1575.method344(arg0 + 144752728);
                }
                class113.field2823 = -1;
                return true;
            }
            if (class113.field2823 == 74) {
                long var64 = class58.field1575.method344(144752608);
                int var66 = class58.field1575.method326(255);
                class65 var67 = class26.method216(arg0 ^ 0xFFFFBDC4, var64).method560(arg0 ^ 0x9);
                for (int var68 = 0; var68 < class87.field2317; var68++) {
                    if (class4.field82[var68] == var64) {
                        if (class52.field1325[var68] != var66) {
                            class52.field1325[var68] = var66;
                            class116.field2910 = true;
                            if (var66 > 0) {
                                class101.method841(class21.method172(arg0 ^ 0x24, new class65[] { var67, class93.field2460 }), 5, class100.field2591, arg0 + 10871);
                            }
                            if (var66 == 0) {
                                class101.method841(class21.method172(-64, new class65[] { var67, class62.field1656 }), 5, class100.field2591, arg0 + 10871);
                            }
                        }
                        var67 = null;
                        break;
                    }
                }
                if (var67 != null && class87.field2317 < 200) {
                    class4.field82[class87.field2317] = var64;
                    class86.field2286[class87.field2317] = var67;
                    class52.field1325[class87.field2317] = var66;
                    class87.field2317++;
                    class116.field2910 = true;
                }
                boolean var69 = false;
                while (!var69) {
                    var69 = true;
                    for (int var70 = 0; var70 < class87.field2317 - 1; var70++) {
                        if (class52.field1325[var70] != class102.field2651 && class52.field1325[var70 + 1] == class102.field2651 || class52.field1325[var70] == 0 && class52.field1325[var70 + 1] != 0) {
                            var69 = false;
                            int var71 = class52.field1325[var70];
                            class52.field1325[var70] = class52.field1325[var70 + 1];
                            class52.field1325[var70 + 1] = var71;
                            class65 var72 = class86.field2286[var70];
                            class86.field2286[var70] = class86.field2286[var70 + 1];
                            class86.field2286[var70 + 1] = var72;
                            long var73 = class4.field82[var70];
                            class4.field82[var70] = class4.field82[var70 + 1];
                            class4.field82[var70 + 1] = var73;
                            class116.field2910 = true;
                        }
                    }
                }
                class113.field2823 = -1;
                return true;
            }
            if (class113.field2823 == 101) {
                field493 = class58.field1575.method324(126);
                class113.field2823 = -1;
                return true;
            }
            if (class113.field2823 == 76) {
                int var75 = class58.field1575.method314(false);
                class116.method947(0, var75);
                if (class117.field2939 != -1) {
                    class24.method195(true, class117.field2939);
                    class117.field2939 = -1;
                    class39.field996 = true;
                }
                if (class10.field213 != -1) {
                    class24.method195(true, class10.field213);
                    class10.field213 = -1;
                    class75.method663((byte) -128, 30);
                }
                if (class102.field2644 != -1) {
                    class24.method195(true, class102.field2644);
                    class102.field2644 = -1;
                }
                if (class93.field2472 != -1) {
                    class24.method195(true, class93.field2472);
                    class93.field2472 = -1;
                }
                if (class66.field1767 != var75) {
                    class24.method195(true, class66.field1767);
                    class66.field1767 = var75;
                }
                class116.field2910 = true;
                class128.field3089 = true;
                class113.field2823 = -1;
                class13.field278 = false;
                if (class116.field2916 != 0) {
                    class39.field996 = true;
                    class116.field2916 = 0;
                }
                return true;
            }
            if (class113.field2823 == 196) {
                class52.field1317 = class58.field1575.method334(arg0 + 229);
                class113.field2823 = -1;
                return true;
            }
            if (class113.field2823 == 0) {
                int var76 = class58.field1575.method306(-48);
                int var77 = class58.field1575.method324(arg0 + 247);
                int var78 = class58.field1575.method300(arg0 + 245);
                class27 var79 = class110.method903(var76, -99);
                class113.field2823 = -1;
                var79.field729 = (var78 << 16) + var77;
                return true;
            }
            if (class113.field2823 == 167) {
                int var80 = class58.field1575.method341(87);
                int var81 = class58.field1575.method337(1542);
                int var82 = class58.field1575.method345(2);
                class27 var83 = class110.method903(var81, arg0 - 6);
                class113.field2823 = -1;
                var83.field722 = var83.field670 + var80;
                var83.field675 = var83.field725 + var82;
                return true;
            }
            if (class113.field2823 == 191) {
                int var84 = class58.field1575.method329(144752608);
                class27 var85 = class110.method903(var84, -106);
                var85.field687 = 3;
                var85.field699 = class32.field833.field2862.method429(false);
                class113.field2823 = -1;
                return true;
            }
            if (class113.field2823 == 137) {
                class116.field2910 = true;
                int var86 = class58.field1575.method329(144752608);
                class27 var87 = class110.method903(var86, -108);
                int var88 = class58.field1575.method326(255);
                for (int var89 = 0; var89 < var88; var89++) {
                    int var90 = class58.field1575.method334(126);
                    if (var90 == 255) {
                        var90 = class58.field1575.method306(119);
                    }
                    var87.field676[var89] = class58.field1575.method324(124);
                    var87.field700[var89] = var90;
                }
                for (int var91 = var88; var91 < var87.field676.length; var91++) {
                    var87.field676[var91] = 0;
                    var87.field700[var91] = 0;
                }
                class113.field2823 = -1;
                return true;
            }
            if (class113.field2823 == 93) {
                class126.field3057 = class58.field1575.method300(125) * 30;
                class113.field2823 = -1;
                return true;
            }
            if (class113.field2823 == 194) {
                int var92 = class58.field1575.method324(-38);
                int var93 = class58.field1575.method324(122);
                class116.method947(0, var92);
                if (var93 != -1) {
                    class116.method947(0, var93);
                }
                if (class93.field2472 != -1) {
                    class24.method195(true, class93.field2472);
                    class93.field2472 = -1;
                }
                if (class66.field1767 != -1) {
                    class24.method195(true, class66.field1767);
                    class66.field1767 = -1;
                }
                if (class117.field2939 != -1) {
                    class24.method195(true, class117.field2939);
                    class117.field2939 = -1;
                }
                if (class10.field213 != var92) {
                    class24.method195(true, class10.field213);
                    class10.field213 = var92;
                    class75.method663((byte) -128, 35);
                }
                if (class102.field2644 != var92) {
                    class24.method195(true, class102.field2644);
                    class102.field2644 = var93;
                }
                class116.field2916 = 0;
                class13.field278 = false;
                class113.field2823 = -1;
                return true;
            }
            if (class113.field2823 == 252) {
                int var94 = class58.field1575.method326(255);
                int var95 = class58.field1575.method306(121);
                int var96 = class58.field1575.method324(124);
                class27 var97 = class110.method903(var95, arg0 + 38);
                if (var94 == 65535) {
                    var97.field687 = 0;
                    class113.field2823 = -1;
                    return true;
                }
                class57 var98 = class81.method715(false, var94);
                var97.field663 = var98.field1471;
                class113.field2823 = -1;
                var97.field699 = var94;
                var97.field707 = var98.field1494;
                var97.field687 = 4;
                var97.field661 = var98.field1479 * 100 / var96;
                return true;
            }
            if (class113.field2823 == 45) {
                if (class89.field2368 == 12) {
                    class116.field2910 = true;
                }
                class3.field59 = class58.field1575.method322((byte) -84);
                class113.field2823 = -1;
                return true;
            }
            if (class113.field2823 == 7) {
                class65 var99 = class58.field1575.method303((byte) -127);
                if (var99.method556(class121.field2984, -120)) {
                    class65 var111 = var99.method555(0, var99.method540(arg0 + 71, class12.field249), (byte) -78);
                    long var112 = var111.method530((byte) -123);
                    boolean var114 = false;
                    for (int var115 = 0; var115 < class51.field1311; var115++) {
                        if (class35.field885[var115] == var112) {
                            var114 = true;
                            break;
                        }
                    }
                    if (!var114 && class55.field1412 == 0) {
                        class101.method841(class7.field136, 4, var111, 10751);
                    }
                } else if (var99.method556(class84.field2211, -127)) {
                    class65 var106 = var99.method555(0, var99.method540(arg0 ^ 0x47, class12.field249), (byte) -78);
                    long var107 = var106.method530((byte) -114);
                    boolean var109 = false;
                    for (int var110 = 0; var110 < class51.field1311; var110++) {
                        if (class35.field885[var110] == var107) {
                            var109 = true;
                            break;
                        }
                    }
                    if (!var109 && class55.field1412 == 0) {
                        class101.method841(class58.field1591, 8, var106, arg0 + 10871);
                    }
                } else if (var99.method556(class130.field3158, -110)) {
                    class65 var100 = var99.method555(0, var99.method540(-49, class12.field249), (byte) -78);
                    long var101 = var100.method530((byte) -73);
                    boolean var103 = false;
                    for (int var104 = 0; var104 < class51.field1311; var104++) {
                        if (class35.field885[var104] == var101) {
                            var103 = true;
                            break;
                        }
                    }
                    if (!var103 && class55.field1412 == 0) {
                        class65 var105 = var99.method555(var99.method540(-49, class12.field249) + 1, var99.method528(arg0 + 228) + -9, (byte) -78);
                        class101.method841(var105, 8, var100, 10751);
                    }
                } else {
                    class101.method841(var99, 0, class100.field2591, arg0 + 10871);
                }
                class113.field2823 = -1;
                return true;
            }
            if (class113.field2823 == 108) {
                int var116 = class58.field1575.method328(-113);
                if (class51.field1312 != var116) {
                    class24.method195(true, class51.field1312);
                    class51.field1312 = var116;
                }
                class39.field996 = true;
                class113.field2823 = -1;
                return true;
            }
            if (class113.field2823 == 63) {
                int var117 = class58.field1575.method326(arg0 + 375);
                if (var117 == 65535) {
                    var117 = -1;
                }
                int var118 = class58.field1575.method342(arg0 + 53);
                if (class27.field728[var118] != var117) {
                    class24.method195(true, class27.field728[var118]);
                    class27.field728[var118] = var117;
                }
                class116.field2910 = true;
                class128.field3089 = true;
                class113.field2823 = -1;
                return true;
            }
            if (class113.field2823 == 41) {
                class128.field3104 = class58.field1575.method342(-128);
                class88.field2354 = class58.field1575.method334(arg0 + 237);
                for (int var119 = class88.field2354; var119 < class88.field2354 + 8; var119++) {
                    for (int var120 = class128.field3104; var120 < class128.field3104 + 8; var120++) {
                        if (class64.field1691[class19.field462][var119][var120] != null) {
                            class64.field1691[class19.field462][var119][var120] = null;
                            class97.method816(var120, var119, -12);
                        }
                    }
                }
                for (class22 var121 = (class22) class104.field2663.method421(1); var121 != null; var121 = (class22) class104.field2663.method428(22743)) {
                    if (class88.field2354 <= var121.field546 && class88.field2354 + 8 > var121.field546 && var121.field541 >= class128.field3104 && var121.field541 < class128.field3104 + 8 && class19.field462 == var121.field536) {
                        var121.field544 = 0;
                    }
                }
                class113.field2823 = -1;
                return true;
            }
            if (class113.field2823 == 66) {
                class10.field193 = class58.field1575.method334(arg0 ^ 0xFFFFFFF7);
                if (class10.field193 == 1) {
                    class57.field1522 = class58.field1575.method326(255);
                }
                if (class10.field193 >= 2 && class10.field193 <= 6) {
                    if (class10.field193 == 2) {
                        class76.field2037 = 64;
                        class113.field2802 = 64;
                    }
                    if (class10.field193 == 3) {
                        class113.field2802 = 0;
                        class76.field2037 = 64;
                    }
                    if (class10.field193 == 4) {
                        class113.field2802 = 128;
                        class76.field2037 = 64;
                    }
                    if (class10.field193 == 5) {
                        class76.field2037 = 0;
                        class113.field2802 = 64;
                    }
                    if (class10.field193 == 6) {
                        class113.field2802 = 64;
                        class76.field2037 = 128;
                    }
                    class10.field193 = 2;
                    class19.field449 = class58.field1575.method326(255);
                    class128.field3099 = class58.field1575.method326(255);
                    class91.field2421 = class58.field1575.method334(105);
                }
                if (class10.field193 == 10) {
                    class94.field2499 = class58.field1575.method326(255);
                }
                class113.field2823 = -1;
                return true;
            }
            if (class113.field2823 == 6) {
                class6.method46(-13380);
                class113.field2823 = -1;
                return true;
            }
            if (class113.field2823 == 110) {
                int var122 = class58.field1575.method337(arg0 + 1662);
                class27 var123 = class110.method903(var122, arg0 ^ 0x25);
                for (int var124 = 0; var124 < var123.field676.length; var124++) {
                    var123.field676[var124] = -1;
                    var123.field676[var124] = 0;
                }
                class113.field2823 = -1;
                return true;
            }
            if (class113.field2823 == 103) {
                class116.field2910 = true;
                int var125 = class58.field1575.method334(111);
                int var126 = class58.field1575.method306(-56);
                int var127 = class58.field1575.method317(0);
                class130.field3163[var127] = var126;
                class53.field1346[var127] = var125;
                class21.field514[var127] = 1;
                for (int var128 = 0; var128 < 98; var128++) {
                    if (class101.field2630[var128] <= var126) {
                        class21.field514[var127] = var128 + 2;
                    }
                }
                class113.field2823 = -1;
                return true;
            }
            if (class113.field2823 == 161) {
                class19.field413 = class58.field1575.method334(108);
                class116.field2910 = true;
                class113.field2823 = -1;
                return true;
            }
            if (class113.field2823 == 247) {
                class65 var129 = class58.field1575.method303((byte) -45);
                int var130 = class58.field1575.method337(1542);
                class27 var131 = class110.method903(var130, arg0 ^ 0x5);
                var131.field715 = var129;
                if (var130 >> 16 == class27.field728[class89.field2368]) {
                    class116.field2910 = true;
                }
                class113.field2823 = -1;
                return true;
            }
            if (class113.field2823 == 218) {
                class83.field2199 = class58.field1575.method342(-85);
                if (class89.field2368 == class83.field2199) {
                    class116.field2910 = true;
                    if (class83.field2199 == 3) {
                        class89.field2368 = 1;
                    } else {
                        class89.field2368 = 3;
                    }
                }
                class113.field2823 = -1;
                return true;
            }
            if (class113.field2823 == 91) {
                class101.field2625 = true;
                class64.field1664 = class58.field1575.method334(arg0 ^ 0xFFFFFFF2);
                class56.field1461 = class58.field1575.method334(109);
                class104.field2689 = class58.field1575.method326(255);
                class39.field986 = class58.field1575.method334(116);
                class13.field265 = class58.field1575.method334(101);
                if (class13.field265 >= 100) {
                    class102.field2642 = class64.field1664 * 128 + 64;
                    class51.field1293 = class56.field1461 * 128 + 64;
                    class5.field102 = class58.method495(class51.field1293, class102.field2642, true, class19.field462) - class104.field2689;
                }
                class113.field2823 = -1;
                return true;
            }
            if (class113.field2823 == 46) {
                long var132 = class58.field1575.method344(144752608);
                long var134 = (long) class58.field1575.method326(255);
                long var136 = (long) class58.field1575.method308((byte) -118);
                int var138 = class58.field1575.method334(110);
                boolean var139 = false;
                long var140 = (var134 << 32) + var136;
                for (int var142 = 0; var142 < 100; var142++) {
                    if (class80.field2139[var142] == var140) {
                        var139 = true;
                        break;
                    }
                }
                if (var138 <= 1) {
                    for (int var143 = 0; var143 < class51.field1311; var143++) {
                        if (class35.field885[var143] == var132) {
                            var139 = true;
                            break;
                        }
                    }
                }
                if (!var139 && class55.field1412 == 0) {
                    class80.field2139[class51.field1309] = var140;
                    class51.field1309 = (class51.field1309 + 1) % 100;
                    class65 var144 = class21.method170(0, class58.field1575).method558((byte) 59);
                    if (var138 == 2 || var138 == 3) {
                        class101.method841(var144, 7, class21.method172(-36, new class65[] { class19.field445, class26.method216(16972, var132).method560(-35) }), arg0 ^ 0xFFFFD677);
                    } else if (var138 == 1) {
                        class101.method841(var144, 7, class21.method172(arg0 ^ 0x2E, new class65[] { class53.field1371, class26.method216(arg0 ^ 0xFFFFBDC4, var132).method560(arg0 + 23) }), 10751);
                    } else {
                        class101.method841(var144, 3, class26.method216(16972, var132).method560(-17), arg0 ^ 0xFFFFD677);
                    }
                }
                class113.field2823 = -1;
                return true;
            }
            if (class113.field2823 == 90) {
                class101.field2625 = false;
                for (int var145 = 0; var145 < 5; var145++) {
                    class129.field3111[var145] = false;
                }
                class113.field2823 = -1;
                return true;
            }
            if (class113.field2823 == 83 || class113.field2823 == 80 || class113.field2823 == 187 || class113.field2823 == 200 || class113.field2823 == 51 || class113.field2823 == 249 || class113.field2823 == 60 || class113.field2823 == 85 || class113.field2823 == 171 || class113.field2823 == 210 || class113.field2823 == 37) {
                class116.method945(true);
                class113.field2823 = -1;
                return true;
            }
            if (class113.field2823 == 1) {
                class89.field2368 = class58.field1575.method334(126);
                class116.field2910 = true;
                class113.field2823 = -1;
                class128.field3089 = true;
                return true;
            }
            if (class113.field2823 == 228) {
                if (class66.field1767 != -1) {
                    class24.method195(true, class66.field1767);
                    class116.field2910 = true;
                    class128.field3089 = true;
                    class66.field1767 = -1;
                }
                if (class117.field2939 != -1) {
                    class24.method195(true, class117.field2939);
                    class39.field996 = true;
                    class117.field2939 = -1;
                }
                if (class10.field213 != -1) {
                    class24.method195(true, class10.field213);
                    class10.field213 = -1;
                    class75.method663((byte) 118, 30);
                }
                if (class102.field2644 != -1) {
                    class24.method195(true, class102.field2644);
                    class102.field2644 = -1;
                }
                if (class93.field2472 != -1) {
                    class24.method195(true, class93.field2472);
                    class93.field2472 = -1;
                }
                class113.field2823 = -1;
                class13.field278 = false;
                if (class116.field2916 != 0) {
                    class39.field996 = true;
                    class116.field2916 = 0;
                }
                return true;
            }
            if (class113.field2823 == 207) {
                class113.field2823 = -1;
                class13.field283 = 0;
                return true;
            }
            if (class113.field2823 == 184) {
                int var146 = class58.field1575.method334(125);
                int var147 = class58.field1575.method334(109);
                int var148 = class58.field1575.method334(121);
                int var149 = class58.field1575.method334(arg0 + 225);
                class129.field3111[var146] = true;
                class4.field75[var146] = var147;
                class1.field36[var146] = var148;
                class80.field2124[var146] = var149;
                class6.field110[var146] = 0;
                class113.field2823 = -1;
                return true;
            }
            if (class113.field2823 == 118) {
                int var150 = class58.field1575.method314(false);
                if (var150 == 65535) {
                    var150 = -1;
                }
                if (var150 == -1 && class39.field999 == 0) {
                    class84.method752(-19964);
                } else if (var150 != -1 && class44.field1164 != var150 && class90.field2392 != 0 && class39.field999 == 0) {
                    class84.method748(false, class90.field2392, 10, 765, 0, class56.field1468, 0, var150);
                }
                class44.field1164 = var150;
                class113.field2823 = -1;
                return true;
            }
            if (class113.field2823 == 169) {
                int var151 = class58.field1575.method300(123);
                if (var151 == 65535) {
                    var151 = -1;
                }
                int var152 = class58.field1575.method336(false);
                if (class90.field2392 != 0 && var151 != -1) {
                    class84.method759(1, (byte) -124, class55.field1409, class90.field2392, 0, var151, false);
                    class39.field999 = var152;
                }
                class113.field2823 = -1;
                return true;
            }
            if (class113.field2823 == 102) {
                int var153 = class58.field1575.method329(144752608);
                class98.field2551 = class72.field1891.method96(var153, -118);
                class113.field2823 = -1;
                return true;
            }
            if (class113.field2823 == 126) {
                class128.field3104 = class58.field1575.method342(arg0 - 6);
                class88.field2354 = class58.field1575.method317(0);
                while (class54.field1392 > class58.field1575.field998) {
                    class113.field2823 = class58.field1575.method334(109);
                    class116.method945(true);
                }
                class113.field2823 = -1;
                return true;
            }
            if (class113.field2823 == 152) {
                class1.method7(true);
                class113.field2823 = -1;
                return false;
            }
            class129.method1015(arg0 - 8, null, "T1 - " + class113.field2823 + "," + class123.field2995 + "," + class1.field41 + " - " + class54.field1392);
            class1.method7(true);
        } catch (IOException var157) {
            class123.method978((byte) 105);
        } catch (Exception var158) {
            String var155 = "T2 - " + class113.field2823 + "," + class123.field2995 + "," + class1.field41 + " - " + class54.field1392 + "," + (class32.field833.field1105[0] + field494) + "," + (class32.field833.field1097[0] + class86.field2295) + " - ";
            for (int var156 = 0; class54.field1392 > var156 && var156 < 50; var156++) {
                var155 = var155 + class58.field1575.field994[var156] + ",";
            }
            class129.method1015(-109, var158, var155);
            class1.method7(true);
        }
        return true;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/Class;", line = 1790)
    public static final Class method166(String arg0, byte arg1) throws ClassNotFoundException {
        field476++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else {
            int var2 = 115 / ((46 - arg1) / 54);
            if (arg0.equals("D")) {
                return Double.TYPE;
            } else if (arg0.equals("C")) {
                return Character.TYPE;
            } else {
                return Class.forName(arg0);
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V", line = 1832)
    public static void method167(int arg0) {
        field490 = null;
        field483 = null;
        field491 = null;
        field488 = null;
        field489 = null;
        field477 = null;
        field492 = null;
        if (arg0 >= -102) {
            method168((byte) -8);
        }
        field481 = null;
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(B)V", line = 1853)
    public static final void method168(byte arg0) {
        class72.field1921.method834(5875);
        field485++;
        int var1 = 34 / ((39 - arg0) / 38);
    }
}
