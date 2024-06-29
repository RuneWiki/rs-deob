import java.awt.Color;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class50 {

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "Lpa;")
    public static class91 field1171 = new class91(50);

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "Lec;")
    public static class28 field1173 = class28.method210(-46, "Press (Wrecover a locked account(W on front page)3");

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "Lec;")
    public static class28 field1174 = class28.method210(-46, "(U1");

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "Lec;")
    public static class28 field1175 = class28.method210(-46, "@yel@ days of*6nmember credit remaining)3");

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "I")
    public static int field1176 = 127;

    @OriginalMember(owner = "client!ib", name = "m", descriptor = "Lec;")
    private static class28 field1178 = class28.method210(-46, "Loading config )2 ");

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
    public static int field1166;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
    public static int field1167;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
    public static int field1168;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
    public static int field1170;

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "I")
    public static int field1177;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "[Lkc;")
    private static class63[] field1169;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
    public static void method403(int arg0) {
        field1175 = null;
        field1171 = null;
        field1178 = null;
        field1169 = null;
        int var1 = 22 / ((arg0 + 45) / 33);
        field1174 = null;
        field1173 = null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)I")
    public static final int method404(int arg0, int arg1, int arg2) {
        int var3 = class48.method385(arg0 - 1, (byte) 23, arg2 - 1) + class48.method385(arg0 + 1, (byte) -102, arg2 - 1) + class48.method385(arg0 - 1, (byte) -76, arg2 + 1) + class48.method385(arg0 + 1, (byte) 42, arg2 + 1);
        field1172++;
        int var4 = class48.method385(arg0 - 1, (byte) 82, arg2) + class48.method385(arg0 + 1, (byte) 97, arg2) + class48.method385(arg0, (byte) -115, arg2 - 1) + class48.method385(arg0, (byte) 63, arg2 + 1);
        if (arg1 < 13) {
            return 9;
        } else {
            int var5 = class48.method385(arg0, (byte) 82, arg2);
            return var5 / 4 + var3 / 16 + var4 / 8;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Ljava/awt/Graphics;IIIZ[I)V")
    public static final void method405(Graphics arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5) {
        field1167++;
        class125.field2715.method92((byte) -4);
        class103.field2197.method977(0, 0);
        if (arg4) {
            if (arg5[arg2] != -1) {
                if (arg2 == 0) {
                    class14.field253.method977(22, 10);
                }
                if (arg2 == 1) {
                    class25.field541.method977(54, 8);
                }
                if (arg2 == 2) {
                    class25.field541.method977(82, 8);
                }
                if (arg2 == 3) {
                    class32.field692.method977(110, 8);
                }
                if (arg2 == 4) {
                    class57.field1312.method977(153, 8);
                }
                if (arg2 == 5) {
                    class57.field1312.method977(181, 8);
                }
                if (arg2 == 6) {
                    class8.field141.method977(209, 9);
                }
            }
            if (arg5[0] != -1 && arg3 != 0) {
                class34.field775[0].method977(29, 13);
            }
            if (arg5[1] != -1 && arg3 != 1) {
                class34.field775[1].method977(53, 11);
            }
            if (arg5[2] != -1 && arg3 != 2) {
                class34.field775[2].method977(82, 11);
            }
            if (arg5[3] != -1 && arg3 != 3) {
                class34.field775[3].method977(115, 12);
            }
            if (arg5[4] != -1 && arg3 != 4) {
                class34.field775[4].method977(153, 13);
            }
            if (arg5[5] != -1 && arg3 != 5) {
                class34.field775[5].method977(180, 11);
            }
            if (arg5[6] != -1 && arg3 != 6) {
                class34.field775[6].method977(208, 13);
            }
        }
        if (arg1 != 2) {
            return;
        }
        class125.field2715.method91(516, arg0, 11675, 160);
        class11.field180.method92((byte) -4);
        class61.field1357.method977(0, 0);
        if (arg4) {
            if (arg5[arg2] != -1) {
                if (arg2 == 7) {
                    class15.field292.method977(42, 0);
                }
                if (arg2 == 8) {
                    class90.field1976.method977(74, 0);
                }
                if (arg2 == 9) {
                    class90.field1976.method977(102, 0);
                }
                if (arg2 == 10) {
                    class7.field117.method977(130, 1);
                }
                if (arg2 == 11) {
                    class57.field1302.method977(173, 0);
                }
                if (arg2 == 12) {
                    class57.field1302.method977(201, 0);
                }
                if (arg2 == 13) {
                    class1.field10.method977(229, 0);
                }
            }
            if (arg5[8] != -1 && arg3 != 8) {
                class34.field775[7].method977(74, 2);
            }
            if (arg5[9] != -1 && arg3 != 9) {
                class34.field775[8].method977(102, 3);
            }
            if (arg5[10] != -1 && arg3 != 10) {
                class34.field775[9].method977(137, 4);
            }
            if (arg5[11] != -1 && arg3 != 11) {
                class34.field775[10].method977(174, 2);
            }
            if (arg5[12] != -1 && arg3 != 12) {
                class34.field775[11].method977(201, 2);
            }
            if (arg5[13] != -1 && arg3 != 13) {
                class34.field775[12].method977(226, 2);
            }
        }
        class11.field180.method91(496, arg0, arg1 + 11673, 466);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IILvb;I)Lj;")
    public static final class54 method406(int arg0, int arg1, class122 arg2, int arg3) {
        field1170++;
        if (class47.method381((byte) -44, arg2, arg0, arg3)) {
            return arg1 == 100 ? class42.method330(false) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Z)V")
    public static final void method407(boolean arg0) {
        field1166++;
        if (class122.field2659 == 0) {
            class11.field179 = new class111(4, 104, 104, class118.field2523);
            for (int var1 = 0; var1 < 4; var1++) {
                class43.field922[var1] = new class117(104, 104);
            }
            class13.field215 = new class26(512, 512);
            class122.field2659 = 20;
            class68.field1530 = 5;
            class93.field2055 = class127.field2739;
        } else if (class122.field2659 == 20) {
            int[] var2 = new int[9];
            for (int var3 = 0; var3 < 9; var3++) {
                int var4 = var3 * 32 + 128 + 15;
                int var5 = var4 * 3 + 600;
                int var6 = class60.field1326[var4];
                var2[var3] = var5 * var6 >> 16;
            }
            class111.method809(var2, 500, 800, 512, 334);
            class93.field2055 = class66.field1521;
            class122.field2659 = 25;
            class68.field1530 = 10;
        } else {
            try {
                if (class122.field2659 == 25) {
                    if (class109.field2283 != null && class13.field236 != null && class13.field236.method696((byte) -100) < 60000L) {
                        field1169 = new class63[5];
                        for (int var7 = 0; var7 < 5; var7++) {
                            field1169[var7] = new class63(var7 + 1, class109.field2283, class56.field1293[var7], 500000);
                        }
                        class98.field2170 = new class63[12];
                        for (int var8 = 0; var8 < 12; var8++) {
                            class98.field2170[var8] = new class63(var8, class13.field236, class4.field74[var8], 500000);
                        }
                        class68.field1530 = 15;
                        class7.field109 = 0;
                        class93.field2055 = class36.field807;
                        class122.field2659 = 26;
                        return;
                    }
                    class68.field1530 = 15;
                    class122.field2659 = 30;
                    class93.field2055 = class12.field207;
                    return;
                }
                if (class122.field2659 == 26) {
                    while (class7.field109 < 65535) {
                        class21.method145((byte) -101, class7.field109++, field1169[1], class98.field2170[7]);
                        if ((class7.field109 & 0xFF) == 0) {
                            class93.field2055 = class68.method537(1, new class28[] { class92.field2021, class5.method25(6366, class7.field109 * 100 / 65536), class88.field1967 });
                            class68.field1530 = 15;
                            return;
                        }
                    }
                    class7.field109 = 0;
                    class93.field2055 = class126.field2734;
                    class68.field1530 = 15;
                    class122.field2659 = 27;
                    return;
                }
                if (class122.field2659 == 27) {
                    while (class7.field109 < 65535) {
                        class21.method145((byte) -101, class7.field109++, field1169[3], class98.field2170[6]);
                        if ((class7.field109 & 0xFF) == 0) {
                            class93.field2055 = class68.method537(1, new class28[] { class114.field2440, class5.method25(6366, class7.field109 * 100 / 65536), class88.field1967 });
                            class68.field1530 = 15;
                            return;
                        }
                    }
                    class68.field1530 = 15;
                    class93.field2055 = class1.field9;
                    class122.field2659 = 28;
                    class7.field109 = 0;
                    return;
                }
                if (class122.field2659 == 28) {
                    while (class7.field109 < 65535) {
                        class21.method145((byte) -101, class7.field109++, field1169[4], class98.field2170[5]);
                        if ((class7.field109 & 0xFF) == 0) {
                            class93.field2055 = class68.method537(1, new class28[] { class103.field2199, class5.method25(6366, class7.field109 * 100 / 65536), class88.field1967 });
                            class68.field1530 = 15;
                            return;
                        }
                    }
                    class93.field2055 = class95.field2099;
                    class122.field2659 = 30;
                    class68.field1530 = 15;
                    return;
                }
            } catch (Exception var35) {
                if (class122.field2659 < 30) {
                    class122.field2659 = 30;
                }
            }
            if (class122.field2659 == 30) {
                class56.field1285 = class51.method418(true, false, 0, 3537);
                class4.field61 = class51.method418(true, false, 1, 3537);
                class23.field522 = class51.method418(false, true, 2, 3537);
                class55.field1258 = class51.method418(true, false, 3, 3537);
                class117.field2491 = class51.method418(true, false, 4, 3537);
                class7.field101 = class51.method418(true, true, 5, 3537);
                class61.field1344 = class51.method418(true, true, 6, 3537);
                class95.field2094 = class51.method418(true, false, 7, 3537);
                class46.field1044 = class51.method418(true, false, 8, 3537);
                class109.field2309 = class51.method418(true, false, 9, 3537);
                class72.field1596 = class51.method418(true, false, 10, 3537);
                client.field380 = class51.method418(true, false, 11, 3537);
                class68.field1530 = 20;
                class93.field2055 = class66.field1508;
                class87.method644(class93.field2055, class68.field1530, 27429, null);
                class122.field2659 = 40;
            } else if (class122.field2659 == 40) {
                byte var9 = 0;
                int var10 = var9 + class56.field1285.method53(true) * 5 / 100;
                int var11 = var10 + class4.field61.method53(true) * 5 / 100;
                int var12 = var11 + class23.field522.method53(true) * 5 / 100;
                int var13 = var12 + class55.field1258.method53(arg0) * 5 / 100;
                int var14 = var13 + class117.field2491.method53(true) * 5 / 100;
                int var15 = var14 + class7.field101.method53(arg0) * 5 / 100;
                int var16 = var15 + class61.field1344.method53(true) * 5 / 100;
                int var17 = var16 + class95.field2094.method53(arg0) * 45 / 100;
                int var18 = var17 + class46.field1044.method53(arg0) * 5 / 100;
                int var19 = var18 + class109.field2309.method53(true) * 5 / 100;
                int var20 = var19 + class72.field1596.method53(arg0) * 5 / 100;
                int var21 = var20 + client.field380.method53(true) * 5 / 100;
                if (var21 == 100) {
                    class23.field522.method52(true, -17758);
                    class56.field1285.method52(false, -17758);
                    class4.field61.method52(false, -17758);
                    class55.field1258.method52(false, -17758);
                    class117.field2491.method52(false, -17758);
                    class7.field101.method52(false, -17758);
                    class95.field2094.method52(false, -17758);
                    class46.field1044.method52(false, -17758);
                    class109.field2309.method52(false, -17758);
                    class72.field1596.method52(false, -17758);
                    client.field380.method52(false, -17758);
                    class68.field1530 = 30;
                    class93.field2055 = class103.field2204;
                    class122.field2659 = 45;
                } else {
                    class93.field2055 = class68.method537(1, new class28[] { class27.field589, class5.method25(6366, var21), class88.field1967 });
                    class68.field1530 = 30;
                }
            } else if (class122.field2659 == 45) {
                class88.method652(0, class30.field652, (byte) 42);
                class40.field863 = class20.method139((byte) 115, class94.method677((byte) 6), class30.field652);
                class11.field182 = new class114(22050, class114.field2442);
                class68.field1530 = 35;
                class122.field2659 = 50;
                class93.field2055 = class105.field2225;
            } else if (class122.field2659 == 50) {
                int var22 = 0;
                if (class124.field2700 == null) {
                    class124.field2700 = class51.method412(1, class46.field1044, class125.field2721, class78.field1810);
                } else {
                    var22++;
                }
                if (class124.field2697 == null) {
                    class124.field2697 = class51.method412(1, class46.field1044, class125.field2721, class43.field937);
                } else {
                    var22++;
                }
                if (class126.field2737 == null) {
                    class126.field2737 = class51.method412(1, class46.field1044, class125.field2721, class105.field2224);
                } else {
                    var22++;
                }
                if (class18.field369 == null) {
                    class18.field369 = class51.method412(1, class46.field1044, class125.field2721, class13.field235);
                } else {
                    var22++;
                }
                if (var22 < 4) {
                    class93.field2055 = class68.method537(1, new class28[] { class55.field1266, class5.method25(6366, var22 * 100 / 4), class88.field1967 });
                    class68.field1530 = 40;
                } else {
                    class68.field1530 = 40;
                    class93.field2055 = class16.field311;
                    class47.field1076 = new class54[] { class124.field2700, class124.field2697, class126.field2737, class18.field369 };
                    class122.field2659 = 60;
                }
            } else if (class122.field2659 == 60) {
                int var23 = class63.method509(class72.field1596, -16272, class46.field1044);
                int var24 = class2.method7(false);
                if (var23 < var24) {
                    class93.field2055 = class68.method537(1, new class28[] { class46.field1051, class5.method25(6366, var23 * 100 / var24), class88.field1967 });
                    class68.field1530 = 50;
                } else {
                    class68.field1530 = 50;
                    class93.field2055 = class37.field851;
                    class74.method574(0, 5);
                    class122.field2659 = 70;
                }
            } else if (class122.field2659 == 70) {
                if (class23.field522.method938(32453)) {
                    class14.method80(class23.field522, 96);
                    class31.method250(-6, class23.field522);
                    class122.method939(14667, class23.field522, class95.field2094);
                    class96.method694(class95.field2094, true, class23.field522, class72.field1591);
                    class18.method102(!arg0, class95.field2094, class23.field522);
                    class79.method601(class95.field2094, 10, class23.field522, class74.field1640);
                    class27.method201(class4.field61, class56.field1285, class23.field522, 25153);
                    class12.method61(class95.field2094, 918, class23.field522);
                    class21.method153(-124, class23.field522);
                    class7.method33(class23.field522, -20767);
                    class92.method667(256, class55.field1258, class95.field2094, class46.field1044);
                    class93.field2055 = class103.field2201;
                    class122.field2659 = 80;
                    class68.field1530 = 60;
                } else {
                    class93.field2055 = class68.method537(1, new class28[] { field1178, class5.method25(6366, class23.field522.method47(-8981)), class88.field1967 });
                    class68.field1530 = 60;
                }
            } else if (class122.field2659 == 80) {
                int var25 = 0;
                if (class78.field1816 == null) {
                    class78.field1816 = class63.method508((byte) 105, class125.field2721, class27.field584, class46.field1044);
                } else {
                    var25++;
                }
                if (class70.field1572 == null) {
                    class70.field1572 = class63.method508((byte) 108, class125.field2721, class22.field489, class46.field1044);
                } else {
                    var25++;
                }
                if (class94.field2076 == null) {
                    class94.field2076 = class72.method570((byte) 17, class46.field1044, class125.field2721, class3.field35);
                } else {
                    var25++;
                }
                if (class92.field2020 == null) {
                    class92.field2020 = class53.method428(class46.field1034, (byte) -41, class46.field1044, class125.field2721);
                } else {
                    var25++;
                }
                if (class57.field1304 == null) {
                    class57.field1304 = class53.method428(class1.field12, (byte) -41, class46.field1044, class125.field2721);
                } else {
                    var25++;
                }
                if (class51.field1186 == null) {
                    class51.field1186 = class53.method428(class90.field1987, (byte) -41, class46.field1044, class125.field2721);
                } else {
                    var25++;
                }
                if (class86.field1930 == null) {
                    class86.field1930 = class53.method428(class103.field2196, (byte) -41, class46.field1044, class125.field2721);
                } else {
                    var25++;
                }
                if (class114.field2443 == null) {
                    class114.field2443 = class53.method428(class105.field2219, (byte) -41, class46.field1044, class125.field2721);
                } else {
                    var25++;
                }
                if (class118.field2508 == null) {
                    class118.field2508 = class63.method508((byte) 113, class125.field2721, class61.field1362, class46.field1044);
                } else {
                    var25++;
                }
                if (class74.field1646 == null) {
                    class74.field1646 = class53.method428(class64.field1428, (byte) -41, class46.field1044, class125.field2721);
                } else {
                    var25++;
                }
                if (class118.field2511 == null) {
                    class118.field2511 = class53.method428(class124.field2688, (byte) -41, class46.field1044, class125.field2721);
                } else {
                    var25++;
                }
                if (class94.field2081 == null) {
                    class94.field2081 = class53.method428(class76.field1711, (byte) -41, class46.field1044, class125.field2721);
                } else {
                    var25++;
                }
                if (class21.field484 == null) {
                    class21.field484 = class72.method570((byte) 17, class46.field1044, class125.field2721, class46.field1033);
                } else {
                    var25++;
                }
                if (class20.field439 == null) {
                    class20.field439 = class72.method570((byte) 17, class46.field1044, class125.field2721, class76.field1718);
                } else {
                    var25++;
                }
                if (var25 < 14) {
                    class93.field2055 = class68.method537(1, new class28[] { class8.field143, class5.method25(6366, var25 * 100 / 14), class88.field1967 });
                    class68.field1530 = 70;
                } else {
                    class70.field1572.method190();
                    int var26 = (int) (Math.random() * 21.0D) - 10;
                    int var27 = (int) (Math.random() * 21.0D) - 10;
                    int var28 = (int) (Math.random() * 21.0D) - 10;
                    int var29 = (int) (Math.random() * 41.0D) - 20;
                    for (int var30 = 0; var30 < class92.field2020.length; var30++) {
                        class92.field2020[var30].method186(var27 + var29, var26 + var29, var28 + var29);
                    }
                    class94.field2076[0].method979(var27 + var29, var26 + var29, var28 + var29);
                    class122.field2659 = 85;
                    class93.field2055 = class66.field1519;
                    class68.field1530 = 70;
                }
            } else {
                if (!arg0) {
                    method405(null, -53, -105, -12, true, null);
                }
                if (class122.field2659 == 85) {
                    int var31 = class51.method413(class46.field1044, 0);
                    int var32 = class43.method340(104);
                    if (var32 > var31) {
                        class93.field2055 = class68.method537(1, new class28[] { class98.field2172, class5.method25(6366, var31 * 100 / var32), class88.field1967 });
                        class68.field1530 = 80;
                    } else {
                        class122.field2659 = 90;
                        class93.field2055 = class46.field1049;
                        class68.field1530 = 80;
                    }
                } else if (class122.field2659 == 90) {
                    if (class109.field2309.method938(32453)) {
                        class3 var33 = new class3(class109.field2309, class46.field1044, 20, 0.8D, class72.field1591 ? 64 : 128);
                        class60.method488(var33);
                        class60.method485(0.8D);
                        class93.field2055 = class27.field581;
                        class68.field1530 = 90;
                        class122.field2659 = 110;
                    } else {
                        class93.field2055 = class68.method537(1, new class28[] { class93.field2056, class5.method25(6366, class109.field2309.method47(-8981)), class88.field1967 });
                        class68.field1530 = 90;
                    }
                } else if (class122.field2659 == 110) {
                    class45.field999 = new class12();
                    class30.field652.method617(class45.field999, -10172, 10);
                    class68.field1530 = 94;
                    class93.field2055 = class14.field256;
                    class122.field2659 = 120;
                } else if (class122.field2659 == 120) {
                    if (class72.field1596.method935(class125.field2721, 1, class90.field1991)) {
                        class23 var34 = new class23(class72.field1596.method934(2, class125.field2721, class90.field1991));
                        class66.method527(var34, (byte) -50);
                        class68.field1530 = 96;
                        class93.field2055 = class123.field2678;
                        class122.field2659 = 130;
                    } else {
                        class93.field2055 = class90.field1978;
                        class68.field1530 = 96;
                    }
                } else if (class122.field2659 == 130) {
                    if (class55.field1258.method938(32453)) {
                        class93.field2055 = class49.field1142;
                        class68.field1530 = 100;
                        class122.field2659 = 140;
                    } else {
                        class93.field2055 = class68.method537(1, new class28[] { class69.field1556, class5.method25(6366, class55.field1258.method47(-8981)), class88.field1967 });
                        class68.field1530 = 100;
                    }
                } else if (class122.field2659 == 140) {
                    class74.method574(0, 10);
                    class21.field481 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZIII)I")
    public static final int method408(boolean arg0, int arg1, int arg2, int arg3) {
        if (arg0) {
            field1174 = null;
        }
        int var4 = 256 - arg1;
        field1168++;
        return ((arg3 & 0xFF00) * var4 + (arg2 & 0xFF00) * arg1 & 0xFF0000) + ((arg3 & 0xFF00FF) * var4 + ((arg2 & 0xFF00FF) * arg1) & 0xFF00FF00) >> 8;
    }
}
