import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class95 {

    @OriginalMember(owner = "client!q", name = "q", descriptor = "Lec;")
    public static class28 field2099 = class28.method210(-46, "Imported maps");

    @OriginalMember(owner = "client!q", name = "v", descriptor = "Lec;")
    public static class28 field2104 = class28.method210(-46, "Public chat");

    @OriginalMember(owner = "client!q", name = "u", descriptor = "Lec;")
    public static class28 field2103 = class28.method210(-46, "::");

    @OriginalMember(owner = "client!q", name = "j", descriptor = "Z")
    public static boolean field2092 = false;

    @OriginalMember(owner = "client!q", name = "B", descriptor = "Lec;")
    public static class28 field2110 = class28.method210(-46, "(X");

    @OriginalMember(owner = "client!q", name = "o", descriptor = "I")
    public static int field2097 = 0;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "Lec;")
    public static class28 field2086 = class28.method210(-46, "backright1");

    @OriginalMember(owner = "client!q", name = "k", descriptor = "I")
    public static int field2093 = 0;

    @OriginalMember(owner = "client!q", name = "y", descriptor = "Lec;")
    public static class28 field2107 = class28.method210(-46, "From");

    @OriginalMember(owner = "client!q", name = "a", descriptor = "I")
    public int field2083;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "I")
    public int field2084;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "I")
    public int field2085;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "I")
    public int field2087;

    @OriginalMember(owner = "client!q", name = "f", descriptor = "I")
    public int field2088;

    @OriginalMember(owner = "client!q", name = "g", descriptor = "I")
    public int field2089;

    @OriginalMember(owner = "client!q", name = "h", descriptor = "I")
    public int field2090;

    @OriginalMember(owner = "client!q", name = "i", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!q", name = "m", descriptor = "I")
    public static int field2095;

    @OriginalMember(owner = "client!q", name = "n", descriptor = "I")
    public int field2096;

    @OriginalMember(owner = "client!q", name = "p", descriptor = "I")
    public int field2098;

    @OriginalMember(owner = "client!q", name = "r", descriptor = "I")
    public static int field2100;

    @OriginalMember(owner = "client!q", name = "s", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "client!q", name = "t", descriptor = "I")
    public int field2102;

    @OriginalMember(owner = "client!q", name = "w", descriptor = "I")
    public int field2105;

    @OriginalMember(owner = "client!q", name = "x", descriptor = "I")
    public int field2106;

    @OriginalMember(owner = "client!q", name = "A", descriptor = "I")
    public int field2109;

    @OriginalMember(owner = "client!q", name = "C", descriptor = "I")
    public int field2111;

    @OriginalMember(owner = "client!q", name = "D", descriptor = "I")
    public int field2112;

    @OriginalMember(owner = "client!q", name = "E", descriptor = "I")
    public int field2113;

    @OriginalMember(owner = "client!q", name = "F", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!q", name = "G", descriptor = "I")
    public int field2115;

    @OriginalMember(owner = "client!q", name = "H", descriptor = "I")
    public int field2116;

    @OriginalMember(owner = "client!q", name = "I", descriptor = "I")
    public static int field2117;

    @OriginalMember(owner = "client!q", name = "J", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!q", name = "K", descriptor = "I")
    public static int field2119;

    @OriginalMember(owner = "client!q", name = "z", descriptor = "Lcc;")
    public static class16 field2108;

    @OriginalMember(owner = "client!q", name = "l", descriptor = "Lbb;")
    public static class9 field2094;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(B)V")
    public static final void method681(byte arg0) {
        class88.method654((byte) -117);
        field2091++;
        if (class11.field185 == 2) {
            byte[] var1 = class45.field1000.field2754;
            int[] var2 = class120.field2594;
            int var3 = var1.length;
            for (int var4 = 0; var4 < var3; var4++) {
                if (var1[var4] == 0) {
                    var2[var4] = 0;
                }
            }
            class78.field1816.method192(0, 0, 33, 33, 25, 25, class122.field2663, 256, class63.field1411, class31.field671);
            class129.method987(-121, class117.field2493);
            return;
        }
        int var5 = class37.field848.field1446 / 32 + 48;
        int var6 = class122.field2663 + class48.field1105 & 0x7FF;
        int var7 = 464 - class37.field848.field1501 / 32;
        class13.field215.method192(25, 5, 146, 151, var5, var7, var6, class74.field1637 + 256, class34.field769, class90.field1979);
        class78.field1816.method192(0, 0, 33, 33, 25, 25, class122.field2663, 256, class63.field1411, class31.field671);
        for (int var8 = 0; var8 < class4.field75; var8++) {
            int var38 = class70.field1561[var8] * 4 + 2 - class37.field848.field1446 / 32;
            int var39 = class109.field2276[var8] * 4 + 2 - class37.field848.field1501 / 32;
            class63.method511((byte) 49, class105.field2211[var8], var39, var38);
        }
        if (arg0 < 4) {
            field2086 = null;
        }
        for (int var9 = 0; var9 < 104; var9++) {
            for (int var34 = 0; var34 < 104; var34++) {
                class42 var35 = class127.field2746[class122.field2657][var9][var34];
                if (var35 != null) {
                    int var36 = var9 * 4 + 2 - class37.field848.field1446 / 32;
                    int var37 = var34 * 4 + 2 - class37.field848.field1501 / 32;
                    class63.method511((byte) 49, class94.field2081[0], var37, var36);
                }
            }
        }
        for (int var10 = 0; var10 < class64.field1430; var10++) {
            class90 var30 = class88.field1956[class64.field1429[var10]];
            if (var30 != null && var30.method343((byte) 110)) {
                class106 var31 = var30.field1996;
                if (var31.field2245 != null) {
                    var31 = var31.method736(false);
                }
                if (var31 != null && var31.field2269 && var31.field2244) {
                    int var32 = var30.field1446 / 32 - class37.field848.field1446 / 32;
                    int var33 = var30.field1501 / 32 - class37.field848.field1501 / 32;
                    class63.method511((byte) 49, class94.field2081[1], var33, var32);
                }
            }
        }
        for (int var11 = 0; var11 < class74.field1641; var11++) {
            class43 var22 = class129.field2779[class4.field66[var11]];
            if (var22 != null && var22.method343((byte) 110)) {
                int var23 = var22.field1446 / 32 - class37.field848.field1446 / 32;
                boolean var24 = false;
                int var25 = var22.field1501 / 32 - class37.field848.field1501 / 32;
                long var26 = var22.field919.method237(240);
                for (int var28 = 0; var28 < class36.field829; var28++) {
                    if (class1.field5[var28] == var26 && class61.field1348[var28] != 0) {
                        var24 = true;
                        break;
                    }
                }
                boolean var29 = false;
                if (class37.field848.field932 != 0 && var22.field932 != 0 && class37.field848.field932 == var22.field932) {
                    var29 = true;
                }
                if (var24) {
                    class63.method511((byte) 49, class94.field2081[3], var25, var23);
                } else if (var29) {
                    class63.method511((byte) 49, class94.field2081[4], var25, var23);
                } else {
                    class63.method511((byte) 49, class94.field2081[2], var25, var23);
                }
            }
        }
        if (class110.field2314 != 0 && class83.field1888 % 20 < 10) {
            if (class110.field2314 == 1 && class31.field659 >= 0 && class88.field1956.length > class31.field659) {
                class90 var12 = class88.field1956[class31.field659];
                if (var12 != null) {
                    int var13 = var12.field1501 / 32 - class37.field848.field1501 / 32;
                    int var14 = var12.field1446 / 32 - class37.field848.field1446 / 32;
                    class45.method355(class74.field1646[1], (byte) 26, var13, var14);
                }
            }
            if (class110.field2314 == 2) {
                int var15 = (class88.field1946 - class18.field366) * 4 + 2 - class37.field848.field1446 / 32;
                int var16 = (class34.field767 - class87.field1934) * 4 + 2 - class37.field848.field1501 / 32;
                class45.method355(class74.field1646[1], (byte) 26, var16, var15);
            }
            if (class110.field2314 == 10 && class90.field1986 >= 0 && class129.field2779.length > class90.field1986) {
                class43 var17 = class129.field2779[class90.field1986];
                if (var17 != null) {
                    int var18 = var17.field1446 / 32 - class37.field848.field1446 / 32;
                    int var19 = var17.field1501 / 32 - class37.field848.field1501 / 32;
                    class45.method355(class74.field1646[1], (byte) 26, var19, var18);
                }
            }
        }
        if (class127.field2750 != 0) {
            int var20 = class27.field585 * 4 + 2 - class37.field848.field1501 / 32;
            int var21 = class127.field2750 * 4 + 2 - class37.field848.field1446 / 32;
            class63.method511((byte) 49, class74.field1646[0], var20, var21);
        }
        class120.method915(97, 78, 3, 3, 16777215);
        class129.method987(-97, class117.field2493);
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(B)I")
    public static final int method682(byte arg0) {
        field2118++;
        if (arg0 >= -11) {
            method682((byte) -47);
        }
        return client.field394++;
    }

    @OriginalMember(owner = "client!q", name = "c", descriptor = "(B)V")
    public static final void method683(byte arg0) {
        if (arg0 > 23) {
            class61.field1353.method659(1000);
            field2101++;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIII)I")
    public static final int method684(int arg0, int arg1, int arg2, int arg3) {
        field2117++;
        int var4 = arg0 / arg2;
        int var5 = arg2 - 1 & arg0;
        int var6 = arg1 / arg2;
        int var7 = arg2 - 1 & arg1;
        int var8 = class50.method404(var4, 78, var6);
        if (arg3 != -29801) {
            method681((byte) 62);
        }
        int var9 = class50.method404(var4 + 1, arg3 ^ 0xFFFF8BA6, var6);
        int var10 = class50.method404(var4, 53, var6 + 1);
        int var11 = class50.method404(var4 + 1, 44, var6 + 1);
        int var12 = class74.method577(var9, var8, var5, arg2, 440927440);
        int var13 = class74.method577(var11, var10, var5, arg2, 440927440);
        return class74.method577(var13, var12, var7, arg2, 440927440);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "([BIZII)V")
    public static final void method685(byte[] arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field2119++;
        if (arg3 != -15947) {
            field2114 = 76;
        }
        if (class5.field82 >= 0) {
            arg4 -= 20;
            if (arg4 < 1) {
                arg4 = 1;
            }
            class32.field689 = arg4;
            if (class5.field82 == 0) {
                class32.field690 = 0;
            } else {
                int var5 = class127.method969(class5.field82, 25);
                int var6 = var5 - class18.field360;
                class32.field690 = (class32.field690 + var6 + 3600 - 1) / class32.field690;
            }
            class87.field1939 = arg1;
            class21.field485 = arg2;
            class37.field830 = arg0;
        } else if (class32.field689 == 0) {
            class77.method587(arg0, 121, arg1, arg2);
        } else {
            class21.field485 = arg2;
            class87.field1939 = arg1;
            class37.field830 = arg0;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Z)V")
    public static void method686(boolean arg0) {
        field2094 = null;
        field2107 = null;
        field2104 = null;
        field2108 = null;
        field2099 = null;
        field2086 = null;
        field2103 = null;
        field2110 = null;
        if (arg0) {
            method684(-36, -45, 13, -124);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
    public static final void method687(int arg0) {
        class56.field1282.method158((byte) -6);
        int var1 = class56.field1282.method159(0, 1);
        field2095++;
        if (arg0 != 3 || var1 == 0) {
            return;
        }
        int var2 = class56.field1282.method159(arg0 ^ 0x3, 2);
        if (var2 == 0) {
            class25.field557[class16.field306++] = 2047;
        } else if (var2 == 1) {
            int var3 = class56.field1282.method159(arg0 - 3, 3);
            class37.field848.method523(var3, false, -2);
            int var4 = class56.field1282.method159(0, 1);
            if (var4 == 1) {
                class25.field557[class16.field306++] = 2047;
            }
        } else if (var2 == 2) {
            int var5 = class56.field1282.method159(0, 3);
            class37.field848.method523(var5, true, -2);
            int var6 = class56.field1282.method159(0, 3);
            class37.field848.method523(var6, true, -2);
            int var7 = class56.field1282.method159(0, 1);
            if (var7 == 1) {
                class25.field557[class16.field306++] = 2047;
            }
        } else if (var2 == 3) {
            int var8 = class56.field1282.method159(0, 7);
            class122.field2657 = class56.field1282.method159(0, 2);
            int var9 = class56.field1282.method159(0, 1);
            if (var9 == 1) {
                class25.field557[class16.field306++] = 2047;
            }
            int var10 = class56.field1282.method159(0, 1);
            int var11 = class56.field1282.method159(0, 7);
            class37.field848.method519(arg0 + 61, var10 == 1, var8, var11);
        }
    }
}
