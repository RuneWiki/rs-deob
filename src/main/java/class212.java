import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class212 {

    @OriginalMember(owner = "client!td", name = "d", descriptor = "[I")
    public static int[] field3394 = new int[99];

    @OriginalMember(owner = "client!td", name = "a", descriptor = "I")
    public static int field3391 = 0;

    @OriginalMember(owner = "client!td", name = "h", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "I")
    public static int field3392;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "I")
    public static int field3395;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "I")
    public static int field3399;

    @OriginalMember(owner = "client!td", name = "j", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "Lef;")
    public static class241 field3396;

    @OriginalMember(owner = "client!td", name = "g", descriptor = "[S")
    public static short[] field3397;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V")
    public static final void method1406(int arg0) {
        field3393++;
        if (arg0 != -2) {
            field3400 = 32;
        }
        class283.field4499 = null;
        class241.field3793 = null;
        class288.field4604 = null;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V")
    public static void method1407(int arg0) {
        field3397 = null;
        if (arg0 != 28716) {
            method1406(49);
        }
        field3396 = null;
        field3394 = null;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ILla;)V")
    public static final void method1408(int arg0, class171 arg1) {
        arg1.field2837 = false;
        field3399++;
        if (arg1.field2901 != arg0) {
            class77 var2 = class28.method246(arg0 + 108, arg1.field2901);
            if (var2 == null || var2.field1256 == null) {
                arg1.field2901 = -1;
            } else {
                arg1.field2902++;
                if (arg1.field2858 < var2.field1256.length && arg1.field2902 > var2.field1282[arg1.field2858]) {
                    arg1.field2902 = 1;
                    arg1.field2858++;
                    arg1.field2811++;
                    class124.method916(arg1.field2887, arg1.field2849, arg0 + 477628497, class48.field878 == arg1, var2, arg1.field2858);
                }
                if (var2.field1256.length <= arg1.field2858) {
                    arg1.field2858 = 0;
                    arg1.field2902 = 0;
                    class124.method916(arg1.field2887, arg1.field2849, 477628496, class48.field878 == arg1, var2, arg1.field2858);
                }
                arg1.field2811 = arg1.field2858 + 1;
                if (arg1.field2811 >= var2.field1256.length) {
                    arg1.field2811 = 0;
                }
            }
        }
        if (arg1.field2817 != -1 && class207.field3336 >= arg1.field2856) {
            class281 var3 = class35.method298(arg1.field2817, false);
            int var4 = var3.field4455;
            if (var4 == -1) {
                arg1.field2817 = -1;
            } else {
                label294: {
                    class77 var5 = class28.method246(-49, var4);
                    if (var3.field4459) {
                        if (var5.field1274 == 3) {
                            if (arg1.field2883 > 0 && arg1.field2836 <= class207.field3336 && arg1.field2866 < class207.field3336) {
                                arg1.field2817 = -1;
                                break label294;
                            }
                        } else if (var5.field1274 == 1 && arg1.field2883 > 0 && class207.field3336 >= arg1.field2836 && class207.field3336 > arg1.field2866) {
                            arg1.field2856 = class207.field3336 + 1;
                            break label294;
                        }
                    }
                    if (var5 == null || var5.field1256 == null) {
                        arg1.field2817 = -1;
                    } else {
                        if (arg1.field2812 < 0) {
                            arg1.field2812 = 0;
                            class124.method916(arg1.field2887, arg1.field2849, 477628496, class48.field878 == arg1, var5, 0);
                        }
                        arg1.field2897++;
                        if (arg1.field2812 < var5.field1256.length && arg1.field2897 > var5.field1282[arg1.field2812]) {
                            arg1.field2897 = 1;
                            arg1.field2812++;
                            class124.method916(arg1.field2887, arg1.field2849, 477628496, class48.field878 == arg1, var5, arg1.field2812);
                        }
                        if (arg1.field2812 >= var5.field1256.length) {
                            if (var3.field4459) {
                                arg1.field2812 -= var5.field1260;
                                arg1.field2899++;
                                if (arg1.field2899 >= var5.field1264) {
                                    arg1.field2817 = -1;
                                } else if (arg1.field2812 >= 0 && arg1.field2812 < var5.field1256.length) {
                                    class124.method916(arg1.field2887, arg1.field2849, 477628496, class48.field878 == arg1, var5, arg1.field2812);
                                } else {
                                    arg1.field2817 = -1;
                                }
                            } else {
                                arg1.field2817 = -1;
                            }
                        }
                        arg1.field2823 = arg1.field2812 + 1;
                        if (arg1.field2823 >= var5.field1256.length) {
                            if (var3.field4459) {
                                arg1.field2823 -= var5.field1260;
                                if ((arg1.field2899 + 1) >= var5.field1264) {
                                    arg1.field2823 = -1;
                                } else if (arg1.field2823 < 0 || arg1.field2823 >= var5.field1256.length) {
                                    arg1.field2823 = -1;
                                }
                            } else {
                                arg1.field2823 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field2816 != -1 && arg1.field2885 <= 1) {
            class77 var6 = class28.method246(arg0 ^ 0xFFFFFFAC, arg1.field2816);
            if (var6.field1274 == 3) {
                if (arg1.field2883 > 0 && arg1.field2836 <= class207.field3336 && arg1.field2866 < class207.field3336) {
                    arg1.field2816 = -1;
                }
            } else if (var6.field1274 == 1 && arg1.field2883 > 0 && arg1.field2836 <= class207.field3336 && class207.field3336 > arg1.field2866) {
                arg1.field2885 = 1;
            }
        }
        if (arg1.field2816 != -1 && arg1.field2885 == 0) {
            class77 var7 = class28.method246(83, arg1.field2816);
            if (var7 == null || var7.field1256 == null) {
                arg1.field2816 = -1;
            } else {
                arg1.field2826++;
                if (var7.field1256.length > arg1.field2903 && arg1.field2826 > var7.field1282[arg1.field2903]) {
                    arg1.field2903++;
                    arg1.field2826 = 1;
                    class124.method916(arg1.field2887, arg1.field2849, 477628496, class48.field878 == arg1, var7, arg1.field2903);
                }
                if (var7.field1256.length <= arg1.field2903) {
                    arg1.field2888++;
                    arg1.field2903 -= var7.field1260;
                    if (arg1.field2888 >= var7.field1264) {
                        arg1.field2816 = -1;
                    } else if (arg1.field2903 >= 0 && var7.field1256.length > arg1.field2903) {
                        class124.method916(arg1.field2887, arg1.field2849, 477628496, class48.field878 == arg1, var7, arg1.field2903);
                    } else {
                        arg1.field2816 = -1;
                    }
                }
                arg1.field2886 = arg1.field2903 + 1;
                if (var7.field1256.length <= arg1.field2886) {
                    arg1.field2886 -= var7.field1260;
                    if (var7.field1264 <= arg1.field2888 + 1) {
                        arg1.field2886 = -1;
                    } else if (arg1.field2886 < 0 || var7.field1256.length <= arg1.field2886) {
                        arg1.field2886 = -1;
                    }
                }
                arg1.field2837 = var7.field1285;
            }
        }
        if (arg1.field2885 > 0) {
            arg1.field2885--;
        }
        for (int var8 = 0; var8 < arg1.field2847.length; var8++) {
            class161 var9 = arg1.field2847[var8];
            if (var9 != null) {
                if (var9.field2622 > 0) {
                    var9.field2622--;
                } else {
                    class77 var10 = class28.method246(66, var9.field2633);
                    if (var10 == null || var10.field1256 == null) {
                        arg1.field2847[var8] = null;
                    } else {
                        var9.field2639++;
                        if (var9.field2623 < var10.field1256.length && var9.field2639 > var10.field1282[var9.field2623]) {
                            var9.field2623++;
                            var9.field2639 = 1;
                            class124.method916(arg1.field2887, arg1.field2849, 477628496, class48.field878 == arg1, var10, var9.field2623);
                        }
                        if (var10.field1256.length <= var9.field2623) {
                            var9.field2623 -= var10.field1260;
                            var9.field2626++;
                            if (var10.field1264 <= var9.field2626) {
                                arg1.field2847[var8] = null;
                            } else if (var9.field2623 >= 0 && var10.field1256.length > var9.field2623) {
                                class124.method916(arg1.field2887, arg1.field2849, 477628496, class48.field878 == arg1, var10, var9.field2623);
                            } else {
                                arg1.field2847[var8] = null;
                            }
                        }
                        var9.field2624 = var9.field2623 + 1;
                        if (var10.field1256.length <= var9.field2624) {
                            var9.field2624 -= var10.field1260;
                            if (var10.field1264 <= (var9.field2626 + 1)) {
                                var9.field2624 = -1;
                            } else if (var9.field2624 < 0 || var9.field2624 >= var10.field1256.length) {
                                var9.field2624 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field3394[var1] = var0 / 4;
        }
        field3398 = -1;
    }
}
