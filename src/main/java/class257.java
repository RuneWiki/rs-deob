import java.io.IOException;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class257 {

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "[I")
    public static int[] field4506 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2 };

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "Lr;")
    private static class66 field4509 = class93.method641(43, "shake:");

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "Lr;")
    public static class66 field4512 = field4509;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "[I")
    public static int[] field4508 = new int[64];

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "Lr;")
    public static class66 field4515 = field4509;

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field4517 = new CRC32();

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "Ltg;")
    public static class215 field4519 = new class215(4096);

    @OriginalMember(owner = "client!tb", name = "p", descriptor = "[I")
    public static int[] field4521 = new int[50];

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
    public static int field4507;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
    public static int field4510;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "I")
    public static int field4511;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "I")
    public static int field4513;

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "I")
    public static int field4514;

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "I")
    public static int field4516;

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "I")
    public static int field4518;

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "I")
    public static int field4520;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "([BIII)Z")
    public static final boolean method1720(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg1 != -32692) {
            field4521 = null;
        }
        field4510++;
        boolean var4 = true;
        class249 var5 = new class249(arg0);
        int var6 = -1;
        label60: while (true) {
            int var7 = var5.method1664(true);
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.method1639(255);
                    if (var11 == 0) {
                        continue label60;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = (var8 & 0xFE6) >> 6;
                    int var14 = var12 + arg2;
                    int var15 = var13 + arg3;
                    int var16 = var5.method1677(-6677) >> 2;
                    if (var15 > 0 && var14 > 0 && var15 < 103 && var14 < 103) {
                        class231 var17 = class52.method359(arg1 + 32781, var6);
                        if (var16 != 22 || class64.field1265 || var17.field4016 != 0 || var17.field4055 == 1 || var17.field4037) {
                            if (!var17.method1517(107)) {
                                var4 = false;
                                class63.field1248++;
                            }
                            var9 = true;
                        }
                    }
                }
                int var10 = var5.method1639(255);
                if (var10 == 0) {
                    break;
                }
                var5.method1677(-6677);
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZIIILcj;ZI)V")
    public static final void method1721(boolean arg0, int arg1, int arg2, int arg3, class28 arg4, boolean arg5, int arg6) {
        if (arg5) {
            method1725((byte) 81);
        }
        class54.field948 = arg3;
        class96.field1860 = arg2;
        class246.field4292 = arg1;
        class242.field4225 = arg0;
        class248.field4334 = arg6;
        class244.field4263 = arg4;
        field4516++;
        class73.field1453 = 1;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(III)V")
    public static final void method1722(int arg0, int arg1, int arg2) {
        field4511++;
        int[] var3 = new int[4];
        int[] var4 = new int[4];
        var3[0] = arg1;
        int var5 = 1;
        var4[0] = arg2;
        for (int var6 = 0; var6 < 4; var6++) {
            if (class135.field2504[var6] != arg1) {
                var3[var5] = class135.field2504[var6];
                var4[var5] = class222.field3790[var6];
                var5++;
            }
        }
        class222.field3790 = var4;
        if (arg0 <= 104) {
            method1723(39);
        }
        class135.field2504 = var3;
        class88.method619(class107.field2045.length - 1, -228, class107.field2045, 0);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)Z")
    public static final boolean method1723(int arg0) {
        field4514++;
        if (arg0 != 20778) {
            field4515 = null;
        }
        return class73.field1453 == 0 ? class7.field62.method309(-1) : true;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lcj;BLcj;)V")
    public static final void method1724(class28 arg0, byte arg1, class28 arg2) {
        field4507++;
        class97.field1909 = arg0;
        class238.field4137 = arg2;
        if (arg1 != 82) {
            field4519 = null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)V")
    public static void method1725(byte arg0) {
        field4512 = null;
        field4515 = null;
        if (arg0 > -8) {
            return;
        }
        field4508 = null;
        field4509 = null;
        field4521 = null;
        field4517 = null;
        field4506 = null;
        field4519 = null;
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)Z")
    public static final boolean method1726(int arg0) throws IOException {
        field4518++;
        if (class101.field1972 == null) {
            return false;
        }
        int var1 = class101.field1972.method1280((byte) 102);
        if (var1 == 0) {
            return false;
        }
        if (class129.field2400 == -1) {
            var1--;
            class101.field1972.method1274(arg0 ^ 0x66D8, 1, 0, class84.field1627.field4350);
            class84.field1627.field4335 = 0;
            class129.field2400 = class84.field1627.method577(255);
            class61.field1033 = class1.field13[class129.field2400];
        }
        if (arg0 != -26354) {
            field4512 = null;
        }
        if (class61.field1033 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class101.field1972.method1274(arg0 ^ 0xFFFF9954, 1, 0, class84.field1627.field4350);
            class61.field1033 = class84.field1627.field4350[0] & 0xFF;
            var1--;
        }
        if (class61.field1033 == -2) {
            if (var1 <= 1) {
                return false;
            }
            var1 -= 2;
            class101.field1972.method1274(117, 2, 0, class84.field1627.field4350);
            class84.field1627.field4335 = 0;
            class61.field1033 = class84.field1627.method1674(1355769544);
        }
        if (class61.field1033 > var1) {
            return false;
        }
        class84.field1627.field4335 = 0;
        class101.field1972.method1274(107, class61.field1033, 0, class84.field1627.field4350);
        class156.field2777 = 0;
        class184.field3212 = class77.field1527;
        class77.field1527 = class102.field1991;
        class102.field1991 = class129.field2400;
        if (class129.field2400 == 93) {
            int var2 = class84.field1627.method1674(1355769544);
            int var3 = class84.field1627.method1672((byte) -93);
            int var4 = class84.field1627.method1652(arg0 + 20826);
            class75 var5 = (class75) class230.field3981.method1381((long) var4, 103);
            if (var5 != null) {
                class150.method1022(var5, true, var5.field1492 != var2);
            }
            class173.method1174(var3, var2, -58, var4);
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 217) {
            class99.method684(0);
            int var6 = class84.field1627.method1688(123);
            int var7 = class84.field1627.method1659(false);
            int var8 = class84.field1627.method1688(38);
            class52.field928[var8] = var7;
            class98.field1919[var8] = var6;
            class121.field2290[var8] = 1;
            for (int var9 = 0; var9 < 98; var9++) {
                if (var7 >= class196.field3380[var9]) {
                    class121.field2290[var8] = var9 + 2;
                }
            }
            class31.field470[class115.method767(31, class98.field1915++)] = var8;
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 57) {
            int var10 = class84.field1627.method1676(91);
            int var11 = class84.field1627.method1672((byte) -124);
            int var12 = class84.field1627.method1672((byte) -102);
            class196.field3401 = var10 >> 1;
            class207.field3595.method731(var11, (byte) -68, var12, (var10 & 0x1) == 1);
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 132) {
            class96.method659(class84.field1627.method1637(127), (byte) 125);
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 210) {
            if (class150.field2702 != -1) {
                class244.method1607(89, class150.field2702, 0);
            }
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 41) {
            int var13 = class84.field1627.method1655(101);
            int var14 = class84.field1627.method1642(-15046);
            class63 var15 = class54.method367(var13, (byte) -80);
            if (var15 != null && var15.field1219 == 0) {
                if ((var15.field1117 - var15.field1196) < var14) {
                    var14 = var15.field1117 - var15.field1196;
                }
                if (var14 < 0) {
                    var14 = 0;
                }
                if (var15.field1141 != var14) {
                    var15.field1141 = var14;
                    class215.method1385(var15, -124);
                }
            }
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 223) {
            int var16 = class84.field1627.method1674(1355769544);
            int var17 = class84.field1627.method1690((byte) -47);
            if (var17 == 65535) {
                var17 = -1;
            }
            int var18 = class84.field1627.method1667((byte) 121);
            if (var16 == 65535) {
                var16 = -1;
            }
            int var19 = class84.field1627.method1667((byte) 126);
            for (int var20 = var17; var20 <= var16; var20++) {
                long var21 = ((long) var18 << 32) + (long) var20;
                class80 var23 = class61.field1032.method1381(var21, -115);
                if (var23 != null) {
                    var23.method560(arg0 ^ 0x2260);
                }
                class61.field1032.method1380((byte) 120, new class49(var19), var21);
            }
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 115) {
            class63.field1240 = class84.field1627.method1677(-6677);
            class252.field4434 = class15.field199;
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 55) {
            class44.method318(class84.field1627, 24);
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 117) {
            int var24 = class61.field1033 + class84.field1627.field4335;
            int var25 = class84.field1627.method1674(1355769544);
            int var26 = class84.field1627.method1674(1355769544);
            if (class150.field2702 != var25) {
                class150.field2702 = var25;
                class127.method879(class150.field2702, (byte) 108);
                class253.method1701(false, 640);
                class181.method1206(-1, class150.field2702);
                for (int var27 = 0; var27 < 100; var27++) {
                    class255.field4485[var27] = true;
                }
            }
            while ((var26--) > 0) {
                int var36 = class84.field1627.method1652(-5528);
                int var37 = class84.field1627.method1674(arg0 + 1355795898);
                int var38 = class84.field1627.method1677(-6677);
                class75 var39 = (class75) class230.field3981.method1381((long) var36, 82);
                if (var39 != null && var39.field1492 != var37) {
                    class150.method1022(var39, true, true);
                    var39 = null;
                }
                if (var39 == null) {
                    var39 = class173.method1174(var38, var37, arg0 ^ 0xFFFF9973, var36);
                }
                var39.field1497 = true;
            }
            for (class75 var28 = (class75) class230.field3981.method1382(-32642); var28 != null; var28 = (class75) class230.field3981.method1386((byte) -122)) {
                if (var28.field1497) {
                    var28.field1497 = false;
                } else {
                    class150.method1022(var28, true, true);
                }
            }
            class61.field1032.method1387(false);
            while (class84.field1627.field4335 < var24) {
                int var29 = class84.field1627.method1652(-5528);
                int var30 = class84.field1627.method1674(1355769544);
                int var31 = class84.field1627.method1674(1355769544);
                int var32 = class84.field1627.method1652(-5528);
                for (int var33 = var30; var33 <= var31; var33++) {
                    long var34 = ((long) var29 << 32) + (long) var33;
                    class61.field1032.method1380((byte) -27, new class49(var32), var34);
                }
            }
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 64) {
            int var40 = class84.field1627.method1690((byte) -47);
            if (var40 == 65535) {
                var40 = -1;
            }
            int var41 = class84.field1627.method1655(arg0 + 26479);
            class63 var42 = class54.method367(var41, (byte) -80);
            if (var42.field1188 != 1 || var42.field1126 != var40) {
                var42.field1126 = var40;
                var42.field1188 = 1;
                class215.method1385(var42, -116);
            }
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 240) {
            class124.field2338 = class61.field1033 / 8;
            for (int var43 = 0; var43 < class124.field2338; var43++) {
                class247.field4306[var43] = class84.field1627.method1668(class109.method741(arg0, -26299));
                class17.field245[var43] = class87.method616(class247.field4306[var43], -1);
            }
            class252.field4434 = class15.field199;
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 154) {
            long var44 = class84.field1627.method1668(arg0 + 26465);
            int var46 = class84.field1627.method1674(1355769544);
            int var47 = class84.field1627.method1677(-6677);
            class66 var48 = class85.field1679;
            if (var46 > 0) {
                var48 = class84.field1627.method1637(127);
            }
            boolean var49 = true;
            if (var44 < 0L) {
                var49 = false;
                var44 &= Long.MAX_VALUE;
            }
            class66 var50 = class87.method616(var44, arg0 ^ 0x66F1).method467(12688);
            for (int var51 = 0; var51 < class173.field3058; var51++) {
                if (class176.field3104[var51] == var44) {
                    if (class245.field4279[var51] != var46) {
                        class245.field4279[var51] = var46;
                        if (var46 > 0) {
                            class234.method1533(class85.field1679, 127, class212.method1372(arg0 + 26356, new class66[] { var50, class100.field1958 }), 5);
                        }
                        if (var46 == 0) {
                            class234.method1533(class85.field1679, -38, class212.method1372(arg0 + 26356, new class66[] { var50, class27.field350 }), 5);
                        }
                    }
                    class16.field202[var51] = var48;
                    var50 = null;
                    class17.field246[var51] = var47;
                    class223.field3805[var51] = var49;
                    break;
                }
            }
            if (var50 != null && class173.field3058 < 200) {
                class176.field3104[class173.field3058] = var44;
                class233.field4077[class173.field3058] = var50;
                class245.field4279[class173.field3058] = var46;
                class16.field202[class173.field3058] = var48;
                class17.field246[class173.field3058] = var47;
                class223.field3805[class173.field3058] = var49;
                class173.field3058++;
            }
            class252.field4434 = class15.field199;
            int var52 = class173.field3058;
            boolean var53 = false;
            while (var52 > 0) {
                boolean var54 = true;
                var52--;
                for (int var55 = 0; var55 < var52; var55++) {
                    if (class245.field4279[var55] != class61.field1028 && class245.field4279[var55 + 1] == class61.field1028 || class245.field4279[var55] == 0 && class245.field4279[var55 + 1] != 0) {
                        int var56 = class245.field4279[var55];
                        var54 = false;
                        class245.field4279[var55] = class245.field4279[var55 + 1];
                        class245.field4279[var55 + 1] = var56;
                        class66 var57 = class16.field202[var55];
                        class16.field202[var55] = class16.field202[var55 + 1];
                        class16.field202[var55 + 1] = var57;
                        class66 var58 = class233.field4077[var55];
                        class233.field4077[var55] = class233.field4077[var55 + 1];
                        class233.field4077[var55 + 1] = var58;
                        long var59 = class176.field3104[var55];
                        class176.field3104[var55] = class176.field3104[var55 + 1];
                        class176.field3104[var55 + 1] = var59;
                        int var61 = class17.field246[var55];
                        class17.field246[var55] = class17.field246[var55 + 1];
                        class17.field246[var55 + 1] = var61;
                        boolean var62 = class223.field3805[var55];
                        class223.field3805[var55] = class223.field3805[var55 + 1];
                        class223.field3805[var55 + 1] = var62;
                    }
                }
                if (var54) {
                    break;
                }
            }
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 229) {
            long var63 = class84.field1627.method1668(61);
            class84.field1627.method1682(3390);
            long var65 = class84.field1627.method1668(105);
            long var67 = (long) class84.field1627.method1674(1355769544);
            boolean var69 = false;
            long var70 = (long) class84.field1627.method1648((byte) 87);
            long var72 = (var67 << 32) + var70;
            int var74 = class84.field1627.method1677(arg0 + 19677);
            int var75 = 0;
            label1109: while (true) {
                if (var75 >= 100) {
                    if (var74 <= 1) {
                        if (class171.field3035 == 1 || class98.field1923 == 1) {
                            var69 = true;
                        } else {
                            for (int var76 = 0; var76 < class124.field2338; var76++) {
                                if (class247.field4306[var76] == var63) {
                                    var69 = true;
                                    break label1109;
                                }
                            }
                        }
                    }
                    break;
                }
                if (class11.field133[var75] == var72) {
                    var69 = true;
                    break;
                }
                var75++;
            }
            if (!var69 && class231.field4044 == 0) {
                class11.field133[class196.field3390] = var72;
                class196.field3390 = (class196.field3390 + 1) % 100;
                class66 var77 = class39.method212(class56.method369(arg0 + 26266, class84.field1627).method486(2));
                if (var74 == 2 || var74 == 3) {
                    class259.method1768(false, class212.method1372(2, new class66[] { class59.field997, class87.method616(var63, arg0 ^ 0x66F1).method467(12688) }), var77, class87.method616(var65, arg0 + 26353).method467(12688), 9);
                } else if (var74 == 1) {
                    class259.method1768(false, class212.method1372(2, new class66[] { class69.field1388, class87.method616(var63, -1).method467(12688) }), var77, class87.method616(var65, -1).method467(arg0 ^ 0xFFFFA89E), 9);
                } else {
                    class259.method1768(false, class87.method616(var63, -1).method467(12688), var77, class87.method616(var65, -1).method467(12688), 9);
                }
            }
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 124) {
            class43.field730 = class84.field1627.method1688(-102);
            class200.field3454 = class84.field1627.method1676(126);
            while (class61.field1033 > class84.field1627.field4335) {
                class129.field2400 = class84.field1627.method1677(arg0 ^ 0x7CE5);
                class105.method725(-1);
            }
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 29 || class129.field2400 == 232 || class129.field2400 == 50 || class129.field2400 == 21 || class129.field2400 == 75 || class129.field2400 == 248 || class129.field2400 == 112 || class129.field2400 == 201 || class129.field2400 == 25 || class129.field2400 == 110 || class129.field2400 == 196 || class129.field2400 == 30) {
            class105.method725(-1);
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 121) {
            long var78 = class84.field1627.method1668(46);
            int var80 = class84.field1627.method1674(1355769544);
            byte var81 = class84.field1627.method1682(arg0 ^ 0xFFFF9430);
            boolean var82 = false;
            if ((var78 & Long.MIN_VALUE) != 0L) {
                var82 = true;
            }
            if (var82) {
                if (class41.field677 == 0) {
                    class129.field2400 = -1;
                    return true;
                }
                long var83 = var78 & Long.MAX_VALUE;
                boolean var85 = false;
                int var86;
                for (var86 = 0; class41.field677 > var86 && (class212.field3648[var86].field1560 != var83 || class212.field3648[var86].field954 != var80); var86++) {
                }
                if (var86 < class41.field677) {
                    while (var86 < class41.field677 - 1) {
                        class212.field3648[var86] = class212.field3648[var86 + 1];
                        var86++;
                    }
                    class41.field677--;
                    class212.field3648[class41.field677] = null;
                }
            } else {
                class66 var87 = class84.field1627.method1637(127);
                class56 var88 = new class56();
                var88.field1560 = var78;
                var88.field960 = class87.method616(var88.field1560, arg0 + 26353);
                var88.field954 = var80;
                var88.field963 = var87;
                var88.field962 = var81;
                int var89;
                for (var89 = class41.field677 - 1; var89 >= 0; var89--) {
                    int var90 = class212.field3648[var89].field960.method484(false, var88.field960);
                    if (var90 == 0) {
                        class212.field3648[var89].field954 = var80;
                        class212.field3648[var89].field962 = var81;
                        class212.field3648[var89].field963 = var87;
                        if (class27.field363 == var78) {
                            class80.field1567 = var81;
                        }
                        class129.field2400 = -1;
                        class85.field1670 = class15.field199;
                        return true;
                    }
                    if (var90 < 0) {
                        break;
                    }
                }
                if (class41.field677 >= class212.field3648.length) {
                    class129.field2400 = -1;
                    return true;
                }
                for (int var91 = class41.field677 - 1; var91 > var89; var91--) {
                    class212.field3648[var91 + 1] = class212.field3648[var91];
                }
                if (class41.field677 == 0) {
                    class212.field3648 = new class56[100];
                }
                class212.field3648[var89 + 1] = var88;
                if (class27.field363 == var78) {
                    class80.field1567 = var81;
                }
                class41.field677++;
            }
            class129.field2400 = -1;
            class85.field1670 = class15.field199;
            return true;
        } else if (class129.field2400 == 89) {
            long var92 = class84.field1627.method1668(81);
            class66 var94 = class39.method212(class56.method369(25, class84.field1627).method486(2));
            class234.method1533(class87.method616(var92, -1).method467(12688), -67, var94, 6);
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 142) {
            class187.method1235((byte) 95, false);
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 149) {
            long var95 = class84.field1627.method1668(arg0 + 26456);
            long var97 = (long) class84.field1627.method1674(1355769544);
            long var99 = (long) class84.field1627.method1648((byte) -69);
            long var101 = (var97 << 32) + var99;
            int var103 = class84.field1627.method1677(arg0 + 19677);
            boolean var104 = false;
            int var105 = class84.field1627.method1674(1355769544);
            int var106 = 0;
            label1171: while (true) {
                if (var106 >= 100) {
                    if (var103 <= 1) {
                        for (int var107 = 0; var107 < class124.field2338; var107++) {
                            if (class247.field4306[var107] == var95) {
                                var104 = true;
                                break label1171;
                            }
                        }
                    }
                    break;
                }
                if (class11.field133[var106] == var101) {
                    var104 = true;
                    break;
                }
                var106++;
            }
            if (!var104 && class231.field4044 == 0) {
                class11.field133[class196.field3390] = var101;
                class196.field3390 = (class196.field3390 + 1) % 100;
                class66 var108 = class143.method987(var105, (byte) 76).method271(-90, class84.field1627);
                if (var103 == 2) {
                    class171.method1165((class66) null, -19596, class212.method1372(2, new class66[] { class59.field997, class87.method616(var95, -1).method467(arg0 ^ -22370) }), var105, 18, var108);
                } else if (var103 == 1) {
                    class171.method1165((class66) null, -19596, class212.method1372(arg0 + 26356, new class66[] { class69.field1388, class87.method616(var95, arg0 + 26353).method467(12688) }), var105, 18, var108);
                } else {
                    class171.method1165((class66) null, -19596, class87.method616(var95, -1).method467(12688), var105, 18, var108);
                }
            }
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 186) {
            class165.field2981 = class84.field1627.method1677(-6677);
            class59.field1002 = class84.field1627.method1677(arg0 ^ 0x7CE5);
            class17.field231 = class84.field1627.method1677(arg0 + 19677);
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 195) {
            int var109 = class84.field1627.method1655(126);
            int var110 = (var109 & 0x32EDBABC) >> 28;
            int var111 = var109 >> 14 & 0x3FFF;
            int var112 = var109 & 0x3FFF;
            int var113 = class84.field1627.method1674(1355769544);
            if (var113 == 65535) {
                var113 = -1;
            }
            int var114 = class84.field1627.method1677(-6677);
            int var115 = var111 - class3.field39;
            int var116 = var114 & 0x3;
            int var117 = var114 >> 2;
            int var118 = var112 - class34.field512;
            int var119 = class209.field3616[var117];
            class155.method1056(var118, var117, var110, var116, var115, (byte) 126, var113, var119);
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 156) {
            int var120 = class84.field1627.method1667((byte) 88);
            int var121 = class84.field1627.method1642(arg0 ^ 0x5C34);
            int var122 = class84.field1627.method1674(arg0 ^ 0xAF30FFC6);
            class233.method1526(-31, var122);
            class208.method1353(var120, 93, var121);
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 101) {
            int var123 = class84.field1627.method1652(arg0 ^ 0x7366);
            class63 var124 = class54.method367(var123, (byte) -80);
            var124.field1188 = 3;
            var124.field1126 = class207.field3595.field811.method699(true);
            class215.method1385(var124, -128);
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 176) {
            long var125 = class84.field1627.method1668(87);
            class84.field1627.method1682(3390);
            long var127 = class84.field1627.method1668(72);
            long var129 = (long) class84.field1627.method1674(1355769544);
            long var131 = (long) class84.field1627.method1648((byte) -114);
            int var133 = class84.field1627.method1677(arg0 + 19677);
            int var134 = class84.field1627.method1674(1355769544);
            long var135 = (var129 << 32) + var131;
            boolean var137 = false;
            int var138 = 0;
            label1196: while (true) {
                if (var138 >= 100) {
                    if (var133 <= 1) {
                        for (int var139 = 0; var139 < class124.field2338; var139++) {
                            if (class247.field4306[var139] == var125) {
                                var137 = true;
                                break label1196;
                            }
                        }
                    }
                    break;
                }
                if (class11.field133[var138] == var135) {
                    var137 = true;
                    break;
                }
                var138++;
            }
            if (!var137 && class231.field4044 == 0) {
                class11.field133[class196.field3390] = var135;
                class196.field3390 = (class196.field3390 + 1) % 100;
                class66 var140 = class143.method987(var134, (byte) 101).method271(-37, class84.field1627);
                if (var133 == 2 || var133 == 3) {
                    class171.method1165(class87.method616(var127, -1).method467(12688), -19596, class212.method1372(2, new class66[] { class59.field997, class87.method616(var125, -1).method467(12688) }), var134, 20, var140);
                } else if (var133 == 1) {
                    class171.method1165(class87.method616(var127, arg0 + 26353).method467(arg0 + 39042), -19596, class212.method1372(2, new class66[] { class69.field1388, class87.method616(var125, -1).method467(12688) }), var134, 20, var140);
                } else {
                    class171.method1165(class87.method616(var127, -1).method467(12688), -19596, class87.method616(var125, -1).method467(12688), var134, 20, var140);
                }
            }
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 139) {
            class209.method1357(class95.field1835, class84.field1627, class61.field1033, (byte) 101);
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 12) {
            int var141 = class84.field1627.method1677(-6677);
            int var142 = class84.field1627.method1677(-6677);
            int var143 = class84.field1627.method1677(-6677);
            int var144 = class84.field1627.method1677(-6677);
            int var145 = class84.field1627.method1674(1355769544);
            class44.field774[var141] = true;
            class255.field4486[var141] = var142;
            class48.field870[var141] = var143;
            class223.field3799[var141] = var144;
            class8.field75[var141] = var145;
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 178) {
            long var146 = class84.field1627.method1668(arg0 + 26477);
            long var148 = (long) class84.field1627.method1674(1355769544);
            boolean var150 = false;
            long var151 = (long) class84.field1627.method1648((byte) -112);
            int var153 = class84.field1627.method1677(arg0 ^ 0x7CE5);
            long var154 = (var148 << 32) + var151;
            int var156 = 0;
            label1225: while (true) {
                if (var156 >= 100) {
                    if (var153 <= 1) {
                        if (class171.field3035 == 1 || class98.field1923 == 1) {
                            var150 = true;
                        } else {
                            for (int var157 = 0; var157 < class124.field2338; var157++) {
                                if (class247.field4306[var157] == var146) {
                                    var150 = true;
                                    break label1225;
                                }
                            }
                        }
                    }
                    break;
                }
                if (class11.field133[var156] == var154) {
                    var150 = true;
                    break;
                }
                var156++;
            }
            if (!var150 && class231.field4044 == 0) {
                class11.field133[class196.field3390] = var154;
                class196.field3390 = (class196.field3390 + 1) % 100;
                class66 var158 = class39.method212(class56.method369(27, class84.field1627).method486(2));
                if (var153 == 2 || var153 == 3) {
                    class234.method1533(class212.method1372(2, new class66[] { class59.field997, class87.method616(var146, -1).method467(12688) }), 126, var158, 7);
                } else if (var153 == 1) {
                    class234.method1533(class212.method1372(2, new class66[] { class69.field1388, class87.method616(var146, arg0 + 26353).method467(12688) }), 125, var158, 7);
                } else {
                    class234.method1533(class87.method616(var146, -1).method467(arg0 + 39042), arg0 ^ 0x668B, var158, 3);
                }
            }
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 179) {
            class66 var159 = class84.field1627.method1637(127);
            int var160 = class84.field1627.method1655(arg0 ^ 0xFFFF996C);
            class63 var161 = class54.method367(var160, (byte) -80);
            if (!var159.method463(var161.field1204, (byte) 116)) {
                var161.field1204 = var159;
                class215.method1385(var161, -115);
            }
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 100) {
            int var162 = class84.field1627.method1642(-15046);
            byte var163 = class84.field1627.method1646((byte) 46);
            class218.method1402(arg0 + 26474, var163, var162);
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 104) {
            class75.method535((byte) -127);
            class129.field2400 = -1;
            return false;
        } else if (class129.field2400 == 146) {
            int var164 = class84.field1627.method1690((byte) -47);
            if (var164 == 65535) {
                var164 = -1;
            }
            class97.method666(79, var164);
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 251) {
            int var165 = class84.field1627.method1690((byte) -47);
            int var166 = class84.field1627.method1657(false);
            if (var165 == 65535) {
                var165 = -1;
            }
            class208.method1351((byte) 106, var166, var165);
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 56) {
            class48.method340(-10937);
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 239) {
            int var167 = class84.field1627.method1674(1355769544);
            int var168 = class84.field1627.method1672((byte) -92);
            if (var168 == 2) {
                class44.method317(25);
            }
            class150.field2702 = var167;
            class127.method879(var167, (byte) 126);
            class253.method1701(false, 640);
            class181.method1206(arg0 ^ 0x66F1, class150.field2702);
            for (int var169 = 0; var169 < 100; var169++) {
                class255.field4485[var169] = true;
            }
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 135) {
            int var170 = class84.field1627.method1652(-5528);
            int var171 = class84.field1627.method1674(1355769544);
            class63 var172;
            if (var170 >= 0) {
                var172 = class54.method367(var170, (byte) -80);
            } else {
                var172 = null;
            }
            if (var170 < -70000) {
                var171 += 32768;
            }
            while (class84.field1627.field4335 < class61.field1033) {
                int var173 = class84.field1627.method1639(255);
                int var174 = class84.field1627.method1674(1355769544);
                int var175 = 0;
                if (var174 != 0) {
                    var175 = class84.field1627.method1677(-6677);
                    if (var175 == 255) {
                        var175 = class84.field1627.method1652(arg0 + 20826);
                    }
                }
                if (var172 != null && var173 >= 0 && var173 < var172.field1118.length) {
                    var172.field1118[var173] = var174;
                    var172.field1097[var173] = var175;
                }
                class167.method1140(var173, var175, (byte) -67, var171, var174 - 1);
            }
            if (var172 != null) {
                class215.method1385(var172, arg0 + 26234);
            }
            class99.method684(0);
            class21.field292[class115.method767(31, class237.field4124++)] = class115.method767(32767, var171);
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 120) {
            int var176 = class84.field1627.method1684(-22489);
            int var177 = class84.field1627.method1659(false);
            int var178 = class84.field1627.method1684(-22489);
            class63 var179 = class54.method367(var177, (byte) -80);
            var179.field1226 = var179.field1237 = var178;
            var179.field1143 = 0;
            var179.field1227 = 0;
            var179.field1138 = var179.field1133 = var176;
            class215.method1385(var179, arg0 + 26228);
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 234) {
            long var180 = class84.field1627.method1668(86);
            int var182 = class84.field1627.method1674(1355769544);
            class66 var183 = class143.method987(var182, (byte) 96).method271(114, class84.field1627);
            class171.method1165((class66) null, -19596, class87.method616(var180, -1).method467(12688), var182, 19, var183);
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 184) {
            int var184 = class84.field1627.method1652(-5528);
            int var185 = class84.field1627.method1690((byte) -47);
            int var186 = var185 & 0x1F;
            int var187 = (var185 & 0x7EBF) >> 10;
            int var188 = (var185 & 0x3FF) >> 5;
            int var189 = (var187 << 19) + (var186 << 3) + (var188 << 11);
            class63 var190 = class54.method367(var184, (byte) -80);
            if (var190.field1155 != var189) {
                var190.field1155 = var189;
                class215.method1385(var190, -123);
            }
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 137) {
            int var191 = class84.field1627.method1677(-6677);
            if (class84.field1627.method1677(-6677) == 0) {
                class251.field4418[var191] = new class129();
            } else {
                class84.field1627.field4335--;
                class251.field4418[var191] = new class129(class84.field1627);
            }
            class36.field538 = class15.field199;
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 249) {
            class43.field730 = class84.field1627.method1677(-6677);
            class200.field3454 = class84.field1627.method1677(-6677);
            for (int var192 = class200.field3454; var192 < (class200.field3454 + 8); var192++) {
                for (int var194 = class43.field730; var194 < (class43.field730 + 8); var194++) {
                    if (class63.field1249[class196.field3401][var192][var194] != null) {
                        class63.field1249[class196.field3401][var192][var194] = null;
                        class197.method1287(var192, (byte) -52, var194);
                    }
                }
            }
            for (class14 var193 = (class14) class180.field3146.method873((byte) 76); var193 != null; var193 = (class14) class180.field3146.method870((byte) -105)) {
                if (var193.field175 >= class200.field3454 && (class200.field3454 + 8) > var193.field175 && var193.field168 >= class43.field730 && class43.field730 + 8 > var193.field168 && class196.field3401 == var193.field173) {
                    var193.field179 = 0;
                }
            }
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 119) {
            int var195 = class84.field1627.method1674(1355769544);
            if (var195 == 65535) {
                var195 = -1;
            }
            int var196 = class84.field1627.method1677(-6677);
            int var197 = class84.field1627.method1674(arg0 ^ 0xAF30FFC6);
            class140.method969((byte) 122, var197, var196, var195);
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 170) {
            class66 var198 = class84.field1627.method1637(127);
            int var199 = class84.field1627.method1690((byte) -47);
            int var200 = class84.field1627.method1690((byte) -47);
            class233.method1526(-21, var199);
            class122.method830((byte) 120, var200, var198);
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 222) {
            class145.method993(false);
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 8) {
            class263.field4618 = class84.field1627.method1690((byte) -47) * 30;
            class26.field326 = class15.field199;
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 219) {
            int var201 = class84.field1627.method1655(19);
            class63 var202 = class54.method367(var201, (byte) -80);
            for (int var203 = 0; var203 < var202.field1118.length; var203++) {
                var202.field1118[var203] = -1;
                var202.field1118[var203] = 0;
            }
            class215.method1385(var202, arg0 + 26236);
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 172) {
            int var204 = class84.field1627.method1652(arg0 + 20826);
            class49.field885 = class95.field1835.method775(var204, arg0 + 26354);
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 82) {
            class85.field1670 = class15.field199;
            long var205 = class84.field1627.method1668(97);
            if (var205 == 0L) {
                class41.field677 = 0;
                class129.field2400 = -1;
                class212.field3648 = null;
                class44.field788 = null;
                class62.field1064 = null;
                return true;
            }
            long var207 = class84.field1627.method1668(100);
            class44.field788 = class87.method616(var207, arg0 + 26353);
            class62.field1064 = class87.method616(var205, arg0 + 26353);
            class224.field3847 = class84.field1627.method1682(3390);
            int var209 = class84.field1627.method1677(-6677);
            if (var209 == 255) {
                class129.field2400 = -1;
                return true;
            }
            class41.field677 = var209;
            class56[] var210 = new class56[100];
            for (int var211 = 0; var211 < class41.field677; var211++) {
                var210[var211] = new class56();
                var210[var211].field1560 = class84.field1627.method1668(98);
                var210[var211].field960 = class87.method616(var210[var211].field1560, -1);
                var210[var211].field954 = class84.field1627.method1674(1355769544);
                var210[var211].field962 = class84.field1627.method1682(3390);
                var210[var211].field963 = class84.field1627.method1637(arg0 ^ 0xFFFF9971);
                if (class27.field363 == var210[var211].field1560) {
                    class80.field1567 = var210[var211].field962;
                }
            }
            boolean var212 = false;
            int var213 = class41.field677;
            while (var213 > 0) {
                var213--;
                boolean var214 = true;
                for (int var215 = 0; var215 < var213; var215++) {
                    if (var210[var215].field960.method484(false, var210[var215 + 1].field960) > 0) {
                        class56 var216 = var210[var215];
                        var214 = false;
                        var210[var215] = var210[var215 + 1];
                        var210[var215 + 1] = var216;
                    }
                }
                if (var214) {
                    break;
                }
            }
            class212.field3648 = var210;
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 40) {
            int var217 = class84.field1627.method1674(arg0 ^ 0xAF30FFC6);
            int var218 = class84.field1627.method1636(108);
            class125.field2367 = var218;
            class259.field4562 = var217;
            class182.method1210((byte) -100);
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 37) {
            class99.method684(0);
            class81.field1587 = class84.field1627.method1684(-22489);
            class26.field326 = class15.field199;
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 59) {
            boolean var219 = class84.field1627.method1688(-107) == 1;
            int var220 = class84.field1627.method1655(16);
            class63 var221 = class54.method367(var220, (byte) -80);
            if (var221.field1087 != var219) {
                var221.field1087 = var219;
                class215.method1385(var221, -120);
            }
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 226) {
            class35.field517 = class84.field1627.method1677(-6677);
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 247) {
            int var222 = class84.field1627.method1642(arg0 ^ 0x5C34);
            int var223 = class84.field1627.method1688(arg0 ^ 0x66C4);
            int var224 = class84.field1627.method1690((byte) -47);
            class233.method1526(-119, var222);
            class208.method1353(var223, arg0 + 26475, var224);
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 177) {
            class43.field730 = class84.field1627.method1677(-6677);
            class200.field3454 = class84.field1627.method1676(59);
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 140) {
            int var225 = class84.field1627.method1674(arg0 ^ 0xAF30FFC6);
            int var226 = class84.field1627.method1652(-5528);
            int var227 = class84.field1627.method1636(-96);
            int var228 = class84.field1627.method1674(1355769544);
            if (var226 >> 30 != 0) {
                int var233 = var226 >> 28 & 0x3;
                int var234 = (var226 >> 14 & 0x3FFF) - class3.field39;
                int var235 = (var226 & 0x3FFF) - class34.field512;
                if (var234 >= 0 && var235 >= 0 && var234 < 104 && var235 < 104) {
                    int var236 = var234 * 128 + 64;
                    int var237 = var235 * 128 + 64;
                    class52 var238 = new class52(var227, var233, var236, var237, class45.method327(var236, var233, var237, false) - var228, var225, class75.field1501);
                    class246.field4288.method866(new class26(var238), true);
                }
            } else if ((var226 >> 29) != 0) {
                int var229 = var226 & 0xFFFF;
                class37 var230 = class178.field3112[var229];
                if (var230 != null) {
                    var230.field2102 = 0;
                    var230.field2068 = var227;
                    if (var230.field2068 == 65535) {
                        var230.field2068 = -1;
                    }
                    var230.field2094 = 0;
                    var230.field2076 = var228;
                    var230.field2057 = class75.field1501 + var225;
                    if (var230.field2057 > class75.field1501) {
                        var230.field2094 = -1;
                    }
                }
            } else if (var226 >> 28 != 0) {
                int var231 = var226 & 0xFFFF;
                class45 var232;
                if (class49.field882 == var231) {
                    var232 = class207.field3595;
                } else {
                    var232 = class59.field988[var231];
                }
                if (var232 != null) {
                    var232.field2057 = class75.field1501 + var225;
                    var232.field2068 = var227;
                    var232.field2076 = var228;
                    if (var232.field2068 == 65535) {
                        var232.field2068 = -1;
                    }
                    var232.field2102 = 0;
                    var232.field2094 = 0;
                    if (var232.field2057 > class75.field1501) {
                        var232.field2094 = -1;
                    }
                }
            }
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 174) {
            int var239 = class84.field1627.method1674(1355769544);
            int var240 = class84.field1627.method1636(-49);
            int var241 = class84.field1627.method1659(false);
            class63 var242 = class54.method367(var241, (byte) -80);
            class129.field2400 = -1;
            var242.field1233 = (var239 << 16) + var240;
            return true;
        } else if (class129.field2400 == 216) {
            class32.method188((byte) -108);
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 245) {
            int var243 = class84.field1627.method1659(false);
            int var244 = class84.field1627.method1684(-22489);
            class63 var245 = class54.method367(var243, (byte) -80);
            if (var245.field1154 != var244 || var244 == -1) {
                var245.field1094 = 0;
                var245.field1154 = var244;
                var245.field1079 = 0;
                class215.method1385(var245, -122);
            }
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 118) {
            int var246 = class84.field1627.method1652(-5528);
            int var247 = class84.field1627.method1652(-5528);
            class75 var248 = (class75) class230.field3981.method1381((long) var246, 88);
            class75 var249 = (class75) class230.field3981.method1381((long) var247, 111);
            if (var249 != null) {
                class150.method1022(var249, true, var248 == null || var248.field1492 != var249.field1492);
            }
            if (var248 != null) {
                var248.method560(-17554);
                class230.field3981.method1380((byte) 127, var248, (long) var247);
            }
            class63 var250 = class54.method367(var246, (byte) -80);
            if (var250 != null) {
                class215.method1385(var250, -115);
            }
            class63 var251 = class54.method367(var247, (byte) -80);
            if (var251 != null) {
                class215.method1385(var251, -122);
                class69.method503(-1, true, var251);
            }
            if (class150.field2702 != -1) {
                class244.method1607(arg0 + 26449, class150.field2702, 1);
            }
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 211) {
            int var252 = class84.field1627.method1677(-6677);
            int var253 = class84.field1627.method1677(-6677);
            int var254 = class84.field1627.method1674(1355769544);
            int var255 = class84.field1627.method1677(-6677);
            int var256 = class84.field1627.method1677(arg0 + 19677);
            class120.method817(var252, var253, var256, var255, -118, var254, true);
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 10) {
            int var257 = class84.field1627.method1676(104);
            int var258 = class84.field1627.method1690((byte) -47);
            int var259 = class84.field1627.method1690((byte) -47);
            class37 var260 = class178.field3112[var259];
            if (var260 != null) {
                class67.method495(0, var258, var260, var257);
            }
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 108) {
            class202.method1309(arg0 + 26430);
            class99.method684(0);
            class17.field233 += 32;
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 252) {
            int var261 = class84.field1627.method1688(arg0 ^ 0xFFFF9901);
            class66 var262 = class84.field1627.method1637(127);
            int var263 = class84.field1627.method1688(22);
            if (var263 >= 1 && var263 <= 8) {
                if (var262.method470(false, class220.field3772)) {
                    var262 = null;
                }
                class100.field1957[var263 - 1] = var262;
                class143.field2613[var263 - 1] = var261 == 0;
            }
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 49) {
            int var264 = class84.field1627.method1636(-82);
            int var265 = class84.field1627.method1674(arg0 + 1355795898);
            int var266 = class84.field1627.method1667((byte) 123);
            int var267 = class84.field1627.method1636(102);
            class63 var268 = class54.method367(var266, (byte) -80);
            if (var268.field1187 != var264 || var268.field1137 != var267 || var268.field1085 != var265) {
                var268.field1085 = var265;
                var268.field1187 = var264;
                var268.field1137 = var267;
                class215.method1385(var268, -120);
            }
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 152) {
            class66 var269 = class84.field1627.method1637(127);
            Object[] var270 = new Object[var269.method460((byte) -119) + 1];
            for (int var271 = var269.method460((byte) -100) - 1; var271 >= 0; var271--) {
                if (var269.method448(var271, 7178) == 115) {
                    var270[var271 + 1] = class84.field1627.method1637(arg0 + 26481);
                } else {
                    var270[var271 + 1] = Integer.valueOf(class84.field1627.method1652(class109.method741(arg0, 29542)));
                }
            }
            var270[0] = Integer.valueOf(class84.field1627.method1652(-5528));
            class237 var272 = new class237();
            var272.field4118 = var270;
            class8.method34(var272, 16);
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 173) {
            class187.method1235((byte) 95, true);
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 109) {
            int var273 = class84.field1627.method1652(-5528);
            int var274 = class84.field1627.method1636(-60);
            class19.method76(arg0 ^ 0xFFFF990E, var273, var274);
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 193) {
            int var275 = class84.field1627.method1677(-6677);
            int var276 = class84.field1627.method1677(-6677);
            int var277 = class84.field1627.method1674(1355769544);
            int var278 = class84.field1627.method1677(-6677);
            int var279 = class84.field1627.method1677(-6677);
            class144.method992(var278, var277, var275, true, var276, var279);
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 38) {
            for (int var280 = 0; var280 < class89.field1726.length; var280++) {
                if (class89.field1726[var280] != class214.field3678[var280]) {
                    class89.field1726[var280] = class214.field3678[var280];
                    class34.method193((byte) 67, var280);
                    class163.field2925[class115.method767(class17.field233++, 31)] = var280;
                }
            }
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 6) {
            int var281 = class84.field1627.method1659(false);
            int var282 = class84.field1627.method1636(-43);
            class63 var283 = class54.method367(var281, (byte) -80);
            if (var282 == 65535) {
                var282 = -1;
            }
            if (var283.field1188 != 2 || var283.field1126 != var282) {
                var283.field1126 = var282;
                var283.field1188 = 2;
                class215.method1385(var283, -113);
            }
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 205) {
            if (class61.field1033 == 0) {
                class60.field1024 = class120.field2266;
            } else {
                class60.field1024 = class84.field1627.method1637(arg0 ^ 0xFFFF9971);
            }
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 218) {
            class66 var284 = class84.field1627.method1637(arg0 ^ 0xFFFF9971);
            if (var284.method443(class99.field1929, true)) {
                class66 var314 = var284.method477(0, (byte) -74, var284.method465(arg0 ^ 0x668D, class50.field891));
                long var315 = var314.method479(10908);
                boolean var317 = false;
                for (int var318 = 0; var318 < class124.field2338; var318++) {
                    if (class247.field4306[var318] == var315) {
                        var317 = true;
                        break;
                    }
                }
                if (!var317 && class231.field4044 == 0) {
                    class234.method1533(var314, arg0 ^ 0x6698, class82.field1594, 4);
                }
            } else if (var284.method443(class259.field4564, true)) {
                class66 var308 = var284.method477(0, (byte) -74, var284.method465(89, class50.field891));
                long var309 = var308.method479(10908);
                boolean var311 = false;
                for (int var312 = 0; var312 < class124.field2338; var312++) {
                    if (class247.field4306[var312] == var309) {
                        var311 = true;
                        break;
                    }
                }
                if (!var311 && class231.field4044 == 0) {
                    class66 var313 = var284.method477(var284.method465(-126, class50.field891) + 1, (byte) -74, var284.method460((byte) -121) - 9);
                    class234.method1533(var308, -112, var313, 8);
                }
            } else if (var284.method443(class15.field197, true)) {
                class66 var285 = var284.method477(0, (byte) -74, var284.method465(83, class50.field891));
                long var286 = var285.method479(10908);
                boolean var288 = false;
                for (int var289 = 0; var289 < class124.field2338; var289++) {
                    if (class247.field4306[var289] == var286) {
                        var288 = true;
                        break;
                    }
                }
                if (!var288 && class231.field4044 == 0) {
                    class234.method1533(var285, -110, class85.field1679, 10);
                }
            } else if (var284.method443(class79.field1557, true)) {
                class66 var290 = var284.method477(0, (byte) -74, var284.method465(-71, class79.field1557));
                class234.method1533(class85.field1679, 126, var290, 11);
            } else if (var284.method443(class100.field1961, true)) {
                class66 var307 = var284.method477(0, (byte) -74, var284.method465(-57, class100.field1961));
                if (class231.field4044 == 0) {
                    class234.method1533(class85.field1679, arg0 + 26270, var307, 12);
                }
            } else if (var284.method443(class263.field4611, true)) {
                class66 var306 = var284.method477(0, (byte) -74, var284.method465(-113, class263.field4611));
                if (class231.field4044 == 0) {
                    class234.method1533(class85.field1679, -12, var306, 13);
                }
            } else if (var284.method443(class57.field968, true)) {
                class66 var291 = var284.method477(0, (byte) -74, var284.method465(37, class50.field891));
                long var292 = var291.method479(arg0 ^ 0xFFFFB392);
                boolean var294 = false;
                for (int var295 = 0; var295 < class124.field2338; var295++) {
                    if (class247.field4306[var295] == var292) {
                        var294 = true;
                        break;
                    }
                }
                if (!var294 && class231.field4044 == 0) {
                    class234.method1533(var291, arg0 ^ 0x66B1, class85.field1679, 14);
                }
            } else if (var284.method443(class54.field941, true)) {
                class66 var296 = var284.method477(0, (byte) -74, var284.method465(-90, class50.field891));
                long var297 = var296.method479(10908);
                boolean var299 = false;
                for (int var300 = 0; var300 < class124.field2338; var300++) {
                    if (class247.field4306[var300] == var297) {
                        var299 = true;
                        break;
                    }
                }
                if (!var299 && class231.field4044 == 0) {
                    class234.method1533(var296, -108, class85.field1679, 15);
                }
            } else if (var284.method443(class135.field2497, true)) {
                class66 var301 = var284.method477(0, (byte) -74, var284.method465(63, class50.field891));
                long var302 = var301.method479(arg0 ^ 0xFFFFB392);
                boolean var304 = false;
                for (int var305 = 0; var305 < class124.field2338; var305++) {
                    if (class247.field4306[var305] == var302) {
                        var304 = true;
                        break;
                    }
                }
                if (!var304 && class231.field4044 == 0) {
                    class234.method1533(var301, arg0 ^ 0x6680, class85.field1679, 16);
                }
            } else {
                class234.method1533(class85.field1679, 127, var284, 0);
            }
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 144) {
            byte[] var319 = new byte[class61.field1033];
            class84.field1627.method581(var319, class61.field1033, 0, false);
            class37.method206(class69.method507(class61.field1033, var319, 104, 0), true, -125);
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 3) {
            class129.field2400 = -1;
            class32.field481 = 0;
            return true;
        } else if (class129.field2400 == 161) {
            int var320 = class84.field1627.method1674(1355769544);
            int var321 = class84.field1627.method1655(55);
            class218.method1402(95, var321, var320);
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 227) {
            int var322 = class84.field1627.method1677(-6677);
            int var323 = var322 >> 6;
            class76 var324 = new class76();
            var324.field1502 = var322 & 0x3F;
            var324.field1512 = class84.field1627.method1677(-6677);
            if (var324.field1512 >= 0 && var324.field1512 < class2.field32.length) {
                if (var324.field1502 == 1 || var324.field1502 == 10) {
                    var324.field1506 = class84.field1627.method1674(1355769544);
                    class84.field1627.field4335 += 3;
                } else if (var324.field1502 >= 2 && var324.field1502 <= 6) {
                    if (var324.field1502 == 2) {
                        var324.field1515 = 64;
                        var324.field1516 = 64;
                    }
                    if (var324.field1502 == 3) {
                        var324.field1515 = 0;
                        var324.field1516 = 64;
                    }
                    if (var324.field1502 == 4) {
                        var324.field1516 = 64;
                        var324.field1515 = 128;
                    }
                    if (var324.field1502 == 5) {
                        var324.field1516 = 0;
                        var324.field1515 = 64;
                    }
                    if (var324.field1502 == 6) {
                        var324.field1516 = 128;
                        var324.field1515 = 64;
                    }
                    var324.field1502 = 2;
                    var324.field1509 = class84.field1627.method1674(1355769544);
                    var324.field1505 = class84.field1627.method1674(1355769544);
                    var324.field1510 = class84.field1627.method1677(-6677);
                }
                var324.field1508 = class84.field1627.method1674(1355769544);
                if (var324.field1508 == 65535) {
                    var324.field1508 = -1;
                }
                class194.field3354[var323] = var324;
            }
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 190) {
            int var325 = class84.field1627.method1674(arg0 + 1355795898);
            class27.method116(var325, -107);
            class21.field292[class115.method767(31, class237.field4124++)] = class115.method767(var325, 32767);
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 246) {
            int var326 = class84.field1627.method1652(arg0 + 20826);
            class75 var327 = (class75) class230.field3981.method1381((long) var326, 107);
            if (var327 != null) {
                class150.method1022(var327, true, true);
            }
            if (class264.field4629 != null) {
                class215.method1385(class264.field4629, -125);
                class264.field4629 = null;
            }
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 191) {
            class66 var328 = class84.field1627.method1637(127);
            int var329 = class84.field1627.method1636(-91);
            int var330 = class84.field1627.method1690((byte) -47);
            class233.method1526(-55, var330);
            class122.method830((byte) 88, var329, var328);
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 255) {
            int var331 = class84.field1627.method1652(-5528);
            int var332 = class84.field1627.method1674(1355769544);
            class63 var333;
            if (var331 >= 0) {
                var333 = class54.method367(var331, (byte) -80);
            } else {
                var333 = null;
            }
            if (var333 != null) {
                for (int var334 = 0; var334 < var333.field1118.length; var334++) {
                    var333.field1118[var334] = 0;
                    var333.field1097[var334] = 0;
                }
            }
            if (var331 < -70000) {
                var332 += 32768;
            }
            class48.method343(var332, (byte) 45);
            int var335 = class84.field1627.method1674(arg0 ^ 0xAF30FFC6);
            for (int var336 = 0; var336 < var335; var336++) {
                int var337 = class84.field1627.method1676(97);
                if (var337 == 255) {
                    var337 = class84.field1627.method1659(false);
                }
                int var338 = class84.field1627.method1636(arg0 ^ 0xFFFF9967);
                if (var333 != null && var333.field1118.length > var336) {
                    var333.field1118[var336] = var338;
                    var333.field1097[var336] = var337;
                }
                class167.method1140(var336, var337, (byte) -32, var332, var338 - 1);
            }
            if (var333 != null) {
                class215.method1385(var333, -118);
            }
            class99.method684(0);
            class21.field292[class115.method767(class237.field4124++, 31)] = class115.method767(32767, var332);
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 1) {
            int var339 = class84.field1627.method1676(arg0 ^ 0xFFFF9947);
            int var340 = class84.field1627.method1690((byte) -47);
            class19.method76(arg0 ^ 0xFFFF990E, var339, var340);
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 99) {
            class99.method684(0);
            class197.field3407 = class84.field1627.method1677(-6677);
            class26.field326 = class15.field199;
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 35) {
            int var341 = class84.field1627.method1659(false);
            int var342 = class84.field1627.method1667((byte) 103);
            int var343 = class84.field1627.method1690((byte) -47);
            class63 var344 = class54.method367(var341, (byte) -80);
            if (var343 == 65535) {
                var343 = -1;
            }
            if (var344.field1186) {
                var344.field1238 = var342;
                var344.field1121 = var343;
                class157 var346 = class40.method242(-25672, var343);
                var344.field1137 = var346.field2846;
                var344.field1176 = var346.field2806;
                var344.field1187 = var346.field2840;
                var344.field1104 = var346.field2809;
                var344.field1165 = var346.field2842;
                var344.field1085 = var346.field2787;
                if (var344.field1116 > 0) {
                    var344.field1085 = var344.field1085 * 32 / var344.field1116;
                } else if (var344.field1096 > 0) {
                    var344.field1085 = var344.field1085 * 32 / var344.field1096;
                }
                class215.method1385(var344, -126);
            } else if (var343 == -1) {
                class129.field2400 = -1;
                var344.field1188 = 0;
                return true;
            } else {
                class157 var345 = class40.method242(arg0 ^ 0x2B6, var343);
                var344.field1137 = var345.field2846;
                var344.field1187 = var345.field2840;
                var344.field1126 = var343;
                var344.field1085 = var345.field2787 * 100 / var342;
                var344.field1188 = 4;
                class215.method1385(var344, arg0 + 26234);
            }
            class129.field2400 = -1;
            return true;
        } else if (class129.field2400 == 114) {
            for (int var347 = 0; var347 < class59.field988.length; var347++) {
                if (class59.field988[var347] != null) {
                    class59.field988[var347].field2084 = -1;
                }
            }
            for (int var348 = 0; var348 < class178.field3112.length; var348++) {
                if (class178.field3112[var348] != null) {
                    class178.field3112[var348].field2084 = -1;
                }
            }
            class129.field2400 = -1;
            return true;
        } else {
            class181.method1205("T1 - " + class129.field2400 + "," + class77.field1527 + "," + class184.field3212 + " - " + class61.field1033, (Throwable) null, 38);
            class75.method535((byte) -116);
            return true;
        }
    }
}
