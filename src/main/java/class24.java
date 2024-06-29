import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class24 {

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "Luf;")
    public static class168 field286 = class148.method1019(-1720, "::gc");

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "Luf;")
    public static class168 field288 = class148.method1019(-1720, "cookieprefix");

    @OriginalMember(owner = "client!lj", name = "k", descriptor = "Luf;")
    private static class168 field296 = class148.method1019(-1720, "Loading title screen )2 ");

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "Luf;")
    public static class168 field287 = field296;

    @OriginalMember(owner = "client!lj", name = "l", descriptor = "Z")
    public static boolean field297 = false;

    @OriginalMember(owner = "client!lj", name = "m", descriptor = "Luf;")
    public static class168 field298 = class148.method1019(-1720, "Update)2Liste geladen)3");

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "J")
    public long field292;

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "Lg;")
    public static class242 field291;

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "Llj;")
    public class24 field293;

    @OriginalMember(owner = "client!lj", name = "j", descriptor = "Llj;")
    public class24 field295;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V", line = 4)
    public static void method122(int arg0) {
        field288 = null;
        field296 = null;
        if (arg0 != 0) {
            field287 = (class168) null;
        }
        field287 = null;
        field286 = null;
        field298 = null;
        field291 = null;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(B)Z", line = 23)
    public final boolean method123(byte arg0) {
        field290++;
        if (this.field293 == null) {
            return false;
        } else {
            return arg0 < -73;
        }
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(B)V", line = 52)
    public final void method124(byte arg0) {
        field289++;
        if (this.field293 == null) {
            return;
        }
        this.field293.field295 = this.field295;
        this.field295.field293 = this.field293;
        if (arg0 >= 12) {
            this.field295 = null;
            this.field293 = null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIILg;I)V", line = 84)
    public static final void method125(int arg0, int arg1, int arg2, class242 arg3, int arg4) {
        field294++;
        class254.method1750((byte) -53);
        int var5 = 107 % ((30 - arg0) / 57);
        class228.method1563(arg1, arg2, arg3.field3989 + arg1, arg3.field4057 + arg2);
        if (class76.field1032 == 2 || class76.field1032 == 5 || class207.field3394 == null) {
            class284 var58 = arg3.method1666(-88, false);
            if (var58 != null) {
                var58.method151(arg1, arg2);
            }
        } else {
            int var6 = class71.field959 + class45.field551 & 0x7FF;
            int var7 = 464 - (class266.field4489.field3021 / 32);
            int var8 = class266.field4489.field3027 / 32 + 48;
            ((class258) class207.field3394).method1776(arg1, arg2, arg3.field3989, arg3.field4057, var8, var7, var6, class70.field934 + 256, (class258) arg3.method1666(-116, false));
            if (class60.field780 != null) {
                for (int var9 = 0; var9 < class60.field780.field4146; var9++) {
                    if (class60.field780.method1681(var9, 123)) {
                        int var10 = (class60.field780.field4144[var9] - class182.field2916) * 4 + 2 - class266.field4489.field3027 / 32;
                        int var11 = (class60.field780.field4148[var9] - class276.field4641) * 4 + 2 - (class266.field4489.field3021 / 32);
                        int var12 = class173.field2812[var6];
                        int var13 = var12 * 256 / (class70.field934 + 256);
                        int var14 = class173.field2818[var6];
                        int var15 = var14 * 256 / (class70.field934 + 256);
                        class37 var16 = class245.field4170;
                        if (class60.field780.method1683(var9, 2) == 1) {
                            var16 = class283.field4781;
                        }
                        int var17 = var11 * var13 + (var10 * var15) >> 16;
                        if (class60.field780.method1683(var9, 2) == 2) {
                            var16 = class102.field1588;
                        }
                        int var18 = var11 * var15 - (var10 * var13) >> 16;
                        int var19 = var16.method212(class60.field780.field4158[var9], 100);
                        int var20 = var17 - var19 / 2;
                        if (-arg3.field3989 <= var20 && var20 <= arg3.field3989 && -arg3.field4057 <= var18 && var18 <= arg3.field4057) {
                            int var21 = 16777215;
                            if (class60.field780.field4147[var9] != -1) {
                                var21 = class60.field780.field4147[var9];
                            }
                            class228.method1552((class258) arg3.method1666(-124, false));
                            var16.method189(class60.field780.field4158[var9], arg3.field3989 / 2 + arg1 + var20, arg3.field4057 / 2 + arg2 + -var18, var19, 50, var21, 0, 256, 1, 0, 0);
                            class228.method1553();
                        }
                    }
                }
            }
            for (int var22 = 0; var22 < class262.field4443; var22++) {
                int var23 = class216.field3528[var22] * 4 + 2 - (class266.field4489.field3027 / 32);
                int var24 = class274.field4611[var22] * 4 + 2 - (class266.field4489.field3021 / 32);
                class161 var25 = class15.method64(class274.field4617[var22], false);
                if (var25.field2553 != null) {
                    var25 = var25.method1135(-115);
                    if (var25 == null || var25.field2556 == -1) {
                        continue;
                    }
                }
                class12.method46(class284.field4819[var25.field2556], arg2, var24, arg3, arg1, 848605840, var23);
            }
            for (int var26 = 0; var26 < 104; var26++) {
                for (int var27 = 0; var27 < 104; var27++) {
                    class76 var28 = class71.field952[class79.field1127][var26][var27];
                    if (var28 != null) {
                        int var29 = var26 * 4 + 2 - (class266.field4489.field3027 / 32);
                        int var30 = var27 * 4 - (class266.field4489.field3021 / 32 - 2);
                        class12.method46(class175.field2839[0], arg2, var30, arg3, arg1, 848605840, var29);
                    }
                }
            }
            for (int var31 = 0; var31 < class2.field15; var31++) {
                class22 var32 = class190.field3065[class116.field1814[var31]];
                if (var32 != null && var32.method111(0)) {
                    class196 var33 = var32.field267;
                    if (var33 != null && var33.field3188 != null) {
                        var33 = var33.method1387((byte) -1);
                    }
                    if (var33 != null && var33.field3194 && var33.field3178) {
                        int var34 = var32.field3027 / 32 - class266.field4489.field3027 / 32;
                        int var35 = var32.field3021 / 32 - (class266.field4489.field3021 / 32);
                        class12.method46(class175.field2839[1], arg2, var35, arg3, arg1, 848605840, var34);
                    }
                }
            }
            for (int var36 = 0; var36 < class167.field2676; var36++) {
                class54 var37 = class9.field117[class281.field4719[var36]];
                if (var37 != null && var37.method111(0)) {
                    int var38 = var37.field3027 / 32 - (class266.field4489.field3027 / 32);
                    int var39 = var37.field3021 / 32 - (class266.field4489.field3021 / 32);
                    boolean var40 = false;
                    long var41 = var37.field658.method1208((byte) 71);
                    for (int var43 = 0; var43 < class107.field1642; var43++) {
                        if (class61.field793[var43] == var41 && class237.field3782[var43] != 0) {
                            var40 = true;
                            break;
                        }
                    }
                    boolean var44 = false;
                    if (class266.field4489.field693 != 0 && var37.field693 != 0 && class266.field4489.field693 == var37.field693) {
                        var44 = true;
                    }
                    if (var40) {
                        class12.method46(class175.field2839[3], arg2, var39, arg3, arg1, 848605840, var38);
                    } else if (var44) {
                        class12.method46(class175.field2839[4], arg2, var39, arg3, arg1, 848605840, var38);
                    } else {
                        class12.method46(class175.field2839[2], arg2, var39, arg3, arg1, 848605840, var38);
                    }
                }
            }
            class15[] var45 = class43.field534;
            for (int var46 = 0; var46 < var45.length; var46++) {
                class15 var47 = var45[var46];
                if (var47 != null && var47.field151 != 0 && (class203.field3335 % 20) < 10) {
                    if (var47.field151 == 1 && var47.field157 >= 0 && var47.field157 < class190.field3065.length) {
                        class22 var48 = class190.field3065[var47.field157];
                        if (var48 != null) {
                            int var49 = var48.field3027 / 32 - (class266.field4489.field3027 / 32);
                            int var50 = var48.field3021 / 32 - class266.field4489.field3021 / 32;
                            class99.method744(arg2, arg1, var47.field150, arg3, var50, var49, 7966);
                        }
                    }
                    if (var47.field151 == 2) {
                        int var51 = (var47.field156 - class182.field2916) * 4 + 2 - class266.field4489.field3027 / 32;
                        int var52 = (var47.field152 - class276.field4641) * 4 + 2 - class266.field4489.field3021 / 32;
                        class99.method744(arg2, arg1, var47.field150, arg3, var52, var51, 7966);
                    }
                    if (var47.field151 == 10 && var47.field157 >= 0 && var47.field157 < class9.field117.length) {
                        class54 var53 = class9.field117[var47.field157];
                        if (var53 != null) {
                            int var54 = var53.field3027 / 32 - class266.field4489.field3027 / 32;
                            int var55 = var53.field3021 / 32 - class266.field4489.field3021 / 32;
                            class99.method744(arg2, arg1, var47.field150, arg3, var55, var54, 7966);
                        }
                    }
                }
            }
            if (class151.field2348 != 0) {
                int var56 = class151.field2348 * 4 + 2 - class266.field4489.field3027 / 32;
                int var57 = class215.field3509 * 4 + 2 - (class266.field4489.field3021 / 32);
                class12.method46(class22.field279, arg2, var57, arg3, arg1, 848605840, var56);
            }
            class228.method1560(arg3.field3989 / 2 + arg1 - 1, arg3.field4057 / 2 + -1 + arg2, 3, 3, 16777215);
        }
        class214.field3495[arg4] = true;
        class131.field2028[arg4] = true;
    }
}
