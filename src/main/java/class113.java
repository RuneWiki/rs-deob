import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class113 {

    @OriginalMember(owner = "client!t", name = "z", descriptor = "I")
    public int field2801 = 0;

    @OriginalMember(owner = "client!t", name = "m", descriptor = "I")
    public int field2788 = 0;

    @OriginalMember(owner = "client!t", name = "i", descriptor = "Lwb;")
    public static class130 field2784 = class26.method212("::hiddenbuttontest", -32376);

    @OriginalMember(owner = "client!t", name = "p", descriptor = "Lwb;")
    public static class130 field2791 = class26.method212("b12_full", -32376);

    @OriginalMember(owner = "client!t", name = "k", descriptor = "[I")
    public static int[] field2786 = new int[128];

    @OriginalMember(owner = "client!t", name = "o", descriptor = "Lwb;")
    private static class130 field2790 = class26.method212("Loading friend list", -32376);

    @OriginalMember(owner = "client!t", name = "f", descriptor = "Lwb;")
    private static class130 field2781 = class26.method212("Loading fonts )2 ", -32376);

    @OriginalMember(owner = "client!t", name = "x", descriptor = "Lwb;")
    public static class130 field2799 = field2781;

    @OriginalMember(owner = "client!t", name = "v", descriptor = "Lwb;")
    public static class130 field2797 = field2790;

    @OriginalMember(owner = "client!t", name = "n", descriptor = "Lwb;")
    public static class130 field2789 = class26.method212("(U3", -32376);

    @OriginalMember(owner = "client!t", name = "C", descriptor = "I")
    public static int field2804 = 255;

    @OriginalMember(owner = "client!t", name = "u", descriptor = "Lpc;")
    public static class93 field2796 = null;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "I")
    public int field2777;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "I")
    public int field2778;

    @OriginalMember(owner = "client!t", name = "e", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!t", name = "g", descriptor = "I")
    public int field2782;

    @OriginalMember(owner = "client!t", name = "h", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!t", name = "j", descriptor = "I")
    public int field2785;

    @OriginalMember(owner = "client!t", name = "l", descriptor = "I")
    public int field2787;

    @OriginalMember(owner = "client!t", name = "r", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!t", name = "s", descriptor = "I")
    public int field2794;

    @OriginalMember(owner = "client!t", name = "t", descriptor = "I")
    public int field2795;

    @OriginalMember(owner = "client!t", name = "w", descriptor = "I")
    public int field2798;

    @OriginalMember(owner = "client!t", name = "y", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!t", name = "D", descriptor = "I")
    public int field2805;

    @OriginalMember(owner = "client!t", name = "E", descriptor = "I")
    public int field2806;

    @OriginalMember(owner = "client!t", name = "F", descriptor = "I")
    public int field2807;

    @OriginalMember(owner = "client!t", name = "G", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!t", name = "H", descriptor = "Lbc;")
    public static class10 field2809;

    @OriginalMember(owner = "client!t", name = "d", descriptor = "Lsb;")
    public static class110 field2779;

    @OriginalMember(owner = "client!t", name = "B", descriptor = "Lsb;")
    public static class110 field2803;

    @OriginalMember(owner = "client!t", name = "q", descriptor = "Ldc;")
    public class22 field2792;

    @OriginalMember(owner = "client!t", name = "A", descriptor = "[Lec;")
    public static class28[] field2802;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Z)V", line = 4)
    public static void method864(boolean arg0) {
        field2786 = null;
        field2802 = null;
        field2791 = null;
        field2797 = null;
        field2784 = null;
        if (arg0) {
            method865(-67);
        }
        field2789 = null;
        field2781 = null;
        field2809 = null;
        field2779 = null;
        field2799 = null;
        field2790 = null;
        field2803 = null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V", line = 36)
    public static final void method865(int arg0) {
        class56.field1441 = null;
        class106.field2578 = null;
        class81.field1941 = null;
        class8.field288 = null;
        class117.field2895 = null;
        class6.field228 = null;
        class8.field263 = null;
        class105.field2536 = null;
        class4.field167 = null;
        class68.field1763 = null;
        if (arg0 <= 54) {
            method868(-84);
        }
        field2783++;
        class117.field2879 = null;
        class43.field1188 = null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(BIIII)V", line = 72)
    public static final void method866(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field2776++;
        for (class23 var5 = (class23) class23.field653.method813(69); var5 != null; var5 = (class23) class23.field653.method814((byte) -19)) {
            if (var5.field659 != -1 || var5.field654 != null) {
                int var6 = 0;
                if (var5.field649 < arg1) {
                    var6 += arg1 - var5.field649;
                } else if (var5.field651 > arg1) {
                    var6 += var5.field651 - arg1;
                }
                if (var5.field665 < arg4) {
                    var6 += arg4 - var5.field665;
                } else if (var5.field656 > arg4) {
                    var6 += var5.field656 - arg4;
                }
                if (var6 - 64 > var5.field666 || class98.field2368 == 0 || var5.field647 != arg3) {
                    if (var5.field650 != null) {
                        class9.field297.method873(var5.field650);
                        var5.field650 = null;
                    }
                    if (var5.field667 != null) {
                        class9.field297.method873(var5.field667);
                        var5.field667 = null;
                    }
                } else {
                    var6 -= 64;
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    int var7 = (var5.field666 - var6) * class98.field2368 / var5.field666;
                    if (var5.field650 != null) {
                        var5.field650.method679(var7);
                    } else if (var5.field659 >= 0) {
                        class62 var8 = class62.method519(class27.field775, var5.field659, 0);
                        if (var8 != null) {
                            class82 var9 = var8.method520().method618(class116.field2873);
                            class91 var10 = class91.method673(var9, 100, var7);
                            var10.method670(-1);
                            class9.field297.method876(var10);
                            var5.field650 = var10;
                        }
                    }
                    if (var5.field667 != null) {
                        var5.field667.method679(var7);
                        if (!var5.field667.method678()) {
                            var5.field667 = null;
                        }
                    } else if (var5.field654 != null && (var5.field646 -= arg2) <= 0) {
                        int var11 = (int) ((double) var5.field654.length * Math.random());
                        class62 var12 = class62.method519(class27.field775, var5.field654[var11], 0);
                        if (var12 != null) {
                            class82 var13 = var12.method520().method618(class116.field2873);
                            class91 var14 = class91.method673(var13, 100, var7);
                            var14.method670(0);
                            class9.field297.method876(var14);
                            var5.field646 = (int) ((double) (var5.field658 - var5.field668) * Math.random()) + var5.field668;
                            var5.field667 = var14;
                        }
                    }
                }
            }
        }
        if (arg0 != -62) {
            field2780 = 107;
        }
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(I)V", line = 203)
    public static final void method867(int arg0) {
        field2808++;
        int var1 = -28 / ((-arg0 - 75) / 47);
        if (class119.field2921 != 1) {
            return;
        }
        if (class105.field2558 >= 6 && class105.field2558 <= 106 && class35.field988 >= 467 && class35.field988 <= 499) {
            class121.field2965 = (class121.field2965 + 1) % 4;
            class106.field2576++;
            class129.field3047 = true;
            class96.field2316 = true;
            class14.field406.method727(0, -108);
            class14.field406.method330(-1, class121.field2965);
            class14.field406.method330(-1, class48.field1291);
            class14.field406.method330(-1, class101.field2420);
        }
        if (class105.field2558 >= 135 && class105.field2558 <= 235 && class35.field988 >= 467 && class35.field988 <= 499) {
            class96.field2316 = true;
            class106.field2576++;
            class129.field3047 = true;
            class48.field1291 = (class48.field1291 + 1) % 3;
            class14.field406.method727(0, -96);
            class14.field406.method330(-1, class121.field2965);
            class14.field406.method330(-1, class48.field1291);
            class14.field406.method330(-1, class101.field2420);
        }
        if (class105.field2558 >= 273 && class105.field2558 <= 373 && class35.field988 >= 467 && class35.field988 <= 499) {
            class96.field2316 = true;
            class101.field2420 = (class101.field2420 + 1) % 3;
            class129.field3047 = true;
            class14.field406.method727(0, 121);
            class106.field2576++;
            class14.field406.method330(-1, class121.field2965);
            class14.field406.method330(-1, class48.field1291);
            class14.field406.method330(-1, class101.field2420);
        }
        if (class105.field2558 < 412 || class105.field2558 > 512 || class35.field988 < 467 || class35.field988 > 499) {
            return;
        }
        if (class115.field2843 == -1) {
            class20.method189(29989);
            if (class99.field2401 != -1) {
                class116.field2874 = class115.field2843 = class99.field2401;
                class9.field291 = class9.field295;
                client.field539 = false;
                return;
            }
        } else {
            class41.method400(class9.field295, (byte) 56, class36.field1061, 0);
        }
        return;
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(I)V", line = 282)
    public static final void method868(int arg0) {
        field2793++;
        int var1 = class67.field1682.method721(8, (byte) -95);
        if (class61.field1582 > var1) {
            for (int var2 = var1; var2 < class61.field1582; var2++) {
                class81.field1933[class14.field403++] = class26.field770[var2];
            }
        }
        if (class61.field1582 < var1) {
            throw new RuntimeException("gppov1");
        }
        class61.field1582 = 0;
        int var3 = 0;
        if (arg0 != -3) {
            field2797 = null;
        }
        while (var1 > var3) {
            int var4 = class26.field770[var3];
            class59 var5 = class105.field2550[var4];
            int var6 = class67.field1682.method721(1, (byte) -98);
            if (var6 == 0) {
                class26.field770[class61.field1582++] = var4;
                var5.field2104 = class130.field3128;
            } else {
                int var7 = class67.field1682.method721(2, (byte) -120);
                if (var7 == 0) {
                    class26.field770[class61.field1582++] = var4;
                    var5.field2104 = class130.field3128;
                    class69.field1775[class45.field1220++] = var4;
                } else if (var7 == 1) {
                    class26.field770[class61.field1582++] = var4;
                    var5.field2104 = class130.field3128;
                    int var8 = class67.field1682.method721(3, (byte) -106);
                    var5.method652(false, 1, var8);
                    int var9 = class67.field1682.method721(1, (byte) -98);
                    if (var9 == 1) {
                        class69.field1775[class45.field1220++] = var4;
                    }
                } else if (var7 == 2) {
                    class26.field770[class61.field1582++] = var4;
                    var5.field2104 = class130.field3128;
                    int var10 = class67.field1682.method721(3, (byte) -95);
                    var5.method652(true, arg0 ^ 0xFFFFFFFC, var10);
                    int var11 = class67.field1682.method721(3, (byte) -108);
                    var5.method652(true, arg0 ^ 0xFFFFFFFC, var11);
                    int var12 = class67.field1682.method721(1, (byte) -127);
                    if (var12 == 1) {
                        class69.field1775[class45.field1220++] = var4;
                    }
                } else if (var7 == 3) {
                    class81.field1933[class14.field403++] = var4;
                }
            }
            var3++;
        }
    }
}
