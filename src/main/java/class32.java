import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public abstract class class32 {

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "Lcc;")
    public static class209 field574 = class95.method669(103, "brillant2:");

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
    public static int field576 = 0;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "Lcc;")
    public static class209 field575 = class95.method669(91, "Votre liste d(Wamis est pleine (X100 noms maximum pour la version gratuite et 200 pour les abonn-Bs(Y)3");

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "Z")
    public static boolean field579 = true;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "Lcc;")
    public static class209 field578 = class95.method669(103, "Votre liste noire est pleine (X100 noms maximum(Y)3");

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "Lcc;")
    public static class209 field581 = class95.method669(110, ")2");

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "Lsj;")
    public static class49 field580;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "Z")
    public static boolean field577;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Li;IIIIIIIZ)V")
    public static final void method256(class56 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class272.field4824;
        int var11;
        int var12 = var11 = (arg7 << 7) - class87.field1732;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class271.field4803[arg1][arg6][arg7] - class215.field3878;
        int var18 = class271.field4803[arg1][arg6 + 1][arg7] - class215.field3878;
        int var19 = class271.field4803[arg1][arg6 + 1][arg7 + 1] - class215.field3878;
        int var20 = class271.field4803[arg1][arg6][arg7 + 1] - class215.field3878;
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
        int var45 = (var21 << 9) / var25 + class15.field281;
        int var46 = (var24 << 9) / var25 + class15.field284;
        int var47 = (var27 << 9) / var31 + class15.field281;
        int var48 = (var30 << 9) / var31 + class15.field284;
        int var49 = (var33 << 9) / var37 + class15.field281;
        int var50 = (var36 << 9) / var37 + class15.field284;
        int var51 = (var39 << 9) / var43 + class15.field281;
        int var52 = (var42 << 9) / var43 + class15.field284;
        class15.field285 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class224.field4080 && class161.method1110(class230.field4178 + class15.field281, class22.field422 + class15.field284, var50, var52, var48, var49, var51, var47)) {
                class235.field4230 = arg6;
                class206.field3682 = arg7;
            }
            if (!arg8) {
                class15.field272 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class15.field287 || var51 > class15.field287 || var47 > class15.field287) {
                    class15.field272 = true;
                }
                if (arg0.field1160 == -1) {
                    if (arg0.field1148 != 12345678) {
                        class15.method126(var50, var52, var48, var49, var51, var47, arg0.field1148, arg0.field1143, arg0.field1142);
                    }
                } else if (!class39.field662) {
                    int var53 = class15.field271.method1620(arg0.field1160, (byte) -69);
                    class15.method126(var50, var52, var48, var49, var51, var47, class129.method924(var53, arg0.field1148), class129.method924(var53, arg0.field1143), class129.method924(var53, arg0.field1142));
                } else if (arg0.field1145) {
                    class15.method122(var50, var52, var48, var49, var51, var47, arg0.field1148, arg0.field1143, arg0.field1142, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field1160);
                } else {
                    class15.method122(var50, var52, var48, var49, var51, var47, arg0.field1148, arg0.field1143, arg0.field1142, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field1160);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class224.field4080 && class161.method1110(class230.field4178 + class15.field281, class22.field422 + class15.field284, var46, var48, var52, var45, var47, var51)) {
            class235.field4230 = arg6;
            class206.field3682 = arg7;
        }
        if (arg8) {
            return;
        }
        class15.field272 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class15.field287 || var47 > class15.field287 || var51 > class15.field287) {
            class15.field272 = true;
        }
        if (arg0.field1160 != -1) {
            if (class39.field662) {
                class15.method122(var46, var48, var52, var45, var47, var51, arg0.field1144, arg0.field1142, arg0.field1143, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field1160);
                return;
            }
            int var54 = class15.field271.method1620(arg0.field1160, (byte) -69);
            class15.method126(var46, var48, var52, var45, var47, var51, class129.method924(var54, arg0.field1144), class129.method924(var54, arg0.field1142), class129.method924(var54, arg0.field1143));
        } else if (arg0.field1144 != 12345678) {
            class15.method126(var46, var48, var52, var45, var47, var51, arg0.field1144, arg0.field1142, arg0.field1143);
            return;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V")
    public static void method257(int arg0) {
        field578 = null;
        field581 = null;
        field574 = null;
        field580 = null;
        if (arg0 == 6381) {
            field575 = null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BLcc;)Ljh;")
    public static final class284 method258(byte arg0, class209 arg1) {
        field573++;
        if (arg0 <= 36) {
            field576 = -114;
        }
        for (class284 var2 = (class284) class21.field396.method1119(20896); var2 != null; var2 = (class284) class21.field396.method1120(114)) {
            if (var2.field4994.method1457((byte) -105, arg1)) {
                return var2;
            }
        }
        return null;
    }
}
