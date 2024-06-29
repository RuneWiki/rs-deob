import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class6 {

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "[Lfe;")
    public static class635[] field57 = new class635[4];

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "Llc;")
    public static class435 field59 = new class435(99, 3);

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "Llc;")
    public static class435 field62 = new class435(67, 6);

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)Z", line = 6)
    public static final boolean method24(int arg0) throws IOException {
        field61++;
        if (class325.field4415 == null) {
            return false;
        }
        if (class53.field834 == null) {
            if (class639.field9058) {
                if (!class325.field4415.method1579(1, 25562)) {
                    return false;
                }
                class325.field4415.method1577(false, class352.field5213.field6800, 1, 0);
                class671.field9570 = 0;
                class716.field10111++;
                class639.field9058 = false;
            }
            class352.field5213.field6864 = 0;
            if (class352.field5213.method1197(-437324479)) {
                if (!class325.field4415.method1579(1, 25562)) {
                    return false;
                }
                class325.field4415.method1577(false, class352.field5213.field6800, 1, 1);
                class671.field9570 = 0;
                class716.field10111++;
            }
            class639.field9058 = true;
            class435[] var1 = class335.method2051(29);
            int var2 = class352.field5213.method1207(false);
            if (var2 < 0 || var2 >= var1.length) {
                throw new IOException("invo:" + var2 + " ip:" + class352.field5213.field6864);
            }
            class53.field834 = var1[var2];
            class322.field4395 = class53.field834.field6222;
        }
        if (class322.field4395 == -1) {
            if (!class325.field4415.method1579(1, 25562)) {
                return false;
            }
            class325.field4415.method1577(false, class352.field5213.field6800, 1, 0);
            class716.field10111++;
            class322.field4395 = class352.field5213.field6800[0] & 0xFF;
            class671.field9570 = 0;
        }
        if (class322.field4395 == -2) {
            if (!class325.field4415.method1579(2, 25562)) {
                return false;
            }
            class325.field4415.method1577(false, class352.field5213.field6800, 2, 0);
            class352.field5213.field6864 = 0;
            class322.field4395 = class352.field5213.method2882(-1);
            class716.field10111 += 2;
            class671.field9570 = 0;
        }
        if (class322.field4395 > 0) {
            if (!class325.field4415.method1579(class322.field4395, 25562)) {
                return false;
            }
            class352.field5213.field6864 = 0;
            class325.field4415.method1577(false, class352.field5213.field6800, class322.field4395, 0);
            class671.field9570 = 0;
            class716.field10111 += class322.field4395;
        }
        class93.field1338 = class94.field1353;
        class94.field1353 = class362.field5296;
        class362.field5296 = class53.field834;
        if (class64.field1010 == class53.field834) {
            int var3 = class352.field5213.method2897(65280);
            if (var3 == 65535) {
                var3 = -1;
            }
            int var4 = class352.field5213.method2884((byte) -37);
            class200.method1419(false);
            class186.method1317(-126, 1, var3, -1, var4);
            class53.field834 = null;
            return true;
        } else if (class92.field1309 == class53.field834) {
            boolean var5 = class352.field5213.method2886(true) == 1;
            byte[] var6 = new byte[class322.field4395 - 1];
            class352.field5213.method2867(-290150072, var6, class322.field4395 - 1, 0);
            class208.method1483(var5, 20259, var6);
            class53.field834 = null;
            return true;
        } else if (class53.field834 == class41.field696) {
            boolean var7 = class352.field5213.method2920(-27357) == 1;
            class200.method1419(false);
            class348.field5156 = var7;
            class53.field834 = null;
            return true;
        } else if (class53.field834 == class524.field7612) {
            class691.method3905((byte) 112, class325.field4403);
            class53.field834 = null;
            return true;
        } else if (class53.field834 == class233.field3495) {
            int var8 = class352.field5213.method2883(-2) << 2;
            int var9 = class352.field5213.method2904(98);
            int var10 = class352.field5213.method2886(true);
            int var11 = class352.field5213.method2886(true);
            int var12 = class352.field5213.method2886(true);
            class200.method1419(false);
            class701.method3935(var12, var10, 10198, var8, var9, var11, true);
            class53.field834 = null;
            return true;
        } else if (class53.field834 == class231.field3474) {
            int var13 = class352.field5213.method2886(true);
            byte var14 = class352.field5213.method2906(128);
            class200.method1419(false);
            class380.method2356(77, var14, var13);
            class53.field834 = null;
            return true;
        } else if (class53.field834 == class259.field3701) {
            int var15 = class352.field5213.method2892((byte) 51);
            int var16 = class352.field5213.method2884((byte) -37);
            class226.field3372.method6((byte) 119, var15, var16);
            class53.field834 = null;
            return true;
        } else if (class53.field834 == class304.field4149) {
            int var17 = class352.field5213.method2920(-27357);
            int var18 = class352.field5213.method2882(-1);
            boolean var19 = (var17 & 0x1) == 1;
            class99.method750(var19, 121, var18);
            class70.field1075[class368.method2314(31, class666.field9523++)] = var18;
            class53.field834 = null;
            return true;
        } else if (class566.field8195 == class53.field834) {
            int var20 = class352.field5213.method2882(-1);
            int var21 = class352.field5213.method2882(-1);
            int var22 = class352.field5213.method2882(-1);
            class200.method1419(false);
            if (class600.field8524[var20] != null) {
                for (int var23 = var21; var23 < var22; var23++) {
                    int var24 = class352.field5213.method2865(255);
                    if (class600.field8524[var20].length > var23 && class600.field8524[var20][var23] != null) {
                        class600.field8524[var20][var23].field2076 = var24;
                    }
                }
            }
            class53.field834 = null;
            return true;
        } else if (class53.field834 == class316.field4269) {
            class39.method419(true);
            class53.field834 = null;
            return true;
        } else if (class53.field834 == class193.field2830) {
            class441.method2699((byte) 82);
            class53.field834 = null;
            return false;
        } else if (class645.field9281 == class53.field834) {
            int var25 = class352.field5213.method2885(-116);
            int var26 = class352.field5213.method2882(-1);
            class200.method1419(false);
            class34.method180(var25, (byte) 24, var26);
            class53.field834 = null;
            return true;
        } else if (class566.field8196 == class53.field834) {
            boolean var27 = class352.field5213.method2886(true) == 1;
            String var28 = class352.field5213.method2894(-13192);
            String var29 = var28;
            if (var27) {
                var29 = class352.field5213.method2894(-13192);
            }
            long var30 = (long) class352.field5213.method2882(-1);
            long var32 = (long) class352.field5213.method2865(255);
            int var34 = class352.field5213.method2886(true);
            int var35 = class352.field5213.method2882(-1);
            long var36 = (var30 << 32) + var32;
            boolean var38 = false;
            int var39 = 0;
            while (true) {
                if (var39 >= 100) {
                    if (var34 <= 1 && class188.method1327(var29, false)) {
                        var38 = true;
                    }
                    break;
                }
                if (class713.field10034[var39] == var36) {
                    var38 = true;
                    break;
                }
                var39++;
            }
            if (!var38 && class481.field6878 == 0) {
                class713.field10034[class598.field8496] = var36;
                class598.field8496 = (class598.field8496 + 1) % 100;
                String var40 = class492.field7082.method2779(var35, 115).method4008(class352.field5213, 0);
                if (var34 == 2) {
                    class399.method2417(false, "<img=1>" + var28, var35, var28, 0, "<img=1>" + var29, 18, var40, null);
                } else if (var34 == 1) {
                    class399.method2417(false, "<img=0>" + var28, var35, var28, 0, "<img=0>" + var29, 18, var40, null);
                } else {
                    class399.method2417(false, var28, var35, var28, 0, var29, 18, var40, null);
                }
            }
            class53.field834 = null;
            return true;
        } else if (class53.field834 == class139.field1901) {
            int var41 = class352.field5213.method2892((byte) 51);
            class200.method1419(false);
            class153.method1106(120, var41);
            class53.field834 = null;
            return true;
        } else if (field62 == class53.field834) {
            int var42 = class352.field5213.method2882(-1);
            if (var42 == 65535) {
                var42 = -1;
            }
            int var43 = class352.field5213.method2886(true);
            int var44 = class352.field5213.method2882(-1);
            int var45 = class352.field5213.method2886(true);
            class588.method3458(var43, var42, var44, true, 256, (byte) -64, var45);
            class53.field834 = null;
            return true;
        } else if (class53.field834 == class355.field5238) {
            int var46 = class352.field5213.method2897(65280);
            byte var47 = class352.field5213.method2915(-112);
            class200.method1419(false);
            class728.method4064(var47, var46, (byte) -94);
            class53.field834 = null;
            return true;
        } else if (class53.field834 == class299.field4081) {
            boolean var48 = class352.field5213.method2886(true) == 1;
            String var49 = class352.field5213.method2894(-13192);
            String var50 = var49;
            if (var48) {
                var50 = class352.field5213.method2894(-13192);
            }
            int var51 = class352.field5213.method2886(true);
            int var52 = class352.field5213.method2882(-1);
            boolean var53 = false;
            if (var51 <= 1 && class188.method1327(var50, false)) {
                var53 = true;
            }
            if (!var53 && class481.field6878 == 0) {
                String var54 = class492.field7082.method2779(var52, 118).method4008(class352.field5213, 0);
                if (var51 == 2) {
                    class399.method2417(false, "<img=1>" + var49, var52, var49, 0, "<img=1>" + var50, 25, var54, null);
                } else if (var51 == 1) {
                    class399.method2417(false, "<img=0>" + var49, var52, var49, 0, "<img=0>" + var50, 25, var54, null);
                } else {
                    class399.method2417(false, var49, var52, var49, 0, var50, 25, var54, null);
                }
            }
            class53.field834 = null;
            return true;
        } else if (class53.field834 == class37.field336) {
            int var55 = class352.field5213.method2868(-70);
            int var56 = class352.field5213.method2870(-11395);
            int var57 = class352.field5213.method2896(255);
            class200.method1419(false);
            class739.method4129(var56, var55, 11, var57);
            class53.field834 = null;
            return true;
        } else if (class53.field834 == class270.field3829) {
            int var58 = class352.field5213.method2882(-1);
            int var59 = class352.field5213.method2883(-2);
            int var60 = class352.field5213.method2897(65280);
            int var61 = class352.field5213.method2885(-120);
            int var62 = class352.field5213.method2886(true);
            boolean var63 = (var62 & 0x80) != 0;
            int var64 = var62 & 0x7;
            int var65 = (var62 & 0x7C) >> 3;
            if (var65 == 15) {
                var65 = -1;
            }
            if (var61 >> 30 != 0) {
                int var66 = var61 >> 28 & 0x3;
                int var67 = ((var61 & 0xFFFFBDA) >> 14) - class41.field693;
                int var68 = (var61 & 0x3FFF) - class71.field1085;
                if (var67 >= 0 && var68 >= 0 && var67 < class184.field2546 && class240.field3555 > var68) {
                    int var69 = var67 * 512 + 256;
                    int var70 = var68 * 512 + 256;
                    int var71 = var66;
                    if (var66 < 3 && class547.method3292((byte) -85, var68, var67)) {
                        var71 = var66 + 1;
                    }
                    class124 var72 = new class124(var58, var60, class703.field9918, var66, var71, var69, class530.method3211(var70, 2, var69, var66) - var59, var70, var67, var67, var68, var68, var64);
                    class23.field214.method3559(new class137(var72), (byte) 12);
                }
            } else if (var61 >> 29 != 0) {
                int var73 = var61 & 0xFFFF;
                class63 var74 = (class63) class389.field5608.method4020((long) var73, (byte) -76);
                if (var74 != null) {
                    class571 var75 = var74.field1004;
                    if (var58 == 65535) {
                        var58 = -1;
                    }
                    boolean var76 = true;
                    int var77 = var63 ? var75.field4544 : var75.field4547;
                    if (var58 != -1 && var77 != -1) {
                        if (var58 == var77) {
                            class365 var78 = class596.field8476.method2263(var58, -117);
                            if (var78.field5345 && var78.field5332 != -1) {
                                class131 var79 = class610.field8698.method2999(var78.field5332, false);
                                int var80 = var79.field1806;
                                if (var80 == 0 || var80 == 2) {
                                    var76 = false;
                                } else if (var80 == 1) {
                                    var76 = true;
                                }
                            }
                        } else {
                            class365 var81 = class596.field8476.method2263(var58, -117);
                            class365 var82 = class596.field8476.method2263(var77, -124);
                            if (var81.field5332 != -1 && var82.field5332 != -1) {
                                class131 var83 = class610.field8698.method2999(var81.field5332, false);
                                class131 var84 = class610.field8698.method2999(var82.field5332, false);
                                if (var84.field1784 > var83.field1784) {
                                    var76 = false;
                                }
                            }
                        }
                    }
                    if (var76) {
                        if (var63) {
                            var75.field4544 = var58;
                            var75.field4621 = var65;
                            var75.field4600 = 0;
                            var75.field4623 = 0;
                            var75.field4624 = var59;
                            var75.field4554 = 1;
                            var75.field4543 = class703.field9918 + var60;
                            var75.field4588 = var64;
                            if (class703.field9918 < var75.field4543) {
                                var75.field4600 = -1;
                            }
                            if (var75.field4544 != -1 && class703.field9918 == var75.field4543) {
                                int var85 = class596.field8476.method2263(var75.field4544, -118).field5332;
                                if (var85 != -1) {
                                    class131 var86 = class610.field8698.method2999(var85, false);
                                    if (var86 != null && var86.field1792 != null && !var75.field4612) {
                                        class701.method3941(0, var86, (byte) 101, var75);
                                    }
                                }
                            }
                        } else {
                            var75.field4587 = class703.field9918 + var60;
                            var75.field4541 = 0;
                            var75.field4547 = var58;
                            var75.field4539 = var64;
                            var75.field4604 = 1;
                            var75.field4546 = var65;
                            var75.field4568 = var59;
                            var75.field4584 = 0;
                            if (class703.field9918 < var75.field4587) {
                                var75.field4541 = -1;
                            }
                            if (var75.field4547 != -1 && class703.field9918 == var75.field4587) {
                                int var87 = class596.field8476.method2263(var75.field4547, -117).field5332;
                                if (var87 != -1) {
                                    class131 var88 = class610.field8698.method2999(var87, false);
                                    if (var88 != null && var88.field1792 != null && !var75.field4612) {
                                        class701.method3941(0, var88, (byte) 101, var75);
                                    }
                                }
                            }
                        }
                    }
                }
            } else if ((var61 >> 28) != 0) {
                int var89 = var61 & 0xFFFF;
                class639 var90;
                if (class652.field9348 == var89) {
                    var90 = class108.field1536;
                } else {
                    var90 = class536.field7796[var89];
                }
                if (var90 != null) {
                    if (var58 == 65535) {
                        var58 = -1;
                    }
                    boolean var91 = true;
                    int var92 = var63 ? var90.field4544 : var90.field4547;
                    if (var58 != -1 && var92 != -1) {
                        if (var58 == var92) {
                            class365 var97 = class596.field8476.method2263(var58, -126);
                            if (var97.field5345 && var97.field5332 != -1) {
                                class131 var98 = class610.field8698.method2999(var97.field5332, false);
                                int var99 = var98.field1806;
                                if (var99 == 0 || var99 == 2) {
                                    var91 = false;
                                } else if (var99 == 1) {
                                    var91 = true;
                                }
                            }
                        } else {
                            class365 var93 = class596.field8476.method2263(var58, -103);
                            class365 var94 = class596.field8476.method2263(var92, -113);
                            if (var93.field5332 != -1 && var94.field5332 != -1) {
                                class131 var95 = class610.field8698.method2999(var93.field5332, false);
                                class131 var96 = class610.field8698.method2999(var94.field5332, false);
                                if (var96.field1784 > var95.field1784) {
                                    var91 = false;
                                }
                            }
                        }
                    }
                    if (var91) {
                        if (var63) {
                            var90.field4624 = var59;
                            var90.field4554 = 1;
                            var90.field4600 = 0;
                            var90.field4588 = var64;
                            var90.field4623 = 0;
                            var90.field4621 = var65;
                            var90.field4543 = class703.field9918 + var60;
                            var90.field4544 = var58;
                            if (class703.field9918 < var90.field4543) {
                                var90.field4600 = -1;
                            }
                            if (var90.field4544 == 65535) {
                                var90.field4544 = -1;
                            }
                            if (var90.field4544 != -1 && class703.field9918 == var90.field4543) {
                                int var102 = class596.field8476.method2263(var90.field4544, -112).field5332;
                                if (var102 != -1) {
                                    class131 var103 = class610.field8698.method2999(var102, false);
                                    if (var103 != null && var103.field1792 != null && !var90.field4612) {
                                        class701.method3941(0, var103, (byte) 101, var90);
                                    }
                                }
                            }
                        } else {
                            var90.field4568 = var59;
                            var90.field4539 = var64;
                            var90.field4547 = var58;
                            var90.field4541 = 0;
                            var90.field4546 = var65;
                            var90.field4584 = 0;
                            var90.field4604 = 1;
                            var90.field4587 = class703.field9918 + var60;
                            if (class703.field9918 < var90.field4587) {
                                var90.field4541 = -1;
                            }
                            if (var90.field4547 == 65535) {
                                var90.field4547 = -1;
                            }
                            if (var90.field4547 != -1 && class703.field9918 == var90.field4587) {
                                int var100 = class596.field8476.method2263(var90.field4547, -121).field5332;
                                if (var100 != -1) {
                                    class131 var101 = class610.field8698.method2999(var100, false);
                                    if (var101 != null && var101.field1792 != null && !var90.field4612) {
                                        class701.method3941(0, var101, (byte) 101, var90);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            class53.field834 = null;
            return true;
        } else if (class80.field1146 == class53.field834) {
            String var104 = class352.field5213.method2894(-13192);
            Object[] var105 = new Object[var104.length() + 1];
            for (int var106 = var104.length() - 1; var106 >= 0; var106--) {
                if (var104.charAt(var106) == 's') {
                    var105[var106 + 1] = class352.field5213.method2894(-13192);
                } else {
                    var105[var106 + 1] = Integer.valueOf(class352.field5213.method2868(-76));
                }
            }
            var105[0] = Integer.valueOf(class352.field5213.method2868(-101));
            class200.method1419(false);
            class362 var107 = new class362();
            var107.field5297 = var105;
            class529.method3207(var107);
            class53.field834 = null;
            return true;
        } else if (class95.field1380 == class53.field834) {
            int var108 = class352.field5213.method2897(65280);
            int var109 = class352.field5213.method2924((byte) -126);
            class226.field3372.method6((byte) 17, var108, var109);
            class53.field834 = null;
            return true;
        } else if (class53.field834 == class3.field17) {
            class691.method3905((byte) 112, class22.field209);
            class53.field834 = null;
            return true;
        } else if (class551.field8037 == class53.field834) {
            int var110 = class352.field5213.method2897(65280);
            int var111 = class352.field5213.method2868(-100);
            class200.method1419(false);
            class728.method4064(var111, var110, (byte) -94);
            class53.field834 = null;
            return true;
        } else if (class53.field834 == class337.field4659) {
            int var112 = class352.field5213.method2868(-77);
            class601.field8532 = class345.field4749.method1881(94, var112);
            class53.field834 = null;
            return true;
        } else {
            if (arg0 <= 29) {
                method25((byte) -51);
            }
            if (class54.field836 == class53.field834) {
                int[] var113 = new int[4];
                for (int var114 = 0; var114 < 4; var114++) {
                    var113[var114] = class352.field5213.method2892((byte) 51);
                }
                int var115 = class352.field5213.method2886(true);
                int var116 = class352.field5213.method2897(65280);
                class63 var117 = (class63) class389.field5608.method4020((long) var116, (byte) -128);
                if (var117 != null) {
                    class132.method935(0, var115, var117.field1004, var113);
                }
                class53.field834 = null;
                return true;
            } else if (class53.field834 == class176.field2465) {
                class200.method1419(false);
                class493.method2998(3);
                class53.field834 = null;
                return true;
            } else if (class753.field10502 == class53.field834) {
                int var118 = class352.field5213.method2885(-127);
                class200.method1419(false);
                class186.method1317(-102, 3, -1, -1, var118);
                class53.field834 = null;
                return true;
            } else if (class53.field834 == class246.field3597) {
                class352.field5213.field6864 += 28;
                if (class352.field5213.method2921(0)) {
                    class639.method3683(class352.field5213.field6864 - 28, 28395, class352.field5213);
                }
                class53.field834 = null;
                return true;
            } else if (class53.field834 == class277.field3893) {
                if (class488.method2970(class369.field5392, false)) {
                    class326.field4421 = (int) ((float) class352.field5213.method2882(-1) * 2.5F);
                } else {
                    class326.field4421 = class352.field5213.method2882(-1) * 30;
                }
                class590.field8390 = class152.field2225;
                class53.field834 = null;
                return true;
            } else if (class53.field834 == class21.field194) {
                for (int var119 = 0; var119 < class536.field7796.length; var119++) {
                    if (class536.field7796[var119] != null) {
                        class536.field7796[var119].field4564 = null;
                        class536.field7796[var119].field4545 = -1;
                    }
                }
                for (int var120 = 0; var120 < class551.field8042; var120++) {
                    class414.field5889[var120].field1004.field4564 = null;
                    class414.field5889[var120].field1004.field4545 = -1;
                }
                class53.field834 = null;
                return true;
            } else if (class53.field834 == class525.field7621) {
                int var121 = class352.field5213.method2886(true);
                if (class352.field5213.method2886(true) == 0) {
                    class83.field1220[var121] = new class505();
                } else {
                    class352.field5213.field6864--;
                    class83.field1220[var121] = new class505(class352.field5213);
                }
                class204.field3062 = class152.field2225;
                class53.field834 = null;
                return true;
            } else if (class656.field9400 == class53.field834) {
                int var122 = class352.field5213.method2886(true);
                int var123 = class352.field5213.method2924((byte) -119);
                int var124 = class352.field5213.method2904(28);
                int var125 = class352.field5213.method2882(-1);
                int var126 = class352.field5213.method2904(88);
                class200.method1419(false);
                class157.field2258[var126] = true;
                class372.field5404[var126] = var123;
                class690.field9785[var126] = var122;
                class669.field9542[var126] = var124;
                class408.field5805[var126] = var125;
                class53.field834 = null;
                return true;
            } else if (class691.field9795 == class53.field834) {
                int var127 = class352.field5213.method2882(-1);
                int var128 = class352.field5213.method2886(true);
                boolean var129 = (var128 & 0x1) == 1;
                while (class352.field5213.field6864 < class322.field4395) {
                    int var130 = class352.field5213.method2889(-18098);
                    int var131 = class352.field5213.method2882(-1);
                    int var132 = 0;
                    if (var131 != 0) {
                        var132 = class352.field5213.method2886(true);
                        if (var132 == 255) {
                            var132 = class352.field5213.method2868(-111);
                        }
                    }
                    class552.method3322(var127, var132, var130, var129, var131 - 1, (byte) 83);
                }
                class70.field1075[class368.method2314(class666.field9523++, 31)] = var127;
                class53.field834 = null;
                return true;
            } else if (class755.field10519 == class53.field834) {
                class214.field3213 = class352.field5213.method2904(91);
                class95.field1382 = class352.field5213.method2911((byte) 88) << 3;
                class182.field2506 = class352.field5213.method2906(128) << 3;
                for (class340 var133 = (class340) class591.field8409.method4023((byte) -39); var133 != null; var133 = (class340) class591.field8409.method4021((byte) 80)) {
                    int var135 = (int) (var133.field6188 >> 28 & 0x3L);
                    int var136 = (int) (var133.field6188 & 0x3FFFL);
                    int var137 = var136 - class41.field693;
                    int var138 = (int) (var133.field6188 >> 14 & 0x3FFFL);
                    int var139 = var138 - class71.field1085;
                    if (class214.field3213 == var135 && class182.field2506 <= var137 && class182.field2506 + 8 > var137 && class95.field1382 <= var139 && var139 < (class95.field1382 + 8)) {
                        var133.method2656((byte) 120);
                        if (var137 >= 0 && var139 >= 0 && class184.field2546 > var137 && var139 < class240.field3555) {
                            class623.method3600((byte) -117, var139, class214.field3213, var137);
                        }
                    }
                }
                for (class279 var134 = (class279) class154.field2233.method3565(-106); var134 != null; var134 = (class279) class154.field2233.method3561((byte) 50)) {
                    if (var134.field3906 >= class182.field2506 && class182.field2506 + 8 > var134.field3906 && var134.field3901 >= class95.field1382 && var134.field3901 < (class95.field1382 + 8) && class214.field3213 == var134.field3899) {
                        var134.field3909 = 0;
                    }
                }
                class53.field834 = null;
                return true;
            } else if (class743.field10368 == class53.field834) {
                int var140 = class352.field5213.method2871(-2);
                int var141 = class352.field5213.method2883(-2);
                int var142 = class352.field5213.method2897(65280);
                if (var142 == 65535) {
                    var142 = -1;
                }
                int var143 = class352.field5213.method2883(-2);
                if (var143 == 65535) {
                    var143 = -1;
                }
                class200.method1419(false);
                for (int var144 = var143; var144 <= var142; var144++) {
                    long var145 = ((long) var140 << 32) + (long) var144;
                    class478 var147 = (class478) class491.field7069.method4020(var145, (byte) -85);
                    class478 var148;
                    if (var147 != null) {
                        var148 = new class478(var147.field6793, var141);
                        var147.method2656((byte) 117);
                    } else if (var144 == -1) {
                        var148 = new class478(class250.method1689(var140, false).field1980.field6793, var141);
                    } else {
                        var148 = new class478(0, var141);
                    }
                    class491.field7069.method4022(var148, 120, var145);
                }
                class53.field834 = null;
                return true;
            } else if (class53.field834 == class417.field5971) {
                int var149 = class352.field5213.method2886(true);
                boolean var150 = (var149 & 0x1) == 1;
                String var151 = class352.field5213.method2894(-13192);
                String var152 = class352.field5213.method2894(-13192);
                if (var152.equals("")) {
                    var152 = var151;
                }
                String var153 = class352.field5213.method2894(-13192);
                String var154 = class352.field5213.method2894(-13192);
                if (var154.equals("")) {
                    var154 = var153;
                }
                if (var150) {
                    for (int var155 = 0; var155 < class365.field5352; var155++) {
                        if (class11.field101[var155].equals(var154)) {
                            class716.field10113[var155] = var151;
                            class11.field101[var155] = var152;
                            class751.field10462[var155] = var153;
                            class667.field9525[var155] = var154;
                            break;
                        }
                    }
                } else {
                    class716.field10113[class365.field5352] = var151;
                    class11.field101[class365.field5352] = var152;
                    class751.field10462[class365.field5352] = var153;
                    class667.field9525[class365.field5352] = var154;
                    class363.field5308[class365.field5352] = class368.method2314(2, var149) == 2;
                    class365.field5352++;
                }
                class53.field834 = null;
                class363.field5307 = class152.field2225;
                return true;
            } else if (class53.field834 == class294.field4031) {
                int var156 = class352.field5213.method2889(-18098);
                int var157 = class352.field5213.method2868(-74);
                int var158 = class352.field5213.method2886(true);
                String var159 = "";
                String var160 = var159;
                if ((var158 & 0x1) != 0) {
                    var159 = class352.field5213.method2894(-13192);
                    if ((var158 & 0x2) == 0) {
                        var160 = var159;
                    } else {
                        var160 = class352.field5213.method2894(-13192);
                    }
                }
                String var161 = class352.field5213.method2894(-13192);
                if (var156 == 99) {
                    class646.method3726(var161, -103);
                } else if (var160.equals("") || !class188.method1327(var160, false)) {
                    class145.method1013(var161, (byte) 101, var159, var156, var157, var160, var159);
                } else {
                    class53.field834 = null;
                    return true;
                }
                class53.field834 = null;
                return true;
            } else if (class53.field834 == class495.field7120) {
                class691.method3905((byte) 112, class262.field3767);
                class53.field834 = null;
                return true;
            } else if (class53.field834 == class352.field5211) {
                if (class214.field3211 != null) {
                    class301.method1886(-1, false, (byte) 71, -1, class243.field3580.field7993.method2653(false));
                }
                byte[] var162 = new byte[class322.field4395];
                class352.field5213.method1198(var162, 0, class322.field4395, -21233);
                String var163 = class62.method577(126, var162, class322.field4395, 0);
                class433.method2661(true, class243.field3580.field7975.method3775(false) == 1, 0, var163, class345.field4749);
                class53.field834 = null;
                return true;
            } else if (class53.field834 == class271.field3849) {
                int var164 = class352.field5213.method2868(-102);
                int var165 = class352.field5213.method2883(-2);
                if (var165 == 65535) {
                    var165 = -1;
                }
                class200.method1419(false);
                class55.method494(var165, (byte) -49, var164);
                class53.field834 = null;
                return true;
            } else if (class70.field1074 == class53.field834) {
                class70.field1076 = class352.field5213.method2908(-125);
                class321.field4368 = class352.field5213.method2886(true) == 1;
                class53.field834 = null;
                return true;
            } else if (class53.field834 == class283.field3952) {
                class365.field5352 = class352.field5213.method2886(true);
                for (int var166 = 0; var166 < class365.field5352; var166++) {
                    class716.field10113[var166] = class352.field5213.method2894(-13192);
                    class11.field101[var166] = class352.field5213.method2894(-13192);
                    if (class11.field101[var166].equals("")) {
                        class11.field101[var166] = class716.field10113[var166];
                    }
                    class751.field10462[var166] = class352.field5213.method2894(-13192);
                    class667.field9525[var166] = class352.field5213.method2894(-13192);
                    if (class667.field9525[var166].equals("")) {
                        class667.field9525[var166] = class751.field10462[var166];
                    }
                    class363.field5308[var166] = false;
                }
                class53.field834 = null;
                class363.field5307 = class152.field2225;
                return true;
            } else if (class695.field9825 == class53.field834) {
                int var167 = class352.field5213.method2892((byte) 51);
                String var168 = class352.field5213.method2894(-13192);
                class200.method1419(false);
                class634.method3630(var167, var168, (byte) -116);
                class53.field834 = null;
                return true;
            } else if (class53.field834 == class240.field3560) {
                int var169 = class352.field5213.method2884((byte) -37);
                int var170 = class352.field5213.method2882(-1);
                class200.method1419(false);
                class512.method3113(var170, var169, 64);
                class53.field834 = null;
                return true;
            } else if (class53.field834 == class196.field2866) {
                class226.field3372.method7(124);
                class53.field834 = null;
                class513.field7436 += 32;
                return true;
            } else if (class635.field8954 == class53.field834) {
                class499.field7175 = class352.field5213.method2924((byte) -113);
                class433.field6210 = class352.field5213.method2920(-27357);
                class53.field834 = null;
                return true;
            } else if (class99.field1435 == class53.field834) {
                boolean var171 = class352.field5213.method2886(true) == 1;
                String var172 = class352.field5213.method2894(-13192);
                String var173 = var172;
                if (var171) {
                    var173 = class352.field5213.method2894(-13192);
                }
                long var174 = (long) class352.field5213.method2882(-1);
                long var176 = (long) class352.field5213.method2865(255);
                int var178 = class352.field5213.method2886(true);
                long var179 = (var174 << 32) + var176;
                boolean var181 = false;
                int var182 = 0;
                while (true) {
                    if (var182 >= 100) {
                        if (var178 <= 1) {
                            if (!(!class321.field4368 || class212.field3171) || class748.field10423) {
                                var181 = true;
                            } else if (class188.method1327(var173, false)) {
                                var181 = true;
                            }
                        }
                        break;
                    }
                    if (class713.field10034[var182] == var179) {
                        var181 = true;
                        break;
                    }
                    var182++;
                }
                if (!var181 && class481.field6878 == 0) {
                    class713.field10034[class598.field8496] = var179;
                    class598.field8496 = (class598.field8496 + 1) % 100;
                    String var183 = class165.method1183(class748.method4172(0, class352.field5213), -13970);
                    if (var178 == 2) {
                        class399.method2417(false, "<img=1>" + var172, -1, var172, 0, "<img=1>" + var173, 7, var183, null);
                    } else if (var178 == 1) {
                        class399.method2417(false, "<img=0>" + var172, -1, var172, 0, "<img=0>" + var173, 7, var183, null);
                    } else {
                        class399.method2417(false, var172, -1, var172, 0, var173, 3, var183, null);
                    }
                }
                class53.field834 = null;
                return true;
            } else if (class614.field8766 == class53.field834) {
                int var184 = class352.field5213.method2896(255);
                int var185 = class352.field5213.method2871(-2);
                class200.method1419(false);
                class322.method1997(var184, var185, (byte) -83);
                class53.field834 = null;
                return true;
            } else if (class53.field834 == class345.field4739) {
                int var186 = class352.field5213.method2884((byte) -37);
                int var187 = class352.field5213.method2868(-100);
                int var188 = class352.field5213.method2897(65280);
                if (var188 == 65535) {
                    var188 = -1;
                }
                class200.method1419(false);
                class207.method1476(var188, var186, var187, 1);
                class424 var189 = class425.field6147.method4144(var188, 127);
                class603.method3512(var189.field6063, var187, 11693, var189.field6128, var189.field6106);
                class250.method1687(var189.field6119, var187, true, var189.field6073, var189.field6067);
                class53.field834 = null;
                return true;
            } else if (class53.field834 == class357.field5268) {
                class691.method3905((byte) 112, class42.field703);
                class53.field834 = null;
                return true;
            } else if (class53.field834 == class466.field6639) {
                int var190 = class352.field5213.method2882(-1);
                class639 var191;
                if (class652.field9348 == var190) {
                    var191 = class108.field1536;
                } else {
                    var191 = class536.field7796[var190];
                }
                if (var191 == null) {
                    class53.field834 = null;
                    return true;
                }
                int var192 = class352.field5213.method2882(-1);
                int var193 = class352.field5213.method2886(true);
                boolean var194 = (var192 & 0x8000) != 0;
                if (var191.field9056 != null && var191.field9081 != null) {
                    boolean var195 = false;
                    if (var193 <= 1) {
                        if (!var194 && (class321.field4368 && !class212.field3171 || class748.field10423)) {
                            var195 = true;
                        } else if (class188.method1327(var191.field9056, false)) {
                            var195 = true;
                        }
                    }
                    if (!var195 && class481.field6878 == 0) {
                        int var196 = -1;
                        String var197;
                        if (var194) {
                            var192 &= 0x7FFF;
                            class21 var198 = class517.method3146(-124, class352.field5213);
                            var196 = var198.field195;
                            var197 = var198.field197.method4008(class352.field5213, 0);
                        } else {
                            var197 = class165.method1183(class748.method4172(0, class352.field5213), -13970);
                        }
                        var191.field4632 = var197.trim();
                        var191.field4579 = 150;
                        var191.field4594 = var192 & 0xFF;
                        var191.field4625 = var192 >> 8;
                        int var199;
                        if (var193 == 1 || var193 == 2) {
                            var199 = var194 ? 17 : 1;
                        } else {
                            var199 = var194 ? 17 : 2;
                        }
                        if (var193 == 2) {
                            class399.method2417(false, "<img=1>" + var191.method3694((byte) -124, true), var196, var191.field9096, 0, "<img=1>" + var191.method3691(false, 0), var199, var197, null);
                        } else if (var193 == 1) {
                            class399.method2417(false, "<img=0>" + var191.method3694((byte) -119, true), var196, var191.field9096, 0, "<img=0>" + var191.method3691(false, 0), var199, var197, null);
                        } else {
                            class399.method2417(false, var191.method3694((byte) -83, true), var196, var191.field9096, 0, var191.method3691(false, 0), var199, var197, null);
                        }
                    }
                }
                class53.field834 = null;
                return true;
            } else if (class53.field834 == class514.field7444) {
                int var200 = class352.field5213.method2871(-2);
                int var201 = class352.field5213.method2892((byte) 51);
                int var202 = class352.field5213.method2892((byte) 51);
                class200.method1419(false);
                class488.method2974(var200, (var201 << 16) + var202, (byte) 113);
                class53.field834 = null;
                return true;
            } else if (class568.field8207 == class53.field834) {
                int var203 = class352.field5213.method2920(-27357);
                int var204 = class352.field5213.method2920(-27357);
                int var205 = class352.field5213.method2885(-126);
                class333.field4516[var203] = var205;
                class678.field9624[var203] = var204;
                class355.field5247[var203] = 1;
                int var206 = class351.field5207[var203] - 1;
                for (int var207 = 0; var207 < var206; var207++) {
                    if (class612.field8752[var207] <= var205) {
                        class355.field5247[var203] = var207 + 2;
                    }
                }
                class249.field3625[class368.method2314(class519.field7485++, 31)] = var203;
                class53.field834 = null;
                return true;
            } else if (class53.field834 == class17.field168) {
                class89.method694(false, 0);
                class53.field834 = null;
                return false;
            } else if (class53.field834 == class207.field3136) {
                int var208 = class352.field5213.method2886(true);
                int var209 = var208 >> 5;
                int var210 = var208 & 0x1F;
                if (var210 == 0) {
                    class99.field1437[var209] = null;
                    class53.field834 = null;
                    return true;
                }
                class504 var211 = new class504();
                var211.field7322 = var210;
                var211.field7327 = class352.field5213.method2886(true);
                if (var211.field7327 >= 0 && var211.field7327 < class242.field3575.length) {
                    if (var211.field7322 == 1 || var211.field7322 == 10) {
                        var211.field7334 = class352.field5213.method2882(-1);
                        class352.field5213.field6864 += 6;
                    } else if (var211.field7322 >= 2 && var211.field7322 <= 6) {
                        if (var211.field7322 == 2) {
                            var211.field7323 = 256;
                            var211.field7335 = 256;
                        }
                        if (var211.field7322 == 3) {
                            var211.field7335 = 0;
                            var211.field7323 = 256;
                        }
                        if (var211.field7322 == 4) {
                            var211.field7323 = 256;
                            var211.field7335 = 512;
                        }
                        if (var211.field7322 == 5) {
                            var211.field7335 = 256;
                            var211.field7323 = 0;
                        }
                        if (var211.field7322 == 6) {
                            var211.field7323 = 512;
                            var211.field7335 = 256;
                        }
                        var211.field7322 = 2;
                        var211.field7324 = class352.field5213.method2886(true);
                        var211.field7335 += class352.field5213.method2882(-1) - class41.field693 << 9;
                        var211.field7323 += class352.field5213.method2882(-1) - class71.field1085 << 9;
                        var211.field7328 = class352.field5213.method2886(true) << 2;
                        var211.field7333 = class352.field5213.method2882(-1);
                    }
                    var211.field7336 = class352.field5213.method2882(-1);
                    if (var211.field7336 == 65535) {
                        var211.field7336 = -1;
                    }
                    class99.field1437[var209] = var211;
                }
                class53.field834 = null;
                return true;
            } else if (class53.field834 == class313.field4237) {
                class82.method660((byte) 115);
                class53.field834 = null;
                return false;
            } else if (class53.field834 == class337.field4658) {
                boolean var212 = class352.field5213.method2886(true) == 1;
                String var213 = class352.field5213.method2894(-13192);
                String var214 = var213;
                if (var212) {
                    var214 = class352.field5213.method2894(-13192);
                }
                int var215 = class352.field5213.method2886(true);
                boolean var216 = false;
                if (var215 <= 1) {
                    if (!(!class321.field4368 || class212.field3171) || class748.field10423) {
                        var216 = true;
                    } else if (var215 <= 1 && class188.method1327(var214, false)) {
                        var216 = true;
                    }
                }
                if (!var216 && class481.field6878 == 0) {
                    String var217 = class165.method1183(class748.method4172(0, class352.field5213), -13970);
                    if (var215 == 2) {
                        class399.method2417(false, "<img=1>" + var213, -1, var213, 0, "<img=1>" + var214, 24, var217, null);
                    } else if (var215 == 1) {
                        class399.method2417(false, "<img=0>" + var213, -1, var213, 0, "<img=0>" + var214, 24, var217, null);
                    } else {
                        class399.method2417(false, var213, -1, var213, 0, var214, 24, var217, null);
                    }
                }
                class53.field834 = null;
                return true;
            } else if (class579.field8294 == class53.field834) {
                class691.method3905((byte) 112, class520.field7505);
                class53.field834 = null;
                return true;
            } else if (class53.field834 == class12.field134) {
                int var218 = class352.field5213.method2904(67);
                int var219 = class352.field5213.method2886(true);
                int var220 = class352.field5213.method2883(-2);
                if (var220 == 65535) {
                    var220 = -1;
                }
                class299.method1863(-119, var218, var219, var220);
                class53.field834 = null;
                return true;
            } else if (class53.field834 == class394.field5656) {
                int var221 = class352.field5213.method2920(-27357);
                int var222 = class352.field5213.method2878(-103);
                int var223 = class352.field5213.method2883(-2);
                if (var223 == 65535) {
                    var223 = -1;
                }
                class584.method3441(var223, (byte) -120, var221, var222);
                class53.field834 = null;
                return true;
            } else if (class613.field8760 == class53.field834) {
                class691.method3905((byte) 112, class72.field1095);
                class53.field834 = null;
                return true;
            } else if (class53.field834 == class353.field5219) {
                int var224 = class352.field5213.method2883(-2);
                if (var224 == 65535) {
                    var224 = -1;
                }
                int var225 = class352.field5213.method2904(69);
                int var226 = var225 >> 2;
                int var227 = var225 & 0x3;
                int var228 = class646.field9310[var226];
                int var229 = class352.field5213.method2885(-122);
                int var230 = (var229 & 0x390B112A) >> 28;
                int var231 = var229 >> 14 & 0x3FFF;
                int var232 = var229 & 0x3FFF;
                int var233 = var231 - class41.field693;
                int var234 = var232 - class71.field1085;
                class443.method2710(var230, var227, var233, var224, var226, -10439, var228, var234);
                class53.field834 = null;
                return true;
            } else if (class53.field834 == class206.field3105) {
                int var235 = class352.field5213.method2868(-76);
                int var236 = class352.field5213.method2897(65280);
                int var237 = class352.field5213.method2883(-2);
                int var238 = class352.field5213.method2897(65280);
                class200.method1419(false);
                class603.method3512(var236, var235, 11693, var238, var237);
                class53.field834 = null;
                return true;
            } else if (class53.field834 == class50.field810) {
                int var239 = class352.field5213.method2885(-116);
                class200.method1419(false);
                class53.field834 = null;
                if (var239 == -1) {
                    class616.field8773 = -1;
                    class539.field7824 = -1;
                } else {
                    int var240 = (var239 & 0xFFFC428) >> 14;
                    int var241 = var240 - class41.field693;
                    int var242 = var239 & 0x3FFF;
                    int var243 = var242 - class71.field1085;
                    if (var241 < 0) {
                        var241 = 0;
                    } else if (class184.field2546 <= var241) {
                        var241 = class184.field2546;
                    }
                    if (var243 < 0) {
                        var243 = 0;
                    } else if (var243 >= class240.field3555) {
                        var243 = class240.field3555;
                    }
                    class539.field7824 = (var241 << 9) + 256;
                    class616.field8773 = (var243 << 9) + 256;
                }
                return true;
            } else if (class53.field834 == class23.field217) {
                class53.field834 = null;
                class363.field5307 = class152.field2225;
                class634.field8940 = 1;
                return true;
            } else if (class53.field834 == class502.field7284) {
                int var244 = class352.field5213.method2904(79);
                int var245 = class352.field5213.method2924((byte) -102);
                if (var244 == 255) {
                    var245 = -1;
                    var244 = -1;
                }
                class167.method1194(45, var244, var245);
                class53.field834 = null;
                return true;
            } else if (class53.field834 == class481.field6876) {
                byte var246 = class352.field5213.method2900(-58);
                int var247 = class352.field5213.method2882(-1);
                class226.field3372.method4(var246, var247, 0);
                class53.field834 = null;
                return true;
            } else if (class662.field9454 == class53.field834) {
                class200.method1419(false);
                class743.method4135((byte) 44);
                class53.field834 = null;
                return true;
            } else if (class53.field834 == class137.field1883) {
                class42.method432(class352.field5213.method2894(-13192), 0);
                class53.field834 = null;
                return true;
            } else if (class576.field8275 == class53.field834) {
                String var248 = class352.field5213.method2894(-13192);
                int var249 = class352.field5213.method2882(-1);
                String var250 = class492.field7082.method2779(var249, 119).method4008(class352.field5213, 0);
                class399.method2417(false, var248, var249, var248, 0, var248, 19, var250, null);
                class53.field834 = null;
                return true;
            } else if (class706.field9946 == class53.field834) {
                boolean var251 = class352.field5213.method2886(true) == 1;
                String var252 = class352.field5213.method2894(-13192);
                String var253 = var252;
                if (var251) {
                    var253 = class352.field5213.method2894(-13192);
                }
                long var254 = class352.field5213.method2907(120);
                long var256 = (long) class352.field5213.method2882(-1);
                long var258 = (long) class352.field5213.method2865(255);
                int var260 = class352.field5213.method2886(true);
                long var261 = (var256 << 32) + var258;
                boolean var263 = false;
                int var264 = 0;
                while (true) {
                    if (var264 >= 100) {
                        if (var260 <= 1) {
                            if (!(!class321.field4368 || class212.field3171) || class748.field10423) {
                                var263 = true;
                            } else if (class188.method1327(var253, false)) {
                                var263 = true;
                            }
                        }
                        break;
                    }
                    if (class713.field10034[var264] == var261) {
                        var263 = true;
                        break;
                    }
                    var264++;
                }
                if (!var263 && class481.field6878 == 0) {
                    class713.field10034[class598.field8496] = var261;
                    class598.field8496 = (class598.field8496 + 1) % 100;
                    String var265 = class165.method1183(class748.method4172(0, class352.field5213), -13970);
                    if (var260 == 2 || var260 == 3) {
                        class399.method2417(false, "<img=1>" + var252, -1, var252, 0, "<img=1>" + var253, 9, var265, class340.method2092(127, var254));
                    } else if (var260 == 1) {
                        class399.method2417(false, "<img=0>" + var252, -1, var252, 0, "<img=0>" + var253, 9, var265, class340.method2092(89, var254));
                    } else {
                        class399.method2417(false, var252, -1, var252, 0, var253, 9, var265, class340.method2092(89, var254));
                    }
                }
                class53.field834 = null;
                return true;
            } else if (class53.field834 == class504.field7325) {
                class691.method3905((byte) 112, class463.field6605);
                class53.field834 = null;
                return true;
            } else if (class582.field8301 == class53.field834) {
                int var266 = class352.field5213.method2904(59);
                int var267 = class352.field5213.method2871(-2);
                int var268 = class352.field5213.method2897(65280);
                class200.method1419(false);
                class182 var269 = (class182) class591.field8410.method4020((long) var267, (byte) -74);
                if (var269 != null) {
                    class417.method2517(0, var269.field2505 != var268, false, var269);
                }
                class482.method2946(var267, var268, false, var266, (byte) -104);
                class53.field834 = null;
                return true;
            } else if (class684.field9721 == class53.field834) {
                class691.method3905((byte) 112, class684.field9722);
                class53.field834 = null;
                return true;
            } else if (class559.field8119 == class53.field834) {
                int var270 = class352.field5213.method2885(-118);
                int var271 = class352.field5213.method2883(-2);
                int var272 = class352.field5213.method2897(65280);
                int var273 = class352.field5213.method2883(-2);
                class200.method1419(false);
                class186.method1317(-121, 7, var271 << 16 | var272, var273, var270);
                class53.field834 = null;
                return true;
            } else if (class79.field1141 == class53.field834) {
                int var274 = class352.field5213.method2868(-67);
                int var275 = class352.field5213.method2868(-90);
                class200.method1419(false);
                class182 var276 = (class182) class591.field8410.method4020((long) var274, (byte) -108);
                class182 var277 = (class182) class591.field8410.method4020((long) var275, (byte) -91);
                if (var277 != null) {
                    class417.method2517(0, var276 == null || var276.field2505 != var277.field2505, false, var277);
                }
                if (var276 != null) {
                    var276.method2656((byte) 121);
                    class591.field8410.method4022(var276, -42, (long) var275);
                }
                class146 var278 = class250.method1689(var274, false);
                if (var278 != null) {
                    class401.method2439(1723, var278);
                }
                class146 var279 = class250.method1689(var275, false);
                if (var279 != null) {
                    class401.method2439(1723, var279);
                    class217.method1533(var279, true, -9543);
                }
                if (class346.field4771 != -1) {
                    class647.method3741(1, (byte) -82, class346.field4771);
                }
                class53.field834 = null;
                return true;
            } else if (class53.field834 == class495.field7115) {
                class724.method4050(30);
                class53.field834 = null;
                return true;
            } else if (class53.field834 == class12.field128) {
                class513.method3122(117, class352.field5213, class322.field4395);
                class53.field834 = null;
                return true;
            } else if (class53.field834 == class122.field1660) {
                int var280 = class352.field5213.method2882(-1);
                if (var280 == 65535) {
                    var280 = -1;
                }
                int var281 = class352.field5213.method2886(true);
                int var282 = class352.field5213.method2882(-1);
                int var283 = class352.field5213.method2886(true);
                int var284 = class352.field5213.method2882(-1);
                class588.method3458(var281, var280, var282, false, var284, (byte) -64, var283);
                class53.field834 = null;
                return true;
            } else if (class53.field834 == class294.field4041) {
                class691.method3905((byte) 112, class364.field5326);
                class53.field834 = null;
                return true;
            } else if (class53.field834 == class514.field7439) {
                int var285 = class352.field5213.method2882(-1);
                int var286 = class352.field5213.method2871(-2);
                int var287 = class352.field5213.method2884((byte) -37);
                class200.method1419(false);
                class186.method1317(-56, 5, var285, var287, var286);
                class53.field834 = null;
                return true;
            } else if (class670.field9549 == class53.field834) {
                int var288 = class352.field5213.method2882(-1);
                int var289 = class352.field5213.method2886(true);
                boolean var290 = (var289 & 0x1) == 1;
                class755.method4196(var288, var290, false);
                int var291 = class352.field5213.method2882(-1);
                for (int var292 = 0; var292 < var291; var292++) {
                    int var293 = class352.field5213.method2924((byte) -124);
                    if (var293 == 255) {
                        var293 = class352.field5213.method2884((byte) -37);
                    }
                    int var294 = class352.field5213.method2897(65280);
                    class552.method3322(var288, var293, var292, var290, var294 - 1, (byte) -67);
                }
                class70.field1075[class368.method2314(class666.field9523++, 31)] = var288;
                class53.field834 = null;
                return true;
            } else if (class53.field834 == class152.field2224) {
                class53.field834 = null;
                return false;
            } else if (class53.field834 == class416.field5904) {
                int var295 = class352.field5213.method2882(-1);
                int var296 = class352.field5213.method2868(-69);
                class200.method1419(false);
                class633.method3627((byte) -88, var295, var296);
                class53.field834 = null;
                return true;
            } else if (class59.field980 == class53.field834) {
                class527.field7652 = class322.field4395 <= 2 ? class608.field8646.method3543(-24350, class45.field748) : class352.field5213.method2894(-13192);
                class121.field1646 = class322.field4395 <= 0 ? -1 : class352.field5213.method2882(-1);
                class53.field834 = null;
                if (class121.field1646 == 65535) {
                    class121.field1646 = -1;
                }
                return true;
            } else if (class635.field8965 == class53.field834) {
                class214.field3213 = class352.field5213.method2904(107);
                class182.field2506 = class352.field5213.method2915(-101) << 3;
                class95.field1382 = class352.field5213.method2906(128) << 3;
                while (class322.field4395 > class352.field5213.field6864) {
                    class740 var297 = class84.method676((byte) -26)[class352.field5213.method2886(true)];
                    class691.method3905((byte) 112, var297);
                }
                class53.field834 = null;
                return true;
            } else if (class667.field9524 == class53.field834) {
                class42.field710 = class352.field5213.method2886(true);
                class53.field834 = null;
                return true;
            } else if (client.field6404 == class53.field834) {
                int var298 = class352.field5213.method2868(-123);
                String var299 = class352.field5213.method2894(-13192);
                class200.method1419(false);
                class350.method2237(var298, var299, false);
                class53.field834 = null;
                return true;
            } else if (class53.field834 == class520.field7500) {
                int var300 = class352.field5213.method2883(-2);
                if (var300 == 65535) {
                    var300 = -1;
                }
                int var301 = class352.field5213.method2886(true);
                int var302 = class352.field5213.method2904(105);
                String var303 = class352.field5213.method2894(-13192);
                if (var302 >= 1 && var302 <= 8) {
                    if (var303.equalsIgnoreCase("null")) {
                        var303 = null;
                    }
                    class472.field6700[var302 - 1] = var303;
                    class726.field10201[var302 - 1] = var300;
                    class393.field5652[var302 - 1] = var301 == 0;
                }
                class53.field834 = null;
                return true;
            } else if (class752.field10475 == class53.field834) {
                class80.field1147 = class152.field2225;
                if (class322.field4395 == 0) {
                    class53.field834 = null;
                    class528.field7684 = null;
                    class295.field4048 = null;
                    class386.field5584 = null;
                    class38.field495 = 0;
                    return true;
                }
                class386.field5584 = class352.field5213.method2894(-13192);
                boolean var304 = class352.field5213.method2886(true) == 1;
                if (var304) {
                    class352.field5213.method2894(-13192);
                }
                long var305 = class352.field5213.method2907(-48);
                class528.field7684 = class71.method622((byte) 29, var305);
                class56.field961 = class352.field5213.method2915(-110);
                int var307 = class352.field5213.method2886(true);
                if (var307 == 255) {
                    class53.field834 = null;
                    return true;
                }
                class38.field495 = var307;
                class619[] var308 = new class619[100];
                for (int var309 = 0; var309 < class38.field495; var309++) {
                    var308[var309] = new class619();
                    var308[var309].field8813 = class352.field5213.method2894(-13192);
                    boolean var315 = class352.field5213.method2886(true) == 1;
                    if (var315) {
                        var308[var309].field8809 = class352.field5213.method2894(-13192);
                    } else {
                        var308[var309].field8809 = var308[var309].field8813;
                    }
                    var308[var309].field8812 = class136.method973(10149, var308[var309].field8809);
                    var308[var309].field8811 = class352.field5213.method2882(-1);
                    var308[var309].field8810 = class352.field5213.method2915(-119);
                    var308[var309].field8817 = class352.field5213.method2894(-13192);
                    if (var308[var309].field8809.equals(class108.field1536.field9056)) {
                        class136.field1867 = var308[var309].field8810;
                    }
                }
                boolean var310 = false;
                int var311 = class38.field495;
                while (var311 > 0) {
                    var311--;
                    boolean var312 = true;
                    for (int var313 = 0; var313 < var311; var313++) {
                        if (var308[var313].field8812.compareTo(var308[var313 + 1].field8812) > 0) {
                            class619 var314 = var308[var313];
                            var308[var313] = var308[var313 + 1];
                            var308[var313 + 1] = var314;
                            var312 = false;
                        }
                    }
                    if (var312) {
                        break;
                    }
                }
                class53.field834 = null;
                class295.field4048 = var308;
                return true;
            } else if (class53.field834 == class207.field3139) {
                int var316 = class352.field5213.method2882(-1);
                int var317 = class352.field5213.method2882(-1);
                class200.method1419(false);
                class639.method3682(var317, 0, 3, var316);
                class53.field834 = null;
                return true;
            } else if (class53.field834 == class391.field5645) {
                int var318 = class352.field5213.method2924((byte) -119);
                int var319 = class352.field5213.method2882(-1);
                class200.method1419(false);
                class225.method1567(var319, (byte) -128, var318, true);
                class53.field834 = null;
                return true;
            } else if (class53.field834 == class328.field4451) {
                class691.method3905((byte) 112, class598.field8510);
                class53.field834 = null;
                return true;
            } else if (class53.field834 == class342.field4703) {
                class311.field4225 = class352.field5213.method2886(true);
                class590.field8390 = class152.field2225;
                class53.field834 = null;
                return true;
            } else if (class53.field834 == class41.field691) {
                int var320 = class352.field5213.method2924((byte) -118);
                int var321 = class352.field5213.method2924((byte) -105);
                int var322 = class352.field5213.method2897(65280) << 2;
                int var323 = class352.field5213.method2886(true);
                int var324 = class352.field5213.method2886(true);
                class200.method1419(false);
                class376.method2335(var324, var320, (byte) 125, var322, var321, var323);
                class53.field834 = null;
                return true;
            } else if (class89.field1269 == class53.field834) {
                String var325 = class352.field5213.method2894(-13192);
                boolean var326 = class352.field5213.method2886(true) == 1;
                String var327;
                if (var326) {
                    var327 = class352.field5213.method2894(-13192);
                } else {
                    var327 = var325;
                }
                int var328 = class352.field5213.method2882(-1);
                byte var329 = class352.field5213.method2915(-121);
                boolean var330 = false;
                if (var329 == -128) {
                    var330 = true;
                }
                if (var330) {
                    if (class38.field495 == 0) {
                        class53.field834 = null;
                        return true;
                    }
                    boolean var331 = false;
                    int var332;
                    for (var332 = 0; var332 < class38.field495 && (!class295.field4048[var332].field8809.equals(var327) || class295.field4048[var332].field8811 != var328); var332++) {
                    }
                    if (class38.field495 > var332) {
                        while (var332 < class38.field495 - 1) {
                            class295.field4048[var332] = class295.field4048[var332 + 1];
                            var332++;
                        }
                        class38.field495--;
                        class295.field4048[class38.field495] = null;
                    }
                } else {
                    String var333 = class352.field5213.method2894(-13192);
                    class619 var334 = new class619();
                    var334.field8813 = var325;
                    var334.field8809 = var327;
                    var334.field8812 = class136.method973(10149, var334.field8809);
                    var334.field8810 = var329;
                    var334.field8817 = var333;
                    var334.field8811 = var328;
                    int var335;
                    for (var335 = class38.field495 - 1; var335 >= 0; var335--) {
                        int var336 = class295.field4048[var335].field8812.compareTo(var334.field8812);
                        if (var336 == 0) {
                            class295.field4048[var335].field8811 = var328;
                            class295.field4048[var335].field8810 = var329;
                            class295.field4048[var335].field8817 = var333;
                            if (var327.equals(class108.field1536.field9056)) {
                                class136.field1867 = var329;
                            }
                            class53.field834 = null;
                            class80.field1147 = class152.field2225;
                            return true;
                        }
                        if (var336 < 0) {
                            break;
                        }
                    }
                    if (class295.field4048.length <= class38.field495) {
                        class53.field834 = null;
                        return true;
                    }
                    for (int var337 = class38.field495 - 1; var337 > var335; var337--) {
                        class295.field4048[var337 + 1] = class295.field4048[var337];
                    }
                    if (class38.field495 == 0) {
                        class295.field4048 = new class619[100];
                    }
                    class295.field4048[var335 + 1] = var334;
                    class38.field495++;
                    if (var327.equals(class108.field1536.field9056)) {
                        class136.field1867 = var329;
                    }
                }
                class80.field1147 = class152.field2225;
                class53.field834 = null;
                return true;
            } else if (class53.field834 == class299.field4076) {
                class363.method2287(class322.field4395, class352.field5213, class345.field4749, (byte) -95);
                class53.field834 = null;
                return true;
            } else if (class742.field10350 == class53.field834) {
                while (class352.field5213.field6864 < class322.field4395) {
                    boolean var348 = class352.field5213.method2886(true) == 1;
                    String var349 = class352.field5213.method2894(-13192);
                    String var350 = class352.field5213.method2894(-13192);
                    int var351 = class352.field5213.method2882(-1);
                    int var352 = class352.field5213.method2886(true);
                    String var353 = "";
                    boolean var354 = false;
                    if (var351 > 0) {
                        var353 = class352.field5213.method2894(-13192);
                        var354 = class352.field5213.method2886(true) == 1;
                    }
                    for (int var355 = 0; var355 < class386.field5583; var355++) {
                        if (var348) {
                            if (var350.equals(class196.field2860[var355])) {
                                class196.field2860[var355] = var349;
                                var349 = null;
                                class519.field7483[var355] = var350;
                                break;
                            }
                        } else if (var349.equals(class196.field2860[var355])) {
                            if (class329.field4455[var355] != var351) {
                                boolean var356 = true;
                                for (class161 var357 = (class161) class286.field3978.method1527(110); var357 != null; var357 = (class161) class286.field3978.method1523(true)) {
                                    if (var357.field2309.equals(var349)) {
                                        if (var351 != 0 && var357.field2310 == 0) {
                                            var356 = false;
                                            var357.method814(42);
                                        } else if (var351 == 0 && var357.field2310 != 0) {
                                            var357.method814(121);
                                            var356 = false;
                                        }
                                    }
                                }
                                if (var356) {
                                    class286.field3978.method1521(new class161(var349, var351), -24256);
                                }
                                class329.field4455[var355] = var351;
                            }
                            class519.field7483[var355] = var350;
                            class519.field7487[var355] = var353;
                            class381.field5521[var355] = var352;
                            var349 = null;
                            class343.field4711[var355] = var354;
                            break;
                        }
                    }
                    if (var349 != null && class386.field5583 < 200) {
                        class196.field2860[class386.field5583] = var349;
                        class519.field7483[class386.field5583] = var350;
                        class329.field4455[class386.field5583] = var351;
                        class519.field7487[class386.field5583] = var353;
                        class381.field5521[class386.field5583] = var352;
                        class343.field4711[class386.field5583] = var354;
                        class386.field5583++;
                    }
                }
                class363.field5307 = class152.field2225;
                class634.field8940 = 2;
                boolean var338 = false;
                int var339 = class386.field5583;
                while (var339 > 0) {
                    var339--;
                    boolean var340 = true;
                    for (int var341 = 0; var341 < var339; var341++) {
                        if (class329.field4455[var341] != class214.field3215.field7472 && class329.field4455[var341 + 1] == class214.field3215.field7472 || class329.field4455[var341] == 0 && class329.field4455[var341 + 1] != 0) {
                            int var342 = class329.field4455[var341];
                            class329.field4455[var341] = class329.field4455[var341 + 1];
                            class329.field4455[var341 + 1] = var342;
                            String var343 = class519.field7487[var341];
                            class519.field7487[var341] = class519.field7487[var341 + 1];
                            class519.field7487[var341 + 1] = var343;
                            String var344 = class196.field2860[var341];
                            class196.field2860[var341] = class196.field2860[var341 + 1];
                            class196.field2860[var341 + 1] = var344;
                            String var345 = class519.field7483[var341];
                            class519.field7483[var341] = class519.field7483[var341 + 1];
                            class519.field7483[var341 + 1] = var345;
                            int var346 = class381.field5521[var341];
                            class381.field5521[var341] = class381.field5521[var341 + 1];
                            class381.field5521[var341 + 1] = var346;
                            boolean var347 = class343.field4711[var341];
                            class343.field4711[var341] = class343.field4711[var341 + 1];
                            var340 = false;
                            class343.field4711[var341 + 1] = var347;
                        }
                    }
                    if (var340) {
                        break;
                    }
                }
                class53.field834 = null;
                return true;
            } else if (class53.field834 == class186.field2610) {
                class214.field3213 = class352.field5213.method2886(true);
                class95.field1382 = class352.field5213.method2900(-58) << 3;
                class182.field2506 = class352.field5213.method2906(128) << 3;
                class53.field834 = null;
                return true;
            } else if (class53.field834 == class366.field5359) {
                boolean var358 = class352.field5213.method2886(true) == 1;
                String var359 = class352.field5213.method2894(-13192);
                String var360 = var359;
                if (var358) {
                    var360 = class352.field5213.method2894(-13192);
                }
                long var361 = class352.field5213.method2907(-93);
                long var363 = (long) class352.field5213.method2882(-1);
                long var365 = (long) class352.field5213.method2865(255);
                int var367 = class352.field5213.method2886(true);
                int var368 = class352.field5213.method2882(-1);
                long var369 = (var363 << 32) + var365;
                boolean var371 = false;
                int var372 = 0;
                while (true) {
                    if (var372 >= 100) {
                        if (var367 <= 1 && class188.method1327(var360, false)) {
                            var371 = true;
                        }
                        break;
                    }
                    if (class713.field10034[var372] == var369) {
                        var371 = true;
                        break;
                    }
                    var372++;
                }
                if (!var371 && class481.field6878 == 0) {
                    class713.field10034[class598.field8496] = var369;
                    class598.field8496 = (class598.field8496 + 1) % 100;
                    String var373 = class492.field7082.method2779(var368, 121).method4008(class352.field5213, 0);
                    if (var367 == 2) {
                        class399.method2417(false, "<img=1>" + var359, var368, var359, 0, "<img=1>" + var360, 20, var373, class340.method2092(93, var361));
                    } else if (var367 == 1) {
                        class399.method2417(false, "<img=0>" + var359, var368, var359, 0, "<img=0>" + var360, 20, var373, class340.method2092(126, var361));
                    } else {
                        class399.method2417(false, var359, var368, var359, 0, var360, 20, var373, class340.method2092(103, var361));
                    }
                }
                class53.field834 = null;
                return true;
            } else if (class53.field834 == class268.field3814) {
                class439.field6267 = class227.method1583((byte) -57, class352.field5213.method2886(true));
                class53.field834 = null;
                return true;
            } else if (class53.field834 == class527.field7669) {
                class691.method3905((byte) 112, class623.field8865);
                class53.field834 = null;
                return true;
            } else if (class53.field834 == class424.field6107) {
                class603.field8552 = class352.field5213.method2870(-11395);
                class590.field8390 = class152.field2225;
                class53.field834 = null;
                return true;
            } else if (class53.field834 == class417.field5974) {
                int var374 = class352.field5213.method2904(119);
                class200.method1419(false);
                class118.field1623 = var374;
                class53.field834 = null;
                return true;
            } else if (class624.field8874 == class53.field834) {
                class691.method3905((byte) 112, class383.field5538);
                class53.field834 = null;
                return true;
            } else if (class565.field8186 == class53.field834) {
                int var375 = class352.field5213.method2884((byte) -37);
                int var376 = class352.field5213.method2904(112);
                class200.method1419(false);
                class391.method2394(var375, var376, (byte) -47);
                class53.field834 = null;
                return true;
            } else if (class53.field834 == class123.field1697) {
                int var377 = class352.field5213.method2892((byte) 51);
                class200.method1419(false);
                class405.method2463((byte) -116, var377);
                class53.field834 = null;
                return true;
            } else if (class53.field834 == class352.field5209) {
                int var378 = class352.field5213.method2892((byte) 51);
                if (var378 == 65535) {
                    var378 = -1;
                }
                int var379 = class352.field5213.method2871(-2);
                int var380 = class352.field5213.method2897(65280);
                if (var380 == 65535) {
                    var380 = -1;
                }
                int var381 = class352.field5213.method2868(-116);
                class200.method1419(false);
                for (int var382 = var378; var382 <= var380; var382++) {
                    long var383 = ((long) var379 << 32) + (long) var382;
                    class478 var385 = (class478) class491.field7069.method4020(var383, (byte) -121);
                    class478 var386;
                    if (var385 != null) {
                        var386 = new class478(var381, var385.field6790);
                        var385.method2656((byte) 125);
                    } else if (var382 == -1) {
                        var386 = new class478(var381, class250.method1689(var379, false).field1980.field6790);
                    } else {
                        var386 = new class478(var381, -1);
                    }
                    class491.field7069.method4022(var386, -80, var383);
                }
                class53.field834 = null;
                return true;
            } else if (class597.field8489 == class53.field834) {
                int var387 = class352.field5213.method2884((byte) -37);
                class200.method1419(false);
                class186.method1317(-68, 5, class652.field9348, 0, var387);
                class53.field834 = null;
                return true;
            } else if (field59 == class53.field834) {
                int var388 = class352.field5213.method2924((byte) -91);
                int var389 = class352.field5213.method2882(-1);
                class200.method1419(false);
                if (var388 == 2) {
                    class68.method596(false);
                }
                class346.field4771 = var389;
                class329.method2022((byte) -115, var389);
                class196.method1380(-125, false);
                class529.method3202(class346.field4771);
                for (int var390 = 0; var390 < 100; var390++) {
                    class108.field1545[var390] = true;
                }
                class53.field834 = null;
                return true;
            } else if (class53.field834 == class400.field5734) {
                int var391 = class352.field5213.method2892((byte) 51);
                int var392 = class352.field5213.method2884((byte) -37);
                class226.field3372.method4(var392, var391, 0);
                class53.field834 = null;
                return true;
            } else if (class53.field834 == class334.field4530) {
                int var393 = class352.field5213.method2882(-1);
                if (var393 == 65535) {
                    var393 = -1;
                }
                int var394 = class352.field5213.method2886(true);
                int var395 = class352.field5213.method2882(-1);
                int var396 = class352.field5213.method2886(true);
                int var397 = class352.field5213.method2882(-1);
                class298.method1856(var393, var395, var397, var396, var394, 50);
                class53.field834 = null;
                return true;
            } else if (class53.field834 == class496.field7141) {
                String var398 = class352.field5213.method2894(-13192);
                int var399 = class352.field5213.method2892((byte) 51);
                class200.method1419(false);
                class634.method3630(var399, var398, (byte) -125);
                class53.field834 = null;
                return true;
            } else if (class53.field834 == class519.field7480) {
                int var400 = class352.field5213.method2892((byte) 51);
                int var401 = class352.field5213.method2868(-49);
                class200.method1419(false);
                class215.method1524(var401, var400, 2);
                class53.field834 = null;
                return true;
            } else if (class53.field834 == class498.field7161) {
                int var402 = class352.field5213.method2871(-2);
                int var403 = class352.field5213.method2883(-2);
                class200.method1419(false);
                if (var403 == 65535) {
                    var403 = -1;
                }
                class186.method1317(-108, 2, var403, -1, var402);
                class53.field834 = null;
                return true;
            } else if (class705.field9936 == class53.field834) {
                if (class346.field4771 != -1) {
                    class647.method3741(0, (byte) -82, class346.field4771);
                }
                class53.field834 = null;
                return true;
            } else if (class679.field9647 == class53.field834) {
                int var404 = class352.field5213.method2868(-83);
                class200.method1419(false);
                class182 var405 = (class182) class591.field8410.method4020((long) var404, (byte) -64);
                if (var405 != null) {
                    class417.method2517(0, true, false, var405);
                }
                if (class310.field4186 != null) {
                    class401.method2439(1723, class310.field4186);
                    class310.field4186 = null;
                }
                class53.field834 = null;
                return true;
            } else if (class587.field8367 == class53.field834) {
                String var406 = class352.field5213.method2894(-13192);
                String var407 = class165.method1183(class748.method4172(0, class352.field5213), -13970);
                class145.method1013(var407, (byte) -12, var406, 6, 0, var406, var406);
                class53.field834 = null;
                return true;
            } else if (class53.field834 == class162.field2317) {
                class691.method3905((byte) 112, class663.field9469);
                class53.field834 = null;
                return true;
            } else if (class594.field8442 == class53.field834) {
                class691.method3905((byte) 112, class348.field5136);
                class53.field834 = null;
                return true;
            } else if (class634.field8945 == class53.field834) {
                class89.method694(class496.field7143, 0);
                class53.field834 = null;
                return false;
            } else {
                class705.method3952("T1 - " + (class53.field834 == null ? -1 : class53.field834.method2672(true)) + "," + (class94.field1353 == null ? -1 : class94.field1353.method2672(true)) + "," + (class93.field1338 == null ? -1 : class93.field1338.method2672(true)) + " - " + class322.field4395, null, -29913);
                class89.method694(false, 0);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(B)V", line = 3206)
    public static void method25(byte arg0) {
        field62 = null;
        field59 = null;
        field57 = null;
        int var1 = 81 % ((68 - arg0) / 57);
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ZII)Lqs;", line = 3218)
    public static final class603 method26(boolean arg0, int arg1, int arg2) {
        int var3 = 3 / ((37 - arg1) / 61);
        field60++;
        class215[] var4 = class308.field4178;
        synchronized (class308.field4178) {
            class603 var5;
            if (class308.field4178.length <= arg2 || class308.field4178[arg2].method1526(true)) {
                var5 = new class603();
                var5.field8543 = new class373[arg2];
                for (int var6 = 0; var6 < arg2; var6++) {
                    var5.field8543[var6] = new class373();
                }
            } else {
                var5 = (class603) class308.field4178[arg2].method1528(9641);
                var5.method814(103);
                int var10002 = class372.field5405[arg2]--;
            }
            var5.field8545 = arg0;
            return var5;
        }
    }
}
