import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oha")
public class class772 extends class379 {

    @OriginalMember(owner = "client!oha", name = "r", descriptor = "I")
    public int field10613 = 0;

    @OriginalMember(owner = "client!oha", name = "y", descriptor = "Lll;")
    private class385 field10620;

    @OriginalMember(owner = "client!oha", name = "E", descriptor = "I")
    public int field10626;

    @OriginalMember(owner = "client!oha", name = "t", descriptor = "I")
    public int field10615;

    @OriginalMember(owner = "client!oha", name = "u", descriptor = "I")
    public int field10616;

    @OriginalMember(owner = "client!oha", name = "s", descriptor = "[I")
    private int[] field10614;

    @OriginalMember(owner = "client!oha", name = "j", descriptor = "Lwg;")
    private class449 field10605;

    @OriginalMember(owner = "client!oha", name = "n", descriptor = "F")
    public float field10609;

    @OriginalMember(owner = "client!oha", name = "m", descriptor = "I")
    public int field10608;

    @OriginalMember(owner = "client!oha", name = "w", descriptor = "[I")
    public static int[] field10618 = new int[5];

    @OriginalMember(owner = "client!oha", name = "h", descriptor = "I")
    public static int field10603;

    @OriginalMember(owner = "client!oha", name = "i", descriptor = "I")
    public static int field10604;

    @OriginalMember(owner = "client!oha", name = "l", descriptor = "I")
    public static int field10607;

    @OriginalMember(owner = "client!oha", name = "o", descriptor = "I")
    public static int field10610;

    @OriginalMember(owner = "client!oha", name = "q", descriptor = "I")
    public static int field10612;

    @OriginalMember(owner = "client!oha", name = "v", descriptor = "I")
    public static int field10617;

    @OriginalMember(owner = "client!oha", name = "z", descriptor = "I")
    public static int field10621;

    @OriginalMember(owner = "client!oha", name = "A", descriptor = "I")
    public static int field10622;

    @OriginalMember(owner = "client!oha", name = "C", descriptor = "I")
    public static int field10624;

    @OriginalMember(owner = "client!oha", name = "D", descriptor = "I")
    public static int field10625;

    @OriginalMember(owner = "client!oha", name = "B", descriptor = "Loda;")
    private class129 field10623;

    @OriginalMember(owner = "client!oha", name = "p", descriptor = "Lbt;")
    public static class48 field10611;

    @OriginalMember(owner = "client!oha", name = "k", descriptor = "Ljaclib/memory/Stream;")
    private Stream field10606;

