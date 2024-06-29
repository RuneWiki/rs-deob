import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class130 extends class19 {

    @OriginalMember(owner = "client!v", name = "Y", descriptor = "Z")
    public static boolean field3038 = false;

    @OriginalMember(owner = "client!v", name = "cb", descriptor = "I")
    public static int field3042 = 0;

    @OriginalMember(owner = "client!v", name = "W", descriptor = "Lkc;")
    private static class67 field3036 = class19.method144("wave:", 92);

    @OriginalMember(owner = "client!v", name = "kb", descriptor = "I")
    public static int field3050 = 0;

    @OriginalMember(owner = "client!v", name = "ob", descriptor = "Lkc;")
    public static class67 field3054 = field3036;

    @OriginalMember(owner = "client!v", name = "fb", descriptor = "Z")
    public static volatile boolean field3045 = true;

    @OriginalMember(owner = "client!v", name = "V", descriptor = "I")
    public static int field3035;

    @OriginalMember(owner = "client!v", name = "X", descriptor = "I")
    public int field3037;

    @OriginalMember(owner = "client!v", name = "Z", descriptor = "I")
    public static int field3039;

    @OriginalMember(owner = "client!v", name = "ab", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!v", name = "db", descriptor = "I")
    public int field3043;

    @OriginalMember(owner = "client!v", name = "eb", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!v", name = "gb", descriptor = "I")
    public static int field3046;

    @OriginalMember(owner = "client!v", name = "hb", descriptor = "I")
    public int field3047;

    @OriginalMember(owner = "client!v", name = "lb", descriptor = "I")
    public int field3051;

    @OriginalMember(owner = "client!v", name = "nb", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!v", name = "pb", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!v", name = "jb", descriptor = "Lja;")
    public static class59 field3049;

    @OriginalMember(owner = "client!v", name = "qb", descriptor = "Ljd;")
    public static class62 field3056;

    @OriginalMember(owner = "client!v", name = "ib", descriptor = "[I")
    public int[] field3048;

    @OriginalMember(owner = "client!v", name = "mb", descriptor = "[I")
    public int[] field3052;

    @OriginalMember(owner = "client!v", name = "bb", descriptor = "[Lkc;")
    public class67[] field3041;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "([BIIIZ)V", line = 8)
    public static final void method1000(byte[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3046++;
        if (class52.field1280 == null) {
            return;
        }
        if (arg2 != 70) {
            field3054 = null;
        }
        if (class97.field2189 >= 0) {
            class25.field539 = arg1;
            if (class97.field2189 == 0) {
                class48.field1163 = 1;
            } else {
                int var5 = class83.method650(40, class97.field2189);
                int var6 = var5 - class119.field2805;
                class48.field1163 = (var6 + 3600) / arg1;
                if (class48.field1163 < 1) {
                    class48.field1163 = 1;
                }
            }
            class14.field302 = arg4;
            client.field465 = arg0;
            class106.field2413 = arg3;
        } else if (class48.field1163 == 0) {
            class46.method385(arg3, 7833, arg4, arg0);
        } else {
            client.field465 = arg0;
            class106.field2413 = arg3;
            class14.field302 = arg4;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ILea;)V", line = 76)
    private static final void method1001(int arg0, class30 arg1) {
        if (arg0 == -27174) {
            field3040++;
            class97.field2188 = arg1;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lac;III)Lnd;", line = 106)
    public static final class86 method1002(class4 arg0, int arg1, int arg2, int arg3) {
        field3053++;
        if (class19.method151((byte) -61, arg0, arg3, arg1)) {
            return arg2 == -61 ? class34.method289(0) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(B)V", line = 129)
    public static final void method1003(byte arg0) {
        field3039++;
        if (class12.field253 == 0) {
            class103.field2332 = new class113(4, 104, 104, class34.field823);
            for (int var1 = 0; var1 < 4; var1++) {
                class14.field295[var1] = new class5(104, 104);
            }
            class7.field158 = new class86(512, 512);
            class71.field1687 = 5;
            class20.field401 = class91.field2118;
            class12.field253 = 20;
        } else if (class12.field253 == 20) {
            int[] var2 = new int[9];
            for (int var3 = 0; var3 < 9; var3++) {
                int var4 = var3 * 32 + 143;
                int var5 = class105.field2365[var4];
                int var6 = var4 * 3 + 600;
                var2[var3] = var5 * var6 >> 16;
            }
            class113.method877(var2, 500, 800, 512, 334);
            class71.field1687 = 10;
            class20.field401 = class141.field3398;
            class12.field253 = 30;
        } else if (class12.field253 == 30) {
            class104.field2346 = class100.method768(0, true, false, (byte) -89, true);
            class94.field2160 = class100.method768(1, true, false, (byte) -105, true);
            class117.field2788 = class100.method768(2, false, true, (byte) -53, true);
            class30.field639 = class100.method768(3, true, false, (byte) -62, true);
            class71.field1684 = class100.method768(4, true, false, (byte) -48, true);
            class132.field3138 = class100.method768(5, true, true, (byte) -55, true);
            class133.field3173 = class100.method768(6, true, true, (byte) -72, false);
            class34.field827 = class100.method768(7, true, false, (byte) -78, true);
            class38.field877 = class100.method768(8, true, false, (byte) -109, true);
            class103.field2318 = class100.method768(9, true, false, (byte) -48, true);
            class121.field2837 = class100.method768(10, true, false, (byte) -40, true);
            class121.field2826 = class100.method768(11, true, false, (byte) -104, true);
            class135.field3236 = class100.method768(12, true, false, (byte) -45, true);
            class134.field3214 = class100.method768(13, false, true, (byte) -107, true);
            class20.field401 = class69.field1637;
            class12.field253 = 40;
            class71.field1687 = 20;
        } else {
            if (arg0 != 120) {
                field3042 = 10;
            }
            if (class12.field253 == 40) {
                byte var7 = 0;
                int var8 = var7 + class104.field2346.method488(arg0 ^ 0x78) * 5 / 100;
                int var9 = var8 + class94.field2160.method488(arg0 - 120) * 5 / 100;
                int var10 = var9 + class117.field2788.method488(0) * 5 / 100;
                int var11 = var10 + class30.field639.method488(0) * 5 / 100;
                int var12 = var11 + class71.field1684.method488(arg0 ^ 0x78) * 5 / 100;
                int var13 = var12 + class132.field3138.method488(arg0 ^ 0x78) * 5 / 100;
                int var14 = var13 + class133.field3173.method488(0) * 5 / 100;
                int var15 = var14 + class34.field827.method488(0) * 40 / 100;
                int var16 = var15 + class38.field877.method488(0) * 5 / 100;
                int var17 = var16 + class103.field2318.method488(arg0 ^ 0x78) * 3 / 100;
                int var18 = var17 + class121.field2837.method488(arg0 - 120) * 5 / 100;
                int var19 = var18 + class121.field2826.method488(arg0 ^ 0x78) * 5 / 100;
                int var20 = var19 + class135.field3236.method488(arg0 - 120) * 5 / 100;
                int var21 = var20 + class134.field3214.method488(0) * 2 / 100;
                if (var21 == 100) {
                    class20.field401 = class77.field1829;
                    class71.field1687 = 30;
                    class12.field253 = 45;
                } else {
                    if (var21 != 0) {
                        class20.field401 = class63.method479(new class67[] { class19.field362, class71.method586(103, var21), class44.field1086 }, 0);
                    }
                    class71.field1687 = 30;
                }
            } else if (class12.field253 == 45) {
                class1.method7(class83.field1966, 0, (byte) 108, !class45.field1105);
                class121.field2836 = class131.method1012((byte) -43, class83.field1966, false, 22050, class129.field3020);
                client.field480 = new class100(22050, class4.field55);
                class71.field1687 = 35;
                class12.field253 = 50;
                class20.field401 = class29.field602;
            } else if (class12.field253 == 50) {
                int var22 = 0;
                if (class32.field687 == null) {
                    class32.field687 = class140.method1076(class127.field2976, class54.field1290, class38.field877, (byte) -53);
                } else {
                    var22++;
                }
                if (class14.field301 == null) {
                    class14.field301 = class140.method1076(class127.field2976, class121.field2827, class38.field877, (byte) -90);
                } else {
                    var22++;
                }
                if (class117.field2789 == null) {
                    class117.field2789 = class140.method1076(class127.field2976, class133.field3185, class38.field877, (byte) -93);
                } else {
                    var22++;
                }
                if (var22 < 3) {
                    class20.field401 = class63.method479(new class67[] { class61.field1444, class71.method586(arg0 ^ 0x1F, var22 * 100 / 3), class44.field1086 }, arg0 ^ 0x78);
                    class71.field1687 = 40;
                } else {
                    class12.field253 = 60;
                    class20.field401 = class117.field2780;
                    class71.field1687 = 40;
                }
            } else if (class12.field253 == 60) {
                int var23 = class76.method618(true, class121.field2837, class38.field877);
                int var24 = class49.method407((byte) -9);
                if (var24 > var23) {
                    class20.field401 = class63.method479(new class67[] { class63.field1469, class71.method586(103, var23 * 100 / var24), class44.field1086 }, arg0 ^ 0x78);
                    class71.field1687 = 50;
                } else {
                    class20.field401 = class88.field2029;
                    class71.field1687 = 50;
                    class126.method981(5, (byte) -120);
                    class12.field253 = 70;
                }
            } else if (class12.field253 == 70) {
                if (class117.field2788.method34(-8444)) {
                    class75.method612((byte) 126, class117.field2788);
                    class127.method989(class117.field2788, arg0 ^ 0xC5);
                    class4.method23(class34.field827, class117.field2788, 0);
                    class65.method500(class45.field1105, class34.field827, class117.field2788, (byte) -74);
                    class49.method410(arg0 - 135, class34.field827, class117.field2788);
                    class100.method769(class117.field2788, class32.field687, 55, class34.field827, class42.field1043);
                    class70.method578(class94.field2160, class117.field2788, 768, class104.field2346);
                    class9.method80(arg0 + 4, class34.field827, class117.field2788);
                    class85.method658((byte) -96, class117.field2788);
                    class46.method388(238, class117.field2788);
                    class48.method399(class38.field877, 4223, class34.field827, class30.field639);
                    class20.field401 = class134.field3222;
                    class12.field253 = 80;
                    class71.field1687 = 60;
                } else {
                    class20.field401 = class63.method479(new class67[] { class25.field549, class71.method586(103, class117.field2788.method486((byte) 120)), class44.field1086 }, 0);
                    class71.field1687 = 60;
                }
            } else if (class12.field253 == 80) {
                int var25 = 0;
                if (class54.field1307 == null) {
                    class54.field1307 = class78.method627(class127.field2976, class5.field132, class38.field877, arg0 - 221);
                } else {
                    var25++;
                }
                if (class97.field2205 == null) {
                    class97.field2205 = class78.method627(class127.field2976, class38.field879, class38.field877, 101);
                } else {
                    var25++;
                }
                if (class134.field3209 == null) {
                    class134.field3209 = class108.method823(class34.field842, class127.field2976, (byte) -106, class38.field877);
                } else {
                    var25++;
                }
                if (class71.field1685 == null) {
                    class71.field1685 = class129.method995(class82.field1953, -122, class38.field877, class127.field2976);
                } else {
                    var25++;
                }
                if (class133.field3176 == null) {
                    class133.field3176 = class129.method995(class74.field1752, 92, class38.field877, class127.field2976);
                } else {
                    var25++;
                }
                if (class7.field147 == null) {
                    class7.field147 = class129.method995(class82.field1956, arg0 - 161, class38.field877, class127.field2976);
                } else {
                    var25++;
                }
                if (class134.field3206 == null) {
                    class134.field3206 = class129.method995(class75.field1787, arg0 ^ 0xFFFFFFD7, class38.field877, class127.field2976);
                } else {
                    var25++;
                }
                if (class22.field491 == null) {
                    class22.field491 = class129.method995(class5.field108, 101, class38.field877, class127.field2976);
                } else {
                    var25++;
                }
                if (class1.field15 == null) {
                    class1.field15 = class78.method627(class127.field2976, class121.field2832, class38.field877, arg0 - 233);
                } else {
                    var25++;
                }
                if (class61.field1462 == null) {
                    class61.field1462 = class129.method995(class54.field1293, -67, class38.field877, class127.field2976);
                } else {
                    var25++;
                }
                if (class19.field367 == null) {
                    class19.field367 = class129.method995(class97.field2190, -89, class38.field877, class127.field2976);
                } else {
                    var25++;
                }
                if (class108.field2456 == null) {
                    class108.field2456 = class129.method995(class58.field1380, -33, class38.field877, class127.field2976);
                } else {
                    var25++;
                }
                if (class116.field2736 == null) {
                    class116.field2736 = class108.method823(class77.field1824, class127.field2976, (byte) -123, class38.field877);
                } else {
                    var25++;
                }
                if (class5.field121 == null) {
                    class5.field121 = class108.method823(class5.field134, class127.field2976, (byte) -121, class38.field877);
                } else {
                    var25++;
                }
                if (var25 < 14) {
                    class20.field401 = class63.method479(new class67[] { class14.field298, class71.method586(103, var25 * 100 / 14), class44.field1086 }, arg0 ^ 0x78);
                    class71.field1687 = 70;
                } else {
                    int var26 = (int) (Math.random() * 21.0D) - 10;
                    class97.field2205.method666();
                    int var27 = (int) (Math.random() * 21.0D) - 10;
                    int var28 = (int) (Math.random() * 41.0D) - 20;
                    int var29 = (int) (Math.random() * 21.0D) - 10;
                    for (int var30 = 0; var30 < class71.field1685.length; var30++) {
                        class71.field1685[var30].method662(var27 + var28, var26 + var28, var28 + var29);
                    }
                    class134.field3209[0].method19(var27 + var28, var26 + var28, var28 + var29);
                    class71.field1687 = 70;
                    class20.field401 = class81.field1932;
                    class12.field253 = 85;
                }
            } else if (class12.field253 == 85) {
                int var31 = class10.method85(114, class38.field877);
                int var32 = class71.method585(-16777217);
                if (var31 < var32) {
                    class20.field401 = class63.method479(new class67[] { class12.field279, class71.method586(103, var31 * 100 / var32), class44.field1086 }, 0);
                    class71.field1687 = 80;
                } else {
                    class12.field253 = 90;
                    class71.field1687 = 80;
                    class20.field401 = class94.field2152;
                }
            } else if (class12.field253 == 90) {
                if (class103.field2318.method34(-8444)) {
                    class117 var33 = new class117(class103.field2318, class38.field877, 20, 0.8D, class45.field1105 ? 64 : 128);
                    class105.method800(var33);
                    class105.method801(0.8D);
                    class12.field253 = 110;
                    class20.field401 = class104.field2348;
                    class71.field1687 = 90;
                } else {
                    class20.field401 = class63.method479(new class67[] { class128.field2991, class71.method586(103, class103.field2318.method486((byte) -69)), class44.field1086 }, 0);
                    class71.field1687 = 90;
                }
            } else if (class12.field253 == 110) {
                class70.field1666 = new class111();
                class83.field1966.method130(10, class70.field1666, -10870);
                class20.field401 = class114.field2695;
                class12.field253 = 120;
                class71.field1687 = 94;
            } else if (class12.field253 == 120) {
                if (class121.field2837.method25(client.field471, 107, class127.field2976)) {
                    class30 var34 = new class30(class121.field2837.method21(class127.field2976, -118, client.field471));
                    method1001(-27174, var34);
                    class20.field401 = class31.field657;
                    class12.field253 = 130;
                    class71.field1687 = 96;
                } else {
                    class20.field401 = class63.method479(new class67[] { class101.field2278, class7.field151 }, 0);
                    class71.field1687 = 96;
                }
            } else if (class12.field253 == 130) {
                if (!class30.field639.method34(-8444)) {
                    class20.field401 = class63.method479(new class67[] { class126.field2945, class71.method586(103, class30.field639.method486((byte) -92) * 4 / 5), class44.field1086 }, 0);
                    class71.field1687 = 100;
                } else if (!class135.field3236.method34(-8444)) {
                    class20.field401 = class63.method479(new class67[] { class126.field2945, class71.method586(arg0 ^ 0x1F, class135.field3236.method486((byte) -50) / 6 + 80), class44.field1086 }, arg0 - 120);
                    class71.field1687 = 100;
                } else if (class134.field3214.method34(-8444)) {
                    class20.field401 = class127.field2970;
                    class71.field1687 = 100;
                    class12.field253 = 140;
                } else {
                    class20.field401 = class63.method479(new class67[] { class126.field2945, class71.method586(103, class134.field3214.method486((byte) 106) / 20 + 96), class44.field1086 }, arg0 ^ 0x78);
                    class71.field1687 = 100;
                }
            } else if (class12.field253 == 140) {
                class126.method981(10, (byte) -120);
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(B)V", line = 559)
    public static void method1004(byte arg0) {
        if (arg0 == -46) {
            field3056 = null;
            field3054 = null;
            field3049 = null;
            field3036 = null;
        }
    }
}
