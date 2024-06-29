import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class84 extends class59 {

    @OriginalMember(owner = "client!jc", name = "S", descriptor = "Lsd;")
    public static class166 field1684 = class135.method935("Anmelde)2Limit -Uberschritten)3", 0);

    @OriginalMember(owner = "client!jc", name = "X", descriptor = "Lsd;")
    private static class166 field1689 = class135.method935(" has logged out)3", 0);

    @OriginalMember(owner = "client!jc", name = "U", descriptor = "Lsd;")
    private static class166 field1686 = class135.method935("Username: ", 0);

    @OriginalMember(owner = "client!jc", name = "W", descriptor = "Lsd;")
    public static class166 field1688 = field1689;

    @OriginalMember(owner = "client!jc", name = "ab", descriptor = "Lsd;")
    public static class166 field1692 = class135.method935("Titelbild geladen)3", 0);

    @OriginalMember(owner = "client!jc", name = "eb", descriptor = "Lsd;")
    public static class166 field1696 = field1686;

    @OriginalMember(owner = "client!jc", name = "bb", descriptor = "Lsd;")
    public static class166 field1693 = class135.method935("(Y<)4col>", 0);

    @OriginalMember(owner = "client!jc", name = "T", descriptor = "I")
    public static int field1685;

    @OriginalMember(owner = "client!jc", name = "V", descriptor = "I")
    public static int field1687;

    @OriginalMember(owner = "client!jc", name = "Y", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!jc", name = "Z", descriptor = "I")
    public static int field1691;

    @OriginalMember(owner = "client!jc", name = "cb", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!jc", name = "db", descriptor = "I")
    public static int field1695;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(IB)[I")
    public final int[] method36(int arg0, byte arg1) {
        if (arg1 > -124) {
            return null;
        } else {
            ++field1695;
            int[] var3 = super.field1219.method721(arg0, -126);
            if (super.field1219.field1816) {
                for (int var4 = 0; var4 < class98.field1879; ++var4) {
                    var3[var4] = class187.field3569[var4];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)V")
    public static final void method677(int arg0, int arg1) {
        ++field1694;
        if (arg0 >= 0) {
            int var2 = class200.field3970[arg0];
            int var3 = class161.field3081[arg0];
            int var4 = class16.field262[arg0];
            if (var2 >= 2000) {
                var2 -= 2000;
            }
            int var5 = class56.field1092[arg0];
            if (~var2 == -26 && class48.method372((byte) 75, var4, var5, var3)) {
                class156.field2989.method705(65, (byte) 9);
                class156.field2989.method399(94, var3 >> 14 & 32767);
                ++class81.field1652;
                class156.field2989.method409((byte) -78, class27.field478);
                class156.field2989.method399(104, class170.field3279 + var4);
                class156.field2989.method407((byte) -125, class166.field3163);
                class156.field2989.method399(119, class147.field2901 + var5);
                class156.field2989.method438(423055928, class104.field2037);
            }
            if (var2 == 48) {
                ++class62.field1288;
                class156.field2989.method705(233, (byte) 9);
                class156.field2989.method438(423055928, var5);
                class156.field2989.method399(102, var4);
                class156.field2989.method437(var3, 25673);
                class112.field2175 = 0;
                class23.field399 = class90.method701(arg1 + -31357, var5);
                class194.field3854 = var4;
            }
            if (~var2 == -1007) {
                ++class52.field942;
                class194.field3842 = 2;
                class194.field3849 = class69.field1409;
                class86.field1716 = 0;
                class184.field3544 = class57.field1174;
                class156.field2989.method705(53, (byte) 9);
                class156.field2989.method409((byte) -43, var3);
            }
            if (var2 == 5) {
                ++class69.field1403;
                boolean var6 = class6.method39(class41.field728.field3521[0], 0, 0, 0, (byte) -128, var5, false, var4, 0, 2, class41.field728.field3554[0], 0);
                if (!var6) {
                    class6.method39(class41.field728.field3521[0], 0, 1, 1, (byte) 106, var5, false, var4, 0, 2, class41.field728.field3554[0], 0);
                }
                class86.field1716 = 0;
                class194.field3842 = 2;
                class184.field3544 = class57.field1174;
                class194.field3849 = class69.field1409;
                class156.field2989.method705(128, (byte) 9);
                class156.field2989.method409((byte) -54, var5 - -class147.field2901);
                class156.field2989.method399(arg1 + 83, class170.field3279 + var4);
                class156.field2989.method409((byte) -11, var3);
            }
            if (~var2 == -44 && class11.field201 == null) {
                class159.method1081(var4, var5, (byte) 94);
                class11.field201 = class121.method875(var4, var5, 117);
                class68.method550(class11.field201, 15);
            }
            if (~var2 == -37) {
                class156.field2989.method705(9, (byte) 9);
                ++class62.field1292;
                class156.field2989.method407((byte) -126, class127.field2497);
                class156.field2989.method439((byte) 114, var5);
                class156.field2989.method438(arg1 ^ 423055930, class125.field2455);
                class156.field2989.method407((byte) -126, var4);
            }
            if (~var2 == -1002) {
                class194.field3842 = 2;
                class86.field1716 = 0;
                class184.field3544 = class57.field1174;
                class194.field3849 = class69.field1409;
                ++class67.field1359;
                class156.field2989.method705(204, (byte) 9);
                class156.field2989.method437((536868386 & var3) >> 14, 25673);
            }
            if (var2 == 51) {
                ++class6.field128;
                class156.field2989.method705(112, (byte) 9);
                class156.field2989.method399(125, var4);
                class156.field2989.method390((byte) -26, var5);
                class156.field2989.method407((byte) -126, var3);
                class112.field2175 = 0;
                class23.field399 = class90.method701(-31355, var5);
                class194.field3854 = var4;
            }
            if (~var2 == -48) {
                class156.field2989.method705(150, (byte) 9);
                class156.field2989.method438(423055928, var5);
                class193 var8 = class90.method701(-31355, var5);
                if (var8.field3714 != null && var8.field3714[0][0] == 5) {
                    int var9 = var8.field3714[0][1];
                    if (~class91.field1785[var9] != ~var8.field3833[0]) {
                        class91.field1785[var9] = var8.field3833[0];
                        class151.method1026((byte) 115, var9);
                    }
                }
                ++class74.field1509;
            }
            if (var2 == 19) {
                ++class29.field540;
                boolean var10 = class6.method39(class41.field728.field3521[0], 0, 0, 0, (byte) -115, var5, false, var4, 0, 2, class41.field728.field3554[0], 0);
                if (!var10) {
                    class6.method39(class41.field728.field3521[0], 0, 1, 1, (byte) 124, var5, false, var4, 0, 2, class41.field728.field3554[0], 0);
                }
                class194.field3842 = 2;
                class194.field3849 = class69.field1409;
                class184.field3544 = class57.field1174;
                class86.field1716 = 0;
                class156.field2989.method705(237, (byte) 9);
                class156.field2989.method403(class104.field2037, true);
                class156.field2989.method437(class27.field478, 25673);
                class156.field2989.method409((byte) -44, var4 - -class170.field3279);
                class156.field2989.method437(var3, 25673);
                class156.field2989.method399(115, class166.field3163);
                class156.field2989.method407((byte) -123, class147.field2901 + var5);
            }
            if (~var2 == -9) {
                ++class189.field3595;
                boolean var12 = class6.method39(class41.field728.field3521[0], 0, 0, 0, (byte) -124, var5, false, var4, 0, 2, class41.field728.field3554[0], 0);
                if (!var12) {
                    class6.method39(class41.field728.field3521[0], 0, 1, 1, (byte) 31, var5, false, var4, 0, 2, class41.field728.field3554[0], 0);
                }
                class184.field3544 = class57.field1174;
                class194.field3849 = class69.field1409;
                class86.field1716 = 0;
                class194.field3842 = 2;
                class156.field2989.method705(76, (byte) 9);
                class156.field2989.method409((byte) -2, var3);
                class156.field2989.method409((byte) -11, class147.field2901 + var5);
                class156.field2989.method437(var4 - -class170.field3279, arg1 ^ 25675);
            }
            if (~var2 == -1006) {
                class48.method372((byte) 55, var4, var5, var3);
                class156.field2989.method705(181, (byte) 9);
                ++class6.field123;
                class156.field2989.method399(112, (536866892 & var3) >> 14);
                class156.field2989.method407((byte) -125, var4 - -class170.field3279);
                class156.field2989.method407((byte) -117, class147.field2901 + var5);
            }
            if (var2 == 12) {
                ++class28.field485;
                boolean var14 = class6.method39(class41.field728.field3521[0], 0, 0, 0, (byte) 34, var5, false, var4, 0, 2, class41.field728.field3554[0], 0);
                if (!var14) {
                    class6.method39(class41.field728.field3521[0], 0, 1, 1, (byte) 45, var5, false, var4, 0, 2, class41.field728.field3554[0], 0);
                }
                class194.field3842 = 2;
                class86.field1716 = 0;
                class194.field3849 = class69.field1409;
                class184.field3544 = class57.field1174;
                class156.field2989.method705(61, (byte) 9);
                class156.field2989.method407((byte) -121, class147.field2901 + var5);
                class156.field2989.method399(arg1 + 115, var3);
                class156.field2989.method409((byte) -71, class170.field3279 + var4);
            }
            if (~var2 == -30) {
                ++class129.field2521;
                class156.field2989.method705(126, (byte) 9);
                class156.field2989.method409((byte) -114, var4);
                class156.field2989.method390((byte) -26, var5);
                class156.field2989.method437(var3, 25673);
                class112.field2175 = 0;
                class23.field399 = class90.method701(-31355, var5);
                class194.field3854 = var4;
            }
            if (var2 == 20) {
                ++class93.field1817;
                boolean var16 = class6.method39(class41.field728.field3521[0], 0, 0, 0, (byte) -104, var5, false, var4, 0, 2, class41.field728.field3554[0], 0);
                if (!var16) {
                    class6.method39(class41.field728.field3521[0], 0, 1, 1, (byte) 50, var5, false, var4, 0, 2, class41.field728.field3554[0], 0);
                }
                class86.field1716 = 0;
                class194.field3849 = class69.field1409;
                class194.field3842 = 2;
                class184.field3544 = class57.field1174;
                class156.field2989.method705(54, (byte) 9);
                class156.field2989.method407((byte) -122, class147.field2901 + var5);
                class156.field2989.method409((byte) -121, var3);
                class156.field2989.method399(108, var4 - -class170.field3279);
            }
            if (~var2 == -22) {
                class156.field2989.method705(70, (byte) 9);
                class156.field2989.method439((byte) 107, var5);
                class156.field2989.method399(86, var4);
                class156.field2989.method407((byte) -119, var3);
                ++class39.field699;
                class156.field2989.method407((byte) -121, class127.field2497);
                class156.field2989.method439((byte) 90, class125.field2455);
                class112.field2175 = 0;
                class23.field399 = class90.method701(-31355, var5);
                class194.field3854 = var4;
            }
            if (var2 == 1002) {
                class193 var18 = class90.method701(-31355, var5);
                if (var18 != null && var18.field3760[var4] >= 100000) {
                    class150.method1023((byte) -72, 0, class22.method148(new class166[] { class174.method1192(false, var18.field3760[var4]), class106.field2073, class3.method19(var3, true).field1122 }, 0), class196.field3891);
                } else {
                    class156.field2989.method705(53, (byte) 9);
                    ++class52.field942;
                    class156.field2989.method409((byte) -43, var3);
                }
                class112.field2175 = 0;
                class23.field399 = class90.method701(-31355, var5);
                class194.field3854 = var4;
            }
            if (var2 == 31) {
                class156.field2989.method705(150, (byte) 9);
                class156.field2989.method438(423055928, var5);
                ++class74.field1509;
                class193 var19 = class90.method701(arg1 + -31357, var5);
                if (var19.field3714 != null && ~var19.field3714[0][0] == -6) {
                    int var20 = var19.field3714[0][1];
                    class91.field1785[var20] = 1 - class91.field1785[var20];
                    class151.method1026((byte) 111, var20);
                }
            }
            if (~var2 == -39 || ~var2 == -1005) {
                class144.method985(var3, var4, true, class182.field3462[arg0], var5);
            }
            if (var2 == 30) {
                class193 var21 = class90.method701(-31355, var5);
                boolean var22 = true;
                if (~var21.field3823 < -1) {
                    var22 = class135.method934(-300, var21);
                }
                if (var22) {
                    ++class74.field1509;
                    class156.field2989.method705(150, (byte) 9);
                    class156.field2989.method438(423055928, var5);
                }
            }
            if (var2 == 41) {
                class154 var23 = class124.field2434[var3];
                if (var23 != null) {
                    ++class86.field1713;
                    class6.method39(class41.field728.field3521[0], 0, 1, 1, (byte) 43, var23.field3521[0], false, var23.field3554[0], 0, 2, class41.field728.field3554[0], 0);
                    class184.field3544 = class57.field1174;
                    class194.field3842 = 2;
                    class86.field1716 = 0;
                    class194.field3849 = class69.field1409;
                    class156.field2989.method705(158, (byte) 9);
                    class156.field2989.method407((byte) -124, var3);
                }
            }
            if (~var2 == -16) {
                class154 var24 = class124.field2434[var3];
                if (var24 != null) {
                    class6.method39(class41.field728.field3521[0], 0, 1, 1, (byte) 47, var24.field3521[0], false, var24.field3554[0], 0, 2, class41.field728.field3554[0], 0);
                    ++class27.field468;
                    class184.field3544 = class57.field1174;
                    class194.field3842 = 2;
                    class86.field1716 = 0;
                    class194.field3849 = class69.field1409;
                    class156.field2989.method705(100, (byte) 9);
                    class156.field2989.method399(88, var3);
                }
            }
            if (var2 == 3) {
                class123 var25 = class182.field3451[var3];
                if (var25 != null) {
                    class6.method39(class41.field728.field3521[0], 0, 1, 1, (byte) -124, var25.field3521[0], false, var25.field3554[0], 0, 2, class41.field728.field3554[0], 0);
                    class86.field1716 = 0;
                    class194.field3849 = class69.field1409;
                    class184.field3544 = class57.field1174;
                    class194.field3842 = 2;
                    class156.field2989.method705(41, (byte) 9);
                    class156.field2989.method437(var3, 25673);
                    ++class195.field3866;
                }
            }
            if (~var2 == -10) {
                class123 var26 = class182.field3451[var3];
                if (var26 != null) {
                    ++class115.field2235;
                    class6.method39(class41.field728.field3521[0], 0, 1, 1, (byte) 22, var26.field3521[0], false, var26.field3554[0], 0, 2, class41.field728.field3554[0], 0);
                    class194.field3849 = class69.field1409;
                    class86.field1716 = 0;
                    class194.field3842 = 2;
                    class184.field3544 = class57.field1174;
                    class156.field2989.method705(49, (byte) 9);
                    class156.field2989.method409((byte) -92, var3);
                }
            }
            if (var2 == 42) {
                ++class134.field2601;
                class48.method372((byte) 78, var4, var5, var3);
                class156.field2989.method705(7, (byte) 9);
                class156.field2989.method437(class170.field3279 + var4, 25673);
                class156.field2989.method399(arg1 + 114, class147.field2901 + var5);
                class156.field2989.method399(121, var3 >> 14 & 32767);
            }
            if (~var2 == -11) {
                class82.method667((byte) 112);
            }
            if (~var2 == -3) {
                class156.field2989.method705(198, (byte) 9);
                ++class87.field1726;
                class156.field2989.method399(93, var3);
                class156.field2989.method407((byte) -128, var4);
                class156.field2989.method403(var5, true);
                class112.field2175 = 0;
                class23.field399 = class90.method701(-31355, var5);
                class194.field3854 = var4;
            }
            if (~var2 == -36) {
                class156.field2989.method705(173, (byte) 9);
                class156.field2989.method399(99, var3);
                class156.field2989.method403(var5, true);
                class156.field2989.method399(86, var4);
                ++class61.field1245;
                class112.field2175 = 0;
                class23.field399 = class90.method701(-31355, var5);
                class194.field3854 = var4;
            }
            if (var2 == 37) {
                ++class139.field2704;
                boolean var27 = class6.method39(class41.field728.field3521[0], 0, 0, 0, (byte) -102, var5, false, var4, 0, 2, class41.field728.field3554[0], 0);
                if (!var27) {
                    class6.method39(class41.field728.field3521[0], 0, 1, 1, (byte) -122, var5, false, var4, 0, 2, class41.field728.field3554[0], 0);
                }
                class86.field1716 = 0;
                class194.field3849 = class69.field1409;
                class184.field3544 = class57.field1174;
                class194.field3842 = 2;
                class156.field2989.method705(227, (byte) 9);
                class156.field2989.method399(arg1 ^ 91, var3);
                class156.field2989.method407((byte) -122, var4 - -class170.field3279);
                class156.field2989.method399(111, var5 - -class147.field2901);
            }
            if (var2 == 22) {
                class156.field2989.method705(239, (byte) 9);
                ++class14.field246;
                class156.field2989.method390((byte) -26, var5);
                class156.field2989.method407((byte) -121, var4);
                class156.field2989.method409((byte) -106, var3);
                class112.field2175 = 0;
                class23.field399 = class90.method701(-31355, var5);
                class194.field3854 = var4;
            }
            if (~var2 == -40) {
                class131.field2556.method625(class165.field3130, var4, var5);
            }
            if (var2 == 13) {
                class123 var29 = class182.field3451[var3];
                if (var29 != null) {
                    ++class91.field1793;
                    class6.method39(class41.field728.field3521[0], 0, 1, 1, (byte) -115, var29.field3521[0], false, var29.field3554[0], 0, 2, class41.field728.field3554[0], 0);
                    class184.field3544 = class57.field1174;
                    class194.field3842 = 2;
                    class194.field3849 = class69.field1409;
                    class86.field1716 = 0;
                    class156.field2989.method705(255, (byte) 9);
                    class156.field2989.method409((byte) -127, var3);
                }
            }
            if (~var2 == -2) {
                class154 var30 = class124.field2434[var3];
                if (var30 != null) {
                    ++class87.field1729;
                    class6.method39(class41.field728.field3521[0], 0, 1, 1, (byte) 45, var30.field3521[0], false, var30.field3554[0], 0, 2, class41.field728.field3554[0], 0);
                    class194.field3842 = 2;
                    class86.field1716 = 0;
                    class184.field3544 = class57.field1174;
                    class194.field3849 = class69.field1409;
                    class156.field2989.method705(31, (byte) 9);
                    class156.field2989.method409((byte) -5, var3);
                }
            }
            if (var2 == 33) {
                class156.field2989.method705(75, (byte) 9);
                ++class194.field3851;
                class156.field2989.method409((byte) -57, var4);
                class156.field2989.method403(var5, true);
                class156.field2989.method409((byte) -20, var3);
                class112.field2175 = 0;
                class23.field399 = class90.method701(-31355, var5);
                class194.field3854 = var4;
            }
            if (var2 == 58) {
                ++class178.field3365;
                boolean var31 = class6.method39(class41.field728.field3521[0], 0, 0, 0, (byte) -110, var5, false, var4, 0, 2, class41.field728.field3554[0], 0);
                if (!var31) {
                    class6.method39(class41.field728.field3521[0], 0, 1, 1, (byte) -128, var5, false, var4, 0, 2, class41.field728.field3554[0], 0);
                }
                class184.field3544 = class57.field1174;
                class194.field3849 = class69.field1409;
                class194.field3842 = 2;
                class86.field1716 = 0;
                class156.field2989.method705(93, (byte) 9);
                class156.field2989.method407((byte) -118, class127.field2497);
                class156.field2989.method407((byte) -125, var3);
                class156.field2989.method438(423055928, class125.field2455);
                class156.field2989.method407((byte) -117, class170.field3279 + var4);
                class156.field2989.method409((byte) -39, var5 - -class147.field2901);
            }
            if (var2 == 50) {
                class123 var33 = class182.field3451[var3];
                if (var33 != null) {
                    class6.method39(class41.field728.field3521[0], 0, 1, 1, (byte) 124, var33.field3521[0], false, var33.field3554[0], 0, 2, class41.field728.field3554[0], 0);
                    class86.field1716 = 0;
                    class184.field3544 = class57.field1174;
                    class194.field3842 = 2;
                    class194.field3849 = class69.field1409;
                    class156.field2989.method705(132, (byte) 9);
                    class156.field2989.method399(127, var3);
                    ++class195.field3858;
                }
            }
            if (var2 == 32) {
                class62.method525((byte) -85);
                class193 var34 = class90.method701(arg1 + -31357, var5);
                class27.field478 = var3;
                class104.field2037 = var5;
                class166.field3163 = var4;
                class4.field73 = 1;
                class68.method550(var34, 15);
                class135.field2651 = class22.method148(new class166[] { class35.field662, class3.method19(var3, true).field1122, class202.field3989 }, 0);
                if (class135.field2651 == null) {
                    class135.field2651 = class43.field782;
                }
            } else {
                if (var2 == 24) {
                    class123 var35 = class182.field3451[var3];
                    if (var35 != null) {
                        class6.method39(class41.field728.field3521[0], 0, 1, 1, (byte) 95, var35.field3521[0], false, var35.field3554[0], 0, 2, class41.field728.field3554[0], 0);
                        class86.field1716 = 0;
                        class194.field3842 = 2;
                        class194.field3849 = class69.field1409;
                        ++class67.field1358;
                        class184.field3544 = class57.field1174;
                        class156.field2989.method705(86, (byte) 9);
                        class156.field2989.method437(var3, arg1 ^ 25675);
                    }
                }
                if (~var2 == -19) {
                    class193 var36 = class121.method875(var4, var5, 123);
                    if (var36 != null) {
                        class62.method525((byte) 118);
                        class33.method243(var5, class195.method1301(class140.method955(-102, var36), -2), (byte) 72, var4);
                        class4.field73 = 0;
                        class102.field1988 = class52.method382(72, var36);
                        if (class102.field1988 == null) {
                            class102.field1988 = class18.field308;
                        }
                        if (!var36.field3841) {
                            class43.field759 = class22.method148(new class166[] { class98.field1868, var36.field3780, class202.field3989 }, 0);
                            return;
                        }
                        class43.field759 = class22.method148(new class166[] { var36.field3720, class202.field3989 }, 0);
                    }
                } else {
                    if (var2 == 6) {
                        class123 var37 = class182.field3451[var3];
                        if (var37 != null) {
                            ++class10.field192;
                            class6.method39(class41.field728.field3521[0], 0, 1, 1, (byte) -101, var37.field3521[0], false, var37.field3554[0], 0, 2, class41.field728.field3554[0], 0);
                            class194.field3849 = class69.field1409;
                            class184.field3544 = class57.field1174;
                            class194.field3842 = 2;
                            class86.field1716 = 0;
                            class156.field2989.method705(205, (byte) 9);
                            class156.field2989.method437(var3, arg1 ^ 25675);
                        }
                    }
                    if (var2 == 16) {
                        ++class185.field3564;
                        class156.field2989.method705(236, (byte) 9);
                        class156.field2989.method399(90, var4);
                        class156.field2989.method437(var3, 25673);
                        class156.field2989.method438(arg1 ^ 423055930, var5);
                        class112.field2175 = 0;
                        class23.field399 = class90.method701(-31355, var5);
                        class194.field3854 = var4;
                    }
                    if (arg1 == 2) {
                        if (~var2 == -41) {
                            class123 var38 = class182.field3451[var3];
                            if (var38 != null) {
                                class6.method39(class41.field728.field3521[0], 0, 1, 1, (byte) 126, var38.field3521[0], false, var38.field3554[0], 0, 2, class41.field728.field3554[0], 0);
                                ++class63.field1303;
                                class184.field3544 = class57.field1174;
                                class194.field3842 = 2;
                                class194.field3849 = class69.field1409;
                                class86.field1716 = 0;
                                class156.field2989.method705(156, (byte) 9);
                                class156.field2989.method407((byte) -126, var3);
                            }
                        }
                        if (~var2 == -24) {
                            class123 var39 = class182.field3451[var3];
                            if (var39 != null) {
                                ++class138.field2687;
                                class6.method39(class41.field728.field3521[0], 0, 1, 1, (byte) 85, var39.field3521[0], false, var39.field3554[0], 0, 2, class41.field728.field3554[0], 0);
                                class184.field3544 = class57.field1174;
                                class194.field3842 = 2;
                                class86.field1716 = 0;
                                class194.field3849 = class69.field1409;
                                class156.field2989.method705(167, (byte) 9);
                                class156.field2989.method407((byte) -118, var3);
                                class156.field2989.method403(class104.field2037, true);
                                class156.field2989.method437(class166.field3163, 25673);
                                class156.field2989.method437(class27.field478, arg1 + 25671);
                            }
                        }
                        if (~var2 == -12) {
                            class154 var40 = class124.field2434[var3];
                            if (var40 != null) {
                                class6.method39(class41.field728.field3521[0], 0, 1, 1, (byte) -104, var40.field3521[0], false, var40.field3554[0], 0, 2, class41.field728.field3554[0], 0);
                                class194.field3842 = 2;
                                class184.field3544 = class57.field1174;
                                class194.field3849 = class69.field1409;
                                ++class18.field306;
                                class86.field1716 = 0;
                                class156.field2989.method705(139, (byte) 9);
                                class156.field2989.method437(var3, 25673);
                            }
                        }
                        if (~var2 == -8) {
                            class154 var41 = class124.field2434[var3];
                            if (var41 != null) {
                                class6.method39(class41.field728.field3521[0], 0, 1, 1, (byte) -104, var41.field3521[0], false, var41.field3554[0], 0, 2, class41.field728.field3554[0], 0);
                                ++class202.field4001;
                                class184.field3544 = class57.field1174;
                                class194.field3842 = 2;
                                class86.field1716 = 0;
                                class194.field3849 = class69.field1409;
                                class156.field2989.method705(101, (byte) 9);
                                class156.field2989.method409((byte) -86, var3);
                                class156.field2989.method409((byte) -53, class27.field478);
                                class156.field2989.method439((byte) 61, class104.field2037);
                                class156.field2989.method399(103, class166.field3163);
                            }
                        }
                        if (~var2 == -46) {
                            ++class30.field563;
                            class156.field2989.method705(104, (byte) 9);
                            class156.field2989.method439((byte) 95, var5);
                            class156.field2989.method437(var3, 25673);
                            class156.field2989.method399(89, var4);
                            class112.field2175 = 0;
                            class23.field399 = class90.method701(arg1 ^ -31353, var5);
                            class194.field3854 = var4;
                        }
                        if (~var2 == -5) {
                            ++class204.field4026;
                            class156.field2989.method705(56, (byte) 9);
                            class156.field2989.method409((byte) -73, var4);
                            class156.field2989.method399(111, class166.field3163);
                            class156.field2989.method437(class27.field478, 25673);
                            class156.field2989.method390((byte) -26, class104.field2037);
                            class156.field2989.method403(var5, true);
                            class156.field2989.method399(125, var3);
                            class112.field2175 = 0;
                            class23.field399 = class90.method701(-31355, var5);
                            class194.field3854 = var4;
                        }
                        if (var2 == 57) {
                            ++class194.field3852;
                            class48.method372((byte) 39, var4, var5, var3);
                            class156.field2989.method705(80, (byte) 9);
                            class156.field2989.method399(89, class147.field2901 + var5);
                            class156.field2989.method399(92, 32767 & var3 >> 14);
                            class156.field2989.method437(class170.field3279 + var4, 25673);
                        }
                        if (var2 == 26) {
                            class154 var42 = class124.field2434[var3];
                            if (var42 != null) {
                                class6.method39(class41.field728.field3521[0], 0, 1, 1, (byte) 33, var42.field3521[0], false, var42.field3554[0], 0, 2, class41.field728.field3554[0], 0);
                                class194.field3849 = class69.field1409;
                                class194.field3842 = 2;
                                class184.field3544 = class57.field1174;
                                class86.field1716 = 0;
                                class156.field2989.method705(254, (byte) 9);
                                ++class81.field1646;
                                class156.field2989.method407((byte) -117, var3);
                            }
                        }
                        if (var2 == 49 && class48.method372((byte) 24, var4, var5, var3)) {
                            class156.field2989.method705(212, (byte) 9);
                            class156.field2989.method439((byte) 120, class125.field2455);
                            ++class110.field2136;
                            class156.field2989.method409((byte) -61, var5 - -class147.field2901);
                            class156.field2989.method407((byte) -123, var4 - -class170.field3279);
                            class156.field2989.method407((byte) -117, class127.field2497);
                            class156.field2989.method409((byte) -37, 32767 & var3 >> 14);
                        }
                        if (~var2 == -15) {
                            class123 var43 = class182.field3451[var3];
                            if (var43 != null) {
                                class6.method39(class41.field728.field3521[0], 0, 1, 1, (byte) -106, var43.field3521[0], false, var43.field3554[0], 0, 2, class41.field728.field3554[0], 0);
                                class184.field3544 = class57.field1174;
                                class194.field3849 = class69.field1409;
                                ++class89.field1746;
                                class194.field3842 = 2;
                                class86.field1716 = 0;
                                class156.field2989.method705(46, (byte) 9);
                                class156.field2989.method399(121, var3);
                            }
                        }
                        if (~var2 == -29) {
                            class48.method372((byte) 105, var4, var5, var3);
                            ++class160.field3061;
                            class156.field2989.method705(115, (byte) 9);
                            class156.field2989.method409((byte) -126, class147.field2901 + var5);
                            class156.field2989.method399(116, (var3 & 536863875) >> 14);
                            class156.field2989.method409((byte) -20, class170.field3279 + var4);
                        }
                        if (~var2 == -1008) {
                            class194.field3842 = 2;
                            class194.field3849 = class69.field1409;
                            class86.field1716 = 0;
                            class184.field3544 = class57.field1174;
                            class154 var44 = class124.field2434[var3];
                            if (var44 != null) {
                                class77 var45 = var44.field2958;
                                if (var45.field1598 != null) {
                                    var45 = var45.method637(arg1 ^ -29);
                                }
                                if (var45 != null) {
                                    class156.field2989.method705(20, (byte) 9);
                                    ++class107.field2090;
                                    class156.field2989.method407((byte) -123, var45.field1579);
                                }
                            }
                        }
                        if (var2 == 44) {
                            class123 var46 = class182.field3451[var3];
                            if (var46 != null) {
                                class6.method39(class41.field728.field3521[0], 0, 1, 1, (byte) -128, var46.field3521[0], false, var46.field3554[0], 0, 2, class41.field728.field3554[0], 0);
                                class184.field3544 = class57.field1174;
                                class194.field3842 = 2;
                                class86.field1716 = 0;
                                class194.field3849 = class69.field1409;
                                class156.field2989.method705(69, (byte) 9);
                                ++class33.field601;
                                class156.field2989.method438(423055928, class125.field2455);
                                class156.field2989.method407((byte) -125, var3);
                                class156.field2989.method409((byte) -125, class127.field2497);
                            }
                        }
                        if (~var2 == -47) {
                            ++class114.field2211;
                            class156.field2989.method705(209, (byte) 9);
                            class156.field2989.method390((byte) -26, var5);
                            class156.field2989.method407((byte) -128, var4);
                            class156.field2989.method399(arg1 ^ 115, var3);
                            class112.field2175 = 0;
                            class23.field399 = class90.method701(-31355, var5);
                            class194.field3854 = var4;
                        }
                        if (var2 == 17) {
                            class48.method372((byte) 100, var4, var5, var3);
                            ++class125.field2460;
                            class156.field2989.method705(110, (byte) 9);
                            class156.field2989.method437(var4 - -class170.field3279, 25673);
                            class156.field2989.method399(91, class147.field2901 + var5);
                            class156.field2989.method407((byte) -121, (536863649 & var3) >> 14);
                        }
                        if (var2 == 34) {
                            class154 var47 = class124.field2434[var3];
                            if (var47 != null) {
                                class6.method39(class41.field728.field3521[0], 0, 1, 1, (byte) -107, var47.field3521[0], false, var47.field3554[0], 0, 2, class41.field728.field3554[0], 0);
                                ++class170.field3276;
                                class194.field3849 = class69.field1409;
                                class184.field3544 = class57.field1174;
                                class194.field3842 = 2;
                                class86.field1716 = 0;
                                class156.field2989.method705(27, (byte) 9);
                                class156.field2989.method390((byte) -26, class125.field2455);
                                class156.field2989.method409((byte) -59, class127.field2497);
                                class156.field2989.method399(102, var3);
                            }
                        }
                        if (~class4.field73 != -1) {
                            class4.field73 = 0;
                            class68.method550(class90.method701(-31355, class104.field2037), 15);
                        }
                        if (class179.field3393) {
                            class62.method525((byte) -80);
                        }
                        if (class23.field399 != null && class112.field2175 == 0) {
                            class68.method550(class23.field399, arg1 + 13);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "()V")
    public class84() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lf;Lsd;BLsd;)[Lkf;")
    public static final class96[] method678(class47 arg0, class166 arg1, byte arg2, class166 arg3) {
        ++field1687;
        if (arg2 <= 123) {
            method679((byte) 92);
        }
        int var4 = arg0.method363(arg3, 0);
        int var5 = arg0.method362(var4, arg1, -57);
        return class190.method1275(0, var4, arg0, var5);
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(B)V")
    public static final void method679(byte arg0) {
        ++field1691;
        class179.field3377.method703((byte) 114);
        int var1 = class179.field3377.method708(8, 1);
        if (~var1 != -1) {
            int var2 = class179.field3377.method708(8, 2);
            if (var2 == 0) {
                class2.field11[class206.field4058++] = 2047;
            } else if (var2 == 1) {
                int var3 = class179.field3377.method708(8, 3);
                class41.field728.method1247(false, var3, -1);
                int var4 = class179.field3377.method708(8, 1);
                if (~var4 == -2) {
                    class2.field11[class206.field4058++] = 2047;
                }
            } else if (var2 == 2) {
                int var5 = class179.field3377.method708(8, 3);
                class41.field728.method1247(true, var5, -1);
                int var6 = class179.field3377.method708(8, 3);
                class41.field728.method1247(true, var6, -1);
                int var7 = class179.field3377.method708(8, 1);
                if (var7 == 1) {
                    class2.field11[class206.field4058++] = 2047;
                }
            } else if (~var2 == -4) {
                int var8 = class179.field3377.method708(8, 7);
                class165.field3130 = class179.field3377.method708(8, 2);
                int var9 = class179.field3377.method708(8, 1);
                if (~var9 == -2) {
                    class2.field11[class206.field4058++] = 2047;
                }
                int var10 = class179.field3377.method708(8, 1);
                int var11 = class179.field3377.method708(8, 7);
                class41.field728.method1242(var8, 96, var10 == 1, var11);
            } else if (arg0 < 71) {
                field1686 = null;
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "(B)V")
    public static void method680(byte arg0) {
        field1684 = null;
        field1693 = null;
        field1686 = null;
        if (arg0 == 26) {
            field1696 = null;
            field1692 = null;
            field1689 = null;
            field1688 = null;
        }
    }
}
