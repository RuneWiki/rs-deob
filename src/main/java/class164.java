import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class164 {

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
    public static int field2737 = 0;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "Ljava/lang/String;")
    public static String field2735 = "Allocating memory";

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "[I")
    public static int[] field2736 = new int[2];

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "Ldb;")
    public static class102 field2742 = new class102(4);

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "F")
    public static float field2732;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
    public static int field2730;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
    public static int field2734;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
    public static int field2738;

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "Lak;")
    public static class172 field2731;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "[I")
    public static int[] field2733;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(BI)V", line = 10)
    public static final void method1204(byte arg0, int arg1) {
        class274.field4416 = -1;
        field2734++;
        class100.field1466 = false;
        class291.field4652 = 0;
        class67.field962 = -1;
        class325.field5040 = null;
        if (arg0 == 15) {
            class281.field4529 = arg1;
            class286.field4586 = 1;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lak;B)V", line = 30)
    public static final void method1205(class172 arg0, byte arg1) {
        field2740++;
        class39.field509 = arg0;
        if (arg1 != 27) {
            method1206(112, 12, 118, -61, (class7) null, (class7) null, -22, 6, -37L);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIILj;Lj;IIJ)V", line = 41)
    public static final void method1206(int arg0, int arg1, int arg2, int arg3, class7 arg4, class7 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class225 var10 = new class225();
        var10.field3595 = arg8;
        var10.field3593 = arg1 * 128 + 64;
        var10.field3596 = arg2 * 128 + 64;
        var10.field3605 = arg3;
        var10.field3599 = arg4;
        var10.field3594 = arg5;
        var10.field3597 = arg6;
        var10.field3602 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class324.field5032[var11][arg1][arg2] == null) {
                class324.field5032[var11][arg1][arg2] = new class204(var11, arg1, arg2);
            }
        }
        class324.field5032[arg0][arg1][arg2].field3364 = var10;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)V", line = 67)
    public static final void method1207(byte arg0) {
        class158.field2613.method707(0);
        class112.field1708.method707(0);
        class51.field727.method707(0);
        field2741++;
        if (arg0 != 114) {
            field2733 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(B)V", line = 82)
    public static void method1208(byte arg0) {
        field2742 = null;
        field2735 = null;
        field2736 = null;
        if (arg0 <= -15) {
            field2733 = null;
            field2731 = null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)Z", line = 113)
    public static final boolean method1209(int arg0, int arg1) {
        class339 var2 = class105.method719(arg0 - 1654, arg1);
        field2730++;
        if (var2 == null) {
            return false;
        } else if (arg0 != 1768) {
            return true;
        } else if (class124.field1933 == 1 || class124.field1933 == 2 || class122.field1909 == 2) {
            class21.field306 = var2.field5281;
            if (class122.field1909 != 0) {
                class165.field2755 = class21.field306 + 50000;
                class109.field1625 = class21.field306 + 40000;
                class288.field4613 = class109.field1625;
            }
            class34.field451 = var2.field5284;
            return true;
        } else {
            String var3 = "";
            String var4 = "";
            if (class122.field1909 != 0) {
                var3 = ":" + (var2.field5281 + 7000);
            }
            if (class13.field154 != null) {
                var4 = "/p=" + class13.field154;
            }
            String var5 = "http://" + var2.field5284 + var3 + "/l=" + class8.field121 + "/a=" + class44.field594 + var4 + "/j" + (class102.field1494 ? "1" : "0") + ",o" + (class34.field459 ? "1" : "0") + ",a2,m" + (class64.field930 ? "1" : "0");
            try {
                class341.field5296.getAppletContext().showDocument(new URL(var5), "_self");
                return true;
            } catch (Exception var7) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "(B)V", line = 160)
    public static final void method1210(byte arg0) {
        class202.field3307.method702((byte) 123);
        if (arg0 != 68) {
            field2733 = (int[]) null;
        }
        field2738++;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIIIII)V", line = 172)
    public static final void method1211(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class8.field119 == 0) {
            int var7 = class74.field1050;
            int var8 = class99.field1443;
            int var9 = class207.field3414;
            int var10 = class100.field1458;
            int var11 = (arg3 - arg2) * (var9 - var10) / arg5 + var10;
            int var12 = (arg4 - arg0) * (var8 - var7) / arg6 + var7;
            if (class142.field2216 && (class158.field2615 & 0x40) != 0) {
                class157 var13 = class275.method1996(-107, class182.field3013, class311.field4851);
                if (var13 == null) {
                    class106.method733(-1);
                } else {
                    class20.method111(class141.field2204, var11, var12, " ->", (short) 40, class331.field5165, 1, 0L);
                }
            } else {
                if (class15.field169 == 1) {
                    class20.method111(class323.field5028, var11, var12, "", (short) 32, -1, 1, 0L);
                }
                class127.field1983++;
                class20.method111(class344.field5357, var11, var12, "", (short) 14, -1, 1, 0L);
            }
        }
        long var14 = -1L;
        if (arg1 != 79406247) {
            return;
        }
        for (int var16 = 0; var16 < class194.field3174; var16++) {
            long var17 = class205.field3366[var16];
            int var19 = (int) var17 >> 7 & 0x7F;
            int var20 = (int) var17 & 0x7F;
            int var21 = (int) var17 >> 29 & 0x3;
            int var22 = (int) (var17 >>> 32) & Integer.MAX_VALUE;
            if (var14 != var17) {
                var14 = var17;
                if (var21 == 2 && class168.method1225(class49.field698, var20, var19, var17)) {
                    class97 var23 = class69.method454(false, var22);
                    if (var23.field1387 != null) {
                        var23 = var23.method656((byte) 7);
                    }
                    if (var23 == null) {
                        continue;
                    }
                    if (class8.field119 == 1) {
                        class184.field3040++;
                        class20.method111(class64.field925, var19, var20, class229.field3644 + " -> <col=00ffff>" + var23.field1358, (short) 28, class223.field3562, 1, var17);
                    } else if (class142.field2216) {
                        class168 var24 = class301.field4728 == -1 ? null : class36.method194(class301.field4728, arg1 - 79425622);
                        if ((class158.field2615 & 0x4) != 0 && (var24 == null || var23.method660(var24.field2773, class301.field4728, arg1 ^ 0x4BBA486) != var24.field2773)) {
                            class20.method111(class141.field2204, var19, var20, class200.field3247 + " -> <col=00ffff>" + var23.field1358, (short) 42, class331.field5165, 1, var17);
                            class281.field4525++;
                        }
                    } else {
                        class201.field3264++;
                        String[] var25 = var23.field1373;
                        if (class60.field840) {
                            var25 = class153.method1107(var25, -118);
                        }
                        if (var25 != null) {
                            for (int var26 = 4; var26 >= 0; var26--) {
                                if (var25[var26] != null) {
                                    short var27 = 0;
                                    if (var26 == 0) {
                                        var27 = 6;
                                    }
                                    int var28 = -1;
                                    class98.field1391++;
                                    if (var26 == 1) {
                                        var27 = 25;
                                    }
                                    if (var26 == 2) {
                                        var27 = 48;
                                    }
                                    if (var26 == 3) {
                                        var27 = 33;
                                    }
                                    if (var26 == 4) {
                                        var27 = 1007;
                                    }
                                    if (var23.field1362 == var26) {
                                        var28 = var23.field1334;
                                    }
                                    if (var23.field1336 == var26) {
                                        var28 = var23.field1388;
                                    }
                                    class20.method111(var25[var26], var19, var20, "<col=00ffff>" + var23.field1358, var27, var28, 1, var17);
                                }
                            }
                        }
                        class20.method111(class63.field918, var19, var20, "<col=00ffff>" + var23.field1358, (short) 1001, class227.field3622, 1, (long) var23.field1345);
                    }
                }
                if (var21 == 1) {
                    class234 var29 = class99.field1445[var22];
                    if ((var29.field3752.field4051 & 0x1) == 0 && (var29.field4255 & 0x7F) == 0 && (var29.field4264 & 0x7F) == 0 || (var29.field3752.field4051 & 0x1) == 1 && (var29.field4255 & 0x7F) == 64 && (var29.field4264 & 0x7F) == 64) {
                        int var30 = var29.field4255 + 64 - (var29.field3752.field4051 * 64);
                        int var31 = var29.field4264 + 64 - (var29.field3752.field4051 * 64);
                        for (int var32 = 0; var32 < class233.field3736; var32++) {
                            class234 var33 = class99.field1445[class142.field2225[var32]];
                            if (var33 != null && !var33.field4259 && var29 != var33 && var33.field4229) {
                                int var34 = var33.field4264 - (var33.field3752.field4051 * 64 - 64);
                                int var35 = var33.field4255 - (var33.field3752.field4051 - 1) * 64;
                                if (var30 <= var35 && var29.field3752.field4051 - (var35 - var30 >> 7) >= var33.field3752.field4051 && var34 >= var31 && var33.field3752.field4051 <= var29.field3752.field4051 - (var34 - var31 >> 7)) {
                                    class105.method715(var19, var20, arg1 - 79406137, class142.field2225[var32], var33.field3752);
                                    var33.field4259 = true;
                                }
                            }
                        }
                        for (int var36 = 0; var36 < class275.field4435; var36++) {
                            class334 var37 = class74.field1049[class160.field2656[var36]];
                            if (var37 != null && !var37.field4259 && var37.field4229) {
                                int var38 = var37.field4255 + 64 - var37.method1881(-20395) * 64;
                                int var39 = var37.field4264 - (var37.method1881(-20395) - 1) * 64;
                                if (var30 <= var38 && var37.method1881(-20395) <= (var29.field3752.field4051 - (var38 - var30 >> 7)) && var39 >= var31 && var37.method1881(-20395) <= (var29.field3752.field4051 - (var39 - var31 >> 7))) {
                                    class79.method541(var19, var37, var20, class160.field2656[var36], (byte) 96);
                                    var37.field4259 = true;
                                }
                            }
                        }
                    }
                    if (var29.field4259) {
                        continue;
                    }
                    class105.method715(var19, var20, arg1 ^ 0x4BBA4EC, var22, var29.field3752);
                    var29.field4259 = true;
                }
                if (var21 == 0) {
                    class334 var40 = class74.field1049[var22];
                    if ((var40.field4255 & 0x7F) == 64 && (var40.field4264 & 0x7F) == 64) {
                        int var41 = var40.field4255 + 64 - (var40.method1881(-20395) * 64);
                        int var42 = var40.field4264 + 64 - var40.method1881(-20395) * 64;
                        for (int var43 = 0; var43 < class233.field3736; var43++) {
                            class234 var44 = class99.field1445[class142.field2225[var43]];
                            if (var44 != null && !var44.field4259 && var44.field4229) {
                                int var45 = -(var44.field3752.field4051 * 64) - (-var44.field4255 - 64);
                                int var46 = var44.field4264 - ((var44.field3752.field4051 - 1) * 64);
                                if (var45 >= var41 && var44.field3752.field4051 <= (var40.method1881(arg1 ^ 0xFB4414F2) - (var45 - var41 >> 7)) && var46 >= var42 && var44.field3752.field4051 <= (var40.method1881(arg1 ^ 0xFB4414F2) - (var46 - var42 >> 7))) {
                                    class105.method715(var19, var20, 126, class142.field2225[var43], var44.field3752);
                                    var44.field4259 = true;
                                }
                            }
                        }
                        for (int var47 = 0; var47 < class275.field4435; var47++) {
                            class334 var48 = class74.field1049[class160.field2656[var47]];
                            if (var48 != null && !var48.field4259 && var40 != var48 && var48.field4229) {
                                int var49 = var48.field4255 + 64 - (var48.method1881(-20395) * 64);
                                int var50 = var48.field4264 + 64 - (var48.method1881(-20395) * 64);
                                if (var49 >= var41 && var48.method1881(-20395) <= var40.method1881(arg1 ^ 0xFB4414F2) - (var49 - var41 >> 7) && var50 >= var42 && var48.method1881(-20395) <= var40.method1881(-20395) - (var50 - var42 >> 7)) {
                                    class79.method541(var19, var48, var20, class160.field2656[var47], (byte) 111);
                                    var48.field4259 = true;
                                }
                            }
                        }
                    }
                    if (var40.field4259) {
                        continue;
                    }
                    class79.method541(var19, var40, var20, var22, (byte) 110);
                    var40.field4259 = true;
                }
                if (var21 == 3) {
                    class169 var51 = class108.field1593[class49.field698][var20][var19];
                    if (var51 != null) {
                        for (class185 var52 = (class185) var51.method1236((byte) -113); var52 != null; var52 = (class185) var51.method1239(-92)) {
                            int var53 = var52.field3064.field2020;
                            class330 var54 = class285.method2054(var53, 0);
                            if (class8.field119 == 1) {
                                class20.method111(class64.field925, var19, var20, class229.field3644 + " -> <col=ff9040>" + var54.field5135, (short) 35, class223.field3562, arg1 ^ 0x4BBA4A6, (long) var53);
                                class265.field4295++;
                            } else if (class142.field2216) {
                                class168 var59 = class301.field4728 == -1 ? null : class36.method194(class301.field4728, -19375);
                                if ((class158.field2615 & 0x1) != 0 && (var59 == null || var54.method2319(124, var59.field2773, class301.field4728) != var59.field2773)) {
                                    class105.field1543++;
                                    class20.method111(class141.field2204, var19, var20, class200.field3247 + " -> <col=ff9040>" + var54.field5135, (short) 1, class331.field5165, 1, (long) var53);
                                }
                            } else {
                                class214.field3498++;
                                String[] var55 = var54.field5152;
                                if (class60.field840) {
                                    var55 = class153.method1107(var55, -65);
                                }
                                for (int var56 = 4; var56 >= 0; var56--) {
                                    if (var55 != null && var55[var56] != null) {
                                        class327.field5047++;
                                        byte var57 = 0;
                                        if (var56 == 0) {
                                            var57 = 4;
                                        }
                                        int var58 = -1;
                                        if (var56 == 1) {
                                            var57 = 5;
                                        }
                                        if (var56 == 2) {
                                            var57 = 37;
                                        }
                                        if (var54.field5091 == var56) {
                                            var58 = var54.field5159;
                                        }
                                        if (var54.field5154 == var56) {
                                            var58 = var54.field5122;
                                        }
                                        if (var56 == 3) {
                                            var57 = 23;
                                        }
                                        if (var56 == 4) {
                                            var57 = 39;
                                        }
                                        class20.method111(var55[var56], var19, var20, "<col=ff9040>" + var54.field5135, var57, var58, 1, (long) var53);
                                    }
                                }
                                class20.method111(class63.field918, var19, var20, "<col=ff9040>" + var54.field5135, (short) 1002, class227.field3622, 1, (long) var53);
                            }
                        }
                    }
                }
            }
        }
        field2739++;
    }
}
