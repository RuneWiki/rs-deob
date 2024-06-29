import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public abstract class class69 {

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "Lgd;")
    public static class44 field1633 = new class44(64);

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "[Lwd;")
    public static class140[] field1636 = new class140[2048];

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "Lkc;")
    private static class67 field1642 = class19.method144("Enter object name", 125);

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "Lkc;")
    public static class67 field1638 = field1642;

    @OriginalMember(owner = "client!ke", name = "q", descriptor = "I")
    public static int field1647 = 0;

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "Lkc;")
    private static class67 field1641 = class19.method144("Connecting to update server", 100);

    @OriginalMember(owner = "client!ke", name = "o", descriptor = "Lkc;")
    public static class67 field1645 = class19.method144("backtop1", 125);

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "Lkc;")
    public static class67 field1637 = field1641;

    @OriginalMember(owner = "client!ke", name = "n", descriptor = "Lgd;")
    public static class44 field1644 = new class44(64);

    @OriginalMember(owner = "client!ke", name = "t", descriptor = "[I")
    public static int[] field1650 = new int[500];

    @OriginalMember(owner = "client!ke", name = "s", descriptor = "I")
    public static int field1649 = 0;

    @OriginalMember(owner = "client!ke", name = "v", descriptor = "Lkc;")
    public static class67 field1652 = null;

    @OriginalMember(owner = "client!ke", name = "u", descriptor = "Lkc;")
    public static class67 field1651 = class19.method144(" )2> ", 81);

    @OriginalMember(owner = "client!ke", name = "w", descriptor = "Lgd;")
    public static class44 field1653 = new class44(500);

    @OriginalMember(owner = "client!ke", name = "y", descriptor = "Z")
    public static boolean field1655 = false;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "I")
    public static int field1646;

    @OriginalMember(owner = "client!ke", name = "r", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "Lqc;")
    public static class103 field1640;

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "Lta;")
    public static class119 field1639;

    @OriginalMember(owner = "client!ke", name = "x", descriptor = "Lta;")
    public static class119 field1654;

    @OriginalMember(owner = "client!ke", name = "m", descriptor = "Lac;")
    public static class4 field1643;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z)V", line = 11)
    public static void method571(boolean arg0) {
        field1654 = null;
        field1638 = null;
        field1640 = null;
        field1653 = null;
        field1636 = null;
        if (arg0) {
            method572(-27);
        }
        field1645 = null;
        field1637 = null;
        field1639 = null;
        field1642 = null;
        field1652 = null;
        field1650 = null;
        field1651 = null;
        field1644 = null;
        field1641 = null;
        field1643 = null;
        field1633 = null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V", line = 41)
    public static final void method572(int arg0) {
        if (arg0 == 0) {
            class45.field1105 = true;
            class113.field2616 = true;
            field1646++;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IB)V", line = 131)
    public static final void method573(int arg0, byte arg1) {
        field1632++;
        if (arg0 < 0) {
            return;
        }
        int var2 = class65.field1538[arg0];
        int var3 = class71.field1698[arg0];
        int var4 = field1650[arg0];
        if (var4 >= 2000) {
            var4 -= 2000;
        }
        int var5 = class29.field615[arg0];
        if (class41.field1008 != 0 && var4 != 1006) {
            class138.field3304 = true;
            class41.field1008 = 0;
        }
        if (var4 == 21) {
            class67 var6 = class109.field2471[arg0];
            int var7 = var6.method520(class46.field1120, -10874);
            if (var7 != -1) {
                if (class96.field2163 == -1) {
                    class14.method113(-1);
                    if (class52.field1271 != -1) {
                        class127.field2968 = var6.method531(13401, var7 + 5).method525((byte) 56);
                        class82.field1959 = false;
                        class20.field413 = class96.field2163 = class52.field1271;
                    }
                } else {
                    class50.method412(class67.field1591, false, 0, class127.field2976);
                }
            }
        }
        if (var4 == 54) {
            class66 var8 = class9.field189[var5];
            if (var8 != null) {
                class38.method308(1, 0, field1640.field1263[0], 1, var8.field1198[0], 2, var8.field1263[0], 0, false, 0, -14415, field1640.field1198[0]);
                class9.field195 = 2;
                class20.field406 = class109.field2504;
                class50.field1242 = class74.field1758;
                class112.field2591 = 0;
                class54.field1295.method713(503, 210);
                class24.field504++;
                class54.field1295.method1098(var5, (byte) 2);
            }
        }
        if (var4 == 24) {
            class128.field2985++;
            class54.field1295.method713(503, 90);
            class54.field1295.method1079(-106701336, var5);
            class54.field1295.method1085(var3, (byte) 32);
            class54.field1295.method1111(var2, (byte) -125);
            class126.field2936 = var3;
            class103.field2301 = 0;
            class85.field2002 = var2;
            class25.field533 = 2;
            if (var2 >> 16 == class96.field2163) {
                class25.field533 = 1;
            }
            if (var2 >> 16 == class63.field1487) {
                class25.field533 = 3;
            }
        }
        if (var4 == 9) {
            class66 var9 = class9.field189[var5];
            if (var9 != null) {
                class38.method308(1, 0, field1640.field1263[0], 1, var9.field1198[0], 2, var9.field1263[0], 0, false, 0, -14415, field1640.field1198[0]);
                class50.field1242 = class74.field1758;
                class20.field406 = class109.field2504;
                class112.field2591 = 0;
                class59.field1402++;
                class9.field195 = 2;
                class54.field1295.method713(503, 199);
                class54.field1295.method1098(var5, (byte) 2);
                class54.field1295.method1089(class134.field3192, 128);
                class54.field1295.method1109(class99.field2225, -1910610960);
                class54.field1295.method1085(class88.field2024, (byte) 32);
            }
        }
        if (arg1 <= 31) {
            return;
        }
        if (var4 == 17) {
            class103 var10 = class44.field1067[var5];
            if (var10 != null) {
                class100.field2239++;
                class38.method308(1, 0, field1640.field1263[0], 1, var10.field1198[0], 2, var10.field1263[0], 0, false, 0, -14415, field1640.field1198[0]);
                class9.field195 = 2;
                class20.field406 = class109.field2504;
                class112.field2591 = 0;
                class50.field1242 = class74.field1758;
                class54.field1295.method713(503, 46);
                class54.field1295.method1089(var5, 128);
            }
        }
        if (var4 == 22) {
            class108.field2438++;
            boolean var11 = class38.method308(0, 0, field1640.field1263[0], 0, var3, 2, var2, 0, false, 0, -14415, field1640.field1198[0]);
            if (!var11) {
                class38.method308(1, 0, field1640.field1263[0], 1, var3, 2, var2, 0, false, 0, -14415, field1640.field1198[0]);
            }
            class20.field406 = class109.field2504;
            class50.field1242 = class74.field1758;
            class112.field2591 = 0;
            class9.field195 = 2;
            class54.field1295.method713(503, 101);
            class54.field1295.method1079(-106701336, var3 + class32.field685);
            class54.field1295.method1085(var2 + class30.field640, (byte) 32);
            class54.field1295.method1089(var5, 128);
        }
        if (var4 == 48) {
            class14.method113(-1);
        }
        if (var4 == 49) {
            class54.field1295.method713(503, 252);
            class54.field1295.method1085(var5, (byte) 32);
            class70.field1664++;
            class54.field1295.method1098(class134.field3192, (byte) 2);
            class54.field1295.method1098(class88.field2024, (byte) 2);
            class54.field1295.method1111(var2, (byte) -127);
            class54.field1295.method1100(class99.field2225, (byte) -92);
            class54.field1295.method1085(var3, (byte) 32);
            class25.field533 = 2;
            class85.field2002 = var2;
            class126.field2936 = var3;
            class103.field2301 = 0;
            if (var2 >> 16 == class96.field2163) {
                class25.field533 = 1;
            }
            if (var2 >> 16 == class63.field1487) {
                class25.field533 = 3;
            }
        }
        if (var4 == 20) {
            class33 var13 = class93.method738(1, var3, var2);
            if (var13 != null) {
                class34.method288(-126);
                class134.method1037(var3, class108.method822(class83.method649((byte) -102, var13), (byte) 94), var2, (byte) -117);
                class25.field535 = 0;
                class121.field2849 = true;
                field1652 = class73.method594(var13, 127);
                if (field1652 == null) {
                    field1652 = class131.field3106;
                }
                if (var13.field722) {
                    class90.field2068 = class63.method479(new class67[] { var13.field736, class46.field1120 }, 0);
                } else {
                    class90.field2068 = class63.method479(new class67[] { class25.field536, var13.field759, class46.field1120 }, 0);
                }
                if (class106.field2423 == 16 && !var13.field722) {
                    class131.field3089 = 3;
                    class96.field2165 = true;
                    class121.field2849 = true;
                }
            }
            return;
        }
        if (var4 == 2) {
            class54.field1295.method713(503, 152);
            class54.field1291++;
            class54.field1295.method1089(var3, 128);
            class54.field1295.method1109(var2, -1910610960);
            class54.field1295.method1098(var5, (byte) 2);
            class126.field2936 = var3;
            class85.field2002 = var2;
            class103.field2301 = 0;
            class25.field533 = 2;
            if (var2 >> 16 == class96.field2163) {
                class25.field533 = 1;
            }
            if (var2 >> 16 == class63.field1487) {
                class25.field533 = 3;
            }
        }
        if (var4 == 25) {
            class66 var14 = class9.field189[var5];
            if (var14 != null) {
                class97.field2194++;
                class38.method308(1, 0, field1640.field1263[0], 1, var14.field1198[0], 2, var14.field1263[0], 0, false, 0, -14415, field1640.field1198[0]);
                class112.field2591 = 0;
                class9.field195 = 2;
                class50.field1242 = class74.field1758;
                class20.field406 = class109.field2504;
                class54.field1295.method713(503, 150);
                class54.field1295.method1086((byte) -75, class1.field7);
                class54.field1295.method1085(class81.field1914, (byte) 32);
                class54.field1295.method1089(var5, 128);
            }
        }
        if (var4 == 56) {
            class34.method288(-127);
            class25.field535 = 1;
            class134.field3192 = var3;
            class88.field2024 = var5;
            class121.field2849 = true;
            class99.field2225 = var2;
            class96.field2168 = class63.method479(new class67[] { class116.field2741, class55.method440(var5, 21467).field3103, class46.field1120 }, 0);
            if (class96.field2168 == null) {
                class96.field2168 = class141.field3403;
            }
            return;
        }
        if (var4 == 10 || var4 == 40) {
            class67 var15 = class109.field2471[arg0];
            int var16 = var15.method520(class46.field1120, -10874);
            if (var16 != -1) {
                class67 var17 = var15.method531(13401, var16 + 5).method525((byte) 56);
                class67 var18 = var17.method537(-126).method528((byte) -26);
                boolean var19 = false;
                for (int var20 = 0; var20 < class81.field1948; var20++) {
                    class103 var21 = class44.field1067[class119.field2820[var20]];
                    if (var21 != null && var21.field2329 != null && var21.field2329.method535(var18, (byte) 100)) {
                        class38.method308(1, 0, field1640.field1263[0], 1, var21.field1198[0], 2, var21.field1263[0], 0, false, 0, -14415, field1640.field1198[0]);
                        if (var4 == 10) {
                            class140.field3358++;
                            class54.field1295.method713(503, 153);
                            class54.field1295.method1085(class119.field2820[var20], (byte) 32);
                        }
                        if (var4 == 40) {
                            class54.field1295.method713(503, 2);
                            class71.field1699++;
                            class54.field1295.method1085(class119.field2820[var20], (byte) 32);
                        }
                        var19 = true;
                        break;
                    }
                }
                if (!var19) {
                    class50.method412(class63.method479(new class67[] { class52.field1269, var18 }, 0), false, 0, class127.field2976);
                }
            }
        }
        if (var4 == 1005) {
            class33 var22 = class88.method685((byte) -99, var2);
            if (var22 == null || var22.field738[var3] < 100000) {
                class100.field2246++;
                class54.field1295.method713(503, 247);
                class54.field1295.method1089(var5, 128);
            } else {
                class50.method412(class63.method479(new class67[] { class71.method586(103, var22.field738[var3]), class126.field2948, class55.method440(var5, 21467).field3103 }, 0), false, 0, class127.field2976);
            }
            class103.field2301 = 0;
            class85.field2002 = var2;
            class25.field533 = 2;
            class126.field2936 = var3;
            if (var2 >> 16 == class96.field2163) {
                class25.field533 = 1;
            }
            if (var2 >> 16 == class63.field1487) {
                class25.field533 = 3;
            }
        }
        if (var4 == 1003) {
            class60.method472(var2, var3, var5, 0);
            class54.field1295.method713(503, 73);
            class30.field620++;
            class54.field1295.method1079(-106701336, var3 + class32.field685);
            class54.field1295.method1089(var5 >> 14 & 0x7FFF, 128);
            class54.field1295.method1089(class30.field640 + var2, 128);
        }
        if (var4 == 5) {
            class45.field1094++;
            boolean var23 = class38.method308(0, 0, field1640.field1263[0], 0, var3, 2, var2, 0, false, 0, -14415, field1640.field1198[0]);
            if (!var23) {
                class38.method308(1, 0, field1640.field1263[0], 1, var3, 2, var2, 0, false, 0, -14415, field1640.field1198[0]);
            }
            class50.field1242 = class74.field1758;
            class20.field406 = class109.field2504;
            class112.field2591 = 0;
            class9.field195 = 2;
            class54.field1295.method713(503, 176);
            class54.field1295.method1085(var2 + class30.field640, (byte) 32);
            class54.field1295.method1085(var5, (byte) 32);
            class54.field1295.method1098(class32.field685 + var3, (byte) 2);
        }
        if (var4 == 38 && class60.method472(var2, var3, var5, 0)) {
            class134.field3191++;
            class54.field1295.method713(503, 193);
            class54.field1295.method1086((byte) -90, class99.field2225);
            class54.field1295.method1085(var5 >> 14 & 0x7FFF, (byte) 32);
            class54.field1295.method1089(class30.field640 + var2, 128);
            class54.field1295.method1089(class32.field685 + var3, 128);
            class54.field1295.method1079(-106701336, class88.field2024);
            class54.field1295.method1079(-106701336, class134.field3192);
        }
        if (var4 == 16) {
            class88.method686((byte) 2, class49.field1177);
            class49.field1177 = -1;
            class138.field3304 = true;
        }
        if (var4 == 43) {
            class54.field1295.method713(503, 160);
            class61.field1439++;
            class54.field1295.method1089(var5, 128);
            class54.field1295.method1079(-106701336, var3);
            class54.field1295.method1100(var2, (byte) 109);
            class126.field2936 = var3;
            class85.field2002 = var2;
            class25.field533 = 2;
            class103.field2301 = 0;
            if (var2 >> 16 == class96.field2163) {
                class25.field533 = 1;
            }
            if (var2 >> 16 == class63.field1487) {
                class25.field533 = 3;
            }
        }
        if (var4 == 44) {
            class67 var25 = class109.field2471[arg0];
            int var26 = var25.method520(class46.field1120, -10874);
            if (var26 != -1) {
                long var27 = var25.method531(13401, var26 + 5).method525((byte) 56).method532(-86);
                int var29 = -1;
                for (int var30 = 0; var30 < class9.field188; var30++) {
                    if (class31.field650[var30] == var27) {
                        var29 = var30;
                        break;
                    }
                }
                if (var29 != -1 && class46.field1107[var29] > 0) {
                    class138.field3304 = true;
                    class127.field2967 = class127.field2976;
                    class30.field645 = 3;
                    class41.field1008 = 0;
                    class21.field434 = true;
                    class141.field3390 = class31.field650[var29];
                    class127.field2963 = class63.method479(new class67[] { class74.field1760, class55.field1349[var29] }, 0);
                }
            }
        }
        if (var4 == 32) {
            class103 var31 = class44.field1067[var5];
            if (var31 != null) {
                class38.method308(1, 0, field1640.field1263[0], 1, var31.field1198[0], 2, var31.field1263[0], 0, false, 0, -14415, field1640.field1198[0]);
                class112.field2591 = 0;
                class9.field195 = 2;
                class50.field1242 = class74.field1758;
                class71.field1699++;
                class20.field406 = class109.field2504;
                class54.field1295.method713(503, 2);
                class54.field1295.method1085(var5, (byte) 32);
            }
        }
        if (var4 == 29) {
            class60.method472(var2, var3, var5, 0);
            class54.field1295.method713(503, 61);
            class138.field3307++;
            class54.field1295.method1079(-106701336, class32.field685 + var3);
            class54.field1295.method1089(class30.field640 + var2, 128);
            class54.field1295.method1098(var5 >> 14 & 0x7FFF, (byte) 2);
        }
        if (var4 == 57) {
            class60.method472(var2, var3, var5, 0);
            class114.field2694++;
            class54.field1295.method713(503, 78);
            class54.field1295.method1079(-106701336, class32.field685 + var3);
            class54.field1295.method1079(-106701336, var5 >> 14 & 0x7FFF);
            class54.field1295.method1085(class30.field640 + var2, (byte) 32);
        }
        if (var4 == 14) {
            class54.field1295.method713(503, 9);
            class21.field423++;
            class54.field1295.method1098(class81.field1914, (byte) 2);
            class54.field1295.method1111(class1.field7, (byte) -127);
            class54.field1295.method1098(var3, (byte) 2);
            class54.field1295.method1079(-106701336, var5);
            class54.field1295.method1086((byte) -80, var2);
            class25.field533 = 2;
            class126.field2936 = var3;
            class103.field2301 = 0;
            class85.field2002 = var2;
            if (var2 >> 16 == class96.field2163) {
                class25.field533 = 1;
            }
            if (var2 >> 16 == class63.field1487) {
                class25.field533 = 3;
            }
        }
        if (var4 == 13) {
            class103 var32 = class44.field1067[var5];
            if (var32 != null) {
                class67.field1600++;
                class38.method308(1, 0, field1640.field1263[0], 1, var32.field1198[0], 2, var32.field1263[0], 0, false, 0, -14415, field1640.field1198[0]);
                class50.field1242 = class74.field1758;
                class9.field195 = 2;
                class112.field2591 = 0;
                class20.field406 = class109.field2504;
                class54.field1295.method713(503, 229);
                class54.field1295.method1089(class134.field3192, 128);
                class54.field1295.method1109(class99.field2225, -1910610960);
                class54.field1295.method1098(class88.field2024, (byte) 2);
                class54.field1295.method1098(var5, (byte) 2);
            }
        }
        if (var4 == 19) {
            class54.field1295.method713(503, 108);
            class54.field1295.method1085(var5, (byte) 32);
            class2.field29++;
            class54.field1295.method1098(var3, (byte) 2);
            class54.field1295.method1109(var2, -1910610960);
            class25.field533 = 2;
            if (var2 >> 16 == class96.field2163) {
                class25.field533 = 1;
            }
            class126.field2936 = var3;
            class103.field2301 = 0;
            if (var2 >> 16 == class63.field1487) {
                class25.field533 = 3;
            }
            class85.field2002 = var2;
        }
        if (var4 == 26) {
            class66 var33 = class9.field189[var5];
            if (var33 != null) {
                class55.field1341++;
                class38.method308(1, 0, field1640.field1263[0], 1, var33.field1198[0], 2, var33.field1263[0], 0, false, 0, -14415, field1640.field1198[0]);
                class50.field1242 = class74.field1758;
                class112.field2591 = 0;
                class9.field195 = 2;
                class20.field406 = class109.field2504;
                class54.field1295.method713(503, 97);
                class54.field1295.method1089(var5, 128);
            }
        }
        if (var4 == 27) {
            class117.field2785++;
            class54.field1295.method713(503, 76);
            class54.field1295.method1085(var5, (byte) 32);
            class54.field1295.method1109(var2, -1910610960);
            class54.field1295.method1089(var3, 128);
            class103.field2301 = 0;
            class126.field2936 = var3;
            class85.field2002 = var2;
            class25.field533 = 2;
            if (var2 >> 16 == class96.field2163) {
                class25.field533 = 1;
            }
            if (var2 >> 16 == class63.field1487) {
                class25.field533 = 3;
            }
        }
        if (var4 == 46) {
            class54.field1295.method713(503, 254);
            class44.field1087++;
            class54.field1295.method1100(var2, (byte) 96);
            class33 var34 = class88.method685((byte) -99, var2);
            if (var34.field749 != null && var34.field749[0][0] == 5) {
                int var35 = var34.field749[0][1];
                class5.field109[var35] = 1 - class5.field109[var35];
                class90.method704(false, var35);
                class121.field2849 = true;
            }
        }
        if (var4 == 23) {
            class60.method472(var2, var3, var5, 0);
            class60.field1431++;
            class54.field1295.method713(503, 203);
            class54.field1295.method1079(-106701336, var2 + class30.field640);
            class54.field1295.method1098(var5 >> 14 & 0x7FFF, (byte) 2);
            class54.field1295.method1085(class32.field685 + var3, (byte) 32);
        }
        if (var4 == 51) {
            class66 var36 = class9.field189[var5];
            if (var36 != null) {
                class38.method308(1, 0, field1640.field1263[0], 1, var36.field1198[0], 2, var36.field1263[0], 0, false, 0, -14415, field1640.field1198[0]);
                class70.field1660++;
                class112.field2591 = 0;
                class50.field1242 = class74.field1758;
                class20.field406 = class109.field2504;
                class9.field195 = 2;
                class54.field1295.method713(503, 44);
                class54.field1295.method1079(-106701336, var5);
            }
        }
        if (var4 == 52 && class98.field2218 == -1) {
            class12.method104(var2, false, var3);
            class127.field2972 = var3;
            class98.field2218 = var2;
        }
        if (var4 == 6) {
            boolean var37 = class38.method308(0, 0, field1640.field1263[0], 0, var3, 2, var2, 0, false, 0, -14415, field1640.field1198[0]);
            class112.field2571++;
            if (!var37) {
                class38.method308(1, 0, field1640.field1263[0], 1, var3, 2, var2, 0, false, 0, -14415, field1640.field1198[0]);
            }
            class20.field406 = class109.field2504;
            class112.field2591 = 0;
            class9.field195 = 2;
            class50.field1242 = class74.field1758;
            class54.field1295.method713(503, 186);
            class54.field1295.method1079(-106701336, var2 + class30.field640);
            class54.field1295.method1089(class81.field1914, 128);
            class54.field1295.method1086((byte) -104, class1.field7);
            class54.field1295.method1085(var5, (byte) 32);
            class54.field1295.method1098(var3 + class32.field685, (byte) 2);
        }
        if (var4 == 11 || var4 == 3 || var4 == 50 || var4 == 28) {
            class67 var39 = class109.field2471[arg0];
            int var40 = var39.method520(class46.field1120, -10874);
            if (var40 != -1) {
                long var41 = var39.method531(13401, var40 + 5).method525((byte) 56).method532(-70);
                if (var4 == 11) {
                    class94.method743(var41, (byte) -59);
                }
                if (var4 == 3) {
                    class74.method602(var41, (byte) 75);
                }
                if (var4 == 50) {
                    class9.method78(var41, (byte) -124);
                }
                if (var4 == 28) {
                    class14.method114(var41, (byte) 125);
                }
            }
        }
        if (var4 == 12) {
            class54.field1295.method713(503, 254);
            class54.field1295.method1100(var2, (byte) -106);
            class44.field1087++;
            class33 var43 = class88.method685((byte) -119, var2);
            if (var43.field749 != null && var43.field749[0][0] == 5) {
                int var44 = var43.field749[0][1];
                if (class5.field109[var44] != var43.field744[0]) {
                    class5.field109[var44] = var43.field744[0];
                    class90.method704(false, var44);
                    class121.field2849 = true;
                }
            }
        }
        if (var4 == 31) {
            field1634++;
            boolean var45 = class38.method308(0, 0, field1640.field1263[0], 0, var3, 2, var2, 0, false, 0, -14415, field1640.field1198[0]);
            if (!var45) {
                class38.method308(1, 0, field1640.field1263[0], 1, var3, 2, var2, 0, false, 0, -14415, field1640.field1198[0]);
            }
            class9.field195 = 2;
            class112.field2591 = 0;
            class50.field1242 = class74.field1758;
            class20.field406 = class109.field2504;
            class54.field1295.method713(503, 119);
            class54.field1295.method1085(class32.field685 + var3, (byte) 32);
            class54.field1295.method1089(var5, 128);
            class54.field1295.method1098(class30.field640 + var2, (byte) 2);
        }
        if (var4 == 30) {
            class76.field1807++;
            boolean var47 = class38.method308(0, 0, field1640.field1263[0], 0, var3, 2, var2, 0, false, 0, -14415, field1640.field1198[0]);
            if (!var47) {
                class38.method308(1, 0, field1640.field1263[0], 1, var3, 2, var2, 0, false, 0, -14415, field1640.field1198[0]);
            }
            class112.field2591 = 0;
            class9.field195 = 2;
            class50.field1242 = class74.field1758;
            class20.field406 = class109.field2504;
            class54.field1295.method713(503, 147);
            class54.field1295.method1089(class32.field685 + var3, 128);
            class54.field1295.method1098(class30.field640 + var2, (byte) 2);
            class54.field1295.method1098(var5, (byte) 2);
        }
        if (var4 == 37) {
            class101.field2260++;
            class54.field1295.method713(503, 246);
            class54.field1295.method1111(var2, (byte) -128);
            class54.field1295.method1079(-106701336, var5);
            class54.field1295.method1079(-106701336, var3);
            class126.field2936 = var3;
            class25.field533 = 2;
            class85.field2002 = var2;
            class103.field2301 = 0;
            if (var2 >> 16 == class96.field2163) {
                class25.field533 = 1;
            }
            if (var2 >> 16 == class63.field1487) {
                class25.field533 = 3;
            }
        }
        if (var4 == 1) {
            class38.field867++;
            class54.field1295.method713(503, 81);
            class54.field1295.method1100(var2, (byte) -60);
            class54.field1295.method1111(class1.field7, (byte) -128);
            class54.field1295.method1089(var3, 128);
            class54.field1295.method1079(-106701336, class81.field1914);
        }
        if (var4 == 18) {
            if (class90.field2066) {
                class103.field2332.method887(var3 - 4, var2 + -4);
            } else {
                class103.field2332.method887(class74.field1758 - 4, class109.field2504 + -4);
            }
        }
        if (var4 == 1002) {
            class50.field1242 = class74.field1758;
            class20.field406 = class109.field2504;
            class9.field195 = 2;
            class112.field2591 = 0;
            class66 var49 = class9.field189[var5];
            if (var49 != null) {
                class73 var50 = var49.field1542;
                if (var50.field1734 != null) {
                    var50 = var50.method587(1);
                }
                if (var50 != null) {
                    class54.field1295.method713(503, 248);
                    class22.field494++;
                    class54.field1295.method1085(var50.field1740, (byte) 32);
                }
            }
        }
        if (var4 == 15) {
            class106.field2417++;
            class54.field1295.method713(503, 121);
            class54.field1295.method1086((byte) -114, var2);
            class54.field1295.method1089(var5, 128);
            class54.field1295.method1089(var3, 128);
            class103.field2301 = 0;
            class85.field2002 = var2;
            class25.field533 = 2;
            if (var2 >> 16 == class96.field2163) {
                class25.field533 = 1;
            }
            class126.field2936 = var3;
            if (var2 >> 16 == class63.field1487) {
                class25.field533 = 3;
            }
        }
        if (var4 == 33) {
            class33 var51 = class88.method685((byte) -126, var2);
            boolean var52 = true;
            if (var51.field764 > 0) {
                var52 = class75.method610(var51, (byte) -67);
            }
            if (var52) {
                class54.field1295.method713(503, 254);
                class44.field1087++;
                class54.field1295.method1100(var2, (byte) 96);
            }
        }
        if (var4 == 39) {
            class65.field1526++;
            class60.method472(var2, var3, var5, 0);
            class54.field1295.method713(503, 47);
            class54.field1295.method1089(var2 + class30.field640, 128);
            class54.field1295.method1098(class32.field685 + var3, (byte) 2);
            class54.field1295.method1079(-106701336, var5 >> 14 & 0x7FFF);
        }
        if (var4 == 8) {
            client.field462++;
            class54.field1295.method713(503, 63);
            class54.field1295.method1111(var2, (byte) -127);
            class54.field1295.method1079(-106701336, var5);
            class54.field1295.method1079(-106701336, var3);
            class103.field2301 = 0;
            class25.field533 = 2;
            class85.field2002 = var2;
            if (var2 >> 16 == class96.field2163) {
                class25.field533 = 1;
            }
            class126.field2936 = var3;
            if (var2 >> 16 == class63.field1487) {
                class25.field533 = 3;
            }
        }
        if (var4 == 35 && class60.method472(var2, var3, var5, 0)) {
            class141.field3391++;
            class54.field1295.method713(503, 86);
            class54.field1295.method1098(class30.field640 + var2, (byte) 2);
            class54.field1295.method1089(class81.field1914, 128);
            class54.field1295.method1109(class1.field7, -1910610960);
            class54.field1295.method1079(-106701336, var5 >> 14 & 0x7FFF);
            class54.field1295.method1085(class32.field685 + var3, (byte) 32);
        }
        if (var4 == 45) {
            class133.method1029(var5, var3, var2, (byte) -123);
        }
        if (var4 == 7) {
            class103 var53 = class44.field1067[var5];
            if (var53 != null) {
                field1635++;
                class38.method308(1, 0, field1640.field1263[0], 1, var53.field1198[0], 2, var53.field1263[0], 0, false, 0, -14415, field1640.field1198[0]);
                class112.field2591 = 0;
                class9.field195 = 2;
                class20.field406 = class109.field2504;
                class50.field1242 = class74.field1758;
                class54.field1295.method713(503, 161);
                class54.field1295.method1079(-106701336, var5);
            }
        }
        if (var4 == 58) {
            class66 var54 = class9.field189[var5];
            if (var54 != null) {
                class38.method308(1, 0, field1640.field1263[0], 1, var54.field1198[0], 2, var54.field1263[0], 0, false, 0, -14415, field1640.field1198[0]);
                class20.field406 = class109.field2504;
                class9.field195 = 2;
                class50.field1242 = class74.field1758;
                class10.field205++;
                class112.field2591 = 0;
                class54.field1295.method713(503, 69);
                class54.field1295.method1079(-106701336, var5);
            }
        }
        if (var4 == 34) {
            class77.field1819++;
            boolean var55 = class38.method308(0, 0, field1640.field1263[0], 0, var3, 2, var2, 0, false, 0, -14415, field1640.field1198[0]);
            if (!var55) {
                class38.method308(1, 0, field1640.field1263[0], 1, var3, 2, var2, 0, false, 0, -14415, field1640.field1198[0]);
            }
            class112.field2591 = 0;
            class50.field1242 = class74.field1758;
            class9.field195 = 2;
            class20.field406 = class109.field2504;
            class54.field1295.method713(503, 70);
            class54.field1295.method1085(class30.field640 + var2, (byte) 32);
            class54.field1295.method1089(var5, 128);
            class54.field1295.method1085(var3 + class32.field685, (byte) 32);
        }
        if (var4 == 55) {
            class54.field1295.method713(503, 173);
            class42.field1054++;
            class54.field1295.method1089(var3, 128);
            class54.field1295.method1079(-106701336, var5);
            class54.field1295.method1086((byte) -98, var2);
            class103.field2301 = 0;
            class126.field2936 = var3;
            class85.field2002 = var2;
            class25.field533 = 2;
            if (var2 >> 16 == class96.field2163) {
                class25.field533 = 1;
            }
            if (var2 >> 16 == class63.field1487) {
                class25.field533 = 3;
            }
        }
        if (var4 == 1001) {
            class9.field195 = 2;
            class20.field406 = class109.field2504;
            class112.field2591 = 0;
            class100.field2246++;
            class50.field1242 = class74.field1758;
            class54.field1295.method713(503, 247);
            class54.field1295.method1089(var5, 128);
        }
        if (var4 == 36) {
            class103 var57 = class44.field1067[var5];
            if (var57 != null) {
                class140.field3358++;
                class38.method308(1, 0, field1640.field1263[0], 1, var57.field1198[0], 2, var57.field1263[0], 0, false, 0, -14415, field1640.field1198[0]);
                class112.field2591 = 0;
                class9.field195 = 2;
                class50.field1242 = class74.field1758;
                class20.field406 = class109.field2504;
                class54.field1295.method713(503, 153);
                class54.field1295.method1085(var5, (byte) 32);
            }
        }
        if (var4 == 42) {
            class103 var58 = class44.field1067[var5];
            if (var58 != null) {
                class106.field2435++;
                class38.method308(1, 0, field1640.field1263[0], 1, var58.field1198[0], 2, var58.field1263[0], 0, false, 0, -14415, field1640.field1198[0]);
                class50.field1242 = class74.field1758;
                class20.field406 = class109.field2504;
                class112.field2591 = 0;
                class9.field195 = 2;
                class54.field1295.method713(503, 113);
                class54.field1295.method1089(var5, 128);
            }
        }
        if (var4 == 47) {
            class70.field1675++;
            boolean var59 = class38.method308(0, 0, field1640.field1263[0], 0, var3, 2, var2, 0, false, 0, -14415, field1640.field1198[0]);
            if (!var59) {
                class38.method308(1, 0, field1640.field1263[0], 1, var3, 2, var2, 0, false, 0, -14415, field1640.field1198[0]);
            }
            class20.field406 = class109.field2504;
            class9.field195 = 2;
            class112.field2591 = 0;
            class50.field1242 = class74.field1758;
            class54.field1295.method713(503, 23);
            class54.field1295.method1089(class32.field685 + var3, 128);
            class54.field1295.method1089(class134.field3192, 128);
            class54.field1295.method1098(class30.field640 + var2, (byte) 2);
            class54.field1295.method1111(class99.field2225, (byte) -127);
            class54.field1295.method1089(class88.field2024, 128);
            class54.field1295.method1085(var5, (byte) 32);
        }
        if (var4 == 41) {
            class103 var61 = class44.field1067[var5];
            if (var61 != null) {
                class49.field1168++;
                class38.method308(1, 0, field1640.field1263[0], 1, var61.field1198[0], 2, var61.field1263[0], 0, false, 0, -14415, field1640.field1198[0]);
                class20.field406 = class109.field2504;
                class112.field2591 = 0;
                class9.field195 = 2;
                class50.field1242 = class74.field1758;
                class54.field1295.method713(503, 189);
                class54.field1295.method1085(var5, (byte) 32);
                class54.field1295.method1109(class1.field7, -1910610960);
                class54.field1295.method1079(-106701336, class81.field1914);
            }
        }
        if (var4 == 53) {
            class66 var62 = class9.field189[var5];
            if (var62 != null) {
                class42.field1019++;
                class38.method308(1, 0, field1640.field1263[0], 1, var62.field1198[0], 2, var62.field1263[0], 0, false, 0, -14415, field1640.field1198[0]);
                class50.field1242 = class74.field1758;
                class112.field2591 = 0;
                class20.field406 = class109.field2504;
                class9.field195 = 2;
                class54.field1295.method713(503, 94);
                class54.field1295.method1089(var5, 128);
            }
        }
        if (var4 == 4) {
            class54.field1295.method713(503, 184);
            class54.field1295.method1085(var5, (byte) 32);
            class54.field1295.method1085(var3, (byte) 32);
            class54.field1295.method1086((byte) -101, var2);
            class126.field2936 = var3;
            class25.field533 = 2;
            class85.field2002 = var2;
            if (var2 >> 16 == class96.field2163) {
                class25.field533 = 1;
            }
            class133.field3174++;
            class103.field2301 = 0;
            if (var2 >> 16 == class63.field1487) {
                class25.field533 = 3;
            }
        }
        if (var4 == 1004) {
            class9.field195 = 2;
            class112.field2591 = 0;
            class34.field828++;
            class50.field1242 = class74.field1758;
            class20.field406 = class109.field2504;
            class54.field1295.method713(503, 135);
            class54.field1295.method1079(-106701336, var5 >> 14 & 0x7FFF);
        }
        if (class25.field535 != 0) {
            class25.field535 = 0;
            class121.field2849 = true;
        }
        if (class70.field1674) {
            class34.method288(-126);
            class121.field2849 = true;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(III)I")
    public abstract int method431(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)V")
    public abstract void method430(int arg0);

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V")
    public abstract void method432(byte arg0);
}
