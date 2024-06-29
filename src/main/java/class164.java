import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class164 {

    @OriginalMember(owner = "client!re", name = "a", descriptor = "J")
    public long field2934 = 0L;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "Z")
    public static boolean field2938 = false;

    @OriginalMember(owner = "client!re", name = "k", descriptor = "Ltg;")
    private static class184 field2944 = class135.method812("flash2:", 3);

    @OriginalMember(owner = "client!re", name = "g", descriptor = "Ltg;")
    public static class184 field2940 = field2944;

    @OriginalMember(owner = "client!re", name = "A", descriptor = "Ltg;")
    public static class184 field2960 = class135.method812("Fehler bei der Verbindung zum Server)3", 3);

    @OriginalMember(owner = "client!re", name = "y", descriptor = "[I")
    public static int[] field2958 = new int[500];

    @OriginalMember(owner = "client!re", name = "s", descriptor = "I")
    public static int field2952 = 0;

    @OriginalMember(owner = "client!re", name = "D", descriptor = "Ltg;")
    private static class184 field2963 = class135.method812("Click to switch", 3);

    @OriginalMember(owner = "client!re", name = "C", descriptor = "Ltg;")
    private static class184 field2962 = class135.method812("Loaded sprites", 3);

    @OriginalMember(owner = "client!re", name = "n", descriptor = "Ltg;")
    private static class184 field2947 = class135.method812("Connecting to server)3)3)3", 3);

    @OriginalMember(owner = "client!re", name = "d", descriptor = "Ltg;")
    public static class184 field2937 = field2947;

    @OriginalMember(owner = "client!re", name = "B", descriptor = "Ltg;")
    public static class184 field2961 = field2944;

    @OriginalMember(owner = "client!re", name = "w", descriptor = "Ltg;")
    public static class184 field2956 = field2962;

    @OriginalMember(owner = "client!re", name = "v", descriptor = "Ltg;")
    public static class184 field2955 = field2963;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "I")
    public int field2935;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!re", name = "h", descriptor = "I")
    public int field2941;

    @OriginalMember(owner = "client!re", name = "i", descriptor = "I")
    public int field2942;

    @OriginalMember(owner = "client!re", name = "j", descriptor = "I")
    public int field2943;

    @OriginalMember(owner = "client!re", name = "l", descriptor = "I")
    public int field2945;

    @OriginalMember(owner = "client!re", name = "m", descriptor = "I")
    public int field2946;

    @OriginalMember(owner = "client!re", name = "o", descriptor = "I")
    public int field2948;

    @OriginalMember(owner = "client!re", name = "p", descriptor = "I")
    public int field2949;

    @OriginalMember(owner = "client!re", name = "q", descriptor = "I")
    public static int field2950;

    @OriginalMember(owner = "client!re", name = "u", descriptor = "I")
    public int field2954;

    @OriginalMember(owner = "client!re", name = "x", descriptor = "I")
    public int field2957;

    @OriginalMember(owner = "client!re", name = "z", descriptor = "I")
    public int field2959;

    @OriginalMember(owner = "client!re", name = "t", descriptor = "Lud;")
    public static class190 field2953;

    @OriginalMember(owner = "client!re", name = "r", descriptor = "Lfb;")
    public class52 field2951;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ILea;III)V")
    public static final void method981(int arg0, class41 arg1, int arg2, int arg3, int arg4) {
        if (arg4 > -105) {
            method983((byte) 86);
        }
        field2936++;
        if (class133.field2404 >= 400) {
            return;
        }
        if (arg1.field785 != null) {
            arg1 = arg1.method240(-27284);
        }
        if (arg1 == null || !arg1.field779) {
            return;
        }
        class184 var5 = arg1.field760;
        if (arg1.field793 != 0) {
            var5 = class144.method884(0, new class184[] { var5, class98.method617((byte) -24, arg1.field793, class46.field872.field1282), client.field500, class157.field2812, class170.method1060(arg1.field793, -125), class41.field782 });
        }
        if (class187.field3610 == 1) {
            class57.field1014++;
            class198.method1277(class7.field127, -110, class144.method884(0, new class184[] { class150.field2689, class47.field894, var5 }), arg2, (short) 17, arg0, (long) arg3);
        } else if (!class209.field4013) {
            class120.field2160++;
            class184[] var6 = arg1.field767;
            if (class100.field1861) {
                var6 = class111.method684(var6, (byte) 67);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && !var6[var7].method1150(class91.field1697, -109)) {
                        class1.field34++;
                        byte var8 = 0;
                        if (var7 == 0) {
                            var8 = 41;
                        }
                        if (var7 == 1) {
                            var8 = 34;
                        }
                        if (var7 == 2) {
                            var8 = 19;
                        }
                        if (var7 == 3) {
                            var8 = 14;
                        }
                        if (var7 == 4) {
                            var8 = 48;
                        }
                        class198.method1277(var6[var7], -73, class144.method884(0, new class184[] { class116.field2099, var5 }), arg2, var8, arg0, (long) arg3);
                    }
                }
            }
            if (var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method1150(class91.field1697, -99)) {
                        class62.field1169++;
                        short var10 = 0;
                        if (arg1.field793 > class46.field872.field1282) {
                            var10 = 2000;
                        }
                        short var11 = 0;
                        if (var9 == 0) {
                            var11 = 41;
                        }
                        if (var9 == 1) {
                            var11 = 34;
                        }
                        if (var9 == 2) {
                            var11 = 19;
                        }
                        if (var9 == 3) {
                            var11 = 14;
                        }
                        if (var9 == 4) {
                            var11 = 48;
                        }
                        if (var11 != 0) {
                            var11 += var10;
                        }
                        class198.method1277(var6[var9], -18, class144.method884(0, new class184[] { class116.field2099, var5 }), arg2, var11, arg0, (long) arg3);
                    }
                }
            }
            class198.method1277(class11.field198, -122, class144.method884(0, new class184[] { class116.field2099, var5 }), arg2, (short) 1004, arg0, (long) arg3);
            return;
        } else if ((class106.field1920 & 0x2) == 2) {
            class76.field1395++;
            class198.method1277(class14.field270, -16, class144.method884(0, new class184[] { class84.field1553, class47.field894, var5 }), arg2, (short) 49, arg0, (long) arg3);
            return;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(II)Z")
    public static final boolean method982(int arg0, int arg1) {
        field2950++;
        if (arg0 != 22401) {
            return false;
        } else if (class59.field1104[arg1]) {
            return true;
        } else if (class119.field2151.method1254(11553, arg1)) {
            int var2 = class119.field2151.method1272(arg1, 19661);
            if (var2 == 0) {
                class59.field1104[arg1] = true;
                return true;
            }
            if (class149.field2670[arg1] == null) {
                class149.field2670[arg1] = new class167[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class149.field2670[arg1][var3] == null) {
                    byte[] var4 = class119.field2151.method1249((byte) 53, var3, arg1);
                    if (var4 != null) {
                        class149.field2670[arg1][var3] = new class167();
                        class149.field2670[arg1][var3].field3069 = (arg1 << 16) + var3;
                        if (var4[0] == -1) {
                            class149.field2670[arg1][var3].method1043(-102, new class97(var4));
                        } else {
                            class149.field2670[arg1][var3].method1038(new class97(var4), false);
                        }
                    }
                }
            }
            class59.field1104[arg1] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B)V")
    public static void method983(byte arg0) {
        field2962 = null;
        field2940 = null;
        field2961 = null;
        if (arg0 != -8) {
            method983((byte) -44);
        }
        field2963 = null;
        field2958 = null;
        field2937 = null;
        field2956 = null;
        field2955 = null;
        field2947 = null;
        field2953 = null;
        field2944 = null;
        field2960 = null;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(II[Lrh;)V")
    public static final void method984(int arg0, int arg1, class167[] arg2) {
        field2939++;
        int var3 = 0;
        int var4 = 60 / ((-arg1 - 4) / 43);
        while (var3 < arg2.length) {
            class167 var5 = arg2[var3];
            if (var5 != null) {
                if (var5.field3061 == 0) {
                    if (var5.field3097 != null) {
                        method984(arg0, 47, var5.field3097);
                    }
                    class7 var6 = (class7) class134.field2436.method51((long) var5.field3069, -97);
                    if (var6 != null) {
                        class185.method1173(arg0, 75, var6.field119);
                    }
                }
                if (arg0 == 0 && var5.field3038 != null) {
                    class5 var7 = new class5();
                    var7.field101 = var5;
                    var7.field96 = var5.field3038;
                    class54.method293(var7, 105);
                }
                if (arg0 == 1 && var5.field3055 != null) {
                    label60: {
                        if (var5.field2989 >= 0) {
                            class167 var8 = class44.method255(var5.field3069, 10583);
                            if (var8 == null || var8.field3097 == null || var5.field2989 >= var8.field3097.length || var8.field3097[var5.field2989] != var5) {
                                break label60;
                            }
                        }
                        class5 var9 = new class5();
                        var9.field96 = var5.field3055;
                        var9.field101 = var5;
                        class54.method293(var9, -113);
                    }
                }
            }
            var3++;
        }
    }
}
