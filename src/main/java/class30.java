import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class30 {

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
    public static int field769 = 0;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "Lic;")
    public static class59 field775 = class59.method433(0, "Schrifts-=tze geladen)3");

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "Lic;")
    public static class59 field772 = class59.method433(0, "title_mute");

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "Lic;")
    public static class59 field774 = class59.method433(0, "headicons_prayer");

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "[Lt;")
    public static class132[] field773 = new class132[1000];

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "Lic;")
    private static class59 field776 = class59.method433(0, "shake:");

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "I")
    public static int field782 = 0;

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "Lic;")
    private static class59 field783 = class59.method433(0, " is already on your friend list)3");

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "Lic;")
    public static class59 field784 = field783;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "Lic;")
    public static class59 field778 = field776;

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "Lic;")
    public static class59 field785 = field776;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
    public static int field771;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
    public static int field780;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "[I")
    public static int[] field770;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)V")
    public static final void method237(int arg0, int arg1) {
        field777++;
        if (arg1 < 0) {
            return;
        }
        int var2 = class23.field546[arg1];
        int var3 = class120.field2772[arg1];
        int var4 = class53.field1324[arg1];
        if (var4 >= 2000) {
            var4 -= 2000;
        }
        int var5 = class138.field3084[arg1];
        if (var4 == 25) {
            class49 var6 = class91.field2323[var5];
            if (var6 != null) {
                class158.field3508++;
                class121.method945(0, 0, class159.field3650.field1719[0], 2, class159.field3650.field1704[0], 0, 1, -25171, var6.field1719[0], var6.field1704[0], 1, false);
                class158.field3500 = 0;
                class157.field3416 = class3.field68;
                class18.field364 = 2;
                class88.field2220 = class81.field2005;
                class125.field2842.method1072(19, arg0 - 8108);
                class125.field2842.method1165(89, var5);
            }
        }
        if (var4 == 6) {
            class76.field1876++;
            boolean var7 = class121.method945(0, 0, class159.field3650.field1719[0], 2, class159.field3650.field1704[0], 0, 0, -25171, var3, var2, 0, false);
            if (!var7) {
                class121.method945(0, 0, class159.field3650.field1719[0], 2, class159.field3650.field1704[0], 0, 1, arg0 ^ 0xFFFF8206, var3, var2, 1, false);
            }
            class88.field2220 = class81.field2005;
            class18.field364 = 2;
            class158.field3500 = 0;
            class157.field3416 = class3.field68;
            class125.field2842.method1072(136, -1);
            class125.field2842.method1206(var5, true);
            class125.field2842.method1206(class89.field2229 + var3, true);
            class125.field2842.method1206(class68.field1756 + var2, true);
        }
        if (var4 == 48) {
            class26.field671++;
            class125.field2842.method1072(96, arg0 ^ 0xFFFFE054);
            class125.field2842.method1203((byte) 34, var3);
            class125.field2842.method1198(var2, arg0 - 8024);
            class125.field2842.method1206(var5, true);
            class46.field1157 = 0;
            class147.field3199 = class134.method1032(var2, arg0 + 499741733);
            class82.field2043 = var3;
        }
        if (var4 == 17) {
            class32.field856++;
            boolean var9 = class121.method945(0, 0, class159.field3650.field1719[0], 2, class159.field3650.field1704[0], 0, 0, -25171, var3, var2, 0, false);
            if (!var9) {
                class121.method945(0, 0, class159.field3650.field1719[0], 2, class159.field3650.field1704[0], 0, 1, -25171, var3, var2, 1, false);
            }
            class157.field3416 = class3.field68;
            class158.field3500 = 0;
            class88.field2220 = class81.field2005;
            class18.field364 = 2;
            class125.field2842.method1072(220, -1);
            class125.field2842.method1206(var5, true);
            class125.field2842.method1203((byte) -87, var3 + class89.field2229);
            class125.field2842.method1165(77, class2.field41);
            class125.field2842.method1191(class68.field1756 + var2, -1806027672);
            class125.field2842.method1203((byte) -92, class25.field624);
            class125.field2842.method1198(class143.field3132, arg0 ^ 0xFFFFE05C);
        }
        if (var4 == 47) {
            class40.field1028++;
            class3.method12(var2, var5, (byte) 38, var3);
            class125.field2842.method1072(249, -1);
            class125.field2842.method1165(arg0 ^ 0x1FFA, var3 + class89.field2229);
            class125.field2842.method1203((byte) 62, var2 + class68.field1756);
            class125.field2842.method1165(91, var5 >> 14 & 0x7FFF);
        }
        if (var4 == 5 && class151.field3287 == null) {
            class128.method975(var3, (byte) 70, var2);
            class151.field3287 = class76.method632(var2, 128, var3);
            class42.method320(false, class151.field3287);
        }
        if (var4 == 51) {
            class73.method600(false);
            class159 var11 = class134.method1032(var2, 499749840);
            class2.field41 = var5;
            class143.field3132 = var2;
            class96.field2426 = 1;
            class25.field624 = var3;
            class42.method320(false, var11);
            class96.field2431 = class46.method358(new class59[] { class130.field2924, class7.method39(30996, var5).field1936, class88.field2224 }, (byte) -75);
            if (class96.field2431 == null) {
                class96.field2431 = class108.field2604;
            }
            return;
        }
        if (var4 == 34) {
            class125.field2842.method1072(108, -1);
            class125.field2842.method1203((byte) 116, var3);
            class114.field2696++;
            class125.field2842.method1191(var5, arg0 - 1806035779);
            class125.field2842.method1189(-8104, var2);
            class46.field1157 = 0;
            class147.field3199 = class134.method1032(var2, 499749840);
            class82.field2043 = var3;
        }
        if (var4 == 41 || var4 == 1004) {
            class91.method752((byte) -124, var2, class6.field120[arg1], var5, var3);
        }
        if (arg0 != 8107) {
            field775 = null;
        }
        if (var4 == 45) {
            class3.field58.method892(class44.field1127, var3, var2);
        }
        if (var4 == 29) {
            class49 var12 = class91.field2323[var5];
            if (var12 != null) {
                class121.method945(0, 0, class159.field3650.field1719[0], 2, class159.field3650.field1704[0], 0, 1, -25171, var12.field1719[0], var12.field1704[0], 1, false);
                class88.field2220 = class81.field2005;
                class75.field1849++;
                class18.field364 = 2;
                class158.field3500 = 0;
                class157.field3416 = class3.field68;
                class125.field2842.method1072(29, -1);
                class125.field2842.method1206(var5, true);
            }
        }
        if (var4 == 44) {
            class44.field1126++;
            boolean var13 = class121.method945(0, 0, class159.field3650.field1719[0], 2, class159.field3650.field1704[0], 0, 0, arg0 - 33278, var3, var2, 0, false);
            if (!var13) {
                class121.method945(0, 0, class159.field3650.field1719[0], 2, class159.field3650.field1704[0], 0, 1, -25171, var3, var2, 1, false);
            }
            class88.field2220 = class81.field2005;
            class157.field3416 = class3.field68;
            class18.field364 = 2;
            class158.field3500 = 0;
            class125.field2842.method1072(100, -1);
            class125.field2842.method1165(arg0 ^ 0x1FE6, var5);
            class125.field2842.method1203((byte) 116, var3 + class89.field2229);
            class125.field2842.method1191(class68.field1756 + var2, -1806027672);
        }
        if (var4 == 35) {
            class125.field2842.method1072(86, -1);
            class108.field2608++;
            class125.field2842.method1206(class149.field3267, true);
            class125.field2842.method1203((byte) -103, var3);
            class125.field2842.method1195(var2, 852);
            class125.field2842.method1195(class2.field37, 852);
        }
        if (var4 == 21 && class3.method12(var2, var5, (byte) -108, var3)) {
            class23.field558++;
            class125.field2842.method1072(101, -1);
            class125.field2842.method1191(class149.field3267, arg0 - 1806035779);
            class125.field2842.method1163(class2.field37, (byte) 88);
            class125.field2842.method1203((byte) 105, class68.field1756 + var2);
            class125.field2842.method1165(125, var5 >> 14 & 0x7FFF);
            class125.field2842.method1206(var3 + class89.field2229, true);
        }
        if (var4 == 12) {
            class136.field3032++;
            class125.field2842.method1072(158, -1);
            class125.field2842.method1195(var2, 852);
            class159 var15 = class134.method1032(var2, 499749840);
            if (var15.field3554 != null && var15.field3554[0][0] == 5) {
                int var16 = var15.field3554[0][1];
                class85.field2124[var16] = 1 - class85.field2124[var16];
                class17.method89(var16, 0);
            }
        }
        if (var4 == 15) {
            class159 var17 = class76.method632(var2, 128, var3);
            if (var17 != null) {
                class73.method600(false);
                class128.method976(var2, class49.method383(arg0 - 3838, class112.method915(var17, -2042430560)), var3, (byte) -99);
                class96.field2426 = 0;
                class52.field1298 = class40.method310(-1, var17);
                if (class52.field1298 == null) {
                    class52.field1298 = class15.field292;
                }
                if (var17.field3596) {
                    class143.field3139 = class46.method358(new class59[] { var17.field3572, class88.field2224 }, (byte) -75);
                    return;
                }
                class143.field3139 = class46.method358(new class59[] { class107.field2569, var17.field3527, class88.field2224 }, (byte) -75);
            }
            return;
        }
        if (var4 == 7) {
            class52.field1291++;
            boolean var18 = class121.method945(0, 0, class159.field3650.field1719[0], 2, class159.field3650.field1704[0], 0, 0, arg0 - 33278, var3, var2, 0, false);
            if (!var18) {
                class121.method945(0, 0, class159.field3650.field1719[0], 2, class159.field3650.field1704[0], 0, 1, -25171, var3, var2, 1, false);
            }
            class158.field3500 = 0;
            class157.field3416 = class3.field68;
            class18.field364 = 2;
            class88.field2220 = class81.field2005;
            class125.field2842.method1072(31, -1);
            class125.field2842.method1165(126, var5);
            class125.field2842.method1165(105, class68.field1756 + var2);
            class125.field2842.method1206(class89.field2229 + var3, true);
        }
        if (var4 == 57) {
            class90 var20 = class47.field1210[var5];
            if (var20 != null) {
                class62.field1595++;
                class121.method945(0, 0, class159.field3650.field1719[0], 2, class159.field3650.field1704[0], 0, 1, -25171, var20.field1719[0], var20.field1704[0], 1, false);
                class157.field3416 = class3.field68;
                class18.field364 = 2;
                class158.field3500 = 0;
                class88.field2220 = class81.field2005;
                class125.field2842.method1072(166, -1);
                class125.field2842.method1191(var5, -1806027672);
                class125.field2842.method1203((byte) -97, class25.field624);
                class125.field2842.method1165(arg0 - 7987, class2.field41);
                class125.field2842.method1198(class143.field3132, 78);
            }
        }
        if (var4 == 9) {
            class82.field2041++;
            boolean var21 = class121.method945(0, 0, class159.field3650.field1719[0], 2, class159.field3650.field1704[0], 0, 0, -25171, var3, var2, 0, false);
            if (!var21) {
                class121.method945(0, 0, class159.field3650.field1719[0], 2, class159.field3650.field1704[0], 0, 1, -25171, var3, var2, 1, false);
            }
            class157.field3416 = class3.field68;
            class88.field2220 = class81.field2005;
            class158.field3500 = 0;
            class18.field364 = 2;
            class125.field2842.method1072(124, arg0 - 8108);
            class125.field2842.method1203((byte) 24, class68.field1756 + var2);
            class125.field2842.method1206(class89.field2229 + var3, true);
            class125.field2842.method1195(class2.field37, 852);
            class125.field2842.method1191(var5, arg0 - 1806035779);
            class125.field2842.method1203((byte) -86, class149.field3267);
        }
        if (var4 == 49) {
            class49 var23 = class91.field2323[var5];
            if (var23 != null) {
                class32.field861++;
                class121.method945(0, 0, class159.field3650.field1719[0], 2, class159.field3650.field1704[0], 0, 1, -25171, var23.field1719[0], var23.field1704[0], 1, false);
                class157.field3416 = class3.field68;
                class88.field2220 = class81.field2005;
                class158.field3500 = 0;
                class18.field364 = 2;
                class125.field2842.method1072(11, arg0 ^ 0xFFFFE054);
                class125.field2842.method1165(52, var5);
            }
        }
        if (var4 == 24) {
            class125.field2842.method1072(103, -1);
            class125.field2842.method1165(52, var3);
            class125.field2842.method1163(var2, (byte) 88);
            class31.field801++;
            class125.field2842.method1165(107, var5);
            class46.field1157 = 0;
            class147.field3199 = class134.method1032(var2, 499749840);
            class82.field2043 = var3;
        }
        if (var4 == 30) {
            class6.field126++;
            class125.field2842.method1072(76, -1);
            class125.field2842.method1165(118, var3);
            class125.field2842.method1189(-8104, var2);
            class125.field2842.method1191(var5, -1806027672);
            class46.field1157 = 0;
            class147.field3199 = class134.method1032(var2, 499749840);
            class82.field2043 = var3;
        }
        if (var4 == 14) {
            class21.field453++;
            boolean var24 = class121.method945(0, 0, class159.field3650.field1719[0], 2, class159.field3650.field1704[0], 0, 0, arg0 ^ 0xFFFF8206, var3, var2, 0, false);
            if (!var24) {
                class121.method945(0, 0, class159.field3650.field1719[0], 2, class159.field3650.field1704[0], 0, 1, arg0 - 33278, var3, var2, 1, false);
            }
            class158.field3500 = 0;
            class88.field2220 = class81.field2005;
            class18.field364 = 2;
            class157.field3416 = class3.field68;
            class125.field2842.method1072(0, -1);
            class125.field2842.method1206(var2 + class68.field1756, true);
            class125.field2842.method1165(122, class89.field2229 + var3);
            class125.field2842.method1203((byte) 99, var5);
        }
        if (var4 == 32) {
            class86.field2152++;
            class125.field2842.method1072(223, -1);
            class125.field2842.method1165(arg0 ^ 0x1F97, var3);
            class125.field2842.method1203((byte) -108, var5);
            class125.field2842.method1195(var2, arg0 - 7255);
            class46.field1157 = 0;
            class147.field3199 = class134.method1032(var2, 499749840);
            class82.field2043 = var3;
        }
        if (var4 == 22) {
            class3.method12(var2, var5, (byte) 51, var3);
            class17.field334++;
            class125.field2842.method1072(51, -1);
            class125.field2842.method1165(26, class68.field1756 + var2);
            class125.field2842.method1191(var3 + class89.field2229, -1806027672);
            class125.field2842.method1206(var5 >> 14 & 0x7FFF, true);
        }
        if (var4 == 13) {
            class3.method12(var2, var5, (byte) -107, var3);
            class24.field590++;
            class125.field2842.method1072(57, -1);
            class125.field2842.method1165(52, var5 >> 14 & 0x7FFF);
            class125.field2842.method1206(class68.field1756 + var2, true);
            class125.field2842.method1165(20, class89.field2229 + var3);
        }
        if (var4 == 1003) {
            class68.field1701++;
            class3.method12(var2, var5, (byte) 79, var3);
            class125.field2842.method1072(135, -1);
            class125.field2842.method1203((byte) 41, class68.field1756 + var2);
            class125.field2842.method1206(var5 >> 14 & 0x7FFF, true);
            class125.field2842.method1206(class89.field2229 + var3, true);
        }
        if (var4 == 46) {
            class90 var26 = class47.field1210[var5];
            if (var26 != null) {
                class121.method945(0, 0, class159.field3650.field1719[0], 2, class159.field3650.field1704[0], 0, 1, -25171, var26.field1719[0], var26.field1704[0], 1, false);
                class41.field1051++;
                class158.field3500 = 0;
                class157.field3416 = class3.field68;
                class88.field2220 = class81.field2005;
                class18.field364 = 2;
                class125.field2842.method1072(115, -1);
                class125.field2842.method1206(var5, true);
            }
        }
        if (var4 == 3) {
            class125.field2842.method1072(172, -1);
            class125.field2842.method1198(var2, 99);
            class125.field2842.method1165(34, var5);
            class108.field2613++;
            class125.field2842.method1203((byte) -90, var3);
            class46.field1157 = 0;
            class147.field3199 = class134.method1032(var2, 499749840);
            class82.field2043 = var3;
        }
        if (var4 == 1005) {
            class157.field3416 = class3.field68;
            class88.field2220 = class81.field2005;
            class18.field364 = 2;
            class158.field3500 = 0;
            class34.field899++;
            class125.field2842.method1072(95, arg0 ^ 0xFFFFE054);
            class125.field2842.method1203((byte) 37, var5);
        }
        if (var4 == 10) {
            class57.method418((byte) -105);
        }
        if (var4 == 39) {
            class90 var27 = class47.field1210[var5];
            if (var27 != null) {
                class121.method945(0, 0, class159.field3650.field1719[0], 2, class159.field3650.field1704[0], 0, 1, -25171, var27.field1719[0], var27.field1704[0], 1, false);
                class157.field3416 = class3.field68;
                class18.field364 = 2;
                class158.field3500 = 0;
                class88.field2220 = class81.field2005;
                class125.field2842.method1072(88, -1);
                class125.field2842.method1203((byte) 53, var5);
                class8.field160++;
            }
        }
        if (var4 == 11) {
            class90 var28 = class47.field1210[var5];
            if (var28 != null) {
                class121.method945(0, 0, class159.field3650.field1719[0], 2, class159.field3650.field1704[0], 0, 1, -25171, var28.field1719[0], var28.field1704[0], 1, false);
                class157.field3416 = class3.field68;
                class142.field3125++;
                class18.field364 = 2;
                class88.field2220 = class81.field2005;
                class158.field3500 = 0;
                class125.field2842.method1072(5, -1);
                class125.field2842.method1203((byte) -112, var5);
            }
        }
        if (var4 == 37) {
            class125.field2842.method1072(244, -1);
            class6.field128++;
            class125.field2842.method1191(class149.field3267, -1806027672);
            class125.field2842.method1163(var2, (byte) 88);
            class125.field2842.method1198(class2.field37, -35);
            class125.field2842.method1165(96, var5);
            class125.field2842.method1165(71, var3);
            class46.field1157 = 0;
            class147.field3199 = class134.method1032(var2, 499749840);
            class82.field2043 = var3;
        }
        if (var4 == 43) {
            class49 var29 = class91.field2323[var5];
            if (var29 != null) {
                class112.field2691++;
                class121.method945(0, 0, class159.field3650.field1719[0], 2, class159.field3650.field1704[0], 0, 1, arg0 - 33278, var29.field1719[0], var29.field1704[0], 1, false);
                class158.field3500 = 0;
                class88.field2220 = class81.field2005;
                class18.field364 = 2;
                class157.field3416 = class3.field68;
                class125.field2842.method1072(9, -1);
                class125.field2842.method1206(var5, true);
            }
        }
        if (var4 == 4) {
            class40.field1027++;
            class3.method12(var2, var5, (byte) 98, var3);
            class125.field2842.method1072(210, -1);
            class125.field2842.method1191(class89.field2229 + var3, -1806027672);
            class125.field2842.method1203((byte) 114, var5 >> 14 & 0x7FFF);
            class125.field2842.method1206(class68.field1756 + var2, true);
        }
        if (var4 == 20) {
            class114.field2697++;
            boolean var30 = class121.method945(0, 0, class159.field3650.field1719[0], 2, class159.field3650.field1704[0], 0, 0, -25171, var3, var2, 0, false);
            if (!var30) {
                class121.method945(0, 0, class159.field3650.field1719[0], 2, class159.field3650.field1704[0], 0, 1, -25171, var3, var2, 1, false);
            }
            class157.field3416 = class3.field68;
            class88.field2220 = class81.field2005;
            class18.field364 = 2;
            class158.field3500 = 0;
            class125.field2842.method1072(237, -1);
            class125.field2842.method1206(class89.field2229 + var3, true);
            class125.field2842.method1165(56, var2 + class68.field1756);
            class125.field2842.method1206(var5, true);
        }
        if (var4 == 28) {
            class53.field1316++;
            class125.field2842.method1072(112, arg0 - 8108);
            class125.field2842.method1191(var3, -1806027672);
            class125.field2842.method1189(-8104, var2);
            class125.field2842.method1206(var5, true);
            class125.field2842.method1206(class25.field624, true);
            class125.field2842.method1195(class143.field3132, arg0 - 7255);
            class125.field2842.method1206(class2.field41, true);
            class46.field1157 = 0;
            class147.field3199 = class134.method1032(var2, 499749840);
            class82.field2043 = var3;
        }
        if (var4 == 31) {
            class90 var32 = class47.field1210[var5];
            if (var32 != null) {
                class121.method945(0, 0, class159.field3650.field1719[0], 2, class159.field3650.field1704[0], 0, 1, -25171, var32.field1719[0], var32.field1704[0], 1, false);
                class88.field2220 = class81.field2005;
                class118.field2750++;
                class158.field3500 = 0;
                class157.field3416 = class3.field68;
                class18.field364 = 2;
                class125.field2842.method1072(235, arg0 - 8108);
                class125.field2842.method1206(var5, true);
            }
        }
        if (var4 == 23) {
            class90 var33 = class47.field1210[var5];
            if (var33 != null) {
                class121.method945(0, 0, class159.field3650.field1719[0], 2, class159.field3650.field1704[0], 0, 1, -25171, var33.field1719[0], var33.field1704[0], 1, false);
                class158.field3500 = 0;
                class157.field3416 = class3.field68;
                class61.field1540++;
                class18.field364 = 2;
                class88.field2220 = class81.field2005;
                class125.field2842.method1072(137, -1);
                class125.field2842.method1165(39, var5);
            }
        }
        if (var4 == 40) {
            class159 var34 = class134.method1032(var2, 499749840);
            boolean var35 = true;
            if (var34.field3610 > 0) {
                var35 = class148.method1096(var34, (byte) -64);
            }
            if (var35) {
                class125.field2842.method1072(158, -1);
                class136.field3032++;
                class125.field2842.method1195(var2, 852);
            }
        }
        if (var4 == 16) {
            class120.field2774++;
            class125.field2842.method1072(37, -1);
            class125.field2842.method1195(var2, 852);
            class125.field2842.method1165(arg0 ^ 0x1FDF, var5);
            class125.field2842.method1203((byte) 29, var3);
            class46.field1157 = 0;
            class147.field3199 = class134.method1032(var2, arg0 + 499741733);
            class82.field2043 = var3;
        }
        if (var4 == 38 && class3.method12(var2, var5, (byte) -102, var3)) {
            class125.field2842.method1072(200, -1);
            class125.field2842.method1206(class25.field624, true);
            class125.field2842.method1165(58, class2.field41);
            class125.field2842.method1165(78, var2 + class68.field1756);
            class70.field1782++;
            class125.field2842.method1191(var3 + class89.field2229, arg0 + -1806035779);
            class125.field2842.method1206(var5 >> 14 & 0x7FFF, true);
            class125.field2842.method1198(class143.field3132, 99);
        }
        if (var4 == 36) {
            class49 var36 = class91.field2323[var5];
            if (var36 != null) {
                class121.method945(0, 0, class159.field3650.field1719[0], 2, class159.field3650.field1704[0], 0, 1, -25171, var36.field1719[0], var36.field1704[0], 1, false);
                class23.field560++;
                class157.field3416 = class3.field68;
                class158.field3500 = 0;
                class88.field2220 = class81.field2005;
                class18.field364 = 2;
                class125.field2842.method1072(24, -1);
                class125.field2842.method1191(var5, -1806027672);
            }
        }
        if (var4 == 2) {
            class49 var37 = class91.field2323[var5];
            if (var37 != null) {
                class121.method945(0, 0, class159.field3650.field1719[0], 2, class159.field3650.field1704[0], 0, 1, -25171, var37.field1719[0], var37.field1704[0], 1, false);
                class18.field364 = 2;
                class80.field1989++;
                class157.field3416 = class3.field68;
                class88.field2220 = class81.field2005;
                class158.field3500 = 0;
                class125.field2842.method1072(153, arg0 ^ 0xFFFFE054);
                class125.field2842.method1206(var5, true);
                class125.field2842.method1195(class2.field37, arg0 - 7255);
                class125.field2842.method1206(class149.field3267, true);
            }
        }
        if (var4 == 26) {
            class90 var38 = class47.field1210[var5];
            if (var38 != null) {
                class86.field2168++;
                class121.method945(0, 0, class159.field3650.field1719[0], 2, class159.field3650.field1704[0], 0, 1, arg0 ^ 0xFFFF8206, var38.field1719[0], var38.field1704[0], 1, false);
                class18.field364 = 2;
                class158.field3500 = 0;
                class157.field3416 = class3.field68;
                class88.field2220 = class81.field2005;
                class125.field2842.method1072(133, -1);
                class125.field2842.method1203((byte) -76, class149.field3267);
                class125.field2842.method1189(arg0 ^ 0xFFFFFFF3, class2.field37);
                class125.field2842.method1206(var5, true);
            }
        }
        if (var4 == 19) {
            class49 var39 = class91.field2323[var5];
            if (var39 != null) {
                class121.method945(0, 0, class159.field3650.field1719[0], 2, class159.field3650.field1704[0], 0, 1, -25171, var39.field1719[0], var39.field1704[0], 1, false);
                class18.field364 = 2;
                class158.field3500 = 0;
                class34.field902++;
                class157.field3416 = class3.field68;
                class88.field2220 = class81.field2005;
                class125.field2842.method1072(161, -1);
                class125.field2842.method1165(126, var5);
                class125.field2842.method1195(class143.field3132, 852);
                class125.field2842.method1191(class2.field41, -1806027672);
                class125.field2842.method1203((byte) 100, class25.field624);
            }
        }
        if (var4 == 42) {
            class125.field2842.method1072(151, -1);
            class88.field2227++;
            class125.field2842.method1163(var2, (byte) 88);
            class125.field2842.method1191(var3, arg0 - 1806035779);
            class125.field2842.method1191(var5, -1806027672);
            class46.field1157 = 0;
            class147.field3199 = class134.method1032(var2, 499749840);
            class82.field2043 = var3;
        }
        if (var4 == 8) {
            class125.field2842.method1072(70, arg0 ^ 0xFFFFE054);
            class33.field881++;
            class125.field2842.method1203((byte) 115, var5);
            class125.field2842.method1189(-8104, var2);
            class125.field2842.method1165(25, var3);
            class46.field1157 = 0;
            class147.field3199 = class134.method1032(var2, 499749840);
            class82.field2043 = var3;
        }
        if (var4 == 1) {
            class47.field1203++;
            class125.field2842.method1072(47, -1);
            class125.field2842.method1206(var3, true);
            class125.field2842.method1163(var2, (byte) 88);
            class125.field2842.method1191(var5, -1806027672);
            class46.field1157 = 0;
            class147.field3199 = class134.method1032(var2, 499749840);
            class82.field2043 = var3;
        }
        if (var4 == 1001) {
            class157.field3416 = class3.field68;
            class18.field364 = 2;
            class158.field3500 = 0;
            class88.field2220 = class81.field2005;
            class90 var40 = class47.field1210[var5];
            if (var40 != null) {
                class125 var41 = var40.field2276;
                if (var41.field2815 != null) {
                    var41 = var41.method954(200);
                }
                if (var41 != null) {
                    class145.field3170++;
                    class125.field2842.method1072(168, arg0 ^ 0xFFFFE054);
                    class125.field2842.method1191(var41.field2801, -1806027672);
                }
            }
        }
        if (var4 == 18) {
            class49 var42 = class91.field2323[var5];
            if (var42 != null) {
                class121.method945(0, 0, class159.field3650.field1719[0], 2, class159.field3650.field1704[0], 0, 1, -25171, var42.field1719[0], var42.field1704[0], 1, false);
                class158.field3500 = 0;
                class18.field364 = 2;
                class88.field2220 = class81.field2005;
                class99.field2452++;
                class157.field3416 = class3.field68;
                class125.field2842.method1072(202, -1);
                class125.field2842.method1191(var5, arg0 - 1806035779);
            }
        }
        if (var4 == 1007) {
            class159 var43 = class134.method1032(var2, arg0 + 499741733);
            if (var43 == null || var43.field3559[var3] < 100000) {
                class125.field2842.method1072(95, -1);
                class34.field899++;
                class125.field2842.method1203((byte) 52, var5);
            } else {
                class127.method972(class46.method358(new class59[] { class46.method361(var43.field3559[var3], -99), class102.field2495, class7.method39(30996, var5).field1936 }, (byte) -75), class38.field1000, 0, arg0 ^ 0x7A09);
            }
            class46.field1157 = 0;
            class147.field3199 = class134.method1032(var2, 499749840);
            class82.field2043 = var3;
        }
        if (var4 == 50) {
            class49 var44 = class91.field2323[var5];
            if (var44 != null) {
                class55.field1347++;
                class121.method945(0, 0, class159.field3650.field1719[0], 2, class159.field3650.field1704[0], 0, 1, arg0 - 33278, var44.field1719[0], var44.field1704[0], 1, false);
                class158.field3500 = 0;
                class88.field2220 = class81.field2005;
                class157.field3416 = class3.field68;
                class18.field364 = 2;
                class125.field2842.method1072(25, -1);
                class125.field2842.method1203((byte) -104, var5);
            }
        }
        if (var4 == 1002) {
            class158.field3500 = 0;
            class88.field2220 = class81.field2005;
            class46.field1183++;
            class18.field364 = 2;
            class157.field3416 = class3.field68;
            class125.field2842.method1072(194, -1);
            class125.field2842.method1191(var5 >> 14 & 0x7FFF, -1806027672);
        }
        if (var4 == 33) {
            class136.field3032++;
            class125.field2842.method1072(158, arg0 ^ 0xFFFFE054);
            class125.field2842.method1195(var2, 852);
            class159 var45 = class134.method1032(var2, arg0 ^ 0x1DC98C7B);
            if (var45.field3554 != null && var45.field3554[0][0] == 5) {
                int var46 = var45.field3554[0][1];
                if (class85.field2124[var46] != var45.field3636[0]) {
                    class85.field2124[var46] = var45.field3636[0];
                    class17.method89(var46, 0);
                }
            }
        }
        if (var4 == 58) {
            class49 var47 = class91.field2323[var5];
            if (var47 != null) {
                class121.method945(0, 0, class159.field3650.field1719[0], 2, class159.field3650.field1704[0], 0, 1, -25171, var47.field1719[0], var47.field1704[0], 1, false);
                class158.field3500 = 0;
                class88.field2220 = class81.field2005;
                class63.field1613++;
                class18.field364 = 2;
                class157.field3416 = class3.field68;
                class125.field2842.method1072(187, arg0 ^ 0xFFFFE054);
                class125.field2842.method1203((byte) 35, var5);
            }
        }
        if (class96.field2426 != 0) {
            class96.field2426 = 0;
            class42.method320(false, class134.method1032(class143.field3132, arg0 + 499741733));
        }
        if (class34.field907) {
            class73.method600(false);
        }
        if (class147.field3199 != null && class46.field1157 == 0) {
            class42.method320(false, class147.field3199);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIILdd;)[Lce;")
    public static final class20[] method238(int arg0, int arg1, int arg2, class26 arg3) {
        field786++;
        if (arg1 == 0) {
            return class159.method1234(arg0, -65536, arg2, arg3) ? class38.method290(0) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILwf;B)Lic;")
    public static final class59 method239(int arg0, class159 arg1, byte arg2) {
        field780++;
        if (arg2 > -28) {
            return null;
        } else if (!class143.method1065(class112.method915(arg1, -2042430560), arg0, -2206) && arg1.field3564 == null) {
            return null;
        } else if (arg1.field3662 == null || arg1.field3662.length <= arg0 || arg1.field3662[arg0] == null || arg1.field3662[arg0].method429(-126).method437((byte) 52) == 0) {
            return class35.field925 ? class46.method358(new class59[] { class46.field1154, class46.method361(arg0, 66) }, (byte) -75) : null;
        } else {
            return arg1.field3662[arg0];
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IZ)V")
    public static final void method240(int arg0, boolean arg1) {
        field779++;
        for (int var2 = arg0; var2 < class103.field2510; var2++) {
            class90 var3 = class47.field1210[class53.field1309[var2]];
            int var4 = (class53.field1309[var2] << 14) + 536870912;
            if (var3 != null && var3.method380(arg0 ^ 0x2) && arg1 == var3.field2276.field2813 && var3.field2276.method955((byte) -42)) {
                int var5 = var3.field1730 >> 7;
                int var6 = var3.field1751 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field1712 == 1 && (var3.field1730 & 0x7F) == 64 && (var3.field1751 & 0x7F) == 64) {
                        if (class54.field1327[var5][var6] == class51.field1280) {
                            continue;
                        }
                        class54.field1327[var5][var6] = class51.field1280;
                    }
                    if (!var3.field2276.field2836) {
                        var4 += Integer.MIN_VALUE;
                    }
                    class3.field58.method898(class44.field1127, var3.field1730, var3.field1751, class147.method1095((byte) 30, (var3.field1712 - 1) * 64 + var3.field1751, class44.field1127, var3.field1712 * 64 + var3.field1730 - 64), (var3.field1712 - 1) * 64 + 60, var3, var3.field1724, var4, var3.field1708);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V")
    public static void method241(int arg0) {
        field778 = null;
        field773 = null;
        field776 = null;
        field772 = null;
        field775 = null;
        field784 = null;
        if (arg0 > -92) {
            method241(107);
        }
        field785 = null;
        field774 = null;
        field770 = null;
        field783 = null;
    }
}
