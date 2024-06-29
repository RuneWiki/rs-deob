import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class49 extends class54 {

    @OriginalMember(owner = "client!ee", name = "x", descriptor = "Ldc;")
    public static class37 field971 = class185.method1233((byte) 86, "<img=1>");

    @OriginalMember(owner = "client!ee", name = "u", descriptor = "Ldc;")
    public static class37 field968 = class185.method1233((byte) 86, "<col=ffff00>");

    @OriginalMember(owner = "client!ee", name = "I", descriptor = "I")
    public static int field981 = 0;

    @OriginalMember(owner = "client!ee", name = "V", descriptor = "Ldc;")
    public static class37 field994 = class185.method1233((byte) 86, "<)4col>");

    @OriginalMember(owner = "client!ee", name = "w", descriptor = "Lvf;")
    public static class233 field970 = new class233(5000);

    @OriginalMember(owner = "client!ee", name = "o", descriptor = "I")
    public int field962;

    @OriginalMember(owner = "client!ee", name = "p", descriptor = "I")
    public static int field963;

    @OriginalMember(owner = "client!ee", name = "r", descriptor = "I")
    public int field965;

    @OriginalMember(owner = "client!ee", name = "t", descriptor = "I")
    public int field967;

    @OriginalMember(owner = "client!ee", name = "y", descriptor = "I")
    public int field972;

    @OriginalMember(owner = "client!ee", name = "z", descriptor = "I")
    public int field973;

    @OriginalMember(owner = "client!ee", name = "B", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!ee", name = "C", descriptor = "I")
    public int field975;

    @OriginalMember(owner = "client!ee", name = "D", descriptor = "I")
    public int field976;

    @OriginalMember(owner = "client!ee", name = "F", descriptor = "I")
    public int field978;

    @OriginalMember(owner = "client!ee", name = "H", descriptor = "I")
    public int field980;

    @OriginalMember(owner = "client!ee", name = "J", descriptor = "I")
    public int field982;

    @OriginalMember(owner = "client!ee", name = "K", descriptor = "I")
    public int field983;

    @OriginalMember(owner = "client!ee", name = "M", descriptor = "I")
    public int field985;

    @OriginalMember(owner = "client!ee", name = "N", descriptor = "I")
    public int field986;

    @OriginalMember(owner = "client!ee", name = "O", descriptor = "I")
    public static int field987;

    @OriginalMember(owner = "client!ee", name = "P", descriptor = "I")
    public int field988;

    @OriginalMember(owner = "client!ee", name = "Q", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "client!ee", name = "R", descriptor = "I")
    public int field990;

    @OriginalMember(owner = "client!ee", name = "S", descriptor = "I")
    public int field991;

    @OriginalMember(owner = "client!ee", name = "U", descriptor = "I")
    public int field993;

    @OriginalMember(owner = "client!ee", name = "E", descriptor = "Ljj;")
    public class107 field977;

    @OriginalMember(owner = "client!ee", name = "s", descriptor = "Lkc;")
    public class111 field966;

    @OriginalMember(owner = "client!ee", name = "G", descriptor = "Lne;")
    public class146 field979;

    @OriginalMember(owner = "client!ee", name = "L", descriptor = "Lqh;")
    public static class182 field984;

    @OriginalMember(owner = "client!ee", name = "T", descriptor = "Lbg;")
    public class19 field992;

    @OriginalMember(owner = "client!ee", name = "v", descriptor = "Lub;")
    public static class219 field969;

    @OriginalMember(owner = "client!ee", name = "q", descriptor = "Lgb;")
    public static class68 field964;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(I)V")
    public static void method421(int arg0) {
        field984 = null;
        field994 = null;
        field964 = null;
        if (arg0 != -1) {
            field970 = null;
        }
        field968 = null;
        field971 = null;
        field969 = null;
        field970 = null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lw;IIIIIIIZ)V")
    public static final void method422(class237 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class39.field818;
        int var11;
        int var12 = var11 = (arg7 << 7) - class151.field2861;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class39.field808[arg1][arg6][arg7] - class133.field2466;
        int var18 = class39.field808[arg1][arg6 + 1][arg7] - class133.field2466;
        int var19 = class39.field808[arg1][arg6 + 1][arg7 + 1] - class133.field2466;
        int var20 = class39.field808[arg1][arg6][arg7 + 1] - class133.field2466;
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
        int var45 = (var21 << 9) / var25 + class169.field3208;
        int var46 = (var24 << 9) / var25 + class169.field3217;
        int var47 = (var27 << 9) / var31 + class169.field3208;
        int var48 = (var30 << 9) / var31 + class169.field3217;
        int var49 = (var33 << 9) / var37 + class169.field3208;
        int var50 = (var36 << 9) / var37 + class169.field3217;
        int var51 = (var39 << 9) / var43 + class169.field3208;
        int var52 = (var42 << 9) / var43 + class169.field3217;
        class169.field3215 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class97.field1696 && class12.method81(class76.field1346 + class169.field3208, class73.field1303 + class169.field3217, var50, var52, var48, var49, var51, var47)) {
                class110.field1920 = arg6;
                class112.field1969 = arg7;
            }
            if (!arg8) {
                class169.field3223 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class169.field3209 || var51 > class169.field3209 || var47 > class169.field3209) {
                    class169.field3223 = true;
                }
                if (arg0.field4321 == -1) {
                    if (arg0.field4313 != 12345678) {
                        class169.method1143(var50, var52, var48, var49, var51, var47, arg0.field4313, arg0.field4323, arg0.field4314);
                    }
                } else if (class180.field3358) {
                    int var53 = class169.field3224.method270(arg0.field4321, (byte) 50);
                    class169.method1143(var50, var52, var48, var49, var51, var47, class167.method1122(var53, arg0.field4313), class167.method1122(var53, arg0.field4323), class167.method1122(var53, arg0.field4314));
                } else if (arg0.field4320) {
                    class169.method1137(var50, var52, var48, var49, var51, var47, arg0.field4313, arg0.field4323, arg0.field4314, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field4321);
                } else {
                    class169.method1137(var50, var52, var48, var49, var51, var47, arg0.field4313, arg0.field4323, arg0.field4314, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field4321);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class97.field1696 && class12.method81(class76.field1346 + class169.field3208, class73.field1303 + class169.field3217, var46, var48, var52, var45, var47, var51)) {
            class110.field1920 = arg6;
            class112.field1969 = arg7;
        }
        if (arg8) {
            return;
        }
        class169.field3223 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class169.field3209 || var47 > class169.field3209 || var51 > class169.field3209) {
            class169.field3223 = true;
        }
        if (arg0.field4321 != -1) {
            if (!class180.field3358) {
                class169.method1137(var46, var48, var52, var45, var47, var51, arg0.field4322, arg0.field4314, arg0.field4323, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field4321);
                return;
            }
            int var54 = class169.field3224.method270(arg0.field4321, (byte) 50);
            class169.method1143(var46, var48, var52, var45, var47, var51, class167.method1122(var54, arg0.field4322), class167.method1122(var54, arg0.field4314), class167.method1122(var54, arg0.field4323));
        } else if (arg0.field4322 != 12345678) {
            class169.method1143(var46, var48, var52, var45, var47, var51, arg0.field4322, arg0.field4314, arg0.field4323);
            return;
        }
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(B)V")
    public final void method423(byte arg0) {
        this.field966 = null;
        this.field992 = null;
        this.field979 = null;
        field987++;
        if (arg0 != -53) {
            this.field980 = -13;
        }
        this.field977 = null;
    }
}
