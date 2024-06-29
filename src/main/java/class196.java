import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class196 extends class266 {

    @OriginalMember(owner = "client!cs", name = "s", descriptor = "Lnn;")
    public static class151 field2957 = new class151("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");

    @OriginalMember(owner = "client!cs", name = "r", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!cs", name = "t", descriptor = "I")
    public static int field2958;

    @OriginalMember(owner = "client!cs", name = "u", descriptor = "I")
    public static int field2959;

    @OriginalMember(owner = "client!cs", name = "v", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!cs", name = "w", descriptor = "I")
    public static int field2961;

    @OriginalMember(owner = "client!cs", name = "x", descriptor = "I")
    public static int field2962;

    @OriginalMember(owner = "client!cs", name = "C", descriptor = "I")
    public static int field2967;

    @OriginalMember(owner = "client!cs", name = "y", descriptor = "Lp;")
    public static class164 field2963;

    @OriginalMember(owner = "client!cs", name = "A", descriptor = "Ldr;")
    public static class261 field2965;

    @OriginalMember(owner = "client!cs", name = "B", descriptor = "Lwg;")
    public static class37 field2966;

    @OriginalMember(owner = "client!cs", name = "D", descriptor = "[Lkr;")
    public static class234[] field2968;

    @OriginalMember(owner = "client!cs", name = "z", descriptor = "[Lvq;")
    public static class311[] field2964;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)V")
    public static final void method1170(int arg0) {
        field2959++;
        class377.method2269((byte) 99);
        class371.method2230(false);
        class67.method454(-1824122228);
        class442.method2705(21);
        class376.method2264(-1);
        class186.field2796.method1111((byte) 111);
        class261.method1613((byte) -9);
        class377.method2272(30396);
        class458.method2842((byte) -115);
        class442.method2706(-1913498960);
        class295.method1833(true);
        class128.method754(false);
        class409.method2566(19);
        class437.method2684((byte) -93);
        class344.method2098((byte) 71);
        class147.method918((byte) 84);
        class331.method2034(-14);
        class381.method2295((byte) 120);
        class204.method1207(0);
        class145.method895(1);
        class201.method1201(30541);
        class351.method2113(0);
        if (class265.field4046 != 0) {
            for (int var1 = 0; var1 < class138.field1874.length; var1++) {
                class138.field1874[var1] = null;
            }
            class379.field5538 = 0;
        }
        class320.method1952(-128);
        class430.method2642(17516);
        class449.method2766(128);
        class278.method1720(3496);
        class449.method2768(128);
        class384.field5614.method1485(-22032);
        field2965.method424();
        class440.field6472.method925(true);
        class405.method2546(-123);
        class447.field6591.method818(-104);
        class355.field5241.method818(124);
        class296.field4494.method818(-106);
        class316.field4786.method818(125);
        class435.field6408.method818(-128);
        class265.field4048.method818(-111);
        class298.field4505.method818(126);
        class320.field4840.method818(-92);
        class427.field6274.method818(127);
        class357.field5265.method818(-75);
        class13.field169.method818(-6);
        class95.field1330.method818(127);
        class241.field3627.method818(126);
        class430.field6321.method818(124);
        class339.field5051.method818(-76);
        class163.field2258.method818(123);
        class261.field3978.method818(-67);
        class296.field4496.method818(124);
        class253.field3862.method818(124);
        class81.field1079.method818(127);
        class458.field6792.method818(123);
        class133.field1727.method818(127);
        class183.field2741.method818(-128);
        class135.field1786.method818(127);
        class387.field5724.method818(127);
        class451.field6658.method818(-65);
        class324.field4876.method818(-47);
        class362.field5335.method818(-18);
        if (arg0 < 23) {
            field2958 = 78;
        }
        class302.field4572.method818(-87);
        class245.field3665.method1485(-22032);
        class458.field6784.method1485(-22032);
        class296.field4486.method1485(-22032);
        class294.field4479.method1485(-22032);
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(I[IBJ)Ljava/lang/String;")
    public static final String method1171(int arg0, int[] arg1, byte arg2, long arg3) {
        field2961++;
        if (class399.field5962 != null) {
            String var5 = class399.field5962.method737(arg1, arg3, (byte) 120, arg0);
            if (var5 != null) {
                return var5;
            }
        }
        return arg2 < 65 ? null : Long.toString(arg3);
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIIIZ)V")
    public static final void method1172(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2956++;
        for (class71 var5 = (class71) class451.field6638.method2514((byte) 61); var5 != null; var5 = (class71) class451.field6638.method2511(-108)) {
            class377.method2267(-4935, arg0, arg2, var5, arg1, arg3);
        }
        if (!arg4) {
            return;
        }
        for (class71 var6 = (class71) class281.field4298.method2514((byte) 61); var6 != null; var6 = (class71) class281.field4298.method2511(-121)) {
            byte var11 = 1;
            class433 var12 = var6.field915.method902(26647);
            if (var6.field915.field1933) {
                var11 = 0;
            } else if (var6.field915.field1936 == var12.field6357 || var6.field915.field1936 == var12.field6358 || var6.field915.field1936 == var12.field6369 || var6.field915.field1936 == var12.field6361) {
                var11 = 2;
            } else if (var6.field915.field1936 == var12.field6367 || var6.field915.field1936 == var12.field6386 || var6.field915.field1936 == var12.field6384 || var6.field915.field1936 == var12.field6353) {
                var11 = 3;
            }
            if (var6.field926 != var11) {
                int var13 = class8.method62(var6.field915, -1);
                if (var6.field921 != var13) {
                    if (var6.field919 != null) {
                        class267.field4077.method2135(var6.field919);
                        var6.field919 = null;
                    }
                    var6.field921 = var13;
                }
                var6.field926 = var11;
            }
            var6.field923 = var6.field915.field1900;
            var6.field908 = var6.field915.field1900 + (var6.field915.method911(0) * 64);
            var6.field927 = var6.field915.field1892;
            var6.field929 = var6.field915.field1892 + (var6.field915.method911(0) * 64);
            class377.method2267(-4935, arg0, arg2, var6, arg1, arg3);
        }
        for (class71 var7 = (class71) class466.field6858.method2296(5773); var7 != null; var7 = (class71) class466.field6858.method2304(100)) {
            byte var8 = 1;
            class433 var9 = var7.field918.method902(26647);
            if (var7.field918.field1933) {
                var8 = 0;
            } else if (var7.field918.field1936 == var9.field6357 || var7.field918.field1936 == var9.field6358 || var7.field918.field1936 == var9.field6369 || var7.field918.field1936 == var9.field6361) {
                var8 = 2;
            } else if (var7.field918.field1936 == var9.field6367 || var7.field918.field1936 == var9.field6386 || var7.field918.field1936 == var9.field6384 || var7.field918.field1936 == var9.field6353) {
                var8 = 3;
            }
            if (var7.field926 != var8) {
                int var10 = class233.method1407((byte) -75, var7.field918);
                if (var7.field921 != var10) {
                    if (var7.field919 != null) {
                        class267.field4077.method2135(var7.field919);
                        var7.field919 = null;
                    }
                    var7.field921 = var10;
                }
                var7.field926 = var8;
            }
            var7.field923 = var7.field918.field1900;
            var7.field908 = var7.field918.field1900 + var7.field918.method911(0) * 64;
            var7.field927 = var7.field918.field1892;
            var7.field929 = var7.field918.field1892 + (var7.field918.method911(0) * 64);
            class377.method2267(-4935, arg0, arg2, var7, arg1, arg3);
        }
    }

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "(I)V")
    public static void method1173(int arg0) {
        field2964 = null;
        field2965 = null;
        field2968 = null;
        if (arg0 == 64) {
            field2966 = null;
            field2957 = null;
            field2963 = null;
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(II)I")
    public static final int method1174(int arg0, int arg1) {
        int var7 = arg1 - 1;
        field2960++;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        if (arg0 < 2) {
            field2957 = null;
        }
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "(I)Lfb;")
    public static final class32 method1175(int arg0) {
        if (arg0 != 0) {
            field2968 = null;
        }
        field2962++;
        class32 var1 = (class32) class423.field6225.method42(true);
        if (var1 != null) {
            var1.method625((byte) -50);
            var1.method2627(arg0);
            return var1;
        }
        class32 var2;
        do {
            var2 = (class32) class236.field3537.method42(true);
            if (var2 == null) {
                return null;
            }
            if (var2.method186(arg0 - 120) > class445.method2750(-27580)) {
                return null;
            }
            var2.method625((byte) -50);
            var2.method2627(arg0);
        } while ((var2.field6254 & Long.MIN_VALUE) == 0L);
        return var2;
    }
}
