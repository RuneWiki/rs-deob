import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class221 extends class182 {

    @OriginalMember(owner = "client!ub", name = "N", descriptor = "Lqb;")
    public class177 field3983;

    @OriginalMember(owner = "client!ub", name = "K", descriptor = "I")
    public static int field3981 = 0;

    @OriginalMember(owner = "client!ub", name = "W", descriptor = "Lkh;")
    public static class117 field3992 = class224.method1450((byte) 126, "<img=1>");

    @OriginalMember(owner = "client!ub", name = "X", descriptor = "Lkh;")
    private static class117 field3993 = class224.method1450((byte) -3, "World");

    @OriginalMember(owner = "client!ub", name = "S", descriptor = "Lkh;")
    public static class117 field3988 = field3993;

    @OriginalMember(owner = "client!ub", name = "T", descriptor = "Lkh;")
    public static class117 field3989 = class224.method1450((byte) 117, ")1 ");

    @OriginalMember(owner = "client!ub", name = "I", descriptor = "Lkh;")
    public static class117 field3980 = class224.method1450((byte) -52, "Konfig geladen)3");

    @OriginalMember(owner = "client!ub", name = "Z", descriptor = "Lkh;")
    public static class117 field3995 = class224.method1450((byte) 112, "Ihr Charakter)2Profil wird in:");

    @OriginalMember(owner = "client!ub", name = "Y", descriptor = "Lkh;")
    public static class117 field3994 = field3993;

    @OriginalMember(owner = "client!ub", name = "M", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!ub", name = "O", descriptor = "I")
    public static int field3984;

    @OriginalMember(owner = "client!ub", name = "P", descriptor = "I")
    public static int field3985;

    @OriginalMember(owner = "client!ub", name = "Q", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!ub", name = "R", descriptor = "I")
    public static int field3987;

    @OriginalMember(owner = "client!ub", name = "U", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!ub", name = "ab", descriptor = "I")
    public static int field3996;

    @OriginalMember(owner = "client!ub", name = "bb", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!ub", name = "V", descriptor = "J")
    public static long field3991;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(BI)I")
    public static final int method1434(byte arg0, int arg1) {
        if (arg0 >= -17) {
            return 21;
        }
        int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
        int var3 = arg1 * 6 - 61440;
        field3987++;
        int var4 = (arg1 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)Z")
    public static final boolean method1435(int arg0) throws IOException {
        field3997++;
        if (class207.field3717 == null) {
            return false;
        }
        int var1 = class207.field3717.method751(10364);
        if (var1 == 0) {
            return false;
        }
        if (class195.field3487 == arg0) {
            class207.field3717.method753(1, 0, -1, class18.field511.field2613);
            var1--;
            class18.field511.field2643 = 0;
            class195.field3487 = class18.field511.method404(255);
            class30.field722 = class27.field672[class195.field3487];
        }
        if (class30.field722 == -1) {
            if (var1 <= 0) {
                return false;
            }
            var1--;
            class207.field3717.method753(1, 0, -1, class18.field511.field2613);
            class30.field722 = class18.field511.field2613[0] & 0xFF;
        }
        if (class30.field722 == -2) {
            if (var1 <= 1) {
                return false;
            }
            var1 -= 2;
            class207.field3717.method753(2, 0, arg0, class18.field511.field2613);
            class18.field511.field2643 = 0;
            class30.field722 = class18.field511.method1049((byte) 100);
        }
        if (class30.field722 > var1) {
            return false;
        }
        class18.field511.field2643 = 0;
        class207.field3717.method753(class30.field722, 0, -1, class18.field511.field2613);
        class8.field131 = class56.field1161;
        class56.field1161 = class181.field3277;
        class44.field964 = 0;
        class181.field3277 = class195.field3487;
        if (class195.field3487 == 186) {
            int var2 = class18.field511.method1018(arg0 ^ 0x3FAF470F);
            int var3 = class18.field511.method1049((byte) 120);
            class9 var4;
            if (var2 >= 0) {
                var4 = class119.method837((byte) 97, var2);
            } else {
                var4 = null;
            }
            if (var4 != null) {
                for (int var5 = 0; var5 < var4.field224.length; var5++) {
                    var4.field224[var5] = 0;
                    var4.field189[var5] = 0;
                }
            }
            if (var2 < -70000) {
                var3 += 32768;
            }
            class230.method1488(var3, -6);
            int var6 = class18.field511.method1049((byte) 98);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = class18.field511.method1004(arg0 ^ 0xFFFFFF00);
                int var9 = class18.field511.method1033(-128);
                if (var9 == 255) {
                    var9 = class18.field511.method1008(-97);
                }
                if (var4 != null && var4.field224.length > var7) {
                    var4.field224[var7] = var8;
                    var4.field189[var7] = var9;
                }
                class172.method1205(arg0 + 88, var8 + -1, var7, var3, var9);
            }
            if (var4 != null) {
                class62.method457(var4, ~arg0);
            }
            class86.method599((byte) 92);
            class172.field3113[class209.method1370(class20.field555++, 31)] = class209.method1370(var3, 32767);
            class195.field3487 = -1;
            return true;
        } else if (class195.field3487 == 86) {
            int var10 = class18.field511.method998(arg0 + 74);
            int var11 = class18.field511.method988(arg0 ^ 0xFFFFFF83);
            if (var10 == 1) {
                class28.method239();
                for (int var12 = 0; var12 < 4; var12++) {
                    class173.field3123[var12].method17(-1);
                }
                System.gc();
            } else if (var10 == 2) {
                class53.method405((byte) -64);
                System.gc();
                class94.method647(25, (byte) -118);
            }
            class92.field1697 = var11;
            class102.method688(var11, (byte) 100);
            class71.method504(false, 24744);
            class145.method1025(false, class92.field1697);
            for (int var13 = 0; var13 < 100; var13++) {
                class173.field3126[var13] = true;
            }
            class195.field3487 = -1;
            return true;
        } else if (class195.field3487 == 240) {
            class212.method1393(arg0 ^ 0xFFFFFFFD);
            class195.field3487 = -1;
            return false;
        } else if (class195.field3487 == 197) {
            class76.field1456 = (short) class18.field511.method988(112);
            if (class76.field1456 <= 0) {
                class76.field1456 = 320;
            }
            class186.field3329 = (short) class18.field511.method1004(255);
            if (class186.field3329 <= 0) {
                class186.field3329 = 256;
            }
            class195.field3487 = -1;
            return true;
        } else if (class195.field3487 == 244) {
            int var14 = class18.field511.method995((byte) -115);
            int var15 = class18.field511.method1037(101);
            int var16 = class18.field511.method1034((byte) -84);
            class9 var17 = class119.method837((byte) 121, var14);
            var17.field283 = var17.field258 = var15;
            var17.field227 = var17.field163 = var16;
            var17.field248 = 0;
            var17.field276 = 0;
            class62.method457(var17, arg0 + 1);
            class195.field3487 = -1;
            return true;
        } else if (class195.field3487 == 66) {
            byte[] var18 = new byte[class30.field722];
            class18.field511.method403((byte) 66, var18, 0, class30.field722);
            class176.method1227(class111.method749(class30.field722, 30000, 0, var18), -74);
            class195.field3487 = -1;
            return true;
        } else if (class195.field3487 == 204) {
            class86.method599((byte) 102);
            int var19 = class18.field511.method1042(true);
            int var20 = class18.field511.method1045((byte) 63);
            int var21 = class18.field511.method1026(false);
            class177.field3188[var19] = var21;
            class196.field3523[var19] = var20;
            class115.field2142[var19] = 1;
            for (int var22 = 0; var22 < 98; var22++) {
                if (class180.field3259[var22] <= var21) {
                    class115.field2142[var19] = var22 + 2;
                }
            }
            class195.field3489[class209.method1370(31, class40.field916++)] = var19;
            class195.field3487 = -1;
            return true;
        } else if (class195.field3487 == 54) {
            class86.method599((byte) 119);
            class61.field1236 = class18.field511.method1035(arg0 ^ 0x6F);
            class195.field3487 = -1;
            class50.field1038 = class194.field3470;
            return true;
        } else if (class195.field3487 == 21) {
            class122.method853(true, -1);
            class195.field3487 = -1;
            return true;
        } else if (class195.field3487 == 242) {
            int var23 = class18.field511.method1018(-1068451600);
            class73 var24 = (class73) class11.field371.method460((long) var23, 1);
            if (var24 != null) {
                class101.method682(arg0 ^ 0xFFFF9250, var24, true);
            }
            if (class191.field3407 != null) {
                class62.method457(class191.field3407, 0);
                class191.field3407 = null;
            }
            class195.field3487 = -1;
            return true;
        } else if (class195.field3487 == 114) {
            int var25 = class18.field511.method998(57);
            int var26 = class18.field511.method1033(-128);
            int var27 = class18.field511.method1042(true);
            class203.field3675 = var25 >> 1;
            class93.field1712.method1513(var26, var27, -26447, (var25 & 0x1) == 1);
            class195.field3487 = -1;
            return true;
        } else if (class195.field3487 == 25) {
            int var28 = class18.field511.method1018(-1068451600);
            int var29 = class18.field511.method1049((byte) 119);
            int var30 = class18.field511.method998(arg0 ^ 0xFFFFFF97);
            class73 var31 = (class73) class11.field371.method460((long) var28, 1);
            if (var31 != null) {
                class101.method682(28079, var31, var31.field1397 != var29);
            }
            class177.method1235(var30, var29, var28, (byte) 71);
            class195.field3487 = -1;
            return true;
        } else if (class195.field3487 == 184) {
            class10.field357 = class18.field511.method1019((byte) -128) * 30;
            class50.field1038 = class194.field3470;
            class195.field3487 = -1;
            return true;
        } else if (class195.field3487 == 249) {
            int var32 = class18.field511.method988(92);
            int var33 = class18.field511.method1018(-1068451600);
            int var34 = var32 >> 10 & 0x1F;
            int var35 = var32 >> 5 & 0x1F;
            int var36 = var32 & 0x1F;
            class9 var37 = class119.method837((byte) 126, var33);
            int var38 = (var35 << 11) + ((var34 << 19) + (var36 << 3));
            if (var37.field149 != var38) {
                var37.field149 = var38;
                class62.method457(var37, 0);
            }
            class195.field3487 = -1;
            return true;
        } else if (class195.field3487 == 53) {
            class117 var39 = class18.field511.method1038(25);
            Object[] var40 = new Object[var39.method819((byte) -126) + 1];
            for (int var41 = var39.method819((byte) -111) - 1; var41 >= 0; var41--) {
                if (var39.method777(true, var41) == 115) {
                    var40[var41 + 1] = class18.field511.method1038(arg0 + 60);
                } else {
                    var40[var41 + 1] = Integer.valueOf(class18.field511.method1018(-1068451600));
                }
            }
            var40[0] = Integer.valueOf(class18.field511.method1018(class228.method1474(arg0, 1068451599)));
            class51 var42 = new class51();
            var42.field1048 = var40;
            class102.method689(var42, -49);
            class195.field3487 = -1;
            return true;
        } else if (class195.field3487 == 239) {
            int var43 = class18.field511.method1018(-1068451600);
            int var44 = class18.field511.method1018(-1068451600);
            class73 var45 = (class73) class11.field371.method460((long) var43, 1);
            class73 var46 = (class73) class11.field371.method460((long) var44, 1);
            if (var46 != null) {
                class101.method682(28079, var46, var45 == null || var45.field1397 != var46.field1397);
            }
            if (var45 != null) {
                var45.method123((byte) -126);
                class11.field371.method461((long) var44, (byte) -48, var45);
            }
            class9 var47 = class119.method837((byte) 116, var43);
            if (var47 != null) {
                class62.method457(var47, 0);
            }
            class9 var48 = class119.method837((byte) 112, var44);
            if (var48 != null) {
                class62.method457(var48, 0);
                class201.method1338((byte) -87, true, var48);
            }
            if (class92.field1697 != -1) {
                class158.method1122(class92.field1697, arg0 + 1, 1);
            }
            class195.field3487 = -1;
            return true;
        } else if (class195.field3487 == 200) {
            int var49 = class18.field511.method1026(false);
            class9 var50 = class119.method837((byte) 124, var49);
            for (int var51 = 0; var51 < var50.field224.length; var51++) {
                var50.field224[var51] = -1;
                var50.field224[var51] = 0;
            }
            class62.method457(var50, arg0 + 1);
            class195.field3487 = -1;
            return true;
        } else if (class195.field3487 == 248) {
            for (int var52 = 0; var52 < class43.field950.length; var52++) {
                if (class43.field950[var52] != null) {
                    class43.field950[var52].field4213 = -1;
                }
            }
            for (int var53 = 0; var53 < class1.field18.length; var53++) {
                if (class1.field18[var53] != null) {
                    class1.field18[var53].field4213 = -1;
                }
            }
            class195.field3487 = -1;
            return true;
        } else if (class195.field3487 == 77) {
            int var54 = class18.field511.method1026(false);
            int var55 = class18.field511.method988(119);
            int var56 = class18.field511.method1049((byte) 127);
            int var57 = class18.field511.method1049((byte) 118);
            if (var54 >> 30 != 0) {
                int var58 = var54 >> 28 & 0x3;
                int var59 = (var54 & 0x3FFF) - class184.field3319;
                int var60 = (var54 >> 14 & 0x3FFF) - class143.field2591;
                if (var60 >= 0 && var59 >= 0 && var60 < 104 && var59 < 104) {
                    int var61 = var59 * 128 + 64;
                    int var62 = var60 * 128 + 64;
                    class177 var63 = new class177(var55, var58, var62, var61, class186.method1265(true, var61, var58, var62) - var57, var56, class44.field966);
                    class119.field2257.method325(arg0 + 121, new class221(var63));
                }
            } else if (var54 >> 29 != 0) {
                int var66 = var54 & 0xFFFF;
                class207 var67 = class1.field18[var66];
                if (var67 != null) {
                    var67.field4253 = var57;
                    var67.field4248 = 0;
                    var67.field4222 = class44.field966 + var56;
                    var67.field4209 = 0;
                    var67.field4233 = var55;
                    if (var67.field4233 == 65535) {
                        var67.field4233 = -1;
                    }
                    if (var67.field4222 > class44.field966) {
                        var67.field4209 = -1;
                    }
                }
            } else if (var54 >> 28 != 0) {
                int var64 = var54 & 0xFFFF;
                class56 var65;
                if (class72.field1387 == var64) {
                    var65 = class93.field1712;
                } else {
                    var65 = class43.field950[var64];
                }
                if (var65 != null) {
                    var65.field4222 = class44.field966 + var56;
                    var65.field4253 = var57;
                    var65.field4209 = 0;
                    if (class44.field966 < var65.field4222) {
                        var65.field4209 = -1;
                    }
                    var65.field4248 = 0;
                    var65.field4233 = var55;
                    if (var65.field4233 == 65535) {
                        var65.field4233 = -1;
                    }
                }
            }
            class195.field3487 = -1;
            return true;
        } else if (class195.field3487 == 191) {
            boolean var68 = class18.field511.method1042(true) == 1;
            int var69 = class18.field511.method1026(false);
            class9 var70 = class119.method837((byte) 102, var69);
            if (var70.field290 != var68) {
                var70.field290 = var68;
                class62.method457(var70, 0);
            }
            class195.field3487 = -1;
            return true;
        } else if (class195.field3487 == 134) {
            class203.field3680 = class18.field511.method1045((byte) 122);
            class217.field3949 = class18.field511.method998(122);
            while (class18.field511.field2643 < class30.field722) {
                class195.field3487 = class18.field511.method998(122);
                class32.method280(true);
            }
            class195.field3487 = -1;
            return true;
        } else if (class195.field3487 == 253) {
            class162.field2967 = false;
            for (int var71 = 0; var71 < 5; var71++) {
                class243.field4405[var71] = false;
            }
            class195.field3487 = -1;
            return true;
        } else if (class195.field3487 == 19) {
            class233.method1507(-20765);
            class195.field3487 = -1;
            return true;
        } else if (class195.field3487 == 129) {
            long var72 = class18.field511.method1012((byte) -85);
            class18.field511.method994((byte) 73);
            long var74 = class18.field511.method1012((byte) -85);
            long var76 = (long) class18.field511.method1049((byte) 97);
            long var78 = (long) class18.field511.method1023(arg0 - 1002743);
            int var80 = class18.field511.method998(arg0 ^ 0xFFFFFF85);
            boolean var81 = false;
            int var82 = class18.field511.method1049((byte) 120);
            long var83 = (var76 << 32) + var78;
            int var85 = 0;
            label1152: while (true) {
                if (var85 >= 100) {
                    if (var80 <= 1) {
                        for (int var86 = 0; var86 < class85.field1613; var86++) {
                            if (class158.field2873[var86] == var72) {
                                var81 = true;
                                break label1152;
                            }
                        }
                    }
                    break;
                }
                if (class209.field3759[var85] == var83) {
                    var81 = true;
                    break;
                }
                var85++;
            }
            if (!var81 && class160.field2926 == 0) {
                class209.field3759[class166.field3005] = var83;
                class166.field3005 = (class166.field3005 + 1) % 100;
                class117 var87 = class172.method1204((byte) -123, var82).method1119(class18.field511, false);
                if (var80 == 2 || var80 == 3) {
                    class151.method1078(var82, (byte) 119, 20, class36.method316((byte) -34, new class117[] { class13.field416, class162.method1156(var72, (byte) -76).method796((byte) -40) }), class162.method1156(var74, (byte) 112).method796((byte) -40), var87);
                } else if (var80 == 1) {
                    class151.method1078(var82, (byte) 119, 20, class36.method316((byte) -34, new class117[] { class103.field1888, class162.method1156(var72, (byte) 107).method796((byte) -40) }), class162.method1156(var74, (byte) -3).method796((byte) -40), var87);
                } else {
                    class151.method1078(var82, (byte) 119, 20, class162.method1156(var72, (byte) -61).method796((byte) -40), class162.method1156(var74, (byte) 126).method796((byte) -40), var87);
                }
            }
            class195.field3487 = -1;
            return true;
        } else if (class195.field3487 == 72) {
            int var88 = class18.field511.method1004(255);
            int var89 = class18.field511.method1008(-68);
            class112.field2106[var88] = var89;
            if (class141.field2561[var88] != var89) {
                class141.field2561[var88] = var89;
                class216.method1421(var88, 96);
            }
            class54.field1112[class209.method1370(31, class185.field3323++)] = var88;
            class195.field3487 = -1;
            return true;
        } else if (class195.field3487 == 113) {
            int var90 = class18.field511.method1049((byte) 111);
            if (var90 == 65535) {
                var90 = -1;
            }
            int var91 = class18.field511.method998(108);
            int var92 = class18.field511.method1049((byte) 97);
            class73.method515(var90, var91, -126, var92);
            class195.field3487 = -1;
            return true;
        } else if (class195.field3487 == 12) {
            int var93 = class30.field722 + class18.field511.field2643;
            int var94 = class18.field511.method1049((byte) 95);
            int var95 = class18.field511.method1049((byte) 113);
            if (class92.field1697 != var94) {
                class92.field1697 = var94;
                class102.method688(class92.field1697, (byte) 117);
                class71.method504(false, arg0 + 24745);
                class145.method1025(false, class92.field1697);
                for (int var96 = 0; var96 < 100; var96++) {
                    class173.field3126[var96] = true;
                }
            }
            while (var95-- > 0) {
                int var105 = class18.field511.method1018(-1068451600);
                int var106 = class18.field511.method1049((byte) 92);
                int var107 = class18.field511.method998(58);
                class73 var108 = (class73) class11.field371.method460((long) var105, 1);
                if (var108 != null && var108.field1397 != var106) {
                    class101.method682(28079, var108, true);
                    var108 = null;
                }
                if (var108 == null) {
                    var108 = class177.method1235(var107, var106, var105, (byte) 71);
                }
                var108.field1391 = true;
            }
            for (class73 var97 = (class73) class11.field371.method456((byte) 126); var97 != null; var97 = (class73) class11.field371.method459((byte) -87)) {
                if (var97.field1391) {
                    var97.field1391 = false;
                } else {
                    class101.method682(arg0 ^ 0xFFFF9250, var97, true);
                }
            }
            class184.field3306 = new class62(512);
            while (var93 > class18.field511.field2643) {
                int var98 = class18.field511.method1018(arg0 ^ 0x3FAF470F);
                int var99 = class18.field511.method1049((byte) 111);
                int var100 = class18.field511.method1049((byte) 91);
                int var101 = class18.field511.method1018(-1068451600);
                for (int var102 = var99; var102 <= var100; var102++) {
                    long var103 = ((long) var98 << 32) + ((long) var102);
                    class184.field3306.method461(var103, (byte) -103, new class123(var101));
                }
            }
            class195.field3487 = -1;
            return true;
        } else if (class195.field3487 == 22) {
            class145.method1036(-128, class18.field511);
            class195.field3487 = -1;
            return true;
        } else if (class195.field3487 == 229) {
            class117.field2172 = class194.field3470;
            long var109 = class18.field511.method1012((byte) -85);
            if (var109 == 0L) {
                class37.field856 = null;
                class195.field3487 = -1;
                class211.field3840 = 0;
                class39.field898 = null;
                class231.field4157 = null;
                return true;
            }
            long var111 = class18.field511.method1012((byte) -85);
            class231.field4157 = class162.method1156(var111, (byte) -75);
            class37.field856 = class162.method1156(var109, (byte) 11);
            class210.field3764 = class18.field511.method994((byte) 85);
            int var113 = class18.field511.method998(125);
            if (var113 == 255) {
                class195.field3487 = -1;
                return true;
            }
            class211.field3840 = var113;
            class218[] var114 = new class218[100];
            for (int var115 = 0; var115 < class211.field3840; var115++) {
                var114[var115] = new class218();
                var114[var115].field389 = class18.field511.method1012((byte) -85);
                var114[var115].field3960 = class162.method1156(var114[var115].field389, (byte) -53);
                var114[var115].field3969 = class18.field511.method1049((byte) 89);
                var114[var115].field3968 = class18.field511.method994((byte) 91);
                var114[var115].field3958 = class18.field511.method1038(arg0 ^ 0xFFFFFFE3);
                if (field3991 == var114[var115].field389) {
                    class130.field2393 = var114[var115].field3968;
                }
            }
            int var116 = class211.field3840;
            boolean var117 = false;
            while (var116 > 0) {
                boolean var118 = true;
                var116--;
                for (int var119 = 0; var119 < var116; var119++) {
                    if (var114[var119].field3960.method805(false, var114[var119 + 1].field3960) > 0) {
                        var118 = false;
                        class218 var120 = var114[var119];
                        var114[var119] = var114[var119 + 1];
                        var114[var119 + 1] = var120;
                    }
                }
                if (var118) {
                    break;
                }
            }
            class195.field3487 = -1;
            class39.field898 = var114;
            return true;
        } else if (class195.field3487 == 203) {
            long var121 = class18.field511.method1012((byte) -85);
            long var123 = (long) class18.field511.method1049((byte) 94);
            long var125 = (long) class18.field511.method1023(-1002744);
            int var127 = class18.field511.method998(125);
            int var128 = class18.field511.method1049((byte) 108);
            long var129 = (var123 << 32) + var125;
            boolean var131 = false;
            int var132 = 0;
            label1216: while (true) {
                if (var132 >= 100) {
                    if (var127 <= 1) {
                        for (int var133 = 0; var133 < class85.field1613; var133++) {
                            if (class158.field2873[var133] == var121) {
                                var131 = true;
                                break label1216;
                            }
                        }
                    }
                    break;
                }
                if (class209.field3759[var132] == var129) {
                    var131 = true;
                    break;
                }
                var132++;
            }
            if (!var131 && class160.field2926 == 0) {
                class209.field3759[class166.field3005] = var129;
                class166.field3005 = (class166.field3005 + 1) % 100;
                class117 var134 = class172.method1204((byte) -96, var128).method1119(class18.field511, false);
                if (var127 == 2) {
                    class151.method1078(var128, (byte) 119, 18, class36.method316((byte) -34, new class117[] { class13.field416, class162.method1156(var121, (byte) -70).method796((byte) -40) }), null, var134);
                } else if (var127 == 1) {
                    class151.method1078(var128, (byte) 119, 18, class36.method316((byte) -34, new class117[] { class103.field1888, class162.method1156(var121, (byte) -93).method796((byte) -40) }), null, var134);
                } else {
                    class151.method1078(var128, (byte) 119, 18, class162.method1156(var121, (byte) 104).method796((byte) -40), null, var134);
                }
            }
            class195.field3487 = -1;
            return true;
        } else if (class195.field3487 == 172) {
            long var135 = class18.field511.method1012((byte) -85);
            class117 var137 = class138.method925(class8.method59((byte) -116, class18.field511).method811(arg0 - 14442));
            class14.method129(class162.method1156(var135, (byte) -54).method796((byte) -40), var137, 0, 6);
            class195.field3487 = -1;
            return true;
        } else if (class195.field3487 == 65) {
            class108.field2003 = (short) class18.field511.method1049((byte) 118);
            if (class108.field2003 <= 0) {
                class108.field2003 = 32767;
            } else if (class108.field2003 < class37.field858) {
                class108.field2003 = class37.field858;
            }
            class199.field3605 = (short) class18.field511.method1019((byte) -100);
            if (class199.field3605 <= 0) {
                class199.field3605 = 1;
            }
            class210.field3765 = (short) class18.field511.method1019((byte) 123);
            if (class210.field3765 <= 0) {
                class210.field3765 = 32767;
            } else if (class199.field3605 > class210.field3765) {
                class210.field3765 = class199.field3605;
            }
            class37.field858 = (short) class18.field511.method988(80);
            if (class37.field858 <= 0) {
                class37.field858 = 1;
            }
            class195.field3487 = -1;
            return true;
        } else if (class195.field3487 == 110) {
            class166.method1178(arg0 ^ 0x63E7, class130.field2397, class18.field511, class30.field722);
            class195.field3487 = -1;
            return true;
        } else if (class195.field3487 == 17) {
            int var138 = class18.field511.method1018(-1068451600);
            int var139 = class18.field511.method1049((byte) 104);
            class9 var140;
            if (var138 >= 0) {
                var140 = class119.method837((byte) 100, var138);
            } else {
                var140 = null;
            }
            if (var138 < -70000) {
                var139 += 32768;
            }
            while (class18.field511.field2643 < class30.field722) {
                int var141 = class18.field511.method1003(-52);
                int var142 = class18.field511.method1049((byte) 99);
                int var143 = 0;
                if (var142 != 0) {
                    var143 = class18.field511.method998(arg0 ^ 0xFFFFFF91);
                    if (var143 == 255) {
                        var143 = class18.field511.method1018(arg0 ^ 0x3FAF470F);
                    }
                }
                if (var140 != null && var141 >= 0 && var141 < var140.field224.length) {
                    var140.field224[var141] = var142;
                    var140.field189[var141] = var143;
                }
                class172.method1205(89, var142 - 1, var141, var139, var143);
            }
            if (var140 != null) {
                class62.method457(var140, 0);
            }
            class86.method599((byte) 100);
            class172.field3113[class209.method1370(31, class20.field555++)] = class209.method1370(32767, var139);
            class195.field3487 = -1;
            return true;
        } else if (class195.field3487 == 88) {
            class217.field3949 = class18.field511.method1045((byte) 51);
            class203.field3680 = class18.field511.method1042(true);
            for (int var144 = class217.field3949; var144 < class217.field3949 + 8; var144++) {
                for (int var146 = class203.field3680; var146 < class203.field3680 + 8; var146++) {
                    if (class143.field2597[class203.field3675][var144][var146] != null) {
                        class143.field2597[class203.field3675][var144][var146] = null;
                        class139.method948(var146, (byte) 121, var144);
                    }
                }
            }
            for (class159 var145 = (class159) class145.field2606.method314((byte) -26); var145 != null; var145 = (class159) class145.field2606.method320(0)) {
                if (class217.field3949 <= var145.field2900 && class217.field3949 + 8 > var145.field2900 && var145.field2893 >= class203.field3680 && var145.field2893 < class203.field3680 + 8 && class203.field3675 == var145.field2902) {
                    var145.field2896 = 0;
                }
            }
            class195.field3487 = -1;
            return true;
        } else if (class195.field3487 == 223) {
            class162.field2967 = true;
            class82.field1554 = class18.field511.method998(91);
            class53.field1103 = class18.field511.method998(arg0 + 111);
            class234.field4218 = class18.field511.method1049((byte) 99);
            class211.field3794 = class18.field511.method998(122);
            class18.field530 = class18.field511.method998(86);
            if (class18.field530 >= 100) {
                int var147 = class82.field1554 * 128 + 64;
                int var148 = class53.field1103 * 128 + 64;
                int var149 = class186.method1265(true, var148, class203.field3675, var147) - class234.field4218;
                int var150 = var147 - class19.field535;
                int var151 = var148 - class186.field3339;
                int var152 = var149 - class31.field732;
                int var153 = (int) Math.sqrt((double) (var150 * var150 + var151 * var151));
                class150.field2726 = (int) (Math.atan2((double) var152, (double) var153) * 325.949D) & 0x7FF;
                class86.field1626 = (int) (-325.949D * Math.atan2((double) var150, (double) var151)) & 0x7FF;
                if (class150.field2726 < 128) {
                    class150.field2726 = 128;
                }
                if (class150.field2726 > 383) {
                    class150.field2726 = 383;
                }
            }
            class195.field3487 = -1;
            return true;
        } else if (class195.field3487 == 163) {
            class217.field3949 = class18.field511.method998(98);
            class203.field3680 = class18.field511.method1045((byte) 107);
            class195.field3487 = -1;
            return true;
        } else if (class195.field3487 == 213) {
            int var154 = class18.field511.method998(89);
            int var155 = var154 >> 6;
            class209 var156 = new class209();
            var156.field3760 = var154 & 0x3F;
            var156.field3750 = class18.field511.method998(76);
            if (var156.field3750 >= 0 && var156.field3750 < class137.field2476.length) {
                if (var156.field3760 == 1 || var156.field3760 == 10) {
                    var156.field3745 = class18.field511.method1049((byte) 97);
                    class18.field511.field2643 += 3;
                } else if (var156.field3760 >= 2 && var156.field3760 <= 6) {
                    if (var156.field3760 == 2) {
                        var156.field3749 = 64;
                        var156.field3742 = 64;
                    }
                    if (var156.field3760 == 3) {
                        var156.field3749 = 0;
                        var156.field3742 = 64;
                    }
                    if (var156.field3760 == 4) {
                        var156.field3749 = 128;
                        var156.field3742 = 64;
                    }
                    if (var156.field3760 == 5) {
                        var156.field3742 = 0;
                        var156.field3749 = 64;
                    }
                    if (var156.field3760 == 6) {
                        var156.field3742 = 128;
                        var156.field3749 = 64;
                    }
                    var156.field3760 = 2;
                    var156.field3739 = class18.field511.method1049((byte) 108);
                    var156.field3743 = class18.field511.method1049((byte) 98);
                    var156.field3741 = class18.field511.method998(108);
                }
                var156.field3753 = class18.field511.method1049((byte) 112);
                if (var156.field3753 == 65535) {
                    var156.field3753 = -1;
                }
                class84.field1598[var155] = var156;
            }
            class195.field3487 = -1;
            return true;
        } else if (class195.field3487 == 255) {
            class61.field1233 = 0;
            class195.field3487 = -1;
            return true;
        } else if (class195.field3487 == 101) {
            if (class30.field722 == 0) {
                class103.field1886 = class217.field3957;
            } else {
                class103.field1886 = class18.field511.method1038(99);
            }
            class195.field3487 = -1;
            return true;
        } else if (class195.field3487 == 220) {
            int var157 = class18.field511.method1026(false);
            int var158 = class18.field511.method1004(255);
            class9 var159 = class119.method837((byte) 89, var157);
            if (var159 != null && var159.field225 == 0) {
                if (var159.field294 - var159.field207 < var158) {
                    var158 = var159.field294 - var159.field207;
                }
                if (var158 < 0) {
                    var158 = 0;
                }
                if (var159.field247 != var158) {
                    var159.field247 = var158;
                    class62.method457(var159, ~arg0);
                }
            }
            class195.field3487 = -1;
            return true;
        } else if (class195.field3487 == 162) {
            int var160 = class18.field511.method1008(-74);
            int var161 = class18.field511.method1037(arg0 + 44);
            class9 var162 = class119.method837((byte) 97, var160);
            if (var162.field291 != var161 || var161 == -1) {
                var162.field291 = var161;
                var162.field270 = 0;
                var162.field299 = 0;
                class62.method457(var162, ~arg0);
            }
            class195.field3487 = -1;
            return true;
        } else if (class195.field3487 == 26) {
            int var163 = class18.field511.method995((byte) -115);
            int var164 = class18.field511.method988(126);
            class9 var165 = class119.method837((byte) 111, var163);
            if (var164 == 65535) {
                var164 = -1;
            }
            if (var165.field245 != 2 || var165.field235 != var164) {
                var165.field245 = 2;
                var165.field235 = var164;
                class62.method457(var165, 0);
            }
            class195.field3487 = -1;
            return true;
        } else if (class195.field3487 == 117) {
            class117 var166 = class18.field511.method1038(116);
            if (var166.method792(class240.field4349, (byte) 85)) {
                class117 var196 = var166.method781(true, 0, var166.method799(class37.field861, 0));
                long var197 = var196.method813((byte) 93);
                boolean var199 = false;
                for (int var200 = 0; var200 < class85.field1613; var200++) {
                    if (class158.field2873[var200] == var197) {
                        var199 = true;
                        break;
                    }
                }
                if (!var199 && class160.field2926 == 0) {
                    class14.method129(var196, class97.field1791, 0, 4);
                }
            } else if (var166.method792(class159.field2916, (byte) 85)) {
                class117 var190 = var166.method781(true, 0, var166.method799(class37.field861, 0));
                long var191 = var190.method813((byte) 93);
                boolean var193 = false;
                for (int var194 = 0; var194 < class85.field1613; var194++) {
                    if (class158.field2873[var194] == var191) {
                        var193 = true;
                        break;
                    }
                }
                if (!var193 && class160.field2926 == 0) {
                    class117 var195 = var166.method781(true, var166.method799(class37.field861, 0) + 1, var166.method819((byte) -116) - 9);
                    class14.method129(var190, var195, 0, 8);
                }
            } else if (var166.method792(class92.field1694, (byte) 85)) {
                class117 var185 = var166.method781(true, 0, var166.method799(class37.field861, 0));
                long var186 = var185.method813((byte) 93);
                boolean var188 = false;
                for (int var189 = 0; var189 < class85.field1613; var189++) {
                    if (class158.field2873[var189] == var186) {
                        var188 = true;
                        break;
                    }
                }
                if (!var188 && class160.field2926 == 0) {
                    class14.method129(var185, class169.field3042, 0, 10);
                }
            } else if (var166.method792(class43.field949, (byte) 85)) {
                class117 var167 = var166.method781(true, 0, var166.method799(class43.field949, 0));
                class14.method129(class169.field3042, var167, 0, 11);
            } else if (var166.method792(class174.field3140, (byte) 85)) {
                class117 var184 = var166.method781(true, 0, var166.method799(class174.field3140, 0));
                if (class160.field2926 == 0) {
                    class14.method129(class169.field3042, var184, 0, 12);
                }
            } else if (var166.method792(class12.field396, (byte) 85)) {
                class117 var168 = var166.method781(true, 0, var166.method799(class12.field396, 0));
                if (class160.field2926 == 0) {
                    class14.method129(class169.field3042, var168, 0, 13);
                }
            } else if (var166.method792(class240.field4345, (byte) 85)) {
                class117 var179 = var166.method781(true, 0, var166.method799(class37.field861, ~arg0));
                long var180 = var179.method813((byte) 93);
                boolean var182 = false;
                for (int var183 = 0; var183 < class85.field1613; var183++) {
                    if (class158.field2873[var183] == var180) {
                        var182 = true;
                        break;
                    }
                }
                if (!var182 && class160.field2926 == 0) {
                    class14.method129(var179, class169.field3042, 0, 14);
                }
            } else if (var166.method792(class48.field1016, (byte) 85)) {
                class117 var169 = var166.method781(true, 0, var166.method799(class37.field861, ~arg0));
                long var170 = var169.method813((byte) 93);
                boolean var172 = false;
                for (int var173 = 0; var173 < class85.field1613; var173++) {
                    if (class158.field2873[var173] == var170) {
                        var172 = true;
                        break;
                    }
                }
                if (!var172 && class160.field2926 == 0) {
                    class14.method129(var169, class169.field3042, arg0 + 1, 15);
                }
            } else if (var166.method792(class21.field569, (byte) 85)) {
                class117 var174 = var166.method781(true, 0, var166.method799(class37.field861, 0));
                long var175 = var174.method813((byte) 93);
                boolean var177 = false;
                for (int var178 = 0; var178 < class85.field1613; var178++) {
                    if (class158.field2873[var178] == var175) {
                        var177 = true;
                        break;
                    }
                }
                if (!var177 && class160.field2926 == 0) {
                    class14.method129(var174, class169.field3042, 0, 16);
                }
            } else {
                class14.method129(class169.field3042, var166, 0, 0);
            }
            class195.field3487 = -1;
            return true;
        } else if (class195.field3487 == 100) {
            int var201 = class18.field511.method1018(arg0 - 1068451599);
            class9 var202 = class119.method837((byte) 106, var201);
            var202.field245 = 3;
            var202.field235 = class93.field1712.field1143.method656(255);
            class62.method457(var202, ~arg0);
            class195.field3487 = -1;
            return true;
        } else if (class195.field3487 == 188) {
            class85.field1613 = class30.field722 / 8;
            for (int var203 = 0; var203 < class85.field1613; var203++) {
                class158.field2873[var203] = class18.field511.method1012((byte) -85);
                class9.field230[var203] = class162.method1156(class158.field2873[var203], (byte) -31);
            }
            class195.field3487 = -1;
            class204.field3688 = class194.field3470;
            return true;
        } else if (class195.field3487 == 243) {
            int var204 = class18.field511.method1019((byte) -23);
            int var205 = class18.field511.method1004(255);
            client.field776 = var205;
            class139.field2532 = var204;
            class104.method699(65280);
            class195.field3487 = -1;
            return true;
        } else if (class195.field3487 == 6) {
            long var206 = class18.field511.method1012((byte) -85);
            long var208 = (long) class18.field511.method1049((byte) 106);
            long var210 = (long) class18.field511.method1023(-1002744);
            int var212 = class18.field511.method998(arg0 + 115);
            boolean var213 = false;
            long var214 = (var208 << 32) + var210;
            int var216 = 0;
            label1342: while (true) {
                if (var216 >= 100) {
                    if (var212 <= 1) {
                        if (class198.field3548 == 1 || class67.field1292 == 1) {
                            var213 = true;
                        } else {
                            for (int var217 = 0; var217 < class85.field1613; var217++) {
                                if (class158.field2873[var217] == var206) {
                                    var213 = true;
                                    break label1342;
                                }
                            }
                        }
                    }
                    break;
                }
                if (class209.field3759[var216] == var214) {
                    var213 = true;
                    break;
                }
                var216++;
            }
            if (!var213 && class160.field2926 == 0) {
                class209.field3759[class166.field3005] = var214;
                class166.field3005 = (class166.field3005 + 1) % 100;
                class117 var218 = class138.method925(class8.method59((byte) -116, class18.field511).method811(-14443));
                if (var212 == 2 || var212 == 3) {
                    class14.method129(class36.method316((byte) -34, new class117[] { class13.field416, class162.method1156(var206, (byte) 115).method796((byte) -40) }), var218, 0, 7);
                } else if (var212 == 1) {
                    class14.method129(class36.method316((byte) -34, new class117[] { class103.field1888, class162.method1156(var206, (byte) -113).method796((byte) -40) }), var218, arg0 + 1, 7);
                } else {
                    class14.method129(class162.method1156(var206, (byte) 0).method796((byte) -40), var218, arg0 + 1, 3);
                }
            }
            class195.field3487 = -1;
            return true;
        } else if (class195.field3487 == 116) {
            class196.method1300(false);
            class195.field3487 = -1;
            return true;
        } else if (class195.field3487 == 4) {
            int var219 = class18.field511.method988(102);
            int var220 = class18.field511.method1049((byte) 100);
            int var221 = class18.field511.method995((byte) -115);
            class9 var222 = class119.method837((byte) 101, var221);
            class195.field3487 = -1;
            var222.field210 = (var220 << 16) + var219;
            return true;
        } else if (class195.field3487 == 24) {
            for (int var223 = 0; var223 < class141.field2561.length; var223++) {
                if (class141.field2561[var223] != class112.field2106[var223]) {
                    class141.field2561[var223] = class112.field2106[var223];
                    class216.method1421(var223, 96);
                    class54.field1112[class209.method1370(31, class185.field3323++)] = var223;
                }
            }
            class195.field3487 = -1;
            return true;
        } else if (class195.field3487 == 123 || class195.field3487 == 52 || class195.field3487 == 232 || class195.field3487 == 61 || class195.field3487 == 135 || class195.field3487 == 173 || class195.field3487 == 150 || class195.field3487 == 198 || class195.field3487 == 99 || class195.field3487 == 171 || class195.field3487 == 75 || class195.field3487 == 44) {
            class32.method280(true);
            class195.field3487 = -1;
            return true;
        } else if (class195.field3487 == 108) {
            int var224 = class18.field511.method998(127);
            if (class18.field511.method998(103) == 0) {
                class175.field3156[var224] = new class195();
            } else {
                class18.field511.field2643--;
                class175.field3156[var224] = new class195(class18.field511);
            }
            class195.field3487 = -1;
            class128.field2375 = class194.field3470;
            return true;
        } else if (class195.field3487 == 189) {
            class176.field3174 = (short) class18.field511.method1049((byte) 109);
            if (class176.field3174 <= 0) {
                class176.field3174 = 256;
            }
            class124.field2318 = (short) class18.field511.method1004(255);
            class195.field3487 = -1;
            if (class124.field2318 <= 0) {
                class124.field2318 = 205;
            }
            return true;
        } else if (class195.field3487 == 74) {
            long var225 = class18.field511.method1012((byte) -85);
            class18.field511.method994((byte) 49);
            long var227 = class18.field511.method1012((byte) -85);
            long var229 = (long) class18.field511.method1049((byte) 117);
            long var231 = (long) class18.field511.method1023(arg0 - 1002743);
            boolean var233 = false;
            long var234 = (var229 << 32) + var231;
            int var236 = class18.field511.method998(107);
            int var237 = 0;
            label1369: while (true) {
                if (var237 >= 100) {
                    if (var236 <= 1) {
                        if (class198.field3548 == 1 || class67.field1292 == 1) {
                            var233 = true;
                        } else {
                            for (int var238 = 0; var238 < class85.field1613; var238++) {
                                if (class158.field2873[var238] == var225) {
                                    var233 = true;
                                    break label1369;
                                }
                            }
                        }
                    }
                    break;
                }
                if (class209.field3759[var237] == var234) {
                    var233 = true;
                    break;
                }
                var237++;
            }
            if (!var233 && class160.field2926 == 0) {
                class209.field3759[class166.field3005] = var234;
                class166.field3005 = (class166.field3005 + 1) % 100;
                class117 var239 = class138.method925(class8.method59((byte) -116, class18.field511).method811(arg0 ^ 0x386A));
                if (var236 == 2 || var236 == 3) {
                    class39.method340(class36.method316((byte) -34, new class117[] { class13.field416, class162.method1156(var225, (byte) 116).method796((byte) -40) }), 9, var239, 12419, class162.method1156(var227, (byte) 1).method796((byte) -40));
                } else if (var236 == 1) {
                    class39.method340(class36.method316((byte) -34, new class117[] { class103.field1888, class162.method1156(var225, (byte) -22).method796((byte) -40) }), 9, var239, 12419, class162.method1156(var227, (byte) 126).method796((byte) -40));
                } else {
                    class39.method340(class162.method1156(var225, (byte) 126).method796((byte) -40), 9, var239, arg0 ^ 0xFFFFCF7C, class162.method1156(var227, (byte) -128).method796((byte) -40));
                }
            }
            class195.field3487 = -1;
            return true;
        } else if (class195.field3487 == 120) {
            int var240 = class18.field511.method1004(255);
            int var241 = class18.field511.method1004(255);
            int var242 = class18.field511.method1026(false);
            int var243 = class18.field511.method1019((byte) -72);
            class9 var244 = class119.method837((byte) 109, var242);
            if (var244.field229 != var243 || var244.field209 != var241 || var244.field195 != var240) {
                var244.field229 = var243;
                var244.field195 = var240;
                var244.field209 = var241;
                class62.method457(var244, 0);
            }
            class195.field3487 = -1;
            return true;
        } else if (class195.field3487 == 149) {
            int var245 = class18.field511.method988(73);
            int var246 = class18.field511.method1045((byte) 99);
            int var247 = class18.field511.method1049((byte) 124);
            class207 var248 = class1.field18[var247];
            if (var248 != null) {
                class106.method708(var246, true, var245, var248);
            }
            class195.field3487 = -1;
            return true;
        } else if (class195.field3487 == 11) {
            byte var249 = class18.field511.method1009((byte) 88);
            int var250 = class18.field511.method988(101);
            class112.field2106[var250] = var249;
            if (class141.field2561[var250] != var249) {
                class141.field2561[var250] = var249;
                class216.method1421(var250, arg0 ^ 0xFFFFFF9F);
            }
            class54.field1112[class209.method1370(class185.field3323++, 31)] = var250;
            class195.field3487 = -1;
            return true;
        } else if (class195.field3487 == 237) {
            class133.field2401 = class18.field511.method998(arg0 + 122);
            class17.field506 = class18.field511.method998(85);
            class44.field960 = class18.field511.method998(85);
            class195.field3487 = -1;
            return true;
        } else if (class195.field3487 == 230) {
            int var251 = class18.field511.method1042(true);
            int var252 = var251 >> 2;
            int var253 = class73.field1389[var252];
            int var254 = class18.field511.method1049((byte) 104);
            if (var254 == 65535) {
                var254 = -1;
            }
            int var255 = var251 & 0x3;
            int var256 = class18.field511.method995((byte) -115);
            int var257 = var256 >> 28 & 0x3;
            int var258 = var256 >> 14 & 0x3FFF;
            int var259 = var256 & 0x3FFF;
            int var260 = var258 - class143.field2591;
            int var261 = var259 - class184.field3319;
            class120.method844(var254, var260, var257, var252, var255, (byte) 127, var253, var261);
            class195.field3487 = -1;
            return true;
        } else if (class195.field3487 == 241) {
            int var262 = class18.field511.method1049((byte) 117);
            class5.method43((byte) 36, var262);
            class172.field3113[class209.method1370(class20.field555++, 31)] = class209.method1370(32767, var262);
            class195.field3487 = -1;
            return true;
        } else if (class195.field3487 == 187) {
            long var263 = class18.field511.method1012((byte) -85);
            int var265 = class18.field511.method1049((byte) 112);
            class117 var266 = class172.method1204((byte) -110, var265).method1119(class18.field511, false);
            class151.method1078(var265, (byte) 119, 19, class162.method1156(var263, (byte) 104).method796((byte) -40), null, var266);
            class195.field3487 = -1;
            return true;
        } else if (class195.field3487 == 70) {
            for (int var267 = 0; var267 < class178.field3228; var267++) {
                class14 var268 = class246.method1615((byte) 108, var267);
                if (var268 != null && var268.field430 == 0) {
                    class112.field2106[var267] = 0;
                    class141.field2561[var267] = 0;
                }
            }
            class86.method599((byte) 84);
            class185.field3323 += 32;
            class195.field3487 = -1;
            return true;
        } else if (class195.field3487 == 233) {
            class117 var269 = class18.field511.method1038(41);
            int var270 = class18.field511.method998(arg0 ^ 0xFFFFFF90);
            int var271 = class18.field511.method998(122);
            if (var270 >= 1 && var270 <= 8) {
                if (var269.method789(class179.field3248, arg0 - 92)) {
                    var269 = null;
                }
                class90.field1685[var270 - 1] = var269;
                class108.field2005[var270 - 1] = var271 == 0;
            }
            class195.field3487 = -1;
            return true;
        } else if (class195.field3487 == 79) {
            class122.method853(false, -1);
            class195.field3487 = -1;
            return true;
        } else if (class195.field3487 == 192) {
            class162.field2967 = true;
            class159.field2899 = class18.field511.method998(66);
            class195.field3476 = class18.field511.method998(121);
            class90.field1674 = class18.field511.method1049((byte) 119);
            class162.field2960 = class18.field511.method998(91);
            class181.field3272 = class18.field511.method998(110);
            if (class181.field3272 >= 100) {
                class186.field3339 = class195.field3476 * 128 + 64;
                class19.field535 = class159.field2899 * 128 + 64;
                class31.field732 = class186.method1265(true, class186.field3339, class203.field3675, class19.field535) - class90.field1674;
            }
            class195.field3487 = -1;
            return true;
        } else if (class195.field3487 == 205) {
            long var272 = class18.field511.method1012((byte) -85);
            int var274 = class18.field511.method1049((byte) 119);
            byte var275 = class18.field511.method994((byte) 85);
            boolean var276 = false;
            if ((var272 & Long.MIN_VALUE) != 0L) {
                var276 = true;
            }
            if (var276) {
                if (class211.field3840 == 0) {
                    class195.field3487 = -1;
                    return true;
                }
                long var282 = var272 & Long.MAX_VALUE;
                boolean var284 = false;
                int var285;
                for (var285 = 0; class211.field3840 > var285 && (class39.field898[var285].field389 != var282 || class39.field898[var285].field3969 != var274); var285++) {
                }
                if (var285 < class211.field3840) {
                    while (var285 < class211.field3840 - 1) {
                        class39.field898[var285] = class39.field898[var285 + 1];
                        var285++;
                    }
                    class211.field3840--;
                    class39.field898[class211.field3840] = null;
                }
            } else {
                class117 var277 = class18.field511.method1038(125);
                class218 var278 = new class218();
                var278.field389 = var272;
                var278.field3960 = class162.method1156(var278.field389, (byte) 124);
                var278.field3958 = var277;
                var278.field3969 = var274;
                var278.field3968 = var275;
                int var279;
                for (var279 = class211.field3840 - 1; var279 >= 0; var279--) {
                    int var280 = class39.field898[var279].field3960.method805(false, var278.field3960);
                    if (var280 == 0) {
                        class39.field898[var279].field3969 = var274;
                        class39.field898[var279].field3968 = var275;
                        class39.field898[var279].field3958 = var277;
                        class117.field2172 = class194.field3470;
                        if (field3991 == var272) {
                            class130.field2393 = var275;
                        }
                        class195.field3487 = -1;
                        return true;
                    }
                    if (var280 < 0) {
                        break;
                    }
                }
                if (class211.field3840 >= class39.field898.length) {
                    class195.field3487 = -1;
                    return true;
                }
                for (int var281 = class211.field3840 - 1; var281 > var279; var281--) {
                    class39.field898[var281 + 1] = class39.field898[var281];
                }
                if (class211.field3840 == 0) {
                    class39.field898 = new class218[100];
                }
                class39.field898[var279 + 1] = var278;
                if (field3991 == var272) {
                    class130.field2393 = var275;
                }
                class211.field3840++;
            }
            class195.field3487 = -1;
            class117.field2172 = class194.field3470;
            return true;
        } else if (class195.field3487 == 146) {
            int var286 = class18.field511.method1008(arg0 - 63);
            int var287 = class18.field511.method995((byte) -115);
            int var288 = class18.field511.method1049((byte) 110);
            int var289 = class18.field511.method988(104);
            if (var288 == 65535) {
                var288 = -1;
            }
            if (var289 == 65535) {
                var289 = -1;
            }
            for (int var290 = var288; var290 <= var289; var290++) {
                long var291 = ((long) var287 << 32) + (long) var290;
                class12 var293 = class184.field3306.method460(var291, 1);
                if (var293 != null) {
                    var293.method123((byte) -126);
                }
                class184.field3306.method461(var291, (byte) -42, new class123(var286));
            }
            class195.field3487 = -1;
            return true;
        } else if (class195.field3487 == 139) {
            int var294 = class18.field511.method1026(false);
            int var295 = class18.field511.method1026(false);
            int var296 = class18.field511.method1004(255);
            if (var296 == 65535) {
                var296 = -1;
            }
            class9 var297 = class119.method837((byte) 102, var294);
            if (var297.field249) {
                var297.field158 = var296;
                var297.field151 = var295;
                class154 var299 = class214.method1408((byte) 102, var296);
                var297.field150 = var299.field2779;
                var297.field293 = var299.field2784;
                var297.field195 = var299.field2803;
                var297.field209 = var299.field2776;
                var297.field229 = var299.field2810;
                var297.field202 = var299.field2768;
                if (var297.field179 > 0) {
                    var297.field195 = var297.field195 * 32 / var297.field179;
                } else if (var297.field222 > 0) {
                    var297.field195 = var297.field195 * 32 / var297.field222;
                }
                class62.method457(var297, ~arg0);
            } else if (var296 == -1) {
                var297.field245 = 0;
                class195.field3487 = -1;
                return true;
            } else {
                class154 var298 = class214.method1408((byte) 102, var296);
                var297.field195 = var298.field2803 * 100 / var295;
                var297.field229 = var298.field2810;
                var297.field235 = var296;
                var297.field245 = 4;
                var297.field209 = var298.field2776;
                class62.method457(var297, arg0 + 1);
            }
            class195.field3487 = -1;
            return true;
        } else if (class195.field3487 == 221) {
            int var300 = class18.field511.method998(105);
            int var301 = class18.field511.method998(82);
            int var302 = class18.field511.method998(arg0 + 68);
            int var303 = class18.field511.method998(arg0 ^ 0xFFFFFFAA);
            int var304 = class18.field511.method1049((byte) 98);
            class243.field4405[var300] = true;
            class225.field4063[var300] = var301;
            class6.field96[var300] = var302;
            class230.field4142[var300] = var303;
            class75.field1427[var300] = var304;
            class195.field3487 = -1;
            return true;
        } else if (class195.field3487 == 214) {
            int var305 = class18.field511.method1026(false);
            class117 var306 = class18.field511.method1038(arg0 + 19);
            class9 var307 = class119.method837((byte) 108, var305);
            if (!var306.method810((byte) -50, var307.field162)) {
                var307.field162 = var306;
                class62.method457(var307, 0);
            }
            class195.field3487 = -1;
            return true;
        } else if (class195.field3487 == 84) {
            class169.field3047 = class18.field511.method998(85);
            class195.field3487 = -1;
            class204.field3688 = class194.field3470;
            return true;
        } else if (class195.field3487 == 68) {
            class86.method599((byte) 117);
            class230.field4146 = class18.field511.method998(82);
            class50.field1038 = class194.field3470;
            class195.field3487 = -1;
            return true;
        } else if (class195.field3487 == 147) {
            class201.field3645 = class18.field511.method998(94);
            class195.field3487 = -1;
            return true;
        } else if (class195.field3487 == 96) {
            int var308 = class18.field511.method1019((byte) 90);
            int var309 = class18.field511.method1008(-46);
            class9 var310 = class119.method837((byte) 85, var309);
            if (var308 == 65535) {
                var308 = -1;
            }
            if (var310.field245 != 1 || var310.field235 != var308) {
                var310.field245 = 1;
                var310.field235 = var308;
                class62.method457(var310, 0);
            }
            class195.field3487 = -1;
            return true;
        } else if (class195.field3487 == 10) {
            int var311 = class18.field511.method1019((byte) -115);
            if (var311 == 65535) {
                var311 = -1;
            }
            class39.method343(0, var311);
            class195.field3487 = -1;
            return true;
        } else if (class195.field3487 == 89) {
            int var312 = class18.field511.method988(95);
            int var313 = class18.field511.method1043(-125);
            if (var312 == 65535) {
                var312 = -1;
            }
            class57.method434(var312, (byte) -95, var313);
            class195.field3487 = -1;
            return true;
        } else if (class195.field3487 == 166) {
            if (class92.field1697 != -1) {
                class158.method1122(class92.field1697, 0, 0);
            }
            class195.field3487 = -1;
            return true;
        } else if (class195.field3487 == 235) {
            class5.field78 = class18.field511.method1038(arg0 + 118);
            class227.method1473(class5.field78, -110);
            class195.field3487 = -1;
            return true;
        } else if (class195.field3487 == 177) {
            int var314 = class18.field511.method995((byte) -115);
            class158.field2868 = class130.field2397.method893((byte) 98, var314);
            class195.field3487 = -1;
            return true;
        } else if (class195.field3487 == 16) {
            long var315 = class18.field511.method1012((byte) -85);
            int var317 = class18.field511.method1049((byte) 115);
            boolean var318 = true;
            if (var315 < 0L) {
                var315 &= Long.MAX_VALUE;
                var318 = false;
            }
            int var319 = class18.field511.method998(113);
            class117 var320 = class169.field3042;
            if (var317 > 0) {
                var320 = class18.field511.method1038(120);
            }
            class117 var321 = class162.method1156(var315, (byte) 112).method796((byte) -40);
            for (int var322 = 0; var322 < class151.field2744; var322++) {
                if (class32.field751[var322] == var315) {
                    if (class99.field1813[var322] != var317) {
                        class99.field1813[var322] = var317;
                        if (var317 > 0) {
                            class14.method129(class169.field3042, class36.method316((byte) -34, new class117[] { var321, class53.field1091 }), 0, 5);
                        }
                        if (var317 == 0) {
                            class14.method129(class169.field3042, class36.method316((byte) -34, new class117[] { var321, class162.field2961 }), 0, 5);
                        }
                    }
                    class190.field3384[var322] = var320;
                    var321 = null;
                    class239.field4330[var322] = var319;
                    class148.field2706[var322] = var318;
                    break;
                }
            }
            if (var321 != null && class151.field2744 < 200) {
                class32.field751[class151.field2744] = var315;
                class68.field1301[class151.field2744] = var321;
                class99.field1813[class151.field2744] = var317;
                class190.field3384[class151.field2744] = var320;
                class239.field4330[class151.field2744] = var319;
                class148.field2706[class151.field2744] = var318;
                class151.field2744++;
            }
            boolean var323 = false;
            int var324 = class151.field2744;
            class204.field3688 = class194.field3470;
            while (var324 > 0) {
                var324--;
                boolean var325 = true;
                for (int var326 = 0; var326 < var324; var326++) {
                    if (class99.field1813[var326] != class10.field361 && class99.field1813[var326 + 1] == class10.field361 || class99.field1813[var326] == 0 && class99.field1813[var326 + 1] != 0) {
                        var325 = false;
                        int var327 = class99.field1813[var326];
                        class99.field1813[var326] = class99.field1813[var326 + 1];
                        class99.field1813[var326 + 1] = var327;
                        class117 var328 = class190.field3384[var326];
                        class190.field3384[var326] = class190.field3384[var326 + 1];
                        class190.field3384[var326 + 1] = var328;
                        class117 var329 = class68.field1301[var326];
                        class68.field1301[var326] = class68.field1301[var326 + 1];
                        class68.field1301[var326 + 1] = var329;
                        long var330 = class32.field751[var326];
                        class32.field751[var326] = class32.field751[var326 + 1];
                        class32.field751[var326 + 1] = var330;
                        int var332 = class239.field4330[var326];
                        class239.field4330[var326] = class239.field4330[var326 + 1];
                        class239.field4330[var326 + 1] = var332;
                        boolean var333 = class148.field2706[var326];
                        class148.field2706[var326] = class148.field2706[var326 + 1];
                        class148.field2706[var326 + 1] = var333;
                    }
                }
                if (var325) {
                    break;
                }
            }
            class195.field3487 = -1;
            return true;
        } else {
            class147.method1055(6678, "T1 - " + class195.field3487 + "," + class56.field1161 + "," + class8.field131 + " - " + class30.field722, null);
            class212.method1393(2);
            return true;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lai;IIZ)[Lr;")
    public static final class186[] method1436(class10 arg0, int arg1, int arg2, boolean arg3) {
        field3996++;
        if (class96.method654(arg1, -2158, arg2, arg0)) {
            return arg3 ? null : class100.method679(81);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lqb;)V")
    public class221(class177 arg0) {
        this.field3983 = arg0;
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)V")
    public static void method1437(int arg0) {
        field3992 = null;
        field3980 = null;
        field3995 = null;
        field3989 = null;
        if (arg0 != -90) {
            method1436(null, 34, 97, false);
        }
        field3994 = null;
        field3993 = null;
        field3988 = null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "([BII[IIIIIIII)V")
    public static final void method1438(byte[] arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field3986++;
        int var11 = ((arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
        int var12 = 256 - arg2;
        if (arg5 != -9540) {
            method1434((byte) -108, -31);
        }
        for (int var13 = -arg4; var13 < 0; var13++) {
            for (int var14 = -arg8; var14 < 0; var14++) {
                if (arg0[arg10++] == 0) {
                    arg6++;
                } else {
                    int var15 = arg3[arg6];
                    arg3[arg6++] = var11 + (class209.method1370(16711680, var12 * class209.method1370(var15, 65280)) + class209.method1370(var12 * class209.method1370(var15, 16711935), -16711936) >> 8);
                }
            }
            arg6 += arg9;
            arg10 += arg7;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIII)V")
    public static final void method1439(int arg0, int arg1, int arg2, int arg3) {
        class170 var4 = class109.field2063[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class239 var5 = var4.field3073;
        if (var5 != null) {
            var5.field4319 = var5.field4319 * arg3 / 16;
            var5.field4316 = var5.field4316 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(BJ)V")
    public static final void method1440(byte arg0, long arg1) {
        field3984++;
        if (arg1 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class85.field1613; var3++) {
            if (class158.field2873[var3] == arg1) {
                class85.field1613--;
                class128.field2379++;
                for (int var4 = var3; var4 < class85.field1613; var4++) {
                    class158.field2873[var4] = class158.field2873[var4 + 1];
                    class9.field230[var4] = class9.field230[var4 + 1];
                }
                class204.field3688 = class194.field3470;
                class105.field1911.method400(126, 8);
                class105.field1911.method1000((byte) 56, arg1);
                break;
            }
        }
        int var5 = 79 / ((-arg0 - 46) / 62);
    }
}
