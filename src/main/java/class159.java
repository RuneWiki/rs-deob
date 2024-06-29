import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class159 extends class106 {

    @OriginalMember(owner = "client!rf", name = "O", descriptor = "I")
    private int field3087 = -1;

    @OriginalMember(owner = "client!rf", name = "S", descriptor = "I")
    private int field3091 = 0;

    @OriginalMember(owner = "client!rf", name = "H", descriptor = "Leh;")
    public static class47 field3080 = class195.method1282((byte) -4, "Hidden)2");

    @OriginalMember(owner = "client!rf", name = "P", descriptor = "Leh;")
    private static class47 field3088 = class195.method1282((byte) -4, "Players");

    @OriginalMember(owner = "client!rf", name = "X", descriptor = "Leh;")
    public static class47 field3096 = field3088;

    @OriginalMember(owner = "client!rf", name = "ab", descriptor = "I")
    public static int field3099 = 127;

    @OriginalMember(owner = "client!rf", name = "V", descriptor = "[Z")
    public static boolean[] field3094 = new boolean[100];

    @OriginalMember(owner = "client!rf", name = "R", descriptor = "Lpa;")
    public static class136 field3090 = new class136(64);

    @OriginalMember(owner = "client!rf", name = "I", descriptor = "I")
    public static int field3081;

    @OriginalMember(owner = "client!rf", name = "J", descriptor = "I")
    public static int field3082;

    @OriginalMember(owner = "client!rf", name = "K", descriptor = "I")
    public static int field3083;

    @OriginalMember(owner = "client!rf", name = "L", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!rf", name = "M", descriptor = "I")
    public int field3085;

    @OriginalMember(owner = "client!rf", name = "N", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!rf", name = "Q", descriptor = "I")
    public int field3089;

    @OriginalMember(owner = "client!rf", name = "T", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!rf", name = "U", descriptor = "I")
    public int field3093;

    @OriginalMember(owner = "client!rf", name = "Y", descriptor = "I")
    public static int field3097;

    @OriginalMember(owner = "client!rf", name = "Z", descriptor = "I")
    public static int field3098;

    @OriginalMember(owner = "client!rf", name = "bb", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!rf", name = "cb", descriptor = "I")
    public int field3101;

    @OriginalMember(owner = "client!rf", name = "W", descriptor = "J")
    public static long field3095;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lsh;I)V")
    public static final void method1085(class170 arg0, int arg1) {
        field3083++;
        arg0.field3333 = false;
        if (arg0.field3323 != -1) {
            class22 var2 = class25.method236(false, arg0.field3323);
            if (var2 == null || var2.field430 == null) {
                arg0.field3323 = -1;
            } else {
                arg0.field3304++;
                if (arg0.field3306 < var2.field430.length && var2.field419[arg0.field3306] < arg0.field3304) {
                    arg0.field3304 = 1;
                    arg0.field3306++;
                    class31.method274(-31182, arg0.field3306, arg0.field3291, var2, class123.field2489 == arg0, arg0.field3281);
                }
                if (var2.field430.length <= arg0.field3306) {
                    arg0.field3306 = 0;
                    arg0.field3304 = 0;
                    class31.method274(-31182, arg0.field3306, arg0.field3291, var2, class123.field2489 == arg0, arg0.field3281);
                }
            }
        }
        if (arg0.field3279 != -1 && arg0.field3292 <= class18.field362) {
            if (arg0.field3337 < 0) {
                arg0.field3337 = 0;
            }
            int var3 = class2.method8(arg0.field3279, arg1 ^ 0xFFFFFF99).field390;
            if (var3 == -1) {
                arg0.field3279 = -1;
            } else {
                class22 var4 = class25.method236(false, var3);
                if (var4 == null || var4.field430 == null) {
                    arg0.field3279 = -1;
                } else {
                    arg0.field3324++;
                    if (var4.field430.length > arg0.field3337 && var4.field419[arg0.field3337] < arg0.field3324) {
                        arg0.field3324 = 1;
                        arg0.field3337++;
                        class31.method274(-31182, arg0.field3337, arg0.field3291, var4, class123.field2489 == arg0, arg0.field3281);
                    }
                    if (arg0.field3337 >= var4.field430.length) {
                        arg0.field3279 = -1;
                    }
                }
            }
        }
        if (arg0.field3330 != -1 && arg0.field3329 <= 1) {
            class22 var5 = class25.method236(false, arg0.field3330);
            if (var5.field440 == 1 && arg0.field3300 > 0 && class18.field362 >= arg0.field3283 && arg0.field3339 < class18.field362) {
                arg0.field3329 = 1;
                return;
            }
        }
        if (arg0.field3330 != -1 && arg0.field3329 == 0) {
            class22 var6 = class25.method236(false, arg0.field3330);
            if (var6 == null || var6.field430 == null) {
                arg0.field3330 = -1;
            } else {
                arg0.field3305++;
                if (arg0.field3290 < var6.field430.length && arg0.field3305 > var6.field419[arg0.field3290]) {
                    arg0.field3290++;
                    arg0.field3305 = 1;
                    class31.method274(arg1 ^ 0xFFFF8633, arg0.field3290, arg0.field3291, var6, class123.field2489 == arg0, arg0.field3281);
                }
                if (arg0.field3290 >= var6.field430.length) {
                    arg0.field3290 -= var6.field416;
                    arg0.field3336++;
                    if (var6.field433 <= arg0.field3336) {
                        arg0.field3330 = -1;
                    } else if (arg0.field3290 >= 0 && var6.field430.length > arg0.field3290) {
                        class31.method274(-31182, arg0.field3290, arg0.field3291, var6, class123.field2489 == arg0, arg0.field3281);
                    } else {
                        arg0.field3330 = -1;
                    }
                }
                arg0.field3333 = var6.field425;
            }
        }
        if (arg1 != 1) {
            method1094(-56, -89, (byte) 58);
        }
        if (arg0.field3329 > 0) {
            arg0.field3329--;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILah;Lah;)V")
    public static final void method1086(int arg0, class9 arg1, class9 arg2) {
        if (arg0 != 256) {
            field3094 = null;
        }
        class126.field2522 = arg2;
        class158.field3065 = arg1;
        field3081++;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILsh;)V")
    public static final void method1087(int arg0, class170 arg1) {
        int var2 = arg1.field3283 - class18.field362;
        field3082++;
        arg1.field3273 = 0;
        int var3 = arg1.field3289 * 128 + arg1.field3276 * 64;
        if (arg1.field3313 == 0) {
            arg1.field3282 = 1024;
        }
        arg1.field3291 += (var3 - arg1.field3291) / var2;
        int var4 = arg1.field3311 * 128 + arg1.field3276 * 64;
        if (arg1.field3313 == 1) {
            arg1.field3282 = 1536;
        }
        arg1.field3281 += (var4 - arg1.field3281) / var2;
        if (arg1.field3313 == 2) {
            arg1.field3282 = 0;
        }
        if (~arg1.field3313 == arg0) {
            arg1.field3282 = 512;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)V")
    public static void method1088(byte arg0) {
        field3094 = null;
        field3088 = null;
        field3090 = null;
        field3080 = null;
        field3096 = null;
        if (arg0 > -89) {
            method1086(2, null, null);
        }
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(B)V")
    public static final void method1089(byte arg0) {
        field3098++;
        if (!client.field554) {
            return;
        }
        class181.field3462 = null;
        class12.field240 = null;
        class155.field3037 = null;
        class19.field377 = null;
        class64.field1399 = null;
        class40.field791 = null;
        class70.field1538 = null;
        class195.field3804 = null;
        class178.field3402 = null;
        class201.field3912 = null;
        class62.field1333 = null;
        class138.field2714 = null;
        class64.field1407 = null;
        class85.field1807 = null;
        class37.field729 = null;
        class173.field3355 = null;
        class198.field3866 = null;
        if (arg0 != 86) {
            field3090 = null;
        }
        class3.field47 = null;
        class141.field2759 = null;
        class68.field1460 = null;
        class70.field1541 = null;
        class61.field1200 = null;
        class189.method1245(2, (byte) -108);
        class106.method861(true, arg0 - 82);
        client.field554 = false;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lhd;BI)V")
    public final void method1090(class68 arg0, byte arg1, int arg2) {
        field3084++;
        int var4 = -113 % ((-arg1 - 62) / 32);
        while (true) {
            int var5 = arg0.method604((byte) -23);
            if (var5 == 0) {
                return;
            }
            this.method1092(var5, arg2, arg0, -115);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IZ)I")
    public static final int method1091(int arg0, boolean arg1) {
        field3097++;
        class95 var2 = class123.method943(!arg1, arg0);
        int var3 = var2.field1967;
        int var4 = var2.field1959;
        int var5 = var2.field1960;
        if (arg1) {
            return -123;
        } else {
            int var6 = class143.field2808[var5 - var4];
            return var6 & class83.field1778[var3] >> var4;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IILhd;I)V")
    private final void method1092(int arg0, int arg1, class68 arg2, int arg3) {
        if (arg0 == 1) {
            this.field3091 = arg2.method613(true);
            this.method1093(this.field3091, false);
        } else if (arg0 == 2) {
            this.field3087 = arg2.method569(26496);
            if (this.field3087 == 65535) {
                this.field3087 = -1;
            }
        } else if (arg0 == 3) {
            arg2.method569(26496);
        }
        int var5 = -14 % ((-arg3 - 48) / 39);
        field3086++;
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(IZ)V")
    private final void method1093(int arg0, boolean arg1) {
        field3092++;
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var3;
        double var11 = 0.0D;
        double var13 = var3;
        if (var5 < var3) {
            var13 = var5;
        }
        double var15 = 0.0D;
        if (var5 > var3) {
            var9 = var5;
        }
        if (var7 < var13) {
            var13 = var7;
        }
        if (var9 < var7) {
            var9 = var7;
        }
        if (arg1) {
            return;
        }
        double var17 = (var9 + var13) / 2.0D;
        if (var9 != var13) {
            if (var3 == var9) {
                var15 = (var5 - var7) / (var9 - var13);
            } else if (var5 == var9) {
                var15 = (var7 - var3) / (-var13 + var9) + 2.0D;
            } else if (var7 == var9) {
                var15 = (var3 - var5) / (var9 - var13) + 4.0D;
            }
            if (var17 < 0.5D) {
                var11 = (var9 - var13) / (var9 + var13);
            }
            if (var17 >= 0.5D) {
                var11 = (var9 - var13) / (2.0D - var9 - var13);
            }
        }
        if (var17 > 0.5D) {
            this.field3089 = (int) ((1.0D - var17) * var11 * 512.0D);
        } else {
            this.field3089 = (int) (var11 * var17 * 512.0D);
        }
        this.field3093 = (int) (var11 * 256.0D);
        this.field3101 = (int) (var17 * 256.0D);
        double var19 = var15 / 6.0D;
        if (this.field3101 < 0) {
            this.field3101 = 0;
        } else if (this.field3101 > 255) {
            this.field3101 = 255;
        }
        if (this.field3089 < 1) {
            this.field3089 = 1;
        }
        if (this.field3093 < 0) {
            this.field3093 = 0;
        } else if (this.field3093 > 255) {
            this.field3093 = 255;
        }
        this.field3085 = (int) ((double) this.field3089 * var19);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIB)V")
    public static final void method1094(int arg0, int arg1, byte arg2) {
        field3100++;
        class40 var3 = class31.field597[class196.field3827][arg1][arg0];
        if (var3 == null) {
            class32.method284(class196.field3827, arg1, arg0);
            return;
        }
        class156 var4 = (class156) var3.method345(-97);
        int var5 = -99999999;
        class156 var6 = null;
        while (var4 != null) {
            class73 var12 = class87.method713(-16, var4.field3057);
            int var13 = var12.field1581;
            if (var12.field1610 == 1) {
                var13 = (var4.field3051 + 1) * var13;
            }
            if (var13 > var5) {
                var5 = var13;
                var6 = var4;
            }
            var4 = (class156) var3.method348(13949);
        }
        if (var6 == null) {
            class32.method284(class196.field3827, arg1, arg0);
            return;
        }
        var3.method346(8, var6);
        class156 var7 = null;
        class156 var8 = null;
        class156 var9 = (class156) var3.method345(-120);
        if (arg2 >= -66) {
            return;
        }
        long var10 = (long) ((arg0 << 7) + (arg1 + 1610612736));
        while (var9 != null) {
            if (var6.field3057 != var9.field3057) {
                if (var7 == null) {
                    var7 = var9;
                }
                if (var7.field3057 != var9.field3057 && var8 == null) {
                    var8 = var9;
                }
            }
            var9 = (class156) var3.method348(13949);
        }
        class110.method886(class196.field3827, arg1, arg0, class39.method335(arg1 * 128 + 64, class196.field3827, arg0 * 128 + 64, 20896), var6, var10, var7, var8);
    }
}
