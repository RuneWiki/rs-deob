import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class300 {

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "Z")
    public static boolean field4965 = false;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "Lce;")
    public static class126 field4964 = class206.method1445(-7923, " <col=00ff80>");

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "Lce;")
    public static class126 field4968 = class206.method1445(-7923, "::tele ");

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "Lce;")
    public static class126 field4969 = class206.method1445(-7923, "Zugewiesener Speicher)3");

    @OriginalMember(owner = "client!hg", name = "j", descriptor = "[I")
    public static int[] field4973 = new int[2];

    @OriginalMember(owner = "client!hg", name = "l", descriptor = "I")
    public static int field4975 = 0;

    @OriginalMember(owner = "client!hg", name = "m", descriptor = "Lce;")
    public static class126 field4976 = class206.method1445(-7923, "<img=0>");

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "I")
    public static int field4966;

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "I")
    public static int field4970;

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "I")
    public static int field4971;

    @OriginalMember(owner = "client!hg", name = "k", descriptor = "I")
    public static int field4974;

    @OriginalMember(owner = "client!hg", name = "n", descriptor = "I")
    public static int field4977;

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "Lee;")
    public static class293 field4967;

    @OriginalMember(owner = "client!hg", name = "i", descriptor = "[I")
    public static int[] field4972;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZI)V", line = 5)
    public static final void method2016(boolean arg0, int arg1) {
        field4974++;
        if (arg1 < 0) {
            return;
        }
        int var2 = class34.field506[arg1];
        int var3 = class9.field115[arg1];
        long var4 = class194.field3304[arg1];
        int var6 = (int) class194.field3304[arg1];
        int var7 = class84.field1341[arg1];
        if (var7 >= 2000) {
            var7 -= 2000;
        }
        if (var7 == 43) {
            class301 var8 = class85.field1352[var6];
            if (var8 != null) {
                class22.field290++;
                class151.method1123(2, 1, -9, 0, 0, false, 1, 0, class286.field4744.field2460[0], class286.field4744.field2471[0], var8.field2460[0], var8.field2471[0]);
                class17.field239 = class53.field804;
                class238.field4015 = class152.field2782;
                class29.field412 = 2;
                class296.field4933 = 0;
                class103.field1645.method1238(121, 97);
                class103.field1645.method935(var6, 1668921832);
                class103.field1645.method938(-70, class189.field3250);
                class103.field1645.method972(class52.field797, 909483592);
            }
        }
        if (var7 == 49) {
            class103.field1645.method1238(171, 81);
            class199.field3395++;
            class103.field1645.method938(-58, var3);
            class103.field1645.method959(59, var2);
            class103.field1645.method959(-112, var6);
            class36.field525 = 0;
            class180.field3138 = class252.method1706(5157, var3);
            class168.field2977 = var2;
        }
        if (var7 == 10) {
            class103.field1645.method1238(145, 79);
            class292.field4840++;
            class103.field1645.method938(-86, var3);
            class103.field1645.method959(121, var6);
            class103.field1645.method972(var2, 909483592);
            class36.field525 = 0;
            class180.field3138 = class252.method1706(5157, var3);
            class168.field2977 = var2;
        }
        if (var7 == 48) {
            class112 var49 = class53.method337((byte) -127, var3, var2);
            if (var49 != null) {
                method2017(-105);
                class123.method820((byte) 73, class37.method203(client.method804(var49), -7622), var2, var3);
                class257.field4316 = 0;
                class85.field1345 = class318.method2212(137, var49);
                if (class85.field1345 == null) {
                    class85.field1345 = class36.field537;
                }
                if (var49.field1916) {
                    class187.field3236 = class12.method69(new class126[] { var49.field1894, class314.field5395 }, (byte) 123);
                } else {
                    class187.field3236 = class12.method69(new class126[] { class21.field281, var49.field1762, class314.field5395 }, (byte) 117);
                }
            }
            return;
        }
        if (var7 == 5 && class87.method615(0, var3, var2, var4)) {
            class14.field187++;
            class103.field1645.method1238(179, 100);
            class103.field1645.method935(class58.field914 + var2, 1668921832);
            class103.field1645.method960(-979688112, class189.field3250);
            class103.field1645.method959(26, class52.field797);
            class103.field1645.method935((int) (var4 >>> 32) & Integer.MAX_VALUE, 1668921832);
            class103.field1645.method935(class138.field2473 + var3, 1668921832);
        }
        if (var7 == 20) {
            method2017(93);
            class112 var9 = class252.method1706(5157, var3);
            class112.field1829 = var6;
            class257.field4316 = 1;
            class251.field4207 = var3;
            class24.field352 = var2;
            class23.method114(var9, (byte) 94);
            class279.field4640 = class12.method69(new class126[] { class99.field1598, class68.method498(64, var6).field2396, class314.field5395 }, (byte) 121);
            if (class279.field4640 == null) {
                class279.field4640 = class234.field3950;
            }
            return;
        }
        if (var7 == 26) {
            class89 var10 = class199.field3391[var6];
            if (var10 != null) {
                class18.field241++;
                class151.method1123(2, 1, -9, 0, 0, false, 1, 0, class286.field4744.field2460[0], class286.field4744.field2471[0], var10.field2460[0], var10.field2471[0]);
                class29.field412 = 2;
                class296.field4933 = 0;
                class238.field4015 = class152.field2782;
                class17.field239 = class53.field804;
                class103.field1645.method1238(166, 97);
                class103.field1645.method935(var6, 1668921832);
            }
        }
        if (var7 == 23) {
            if (var6 == 0) {
                class264.field4412 = 1;
                class293.method1936(class131.field2250, var2, var3);
            } else if (var6 == 1) {
                class103.field1645.method1238(27, 60);
                class103.field1645.method974(class52.field797, (byte) 26);
                class293.field4858++;
                class103.field1645.method947(class189.field3250, (byte) 104);
                class103.field1645.method974(class58.field914 + var2, (byte) 26);
                class103.field1645.method974(class138.field2473 + var3, (byte) 26);
            }
        }
        if (var7 == 16) {
            class103.field1645.method1238(255, 107);
            class103.field1645.method947(var3, (byte) 115);
            class112 var11 = class252.method1706(5157, var3);
            class55.field828++;
            if (var11.field1807 != null && var11.field1807[0][0] == 5) {
                int var12 = var11.field1807[0][1];
                class138.field2462[var12] = 1 - class138.field2462[var12];
                class100.method674((byte) -120, var12);
            }
        }
        if (var7 == 1006) {
            class17.field239 = class53.field804;
            class296.field4933 = 0;
            class29.field412 = 2;
            class238.field4015 = class152.field2782;
            class89 var13 = class199.field3391[var6];
            if (var13 != null) {
                class304 var14 = var13.field1389;
                if (var14.field5059 != null) {
                    var14 = var14.method2038((byte) -128);
                }
                if (var14 != null) {
                    class306.field5141++;
                    class103.field1645.method1238(65, 99);
                    class103.field1645.method974(var14.field5057, (byte) 26);
                }
            }
        }
        if (var7 == 1004) {
            class17.field239 = class53.field804;
            class238.field4015 = class152.field2782;
            class296.field4933 = 0;
            class4.field19++;
            class29.field412 = 2;
            class103.field1645.method1238(60, 122);
            class103.field1645.method959(-116, var6);
        }
        if (var7 == 45) {
            boolean var15 = true;
            class112 var16 = class252.method1706(5157, var3);
            if (var16.field1885 > 0) {
                var15 = class301.method2024(var16, -112);
            }
            if (var15) {
                class55.field828++;
                class103.field1645.method1238(255, 123);
                class103.field1645.method947(var3, (byte) 99);
            }
        }
        if (var7 == 14) {
            class301 var17 = class85.field1352[var6];
            if (var17 != null) {
                class151.method1123(2, 1, -9, 0, 0, false, 1, 0, class286.field4744.field2460[0], class286.field4744.field2471[0], var17.field2460[0], var17.field2471[0]);
                class117.field1980++;
                class238.field4015 = class152.field2782;
                class296.field4933 = 0;
                class17.field239 = class53.field804;
                class29.field412 = 2;
                class103.field1645.method1238(56, 107);
                class103.field1645.method974(var6, (byte) 26);
            }
        }
        if (var7 == 1) {
            class36.field535++;
            boolean var18 = class151.method1123(2, 0, -9, 0, 0, false, 0, 0, class286.field4744.field2460[0], class286.field4744.field2471[0], var2, var3);
            if (!var18) {
                class151.method1123(2, 1, -9, 0, 0, false, 1, 0, class286.field4744.field2460[0], class286.field4744.field2471[0], var2, var3);
            }
            class17.field239 = class53.field804;
            class29.field412 = 2;
            class238.field4015 = class152.field2782;
            class296.field4933 = 0;
            class103.field1645.method1238(186, 110);
            class103.field1645.method974(class24.field352, (byte) 26);
            class103.field1645.method972(class138.field2473 + var3, 909483592);
            class103.field1645.method974(class112.field1829, (byte) 26);
            class103.field1645.method935(var2 + class58.field914, 1668921832);
            class103.field1645.method974(var6, (byte) 26);
            class103.field1645.method947(class251.field4207, (byte) 126);
        }
        if (var7 == 22) {
            class103.field1645.method1238(124, 64);
            class103.field1645.method974(var2, (byte) 26);
            class105.field1659++;
            class103.field1645.method947(var3, (byte) 114);
            class103.field1645.method935(var6, 1668921832);
            class36.field525 = 0;
            class180.field3138 = class252.method1706(5157, var3);
            class168.field2977 = var2;
        }
        if (var7 == 46) {
            class301 var20 = class85.field1352[var6];
            if (var20 != null) {
                client.field2065++;
                class151.method1123(2, 1, -9, 0, 0, false, 1, 0, class286.field4744.field2460[0], class286.field4744.field2471[0], var20.field2460[0], var20.field2471[0]);
                class29.field412 = 2;
                class238.field4015 = class152.field2782;
                class296.field4933 = 0;
                class17.field239 = class53.field804;
                class103.field1645.method1238(77, 118);
                class103.field1645.method972(var6, 909483592);
            }
        }
        if (var7 == 3) {
            class301 var21 = class85.field1352[var6];
            if (var21 != null) {
                class94.field1469++;
                class151.method1123(2, 1, -9, 0, 0, false, 1, 0, class286.field4744.field2460[0], class286.field4744.field2471[0], var21.field2460[0], var21.field2471[0]);
                class17.field239 = class53.field804;
                class29.field412 = 2;
                class296.field4933 = 0;
                class238.field4015 = class152.field2782;
                class103.field1645.method1238(203, 90);
                class103.field1645.method974(var6, (byte) 26);
            }
        }
        if (var7 == 1001) {
            class112 var22 = class252.method1706(5157, var3);
            if (var22 == null || var22.field1899[var2] < 100000) {
                class4.field19++;
                class103.field1645.method1238(60, 81);
                class103.field1645.method959(-88, var6);
            } else {
                class73.method530(class224.field3772, (byte) 113, 0, class12.method69(new class126[] { class195.method1386((byte) 20, var22.field1899[var2]), class172.field3037, class68.method498(59, var6).field2396 }, (byte) 127));
            }
            class36.field525 = 0;
            class180.field3138 = class252.method1706(5157, var3);
            class168.field2977 = var2;
        }
        if (var7 == 36) {
            class103.field1645.method1238(52, 73);
            class34.field509++;
            class103.field1645.method974(var2, (byte) 26);
            class103.field1645.method938(-52, var3);
            class103.field1645.method959(105, class52.field797);
            class103.field1645.method929(class189.field3250, (byte) 117);
        }
        if (var7 == 18) {
            class232.field3893++;
            class103.field1645.method1238(44, 96);
            class103.field1645.method938(125, var3);
            class103.field1645.method974(var6, (byte) 26);
            class103.field1645.method974(var2, (byte) 26);
            class36.field525 = 0;
            class180.field3138 = class252.method1706(5157, var3);
            class168.field2977 = var2;
        }
        if (var7 == 38) {
            class206.field3535++;
            boolean var23 = class151.method1123(2, 0, -9, 0, 0, false, 0, 0, class286.field4744.field2460[0], class286.field4744.field2471[0], var2, var3);
            if (!var23) {
                class151.method1123(2, 1, -9, 0, 0, false, 1, 0, class286.field4744.field2460[0], class286.field4744.field2471[0], var2, var3);
            }
            class238.field4015 = class152.field2782;
            class29.field412 = 2;
            class296.field4933 = 0;
            class17.field239 = class53.field804;
            class103.field1645.method1238(75, 87);
            class103.field1645.method974(class138.field2473 + var3, (byte) 26);
            class103.field1645.method938(-97, class189.field3250);
            class103.field1645.method974(class58.field914 + var2, (byte) 26);
            class103.field1645.method935(var6, 1668921832);
            class103.field1645.method974(class52.field797, (byte) 26);
        }
        if (var7 == 51) {
            if (var6 == 0) {
                class213.field3626 = 1;
                class293.method1936(class131.field2250, var2, var3);
            } else if (class73.field1172 > 0 && class217.field3655[82] && class217.field3655[81]) {
                class76.method549(class58.field914 + var2, class138.field2473 - -var3, class131.field2250, true);
            } else {
                class53.field807++;
                class103.field1645.method1238(250, 70);
                class103.field1645.method974(class58.field914 + var2, (byte) 26);
                class103.field1645.method974(class138.field2473 + var3, (byte) 26);
            }
        }
        if (var7 == 57 && class64.field1084 == null) {
            class158.method1156(173, var2, var3);
            class64.field1084 = class53.method337((byte) -127, var3, var2);
            class23.method114(class64.field1084, (byte) 94);
        }
        if (var7 == 39) {
            class103.field1645.method1238(140, 67);
            class103.field1645.method974(var2, (byte) 26);
            class103.field1645.method938(-24, var3);
            class19.field252++;
            class103.field1645.method959(48, var6);
            class36.field525 = 0;
            class180.field3138 = class252.method1706(5157, var3);
            class168.field2977 = var2;
        }
        if (var7 == 60) {
            class301 var25 = class85.field1352[var6];
            if (var25 != null) {
                class151.method1123(2, 1, -9, 0, 0, false, 1, 0, class286.field4744.field2460[0], class286.field4744.field2471[0], var25.field2460[0], var25.field2471[0]);
                class238.field4015 = class152.field2782;
                class17.field239 = class53.field804;
                class296.field4933 = 0;
                class29.field412 = 2;
                class103.field1645.method1238(178, 101);
                class262.field4384++;
                class103.field1645.method974(var6, (byte) 26);
            }
        }
        if (var7 == 41 || var7 == 1005) {
            class217.method1493(var3, var6, 59, class214.field3636[arg1], var2);
        }
        if (var7 == 17) {
            class302.field5030++;
            if (class23.field335 == 1) {
                class151.method1123(2, 1, -9, 0, 0, false, 1, 0, class286.field4744.field2460[0], class286.field4744.field2471[0], var2, var3);
            } else {
                boolean var26 = class151.method1123(2, 0, -9, 0, 0, false, 0, 0, class286.field4744.field2460[0], class286.field4744.field2471[0], var2, var3);
                if (!var26) {
                    class151.method1123(2, 1, -9, 0, 0, false, 1, 0, class286.field4744.field2460[0], class286.field4744.field2471[0], var2, var3);
                }
            }
            class296.field4933 = 0;
            class29.field412 = 2;
            class17.field239 = class53.field804;
            class238.field4015 = class152.field2782;
            class103.field1645.method1238(160, 117);
            class103.field1645.method935(class58.field914 + var2, 1668921832);
            class103.field1645.method974(var6, (byte) 26);
            class103.field1645.method972(class138.field2473 + var3, 909483592);
        }
        if (var7 == 29) {
            if (class23.field335 == 1) {
                class151.method1123(2, 1, -9, 0, 0, false, 1, 0, class286.field4744.field2460[0], class286.field4744.field2471[0], var2, var3);
            } else {
                boolean var28 = class151.method1123(2, 0, -9, 0, 0, false, 0, 0, class286.field4744.field2460[0], class286.field4744.field2471[0], var2, var3);
                if (!var28) {
                    class151.method1123(2, 1, -9, 0, 0, false, 1, 0, class286.field4744.field2460[0], class286.field4744.field2471[0], var2, var3);
                }
            }
            class29.field412 = 2;
            class173.field3066++;
            class296.field4933 = 0;
            class17.field239 = class53.field804;
            class238.field4015 = class152.field2782;
            class103.field1645.method1238(36, 110);
            class103.field1645.method974(var2 + class58.field914, (byte) 26);
            class103.field1645.method959(38, var6);
            class103.field1645.method972(class138.field2473 + var3, 909483592);
        }
        if (var7 == 47) {
            class89 var30 = class199.field3391[var6];
            if (var30 != null) {
                class151.method1123(2, 1, -9, 0, 0, false, 1, 0, class286.field4744.field2460[0], class286.field4744.field2471[0], var30.field2460[0], var30.field2471[0]);
                class17.field239 = class53.field804;
                client.field2069++;
                class238.field4015 = class152.field2782;
                class29.field412 = 2;
                class296.field4933 = 0;
                class103.field1645.method1238(151, 126);
                class103.field1645.method959(113, var6);
            }
        }
        if (var7 == 33) {
            class274.field4617++;
            class103.field1645.method1238(195, 89);
            class103.field1645.method935(var6, 1668921832);
            class103.field1645.method929(var3, (byte) 108);
            class103.field1645.method935(var2, 1668921832);
            class36.field525 = 0;
            class180.field3138 = class252.method1706(5157, var3);
            class168.field2977 = var2;
        }
        if (var7 == 40) {
            class89 var31 = class199.field3391[var6];
            if (var31 != null) {
                class151.method1123(2, 1, -9, 0, 0, false, 1, 0, class286.field4744.field2460[0], class286.field4744.field2471[0], var31.field2460[0], var31.field2471[0]);
                class296.field4933 = 0;
                class29.field412 = 2;
                class29.field399++;
                class17.field239 = class53.field804;
                class238.field4015 = class152.field2782;
                class103.field1645.method1238(113, 82);
                class103.field1645.method959(-87, var6);
            }
        }
        if (var7 == 4) {
            class1.field12++;
            class87.method615(0, var3, var2, var4);
            class103.field1645.method1238(54, 75);
            class103.field1645.method974(class138.field2473 + var3, (byte) 26);
            class103.field1645.method959(-60, var2 + class58.field914);
            class103.field1645.method974((int) (var4 >>> 32) & Integer.MAX_VALUE, (byte) 26);
        }
        if (var7 == 31) {
            class234.method1591(!arg0);
        }
        if (var7 == 9) {
            class89 var32 = class199.field3391[var6];
            if (var32 != null) {
                class151.method1123(2, 1, -9, 0, 0, false, 1, 0, class286.field4744.field2460[0], class286.field4744.field2471[0], var32.field2460[0], var32.field2471[0]);
                class296.field4933 = 0;
                class238.field4015 = class152.field2782;
                class88.field1375++;
                class17.field239 = class53.field804;
                class29.field412 = 2;
                class103.field1645.method1238(185, 122);
                class103.field1645.method972(var6, 909483592);
            }
        }
        if (var7 == 8) {
            class87.method615(0, var3, var2, var4);
            class293.field4862++;
            class103.field1645.method1238(88, 86);
            class103.field1645.method972(class138.field2473 + var3, 909483592);
            class103.field1645.method935(Integer.MAX_VALUE & (int) (var4 >>> 32), 1668921832);
            class103.field1645.method972(var2 + class58.field914, 909483592);
        }
        if (var7 == 19) {
            class264.field4401++;
            class103.field1645.method1238(154, 121);
            class103.field1645.method929(var3, (byte) 124);
            class103.field1645.method972(var6, 909483592);
            class103.field1645.method974(var2, (byte) 26);
            class36.field525 = 0;
            class180.field3138 = class252.method1706(5157, var3);
            class168.field2977 = var2;
        }
        if (var7 == 1003) {
            class238.field4015 = class152.field2782;
            class17.field239 = class53.field804;
            class296.field4933 = 0;
            class65.field1091++;
            class29.field412 = 2;
            class103.field1645.method1238(9, 116);
            class103.field1645.method959(20, var6);
        }
        if (var7 == 6) {
            class87.method615(0, var3, var2, var4);
            class103.field1645.method1238(86, 94);
            class103.field1645.method935(var3 + class138.field2473, 1668921832);
            class103.field1645.method974((int) (var4 >>> 32) & Integer.MAX_VALUE, (byte) 26);
            class206.field3540++;
            class103.field1645.method972(class58.field914 + var2, 909483592);
        }
        if (var7 == 1002) {
            class26.field366++;
            class87.method615(0, var3, var2, var4);
            class103.field1645.method1238(239, 84);
            class103.field1645.method972(Integer.MAX_VALUE & (int) (var4 >>> 32), 909483592);
            class103.field1645.method972(class138.field2473 + var3, 909483592);
            class103.field1645.method974(class58.field914 + var2, (byte) 26);
        }
        if (var7 == 25) {
            class301 var33 = class85.field1352[var6];
            if (var33 != null) {
                class151.method1123(2, 1, -9, 0, 0, false, 1, 0, class286.field4744.field2460[0], class286.field4744.field2471[0], var33.field2460[0], var33.field2471[0]);
                class296.field4933 = 0;
                class57.field894++;
                class17.field239 = class53.field804;
                class29.field412 = 2;
                class238.field4015 = class152.field2782;
                class103.field1645.method1238(174, 65);
                class103.field1645.method935(var6, 1668921832);
            }
        }
        if (var7 == 44) {
            class103.field1645.method1238(247, 78);
            class103.field1645.method938(-40, var3);
            class34.field505++;
            class103.field1645.method972(var2, 909483592);
            class103.field1645.method974(var6, (byte) 26);
            class36.field525 = 0;
            class180.field3138 = class252.method1706(5157, var3);
            class168.field2977 = var2;
        }
        if (var7 == 58) {
            class200.field3407++;
            class103.field1645.method1238(213, 122);
            class103.field1645.method929(var3, (byte) 116);
            class103.field1645.method935(var2, 1668921832);
            class103.field1645.method972(var6, 909483592);
            class36.field525 = 0;
            class180.field3138 = class252.method1706(5157, var3);
            class168.field2977 = var2;
        }
        if (var7 == 35) {
            class103.field1645.method1238(41, 107);
            class172.field3040++;
            class103.field1645.method929(var3, (byte) 108);
            class103.field1645.method974(var6, (byte) 26);
            class103.field1645.method974(var2, (byte) 26);
            class36.field525 = 0;
            class180.field3138 = class252.method1706(5157, var3);
            class168.field2977 = var2;
        }
        if (var7 == 34) {
            class89 var34 = class199.field3391[var6];
            if (var34 != null) {
                class84.field1336++;
                class151.method1123(2, 1, -9, 0, 0, false, 1, 0, class286.field4744.field2460[0], class286.field4744.field2471[0], var34.field2460[0], var34.field2471[0]);
                class17.field239 = class53.field804;
                class296.field4933 = 0;
                class238.field4015 = class152.field2782;
                class29.field412 = 2;
                class103.field1645.method1238(167, 64);
                class103.field1645.method959(-74, var6);
            }
        }
        if (var7 == 24) {
            class301 var35 = class85.field1352[var6];
            if (var35 != null) {
                class151.method1123(2, 1, -9, 0, 0, false, 1, 0, class286.field4744.field2460[0], class286.field4744.field2471[0], var35.field2460[0], var35.field2471[0]);
                class138.field2502++;
                class29.field412 = 2;
                class238.field4015 = class152.field2782;
                class17.field239 = class53.field804;
                class296.field4933 = 0;
                class103.field1645.method1238(62, 83);
                class103.field1645.method959(-113, var6);
            }
        }
        if (var7 == 42) {
            class103.field1645.method1238(73, 73);
            class103.field1645.method935(var6, 1668921832);
            class292.field4843++;
            class103.field1645.method972(var2, 909483592);
            class103.field1645.method929(var3, (byte) 117);
            class103.field1645.method959(72, class112.field1829);
            class103.field1645.method974(class24.field352, (byte) 26);
            class103.field1645.method929(class251.field4207, (byte) 123);
            class36.field525 = 0;
            class180.field3138 = class252.method1706(5157, var3);
            class168.field2977 = var2;
        }
        if (var7 == 12) {
            class301 var36 = class85.field1352[var6];
            if (var36 != null) {
                class151.method1123(2, 1, -9, 0, 0, false, 1, 0, class286.field4744.field2460[0], class286.field4744.field2471[0], var36.field2460[0], var36.field2471[0]);
                class238.field4015 = class152.field2782;
                class296.field4933 = 0;
                class17.field239 = class53.field804;
                class134.field2345++;
                class29.field412 = 2;
                class103.field1645.method1238(147, 101);
                class103.field1645.method974(var6, (byte) 26);
            }
        }
        if (var7 == 30 && class87.method615(0, var3, var2, var4)) {
            class103.field1645.method1238(215, 64);
            class64.field1090++;
            class103.field1645.method972(class138.field2473 + var3, 909483592);
            class103.field1645.method935(Integer.MAX_VALUE & (int) (var4 >>> 32), 1668921832);
            class103.field1645.method935(class24.field352, 1668921832);
            class103.field1645.method972(class112.field1829, 909483592);
            class103.field1645.method972(var2 + class58.field914, 909483592);
            class103.field1645.method938(-100, class251.field4207);
        }
        if (var7 == 32) {
            if (var6 == 0) {
                class293.method1936(class131.field2250, var2, var3);
            } else if (var6 == 1) {
                if (class73.field1172 > 0 && class217.field3655[82] && class217.field3655[81]) {
                    class76.method549(class58.field914 + var2, class138.field2473 + var3, class131.field2250, true);
                } else if (class151.method1123(1, 0, -9, 0, 0, true, 0, 0, class286.field4744.field2460[0], class286.field4744.field2471[0], var2, var3)) {
                    class103.field1645.method933(-3, class84.field1339);
                    class103.field1645.method933(-3, class320.field5482);
                    class103.field1645.method959(95, class144.field2618);
                    class103.field1645.method933(-3, 57);
                    class103.field1645.method933(-3, class180.field3134);
                    class103.field1645.method933(-3, class234.field3951);
                    class103.field1645.method933(-3, 89);
                    class103.field1645.method959(61, class286.field4744.field2461);
                    class103.field1645.method959(123, class286.field4744.field2487);
                    class103.field1645.method933(-3, class195.field3354);
                    class103.field1645.method933(-3, 63);
                }
            }
        }
        if (var7 == 28) {
            if (class23.field335 == 1) {
                class151.method1123(2, 1, -9, 0, 0, false, 1, 0, class286.field4744.field2460[0], class286.field4744.field2471[0], var2, var3);
            } else {
                boolean var37 = class151.method1123(2, 0, -9, 0, 0, false, 0, 0, class286.field4744.field2460[0], class286.field4744.field2471[0], var2, var3);
                if (!var37) {
                    class151.method1123(2, 1, -9, 0, 0, false, 1, 0, class286.field4744.field2460[0], class286.field4744.field2471[0], var2, var3);
                }
            }
            class29.field412 = 2;
            class281.field4665++;
            class17.field239 = class53.field804;
            class238.field4015 = class152.field2782;
            class296.field4933 = 0;
            class103.field1645.method1238(68, 96);
            class103.field1645.method974(class58.field914 + var2, (byte) 26);
            class103.field1645.method935(class138.field2473 + var3, 1668921832);
            class103.field1645.method959(-111, var6);
        }
        if (var7 == 37) {
            class103.field1645.method1238(192, 106);
            class182.field3159++;
            class103.field1645.method960(-979688112, var3);
            class103.field1645.method974(var6, (byte) 26);
            class103.field1645.method960(-979688112, class189.field3250);
            class103.field1645.method959(-93, var2);
            class103.field1645.method974(class52.field797, (byte) 26);
            class36.field525 = 0;
            class180.field3138 = class252.method1706(5157, var3);
            class168.field2977 = var2;
        }
        if (var7 == 15) {
            if (class23.field335 == 1) {
                class151.method1123(2, 1, -9, 0, 0, false, 1, 0, class286.field4744.field2460[0], class286.field4744.field2471[0], var2, var3);
            } else {
                boolean var39 = class151.method1123(2, 0, -9, 0, 0, false, 0, 0, class286.field4744.field2460[0], class286.field4744.field2471[0], var2, var3);
                if (!var39) {
                    class151.method1123(2, 1, -9, 0, 0, false, 1, 0, class286.field4744.field2460[0], class286.field4744.field2471[0], var2, var3);
                }
            }
            class238.field4015 = class152.field2782;
            class296.field4933 = 0;
            class41.field651++;
            class29.field412 = 2;
            class17.field239 = class53.field804;
            class103.field1645.method1238(135, 68);
            class103.field1645.method959(-101, class58.field914 + var2);
            class103.field1645.method959(-123, var6);
            class103.field1645.method935(class138.field2473 + var3, 1668921832);
        }
        if (var7 == 59) {
            class89 var41 = class199.field3391[var6];
            if (var41 != null) {
                class238.field4008++;
                class151.method1123(2, 1, -9, 0, 0, false, 1, 0, class286.field4744.field2460[0], class286.field4744.field2471[0], var41.field2460[0], var41.field2471[0]);
                class296.field4933 = 0;
                class17.field239 = class53.field804;
                class238.field4015 = class152.field2782;
                class29.field412 = 2;
                class103.field1645.method1238(227, 109);
                class103.field1645.method960(-979688112, class189.field3250);
                class103.field1645.method972(class52.field797, 909483592);
                class103.field1645.method974(var6, (byte) 26);
            }
        }
        if (var7 == 11) {
            class301 var42 = class85.field1352[var6];
            if (var42 != null) {
                class274.field4616++;
                class151.method1123(2, 1, -9, 0, 0, false, 1, 0, class286.field4744.field2460[0], class286.field4744.field2471[0], var42.field2460[0], var42.field2471[0]);
                class29.field412 = 2;
                class17.field239 = class53.field804;
                class238.field4015 = class152.field2782;
                class296.field4933 = 0;
                class103.field1645.method1238(123, 86);
                class103.field1645.method959(110, var6);
                class103.field1645.method974(class112.field1829, (byte) 26);
                class103.field1645.method938(-103, class251.field4207);
                class103.field1645.method935(class24.field352, 1668921832);
            }
        }
        if (var7 == 2) {
            if (class23.field335 == 1) {
                class151.method1123(2, 1, -9, 0, 0, false, 1, 0, class286.field4744.field2460[0], class286.field4744.field2471[0], var2, var3);
            } else {
                boolean var43 = class151.method1123(2, 0, -9, 0, 0, false, 0, 0, class286.field4744.field2460[0], class286.field4744.field2471[0], var2, var3);
                if (!var43) {
                    class151.method1123(2, 1, -9, 0, 0, false, 1, 0, class286.field4744.field2460[0], class286.field4744.field2471[0], var2, var3);
                }
            }
            class296.field4933 = 0;
            class17.field239 = class53.field804;
            class238.field4015 = class152.field2782;
            class193.field3298++;
            class29.field412 = 2;
            class103.field1645.method1238(48, 78);
            class103.field1645.method959(-115, var6);
            class103.field1645.method935(class138.field2473 + var3, 1668921832);
            class103.field1645.method974(class58.field914 + var2, (byte) 26);
        }
        if (arg0) {
            field4975 = 76;
        }
        if (var7 == 13) {
            class301 var45 = class85.field1352[var6];
            if (var45 != null) {
                class213.field3620++;
                class151.method1123(2, 1, -9, 0, 0, false, 1, 0, class286.field4744.field2460[0], class286.field4744.field2471[0], var45.field2460[0], var45.field2471[0]);
                class29.field412 = 2;
                class17.field239 = class53.field804;
                class238.field4015 = class152.field2782;
                class296.field4933 = 0;
                class103.field1645.method1238(150, 73);
                class103.field1645.method959(58, var6);
            }
        }
        if (var7 == 7) {
            class87.method615(0, var3, var2, var4);
            class103.field1645.method1238(101, 83);
            class137.field2382++;
            class103.field1645.method935((int) (var4 >>> 32) & Integer.MAX_VALUE, 1668921832);
            class103.field1645.method974(class58.field914 + var2, (byte) 26);
            class103.field1645.method959(80, class138.field2473 + var3);
        }
        if (var7 == 21) {
            class103.field1645.method1238(255, 74);
            class103.field1645.method947(var3, (byte) 96);
            class55.field828++;
            class112 var46 = class252.method1706(5157, var3);
            if (var46.field1807 != null && var46.field1807[0][0] == 5) {
                int var47 = var46.field1807[0][1];
                if (class138.field2462[var47] != var46.field1818[0]) {
                    class138.field2462[var47] = var46.field1818[0];
                    class100.method674((byte) -114, var47);
                }
            }
        }
        if (var7 == 50) {
            class89 var48 = class199.field3391[var6];
            if (var48 != null) {
                class94.field1471++;
                class151.method1123(2, 1, -9, 0, 0, false, 1, 0, class286.field4744.field2460[0], class286.field4744.field2471[0], var48.field2460[0], var48.field2471[0]);
                class238.field4015 = class152.field2782;
                class17.field239 = class53.field804;
                class296.field4933 = 0;
                class29.field412 = 2;
                class103.field1645.method1238(105, 96);
                class103.field1645.method974(class112.field1829, (byte) 26);
                class103.field1645.method929(class251.field4207, (byte) 116);
                class103.field1645.method935(var6, 1668921832);
                class103.field1645.method972(class24.field352, 909483592);
            }
        }
        if (class257.field4316 != 0) {
            class257.field4316 = 0;
            class23.method114(class252.method1706(5157, class251.field4207), (byte) 94);
        }
        if (class313.field5371) {
            method2017(15);
        }
        if (class180.field3138 != null && class36.field525 == 0) {
            class23.method114(class180.field3138, (byte) 94);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V", line = 1103)
    public static final void method2017(int arg0) {
        field4977++;
        if (!class313.field5371) {
            return;
        }
        class112 var1 = class53.method337((byte) -127, class189.field3250, class52.field797);
        int var2 = 86 % ((-arg0 - 38) / 39);
        if (var1 != null && var1.field1861 != null) {
            class282 var3 = new class282();
            var3.field4697 = var1;
            var3.field4699 = var1.field1861;
            class309.method2111(var3, 200000);
        }
        class202.field3465 = -1;
        class313.field5371 = false;
        class23.method114(var1, (byte) 94);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Z)V", line = 1138)
    public static void method2018(boolean arg0) {
        field4973 = null;
        field4976 = null;
        field4972 = null;
        field4969 = null;
        field4968 = null;
        if (arg0) {
            field4967 = null;
            field4964 = null;
        }
    }
}
