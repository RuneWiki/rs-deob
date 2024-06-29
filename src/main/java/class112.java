import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class112 {

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "Lgd;")
    public static class40 field2693 = class14.method90(false, "Duell akzeptieren");

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "I")
    public static int field2700 = 0;

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "Lgd;")
    public static class40 field2701 = class14.method90(false, "Abbrechen");

    @OriginalMember(owner = "client!sd", name = "r", descriptor = "I")
    public static int field2705 = -1;

    @OriginalMember(owner = "client!sd", name = "s", descriptor = "Lgd;")
    public static class40 field2706 = class14.method90(false, " zuerst von Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "Lgd;")
    public static class40 field2690 = class14.method90(false, "backright2");

    @OriginalMember(owner = "client!sd", name = "q", descriptor = "I")
    public static volatile int field2704 = 0;

    @OriginalMember(owner = "client!sd", name = "z", descriptor = "I")
    public static int field2713 = 0;

    @OriginalMember(owner = "client!sd", name = "C", descriptor = "[[[B")
    public static byte[][][] field2716 = new byte[4][104][104];

    @OriginalMember(owner = "client!sd", name = "G", descriptor = "Lgd;")
    public static class40 field2720 = class14.method90(false, "@whi@");

    @OriginalMember(owner = "client!sd", name = "D", descriptor = "Lgd;")
    public static class40 field2717 = class14.method90(false, "Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
    public static int field2688;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
    public static int field2691;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
    private int field2696;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!sd", name = "u", descriptor = "I")
    public static int field2708;

    @OriginalMember(owner = "client!sd", name = "v", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!sd", name = "x", descriptor = "I")
    public static int field2711;

    @OriginalMember(owner = "client!sd", name = "y", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!sd", name = "A", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!sd", name = "B", descriptor = "I")
    public static int field2715;

    @OriginalMember(owner = "client!sd", name = "E", descriptor = "I")
    public static int field2718;

    @OriginalMember(owner = "client!sd", name = "H", descriptor = "I")
    public static int field2721;

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "J")
    private long field2698;

    @OriginalMember(owner = "client!sd", name = "F", descriptor = "J")
    private long field2719;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "Loc;")
    public static class86 field2695;

    @OriginalMember(owner = "client!sd", name = "w", descriptor = "Z")
    public boolean field2710;

    @OriginalMember(owner = "client!sd", name = "p", descriptor = "[I")
    private int[] field2703;

    @OriginalMember(owner = "client!sd", name = "t", descriptor = "[I")
    private int[] field2707;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILh;Lh;BI)Lqb;", line = 8)
    public final class97 method860(int arg0, class45 arg1, class45 arg2, byte arg3, int arg4) {
        field2718++;
        if (this.field2696 != -1) {
            return class80.method533((byte) 118, this.field2696).method1014(arg0, false, arg2, arg4, arg1);
        }
        long var6 = this.field2719;
        if (arg3 > -79) {
            method864((byte) 79);
        }
        int[] var8 = this.field2707;
        if (arg1 != null && (arg1.field1151 >= 0 || arg1.field1134 >= 0)) {
            var8 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var8[var9] = this.field2707[var9];
            }
            if (arg1.field1151 >= 0) {
                var6 += arg1.field1151 - this.field2707[5] << 8;
                var8[5] = arg1.field1151;
            }
            if (arg1.field1134 >= 0) {
                var6 += arg1.field1134 - this.field2707[3] << 16;
                var8[3] = arg1.field1134;
            }
        }
        class97 var10 = (class97) class103.field2476.method39(27, var6);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var20 = var8[var12];
                if (var20 >= 256 && var20 < 512 && !class137.method1082(254, var20 - 256).method1032((byte) 92)) {
                    var11 = true;
                }
                if (var20 >= 512 && !class132.method1041(var20 - 512, 18).method17(this.field2710, false)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field2698 != -1L) {
                    var10 = (class97) class103.field2476.method39(48, this.field2698);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                class97[] var13 = new class97[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var17 = var8[var15];
                    if (var17 >= 256 && var17 < 512) {
                        class97 var18 = class137.method1082(254, var17 - 256).method1023((byte) 6);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                    if (var17 >= 512) {
                        class97 var19 = class132.method1041(var17 - 512, 44).method15(-1, this.field2710);
                        if (var19 != null) {
                            var13[var14++] = var19;
                        }
                    }
                }
                var10 = new class97(var13, var14);
                for (int var16 = 0; var16 < 5; var16++) {
                    if (this.field2703[var16] != 0) {
                        var10.method656(class125.field2962[var16][0], class125.field2962[var16][this.field2703[var16]]);
                        if (var16 == 1) {
                            var10.method656(class61.field1526[0], class61.field1526[this.field2703[var16]]);
                        }
                    }
                }
                var10.method655();
                var10.method666(64, 850, -30, -50, -30, true);
                class103.field2476.method38(var10, var6, true);
                this.field2698 = var6;
            }
        }
        if (arg1 == null && arg2 == null) {
            return var10;
        }
        class97 var21;
        if (arg1 != null && arg2 != null) {
            var21 = arg1.method313((byte) 21, arg2, arg0, var10, arg4);
        } else if (arg1 == null) {
            var21 = arg2.method314(var10, arg4, 1);
        } else {
            var21 = arg1.method314(var10, arg0, 1);
        }
        return var21;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)I", line = 172)
    public final int method861(byte arg0) {
        if (arg0 > -80) {
            field2705 = 102;
        }
        field2712++;
        return this.field2696 == -1 ? (this.field2707[8] << 10) + (this.field2703[0] << 25) + (this.field2703[4] << 20) + (this.field2707[0] << 15) + (this.field2707[11] << 5) + this.field2707[1] : class80.method533((byte) 118, this.field2696).field3028 + 305419896;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I[IIZ[I)V", line = 205)
    public final void method862(int arg0, int[] arg1, int arg2, boolean arg3, int[] arg4) {
        field2714++;
        if (arg1 == null) {
            arg1 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class128.field3054; var7++) {
                    class130 var8 = class137.method1082(254, var7);
                    if (var8 != null && !var8.field3109 && var6 + (arg3 ? 7 : 0) == var8.field3098) {
                        arg1[class134.field3267[var6]] = var7 + 256;
                        break;
                    }
                }
            }
        }
        this.field2710 = arg3;
        this.field2696 = arg0;
        this.field2707 = arg1;
        if (arg2 == 256) {
            this.field2703 = arg4;
            this.method871(256);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIII)V", line = 251)
    public static final void method863(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class133 var5 = (class133) class10.field259.method142((long) arg1, 23056);
        if (var5 == null) {
            var5 = new class133();
            class10.field259.method144(var5, (long) arg1, 17348);
        }
        if (arg3 != 1) {
            method873(27);
        }
        field2689++;
        if (var5.field3241.length <= arg2) {
            int[] var6 = new int[arg2 + 1];
            int[] var7 = new int[arg2 + 1];
            for (int var8 = 0; var8 < var5.field3241.length; var8++) {
                var7[var8] = var5.field3241[var8];
                var6[var8] = var5.field3244[var8];
            }
            for (int var9 = var5.field3241.length; var9 < arg2; var9++) {
                var7[var9] = -1;
                var6[var9] = 0;
            }
            var5.field3241 = var7;
            var5.field3244 = var6;
        }
        var5.field3241[arg2] = arg0;
        var5.field3244[arg2] = arg4;
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(B)V", line = 303)
    public static final void method864(byte arg0) {
        field2715++;
        if (arg0 == 103) {
            class1.field20.method40((byte) -101);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)Lqb;", line = 318)
    public final class97 method865(int arg0) {
        if (arg0 >= -41) {
            this.field2703 = null;
        }
        field2702++;
        if (this.field2696 != -1) {
            return class80.method533((byte) 118, this.field2696).method1012((byte) -79);
        }
        boolean var2 = false;
        for (int var3 = 0; var3 < 12; var3++) {
            int var12 = this.field2707[var3];
            if (var12 >= 256 && var12 < 512 && !class137.method1082(254, var12 - 256).method1034((byte) -67)) {
                var2 = true;
            }
            if (var12 >= 512 && !class132.method1041(var12 - 512, 111).method24(0, this.field2710)) {
                var2 = true;
            }
        }
        if (var2) {
            return null;
        }
        class97[] var4 = new class97[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var9 = this.field2707[var6];
            if (var9 >= 256 && var9 < 512) {
                class97 var10 = class137.method1082(254, var9 - 256).method1031(0);
                if (var10 != null) {
                    var4[var5++] = var10;
                }
            }
            if (var9 >= 512) {
                class97 var11 = class132.method1041(var9 - 512, 82).method16(this.field2710, 30);
                if (var11 != null) {
                    var4[var5++] = var11;
                }
            }
        }
        class97 var7 = new class97(var4, var5);
        for (int var8 = 0; var8 < 5; var8++) {
            if (this.field2703[var8] != 0) {
                var7.method656(class125.field2962[var8][0], class125.field2962[var8][this.field2703[var8]]);
                if (var8 == 1) {
                    var7.method656(class61.field1526[0], class61.field1526[this.field2703[var8]]);
                }
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIZ)V", line = 420)
    public final void method866(int arg0, int arg1, boolean arg2) {
        field2697++;
        if (~arg1 == arg0 && this.field2710) {
            return;
        }
        int var4 = this.field2707[class134.field3267[arg1]];
        if (var4 == 0) {
            return;
        }
        var4 -= 256;
        class130 var5;
        do {
            if (arg2) {
                var4++;
                if (class128.field3054 <= var4) {
                    var4 = 0;
                }
            } else {
                var4--;
                if (var4 < 0) {
                    var4 = class128.field3054 - 1;
                }
            }
            var5 = class137.method1082(254, var4);
        } while (var5 == null || var5.field3109 || arg1 + (this.field2710 ? 7 : 0) != var5.field3098);
        this.field2707[class134.field3267[arg1]] = var4 + 256;
        this.method871(256);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZB)V", line = 471)
    public final void method867(boolean arg0, byte arg1) {
        field2691++;
        if (this.field2710 != arg0) {
            this.method862(-1, null, 256, arg0, this.field2703);
            int var3 = 43 / ((-arg1 - 10) / 48);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BLrc;)V", line = 489)
    public final void method868(byte arg0, class104 arg1) {
        field2709++;
        arg1.method756(this.field2710 ? 1 : 0, 1);
        for (int var3 = 0; var3 < 7; var3++) {
            int var5 = this.field2707[class134.field3267[var3]];
            if (var5 == 0) {
                arg1.method756(-1, arg0 - 104);
            } else {
                arg1.method756(var5 - 256, 1);
            }
        }
        if (arg0 != 105) {
            method872(53);
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg1.method756(this.field2703[var4], arg0 ^ 0x68);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Z)V", line = 538)
    public static void method869(boolean arg0) {
        field2690 = null;
        field2716 = null;
        field2693 = null;
        if (!arg0) {
            method869(true);
        }
        field2701 = null;
        field2717 = null;
        field2706 = null;
        field2720 = null;
        field2695 = null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IBZ)V", line = 557)
    public final void method870(int arg0, byte arg1, boolean arg2) {
        field2694++;
        int var4 = this.field2703[arg0];
        if (arg2) {
            var4++;
            if (class125.field2962[arg0].length <= var4) {
                var4 = 0;
            }
        } else {
            var4--;
            if (var4 < 0) {
                var4 = class125.field2962[arg0].length - 1;
            }
        }
        int var5 = 108 % ((arg1 + 69) / 45);
        this.field2703[arg0] = var4;
        this.method871(256);
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)V", line = 594)
    private final void method871(int arg0) {
        int var2 = this.field2707[5];
        field2692++;
        long var3 = this.field2719;
        int var5 = this.field2707[9];
        this.field2707[5] = var5;
        this.field2707[9] = var2;
        this.field2719 = 0L;
        for (int var6 = 0; var6 < 12; var6++) {
            this.field2719 <<= 0x4;
            if (this.field2707[var6] >= 256) {
                this.field2719 += this.field2707[var6] - 256;
            }
        }
        if (this.field2707[0] >= 256) {
            this.field2719 += this.field2707[0] - 256 >> 4;
        }
        if (arg0 <= this.field2707[1]) {
            this.field2719 += this.field2707[1] - 256 >> 8;
        }
        for (int var7 = 0; var7 < 5; var7++) {
            this.field2719 <<= 0x3;
            this.field2719 += this.field2703[var7];
        }
        this.field2719 <<= 0x1;
        this.field2719 += this.field2710 ? 1 : 0;
        this.field2707[5] = var2;
        this.field2707[9] = var5;
        if (var3 != 0L && this.field2719 != var3) {
            class103.field2476.method37((byte) 104, var3);
        }
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(I)V", line = 648)
    public static final void method872(int arg0) {
        field2699++;
        if (class43.field1090 != 0) {
            return;
        }
        class131.field3178[0] = class115.field2770;
        class45.field1122[0] = 1004;
        class48.field1231 = 1;
        if (class94.field2161 != -1) {
            class44.field1097 = -1;
            class66.field1635 = -1;
            class44.method306(class135.field3282, 0, 0, class40.field1001, -23185, 503, 765, 0, class94.field2161);
            class23.field547 = class66.field1635;
            class131.field3180 = class44.field1097;
            return;
        }
        class92.method619((byte) 51);
        class66.field1635 = arg0;
        class44.field1097 = -1;
        boolean var1 = false;
        if (class40.field1001 > 4 && class135.field3282 > 4 && class40.field1001 < 516 && class135.field3282 < 338) {
            if (class131.field3169 == -1) {
                class8.method48(false);
            } else {
                class44.method306(class135.field3282, 4, 4, class40.field1001, arg0 ^ 0x5A90, 338, 516, 0, class131.field3169);
            }
        }
        class23.field547 = class66.field1635;
        class131.field3180 = class44.field1097;
        class44.field1097 = -1;
        class66.field1635 = -1;
        if (class40.field1001 > 553 && class135.field3282 > 205 && class40.field1001 < 743 && class135.field3282 < 466) {
            if (class18.field440 != -1) {
                class44.method306(class135.field3282, 205, 553, class40.field1001, arg0 ^ 0x5A90, 466, 743, 1, class18.field440);
            } else if (class107.field2604[class126.field3014] != -1) {
                class44.method306(class135.field3282, 205, 553, class40.field1001, arg0 ^ 0x5A90, 466, 743, 1, class107.field2604[class126.field3014]);
            }
        }
        if (class66.field1635 != class51.field1304) {
            class45.field1124 = true;
            class51.field1304 = class66.field1635;
        }
        if (class44.field1097 != class1.field1) {
            class1.field1 = class44.field1097;
            class45.field1124 = true;
        }
        class66.field1635 = -1;
        class44.field1097 = -1;
        if (class40.field1001 > 17 && class135.field3282 > 357 && class40.field1001 < 496 && class135.field3282 < 453) {
            if (class108.field2624 != -1) {
                class44.method306(class135.field3282, 357, 17, class40.field1001, -23185, 453, 496, 2, class108.field2624);
            } else if (class69.field1671 != -1) {
                class44.method306(class135.field3282, 357, 17, class40.field1001, -23185, 453, 496, 3, class69.field1671);
            } else if (class135.field3282 < 434 && class40.field1001 < 426) {
                class38.method234(class40.field1001 - 17, -12511, class135.field3282 - 357);
            }
        }
        if ((class108.field2624 != -1 || class69.field1671 != -1) && class66.field1635 != class35.field900) {
            class122.field2880 = true;
            class35.field900 = class66.field1635;
        }
        if ((class108.field2624 != -1 || class69.field1671 != -1) && class53.field1349 != class44.field1097) {
            class53.field1349 = class44.field1097;
            class122.field2880 = true;
        }
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class48.field1231 - 1; var2++) {
                if (class45.field1122[var2] < 1000 && class45.field1122[var2 + 1] > 1000) {
                    var1 = false;
                    class40 var3 = class131.field3178[var2];
                    class131.field3178[var2] = class131.field3178[var2 + 1];
                    class131.field3178[var2 + 1] = var3;
                    int var4 = class45.field1122[var2];
                    class45.field1122[var2] = class45.field1122[var2 + 1];
                    class45.field1122[var2 + 1] = var4;
                    int var5 = class107.field2612[var2];
                    class107.field2612[var2] = class107.field2612[var2 + 1];
                    class107.field2612[var2 + 1] = var5;
                    int var6 = class22.field503[var2];
                    class22.field503[var2] = class22.field503[var2 + 1];
                    class22.field503[var2 + 1] = var6;
                    int var7 = class13.field338[var2];
                    class13.field338[var2] = class13.field338[var2 + 1];
                    class13.field338[var2 + 1] = var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "(I)V", line = 792)
    public static final void method873(int arg0) {
        class98.field2322 = 0;
        field2721++;
        class44.field1114 = 0;
        class66.method474(-2);
        class104.method772(-93);
        class38.method235(9);
        if (arg0 != 19611) {
            method869(false);
        }
        for (int var1 = 0; var1 < class98.field2322; var1++) {
            int var3 = class132.field3211[var1];
            if (class10.field242 != class130.field3142[var3].field829) {
                class130.field3142[var3].field531 = null;
                class130.field3142[var3] = null;
            }
        }
        if (class51.field1305 != class100.field2376.field2563) {
            throw new RuntimeException("gnp1 pos:" + class100.field2376.field2563 + " psize:" + class51.field1305);
        }
        for (int var2 = 0; var2 < class23.field548; var2++) {
            if (class130.field3142[class115.field2763[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class23.field548);
            }
        }
    }
}
