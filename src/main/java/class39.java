import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class39 extends Exception {

    @OriginalMember(owner = "client!vo", name = "d", descriptor = "Ltb;")
    public static class365 field460 = new class365();

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!vo", name = "e", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "[Liga;")
    public static class421[] field458;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIIIIIZIII)Z")
    public static final boolean method350(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
        field459++;
        if (!class442.method2514(arg7, arg5, (byte) -82, arg4)) {
            return false;
        }
        int var10 = class399.field5605[0];
        int var11 = class399.field5605[2];
        int var12 = class399.field5605[1];
        if (!class442.method2514(arg1, arg8, (byte) -82, arg0)) {
            return false;
        }
        if (!arg6) {
            field458 = null;
        }
        int var13 = class399.field5605[2];
        int var14 = class399.field5605[0];
        int var15 = class399.field5605[1];
        if (class442.method2514(arg3, arg2, (byte) -82, arg9)) {
            int var16 = class399.field5605[2];
            int var17 = class399.field5605[1];
            int var18 = class399.field5605[0];
            return class35.method311(var18, var17, var11, var13, var15, var12, arg6, var10, var14, var16);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IBIII)V")
    public static final void method351(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field461++;
        if (arg4 == 8 || arg4 == 16) {
            for (int var6 = 0; var6 < class111.field1542; var6++) {
                class209 var7 = class184.field2659[var6];
                if (var7.field2952 == arg4 && var7.field2940 == arg3 && var7.field2958 == arg0 || var7.field2953 == arg3 && var7.field2958 == arg0) {
                    if (class111.field1542 != var6) {
                        class359.method2052(class184.field2659, var6 + 1, class184.field2659, var6, class184.field2659.length - var6 - 1);
                    }
                    class111.field1542--;
                    return;
                }
            }
        } else {
            class390 var5 = class295.field4051[arg2][arg3][arg0];
            if (var5 != null) {
                if (arg4 == 1) {
                    var5.field5527 = 0;
                } else if (arg4 == 2) {
                    var5.field5535 = 0;
                }
            }
            class54.method410(-1);
        }
        if (arg1 >= -116) {
            field460 = null;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(I)V")
    public static void method352(int arg0) {
        field460 = null;
        if (arg0 == -12531) {
            field458 = null;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIIILad;I)V")
    public static final void method353(int arg0, int arg1, int arg2, int arg3, class389 arg4, int arg5) {
        field457++;
        if (arg4.field5496 == -1 && arg4.field5506 == null) {
            return;
        }
        int var6 = arg3;
        if (arg4.field5495 < arg5) {
            var6 = arg5 + arg3 - arg4.field5495;
        } else if (arg4.field5513 > arg5) {
            var6 = arg4.field5513 + arg3 - arg5;
        }
        int var7 = class366.field4875.field9364 * arg4.field5493 >> 8;
        if (arg4.field5485 < arg1) {
            var6 += arg1 - arg4.field5485;
        } else if (arg4.field5487 > arg1) {
            var6 += arg4.field5487 - arg1;
        }
        if (arg4.field5505 == 0 || var6 - 256 > arg4.field5505 || class366.field4875.field9364 == 0 || arg4.field5501 != arg2) {
            if (arg4.field5499 != null) {
                class61.field680.method1464(arg4.field5499);
                arg4.field5499 = null;
                arg4.field5490 = null;
                arg4.field5498 = null;
            }
            if (arg4.field5503 != null) {
                class61.field680.method1464(arg4.field5503);
                arg4.field5482 = null;
                arg4.field5486 = null;
                arg4.field5503 = null;
            }
            return;
        }
        var6 -= 256;
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = (arg4.field5505 - var6) * var7 / arg4.field5505;
        class143.field2063.method881(-118);
        int var9 = 8192;
        int var10 = (arg4.field5513 + arg4.field5495) / 2 - arg5;
        int var11 = (arg4.field5487 + arg4.field5485) / 2 - arg1;
        if (var10 != 0 || var11 != 0) {
            int var12 = -class41.field475 - ((int) (Math.atan2((double) var10, (double) var11) * 2607.5945876176133D)) - 4096 & 0x3FFF;
            if (var12 > 8192) {
                var12 = 16384 - var12;
            }
            int var13;
            if (var6 <= 0) {
                var13 = 8192;
            } else if (var6 >= 4096) {
                var13 = 16384;
            } else {
                var13 = var6 * 8192 / 4096 + 8192;
            }
            var9 = (16384 - var13 >> 1) + var12 * var13 / 8192;
        }
        if (arg4.field5499 != null) {
            arg4.field5499.method2753(var8);
            arg4.field5499.method2746(var9);
        } else if (arg4.field5496 >= 0) {
            int var14 = arg4.field5514 == 256 && arg4.field5515 == 256 ? 256 : class159.method1127(true, arg4.field5515, arg4.field5514);
            if (arg4.field5483) {
                if (arg4.field5490 == null) {
                    arg4.field5490 = class172.method1216(class76.field992, arg4.field5496);
                }
                if (arg4.field5490 != null) {
                    if (arg4.field5498 == null) {
                        arg4.field5498 = arg4.field5490.method1215(new int[] { 22050 });
                    }
                    if (arg4.field5498 != null) {
                        class484 var15 = class484.method2751(arg4.field5498, var14, var8 << 6, var9);
                        var15.method2754(-1);
                        class61.field680.method1462(var15);
                        arg4.field5499 = var15;
                    }
                }
            } else {
                class237 var16 = class237.method1484(class23.field279, arg4.field5496, 0);
                if (var16 != null) {
                    class19 var17 = var16.method1485().method206(class408.field5803);
                    class484 var18 = class484.method2751(var17, var14, var8 << 6, var9);
                    var18.method2754(-1);
                    class61.field680.method1462(var18);
                    arg4.field5499 = var18;
                }
            }
        }
        if (arg4.field5503 != null) {
            arg4.field5503.method2753(var8);
            arg4.field5503.method2746(var9);
            if (arg4.field5503.method2339(119)) {
                return;
            }
            arg4.field5482 = null;
            arg4.field5503 = null;
            arg4.field5486 = null;
        } else if (arg4.field5506 != null && (arg4.field5511 -= arg0) <= 0) {
            int var19 = arg4.field5514 == 256 && arg4.field5515 == 256 ? 256 : (int) ((double) (arg4.field5514 - arg4.field5515) * Math.random()) + arg4.field5515;
            if (arg4.field5494) {
                if (arg4.field5482 == null) {
                    int var20 = (int) (Math.random() * (double) arg4.field5506.length);
                    arg4.field5482 = class172.method1216(class76.field992, arg4.field5506[var20]);
                }
                if (arg4.field5482 != null) {
                    if (arg4.field5486 == null) {
                        arg4.field5486 = arg4.field5482.method1215(new int[] { 22050 });
                    }
                    if (arg4.field5486 != null) {
                        class484 var21 = class484.method2751(arg4.field5486, var19, var8 << 6, var9);
                        var21.method2754(0);
                        class61.field680.method1462(var21);
                        arg4.field5511 = (int) ((double) (arg4.field5517 - arg4.field5509) * Math.random()) + arg4.field5509;
                        arg4.field5503 = var21;
                        return;
                    }
                }
                return;
            }
            int var22 = (int) ((double) arg4.field5506.length * Math.random());
            class237 var23 = class237.method1484(class23.field279, arg4.field5506[var22], 0);
            if (var23 != null) {
                class19 var24 = var23.method1485().method206(class408.field5803);
                class484 var25 = class484.method2751(var24, var19, var8 << 6, var9);
                var25.method2754(0);
                class61.field680.method1462(var25);
                arg4.field5511 = (int) ((double) (arg4.field5517 - arg4.field5509) * Math.random()) + arg4.field5509;
                arg4.field5503 = var25;
                return;
            }
        }
    }
}
