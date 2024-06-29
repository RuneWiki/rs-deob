import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class177 {

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "I")
    public int field2156 = 0;

    @OriginalMember(owner = "client!hi", name = "o", descriptor = "Z")
    public boolean field2164 = false;

    @OriginalMember(owner = "client!hi", name = "k", descriptor = "I")
    public int field2160 = 2;

    @OriginalMember(owner = "client!hi", name = "u", descriptor = "I")
    public int field2170 = -1;

    @OriginalMember(owner = "client!hi", name = "s", descriptor = "I")
    public int field2168 = -1;

    @OriginalMember(owner = "client!hi", name = "t", descriptor = "I")
    public int field2169 = -1;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "Z")
    public boolean field2153 = false;

    @OriginalMember(owner = "client!hi", name = "r", descriptor = "I")
    public int field2167 = -1;

    @OriginalMember(owner = "client!hi", name = "x", descriptor = "Z")
    public boolean field2173 = false;

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "I")
    public int field2155 = -1;

    @OriginalMember(owner = "client!hi", name = "D", descriptor = "I")
    public int field2179 = 99;

    @OriginalMember(owner = "client!hi", name = "l", descriptor = "I")
    public int field2161 = 5;

    @OriginalMember(owner = "client!hi", name = "E", descriptor = "Z")
    public boolean field2180 = false;

    @OriginalMember(owner = "client!hi", name = "G", descriptor = "Z")
    public static boolean field2182 = false;

    @OriginalMember(owner = "client!hi", name = "H", descriptor = "Lea;")
    public static class474 field2183;

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "I")
    public static int field2152;

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "I")
    public static int field2154;

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "I")
    public static int field2158;

    @OriginalMember(owner = "client!hi", name = "m", descriptor = "I")
    public static int field2162;

    @OriginalMember(owner = "client!hi", name = "n", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!hi", name = "p", descriptor = "I")
    public static int field2165;

    @OriginalMember(owner = "client!hi", name = "q", descriptor = "I")
    public int field2166;

    @OriginalMember(owner = "client!hi", name = "v", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!hi", name = "y", descriptor = "I")
    public static int field2174;

    @OriginalMember(owner = "client!hi", name = "z", descriptor = "I")
    public static int field2175;

    @OriginalMember(owner = "client!hi", name = "A", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!hi", name = "B", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!hi", name = "C", descriptor = "I")
    public static int field2178;

    @OriginalMember(owner = "client!hi", name = "I", descriptor = "Le;")
    public static class462 field2184;

    @OriginalMember(owner = "client!hi", name = "w", descriptor = "Lqi;")
    public class494 field2172;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "[I")
    public int[] field2150;

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "[I")
    private int[] field2151;

    @OriginalMember(owner = "client!hi", name = "F", descriptor = "[I")
    public int[] field2181;

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "[Z")
    public boolean[] field2157;

    @OriginalMember(owner = "client!hi", name = "j", descriptor = "[[I")
    public int[][] field2159;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "([IB)Ljava/lang/String;")
    public static final String method1000(int[] arg0, byte arg1) {
        if (arg1 != -83) {
            method1010((byte) 82);
        }
        field2162++;
        StringBuffer var2 = new StringBuffer();
        int var3 = class421.field6305;
        for (int var4 = 0; var4 < arg0.length; var4++) {
            class165 var5 = class122.field1533.method3136(arg0[var4], (byte) -70);
            if (var5.field2021 != -1) {
                class433 var6 = (class433) class428.field6354.method1801(0, (long) var5.field2021);
                if (var6 == null) {
                    class372 var7 = class372.method2398(class319.field4621, var5.field2021, 0);
                    if (var7 != null) {
                        var6 = class413.field6264.method388(var7, true);
                        class428.field6354.method1808((long) var5.field2021, var6, (byte) -25);
                    }
                }
                if (var6 != null) {
                    class286.field3960[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    var3++;
                }
            }
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lbk;I)V")
    public static final void method1001(class317 arg0, int arg1) {
        if (arg1 != 0) {
            field2183 = null;
        }
        if (arg0.field4610 != null) {
            arg0.field4610.field5777 = 0;
        }
        arg0.field4611 = false;
        field2178++;
        for (class317 var2 = arg0.method926(); var2 != null; var2 = arg0.method925()) {
            method1001(var2, 0);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)Z")
    public static final boolean method1002(int arg0) throws IOException {
        field2158++;
        if (class170.field2077 == null) {
            return false;
        }
        if (class118.field1475 == null) {
            if (class591.field8486) {
                if (!class170.field2077.method1846(3139, 1)) {
                    return false;
                }
                class170.field2077.method1843(0, 1, class46.field498.field2622, 1);
                class306.field4513++;
                class52.field547 = 0;
                class591.field8486 = false;
            }
            class46.field498.field2610 = 0;
            if (class46.field498.method3669(255)) {
                if (!class170.field2077.method1846(3139, 1)) {
                    return false;
                }
                class170.field2077.method1843(1, 1, class46.field498.field2622, 1);
                class306.field4513++;
                class52.field547 = 0;
            }
            class591.field8486 = true;
            class206[] var1 = class215.method1422(-94);
            int var2 = class46.field498.method3680(true);
            if (var2 < 0 || var2 >= var1.length) {
                throw new IOException("invo:" + var2 + " ip:" + class46.field498.field2610);
            }
            class118.field1475 = var1[var2];
            class32.field372 = class118.field1475.field2765;
        }
        if (class32.field372 == -1) {
            if (!class170.field2077.method1846(3139, 1)) {
                return false;
            }
            class170.field2077.method1843(0, 1, class46.field498.field2622, 1);
            class32.field372 = class46.field498.field2622[0] & 0xFF;
            class306.field4513++;
            class52.field547 = 0;
        }
        if (class32.field372 == -2) {
            if (!class170.field2077.method1846(arg0 ^ 0xC43, 2)) {
                return false;
            }
            class170.field2077.method1843(0, 1, class46.field498.field2622, 2);
            class46.field498.field2610 = 0;
            class32.field372 = class46.field498.method1220(-95);
            class52.field547 = 0;
            class306.field4513 += 2;
        }
        if (arg0 < class32.field372) {
            if (!class170.field2077.method1846(3139, class32.field372)) {
                return false;
            }
            class46.field498.field2610 = 0;
            class170.field2077.method1843(0, arg0 ^ 0x1, class46.field498.field2622, class32.field372);
            class306.field4513 += class32.field372;
            class52.field547 = 0;
        }
        class592.field8497 = class379.field5763;
        class379.field5763 = class247.field3507;
        class247.field3507 = class118.field1475;
        if (class456.field6830 == class118.field1475) {
            String var3 = class46.field498.method1218(false);
            int var4 = class46.field498.method1195((byte) -125);
            int var5 = class46.field498.method1239((byte) -50);
            if (class259.method1726(var4, true)) {
                class59.method427((byte) 35, var3, var5);
            }
            class118.field1475 = null;
            return true;
        } else if (class402.field6086 == class118.field1475) {
            String var6 = class46.field498.method1218(false);
            String var7 = class220.method1435(arg0 ^ 0x33C, class90.method577(class46.field498, 76));
            class117.method726(var6, -1, 0, var7, var6, 6, var6);
            class118.field1475 = null;
            return true;
        } else if (class258.field3676 == class118.field1475) {
            int var8 = class46.field498.method1194(25034);
            int var9 = class46.field498.method1177(255);
            int var10 = class46.field498.method1197(true);
            if (class259.method1726(var10, true)) {
                class518.method3067(var9, true, var8);
            }
            class118.field1475 = null;
            return true;
        } else if (class118.field1475 == class102.field1221) {
            class45.method237(2, class421.field6301);
            class118.field1475 = null;
            return true;
        } else if (class616.field8957 == class118.field1475) {
            int var11 = class46.field498.method1220(125);
            if (var11 == 65535) {
                var11 = -1;
            }
            int var12 = class46.field498.method1177(255);
            int var13 = class46.field498.method1220(-95);
            int var14 = class46.field498.method1177(255);
            class173.method994(var14, var11, -9368, true, var13, var12);
            class118.field1475 = null;
            return true;
        } else if (class596.field8714 == class118.field1475) {
            int var15 = class46.field498.method1220(-14);
            int var16 = class46.field498.method1195((byte) -126);
            if (var16 == 65535) {
                var16 = -1;
            }
            int var17 = class46.field498.method1178(-230315992);
            if (class259.method1726(var15, true)) {
                class231.method1489(2, true, -1, var17, var16);
            }
            class118.field1475 = null;
            return true;
        } else if (class453.field6767 == class118.field1475) {
            class557.method3230(-99);
            class118.field1475 = null;
            return true;
        } else if (class13.field107 == class118.field1475) {
            int var18 = class46.field498.method1220(arg0 ^ 0xFFFFFF93);
            int var19 = class46.field498.method1195((byte) -127);
            int var20 = class46.field498.method1197(true);
            if (class259.method1726(var18, true)) {
                class296.method1984(var19, var20, 124, 0);
            }
            class118.field1475 = null;
            return true;
        } else if (class596.field8713 == class118.field1475) {
            int var21 = class46.field498.method1220(arg0 ^ 0xFFFFFF9E);
            int var22 = class46.field498.method1177(255);
            int var23 = class46.field498.method1177(arg0 ^ 0xFF);
            int var24 = class46.field498.method1220(117) << 2;
            int var25 = class46.field498.method1177(255);
            int var26 = class46.field498.method1177(arg0 ^ 0xFF);
            if (class259.method1726(var21, true)) {
                class200.method1272(var22, arg0 - 124, var25, var23, var26, var24);
            }
            class118.field1475 = null;
            return true;
        } else if (class194.field2633 == class118.field1475) {
            int var27 = class46.field498.method1195((byte) -126);
            if (var27 == 65535) {
                var27 = -1;
            }
            int var28 = class46.field498.method1197(true);
            if (var28 == 65535) {
                var28 = -1;
            }
            int var29 = class46.field498.method1191(-125);
            int var30 = class46.field498.method1197(true);
            int var31 = class46.field498.method1194(25034);
            if (class259.method1726(var30, true)) {
                for (int var32 = var27; var32 <= var28; var32++) {
                    long var33 = ((long) var31 << 32) + ((long) var32);
                    class271 var35 = (class271) class547.field7835.method524((byte) 89, var33);
                    class271 var36;
                    if (var35 != null) {
                        var36 = new class271(var29, var35.field3804);
                        var35.method2108(true);
                    } else if (var32 == -1) {
                        var36 = new class271(var29, class259.method1728(40, var31).field8623.field3804);
                    } else {
                        var36 = new class271(var29, -1);
                    }
                    class547.field7835.method520((byte) -61, var36, var33);
                }
            }
            class118.field1475 = null;
            return true;
        } else if (class123.field1535 == class118.field1475) {
            int var37 = class46.field498.method1177(arg0 + 255);
            if (class46.field498.method1177(255) == 0) {
                class330.field4743[var37] = new class151();
            } else {
                class46.field498.field2610--;
                class330.field4743[var37] = new class151(class46.field498);
            }
            class208.field2793 = class240.field3406;
            class118.field1475 = null;
            return true;
        } else if (class329.field4741 == class118.field1475) {
            boolean var38 = class46.field498.method1177(255) == 1;
            byte[] var39 = new byte[class32.field372 - 1];
            class46.field498.method1200(var39, (byte) -3, 0, class32.field372 - 1);
            class409.method2587(var38, 20000, var39);
            class118.field1475 = null;
            return true;
        } else if (class359.field5093 == class118.field1475) {
            int var40 = class46.field498.method1239((byte) -86);
            int var41 = class46.field498.method1239((byte) -40);
            int var42 = class46.field498.method1234((byte) -118);
            if (class259.method1726(var41, true)) {
                class603.method3504(var40, var42, (byte) -116);
            }
            class118.field1475 = null;
            return true;
        } else if (class2.field13 == class118.field1475) {
            int var43 = class46.field498.method1220(arg0 + 115);
            int var44 = class46.field498.method1194(25034);
            String var45 = class46.field498.method1218(false);
            if (class259.method1726(var43, true)) {
                class169.method969(var44, arg0 + 3, var45);
            }
            class118.field1475 = null;
            return true;
        } else if (class213.field2928 == class118.field1475) {
            boolean var46 = class46.field498.method1177(255) == 1;
            String var47 = class46.field498.method1218(false);
            String var48 = var47;
            if (var46) {
                var48 = class46.field498.method1218(false);
            }
            long var49 = class46.field498.method1184(-82);
            long var51 = (long) class46.field498.method1220(-49);
            long var53 = (long) class46.field498.method1180(arg0 - 832631516);
            int var55 = class46.field498.method1177(255);
            int var56 = class46.field498.method1220(-36);
            long var57 = (var51 << 32) + var53;
            boolean var59 = false;
            int var60 = 0;
            while (true) {
                if (var60 >= 100) {
                    if (var55 <= 1 && class194.method1187(arg0 ^ 0xFFFFFF83, var48)) {
                        var59 = true;
                    }
                    break;
                }
                if (class622.field8998[var60] == var57) {
                    var59 = true;
                    break;
                }
                var60++;
            }
            if (!var59 && class206.field2769 == 0) {
                class622.field8998[class155.field1925] = var57;
                class155.field1925 = (class155.field1925 + 1) % 100;
                String var61 = class498.field7255.method3401(-1, var56).method626(-88, class46.field498);
                if (var55 == 2) {
                    class342.method2200(var47, "<img=1>" + var48, 0, var61, var56, "<img=1>" + var47, (byte) -86, 20, class111.method684(0, var49));
                } else if (var55 == 1) {
                    class342.method2200(var47, "<img=0>" + var48, 0, var61, var56, "<img=0>" + var47, (byte) -119, 20, class111.method684(0, var49));
                } else {
                    class342.method2200(var47, var48, 0, var61, var56, var47, (byte) -24, 20, class111.method684(0, var49));
                }
            }
            class118.field1475 = null;
            return true;
        } else if (class489.field7131 == class118.field1475) {
            while (class32.field372 > class46.field498.field2610) {
                boolean var72 = class46.field498.method1177(255) == 1;
                String var73 = class46.field498.method1218(false);
                String var74 = class46.field498.method1218(false);
                int var75 = class46.field498.method1220(-68);
                int var76 = class46.field498.method1177(255);
                String var77 = "";
                boolean var78 = false;
                if (var75 > 0) {
                    var77 = class46.field498.method1218(false);
                    var78 = class46.field498.method1177(255) == 1;
                }
                for (int var79 = 0; var79 < class602.field8781; var79++) {
                    if (var72) {
                        if (var74.equals(class37.field408[var79])) {
                            class37.field408[var79] = var73;
                            var73 = null;
                            class546.field7812[var79] = var74;
                            break;
                        }
                    } else if (var73.equals(class37.field408[var79])) {
                        if (class248.field3519[var79] != var75) {
                            boolean var80 = true;
                            for (class541 var81 = (class541) class201.field2689.method3297((byte) 96); var81 != null; var81 = (class541) class201.field2689.method3296((byte) -110)) {
                                if (var81.field7753.equals(var73)) {
                                    if (var75 != 0 && var81.field7755 == 0) {
                                        var81.method3488(false);
                                        var80 = false;
                                    } else if (var75 == 0 && var81.field7755 != 0) {
                                        var81.method3488(false);
                                        var80 = false;
                                    }
                                }
                            }
                            if (var80) {
                                class201.field2689.method3293(new class541(var73, var75), (byte) 89);
                            }
                            class248.field3519[var79] = var75;
                        }
                        class546.field7812[var79] = var74;
                        class32.field361[var79] = var77;
                        class356.field5075[var79] = var76;
                        class163.field1994[var79] = var78;
                        var73 = null;
                        break;
                    }
                }
                if (var73 != null && class602.field8781 < 200) {
                    class37.field408[class602.field8781] = var73;
                    class546.field7812[class602.field8781] = var74;
                    class248.field3519[class602.field8781] = var75;
                    class32.field361[class602.field8781] = var77;
                    class356.field5075[class602.field8781] = var76;
                    class163.field1994[class602.field8781] = var78;
                    class602.field8781++;
                }
            }
            class236.field3383 = class240.field3406;
            class24.field257 = 2;
            boolean var62 = false;
            int var63 = class602.field8781;
            while (var63 > 0) {
                boolean var64 = true;
                var63--;
                for (int var65 = 0; var65 < var63; var65++) {
                    if (class248.field3519[var65] != class461.field6876.field1603 && class248.field3519[var65 + 1] == class461.field6876.field1603 || class248.field3519[var65] == 0 && class248.field3519[var65 + 1] != 0) {
                        int var66 = class248.field3519[var65];
                        class248.field3519[var65] = class248.field3519[var65 + 1];
                        class248.field3519[var65 + 1] = var66;
                        String var67 = class32.field361[var65];
                        class32.field361[var65] = class32.field361[var65 + 1];
                        class32.field361[var65 + 1] = var67;
                        String var68 = class37.field408[var65];
                        class37.field408[var65] = class37.field408[var65 + 1];
                        class37.field408[var65 + 1] = var68;
                        String var69 = class546.field7812[var65];
                        class546.field7812[var65] = class546.field7812[var65 + 1];
                        class546.field7812[var65 + 1] = var69;
                        int var70 = class356.field5075[var65];
                        class356.field5075[var65] = class356.field5075[var65 + 1];
                        class356.field5075[var65 + 1] = var70;
                        boolean var71 = class163.field1994[var65];
                        class163.field1994[var65] = class163.field1994[var65 + 1];
                        class163.field1994[var65 + 1] = var71;
                        var64 = false;
                    }
                }
                if (var64) {
                    break;
                }
            }
            class118.field1475 = null;
            return true;
        } else if (class628.field9070 == class118.field1475) {
            int var82 = class46.field498.method1220(-73);
            String var83 = class46.field498.method1218(false);
            Object[] var84 = new Object[var83.length() + 1];
            for (int var85 = var83.length() - 1; var85 >= 0; var85--) {
                if (var83.charAt(var85) == 's') {
                    var84[var85 + 1] = class46.field498.method1218(false);
                } else {
                    var84[var85 + 1] = Integer.valueOf(class46.field498.method1178(class92.method583(arg0, -230315992)));
                }
            }
            var84[0] = Integer.valueOf(class46.field498.method1178(-230315992));
            if (class259.method1726(var82, true)) {
                class86 var86 = new class86();
                var86.field985 = var84;
                class604.method3516(var86);
            }
            class118.field1475 = null;
            return true;
        } else if (class58.field665 == class118.field1475) {
            method1007((byte) -50, class242.field3435);
            class118.field1475 = null;
            return false;
        } else if (class331.field4765 == class118.field1475) {
            int var87 = class46.field498.method1220(-22);
            int var88 = class46.field498.method1177(255);
            int var89 = class46.field498.method1177(arg0 ^ 0xFF);
            int var90 = class46.field498.method1177(255);
            int var91 = class46.field498.method1177(255);
            int var92 = class46.field498.method1220(-68);
            if (class259.method1726(var87, true)) {
                class126.field1553[var88] = true;
                class574.field8284[var88] = var89;
                class481.field7066[var88] = var90;
                class146.field1799[var88] = var91;
                class561.field8014[var88] = var92;
            }
            class118.field1475 = null;
            return true;
        } else if (class639.field9183 == class118.field1475) {
            int var93 = class46.field498.method1220(122);
            int var94 = class46.field498.method1239((byte) -103);
            int var95 = class46.field498.method1197(true);
            int var96 = class46.field498.method1239((byte) -127);
            int var97 = class46.field498.method1178(-230315992);
            if (class259.method1726(var96, true)) {
                class231.method1489(7, true, var95, var97, var93 << 16 | var94);
            }
            class118.field1475 = null;
            return true;
        } else if (class547.field7833 == class118.field1475) {
            class45.method237(2, class135.field1690);
            class118.field1475 = null;
            return true;
        } else if (class484.field7087 == class118.field1475) {
            int var98 = class46.field498.method1177(255);
            int var99 = var98 >> 5;
            int var100 = var98 & 0x1F;
            if (var100 == 0) {
                class13.field117[var99] = null;
                class118.field1475 = null;
                return true;
            }
            class360 var101 = new class360();
            var101.field5102 = var100;
            var101.field5107 = class46.field498.method1177(255);
            if (var101.field5107 >= 0 && class633.field9109.length > var101.field5107) {
                if (var101.field5102 == 1 || var101.field5102 == 10) {
                    var101.field5105 = class46.field498.method1220(arg0 ^ 0xFFFFFF9D);
                    class46.field498.field2610 += 6;
                } else if (var101.field5102 >= 2 && var101.field5102 <= 6) {
                    if (var101.field5102 == 2) {
                        var101.field5096 = 256;
                        var101.field5101 = 256;
                    }
                    if (var101.field5102 == 3) {
                        var101.field5096 = 256;
                        var101.field5101 = 0;
                    }
                    if (var101.field5102 == 4) {
                        var101.field5101 = 512;
                        var101.field5096 = 256;
                    }
                    if (var101.field5102 == 5) {
                        var101.field5101 = 256;
                        var101.field5096 = 0;
                    }
                    if (var101.field5102 == 6) {
                        var101.field5096 = 512;
                        var101.field5101 = 256;
                    }
                    var101.field5102 = 2;
                    var101.field5097 = class46.field498.method1177(255);
                    var101.field5101 += class46.field498.method1220(arg0 ^ 0x76) - class287.field3980 << 9;
                    var101.field5096 += class46.field498.method1220(113) - class250.field3549 << 9;
                    var101.field5106 = class46.field498.method1177(arg0 + 255) << 2;
                    var101.field5098 = class46.field498.method1220(-52);
                }
                var101.field5095 = class46.field498.method1220(-76);
                if (var101.field5095 == 65535) {
                    var101.field5095 = -1;
                }
                class13.field117[var99] = var101;
            }
            class118.field1475 = null;
            return true;
        } else if (class289.field4005 == class118.field1475) {
            class45.method237(arg0 ^ 0x2, class93.field1096);
            class118.field1475 = null;
            return true;
        } else if (class271.field3796 == class118.field1475) {
            method1007((byte) -50, false);
            class118.field1475 = null;
            return false;
        } else if (class17.field171 == class118.field1475) {
            int var102 = class46.field498.method1176((byte) 127);
            int var103 = class46.field498.method1178(-230315992);
            int var104 = class46.field498.method1177(255);
            String var105 = "";
            String var106 = var105;
            if ((var104 & 0x1) != 0) {
                var105 = class46.field498.method1218(false);
                if ((var104 & 0x2) == 0) {
                    var106 = var105;
                } else {
                    var106 = class46.field498.method1218(false);
                }
            }
            String var107 = class46.field498.method1218(false);
            if (var102 == 99) {
                class348.method2221(arg0 + 30742, var107);
            } else if (var106.equals("") || !class194.method1187(-97, var106)) {
                class117.method726(var105, ~arg0, var103, var107, var105, var102, var106);
            } else {
                class118.field1475 = null;
                return true;
            }
            class118.field1475 = null;
            return true;
        } else if (class404.field6106 == class118.field1475) {
            class45.method237(2, class351.field5012);
            class118.field1475 = null;
            return true;
        } else if (class155.field1924 == class118.field1475) {
            String var108 = class46.field498.method1218(false);
            boolean var109 = class46.field498.method1177(255) == 1;
            String var110;
            if (var109) {
                var110 = class46.field498.method1218(false);
            } else {
                var110 = var108;
            }
            int var111 = class46.field498.method1220(arg0 - 58);
            byte var112 = class46.field498.method1213((byte) 43);
            boolean var113 = false;
            if (var112 == -128) {
                var113 = true;
            }
            if (var113) {
                if (class294.field4252 == 0) {
                    class118.field1475 = null;
                    return true;
                }
                boolean var119 = false;
                int var120;
                for (var120 = 0; class294.field4252 > var120 && (!class538.field7747[var120].field7618.equals(var110) || class538.field7747[var120].field7617 != var111); var120++) {
                }
                if (var120 < class294.field4252) {
                    while ((class294.field4252 - 1) > var120) {
                        class538.field7747[var120] = class538.field7747[var120 + 1];
                        var120++;
                    }
                    class294.field4252--;
                    class538.field7747[class294.field4252] = null;
                }
            } else {
                String var114 = class46.field498.method1218(false);
                class525 var115 = new class525();
                var115.field7618 = var110;
                var115.field7622 = var108;
                var115.field7623 = class207.method1323(32682, var115.field7618);
                var115.field7617 = var111;
                var115.field7621 = var114;
                var115.field7619 = var112;
                int var116;
                for (var116 = class294.field4252 - 1; var116 >= 0; var116--) {
                    int var117 = class538.field7747[var116].field7623.compareTo(var115.field7623);
                    if (var117 == 0) {
                        class538.field7747[var116].field7617 = var111;
                        class538.field7747[var116].field7619 = var112;
                        class538.field7747[var116].field7621 = var114;
                        if (var110.equals(class439.field6548.field9452)) {
                            class260.field3708 = var112;
                        }
                        class118.field1475 = null;
                        class218.field2997 = class240.field3406;
                        return true;
                    }
                    if (var117 < 0) {
                        break;
                    }
                }
                if (class294.field4252 >= class538.field7747.length) {
                    class118.field1475 = null;
                    return true;
                }
                for (int var118 = class294.field4252 - 1; var118 > var116; var118--) {
                    class538.field7747[var118 + 1] = class538.field7747[var118];
                }
                if (class294.field4252 == 0) {
                    class538.field7747 = new class525[100];
                }
                class538.field7747[var116 + 1] = var115;
                class294.field4252++;
                if (var110.equals(class439.field6548.field9452)) {
                    class260.field3708 = var112;
                }
            }
            class118.field1475 = null;
            class218.field2997 = class240.field3406;
            return true;
        } else if (class385.field5884 == class118.field1475) {
            class45.method237(2, class390.field5968);
            class118.field1475 = null;
            return true;
        } else if (class509.field7409 == class118.field1475) {
            int var121 = class46.field498.method1220(arg0 ^ 0x71);
            int var122 = class46.field498.method1195((byte) -128);
            int var123 = class46.field498.method1190(false);
            int var124 = class46.field498.method1194(25034);
            if (class259.method1726(var121, true)) {
                class563 var125 = (class563) class234.field3309.method524((byte) 117, (long) var124);
                if (var125 != null) {
                    class292.method1885(false, var125.field8022 != var122, (byte) -72, var125);
                }
                class351.method2227(var122, 0, var124, var123, false);
            }
            class118.field1475 = null;
            return true;
        } else if (class651.field9391 == class118.field1475) {
            int var126 = class46.field498.method1191(arg0 - 87);
            int var127 = class46.field498.method1220(arg0 ^ 0xFFFFFFE3);
            int var128 = class46.field498.method1178(-230315992);
            int var129 = class46.field498.method1195((byte) -125);
            if (class259.method1726(var129, true)) {
                class231.method1489(5, true, var128, var126, var127);
            }
            class118.field1475 = null;
            return true;
        } else if (class251.field3558 == class118.field1475) {
            int var130 = class46.field498.method1220(122);
            int var131 = class46.field498.method1177(255);
            boolean var132 = (var131 & 0x1) == 1;
            class543.method3156(var132, false, var130);
            int var133 = class46.field498.method1220(-66);
            for (int var134 = 0; var134 < var133; var134++) {
                int var135 = class46.field498.method1239((byte) -3);
                int var136 = class46.field498.method1209(-24738);
                if (var136 == 255) {
                    var136 = class46.field498.method1191(-45);
                }
                class620.method3566(var130, var136, -1, var132, var135 - 1, var134);
            }
            class365.field5527[class643.method3659(class509.field7407++, 31)] = var130;
            class118.field1475 = null;
            return true;
        } else if (class637.field9163 == class118.field1475) {
            boolean var137 = class46.field498.method1177(arg0 ^ 0xFF) == 1;
            String var138 = class46.field498.method1218(false);
            String var139 = var138;
            if (var137) {
                var139 = class46.field498.method1218(false);
            }
            long var140 = class46.field498.method1184(-110);
            long var142 = (long) class46.field498.method1220(125);
            long var144 = (long) class46.field498.method1180(-832631516);
            int var146 = class46.field498.method1177(arg0 ^ 0xFF);
            long var147 = (var142 << 32) + var144;
            boolean var149 = false;
            int var150 = 0;
            while (true) {
                if (var150 >= 100) {
                    if (var146 <= 1) {
                        if (!(!class345.field4944 || class220.field3004) || class647.field9366) {
                            var149 = true;
                        } else if (class194.method1187(arg0 - 97, var139)) {
                            var149 = true;
                        }
                    }
                    break;
                }
                if (class622.field8998[var150] == var147) {
                    var149 = true;
                    break;
                }
                var150++;
            }
            if (!var149 && class206.field2769 == 0) {
                class622.field8998[class155.field1925] = var147;
                class155.field1925 = (class155.field1925 + 1) % 100;
                String var151 = class220.method1435(828, class90.method577(class46.field498, 35));
                if (var146 == 2 || var146 == 3) {
                    class342.method2200(var138, "<img=1>" + var139, 0, var151, -1, "<img=1>" + var138, (byte) -70, 9, class111.method684(0, var140));
                } else if (var146 == 1) {
                    class342.method2200(var138, "<img=0>" + var139, 0, var151, -1, "<img=0>" + var138, (byte) -36, 9, class111.method684(0, var140));
                } else {
                    class342.method2200(var138, var139, 0, var151, -1, var138, (byte) -77, 9, class111.method684(arg0, var140));
                }
            }
            class118.field1475 = null;
            return true;
        } else if (class445.field6661 == class118.field1475) {
            class281.method1830(arg0);
            class118.field1475 = null;
            return false;
        } else if (class309.field4553 == class118.field1475) {
            int var152 = class46.field498.method1233(65280);
            int var153 = class46.field498.method1208(65536);
            int var154 = class46.field498.method1194(25034);
            int var155 = class46.field498.method1197(true);
            if (class259.method1726(var155, true)) {
                class635.method3625(var154, var152, var153, (byte) -55);
            }
            class118.field1475 = null;
            return true;
        } else if (class157.field1943 == class118.field1475) {
            if (class375.field5714 != null) {
                class225.method1465(-1, class595.field8694.field6543, false, -43, -1);
            }
            byte[] var156 = new byte[class32.field372];
            class46.field498.method3679((byte) 123, class32.field372, var156, 0);
            String var157 = class79.method514(0, var156, arg0 ^ 0x1, class32.field372);
            class434.method2714(class20.field197, class81.field908 == 1, true, arg0 ^ 0x5429, var157);
            class118.field1475 = null;
            return true;
        } else if (class149.field1845 == class118.field1475) {
            class45.method237(2, class72.field774);
            class118.field1475 = null;
            return true;
        } else if (class385.field5883 == class118.field1475) {
            if (class518.field7542 != -1) {
                class244.method1626(0, -24494, class518.field7542);
            }
            class118.field1475 = null;
            return true;
        } else if (class600.field8759 == class118.field1475) {
            int var158 = class46.field498.method1191(-86);
            int var159 = var158 >> 28 & 0x3;
            int var160 = var158 >> 14 & 0x3FFF;
            int var161 = var158 & 0x3FFF;
            int var162 = class46.field498.method1197(true);
            if (var162 == 65535) {
                var162 = -1;
            }
            int var163 = class46.field498.method1226(128);
            int var164 = var163 >> 2;
            int var165 = var163 & 0x3;
            int var166 = class547.field7838[var164];
            int var167 = var161 - class250.field3549;
            int var168 = var160 - class287.field3980;
            class139.method835(var159, 128, var162, var165, var164, var166, var167, var168);
            class118.field1475 = null;
            return true;
        } else if (class13.field112 == class118.field1475) {
            int var169 = class46.field498.method1191(arg0 - 105);
            int var170 = class46.field498.method1220(-55);
            int var171 = class46.field498.method1194(25034);
            if (class259.method1726(var170, true)) {
                class563 var172 = (class563) class234.field3309.method524((byte) 94, (long) var171);
                class563 var173 = (class563) class234.field3309.method524((byte) 121, (long) var169);
                if (var173 != null) {
                    class292.method1885(false, var172 == null || var172.field8022 != var173.field8022, (byte) -72, var173);
                }
                if (var172 != null) {
                    var172.method2108(true);
                    class234.field3309.method520((byte) -103, var172, (long) var169);
                }
                class593 var174 = class259.method1728(40, var171);
                if (var174 != null) {
                    class33.method187(var174, (byte) -109);
                }
                class593 var175 = class259.method1728(40, var169);
                if (var175 != null) {
                    class33.method187(var175, (byte) 102);
                    class471.method2880(true, var175, 10);
                }
                if (class518.field7542 != -1) {
                    class244.method1626(1, arg0 - 24494, class518.field7542);
                }
            }
            class118.field1475 = null;
            return true;
        } else if (class564.field8044 == class118.field1475) {
            int var176 = class46.field498.method1220(117);
            int var177 = class46.field498.method1220(113);
            int var178 = class46.field498.method1220(-21);
            int var179 = class46.field498.method1220(119);
            if (class259.method1726(var176, true) && class297.field4403[var177] != null) {
                for (int var180 = var178; var180 < var179; var180++) {
                    int var181 = class46.field498.method1180(arg0 - 832631516);
                    if (class297.field4403[var177].length > var180 && class297.field4403[var177][var180] != null) {
                        class297.field4403[var177][var180].field8532 = var181;
                    }
                }
            }
            class118.field1475 = null;
            return true;
        } else if (class475.field7022 == class118.field1475) {
            String var182 = class46.field498.method1218(false);
            int var183 = class46.field498.method1239((byte) -104);
            int var184 = class46.field498.method1197(true);
            if (class259.method1726(var183, true)) {
                class59.method427((byte) 125, var182, var184);
            }
            class118.field1475 = null;
            return true;
        } else if (class40.field442 == class118.field1475) {
            int var185 = class46.field498.method1220(120);
            int var186 = class46.field498.method1239((byte) -114);
            int var187 = class46.field498.method1195((byte) -126);
            int var188 = class46.field498.method1194(25034);
            if (class259.method1726(var185, true)) {
                class645.method3674(var188, (var187 << 16) + var186, 103);
            }
            class118.field1475 = null;
            return true;
        } else if (class13.field114 == class118.field1475) {
            int var189 = class46.field498.method1195((byte) -126);
            int var190 = class46.field498.method1209(arg0 ^ 0xFFFF9F5E);
            if (class259.method1726(var189, true)) {
                class73.field785 = var190;
            }
            class118.field1475 = null;
            return true;
        } else if (class91.field1052 == class118.field1475) {
            int var191 = class46.field498.method1197(true);
            int var192 = class46.field498.method1191(-106);
            int var193 = class46.field498.method1197(true);
            if (class259.method1726(var193, true)) {
                class93.method591(var191, false, var192);
            }
            class118.field1475 = null;
            return true;
        } else if (class298.field4408 == class118.field1475) {
            boolean var194 = class46.field498.method1177(arg0 + 255) == 1;
            String var195 = class46.field498.method1218(false);
            String var196 = var195;
            if (var194) {
                var196 = class46.field498.method1218(false);
            }
            long var197 = (long) class46.field498.method1220(116);
            long var199 = (long) class46.field498.method1180(arg0 ^ 0xCE5F0D24);
            int var201 = class46.field498.method1177(255);
            int var202 = class46.field498.method1220(-108);
            long var203 = (var197 << 32) + var199;
            boolean var205 = false;
            int var206 = 0;
            while (true) {
                if (var206 >= 100) {
                    if (var201 <= 1 && class194.method1187(-84, var196)) {
                        var205 = true;
                    }
                    break;
                }
                if (class622.field8998[var206] == var203) {
                    var205 = true;
                    break;
                }
                var206++;
            }
            if (!var205 && class206.field2769 == 0) {
                class622.field8998[class155.field1925] = var203;
                class155.field1925 = (class155.field1925 + 1) % 100;
                String var207 = class498.field7255.method3401(-1, var202).method626(-92, class46.field498);
                if (var201 == 2) {
                    class342.method2200(var195, "<img=1>" + var196, 0, var207, var202, "<img=1>" + var195, (byte) -96, 18, null);
                } else if (var201 == 1) {
                    class342.method2200(var195, "<img=0>" + var196, 0, var207, var202, "<img=0>" + var195, (byte) -103, 18, null);
                } else {
                    class342.method2200(var195, var196, 0, var207, var202, var195, (byte) -82, 18, null);
                }
            }
            class118.field1475 = null;
            return true;
        } else if (class63.field713 == class118.field1475) {
            class118.field1475 = null;
            return false;
        } else if (class162.field1990 == class118.field1475) {
            int var208 = class46.field498.method1191(arg0 - 57);
            int var209 = class46.field498.method1197(true);
            class23.field243.method3266(var209, var208, arg0 + 28848);
            class118.field1475 = null;
            return true;
        } else if (class543.field7768 == class118.field1475) {
            int var210 = class46.field498.method1195((byte) -127);
            int var211 = class46.field498.method1197(true);
            if (var211 == 65535) {
                var211 = -1;
            }
            int var212 = class46.field498.method1234((byte) 55);
            if (class259.method1726(var210, true)) {
                class311.method2059(var212, var211, 16);
            }
            class118.field1475 = null;
            return true;
        } else if (class517.field7532 == class118.field1475) {
            int var213 = class46.field498.method1234((byte) 84);
            int var214 = class46.field498.method1239((byte) -12);
            if (var214 == 65535) {
                var214 = -1;
            }
            int var215 = class46.field498.method1234((byte) -125);
            int var216 = class46.field498.method1197(true);
            if (class259.method1726(var216, true)) {
                class514.method3049(var214, var215, 9, var213);
                class190 var217 = class622.field8999.method25(var214, arg0 ^ 0xFFFFFFD6);
                class541.method3146(var217.field2393, var215, var217.field2379, var217.field2344, true);
                class616.method3557((byte) 85, var217.field2353, var217.field2416, var215, var217.field2405);
            }
            class118.field1475 = null;
            return true;
        } else if (class418.field6295 == class118.field1475) {
            class225.method1467(class46.field498.method1218(false), -120);
            class118.field1475 = null;
            return true;
        } else if (class98.field1154 == class118.field1475) {
            int var218 = class46.field498.method1177(255);
            boolean var219 = (var218 & 0x1) == 1;
            String var220 = class46.field498.method1218(false);
            String var221 = class46.field498.method1218(false);
            if (var221.equals("")) {
                var221 = var220;
            }
            String var222 = class46.field498.method1218(false);
            String var223 = class46.field498.method1218(false);
            if (var223.equals("")) {
                var223 = var222;
            }
            if (var219) {
                for (int var224 = 0; var224 < class245.field3464; var224++) {
                    if (class104.field1250[var224].equals(var223)) {
                        class601.field8772[var224] = var220;
                        class104.field1250[var224] = var221;
                        class446.field6667[var224] = var222;
                        class378.field5756[var224] = var223;
                        break;
                    }
                }
            } else {
                class601.field8772[class245.field3464] = var220;
                class104.field1250[class245.field3464] = var221;
                class446.field6667[class245.field3464] = var222;
                class378.field5756[class245.field3464] = var223;
                class135.field1688[class245.field3464] = class643.method3659(var218, 2) == 2;
                class245.field3464++;
            }
            class118.field1475 = null;
            class236.field3383 = class240.field3406;
            return true;
        } else if (class118.field1475 == class107.field1279) {
            class45.method237(2, class91.field1041);
            class118.field1475 = null;
            return true;
        } else if (class37.field407 == class118.field1475) {
            String var225 = class46.field498.method1218(false);
            int var226 = class46.field498.method1177(255);
            int var227 = class46.field498.method1190(false);
            int var228 = class46.field498.method1197(true);
            if (var228 == 65535) {
                var228 = -1;
            }
            if (var226 >= 1 && var226 <= 8) {
                if (var225.equalsIgnoreCase("null")) {
                    var225 = null;
                }
                class162.field1983[var226 - 1] = var225;
                class31.field355[var226 - 1] = var228;
                class625.field9032[var226 - 1] = var227 == 0;
            }
            class118.field1475 = null;
            return true;
        } else if (class488.field7113 == class118.field1475) {
            class45.method237(2, class202.field2697);
            class118.field1475 = null;
            return true;
        } else if (class490.field7144 == class118.field1475) {
            int var229 = class46.field498.method1239((byte) 123);
            int var230 = class46.field498.method1234((byte) -117);
            if (class259.method1726(var229, true)) {
                class231.method1489(3, true, -1, var230, -1);
            }
            class118.field1475 = null;
            return true;
        } else if (class276.field3856 == class118.field1475) {
            for (int var231 = 0; var231 < class142.field1749.length; var231++) {
                if (class142.field1749[var231] != null) {
                    class142.field1749[var231].field2502 = -1;
                }
            }
            for (int var232 = 0; var232 < class458.field6840; var232++) {
                class599.field8757[var232].field6254.field2502 = -1;
            }
            class118.field1475 = null;
            return true;
        } else if (class327.field4717 == class118.field1475) {
            int var233 = class46.field498.method1239((byte) 16);
            int var234 = class46.field498.method1209(-24738);
            class23.field243.method3268((byte) -26, var233, var234);
            class118.field1475 = null;
            return true;
        } else if (class346.field4953 == class118.field1475) {
            class158.method916(class32.field372, class46.field498, (byte) 38);
            class118.field1475 = null;
            return true;
        } else if (class528.field7650 == class118.field1475) {
            class245.field3464 = class46.field498.method1177(arg0 ^ 0xFF);
            for (int var235 = 0; var235 < class245.field3464; var235++) {
                class601.field8772[var235] = class46.field498.method1218(false);
                class104.field1250[var235] = class46.field498.method1218(false);
                if (class104.field1250[var235].equals("")) {
                    class104.field1250[var235] = class601.field8772[var235];
                }
                class446.field6667[var235] = class46.field498.method1218(false);
                class378.field5756[var235] = class46.field498.method1218(false);
                if (class378.field5756[var235].equals("")) {
                    class378.field5756[var235] = class446.field6667[var235];
                }
                class135.field1688[var235] = false;
            }
            class236.field3383 = class240.field3406;
            class118.field1475 = null;
            return true;
        } else if (class96.field1134 == class118.field1475) {
            class304.field4470 = class46.field498.method1177(arg0 ^ 0xFF);
            class367.field5553 = class240.field3406;
            class118.field1475 = null;
            return true;
        } else if (class239.field3400 == class118.field1475) {
            class325.field4690 = class236.method1587(class46.field498.method1177(255), (byte) -76);
            class118.field1475 = null;
            return true;
        } else if (class218.field2994 == class118.field1475) {
            int var236 = class46.field498.method1195((byte) -126);
            int var237 = class46.field498.method1239((byte) 125);
            int var238 = class46.field498.method1239((byte) 123);
            int var239 = class46.field498.method1234((byte) -120);
            int var240 = class46.field498.method1197(true);
            if (class259.method1726(var238, true)) {
                class541.method3146(var236, var239, var237, var240, true);
            }
            class118.field1475 = null;
            return true;
        } else if (class495.field7235 == class118.field1475) {
            int var241 = class46.field498.method1190(false);
            int var242 = class46.field498.method1195((byte) -126);
            int var243 = class46.field498.method1195((byte) -127);
            class411 var244 = (class411) class42.field456.method524((byte) 88, (long) var243);
            if (var244 != null) {
                class16.method103(var242, var244.field6254, 0, var241);
            }
            class118.field1475 = null;
            return true;
        } else if (class16.field155 == class118.field1475) {
            int var245 = class46.field498.method1220(116);
            if (var245 == 65535) {
                var245 = -1;
            }
            int var246 = class46.field498.method1177(255);
            int var247 = class46.field498.method1220(arg0 ^ 0x7A);
            int var248 = class46.field498.method1177(arg0 ^ 0xFF);
            class260.method1732(16, var247, var248, var245, var246);
            class118.field1475 = null;
            return true;
        } else if (class310.field4563 == class118.field1475) {
            class118.field1475 = null;
            class24.field257 = 1;
            class236.field3383 = class240.field3406;
            return true;
        } else if (class613.field8919 == class118.field1475) {
            int var249 = class46.field498.method1239((byte) -41);
            int var250 = class46.field498.method1209(-24738);
            boolean var251 = (var250 & 0x1) == 1;
            class129.method794(-12648, var251, var249);
            class365.field5527[class643.method3659(class509.field7407++, 31)] = var249;
            class118.field1475 = null;
            return true;
        } else if (class316.field4608 == class118.field1475) {
            class45.method237(2, class151.field1859);
            class118.field1475 = null;
            return true;
        } else if (class605.field8860 == class118.field1475) {
            class286.method1853(arg0 - 14708, true);
            class118.field1475 = null;
            return true;
        } else if (class118.field1475 == class10.field84) {
            int var252 = class46.field498.method1220(-124);
            if (class259.method1726(var252, true)) {
                class158.method913(5);
            }
            class118.field1475 = null;
            return true;
        } else if (class358.field5086 == class118.field1475) {
            if (class10.method56(class133.field1673, 3521)) {
                class260.field3703 = (int) ((float) class46.field498.method1220(arg0 ^ 0x78) * 2.5F);
            } else {
                class260.field3703 = class46.field498.method1220(117) * 30;
            }
            class367.field5553 = class240.field3406;
            class118.field1475 = null;
            return true;
        } else if (class452.field6745 == class118.field1475) {
            class45.method237(2, class287.field3968);
            class118.field1475 = null;
            return true;
        } else if (class464.field6897 == class118.field1475) {
            class17.field172 = class46.field498.method1177(255);
            class118.field1475 = null;
            return true;
        } else if (class504.field7297 == class118.field1475) {
            int var253 = class46.field498.method1220(arg0 ^ 0xFFFFFF9A);
            int var254 = class46.field498.method1238(255);
            int var255 = class46.field498.method1178(arg0 - 230315992);
            if (class259.method1726(var253, true)) {
                class486.method2929(var255, 108, var254);
            }
            class118.field1475 = null;
            return true;
        } else if (class574.field8286 == class118.field1475) {
            class23.field243.method3262(0);
            class118.field1475 = null;
            class224.field3160 += 32;
            return true;
        } else if (class445.field6664 == class118.field1475) {
            class246.field3484 = class46.field498.method1233(65280);
            class367.field5553 = class240.field3406;
            class118.field1475 = null;
            return true;
        } else if (class515.field7511 == class118.field1475) {
            class45.method237(arg0 + 2, class309.field4543);
            class118.field1475 = null;
            return true;
        } else if (class337.field4820 == class118.field1475) {
            class46.field498.field2610 += 28;
            if (class46.field498.method1192(-17208)) {
                class4.method20((byte) -57, class46.field498.field2610 - 28, class46.field498);
            }
            class118.field1475 = null;
            return true;
        } else if (class140.field1731 == class118.field1475) {
            int var256 = class46.field498.method1220(-102);
            if (var256 == 65535) {
                var256 = -1;
            }
            int var257 = class46.field498.method1220(116);
            int var258 = class46.field498.method1234((byte) 119);
            int var259 = class46.field498.method1239((byte) -64);
            int var260 = class46.field498.method1197(true);
            if (var260 == 65535) {
                var260 = -1;
            }
            if (class259.method1726(var259, true)) {
                for (int var261 = var256; var261 <= var260; var261++) {
                    long var262 = ((long) var258 << 32) + (long) var261;
                    class271 var264 = (class271) class547.field7835.method524((byte) 101, var262);
                    class271 var265;
                    if (var264 != null) {
                        var265 = new class271(var264.field3798, var257);
                        var264.method2108(true);
                    } else if (var261 == -1) {
                        var265 = new class271(class259.method1728(40, var258).field8623.field3798, var257);
                    } else {
                        var265 = new class271(0, var257);
                    }
                    class547.field7835.method520((byte) -52, var265, var262);
                }
            }
            class118.field1475 = null;
            return true;
        } else if (class133.field1671 == class118.field1475) {
            class140.method841(1903119524);
            class118.field1475 = null;
            return false;
        } else if (class160.field1972 == class118.field1475) {
            class45.method237(2, class10.field85);
            class118.field1475 = null;
            return true;
        } else if (class630.field9095 == class118.field1475) {
            byte var266 = class46.field498.method1215(-2);
            int var267 = class46.field498.method1220(-14);
            class23.field243.method3266(var267, var266, 28848);
            class118.field1475 = null;
            return true;
        } else if (class349.field5005 == class118.field1475) {
            String var268 = class46.field498.method1218(false);
            int var269 = class46.field498.method1220(arg0 ^ 0xFFFFFF82);
            String var270 = class498.field7255.method3401(-1, var269).method626(-124, class46.field498);
            class342.method2200(var268, var268, 0, var270, var269, var268, (byte) -118, 19, null);
            class118.field1475 = null;
            return true;
        } else if (class603.field8811 == class118.field1475) {
            class403.field6101 = class46.field498.method1183(-118);
            class345.field4944 = class46.field498.method1177(255) == 1;
            class118.field1475 = null;
            return true;
        } else if (class119.field1490 == class118.field1475) {
            int var271 = class46.field498.method1220(arg0 ^ 0x73);
            int var272 = class46.field498.method1177(arg0 + 255);
            boolean var273 = (var272 & 0x1) == 1;
            while (class46.field498.field2610 < class32.field372) {
                int var274 = class46.field498.method1176((byte) -25);
                int var275 = class46.field498.method1220(arg0 + 124);
                int var276 = 0;
                if (var275 != 0) {
                    var276 = class46.field498.method1177(255);
                    if (var276 == 255) {
                        var276 = class46.field498.method1178(-230315992);
                    }
                }
                class620.method3566(var271, var276, -1, var273, var275 - 1, var274);
            }
            class365.field5527[class643.method3659(class509.field7407++, 31)] = var271;
            class118.field1475 = null;
            return true;
        } else if (class522.field7586 == class118.field1475) {
            int var277 = class46.field498.method1220(114);
            class655 var278;
            if (class244.field3460 == var277) {
                var278 = class439.field6548;
            } else {
                var278 = class142.field1749[var277];
            }
            if (var278 == null) {
                class118.field1475 = null;
                return true;
            }
            int var279 = class46.field498.method1220(-75);
            int var280 = class46.field498.method1177(arg0 + 255);
            boolean var281 = (var279 & 0x8000) != 0;
            if (var278.field9452 != null && var278.field9470 != null) {
                boolean var282 = false;
                if (var280 <= 1) {
                    if (!var281 && (class345.field4944 && !class220.field3004 || class647.field9366)) {
                        var282 = true;
                    } else if (class194.method1187(-93, var278.field9452)) {
                        var282 = true;
                    }
                }
                if (!var282 && class206.field2769 == 0) {
                    int var283 = -1;
                    String var284;
                    if (var281) {
                        var279 &= 0x7FFF;
                        class473 var285 = class79.method518(class46.field498, false);
                        var283 = var285.field7003;
                        var284 = var285.field7005.method626(-69, class46.field498);
                    } else {
                        var284 = class220.method1435(828, class90.method577(class46.field498, 93));
                    }
                    var278.field2445 = var284.trim();
                    var278.field2423 = var279 >> 8;
                    var278.field2474 = 150;
                    var278.field2447 = var279 & 0xFF;
                    int var286;
                    if (var280 == 1 || var280 == 2) {
                        var286 = var281 ? 17 : 1;
                    } else {
                        var286 = var281 ? 17 : 2;
                    }
                    if (var280 == 2) {
                        class342.method2200(var278.field9469, "<img=1>" + var278.method3743((byte) 101, false), 0, var284, var283, "<img=1>" + var278.method3744(125, true), (byte) -75, var286, null);
                    } else if (var280 == 1) {
                        class342.method2200(var278.field9469, "<img=0>" + var278.method3743((byte) 101, false), 0, var284, var283, "<img=0>" + var278.method3744(arg0 ^ 0xFFFFFFC7, true), (byte) -47, var286, null);
                    } else {
                        class342.method2200(var278.field9469, var278.method3743((byte) 101, false), 0, var284, var283, var278.method3744(-28, true), (byte) -83, var286, null);
                    }
                }
            }
            class118.field1475 = null;
            return true;
        } else if (class292.field4051 == class118.field1475) {
            int var287 = class46.field498.method1178(arg0 - 230315992);
            class406.field6123 = class20.field197.method3169(var287, (byte) 125);
            class118.field1475 = null;
            return true;
        } else if (class341.field4867 == class118.field1475) {
            int var288 = class46.field498.method1226(128);
            int var289 = class46.field498.method1209(arg0 - 24738);
            int var290 = class46.field498.method1234((byte) -120);
            class410.field6245[var288] = var290;
            class246.field3470[var288] = var289;
            class208.field2791[var288] = 1;
            int var291 = class250.field3550[var288] - 1;
            for (int var292 = 0; var292 < var291; var292++) {
                if (var290 >= class269.field3771[var292]) {
                    class208.field2791[var288] = var292 + 2;
                }
            }
            class18.field179[class643.method3659(class103.field1243++, 31)] = var288;
            class118.field1475 = null;
            return true;
        } else if (class245.field3462 == class118.field1475) {
            int var293 = class46.field498.method1220(122);
            if (var293 == 65535) {
                var293 = -1;
            }
            int var294 = class46.field498.method1195((byte) -127);
            int var295 = class46.field498.method1191(arg0 - 88);
            if (class259.method1726(var294, true)) {
                class231.method1489(1, true, -1, var295, var293);
            }
            class118.field1475 = null;
            return true;
        } else if (class559.field7965 == class118.field1475) {
            class80.field890 = class32.field372 <= 2 ? class341.field4857.method2902(class35.field396, arg0 - 20139) : class46.field498.method1218(false);
            class261.field3713 = class32.field372 > 0 ? class46.field498.method1220(-44) : -1;
            if (class261.field3713 == 65535) {
                class261.field3713 = -1;
            }
            class118.field1475 = null;
            return true;
        } else if (class69.field747 == class118.field1475) {
            class323.field4667 = class46.field498.method1209(-24738);
            class646.field9359 = class46.field498.method1186(arg0 ^ 0x6995) << 3;
            class454.field6786 = class46.field498.method1213((byte) 18) << 3;
            class118.field1475 = null;
            return true;
        } else if (class494.field7208 == class118.field1475) {
            int var296 = class46.field498.method1220(arg0 ^ 0x76);
            int var297 = class46.field498.method1220(127);
            int var298 = class46.field498.method1226(128);
            if (class259.method1726(var296, true)) {
                if (var298 == 2) {
                    class40.method216(false);
                }
                class518.field7542 = var297;
                class10.method57(var297, (byte) -119);
                class599.method3480(-123, false);
                class604.method3508(class518.field7542);
                for (int var299 = 0; var299 < 100; var299++) {
                    class136.field1692[var299] = true;
                }
            }
            class118.field1475 = null;
            return true;
        } else if (class456.field6833 == class118.field1475) {
            int var300 = class46.field498.method1178(arg0 ^ 0xF245A828);
            int var301 = class46.field498.method1220(115);
            if (class259.method1726(var301, true)) {
                class231.method1489(5, true, 0, var300, class244.field3460);
            }
            class118.field1475 = null;
            return true;
        } else if (class490.field7150 == class118.field1475) {
            int var302 = class46.field498.method1220(-99);
            int var303 = class46.field498.method1178(-230315992);
            if (class259.method1726(var302, true)) {
                class563 var304 = (class563) class234.field3309.method524((byte) 127, (long) var303);
                if (var304 != null) {
                    class292.method1885(false, true, (byte) -72, var304);
                }
                if (class636.field9141 != null) {
                    class33.method187(class636.field9141, (byte) -52);
                    class636.field9141 = null;
                }
            }
            class118.field1475 = null;
            return true;
        } else if (class304.field4476 == class118.field1475) {
            class84.field956 = class46.field498.method1177(255);
            class176.field2147 = class46.field498.method1177(255);
            class118.field1475 = null;
            return true;
        } else if (class384.field5786 == class118.field1475) {
            boolean var305 = class46.field498.method1177(255) == 1;
            String var306 = class46.field498.method1218(false);
            String var307 = var306;
            if (var305) {
                var307 = class46.field498.method1218(false);
            }
            int var308 = class46.field498.method1177(255);
            boolean var309 = false;
            if (var308 <= 1) {
                if (!(!class345.field4944 || class220.field3004) || class647.field9366) {
                    var309 = true;
                } else if (var308 <= 1 && class194.method1187(arg0 - 60, var307)) {
                    var309 = true;
                }
            }
            if (!var309 && class206.field2769 == 0) {
                String var310 = class220.method1435(828, class90.method577(class46.field498, 122));
                if (var308 == 2) {
                    class342.method2200(var306, "<img=1>" + var307, 0, var310, -1, "<img=1>" + var306, (byte) -62, 24, null);
                } else if (var308 == 1) {
                    class342.method2200(var306, "<img=0>" + var307, 0, var310, -1, "<img=0>" + var306, (byte) -23, 24, null);
                } else {
                    class342.method2200(var306, var307, 0, var310, -1, var306, (byte) -79, 24, null);
                }
            }
            class118.field1475 = null;
            return true;
        } else if (class544.field7776 == class118.field1475) {
            boolean var311 = class46.field498.method1177(255) == 1;
            String var312 = class46.field498.method1218(false);
            String var313 = var312;
            if (var311) {
                var313 = class46.field498.method1218(false);
            }
            int var314 = class46.field498.method1177(arg0 + 255);
            int var315 = class46.field498.method1220(123);
            boolean var316 = false;
            if (var314 <= 1 && class194.method1187(-101, var313)) {
                var316 = true;
            }
            if (!var316 && class206.field2769 == 0) {
                String var317 = class498.field7255.method3401(-1, var315).method626(-117, class46.field498);
                if (var314 == 2) {
                    class342.method2200(var312, "<img=1>" + var313, 0, var317, var315, "<img=1>" + var312, (byte) -37, 25, null);
                } else if (var314 == 1) {
                    class342.method2200(var312, "<img=0>" + var313, 0, var317, var315, "<img=0>" + var312, (byte) -117, 25, null);
                } else {
                    class342.method2200(var312, var313, 0, var317, var315, var312, (byte) -75, 25, null);
                }
            }
            class118.field1475 = null;
            return true;
        } else if (class174.field2136 == class118.field1475) {
            boolean var318 = class46.field498.method1177(255) == 1;
            String var319 = class46.field498.method1218(false);
            String var320 = var319;
            if (var318) {
                var320 = class46.field498.method1218(false);
            }
            long var321 = (long) class46.field498.method1220(-92);
            long var323 = (long) class46.field498.method1180(-832631516);
            int var325 = class46.field498.method1177(255);
            long var326 = (var321 << 32) + var323;
            boolean var328 = false;
            int var329 = 0;
            while (true) {
                if (var329 >= 100) {
                    if (var325 <= 1) {
                        if (!(!class345.field4944 || class220.field3004) || class647.field9366) {
                            var328 = true;
                        } else if (class194.method1187(-85, var320)) {
                            var328 = true;
                        }
                    }
                    break;
                }
                if (class622.field8998[var329] == var326) {
                    var328 = true;
                    break;
                }
                var329++;
            }
            if (!var328 && class206.field2769 == 0) {
                class622.field8998[class155.field1925] = var326;
                class155.field1925 = (class155.field1925 + 1) % 100;
                String var330 = class220.method1435(arg0 ^ 0x33C, class90.method577(class46.field498, arg0 + 116));
                if (var325 == 2) {
                    class342.method2200(var319, "<img=1>" + var320, 0, var330, -1, "<img=1>" + var319, (byte) -124, 7, null);
                } else if (var325 == 1) {
                    class342.method2200(var319, "<img=0>" + var320, 0, var330, -1, "<img=0>" + var319, (byte) -27, 7, null);
                } else {
                    class342.method2200(var319, var320, 0, var330, -1, var319, (byte) -96, 3, null);
                }
            }
            class118.field1475 = null;
            return true;
        } else if (class299.field4412 == class118.field1475) {
            int var331 = class46.field498.method1239((byte) -81);
            int var332 = class46.field498.method1197(true);
            int var333 = class46.field498.method1239((byte) 126);
            int var334 = class46.field498.method1234((byte) -121);
            int var335 = class46.field498.method1190(false);
            boolean var336 = (var335 & 0x80) != 0;
            if ((var334 >> 30) != 0) {
                int var368 = var334 >> 28 & 0x3;
                int var369 = ((var334 & 0xFFFCF72) >> 14) - class287.field3980;
                int var370 = (var334 & 0x3FFF) - class250.field3549;
                if (var369 >= 0 && var370 >= 0 && class90.field1032 > var369 && class30.field349 > var370) {
                    int var371 = var369 * 512 + 256;
                    int var372 = var370 * 512 + 256;
                    int var373 = var368;
                    if (var368 < 3 && class647.method3709(var369, var370, -17206)) {
                        var373 = var368 + 1;
                    }
                    class56 var374 = new class56(var331, 0, class287.field3982, var368, var373, var371, class399.method2547(var372, var371, (byte) 80, var368) - var332, var372, var369, var369, var370, var370, var335 & 0x7);
                    class518.field7540.method706(new class276(var374), true);
                }
            } else if (var334 >> 29 != 0) {
                int var352 = var334 & 0xFFFF;
                class411 var353 = (class411) class42.field456.method524((byte) 107, (long) var352);
                if (var353 != null) {
                    if (var331 == 65535) {
                        var331 = -1;
                    }
                    class78 var354 = var353.field6254;
                    boolean var355 = true;
                    int var356 = var336 ? var354.field2421 : var354.field2472;
                    if (var331 != -1 && var356 != -1) {
                        if (var331 == var356) {
                            class576 var361 = class141.field1735.method3667(false, var331);
                            if (var361.field8328 && var361.field8318 != -1) {
                                class177 var362 = class259.field3686.method2961(var361.field8318, arg0 + 8);
                                int var363 = var362.field2160;
                                if (var363 == 0 || var363 == 2) {
                                    var355 = false;
                                } else if (var363 == 1) {
                                    var355 = true;
                                }
                            }
                        } else {
                            class576 var357 = class141.field1735.method3667(false, var331);
                            class576 var358 = class141.field1735.method3667(false, var356);
                            if (var357.field8318 != -1 && var358.field8318 != -1) {
                                class177 var359 = class259.field3686.method2961(var357.field8318, 8);
                                class177 var360 = class259.field3686.method2961(var358.field8318, 8);
                                if (var359.field2161 < var360.field2161) {
                                    var355 = false;
                                }
                            }
                        }
                    }
                    if (var355) {
                        if (var336) {
                            var354.field2421 = var331;
                            var354.field2424 = 1;
                            var354.field2476 = class287.field3982 + var333;
                            var354.field2418 = var332;
                            var354.field2478 = var335 & 0x7;
                            var354.field2443 = 0;
                            var354.field2494 = 0;
                            if (var354.field2476 > class287.field3982) {
                                var354.field2443 = -1;
                            }
                            if (var354.field2421 != -1 && class287.field3982 == var354.field2476) {
                                int var366 = class141.field1735.method3667(false, var354.field2421).field8318;
                                if (var366 != -1) {
                                    class177 var367 = class259.field3686.method2961(var366, 8);
                                    if (var367 != null && var367.field2181 != null) {
                                        class405.method2571(false, var354.field1764, 86, var354.field1768, var354.field1757, var367, 0);
                                    }
                                }
                            }
                        } else {
                            var354.field2468 = 0;
                            var354.field2509 = var335 & 0x7;
                            var354.field2485 = var332;
                            var354.field2488 = 1;
                            var354.field2451 = 0;
                            var354.field2437 = class287.field3982 + var333;
                            var354.field2472 = var331;
                            if (class287.field3982 < var354.field2437) {
                                var354.field2468 = -1;
                            }
                            if (var354.field2472 != -1 && class287.field3982 == var354.field2437) {
                                int var364 = class141.field1735.method3667(false, var354.field2472).field8318;
                                if (var364 != -1) {
                                    class177 var365 = class259.field3686.method2961(var364, arg0 + 8);
                                    if (var365 != null && var365.field2181 != null) {
                                        class405.method2571(false, var354.field1764, 112, var354.field1768, var354.field1757, var365, 0);
                                    }
                                }
                            }
                        }
                    }
                }
            } else if (var334 >> 28 != 0) {
                int var337 = var334 & 0xFFFF;
                class655 var338;
                if (class244.field3460 == var337) {
                    var338 = class439.field6548;
                } else {
                    var338 = class142.field1749[var337];
                }
                if (var338 != null) {
                    if (var331 == 65535) {
                        var331 = -1;
                    }
                    boolean var339 = true;
                    int var340 = var336 ? var338.field2421 : var338.field2472;
                    if (var331 != -1 && var340 != -1) {
                        if (var331 == var340) {
                            class576 var345 = class141.field1735.method3667(false, var331);
                            if (var345.field8328 && var345.field8318 != -1) {
                                class177 var346 = class259.field3686.method2961(var345.field8318, 8);
                                int var347 = var346.field2160;
                                if (var347 == 0 || var347 == 2) {
                                    var339 = false;
                                } else if (var347 == 1) {
                                    var339 = true;
                                }
                            }
                        } else {
                            class576 var341 = class141.field1735.method3667(false, var331);
                            class576 var342 = class141.field1735.method3667(false, var340);
                            if (var341.field8318 != -1 && var342.field8318 != -1) {
                                class177 var343 = class259.field3686.method2961(var341.field8318, 8);
                                class177 var344 = class259.field3686.method2961(var342.field8318, 8);
                                if (var343.field2161 < var344.field2161) {
                                    var339 = false;
                                }
                            }
                        }
                    }
                    if (var339) {
                        if (var336) {
                            var338.field2443 = 0;
                            var338.field2494 = 0;
                            var338.field2424 = 1;
                            var338.field2418 = var332;
                            var338.field2478 = var335 & 0x7;
                            var338.field2476 = class287.field3982 + var333;
                            var338.field2421 = var331;
                            if (var338.field2421 == 65535) {
                                var338.field2421 = -1;
                            }
                            if (class287.field3982 < var338.field2476) {
                                var338.field2443 = -1;
                            }
                            if (var338.field2421 != -1 && class287.field3982 == var338.field2476) {
                                int var350 = class141.field1735.method3667(false, var338.field2421).field8318;
                                if (var350 != -1) {
                                    class177 var351 = class259.field3686.method2961(var350, 8);
                                    if (var351 != null && var351.field2181 != null) {
                                        class405.method2571(class439.field6548 == var338, var338.field1764, -104, var338.field1768, var338.field1757, var351, 0);
                                    }
                                }
                            }
                        } else {
                            var338.field2472 = var331;
                            var338.field2437 = class287.field3982 + var333;
                            var338.field2509 = var335 & 0x7;
                            var338.field2468 = 0;
                            var338.field2488 = 1;
                            var338.field2485 = var332;
                            var338.field2451 = 0;
                            if (var338.field2472 == 65535) {
                                var338.field2472 = -1;
                            }
                            if (var338.field2437 > class287.field3982) {
                                var338.field2468 = -1;
                            }
                            if (var338.field2472 != -1 && class287.field3982 == var338.field2437) {
                                int var348 = class141.field1735.method3667(false, var338.field2472).field8318;
                                if (var348 != -1) {
                                    class177 var349 = class259.field3686.method2961(var348, 8);
                                    if (var349 != null && var349.field2181 != null) {
                                        class405.method2571(class439.field6548 == var338, var338.field1764, 69, var338.field1768, var338.field1757, var349, 0);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            class118.field1475 = null;
            return true;
        } else if (class461.field6872 == class118.field1475) {
            int var375 = class46.field498.method1177(255);
            int var376 = class46.field498.method1190(false);
            if (var375 == 255) {
                var376 = -1;
                var375 = -1;
            }
            class324.method2107(var376, var375, false);
            class118.field1475 = null;
            return true;
        } else if (class156.field1932 == class118.field1475) {
            class218.field2997 = class240.field3406;
            if (class32.field372 == 0) {
                class294.field4252 = 0;
                class574.field8287 = null;
                class118.field1475 = null;
                class538.field7747 = null;
                class81.field907 = null;
                return true;
            }
            class81.field907 = class46.field498.method1218(false);
            boolean var377 = class46.field498.method1177(255) == 1;
            if (var377) {
                class46.field498.method1218(false);
            }
            long var378 = class46.field498.method1184(-61);
            class574.field8287 = class113.method697((byte) -24, var378);
            class402.field6071 = class46.field498.method1213((byte) 59);
            int var380 = class46.field498.method1177(255);
            if (var380 == 255) {
                class118.field1475 = null;
                return true;
            }
            class294.field4252 = var380;
            class525[] var381 = new class525[100];
            for (int var382 = 0; var382 < class294.field4252; var382++) {
                var381[var382] = new class525();
                var381[var382].field7622 = class46.field498.method1218(false);
                boolean var388 = class46.field498.method1177(255) == 1;
                if (var388) {
                    var381[var382].field7618 = class46.field498.method1218(false);
                } else {
                    var381[var382].field7618 = var381[var382].field7622;
                }
                var381[var382].field7623 = class207.method1323(32682, var381[var382].field7618);
                var381[var382].field7617 = class46.field498.method1220(113);
                var381[var382].field7619 = class46.field498.method1213((byte) 91);
                var381[var382].field7621 = class46.field498.method1218(false);
                if (var381[var382].field7618.equals(class439.field6548.field9452)) {
                    class260.field3708 = var381[var382].field7619;
                }
            }
            boolean var383 = false;
            int var384 = class294.field4252;
            while (var384 > 0) {
                var384--;
                boolean var385 = true;
                for (int var386 = 0; var386 < var384; var386++) {
                    if (var381[var386].field7623.compareTo(var381[var386 + 1].field7623) > 0) {
                        class525 var387 = var381[var386];
                        var381[var386] = var381[var386 + 1];
                        var381[var386 + 1] = var387;
                        var385 = false;
                    }
                }
                if (var385) {
                    break;
                }
            }
            class118.field1475 = null;
            class538.field7747 = var381;
            return true;
        } else if (class555.field7872 == class118.field1475) {
            class45.method237(2, class96.field1133);
            class118.field1475 = null;
            return true;
        } else if (class35.field394 == class118.field1475) {
            class286.method1853(-14708, false);
            class118.field1475 = null;
            return true;
        } else if (class327.field4719 == class118.field1475) {
            class45.method237(2, class111.field1369);
            class118.field1475 = null;
            return true;
        } else if (class229.field3229 == class118.field1475) {
            int var389 = class46.field498.method1209(arg0 ^ 0xFFFF9F5E);
            int var390 = class46.field498.method1190(false);
            int var391 = class46.field498.method1195((byte) -128);
            if (var391 == 65535) {
                var391 = -1;
            }
            class281.method1829(664011555, var390, var389, var391);
            class118.field1475 = null;
            return true;
        } else if (class225.field3177 == class118.field1475) {
            int var392 = class46.field498.method1195((byte) -125);
            if (var392 == 65535) {
                var392 = -1;
            }
            int var393 = class46.field498.method1190(false);
            int var394 = class46.field498.method1204((byte) -106);
            class184.method1077(var394, var392, (byte) -123, var393);
            class118.field1475 = null;
            return true;
        } else if (class566.field8077 == class118.field1475) {
            class646.field9359 = class46.field498.method1213((byte) 64) << 3;
            class323.field4667 = class46.field498.method1209(-24738);
            class454.field6786 = class46.field498.method1227((byte) 98) << 3;
            while (class32.field372 > class46.field498.field2610) {
                class629 var395 = class374.method2409(arg0 ^ 0x67)[class46.field498.method1177(255)];
                class45.method237(2, var395);
            }
            class118.field1475 = null;
            return true;
        } else if (class507.field7368 == class118.field1475) {
            int var396 = class46.field498.method1191(-122);
            int var397 = class46.field498.method1220(-35);
            class23.field243.method3268((byte) -26, var397, var396);
            class118.field1475 = null;
            return true;
        } else if (class576.field8314 == class118.field1475) {
            class454.field6786 = class46.field498.method1215(-2) << 3;
            class646.field9359 = class46.field498.method1186(27029) << 3;
            class323.field4667 = class46.field498.method1226(arg0 ^ 0x80);
            for (class446 var398 = (class446) class294.field4247.method523(arg0 - 4); var398 != null; var398 = (class446) class294.field4247.method530(12714)) {
                int var400 = (int) (var398.field4676 >> 28 & 0x3L);
                int var401 = (int) (var398.field4676 & 0x3FFFL);
                int var402 = var401 - class287.field3980;
                int var403 = (int) (var398.field4676 >> 14 & 0x3FFFL);
                int var404 = var403 - class250.field3549;
                if (class323.field4667 == var400 && var402 >= class454.field6786 && class454.field6786 + 8 > var402 && class646.field9359 <= var404 && var404 < class646.field9359 + 8) {
                    var398.method2108(true);
                    if (var402 >= 0 && var404 >= 0 && var402 < class90.field1032 && class30.field349 > var404) {
                        class187.method1083(class323.field4667, var402, var404, 87);
                    }
                }
            }
            for (class55 var399 = (class55) class117.field1451.method719(false); var399 != null; var399 = (class55) class117.field1451.method716(14)) {
                if (var399.field623 >= class454.field6786 && var399.field623 < class454.field6786 + 8 && class646.field9359 <= var399.field625 && var399.field625 < (class646.field9359 + 8) && class323.field4667 == var399.field629) {
                    var399.field636 = 0;
                }
            }
            class118.field1475 = null;
            return true;
        } else if (class568.field8155 == class118.field1475) {
            int var405 = class46.field498.method1220(arg0 ^ 0xFFFFFFC0);
            if (class259.method1726(var405, true)) {
                class224.method1459((byte) 82);
            }
            class118.field1475 = null;
            return true;
        } else if (class304.field4473 == class118.field1475) {
            int var406 = class46.field498.method1194(25034);
            int var407 = class46.field498.method1197(true);
            int var408 = class46.field498.method1220(-57);
            if (class259.method1726(var407, true)) {
                class443.method2768(var408, var406, (byte) 127);
            }
            class118.field1475 = null;
            return true;
        } else if (class123.field1536 == class118.field1475) {
            int var409 = class46.field498.method1220(arg0 + 115);
            if (var409 == 65535) {
                var409 = -1;
            }
            int var410 = class46.field498.method1177(255);
            int var411 = class46.field498.method1220(arg0 ^ 0xFFFFFFF0);
            int var412 = class46.field498.method1177(255);
            class173.method994(var412, var409, arg0 ^ 0xFFFFDB68, false, var411, var410);
            class118.field1475 = null;
            return true;
        } else if (class364.field5518 == class118.field1475) {
            class456.method2819(class20.field197, false, class32.field372, class46.field498);
            class118.field1475 = null;
            return true;
        } else if (class118.field1475 == class104.field1252) {
            int var413 = class46.field498.method1220(115);
            int var414 = class46.field498.method1177(arg0 ^ 0xFF);
            int var415 = class46.field498.method1177(255);
            int var416 = class46.field498.method1220(arg0 ^ 0xFFFFFFC0) << 2;
            int var417 = class46.field498.method1177(arg0 ^ 0xFF);
            int var418 = class46.field498.method1177(255);
            if (class259.method1726(var413, true)) {
                class472.method2896(true, var415, var416, var414, var417, var418, arg0 ^ 0x76);
            }
            class118.field1475 = null;
            return true;
        } else if (class22.field235 == class118.field1475) {
            int var419 = class46.field498.method1195((byte) -125);
            byte var420 = class46.field498.method1186(27029);
            int var421 = class46.field498.method1195((byte) -126);
            if (class259.method1726(var421, true)) {
                class603.method3504(var419, var420, (byte) -114);
            }
            class118.field1475 = null;
            return true;
        } else if (class644.field9287 == class118.field1475) {
            int var422 = class46.field498.method1220(115);
            int var423 = class46.field498.method1220(-77);
            int var424 = class46.field498.method1234((byte) -5);
            if (class259.method1726(var423, true)) {
                class430.method2685(var422, (byte) 32, var424);
            }
            class118.field1475 = null;
            return true;
        } else if (class593.field8669 == class118.field1475) {
            class45.method237(2, class301.field4426);
            class118.field1475 = null;
            return true;
        } else if (class96.field1136 == class118.field1475) {
            class45.method237(2, class261.field3711);
            class118.field1475 = null;
            return true;
        } else {
            class630.method3607(7, null, "T1 - " + (class118.field1475 == null ? -1 : class118.field1475.method1318(-90)) + "," + (class379.field5763 == null ? -1 : class379.field5763.method1318(95)) + "," + (class592.field8497 == null ? -1 : class592.field8497.method1318(48)) + " - " + class32.field372);
            method1007((byte) -50, false);
            return true;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IB)V")
    public static final void method1003(int arg0, byte arg1) {
        if (arg1 != -8) {
            field2183 = null;
        }
        field2165++;
        class467 var2 = class541.method3144(arg0, (byte) -103, 10);
        var2.method2852(arg1 + 8);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(BI)Z")
    public static final boolean method1004(byte arg0, int arg1) {
        if (arg0 != 110) {
            method1000(null, (byte) -106);
        }
        field2154++;
        return arg1 == 6 || arg1 == 8;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIZI)I")
    public final int method1005(int arg0, int arg1, boolean arg2, int arg3) {
        field2163++;
        int var5 = 0;
        int var6 = 0;
        int var7 = this.field2181[arg1];
        class66 var8 = null;
        class66 var9 = this.field2172.method2964(var7 >> 16, 69);
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        }
        if ((this.field2153 || class233.field3267) && arg0 != -1 && this.field2181.length > arg0) {
            int var11 = this.field2181[arg0];
            var8 = this.field2172.method2964(var11 >> 16, 68);
            var6 = var11 & 0xFFFF;
        }
        if (this.field2180) {
            var5 |= 0x200;
        }
        if (var9.method454(var10, 91)) {
            var5 |= 0x80;
        }
        if (var9.method453(0, var10)) {
            var5 |= 0x100;
        }
        if (var9.method455(91, var10)) {
            var5 |= 0x400;
        }
        if (arg3 < 114) {
            return 29;
        }
        if (var8 != null) {
            if (var8.method454(var6, 91)) {
                var5 |= 0x80;
            }
            if (var8.method453(0, var6)) {
                var5 |= 0x100;
            }
            if (var8.method455(91, var6)) {
                var5 |= 0x400;
            }
        }
        if (this.field2151 != null && arg2) {
            if (arg1 < this.field2151.length) {
                int var12 = this.field2151[arg1];
                if (var12 != 65535) {
                    class66 var13 = this.field2172.method2964(var12 >> 16, 16);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method454(var14, 91)) {
                            var5 |= 0x80;
                        }
                        if (var13.method453(0, var14)) {
                            var5 |= 0x100;
                        }
                        if (var13.method455(91, var14)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
            if ((this.field2153 || class233.field3267) && arg0 != -1 && this.field2151.length > arg0) {
                int var15 = this.field2151[arg0];
                if (var15 != 65535) {
                    class66 var16 = this.field2172.method2964(var15 >> 16, 65);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method454(var17, 91)) {
                            var5 |= 0x80;
                        }
                        if (var16.method453(0, var17)) {
                            var5 |= 0x100;
                        }
                        if (var16.method455(91, var17)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(I)V")
    public final void method1006(int arg0) {
        if (this.field2155 == -1) {
            if (this.field2157 == null) {
                this.field2155 = 0;
            } else {
                this.field2155 = 2;
            }
        }
        field2174++;
        if (this.field2169 == -1) {
            if (this.field2157 == null) {
                this.field2169 = 0;
            } else {
                this.field2169 = 2;
            }
        }
        if (arg0 != 14386) {
            this.field2155 = -67;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(BZ)V")
    public static final void method1007(byte arg0, boolean arg1) {
        field2176++;
        if (class170.field2077 != null) {
            class170.field2077.method1841(125);
            class170.field2077 = null;
        }
        class306.field4499 = 0;
        class457.method2821((byte) -120);
        class150.method888();
        for (int var2 = 0; var2 < 4; var2++) {
            class14.field120[var2].method2870(true);
        }
        class657.method3753(false, 71);
        System.gc();
        class558.method3238(2, arg0 ^ 0xFFFFBE3E);
        class169.field2064 = -1;
        class93.field1095 = false;
        class253.method1660(-121, true);
        class568.field8159 = 0;
        class287.field3980 = 0;
        class400.field6066 = 0;
        class251.field3570 = 0;
        class27.field290 = 0;
        class250.field3549 = 0;
        if (arg0 != -50) {
            method1004((byte) 72, 71);
        }
        for (int var3 = 0; var3 < class13.field117.length; var3++) {
            class13.field117[var3] = null;
        }
        class656.method3749(-31964);
        for (int var4 = 0; var4 < 2048; var4++) {
            class142.field1749[var4] = null;
        }
        class387.field5958 = 0;
        class42.field456.method528(-519011192);
        class458.field6840 = 0;
        class294.field4247.method528(-519011192);
        class158.method913(5);
        class67.field739 = 0;
        class23.field243.method3262(arg0 + 50);
        class163.method946(false);
        class488.method2932(false);
        class292.field4055 = null;
        class612.field8904 = 0L;
        if (arg1) {
            class353.method2235(11, 1);
            return;
        }
        class353.method2235(2, 1);
        try {
            class314.method2067(-24319, "loggedout", class635.field9135);
        } catch (Throwable var5) {
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILba;IZII)Lba;")
    public final class327 method1008(int arg0, class327 arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field2171++;
        int var7 = this.field2150[arg2];
        int var8 = this.field2181[arg2];
        class66 var9 = this.field2172.method2964(var8 >> 16, 32);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg1.method1382((byte) 1, arg5, true);
        }
        class66 var11 = null;
        if ((this.field2153 || class233.field3267) && arg4 != -1 && this.field2181.length > arg4) {
            int var12 = this.field2181[arg4];
            var11 = this.field2172.method2964(var12 >> 16, 72);
            arg4 = var12 & 0xFFFF;
        }
        class66 var13 = null;
        class66 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field2151 != null) {
            if (this.field2151.length > arg2) {
                var15 = this.field2151[arg2];
                if (var15 != 65535) {
                    var13 = this.field2172.method2964(var15 >> 16, 24);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field2153 || class233.field3267) && arg4 != -1 && this.field2151.length > arg4) {
                var16 = this.field2151[arg4];
                if (var16 != 65535) {
                    var14 = this.field2172.method2964(var16 >> 16, 116);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field2180) {
            arg5 |= 0x200;
        }
        if (var9.method454(var10, 91)) {
            arg5 |= 0x80;
        }
        if (var9.method453(0, var10)) {
            arg5 |= 0x100;
        }
        if (var9.method455(91, var10)) {
            arg5 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method454(var15, 91)) {
                arg5 |= 0x80;
            }
            if (var13.method453(0, var15)) {
                arg5 |= 0x100;
            }
            if (var13.method455(91, var15)) {
                arg5 |= 0x400;
            }
        }
        if (var11 != null) {
            if (var11.method454(arg4, 91)) {
                arg5 |= 0x80;
            }
            if (var11.method453(0, arg4)) {
                arg5 |= 0x100;
            }
            if (var11.method455(91, arg4)) {
                arg5 |= 0x400;
            }
        }
        if (var14 != null) {
            if (var14.method454(var16, 91)) {
                arg5 |= 0x80;
            }
            if (var14.method453(0, var16)) {
                arg5 |= 0x100;
            }
            if (var14.method455(91, var16)) {
                arg5 |= 0x400;
            }
        }
        int var17 = arg5 | 0x20;
        class327 var18 = arg1.method1382((byte) 1, var17, arg3);
        var18.method2116(var10, this.field2180, 0, var9, true, arg0 - 1, arg4, var7, var11);
        if (var13 != null) {
            var18.method2116(var15, this.field2180, 0, var13, true, arg0 - 1, var16, var7, var14);
        }
        return var18;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lrt;I)V")
    public final void method1009(class194 arg0, int arg1) {
        field2175++;
        while (true) {
            int var3 = arg0.method1177(255);
            if (var3 == 0) {
                if (arg1 == -2) {
                    return;
                } else {
                    this.method1006(-68);
                    return;
                }
            }
            this.method1011(arg0, var3, (byte) -127);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)V")
    public static void method1010(byte arg0) {
        if (arg0 != -14) {
            method1003(27, (byte) 21);
        }
        field2184 = null;
        field2183 = null;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lrt;IB)V")
    private final void method1011(class194 arg0, int arg1, byte arg2) {
        int var4 = 120 / ((arg2 - 52) / 46);
        field2177++;
        if (arg1 == 1) {
            int var5 = arg0.method1220(120);
            this.field2150 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2150[var6] = arg0.method1220(-58);
            }
            this.field2181 = new int[var5];
            for (int var7 = 0; var7 < var5; var7++) {
                this.field2181[var7] = arg0.method1220(-128);
            }
            for (int var8 = 0; var8 < var5; var8++) {
                this.field2181[var8] += arg0.method1220(123) << 16;
            }
        } else if (arg1 == 2) {
            this.field2168 = arg0.method1220(-21);
        } else if (arg1 == 3) {
            this.field2157 = new boolean[256];
            int var16 = arg0.method1177(255);
            for (int var17 = 0; var17 < var16; var17++) {
                this.field2157[arg0.method1177(255)] = true;
            }
        } else if (arg1 == 5) {
            this.field2161 = arg0.method1177(255);
        } else if (arg1 == 6) {
            this.field2167 = arg0.method1220(118);
        } else if (arg1 == 7) {
            this.field2170 = arg0.method1220(125);
        } else if (arg1 == 8) {
            this.field2179 = arg0.method1177(255);
        } else if (arg1 == 9) {
            this.field2169 = arg0.method1177(255);
        } else if (arg1 == 10) {
            this.field2155 = arg0.method1177(255);
        } else if (arg1 == 11) {
            this.field2160 = arg0.method1177(255);
        } else if (arg1 == 12) {
            int var13 = arg0.method1177(255);
            this.field2151 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field2151[var14] = arg0.method1220(121);
            }
            for (int var15 = 0; var15 < var13; var15++) {
                this.field2151[var15] += arg0.method1220(126) << 16;
            }
        } else if (arg1 == 13) {
            int var9 = arg0.method1220(118);
            this.field2159 = new int[var9][];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = arg0.method1177(255);
                if (var11 > 0) {
                    this.field2159[var10] = new int[var11];
                    this.field2159[var10][0] = arg0.method1180(-832631516);
                    for (int var12 = 1; var12 < var11; var12++) {
                        this.field2159[var10][var12] = arg0.method1220(119);
                    }
                }
            }
        } else if (arg1 == 14) {
            this.field2180 = true;
        } else if (arg1 == 15) {
            this.field2153 = true;
        } else if (arg1 == 16) {
            this.field2164 = true;
        } else if (arg1 == 17) {
            this.field2156 = arg0.method1177(255);
        } else if (arg1 == 18) {
            this.field2173 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIBIIILba;I)Lba;")
    public final class327 method1012(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, class327 arg6, int arg7) {
        field2152++;
        int var9 = this.field2150[arg4];
        if (arg3 != -17484) {
            method1010((byte) -106);
        }
        int var10 = this.field2181[arg4];
        class66 var11 = this.field2172.method2964(var10 >> 16, 99);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg6.method1382(arg2, arg0, true);
        }
        class66 var13 = null;
        if ((this.field2153 || class233.field3267) && arg1 != -1 && arg1 < this.field2181.length) {
            int var14 = this.field2181[arg1];
            var13 = this.field2172.method2964(var14 >> 16, arg3 + 17497);
            arg1 = var14 & 0xFFFF;
        }
        if (this.field2180) {
            arg0 |= 0x200;
        }
        if (var11.method454(var12, 91)) {
            arg0 |= 0x80;
        }
        if (var11.method453(0, var12)) {
            arg0 |= 0x100;
        }
        if (var11.method455(91, var12)) {
            arg0 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method454(arg1, 91)) {
                arg0 |= 0x80;
            }
            if (var13.method453(arg3 + 17484, arg1)) {
                arg0 |= 0x100;
            }
            if (var13.method455(91, arg1)) {
                arg0 |= 0x400;
            }
        }
        int var15 = arg0 | 0x20;
        class327 var16 = arg6.method1382(arg2, var15, true);
        var16.method2116(var12, this.field2180, arg5, var11, true, arg7 - 1, arg1, var9, var13);
        return var16;
    }

    static {
        new class474("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ");
        field2183 = new class474("Loaded shaders", "Shaders geladen", "Nuanceurs chargés", "Sombreamento carregado");
    }
}
