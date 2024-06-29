import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class241 {

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    public static int field4199 = 0;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public static int field4198;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
    public static int field4200;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
    public static int field4201;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
    public static int field4202;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)V")
    public static final void method1608(byte arg0) {
        if (arg0 > -39) {
            return;
        }
        field4202++;
        if (class56.field1150 > 0) {
            class270.method1855(-5);
        } else {
            class253.field4347 = class197.field3520;
            class197.field3520 = null;
            class70.method497(121, 40);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZI)Lvf;")
    public static final class265 method1609(boolean arg0, int arg1) {
        field4198++;
        return arg0 ? class167.method1107(arg1, false, 10, (byte) 22) : null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)Z")
    public static final boolean method1610(int arg0, int arg1) {
        class36.field838 = true;
        class126.field2262 = arg0 + arg1 & 0xFFFF;
        field4201++;
        return true;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZILgk;II)V")
    public static final void method1611(boolean arg0, int arg1, class6 arg2, int arg3, int arg4) {
        class44.method369(true);
        class35.method287(arg4, arg3, arg2.field89 + arg4, arg2.field84 + arg3);
        if (arg0) {
            field4199 = 32;
        }
        field4200++;
        if (class112.field1957 == 2 || class112.field1957 == 5 || class75.field1438 == null) {
            class35.method299(arg4, arg3, 0, arg2.field202, arg2.field173);
        } else {
            int var5 = class79.field1500 + class122.field2180 & 0x7FF;
            int var6 = class214.field3827.field2600 / 32 + 48;
            int var7 = 464 - (class214.field3827.field2564 / 32);
            ((class88) class75.field1438).method592(arg4, arg3, arg2.field89, arg2.field84, var6, var7, var5, class39.field908 + 256, arg2.field202, arg2.field173);
            if (class221.field3962 != null) {
                for (int var8 = 0; var8 < class221.field3962.field2713; var8++) {
                    if (class221.field3962.method1003(arg0, var8)) {
                        int var9 = (class221.field3962.field2705[var8] - class64.field1248) * 4 + 2 - (class214.field3827.field2600 / 32);
                        int var10 = class247.field4289[var5];
                        int var11 = var10 * 256 / (class39.field908 + 256);
                        int var12 = (class221.field3962.field2709[var8] - class231.field4073) * 4 + 2 - (class214.field3827.field2564 / 32);
                        int var13 = class247.field4298[var5];
                        int var14 = var13 * 256 / (class39.field908 + 256);
                        int var15 = var9 * var14 + var11 * var12 >> 16;
                        class115 var16 = class263.field4592;
                        int var17 = var12 * var14 - (var9 * var11) >> 16;
                        if (class221.field3962.method997((byte) 87, var8) == 1) {
                            var16 = class22.field668;
                        }
                        if (class221.field3962.method997((byte) -115, var8) == 2) {
                            var16 = class205.field3692;
                        }
                        int var18 = var16.method771(class221.field3962.field2702[var8], 100);
                        int var19 = var15 - var18 / 2;
                        if (var19 >= (-arg2.field89) && var19 <= arg2.field89 && -arg2.field84 <= var17 && var17 <= arg2.field84) {
                            int var20 = 16777215;
                            if (class221.field3962.field2699[var8] != -1) {
                                var20 = class221.field3962.field2699[var8];
                            }
                            class35.method293(arg2.field202, arg2.field173);
                            var16.method756(class221.field3962.field2702[var8], arg4 + var19 + (arg2.field89 / 2), arg2.field84 / 2 + arg3 + -var17, var18, 50, var20, 0, 256, 1, 0, 0);
                            class35.method290();
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < class225.field3995; var21++) {
                int var56 = class162.field2949[var21] * 4 + 2 - (class214.field3827.field2600 / 32);
                int var57 = class89.field1594[var21] * 4 + 2 - (class214.field3827.field2564 / 32);
                class130 var58 = class84.method574(-123, class36.field832[var21]);
                if (var58.field2365 != null) {
                    var58 = var58.method861(-25233);
                    if (var58 == null || var58.field2317 == -1) {
                        continue;
                    }
                }
                class89.method609(-71, arg4, var56, arg2, var57, class57.field1159[var58.field2317], arg3);
            }
            for (int var22 = 0; var22 < 104; var22++) {
                for (int var52 = 0; var52 < 104; var52++) {
                    class117 var53 = class210.field3768[class216.field3902][var22][var52];
                    if (var53 != null) {
                        int var54 = var22 * 4 - (class214.field3827.field2600 / 32 - 2);
                        int var55 = var52 * 4 + 2 - (class214.field3827.field2564 / 32);
                        class89.method609(-73, arg4, var54, arg2, var55, class188.field3388[0], arg3);
                    }
                }
            }
            for (int var23 = 0; var23 < class48.field1027; var23++) {
                class23 var48 = class4.field67[class93.field1646[var23]];
                if (var48 != null && var48.method227((byte) 117)) {
                    class268 var49 = var48.field681;
                    if (var49 != null && var49.field4755 != null) {
                        var49 = var49.method1825(20656);
                    }
                    if (var49 != null && var49.field4758 && var49.field4775) {
                        int var50 = var48.field2600 / 32 - (class214.field3827.field2600 / 32);
                        int var51 = var48.field2564 / 32 - class214.field3827.field2564 / 32;
                        if (var49.field4711 == -1) {
                            class89.method609(-127, arg4, var50, arg2, var51, class188.field3388[1], arg3);
                        } else {
                            class89.method609(-120, arg4, var50, arg2, var51, class57.field1159[var49.field4711], arg3);
                        }
                    }
                }
            }
            for (int var24 = 0; var24 < class19.field520; var24++) {
                class122 var38 = class209.field3766[class93.field1652[var24]];
                if (var38 != null && var38.method227((byte) 114)) {
                    int var39 = var38.field2600 / 32 - (class214.field3827.field2600 / 32);
                    int var40 = var38.field2564 / 32 - (class214.field3827.field2564 / 32);
                    boolean var41 = false;
                    long var42 = var38.field2163.method1793(43);
                    for (int var44 = 0; var44 < class89.field1603; var44++) {
                        if (class9.field286[var44] == var42 && class196.field3508[var44] != 0) {
                            var41 = true;
                            break;
                        }
                    }
                    boolean var45 = false;
                    for (int var46 = 0; var46 < class154.field2856; var46++) {
                        if (class198.field3547[var46].field393 == var42) {
                            var45 = true;
                            break;
                        }
                    }
                    boolean var47 = false;
                    if (class214.field3827.field2185 != 0 && var38.field2185 != 0 && class214.field3827.field2185 == var38.field2185) {
                        var47 = true;
                    }
                    if (var41) {
                        class89.method609(-89, arg4, var39, arg2, var40, class188.field3388[3], arg3);
                    } else if (var45) {
                        class89.method609(-103, arg4, var39, arg2, var40, class188.field3388[5], arg3);
                    } else if (var47) {
                        class89.method609(-81, arg4, var39, arg2, var40, class188.field3388[4], arg3);
                    } else {
                        class89.method609(-97, arg4, var39, arg2, var40, class188.field3388[2], arg3);
                    }
                }
            }
            class244[] var25 = class30.field771;
            for (int var26 = 0; var26 < var25.length; var26++) {
                class244 var29 = var25[var26];
                if (var29 != null && var29.field4253 != 0 && (class93.field1655 % 20) < 10) {
                    if (var29.field4253 == 1 && var29.field4252 >= 0 && var29.field4252 < class4.field67.length) {
                        class23 var30 = class4.field67[var29.field4252];
                        if (var30 != null) {
                            int var31 = var30.field2564 / 32 - (class214.field3827.field2564 / 32);
                            int var32 = var30.field2600 / 32 - class214.field3827.field2600 / 32;
                            class210.method1439(arg4, var31, arg3, arg2, var32, 2, var29.field4254);
                        }
                    }
                    if (var29.field4253 == 2) {
                        int var33 = (var29.field4265 - class64.field1248) * 4 + 2 - (class214.field3827.field2600 / 32);
                        int var34 = (var29.field4267 - class231.field4073) * 4 + 2 - class214.field3827.field2564 / 32;
                        class210.method1439(arg4, var34, arg3, arg2, var33, 2, var29.field4254);
                    }
                    if (var29.field4253 == 10 && var29.field4252 >= 0 && var29.field4252 < class209.field3766.length) {
                        class122 var35 = class209.field3766[var29.field4252];
                        if (var35 != null) {
                            int var36 = var35.field2600 / 32 - class214.field3827.field2600 / 32;
                            int var37 = var35.field2564 / 32 - (class214.field3827.field2564 / 32);
                            class210.method1439(arg4, var37, arg3, arg2, var36, 2, var29.field4254);
                        }
                    }
                }
            }
            if (class161.field2936 != 0) {
                int var27 = class161.field2936 * 4 + 2 - (class214.field3827.field2600 / 32);
                int var28 = class203.field3633 * 4 + 2 - (class214.field3827.field2564 / 32);
                class89.method609(-84, arg4, var27, arg2, var28, class140.field2596, arg3);
            }
            class35.method295(arg2.field89 / 2 + arg4 - 1, arg2.field84 / 2 + (arg3 - 1), 3, 3, 16777215);
        }
        class80.field1516[arg1] = true;
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "()V")
    public class241() {
        new class75();
    }
}
