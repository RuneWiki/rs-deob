import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class128 {

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "Lq;")
    private class99 field3222 = new class99();

    @OriginalMember(owner = "client!vc", name = "y", descriptor = "Leb;")
    private class26 field3234 = new class26();

    @OriginalMember(owner = "client!vc", name = "x", descriptor = "I")
    private int field3233;

    @OriginalMember(owner = "client!vc", name = "z", descriptor = "I")
    private int field3235;

    @OriginalMember(owner = "client!vc", name = "w", descriptor = "La;")
    private class4 field3232;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "Lpd;")
    public static class94 field3215 = class28.method249(68, "Fertigkeit)2");

    @OriginalMember(owner = "client!vc", name = "o", descriptor = "I")
    public static int field3224 = 0;

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "Lpd;")
    public static class94 field3216 = class28.method249(109, "Bitte benutzen Sie eine andere Welt)3");

    @OriginalMember(owner = "client!vc", name = "p", descriptor = "Lte;")
    public static class119 field3225 = new class119();

    @OriginalMember(owner = "client!vc", name = "v", descriptor = "Luc;")
    public static class122 field3231 = new class122(new byte[5000]);

    @OriginalMember(owner = "client!vc", name = "A", descriptor = "[[B")
    public static byte[][] field3236 = new byte[50][];

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    public static int field3210;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "I")
    public static int field3211;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "I")
    public static int field3217;

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "I")
    public static int field3219;

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "I")
    public static int field3220;

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!vc", name = "n", descriptor = "I")
    public static int field3223;

    @OriginalMember(owner = "client!vc", name = "q", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!vc", name = "r", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!vc", name = "s", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!vc", name = "t", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!vc", name = "u", descriptor = "I")
    public static int field3230;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "Lla;")
    public static class66 field3213;

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field3218;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "[Ltc;")
    public static class116[] field3214;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(JB)Lq;", line = 7)
    public final class99 method1007(long arg0, byte arg1) {
        field3220++;
        class99 var4 = (class99) this.field3232.method19(25239, arg0);
        if (var4 != null) {
            this.field3234.method234(122, var4);
        }
        if (arg1 >= -37) {
            field3213 = null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIILme;IIII)V", line = 41)
    public static final void method1008(int arg0, int arg1, int arg2, int arg3, class77 arg4, int arg5, int arg6, int arg7, int arg8) {
        if (class51.field1279) {
            class20.field535 = 32;
        } else {
            class20.field535 = 0;
        }
        if (arg5 <= 86) {
            field3225 = null;
        }
        field3217++;
        class51.field1279 = false;
        if (arg8 <= arg0 && arg8 + 16 > arg0 && arg6 <= arg7 && arg7 < arg6 + 16) {
            arg4.field1915 -= class37.field968 * 4;
            if (arg1 == 2 || arg1 == 3) {
                class73.field1781 = true;
            }
            if (arg1 == 1) {
                class135.field3323 = true;
                return;
            }
        } else if (arg8 <= arg0 && arg8 + 16 > arg0 && arg3 + arg6 - 16 <= arg7 && arg3 + arg6 > arg7) {
            if (arg1 == 2 || arg1 == 3) {
                class73.field1781 = true;
            }
            if (arg1 == 1) {
                class135.field3323 = true;
            }
            arg4.field1915 += class37.field968 * 4;
            return;
        } else if (arg0 >= arg8 - class20.field535 && arg0 < class20.field535 + arg8 + 16 && arg7 >= arg6 + 16 && arg3 + arg6 - 16 > arg7 && class37.field968 > 0) {
            if (arg1 == 1) {
                class135.field3323 = true;
            }
            if (arg1 == 2 || arg1 == 3) {
                class73.field1781 = true;
            }
            int var9 = (arg3 - 32) * arg3 / arg2;
            if (var9 < 8) {
                var9 = 8;
            }
            int var10 = arg7 - arg6 - var9 / 2 - 16;
            int var11 = arg3 - var9 - 32;
            arg4.field1915 = (arg2 - arg3) * var10 / var11;
            class51.field1279 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)V", line = 118)
    public static void method1009(byte arg0) {
        field3216 = null;
        field3218 = null;
        field3213 = null;
        field3231 = null;
        if (arg0 > 90) {
            field3215 = null;
            field3214 = null;
            field3236 = null;
            field3225 = null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)Z", line = 146)
    public static final boolean method1010(int arg0, int arg1) {
        field3219++;
        if (!class98.method741((byte) -89, arg0)) {
            return false;
        } else if (arg1 <= 25) {
            return false;
        } else {
            class77[] var2 = class108.field2673[arg0];
            boolean var3 = false;
            for (int var4 = 0; var4 < var2.length; var4++) {
                class77 var5 = var2[var4];
                if (var5 != null && var5.field1917 == 6) {
                    if (var5.field1931 != -1 || var5.field1879 != -1) {
                        boolean var6 = class2.method12(var5, (byte) -59);
                        int var7;
                        if (var6) {
                            var7 = var5.field1879;
                        } else {
                            var7 = var5.field1931;
                        }
                        if (var7 != -1) {
                            class57 var8 = class70.method519(5, var7);
                            var5.field1941 += class66.field1620;
                            label57: while (true) {
                                do {
                                    do {
                                        if (var8.field1420[var5.field1904] >= var5.field1941) {
                                            break label57;
                                        }
                                        var5.field1941 -= var8.field1420[var5.field1904];
                                        var5.field1904++;
                                        var3 = true;
                                    } while (var5.field1904 < var8.field1425.length);
                                    var5.field1904 -= var8.field1435;
                                } while (var5.field1904 >= 0 && var8.field1425.length > var5.field1904);
                                var5.field1904 = 0;
                            }
                        }
                    }
                    if (var5.field1966 != 0 && !var5.field1895) {
                        int var9 = var5.field1966 >> 16;
                        int var10 = class66.field1620 * var9;
                        var3 = true;
                        var5.field1892 = var5.field1892 + var10 & 0x7FF;
                        int var11 = var5.field1966 << 16 >> 16;
                        int var12 = class66.field1620 * var11;
                        var5.field1875 = var5.field1875 + var12 & 0x7FF;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IJ)V", line = 228)
    public final void method1011(int arg0, long arg1) {
        field3229++;
        if (arg0 != -15205) {
            method1008(76, 24, 122, -88, null, -91, 119, 7, 113);
        }
        class99 var4 = (class99) this.field3232.method19(arg0 ^ 0xFFFFA60C, arg1);
        if (var4 != null) {
            var4.method1074((byte) -28);
            var4.method744((byte) -97);
            this.field3235++;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILq;J)V", line = 265)
    public final void method1012(int arg0, class99 arg1, long arg2) {
        if (this.field3235 == 0) {
            class99 var5 = this.field3234.method233(30414);
            var5.method1074((byte) -28);
            var5.method744((byte) -69);
            if (this.field3222 == var5) {
                class99 var6 = this.field3234.method233(30414);
                var6.method1074((byte) -28);
                var6.method744((byte) -80);
            }
        } else {
            this.field3235--;
        }
        this.field3232.method24(arg2, arg1, -53);
        field3226++;
        this.field3234.method234(arg0 ^ 0x6D, arg1);
        if (arg0 != 50) {
            field3224 = -33;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V", line = 295)
    public final void method1013(int arg0) {
        while (true) {
            class99 var2 = this.field3234.method233(30414);
            if (var2 == null) {
                this.field3235 = this.field3233;
                if (arg0 != -1) {
                    return;
                }
                field3211++;
                return;
            }
            var2.method1074((byte) -28);
            var2.method744((byte) -115);
        }
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(JB)V", line = 319)
    public static final void method1014(long arg0, byte arg1) {
        if (arg1 != 114) {
            return;
        }
        field3227++;
        if (arg0 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class89.field2322; var3++) {
            if (class79.field2009[var3] == arg0) {
                class135.field3323 = true;
                class89.field2322--;
                for (int var4 = var3; var4 < class89.field2322; var4++) {
                    class79.field2009[var4] = class79.field2009[var4 + 1];
                }
                class107.field2670.method326(43, -124);
                class107.field2670.method965(arg1 - 208, arg0);
                class88.field2264++;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILs;Ls;)V", line = 361)
    public static final void method1015(int arg0, class111 arg1, class111 arg2) {
        class54.field1370 = arg2;
        field3221++;
        class10.field269 = arg1;
        if (arg0 != -1) {
            method1015(-84, null, null);
        }
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(B)V", line = 389)
    public static final void method1016(byte arg0) {
        field3230++;
        for (int var1 = 0; var1 < class9.field245; var1++) {
            int var10002 = class69.field1667[var1]--;
            if (class69.field1667[var1] >= -10) {
                class35 var4 = class2.field63[var1];
                if (var4 == null) {
                    var4 = class35.method282(class30.field867, class52.field1311[var1], 0);
                    if (var4 == null) {
                        continue;
                    }
                    class69.field1667[var1] += var4.method280();
                    class2.field63[var1] = var4;
                }
                if (class69.field1667[var1] < 0) {
                    int var5;
                    if (class12.field296[var1] == 0) {
                        var5 = class20.field537;
                    } else {
                        int var6 = (class12.field296[var1] & 0xFF) * 128;
                        int var7 = class12.field296[var1] >> 16 & 0xFF;
                        int var8 = var7 * 128 + 64 - class80.field2044.field177;
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        int var9 = class12.field296[var1] >> 8 & 0xFF;
                        int var10 = var9 * 128 + 64 - class80.field2044.field222;
                        if (var10 < 0) {
                            var10 = -var10;
                        }
                        int var11 = var8 + var10 - 128;
                        if (var11 > var6) {
                            class69.field1667[var1] = -100;
                            continue;
                        }
                        if (var11 < 0) {
                            var11 = 0;
                        }
                        var5 = (var6 - var11) * class31.field897 / var6;
                    }
                    class60 var12 = var4.method281().method459(class99.field2512);
                    class53 var13 = class53.method421(var12, 100, var5);
                    var13.method416(class23.field612[var1] - 1);
                    class26.field700.method850(var13);
                    class69.field1667[var1] = -100;
                }
            } else {
                class9.field245--;
                for (int var3 = var1; var3 < class9.field245; var3++) {
                    class52.field1311[var3] = class52.field1311[var3 + 1];
                    class2.field63[var3] = class2.field63[var3 + 1];
                    class23.field612[var3] = class23.field612[var3 + 1];
                    class69.field1667[var3] = class69.field1667[var3 + 1];
                    class12.field296[var3] = class12.field296[var3 + 1];
                }
                var1--;
            }
        }
        int var2 = -47 % ((arg0 + 5) / 59);
        if (class103.field2595 <= 0) {
            return;
        }
        class103.field2595 -= 20;
        if (class103.field2595 < 0) {
            class103.field2595 = 0;
        }
        if (class103.field2595 == 0 && class112.field2837 != 0 && class36.field946 != -1) {
            class123.method969(false, class77.field1978, class36.field946, 0, class112.field2837, true, 0);
            return;
        }
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(I)V", line = 538)
    public class128(int arg0) {
        this.field3233 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3235 = arg0;
        this.field3232 = new class4(var2);
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(II)V", line = 526)
    public static final void method1017(int arg0, int arg1) {
        int var2 = -74 / ((arg0 - 26) / 44);
        class46.method344(null, arg1, 0, false, 0);
        field3228++;
    }
}
