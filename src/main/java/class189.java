import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class189 {

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "[I")
    public static int[] field3100 = new int[2048];

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "Lnb;")
    public static class223 field3099 = new class223();

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "I")
    public static int field3096;

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "I")
    public static int field3097;

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "I")
    public static int field3098;

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)V")
    public static final void method1331(int arg0) {
        field3097++;
        if (class88.field1369 == 127) {
            int var1 = class229.field3584.method1849(255);
            int var2 = ((var1 & 0x74) >> 4) + class113.field1727;
            int var3 = (var1 & 0x7) + class241.field3763;
            int var4 = class229.field3584.method1830((byte) 124) + var2;
            int var5 = class229.field3584.method1830((byte) -66) + var3;
            int var6 = class229.field3584.method1847(-404);
            int var7 = class229.field3584.method1837(252);
            int var8 = class229.field3584.method1849(255) * 4;
            int var9 = class229.field3584.method1849(255) * 4;
            int var10 = class229.field3584.method1837(252);
            int var11 = class229.field3584.method1837(252);
            int var12 = class229.field3584.method1849(255);
            if (var12 == 255) {
                var12 = -1;
            }
            int var13 = class229.field3584.method1849(255);
            if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104 && var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104 && var7 != 65535) {
                int var14 = var3 * 128 + 64;
                int var15 = var5 * 128 + 64;
                int var16 = var2 * 128 + 64;
                int var17 = var4 * 128 + 64;
                class150 var18 = new class150(var7, class214.field3389, var16, var14, class60.method387(-18796, var14, var16, class214.field3389) - var8, var10 - -class274.field4472, var11 + class274.field4472, var12, var13, var6, var9);
                var18.method1020(arg0 ^ 0x424584D1, class60.method387(-18796, var15, var17, class214.field3389) - var9, var15, class274.field4472 + var10, var17);
                class173.field2894.method1554(5257, new class23(var18));
            }
        } else if (class88.field1369 == 205) {
            int var19 = class229.field3584.method1849(255);
            int var20 = ((var19 & 0xF3) >> 4) + class113.field1727 * 2;
            int var21 = class241.field3763 * 2 + (var19 & 0xF);
            int var22 = class229.field3584.method1830((byte) -56) + var20;
            int var23 = class229.field3584.method1830((byte) -70) + var21;
            int var24 = class229.field3584.method1847(-404);
            int var25 = class229.field3584.method1847(arg0 ^ 0xBDBA7ABC);
            int var26 = class229.field3584.method1837(252);
            int var27 = class229.field3584.method1830((byte) 89);
            int var28 = class229.field3584.method1849(255) * 4;
            int var29 = class229.field3584.method1837(arg0 ^ 0x4245842C);
            int var30 = class229.field3584.method1837(252);
            int var31 = class229.field3584.method1849(255);
            if (var31 == 255) {
                var31 = -1;
            }
            int var32 = class229.field3584.method1849(arg0 - 1111851985);
            if (var20 >= 0 && var21 >= 0 && var20 < 208 && var21 < 208 && var22 >= 0 && var23 >= 0 && var22 < 208 && var23 < 208 && var26 != 65535) {
                int var33 = var20 * 64;
                int var34 = var23 * 64;
                int var35 = var22 * 64;
                int var36 = var21 * 64;
                if (var24 != 0) {
                    int var38;
                    class62 var40;
                    if (var24 < 0) {
                        int var37 = -var24 - 1;
                        var38 = var37 >> 11 & 0xF;
                        int var39 = var37 & 0x7FF;
                        if (class41.field632 == var39) {
                            var40 = class217.field3408;
                        } else {
                            var40 = class28.field494[var39];
                        }
                    } else {
                        int var41 = var24 - 1;
                        var38 = (var41 & 0x7E23) >> 11;
                        int var42 = var41 & 0x7FF;
                        var40 = class131.field2113[var42];
                    }
                    if (var40 != null) {
                        class254 var43 = var40.method403((byte) 116);
                        if (var43.field4184 != null && var43.field4184[var38] != null) {
                            var27 -= var43.field4184[var38][1];
                            int var44 = var43.field4184[var38][0];
                            int var45 = class136.field2193[var40.field954];
                            int var46 = class136.field2191[var40.field954];
                            int var47 = var43.field4184[var38][2];
                            int var48 = var44 * var45 + var46 * var47 >> 16;
                            int var49 = var45 * var47 - (var44 * var46) >> 16;
                            var36 += var49;
                            var33 += var48;
                        }
                    }
                }
                class150 var51 = new class150(var26, class214.field3389, var33, var36, class60.method387(arg0 ^ 0xBDBA3244, var36, var33, class214.field3389) - var27, var29 - -class274.field4472, class274.field4472 + var30, var31, var32, var25, var28);
                var51.method1020(1, class60.method387(-18796, var34, var35, class214.field3389) - var28, var34, var29 + class274.field4472, var35);
                class173.field2894.method1554(5257, new class23(var51));
            }
        } else if (class88.field1369 == 54) {
            int var52 = class229.field3584.method1854(false);
            int var53 = ((var52 & 0x76) >> 4) + class113.field1727;
            int var54 = (var52 & 0x7) + class241.field3763;
            int var55 = class229.field3584.method1867((byte) -121);
            if (var53 >= 0 && var54 >= 0 && var53 < 104 && var54 < 104) {
                class223 var56 = class296.field4827[class214.field3389][var53][var54];
                if (var56 != null) {
                    for (class121 var57 = (class121) var56.method1553(true); var57 != null; var57 = (class121) var56.method1551(0)) {
                        if ((var55 & 0x7FFF) == var57.field1913.field2628) {
                            var57.method952((byte) 111);
                            break;
                        }
                    }
                    if (var56.method1553(true) == null) {
                        class296.field4827[class214.field3389][var53][var54] = null;
                    }
                    class63.method409(var54, (byte) -23, var53);
                }
            }
        } else if (class88.field1369 == 135) {
            int var58 = class229.field3584.method1849(255);
            int var59 = var58 & 0x3;
            int var60 = var58 >> 2;
            int var61 = class75.field1207[var60];
            int var62 = class229.field3584.method1854(false);
            int var63 = ((var62 & 0x75) >> 4) + class113.field1727;
            int var64 = class241.field3763 + (var62 & 0x7);
            int var65 = class229.field3584.method1829(-119);
            if (var63 >= 0 && var64 >= 0 && var63 < 104 && var64 < 104) {
                class257.method1735(0, var60, 0, var65, -1, var61, var59, class214.field3389, var63, var64);
            }
        } else if (class88.field1369 == 188) {
            int var66 = class229.field3584.method1849(255);
            int var67 = (var66 & 0x7) + class241.field3763;
            int var68 = class113.field1727 + (var66 >> 4 & 0x7);
            int var69 = class229.field3584.method1837(252);
            if (var69 == 65535) {
                var69 = -1;
            }
            int var70 = class229.field3584.method1849(255);
            int var71 = (var70 & 0xFD) >> 4;
            int var72 = class229.field3584.method1849(arg0 ^ 0x4245842F);
            int var73 = var70 & 0x7;
            int var74 = class229.field3584.method1849(255);
            if (var68 >= 0 && var67 >= 0 && var68 < 104 && var67 < 104) {
                int var75 = var71 + 1;
                if (var68 - var75 <= class217.field3408.field965[0] && var68 + var75 >= class217.field3408.field965[0] && var67 - var75 <= class217.field3408.field956[0] && (var67 + var75) >= class217.field3408.field956[0] && class66.field1067 != 0 && var73 > 0 && class162.field2647 < 50 && var69 != -1) {
                    class233.field3647[class162.field2647] = var69;
                    class68.field1087[class162.field2647] = var73;
                    class199.field3193[class162.field2647] = var72;
                    class4.field98[class162.field2647] = null;
                    class12.field229[class162.field2647] = (var68 << 16) + (var67 << 8) + var71;
                    class188.field3085[class162.field2647] = var74;
                    class162.field2647++;
                }
            }
        } else if (class88.field1369 == 36) {
            int var76 = class229.field3584.method1867((byte) -116);
            int var77 = class229.field3584.method1837(252);
            int var78 = class229.field3584.method1815(-98);
            int var79 = class229.field3584.method1854(false);
            int var80 = (var79 >> 4 & 0x7) + class113.field1727;
            int var81 = class241.field3763 + (var79 & 0x7);
            if (var80 >= 0 && var81 >= 0 && var80 < 104 && var81 < 104 && class41.field632 != var77) {
                class161 var82 = new class161();
                var82.field2623 = var76;
                var82.field2628 = var78;
                if (class296.field4827[class214.field3389][var80][var81] == null) {
                    class296.field4827[class214.field3389][var80][var81] = new class223();
                }
                class296.field4827[class214.field3389][var80][var81].method1554(5257, new class121(var82));
                class63.method409(var81, (byte) -45, var80);
            }
        } else if (class88.field1369 == 3) {
            int var83 = class229.field3584.method1849(255);
            int var84 = ((var83 & 0xF2) >> 4) + class113.field1727 * 2;
            int var85 = (var83 & 0xF) + class241.field3763 * 2;
            int var86 = class229.field3584.method1830((byte) -117) + var84;
            int var87 = class229.field3584.method1830((byte) 100) + var85;
            int var88 = class229.field3584.method1847(-404);
            int var89 = class229.field3584.method1837(arg0 ^ 0x4245842C);
            int var90 = class229.field3584.method1849(255) * 4;
            int var91 = class229.field3584.method1849(255) * 4;
            int var92 = class229.field3584.method1837(252);
            int var93 = class229.field3584.method1837(252);
            int var94 = class229.field3584.method1849(255);
            if (var94 == 255) {
                var94 = -1;
            }
            int var95 = class229.field3584.method1849(255);
            if (var84 >= 0 && var85 >= 0 && var84 < 208 && var85 < 208 && var86 >= 0 && var87 >= 0 && var86 < 208 && var87 < 208 && var89 != 65535) {
                int var96 = var87 * 64;
                int var97 = var85 * 64;
                int var98 = var86 * 64;
                int var99 = var84 * 64;
                class150 var100 = new class150(var89, class214.field3389, var99, var97, class60.method387(-18796, var97, var99, class214.field3389) - var90, class274.field4472 + var92, class274.field4472 + var93, var94, var95, var88, var91);
                var100.method1020(arg0 - 1111852239, class60.method387(arg0 ^ 0xBDBA3244, var96, var98, class214.field3389) + -var91, var96, class274.field4472 + var92, var98);
                class173.field2894.method1554(5257, new class23(var100));
            }
        } else if (class88.field1369 == 121) {
            int var101 = class229.field3584.method1871((byte) -33);
            int var102 = (var101 & 0x7) + class241.field3763;
            int var103 = (var101 >> 4 & 0x7) + class113.field1727;
            int var104 = class229.field3584.method1815(-94);
            int var105 = class229.field3584.method1815(arg0 ^ 0xBDBA7B53);
            if (var103 >= 0 && var102 >= 0 && var103 < 104 && var102 < 104) {
                class161 var106 = new class161();
                var106.field2628 = var104;
                var106.field2623 = var105;
                if (class296.field4827[class214.field3389][var103][var102] == null) {
                    class296.field4827[class214.field3389][var103][var102] = new class223();
                }
                class296.field4827[class214.field3389][var103][var102].method1554(5257, new class121(var106));
                class63.method409(var102, (byte) -23, var103);
            }
        } else if (class88.field1369 == 182) {
            int var107 = class229.field3584.method1837(252);
            int var108 = class229.field3584.method1849(255);
            class49.method319(var107, 0).method1222(var108, arg0 - 1111823131);
        } else if (class88.field1369 == 149) {
            int var109 = class229.field3584.method1849(255);
            int var110 = class113.field1727 + (var109 >> 4 & 0x7);
            int var111 = (var109 & 0x7) + class241.field3763;
            int var112 = class229.field3584.method1837(arg0 - 1111851988);
            int var113 = class229.field3584.method1837(arg0 - 1111851988);
            int var114 = class229.field3584.method1837(arg0 - 1111851988);
            if (var110 >= 0 && var111 >= 0 && var110 < 104 && var111 < 104) {
                class223 var115 = class296.field4827[class214.field3389][var110][var111];
                if (var115 != null) {
                    for (class121 var116 = (class121) var115.method1553(true); var116 != null; var116 = (class121) var115.method1551(0)) {
                        class161 var117 = var116.field1913;
                        if ((var112 & 0x7FFF) == var117.field2628 && var117.field2623 == var113) {
                            var117.field2623 = var114;
                            break;
                        }
                    }
                    class63.method409(var111, (byte) -31, var110);
                }
            }
        } else if (class88.field1369 == 164) {
            int var118 = class229.field3584.method1837(252);
            if (var118 == 65535) {
                var118 = -1;
            }
            int var119 = class229.field3584.method1871((byte) -33);
            int var120 = ((var119 & 0x7D) >> 4) + class113.field1727;
            int var121 = (var119 & 0x7) + class241.field3763;
            int var122 = class229.field3584.method1849(255);
            int var123 = var122 >> 2;
            int var124 = class75.field1207[var123];
            int var125 = var122 & 0x3;
            class110.method768(var118, class214.field3389, var124, var120, var123, var121, -947781874, var125);
        } else if (class88.field1369 == 153) {
            int var126 = class229.field3584.method1849(255);
            int var127 = (var126 >> 4 & 0x7) + class113.field1727;
            int var128 = class241.field3763 + (var126 & 0x7);
            int var129 = class229.field3584.method1854(false);
            int var130 = var129 >> 2;
            int var131 = var129 & 0x3;
            int var132 = class75.field1207[var130];
            if (var127 >= 0 && var128 >= 0 && var127 < 104 && var128 < 104) {
                class257.method1735(0, var130, 0, -1, -1, var132, var131, class214.field3389, var127, var128);
            }
        } else {
            if (arg0 != 1111852240) {
                field3100 = null;
            }
            if (class88.field1369 == 73) {
                int var133 = class229.field3584.method1849(255);
                int var134 = class113.field1727 + (var133 >> 4 & 0x7);
                int var135 = (var133 & 0x7) + class241.field3763;
                int var136 = class229.field3584.method1837(252);
                int var137 = class229.field3584.method1849(255);
                int var138 = class229.field3584.method1837(252);
                if (var134 >= 0 && var135 >= 0 && var134 < 104 && var135 < 104) {
                    int var139 = var134 * 128 + 64;
                    int var140 = var135 * 128 + 64;
                    class98 var141 = new class98(var136, class214.field3389, var139, var140, class60.method387(arg0 ^ 0xBDBA3244, var140, var139, class214.field3389) - var137, var138, class274.field4472);
                    class127.field2023.method1554(arg0 ^ 0x42459059, new class27(var141));
                }
            } else if (class88.field1369 == 101) {
                byte var142 = class229.field3584.method1846(arg0 - 1111852112);
                byte var143 = class229.field3584.method1846(arg0 - 1111852112);
                byte var144 = class229.field3584.method1846(128);
                int var145 = class229.field3584.method1815(arg0 - 1111852355);
                byte var146 = class229.field3584.method1813((byte) -90);
                int var147 = class229.field3584.method1837(252);
                int var148 = class229.field3584.method1838(-128);
                int var149 = class229.field3584.method1815(-106);
                int var150 = class229.field3584.method1854(false);
                int var151 = (var150 & 0x7) + class241.field3763;
                int var152 = (var150 >> 4 & 0x7) + class113.field1727;
                int var153 = class229.field3584.method1871((byte) -33);
                int var154 = var153 >> 2;
                int var155 = var153 & 0x3;
                class244.method1658(var152, arg0 ^ 0x424594D0, var147, var155, var148, var143, var154, var151, var145, var146, var149, var142, var144);
            }
        }
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(I)V")
    public static void method1332(int arg0) {
        if (arg0 != 128) {
            field3101 = -21;
        }
        field3100 = null;
        field3099 = null;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(JIIB)Z")
    public static final boolean method1333(long arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != -106) {
            method1333(24L, 107, -67, (byte) -81);
        }
        int var5 = (int) arg0 >> 14 & 0x1F;
        field3098++;
        int var6 = (int) (arg0 >>> 32) & Integer.MAX_VALUE;
        int var7 = (int) arg0 >> 20 & 0x3;
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class172 var8 = class49.method319(var6, 0);
            int var9;
            int var10;
            if (var7 == 0 || var7 == 2) {
                var9 = var8.field2821;
                var10 = var8.field2809;
            } else {
                var9 = var8.field2809;
                var10 = var8.field2821;
            }
            int var11 = var8.field2819;
            if (var7 != 0) {
                var11 = (var11 << var7 & 0xF) + (var11 >> 4 - var7);
            }
            class74.method539(0, class217.field3408.field965[0], var11, arg2, arg1, var10, true, arg3 + 103, var9, 0, class217.field3408.field956[0]);
        } else {
            class74.method539(var7, class217.field3408.field965[0], 0, arg2, arg1, 0, true, -3, 0, var5 + 1, class217.field3408.field956[0]);
        }
        return true;
    }
}
