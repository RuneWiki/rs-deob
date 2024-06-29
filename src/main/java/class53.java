import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class53 extends class127 {

    @OriginalMember(owner = "client!ie", name = "I", descriptor = "I")
    public static int field1311 = 0;

    @OriginalMember(owner = "client!ie", name = "K", descriptor = "Lhb;")
    private static class44 field1313 = class102.method810("Loading fonts )2 ", -28606);

    @OriginalMember(owner = "client!ie", name = "E", descriptor = "Lhb;")
    public static class44 field1307 = field1313;

    @OriginalMember(owner = "client!ie", name = "H", descriptor = "Lhb;")
    public static class44 field1310 = class102.method810("Willkommen auf RuneScape", -28606);

    @OriginalMember(owner = "client!ie", name = "B", descriptor = "Lob;")
    public static class86 field1304 = new class86(5000);

    @OriginalMember(owner = "client!ie", name = "Y", descriptor = "Lhb;")
    public static class44 field1326 = class102.method810("Ein", -28606);

    @OriginalMember(owner = "client!ie", name = "V", descriptor = "Lhb;")
    public static class44 field1323 = class102.method810("Update)2Liste geladen)3", -28606);

    @OriginalMember(owner = "client!ie", name = "Z", descriptor = "Lhb;")
    public static class44 field1327 = class102.method810("null", -28606);

    @OriginalMember(owner = "client!ie", name = "cb", descriptor = "Lhb;")
    public static class44 field1330 = class102.method810("Handel)4Duell", -28606);

    @OriginalMember(owner = "client!ie", name = "X", descriptor = "Lhb;")
    public static class44 field1325 = class102.method810("(X100(U(Y", -28606);

    @OriginalMember(owner = "client!ie", name = "ab", descriptor = "Lhb;")
    public static class44 field1328 = class102.method810("@or2@", -28606);

    @OriginalMember(owner = "client!ie", name = "bb", descriptor = "Lhb;")
    private static class44 field1329 = class102.method810("Report abuse", -28606);

    @OriginalMember(owner = "client!ie", name = "T", descriptor = "Lhb;")
    public static class44 field1321 = field1329;

    @OriginalMember(owner = "client!ie", name = "W", descriptor = "Lfc;")
    public static class34 field1324 = new class34(64);

    @OriginalMember(owner = "client!ie", name = "y", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!ie", name = "z", descriptor = "I")
    public int field1302;

    @OriginalMember(owner = "client!ie", name = "A", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!ie", name = "F", descriptor = "I")
    public static int field1308;

    @OriginalMember(owner = "client!ie", name = "G", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client!ie", name = "J", descriptor = "I")
    public int field1312;

    @OriginalMember(owner = "client!ie", name = "M", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!ie", name = "D", descriptor = "Lwd;")
    public static class131 field1306;

    @OriginalMember(owner = "client!ie", name = "S", descriptor = "Lne;")
    public static class83 field1320;

    @OriginalMember(owner = "client!ie", name = "U", descriptor = "Lpc;")
    public static class93 field1322;

    @OriginalMember(owner = "client!ie", name = "L", descriptor = "[I")
    public int[] field1314;

    @OriginalMember(owner = "client!ie", name = "N", descriptor = "[I")
    public int[] field1316;

    @OriginalMember(owner = "client!ie", name = "Q", descriptor = "[I")
    public int[] field1318;

    @OriginalMember(owner = "client!ie", name = "C", descriptor = "[Lva;")
    public class123[] field1305;

    @OriginalMember(owner = "client!ie", name = "P", descriptor = "[Lva;")
    public class123[] field1317;

    @OriginalMember(owner = "client!ie", name = "R", descriptor = "[[[B")
    public byte[][][] field1319;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BZ)V", line = 21)
    public static final void method499(byte arg0, boolean arg1) {
        if (arg0 >= -96) {
            method499((byte) 116, false);
        }
        class71.field1750++;
        field1309++;
        if (class71.field1750 < 50 && !arg1) {
            return;
        }
        class71.field1750 = 0;
        if (class47.field1181 || class107.field2711 == null) {
            return;
        }
        class92.field2333.method702(true, 202);
        try {
            class107.field2711.method323(0, (byte) 109, class92.field2333.field3182, class92.field2333.field3172);
            class92.field2333.field3182 = 0;
        } catch (IOException var2) {
            class47.field1181 = true;
        }
        class9.field173++;
    }

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "(I)V", line = 57)
    public static void method500(int arg0) {
        if (arg0 != 23) {
            method502(null, true);
        }
        field1304 = null;
        field1320 = null;
        field1325 = null;
        field1321 = null;
        field1326 = null;
        field1310 = null;
        field1329 = null;
        field1306 = null;
        field1323 = null;
        field1328 = null;
        field1324 = null;
        field1327 = null;
        field1322 = null;
        field1307 = null;
        field1313 = null;
        field1330 = null;
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(Z)V", line = 84)
    public static final void method501(boolean arg0) {
        field1301++;
        if (!arg0) {
            method499((byte) 81, true);
        }
        if (class48.field1195 == 0 && class44.field1071 == 0) {
            class125.field3014++;
            class52.method495(class100.field2519, 26, class110.field2749, 0, 1000, class51.field1274, class48.field1194);
        }
        int var1 = -1;
        for (int var2 = 0; var2 < class24.field571; var2++) {
            int var3 = class24.field580[var2];
            int var4 = var3 >> 29 & 0x3;
            int var5 = var3 & 0x7F;
            int var6 = var3 >> 7 & 0x7F;
            int var7 = var3 >> 14 & 0x7FFF;
            if (var1 != var3) {
                var1 = var3;
                if (var4 == 2 && class89.field2283.method278(class79.field1993, var5, var6, var3) >= 0) {
                    class57 var8 = class130.method965(var7, -100);
                    if (var8.field1446 != null) {
                        var8 = var8.method533((byte) 125);
                    }
                    if (var8 == null) {
                        continue;
                    }
                    if (class48.field1195 == 1) {
                        class52.method495(var5, 39, var6, var3, 1000, class117.method903(new class44[] { class95.field2421, class96.field2459, var8.field1482 }, !arg0), class11.field211);
                        class105.field2684++;
                    } else if (class44.field1071 != 1) {
                        class77.field1919++;
                        class44[] var9 = var8.field1455;
                        if (class109.field2741) {
                            var9 = class11.method77((byte) 117, var9);
                        }
                        if (var9 != null) {
                            for (int var10 = 4; var10 >= 0; var10--) {
                                if (var9[var10] != null) {
                                    class42.field963++;
                                    short var11 = 0;
                                    if (var10 == 0) {
                                        var11 = 11;
                                    }
                                    if (var10 == 1) {
                                        var11 = 48;
                                    }
                                    if (var10 == 2) {
                                        var11 = 4;
                                    }
                                    if (var10 == 3) {
                                        var11 = 13;
                                    }
                                    if (var10 == 4) {
                                        var11 = 1001;
                                    }
                                    class52.method495(var5, var11, var6, var3, 1000, class117.method903(new class44[] { class78.field1978, var8.field1482 }, false), var9[var10]);
                                }
                            }
                        }
                        class52.method495(var5, 1003, var6, var8.field1491 << 14, 1000, class117.method903(new class44[] { class78.field1978, var8.field1482 }, false), class41.field945);
                    } else if ((class79.field1995 & 0x4) == 4) {
                        class52.method495(var5, 40, var6, var3, 1000, class117.method903(new class44[] { client.field376, class96.field2459, var8.field1482 }, false), class13.field251);
                        class67.field1689++;
                    }
                }
                if (var4 == 1) {
                    class46 var12 = class116.field2845[var7];
                    if (var12.field1137.field997 == 1 && (var12.field1384 & 0x7F) == 64 && (var12.field1371 & 0x7F) == 64) {
                        for (int var13 = 0; var13 < class125.field3036; var13++) {
                            class46 var16 = class116.field2845[class100.field2515[var13]];
                            if (var16 != null && var12 != var16 && var16.field1137.field997 == 1 && var12.field1384 == var16.field1384 && var12.field1371 == var16.field1371) {
                                class25.method212(class100.field2515[var13], 0, var6, var5, var16.field1137);
                            }
                        }
                        for (int var14 = 0; var14 < class125.field3020; var14++) {
                            class103 var15 = class82.field2110[class118.field2913[var14]];
                            if (var15 != null && var12.field1384 == var15.field1384 && var12.field1371 == var15.field1371) {
                                class103.method813(class118.field2913[var14], 2000, var6, var15, var5);
                            }
                        }
                    }
                    class25.method212(var7, 0, var6, var5, var12.field1137);
                }
                if (var4 == 0) {
                    class103 var17 = class82.field2110[var7];
                    if ((var17.field1384 & 0x7F) == 64 && (var17.field1371 & 0x7F) == 64) {
                        for (int var18 = 0; var18 < class125.field3036; var18++) {
                            class46 var21 = class116.field2845[class100.field2515[var18]];
                            if (var21 != null && var21.field1137.field997 == 1 && var17.field1384 == var21.field1384 && var17.field1371 == var21.field1371) {
                                class25.method212(class100.field2515[var18], 0, var6, var5, var21.field1137);
                            }
                        }
                        for (int var19 = 0; var19 < class125.field3020; var19++) {
                            class103 var20 = class82.field2110[class118.field2913[var19]];
                            if (var20 != null && var17 != var20 && var17.field1384 == var20.field1384 && var17.field1371 == var20.field1371) {
                                class103.method813(class118.field2913[var19], 2000, var6, var20, var5);
                            }
                        }
                    }
                    class103.method813(var7, 2000, var6, var17, var5);
                }
                if (var4 == 3) {
                    class47 var22 = class82.field2115[class79.field1993][var5][var6];
                    if (var22 != null) {
                        for (class67 var23 = (class67) var22.method445(111); var23 != null; var23 = (class67) var22.method436((byte) 107)) {
                            class80 var24 = class42.method358(0, var23.field1682);
                            if (class48.field1195 == 1) {
                                class42.field974++;
                                class52.method495(var5, 1, var6, var23.field1682, 1000, class117.method903(new class44[] { class95.field2421, class14.field273, var24.field2004 }, false), class11.field211);
                            } else if (class44.field1071 != 1) {
                                class44[] var25 = var24.field2055;
                                if (class109.field2741) {
                                    var25 = class11.method77((byte) -122, var25);
                                }
                                class104.field2663++;
                                for (int var26 = 4; var26 >= 0; var26--) {
                                    if (var25 != null && var25[var26] != null) {
                                        class48.field1200++;
                                        byte var27 = 0;
                                        if (var26 == 0) {
                                            var27 = 54;
                                        }
                                        if (var26 == 1) {
                                            var27 = 45;
                                        }
                                        if (var26 == 2) {
                                            var27 = 44;
                                        }
                                        if (var26 == 3) {
                                            var27 = 21;
                                        }
                                        if (var26 == 4) {
                                            var27 = 14;
                                        }
                                        class52.method495(var5, var27, var6, var23.field1682, 1000, class117.method903(new class44[] { class120.field2945, var24.field2004 }, false), var25[var26]);
                                    } else if (var26 == 2) {
                                        class52.method495(var5, 44, var6, var23.field1682, 1000, class117.method903(new class44[] { class120.field2945, var24.field2004 }, false), class1.field9);
                                        class90.field2298++;
                                    }
                                }
                                class52.method495(var5, 1006, var6, var23.field1682, 1000, class117.method903(new class44[] { class120.field2945, var24.field2004 }, false), class41.field945);
                            } else if ((class79.field1995 & 0x1) == 1) {
                                class21.field429++;
                                class52.method495(var5, 23, var6, var23.field1682, 1000, class117.method903(new class44[] { client.field376, class14.field273, var24.field2004 }, false), class13.field251);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lja;Z)V", line = 387)
    public static final void method502(class55 arg0, boolean arg1) {
        field1315++;
        if (class2.field73 == arg0.field1374 || arg0.field1415 == -1 || arg0.field1359 != 0 || arg0.field1410 + 1 > client.method139(1, arg0.field1415).field2885[arg0.field1369]) {
            int var2 = arg0.field1344 * 128 + arg0.field1422 * 64;
            int var3 = class2.field73 - arg0.field1409;
            int var4 = arg0.field1374 - arg0.field1409;
            int var5 = arg0.field1383 * 128 + arg0.field1422 * 64;
            int var6 = arg0.field1422 * 64 + arg0.field1412 * 128;
            int var7 = arg0.field1422 * 64 + arg0.field1366 * 128;
            arg0.field1384 = ((var4 - var3) * var2 + var3 * var6) / var4;
            arg0.field1371 = ((var4 - var3) * var5 + var3 * var7) / var4;
        }
        arg0.field1357 = 0;
        if (arg0.field1396 == 0) {
            arg0.field1407 = 1024;
        }
        if (arg0.field1396 == 1) {
            arg0.field1407 = 1536;
        }
        if (arg0.field1396 == 2) {
            arg0.field1407 = 0;
        }
        if (!arg1) {
            field1310 = null;
        }
        if (arg0.field1396 == 3) {
            arg0.field1407 = 512;
        }
        arg0.field1419 = arg0.field1407;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIZIIIIIII)V", line = 437)
    public static final void method503(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2) {
            return;
        }
        field1303++;
        class125 var10 = null;
        for (class125 var11 = (class125) class96.field2437.method443((byte) -111); var11 != null; var11 = (class125) class96.field2437.method434(true)) {
            if (var11.field3010 == arg5 && var11.field3038 == arg1 && var11.field3017 == arg7 && var11.field3011 == arg9) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class125();
            var10.field3010 = arg5;
            var10.field3038 = arg1;
            var10.field3017 = arg7;
            var10.field3011 = arg9;
            class69.method592(var10, -125);
            class96.field2437.method448(var10, true);
        }
        var10.field3006 = arg0;
        var10.field3015 = arg3;
        var10.field3007 = arg8;
        var10.field3003 = arg4;
        var10.field3018 = arg6;
    }
}
