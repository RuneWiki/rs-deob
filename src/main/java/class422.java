import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public class class422 extends class438 {

    @OriginalMember(owner = "client!hs", name = "i", descriptor = "Lka;")
    public static class408 field5838 = new class408(30);

    @OriginalMember(owner = "client!hs", name = "l", descriptor = "Ltg;")
    public static class296 field5841 = null;

    @OriginalMember(owner = "client!hs", name = "m", descriptor = "I")
    public static int field5842 = -1;

    @OriginalMember(owner = "client!hs", name = "q", descriptor = "Lhc;")
    public static class368 field5846 = new class368("Starting 3d Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");

    @OriginalMember(owner = "client!hs", name = "s", descriptor = "I")
    public static int field5848 = 0;

    @OriginalMember(owner = "client!hs", name = "j", descriptor = "I")
    public static int field5839;

    @OriginalMember(owner = "client!hs", name = "k", descriptor = "I")
    public static int field5840;

    @OriginalMember(owner = "client!hs", name = "n", descriptor = "I")
    public static int field5843;

    @OriginalMember(owner = "client!hs", name = "o", descriptor = "I")
    public static int field5844;

    @OriginalMember(owner = "client!hs", name = "p", descriptor = "I")
    public static int field5845;

    @OriginalMember(owner = "client!hs", name = "h", descriptor = "Lhs;")
    public class422 field5837;

    @OriginalMember(owner = "client!hs", name = "r", descriptor = "Lhs;")
    public class422 field5847;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Z)Z")
    public static final boolean method2604(boolean arg0) throws IOException {
        field5845++;
        if (class398.field5513 == null) {
            return false;
        }
        int var1 = class398.field5513.method1325(0);
        if (var1 == 0) {
            return false;
        }
        if (class451.field6496 == -1) {
            class398.field5513.method1326(class75.field1068.field5076, (byte) 120, 1, 0);
            class75.field1068.field5048 = 0;
            class451.field6496 = class75.field1068.method1143((byte) -3);
            var1--;
            class213.field2982 = class369.field5113[class451.field6496];
        }
        if (class213.field2982 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class398.field5513.method1326(class75.field1068.field5076, (byte) 120, 1, 0);
            class213.field2982 = class75.field1068.field5076[0] & 0xFF;
            var1--;
        }
        if (class213.field2982 == -2) {
            if (var1 <= 1) {
                return false;
            }
            class398.field5513.method1326(class75.field1068.field5076, (byte) 120, 2, 0);
            class75.field1068.field5048 = 0;
            class213.field2982 = class75.field1068.method2297(13352);
            var1 -= 2;
        }
        if (class213.field2982 > var1) {
            return false;
        }
        class75.field1068.field5048 = 0;
        class398.field5513.method1326(class75.field1068.field5076, (byte) 120, class213.field2982, 0);
        class369.field5116 = 0;
        class304.field4149 = class21.field272;
        class21.field272 = class227.field3149;
        class227.field3149 = class451.field6496;
        if (class451.field6496 == 247) {
            String var2 = class75.field1068.method2255(-32226);
            boolean var3 = class75.field1068.method2306((byte) 70) == 1;
            String var4;
            if (var3) {
                var4 = class75.field1068.method2255(-32226);
            } else {
                var4 = var2;
            }
            int var5 = class75.field1068.method2297(13352);
            byte var6 = class75.field1068.method2289((byte) -77);
            boolean var7 = false;
            if (var6 == -128) {
                var7 = true;
            }
            if (var7) {
                if (class395.field5492 == 0) {
                    class451.field6496 = -1;
                    return true;
                }
                boolean var13 = false;
                int var14;
                for (var14 = 0; class395.field5492 > var14 && (!class67.field944[var14].field461.equals(var4) || class67.field944[var14].field458 != var5); var14++) {
                }
                if (class395.field5492 > var14) {
                    while (var14 < class395.field5492 - 1) {
                        class67.field944[var14] = class67.field944[var14 + 1];
                        var14++;
                    }
                    class395.field5492--;
                    class67.field944[class395.field5492] = null;
                }
            } else {
                String var8 = class75.field1068.method2255(-32226);
                class34 var9 = new class34();
                var9.field464 = var8;
                var9.field463 = var6;
                var9.field458 = var5;
                var9.field462 = var2;
                var9.field461 = var4;
                int var10;
                for (var10 = class395.field5492 - 1; var10 >= 0; var10--) {
                    int var11 = class67.field944[var10].field461.compareTo(var9.field461);
                    if (var11 == 0) {
                        class67.field944[var10].field458 = var5;
                        class67.field944[var10].field463 = var6;
                        class67.field944[var10].field464 = var8;
                        if (var4.equals(class359.field4970.field5869)) {
                            class88.field1247 = var6;
                        }
                        class451.field6496 = -1;
                        class62.field840 = class260.field3595;
                        return true;
                    }
                    if (var11 < 0) {
                        break;
                    }
                }
                if (class67.field944.length <= class395.field5492) {
                    class451.field6496 = -1;
                    return true;
                }
                for (int var12 = class395.field5492 - 1; var12 > var10; var12--) {
                    class67.field944[var12 + 1] = class67.field944[var12];
                }
                if (class395.field5492 == 0) {
                    class67.field944 = new class34[100];
                }
                class67.field944[var10 + 1] = var9;
                class395.field5492++;
                if (var4.equals(class359.field4970.field5869)) {
                    class88.field1247 = var6;
                }
            }
            class451.field6496 = -1;
            class62.field840 = class260.field3595;
            return true;
        } else if (class451.field6496 == 226) {
            int var15 = class75.field1068.method2297(13352);
            int var16 = class75.field1068.method2306((byte) 80);
            int var17 = class75.field1068.method2306((byte) 37);
            int var18 = class75.field1068.method2306((byte) 109);
            int var19 = class75.field1068.method2306((byte) 90);
            int var20 = class75.field1068.method2297(13352);
            if (class352.method2121(var15, -126)) {
                class1.field3[var16] = true;
                class118.field1802[var16] = var17;
                class419.field5822[var16] = var18;
                class162.field2298[var16] = var19;
                class30.field411[var16] = var20;
            }
            class451.field6496 = -1;
            return true;
        } else if (class451.field6496 == 132) {
            String var21 = class75.field1068.method2255(-32226);
            int var22 = class75.field1068.method2291(-15939);
            int var23 = class75.field1068.method2297(13352);
            if (class352.method2121(var22, -52)) {
                class274.method1733(var23, 1872, var21);
            }
            class451.field6496 = -1;
            return true;
        } else if (class451.field6496 == 210) {
            if (class213.field2982 == 0) {
                class302.field4123 = class341.field4615.method2313((byte) -78, class445.field6241);
            } else {
                class302.field4123 = class75.field1068.method2255(-32226);
            }
            class451.field6496 = -1;
            return true;
        } else if (class451.field6496 == 79) {
            int var24 = class75.field1068.method2264(-74);
            int var25 = class75.field1068.method2264(-122);
            int var26 = class75.field1068.method2297(13352);
            int var27 = class75.field1068.method2258(1177515464);
            if (class352.method2121(var26, -100)) {
                class49.method402(var25, var27, var24, !arg0);
            }
            class451.field6496 = -1;
            return true;
        } else if (class451.field6496 == 224) {
            String var28 = class75.field1068.method2255(-32226);
            int var29 = class75.field1068.method2297(13352);
            String var30 = class128.method967(var29, -1979350136).method810(class75.field1068, (byte) -93);
            class303.method1839(var28, -1, var29, 0, (String) null, 19, var30, var28);
            class451.field6496 = -1;
            return true;
        } else if (class451.field6496 == 160) {
            int var31 = class75.field1068.method2258(1177515464);
            int var32 = class75.field1068.method2304(false);
            int var33 = class75.field1068.method2304(false);
            if (var33 == 65535) {
                var33 = -1;
            }
            int var34 = class75.field1068.method2304(false);
            if (var34 == 65535) {
                var34 = -1;
            }
            int var35 = class75.field1068.method2297(13352);
            if (class352.method2121(var35, -88)) {
                for (int var36 = var34; var36 <= var33; var36++) {
                    long var37 = ((long) var31 << 32) + (long) var36;
                    class310 var39 = (class310) class48.field618.method837((byte) -72, var37);
                    class310 var40;
                    if (var39 != null) {
                        var40 = new class310(var39.field4209, var32);
                        var39.method1884(false);
                    } else if (var36 == -1) {
                        var40 = new class310(class157.method1139(var31, false).field1592.field4209, var32);
                    } else {
                        var40 = new class310(0, var32);
                    }
                    class48.field618.method835(4, var40, var37);
                }
            }
            class451.field6496 = -1;
            return true;
        } else if (class451.field6496 == 106) {
            String var41 = class75.field1068.method2255(-32226);
            String var42 = class160.method1157(class119.method928(class217.method1442((byte) -79, class75.field1068), false), (byte) -116);
            class214.method1429(var41, 23653, 6, var42, var41, 0);
            class451.field6496 = -1;
            return true;
        } else if (class451.field6496 == 163) {
            class56.field732 = class75.field1068.method2259((byte) -100);
            class412.field5730 = class75.field1068.method2292(true);
            class451.field6496 = -1;
            return true;
        } else if (class451.field6496 == 120) {
            int var43 = class75.field1068.method2297(13352);
            int var44 = class75.field1068.method2306((byte) 48);
            boolean var45 = (var44 & 0x1) == 1;
            while (class213.field2982 > class75.field1068.field5048) {
                int var46 = class75.field1068.method2251(-105);
                int var47 = class75.field1068.method2297(13352);
                int var48 = 0;
                if (var47 != 0) {
                    var48 = class75.field1068.method2306((byte) 95);
                    if (var48 == 255) {
                        var48 = class75.field1068.method2258(1177515464);
                    }
                }
                class122.method941(var48, var47 - 1, var43, var46, (byte) 126, var45);
            }
            class4.field37[class187.method1301(class132.field1984++, 31)] = var43;
            class451.field6496 = -1;
            return true;
        } else if (class451.field6496 == 173) {
            int var49 = class75.field1068.method2288((byte) 84);
            int var50 = class75.field1068.method2304(!arg0);
            if (var50 == 65535) {
                var50 = -1;
            }
            int var51 = class75.field1068.method2297(13352);
            if (class352.method2121(var51, -80)) {
                class243.method1584(var50, 2, var49, -1, (byte) 66);
            }
            class451.field6496 = -1;
            return true;
        } else if (class451.field6496 == 32) {
            int var52 = class75.field1068.method2291(-15939);
            String var53 = class75.field1068.method2255(-32226);
            int var54 = class75.field1068.method2281((byte) 84);
            if (class352.method2121(var52, -91)) {
                class68.method548(var54, 3, var53);
            }
            class451.field6496 = -1;
            return true;
        } else if (class451.field6496 == 196) {
            int var55 = class75.field1068.method2277((byte) 110);
            int var56 = class75.field1068.method2306((byte) 46);
            int var57 = class75.field1068.method2292(true);
            class343.field4623 = var55 >> 1;
            class359.field4970.method2609((var55 & 0x1) == 1, var56, class343.field4623, var57, (byte) 95);
            class451.field6496 = -1;
            return true;
        } else if (class451.field6496 == 3) {
            int var58 = class75.field1068.method2304(false);
            int var59 = class75.field1068.method2291(-15939);
            if (var59 == 65535) {
                var59 = -1;
            }
            int var60 = class75.field1068.method2258(1177515464);
            if (class352.method2121(var58, -37)) {
                class243.method1584(var59, 1, var60, -1, (byte) 66);
            }
            class451.field6496 = -1;
            return true;
        } else if (class451.field6496 == 156) {
            int var61 = class75.field1068.method2291(-15939);
            int var62 = class75.field1068.method2297(13352);
            int var63 = class75.field1068.method2258(1177515464);
            if (class352.method2121(var61, -94)) {
                class371.method2325(127, var63, var62);
            }
            class451.field6496 = -1;
            return true;
        } else if (class451.field6496 == 237) {
            int var64 = class75.field1068.method2266(255);
            int var65 = class75.field1068.method2291(-15939);
            int var66 = class75.field1068.method2265(-4);
            int var67 = class75.field1068.method2266(255);
            if (class352.method2121(var65, -83)) {
                class105.method795(var66, (var64 << 16) + var67, (byte) -84);
            }
            class451.field6496 = -1;
            return true;
        } else if (class451.field6496 == 98) {
            int var68 = class75.field1068.method2297(13352);
            int var69 = class75.field1068.method2258(1177515464);
            int var70 = class75.field1068.method2297(13352);
            if (class352.method2121(var68, -85)) {
                class32.method296(var70, (byte) -76, var69);
            }
            class451.field6496 = -1;
            return true;
        } else if (class451.field6496 == 74) {
            int var71 = class75.field1068.method2297(13352);
            if (class352.method2121(var71, -87)) {
                class371.method2323((byte) 40);
            }
            class451.field6496 = -1;
            return true;
        } else if (class451.field6496 == 146) {
            int var72 = class75.field1068.method2259((byte) -100);
            int var73 = class75.field1068.method2291(-15939);
            int var74 = class75.field1068.method2266(255);
            int var75 = class75.field1068.method2258(1177515464);
            if (class352.method2121(var73, -86)) {
                class435 var76 = (class435) class171.field2415.method837((byte) -72, (long) var75);
                if (var76 != null) {
                    class147.method1063((byte) -128, var76.field6146 != var74, false, var76);
                }
                class160.method1156(7228, var74, var72, var75, false);
            }
            class451.field6496 = -1;
            return true;
        } else if (class451.field6496 == 47) {
            int var77 = class75.field1068.method2297(13352);
            int var78 = class75.field1068.method2306((byte) 82);
            boolean var79 = (var78 & 0x1) == 1;
            class147.method1061(var79, var77, -1);
            int var80 = class75.field1068.method2297(13352);
            for (int var81 = 0; var81 < var80; var81++) {
                int var82 = class75.field1068.method2277((byte) 116);
                if (var82 == 255) {
                    var82 = class75.field1068.method2288((byte) 85);
                }
                int var83 = class75.field1068.method2266(255);
                class122.method941(var82, var83 - 1, var77, var81, (byte) 127, var79);
            }
            class4.field37[class187.method1301(class132.field1984++, 31)] = var77;
            class451.field6496 = -1;
            return true;
        } else if (class451.field6496 == 192) {
            int var84 = class75.field1068.method2297(13352);
            int var85 = class75.field1068.method2277((byte) 114);
            int var86 = class75.field1068.method2297(13352);
            if (class352.method2121(var86, -82)) {
                if (var85 == 2) {
                    class350.method2113(-121);
                }
                class350.field4712 = var84;
                class436.method2683(var84, (byte) -104);
                class183.method1277((byte) 103, false);
                class172.method1232(class350.field4712);
                for (int var87 = 0; var87 < 100; var87++) {
                    class363.field4998[var87] = true;
                }
            }
            class451.field6496 = -1;
            return true;
        } else if (class451.field6496 == 205) {
            int var88 = class75.field1068.method2297(13352);
            int var89 = class75.field1068.method2257((byte) 110);
            int var90 = class75.field1068.method2258(1177515464);
            if (class352.method2121(var88, -47)) {
                class48.method396(var89, 117, var90);
            }
            class451.field6496 = -1;
            return true;
        } else if (class451.field6496 == 239) {
            int var91 = class75.field1068.method2306((byte) 76);
            boolean var92 = (var91 & 0x1) == 1;
            String var93 = class75.field1068.method2255(-32226);
            String var94 = class75.field1068.method2255(-32226);
            if (var94.equals("")) {
                var94 = var93;
            }
            String var95 = class75.field1068.method2255(-32226);
            String var96 = class75.field1068.method2255(-32226);
            if (var96.equals("")) {
                var96 = var95;
            }
            if (var92) {
                for (int var97 = 0; var97 < class42.field541; var97++) {
                    if (class263.field3612[var97].equals(var96)) {
                        class32.field443[var97] = var93;
                        class263.field3612[var97] = var94;
                        class394.field5478[var97] = var95;
                        class341.field4605[var97] = var96;
                        break;
                    }
                }
            } else {
                class32.field443[class42.field541] = var93;
                class263.field3612[class42.field541] = var94;
                class394.field5478[class42.field541] = var95;
                class341.field4605[class42.field541] = var96;
                class258.field3579[class42.field541] = class187.method1301(var91, 2) == 2;
                class42.field541++;
            }
            class418.field5784 = class260.field3595;
            class451.field6496 = -1;
            return true;
        } else if (class451.field6496 == 123) {
            int var98 = class75.field1068.method2266(255);
            int var99 = class75.field1068.method2266(255);
            int var100 = class75.field1068.method2291(-15939);
            int var101 = class75.field1068.method2291(-15939);
            int var102 = class75.field1068.method2288((byte) 75);
            if (class352.method2121(var101, -84)) {
                class243.method1584(var100 << 16 | var98, 7, var102, var99, (byte) 66);
            }
            class451.field6496 = -1;
            return true;
        } else if (class451.field6496 == 215) {
            int var103 = class75.field1068.method2266(255);
            int var104 = class75.field1068.method2288((byte) 89);
            int var105 = class75.field1068.method2266(255);
            if (class352.method2121(var103, -85)) {
                class243.method1581(var104, var105, (byte) -79);
            }
            class451.field6496 = -1;
            return true;
        } else {
            if (!arg0) {
                method2607(-2, -15);
            }
            if (class451.field6496 == 231) {
                int var106 = class75.field1068.method2291(-15939);
                int var107 = class75.field1068.method2258(1177515464);
                int var108 = class75.field1068.method2281((byte) 64);
                int var109 = class75.field1068.method2291(-15939);
                if (class352.method2121(var106, -59)) {
                    class243.method1584(var109, 5, var108, var107, (byte) 66);
                }
                class451.field6496 = -1;
                return true;
            } else if (class451.field6496 == 153) {
                class75.field1068.field5048 += 28;
                if (class75.field1068.method2303(-106)) {
                    class215.method1431(class75.field1068, false, class75.field1068.field5048 - 28);
                }
                class451.field6496 = -1;
                return true;
            } else if (class451.field6496 == 103) {
                int var110 = class75.field1068.method2306((byte) 77);
                int var111 = var110 >> 5;
                int var112 = var110 & 0x1F;
                if (var112 == 0) {
                    class273.field3733[var111] = null;
                    class451.field6496 = -1;
                    return true;
                }
                class418 var113 = new class418();
                var113.field5792 = var112;
                var113.field5789 = class75.field1068.method2306((byte) 92);
                if (var113.field5789 >= 0 && class191.field2751.length > var113.field5789) {
                    if (var113.field5792 == 1 || var113.field5792 == 10) {
                        var113.field5786 = class75.field1068.method2297(13352);
                        class75.field1068.field5048 += 5;
                    } else if (var113.field5792 >= 2 && var113.field5792 <= 6) {
                        if (var113.field5792 == 2) {
                            var113.field5782 = 64;
                            var113.field5795 = 64;
                        }
                        if (var113.field5792 == 3) {
                            var113.field5782 = 64;
                            var113.field5795 = 0;
                        }
                        if (var113.field5792 == 4) {
                            var113.field5782 = 64;
                            var113.field5795 = 128;
                        }
                        if (var113.field5792 == 5) {
                            var113.field5782 = 0;
                            var113.field5795 = 64;
                        }
                        if (var113.field5792 == 6) {
                            var113.field5795 = 64;
                            var113.field5782 = 128;
                        }
                        var113.field5792 = 2;
                        var113.field5778 = class75.field1068.method2297(13352);
                        var113.field5785 = class75.field1068.method2297(13352);
                        var113.field5791 = class75.field1068.method2306((byte) 92);
                        var113.field5787 = class75.field1068.method2297(13352);
                    }
                    var113.field5793 = class75.field1068.method2297(13352);
                    if (var113.field5793 == 65535) {
                        var113.field5793 = -1;
                    }
                    class273.field3733[var111] = var113;
                }
                class451.field6496 = -1;
                return true;
            } else if (class451.field6496 == 177) {
                int var114 = class75.field1068.method2297(13352);
                int var115 = class75.field1068.method2297(13352);
                int var116 = class75.field1068.method2304(false);
                int var117 = class75.field1068.method2258(1177515464);
                if (var117 >> 30 != 0) {
                    int var142 = var117 >> 28 & 0x3;
                    int var143 = (var117 >> 14 & 0x3FFF) - class6.field65;
                    int var144 = (var117 & 0x3FFF) - class371.field5148;
                    if (var143 >= 0 && var144 >= 0 && var143 < class11.field107 && var144 < class264.field3620) {
                        int var145 = var143 * 128 + 64;
                        int var146 = var144 * 128 + 64;
                        class427 var147 = new class427(var114, 0, class246.field3467, var142, var145, class50.method408(var142, var145, var146, 16) - var116, var146, var143, var143, var144, var144);
                        class196.field2843.method1162(115, new class284(var147));
                    }
                } else if (var117 >> 29 != 0) {
                    int var130 = var117 & 0xFFFF;
                    class419 var131 = class428.field5951[var130];
                    if (var131 != null) {
                        if (var114 == 65535) {
                            var114 = -1;
                        }
                        boolean var132 = true;
                        if (var114 != -1 && var131.field2636 != -1) {
                            if (var131.field2636 == var114) {
                                class344 var133 = class186.method1296(var114, !arg0);
                                if (var133.field4650 && var133.field4648 != -1) {
                                    class83 var134 = class408.method2521((byte) -6, var133.field4648);
                                    int var135 = var134.field1166;
                                    if (var135 == 0 || var135 == 2) {
                                        var132 = false;
                                    } else if (var135 == 1) {
                                        var132 = true;
                                    }
                                }
                            } else {
                                class344 var136 = class186.method1296(var114, false);
                                class344 var137 = class186.method1296(var131.field2636, false);
                                if (var136.field4648 != -1 && var137.field4648 != -1) {
                                    class83 var138 = class408.method2521((byte) 52, var136.field4648);
                                    class83 var139 = class408.method2521((byte) -117, var137.field4648);
                                    if (var138.field1163 < var139.field1163) {
                                        var132 = false;
                                    }
                                }
                            }
                        }
                        if (var132) {
                            var131.field2599 = 1;
                            var131.field2636 = var114;
                            var131.field2605 = var116;
                            var131.field2643 = 0;
                            var131.field2633 = class246.field3467 + var115;
                            var131.field2584 = 0;
                            if (var131.field2633 > class246.field3467) {
                                var131.field2643 = -1;
                            }
                            if (var131.field2636 != -1 && class246.field3467 == var131.field2633) {
                                int var140 = class186.method1296(var131.field2636, false).field4648;
                                if (var140 != -1) {
                                    class83 var141 = class408.method2521((byte) 70, var140);
                                    if (var141 != null && var141.field1145 != null) {
                                        class431.method2657(var141, -63, var131.field40, false, 0, var131.field44);
                                    }
                                }
                            }
                        }
                    }
                } else if ((var117 >> 28) != 0) {
                    int var118 = var117 & 0xFFFF;
                    class423 var119;
                    if (class217.field3030 == var118) {
                        var119 = class359.field4970;
                    } else {
                        var119 = class87.field1227[var118];
                    }
                    if (var119 != null) {
                        if (var114 == 65535) {
                            var114 = -1;
                        }
                        boolean var120 = true;
                        if (var114 != -1 && var119.field2636 != -1) {
                            if (var119.field2636 == var114) {
                                class344 var125 = class186.method1296(var114, false);
                                if (var125.field4650 && var125.field4648 != -1) {
                                    class83 var126 = class408.method2521((byte) -102, var125.field4648);
                                    int var127 = var126.field1166;
                                    if (var127 == 0 || var127 == 2) {
                                        var120 = false;
                                    } else if (var127 == 1) {
                                        var120 = true;
                                    }
                                }
                            } else {
                                class344 var121 = class186.method1296(var114, false);
                                class344 var122 = class186.method1296(var119.field2636, false);
                                if (var121.field4648 != -1 && var122.field4648 != -1) {
                                    class83 var123 = class408.method2521((byte) 58, var121.field4648);
                                    class83 var124 = class408.method2521((byte) -128, var122.field4648);
                                    if (var124.field1163 > var123.field1163) {
                                        var120 = false;
                                    }
                                }
                            }
                        }
                        if (var120) {
                            var119.field2636 = var114;
                            var119.field2599 = 1;
                            var119.field2605 = var116;
                            var119.field2633 = class246.field3467 + var115;
                            var119.field2643 = 0;
                            var119.field2584 = 0;
                            if (class246.field3467 < var119.field2633) {
                                var119.field2643 = -1;
                            }
                            if (var119.field2636 == 65535) {
                                var119.field2636 = -1;
                            }
                            if (var119.field2636 != -1 && class246.field3467 == var119.field2633) {
                                int var128 = class186.method1296(var119.field2636, false).field4648;
                                if (var128 != -1) {
                                    class83 var129 = class408.method2521((byte) 9, var128);
                                    if (var129 != null && var129.field1145 != null) {
                                        class431.method2657(var129, -63, var119.field40, class359.field4970 == var119, 0, var119.field44);
                                    }
                                }
                            }
                        }
                    }
                }
                class451.field6496 = -1;
                return true;
            } else if (class451.field6496 == 110) {
                int var148 = class75.field1068.method2266(255);
                if (var148 == 65535) {
                    var148 = -1;
                }
                int var149 = class75.field1068.method2277((byte) 115);
                int var150 = var149 >> 2;
                int var151 = var149 & 0x3;
                int var152 = class160.field2279[var150];
                int var153 = class75.field1068.method2288((byte) 106);
                int var154 = (var153 & 0x3AB94A16) >> 28;
                int var155 = (var153 & 0xFFFF42B) >> 14;
                int var156 = var155 - class6.field65;
                int var157 = var153 & 0x3FFF;
                int var158 = var157 - class371.field5148;
                class14.method75(var148, var151, var156, var152, (byte) 70, var154, var158, var150);
                class451.field6496 = -1;
                return true;
            } else if (class451.field6496 == 126) {
                int var159 = class75.field1068.method2291(-15939);
                byte var160 = class75.field1068.method2295(-914108856);
                int var161 = class75.field1068.method2266(255);
                if (class352.method2121(var159, -99)) {
                    class32.method296(var161, (byte) -106, var160);
                }
                class451.field6496 = -1;
                return true;
            } else if (class451.field6496 == 65) {
                class188.method1308(false, 26);
                class451.field6496 = -1;
                return true;
            } else if (class451.field6496 == 115) {
                int var162 = class75.field1068.method2304(!arg0);
                int var163 = class75.field1068.method2281((byte) 80);
                class39.method346(var163, -4022, var162);
                class451.field6496 = -1;
                return true;
            } else if (class451.field6496 == 113) {
                int var164 = class75.field1068.method2297(13352);
                int var165 = class75.field1068.method2266(255);
                int var166 = class75.field1068.method2288((byte) 95);
                if (class352.method2121(var165, -113)) {
                    class383.method2365(false, var164, var166);
                }
                class451.field6496 = -1;
                return true;
            } else if (class451.field6496 == 187) {
                int var167 = class75.field1068.method2292(true);
                int var168 = class75.field1068.method2291(-15939);
                if (var168 == 65535) {
                    var168 = -1;
                }
                class348.method2107(var167, (byte) 47, var168);
                class451.field6496 = -1;
                return true;
            } else if (class451.field6496 == 111) {
                int var169 = class75.field1068.method2266(255);
                if (var169 == 65535) {
                    var169 = -1;
                }
                int var170 = class75.field1068.method2259((byte) -100);
                int var171 = class75.field1068.method2263((byte) 10);
                class298.method1820(var170, (byte) 20, var169, var171);
                class451.field6496 = -1;
                return true;
            } else if (class451.field6496 == 17) {
                int var172 = class75.field1068.method2297(13352);
                int var173 = class75.field1068.method2306((byte) 70);
                int var174 = class75.field1068.method2306((byte) 110);
                int var175 = class75.field1068.method2297(13352);
                int var176 = class75.field1068.method2306((byte) 120);
                int var177 = class75.field1068.method2306((byte) 106);
                if (class352.method2121(var172, -82)) {
                    class22.method128(var175, -20240, var177, var174, var176, var173);
                }
                class451.field6496 = -1;
                return true;
            } else if (class451.field6496 == 46) {
                for (int var178 = 0; var178 < class13.field121.length; var178++) {
                    if (class66.field924[var178] != class13.field121[var178]) {
                        class13.field121[var178] = class66.field924[var178];
                        class410.method2542(var178, (byte) 30);
                        class363.field5000[class187.method1301(31, class345.field4671++)] = var178;
                    }
                }
                class451.field6496 = -1;
                return true;
            } else if (class451.field6496 == 72) {
                int var179 = class75.field1068.method2306((byte) 39);
                int var180 = class75.field1068.method2304(false);
                class39.method346(var179, -4022, var180);
                class451.field6496 = -1;
                return true;
            } else if (class451.field6496 == 62) {
                class115.method862(class122.field1839, class75.field1068, false, class213.field2982);
                class451.field6496 = -1;
                return true;
            } else if (class451.field6496 == 9) {
                int var181 = class75.field1068.method2306((byte) 27);
                int var182 = class75.field1068.method2306((byte) 121);
                if (var181 == 255) {
                    var182 = -1;
                    var181 = -1;
                }
                class401.method2485(90, var182, var181);
                class451.field6496 = -1;
                return true;
            } else if (class451.field6496 == 249) {
                int var183 = class75.field1068.method2259((byte) -100);
                int var184 = class75.field1068.method2291(-15939);
                int var185 = class75.field1068.method2266(255);
                class419 var186 = class428.field5951[var184];
                if (var186 != null) {
                    class101.method777(var183, var185, -86, var186);
                }
                class451.field6496 = -1;
                return true;
            } else if (class451.field6496 == 8) {
                boolean var187 = class75.field1068.method2306((byte) 110) == 1;
                String var188 = class75.field1068.method2255(-32226);
                String var189 = class75.field1068.method2255(-32226);
                int var190 = class75.field1068.method2297(13352);
                int var191 = class75.field1068.method2306((byte) 55);
                String var192 = "";
                boolean var193 = false;
                if (var190 > 0) {
                    var192 = class75.field1068.method2255(-32226);
                    var193 = class75.field1068.method2306((byte) 56) == 1;
                }
                for (int var194 = 0; var194 < class353.field4751; var194++) {
                    if (var187) {
                        if (var189.equals(class196.field2851[var194])) {
                            class196.field2851[var194] = var188;
                            var188 = null;
                            class328.field4461[var194] = var189;
                            break;
                        }
                    } else if (var188.equals(class196.field2851[var194])) {
                        if (class323.field4388[var194] != var190) {
                            class323.field4388[var194] = var190;
                            if (var190 > 0) {
                                class214.method1429("", 23653, 5, var188 + class313.field4244.method2313((byte) -103, class445.field6241), "", 0);
                            }
                            if (var190 == 0) {
                                class214.method1429("", 23653, 5, var188 + class39.field517.method2313((byte) -87, class445.field6241), "", 0);
                            }
                        }
                        class328.field4461[var194] = var189;
                        class220.field3089[var194] = var192;
                        class1.field8[var194] = var191;
                        var188 = null;
                        class408.field5681[var194] = var193;
                        break;
                    }
                }
                if (var188 != null && class353.field4751 < 200) {
                    class196.field2851[class353.field4751] = var188;
                    class328.field4461[class353.field4751] = var189;
                    class323.field4388[class353.field4751] = var190;
                    class220.field3089[class353.field4751] = var192;
                    class1.field8[class353.field4751] = var191;
                    class408.field5681[class353.field4751] = var193;
                    class353.field4751++;
                }
                class418.field5784 = class260.field3595;
                boolean var195 = false;
                int var196 = class353.field4751;
                while (var196 > 0) {
                    var196--;
                    boolean var197 = true;
                    for (int var198 = 0; var198 < var196; var198++) {
                        if (class323.field4388[var198] != class399.field5517 && class323.field4388[var198 + 1] == class399.field5517 || class323.field4388[var198] == 0 && class323.field4388[var198 + 1] != 0) {
                            int var199 = class323.field4388[var198];
                            class323.field4388[var198] = class323.field4388[var198 + 1];
                            class323.field4388[var198 + 1] = var199;
                            String var200 = class220.field3089[var198];
                            class220.field3089[var198] = class220.field3089[var198 + 1];
                            class220.field3089[var198 + 1] = var200;
                            String var201 = class196.field2851[var198];
                            class196.field2851[var198] = class196.field2851[var198 + 1];
                            class196.field2851[var198 + 1] = var201;
                            String var202 = class328.field4461[var198];
                            class328.field4461[var198] = class328.field4461[var198 + 1];
                            class328.field4461[var198 + 1] = var202;
                            int var203 = class1.field8[var198];
                            class1.field8[var198] = class1.field8[var198 + 1];
                            class1.field8[var198 + 1] = var203;
                            boolean var204 = class408.field5681[var198];
                            class408.field5681[var198] = class408.field5681[var198 + 1];
                            var197 = false;
                            class408.field5681[var198 + 1] = var204;
                        }
                    }
                    if (var197) {
                        break;
                    }
                }
                class451.field6496 = -1;
                return true;
            } else if (class451.field6496 == 40) {
                int var205 = class75.field1068.method2297(13352);
                int var206 = class75.field1068.method2258(1177515464);
                if (class352.method2121(var205, -97)) {
                    class435 var207 = (class435) class171.field2415.method837((byte) -72, (long) var206);
                    if (var207 != null) {
                        class147.method1063((byte) -126, true, false, var207);
                    }
                    if (class50.field640 != null) {
                        class298.method1821((byte) -61, class50.field640);
                        class50.field640 = null;
                    }
                }
                class451.field6496 = -1;
                return true;
            } else if (class451.field6496 == 178) {
                class259.method1670(class75.field1068.method2255(-32226), (byte) -101);
                class451.field6496 = -1;
                return true;
            } else if (class451.field6496 == 240 || class451.field6496 == 37 || class451.field6496 == 150 || class451.field6496 == 59 || class451.field6496 == 122 || class451.field6496 == 190 || class451.field6496 == 252 || class451.field6496 == 199 || class451.field6496 == 191 || class451.field6496 == 234 || class451.field6496 == 109 || class451.field6496 == 19 || class451.field6496 == 193 || class451.field6496 == 127 || class451.field6496 == 100) {
                class423.method2614(true);
                class451.field6496 = -1;
                return true;
            } else if (class451.field6496 == 164) {
                class64.field884 = class75.field1068.method2291(-15939) * 30;
                class451.field6496 = -1;
                class115.field1751 = class260.field3595;
                return true;
            } else if (class451.field6496 == 186) {
                int var208 = class75.field1068.method2258(1177515464);
                int var209 = class75.field1068.method2304(!arg0);
                if (class352.method2121(var209, -123)) {
                    class243.method1584(-1, 3, var208, -1, (byte) 66);
                }
                class451.field6496 = -1;
                return true;
            } else if (class451.field6496 == 135) {
                int var210 = class75.field1068.method2297(13352);
                String var211 = class75.field1068.method2255(-32226);
                Object[] var212 = new Object[var211.length() + 1];
                for (int var213 = var211.length() - 1; var213 >= 0; var213--) {
                    if (var211.charAt(var213) == 's') {
                        var212[var213 + 1] = class75.field1068.method2255(-32226);
                    } else {
                        var212[var213 + 1] = Integer.valueOf(class75.field1068.method2258(1177515464));
                    }
                }
                var212[0] = Integer.valueOf(class75.field1068.method2258(1177515464));
                if (class352.method2121(var210, -71)) {
                    class101 var214 = new class101();
                    var214.field1393 = var212;
                    class172.method1230(var214);
                }
                class451.field6496 = -1;
                return true;
            } else if (class451.field6496 == 222) {
                int var215 = class75.field1068.method2259((byte) -100);
                int var216 = class75.field1068.method2277((byte) 125);
                int var217 = class75.field1068.method2304(false);
                if (var217 == 65535) {
                    var217 = -1;
                }
                String var218 = class75.field1068.method2255(-32226);
                if (var215 >= 1 && var215 <= 8) {
                    if (var218.equalsIgnoreCase("null")) {
                        var218 = null;
                    }
                    class51.field659[var215 - 1] = var218;
                    class46.field591[var215 - 1] = var217;
                    class304.field4148[var215 - 1] = var216 == 0;
                }
                class451.field6496 = -1;
                return true;
            } else if (class451.field6496 == 206) {
                int var219 = class75.field1068.method2297(13352);
                int var220 = class75.field1068.method2265(-4);
                class404.method2494(var219, var220, 0);
                class451.field6496 = -1;
                return true;
            } else if (class451.field6496 == 242) {
                int var221 = class75.field1068.method2297(13352);
                if (var221 == 65535) {
                    var221 = -1;
                }
                int var222 = class75.field1068.method2306((byte) 44);
                int var223 = class75.field1068.method2297(13352);
                int var224 = class75.field1068.method2306((byte) 69);
                class346.method2098(var223, var222, var221, var224, (byte) -126);
                class451.field6496 = -1;
                return true;
            } else if (class451.field6496 == 158) {
                class188.method1308(true, 26);
                class451.field6496 = -1;
                return true;
            } else if (class451.field6496 == 168) {
                int var225 = class75.field1068.method2251(-122);
                int var226 = class75.field1068.method2258(1177515464);
                int var227 = class75.field1068.method2306((byte) 30);
                String var228 = "";
                String var229 = var228;
                if ((var227 & 0x1) != 0) {
                    var228 = class75.field1068.method2255(-32226);
                    if ((var227 & 0x2) == 0) {
                        var229 = var228;
                    } else {
                        var229 = class75.field1068.method2255(-32226);
                    }
                }
                String var230 = class75.field1068.method2255(-32226);
                if (var225 == 99) {
                    class125.method953(var230, true);
                } else if (var229.equals("") || !class85.method684((byte) 92, var229)) {
                    class214.method1429(var228, 23653, var225, var230, var229, var226);
                } else {
                    class451.field6496 = -1;
                    return true;
                }
                class451.field6496 = -1;
                return true;
            } else if (class451.field6496 == 143) {
                int var231 = class75.field1068.method2291(-15939);
                int var232 = class75.field1068.method2259((byte) -100);
                if (class352.method2121(var231, -67)) {
                    class356.field4776 = var232;
                }
                class451.field6496 = -1;
                return true;
            } else if (class451.field6496 == 34) {
                int var233 = class75.field1068.method2277((byte) 120);
                int var234 = class75.field1068.method2258(1177515464);
                int var235 = class75.field1068.method2306((byte) 84);
                class192.field2767[var233] = var234;
                class371.field5147[var233] = var235;
                class236.field3365[var233] = 1;
                int var236 = class442.field6221[var233] - 1;
                for (int var237 = 0; var237 < var236; var237++) {
                    if (class67.field937[var237] <= var234) {
                        class236.field3365[var233] = var237 + 2;
                    }
                }
                class217.field3052[class187.method1301(class84.field1171++, 31)] = var233;
                class451.field6496 = -1;
                return true;
            } else if (class451.field6496 == 166) {
                int var238 = class75.field1068.method2291(-15939);
                if (var238 == 65535) {
                    var238 = -1;
                }
                int var239 = class75.field1068.method2281((byte) 85);
                int var240 = class75.field1068.method2281((byte) 59);
                int var241 = class75.field1068.method2297(13352);
                int var242 = class75.field1068.method2304(!arg0);
                if (var242 == 65535) {
                    var242 = -1;
                }
                if (class352.method2121(var241, -36)) {
                    for (int var243 = var242; var243 <= var238; var243++) {
                        long var244 = ((long) var240 << 32) + (long) var243;
                        class310 var246 = (class310) class48.field618.method837((byte) -72, var244);
                        class310 var247;
                        if (var246 != null) {
                            var247 = new class310(var239, var246.field4204);
                            var246.method1884(false);
                        } else if (var243 == -1) {
                            var247 = new class310(var239, class157.method1139(var240, false).field1592.field4204);
                        } else {
                            var247 = new class310(var239, -1);
                        }
                        class48.field618.method835(4, var247, var244);
                    }
                }
                class451.field6496 = -1;
                return true;
            } else if (class451.field6496 == 92) {
                boolean var248 = class75.field1068.method2306((byte) 35) == 1;
                String var249 = class75.field1068.method2255(-32226);
                String var250 = var249;
                if (var248) {
                    var250 = class75.field1068.method2255(-32226);
                }
                long var251 = class75.field1068.method2290(-1083442040);
                long var253 = (long) class75.field1068.method2297(13352);
                long var255 = (long) class75.field1068.method2263((byte) 10);
                int var257 = class75.field1068.method2306((byte) 79);
                int var258 = class75.field1068.method2297(13352);
                long var259 = (var253 << 32) + var255;
                boolean var261 = false;
                int var262 = 0;
                while (true) {
                    if (var262 >= 100) {
                        if (var257 <= 1 && class85.method684((byte) 92, var250)) {
                            var261 = true;
                        }
                        break;
                    }
                    if (class90.field1263[var262] == var259) {
                        var261 = true;
                        break;
                    }
                    var262++;
                }
                if (!var261 && class438.field6181 == 0) {
                    class90.field1263[class430.field6022] = var259;
                    class430.field6022 = (class430.field6022 + 1) % 100;
                    String var263 = class128.method967(var258, -1979350136).method810(class75.field1068, (byte) -119);
                    if (var257 == 2) {
                        class303.method1839("<img=1>" + var249, -1, var258, 0, class444.method2748((byte) -17, var251), 20, var263, "<img=1>" + var250);
                    } else if (var257 == 1) {
                        class303.method1839("<img=0>" + var249, -1, var258, 0, class444.method2748((byte) -17, var251), 20, var263, "<img=0>" + var250);
                    } else {
                        class303.method1839(var249, -1, var258, 0, class444.method2748((byte) -17, var251), 20, var263, var250);
                    }
                }
                class451.field6496 = -1;
                return true;
            } else if (class451.field6496 == 159) {
                int var264 = class75.field1068.method2265(-4);
                class336.field4537 = class122.field1839.method608(124, var264);
                class451.field6496 = -1;
                return true;
            } else if (class451.field6496 == 118) {
                int var265 = class75.field1068.method2297(13352);
                int var266 = class75.field1068.method2297(13352);
                int var267 = class75.field1068.method2297(13352);
                int var268 = class75.field1068.method2297(13352);
                if (class352.method2121(var265, -87) && class103.field1425[var266] != null) {
                    for (int var269 = var267; var269 < var268; var269++) {
                        int var270 = class75.field1068.method2263((byte) 10);
                        if (class103.field1425[var266].length > var269 && class103.field1425[var266][var269] != null) {
                            class103.field1425[var266][var269].field1586 = var270;
                        }
                    }
                }
                class451.field6496 = -1;
                return true;
            } else if (class451.field6496 == 50) {
                class284.field3860 = class75.field1068.method2306((byte) 23);
                class418.field5784 = class260.field3595;
                class451.field6496 = -1;
                return true;
            } else if (class451.field6496 == 7) {
                class393.method2436(-118);
                class451.field6496 = -1;
                class345.field4671 += 32;
                return true;
            } else if (class451.field6496 == 212) {
                int var271 = class75.field1068.method2306((byte) 94);
                if (class75.field1068.method2306((byte) 115) == 0) {
                    class352.field4733[var271] = new class230();
                } else {
                    class75.field1068.field5048--;
                    class352.field4733[var271] = new class230(class75.field1068);
                }
                class248.field3489 = class260.field3595;
                class451.field6496 = -1;
                return true;
            } else if (class451.field6496 == 57) {
                String var272 = class75.field1068.method2255(-32226);
                int var273 = class75.field1068.method2304(false);
                int var274 = class75.field1068.method2291(-15939);
                if (class352.method2121(var274, -43)) {
                    class274.method1733(var273, 1872, var272);
                }
                class451.field6496 = -1;
                return true;
            } else if (class451.field6496 == 2) {
                class56.field732 = class75.field1068.method2277((byte) 114);
                class412.field5730 = class75.field1068.method2259((byte) -100);
                for (class119 var275 = (class119) class417.field5771.method842((byte) -25); var275 != null; var275 = (class119) class417.field5771.method836(76)) {
                    int var277 = (int) (var275.field4226 & 0x3FFFL);
                    int var278 = (int) (var275.field4226 >> 14 & 0x3FFFL);
                    int var279 = (int) (var275.field4226 >> 28 & 0x3L);
                    if (class343.field4623 == var279 && class56.field732 <= var277 && class56.field732 + 8 > var277 && class412.field5730 <= var278 && var278 < class412.field5730 + 8) {
                        var275.method1884(false);
                        class177.method1258((byte) -106, var278, class343.field4623, var277);
                    }
                }
                for (class352 var276 = (class352) class155.field2207.method1173(0); var276 != null; var276 = (class352) class155.field2207.method1165(arg0)) {
                    if (class56.field732 <= var276.field4739 && class56.field732 + 8 > var276.field4739 && var276.field4738 >= class412.field5730 && (class412.field5730 + 8) > var276.field4738 && class343.field4623 == var276.field4731) {
                        var276.field4725 = 0;
                    }
                }
                class451.field6496 = -1;
                return true;
            } else if (class451.field6496 == 102) {
                int var280 = class75.field1068.method2258(1177515464);
                int var281 = class75.field1068.method2265(-4);
                int var282 = class75.field1068.method2291(-15939);
                int var283 = class75.field1068.method2266(255);
                if (var283 == 65535) {
                    var283 = -1;
                }
                if (class352.method2121(var282, -103)) {
                    class363.method2230((byte) 27, var280, var281, var283);
                    class14 var284 = class367.method2308(false, var283);
                    class157.method1138(-113, var284.field156, var280, var284.field189, var284.field135);
                    class178.method1262(true, var284.field199, var280, var284.field173, var284.field190);
                }
                class451.field6496 = -1;
                return true;
            } else if (class451.field6496 == 195) {
                class11.field102 = class75.field1068.method2306((byte) 39);
                class451.field6496 = -1;
                class115.field1751 = class260.field3595;
                return true;
            } else if (class451.field6496 == 90) {
                int var285 = class75.field1068.method2297(13352);
                int var286 = class75.field1068.method2291(-15939);
                int var287 = class75.field1068.method2304(false);
                if (class352.method2121(var286, -57)) {
                    class375.method2346(var287, -7862, 0, var285);
                }
                class451.field6496 = -1;
                return true;
            } else if (class451.field6496 == 244) {
                int var288 = class75.field1068.method2297(13352);
                if (class352.method2121(var288, -56)) {
                    class269.method1712(-123);
                }
                class451.field6496 = -1;
                return true;
            } else if (class451.field6496 == 39) {
                if (class350.field4712 != -1) {
                    class282.method1769(0, 0, class350.field4712);
                }
                class451.field6496 = -1;
                return true;
            } else if (class451.field6496 == 28) {
                int var289 = class75.field1068.method2297(13352);
                int var290 = class75.field1068.method2306((byte) 41);
                int var291 = class75.field1068.method2306((byte) 101);
                int var292 = class75.field1068.method2297(13352);
                int var293 = class75.field1068.method2306((byte) 40);
                int var294 = class75.field1068.method2306((byte) 110);
                if (class352.method2121(var289, -111)) {
                    class2.method6(var291, var293, var292, (byte) 90, var290, var294, true);
                }
                class451.field6496 = -1;
                return true;
            } else if (class451.field6496 == 107) {
                boolean var295 = class75.field1068.method2306((byte) 105) == 1;
                String var296 = class75.field1068.method2255(-32226);
                String var297 = var296;
                if (var295) {
                    var297 = class75.field1068.method2255(-32226);
                }
                long var298 = (long) class75.field1068.method2297(13352);
                long var300 = (long) class75.field1068.method2263((byte) 10);
                int var302 = class75.field1068.method2306((byte) 100);
                long var303 = (var298 << 32) + var300;
                boolean var305 = false;
                int var306 = 0;
                while (true) {
                    if (var306 >= 100) {
                        if (var302 <= 1) {
                            if (!(!class119.field1806 || class189.field2725) || class117.field1790) {
                                var305 = true;
                            } else if (class85.method684((byte) 92, var297)) {
                                var305 = true;
                            }
                        }
                        break;
                    }
                    if (class90.field1263[var306] == var303) {
                        var305 = true;
                        break;
                    }
                    var306++;
                }
                if (!var305 && class438.field6181 == 0) {
                    class90.field1263[class430.field6022] = var303;
                    class430.field6022 = (class430.field6022 + 1) % 100;
                    String var307 = class160.method1157(class119.method928(class217.method1442((byte) -79, class75.field1068), false), (byte) -120);
                    if (var302 == 2) {
                        class303.method1839("<img=1>" + var296, -1, -1, 0, (String) null, 7, var307, "<img=1>" + var297);
                    } else if (var302 == 1) {
                        class303.method1839("<img=0>" + var296, -1, -1, 0, (String) null, 7, var307, "<img=0>" + var297);
                    } else {
                        class303.method1839(var296, -1, -1, 0, (String) null, 3, var307, var297);
                    }
                }
                class451.field6496 = -1;
                return true;
            } else if (class451.field6496 == 236) {
                if (class261.field3604 != null) {
                    class171.method1215(-1, false, -1, (byte) 127, class211.field2956);
                }
                byte[] var308 = new byte[class213.field2982];
                class75.field1068.method1148(var308, 0, class213.field2982, 0);
                String var309 = class140.method1027((byte) 124, var308, class213.field2982, 0);
                class169.method1206(var309, class122.field1839, class22.field284 == 1, true, true);
                class451.field6496 = -1;
                return true;
            } else if (class451.field6496 == 204) {
                boolean var310 = class75.field1068.method2306((byte) 120) == 1;
                String var311 = class75.field1068.method2255(-32226);
                String var312 = var311;
                if (var310) {
                    var312 = class75.field1068.method2255(-32226);
                }
                long var313 = class75.field1068.method2290(-1083442040);
                long var315 = (long) class75.field1068.method2297(13352);
                long var317 = (long) class75.field1068.method2263((byte) 10);
                int var319 = class75.field1068.method2306((byte) 24);
                long var320 = (var315 << 32) + var317;
                boolean var322 = false;
                int var323 = 0;
                while (true) {
                    if (var323 >= 100) {
                        if (var319 <= 1) {
                            if (!(!class119.field1806 || class189.field2725) || class117.field1790) {
                                var322 = true;
                            } else if (class85.method684((byte) 92, var312)) {
                                var322 = true;
                            }
                        }
                        break;
                    }
                    if (class90.field1263[var323] == var320) {
                        var322 = true;
                        break;
                    }
                    var323++;
                }
                if (!var322 && class438.field6181 == 0) {
                    class90.field1263[class430.field6022] = var320;
                    class430.field6022 = (class430.field6022 + 1) % 100;
                    String var324 = class160.method1157(class119.method928(class217.method1442((byte) -79, class75.field1068), false), (byte) -117);
                    if (var319 == 2 || var319 == 3) {
                        class303.method1839("<img=1>" + var311, -1, -1, 0, class444.method2748((byte) -17, var313), 9, var324, "<img=1>" + var312);
                    } else if (var319 == 1) {
                        class303.method1839("<img=0>" + var311, -1, -1, 0, class444.method2748((byte) -17, var313), 9, var324, "<img=0>" + var312);
                    } else {
                        class303.method1839(var311, -1, -1, 0, class444.method2748((byte) -17, var313), 9, var324, var312);
                    }
                }
                class451.field6496 = -1;
                return true;
            } else if (class451.field6496 == 185) {
                class395.field5489 = class75.field1068.method2306((byte) 28);
                field5848 = class75.field1068.method2306((byte) 101);
                class391.field5440 = class75.field1068.method2306((byte) 28);
                class451.field6496 = -1;
                return true;
            } else if (class451.field6496 == 49) {
                int var325 = class75.field1068.method2265(-4);
                int var326 = class75.field1068.method2281((byte) 67);
                int var327 = class75.field1068.method2297(13352);
                if (class352.method2121(var327, -113)) {
                    class435 var328 = (class435) class171.field2415.method837((byte) -72, (long) var326);
                    class435 var329 = (class435) class171.field2415.method837((byte) -72, (long) var325);
                    if (var329 != null) {
                        class147.method1063((byte) -128, var328 == null || var328.field6146 != var329.field6146, false, var329);
                    }
                    if (var328 != null) {
                        var328.method1884(!arg0);
                        class171.field2415.method835(4, var328, (long) var325);
                    }
                    class108 var330 = class157.method1139(var326, false);
                    if (var330 != null) {
                        class298.method1821((byte) -61, var330);
                    }
                    class108 var331 = class157.method1139(var325, !arg0);
                    if (var331 != null) {
                        class298.method1821((byte) -68, var331);
                        class6.method40(true, var331, false);
                    }
                    if (class350.field4712 != -1) {
                        class282.method1769(0, 1, class350.field4712);
                    }
                }
                class451.field6496 = -1;
                return true;
            } else if (class451.field6496 == 245) {
                class67.method539(false);
                class451.field6496 = -1;
                return false;
            } else if (class451.field6496 == 149) {
                class171.method1220(0);
                class451.field6496 = -1;
                return true;
            } else if (class451.field6496 == 16) {
                class62.field840 = class260.field3595;
                if (class213.field2982 == 0) {
                    class451.field6496 = -1;
                    class67.field944 = null;
                    class395.field5492 = 0;
                    class24.field308 = null;
                    class118.field1804 = null;
                    return true;
                }
                class24.field308 = class75.field1068.method2255(-32226);
                boolean var332 = class75.field1068.method2306((byte) 81) == 1;
                if (var332) {
                    class75.field1068.method2255(-32226);
                }
                long var333 = class75.field1068.method2290(-1083442040);
                class118.field1804 = class68.method549(-18322, var333);
                class255.field3560 = class75.field1068.method2289((byte) -77);
                int var335 = class75.field1068.method2306((byte) 96);
                if (var335 == 255) {
                    class451.field6496 = -1;
                    return true;
                }
                class395.field5492 = var335;
                class34[] var336 = new class34[100];
                for (int var337 = 0; var337 < class395.field5492; var337++) {
                    var336[var337] = new class34();
                    var336[var337].field462 = class75.field1068.method2255(-32226);
                    boolean var343 = class75.field1068.method2306((byte) 101) == 1;
                    if (var343) {
                        var336[var337].field461 = class75.field1068.method2255(-32226);
                    } else {
                        var336[var337].field461 = var336[var337].field462;
                    }
                    var336[var337].field458 = class75.field1068.method2297(13352);
                    var336[var337].field463 = class75.field1068.method2289((byte) -77);
                    var336[var337].field464 = class75.field1068.method2255(-32226);
                    if (var336[var337].field461.equals(class359.field4970.field5869)) {
                        class88.field1247 = var336[var337].field463;
                    }
                }
                boolean var338 = false;
                int var339 = class395.field5492;
                while (var339 > 0) {
                    boolean var340 = true;
                    var339--;
                    for (int var341 = 0; var341 < var339; var341++) {
                        if (var336[var341].field462.compareTo(var336[var341 + 1].field462) > 0) {
                            class34 var342 = var336[var341];
                            var336[var341] = var336[var341 + 1];
                            var340 = false;
                            var336[var341 + 1] = var342;
                        }
                    }
                    if (var340) {
                        break;
                    }
                }
                class67.field944 = var336;
                class451.field6496 = -1;
                return true;
            } else if (class451.field6496 == 136) {
                class42.field541 = class75.field1068.method2306((byte) 24);
                for (int var344 = 0; var344 < class42.field541; var344++) {
                    class32.field443[var344] = class75.field1068.method2255(-32226);
                    class263.field3612[var344] = class75.field1068.method2255(-32226);
                    if (class263.field3612[var344].equals("")) {
                        class263.field3612[var344] = class32.field443[var344];
                    }
                    class394.field5478[var344] = class75.field1068.method2255(-32226);
                    class341.field4605[var344] = class75.field1068.method2255(-32226);
                    if (class341.field4605[var344].equals("")) {
                        class341.field4605[var344] = class394.field5478[var344];
                    }
                    class258.field3579[var344] = false;
                }
                class451.field6496 = -1;
                class418.field5784 = class260.field3595;
                return true;
            } else if (class451.field6496 == 5) {
                int var345 = class75.field1068.method2291(-15939);
                int var346 = class75.field1068.method2292(true);
                boolean var347 = (var346 & 0x1) == 1;
                class134.method999(var347, var345, -7);
                class4.field37[class187.method1301(31, class132.field1984++)] = var345;
                class451.field6496 = -1;
                return true;
            } else if (class451.field6496 == 89) {
                int var348 = class75.field1068.method2291(-15939);
                int var349 = class75.field1068.method2291(-15939);
                int var350 = class75.field1068.method2291(-15939);
                int var351 = class75.field1068.method2281((byte) 111);
                int var352 = class75.field1068.method2266(255);
                if (class352.method2121(var348, -46)) {
                    class157.method1138(-121, var352, var351, var349, var350);
                }
                class451.field6496 = -1;
                return true;
            } else if (class451.field6496 == 26) {
                for (int var353 = 0; var353 < class87.field1227.length; var353++) {
                    if (class87.field1227[var353] != null) {
                        class87.field1227[var353].field2619 = -1;
                    }
                }
                for (int var354 = 0; var354 < class428.field5951.length; var354++) {
                    if (class428.field5951[var354] != null) {
                        class428.field5951[var354].field2619 = -1;
                    }
                }
                class451.field6496 = -1;
                return true;
            } else if (class451.field6496 == 81) {
                int var355 = class75.field1068.method2288((byte) 68);
                int var356 = class75.field1068.method2266(255);
                if (class352.method2121(var356, -70)) {
                    class243.method1584(2047, 5, var355, 0, (byte) 66);
                }
                class451.field6496 = -1;
                return true;
            } else if (class451.field6496 == 119) {
                int var357 = class75.field1068.method2304(false);
                byte var358 = class75.field1068.method2289((byte) -77);
                class404.method2494(var357, var358, 0);
                class451.field6496 = -1;
                return true;
            } else if (class451.field6496 == 202) {
                int var359 = class75.field1068.method2297(13352);
                if (var359 == 65535) {
                    var359 = -1;
                }
                int var360 = class75.field1068.method2297(13352);
                int var361 = class75.field1068.method2281((byte) 84);
                if (class352.method2121(var360, -59)) {
                    class52.method424(var361, (byte) -94, var359);
                }
                class451.field6496 = -1;
                return true;
            } else if (class451.field6496 == 58) {
                class356.field4784 = class75.field1068.method2257((byte) 110);
                class451.field6496 = -1;
                class115.field1751 = class260.field3595;
                return true;
            } else if (class451.field6496 == 140) {
                class139.method1023((byte) 107);
                class451.field6496 = -1;
                return true;
            } else if (class451.field6496 == 219) {
                class63.field852 = class75.field1068.method2306((byte) 67);
                class451.field6496 = -1;
                return true;
            } else if (class451.field6496 == 82) {
                class56.field732 = class75.field1068.method2306((byte) 66);
                class412.field5730 = class75.field1068.method2306((byte) 80);
                while (class75.field1068.field5048 < class213.field2982) {
                    class451.field6496 = class75.field1068.method2306((byte) 85);
                    class423.method2614(arg0);
                }
                class451.field6496 = -1;
                return true;
            } else if (class451.field6496 == 131) {
                int var362 = class75.field1068.method2258(1177515464);
                int var363 = class75.field1068.method2277((byte) 107);
                int var364 = class75.field1068.method2291(-15939);
                if (class352.method2121(var364, -71)) {
                    class225.method1472(119, var363, var362);
                }
                class451.field6496 = -1;
                return true;
            } else if (class451.field6496 == 188) {
                boolean var365 = class75.field1068.method2306((byte) 31) == 1;
                String var366 = class75.field1068.method2255(-32226);
                String var367 = var366;
                if (var365) {
                    var367 = class75.field1068.method2255(-32226);
                }
                long var368 = (long) class75.field1068.method2297(13352);
                long var370 = (long) class75.field1068.method2263((byte) 10);
                int var372 = class75.field1068.method2306((byte) 74);
                int var373 = class75.field1068.method2297(13352);
                long var374 = (var368 << 32) + var370;
                boolean var376 = false;
                int var377 = 0;
                while (true) {
                    if (var377 >= 100) {
                        if (var372 <= 1 && class85.method684((byte) 92, var367)) {
                            var376 = true;
                        }
                        break;
                    }
                    if (class90.field1263[var377] == var374) {
                        var376 = true;
                        break;
                    }
                    var377++;
                }
                if (!var376 && class438.field6181 == 0) {
                    class90.field1263[class430.field6022] = var374;
                    class430.field6022 = (class430.field6022 + 1) % 100;
                    String var378 = class128.method967(var373, -1979350136).method810(class75.field1068, (byte) -22);
                    if (var372 == 2) {
                        class303.method1839("<img=1>" + var366, -1, var373, 0, (String) null, 18, var378, "<img=1>" + var367);
                    } else if (var372 == 1) {
                        class303.method1839("<img=0>" + var366, -1, var373, 0, (String) null, 18, var378, "<img=0>" + var367);
                    } else {
                        class303.method1839(var366, -1, var373, 0, (String) null, 18, var378, var367);
                    }
                }
                class451.field6496 = -1;
                return true;
            } else {
                class48.method399((byte) 86, (Throwable) null, "T1 - " + class451.field6496 + "," + class21.field272 + "," + class304.field4149 + " - " + class213.field2982);
                class67.method539(false);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(B)V")
    public static void method2605(byte arg0) {
        if (arg0 < 94) {
            method2607(-123, -93);
        }
        field5846 = null;
        field5841 = null;
        field5838 = null;
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(Z)V")
    public final void method2606(boolean arg0) {
        field5840++;
        if (!arg0 && this.field5837 != null) {
            this.field5837.field5847 = this.field5847;
            this.field5847.field5837 = this.field5837;
            this.field5847 = null;
            this.field5837 = null;
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(II)V")
    public static final void method2607(int arg0, int arg1) {
        int var2 = -116 / ((arg1 - 39) / 54);
        class279.field3801.method2531(arg0, 112);
        field5839++;
    }
}
