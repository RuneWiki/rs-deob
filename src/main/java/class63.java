import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class63 {

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "Lcd;")
    public static class64 field1214 = class44.method335((byte) 71, " steht bereits auf Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "Lcd;")
    public static class64 field1216 = class44.method335((byte) 71, "Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "Lcd;")
    public static class64 field1217 = class44.method335((byte) 71, "Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "Lcd;")
    public static class64 field1221 = class44.method335((byte) 71, "mapdots");

    @OriginalMember(owner = "client!ri", name = "k", descriptor = "Lcd;")
    public static class64 field1223 = class44.method335((byte) 71, "overlay");

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
    public static int field1215;

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "I")
    public int field1220;

    @OriginalMember(owner = "client!ri", name = "j", descriptor = "Lqm;")
    public static class222 field1222;

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "Lqd;")
    public static class40 field1218;

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "Lcd;")
    public class64 field1219;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V", line = 43)
    public static void method488(int arg0) {
        if (arg0 != 16) {
            return;
        }
        field1223 = null;
        field1214 = null;
        field1217 = null;
        field1216 = null;
        field1218 = null;
        field1221 = null;
        field1222 = null;
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)V", line = 62)
    public static final void method489(int arg0) {
        class292 var1 = class163.field2873;
        synchronized (class163.field2873) {
            if (arg0 <= 27) {
                field1214 = (class64) null;
            }
            class245.field4260++;
            class260.field4472 = class56.field949;
            class281.field4835 = class247.field4304;
            class188.field3213 = class135.field2414;
            class232.field3916 = class218.field3688;
            class268.field4609 = class113.field2089;
            class238.field4061 = class277.field4779;
            class169.field2946 = class165.field2899;
            class218.field3688 = 0;
        }
        field1215++;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lvc;IIIIIIIZ)V", line = 93)
    public static final void method490(class181 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class165.field2900;
        int var11;
        int var12 = var11 = (arg7 << 7) - class249.field4331;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class96.field1764[arg1][arg6][arg7] - class159.field2796;
        int var18 = class96.field1764[arg1][arg6 + 1][arg7] - class159.field2796;
        int var19 = class96.field1764[arg1][arg6 + 1][arg7 + 1] - class159.field2796;
        int var20 = class96.field1764[arg1][arg6][arg7 + 1] - class159.field2796;
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
        int var45 = (var21 << 9) / var25 + class50.field832;
        int var46 = (var24 << 9) / var25 + class50.field823;
        int var47 = (var27 << 9) / var31 + class50.field832;
        int var48 = (var30 << 9) / var31 + class50.field823;
        int var49 = (var33 << 9) / var37 + class50.field832;
        int var50 = (var36 << 9) / var37 + class50.field823;
        int var51 = (var39 << 9) / var43 + class50.field832;
        int var52 = (var42 << 9) / var43 + class50.field823;
        class50.field831 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class156.field2761 && class6.method65(class50.field832 + class264.field4541, class50.field823 + class227.field3859, var50, var52, var48, var49, var51, var47)) {
                class252.field4383 = arg6;
                class202.field3457 = arg7;
            }
            if (!class123.field2216 && !arg8) {
                class50.field825 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class50.field819 || var51 > class50.field819 || var47 > class50.field819) {
                    class50.field825 = true;
                }
                if (arg0.field3116 == -1) {
                    if (arg0.field3109 != 12345678) {
                        class50.method364(var50, var52, var48, var49, var51, var47, arg0.field3109, arg0.field3105, arg0.field3115);
                    }
                } else if (!class109.field2015) {
                    int var53 = class50.field816.method666(true, arg0.field3116);
                    class50.method364(var50, var52, var48, var49, var51, var47, class173.method1216(var53, arg0.field3109), class173.method1216(var53, arg0.field3105), class173.method1216(var53, arg0.field3115));
                } else if (arg0.field3104) {
                    class50.method378(var50, var52, var48, var49, var51, var47, arg0.field3109, arg0.field3105, arg0.field3115, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field3116);
                } else {
                    class50.method378(var50, var52, var48, var49, var51, var47, arg0.field3109, arg0.field3105, arg0.field3115, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field3116);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class156.field2761 && class6.method65(class50.field832 + class264.field4541, class50.field823 + class227.field3859, var46, var48, var52, var45, var47, var51)) {
            class252.field4383 = arg6;
            class202.field3457 = arg7;
        }
        if (class123.field2216 || arg8) {
            return;
        }
        class50.field825 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class50.field819 || var47 > class50.field819 || var51 > class50.field819) {
            class50.field825 = true;
        }
        if (arg0.field3116 == -1) {
            if (arg0.field3108 != 12345678) {
                class50.method364(var46, var48, var52, var45, var47, var51, arg0.field3108, arg0.field3115, arg0.field3105);
            }
        } else if (class109.field2015) {
            class50.method378(var46, var48, var52, var45, var47, var51, arg0.field3108, arg0.field3115, arg0.field3105, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field3116);
        } else {
            int var54 = class50.field816.method666(true, arg0.field3116);
            class50.method364(var46, var48, var52, var45, var47, var51, class173.method1216(var54, arg0.field3108), class173.method1216(var54, arg0.field3115), class173.method1216(var54, arg0.field3105));
        }
    }
}
