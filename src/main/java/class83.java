import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class83 {

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "D")
    public static double field1236 = -1.0D;

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "Lik;")
    public static class259 field1241 = new class259(50);

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "I")
    public static int field1237;

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
    public static int field1238;

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "I")
    public static int field1240;

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "Lrb;")
    public static class221 field1242;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "Loj;")
    public static class325 field1235;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILnl;BI)V", line = 8)
    public static final void method596(int arg0, class30 arg1, byte arg2, int arg3) {
        if ((arg0 & 0x1) != 0) {
            int var4 = class267.field4132.method741(114);
            byte[] var5 = new byte[var4];
            class101 var6 = new class101(var5);
            class267.field4132.method770(var4, var5, -1127, 0);
            class138.field2193[arg3] = var6;
            arg1.method204((byte) 124, var6);
        }
        if ((arg0 & 0x8) != 0) {
            arg1.field1435 = class267.field4132.method731(false);
            arg1.field1460 = class267.field4132.method782(false);
        }
        field1237++;
        if ((arg0 & 0x100) != 0) {
            int var7 = class267.field4132.method782(false);
            if (var7 == 65535) {
                var7 = -1;
            }
            int var8 = class267.field4132.method756((byte) 84);
            boolean var9 = true;
            if (var7 != -1 && arg1.field1417 != -1 && class6.method28(class136.method1042((byte) 108, var7).field1477, 2).field4187 < class6.method28(class136.method1042((byte) 15, arg1.field1417).field1477, 2).field4187) {
                var9 = false;
            }
            if (var9) {
                arg1.field1370 = 1;
                arg1.field1417 = var7;
                arg1.field1449 = 0;
                arg1.field1446 = var8 >> 16;
                arg1.field1461 = (var8 & 0xFFFF) + class205.field3252;
                if (arg1.field1461 > class205.field3252) {
                    arg1.field1449 = -1;
                }
                arg1.field1440 = 0;
                if (arg1.field1417 != -1 && class205.field3252 == arg1.field1461) {
                    int var10 = class136.method1042((byte) 110, arg1.field1417).field1477;
                    if (var10 != -1) {
                        class269 var11 = class6.method28(var10, 2);
                        if (var11 != null && var11.field4183 != null) {
                            class89.method632(var11, arg1.field1442, (byte) 107, arg1.field1369, class19.field356 == arg1, 0);
                        }
                    }
                }
            }
        }
        if ((arg0 & 0x4) != 0) {
            int var12 = class267.field4132.method724(-1);
            if (var12 == 65535) {
                var12 = -1;
            }
            int var13 = class267.field4132.method769(-128);
            class284.method2013(-27735, var12, arg1, var13);
        }
        int var14 = 112 / ((55 - arg2) / 60);
        if ((arg0 & 0x400) != 0) {
            int var15 = class267.field4132.method738(-957401312);
            int var16 = class267.field4132.method769(-128);
            arg1.method646(class205.field3252, var15, var16, 27023);
        }
        if ((arg0 & 0x2) != 0) {
            arg1.field1451 = class267.field4132.method749((byte) -91);
            if (arg1.field1451.charAt(0) == '~') {
                arg1.field1451 = arg1.field1451.substring(1);
                class252.method1782(arg1.field1451, 2, arg1.method208((byte) 90), false);
            } else if (class19.field356 == arg1) {
                class252.method1782(arg1.field1451, 2, arg1.method208((byte) 105), false);
            }
            arg1.field1406 = 0;
            arg1.field1394 = 0;
            arg1.field1423 = 150;
        }
        if ((arg0 & 0x800) != 0) {
            int var17 = class267.field4132.method741(101);
            int[] var18 = new int[var17];
            int[] var19 = new int[var17];
            int[] var20 = new int[var17];
            for (int var21 = 0; var21 < var17; var21++) {
                int var22 = class267.field4132.method724(-1);
                if (var22 == 65535) {
                    var22 = -1;
                }
                var19[var21] = var22;
                var18[var21] = class267.field4132.method759(4087);
                var20[var21] = class267.field4132.method724(-1);
            }
            class243.method1725(var19, arg1, 0, var18, var20);
        }
        if ((arg0 & 0x10) != 0) {
            arg1.field1366 = class267.field4132.method782(false);
            if (arg1.field1366 == 65535) {
                arg1.field1366 = -1;
            }
        }
        if ((arg0 & 0x20) != 0) {
            int var23 = class267.field4132.method738(-957401312);
            int var24 = class267.field4132.method741(86);
            arg1.method646(class205.field3252, var23, var24, 27023);
            arg1.field1457 = class205.field3252 + 300;
            arg1.field1424 = class267.field4132.method746(-13551);
        }
        if ((arg0 & 0x80) != 0) {
            int var25 = class267.field4132.method782(false);
            int var26 = class267.field4132.method759(4087);
            int var27 = class267.field4132.method759(4087);
            int var28 = class267.field4132.field1667;
            boolean var29 = (var25 & 0x8000) != 0;
            if (arg1.field494 != null && arg1.field489 != null) {
                long var30 = class36.method281(56, arg1.field494);
                boolean var32 = false;
                if (var26 <= 1) {
                    if (!var29 && (class17.field322 && !class100.field1645 || class53.field833)) {
                        var32 = true;
                    } else {
                        for (int var33 = 0; var33 < class169.field2631; var33++) {
                            if (class298.field4712[var33] == var30) {
                                var32 = true;
                                break;
                            }
                        }
                    }
                }
                if (!var32 && class64.field1013 == 0) {
                    int var34 = -1;
                    class180.field2877.field1667 = 0;
                    class267.field4132.method742(var27, -128, 0, class180.field2877.field1661);
                    class180.field2877.field1667 = 0;
                    String var36;
                    if (var29) {
                        class230 var35 = class85.method608(class180.field2877, (byte) 99);
                        var34 = var35.field3659;
                        var25 &= 0x7FFF;
                        var36 = var35.field3662.method1585(class180.field2877, 3813);
                    } else {
                        var36 = class135.method1028(class16.method132((byte) 88, class289.method2032(class180.field2877, 1)));
                    }
                    arg1.field1451 = var36.trim();
                    arg1.field1406 = var25 >> 8;
                    arg1.field1423 = 150;
                    arg1.field1394 = var25 & 0xFF;
                    if (var26 == 2) {
                        class107.method818((byte) -26, (String) null, "<img=1>" + arg1.method208((byte) 113), var36, var29 ? 17 : 1, var34);
                    } else if (var26 == 1) {
                        class107.method818((byte) -26, (String) null, "<img=0>" + arg1.method208((byte) 110), var36, var29 ? 17 : 1, var34);
                    } else {
                        class107.method818((byte) -26, (String) null, arg1.method208((byte) 115), var36, var29 ? 17 : 2, var34);
                    }
                }
            }
            class267.field4132.field1667 = var27 + var28;
        }
        if ((arg0 & 0x200) == 0) {
            return;
        }
        arg1.field1436 = class267.field4132.method759(4087);
        arg1.field1371 = class267.field4132.method759(4087);
        arg1.field1411 = class267.field4132.method746(-13551);
        arg1.field1413 = class267.field4132.method746(-13551);
        arg1.field1415 = class267.field4132.method724(-1) + class205.field3252;
        arg1.field1376 = class267.field4132.method766(true) + class205.field3252;
        arg1.field1359 = class267.field4132.method759(4087);
        arg1.field1365 = 1;
        arg1.field1434 = 0;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIII)V", line = 295)
    public static final void method597(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != -27626) {
            return;
        }
        field1240++;
        if (class265.field4126) {
            class262.method1865(arg4, arg3, arg1 + arg4, arg0 + arg3);
            class262.method1855(arg4, arg3, arg1, arg0, 0);
        } else {
            class182.method1358(arg4, arg3, arg1 + arg4, arg3 - -arg0);
            class182.method1360(arg4, arg3, arg1, arg0, 0);
        }
        if (class78.field1183 < 100) {
            return;
        }
        if (class145.field2280 == null || class145.field2280.field2007 != arg1 || class145.field2280.field2011 != arg0) {
            class7 var5 = new class7(arg1, arg0);
            class182.method1371(var5.field117, arg1, arg0);
            class196.method1432(arg0, class279.field4316, 0, class79.field1208, 0, arg1, 0, 14152, 0);
            if (class265.field4126) {
                class145.field2280 = new class105(var5);
            } else {
                class145.field2280 = var5;
            }
            if (class265.field4126) {
                class182.field2913 = null;
            } else {
                class222.field3556.method1503(32);
            }
        }
        class145.field2280.method51(arg4, arg3);
        int var6 = class137.field2182 * arg1 / class79.field1208 + arg4;
        int var7 = class277.field4286 * arg0 / class279.field4316 + arg3;
        int var8 = class317.field4939 * arg0 / class279.field4316;
        int var9 = class222.field3553 * arg1 / class79.field1208;
        int var10 = 16711680;
        if (class141.field2241 == 1) {
            var10 = 16777215;
        }
        if (class265.field4126) {
            class262.method1858(var6, var7, var9, var8, var10, 128);
            class262.method1854(var6, var7, var9, var8, var10);
        } else {
            class182.method1372(var6, var7, var9, var8, var10, 128);
            class182.method1364(var6, var7, var9, var8, var10);
        }
        if (field1238 <= 0) {
            return;
        }
        int var11;
        if (class87.field1328 <= 10) {
            var11 = class87.field1328 * 25;
        } else {
            var11 = (20 - class87.field1328) * 25;
        }
        for (class26 var12 = (class26) class219.field3499.method1490(arg2 + 27826); var12 != null; var12 = (class26) class219.field3499.method1487((byte) 117)) {
            if (class17.field325 == var12.field437) {
                int var13 = var12.field438 * arg1 / class79.field1208 + arg4;
                int var14 = var12.field430 * arg0 / class279.field4316 + arg3;
                if (class265.field4126) {
                    class262.method1858(var13 - 2, var14 + -2, 4, 4, 16776960, var11);
                } else {
                    class182.method1372(var13 - 2, var14 - 2, 4, 4, 16776960, var11);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V", line = 399)
    public static void method598(int arg0) {
        if (arg0 <= -75) {
            field1241 = null;
            field1242 = null;
            field1235 = null;
        }
    }
}
