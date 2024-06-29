import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public abstract class class362 {

    @OriginalMember(owner = "client!ku", name = "e", descriptor = "Lco;")
    public static class210 field5213 = new class210(4);

    @OriginalMember(owner = "client!ku", name = "g", descriptor = "Lsd;")
    public static class74 field5215 = new class74(103, -2);

    @OriginalMember(owner = "client!ku", name = "h", descriptor = "Lec;")
    public static class40 field5216 = new class40("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");

    @OriginalMember(owner = "client!ku", name = "i", descriptor = "Lpn;")
    public static class72 field5217 = new class72(1, 3);

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "I")
    public static int field5209;

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "I")
    public static int field5210;

    @OriginalMember(owner = "client!ku", name = "c", descriptor = "I")
    public static int field5211;

    @OriginalMember(owner = "client!ku", name = "d", descriptor = "I")
    public static int field5212;

    @OriginalMember(owner = "client!ku", name = "f", descriptor = "I")
    public static int field5214;

    @OriginalMember(owner = "client!ku", name = "k", descriptor = "I")
    public static int field5219;

    @OriginalMember(owner = "client!ku", name = "l", descriptor = "I")
    public static int field5220;

    @OriginalMember(owner = "client!ku", name = "j", descriptor = "Lg;")
    public static class470 field5218;

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(I)V", line = 4)
    public static final void method2202(int arg0) {
        class145.field1742 = arg0;
        class61.field765 = arg0;
        class137.field1662 = arg0;
        class100.field1218 = arg0;
        field5212++;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(Lcj;B)V", line = 14)
    public static final void method2203(class198 arg0, byte arg1) {
        field5210++;
        if (arg1 > -60) {
            return;
        }
        class399 var2 = (class399) class350.field5031.method233(94, (long) arg0.field2457);
        if (var2 == null) {
            class437.method2596(0, arg0.field994, arg0.field2536[0], (class137) null, arg0, (byte) -93, (class415) null, arg0.field2539[0]);
        } else {
            var2.method2386(0);
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(ILoj;II)V", line = 36)
    public static final void method2204(int arg0, class280 arg1, int arg2, int arg3) {
        field5214++;
        if (arg2 < 0 || arg0 < 0 || class406.field5779 == 0 || class481.field6799 == 0) {
            return;
        }
        arg1.method1468(class350.field5032, class178.field2152, class406.field5779, class481.field6799);
        arg1.method1351(class477.field6751, class352.field5063, class406.field5779, class481.field6799);
        class327 var4 = arg1.method1344();
        var4.method549(class305.field4509, class315.field4612, class398.field5664, class86.field1054, class308.field4527, class371.field5318);
        arg1.method1404(var4);
        if (class443.field6329 != null) {
            int var5 = -1;
            int var6 = -1;
            int var7 = arg1.method1470();
            int var8 = (arg2 - class350.field5032) * var7 / class406.field5779;
            int var9 = (arg0 - class178.field2152) * var7 / class481.field6799;
            int var10 = arg1.method1403();
            int var11 = (arg2 - class350.field5032) * var10 / class406.field5779;
            int var12 = (arg0 - class178.field2152) * var10 / class481.field6799;
            int[] var13 = new int[] { var8, var9, var7 };
            var4.method551(var13);
            int[] var14 = new int[] { var11, var12, var10 };
            var4.method551(var14);
            float var15 = 0.0F;
            int var16 = var14[0] - var13[0];
            int var17 = var14[1] - var13[1];
            int var18 = var14[2] - var13[2];
            while (var15 < 1.0F) {
                int var19 = (int) ((float) var16 * var15 + (float) var13[0]);
                int var20 = var19 >> 7;
                int var21 = (int) ((float) var18 * var15 + (float) var13[2]);
                int var22 = var21 >> 7;
                if (var20 > 0 && var22 > 0 && class159.field1895 > var20 && var22 < class289.field4316) {
                    int var23 = class19.field258.field994;
                    if (var23 < 3 && (class140.field1686[1][var20][var22] & 0x2) != 0) {
                        var23++;
                    }
                    if ((float) class443.field6329[var23].method1857(var19, var21) < (float) var17 * var15 + (float) var13[1]) {
                        var5 = var19 + ((class19.field258.method1012(false) - 1) * 64) >> 7;
                        var6 = var21 + (class19.field258.method1012(false) - 1) * 64 >> 7;
                        break;
                    }
                }
                var15 = (float) ((double) var15 + 0.01D);
            }
            if (var5 != -1 && var6 != -1) {
                if (class293.field4359 && (class284.field4135 & 0x40) != 0) {
                    class256 var24 = class66.method339(class274.field3905, 0, class145.field1749);
                    if (var24 == null) {
                        class379.method2270((byte) -37);
                    } else {
                        client.method1672(0L, var5, 21, -1, class435.field6264, class390.field5570, var6, false, " ->", arg3 ^ 0xFFFF8B4E, true);
                    }
                } else {
                    if (class289.field4317 == class262.field3772) {
                        client.method1672(0L, var5, 23, -1, -1, class214.field2958.method205((byte) 111, class68.field849), var6, false, "", 7520, true);
                    }
                    class427.field6148++;
                    client.method1672(0L, var5, 9, -1, -1, class343.field4920, var6, false, "", 7520, true);
                }
            }
        }
        class388 var25 = class305.field4504;
        for (class451 var26 = (class451) var25.method2334(arg3 ^ 0x6989); var26 != null; var26 = (class451) var25.method2340(-97)) {
            if (class19.field258.field994 == var26.field6380 && var26.method2639(arg1, true, arg2, arg0)) {
                if (var26.field6378 instanceof class198) {
                    class198 var27 = (class198) var26.field6378;
                    int var28 = var27.method1012(false);
                    if ((var28 & 0x1) == 0 && (var27.field1008 & 0x7F) == 0 && (var27.field1005 & 0x7F) == 0 || (var28 & 0x1) == 1 && (var27.field1008 & 0x7F) == 64 && (var27.field1005 & 0x7F) == 64) {
                        int var29 = var27.field1008 + 64 - var27.method1012(false) * 64;
                        int var30 = var27.field1005 - ((var27.method1012(false) - 1) * 64);
                        for (int var31 = 0; var31 < class356.field5112; var31++) {
                            class137 var38 = class448.field6366[class25.field353[var31]];
                            if (var38 != null && class204.field2796 != var38.field2488 && var38.field2503) {
                                int var39 = 64 - (var38.field1643.field6695 * 64 - var38.field1008);
                                int var40 = var38.field1005 - ((var38.field1643.field6695 - 1) * 64);
                                if (var39 >= var29 && var38.field1643.field6695 <= var27.method1012(false) - (var39 - var29 >> 7) && var40 >= var30 && var38.field1643.field6695 <= (var27.method1012(false) - (var40 - var30 >> 7))) {
                                    class474.method2804(var38, -122, class19.field258.field994 != var26.field6380);
                                    var38.field2488 = class204.field2796;
                                }
                            }
                        }
                        int var32 = class438.field6286;
                        int[] var33 = class79.field944;
                        for (int var34 = 0; var34 < var32; var34++) {
                            class198 var35 = class46.field596[var33[var34]];
                            if (var35 != null && class204.field2796 != var35.field2488 && var27 != var35 && var35.field2503) {
                                int var36 = var35.field1008 + (64 - (var35.method1012(false) * 64));
                                int var37 = var35.field1005 - (var35.method1012(false) * 64 - 64);
                                if (var36 >= var29 && var35.method1012(false) <= var27.method1012(false) - (var36 - var29 >> 7) && var30 <= var37 && var35.method1012(false) <= (var27.method1012(false) - (var37 - var30 >> 7))) {
                                    class200.method1099(class19.field258.field994 != var26.field6380, 123, var35);
                                    var35.field2488 = class204.field2796;
                                }
                            }
                        }
                    }
                    if (class204.field2796 == var27.field2488) {
                        continue;
                    }
                    class200.method1099(class19.field258.field994 != var26.field6380, arg3 + 27209, var27);
                    var27.field2488 = class204.field2796;
                }
                if (var26.field6378 instanceof class137) {
                    class137 var41 = (class137) var26.field6378;
                    if (var41.field1643 != null) {
                        if ((var41.field1643.field6695 & 0x1) == 0 && (var41.field1008 & 0x7F) == 0 && (var41.field1005 & 0x7F) == 0 || (var41.field1643.field6695 & 0x1) == 1 && (var41.field1008 & 0x7F) == 64 && (var41.field1005 & 0x7F) == 64) {
                            int var42 = var41.field1008 + 64 - (var41.field1643.field6695 * 64);
                            int var43 = var41.field1005 - ((var41.field1643.field6695 - 1) * 64);
                            for (int var44 = 0; var44 < class356.field5112; var44++) {
                                class137 var51 = class448.field6366[class25.field353[var44]];
                                if (var51 != null && class204.field2796 != var51.field2488 && var41 != var51 && var51.field2503) {
                                    int var52 = var51.field1008 - (var51.field1643.field6695 * 64 - 64);
                                    int var53 = var51.field1005 + 64 - (var51.field1643.field6695 * 64);
                                    if (var52 >= var42 && var51.field1643.field6695 <= var41.field1643.field6695 - (var52 - var42 >> 7) && var53 >= var43 && var41.field1643.field6695 - (var53 - var43 >> 7) >= var51.field1643.field6695) {
                                        class474.method2804(var51, -123, class19.field258.field994 != var26.field6380);
                                        var51.field2488 = class204.field2796;
                                    }
                                }
                            }
                            int var45 = class438.field6286;
                            int[] var46 = class79.field944;
                            for (int var47 = 0; var47 < var45; var47++) {
                                class198 var48 = class46.field596[var46[var47]];
                                if (var48 != null && class204.field2796 != var48.field2488 && var48.field2503) {
                                    int var49 = var48.field1008 - (var48.method1012(false) * 64 - 64);
                                    int var50 = var48.field1005 - ((var48.method1012(false) - 1) * 64);
                                    if (var49 >= var42 && var48.method1012(false) <= (var41.field1643.field6695 - (var49 - var42 >> 7)) && var50 >= var43 && var48.method1012(false) <= var41.field1643.field6695 - (var50 - var43 >> 7)) {
                                        class200.method1099(class19.field258.field994 != var26.field6380, arg3 + 27074, var48);
                                        var48.field2488 = class204.field2796;
                                    }
                                }
                            }
                        }
                        if (class204.field2796 == var41.field2488) {
                            continue;
                        }
                        class474.method2804(var41, -94, class19.field258.field994 != var26.field6380);
                        var41.field2488 = class204.field2796;
                    }
                }
                if (var26.field6378 instanceof class24) {
                    class173 var54 = (class173) class76.field913.method233(67, (long) (var26.field6380 << 28 | var26.field6385 << 14 | var26.field6381));
                    if (var54 != null) {
                        for (class76 var55 = (class76) var54.field2080.method807(-18919); var55 != null; var55 = (class76) var54.field2080.method805(91)) {
                            class385 var56 = class422.field6096.method121(var55.field914, -1);
                            if (!class293.field4359) {
                                if (class19.field258.field994 == var26.field6380) {
                                    String[] var57 = var56.field5472;
                                    for (int var58 = 4; var58 >= 0; var58--) {
                                        if (var57 != null && var57[var58] != null) {
                                            byte var59 = 0;
                                            int var60 = class66.field835;
                                            if (var58 == 0) {
                                                var59 = 19;
                                            }
                                            if (var58 == 1) {
                                                var59 = 12;
                                            }
                                            if (var58 == 2) {
                                                var59 = 20;
                                            }
                                            if (var58 == 3) {
                                                var59 = 58;
                                            }
                                            if (var56.field5537 == var58) {
                                                var60 = var56.field5478;
                                            }
                                            if (var58 == 4) {
                                                var59 = 17;
                                            }
                                            if (var56.field5501 == var58) {
                                                var60 = var56.field5476;
                                            }
                                            class285.field4210++;
                                            client.method1672((long) var55.field914, var26.field6381, var59, -1, var60, var57[var58], var26.field6385, false, "<col=ff9040>" + var56.field5469, arg3 ^ 0xFFFF8B4E, true);
                                        }
                                    }
                                }
                                class74.field894++;
                                client.method1672((long) var55.field914, var26.field6381, 1012, -1, class351.field5044, class367.field5247.method205((byte) 100, class68.field849), var26.field6385, class19.field258.field994 != var26.field6380, "<col=ff9040>" + var56.field5469, 7520, true);
                            } else if (class19.field258.field994 == var26.field6380) {
                                class307 var61 = class206.field2828 == -1 ? null : class422.field6084.method2076((byte) -122, class206.field2828);
                                if ((class284.field4135 & 0x1) != 0 && (var61 == null || var56.method2327(class206.field2828, 73, var61.field4519) != var61.field4519)) {
                                    client.method1672((long) var55.field914, var26.field6381, 3, -1, class435.field6264, class390.field5570, var26.field6385, false, class126.field1543 + " -> <col=ff9040>" + var56.field5469, arg3 + 34610, true);
                                    class440.field6300++;
                                }
                            }
                        }
                    }
                }
                if (var26.field6378 instanceof class116) {
                    class116 var62 = (class116) var26.field6378;
                    class415 var63 = class173.field2084.method2297(50, var62.method16(false));
                    if (var63.field5951 != null) {
                        var63 = var63.method2473(-18648, class75.field909);
                    }
                    if (var63 != null) {
                        if (!class293.field4359) {
                            if (class19.field258.field994 == var26.field6380) {
                                String[] var64 = var63.field5949;
                                if (var64 != null) {
                                    for (int var65 = 4; var65 >= 0; var65--) {
                                        if (var64[var65] != null) {
                                            short var66 = 0;
                                            int var67 = class66.field835;
                                            if (var65 == 0) {
                                                var66 = 2;
                                            }
                                            if (var65 == 1) {
                                                var66 = 57;
                                            }
                                            if (var65 == 2) {
                                                var66 = 10;
                                            }
                                            if (var65 == 3) {
                                                var66 = 45;
                                            }
                                            if (var63.field5992 == var65) {
                                                var67 = var63.field5963;
                                            }
                                            if (var65 == 4) {
                                                var66 = 1002;
                                            }
                                            if (var63.field5971 == var65) {
                                                var67 = var63.field5953;
                                            }
                                            class317.field4622++;
                                            client.method1672(class179.method913(var26.field6385, var26.field6381, var62, arg3 + 27091), var26.field6381, var66, -1, var67, var64[var65], var26.field6385, false, "<col=00ffff>" + var63.field5957, 7520, true);
                                        }
                                    }
                                }
                            }
                            client.method1672((long) var63.field5918, var26.field6381, 1004, -1, class351.field5044, class367.field5247.method205((byte) 105, class68.field849), var26.field6385, class19.field258.field994 != var26.field6380, "<col=00ffff>" + var63.field5957, 7520, true);
                            class460.field6488++;
                        } else if (class19.field258.field994 == var26.field6380) {
                            class307 var68 = class206.field2828 == -1 ? null : class422.field6084.method2076((byte) -122, class206.field2828);
                            if ((class284.field4135 & 0x4) != 0 && (var68 == null || var63.method2461(var68.field4519, arg3 ^ 0x17B, class206.field2828) != var68.field4519)) {
                                client.method1672(class179.method913(var26.field6385, var26.field6381, var62, 1), var26.field6381, 51, -1, class435.field6264, class390.field5570, var26.field6385, false, class126.field1543 + " -> <col=00ffff>" + var63.field5957, arg3 ^ 0xFFFF8B4E, true);
                                class74.field893++;
                            }
                        }
                    }
                }
            }
        }
        if (arg3 != -27090) {
            field5220 = 87;
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(Z)V", line = 497)
    public static void method2205(boolean arg0) {
        if (arg0) {
            field5215 = null;
        }
        field5215 = null;
        field5216 = null;
        field5217 = null;
        field5218 = null;
        field5213 = null;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method1106(Component arg0, int arg1);

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    public abstract void method1107(Component arg0, boolean arg1);

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(B)I")
    public abstract int method1108(byte arg0);
}
