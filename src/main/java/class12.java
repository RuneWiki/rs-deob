import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class12 {

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
    public int field170;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "I")
    public int field174;

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
    public int field176;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
    public int field175;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "[Z")
    public static boolean[] field169 = new boolean[112];

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "[I")
    public static int[] field171 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "Ljava/lang/String;")
    public static String field173 = "green:";

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    public static int field166;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
    public static int field167;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "[I")
    public static int[] field168;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BI)Lue;")
    public static final class208 method73(byte arg0, int arg1) {
        field166++;
        class208 var2 = (class208) class24.field382.method57((long) arg1, -126);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class209.field3541.method746(class99.method626(arg1, 118), (byte) -128, class144.method1003(1625386855, arg1));
        class208 var4 = new class208();
        var4.field3500 = arg1;
        if (var3 != null) {
            var4.method1394(new class101(var3), -1);
        }
        if (arg0 == 57) {
            var4.method1392(false);
            class24.field382.method62(arg0 - 57, var4, (long) arg1);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIIZI)V")
    public static final void method74(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field172++;
        if (!arg5) {
            return;
        }
        if (class183.field2976 == 0) {
            int var7 = class215.field3628;
            int var8 = class109.field1960;
            int var9 = class296.field4703;
            int var10 = (arg1 - arg4) * (var8 - var7) / arg2 + var7;
            int var11 = class177.field2914;
            int var12 = (arg3 - arg0) * (var9 - var11) / arg6 + var11;
            if (class76.field1241 && (class176.field2898 & 0x40) != 0) {
                class46 var13 = class285.method1902(class47.field825, class119.field2108, 5);
                if (var13 == null) {
                    class239.method1581(-24930);
                } else {
                    class37.method247(0L, class6.field67, " ->", 10032, var10, class158.field2640, (short) 16, var12);
                }
            } else {
                if (class185.field3002 == 1) {
                    class37.method247(0L, class296.field4701, "", 10032, var10, -1, (short) 36, var12);
                }
                class24.field368++;
                class37.method247(0L, class66.field1109, "", 10032, var10, -1, (short) 47, var12);
            }
        }
        long var14 = -1L;
        for (int var16 = 0; var16 < class55.field952; var16++) {
            long var17 = class169.field2796[var16];
            int var19 = (int) var17 & 0x7F;
            int var20 = (int) (var17 >>> 32) & Integer.MAX_VALUE;
            int var21 = (int) var17 >> 29 & 0x3;
            int var22 = ((int) var17 & 0x3FB0) >> 7;
            if (var14 != var17) {
                var14 = var17;
                if (var21 == 2 && class295.method1987(class176.field2886, var19, var22, var17)) {
                    class206 var23 = class10.method64(64, var20);
                    if (var23.field3373 != null) {
                        var23 = var23.method1375((byte) 93);
                    }
                    if (var23 == null) {
                        continue;
                    }
                    if (class183.field2976 == 1) {
                        class95.field1644++;
                        class37.method247(var17, class45.field631, class258.field4208 + " -> <col=00ffff>" + var23.field3379, 10032, var19, class256.field4179, (short) 28, var22);
                    } else if (class76.field1241) {
                        class2 var24 = class183.field2983 == -1 ? null : class119.method816(class183.field2983, (byte) 96);
                        if ((class176.field2898 & 0x4) != 0 && (var24 == null || var23.method1360(class183.field2983, arg5, var24.field25) != var24.field25)) {
                            class133.field2308++;
                            class37.method247(var17, class6.field67, class253.field4145 + " -> <col=00ffff>" + var23.field3379, 10032, var19, class158.field2640, (short) 32, var22);
                        }
                    } else {
                        String[] var25 = var23.field3431;
                        if (class29.field433) {
                            var25 = class285.method1903(var25, !arg5);
                        }
                        class50.field855++;
                        if (var25 != null) {
                            for (int var26 = 4; var26 >= 0; var26--) {
                                if (var25[var26] != null) {
                                    class259.field4249++;
                                    short var27 = 0;
                                    int var28 = -1;
                                    if (var26 == 0) {
                                        var27 = 33;
                                    }
                                    if (var23.field3427 == var26) {
                                        var28 = var23.field3368;
                                    }
                                    if (var26 == 1) {
                                        var27 = 41;
                                    }
                                    if (var23.field3416 == var26) {
                                        var28 = var23.field3366;
                                    }
                                    if (var26 == 2) {
                                        var27 = 43;
                                    }
                                    if (var26 == 3) {
                                        var27 = 57;
                                    }
                                    if (var26 == 4) {
                                        var27 = 1004;
                                    }
                                    class37.method247(var17, var25[var26], "<col=00ffff>" + var23.field3379, 10032, var19, var28, var27, var22);
                                }
                            }
                        }
                        class37.method247((long) var23.field3384, class277.field4436, "<col=00ffff>" + var23.field3379, 10032, var19, class293.field4678, (short) 1003, var22);
                    }
                }
                if (var21 == 1) {
                    class141 var29 = class42.field625[var20];
                    if ((var29.field2421.field3537 & 0x1) == 0 && (var29.field1397 & 0x7F) == 0 && (var29.field1458 & 0x7F) == 0 || (var29.field2421.field3537 & 0x1) == 1 && (var29.field1397 & 0x7F) == 64 && (var29.field1458 & 0x7F) == 64) {
                        int var30 = var29.field1397 - ((var29.field2421.field3537 - 1) * 64);
                        int var31 = var29.field1458 + 64 - var29.field2421.field3537 * 64;
                        for (int var32 = 0; var32 < class187.field3037; var32++) {
                            class141 var37 = class42.field625[class292.field4668[var32]];
                            if (var37 != null && !var37.field1428 && var29 != var37 && var37.field1479) {
                                int var38 = 64 - (var37.field2421.field3537 * 64 - var37.field1458);
                                int var39 = var37.field1397 - ((var37.field2421.field3537 - 1) * 64);
                                if (var30 <= var39 && var29.field2421.field3537 - (var39 - var30 >> 7) >= var37.field2421.field3537 && var38 >= var31 && var37.field2421.field3537 <= (var29.field2421.field3537 - (var38 - var31 >> 7))) {
                                    class243.method1605(var37.field2421, var22, class292.field4668[var32], var19, -26647);
                                    var37.field1428 = true;
                                }
                            }
                        }
                        for (int var33 = 0; var33 < class157.field2624; var33++) {
                            class288 var34 = class105.field1874[class280.field4458[var33]];
                            if (var34 != null && !var34.field1428 && var34.field1479) {
                                int var35 = var34.field1397 - (var34.method528(123) - 1) * 64;
                                int var36 = var34.field1458 + (64 - (var34.method528(126) * 64));
                                if (var30 <= var35 && var34.method528(118) <= var29.field2421.field3537 - (var35 - var30 >> 7) && var31 <= var36 && var34.method528(21) <= var29.field2421.field3537 - (var36 - var31 >> 7)) {
                                    class50.method310(117, class280.field4458[var33], var22, var34, var19);
                                    var34.field1428 = true;
                                }
                            }
                        }
                    }
                    if (var29.field1428) {
                        continue;
                    }
                    class243.method1605(var29.field2421, var22, var20, var19, -26647);
                    var29.field1428 = true;
                }
                if (var21 == 0) {
                    class288 var40 = class105.field1874[var20];
                    if ((var40.field1397 & 0x7F) == 64 && (var40.field1458 & 0x7F) == 64) {
                        int var41 = var40.field1397 - ((var40.method528(11) - 1) * 64);
                        int var42 = var40.field1458 + 64 - var40.method528(-14) * 64;
                        for (int var43 = 0; var43 < class187.field3037; var43++) {
                            class141 var48 = class42.field625[class292.field4668[var43]];
                            if (var48 != null && !var48.field1428 && var48.field1479) {
                                int var49 = var48.field1458 - (var48.field2421.field3537 - 1) * 64;
                                int var50 = -(var48.field2421.field3537 * 64) - (-var48.field1397 - 64);
                                if (var50 >= var41 && var48.field2421.field3537 <= (var40.method528(118) - (var50 - var41 >> 7)) && var49 >= var42 && var48.field2421.field3537 <= var40.method528(-32) - (var49 - var42 >> 7)) {
                                    class243.method1605(var48.field2421, var22, class292.field4668[var43], var19, -26647);
                                    var48.field1428 = true;
                                }
                            }
                        }
                        for (int var44 = 0; var44 < class157.field2624; var44++) {
                            class288 var45 = class105.field1874[class280.field4458[var44]];
                            if (var45 != null && !var45.field1428 && var40 != var45 && var45.field1479) {
                                int var46 = var45.field1397 - ((var45.method528(-126) - 1) * 64);
                                int var47 = var45.field1458 - ((var45.method528(121) - 1) * 64);
                                if (var46 >= var41 && var45.method528(0) <= (var40.method528(28) - (var46 - var41 >> 7)) && var42 <= var47 && var45.method528(122) <= var40.method528(122) - (var47 - var42 >> 7)) {
                                    class50.method310(-20, class280.field4458[var44], var22, var45, var19);
                                    var45.field1428 = true;
                                }
                            }
                        }
                    }
                    if (var40.field1428) {
                        continue;
                    }
                    class50.method310(-127, var20, var22, var40, var19);
                    var40.field1428 = true;
                }
                if (var21 == 3) {
                    class60 var51 = class255.field4163[class176.field2886][var19][var22];
                    if (var51 != null) {
                        for (class58 var52 = (class58) var51.method376((byte) 93); var52 != null; var52 = (class58) var51.method372(-120)) {
                            int var53 = var52.field1019.field2460;
                            class199 var54 = class203.method1346(-1, var53);
                            if (class183.field2976 == 1) {
                                class37.method247((long) var53, class45.field631, class258.field4208 + " -> <col=ff9040>" + var54.field3216, 10032, var19, class256.field4179, (short) 51, var22);
                                class109.field1965++;
                            } else if (class76.field1241) {
                                class2 var59 = class183.field2983 == -1 ? null : class119.method816(class183.field2983, (byte) 109);
                                if ((class176.field2898 & 0x1) != 0 && (var59 == null || var54.method1321((byte) -105, var59.field25, class183.field2983) != var59.field25)) {
                                    class189.field3065++;
                                    class37.method247((long) var53, class6.field67, class253.field4145 + " -> <col=ff9040>" + var54.field3216, 10032, var19, class158.field2640, (short) 17, var22);
                                }
                            } else {
                                class154.field2582++;
                                String[] var55 = var54.field3286;
                                if (class29.field433) {
                                    var55 = class285.method1903(var55, !arg5);
                                }
                                for (int var56 = 4; var56 >= 0; var56--) {
                                    if (var55 != null && var55[var56] != null) {
                                        class6.field83++;
                                        byte var57 = 0;
                                        if (var56 == 0) {
                                            var57 = 38;
                                        }
                                        if (var56 == 1) {
                                            var57 = 30;
                                        }
                                        int var58 = -1;
                                        if (var56 == 2) {
                                            var57 = 58;
                                        }
                                        if (var54.field3256 == var56) {
                                            var58 = var54.field3270;
                                        }
                                        if (var56 == 3) {
                                            var57 = 34;
                                        }
                                        if (var54.field3232 == var56) {
                                            var58 = var54.field3251;
                                        }
                                        if (var56 == 4) {
                                            var57 = 14;
                                        }
                                        class37.method247((long) var53, var55[var56], "<col=ff9040>" + var54.field3216, 10032, var19, var58, var57, var22);
                                    }
                                }
                                class37.method247((long) var53, class277.field4436, "<col=ff9040>" + var54.field3216, 10032, var19, class293.field4678, (short) 1005, var22);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Z)V")
    public static void method75(boolean arg0) {
        field171 = null;
        if (arg0) {
            field168 = null;
        }
        field169 = null;
        field173 = null;
        field168 = null;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)Lda;")
    public static final class197 method76(int arg0) {
        field167++;
        int var1 = field168[0] * class110.field1983[0];
        if (arg0 != 255) {
            return null;
        }
        byte[] var2 = class199.field3226[0];
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class54.field941[class113.method791(var2[var4], 255)];
        }
        class197 var5 = new class197(class79.field1365, class9.field116, class112.field2028[0], class213.field3588[0], class110.field1983[0], field168[0], var3);
        class253.method1679((byte) -95);
        return var5;
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "()V")
    public class12() {
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lpc;)V")
    public class12(class12 arg0) {
        this.field170 = arg0.field170;
        this.field174 = arg0.field174;
        this.field176 = arg0.field176;
        this.field175 = arg0.field175;
    }
}
