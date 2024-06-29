import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ow")
public class class316 {

    @OriginalMember(owner = "client!ow", name = "b", descriptor = "Ljava/lang/String;")
    public static String field4350 = null;

    @OriginalMember(owner = "client!ow", name = "c", descriptor = "Lgo;")
    public static class581 field4351 = new class581(11, 0, 1, 2);

    @OriginalMember(owner = "client!ow", name = "e", descriptor = "Z")
    public static boolean field4353 = false;

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "I")
    public static int field4349;

    @OriginalMember(owner = "client!ow", name = "d", descriptor = "I")
    public static int field4352;

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(IILr;I)V")
    public static final void method1910(int arg0, int arg1, class166 arg2, int arg3) {
        field4349++;
        if (arg0 < 0 || arg1 < 0 || class239.field3283 == 0 || class610.field8462 == 0) {
            return;
        }
        arg2.method161(class521.field7093, class611.field8476, class239.field3283, class610.field8462);
        arg2.method200(class546.field7398, class467.field6425, class239.field3283, class610.field8462);
        class392 var4 = arg2.method168();
        var4.method680(class15.field154, class34.field419, class91.field1318, class567.field7997, class285.field3916, class384.field5456);
        arg2.method93(var4);
        if (class497.field6766 != null) {
            int var5 = -1;
            int var6 = -1;
            int var7 = arg2.method133();
            int var8 = (arg0 - class521.field7093) * var7 / class239.field3283;
            int var9 = (arg1 - class611.field8476) * var7 / class610.field8462;
            int var10 = arg2.method142();
            int var11 = (arg0 - class521.field7093) * var10 / class239.field3283;
            int var12 = (arg1 - class611.field8476) * var10 / class610.field8462;
            int[] var13 = new int[] { var8, var9, var7 };
            var4.method677(var13);
            int[] var14 = new int[] { var11, var12, var10 };
            var4.method677(var14);
            float var15 = 0.0F;
            int var16 = var14[0] - var13[0];
            int var17 = var14[1] - var13[1];
            int var18 = var14[2] - var13[2];
            while (var15 < 1.0F) {
                int var19 = (int) ((float) var16 * var15 + (float) var13[0]);
                int var20 = var19 >> 9;
                int var21 = (int) ((float) var18 * var15 + (float) var13[2]);
                int var22 = var21 >> 9;
                if (var20 > 0 && var22 > 0 && class401.field5620 > var20 && class257.field3508 > var22) {
                    int var23 = class143.field2063.field4053;
                    if (var23 < 3 && (class492.field6720[1][var20][var22] & 0x2) != 0) {
                        var23++;
                    }
                    if ((float) class497.field6766[var23].method331(var21, (byte) 50, var19) < (float) var17 * var15 + (float) var13[1]) {
                        var5 = (class143.field2063.method881(-126) - 1 << 8) + var19 >> 9;
                        var6 = var21 + (class143.field2063.method881(-112) - 1 << 8) >> 9;
                        break;
                    }
                }
                var15 = (float) ((double) var15 + 0.01D);
            }
            if (var5 != -1 && var6 != -1) {
                if (class426.field5971 && (class89.field1283 & 0x40) != 0) {
                    class78 var24 = class89.method650(115, class340.field4555, class544.field7389);
                    if (var24 == null) {
                        class114.method820((byte) -113);
                    } else {
                        class547.method3077(9, var6, class178.field2551, class547.field7417, false, true, " ->", 0L, -71, var5, -1);
                    }
                } else {
                    if (class501.field6866) {
                        class547.method3077(4, var6, class65.field815.method555(class697.field9900, true), -1, false, true, "", 0L, -99, var5, -1);
                    }
                    class547.method3077(23, var6, class594.field8313, class203.field2864, false, true, "", 0L, -62, var5, -1);
                    class572.field8107++;
                }
            }
        }
        class693 var25 = class300.field4089;
        if (arg3 <= 56) {
            method1911(null, null, -59, 54);
        }
        for (class614 var26 = (class614) var25.method3898((byte) -72); var26 != null; var26 = (class614) var25.method3902(true)) {
            if ((class666.field9333 || class143.field2063.field4053 == var26.field8573.field4053) && var26.method3434(arg2, arg1, (byte) 49, arg0)) {
                boolean var27 = false;
                boolean var28 = false;
                int var29;
                int var30;
                if (var26.field8573 instanceof class210) {
                    var29 = ((class210) var26.field8573).field2972;
                    var30 = ((class210) var26.field8573).field2963;
                } else {
                    var30 = var26.field8573.field4047 >> 9;
                    var29 = var26.field8573.field4042 >> 9;
                }
                if (var26.field8573 instanceof class677) {
                    class677 var31 = (class677) var26.field8573;
                    int var32 = var31.method881(-111);
                    if ((var32 & 0x1) == 0 && (var31.field4042 & 0x1FF) == 0 && (var31.field4047 & 0x1FF) == 0 || (var32 & 0x1) == 1 && (var31.field4042 & 0x1FF) == 256 && (var31.field4047 & 0x1FF) == 256) {
                        int var33 = var31.field4042 - (var31.method881(-123) - 1 << 8);
                        int var34 = var31.field4047 - (var31.method881(-127) - 1 << 8);
                        for (int var35 = 0; var35 < class698.field9912; var35++) {
                            class393 var42 = (class393) class299.field4071.method970((byte) 89, (long) class636.field8790[var35]);
                            if (var42 != null) {
                                class61 var43 = var42.field5552;
                                if (class186.field2697 != var43.field1783 && var43.field1764) {
                                    int var44 = var43.field4042 - (var43.field674.field8041 - 1 << 8);
                                    int var45 = var43.field4047 - (var43.field674.field8041 - 1 << 8);
                                    if (var33 <= var44 && var43.field674.field8041 <= (var31.method881(-108) - (var44 - var33 >> 9)) && var45 >= var34 && var43.field674.field8041 <= var31.method881(-121) - (var45 - var34 >> 9)) {
                                        class563.method3150(class143.field2063.field4053 != var26.field8573.field4053, (byte) -46, var43);
                                        var43.field1783 = class186.field2697;
                                    }
                                }
                            }
                        }
                        int var36 = class528.field7160;
                        int[] var37 = class439.field6091;
                        for (int var38 = 0; var38 < var36; var38++) {
                            class677 var39 = class671.field9407[var37[var38]];
                            if (var39 != null && class186.field2697 != var39.field1783 && var31 != var39 && var39.field1764) {
                                int var40 = var39.field4042 - (var39.method881(-119) - 1 << 8);
                                int var41 = var39.field4047 - (var39.method881(-112) - 1 << 8);
                                if (var33 <= var40 && var39.method881(-122) <= var31.method881(-115) - (var40 - var33 >> 9) && var41 >= var34 && var39.method881(-128) <= var31.method881(-117) - (var41 - var34 >> 9)) {
                                    class620.method3446(var39, (byte) 86, class143.field2063.field4053 != var26.field8573.field4053);
                                    var39.field1783 = class186.field2697;
                                }
                            }
                        }
                    }
                    if (class186.field2697 == var31.field1783) {
                        continue;
                    }
                    class620.method3446(var31, (byte) 119, class143.field2063.field4053 != var26.field8573.field4053);
                    var31.field1783 = class186.field2697;
                }
                if (var26.field8573 instanceof class61) {
                    class61 var46 = (class61) var26.field8573;
                    if (var46.field674 != null) {
                        if ((var46.field674.field8041 & 0x1) == 0 && (var46.field4042 & 0x1FF) == 0 && (var46.field4047 & 0x1FF) == 0 || (var46.field674.field8041 & 0x1) == 1 && (var46.field4042 & 0x1FF) == 256 && (var46.field4047 & 0x1FF) == 256) {
                            int var47 = var46.field4042 - (var46.field674.field8041 - 1 << 8);
                            int var48 = var46.field4047 - (var46.field674.field8041 - 1 << 8);
                            for (int var49 = 0; var49 < class698.field9912; var49++) {
                                class393 var56 = (class393) class299.field4071.method970((byte) 89, (long) class636.field8790[var49]);
                                if (var56 != null) {
                                    class61 var57 = var56.field5552;
                                    if (class186.field2697 != var57.field1783 && var46 != var57 && var57.field1764) {
                                        int var58 = var57.field4042 - (var57.field674.field8041 - 1 << 8);
                                        int var59 = var57.field4047 - (var57.field674.field8041 - 1 << 8);
                                        if (var58 >= var47 && var57.field674.field8041 <= var46.field674.field8041 - (var58 - var47 >> 9) && var59 >= var48 && (var46.field674.field8041 - (var59 - var48 >> 9)) >= var57.field674.field8041) {
                                            class563.method3150(class143.field2063.field4053 != var26.field8573.field4053, (byte) -107, var57);
                                            var57.field1783 = class186.field2697;
                                        }
                                    }
                                }
                            }
                            int var50 = class528.field7160;
                            int[] var51 = class439.field6091;
                            for (int var52 = 0; var52 < var50; var52++) {
                                class677 var53 = class671.field9407[var51[var52]];
                                if (var53 != null && class186.field2697 != var53.field1783 && var53.field1764) {
                                    int var54 = var53.field4042 - (var53.method881(-117) - 1 << 8);
                                    int var55 = var53.field4047 - (var53.method881(-121) - 1 << 8);
                                    if (var54 >= var47 && var53.method881(-114) <= (var46.field674.field8041 - (var54 - var47 >> 9)) && var48 <= var55 && var53.method881(-126) <= (var46.field674.field8041 - (var55 - var48 >> 9))) {
                                        class620.method3446(var53, (byte) -80, class143.field2063.field4053 != var26.field8573.field4053);
                                        var53.field1783 = class186.field2697;
                                    }
                                }
                            }
                        }
                        if (class186.field2697 == var46.field1783) {
                            continue;
                        }
                        class563.method3150(class143.field2063.field4053 != var26.field8573.field4053, (byte) -85, var46);
                        var46.field1783 = class186.field2697;
                    }
                }
                if (var26.field8573 instanceof class558) {
                    int var60 = class498.field6774 + var29;
                    int var61 = class613.field8555 + var30;
                    class385 var62 = (class385) class687.field9801.method970((byte) 89, (long) (var60 | var26.field8573.field4053 << 28 | var61 << 14));
                    if (var62 != null) {
                        for (class623 var63 = (class623) var62.field5460.method1433(true); var63 != null; var63 = (class623) var62.field5460.method1440(107)) {
                            class661 var64 = class599.field8366.method3949(0, var63.field8646);
                            if (class426.field5971 && class143.field2063.field4053 == var26.field8573.field4053) {
                                class488 var65 = class698.field9905 == -1 ? null : class71.field952.method1977((byte) 58, class698.field9905);
                                if ((class89.field1283 & 0x1) != 0 && (var65 == null || var64.method3729(-125, var65.field6697, class698.field9905) != var65.field6697)) {
                                    class547.method3077(44, var30, class178.field2551, class547.field7417, false, true, class185.field2679 + " -> <col=ff9040>" + var64.field9222, (long) var63.field8646, -91, var29, -1);
                                    class64.field768++;
                                }
                            }
                            if (class143.field2063.field4053 == var26.field8573.field4053) {
                                String[] var66 = var64.field9220;
                                for (int var67 = 4; var67 >= 0; var67--) {
                                    if (var66 != null && var66[var67] != null) {
                                        byte var68 = 0;
                                        if (var67 == 0) {
                                            var68 = 8;
                                        }
                                        int var69 = class76.field1005;
                                        if (var67 == 1) {
                                            var68 = 19;
                                        }
                                        if (var67 == 2) {
                                            var68 = 16;
                                        }
                                        if (var67 == 3) {
                                            var68 = 60;
                                        }
                                        if (var67 == 4) {
                                            var68 = 25;
                                        }
                                        if (var64.field9189 == var67) {
                                            var69 = var64.field9214;
                                        }
                                        if (var64.field9187 == var67) {
                                            var69 = var64.field9230;
                                        }
                                        class210.field2971++;
                                        class547.method3077(var68, var30, var66[var67], var69, false, true, "<col=ff9040>" + var64.field9222, (long) var63.field8646, -103, var29, -1);
                                    }
                                }
                            }
                            class118.field1599++;
                            class547.method3077(1006, var30, class65.field810.method555(class697.field9900, true), class180.field2610, class143.field2063.field4053 != var26.field8573.field4053, true, "<col=ff9040>" + var64.field9222, (long) var63.field8646, -94, var29, -1);
                        }
                    }
                }
                if (var26.field8573 instanceof class526) {
                    class526 var70 = (class526) var26.field8573;
                    class301 var71 = class475.field6543.method2685(var70.method211((byte) -109), -69);
                    if (var71.field4113 != null) {
                        var71 = var71.method1833(-116, class578.field8156);
                    }
                    if (var71 != null) {
                        if (class426.field5971 && class143.field2063.field4053 == var26.field8573.field4053) {
                            class488 var72 = class698.field9905 == -1 ? null : class71.field952.method1977((byte) 58, class698.field9905);
                            if ((class89.field1283 & 0x4) != 0 && (var72 == null || var71.method1830(class698.field9905, 123, var72.field6697) != var72.field6697)) {
                                class547.method3077(59, var30, class178.field2551, class547.field7417, false, true, class185.field2679 + " -> <col=00ffff>" + var71.field4194, class503.method2883(var29, (byte) -88, var70, var30), -113, var29, -1);
                                class89.field1282++;
                            }
                        }
                        if (class143.field2063.field4053 == var26.field8573.field4053) {
                            String[] var73 = var71.field4179;
                            if (var73 != null) {
                                for (int var74 = 4; var74 >= 0; var74--) {
                                    if (var73[var74] != null) {
                                        short var75 = 0;
                                        int var76 = class76.field1005;
                                        if (var74 == 0) {
                                            var75 = 46;
                                        }
                                        if (var74 == 1) {
                                            var75 = 30;
                                        }
                                        if (var74 == 2) {
                                            var75 = 50;
                                        }
                                        if (var74 == 3) {
                                            var75 = 11;
                                        }
                                        if (var74 == 4) {
                                            var75 = 1003;
                                        }
                                        if (var71.field4152 == var74) {
                                            var76 = var71.field4127;
                                        }
                                        if (var71.field4138 == var74) {
                                            var76 = var71.field4168;
                                        }
                                        class547.method3077(var75, var30, var73[var74], var76, false, true, "<col=00ffff>" + var71.field4194, class503.method2883(var29, (byte) -88, var70, var30), -121, var29, -1);
                                        class274.field3766++;
                                    }
                                }
                            }
                        }
                        class547.method3077(1010, var30, class65.field810.method555(class697.field9900, true), class180.field2610, class143.field2063.field4053 != var26.field8573.field4053, true, "<col=00ffff>" + var71.field4194, (long) var71.field4131, -121, var29, -1);
                        class611.field8472++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(Llaa;Ljava/lang/String;II)Lkl;")
    public static final class70 method1911(class105 arg0, String arg1, int arg2, int arg3) {
        field4352++;
        if (arg3 == 0) {
            return arg0.method770(arg1, 30614);
        } else if (arg3 == 1) {
            try {
                class204.method1330(31845, new Object[] { (new URL(class59.field668.getCodeBase(), arg1)).toString() }, class59.field668, "openjs");
                class70 var4 = new class70();
                var4.field948 = 1;
                return var4;
            } catch (Throwable var10) {
                class70 var5 = new class70();
                var5.field948 = 2;
                return var5;
            }
        } else if (arg3 == 2) {
            try {
                class59.field668.getAppletContext().showDocument(new URL(class59.field668.getCodeBase(), arg1), "_blank");
                class70 var6 = new class70();
                var6.field948 = 1;
                return var6;
            } catch (Exception var11) {
                class70 var7 = new class70();
                var7.field948 = 2;
                return var7;
            }
        } else if (arg3 == 3) {
            try {
                class204.method1329((byte) -57, class59.field668, "loggedout");
            } catch (Throwable var13) {
            }
            try {
                class59.field668.getAppletContext().showDocument(new URL(class59.field668.getCodeBase(), arg1), "_top");
                class70 var8 = new class70();
                var8.field948 = 1;
                return var8;
            } catch (Exception var12) {
                class70 var9 = new class70();
                var9.field948 = 2;
                return var9;
            }
        } else if (arg2 == 32445) {
            throw new IllegalArgumentException();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(I)V")
    public static void method1912(int arg0) {
        field4351 = null;
        if (arg0 != 0) {
            method1912(65);
        }
        field4350 = null;
    }
}
