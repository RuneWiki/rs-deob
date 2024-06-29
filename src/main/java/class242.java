import java.io.UnsupportedEncodingException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class242 {

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "Ljk;")
    public static class299 field4016 = null;

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "Lbd;")
    private static class162 field4023 = class17.method142(0, "RuneScape is loading )2 please wait)3)3)3");

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "I")
    public static int field4022 = -1;

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "Lbd;")
    public static class162 field4021 = class17.method142(0, ")4a=");

    @OriginalMember(owner = "client!ei", name = "k", descriptor = "Lbd;")
    public static class162 field4026 = class17.method142(0, "n");

    @OriginalMember(owner = "client!ei", name = "m", descriptor = "Lbd;")
    public static class162 field4028 = class17.method142(0, " steht bereits auf Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!ei", name = "o", descriptor = "Lbd;")
    public static class162 field4030 = field4023;

    @OriginalMember(owner = "client!ei", name = "n", descriptor = "Lbd;")
    public static class162 field4029 = class17.method142(0, "loc");

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "I")
    public static int field4017;

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "I")
    public int field4018;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "I")
    public static int field4020;

    @OriginalMember(owner = "client!ei", name = "i", descriptor = "I")
    public int field4024;

    @OriginalMember(owner = "client!ei", name = "j", descriptor = "I")
    public static int field4025;

    @OriginalMember(owner = "client!ei", name = "l", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!ei", name = "p", descriptor = "I")
    public static int field4031;

    @OriginalMember(owner = "client!ei", name = "q", descriptor = "I")
    public int field4032;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIIII)V", line = 21)
    public static final void method1714(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 < 83) {
            method1715(-50, -67, (byte) -122);
        }
        field4020++;
        if (arg0 == arg4) {
            class19.method174(arg3, -1, arg5, arg0, arg2);
        } else if ((arg2 - arg0) >= class112.field2028 && class82.field1426 >= (arg0 + arg2) && arg3 - arg4 >= class303.field5106 && class298.field4989 >= arg3 + arg4) {
            class185.method1397(arg0, arg4, (byte) -89, arg3, arg5, arg2);
        } else {
            class51.method368(arg4, arg2, arg0, arg3, arg5, (byte) -60);
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIB)I", line = 52)
    public static final int method1715(int arg0, int arg1, byte arg2) {
        field4017++;
        if (arg1 > arg0) {
            int var3 = arg0;
            arg0 = arg1;
            arg1 = var3;
        }
        while (arg1 != 0) {
            int var4 = arg0 % arg1;
            arg0 = arg1;
            arg1 = var4;
        }
        if (arg2 > -68) {
            method1717(14, (byte) 123, (class180) null);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)V", line = 79)
    public static void method1716(byte arg0) {
        field4023 = null;
        field4016 = null;
        field4026 = null;
        field4028 = null;
        field4021 = null;
        if (arg0 != 68) {
            method1715(1, -49, (byte) -119);
        }
        field4030 = null;
        field4029 = null;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IBLoj;)V", line = 112)
    public static final void method1717(int arg0, byte arg1, class180 arg2) {
        field4019++;
        Object[] var3 = arg2.field3102;
        int var4 = (Integer) var3[0];
        class181 var5 = class56.method396(var4, arg1 + 16);
        if (var5 == null) {
            return;
        }
        class57.field885 = 0;
        int var6 = 0;
        int[] var7 = var5.field3115;
        int var8 = 0;
        int[] var9 = var5.field3114;
        byte var10 = -1;
        int var11 = -1;
        try {
            class255.field4231 = new int[var5.field3107];
            client.field1906 = new class162[var5.field3108];
            if (arg1 == -17) {
                int var12 = 0;
                int var13 = 0;
                for (int var14 = 1; var14 < var3.length; var14++) {
                    if (var3[var14] instanceof Integer) {
                        int var15 = (Integer) var3[var14];
                        if (var15 == -2147483647) {
                            var15 = arg2.field3090;
                        }
                        if (var15 == -2147483646) {
                            var15 = arg2.field3083;
                        }
                        if (var15 == -2147483645) {
                            var15 = arg2.field3099 == null ? -1 : arg2.field3099.field1235;
                        }
                        if (var15 == -2147483644) {
                            var15 = arg2.field3094;
                        }
                        if (var15 == -2147483643) {
                            var15 = arg2.field3099 == null ? -1 : arg2.field3099.field1276;
                        }
                        if (var15 == -2147483642) {
                            var15 = arg2.field3092 == null ? -1 : arg2.field3092.field1235;
                        }
                        if (var15 == -2147483641) {
                            var15 = arg2.field3092 == null ? -1 : arg2.field3092.field1276;
                        }
                        if (var15 == -2147483640) {
                            var15 = arg2.field3082;
                        }
                        if (var15 == -2147483639) {
                            var15 = arg2.field3100;
                        }
                        class255.field4231[var12++] = var15;
                    } else if (var3[var14] instanceof class162) {
                        class162 var16 = (class162) var3[var14];
                        if (var16.method1248(class228.field3798, (byte) -88)) {
                            var16 = arg2.field3096;
                        }
                        client.field1906[var13++] = var16;
                    }
                }
                int var17 = 0;
                label3956: while (true) {
                    var17++;
                    if (var17 > arg0) {
                        throw new RuntimeException("slow");
                    }
                    var11++;
                    int var483 = var7[var11];
                    int var10000;
                    int var10001;
                    if (var483 < 100) {
                        if (var483 == 0) {
                            class238.field3957[var6++] = var9[var11];
                            continue;
                        }
                        if (var483 == 1) {
                            int var18 = var9[var11];
                            class238.field3957[var6++] = class129.field2329[var18];
                            continue;
                        }
                        if (var483 == 2) {
                            int var19 = var9[var11];
                            var10000 = arg1 + 17;
                            var6--;
                            class278.method1911(var10000, var19, class238.field3957[var6]);
                            continue;
                        }
                        if (var483 == 3) {
                            class120.field2184[var8++] = var5.field3113[var11];
                            continue;
                        }
                        if (var483 == 6) {
                            var11 += var9[var11];
                            continue;
                        }
                        if (var483 == 7) {
                            var6 -= 2;
                            if (class238.field3957[var6 + 1] != class238.field3957[var6]) {
                                var11 += var9[var11];
                            }
                            continue;
                        }
                        if (var483 == 8) {
                            var6 -= 2;
                            if (class238.field3957[var6 + 1] == class238.field3957[var6]) {
                                var11 += var9[var11];
                            }
                            continue;
                        }
                        if (var483 == 9) {
                            var6 -= 2;
                            if (class238.field3957[var6 + 1] > class238.field3957[var6]) {
                                var11 += var9[var11];
                            }
                            continue;
                        }
                        if (var483 == 10) {
                            var6 -= 2;
                            if (class238.field3957[var6] > class238.field3957[var6 + 1]) {
                                var11 += var9[var11];
                            }
                            continue;
                        }
                        if (var483 == 21) {
                            if (class57.field885 == 0) {
                                return;
                            }
                            class146 var20 = class43.field695[--class57.field885];
                            class255.field4231 = var20.field2651;
                            var11 = var20.field2645;
                            var5 = var20.field2648;
                            var7 = var5.field3115;
                            client.field1906 = var20.field2646;
                            var9 = var5.field3114;
                            continue;
                        }
                        if (var483 == 25) {
                            int var21 = var9[var11];
                            class238.field3957[var6++] = class153.method1195((byte) 118, var21);
                            continue;
                        }
                        if (var483 == 27) {
                            int var22 = var9[var11];
                            var6--;
                            class55.method393((byte) 33, class238.field3957[var6], var22);
                            continue;
                        }
                        if (var483 == 31) {
                            var6 -= 2;
                            if (class238.field3957[var6 + 1] >= class238.field3957[var6]) {
                                var11 += var9[var11];
                            }
                            continue;
                        }
                        if (var483 == 32) {
                            var6 -= 2;
                            if (class238.field3957[var6] >= class238.field3957[var6 + 1]) {
                                var11 += var9[var11];
                            }
                            continue;
                        }
                        if (var483 == 33) {
                            class238.field3957[var6++] = class255.field4231[var9[var11]];
                            continue;
                        }
                        if (var483 == 34) {
                            var10001 = var9[var11];
                            var6--;
                            class255.field4231[var10001] = class238.field3957[var6];
                            continue;
                        }
                        if (var483 == 35) {
                            class120.field2184[var8++] = client.field1906[var9[var11]];
                            continue;
                        }
                        if (var483 == 36) {
                            var10001 = var9[var11];
                            var8--;
                            client.field1906[var10001] = class120.field2184[var8];
                            continue;
                        }
                        if (var483 == 37) {
                            int var23 = var9[var11];
                            var8 -= var23;
                            class162 var24 = class120.method979(30000, class120.field2184, var23, var8);
                            class120.field2184[var8++] = var24;
                            continue;
                        }
                        if (var483 == 38) {
                            var6--;
                            continue;
                        }
                        if (var483 == 39) {
                            var8--;
                            continue;
                        }
                        if (var483 == 40) {
                            int var25 = var9[var11];
                            class181 var26 = class56.method396(var25, -1);
                            class162[] var27 = new class162[var26.field3108];
                            int[] var28 = new int[var26.field3107];
                            for (int var29 = 0; var29 < var26.field3106; var29++) {
                                var28[var29] = class238.field3957[var6 + var29 - var26.field3106];
                            }
                            for (int var30 = 0; var30 < var26.field3112; var30++) {
                                var27[var30] = class120.field2184[var8 + var30 - var26.field3112];
                            }
                            var6 -= var26.field3106;
                            var8 -= var26.field3112;
                            class146 var31 = new class146();
                            var31.field2651 = class255.field4231;
                            var31.field2645 = var11;
                            var31.field2646 = client.field1906;
                            var31.field2648 = var5;
                            if (class43.field695.length <= class57.field885) {
                                throw new RuntimeException();
                            }
                            var5 = var26;
                            var11 = -1;
                            class43.field695[class57.field885++] = var31;
                            var7 = var26.field3115;
                            class255.field4231 = var28;
                            client.field1906 = var27;
                            var9 = var26.field3114;
                            continue;
                        }
                        if (var483 == 42) {
                            class238.field3957[var6++] = class8.field91[var9[var11]];
                            continue;
                        }
                        if (var483 == 43) {
                            int var32 = var9[var11];
                            var6--;
                            class8.field91[var32] = class238.field3957[var6];
                            class43.method317(var32, 96);
                            continue;
                        }
                        if (var483 == 44) {
                            int var33 = var9[var11] >> 16;
                            int var34 = var9[var11] & 0xFFFF;
                            var6--;
                            int var35 = class238.field3957[var6];
                            if (var35 >= 0 && var35 <= 5000) {
                                class279.field4697[var33] = var35;
                                byte var36 = -1;
                                if (var34 == 105) {
                                    var36 = 0;
                                }
                                int var37 = 0;
                                while (true) {
                                    if (var35 <= var37) {
                                        continue label3956;
                                    }
                                    class264.field4395[var33][var37] = var36;
                                    var37++;
                                }
                            }
                            throw new RuntimeException();
                        }
                        if (var483 == 45) {
                            var6--;
                            int var38 = class238.field3957[var6];
                            int var39 = var9[var11];
                            if (var38 >= 0 && class279.field4697[var39] > var38) {
                                class238.field3957[var6++] = class264.field4395[var39][var38];
                                continue;
                            }
                            throw new RuntimeException();
                        }
                        if (var483 == 46) {
                            var6 -= 2;
                            int var40 = var9[var11];
                            int var41 = class238.field3957[var6];
                            if (var41 >= 0 && class279.field4697[var40] > var41) {
                                class264.field4395[var40][var41] = class238.field3957[var6 + 1];
                                continue;
                            }
                            throw new RuntimeException();
                        }
                        if (var483 == 47) {
                            class162 var42 = class114.field2038[var9[var11]];
                            if (var42 == null) {
                                var42 = class109.field1955;
                            }
                            class120.field2184[var8++] = var42;
                            continue;
                        }
                        if (var483 == 48) {
                            int var43 = var9[var11];
                            var8--;
                            class114.field2038[var43] = class120.field2184[var8];
                            class244.method1724(var43, arg1 + 138);
                            continue;
                        }
                        if (var483 == 51) {
                            class235 var44 = var5.field3121[var9[var11]];
                            var6--;
                            class188 var45 = (class188) var44.method1672((long) class238.field3957[var6], arg1 ^ 0xFFFFB2DF);
                            if (var45 != null) {
                                var11 += var45.field3237;
                            }
                            continue;
                        }
                    }
                    boolean var46;
                    if (var9[var11] == 1) {
                        var46 = true;
                    } else {
                        var46 = false;
                    }
                    if (var483 < 300) {
                        if (var483 == 100) {
                            var6 -= 3;
                            int var462 = class238.field3957[var6];
                            int var463 = class238.field3957[var6 + 1];
                            int var464 = class238.field3957[var6 + 2];
                            if (var463 == 0) {
                                throw new RuntimeException();
                            }
                            class78 var465 = class61.method419((byte) 28, var462);
                            if (var465.field1363 == null) {
                                var465.field1363 = new class78[var464 + 1];
                            }
                            if (var464 >= var465.field1363.length) {
                                class78[] var466 = new class78[var464 + 1];
                                for (int var467 = 0; var467 < var465.field1363.length; var467++) {
                                    var466[var467] = var465.field1363[var467];
                                }
                                var465.field1363 = var466;
                            }
                            if (var464 > 0 && var465.field1363[var464 - 1] == null) {
                                throw new RuntimeException("Gap at:" + (var464 - 1));
                            }
                            class78 var468 = new class78();
                            var468.field1276 = var464;
                            var468.field1371 = var468.field1235 = var465.field1235;
                            var468.field1231 = var463;
                            var468.field1229 = true;
                            var465.field1363[var464] = var468;
                            if (var46) {
                                class48.field765 = var468;
                            } else {
                                class279.field4704 = var468;
                            }
                            class55.method386(0, var465);
                            continue;
                        }
                        if (var483 == 101) {
                            class78 var469 = var46 ? class48.field765 : class279.field4704;
                            if (var469.field1276 == -1) {
                                if (var46) {
                                    throw new RuntimeException("Tried to .cc_delete static .active-component!");
                                }
                                throw new RuntimeException("Tried to cc_delete static active-component!");
                            }
                            class78 var470 = class61.method419((byte) 28, var469.field1235);
                            var470.field1363[var469.field1276] = null;
                            class55.method386(arg1 ^ 0xFFFFFFEF, var470);
                            continue;
                        }
                        if (var483 == 102) {
                            var6--;
                            class78 var471 = class61.method419((byte) 28, class238.field3957[var6]);
                            var471.field1363 = null;
                            class55.method386(0, var471);
                            continue;
                        }
                        if (var483 == 200) {
                            var6 -= 2;
                            int var472 = class238.field3957[var6];
                            int var473 = class238.field3957[var6 + 1];
                            class78 var474 = class112.method903(var472, var473, -25988);
                            if (var474 != null && var473 != -1) {
                                class238.field3957[var6++] = 1;
                                if (var46) {
                                    class48.field765 = var474;
                                } else {
                                    class279.field4704 = var474;
                                }
                                continue;
                            }
                            class238.field3957[var6++] = 0;
                            continue;
                        }
                        if (var483 == 201) {
                            var6--;
                            int var475 = class238.field3957[var6];
                            class78 var476 = class61.method419((byte) 28, var475);
                            if (var476 == null) {
                                class238.field3957[var6++] = 0;
                            } else {
                                class238.field3957[var6++] = 1;
                                if (var46) {
                                    class48.field765 = var476;
                                } else {
                                    class279.field4704 = var476;
                                }
                            }
                            continue;
                        }
                    } else if (var483 < 500) {
                        if (var483 == 403) {
                            var6 -= 2;
                            int var47 = class238.field3957[var6];
                            if (var47 >= 7) {
                                var47 -= 7;
                            }
                            int var48 = class238.field3957[var6 + 1];
                            class122.field2215.field600.method1492(var47, var48, 0);
                            continue;
                        }
                        if (var483 == 404) {
                            var6 -= 2;
                            int var49 = class238.field3957[var6];
                            int var50 = class238.field3957[var6 + 1];
                            class122.field2215.field600.method1498(var49, arg1 + 1073741841, var50);
                            continue;
                        }
                        if (var483 == 410) {
                            var6--;
                            boolean var51 = class238.field3957[var6] != 0;
                            class122.field2215.field600.method1490(var51, true);
                            continue;
                        }
                    } else if (var483 >= 1000 && var483 < 1100 || var483 >= 2000 && var483 < 2100) {
                        class78 var456;
                        if (var483 >= 2000) {
                            var483 -= 1000;
                            var6--;
                            var456 = class61.method419((byte) 28, class238.field3957[var6]);
                        } else {
                            var456 = var46 ? class48.field765 : class279.field4704;
                        }
                        if (var483 == 1000) {
                            var6 -= 4;
                            var456.field1375 = class238.field3957[var6];
                            var456.field1239 = class238.field3957[var6 + 1];
                            int var457 = class238.field3957[var6 + 2];
                            int var458 = class238.field3957[var6 + 3];
                            if (var457 < 0) {
                                var457 = 0;
                            } else if (var457 > 5) {
                                var457 = 5;
                            }
                            if (var458 < 0) {
                                var458 = 0;
                            } else if (var458 > 5) {
                                var458 = 5;
                            }
                            var456.field1254 = (byte) var457;
                            var456.field1244 = (byte) var458;
                            class55.method386(arg1 ^ 0xFFFFFFEF, var456);
                            class48.method356((byte) 50, var456);
                            if (var456.field1276 == -1) {
                                class18.method166(-125, var456.field1235);
                            }
                            continue;
                        }
                        if (var483 == 1001) {
                            var6 -= 4;
                            var456.field1219 = class238.field3957[var6];
                            var456.field1278 = class238.field3957[var6 + 1];
                            var456.field1372 = 0;
                            var456.field1273 = 0;
                            int var459 = class238.field3957[var6 + 3];
                            if (var459 < 0) {
                                var459 = 0;
                            } else if (var459 > 4) {
                                var459 = 4;
                            }
                            int var460 = class238.field3957[var6 + 2];
                            if (var460 < 0) {
                                var460 = 0;
                            } else if (var460 > 4) {
                                var460 = 4;
                            }
                            var456.field1310 = (byte) var460;
                            var456.field1242 = (byte) var459;
                            class55.method386(0, var456);
                            class48.method356((byte) 50, var456);
                            if (var456.field1231 == 0) {
                                class138.method1077(var456, arg1 ^ 0xFFFFFF87, false);
                            }
                            continue;
                        }
                        if (var483 == 1003) {
                            var6--;
                            boolean var461 = class238.field3957[var6] == 1;
                            if (var461 != var456.field1318) {
                                var456.field1318 = var461;
                                class55.method386(0, var456);
                            }
                            if (var456.field1276 == -1) {
                                class7.method40(false, var456.field1235);
                            }
                            continue;
                        }
                        if (var483 == 1004) {
                            var6 -= 2;
                            var456.field1294 = class238.field3957[var6];
                            var456.field1304 = class238.field3957[var6 + 1];
                            class55.method386(0, var456);
                            class48.method356((byte) 50, var456);
                            if (var456.field1231 == 0) {
                                class138.method1077(var456, 118, false);
                            }
                            continue;
                        }
                    } else if (var483 >= 1100 && var483 < 1200 || var483 >= 2100 && var483 < 2200) {
                        class78 var52;
                        if (var483 < 2000) {
                            var52 = var46 ? class48.field765 : class279.field4704;
                        } else {
                            var6--;
                            var52 = class61.method419((byte) 28, class238.field3957[var6]);
                            var483 -= 1000;
                        }
                        if (var483 == 1100) {
                            var6 -= 2;
                            var52.field1326 = class238.field3957[var6];
                            if (var52.field1326 > (var52.field1283 - var52.field1340)) {
                                var52.field1326 = var52.field1283 - var52.field1340;
                            }
                            if (var52.field1326 < 0) {
                                var52.field1326 = 0;
                            }
                            var52.field1258 = class238.field3957[var6 + 1];
                            if ((var52.field1220 - var52.field1367) < var52.field1258) {
                                var52.field1258 = var52.field1220 - var52.field1367;
                            }
                            if (var52.field1258 < 0) {
                                var52.field1258 = 0;
                            }
                            class55.method386(0, var52);
                            if (var52.field1276 == -1) {
                                class98.method782(-14796, var52.field1235);
                            }
                            continue;
                        }
                        if (var483 == 1101) {
                            var6--;
                            var52.field1339 = class238.field3957[var6];
                            class55.method386(arg1 + 17, var52);
                            if (var52.field1276 == -1) {
                                class306.method2081(6, var52.field1235);
                            }
                            continue;
                        }
                        if (var483 == 1102) {
                            var6--;
                            var52.field1223 = class238.field3957[var6] == 1;
                            class55.method386(0, var52);
                            continue;
                        }
                        if (var483 == 1103) {
                            var6--;
                            var52.field1342 = class238.field3957[var6];
                            class55.method386(arg1 + 17, var52);
                            continue;
                        }
                        if (var483 == 1104) {
                            var6--;
                            var52.field1343 = class238.field3957[var6];
                            class55.method386(0, var52);
                            continue;
                        }
                        if (var483 == 1105) {
                            var6--;
                            var52.field1240 = class238.field3957[var6];
                            class55.method386(0, var52);
                            continue;
                        }
                        if (var483 == 1106) {
                            var6--;
                            var52.field1357 = class238.field3957[var6];
                            class55.method386(0, var52);
                            continue;
                        }
                        if (var483 == 1107) {
                            var6--;
                            var52.field1362 = class238.field3957[var6] == 1;
                            class55.method386(0, var52);
                            continue;
                        }
                        if (var483 == 1108) {
                            var52.field1361 = 1;
                            var6--;
                            var52.field1322 = class238.field3957[var6];
                            class55.method386(0, var52);
                            if (var52.field1276 == -1) {
                                class317.method2177(var52.field1235, 16);
                            }
                            continue;
                        }
                        if (var483 == 1109) {
                            var6 -= 6;
                            var52.field1327 = class238.field3957[var6];
                            var52.field1253 = class238.field3957[var6 + 1];
                            var52.field1237 = class238.field3957[var6 + 2];
                            var52.field1323 = class238.field3957[var6 + 3];
                            var52.field1249 = class238.field3957[var6 + 4];
                            var52.field1272 = class238.field3957[var6 + 5];
                            class55.method386(0, var52);
                            if (var52.field1276 == -1) {
                                class292.method2021(var52.field1235, (byte) 32);
                                class182.method1385((byte) -51, var52.field1235);
                            }
                            continue;
                        }
                        if (var483 == 1110) {
                            var6--;
                            int var53 = class238.field3957[var6];
                            if (var52.field1317 != var53) {
                                var52.field1317 = var53;
                                var52.field1288 = 0;
                                var52.field1270 = 0;
                                class55.method386(0, var52);
                            }
                            if (var52.field1276 == -1) {
                                class295.method2025(var52.field1235, false);
                            }
                            continue;
                        }
                        if (var483 == 1111) {
                            var6--;
                            var52.field1280 = class238.field3957[var6] == 1;
                            class55.method386(0, var52);
                            continue;
                        }
                        if (var483 == 1112) {
                            var8--;
                            class162 var54 = class120.field2184[var8];
                            if (!var54.method1248(var52.field1370, (byte) -19)) {
                                var52.field1370 = var54;
                                class55.method386(arg1 ^ 0xFFFFFFEF, var52);
                            }
                            if (var52.field1276 == -1) {
                                class40.method299(30, var52.field1235);
                            }
                            continue;
                        }
                        if (var483 == 1113) {
                            var6--;
                            var52.field1354 = class238.field3957[var6];
                            class55.method386(arg1 + 17, var52);
                            continue;
                        }
                        if (var483 == 1114) {
                            var6 -= 3;
                            var52.field1365 = class238.field3957[var6];
                            var52.field1255 = class238.field3957[var6 + 1];
                            var52.field1227 = class238.field3957[var6 + 2];
                            class55.method386(0, var52);
                            continue;
                        }
                        if (var483 == 1115) {
                            var6--;
                            var52.field1277 = class238.field3957[var6] == 1;
                            class55.method386(0, var52);
                            continue;
                        }
                        if (var483 == 1116) {
                            var6--;
                            var52.field1366 = class238.field3957[var6];
                            class55.method386(arg1 ^ 0xFFFFFFEF, var52);
                            continue;
                        }
                        if (var483 == 1117) {
                            var6--;
                            var52.field1281 = class238.field3957[var6];
                            class55.method386(0, var52);
                            continue;
                        }
                        if (var483 == 1118) {
                            var6--;
                            var52.field1230 = class238.field3957[var6] == 1;
                            class55.method386(0, var52);
                            continue;
                        }
                        if (var483 == 1119) {
                            var6--;
                            var52.field1316 = class238.field3957[var6] == 1;
                            class55.method386(arg1 ^ 0xFFFFFFEF, var52);
                            continue;
                        }
                        if (var483 == 1120) {
                            var6 -= 2;
                            var52.field1283 = class238.field3957[var6];
                            var52.field1220 = class238.field3957[var6 + 1];
                            class55.method386(0, var52);
                            if (var52.field1231 == 0) {
                                class138.method1077(var52, arg1 ^ 0xFFFFFF85, false);
                            }
                            continue;
                        }
                        if (var483 == 1121) {
                            var6 -= 2;
                            var52.field1373 = (short) class238.field3957[var6];
                            var52.field1299 = (short) class238.field3957[var6 + 1];
                            class55.method386(arg1 + 17, var52);
                            continue;
                        }
                        if (var483 == 1122) {
                            var6--;
                            var52.field1252 = class238.field3957[var6] == 1;
                            class55.method386(0, var52);
                            continue;
                        }
                    } else if (!(var483 < 1200 || var483 >= 1300) || !(var483 < 2200 || var483 >= 2300)) {
                        class78 var55;
                        if (var483 >= 2000) {
                            var483 -= 1000;
                            var6--;
                            var55 = class61.method419((byte) 28, class238.field3957[var6]);
                        } else {
                            var55 = var46 ? class48.field765 : class279.field4704;
                        }
                        class55.method386(0, var55);
                        if (var483 == 1200 || var483 == 1205) {
                            var6 -= 2;
                            int var56 = class238.field3957[var6];
                            int var57 = class238.field3957[var6 + 1];
                            if (var55.field1276 == -1) {
                                class244.method1727((byte) 101, var55.field1235);
                                class292.method2021(var55.field1235, (byte) -89);
                                class182.method1385((byte) -51, var55.field1235);
                            }
                            if (var56 == -1) {
                                var55.field1361 = 1;
                                var55.field1344 = -1;
                                var55.field1322 = -1;
                            } else {
                                var55.field1271 = var57;
                                var55.field1344 = var56;
                                class116 var58 = class304.method2075(var56, 4);
                                var55.field1249 = var58.field2061;
                                var55.field1237 = var58.field2077;
                                var55.field1327 = var58.field2070;
                                var55.field1272 = var58.field2115;
                                if (var483 == 1205) {
                                    var55.field1241 = false;
                                } else {
                                    var55.field1241 = true;
                                }
                                var55.field1253 = var58.field2092;
                                if (var55.field1273 > 0) {
                                    var55.field1272 = var55.field1272 * 32 / var55.field1273;
                                } else if (var55.field1219 > 0) {
                                    var55.field1272 = var55.field1272 * 32 / var55.field1219;
                                }
                                var55.field1323 = var58.field2099;
                            }
                            continue;
                        }
                        if (var483 == 1201) {
                            var55.field1361 = 2;
                            var6--;
                            var55.field1322 = class238.field3957[var6];
                            if (var55.field1276 == -1) {
                                class317.method2177(var55.field1235, arg1 + 40);
                            }
                            continue;
                        }
                        if (var483 == 1202) {
                            var55.field1361 = 3;
                            var55.field1322 = class122.field2215.field600.method1497(66);
                            if (var55.field1276 == -1) {
                                class317.method2177(var55.field1235, -123);
                            }
                            continue;
                        }
                        if (var483 == 1203) {
                            var55.field1361 = 6;
                            var6--;
                            var55.field1322 = class238.field3957[var6];
                            if (var55.field1276 == -1) {
                                class317.method2177(var55.field1235, 104);
                            }
                            continue;
                        }
                        if (var483 == 1204) {
                            var55.field1361 = 5;
                            var6--;
                            var55.field1322 = class238.field3957[var6];
                            if (var55.field1276 == -1) {
                                class317.method2177(var55.field1235, 63);
                            }
                            continue;
                        }
                    } else if ((var483 < 1300 || var483 >= 1400) && (var483 < 2300 || var483 >= 2400)) {
                        if (var483 >= 1400 && var483 < 1500 || var483 >= 2400 && var483 < 2500) {
                            class78 var449;
                            if (var483 >= 2000) {
                                var6--;
                                var449 = class61.method419((byte) 28, class238.field3957[var6]);
                                var483 -= 1000;
                            } else {
                                var449 = var46 ? class48.field765 : class279.field4704;
                            }
                            var8--;
                            class162 var450 = class120.field2184[var8];
                            int[] var451 = null;
                            if (var450.method1249((byte) -118) > 0 && var450.method1246(arg1 ^ 0xFFFFFF87, var450.method1249((byte) -118) - 1) == 89) {
                                var6--;
                                int var452 = class238.field3957[var6];
                                if (var452 > 0) {
                                    var451 = new int[var452];
                                    while ((var452--) > 0) {
                                        var6--;
                                        var451[var452] = class238.field3957[var6];
                                    }
                                }
                                var450 = var450.method1283(0, var450.method1249((byte) -118) - 1, (byte) 105);
                            }
                            Object[] var453 = new Object[var450.method1249((byte) -118) + 1];
                            for (int var454 = var453.length - 1; var454 >= 1; var454--) {
                                if (var450.method1246(arg1 ^ -67, var454 - 1) == 115) {
                                    var8--;
                                    var453[var454] = class120.field2184[var8];
                                } else {
                                    var6--;
                                    var453[var454] = Integer.valueOf(class238.field3957[var6]);
                                }
                            }
                            var6--;
                            int var455 = class238.field3957[var6];
                            if (var455 == -1) {
                                var453 = null;
                            } else {
                                var453[0] = Integer.valueOf(var455);
                            }
                            var449.field1332 = true;
                            if (var483 == 1400) {
                                var449.field1355 = var453;
                            } else if (var483 == 1401) {
                                var449.field1383 = var453;
                            } else if (var483 == 1402) {
                                var449.field1308 = var453;
                            } else if (var483 == 1403) {
                                var449.field1337 = var453;
                            } else if (var483 == 1404) {
                                var449.field1379 = var453;
                            } else if (var483 == 1405) {
                                var449.field1284 = var453;
                            } else if (var483 == 1406) {
                                var449.field1307 = var453;
                            } else if (var483 == 1407) {
                                var449.field1378 = var451;
                                var449.field1303 = var453;
                            } else if (var483 == 1408) {
                                var449.field1358 = var453;
                            } else if (var483 == 1409) {
                                var449.field1356 = var453;
                            } else if (var483 == 1410) {
                                var449.field1228 = var453;
                            } else if (var483 == 1411) {
                                var449.field1221 = var453;
                            } else if (var483 == 1412) {
                                var449.field1352 = var453;
                            } else if (var483 == 1414) {
                                var449.field1333 = var453;
                                var449.field1369 = var451;
                            } else if (var483 == 1415) {
                                var449.field1293 = var451;
                                var449.field1222 = var453;
                            } else if (var483 == 1416) {
                                var449.field1282 = var453;
                            } else if (var483 == 1417) {
                                var449.field1265 = var453;
                            } else if (var483 == 1418) {
                                var449.field1311 = var453;
                            } else if (var483 == 1419) {
                                var449.field1330 = var453;
                            } else if (var483 == 1420) {
                                var449.field1298 = var453;
                            } else if (var483 == 1421) {
                                var449.field1279 = var453;
                            } else if (var483 == 1422) {
                                var449.field1285 = var453;
                            } else if (var483 == 1423) {
                                var449.field1291 = var453;
                            } else if (var483 == 1424) {
                                var449.field1335 = var453;
                            } else if (var483 == 1425) {
                                var449.field1321 = var453;
                            } else if (var483 == 1426) {
                                var449.field1225 = var453;
                            } else if (var483 == 1427) {
                                var449.field1268 = var453;
                            } else if (var483 == 1428) {
                                var449.field1319 = var451;
                                var449.field1380 = var453;
                            } else if (var483 == 1429) {
                                var449.field1302 = var453;
                                var449.field1336 = var451;
                            }
                            continue;
                        }
                        if (var483 < 1600) {
                            class78 var63 = var46 ? class48.field765 : class279.field4704;
                            if (var483 == 1500) {
                                class238.field3957[var6++] = var63.field1377;
                                continue;
                            }
                            if (var483 == 1501) {
                                class238.field3957[var6++] = var63.field1289;
                                continue;
                            }
                            if (var483 == 1502) {
                                class238.field3957[var6++] = var63.field1340;
                                continue;
                            }
                            if (var483 == 1503) {
                                class238.field3957[var6++] = var63.field1367;
                                continue;
                            }
                            if (var483 == 1504) {
                                class238.field3957[var6++] = var63.field1318 ? 1 : 0;
                                continue;
                            }
                            if (var483 == 1505) {
                                class238.field3957[var6++] = var63.field1371;
                                continue;
                            }
                        } else if (var483 < 1700) {
                            class78 var448 = var46 ? class48.field765 : class279.field4704;
                            if (var483 == 1600) {
                                class238.field3957[var6++] = var448.field1326;
                                continue;
                            }
                            if (var483 == 1601) {
                                class238.field3957[var6++] = var448.field1258;
                                continue;
                            }
                            if (var483 == 1602) {
                                class120.field2184[var8++] = var448.field1370;
                                continue;
                            }
                            if (var483 == 1603) {
                                class238.field3957[var6++] = var448.field1283;
                                continue;
                            }
                            if (var483 == 1604) {
                                class238.field3957[var6++] = var448.field1220;
                                continue;
                            }
                            if (var483 == 1605) {
                                class238.field3957[var6++] = var448.field1272;
                                continue;
                            }
                            if (var483 == 1606) {
                                class238.field3957[var6++] = var448.field1237;
                                continue;
                            }
                            if (var483 == 1607) {
                                class238.field3957[var6++] = var448.field1249;
                                continue;
                            }
                            if (var483 == 1608) {
                                class238.field3957[var6++] = var448.field1323;
                                continue;
                            }
                            if (var483 == 1609) {
                                class238.field3957[var6++] = var448.field1342;
                                continue;
                            }
                        } else if (var483 < 1800) {
                            class78 var64 = var46 ? class48.field765 : class279.field4704;
                            if (var483 == 1700) {
                                class238.field3957[var6++] = var64.field1344;
                                continue;
                            }
                            if (var483 == 1701) {
                                if (var64.field1344 == -1) {
                                    class238.field3957[var6++] = 0;
                                } else {
                                    class238.field3957[var6++] = var64.field1271;
                                }
                                continue;
                            }
                            if (var483 == 1702) {
                                class238.field3957[var6++] = var64.field1276;
                                continue;
                            }
                        } else if (var483 < 1900) {
                            class78 var65 = var46 ? class48.field765 : class279.field4704;
                            if (var483 == 1800) {
                                class238.field3957[var6++] = class148.method1173(-172139252, client.method861(var65));
                                continue;
                            }
                            if (var483 == 1801) {
                                var6--;
                                int var66 = class238.field3957[var6];
                                int var484 = var66 - 1;
                                if (var65.field1232 != null && var65.field1232.length > var484 && var65.field1232[var484] != null) {
                                    class120.field2184[var8++] = var65.field1232[var484];
                                    continue;
                                }
                                class120.field2184[var8++] = class149.field2684;
                                continue;
                            }
                            if (var483 == 1802) {
                                if (var65.field1320 == null) {
                                    class120.field2184[var8++] = class149.field2684;
                                } else {
                                    class120.field2184[var8++] = var65.field1320;
                                }
                                continue;
                            }
                        } else if (var483 < 2600) {
                            var6--;
                            class78 var67 = class61.method419((byte) 28, class238.field3957[var6]);
                            if (var483 == 2500) {
                                class238.field3957[var6++] = var67.field1377;
                                continue;
                            }
                            if (var483 == 2501) {
                                class238.field3957[var6++] = var67.field1289;
                                continue;
                            }
                            if (var483 == 2502) {
                                class238.field3957[var6++] = var67.field1340;
                                continue;
                            }
                            if (var483 == 2503) {
                                class238.field3957[var6++] = var67.field1367;
                                continue;
                            }
                            if (var483 == 2504) {
                                class238.field3957[var6++] = var67.field1318 ? 1 : 0;
                                continue;
                            }
                            if (var483 == 2505) {
                                class238.field3957[var6++] = var67.field1371;
                                continue;
                            }
                        } else if (var483 < 2700) {
                            var6--;
                            class78 var447 = class61.method419((byte) 28, class238.field3957[var6]);
                            if (var483 == 2600) {
                                class238.field3957[var6++] = var447.field1326;
                                continue;
                            }
                            if (var483 == 2601) {
                                class238.field3957[var6++] = var447.field1258;
                                continue;
                            }
                            if (var483 == 2602) {
                                class120.field2184[var8++] = var447.field1370;
                                continue;
                            }
                            if (var483 == 2603) {
                                class238.field3957[var6++] = var447.field1283;
                                continue;
                            }
                            if (var483 == 2604) {
                                class238.field3957[var6++] = var447.field1220;
                                continue;
                            }
                            if (var483 == 2605) {
                                class238.field3957[var6++] = var447.field1272;
                                continue;
                            }
                            if (var483 == 2606) {
                                class238.field3957[var6++] = var447.field1237;
                                continue;
                            }
                            if (var483 == 2607) {
                                class238.field3957[var6++] = var447.field1249;
                                continue;
                            }
                            if (var483 == 2608) {
                                class238.field3957[var6++] = var447.field1323;
                                continue;
                            }
                            if (var483 == 2609) {
                                class238.field3957[var6++] = var447.field1342;
                                continue;
                            }
                        } else if (var483 < 2800) {
                            if (var483 == 2700) {
                                var6--;
                                class78 var437 = class61.method419((byte) 28, class238.field3957[var6]);
                                class238.field3957[var6++] = var437.field1344;
                                continue;
                            }
                            if (var483 == 2701) {
                                var6--;
                                class78 var438 = class61.method419((byte) 28, class238.field3957[var6]);
                                if (var438.field1344 == -1) {
                                    class238.field3957[var6++] = 0;
                                } else {
                                    class238.field3957[var6++] = var438.field1271;
                                }
                                continue;
                            }
                            if (var483 == 2702) {
                                var6--;
                                int var439 = class238.field3957[var6];
                                class172 var440 = (class172) class137.field2440.method1672((long) var439, 19760);
                                if (var440 == null) {
                                    class238.field3957[var6++] = 0;
                                } else {
                                    class238.field3957[var6++] = 1;
                                }
                                continue;
                            }
                            if (var483 == 2703) {
                                var6--;
                                class78 var441 = class61.method419((byte) 28, class238.field3957[var6]);
                                if (var441.field1363 == null) {
                                    class238.field3957[var6++] = 0;
                                    continue;
                                }
                                int var442 = var441.field1363.length;
                                for (int var443 = 0; var443 < var441.field1363.length; var443++) {
                                    if (var441.field1363[var443] == null) {
                                        var442 = var443;
                                        break;
                                    }
                                }
                                class238.field3957[var6++] = var442;
                                continue;
                            }
                            if (var483 == 2704 || var483 == 2705) {
                                var6 -= 2;
                                int var444 = class238.field3957[var6];
                                int var445 = class238.field3957[var6 + 1];
                                class172 var446 = (class172) class137.field2440.method1672((long) var444, 19760);
                                if (var446 != null && var446.field2985 == var445) {
                                    class238.field3957[var6++] = 1;
                                    continue;
                                }
                                class238.field3957[var6++] = 0;
                                continue;
                            }
                        } else if (var483 < 2900) {
                            var6--;
                            class78 var68 = class61.method419((byte) 28, class238.field3957[var6]);
                            if (var483 == 2800) {
                                class238.field3957[var6++] = class148.method1173(-172139252, client.method861(var68));
                                continue;
                            }
                            if (var483 == 2801) {
                                var6--;
                                int var69 = class238.field3957[var6];
                                int var485 = var69 - 1;
                                if (var68.field1232 != null && var68.field1232.length > var485 && var68.field1232[var485] != null) {
                                    class120.field2184[var8++] = var68.field1232[var485];
                                    continue;
                                }
                                class120.field2184[var8++] = class149.field2684;
                                continue;
                            }
                            if (var483 == 2802) {
                                if (var68.field1320 == null) {
                                    class120.field2184[var8++] = class149.field2684;
                                } else {
                                    class120.field2184[var8++] = var68.field1320;
                                }
                                continue;
                            }
                        } else if (var483 < 3200) {
                            if (var483 == 3100) {
                                var8--;
                                class162 var70 = class120.field2184[var8];
                                class82.method633(0, var70, class149.field2684, 99);
                                continue;
                            }
                            if (var483 == 3101) {
                                var6 -= 2;
                                class290.method2010(-27020, class122.field2215, class238.field3957[var6], class238.field3957[var6 + 1]);
                                continue;
                            }
                            if (var483 == 3103) {
                                class56.method398((byte) 62);
                                continue;
                            }
                            if (var483 == 3104) {
                                var8--;
                                class162 var71 = class120.field2184[var8];
                                class147.field2664++;
                                int var72 = 0;
                                if (var71.method1251(false)) {
                                    var72 = var71.method1238(-90);
                                }
                                class187.field3229.method338(40, (byte) 8);
                                class187.field3229.method730(false, var72);
                                continue;
                            }
                            if (var483 == 3105) {
                                class229.field3811++;
                                var8--;
                                class162 var73 = class120.field2184[var8];
                                class187.field3229.method338(113, (byte) 8);
                                class187.field3229.method745(var73.method1256(0), (byte) -124);
                                continue;
                            }
                            if (var483 == 3106) {
                                class71.field1142++;
                                var8--;
                                class162 var74 = class120.field2184[var8];
                                class187.field3229.method338(228, (byte) 8);
                                class187.field3229.method753(var74.method1249((byte) -118) + 1, true);
                                class187.field3229.method727(var74, -253);
                                continue;
                            }
                            if (var483 == 3107) {
                                var6--;
                                int var75 = class238.field3957[var6];
                                var8--;
                                class162 var76 = class120.field2184[var8];
                                class160.method1225(var75, var76, true);
                                continue;
                            }
                            if (var483 == 3108) {
                                var6 -= 3;
                                int var77 = class238.field3957[var6];
                                int var78 = class238.field3957[var6 + 1];
                                int var79 = class238.field3957[var6 + 2];
                                class78 var80 = class61.method419((byte) 28, var79);
                                class126.method1021(var80, var77, var78, true);
                                continue;
                            }
                            if (var483 == 3109) {
                                var6 -= 2;
                                int var81 = class238.field3957[var6 + 1];
                                class78 var82 = var46 ? class48.field765 : class279.field4704;
                                int var83 = class238.field3957[var6];
                                class126.method1021(var82, var83, var81, true);
                                continue;
                            }
                            if (var483 == 3110) {
                                class3.field25++;
                                var6--;
                                int var84 = class238.field3957[var6];
                                class187.field3229.method338(109, (byte) 8);
                                class187.field3229.method751(var84, -1044017976);
                                continue;
                            }
                        } else if (var483 < 3300) {
                            if (var483 == 3200) {
                                var6 -= 3;
                                class89.method676(33, class238.field3957[var6], class238.field3957[var6 + 1], class238.field3957[var6 + 2]);
                                continue;
                            }
                            if (var483 == 3201) {
                                var6--;
                                class199.method1485(true, class238.field3957[var6]);
                                continue;
                            }
                            if (var483 == 3202) {
                                var6 -= 2;
                                class203.method1510((byte) 100, class238.field3957[var6], class238.field3957[var6 + 1]);
                                continue;
                            }
                        } else if (var483 < 3400) {
                            if (var483 == 3300) {
                                class238.field3957[var6++] = class90.field1598;
                                continue;
                            }
                            if (var483 == 3301) {
                                var6 -= 2;
                                int var85 = class238.field3957[var6];
                                int var86 = class238.field3957[var6 + 1];
                                class238.field3957[var6++] = class74.method530(-13458, var85, var86);
                                continue;
                            }
                            if (var483 == 3302) {
                                var6 -= 2;
                                int var87 = class238.field3957[var6 + 1];
                                int var88 = class238.field3957[var6];
                                class238.field3957[var6++] = class303.method2069(var87, (byte) 127, var88);
                                continue;
                            }
                            if (var483 == 3303) {
                                var6 -= 2;
                                int var89 = class238.field3957[var6];
                                int var90 = class238.field3957[var6 + 1];
                                class238.field3957[var6++] = class156.method1214(var89, -115, var90);
                                continue;
                            }
                            if (var483 == 3304) {
                                var6--;
                                int var91 = class238.field3957[var6];
                                class238.field3957[var6++] = class240.method1700(var91, class110.method887(arg1, -111)).field3618;
                                continue;
                            }
                            if (var483 == 3305) {
                                var6--;
                                int var92 = class238.field3957[var6];
                                class238.field3957[var6++] = class50.field807[var92];
                                continue;
                            }
                            if (var483 == 3306) {
                                var6--;
                                int var93 = class238.field3957[var6];
                                class238.field3957[var6++] = class58.field914[var93];
                                continue;
                            }
                            if (var483 == 3307) {
                                var6--;
                                int var94 = class238.field3957[var6];
                                class238.field3957[var6++] = class135.field2404[var94];
                                continue;
                            }
                            if (var483 == 3308) {
                                int var95 = class157.field2765;
                                int var96 = (class122.field2215.field5047 >> 7) + class258.field4294;
                                int var97 = (class122.field2215.field5013 >> 7) + class178.field3052;
                                class238.field3957[var6++] = (var95 << 28) + ((var97 << 14) + var96);
                                continue;
                            }
                            if (var483 == 3309) {
                                var6--;
                                int var98 = class238.field3957[var6];
                                class238.field3957[var6++] = class92.method695(var98, 268424729) >> 14;
                                continue;
                            }
                            if (var483 == 3310) {
                                var6--;
                                int var99 = class238.field3957[var6];
                                class238.field3957[var6++] = var99 >> 28;
                                continue;
                            }
                            if (var483 == 3311) {
                                var6--;
                                int var100 = class238.field3957[var6];
                                class238.field3957[var6++] = class92.method695(16383, var100);
                                continue;
                            }
                            if (var483 == 3312) {
                                class238.field3957[var6++] = class261.field4356 ? 1 : 0;
                                continue;
                            }
                            if (var483 == 3313) {
                                var6 -= 2;
                                int var101 = class238.field3957[var6 + 1];
                                int var102 = class238.field3957[var6] + 32768;
                                class238.field3957[var6++] = class74.method530(-13458, var102, var101);
                                continue;
                            }
                            if (var483 == 3314) {
                                var6 -= 2;
                                int var103 = class238.field3957[var6] + 32768;
                                int var104 = class238.field3957[var6 + 1];
                                class238.field3957[var6++] = class303.method2069(var104, (byte) 127, var103);
                                continue;
                            }
                            if (var483 == 3315) {
                                var6 -= 2;
                                int var105 = class238.field3957[var6] + 32768;
                                int var106 = class238.field3957[var6 + 1];
                                class238.field3957[var6++] = class156.method1214(var105, -105, var106);
                                continue;
                            }
                            if (var483 == 3316) {
                                if (class83.field1438 >= 2) {
                                    class238.field3957[var6++] = class83.field1438;
                                } else {
                                    class238.field3957[var6++] = 0;
                                }
                                continue;
                            }
                            if (var483 == 3317) {
                                class238.field3957[var6++] = class181.field3119;
                                continue;
                            }
                            if (var483 == 3318) {
                                class238.field3957[var6++] = class212.field3566;
                                continue;
                            }
                            if (var483 == 3321) {
                                class238.field3957[var6++] = class259.field4313;
                                continue;
                            }
                            if (var483 == 3322) {
                                class238.field3957[var6++] = class259.field4312;
                                continue;
                            }
                            if (var483 == 3323) {
                                if (class111.field2010 >= 5 && class111.field2010 <= 9) {
                                    class238.field3957[var6++] = 1;
                                    continue;
                                }
                                class238.field3957[var6++] = 0;
                                continue;
                            }
                            if (var483 == 3324) {
                                if (class111.field2010 >= 5 && class111.field2010 <= 9) {
                                    class238.field3957[var6++] = class111.field2010;
                                    continue;
                                }
                                class238.field3957[var6++] = 0;
                                continue;
                            }
                            if (var483 == 3325) {
                                class238.field3957[var6++] = class95.field1733 ? 1 : 0;
                                continue;
                            }
                            if (var483 == 3326) {
                                class238.field3957[var6++] = class122.field2215.field642;
                                continue;
                            }
                            if (var483 == 3327) {
                                class238.field3957[var6++] = class122.field2215.field600.field3404 ? 1 : 0;
                                continue;
                            }
                            if (var483 == 3328) {
                                class238.field3957[var6++] = class202.field3426;
                                continue;
                            }
                            if (var483 == 3329) {
                                class238.field3957[var6++] = class228.field3800;
                                continue;
                            }
                            if (var483 == 3330) {
                                var6--;
                                int var107 = class238.field3957[var6];
                                class238.field3957[var6++] = class129.method1036(arg1 - 5024, var107);
                                continue;
                            }
                            if (var483 == 3331) {
                                var6 -= 2;
                                int var108 = class238.field3957[var6];
                                int var109 = class238.field3957[var6 + 1];
                                class238.field3957[var6++] = class134.method1057(var109, (byte) 111, false, var108);
                                continue;
                            }
                            if (var483 == 3332) {
                                var6 -= 2;
                                int var110 = class238.field3957[var6];
                                int var111 = class238.field3957[var6 + 1];
                                class238.field3957[var6++] = class134.method1057(var111, (byte) 101, true, var110);
                                continue;
                            }
                            if (var483 == 3333) {
                                class238.field3957[var6++] = class94.field1726;
                                continue;
                            }
                            if (var483 == 3335) {
                                class238.field3957[var6++] = class260.field4344;
                                continue;
                            }
                        } else if (var483 < 3500) {
                            if (var483 == 3400) {
                                var6 -= 2;
                                int var420 = class238.field3957[var6];
                                int var421 = class238.field3957[var6 + 1];
                                class313 var422 = class179.method1359(19661184, var420);
                                if (var422.field5282 == 115) {
                                }
                                class120.field2184[var8++] = var422.method2141(0, var421);
                                continue;
                            }
                            if (var483 == 3408) {
                                var6 -= 4;
                                int var423 = class238.field3957[var6 + 2];
                                int var424 = class238.field3957[var6];
                                int var425 = class238.field3957[var6 + 1];
                                int var426 = class238.field3957[var6 + 3];
                                class313 var427 = class179.method1359(19661184, var423);
                                if (var427.field5280 == var424 && var427.field5282 == var425) {
                                    if (var425 == 115) {
                                        class120.field2184[var8++] = var427.method2141(0, var426);
                                    } else {
                                        class238.field3957[var6++] = var427.method2132((byte) 13, var426);
                                    }
                                    continue;
                                }
                                throw new RuntimeException("C3408-1");
                            }
                            if (var483 == 3409) {
                                var6 -= 3;
                                int var428 = class238.field3957[var6];
                                int var429 = class238.field3957[var6 + 1];
                                int var430 = class238.field3957[var6 + 2];
                                if (var429 == -1) {
                                    throw new RuntimeException("C3409-2");
                                }
                                class313 var431 = class179.method1359(19661184, var429);
                                if (var431.field5282 != var428) {
                                    throw new RuntimeException("C3409-1");
                                }
                                class238.field3957[var6++] = var431.method2138(var430, 0) ? 1 : 0;
                                continue;
                            }
                            if (var483 == 3410) {
                                var6--;
                                int var432 = class238.field3957[var6];
                                var8--;
                                class162 var433 = class120.field2184[var8];
                                if (var432 == -1) {
                                    throw new RuntimeException("C3410-2");
                                }
                                class313 var434 = class179.method1359(19661184, var432);
                                if (var434.field5282 != 115) {
                                    throw new RuntimeException("C3410-1");
                                }
                                class238.field3957[var6++] = var434.method2140(0, var433) ? 1 : 0;
                                continue;
                            }
                            if (var483 == 3411) {
                                var6--;
                                int var435 = class238.field3957[var6];
                                class313 var436 = class179.method1359(19661184, var435);
                                class238.field3957[var6++] = var436.field5273.method1669(false);
                                continue;
                            }
                        } else if (var483 < 3700) {
                            if (var483 == 3600) {
                                if (class245.field4071 == 0) {
                                    class238.field3957[var6++] = -2;
                                } else if (class245.field4071 == 1) {
                                    class238.field3957[var6++] = -1;
                                } else {
                                    class238.field3957[var6++] = class264.field4403;
                                }
                                continue;
                            }
                            if (var483 == 3601) {
                                var6--;
                                int var398 = class238.field3957[var6];
                                if (class245.field4071 == 2 && class264.field4403 > var398) {
                                    class120.field2184[var8++] = class290.field4891[var398];
                                    continue;
                                }
                                class120.field2184[var8++] = class149.field2684;
                                continue;
                            }
                            if (var483 == 3602) {
                                var6--;
                                int var399 = class238.field3957[var6];
                                if (class245.field4071 == 2 && var399 < class264.field4403) {
                                    class238.field3957[var6++] = class214.field3586[var399];
                                    continue;
                                }
                                class238.field3957[var6++] = 0;
                                continue;
                            }
                            if (var483 == 3603) {
                                var6--;
                                int var400 = class238.field3957[var6];
                                if (class245.field4071 == 2 && class264.field4403 > var400) {
                                    class238.field3957[var6++] = class260.field4337[var400];
                                    continue;
                                }
                                class238.field3957[var6++] = 0;
                                continue;
                            }
                            if (var483 == 3604) {
                                var6--;
                                int var401 = class238.field3957[var6];
                                var8--;
                                class162 var402 = class120.field2184[var8];
                                class142.method1112(var402, (byte) -34, var401);
                                continue;
                            }
                            if (var483 == 3605) {
                                var8--;
                                class162 var403 = class120.field2184[var8];
                                class167.method1306(var403.method1256(0), arg1 - 4017);
                                continue;
                            }
                            if (var483 == 3606) {
                                var8--;
                                class162 var404 = class120.field2184[var8];
                                class51.method369(6110, var404.method1256(0));
                                continue;
                            }
                            if (var483 == 3607) {
                                var8--;
                                class162 var405 = class120.field2184[var8];
                                class157.method1221(var405.method1256(0), 200);
                                continue;
                            }
                            if (var483 == 3608) {
                                var8--;
                                class162 var406 = class120.field2184[var8];
                                class116.method912(true, var406.method1256(0));
                                continue;
                            }
                            if (var483 == 3609) {
                                var8--;
                                class162 var407 = class120.field2184[var8];
                                if (var407.method1269(class209.field3532, 16360) || var407.method1269(class93.field1644, 16360)) {
                                    var407 = var407.method1254((byte) 95, 7);
                                }
                                class238.field3957[var6++] = class283.method1962(var407, (byte) 114) ? 1 : 0;
                                continue;
                            }
                            if (var483 == 3610) {
                                var6--;
                                int var408 = class238.field3957[var6];
                                if (class245.field4071 == 2 && var408 < class264.field4403) {
                                    class120.field2184[var8++] = class35.field591[var408];
                                    continue;
                                }
                                class120.field2184[var8++] = class149.field2684;
                                continue;
                            }
                            if (var483 == 3611) {
                                if (class6.field44 == null) {
                                    class120.field2184[var8++] = class149.field2684;
                                } else {
                                    class120.field2184[var8++] = class6.field44.method1265((byte) 46);
                                }
                                continue;
                            }
                            if (var483 == 3612) {
                                if (class6.field44 == null) {
                                    class238.field3957[var6++] = 0;
                                } else {
                                    class238.field3957[var6++] = class20.field319;
                                }
                                continue;
                            }
                            if (var483 == 3613) {
                                var6--;
                                int var409 = class238.field3957[var6];
                                if (class6.field44 != null && class20.field319 > var409) {
                                    class120.field2184[var8++] = class260.field4330[var409].field2965.method1265((byte) 46);
                                    continue;
                                }
                                class120.field2184[var8++] = class149.field2684;
                                continue;
                            }
                            if (var483 == 3614) {
                                var6--;
                                int var410 = class238.field3957[var6];
                                if (class6.field44 != null && var410 < class20.field319) {
                                    class238.field3957[var6++] = class260.field4330[var410].field2969;
                                    continue;
                                }
                                class238.field3957[var6++] = 0;
                                continue;
                            }
                            if (var483 == 3615) {
                                var6--;
                                int var411 = class238.field3957[var6];
                                if (class6.field44 != null && class20.field319 > var411) {
                                    class238.field3957[var6++] = class260.field4330[var411].field2974;
                                    continue;
                                }
                                class238.field3957[var6++] = 0;
                                continue;
                            }
                            if (var483 == 3616) {
                                class238.field3957[var6++] = class173.field2992;
                                continue;
                            }
                            if (var483 == 3617) {
                                var8--;
                                class162 var412 = class120.field2184[var8];
                                class290.method2014((byte) -43, var412);
                                continue;
                            }
                            if (var483 == 3618) {
                                class238.field3957[var6++] = class297.field4971;
                                continue;
                            }
                            if (var483 == 3619) {
                                var8--;
                                class162 var413 = class120.field2184[var8];
                                class306.method2084(false, var413.method1256(arg1 ^ 0xFFFFFFEF));
                                continue;
                            }
                            if (var483 == 3620) {
                                class40.method300((byte) 13);
                                continue;
                            }
                            if (var483 == 3621) {
                                if (class245.field4071 == 0) {
                                    class238.field3957[var6++] = -1;
                                } else {
                                    class238.field3957[var6++] = class135.field2417;
                                }
                                continue;
                            }
                            if (var483 == 3622) {
                                var6--;
                                int var414 = class238.field3957[var6];
                                if (class245.field4071 != 0 && var414 < class135.field2417) {
                                    class120.field2184[var8++] = class317.method2178(class112.field2026[var414], (byte) -125).method1265((byte) 46);
                                    continue;
                                }
                                class120.field2184[var8++] = class149.field2684;
                                continue;
                            }
                            if (var483 == 3623) {
                                var8--;
                                class162 var415 = class120.field2184[var8];
                                if (var415.method1269(class209.field3532, 16360) || var415.method1269(class93.field1644, 16360)) {
                                    var415 = var415.method1254((byte) 95, 7);
                                }
                                class238.field3957[var6++] = class179.method1365(var415, 0) ? 1 : 0;
                                continue;
                            }
                            if (var483 == 3624) {
                                var6--;
                                int var416 = class238.field3957[var6];
                                if (class260.field4330 != null && class20.field319 > var416 && class260.field4330[var416].field2965.method1282(class122.field2215.field611, 111)) {
                                    class238.field3957[var6++] = 1;
                                    continue;
                                }
                                class238.field3957[var6++] = 0;
                                continue;
                            }
                            if (var483 == 3625) {
                                if (class43.field717 == null) {
                                    class120.field2184[var8++] = class149.field2684;
                                } else {
                                    class120.field2184[var8++] = class43.field717.method1265((byte) 46);
                                }
                                continue;
                            }
                            if (var483 == 3626) {
                                var6--;
                                int var417 = class238.field3957[var6];
                                if (class6.field44 != null && var417 < class20.field319) {
                                    class120.field2184[var8++] = class260.field4330[var417].field2964;
                                    continue;
                                }
                                class120.field2184[var8++] = class149.field2684;
                                continue;
                            }
                            if (var483 == 3627) {
                                var6--;
                                int var418 = class238.field3957[var6];
                                if (class245.field4071 == 2 && var418 >= 0 && var418 < class264.field4403) {
                                    class238.field3957[var6++] = class199.field3390[var418] ? 1 : 0;
                                    continue;
                                }
                                class238.field3957[var6++] = 0;
                                continue;
                            }
                            if (var483 == 3628) {
                                var8--;
                                class162 var419 = class120.field2184[var8];
                                if (var419.method1269(class209.field3532, arg1 + 16377) || var419.method1269(class93.field1644, 16360)) {
                                    var419 = var419.method1254((byte) 95, 7);
                                }
                                class238.field3957[var6++] = class82.method632(24210, var419);
                                continue;
                            }
                        } else if (var483 < 4000) {
                            if (var483 == 3903) {
                                var6--;
                                int var112 = class238.field3957[var6];
                                class238.field3957[var6++] = class306.field5148[var112].method985(true);
                                continue;
                            }
                            if (var483 == 3904) {
                                var6--;
                                int var113 = class238.field3957[var6];
                                class238.field3957[var6++] = class306.field5148[var113].field2212;
                                continue;
                            }
                            if (var483 == 3905) {
                                var6--;
                                int var114 = class238.field3957[var6];
                                class238.field3957[var6++] = class306.field5148[var114].field2213;
                                continue;
                            }
                            if (var483 == 3906) {
                                var6--;
                                int var115 = class238.field3957[var6];
                                class238.field3957[var6++] = class306.field5148[var115].field2210;
                                continue;
                            }
                            if (var483 == 3907) {
                                var6--;
                                int var116 = class238.field3957[var6];
                                class238.field3957[var6++] = class306.field5148[var116].field2205;
                                continue;
                            }
                            if (var483 == 3908) {
                                var6--;
                                int var117 = class238.field3957[var6];
                                class238.field3957[var6++] = class306.field5148[var117].field2201;
                                continue;
                            }
                            if (var483 == 3910) {
                                var6--;
                                int var118 = class238.field3957[var6];
                                int var119 = class306.field5148[var118].method990((byte) -115);
                                class238.field3957[var6++] = var119 == 0 ? 1 : 0;
                                continue;
                            }
                            if (var483 == 3911) {
                                var6--;
                                int var120 = class238.field3957[var6];
                                int var121 = class306.field5148[var120].method990((byte) -127);
                                class238.field3957[var6++] = var121 == 2 ? 1 : 0;
                                continue;
                            }
                            if (var483 == 3912) {
                                var6--;
                                int var122 = class238.field3957[var6];
                                int var123 = class306.field5148[var122].method990((byte) 127);
                                class238.field3957[var6++] = var123 == 5 ? 1 : 0;
                                continue;
                            }
                            if (var483 == 3913) {
                                var6--;
                                int var124 = class238.field3957[var6];
                                int var125 = class306.field5148[var124].method990((byte) 52);
                                class238.field3957[var6++] = var125 == 1 ? 1 : 0;
                                continue;
                            }
                        } else if (var483 < 4100) {
                            if (var483 == 4000) {
                                var6 -= 2;
                                int var353 = class238.field3957[var6 + 1];
                                int var354 = class238.field3957[var6];
                                class238.field3957[var6++] = var353 + var354;
                                continue;
                            }
                            if (var483 == 4001) {
                                var6 -= 2;
                                int var355 = class238.field3957[var6];
                                int var356 = class238.field3957[var6 + 1];
                                class238.field3957[var6++] = var355 - var356;
                                continue;
                            }
                            if (var483 == 4002) {
                                var6 -= 2;
                                int var357 = class238.field3957[var6 + 1];
                                int var358 = class238.field3957[var6];
                                class238.field3957[var6++] = var357 * var358;
                                continue;
                            }
                            if (var483 == 4003) {
                                var6 -= 2;
                                int var359 = class238.field3957[var6];
                                int var360 = class238.field3957[var6 + 1];
                                class238.field3957[var6++] = var359 / var360;
                                continue;
                            }
                            if (var483 == 4004) {
                                var6--;
                                int var361 = class238.field3957[var6];
                                class238.field3957[var6++] = (int) ((double) var361 * Math.random());
                                continue;
                            }
                            if (var483 == 4005) {
                                var6--;
                                int var362 = class238.field3957[var6];
                                class238.field3957[var6++] = (int) ((double) (var362 + 1) * Math.random());
                                continue;
                            }
                            if (var483 == 4006) {
                                var6 -= 5;
                                int var363 = class238.field3957[var6 + 1];
                                int var364 = class238.field3957[var6];
                                int var365 = class238.field3957[var6 + 2];
                                int var366 = class238.field3957[var6 + 3];
                                int var367 = class238.field3957[var6 + 4];
                                class238.field3957[var6++] = (var367 - var365) * (var363 - var364) / (var366 - var365) + var364;
                                continue;
                            }
                            if (var483 == 4007) {
                                var6 -= 2;
                                long var368 = (long) class238.field3957[var6];
                                long var370 = (long) class238.field3957[var6 + 1];
                                class238.field3957[var6++] = (int) (var368 * var370 / 100L + var368);
                                continue;
                            }
                            if (var483 == 4008) {
                                var6 -= 2;
                                int var372 = class238.field3957[var6];
                                int var373 = class238.field3957[var6 + 1];
                                class238.field3957[var6++] = class289.method2005(0x1 << var373, var372);
                                continue;
                            }
                            if (var483 == 4009) {
                                var6 -= 2;
                                int var374 = class238.field3957[var6];
                                int var375 = class238.field3957[var6 + 1];
                                class238.field3957[var6++] = class92.method695(-(0x1 << var375) - 1, var374);
                                continue;
                            }
                            if (var483 == 4010) {
                                var6 -= 2;
                                int var376 = class238.field3957[var6];
                                int var377 = class238.field3957[var6 + 1];
                                class238.field3957[var6++] = class92.method695(var376, 0x1 << var377) == 0 ? 0 : 1;
                                continue;
                            }
                            if (var483 == 4011) {
                                var6 -= 2;
                                int var378 = class238.field3957[var6];
                                int var379 = class238.field3957[var6 + 1];
                                class238.field3957[var6++] = var378 % var379;
                                continue;
                            }
                            if (var483 == 4012) {
                                var6 -= 2;
                                int var380 = class238.field3957[var6 + 1];
                                int var381 = class238.field3957[var6];
                                if (var381 == 0) {
                                    class238.field3957[var6++] = 0;
                                } else {
                                    class238.field3957[var6++] = (int) Math.pow((double) var381, (double) var380);
                                }
                                continue;
                            }
                            if (var483 == 4013) {
                                var6 -= 2;
                                int var382 = class238.field3957[var6];
                                int var383 = class238.field3957[var6 + 1];
                                if (var382 == 0) {
                                    class238.field3957[var6++] = 0;
                                } else if (var383 == 0) {
                                    class238.field3957[var6++] = Integer.MAX_VALUE;
                                } else {
                                    class238.field3957[var6++] = (int) Math.pow((double) var382, 1.0D / (double) var383);
                                }
                                continue;
                            }
                            if (var483 == 4014) {
                                var6 -= 2;
                                int var384 = class238.field3957[var6];
                                int var385 = class238.field3957[var6 + 1];
                                class238.field3957[var6++] = class92.method695(var384, var385);
                                continue;
                            }
                            if (var483 == 4015) {
                                var6 -= 2;
                                int var386 = class238.field3957[var6];
                                int var387 = class238.field3957[var6 + 1];
                                class238.field3957[var6++] = class289.method2005(var386, var387);
                                continue;
                            }
                            if (var483 == 4016) {
                                var6 -= 2;
                                int var388 = class238.field3957[var6 + 1];
                                int var389 = class238.field3957[var6];
                                class238.field3957[var6++] = var388 <= var389 ? var388 : var389;
                                continue;
                            }
                            if (var483 == 4017) {
                                var6 -= 2;
                                int var390 = class238.field3957[var6 + 1];
                                int var391 = class238.field3957[var6];
                                class238.field3957[var6++] = var391 > var390 ? var391 : var390;
                                continue;
                            }
                            if (var483 == 4018) {
                                var6 -= 3;
                                long var392 = (long) class238.field3957[var6];
                                long var394 = (long) class238.field3957[var6 + 1];
                                long var396 = (long) class238.field3957[var6 + 2];
                                class238.field3957[var6++] = (int) (var392 * var396 / var394);
                                continue;
                            }
                        } else if (var483 < 4200) {
                            if (var483 == 4100) {
                                var6--;
                                int var301 = class238.field3957[var6];
                                var8--;
                                class162 var302 = class120.field2184[var8];
                                class120.field2184[var8++] = class135.method1062(new class162[] { var302, class156.method1212(10, var301) }, true);
                                continue;
                            }
                            if (var483 == 4101) {
                                var8 -= 2;
                                class162 var303 = class120.field2184[var8];
                                class162 var304 = class120.field2184[var8 + 1];
                                class120.field2184[var8++] = class135.method1062(new class162[] { var303, var304 }, true);
                                continue;
                            }
                            if (var483 == 4102) {
                                var8--;
                                class162 var305 = class120.field2184[var8];
                                var6--;
                                int var306 = class238.field3957[var6];
                                class120.field2184[var8++] = class135.method1062(new class162[] { var305, class233.method1659(var306, true, class110.method887(arg1, 106)) }, true);
                                continue;
                            }
                            if (var483 == 4103) {
                                var8--;
                                class162 var307 = class120.field2184[var8];
                                class120.field2184[var8++] = var307.method1250(71);
                                continue;
                            }
                            if (var483 == 4104) {
                                var6--;
                                int var308 = class238.field3957[var6];
                                long var309 = ((long) var308 + 11745L) * 86400000L;
                                class262.field4373.setTime(new Date(var309));
                                int var311 = class262.field4373.get(5);
                                int var312 = class262.field4373.get(2);
                                int var313 = class262.field4373.get(1);
                                class120.field2184[var8++] = class135.method1062(new class162[] { class156.method1212(10, var311), class119.field2181, class206.field3465[var312], class119.field2181, class156.method1212(10, var313) }, true);
                                continue;
                            }
                            if (var483 == 4105) {
                                var8 -= 2;
                                class162 var314 = class120.field2184[var8 + 1];
                                class162 var315 = class120.field2184[var8];
                                if (class122.field2215.field600 != null && class122.field2215.field600.field3404) {
                                    class120.field2184[var8++] = var314;
                                    continue;
                                }
                                class120.field2184[var8++] = var315;
                                continue;
                            }
                            if (var483 == 4106) {
                                var6--;
                                int var316 = class238.field3957[var6];
                                class120.field2184[var8++] = class156.method1212(10, var316);
                                continue;
                            }
                            if (var483 == 4107) {
                                var8 -= 2;
                                class238.field3957[var6++] = class120.field2184[var8].method1279(class120.field2184[var8 + 1], (byte) -6);
                                continue;
                            }
                            if (var483 == 4108) {
                                var6 -= 2;
                                var8--;
                                class162 var317 = class120.field2184[var8];
                                int var318 = class238.field3957[var6];
                                int var319 = class238.field3957[var6 + 1];
                                byte[] var320 = class51.field817.method1128(0, 0, var319);
                                class189 var321 = new class189(var320);
                                var321.method1877(class131.field2360, (int[]) null);
                                class238.field3957[var6++] = var321.method1879(var317, var318);
                                continue;
                            }
                            if (var483 == 4109) {
                                var8--;
                                class162 var322 = class120.field2184[var8];
                                var6 -= 2;
                                int var323 = class238.field3957[var6];
                                int var324 = class238.field3957[var6 + 1];
                                byte[] var325 = class51.field817.method1128(0, 0, var324);
                                class189 var326 = new class189(var325);
                                var326.method1877(class131.field2360, (int[]) null);
                                class238.field3957[var6++] = var326.method1892(var322, var323);
                                continue;
                            }
                            if (var483 == 4110) {
                                var8 -= 2;
                                class162 var327 = class120.field2184[var8 + 1];
                                class162 var328 = class120.field2184[var8];
                                var6--;
                                if (class238.field3957[var6] == 1) {
                                    class120.field2184[var8++] = var328;
                                } else {
                                    class120.field2184[var8++] = var327;
                                }
                                continue;
                            }
                            if (var483 == 4111) {
                                var8--;
                                class162 var329 = class120.field2184[var8];
                                class120.field2184[var8++] = class276.method1872(var329);
                                continue;
                            }
                            if (var483 == 4112) {
                                var8--;
                                class162 var330 = class120.field2184[var8];
                                var6--;
                                int var331 = class238.field3957[var6];
                                if (var331 == -1) {
                                    throw new RuntimeException("null char");
                                }
                                class120.field2184[var8++] = var330.method1240(var331, 0);
                                continue;
                            }
                            if (var483 == 4113) {
                                var6--;
                                int var332 = class238.field3957[var6];
                                class238.field3957[var6++] = class20.method179(-130, var332) ? 1 : 0;
                                continue;
                            }
                            if (var483 == 4114) {
                                var6--;
                                int var333 = class238.field3957[var6];
                                class238.field3957[var6++] = class170.method1311(var333, (byte) 6) ? 1 : 0;
                                continue;
                            }
                            if (var483 == 4115) {
                                var6--;
                                int var334 = class238.field3957[var6];
                                class238.field3957[var6++] = class280.method1957((byte) 69, var334) ? 1 : 0;
                                continue;
                            }
                            if (var483 == 4116) {
                                var6--;
                                int var335 = class238.field3957[var6];
                                class238.field3957[var6++] = class314.method2144((byte) -94, var335) ? 1 : 0;
                                continue;
                            }
                            if (var483 == 4117) {
                                var8--;
                                class162 var336 = class120.field2184[var8];
                                if (var336 == null) {
                                    class238.field3957[var6++] = 0;
                                } else {
                                    class238.field3957[var6++] = var336.method1249((byte) -118);
                                }
                                continue;
                            }
                            if (var483 == 4118) {
                                var6 -= 2;
                                int var337 = class238.field3957[var6];
                                int var338 = class238.field3957[var6 + 1];
                                var8--;
                                class162 var339 = class120.field2184[var8];
                                class120.field2184[var8++] = var339.method1283(var337, var338, (byte) 97);
                                continue;
                            }
                            if (var483 == 4119) {
                                var8--;
                                class162 var340 = class120.field2184[var8];
                                class162 var341 = class203.method1511((byte) 75, var340.method1249((byte) -118));
                                boolean var342 = false;
                                for (int var343 = 0; var343 < var340.method1249((byte) -118); var343++) {
                                    int var344 = var340.method1246(arg1 + 95, var343);
                                    if (var344 == 60) {
                                        var342 = true;
                                    } else if (var344 == 62) {
                                        var342 = false;
                                    } else if (!var342) {
                                        var341.method1273(false, var344);
                                    }
                                }
                                var341.method1266(18333);
                                class120.field2184[var8++] = var341;
                                continue;
                            }
                            if (var483 == 4120) {
                                var8--;
                                class162 var345 = class120.field2184[var8];
                                var6 -= 2;
                                int var346 = class238.field3957[var6];
                                int var347 = class238.field3957[var6 + 1];
                                class238.field3957[var6++] = var345.method1252(var346, 87, var347);
                                continue;
                            }
                            if (var483 == 4121) {
                                var8 -= 2;
                                class162 var348 = class120.field2184[var8 + 1];
                                class162 var349 = class120.field2184[var8];
                                var6--;
                                int var350 = class238.field3957[var6];
                                class238.field3957[var6++] = var349.method1287(var350, var348, (byte) -99);
                                continue;
                            }
                            if (var483 == 4122) {
                                var6--;
                                int var351 = class238.field3957[var6];
                                class238.field3957[var6++] = class290.method2011(class110.method887(arg1, -24851), var351);
                                continue;
                            }
                            if (var483 == 4123) {
                                var6--;
                                int var352 = class238.field3957[var6];
                                class238.field3957[var6++] = class306.method2080(var352, (byte) 123);
                                continue;
                            }
                        } else if (var483 < 4300) {
                            if (var483 == 4200) {
                                var6--;
                                int var282 = class238.field3957[var6];
                                class120.field2184[var8++] = class304.method2075(var282, 4).field2091;
                                continue;
                            }
                            if (var483 == 4201) {
                                var6 -= 2;
                                int var283 = class238.field3957[var6 + 1];
                                int var284 = class238.field3957[var6];
                                class116 var285 = class304.method2075(var284, 4);
                                if (var283 >= 1 && var283 <= 5 && var285.field2055[var283 - 1] != null) {
                                    class120.field2184[var8++] = var285.field2055[var283 - 1];
                                    continue;
                                }
                                class120.field2184[var8++] = class149.field2684;
                                continue;
                            }
                            if (var483 == 4202) {
                                var6 -= 2;
                                int var286 = class238.field3957[var6];
                                int var287 = class238.field3957[var6 + 1];
                                class116 var288 = class304.method2075(var286, 4);
                                if (var287 >= 1 && var287 <= 5 && var288.field2120[var287 - 1] != null) {
                                    class120.field2184[var8++] = var288.field2120[var287 - 1];
                                    continue;
                                }
                                class120.field2184[var8++] = class149.field2684;
                                continue;
                            }
                            if (var483 == 4203) {
                                var6--;
                                int var289 = class238.field3957[var6];
                                class238.field3957[var6++] = class304.method2075(var289, class110.method887(arg1, -21)).field2062;
                                continue;
                            }
                            if (var483 == 4204) {
                                var6--;
                                int var290 = class238.field3957[var6];
                                class238.field3957[var6++] = class304.method2075(var290, 4).field2082 == 1 ? 1 : 0;
                                continue;
                            }
                            if (var483 == 4205) {
                                var6--;
                                int var291 = class238.field3957[var6];
                                class116 var292 = class304.method2075(var291, arg1 + 21);
                                if (var292.field2102 == -1 && var292.field2066 >= 0) {
                                    class238.field3957[var6++] = var292.field2066;
                                    continue;
                                }
                                class238.field3957[var6++] = var291;
                                continue;
                            }
                            if (var483 == 4206) {
                                var6--;
                                int var293 = class238.field3957[var6];
                                class116 var294 = class304.method2075(var293, 4);
                                if (var294.field2102 >= 0 && var294.field2066 >= 0) {
                                    class238.field3957[var6++] = var294.field2066;
                                    continue;
                                }
                                class238.field3957[var6++] = var293;
                                continue;
                            }
                            if (var483 == 4207) {
                                var6--;
                                int var295 = class238.field3957[var6];
                                class238.field3957[var6++] = class304.method2075(var295, 4).field2107 ? 1 : 0;
                                continue;
                            }
                            if (var483 == 4208) {
                                var6 -= 2;
                                int var296 = class238.field3957[var6];
                                int var297 = class238.field3957[var6 + 1];
                                class278 var298 = class211.method1549(var297, true);
                                if (var298.method1912(arg1 - 10173)) {
                                    class120.field2184[var8++] = class304.method2075(var296, 4).method914(var298.field4684, var297, 65536);
                                } else {
                                    class238.field3957[var6++] = class304.method2075(var296, 4).method918(var297, var298.field4688, 0);
                                }
                                continue;
                            }
                            if (var483 == 4210) {
                                var6--;
                                int var299 = class238.field3957[var6];
                                var8--;
                                class162 var300 = class120.field2184[var8];
                                class286.method1972(var299 == 1, var300, 121);
                                class238.field3957[var6++] = class66.field1029;
                                continue;
                            }
                            if (var483 == 4211) {
                                if (class72.field1149 != null && class70.field1127 < class66.field1029) {
                                    class238.field3957[var6++] = class92.method695(65535, class72.field1149[class70.field1127++]);
                                    continue;
                                }
                                class238.field3957[var6++] = -1;
                                continue;
                            }
                            if (var483 == 4212) {
                                class70.field1127 = 0;
                                continue;
                            }
                        } else if (var483 < 4400) {
                            if (var483 == 4300) {
                                var6 -= 2;
                                int var272 = class238.field3957[var6 + 1];
                                int var273 = class238.field3957[var6];
                                class278 var274 = class211.method1549(var272, true);
                                if (var274.method1912(-10190)) {
                                    class120.field2184[var8++] = class223.method1613(var273, false).method645(var274.field4684, true, var272);
                                } else {
                                    class238.field3957[var6++] = class223.method1613(var273, false).method642(var274.field4688, var272, -1);
                                }
                                continue;
                            }
                            if (var483 == 4301) {
                                var6--;
                                int var275 = class238.field3957[var6];
                                class238.field3957[var6++] = class223.method1613(var275, false).field1444;
                                continue;
                            }
                            if (var483 == 4302) {
                                var6--;
                                int var276 = class238.field3957[var6];
                                class238.field3957[var6++] = class223.method1613(var276, false).field1477;
                                continue;
                            }
                            if (var483 == 4303) {
                                var6--;
                                int var277 = class238.field3957[var6];
                                class238.field3957[var6++] = class223.method1613(var277, false).field1457;
                                continue;
                            }
                            if (var483 == 4304) {
                                var6--;
                                int var278 = class238.field3957[var6];
                                class238.field3957[var6++] = class223.method1613(var278, false).field1466;
                                continue;
                            }
                            if (var483 == 4305) {
                                var6--;
                                int var279 = class238.field3957[var6];
                                class238.field3957[var6++] = class223.method1613(var279, false).field1481;
                                continue;
                            }
                            if (var483 == 4306) {
                                var6--;
                                int var280 = class238.field3957[var6];
                                class238.field3957[var6++] = class223.method1613(var280, false).field1437;
                                continue;
                            }
                            if (var483 == 4307) {
                                var6--;
                                int var281 = class238.field3957[var6];
                                class238.field3957[var6++] = class223.method1613(var281, false).field1452;
                                continue;
                            }
                        } else if (var483 >= 4500) {
                            if (var483 < 4600) {
                                if (var483 == 4500) {
                                    var6 -= 2;
                                    int var126 = class238.field3957[var6];
                                    int var127 = class238.field3957[var6 + 1];
                                    class278 var128 = class211.method1549(var127, true);
                                    if (var128.method1912(-10190)) {
                                        class120.field2184[var8++] = class216.method1569(108, var126).method1835((byte) -122, var128.field4684, var127);
                                    } else {
                                        class238.field3957[var6++] = class216.method1569(99, var126).method1838(var127, (byte) -123, var128.field4688);
                                    }
                                    continue;
                                }
                            } else if (var483 < 5100) {
                                if (var483 == 5000) {
                                    class238.field3957[var6++] = class263.field4381;
                                    continue;
                                }
                                if (var483 == 5001) {
                                    class138.field2474++;
                                    var6 -= 3;
                                    class263.field4381 = class238.field3957[var6];
                                    class289.field4867 = class238.field3957[var6 + 1];
                                    class233.field3891 = class238.field3957[var6 + 2];
                                    class187.field3229.method338(171, (byte) 8);
                                    class187.field3229.method753(class263.field4381, true);
                                    class187.field3229.method753(class289.field4867, true);
                                    class187.field3229.method753(class233.field3891, true);
                                    continue;
                                }
                                if (var483 == 5002) {
                                    class72.field1151++;
                                    var6 -= 2;
                                    int var129 = class238.field3957[var6];
                                    var8--;
                                    class162 var130 = class120.field2184[var8];
                                    int var131 = class238.field3957[var6 + 1];
                                    class187.field3229.method338(246, (byte) 8);
                                    class187.field3229.method745(var130.method1256(0), (byte) -124);
                                    class187.field3229.method753(var129 - 1, true);
                                    class187.field3229.method753(var131, true);
                                    continue;
                                }
                                if (var483 == 5003) {
                                    class162 var132 = null;
                                    var6--;
                                    int var133 = class238.field3957[var6];
                                    if (var133 < 100) {
                                        var132 = class285.field4812[var133];
                                    }
                                    if (var132 == null) {
                                        var132 = class149.field2684;
                                    }
                                    class120.field2184[var8++] = var132;
                                    continue;
                                }
                                if (var483 == 5004) {
                                    int var134 = -1;
                                    var6--;
                                    int var135 = class238.field3957[var6];
                                    if (var135 < 100 && class285.field4812[var135] != null) {
                                        var134 = class295.field4943[var135];
                                    }
                                    class238.field3957[var6++] = var134;
                                    continue;
                                }
                                if (var483 == 5005) {
                                    class238.field3957[var6++] = class289.field4867;
                                    continue;
                                }
                                if (var483 == 5008) {
                                    var8--;
                                    class162 var136 = class120.field2184[var8];
                                    if (!var136.method1269(class173.field2999, 16360)) {
                                        if (class83.field1438 == 0 && (class202.field3426 == 1 || class228.field3800 == 1)) {
                                            continue;
                                        }
                                        class285.field4810++;
                                        class162 var137 = var136.method1250(102);
                                        byte var138 = 0;
                                        if (var137.method1269(class258.field4292, 16360)) {
                                            var138 = 0;
                                            var136 = var136.method1254((byte) 95, class258.field4292.method1249((byte) -118));
                                        } else if (var137.method1269(client.field1901, 16360)) {
                                            var138 = 1;
                                            var136 = var136.method1254((byte) 95, client.field1901.method1249((byte) -118));
                                        } else if (var137.method1269(class55.field867, 16360)) {
                                            var136 = var136.method1254((byte) 95, class55.field867.method1249((byte) -118));
                                            var138 = 2;
                                        } else if (var137.method1269(class238.field3966, 16360)) {
                                            var138 = 3;
                                            var136 = var136.method1254((byte) 95, class238.field3966.method1249((byte) -118));
                                        } else if (var137.method1269(class20.field329, 16360)) {
                                            var136 = var136.method1254((byte) 95, class20.field329.method1249((byte) -118));
                                            var138 = 4;
                                        } else if (var137.method1269(class186.field3208, 16360)) {
                                            var136 = var136.method1254((byte) 95, class186.field3208.method1249((byte) -118));
                                            var138 = 5;
                                        } else if (var137.method1269(class48.field772, 16360)) {
                                            var138 = 6;
                                            var136 = var136.method1254((byte) 95, class48.field772.method1249((byte) -118));
                                        } else if (var137.method1269(class77.field1201, 16360)) {
                                            var136 = var136.method1254((byte) 95, class77.field1201.method1249((byte) -118));
                                            var138 = 7;
                                        } else if (var137.method1269(class303.field5121, 16360)) {
                                            var136 = var136.method1254((byte) 95, class303.field5121.method1249((byte) -118));
                                            var138 = 8;
                                        } else if (var137.method1269(class157.field2774, arg1 + 16377)) {
                                            var136 = var136.method1254((byte) 95, class157.field2774.method1249((byte) -118));
                                            var138 = 9;
                                        } else if (var137.method1269(class12.field206, 16360)) {
                                            var138 = 10;
                                            var136 = var136.method1254((byte) 95, class12.field206.method1249((byte) -118));
                                        } else if (var137.method1269(class251.field4202, 16360)) {
                                            var138 = 11;
                                            var136 = var136.method1254((byte) 95, class251.field4202.method1249((byte) -118));
                                        } else if (class260.field4344 != 0) {
                                            if (var137.method1269(class258.field4302, 16360)) {
                                                var136 = var136.method1254((byte) 95, class258.field4302.method1249((byte) -118));
                                                var138 = 0;
                                            } else if (var137.method1269(client.field1907, arg1 ^ 0xFFFFC007)) {
                                                var138 = 1;
                                                var136 = var136.method1254((byte) 95, client.field1907.method1249((byte) -118));
                                            } else if (var137.method1269(class55.field860, 16360)) {
                                                var136 = var136.method1254((byte) 95, class55.field860.method1249((byte) -118));
                                                var138 = 2;
                                            } else if (var137.method1269(class238.field3959, arg1 ^ 0xFFFFC007)) {
                                                var136 = var136.method1254((byte) 95, class238.field3959.method1249((byte) -118));
                                                var138 = 3;
                                            } else if (var137.method1269(class20.field326, 16360)) {
                                                var136 = var136.method1254((byte) 95, class20.field326.method1249((byte) -118));
                                                var138 = 4;
                                            } else if (var137.method1269(class186.field3199, arg1 + 16377)) {
                                                var136 = var136.method1254((byte) 95, class186.field3199.method1249((byte) -118));
                                                var138 = 5;
                                            } else if (var137.method1269(class48.field771, 16360)) {
                                                var136 = var136.method1254((byte) 95, class48.field771.method1249((byte) -118));
                                                var138 = 6;
                                            } else if (var137.method1269(class77.field1215, arg1 ^ 0xFFFFC007)) {
                                                var136 = var136.method1254((byte) 95, class77.field1215.method1249((byte) -118));
                                                var138 = 7;
                                            } else if (var137.method1269(class303.field5122, 16360)) {
                                                var136 = var136.method1254((byte) 95, class303.field5122.method1249((byte) -118));
                                                var138 = 8;
                                            } else if (var137.method1269(class157.field2772, 16360)) {
                                                var138 = 9;
                                                var136 = var136.method1254((byte) 95, class157.field2772.method1249((byte) -118));
                                            } else if (var137.method1269(class12.field209, 16360)) {
                                                var136 = var136.method1254((byte) 95, class12.field209.method1249((byte) -118));
                                                var138 = 10;
                                            } else if (var137.method1269(class251.field4198, 16360)) {
                                                var136 = var136.method1254((byte) 95, class251.field4198.method1249((byte) -118));
                                                var138 = 11;
                                            }
                                        }
                                        byte var139 = 0;
                                        class162 var140 = var136.method1250(121);
                                        if (var140.method1269(class292.field4925, 16360)) {
                                            var136 = var136.method1254((byte) 95, class292.field4925.method1249((byte) -118));
                                            var139 = 1;
                                        } else if (var140.method1269(class77.field1204, 16360)) {
                                            var139 = 2;
                                            var136 = var136.method1254((byte) 95, class77.field1204.method1249((byte) -118));
                                        } else if (var140.method1269(class214.field3588, 16360)) {
                                            var136 = var136.method1254((byte) 95, class214.field3588.method1249((byte) -118));
                                            var139 = 3;
                                        } else if (var140.method1269(class171.field2967, arg1 ^ 0xFFFFC007)) {
                                            var136 = var136.method1254((byte) 95, class171.field2967.method1249((byte) -118));
                                            var139 = 4;
                                        } else if (var140.method1269(class162.field2873, 16360)) {
                                            var139 = 5;
                                            var136 = var136.method1254((byte) 95, class162.field2873.method1249((byte) -118));
                                        } else if (class260.field4344 != 0) {
                                            if (var140.method1269(class292.field4924, arg1 ^ 0xFFFFC007)) {
                                                var136 = var136.method1254((byte) 95, class292.field4924.method1249((byte) -118));
                                                var139 = 1;
                                            } else if (var140.method1269(class77.field1206, 16360)) {
                                                var136 = var136.method1254((byte) 95, class77.field1206.method1249((byte) -118));
                                                var139 = 2;
                                            } else if (var140.method1269(class214.field3592, 16360)) {
                                                var139 = 3;
                                                var136 = var136.method1254((byte) 95, class214.field3592.method1249((byte) -118));
                                            } else if (var140.method1269(class171.field2972, 16360)) {
                                                var139 = 4;
                                                var136 = var136.method1254((byte) 95, class171.field2972.method1249((byte) -118));
                                            } else if (var140.method1269(class162.field2830, 16360)) {
                                                var139 = 5;
                                                var136 = var136.method1254((byte) 95, class162.field2830.method1249((byte) -118));
                                            }
                                        }
                                        class187.field3229.method338(46, (byte) 8);
                                        class187.field3229.method753(0, true);
                                        int var141 = class187.field3229.field1653;
                                        class187.field3229.method753(var138, true);
                                        class187.field3229.method753(var139, true);
                                        class23.method185(class187.field3229, var136, arg1 ^ 0x4E);
                                        class187.field3229.method742((byte) 112, class187.field3229.field1653 - var141);
                                        continue;
                                    }
                                    class158.method1223((byte) 5, var136);
                                    continue;
                                }
                                if (var483 == 5009) {
                                    var8 -= 2;
                                    class162 var142 = class120.field2184[var8];
                                    class162 var143 = class120.field2184[var8 + 1];
                                    if (class83.field1438 != 0 || class202.field3426 != 1 && class228.field3800 != 1) {
                                        class98.field1784++;
                                        class187.field3229.method338(181, (byte) 8);
                                        class187.field3229.method753(0, true);
                                        int var144 = class187.field3229.field1653;
                                        class187.field3229.method745(var142.method1256(arg1 + 17), (byte) -124);
                                        class23.method185(class187.field3229, var143, -91);
                                        class187.field3229.method742((byte) 125, class187.field3229.field1653 - var144);
                                    }
                                    continue;
                                }
                                if (var483 == 5010) {
                                    class162 var145 = null;
                                    var6--;
                                    int var146 = class238.field3957[var6];
                                    if (var146 < 100) {
                                        var145 = class275.field4574[var146];
                                    }
                                    if (var145 == null) {
                                        var145 = class149.field2684;
                                    }
                                    class120.field2184[var8++] = var145;
                                    continue;
                                }
                                if (var483 == 5011) {
                                    var6--;
                                    int var147 = class238.field3957[var6];
                                    class162 var148 = null;
                                    if (var147 < 100) {
                                        var148 = class207.field3498[var147];
                                    }
                                    if (var148 == null) {
                                        var148 = class149.field2684;
                                    }
                                    class120.field2184[var8++] = var148;
                                    continue;
                                }
                                if (var483 == 5012) {
                                    var6--;
                                    int var149 = class238.field3957[var6];
                                    int var150 = -1;
                                    if (var149 < 100) {
                                        var150 = class229.field3817[var149];
                                    }
                                    class238.field3957[var6++] = var150;
                                    continue;
                                }
                                if (var483 == 5015) {
                                    class162 var151;
                                    if (class122.field2215 == null || class122.field2215.field611 == null) {
                                        var151 = class244.field4057;
                                    } else {
                                        var151 = class122.field2215.method292(arg1 ^ 0xFFFFFFEF);
                                    }
                                    class120.field2184[var8++] = var151;
                                    continue;
                                }
                                if (var483 == 5016) {
                                    class238.field3957[var6++] = class233.field3891;
                                    continue;
                                }
                                if (var483 == 5017) {
                                    class238.field3957[var6++] = class25.field412;
                                    continue;
                                }
                                if (var483 == 5050) {
                                    var6--;
                                    int var152 = class238.field3957[var6];
                                    class120.field2184[var8++] = class95.method773(var152, (byte) -52).field1564;
                                    continue;
                                }
                                if (var483 == 5051) {
                                    var6--;
                                    int var153 = class238.field3957[var6];
                                    class88 var154 = class95.method773(var153, (byte) -34);
                                    if (var154.field1563 == null) {
                                        class238.field3957[var6++] = 0;
                                    } else {
                                        class238.field3957[var6++] = var154.field1563.length;
                                    }
                                    continue;
                                }
                                if (var483 == 5052) {
                                    var6 -= 2;
                                    int var155 = class238.field3957[var6 + 1];
                                    int var156 = class238.field3957[var6];
                                    class88 var157 = class95.method773(var156, (byte) -107);
                                    int var158 = var157.field1563[var155];
                                    class238.field3957[var6++] = var158;
                                    continue;
                                }
                                if (var483 == 5053) {
                                    var6--;
                                    int var159 = class238.field3957[var6];
                                    class88 var160 = class95.method773(var159, (byte) -45);
                                    if (var160.field1569 == null) {
                                        class238.field3957[var6++] = 0;
                                    } else {
                                        class238.field3957[var6++] = var160.field1569.length;
                                    }
                                    continue;
                                }
                                if (var483 == 5054) {
                                    var6 -= 2;
                                    int var161 = class238.field3957[var6];
                                    int var162 = class238.field3957[var6 + 1];
                                    class238.field3957[var6++] = class95.method773(var161, (byte) -57).field1569[var162];
                                    continue;
                                }
                                if (var483 == 5055) {
                                    var6--;
                                    int var163 = class238.field3957[var6];
                                    class120.field2184[var8++] = class190.method1415(var163, 6047).method664(-32);
                                    continue;
                                }
                                if (var483 == 5056) {
                                    var6--;
                                    int var164 = class238.field3957[var6];
                                    class87 var165 = class190.method1415(var164, 6047);
                                    if (var165.field1547 == null) {
                                        class238.field3957[var6++] = 0;
                                    } else {
                                        class238.field3957[var6++] = var165.field1547.length;
                                    }
                                    continue;
                                }
                                if (var483 == 5057) {
                                    var6 -= 2;
                                    int var166 = class238.field3957[var6];
                                    int var167 = class238.field3957[var6 + 1];
                                    class238.field3957[var6++] = class190.method1415(var166, class110.method887(arg1, -6032)).field1547[var167];
                                    continue;
                                }
                                if (var483 == 5058) {
                                    class196.field3330 = new class20();
                                    var6--;
                                    class196.field3330.field322 = class238.field3957[var6];
                                    class196.field3330.field320 = class190.method1415(class196.field3330.field322, arg1 + 6064);
                                    class196.field3330.field327 = new int[class196.field3330.field320.method663(false)];
                                    continue;
                                }
                                if (var483 == 5059) {
                                    class190.field3255++;
                                    class187.field3229.method338(249, (byte) 8);
                                    class187.field3229.method753(0, true);
                                    int var168 = class187.field3229.field1653;
                                    class187.field3229.method753(0, true);
                                    class187.field3229.method751(class196.field3330.field322, -1044017976);
                                    class196.field3330.field320.method657(class196.field3330.field327, class187.field3229, (byte) 50);
                                    class187.field3229.method742((byte) -93, class187.field3229.field1653 - var168);
                                    continue;
                                }
                                if (var483 == 5060) {
                                    var8--;
                                    class162 var169 = class120.field2184[var8];
                                    class187.field3229.method338(125, (byte) 8);
                                    class187.field3229.method753(0, true);
                                    class202.field3425++;
                                    int var170 = class187.field3229.field1653;
                                    class187.field3229.method745(var169.method1256(0), (byte) -124);
                                    class187.field3229.method751(class196.field3330.field322, -1044017976);
                                    class196.field3330.field320.method657(class196.field3330.field327, class187.field3229, (byte) 50);
                                    class187.field3229.method742((byte) 126, class187.field3229.field1653 - var170);
                                    continue;
                                }
                                if (var483 == 5061) {
                                    class190.field3255++;
                                    class187.field3229.method338(249, (byte) 8);
                                    class187.field3229.method753(0, true);
                                    int var171 = class187.field3229.field1653;
                                    class187.field3229.method753(1, true);
                                    class187.field3229.method751(class196.field3330.field322, arg1 ^ 0x3E3A7327);
                                    class196.field3330.field320.method657(class196.field3330.field327, class187.field3229, (byte) 50);
                                    class187.field3229.method742((byte) -46, class187.field3229.field1653 - var171);
                                    continue;
                                }
                                if (var483 == 5062) {
                                    var6 -= 2;
                                    int var172 = class238.field3957[var6 + 1];
                                    int var173 = class238.field3957[var6];
                                    class238.field3957[var6++] = class95.method773(var173, (byte) -104).field1568[var172];
                                    continue;
                                }
                                if (var483 == 5063) {
                                    var6 -= 2;
                                    int var174 = class238.field3957[var6];
                                    int var175 = class238.field3957[var6 + 1];
                                    class238.field3957[var6++] = class95.method773(var174, (byte) -109).field1575[var175];
                                    continue;
                                }
                                if (var483 == 5064) {
                                    var6 -= 2;
                                    int var176 = class238.field3957[var6];
                                    int var177 = class238.field3957[var6 + 1];
                                    if (var177 == -1) {
                                        class238.field3957[var6++] = -1;
                                    } else {
                                        class238.field3957[var6++] = class95.method773(var176, (byte) -53).method672(true, var177);
                                    }
                                    continue;
                                }
                                if (var483 == 5065) {
                                    var6 -= 2;
                                    int var178 = class238.field3957[var6 + 1];
                                    int var179 = class238.field3957[var6];
                                    if (var178 == -1) {
                                        class238.field3957[var6++] = -1;
                                    } else {
                                        class238.field3957[var6++] = class95.method773(var179, (byte) -34).method673(var178, (byte) 85);
                                    }
                                    continue;
                                }
                                if (var483 == 5066) {
                                    var6--;
                                    int var180 = class238.field3957[var6];
                                    class238.field3957[var6++] = class190.method1415(var180, arg1 + 6064).method663(false);
                                    continue;
                                }
                                if (var483 == 5067) {
                                    var6 -= 2;
                                    int var181 = class238.field3957[var6 + 1];
                                    int var182 = class238.field3957[var6];
                                    int var183 = class190.method1415(var182, 6047).method666(arg1 - 11020, var181);
                                    class238.field3957[var6++] = var183;
                                    continue;
                                }
                                if (var483 == 5068) {
                                    var6 -= 2;
                                    int var184 = class238.field3957[var6];
                                    int var185 = class238.field3957[var6 + 1];
                                    class196.field3330.field327[var184] = var185;
                                    continue;
                                }
                                if (var483 == 5069) {
                                    var6 -= 2;
                                    int var186 = class238.field3957[var6 + 1];
                                    int var187 = class238.field3957[var6];
                                    class196.field3330.field327[var187] = var186;
                                    continue;
                                }
                                if (var483 == 5070) {
                                    var6 -= 3;
                                    int var188 = class238.field3957[var6];
                                    int var189 = class238.field3957[var6 + 2];
                                    int var190 = class238.field3957[var6 + 1];
                                    class87 var191 = class190.method1415(var188, 6047);
                                    if (var191.method666(-11037, var190) != 0) {
                                        throw new RuntimeException("bad command");
                                    }
                                    class238.field3957[var6++] = var191.method665(var189, 120, var190);
                                    continue;
                                }
                            } else if (var483 < 5200) {
                                if (var483 == 5100) {
                                    if (class63.field991[86]) {
                                        class238.field3957[var6++] = 1;
                                    } else {
                                        class238.field3957[var6++] = 0;
                                    }
                                    continue;
                                }
                                if (var483 == 5101) {
                                    if (class63.field991[82]) {
                                        class238.field3957[var6++] = 1;
                                    } else {
                                        class238.field3957[var6++] = 0;
                                    }
                                    continue;
                                }
                                if (var483 == 5102) {
                                    if (class63.field991[81]) {
                                        class238.field3957[var6++] = 1;
                                    } else {
                                        class238.field3957[var6++] = 0;
                                    }
                                    continue;
                                }
                            } else if (var483 < 5300) {
                                if (var483 == 5200) {
                                    var10000 = arg1 + 67;
                                    var6--;
                                    class220.method1587(var10000, class238.field3957[var6]);
                                    continue;
                                }
                                if (var483 == 5201) {
                                    class238.field3957[var6++] = class127.method1023((byte) 40);
                                    continue;
                                }
                                if (var483 == 5202) {
                                    var6--;
                                    class15.method121(1, class238.field3957[var6]);
                                    continue;
                                }
                                if (var483 == 5203) {
                                    var8--;
                                    class203.method1508(class120.field2184[var8], (byte) -42);
                                    continue;
                                }
                                if (var483 == 5204) {
                                    class120.field2184[var8 - 1] = class25.method204(arg1 - 84, class120.field2184[var8 - 1]);
                                    continue;
                                }
                                if (var483 == 5205) {
                                    var8--;
                                    class54.method384(false, class120.field2184[var8]);
                                    continue;
                                }
                                if (var483 == 5206) {
                                    var6--;
                                    int var266 = class238.field3957[var6];
                                    class177 var267 = class46.method331(var266 & 0x3FFF, (var266 & 0xFFFF484) >> 14, arg1 + 13879);
                                    if (var267 == null) {
                                        class120.field2184[var8++] = class149.field2684;
                                    } else {
                                        class120.field2184[var8++] = var267.field3028;
                                    }
                                    continue;
                                }
                                if (var483 == 5207) {
                                    var8--;
                                    class177 var268 = class143.method1132(class120.field2184[var8], 0);
                                    if (var268 != null && var268.field3042 != null) {
                                        class120.field2184[var8++] = var268.field3042;
                                        continue;
                                    }
                                    class120.field2184[var8++] = class149.field2684;
                                    continue;
                                }
                            } else if (var483 < 5400) {
                                if (var483 == 5300) {
                                    var6 -= 2;
                                    int var253 = class238.field3957[var6];
                                    int var254 = class238.field3957[var6 + 1];
                                    class266.method1822((byte) -35, var253, var254, 3, false);
                                    class238.field3957[var6++] = class168.field2950 == null ? 0 : 1;
                                    continue;
                                }
                                if (var483 == 5301) {
                                    if (class168.field2950 != null) {
                                        class266.method1822((byte) -35, -1, -1, class258.field4296, false);
                                    }
                                    continue;
                                }
                                if (var483 == 5302) {
                                    class97[] var255 = class143.method1142((byte) -116);
                                    class238.field3957[var6++] = var255.length;
                                    continue;
                                }
                                if (var483 == 5303) {
                                    var6--;
                                    int var256 = class238.field3957[var6];
                                    class97[] var257 = class143.method1142((byte) -86);
                                    class238.field3957[var6++] = var257[var256].field1770;
                                    class238.field3957[var6++] = var257[var256].field1765;
                                    continue;
                                }
                                if (var483 == 5305) {
                                    int var258 = class138.field2465;
                                    int var259 = -1;
                                    int var260 = class204.field3452;
                                    class97[] var261 = class143.method1142((byte) -105);
                                    for (int var262 = 0; var262 < var261.length; var262++) {
                                        class97 var263 = var261[var262];
                                        if (var263.field1770 == var260 && var263.field1765 == var258) {
                                            var259 = var262;
                                            break;
                                        }
                                    }
                                    class238.field3957[var6++] = var259;
                                    continue;
                                }
                                if (var483 == 5306) {
                                    class238.field3957[var6++] = class251.method1754((byte) -126);
                                    continue;
                                }
                                if (var483 == 5307) {
                                    var6--;
                                    int var264 = class238.field3957[var6];
                                    if (var264 < 0 || var264 > 2) {
                                        var264 = 0;
                                    }
                                    class266.method1822((byte) -35, -1, -1, var264, false);
                                    continue;
                                }
                                if (var483 == 5308) {
                                    class238.field3957[var6++] = class258.field4296;
                                    continue;
                                }
                                if (var483 == 5309) {
                                    var6--;
                                    int var265 = class238.field3957[var6];
                                    if (var265 < 0 || var265 > 2) {
                                        var265 = 0;
                                    }
                                    class258.field4296 = var265;
                                    class27.method217(client.field1903, (byte) 84);
                                    continue;
                                }
                            } else if (var483 < 5500) {
                                if (var483 == 5400) {
                                    class290.field4898++;
                                    var8 -= 2;
                                    class162 var231 = class120.field2184[var8];
                                    class162 var232 = class120.field2184[var8 + 1];
                                    var6--;
                                    int var233 = class238.field3957[var6];
                                    class187.field3229.method338(44, (byte) 8);
                                    class187.field3229.method753(class298.method2043(var231, -1) - (-class298.method2043(var232, -1) - 1), true);
                                    class187.field3229.method727(var231, arg1 - 236);
                                    class187.field3229.method727(var232, -253);
                                    class187.field3229.method753(var233, true);
                                    continue;
                                }
                                if (var483 == 5401) {
                                    var6 -= 2;
                                    class265.field4410[class238.field3957[var6]] = (short) class92.method697(255, class238.field3957[var6 + 1]);
                                    class95.method764(arg1 - 29721);
                                    class209.method1541(1);
                                    class98.method787(-1);
                                    class274.method1862(false);
                                    class119.method970((byte) -118);
                                    continue;
                                }
                                if (var483 == 5405) {
                                    var6 -= 2;
                                    int var234 = class238.field3957[var6];
                                    int var235 = class238.field3957[var6 + 1];
                                    if (var234 >= 0 && var234 < 2) {
                                        class43.field719[var234] = new int[var235 << 1][4];
                                    }
                                    continue;
                                }
                                if (var483 == 5406) {
                                    var6 -= 7;
                                    int var236 = class238.field3957[var6];
                                    int var237 = class238.field3957[var6 + 3];
                                    int var238 = class238.field3957[var6 + 1] << 1;
                                    int var239 = class238.field3957[var6 + 2];
                                    int var240 = class238.field3957[var6 + 4];
                                    int var241 = class238.field3957[var6 + 6];
                                    int var242 = class238.field3957[var6 + 5];
                                    if (var236 >= 0 && var236 < 2 && class43.field719[var236] != null && var238 >= 0 && var238 < class43.field719[var236].length) {
                                        class43.field719[var236][var238] = new int[] { class92.method695(16383, var239 >> 14) * 128, var237, class92.method695(16383, var239) * 128, var241 };
                                        class43.field719[var236][var238 + 1] = new int[] { class92.method695(16383, var240 >> 14) * 128, var242, class92.method695(var240, 16383) * 128 };
                                    }
                                    continue;
                                }
                                if (var483 == 5407) {
                                    var6--;
                                    int var243 = class43.field719[class238.field3957[var6]].length >> 1;
                                    class238.field3957[var6++] = var243;
                                    continue;
                                }
                                if (var483 == 5411) {
                                    if (class168.field2950 != null) {
                                        class266.method1822((byte) -35, -1, -1, class258.field4296, false);
                                    }
                                    if (class95.field1740 == null) {
                                        class72.method520(class245.method1733(0), -99, false);
                                    } else {
                                        System.exit(0);
                                    }
                                    continue;
                                }
                                if (var483 == 5419) {
                                    class162 var244 = class149.field2684;
                                    if (class248.field4129 != null) {
                                        var244 = class78.method586(class248.field4129.field2935, -21629);
                                        try {
                                            if (class248.field4129.field2933 != null) {
                                                byte[] var245 = ((String) class248.field4129.field2933).getBytes("ISO-8859-1");
                                                var244 = class95.method768(var245.length, 0, var245, (byte) 120);
                                            }
                                        } catch (UnsupportedEncodingException var481) {
                                        }
                                    }
                                    class120.field2184[var8++] = var244;
                                    continue;
                                }
                                if (var483 == 5420) {
                                    class238.field3957[var6++] = class28.field470 == 3 ? 1 : 0;
                                    continue;
                                }
                                if (var483 == 5421) {
                                    if (class168.field2950 != null) {
                                        class266.method1822((byte) -35, -1, -1, class258.field4296, false);
                                    }
                                    var8--;
                                    class162 var247 = class120.field2184[var8];
                                    var6--;
                                    boolean var248 = class238.field3957[var6] == 1;
                                    class162 var249 = class135.method1062(new class162[] { class245.method1733(0), var247 }, true);
                                    if (class95.field1740 == null && (!var248 || class28.field470 == 3 || !class28.field472.startsWith("win") || class61.field939)) {
                                        class72.method520(var249, arg1 ^ 0xFFFFFFF5, var248);
                                        continue;
                                    }
                                    class244.field4065 = var248;
                                    class307.field5157 = var249;
                                    class177.field3041 = client.field1903.method235((byte) 55, new String(var249.method1263(-112), "ISO-8859-1"));
                                    continue;
                                }
                                if (var483 == 5422) {
                                    var6--;
                                    int var250 = class238.field3957[var6];
                                    var8 -= 2;
                                    class162 var251 = class120.field2184[var8 + 1];
                                    class162 var252 = class120.field2184[var8];
                                    if (var252.method1249((byte) -118) > 0) {
                                        if (class112.field2025 == null) {
                                            class112.field2025 = new class162[class314.field5301[class53.field841]];
                                        }
                                        class112.field2025[var250] = var252;
                                    }
                                    if (var251.method1249((byte) -118) > 0) {
                                        if (class81.field1412 == null) {
                                            class81.field1412 = new class162[class314.field5301[class53.field841]];
                                        }
                                        class81.field1412[var250] = var251;
                                    }
                                    continue;
                                }
                                if (var483 == 5423) {
                                    var8--;
                                    class120.field2184[var8].method1260(false);
                                    continue;
                                }
                            } else if (var483 < 5600) {
                                if (var483 == 5500) {
                                    var6 -= 4;
                                    int var192 = class238.field3957[var6];
                                    int var193 = class238.field3957[var6 + 2];
                                    int var194 = class238.field3957[var6 + 1];
                                    int var195 = class238.field3957[var6 + 3];
                                    class17.method138(var195, -32466, (var192 & 0x3FFF) - class258.field4294, false, ((var192 & 0xFFFF117) >> 14) - class178.field3052, var194, var193);
                                    continue;
                                }
                                if (var483 == 5501) {
                                    var6 -= 4;
                                    int var196 = class238.field3957[var6 + 1];
                                    int var197 = class238.field3957[var6 + 3];
                                    int var198 = class238.field3957[var6];
                                    int var199 = class238.field3957[var6 + 2];
                                    class7.method43(var199, false, var197, ((var198 & 0xFFFC937) >> 14) - class178.field3052, var196, (var198 & 0x3FFF) - class258.field4294);
                                    continue;
                                }
                                if (var483 == 5502) {
                                    var6 -= 6;
                                    int var200 = class238.field3957[var6];
                                    if (var200 >= 2) {
                                        throw new RuntimeException();
                                    }
                                    class73.field1169 = var200;
                                    int var201 = class238.field3957[var6 + 1];
                                    if (class43.field719[class73.field1169].length >> 1 <= var201 + 1) {
                                        throw new RuntimeException();
                                    }
                                    class202.field3424 = var201;
                                    class303.field5107 = 0;
                                    class57.field888 = class238.field3957[var6 + 2];
                                    class262.field4370 = class238.field3957[var6 + 3];
                                    int var202 = class238.field3957[var6 + 4];
                                    if (var202 >= 2) {
                                        throw new RuntimeException();
                                    }
                                    class168.field2951 = var202;
                                    int var203 = class238.field3957[var6 + 5];
                                    if ((var203 + 1) >= (class43.field719[class168.field2951].length >> 1)) {
                                        throw new RuntimeException();
                                    }
                                    class302.field5085 = 3;
                                    class212.field3559 = var203;
                                    continue;
                                }
                                if (var483 == 5503) {
                                    class97.method781(-1);
                                    continue;
                                }
                                if (var483 == 5504) {
                                    var6 -= 2;
                                    class160.field2803 = class238.field3957[var6];
                                    class265.field4414 = class238.field3957[var6 + 1];
                                    class292.method2022((byte) 122);
                                    continue;
                                }
                                if (var483 == 5505) {
                                    class238.field3957[var6++] = class160.field2803;
                                    continue;
                                }
                                if (var483 == 5506) {
                                    class238.field3957[var6++] = class265.field4414;
                                    continue;
                                }
                            } else if (var483 < 5700) {
                                if (var483 == 5600) {
                                    var8 -= 2;
                                    class162 var204 = class120.field2184[var8 + 1];
                                    var6--;
                                    int var205 = class238.field3957[var6];
                                    class162 var206 = class120.field2184[var8];
                                    if (class262.field4380 == 10 && class201.field3415 == 0 && class131.field2364 == 0 && class87.field1556 == 0 && class87.field1552 == 0) {
                                        class220.method1589(-123, var204, var205, var206);
                                    }
                                    continue;
                                }
                                if (var483 == 5601) {
                                    class269.method1839(-300975924);
                                    continue;
                                }
                                if (var483 == 5602) {
                                    if (class131.field2364 == 0) {
                                        class217.field3620 = -2;
                                    }
                                    continue;
                                }
                                if (var483 == 5603) {
                                    var6 -= 4;
                                    if (class262.field4380 == 10 && class201.field3415 == 0 && class131.field2364 == 0 && class87.field1556 == 0 && class87.field1552 == 0) {
                                        class178.method1347(class238.field3957[var6 + 1], class238.field3957[var6 + 2], class238.field3957[var6], arg1 + 14, class238.field3957[var6 + 3]);
                                    }
                                    continue;
                                }
                                if (var483 == 5604) {
                                    var8--;
                                    if (class262.field4380 == 10 && class201.field3415 == 0 && class131.field2364 == 0 && class87.field1556 == 0 && class87.field1552 == 0) {
                                        class187.method1404(class120.field2184[var8].method1256(0), (byte) 68);
                                    }
                                    continue;
                                }
                                if (var483 == 5605) {
                                    var8 -= 2;
                                    var6 -= 4;
                                    if (class262.field4380 == 10 && class201.field3415 == 0 && class131.field2364 == 0 && class87.field1556 == 0 && class87.field1552 == 0) {
                                        class82.method629(class120.field2184[var8 + 1], arg1 ^ 0xFFFF8433, class238.field3957[var6 + 1], class238.field3957[var6 + 2], class120.field2184[var8].method1256(0), class238.field3957[var6 + 3], class238.field3957[var6]);
                                    }
                                    continue;
                                }
                                if (var483 == 5606) {
                                    if (class87.field1556 == 0) {
                                        class92.field1624 = -2;
                                    }
                                    continue;
                                }
                                if (var483 == 5607) {
                                    class238.field3957[var6++] = class217.field3620;
                                    continue;
                                }
                                if (var483 == 5608) {
                                    class238.field3957[var6++] = class49.field780;
                                    continue;
                                }
                                if (var483 == 5609) {
                                    class238.field3957[var6++] = class92.field1624;
                                    continue;
                                }
                                if (var483 == 5610) {
                                    for (int var207 = 0; var207 < 5; var207++) {
                                        class120.field2184[var8++] = var207 < class119.field2164.length ? class119.field2164[var207].method1265((byte) 46) : class149.field2684;
                                    }
                                    class119.field2164 = null;
                                    continue;
                                }
                                if (var483 == 5611) {
                                    class238.field3957[var6++] = class297.field4973;
                                    continue;
                                }
                            } else if (var483 < 6100) {
                                if (var483 == 6001) {
                                    var6--;
                                    int var208 = class238.field3957[var6];
                                    if (var208 < 1) {
                                        var208 = 1;
                                    }
                                    if (var208 > 4) {
                                        var208 = 4;
                                    }
                                    class39.field639 = var208;
                                    if (!class117.field2159 || !class92.field1634) {
                                        if (class39.field639 == 1) {
                                            class312.method2130(0.9F);
                                        }
                                        if (class39.field639 == 2) {
                                            class312.method2130(0.8F);
                                        }
                                        if (class39.field639 == 3) {
                                            class312.method2130(0.7F);
                                        }
                                        if (class39.field639 == 4) {
                                            class312.method2130(0.6F);
                                        }
                                    }
                                    if (class117.field2159) {
                                        class245.method1729((byte) -115);
                                        if (!class92.field1634) {
                                            class91.method685(42);
                                        }
                                    }
                                    class209.method1541(1);
                                    class27.method217(client.field1903, (byte) 95);
                                    class87.field1558 = false;
                                    continue;
                                }
                                if (var483 == 6002) {
                                    var6--;
                                    class256.method1769(class238.field3957[var6] == 1, 1);
                                    class55.method392((byte) -17);
                                    class91.method685(35);
                                    class80.method618(-120);
                                    class27.method217(client.field1903, (byte) 73);
                                    class87.field1558 = false;
                                    continue;
                                }
                                if (var483 == 6003) {
                                    var6--;
                                    class45.field724 = class238.field3957[var6] == 1;
                                    class80.method618(arg1 - 98);
                                    class27.method217(client.field1903, (byte) 106);
                                    class87.field1558 = false;
                                    continue;
                                }
                                if (var483 == 6005) {
                                    var6--;
                                    class267.field4461 = class238.field3957[var6] == 1;
                                    class91.method685(arg1 + 37);
                                    class27.method217(client.field1903, (byte) 66);
                                    class87.field1558 = false;
                                    continue;
                                }
                                if (var483 == 6006) {
                                    var6--;
                                    class203.field3439 = class238.field3957[var6] == 1;
                                    ((class17) class312.field5271).method143(!class203.field3439, 1);
                                    class27.method217(client.field1903, (byte) 125);
                                    class87.field1558 = false;
                                    continue;
                                }
                                if (var483 == 6007) {
                                    var6--;
                                    class261.field4362 = class238.field3957[var6] == 1;
                                    class27.method217(client.field1903, (byte) 85);
                                    class87.field1558 = false;
                                    continue;
                                }
                                if (var483 == 6008) {
                                    var6--;
                                    class295.field4945 = class238.field3957[var6] == 1;
                                    class27.method217(client.field1903, (byte) 61);
                                    class87.field1558 = false;
                                    continue;
                                }
                                if (var483 == 6009) {
                                    var6--;
                                    class247.field4090 = class238.field3957[var6] == 1;
                                    class27.method217(client.field1903, (byte) 83);
                                    class87.field1558 = false;
                                    continue;
                                }
                                if (var483 == 6010) {
                                    var6--;
                                    class92.field1621 = class238.field3957[var6] == 1;
                                    class27.method217(client.field1903, (byte) 110);
                                    class87.field1558 = false;
                                    continue;
                                }
                                if (var483 == 6011) {
                                    var6--;
                                    int var209 = class238.field3957[var6];
                                    if (var209 < 0 || var209 > 2) {
                                        var209 = 0;
                                    }
                                    class291.field4906 = var209;
                                    class27.method217(client.field1903, (byte) 106);
                                    class87.field1558 = false;
                                    continue;
                                }
                                if (var483 == 6012) {
                                    if (class117.field2159) {
                                        class116.method913(true, 0, 0);
                                    }
                                    var6--;
                                    class92.field1634 = class238.field3957[var6] == 1;
                                    if (class117.field2159 && class92.field1634) {
                                        class312.method2130(0.7F);
                                    } else {
                                        if (class39.field639 == 1) {
                                            class312.method2130(0.9F);
                                        }
                                        if (class39.field639 == 2) {
                                            class312.method2130(0.8F);
                                        }
                                        if (class39.field639 == 3) {
                                            class312.method2130(0.7F);
                                        }
                                        if (class39.field639 == 4) {
                                            class312.method2130(0.6F);
                                        }
                                    }
                                    class91.method685(64);
                                    class27.method217(client.field1903, (byte) 75);
                                    class87.field1558 = false;
                                    continue;
                                }
                                if (var483 == 6014) {
                                    var6--;
                                    class27.field458 = class238.field3957[var6] == 1;
                                    if (class117.field2159) {
                                        class91.method685(118);
                                    }
                                    class27.method217(client.field1903, (byte) 75);
                                    class87.field1558 = false;
                                    continue;
                                }
                                if (var483 == 6015) {
                                    var6--;
                                    class259.field4317 = class238.field3957[var6] == 1;
                                    if (class117.field2159) {
                                        class245.method1729((byte) -128);
                                    }
                                    class27.method217(client.field1903, (byte) 58);
                                    class87.field1558 = false;
                                    continue;
                                }
                                if (var483 == 6016) {
                                    var6--;
                                    int var210 = class238.field3957[var6];
                                    if (class117.field2159) {
                                        class180.field3089 = true;
                                    }
                                    if (var210 < 0 || var210 > 2) {
                                        var210 = 0;
                                    }
                                    class112.field2031 = var210;
                                    class27.method217(client.field1903, (byte) 64);
                                    class87.field1558 = false;
                                    continue;
                                }
                                if (var483 == 6017) {
                                    var6--;
                                    class156.field2746 = class238.field3957[var6] == 1;
                                    class143.method1139(-111);
                                    class27.method217(client.field1903, (byte) 65);
                                    class87.field1558 = false;
                                    continue;
                                }
                                if (var483 == 6018) {
                                    var6--;
                                    int var211 = class238.field3957[var6];
                                    if (var211 < 0) {
                                        var211 = 0;
                                    }
                                    if (var211 > 127) {
                                        var211 = 127;
                                    }
                                    class154.field2727 = var211;
                                    class27.method217(client.field1903, (byte) 125);
                                    class87.field1558 = false;
                                    continue;
                                }
                                if (var483 == 6019) {
                                    var6--;
                                    int var212 = class238.field3957[var6];
                                    if (var212 < 0) {
                                        var212 = 0;
                                    }
                                    if (var212 > 255) {
                                        var212 = 255;
                                    }
                                    if (class135.field2413 != var212) {
                                        if (class135.field2413 == 0 && class163.field2887 != -1) {
                                            class252.method1759((byte) -56, class178.field3047, var212, class163.field2887, 0, false);
                                            class127.field2307 = false;
                                        } else if (var212 == 0) {
                                            class158.method1222(72);
                                            class127.field2307 = false;
                                        } else {
                                            class240.method1694(var212, (byte) 127);
                                        }
                                        class135.field2413 = var212;
                                    }
                                    class27.method217(client.field1903, (byte) 61);
                                    class87.field1558 = false;
                                    continue;
                                }
                                if (var483 == 6020) {
                                    var6--;
                                    int var213 = class238.field3957[var6];
                                    if (var213 < 0) {
                                        var213 = 0;
                                    }
                                    if (var213 > 127) {
                                        var213 = 127;
                                    }
                                    class256.field4256 = var213;
                                    class27.method217(client.field1903, (byte) 112);
                                    class87.field1558 = false;
                                    continue;
                                }
                                if (var483 == 6021) {
                                    var6--;
                                    class289.field4878 = class238.field3957[var6] == 1;
                                    class80.method618(-115);
                                    continue;
                                }
                            } else if (var483 < 6200) {
                                if (var483 == 6101) {
                                    class238.field3957[var6++] = class39.field639;
                                    continue;
                                }
                                if (var483 == 6102) {
                                    class238.field3957[var6++] = class4.method19(-125) ? 1 : 0;
                                    continue;
                                }
                                if (var483 == 6103) {
                                    class238.field3957[var6++] = class45.field724 ? 1 : 0;
                                    continue;
                                }
                                if (var483 == 6105) {
                                    class238.field3957[var6++] = class267.field4461 ? 1 : 0;
                                    continue;
                                }
                                if (var483 == 6106) {
                                    class238.field3957[var6++] = class203.field3439 ? 1 : 0;
                                    continue;
                                }
                                if (var483 == 6107) {
                                    class238.field3957[var6++] = class261.field4362 ? 1 : 0;
                                    continue;
                                }
                                if (var483 == 6108) {
                                    class238.field3957[var6++] = class295.field4945 ? 1 : 0;
                                    continue;
                                }
                                if (var483 == 6109) {
                                    class238.field3957[var6++] = class247.field4090 ? 1 : 0;
                                    continue;
                                }
                                if (var483 == 6110) {
                                    class238.field3957[var6++] = class92.field1621 ? 1 : 0;
                                    continue;
                                }
                                if (var483 == 6111) {
                                    class238.field3957[var6++] = class291.field4906;
                                    continue;
                                }
                                if (var483 == 6112) {
                                    class238.field3957[var6++] = class92.field1634 ? 1 : 0;
                                    continue;
                                }
                                if (var483 == 6114) {
                                    class238.field3957[var6++] = class27.field458 ? 1 : 0;
                                    continue;
                                }
                                if (var483 == 6115) {
                                    class238.field3957[var6++] = class259.field4317 ? 1 : 0;
                                    continue;
                                }
                                if (var483 == 6116) {
                                    class238.field3957[var6++] = class112.field2031;
                                    continue;
                                }
                                if (var483 == 6117) {
                                    class238.field3957[var6++] = class156.field2746 ? 1 : 0;
                                    continue;
                                }
                                if (var483 == 6118) {
                                    class238.field3957[var6++] = class154.field2727;
                                    continue;
                                }
                                if (var483 == 6119) {
                                    class238.field3957[var6++] = class135.field2413;
                                    continue;
                                }
                                if (var483 == 6120) {
                                    class238.field3957[var6++] = class256.field4256;
                                    continue;
                                }
                                if (var483 == 6121) {
                                    if (class117.field2159) {
                                        class238.field3957[var6++] = class117.field2141 ? 1 : 0;
                                    } else {
                                        class238.field3957[var6++] = 0;
                                    }
                                    continue;
                                }
                            } else if (var483 < 6300) {
                                if (var483 == 6200) {
                                    var6 -= 2;
                                    class7.field71 = (short) class238.field3957[var6];
                                    if (class7.field71 <= 0) {
                                        class7.field71 = 256;
                                    }
                                    class34.field559 = (short) class238.field3957[var6 + 1];
                                    if (class34.field559 <= 0) {
                                        class34.field559 = 205;
                                    }
                                    continue;
                                }
                                if (var483 == 6201) {
                                    var6 -= 2;
                                    class20.field317 = (short) class238.field3957[var6];
                                    if (class20.field317 <= 0) {
                                        class20.field317 = 256;
                                    }
                                    class291.field4901 = (short) class238.field3957[var6 + 1];
                                    if (class291.field4901 <= 0) {
                                        class291.field4901 = 320;
                                    }
                                    continue;
                                }
                                if (var483 == 6202) {
                                    var6 -= 4;
                                    class15.field236 = (short) class238.field3957[var6];
                                    if (class15.field236 <= 0) {
                                        class15.field236 = 1;
                                    }
                                    class251.field4200 = (short) class238.field3957[var6 + 1];
                                    if (class251.field4200 <= 0) {
                                        class251.field4200 = 32767;
                                    } else if (class251.field4200 < class15.field236) {
                                        class251.field4200 = class15.field236;
                                    }
                                    class183.field3164 = (short) class238.field3957[var6 + 2];
                                    if (class183.field3164 <= 0) {
                                        class183.field3164 = 1;
                                    }
                                    class167.field2938 = (short) class238.field3957[var6 + 3];
                                    if (class167.field2938 <= 0) {
                                        class167.field2938 = 32767;
                                    } else if (class167.field2938 < class183.field3164) {
                                        class167.field2938 = class183.field3164;
                                    }
                                    continue;
                                }
                                if (var483 == 6203) {
                                    class203.method1512(false, 0, (byte) 126, 0, class171.field2970.field1367, class171.field2970.field1340);
                                    class238.field3957[var6++] = class60.field925;
                                    class238.field3957[var6++] = class142.field2525;
                                    continue;
                                }
                                if (var483 == 6204) {
                                    class238.field3957[var6++] = class20.field317;
                                    class238.field3957[var6++] = class291.field4901;
                                    continue;
                                }
                                if (var483 == 6205) {
                                    class238.field3957[var6++] = class7.field71;
                                    class238.field3957[var6++] = class34.field559;
                                    continue;
                                }
                            } else if (var483 < 6400) {
                                if (var483 == 6300) {
                                    class238.field3957[var6++] = (int) (class300.method2048((byte) 18) / 60000L);
                                    continue;
                                }
                                if (var483 == 6301) {
                                    class238.field3957[var6++] = (int) (class300.method2048((byte) 18) / 86400000L) - 11745;
                                    continue;
                                }
                                if (var483 == 6302) {
                                    var6 -= 3;
                                    int var226 = class238.field3957[var6];
                                    int var227 = class238.field3957[var6 + 2];
                                    int var228 = class238.field3957[var6 + 1];
                                    class262.field4373.clear();
                                    class262.field4373.set(11, 12);
                                    class262.field4373.set(var227, var228, var226);
                                    class238.field3957[var6++] = (int) (class262.field4373.getTime().getTime() / 86400000L) - 11745;
                                    continue;
                                }
                                if (var483 == 6303) {
                                    class262.field4373.clear();
                                    class262.field4373.setTime(new Date(class300.method2048((byte) 18)));
                                    class238.field3957[var6++] = class262.field4373.get(1);
                                    continue;
                                }
                                if (var483 == 6304) {
                                    var6--;
                                    int var229 = class238.field3957[var6];
                                    boolean var230 = true;
                                    if (var229 < 0) {
                                        var230 = ((var229 + 1) % 4) == 0;
                                    } else if (var229 < 1582) {
                                        var230 = var229 % 4 == 0;
                                    } else if (var229 % 4 != 0) {
                                        var230 = false;
                                    } else if ((var229 % 100) != 0) {
                                        var230 = true;
                                    } else if (var229 % 400 != 0) {
                                        var230 = false;
                                    }
                                    class238.field3957[var6++] = var230 ? 1 : 0;
                                    continue;
                                }
                            } else if (var483 < 6500) {
                                if (var483 == 6405) {
                                    class238.field3957[var6++] = class291.method2015(150) ? 1 : 0;
                                    continue;
                                }
                                if (var483 == 6406) {
                                    class238.field3957[var6++] = class258.method1783(-128) ? 1 : 0;
                                    continue;
                                }
                            } else if (var483 < 6600) {
                                if (var483 == 6500) {
                                    if (class262.field4380 == 10 && class201.field3415 == 0 && class131.field2364 == 0 && class87.field1556 == 0) {
                                        class238.field3957[var6++] = class137.method1073((byte) 16) == -1 ? 0 : 1;
                                        continue;
                                    }
                                    class238.field3957[var6++] = 1;
                                    continue;
                                }
                                if (var483 == 6501) {
                                    class223 var214 = class286.method1971(arg1 + 17);
                                    if (var214 == null) {
                                        class238.field3957[var6++] = -1;
                                        class238.field3957[var6++] = 0;
                                        class120.field2184[var8++] = class149.field2684;
                                        class238.field3957[var6++] = 0;
                                        class120.field2184[var8++] = class149.field2684;
                                        class238.field3957[var6++] = 0;
                                    } else {
                                        class238.field3957[var6++] = var214.field3721;
                                        class238.field3957[var6++] = var214.field7;
                                        class120.field2184[var8++] = var214.field3731;
                                        class59 var215 = var214.method1617(-125);
                                        class238.field3957[var6++] = var215.field924;
                                        class120.field2184[var8++] = var215.field920;
                                        class238.field3957[var6++] = var214.field15;
                                    }
                                    continue;
                                }
                                if (var483 == 6502) {
                                    class223 var216 = class47.method341((byte) 63);
                                    if (var216 == null) {
                                        class238.field3957[var6++] = -1;
                                        class238.field3957[var6++] = 0;
                                        class120.field2184[var8++] = class149.field2684;
                                        class238.field3957[var6++] = 0;
                                        class120.field2184[var8++] = class149.field2684;
                                        class238.field3957[var6++] = 0;
                                    } else {
                                        class238.field3957[var6++] = var216.field3721;
                                        class238.field3957[var6++] = var216.field7;
                                        class120.field2184[var8++] = var216.field3731;
                                        class59 var217 = var216.method1617(-123);
                                        class238.field3957[var6++] = var217.field924;
                                        class120.field2184[var8++] = var217.field920;
                                        class238.field3957[var6++] = var216.field15;
                                    }
                                    continue;
                                }
                                if (var483 == 6503) {
                                    var6--;
                                    int var218 = class238.field3957[var6];
                                    if (class262.field4380 == 10 && class201.field3415 == 0 && class131.field2364 == 0 && class87.field1556 == 0) {
                                        class238.field3957[var6++] = class263.method1809(var218, 1) ? 1 : 0;
                                        continue;
                                    }
                                    class238.field3957[var6++] = 0;
                                    continue;
                                }
                                if (var483 == 6504) {
                                    var6--;
                                    class220.field3674 = class238.field3957[var6];
                                    class27.method217(client.field1903, (byte) 87);
                                    continue;
                                }
                                if (var483 == 6505) {
                                    class238.field3957[var6++] = class220.field3674;
                                    continue;
                                }
                                if (var483 == 6506) {
                                    var6--;
                                    int var219 = class238.field3957[var6];
                                    class223 var220 = class31.method256((byte) -100, var219);
                                    if (var220 == null) {
                                        class238.field3957[var6++] = -1;
                                        class120.field2184[var8++] = class149.field2684;
                                        class238.field3957[var6++] = 0;
                                        class120.field2184[var8++] = class149.field2684;
                                        class238.field3957[var6++] = 0;
                                    } else {
                                        class238.field3957[var6++] = var220.field7;
                                        class120.field2184[var8++] = var220.field3731;
                                        class59 var221 = var220.method1617(-128);
                                        class238.field3957[var6++] = var221.field924;
                                        class120.field2184[var8++] = var221.field920;
                                        class238.field3957[var6++] = var220.field15;
                                    }
                                    continue;
                                }
                                if (var483 == 6507) {
                                    var6 -= 4;
                                    int var222 = class238.field3957[var6];
                                    boolean var223 = class238.field3957[var6 + 1] == 1;
                                    int var224 = class238.field3957[var6 + 2];
                                    boolean var225 = class238.field3957[var6 + 3] == 1;
                                    class81.method622(var222, var225, var223, var224, -1);
                                    continue;
                                }
                            }
                        } else if (var483 == 4400) {
                            var6 -= 2;
                            int var269 = class238.field3957[var6 + 1];
                            int var270 = class238.field3957[var6];
                            class278 var271 = class211.method1549(var269, true);
                            if (var271.method1912(-10190)) {
                                class120.field2184[var8++] = class229.method1637(var270, (byte) 93).method2108((byte) 85, var269, var271.field4684);
                            } else {
                                class238.field3957[var6++] = class229.method1637(var270, (byte) 93).method2095(arg1 - 32052, var269, var271.field4688);
                            }
                            continue;
                        }
                    } else {
                        class78 var59;
                        if (var483 < 2000) {
                            var59 = var46 ? class48.field765 : class279.field4704;
                        } else {
                            var6--;
                            var59 = class61.method419((byte) 28, class238.field3957[var6]);
                            var483 -= 1000;
                        }
                        if (var483 == 1300) {
                            var6--;
                            int var60 = class238.field3957[var6] - 1;
                            if (var60 >= 0 && var60 <= 9) {
                                var10001 = arg1 ^ 0xFFFFDBD7;
                                var8--;
                                var59.method595(var10001, class120.field2184[var8], var60);
                                continue;
                            }
                            var8--;
                            continue;
                        }
                        if (var483 == 1301) {
                            var6 -= 2;
                            int var61 = class238.field3957[var6];
                            int var62 = class238.field3957[var6 + 1];
                            var59.field1325 = class112.method903(var61, var62, -25988);
                            continue;
                        }
                        if (var483 == 1302) {
                            var6--;
                            var59.field1245 = class238.field3957[var6] == 1;
                            continue;
                        }
                        if (var483 == 1303) {
                            var6--;
                            var59.field1295 = class238.field3957[var6];
                            continue;
                        }
                        if (var483 == 1304) {
                            var6--;
                            var59.field1350 = class238.field3957[var6];
                            continue;
                        }
                        if (var483 == 1305) {
                            var8--;
                            var59.field1320 = class120.field2184[var8];
                            continue;
                        }
                        if (var483 == 1306) {
                            var8--;
                            var59.field1267 = class120.field2184[var8];
                            continue;
                        }
                        if (var483 == 1307) {
                            var59.field1232 = null;
                            continue;
                        }
                    }
                    throw new IllegalStateException();
                }
            }
        } catch (Exception var482) {
            if (var5.field3117 == null) {
                if (class8.field88 != 0) {
                    class82.method633(0, class105.field1913, class149.field2684, -90);
                }
                class129.method1039(-8, "CS2 - scr:" + var5.field2701 + " op:" + var10, var482);
            } else {
                class162 var478 = class203.method1511((byte) 118, 30);
                var478.method1264(7, class131.field2359).method1264(108, var5.field3117);
                for (int var479 = class57.field885 - 1; var479 >= 0; var479--) {
                    var478.method1264(107, class214.field3596).method1264(111, class43.field695[var479].field2648.field3117);
                }
                if (var10 == 40) {
                    int var480 = var9[var11];
                    var478.method1264(125, class315.field5323).method1264(123, class156.method1212(10, var480));
                }
                if (class8.field88 != 0) {
                    class82.method633(0, class135.method1062(new class162[] { class266.field4442, var5.field3117 }, true), class149.field2684, -47);
                }
                class129.method1039(-8, "CS2 - scr:" + var5.field2701 + " op:" + var10 + new String(var478.method1263(-104)), var482);
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V", line = 5960)
    public static final void method1718(int arg0) {
        field4025++;
        class292.field4911.method1529(false);
        if (arg0 == -2132607698) {
            class183.field3160.method1529(false);
            class126.field2294.method1529(false);
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)V", line = 5991)
    public static final void method1719(int arg0, int arg1) {
        field4031++;
        class229.field3810 = arg0;
        if (arg1 <= 98) {
            field4021 = (class162) null;
        }
        class17.method139(3, true);
        class17.method139(4, true);
    }
}
