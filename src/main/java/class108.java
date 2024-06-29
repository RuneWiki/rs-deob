import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class108 {

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "Lkc;")
    public static class67 field2439 = class19.method144("backleft2", 74);

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "Lkc;")
    public static class67 field2436 = class19.method144("Freunde)2Server)3)3)3", 116);

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "Lkc;")
    private static class67 field2444 = class19.method144(" ", 77);

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "I")
    public static int field2445 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!rb", name = "r", descriptor = "I")
    public static int field2453 = 0;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "Lkc;")
    public static class67 field2443 = class19.method144("Wordpack geladen)3", 73);

    @OriginalMember(owner = "client!rb", name = "m", descriptor = "J")
    public static volatile long field2448 = 0L;

    @OriginalMember(owner = "client!rb", name = "w", descriptor = "[Ljc;")
    public static class61[] field2458 = new class61[50];

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "Lkc;")
    public static class67 field2447 = field2444;

    @OriginalMember(owner = "client!rb", name = "t", descriptor = "Lkc;")
    private static class67 field2455 = class19.method144("Unexpected loginserver response)3", 100);

    @OriginalMember(owner = "client!rb", name = "z", descriptor = "[I")
    public static int[] field2461 = new int[128];

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "Lkc;")
    public static class67 field2441 = class19.method144("Chat panel redrawn", 103);

    @OriginalMember(owner = "client!rb", name = "s", descriptor = "Lkc;")
    public static class67 field2454 = field2455;

    @OriginalMember(owner = "client!rb", name = "y", descriptor = "Lkc;")
    public static class67 field2460 = class19.method144(")3", 102);

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "Lja;")
    public static class59 field2446 = new class59(4096);

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
    public static int field2440;

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!rb", name = "n", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!rb", name = "p", descriptor = "I")
    public static int field2451;

    @OriginalMember(owner = "client!rb", name = "q", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!rb", name = "v", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "Lta;")
    public static class119 field2437;

    @OriginalMember(owner = "client!rb", name = "x", descriptor = "Lac;")
    public static class4 field2459;

    @OriginalMember(owner = "client!rb", name = "u", descriptor = "[Lnd;")
    public static class86[] field2456;

    @OriginalMember(owner = "client!rb", name = "o", descriptor = "[[[B")
    public static byte[][][] field2450;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IB)I", line = 4)
    public static final int method822(int arg0, byte arg1) {
        field2440++;
        if (arg1 != 94) {
            field2444 = null;
        }
        return arg0 >> 11 & 0x3F;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lkc;Lkc;BLac;)[Lab;", line = 19)
    public static final class3[] method823(class67 arg0, class67 arg1, byte arg2, class4 arg3) {
        field2452++;
        int var4 = arg3.method31(arg0, 0);
        int var5 = -2 / ((-arg2 - 46) / 59);
        int var6 = arg3.method35(var4, arg1, 51);
        return class31.method263((byte) 126, var6, var4, arg3);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V", line = 41)
    public static void method824(int arg0) {
        field2455 = null;
        field2437 = null;
        field2460 = null;
        if (arg0 < 31) {
            return;
        }
        field2446 = null;
        field2458 = null;
        field2447 = null;
        field2444 = null;
        field2454 = null;
        field2459 = null;
        field2443 = null;
        field2461 = null;
        field2441 = null;
        field2439 = null;
        field2456 = null;
        field2436 = null;
        field2450 = null;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZI)Leb;", line = 66)
    public static final class31 method825(boolean arg0, int arg1) {
        field2451++;
        class31 var2 = (class31) class127.field2961.method373((byte) 111, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class41.field995.method27(arg1, arg0, 3);
        if (!arg0) {
            return null;
        }
        class31 var4 = new class31();
        if (var3 != null) {
            var4.method268(-31031, new class140(var3));
        }
        class127.field2961.method374(0, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIIBIII)V", line = 91)
    public static final void method826(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        if (arg4 >= -24) {
            return;
        }
        field2449++;
        if (arg0 < 1 || arg3 < 1 || arg0 > 102 || arg3 > 102) {
            return;
        }
        if (class45.field1105 && class112.field2593 != arg2) {
            return;
        }
        int var8 = 0;
        if (arg7 == 0) {
            var8 = class103.field2332.method879(arg2, arg0, arg3);
        }
        if (arg7 == 1) {
            var8 = class103.field2332.method906(arg2, arg0, arg3);
        }
        if (arg7 == 2) {
            var8 = class103.field2332.method871(arg2, arg0, arg3);
        }
        if (arg7 == 3) {
            var8 = class103.field2332.method882(arg2, arg0, arg3);
        }
        boolean var9 = true;
        boolean var10 = false;
        boolean var11 = false;
        if (var8 != 0) {
            int var12 = var8 >> 14 & 0x7FFF;
            int var13 = class103.field2332.method868(arg2, arg0, arg3, var8);
            int var14 = var13 >> 6 & 0x3;
            int var15 = var13 & 0x1F;
            if (arg7 == 0) {
                class103.field2332.method907(arg2, arg0, arg3);
                class106 var16 = class2.method12(var12, 21876);
                if (var16.field2390) {
                    class14.field295[arg2].method51(arg0, false, var14, var16.field2429, arg3, var15);
                }
            }
            if (arg7 == 1) {
                class103.field2332.method862(arg2, arg0, arg3);
            }
            if (arg7 == 2) {
                class103.field2332.method889(arg2, arg0, arg3);
                class106 var17 = class2.method12(var12, 21876);
                if (var17.field2432 + arg0 > 103 || var17.field2432 + arg3 > 103 || arg0 + var17.field2369 > 103 || arg3 + var17.field2369 > 103) {
                    return;
                }
                if (var17.field2390) {
                    class14.field295[arg2].method57(arg3, var17.field2429, false, var17.field2369, arg0, var14, var17.field2432);
                }
            }
            if (arg7 == 3) {
                class103.field2332.method878(arg2, arg0, arg3);
                class106 var18 = class2.method12(var12, 21876);
                if (var18.field2390 && var18.field2389 == 1) {
                    class14.field295[arg2].method58(arg3, true, arg0);
                }
            }
        }
        if (arg6 < 0) {
            return;
        }
        int var19 = arg2;
        if (arg2 < 3 && (class21.field443[1][arg0][arg3] & 0x2) == 2) {
            var19 = arg2 + 1;
        }
        class70.method574(arg1, arg5, class103.field2332, arg3, arg2, var19, false, arg6, arg0, class14.field295[arg2]);
        return;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZLkc;Lkc;I)V", line = 211)
    public static final void method827(boolean arg0, class67 arg1, class67 arg2, int arg3) {
        field2457++;
        short var4 = 151;
        if (arg3 != -8038) {
            method826(-10, -77, 69, 106, (byte) 43, -116, 71, -4);
        }
        if (class130.field3045) {
            class130.field3045 = false;
            class129.method994((byte) -106);
            class65.method498((byte) 72);
            class103.method786(0);
            class1.method4((byte) -111);
            class65.method501(arg3 + 8037, class58.field1375, class14.field301, class20.field410, class4.field93);
            class102.method780(-1, class114.field2671 == -1, 5381, class122.field2894, class131.field3089);
            class111.field2542 = true;
            class132.field3119 = true;
            class127.field2962 = true;
        }
        class10.method89(arg3 + 7912);
        int var6 = var4 - 3;
        class14.field301.method227(arg2, 257, var6, 0);
        class14.field301.method227(arg2, 256, var6 - 1, 16777215);
        if (arg1 != null) {
            var6 += 15;
            if (arg0) {
                int var5 = class14.field301.method231(arg1) + 4;
                class68.method569(257 - var5 / 2, var6 + -11, var5, 11, 0);
            }
            class14.field301.method227(arg1, 257, var6, 0);
            class14.field301.method227(arg1, 256, var6 - 1, 16777215);
        }
        class90.method701(false);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIII)I", line = 283)
    public static final int method828(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 124 / ((arg4 - 73) / 41);
        field2442++;
        int var6 = 65536 - class105.field2354[arg2 * 1024 / arg1] >> 1;
        return ((65536 - var6) * arg0 >> 16) + (arg3 * var6 >> 16);
    }
}
