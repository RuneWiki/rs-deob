import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class137 {

    @OriginalMember(owner = "client!te", name = "f", descriptor = "I")
    public static int field3240 = -1;

    @OriginalMember(owner = "client!te", name = "h", descriptor = "Lsc;")
    public static class128 field3242 = class129.method1017(false, "leuchten1:");

    @OriginalMember(owner = "client!te", name = "g", descriptor = "I")
    public static int field3241 = 0;

    @OriginalMember(owner = "client!te", name = "i", descriptor = "Lsc;")
    public static class128 field3243 = class129.method1017(false, "Ihr Spielkonto wurde deaktiviert)3");

    @OriginalMember(owner = "client!te", name = "j", descriptor = "Lsc;")
    public static class128 field3244 = class129.method1017(false, ")1j");

    @OriginalMember(owner = "client!te", name = "c", descriptor = "Lsc;")
    private static class128 field3237 = class129.method1017(false, "Loading interfaces )2 ");

    @OriginalMember(owner = "client!te", name = "k", descriptor = "[J")
    public static long[] field3245 = new long[32];

    @OriginalMember(owner = "client!te", name = "e", descriptor = "Lsc;")
    public static class128 field3239 = field3237;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!te", name = "d", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!te", name = "l", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "client!te", name = "m", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "Lgf;")
    public static class48 field3235;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V")
    public static void method1120(int arg0) {
        if (arg0 != 32768) {
            return;
        }
        field3235 = null;
        field3239 = null;
        field3242 = null;
        field3243 = null;
        field3237 = null;
        field3244 = null;
        field3245 = null;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIILhd;)V")
    public static final void method1121(int arg0, int arg1, int arg2, class53 arg3) {
        field3236++;
        if (arg3.field981 == arg0 && arg0 != -1) {
            int var4 = class70.method527(12, arg0).field3159;
            if (var4 == 1) {
                arg3.field1015 = 0;
                arg3.field957 = 0;
                arg3.field970 = arg1;
                arg3.field973 = 0;
            }
            if (var4 == 2) {
                arg3.field1015 = 0;
            }
        } else if (arg0 == -1 || arg3.field981 == -1 || class70.method527(12, arg0).field3161 >= class70.method527(arg2 ^ 0xC, arg3.field981).field3161) {
            arg3.field981 = arg0;
            arg3.field970 = arg1;
            arg3.field957 = 0;
            arg3.field1004 = arg3.field947;
            arg3.field973 = 0;
            arg3.field1015 = 0;
        }
        if (arg2 != 0) {
            field3239 = null;
        }
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(I)V")
    public static final void method1122(int arg0) {
        class42.field782.method919((byte) -104);
        if (arg0 != 0) {
            field3235 = null;
        }
        class11.field189.method919((byte) -104);
        field3247++;
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(I)I")
    public static final int method1123(int arg0) {
        field3246++;
        if (arg0 >= -40) {
            field3240 = -29;
        }
        int var1 = 3;
        if (class156.field3589 < 310) {
            int var2 = class147.field3410 >> 7;
            int var3 = class1.field2 >> 7;
            int var4 = class151.field3473.field975 >> 7;
            if ((class110.field2485[class29.field553][var2][var3] & 0x4) != 0) {
                var1 = class29.field553;
            }
            int var5;
            if (var4 <= var2) {
                var5 = var2 - var4;
            } else {
                var5 = var4 - var2;
            }
            int var6 = class151.field3473.field987 >> 7;
            int var7;
            if (var3 < var6) {
                var7 = var6 - var3;
            } else {
                var7 = var3 - var6;
            }
            if (var7 < var5) {
                int var8 = var7 * 65536 / var5;
                int var9 = 32768;
                while (var2 != var4) {
                    if (var4 > var2) {
                        var2++;
                    } else if (var2 > var4) {
                        var2--;
                    }
                    if ((class110.field2485[class29.field553][var2][var3] & 0x4) != 0) {
                        var1 = class29.field553;
                    }
                    var9 += var8;
                    if (var9 >= 65536) {
                        if (var3 < var6) {
                            var3++;
                        } else if (var3 > var6) {
                            var3--;
                        }
                        if ((class110.field2485[class29.field553][var2][var3] & 0x4) != 0) {
                            var1 = class29.field553;
                        }
                        var9 -= 65536;
                    }
                }
            } else {
                int var10 = 32768;
                int var11 = var5 * 65536 / var7;
                while (var3 != var6) {
                    var10 += var11;
                    if (var3 < var6) {
                        var3++;
                    } else if (var3 > var6) {
                        var3--;
                    }
                    if ((class110.field2485[class29.field553][var2][var3] & 0x4) != 0) {
                        var1 = class29.field553;
                    }
                    if (var10 >= 65536) {
                        if (var4 > var2) {
                            var2++;
                        } else if (var4 < var2) {
                            var2--;
                        }
                        var10 -= 65536;
                        if ((class110.field2485[class29.field553][var2][var3] & 0x4) != 0) {
                            var1 = class29.field553;
                        }
                    }
                }
            }
        }
        if ((class110.field2485[class29.field553][class151.field3473.field975 >> 7][class151.field3473.field987 >> 7] & 0x4) != 0) {
            var1 = class29.field553;
        }
        return var1;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lsf;Lsf;Lsf;I)V")
    public static final void method1124(class131 arg0, class131 arg1, class131 arg2, int arg3) {
        if (arg3 == 1715051808) {
            field3238++;
            class23.field477 = arg2;
            class79.field1772 = arg1;
            class6.field84 = arg0;
        }
    }
}
