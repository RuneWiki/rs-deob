import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class107 extends class118 {

    @OriginalMember(owner = "client!pc", name = "ib", descriptor = "I")
    public int field2691 = -1;

    @OriginalMember(owner = "client!pc", name = "V", descriptor = "I")
    private int field2678 = 0;

    @OriginalMember(owner = "client!pc", name = "db", descriptor = "[S")
    private short[] field2686 = new short[6];

    @OriginalMember(owner = "client!pc", name = "rb", descriptor = "[S")
    private short[] field2700 = new short[6];

    @OriginalMember(owner = "client!pc", name = "W", descriptor = "I")
    private int field2679 = 128;

    @OriginalMember(owner = "client!pc", name = "mb", descriptor = "I")
    private int field2695 = 128;

    @OriginalMember(owner = "client!pc", name = "fb", descriptor = "I")
    private int field2688 = 0;

    @OriginalMember(owner = "client!pc", name = "hb", descriptor = "I")
    private int field2690 = 0;

    @OriginalMember(owner = "client!pc", name = "M", descriptor = "Lfc;")
    public static class39 field2670 = class90.method774("gleiten:", -101);

    @OriginalMember(owner = "client!pc", name = "T", descriptor = "I")
    public static int field2676 = 0;

    @OriginalMember(owner = "client!pc", name = "X", descriptor = "Lfc;")
    public static class39 field2680 = class90.method774("Nehmen", -110);

    @OriginalMember(owner = "client!pc", name = "O", descriptor = "I")
    public static int field2672 = 0;

    @OriginalMember(owner = "client!pc", name = "P", descriptor = "Lfc;")
    public static class39 field2673 = class90.method774(" steht bereits auf Ihrer Ignorieren)2Liste(Q", -117);

    @OriginalMember(owner = "client!pc", name = "kb", descriptor = "Lfc;")
    public static class39 field2693 = class90.method774("", -94);

    @OriginalMember(owner = "client!pc", name = "ab", descriptor = "Lfc;")
    public static class39 field2683 = field2693;

    @OriginalMember(owner = "client!pc", name = "lb", descriptor = "Lfc;")
    private static class39 field2694 = field2693;

    @OriginalMember(owner = "client!pc", name = "Y", descriptor = "Lfc;")
    public static class39 field2681 = field2693;

    @OriginalMember(owner = "client!pc", name = "tb", descriptor = "Lfc;")
    public static class39 field2702 = field2693;

    @OriginalMember(owner = "client!pc", name = "U", descriptor = "Lfc;")
    public static class39 field2677 = field2693;

    @OriginalMember(owner = "client!pc", name = "qb", descriptor = "Z")
    public static boolean field2699 = false;

    @OriginalMember(owner = "client!pc", name = "pb", descriptor = "Lfc;")
    public static class39 field2698 = field2693;

    @OriginalMember(owner = "client!pc", name = "sb", descriptor = "Lfc;")
    public static class39 field2701 = class90.method774("leuchten2:", -102);

    @OriginalMember(owner = "client!pc", name = "cb", descriptor = "Lfc;")
    public static class39 field2685 = field2693;

    @OriginalMember(owner = "client!pc", name = "bb", descriptor = "Lfc;")
    public static class39 field2684 = field2693;

    @OriginalMember(owner = "client!pc", name = "ub", descriptor = "Z")
    public static boolean field2703 = true;

    @OriginalMember(owner = "client!pc", name = "N", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!pc", name = "Q", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!pc", name = "R", descriptor = "I")
    public int field2675;

    @OriginalMember(owner = "client!pc", name = "Z", descriptor = "I")
    private int field2682;

    @OriginalMember(owner = "client!pc", name = "eb", descriptor = "I")
    public static int field2687;

    @OriginalMember(owner = "client!pc", name = "gb", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!pc", name = "jb", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!pc", name = "nb", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!pc", name = "ob", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)Lda;", line = 6)
    public final class23 method943(int arg0, int arg1) {
        field2671++;
        class23 var3 = (class23) class114.field2984.method931(false, (long) this.field2675);
        if (var3 == null) {
            class138 var4 = class138.method1122(class15.field373, this.field2682, 0);
            if (var4 == null) {
                return null;
            }
            for (int var5 = 0; var5 < 6; var5++) {
                if (this.field2700[0] != 0) {
                    var4.method1124(this.field2700[var5], this.field2686[var5]);
                }
            }
            var3 = var4.method1129(this.field2678 + 64, 850 - -this.field2688, -30, -50, -30);
            class114.field2984.method934(arg1 ^ 0x4118, var3, (long) this.field2675);
        }
        class23 var6;
        if (this.field2691 == -1 || arg0 == -1) {
            var6 = var3.method256(true);
        } else {
            var6 = class38.method430(2238, this.field2691).method1015(arg0, (byte) -112, var3);
        }
        if (arg1 != 16664) {
            this.field2682 = -24;
        }
        if (this.field2679 != 128 || this.field2695 != 128) {
            var6.method266(this.field2679, this.field2695, this.field2679);
        }
        if (this.field2690 != 0) {
            if (this.field2690 == 90) {
                var6.method260();
            }
            if (this.field2690 == 180) {
                var6.method260();
                var6.method260();
            }
            if (this.field2690 == 270) {
                var6.method260();
                var6.method260();
                var6.method260();
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "(I)V", line = 103)
    public static final void method944(int arg0) {
        class121.method1036((byte) 61);
        class111.field2882 = true;
        field2696++;
        class126.method1043(true);
        if (class128.field3254) {
            class96.field2224.method720(field2681, 239, 40, 0, -1);
            class96.field2224.method720(class137.method1111(new class39[] { class84.method708(field2683), class150.field3710 }, (byte) 86), 239, 60, 128, -1);
        } else if (class119.field3107 == 1) {
            class96.field2224.method720(class10.field287, 239, 40, 0, -1);
            class96.field2224.method720(class137.method1111(new class39[] { class84.method708(field2702), class150.field3710 }, (byte) -37), 239, 60, 128, -1);
        } else if (class119.field3107 == 2) {
            class96.field2224.method720(class30.field842, 239, 40, 0, -1);
            class96.field2224.method720(class137.method1111(new class39[] { class84.method708(field2702), class150.field3710 }, (byte) 83), 239, 60, 128, -1);
        } else if (class119.field3107 == 3) {
            if (field2702 != field2694) {
                class17.method210(0, field2702);
                field2694 = field2702;
            }
            class84 var1 = class50.field1255;
            class152.method1216(0, 0, 463, 77);
            for (int var2 = 0; var2 < class80.field1809; var2++) {
                int var3 = var2 * 14 + 18 - class37.field1015;
                if (var3 > 0 && var3 < 110) {
                    var1.method720(class103.field2579[var2], 239, var3, 0, -1);
                }
            }
            class152.method1220();
            if (class80.field1809 > 5) {
                class113.method989(class37.field1015, 463, class80.field1809 * 14 + 7, (byte) -42, 0, 77);
            }
            if (field2702.method437(-122) == 0) {
                class96.field2224.method720(class29.field834, 239, 40, 255, -1);
            } else if (class80.field1809 == 0) {
                class96.field2224.method720(class79.field1797, 239, 40, 0, -1);
            }
            var1.method720(class137.method1111(new class39[] { class84.method708(field2702), class150.field3710 }, (byte) 79), 239, 90, 0, -1);
            class152.method1218(0, 77, 479, 0);
        } else if (class119.field3107 == 4) {
            class96.field2224.method720(field2698, 239, 40, 0, -1);
            class96.field2224.method720(class137.method1111(new class39[] { class84.method708(field2702), class150.field3710 }, (byte) 119), 239, 60, 128, -1);
        } else if (class61.field1496 != null) {
            class96.field2224.method699(class61.field1496, 10, 20, 459, 40, 0, -1, 1, 1, 0);
            class96.field2224.method720(class96.field2283, 239, 80, 128, -1);
        } else if (class37.field1008 != -1) {
            boolean var4 = class28.method354(class37.field1008, 96, 0, 2, (byte) -118, 0, 479);
            if (!var4) {
                class128.field3242 = true;
            }
        } else if (class126.field3203 == -1) {
            class84 var6 = class50.field1255;
            class152.method1216(0, 0, 463, 77);
            int var7 = 0;
            for (int var8 = 0; var8 < 100; var8++) {
                if (class112.field2936[var8] != null) {
                    int var10 = class7.field229 + 70 - var7 * 14;
                    class39 var11 = class139.field3515[var8];
                    int var12 = class145.field3623[var8];
                    byte var13 = 0;
                    if (var11 != null && var11.method472(0, class89.field2091)) {
                        var13 = 1;
                        var11 = var11.method469(5, (byte) -127);
                    }
                    if (var11 != null && var11.method472(0, class43.field1177)) {
                        var13 = 2;
                        var11 = var11.method469(5, (byte) -122);
                    }
                    if (var12 == 0) {
                        if (var10 > 0 && var10 < 110) {
                            var6.method700(class112.field2936[var8], 4, var10, 0, -1);
                        }
                        var7++;
                    }
                    if ((var12 == 1 || var12 == 2) && (var12 == 1 || class94.field2203 == 0 || class94.field2203 == 1 && class35.method399(var11, 126))) {
                        if (var10 > 0 && var10 < 110) {
                            int var14 = 4;
                            if (var13 == 1) {
                                class92.field2167[0].method1155(var14, var10 - 12);
                                var14 += 14;
                            }
                            if (var13 == 2) {
                                class92.field2167[1].method1155(var14, var10 - 12);
                                var14 += 14;
                            }
                            var6.method700(class137.method1111(new class39[] { var11, class6.field190 }, (byte) -109), var14, var10, 0, -1);
                            int var15 = var14 + var6.method707(var11) + 8;
                            var6.method700(class112.field2936[var8], var15, var10, 255, -1);
                        }
                        var7++;
                    }
                    if ((var12 == 3 || var12 == 7) && class76.field1734 == 0 && (var12 == 7 || class92.field2164 == 0 || class92.field2164 == 1 && class35.method399(var11, arg0 ^ 0xFFFFFF86))) {
                        if (var10 > 0 && var10 < 110) {
                            byte var16 = 4;
                            var6.method700(class12.field321, var16, var10, 0, -1);
                            int var17 = var16 + var6.method707(class12.field321);
                            int var18 = var17 + var6.method721(32);
                            if (var13 == 1) {
                                class92.field2167[0].method1155(var18, var10 - 12);
                                var18 += 14;
                            }
                            if (var13 == 2) {
                                class92.field2167[1].method1155(var18, var10 - 12);
                                var18 += 14;
                            }
                            var6.method700(class137.method1111(new class39[] { var11, class6.field190 }, (byte) -63), var18, var10, 0, -1);
                            int var19 = var18 + var6.method707(var11) + 8;
                            var6.method700(class112.field2936[var8], var19, var10, 8388608, -1);
                        }
                        var7++;
                    }
                    if (var12 == 4 && (class13.field349 == 0 || class13.field349 == 1 && class35.method399(var11, 127))) {
                        if (var10 > 0 && var10 < 110) {
                            var6.method700(class137.method1111(new class39[] { var11, class82.field1836, class112.field2936[var8] }, (byte) 124), 4, var10, 8388736, -1);
                        }
                        var7++;
                    }
                    if (var12 == 5 && class76.field1734 == 0 && class92.field2164 < 2) {
                        if (var10 > 0 && var10 < 110) {
                            var6.method700(class112.field2936[var8], 4, var10, 8388608, -1);
                        }
                        var7++;
                    }
                    if (var12 == 6 && class76.field1734 == 0 && class92.field2164 < 2) {
                        if (var10 > 0 && var10 < 110) {
                            var6.method700(class137.method1111(new class39[] { class1.field17, class82.field1836, var11, class6.field190 }, (byte) -95), 4, var10, 0, -1);
                            var6.method700(class112.field2936[var8], var6.method707(class137.method1111(new class39[] { class1.field17, class82.field1836, var11 }, (byte) -88)) + 12, var10, 8388608, -1);
                        }
                        var7++;
                    }
                    if (var12 == 8 && (class13.field349 == 0 || class13.field349 == 1 && class35.method399(var11, arg0 + 133))) {
                        var7++;
                        if (var10 > 0 && var10 < 110) {
                            var6.method700(class137.method1111(new class39[] { var11, class82.field1836, class112.field2936[var8] }, (byte) 100), 4, var10, 8270336, -1);
                        }
                    }
                }
            }
            class152.method1220();
            class67.field1595 = var7 * 14 + 7;
            if (class67.field1595 < 78) {
                class67.field1595 = 78;
            }
            class113.method989(class67.field1595 - class7.field229 - 77, 463, class67.field1595, (byte) -42, 0, 77);
            class39 var9;
            if (class94.field2197 == null || class94.field2197.field3575 == null) {
                var9 = class93.field2180;
            } else {
                var9 = class94.field2197.field3575;
            }
            var6.method700(class137.method1111(new class39[] { var9, class6.field190 }, (byte) -72), 4, 90, 0, -1);
            var6.method700(class137.method1111(new class39[] { class84.method708(field2685), class150.field3710 }, (byte) -115), var6.method707(class137.method1111(new class39[] { var9, class86.field1956 }, (byte) 114)) + 6, 90, 255, -1);
            class152.method1218(0, 77, 479, 0);
        } else {
            boolean var5 = class28.method354(class126.field3203, 96, 0, 3, (byte) -113, 0, 479);
            if (!var5) {
                class128.field3242 = true;
            }
        }
        if (class94.field2206 && class50.field1258 == 2) {
            class30.method366(arg0 ^ 0xFF0000F9);
        }
        if (arg0 == -7) {
            class101.method858((byte) 120);
        }
    }

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "(I)V", line = 430)
    public static void method945(int arg0) {
        field2685 = null;
        field2683 = null;
        field2694 = null;
        field2681 = null;
        if (arg0 != -1) {
            field2680 = null;
        }
        field2693 = null;
        field2684 = null;
        field2677 = null;
        field2698 = null;
        field2670 = null;
        field2701 = null;
        field2680 = null;
        field2673 = null;
        field2702 = null;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IJ)V", line = 461)
    public static final void method946(int arg0, long arg1) {
        field2674++;
        if (arg1 == 0L) {
            return;
        }
        for (int var3 = arg0; var3 < class57.field1414; var3++) {
            if (class79.field1795[var3] == arg1) {
                class104.field2638 = true;
                class121.field3158++;
                class57.field1414--;
                for (int var4 = var3; var4 < class57.field1414; var4++) {
                    class79.field1795[var4] = class79.field1795[var4 + 1];
                }
                class79.field1794.method393((byte) -14, 254);
                class79.field1794.method290(arg1, (byte) -43);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ldc;Z)V", line = 515)
    public final void method947(class25 arg0, boolean arg1) {
        field2692++;
        while (true) {
            int var3 = arg0.method322((byte) -50);
            if (var3 == 0) {
                if (arg1) {
                    return;
                } else {
                    method945(-53);
                    return;
                }
            }
            this.method948(var3, arg0, 126);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILdc;I)V", line = 546)
    private final void method948(int arg0, class25 arg1, int arg2) {
        field2687++;
        if (arg0 == 1) {
            this.field2682 = arg1.method301(-4853);
        } else if (arg0 == 2) {
            this.field2691 = arg1.method301(-4853);
        } else if (arg0 == 4) {
            this.field2679 = arg1.method301(-4853);
        } else if (arg0 == 5) {
            this.field2695 = arg1.method301(-4853);
        } else if (arg0 == 6) {
            this.field2690 = arg1.method301(-4853);
        } else if (arg0 == 7) {
            this.field2678 = arg1.method322((byte) -50);
        } else if (arg0 == 8) {
            this.field2688 = arg1.method322((byte) -50);
        } else if (arg0 >= 40 && arg0 < 50) {
            this.field2700[arg0 - 40] = (short) arg1.method301(-4853);
        } else if (arg0 >= 50 && arg0 < 60) {
            this.field2686[arg0 - 50] = (short) arg1.method301(-4853);
        }
        int var4 = -18 % ((74 - arg2) / 49);
    }
}
