import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class111 {

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "[Lja;")
    public static class62[] field2525 = new class62[100];

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "Lja;")
    private static class62 field2524 = class30.method243(43, "To create a new account you need to");

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "[I")
    public static int[] field2529 = new int[128];

    @OriginalMember(owner = "client!qa", name = "x", descriptor = "Lja;")
    public static class62 field2547 = field2524;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "I")
    public static volatile int field2530 = 0;

    @OriginalMember(owner = "client!qa", name = "E", descriptor = "Lja;")
    private static class62 field2554 = class30.method243(43, "Close");

    @OriginalMember(owner = "client!qa", name = "F", descriptor = "Lja;")
    public static class62 field2555 = class30.method243(43, "http:)4)4www)3runescape)3com");

    @OriginalMember(owner = "client!qa", name = "B", descriptor = "Lja;")
    public static class62 field2551 = class30.method243(43, "Anmelde)2Zeitlimit -Uberschritten)3");

    @OriginalMember(owner = "client!qa", name = "H", descriptor = "Lja;")
    public static class62 field2556 = class30.method243(43, "m");

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "Lja;")
    public static class62 field2532 = field2554;

    @OriginalMember(owner = "client!qa", name = "J", descriptor = "[I")
    public static int[] field2558 = new int[100];

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "I")
    public static int field2527;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "I")
    public static int field2528;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "I")
    public static int field2531;

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "I")
    public static int field2533;

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "I")
    public static int field2536;

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "I")
    public static int field2537;

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "I")
    public static int field2538;

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "I")
    public static int field2539;

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "I")
    public static int field2540;

    @OriginalMember(owner = "client!qa", name = "r", descriptor = "I")
    public static int field2541;

    @OriginalMember(owner = "client!qa", name = "u", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!qa", name = "v", descriptor = "I")
    public static int field2545;

    @OriginalMember(owner = "client!qa", name = "w", descriptor = "I")
    public static int field2546;

    @OriginalMember(owner = "client!qa", name = "y", descriptor = "I")
    private int field2548;

    @OriginalMember(owner = "client!qa", name = "z", descriptor = "I")
    public static int field2549;

    @OriginalMember(owner = "client!qa", name = "D", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!qa", name = "K", descriptor = "I")
    public static int field2559;

    @OriginalMember(owner = "client!qa", name = "t", descriptor = "J")
    private long field2543;

    @OriginalMember(owner = "client!qa", name = "I", descriptor = "J")
    private long field2557;

    @OriginalMember(owner = "client!qa", name = "C", descriptor = "Lea;")
    public static class29 field2552;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "Z")
    public boolean field2526;

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "[I")
    private int[] field2542;

    @OriginalMember(owner = "client!qa", name = "A", descriptor = "[I")
    private int[] field2550;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)V")
    public static final void method892(byte arg0) {
        if (arg0 != 125) {
            method906(null, -28, -12, -33);
        }
        field2531++;
        class59.field1442.method127((byte) -116);
        class113.field2598.method127((byte) -126);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IZZ)V")
    public final void method893(int arg0, boolean arg1, boolean arg2) {
        field2528++;
        if (arg0 == 1 && this.field2526) {
            return;
        }
        int var4 = this.field2550[class50.field1146[arg0]];
        if (var4 == 0) {
            return;
        }
        if (arg2) {
            this.method894(-45, true, -6);
        }
        var4 -= 256;
        class135 var5;
        do {
            if (arg1) {
                var4++;
                if (class83.field2004 <= var4) {
                    var4 = 0;
                }
            } else {
                var4--;
                if (var4 < 0) {
                    var4 = class83.field2004 - 1;
                }
            }
            var5 = class90.method704(-108, var4);
        } while (var5 == null || var5.field3104 || var5.field3103 != arg0 + (this.field2526 ? 7 : 0));
        this.field2550[class50.field1146[arg0]] = var4 + 256;
        this.method895(85);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IZI)V")
    public final void method894(int arg0, boolean arg1, int arg2) {
        field2546++;
        int var4 = this.field2542[arg2];
        if (arg1) {
            var4++;
            if (var4 >= class79.field1929[arg2].length) {
                var4 = 0;
            }
        } else {
            var4--;
            if (var4 < 0) {
                var4 = class79.field1929[arg2].length - 1;
            }
        }
        this.field2542[arg2] = var4;
        this.method895(arg0 - 115);
        if (arg0 != 0) {
            this.field2557 = -30L;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
    private final void method895(int arg0) {
        field2559++;
        long var2 = this.field2543;
        this.field2543 = 0L;
        int var4 = this.field2550[5];
        int var5 = this.field2550[9];
        this.field2550[5] = var5;
        this.field2550[9] = var4;
        for (int var6 = 0; var6 < 12; var6++) {
            this.field2543 <<= 0x4;
            if (this.field2550[var6] >= 256) {
                this.field2543 += this.field2550[var6] - 256;
            }
        }
        if (this.field2550[0] >= 256) {
            this.field2543 += this.field2550[0] - 256 >> 4;
        }
        if (this.field2550[1] >= 256) {
            this.field2543 += this.field2550[1] - 256 >> 8;
        }
        int var7 = 0;
        int var8 = 54 % ((arg0 - 24) / 32);
        while (var7 < 5) {
            this.field2543 <<= 0x3;
            this.field2543 += this.field2542[var7];
            var7++;
        }
        this.field2550[9] = var5;
        this.field2550[5] = var4;
        this.field2543 <<= 0x1;
        this.field2543 += this.field2526 ? 1 : 0;
        if (var2 != 0L && this.field2543 != var2) {
            class6.field202.method123(var2, -7895);
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(B)I")
    public final int method896(byte arg0) {
        field2536++;
        int var2 = -30 % ((arg0 - 41) / 48);
        return this.field2548 == -1 ? (this.field2550[8] << 10) + (this.field2550[11] << 5) + (this.field2542[0] << 25) + this.field2550[1] + (this.field2550[0] << 15) + (this.field2542[4] << 20) : class105.method848(this.field2548, (byte) 21).field3198 + 305419896;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZLpd;Lpd;I)V")
    public static final void method897(boolean arg0, class108 arg1, class108 arg2, int arg3) {
        class51.field1169 = arg0;
        field2549++;
        class82.field1979 = arg1;
        class85.field2042 = arg2;
        if (arg3 != 1) {
            field2558 = null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(BLbd;Lbd;II)Lvb;")
    public final class145 method898(byte arg0, class12 arg1, class12 arg2, int arg3, int arg4) {
        field2553++;
        if (this.field2548 != -1) {
            return class105.method848(this.field2548, (byte) 21).method1111(arg2, arg4, (byte) -33, arg3, arg1);
        }
        int[] var6 = this.field2550;
        long var7 = this.field2543;
        if (arg2 != null && (arg2.field268 >= 0 || arg2.field281 >= 0)) {
            var6 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var6[var9] = this.field2550[var9];
            }
            if (arg2.field268 >= 0) {
                var7 += arg2.field268 - this.field2550[5] << 8;
                var6[5] = arg2.field268;
            }
            if (arg2.field281 >= 0) {
                var7 += arg2.field281 - this.field2550[3] << 16;
                var6[3] = arg2.field281;
            }
        }
        if (arg0 > -102) {
            return null;
        }
        class145 var10 = (class145) class6.field202.method129(var7, 24838);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var21 = var6[var12];
                if (var21 >= 256 && var21 < 512 && !class90.method704(63, var21 - 256).method1084(false)) {
                    var11 = true;
                }
                if (var21 >= 512 && !class140.method1114(var21 - 512, false).method179(this.field2526, 42)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field2557 != -1L) {
                    var10 = (class145) class6.field202.method129(this.field2557, 24838);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                class112[] var13 = new class112[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var18 = var6[var15];
                    if (var18 >= 256 && var18 < 512) {
                        class112 var19 = class90.method704(90, var18 - 256).method1089(5);
                        if (var19 != null) {
                            var13[var14++] = var19;
                        }
                    }
                    if (var18 >= 512) {
                        class112 var20 = class140.method1114(var18 - 512, false).method181(-1, this.field2526);
                        if (var20 != null) {
                            var13[var14++] = var20;
                        }
                    }
                }
                class112 var16 = new class112(var13, var14);
                for (int var17 = 0; var17 < 5; var17++) {
                    if (this.field2542[var17] != 0) {
                        var16.method909(class79.field1929[var17][0], class79.field1929[var17][this.field2542[var17]]);
                        if (var17 == 1) {
                            var16.method909(class34.field804[0], class34.field804[this.field2542[var17]]);
                        }
                    }
                }
                var10 = var16.method921(64, 850, -30, -50, -30);
                class6.field202.method128((byte) -90, var10, var7);
                this.field2557 = var7;
            }
        }
        if (arg2 == null && arg1 == null) {
            return var10;
        }
        class145 var22;
        if (arg2 != null && arg1 != null) {
            var22 = arg2.method91(arg3, var10, 65535, arg4, arg1);
        } else if (arg2 == null) {
            var22 = arg1.method92(var10, -122, arg3);
        } else {
            var22 = arg2.method92(var10, 125, arg4);
        }
        return var22;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZJ)Lja;")
    public static final class62 method899(boolean arg0, long arg1) {
        field2537++;
        if (arg0) {
            field2547 = null;
        }
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg1 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg1;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            byte[] var6 = new byte[var3];
            while (arg1 != 0L) {
                long var8 = arg1;
                arg1 /= 37L;
                var3--;
                var6[var3] = class147.field3466[(int) (var8 - arg1 * 37L)];
            }
            class62 var7 = new class62();
            var7.field1504 = var6;
            var7.field1538 = var6.length;
            return var7;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)V")
    public static final void method900(boolean arg0) {
        field2538++;
        class38.field879.method805(8);
        int var1 = class38.field879.method811(7, 1);
        if (var1 == 0) {
            return;
        }
        int var2 = class38.field879.method811(7, 2);
        if (var2 == 0) {
            class38.field894[class34.field814++] = 2047;
            return;
        }
        if (!arg0) {
            field2532 = null;
        }
        if (var2 == 1) {
            int var3 = class38.field879.method811(7, 3);
            class40.field936.method60(false, (byte) -81, var3);
            int var4 = class38.field879.method811(7, 1);
            if (var4 == 1) {
                class38.field894[class34.field814++] = 2047;
            }
        } else if (var2 == 2) {
            int var5 = class38.field879.method811(7, 3);
            class40.field936.method60(true, (byte) -79, var5);
            int var6 = class38.field879.method811(7, 3);
            class40.field936.method60(true, (byte) -98, var6);
            int var7 = class38.field879.method811(7, 1);
            if (var7 == 1) {
                class38.field894[class34.field814++] = 2047;
            }
        } else if (var2 == 3) {
            int var8 = class38.field879.method811(7, 1);
            int var9 = class38.field879.method811(7, 1);
            if (var9 == 1) {
                class38.field894[class34.field814++] = 2047;
            }
            class155.field3598 = class38.field879.method811(7, 2);
            int var10 = class38.field879.method811(7, 7);
            int var11 = class38.field879.method811(7, 7);
            class40.field936.method64(var10, (byte) -24, var11, var8 == 1);
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)V")
    public static void method901(int arg0) {
        field2558 = null;
        field2532 = null;
        int var1 = 52 / ((arg0 - 20) / 47);
        field2547 = null;
        field2552 = null;
        field2554 = null;
        field2556 = null;
        field2529 = null;
        field2524 = null;
        field2551 = null;
        field2525 = null;
        field2555 = null;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(BZ)V")
    public final void method902(byte arg0, boolean arg1) {
        field2533++;
        if (this.field2526 != arg1) {
            if (arg0 > -123) {
                this.method898((byte) 65, null, null, -22, -53);
            }
            this.method903(null, this.field2542, arg1, -1, 0);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([I[IZII)V")
    public final void method903(int[] arg0, int[] arg1, boolean arg2, int arg3, int arg4) {
        field2545++;
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class83.field2004; var7++) {
                    class135 var8 = class90.method704(61, var7);
                    if (var8 != null && !var8.field3104 && var8.field3103 == (arg2 ? 7 : 0) + var6) {
                        arg0[class50.field1146[var6]] = var7 + 256;
                        break;
                    }
                }
            }
        }
        this.field2548 = arg3;
        this.field2542 = arg1;
        this.field2550 = arg0;
        this.field2526 = arg2;
        this.method895(64);
        if (arg4 != 0) {
            field2532 = null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(Z)Lqb;")
    public final class112 method904(boolean arg0) {
        field2527++;
        if (this.field2548 != -1) {
            return class105.method848(this.field2548, (byte) 21).method1101(-30);
        }
        boolean var2 = arg0;
        for (int var3 = 0; var3 < 12; var3++) {
            int var12 = this.field2550[var3];
            if (var12 >= 256 && var12 < 512 && !class90.method704(-126, var12 - 256).method1082(74)) {
                var2 = true;
            }
            if (var12 >= 512 && !class140.method1114(var12 - 512, false).method180(this.field2526, (byte) 90)) {
                var2 = true;
            }
        }
        if (var2) {
            return null;
        }
        class112[] var4 = new class112[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var9 = this.field2550[var6];
            if (var9 >= 256 && var9 < 512) {
                class112 var10 = class90.method704(86, var9 - 256).method1080(27016);
                if (var10 != null) {
                    var4[var5++] = var10;
                }
            }
            if (var9 >= 512) {
                class112 var11 = class140.method1114(var9 - 512, false).method183(this.field2526, 116);
                if (var11 != null) {
                    var4[var5++] = var11;
                }
            }
        }
        class112 var7 = new class112(var4, var5);
        for (int var8 = 0; var8 < 5; var8++) {
            if (this.field2542[var8] != 0) {
                var7.method909(class79.field1929[var8][0], class79.field1929[var8][this.field2542[var8]]);
                if (var8 == 1) {
                    var7.method909(class34.field804[0], class34.field804[this.field2542[var8]]);
                }
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ls;I)V")
    public final void method905(class128 arg0, int arg1) {
        arg0.method1010(this.field2526 ? 1 : 0, 32768);
        for (int var3 = 0; var3 < 7; var3++) {
            int var5 = this.field2550[class50.field1146[var3]];
            if (var5 == 0) {
                arg0.method1010(-1, arg1 + 32772);
            } else {
                arg0.method1010(var5 - 256, 32768);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method1010(this.field2542[var4], 32768);
        }
        field2539++;
        if (arg1 != -4) {
            this.field2542 = null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lpd;III)Lic;")
    public static final class58 method906(class108 arg0, int arg1, int arg2, int arg3) {
        field2541++;
        if (arg2 != -6) {
            method906(null, 33, 29, -8);
        }
        return class63.method478(arg1, arg3, arg0, (byte) 127) ? class68.method532(0) : null;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method907(int arg0, Component arg1) {
        field2544++;
        if (arg0 != 256) {
            method906(null, -118, 53, -63);
        }
        arg1.addMouseListener(class70.field1788);
        arg1.addMouseMotionListener(class70.field1788);
        arg1.addFocusListener(class70.field1788);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIII)I")
    public static final int method908(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 >> 7;
        field2535++;
        int var5 = arg2 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg3;
        int var7 = arg2 & 0x7F;
        if (arg3 < 3 && (class155.field3581[1][var4][var5] & 0x2) == 2) {
            var6 = arg3 + 1;
        }
        int var8 = arg1 & 0x7F;
        int var9 = (arg0 - var8) * class7.field214[var6][var4][var5 + 1] + class7.field214[var6][var4 + 1][var5 + 1] * var8 >> 7;
        int var10 = (128 - var8) * class7.field214[var6][var4][var5] + class7.field214[var6][var4 + 1][var5] * var8 >> 7;
        return (128 - var7) * var10 + var7 * var9 >> 7;
    }
}
