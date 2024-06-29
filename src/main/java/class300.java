import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class300 extends class114 {

    @OriginalMember(owner = "client!sh", name = "N", descriptor = "I")
    private int field4764 = 10;

    @OriginalMember(owner = "client!sh", name = "T", descriptor = "I")
    private int field4770 = 0;

    @OriginalMember(owner = "client!sh", name = "X", descriptor = "I")
    private int field4774 = 2048;

    @OriginalMember(owner = "client!sh", name = "P", descriptor = "I")
    public static int field4766 = -1;

    @OriginalMember(owner = "client!sh", name = "O", descriptor = "I")
    public static int field4765;

    @OriginalMember(owner = "client!sh", name = "Q", descriptor = "I")
    public static int field4767;

    @OriginalMember(owner = "client!sh", name = "R", descriptor = "I")
    public static int field4768;

    @OriginalMember(owner = "client!sh", name = "S", descriptor = "I")
    public static int field4769;

    @OriginalMember(owner = "client!sh", name = "V", descriptor = "I")
    public static int field4772;

    @OriginalMember(owner = "client!sh", name = "W", descriptor = "I")
    public static int field4773;

    @OriginalMember(owner = "client!sh", name = "F", descriptor = "[I")
    private int[] field4763;

    @OriginalMember(owner = "client!sh", name = "U", descriptor = "[I")
    private int[] field4771;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)V")
    public final void method12(byte arg0) {
        if (arg0 < 101) {
            method2010(-123, true, 0, -96);
        }
        ++field4772;
        this.method2009(-1222433268);
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "()V")
    public class300() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lbe;Z)V")
    public static final void method2007(class91 arg0, boolean arg1) {
        class126.field1773.method370((byte) -22, arg0);
        while (true) {
            class91 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class91[][] var7;
            class91 var83;
            do {
                class91 var82;
                do {
                    class91 var81;
                    do {
                        class91 var80;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class91) class126.field1773.method364(124);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field1328);
                                            var3 = var2.field1340;
                                            var4 = var2.field1327;
                                            var5 = var2.field1338;
                                            var6 = var2.field1322;
                                            var7 = class246.field3856[var5];
                                            if (!var2.field1344) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class91 var8 = class246.field3856[var5 - 1][var3][var4];
                                                    if (var8 != null && var8.field1328) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class231.field3613 && var3 > class79.field1095) {
                                                    class91 var9 = var7[var3 - 1][var4];
                                                    if (var9 != null && var9.field1328 && (var9.field1344 || (var2.field1336 & 1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class231.field3613 && var3 < class312.field5018 - 1) {
                                                    class91 var10 = var7[var3 + 1][var4];
                                                    if (var10 != null && var10.field1328 && (var10.field1344 || (var2.field1336 & 4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class216.field3312 && var4 > class85.field1207) {
                                                    class91 var11 = var7[var3][var4 - 1];
                                                    if (var11 != null && var11.field1328 && (var11.field1344 || (var2.field1336 & 8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class216.field3312 && var4 < class248.field3884 - 1) {
                                                    class91 var12 = var7[var3][var4 + 1];
                                                    if (var12 != null && var12.field1328 && (var12.field1344 || (var2.field1336 & 2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field1344 = false;
                                            if (var2.field1326 != null) {
                                                class91 var13 = var2.field1326;
                                                if (var13.field1341 != null) {
                                                    if (!class57.method358(0, var3, var4)) {
                                                        class188.method1187(var13.field1341, 0, class276.field4383, class78.field1089, class26.field419, class248.field3885, var3, var4, false);
                                                    } else {
                                                        class188.method1187(var13.field1341, 0, class276.field4383, class78.field1089, class26.field419, class248.field3885, var3, var4, true);
                                                    }
                                                } else if (var13.field1333 != null) {
                                                    if (!class57.method358(0, var3, var4)) {
                                                        class113.method719(var13.field1333, class276.field4383, class78.field1089, class26.field419, class248.field3885, var3, var4, false);
                                                    } else {
                                                        class113.method719(var13.field1333, class276.field4383, class78.field1089, class26.field419, class248.field3885, var3, var4, true);
                                                    }
                                                }
                                                class180 var14 = var13.field1334;
                                                if (var14 != null) {
                                                    var14.field2735.method11(0, class276.field4383, class78.field1089, class26.field419, class248.field3885, var14.field2736 - class272.field4343, var14.field2740 - class191.field2892, var14.field2732 - class107.field1525, var14.field2737, var5, (class220) null);
                                                }
                                                for (int var15 = 0; var15 < var13.field1343; ++var15) {
                                                    class160 var16 = var13.field1339[var15];
                                                    if (var16 != null) {
                                                        var16.field2230.method11(var16.field2222, class276.field4383, class78.field1089, class26.field419, class248.field3885, var16.field2226 - class272.field4343, var16.field2233 - class191.field2892, var16.field2227 - class107.field1525, var16.field2225, var5, (class220) null);
                                                    }
                                                }
                                            }
                                            boolean var17 = false;
                                            if (var2.field1341 != null) {
                                                if (!class57.method358(var6, var3, var4)) {
                                                    var17 = true;
                                                    if (var2.field1341.field2349 != 12345678 || class108.field1545 && var5 <= class69.field992) {
                                                        class188.method1187(var2.field1341, var6, class276.field4383, class78.field1089, class26.field419, class248.field3885, var3, var4, false);
                                                    }
                                                } else {
                                                    class188.method1187(var2.field1341, var6, class276.field4383, class78.field1089, class26.field419, class248.field3885, var3, var4, true);
                                                }
                                            } else if (var2.field1333 != null) {
                                                if (!class57.method358(var6, var3, var4)) {
                                                    var17 = true;
                                                    class113.method719(var2.field1333, class276.field4383, class78.field1089, class26.field419, class248.field3885, var3, var4, false);
                                                } else {
                                                    class113.method719(var2.field1333, class276.field4383, class78.field1089, class26.field419, class248.field3885, var3, var4, true);
                                                }
                                            }
                                            if (var17) {
                                                class308 var18 = var2.field1323;
                                                if (var18 != null && (var18.field4950 & 2147483648L) != 0L) {
                                                    var18.field4953.method11(0, class276.field4383, class78.field1089, class26.field419, class248.field3885, var18.field4956 - class272.field4343, var18.field4945 - class191.field2892, var18.field4946 - class107.field1525, var18.field4950, var5, (class220) null);
                                                }
                                            }
                                            int var19 = 0;
                                            int var20 = 0;
                                            class180 var21 = var2.field1334;
                                            class75 var22 = var2.field1329;
                                            if (var21 != null || var22 != null) {
                                                if (class231.field3613 == var3) {
                                                    ++var19;
                                                } else if (class231.field3613 < var3) {
                                                    var19 += 2;
                                                }
                                                if (class216.field3312 == var4) {
                                                    var19 += 3;
                                                } else if (class216.field3312 > var4) {
                                                    var19 += 6;
                                                }
                                                var20 = class34.field513[var19];
                                                var2.field1345 = class10.field107[var19];
                                            }
                                            if (var21 != null) {
                                                if ((var21.field2731 & class311.field5010[var19]) != 0) {
                                                    if (var21.field2731 == 16) {
                                                        var2.field1324 = 3;
                                                        var2.field1337 = class165.field2340[var19];
                                                        var2.field1325 = 3 - var2.field1337;
                                                    } else if (var21.field2731 == 32) {
                                                        var2.field1324 = 6;
                                                        var2.field1337 = class147.field2015[var19];
                                                        var2.field1325 = 6 - var2.field1337;
                                                    } else if (var21.field2731 == 64) {
                                                        var2.field1324 = 12;
                                                        var2.field1337 = class20.field336[var19];
                                                        var2.field1325 = 12 - var2.field1337;
                                                    } else {
                                                        var2.field1324 = 9;
                                                        var2.field1337 = class282.field4524[var19];
                                                        var2.field1325 = 9 - var2.field1337;
                                                    }
                                                } else {
                                                    var2.field1324 = 0;
                                                }
                                                if ((var21.field2731 & var20) != 0 && !class148.method925(var6, var3, var4, var21.field2731)) {
                                                    var21.field2735.method11(0, class276.field4383, class78.field1089, class26.field419, class248.field3885, var21.field2736 - class272.field4343, var21.field2740 - class191.field2892, var21.field2732 - class107.field1525, var21.field2737, var5, (class220) null);
                                                }
                                                if ((var21.field2734 & var20) != 0 && !class148.method925(var6, var3, var4, var21.field2734)) {
                                                    var21.field2729.method11(0, class276.field4383, class78.field1089, class26.field419, class248.field3885, var21.field2736 - class272.field4343, var21.field2740 - class191.field2892, var21.field2732 - class107.field1525, var21.field2737, var5, (class220) null);
                                                }
                                            }
                                            if (var22 != null && !class50.method308(var6, var3, var4, var22.field1047.method9())) {
                                                if ((var22.field1053 & var20) != 0) {
                                                    var22.field1047.method11(0, class276.field4383, class78.field1089, class26.field419, class248.field3885, var22.field1048 - class272.field4343 + var22.field1052, var22.field1058 - class191.field2892, var22.field1051 - class107.field1525 + var22.field1049, var22.field1055, var5, (class220) null);
                                                } else if (var22.field1053 == 256) {
                                                    int var23 = var22.field1048 - class272.field4343;
                                                    int var24 = var22.field1058 - class191.field2892;
                                                    int var25 = var22.field1051 - class107.field1525;
                                                    int var26 = var22.field1046;
                                                    int var27;
                                                    if (var26 != 1 && var26 != 2) {
                                                        var27 = var23;
                                                    } else {
                                                        var27 = -var23;
                                                    }
                                                    int var28;
                                                    if (var26 != 2 && var26 != 3) {
                                                        var28 = var25;
                                                    } else {
                                                        var28 = -var25;
                                                    }
                                                    if (var28 < var27) {
                                                        var22.field1047.method11(0, class276.field4383, class78.field1089, class26.field419, class248.field3885, var22.field1052 + var23, var24, var22.field1049 + var25, var22.field1055, var5, (class220) null);
                                                    } else if (var22.field1057 != null) {
                                                        var22.field1057.method11(0, class276.field4383, class78.field1089, class26.field419, class248.field3885, var23, var24, var25, var22.field1055, var5, (class220) null);
                                                    }
                                                }
                                            }
                                            if (var17) {
                                                class308 var29 = var2.field1323;
                                                if (var29 != null && (var29.field4950 & 2147483648L) == 0L) {
                                                    var29.field4953.method11(0, class276.field4383, class78.field1089, class26.field419, class248.field3885, var29.field4956 - class272.field4343, var29.field4945 - class191.field2892, var29.field4946 - class107.field1525, var29.field4950, var5, (class220) null);
                                                }
                                                class115 var30 = var2.field1332;
                                                if (var30 != null && var30.field1661 == 0) {
                                                    if (var30.field1651 != null) {
                                                        var30.field1651.method11(0, class276.field4383, class78.field1089, class26.field419, class248.field3885, var30.field1658 - class272.field4343, var30.field1656 - class191.field2892, var30.field1664 - class107.field1525, var30.field1659, var5, (class220) null);
                                                    }
                                                    if (var30.field1665 != null) {
                                                        var30.field1665.method11(0, class276.field4383, class78.field1089, class26.field419, class248.field3885, var30.field1658 - class272.field4343, var30.field1656 - class191.field2892, var30.field1664 - class107.field1525, var30.field1659, var5, (class220) null);
                                                    }
                                                    if (var30.field1654 != null) {
                                                        var30.field1654.method11(0, class276.field4383, class78.field1089, class26.field419, class248.field3885, var30.field1658 - class272.field4343, var30.field1656 - class191.field2892, var30.field1664 - class107.field1525, var30.field1659, var5, (class220) null);
                                                    }
                                                }
                                            }
                                            int var31 = var2.field1336;
                                            if (var31 != 0) {
                                                if (var3 < class231.field3613 && (var31 & 4) != 0) {
                                                    class91 var32 = var7[var3 + 1][var4];
                                                    if (var32 != null && var32.field1328) {
                                                        class126.field1773.method370((byte) -22, var32);
                                                    }
                                                }
                                                if (var4 < class216.field3312 && (var31 & 2) != 0) {
                                                    class91 var33 = var7[var3][var4 + 1];
                                                    if (var33 != null && var33.field1328) {
                                                        class126.field1773.method370((byte) -22, var33);
                                                    }
                                                }
                                                if (var3 > class231.field3613 && (var31 & 1) != 0) {
                                                    class91 var34 = var7[var3 - 1][var4];
                                                    if (var34 != null && var34.field1328) {
                                                        class126.field1773.method370((byte) -22, var34);
                                                    }
                                                }
                                                if (var4 > class216.field3312 && (var31 & 8) != 0) {
                                                    class91 var35 = var7[var3][var4 - 1];
                                                    if (var35 != null && var35.field1328) {
                                                        class126.field1773.method370((byte) -22, var35);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field1324 != 0) {
                                            boolean var36 = true;
                                            for (int var37 = 0; var37 < var2.field1343; ++var37) {
                                                if (class2.field14 != var2.field1339[var37].field2223 && (var2.field1342[var37] & var2.field1324) == var2.field1337) {
                                                    var36 = false;
                                                    break;
                                                }
                                            }
                                            if (var36) {
                                                class180 var38 = var2.field1334;
                                                if (!class148.method925(var6, var3, var4, var38.field2731)) {
                                                    var38.field2735.method11(0, class276.field4383, class78.field1089, class26.field419, class248.field3885, var38.field2736 - class272.field4343, var38.field2740 - class191.field2892, var38.field2732 - class107.field1525, var38.field2737, var5, (class220) null);
                                                }
                                                var2.field1324 = 0;
                                            }
                                        }
                                        if (!var2.field1330) {
                                            break;
                                        }
                                        try {
                                            int var39 = var2.field1343;
                                            var2.field1330 = false;
                                            int var40 = 0;
                                            label588: for (int var41 = 0; var41 < var39; ++var41) {
                                                class160 var42 = var2.field1339[var41];
                                                if (class2.field14 != var42.field2223) {
                                                    for (int var43 = var42.field2234; var43 <= var42.field2224; ++var43) {
                                                        for (int var44 = var42.field2229; var44 <= var42.field2228; ++var44) {
                                                            class91 var45 = var7[var43][var44];
                                                            if (var45.field1344) {
                                                                var2.field1330 = true;
                                                                continue label588;
                                                            }
                                                            if (var45.field1324 != 0) {
                                                                int var46 = 0;
                                                                if (var43 > var42.field2234) {
                                                                    ++var46;
                                                                }
                                                                if (var43 < var42.field2224) {
                                                                    var46 += 4;
                                                                }
                                                                if (var44 > var42.field2229) {
                                                                    var46 += 8;
                                                                }
                                                                if (var44 < var42.field2228) {
                                                                    var46 += 2;
                                                                }
                                                                if ((var46 & var45.field1324) == var2.field1325) {
                                                                    var2.field1330 = true;
                                                                    continue label588;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class120.field1713[var40++] = var42;
                                                    int var47 = class231.field3613 - var42.field2234;
                                                    int var48 = var42.field2224 - class231.field3613;
                                                    if (var48 > var47) {
                                                        var47 = var48;
                                                    }
                                                    int var49 = class216.field3312 - var42.field2229;
                                                    int var50 = var42.field2228 - class216.field3312;
                                                    if (var50 > var49) {
                                                        var42.field2231 = var47 + var50;
                                                    } else {
                                                        var42.field2231 = var47 + var49;
                                                    }
                                                }
                                            }
                                            while (var40 > 0) {
                                                int var51 = -50;
                                                int var52 = -1;
                                                for (int var53 = 0; var53 < var40; ++var53) {
                                                    class160 var54 = class120.field1713[var53];
                                                    if (class2.field14 != var54.field2223) {
                                                        if (var54.field2231 > var51) {
                                                            var51 = var54.field2231;
                                                            var52 = var53;
                                                        } else if (var54.field2231 == var51) {
                                                            int var55 = var54.field2226 - class272.field4343;
                                                            int var56 = var54.field2227 - class107.field1525;
                                                            int var57 = class120.field1713[var52].field2226 - class272.field4343;
                                                            int var58 = class120.field1713[var52].field2227 - class107.field1525;
                                                            if (var55 * var55 + var56 * var56 > var57 * var57 + var58 * var58) {
                                                                var52 = var53;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var52 == -1) {
                                                    break;
                                                }
                                                class160 var59 = class120.field1713[var52];
                                                var59.field2223 = class2.field14;
                                                if (!class75.method495(var6, var59.field2234, var59.field2224, var59.field2229, var59.field2228, var59.field2230.method9())) {
                                                    var59.field2230.method11(var59.field2222, class276.field4383, class78.field1089, class26.field419, class248.field3885, var59.field2226 - class272.field4343, var59.field2233 - class191.field2892, var59.field2227 - class107.field1525, var59.field2225, var5, (class220) null);
                                                }
                                                for (int var60 = var59.field2234; var60 <= var59.field2224; ++var60) {
                                                    for (int var61 = var59.field2229; var61 <= var59.field2228; ++var61) {
                                                        class91 var62 = var7[var60][var61];
                                                        if (var62.field1324 != 0) {
                                                            class126.field1773.method370((byte) -22, var62);
                                                        } else if ((var3 != var60 || var4 != var61) && var62.field1328) {
                                                            class126.field1773.method370((byte) -22, var62);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field1330) {
                                                break;
                                            }
                                        } catch (Exception var98) {
                                            var2.field1330 = false;
                                            break;
                                        }
                                    }
                                    if (var2.field1335 != null) {
                                        int var63 = class220.field3400 + class118.field1702;
                                        int var64 = class220.field3396 + class118.field1705;
                                        class116 var65 = var2.field1335.field3659;
                                        for (class116 var66 = var65.field1679; var65 != var66; var66 = var66.field1679) {
                                            class130 var67 = (class130) var66;
                                            if (var67.field1809 != null && !var67.field1809.field1973.field3413) {
                                                if ((byte) ((int) (var67.field1809.field1973.field3402 & 255L)) != var2.field1331) {
                                                    var2.field1335 = null;
                                                    break;
                                                }
                                                int var68 = (var67.field1813 >> 12) - class272.field4343;
                                                int var69 = (var67.field1817 >> 12) - class191.field2892;
                                                int var70 = (var67.field1805 >> 12) - class107.field1525;
                                                int var71 = class26.field419 * var70 + class248.field3885 * var68 >> 16;
                                                int var72 = class248.field3885 * var70 - class26.field419 * var68 >> 16;
                                                int var74 = class78.field1089 * var69 - class276.field4383 * var72 >> 16;
                                                int var75 = class78.field1089 * var72 + class276.field4383 * var69 >> 16;
                                                if (var75 >= 50) {
                                                    int var77 = (var71 << 9) / var75 + var63;
                                                    int var78 = (var74 << 9) / var75 + var64;
                                                    int var79 = var75 * 400;
                                                    if (var79 == 0) {
                                                        var79 = 1;
                                                    }
                                                    class266.method1739(var77, var78, (var67.field1809.field2004.field3991 << 16) / var79, var67.field1814, var67.field1814 >> 24 & 255);
                                                }
                                            }
                                        }
                                    }
                                } while (!var2.field1328);
                            } while (var2.field1324 != 0);
                            if (var3 > class231.field3613 || var3 <= class79.field1095) {
                                break;
                            }
                            var80 = var7[var3 - 1][var4];
                        } while (var80 != null && var80.field1328);
                        if (var3 < class231.field3613 || var3 >= class312.field5018 - 1) {
                            break;
                        }
                        var81 = var7[var3 + 1][var4];
                    } while (var81 != null && var81.field1328);
                    if (var4 > class216.field3312 || var4 <= class85.field1207) {
                        break;
                    }
                    var82 = var7[var3][var4 - 1];
                } while (var82 != null && var82.field1328);
                if (var4 < class216.field3312 || var4 >= class248.field3884 - 1) {
                    break;
                }
                var83 = var7[var3][var4 + 1];
            } while (var83 != null && var83.field1328);
            var2.field1328 = false;
            --class235.field3669;
            class115 var84 = var2.field1332;
            if (var84 != null && var84.field1661 != 0) {
                if (var84.field1651 != null) {
                    var84.field1651.method11(0, class276.field4383, class78.field1089, class26.field419, class248.field3885, var84.field1658 - class272.field4343, var84.field1656 - class191.field2892 - var84.field1661, var84.field1664 - class107.field1525, var84.field1659, var5, (class220) null);
                }
                if (var84.field1665 != null) {
                    var84.field1665.method11(0, class276.field4383, class78.field1089, class26.field419, class248.field3885, var84.field1658 - class272.field4343, var84.field1656 - class191.field2892 - var84.field1661, var84.field1664 - class107.field1525, var84.field1659, var5, (class220) null);
                }
                if (var84.field1654 != null) {
                    var84.field1654.method11(0, class276.field4383, class78.field1089, class26.field419, class248.field3885, var84.field1658 - class272.field4343, var84.field1656 - class191.field2892 - var84.field1661, var84.field1664 - class107.field1525, var84.field1659, var5, (class220) null);
                }
            }
            if (var2.field1345 != 0) {
                class75 var85 = var2.field1329;
                if (var85 != null && !class50.method308(var6, var3, var4, var85.field1047.method9())) {
                    if ((var85.field1053 & var2.field1345) != 0) {
                        var85.field1047.method11(0, class276.field4383, class78.field1089, class26.field419, class248.field3885, var85.field1048 - class272.field4343 + var85.field1052, var85.field1058 - class191.field2892, var85.field1051 - class107.field1525 + var85.field1049, var85.field1055, var5, (class220) null);
                    } else if (var85.field1053 == 256) {
                        int var86 = var85.field1048 - class272.field4343;
                        int var87 = var85.field1058 - class191.field2892;
                        int var88 = var85.field1051 - class107.field1525;
                        int var89 = var85.field1046;
                        int var90;
                        if (var89 != 1 && var89 != 2) {
                            var90 = var86;
                        } else {
                            var90 = -var86;
                        }
                        int var91;
                        if (var89 != 2 && var89 != 3) {
                            var91 = var88;
                        } else {
                            var91 = -var88;
                        }
                        if (var91 >= var90) {
                            var85.field1047.method11(0, class276.field4383, class78.field1089, class26.field419, class248.field3885, var85.field1052 + var86, var87, var85.field1049 + var88, var85.field1055, var5, (class220) null);
                        } else if (var85.field1057 != null) {
                            var85.field1057.method11(0, class276.field4383, class78.field1089, class26.field419, class248.field3885, var86, var87, var88, var85.field1055, var5, (class220) null);
                        }
                    }
                }
                class180 var92 = var2.field1334;
                if (var92 != null) {
                    if ((var92.field2734 & var2.field1345) != 0 && !class148.method925(var6, var3, var4, var92.field2734)) {
                        var92.field2729.method11(0, class276.field4383, class78.field1089, class26.field419, class248.field3885, var92.field2736 - class272.field4343, var92.field2740 - class191.field2892, var92.field2732 - class107.field1525, var92.field2737, var5, (class220) null);
                    }
                    if ((var92.field2731 & var2.field1345) != 0 && !class148.method925(var6, var3, var4, var92.field2731)) {
                        var92.field2735.method11(0, class276.field4383, class78.field1089, class26.field419, class248.field3885, var92.field2736 - class272.field4343, var92.field2740 - class191.field2892, var92.field2732 - class107.field1525, var92.field2737, var5, (class220) null);
                    }
                }
            }
            if (var5 < class150.field2077 - 1) {
                class91 var93 = class246.field3856[var5 + 1][var3][var4];
                if (var93 != null && var93.field1328) {
                    class126.field1773.method370((byte) -22, var93);
                }
            }
            if (var3 < class231.field3613) {
                class91 var94 = var7[var3 + 1][var4];
                if (var94 != null && var94.field1328) {
                    class126.field1773.method370((byte) -22, var94);
                }
            }
            if (var4 < class216.field3312) {
                class91 var95 = var7[var3][var4 + 1];
                if (var95 != null && var95.field1328) {
                    class126.field1773.method370((byte) -22, var95);
                }
            }
            if (var3 > class231.field3613) {
                class91 var96 = var7[var3 - 1][var4];
                if (var96 != null && var96.field1328) {
                    class126.field1773.method370((byte) -22, var96);
                }
            }
            if (var4 > class216.field3312) {
                class91 var97 = var7[var3][var4 - 1];
                if (var97 != null && var97.field1328) {
                    class126.field1773.method370((byte) -22, var97);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ZJ)V")
    public static final void method2008(boolean arg0, long arg1) {
        ++field4767;
        int var3 = class249.field3894;
        if (!class78.field1085) {
            class123.field1743 += (float) arg1 * class228.field3571 / 40.0F;
            class160.field2239 += (float) arg1 * class254.field3960 / 40.0F;
        }
        if (class21.field341 != var3) {
            int var4 = -class21.field341 + var3;
            int var5 = (int) ((long) var4 * arg1 / 320L);
            if (var4 > 0) {
                if (~var5 == -1) {
                    var5 = 1;
                } else if (~var5 < ~var4) {
                    var5 = var4;
                }
            } else if (var5 != 0) {
                if (~var4 < ~var5) {
                    var5 = var4;
                }
            } else {
                var5 = -1;
            }
            class21.field341 += var5;
        }
        if (arg0) {
            int var6 = class50.field711;
            if (class250.field3906 != var6) {
                int var7 = var6 - class250.field3906;
                int var8 = (int) ((long) var7 * arg1 / 320L);
                if (var7 <= 0) {
                    if (~var8 != -1) {
                        if (~var7 < ~var8) {
                            var8 = var7;
                        }
                    } else {
                        var8 = -1;
                    }
                } else if (var8 != 0) {
                    if (var7 < var8) {
                        var8 = var7;
                    }
                } else {
                    var8 = 1;
                }
                class250.field3906 += var8;
            }
            class17.method115(1);
        }
    }

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "(I)V")
    private final void method2009(int arg0) {
        this.field4771 = new int[this.field4764 - -1];
        ++field4769;
        this.field4763 = new int[this.field4764 + 1];
        int var2 = 4096 / this.field4764;
        int var3 = 0;
        int var4 = this.field4774 * var2 >> 12;
        for (int var5 = 0; this.field4764 > var5; ++var5) {
            this.field4771[var5] = var3;
            this.field4763[var5] = var3 + var4;
            var3 += var2;
        }
        this.field4771[this.field4764] = 4096;
        if (arg0 != -1222433268) {
            this.method12((byte) -47);
        }
        this.field4763[this.field4764] = this.field4763[0] + 4096;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IZII)I")
    public static final int method2010(int arg0, boolean arg1, int arg2, int arg3) {
        ++field4765;
        class205 var4 = (class205) class278.field4412.method1453(true, (long) arg3);
        if (var4 == null) {
            return 0;
        } else {
            int var5 = 0;
            for (int var6 = arg0; var6 < var4.field3069.length; ++var6) {
                if (~var4.field3069[var6] <= -1 && ~class216.field3308 < ~var4.field3069[var6]) {
                    class10 var7 = class281.method1822((byte) -128, var4.field3069[var6]);
                    if (var7.field160 != null) {
                        class313 var8 = (class313) var7.field160.method1453(true, (long) arg2);
                        if (var8 != null) {
                            if (!arg1) {
                                var5 += var8.field5027;
                            } else {
                                var5 += var4.field3061[var6] * var8.field5027;
                            }
                        }
                    }
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lbj;II)V")
    public final void method13(class215 arg0, int arg1, int arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    this.field4770 = arg0.method1374((byte) -60);
                }
            } else {
                this.field4774 = arg0.method1379(-95);
            }
        } else {
            this.field4764 = arg0.method1374((byte) -60);
        }
        if (arg2 != 12953) {
            this.method13((class215) null, -8, -111);
        }
        ++field4768;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IZ)[I")
    public final int[] method16(int arg0, boolean arg1) {
        ++field4773;
        int[] var3 = super.field1630.method302(arg0, -118);
        if (arg1) {
            this.field4774 = -33;
        }
        if (super.field1630.field710) {
            int var4 = class159.field2209[arg0];
            if (~this.field4770 != -1) {
                for (int var5 = 0; ~class145.field2009 < ~var5; ++var5) {
                    short var6 = 0;
                    int var7 = 0;
                    int var8 = class99.field1434[var5];
                    int var9 = this.field4770;
                    if (~var9 != -2) {
                        if (~var9 != -3) {
                            if (var9 == 3) {
                                var7 = 2048 - -(-var4 + var8 >> 1);
                            }
                        } else {
                            var7 = (var4 - 4096 + var8 >> 1) + 2048;
                        }
                    } else {
                        var7 = var8;
                    }
                    for (int var10 = 0; ~this.field4764 < ~var10; ++var10) {
                        if (this.field4771[var10] <= var7 && ~var7 > ~this.field4771[var10 + 1]) {
                            if (~var7 > ~this.field4763[var10]) {
                                var6 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var6;
                }
            } else {
                short var11 = 0;
                for (int var12 = 0; ~var12 > ~this.field4764; ++var12) {
                    if (~this.field4771[var12] >= ~var4 && var4 < this.field4771[var12 - -1]) {
                        if (this.field4763[var12] > var4) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class285.method1877(var3, 0, class145.field2009, var11);
            }
        }
        return var3;
    }
}
