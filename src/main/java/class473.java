import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class473 {

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "Lfe;")
    public static class384 field6838 = new class384(64);

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
    public static int field6839 = 0;

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "Liu;")
    public static class390 field6840 = new class390(29, 0);

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "F")
    public static float field6841 = 1024.0F;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
    public static int field6835;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public static int field6836;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
    public static int field6837;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "Leq;")
    public static class134 field6834;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(BILts;ILeq;)V", line = 7)
    public static final void method2767(byte arg0, int arg1, class356 arg2, int arg3, class134 arg4) {
        field6835++;
        class372 var5 = arg2.method2162(0, arg4);
        if (arg0 < 97) {
            method2767((byte) 123, 74, null, 46, null);
        }
        if (var5 == null) {
            return;
        }
        arg4.method810(arg3, arg1, arg2.field5168 + arg3, arg2.field5169 + arg1);
        if (class231.field3230 == 2 || class231.field3230 == 5 || class278.field3965 == null) {
            arg4.method771(-16777216, var5, arg3, arg1);
            return;
        }
        int var6;
        int var7;
        int var8;
        int var9;
        if (class306.field4454 == 4) {
            var6 = class52.field780;
            var7 = (int) (-class506.field7722) & 0x3FFF;
            var8 = 4096;
            var9 = class365.field5493;
        } else {
            var8 = 4096 - (class498.field7587 * 16);
            var7 = (int) (-class506.field7722) + class280.field4003 & 0x3FFF;
            var6 = class415.field6145.field2966;
            var9 = class415.field6145.field2959;
        }
        int var10 = (48 - -(var9 / 32)) + 208 - class362.field5442 * 2;
        int var11 = class203.field2813 * 4 + 208 + 48 - (class203.field2813 * 2) - (var6 / 32);
        class278.field3965.method1847((float) arg2.field5168 / 2.0F + (float) arg3, (float) arg2.field5169 / 2.0F + (float) arg1, (float) var10, (float) var11, var8, var7 << 2, var5, arg3, arg1);
        for (class304 var12 = (class304) class289.field4130.method2096(-21400); var12 != null; var12 = (class304) class289.field4130.method2084((byte) 19)) {
            int var54 = var12.field4412;
            int var55 = (class191.field2706.field4013[var54] >> 14 & 0x3FFF) - class455.field6637;
            int var56 = (class191.field2706.field4013[var54] & 0x3FFF) - class223.field3158;
            int var57 = var55 * 4 + 2 - (var9 / 32);
            int var58 = var56 * 4 + 2 - var6 / 32;
            class122.method695(false, var57, arg4, arg3, var5, arg2, var58, class191.field2706.field4016[var54], arg1);
        }
        for (int var13 = 0; var13 < class427.field6288; var13++) {
            int var51 = class160.field2083[var13] * 4 + 2 - (var9 / 32);
            int var52 = class411.field6034[var13] * 4 + 2 - (var6 / 32);
            class486 var53 = class114.field1471.method2132((byte) 122, class454.field6605[var13]);
            if (var53.field7043 != null) {
                var53 = var53.method2834(class453.field6591, false);
                if (var53 == null || var53.field7040 == -1) {
                    continue;
                }
            }
            class122.method695(false, var51, arg4, arg3, var5, arg2, var52, var53.field7040, arg1);
        }
        for (class414 var14 = (class414) field6838.method2316(4999); var14 != null; var14 = (class414) field6838.method2308((byte) 114)) {
            int var48 = (int) (var14.field1177 >> 28 & 0x3L);
            if (class270.field3778 == var48) {
                int var49 = (int) (var14.field1177 & 0x3FFFL) * 4 + 2 - var9 / 32;
                int var50 = (int) (var14.field1177 >> 14 & 0x3FFFL) * 4 + 2 - var6 / 32;
                class397.method2373(arg1, var49, var5, var50, class168.field2220[0], arg3, 256, arg2);
            }
        }
        for (int var15 = 0; var15 < class339.field4942; var15++) {
            class139 var44 = class504.field7697[class263.field3749[var15]];
            if (var44 != null && var44.method884(false) && class415.field6145.field2956 == var44.field2956) {
                class272 var45 = var44.field1825;
                if (var45 != null && var45.field3797 != null) {
                    var45 = var45.method1656(class453.field6591, -58);
                }
                if (var45 != null && var45.field3834 && var45.field3788) {
                    int var46 = var44.field2959 / 32 - (var9 / 32);
                    int var47 = var44.field2966 / 32 - var6 / 32;
                    if (var45.field3812 == -1) {
                        class397.method2373(arg1, var46, var5, var47, class168.field2220[1], arg3, 256, arg2);
                    } else {
                        class122.method695(false, var46, arg4, arg3, var5, arg2, var47, var45.field3812, arg1);
                    }
                }
            }
        }
        int var16 = class276.field3953;
        int[] var17 = class330.field4790;
        for (int var18 = 0; var18 < var16; var18++) {
            class313 var36 = class262.field3742[var17[var18]];
            if (var36 != null && var36.method1883(false) && class415.field6145 != var36 && class415.field6145.field2956 == var36.field2956) {
                int var37 = var36.field2959 / 32 - (var9 / 32);
                int var38 = var36.field2966 / 32 - var6 / 32;
                boolean var39 = false;
                for (int var40 = 0; var40 < class296.field4317; var40++) {
                    if (var36.field4592.equals(class281.field4019[var40]) && class285.field4076[var40] != 0) {
                        var39 = true;
                        break;
                    }
                }
                boolean var41 = false;
                for (int var42 = 0; var42 < class437.field6402; var42++) {
                    if (var36.field4592.equals(class216.field3033[var42].field1793)) {
                        var41 = true;
                        break;
                    }
                }
                boolean var43 = false;
                if (class415.field6145.field4594 != 0 && var36.field4594 != 0 && class415.field6145.field4594 == var36.field4594) {
                    var43 = true;
                }
                if (var36.field4557) {
                    class397.method2373(arg1, var37, var5, var38, class168.field2220[6], arg3, 256, arg2);
                } else if (var39) {
                    class397.method2373(arg1, var37, var5, var38, class168.field2220[3], arg3, 256, arg2);
                } else if (var41) {
                    class397.method2373(arg1, var37, var5, var38, class168.field2220[5], arg3, 256, arg2);
                } else if (var43) {
                    class397.method2373(arg1, var37, var5, var38, class168.field2220[4], arg3, 256, arg2);
                } else {
                    class397.method2373(arg1, var37, var5, var38, class168.field2220[2], arg3, 256, arg2);
                }
            }
        }
        class434[] var19 = class254.field3662;
        for (int var20 = 0; var20 < var19.length; var20++) {
            class434 var23 = var19[var20];
            if (var23 != null && var23.field6358 != 0 && (class263.field3748 % 20) < 10) {
                if (var23.field6358 == 1 && var23.field6357 >= 0 && class504.field7697.length > var23.field6357) {
                    class139 var24 = class504.field7697[var23.field6357];
                    if (var24 != null) {
                        int var25 = var24.field2959 / 32 - var9 / 32;
                        int var26 = var24.field2966 / 32 - (var6 / 32);
                        class406.method2435(118, arg1, arg2, var25, 360000L, var26, arg3, var5, var23.field6364);
                    }
                }
                if (var23.field6358 == 2) {
                    int var27 = var23.field6360 / 32 - (var9 / 32);
                    int var28 = var23.field6362 / 32 - (var6 / 32);
                    long var29 = (long) (var23.field6363 << 5);
                    long var31 = var29 * var29;
                    class406.method2435(104, arg1, arg2, var27, var31, var28, arg3, var5, var23.field6364);
                }
                if (var23.field6358 == 10 && var23.field6357 >= 0 && var23.field6357 < class262.field3742.length) {
                    class313 var33 = class262.field3742[var23.field6357];
                    if (var33 != null) {
                        int var34 = var33.field2959 / 32 - (var9 / 32);
                        int var35 = var33.field2966 / 32 - (var6 / 32);
                        class406.method2435(93, arg1, arg2, var34, 360000L, var35, arg3, var5, var23.field6364);
                    }
                }
            }
        }
        if (class306.field4454 == 4) {
            return;
        }
        if (class495.field7547 != 0) {
            int var21 = class495.field7547 * 4 + (2 - -((class415.field6145.method1773(-122) + -1) * 2)) - (var9 / 32);
            int var22 = (class2.field33 * 4 + class415.field6145.method1773(-124) * 2 - 2) + 2 - (var6 / 32);
            class397.method2373(arg1, var21, var5, var22, class77.field1090[class358.field5314 ? 1 : 0], arg3, 256, arg2);
        }
        arg4.method801(-6625, 3, arg2.field5169 / 2 + arg1 - 1, -1, arg2.field5168 / 2 + arg3 - 1, 3);
        return;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)V", line = 305)
    public static final void method2768(int arg0, int arg1) {
        class33.field540 = -1;
        class440.field6432 = arg1;
        class135.field1729 = 100;
        field6837++;
        class440.field6424 = arg0;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IILhn;BI)V", line = 318)
    public static final void method2769(int arg0, int arg1, class486 arg2, byte arg3, int arg4) {
        field6836++;
        if (arg3 != -57) {
            return;
        }
        for (class173 var5 = (class173) class173.field2360.method2096(arg3 ^ 0x53AF); var5 != null; var5 = (class173) class173.field2360.method2084((byte) 19)) {
            if (var5.field2353 == arg0 && (arg4 << 7) == var5.field2362 && arg1 << 7 == var5.field2364 && var5.field2358.field7046 == arg2.field7046) {
                if (var5.field2366 != null) {
                    class375.field5607.method643(var5.field2366);
                    var5.field2366 = null;
                }
                if (var5.field2361 != null) {
                    class375.field5607.method643(var5.field2361);
                    var5.field2361 = null;
                }
                var5.method536(false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V", line = 362)
    public static void method2770(byte arg0) {
        field6834 = null;
        field6840 = null;
        if (arg0 < 66) {
            method2768(-54, -61);
        }
        field6838 = null;
    }
}
