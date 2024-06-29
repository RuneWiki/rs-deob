import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class12 {

    @OriginalMember(owner = "client!be", name = "f", descriptor = "Lrc;")
    public static class105 field231 = class43.method374("und loggen sich dann erneut ein)3", 0);

    @OriginalMember(owner = "client!be", name = "o", descriptor = "I")
    public static int field240 = 0;

    @OriginalMember(owner = "client!be", name = "r", descriptor = "I")
    public static int field243 = 0;

    @OriginalMember(owner = "client!be", name = "x", descriptor = "I")
    public static int field249 = 0;

    @OriginalMember(owner = "client!be", name = "m", descriptor = "[J")
    public static long[] field238 = new long[200];

    @OriginalMember(owner = "client!be", name = "j", descriptor = "Lle;")
    public static class71 field235 = new class71(64);

    @OriginalMember(owner = "client!be", name = "a", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!be", name = "g", descriptor = "I")
    private int field232;

    @OriginalMember(owner = "client!be", name = "h", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!be", name = "k", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!be", name = "l", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!be", name = "p", descriptor = "I")
    public static int field241;

    @OriginalMember(owner = "client!be", name = "s", descriptor = "I")
    public static int field244;

    @OriginalMember(owner = "client!be", name = "t", descriptor = "I")
    public static int field245;

    @OriginalMember(owner = "client!be", name = "v", descriptor = "I")
    public static int field247;

    @OriginalMember(owner = "client!be", name = "w", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "client!be", name = "y", descriptor = "I")
    public static int field250;

    @OriginalMember(owner = "client!be", name = "A", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!be", name = "B", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!be", name = "n", descriptor = "J")
    private long field239;

    @OriginalMember(owner = "client!be", name = "u", descriptor = "J")
    private long field246;

    @OriginalMember(owner = "client!be", name = "q", descriptor = "Lbd;")
    public static class11 field242;

    @OriginalMember(owner = "client!be", name = "i", descriptor = "Lic;")
    public static class51 field234;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "Z")
    public boolean field228;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "[I")
    private int[] field230;

    @OriginalMember(owner = "client!be", name = "z", descriptor = "[I")
    private int[] field251;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V", line = 11)
    public static void method140(int arg0) {
        field242 = null;
        field231 = null;
        field238 = null;
        field235 = null;
        if (arg0 != -513) {
            field243 = 122;
        }
        field234 = null;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IZZ)V", line = 26)
    public final void method141(int arg0, boolean arg1, boolean arg2) {
        field229++;
        if (arg1) {
            this.field251 = null;
        }
        int var4 = this.field251[arg0];
        if (arg2) {
            var4++;
            if (class90.field2077[arg0].length <= var4) {
                var4 = 0;
            }
        } else {
            var4--;
            if (var4 < 0) {
                var4 = class90.field2077[arg0].length - 1;
            }
        }
        this.field251[arg0] = var4;
        this.method152(0);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(II)Ld;", line = 62)
    public static final class19 method142(int arg0, int arg1) {
        field226++;
        class19 var2 = (class19) class61.field1354.method601((long) arg1, (byte) 118);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class98.field2260.method766(arg1, (byte) -45, 9);
        class19 var4 = new class19();
        var4.field463 = arg1;
        if (var3 != null) {
            var4.method216(new class7(var3), false);
        }
        var4.method219((byte) 100);
        if (arg0 <= 99) {
            method149(-58, (byte) -43);
        }
        class61.field1354.method608((long) arg1, var4, (byte) 121);
        return var4;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIII[Lte;IIIII)V", line = 95)
    public static final void method143(int arg0, int arg1, int arg2, int arg3, class119[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var10 = 0; var10 < arg4.length; var10++) {
            class119 var11 = arg4[var10];
            if (var11 != null && (var11.field2811 == 0 || var11.field2852) && var11 != null && var11.field2797 == arg0 && (!var11.field2815 || class15.field314)) {
                int var12 = var11.field2810 + arg5;
                if (!var11.field2825) {
                    var12 -= arg3;
                }
                int var13 = var11.field2862 + arg6;
                if (!var11.field2825) {
                    var13 -= arg2;
                }
                int var14 = var11.field2855 + var12;
                int var15 = var11.field2787 + var13;
                int var16 = arg5 < var12 ? var12 : arg5;
                int var17 = arg6 < var13 ? var13 : arg6;
                int var18 = var14 >= arg1 ? arg1 : var14;
                int var19 = var15 < arg9 ? var15 : arg9;
                if (var11.field2811 == 0) {
                    method143(var11.field2867, var18, var11.field2838, var11.field2794, arg4, var16, var17, arg7, 512, var19);
                    if (var11.field2831 != null) {
                        method143(var11.field2867, var18, var11.field2838, var11.field2794, var11.field2831, var16, var17, arg7, arg8, var19);
                    }
                }
                if (var11.field2852) {
                    boolean var20 = false;
                    if (class104.field2371 == 1 && class86.field1937 >= var16 && class30.field683 >= var17 && var18 > class86.field1937 && var19 > class30.field683) {
                        var20 = true;
                    }
                    if (var11.field2840 != -1 && var20 && class96.field2224 == null && (arg7 & 0x200) != 0 && !class130.field3165) {
                        class96.field2224 = var11;
                        class83.field1877 = class35.field816;
                        class16.field340 = false;
                        class50.field1061 = 0;
                        class80.field1795 = class75.field1664;
                    }
                    boolean var21 = false;
                    boolean var22;
                    if (var16 <= class75.field1664 && var17 <= class35.field816 && class75.field1664 < var18 && class35.field816 < var19) {
                        var22 = true;
                    } else {
                        var22 = false;
                    }
                    if (class9.field183 == 1 && var22) {
                        var21 = true;
                    }
                    if (class96.field2224 != null || class130.field3165) {
                        var21 = false;
                        var22 = false;
                        var20 = false;
                    }
                    if (!var11.field2792 && var20 && (arg7 & 0x1) != 0) {
                        var11.field2792 = true;
                        if (var11.field2773 != null) {
                            class66.method558(class30.field683 - var13, var11.field2773, var11, (byte) -110, 0, class86.field1937 - var12);
                        }
                    }
                    if (var11.field2792 && var21 && (arg7 & 0x4) != 0 && var11.field2845 != null) {
                        class66.method558(class35.field816 - var13, var11.field2845, var11, (byte) -83, 0, class75.field1664 - var12);
                    }
                    if (var11.field2792 && !var21 && (arg7 & 0x2) != 0) {
                        var11.field2792 = false;
                        if (var11.field2868 != null) {
                            class66.method558(class35.field816 - var13, var11.field2868, var11, (byte) -88, 0, class75.field1664 - var12);
                        }
                    }
                    if (var21 && (arg7 & 0x8) != 0 && var11.field2819 != null) {
                        class66.method558(class35.field816 - var13, var11.field2819, var11, (byte) -72, 0, class75.field1664 - var12);
                    }
                    if (!var11.field2782 && var22 && (arg7 & 0x10) != 0) {
                        var11.field2782 = true;
                        if (var11.field2860 != null) {
                            class66.method558(class35.field816 - var13, var11.field2860, var11, (byte) -114, 0, class75.field1664 - var12);
                        }
                    }
                    if (var11.field2782 && var22 && (arg7 & 0x40) != 0 && var11.field2861 != null) {
                        class66.method558(class35.field816 - var13, var11.field2861, var11, (byte) -128, 0, class75.field1664 - var12);
                    }
                    if (var11.field2782 && !var22 && (arg7 & 0x20) != 0) {
                        var11.field2782 = false;
                        if (var11.field2789 != null) {
                            class66.method558(class35.field816 - var13, var11.field2789, var11, (byte) -115, 0, class75.field1664 - var12);
                        }
                    }
                    if (var11.field2778 != null && (arg7 & 0x80) != 0) {
                        class66.method558(0, var11.field2778, var11, (byte) -85, 0, 0);
                    }
                    if (class130.field3160 == class104.field2351 && var11.field2876 != null && (arg7 & 0x100) != 0) {
                        class66.method558(0, var11.field2876, var11, (byte) -125, 0, 0);
                    }
                    if (class74.field1640 == class104.field2351 && var11.field2839 != null && (arg7 & 0x400) != 0) {
                        class66.method558(0, var11.field2839, var11, (byte) -94, 0, 0);
                    }
                }
            }
        }
        if (arg8 != 512) {
            method143(-99, -124, -58, -104, null, 86, 125, 63, 31, -94);
        }
        field227++;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lb;I)V", line = 268)
    public final void method144(class7 arg0, int arg1) {
        arg0.method102((byte) 123, this.field228 ? 1 : 0);
        for (int var3 = 0; var3 < 7; var3++) {
            int var5 = this.field230[class128.field3118[var3]];
            if (var5 == 0) {
                arg0.method102((byte) 123, -1);
            } else {
                arg0.method102((byte) 123, var5 - 256);
            }
        }
        field237++;
        int var4 = 0;
        if (arg1 == -4721) {
            while (var4 < 5) {
                arg0.method102((byte) 123, this.field251[var4]);
                var4++;
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(I)I", line = 305)
    public final int method145(int arg0) {
        field233++;
        int var2 = 80 / ((arg0 + 11) / 55);
        return this.field232 == -1 ? (this.field251[0] << 25) + (this.field251[4] << 20) + (this.field230[11] << 5) + (this.field230[0] << 15) + (this.field230[8] << 10) + this.field230[1] : method142(126, this.field232).field463 + 305419896;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Z[I[III)V", line = 322)
    public final void method146(boolean arg0, int[] arg1, int[] arg2, int arg3, int arg4) {
        field252++;
        if (arg2 == null) {
            arg2 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class42.field964; var7++) {
                    class109 var8 = class75.method635(var7, 3);
                    if (var8 != null && !var8.field2490 && var8.field2489 == (arg0 ? 7 : 0) + var6) {
                        arg2[class128.field3118[var6]] = var7 + 256;
                        break;
                    }
                }
            }
        }
        this.field232 = arg4;
        int var9 = 63 / ((arg3 + 50) / 52);
        this.field228 = arg0;
        this.field230 = arg2;
        this.field251 = arg1;
        this.method152(0);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IILtb;Ltb;I)Ljb;", line = 366)
    public final class56 method147(int arg0, int arg1, class116 arg2, class116 arg3, int arg4) {
        field253++;
        if (~this.field232 != arg4) {
            return method142(120, this.field232).method218(arg0, arg3, arg4 + 1762, arg1, arg2);
        }
        int[] var6 = this.field230;
        long var7 = this.field246;
        if (arg2 != null && (arg2.field2705 >= 0 || arg2.field2714 >= 0)) {
            var6 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var6[var9] = this.field230[var9];
            }
            if (arg2.field2705 >= 0) {
                var7 += arg2.field2705 - this.field230[5] << 8;
                var6[5] = arg2.field2705;
            }
            if (arg2.field2714 >= 0) {
                var7 += arg2.field2714 - this.field230[3] << 16;
                var6[3] = arg2.field2714;
            }
        }
        class56 var10 = (class56) class14.field257.method601(var7, (byte) 118);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var20 = var6[var12];
                if (var20 >= 256 && var20 < 512 && !class75.method635(var20 - 256, 3).method886((byte) 116)) {
                    var11 = true;
                }
                if (var20 >= 512 && !class75.method636(var20 - 512, arg4).method294(this.field228, -126)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field239 != -1L) {
                    var10 = (class56) class14.field257.method601(this.field239, (byte) 118);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                class56[] var13 = new class56[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var17 = var6[var15];
                    if (var17 >= 256 && var17 < 512) {
                        class56 var18 = class75.method635(var17 - 256, 3).method887(false);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                    if (var17 >= 512) {
                        class56 var19 = class75.method636(var17 - 512, 0).method290(this.field228, (byte) -30);
                        if (var19 != null) {
                            var13[var14++] = var19;
                        }
                    }
                }
                var10 = new class56(var13, var14);
                for (int var16 = 0; var16 < 5; var16++) {
                    if (this.field251[var16] != 0) {
                        var10.method434(class90.field2077[var16][0], class90.field2077[var16][this.field251[var16]]);
                        if (var16 == 1) {
                            var10.method434(class10.field187[0], class10.field187[this.field251[var16]]);
                        }
                    }
                }
                var10.method452();
                var10.method438(64, 850, -30, -50, -30, true);
                class14.field257.method608(var7, var10, (byte) 126);
                this.field239 = var7;
            }
        }
        if (arg2 == null && arg3 == null) {
            return var10;
        }
        class56 var21;
        if (arg2 != null && arg3 != null) {
            var21 = arg2.method945((byte) -122, arg1, arg3, var10, arg0);
        } else if (arg2 == null) {
            var21 = arg3.method940(arg0, false, var10);
        } else {
            var21 = arg2.method940(arg1, false, var10);
        }
        return var21;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(B)Ljb;", line = 569)
    public final class56 method148(byte arg0) {
        field247++;
        if (this.field232 != -1) {
            return method142(123, this.field232).method224(123);
        }
        boolean var2 = false;
        for (int var3 = 0; var3 < 12; var3++) {
            int var12 = this.field230[var3];
            if (var12 >= 256 && var12 < 512 && !class75.method635(var12 - 256, 3).method883(60)) {
                var2 = true;
            }
            if (var12 >= 512 && !class75.method636(var12 - 512, 0).method293(this.field228, 5771)) {
                var2 = true;
            }
        }
        if (var2) {
            return null;
        }
        class56[] var4 = new class56[12];
        int var5 = 0;
        int var6 = 0;
        if (arg0 != -60) {
            this.method148((byte) -91);
        }
        while (var6 < 12) {
            int var9 = this.field230[var6];
            if (var9 >= 256 && var9 < 512) {
                class56 var10 = class75.method635(var9 - 256, 3).method884(arg0 ^ 0xFFFFFFA7);
                if (var10 != null) {
                    var4[var5++] = var10;
                }
            }
            if (var9 >= 512) {
                class56 var11 = class75.method636(var9 - 512, 0).method299(98, this.field228);
                if (var11 != null) {
                    var4[var5++] = var11;
                }
            }
            var6++;
        }
        class56 var7 = new class56(var4, var5);
        for (int var8 = 0; var8 < 5; var8++) {
            if (this.field251[var8] != 0) {
                var7.method434(class90.field2077[var8][0], class90.field2077[var8][this.field251[var8]]);
                if (var8 == 1) {
                    var7.method434(class10.field187[0], class10.field187[this.field251[var8]]);
                }
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IB)Lua;", line = 675)
    public static final class121 method149(int arg0, byte arg1) {
        field241++;
        class121 var2 = (class121) class89.field2044.method601((long) arg0, (byte) 118);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class9.field172.method766(arg0, (byte) -45, 6);
        class121 var4 = new class121();
        var4.field2965 = arg0;
        if (arg1 != 62) {
            field234 = null;
        }
        if (var3 != null) {
            var4.method984(new class7(var3), (byte) 92);
        }
        var4.method974(arg1 + 128);
        if (var4.field2920) {
            var4.field2960 = false;
            var4.field2931 = false;
        }
        class89.field2044.method608((long) arg0, var4, (byte) 127);
        return var4;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ZI)V", line = 707)
    public final void method150(boolean arg0, int arg1) {
        field245++;
        if (this.field228 != arg0) {
            this.method146(arg0, this.field251, null, arg1 - 101, arg1);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ZII)V", line = 719)
    public final void method151(boolean arg0, int arg1, int arg2) {
        field236++;
        if (arg2 == 1 && this.field228) {
            return;
        }
        if (arg1 != 16) {
            this.method148((byte) -70);
        }
        int var4 = this.field230[class128.field3118[arg2]];
        if (var4 == 0) {
            return;
        }
        var4 -= 256;
        class109 var5;
        do {
            if (arg0) {
                var4++;
                if (class42.field964 <= var4) {
                    var4 = 0;
                }
            } else {
                var4--;
                if (var4 < 0) {
                    var4 = class42.field964 - 1;
                }
            }
            var5 = class75.method635(var4, 3);
        } while (var5 == null || var5.field2490 || arg2 + (this.field228 ? 7 : 0) != var5.field2489);
        this.field230[class128.field3118[arg2]] = var4 + 256;
        this.method152(0);
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(I)V", line = 769)
    private final void method152(int arg0) {
        field250++;
        long var2 = this.field246;
        int var4 = this.field230[5];
        int var5 = this.field230[9];
        this.field230[5] = var5;
        this.field230[9] = var4;
        this.field246 = arg0;
        for (int var6 = 0; var6 < 12; var6++) {
            this.field246 <<= 0x4;
            if (this.field230[var6] >= 256) {
                this.field246 += this.field230[var6] - 256;
            }
        }
        if (this.field230[0] >= 256) {
            this.field246 += this.field230[0] - 256 >> 4;
        }
        if (this.field230[1] >= 256) {
            this.field246 += this.field230[1] - 256 >> 8;
        }
        for (int var7 = 0; var7 < 5; var7++) {
            this.field246 <<= 0x3;
            this.field246 += this.field251[var7];
        }
        this.field246 <<= 0x1;
        this.field246 += this.field228 ? 1 : 0;
        this.field230[5] = var4;
        this.field230[9] = var5;
        if (var2 != 0L && this.field246 != var2) {
            class14.field257.method609(var2, arg0 ^ 0xFFFFFF82);
        }
    }
}
