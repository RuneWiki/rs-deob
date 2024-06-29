import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class364 {

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
    public int field5226 = -1;

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "I")
    public int field5235 = -1;

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "Z")
    public static boolean field5231 = true;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "Lsd;")
    public static class74 field5228 = new class74(9, -2);

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
    public static int field5225;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
    public static int field5227;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "I")
    public static int field5230;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
    public static int field5232;

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
    public static int field5233;

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
    public static int field5234;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "Lfc;")
    public static class209 field5224;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "[I")
    public int[] field5229;

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "[Lda;")
    public static class326[] field5236;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)Z")
    public static final boolean method2207(int arg0) throws IOException {
        field5227++;
        if (class322.field4655 == null) {
            return false;
        }
        int var1 = class322.field4655.method676((byte) 116);
        if (var1 == 0) {
            return false;
        }
        if (class233.field3240 == null) {
            if (class330.field4752) {
                var1--;
                class322.field4655.method672(class79.field939.field2159, 0, (byte) -66, 1);
                class2.field14++;
                class330.field4752 = false;
            }
            class79.field939.field2206 = 0;
            if (class79.field939.method2009(255)) {
                if (var1 == 0) {
                    return false;
                }
                var1--;
                class322.field4655.method672(class79.field939.field2159, 1, (byte) -82, 1);
                class2.field14++;
            }
            class330.field4752 = true;
            class74[] var2 = class71.method361(-53);
            int var3 = class79.field939.method2010(-128);
            if (var3 < 0 || var2.length <= var3) {
                throw new IOException("invo:" + var3);
            }
            class233.field3240 = var2[var3];
            class361.field5203 = class233.field3240.field897;
        }
        if (class361.field5203 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class322.field4655.method672(class79.field939.field2159, 0, (byte) -116, 1);
            var1--;
            class2.field14++;
            class361.field5203 = class79.field939.field2159[0] & 0xFF;
        }
        if (class361.field5203 == -2) {
            if (var1 <= 1) {
                return false;
            }
            class322.field4655.method672(class79.field939.field2159, 0, (byte) -111, 2);
            class79.field939.field2206 = 0;
            class361.field5203 = class79.field939.method916(21933);
            var1 -= 2;
            class2.field14 += 2;
        }
        if (class361.field5203 > var1) {
            return false;
        }
        class79.field939.field2206 = 0;
        class322.field4655.method672(class79.field939.field2159, 0, (byte) -82, class361.field5203);
        class358.field5166 = class24.field333;
        class159.field1908 = 0;
        class2.field14 += class361.field5203;
        class24.field333 = class357.field5161;
        class357.field5161 = class233.field3240;
        if (class233.field3240 == class232.field3222) {
            class145.field1756 = class79.field939.method886((byte) 118);
            class147.field1781 = class79.field939.method886((byte) 94);
            class226.field3139 = class79.field939.method940((byte) 93);
            while (class361.field5203 > class79.field939.field2206) {
                class140 var4 = class42.method211(0)[class79.field939.method895((byte) -98)];
                class311.method1925(111, var4);
            }
            class233.field3240 = null;
            return true;
        } else if (class42.field504 == class233.field3240) {
            int var5 = class79.field939.method895((byte) -73);
            int var6 = class79.field939.method883(81);
            boolean var7 = (var5 & 0x1) == 1;
            class57.method292(var6, var7, -5339);
            class236.field3266[class444.method2618(31, class330.field4749++)] = var6;
            class233.field3240 = null;
            return true;
        } else if (class233.field3240 == class118.field1452) {
            class269.method1629(class79.field939, class361.field5203, -121);
            class233.field3240 = null;
            return true;
        } else if (class233.field3240 == class119.field1485) {
            int var8 = class79.field939.method939((byte) -122);
            class169.field2005 = class42.field512.method2176(var8, 123);
            class233.field3240 = null;
            return true;
        } else if (field5228 == class233.field3240) {
            int var9 = class79.field939.method916(21933);
            int var10 = class79.field939.method895((byte) -121);
            boolean var11 = (var10 & 0x1) == 1;
            class145.method691(-25241, var11, var9);
            int var12 = class79.field939.method916(arg0 ^ 0xBD05C59D);
            for (int var13 = 0; var13 < var12; var13++) {
                int var14 = class79.field939.method896(13089);
                if (var14 == 255) {
                    var14 = class79.field939.method908(-127);
                }
                int var15 = class79.field939.method930(255);
                class388.method2339(var13, (byte) 37, var14, var11, var9, var15 - 1);
            }
            class236.field3266[class444.method2618(class330.field4749++, 31)] = var9;
            class233.field3240 = null;
            return true;
        } else if (class281.field4096 == class233.field3240) {
            class311.method1925(arg0 + 1123708986, class406.field5768);
            class233.field3240 = null;
            return true;
        } else if (class233.field3240 == class106.field1295) {
            int var16 = class79.field939.method916(21933);
            if (var16 == 65535) {
                var16 = -1;
            }
            int var17 = class79.field939.method886((byte) 91);
            class12.method91(var16, var17, arg0 ^ 0x42FA6FAB);
            class233.field3240 = null;
            return true;
        } else if (class233.field3240 == class121.field1499) {
            int var18 = class79.field939.method888(-24912);
            int var19 = class79.field939.method930(255);
            if (var19 == 65535) {
                var19 = -1;
            }
            int var20 = class79.field939.method886((byte) 110);
            class398.method2381(var18, var20, -27247, var19);
            class233.field3240 = null;
            return true;
        } else if (class244.field3331 == class233.field3240) {
            int var21 = class79.field939.method916(21933);
            int var22 = class79.field939.method930(255);
            byte var23 = class79.field939.method926((byte) -122);
            if (class226.method1245(var22, 93)) {
                class331.method2003(var21, -1977337177, var23);
            }
            class233.field3240 = null;
            return true;
        } else if (class297.field4437 == class233.field3240) {
            class311.method1925(73, class259.field3734);
            class233.field3240 = null;
            return true;
        } else if (class324.field4680 == class233.field3240) {
            int var24 = class79.field939.method883(94);
            if (var24 == 65535) {
                var24 = -1;
            }
            int var25 = class79.field939.method883(arg0 ^ 0xBD059057);
            int var26 = class79.field939.method877(false);
            if (class226.method1245(var25, 56)) {
                class179.method902(-1, var26, 16919, 1, var24);
            }
            class233.field3240 = null;
            return true;
        } else if (class440.field6299 == class233.field3240) {
            int var27 = class79.field939.method877(false);
            int var28 = class79.field939.method916(21933);
            int var29 = class79.field939.method882((byte) -126);
            if (class226.method1245(var29, 65)) {
                class360.method2194(var28, var27, (byte) -107);
            }
            class233.field3240 = null;
            return true;
        } else if (class274.field3887 == class233.field3240) {
            int var30 = class79.field939.method895((byte) -76);
            int var31 = class79.field939.method896(13089);
            if (var31 == 255) {
                var30 = -1;
                var31 = -1;
            }
            class145.method684(var31, false, var30);
            class233.field3240 = null;
            return true;
        } else if (class367.field5253 == class233.field3240) {
            int var32 = class79.field939.method916(arg0 + 1123730813);
            if (class226.method1245(var32, 56)) {
                class347.method2103(arg0 + 1123699159);
            }
            class233.field3240 = null;
            return true;
        } else if (class260.field3749 == class233.field3240) {
            int var33 = class79.field939.method916(arg0 + 1123730813);
            int var34 = class79.field939.method916(21933);
            int var35 = class79.field939.method916(21933);
            int var36 = class79.field939.method916(21933);
            if (class226.method1245(var33, 103) && class284.field4130[var34] != null) {
                for (int var37 = var35; var37 < var36; var37++) {
                    int var38 = class79.field939.method899((byte) 118);
                    if (var37 < class284.field4130[var34].length && class284.field4130[var34][var37] != null) {
                        class284.field4130[var34][var37].field3599 = var38;
                    }
                }
            }
            class233.field3240 = null;
            return true;
        } else if (class72.field873 == class233.field3240) {
            if (class361.field5203 == 0) {
                class343.field4920 = class422.field6080.method205((byte) 117, class68.field849);
            } else {
                class343.field4920 = class79.field939.method907(arg0 ^ 0x42FA03CC);
            }
            class233.field3240 = null;
            return true;
        } else if (class86.field1053 == class233.field3240) {
            int var39 = class79.field939.method882((byte) -112);
            int var40 = class79.field939.method939((byte) -73);
            int var41 = class79.field939.method896(arg0 + 1123721969);
            if (class226.method1245(var39, arg0 + 1123708958)) {
                class172.method852(var41, var40, 1);
            }
            class233.field3240 = null;
            return true;
        } else if (class373.field5337 == class233.field3240) {
            int var42 = class79.field939.method906(arg0 ^ 0x42FA6FE3);
            int var43 = class79.field939.method882((byte) -114);
            int var44 = class79.field939.method877(false);
            int var45 = class79.field939.method941(-1696097432);
            if (class226.method1245(var43, 49)) {
                class345.method2091(23436, var42, var44, var45);
            }
            class233.field3240 = null;
            return true;
        } else if (class233.field3240 == class229.field3177) {
            int var46 = class79.field939.method895((byte) -75);
            boolean var47 = (var46 & 0x1) == 1;
            String var48 = class79.field939.method907(-27652);
            String var49 = class79.field939.method907(-27652);
            if (var49.equals("")) {
                var49 = var48;
            }
            String var50 = class79.field939.method907(-27652);
            String var51 = class79.field939.method907(arg0 + 1123681228);
            if (var51.equals("")) {
                var51 = var50;
            }
            if (var47) {
                for (int var52 = 0; var52 < class414.field5907; var52++) {
                    if (class283.field4121[var52].equals(var51)) {
                        class293.field4361[var52] = var48;
                        class283.field4121[var52] = var49;
                        class66.field824[var52] = var50;
                        class308.field4526[var52] = var51;
                        break;
                    }
                }
            } else {
                class293.field4361[class414.field5907] = var48;
                class283.field4121[class414.field5907] = var49;
                class66.field824[class414.field5907] = var50;
                class308.field4526[class414.field5907] = var51;
                class105.field1283[class414.field5907] = class444.method2618(var46, 2) == 2;
                class414.field5907++;
            }
            class205.field2807 = class129.field1601;
            class233.field3240 = null;
            return true;
        } else if (class481.field6802 == class233.field3240) {
            int var53 = class79.field939.method916(21933);
            int var54 = class79.field939.method908(-120);
            class75.field909.method2713(var54, 108, var53);
            class233.field3240 = null;
            return true;
        } else if (class233.field3240 == class216.field2977) {
            class79.field939.field2206 += 28;
            if (class79.field939.method881(arg0 + 1123708814)) {
                class50.method261(class79.field939, class79.field939.field2206 - 28, (byte) 119);
            }
            class233.field3240 = null;
            return true;
        } else if (class328.field4713 == class233.field3240) {
            int var55 = class79.field939.method883(79);
            int var56 = class79.field939.method930(255);
            int var57 = class79.field939.method886((byte) -75);
            int var58 = class79.field939.method877(false);
            if (class226.method1245(var55, 116)) {
                class68 var59 = (class68) class369.field5270.method233(111, (long) var58);
                if (var59 != null) {
                    class259.method1590(var59, false, -364, var59.field850 != var56);
                }
                class375.method2261(var56, false, var58, var57, 65536);
            }
            class233.field3240 = null;
            return true;
        } else if (class233.field3240 == class172.field2056) {
            int var60 = class79.field939.method940((byte) 92);
            String var61 = class79.field939.method907(-27652);
            int var62 = class79.field939.method883(111);
            if (var62 == 65535) {
                var62 = -1;
            }
            int var63 = class79.field939.method896(13089);
            if (var60 >= 1 && var60 <= 8) {
                if (var61.equalsIgnoreCase("null")) {
                    var61 = null;
                }
                class451.field6377[var60 - 1] = var61;
                class237.field3284[var60 - 1] = var62;
                class397.field5642[var60 - 1] = var63 == 0;
            }
            class233.field3240 = null;
            return true;
        } else if (class233.field3240 == class21.field290) {
            int var64 = class79.field939.method923(-115);
            int var65 = class79.field939.method877(false);
            int var66 = class79.field939.method882((byte) -128);
            int var67 = class79.field939.method883(124);
            if (var67 == 65535) {
                var67 = -1;
            }
            int var68 = class79.field939.method883(96);
            if (var68 == 65535) {
                var68 = -1;
            }
            if (class226.method1245(var66, 120)) {
                for (int var69 = var68; var69 <= var67; var69++) {
                    long var70 = ((long) var64 << 32) + ((long) var69);
                    class281 var72 = (class281) class146.field1757.method233(arg0 ^ 0xBD059076, var70);
                    class281 var73;
                    if (var72 != null) {
                        var73 = new class281(var65, var72.field4094);
                        var72.method702((byte) -114);
                    } else if (var69 == -1) {
                        var73 = new class281(var65, class399.method2387(var64, -1857167024).field3699.field4094);
                    } else {
                        var73 = new class281(var65, -1);
                    }
                    class146.field1757.method234(-77, var70, var73);
                }
            }
            class233.field3240 = null;
            return true;
        } else if (class240.field3300 == class233.field3240) {
            class311.method1925(arg0 ^ 0xBD05904F, class2.field15);
            class233.field3240 = null;
            return true;
        } else if (class50.field639 == class233.field3240) {
            int var74 = class79.field939.method916(arg0 ^ 0xBD05C59D);
            int var75 = class79.field939.method895((byte) -99);
            int var76 = class79.field939.method895((byte) -89);
            int var77 = class79.field939.method916(21933);
            int var78 = class79.field939.method895((byte) -73);
            int var79 = class79.field939.method895((byte) -105);
            if (class226.method1245(var74, 55)) {
                class234.method1290(var77, var79, 1024, var78, var75, var76);
            }
            class233.field3240 = null;
            return true;
        } else if (class284.field4137 == class233.field3240) {
            class311.method1925(arg0 ^ 0xBD059077, class22.field303);
            class233.field3240 = null;
            return true;
        } else if (class484.field6855 == class233.field3240) {
            int var80 = class79.field939.method916(21933);
            if (var80 == 65535) {
                var80 = -1;
            }
            int var81 = class79.field939.method930(255);
            if (var81 == 65535) {
                var81 = -1;
            }
            int var82 = class79.field939.method883(arg0 ^ 0xBD059052);
            int var83 = class79.field939.method916(arg0 + 1123730813);
            int var84 = class79.field939.method939((byte) 36);
            if (class226.method1245(var82, 48)) {
                for (int var85 = var81; var85 <= var80; var85++) {
                    long var86 = ((long) var84 << 32) + (long) var85;
                    class281 var88 = (class281) class146.field1757.method233(-116, var86);
                    class281 var89;
                    if (var88 != null) {
                        var89 = new class281(var88.field4087, var83);
                        var88.method702((byte) -114);
                    } else if (var85 == -1) {
                        var89 = new class281(class399.method2387(var84, -1857167024).field3699.field4087, var83);
                    } else {
                        var89 = new class281(0, var83);
                    }
                    class146.field1757.method234(-49, var86, var89);
                }
            }
            class233.field3240 = null;
            return true;
        } else if (class283.field4122 == class233.field3240) {
            class311.method1925(arg0 ^ 0xBD059058, class409.field5798);
            class233.field3240 = null;
            return true;
        } else if (class354.field5085 == class233.field3240) {
            int var90 = class79.field939.method930(255);
            int var91 = class79.field939.method887(16778);
            int var92 = class79.field939.method939((byte) -87);
            if (class226.method1245(var90, 88)) {
                class319.method1956(85, var91, var92);
            }
            class233.field3240 = null;
            return true;
        } else if (class375.field5352 == class233.field3240) {
            class478.method2827(-30362, true);
            class233.field3240 = null;
            return false;
        } else if (class351.field5043 == class233.field3240) {
            int var93 = class79.field939.method940((byte) 118);
            int var94 = class79.field939.method883(89);
            int var95 = class79.field939.method916(21933);
            class137 var96 = class448.field6366[var94];
            if (var96 != null) {
                class263.method1605(var95, (byte) -25, var96, var93);
            }
            class233.field3240 = null;
            return true;
        } else if (class318.field4631 == class233.field3240) {
            int var97 = class79.field939.method908(-127);
            int var98 = class79.field939.method923(arg0 ^ 0x42FA6FB3);
            int var99 = class79.field939.method930(255);
            int var100 = class79.field939.method882((byte) -113);
            if (var100 == 65535) {
                var100 = -1;
            }
            if (class226.method1245(var99, arg0 + 1123708945)) {
                class39.method200(var100, false, var97, var98);
                class385 var101 = class422.field6096.method121(var100, arg0 ^ 0x42FA6FCF);
                class464.method2732(var101.field5526, (byte) 110, var101.field5465, var97, var101.field5525);
                class64.method328(var101.field5522, var97, var101.field5495, var101.field5500, 3187);
            }
            class233.field3240 = null;
            return true;
        } else if (class459.field6483 == class233.field3240) {
            int var102 = class79.field939.method930(arg0 + 1123709135);
            if (var102 == 65535) {
                var102 = -1;
            }
            int var103 = class79.field939.method916(21933);
            int var104 = class79.field939.method939((byte) -99);
            if (class226.method1245(var103, 64)) {
                class179.method902(-1, var104, arg0 ^ 0xBD05D227, 2, var102);
            }
            class233.field3240 = null;
            return true;
        } else if (class291.field4339 == class233.field3240) {
            int var105 = class79.field939.method930(255);
            int var106 = class79.field939.method940((byte) 78);
            int var107 = class79.field939.method916(arg0 + 1123730813);
            if (class226.method1245(var105, 95)) {
                if (var106 == 2) {
                    class240.method1319((byte) 123);
                }
                class57.field725 = var107;
                class445.method2621(var107, (byte) 122);
                class418.method2486(false, false);
                class396.method2373(class57.field725);
                for (int var108 = 0; var108 < 100; var108++) {
                    class61.field764[var108] = true;
                }
            }
            class233.field3240 = null;
            return true;
        } else if (class448.field6354 == class233.field3240) {
            boolean var109 = class79.field939.method895((byte) -120) == 1;
            String var110 = class79.field939.method907(-27652);
            String var111 = var110;
            if (var109) {
                var111 = class79.field939.method907(-27652);
            }
            long var112 = (long) class79.field939.method916(21933);
            long var114 = (long) class79.field939.method899((byte) 123);
            int var116 = class79.field939.method895((byte) -83);
            int var117 = class79.field939.method916(21933);
            long var118 = (var112 << 32) + var114;
            boolean var120 = false;
            int var121 = 0;
            while (true) {
                if (var121 >= 100) {
                    if (var116 <= 1 && class127.method603(var111, true)) {
                        var120 = true;
                    }
                    break;
                }
                if (class482.field6808[var121] == var118) {
                    var120 = true;
                    break;
                }
                var121++;
            }
            if (!var120 && class349.field5019 == 0) {
                class482.field6808[class34.field418] = var118;
                class34.field418 = (class34.field418 + 1) % 100;
                String var122 = class276.method1683(arg0 + 1123729890, var117).method166(class79.field939, (byte) -106);
                if (var116 == 2) {
                    class476.method2820("<img=1>" + var111, var117, var122, 18, 0, (byte) -92, "<img=1>" + var110, (String) null);
                } else if (var116 == 1) {
                    class476.method2820("<img=0>" + var111, var117, var122, 18, 0, (byte) -93, "<img=0>" + var110, (String) null);
                } else {
                    class476.method2820(var111, var117, var122, 18, 0, (byte) -49, var110, (String) null);
                }
            }
            class233.field3240 = null;
            return true;
        } else if (class233.field3240 == class231.field3200) {
            class331.method2014(0, true);
            class233.field3240 = null;
            return true;
        } else if (class435.field6266 == class233.field3240) {
            for (int var123 = 0; var123 < class46.field596.length; var123++) {
                if (class46.field596[var123] != null) {
                    class46.field596[var123].field2449 = -1;
                }
            }
            for (int var124 = 0; var124 < class448.field6366.length; var124++) {
                if (class448.field6366[var124] != null) {
                    class448.field6366[var124].field2449 = -1;
                }
            }
            class233.field3240 = null;
            return true;
        } else if (class398.field5657 == class233.field3240) {
            int var125 = class79.field939.method916(arg0 ^ 0xBD05C59D);
            int var126 = class79.field939.method895((byte) -127);
            boolean var127 = (var126 & 0x1) == 1;
            while (class361.field5203 > class79.field939.field2206) {
                int var128 = class79.field939.method885(true);
                int var129 = class79.field939.method916(21933);
                int var130 = 0;
                if (var129 != 0) {
                    var130 = class79.field939.method895((byte) -123);
                    if (var130 == 255) {
                        var130 = class79.field939.method939((byte) 117);
                    }
                }
                class388.method2339(var128, (byte) 37, var130, var127, var125, var129 - 1);
            }
            class236.field3266[class444.method2618(class330.field4749++, 31)] = var125;
            class233.field3240 = null;
            return true;
        } else if (class282.field4108 == class233.field3240) {
            int var131 = class79.field939.method916(arg0 + 1123730813);
            if (var131 == 65535) {
                var131 = -1;
            }
            int var132 = class79.field939.method895((byte) -119);
            int var133 = class79.field939.method916(21933);
            int var134 = class79.field939.method895((byte) -72);
            class291.method1831(var133, var131, var132, 123, var134);
            class233.field3240 = null;
            return true;
        } else if (class344.field4928 == class233.field3240) {
            int var135 = class79.field939.method916(21933);
            int var136 = class79.field939.method916(21933);
            int var137 = class79.field939.method908(arg0 + 1123708761);
            if (class226.method1245(var136, arg0 + 1123708969)) {
                class201.method1100(var137, var135, -120);
            }
            class233.field3240 = null;
            return true;
        } else if (class77.field922 == class233.field3240) {
            int var138 = class79.field939.method895((byte) -91);
            if (class79.field939.method895((byte) -89) == 0) {
                class16.field211[var138] = new class329();
            } else {
                class79.field939.field2206--;
                class16.field211[var138] = new class329(class79.field939);
            }
            class233.field3240 = null;
            class122.field1521 = class129.field1601;
            return true;
        } else if (class376.field5361 == class233.field3240) {
            int var139 = class79.field939.method940((byte) 98);
            int var140 = class79.field939.method877(false);
            int var141 = class79.field939.method940((byte) 113);
            class207.field2859[var139] = var140;
            class297.field4434[var139] = var141;
            class88.field1092[var139] = 1;
            int var142 = class162.field1959[var139] - 1;
            for (int var143 = 0; var143 < var142; var143++) {
                if (class67.field841[var143] <= var140) {
                    class88.field1092[var139] = var143 + 2;
                }
            }
            class224.field3111[class444.method2618(31, class189.field2593++)] = var139;
            class233.field3240 = null;
            return true;
        } else if (class233.field3240 == class131.field1602) {
            class168.method820(class79.field939.method907(-27652), true);
            class233.field3240 = null;
            return true;
        } else if (class273.field3874 == class233.field3240) {
            class311.method1925(58, class108.field1303);
            class233.field3240 = null;
            return true;
        } else if (class233.field3240 == class199.field2764) {
            class311.method1925(93, class41.field496);
            class233.field3240 = null;
            return true;
        } else if (class298.field4456 == class233.field3240) {
            class311.method1925(72, class67.field840);
            class233.field3240 = null;
            return true;
        } else if (class233.field3240 == class144.field1739) {
            int var144 = class79.field939.method930(255);
            if (var144 == 65535) {
                var144 = -1;
            }
            int var145 = class79.field939.method877(false);
            int var146 = var145 >> 28 & 0x3;
            int var147 = var145 >> 14 & 0x3FFF;
            int var148 = var145 & 0x3FFF;
            int var149 = class79.field939.method895((byte) -101);
            int var150 = var149 >> 2;
            int var151 = var149 & 0x3;
            int var152 = var148 - class349.field5023;
            int var153 = var147 - class93.field1163;
            int var154 = class270.field3870[var150];
            class135.method640(var153, var144, var154, var151, var146, var150, var152, (byte) -94);
            class233.field3240 = null;
            return true;
        } else if (class233.field3240 == class115.field1415) {
            int var155 = class79.field939.method883(90);
            if (var155 == 65535) {
                var155 = -1;
            }
            int var156 = class79.field939.method877(false);
            int var157 = class79.field939.method930(arg0 + 1123709135);
            if (class226.method1245(var157, 60)) {
                class229.method1269((byte) 108, var155, var156);
            }
            class233.field3240 = null;
            return true;
        } else if (class438.field6279 == class233.field3240) {
            int var158 = class79.field939.method877(false);
            int var159 = class79.field939.method882((byte) -125);
            class75.field909.method2715(var159, var158, arg0 + 1123708902);
            class233.field3240 = null;
            return true;
        } else if (class44.field562 == class233.field3240) {
            int var160 = class79.field939.method883(81);
            int var161 = class79.field939.method908(-121);
            int var162 = class79.field939.method930(arg0 ^ 0xBD0590CF);
            int var163 = class79.field939.method916(21933);
            if (class226.method1245(var160, 91)) {
                class206.method1140(-21759, (var163 << 16) + var162, var161);
            }
            class233.field3240 = null;
            return true;
        } else if (class362.field5215 == class233.field3240) {
            int var164 = class79.field939.method877(false);
            int var165 = class79.field939.method883(94);
            String var166 = class79.field939.method907(-27652);
            if (class226.method1245(var165, arg0 ^ 0xBD059000)) {
                class257.method1584(var166, (byte) -20, var164);
            }
            class233.field3240 = null;
            return true;
        } else if (class424.field6110 == class233.field3240) {
            int var167 = class79.field939.method930(255);
            int var168 = class79.field939.method908(-120);
            if (class226.method1245(var167, arg0 ^ 0xBD059048)) {
                class179.method902(0, var168, 16919, 5, class61.field760);
            }
            class233.field3240 = null;
            return true;
        } else if (class263.field3799 == class233.field3240) {
            class148.field1794 = class79.field939.method895((byte) -74);
            class382.field5413 = class79.field939.method896(arg0 + 1123721969);
            class39.field468 = class79.field939.method895((byte) -104);
            class233.field3240 = null;
            return true;
        } else if (class292.field4341 == class233.field3240) {
            if (class57.field725 != -1) {
                class340.method2065(0, 0, class57.field725);
            }
            class233.field3240 = null;
            return true;
        } else if (arg0 != -1123708880) {
            return true;
        } else if (class233.field3240 == class198.field2713) {
            int var169 = class79.field939.method882((byte) -114);
            int var170 = class79.field939.method882((byte) -128);
            int var171 = class79.field939.method916(21933);
            if (class226.method1245(var169, 55)) {
                class148.method707(var171, var170, 0, 2752);
            }
            class233.field3240 = null;
            return true;
        } else if (class34.field416 == class233.field3240) {
            class414.field5907 = class79.field939.method895((byte) -104);
            for (int var172 = 0; var172 < class414.field5907; var172++) {
                class293.field4361[var172] = class79.field939.method907(-27652);
                class283.field4121[var172] = class79.field939.method907(-27652);
                if (class283.field4121[var172].equals("")) {
                    class283.field4121[var172] = class293.field4361[var172];
                }
                class66.field824[var172] = class79.field939.method907(class293.method1843(arg0, 1123681228));
                class308.field4526[var172] = class79.field939.method907(-27652);
                if (class308.field4526[var172].equals("")) {
                    class308.field4526[var172] = class66.field824[var172];
                }
                class105.field1283[var172] = false;
            }
            class233.field3240 = null;
            class205.field2807 = class129.field1601;
            return true;
        } else if (class468.field6576 == class233.field3240) {
            class346.method2096(class361.field5203, class42.field512, class79.field939, -76);
            class233.field3240 = null;
            return true;
        } else if (class261.field3757 == class233.field3240) {
            int var173 = class79.field939.method930(255);
            int var174 = class79.field939.method923(-127);
            int var175 = class79.field939.method877(false);
            int var176 = class79.field939.method882((byte) -126);
            if (class226.method1245(var173, 76)) {
                class179.method902(var174, var175, 16919, 5, var176);
            }
            class233.field3240 = null;
            return true;
        } else if (class368.field5262 == class233.field3240) {
            boolean var177 = class79.field939.method895((byte) -124) == 1;
            String var178 = class79.field939.method907(-27652);
            String var179 = var178;
            if (var177) {
                var179 = class79.field939.method907(-27652);
            }
            long var180 = class79.field939.method903(-699358864);
            long var182 = (long) class79.field939.method916(21933);
            long var184 = (long) class79.field939.method899((byte) -124);
            int var186 = class79.field939.method895((byte) -123);
            int var187 = class79.field939.method916(21933);
            long var188 = (var182 << 32) + var184;
            boolean var190 = false;
            int var191 = 0;
            while (true) {
                if (var191 >= 100) {
                    if (var186 <= 1 && class127.method603(var179, true)) {
                        var190 = true;
                    }
                    break;
                }
                if (class482.field6808[var191] == var188) {
                    var190 = true;
                    break;
                }
                var191++;
            }
            if (!var190 && class349.field5019 == 0) {
                class482.field6808[class34.field418] = var188;
                class34.field418 = (class34.field418 + 1) % 100;
                String var192 = class276.method1683(21010, var187).method166(class79.field939, (byte) -90);
                if (var186 == 2) {
                    class476.method2820("<img=1>" + var179, var187, var192, 20, 0, (byte) -61, "<img=1>" + var178, class63.method323(var180, -45));
                } else if (var186 == 1) {
                    class476.method2820("<img=0>" + var179, var187, var192, 20, 0, (byte) -128, "<img=0>" + var178, class63.method323(var180, -48));
                } else {
                    class476.method2820(var179, var187, var192, 20, 0, (byte) -89, var178, class63.method323(var180, -119));
                }
            }
            class233.field3240 = null;
            return true;
        } else if (class397.field5640 == class233.field3240) {
            class311.method1925(95, class340.field4884);
            class233.field3240 = null;
            return true;
        } else if (class471.field6640 == class233.field3240) {
            class100.method491((byte) 123);
            class233.field3240 = null;
            return false;
        } else if (class233.field3240 == class19.field248) {
            int var193 = class79.field939.method883(126);
            String var194 = class79.field939.method907(-27652);
            int var195 = class79.field939.method882((byte) -124);
            if (class226.method1245(var193, 113)) {
                class388.method2341(false, var195, var194);
            }
            class233.field3240 = null;
            return true;
        } else if (class89.field1101 == class233.field3240) {
            class300.field4465 = class79.field939.method895((byte) -98);
            class205.field2807 = class129.field1601;
            class233.field3240 = null;
            return true;
        } else if (class287.field4297 == class233.field3240) {
            class311.method1925(65, class418.field6015);
            class233.field3240 = null;
            return true;
        } else if (class298.field4458 == class233.field3240) {
            int var196 = class79.field939.method916(21933);
            String var197 = class79.field939.method907(-27652);
            int var198 = class79.field939.method883(94);
            if (class226.method1245(var198, 107)) {
                class388.method2341(false, var196, var197);
            }
            class233.field3240 = null;
            return true;
        } else if (class335.field4829 == class233.field3240) {
            class226.field3139 = class79.field939.method895((byte) -116);
            class145.field1756 = class79.field939.method895((byte) -82);
            class147.field1781 = class79.field939.method895((byte) -127);
            for (class173 var199 = (class173) class76.field913.method241(0); var199 != null; var199 = (class173) class76.field913.method239(0)) {
                int var201 = (int) (var199.field1776 & 0x3FFFL);
                int var202 = (int) (var199.field1776 >> 14 & 0x3FFFL);
                int var203 = (int) (var199.field1776 >> 28 & 0x3L);
                if (class147.field1781 == var203 && class145.field1756 <= var201 && class145.field1756 + 8 > var201 && class226.field3139 <= var202 && (class226.field3139 + 8) > var202) {
                    var199.method702((byte) -114);
                    class159.method768(class147.field1781, var202, var201, false);
                }
            }
            for (class41 var200 = (class41) class56.field712.method802((byte) 103); var200 != null; var200 = (class41) class56.field712.method806((byte) 104)) {
                if (var200.field495 >= class145.field1756 && var200.field495 < (class145.field1756 + 8) && class226.field3139 <= var200.field490 && var200.field490 < class226.field3139 + 8 && class147.field1781 == var200.field488) {
                    var200.field497 = 0;
                }
            }
            class233.field3240 = null;
            return true;
        } else if (class233.field3240 == class115.field1421) {
            class311.method1925(115, class210.field2920);
            class233.field3240 = null;
            return true;
        } else if (class312.field4558 == class233.field3240) {
            String var204 = class79.field939.method907(arg0 ^ 0x42FA03CC);
            int var205 = class79.field939.method916(21933);
            String var206 = class276.method1683(arg0 ^ 0xBD05C222, var205).method166(class79.field939, (byte) -103);
            class476.method2820(var204, var205, var206, 19, 0, (byte) -56, var204, (String) null);
            class233.field3240 = null;
            return true;
        } else if (class403.field5723 == class233.field3240) {
            int var207 = class79.field939.method930(255);
            int var208 = class79.field939.method883(arg0 ^ 0xBD059059);
            int var209 = class79.field939.method882((byte) -117);
            int var210 = class79.field939.method930(arg0 + 1123709135);
            int var211 = class79.field939.method877(false);
            if (class226.method1245(var208, 62)) {
                class179.method902(var210, var211, 16919, 7, var209 | var207 << 16);
            }
            class233.field3240 = null;
            return true;
        } else if (class233.field3240 == class112.field1371) {
            int var212 = class79.field939.method916(21933);
            int var213 = class79.field939.method895((byte) -106);
            int var214 = class79.field939.method895((byte) -122);
            int var215 = class79.field939.method916(21933);
            int var216 = class79.field939.method895((byte) -115);
            int var217 = class79.field939.method895((byte) -111);
            if (class226.method1245(var212, 111)) {
                class479.method2834(var217, false, true, var216, var213, var215, var214);
            }
            class233.field3240 = null;
            return true;
        } else if (class233.field3240 == class154.field1853) {
            class28.field366 = class79.field939.method916(21933) * 30;
            class233.field3240 = null;
            class360.field5190 = class129.field1601;
            return true;
        } else if (class233.field3240 == class120.field1491) {
            int var218 = class79.field939.method916(arg0 ^ 0xBD05C59D);
            String var219 = class79.field939.method907(arg0 + 1123681228);
            Object[] var220 = new Object[var219.length() + 1];
            for (int var221 = var219.length() - 1; var221 >= 0; var221--) {
                if (var219.charAt(var221) == 's') {
                    var220[var221 + 1] = class79.field939.method907(arg0 + 1123681228);
                } else {
                    var220[var221 + 1] = Integer.valueOf(class79.field939.method939((byte) -81));
                }
            }
            var220[0] = Integer.valueOf(class79.field939.method939((byte) 91));
            if (class226.method1245(var218, arg0 + 1123708995)) {
                class35 var222 = new class35();
                var222.field435 = var220;
                class396.method2371(var222);
            }
            class233.field3240 = null;
            return true;
        } else if (class233.field3240 == class138.field1667) {
            class42.field514 = class79.field939.method906(arg0 + 1123708857);
            class233.field3240 = null;
            class360.field5190 = class129.field1601;
            return true;
        } else if (class485.field6879 == class233.field3240) {
            int var223 = class79.field939.method916(21933);
            int var224 = class79.field939.method895((byte) -118);
            int var225 = class79.field939.method895((byte) -88);
            int var226 = class79.field939.method895((byte) -89);
            int var227 = class79.field939.method895((byte) -107);
            int var228 = class79.field939.method916(21933);
            if (class226.method1245(var223, 63)) {
                class141.field1696[var224] = true;
                class240.field3302[var224] = var225;
                class329.field4742[var224] = var226;
                class110.field1349[var224] = var227;
                class293.field4350[var224] = var228;
            }
            class233.field3240 = null;
            return true;
        } else if (class357.field5163 == class233.field3240) {
            int var229 = class79.field939.method896(13089);
            int var230 = class79.field939.method883(arg0 + 1123708975);
            if (class226.method1245(var230, 49)) {
                class173.field2081 = var229;
            }
            class233.field3240 = null;
            return true;
        } else if (class82.field982 == class233.field3240) {
            int var231 = class79.field939.method923(arg0 + 1123708755);
            int var232 = class79.field939.method916(arg0 ^ 0xBD05C59D);
            if (class226.method1245(var232, 64)) {
                class179.method902(-1, var231, 16919, 3, -1);
            }
            class233.field3240 = null;
            return true;
        } else if (class233.field3240 == class231.field3191) {
            class145.field1756 = class79.field939.method896(13089);
            class226.field3139 = class79.field939.method886((byte) -94);
            class147.field1781 = class79.field939.method940((byte) 55);
            class233.field3240 = null;
            return true;
        } else if (class233.field3240 == class208.field2874) {
            int var233 = class79.field939.method908(-125);
            int var234 = class79.field939.method877(false);
            int var235 = class79.field939.method883(74);
            if (class226.method1245(var235, arg0 ^ 0xBD059069)) {
                class68 var236 = (class68) class369.field5270.method233(arg0 ^ 0xBD059071, (long) var233);
                class68 var237 = (class68) class369.field5270.method233(114, (long) var234);
                if (var237 != null) {
                    class259.method1590(var237, false, -364, var236 == null || var236.field850 != var237.field850);
                }
                if (var236 != null) {
                    var236.method702((byte) -114);
                    class369.field5270.method234(-114, (long) var234, var236);
                }
                class256 var238 = class399.method2387(var233, arg0 - 733458144);
                if (var238 != null) {
                    class398.method2383(var238, 27);
                }
                class256 var239 = class399.method2387(var234, -1857167024);
                if (var239 != null) {
                    class398.method2383(var239, 102);
                    class442.method2608(var239, -75, true);
                }
                if (class57.field725 != -1) {
                    class340.method2065(0, 1, class57.field725);
                }
            }
            class233.field3240 = null;
            return true;
        } else if (class367.field5250 == class233.field3240) {
            class331.method2014(0, false);
            class233.field3240 = null;
            return true;
        } else if (class361.field5204 == class233.field3240) {
            boolean var240 = class79.field939.method895((byte) -112) == 1;
            String var241 = class79.field939.method907(-27652);
            String var242 = class79.field939.method907(-27652);
            int var243 = class79.field939.method916(21933);
            int var244 = class79.field939.method895((byte) -123);
            String var245 = "";
            boolean var246 = false;
            if (var243 > 0) {
                var245 = class79.field939.method907(-27652);
                var246 = class79.field939.method895((byte) -109) == 1;
            }
            for (int var247 = 0; var247 < class3.field25; var247++) {
                if (var240) {
                    if (var242.equals(class150.field1823[var247])) {
                        class150.field1823[var247] = var241;
                        class373.field5335[var247] = var242;
                        var241 = null;
                        break;
                    }
                } else if (var241.equals(class150.field1823[var247])) {
                    if (class148.field1800[var247] != var243) {
                        class148.field1800[var247] = var243;
                        if (var243 > 0) {
                            class231.method1278(5, "", -26526, 0, "", var241 + class192.field2644.method205((byte) 99, class68.field849));
                        }
                        if (var243 == 0) {
                            class231.method1278(5, "", -26526, 0, "", var241 + class406.field5776.method205((byte) 109, class68.field849));
                        }
                    }
                    class373.field5335[var247] = var242;
                    class346.field4939[var247] = var245;
                    class388.field5546[var247] = var244;
                    class311.field4556[var247] = var246;
                    var241 = null;
                    break;
                }
            }
            if (var241 != null && class3.field25 < 200) {
                class150.field1823[class3.field25] = var241;
                class373.field5335[class3.field25] = var242;
                class148.field1800[class3.field25] = var243;
                class346.field4939[class3.field25] = var245;
                class388.field5546[class3.field25] = var244;
                class311.field4556[class3.field25] = var246;
                class3.field25++;
            }
            class205.field2807 = class129.field1601;
            boolean var248 = false;
            int var249 = class3.field25;
            while (var249 > 0) {
                var249--;
                boolean var250 = true;
                for (int var251 = 0; var251 < var249; var251++) {
                    if (class148.field1800[var251] != class232.field3220 && class148.field1800[var251 + 1] == class232.field3220 || class148.field1800[var251] == 0 && class148.field1800[var251 + 1] != 0) {
                        int var252 = class148.field1800[var251];
                        class148.field1800[var251] = class148.field1800[var251 + 1];
                        class148.field1800[var251 + 1] = var252;
                        String var253 = class346.field4939[var251];
                        class346.field4939[var251] = class346.field4939[var251 + 1];
                        class346.field4939[var251 + 1] = var253;
                        String var254 = class150.field1823[var251];
                        class150.field1823[var251] = class150.field1823[var251 + 1];
                        class150.field1823[var251 + 1] = var254;
                        String var255 = class373.field5335[var251];
                        class373.field5335[var251] = class373.field5335[var251 + 1];
                        class373.field5335[var251 + 1] = var255;
                        int var256 = class388.field5546[var251];
                        class388.field5546[var251] = class388.field5546[var251 + 1];
                        class388.field5546[var251 + 1] = var256;
                        boolean var257 = class311.field4556[var251];
                        class311.field4556[var251] = class311.field4556[var251 + 1];
                        class311.field4556[var251 + 1] = var257;
                        var250 = false;
                    }
                }
                if (var250) {
                    break;
                }
            }
            class233.field3240 = null;
            return true;
        } else if (class322.field4661 == class233.field3240) {
            int var258 = class79.field939.method923(-124);
            int var259 = class79.field939.method882((byte) -124);
            int var260 = class79.field939.method882((byte) -122);
            if (class226.method1245(var259, arg0 ^ 0xBD059079)) {
                class141.method665(var258, var260, (byte) -48);
            }
            class233.field3240 = null;
            return true;
        } else if (class67.field838 == class233.field3240) {
            int var261 = class79.field939.method939((byte) -89);
            int var262 = class79.field939.method883(96);
            int var263 = class79.field939.method930(255);
            int var264 = class79.field939.method883(arg0 + 1123708960);
            int var265 = class79.field939.method883(arg0 ^ 0xBD05904B);
            if (class226.method1245(var265, 126)) {
                class464.method2732(var264, (byte) 110, var263, var261, var262);
            }
            class233.field3240 = null;
            return true;
        } else if (class464.field6534 == class233.field3240) {
            String var266 = class79.field939.method907(-27652);
            boolean var267 = class79.field939.method895((byte) -86) == 1;
            String var268;
            if (var267) {
                var268 = class79.field939.method907(-27652);
            } else {
                var268 = var266;
            }
            int var269 = class79.field939.method916(21933);
            byte var270 = class79.field939.method922(32429);
            boolean var271 = false;
            if (var270 == -128) {
                var271 = true;
            }
            if (var271) {
                if (class13.field187 == 0) {
                    class233.field3240 = null;
                    return true;
                }
                boolean var277 = false;
                int var278;
                for (var278 = 0; class13.field187 > var278 && (!class372.field5331[var278].field3500.equals(var268) || class372.field5331[var278].field3495 != var269); var278++) {
                }
                if (var278 < class13.field187) {
                    while (class13.field187 - 1 > var278) {
                        class372.field5331[var278] = class372.field5331[var278 + 1];
                        var278++;
                    }
                    class13.field187--;
                    class372.field5331[class13.field187] = null;
                }
            } else {
                String var272 = class79.field939.method907(-27652);
                class249 var273 = new class249();
                var273.field3500 = var268;
                var273.field3497 = var266;
                var273.field3493 = class360.method2193(-105, var273.field3500);
                var273.field3495 = var269;
                var273.field3494 = var270;
                var273.field3496 = var272;
                int var274;
                for (var274 = class13.field187 - 1; var274 >= 0; var274--) {
                    int var275 = class372.field5331[var274].field3493.compareTo(var273.field3493);
                    if (var275 == 0) {
                        class372.field5331[var274].field3495 = var269;
                        class372.field5331[var274].field3494 = var270;
                        class372.field5331[var274].field3496 = var272;
                        if (var268.equals(class19.field258.field2736)) {
                            class468.field6580 = var270;
                        }
                        class430.field6227 = class129.field1601;
                        class233.field3240 = null;
                        return true;
                    }
                    if (var275 < 0) {
                        break;
                    }
                }
                if (class13.field187 >= class372.field5331.length) {
                    class233.field3240 = null;
                    return true;
                }
                for (int var276 = class13.field187 - 1; var276 > var274; var276--) {
                    class372.field5331[var276 + 1] = class372.field5331[var276];
                }
                if (class13.field187 == 0) {
                    class372.field5331 = new class249[100];
                }
                class372.field5331[var274 + 1] = var273;
                class13.field187++;
                if (var268.equals(class19.field258.field2736)) {
                    class468.field6580 = var270;
                }
            }
            class430.field6227 = class129.field1601;
            class233.field3240 = null;
            return true;
        } else if (class233.field3240 == class178.field2156) {
            class311.method1925(arg0 ^ 0xBD059061, class357.field5134);
            class233.field3240 = null;
            return true;
        } else if (class233.field3240 == class108.field1300) {
            class73.field890 = class79.field939.method895((byte) -115);
            class233.field3240 = null;
            return true;
        } else if (class358.field5168 == class233.field3240) {
            int var279 = class79.field939.method916(arg0 + 1123730813);
            int var280 = class79.field939.method886((byte) 114);
            class75.field909.method2713(var280, arg0 + 1123709001, var279);
            class233.field3240 = null;
            return true;
        } else if (class323.field4662 == class233.field3240) {
            class311.method1925(72, class409.field5797);
            class233.field3240 = null;
            return true;
        } else if (class233.field3240 == class227.field3153) {
            int var281 = class79.field939.method895((byte) -80);
            int var282 = var281 >> 5;
            int var283 = var281 & 0x1F;
            if (var283 == 0) {
                class251.field3525[var282] = null;
                class233.field3240 = null;
                return true;
            }
            class231 var284 = new class231();
            var284.field3198 = var283;
            var284.field3193 = class79.field939.method895((byte) -97);
            if (var284.field3193 >= 0 && class63.field794.length > var284.field3193) {
                if (var284.field3198 == 1 || var284.field3198 == 10) {
                    var284.field3192 = class79.field939.method916(arg0 ^ 0xBD05C59D);
                    class79.field939.field2206 += 6;
                } else if (var284.field3198 >= 2 && var284.field3198 <= 6) {
                    if (var284.field3198 == 2) {
                        var284.field3188 = 64;
                        var284.field3196 = 64;
                    }
                    if (var284.field3198 == 3) {
                        var284.field3196 = 0;
                        var284.field3188 = 64;
                    }
                    if (var284.field3198 == 4) {
                        var284.field3188 = 64;
                        var284.field3196 = 128;
                    }
                    if (var284.field3198 == 5) {
                        var284.field3196 = 64;
                        var284.field3188 = 0;
                    }
                    if (var284.field3198 == 6) {
                        var284.field3196 = 64;
                        var284.field3188 = 128;
                    }
                    var284.field3198 = 2;
                    var284.field3189 = class79.field939.method895((byte) -82);
                    var284.field3195 = class79.field939.method916(arg0 ^ 0xBD05C59D);
                    var284.field3194 = class79.field939.method916(21933);
                    var284.field3201 = class79.field939.method895((byte) -122);
                    var284.field3202 = class79.field939.method916(21933);
                }
                var284.field3190 = class79.field939.method916(21933);
                if (var284.field3190 == 65535) {
                    var284.field3190 = -1;
                }
                class251.field3525[var282] = var284;
            }
            class233.field3240 = null;
            return true;
        } else if (class361.field5201 == class233.field3240) {
            int var285 = class79.field939.method877(false);
            int var286 = class79.field939.method883(71);
            int var287 = class79.field939.method916(21933);
            if (class226.method1245(var286, 125)) {
                class331.method2003(var287, -1977337177, var285);
            }
            class233.field3240 = null;
            return true;
        } else if (class41.field499 == class233.field3240) {
            class430.field6227 = class129.field1601;
            if (class361.field5203 == 0) {
                class13.field187 = 0;
                class381.field5399 = null;
                class372.field5331 = null;
                class233.field3240 = null;
                class241.field3315 = null;
                return true;
            }
            class381.field5399 = class79.field939.method907(-27652);
            boolean var288 = class79.field939.method895((byte) -120) == 1;
            if (var288) {
                class79.field939.method907(-27652);
            }
            long var289 = class79.field939.method903(arg0 + 424350016);
            class241.field3315 = class110.method526(var289, false);
            class237.field3272 = class79.field939.method922(32429);
            int var291 = class79.field939.method895((byte) -115);
            if (var291 == 255) {
                class233.field3240 = null;
                return true;
            }
            class13.field187 = var291;
            class249[] var292 = new class249[100];
            for (int var293 = 0; var293 < class13.field187; var293++) {
                var292[var293] = new class249();
                var292[var293].field3497 = class79.field939.method907(-27652);
                boolean var299 = class79.field939.method895((byte) -94) == 1;
                if (var299) {
                    var292[var293].field3500 = class79.field939.method907(arg0 ^ 0x42FA03CC);
                } else {
                    var292[var293].field3500 = var292[var293].field3497;
                }
                var292[var293].field3493 = class360.method2193(-59, var292[var293].field3500);
                var292[var293].field3495 = class79.field939.method916(21933);
                var292[var293].field3494 = class79.field939.method922(32429);
                var292[var293].field3496 = class79.field939.method907(arg0 + 1123681228);
                if (var292[var293].field3500.equals(class19.field258.field2736)) {
                    class468.field6580 = var292[var293].field3494;
                }
            }
            boolean var294 = false;
            int var295 = class13.field187;
            while (var295 > 0) {
                boolean var296 = true;
                var295--;
                for (int var297 = 0; var297 < var295; var297++) {
                    if (var292[var297].field3493.compareTo(var292[var297 + 1].field3493) > 0) {
                        class249 var298 = var292[var297];
                        var292[var297] = var292[var297 + 1];
                        var296 = false;
                        var292[var297 + 1] = var298;
                    }
                }
                if (var296) {
                    break;
                }
            }
            class372.field5331 = var292;
            class233.field3240 = null;
            return true;
        } else if (class482.field6810 == class233.field3240) {
            class75.field909.method2717(26);
            class217.field3011 += 32;
            class233.field3240 = null;
            return true;
        } else if (class236.field3261 == class233.field3240) {
            class478.method2827(-30362, false);
            class233.field3240 = null;
            return false;
        } else if (class276.field3951 == class233.field3240) {
            int var300 = class79.field939.method916(21933);
            if (class226.method1245(var300, arg0 ^ 0xBD05904A)) {
                class159.method766(16707);
            }
            class233.field3240 = null;
            return true;
        } else if (class403.field5735 == class233.field3240) {
            int var301 = class79.field939.method916(21933);
            int var302 = class79.field939.method939((byte) -82);
            if (class226.method1245(var301, arg0 + 1123708999)) {
                class68 var303 = (class68) class369.field5270.method233(-95, (long) var302);
                if (var303 != null) {
                    class259.method1590(var303, false, -364, true);
                }
                if (class345.field4934 != null) {
                    class398.method2383(class345.field4934, 55);
                    class345.field4934 = null;
                }
            }
            class233.field3240 = null;
            return true;
        } else if (class233.field3240 == class201.field2786) {
            class255.field3551 = class79.field939.method895((byte) -98);
            class233.field3240 = null;
            class360.field5190 = class129.field1601;
            return true;
        } else if (class421.field6078 == class233.field3240) {
            int var304 = class79.field939.method885(true);
            int var305 = class79.field939.method939((byte) 42);
            int var306 = class79.field939.method895((byte) -76);
            String var307 = "";
            String var308 = var307;
            if ((var306 & 0x1) != 0) {
                var307 = class79.field939.method907(-27652);
                if ((var306 & 0x2) == 0) {
                    var308 = var307;
                } else {
                    var308 = class79.field939.method907(arg0 + 1123681228);
                }
            }
            String var309 = class79.field939.method907(-27652);
            if (var304 == 99) {
                class486.method2871(true, var309);
            } else if (var308.equals("") || !class127.method603(var308, true)) {
                class231.method1278(var304, var308, -26526, var305, var307, var309);
            } else {
                class233.field3240 = null;
                return true;
            }
            class233.field3240 = null;
            return true;
        } else if (class422.field6087 == class233.field3240) {
            byte var310 = class79.field939.method922(arg0 ^ 0xBD05EE9D);
            int var311 = class79.field939.method916(21933);
            class75.field909.method2715(var311, var310, 22);
            class233.field3240 = null;
            return true;
        } else if (class233.field3240 == class200.field2782) {
            String var312 = class79.field939.method907(arg0 ^ 0x42FA03CC);
            String var313 = class131.method623(60, class427.method2549(arg0 + 1123708880, class171.method839((byte) 23, class79.field939)));
            class231.method1278(6, var312, arg0 + 1123682354, 0, var312, var313);
            class233.field3240 = null;
            return true;
        } else if (class233.field3240 == class2.field7) {
            boolean var314 = class79.field939.method895((byte) -102) == 1;
            String var315 = class79.field939.method907(-27652);
            String var316 = var315;
            if (var314) {
                var316 = class79.field939.method907(-27652);
            }
            long var317 = (long) class79.field939.method916(21933);
            long var319 = (long) class79.field939.method899((byte) -124);
            int var321 = class79.field939.method895((byte) -115);
            long var322 = (var317 << 32) + var319;
            boolean var324 = false;
            int var325 = 0;
            while (true) {
                if (var325 >= 100) {
                    if (var321 <= 1) {
                        if (!(!class456.field6432 || class10.field133) || class392.field5586) {
                            var324 = true;
                        } else if (class127.method603(var316, true)) {
                            var324 = true;
                        }
                    }
                    break;
                }
                if (class482.field6808[var325] == var322) {
                    var324 = true;
                    break;
                }
                var325++;
            }
            if (!var324 && class349.field5019 == 0) {
                class482.field6808[class34.field418] = var322;
                class34.field418 = (class34.field418 + 1) % 100;
                String var326 = class131.method623(60, class427.method2549(arg0 ^ 0xBD059030, class171.method839((byte) 23, class79.field939)));
                if (var321 == 2) {
                    class476.method2820("<img=1>" + var316, -1, var326, 7, 0, (byte) -80, "<img=1>" + var315, (String) null);
                } else if (var321 == 1) {
                    class476.method2820("<img=0>" + var316, -1, var326, 7, 0, (byte) -120, "<img=0>" + var315, (String) null);
                } else {
                    class476.method2820(var316, -1, var326, 3, 0, (byte) -52, var315, (String) null);
                }
            }
            class233.field3240 = null;
            return true;
        } else if (class233.field3240 == class18.field226) {
            class311.method1925(117, class239.field3297);
            class233.field3240 = null;
            return true;
        } else if (class304.field4490 == class233.field3240) {
            class311.method1925(110, class193.field2649);
            class233.field3240 = null;
            return true;
        } else if (class457.field6439 == class233.field3240) {
            boolean var327 = class79.field939.method895((byte) -120) == 1;
            String var328 = class79.field939.method907(-27652);
            String var329 = var328;
            if (var327) {
                var329 = class79.field939.method907(-27652);
            }
            long var330 = class79.field939.method903(-699358864);
            long var332 = (long) class79.field939.method916(21933);
            long var334 = (long) class79.field939.method899((byte) -120);
            int var336 = class79.field939.method895((byte) -128);
            long var337 = (var332 << 32) + var334;
            boolean var339 = false;
            int var340 = 0;
            while (true) {
                if (var340 >= 100) {
                    if (var336 <= 1) {
                        if (!(!class456.field6432 || class10.field133) || class392.field5586) {
                            var339 = true;
                        } else if (class127.method603(var329, true)) {
                            var339 = true;
                        }
                    }
                    break;
                }
                if (class482.field6808[var340] == var337) {
                    var339 = true;
                    break;
                }
                var340++;
            }
            if (!var339 && class349.field5019 == 0) {
                class482.field6808[class34.field418] = var337;
                class34.field418 = (class34.field418 + 1) % 100;
                String var341 = class131.method623(60, class427.method2549(0, class171.method839((byte) 23, class79.field939)));
                if (var336 == 2 || var336 == 3) {
                    class476.method2820("<img=1>" + var329, -1, var341, 9, 0, (byte) -47, "<img=1>" + var328, class63.method323(var330, arg0 ^ 0x42FA6FC0));
                } else if (var336 == 1) {
                    class476.method2820("<img=0>" + var329, -1, var341, 9, 0, (byte) -41, "<img=0>" + var328, class63.method323(var330, -51));
                } else {
                    class476.method2820(var329, -1, var341, 9, 0, (byte) -125, var328, class63.method323(var330, arg0 + 1123708774));
                }
            }
            class233.field3240 = null;
            return true;
        } else if (class273.field3872 == class233.field3240) {
            if (class348.field4961 != null) {
                class445.method2620(-1, class262.field3766, false, -4, -1);
            }
            byte[] var342 = new byte[class361.field5203];
            class79.field939.method2004(var342, class361.field5203, 0, true);
            String var343 = class442.method2611(class361.field5203, var342, -1638480020, 0);
            class290.method1827(class375.field5347 == 1, var343, arg0 + 1123708881, class42.field512, true);
            class233.field3240 = null;
            return true;
        } else if (client.field3941 == class233.field3240) {
            int var344 = class79.field939.method883(99);
            int var345 = class79.field939.method930(255);
            int var346 = class79.field939.method883(100);
            int var347 = class79.field939.method908(arg0 ^ 0x42FA6FB4);
            if (var347 >> 30 != 0) {
                int var348 = var347 >> 28 & 0x3;
                int var349 = (var347 >> 14 & 0x3FFF) - class93.field1163;
                int var350 = (var347 & 0x3FFF) - class349.field5023;
                if (var349 >= 0 && var350 >= 0 && var349 < class159.field1895 && var350 < class289.field4316) {
                    int var351 = var349 * 128 + 64;
                    int var352 = var350 * 128 + 64;
                    class459 var353 = new class459(var344, 0, class204.field2796, var348, var351, class375.method2264(-1547, var352, var348, var351) - var346, var352, var349, var349, var350, var350);
                    class361.field5198.method803(new class371(var353), 50);
                }
            } else if ((var347 >> 29) != 0) {
                int var354 = var347 & 0xFFFF;
                class137 var355 = class448.field6366[var354];
                if (var355 != null) {
                    if (var344 == 65535) {
                        var344 = -1;
                    }
                    boolean var356 = true;
                    if (var344 != -1 && var355.field2485 != -1) {
                        if (var355.field2485 == var344) {
                            class12 var357 = class234.field3258.method2456(var344, arg0 + 1123709480);
                            if (var357.field164 && var357.field178 != -1) {
                                class207 var358 = class175.field2103.method1267(-77, var357.field178);
                                int var359 = var358.field2848;
                                if (var359 == 0 || var359 == 2) {
                                    var356 = false;
                                } else if (var359 == 1) {
                                    var356 = true;
                                }
                            }
                        } else {
                            class12 var360 = class234.field3258.method2456(var344, 600);
                            class12 var361 = class234.field3258.method2456(var355.field2485, arg0 ^ 0xBD059268);
                            if (var360.field178 != -1 && var361.field178 != -1) {
                                class207 var362 = class175.field2103.method1267(arg0 + 1123708852, var360.field178);
                                class207 var363 = class175.field2103.method1267(-52, var361.field178);
                                if (var363.field2860 > var362.field2860) {
                                    var356 = false;
                                }
                            }
                        }
                    }
                    if (var356) {
                        var355.field2516 = var346;
                        var355.field2478 = 0;
                        var355.field2494 = 0;
                        var355.field2477 = class204.field2796 + var345;
                        var355.field2447 = 1;
                        var355.field2485 = var344;
                        if (var355.field2477 > class204.field2796) {
                            var355.field2494 = -1;
                        }
                        if (var355.field2485 != -1 && class204.field2796 == var355.field2477) {
                            int var364 = class234.field3258.method2456(var355.field2485, 600).field178;
                            if (var364 != -1) {
                                class207 var365 = class175.field2103.method1267(-85, var364);
                                if (var365 != null && var365.field2853 != null) {
                                    class126.method602(var365, false, var355.field1008, 0, var355.field1005, false, var355.field994);
                                }
                            }
                        }
                    }
                }
            } else if ((var347 >> 28) != 0) {
                int var366 = var347 & 0xFFFF;
                class198 var367;
                if (class61.field760 == var366) {
                    var367 = class19.field258;
                } else {
                    var367 = class46.field596[var366];
                }
                if (var367 != null) {
                    if (var344 == 65535) {
                        var344 = -1;
                    }
                    boolean var368 = true;
                    if (var344 != -1 && var367.field2485 != -1) {
                        if (var367.field2485 == var344) {
                            class12 var373 = class234.field3258.method2456(var344, 600);
                            if (var373.field164 && var373.field178 != -1) {
                                class207 var374 = class175.field2103.method1267(arg0 ^ 0x42FA6F82, var373.field178);
                                int var375 = var374.field2848;
                                if (var375 == 0 || var375 == 2) {
                                    var368 = false;
                                } else if (var375 == 1) {
                                    var368 = true;
                                }
                            }
                        } else {
                            class12 var369 = class234.field3258.method2456(var344, arg0 ^ 0xBD059268);
                            class12 var370 = class234.field3258.method2456(var367.field2485, 600);
                            if (var369.field178 != -1 && var370.field178 != -1) {
                                class207 var371 = class175.field2103.method1267(-97, var369.field178);
                                class207 var372 = class175.field2103.method1267(-105, var370.field178);
                                if (var372.field2860 > var371.field2860) {
                                    var368 = false;
                                }
                            }
                        }
                    }
                    if (var368) {
                        var367.field2485 = var344;
                        var367.field2516 = var346;
                        var367.field2494 = 0;
                        var367.field2478 = 0;
                        var367.field2477 = class204.field2796 + var345;
                        var367.field2447 = 1;
                        if (class204.field2796 < var367.field2477) {
                            var367.field2494 = -1;
                        }
                        if (var367.field2485 == 65535) {
                            var367.field2485 = -1;
                        }
                        if (var367.field2485 != -1 && class204.field2796 == var367.field2477) {
                            int var376 = class234.field3258.method2456(var367.field2485, 600).field178;
                            if (var376 != -1) {
                                class207 var377 = class175.field2103.method1267(arg0 + 1123708758, var376);
                                if (var377 != null && var377.field2853 != null) {
                                    class126.method602(var377, class19.field258 == var367, var367.field1008, 0, var367.field1005, false, var367.field994);
                                }
                            }
                        }
                    }
                }
            }
            class233.field3240 = null;
            return true;
        } else {
            class144.method678((Throwable) null, true, "T1 - " + (class233.field3240 == null ? -1 : class233.field3240.method378(0)) + "," + (class24.field333 == null ? -1 : class24.field333.method378(0)) + "," + (class358.field5166 == null ? -1 : class358.field5166.method378(0)) + " - " + class361.field5203);
            class100.method491((byte) 123);
            return true;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V")
    public static void method2208(byte arg0) {
        field5224 = null;
        field5228 = null;
        if (arg0 != 113) {
            field5233 = -29;
        }
        field5236 = null;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILvt;)V")
    public final void method2209(int arg0, class179 arg1) {
        while (true) {
            int var3 = arg1.method895((byte) -102);
            if (var3 == 0) {
                if (arg0 != 1) {
                    return;
                }
                field5230++;
                return;
            }
            this.method2212(arg1, (byte) -128, var3);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lg;I)I")
    public static final int method2210(class470 arg0, int arg1) {
        field5234++;
        int var2 = 0;
        if (arg0.method2758(class20.field280, -1)) {
            var2++;
        }
        int var3 = -59 % ((arg1 + 3) / 53);
        if (arg0.method2758(class58.field735, -1)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V")
    public static final void method2211(int arg0) {
        class223.field3099 = 0;
        int var1 = 91 / ((-arg0 - 42) / 42);
        field5232++;
        class485.field6882.method813(0);
        class485.field6882.method803(class424.field6127, 50);
        class223.field3099++;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lvt;BI)V")
    private final void method2212(class179 arg0, byte arg1, int arg2) {
        if (arg1 > -127) {
            method2210((class470) null, 13);
        }
        if (arg2 == 1) {
            this.field5235 = arg0.method916(21933);
        } else if (arg2 == 2) {
            this.field5229 = new int[arg0.method895((byte) -113)];
            for (int var4 = 0; var4 < this.field5229.length; var4++) {
                this.field5229[var4] = arg0.method916(21933);
            }
        } else if (arg2 == 3) {
            this.field5226 = arg0.method895((byte) -74);
        }
        field5225++;
    }
}
