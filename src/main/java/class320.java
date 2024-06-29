import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class320 {

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "Z")
    public static boolean field5491 = false;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "Z")
    public static boolean field5489 = false;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
    public static int field5487;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
    public static int field5488;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
    public static int field5490;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
    public static int field5492;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "I")
    public static int field5493;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "[Lrd;")
    public static class135[] field5486;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V", line = 4)
    public static void method2225(int arg0) {
        if (arg0 != 0) {
            field5489 = true;
        }
        field5486 = null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BI)V", line = 14)
    public static final void method2226(byte arg0, int arg1) {
        if (arg0 < 85) {
            field5486 = (class135[]) null;
        }
        field5492++;
        if (arg1 == 0) {
            return;
        }
        if (arg1 == 1) {
            class240.method1609((byte) 55);
        } else if (arg1 == 2) {
            class153.method1145((byte) -27);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V", line = 45)
    public static final void method2227(byte arg0) {
        field5487++;
        class36.method255(false, 0);
        class73.field1330 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class51.field939.length; var2++) {
            if (class28.field383[var2] != -1 && class51.field939[var2] == null) {
                class51.field939[var2] = class246.field4184.method1016(class28.field383[var2], 100, 0);
                if (class51.field939[var2] == null) {
                    class73.field1330++;
                    var1 = false;
                }
            }
            if (class167.field2952[var2] != -1 && class115.field2021[var2] == null) {
                class115.field2021[var2] = class246.field4184.method1017(class175.field3111[var2], 0, class167.field2952[var2], (byte) 126);
                if (class115.field2021[var2] == null) {
                    var1 = false;
                    class73.field1330++;
                }
            }
            if (class253.field4323) {
                if (class35.field550[var2] != -1 && class17.field231[var2] == null) {
                    class17.field231[var2] = class246.field4184.method1016(class35.field550[var2], 100, 0);
                    if (class17.field231[var2] == null) {
                        class73.field1330++;
                        var1 = false;
                    }
                }
                if (class196.field3583[var2] != -1 && class77.field1460[var2] == null) {
                    class77.field1460[var2] = class246.field4184.method1016(class196.field3583[var2], 100, 0);
                    if (class77.field1460[var2] == null) {
                        var1 = false;
                        class73.field1330++;
                    }
                }
            }
            if (class111.field1945 != null && class13.field178[var2] == null && class111.field1945[var2] != -1) {
                class13.field178[var2] = class246.field4184.method1017(class175.field3111[var2], 0, class111.field1945[var2], (byte) 126);
                if (class13.field178[var2] == null) {
                    class73.field1330++;
                    var1 = false;
                }
            }
        }
        if (class80.field1490 == null) {
            if (class65.field1151 == null || !class249.field4233.method1026(class30.method214(new class256[] { class65.field1151.field506, class46.field855 }, 29784), false)) {
                class80.field1490 = new class242(0);
            } else if (class249.field4233.method1022((byte) 90, class30.method214(new class256[] { class65.field1151.field506, class46.field855 }, 29784))) {
                class80.field1490 = class22.method144(class249.field4233, class30.method214(new class256[] { class65.field1151.field506, class46.field855 }, 29784), (byte) 108);
            } else {
                var1 = false;
                class73.field1330++;
            }
        }
        if (!var1) {
            class284.field4925 = 1;
            return;
        }
        class29.field414 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class51.field939.length; var4++) {
            byte[] var5 = class115.field2021[var4];
            if (var5 != null) {
                int var6 = (class44.field829[var4] & 0xFF) * 64 - class10.field147;
                int var7 = (class44.field829[var4] >> 8) * 64 - class134.field2336;
                if (class153.field2744) {
                    var6 = 10;
                    var7 = 10;
                }
                var3 &= class164.method1204(127, var5, var6, var7);
            }
            if (class253.field4323) {
                byte[] var8 = class77.field1460[var4];
                if (var8 != null) {
                    int var9 = (class44.field829[var4] >> 8) * 64 - class134.field2336;
                    int var10 = (class44.field829[var4] & 0xFF) * 64 - class10.field147;
                    if (class153.field2744) {
                        var10 = 10;
                        var9 = 10;
                    }
                    var3 &= class164.method1204(-76, var8, var10, var9);
                }
            }
        }
        if (!var3) {
            class284.field4925 = 2;
            return;
        }
        if (class284.field4925 != 0) {
            class159.method1176(true, class30.method214(new class256[] { class177.field3127, class199.field3630 }, 29784), (byte) 125);
        }
        boolean var11 = false;
        class65.method506(true);
        class106.method752((byte) -91);
        if (class253.field4323 && class281.field4880) {
            for (int var12 = 0; var12 < class51.field939.length; var12++) {
                if (class77.field1460[var12] != null || class17.field231[var12] != null) {
                    var11 = true;
                    break;
                }
            }
        }
        class142.method1040(4, 104, 104, class253.field4323 ? 28 : 25, var11);
        for (int var13 = 0; var13 < 4; var13++) {
            class124.field2201[var13].method269(0);
        }
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 104; var15++) {
                for (int var16 = 0; var16 < 104; var16++) {
                    class308.field5296[var14][var15][var16] = 0;
                }
            }
        }
        class157.method1169((byte) -14, false);
        if (class253.field4323) {
            class123.field2161.method1574();
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    class123.field2158[var17][var18].field1011 = true;
                }
            }
        }
        if (class253.field4323) {
            class245.method1660();
        }
        if (class253.field4323) {
            class84.method618(28);
        }
        if (arg0 >= -68) {
            return;
        }
        class65.method506(true);
        System.gc();
        class36.method255(true, 0);
        class186.method1349(false, false);
        if (!class153.field2744) {
            class63.method490(false, false);
            class36.method255(true, 0);
            if (class253.field4323) {
                int var19 = class121.field2124.field1215[0] >> 3;
                int var20 = class121.field2124.field1254[0] >> 3;
                class101.method727(-47, var19, var20);
            }
            class285.method1993((byte) -101, false);
            if (class13.field178 != null) {
                class116.method793(0);
            }
        }
        if (class153.field2744) {
            class240.method1611(-128, false);
            class36.method255(true, 0);
            if (class253.field4323) {
                int var21 = class121.field2124.field1215[0] >> 3;
                int var22 = class121.field2124.field1254[0] >> 3;
                class101.method727(-105, var21, var22);
            }
            class204.method1450(false, 13);
        }
        class106.method752((byte) -107);
        class36.method255(true, 0);
        class51.method409(class124.field2201, false, -5);
        if (class253.field4323) {
            class245.method1649();
        }
        class36.method255(true, 0);
        int var23 = class191.field3491;
        if (class255.field4377 < var23) {
            var23 = class255.field4377;
        }
        if ((class255.field4377 - 1) > var23) {
            int var24 = class255.field4377 - 1;
        }
        if (class216.method1512(128)) {
            class130.method892(0);
        } else {
            class130.method892(class191.field3491);
        }
        class15.method86(-97);
        if (class253.field4323 && var11) {
            class49.method394(true);
            class186.method1349(false, true);
            if (!class153.field2744) {
                class63.method490(false, true);
                class36.method255(true, 0);
                class285.method1993((byte) -93, true);
            }
            if (class153.field2744) {
                class240.method1611(-124, true);
                class36.method255(true, 0);
                class204.method1450(true, 13);
            }
            class106.method752((byte) -87);
            class36.method255(true, 0);
            class51.method409(class124.field2201, true, -5);
            class36.method255(true, 0);
            class15.method86(-114);
            class49.method394(false);
        }
        if (class253.field4323) {
            for (int var25 = 0; var25 < 13; var25++) {
                for (int var26 = 0; var26 < 13; var26++) {
                    class123.field2158[var25][var26].method440(class118.field2090[0], var25 * 8, var26 * 8);
                }
            }
        }
        for (int var27 = 0; var27 < 104; var27++) {
            for (int var28 = 0; var28 < 104; var28++) {
                class236.method1587((byte) 103, var27, var28);
            }
        }
        class129.method887(0);
        class65.method506(true);
        class161.method1190(0);
        class106.method752((byte) -98);
        class50.field924 = false;
        if (class198.field3627 != null && class196.field3586 != null && class86.field1550 == 25) {
            class308.field5322.method1599(110, (byte) -61);
            class222.field3881++;
            class308.field5322.method365((byte) -32, 1057001181);
        }
        if (!class153.field2744) {
            int var29 = (class51.field937 - 6) / 8;
            int var30 = (class51.field937 + 6) / 8;
            int var31 = (class295.field5125 - 6) / 8;
            int var32 = (class295.field5125 + 6) / 8;
            for (int var33 = var29 - 1; var33 <= var30 + 1; var33++) {
                for (int var34 = var31 - 1; var34 <= var32 + 1; var34++) {
                    if (var33 < var29 || var30 < var33 || var31 > var34 || var34 > var32) {
                        class246.field4184.method1012(class30.method214(new class256[] { class198.field3621, class305.method2125((byte) 96, var33), class179.field3170, class305.method2125((byte) 48, var34) }, 29784), (byte) -93);
                        class246.field4184.method1012(class30.method214(new class256[] { class311.field5363, class305.method2125((byte) 41, var33), class179.field3170, class305.method2125((byte) 54, var34) }, 29784), (byte) -105);
                    }
                }
            }
        }
        if (class86.field1550 == 28) {
            class11.method67((byte) 74, 10);
        } else {
            class11.method67((byte) 74, 30);
            if (class196.field3586 != null) {
                class308.field5322.method1599(126, (byte) -62);
            }
        }
        class39.method299(false);
        class65.method506(true);
        class39.method297(true);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)V", line = 543)
    public static final void method2228(boolean arg0) {
        class205.method1457();
        class96.field1707 = null;
        class13.field171 = -1;
        field5488++;
        class106.method752((byte) -48);
        class276.field4751.method1261(-1);
        class290.field5012 = new class196();
        ((class27) class136.field2373).method180((byte) -49);
        class245.field4178 = new class118[255];
        class245.field4174 = 0;
        class149.method1093();
        class123.method849();
        class179.method1311(-57);
        class148.method1082(arg0, 34);
        class284.method1983(-15559);
        for (int var1 = 0; var1 < 2048; var1++) {
            class144 var2 = class300.field5172[var1];
            if (var2 != null) {
                var2.field2533 = null;
            }
        }
        if (class253.field4323) {
            class123.method842(104, 104);
            class283.method1980();
        }
        class71.method542(class285.field4956, 0, class153.field2743);
        class242.method1621(-95, class153.field2743);
        class76.field1444 = null;
        class8.field120 = null;
        class260.field4499 = null;
        class119.field2102 = null;
        class182.field3230 = null;
        if (class86.field1550 == 5) {
            class165.method1209(class153.field2743, (byte) 124);
        }
        if (class86.field1550 == 10) {
            class104.method742(false, -15214);
        }
        if (class86.field1550 == 30) {
            class11.method67((byte) 74, 25);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIIB)V", line = 604)
    public static final void method2229(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field5493++;
        if (arg4 != 90) {
            return;
        }
        for (int var5 = 0; var5 < class138.field2396; var5++) {
            if (class163.field2892[var5] + class102.field1840[var5] > arg0 && arg0 + arg2 > class163.field2892[var5] && arg3 < class56.field1017[var5] + class255.field4366[var5] && class56.field1017[var5] < arg1 + arg3) {
                class53.field974[var5] = true;
            }
        }
    }
}
