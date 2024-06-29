import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class74 {

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "Lbo;")
    private class511 field1111;

    @OriginalMember(owner = "client!bm", name = "g", descriptor = "I")
    public int field1117;

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "Z")
    public static boolean field1112 = false;

    @OriginalMember(owner = "client!bm", name = "i", descriptor = "Lcr;")
    public static class403 field1119 = null;

    @OriginalMember(owner = "client!bm", name = "k", descriptor = "I")
    public static int field1121;

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!bm", name = "h", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!bm", name = "j", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "[[B")
    public static byte[][] field1115;

    @OriginalMember(owner = "client!bm", name = "f", descriptor = "[[I")
    public static int[][] field1116;

    static {
        new class304("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
        field1121 = 0;
    }

    @OriginalMember(owner = "client!bm", name = "finalize", descriptor = "()V", line = 6)
    protected final void finalize() throws Throwable {
        this.field1111.method3007(this.field1117, 8960);
        field1114++;
        super.finalize();
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lqa;Ldq;I)I", line = 16)
    public static final int method477(class162 arg0, class490 arg1, int arg2) {
        field1120++;
        if (arg2 != 6) {
            field1115 = null;
        }
        if (arg1.field6819 != -1) {
            return arg1.field6819;
        }
        if (arg1.field6810 != -1) {
            class278 var3 = arg0.field2375.method677(arg2 ^ 0x99D, arg0.method627() ? arg1.field6810 : arg1.field6831);
            if (!var3.field3638) {
                return var3.field3647;
            }
        }
        return arg1.field6820;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)V", line = 41)
    public static void method478(int arg0) {
        field1119 = null;
        field1115 = null;
        field1116 = null;
        if (arg0 > -20) {
            field1115 = null;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lcr;III)V", line = 60)
    public static final void method479(class403 arg0, int arg1, int arg2, int arg3) {
        field1118++;
        if (~arg0.field5469 == arg2) {
            arg0.field5537 = arg0.field5475;
        } else if (arg0.field5469 == 1) {
            arg0.field5537 = (arg1 - arg0.field5404) / 2 + arg0.field5475;
        } else if (arg0.field5469 == 2) {
            arg0.field5537 = arg1 - arg0.field5404 - arg0.field5475;
        } else if (arg0.field5469 == 3) {
            arg0.field5537 = arg0.field5475 * arg1 >> 14;
        } else if (arg0.field5469 == 4) {
            arg0.field5537 = (arg1 - arg0.field5404) / 2 + (arg0.field5475 * arg1 >> 14);
        } else {
            arg0.field5537 = arg1 - (arg0.field5475 * arg1 >> 14) - arg0.field5404;
        }
        if (arg0.field5521 == 0) {
            arg0.field5438 = arg0.field5470;
        } else if (arg0.field5521 == 1) {
            arg0.field5438 = (arg3 - arg0.field5450) / 2 + arg0.field5470;
        } else if (arg0.field5521 == 2) {
            arg0.field5438 = arg3 - arg0.field5450 - arg0.field5470;
        } else if (arg0.field5521 == 3) {
            arg0.field5438 = arg0.field5470 * arg3 >> 14;
        } else if (arg0.field5521 == 4) {
            arg0.field5438 = (arg0.field5470 * arg3 >> 14) + (arg3 - arg0.field5450) / 2;
        } else {
            arg0.field5438 = arg3 - arg0.field5450 - (arg0.field5470 * arg3 >> 14);
        }
        if (!class299.field3964) {
            return;
        }
        if (client.method1255(arg0).field4714 == 0 && arg0.field5480 != 0) {
            return;
        }
        if (arg0.field5537 < 0) {
            arg0.field5537 = 0;
        } else if (arg1 < (arg0.field5537 + arg0.field5404)) {
            arg0.field5537 = arg1 - arg0.field5404;
        }
        if (arg0.field5438 < 0) {
            arg0.field5438 = 0;
            return;
        }
        if (arg3 < arg0.field5450 + arg0.field5438) {
            arg0.field5438 = arg3 - arg0.field5450;
            return;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lcl;IIIIIIIIIB)Z", line = 130)
    public static final boolean method480(class173 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, byte arg10) {
        field1113++;
        if (arg10 > -15) {
            field1115 = null;
        }
        int var11 = arg4;
        int var12 = arg6;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg4 - var13;
        int var16 = arg6 - var14;
        class430.field5885[var13][var14] = 99;
        class494.field6867[var13][var14] = 0;
        byte var17 = 0;
        int var18 = 0;
        class153.field2210[var17] = arg4;
        int var26 = var17 + 1;
        class71.field1066[var17] = arg6;
        int[][] var19 = arg0.field2519;
        while (var26 != var18) {
            var11 = class153.field2210[var18];
            var12 = class71.field1066[var18];
            int var20 = var12 - arg0.field2522;
            int var21 = var11 - var15;
            var18 = var18 + 1 & 0xFFF;
            int var22 = var12 - var16;
            int var23 = var11 - arg0.field2512;
            if (arg2 == -4) {
                if (arg7 == var11 && arg1 == var12) {
                    class296.field3878 = var11;
                    class212.field2888 = var12;
                    return true;
                }
            } else if (arg2 == -3) {
                if (class201.method1289(1, arg8, true, arg9, arg7, arg1, 1, var11, var12)) {
                    class296.field3878 = var11;
                    class212.field2888 = var12;
                    return true;
                }
            } else if (arg2 == -2) {
                if (arg0.method1151(1, arg7, arg9, arg8, arg3, var11, var12, arg1, -65537, 1)) {
                    class212.field2888 = var12;
                    class296.field3878 = var11;
                    return true;
                }
            } else if (arg2 == -1) {
                if (arg0.method1152(-77, var11, arg9, arg3, var12, 1, arg7, arg8, arg1)) {
                    class212.field2888 = var12;
                    class296.field3878 = var11;
                    return true;
                }
            } else if (arg2 == 0 || arg2 == 1 || arg2 == 2 || arg2 == 3 || arg2 == 9) {
                if (arg0.method1154(arg7, var11, arg1, arg2, (byte) 122, var12, 1, arg5)) {
                    class212.field2888 = var12;
                    class296.field3878 = var11;
                    return true;
                }
            } else if (arg0.method1150(var11, arg1, var12, arg2, 1, arg7, -24128, arg5)) {
                class212.field2888 = var12;
                class296.field3878 = var11;
                return true;
            }
            int var25 = class494.field6867[var21][var22] + 1;
            if (var21 > 0 && class430.field5885[var21 - 1][var22] == 0 && (var19[var23 - 1][var20] & 0x42240000) == 0) {
                class153.field2210[var26] = var11 - 1;
                class71.field1066[var26] = var12;
                class430.field5885[var21 - 1][var22] = 2;
                var26 = var26 + 1 & 0xFFF;
                class494.field6867[var21 - 1][var22] = var25;
            }
            if (var21 < 127 && class430.field5885[var21 + 1][var22] == 0 && (var19[var23 + 1][var20] & 0x60240000) == 0) {
                class153.field2210[var26] = var11 + 1;
                class71.field1066[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class430.field5885[var21 + 1][var22] = 8;
                class494.field6867[var21 + 1][var22] = var25;
            }
            if (var22 > 0 && class430.field5885[var21][var22 - 1] == 0 && (var19[var23][var20 - 1] & 0x40A40000) == 0) {
                class153.field2210[var26] = var11;
                class71.field1066[var26] = var12 - 1;
                class430.field5885[var21][var22 - 1] = 1;
                var26 = var26 + 1 & 0xFFF;
                class494.field6867[var21][var22 - 1] = var25;
            }
            if (var22 < 127 && class430.field5885[var21][var22 + 1] == 0 && (var19[var23][var20 + 1] & 0x48240000) == 0) {
                class153.field2210[var26] = var11;
                class71.field1066[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class430.field5885[var21][var22 + 1] = 4;
                class494.field6867[var21][var22 + 1] = var25;
            }
            if (var21 > 0 && var22 > 0 && class430.field5885[var21 - 1][var22 - 1] == 0 && (var19[var23 - 1][var20 - 1] & 0x43A40000) == 0 && (var19[var23 - 1][var20] & 0x42240000) == 0 && (var19[var23][var20 - 1] & 0x40A40000) == 0) {
                class153.field2210[var26] = var11 - 1;
                class71.field1066[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class430.field5885[var21 - 1][var22 - 1] = 3;
                class494.field6867[var21 - 1][var22 - 1] = var25;
            }
            if (var21 < 127 && var22 > 0 && class430.field5885[var21 + 1][var22 - 1] == 0 && (var19[var23 + 1][var20 - 1] & 0x60E40000) == 0 && (var19[var23 + 1][var20] & 0x60240000) == 0 && (var19[var23][var20 - 1] & 0x40A40000) == 0) {
                class153.field2210[var26] = var11 + 1;
                class71.field1066[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class430.field5885[var21 + 1][var22 - 1] = 9;
                class494.field6867[var21 + 1][var22 - 1] = var25;
            }
            if (var21 > 0 && var22 < 127 && class430.field5885[var21 - 1][var22 + 1] == 0 && (var19[var23 - 1][var20 + 1] & 0x4E240000) == 0 && (var19[var23 - 1][var20] & 0x42240000) == 0 && (var19[var23][var20 + 1] & 0x48240000) == 0) {
                class153.field2210[var26] = var11 - 1;
                class71.field1066[var26] = var12 + 1;
                class430.field5885[var21 - 1][var22 + 1] = 6;
                var26 = var26 + 1 & 0xFFF;
                class494.field6867[var21 - 1][var22 + 1] = var25;
            }
            if (var21 < 127 && var22 < 127 && class430.field5885[var21 + 1][var22 + 1] == 0 && (var19[var23 + 1][var20 + 1] & 0x78240000) == 0 && (var19[var23 + 1][var20] & 0x60240000) == 0 && (var19[var23][var20 + 1] & 0x48240000) == 0) {
                class153.field2210[var26] = var11 + 1;
                class71.field1066[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class430.field5885[var21 + 1][var22 + 1] = 12;
                class494.field6867[var21 + 1][var22 + 1] = var25;
            }
        }
        class212.field2888 = var12;
        class296.field3878 = var11;
        return false;
    }

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(Lbo;II)V", line = 382)
    public class74(class511 arg0, int arg1, int arg2) {
        this.field1111 = arg0;
        this.field1117 = arg2;
    }
}