    @OriginalMember(owner = "client!oha", name = "x", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field10619;

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(III)V", line = 3)
    public static final void method4276(int arg0, int arg1, int arg2) {
        field10621++;
        class459.method2778(arg1, arg0, 0);
        if (arg2 != 1843888288) {
            field10611 = null;
        }
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(IIII)V", line = 16)
    public final void method4277(int arg0, int arg1, int arg2, int arg3) {
        this.field10614[this.field10620.field3533 * arg2 + arg1] = class5.method105(this.field10614[this.field10620.field3533 * arg2 + arg1], 0x1 << arg3);
        int var5 = 96 / ((arg0 - 72) / 53);
        field10612++;
        this.field10613++;
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(BIIIII)V", line = 28)
    public static final void method4278(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var6 = arg5; var6 <= arg4; var6++) {
            class455.method2755(arg3, class4.field49[var6], (byte) 44, arg1, arg2);
        }
        int var7 = 118 % ((arg0 + 53) / 63);
        field10625++;
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(II)V", line = 55)
    public final void method4279(int arg0, int arg1) {
        field10604++;
        this.field10606.method3992();
        if (arg0 != 10805) {
            this.method4282(39, null, (byte) -41);
        }
        this.field10623 = this.field10605.method57(14, false);
        this.field10623.method272(this.field10619, arg1 * 4, (byte) 34, 4);
        this.field10619 = null;
        this.field10606 = null;
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(ZI)V", line = 72)
    public final void method4280(boolean arg0, int arg1) {
        this.field10619 = this.field10605.method2665(arg1 * 4, arg0, (byte) -46);
        field10610++;
        this.field10606 = new Stream(this.field10619, 0, arg1 * 4);
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(B)V", line = 82)
    public static final void method4281(byte arg0) {
        if (class359.field4466 > 1) {
            class43.field593 = class87.field1156;
            class359.field4466--;
        }
        field10617++;
        if (class455.field6415) {
            class455.field6415 = false;
            class415.method2481(29116);
            return;
        }
        if (!class672.field9218) {
            class331.method1970(121);
        }
        for (int var1 = 0; var1 < 100 && class300.method1750(-88); var1++) {
        }
        if (class289.field3493 != 10) {
            return;
        }
        while (class328.method1950((byte) 124)) {
            class336 var2 = class512.method3076(class333.field4127, class591.field8030, (byte) 103);
            var2.field4150.method2353(-68, 0);
            int var3 = var2.field4150.field5262;
            class31.method297(var2.field4150, 74);
            var2.field4150.method2366(-1, var2.field4150.field5262 - var3);
            class578.method3334(4, var2);
        }
        if (class538.field7582 == null) {
            if (class349.method2069(true) >= class629.field8600) {
                class538.field7582 = class456.field6432.method3019(class55.field743.field4362, 16383);
            }
        } else if (class538.field7582.field2914 != -1) {
            class336 var4 = class512.method3076(class310.field3849, class591.field8030, (byte) 64);
            var4.field4150.method2369(-18090, class538.field7582.field2914);
            class578.method3334(4, var4);
            class538.field7582 = null;
            class629.field8600 = class349.method2069(true) + 30000L;
        }
        class730 var5 = (class730) class155.field1929.method2725(37);
        if (var5 != null || (class349.method2069(true) - 2000L) > class597.field8103) {
            class336 var6 = null;
            int var7 = 0;
            for (class730 var8 = (class730) class642.field8761.method2725(37); var8 != null && (var6 == null || var6.field4150.field5262 - var7 < 240); var8 = (class730) class642.field8761.method2726(-113)) {
                var8.method2219(13630);
                int var9 = var8.method1937(84);
                if (var9 < -1) {
                    var9 = -1;
                } else if (var9 > 65534) {
                    var9 = 65534;
                }
                int var10 = var8.method1936(-564899352);
                if (var10 < -1) {
                    var10 = -1;
                } else if (var10 > 65534) {
                    var10 = 65534;
                }
                if (class752.field10429 != var10 || class159.field1974 != var9) {
                    if (var6 == null) {
                        var6 = class512.method3076(class54.field721, class591.field8030, (byte) 111);
                        class769.field10570++;
                        var6.field4150.method2353(-57, 0);
                        var7 = var6.field4150.field5262;
                    }
                    int var11 = var10 - class752.field10429;
                    class752.field10429 = var10;
                    int var12 = var9 - class159.field1974;
                    class159.field1974 = var9;
                    int var13 = (int) ((var8.method1938(-82) - class597.field8103) / 20L);
                    if (var13 < 8 && var11 >= -32 && var11 <= 31 && var12 >= -32 && var12 <= 31) {
                        var12 += 32;
                        var11 += 32;
                        var6.field4150.method2369(-18090, (var11 << 6) + ((var13 << 12) + var12));
                    } else if (var13 < 32 && var11 >= -128 && var11 <= 127 && var12 >= -128 && var12 <= 127) {
                        var6.field4150.method2353(-88, var13 + 128);
                        var11 += 128;
                        var12 += 128;
                        var6.field4150.method2369(-18090, (var11 << 8) + var12);
                    } else if (var13 < 32) {
                        var6.field4150.method2353(-73, var13 + 192);
                        if (var10 == 1 || var9 == -1) {
                            var6.field4150.method2391(-105, Integer.MIN_VALUE);
                        } else {
                            var6.field4150.method2391(-120, var9 << 16 | var10);
                        }
                    } else {
                        var6.field4150.method2369(-18090, var13 + 57344);
                        if (var10 == 1 || var9 == -1) {
                            var6.field4150.method2391(116, Integer.MIN_VALUE);
                        } else {
                            var6.field4150.method2391(-128, var10 | var9 << 16);
                        }
                    }
                    class597.field8103 = var8.method1938(21);
                }
            }
            if (var6 != null) {
                var6.field4150.method2366(-1, var6.field4150.field5262 - var7);
                class578.method3334(4, var6);
            }
        }
        if (var5 != null) {
            long var14 = (var5.method1938(-82) - class451.field6377) / 50L;
            if (var14 > 32767L) {
                var14 = 32767L;
            }
            class451.field6377 = var5.method1938(113);
            int var16 = var5.method1937(-125);
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 65535) {
                var16 = 65535;
            }
            int var17 = var5.method1936(-564899352);
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 65535) {
                var17 = 65535;
            }
            byte var18 = 0;
            if (var5.method1941(65280) == 2) {
                var18 = 1;
            }
            class320.field3960++;
            int var19 = (int) var14;
            class336 var20 = class512.method3076(class701.field9879, class591.field8030, (byte) 100);
            var20.field4150.method2407(var19 | var18 << 15, (byte) -115);
            var20.field4150.method2391(-120, var17 | var16 << 16);
            class578.method3334(4, var20);
        }
        if (class535.field7538 > 0) {
            class597.field8096++;
            class336 var21 = class512.method3076(class233.field2775, class591.field8030, (byte) 109);
            var21.field4150.method2353(-118, class535.field7538 * 3);
            for (int var22 = 0; var22 < class535.field7538; var22++) {
                class732 var23 = class155.field1920[var22];
                long var24 = (var23.method1457(-123) - class554.field7711) / 50L;
                if (var24 > 65535L) {
                    var24 = 65535L;
                }
                class554.field7711 = var23.method1457(40);
                var21.field4150.method2353(105, var23.method1451(-96));
                var21.field4150.method2369(-18090, (int) var24);
            }
            class578.method3334(4, var21);
        }
        if (class108.field1360 > 0) {
            class108.field1360--;
        }
        if (class197.field2345 && class108.field1360 <= 0) {
            class197.field2345 = false;
            class502.field7091++;
            class108.field1360 = 20;
            class336 var26 = class512.method3076(class90.field1203, class591.field8030, (byte) 101);
            var26.field4150.method2380((byte) -9, (int) class47.field626 >> 3);
            var26.field4150.method2422(29933, (int) class229.field2718 >> 3);
            class578.method3334(4, var26);
        }
        if (class63.field862 != class595.field8086) {
            class595.field8086 = class63.field862;
            class485.field6765++;
            class336 var27 = class512.method3076(class293.field3506, class591.field8030, (byte) 69);
            var27.field4150.method2353(84, class63.field862 ? 1 : 0);
            class578.method3334(4, var27);
        }
        if (!class319.field3945) {
            class447.field6013++;
            class336 var28 = class512.method3076(class506.field7166, class591.field8030, (byte) 82);
            var28.field4150.method2353(-122, 0);
            int var29 = var28.field4150.field5262;
            class403 var30 = class118.field1503.method4294(false);
            var28.field4150.method2355(var30.field5275, var30.field5262, (byte) 74, 0);
            var28.field4150.method2366(-1, var28.field4150.field5262 - var29);
            class578.method3334(4, var28);
            class319.field3945 = true;
        }
        if (class107.field1351 != null) {
            if (class7.field100 == 2) {
                class194.method1265(119);
            } else if (class7.field100 == 3) {
                class33.method311((byte) 38);
            }
        }
        if (class393.field5086) {
            class393.field5086 = false;
        } else {
            class687.field9377 /= 2.0F;
        }
        if (class372.field4675) {
            class372.field4675 = false;
        } else {
            class174.field2108 /= 2.0F;
        }
        class254.method1513(0);
        if (class289.field3493 != 10) {
            return;
        }
        class425.method2538((byte) 126);
        class387.method2267(true);
        class704.method4004(65459);
        class742.field10346++;
        if (class742.field10346 > 750) {
            class415.method2481(29116);
            return;
        }
        class662.method3719(0);
        class113.method900((byte) 39);
        class275.method1606(0);
        for (int var31 = class2.field30.method3382(false, true); var31 != -1; var31 = class2.field30.method3382(false, false)) {
            class431.method2556(true, var31);
            class384.field4907[class296.method1733(class230.field2736++, 31)] = var31;
        }
        for (class714 var32 = class349.method2066((byte) 53); var32 != null; var32 = class349.method2066((byte) 107)) {
            int var33 = var32.method4045(true);
            long var34 = var32.method4040(22279);
            if (var33 == 1) {
                class480.field6716[(int) var34] = var32.field10021;
                class485.field6770 |= class307.field3801[(int) var34];
                class270.field3186[class296.method1733(31, class249.field2928++)] = (int) var34;
            } else if (var33 == 2) {
                class733.field10244[(int) var34] = var32.field10019;
                class301.field3604[class296.method1733(class54.field730++, 31)] = (int) var34;
            } else if (var33 == 3) {
                class620 var36 = class479.method2848((int) var34, (byte) 108);
                if (!var32.field10019.equals(var36.field8464)) {
                    var36.field8464 = var32.field10019;
                    class576.method3330(var36, -1);
                }
            } else if (var33 == 4) {
                class620 var60 = class479.method2848((int) var34, (byte) -84);
                int var61 = var32.field10021;
                int var62 = var32.field10018;
                int var63 = var32.field10023;
                if (var60.field8512 != var61 || var60.field8354 != var62 || var60.field8401 != var63) {
                    var60.field8401 = var63;
                    var60.field8512 = var61;
                    var60.field8354 = var62;
                    class576.method3330(var60, -1);
                }
            } else if (var33 == 5) {
                class620 var58 = class479.method2848((int) var34, (byte) -52);
                if (var32.field10021 != var58.field8337 || var32.field10021 == -1) {
                    var58.field8337 = var32.field10021;
                    var58.field8460 = 1;
                    var58.field8362 = 0;
                    var58.field8404 = 0;
                    class582 var59 = var58.field8337 == -1 ? null : class362.field4504.method3600(-65, var58.field8337);
                    if (var59 != null) {
                        class514.method3080(var58.field8404, 641545256, var59);
                    }
                    class576.method3330(var58, -1);
                }
            } else if (var33 == 6) {
                int var52 = var32.field10021;
                int var53 = (var52 & 0x7EDA) >> 10;
                int var54 = (var52 & 0x3E4) >> 5;
                int var55 = var52 & 0x1F;
                int var56 = (var53 << 19) + (var54 << 11) + (var55 << 3);
                class620 var57 = class479.method2848((int) var34, (byte) -76);
                if (var57.field8340 != var56) {
                    var57.field8340 = var56;
                    class576.method3330(var57, -1);
                }
            } else if (var33 == 7) {
                class620 var50 = class479.method2848((int) var34, (byte) 114);
                boolean var51 = var32.field10021 == 1;
                if (var50.field8361 != var51) {
                    var50.field8361 = var51;
                    class576.method3330(var50, -1);
                }
            } else if (var33 == 8) {
                class620 var49 = class479.method2848((int) var34, (byte) 120);
                if (var32.field10021 != var49.field8382 || var32.field10018 != var49.field8446 || var32.field10023 != var49.field8363) {
                    var49.field8446 = var32.field10018;
                    var49.field8363 = var32.field10023;
                    var49.field8382 = var32.field10021;
                    if (var49.field8438 != -1) {
                        if (var49.field8346 > 0) {
                            var49.field8363 = var49.field8363 * 32 / var49.field8346;
                        } else if (var49.field8364 > 0) {
                            var49.field8363 = var49.field8363 * 32 / var49.field8364;
                        }
                    }
                    class576.method3330(var49, -1);
                }
            } else if (var33 == 9) {
                class620 var48 = class479.method2848((int) var34, (byte) 110);
                if (var32.field10021 != var48.field8438 || var32.field10018 != var48.field8499) {
                    var48.field8499 = var32.field10018;
                    var48.field8438 = var32.field10021;
                    class576.method3330(var48, -1);
                }
            } else if (var33 == 10) {
                class620 var37 = class479.method2848((int) var34, (byte) -69);
                if (var32.field10021 != var37.field8397 || var32.field10018 != var37.field8478 || var32.field10023 != var37.field8355) {
                    var37.field8355 = var32.field10023;
                    var37.field8397 = var32.field10021;
                    var37.field8478 = var32.field10018;
                    class576.method3330(var37, -1);
                }
            } else if (var33 == 11) {
                class620 var47 = class479.method2848((int) var34, (byte) 125);
                var47.field8383 = var47.field8375 = var32.field10021;
                var47.field8456 = 0;
                var47.field8492 = var47.field8490 = var32.field10018;
                var47.field8452 = 0;
                class576.method3330(var47, -1);
            } else if (var33 == 12) {
                class620 var38 = class479.method2848((int) var34, (byte) -49);
                int var39 = var32.field10021;
                if (var38 != null && var38.field8371 == 0) {
                    if (var38.field8399 - var38.field8416 < var39) {
                        var39 = var38.field8399 - var38.field8416;
                    }
                    if (var39 < 0) {
                        var39 = 0;
                    }
                    if (var38.field8392 != var39) {
                        var38.field8392 = var39;
                        class576.method3330(var38, -1);
                    }
                }
            } else if (var33 == 14) {
                class620 var40 = class479.method2848((int) var34, (byte) -98);
                var40.field8358 = var32.field10021;
            } else if (var33 == 15) {
                class327.field4052 = true;
                class754.field10460 = var32.field10021;
                class687.field9376 = var32.field10018;
            } else if (var33 == 16) {
                class620 var41 = class479.method2848((int) var34, (byte) -116);
                var41.field8398 = var32.field10021;
            } else if (var33 == 17) {
                class620 var42 = class479.method2848((int) var34, (byte) 109);
                var42.field8344 = var32.field10021;
            } else if (var33 == 18) {
                class620 var45 = class479.method2848((int) var34, (byte) 108);
                int var46 = (int) (var34 >> 32);
                var45.method3514(var46, 14138, (short) var32.field10018, (short) var32.field10021);
            } else if (var33 == 19) {
                class620 var43 = class479.method2848((int) var34, (byte) -32);
                int var44 = (int) (var34 >> 32);
                var43.method3529((short) var32.field10021, -943, var44, (short) var32.field10018);
            }
        }
        class190.field2279++;
        if (class148.field1853 != 0) {
            class164.field1997 += 20;
            if (class164.field1997 >= 400) {
                class148.field1853 = 0;
            }
        }
        if (class346.field4334 != null) {
            class680.field9316++;
            if (class680.field9316 >= 15) {
                class576.method3330(class346.field4334, -1);
                class346.field4334 = null;
            }
        }
        class438.field5760 = null;
        class358.field4443 = null;
        class301.field3605 = false;
        class410.field5373 = false;
        class453.method2748(-1, -1, true, null);
        class23.method246(-1, (byte) 14, -1, null);
        if (!class104.field1336) {
            class680.field9309 = -1;
        }
        class256.method1532(0);
        class87.field1156++;
        if (class277.field3247) {
            class553.field7701++;
            class336 var64 = class512.method3076(class498.field6958, class591.field8030, (byte) 118);
            var64.field4150.method2391(127, class372.field4678 << 14 | class200.field2405 << 28 | class714.field10024);
            class578.method3334(4, var64);
            class277.field3247 = false;
        }
        while (true) {
            class529 var65;
            class620 var66;
            class620 var67;
            do {
                var65 = (class529) class277.field3245.method2730(-31260);
                if (var65 == null) {
                    while (true) {
                        class529 var68;
                        class620 var69;
                        class620 var70;
                        do {
                            var68 = (class529) class597.field8095.method2730(-31260);
                            if (var68 == null) {
                                while (true) {
                                    class529 var71;
                                    class620 var72;
                                    class620 var73;
                                    do {
                                        var71 = (class529) class756.field10475.method2730(-31260);
                                        if (var71 == null) {
                                            if (class358.field4443 == null) {
                                                class473.field6590 = 0;
                                            }
                                            if (class634.field8654 != null) {
                                                class751.method4198(76);
                                            }
                                            if (class637.field8741 > 0 && class348.field4350.method216(-65, 82) && class348.field4350.method216(-114, 81) && class662.field9092 != 0) {
                                                int var74 = class300.field3596.field808 - class662.field9092;
                                                if (var74 < 0) {
                                                    var74 = 0;
                                                } else if (var74 > 3) {
                                                    var74 = 3;
                                                }
                                                class247.method1487(class300.field3596.field3453[0] + class632.field8626, class300.field3596.field3455[0] + class620.field8435, -67, var74);
                                            }
                                            class487.method2894((byte) 100);
                                            for (int var75 = 0; var75 < 5; var75++) {
                                                int var10002 = class571.field7841[var75]++;
                                            }
                                            if (class485.field6770 && (class349.method2069(true) - 60000L) > class86.field1153) {
                                                class786.method4352(true);
                                            }
                                            for (class14 var76 = (class14) class195.field2314.method2447(-92); var76 != null; var76 = (class14) class195.field2314.method2439(-115)) {
                                                if ((class349.method2069(true) / 1000L - 5L) > ((long) var76.field228)) {
                                                    if (var76.field230 > 0) {
                                                        class318.method1873("", var76.field226 + class637.field8694.method3584(class770.field10592, true), (byte) 100, "", "", 5, 0);
                                                    }
                                                    if (var76.field230 == 0) {
                                                        class318.method1873("", var76.field226 + class637.field8695.method3584(class770.field10592, true), (byte) 94, "", "", 5, 0);
                                                    }
                                                    var76.method892(50560);
                                                }
                                            }
                                            class327.field4046++;
                                            if (class327.field4046 > 500) {
                                                class327.field4046 = 0;
                                                int var77 = (int) (Math.random() * 8.0D);
                                                if ((var77 & 0x1) == 1) {
                                                    class535.field7540 += class17.field306;
                                                }
                                                if ((var77 & 0x2) == 2) {
                                                    class451.field6372 += class117.field1496;
                                                }
                                                if ((var77 & 0x4) == 4) {
                                                    class136.field1711 += class636.field8670;
                                                }
                                            }
                                            if (class535.field7540 < -50) {
                                                class17.field306 = 2;
                                            }
                                            if (class535.field7540 > 50) {
                                                class17.field306 = -2;
                                            }
                                            if (class451.field6372 < -55) {
                                                class117.field1496 = 2;
                                            }
                                            if (class451.field6372 > 55) {
                                                class117.field1496 = -2;
                                            }
                                            if (class136.field1711 < -40) {
                                                class636.field8670 = 1;
                                            }
                                            class114.field1452++;
                                            if (class136.field1711 > 40) {
                                                class636.field8670 = -1;
                                            }
                                            if (class114.field1452 > 500) {
                                                class114.field1452 = 0;
                                                int var78 = (int) (Math.random() * 8.0D);
                                                if ((var78 & 0x2) == 2) {
                                                    class251.field2948 += class383.field4895;
                                                }
                                                if ((var78 & 0x1) == 1) {
                                                    class579.field7884 += class100.field1301;
                                                }
                                            }
                                            if (class579.field7884 < -60) {
                                                class100.field1301 = 2;
                                            }
                                            if (class251.field2948 < -20) {
                                                class383.field4895 = 1;
                                            }
                                            if (class579.field7884 > 60) {
                                                class100.field1301 = -2;
                                            }
                                            if (arg0 <= 2) {
                                                field10603 = 76;
                                            }
                                            if (class251.field2948 > 10) {
                                                class383.field4895 = -1;
                                            }
                                            class566.field7797++;
                                            if (class566.field7797 > 50) {
                                                class14.field224++;
                                                class336 var79 = class512.method3076(class447.field6016, class591.field8030, (byte) 79);
                                                class578.method3334(4, var79);
                                            }
                                            if (class180.field2203) {
                                                class542.method3207((byte) -114);
                                                class180.field2203 = false;
                                            }
                                            try {
                                                class671.method3765(8277);
                                                return;
                                            } catch (IOException var80) {
                                                class415.method2481(29116);
                                                return;
                                            }
                                        }
                                        var72 = var71.field7473;
                                        if (var72.field8445 < 0) {
                                            break;
                                        }
                                        var73 = class479.method2848(var72.field8400, (byte) -99);
                                    } while (var73 == null || var73.field8343 == null || var73.field8343.length <= var72.field8445 || var73.field8343[var72.field8445] != var72);
                                    class142.method1045(var71);
                                }
                            }
                            var69 = var68.field7473;
                            if (var69.field8445 < 0) {
                                break;
                            }
                            var70 = class479.method2848(var69.field8400, (byte) 110);
                        } while (var70 == null || var70.field8343 == null || var69.field8445 >= var70.field8343.length || var70.field8343[var69.field8445] != var69);
                        class142.method1045(var68);
                    }
                }
                var66 = var65.field7473;
                if (var66.field8445 < 0) {
                    break;
                }
                var67 = class479.method2848(var66.field8400, (byte) -18);
            } while (var67 == null || var67.field8343 == null || var66.field8445 >= var67.field8343.length || var67.field8343[var66.field8445] != var66);
            class142.method1045(var65);
        }
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(I[IB)V", line = 968)
    public final void method4282(int arg0, int[] arg1, byte arg2) {
        field10607++;
        class422 var4 = this.field10605.method2698((byte) -120, this.field10613 * 3);
        Buffer var5 = var4.method2527((byte) -76, true);
        if (var5 == null) {
            return;
        }
        Stream var6 = this.field10605.method2650((byte) 111, var5);
        if (arg2 != 88) {
            return;
        }
        int var7 = 0;
        int var8 = 32767;
        int var9 = -32768;
        if (Stream.method3985()) {
            label122: for (int var10 = 0; var10 < arg0; var10++) {
                int var11 = arg1[var10];
                short[] var12 = this.field10620.field4943[var11];
                int var13 = this.field10614[var11];
                if (var13 != 0 && var12 != null) {
                    int var14 = 0;
                    int var15 = 0;
                    while (true) {
                        while (true) {
                            if (var15 >= var12.length) {
                                continue label122;
                            }
                            if ((0x1 << var14++ & var13) == 0) {
                                var15 += 3;
                            } else {
                                var7++;
                                for (int var16 = 0; var16 < 3; var16++) {
                                    int var17 = var12[var15++] & 0xFFFF;
                                    if (var17 > var9) {
                                        var9 = var17;
                                    }
                                    if (var17 < var8) {
                                        var8 = var17;
                                    }
                                    var6.method3991(var17);
                                }
                            }
                        }
                    }
                }
            }
        } else {
            label98: for (int var18 = 0; var18 < arg0; var18++) {
                int var20 = arg1[var18];
                short[] var21 = this.field10620.field4943[var20];
                int var22 = this.field10614[var20];
                if (var22 != 0 && var21 != null) {
                    int var23 = 0;
                    int var24 = 0;
                    while (true) {
                        while (true) {
                            if (var21.length <= var24) {
                                continue label98;
                            }
                            if ((0x1 << var23++ & var22) == 0) {
                                var24 += 3;
                            } else {
                                var7++;
                                for (int var25 = 0; var25 < 3; var25++) {
                                    int var26 = var21[var24++] & 0xFFFF;
                                    var6.method3988(var26);
                                    if (var26 > var9) {
                                        var9 = var26;
                                    }
                                    if (var8 > var26) {
                                        var8 = var26;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        var6.method3992();
        if (!var4.method2526(arg2 + 1146) || var7 <= 0) {
            return;
        }
        this.field10605.method2711(-1, (this.field10620.field4938 & 0x7) != 0, this.field10626, (this.field10620.field4938 & 0x8) != 0);
        if (this.field10605.field6228) {
            this.field10605.method555(Integer.MAX_VALUE, this.field10616, this.field10615, this.field10608);
        }
        class256 var19 = this.field10605.method2710(-71);
        var19.method1529(1.0F / this.field10609, 1.0F, 1.0F / this.field10609, (byte) 92);
        this.field10605.method2720(class326.field4040, (byte) 87);
        this.field10605.method64(arg2 - 88, this.field10623, 1);
        this.field10605.method85((byte) 96, this.field10620.field4956);
        this.field10605.method1(var4, (byte) 10, var9 - (var8 - 1), class67.field920, 0, var7, var8);
        this.field10605.method2671(99);
    }

    @OriginalMember(owner = "client!oha", name = "<init>", descriptor = "(Lll;IIIII)V", line = 1274)
    public class772(class385 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field10620 = arg0;
        this.field10626 = arg1;
        this.field10615 = arg4;
        this.field10616 = arg3;
        this.field10614 = new int[this.field10620.field3533 * this.field10620.field3524];
        this.field10605 = this.field10620.field4926;
        this.field10609 = arg2;
        this.field10608 = arg5;
    }

    @OriginalMember(owner = "client!oha", name = "b", descriptor = "(II)V", line = 1130)
    public final void method4283(int arg0, int arg1) {
        this.field10606.method3982(arg0 * arg1 + 3);
        field10622++;
        this.field10606.method3978(-1);
    }

    @OriginalMember(owner = "client!oha", name = "b", descriptor = "(B)V", line = 1145)
    public static void method4284(byte arg0) {
        field10611 = null;
        if (arg0 != 103) {
            method4276(43, 104, 64);
        }
        field10618 = null;
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(FIIII)V", line = 1159)
    public final void method4285(float arg0, int arg1, int arg2, int arg3, int arg4) {
        field10624++;
        if (this.field10626 != -1) {
            class359 var6 = this.field10605.field890.method1138(this.field10626, 26);
            int var7 = var6.field4462 & 0xFF;
            if (var7 != 0 && var6.field4459 != 4) {
                int var8;
                if (arg3 < 0) {
                    var8 = 0;
                } else if (arg3 > 127) {
                    var8 = 16777215;
                } else {
                    var8 = arg3 * 131586;
                }
                if (var7 == 256) {
                    arg1 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg1 = ((arg1 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) + ((arg1 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) >> 8;
                }
            }
            int var11 = var6.field4458 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = (arg1 >> 16 & 0xFF) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = (arg1 >> 8 & 0xFF) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg1 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg1 = ((var12 & 0x5F00FF00) << 8) + (var14 >> 8) + (var13 & 0xFF00);
            }
        }
        this.field10606.method3982(arg2 * 4);
        if (arg0 != 1.0F) {
            int var15 = (arg1 & 0xFF3ED2) >> 16;
            int var16 = arg1 >> 8 & 0xFF;
            int var17 = (int) ((float) var15 * arg0);
            int var18 = arg1 & 0xFF;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            int var19 = (int) ((float) var16 * arg0);
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }
            int var20 = (int) ((float) var18 * arg0);
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg1 = var20 | var17 << 16 | var19 << 8;
        }
        if (this.field10605.field6245 == arg4) {
            this.field10606.method3978((byte) arg1);
            this.field10606.method3978((byte) (arg1 >> 8));
            this.field10606.method3978((byte) (arg1 >> 16));
        } else {
            this.field10606.method3978((byte) (arg1 >> 16));
            this.field10606.method3978((byte) (arg1 >> 8));
            this.field10606.method3978((byte) arg1);
        }
    }
}
