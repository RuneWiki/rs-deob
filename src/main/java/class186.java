import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class186 {

    @OriginalMember(owner = "client!ue", name = "o", descriptor = "I")
    public int field3544 = 0;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "I")
    public int field3537 = 0;

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "Lai;")
    public static class10 field3539 = class44.method278("Zu viele Anmelde)2Versuche von Ihrer Adresse", 120);

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "Lai;")
    private static class10 field3535 = class44.method278("K", 121);

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "Lai;")
    public static class10 field3536 = field3535;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "Lai;")
    private static class10 field3533 = class44.method278(" is already on your ignore list)3", -13);

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "Lai;")
    public static class10 field3530 = field3533;

    @OriginalMember(owner = "client!ue", name = "u", descriptor = "Lai;")
    public static class10 field3550 = field3535;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "Ldd;")
    public static class34 field3534 = new class34(30);

    @OriginalMember(owner = "client!ue", name = "x", descriptor = "Lai;")
    public static class10 field3553 = class44.method278("compass", 113);

    @OriginalMember(owner = "client!ue", name = "A", descriptor = "[[[I")
    public static int[][][] field3556 = new int[4][105][105];

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
    public static int field3531;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
    public static int field3532;

    @OriginalMember(owner = "client!ue", name = "m", descriptor = "I")
    public int field3542;

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "I")
    public static int field3543;

    @OriginalMember(owner = "client!ue", name = "p", descriptor = "I")
    public int field3545;

    @OriginalMember(owner = "client!ue", name = "q", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!ue", name = "r", descriptor = "I")
    public static int field3547;

    @OriginalMember(owner = "client!ue", name = "s", descriptor = "I")
    public int field3548;

    @OriginalMember(owner = "client!ue", name = "t", descriptor = "I")
    public static int field3549;

    @OriginalMember(owner = "client!ue", name = "v", descriptor = "I")
    public int field3551;

    @OriginalMember(owner = "client!ue", name = "w", descriptor = "I")
    public int field3552;

    @OriginalMember(owner = "client!ue", name = "z", descriptor = "J")
    public static long field3555;

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "Lmb;")
    public static class111 field3538;

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "Lnd;")
    public class122 field3540;

    @OriginalMember(owner = "client!ue", name = "l", descriptor = "Lnd;")
    public class122 field3541;

    @OriginalMember(owner = "client!ue", name = "y", descriptor = "Lc;")
    public static class21 field3554;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIILug;I)V")
    public static final void method1196(int arg0, int arg1, int arg2, class188 arg3, int arg4) {
        field3532++;
        if (class53.field946 >= 400) {
            return;
        }
        if (arg3.field3596 != null) {
            arg3 = arg3.method1208((byte) -93);
        }
        if (arg3 == null || (!arg3.field3602 || arg1 != -1166)) {
            return;
        }
        class10 var5 = arg3.field3569;
        if (arg3.field3567 != 0) {
            var5 = class67.method440(0, new class10[] { var5, class200.method1292(class145.field2767.field594, (byte) 116, arg3.field3567), class45.field735, class155.field3006, class119.method846(arg1 + 1166, arg3.field3567), class117.field2268 });
        }
        if (class135.field2539 == 1) {
            class120.field2301++;
            class107.method692(class67.method440(0, new class10[] { class141.field2660, class94.field1749, var5 }), 37, arg2, arg0, arg4, class34.field528, -117);
        } else if (!class32.field482) {
            class182.field3465++;
            class10[] var6 = arg3.field3577;
            if (class189.field3603) {
                var6 = class129.method905(var6, 0);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && !var6[var7].method70((byte) 94, class180.field3446)) {
                        byte var8 = 0;
                        if (var7 == 0) {
                            var8 = 6;
                        }
                        if (var7 == 1) {
                            var8 = 7;
                        }
                        class77.field1331++;
                        if (var7 == 2) {
                            var8 = 13;
                        }
                        if (var7 == 3) {
                            var8 = 2;
                        }
                        if (var7 == 4) {
                            var8 = 3;
                        }
                        class107.method692(class67.method440(arg1 + 1166, new class10[] { class61.field1036, var5 }), var8, arg2, arg0, arg4, var6[var7], arg1 + 1041);
                    }
                }
            }
            if (var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method70((byte) 101, class180.field3446)) {
                        class98.field1811++;
                        short var10 = 0;
                        if (class145.field2767.field594 < arg3.field3567) {
                            var10 = 2000;
                        }
                        int var11 = 0;
                        if (var9 == 0) {
                            var11 = var10 + 6;
                        }
                        if (var9 == 1) {
                            var11 = var10 + 7;
                        }
                        if (var9 == 2) {
                            var11 = var10 + 13;
                        }
                        if (var9 == 3) {
                            var11 = var10 + 2;
                        }
                        if (var9 == 4) {
                            var11 = var10 + 3;
                        }
                        class107.method692(class67.method440(arg1 ^ 0xFFFFFB72, new class10[] { class61.field1036, var5 }), var11, arg2, arg0, arg4, var6[var9], -117);
                    }
                }
            }
            class107.method692(class67.method440(arg1 + 1166, new class10[] { class61.field1036, var5 }), 1001, arg2, arg0, arg4, class36.field580, -121);
            return;
        } else if ((class49.field871 & 0x2) == 2) {
            class203.field3963++;
            class107.method692(class67.method440(0, new class10[] { class33.field501, class94.field1749, var5 }), 30, arg2, arg0, arg4, class3.field30, -125);
            return;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lc;I)V")
    public static final void method1197(class21 arg0, int arg1) {
        field3547++;
        class180.field3432 = arg0;
        if (arg1 > -25) {
            field3550 = null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILc;Lc;IZ)Lud;")
    public static final class185 method1198(int arg0, class21 arg1, class21 arg2, int arg3, boolean arg4) {
        field3531++;
        boolean var5 = true;
        int[] var6 = arg1.method151(arg3, (byte) -118);
        for (int var7 = 0; var7 < var6.length; var7++) {
            byte[] var8 = arg1.method147(var6[var7], (byte) 110, arg3);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = var8[1] & 0xFF | (var8[0] & 0xFF) << 8;
                byte[] var10;
                if (arg4) {
                    var10 = arg2.method147(var9, (byte) 110, 0);
                } else {
                    var10 = arg2.method147(0, (byte) 110, var9);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        }
        try {
            if (arg0 == -1) {
                return new class185(arg1, arg2, arg3, arg4);
            } else {
                return null;
            }
        } catch (Exception var11) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIB)V")
    public static final void method1199(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field3543++;
        if (arg4 <= 28) {
            method1199(89, 97, -7, -68, (byte) 127);
        }
        for (class170 var5 = (class170) class145.field2777.method1223(true); var5 != null; var5 = (class170) class145.field2777.method1226((byte) -57)) {
            if (var5.field3284 != -1 || var5.field3290 != null) {
                int var6 = 0;
                if (var5.field3276 < arg1) {
                    var6 += arg1 - var5.field3276;
                } else if (var5.field3295 > arg1) {
                    var6 += var5.field3295 - arg1;
                }
                if (var5.field3279 < arg0) {
                    var6 += arg0 - var5.field3279;
                } else if (arg0 < var5.field3291) {
                    var6 += var5.field3291 - arg0;
                }
                if (var6 - 64 > var5.field3293 || class120.field2317 == 0 || var5.field3280 != arg2) {
                    if (var5.field3277 != null) {
                        class122.field2344.method1253(var5.field3277);
                        var5.field3277 = null;
                    }
                    if (var5.field3288 != null) {
                        class122.field2344.method1253(var5.field3288);
                        var5.field3288 = null;
                    }
                } else {
                    var6 -= 64;
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    int var7 = (var5.field3293 - var6) * class120.field2317 / var5.field3293;
                    if (var5.field3277 != null) {
                        var5.field3277.method318(var7);
                    } else if (var5.field3284 >= 0) {
                        class199 var8 = class199.method1288(class151.field2912, var5.field3284, 0);
                        if (var8 != null) {
                            class150 var9 = var8.method1285().method1026(class203.field3970);
                            class48 var10 = class48.method303(var9, 100, var7);
                            var10.method302(-1);
                            class122.field2344.method1251(var10);
                            var5.field3277 = var10;
                        }
                    }
                    if (var5.field3288 != null) {
                        var5.field3288.method318(var7);
                        if (!var5.field3288.method845(true)) {
                            var5.field3288 = null;
                        }
                    } else if (var5.field3290 != null && (var5.field3292 -= arg3) <= 0) {
                        int var11 = (int) ((double) var5.field3290.length * Math.random());
                        class199 var12 = class199.method1288(class151.field2912, var5.field3290[var11], 0);
                        if (var12 != null) {
                            class150 var13 = var12.method1285().method1026(class203.field3970);
                            class48 var14 = class48.method303(var13, 100, var7);
                            var14.method302(0);
                            class122.field2344.method1251(var14);
                            var5.field3288 = var14;
                            var5.field3292 = (int) ((double) (var5.field3278 - var5.field3275) * Math.random()) + var5.field3275;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z)V")
    public static void method1200(boolean arg0) {
        field3554 = null;
        field3550 = null;
        field3533 = null;
        field3553 = null;
        field3535 = null;
        field3539 = null;
        field3556 = null;
        field3538 = null;
        field3530 = null;
        if (!arg0) {
            field3534 = null;
            field3536 = null;
        }
    }
}
