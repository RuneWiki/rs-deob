import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class4 extends class307 {

    @OriginalMember(owner = "client!se", name = "o", descriptor = "Luc;")
    public static class108 field55 = new class108();

    @OriginalMember(owner = "client!se", name = "p", descriptor = "Loh;")
    public static class258 field56 = class153.method1046("leuchten3:", 99);

    @OriginalMember(owner = "client!se", name = "s", descriptor = "I")
    public static int field59 = 0;

    @OriginalMember(owner = "client!se", name = "r", descriptor = "I")
    public static int field58 = -1;

    @OriginalMember(owner = "client!se", name = "v", descriptor = "Z")
    public static boolean field62 = true;

    @OriginalMember(owner = "client!se", name = "u", descriptor = "[I")
    public static int[] field61 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!se", name = "q", descriptor = "Loh;")
    public static class258 field57 = class153.method1046("::fpsoff", 108);

    @OriginalMember(owner = "client!se", name = "t", descriptor = "Loh;")
    public static class258 field60 = class153.method1046("::errortest", 126);

    @OriginalMember(owner = "client!se", name = "w", descriptor = "Loh;")
    public static class258 field63 = class153.method1046(" steht bereits auf Ihrer Ignorieren)2Liste(Q", 96);

    @OriginalMember(owner = "client!se", name = "j", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!se", name = "k", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!se", name = "l", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!se", name = "m", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!se", name = "n", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIII)V", line = 11)
    public static final void method23(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class124 var5 = (class124) class140.field2387.method83(-102); var5 != null; var5 = (class124) class140.field2387.method87((byte) -80)) {
            class255.method1721((byte) 125, arg4, arg2, arg1, arg3, var5);
        }
        field51++;
        class124 var6 = (class124) class281.field4821.method83(-127);
        if (arg0 != -1) {
            field60 = (class258) null;
        }
        while (var6 != null) {
            byte var7 = 1;
            if (var6.field2212.field929 == var6.field2212.field909) {
                var7 = 0;
            } else if (var6.field2212.field937 == var6.field2212.field909) {
                var7 = 2;
            }
            if (var6.field2186 != var7) {
                int var8 = class245.method1675(var6.field2212, 77);
                if (var6.field2196 != var8) {
                    if (var6.field2193 != null) {
                        class184.field3279.method112(var6.field2193);
                        var6.field2193 = null;
                    }
                    var6.field2196 = var8;
                }
                var6.field2186 = var7;
            }
            var6.field2215 = var6.field2212.field912;
            var6.field2204 = var6.field2212.field912 + (var6.field2212.method447(18123) * 64);
            var6.field2214 = var6.field2212.field934;
            var6.field2201 = var6.field2212.field934 + var6.field2212.method447(18123) * 64;
            class255.method1721((byte) 125, arg4, arg2, arg1, arg3, var6);
            var6 = (class124) class281.field4821.method87((byte) -80);
        }
        for (class124 var9 = (class124) class205.field3542.method985(122); var9 != null; var9 = (class124) class205.field3542.method983(arg0)) {
            byte var10 = 1;
            if (var9.field2208.field929 == var9.field2208.field909) {
                var10 = 0;
            } else if (var9.field2208.field937 == var9.field2208.field909) {
                var10 = 2;
            }
            if (var9.field2186 != var10) {
                int var11 = class169.method1116(var9.field2208, ~arg0);
                if (var9.field2196 != var11) {
                    if (var9.field2193 != null) {
                        class184.field3279.method112(var9.field2193);
                        var9.field2193 = null;
                    }
                    var9.field2196 = var11;
                }
                var9.field2186 = var10;
            }
            var9.field2215 = var9.field2208.field912;
            var9.field2204 = var9.field2208.field912 + (var9.field2208.method447(18123) * 64);
            var9.field2214 = var9.field2208.field934;
            var9.field2201 = var9.field2208.field934 + (var9.field2208.method447(18123) * 64);
            class255.method1721((byte) 125, arg4, arg2, arg1, arg3, var9);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Loh;I)Z", line = 120)
    public static final boolean method24(class258 arg0, int arg1) {
        field53++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = arg1; var2 < class312.field5292; var2++) {
            if (arg0.method1778(-11925, class306.field5198[var2])) {
                return true;
            }
        }
        if (arg0.method1778(arg1 - 11925, class152.field2606.field4007)) {
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V", line = 145)
    public static void method25(int arg0) {
        field63 = null;
        field56 = null;
        field55 = null;
        field57 = null;
        field61 = null;
        if (arg0 != 0) {
            field55 = (class108) null;
        }
        field60 = null;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(BIIIII)V", line = 174)
    public static final void method26(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg2 - arg5;
        field54++;
        int var7 = arg4 - arg3;
        if (var6 == 0) {
            if (var7 != 0) {
                class101.method769(-93, arg5, arg1, arg3, arg4);
            }
        } else if (var7 == 0) {
            class120.method876(arg5, arg3, -124, arg2, arg1);
        } else {
            int var8 = -82 / ((arg0 - 12) / 58);
            int var9 = (var7 << 12) / var6;
            int var10 = arg3 - (arg5 * var9 >> 12);
            int var11;
            int var12;
            if (class75.field1314 > arg5) {
                var12 = var10 + (class75.field1314 * var9 >> 12);
                var11 = class75.field1314;
            } else if (arg5 > class206.field3562) {
                var11 = class206.field3562;
                var12 = var10 + (class206.field3562 * var9 >> 12);
            } else {
                var12 = arg3;
                var11 = arg5;
            }
            int var13;
            int var14;
            if (class75.field1314 > arg2) {
                var13 = (class75.field1314 * var9 >> 12) + var10;
                var14 = class75.field1314;
            } else if (arg2 <= class206.field3562) {
                var13 = arg4;
                var14 = arg2;
            } else {
                var14 = class206.field3562;
                var13 = (class206.field3562 * var9 >> 12) + var10;
            }
            if (var13 < class241.field4189) {
                var13 = class241.field4189;
                var14 = (class241.field4189 - var10 << 12) / var9;
            } else if (var13 > class94.field1654) {
                var14 = (class94.field1654 - var10 << 12) / var9;
                var13 = class94.field1654;
            }
            if (class241.field4189 > var12) {
                var12 = class241.field4189;
                var11 = (class241.field4189 - var10 << 12) / var9;
            } else if (class94.field1654 < var12) {
                var11 = (class94.field1654 - var10 << 12) / var9;
                var12 = class94.field1654;
            }
            class205.method1360(var14, (byte) 110, var13, var12, arg1, var11);
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(B)V", line = 281)
    public static final void method27(byte arg0) {
        field50++;
        class246 var1 = (class246) class294.field5050.method83(-116);
        int var2 = -115 % ((76 - arg0) / 35);
        while (var1 != null) {
            class162 var3 = var1.field4274;
            if (class272.field4704 != var3.field2726 || var3.field2723 < class202.field3498) {
                var1.method1054((byte) 118);
            } else if (var3.field2760 <= class202.field3498) {
                if (var3.field2752 > 0) {
                    class107 var4 = class16.field214[var3.field2752 - 1];
                    if (var4 != null && var4.field912 >= 0 && var4.field912 < 13312 && var4.field934 >= 0 && var4.field934 < 13312) {
                        var3.method1090(class202.field3498, (byte) -40, var4.field934, var4.field912, class228.method1525(true, var3.field2726, var4.field934, var4.field912) - var3.field2743);
                    }
                }
                if (var3.field2752 < 0) {
                    int var5 = -var3.field2752 - 1;
                    class231 var6;
                    if (class47.field698 == var5) {
                        var6 = class152.field2606;
                    } else {
                        var6 = class38.field527[var5];
                    }
                    if (var6 != null && var6.field912 >= 0 && var6.field912 < 13312 && var6.field934 >= 0 && var6.field934 < 13312) {
                        var3.method1090(class202.field3498, (byte) -54, var6.field934, var6.field912, class228.method1525(true, var3.field2726, var6.field934, var6.field912) - var3.field2743);
                    }
                }
                var3.method1087(84, class251.field4329);
                class317.method2181(class272.field4704, (int) var3.field2728, (int) var3.field2745, (int) var3.field2754, 60, var3, var3.field2755, -1L, false);
            }
            var1 = (class246) class294.field5050.method87((byte) -80);
        }
    }
}
