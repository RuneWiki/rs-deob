import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class154 {

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "[[B")
    public static byte[][] field2254 = new byte[1000][];

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "[Lob;")
    public static class152[] field2256 = new class152[14];

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "I")
    public static int field2255;

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "I")
    public static int field2257;

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "Loh;")
    public static class240 field2251;

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "Ljk;")
    public static class297 field2252;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field2253;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZIILqf;Lqf;)I")
    public static final int method1042(boolean arg0, int arg1, int arg2, class293 arg3, class293 arg4) {
        field2255++;
        if (arg1 == 1) {
            int var5 = arg3.field2275;
            int var6 = arg4.field2275;
            if (!arg0) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg1 == 2) {
            return class266.method1798(0, arg4.method1933(arg2 ^ 0xFFFFEE65).field3840, class24.field394, arg3.method1933(29290).field3840);
        } else if (arg1 == 3) {
            if (arg3.field4446.equals("-")) {
                if (arg4.field4446.equals("-")) {
                    return 0;
                } else if (arg0) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg4.field4446.equals("-")) {
                return arg0 ? 1 : -1;
            } else {
                return class266.method1798(arg2 + 25585, arg4.field4446, class24.field394, arg3.field4446);
            }
        } else if (arg1 == 4) {
            if (arg3.method1056(false)) {
                return arg4.method1056(false) ? 0 : 1;
            } else if (arg4.method1056(false)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg1 == 5) {
            if (arg3.method1054(18601)) {
                return arg4.method1054(arg2 ^ 0xFFFFD4A6) ? 0 : 1;
            } else if (arg4.method1054(18601)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg1 == 6) {
            if (arg3.method1051(-26072)) {
                return arg4.method1051(-26072) ? 0 : 1;
            } else if (arg4.method1051(arg2 - 487)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg1 != 7) {
            if (arg2 != -25585) {
                field2254 = null;
            }
            return arg3.field4444 - arg4.field4444;
        } else if (arg3.method1049(119)) {
            return arg4.method1049(119) ? 0 : 1;
        } else if (arg4.method1049(119)) {
            return -1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIILbg;JLbg;Lbg;)V")
    public static final void method1043(int arg0, int arg1, int arg2, int arg3, class264 arg4, long arg5, class264 arg6, class264 arg7) {
        class101 var9 = new class101();
        var9.field1467 = arg4;
        var9.field1469 = arg1 * 128 + 64;
        var9.field1475 = arg2 * 128 + 64;
        var9.field1473 = arg3;
        var9.field1478 = arg5;
        var9.field1476 = arg6;
        var9.field1480 = arg7;
        int var10 = 0;
        class201 var11 = class3.field40[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field3026; var12++) {
                class128 var13 = var11.field3037[var12];
                if ((var13.field1880 & 0x400000L) == 4194304L) {
                    int var14 = var13.field1874.method19();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field1472 = -var10;
        if (class3.field40[arg0][arg1][arg2] == null) {
            class3.field40[arg0][arg1][arg2] = new class201(arg0, arg1, arg2);
        }
        class3.field40[arg0][arg1][arg2].field3035 = var9;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)V")
    public static final void method1044(byte arg0) {
        field2257++;
        if (arg0 == -116) {
            class128.field1893++;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Z)V")
    public static final void method1045(boolean arg0) {
        field2258++;
        int var1 = class229.field3561;
        int var2 = class19.field333;
        int var3 = class67.field1116;
        if (!arg0) {
            method1043(-25, -56, -2, -87, (class264) null, 65L, (class264) null, (class264) null);
        }
        int var4 = class106.field1561;
        int var5 = 6116423;
        class72.method576(var1, var3, var2, var4, var5);
        class72.method576(var1 + 1, var3 + 1, var2 - 2, 16, 0);
        class72.method564(var1 + 1, var3 - -18, var2 - 2, var4 + -19, 0);
        class105.field1555.method1291(class194.field2938, var1 + 3, var3 + 14, var5, -1);
        int var6 = class105.field1542;
        int var7 = class12.field172;
        for (int var8 = 0; var8 < class51.field826; var8++) {
            int var9 = 16777215;
            int var10 = (class51.field826 - var8 - 1) * 15 + var3 + 31;
            if (var7 > var1 && (var1 + var2) > var7 && var6 > (var10 - 13) && var6 < var10 + 3) {
                var9 = 16776960;
            }
            class105.field1555.method1291(class170.method1143(-24448, var8), var1 + 3, var10, var9, 0);
        }
        class10.method74(class67.field1116, class229.field3561, false, class106.field1561, class19.field333);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V")
    public static void method1046(int arg0) {
        field2253 = null;
        field2256 = null;
        field2254 = null;
        if (arg0 <= 26) {
            method1046(-109);
        }
        field2252 = null;
        field2251 = null;
    }
}
