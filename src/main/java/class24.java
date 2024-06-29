import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class24 extends class383 {

    @OriginalMember(owner = "client!o", name = "j", descriptor = "J")
    public long field344;

    @OriginalMember(owner = "client!o", name = "k", descriptor = "Ljava/lang/String;")
    public static String field345 = "";

    @OriginalMember(owner = "client!o", name = "n", descriptor = "Ldq;")
    public static class493 field348 = new class493(1, 6);

    @OriginalMember(owner = "client!o", name = "p", descriptor = "I")
    public static int field350 = 0;

    @OriginalMember(owner = "client!o", name = "o", descriptor = "S")
    public static short field349 = 256;

    @OriginalMember(owner = "client!o", name = "q", descriptor = "Lup;")
    public static class181 field351 = new class181(5, 6);

    @OriginalMember(owner = "client!o", name = "r", descriptor = "I")
    public static int field352 = -1;

    @OriginalMember(owner = "client!o", name = "t", descriptor = "Z")
    public static boolean field354 = false;

    @OriginalMember(owner = "client!o", name = "l", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!o", name = "m", descriptor = "Ljava/awt/Frame;")
    public static Frame field347;

    @OriginalMember(owner = "client!o", name = "s", descriptor = "[S")
    public static short[] field353;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ZLup;)V")
    public static final void method198(boolean arg0, class181 arg1) {
        field346++;
        if (class72.field929 == arg1) {
            int var2 = class513.field7443.method2775(-4672);
            int var3 = class513.field7443.method2772((byte) 127);
            int var4 = class513.field7443.method2776((byte) -27);
            int var5 = class283.field3601 + (var4 >> 4 & 0x7);
            int var6 = (var4 & 0x7) + class447.field6401;
            int var7 = class513.field7443.method2758((byte) 107);
            if (var5 >= 0 && var6 >= 0 && var5 < class452.field6526 && class440.field6307 > var6 && class66.field858 != var2) {
                class512.method3060(class10.field163, var6, (byte) -109, new class400(var7, var3), var5);
                class33.method244((byte) 58, var5, class10.field163, var6);
            }
        } else if (class522.field7560 == arg1) {
            int var8 = class513.field7443.method2758((byte) 85);
            int var9 = class513.field7443.method2737(false);
            class315.field4017.method1958(-10091, var8).method760(var9, (byte) -86);
        } else if (field351 == arg1) {
            int var10 = class513.field7443.method2737(false);
            int var11 = ((var10 & 0x73) >> 4) + class283.field3601;
            int var12 = (var10 & 0x7) + class447.field6401;
            int var13 = class513.field7443.method2758((byte) 122);
            if (var13 == 65535) {
                var13 = -1;
            }
            int var14 = class513.field7443.method2737(false);
            int var15 = (var14 & 0xFB) >> 4;
            int var16 = var14 & 0x7;
            int var17 = class513.field7443.method2737(arg0);
            int var18 = class513.field7443.method2737(arg0);
            if (var11 >= 0 && var12 >= 0 && var11 < class452.field6526 && var12 < class440.field6307) {
                int var19 = var15 + 1;
                if (class23.field336.field4944[0] >= var11 - var19 && (var11 + var19) >= class23.field336.field4944[0] && class23.field336.field4936[0] >= var12 - var19 && class23.field336.field4936[0] <= (var12 + var19)) {
                    class47.method470(var18, var13, -111, var16, var17, (var11 << 16) + (class10.field163 << 24) + (var12 << 8) + var15);
                }
            }
        } else if (class468.field6770 == arg1) {
            int var20 = class513.field7443.method2743(false);
            int var21 = class283.field3601 + ((var20 & 0x7D) >> 4);
            int var22 = (var20 & 0x7) + class447.field6401;
            int var23 = class513.field7443.method2772((byte) 124);
            if (var21 >= 0 && var22 >= 0 && var21 < class452.field6526 && class440.field6307 > var22) {
                class91 var24 = (class91) class201.field2614.method2022(-1, (long) (class10.field163 << 28 | var22 << 14 | var21));
                if (var24 != null) {
                    for (class400 var25 = (class400) var24.field1112.method153(0); var25 != null; var25 = (class400) var24.field1112.method161(-51)) {
                        if ((var23 & 0x7FFF) == var25.field5703) {
                            var25.method2165(16225);
                            break;
                        }
                    }
                    if (var24.field1112.method162((byte) 75)) {
                        var24.method2165(16225);
                    }
                    class33.method244((byte) 58, var21, class10.field163, var22);
                }
            }
        } else if (class5.field49 == arg1) {
            int var26 = class513.field7443.method2737(false);
            boolean var27 = (var26 & 0x80) != 0;
            int var28 = class283.field3601 + (var26 >> 3 & 0x7);
            int var29 = class447.field6401 + (var26 & 0x7);
            int var30 = var28 + class513.field7443.method2793(32767);
            int var31 = var29 + class513.field7443.method2793(32767);
            int var32 = class513.field7443.method2791(true);
            int var33 = class513.field7443.method2758((byte) 98);
            int var34 = class513.field7443.method2737(false) * 4;
            int var35 = class513.field7443.method2737(false) * 4;
            int var36 = class513.field7443.method2758((byte) 109);
            int var37 = class513.field7443.method2758((byte) 119);
            int var38 = class513.field7443.method2737(arg0);
            if (var38 == 255) {
                var38 = -1;
            }
            int var39 = class513.field7443.method2737(false);
            if (var28 >= 0 && var29 >= 0 && var28 < class452.field6526 && var29 < class440.field6307 && var30 >= 0 && var31 >= 0 && class452.field6526 > var30 && var31 < class440.field6307 && var33 != 65535) {
                int var40 = var34 << 0;
                int var41 = var28 * 128 + 64;
                int var42 = var30 * 128 + 64;
                int var43 = var29 * 128 + 64;
                int var44 = var35 << 0;
                int var45 = var31 * 128 + 64;
                class176 var46 = new class176(var33, class10.field163, var41, var43, var40, class163.field2065 + var36, class163.field2065 + var37, var38, var39, var32, var44, var27);
                var46.method1125(var42, class151.method991(var45, false, class10.field163, var42) - var44, -117, var36 + class163.field2065, var45);
                class529.field7799.method163(new class301(var46), 0);
            }
        } else if (class163.field2073 == arg1) {
            int var47 = class513.field7443.method2737(false);
            int var48 = (var47 >> 4 & 0xF) + class283.field3601 * 2;
            int var49 = (var47 & 0xF) + class447.field6401 * 2;
            boolean var50 = class513.field7443.method2737(false) != 0;
            int var51 = class513.field7443.method2793(32767) + var48;
            int var52 = var49 + class513.field7443.method2793(32767);
            int var53 = class513.field7443.method2791(true);
            int var54 = class513.field7443.method2758((byte) 117);
            int var55 = class513.field7443.method2737(false) * 4;
            int var56 = class513.field7443.method2737(false) * 4;
            int var57 = class513.field7443.method2758((byte) 87);
            int var58 = class513.field7443.method2758((byte) 120);
            int var59 = class513.field7443.method2737(false);
            int var60 = class513.field7443.method2737(false);
            if (var59 == 255) {
                var59 = -1;
            }
            if (var48 >= 0 && var49 >= 0 && class452.field6526 * 2 > var48 && (class452.field6526 * 2) > var49 && var51 >= 0 && var52 >= 0 && var51 < class440.field6307 * 2 && var52 < (class440.field6307 * 2) && var54 != 65535) {
                int var61 = var51 * 64;
                int var62 = var52 * 64;
                int var63 = var49 * 64;
                int var64 = var55 << 0;
                int var65 = var56 << 0;
                int var66 = var48 * 64;
                class176 var67 = new class176(var54, class10.field163, var66, var63, var64, class163.field2065 + var57, class163.field2065 + var58, var59, var60, var53, var65, var50);
                var67.method1125(var61, class151.method991(var62, false, class10.field163, var61) - var65, -120, class163.field2065 + var57, var62);
                class529.field7799.method163(new class301(var67), 0);
            }
        } else if (class12.field207 == arg1) {
            int var68 = class513.field7443.method2737(false);
            int var69 = class283.field3601 + (var68 >> 4 & 0x7);
            int var70 = (var68 & 0x7) + class447.field6401;
            int var71 = class513.field7443.method2758((byte) 106);
            int var72 = class513.field7443.method2737(false);
            int var73 = class513.field7443.method2758((byte) 77);
            int var74 = class513.field7443.method2737(false);
            if (var69 >= 0 && var70 >= 0 && var69 < class452.field6526 && var70 < class440.field6307) {
                int var75 = var69 * 128 + 64;
                int var76 = var70 * 128 + 64;
                int var77 = class10.field163;
                if (var77 < 3 && class256.method1538(2, var69, var70)) {
                    var77++;
                }
                class97 var78 = new class97(var71, var73, class163.field2065, class10.field163, var77, var75, class151.method991(var76, arg0, class10.field163, var75) - var72, var76, var69, var69, var70, var70, var74);
                class418.field5939.method163(new class79(var78), 0);
            }
        } else if (class226.field2877 == arg1) {
            class513.field7443.method2737(false);
            int var79 = class513.field7443.method2737(false);
            int var80 = ((var79 & 0x73) >> 4) + class283.field3601;
            int var81 = (var79 & 0x7) + class447.field6401;
            int var82 = class513.field7443.method2758((byte) 94);
            int var83 = class513.field7443.method2737(arg0);
            int var84 = class513.field7443.method2738(-78);
            String var85 = class513.field7443.method2768((byte) -37);
            class195.method1207(var83, var80, class10.field163, var82, var85, -1, var84, var81);
        } else if (class59.field770 == arg1) {
            int var86 = class513.field7443.method2786(255);
            int var87 = class513.field7443.method2775(-4672);
            int var88 = class513.field7443.method2737(false);
            int var89 = class283.field3601 + ((var88 & 0x75) >> 4);
            int var90 = (var88 & 0x7) + class447.field6401;
            if (var89 >= 0 && var90 >= 0 && class452.field6526 > var89 && var90 < class440.field6307) {
                class512.method3060(class10.field163, var90, (byte) -72, new class400(var87, var86), var89);
                class33.method244((byte) 58, var89, class10.field163, var90);
            }
        } else if (class390.field5242 == arg1) {
            int var91 = class513.field7443.method2776((byte) -27);
            int var92 = var91 >> 2;
            int var93 = var91 & 0x3;
            int var94 = class461.field6590[var92];
            int var95 = class513.field7443.method2786(255);
            if (var95 == 65535) {
                var95 = -1;
            }
            int var96 = class513.field7443.method2742((byte) -125);
            int var97 = ((var96 & 0x7C) >> 4) + class283.field3601;
            int var98 = (var96 & 0x7) + class447.field6401;
            class76.method665(var97, var93, class10.field163, (byte) -45, var95, var94, var98, var92);
        } else if (class474.field6867 == arg1) {
            int var99 = class513.field7443.method2776((byte) -27);
            int var100 = ((var99 & 0x77) >> 4) + class283.field3601;
            int var101 = (var99 & 0x7) + class447.field6401;
            int var102 = class513.field7443.method2776((byte) -27);
            int var103 = var102 >> 2;
            int var104 = var102 & 0x3;
            int var105 = class461.field6590[var103];
            int var106 = class513.field7443.method2775(-4672);
            if (class329.method1918(-1, class387.field5108) || var100 >= 0 && var101 >= 0 && var100 < class452.field6526 && var101 < class440.field6307) {
                class156.method1017(-1, var105, class10.field163, var103, 0, var106, var100, var104, var101, 79);
            }
        } else if (class410.field5856 == arg1) {
            int var107 = class513.field7443.method2737(false);
            int var108 = (var107 >> 4 & 0x7) + class283.field3601;
            int var109 = class447.field6401 + (var107 & 0x7);
            int var110 = class513.field7443.method2758((byte) 93);
            int var111 = class513.field7443.method2758((byte) 102);
            int var112 = class513.field7443.method2758((byte) 75);
            if (class201.field2614 != null && var108 >= 0 && var109 >= 0 && var108 < class452.field6526 && class440.field6307 > var109) {
                class91 var113 = (class91) class201.field2614.method2022(-1, (long) (var108 | var109 << 14 | class10.field163 << 28));
                if (var113 != null) {
                    for (class400 var114 = (class400) var113.field1112.method153(0); var114 != null; var114 = (class400) var113.field1112.method161(-92)) {
                        if ((var110 & 0x7FFF) == var114.field5703 && var114.field5707 == var111) {
                            var114.method2165(16225);
                            var114.field5707 = var112;
                            class512.method3060(class10.field163, var109, (byte) -63, var114, var108);
                            break;
                        }
                    }
                    class33.method244((byte) 58, var108, class10.field163, var109);
                }
            }
        } else if (class222.field2800 == arg1) {
            int var115 = class513.field7443.method2776((byte) -27);
            int var116 = var115 >> 2;
            int var117 = var115 & 0x3;
            int var118 = class461.field6590[var116];
            int var119 = class513.field7443.method2776((byte) -27);
            int var120 = class283.field3601 + ((var119 & 0x7C) >> 4);
            int var121 = (var119 & 0x7) + class447.field6401;
            if (class329.method1918(-1, class387.field5108) || var120 >= 0 && var121 >= 0 && var120 < class452.field6526 && var121 < class440.field6307) {
                class156.method1017(-1, var118, class10.field163, var116, 0, -1, var120, var117, var121, 43);
            }
        } else if (class300.field3866 == arg1) {
            byte var122 = class513.field7443.method2752(2);
            int var123 = class513.field7443.method2743(false);
            int var124 = class283.field3601 + (var123 >> 4 & 0x7);
            int var125 = (var123 & 0x7) + class447.field6401;
            int var126 = class513.field7443.method2767(1);
            int var127 = class513.field7443.method2772((byte) 122);
            int var128 = class513.field7443.method2786(255);
            int var129 = class513.field7443.method2786(255);
            byte var130 = class513.field7443.method2756(114);
            byte var131 = class513.field7443.method2756(112);
            int var132 = class513.field7443.method2743(arg0);
            int var133 = var132 >> 2;
            int var134 = var132 & 0x3;
            byte var135 = class513.field7443.method2752(2);
            if (!class33.field416.method322()) {
                class285.method1680(var124, class10.field163, var128, var131, var125, var122, var130, var129, (byte) 114, var134, var127, var135, var126, var133);
            }
        } else if (class412.field5880 == arg1) {
            int var136 = class513.field7443.method2737(arg0);
            int var137 = ((var136 & 0xF4) >> 4) + class283.field3601 * 2;
            int var138 = (var136 & 0xF) + class447.field6401 * 2;
            boolean var139 = class513.field7443.method2737(false) != 0;
            int var140 = class513.field7443.method2793(32767) + var137;
            int var141 = var138 + class513.field7443.method2793(32767);
            int var142 = class513.field7443.method2791(true);
            int var143 = class513.field7443.method2791(true);
            int var144 = class513.field7443.method2758((byte) 90);
            byte var145 = class513.field7443.method2793(32767);
            int var146 = class513.field7443.method2737(false) * 4;
            int var147 = class513.field7443.method2758((byte) 104);
            int var148 = class513.field7443.method2758((byte) 85);
            int var149 = class513.field7443.method2737(false);
            int var150 = class513.field7443.method2737(false);
            if (var149 == 255) {
                var149 = -1;
            }
            if (var137 >= 0 && var138 >= 0 && (class452.field6526 * 2) > var137 && (class452.field6526 * 2) > var138 && var140 >= 0 && var141 >= 0 && var140 < (class440.field6307 * 2) && class440.field6307 * 2 > var141 && var144 != 65535) {
                int var151 = var141 * 64;
                int var152 = var137 * 64;
                int var153 = var138 * 64;
                int var154 = var146 << 0;
                int var155 = var140 * 64;
                int var156 = var145 << 0;
                if (var142 != 0) {
                    int var159;
                    class375 var160;
                    if (var142 >= 0) {
                        int var157 = var142 - 1;
                        int var158 = var157 & 0x7FF;
                        var159 = (var157 & 0x7C6A) >> 11;
                        var160 = class187.field2446[var158];
                    } else {
                        int var161 = -var142 - 1;
                        var159 = (var161 & 0x7E58) >> 11;
                        int var162 = var161 & 0x7FF;
                        if (class66.field858 == var162) {
                            var160 = class23.field336;
                        } else {
                            var160 = class387.field5107[var162];
                        }
                    }
                    if (var160 != null) {
                        class511 var163 = var160.method2128(-110);
                        if (var163.field7392 != null && var163.field7392[var159] != null) {
                            int var164 = var163.field7392[var159][0];
                            int var165 = var163.field7392[var159][2];
                            int var166 = var160.field4896.method33((byte) -48);
                            int var167 = class36.field443[var166];
                            int var168 = class36.field478[var166];
                            int var169 = var164 * var168 + var165 * var167 >> 15;
                            int var170 = var165 * var168 - (var164 * var167) >> 15;
                            var156 -= var163.field7392[var159][1];
                            var153 += var170;
                            var152 += var169;
                        }
                    }
                }
                class176 var172 = new class176(var144, class10.field163, var152, var153, var156, class163.field2065 + var147, class163.field2065 + var148, var149, var150, var143, var154, var139);
                var172.method1125(var155, class151.method991(var151, false, class10.field163, var155) - var154, 110, class163.field2065 + var147, var151);
                class529.field7799.method163(new class301(var172), 0);
            }
        } else {
            class461.method2719(null, "T3 - " + arg1, 1);
            class461.method2721((byte) -76, arg0);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIILkn;)V")
    public static final void method199(int arg0, int arg1, int arg2, class522 arg3) {
        class490 var4 = class119.method862(arg0, arg1, arg2);
        if (var4 != null) {
            var4.field7131 = arg3;
        }
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V")
    public class24() {
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
    public static void method200(int arg0) {
        field345 = null;
        field351 = null;
        field348 = null;
        field347 = null;
        field353 = null;
        if (arg0 != 64) {
            field354 = false;
        }
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "(J)V")
    public class24(long arg0) {
        this.field344 = arg0;
    }
}
