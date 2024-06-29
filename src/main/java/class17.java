import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class17 extends class12 {

    @OriginalMember(owner = "client!cd", name = "Ib", descriptor = "I")
    public static int field423 = 0;

    @OriginalMember(owner = "client!cd", name = "zb", descriptor = "Lpd;")
    public static class94 field414 = class28.method249(-122, "Lade Freunde)2Liste)3)3)3");

    @OriginalMember(owner = "client!cd", name = "Jb", descriptor = "I")
    public static int field424 = 0;

    @OriginalMember(owner = "client!cd", name = "Mb", descriptor = "Lpd;")
    private static class94 field427 = class28.method249(105, "Password: ");

    @OriginalMember(owner = "client!cd", name = "Ob", descriptor = "Lpd;")
    public static class94 field429 = field427;

    @OriginalMember(owner = "client!cd", name = "Nb", descriptor = "Lpd;")
    private static class94 field428 = class28.method249(-91, "K");

    @OriginalMember(owner = "client!cd", name = "wb", descriptor = "Lpd;")
    public static class94 field411 = field428;

    @OriginalMember(owner = "client!cd", name = "Fb", descriptor = "Lpd;")
    public static class94 field420 = field428;

    @OriginalMember(owner = "client!cd", name = "Gb", descriptor = "Lvc;")
    public static class128 field421 = new class128(30);

    @OriginalMember(owner = "client!cd", name = "Xb", descriptor = "I")
    public static int field438 = 0;

    @OriginalMember(owner = "client!cd", name = "Yb", descriptor = "Lpd;")
    private static class94 field439 = class28.method249(96, "glow3:");

    @OriginalMember(owner = "client!cd", name = "Wb", descriptor = "Lpd;")
    private static class94 field437 = class28.method249(-84, "Please try using a different world)3");

    @OriginalMember(owner = "client!cd", name = "ac", descriptor = "Lpd;")
    public static class94 field441 = field437;

    @OriginalMember(owner = "client!cd", name = "Zb", descriptor = "Lpd;")
    public static class94 field440 = field437;

    @OriginalMember(owner = "client!cd", name = "Vb", descriptor = "Lpd;")
    public static class94 field436 = field437;

    @OriginalMember(owner = "client!cd", name = "Tb", descriptor = "Lpd;")
    public static class94 field434 = field437;

    @OriginalMember(owner = "client!cd", name = "Ub", descriptor = "Lpd;")
    public static class94 field435 = field437;

    @OriginalMember(owner = "client!cd", name = "Sb", descriptor = "Lpd;")
    public static class94 field433 = field437;

    @OriginalMember(owner = "client!cd", name = "cc", descriptor = "[Z")
    public static boolean[] field443 = new boolean[5];

    @OriginalMember(owner = "client!cd", name = "dc", descriptor = "Lpd;")
    public static class94 field444 = class28.method249(126, "Ung-Ultiges Anmelde)2Paket)3");

    @OriginalMember(owner = "client!cd", name = "ec", descriptor = "Lpd;")
    public static class94 field445 = class28.method249(-82, "@cr1@");

    @OriginalMember(owner = "client!cd", name = "Rb", descriptor = "Lpd;")
    public static class94 field432 = class28.method249(126, "Wir vermuten ihr Spielkonto wurde gestohlen");

    @OriginalMember(owner = "client!cd", name = "fc", descriptor = "Lpd;")
    public static class94 field446 = field439;

    @OriginalMember(owner = "client!cd", name = "yb", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!cd", name = "Ab", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!cd", name = "Bb", descriptor = "I")
    public int field416;

    @OriginalMember(owner = "client!cd", name = "Cb", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!cd", name = "Db", descriptor = "I")
    public int field418;

    @OriginalMember(owner = "client!cd", name = "Eb", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!cd", name = "Hb", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!cd", name = "Lb", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!cd", name = "Pb", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "client!cd", name = "xb", descriptor = "La;")
    public static class4 field412;

    @OriginalMember(owner = "client!cd", name = "Kb", descriptor = "Lad;")
    public static class5 field425;

    @OriginalMember(owner = "client!cd", name = "Qb", descriptor = "Lad;")
    public static class5 field431;

    @OriginalMember(owner = "client!cd", name = "bc", descriptor = "[I")
    public static int[] field442;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIBII)V", line = 3)
    public static final void method124(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        class29 var5 = (class29) class21.field573.method895(-14156);
        if (arg2 > -124) {
            method129(0);
        }
        while (var5 != null) {
            if (var5.field817 != -1 || var5.field820 != null) {
                int var6 = 0;
                if (arg3 > var5.field819) {
                    var6 += arg3 - var5.field819;
                } else if (arg3 < var5.field816) {
                    var6 += var5.field816 - arg3;
                }
                if (arg4 > var5.field830) {
                    var6 += arg4 - var5.field830;
                } else if (var5.field828 > arg4) {
                    var6 += var5.field828 - arg4;
                }
                if (var6 - 64 > var5.field841 || class31.field897 == 0 || var5.field824 != arg0) {
                    if (var5.field827 != null) {
                        class26.field700.method853(var5.field827);
                        var5.field827 = null;
                    }
                    if (var5.field818 != null) {
                        class26.field700.method853(var5.field818);
                        var5.field818 = null;
                    }
                } else {
                    var6 -= 64;
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    int var7 = (var5.field841 - var6) * class31.field897 / var5.field841;
                    if (var5.field827 != null) {
                        var5.field827.method429(var7);
                    } else if (var5.field817 >= 0) {
                        class35 var8 = class35.method282(class30.field867, var5.field817, 0);
                        if (var8 != null) {
                            class60 var9 = var8.method281().method459(class99.field2512);
                            class53 var10 = class53.method421(var9, 100, var7);
                            var10.method416(-1);
                            class26.field700.method850(var10);
                            var5.field827 = var10;
                        }
                    }
                    if (var5.field818 != null) {
                        var5.field818.method429(var7);
                        if (!var5.field818.method425()) {
                            var5.field818 = null;
                        }
                    } else if (var5.field820 != null && (var5.field823 -= arg1) <= 0) {
                        int var11 = (int) ((double) var5.field820.length * Math.random());
                        class35 var12 = class35.method282(class30.field867, var5.field820[var11], 0);
                        if (var12 != null) {
                            class60 var13 = var12.method281().method459(class99.field2512);
                            class53 var14 = class53.method421(var13, 100, var7);
                            var14.method416(0);
                            class26.field700.method850(var14);
                            var5.field818 = var14;
                            var5.field823 = var5.field825 + (int) ((double) (var5.field831 - var5.field825) * Math.random());
                        }
                    }
                }
            }
            var5 = (class29) class21.field573.method893(true);
        }
        field419++;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(B[B)V", line = 156)
    public static final void method125(byte arg0, byte[] arg1) {
        field413++;
        class122 var2 = new class122(arg1);
        var2.field3047 = arg1.length - 2;
        class31.field887 = var2.method938((byte) -120);
        class100.field2543 = new int[class31.field887];
        class63.field1561 = new byte[class31.field887][];
        class126.field3159 = new int[class31.field887];
        class21.field585 = new int[class31.field887];
        field442 = new int[class31.field887];
        var2.field3047 = arg1.length - class31.field887 * 8 - 7;
        class51.field1274 = var2.method938((byte) -88);
        int var3 = 50 / ((arg0 + 46) / 59);
        class74.field1804 = var2.method938((byte) 32);
        int var4 = (var2.method943(-1025) & 0xFF) + 1;
        for (int var5 = 0; var5 < class31.field887; var5++) {
            class126.field3159[var5] = var2.method938((byte) -87);
        }
        for (int var6 = 0; var6 < class31.field887; var6++) {
            class21.field585[var6] = var2.method938((byte) 40);
        }
        for (int var7 = 0; var7 < class31.field887; var7++) {
            field442[var7] = var2.method938((byte) 51);
        }
        for (int var8 = 0; var8 < class31.field887; var8++) {
            class100.field2543[var8] = var2.method938((byte) -91);
        }
        var2.field3047 = arg1.length + 3 - class31.field887 * 8 - var4 * 3 - 7;
        class13.field331 = new int[var4];
        for (int var9 = 1; var9 < var4; var9++) {
            class13.field331[var9] = var2.method935((byte) -128);
            if (class13.field331[var9] == 0) {
                class13.field331[var9] = 1;
            }
        }
        var2.field3047 = 0;
        for (int var10 = 0; var10 < class31.field887; var10++) {
            int var11 = class100.field2543[var10];
            int var12 = field442[var10];
            int var13 = var11 * var12;
            byte[] var14 = new byte[var13];
            class63.field1561[var10] = var14;
            int var15 = var2.method943(-1025);
            if (var15 == 0) {
                for (int var16 = 0; var16 < var13; var16++) {
                    var14[var16] = var2.method934((byte) -108);
                }
            } else if (var15 == 1) {
                for (int var17 = 0; var17 < var12; var17++) {
                    for (int var18 = 0; var18 < var11; var18++) {
                        var14[var12 * var18 + var17] = var2.method934((byte) -108);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "(I)V", line = 283)
    public static final void method126(int arg0) {
        class23.field605++;
        class29.method258(true, 32);
        class112.method831(true, 118);
        field415++;
        class29.method258(false, 32);
        class112.method831(false, -35);
        class102.method762((byte) -127);
        class20.method154(false);
        if (!class101.field2559) {
            int var1 = class28.field783;
            if (class88.field2234 / 256 > var1) {
                var1 = class88.field2234 / 256;
            }
            if (field443[4] && class136.field3341[4] + 128 > var1) {
                var1 = class136.field3341[4] + 128;
            }
            int var2 = class107.field2668 + class41.field1043 & 0x7FF;
            class63.method471(class25.method226(class64.field1589, class80.field2044.field222, class80.field2044.field177, (byte) -59) - 50, var1 * 3 + 600, class82.field2086, var2, class46.field1124, var1, 23326);
        }
        int var3;
        if (class101.field2559) {
            var3 = class10.method60(0);
        } else {
            var3 = class117.method885(-94);
        }
        int var4 = class105.field2615;
        int var5 = class20.field553;
        int var6 = class103.field2596;
        int var7 = class87.field2207;
        int var8 = class55.field1413;
        for (int var9 = 0; var9 < 5; var9++) {
            if (field443[var9]) {
                int var11 = (int) ((double) -class13.field314[var9] + (double) (class13.field314[var9] * 2 + 1) * Math.random() + Math.sin((double) class97.field2475[var9] / 100.0D * (double) class43.field1087[var9]) * (double) class136.field3341[var9]);
                if (var9 == 3) {
                    class55.field1413 = class55.field1413 + var11 & 0x7FF;
                }
                if (var9 == 2) {
                    class105.field2615 += var11;
                }
                if (var9 == 4) {
                    class87.field2207 += var11;
                    if (class87.field2207 < 128) {
                        class87.field2207 = 128;
                    }
                    if (class87.field2207 > 383) {
                        class87.field2207 = 383;
                    }
                }
                if (var9 == 1) {
                    class103.field2596 += var11;
                }
                if (var9 == 0) {
                    class20.field553 += var11;
                }
            }
        }
        class33.method272(69);
        class48.field1220 = class84.field2121 - 4;
        class48.field1218 = class94.field2411 - 4;
        class48.field1190 = 0;
        class48.field1192 = true;
        class130.method1031();
        class64.field1585.method206(class20.field553, class103.field2596, class105.field2615, class87.field2207, class55.field1413, var3);
        class64.field1585.method208();
        class89.method662(3);
        class72.method536(2);
        ((class79) class124.field3148).method589(114, class66.field1620);
        class86.method630((byte) -115);
        if (class8.field182 && class119.method889(true, false, 0) == 0) {
            class8.field182 = false;
        }
        int var10 = -121 / ((arg0 + 7) / 62);
        if (class8.field182) {
            class33.method272(109);
            class130.method1031();
            class135.method1065(false, (byte) 124, class84.field2125, null);
        }
        class45.method341(false);
        class105.field2615 = var4;
        class20.field553 = var5;
        class55.field1413 = var8;
        class103.field2596 = var6;
        class87.field2207 = var7;
    }

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "(Z)V", line = 404)
    public static void method127(boolean arg0) {
        field434 = null;
        field442 = null;
        field414 = null;
        field445 = null;
        field420 = null;
        field427 = null;
        field429 = null;
        if (arg0) {
            method128(true, null, 70, -20, (byte) 36);
        }
        field440 = null;
        field437 = null;
        field412 = null;
        field446 = null;
        field411 = null;
        field436 = null;
        field432 = null;
        field431 = null;
        field428 = null;
        field441 = null;
        field439 = null;
        field435 = null;
        field443 = null;
        field444 = null;
        field433 = null;
        field421 = null;
        field425 = null;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z[IIIB)V", line = 438)
    public static final void method128(boolean arg0, int[] arg1, int arg2, int arg3, byte arg4) {
        class87.field2201.method496(55);
        field426++;
        class79.field2003.method33(0, 0);
        if (arg0) {
            if (arg1[arg3] != -1) {
                if (arg3 == 0) {
                    class38.field996.method33(22, 10);
                }
                if (arg3 == 1) {
                    class75.field1836.method33(54, 8);
                }
                if (arg3 == 2) {
                    class75.field1836.method33(82, 8);
                }
                if (arg3 == 3) {
                    class80.field2045.method33(110, 8);
                }
                if (arg3 == 4) {
                    class31.field879.method33(153, 8);
                }
                if (arg3 == 5) {
                    class31.field879.method33(181, 8);
                }
                if (arg3 == 6) {
                    field431.method33(209, 9);
                }
            }
            if (arg1[0] != -1 && arg2 != 0) {
                class134.field3264[0].method33(29, 13);
            }
            if (arg1[1] != -1 && arg2 != 1) {
                class134.field3264[1].method33(53, 11);
            }
            if (arg1[2] != -1 && arg2 != 2) {
                class134.field3264[2].method33(82, 11);
            }
            if (arg1[3] != -1 && arg2 != 3) {
                class134.field3264[3].method33(115, 12);
            }
            if (arg1[4] != -1 && arg2 != 4) {
                class134.field3264[4].method33(153, 13);
            }
            if (arg1[5] != -1 && arg2 != 5) {
                class134.field3264[5].method33(180, 11);
            }
            if (arg1[6] != -1 && arg2 != 6) {
                class134.field3264[6].method33(208, 13);
            }
        }
        class69.field1663.method496(55);
        class87.field2206.method33(0, 0);
        if (arg4 != 35) {
            field424 = -2;
        }
        if (arg0) {
            if (arg1[arg3] != -1) {
                if (arg3 == 7) {
                    field425.method33(42, 0);
                }
                if (arg3 == 8) {
                    class87.field2226.method33(74, 0);
                }
                if (arg3 == 9) {
                    class87.field2226.method33(102, 0);
                }
                if (arg3 == 10) {
                    class86.field2190.method33(130, 1);
                }
                if (arg3 == 11) {
                    class89.field2319.method33(173, 0);
                }
                if (arg3 == 12) {
                    class89.field2319.method33(201, 0);
                }
                if (arg3 == 13) {
                    class51.field1278.method33(229, 0);
                }
            }
            if (arg1[8] != -1 && arg2 != 8) {
                class134.field3264[7].method33(74, 2);
            }
            if (arg1[9] != -1 && arg2 != 9) {
                class134.field3264[8].method33(102, 3);
            }
            if (arg1[10] != -1 && arg2 != 10) {
                class134.field3264[9].method33(137, 4);
            }
            if (arg1[11] != -1 && arg2 != 11) {
                class134.field3264[10].method33(174, 2);
            }
            if (arg1[12] != -1 && arg2 != 12) {
                class134.field3264[11].method33(201, 2);
            }
            if (arg1[13] != -1 && arg2 != 13) {
                class134.field3264[12].method33(226, 2);
            }
        }
        try {
            Graphics var5 = class128.field3218.getGraphics();
            class87.field2201.method498(160, 516, (byte) -12, var5);
            class69.field1663.method498(466, 496, (byte) -12, var5);
        } catch (Exception var6) {
            class128.field3218.repaint();
        }
    }

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "(I)V", line = 572)
    public static final void method129(int arg0) {
        class50.field1255 = 99;
        if (arg0 > -44) {
            method129(-20);
        }
        class69.field1669 = new int[105][105];
        class23.field599 = new byte[4][104][104];
        class98.field2488 = new int[104];
        class107.field2671 = new int[4][105][105];
        class4.field97 = new int[104];
        class127.field3206 = new byte[4][104][104];
        class40.field1038 = new byte[4][105][105];
        class121.field3018 = new byte[4][104][104];
        class12.field303 = new int[104];
        class99.field2511 = new byte[4][104][104];
        class6.field114 = new int[104];
        class63.field1543 = new int[104];
        field417++;
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(I)Lia;", line = 596)
    public final class48 method77(int arg0) {
        field430++;
        if (arg0 != 1536) {
            field427 = null;
        }
        return class39.method295(this.field418, 1).method804(true, this.field416, true);
    }
}
