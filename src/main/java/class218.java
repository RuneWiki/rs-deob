import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public class class218 extends class291 {

    @OriginalMember(owner = "client!hs", name = "i", descriptor = "Z")
    public static boolean field3156 = false;

    @OriginalMember(owner = "client!hs", name = "k", descriptor = "Lkn;")
    public static class530 field3158 = new class530("Take", "Nehmen", "Prendre", "Pegar");

    @OriginalMember(owner = "client!hs", name = "l", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!hs", name = "m", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!hs", name = "n", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!hs", name = "o", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!hs", name = "h", descriptor = "Lhs;")
    public class218 field3155;

    @OriginalMember(owner = "client!hs", name = "p", descriptor = "Lhs;")
    public class218 field3163;

    @OriginalMember(owner = "client!hs", name = "j", descriptor = "Loi;")
    public static class53 field3157;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1352(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3162++;
        int var8 = arg6 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = (class105.field1391 - class221.field3182) * var8 / 100 + class221.field3182;
        int var10 = arg2 * var9 >> 8;
        if (arg4 != 65535) {
            method1353(-46);
        }
        int var11 = 16384 - arg5 & 0x3FFF;
        int var12 = 16384 - arg7 & 0x3FFF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (var11 != 0) {
            var14 = class95.field1242[var11] * -var10 >> 15;
            var15 = class95.field1241[var11] * var10 >> 15;
        }
        if (var12 != 0) {
            var13 = class95.field1242[var12] * var15 >> 15;
            var15 = class95.field1241[var12] * var15 >> 15;
        }
        class515.field7596 = arg0 - var15;
        class8.field122 = arg7;
        class51.field619 = arg1 - var14;
        class478.field6654 = arg3 - var13;
        class194.field2743 = 0;
        class41.field450 = arg5;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(I)V")
    public static final void method1353(int arg0) {
        field3161++;
        if (class63.field786 == 0 || class63.field786 == 6) {
            return;
        }
        try {
            if ((++class149.field1980) > 2000) {
                if (class50.field608 != null) {
                    class50.field608.method1360((byte) -95);
                    class50.field608 = null;
                }
                if (class431.field6094 >= 1) {
                    class63.field786 = 0;
                    class183.method1148(-5, 23);
                    return;
                }
                class63.field786 = 1;
                if (class32.field370 == 2 || class32.field370 == 3) {
                    class426.field5989.field5880 = !class426.field5989.field5880;
                } else {
                    class489.field6837.field5880 = !class489.field6837.field5880;
                }
                class431.field6094++;
                class149.field1980 = 0;
            }
            if (arg0 < 11) {
                method1352(101, -15, -36, -68, 86, 105, -16, -54);
            }
            if (class63.field786 == 1) {
                if (class32.field370 == 2 || class32.field370 == 3) {
                    class255.field3778 = class268.field3914.method959(-26521, class426.field5989.method2478(38), class426.field5989.field5883);
                } else {
                    class255.field3778 = class268.field3914.method959(-26521, class489.field6837.method2478(30), class489.field6837.field5883);
                }
                class63.field786 = 2;
            }
            if (class63.field786 == 2) {
                if (class255.field3778.field5277 == 2) {
                    throw new IOException();
                }
                if (class255.field3778.field5277 != 1) {
                    return;
                }
                class50.field608 = class60.method487((Socket) class255.field3778.field5274, 5000, -93);
                class255.field3778 = null;
                long var1 = class161.field2382 = class85.method617(-58, class153.field2198);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class30.field357.field5665 = 0;
                class30.field357.method2376((byte) 122, class215.field3104.field7739);
                class30.field357.method2376((byte) 122, var3);
                class50.field608.method1357(class30.field357.field5663, (byte) 40, 2, 0);
                class63.field786 = 3;
            }
            if (class63.field786 == 3) {
                if (!class50.field608.method1356(1, 105)) {
                    return;
                }
                class50.field608.method1358(0, (byte) -87, class264.field3874.field5663, 1);
                int var4 = class264.field3874.field5663[0] & 0xFF;
                if (var4 != 0) {
                    class63.field786 = 0;
                    class183.method1148(var4, -105);
                    class50.field608.method1360((byte) 47);
                    class50.field608 = null;
                    class301.method1840(-5);
                    return;
                }
                class63.field786 = 4;
            }
            if (class63.field786 == 4) {
                if (!class50.field608.method1356(8, 86)) {
                    return;
                }
                class50.field608.method1358(0, (byte) -104, class264.field3874.field5663, 8);
                class264.field3874.field5665 = 0;
                class475.field6613 = class264.field3874.method2351(-128);
                class403 var5 = new class403(70);
                int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class475.field6613 >> 32), (int) class475.field6613 };
                var5.method2376((byte) 122, 10);
                var5.method2354(var6[0], false);
                var5.method2354(var6[1], false);
                var5.method2354(var6[2], false);
                var5.method2354(var6[3], false);
                var5.method2358(class85.method617(-58, class153.field2198), (byte) -60);
                var5.method2377((byte) -53, class449.field6287);
                var5.method2364((byte) 66, class90.field1119, class184.field2660);
                class241 var7 = class30.field357;
                var7.field5665 = 0;
                if (class32.field370 == 2 || class32.field370 == 3) {
                    if (class488.field6832 == 12) {
                        var7.method2376((byte) 122, class215.field3108.field7739);
                    } else {
                        var7.method2376((byte) 122, class215.field3106.field7739);
                    }
                    var7.method2372(0, -125);
                    int var8 = var7.field5665;
                    var7.method2354(601, false);
                    var7.method2376((byte) 122, class170.field2476);
                    var7.method2376((byte) 122, class334.method1996((byte) 126));
                    var7.method2372(class147.field1956, 48);
                    var7.method2372(class273.field4048, -127);
                    var7.method2376((byte) 122, class4.field81.field1413);
                    class347.method2056(0, var7);
                    var7.method2377((byte) -53, class284.field4166);
                    var7.method2354(class496.field7034, false);
                    class403 var9 = class4.field81.method1783(-83);
                    var7.method2376((byte) 122, var9.field5665);
                    var7.method2363(0, var9.field5663, -1, var9.field5665);
                    class75.field946 = true;
                    var7.method2372(class494.field6991, -125);
                    var7.method2372(class121.field1668, -126);
                    class410.method2425((byte) 94);
                    var7.method2363(0, var5.field5663, -1, var5.field5665);
                    var7.method2347((byte) -43, var7.field5665 - var8);
                } else {
                    var7.method2376((byte) 122, class215.field3109.field7739);
                    var7.method2372(0, -19);
                    int var10 = var7.field5665;
                    var7.method2354(601, false);
                    var7.method2376((byte) 122, class246.field3594.field2962);
                    var7.method2376((byte) 122, class149.field1979);
                    class347.method2056(0, var7);
                    var7.method2377((byte) -53, class284.field4166);
                    var7.method2354(class496.field7034, false);
                    class410.method2425((byte) 37);
                    var7.method2363(0, var5.field5663, -1, var5.field5665);
                    var7.method2347((byte) -43, var7.field5665 - var10);
                }
                class50.field608.method1357(var7.field5663, (byte) 40, var7.field5665, 0);
                var7.method1519(var6, false);
                for (int var11 = 0; var11 < 4; var11++) {
                    var6[var11] += 50;
                }
                class264.field3874.method1519(var6, false);
                class63.field786 = 5;
            }
            if (class63.field786 == 5) {
                if (!class50.field608.method1356(1, 113)) {
                    return;
                }
                class50.field608.method1358(0, (byte) -105, class264.field3874.field5663, 1);
                int var12 = class264.field3874.field5663[0] & 0xFF;
                if (var12 == 21) {
                    class63.field786 = 8;
                } else if (var12 == 29) {
                    class63.field786 = 14;
                } else if (var12 == 1) {
                    class63.field786 = 6;
                    class183.method1148(var12, 45);
                    return;
                } else if (var12 == 2) {
                    class63.field786 = 9;
                } else if (var12 == 15) {
                    class63.field786 = 15;
                    class190.field2715 = -2;
                } else if (var12 == 23 && class431.field6094 < 1) {
                    class431.field6094++;
                    class63.field786 = 1;
                    class149.field1980 = 0;
                    class50.field608.method1360((byte) 103);
                    class50.field608 = null;
                    return;
                } else {
                    class63.field786 = 0;
                    class183.method1148(var12, -111);
                    class50.field608.method1360((byte) 89);
                    class50.field608 = null;
                    class301.method1840(-5);
                    return;
                }
            }
            if (class63.field786 == 7) {
                class30.field357.field5665 = 0;
                class30.field357.method1523(9823, class215.field3107.field7739);
                class50.field608.method1357(class30.field357.field5663, (byte) 40, class30.field357.field5665, 0);
                class63.field786 = 5;
            } else if (class63.field786 == 8) {
                if (class50.field608.method1356(1, 86)) {
                    class50.field608.method1358(0, (byte) -108, class264.field3874.field5663, 1);
                    int var13 = class264.field3874.field5663[0] & 0xFF;
                    class63.field786 = 0;
                    class384.field5400 = (var13 + 3) * 60;
                    class183.method1148(21, -98);
                    class50.field608.method1360((byte) 55);
                    class50.field608 = null;
                    class301.method1840(-5);
                }
            } else if (class63.field786 == 14) {
                if (class50.field608.method1356(1, 122)) {
                    class50.field608.method1358(0, (byte) -65, class264.field3874.field5663, 1);
                    class63.field786 = 0;
                    class347.field5023 = class264.field3874.field5663[0] & 0xFF;
                    class183.method1148(29, -119);
                    class50.field608.method1360((byte) -100);
                    class50.field608 = null;
                    class301.method1840(-5);
                }
            } else if (class63.field786 != 9) {
                if (class63.field786 == 10) {
                    class241 var14 = class264.field3874;
                    if (class32.field370 == 3) {
                        class464.field6490 = true;
                    } else {
                        class464.field6490 = false;
                    }
                    if (class32.field370 == 2 || class32.field370 == 3) {
                        if (!class50.field608.method1356(class31.field367, 119)) {
                            return;
                        }
                        class50.field608.method1358(0, (byte) -70, var14.field5663, class31.field367);
                        var14.field5665 = 0;
                        class208.field3009 = var14.method2357((byte) 122);
                        class305.field4440 = var14.method2357((byte) 113);
                        class236.field3442 = var14.method2357((byte) 120) == 1;
                        class215.field3120 = var14.method2357((byte) 105) == 1;
                        class220.field3170 = var14.method2357((byte) 126) == 1;
                        class467.field6528 = var14.method2357((byte) 117) == 1;
                        class343.field4982 = var14.method2338(0);
                        class269.field3918 = var14.method2357((byte) 106) == 1;
                        class486.field6784 = var14.method2346((byte) 2);
                        class192.field2735 = var14.method2357((byte) 110) == 1;
                        if (class32.field370 == 3) {
                            boolean var15 = var14.method2357((byte) 125) == 1;
                            if (var15) {
                                long var16 = var14.method2351(-128);
                                String var18 = class269.method1693((byte) -121, var16);
                                int var19 = var14.method2357((byte) 121);
                                byte[] var20 = new byte[var19];
                                var14.method1521(var20, 438851265, 0, var19);
                                String var21 = class213.method1339(-921600, var20);
                                class302 var22 = null;
                                try {
                                    class370 var23 = class268.field3914.method950(false, "3", 0);
                                    while (var23.field5277 == 0) {
                                        class52.method411(1L, (byte) 116);
                                    }
                                    if (var23.field5277 == 1) {
                                        var22 = (class302) var23.field5274;
                                        int var24 = var18.length() + var21.length() + 6 + 3;
                                        if (var24 > 50) {
                                            throw new RuntimeException(">50");
                                        }
                                        class403 var25 = new class403(var24 + 1);
                                        var25.method2376((byte) 122, var24);
                                        var25.method2376((byte) 122, 0);
                                        var25.method2348(var18, 22611);
                                        var25.method2348(var21, 22611);
                                        var25.method2374(0);
                                        var22.method1845((byte) -97, 0, var25.field5665, var25.field5663);
                                    }
                                } catch (Exception var34) {
                                }
                                try {
                                    if (var22 != null) {
                                        var22.method1844((byte) 91);
                                    }
                                } catch (Exception var32) {
                                }
                            }
                        }
                        class377.field5338.method1908(class192.field2735, 36);
                        class344.field5000.method996((byte) -96, class192.field2735);
                        class106.field1400.method2587(class192.field2735, -1);
                    } else if (class50.field608.method1356(class31.field367, 90)) {
                        class50.field608.method1358(0, (byte) -95, var14.field5663, class31.field367);
                        var14.field5665 = 0;
                        class208.field3009 = var14.method2357((byte) 119);
                        class305.field4440 = var14.method2357((byte) 111);
                        class236.field3442 = var14.method2357((byte) 125) == 1;
                        class215.field3120 = var14.method2357((byte) 111) == 1;
                        class220.field3170 = var14.method2357((byte) 111) == 1;
                        class100.field1335 = var14.method2338(0);
                        class269.field3918 = class100.field1335 > 0;
                        class242.field3521 = var14.method2338(0);
                        class275.field4089 = var14.method2338(0);
                        class63.field789 = var14.method2338(0);
                        class246.field3591 = var14.method2319((byte) 106);
                        class507.field7500 = class268.field3914.method960(-128, class246.field3591);
                        class248.field3716 = var14.method2357((byte) 116);
                        class196.field2781 = var14.method2338(0);
                        class255.field3764 = var14.method2338(0);
                        class316.field4590 = var14.method2357((byte) 114) == 1;
                        class246.field3587.field256 = class246.field3587.field282 = var14.method2367(-5042);
                        class230.field3388 = new class418();
                        class230.field3388.field5885 = var14.method2338(0);
                        if (class230.field3388.field5885 == 65535) {
                            class230.field3388.field5885 = -1;
                        }
                        class230.field3388.field5883 = var14.method2367(-5042);
                        if (class293.field4292 != class257.field3825) {
                            class230.field3388.field5889 = class230.field3388.field5885 + 50000;
                            class230.field3388.field5887 = class230.field3388.field5885 + 40000;
                        }
                        if (class500.field7085 != class293.field4292 && (class426.field5989.method2476(class334.field4839, -41) || class426.field5989.method2476(class5.field86, 17))) {
                            class426.field5989 = class230.field3388;
                        }
                    } else {
                        return;
                    }
                    if ((!class236.field3442 || class220.field3170) && !class269.field3918) {
                        try {
                            class297.method1826("unzap", -14648, class268.field3914.field2165);
                        } catch (Throwable var31) {
                        }
                    } else {
                        try {
                            class297.method1826("zap", -14648, class268.field3914.field2165);
                        } catch (Throwable var33) {
                            if (class92.field1153) {
                                try {
                                    class268.field3914.field2165.getAppletContext().showDocument(new URL(class268.field3914.field2165.getCodeBase(), "blank.ws"), "tbi");
                                } catch (Exception var30) {
                                }
                            }
                        }
                    }
                    if (class293.field4292 == class257.field3825) {
                        try {
                            class297.method1826("loggedin", -14648, class268.field3914.field2165);
                        } catch (Throwable var29) {
                        }
                    }
                    if (class32.field370 != 2 && class32.field370 != 3) {
                        class63.field786 = 0;
                        class183.method1148(2, -77);
                        class427.method2528(63);
                        class86.method623(6, (byte) 94);
                        class211.field3061 = null;
                        return;
                    }
                    class63.field786 = 12;
                }
                if (class63.field786 == 12) {
                    if (!class50.field608.method1356(3, 122)) {
                        return;
                    }
                    class50.field608.method1358(0, (byte) -113, class264.field3874.field5663, 3);
                    class63.field786 = 13;
                }
                if (class63.field786 == 13) {
                    class241 var26 = class264.field3874;
                    var26.field5665 = 0;
                    if (var26.method1516((byte) -23)) {
                        if (!class50.field608.method1356(1, 93)) {
                            return;
                        }
                        class50.field608.method1358(3, (byte) -112, var26.field5663, 1);
                    }
                    class211.field3061 = class336.method2011(-92)[var26.method1518(-128)];
                    class190.field2715 = var26.method2338(0);
                    class63.field786 = 11;
                }
                if (class63.field786 == 11) {
                    if (class50.field608.method1356(class190.field2715, 85)) {
                        class50.field608.method1358(0, (byte) -82, class264.field3874.field5663, class190.field2715);
                        class264.field3874.field5665 = 0;
                        int var27 = class190.field2715;
                        class63.field786 = 0;
                        class183.method1148(2, -88);
                        class438.method2573(51);
                        class124.method814(class264.field3874, (byte) 111);
                        class216.field3128 = -1;
                        class192.method1222(0);
                        if (class264.field3874.field5665 != var27) {
                            throw new RuntimeException("lswp pos:" + class264.field3874.field5665 + " psize:" + var27);
                        }
                        class211.field3061 = null;
                    }
                } else if (class63.field786 == 15) {
                    if (class190.field2715 == -2) {
                        if (!class50.field608.method1356(2, 108)) {
                            return;
                        }
                        class50.field608.method1358(0, (byte) -71, class264.field3874.field5663, 2);
                        class264.field3874.field5665 = 0;
                        class190.field2715 = class264.field3874.method2338(0);
                    }
                    if (class50.field608.method1356(class190.field2715, 114)) {
                        class50.field608.method1358(0, (byte) -116, class264.field3874.field5663, class190.field2715);
                        class264.field3874.field5665 = 0;
                        int var28 = class190.field2715;
                        class63.field786 = 0;
                        class183.method1148(15, 106);
                        class162.method1032(0);
                        class124.method814(class264.field3874, (byte) 81);
                        if (class264.field3874.field5665 != var28) {
                            throw new RuntimeException("lswpr pos:" + class264.field3874.field5665 + " psize:" + var28);
                        }
                        class211.field3061 = null;
                    }
                }
            } else if (class50.field608.method1356(1, 112)) {
                class50.field608.method1358(0, (byte) -108, class264.field3874.field5663, 1);
                class63.field786 = 10;
                class31.field367 = class264.field3874.field5663[0] & 0xFF;
            }
        } catch (IOException var35) {
            if (class50.field608 != null) {
                class50.field608.method1360((byte) -96);
                class50.field608 = null;
            }
            if (class431.field6094 >= 1) {
                class63.field786 = 0;
                class183.method1148(-4, -111);
                class301.method1840(-5);
            } else {
                if (class32.field370 == 2 || class32.field370 == 3) {
                    class426.field5989.field5880 = !class426.field5989.field5880;
                } else {
                    class489.field6837.field5880 = !class489.field6837.field5880;
                }
                class63.field786 = 1;
                class431.field6094++;
                class149.field1980 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(I)V")
    public static void method1354(int arg0) {
        field3157 = null;
        if (arg0 >= 21) {
            field3158 = null;
        }
    }

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "(I)V")
    public final void method1355(int arg0) {
        field3159++;
        if (this.field3155 != null && arg0 == -17098) {
            this.field3155.field3163 = this.field3163;
            this.field3163.field3155 = this.field3155;
            this.field3163 = null;
            this.field3155 = null;
        }
    }
}
