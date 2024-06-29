import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class173 {

    @OriginalMember(owner = "client!k", name = "m", descriptor = "[I")
    private int[] field2894;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "Z")
    public static boolean field2883 = false;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "Lub;")
    public static class227 field2882 = class257.method1749("<col=40ff00>", 17263);

    @OriginalMember(owner = "client!k", name = "j", descriptor = "Lub;")
    private static class227 field2891 = class257.method1749("Connection lost)3", 17263);

    @OriginalMember(owner = "client!k", name = "g", descriptor = "Lub;")
    public static class227 field2888 = field2891;

    @OriginalMember(owner = "client!k", name = "o", descriptor = "I")
    public static int field2896 = 0;

    @OriginalMember(owner = "client!k", name = "l", descriptor = "Lub;")
    public static class227 field2893 = class257.method1749("3D)2Softwarebibliothek gestartet)3", 17263);

    @OriginalMember(owner = "client!k", name = "r", descriptor = "I")
    public static int field2899 = 0;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "I")
    public static int field2884;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "I")
    public static int field2885;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "I")
    public static int field2886;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "I")
    public static int field2887;

    @OriginalMember(owner = "client!k", name = "i", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!k", name = "k", descriptor = "I")
    public static int field2892;

    @OriginalMember(owner = "client!k", name = "n", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!k", name = "p", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!k", name = "s", descriptor = "I")
    public static int field2900;

    @OriginalMember(owner = "client!k", name = "q", descriptor = "Ln;")
    public static class138 field2898;

    @OriginalMember(owner = "client!k", name = "h", descriptor = "Lch;")
    public static class199 field2889;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IBIII)V")
    private static final void method1104(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 != -96) {
            field2896 = 82;
        }
        field2892++;
        if (arg2 >= class161.field2718 && arg2 <= class46.field817) {
            int var5 = class23.method111(arg0, class125.field2234, class19.field331, arg1 ^ 0xFFFFFFA0);
            int var6 = class23.method111(arg3, class125.field2234, class19.field331, 0);
            class22.method108((byte) -44, arg4, arg2, var5, var6);
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ILn;II)Lnf;")
    public static final class213 method1105(int arg0, class138 arg1, int arg2, int arg3) {
        field2887++;
        if (arg2 == 1373) {
            return class123.method760(arg1, arg0, arg3, 64) ? class252.method1686((byte) -77) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lff;IIIIIIIZ)V")
    public static final void method1106(class237 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class130.field2282;
        int var11;
        int var12 = var11 = (arg7 << 7) - class203.field3471;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class98.field1717[arg1][arg6][arg7] - field2885;
        int var18 = class98.field1717[arg1][arg6 + 1][arg7] - field2885;
        int var19 = class98.field1717[arg1][arg6 + 1][arg7 + 1] - field2885;
        int var20 = class98.field1717[arg1][arg6][arg7 + 1] - field2885;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 < 50) {
            return;
        }
        int var27 = arg4 * var11 + arg5 * var14 >> 16;
        int var28 = arg5 * var11 - arg4 * var14 >> 16;
        int var30 = arg3 * var18 - arg2 * var28 >> 16;
        int var31 = arg2 * var18 + arg3 * var28 >> 16;
        if (var31 < 50) {
            return;
        }
        int var33 = arg4 * var16 + arg5 * var13 >> 16;
        int var34 = arg5 * var16 - arg4 * var13 >> 16;
        int var36 = arg3 * var19 - arg2 * var34 >> 16;
        int var37 = arg2 * var19 + arg3 * var34 >> 16;
        if (var37 < 50) {
            return;
        }
        int var39 = arg4 * var15 + arg5 * var9 >> 16;
        int var40 = arg5 * var15 - arg4 * var9 >> 16;
        int var42 = arg3 * var20 - arg2 * var40 >> 16;
        int var43 = arg2 * var20 + arg3 * var40 >> 16;
        if (var43 < 50) {
            return;
        }
        int var45 = (var21 << 9) / var25 + class62.field1137;
        int var46 = (var24 << 9) / var25 + class62.field1132;
        int var47 = (var27 << 9) / var31 + class62.field1137;
        int var48 = (var30 << 9) / var31 + class62.field1132;
        int var49 = (var33 << 9) / var37 + class62.field1137;
        int var50 = (var36 << 9) / var37 + class62.field1132;
        int var51 = (var39 << 9) / var43 + class62.field1137;
        int var52 = (var42 << 9) / var43 + class62.field1132;
        class62.field1145 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class215.field3630 && class238.method1589(class62.field1137 + class171.field2867, class62.field1132 + class201.field3458, var50, var52, var48, var49, var51, var47)) {
                class8.field160 = arg6;
                class261.field4540 = arg7;
            }
            if (!arg8) {
                class62.field1133 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class62.field1131 || var51 > class62.field1131 || var47 > class62.field1131) {
                    class62.field1133 = true;
                }
                if (arg0.field4112 == -1) {
                    if (arg0.field4113 != 12345678) {
                        class62.method392(var50, var52, var48, var49, var51, var47, arg0.field4113, arg0.field4117, arg0.field4105);
                    }
                } else if (!class128.field2262) {
                    int var53 = class62.field1129.method50((byte) -76, arg0.field4112);
                    class62.method392(var50, var52, var48, var49, var51, var47, class252.method1684(var53, arg0.field4113), class252.method1684(var53, arg0.field4117), class252.method1684(var53, arg0.field4105));
                } else if (arg0.field4103) {
                    class62.method393(var50, var52, var48, var49, var51, var47, arg0.field4113, arg0.field4117, arg0.field4105, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field4112);
                } else {
                    class62.method393(var50, var52, var48, var49, var51, var47, arg0.field4113, arg0.field4117, arg0.field4105, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field4112);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class215.field3630 && class238.method1589(class62.field1137 + class171.field2867, class62.field1132 + class201.field3458, var46, var48, var52, var45, var47, var51)) {
            class8.field160 = arg6;
            class261.field4540 = arg7;
        }
        if (arg8) {
            return;
        }
        class62.field1133 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class62.field1131 || var47 > class62.field1131 || var51 > class62.field1131) {
            class62.field1133 = true;
        }
        if (arg0.field4112 != -1) {
            if (class128.field2262) {
                class62.method393(var46, var48, var52, var45, var47, var51, arg0.field4106, arg0.field4105, arg0.field4117, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field4112);
                return;
            }
            int var54 = class62.field1129.method50((byte) -79, arg0.field4112);
            class62.method392(var46, var48, var52, var45, var47, var51, class252.method1684(var54, arg0.field4106), class252.method1684(var54, arg0.field4105), class252.method1684(var54, arg0.field4117));
        } else if (arg0.field4106 != 12345678) {
            class62.method392(var46, var48, var52, var45, var47, var51, arg0.field4106, arg0.field4105, arg0.field4117);
            return;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIIII)V")
    public static final void method1107(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg4 - arg1;
        field2884++;
        int var7 = arg5 - arg3;
        if (var6 == 0) {
            if (var7 != 0) {
                class249.method1669(124, arg1, arg5, arg3, arg2);
            }
        } else if (var7 == 0) {
            method1104(arg1, (byte) -96, arg3, arg4, arg2);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg3 - (arg1 * var8 >> 12);
            int var10;
            int var11;
            if (arg1 < class125.field2234) {
                var11 = class125.field2234;
                var10 = var9 + (class125.field2234 * var8 >> 12);
            } else if (class19.field331 < arg1) {
                var10 = (class19.field331 * var8 >> 12) + var9;
                var11 = class19.field331;
            } else {
                var11 = arg1;
                var10 = arg3;
            }
            int var12;
            int var13;
            if (class125.field2234 > arg4) {
                var12 = class125.field2234;
                var13 = (class125.field2234 * var8 >> 12) + var9;
            } else if (class19.field331 < arg4) {
                var12 = class19.field331;
                var13 = var9 + (class19.field331 * var8 >> 12);
            } else {
                var12 = arg4;
                var13 = arg5;
            }
            if (var13 < class161.field2718) {
                var13 = class161.field2718;
                var12 = (class161.field2718 - var9 << 12) / var8;
            } else if (class46.field817 < var13) {
                var12 = (class46.field817 - var9 << 12) / var8;
                var13 = class46.field817;
            }
            if (arg0 <= -45) {
                if (var10 < class161.field2718) {
                    var11 = (class161.field2718 - var9 << 12) / var8;
                    var10 = class161.field2718;
                } else if (var10 > class46.field817) {
                    var11 = (class46.field817 - var9 << 12) / var8;
                    var10 = class46.field817;
                }
                class221.method1399(arg2, (byte) 112, var11, var13, var10, var12);
            }
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(BI)I")
    public final int method1108(byte arg0, int arg1) {
        field2890++;
        int var3 = (this.field2894.length >> 1) - 1;
        int var4 = arg1 & var3;
        if (arg0 < 27) {
            return -72;
        }
        while (true) {
            int var5 = this.field2894[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field2894[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIII)V")
    public static final void method1109(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 > -119) {
            method1110((byte) -69);
        }
        field2897++;
        class105 var4 = class255.method1738(arg0, (byte) -63, arg3);
        if (var4 != null && var4.field1939 != null) {
            class34 var5 = new class34();
            var5.field583 = var4;
            var5.field568 = var4.field1939;
            class218.method1377(var5, false);
        }
        class57.field1050 = true;
        class143.field2452 = arg0;
        class177.field2983 = arg2;
        class147.field2558 = arg3;
        class198.method1268(113, var4);
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "([I)V")
    public class173(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field2894 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field2894[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field2894[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 - -1) {
            }
            this.field2894[var5 + var5] = arg0[var4];
            this.field2894[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(B)V")
    public static void method1110(byte arg0) {
        field2882 = null;
        field2889 = null;
        field2888 = null;
        int var1 = -74 / ((arg0 - 74) / 32);
        field2891 = null;
        field2893 = null;
        field2898 = null;
    }
}
