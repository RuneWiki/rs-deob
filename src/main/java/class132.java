import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class132 extends class89 {

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
    public static int field1937 = 0;

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "[I")
    public static int[] field1938 = new int[5];

    @OriginalMember(owner = "client!lb", name = "q", descriptor = "Ljava/lang/String;")
    public static String field1941 = null;

    @OriginalMember(owner = "client!lb", name = "s", descriptor = "Ljava/lang/String;")
    public static String field1943 = "Starting 3d Library";

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "I")
    public static int field1939;

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "I")
    public static int field1940;

    @OriginalMember(owner = "client!lb", name = "r", descriptor = "I")
    public static int field1942;

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "Lsb;")
    public static class230 field1936;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIIZIZZ)V")
    public static final void method814(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, boolean arg6, boolean arg7) {
        field1939++;
        if (!arg6 && field1940 == arg1 && class177.field2721 == arg3 && class79.field1273 == arg0 || class266.method1772(113)) {
            return;
        }
        field1940 = arg1;
        class79.field1273 = arg0;
        class177.field2721 = arg3;
        if (class266.method1772(-121)) {
            class79.field1273 = 0;
        }
        if (arg4) {
            class203.method1292(28, false);
        } else {
            class203.method1292(25, false);
        }
        class101.method652(class126.field1904, -17265, true);
        int var8 = class147.field2141;
        int var9 = class81.field1303;
        class81.field1303 = (arg1 - 6) * 8;
        class147.field2141 = arg3 * 8 - 48;
        class64.field1011 = class297.method1989(-78, field1940 * 8, class177.field2721 * 8);
        int var10 = class81.field1303 - var9;
        class39.field525 = null;
        int var11 = class147.field2141 - var8;
        int var12 = class147.field2141;
        int var13 = class81.field1303;
        if (arg4) {
            class24.field295 = 0;
            for (int var17 = 0; var17 < 32768; var17++) {
                class61 var33 = class18.field220[var17];
                if (var33 != null) {
                    var33.field2234 -= var11 * 128;
                    var33.field2251 -= var10 * 128;
                    if (var33.field2251 >= 0 && var33.field2251 <= 13184 && var33.field2234 >= 0 && var33.field2234 <= 13184) {
                        for (int var34 = 0; var34 < 10; var34++) {
                            var33.field2297[var34] -= var10;
                            var33.field2275[var34] -= var11;
                        }
                        class169.field2586[class24.field295++] = var17;
                    } else {
                        class18.field220[var17].method405((class72) null, (byte) 20);
                        class18.field220[var17] = null;
                    }
                }
            }
        } else {
            for (int var14 = 0; var14 < 32768; var14++) {
                class61 var15 = class18.field220[var14];
                if (var15 != null) {
                    for (int var16 = 0; var16 < 10; var16++) {
                        var15.field2297[var16] -= var10;
                        var15.field2275[var16] -= var11;
                    }
                    var15.field2234 -= var11 * 128;
                    var15.field2251 -= var10 * 128;
                }
            }
        }
        for (int var18 = 0; var18 < 2048; var18++) {
            class107 var31 = class96.field1521[var18];
            if (var31 != null) {
                for (int var32 = 0; var32 < 10; var32++) {
                    var31.field2297[var32] -= var10;
                    var31.field2275[var32] -= var11;
                }
                var31.field2234 -= var11 * 128;
                var31.field2251 -= var10 * 128;
            }
        }
        class99.field1557 = arg0;
        class165.field2537.method677(-63, arg7, arg2, arg5);
        byte var19 = 0;
        byte var20 = 1;
        byte var21 = 0;
        byte var22 = 104;
        if (var10 < 0) {
            var22 = -1;
            var21 = 103;
            var20 = -1;
        }
        byte var23 = 1;
        byte var24 = 104;
        if (var11 < 0) {
            var24 = -1;
            var23 = -1;
            var19 = 103;
        }
        for (int var25 = var21; var25 != var22; var25 += var20) {
            for (int var27 = var19; var27 != var24; var27 += var23) {
                int var28 = var10 + var25;
                int var29 = var27 + var11;
                for (int var30 = 0; var30 < 4; var30++) {
                    if (var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104) {
                        class251.field3816[var30][var25][var27] = class251.field3816[var30][var28][var29];
                    } else {
                        class251.field3816[var30][var25][var27] = null;
                    }
                }
            }
        }
        for (class192 var26 = (class192) class228.field3432.method983(7); var26 != null; var26 = (class192) class228.field3432.method985((byte) -40)) {
            var26.field2944 -= var11;
            var26.field2948 -= var10;
            if (var26.field2948 < 0 || var26.field2944 < 0 || var26.field2948 >= 104 || var26.field2944 >= 104) {
                var26.method538(95);
            }
        }
        if (class56.field892 != 0) {
            class56.field892 -= var10;
            class225.field3364 -= var11;
        }
        class176.field2693 = -1;
        class161.field2473 = 0;
        if (arg4) {
            class187.field2836 -= var10;
            class40.field595 -= var11;
            class47.field763 -= var11 * 128;
            class57.field908 -= var11;
            class85.field1360 -= var10;
            class128.field1922 -= var10 * 128;
        } else {
            class253.field3837 = 1;
        }
        class239.field3595.method986(-29720);
        class90.field1429.method986(-29720);
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(B)V")
    public static void method815(byte arg0) {
        field1938 = null;
        field1941 = null;
        field1943 = null;
        if (arg0 <= 106) {
            method814(76, 68, -54, 54, false, 2, true, true);
        }
        field1936 = null;
    }
}
