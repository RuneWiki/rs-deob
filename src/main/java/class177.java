import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class177 extends class122 {

    @OriginalMember(owner = "client!db", name = "bb", descriptor = "Z")
    public static boolean field2914 = false;

    @OriginalMember(owner = "client!db", name = "db", descriptor = "S")
    public static short field2916 = 32767;

    @OriginalMember(owner = "client!db", name = "eb", descriptor = "I")
    public static int field2917 = 0;

    @OriginalMember(owner = "client!db", name = "T", descriptor = "Lo;")
    public static class199 field2906 = new class199(16);

    @OriginalMember(owner = "client!db", name = "ib", descriptor = "Lqd;")
    public static class40 field2921 = class147.method1106("null", (byte) -86);

    @OriginalMember(owner = "client!db", name = "hb", descriptor = "Lpl;")
    public static class186 field2920 = new class186(4);

    @OriginalMember(owner = "client!db", name = "kb", descriptor = "I")
    public static int field2923 = 0;

    @OriginalMember(owner = "client!db", name = "N", descriptor = "I")
    public static int field2900;

    @OriginalMember(owner = "client!db", name = "O", descriptor = "I")
    public static int field2901;

    @OriginalMember(owner = "client!db", name = "P", descriptor = "I")
    public int field2902;

    @OriginalMember(owner = "client!db", name = "Q", descriptor = "I")
    public static int field2903;

    @OriginalMember(owner = "client!db", name = "S", descriptor = "I")
    public static int field2905;

    @OriginalMember(owner = "client!db", name = "U", descriptor = "I")
    public int field2907;

    @OriginalMember(owner = "client!db", name = "V", descriptor = "I")
    public int field2908;

    @OriginalMember(owner = "client!db", name = "W", descriptor = "I")
    public static int field2909;

    @OriginalMember(owner = "client!db", name = "X", descriptor = "I")
    public static int field2910;

    @OriginalMember(owner = "client!db", name = "Y", descriptor = "I")
    public static int field2911;

    @OriginalMember(owner = "client!db", name = "Z", descriptor = "I")
    public static int field2912;

    @OriginalMember(owner = "client!db", name = "ab", descriptor = "I")
    public static int field2913;

    @OriginalMember(owner = "client!db", name = "cb", descriptor = "I")
    public static int field2915;

    @OriginalMember(owner = "client!db", name = "fb", descriptor = "I")
    public static int field2918;

    @OriginalMember(owner = "client!db", name = "gb", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!db", name = "jb", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!db", name = "R", descriptor = "Lqd;")
    public class40 field2904;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(II[Lrb;)V", line = 4)
    public static final void method1299(int arg0, int arg1, class213[] arg2) {
        field2900++;
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class213 var4 = arg2[var3];
            if (var4 != null && var4.field3421 == arg1 && (!var4.field3520 || !client.method1730(var4))) {
                if (var4.field3525 == 0) {
                    if (!var4.field3520 && client.method1730(var4) && class230.field3793 != var4) {
                        continue;
                    }
                    method1299(-125, var4.field3507, arg2);
                    if (var4.field3415 != null) {
                        method1299(-69, var4.field3507, var4.field3415);
                    }
                    class297 var5 = (class297) class165.field2731.method1405((byte) 115, (long) var4.field3507);
                    if (var5 != null) {
                        class51.method443(var5.field4959, true);
                    }
                }
                if (var4.field3525 == 6) {
                    if (var4.field3521 != -1 || var4.field3498 != -1) {
                        boolean var6 = class296.method2025(false, var4);
                        int var7;
                        if (var6) {
                            var7 = var4.field3498;
                        } else {
                            var7 = var4.field3521;
                        }
                        if (var7 != -1) {
                            class300 var8 = class20.method128(66, var7);
                            if (var8 != null) {
                                var4.field3443 += class189.field3059;
                                while (var8.field5033[var4.field3514] < var4.field3443) {
                                    var4.field3443 -= var8.field5033[var4.field3514];
                                    var4.field3514++;
                                    if (var8.field5018.length <= var4.field3514) {
                                        var4.field3514 -= var8.field5036;
                                        if (var4.field3514 < 0 || var8.field5018.length <= var4.field3514) {
                                            var4.field3514 = 0;
                                        }
                                    }
                                    class25.method188(0, var4);
                                }
                            }
                        }
                    }
                    if (var4.field3541 != 0 && !var4.field3520) {
                        int var9 = var4.field3541 >> 16;
                        int var10 = var4.field3541 << 16 >> 16;
                        int var11 = class189.field3059 * var10;
                        var4.field3458 = var4.field3458 + var11 & 0x7FF;
                        int var12 = class189.field3059 * var9;
                        var4.field3551 = var4.field3551 + var12 & 0x7FF;
                        class25.method188(0, var4);
                    }
                }
            }
        }
        if (arg0 > -53) {
            method1307((byte) 28);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Ljb;BIII)V", line = 115)
    public static final void method1300(class27 arg0, byte arg1, int arg2, int arg3, int arg4) {
        field2912++;
        for (class255 var5 = (class255) class101.field1774.method1971(100); var5 != null; var5 = (class255) class101.field1774.method1967(100)) {
            if (var5.field4237 == arg3 && arg4 * 128 == var5.field4239 && arg2 * 128 == var5.field4254 && var5.field4248.field557 == arg0.field557) {
                if (var5.field4234 != null) {
                    class89.field1610.method1336(var5.field4234);
                    var5.field4234 = null;
                }
                if (var5.field4243 != null) {
                    class89.field1610.method1336(var5.field4243);
                    var5.field4243 = null;
                }
                var5.method2095(0);
                return;
            }
        }
        if (arg1 > -15) {
            field2920 = (class186) null;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V", line = 158)
    public static void method1301(byte arg0) {
        if (arg0 == 49) {
            field2920 = null;
            field2906 = null;
            field2921 = null;
        }
    }

    @OriginalMember(owner = "client!db", name = "f", descriptor = "(I)V", line = 182)
    public final void method1302(int arg0) {
        if (arg0 != -20040) {
            field2921 = (class40) null;
        }
        field2915++;
        this.field2112 |= Long.MIN_VALUE;
        if (this.method1309((byte) 85) == 0L) {
            class218.field3634.method55(this, 105);
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(B)V", line = 199)
    public final void method1303(byte arg0) {
        if (arg0 < 47) {
            this.method1303((byte) 77);
        }
        field2909++;
        this.field2112 = this.field2112 & Long.MIN_VALUE | class69.method535(true) + 500L;
        class222.field3683.method55(this, 116);
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(II)Z", line = 211)
    public static final boolean method1304(int arg0, int arg1) {
        if (arg1 == 57) {
            field2911++;
            return arg0 >= 48 && arg0 <= 57;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!db", name = "g", descriptor = "(I)V", line = 222)
    public static final void method1305(int arg0) {
        field2918++;
        class243.method1712((byte) 70);
        class52.method450((byte) 83);
        class8.method44((byte) 81);
        class292.method2006(false);
        class20.method125((byte) -16);
        class189.method1360(-3063);
        class178.method1314(4915);
        class275.method1916(2048);
        class276.method1918(-127);
        class53.method463(92);
        int var1 = 11 % ((-arg0 - 26) / 57);
        class150.method1126(-1);
        class119.method898(false);
        class286.method1988(true);
        class208.method1468(false);
        class293.field4905.method1347(0);
    }

    @OriginalMember(owner = "client!db", name = "h", descriptor = "(I)I", line = 248)
    public final int method1306(int arg0) {
        if (arg0 < 39) {
            return -47;
        } else {
            field2901++;
            return (int) this.field5149;
        }
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(B)V", line = 260)
    public static final void method1307(byte arg0) {
        class278.method1949(-51, false);
        field2910++;
        class50.field961 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class139.field2355.length; var2++) {
            if (class229.field3783[var2] != -1 && class139.field2355[var2] == null) {
                class139.field2355[var2] = class172.field2807.method1651(class229.field3783[var2], 0, -1);
                if (class139.field2355[var2] == null) {
                    class50.field961++;
                    var1 = false;
                }
            }
            if (class118.field2001[var2] != -1 && class265.field4436[var2] == null) {
                class265.field4436[var2] = class172.field2807.method1650(class118.field2001[var2], 0, false, class278.field4693[var2]);
                if (class265.field4436[var2] == null) {
                    var1 = false;
                    class50.field961++;
                }
            }
            if (class21.field350) {
                if (class304.field5094[var2] != -1 && class109.field1903[var2] == null) {
                    class109.field1903[var2] = class172.field2807.method1651(class304.field5094[var2], 0, -1);
                    if (class109.field1903[var2] == null) {
                        class50.field961++;
                        var1 = false;
                    }
                }
                if (class29.field628[var2] != -1 && class88.field1595[var2] == null) {
                    class88.field1595[var2] = class172.field2807.method1651(class29.field628[var2], 0, -1);
                    if (class88.field1595[var2] == null) {
                        var1 = false;
                        class50.field961++;
                    }
                }
            }
            if (class272.field4513 != null && class265.field4438[var2] == null && class272.field4513[var2] != -1) {
                class265.field4438[var2] = class172.field2807.method1650(class272.field4513[var2], 0, false, class278.field4693[var2]);
                if (class265.field4438[var2] == null) {
                    class50.field961++;
                    var1 = false;
                }
            }
        }
        if (class45.field880 == null) {
            if (class17.field263 == null || !class280.field4739.method1655((byte) 83, class153.method1192(new class40[] { class17.field263.field3319, class5.field66 }, (byte) 124))) {
                class45.field880 = new class313(0);
            } else if (class280.field4739.method1682(-87, class153.method1192(new class40[] { class17.field263.field3319, class5.field66 }, (byte) 122))) {
                class45.field880 = class285.method1983(class153.method1192(new class40[] { class17.field263.field3319, class5.field66 }, (byte) 124), class280.field4739, 0);
            } else {
                class50.field961++;
                var1 = false;
            }
        }
        if (!var1) {
            class44.field840 = 1;
            return;
        }
        boolean var3 = true;
        class160.field2676 = 0;
        for (int var4 = 0; var4 < class139.field2355.length; var4++) {
            byte[] var5 = class265.field4436[var4];
            if (var5 != null) {
                int var6 = (class5.field70[var4] >> 8) * 64 - class196.field3152;
                int var7 = (class5.field70[var4] & 0xFF) * 64 - class263.field4407;
                if (class86.field1544) {
                    var7 = 10;
                    var6 = 10;
                }
                var3 &= class122.method925(var6, var7, (byte) -45, var5);
            }
            if (class21.field350) {
                byte[] var8 = class88.field1595[var4];
                if (var8 != null) {
                    int var9 = (class5.field70[var4] >> 8) * 64 - class196.field3152;
                    int var10 = (class5.field70[var4] & 0xFF) * 64 - class263.field4407;
                    if (class86.field1544) {
                        var10 = 10;
                        var9 = 10;
                    }
                    var3 &= class122.method925(var9, var10, (byte) 113, var8);
                }
            }
        }
        if (!var3) {
            class44.field840 = 2;
            return;
        }
        if (class44.field840 != 0) {
            class28.method269((byte) -105, class153.method1192(new class40[] { class128.field2210, class78.field1328 }, (byte) 121), true);
        }
        class194.method1385(4);
        boolean var11 = false;
        class78.method582(-110);
        if (class21.field350 && class178.field2929) {
            for (int var12 = 0; var12 < class139.field2355.length; var12++) {
                if (class88.field1595[var12] != null || class109.field1903[var12] != null) {
                    var11 = true;
                    break;
                }
            }
        }
        class239.method1656(4, 104, 104, class21.field350 ? 28 : 25, var11);
        for (int var13 = 0; var13 < 4; var13++) {
            class255.field4247[var13].method415(112);
        }
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 104; var15++) {
                for (int var16 = 0; var16 < 104; var16++) {
                    class274.field4564[var14][var15][var16] = 0;
                }
            }
        }
        class25.method182(false, 0);
        if (class21.field350) {
            class241.field3987.method851();
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    class241.field3985[var17][var18].field3651 = true;
                }
            }
        }
        if (class21.field350) {
            class84.method648();
        }
        if (class21.field350) {
            class150.method1123(true);
        }
        class194.method1385(4);
        System.gc();
        class278.method1949(-51, true);
        class9.method50(false, 104);
        if (!class86.field1544) {
            class268.method1864(false, false);
            class278.method1949(-51, true);
            if (class21.field350) {
                int var19 = class255.field4233.field1532[0] >> 3;
                int var20 = class255.field4233.field1489[0] >> 3;
                class9.method52(var19, var20, -24853);
            }
            class211.method1486(false, (byte) 108);
            if (class265.field4438 != null) {
                class126.method941(64);
            }
        }
        if (class86.field1544) {
            class238.method1642(false, false);
            class278.method1949(-51, true);
            if (class21.field350) {
                int var21 = class255.field4233.field1532[0] >> 3;
                int var22 = class255.field4233.field1489[0] >> 3;
                class9.method52(var21, var22, -24853);
            }
            class120.method902(0, false);
        }
        class78.method582(-74);
        class278.method1949(-51, true);
        class307.method2101(-3503, class255.field4247, false);
        if (class21.field350) {
            class84.method647();
        }
        class278.method1949(-51, true);
        int var23 = class56.field1080;
        if (var23 > class160.field2671) {
            var23 = class160.field2671;
        }
        if (class160.field2671 - 1 > var23) {
            int var24 = class160.field2671 - 1;
        }
        if (class118.method893(2)) {
            class150.method1125(0);
        } else {
            class150.method1125(class56.field1080);
        }
        class19.method112(true);
        if (class21.field350 && var11) {
            class193.method1381(true);
            class9.method50(true, 104);
            if (!class86.field1544) {
                class268.method1864(true, false);
                class278.method1949(-51, true);
                class211.method1486(true, (byte) 118);
            }
            if (class86.field1544) {
                class238.method1642(false, true);
                class278.method1949(-51, true);
                class120.method902(0, true);
            }
            class78.method582(-43);
            class278.method1949(-51, true);
            class307.method2101(-3503, class255.field4247, true);
            class278.method1949(-51, true);
            class19.method112(true);
            class193.method1381(false);
        }
        if (class21.field350) {
            for (int var25 = 0; var25 < 13; var25++) {
                for (int var26 = 0; var26 < 13; var26++) {
                    class241.field3985[var25][var26].method1539(class78.field1316[0], var25 * 8, var26 * 8);
                }
            }
        }
        for (int var27 = 0; var27 < 104; var27++) {
            for (int var28 = 0; var28 < 104; var28++) {
                class185.method1337(false, var28, var27);
            }
        }
        class255.method1795((byte) 124);
        class194.method1385(4);
        class44.method407(99);
        class78.method582(-29);
        if (class106.field1867 != null && class140.field2369 != null && class6.field87 == 25) {
            class205.field3260++;
            class19.field295.method1464(193, 0);
            class19.field295.method239((byte) -82, 1057001181);
        }
        if (!class86.field1544) {
            int var29 = (class78.field1319 - 6) / 8;
            int var30 = (class78.field1319 + 6) / 8;
            int var31 = (class159.field2662 - 6) / 8;
            int var32 = (class159.field2662 + 6) / 8;
            for (int var33 = var29 - 1; var33 <= var30 + 1; var33++) {
                for (int var34 = var31 - 1; var34 <= var32 + 1; var34++) {
                    if (var33 < var29 || var30 < var33 || var34 < var31 || var34 > var32) {
                        class172.field2807.method1646((byte) 127, class153.method1192(new class40[] { class178.field2937, class276.method1927((byte) -120, var33), class103.field1805, class276.method1927((byte) -110, var34) }, (byte) 127));
                        class172.field2807.method1646((byte) 120, class153.method1192(new class40[] { class253.field4196, class276.method1927((byte) -86, var33), class103.field1805, class276.method1927((byte) -79, var34) }, (byte) -123));
                    }
                }
            }
        }
        if (class6.field87 == 28) {
            class271.method1879(10, 17646);
        } else {
            class271.method1879(30, 17646);
            if (class140.field2369 != null) {
                class19.field295.method1464(206, 0);
            }
        }
        class230.method1606((byte) 19);
        class194.method1385(4);
        int var35 = -71 / ((arg0 - 9) / 37);
        client.method1725(40);
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(II)V", line = 752)
    private class177(int arg0, int arg1) {
        this.field5149 = (long) arg0 << 32 | (long) arg1;
    }

    @OriginalMember(owner = "client!db", name = "i", descriptor = "(I)I", line = 765)
    public final int method1308(int arg0) {
        field2913++;
        if (arg0 != 25154) {
            this.field2908 = 23;
        }
        return (int) (this.field5149 >>> 32 & 0xFFL);
    }

    @OriginalMember(owner = "client!db", name = "d", descriptor = "(B)J", line = 777)
    public final long method1309(byte arg0) {
        int var2 = 112 % ((arg0 + 59) / 53);
        field2903++;
        return Long.MAX_VALUE & this.field2112;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(III)Ldb;", line = 800)
    public static final class177 method1310(int arg0, int arg1, int arg2) {
        field2905++;
        if (arg0 <= 27) {
            field2922 = -4;
        }
        class177 var3 = (class177) field2906.method1405((byte) 115, (long) arg2 | (long) arg1 << 32);
        if (var3 == null) {
            var3 = new class177(arg1, arg2);
            field2906.method1396(-19928, var3.field5149, var3);
        }
        return var3;
    }
}
