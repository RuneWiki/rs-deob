import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class38 {

    @OriginalMember(owner = "client!fe", name = "r", descriptor = "I")
    public int field873 = -1;

    @OriginalMember(owner = "client!fe", name = "k", descriptor = "Lae;")
    private static class6 field866 = class64.method474(121, " has logged out)3");

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "Lae;")
    public static class6 field864 = class64.method474(125, "Benutzen Sie bitte eine andere Welt)3");

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "Lae;")
    public static class6 field865 = class64.method474(118, "cross");

    @OriginalMember(owner = "client!fe", name = "q", descriptor = "Lae;")
    public static class6 field872 = class64.method474(124, "Ung-Ultige Session)2ID)3");

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "Lae;")
    public static class6 field859 = class64.method474(115, "Lade Freunde)2Liste)3)3)3");

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "Lae;")
    public static class6 field863 = class64.method474(110, "Lade Wordpack )2 ");

    @OriginalMember(owner = "client!fe", name = "n", descriptor = "[I")
    public static int[] field869 = new int[5];

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "Lae;")
    public static class6 field861 = field866;

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "Lae;")
    public static class6 field862 = class64.method474(125, "(U1");

    @OriginalMember(owner = "client!fe", name = "m", descriptor = "I")
    public static int field868 = 0;

    @OriginalMember(owner = "client!fe", name = "v", descriptor = "[[I")
    public static int[][] field877 = new int[104][104];

    @OriginalMember(owner = "client!fe", name = "w", descriptor = "Lae;")
    public static class6 field878 = class64.method474(107, "(Z");

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
    public static int field858;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!fe", name = "l", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!fe", name = "s", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!fe", name = "t", descriptor = "I")
    public static int field875;

    @OriginalMember(owner = "client!fe", name = "u", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!fe", name = "p", descriptor = "Lee;")
    public class32 field871;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "Lac;")
    public static class3 field856;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "[I")
    public int[] field857;

    @OriginalMember(owner = "client!fe", name = "o", descriptor = "[Lae;")
    public class6[] field870;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V", line = 3)
    public static final void method329(int arg0) {
        field867++;
        if (arg0 != -33) {
            return;
        }
        class138.field3361.method435((byte) -111);
        for (int var1 = 0; var1 < 32; var1++) {
            class78.field1878[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class137.field3327[var2] = 0L;
        }
        class5.field64 = 0;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ZLbf;Lbf;I)V", line = 30)
    public static final void method330(boolean arg0, class14 arg1, class14 arg2, int arg3) {
        if (arg3 != 64) {
            method329(34);
        }
        class95.field2246 = arg2;
        class73.field1655 = arg0;
        field860++;
        class2.field10 = arg1;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Z)V", line = 44)
    public static final void method331(boolean arg0) {
        class35.field819.method129(27392);
        if (arg0) {
            method332(41, 8);
        }
        class5.field72.method129(27392);
        class95.field2244.method129(27392);
        field874++;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)V", line = 57)
    public static final void method332(int arg0, int arg1) {
        field858++;
        if (arg0 < 0) {
            return;
        }
        int var2 = class16.field329[arg0];
        int var3 = class79.field1929[arg0];
        int var4 = class61.field1333[arg0];
        if (var4 >= 2000) {
            var4 -= 2000;
        }
        int var5 = class15.field303[arg0];
        if (class76.field1765 != 0 && var4 != 1002) {
            class20.field427 = true;
            class76.field1765 = 0;
        }
        if (var4 == 32) {
            class111.field2660.method938((byte) 63, 182);
            class102.field2386++;
            class111.field2660.method622(var5, (byte) 69);
            class111.field2660.method667((byte) 97, var2);
            class111.field2660.method625(var3, -242288600);
            class50.field1116 = var2;
            class130.field3154 = var3;
            class40.field886 = 2;
            class49.field1098 = 0;
            if (var3 >> 16 == class103.field2449) {
                class40.field886 = 1;
            }
            if (var3 >> 16 == class102.field2410) {
                class40.field886 = 3;
            }
        }
        if (var4 == 1005) {
            class72.field1646++;
            class2.method12(var5, var2, false, var3);
            class111.field2660.method938((byte) 63, 120);
            class111.field2660.method667((byte) 97, class61.field1329 + var3);
            class111.field2660.method667((byte) 97, class130.field3164 + var2);
            class111.field2660.method667((byte) 97, var5 >> 14 & 0x7FFF);
        }
        if (var4 == 12 && class2.method12(var5, var2, false, var3)) {
            class67.field1485++;
            class111.field2660.method938((byte) 63, 78);
            class111.field2660.method663(class70.field1561, -334352184);
            class111.field2660.method667((byte) 97, var2 + class130.field3164);
            class111.field2660.method667((byte) 97, class59.field1302);
            class111.field2660.method622(class61.field1329 + var3, (byte) 92);
            class111.field2660.method668(var5 >> 14 & 0x7FFF, (byte) -30);
        }
        if (var4 == 8 && class96.field2272 == -1) {
            class116.method955((byte) 4, var2, var3);
            class6.field105 = var2;
            class96.field2272 = var3;
        }
        if (var4 == 40) {
            class92.field2197++;
            boolean var6 = class43.method358(arg1 ^ 0x5E47, 0, var3, 0, 2, 0, 0, false, 0, class12.field229.field1796[0], class12.field229.field1726[0], var2);
            if (!var6) {
                class43.method358(24134, 0, var3, 0, 2, 1, 1, false, 0, class12.field229.field1796[0], class12.field229.field1726[0], var2);
            }
            class7.field161 = 2;
            class43.field1003 = 0;
            class75.field1687 = class116.field2728;
            class35.field827 = class52.field1170;
            class111.field2660.method938((byte) 63, 149);
            class111.field2660.method632(-21994, class130.field3164 + var2);
            class111.field2660.method632(-21994, class61.field1329 + var3);
            class111.field2660.method667((byte) 97, var5);
        }
        if (var4 == 31 || var4 == 21 || var4 == 2 || var4 == 50) {
            class6 var8 = class57.field1247[arg0];
            int var9 = var8.method51(22938, class42.field959);
            if (var9 != -1) {
                long var10 = var8.method56(-58, var9 + 5).method40((byte) -45).method43((byte) -56);
                if (var4 == 31) {
                    class135.method1101(arg1 - 1, var10);
                }
                if (var4 == 21) {
                    class130.method1054(0, var10);
                }
                if (var4 == 2) {
                    class27.method245(var10, (byte) -123);
                }
                if (var4 == 50) {
                    class30.method268(var10, (byte) -97);
                }
            }
        }
        if (var4 == 38) {
            class4.field48++;
            boolean var12 = class43.method358(24134, 0, var3, 0, 2, 0, 0, false, 0, class12.field229.field1796[0], class12.field229.field1726[0], var2);
            if (!var12) {
                class43.method358(24134, 0, var3, 0, 2, 1, 1, false, 0, class12.field229.field1796[0], class12.field229.field1726[0], var2);
            }
            class7.field161 = 2;
            class75.field1687 = class116.field2728;
            class35.field827 = class52.field1170;
            class43.field1003 = 0;
            class111.field2660.method938((byte) 63, 252);
            class111.field2660.method632(arg1 - 21995, var5);
            class111.field2660.method632(-21994, class130.field3164 + var2);
            class111.field2660.method632(arg1 ^ 0xFFFFAA17, class61.field1329 + var3);
        }
        if (var4 == 28) {
            class111.field2660.method938((byte) 63, 0);
            class90.field2155++;
            class111.field2660.method622(var2, (byte) 44);
            class111.field2660.method667((byte) 97, var5);
            class111.field2660.method625(var3, -242288600);
            class49.field1098 = 0;
            class130.field3154 = var3;
            class50.field1116 = var2;
            class40.field886 = 2;
            if (var3 >> 16 == class103.field2449) {
                class40.field886 = 1;
            }
            if (var3 >> 16 == class102.field2410) {
                class40.field886 = 3;
            }
        }
        if (var4 == 35) {
            class70.field1546++;
            class111.field2660.method938((byte) 63, 144);
            class111.field2660.method632(-21994, var2);
            class111.field2660.method644(var3, (byte) 38);
            class111.field2660.method622(var5, (byte) 85);
            class50.field1116 = var2;
            class49.field1098 = 0;
            class130.field3154 = var3;
            class40.field886 = 2;
            if (var3 >> 16 == class103.field2449) {
                class40.field886 = 1;
            }
            if (var3 >> 16 == class102.field2410) {
                class40.field886 = 3;
            }
        }
        if (var4 == 14) {
            class121 var14 = class75.method602(var3, var2, 0);
            if (var14 != null) {
                class76.method608((byte) 39);
                class40.method335(var14.method977((byte) -19), var2, var3, true);
                class139.field3380 = true;
                class19.field382 = 0;
                client.field472 = var14.method988(class30.field717, 64);
                if (client.field472 == null) {
                    client.field472 = class70.field1557;
                }
                if (var14.field2870) {
                    class20.field395 = class85.method731(new class6[] { var14.field2937, class42.field959 }, arg1 + 14568);
                } else {
                    class20.field395 = class85.method731(new class6[] { class70.field1575, var14.field2938, class42.field959 }, arg1 + 14568);
                }
                if (class70.field1562 == 16 && !var14.field2870) {
                    class68.field1493 = 3;
                    class117.field2768 = true;
                    class139.field3380 = true;
                }
            }
            return;
        }
        if (var4 == 42) {
            class2 var15 = class49.field1097[var5];
            if (var15 != null) {
                class43.method358(arg1 + 24133, 0, var15.field1726[0], 0, 2, 1, 1, false, 0, class12.field229.field1796[0], class12.field229.field1726[0], var15.field1796[0]);
                class7.field161 = 2;
                class62.field1359++;
                class75.field1687 = class116.field2728;
                class43.field1003 = 0;
                class35.field827 = class52.field1170;
                class111.field2660.method938((byte) 63, 154);
                class111.field2660.method667((byte) 97, var5);
            }
        }
        if (var4 == 47) {
            class2 var16 = class49.field1097[var5];
            if (var16 != null) {
                class43.method358(24134, 0, var16.field1726[0], 0, 2, 1, 1, false, 0, class12.field229.field1796[0], class12.field229.field1726[0], var16.field1796[0]);
                class75.field1687 = class116.field2728;
                class35.field827 = class52.field1170;
                class121.field2981++;
                class43.field1003 = 0;
                class7.field161 = 2;
                class111.field2660.method938((byte) 63, 146);
                class111.field2660.method655(class96.field2284, -1);
                class111.field2660.method667((byte) 97, class123.field3036);
                class111.field2660.method667((byte) 97, class37.field845);
                class111.field2660.method632(-21994, var5);
            }
        }
        if (var4 == 53) {
            class2 var17 = class49.field1097[var5];
            if (var17 != null) {
                class43.method358(24134, 0, var17.field1726[0], 0, 2, 1, 1, false, 0, class12.field229.field1796[0], class12.field229.field1726[0], var17.field1796[0]);
                class43.field1003 = 0;
                class7.field161 = 2;
                class75.field1687 = class116.field2728;
                class12.field235++;
                class35.field827 = class52.field1170;
                class111.field2660.method938((byte) 63, 222);
                class111.field2660.method632(arg1 - 21995, var5);
            }
        }
        if (var4 == 4) {
            class12.field230++;
            boolean var18 = class43.method358(arg1 + 24133, 0, var3, 0, 2, 0, 0, false, 0, class12.field229.field1796[0], class12.field229.field1726[0], var2);
            if (!var18) {
                class43.method358(24134, 0, var3, 0, 2, 1, 1, false, 0, class12.field229.field1796[0], class12.field229.field1726[0], var2);
            }
            class7.field161 = 2;
            class75.field1687 = class116.field2728;
            class43.field1003 = 0;
            class35.field827 = class52.field1170;
            class111.field2660.method938((byte) 63, 114);
            class111.field2660.method622(class123.field3036, (byte) 32);
            class111.field2660.method668(var3 + class61.field1329, (byte) -30);
            class111.field2660.method644(class96.field2284, (byte) 38);
            class111.field2660.method668(class130.field3164 + var2, (byte) -30);
            class111.field2660.method622(var5, (byte) 118);
            class111.field2660.method632(-21994, class37.field845);
        }
        if (var4 == 49) {
            class111.field2660.method938((byte) 63, 171);
            class72.field1644++;
            class111.field2660.method668(var2, (byte) -30);
            class111.field2660.method644(var3, (byte) 38);
            class111.field2660.method622(var5, (byte) 76);
            class130.field3154 = var3;
            class40.field886 = 2;
            class49.field1098 = 0;
            class50.field1116 = var2;
            if (var3 >> 16 == class103.field2449) {
                class40.field886 = 1;
            }
            if (var3 >> 16 == class102.field2410) {
                class40.field886 = 3;
            }
        }
        if (var4 == 26) {
            class30.field726++;
            class111.field2660.method938((byte) 63, 188);
            class111.field2660.method632(-21994, var2);
            class111.field2660.method632(-21994, var5);
            class111.field2660.method655(var3, -1);
            class50.field1116 = var2;
            class40.field886 = 2;
            if (var3 >> 16 == class103.field2449) {
                class40.field886 = 1;
            }
            if (var3 >> 16 == class102.field2410) {
                class40.field886 = 3;
            }
            class130.field3154 = var3;
            class49.field1098 = 0;
        }
        if (var4 == 11) {
            class114.field2693++;
            boolean var20 = class43.method358(arg1 ^ 0x5E47, 0, var3, 0, 2, 0, 0, false, 0, class12.field229.field1796[0], class12.field229.field1726[0], var2);
            if (!var20) {
                class43.method358(24134, 0, var3, 0, 2, 1, 1, false, 0, class12.field229.field1796[0], class12.field229.field1726[0], var2);
            }
            class43.field1003 = 0;
            class75.field1687 = class116.field2728;
            class35.field827 = class52.field1170;
            class7.field161 = 2;
            class111.field2660.method938((byte) 63, 38);
            class111.field2660.method622(var5, (byte) 80);
            class111.field2660.method668(class61.field1329 + var3, (byte) -30);
            class111.field2660.method667((byte) 97, class130.field3164 + var2);
        }
        if (var4 == 43) {
            class18.field346++;
            class2.method12(var5, var2, false, var3);
            class111.field2660.method938((byte) 63, 69);
            class111.field2660.method622(var5 >> 14 & 0x7FFF, (byte) 106);
            class111.field2660.method667((byte) 97, var3 + class61.field1329);
            class111.field2660.method667((byte) 97, class130.field3164 + var2);
        }
        if (var4 == 48) {
            class2 var22 = class49.field1097[var5];
            if (var22 != null) {
                class138.field3345++;
                class43.method358(arg1 + 24133, 0, var22.field1726[0], 0, 2, 1, 1, false, 0, class12.field229.field1796[0], class12.field229.field1726[0], var22.field1796[0]);
                class35.field827 = class52.field1170;
                class43.field1003 = 0;
                class75.field1687 = class116.field2728;
                class7.field161 = 2;
                class111.field2660.method938((byte) 63, 200);
                class111.field2660.method622(class59.field1302, (byte) 55);
                class111.field2660.method625(class70.field1561, -242288600);
                class111.field2660.method667((byte) 97, var5);
            }
        }
        if (var4 == 58) {
            class66 var23 = class20.field387[var5];
            if (var23 != null) {
                class43.method358(24134, 0, var23.field1726[0], 0, 2, 1, 1, false, 0, class12.field229.field1796[0], class12.field229.field1726[0], var23.field1796[0]);
                class75.field1687 = class116.field2728;
                class43.field1003 = 0;
                class35.field827 = class52.field1170;
                class121.field2896++;
                class7.field161 = 2;
                class111.field2660.method938((byte) 63, 104);
                class111.field2660.method663(class96.field2284, -334352184);
                class111.field2660.method632(arg1 ^ 0xFFFFAA17, class37.field845);
                class111.field2660.method622(var5, (byte) 85);
                class111.field2660.method632(arg1 ^ 0xFFFFAA17, class123.field3036);
            }
        }
        if (var4 == 45 && class2.method12(var5, var2, false, var3)) {
            class134.field3265++;
            class111.field2660.method938((byte) 63, 195);
            class111.field2660.method632(arg1 - 21995, var3 - -class61.field1329);
            class111.field2660.method622(var5 >> 14 & 0x7FFF, (byte) 60);
            class111.field2660.method668(class123.field3036, (byte) -30);
            class111.field2660.method622(class37.field845, (byte) 115);
            class111.field2660.method632(arg1 - 21995, var2 - -class130.field3164);
            class111.field2660.method625(class96.field2284, -242288600);
        }
        if (var4 == 1004) {
            class121 var24 = class67.method490((byte) 30, var3);
            if (var24 == null || var24.field2946[var2] < 100000) {
                class34.field814++;
                class111.field2660.method938((byte) 63, 219);
                class111.field2660.method668(var5, (byte) -30);
            } else {
                class73.method575(class133.field3262, class85.method731(new class6[] { class114.method942((byte) 71, var24.field2946[var2]), class54.field1200, class43.method356(arg1 ^ 0xFFFFFF9C, var5).field549 }, 14569), false, 0);
            }
            class50.field1116 = var2;
            class40.field886 = 2;
            if (var3 >> 16 == class103.field2449) {
                class40.field886 = 1;
            }
            if (var3 >> 16 == class102.field2410) {
                class40.field886 = 3;
            }
            class130.field3154 = var3;
            class49.field1098 = 0;
        }
        if (var4 == 25) {
            class111.field2660.method938((byte) 63, 221);
            class111.field2660.method663(var3, -334352184);
            class118.field2799++;
            class111.field2660.method632(-21994, var2);
            class111.field2660.method667((byte) 97, var5);
            class130.field3154 = var3;
            class40.field886 = 2;
            class49.field1098 = 0;
            class50.field1116 = var2;
            if (var3 >> 16 == class103.field2449) {
                class40.field886 = 1;
            }
            if (var3 >> 16 == class102.field2410) {
                class40.field886 = 3;
            }
        }
        if (var4 == 6) {
            class87.field2087++;
            class2.method12(var5, var2, false, var3);
            class111.field2660.method938((byte) 63, 202);
            class111.field2660.method667((byte) 97, var5 >> 14 & 0x7FFF);
            class111.field2660.method668(class130.field3164 + var2, (byte) -30);
            class111.field2660.method632(arg1 ^ 0xFFFFAA17, class61.field1329 + var3);
        }
        if (var4 == 19) {
            class111.field2660.method938((byte) 63, 178);
            class90.field2153++;
            class111.field2660.method632(-21994, var2);
            class111.field2660.method668(var5, (byte) -30);
            class111.field2660.method655(var3, arg1 - 2);
            class40.field886 = 2;
            if (var3 >> 16 == class103.field2449) {
                class40.field886 = 1;
            }
            class49.field1098 = 0;
            if (var3 >> 16 == class102.field2410) {
                class40.field886 = 3;
            }
            class50.field1116 = var2;
            class130.field3154 = var3;
        }
        if (var4 == 33) {
            if (class125.field3052) {
                class81.field1967.method520(var2 - 4, var3 + -4);
            } else {
                class81.field1967.method520(class52.field1170 - 4, class116.field2728 + -4);
            }
        }
        if (var4 == 24) {
            class75.method605((byte) -35, class117.field2776);
            class117.field2776 = -1;
            class20.field427 = true;
        }
        if (var4 == 34) {
            class16.field323++;
            boolean var25 = class43.method358(24134, 0, var3, 0, 2, 0, 0, false, 0, class12.field229.field1796[0], class12.field229.field1726[0], var2);
            if (!var25) {
                class43.method358(arg1 + 24133, 0, var3, 0, 2, 1, 1, false, 0, class12.field229.field1796[0], class12.field229.field1726[0], var2);
            }
            class7.field161 = 2;
            class35.field827 = class52.field1170;
            class43.field1003 = 0;
            class75.field1687 = class116.field2728;
            class111.field2660.method938((byte) 63, 85);
            class111.field2660.method668(var3 + class61.field1329, (byte) -30);
            class111.field2660.method632(arg1 ^ 0xFFFFAA17, class130.field3164 + var2);
            class111.field2660.method632(arg1 ^ 0xFFFFAA17, var5);
        }
        if (var4 == 51) {
            class60.method442(var3, var2, var5, 1);
        }
        if (var4 == 1) {
            class66 var27 = class20.field387[var5];
            if (var27 != null) {
                class43.method358(24134, 0, var27.field1726[0], 0, 2, 1, 1, false, 0, class12.field229.field1796[0], class12.field229.field1726[0], var27.field1796[0]);
                class43.field1003 = 0;
                class75.field1687 = class116.field2728;
                class35.field827 = class52.field1170;
                class7.field161 = 2;
                class111.field2660.method938((byte) 63, 206);
                class117.field2784++;
                class111.field2660.method667((byte) 97, var5);
            }
        }
        if (var4 == 10) {
            class6 var28 = class57.field1247[arg0];
            int var29 = var28.method51(22938, class42.field959);
            if (var29 != -1) {
                long var30 = var28.method56(arg1 - 59, var29 - -5).method40((byte) -45).method43((byte) -56);
                int var32 = -1;
                for (int var33 = 0; var33 < class7.field139; var33++) {
                    if (class109.field2609[var33] == var30) {
                        var32 = var33;
                        break;
                    }
                }
                if (var32 != -1 && class66.field1470[var32] > 0) {
                    class20.field427 = true;
                    class125.field3048 = true;
                    class24.field608 = 3;
                    class76.field1765 = 0;
                    class133.field3247 = class133.field3262;
                    class69.field1526 = class109.field2609[var32];
                    class133.field3242 = class85.method731(new class6[] { class70.field1571, class41.field924[var32] }, 14569);
                }
            }
        }
        if (arg1 != 1) {
            method332(87, -70);
        }
        if (var4 == 36) {
            class111.field2660.method938((byte) 63, 54);
            class111.field2660.method644(var3, (byte) 38);
            class90.field2143++;
            class121 var34 = class67.method490((byte) 29, var3);
            if (var34.field2968 != null && var34.field2968[0][0] == 5) {
                int var35 = var34.field2968[0][1];
                class133.field3245[var35] = 1 - class133.field3245[var35];
                class68.method493(var35, 1);
                class139.field3380 = true;
            }
        }
        if (var4 == 1001) {
            class35.field827 = class52.field1170;
            class43.field1003 = 0;
            class7.field161 = 2;
            class75.field1687 = class116.field2728;
            class2 var36 = class49.field1097[var5];
            if (var36 != null) {
                class100 var37 = var36.field11;
                if (var37.field2361 != null) {
                    var37 = var37.method842(5585);
                }
                if (var37 != null) {
                    class76.field1755++;
                    class111.field2660.method938((byte) 63, 158);
                    class111.field2660.method667((byte) 97, var37.field2357);
                }
            }
        }
        if (var4 == 15 || var4 == 37) {
            class6 var38 = class57.field1247[arg0];
            int var39 = var38.method51(22938, class42.field959);
            if (var39 != -1) {
                class6 var40 = var38.method56(-58, var39 + 5).method40((byte) -45);
                class6 var41 = var40.method52(-32769).method44((byte) -126);
                boolean var42 = false;
                for (int var43 = 0; var43 < class47.field1065; var43++) {
                    class66 var44 = class20.field387[class4.field47[var43]];
                    if (var44 != null && var44.field1456 != null && var44.field1456.method68(var41, -66)) {
                        var42 = true;
                        class43.method358(24134, 0, var44.field1726[0], 0, 2, 1, 1, false, 0, class12.field229.field1796[0], class12.field229.field1726[0], var44.field1796[0]);
                        if (var4 == 15) {
                            class111.field2660.method938((byte) 63, 101);
                            class118.field2797++;
                            class111.field2660.method632(-21994, class4.field47[var43]);
                        }
                        if (var4 == 37) {
                            class111.field2660.method938((byte) 63, 11);
                            class111.field2660.method632(-21994, class4.field47[var43]);
                            class46.field1028++;
                        }
                        break;
                    }
                }
                if (!var42) {
                    class73.method575(class133.field3262, class85.method731(new class6[] { class77.field1852, var41 }, arg1 ^ 0x38E8), false, 0);
                }
            }
        }
        if (var4 == 27) {
            class109.field2608++;
            boolean var45 = class43.method358(arg1 + 24133, 0, var3, 0, 2, 0, 0, false, 0, class12.field229.field1796[0], class12.field229.field1726[0], var2);
            if (!var45) {
                class43.method358(24134, 0, var3, 0, 2, 1, 1, false, 0, class12.field229.field1796[0], class12.field229.field1726[0], var2);
            }
            class43.field1003 = 0;
            class75.field1687 = class116.field2728;
            class35.field827 = class52.field1170;
            class7.field161 = 2;
            class111.field2660.method938((byte) 63, 64);
            class111.field2660.method632(arg1 ^ 0xFFFFAA17, var5);
            class111.field2660.method663(class70.field1561, -334352184);
            class111.field2660.method667((byte) 97, class61.field1329 + var3);
            class111.field2660.method632(arg1 - 21995, class130.field3164 + var2);
            class111.field2660.method632(arg1 ^ 0xFFFFAA17, class59.field1302);
        }
        if (var4 == 16) {
            class111.field2660.method938((byte) 63, 29);
            class78.field1890++;
            class111.field2660.method655(var3, -1);
            class111.field2660.method667((byte) 97, var5);
            class111.field2660.method668(var2, (byte) -30);
            class40.field886 = 2;
            class50.field1116 = var2;
            class49.field1098 = 0;
            class130.field3154 = var3;
            if (var3 >> 16 == class103.field2449) {
                class40.field886 = 1;
            }
            if (var3 >> 16 == class102.field2410) {
                class40.field886 = 3;
            }
        }
        if (var4 == 7) {
            class66 var47 = class20.field387[var5];
            if (var47 != null) {
                class26.field653++;
                class43.method358(24134, 0, var47.field1726[0], 0, 2, 1, 1, false, 0, class12.field229.field1796[0], class12.field229.field1726[0], var47.field1796[0]);
                class35.field827 = class52.field1170;
                class75.field1687 = class116.field2728;
                class7.field161 = 2;
                class43.field1003 = 0;
                class111.field2660.method938((byte) 63, 236);
                class111.field2660.method668(var5, (byte) -30);
                class111.field2660.method668(class59.field1302, (byte) -30);
                class111.field2660.method625(class70.field1561, arg1 - 242288601);
            }
        }
        if (var4 == 18) {
            class111.field2660.method938((byte) 63, 147);
            class111.field2660.method668(class37.field845, (byte) -30);
            class111.field2660.method622(class123.field3036, (byte) 98);
            class47.field1073++;
            class111.field2660.method622(var5, (byte) 46);
            class111.field2660.method625(var3, -242288600);
            class111.field2660.method663(class96.field2284, -334352184);
            class111.field2660.method667((byte) 97, var2);
            class49.field1098 = 0;
            class130.field3154 = var3;
            class40.field886 = 2;
            if (var3 >> 16 == class103.field2449) {
                class40.field886 = 1;
            }
            if (var3 >> 16 == class102.field2410) {
                class40.field886 = 3;
            }
            class50.field1116 = var2;
        }
        if (var4 == 55) {
            class66.field1450++;
            class2.method12(var5, var2, false, var3);
            class111.field2660.method938((byte) 63, 47);
            class111.field2660.method668(class61.field1329 + var3, (byte) -30);
            class111.field2660.method632(-21994, var5 >> 14 & 0x7FFF);
            class111.field2660.method668(class130.field3164 + var2, (byte) -30);
        }
        if (var4 == 46) {
            class2 var48 = class49.field1097[var5];
            if (var48 != null) {
                class43.method358(24134, 0, var48.field1726[0], 0, 2, 1, 1, false, 0, class12.field229.field1796[0], class12.field229.field1726[0], var48.field1796[0]);
                class43.field1003 = 0;
                class7.field161 = 2;
                class35.field827 = class52.field1170;
                class88.field2104++;
                class75.field1687 = class116.field2728;
                class111.field2660.method938((byte) 63, 87);
                class111.field2660.method667((byte) 97, var5);
            }
        }
        if (var4 == 13) {
            class2 var49 = class49.field1097[var5];
            if (var49 != null) {
                class43.method358(24134, 0, var49.field1726[0], 0, 2, 1, 1, false, 0, class12.field229.field1796[0], class12.field229.field1726[0], var49.field1796[0]);
                class75.field1687 = class116.field2728;
                class104.field2455++;
                class43.field1003 = 0;
                class35.field827 = class52.field1170;
                class7.field161 = 2;
                class111.field2660.method938((byte) 63, 89);
                class111.field2660.method632(-21994, var5);
            }
        }
        if (var4 == 56) {
            class66 var50 = class20.field387[var5];
            if (var50 != null) {
                class43.method358(24134, 0, var50.field1726[0], 0, 2, 1, 1, false, 0, class12.field229.field1796[0], class12.field229.field1726[0], var50.field1796[0]);
                class35.field827 = class52.field1170;
                class75.field1687 = class116.field2728;
                class43.field1003 = 0;
                class118.field2797++;
                class7.field161 = 2;
                class111.field2660.method938((byte) 63, 101);
                class111.field2660.method632(arg1 - 21995, var5);
            }
        }
        if (var4 == 20) {
            boolean var51 = true;
            class121 var52 = class67.method490((byte) 98, var3);
            if (var52.field2953 > 0) {
                var51 = class91.method762(var52, (byte) -36);
            }
            if (var51) {
                class111.field2660.method938((byte) 63, 54);
                class111.field2660.method644(var3, (byte) 38);
                class90.field2143++;
            }
        }
        if (var4 == 57) {
            class118.field2804++;
            class2.method12(var5, var2, false, var3);
            class111.field2660.method938((byte) 63, 245);
            class111.field2660.method667((byte) 97, class130.field3164 + var2);
            class111.field2660.method667((byte) 97, var5 >> 14 & 0x7FFF);
            class111.field2660.method668(class61.field1329 + var3, (byte) -30);
        }
        if (var4 == 41) {
            class90.field2143++;
            class111.field2660.method938((byte) 63, 54);
            class111.field2660.method644(var3, (byte) 38);
            class121 var53 = class67.method490((byte) 64, var3);
            if (var53.field2968 != null && var53.field2968[0][0] == 5) {
                int var54 = var53.field2968[0][1];
                if (class133.field3245[var54] != var53.field2874[0]) {
                    class133.field3245[var54] = var53.field2874[0];
                    class68.method493(var54, arg1);
                    class139.field3380 = true;
                }
            }
        }
        if (var4 == 1003) {
            class34.field814++;
            class35.field827 = class52.field1170;
            class75.field1687 = class116.field2728;
            class7.field161 = 2;
            class43.field1003 = 0;
            class111.field2660.method938((byte) 63, 219);
            class111.field2660.method668(var5, (byte) -30);
        }
        if (var4 == 17) {
            class2 var55 = class49.field1097[var5];
            if (var55 != null) {
                class43.method358(24134, 0, var55.field1726[0], 0, 2, 1, 1, false, 0, class12.field229.field1796[0], class12.field229.field1726[0], var55.field1796[0]);
                class19.field381++;
                class35.field827 = class52.field1170;
                class75.field1687 = class116.field2728;
                class7.field161 = 2;
                class43.field1003 = 0;
                class111.field2660.method938((byte) 63, 224);
                class111.field2660.method667((byte) 97, var5);
            }
        }
        if (var4 == 22) {
            class66 var56 = class20.field387[var5];
            if (var56 != null) {
                class43.method358(24134, 0, var56.field1726[0], 0, 2, 1, 1, false, 0, class12.field229.field1796[0], class12.field229.field1726[0], var56.field1796[0]);
                class7.field161 = 2;
                class35.field827 = class52.field1170;
                class75.field1687 = class116.field2728;
                class24.field604++;
                class43.field1003 = 0;
                class111.field2660.method938((byte) 63, 169);
                class111.field2660.method632(arg1 ^ 0xFFFFAA17, var5);
            }
        }
        if (var4 == 30) {
            class111.field2660.method938((byte) 63, 113);
            class20.field403++;
            class111.field2660.method663(var3, -334352184);
            class111.field2660.method622(var5, (byte) 106);
            class111.field2660.method632(-21994, var2);
            class130.field3154 = var3;
            class50.field1116 = var2;
            class49.field1098 = 0;
            class40.field886 = 2;
            if (var3 >> 16 == class103.field2449) {
                class40.field886 = 1;
            }
            if (var3 >> 16 == class102.field2410) {
                class40.field886 = 3;
            }
        }
        if (var4 == 23) {
            class76.method608((byte) 39);
            class19.field382 = 1;
            class123.field3036 = var5;
            class37.field845 = var2;
            class139.field3380 = true;
            class96.field2284 = var3;
            class96.field2290 = class85.method731(new class6[] { class111.field2661, class43.method356(-11, var5).field549, class42.field959 }, arg1 + 14568);
            if (class96.field2290 == null) {
                class96.field2290 = class62.field1350;
            }
            return;
        }
        if (var4 == 3) {
            class49.field1086++;
            boolean var57 = class43.method358(24134, 0, var3, 0, 2, 0, 0, false, 0, class12.field229.field1796[0], class12.field229.field1726[0], var2);
            if (!var57) {
                class43.method358(24134, 0, var3, 0, 2, 1, 1, false, 0, class12.field229.field1796[0], class12.field229.field1726[0], var2);
            }
            class43.field1003 = 0;
            class7.field161 = 2;
            class35.field827 = class52.field1170;
            class75.field1687 = class116.field2728;
            class111.field2660.method938((byte) 63, 136);
            class111.field2660.method668(var2 + class130.field3164, (byte) -30);
            class111.field2660.method622(var5, (byte) 105);
            class111.field2660.method667((byte) 97, class61.field1329 + var3);
        }
        if (var4 == 29) {
            class108.method911(31121);
        }
        if (var4 == 39) {
            class121.field2931++;
            class111.field2660.method938((byte) 63, 145);
            class111.field2660.method644(class70.field1561, (byte) 38);
            class111.field2660.method644(var3, (byte) 38);
            class111.field2660.method668(class59.field1302, (byte) -30);
            class111.field2660.method632(-21994, var2);
        }
        if (var4 == 9) {
            class6 var59 = class57.field1247[arg0];
            int var60 = var59.method51(22938, class42.field959);
            if (var60 != -1) {
                if (class103.field2449 == -1) {
                    class108.method911(31121);
                    if (class91.field2174 != -1) {
                        class133.field3260 = var59.method56(arg1 ^ 0xFFFFFFC7, var60 + 5).method40((byte) -45);
                        class125.field3046 = false;
                        class43.field968 = class103.field2449 = class91.field2174;
                    }
                } else {
                    class73.method575(class133.field3262, class59.field1304, false, 0);
                }
            }
        }
        if (var4 == 54) {
            class111.field2660.method938((byte) 63, 48);
            class111.field2660.method668(var2, (byte) -30);
            class111.field2660.method655(var3, -1);
            class111.field2660.method622(var5, (byte) 123);
            class40.field886 = 2;
            class130.field3154 = var3;
            class50.field1116 = var2;
            if (var3 >> 16 == class103.field2449) {
                class40.field886 = 1;
            }
            class79.field1916++;
            if (var3 >> 16 == class102.field2410) {
                class40.field886 = 3;
            }
            class49.field1098 = 0;
        }
        if (var4 == 1006) {
            class75.field1687 = class116.field2728;
            class116.field2730++;
            class35.field827 = class52.field1170;
            class7.field161 = 2;
            class43.field1003 = 0;
            class111.field2660.method938((byte) 63, 36);
            class111.field2660.method622(var5 >> 14 & 0x7FFF, (byte) 65);
        }
        if (var4 == 5) {
            class111.field2660.method938((byte) 63, 243);
            class40.field893++;
            class111.field2660.method644(var3, (byte) 38);
            class111.field2660.method668(var2, (byte) -30);
            class111.field2660.method663(class70.field1561, -334352184);
            class111.field2660.method632(arg1 - 21995, var5);
            class111.field2660.method622(class59.field1302, (byte) 40);
            class50.field1116 = var2;
            class40.field886 = 2;
            class130.field3154 = var3;
            if (var3 >> 16 == class103.field2449) {
                class40.field886 = 1;
            }
            class49.field1098 = 0;
            if (var3 >> 16 == class102.field2410) {
                class40.field886 = 3;
            }
        }
        if (var4 == 52) {
            class66 var61 = class20.field387[var5];
            if (var61 != null) {
                class72.field1654++;
                class43.method358(24134, 0, var61.field1726[0], 0, 2, 1, 1, false, 0, class12.field229.field1796[0], class12.field229.field1726[0], var61.field1796[0]);
                class7.field161 = 2;
                class75.field1687 = class116.field2728;
                class35.field827 = class52.field1170;
                class43.field1003 = 0;
                class111.field2660.method938((byte) 63, 229);
                class111.field2660.method668(var5, (byte) -30);
            }
        }
        if (var4 == 44) {
            class66 var62 = class20.field387[var5];
            if (var62 != null) {
                class43.method358(24134, 0, var62.field1726[0], 0, 2, 1, 1, false, 0, class12.field229.field1796[0], class12.field229.field1726[0], var62.field1796[0]);
                class35.field827 = class52.field1170;
                class7.field161 = 2;
                class43.field1003 = 0;
                class46.field1028++;
                class75.field1687 = class116.field2728;
                class111.field2660.method938((byte) 63, 11);
                class111.field2660.method632(-21994, var5);
            }
        }
        if (class19.field382 != 0) {
            class139.field3380 = true;
            class19.field382 = 0;
        }
        if (class117.field2783) {
            class76.method608((byte) 39);
            class139.field3380 = true;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IZI)I", line = 1251)
    public static final int method333(int arg0, boolean arg1, int arg2) {
        if (arg0 < arg2) {
            int var3 = arg0;
            arg0 = arg2;
            arg2 = var3;
        }
        if (arg1) {
            return -100;
        }
        field876++;
        while (arg2 != 0) {
            int var4 = arg0 % arg2;
            arg0 = arg2;
            arg2 = var4;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(Z)V", line = 1293)
    public static void method334(boolean arg0) {
        if (arg0) {
            method333(58, true, 59);
        }
        field856 = null;
        field863 = null;
        field872 = null;
        field878 = null;
        field862 = null;
        field864 = null;
        field869 = null;
        field861 = null;
        field877 = null;
        field865 = null;
        field859 = null;
        field866 = null;
    }
}
