import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class138 {

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "I")
    public final int field2234;

    @OriginalMember(owner = "client!gg", name = "n", descriptor = "I")
    public final int field2241;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "I")
    public final int field2229;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "Lci;")
    public final class70 field2231;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "Lph;")
    private static class229 field2230 = class266.method1858("Loading )2 please wait)3", 0);

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "Lph;")
    public static class229 field2233 = field2230;

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "I")
    public static int field2235 = 0;

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "I")
    public static int field2238 = 0;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!gg", name = "l", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!gg", name = "m", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)Z", line = 4)
    public static final boolean method993(byte arg0) throws IOException {
        field2240++;
        if (class121.field2031 == null) {
            return false;
        }
        int var1 = class121.field2031.method525(false);
        if (var1 == 0) {
            return false;
        }
        if (class296.field4837 == -1) {
            class121.field2031.method532(false, 1, 0, class88.field1497.field2668);
            class88.field1497.field2670 = 0;
            class296.field4837 = class88.field1497.method31(-27227);
            var1--;
            class187.field3052 = class70.field1121[class296.field4837];
        }
        if (class187.field3052 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class121.field2031.method532(false, 1, 0, class88.field1497.field2668);
            class187.field3052 = class88.field1497.field2668[0] & 0xFF;
            var1--;
        }
        if (class187.field3052 == -2) {
            if (var1 <= 1) {
                return false;
            }
            var1 -= 2;
            class121.field2031.method532(false, 2, 0, class88.field1497.field2668);
            class88.field1497.field2670 = 0;
            class187.field3052 = class88.field1497.method1161(true);
        }
        if (class187.field3052 > var1) {
            return false;
        }
        class88.field1497.field2670 = 0;
        class121.field2031.method532(false, class187.field3052, 0, class88.field1497.field2668);
        class225.field3700 = class134.field2187;
        class134.field2187 = class195.field3265;
        class195.field3265 = class296.field4837;
        class272.field4549 = 0;
        if (class296.field4837 == 41) {
            int var2 = class88.field1497.method1166((byte) 104);
            int var3 = class88.field1497.method1161(true);
            int var4 = class88.field1497.method1198(false);
            if (class152.method1104(var3, 4)) {
                class95.method703((byte) -45, var2, var4);
            }
            class296.field4837 = -1;
            return true;
        } else if (class296.field4837 == 2) {
            long var5 = class88.field1497.method1174(-10985);
            boolean var7 = true;
            int var8 = class88.field1497.method1161(true);
            int var9 = class88.field1497.method1178(arg0 ^ 0x6F);
            if (var5 < 0L) {
                var7 = false;
                var5 &= Long.MAX_VALUE;
            }
            class229 var10 = class134.field2172;
            if (var8 > 0) {
                var10 = class88.field1497.method1190(0);
            }
            class229 var11 = class100.method767((byte) 53, var5).method1628(-32);
            for (int var12 = 0; var12 < class103.field1752; var12++) {
                if (class98.field1658[var12] == var5) {
                    if (class70.field1162[var12] != var8) {
                        class70.field1162[var12] = var8;
                        if (var8 > 0) {
                            class205.method1439(class248.method1746(8528, new class229[] { var11, class72.field1228 }), true, 5, class134.field2172);
                        }
                        if (var8 == 0) {
                            class205.method1439(class248.method1746(arg0 + 8425, new class229[] { var11, class186.field3032 }), true, 5, class134.field2172);
                        }
                    }
                    class178.field2937[var12] = var10;
                    class52.field739[var12] = var9;
                    var11 = null;
                    class110.field1859[var12] = var7;
                    break;
                }
            }
            if (var11 != null && class103.field1752 < 200) {
                class98.field1658[class103.field1752] = var5;
                class133.field2170[class103.field1752] = var11;
                class70.field1162[class103.field1752] = var8;
                class178.field2937[class103.field1752] = var10;
                class52.field739[class103.field1752] = var9;
                class110.field1859[class103.field1752] = var7;
                class103.field1752++;
            }
            class198.field3295 = class129.field2125;
            boolean var13 = false;
            int var14 = class103.field1752;
            while (var14 > 0) {
                boolean var15 = true;
                var14--;
                for (int var16 = 0; var16 < var14; var16++) {
                    if (class70.field1162[var16] != class209.field3457 && class70.field1162[var16 + 1] == class209.field3457 || class70.field1162[var16] == 0 && class70.field1162[var16 + 1] != 0) {
                        var15 = false;
                        int var17 = class70.field1162[var16];
                        class70.field1162[var16] = class70.field1162[var16 + 1];
                        class70.field1162[var16 + 1] = var17;
                        class229 var18 = class178.field2937[var16];
                        class178.field2937[var16] = class178.field2937[var16 + 1];
                        class178.field2937[var16 + 1] = var18;
                        class229 var19 = class133.field2170[var16];
                        class133.field2170[var16] = class133.field2170[var16 + 1];
                        class133.field2170[var16 + 1] = var19;
                        long var20 = class98.field1658[var16];
                        class98.field1658[var16] = class98.field1658[var16 + 1];
                        class98.field1658[var16 + 1] = var20;
                        int var22 = class52.field739[var16];
                        class52.field739[var16] = class52.field739[var16 + 1];
                        class52.field739[var16 + 1] = var22;
                        boolean var23 = class110.field1859[var16];
                        class110.field1859[var16] = class110.field1859[var16 + 1];
                        class110.field1859[var16 + 1] = var23;
                    }
                }
                if (var15) {
                    break;
                }
            }
            class296.field4837 = -1;
            return true;
        } else if (class296.field4837 == 151) {
            long var337 = class88.field1497.method1174(arg0 ^ 0xFFFFD570);
            class88.field1497.method1163(arg0 ^ 0x3384E7AF);
            long var339 = class88.field1497.method1174(arg0 - 11088);
            boolean var341 = false;
            long var342 = (long) class88.field1497.method1161(true);
            long var344 = (long) class88.field1497.method1176(1048115912);
            int var346 = class88.field1497.method1178(8);
            long var347 = (var342 << 32) + var344;
            int var349 = 0;
            label1580: while (true) {
                if (var349 < 100) {
                    if (class244.field4024[var349] != var347) {
                        var349++;
                        continue;
                    }
                    var341 = true;
                    break;
                }
                if (var346 <= 1) {
                    if ((!class143.field2324 || class190.field3097) && !class8.field110) {
                        for (int var350 = 0; var350 < class216.field3555; var350++) {
                            if (class282.field4682[var350] == var337) {
                                var341 = true;
                                break label1580;
                            }
                        }
                    } else {
                        var341 = true;
                    }
                }
                break;
            }
            if (!var341 && class100.field1717 == 0) {
                class244.field4024[class190.field3087] = var347;
                class190.field3087 = (class190.field3087 + 1) % 100;
                class229 var351 = class31.method257(class84.method623((byte) 47, class88.field1497).method1644(true));
                if (var346 == 2 || var346 == 3) {
                    class26.method177(9, class100.method767((byte) 102, var339).method1628(-32), -109, class248.method1746(8528, new class229[] { class59.field843, class100.method767((byte) 77, var337).method1628(-32) }), var351);
                } else if (var346 == 1) {
                    class26.method177(9, class100.method767((byte) 5, var339).method1628(arg0 ^ 0xFFFFFF87), -124, class248.method1746(8528, new class229[] { class271.field4537, class100.method767((byte) 107, var337).method1628(-32) }), var351);
                } else {
                    class26.method177(9, class100.method767((byte) 119, var339).method1628(-32), -92, class100.method767((byte) 69, var337).method1628(-32), var351);
                }
            }
            class296.field4837 = -1;
            return true;
        } else if (class296.field4837 == 241) {
            int var24 = class88.field1497.method1199(false);
            int var25 = class88.field1497.method1178(8);
            class229 var26 = class88.field1497.method1190(arg0 ^ 0x67);
            if (var25 >= 1 && var25 <= 8) {
                if (var26.method1630(10, class250.field4164)) {
                    var26 = null;
                }
                class321.field5439[var25 - 1] = var26;
                class105.field1776[var25 - 1] = var24 == 0;
            }
            class296.field4837 = -1;
            return true;
        } else if (class296.field4837 == 138) {
            int var336 = class88.field1497.method1183(2);
            if (var336 == 65535) {
                var336 = -1;
            }
            class189.method1321(var336, -6130);
            class296.field4837 = -1;
            return true;
        } else if (class296.field4837 == 162) {
            int var334 = class88.field1497.method1187((byte) -99);
            int var335 = class88.field1497.method1184(65280);
            if (var334 == 65535) {
                var334 = -1;
            }
            class314.method2135(var335, var334, -54);
            class296.field4837 = -1;
            return true;
        } else if (class296.field4837 == 224) {
            long var27 = class88.field1497.method1174(-10985);
            int var29 = class88.field1497.method1161(true);
            byte var30 = class88.field1497.method1163(864348104);
            boolean var31 = false;
            if ((Long.MIN_VALUE & var27) != 0L) {
                var31 = true;
            }
            if (var31) {
                if (class317.field5378 == 0) {
                    class296.field4837 = -1;
                    return true;
                }
                long var32 = var27 & Long.MAX_VALUE;
                boolean var34 = false;
                int var35;
                for (var35 = 0; class317.field5378 > var35 && (class30.field484[var35].field1325 != var32 || class30.field484[var35].field2295 != var29); var35++) {
                }
                if (var35 < class317.field5378) {
                    while (var35 < class317.field5378 - 1) {
                        class30.field484[var35] = class30.field484[var35 + 1];
                        var35++;
                    }
                    class317.field5378--;
                    class30.field484[class317.field5378] = null;
                }
            } else {
                class229 var36 = class88.field1497.method1190(arg0 - 103);
                class142 var37 = new class142();
                var37.field1325 = var27;
                var37.field2305 = class100.method767((byte) 57, var37.field1325);
                var37.field2295 = var29;
                var37.field2294 = var36;
                var37.field2307 = var30;
                int var38;
                for (var38 = class317.field5378 - 1; var38 >= 0; var38--) {
                    int var39 = class30.field484[var38].field2305.method1617(var37.field2305, 0);
                    if (var39 == 0) {
                        class30.field484[var38].field2295 = var29;
                        class30.field484[var38].field2307 = var30;
                        class30.field484[var38].field2294 = var36;
                        class171.field2817 = class129.field2125;
                        class296.field4837 = -1;
                        if (class260.field4348 == var27) {
                            class178.field2933 = var30;
                        }
                        return true;
                    }
                    if (var39 < 0) {
                        break;
                    }
                }
                if (class30.field484.length <= class317.field5378) {
                    class296.field4837 = -1;
                    return true;
                }
                for (int var40 = class317.field5378 - 1; var40 > var38; var40--) {
                    class30.field484[var40 + 1] = class30.field484[var40];
                }
                if (class317.field5378 == 0) {
                    class30.field484 = new class142[100];
                }
                class30.field484[var38 + 1] = var37;
                class317.field5378++;
                if (class260.field4348 == var27) {
                    class178.field2933 = var30;
                }
            }
            class296.field4837 = -1;
            class171.field2817 = class129.field2125;
            return true;
        } else if (class296.field4837 == 102) {
            class110.method836(false);
            class296.field4837 = -1;
            return false;
        } else if (class296.field4837 == 72) {
            class25.field322 = class88.field1497.method1178(8);
            class253.field4229 = class88.field1497.method1178(8);
            class19.field260 = class88.field1497.method1178(8);
            class296.field4837 = -1;
            return true;
        } else if (class296.field4837 == 227) {
            class38.field607 = class88.field1497.method1198(false);
            class152.field2465 = class88.field1497.method1199(false);
            while (class187.field3052 > class88.field1497.field2670) {
                class296.field4837 = class88.field1497.method1178(8);
                class222.method1550(29982);
            }
            class296.field4837 = -1;
            return true;
        } else if (class296.field4837 == 75) {
            if (class187.field3052 == 0) {
                class230.field3828 = class18.field251;
            } else {
                class230.field3828 = class88.field1497.method1190(0);
            }
            class296.field4837 = -1;
            return true;
        } else if (class296.field4837 == 236) {
            int var41 = class88.field1497.method1191(arg0 + 31673);
            int var42 = class88.field1497.method1161(true);
            if (var41 < -70000) {
                var42 += 32768;
            }
            class301 var43;
            if (var41 >= 0) {
                var43 = class206.method1440(var41, (byte) -68);
            } else {
                var43 = null;
            }
            if (var43 != null) {
                for (int var44 = 0; var44 < var43.field4922.length; var44++) {
                    var43.field4922[var44] = 0;
                    var43.field4909[var44] = 0;
                }
            }
            class227.method1584(-72, var42);
            int var45 = class88.field1497.method1161(true);
            for (int var46 = 0; var46 < var45; var46++) {
                int var47 = class88.field1497.method1178(8);
                if (var47 == 255) {
                    var47 = class88.field1497.method1166((byte) 95);
                }
                int var48 = class88.field1497.method1183(arg0 ^ 0x65);
                if (var43 != null && var43.field4922.length > var46) {
                    var43.field4922[var46] = var48;
                    var43.field4909[var46] = var47;
                }
                class303.method2047(var48 - 1, true, var47, var42, var46);
            }
            if (var43 != null) {
                class296.method2006(var43, 124);
            }
            class252.method1770(true);
            class312.field5255[class243.method1696(class313.field5315++, 31)] = class243.method1696(var42, 32767);
            class296.field4837 = -1;
            return true;
        } else if (class296.field4837 == 237) {
            int var332 = class88.field1497.method1199(false);
            int var333 = class88.field1497.method1161(true);
            class136.method963(var333, (byte) -80, var332);
            class296.field4837 = -1;
            return true;
        } else if (class296.field4837 == 103) {
            int var329 = class88.field1497.method1178(8);
            class240 var330 = new class240();
            int var331 = var329 >> 6;
            var330.field3977 = var329 & 0x3F;
            var330.field3969 = class88.field1497.method1178(8);
            if (var330.field3969 >= 0 && var330.field3969 < class300.field4872.length) {
                if (var330.field3977 == 1 || var330.field3977 == 10) {
                    var330.field3979 = class88.field1497.method1161(true);
                    class88.field1497.field2670 += 3;
                } else if (var330.field3977 >= 2 && var330.field3977 <= 6) {
                    if (var330.field3977 == 2) {
                        var330.field3973 = 64;
                        var330.field3976 = 64;
                    }
                    if (var330.field3977 == 3) {
                        var330.field3973 = 64;
                        var330.field3976 = 0;
                    }
                    if (var330.field3977 == 4) {
                        var330.field3973 = 64;
                        var330.field3976 = 128;
                    }
                    if (var330.field3977 == 5) {
                        var330.field3973 = 0;
                        var330.field3976 = 64;
                    }
                    if (var330.field3977 == 6) {
                        var330.field3976 = 64;
                        var330.field3973 = 128;
                    }
                    var330.field3977 = 2;
                    var330.field3978 = class88.field1497.method1161(true);
                    var330.field3964 = class88.field1497.method1161(true);
                    var330.field3975 = class88.field1497.method1178(8);
                }
                var330.field3968 = class88.field1497.method1161(true);
                if (var330.field3968 == 65535) {
                    var330.field3968 = -1;
                }
                class162.field2606[var331] = var330;
            }
            class296.field4837 = -1;
            return true;
        } else if (class296.field4837 == 204) {
            int var326 = class88.field1497.method1179((byte) -74);
            int var327 = class88.field1497.method1162(2);
            int var328 = class88.field1497.method1166((byte) 86);
            if (class152.method1104(var327, 4)) {
                class57.method385(var328, (byte) -99, var326);
            }
            class296.field4837 = -1;
            return true;
        } else if (class296.field4837 == 213) {
            class50.method352((byte) -10);
            class296.field4837 = -1;
            return true;
        } else if (class296.field4837 == 183) {
            class296.field4837 = -1;
            class68.field1086 = 0;
            return true;
        } else if (class296.field4837 == 230) {
            int var49 = class88.field1497.method1161(true);
            int var50 = class88.field1497.method1161(true);
            int var51 = class88.field1497.method1193((byte) 35);
            if (class152.method1104(var49, 4)) {
                if (var51 == 2) {
                    class121.method902(8127);
                }
                class198.field3292 = var50;
                class60.method405(var50, 107);
                class304.method2052(117, false);
                class6.method42((byte) 127, class198.field3292);
                for (int var52 = 0; var52 < 100; var52++) {
                    class187.field3036[var52] = true;
                }
            }
            class296.field4837 = -1;
            return true;
        } else if (class296.field4837 == 124) {
            int var324 = class88.field1497.method1183(2);
            int var325 = class88.field1497.method1161(true);
            class147.field2379 = var324;
            class245.field4049 = var325;
            class181.method1287(false);
            class296.field4837 = -1;
            return true;
        } else if (class296.field4837 == 225) {
            int var53 = class88.field1497.method1166((byte) 111);
            int var54 = class88.field1497.method1161(true);
            int var55 = class88.field1497.method1161(true);
            int var56 = class88.field1497.method1187((byte) -99);
            if (var53 >> 30 != 0) {
                int var57 = var53 >> 28 & 0x3;
                int var58 = (var53 >> 14 & 0x3FFF) - class1.field9;
                int var59 = (var53 & 0x3FFF) - class1.field1;
                if (var58 >= 0 && var59 >= 0 && var58 < 104 && var59 < 104) {
                    int var60 = var59 * 128 + 64;
                    int var61 = var58 * 128 + 64;
                    class256 var62 = new class256(var56, var57, var61, var60, class259.method1801(var60, -20428, var57, var61) - var55, var54, class319.field5393);
                    class186.field3023.method1582(new class123(var62), 4);
                }
            } else if (var53 >> 29 != 0) {
                int var67 = var53 & 0xFFFF;
                class217 var68 = class187.field3035[var67];
                if (var68 != null) {
                    var68.field5119 = 0;
                    var68.field5097 = 0;
                    var68.field5112 = var56;
                    var68.field5107 = class319.field5393 + var54;
                    if (class319.field5393 < var68.field5107) {
                        var68.field5119 = -1;
                    }
                    if (var68.field5112 == 65535) {
                        var68.field5112 = -1;
                    }
                    var68.field5137 = var55;
                    if (var68.field5112 != -1 && class319.field5393 == var68.field5107) {
                        int var69 = class259.method1799(arg0 ^ 0x5048, var68.field5112).field4508;
                        if (var69 != -1) {
                            class312 var70 = class53.method362((byte) 113, var69);
                            if (var70 != null && var70.field5226 != null) {
                                class176.method1265(arg0 - 202, false, 0, var68.field5168, var70, var68.field5147);
                            }
                        }
                    }
                }
            } else if ((var53 >> 28) != 0) {
                int var63 = var53 & 0xFFFF;
                class209 var64;
                if (class145.field2354 == var63) {
                    var64 = class230.field3820;
                } else {
                    var64 = class114.field1931[var63];
                }
                if (var64 != null) {
                    var64.field5107 = class319.field5393 + var54;
                    var64.field5137 = var55;
                    var64.field5112 = var56;
                    var64.field5097 = 0;
                    if (var64.field5112 == 65535) {
                        var64.field5112 = -1;
                    }
                    var64.field5119 = 0;
                    if (class319.field5393 < var64.field5107) {
                        var64.field5119 = -1;
                    }
                    if (var64.field5112 != -1 && class319.field5393 == var64.field5107) {
                        int var65 = class259.method1799(arg0 + 20424, var64.field5112).field4508;
                        if (var65 != -1) {
                            class312 var66 = class53.method362((byte) 100, var65);
                            if (var66 != null && var66.field5226 != null) {
                                class176.method1265(-92, class230.field3820 == var64, 0, var64.field5168, var66, var64.field5147);
                            }
                        }
                    }
                }
            }
            class296.field4837 = -1;
            return true;
        } else if (class296.field4837 == 154) {
            int var71 = class88.field1497.method1187((byte) -99);
            int var72 = class88.field1497.method1171(true);
            class229 var73 = class88.field1497.method1190(0);
            if (class152.method1104(var71, 4)) {
                class65.method488(var73, var72, 3);
            }
            class296.field4837 = -1;
            return true;
        } else if (class296.field4837 == 250) {
            int var321 = class88.field1497.method1161(true);
            if (var321 == 65535) {
                var321 = -1;
            }
            int var322 = class88.field1497.method1178(arg0 ^ 0x6F);
            int var323 = class88.field1497.method1161(true);
            class228.method1586(var322, var323, var321, false);
            class296.field4837 = -1;
            return true;
        } else if (class296.field4837 == 191) {
            int var312 = class88.field1497.method1162(2);
            if (var312 == 65535) {
                var312 = -1;
            }
            int var313 = class88.field1497.method1177(24501);
            int var314 = class88.field1497.method1187((byte) -99);
            int var315 = class88.field1497.method1191(arg0 + 31673);
            int var316 = class88.field1497.method1162(2);
            if (var316 == 65535) {
                var316 = -1;
            }
            if (class152.method1104(var314, 4)) {
                for (int var317 = var316; var317 <= var312; var317++) {
                    long var318 = ((long) var315 << 32) + (long) var317;
                    class80 var320 = class324.field5529.method713(3365, var318);
                    if (var320 != null) {
                        var320.method598(55);
                    }
                    class324.field5529.method710(new class295(var313), (byte) -124, var318);
                }
            }
            class296.field4837 = -1;
            return true;
        } else if (class296.field4837 == 125) {
            class142.method1018((byte) 123, true);
            class296.field4837 = -1;
            return true;
        } else if (class296.field4837 == 23) {
            class208.method1446((byte) -119, class88.field1497);
            class296.field4837 = -1;
            return true;
        } else if (class296.field4837 == 247) {
            int var309 = class88.field1497.method1199(false);
            int var310 = class88.field1497.method1193((byte) 92);
            int var311 = class88.field1497.method1193((byte) 72);
            class298.field4849 = var309 >> 1;
            class230.field3820.method1454(var310, (byte) -111, (var309 & 0x1) == 1, var311);
            class296.field4837 = -1;
            return true;
        } else if (class296.field4837 == 203) {
            class171.field2817 = class129.field2125;
            long var297 = class88.field1497.method1174(-10985);
            if (var297 == 0L) {
                class300.field4869 = null;
                class317.field5378 = 0;
                class217.field3557 = null;
                class296.field4837 = -1;
                class30.field484 = null;
                return true;
            }
            long var299 = class88.field1497.method1174(-10985);
            class217.field3557 = class100.method767((byte) 112, var299);
            class300.field4869 = class100.method767((byte) 103, var297);
            client.field5430 = class88.field1497.method1163(arg0 + 864348001);
            int var301 = class88.field1497.method1178(8);
            if (var301 == 255) {
                class296.field4837 = -1;
                return true;
            }
            class317.field5378 = var301;
            class142[] var302 = new class142[100];
            for (int var303 = 0; var303 < class317.field5378; var303++) {
                var302[var303] = new class142();
                var302[var303].field1325 = class88.field1497.method1174(-10985);
                var302[var303].field2305 = class100.method767((byte) 67, var302[var303].field1325);
                var302[var303].field2295 = class88.field1497.method1161(true);
                var302[var303].field2307 = class88.field1497.method1163(864348104);
                var302[var303].field2294 = class88.field1497.method1190(0);
                if (class260.field4348 == var302[var303].field1325) {
                    class178.field2933 = var302[var303].field2307;
                }
            }
            boolean var304 = false;
            int var305 = class317.field5378;
            while (var305 > 0) {
                var305--;
                boolean var306 = true;
                for (int var307 = 0; var307 < var305; var307++) {
                    if (var302[var307].field2305.method1617(var302[var307 + 1].field2305, 0) > 0) {
                        var306 = false;
                        class142 var308 = var302[var307];
                        var302[var307] = var302[var307 + 1];
                        var302[var307 + 1] = var308;
                    }
                }
                if (var306) {
                    break;
                }
            }
            class296.field4837 = -1;
            class30.field484 = var302;
            return true;
        } else if (class296.field4837 == 190) {
            int var74 = class88.field1497.method1161(true);
            int var75 = class88.field1497.method1162(2);
            int var76 = class88.field1497.method1191(31776);
            if (var75 == 65535) {
                var75 = -1;
            }
            if (class152.method1104(var74, 4)) {
                class152.method1103(var75, var76, 1, false);
            }
            class296.field4837 = -1;
            return true;
        } else if (class296.field4837 == 185) {
            int var77 = class88.field1497.method1161(true);
            class229 var78 = class88.field1497.method1190(0);
            int var79 = class88.field1497.method1187((byte) -99);
            if (class152.method1104(var77, 4)) {
                class239.method1686(var79, false, var78);
            }
            class296.field4837 = -1;
            return true;
        } else if (class296.field4837 == 25) {
            int var294 = class88.field1497.method1161(true);
            int var295 = class88.field1497.method1162(arg0 - 101);
            if (var294 == 65535) {
                var294 = -1;
            }
            int var296 = class88.field1497.method1191(31776);
            if (class152.method1104(var295, arg0 - 99)) {
                class152.method1103(var294, var296, 2, false);
            }
            class296.field4837 = -1;
            return true;
        } else if (class296.field4837 == 99) {
            int var80 = class88.field1497.method1183(2);
            int var81 = class88.field1497.method1183(arg0 - 101);
            int var82 = class88.field1497.method1166((byte) 101);
            int var83 = class88.field1497.method1162(2);
            int var84 = class88.field1497.method1187((byte) -99);
            if (class152.method1104(var83, 4)) {
                class186.method1309(var80, var84, var81, 109, var82);
            }
            class296.field4837 = -1;
            return true;
        } else if (class296.field4837 == 106) {
            int var85 = class88.field1497.method1161(true);
            int var86 = class88.field1497.method1183(2);
            int var87 = class88.field1497.method1199(false);
            class217 var88 = class187.field3035[var85];
            if (var88 != null) {
                class316.method2141(var87, arg0 ^ 0x67, var88, var86);
            }
            class296.field4837 = -1;
            return true;
        } else if (class296.field4837 == 168) {
            long var89 = class88.field1497.method1174(-10985);
            class229 var91 = class31.method257(class84.method623((byte) 47, class88.field1497).method1644(true));
            class205.method1439(var91, true, 6, class100.method767((byte) 6, var89).method1628(-32));
            class296.field4837 = -1;
            return true;
        } else if (class296.field4837 == 119) {
            class51.method357(class88.field1497.method1190(0), -53);
            class296.field4837 = -1;
            return true;
        } else if (class296.field4837 == 21) {
            int var92 = class88.field1497.method1161(true);
            int var93 = class88.field1497.method1191(31776);
            if (class152.method1104(var92, arg0 - 99)) {
                class48 var94 = (class48) class251.field4176.method713(3365, (long) var93);
                if (var94 != null) {
                    class69.method544(var94, true, 10);
                }
                if (class156.field2535 != null) {
                    class296.method2006(class156.field2535, 120);
                    class156.field2535 = null;
                }
            }
            class296.field4837 = -1;
            return true;
        } else if (class296.field4837 == 244) {
            for (int var95 = 0; var95 < class114.field1931.length; var95++) {
                if (class114.field1931[var95] != null) {
                    class114.field1931[var95].field5136 = -1;
                }
            }
            for (int var96 = 0; var96 < class187.field3035.length; var96++) {
                if (class187.field3035[var96] != null) {
                    class187.field3035[var96].field5136 = -1;
                }
            }
            class296.field4837 = -1;
            return true;
        } else if (class296.field4837 == 85) {
            int var97 = class88.field1497.method1162(2);
            byte var98 = class88.field1497.method1196((byte) 110);
            class208.method1448(arg0 ^ 0x47, var98, var97);
            class296.field4837 = -1;
            return true;
        } else if (class296.field4837 == 177) {
            int var99 = class88.field1497.method1178(8);
            int var100 = class88.field1497.method1178(8);
            int var101 = class88.field1497.method1161(true);
            int var102 = class88.field1497.method1178(8);
            int var103 = class88.field1497.method1178(arg0 - 95);
            class133.method943(var99, var101, true, var103, var102, var100, 4478);
            class296.field4837 = -1;
            return true;
        } else if (class296.field4837 == 91) {
            for (int var293 = 0; var293 < class166.field2711.length; var293++) {
                if (class85.field1454[var293] != class166.field2711[var293]) {
                    class166.field2711[var293] = class85.field1454[var293];
                    class198.method1395(var293, 13357);
                    class288.field4726[class243.method1696(31, class238.field3937++)] = var293;
                }
            }
            class296.field4837 = -1;
            return true;
        } else if (class296.field4837 == 143) {
            class216.field3555 = class187.field3052 / 8;
            for (int var292 = 0; var292 < class216.field3555; var292++) {
                class282.field4682[var292] = class88.field1497.method1174(-10985);
                class108.field1820[var292] = class100.method767((byte) 121, class282.field4682[var292]);
            }
            class296.field4837 = -1;
            class198.field3295 = class129.field2125;
            return true;
        } else if (class296.field4837 == 60 || class296.field4837 == 115 || class296.field4837 == 73 || class296.field4837 == 9 || class296.field4837 == 156 || class296.field4837 == 34 || class296.field4837 == 31 || class296.field4837 == 110 || class296.field4837 == 189 || class296.field4837 == 192 || class296.field4837 == 215 || class296.field4837 == 22) {
            class222.method1550(29982);
            class296.field4837 = -1;
            return true;
        } else if (class296.field4837 == 26) {
            class7.field97 = class88.field1497.method1178(8);
            class296.field4837 = -1;
            return true;
        } else if (class296.field4837 == 89) {
            class252.method1770(true);
            int var288 = class88.field1497.method1166((byte) 111);
            int var289 = class88.field1497.method1178(arg0 ^ 0x6F);
            int var290 = class88.field1497.method1178(arg0 - 95);
            class145.field2347[var290] = var288;
            class230.field3825[var290] = var289;
            class171.field2819[var290] = 1;
            for (int var291 = 0; var291 < 98; var291++) {
                if (var288 >= class57.field799[var291]) {
                    class171.field2819[var290] = var291 + 2;
                }
            }
            class307.field5184[class243.method1696(31, class232.field3844++)] = var290;
            class296.field4837 = -1;
            return true;
        } else if (class296.field4837 == 66) {
            int var104 = class88.field1497.method1183(2);
            int var105 = class88.field1497.method1161(true);
            int var106 = class88.field1497.method1161(true);
            int var107 = class88.field1497.method1177(24501);
            if (class152.method1104(var104, arg0 ^ 0x63)) {
                class152.method1103(var106 << 16 | var105, var107, 7, false);
            }
            class296.field4837 = -1;
            return true;
        } else if (class296.field4837 == 148) {
            int var283 = class88.field1497.method1178(arg0 - 95);
            int var284 = class88.field1497.method1178(8);
            int var285 = class88.field1497.method1161(true);
            int var286 = class88.field1497.method1178(8);
            int var287 = class88.field1497.method1178(arg0 - 95);
            class259.method1800(var284, var285, var283, 123, var287, var286);
            class296.field4837 = -1;
            return true;
        } else if (class296.field4837 == 253) {
            int var108 = class88.field1497.method1191(arg0 + 31673);
            int var109 = class88.field1497.method1187((byte) -99);
            if (var109 == 65535) {
                var109 = -1;
            }
            int var110 = class88.field1497.method1171(true);
            int var111 = class88.field1497.method1162(2);
            if (class152.method1104(var111, arg0 ^ 0x63)) {
                class301 var112 = class206.method1440(var110, (byte) -68);
                if (var112.field5043) {
                    class139.method1000(var109, 2, var108, var110);
                    class191 var113 = class124.method920(-84, var109);
                    class186.method1309(var113.field3157, var113.field3161, var113.field3132, 74, var110);
                    class120.method900(10, var113.field3140, var113.field3151, var110, var113.field3136);
                } else if (var109 == -1) {
                    class296.field4837 = -1;
                    var112.field5016 = 0;
                    return true;
                } else {
                    class191 var114 = class124.method920(-84, var109);
                    var112.field4916 = var114.field3132;
                    var112.field5034 = var114.field3157;
                    var112.field4933 = var114.field3161 * 100 / var108;
                    var112.field4932 = var109;
                    var112.field5016 = 4;
                    class296.method2006(var112, 124);
                }
            }
            class296.field4837 = -1;
            return true;
        } else if (class296.field4837 == 93) {
            class142.method1018((byte) 104, false);
            class296.field4837 = -1;
            return true;
        } else if (class296.field4837 == 187) {
            class281.method1936(9244);
            class296.field4837 = -1;
            return true;
        } else if (class296.field4837 == 141) {
            int var278 = class88.field1497.method1162(2);
            int var279 = class88.field1497.method1193((byte) 37);
            int var280 = class88.field1497.method1161(true);
            int var281 = class88.field1497.method1171(true);
            if (class152.method1104(var278, 4)) {
                class48 var282 = (class48) class251.field4176.method713(arg0 ^ 0xD42, (long) var281);
                if (var282 != null) {
                    class69.method544(var282, var282.field700 != var280, 10);
                }
                class208.method1449(var281, var280, var279, -8);
            }
            class296.field4837 = -1;
            return true;
        } else if (class296.field4837 == 201) {
            class280.method1927(arg0 - 43);
            class296.field4837 = -1;
            return true;
        } else if (class296.field4837 == 84) {
            int var115 = class88.field1497.method1171(true);
            int var116 = class88.field1497.method1171(true);
            int var117 = class88.field1497.method1183(2);
            if (class152.method1104(var117, arg0 - 99)) {
                class48 var118 = (class48) class251.field4176.method713(3365, (long) var116);
                class48 var119 = (class48) class251.field4176.method713(3365, (long) var115);
                if (var119 != null) {
                    class69.method544(var119, var118 == null || var118.field700 != var119.field700, arg0 ^ 0x6D);
                }
                if (var118 != null) {
                    var118.method598(49);
                    class251.field4176.method710(var118, (byte) 65, (long) var115);
                }
                class301 var120 = class206.method1440(var116, (byte) -68);
                if (var120 != null) {
                    class296.method2006(var120, 122);
                }
                class301 var121 = class206.method1440(var115, (byte) -68);
                if (var121 != null) {
                    class296.method2006(var121, arg0 + 20);
                    class103.method787(true, var121, 78);
                }
                if (class198.field3292 != -1) {
                    class253.method1772(1, arg0 ^ 0x67, class198.field3292);
                }
            }
            class296.field4837 = -1;
            return true;
        } else if (class296.field4837 == 88) {
            int var277 = class88.field1497.method1161(true);
            class167.method1225(-90, var277);
            class312.field5255[class243.method1696(class313.field5315++, 31)] = class243.method1696(var277, 32767);
            class296.field4837 = -1;
            return true;
        } else if (class296.field4837 == 238) {
            int var122 = class88.field1497.method1166((byte) 82);
            int var123 = class88.field1497.method1183(2);
            int var124 = class88.field1497.method1183(2);
            if (class152.method1104(var124, 4)) {
                class113.method858(var122, var123, arg0 ^ 0x5E1C);
            }
            class296.field4837 = -1;
            return true;
        } else if (class296.field4837 == 140) {
            int var273 = class88.field1497.method1187((byte) -99);
            int var274 = class88.field1497.method1166((byte) 124);
            int var275 = class88.field1497.method1181(-1483185880);
            int var276 = class88.field1497.method1179((byte) -74);
            if (class152.method1104(var273, arg0 ^ 0x63)) {
                class256.method1786(var275, 0, var276, var274);
            }
            class296.field4837 = -1;
            return true;
        } else if (class296.field4837 == 249) {
            int var125 = class88.field1497.method1187((byte) -99);
            int var126 = class88.field1497.method1187((byte) -99);
            class229 var127 = class88.field1497.method1190(arg0 - 103);
            if (class152.method1104(var126, arg0 - 99)) {
                class239.method1686(var125, false, var127);
            }
            class296.field4837 = -1;
            return true;
        } else if (class296.field4837 == 155) {
            class45.method332(0);
            class252.method1770(true);
            class296.field4837 = -1;
            class238.field3937 += 32;
            return true;
        } else if (class296.field4837 == 173) {
            int var271 = class88.field1497.method1187((byte) -99);
            int var272 = class88.field1497.method1166((byte) 110);
            class208.method1448(arg0 - 71, var272, var271);
            class296.field4837 = -1;
            return true;
        } else if (class296.field4837 == 120) {
            int var128 = class88.field1497.method1191(31776);
            int var129 = class88.field1497.method1161(true);
            if (var128 < -70000) {
                var129 += 32768;
            }
            class301 var130;
            if (var128 < 0) {
                var130 = null;
            } else {
                var130 = class206.method1440(var128, (byte) -68);
            }
            while (class88.field1497.field2670 < class187.field3052) {
                int var131 = class88.field1497.method1209(-128);
                int var132 = 0;
                int var133 = class88.field1497.method1161(true);
                if (var133 != 0) {
                    var132 = class88.field1497.method1178(8);
                    if (var132 == 255) {
                        var132 = class88.field1497.method1191(31776);
                    }
                }
                if (var130 != null && var131 >= 0 && var130.field4922.length > var131) {
                    var130.field4922[var131] = var133;
                    var130.field4909[var131] = var132;
                }
                class303.method2047(var133 - 1, true, var132, var129, var131);
            }
            if (var130 != null) {
                class296.method2006(var130, 123);
            }
            class252.method1770(true);
            class312.field5255[class243.method1696(class313.field5315++, 31)] = class243.method1696(32767, var129);
            class296.field4837 = -1;
            return true;
        } else if (class296.field4837 == 221) {
            int var134 = class88.field1497.method1183(2);
            int var135 = class88.field1497.method1187((byte) -99);
            int var136 = class88.field1497.method1187((byte) -99);
            int var137 = class88.field1497.method1171(true);
            if (class152.method1104(var134, 4)) {
                class328.method2251((var136 << 16) + var135, 101, var137);
            }
            class296.field4837 = -1;
            return true;
        } else if (class296.field4837 == 209) {
            int var269 = class88.field1497.method1166((byte) 88);
            int var270 = class88.field1497.method1162(2);
            class136.method963(var270, (byte) 113, var269);
            class296.field4837 = -1;
            return true;
        } else if (class296.field4837 == 57) {
            int var138 = class88.field1497.method1166((byte) 97);
            int var139 = class88.field1497.method1161(true);
            if (class152.method1104(var139, 4)) {
                int var140 = 0;
                if (class230.field3820.field3446 != null) {
                    var140 = class230.field3820.field3446.method970((byte) -18);
                }
                class152.method1103(var140, var138, 3, false);
            }
            class296.field4837 = -1;
            return true;
        } else if (class296.field4837 == 202) {
            class152.field2465 = class88.field1497.method1193((byte) 127);
            class38.field607 = class88.field1497.method1198(false);
            for (int var266 = class152.field2465; var266 < (class152.field2465 + 8); var266++) {
                for (int var267 = class38.field607; var267 < (class38.field607 + 8); var267++) {
                    if (class8.field108[class298.field4849][var266][var267] != null) {
                        class8.field108[class298.field4849][var266][var267] = null;
                        class69.method543(arg0 ^ 0xE7, var267, var266);
                    }
                }
            }
            for (class218 var268 = (class218) class225.field3687.method1580((byte) -39); var268 != null; var268 = (class218) class225.field3687.method1579((byte) 28)) {
                if (var268.field3575 >= class152.field2465 && var268.field3575 < (class152.field2465 + 8) && class38.field607 <= var268.field3588 && var268.field3588 < class38.field607 + 8 && class298.field4849 == var268.field3577) {
                    var268.field3582 = 0;
                }
            }
            class296.field4837 = -1;
            return true;
        } else if (class296.field4837 == 43) {
            long var250 = class88.field1497.method1174(-10985);
            class88.field1497.method1163(arg0 + 864348001);
            long var252 = class88.field1497.method1174(-10985);
            long var254 = (long) class88.field1497.method1161(true);
            long var256 = (long) class88.field1497.method1176(1048115912);
            int var258 = class88.field1497.method1178(8);
            int var259 = class88.field1497.method1161(true);
            long var260 = (var254 << 32) + var256;
            boolean var262 = false;
            int var263 = 0;
            label1391: while (true) {
                if (var263 < 100) {
                    if (class244.field4024[var263] != var260) {
                        var263++;
                        continue;
                    }
                    var262 = true;
                    break;
                }
                if (var258 <= 1) {
                    for (int var264 = 0; var264 < class216.field3555; var264++) {
                        if (class282.field4682[var264] == var250) {
                            var262 = true;
                            break label1391;
                        }
                    }
                }
                break;
            }
            if (!var262 && class100.field1717 == 0) {
                class244.field4024[class190.field3087] = var260;
                class190.field3087 = (class190.field3087 + 1) % 100;
                class229 var265 = class224.method1560((byte) -61, var259).method1816(false, class88.field1497);
                if (var258 == 2 || var258 == 3) {
                    class190.method1323(var259, class100.method767((byte) 5, var252).method1628(-32), 20, 18411, class248.method1746(8528, new class229[] { class59.field843, class100.method767((byte) 29, var250).method1628(-32) }), var265);
                } else if (var258 == 1) {
                    class190.method1323(var259, class100.method767((byte) 95, var252).method1628(-32), 20, 18411, class248.method1746(8528, new class229[] { class271.field4537, class100.method767((byte) 22, var250).method1628(-32) }), var265);
                } else {
                    class190.method1323(var259, class100.method767((byte) 60, var252).method1628(-32), 20, 18411, class100.method767((byte) 117, var250).method1628(-32), var265);
                }
            }
            class296.field4837 = -1;
            return true;
        } else if (class296.field4837 == 220) {
            long var237 = class88.field1497.method1174(-10985);
            long var239 = (long) class88.field1497.method1161(true);
            long var241 = (long) class88.field1497.method1176(arg0 + 1048115809);
            int var243 = class88.field1497.method1178(arg0 - 95);
            long var244 = (var239 << 32) + var241;
            boolean var246 = false;
            int var247 = 0;
            label1366: while (true) {
                if (var247 >= 100) {
                    if (var243 <= 1) {
                        if ((!class143.field2324 || class190.field3097) && !class8.field110) {
                            for (int var248 = 0; var248 < class216.field3555; var248++) {
                                if (class282.field4682[var248] == var237) {
                                    var246 = true;
                                    break label1366;
                                }
                            }
                        } else {
                            var246 = true;
                        }
                    }
                    break;
                }
                if (class244.field4024[var247] == var244) {
                    var246 = true;
                    break;
                }
                var247++;
            }
            if (!var246 && class100.field1717 == 0) {
                class244.field4024[class190.field3087] = var244;
                class190.field3087 = (class190.field3087 + 1) % 100;
                class229 var249 = class31.method257(class84.method623((byte) 47, class88.field1497).method1644(true));
                if (var243 == 2 || var243 == 3) {
                    class205.method1439(var249, true, 7, class248.method1746(8528, new class229[] { class59.field843, class100.method767((byte) 57, var237).method1628(arg0 - 135) }));
                } else if (var243 == 1) {
                    class205.method1439(var249, true, 7, class248.method1746(8528, new class229[] { class271.field4537, class100.method767((byte) 51, var237).method1628(-32) }));
                } else {
                    class205.method1439(var249, true, 3, class100.method767((byte) 34, var237).method1628(arg0 - 135));
                }
            }
            class296.field4837 = -1;
            return true;
        } else if (class296.field4837 == 242) {
            class115.field1953 = class88.field1497.method1183(2) * 30;
            class296.field4837 = -1;
            class116.field1964 = class129.field2125;
            return true;
        } else if (class296.field4837 == 144) {
            int var141 = class88.field1497.method1161(true);
            class229 var142 = class88.field1497.method1190(0);
            Object[] var143 = new Object[var142.method1642(-97) + 1];
            for (int var144 = var142.method1642(69) - 1; var144 >= 0; var144--) {
                if (var142.method1598(var144, 61) == 115) {
                    var143[var144 + 1] = class88.field1497.method1190(class101.method775(arg0, 103));
                } else {
                    var143[var144 + 1] = Integer.valueOf(class88.field1497.method1191(class101.method775(arg0, 31815)));
                }
            }
            var143[0] = Integer.valueOf(class88.field1497.method1191(31776));
            if (class152.method1104(var141, 4)) {
                class157 var145 = new class157();
                var145.field2552 = var143;
                class177.method1275(var145, -120);
            }
            class296.field4837 = -1;
            return true;
        } else if (class296.field4837 == 69) {
            class152.field2465 = class88.field1497.method1199(false);
            class38.field607 = class88.field1497.method1199(false);
            class296.field4837 = -1;
            return true;
        } else if (class296.field4837 == 128) {
            if (class325.field5569 != null) {
                class168.method1229(-1, false, (byte) -85, -1, class72.field1231);
            }
            byte[] var146 = new byte[class187.field3052];
            class88.field1497.method41((byte) -32, 0, class187.field3052, var146);
            class229 var147 = class27.method184((byte) 124, var146, class187.field3052, 0);
            if (class160.field2590 == null && class92.field1562 == 3 || !class92.field1557.startsWith("win") || class174.field2849) {
                class119.method896(true, arg0 - 29, var147);
            } else {
                class108.field1851 = true;
                class145.field2352 = var147;
                class152.field2460 = class249.field4143.method687((byte) 21, new String(var147.method1599(arg0 - 224), "ISO-8859-1"));
            }
            class296.field4837 = -1;
            return true;
        } else if (class296.field4837 == 181) {
            int var148 = class88.field1497.method1171(true);
            int var149 = class88.field1497.method1183(arg0 ^ 0x65);
            int var150 = class88.field1497.method1183(2);
            if (class152.method1104(var150, 4)) {
                class84.method625(var149, var148, 2361);
            }
            class296.field4837 = -1;
            return true;
        } else if (class296.field4837 == 70) {
            long var233 = class88.field1497.method1174(-10985);
            int var235 = class88.field1497.method1161(true);
            class229 var236 = class224.method1560((byte) -61, var235).method1816(false, class88.field1497);
            class190.method1323(var235, (class229) null, 19, 18411, class100.method767((byte) 106, var233).method1628(arg0 - 135), var236);
            class296.field4837 = -1;
            return true;
        } else if (class296.field4837 == 79) {
            int var151 = class88.field1497.method1177(24501);
            class180.field2950 = class249.field4143.method689(true, var151);
            class296.field4837 = -1;
            return true;
        } else if (class296.field4837 == 118) {
            if (class198.field3292 != -1) {
                class253.method1772(0, 0, class198.field3292);
            }
            class296.field4837 = -1;
            return true;
        } else if (class296.field4837 == 44) {
            int var152 = class88.field1497.method1162(2);
            int var153 = class88.field1497.method1198(false);
            int var154 = class88.field1497.method1183(2);
            if (class152.method1104(var152, 4)) {
                class84.method625(var154, var153, 2361);
            }
            class296.field4837 = -1;
            return true;
        } else if (class296.field4837 == 15) {
            int var228 = class88.field1497.method1178(8);
            int var229 = class88.field1497.method1178(8);
            int var230 = class88.field1497.method1178(8);
            int var231 = class88.field1497.method1178(arg0 ^ 0x6F);
            int var232 = class88.field1497.method1161(true);
            class15.field185[var228] = true;
            class186.field3026[var228] = var229;
            class66.field1043[var228] = var230;
            class126.field2100[var228] = var231;
            class74.field1257[var228] = var232;
            class296.field4837 = -1;
            return true;
        } else if (class296.field4837 == 76) {
            int var155 = class88.field1497.method1178(8);
            if (class88.field1497.method1178(arg0 - 95) == 0) {
                class187.field3037[var155] = new class186();
            } else {
                class88.field1497.field2670--;
                class187.field3037[var155] = new class186(class88.field1497);
            }
            class296.field4837 = -1;
            class279.field4625 = class129.field2125;
            return true;
        } else if (class296.field4837 == 197) {
            class252.method1770(true);
            class111.field1872 = class88.field1497.method1179((byte) -74);
            class116.field1964 = class129.field2125;
            class296.field4837 = -1;
            return true;
        } else {
            if (arg0 != 103) {
                method996(87, false);
            }
            if (class296.field4837 == 80) {
                class252.method1770(true);
                class53.field749 = class88.field1497.method1178(8);
                class296.field4837 = -1;
                class116.field1964 = class129.field2125;
                return true;
            } else if (class296.field4837 == 14) {
                int var156 = class88.field1497.method1166((byte) 105);
                int var157 = (var156 & 0x379BFF27) >> 28;
                int var158 = var156 & 0x3FFF;
                int var159 = class88.field1497.method1198(false);
                int var160 = (var156 & 0xFFFD5DF) >> 14;
                int var161 = var159 & 0x3;
                int var162 = var159 >> 2;
                int var163 = class222.field3655[var162];
                int var164 = class88.field1497.method1183(arg0 ^ 0x65);
                int var165 = var160 - class1.field9;
                if (var164 == 65535) {
                    var164 = -1;
                }
                int var166 = var158 - class1.field1;
                class204.method1429((byte) 70, var161, var165, var163, var166, var157, var162, var164);
                class296.field4837 = -1;
                return true;
            } else if (class296.field4837 == 193) {
                long var167 = class88.field1497.method1174(-10985);
                long var169 = (long) class88.field1497.method1161(true);
                long var171 = (long) class88.field1497.method1176(1048115912);
                int var173 = class88.field1497.method1178(8);
                long var174 = (var169 << 32) + var171;
                boolean var176 = false;
                int var177 = class88.field1497.method1161(true);
                int var178 = 0;
                label1230: while (true) {
                    if (var178 >= 100) {
                        if (var173 <= 1) {
                            for (int var179 = 0; var179 < class216.field3555; var179++) {
                                if (class282.field4682[var179] == var167) {
                                    var176 = true;
                                    break label1230;
                                }
                            }
                        }
                        break;
                    }
                    if (class244.field4024[var178] == var174) {
                        var176 = true;
                        break;
                    }
                    var178++;
                }
                if (!var176 && class100.field1717 == 0) {
                    class244.field4024[class190.field3087] = var174;
                    class190.field3087 = (class190.field3087 + 1) % 100;
                    class229 var180 = class224.method1560((byte) -61, var177).method1816(false, class88.field1497);
                    if (var173 == 2) {
                        class190.method1323(var177, (class229) null, 18, 18411, class248.method1746(arg0 + 8425, new class229[] { class59.field843, class100.method767((byte) 112, var167).method1628(arg0 + -135) }), var180);
                    } else if (var173 == 1) {
                        class190.method1323(var177, (class229) null, 18, arg0 + 18308, class248.method1746(arg0 ^ 0x2137, new class229[] { class271.field4537, class100.method767((byte) 12, var167).method1628(arg0 + -135) }), var180);
                    } else {
                        class190.method1323(var177, (class229) null, 18, arg0 + 18308, class100.method767((byte) 121, var167).method1628(-32), var180);
                    }
                }
                class296.field4837 = -1;
                return true;
            } else if (class296.field4837 == 90) {
                int var225 = class88.field1497.method1171(true);
                int var226 = class88.field1497.method1183(2);
                int var227 = class88.field1497.method1187((byte) -99);
                if (class152.method1104(var227, 4)) {
                    class235.method1666((byte) 78, var226, var225);
                }
                class296.field4837 = -1;
                return true;
            } else if (class296.field4837 == 206) {
                class7.method48(arg0 + 26932, class249.field4143, class88.field1497, class187.field3052);
                class296.field4837 = -1;
                return true;
            } else if (class296.field4837 == 131) {
                class10.field122 = class88.field1497.method1178(8);
                class198.field3295 = class129.field2125;
                class296.field4837 = -1;
                return true;
            } else if (class296.field4837 == 205) {
                int var181 = class88.field1497.method1166((byte) 109);
                class301 var182 = class206.method1440(var181, (byte) -68);
                for (int var183 = 0; var183 < var182.field4922.length; var183++) {
                    var182.field4922[var183] = -1;
                    var182.field4922[var183] = 0;
                }
                class296.method2006(var182, 120);
                class296.field4837 = -1;
                return true;
            } else if (class296.field4837 == 35) {
                class229 var184 = class88.field1497.method1190(0);
                if (var184.method1615(class306.field5130, false)) {
                    class229 var220 = var184.method1623(0, -30201, var184.method1611(class299.field4861, 24104));
                    long var221 = var220.method1634(false);
                    boolean var223 = false;
                    for (int var224 = 0; var224 < class216.field3555; var224++) {
                        if (class282.field4682[var224] == var221) {
                            var223 = true;
                            break;
                        }
                    }
                    if (!var223 && class100.field1717 == 0) {
                        class205.method1439(class4.field46, true, 4, var220);
                    }
                } else if (var184.method1615(class124.field2080, false)) {
                    class229 var185 = var184.method1623(0, -30201, var184.method1611(class299.field4861, 24104));
                    long var186 = var185.method1634(false);
                    boolean var188 = false;
                    for (int var189 = 0; var189 < class216.field3555; var189++) {
                        if (class282.field4682[var189] == var186) {
                            var188 = true;
                            break;
                        }
                    }
                    if (!var188 && class100.field1717 == 0) {
                        class229 var190 = var184.method1623(var184.method1611(class299.field4861, 24104) + 1, -30201, var184.method1642(-117) - 9);
                        class205.method1439(var190, true, 8, var185);
                    }
                } else if (var184.method1615(class279.field4616, false)) {
                    class229 var215 = var184.method1623(0, -30201, var184.method1611(class299.field4861, 24104));
                    long var216 = var215.method1634(false);
                    boolean var218 = false;
                    for (int var219 = 0; var219 < class216.field3555; var219++) {
                        if (class282.field4682[var219] == var216) {
                            var218 = true;
                            break;
                        }
                    }
                    if (!var218 && class100.field1717 == 0) {
                        class205.method1439(class134.field2172, true, 10, var215);
                    }
                } else if (var184.method1615(class108.field1855, false)) {
                    class229 var214 = var184.method1623(0, -30201, var184.method1611(class108.field1855, 24104));
                    class205.method1439(var214, true, 11, class134.field2172);
                } else if (var184.method1615(class276.field4601, false)) {
                    class229 var191 = var184.method1623(0, -30201, var184.method1611(class276.field4601, arg0 + 24001));
                    if (class100.field1717 == 0) {
                        class205.method1439(var191, true, 12, class134.field2172);
                    }
                } else if (var184.method1615(class313.field5274, false)) {
                    class229 var192 = var184.method1623(0, arg0 ^ 0xFFFF8A60, var184.method1611(class313.field5274, 24104));
                    if (class100.field1717 == 0) {
                        class205.method1439(var192, true, 13, class134.field2172);
                    }
                } else if (var184.method1615(class133.field2159, false)) {
                    class229 var209 = var184.method1623(0, arg0 - 30304, var184.method1611(class299.field4861, 24104));
                    long var210 = var209.method1634(false);
                    boolean var212 = false;
                    for (int var213 = 0; var213 < class216.field3555; var213++) {
                        if (class282.field4682[var213] == var210) {
                            var212 = true;
                            break;
                        }
                    }
                    if (!var212 && class100.field1717 == 0) {
                        class205.method1439(class134.field2172, true, 14, var209);
                    }
                } else if (var184.method1615(class27.field395, false)) {
                    class229 var204 = var184.method1623(0, -30201, var184.method1611(class299.field4861, 24104));
                    long var205 = var204.method1634(false);
                    boolean var207 = false;
                    for (int var208 = 0; var208 < class216.field3555; var208++) {
                        if (class282.field4682[var208] == var205) {
                            var207 = true;
                            break;
                        }
                    }
                    if (!var207 && class100.field1717 == 0) {
                        class205.method1439(class134.field2172, true, 15, var204);
                    }
                } else if (var184.method1615(class218.field3574, false)) {
                    class229 var193 = var184.method1623(0, -30201, var184.method1611(class299.field4861, 24104));
                    long var194 = var193.method1634(false);
                    boolean var196 = false;
                    for (int var197 = 0; var197 < class216.field3555; var197++) {
                        if (class282.field4682[var197] == var194) {
                            var196 = true;
                            break;
                        }
                    }
                    if (!var196 && class100.field1717 == 0) {
                        class205.method1439(class134.field2172, true, 16, var193);
                    }
                } else if (var184.method1615(class44.field675, false)) {
                    class229 var198 = var184.method1623(0, -30201, var184.method1611(class299.field4861, arg0 + 24001));
                    boolean var199 = false;
                    long var200 = var198.method1634(false);
                    for (int var202 = 0; var202 < class216.field3555; var202++) {
                        if (class282.field4682[var202] == var200) {
                            var199 = true;
                            break;
                        }
                    }
                    if (!var199 && class100.field1717 == 0) {
                        class229 var203 = var184.method1623(var184.method1611(class299.field4861, 24104) + 1, -30201, var184.method1642(-100) - 9);
                        class205.method1439(var203, true, 21, var198);
                    }
                } else {
                    class205.method1439(var184, true, 0, class134.field2172);
                }
                class296.field4837 = -1;
                return true;
            } else {
                class110.method834("T1 - " + class296.field4837 + "," + class134.field2187 + "," + class225.field3700 + " - " + class187.field3052, (Throwable) null, -1);
                class110.method836(false);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(B)V", line = 2620)
    public static void method994(byte arg0) {
        field2230 = null;
        if (arg0 == -22) {
            field2233 = null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lsi;B)V", line = 2646)
    public static final void method995(class66 arg0, byte arg1) {
        field2237++;
        class107.field1818 = arg0.method498(class175.field2883, -1);
        if (arg1 != 6) {
            method995((class66) null, (byte) -98);
        }
        class17.field242 = arg0.method498(class207.field3404, arg1 - 7);
        class5.field62 = arg0.method498(class30.field491, -1);
        class177.field2920 = arg0.method498(class177.field2928, -1);
        class255.field4255 = arg0.method498(class85.field1471, -1);
        class131.field2131 = arg0.method498(class208.field3425, arg1 - 7);
        class37.field601 = arg0.method498(class4.field40, arg1 - 7);
        class271.field4545 = arg0.method498(class211.field3495, -1);
        class154.field2512 = arg0.method498(class40.field650, -1);
        class6.field81 = arg0.method498(class263.field4399, -1);
        class266.field4483 = arg0.method498(class331.field5634, arg1 ^ 0xFFFFFFF9);
        class234.field3863 = arg0.method498(class240.field3974, -1);
        class216.field3552 = arg0.method498(class207.field3401, -1);
        class192.field3173 = arg0.method498(class139.field2260, -1);
        class268.field4495 = arg0.method498(class225.field3695, arg1 ^ 0xFFFFFFF9);
        class298.field4850 = arg0.method498(class281.field4650, -1);
        class273.field4563 = arg0.method498(class103.field1757, -1);
        class29.field479 = arg0.method498(class123.field2067, arg1 ^ 0xFFFFFFF9);
        class59.field837 = arg0.method498(class227.field3722, -1);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IZ)V", line = 2678)
    public static final void method996(int arg0, boolean arg1) {
        field2239++;
        for (int var2 = 0; var2 < class253.field4233; var2++) {
            class217 var3 = class187.field3035[class162.field2620[var2]];
            long var4 = (long) class162.field2620[var2] << 32 | 0x20000000L;
            if (var3 != null && var3.method1459(0) && var3.field3559.field5301 == arg1 && var3.field3559.method2128(arg0 + 93)) {
                int var6 = var3.field5168 >> 7;
                int var7 = var3.field5147 >> 7;
                if (var7 >= 0 && var7 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.method1457(0) == 1 && (var3.field5147 & 0x7F) == 64 && (var3.field5168 & 0x7F) == 64) {
                        if (class244.field4017[var7][var6] == class188.field3055) {
                            continue;
                        }
                        class244.field4017[var7][var6] = class188.field3055;
                    }
                    if (!var3.field3559.field5298) {
                        var4 |= Long.MIN_VALUE;
                    }
                    var3.field5133 = class259.method1801(var3.field5168, arg0 ^ 0x4F96, class298.field4849, var3.field5147);
                    class237.method1670(class298.field4849, var3.field5147, var3.field5168, var3.field5133, var3.method1457(0) * 64 - 4, var3, var3.field5122, var4, var3.field5169);
                }
            }
        }
        if (arg0 != -94) {
            field2235 = 110;
        }
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(IIII)V", line = 2765)
    public class138(int arg0, int arg1, int arg2, int arg3) {
        class70 var5 = class1.method3(false, arg0);
        this.field2234 = arg1;
        this.field2241 = arg3;
        this.field2229 = arg2;
        if (class99.field1675 || var5.field1147 == -1) {
            this.field2231 = var5;
        } else {
            this.field2231 = class1.method3(false, var5.field1147);
        }
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Lci;III)V", line = 2781)
    public class138(class70 arg0, int arg1, int arg2, int arg3) {
        this.field2231 = arg0;
        this.field2234 = arg1;
        this.field2241 = arg3;
        this.field2229 = arg2;
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(IZ)V", line = 2798)
    public static final void method997(int arg0, boolean arg1) {
        class281 var2 = class135.method957(0, arg0, 12);
        var2.method1933(0);
        field2232++;
        if (!arg1) {
            method994((byte) 15);
        }
    }
}
