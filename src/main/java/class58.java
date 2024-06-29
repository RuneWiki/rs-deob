import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class58 {

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "Lsi;")
    public static class375 field888 = new class375(14, 1);

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "Lsi;")
    public static class375 field890 = new class375(15, 4);

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "Lsi;")
    public static class375 field892 = new class375(16, -2);

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "Lsi;")
    public static class375 field893 = new class375(17, 0);

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "Lsi;")
    public static class375 field894 = new class375(18, -2);

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "Lsi;")
    public static class375 field895 = new class375(20, 6);

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "Lsi;")
    public static class375 field896 = new class375(21, 8);

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "Lsi;")
    public static class375 field897 = new class375(22, -2);

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "Lsi;")
    public static class375 field898 = new class375(23, 4);

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "Lsi;")
    public static class375 field899 = new class375(24, -1);

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "[Lsi;")
    private static class375[] field900 = new class375[32];

    @OriginalMember(owner = "client!sd", name = "p", descriptor = "Liu;")
    public static class390 field901;

    @OriginalMember(owner = "client!sd", name = "r", descriptor = "[B")
    public static byte[] field903;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
    public static int field889;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!sd", name = "q", descriptor = "I")
    public static int field902;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BI)V")
    public static final void method423(byte arg0, int arg1) {
        field891++;
        class338 var2 = class380.method2294((byte) 62, arg1, 11);
        if (arg0 <= -70) {
            var2.method2048(125);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V")
    public static void method424(int arg0) {
        field895 = null;
        field899 = null;
        field900 = null;
        field890 = null;
        field893 = null;
        if (arg0 != -22314) {
            method424(-84);
        }
        field903 = null;
        field888 = null;
        field894 = null;
        field897 = null;
        field898 = null;
        field892 = null;
        field901 = null;
        field896 = null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILwd;Lqs;BILeq;)Z")
    public static final boolean method425(int arg0, class170 arg1, class410 arg2, byte arg3, int arg4, class134 arg5) {
        field889++;
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg1.field2253 != null) {
            var6 = class249.field3594 + ((arg2.field6009 + arg1.field2244 - class249.field3592) * (class249.field3589 - class249.field3594) / (class249.field3586 - class249.field3592));
            var9 = class249.field3598 - ((arg1.field2248 - (class249.field3595 - arg2.field6014)) * (class249.field3598 - class249.field3591) / (class249.field3602 - class249.field3595));
            var7 = class249.field3594 + ((arg1.field2261 + arg2.field6009 - class249.field3592) * (class249.field3589 - class249.field3594) / (class249.field3586 - class249.field3592));
            var8 = class249.field3598 - (arg1.field2235 + arg2.field6014 - class249.field3595) * (class249.field3598 - class249.field3591) / (class249.field3602 - class249.field3595);
        }
        class307 var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (arg1.field2258 != -1) {
            if (arg2.field6015 && arg1.field2270 != -1) {
                var10 = arg1.method1075(0, arg5, true);
            } else {
                var10 = arg1.method1075(0, arg5, false);
            }
            if (var10 != null) {
                var11 = arg2.field6011 - (var10.method87() + 1 >> 1);
                var12 = arg2.field6011 + (var10.method87() + 1 >> 1);
                if (var6 > var11) {
                    var6 = var11;
                }
                if (var7 < var12) {
                    var7 = var12;
                }
                var13 = arg2.field6012 - (var10.method94() + 1 >> 1);
                if (var13 < var8) {
                    var8 = var13;
                }
                var14 = arg2.field6012 + (var10.method94() + 1 >> 1);
                if (var9 < var14) {
                    var9 = var14;
                }
            }
        }
        class474 var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        if (arg3 != 12) {
            field895 = null;
        }
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        if (arg1.field2273 != null) {
            var15 = class205.method1266(arg1.field2266, arg3 ^ 0xFFFFFFF2);
            if (var15 != null) {
                var16 = class407.field5974.method3046(null, -5111, arg1.field2273, class161.field2098, null);
                int var23 = arg2.field6012;
                if (var10 == null) {
                    var17 = var23 - var16 * var15.method2775() / 2;
                } else {
                    var17 = var23 - ((var10.method94() >> 1) + (var16 * var15.method2774()));
                }
                for (int var24 = 0; var24 < var16; var24++) {
                    String var25 = class161.field2098[var24];
                    if (var24 < (var16 - 1)) {
                        var25 = var25.substring(0, var25.length() - 4);
                    }
                    int var26 = var15.method2772(var25);
                    if (var26 > var18) {
                        var18 = var26;
                    }
                }
                var19 = arg4 + arg2.field6011 - (var18 / 2);
                var20 = var18 / 2 + arg4 + arg2.field6011;
                if (var6 > var19) {
                    var6 = var19;
                }
                if (var7 < var20) {
                    var7 = var20;
                }
                var21 = arg0 + var17;
                var22 = arg0 + var16 * var15.method2774() + var17;
                if (var8 > var21) {
                    var8 = var21;
                }
                if (var9 < var22) {
                    var9 = var22;
                }
            }
        }
        if (class249.field3594 > var7 || class249.field3589 < var6 || var9 < class249.field3591 || class249.field3598 < var8) {
            return true;
        }
        if (arg1.field2253 != null) {
            int[] var27 = new int[arg1.field2253.length];
            for (int var28 = 0; var28 < var27.length / 2; var28++) {
                int var30 = arg1.field2253[var28 * 2] + arg2.field6009;
                int var31 = arg1.field2253[var28 * 2 + 1] + arg2.field6014;
                var27[var28 * 2] = (class249.field3589 - class249.field3594) * (var30 - class249.field3592) / (class249.field3586 - class249.field3592) + class249.field3594;
                var27[var28 * 2 + 1] = class249.field3598 - (class249.field3598 - class249.field3591) * (var31 - class249.field3595) / (class249.field3602 - class249.field3595);
            }
            class10.method81(arg5, var27, arg1.field2260);
            for (int var29 = 0; var29 < var27.length / 2 - 1; var29++) {
                arg5.method767(var27[var29 * 2 + 2], var27[var29 * 2 + 2 + 1], true, var27[var29 * 2], var27[var29 * 2 + 1], arg1.field2251);
            }
            arg5.method767(var27[0], var27[1], true, var27[var27.length - 2], var27[var27.length - 1], arg1.field2251);
        }
        if (var10 != null) {
            if (class440.field6432 > 0 && (class440.field6424 != -1 && class440.field6424 == arg2.field6017 || class33.field540 != -1 && class33.field540 == arg1.field2242)) {
                int var32;
                if (class135.field1729 <= 50) {
                    var32 = class135.field1729 * 2;
                } else {
                    var32 = 200 - class135.field1729 * 2;
                }
                int var33 = var32 << 24 | 0xFFFF00;
                arg5.method809(var33, arg2.field6012, (byte) 62, var10.method93() / 2 + 7, arg2.field6011);
                arg5.method809(var33, arg2.field6012, (byte) -86, var10.method93() / 2 + 5, arg2.field6011);
                arg5.method809(var33, arg2.field6012, (byte) -92, var10.method93() / 2 + 3, arg2.field6011);
                arg5.method809(var33, arg2.field6012, (byte) -90, var10.method93() / 2 + 1, arg2.field6011);
                arg5.method809(var33, arg2.field6012, (byte) 91, var10.method93() / 2, arg2.field6011);
            }
            var10.method1845(arg2.field6011 - (var10.method87() >> 1), arg2.field6012 - (var10.method94() >> 1));
        }
        if (arg1.field2273 != null && var15 != null) {
            class52.method389(var16, var18, var15, arg5, arg2, var17, arg1, -21010);
        }
        if (arg1.field2258 != -1 || arg1.field2273 != null) {
            class45 var34 = new class45(arg2);
            var34.field683 = var20;
            var34.field679 = var19;
            var34.field687 = var11;
            var34.field691 = var12;
            var34.field680 = var13;
            var34.field682 = var21;
            var34.field684 = var22;
            var34.field690 = var14;
            class56.field883.method2086((byte) -122, var34);
        }
        return false;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IILts;I)V")
    public static final void method426(int arg0, int arg1, class356 arg2, int arg3) {
        if (arg3 != -31086) {
            field892 = null;
        }
        if (class288.field4128) {
            class483 var4 = class450.field6554 == -1 ? null : class228.field3209.method1536((byte) -127, class450.field6554);
            if (client.method1188(arg2).method2937(arg3 ^ 0xFFFF8690) && (class278.field3963 & 0x20) != 0 && (var4 == null || arg2.method2165(class450.field6554, true, var4.field7000) != var4.field7000)) {
                class471.field6808++;
                class495.method2974(true, 0L, 57, class457.field6660, -1, arg2.field5184, arg2.field5174, class211.field2998 + " -> " + arg2.field5183, arg2.field5185, false, class272.field3802);
            }
        } else {
            for (int var5 = 9; var5 >= 5; var5--) {
                String var9 = class35.method288(var5, (byte) 75, arg2);
                if (var9 != null) {
                    class121.field1588++;
                    class495.method2974(true, (long) (var5 + 1), 1011, var9, -1, arg2.field5184, arg2.field5174, arg2.field5183, arg2.field5185, false, class397.method2378(arg2, var5, (byte) -127));
                }
            }
            String var6 = class191.method1203(arg2, (byte) 68);
            if (var6 != null) {
                class495.method2974(true, 0L, 18, var6, -1, arg2.field5184, arg2.field5174, arg2.field5183, arg2.field5185, false, arg2.field5264);
                class284.field4056++;
            }
            for (int var7 = 4; var7 >= 0; var7--) {
                String var8 = class35.method288(var7, (byte) 49, arg2);
                if (var8 != null) {
                    class121.field1588++;
                    class495.method2974(true, (long) (var7 + 1), 60, var8, -1, arg2.field5184, arg2.field5174, arg2.field5183, arg2.field5185, false, class397.method2378(arg2, var7, (byte) -99));
                }
            }
            if (client.method1188(arg2).method2944(false)) {
                class129.field1648++;
                if (arg2.field5164 == null) {
                    class495.method2974(true, 0L, 46, class126.field1620.method1220(2969, class81.field1122), arg3 ^ 0x796D, arg2.field5184, arg2.field5174, "", arg2.field5185, false, -1);
                } else {
                    class495.method2974(true, 0L, 46, arg2.field5164, arg3 ^ 0x796D, arg2.field5184, arg2.field5174, "", arg2.field5185, false, -1);
                }
            }
        }
        field886++;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)I")
    public static final int method427(byte arg0) {
        field887++;
        return arg0 < 123 ? 55 : 2;
    }

    static {
        class375[] var0 = class483.method2816(0);
        for (int var1 = 0; var1 < var0.length; var1++) {
            field900[var0[var1].field5608] = var0[var1];
        }
        field901 = new class390(51, 6);
        field903 = new byte[2048];
    }
}
