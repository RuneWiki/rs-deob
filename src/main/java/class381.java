import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class381 extends class111 {

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "[I")
    private int[] field5551 = new int[512];

    @OriginalMember(owner = "client!kj", name = "i", descriptor = "Lsk;")
    public static class423 field5552 = new class423("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");

    @OriginalMember(owner = "client!kj", name = "l", descriptor = "Z")
    public static boolean field5555 = false;

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "I")
    public static int field5550;

    @OriginalMember(owner = "client!kj", name = "j", descriptor = "I")
    public static int field5553;

    @OriginalMember(owner = "client!kj", name = "k", descriptor = "I")
    public static int field5554;

    @OriginalMember(owner = "client!kj", name = "m", descriptor = "I")
    public static int field5556;

    @OriginalMember(owner = "client!kj", name = "n", descriptor = "I")
    public static int field5557;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(FIFI[FZIFIFI)V")
    public final void method794(float arg0, int arg1, float arg2, int arg3, float[] arg4, boolean arg5, int arg6, float arg7, int arg8, float arg9, int arg10) {
        field5556++;
        int var12 = (int) ((float) arg6 * arg2 - 1.0F);
        int var13 = var12 & 0xFF;
        int var14 = (int) ((float) arg10 * arg0 - 1.0F);
        int var15 = var14 & 0xFF;
        int var16 = (int) ((float) arg1 * arg9 - 1.0F);
        int var17 = var16 & 0xFF;
        float var18 = (float) arg8 * arg9;
        int var19 = (int) var18;
        int var20 = var19 + 1;
        float var21 = var18 - (float) var19;
        float var22 = 1.0F - var21;
        int var23 = var20 & var17;
        int var24 = var19 & var17;
        float var25 = class65.method451(var21, arg5);
        int var26 = this.field5551[var24];
        int var27 = this.field5551[var23];
        for (int var28 = 0; var28 < arg10; var28++) {
            float var29 = (float) var28 * arg0;
            int var30 = (int) var29;
            int var31 = var30 + 1;
            float var32 = var29 - (float) var30;
            float var33 = 1.0F - var32;
            int var34 = var31 & var15;
            float var35 = class65.method451(var32, false);
            int var36 = var30 & var15;
            int var37 = this.field5551[var36 + var26];
            int var38 = this.field5551[var26 + var34];
            int var39 = this.field5551[var36 + var27];
            int var40 = this.field5551[var27 + var34];
            for (int var41 = 0; var41 < arg6; var41++) {
                float var42 = (float) var41 * arg2;
                int var43 = (int) var42;
                int var44 = var43 + 1;
                float var45 = var42 - (float) var43;
                float var46 = 1.0F - var45;
                int var47 = var43 & var13;
                int var48 = var44 & var13;
                float var49 = class65.method451(var45, false);
                arg4[arg3++] = class498.method2994((byte) -125, var25, class498.method2994((byte) -113, var35, class498.method2994((byte) -80, var49, class220.method1342(0, var21, var32, var45, class330.method2050(7, this.field5551[var40 + var48])), class220.method1342(0, var21, var32, var46, class330.method2050(7, this.field5551[var47 + var40]))), class498.method2994((byte) -100, var49, class220.method1342(0, var21, var33, var45, class330.method2050(this.field5551[var39 + var48], 7)), class220.method1342(0, var21, var33, var46, class330.method2050(this.field5551[var47 + var39], 7)))), class498.method2994((byte) -92, var35, class498.method2994((byte) -99, var49, class220.method1342(0, var22, var32, var45, class330.method2050(7, this.field5551[var48 + var38])), class220.method1342(0, var22, var32, var46, class330.method2050(this.field5551[var38 + var47], 7))), class498.method2994((byte) -119, var49, class220.method1342(0, var22, var33, var45, class330.method2050(this.field5551[var48 + var37], 7)), class220.method1342(0, var22, var33, var46, class330.method2050(7, this.field5551[var37 + var47]))))) * arg7;
            }
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lnd;Z)V")
    public static final void method2286(class366 arg0, boolean arg1) {
        field5554++;
        if (class230.field3502 == arg0) {
            int var2 = class491.field7457.method257((byte) 118);
            int var3 = class328.field4922 + ((var2 & 0x70) >> 4);
            int var4 = (var2 & 0x7) + class321.field4833;
            int var5 = class491.field7457.method254((byte) -42);
            int var6 = class491.field7457.method254((byte) -38);
            int var7 = class491.field7457.method254((byte) -105);
            if (class252.field3845 != null && var3 >= 0 && var4 >= 0 && class150.field2422 > var3 && var4 < class21.field272) {
                class163 var8 = (class163) class252.field3845.method2409(false, (long) (var3 | var4 << 14 | class359.field5317 << 28));
                if (var8 != null) {
                    for (class1 var9 = (class1) var8.field2536.method8((byte) -98); var9 != null; var9 = (class1) var8.field2536.method17((byte) -99)) {
                        if ((var5 & 0x7FFF) == var9.field1 && var9.field3 == var6) {
                            var9.method1121(false);
                            var9.field3 = var7;
                            class26.method136(var3, -12, var4, class359.field5317, var9);
                            break;
                        }
                    }
                    class59.method420(var3, (byte) 40, var4, class359.field5317);
                }
            }
        } else if (class341.field5091 == arg0) {
            int var10 = class491.field7457.method277(true);
            int var11 = ((var10 & 0x70) >> 4) + class328.field4922;
            int var12 = (var10 & 0x7) + class321.field4833;
            int var13 = class491.field7457.method254((byte) -128);
            int var14 = class491.field7457.method243(126);
            if (var11 >= 0 && var12 >= 0 && class150.field2422 > var11 && class21.field272 > var12) {
                class26.method136(var11, -128, var12, class359.field5317, new class1(var13, var14));
                class59.method420(var11, (byte) 40, var12, class359.field5317);
            }
        } else if (class502.field7594 == arg0) {
            int var15 = class491.field7457.method257((byte) 37);
            int var16 = class328.field4922 + ((var15 & 0x71) >> 4);
            int var17 = (var15 & 0x7) + class321.field4833;
            int var18 = class491.field7457.method254((byte) -101);
            int var19 = class491.field7457.method257((byte) 73);
            int var20 = class491.field7457.method254((byte) -82);
            int var21 = class491.field7457.method257((byte) 28);
            if (var16 >= 0 && var17 >= 0 && var16 < class150.field2422 && class21.field272 > var17) {
                int var22 = var16 * 128 + 64;
                int var23 = var17 * 128 + 64;
                int var24 = class359.field5317;
                if (var24 < 3 && class426.method2502(var16, var17, (byte) -69)) {
                    var24++;
                }
                class378 var25 = new class378(var18, var20, class369.field5424, class359.field5317, var24, var22, class7.method38(var22, class359.field5317, var23, (byte) -54) - var19, var23, var16, var16, var17, var17, var21);
                class480.field7334.method4(1, new class216(var25));
            }
        } else if (class291.field4437 == arg0) {
            int var26 = class491.field7457.method257((byte) 88);
            int var27 = ((var26 & 0x70) >> 4) + class328.field4922;
            int var28 = (var26 & 0x7) + class321.field4833;
            int var29 = class491.field7457.method254((byte) -71);
            if (var29 == 65535) {
                var29 = -1;
            }
            int var30 = class491.field7457.method257((byte) 49);
            int var31 = (var30 & 0xFA) >> 4;
            int var32 = var30 & 0x7;
            int var33 = class491.field7457.method257((byte) 23);
            int var34 = class491.field7457.method257((byte) 30);
            if (var27 >= 0 && var28 >= 0 && class150.field2422 > var27 && var28 < class21.field272) {
                int var35 = var31 + 1;
                if (class286.field4329.field2232[0] >= var27 - var35 && class286.field4329.field2232[0] <= (var27 + var35) && class286.field4329.field2239[0] >= var28 - var35 && class286.field4329.field2239[0] <= var28 + var35) {
                    class105.method776(var29, var32, -3, var33, (class359.field5317 << 24) + (var28 << 8) + (var27 << 16) + var31, var34);
                }
            }
        } else if (class93.field1661 == arg0) {
            int var36 = class491.field7457.method277(true);
            int var37 = var36 >> 2;
            int var38 = var36 & 0x3;
            int var39 = class491.field7457.method272(127);
            int var40 = class491.field7457.method243(-48);
            int var41 = class491.field7457.method257((byte) 34);
            int var42 = (var41 >> 4 & 0x7) + class328.field4922;
            int var43 = (var41 & 0x7) + class321.field4833;
            int var44 = class491.field7457.method254((byte) -53);
            int var45 = class491.field7457.method278(108);
            byte var46 = class491.field7457.method250(true);
            byte var47 = class491.field7457.method223((byte) -73);
            byte var48 = class491.field7457.method262(-2);
            byte var49 = class491.field7457.method250(!arg1);
            if (!class345.field5116.method1893()) {
                class113.method808(var49, var37, var44, (byte) 79, var48, var46, class359.field5317, var42, var38, var43, var39, var40, var47, var45);
            }
        } else if (class221.field3405 == arg0) {
            class491.field7457.method257((byte) 54);
            int var50 = class491.field7457.method257((byte) 94);
            int var51 = class328.field4922 + ((var50 & 0x7F) >> 4);
            int var52 = class321.field4833 + (var50 & 0x7);
            int var53 = class491.field7457.method254((byte) -78);
            int var54 = class491.field7457.method257((byte) 72);
            int var55 = class491.field7457.method224(-2);
            String var56 = class491.field7457.method239(!arg1);
            class18.method94(var56, var51, 4096, class359.field5317, var52, var53, var54, var55);
        } else if (class448.field6904 == arg0) {
            int var57 = class491.field7457.method247((byte) 0);
            int var58 = class491.field7457.method232((byte) 106);
            int var59 = class328.field4922 + (var58 >> 4 & 0x7);
            int var60 = (var58 & 0x7) + class321.field4833;
            if (var59 >= 0 && var60 >= 0 && var59 < class150.field2422 && class21.field272 > var60) {
                class163 var61 = (class163) class252.field3845.method2409(false, (long) (var59 | var60 << 14 | class359.field5317 << 28));
                if (var61 != null) {
                    for (class1 var62 = (class1) var61.field2536.method8((byte) -98); var62 != null; var62 = (class1) var61.field2536.method17((byte) 107)) {
                        if ((var57 & 0x7FFF) == var62.field1) {
                            var62.method1121(false);
                            break;
                        }
                    }
                    if (var61.field2536.method14(0)) {
                        var61.method1121(arg1);
                    }
                    class59.method420(var59, (byte) 40, var60, class359.field5317);
                }
            }
        } else if (class314.field4741 == arg0) {
            int var63 = class491.field7457.method254((byte) -43);
            int var64 = class491.field7457.method257((byte) 98);
            class128.field2070.method916((byte) -15, var63).method387((byte) 3, var64);
        } else if (class270.field4085 == arg0) {
            int var65 = class491.field7457.method257((byte) 100);
            int var66 = (var65 >> 4 & 0xF) + class328.field4922 * 2;
            int var67 = (var65 & 0xF) + class321.field4833 * 2;
            boolean var68 = class491.field7457.method257((byte) 26) != 0;
            int var69 = class491.field7457.method262(-2) + var66;
            int var70 = var67 + class491.field7457.method262(-2);
            int var71 = class491.field7457.method249(false);
            int var72 = class491.field7457.method249(arg1);
            int var73 = class491.field7457.method254((byte) -73);
            byte var74 = class491.field7457.method262(-2);
            int var75 = class491.field7457.method257((byte) 27) * 4;
            int var76 = class491.field7457.method254((byte) -48);
            int var77 = class491.field7457.method254((byte) -92);
            int var78 = class491.field7457.method257((byte) 73);
            int var79 = class491.field7457.method257((byte) 38);
            if (var78 == 255) {
                var78 = -1;
            }
            if (var66 >= 0 && var67 >= 0 && var66 < class150.field2422 * 2 && var67 < (class150.field2422 * 2) && var69 >= 0 && var70 >= 0 && (class21.field272 * 2) > var69 && var70 < (class21.field272 * 2) && var73 != 65535) {
                int var80 = var67 * 64;
                int var81 = var74 << 0;
                int var82 = var75 << 0;
                int var83 = var70 * 64;
                int var84 = var66 * 64;
                int var85 = var69 * 64;
                if (var71 != 0) {
                    int var88;
                    class135 var89;
                    if (var71 < 0) {
                        int var86 = -var71 - 1;
                        int var87 = var86 & 0x7FF;
                        var88 = (var86 & 0x794C) >> 11;
                        if (class507.field7667 == var87) {
                            var89 = class286.field4329;
                        } else {
                            var89 = class224.field3450[var87];
                        }
                    } else {
                        int var90 = var71 - 1;
                        var88 = (var90 & 0x7C38) >> 11;
                        int var91 = var90 & 0x7FF;
                        var89 = class195.field3085[var91];
                    }
                    if (var89 != null) {
                        class14 var92 = var89.method892((byte) -110);
                        if (var92.field164 != null && var92.field164[var88] != null) {
                            int var93 = var92.field164[var88][0];
                            int var94 = var92.field164[var88][2];
                            int var95 = var89.field2211.method1302(16383);
                            int var96 = class195.field3075[var95];
                            int var97 = class195.field3077[var95];
                            int var98 = var93 * var97 + var94 * var96 >> 15;
                            int var99 = var94 * var97 - var93 * var96 >> 15;
                            var81 -= var92.field164[var88][1];
                            var84 += var98;
                            var80 += var99;
                        }
                    }
                }
                class336 var101 = new class336(var73, class359.field5317, var84, var80, var81, var76 + class369.field5424, class369.field5424 + var77, var78, var79, var72, var82, var68);
                var101.method2084(class369.field5424 + var76, class7.method38(var85, class359.field5317, var83, (byte) -54) - var82, var83, (byte) 113, var85);
                class311.field4686.method4(1, new class490(var101));
            }
        } else if (class484.field7389 == arg0) {
            int var102 = class491.field7457.method243(124);
            int var103 = class491.field7457.method272(124);
            int var104 = class491.field7457.method256(true);
            int var105 = class328.field4922 + (var104 >> 4 & 0x7);
            int var106 = class321.field4833 + (var104 & 0x7);
            int var107 = class491.field7457.method243(125);
            if (var105 >= 0 && var106 >= 0 && var105 < class150.field2422 && class21.field272 > var106 && class507.field7667 != var107) {
                class26.method136(var105, -50, var106, class359.field5317, new class1(var102, var103));
                class59.method420(var105, (byte) 40, var106, class359.field5317);
            }
        } else {
            if (arg1) {
                method2288(-40, null);
            }
            if (class370.field5437 == arg0) {
                int var108 = class491.field7457.method257((byte) 108);
                boolean var109 = (var108 & 0x80) != 0;
                int var110 = ((var108 & 0x3C) >> 3) + class328.field4922;
                int var111 = (var108 & 0x7) + class321.field4833;
                int var112 = var110 + class491.field7457.method262(-2);
                int var113 = class491.field7457.method262(-2) + var111;
                int var114 = class491.field7457.method249(arg1);
                int var115 = class491.field7457.method254((byte) -52);
                int var116 = class491.field7457.method257((byte) 100) * 4;
                int var117 = class491.field7457.method257((byte) 80) * 4;
                int var118 = class491.field7457.method254((byte) -82);
                int var119 = class491.field7457.method254((byte) -55);
                int var120 = class491.field7457.method257((byte) 48);
                int var121 = class491.field7457.method257((byte) 114);
                if (var120 == 255) {
                    var120 = -1;
                }
                if (var110 >= 0 && var111 >= 0 && var110 < class150.field2422 && class21.field272 > var111 && var112 >= 0 && var113 >= 0 && class150.field2422 > var112 && var113 < class21.field272 && var115 != 65535) {
                    int var122 = var110 * 128 + 64;
                    int var123 = var117 << 0;
                    int var124 = var116 << 0;
                    int var125 = var112 * 128 + 64;
                    int var126 = var111 * 128 + 64;
                    int var127 = var113 * 128 + 64;
                    class336 var128 = new class336(var115, class359.field5317, var122, var126, var124, class369.field5424 + var118, class369.field5424 + var119, var120, var121, var114, var123, var109);
                    var128.method2084(class369.field5424 + var118, -var123 + class7.method38(var125, class359.field5317, var127, (byte) -54), var127, (byte) -95, var125);
                    class311.field4686.method4(1, new class490(var128));
                }
            } else if (class152.field2436 == arg0) {
                int var129 = class491.field7457.method277(!arg1);
                int var130 = class328.field4922 + ((var129 & 0x71) >> 4);
                int var131 = (var129 & 0x7) + class321.field4833;
                int var132 = class491.field7457.method256(true);
                int var133 = var132 >> 2;
                int var134 = var132 & 0x3;
                int var135 = class369.field5422[var133];
                if (class229.method1379((byte) 21, class21.field269) || var130 >= 0 && var131 >= 0 && var130 < class150.field2422 && class21.field272 > var131) {
                    class389.method2312(class359.field5317, (byte) -123, var130, var133, -1, var131, -1, var135, var134, 0);
                }
            } else if (class473.field7233 == arg0) {
                int var136 = class491.field7457.method257((byte) 34);
                int var137 = class328.field4922 * 2 + (var136 >> 4 & 0xF);
                int var138 = (var136 & 0xF) + class321.field4833 * 2;
                boolean var139 = class491.field7457.method257((byte) 95) != 0;
                int var140 = var137 + class491.field7457.method262(-2);
                int var141 = var138 + class491.field7457.method262(-2);
                int var142 = class491.field7457.method249(false);
                int var143 = class491.field7457.method254((byte) -93);
                int var144 = class491.field7457.method257((byte) 100) * 4;
                int var145 = class491.field7457.method257((byte) 44) * 4;
                int var146 = class491.field7457.method254((byte) -83);
                int var147 = class491.field7457.method254((byte) -63);
                int var148 = class491.field7457.method257((byte) 96);
                int var149 = class491.field7457.method257((byte) 59);
                if (var148 == 255) {
                    var148 = -1;
                }
                if (var137 >= 0 && var138 >= 0 && class150.field2422 * 2 > var137 && var138 < (class150.field2422 * 2) && var140 >= 0 && var141 >= 0 && var140 < class21.field272 * 2 && class21.field272 * 2 > var141 && var143 != 65535) {
                    int var150 = var140 * 64;
                    int var151 = var144 << 0;
                    int var152 = var138 * 64;
                    int var153 = var137 * 64;
                    int var154 = var141 * 64;
                    int var155 = var145 << 0;
                    class336 var156 = new class336(var143, class359.field5317, var153, var152, var151, class369.field5424 + var146, class369.field5424 + var147, var148, var149, var142, var155, var139);
                    var156.method2084(class369.field5424 + var146, class7.method38(var150, class359.field5317, var154, (byte) -54) + -var155, var154, (byte) 78, var150);
                    class311.field4686.method4(1, new class490(var156));
                }
            } else if (class15.field219 == arg0) {
                int var157 = class491.field7457.method254((byte) -63);
                if (var157 == 65535) {
                    var157 = -1;
                }
                int var158 = class491.field7457.method277(true);
                int var159 = var158 >> 2;
                int var160 = var158 & 0x3;
                int var161 = class369.field5422[var159];
                int var162 = class491.field7457.method257((byte) 43);
                int var163 = ((var162 & 0x70) >> 4) + class328.field4922;
                int var164 = (var162 & 0x7) + class321.field4833;
                class323.method2013(var159, class359.field5317, 1, var160, var161, var163, var157, var164);
            } else if (class33.field453 == arg0) {
                int var165 = class491.field7457.method232((byte) 114);
                int var166 = var165 >> 2;
                int var167 = var165 & 0x3;
                int var168 = class369.field5422[var166];
                int var169 = class491.field7457.method256(!arg1);
                int var170 = (var169 >> 4 & 0x7) + class328.field4922;
                int var171 = (var169 & 0x7) + class321.field4833;
                int var172 = class491.field7457.method272(1);
                if (class229.method1379((byte) 21, class21.field269) || var170 >= 0 && var171 >= 0 && class150.field2422 > var170 && var171 < class21.field272) {
                    class389.method2312(class359.field5317, (byte) 99, var170, var166, -1, var171, var172, var168, var167, 0);
                }
            } else {
                class32.method177(null, (byte) -101, "T3 - " + arg0);
                class345.method2114(0);
            }
        }
    }

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "(I)V")
    public static void method2287(int arg0) {
        field5552 = null;
        int var1 = -124 / ((arg0 + 29) / 34);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILlt;)V")
    public static final void method2288(int arg0, class458 arg1) {
        field5553++;
        class12.field145 = arg1.method2720("p11_full", 1);
        class85.field1432 = arg1.method2720("p12_full", 1);
        class53.field804 = arg1.method2720("b12_full", 1);
        class382.field5563 = arg1.method2720("hitmarks", 1);
        class183.field2915 = arg1.method2720("hitbar_default", 1);
        class376.field5489 = arg1.method2720("timerbar_default", 1);
        class220.field3392 = arg1.method2720("headicons_pk", 1);
        class50.field761 = arg1.method2720("headicons_prayer", 1);
        class237.field3589 = arg1.method2720("hint_headicons", 1);
        class35.field491 = arg1.method2720("hint_mapmarkers", 1);
        class78.field1389 = arg1.method2720("mapflag", 1);
        class341.field5093 = arg1.method2720("cross", 1);
        class420.field6039 = arg1.method2720("mapdots", 1);
        class63.field1048 = arg1.method2720("scrollbar", 1);
        if (arg0 >= -63) {
            return;
        }
        class161.field2526 = arg1.method2720("name_icons", 1);
        class75.field1349 = arg1.method2720("floorshadows", 1);
        class446.field6868 = arg1.method2720("compass", 1);
        class40.field570 = arg1.method2720("otherlevel", 1);
        class284.field4303 = arg1.method2720("hint_mapedge", 1);
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(I)V")
    public class381(int arg0) {
        Random var2 = new Random((long) arg0);
        for (int var3 = 0; var3 < 256; var3++) {
            this.field5551[var3] = this.field5551[var3 + 256] = var3;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = var2.nextInt() & 0xFF;
            int var6 = this.field5551[var5];
            this.field5551[var5] = this.field5551[var5 + 256] = this.field5551[var4];
            this.field5551[var4] = this.field5551[var4 + 256] = var6;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILtq;Lqq;IB)V")
    public static final void method2289(int arg0, class427 arg1, class318 arg2, int arg3, byte arg4) {
        field5557++;
        class28 var5 = arg1.method2512(arg2, (byte) -12);
        if (var5 == null) {
            return;
        }
        arg2.method1982(arg0, arg3, arg1.field6175 + arg0, arg1.field6126 + arg3);
        if (class57.field975 == 2 || class57.field975 == 5 || class23.field293 == null) {
            arg2.method1994(-16777216, var5, arg0, arg3);
        } else {
            int var6;
            int var7;
            int var8;
            int var9;
            if (class408.field5928 == 4) {
                var6 = class158.field2488;
                var7 = 4096;
                var8 = class493.field7515;
                var9 = (int) (-class23.field289) & 0x3FFF;
            } else {
                var6 = class286.field4329.field3218;
                var9 = (int) (-class23.field289) + class273.field4145 & 0x3FFF;
                var8 = class286.field4329.field3222;
                var7 = 4096 - (class222.field3427 * 16);
            }
            int var10 = var6 / 32 + 48 - (class150.field2422 * 2 - 208);
            int var11 = class21.field272 * 4 + (48 - var8 / 32) - ((class21.field272 + -104) * 2);
            class23.field293.method987((float) arg1.field6175 / 2.0F + (float) arg0, (float) arg1.field6126 / 2.0F + (float) arg3, (float) var10, (float) var11, var7, var9 << 2, var5, arg0, arg3);
            for (class361 var12 = (class361) class64.field1062.method8((byte) -98); var12 != null; var12 = (class361) class64.field1062.method17((byte) 65)) {
                int var54 = var12.field5334;
                int var55 = (class383.field5575.field3503[var54] >> 14 & 0x3FFF) - field5550;
                int var56 = (class383.field5575.field3503[var54] & 0x3FFF) - class320.field4827;
                int var57 = var55 * 4 + 2 - (var6 / 32);
                int var58 = var56 * 4 + 2 - (var8 / 32);
                class449.method2683(true, var57, var5, var58, arg0, class383.field5575.field3506[var54], arg3, arg2, arg1);
            }
            for (int var13 = 0; var13 < class24.field315; var13++) {
                int var51 = class128.field2068[var13] * 4 + 2 - var6 / 32;
                int var52 = class64.field1060[var13] * 4 + 2 - (var8 / 32);
                class56 var53 = class128.field2070.method916((byte) -15, class193.field3049[var13]);
                if (var53.field892 != null) {
                    var53 = var53.method393(class273.field4144, (byte) -125);
                    if (var53 == null || var53.field965 == -1) {
                        continue;
                    }
                }
                class449.method2683(true, var51, var5, var52, arg0, var53.field965, arg3, arg2, arg1);
            }
            for (class163 var14 = (class163) class252.field3845.method2415((byte) -84); var14 != null; var14 = (class163) class252.field3845.method2416((byte) -127)) {
                int var48 = (int) (var14.field2798 >> 28 & 0x3L);
                if (class241.field3636 == var48) {
                    int var49 = (int) (var14.field2798 & 0x3FFFL) * 4 + 2 - var6 / 32;
                    int var50 = (int) (var14.field2798 >> 14 & 0x3FFFL) * 4 + 2 - (var8 / 32);
                    class153.method983(var5, class54.field820[0], false, var50, var49, arg0, arg1, arg3);
                }
            }
            for (int var15 = 0; var15 < class352.field5175; var15++) {
                class249 var44 = class195.field3085[class437.field6440[var15]];
                if (var44 != null && var44.method1505((byte) 97) && class286.field4329.field3217 == var44.field3217) {
                    class245 var45 = var44.field3819;
                    if (var45 != null && var45.field3703 != null) {
                        var45 = var45.method1477(class273.field4144, -12819);
                    }
                    if (var45 != null && var45.field3702 && var45.field3694) {
                        int var46 = var44.field3218 / 32 - (var6 / 32);
                        int var47 = var44.field3222 / 32 - (var8 / 32);
                        if (var45.field3700 == -1) {
                            class153.method983(var5, class54.field820[1], false, var47, var46, arg0, arg1, arg3);
                        } else {
                            class449.method2683(true, var46, var5, var47, arg0, var45.field3700, arg3, arg2, arg1);
                        }
                    }
                }
            }
            int var16 = class328.field4921;
            int[] var17 = class280.field4247;
            for (int var18 = 0; var18 < var16; var18++) {
                class47 var36 = class224.field3450[var17[var18]];
                if (var36 != null && var36.method339((byte) 97) && class286.field4329 != var36 && class286.field4329.field3217 == var36.field3217) {
                    int var37 = var36.field3218 / 32 - (var6 / 32);
                    int var38 = var36.field3222 / 32 - (var8 / 32);
                    boolean var39 = false;
                    for (int var40 = 0; var40 < class7.field79; var40++) {
                        if (var36.field685.equals(class51.field767[var40]) && class366.field5375[var40] != 0) {
                            var39 = true;
                            break;
                        }
                    }
                    boolean var41 = false;
                    for (int var42 = 0; var42 < class233.field3530; var42++) {
                        if (var36.field685.equals(class17.field236[var42].field2064)) {
                            var41 = true;
                            break;
                        }
                    }
                    boolean var43 = false;
                    if (class286.field4329.field699 != 0 && var36.field699 != 0 && class286.field4329.field699 == var36.field699) {
                        var43 = true;
                    }
                    if (var36.field688) {
                        class153.method983(var5, class54.field820[6], false, var38, var37, arg0, arg1, arg3);
                    } else if (var39) {
                        class153.method983(var5, class54.field820[3], false, var38, var37, arg0, arg1, arg3);
                    } else if (var41) {
                        class153.method983(var5, class54.field820[5], false, var38, var37, arg0, arg1, arg3);
                    } else if (var43) {
                        class153.method983(var5, class54.field820[4], false, var38, var37, arg0, arg1, arg3);
                    } else {
                        class153.method983(var5, class54.field820[2], false, var38, var37, arg0, arg1, arg3);
                    }
                }
            }
            class97[] var19 = class228.field3487;
            for (int var20 = 0; var20 < var19.length; var20++) {
                class97 var23 = var19[var20];
                if (var23 != null && var23.field1745 != 0 && class369.field5424 % 20 < 10) {
                    if (var23.field1745 == 1 && var23.field1747 >= 0 && class195.field3085.length > var23.field1747) {
                        class249 var24 = class195.field3085[var23.field1747];
                        if (var24 != null) {
                            int var25 = var24.field3218 / 32 - var6 / 32;
                            int var26 = var24.field3222 / 32 - (var8 / 32);
                            class176.method1107(var5, var25, var23.field1755, -109, 360000L, var26, arg3, arg0, arg1);
                        }
                    }
                    if (var23.field1745 == 2) {
                        int var27 = var23.field1753 / 32 - var6 / 32;
                        int var28 = var23.field1749 / 32 - (var8 / 32);
                        long var29 = (long) (var23.field1752 << 5);
                        long var31 = var29 * var29;
                        class176.method1107(var5, var27, var23.field1755, -127, var31, var28, arg3, arg0, arg1);
                    }
                    if (var23.field1745 == 10 && var23.field1747 >= 0 && var23.field1747 < class224.field3450.length) {
                        class47 var33 = class224.field3450[var23.field1747];
                        if (var33 != null) {
                            int var34 = var33.field3218 / 32 - (var6 / 32);
                            int var35 = var33.field3222 / 32 - (var8 / 32);
                            class176.method1107(var5, var34, var23.field1755, -117, 360000L, var35, arg3, arg0, arg1);
                        }
                    }
                }
            }
            if (class408.field5928 != 4) {
                if (class402.field5846 != 0) {
                    int var21 = class402.field5846 * 4 + class286.field4329.method337(0) * 2 + 2 - (var6 / 32) - 2;
                    int var22 = class312.field4695 * 4 + class286.field4329.method337(0) * 2 + 2 - (var8 / 32) - 2;
                    class153.method983(var5, class144.field2343[class395.field5764 ? 1 : 0], false, var22, var21, arg0, arg1, arg3);
                }
                arg2.method1943(arg1.field6175 / 2 + arg0 - 1, -1, arg1.field6126 / 2 + arg3 - 1, 3, 1, 3);
            }
        }
        if (arg4 <= 124) {
            method2287(-9);
        }
    }
}
