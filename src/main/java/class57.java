import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class57 {

    @OriginalMember(owner = "client!i", name = "c", descriptor = "Lik;")
    public static class267 field902 = new class267(64);

    @OriginalMember(owner = "client!i", name = "f", descriptor = "Ljava/lang/String;")
    public static String field905 = "yellow:";

    @OriginalMember(owner = "client!i", name = "h", descriptor = "[I")
    public static int[] field907 = new int[14];

    @OriginalMember(owner = "client!i", name = "g", descriptor = "Ljava/lang/String;")
    public static String field906 = "Select";

    @OriginalMember(owner = "client!i", name = "a", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "I")
    public static int field901;

    @OriginalMember(owner = "client!i", name = "d", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!i", name = "i", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!i", name = "j", descriptor = "[I")
    public static int[] field909;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
    public static void method385(int arg0) {
        field905 = null;
        field907 = null;
        field906 = null;
        field902 = null;
        if (arg0 != 11971) {
            method386(-80, (byte) 22, -83, 91, -113);
        }
        field909 = null;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IBIII)V")
    public static final void method386(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 > -90) {
            field906 = null;
        }
        for (class151 var5 = (class151) class295.field4670.method983(7); var5 != null; var5 = (class151) class295.field4670.method985((byte) 104)) {
            class256.method1686(arg4, var5, false, arg0, arg3, arg2);
        }
        field903++;
        for (class151 var6 = (class151) class264.field3988.method983(7); var6 != null; var6 = (class151) class264.field3988.method985((byte) 123)) {
            class158 var11 = var6.field2191.method928(24840);
            byte var12 = 1;
            if (var6.field2191.field2303 == var11.field2414) {
                var12 = 0;
            } else if (var6.field2191.field2303 == var11.field2430 || var6.field2191.field2303 == var11.field2406 || var6.field2191.field2303 == var11.field2397 || var6.field2191.field2303 == var11.field2409) {
                var12 = 2;
            } else if (var6.field2191.field2303 == var11.field2411 || var6.field2191.field2303 == var11.field2419 || var6.field2191.field2303 == var11.field2415 || var6.field2191.field2303 == var11.field2420) {
                var12 = 3;
            }
            if (var6.field2179 != var12) {
                int var13 = class178.method1107(var6.field2191, true);
                if (var6.field2178 != var13) {
                    if (var6.field2175 != null) {
                        class213.field3187.method378(var6.field2175);
                        var6.field2175 = null;
                    }
                    var6.field2178 = var13;
                }
                var6.field2179 = var12;
            }
            var6.field2172 = var6.field2191.field2251;
            var6.field2180 = var6.field2191.field2251 + (var6.field2191.method676(-30217) * 64);
            var6.field2190 = var6.field2191.field2234;
            var6.field2186 = var6.field2191.field2234 + var6.field2191.method676(-30217) * 64;
            class256.method1686(arg4, var6, false, arg0, arg3, arg2);
        }
        for (class151 var7 = (class151) class278.field4193.method1665(16); var7 != null; var7 = (class151) class278.field4193.method1659((byte) -118)) {
            class158 var8 = var7.field2177.method928(24840);
            byte var9 = 1;
            if (var7.field2177.field2303 == var8.field2414) {
                var9 = 0;
            } else if (var7.field2177.field2303 == var8.field2430 || var7.field2177.field2303 == var8.field2406 || var7.field2177.field2303 == var8.field2397 || var7.field2177.field2303 == var8.field2409) {
                var9 = 2;
            } else if (var7.field2177.field2303 == var8.field2411 || var7.field2177.field2303 == var8.field2419 || var7.field2177.field2303 == var8.field2415 || var7.field2177.field2303 == var8.field2420) {
                var9 = 3;
            }
            if (var7.field2179 != var9) {
                int var10 = class112.method727((byte) 92, var7.field2177);
                if (var7.field2178 != var10) {
                    if (var7.field2175 != null) {
                        class213.field3187.method378(var7.field2175);
                        var7.field2175 = null;
                    }
                    var7.field2178 = var10;
                }
                var7.field2179 = var9;
            }
            var7.field2172 = var7.field2177.field2251;
            var7.field2180 = var7.field2177.field2251 + var7.field2177.method676(-30217) * 64;
            var7.field2190 = var7.field2177.field2234;
            var7.field2186 = var7.field2177.field2234 + var7.field2177.method676(-30217) * 64;
            class256.method1686(arg4, var7, false, arg0, arg3, arg2);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BILha;IIII)V")
    public static final void method387(byte arg0, int arg1, class31 arg2, int arg3, int arg4, int arg5, int arg6) {
        long var7 = 0L;
        if (arg3 == 0) {
            var7 = class154.method939(arg4, arg6, arg5);
        } else if (arg3 == 1) {
            var7 = class140.method865(arg4, arg6, arg5);
        } else if (arg3 == 2) {
            var7 = class268.method1794(arg4, arg6, arg5);
        } else if (arg3 == 3) {
            var7 = class92.method590(arg4, arg6, arg5);
        }
        boolean var9 = true;
        int var10 = Integer.MAX_VALUE & (int) (var7 >>> 32);
        field901++;
        boolean var11 = false;
        int var12 = (int) var7 >> 14 & 0x1F;
        if (arg0 <= 40) {
            method385(-92);
        }
        boolean var13 = false;
        int var14 = (int) var7 >> 20 & 0x3;
        class288 var15 = class274.method1816(64, var10);
        if (var15.method1908(-84)) {
            class180.method1130(arg4, arg6, 128, var15, arg5);
        }
        if (var7 == 0L) {
            return;
        }
        if (arg3 == 0) {
            class32.method212(arg4, arg6, arg5);
            if (var15.field4375 != 0) {
                arg2.method199(arg6, var14, var15.field4333, (byte) 64, arg5, var12, !var15.field4365);
            }
        } else if (arg3 == 1) {
            class40.method253(arg4, arg6, arg5);
        } else if (arg3 == 2) {
            class76.method510(arg4, arg6, arg5);
            if (var15.field4375 != 0 && (var15.field4383 + arg6) < 104 && (var15.field4383 + arg5) < 104 && (var15.field4307 + arg6) < 104 && var15.field4307 + arg5 < 104) {
                arg2.method197(arg5, var15.field4383, arg6, var15.field4333, (byte) 103, !var15.field4365, var14, var15.field4307);
            }
        } else if (arg3 == 3) {
            class127.method800(arg4, arg6, arg5);
            if (var15.field4375 == 1) {
                arg2.method200(arg5, (byte) -94, arg6);
            }
        }
        if (var15.field4336 != null) {
            class288 var20 = var15.method1906((byte) -124);
            return;
        }
    }
}
