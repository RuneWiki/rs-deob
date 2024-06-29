import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class178 {

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "I")
    public static int field3233 = 0;

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "I")
    public static int field3232 = 0;

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "[I")
    public static int[] field3237 = new int[25];

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "Lqe;")
    public static class179 field3227 = class206.method1380("logo", (byte) -127);

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "Lqe;")
    private static class179 field3230 = class206.method1380("as it was used to break our rules)3", (byte) -127);

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "Lqe;")
    public static class179 field3229 = field3230;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)Z")
    public static final boolean method1120(int arg0) throws IOException {
        field3234++;
        if (class199.field3714 == null) {
            return false;
        }
        int var1 = class199.field3714.method305((byte) 121);
        if (var1 == 0) {
            return false;
        }
        if (class169.field3043 == -1) {
            class199.field3714.method311((byte) -93, class36.field789.field3397, 0, 1);
            class36.field789.field3432 = 0;
            var1--;
            class169.field3043 = class36.field789.method64(116);
            class150.field2705 = class39.field835[class169.field3043];
        }
        if (class150.field2705 == -1) {
            if (var1 <= 0) {
                return false;
            }
            var1--;
            class199.field3714.method311((byte) -126, class36.field789.field3397, 0, 1);
            class150.field2705 = class36.field789.field3397[0] & 0xFF;
        }
        if (class150.field2705 == -2) {
            if (var1 <= 1) {
                return false;
            }
            var1 -= 2;
            class199.field3714.method311((byte) -127, class36.field789.field3397, 0, 2);
            class36.field789.field3432 = 0;
            class150.field2705 = class36.field789.method1252(2);
        }
        if (class150.field2705 > var1) {
            return false;
        }
        class36.field789.field3432 = 0;
        class199.field3714.method311((byte) -124, class36.field789.field3397, 0, class150.field2705);
        class192.field3581 = class223.field4120;
        class223.field4120 = class2.field23;
        class17.field460 = 0;
        class2.field23 = class169.field3043;
        if (class169.field3043 == 143) {
            int var2 = class36.field789.method1241(-98);
            int var3 = class36.field789.method1251((byte) -110);
            int var4 = class36.field789.method1241(-26);
            class6 var5 = class87.method580(var3, 49);
            var5.field90 = 0;
            var5.field166 = var5.field75 = var2;
            var5.field83 = var5.field110 = var4;
            var5.field213 = 0;
            class139.method880(var5, 127);
            class169.field3043 = -1;
            return true;
        } else if (class169.field3043 == 209) {
            class115.method740(class36.field789, (byte) 92, class25.field588, class150.field2705);
            class169.field3043 = -1;
            return true;
        } else if (class169.field3043 == 65) {
            int var6 = class150.field2705 + class36.field789.field3432;
            int var7 = class36.field789.method1252(2);
            int var8 = class36.field789.method1252(2);
            if (class159.field2899 != var7) {
                class159.field2899 = var7;
                class164.method1051((byte) 111, class159.field2899);
                class175.method1110(70);
                class237.method1541(class159.field2899, -128);
                for (int var9 = 0; var9 < 100; var9++) {
                    class143.field2592[var9] = true;
                }
            }
            while (var8-- > 0) {
                int var18 = class36.field789.method1231(-4898);
                int var19 = class36.field789.method1252(2);
                int var20 = class36.field789.method1243(3);
                class98 var21 = (class98) class36.field797.method909(-1, (long) var18);
                if (var21 != null && var21.field1831 != var19) {
                    class110.method716(1, true, var21);
                    var21 = null;
                }
                if (var21 == null) {
                    var21 = class31.method203(var19, var20, -123, var18);
                }
                var21.field1827 = true;
            }
            for (class98 var10 = (class98) class36.field797.method913(0); var10 != null; var10 = (class98) class36.field797.method907(true)) {
                if (var10.field1827) {
                    var10.field1827 = false;
                } else {
                    class110.method716(1, true, var10);
                }
            }
            class30.field652 = new class144(512);
            while (class36.field789.field3432 < var6) {
                int var11 = class36.field789.method1231(-4898);
                int var12 = class36.field789.method1252(2);
                int var13 = class36.field789.method1252(2);
                int var14 = class36.field789.method1231(-4898);
                for (int var15 = var12; var15 <= var13; var15++) {
                    long var16 = ((long) var11 << 32) + ((long) var15);
                    class30.field652.method914(var16, new class43(var14), true);
                }
            }
            class169.field3043 = -1;
            return true;
        } else if (class169.field3043 == 21) {
            int var22 = class36.field789.method1250(2);
            int var23 = class36.field789.method1240((byte) -3);
            int var24 = var22 >> 5 & 0x1F;
            int var25 = var22 & 0x1F;
            int var26 = var22 >> 10 & 0x1F;
            int var27 = (var26 << 19) - (-(var24 << 11) - (var25 << 3));
            class6 var28 = class87.method580(var23, 71);
            if (var28.field193 != var27) {
                var28.field193 = var27;
                class139.method880(var28, 96);
            }
            class169.field3043 = -1;
            return true;
        } else if (class169.field3043 == 145) {
            class139.field2567 = 0;
            class169.field3043 = -1;
            return true;
        } else if (class169.field3043 == 191) {
            int var29 = class36.field789.method1240((byte) -122);
            class147.field2661 = class25.field588.method10(var29, (byte) -55);
            class169.field3043 = -1;
            return true;
        } else if (class169.field3043 == 78) {
            class241.field4432 = class36.field789.method1243(3);
            class43.field936 = class32.field693;
            class169.field3043 = -1;
            return true;
        } else if (class169.field3043 == 67) {
            int var30 = class36.field789.method1252(2);
            if (var30 == 65535) {
                var30 = -1;
            }
            int var31 = class36.field789.method1243(3);
            int var32 = class36.field789.method1252(2);
            class121.method777(var30, var31, var32, -110);
            class169.field3043 = -1;
            return true;
        } else if (class169.field3043 == 220) {
            long var33 = class36.field789.method1226(-1);
            class36.field789.method1204(false);
            long var35 = class36.field789.method1226(-1);
            long var37 = (long) class36.field789.method1252(2);
            long var39 = (long) class36.field789.method1244(-27523);
            int var41 = class36.field789.method1243(3);
            long var42 = (var37 << 32) + var39;
            boolean var44 = false;
            for (int var45 = 0; var45 < 100; var45++) {
                if (class179.field3262[var45] == var42) {
                    var44 = true;
                    break;
                }
            }
            if (var41 <= 1) {
                for (int var46 = 0; var46 < class98.field1840; var46++) {
                    if (class237.field4358[var46] == var33) {
                        var44 = true;
                        break;
                    }
                }
            }
            if (!var44 && class110.field2059 == 0) {
                class179.field3262[class136.field2514] = var42;
                class136.field2514 = (class136.field2514 + 1) % 100;
                class179 var47 = class156.method1013(class179.method1133(class36.field789, 34).method1159((byte) 126));
                if (var41 == 2 || var41 == 3) {
                    class187.method1263(9, class78.method502((byte) -122, new class179[] { class175.field3174, class12.method82(4, var33).method1140((byte) 32) }), -1, class12.method82(4, var35).method1140((byte) 32), var47);
                } else if (var41 == 1) {
                    class187.method1263(9, class78.method502((byte) -82, new class179[] { class124.field2286, class12.method82(4, var33).method1140((byte) 32) }), -1, class12.method82(4, var35).method1140((byte) 32), var47);
                } else {
                    class187.method1263(9, class12.method82(4, var33).method1140((byte) 32), -1, class12.method82(4, var35).method1140((byte) 32), var47);
                }
            }
            class169.field3043 = -1;
            return true;
        } else if (class169.field3043 == 16) {
            int var48 = class36.field789.method1223(121);
            int var49 = class36.field789.method1252(2);
            if (var48 == 1) {
                class176.method1116();
                for (int var50 = 0; var50 < 4; var50++) {
                    class135.field2492[var50].method269(16777215);
                }
                System.gc();
            } else if (var48 == 2) {
                class132.method849((byte) 116);
                System.gc();
                class223.method1449((byte) 106, 25);
            }
            class159.field2899 = var49;
            class164.method1051((byte) 111, var49);
            class175.method1110(70);
            class237.method1541(class159.field2899, -127);
            for (int var51 = 0; var51 < 100; var51++) {
                class143.field2592[var51] = true;
            }
            class169.field3043 = -1;
            return true;
        } else if (class169.field3043 == 148) {
            long var52 = class36.field789.method1226(-1);
            class36.field789.method1204(false);
            long var54 = class36.field789.method1226(-1);
            long var56 = (long) class36.field789.method1252(2);
            long var58 = (long) class36.field789.method1244(-27523);
            int var60 = class36.field789.method1243(3);
            int var61 = class36.field789.method1252(2);
            boolean var62 = false;
            long var63 = (var56 << 32) + var58;
            for (int var65 = 0; var65 < 100; var65++) {
                if (class179.field3262[var65] == var63) {
                    var62 = true;
                    break;
                }
            }
            if (var60 <= 1) {
                for (int var66 = 0; var66 < class98.field1840; var66++) {
                    if (class237.field4358[var66] == var52) {
                        var62 = true;
                        break;
                    }
                }
            }
            if (!var62 && class110.field2059 == 0) {
                class179.field3262[class136.field2514] = var63;
                class136.field2514 = (class136.field2514 + 1) % 100;
                class179 var67 = class238.method1543(93, var61).method837(class36.field789, true);
                if (var60 == 2 || var60 == 3) {
                    class58.method394(var67, 20, 0, class12.method82(4, var54).method1140((byte) 32), class78.method502((byte) -99, new class179[] { class175.field3174, class12.method82(4, var52).method1140((byte) 32) }), var61);
                } else if (var60 == 1) {
                    class58.method394(var67, 20, 0, class12.method82(4, var54).method1140((byte) 32), class78.method502((byte) -87, new class179[] { class124.field2286, class12.method82(4, var52).method1140((byte) 32) }), var61);
                } else {
                    class58.method394(var67, 20, 0, class12.method82(4, var54).method1140((byte) 32), class12.method82(4, var52).method1140((byte) 32), var61);
                }
            }
            class169.field3043 = -1;
            return true;
        } else if (class169.field3043 == 214) {
            long var68 = class36.field789.method1226(-1);
            boolean var70 = false;
            if ((Long.MIN_VALUE & var68) != 0L) {
                var70 = true;
            }
            int var71 = class36.field789.method1252(2);
            byte var72 = class36.field789.method1204(false);
            if (var70) {
                if (class162.field2924 == 0) {
                    class169.field3043 = -1;
                    return true;
                }
                long var73 = var68 & Long.MAX_VALUE;
                boolean var75 = false;
                int var76;
                for (var76 = 0; var76 < class162.field2924 && (class155.field2786[var76].field1694 != var73 || class155.field2786[var76].field4437 != var71); var76++) {
                }
                if (var76 < class162.field2924) {
                    while (var76 < class162.field2924 - 1) {
                        class155.field2786[var76] = class155.field2786[var76 + 1];
                        var76++;
                    }
                    class162.field2924--;
                    class155.field2786[class162.field2924] = null;
                }
            } else {
                class179 var77 = class36.field789.method1242(-92);
                class241 var78 = new class241();
                var78.field1694 = var68;
                var78.field4433 = class12.method82(4, var78.field1694);
                var78.field4425 = var72;
                var78.field4437 = var71;
                var78.field4426 = var77;
                int var79;
                for (var79 = class162.field2924 - 1; var79 >= 0; var79--) {
                    int var80 = class155.field2786[var79].field4433.method1132(var78.field4433, 1);
                    if (var80 == 0) {
                        class155.field2786[var79].field4437 = var71;
                        class155.field2786[var79].field4425 = var72;
                        class155.field2786[var79].field4426 = var77;
                        if (class16.field445 == var68) {
                            class198.field3692 = var72;
                        }
                        class169.field3043 = -1;
                        class240.field4419 = class32.field693;
                        return true;
                    }
                    if (var80 < 0) {
                        break;
                    }
                }
                if (class155.field2786.length <= class162.field2924) {
                    class169.field3043 = -1;
                    return true;
                }
                for (int var81 = class162.field2924 - 1; var81 > var79; var81--) {
                    class155.field2786[var81 + 1] = class155.field2786[var81];
                }
                if (class162.field2924 == 0) {
                    class155.field2786 = new class241[100];
                }
                class155.field2786[var79 + 1] = var78;
                if (class16.field445 == var68) {
                    class198.field3692 = var72;
                }
                class162.field2924++;
            }
            class240.field4419 = class32.field693;
            class169.field3043 = -1;
            return true;
        } else if (class169.field3043 == 243) {
            class131.method841(128);
            class132.field2392 = class36.field789.method1243(3);
            class225.field4172 = class32.field693;
            class169.field3043 = -1;
            return true;
        } else if (class169.field3043 == 107) {
            int var82 = class36.field789.method1237(65);
            int var83 = class36.field789.method1250(2);
            int var84 = class36.field789.method1250(2);
            int var85 = class36.field789.method1240((byte) 74);
            class6 var86 = class87.method580(var85, 111);
            if (var86.field163 != var83 || var86.field199 != var82 || var86.field143 != var84) {
                var86.field143 = var84;
                var86.field163 = var83;
                var86.field199 = var82;
                class139.method880(var86, 126);
            }
            class169.field3043 = -1;
            return true;
        } else if (class169.field3043 == 170) {
            for (int var87 = 0; var87 < class14.field355.length; var87++) {
                if (class14.field355[var87] != class125.field2304[var87]) {
                    class14.field355[var87] = class125.field2304[var87];
                    class38.method250(var87, -8);
                    class116.field2192[class107.method696(31, class49.field1053++)] = var87;
                }
            }
            class169.field3043 = -1;
            return true;
        } else if (class169.field3043 == 45) {
            class112.field2108 = false;
            for (int var88 = 0; var88 < 5; var88++) {
                class243.field4450[var88] = false;
            }
            class169.field3043 = -1;
            return true;
        } else if (class169.field3043 == 238) {
            int var89 = class36.field789.method1240((byte) -111);
            int var90 = class36.field789.method1237(77);
            if (var90 == 65535) {
                var90 = -1;
            }
            class6 var91 = class87.method580(var89, 48);
            if (var91.field218 != 2 || var91.field147 != var90) {
                var91.field218 = 2;
                var91.field147 = var90;
                class139.method880(var91, 106);
            }
            class169.field3043 = -1;
            return true;
        } else if (class169.field3043 == 210) {
            class179 var92 = class36.field789.method1242(-114);
            Object[] var93 = new Object[var92.method1168(true) + 1];
            for (int var94 = var92.method1168(true) - 1; var94 >= 0; var94--) {
                if (var92.method1161(var94, (byte) -116) == 115) {
                    var93[var94 + 1] = class36.field789.method1242(-107);
                } else {
                    var93[var94 + 1] = Integer.valueOf(class36.field789.method1231(-4898));
                }
            }
            var93[0] = Integer.valueOf(class36.field789.method1231(-4898));
            class19 var95 = new class19();
            var95.field491 = var93;
            class102.method681(200000, var95);
            class169.field3043 = -1;
            return true;
        } else if (class169.field3043 == 163) {
            int var96 = class36.field789.method1243(3);
            if (class36.field789.method1243(3) == 0) {
                class85.field1640[var96] = new class139();
            } else {
                class36.field789.field3432--;
                class85.field1640[var96] = new class139(class36.field789);
            }
            class147.field2665 = class32.field693;
            class169.field3043 = -1;
            return true;
        } else if (class169.field3043 == 134) {
            class174.method1101((byte) 121, class36.field789);
            class169.field3043 = -1;
            return true;
        } else if (class169.field3043 == 174) {
            int var97 = class36.field789.method1250(2);
            class11.method79(var97, (byte) 37);
            class141.field2578[class107.method696(31, class220.field4070++)] = class107.method696(32767, var97);
            class169.field3043 = -1;
            return true;
        } else if (class169.field3043 == 88) {
            int var98 = class36.field789.method1231(-4898);
            int var99 = class36.field789.method1252(2);
            if (var98 < -70000) {
                var99 += 32768;
            }
            class6 var100;
            if (var98 >= 0) {
                var100 = class87.method580(var98, 119);
            } else {
                var100 = null;
            }
            if (var100 != null) {
                for (int var101 = 0; var101 < var100.field111.length; var101++) {
                    var100.field111[var101] = 0;
                    var100.field68[var101] = 0;
                }
            }
            class225.method1475(var99, -1);
            int var102 = class36.field789.method1252(2);
            for (int var103 = 0; var103 < var102; var103++) {
                int var104 = class36.field789.method1245(-110);
                int var105 = class36.field789.method1202(true);
                if (var105 == 255) {
                    var105 = class36.field789.method1240((byte) -113);
                }
                if (var100 != null && var100.field111.length > var103) {
                    var100.field111[var103] = var104;
                    var100.field68[var103] = var105;
                }
                class92.method603(var104 - 1, var103, var105, var99, true);
            }
            if (var100 != null) {
                class139.method880(var100, 114);
            }
            class131.method841(128);
            class141.field2578[class107.method696(31, class220.field4070++)] = class107.method696(32767, var99);
            class169.field3043 = -1;
            return true;
        } else if (class169.field3043 == 255) {
            int var106 = class36.field789.method1252(2);
            if (var106 == 65535) {
                var106 = -1;
            }
            int var107 = class36.field789.method1231(-4898);
            int var108 = class36.field789.method1251((byte) 107);
            int var109 = class36.field789.method1237(91);
            if (var109 == 65535) {
                var109 = -1;
            }
            for (int var110 = var106; var110 <= var109; var110++) {
                long var111 = ((long) var107 << 32) + (long) var110;
                class89 var113 = class30.field652.method909(-1, var111);
                if (var113 != null) {
                    var113.method592((byte) -128);
                }
                class30.field652.method914(var111, new class43(var108), true);
            }
            class169.field3043 = -1;
            return true;
        } else if (class169.field3043 == 254) {
            int var114 = class36.field789.method1227((byte) -121);
            int var115 = class36.field789.method1250(2);
            if (var115 == 65535) {
                var115 = -1;
            }
            int var116 = class36.field789.method1251((byte) 89);
            class6 var117 = class87.method580(var116, 75);
            if (var117.field108) {
                var117.field172 = var115;
                var117.field188 = var114;
                class15 var118 = class131.method835((byte) -20, var115);
                var117.field149 = var118.field380;
                var117.field199 = var118.field424;
                var117.field219 = var118.field385;
                var117.field153 = var118.field387;
                var117.field143 = var118.field368;
                if (var117.field216 > 0) {
                    var117.field143 = var117.field143 * 32 / var117.field216;
                } else if (var117.field89 > 0) {
                    var117.field143 = var117.field143 * 32 / var117.field89;
                }
                var117.field163 = var118.field403;
                class139.method880(var117, 115);
            } else if (var115 == -1) {
                var117.field218 = 0;
                class169.field3043 = -1;
                return true;
            } else {
                class15 var119 = class131.method835((byte) -20, var115);
                var117.field218 = 4;
                var117.field147 = var115;
                var117.field163 = var119.field403;
                var117.field199 = var119.field424;
                var117.field143 = var119.field368 * 100 / var114;
                class139.method880(var117, 106);
            }
            class169.field3043 = -1;
            return true;
        } else if (class169.field3043 == 146) {
            class131.method841(128);
            int var120 = class36.field789.method1203(255);
            int var121 = class36.field789.method1251((byte) -119);
            int var122 = class36.field789.method1203(255);
            class136.field2517[var120] = var121;
            class69.field1393[var120] = var122;
            field3237[var120] = 1;
            for (int var123 = 0; var123 < 98; var123++) {
                if (var121 >= class135.field2490[var123]) {
                    field3237[var120] = var123 + 2;
                }
            }
            class111.field2079[class107.method696(31, class234.field4317++)] = var120;
            class169.field3043 = -1;
            return true;
        } else if (class169.field3043 == 232) {
            long var124 = class36.field789.method1226(-1);
            int var126 = class36.field789.method1252(2);
            int var127 = class36.field789.method1243(3);
            class179 var128 = class207.field3868;
            if (var126 > 0) {
                var128 = class36.field789.method1242(-102);
            }
            class179 var129 = class12.method82(4, var124).method1140((byte) 32);
            for (int var130 = 0; var130 < class202.field3741; var130++) {
                if (class160.field2908[var130] == var124) {
                    if (class10.field288[var130] != var126) {
                        class10.field288[var130] = var126;
                        if (var126 > 0) {
                            class189.method1276(5, (byte) 1, class78.method502((byte) -102, new class179[] { var129, class243.field4441 }), class207.field3868);
                        }
                        if (var126 == 0) {
                            class189.method1276(5, (byte) 1, class78.method502((byte) -98, new class179[] { var129, class81.field1572 }), class207.field3868);
                        }
                    }
                    var129 = null;
                    class237.field4372[var130] = var128;
                    class139.field2569[var130] = var127;
                    break;
                }
            }
            if (var129 != null && class202.field3741 < 200) {
                class160.field2908[class202.field3741] = var124;
                class152.field2743[class202.field3741] = var129;
                class10.field288[class202.field3741] = var126;
                class237.field4372[class202.field3741] = var128;
                class139.field2569[class202.field3741] = var127;
                class202.field3741++;
            }
            boolean var131 = false;
            class43.field936 = class32.field693;
            int var132 = class202.field3741;
            while (var132 > 0) {
                var132--;
                boolean var133 = true;
                for (int var134 = 0; var134 < var132; var134++) {
                    if (class10.field288[var134] != class136.field2515 && class10.field288[var134 + 1] == class136.field2515 || class10.field288[var134] == 0 && class10.field288[var134 + 1] != 0) {
                        var133 = false;
                        int var135 = class10.field288[var134];
                        class10.field288[var134] = class10.field288[var134 + 1];
                        class10.field288[var134 + 1] = var135;
                        class179 var136 = class237.field4372[var134];
                        class237.field4372[var134] = class237.field4372[var134 + 1];
                        class237.field4372[var134 + 1] = var136;
                        class179 var137 = class152.field2743[var134];
                        class152.field2743[var134] = class152.field2743[var134 + 1];
                        class152.field2743[var134 + 1] = var137;
                        long var138 = class160.field2908[var134];
                        class160.field2908[var134] = class160.field2908[var134 + 1];
                        class160.field2908[var134 + 1] = var138;
                        int var140 = class139.field2569[var134];
                        class139.field2569[var134] = class139.field2569[var134 + 1];
                        class139.field2569[var134 + 1] = var140;
                    }
                }
                if (var133) {
                    break;
                }
            }
            class169.field3043 = -1;
            return true;
        } else if (class169.field3043 == 165) {
            int var141 = class36.field789.method1250(2);
            if (var141 == 65535) {
                var141 = -1;
            }
            class187.method1267(var141, -1);
            class169.field3043 = -1;
            return true;
        } else if (class169.field3043 == 204) {
            int var142 = class36.field789.method1252(2);
            if (var142 == 65535) {
                var142 = -1;
            }
            int var143 = class36.field789.method1247((byte) 2);
            class42.method280(var142, var143, -31770);
            class169.field3043 = -1;
            return true;
        } else if (class169.field3043 == 18) {
            int var144 = class36.field789.method1237(-105);
            if (var144 == 65535) {
                var144 = -1;
            }
            int var145 = class36.field789.method1251((byte) 118);
            class6 var146 = class87.method580(var145, 45);
            if (var146.field218 != 1 || var146.field147 != var144) {
                var146.field218 = 1;
                var146.field147 = var144;
                class139.method880(var146, 108);
            }
            class169.field3043 = -1;
            return true;
        } else if (class169.field3043 == 52) {
            if (class159.field2899 != -1) {
                class193.method1296(class159.field2899, (byte) 46, 0);
            }
            class169.field3043 = -1;
            return true;
        } else if (class169.field3043 == 38) {
            class112.field2108 = true;
            class19.field500 = class36.field789.method1243(3);
            class127.field2328 = class36.field789.method1243(3);
            class88.field1680 = class36.field789.method1252(2);
            class62.field1311 = class36.field789.method1243(3);
            class58.field1254 = class36.field789.method1243(3);
            if (class58.field1254 >= 100) {
                class22.field538 = class19.field500 * 128 + 64;
                class198.field3700 = class127.field2328 * 128 + 64;
                class225.field4177 = class202.method1341(-99, class22.field538, class49.field1038, class198.field3700) - class88.field1680;
            }
            class169.field3043 = -1;
            return true;
        } else if (class169.field3043 == 46) {
            class124.method786(101);
            class169.field3043 = -1;
            return true;
        } else if (class169.field3043 == 14) {
            class179 var147 = class36.field789.method1242(-98);
            int var148 = class36.field789.method1251((byte) -115);
            class6 var149 = class87.method580(var148, 109);
            if (!var147.method1142(var149.field113, (byte) -127)) {
                var149.field113 = var147;
                class139.method880(var149, 103);
            }
            class169.field3043 = -1;
            return true;
        } else if (class169.field3043 == 103) {
            int var150 = class36.field789.method1243(3);
            class165 var151 = new class165();
            var151.field2991 = var150 & 0x3F;
            int var152 = var150 >> 6;
            var151.field2981 = class36.field789.method1243(3);
            if (var151.field2981 >= 0 && class194.field3621.length > var151.field2981) {
                if (var151.field2991 == 1 || var151.field2991 == 10) {
                    var151.field2992 = class36.field789.method1252(2);
                    class36.field789.field3432 += 3;
                } else if (var151.field2991 >= 2 && var151.field2991 <= 6) {
                    if (var151.field2991 == 2) {
                        var151.field2993 = 64;
                        var151.field2989 = 64;
                    }
                    if (var151.field2991 == 3) {
                        var151.field2989 = 64;
                        var151.field2993 = 0;
                    }
                    if (var151.field2991 == 4) {
                        var151.field2993 = 128;
                        var151.field2989 = 64;
                    }
                    if (var151.field2991 == 5) {
                        var151.field2993 = 64;
                        var151.field2989 = 0;
                    }
                    if (var151.field2991 == 6) {
                        var151.field2993 = 64;
                        var151.field2989 = 128;
                    }
                    var151.field2991 = 2;
                    var151.field2990 = class36.field789.method1252(2);
                    var151.field2988 = class36.field789.method1252(2);
                    var151.field2978 = class36.field789.method1243(3);
                }
                var151.field2979 = class36.field789.method1252(2);
                if (var151.field2979 == 65535) {
                    var151.field2979 = -1;
                }
                class187.field3477[var152] = var151;
            }
            class169.field3043 = -1;
            return true;
        } else if (class169.field3043 == 116) {
            class96.field1811 = class36.field789.method1203(255);
            class143.field2591 = class36.field789.method1203(255);
            for (int var153 = class96.field1811; var153 < class96.field1811 + 8; var153++) {
                for (int var155 = class143.field2591; var155 < class143.field2591 + 8; var155++) {
                    if (class108.field2021[class49.field1038][var153][var155] != null) {
                        class108.field2021[class49.field1038][var153][var155] = null;
                        class58.method398(var155, var153, (byte) -60);
                    }
                }
            }
            for (class112 var154 = (class112) class58.field1253.method242(16711680); var154 != null; var154 = (class112) class58.field1253.method237(10)) {
                if (class96.field1811 <= var154.field2104 && class96.field1811 + 8 > var154.field2104 && class143.field2591 <= var154.field2102 && class143.field2591 + 8 > var154.field2102 && class49.field1038 == var154.field2099) {
                    var154.field2098 = 0;
                }
            }
            class169.field3043 = -1;
            return true;
        } else if (class169.field3043 == 226) {
            int var156 = class36.field789.method1231(-4898);
            int var157 = class36.field789.method1231(-4898);
            class98 var158 = (class98) class36.field797.method909(-1, (long) var156);
            class98 var159 = (class98) class36.field797.method909(-1, (long) var157);
            if (var159 != null) {
                class110.method716(1, var158 == null || var158.field1831 != var159.field1831, var159);
            }
            if (var158 != null) {
                var158.method592((byte) -128);
                class36.field797.method914((long) var157, var158, true);
            }
            class6 var160 = class87.method580(var156, 127);
            if (var160 != null) {
                class139.method880(var160, 119);
            }
            class6 var161 = class87.method580(var157, 48);
            if (var161 != null) {
                class139.method880(var161, 106);
            }
            if (class159.field2899 != -1) {
                class193.method1296(class159.field2899, (byte) 95, 1);
            }
            class169.field3043 = -1;
            return true;
        } else if (class169.field3043 == 121) {
            class131.method841(128);
            class36.field802 = class36.field789.method1225((byte) -77);
            class169.field3043 = -1;
            class225.field4172 = class32.field693;
            return true;
        } else if (class169.field3043 == 75) {
            class219.method1429(-125);
            class169.field3043 = -1;
            return false;
        } else if (class169.field3043 == 195) {
            int var162 = class36.field789.method1245(-108);
            int var163 = class36.field789.method1251((byte) -115);
            class125.field2304[var162] = var163;
            if (class14.field355[var162] != var163) {
                class14.field355[var162] = var163;
                class38.method250(var162, -64);
            }
            class116.field2192[class107.method696(class49.field1053++, 31)] = var162;
            class169.field3043 = -1;
            return true;
        } else if (class169.field3043 == 229) {
            class194.field3618 = class36.field789.method1243(3);
            class169.field3043 = -1;
            return true;
        } else if (class169.field3043 == 84) {
            int var164 = class36.field789.method1243(3);
            int var165 = class36.field789.method1243(3);
            int var166 = class36.field789.method1243(3);
            int var167 = class36.field789.method1243(3);
            int var168 = class36.field789.method1252(2);
            class243.field4450[var164] = true;
            class146.field2654[var164] = var165;
            class11.field296[var164] = var166;
            class95.field1779[var164] = var167;
            class71.field1424[var164] = var168;
            class169.field3043 = -1;
            return true;
        } else if (class169.field3043 == 133) {
            byte[] var169 = new byte[class150.field2705];
            class36.field789.method66(82, var169, class150.field2705, 0);
            class172.method1090(class16.method127(class150.field2705, var169, 2, 0), (byte) 42);
            class169.field3043 = -1;
            return true;
        } else if (class169.field3043 == 17) {
            long var170 = class36.field789.method1226(-1);
            class179 var172 = class156.method1013(class179.method1133(class36.field789, -108).method1159((byte) 123));
            class189.method1276(6, (byte) 1, var172, class12.method82(4, var170).method1140((byte) 32));
            class169.field3043 = -1;
            return true;
        } else if (class169.field3043 == 168) {
            int var173 = class36.field789.method1231(-4898);
            class98 var174 = (class98) class36.field797.method909(-1, (long) var173);
            if (var174 != null) {
                class110.method716(1, true, var174);
            }
            if (class120.field2249 != null) {
                class139.method880(class120.field2249, 126);
                class120.field2249 = null;
            }
            class169.field3043 = -1;
            return true;
        } else if (class169.field3043 == 37) {
            int var175 = class36.field789.method1203(255);
            int var176 = class36.field789.method1203(255);
            class179 var177 = class36.field789.method1242(-109);
            if (var176 >= 1 && var176 <= 8) {
                if (var177.method1138(false, class22.field540)) {
                    var177 = null;
                }
                class167.field3015[var176 - 1] = var177;
                class176.field3210[var176 - 1] = var175 == 0;
            }
            class169.field3043 = -1;
            return true;
        } else if (class169.field3043 == 194) {
            for (int var178 = 0; var178 < class23.field554.length; var178++) {
                if (class23.field554[var178] != null) {
                    class23.field554[var178].field3182 = -1;
                }
            }
            for (int var179 = 0; var179 < class53.field1152.length; var179++) {
                if (class53.field1152[var179] != null) {
                    class53.field1152[var179].field3182 = -1;
                }
            }
            class169.field3043 = -1;
            return true;
        } else if (class169.field3043 == 96) {
            class179 var180 = class36.field789.method1242(-128);
            if (var180.method1136(class88.field1676, 113)) {
                class179 var210 = var180.method1156(-5684, var180.method1128(0, class169.field3045), 0);
                long var211 = var210.method1137(95);
                boolean var213 = false;
                for (int var214 = 0; var214 < class98.field1840; var214++) {
                    if (class237.field4358[var214] == var211) {
                        var213 = true;
                        break;
                    }
                }
                if (!var213 && class110.field2059 == 0) {
                    class189.method1276(4, (byte) 1, class150.field2700, var210);
                }
            } else if (var180.method1136(client.field706, 121)) {
                class179 var181 = var180.method1156(-5684, var180.method1128(0, class169.field3045), 0);
                boolean var182 = false;
                long var183 = var181.method1137(89);
                for (int var185 = 0; var185 < class98.field1840; var185++) {
                    if (class237.field4358[var185] == var183) {
                        var182 = true;
                        break;
                    }
                }
                if (!var182 && class110.field2059 == 0) {
                    class179 var186 = var180.method1156(-5684, var180.method1168(true) - 9, var180.method1128(0, class169.field3045) + 1);
                    class189.method1276(8, (byte) 1, var186, var181);
                }
            } else if (var180.method1136(class137.field2530, 113)) {
                class179 var187 = var180.method1156(-5684, var180.method1128(0, class169.field3045), 0);
                boolean var188 = false;
                long var189 = var187.method1137(108);
                for (int var191 = 0; var191 < class98.field1840; var191++) {
                    if (class237.field4358[var191] == var189) {
                        var188 = true;
                        break;
                    }
                }
                if (!var188 && class110.field2059 == 0) {
                    class189.method1276(10, (byte) 1, class207.field3868, var187);
                }
            } else if (var180.method1136(class141.field2584, 126)) {
                class179 var192 = var180.method1156(-5684, var180.method1128(0, class141.field2584), 0);
                class189.method1276(11, (byte) 1, var192, class207.field3868);
            } else if (var180.method1136(class36.field800, 115)) {
                class179 var209 = var180.method1156(-5684, var180.method1128(0, class36.field800), 0);
                if (class110.field2059 == 0) {
                    class189.method1276(12, (byte) 1, var209, class207.field3868);
                }
            } else if (var180.method1136(class86.field1646, 125)) {
                class179 var208 = var180.method1156(-5684, var180.method1128(0, class86.field1646), 0);
                if (class110.field2059 == 0) {
                    class189.method1276(13, (byte) 1, var208, class207.field3868);
                }
            } else if (var180.method1136(class195.field3632, 106)) {
                class179 var203 = var180.method1156(-5684, var180.method1128(0, class169.field3045), 0);
                long var204 = var203.method1137(80);
                boolean var206 = false;
                for (int var207 = 0; var207 < class98.field1840; var207++) {
                    if (class237.field4358[var207] == var204) {
                        var206 = true;
                        break;
                    }
                }
                if (!var206 && class110.field2059 == 0) {
                    class189.method1276(14, (byte) 1, class207.field3868, var203);
                }
            } else if (var180.method1136(class8.field239, 122)) {
                class179 var193 = var180.method1156(-5684, var180.method1128(0, class169.field3045), 0);
                long var194 = var193.method1137(82);
                boolean var196 = false;
                for (int var197 = 0; var197 < class98.field1840; var197++) {
                    if (class237.field4358[var197] == var194) {
                        var196 = true;
                        break;
                    }
                }
                if (!var196 && class110.field2059 == 0) {
                    class189.method1276(15, (byte) 1, class207.field3868, var193);
                }
            } else if (var180.method1136(class23.field568, 111)) {
                class179 var198 = var180.method1156(-5684, var180.method1128(0, class169.field3045), 0);
                long var199 = var198.method1137(72);
                boolean var201 = false;
                for (int var202 = 0; var202 < class98.field1840; var202++) {
                    if (class237.field4358[var202] == var199) {
                        var201 = true;
                        break;
                    }
                }
                if (!var201 && class110.field2059 == 0) {
                    class189.method1276(16, (byte) 1, class207.field3868, var198);
                }
            } else {
                class189.method1276(0, (byte) 1, var180, class207.field3868);
            }
            class169.field3043 = -1;
            return true;
        } else if (class169.field3043 == 164) {
            for (int var215 = 0; var215 < class207.field3874; var215++) {
                class4 var216 = class243.method1565(var215, (byte) -119);
                if (var216 != null && var216.field46 == 0) {
                    class125.field2304[var215] = 0;
                    class14.field355[var215] = 0;
                }
            }
            class131.method841(128);
            class49.field1053 += 32;
            class169.field3043 = -1;
            return true;
        } else if (class169.field3043 == 221) {
            long var217 = class36.field789.method1226(-1);
            long var219 = (long) class36.field789.method1252(2);
            long var221 = (long) class36.field789.method1244(-27523);
            int var223 = class36.field789.method1243(3);
            boolean var224 = false;
            long var225 = (var219 << 32) + var221;
            for (int var227 = 0; var227 < 100; var227++) {
                if (class179.field3262[var227] == var225) {
                    var224 = true;
                    break;
                }
            }
            if (var223 <= 1) {
                for (int var228 = 0; var228 < class98.field1840; var228++) {
                    if (class237.field4358[var228] == var217) {
                        var224 = true;
                        break;
                    }
                }
            }
            if (!var224 && class110.field2059 == 0) {
                class179.field3262[class136.field2514] = var225;
                class136.field2514 = (class136.field2514 + 1) % 100;
                class179 var229 = class156.method1013(class179.method1133(class36.field789, -78).method1159((byte) 125));
                if (var223 == 2 || var223 == 3) {
                    class189.method1276(7, (byte) 1, var229, class78.method502((byte) -106, new class179[] { class175.field3174, class12.method82(4, var217).method1140((byte) 32) }));
                } else if (var223 == 1) {
                    class189.method1276(7, (byte) 1, var229, class78.method502((byte) -106, new class179[] { class124.field2286, class12.method82(4, var217).method1140((byte) 32) }));
                } else {
                    class189.method1276(3, (byte) 1, var229, class12.method82(4, var217).method1140((byte) 32));
                }
            }
            class169.field3043 = -1;
            return true;
        } else if (class169.field3043 == 110) {
            int var230 = class36.field789.method1250(2);
            int var231 = class36.field789.method1245(-98);
            int var232 = class36.field789.method1240((byte) 52);
            class6 var233 = class87.method580(var232, 70);
            var233.field78 = (var231 << 16) + var230;
            class169.field3043 = -1;
            return true;
        } else if (class169.field3043 == 6) {
            class149.field2681 = class36.field789.method1252(2) * 30;
            class169.field3043 = -1;
            class225.field4172 = class32.field693;
            return true;
        } else if (class169.field3043 == 11) {
            class96.field1811 = class36.field789.method1223(124);
            class143.field2591 = class36.field789.method1243(3);
            while (class36.field789.field3432 < class150.field2705) {
                class169.field3043 = class36.field789.method1243(3);
                class235.method1528((byte) -50);
            }
            class169.field3043 = -1;
            return true;
        } else if (arg0 >= -34) {
            return true;
        } else if (class169.field3043 == 104) {
            int var234 = class36.field789.method1252(2);
            int var235 = class36.field789.method1243(3);
            int var236 = class36.field789.method1251((byte) -88);
            class98 var237 = (class98) class36.field797.method909(-1, (long) var236);
            if (var237 != null) {
                class110.method716(1, var237.field1831 != var234, var237);
            }
            class31.method203(var234, var235, -122, var236);
            class169.field3043 = -1;
            return true;
        } else if (class169.field3043 == 86) {
            class73.field1432 = class36.field789.method1242(-125);
            class66.method429((byte) 58, class73.field1432);
            class169.field3043 = -1;
            return true;
        } else if (class169.field3043 == 219) {
            long var238 = class36.field789.method1226(-1);
            int var240 = class36.field789.method1252(2);
            class179 var241 = class238.method1543(79, var240).method837(class36.field789, true);
            class58.method394(var241, 19, 0, null, class12.method82(4, var238).method1140((byte) 32), var240);
            class169.field3043 = -1;
            return true;
        } else if (class169.field3043 == 180) {
            class240.field4419 = class32.field693;
            long var242 = class36.field789.method1226(-1);
            if (var242 == 0L) {
                class117.field2202 = null;
                class155.field2786 = null;
                class162.field2924 = 0;
                class46.field1016 = null;
                class169.field3043 = -1;
                return true;
            }
            long var244 = class36.field789.method1226(-1);
            class117.field2202 = class12.method82(4, var244);
            class46.field1016 = class12.method82(4, var242);
            class199.field3711 = class36.field789.method1204(false);
            int var246 = class36.field789.method1243(3);
            if (var246 == 255) {
                class169.field3043 = -1;
                return true;
            }
            class241[] var247 = new class241[100];
            class162.field2924 = var246;
            for (int var248 = 0; var248 < class162.field2924; var248++) {
                var247[var248] = new class241();
                var247[var248].field1694 = class36.field789.method1226(-1);
                var247[var248].field4433 = class12.method82(4, var247[var248].field1694);
                var247[var248].field4437 = class36.field789.method1252(2);
                var247[var248].field4425 = class36.field789.method1204(false);
                var247[var248].field4426 = class36.field789.method1242(-98);
                if (class16.field445 == var247[var248].field1694) {
                    class198.field3692 = var247[var248].field4425;
                }
            }
            boolean var249 = false;
            int var250 = class162.field2924;
            while (var250 > 0) {
                var250--;
                boolean var251 = true;
                for (int var252 = 0; var252 < var250; var252++) {
                    if (var247[var252].field4433.method1132(var247[var252 + 1].field4433, 1) > 0) {
                        class241 var253 = var247[var252];
                        var251 = false;
                        var247[var252] = var247[var252 + 1];
                        var247[var252 + 1] = var253;
                    }
                }
                if (var251) {
                    break;
                }
            }
            class155.field2786 = var247;
            class169.field3043 = -1;
            return true;
        } else if (class169.field3043 == 51) {
            int var254 = class36.field789.method1227((byte) -119);
            boolean var255 = class36.field789.method1202(true) == 1;
            class6 var256 = class87.method580(var254, 55);
            if (var256.field226 != var255) {
                var256.field226 = var255;
                class139.method880(var256, 121);
            }
            class169.field3043 = -1;
            return true;
        } else if (class169.field3043 == 60) {
            int var257 = class36.field789.method1231(-4898);
            class6 var258 = class87.method580(var257, 117);
            for (int var259 = 0; var259 < var258.field111.length; var259++) {
                var258.field111[var259] = -1;
                var258.field111[var259] = 0;
            }
            class139.method880(var258, 123);
            class169.field3043 = -1;
            return true;
        } else if (class169.field3043 == 97) {
            int var260 = class36.field789.method1250(2);
            byte var261 = class36.field789.method1234((byte) 124);
            class125.field2304[var260] = var261;
            if (class14.field355[var260] != var261) {
                class14.field355[var260] = var261;
                class38.method250(var260, -83);
            }
            class116.field2192[class107.method696(class49.field1053++, 31)] = var260;
            class169.field3043 = -1;
            return true;
        } else if (class169.field3043 == 56) {
            int var262 = class36.field789.method1223(124);
            int var263 = class36.field789.method1203(255);
            int var264 = class36.field789.method1243(3);
            class49.field1038 = var263 >> 1;
            class61.field1298.method1108(var264, (var263 & 0x1) == 1, var262, 20826);
            class169.field3043 = -1;
            return true;
        } else if (class169.field3043 == 22) {
            if (class150.field2705 == 0) {
                class32.field690 = class121.field2260;
            } else {
                class32.field690 = class36.field789.method1242(-124);
            }
            class169.field3043 = -1;
            return true;
        } else if (class169.field3043 == 213) {
            class96.field1811 = class36.field789.method1203(255);
            class143.field2591 = class36.field789.method1243(3);
            class169.field3043 = -1;
            return true;
        } else if (class169.field3043 == 23) {
            class112.field2108 = true;
            class23.field555 = class36.field789.method1243(3);
            field3231 = class36.field789.method1243(3);
            class148.field2675 = class36.field789.method1252(2);
            class194.field3622 = class36.field789.method1243(3);
            class147.field2659 = class36.field789.method1243(3);
            if (class147.field2659 >= 100) {
                int var265 = class23.field555 * 128 + 64;
                int var266 = field3231 * 128 + 64;
                int var267 = class202.method1341(-42, var265, class49.field1038, var266) - class148.field2675;
                int var268 = var265 - class22.field538;
                int var269 = var267 - class225.field4177;
                int var270 = var266 - class198.field3700;
                int var271 = (int) Math.sqrt((double) (var268 * var268 + var270 * var270));
                class18.field480 = (int) (Math.atan2((double) var269, (double) var271) * 325.949D) & 0x7FF;
                class61.field1300 = (int) (Math.atan2((double) var268, (double) var270) * -325.949D) & 0x7FF;
                if (class18.field480 < 128) {
                    class18.field480 = 128;
                }
                if (class18.field480 > 383) {
                    class18.field480 = 383;
                }
            }
            class169.field3043 = -1;
            return true;
        } else if (class169.field3043 == 83) {
            long var272 = class36.field789.method1226(-1);
            long var274 = (long) class36.field789.method1252(2);
            long var276 = (long) class36.field789.method1244(-27523);
            long var278 = (var274 << 32) + var276;
            boolean var280 = false;
            int var281 = class36.field789.method1243(3);
            int var282 = class36.field789.method1252(2);
            for (int var283 = 0; var283 < 100; var283++) {
                if (class179.field3262[var283] == var278) {
                    var280 = true;
                    break;
                }
            }
            if (var281 <= 1) {
                for (int var284 = 0; var284 < class98.field1840; var284++) {
                    if (class237.field4358[var284] == var272) {
                        var280 = true;
                        break;
                    }
                }
            }
            if (!var280 && class110.field2059 == 0) {
                class179.field3262[class136.field2514] = var278;
                class136.field2514 = (class136.field2514 + 1) % 100;
                class179 var285 = class238.method1543(114, var282).method837(class36.field789, true);
                if (var281 == 2) {
                    class58.method394(var285, 18, 0, null, class78.method502((byte) -105, new class179[] { class175.field3174, class12.method82(4, var272).method1140((byte) 32) }), var282);
                } else if (var281 == 1) {
                    class58.method394(var285, 18, 0, null, class78.method502((byte) -116, new class179[] { class124.field2286, class12.method82(4, var272).method1140((byte) 32) }), var282);
                } else {
                    class58.method394(var285, 18, 0, null, class12.method82(4, var272).method1140((byte) 32), var282);
                }
            }
            class169.field3043 = -1;
            return true;
        } else if (class169.field3043 == 188) {
            class98.field1840 = class150.field2705 / 8;
            for (int var286 = 0; var286 < class98.field1840; var286++) {
                class237.field4358[var286] = class36.field789.method1226(-1);
                class66.field1344[var286] = class12.method82(4, class237.field4358[var286]);
            }
            class169.field3043 = -1;
            class43.field936 = class32.field693;
            return true;
        } else if (class169.field3043 == 142) {
            class29.method190(-126);
            class169.field3043 = -1;
            return true;
        } else if (class169.field3043 == 85) {
            int var287 = class36.field789.method1227((byte) -101);
            int var288 = class36.field789.method1241(-38);
            class6 var289 = class87.method580(var287, 37);
            if (var289.field184 != var288 || var288 == -1) {
                var289.field195 = 0;
                var289.field184 = var288;
                var289.field139 = 0;
                class139.method880(var289, 104);
            }
            class169.field3043 = -1;
            return true;
        } else if (class169.field3043 == 102) {
            class18.method135(-128, true);
            class169.field3043 = -1;
            return true;
        } else if (class169.field3043 == 19) {
            int var290 = class36.field789.method1251((byte) -120);
            class6 var291 = class87.method580(var290, 46);
            var291.field218 = 3;
            var291.field147 = class61.field1298.field2167.method631(11);
            class139.method880(var291, 111);
            class169.field3043 = -1;
            return true;
        } else if (class169.field3043 == 39) {
            int var292 = class36.field789.method1231(-4898);
            int var293 = class36.field789.method1252(2);
            class6 var294;
            if (var292 >= 0) {
                var294 = class87.method580(var292, 59);
            } else {
                var294 = null;
            }
            if (var292 < -70000) {
                var293 += 32768;
            }
            while (class36.field789.field3432 < class150.field2705) {
                int var295 = class36.field789.method1215((byte) 93);
                int var296 = 0;
                int var297 = class36.field789.method1252(2);
                if (var297 != 0) {
                    var296 = class36.field789.method1243(3);
                    if (var296 == 255) {
                        var296 = class36.field789.method1231(-4898);
                    }
                }
                if (var294 != null && var295 >= 0 && var294.field111.length > var295) {
                    var294.field111[var295] = var297;
                    var294.field68[var295] = var296;
                }
                class92.method603(var297 - 1, var295, var296, var293, true);
            }
            if (var294 != null) {
                class139.method880(var294, 108);
            }
            class131.method841(128);
            class141.field2578[class107.method696(31, class220.field4070++)] = class107.method696(var293, 32767);
            class169.field3043 = -1;
            return true;
        } else if (class169.field3043 == 89) {
            int var298 = class36.field789.method1227((byte) -126);
            int var299 = class36.field789.method1250(2);
            class6 var300 = class87.method580(var298, 107);
            if (var300 != null && var300.field128 == 0) {
                if (var299 > var300.field97 - var300.field73) {
                    var299 = var300.field97 - var300.field73;
                }
                if (var299 < 0) {
                    var299 = 0;
                }
                if (var300.field119 != var299) {
                    var300.field119 = var299;
                    class139.method880(var300, 124);
                }
            }
            class169.field3043 = -1;
            return true;
        } else if (class169.field3043 == 176) {
            class18.method135(106, false);
            class169.field3043 = -1;
            return true;
        } else if (class169.field3043 == 252) {
            class108.field2020 = class36.field789.method1243(3);
            class95.field1784 = class36.field789.method1243(3);
            class42.field876 = class36.field789.method1243(3);
            class169.field3043 = -1;
            return true;
        } else if (class169.field3043 == 211 || class169.field3043 == 74 || class169.field3043 == 109 || class169.field3043 == 131 || class169.field3043 == 43 || class169.field3043 == 71 || class169.field3043 == 162 || class169.field3043 == 8 || class169.field3043 == 223 || class169.field3043 == 28 || class169.field3043 == 117) {
            class235.method1528((byte) -65);
            class169.field3043 = -1;
            return true;
        } else if (class169.field3043 == 31) {
            int var301 = class36.field789.method1245(-109);
            int var302 = class36.field789.method1237(-70);
            class236.field4342 = var302;
            class175.field3145 = var301;
            class120.method771(false);
            class169.field3043 = -1;
            return true;
        } else {
            class214.method1406("T1 - " + class169.field3043 + "," + class223.field4120 + "," + class192.field3581 + " - " + class150.field2705, true, null);
            class219.method1429(-56);
            return true;
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V")
    public static void method1121(int arg0) {
        field3230 = null;
        field3229 = null;
        if (arg0 != 1) {
            field3230 = null;
        }
        field3237 = null;
        field3227 = null;
    }
}
