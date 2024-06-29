import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class258 {

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "Ljava/lang/String;")
    public static String field4115 = "Connection lost.";

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "I")
    public static int field4116;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "I")
    public static int field4117;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "I")
    public static int field4118;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "I")
    public static int field4119;

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "I")
    public static int field4120;

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "I")
    public static int field4121;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "Leb;")
    public static class103 field4114;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1691(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4118++;
        int var7 = arg1 + arg2;
        int var8 = arg1 + arg5;
        int var9 = arg4 - arg1;
        int var10 = arg0 - arg1;
        for (int var11 = arg2; var11 < var7; var11++) {
            class168.method1184(128, arg0, arg5, arg6, class85.field1162[var11]);
        }
        for (int var12 = arg4; var12 > var9; var12--) {
            class168.method1184(128, arg0, arg5, arg6, class85.field1162[var12]);
        }
        if (arg3 != -10) {
            method1695(4, -109, -21, -28, -101, -58, -27, 4, (class197) null, 112, true, -38L);
        }
        for (int var13 = var7; var13 <= var9; var13++) {
            int[] var14 = class85.field1162[var13];
            class168.method1184(128, var8, arg5, arg6, var14);
            class168.method1184(128, arg0, var10, arg6, var14);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIIIILue;)Lue;")
    public static final class13 method1692(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class13 arg6) {
        if (arg3 != -10) {
            return null;
        }
        field4116++;
        long var7 = (long) arg0;
        class13 var9 = (class13) class92.field1306.method1839((byte) 31, var7);
        if (var9 == null) {
            class158 var10 = class158.method1076(class46.field557, arg0, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1090(64, 768, -50, -10, -50);
            class92.field1306.method1830(var7, -41, var9);
        }
        int var11 = arg6.method80();
        int var12 = arg6.method100();
        int var13 = arg6.method102();
        int var14 = arg6.method98();
        class13 var15 = var9.method96(true, true, true);
        if (arg2 != 0) {
            var15.method104(arg2);
        }
        class90 var16 = (class90) var15;
        if (class220.method1461(arg4 + var11, class28.field336, arg1 + var13, 36) != arg5 || class220.method1461(arg4 + var12, class28.field336, arg1 + var14, 91) != arg5) {
            for (int var17 = 0; var17 < var16.field1238; var17++) {
                var16.field1232[var17] += class220.method1461(var16.field1248[var17] + arg4, class28.field336, var16.field1223[var17] + arg1, arg3 + 117) - arg5;
            }
            var16.field1250 = false;
        }
        return var15;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V")
    public static void method1693(int arg0) {
        field4114 = null;
        field4115 = null;
        if (arg0 >= -2) {
            field4114 = null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ZLjj;BLjj;)V")
    public static final void method1694(boolean arg0, class134 arg1, byte arg2, class134 arg3) {
        class115.field1966 = arg1;
        class117.field1990 = arg3;
        field4120++;
        if (arg2 != 43) {
            method1692(28, -113, -85, -83, 100, -88, (class13) null);
        }
        class117.field1992 = arg0;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIIIIIILli;IZJ)Z")
    public static final boolean method1695(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class197 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class240.field3846 == class229.field3641;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var24 = arg2; var24 < arg2 + arg4; var24++) {
                if (var15 < 0 || var24 < 0 || var15 >= class236.field3769 || var24 >= class77.field1061) {
                    return false;
                }
                class99 var25 = class273.field4415[arg0][var15][var24];
                if (var25 != null && var25.field1503 >= 5) {
                    return false;
                }
            }
        }
        class138 var16 = new class138();
        var16.field2275 = arg11;
        var16.field2287 = arg0;
        var16.field2274 = arg5;
        var16.field2277 = arg6;
        var16.field2288 = arg7;
        var16.field2291 = arg8;
        var16.field2283 = arg9;
        var16.field2272 = arg1;
        var16.field2284 = arg2;
        var16.field2289 = arg1 + arg3 - 1;
        var16.field2285 = arg2 + arg4 - 1;
        for (int var17 = arg1; var17 < arg1 + arg3; var17++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var17 > arg1) {
                    var21++;
                }
                if (var17 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class273.field4415[var22][var17][var20] == null) {
                        class273.field4415[var22][var17][var20] = new class99(var22, var17, var20);
                    }
                }
                class99 var23 = class273.field4415[arg0][var17][var20];
                var23.field1496[var23.field1503] = var16;
                var23.field1507[var23.field1503] = var21;
                var23.field1492 |= var21;
                var23.field1503++;
                if (var13 && class20.field231[var17][var20] != 0) {
                    var14 = class20.field231[var17][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var18 = arg1; var18 < arg1 + arg3; var18++) {
                for (int var19 = arg2; var19 < arg2 + arg4; var19++) {
                    if (class20.field231[var18][var19] == 0) {
                        class20.field231[var18][var19] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class184.field2938[class26.field320++] = var16;
        }
        return true;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)V")
    public static final void method1696(byte arg0) {
        field4117++;
        class113.field1936.method1834(0);
        if (arg0 != 100) {
            method1692(121, 57, 38, 54, 14, 73, (class13) null);
        }
    }
}
