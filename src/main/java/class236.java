import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class236 extends class27 {

    @OriginalMember(owner = "client!vg", name = "s", descriptor = "Li;")
    private static class88 field4405 = class208.method1425(105, "Invalid username or password)3");

    @OriginalMember(owner = "client!vg", name = "o", descriptor = "Li;")
    public static class88 field4401 = field4405;

    @OriginalMember(owner = "client!vg", name = "t", descriptor = "Li;")
    private static class88 field4406 = class208.method1425(105, " ");

    @OriginalMember(owner = "client!vg", name = "n", descriptor = "Li;")
    public static class88 field4400 = field4406;

    @OriginalMember(owner = "client!vg", name = "r", descriptor = "Lid;")
    public static class92 field4404 = new class92(64);

    @OriginalMember(owner = "client!vg", name = "l", descriptor = "I")
    public static int field4398;

    @OriginalMember(owner = "client!vg", name = "q", descriptor = "I")
    public static int field4403;

    @OriginalMember(owner = "client!vg", name = "u", descriptor = "I")
    public static int field4407;

    @OriginalMember(owner = "client!vg", name = "v", descriptor = "I")
    public static int field4408;

    @OriginalMember(owner = "client!vg", name = "p", descriptor = "Lnb;")
    public static class144 field4402;

    @OriginalMember(owner = "client!vg", name = "m", descriptor = "Lgi;")
    public static class75 field4399;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V")
    public static final void method1566(int arg0) {
        field4407++;
        Object var1 = class33.field533;
        synchronized (class33.field533) {
            if (class225.field4233 != 0) {
                class225.field4233 = 1;
                try {
                    class33.field533.wait();
                } catch (InterruptedException var2) {
                }
            }
        }
        if (arg0 != 1) {
            method1566(-104);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIIIB)V")
    public static final void method1567(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field4408++;
        if (arg5 != 85) {
            method1569((byte) 82);
        }
        if (arg0 == arg4) {
            class230.method1534(arg3, arg0, arg2, arg1, (byte) 34);
        } else if (arg3 - arg0 >= class67.field1207 && class12.field183 >= arg0 + arg3 && arg2 - arg4 >= class49.field919 && class18.field279 >= arg2 + arg4) {
            class134.method894(arg3, arg0, (byte) 89, arg4, arg2, arg1);
        } else {
            class210.method1440(arg3, 3, arg4, arg2, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(Z)Z")
    public static final boolean method1568(boolean arg0) throws IOException {
        field4398++;
        if (class33.field556 == null) {
            return false;
        }
        int var1 = class33.field556.method911(1);
        if (var1 == 0) {
            return false;
        }
        if (class238.field4432 == -1) {
            var1--;
            class33.field556.method915(0, class230.field4314.field842, (byte) -93, 1);
            class230.field4314.field831 = 0;
            class238.field4432 = class230.field4314.method33((byte) -80);
            class228.field4272 = class15.field224[class238.field4432];
        }
        if (class228.field4272 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class33.field556.method915(0, class230.field4314.field842, (byte) -93, 1);
            var1--;
            class228.field4272 = class230.field4314.field842[0] & 0xFF;
        }
        if (class228.field4272 == -2) {
            if (var1 <= 1) {
                return false;
            }
            var1 -= 2;
            class33.field556.method915(0, class230.field4314.field842, (byte) -93, 2);
            class230.field4314.field831 = 0;
            class228.field4272 = class230.field4314.method301(76);
        }
        if (class228.field4272 > var1) {
            return false;
        }
        class230.field4314.field831 = 0;
        class33.field556.method915(0, class230.field4314.field842, (byte) -93, class228.field4272);
        class192.field3702 = 0;
        class88.field1634 = class46.field821;
        class46.field821 = class101.field1843;
        class101.field1843 = class238.field4432;
        if (class238.field4432 == 239) {
            int var2 = class230.field4314.method323((byte) -113);
            int var3 = class230.field4314.method323((byte) -53);
            class168 var4 = (class168) class128.field2397.method1051(-1, (long) var2);
            class168 var5 = (class168) class128.field2397.method1051(-1, (long) var3);
            if (var5 != null) {
                class93.method673((byte) -124, var5, var4 == null || var4.field3231 != var5.field3231);
            }
            if (var4 != null) {
                var4.method460(arg0);
                class128.field2397.method1054((long) var3, var4, -1);
            }
            class174 var6 = class239.method1581(-64, var2);
            if (var6 != null) {
                class200.method1373(65280, var6);
            }
            class174 var7 = class239.method1581(-64, var3);
            if (var7 != null) {
                class200.method1373(65280, var7);
                class110.method761(true, var7, (byte) -111);
            }
            if (class43.field723 != -1) {
                class137.method914(class43.field723, 1, 4);
            }
            class238.field4432 = -1;
            return true;
        } else if (class238.field4432 == 244) {
            int var8 = class230.field4314.method320(3);
            int var9 = class230.field4314.method339(2);
            int var10 = class230.field4314.method312((byte) 63);
            class174 var11 = class239.method1581(-64, var8);
            var11.field3453 = 0;
            var11.field3443 = var11.field3516 = var10;
            var11.field3369 = 0;
            var11.field3368 = var11.field3393 = var9;
            class200.method1373(65280, var11);
            class238.field4432 = -1;
            return true;
        } else if (class238.field4432 == 79) {
            class43.method278(false, (byte) -120);
            class238.field4432 = -1;
            return true;
        } else if (class238.field4432 == 12) {
            int var12 = class228.field4272 + class230.field4314.field831;
            int var13 = class230.field4314.method301(122);
            int var14 = class230.field4314.method301(123);
            if (class43.field723 != var13) {
                class43.field723 = var13;
                class149.method1007(class43.field723, -1);
                class192.method1336(86, false);
                class146.method974((byte) -113, class43.field723);
                for (int var15 = 0; var15 < 100; var15++) {
                    class225.field4230[var15] = true;
                }
            }
            while (var14-- > 0) {
                int var24 = class230.field4314.method323((byte) -103);
                int var25 = class230.field4314.method301(90);
                int var26 = class230.field4314.method347(26119);
                class168 var27 = (class168) class128.field2397.method1051(-1, (long) var24);
                if (var27 != null && var27.field3231 != var25) {
                    class93.method673((byte) -121, var27, true);
                    var27 = null;
                }
                if (var27 == null) {
                    var27 = class104.method722(var26, var24, var25, (byte) 105);
                }
                var27.field3237 = true;
            }
            for (class168 var16 = (class168) class128.field2397.method1049(0); var16 != null; var16 = (class168) class128.field2397.method1050((byte) -73)) {
                if (var16.field3237) {
                    var16.field3237 = false;
                } else {
                    class93.method673((byte) -117, var16, true);
                }
            }
            class31.field495 = new class154(512);
            while (class230.field4314.field831 < var12) {
                int var17 = class230.field4314.method323((byte) -32);
                int var18 = class230.field4314.method301(56);
                int var19 = class230.field4314.method301(20);
                int var20 = class230.field4314.method323((byte) -39);
                for (int var21 = var18; var21 <= var19; var21++) {
                    long var22 = ((long) var17 << 32) + (long) var21;
                    class31.field495.method1054(var22, new class192(var20), -1);
                }
            }
            class238.field4432 = -1;
            return true;
        } else if (class238.field4432 == 192) {
            class179.field3569 = true;
            class135.field2514 = class230.field4314.method347(26119);
            class171.field3329 = class230.field4314.method347(26119);
            class70.field1264 = class230.field4314.method301(89);
            class246.field4508 = class230.field4314.method347(26119);
            class160.field3095 = class230.field4314.method347(26119);
            if (class160.field3095 >= 100) {
                class184.field3610 = class171.field3329 * 128 + 64;
                class79.field1428 = class135.field2514 * 128 + 64;
                class108.field1956 = class239.method1586(class79.field1428, class184.field3610, 2, class149.field2909) - class70.field1264;
            }
            class238.field4432 = -1;
            return true;
        } else if (class238.field4432 == 186) {
            int var28 = class230.field4314.method323((byte) -103);
            int var29 = class230.field4314.method301(31);
            class174 var30;
            if (var28 < 0) {
                var30 = null;
            } else {
                var30 = class239.method1581(-64, var28);
            }
            if (var30 != null) {
                for (int var31 = 0; var31 < var30.field3390.length; var31++) {
                    var30.field3390[var31] = 0;
                    var30.field3476[var31] = 0;
                }
            }
            if (var28 < -70000) {
                var29 += 32768;
            }
            class4.method20(-2, var29);
            int var32 = class230.field4314.method301(67);
            for (int var33 = 0; var33 < var32; var33++) {
                int var34 = class230.field4314.method349(true);
                int var35 = class230.field4314.method352(24758);
                if (var35 == 255) {
                    var35 = class230.field4314.method299(80);
                }
                if (var30 != null && var30.field3390.length > var33) {
                    var30.field3390[var33] = var34;
                    var30.field3476[var33] = var35;
                }
                class177.method1270(1, var29, var35, var33, var34 - 1);
            }
            if (var30 != null) {
                class200.method1373(65280, var30);
            }
            class127.method869((byte) 125);
            class231.field4330[class70.method470(class223.field4200++, 31)] = class70.method470(32767, var29);
            class238.field4432 = -1;
            return true;
        } else if (class238.field4432 == 117) {
            class88 var36 = class230.field4314.method298(-128);
            if (var36.method631(0, class156.field3011)) {
                boolean var37 = false;
                class88 var38 = var36.method623(0, (byte) -118, var36.method617(-76, class109.field1961));
                long var39 = var38.method630(false);
                for (int var41 = 0; var41 < class67.field1221; var41++) {
                    if (class95.field1765[var41] == var39) {
                        var37 = true;
                        break;
                    }
                }
                if (!var37 && client.field563 == 0) {
                    class223.method1501(class54.field1007, 12, 4, var38);
                }
            } else if (var36.method631(0, class207.field3929)) {
                class88 var65 = var36.method623(0, (byte) -53, var36.method617(110, class109.field1961));
                boolean var66 = false;
                long var67 = var65.method630(!arg0);
                for (int var69 = 0; var69 < class67.field1221; var69++) {
                    if (class95.field1765[var69] == var67) {
                        var66 = true;
                        break;
                    }
                }
                if (!var66 && client.field563 == 0) {
                    class88 var70 = var36.method623(var36.method617(-106, class109.field1961) + 1, (byte) -89, var36.method604((byte) -53) - 9);
                    class223.method1501(var70, 12, 8, var65);
                }
            } else if (var36.method631(0, class86.field1556)) {
                boolean var42 = false;
                class88 var43 = var36.method623(0, (byte) -7, var36.method617(-60, class109.field1961));
                long var44 = var43.method630(false);
                for (int var46 = 0; var46 < class67.field1221; var46++) {
                    if (class95.field1765[var46] == var44) {
                        var42 = true;
                        break;
                    }
                }
                if (!var42 && client.field563 == 0) {
                    class223.method1501(class174.field3455, 12, 10, var43);
                }
            } else if (var36.method631(0, class172.field3336)) {
                class88 var64 = var36.method623(0, (byte) -92, var36.method617(-41, class172.field3336));
                class223.method1501(var64, 12, 11, class174.field3455);
            } else if (var36.method631(0, class43.field731)) {
                class88 var63 = var36.method623(0, (byte) -89, var36.method617(-63, class43.field731));
                if (client.field563 == 0) {
                    class223.method1501(var63, 12, 12, class174.field3455);
                }
            } else if (var36.method631(0, class128.field2402)) {
                class88 var47 = var36.method623(0, (byte) -34, var36.method617(99, class128.field2402));
                if (client.field563 == 0) {
                    class223.method1501(var47, 12, 13, class174.field3455);
                }
            } else if (var36.method631(0, class157.field3027)) {
                class88 var48 = var36.method623(0, (byte) -51, var36.method617(102, class109.field1961));
                long var49 = var48.method630(false);
                boolean var51 = false;
                for (int var52 = 0; var52 < class67.field1221; var52++) {
                    if (class95.field1765[var52] == var49) {
                        var51 = true;
                        break;
                    }
                }
                if (!var51 && client.field563 == 0) {
                    class223.method1501(class174.field3455, 12, 14, var48);
                }
            } else if (var36.method631(0, class228.field4277)) {
                class88 var53 = var36.method623(0, (byte) -118, var36.method617(-84, class109.field1961));
                long var54 = var53.method630(false);
                boolean var56 = false;
                for (int var57 = 0; var57 < class67.field1221; var57++) {
                    if (class95.field1765[var57] == var54) {
                        var56 = true;
                        break;
                    }
                }
                if (!var56 && client.field563 == 0) {
                    class223.method1501(class174.field3455, 12, 15, var53);
                }
            } else if (var36.method631(0, class37.field665)) {
                class88 var58 = var36.method623(0, (byte) -25, var36.method617(97, class109.field1961));
                long var59 = var58.method630(!arg0);
                boolean var61 = false;
                for (int var62 = 0; var62 < class67.field1221; var62++) {
                    if (class95.field1765[var62] == var59) {
                        var61 = true;
                        break;
                    }
                }
                if (!var61 && client.field563 == 0) {
                    class223.method1501(class174.field3455, 12, 16, var58);
                }
            } else {
                class223.method1501(var36, 12, 0, class174.field3455);
            }
            class238.field4432 = -1;
            return true;
        } else if (class238.field4432 == 108) {
            int var71 = class230.field4314.method347(26119);
            if (class230.field4314.method347(26119) == 0) {
                class9.field140[var71] = new class131();
            } else {
                class230.field4314.field831--;
                class9.field140[var71] = new class131(class230.field4314);
            }
            class238.field4432 = -1;
            class117.field2129 = class67.field1211;
            return true;
        } else if (class238.field4432 == 213) {
            int var72 = class230.field4314.method347(26119);
            class118 var73 = new class118();
            int var74 = var72 >> 6;
            var73.field2141 = var72 & 0x3F;
            var73.field2139 = class230.field4314.method347(26119);
            if (var73.field2139 >= 0 && var73.field2139 < class176.field3545.length) {
                if (var73.field2141 == 1 || var73.field2141 == 10) {
                    var73.field2148 = class230.field4314.method301(22);
                    class230.field4314.field831 += 3;
                } else if (var73.field2141 >= 2 && var73.field2141 <= 6) {
                    if (var73.field2141 == 2) {
                        var73.field2136 = 64;
                        var73.field2152 = 64;
                    }
                    if (var73.field2141 == 3) {
                        var73.field2136 = 0;
                        var73.field2152 = 64;
                    }
                    if (var73.field2141 == 4) {
                        var73.field2136 = 128;
                        var73.field2152 = 64;
                    }
                    if (var73.field2141 == 5) {
                        var73.field2136 = 64;
                        var73.field2152 = 0;
                    }
                    if (var73.field2141 == 6) {
                        var73.field2152 = 128;
                        var73.field2136 = 64;
                    }
                    var73.field2141 = 2;
                    var73.field2140 = class230.field4314.method301(67);
                    var73.field2137 = class230.field4314.method301(41);
                    var73.field2153 = class230.field4314.method347(26119);
                }
                var73.field2138 = class230.field4314.method301(39);
                if (var73.field2138 == 65535) {
                    var73.field2138 = -1;
                }
                class64.field1171[var74] = var73;
            }
            class238.field4432 = -1;
            return true;
        } else if (class238.field4432 == 146) {
            int var75 = class230.field4314.method299(53);
            int var76 = class230.field4314.method320(3);
            int var77 = class230.field4314.method301(12);
            if (var77 == 65535) {
                var77 = -1;
            }
            int var78 = class230.field4314.method302(255);
            if (var78 == 65535) {
                var78 = -1;
            }
            for (int var79 = var77; var79 <= var78; var79++) {
                long var80 = ((long) var76 << 32) + (long) var79;
                class67 var82 = class31.field495.method1051(-1, var80);
                if (var82 != null) {
                    var82.method460(true);
                }
                class31.field495.method1054(var80, new class192(var75), -1);
            }
            class238.field4432 = -1;
            return true;
        } else if (class238.field4432 == 253) {
            class179.field3569 = false;
            for (int var83 = 0; var83 < 5; var83++) {
                class233.field4370[var83] = false;
            }
            class238.field4432 = -1;
            return true;
        } else if (class238.field4432 == 214) {
            int var84 = class230.field4314.method313(117);
            class88 var85 = class230.field4314.method298(-127);
            class174 var86 = class239.method1581(-64, var84);
            if (!var85.method597(-113, var86.field3385)) {
                var86.field3385 = var85;
                class200.method1373(65280, var86);
            }
            class238.field4432 = -1;
            return true;
        } else if (class238.field4432 == 19) {
            class60.method432(0);
            class238.field4432 = -1;
            return true;
        } else if (class238.field4432 == 205) {
            long var87 = class230.field4314.method321(1054632416);
            int var89 = class230.field4314.method301(29);
            boolean var90 = false;
            byte var91 = class230.field4314.method324(67);
            if ((Long.MIN_VALUE & var87) != 0L) {
                var90 = true;
            }
            if (var90) {
                if (class47.field885 == 0) {
                    class238.field4432 = -1;
                    return true;
                }
                long var92 = var87 & Long.MAX_VALUE;
                boolean var94 = false;
                int var95;
                for (var95 = 0; class47.field885 > var95 && (class88.field1647[var95].field1219 != var92 || class88.field1647[var95].field1317 != var89); var95++) {
                }
                if (var95 < class47.field885) {
                    while (var95 < class47.field885 - 1) {
                        class88.field1647[var95] = class88.field1647[var95 + 1];
                        var95++;
                    }
                    class47.field885--;
                    class88.field1647[class47.field885] = null;
                }
            } else {
                class88 var96 = class230.field4314.method298(-126);
                class71 var97 = new class71();
                var97.field1219 = var87;
                var97.field1323 = class200.method1377(var97.field1219, (byte) 75);
                var97.field1321 = var96;
                var97.field1317 = var89;
                var97.field1315 = var91;
                int var98;
                for (var98 = class47.field885 - 1; var98 >= 0; var98--) {
                    int var99 = class88.field1647[var98].field1323.method625(true, var97.field1323);
                    if (var99 == 0) {
                        class88.field1647[var98].field1317 = var89;
                        class88.field1647[var98].field1315 = var91;
                        class88.field1647[var98].field1321 = var96;
                        if (class36.field631 == var87) {
                            class143.field2633 = var91;
                        }
                        class238.field4432 = -1;
                        class77.field1394 = class67.field1211;
                        return true;
                    }
                    if (var99 < 0) {
                        break;
                    }
                }
                if (class88.field1647.length <= class47.field885) {
                    class238.field4432 = -1;
                    return true;
                }
                for (int var100 = class47.field885 - 1; var100 > var98; var100--) {
                    class88.field1647[var100 + 1] = class88.field1647[var100];
                }
                if (class47.field885 == 0) {
                    class88.field1647 = new class71[100];
                }
                class88.field1647[var98 + 1] = var97;
                class47.field885++;
                if (class36.field631 == var87) {
                    class143.field2633 = var91;
                }
            }
            class238.field4432 = -1;
            class77.field1394 = class67.field1211;
            return true;
        } else if (class238.field4432 == 235) {
            class218.field4136 = class230.field4314.method298(-126);
            class165.method1134(0, class218.field4136);
            class238.field4432 = -1;
            return true;
        } else if (class238.field4432 == 26) {
            int var101 = class230.field4314.method320(3);
            int var102 = class230.field4314.method302(255);
            if (var102 == 65535) {
                var102 = -1;
            }
            class174 var103 = class239.method1581(-64, var101);
            if (var103.field3432 != 2 || var103.field3411 != var102) {
                var103.field3411 = var102;
                var103.field3432 = 2;
                class200.method1373(65280, var103);
            }
            class238.field4432 = -1;
            return true;
        } else if (class238.field4432 == 101) {
            if (class228.field4272 == 0) {
                class4.field54 = class93.field1742;
            } else {
                class4.field54 = class230.field4314.method298(-125);
            }
            class238.field4432 = -1;
            return true;
        } else if (class238.field4432 == 191) {
            boolean var104 = class230.field4314.method295((byte) -84) == 1;
            int var105 = class230.field4314.method313(124);
            class174 var106 = class239.method1581(-64, var105);
            if (var104 != var106.field3380) {
                var106.field3380 = var104;
                class200.method1373(65280, var106);
            }
            class238.field4432 = -1;
            return true;
        } else if (class238.field4432 == 200) {
            int var107 = class230.field4314.method313(113);
            class174 var108 = class239.method1581(-64, var107);
            for (int var109 = 0; var109 < var108.field3390.length; var109++) {
                var108.field3390[var109] = -1;
                var108.field3390[var109] = 0;
            }
            class200.method1373(65280, var108);
            class238.field4432 = -1;
            return true;
        } else if (class238.field4432 == 139) {
            int var110 = class230.field4314.method313(124);
            int var111 = class230.field4314.method313(114);
            int var112 = class230.field4314.method349(arg0);
            if (var112 == 65535) {
                var112 = -1;
            }
            class174 var113 = class239.method1581(-64, var110);
            if (var113.field3412) {
                var113.field3401 = var112;
                var113.field3484 = var111;
                class149 var114 = class71.method472(var112, (byte) -99);
                var113.field3500 = var114.field2872;
                var113.field3487 = var114.field2891;
                var113.field3511 = var114.field2874;
                var113.field3457 = var114.field2875;
                var113.field3367 = var114.field2878;
                var113.field3519 = var114.field2849;
                if (var113.field3470 > 0) {
                    var113.field3487 = var113.field3487 * 32 / var113.field3470;
                } else if (var113.field3503 > 0) {
                    var113.field3487 = var113.field3487 * 32 / var113.field3503;
                }
                class200.method1373(65280, var113);
            } else if (var112 == -1) {
                class238.field4432 = -1;
                var113.field3432 = 0;
                return true;
            } else {
                class149 var115 = class71.method472(var112, (byte) -112);
                var113.field3487 = var115.field2891 * 100 / var111;
                var113.field3511 = var115.field2874;
                var113.field3432 = 4;
                var113.field3457 = var115.field2875;
                var113.field3411 = var112;
                class200.method1373(65280, var113);
            }
            class238.field4432 = -1;
            return true;
        } else if (class238.field4432 == 230) {
            int var116 = class230.field4314.method295((byte) -109);
            int var117 = var116 >> 2;
            int var118 = var116 & 0x3;
            int var119 = class98.field1794[var117];
            int var120 = class230.field4314.method301(26);
            if (var120 == 65535) {
                var120 = -1;
            }
            int var121 = class230.field4314.method320(3);
            int var122 = var121 >> 28 & 0x3;
            int var123 = var121 & 0x3FFF;
            int var124 = var121 >> 14 & 0x3FFF;
            int var125 = var124 - class223.field4214;
            int var126 = var123 - class190.field3681;
            class113.method776(var117, var125, 12019, var119, var118, var122, var126, var120);
            class238.field4432 = -1;
            return true;
        } else if (class238.field4432 == 77) {
            int var127 = class230.field4314.method313(109);
            int var128 = class230.field4314.method302(255);
            int var129 = class230.field4314.method301(112);
            int var130 = class230.field4314.method301(56);
            if (var127 >> 30 != 0) {
                int var135 = var127 >> 28 & 0x3;
                int var136 = (var127 >> 14 & 0x3FFF) - class223.field4214;
                int var137 = (var127 & 0x3FFF) - class190.field3681;
                if (var136 >= 0 && var137 >= 0 && var136 < 104 && var137 < 104) {
                    int var138 = var137 * 128 + 64;
                    int var139 = var136 * 128 + 64;
                    class18 var140 = new class18(var128, var135, var139, var138, class239.method1586(var139, var138, 2, var135) - var130, var129, class117.field2115);
                    class42.field714.method1624(new class242(var140), 52);
                }
            } else if (var127 >> 29 != 0) {
                int var131 = var127 & 0xFFFF;
                class191 var132 = class225.field4225[var131];
                if (var132 != null) {
                    var132.field4082 = var128;
                    if (var132.field4082 == 65535) {
                        var132.field4082 = -1;
                    }
                    var132.field4077 = 0;
                    var132.field4084 = class117.field2115 + var129;
                    var132.field4127 = var130;
                    if (class117.field2115 < var132.field4084) {
                        var132.field4077 = -1;
                    }
                    var132.field4122 = 0;
                }
            } else if (var127 >> 28 != 0) {
                int var133 = var127 & 0xFFFF;
                class44 var134;
                if (class220.field4166 == var133) {
                    var134 = class240.field4458;
                } else {
                    var134 = class244.field4493[var133];
                }
                if (var134 != null) {
                    var134.field4122 = 0;
                    var134.field4127 = var130;
                    var134.field4077 = 0;
                    var134.field4082 = var128;
                    if (var134.field4082 == 65535) {
                        var134.field4082 = -1;
                    }
                    var134.field4084 = class117.field2115 + var129;
                    if (class117.field2115 < var134.field4084) {
                        var134.field4077 = -1;
                    }
                }
            }
            class238.field4432 = -1;
            return true;
        } else if (class238.field4432 == 188) {
            class67.field1221 = class228.field4272 / 8;
            for (int var141 = 0; var141 < class67.field1221; var141++) {
                class95.field1765[var141] = class230.field4314.method321(1054632416);
                class146.field2743[var141] = class200.method1377(class95.field1765[var141], (byte) 90);
            }
            class20.field313 = class67.field1211;
            class238.field4432 = -1;
            return true;
        } else if (class238.field4432 == 22) {
            class105.method727(class230.field4314, false);
            class238.field4432 = -1;
            return true;
        } else if (class238.field4432 == 221) {
            int var142 = class230.field4314.method347(26119);
            int var143 = class230.field4314.method347(26119);
            int var144 = class230.field4314.method347(26119);
            int var145 = class230.field4314.method347(26119);
            int var146 = class230.field4314.method301(41);
            class233.field4370[var142] = true;
            class201.field3836[var142] = var143;
            class66.field1194[var142] = var144;
            class194.field3716[var142] = var145;
            class190.field3676[var142] = var146;
            class238.field4432 = -1;
            return true;
        } else if (class238.field4432 == 86) {
            int var147 = class230.field4314.method347(26119);
            int var148 = class230.field4314.method302(255);
            if (var147 == 1) {
                class85.method579();
                for (int var149 = 0; var149 < 4; var149++) {
                    class166.field3202[var149].method644((byte) 15);
                }
                System.gc();
            } else if (var147 == 2) {
                class201.method1380(-77);
                System.gc();
                class131.method883(25, 65536);
            }
            class43.field723 = var148;
            class149.method1007(var148, -1);
            class192.method1336(100, false);
            class146.method974((byte) -84, class43.field723);
            for (int var150 = 0; var150 < 100; var150++) {
                class225.field4230[var150] = true;
            }
            class238.field4432 = -1;
            return true;
        } else if (class238.field4432 == 16) {
            long var151 = class230.field4314.method321(1054632416);
            boolean var153 = true;
            int var154 = class230.field4314.method301(72);
            int var155 = class230.field4314.method347(26119);
            if (var151 < 0L) {
                var153 = false;
                var151 &= Long.MAX_VALUE;
            }
            class88 var156 = class174.field3455;
            if (var154 > 0) {
                var156 = class230.field4314.method298(-127);
            }
            class88 var157 = class200.method1377(var151, (byte) 104).method614((byte) 83);
            for (int var158 = 0; var158 < class146.field2731; var158++) {
                if (class115.field2088[var158] == var151) {
                    if (class160.field3094[var158] != var154) {
                        class160.field3094[var158] = var154;
                        if (var154 > 0) {
                            class223.method1501(class166.method1142(new class88[] { var157, class171.field3323 }, -3), 12, 5, class174.field3455);
                        }
                        if (var154 == 0) {
                            class223.method1501(class166.method1142(new class88[] { var157, class117.field2125 }, -3), 12, 5, class174.field3455);
                        }
                    }
                    var157 = null;
                    class168.field3240[var158] = var156;
                    class46.field845[var158] = var155;
                    class59.field1120[var158] = var153;
                    break;
                }
            }
            boolean var159 = false;
            if (var157 != null && class146.field2731 < 200) {
                class115.field2088[class146.field2731] = var151;
                class23.field370[class146.field2731] = var157;
                class160.field3094[class146.field2731] = var154;
                class168.field3240[class146.field2731] = var156;
                class46.field845[class146.field2731] = var155;
                class59.field1120[class146.field2731] = var153;
                class146.field2731++;
            }
            class20.field313 = class67.field1211;
            int var160 = class146.field2731;
            while (var160 > 0) {
                boolean var161 = true;
                var160--;
                for (int var162 = 0; var162 < var160; var162++) {
                    if (class160.field3094[var162] != class28.field470 && class160.field3094[var162 + 1] == class28.field470 || class160.field3094[var162] == 0 && class160.field3094[var162 + 1] != 0) {
                        var161 = false;
                        int var163 = class160.field3094[var162];
                        class160.field3094[var162] = class160.field3094[var162 + 1];
                        class160.field3094[var162 + 1] = var163;
                        class88 var164 = class168.field3240[var162];
                        class168.field3240[var162] = class168.field3240[var162 + 1];
                        class168.field3240[var162 + 1] = var164;
                        class88 var165 = class23.field370[var162];
                        class23.field370[var162] = class23.field370[var162 + 1];
                        class23.field370[var162 + 1] = var165;
                        long var166 = class115.field2088[var162];
                        class115.field2088[var162] = class115.field2088[var162 + 1];
                        class115.field2088[var162 + 1] = var166;
                        int var168 = class46.field845[var162];
                        class46.field845[var162] = class46.field845[var162 + 1];
                        class46.field845[var162 + 1] = var168;
                        boolean var169 = class59.field1120[var162];
                        class59.field1120[var162] = class59.field1120[var162 + 1];
                        class59.field1120[var162 + 1] = var169;
                    }
                }
                if (var161) {
                    break;
                }
            }
            class238.field4432 = -1;
            return true;
        } else if (class238.field4432 == 249) {
            int var170 = class230.field4314.method302(255);
            int var171 = class230.field4314.method323((byte) -50);
            int var172 = var170 >> 10 & 0x1F;
            int var173 = var170 >> 5 & 0x1F;
            int var174 = var170 & 0x1F;
            int var175 = (var173 << 11) + (var172 << 19) + (var174 << 3);
            class174 var176 = class239.method1581(-64, var171);
            if (var176.field3416 != var175) {
                var176.field3416 = var175;
                class200.method1373(65280, var176);
            }
            class238.field4432 = -1;
            return true;
        } else if (class238.field4432 == 68) {
            class127.method869((byte) 124);
            class240.field4460 = class230.field4314.method347(26119);
            class238.field4432 = -1;
            class208.field3954 = class67.field1211;
            return true;
        } else if (class238.field4432 == 24) {
            for (int var177 = 0; var177 < class113.field2052.length; var177++) {
                if (class168.field3247[var177] != class113.field2052[var177]) {
                    class113.field2052[var177] = class168.field3247[var177];
                    class158.method1070(64, var177);
                    class244.field4497[class70.method470(class226.field4246++, 31)] = var177;
                }
            }
            class238.field4432 = -1;
            return true;
        } else if (class238.field4432 == 74) {
            long var178 = class230.field4314.method321(1054632416);
            class230.field4314.method324(119);
            long var180 = class230.field4314.method321(1054632416);
            long var182 = (long) class230.field4314.method301(106);
            long var184 = (long) class230.field4314.method304(-29629);
            int var186 = class230.field4314.method347(26119);
            long var187 = (var182 << 32) + var184;
            boolean var189 = false;
            int var190 = 0;
            label1367: while (true) {
                if (var190 >= 100) {
                    if (var186 <= 1) {
                        if (class238.field4430 == 1 || class176.field3537 == 1) {
                            var189 = true;
                        } else {
                            for (int var191 = 0; var191 < class67.field1221; var191++) {
                                if (class95.field1765[var191] == var178) {
                                    var189 = true;
                                    break label1367;
                                }
                            }
                        }
                    }
                    break;
                }
                if (class167.field3205[var190] == var187) {
                    var189 = true;
                    break;
                }
                var190++;
            }
            if (!var189 && client.field563 == 0) {
                class167.field3205[class62.field1150] = var187;
                class62.field1150 = (class62.field1150 + 1) % 100;
                class88 var192 = class26.method162(class21.method103(class230.field4314, 114).method622(-29988));
                if (var186 == 2 || var186 == 3) {
                    class60.method428(class166.method1142(new class88[] { class28.field472, class200.method1377(var178, (byte) 96).method614((byte) 83) }, -3), 9, (byte) -78, var192, class200.method1377(var180, (byte) 70).method614((byte) 83));
                } else if (var186 == 1) {
                    class60.method428(class166.method1142(new class88[] { class166.field3203, class200.method1377(var178, (byte) 90).method614((byte) 83) }, -3), 9, (byte) -74, var192, class200.method1377(var180, (byte) 62).method614((byte) 83));
                } else {
                    class60.method428(class200.method1377(var178, (byte) 99).method614((byte) 83), 9, (byte) -126, var192, class200.method1377(var180, (byte) 79).method614((byte) 83));
                }
            }
            class238.field4432 = -1;
            return true;
        } else if (class238.field4432 == 134) {
            class150.field2912 = class230.field4314.method319(4633);
            class121.field2215 = class230.field4314.method347(26119);
            while (class228.field4272 > class230.field4314.field831) {
                class238.field4432 = class230.field4314.method347(26119);
                class244.method1600(-9063);
            }
            class238.field4432 = -1;
            return true;
        } else if (class238.field4432 == 84) {
            class115.field2080 = class230.field4314.method347(26119);
            class238.field4432 = -1;
            class20.field313 = class67.field1211;
            return true;
        } else if (class238.field4432 == 6) {
            long var193 = class230.field4314.method321(1054632416);
            long var195 = (long) class230.field4314.method301(67);
            long var197 = (long) class230.field4314.method304(-29629);
            int var199 = class230.field4314.method347(26119);
            long var200 = (var195 << 32) + var197;
            boolean var202 = false;
            int var203 = 0;
            label1402: while (true) {
                if (var203 >= 100) {
                    if (var199 <= 1) {
                        if (class238.field4430 == 1 || class176.field3537 == 1) {
                            var202 = true;
                        } else {
                            for (int var204 = 0; var204 < class67.field1221; var204++) {
                                if (class95.field1765[var204] == var193) {
                                    var202 = true;
                                    break label1402;
                                }
                            }
                        }
                    }
                    break;
                }
                if (class167.field3205[var203] == var200) {
                    var202 = true;
                    break;
                }
                var203++;
            }
            if (!var202 && client.field563 == 0) {
                class167.field3205[class62.field1150] = var200;
                class62.field1150 = (class62.field1150 + 1) % 100;
                class88 var205 = class26.method162(class21.method103(class230.field4314, 67).method622(-29988));
                if (var199 == 2 || var199 == 3) {
                    class223.method1501(var205, 12, 7, class166.method1142(new class88[] { class28.field472, class200.method1377(var193, (byte) 117).method614((byte) 83) }, -3));
                } else if (var199 == 1) {
                    class223.method1501(var205, 12, 7, class166.method1142(new class88[] { class166.field3203, class200.method1377(var193, (byte) 63).method614((byte) 83) }, -3));
                } else {
                    class223.method1501(var205, 12, 3, class200.method1377(var193, (byte) 110).method614((byte) 83));
                }
            }
            class238.field4432 = -1;
            return true;
        } else if (class238.field4432 == 237) {
            class67.field1206 = class230.field4314.method347(26119);
            class10.field142 = class230.field4314.method347(26119);
            class128.field2410 = class230.field4314.method347(26119);
            class238.field4432 = -1;
            return true;
        } else if (class238.field4432 == 96) {
            int var206 = class230.field4314.method343(74);
            if (var206 == 65535) {
                var206 = -1;
            }
            int var207 = class230.field4314.method299(-95);
            class174 var208 = class239.method1581(-64, var207);
            if (var208.field3432 != 1 || var208.field3411 != var206) {
                var208.field3432 = 1;
                var208.field3411 = var206;
                class200.method1373(65280, var208);
            }
            class238.field4432 = -1;
            return true;
        } else if (class238.field4432 == 149) {
            int var209 = class230.field4314.method302(255);
            int var210 = class230.field4314.method319(4633);
            int var211 = class230.field4314.method301(29);
            class191 var212 = class225.field4225[var211];
            if (var212 != null) {
                class141.method927(var209, !arg0, var210, var212);
            }
            class238.field4432 = -1;
            return true;
        } else if (class238.field4432 == 248) {
            for (int var213 = 0; var213 < class244.field4493.length; var213++) {
                if (class244.field4493[var213] != null) {
                    class244.field4493[var213].field4079 = -1;
                }
            }
            for (int var214 = 0; var214 < class225.field4225.length; var214++) {
                if (class225.field4225[var214] != null) {
                    class225.field4225[var214].field4079 = -1;
                }
            }
            class238.field4432 = -1;
            return true;
        } else if (class238.field4432 == 187) {
            long var215 = class230.field4314.method321(1054632416);
            int var217 = class230.field4314.method301(100);
            class88 var218 = class168.method1152((byte) 62, var217).method1411(class230.field4314, 80);
            class118.method803(var218, (byte) 28, var217, class200.method1377(var215, (byte) 65).method614((byte) 83), 19, null);
            class238.field4432 = -1;
            return true;
        } else if (class238.field4432 == 177) {
            int var219 = class230.field4314.method320(3);
            class49.field912 = class126.field2326.method1294(0, var219);
            class238.field4432 = -1;
            return true;
        } else if (class238.field4432 == 88) {
            class121.field2215 = class230.field4314.method319(4633);
            class150.field2912 = class230.field4314.method295((byte) -67);
            for (int var220 = class121.field2215; var220 < class121.field2215 + 8; var220++) {
                for (int var222 = class150.field2912; var222 < class150.field2912 + 8; var222++) {
                    if (class134.field2499[class149.field2909][var220][var222] != null) {
                        class134.field2499[class149.field2909][var220][var222] = null;
                        class29.method175(21280, var220, var222);
                    }
                }
            }
            for (class159 var221 = (class159) class62.field1140.method1612(false); var221 != null; var221 = (class159) class62.field1140.method1621(82)) {
                if (class121.field2215 <= var221.field3061 && var221.field3061 < class121.field2215 + 8 && class150.field2912 <= var221.field3054 && var221.field3054 < class150.field2912 + 8 && class149.field2909 == var221.field3057) {
                    var221.field3063 = 0;
                }
            }
            class238.field4432 = -1;
            return true;
        } else if (class238.field4432 == 203) {
            long var223 = class230.field4314.method321(1054632416);
            long var225 = (long) class230.field4314.method301(76);
            long var227 = (long) class230.field4314.method304(-29629);
            int var229 = class230.field4314.method347(26119);
            int var230 = class230.field4314.method301(68);
            long var231 = (var225 << 32) + var227;
            boolean var233 = false;
            int var234 = 0;
            label1436: while (true) {
                if (var234 >= 100) {
                    if (var229 <= 1) {
                        for (int var235 = 0; var235 < class67.field1221; var235++) {
                            if (class95.field1765[var235] == var223) {
                                var233 = true;
                                break label1436;
                            }
                        }
                    }
                    break;
                }
                if (class167.field3205[var234] == var231) {
                    var233 = true;
                    break;
                }
                var234++;
            }
            if (!var233 && client.field563 == 0) {
                class167.field3205[class62.field1150] = var231;
                class62.field1150 = (class62.field1150 + 1) % 100;
                class88 var236 = class168.method1152((byte) 62, var230).method1411(class230.field4314, 80);
                if (var229 == 2) {
                    class118.method803(var236, (byte) 28, var230, class166.method1142(new class88[] { class28.field472, class200.method1377(var223, (byte) 108).method614((byte) 83) }, -3), 18, null);
                } else if (var229 == 1) {
                    class118.method803(var236, (byte) 28, var230, class166.method1142(new class88[] { class166.field3203, class200.method1377(var223, (byte) 86).method614((byte) 83) }, -3), 18, null);
                } else {
                    class118.method803(var236, (byte) 28, var230, class200.method1377(var223, (byte) 109).method614((byte) 83), 18, null);
                }
            }
            class238.field4432 = -1;
            return true;
        } else if (class238.field4432 == 17) {
            int var237 = class230.field4314.method323((byte) -87);
            int var238 = class230.field4314.method301(103);
            if (var237 < -70000) {
                var238 += 32768;
            }
            class174 var239;
            if (var237 < 0) {
                var239 = null;
            } else {
                var239 = class239.method1581(-64, var237);
            }
            while (class230.field4314.field831 < class228.field4272) {
                int var240 = class230.field4314.method350(114);
                int var241 = class230.field4314.method301(12);
                int var242 = 0;
                if (var241 != 0) {
                    var242 = class230.field4314.method347(26119);
                    if (var242 == 255) {
                        var242 = class230.field4314.method323((byte) -38);
                    }
                }
                if (var239 != null && var240 >= 0 && var240 < var239.field3390.length) {
                    var239.field3390[var240] = var241;
                    var239.field3476[var240] = var242;
                }
                class177.method1270(1, var238, var242, var240, var241 - 1);
            }
            if (var239 != null) {
                class200.method1373(65280, var239);
            }
            class127.method869((byte) 127);
            class231.field4330[class70.method470(class223.field4200++, 31)] = class70.method470(var238, 32767);
            class238.field4432 = -1;
            return true;
        } else if (class238.field4432 == 11) {
            byte var243 = class230.field4314.method335(0);
            int var244 = class230.field4314.method302(255);
            class168.field3247[var244] = var243;
            if (class113.field2052[var244] != var243) {
                class113.field2052[var244] = var243;
                class158.method1070(64, var244);
            }
            class244.field4497[class70.method470(class226.field4246++, 31)] = var244;
            class238.field4432 = -1;
            return true;
        } else if (class238.field4432 == 100) {
            int var245 = class230.field4314.method323((byte) -77);
            class174 var246 = class239.method1581(-64, var245);
            var246.field3432 = 3;
            var246.field3411 = class240.field4458.field768.method1429(112);
            class200.method1373(65280, var246);
            class238.field4432 = -1;
            return true;
        } else if (class238.field4432 == 25) {
            int var247 = class230.field4314.method323((byte) -119);
            int var248 = class230.field4314.method301(112);
            int var249 = class230.field4314.method347(26119);
            class168 var250 = (class168) class128.field2397.method1051(-1, (long) var247);
            if (var250 != null) {
                class93.method673((byte) -117, var250, var250.field3231 != var248);
            }
            class104.method722(var249, var247, var248, (byte) 105);
            class238.field4432 = -1;
            return true;
        } else if (class238.field4432 == 10) {
            int var251 = class230.field4314.method343(52);
            if (var251 == 65535) {
                var251 = -1;
            }
            class116.method790((byte) -74, var251);
            class238.field4432 = -1;
            return true;
        } else if (class238.field4432 == 89) {
            int var252 = class230.field4314.method302(255);
            if (var252 == 65535) {
                var252 = -1;
            }
            int var253 = class230.field4314.method340((byte) -54);
            class4.method23(true, var252, var253);
            class238.field4432 = -1;
            return true;
        } else if (class238.field4432 == 66) {
            byte[] var254 = new byte[class228.field4272];
            class230.field4314.method29(class228.field4272, var254, false, 0);
            class165.method1140(-4, class54.method395(0, (byte) -97, var254, class228.field4272));
            class238.field4432 = -1;
            return true;
        } else if (class238.field4432 == 53) {
            class88 var255 = class230.field4314.method298(-127);
            Object[] var256 = new Object[var255.method604((byte) -53) + 1];
            for (int var257 = var255.method604((byte) -53) - 1; var257 >= 0; var257--) {
                if (var255.method599(255, var257) == 115) {
                    var256[var257 + 1] = class230.field4314.method298(-128);
                } else {
                    var256[var257 + 1] = Integer.valueOf(class230.field4314.method323((byte) -96));
                }
            }
            var256[0] = Integer.valueOf(class230.field4314.method323((byte) -110));
            class39 var258 = new class39();
            var258.field681 = var256;
            class200.method1375(var258, -876775538);
            class238.field4432 = -1;
            return true;
        } else if (class238.field4432 == 229) {
            class77.field1394 = class67.field1211;
            long var259 = class230.field4314.method321(1054632416);
            if (var259 == 0L) {
                class47.field885 = 0;
                class222.field4184 = null;
                class225.field4221 = null;
                class238.field4432 = -1;
                class88.field1647 = null;
                return true;
            }
            long var261 = class230.field4314.method321(1054632416);
            class222.field4184 = class200.method1377(var261, (byte) 72);
            class225.field4221 = class200.method1377(var259, (byte) 113);
            class170.field3303 = class230.field4314.method324(94);
            int var263 = class230.field4314.method347(26119);
            if (var263 == 255) {
                class238.field4432 = -1;
                return true;
            }
            class47.field885 = var263;
            class71[] var264 = new class71[100];
            for (int var265 = 0; var265 < class47.field885; var265++) {
                var264[var265] = new class71();
                var264[var265].field1219 = class230.field4314.method321(1054632416);
                var264[var265].field1323 = class200.method1377(var264[var265].field1219, (byte) 82);
                var264[var265].field1317 = class230.field4314.method301(20);
                var264[var265].field1315 = class230.field4314.method324(74);
                var264[var265].field1321 = class230.field4314.method298(-128);
                if (class36.field631 == var264[var265].field1219) {
                    class143.field2633 = var264[var265].field1315;
                }
            }
            boolean var266 = false;
            int var267 = class47.field885;
            while (var267 > 0) {
                var267--;
                boolean var268 = true;
                for (int var269 = 0; var269 < var267; var269++) {
                    if (var264[var269].field1323.method625(arg0, var264[var269 + 1].field1323) > 0) {
                        class71 var270 = var264[var269];
                        var268 = false;
                        var264[var269] = var264[var269 + 1];
                        var264[var269 + 1] = var270;
                    }
                }
                if (var268) {
                    break;
                }
            }
            class88.field1647 = var264;
            class238.field4432 = -1;
            return true;
        } else if (class238.field4432 == 129) {
            long var271 = class230.field4314.method321(1054632416);
            class230.field4314.method324(35);
            long var273 = class230.field4314.method321(1054632416);
            long var275 = (long) class230.field4314.method301(112);
            long var277 = (long) class230.field4314.method304(-29629);
            long var279 = (var275 << 32) + var277;
            int var281 = class230.field4314.method347(26119);
            int var282 = class230.field4314.method301(14);
            boolean var283 = false;
            int var284 = 0;
            label1482: while (true) {
                if (var284 >= 100) {
                    if (var281 <= 1) {
                        for (int var285 = 0; var285 < class67.field1221; var285++) {
                            if (class95.field1765[var285] == var271) {
                                var283 = true;
                                break label1482;
                            }
                        }
                    }
                    break;
                }
                if (class167.field3205[var284] == var279) {
                    var283 = true;
                    break;
                }
                var284++;
            }
            if (!var283 && client.field563 == 0) {
                class167.field3205[class62.field1150] = var279;
                class62.field1150 = (class62.field1150 + 1) % 100;
                class88 var286 = class168.method1152((byte) 62, var282).method1411(class230.field4314, 80);
                if (var281 == 2 || var281 == 3) {
                    class118.method803(var286, (byte) 28, var282, class166.method1142(new class88[] { class28.field472, class200.method1377(var271, (byte) 114).method614((byte) 83) }, -3), 20, class200.method1377(var273, (byte) 116).method614((byte) 83));
                } else if (var281 == 1) {
                    class118.method803(var286, (byte) 28, var282, class166.method1142(new class88[] { class166.field3203, class200.method1377(var271, (byte) 83).method614((byte) 83) }, -3), 20, class200.method1377(var273, (byte) 112).method614((byte) 83));
                } else {
                    class118.method803(var286, (byte) 28, var282, class200.method1377(var271, (byte) 71).method614((byte) 83), 20, class200.method1377(var273, (byte) 67).method614((byte) 83));
                }
            }
            class238.field4432 = -1;
            return true;
        } else if (class238.field4432 == 166) {
            if (class43.field723 != -1) {
                class137.method914(class43.field723, 0, 4);
            }
            class238.field4432 = -1;
            return true;
        } else if (class238.field4432 == 21) {
            class43.method278(true, (byte) 33);
            class238.field4432 = -1;
            return true;
        } else if (class238.field4432 == 233) {
            class88 var287 = class230.field4314.method298(-126);
            int var288 = class230.field4314.method347(26119);
            int var289 = class230.field4314.method347(26119);
            if (var288 >= 1 && var288 <= 8) {
                if (var287.method624(class180.field3574, (byte) 92)) {
                    var287 = null;
                }
                class130.field2438[var288 - 1] = var287;
                class203.field3877[var288 - 1] = var289 == 0;
            }
            class238.field4432 = -1;
            return true;
        } else if (class238.field4432 == 70) {
            for (int var290 = 0; var290 < class28.field465; var290++) {
                class229 var291 = class106.method734(var290, (byte) 69);
                if (var291 != null && var291.field4290 == 0) {
                    class168.field3247[var290] = 0;
                    class113.field2052[var290] = 0;
                }
            }
            class127.method869((byte) 125);
            class226.field4246 += 32;
            class238.field4432 = -1;
            return true;
        } else if (class238.field4432 == 123 || class238.field4432 == 52 || class238.field4432 == 232 || class238.field4432 == 61 || class238.field4432 == 135 || class238.field4432 == 173 || class238.field4432 == 150 || class238.field4432 == 198 || class238.field4432 == 99 || class238.field4432 == 171 || class238.field4432 == 75 || class238.field4432 == 44) {
            class244.method1600(-9063);
            class238.field4432 = -1;
            return true;
        } else if (class238.field4432 == 120) {
            int var292 = class230.field4314.method349(true);
            int var293 = class230.field4314.method349(true);
            int var294 = class230.field4314.method313(127);
            int var295 = class230.field4314.method343(81);
            class174 var296 = class239.method1581(-64, var294);
            if (var296.field3457 != var295 || var296.field3511 != var293 || var296.field3487 != var292) {
                var296.field3511 = var293;
                var296.field3487 = var292;
                var296.field3457 = var295;
                class200.method1373(65280, var296);
            }
            class238.field4432 = -1;
            return true;
        } else if (class238.field4432 == 54) {
            class127.method869((byte) 125);
            class199.field3790 = class230.field4314.method334((byte) -73);
            class208.field3954 = class67.field1211;
            class238.field4432 = -1;
            return true;
        } else if (class238.field4432 == 114) {
            int var297 = class230.field4314.method347(26119);
            int var298 = class230.field4314.method352(24758);
            int var299 = class230.field4314.method295((byte) -102);
            class149.field2909 = var297 >> 1;
            class240.field4458.method1476((var297 & 0x1) == 1, var299, 0, var298);
            class238.field4432 = -1;
            return true;
        } else if (class238.field4432 == 162) {
            int var300 = class230.field4314.method299(60);
            int var301 = class230.field4314.method339(2);
            class174 var302 = class239.method1581(-64, var300);
            if (var302.field3406 != var301 || var301 == -1) {
                var302.field3406 = var301;
                var302.field3489 = 0;
                var302.field3381 = 0;
                class200.method1373(65280, var302);
            }
            class238.field4432 = -1;
            return true;
        } else if (class238.field4432 == 163) {
            class121.field2215 = class230.field4314.method347(26119);
            class150.field2912 = class230.field4314.method319(4633);
            class238.field4432 = -1;
            return true;
        } else if (class238.field4432 == 116) {
            class33.method210(19190);
            class238.field4432 = -1;
            return true;
        } else if (class238.field4432 == 223) {
            class179.field3569 = true;
            class46.field848 = class230.field4314.method347(26119);
            class23.field368 = class230.field4314.method347(26119);
            class66.field1200 = class230.field4314.method301(20);
            class9.field130 = class230.field4314.method347(26119);
            class146.field2744 = class230.field4314.method347(26119);
            if (class146.field2744 >= 100) {
                int var303 = class46.field848 * 128 + 64;
                int var304 = class23.field368 * 128 + 64;
                int var305 = class239.method1586(var303, var304, 2, class149.field2909) - class66.field1200;
                int var306 = var303 - class79.field1428;
                int var307 = var304 - class184.field3610;
                int var308 = var305 - class108.field1956;
                int var309 = (int) Math.sqrt((double) (var306 * var306 + var307 * var307));
                class207.field3936 = (int) (Math.atan2((double) var308, (double) var309) * 325.949D) & 0x7FF;
                class170.field3259 = (int) (-325.949D * Math.atan2((double) var306, (double) var307)) & 0x7FF;
                if (class207.field3936 < 128) {
                    class207.field3936 = 128;
                }
                if (class207.field3936 > 383) {
                    class207.field3936 = 383;
                }
            }
            class238.field4432 = -1;
            return true;
        } else if (class238.field4432 == 241) {
            int var310 = class230.field4314.method301(127);
            class148.method998(var310, (byte) 119);
            class231.field4330[class70.method470(class223.field4200++, 31)] = class70.method470(var310, 32767);
            class238.field4432 = -1;
            return true;
        } else if (class238.field4432 == 147) {
            class247.field4514 = class230.field4314.method347(26119);
            class238.field4432 = -1;
            return true;
        } else if (class238.field4432 == 243) {
            int var311 = class230.field4314.method343(98);
            int var312 = class230.field4314.method349(true);
            class64.field1173 = var311;
            class207.field3932 = var312;
            class136.method907((byte) -51);
            class238.field4432 = -1;
            return true;
        } else if (class238.field4432 == 189) {
            class34.field580 = (short) class230.field4314.method301(80);
            if (class34.field580 <= 0) {
                class34.field580 = 256;
            }
            class49.field921 = (short) class230.field4314.method349(arg0);
            class238.field4432 = -1;
            if (class49.field921 <= 0) {
                class49.field921 = 205;
            }
            return true;
        } else if (class238.field4432 == 220) {
            int var313 = class230.field4314.method313(123);
            int var314 = class230.field4314.method349(true);
            class174 var315 = class239.method1581(-64, var313);
            if (var315 != null && var315.field3392 == 0) {
                if (var315.field3377 - var315.field3424 < var314) {
                    var314 = var315.field3377 - var315.field3424;
                }
                if (var314 < 0) {
                    var314 = 0;
                }
                if (var315.field3417 != var314) {
                    var315.field3417 = var314;
                    class200.method1373(65280, var315);
                }
            }
            class238.field4432 = -1;
            return true;
        } else if (class238.field4432 == 4) {
            int var316 = class230.field4314.method302(255);
            int var317 = class230.field4314.method301(119);
            int var318 = class230.field4314.method320(3);
            class174 var319 = class239.method1581(-64, var318);
            class238.field4432 = -1;
            var319.field3387 = (var317 << 16) + var316;
            return true;
        } else if (class238.field4432 == 197) {
            class160.field3085 = (short) class230.field4314.method302(255);
            if (class160.field3085 <= 0) {
                class160.field3085 = 320;
            }
            class221.field4177 = (short) class230.field4314.method349(arg0);
            class238.field4432 = -1;
            if (class221.field4177 <= 0) {
                class221.field4177 = 256;
            }
            return true;
        } else if (class238.field4432 == 113) {
            int var320 = class230.field4314.method301(49);
            int var321 = class230.field4314.method347(26119);
            int var322 = class230.field4314.method301(63);
            if (var320 == 65535) {
                var320 = -1;
            }
            class92.method669(var321, var322, var320, 0);
            class238.field4432 = -1;
            return true;
        } else if (class238.field4432 == 242) {
            int var323 = class230.field4314.method323((byte) -79);
            class168 var324 = (class168) class128.field2397.method1051(-1, (long) var323);
            if (var324 != null) {
                class93.method673((byte) -116, var324, true);
            }
            if (class53.field967 != null) {
                class200.method1373(65280, class53.field967);
                class53.field967 = null;
            }
            class238.field4432 = -1;
            return true;
        } else if (class238.field4432 == 72) {
            int var325 = class230.field4314.method349(arg0);
            int var326 = class230.field4314.method299(86);
            class168.field3247[var325] = var326;
            if (class113.field2052[var325] != var326) {
                class113.field2052[var325] = var326;
                class158.method1070(64, var325);
            }
            class244.field4497[class70.method470(31, class226.field4246++)] = var325;
            class238.field4432 = -1;
            return true;
        } else if (class238.field4432 == 65) {
            class50.field926 = (short) class230.field4314.method301(80);
            if (class50.field926 <= 0) {
                class50.field926 = 32767;
            } else if (class50.field926 < class136.field2529) {
                class50.field926 = class136.field2529;
            }
            class87.field1578 = (short) class230.field4314.method343(43);
            if (class87.field1578 <= 0) {
                class87.field1578 = 1;
            }
            class222.field4181 = (short) class230.field4314.method343(124);
            if (class222.field4181 <= 0) {
                class222.field4181 = 32767;
            } else if (class222.field4181 < class87.field1578) {
                class222.field4181 = class87.field1578;
            }
            class136.field2529 = (short) class230.field4314.method302(255);
            if (class136.field2529 <= 0) {
                class136.field2529 = 1;
            }
            class238.field4432 = -1;
            return true;
        } else if (class238.field4432 == 240) {
            class115.method787((byte) 28);
            class238.field4432 = -1;
            return false;
        } else if (class238.field4432 == 204) {
            class127.method869((byte) 126);
            int var327 = class230.field4314.method295((byte) -119);
            int var328 = class230.field4314.method319(4633);
            int var329 = class230.field4314.method313(124);
            class179.field3564[var327] = var329;
            class105.field1909[var327] = var328;
            class217.field4068[var327] = 1;
            for (int var330 = 0; var330 < 98; var330++) {
                if (var329 >= class90.field1711[var330]) {
                    class217.field4068[var327] = var330 + 2;
                }
            }
            class143.field2644[class70.method470(31, class118.field2133++)] = var327;
            class238.field4432 = -1;
            return true;
        } else if (class238.field4432 == 255) {
            class116.field2104 = 0;
            class238.field4432 = -1;
            return true;
        } else if (class238.field4432 == 172) {
            long var331 = class230.field4314.method321(1054632416);
            class88 var333 = class26.method162(class21.method103(class230.field4314, 64).method622(-29988));
            class223.method1501(var333, 12, 6, class200.method1377(var331, (byte) 124).method614((byte) 83));
            class238.field4432 = -1;
            return true;
        } else if (class238.field4432 == 110) {
            class230.method1537(class126.field2326, 0, class228.field4272, class230.field4314);
            class238.field4432 = -1;
            return true;
        } else if (class238.field4432 == 184) {
            class114.field2063 = class230.field4314.method343(98) * 30;
            class238.field4432 = -1;
            class208.field3954 = class67.field1211;
            return true;
        } else {
            class221.method1490((byte) 0, "T1 - " + class238.field4432 + "," + class46.field821 + "," + class88.field1634 + " - " + class228.field4272, null);
            if (!arg0) {
                method1567(97, -34, -99, -37, 80, (byte) -34);
            }
            class115.method787((byte) -3);
            return true;
        }
    }

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "(B)V")
    public static void method1569(byte arg0) {
        field4400 = null;
        field4399 = null;
        field4405 = null;
        if (arg0 <= -107) {
            field4406 = null;
            field4404 = null;
            field4402 = null;
            field4401 = null;
        }
    }
}
