import java.io.UnsupportedEncodingException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class250 {

    @OriginalMember(owner = "client!lk", name = "o", descriptor = "Z")
    public boolean field4320 = false;

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "I")
    public static int field4309 = 0;

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "I")
    public static int field4312 = 2;

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "Ls;")
    public static class171 field4314 = null;

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "Loh;")
    public static class258 field4313 = class153.method1046("Sprites geladen)3", 121);

    @OriginalMember(owner = "client!lk", name = "m", descriptor = "Loh;")
    public static class258 field4318 = class153.method1046("Versteckt", 85);

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "I")
    public int field4307;

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "I")
    public static int field4308;

    @OriginalMember(owner = "client!lk", name = "j", descriptor = "I")
    public int field4315;

    @OriginalMember(owner = "client!lk", name = "k", descriptor = "I")
    public static int field4316;

    @OriginalMember(owner = "client!lk", name = "l", descriptor = "I")
    public int field4317;

    @OriginalMember(owner = "client!lk", name = "n", descriptor = "I")
    public static int field4319;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "J")
    public long field4306;

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "Lrk;")
    public class123 field4310;

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "[Lrm;")
    public static class113[] field4311;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(II[Led;IIII[BIIZ)V", line = 15)
    public static final void method1695(int arg0, int arg1, class245[] arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, int arg8, int arg9, boolean arg10) {
        if (arg0 != -3610) {
            method1695(37, 51, (class245[]) null, 64, 110, 57, -7, (byte[]) null, 86, -122, true);
        }
        field4316++;
        if (!arg10) {
            for (int var11 = 0; var11 < 8; var11++) {
                for (int var12 = 0; var12 < 8; var12++) {
                    if ((arg6 + var11) > 0 && (arg6 + var11) < 103 && (arg5 + var12) > 0 && arg5 + var12 < 103) {
                        arg2[arg3].field4255[arg6 + var11][arg5 + var12] = class2.method15(arg2[arg3].field4255[arg6 + var11][arg5 + var12], -16777217);
                    }
                }
            }
        }
        byte var13;
        if (arg10) {
            var13 = 1;
        } else {
            var13 = 4;
        }
        class235 var14 = new class235(arg7);
        for (int var15 = 0; var15 < var13; var15++) {
            for (int var16 = 0; var16 < 64; var16++) {
                for (int var17 = 0; var17 < 64; var17++) {
                    if (arg4 == var15 && var16 >= arg1 && arg1 + 8 > var16 && arg8 <= var17 && arg8 + 8 > var17) {
                        class291.method2046(arg3, arg10, 0, 0, class231.method1540((byte) 96, var17 & 0x7, var16 & 0x7, arg9) + arg5, arg6 - -class48.method391(-78, arg9, var17 & 0x7, var16 & 0x7), var14, 126, arg9);
                    } else {
                        class291.method2046(0, arg10, 0, 0, -1, -1, var14, 127, 0);
                    }
                }
            }
        }
        if (!class257.field4390 || arg10) {
            return;
        }
        class60 var18 = null;
        while (true) {
            int var20;
            label101: do {
                while (var14.field4066.length > var14.field4051) {
                    int var19 = var14.method1589(120);
                    if (var19 != 0) {
                        if (var19 != 1) {
                            throw new IllegalStateException();
                        }
                        var20 = var14.method1589(104);
                        continue label101;
                    }
                    var18 = new class60(var14);
                }
                if (var18 == null) {
                    var18 = new class60();
                }
                class57.field899[arg6 >> 3][arg5 >> 3] = var18;
                return;
            } while (var20 <= 0);
            for (int var21 = 0; var21 < var20; var21++) {
                class284 var22 = new class284(var14);
                int var23 = var22.field4877 >> 7;
                int var24 = var22.field4892 >> 7;
                if (var22.field4900 == arg4 && var23 >= arg1 && arg1 + 8 > var23 && arg8 <= var24 && var24 < (arg8 + 8)) {
                    int var25 = (arg6 << 7) + class193.method1300(arg9, var22.field4877 & 0x3FF, 16342, var22.field4892 & 0x3FF);
                    int var26 = (arg5 << 7) + class83.method599(var22.field4877 & 0x3FF, var22.field4892 & 0x3FF, arg9, -118);
                    var22.field4877 = var25;
                    int var27 = var22.field4877 >> 7;
                    var22.field4892 = var26;
                    int var28 = var22.field4892 >> 7;
                    if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104) {
                        var22.field4883 = class201.field3482[var22.field4900][var27][var28] - var22.field4883;
                        class267.method1892(var22);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Z)V", line = 167)
    public static void method1696(boolean arg0) {
        field4318 = null;
        if (arg0) {
            field4311 = (class113[]) null;
        }
        field4314 = null;
        field4313 = null;
        field4311 = null;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IILec;)V", line = 189)
    public static final void method1697(int arg0, int arg1, class42 arg2) {
        field4319++;
        Object[] var3 = arg2.field600;
        int var4 = (Integer) var3[0];
        class148 var5 = class310.method2154(var4, (byte) 108);
        if (var5 == null || arg1 != -2704) {
            return;
        }
        int var6 = 0;
        int var7 = 0;
        class95.field1664 = 0;
        int var8 = -1;
        int[] var9 = var5.field2510;
        byte var10 = -1;
        int[] var11 = var5.field2521;
        try {
            class130.field2285 = new class258[var5.field2506];
            int var12 = 0;
            int var13 = 0;
            class130.field2284 = new int[var5.field2520];
            for (int var14 = 1; var14 < var3.length; var14++) {
                if (var3[var14] instanceof Integer) {
                    int var15 = (Integer) var3[var14];
                    if (var15 == -2147483647) {
                        var15 = arg2.field591;
                    }
                    if (var15 == -2147483646) {
                        var15 = arg2.field584;
                    }
                    if (var15 == -2147483645) {
                        var15 = arg2.field598 == null ? -1 : arg2.field598.field3061;
                    }
                    if (var15 == -2147483644) {
                        var15 = arg2.field580;
                    }
                    if (var15 == -2147483643) {
                        var15 = arg2.field598 == null ? -1 : arg2.field598.field2930;
                    }
                    if (var15 == -2147483642) {
                        var15 = arg2.field596 == null ? -1 : arg2.field596.field3061;
                    }
                    if (var15 == -2147483641) {
                        var15 = arg2.field596 == null ? -1 : arg2.field596.field2930;
                    }
                    if (var15 == -2147483640) {
                        var15 = arg2.field594;
                    }
                    if (var15 == -2147483639) {
                        var15 = arg2.field601;
                    }
                    class130.field2284[var13++] = var15;
                } else if (var3[var14] instanceof class258) {
                    class258 var16 = (class258) var3[var14];
                    if (var16.method1821(arg1 + 2703, class38.field501)) {
                        var16 = arg2.field575;
                    }
                    class130.field2285[var12++] = var16;
                }
            }
            int var17 = 0;
            label3979: while (true) {
                var17++;
                if (var17 > arg0) {
                    throw new RuntimeException("slow");
                }
                var8++;
                int var483 = var9[var8];
                if (var483 < 100) {
                    if (var483 == 0) {
                        class168.field2850[var7++] = var11[var8];
                        continue;
                    }
                    if (var483 == 1) {
                        int var18 = var11[var8];
                        class168.field2850[var7++] = class227.field3917[var18];
                        continue;
                    }
                    if (var483 == 2) {
                        int var19 = var11[var8];
                        var7--;
                        class232.method1553(class168.field2850[var7], arg1 ^ 0xFF00F570, var19);
                        continue;
                    }
                    if (var483 == 3) {
                        class70.field1211[var6++] = var5.field2505[var8];
                        continue;
                    }
                    if (var483 == 6) {
                        var8 += var11[var8];
                        continue;
                    }
                    if (var483 == 7) {
                        var7 -= 2;
                        if (class168.field2850[var7 + 1] != class168.field2850[var7]) {
                            var8 += var11[var8];
                        }
                        continue;
                    }
                    if (var483 == 8) {
                        var7 -= 2;
                        if (class168.field2850[var7 + 1] == class168.field2850[var7]) {
                            var8 += var11[var8];
                        }
                        continue;
                    }
                    if (var483 == 9) {
                        var7 -= 2;
                        if (class168.field2850[var7] < class168.field2850[var7 + 1]) {
                            var8 += var11[var8];
                        }
                        continue;
                    }
                    if (var483 == 10) {
                        var7 -= 2;
                        if (class168.field2850[var7] > class168.field2850[var7 + 1]) {
                            var8 += var11[var8];
                        }
                        continue;
                    }
                    if (var483 == 21) {
                        if (class95.field1664 == 0) {
                            return;
                        }
                        class32 var20 = class234.field4046[--class95.field1664];
                        class130.field2284 = var20.field382;
                        var8 = var20.field378;
                        class130.field2285 = var20.field379;
                        var5 = var20.field388;
                        var9 = var5.field2510;
                        var11 = var5.field2521;
                        continue;
                    }
                    if (var483 == 25) {
                        int var21 = var11[var8];
                        class168.field2850[var7++] = class245.method1680(var21, (byte) 70);
                        continue;
                    }
                    if (var483 == 27) {
                        int var22 = var11[var8];
                        var7--;
                        class74.method546(false, class168.field2850[var7], var22);
                        continue;
                    }
                    if (var483 == 31) {
                        var7 -= 2;
                        if (class168.field2850[var7 + 1] >= class168.field2850[var7]) {
                            var8 += var11[var8];
                        }
                        continue;
                    }
                    if (var483 == 32) {
                        var7 -= 2;
                        if (class168.field2850[var7 + 1] <= class168.field2850[var7]) {
                            var8 += var11[var8];
                        }
                        continue;
                    }
                    if (var483 == 33) {
                        class168.field2850[var7++] = class130.field2284[var11[var8]];
                        continue;
                    }
                    int var10001;
                    if (var483 == 34) {
                        var10001 = var11[var8];
                        var7--;
                        class130.field2284[var10001] = class168.field2850[var7];
                        continue;
                    }
                    if (var483 == 35) {
                        class70.field1211[var6++] = class130.field2285[var11[var8]];
                        continue;
                    }
                    if (var483 == 36) {
                        var10001 = var11[var8];
                        var6--;
                        class130.field2285[var10001] = class70.field1211[var6];
                        continue;
                    }
                    if (var483 == 37) {
                        int var23 = var11[var8];
                        var6 -= var23;
                        class258 var24 = class263.method1841(var23, var6, class70.field1211, (byte) 126);
                        class70.field1211[var6++] = var24;
                        continue;
                    }
                    if (var483 == 38) {
                        var7--;
                        continue;
                    }
                    if (var483 == 39) {
                        var6--;
                        continue;
                    }
                    if (var483 == 40) {
                        int var25 = var11[var8];
                        class148 var26 = class310.method2154(var25, (byte) 49);
                        int[] var27 = new int[var26.field2520];
                        class258[] var28 = new class258[var26.field2506];
                        for (int var29 = 0; var29 < var26.field2516; var29++) {
                            var27[var29] = class168.field2850[var7 + var29 - var26.field2516];
                        }
                        for (int var30 = 0; var30 < var26.field2517; var30++) {
                            var28[var30] = class70.field1211[var6 - (var26.field2517 - var30)];
                        }
                        var7 -= var26.field2516;
                        var6 -= var26.field2517;
                        class32 var31 = new class32();
                        var31.field378 = var8;
                        var31.field382 = class130.field2284;
                        var31.field388 = var5;
                        var31.field379 = class130.field2285;
                        if (class234.field4046.length <= class95.field1664) {
                            throw new RuntimeException();
                        }
                        var5 = var26;
                        class234.field4046[class95.field1664++] = var31;
                        var8 = -1;
                        var11 = var26.field2521;
                        class130.field2285 = var28;
                        class130.field2284 = var27;
                        var9 = var26.field2510;
                        continue;
                    }
                    if (var483 == 42) {
                        class168.field2850[var7++] = class153.field2630[var11[var8]];
                        continue;
                    }
                    if (var483 == 43) {
                        int var32 = var11[var8];
                        var7--;
                        class153.field2630[var32] = class168.field2850[var7];
                        class247.method1688(1, var32);
                        continue;
                    }
                    if (var483 == 44) {
                        int var33 = var11[var8] >> 16;
                        int var34 = var11[var8] & 0xFFFF;
                        var7--;
                        int var35 = class168.field2850[var7];
                        if (var35 >= 0 && var35 <= 5000) {
                            class144.field2422[var33] = var35;
                            byte var36 = -1;
                            if (var34 == 105) {
                                var36 = 0;
                            }
                            int var37 = 0;
                            while (true) {
                                if (var37 >= var35) {
                                    continue label3979;
                                }
                                class23.field281[var33][var37] = var36;
                                var37++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var483 == 45) {
                        int var38 = var11[var8];
                        var7--;
                        int var39 = class168.field2850[var7];
                        if (var39 >= 0 && class144.field2422[var38] > var39) {
                            class168.field2850[var7++] = class23.field281[var38][var39];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var483 == 46) {
                        int var40 = var11[var8];
                        var7 -= 2;
                        int var41 = class168.field2850[var7];
                        if (var41 >= 0 && class144.field2422[var40] > var41) {
                            class23.field281[var40][var41] = class168.field2850[var7 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var483 == 47) {
                        class258 var42 = class101.field1812[var11[var8]];
                        if (var42 == null) {
                            var42 = class90.field1585;
                        }
                        class70.field1211[var6++] = var42;
                        continue;
                    }
                    if (var483 == 48) {
                        int var43 = var11[var8];
                        var6--;
                        class101.field1812[var43] = class70.field1211[var6];
                        class100.method751(var43, -31);
                        continue;
                    }
                    if (var483 == 51) {
                        class144 var44 = var5.field2508[var11[var8]];
                        var7--;
                        class119 var45 = (class119) var44.method986((long) class168.field2850[var7], 0);
                        if (var45 != null) {
                            var8 += var45.field2107;
                        }
                        continue;
                    }
                }
                boolean var46;
                if (var11[var8] == 1) {
                    var46 = true;
                } else {
                    var46 = false;
                }
                if (var483 < 300) {
                    if (var483 == 100) {
                        var7 -= 3;
                        int var47 = class168.field2850[var7];
                        int var48 = class168.field2850[var7 + 1];
                        int var49 = class168.field2850[var7 + 2];
                        if (var48 != 0) {
                            class171 var50 = class263.method1844(var47, (byte) -70);
                            if (var50.field2982 == null) {
                                var50.field2982 = new class171[var49 + 1];
                            }
                            if (var49 >= var50.field2982.length) {
                                class171[] var51 = new class171[var49 + 1];
                                for (int var52 = 0; var52 < var50.field2982.length; var52++) {
                                    var51[var52] = var50.field2982[var52];
                                }
                                var50.field2982 = var51;
                            }
                            if (var49 > 0 && var50.field2982[var49 - 1] == null) {
                                throw new RuntimeException("Gap at:" + (var49 - 1));
                            }
                            class171 var53 = new class171();
                            var53.field2923 = var53.field3061 = var50.field3061;
                            var53.field2936 = var48;
                            var53.field2930 = var49;
                            var53.field3006 = true;
                            var50.field2982[var49] = var53;
                            if (var46) {
                                class65.field1138 = var53;
                            } else {
                                class87.field1482 = var53;
                            }
                            class165.method1099((byte) 127, var50);
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var483 == 101) {
                        class171 var54 = var46 ? class65.field1138 : class87.field1482;
                        if (var54.field2930 == -1) {
                            if (!var46) {
                                throw new RuntimeException("Tried to cc_delete static active-component!");
                            }
                            throw new RuntimeException("Tried to .cc_delete static .active-component!");
                        }
                        class171 var55 = class263.method1844(var54.field3061, (byte) -70);
                        var55.field2982[var54.field2930] = null;
                        class165.method1099((byte) 126, var55);
                        continue;
                    }
                    if (var483 == 102) {
                        var7--;
                        class171 var56 = class263.method1844(class168.field2850[var7], (byte) -70);
                        var56.field2982 = null;
                        class165.method1099((byte) 127, var56);
                        continue;
                    }
                    if (var483 == 200) {
                        var7 -= 2;
                        int var57 = class168.field2850[var7];
                        int var58 = class168.field2850[var7 + 1];
                        class171 var59 = class10.method65(var57, false, var58);
                        if (var59 != null && var58 != -1) {
                            class168.field2850[var7++] = 1;
                            if (var46) {
                                class65.field1138 = var59;
                            } else {
                                class87.field1482 = var59;
                            }
                            continue;
                        }
                        class168.field2850[var7++] = 0;
                        continue;
                    }
                    if (var483 == 201) {
                        var7--;
                        int var60 = class168.field2850[var7];
                        class171 var61 = class263.method1844(var60, (byte) -70);
                        if (var61 == null) {
                            class168.field2850[var7++] = 0;
                        } else {
                            class168.field2850[var7++] = 1;
                            if (var46) {
                                class65.field1138 = var61;
                            } else {
                                class87.field1482 = var61;
                            }
                        }
                        continue;
                    }
                } else if (var483 < 500) {
                    if (var483 == 403) {
                        var7 -= 2;
                        int var62 = class168.field2850[var7];
                        if (var62 >= 7) {
                            var62 -= 7;
                        }
                        int var63 = class168.field2850[var7 + 1];
                        class152.field2606.field4011.method1134(var63, true, var62);
                        continue;
                    }
                    if (var483 == 404) {
                        var7 -= 2;
                        int var64 = class168.field2850[var7];
                        int var65 = class168.field2850[var7 + 1];
                        class152.field2606.field4011.method1136(var64, var65, true);
                        continue;
                    }
                    if (var483 == 410) {
                        var7--;
                        boolean var66 = class168.field2850[var7] != 0;
                        class152.field2606.field4011.method1137((byte) -81, var66);
                        continue;
                    }
                } else if (!(var483 < 1000 || var483 >= 1100) || !(var483 < 2000 || var483 >= 2100)) {
                    class171 var471;
                    if (var483 < 2000) {
                        var471 = var46 ? class65.field1138 : class87.field1482;
                    } else {
                        var7--;
                        var471 = class263.method1844(class168.field2850[var7], (byte) -70);
                        var483 -= 1000;
                    }
                    if (var483 == 1000) {
                        var7 -= 4;
                        var471.field2938 = class168.field2850[var7];
                        var471.field3007 = class168.field2850[var7 + 1];
                        int var472 = class168.field2850[var7 + 2];
                        int var473 = class168.field2850[var7 + 3];
                        if (var472 < 0) {
                            var472 = 0;
                        } else if (var472 > 5) {
                            var472 = 5;
                        }
                        if (var473 < 0) {
                            var473 = 0;
                        } else if (var473 > 5) {
                            var473 = 5;
                        }
                        var471.field3013 = (byte) var473;
                        var471.field3069 = (byte) var472;
                        class165.method1099((byte) 125, var471);
                        class243.method1654((byte) -5, var471);
                        if (var471.field2930 == -1) {
                            class109.method802(var471.field3061, arg1 ^ 0xFFFF80E2);
                        }
                        continue;
                    }
                    if (var483 == 1001) {
                        var7 -= 4;
                        var471.field3067 = class168.field2850[var7];
                        var471.field3046 = class168.field2850[var7 + 1];
                        var471.field3000 = 0;
                        var471.field3033 = 0;
                        int var474 = class168.field2850[var7 + 2];
                        if (var474 < 0) {
                            var474 = 0;
                        } else if (var474 > 4) {
                            var474 = 4;
                        }
                        int var475 = class168.field2850[var7 + 3];
                        if (var475 < 0) {
                            var475 = 0;
                        } else if (var475 > 4) {
                            var475 = 4;
                        }
                        var471.field3022 = (byte) var475;
                        var471.field3023 = (byte) var474;
                        class165.method1099((byte) 125, var471);
                        class243.method1654((byte) -5, var471);
                        if (var471.field2936 == 0) {
                            class92.method686((byte) 79, false, var471);
                        }
                        continue;
                    }
                    if (var483 == 1003) {
                        var7--;
                        boolean var476 = class168.field2850[var7] == 1;
                        if (var476 != var471.field3043) {
                            var471.field3043 = var476;
                            class165.method1099((byte) 126, var471);
                        }
                        if (var471.field2930 == -1) {
                            class5.method29(var471.field3061, false);
                        }
                        continue;
                    }
                    if (var483 == 1004) {
                        var7 -= 2;
                        var471.field3035 = class168.field2850[var7];
                        var471.field3053 = class168.field2850[var7 + 1];
                        class165.method1099((byte) 125, var471);
                        class243.method1654((byte) -5, var471);
                        if (var471.field2936 == 0) {
                            class92.method686((byte) 79, false, var471);
                        }
                        continue;
                    }
                } else if (!(var483 < 1100 || var483 >= 1200) || !(var483 < 2100 || var483 >= 2200)) {
                    class171 var67;
                    if (var483 >= 2000) {
                        var483 -= 1000;
                        var7--;
                        var67 = class263.method1844(class168.field2850[var7], (byte) -70);
                    } else {
                        var67 = var46 ? class65.field1138 : class87.field1482;
                    }
                    if (var483 == 1100) {
                        var7 -= 2;
                        var67.field2957 = class168.field2850[var7];
                        if (var67.field2976 - var67.field3002 < var67.field2957) {
                            var67.field2957 = var67.field2976 - var67.field3002;
                        }
                        if (var67.field2957 < 0) {
                            var67.field2957 = 0;
                        }
                        var67.field2966 = class168.field2850[var7 + 1];
                        if ((var67.field3036 - var67.field3054) < var67.field2966) {
                            var67.field2966 = var67.field3036 - var67.field3054;
                        }
                        if (var67.field2966 < 0) {
                            var67.field2966 = 0;
                        }
                        class165.method1099((byte) 127, var67);
                        if (var67.field2930 == -1) {
                            class91.method675(12519, var67.field3061);
                        }
                        continue;
                    }
                    if (var483 == 1101) {
                        var7--;
                        var67.field3037 = class168.field2850[var7];
                        class165.method1099((byte) 127, var67);
                        if (var67.field2930 == -1) {
                            class155.method1062(110, var67.field3061);
                        }
                        continue;
                    }
                    if (var483 == 1102) {
                        var7--;
                        var67.field3003 = class168.field2850[var7] == 1;
                        class165.method1099((byte) 125, var67);
                        continue;
                    }
                    if (var483 == 1103) {
                        var7--;
                        var67.field2916 = class168.field2850[var7];
                        class165.method1099((byte) 127, var67);
                        continue;
                    }
                    if (var483 == 1104) {
                        var7--;
                        var67.field3055 = class168.field2850[var7];
                        class165.method1099((byte) 125, var67);
                        continue;
                    }
                    if (var483 == 1105) {
                        var7--;
                        var67.field3070 = class168.field2850[var7];
                        class165.method1099((byte) 127, var67);
                        continue;
                    }
                    if (var483 == 1106) {
                        var7--;
                        var67.field2925 = class168.field2850[var7];
                        class165.method1099((byte) 125, var67);
                        continue;
                    }
                    if (var483 == 1107) {
                        var7--;
                        var67.field2992 = class168.field2850[var7] == 1;
                        class165.method1099((byte) 126, var67);
                        continue;
                    }
                    if (var483 == 1108) {
                        var67.field2940 = 1;
                        var7--;
                        var67.field3059 = class168.field2850[var7];
                        class165.method1099((byte) 126, var67);
                        if (var67.field2930 == -1) {
                            class259.method1824(var67.field3061, 255);
                        }
                        continue;
                    }
                    if (var483 == 1109) {
                        var7 -= 6;
                        var67.field3011 = class168.field2850[var7];
                        var67.field2993 = class168.field2850[var7 + 1];
                        var67.field2954 = class168.field2850[var7 + 2];
                        var67.field2944 = class168.field2850[var7 + 3];
                        var67.field2931 = class168.field2850[var7 + 4];
                        var67.field2974 = class168.field2850[var7 + 5];
                        class165.method1099((byte) 127, var67);
                        if (var67.field2930 == -1) {
                            class286.method2012(8, var67.field3061);
                            class284.method1987(arg1 + 29914, var67.field3061);
                        }
                        continue;
                    }
                    if (var483 == 1110) {
                        var7--;
                        int var68 = class168.field2850[var7];
                        if (var67.field3077 != var68) {
                            var67.field3077 = var68;
                            var67.field2950 = 0;
                            var67.field2965 = 0;
                            class165.method1099((byte) 127, var67);
                        }
                        if (var67.field2930 == -1) {
                            class14.method100(arg1 ^ 0xFFFFF507, var67.field3061);
                        }
                        continue;
                    }
                    if (var483 == 1111) {
                        var7--;
                        var67.field2939 = class168.field2850[var7] == 1;
                        class165.method1099((byte) 126, var67);
                        continue;
                    }
                    if (var483 == 1112) {
                        var6--;
                        class258 var69 = class70.field1211[var6];
                        if (!var69.method1821(arg1 + 2703, var67.field2946)) {
                            var67.field2946 = var69;
                            class165.method1099((byte) 126, var67);
                        }
                        if (var67.field2930 == -1) {
                            class197.method1326(var67.field3061, false);
                        }
                        continue;
                    }
                    if (var483 == 1113) {
                        var7--;
                        var67.field2935 = class168.field2850[var7];
                        class165.method1099((byte) 125, var67);
                        continue;
                    }
                    if (var483 == 1114) {
                        var7 -= 3;
                        var67.field2989 = class168.field2850[var7];
                        var67.field2986 = class168.field2850[var7 + 1];
                        var67.field3044 = class168.field2850[var7 + 2];
                        class165.method1099((byte) 126, var67);
                        continue;
                    }
                    if (var483 == 1115) {
                        var7--;
                        var67.field2915 = class168.field2850[var7] == 1;
                        class165.method1099((byte) 125, var67);
                        continue;
                    }
                    if (var483 == 1116) {
                        var7--;
                        var67.field2998 = class168.field2850[var7];
                        class165.method1099((byte) 126, var67);
                        continue;
                    }
                    if (var483 == 1117) {
                        var7--;
                        var67.field3024 = class168.field2850[var7];
                        class165.method1099((byte) 126, var67);
                        continue;
                    }
                    if (var483 == 1118) {
                        var7--;
                        var67.field2962 = class168.field2850[var7] == 1;
                        class165.method1099((byte) 126, var67);
                        continue;
                    }
                    if (var483 == 1119) {
                        var7--;
                        var67.field3050 = class168.field2850[var7] == 1;
                        class165.method1099((byte) 125, var67);
                        continue;
                    }
                    if (var483 == 1120) {
                        var7 -= 2;
                        var67.field2976 = class168.field2850[var7];
                        var67.field3036 = class168.field2850[var7 + 1];
                        class165.method1099((byte) 127, var67);
                        if (var67.field2936 == 0) {
                            class92.method686((byte) 79, false, var67);
                        }
                        continue;
                    }
                    if (var483 == 1121) {
                        var7 -= 2;
                        var67.field2914 = (short) class168.field2850[var7];
                        var67.field3017 = (short) class168.field2850[var7 + 1];
                        class165.method1099((byte) 127, var67);
                        continue;
                    }
                    if (var483 == 1122) {
                        var7--;
                        var67.field2990 = class168.field2850[var7] == 1;
                        class165.method1099((byte) 125, var67);
                        continue;
                    }
                } else if (var483 >= 1200 && var483 < 1300 || var483 >= 2200 && var483 < 2300) {
                    class171 var70;
                    if (var483 < 2000) {
                        var70 = var46 ? class65.field1138 : class87.field1482;
                    } else {
                        var483 -= 1000;
                        var7--;
                        var70 = class263.method1844(class168.field2850[var7], (byte) -70);
                    }
                    class165.method1099((byte) 125, var70);
                    if (var483 == 1200 || var483 == 1205) {
                        var7 -= 2;
                        int var71 = class168.field2850[var7 + 1];
                        int var72 = class168.field2850[var7];
                        if (var70.field2930 == -1) {
                            class10.method64(9104, var70.field3061);
                            class286.method2012(8, var70.field3061);
                            class284.method1987(arg1 ^ 0xFFFF9F3A, var70.field3061);
                        }
                        if (var72 == -1) {
                            var70.field2940 = 1;
                            var70.field3059 = -1;
                            var70.field3014 = -1;
                        } else {
                            var70.field3014 = var72;
                            var70.field2933 = var71;
                            class61 var73 = class186.method1256((byte) 124, var72);
                            var70.field2944 = var73.field1070;
                            var70.field3011 = var73.field1034;
                            var70.field2954 = var73.field1021;
                            if (var483 == 1205) {
                                var70.field3074 = false;
                            } else {
                                var70.field3074 = true;
                            }
                            var70.field2931 = var73.field1075;
                            var70.field2974 = var73.field1030;
                            if (var70.field3033 > 0) {
                                var70.field2974 = var70.field2974 * 32 / var70.field3033;
                            } else if (var70.field3067 > 0) {
                                var70.field2974 = var70.field2974 * 32 / var70.field3067;
                            }
                            var70.field2993 = var73.field1088;
                        }
                        continue;
                    }
                    if (var483 == 1201) {
                        var70.field2940 = 2;
                        var7--;
                        var70.field3059 = class168.field2850[var7];
                        if (var70.field2930 == -1) {
                            class259.method1824(var70.field3061, 255);
                        }
                        continue;
                    }
                    if (var483 == 1202) {
                        var70.field2940 = 3;
                        var70.field3059 = class152.field2606.field4011.method1131((byte) -116);
                        if (var70.field2930 == -1) {
                            class259.method1824(var70.field3061, 255);
                        }
                        continue;
                    }
                    if (var483 == 1203) {
                        var70.field2940 = 6;
                        var7--;
                        var70.field3059 = class168.field2850[var7];
                        if (var70.field2930 == -1) {
                            class259.method1824(var70.field3061, 255);
                        }
                        continue;
                    }
                    if (var483 == 1204) {
                        var70.field2940 = 5;
                        var7--;
                        var70.field3059 = class168.field2850[var7];
                        if (var70.field2930 == -1) {
                            class259.method1824(var70.field3061, 255);
                        }
                        continue;
                    }
                } else if (var483 >= 1300 && var483 < 1400 || var483 >= 2300 && var483 < 2400) {
                    class171 var74;
                    if (var483 >= 2000) {
                        var7--;
                        var74 = class263.method1844(class168.field2850[var7], (byte) -70);
                        var483 -= 1000;
                    } else {
                        var74 = var46 ? class65.field1138 : class87.field1482;
                    }
                    if (var483 == 1300) {
                        var7--;
                        int var75 = class168.field2850[var7] - 1;
                        if (var75 >= 0 && var75 <= 9) {
                            var6--;
                            var74.method1151(class70.field1211[var6], var75, arg1 ^ 0xFFFF8DAB);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var483 == 1301) {
                        var7 -= 2;
                        int var76 = class168.field2850[var7];
                        int var77 = class168.field2850[var7 + 1];
                        var74.field3048 = class10.method65(var76, false, var77);
                        continue;
                    }
                    if (var483 == 1302) {
                        var7--;
                        var74.field2987 = class168.field2850[var7] == 1;
                        continue;
                    }
                    if (var483 == 1303) {
                        var7--;
                        var74.field2941 = class168.field2850[var7];
                        continue;
                    }
                    if (var483 == 1304) {
                        var7--;
                        var74.field2971 = class168.field2850[var7];
                        continue;
                    }
                    if (var483 == 1305) {
                        var6--;
                        var74.field3025 = class70.field1211[var6];
                        continue;
                    }
                    if (var483 == 1306) {
                        var6--;
                        var74.field3001 = class70.field1211[var6];
                        continue;
                    }
                    if (var483 == 1307) {
                        var74.field3029 = null;
                        continue;
                    }
                } else {
                    if (var483 >= 1400 && var483 < 1500 || var483 >= 2400 && var483 < 2500) {
                        class171 var78;
                        if (var483 >= 2000) {
                            var7--;
                            var78 = class263.method1844(class168.field2850[var7], (byte) -70);
                            var483 -= 1000;
                        } else {
                            var78 = var46 ? class65.field1138 : class87.field1482;
                        }
                        int[] var79 = null;
                        var6--;
                        class258 var80 = class70.field1211[var6];
                        if (var80.method1816(false) > 0 && var80.method1798(var80.method1816(false) - 1, 101) == 89) {
                            var7--;
                            int var81 = class168.field2850[var7];
                            if (var81 > 0) {
                                var79 = new int[var81];
                                while (var81-- > 0) {
                                    var7--;
                                    var79[var81] = class168.field2850[var7];
                                }
                            }
                            var80 = var80.method1813(var80.method1816(false) - 1, 0, true);
                        }
                        Object[] var82 = new Object[var80.method1816(false) + 1];
                        for (int var83 = var82.length - 1; var83 >= 1; var83--) {
                            if (var80.method1798(var83 - 1, 101) == 115) {
                                var6--;
                                var82[var83] = class70.field1211[var6];
                            } else {
                                var7--;
                                var82[var83] = Integer.valueOf(class168.field2850[var7]);
                            }
                        }
                        var7--;
                        int var84 = class168.field2850[var7];
                        if (var84 == -1) {
                            var82 = null;
                        } else {
                            var82[0] = Integer.valueOf(var84);
                        }
                        if (var483 == 1400) {
                            var78.field2928 = var82;
                        } else if (var483 == 1401) {
                            var78.field2991 = var82;
                        } else if (var483 == 1402) {
                            var78.field2918 = var82;
                        } else if (var483 == 1403) {
                            var78.field3004 = var82;
                        } else if (var483 == 1404) {
                            var78.field3026 = var82;
                        } else if (var483 == 1405) {
                            var78.field3072 = var82;
                        } else if (var483 == 1406) {
                            var78.field2945 = var82;
                        } else if (var483 == 1407) {
                            var78.field3040 = var79;
                            var78.field3010 = var82;
                        } else if (var483 == 1408) {
                            var78.field2969 = var82;
                        } else if (var483 == 1409) {
                            var78.field2953 = var82;
                        } else if (var483 == 1410) {
                            var78.field3056 = var82;
                        } else if (var483 == 1411) {
                            var78.field2913 = var82;
                        } else if (var483 == 1412) {
                            var78.field3073 = var82;
                        } else if (var483 == 1414) {
                            var78.field3039 = var82;
                            var78.field3052 = var79;
                        } else if (var483 == 1415) {
                            var78.field3032 = var82;
                            var78.field3071 = var79;
                        } else if (var483 == 1416) {
                            var78.field2959 = var82;
                        } else if (var483 == 1417) {
                            var78.field3027 = var82;
                        } else if (var483 == 1418) {
                            var78.field3041 = var82;
                        } else if (var483 == 1419) {
                            var78.field3019 = var82;
                        } else if (var483 == 1420) {
                            var78.field3064 = var82;
                        } else if (var483 == 1421) {
                            var78.field3018 = var82;
                        } else if (var483 == 1422) {
                            var78.field2937 = var82;
                        } else if (var483 == 1423) {
                            var78.field2943 = var82;
                        } else if (var483 == 1424) {
                            var78.field3062 = var82;
                        } else if (var483 == 1425) {
                            var78.field3049 = var82;
                        } else if (var483 == 1426) {
                            var78.field2980 = var82;
                        } else if (var483 == 1427) {
                            var78.field2960 = var82;
                        } else if (var483 == 1428) {
                            var78.field3028 = var82;
                            var78.field2978 = var79;
                        } else if (var483 == 1429) {
                            var78.field2967 = var82;
                            var78.field2964 = var79;
                        }
                        var78.field3015 = true;
                        continue;
                    }
                    if (var483 < 1600) {
                        class171 var470 = var46 ? class65.field1138 : class87.field1482;
                        if (var483 == 1500) {
                            class168.field2850[var7++] = var470.field3020;
                            continue;
                        }
                        if (var483 == 1501) {
                            class168.field2850[var7++] = var470.field2912;
                            continue;
                        }
                        if (var483 == 1502) {
                            class168.field2850[var7++] = var470.field3002;
                            continue;
                        }
                        if (var483 == 1503) {
                            class168.field2850[var7++] = var470.field3054;
                            continue;
                        }
                        if (var483 == 1504) {
                            class168.field2850[var7++] = var470.field3043 ? 1 : 0;
                            continue;
                        }
                        if (var483 == 1505) {
                            class168.field2850[var7++] = var470.field2923;
                            continue;
                        }
                    } else if (var483 < 1700) {
                        class171 var469 = var46 ? class65.field1138 : class87.field1482;
                        if (var483 == 1600) {
                            class168.field2850[var7++] = var469.field2957;
                            continue;
                        }
                        if (var483 == 1601) {
                            class168.field2850[var7++] = var469.field2966;
                            continue;
                        }
                        if (var483 == 1602) {
                            class70.field1211[var6++] = var469.field2946;
                            continue;
                        }
                        if (var483 == 1603) {
                            class168.field2850[var7++] = var469.field2976;
                            continue;
                        }
                        if (var483 == 1604) {
                            class168.field2850[var7++] = var469.field3036;
                            continue;
                        }
                        if (var483 == 1605) {
                            class168.field2850[var7++] = var469.field2974;
                            continue;
                        }
                        if (var483 == 1606) {
                            class168.field2850[var7++] = var469.field2954;
                            continue;
                        }
                        if (var483 == 1607) {
                            class168.field2850[var7++] = var469.field2931;
                            continue;
                        }
                        if (var483 == 1608) {
                            class168.field2850[var7++] = var469.field2944;
                            continue;
                        }
                        if (var483 == 1609) {
                            class168.field2850[var7++] = var469.field2916;
                            continue;
                        }
                    } else if (var483 < 1800) {
                        class171 var468 = var46 ? class65.field1138 : class87.field1482;
                        if (var483 == 1700) {
                            class168.field2850[var7++] = var468.field3014;
                            continue;
                        }
                        if (var483 == 1701) {
                            if (var468.field3014 == -1) {
                                class168.field2850[var7++] = 0;
                            } else {
                                class168.field2850[var7++] = var468.field2933;
                            }
                            continue;
                        }
                        if (var483 == 1702) {
                            class168.field2850[var7++] = var468.field2930;
                            continue;
                        }
                    } else if (var483 < 1900) {
                        class171 var85 = var46 ? class65.field1138 : class87.field1482;
                        if (var483 == 1800) {
                            class168.field2850[var7++] = class261.method1832((byte) 81, client.method354(var85));
                            continue;
                        }
                        if (var483 == 1801) {
                            var7--;
                            int var86 = class168.field2850[var7];
                            int var484 = var86 - 1;
                            if (var85.field3029 != null && var85.field3029.length > var484 && var85.field3029[var484] != null) {
                                class70.field1211[var6++] = var85.field3029[var484];
                                continue;
                            }
                            class70.field1211[var6++] = class59.field986;
                            continue;
                        }
                        if (var483 == 1802) {
                            if (var85.field3025 == null) {
                                class70.field1211[var6++] = class59.field986;
                            } else {
                                class70.field1211[var6++] = var85.field3025;
                            }
                            continue;
                        }
                    } else if (var483 < 2600) {
                        var7--;
                        class171 var87 = class263.method1844(class168.field2850[var7], (byte) -70);
                        if (var483 == 2500) {
                            class168.field2850[var7++] = var87.field3020;
                            continue;
                        }
                        if (var483 == 2501) {
                            class168.field2850[var7++] = var87.field2912;
                            continue;
                        }
                        if (var483 == 2502) {
                            class168.field2850[var7++] = var87.field3002;
                            continue;
                        }
                        if (var483 == 2503) {
                            class168.field2850[var7++] = var87.field3054;
                            continue;
                        }
                        if (var483 == 2504) {
                            class168.field2850[var7++] = var87.field3043 ? 1 : 0;
                            continue;
                        }
                        if (var483 == 2505) {
                            class168.field2850[var7++] = var87.field2923;
                            continue;
                        }
                    } else if (var483 < 2700) {
                        var7--;
                        class171 var467 = class263.method1844(class168.field2850[var7], (byte) -70);
                        if (var483 == 2600) {
                            class168.field2850[var7++] = var467.field2957;
                            continue;
                        }
                        if (var483 == 2601) {
                            class168.field2850[var7++] = var467.field2966;
                            continue;
                        }
                        if (var483 == 2602) {
                            class70.field1211[var6++] = var467.field2946;
                            continue;
                        }
                        if (var483 == 2603) {
                            class168.field2850[var7++] = var467.field2976;
                            continue;
                        }
                        if (var483 == 2604) {
                            class168.field2850[var7++] = var467.field3036;
                            continue;
                        }
                        if (var483 == 2605) {
                            class168.field2850[var7++] = var467.field2974;
                            continue;
                        }
                        if (var483 == 2606) {
                            class168.field2850[var7++] = var467.field2954;
                            continue;
                        }
                        if (var483 == 2607) {
                            class168.field2850[var7++] = var467.field2931;
                            continue;
                        }
                        if (var483 == 2608) {
                            class168.field2850[var7++] = var467.field2944;
                            continue;
                        }
                        if (var483 == 2609) {
                            class168.field2850[var7++] = var467.field2916;
                            continue;
                        }
                    } else if (var483 < 2800) {
                        if (var483 == 2700) {
                            var7--;
                            class171 var457 = class263.method1844(class168.field2850[var7], (byte) -70);
                            class168.field2850[var7++] = var457.field3014;
                            continue;
                        }
                        if (var483 != 2701) {
                            if (var483 == 2702) {
                                var7--;
                                int var459 = class168.field2850[var7];
                                class247 var460 = (class247) class276.field4750.method986((long) var459, 0);
                                if (var460 == null) {
                                    class168.field2850[var7++] = 0;
                                } else {
                                    class168.field2850[var7++] = 1;
                                }
                                continue;
                            }
                            if (var483 == 2703) {
                                var7--;
                                class171 var461 = class263.method1844(class168.field2850[var7], (byte) -70);
                                if (var461.field2982 == null) {
                                    class168.field2850[var7++] = 0;
                                    continue;
                                }
                                int var462 = var461.field2982.length;
                                for (int var463 = 0; var463 < var461.field2982.length; var463++) {
                                    if (var461.field2982[var463] == null) {
                                        var462 = var463;
                                        break;
                                    }
                                }
                                class168.field2850[var7++] = var462;
                                continue;
                            }
                            if (var483 != 2704 && var483 != 2705) {
                                throw new IllegalStateException();
                            }
                            var7 -= 2;
                            int var464 = class168.field2850[var7];
                            int var465 = class168.field2850[var7 + 1];
                            class247 var466 = (class247) class276.field4750.method986((long) var464, 0);
                            if (var466 != null && var466.field4283 == var465) {
                                class168.field2850[var7++] = 1;
                                continue;
                            }
                            class168.field2850[var7++] = 0;
                            continue;
                        }
                        var7--;
                        class171 var458 = class263.method1844(class168.field2850[var7], (byte) -70);
                        if (var458.field3014 == -1) {
                            class168.field2850[var7++] = 0;
                        } else {
                            class168.field2850[var7++] = var458.field2933;
                        }
                        continue;
                    } else if (var483 < 2900) {
                        var7--;
                        class171 var455 = class263.method1844(class168.field2850[var7], (byte) -70);
                        if (var483 == 2800) {
                            class168.field2850[var7++] = class261.method1832((byte) 115, client.method354(var455));
                            continue;
                        }
                        if (var483 == 2801) {
                            var7--;
                            int var456 = class168.field2850[var7];
                            int var485 = var456 - 1;
                            if (var455.field3029 != null && var455.field3029.length > var485 && var455.field3029[var485] != null) {
                                class70.field1211[var6++] = var455.field3029[var485];
                                continue;
                            }
                            class70.field1211[var6++] = class59.field986;
                            continue;
                        }
                        if (var483 == 2802) {
                            if (var455.field3025 == null) {
                                class70.field1211[var6++] = class59.field986;
                            } else {
                                class70.field1211[var6++] = var455.field3025;
                            }
                            continue;
                        }
                    } else if (var483 < 3200) {
                        if (var483 == 3100) {
                            var6--;
                            class258 var440 = class70.field1211[var6];
                            class140.method965(false, 0, var440, class59.field986);
                            continue;
                        }
                        if (var483 == 3101) {
                            var7 -= 2;
                            class130.method941(class168.field2850[var7 + 1], arg1 + 2705, class168.field2850[var7], class152.field2606);
                            continue;
                        }
                        if (var483 == 3103) {
                            class192.method1299(0);
                            continue;
                        }
                        if (var483 == 3104) {
                            class15.field196++;
                            int var441 = 0;
                            var6--;
                            class258 var442 = class70.field1211[var6];
                            if (var442.method1794(-17054)) {
                                var441 = var442.method1807((byte) 86);
                            }
                            class159.field2710.method885(224, -66);
                            class159.field2710.method1577(true, var441);
                            continue;
                        }
                        if (var483 == 3105) {
                            var6--;
                            class258 var443 = class70.field1211[var6];
                            class159.field2710.method885(129, arg1 + 2612);
                            class179.field3195++;
                            class159.field2710.method1603(var443.method1769(16), -1649350304);
                            continue;
                        }
                        if (var483 == 3106) {
                            class209.field3613++;
                            var6--;
                            class258 var444 = class70.field1211[var6];
                            class159.field2710.method885(98, -113);
                            class159.field2710.method1598(var444.method1816(false) + 1, arg1 ^ 0xFFFF9CDC);
                            class159.field2710.method1590(var444, (byte) -88);
                            continue;
                        }
                        if (var483 == 3107) {
                            var6--;
                            class258 var445 = class70.field1211[var6];
                            var7--;
                            int var446 = class168.field2850[var7];
                            class27.method209(arg1 ^ 0xA8F, var446, var445);
                            continue;
                        }
                        if (var483 == 3108) {
                            var7 -= 3;
                            int var447 = class168.field2850[var7 + 1];
                            int var448 = class168.field2850[var7];
                            int var449 = class168.field2850[var7 + 2];
                            class171 var450 = class263.method1844(var449, (byte) -70);
                            class234.method1561(var450, var448, 0, var447);
                            continue;
                        }
                        if (var483 == 3109) {
                            var7 -= 2;
                            int var451 = class168.field2850[var7];
                            int var452 = class168.field2850[var7 + 1];
                            class171 var453 = var46 ? class65.field1138 : class87.field1482;
                            class234.method1561(var453, var451, arg1 ^ 0xFFFFF570, var452);
                            continue;
                        }
                        if (var483 == 3110) {
                            class85.field1445++;
                            var7--;
                            int var454 = class168.field2850[var7];
                            class159.field2710.method885(37, -70);
                            class159.field2710.method1605(var454, (byte) 64);
                            continue;
                        }
                    } else if (var483 < 3300) {
                        if (var483 == 3200) {
                            var7 -= 3;
                            class308.method2147(class168.field2850[var7 + 2], class168.field2850[var7], -1, class168.field2850[var7 + 1]);
                            continue;
                        }
                        if (var483 == 3201) {
                            var7--;
                            class170.method1132(class168.field2850[var7], 2);
                            continue;
                        }
                        if (var483 == 3202) {
                            var7 -= 2;
                            class88.method629(class168.field2850[var7], (byte) 91, class168.field2850[var7 + 1]);
                            continue;
                        }
                    } else if (var483 < 3400) {
                        if (var483 == 3300) {
                            class168.field2850[var7++] = class202.field3498;
                            continue;
                        }
                        if (var483 == 3301) {
                            var7 -= 2;
                            int var88 = class168.field2850[var7];
                            int var89 = class168.field2850[var7 + 1];
                            class168.field2850[var7++] = class218.method1475(-81, var88, var89);
                            continue;
                        }
                        if (var483 == 3302) {
                            var7 -= 2;
                            int var90 = class168.field2850[var7];
                            int var91 = class168.field2850[var7 + 1];
                            class168.field2850[var7++] = class149.method1023(var90, 30221, var91);
                            continue;
                        }
                        if (var483 == 3303) {
                            var7 -= 2;
                            int var92 = class168.field2850[var7 + 1];
                            int var93 = class168.field2850[var7];
                            class168.field2850[var7++] = class217.method1472(var92, 12594, var93);
                            continue;
                        }
                        if (var483 == 3304) {
                            var7--;
                            int var94 = class168.field2850[var7];
                            class168.field2850[var7++] = class105.method788(1, var94).field4381;
                            continue;
                        }
                        if (var483 == 3305) {
                            var7--;
                            int var95 = class168.field2850[var7];
                            class168.field2850[var7++] = class258.field4435[var95];
                            continue;
                        }
                        if (var483 == 3306) {
                            var7--;
                            int var96 = class168.field2850[var7];
                            class168.field2850[var7++] = class130.field2287[var96];
                            continue;
                        }
                        if (var483 == 3307) {
                            var7--;
                            int var97 = class168.field2850[var7];
                            class168.field2850[var7++] = class252.field4338[var97];
                            continue;
                        }
                        if (var483 == 3308) {
                            int var98 = (class152.field2606.field934 >> 7) + class311.field5271;
                            int var99 = (class152.field2606.field912 >> 7) + class229.field3955;
                            int var100 = class272.field4704;
                            class168.field2850[var7++] = (var99 << 14) + (var100 << 28) + var98;
                            continue;
                        }
                        if (var483 == 3309) {
                            var7--;
                            int var101 = class168.field2850[var7];
                            class168.field2850[var7++] = class2.method15(var101, 268434078) >> 14;
                            continue;
                        }
                        if (var483 == 3310) {
                            var7--;
                            int var102 = class168.field2850[var7];
                            class168.field2850[var7++] = var102 >> 28;
                            continue;
                        }
                        if (var483 == 3311) {
                            var7--;
                            int var103 = class168.field2850[var7];
                            class168.field2850[var7++] = class2.method15(16383, var103);
                            continue;
                        }
                        if (var483 == 3312) {
                            class168.field2850[var7++] = class268.field4674 ? 1 : 0;
                            continue;
                        }
                        if (var483 == 3313) {
                            var7 -= 2;
                            int var104 = class168.field2850[var7] + 32768;
                            int var105 = class168.field2850[var7 + 1];
                            class168.field2850[var7++] = class218.method1475(-121, var104, var105);
                            continue;
                        }
                        if (var483 == 3314) {
                            var7 -= 2;
                            int var106 = class168.field2850[var7 + 1];
                            int var107 = class168.field2850[var7] + 32768;
                            class168.field2850[var7++] = class149.method1023(var107, 30221, var106);
                            continue;
                        }
                        if (var483 == 3315) {
                            var7 -= 2;
                            int var108 = class168.field2850[var7 + 1];
                            int var109 = class168.field2850[var7] + 32768;
                            class168.field2850[var7++] = class217.method1472(var108, 12594, var109);
                            continue;
                        }
                        if (var483 == 3316) {
                            if (class70.field1212 < 2) {
                                class168.field2850[var7++] = 0;
                            } else {
                                class168.field2850[var7++] = class70.field1212;
                            }
                            continue;
                        }
                        if (var483 == 3317) {
                            class168.field2850[var7++] = class249.field4303;
                            continue;
                        }
                        if (var483 == 3318) {
                            class168.field2850[var7++] = class253.field4358;
                            continue;
                        }
                        if (var483 == 3321) {
                            class168.field2850[var7++] = class279.field4799;
                            continue;
                        }
                        if (var483 == 3322) {
                            class168.field2850[var7++] = class71.field1263;
                            continue;
                        }
                        if (var483 == 3323) {
                            if (class284.field4891 >= 5 && class284.field4891 <= 9) {
                                class168.field2850[var7++] = 1;
                                continue;
                            }
                            class168.field2850[var7++] = 0;
                            continue;
                        }
                        if (var483 == 3324) {
                            if (class284.field4891 >= 5 && class284.field4891 <= 9) {
                                class168.field2850[var7++] = class284.field4891;
                                continue;
                            }
                            class168.field2850[var7++] = 0;
                            continue;
                        }
                        if (var483 == 3325) {
                            class168.field2850[var7++] = class231.field4006 ? 1 : 0;
                            continue;
                        }
                        if (var483 == 3326) {
                            class168.field2850[var7++] = class152.field2606.field3996;
                            continue;
                        }
                        if (var483 == 3327) {
                            class168.field2850[var7++] = class152.field2606.field4011.field2894 ? 1 : 0;
                            continue;
                        }
                        if (var483 == 3328) {
                            class168.field2850[var7++] = class57.field902;
                            continue;
                        }
                        if (var483 == 3329) {
                            class168.field2850[var7++] = class162.field2762;
                            continue;
                        }
                        if (var483 == 3330) {
                            var7--;
                            int var110 = class168.field2850[var7];
                            class168.field2850[var7++] = class178.method1221(82, var110);
                            continue;
                        }
                        if (var483 == 3331) {
                            var7 -= 2;
                            int var111 = class168.field2850[var7];
                            int var112 = class168.field2850[var7 + 1];
                            class168.field2850[var7++] = class148.method1020(var112, false, var111, (byte) -86);
                            continue;
                        }
                        if (var483 == 3332) {
                            var7 -= 2;
                            int var113 = class168.field2850[var7];
                            int var114 = class168.field2850[var7 + 1];
                            class168.field2850[var7++] = class148.method1020(var114, true, var113, (byte) -86);
                            continue;
                        }
                        if (var483 == 3333) {
                            class168.field2850[var7++] = class188.field3324;
                            continue;
                        }
                        if (var483 == 3335) {
                            class168.field2850[var7++] = class310.field5259;
                            continue;
                        }
                    } else if (var483 < 3500) {
                        if (var483 == 3400) {
                            var7 -= 2;
                            int var115 = class168.field2850[var7];
                            int var116 = class168.field2850[var7 + 1];
                            class210 var117 = class265.method1855(var115, 59);
                            if (var117.field3629 != 115) {
                            }
                            class70.field1211[var6++] = var117.method1383(-6, var116);
                            continue;
                        }
                        if (var483 == 3408) {
                            var7 -= 4;
                            int var118 = class168.field2850[var7];
                            int var119 = class168.field2850[var7 + 3];
                            int var120 = class168.field2850[var7 + 2];
                            int var121 = class168.field2850[var7 + 1];
                            class210 var122 = class265.method1855(var120, arg1 + 2755);
                            if (var122.field3622 == var118 && var122.field3629 == var121) {
                                if (var121 == 115) {
                                    class70.field1211[var6++] = var122.method1383(-6, var119);
                                } else {
                                    class168.field2850[var7++] = var122.method1387((byte) -126, var119);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var483 == 3409) {
                            var7 -= 3;
                            int var123 = class168.field2850[var7];
                            int var124 = class168.field2850[var7 + 1];
                            int var125 = class168.field2850[var7 + 2];
                            if (var124 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class210 var126 = class265.method1855(var124, 101);
                            if (var126.field3629 != var123) {
                                throw new RuntimeException("C3409-1");
                            }
                            class168.field2850[var7++] = var126.method1382(arg1 + 2709, var125) ? 1 : 0;
                            continue;
                        }
                        if (var483 == 3410) {
                            var7--;
                            int var127 = class168.field2850[var7];
                            var6--;
                            class258 var128 = class70.field1211[var6];
                            if (var127 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class210 var129 = class265.method1855(var127, arg1 + 2794);
                            if (var129.field3629 != 115) {
                                throw new RuntimeException("C3410-1");
                            }
                            class168.field2850[var7++] = var129.method1388(arg1 + 2706, var128) ? 1 : 0;
                            continue;
                        }
                        if (var483 == 3411) {
                            var7--;
                            int var130 = class168.field2850[var7];
                            class210 var131 = class265.method1855(var130, 71);
                            class168.field2850[var7++] = var131.field3623.method988((byte) 33);
                            continue;
                        }
                    } else if (var483 < 3700) {
                        if (var483 == 3600) {
                            if (class203.field3511 == 0) {
                                class168.field2850[var7++] = -2;
                            } else if (class203.field3511 == 1) {
                                class168.field2850[var7++] = -1;
                            } else {
                                class168.field2850[var7++] = class312.field5292;
                            }
                            continue;
                        }
                        if (var483 == 3601) {
                            var7--;
                            int var132 = class168.field2850[var7];
                            if (class203.field3511 == 2 && var132 < class312.field5292) {
                                class70.field1211[var6++] = class306.field5198[var132];
                                continue;
                            }
                            class70.field1211[var6++] = class59.field986;
                            continue;
                        }
                        if (var483 == 3602) {
                            var7--;
                            int var133 = class168.field2850[var7];
                            if (class203.field3511 == 2 && var133 < class312.field5292) {
                                class168.field2850[var7++] = class291.field5009[var133];
                                continue;
                            }
                            class168.field2850[var7++] = 0;
                            continue;
                        }
                        if (var483 == 3603) {
                            var7--;
                            int var134 = class168.field2850[var7];
                            if (class203.field3511 == 2 && var134 < class312.field5292) {
                                class168.field2850[var7++] = class105.field1888[var134];
                                continue;
                            }
                            class168.field2850[var7++] = 0;
                            continue;
                        }
                        if (var483 == 3604) {
                            var6--;
                            class258 var135 = class70.field1211[var6];
                            var7--;
                            int var136 = class168.field2850[var7];
                            class228.method1524(-118, var136, var135);
                            continue;
                        }
                        if (var483 == 3605) {
                            var6--;
                            class258 var137 = class70.field1211[var6];
                            class113.method819(arg1 ^ 0x5C6C, var137.method1769(16));
                            continue;
                        }
                        if (var483 == 3606) {
                            var6--;
                            class258 var138 = class70.field1211[var6];
                            class219.method1489((byte) -18, var138.method1769(16));
                            continue;
                        }
                        if (var483 == 3607) {
                            var6--;
                            class258 var139 = class70.field1211[var6];
                            class260.method1830((byte) -121, var139.method1769(16));
                            continue;
                        }
                        if (var483 == 3608) {
                            var6--;
                            class258 var140 = class70.field1211[var6];
                            class79.method568(var140.method1769(16), true);
                            continue;
                        }
                        if (var483 == 3609) {
                            var6--;
                            class258 var141 = class70.field1211[var6];
                            if (var141.method1818((byte) -120, class185.field3287) || var141.method1818((byte) 29, class164.field2772)) {
                                var141 = var141.method1777((byte) 125, 7);
                            }
                            class168.field2850[var7++] = class4.method24(var141, 0) ? 1 : 0;
                            continue;
                        }
                        if (var483 == 3610) {
                            var7--;
                            int var142 = class168.field2850[var7];
                            if (class203.field3511 == 2 && class312.field5292 > var142) {
                                class70.field1211[var6++] = class20.field241[var142];
                                continue;
                            }
                            class70.field1211[var6++] = class59.field986;
                            continue;
                        }
                        if (var483 == 3611) {
                            if (class306.field5194 == null) {
                                class70.field1211[var6++] = class59.field986;
                            } else {
                                class70.field1211[var6++] = class306.field5194.method1786((byte) 107);
                            }
                            continue;
                        }
                        if (var483 == 3612) {
                            if (class306.field5194 == null) {
                                class168.field2850[var7++] = 0;
                            } else {
                                class168.field2850[var7++] = class98.field1743;
                            }
                            continue;
                        }
                        if (var483 == 3613) {
                            var7--;
                            int var143 = class168.field2850[var7];
                            if (class306.field5194 != null && class98.field1743 > var143) {
                                class70.field1211[var6++] = class11.field149[var143].field5029.method1786((byte) 107);
                                continue;
                            }
                            class70.field1211[var6++] = class59.field986;
                            continue;
                        }
                        if (var483 == 3614) {
                            var7--;
                            int var144 = class168.field2850[var7];
                            if (class306.field5194 != null && class98.field1743 > var144) {
                                class168.field2850[var7++] = class11.field149[var144].field5022;
                                continue;
                            }
                            class168.field2850[var7++] = 0;
                            continue;
                        }
                        if (var483 == 3615) {
                            var7--;
                            int var145 = class168.field2850[var7];
                            if (class306.field5194 != null && class98.field1743 > var145) {
                                class168.field2850[var7++] = class11.field149[var145].field5026;
                                continue;
                            }
                            class168.field2850[var7++] = 0;
                            continue;
                        }
                        if (var483 == 3616) {
                            class168.field2850[var7++] = class127.field2251;
                            continue;
                        }
                        if (var483 == 3617) {
                            var6--;
                            class258 var146 = class70.field1211[var6];
                            class147.method1015(var146, 4096);
                            continue;
                        }
                        if (var483 == 3618) {
                            class168.field2850[var7++] = class132.field2308;
                            continue;
                        }
                        if (var483 == 3619) {
                            var6--;
                            class258 var147 = class70.field1211[var6];
                            class72.method539(var147.method1769(16), false);
                            continue;
                        }
                        if (var483 == 3620) {
                            class117.method867(arg1 ^ 0xFFFFF54E);
                            continue;
                        }
                        if (var483 == 3621) {
                            if (class203.field3511 == 0) {
                                class168.field2850[var7++] = -1;
                            } else {
                                class168.field2850[var7++] = class138.field2355;
                            }
                            continue;
                        }
                        if (var483 == 3622) {
                            var7--;
                            int var148 = class168.field2850[var7];
                            if (class203.field3511 != 0 && var148 < class138.field2355) {
                                class70.field1211[var6++] = class162.method1085(96, class209.field3607[var148]).method1786((byte) 107);
                                continue;
                            }
                            class70.field1211[var6++] = class59.field986;
                            continue;
                        }
                        if (var483 == 3623) {
                            var6--;
                            class258 var149 = class70.field1211[var6];
                            if (var149.method1818((byte) 38, class185.field3287) || var149.method1818((byte) -109, class164.field2772)) {
                                var149 = var149.method1777((byte) 126, 7);
                            }
                            class168.field2850[var7++] = class56.method436(110, var149) ? 1 : 0;
                            continue;
                        }
                        if (var483 == 3624) {
                            var7--;
                            int var150 = class168.field2850[var7];
                            if (class11.field149 != null && var150 < class98.field1743 && class11.field149[var150].field5029.method1778(arg1 ^ 0x241B, class152.field2606.field4007)) {
                                class168.field2850[var7++] = 1;
                                continue;
                            }
                            class168.field2850[var7++] = 0;
                            continue;
                        }
                        if (var483 == 3625) {
                            if (class118.field2094 == null) {
                                class70.field1211[var6++] = class59.field986;
                            } else {
                                class70.field1211[var6++] = class118.field2094.method1786((byte) 107);
                            }
                            continue;
                        }
                        if (var483 == 3626) {
                            var7--;
                            int var151 = class168.field2850[var7];
                            if (class306.field5194 != null && var151 < class98.field1743) {
                                class70.field1211[var6++] = class11.field149[var151].field5023;
                                continue;
                            }
                            class70.field1211[var6++] = class59.field986;
                            continue;
                        }
                        if (var483 == 3627) {
                            var7--;
                            int var152 = class168.field2850[var7];
                            if (class203.field3511 == 2 && var152 >= 0 && var152 < class312.field5292) {
                                class168.field2850[var7++] = class98.field1754[var152] ? 1 : 0;
                                continue;
                            }
                            class168.field2850[var7++] = 0;
                            continue;
                        }
                        if (var483 == 3628) {
                            var6--;
                            class258 var153 = class70.field1211[var6];
                            if (var153.method1818((byte) 93, class185.field3287) || var153.method1818((byte) 1, class164.field2772)) {
                                var153 = var153.method1777((byte) 126, 7);
                            }
                            class168.field2850[var7++] = class153.method1043(true, var153);
                            continue;
                        }
                    } else if (var483 < 4000) {
                        if (var483 == 3903) {
                            var7--;
                            int var426 = class168.field2850[var7];
                            class168.field2850[var7++] = class20.field240[var426].method749((byte) -76);
                            continue;
                        }
                        if (var483 == 3904) {
                            var7--;
                            int var427 = class168.field2850[var7];
                            class168.field2850[var7++] = class20.field240[var427].field1774;
                            continue;
                        }
                        if (var483 == 3905) {
                            var7--;
                            int var428 = class168.field2850[var7];
                            class168.field2850[var7++] = class20.field240[var428].field1784;
                            continue;
                        }
                        if (var483 == 3906) {
                            var7--;
                            int var429 = class168.field2850[var7];
                            class168.field2850[var7++] = class20.field240[var429].field1770;
                            continue;
                        }
                        if (var483 == 3907) {
                            var7--;
                            int var430 = class168.field2850[var7];
                            class168.field2850[var7++] = class20.field240[var430].field1781;
                            continue;
                        }
                        if (var483 == 3908) {
                            var7--;
                            int var431 = class168.field2850[var7];
                            class168.field2850[var7++] = class20.field240[var431].field1787;
                            continue;
                        }
                        if (var483 == 3910) {
                            var7--;
                            int var432 = class168.field2850[var7];
                            int var433 = class20.field240[var432].method753(arg1 + 2711);
                            class168.field2850[var7++] = var433 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var483 == 3911) {
                            var7--;
                            int var434 = class168.field2850[var7];
                            int var435 = class20.field240[var434].method753(7);
                            class168.field2850[var7++] = var435 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var483 == 3912) {
                            var7--;
                            int var436 = class168.field2850[var7];
                            int var437 = class20.field240[var436].method753(7);
                            class168.field2850[var7++] = var437 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var483 == 3913) {
                            var7--;
                            int var438 = class168.field2850[var7];
                            int var439 = class20.field240[var438].method753(7);
                            class168.field2850[var7++] = var439 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var483 < 4100) {
                        if (var483 == 4000) {
                            var7 -= 2;
                            int var381 = class168.field2850[var7];
                            int var382 = class168.field2850[var7 + 1];
                            class168.field2850[var7++] = var381 + var382;
                            continue;
                        }
                        if (var483 == 4001) {
                            var7 -= 2;
                            int var383 = class168.field2850[var7];
                            int var384 = class168.field2850[var7 + 1];
                            class168.field2850[var7++] = var383 - var384;
                            continue;
                        }
                        if (var483 == 4002) {
                            var7 -= 2;
                            int var385 = class168.field2850[var7];
                            int var386 = class168.field2850[var7 + 1];
                            class168.field2850[var7++] = var385 * var386;
                            continue;
                        }
                        if (var483 == 4003) {
                            var7 -= 2;
                            int var387 = class168.field2850[var7 + 1];
                            int var388 = class168.field2850[var7];
                            class168.field2850[var7++] = var388 / var387;
                            continue;
                        }
                        if (var483 == 4004) {
                            var7--;
                            int var389 = class168.field2850[var7];
                            class168.field2850[var7++] = (int) ((double) var389 * Math.random());
                            continue;
                        }
                        if (var483 == 4005) {
                            var7--;
                            int var390 = class168.field2850[var7];
                            class168.field2850[var7++] = (int) (Math.random() * (double) (var390 + 1));
                            continue;
                        }
                        if (var483 == 4006) {
                            var7 -= 5;
                            int var391 = class168.field2850[var7];
                            int var392 = class168.field2850[var7 + 4];
                            int var393 = class168.field2850[var7 + 2];
                            int var394 = class168.field2850[var7 + 3];
                            int var395 = class168.field2850[var7 + 1];
                            class168.field2850[var7++] = var391 + ((var395 - var391) * (var392 - var393) / (var394 - var393));
                            continue;
                        }
                        if (var483 == 4007) {
                            var7 -= 2;
                            long var396 = (long) class168.field2850[var7];
                            long var398 = (long) class168.field2850[var7 + 1];
                            class168.field2850[var7++] = (int) (var396 * var398 / 100L + var396);
                            continue;
                        }
                        if (var483 == 4008) {
                            var7 -= 2;
                            int var400 = class168.field2850[var7];
                            int var401 = class168.field2850[var7 + 1];
                            class168.field2850[var7++] = class307.method2139(var400, 0x1 << var401);
                            continue;
                        }
                        if (var483 == 4009) {
                            var7 -= 2;
                            int var402 = class168.field2850[var7];
                            int var403 = class168.field2850[var7 + 1];
                            class168.field2850[var7++] = class2.method15(var402, -(0x1 << var403) - 1);
                            continue;
                        }
                        if (var483 == 4010) {
                            var7 -= 2;
                            int var404 = class168.field2850[var7];
                            int var405 = class168.field2850[var7 + 1];
                            class168.field2850[var7++] = class2.method15(0x1 << var405, var404) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var483 == 4011) {
                            var7 -= 2;
                            int var406 = class168.field2850[var7];
                            int var407 = class168.field2850[var7 + 1];
                            class168.field2850[var7++] = var406 % var407;
                            continue;
                        }
                        if (var483 == 4012) {
                            var7 -= 2;
                            int var408 = class168.field2850[var7];
                            int var409 = class168.field2850[var7 + 1];
                            if (var408 == 0) {
                                class168.field2850[var7++] = 0;
                            } else {
                                class168.field2850[var7++] = (int) Math.pow((double) var408, (double) var409);
                            }
                            continue;
                        }
                        if (var483 == 4013) {
                            var7 -= 2;
                            int var410 = class168.field2850[var7];
                            int var411 = class168.field2850[var7 + 1];
                            if (var410 == 0) {
                                class168.field2850[var7++] = 0;
                            } else if (var411 == 0) {
                                class168.field2850[var7++] = Integer.MAX_VALUE;
                            } else {
                                class168.field2850[var7++] = (int) Math.pow((double) var410, 1.0D / (double) var411);
                            }
                            continue;
                        }
                        if (var483 == 4014) {
                            var7 -= 2;
                            int var412 = class168.field2850[var7];
                            int var413 = class168.field2850[var7 + 1];
                            class168.field2850[var7++] = class2.method15(var413, var412);
                            continue;
                        }
                        if (var483 == 4015) {
                            var7 -= 2;
                            int var414 = class168.field2850[var7];
                            int var415 = class168.field2850[var7 + 1];
                            class168.field2850[var7++] = class307.method2139(var414, var415);
                            continue;
                        }
                        if (var483 == 4016) {
                            var7 -= 2;
                            int var416 = class168.field2850[var7 + 1];
                            int var417 = class168.field2850[var7];
                            class168.field2850[var7++] = var417 >= var416 ? var416 : var417;
                            continue;
                        }
                        if (var483 == 4017) {
                            var7 -= 2;
                            int var418 = class168.field2850[var7 + 1];
                            int var419 = class168.field2850[var7];
                            class168.field2850[var7++] = var418 < var419 ? var419 : var418;
                            continue;
                        }
                        if (var483 == 4018) {
                            var7 -= 3;
                            long var420 = (long) class168.field2850[var7];
                            long var422 = (long) class168.field2850[var7 + 2];
                            long var424 = (long) class168.field2850[var7 + 1];
                            class168.field2850[var7++] = (int) (var420 * var422 / var424);
                            continue;
                        }
                    } else if (var483 < 4200) {
                        if (var483 == 4100) {
                            var6--;
                            class258 var154 = class70.field1211[var6];
                            var7--;
                            int var155 = class168.field2850[var7];
                            class70.field1211[var6++] = class100.method755(-6, new class258[] { var154, class218.method1481(-41, var155) });
                            continue;
                        }
                        if (var483 == 4101) {
                            var6 -= 2;
                            class258 var156 = class70.field1211[var6];
                            class258 var157 = class70.field1211[var6 + 1];
                            class70.field1211[var6++] = class100.method755(class139.method962(arg1, 2698), new class258[] { var156, var157 });
                            continue;
                        }
                        if (var483 == 4102) {
                            var6--;
                            class258 var158 = class70.field1211[var6];
                            var7--;
                            int var159 = class168.field2850[var7];
                            class70.field1211[var6++] = class100.method755(-6, new class258[] { var158, class8.method45(true, 10, var159) });
                            continue;
                        }
                        if (var483 == 4103) {
                            var6--;
                            class258 var160 = class70.field1211[var6];
                            class70.field1211[var6++] = var160.method1774((byte) 98);
                            continue;
                        }
                        if (var483 == 4104) {
                            var7--;
                            int var161 = class168.field2850[var7];
                            long var162 = ((long) var161 + 11745L) * 86400000L;
                            class225.field3860.setTime(new Date(var162));
                            int var164 = class225.field3860.get(5);
                            int var165 = class225.field3860.get(2);
                            int var166 = class225.field3860.get(1);
                            class70.field1211[var6++] = class100.method755(-6, new class258[] { class218.method1481(-85, var164), class179.field3201, class71.field1257[var165], class179.field3201, class218.method1481(85, var166) });
                            continue;
                        }
                        if (var483 == 4105) {
                            var6 -= 2;
                            class258 var167 = class70.field1211[var6];
                            class258 var168 = class70.field1211[var6 + 1];
                            if (class152.field2606.field4011 != null && class152.field2606.field4011.field2894) {
                                class70.field1211[var6++] = var168;
                                continue;
                            }
                            class70.field1211[var6++] = var167;
                            continue;
                        }
                        if (var483 == 4106) {
                            var7--;
                            int var169 = class168.field2850[var7];
                            class70.field1211[var6++] = class218.method1481(-55, var169);
                            continue;
                        }
                        if (var483 == 4107) {
                            var6 -= 2;
                            class168.field2850[var7++] = class70.field1211[var6].method1791((byte) 16, class70.field1211[var6 + 1]);
                            continue;
                        }
                        if (var483 == 4108) {
                            var7 -= 2;
                            var6--;
                            class258 var170 = class70.field1211[var6];
                            int var171 = class168.field2850[var7];
                            int var172 = class168.field2850[var7 + 1];
                            byte[] var173 = class234.field4044.method1453(var172, (byte) -80, 0);
                            class216 var174 = new class216(var173);
                            var174.method253(class117.field2070, (int[]) null);
                            class168.field2850[var7++] = var174.method259(var170, var171);
                            continue;
                        }
                        if (var483 == 4109) {
                            var6--;
                            class258 var175 = class70.field1211[var6];
                            var7 -= 2;
                            int var176 = class168.field2850[var7 + 1];
                            int var177 = class168.field2850[var7];
                            byte[] var178 = class234.field4044.method1453(var176, (byte) -7, 0);
                            class216 var179 = new class216(var178);
                            var179.method253(class117.field2070, (int[]) null);
                            class168.field2850[var7++] = var179.method257(var175, var177);
                            continue;
                        }
                        if (var483 == 4110) {
                            var6 -= 2;
                            class258 var180 = class70.field1211[var6];
                            class258 var181 = class70.field1211[var6 + 1];
                            var7--;
                            if (class168.field2850[var7] == 1) {
                                class70.field1211[var6++] = var180;
                            } else {
                                class70.field1211[var6++] = var181;
                            }
                            continue;
                        }
                        if (var483 == 4111) {
                            var6--;
                            class258 var182 = class70.field1211[var6];
                            class70.field1211[var6++] = class35.method254(var182);
                            continue;
                        }
                        if (var483 == 4112) {
                            var7--;
                            int var183 = class168.field2850[var7];
                            var6--;
                            class258 var184 = class70.field1211[var6];
                            if (var183 == -1) {
                                throw new RuntimeException("null char");
                            }
                            class70.field1211[var6++] = var184.method1768(-59, var183);
                            continue;
                        }
                        if (var483 == 4113) {
                            var7--;
                            int var185 = class168.field2850[var7];
                            class168.field2850[var7++] = class209.method1379(true, var185) ? 1 : 0;
                            continue;
                        }
                        if (var483 == 4114) {
                            var7--;
                            int var186 = class168.field2850[var7];
                            class168.field2850[var7++] = class153.method1047(var186, (byte) 83) ? 1 : 0;
                            continue;
                        }
                        if (var483 == 4115) {
                            var7--;
                            int var187 = class168.field2850[var7];
                            class168.field2850[var7++] = client.method351(var187, (byte) -125) ? 1 : 0;
                            continue;
                        }
                        if (var483 == 4116) {
                            var7--;
                            int var188 = class168.field2850[var7];
                            class168.field2850[var7++] = class235.method1588((byte) -125, var188) ? 1 : 0;
                            continue;
                        }
                        if (var483 == 4117) {
                            var6--;
                            class258 var189 = class70.field1211[var6];
                            if (var189 == null) {
                                class168.field2850[var7++] = 0;
                            } else {
                                class168.field2850[var7++] = var189.method1816(false);
                            }
                            continue;
                        }
                        if (var483 == 4118) {
                            var7 -= 2;
                            int var190 = class168.field2850[var7];
                            int var191 = class168.field2850[var7 + 1];
                            var6--;
                            class258 var192 = class70.field1211[var6];
                            class70.field1211[var6++] = var192.method1813(var191, var190, true);
                            continue;
                        }
                        if (var483 == 4119) {
                            var6--;
                            class258 var193 = class70.field1211[var6];
                            class258 var194 = class92.method687(var193.method1816(false), false);
                            boolean var195 = false;
                            for (int var196 = 0; var196 < var193.method1816(false); var196++) {
                                int var197 = var193.method1798(var196, 101);
                                if (var197 == 60) {
                                    var195 = true;
                                } else if (var197 == 62) {
                                    var195 = false;
                                } else if (!var195) {
                                    var194.method1790(var197, 122);
                                }
                            }
                            var194.method1787(arg1 ^ 0xAF5);
                            class70.field1211[var6++] = var194;
                            continue;
                        }
                        if (var483 == 4120) {
                            var7 -= 2;
                            var6--;
                            class258 var198 = class70.field1211[var6];
                            int var199 = class168.field2850[var7];
                            int var200 = class168.field2850[var7 + 1];
                            class168.field2850[var7++] = var198.method1811(var199, var200, (byte) -67);
                            continue;
                        }
                        if (var483 == 4121) {
                            var6 -= 2;
                            class258 var201 = class70.field1211[var6 + 1];
                            var7--;
                            int var202 = class168.field2850[var7];
                            class258 var203 = class70.field1211[var6];
                            class168.field2850[var7++] = var203.method1782(-1, var201, var202);
                            continue;
                        }
                        if (var483 == 4122) {
                            var7--;
                            int var204 = class168.field2850[var7];
                            class168.field2850[var7++] = class178.method1218(var204, (byte) -124);
                            continue;
                        }
                        if (var483 == 4123) {
                            var7--;
                            int var205 = class168.field2850[var7];
                            class168.field2850[var7++] = class117.method868(arg1 + 2581, var205);
                            continue;
                        }
                    } else if (var483 < 4300) {
                        if (var483 == 4200) {
                            var7--;
                            int var206 = class168.field2850[var7];
                            class70.field1211[var6++] = class186.method1256((byte) 114, var206).field1053;
                            continue;
                        }
                        if (var483 == 4201) {
                            var7 -= 2;
                            int var207 = class168.field2850[var7 + 1];
                            int var208 = class168.field2850[var7];
                            class61 var209 = class186.method1256((byte) 115, var208);
                            if (var207 >= 1 && var207 <= 5 && var209.field1038[var207 - 1] != null) {
                                class70.field1211[var6++] = var209.field1038[var207 - 1];
                                continue;
                            }
                            class70.field1211[var6++] = class59.field986;
                            continue;
                        }
                        if (var483 == 4202) {
                            var7 -= 2;
                            int var210 = class168.field2850[var7];
                            int var211 = class168.field2850[var7 + 1];
                            class61 var212 = class186.method1256((byte) 126, var210);
                            if (var211 >= 1 && var211 <= 5 && var212.field1066[var211 - 1] != null) {
                                class70.field1211[var6++] = var212.field1066[var211 - 1];
                                continue;
                            }
                            class70.field1211[var6++] = class59.field986;
                            continue;
                        }
                        if (var483 == 4203) {
                            var7--;
                            int var213 = class168.field2850[var7];
                            class168.field2850[var7++] = class186.method1256((byte) 111, var213).field1010;
                            continue;
                        }
                        if (var483 == 4204) {
                            var7--;
                            int var214 = class168.field2850[var7];
                            class168.field2850[var7++] = class186.method1256((byte) 120, var214).field1049 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var483 == 4205) {
                            var7--;
                            int var215 = class168.field2850[var7];
                            class61 var216 = class186.method1256((byte) 116, var215);
                            if (var216.field1027 == -1 && var216.field1018 >= 0) {
                                class168.field2850[var7++] = var216.field1018;
                                continue;
                            }
                            class168.field2850[var7++] = var215;
                            continue;
                        }
                        if (var483 == 4206) {
                            var7--;
                            int var217 = class168.field2850[var7];
                            class61 var218 = class186.method1256((byte) 115, var217);
                            if (var218.field1027 >= 0 && var218.field1018 >= 0) {
                                class168.field2850[var7++] = var218.field1018;
                                continue;
                            }
                            class168.field2850[var7++] = var217;
                            continue;
                        }
                        if (var483 == 4207) {
                            var7--;
                            int var219 = class168.field2850[var7];
                            class168.field2850[var7++] = class186.method1256((byte) 114, var219).field1052 ? 1 : 0;
                            continue;
                        }
                        if (var483 == 4208) {
                            var7 -= 2;
                            int var220 = class168.field2850[var7];
                            int var221 = class168.field2850[var7 + 1];
                            class84 var222 = class78.method562(var221, 26386);
                            if (var222.method607(arg1 ^ 0xFFFFF514)) {
                                class70.field1211[var6++] = class186.method1256((byte) 116, var220).method471((byte) 21, var222.field1421, var221);
                            } else {
                                class168.field2850[var7++] = class186.method1256((byte) 123, var220).method467(-38, var221, var222.field1429);
                            }
                            continue;
                        }
                        if (var483 == 4210) {
                            var6--;
                            class258 var223 = class70.field1211[var6];
                            var7--;
                            int var224 = class168.field2850[var7];
                            class258.method1783(8628, var223, var224 == 1);
                            class168.field2850[var7++] = class96.field1687;
                            continue;
                        }
                        if (var483 == 4211) {
                            if (class248.field4289 != null && class96.field1687 > class299.field5120) {
                                class168.field2850[var7++] = class2.method15(65535, class248.field4289[class299.field5120++]);
                                continue;
                            }
                            class168.field2850[var7++] = -1;
                            continue;
                        }
                        if (var483 == 4212) {
                            class299.field5120 = 0;
                            continue;
                        }
                    } else if (var483 < 4400) {
                        if (var483 == 4300) {
                            var7 -= 2;
                            int var225 = class168.field2850[var7];
                            int var226 = class168.field2850[var7 + 1];
                            class84 var227 = class78.method562(var226, arg1 ^ 0xFFFF9262);
                            if (var227.method607(-106)) {
                                class70.field1211[var6++] = class88.method632(-103, var225).method1028(var227.field1421, var226, class139.method962(arg1, -2703));
                            } else {
                                class168.field2850[var7++] = class88.method632(68, var225).method1029(var227.field1429, -1000, var226);
                            }
                            continue;
                        }
                        if (var483 == 4301) {
                            var7--;
                            int var228 = class168.field2850[var7];
                            class168.field2850[var7++] = class88.method632(50, var228).field2561;
                            continue;
                        }
                        if (var483 == 4302) {
                            var7--;
                            int var229 = class168.field2850[var7];
                            class168.field2850[var7++] = class88.method632(-54, var229).field2565;
                            continue;
                        }
                        if (var483 == 4303) {
                            var7--;
                            int var230 = class168.field2850[var7];
                            class168.field2850[var7++] = class88.method632(-84, var230).field2575;
                            continue;
                        }
                        if (var483 == 4304) {
                            var7--;
                            int var231 = class168.field2850[var7];
                            class168.field2850[var7++] = class88.method632(-58, var231).field2560;
                            continue;
                        }
                        if (var483 == 4305) {
                            var7--;
                            int var232 = class168.field2850[var7];
                            class168.field2850[var7++] = class88.method632(-48, var232).field2592;
                            continue;
                        }
                        if (var483 == 4306) {
                            var7--;
                            int var233 = class168.field2850[var7];
                            class168.field2850[var7++] = class88.method632(46, var233).field2589;
                            continue;
                        }
                        if (var483 == 4307) {
                            var7--;
                            int var234 = class168.field2850[var7];
                            class168.field2850[var7++] = class88.method632(48, var234).field2552;
                            continue;
                        }
                    } else if (var483 >= 4500) {
                        if (var483 < 4600) {
                            if (var483 == 4500) {
                                var7 -= 2;
                                int var235 = class168.field2850[var7 + 1];
                                int var236 = class168.field2850[var7];
                                class84 var237 = class78.method562(var235, 26386);
                                if (var237.method607(-108)) {
                                    class70.field1211[var6++] = class152.method1040(class139.method962(arg1, -2408), var236).method1643(class139.method962(arg1, -2803), var235, var237.field1421);
                                } else {
                                    class168.field2850[var7++] = class152.method1040(1000, var236).method1639((byte) -37, var237.field1429, var235);
                                }
                                continue;
                            }
                        } else if (var483 < 5100) {
                            if (var483 == 5000) {
                                class168.field2850[var7++] = class190.field3360;
                                continue;
                            }
                            if (var483 == 5001) {
                                class65.field1147++;
                                var7 -= 3;
                                class190.field3360 = class168.field2850[var7];
                                class91.field1607 = class168.field2850[var7 + 1];
                                class191.field3379 = class168.field2850[var7 + 2];
                                class159.field2710.method885(86, -69);
                                class159.field2710.method1598(class190.field3360, 27052);
                                class159.field2710.method1598(class91.field1607, 27052);
                                class159.field2710.method1598(class191.field3379, 27052);
                                continue;
                            }
                            if (var483 == 5002) {
                                class166.field2818++;
                                var7 -= 2;
                                var6--;
                                class258 var315 = class70.field1211[var6];
                                int var316 = class168.field2850[var7 + 1];
                                int var317 = class168.field2850[var7];
                                class159.field2710.method885(152, -94);
                                class159.field2710.method1603(var315.method1769(16), -1649350304);
                                class159.field2710.method1598(var317 - 1, 27052);
                                class159.field2710.method1598(var316, arg1 ^ 0xFFFF9CDC);
                                continue;
                            }
                            if (var483 == 5003) {
                                class258 var318 = null;
                                var7--;
                                int var319 = class168.field2850[var7];
                                if (var319 < 100) {
                                    var318 = class246.field4273[var319];
                                }
                                if (var318 == null) {
                                    var318 = class59.field986;
                                }
                                class70.field1211[var6++] = var318;
                                continue;
                            }
                            if (var483 == 5004) {
                                var7--;
                                int var320 = class168.field2850[var7];
                                int var321 = -1;
                                if (var320 < 100 && class246.field4273[var320] != null) {
                                    var321 = class194.field3434[var320];
                                }
                                class168.field2850[var7++] = var321;
                                continue;
                            }
                            if (var483 == 5005) {
                                class168.field2850[var7++] = class91.field1607;
                                continue;
                            }
                            if (var483 == 5008) {
                                var6--;
                                class258 var322 = class70.field1211[var6];
                                if (var322.method1818((byte) 116, class204.field3531)) {
                                    class243.method1652((byte) -128, var322);
                                    continue;
                                }
                                if (class70.field1212 == 0 && (class57.field902 == 1 || class162.field2762 == 1)) {
                                    continue;
                                }
                                class238.field4156++;
                                class258 var323 = var322.method1774((byte) 96);
                                byte var324 = 0;
                                if (var323.method1818((byte) 36, class235.field4099)) {
                                    var324 = 0;
                                    var322 = var322.method1777((byte) 123, class235.field4099.method1816(false));
                                } else if (var323.method1818((byte) 2, class45.field677)) {
                                    var324 = 1;
                                    var322 = var322.method1777((byte) 124, class45.field677.method1816(false));
                                } else if (var323.method1818((byte) -111, class202.field3494)) {
                                    var324 = 2;
                                    var322 = var322.method1777((byte) 124, class202.field3494.method1816(false));
                                } else if (var323.method1818((byte) -122, class248.field4288)) {
                                    var324 = 3;
                                    var322 = var322.method1777((byte) 126, class248.field4288.method1816(false));
                                } else if (var323.method1818((byte) -109, class252.field4347)) {
                                    var324 = 4;
                                    var322 = var322.method1777((byte) 125, class252.field4347.method1816(false));
                                } else if (var323.method1818((byte) 8, class245.field4265)) {
                                    var324 = 5;
                                    var322 = var322.method1777((byte) 125, class245.field4265.method1816(false));
                                } else if (var323.method1818((byte) 21, class84.field1422)) {
                                    var322 = var322.method1777((byte) 127, class84.field1422.method1816(false));
                                    var324 = 6;
                                } else if (var323.method1818((byte) 46, class213.field3681)) {
                                    var324 = 7;
                                    var322 = var322.method1777((byte) 122, class213.field3681.method1816(false));
                                } else if (var323.method1818((byte) -5, class302.field5161)) {
                                    var322 = var322.method1777((byte) 122, class302.field5161.method1816(false));
                                    var324 = 8;
                                } else if (var323.method1818((byte) -123, class265.field4617)) {
                                    var322 = var322.method1777((byte) 127, class265.field4617.method1816(false));
                                    var324 = 9;
                                } else if (var323.method1818((byte) 125, class10.field121)) {
                                    var324 = 10;
                                    var322 = var322.method1777((byte) 126, class10.field121.method1816(false));
                                } else if (var323.method1818((byte) 25, class139.field2375)) {
                                    var324 = 11;
                                    var322 = var322.method1777((byte) 125, class139.field2375.method1816(false));
                                } else if (class310.field5259 != 0) {
                                    if (var323.method1818((byte) 86, class235.field4095)) {
                                        var322 = var322.method1777((byte) 123, class235.field4095.method1816(false));
                                        var324 = 0;
                                    } else if (var323.method1818((byte) 40, class45.field680)) {
                                        var322 = var322.method1777((byte) 122, class45.field680.method1816(false));
                                        var324 = 1;
                                    } else if (var323.method1818((byte) -125, class202.field3499)) {
                                        var324 = 2;
                                        var322 = var322.method1777((byte) 122, class202.field3499.method1816(false));
                                    } else if (var323.method1818((byte) 44, class248.field4287)) {
                                        var322 = var322.method1777((byte) 122, class248.field4287.method1816(false));
                                        var324 = 3;
                                    } else if (var323.method1818((byte) -105, class252.field4345)) {
                                        var324 = 4;
                                        var322 = var322.method1777((byte) 122, class252.field4345.method1816(false));
                                    } else if (var323.method1818((byte) -107, class245.field4259)) {
                                        var322 = var322.method1777((byte) 124, class245.field4259.method1816(false));
                                        var324 = 5;
                                    } else if (var323.method1818((byte) 22, class84.field1417)) {
                                        var322 = var322.method1777((byte) 126, class84.field1417.method1816(false));
                                        var324 = 6;
                                    } else if (var323.method1818((byte) -103, class213.field3693)) {
                                        var324 = 7;
                                        var322 = var322.method1777((byte) 124, class213.field3693.method1816(false));
                                    } else if (var323.method1818((byte) -4, class302.field5169)) {
                                        var324 = 8;
                                        var322 = var322.method1777((byte) 125, class302.field5169.method1816(false));
                                    } else if (var323.method1818((byte) -107, class265.field4612)) {
                                        var324 = 9;
                                        var322 = var322.method1777((byte) 125, class265.field4612.method1816(false));
                                    } else if (var323.method1818((byte) -109, class10.field117)) {
                                        var322 = var322.method1777((byte) 125, class10.field117.method1816(false));
                                        var324 = 10;
                                    } else if (var323.method1818((byte) 68, class139.field2371)) {
                                        var322 = var322.method1777((byte) 125, class139.field2371.method1816(false));
                                        var324 = 11;
                                    }
                                }
                                class258 var325 = var322.method1774((byte) 124);
                                byte var326 = 0;
                                if (var325.method1818((byte) -5, class289.field4988)) {
                                    var322 = var322.method1777((byte) 127, class289.field4988.method1816(false));
                                    var326 = 1;
                                } else if (var325.method1818((byte) -103, class99.field1767)) {
                                    var322 = var322.method1777((byte) 125, class99.field1767.method1816(false));
                                    var326 = 2;
                                } else if (var325.method1818((byte) -128, class138.field2359)) {
                                    var326 = 3;
                                    var322 = var322.method1777((byte) 126, class138.field2359.method1816(false));
                                } else if (var325.method1818((byte) -11, class100.field1779)) {
                                    var322 = var322.method1777((byte) 122, class100.field1779.method1816(false));
                                    var326 = 4;
                                } else if (var325.method1818((byte) 115, class42.field599)) {
                                    var326 = 5;
                                    var322 = var322.method1777((byte) 124, class42.field599.method1816(false));
                                } else if (class310.field5259 != 0) {
                                    if (var325.method1818((byte) 2, class289.field4984)) {
                                        var322 = var322.method1777((byte) 124, class289.field4984.method1816(false));
                                        var326 = 1;
                                    } else if (var325.method1818((byte) 32, class99.field1759)) {
                                        var322 = var322.method1777((byte) 124, class99.field1759.method1816(false));
                                        var326 = 2;
                                    } else if (var325.method1818((byte) -107, class138.field2352)) {
                                        var322 = var322.method1777((byte) 127, class138.field2352.method1816(false));
                                        var326 = 3;
                                    } else if (var325.method1818((byte) -108, class100.field1769)) {
                                        var326 = 4;
                                        var322 = var322.method1777((byte) 125, class100.field1769.method1816(false));
                                    } else if (var325.method1818((byte) -113, class42.field583)) {
                                        var326 = 5;
                                        var322 = var322.method1777((byte) 127, class42.field583.method1816(false));
                                    }
                                }
                                class159.field2710.method885(82, -72);
                                class159.field2710.method1598(0, 27052);
                                int var327 = class159.field2710.field4051;
                                class159.field2710.method1598(var324, 27052);
                                class159.field2710.method1598(var326, 27052);
                                class314.method2173(var322, class159.field2710, arg1 ^ 0xA82);
                                class159.field2710.method1618(14691, class159.field2710.field4051 - var327);
                                continue;
                            }
                            if (var483 == 5009) {
                                var6 -= 2;
                                class258 var328 = class70.field1211[var6];
                                class258 var329 = class70.field1211[var6 + 1];
                                if (class70.field1212 != 0 || class57.field902 != 1 && class162.field2762 != 1) {
                                    class159.field2710.method885(199, -115);
                                    class159.field2710.method1598(0, arg1 ^ 0xFFFF9CDC);
                                    int var330 = class159.field2710.field4051;
                                    class159.field2710.method1603(var328.method1769(16), -1649350304);
                                    class72.field1272++;
                                    class314.method2173(var329, class159.field2710, 127);
                                    class159.field2710.method1618(14691, class159.field2710.field4051 - var330);
                                }
                                continue;
                            }
                            if (var483 == 5010) {
                                class258 var331 = null;
                                var7--;
                                int var332 = class168.field2850[var7];
                                if (var332 < 100) {
                                    var331 = class186.field3313[var332];
                                }
                                if (var331 == null) {
                                    var331 = class59.field986;
                                }
                                class70.field1211[var6++] = var331;
                                continue;
                            }
                            if (var483 == 5011) {
                                class258 var333 = null;
                                var7--;
                                int var334 = class168.field2850[var7];
                                if (var334 < 100) {
                                    var333 = class95.field1660[var334];
                                }
                                if (var333 == null) {
                                    var333 = class59.field986;
                                }
                                class70.field1211[var6++] = var333;
                                continue;
                            }
                            if (var483 == 5012) {
                                var7--;
                                int var335 = class168.field2850[var7];
                                int var336 = -1;
                                if (var335 < 100) {
                                    var336 = class255.field4380[var335];
                                }
                                class168.field2850[var7++] = var336;
                                continue;
                            }
                            if (var483 == 5015) {
                                class258 var337;
                                if (class152.field2606 == null || class152.field2606.field4007 == null) {
                                    var337 = class235.field4103;
                                } else {
                                    var337 = class152.field2606.method1547((byte) 122);
                                }
                                class70.field1211[var6++] = var337;
                                continue;
                            }
                            if (var483 == 5016) {
                                class168.field2850[var7++] = class191.field3379;
                                continue;
                            }
                            if (var483 == 5017) {
                                class168.field2850[var7++] = class51.field815;
                                continue;
                            }
                            if (var483 == 5050) {
                                var7--;
                                int var338 = class168.field2850[var7];
                                class70.field1211[var6++] = class243.method1656(var338, (byte) -76).field4917;
                                continue;
                            }
                            if (var483 == 5051) {
                                var7--;
                                int var339 = class168.field2850[var7];
                                class285 var340 = class243.method1656(var339, (byte) -76);
                                if (var340.field4907 == null) {
                                    class168.field2850[var7++] = 0;
                                } else {
                                    class168.field2850[var7++] = var340.field4907.length;
                                }
                                continue;
                            }
                            if (var483 == 5052) {
                                var7 -= 2;
                                int var341 = class168.field2850[var7];
                                int var342 = class168.field2850[var7 + 1];
                                class285 var343 = class243.method1656(var341, (byte) -76);
                                int var344 = var343.field4907[var342];
                                class168.field2850[var7++] = var344;
                                continue;
                            }
                            if (var483 == 5053) {
                                var7--;
                                int var345 = class168.field2850[var7];
                                class285 var346 = class243.method1656(var345, (byte) -76);
                                if (var346.field4912 == null) {
                                    class168.field2850[var7++] = 0;
                                } else {
                                    class168.field2850[var7++] = var346.field4912.length;
                                }
                                continue;
                            }
                            if (var483 == 5054) {
                                var7 -= 2;
                                int var347 = class168.field2850[var7 + 1];
                                int var348 = class168.field2850[var7];
                                class168.field2850[var7++] = class243.method1656(var348, (byte) -76).field4912[var347];
                                continue;
                            }
                            if (var483 == 5055) {
                                var7--;
                                int var349 = class168.field2850[var7];
                                class70.field1211[var6++] = class57.method443((byte) 20, var349).method521(0);
                                continue;
                            }
                            if (var483 == 5056) {
                                var7--;
                                int var350 = class168.field2850[var7];
                                class69 var351 = class57.method443((byte) 78, var350);
                                if (var351.field1201 == null) {
                                    class168.field2850[var7++] = 0;
                                } else {
                                    class168.field2850[var7++] = var351.field1201.length;
                                }
                                continue;
                            }
                            if (var483 == 5057) {
                                var7 -= 2;
                                int var352 = class168.field2850[var7];
                                int var353 = class168.field2850[var7 + 1];
                                class168.field2850[var7++] = class57.method443((byte) -108, var352).field1201[var353];
                                continue;
                            }
                            if (var483 == 5058) {
                                class7.field95 = new class59();
                                var7--;
                                class7.field95.field983 = class168.field2850[var7];
                                class7.field95.field989 = class57.method443((byte) -119, class7.field95.field983);
                                class7.field95.field985 = new int[class7.field95.field989.method520((byte) 49)];
                                continue;
                            }
                            if (var483 == 5059) {
                                class236.field4132++;
                                class159.field2710.method885(167, arg1 + 2577);
                                class159.field2710.method1598(0, arg1 + 29756);
                                int var354 = class159.field2710.field4051;
                                class159.field2710.method1598(0, 27052);
                                class159.field2710.method1605(class7.field95.field983, (byte) 61);
                                class7.field95.field989.method522(-1, class159.field2710, class7.field95.field985);
                                class159.field2710.method1618(arg1 + 17395, -var354 + class159.field2710.field4051);
                                continue;
                            }
                            if (var483 == 5060) {
                                class194.field3422++;
                                var6--;
                                class258 var355 = class70.field1211[var6];
                                class159.field2710.method885(59, -108);
                                class159.field2710.method1598(0, 27052);
                                int var356 = class159.field2710.field4051;
                                class159.field2710.method1603(var355.method1769(arg1 ^ 0xFFFFF560), arg1 - 1649347600);
                                class159.field2710.method1605(class7.field95.field983, (byte) 66);
                                class7.field95.field989.method522(-1, class159.field2710, class7.field95.field985);
                                class159.field2710.method1618(14691, class159.field2710.field4051 - var356);
                                continue;
                            }
                            if (var483 == 5061) {
                                class236.field4132++;
                                class159.field2710.method885(167, -67);
                                class159.field2710.method1598(0, 27052);
                                int var357 = class159.field2710.field4051;
                                class159.field2710.method1598(1, 27052);
                                class159.field2710.method1605(class7.field95.field983, (byte) 75);
                                class7.field95.field989.method522(-1, class159.field2710, class7.field95.field985);
                                class159.field2710.method1618(14691, class159.field2710.field4051 - var357);
                                continue;
                            }
                            if (var483 == 5062) {
                                var7 -= 2;
                                int var358 = class168.field2850[var7 + 1];
                                int var359 = class168.field2850[var7];
                                class168.field2850[var7++] = class243.method1656(var359, (byte) -76).field4913[var358];
                                continue;
                            }
                            if (var483 == 5063) {
                                var7 -= 2;
                                int var360 = class168.field2850[var7 + 1];
                                int var361 = class168.field2850[var7];
                                class168.field2850[var7++] = class243.method1656(var361, (byte) -76).field4909[var360];
                                continue;
                            }
                            if (var483 == 5064) {
                                var7 -= 2;
                                int var362 = class168.field2850[var7];
                                int var363 = class168.field2850[var7 + 1];
                                if (var363 == -1) {
                                    class168.field2850[var7++] = -1;
                                } else {
                                    class168.field2850[var7++] = class243.method1656(var362, (byte) -76).method2001(var363, 0);
                                }
                                continue;
                            }
                            if (var483 == 5065) {
                                var7 -= 2;
                                int var364 = class168.field2850[var7];
                                int var365 = class168.field2850[var7 + 1];
                                if (var365 == -1) {
                                    class168.field2850[var7++] = -1;
                                } else {
                                    class168.field2850[var7++] = class243.method1656(var364, (byte) -76).method2003(var365, (byte) -125);
                                }
                                continue;
                            }
                            if (var483 == 5066) {
                                var7--;
                                int var366 = class168.field2850[var7];
                                class168.field2850[var7++] = class57.method443((byte) 48, var366).method520((byte) 49);
                                continue;
                            }
                            if (var483 == 5067) {
                                var7 -= 2;
                                int var367 = class168.field2850[var7];
                                int var368 = class168.field2850[var7 + 1];
                                int var369 = class57.method443((byte) 38, var367).method518(var368, false);
                                class168.field2850[var7++] = var369;
                                continue;
                            }
                            if (var483 == 5068) {
                                var7 -= 2;
                                int var370 = class168.field2850[var7];
                                int var371 = class168.field2850[var7 + 1];
                                class7.field95.field985[var370] = var371;
                                continue;
                            }
                            if (var483 == 5069) {
                                var7 -= 2;
                                int var372 = class168.field2850[var7];
                                int var373 = class168.field2850[var7 + 1];
                                class7.field95.field985[var372] = var373;
                                continue;
                            }
                            if (var483 == 5070) {
                                var7 -= 3;
                                int var374 = class168.field2850[var7];
                                int var375 = class168.field2850[var7 + 2];
                                int var376 = class168.field2850[var7 + 1];
                                class69 var377 = class57.method443((byte) 119, var374);
                                if (var377.method518(var376, false) != 0) {
                                    throw new RuntimeException("bad command");
                                }
                                class168.field2850[var7++] = var377.method516((byte) -97, var375, var376);
                                continue;
                            }
                        } else if (var483 < 5200) {
                            if (var483 == 5100) {
                                if (client.field610[86]) {
                                    class168.field2850[var7++] = 1;
                                } else {
                                    class168.field2850[var7++] = 0;
                                }
                                continue;
                            }
                            if (var483 == 5101) {
                                if (client.field610[82]) {
                                    class168.field2850[var7++] = 1;
                                } else {
                                    class168.field2850[var7++] = 0;
                                }
                                continue;
                            }
                            if (var483 == 5102) {
                                if (client.field610[81]) {
                                    class168.field2850[var7++] = 1;
                                } else {
                                    class168.field2850[var7++] = 0;
                                }
                                continue;
                            }
                        } else if (var483 < 5300) {
                            if (var483 == 5200) {
                                var7--;
                                class124.method903(class168.field2850[var7], arg1 ^ 0xA8F);
                                continue;
                            }
                            if (var483 == 5201) {
                                class168.field2850[var7++] = class317.method2180(123);
                                continue;
                            }
                            if (var483 == 5202) {
                                int var10000 = arg1 + 2706;
                                var7--;
                                class42.method340(var10000, class168.field2850[var7]);
                                continue;
                            }
                            if (var483 == 5203) {
                                var6--;
                                class63.method485(class70.field1211[var6], arg1 + 6274);
                                continue;
                            }
                            if (var483 == 5204) {
                                class70.field1211[var6 - 1] = class162.method1084((byte) -115, class70.field1211[var6 - 1]);
                                continue;
                            }
                            if (var483 == 5205) {
                                var6--;
                                class132.method943(class70.field1211[var6], (byte) -37);
                                continue;
                            }
                            if (var483 == 5206) {
                                var7--;
                                int var312 = class168.field2850[var7];
                                class125 var313 = class172.method1167(var312 >> 14 & 0x3FFF, 0, var312 & 0x3FFF);
                                if (var313 == null) {
                                    class70.field1211[var6++] = class59.field986;
                                } else {
                                    class70.field1211[var6++] = var313.field2228;
                                }
                                continue;
                            }
                            if (var483 == 5207) {
                                var6--;
                                class125 var314 = class215.method1463((byte) 124, class70.field1211[var6]);
                                if (var314 != null && var314.field2241 != null) {
                                    class70.field1211[var6++] = var314.field2241;
                                    continue;
                                }
                                class70.field1211[var6++] = class59.field986;
                                continue;
                            }
                        } else if (var483 < 5400) {
                            if (var483 == 5300) {
                                var7 -= 2;
                                int var299 = class168.field2850[var7 + 1];
                                int var300 = class168.field2850[var7];
                                class218.method1476(3, false, var299, var300, (byte) 14);
                                class168.field2850[var7++] = class71.field1253 == null ? 0 : 1;
                                continue;
                            }
                            if (var483 == 5301) {
                                if (class71.field1253 != null) {
                                    class218.method1476(class61.field1022, false, -1, -1, (byte) 14);
                                }
                                continue;
                            }
                            if (var483 == 5302) {
                                class220[] var301 = class290.method2041(2264);
                                class168.field2850[var7++] = var301.length;
                                continue;
                            }
                            if (var483 == 5303) {
                                var7--;
                                int var302 = class168.field2850[var7];
                                class220[] var303 = class290.method2041(arg1 + 4968);
                                class168.field2850[var7++] = var303[var302].field3808;
                                class168.field2850[var7++] = var303[var302].field3809;
                                continue;
                            }
                            if (var483 == 5305) {
                                int var304 = class259.field4501;
                                int var305 = class239.field4171;
                                int var306 = -1;
                                class220[] var307 = class290.method2041(2264);
                                for (int var308 = 0; var308 < var307.length; var308++) {
                                    class220 var309 = var307[var308];
                                    if (var309.field3808 == var304 && var309.field3809 == var305) {
                                        var306 = var308;
                                        break;
                                    }
                                }
                                class168.field2850[var7++] = var306;
                                continue;
                            }
                            if (var483 == 5306) {
                                class168.field2850[var7++] = class185.method1253((byte) 124);
                                continue;
                            }
                            if (var483 == 5307) {
                                var7--;
                                int var310 = class168.field2850[var7];
                                if (var310 < 0 || var310 > 2) {
                                    var310 = 0;
                                }
                                class218.method1476(var310, false, -1, -1, (byte) 14);
                                continue;
                            }
                            if (var483 == 5308) {
                                class168.field2850[var7++] = class61.field1022;
                                continue;
                            }
                            if (var483 == 5309) {
                                var7--;
                                int var311 = class168.field2850[var7];
                                if (var311 < 0 || var311 > 2) {
                                    var311 = 0;
                                }
                                class61.field1022 = var311;
                                class219.method1484((byte) -107, class297.field5086);
                                continue;
                            }
                        } else if (var483 < 5500) {
                            if (var483 == 5400) {
                                var6 -= 2;
                                class3.field49++;
                                class258 var238 = class70.field1211[var6];
                                var7--;
                                int var239 = class168.field2850[var7];
                                class258 var240 = class70.field1211[var6 + 1];
                                class159.field2710.method885(228, -73);
                                class159.field2710.method1598(class61.method463(arg1 ^ 0xFFFFFBBE, var238) + class61.method463(3790, var240) + 1, 27052);
                                class159.field2710.method1590(var238, (byte) -88);
                                class159.field2710.method1590(var240, (byte) -88);
                                class159.field2710.method1598(var239, 27052);
                                continue;
                            }
                            if (var483 == 5401) {
                                var7 -= 2;
                                class83.field1395[class168.field2850[var7]] = (short) class27.method208(class168.field2850[var7 + 1], -3);
                                class121.method882(7);
                                class100.method754(-1);
                                class236.method1626(14);
                                class191.method1290(100);
                                class145.method991(80);
                                continue;
                            }
                            if (var483 == 5405) {
                                var7 -= 2;
                                int var241 = class168.field2850[var7];
                                int var242 = class168.field2850[var7 + 1];
                                if (var241 >= 0 && var241 < 2) {
                                    class82.field1385[var241] = new int[var242 << 1][4];
                                }
                                continue;
                            }
                            if (var483 == 5406) {
                                var7 -= 7;
                                int var243 = class168.field2850[var7];
                                int var244 = class168.field2850[var7 + 2];
                                int var245 = class168.field2850[var7 + 3];
                                int var246 = class168.field2850[var7 + 4];
                                int var247 = class168.field2850[var7 + 1] << 1;
                                int var248 = class168.field2850[var7 + 5];
                                int var249 = class168.field2850[var7 + 6];
                                if (var243 >= 0 && var243 < 2 && class82.field1385[var243] != null && var247 >= 0 && var247 < class82.field1385[var243].length) {
                                    class82.field1385[var243][var247] = new int[] { class2.method15(var244 >> 14, 16383) * 128, var245, class2.method15(16383, var244) * 128, var249 };
                                    class82.field1385[var243][var247 + 1] = new int[] { class2.method15(16383, var246 >> 14) * 128, var248, class2.method15(16383, var246) * 128 };
                                }
                                continue;
                            }
                            if (var483 == 5407) {
                                var7--;
                                int var250 = class82.field1385[class168.field2850[var7]].length >> 1;
                                class168.field2850[var7++] = var250;
                                continue;
                            }
                            if (var483 == 5411) {
                                if (class71.field1253 != null) {
                                    class218.method1476(class61.field1022, false, -1, -1, (byte) 14);
                                }
                                if (class284.field4882 == null) {
                                    class252.method1705(false, class50.method397(-3073), false);
                                } else {
                                    System.exit(0);
                                }
                                continue;
                            }
                            if (var483 == 5419) {
                                class258 var251 = class59.field986;
                                if (class165.field2787 != null) {
                                    var251 = class214.method1456(class165.field2787.field2068, (byte) 77);
                                    try {
                                        if (class165.field2787.field2063 != null) {
                                            byte[] var252 = ((String) class165.field2787.field2063).getBytes("ISO-8859-1");
                                            var251 = class285.method2004(var252.length, var252, 0, 0);
                                        }
                                    } catch (UnsupportedEncodingException var481) {
                                    }
                                }
                                class70.field1211[var6++] = var251;
                                continue;
                            }
                            if (var483 == 5420) {
                                class168.field2850[var7++] = class295.field5062 == 3 ? 1 : 0;
                                continue;
                            }
                            if (var483 == 5421) {
                                if (class71.field1253 != null) {
                                    class218.method1476(class61.field1022, false, -1, -1, (byte) 14);
                                }
                                var6--;
                                class258 var254 = class70.field1211[var6];
                                var7--;
                                boolean var255 = class168.field2850[var7] == 1;
                                class258 var256 = class100.method755(-6, new class258[] { class50.method397(-3073), var254 });
                                if (class284.field4882 != null || var255 && class295.field5062 != 3 && class295.field5060.startsWith("win") && !class232.field4026) {
                                    class99.field1757 = var255;
                                    class85.field1432 = var256;
                                    class229.field3953 = class297.field5086.method2062(true, new String(var256.method1793(37), "ISO-8859-1"));
                                    continue;
                                }
                                class252.method1705(false, var256, var255);
                                continue;
                            }
                            if (var483 == 5422) {
                                var6 -= 2;
                                var7--;
                                int var257 = class168.field2850[var7];
                                class258 var258 = class70.field1211[var6];
                                class258 var259 = class70.field1211[var6 + 1];
                                if (var258.method1816(false) > 0) {
                                    if (class34.field404 == null) {
                                        class34.field404 = new class258[class182.field3261[class155.field2663]];
                                    }
                                    class34.field404[var257] = var258;
                                }
                                if (var259.method1816(false) > 0) {
                                    if (class238.field4161 == null) {
                                        class238.field4161 = new class258[class182.field3261[class155.field2663]];
                                    }
                                    class238.field4161[var257] = var259;
                                }
                                continue;
                            }
                            if (var483 == 5423) {
                                var6--;
                                class70.field1211[var6].method1810((byte) 88);
                                continue;
                            }
                        } else if (var483 < 5600) {
                            if (var483 == 5500) {
                                var7 -= 4;
                                int var260 = class168.field2850[var7 + 1];
                                int var261 = class168.field2850[var7];
                                int var262 = class168.field2850[var7 + 2];
                                int var263 = class168.field2850[var7 + 3];
                                class243.method1653(var263, false, var260, (var261 & 0x3FFF) - class311.field5271, (byte) -106, ((var261 & 0xFFFFEE9) >> 14) - class229.field3955, var262);
                                continue;
                            }
                            if (var483 == 5501) {
                                var7 -= 4;
                                int var264 = class168.field2850[var7];
                                int var265 = class168.field2850[var7 + 1];
                                int var266 = class168.field2850[var7 + 2];
                                int var267 = class168.field2850[var7 + 3];
                                class43.method367(var266, (var264 & 0x3FFF) - class311.field5271, (byte) -117, var265, var267, ((var264 & 0xFFFCFA5) >> 14) - class229.field3955);
                                continue;
                            }
                            if (var483 == 5502) {
                                var7 -= 6;
                                int var268 = class168.field2850[var7];
                                if (var268 >= 2) {
                                    throw new RuntimeException();
                                }
                                class205.field3554 = var268;
                                int var269 = class168.field2850[var7 + 1];
                                if (class82.field1385[class205.field3554].length >> 1 <= var269 + 1) {
                                    throw new RuntimeException();
                                }
                                class85.field1435 = var269;
                                class47.field706 = 0;
                                client.field624 = class168.field2850[var7 + 2];
                                class310.field5251 = class168.field2850[var7 + 3];
                                int var270 = class168.field2850[var7 + 4];
                                if (var270 >= 2) {
                                    throw new RuntimeException();
                                }
                                class57.field897 = var270;
                                int var271 = class168.field2850[var7 + 5];
                                if ((var271 + 1) >= (class82.field1385[class57.field897].length >> 1)) {
                                    throw new RuntimeException();
                                }
                                class109.field1926 = 3;
                                class39.field561 = var271;
                                continue;
                            }
                            if (var483 == 5503) {
                                class294.method2061(true);
                                continue;
                            }
                            if (var483 == 5504) {
                                var7 -= 2;
                                class101.field1815 = class168.field2850[var7];
                                class68.field1177 = class168.field2850[var7 + 1];
                                class314.method2172((byte) 27);
                                continue;
                            }
                            if (var483 == 5505) {
                                class168.field2850[var7++] = class101.field1815;
                                continue;
                            }
                            if (var483 == 5506) {
                                class168.field2850[var7++] = class68.field1177;
                                continue;
                            }
                        } else if (var483 < 5700) {
                            if (var483 == 5600) {
                                var7--;
                                int var295 = class168.field2850[var7];
                                var6 -= 2;
                                class258 var296 = class70.field1211[var6];
                                class258 var297 = class70.field1211[var6 + 1];
                                if (class280.field4818 == 10 && class190.field3367 == 0 && class140.field2386 == 0 && class165.field2810 == 0 && class188.field3339 == 0) {
                                    class27.method206(var297, var296, arg1 + 2704, var295);
                                }
                                continue;
                            }
                            if (var483 == 5601) {
                                class265.method1851(-10700);
                                continue;
                            }
                            if (var483 == 5602) {
                                if (class140.field2386 == 0) {
                                    class265.field4608 = -2;
                                }
                                continue;
                            }
                            if (var483 == 5603) {
                                var7 -= 4;
                                if (class280.field4818 == 10 && class190.field3367 == 0 && class140.field2386 == 0 && class165.field2810 == 0 && class188.field3339 == 0) {
                                    class233.method1559(class168.field2850[var7 + 2], class168.field2850[var7], true, class168.field2850[var7 + 1], class168.field2850[var7 + 3]);
                                }
                                continue;
                            }
                            if (var483 == 5604) {
                                var6--;
                                if (class280.field4818 == 10 && class190.field3367 == 0 && class140.field2386 == 0 && class165.field2810 == 0 && class188.field3339 == 0) {
                                    class13.method92(class70.field1211[var6].method1769(16), (byte) 99);
                                }
                                continue;
                            }
                            if (var483 == 5605) {
                                var6 -= 2;
                                var7 -= 4;
                                if (class280.field4818 == 10 && class190.field3367 == 0 && class140.field2386 == 0 && class165.field2810 == 0 && class188.field3339 == 0) {
                                    class255.method1723(class70.field1211[var6].method1769(16), 0, class168.field2850[var7 + 3], class168.field2850[var7], class168.field2850[var7 + 2], class168.field2850[var7 + 1], class70.field1211[var6 + 1]);
                                }
                                continue;
                            }
                            if (var483 == 5606) {
                                if (class165.field2810 == 0) {
                                    class246.field4275 = -2;
                                }
                                continue;
                            }
                            if (var483 == 5607) {
                                class168.field2850[var7++] = class265.field4608;
                                continue;
                            }
                            if (var483 == 5608) {
                                class168.field2850[var7++] = class242.field4202;
                                continue;
                            }
                            if (var483 == 5609) {
                                class168.field2850[var7++] = class246.field4275;
                                continue;
                            }
                            if (var483 == 5610) {
                                for (int var298 = 0; var298 < 5; var298++) {
                                    class70.field1211[var6++] = var298 < class36.field462.length ? class36.field462[var298].method1786((byte) 107) : class59.field986;
                                }
                                class36.field462 = null;
                                continue;
                            }
                            if (var483 == 5611) {
                                class168.field2850[var7++] = class86.field1456;
                                continue;
                            }
                        } else if (var483 < 6100) {
                            if (var483 == 6001) {
                                var7--;
                                int var289 = class168.field2850[var7];
                                if (var289 < 1) {
                                    var289 = 1;
                                }
                                if (var289 > 4) {
                                    var289 = 4;
                                }
                                class151.field2557 = var289;
                                if (!class257.field4390 || !class4.field62) {
                                    if (class151.field2557 == 1) {
                                        class266.method1871(0.9F);
                                    }
                                    if (class151.field2557 == 2) {
                                        class266.method1871(0.8F);
                                    }
                                    if (class151.field2557 == 3) {
                                        class266.method1871(0.7F);
                                    }
                                    if (class151.field2557 == 4) {
                                        class266.method1871(0.6F);
                                    }
                                }
                                if (class257.field4390) {
                                    class121.method883((byte) 42);
                                    if (!class4.field62) {
                                        class43.method360((byte) -68);
                                    }
                                }
                                class100.method754(-1);
                                class219.method1484((byte) -126, class297.field5086);
                                class210.field3625 = false;
                                continue;
                            }
                            if (var483 == 6002) {
                                var7--;
                                class16.method106(class168.field2850[var7] == 1, (byte) 110);
                                class290.method2042(false);
                                class43.method360((byte) -68);
                                class5.method28(26286);
                                class219.method1484((byte) -126, class297.field5086);
                                class210.field3625 = false;
                                continue;
                            }
                            if (var483 == 6003) {
                                var7--;
                                class45.field672 = class168.field2850[var7] == 1;
                                class5.method28(26286);
                                class219.method1484((byte) -115, class297.field5086);
                                class210.field3625 = false;
                                continue;
                            }
                            if (var483 == 6005) {
                                var7--;
                                class119.field2110 = class168.field2850[var7] == 1;
                                class43.method360((byte) -68);
                                class219.method1484((byte) -114, class297.field5086);
                                class210.field3625 = false;
                                continue;
                            }
                            if (var483 == 6006) {
                                var7--;
                                class173.field3101 = class168.field2850[var7] == 1;
                                ((class272) class266.field4643).method1918(!class173.field3101, 21275);
                                class219.method1484((byte) -100, class297.field5086);
                                class210.field3625 = false;
                                continue;
                            }
                            if (var483 == 6007) {
                                var7--;
                                class146.field2477 = class168.field2850[var7] == 1;
                                class219.method1484((byte) -122, class297.field5086);
                                class210.field3625 = false;
                                continue;
                            }
                            if (var483 == 6008) {
                                var7--;
                                class271.field4697 = class168.field2850[var7] == 1;
                                class219.method1484((byte) -121, class297.field5086);
                                class210.field3625 = false;
                                continue;
                            }
                            if (var483 == 6009) {
                                var7--;
                                class50.field743 = class168.field2850[var7] == 1;
                                class219.method1484((byte) -97, class297.field5086);
                                class210.field3625 = false;
                                continue;
                            }
                            if (var483 == 6010) {
                                var7--;
                                class90.field1587 = class168.field2850[var7] == 1;
                                class219.method1484((byte) -117, class297.field5086);
                                class210.field3625 = false;
                                continue;
                            }
                            if (var483 == 6011) {
                                var7--;
                                int var290 = class168.field2850[var7];
                                if (var290 < 0 || var290 > 2) {
                                    var290 = 0;
                                }
                                field4312 = var290;
                                class219.method1484((byte) -108, class297.field5086);
                                class210.field3625 = false;
                                continue;
                            }
                            if (var483 == 6012) {
                                if (class257.field4390) {
                                    class107.method795(0, 58, 0);
                                }
                                var7--;
                                class4.field62 = class168.field2850[var7] == 1;
                                if (class257.field4390 && class4.field62) {
                                    class266.method1871(0.7F);
                                } else {
                                    if (class151.field2557 == 1) {
                                        class266.method1871(0.9F);
                                    }
                                    if (class151.field2557 == 2) {
                                        class266.method1871(0.8F);
                                    }
                                    if (class151.field2557 == 3) {
                                        class266.method1871(0.7F);
                                    }
                                    if (class151.field2557 == 4) {
                                        class266.method1871(0.6F);
                                    }
                                }
                                class43.method360((byte) -68);
                                class219.method1484((byte) -98, class297.field5086);
                                class210.field3625 = false;
                                continue;
                            }
                            if (var483 == 6014) {
                                var7--;
                                class20.field239 = class168.field2850[var7] == 1;
                                if (class257.field4390) {
                                    class43.method360((byte) -68);
                                }
                                class219.method1484((byte) -124, class297.field5086);
                                class210.field3625 = false;
                                continue;
                            }
                            if (var483 == 6015) {
                                var7--;
                                class57.field896 = class168.field2850[var7] == 1;
                                if (class257.field4390) {
                                    class121.method883((byte) 8);
                                }
                                class219.method1484((byte) -123, class297.field5086);
                                class210.field3625 = false;
                                continue;
                            }
                            if (var483 == 6016) {
                                var7--;
                                int var291 = class168.field2850[var7];
                                if (var291 < 0 || var291 > 2) {
                                    var291 = 0;
                                }
                                class58.field917 = var291;
                                if (class257.field4390) {
                                    class311.field5265 = true;
                                }
                                class219.method1484((byte) -94, class297.field5086);
                                class210.field3625 = false;
                                continue;
                            }
                            if (var483 == 6017) {
                                var7--;
                                class197.field3463 = class168.field2850[var7] == 1;
                                class8.method43(1);
                                class219.method1484((byte) -107, class297.field5086);
                                class210.field3625 = false;
                                continue;
                            }
                            if (var483 == 6018) {
                                var7--;
                                int var292 = class168.field2850[var7];
                                if (var292 < 0) {
                                    var292 = 0;
                                }
                                if (var292 > 127) {
                                    var292 = 127;
                                }
                                class186.field3307 = var292;
                                class219.method1484((byte) -96, class297.field5086);
                                class210.field3625 = false;
                                continue;
                            }
                            if (var483 == 6019) {
                                var7--;
                                int var293 = class168.field2850[var7];
                                if (var293 < 0) {
                                    var293 = 0;
                                }
                                if (var293 > 255) {
                                    var293 = 255;
                                }
                                if (class244.field4233 != var293) {
                                    if (class244.field4233 == 0 && class2.field36 != -1) {
                                        class44.method370(-32768, class2.field36, 0, false, var293, class95.field1667);
                                        class106.field1898 = false;
                                    } else if (var293 == 0) {
                                        class128.method927((byte) 115);
                                        class106.field1898 = false;
                                    } else {
                                        class311.method2159(var293, arg1 - 23428);
                                    }
                                    class244.field4233 = var293;
                                }
                                class219.method1484((byte) -113, class297.field5086);
                                class210.field3625 = false;
                                continue;
                            }
                            if (var483 == 6020) {
                                var7--;
                                int var294 = class168.field2850[var7];
                                if (var294 < 0) {
                                    var294 = 0;
                                }
                                if (var294 > 127) {
                                    var294 = 127;
                                }
                                class317.field5345 = var294;
                                class219.method1484((byte) -126, class297.field5086);
                                class210.field3625 = false;
                                continue;
                            }
                            if (var483 == 6021) {
                                var7--;
                                class168.field2855 = class168.field2850[var7] == 1;
                                class5.method28(26286);
                                continue;
                            }
                        } else if (var483 < 6200) {
                            if (var483 == 6101) {
                                class168.field2850[var7++] = class151.field2557;
                                continue;
                            }
                            if (var483 == 6102) {
                                class168.field2850[var7++] = class110.method807(720049666) ? 1 : 0;
                                continue;
                            }
                            if (var483 == 6103) {
                                class168.field2850[var7++] = class45.field672 ? 1 : 0;
                                continue;
                            }
                            if (var483 == 6105) {
                                class168.field2850[var7++] = class119.field2110 ? 1 : 0;
                                continue;
                            }
                            if (var483 == 6106) {
                                class168.field2850[var7++] = class173.field3101 ? 1 : 0;
                                continue;
                            }
                            if (var483 == 6107) {
                                class168.field2850[var7++] = class146.field2477 ? 1 : 0;
                                continue;
                            }
                            if (var483 == 6108) {
                                class168.field2850[var7++] = class271.field4697 ? 1 : 0;
                                continue;
                            }
                            if (var483 == 6109) {
                                class168.field2850[var7++] = class50.field743 ? 1 : 0;
                                continue;
                            }
                            if (var483 == 6110) {
                                class168.field2850[var7++] = class90.field1587 ? 1 : 0;
                                continue;
                            }
                            if (var483 == 6111) {
                                class168.field2850[var7++] = field4312;
                                continue;
                            }
                            if (var483 == 6112) {
                                class168.field2850[var7++] = class4.field62 ? 1 : 0;
                                continue;
                            }
                            if (var483 == 6114) {
                                class168.field2850[var7++] = class20.field239 ? 1 : 0;
                                continue;
                            }
                            if (var483 == 6115) {
                                class168.field2850[var7++] = class57.field896 ? 1 : 0;
                                continue;
                            }
                            if (var483 == 6116) {
                                class168.field2850[var7++] = class58.field917;
                                continue;
                            }
                            if (var483 == 6117) {
                                class168.field2850[var7++] = class197.field3463 ? 1 : 0;
                                continue;
                            }
                            if (var483 == 6118) {
                                class168.field2850[var7++] = class186.field3307;
                                continue;
                            }
                            if (var483 == 6119) {
                                class168.field2850[var7++] = class244.field4233;
                                continue;
                            }
                            if (var483 == 6120) {
                                class168.field2850[var7++] = class317.field5345;
                                continue;
                            }
                            if (var483 == 6121) {
                                if (class257.field4390) {
                                    class168.field2850[var7++] = class257.field4419 ? 1 : 0;
                                } else {
                                    class168.field2850[var7++] = 0;
                                }
                                continue;
                            }
                        } else if (var483 < 6300) {
                            if (var483 == 6200) {
                                var7 -= 2;
                                class259.field4517 = (short) class168.field2850[var7];
                                if (class259.field4517 <= 0) {
                                    class259.field4517 = 256;
                                }
                                class204.field3532 = (short) class168.field2850[var7 + 1];
                                if (class204.field3532 <= 0) {
                                    class204.field3532 = 205;
                                }
                                continue;
                            }
                            if (var483 == 6201) {
                                var7 -= 2;
                                class148.field2504 = (short) class168.field2850[var7];
                                if (class148.field2504 <= 0) {
                                    class148.field2504 = 256;
                                }
                                class115.field2056 = (short) class168.field2850[var7 + 1];
                                if (class115.field2056 <= 0) {
                                    class115.field2056 = 320;
                                }
                                continue;
                            }
                            if (var483 == 6202) {
                                var7 -= 4;
                                class225.field3864 = (short) class168.field2850[var7];
                                if (class225.field3864 <= 0) {
                                    class225.field3864 = 1;
                                }
                                class6.field78 = (short) class168.field2850[var7 + 1];
                                if (class6.field78 <= 0) {
                                    class6.field78 = 32767;
                                } else if (class6.field78 < class225.field3864) {
                                    class6.field78 = class225.field3864;
                                }
                                class115.field2059 = (short) class168.field2850[var7 + 2];
                                if (class115.field2059 <= 0) {
                                    class115.field2059 = 1;
                                }
                                class180.field3222 = (short) class168.field2850[var7 + 3];
                                if (class180.field3222 <= 0) {
                                    class180.field3222 = 32767;
                                } else if (class180.field3222 < class115.field2059) {
                                    class180.field3222 = class115.field2059;
                                }
                                continue;
                            }
                            if (var483 == 6203) {
                                class72.method541(0, field4314.field3002, 0, (byte) -121, field4314.field3054, false);
                                class168.field2850[var7++] = class113.field1954;
                                class168.field2850[var7++] = class261.field4540;
                                continue;
                            }
                            if (var483 == 6204) {
                                class168.field2850[var7++] = class148.field2504;
                                class168.field2850[var7++] = class115.field2056;
                                continue;
                            }
                            if (var483 == 6205) {
                                class168.field2850[var7++] = class259.field4517;
                                class168.field2850[var7++] = class204.field3532;
                                continue;
                            }
                        } else if (var483 < 6400) {
                            if (var483 == 6300) {
                                class168.field2850[var7++] = (int) (class25.method197(-3418) / 60000L);
                                continue;
                            }
                            if (var483 == 6301) {
                                class168.field2850[var7++] = (int) (class25.method197(-3418) / 86400000L) - 11745;
                                continue;
                            }
                            if (var483 == 6302) {
                                var7 -= 3;
                                int var284 = class168.field2850[var7];
                                int var285 = class168.field2850[var7 + 1];
                                int var286 = class168.field2850[var7 + 2];
                                class225.field3860.clear();
                                class225.field3860.set(11, 12);
                                class225.field3860.set(var286, var285, var284);
                                class168.field2850[var7++] = (int) (class225.field3860.getTime().getTime() / 86400000L) - 11745;
                                continue;
                            }
                            if (var483 == 6303) {
                                class225.field3860.clear();
                                class225.field3860.setTime(new Date(class25.method197(-3418)));
                                class168.field2850[var7++] = class225.field3860.get(1);
                                continue;
                            }
                            if (var483 == 6304) {
                                var7--;
                                int var287 = class168.field2850[var7];
                                boolean var288 = true;
                                if (var287 < 0) {
                                    var288 = ((var287 + 1) % 4) == 0;
                                } else if (var287 < 1582) {
                                    var288 = (var287 % 4) == 0;
                                } else if (var287 % 4 != 0) {
                                    var288 = false;
                                } else if ((var287 % 100) != 0) {
                                    var288 = true;
                                } else if ((var287 % 400) != 0) {
                                    var288 = false;
                                }
                                class168.field2850[var7++] = var288 ? 1 : 0;
                                continue;
                            }
                        } else if (var483 < 6500) {
                            if (var483 == 6405) {
                                class168.field2850[var7++] = class271.method1912((byte) -124) ? 1 : 0;
                                continue;
                            }
                            if (var483 == 6406) {
                                class168.field2850[var7++] = class181.method1238(-2948) ? 1 : 0;
                                continue;
                            }
                        } else if (var483 < 6600) {
                            if (var483 == 6500) {
                                if (class280.field4818 == 10 && class190.field3367 == 0 && class140.field2386 == 0 && class165.field2810 == 0) {
                                    class168.field2850[var7++] = class169.method1121(-3943) == -1 ? 0 : 1;
                                    continue;
                                }
                                class168.field2850[var7++] = 1;
                                continue;
                            }
                            if (var483 == 6501) {
                                class98 var272 = class76.method555(-104);
                                if (var272 == null) {
                                    class168.field2850[var7++] = -1;
                                    class168.field2850[var7++] = 0;
                                    class70.field1211[var6++] = class59.field986;
                                    class168.field2850[var7++] = 0;
                                    class70.field1211[var6++] = class59.field986;
                                    class168.field2850[var7++] = 0;
                                } else {
                                    class168.field2850[var7++] = var272.field1747;
                                    class168.field2850[var7++] = var272.field89;
                                    class70.field1211[var6++] = var272.field1751;
                                    class105 var273 = var272.method741(1);
                                    class168.field2850[var7++] = var273.field1887;
                                    class70.field1211[var6++] = var273.field1892;
                                    class168.field2850[var7++] = var272.field76;
                                }
                                continue;
                            }
                            if (var483 == 6502) {
                                class98 var274 = class38.method288(1905);
                                if (var274 == null) {
                                    class168.field2850[var7++] = -1;
                                    class168.field2850[var7++] = 0;
                                    class70.field1211[var6++] = class59.field986;
                                    class168.field2850[var7++] = 0;
                                    class70.field1211[var6++] = class59.field986;
                                    class168.field2850[var7++] = 0;
                                } else {
                                    class168.field2850[var7++] = var274.field1747;
                                    class168.field2850[var7++] = var274.field89;
                                    class70.field1211[var6++] = var274.field1751;
                                    class105 var275 = var274.method741(1);
                                    class168.field2850[var7++] = var275.field1887;
                                    class70.field1211[var6++] = var275.field1892;
                                    class168.field2850[var7++] = var274.field76;
                                }
                                continue;
                            }
                            if (var483 == 6503) {
                                var7--;
                                int var276 = class168.field2850[var7];
                                if (class280.field4818 == 10 && class190.field3367 == 0 && class140.field2386 == 0 && class165.field2810 == 0) {
                                    class168.field2850[var7++] = class42.method339((byte) 120, var276) ? 1 : 0;
                                    continue;
                                }
                                class168.field2850[var7++] = 0;
                                continue;
                            }
                            if (var483 == 6504) {
                                var7--;
                                class99.field1758 = class168.field2850[var7];
                                class219.method1484((byte) -107, class297.field5086);
                                continue;
                            }
                            if (var483 == 6505) {
                                class168.field2850[var7++] = class99.field1758;
                                continue;
                            }
                            if (var483 == 6506) {
                                var7--;
                                int var277 = class168.field2850[var7];
                                class98 var278 = class27.method210(6, var277);
                                if (var278 == null) {
                                    class168.field2850[var7++] = -1;
                                    class70.field1211[var6++] = class59.field986;
                                    class168.field2850[var7++] = 0;
                                    class70.field1211[var6++] = class59.field986;
                                    class168.field2850[var7++] = 0;
                                } else {
                                    class168.field2850[var7++] = var278.field89;
                                    class70.field1211[var6++] = var278.field1751;
                                    class105 var279 = var278.method741(arg1 + 2705);
                                    class168.field2850[var7++] = var279.field1887;
                                    class70.field1211[var6++] = var279.field1892;
                                    class168.field2850[var7++] = var278.field76;
                                }
                                continue;
                            }
                            if (var483 == 6507) {
                                var7 -= 4;
                                int var280 = class168.field2850[var7];
                                boolean var281 = class168.field2850[var7 + 1] == 1;
                                int var282 = class168.field2850[var7 + 2];
                                boolean var283 = class168.field2850[var7 + 3] == 1;
                                class185.method1255(0, var280, var283, var281, var282);
                                continue;
                            }
                        }
                    } else if (var483 == 4400) {
                        var7 -= 2;
                        int var378 = class168.field2850[var7];
                        int var379 = class168.field2850[var7 + 1];
                        class84 var380 = class78.method562(var379, 26386);
                        if (var380.method607(62)) {
                            class70.field1211[var6++] = class123.method898(-935, var378).method770(var380.field1421, var379, (byte) -35);
                        } else {
                            class168.field2850[var7++] = class123.method898(class139.method962(arg1, 2345), var378).method766(var380.field1429, var379, -76);
                        }
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var482) {
            if (var5.field2512 == null) {
                if (class50.field789 != 0) {
                    class140.method965(false, 0, class49.field728, class59.field986);
                }
                class107.method796(var482, (byte) -33, "CS2 - scr:" + var5.field2642 + " op:" + var10);
            } else {
                class258 var478 = class92.method687(30, false);
                var478.method1766(-108, class306.field5193).method1766(arg1 ^ 0xFFFFF520, var5.field2512);
                for (int var479 = class95.field1664 - 1; var479 >= 0; var479--) {
                    var478.method1766(58, class52.field831).method1766(69, class234.field4046[var479].field388.field2512);
                }
                if (var10 == 40) {
                    int var480 = var11[var8];
                    var478.method1766(arg1 ^ 0xAE3, class48.field718).method1766(30, class218.method1481(arg1 + 2813, var480));
                }
                if (class50.field789 != 0) {
                    class140.method965(false, 0, class100.method755(-6, new class258[] { class253.field4361, var5.field2512 }), class59.field986);
                }
                class107.method796(var482, (byte) 112, "CS2 - scr:" + var5.field2642 + " op:" + var10 + new String(var478.method1793(37)));
            }
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "([J[Ljava/lang/Object;Z)V", line = 6080)
    public static final void method1698(long[] arg0, Object[] arg1, boolean arg2) {
        class249.method1694(arg0, (byte) -93, arg1, arg0.length - 1, 0);
        field4308++;
        if (!arg2) {
            method1697(67, 122, (class42) null);
        }
    }
}
