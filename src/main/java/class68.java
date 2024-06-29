import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class68 extends class95 {

    @OriginalMember(owner = "client!ri", name = "O", descriptor = "I")
    private int field1054 = -1;

    @OriginalMember(owner = "client!ri", name = "M", descriptor = "I")
    private int field1052 = 0;

    @OriginalMember(owner = "client!ri", name = "L", descriptor = "I")
    private int field1051;

    @OriginalMember(owner = "client!ri", name = "H", descriptor = "[I")
    public static int[] field1047 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!ri", name = "Q", descriptor = "Z")
    public static boolean field1056 = false;

    @OriginalMember(owner = "client!ri", name = "I", descriptor = "I")
    public static int field1048;

    @OriginalMember(owner = "client!ri", name = "J", descriptor = "I")
    public static int field1049;

    @OriginalMember(owner = "client!ri", name = "K", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!ri", name = "N", descriptor = "I")
    public static int field1053;

    @OriginalMember(owner = "client!ri", name = "P", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!ri", name = "R", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "client!ri", name = "S", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!ri", name = "T", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!ri", name = "U", descriptor = "I")
    public static int field1060;

    @OriginalMember(owner = "client!ri", name = "V", descriptor = "Ljava/lang/String;")
    public static String field1061;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "(I)V", line = 6)
    public static final void method453(int arg0) {
        field1050++;
        if (class191.field3457 == 209) {
            int var1 = class293.field5127.method1731(true);
            int var2 = var1 >> 2;
            int var3 = class121.field2070[var2];
            int var4 = class293.field5127.method1733(128);
            int var5 = var1 & 0x3;
            int var6 = (var4 >> 4 & 0x7) + class72.field1102;
            int var7 = class160.field2879 + (var4 & 0x7);
            int var8 = class293.field5127.method1726(arg0 ^ 0xFFFFC3CB);
            if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
                class260.method1846(var6, (byte) 49, 0, -1, var2, var5, var8, class295.field5159, var7, var3);
            }
        } else if (class191.field3457 == 114) {
            int var9 = class293.field5127.method1733(128);
            int var10 = (var9 >> 4 & 0x7) + class72.field1102;
            int var11 = (var9 & 0x7) + class160.field2879;
            int var12 = class293.field5127.method1725(-121);
            int var13 = class293.field5127.method1712(-1);
            int var14 = class293.field5127.method1712(-1);
            if (var10 >= 0 && var11 >= 0 && var10 < 104 && var11 < 104 && class185.field3409 != var13) {
                class149 var15 = new class149();
                var15.field2724 = var14;
                var15.field2712 = var12;
                if (class182.field3333[class295.field5159][var10][var11] == null) {
                    class182.field3333[class295.field5159][var10][var11] = new class1();
                }
                class182.field3333[class295.field5159][var10][var11].method5(new class248(var15), (byte) -116);
                class132.method908(arg0 - 32766, var11, var10);
            }
        } else if (class191.field3457 == 124) {
            int var129 = class293.field5127.method1712(arg0 ^ 0xFFFF8000);
            int var130 = class293.field5127.method1755(true);
            int var131 = ((var130 & 0x7D) >> 4) + class72.field1102;
            int var132 = (var130 & 0x7) + class160.field2879;
            if (var129 == 65535) {
                var129 = -1;
            }
            int var133 = class293.field5127.method1762(-128);
            int var134 = var133 >> 2;
            int var135 = class121.field2070[var134];
            int var136 = var133 & 0x3;
            class281.method2023(var131, class295.field5159, var134, var136, var135, (byte) -110, var132, var129);
        } else if (class191.field3457 == 68) {
            int var16 = class293.field5127.method1731(true);
            int var17 = (var16 >> 4 & 0x7) + class72.field1102;
            int var18 = class160.field2879 + (var16 & 0x7);
            int var19 = class293.field5127.method1712(-1);
            if (var17 >= 0 && var18 >= 0 && var17 < 104 && var18 < 104) {
                class1 var20 = class182.field3333[class295.field5159][var17][var18];
                if (var20 != null) {
                    for (class248 var21 = (class248) var20.method13(0); var21 != null; var21 = (class248) var20.method15((byte) 47)) {
                        if ((var19 & 0x7FFF) == var21.field4302.field2724) {
                            var21.method1325(arg0 - 32767);
                            break;
                        }
                    }
                    if (var20.method13(0) == null) {
                        class182.field3333[class295.field5159][var17][var18] = null;
                    }
                    class132.method908(arg0 ^ 0x7FFE, var18, var17);
                }
            }
        } else if (class191.field3457 == 230) {
            int var22 = class293.field5127.method1731(true);
            int var23 = class72.field1102 + ((var22 & 0x74) >> 4);
            int var24 = (var22 & 0x7) + class160.field2879;
            int var25 = class293.field5127.method1721((byte) 74) + var23;
            int var26 = var24 + class293.field5127.method1721((byte) 40);
            int var27 = class293.field5127.method1728(true);
            int var28 = class293.field5127.method1712(-1);
            int var29 = class293.field5127.method1731(true) * 4;
            int var30 = class293.field5127.method1731(true) * 4;
            int var31 = class293.field5127.method1712(-1);
            int var32 = class293.field5127.method1712(-1);
            int var33 = class293.field5127.method1731(true);
            int var34 = class293.field5127.method1731(true);
            if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104 && var28 != 65535) {
                int var35 = var23 * 128 + 64;
                int var36 = var26 * 128 + 64;
                int var37 = var24 * 128 + 64;
                class21 var38 = new class21(var28, class295.field5159, var35, var37, class45.method321(arg0 - 32863, var37, var35, class295.field5159) - var29, var31 - -class116.field2000, var32 + class116.field2000, var33, var34, var27, var30);
                int var39 = var25 * 128 + 64;
                var38.method143(class45.method321(123, var36, var39, class295.field5159) - var30, var36, arg0 - 32888, var39, class116.field2000 + var31);
                class306.field5327.method5(new class87(var38), (byte) 1);
            }
        } else if (class191.field3457 == 233) {
            int var40 = class293.field5127.method1755(true);
            int var41 = ((var40 & 0x7E) >> 4) + class72.field1102;
            int var42 = (var40 & 0x7) + class160.field2879;
            int var43 = class293.field5127.method1762(-128);
            int var44 = var43 >> 2;
            int var45 = var43 & 0x3;
            int var46 = class121.field2070[var44];
            if (var41 >= 0 && var42 >= 0 && var41 < 104 && var42 < 104) {
                class260.method1846(var41, (byte) 120, 0, -1, var44, var45, -1, class295.field5159, var42, var46);
            }
        } else if (arg0 == 32767) {
            if (class191.field3457 == 61) {
                int var47 = class293.field5127.method1731(true);
                int var48 = (var47 & 0x7) + class160.field2879;
                int var49 = ((var47 & 0x7E) >> 4) + class72.field1102;
                int var50 = class293.field5127.method1712(-1);
                int var51 = class293.field5127.method1712(-1);
                int var52 = class293.field5127.method1712(-1);
                if (var49 >= 0 && var48 >= 0 && var49 < 104 && var48 < 104) {
                    class1 var53 = class182.field3333[class295.field5159][var49][var48];
                    if (var53 != null) {
                        for (class248 var54 = (class248) var53.method13(0); var54 != null; var54 = (class248) var53.method15((byte) 47)) {
                            class149 var55 = var54.field4302;
                            if ((var50 & 0x7FFF) == var55.field2724 && var55.field2712 == var51) {
                                var55.field2712 = var52;
                                break;
                            }
                        }
                        class132.method908(arg0 - 32766, var48, var49);
                    }
                }
            } else if (class191.field3457 == 102) {
                int var56 = class293.field5127.method1733(arg0 ^ 0x7F7F);
                int var57 = ((var56 & 0x7C) >> 4) + class72.field1102;
                int var58 = (var56 & 0x7) + class160.field2879;
                int var59 = class293.field5127.method1752((byte) 84);
                int var60 = class293.field5127.method1752((byte) 48);
                if (var57 >= 0 && var58 >= 0 && var57 < 104 && var58 < 104) {
                    class149 var61 = new class149();
                    var61.field2712 = var60;
                    var61.field2724 = var59;
                    if (class182.field3333[class295.field5159][var57][var58] == null) {
                        class182.field3333[class295.field5159][var57][var58] = new class1();
                    }
                    class182.field3333[class295.field5159][var57][var58].method5(new class248(var61), (byte) 14);
                    class132.method908(1, var58, var57);
                }
            } else if (class191.field3457 == 18) {
                int var62 = class293.field5127.method1731(true);
                int var63 = class72.field1102 + (var62 >> 4 & 0x7);
                int var64 = (var62 & 0x7) + class160.field2879;
                int var65 = class293.field5127.method1712(-1);
                int var66 = class293.field5127.method1731(true);
                if (var65 == 65535) {
                    var65 = -1;
                }
                int var67 = var66 >> 4 & 0xF;
                int var68 = class293.field5127.method1731(true);
                int var69 = var66 & 0x7;
                if (var63 >= 0 && var64 >= 0 && var63 < 104 && var64 < 104) {
                    int var70 = var67 + 1;
                    if (var63 - var70 <= class95.field1513.field4498[0] && class95.field1513.field4498[0] <= (var63 + var70) && class95.field1513.field4482[0] >= (var64 - var70) && (var64 + var70) >= class95.field1513.field4482[0] && class42.field561 != 0 && var69 > 0 && class315.field5419 < 50 && var65 != -1) {
                        class21.field322[class315.field5419] = var65;
                        class266.field4681[class315.field5419] = var69;
                        class54.field796[class315.field5419] = var68;
                        class154.field2768[class315.field5419] = null;
                        class62.field1004[class315.field5419] = (var63 << 16) + (var64 << 8) + var67;
                        class315.field5419++;
                    }
                }
            } else if (class191.field3457 == 67) {
                int var120 = class293.field5127.method1731(true);
                int var121 = ((var120 & 0x73) >> 4) + class72.field1102;
                int var122 = class160.field2879 + (var120 & 0x7);
                int var123 = class293.field5127.method1712(-1);
                int var124 = class293.field5127.method1731(true);
                int var125 = class293.field5127.method1712(-1);
                if (var121 >= 0 && var122 >= 0 && var121 < 104 && var122 < 104) {
                    int var126 = var122 * 128 + 64;
                    int var127 = var121 * 128 + 64;
                    class14 var128 = new class14(var123, class295.field5159, var127, var126, class45.method321(-107, var126, var127, class295.field5159) - var124, var125, class116.field2000);
                    class94.field1502.method5(new class261(var128), (byte) -12);
                }
            } else if (class191.field3457 == 189) {
                int var102 = class293.field5127.method1731(true);
                int var103 = (var102 >> 4 & 0xF) + class72.field1102 * 2;
                int var104 = (var102 & 0xF) + class160.field2879 * 2;
                int var105 = var103 + class293.field5127.method1721((byte) 102);
                int var106 = class293.field5127.method1721((byte) 90) + var104;
                int var107 = class293.field5127.method1728(true);
                int var108 = class293.field5127.method1712(arg0 ^ 0xFFFF8000);
                int var109 = class293.field5127.method1731(true) * 4;
                int var110 = class293.field5127.method1731(true) * 4;
                int var111 = class293.field5127.method1712(-1);
                int var112 = class293.field5127.method1712(-1);
                int var113 = class293.field5127.method1731(true);
                int var114 = class293.field5127.method1731(true);
                if (var103 >= 0 && var104 >= 0 && var103 < 208 && var104 < 208 && var105 >= 0 && var106 >= 0 && var105 < 208 && var106 < 208 && var108 != 65535) {
                    int var115 = var103 * 64;
                    int var116 = var105 * 64;
                    int var117 = var104 * 64;
                    class21 var118 = new class21(var108, class295.field5159, var115, var117, class45.method321(arg0 - 32806, var117, var115, class295.field5159) - var109, class116.field2000 + var111, class116.field2000 + var112, var113, var114, var107, var110);
                    int var119 = var106 * 64;
                    var118.method143(class45.method321(108, var119, var116, class295.field5159) - var110, var119, -92, var116, class116.field2000 + var111);
                    class306.field5327.method5(new class87(var118), (byte) -122);
                }
            } else if (class191.field3457 == 43) {
                int var71 = class293.field5127.method1752((byte) 26);
                int var72 = class293.field5127.method1726(arg0 ^ 0xFFFFC3CB);
                int var73 = class293.field5127.method1755(true);
                int var74 = (var73 & 0x7) + class160.field2879;
                int var75 = (var73 >> 4 & 0x7) + class72.field1102;
                byte var76 = class293.field5127.method1767(arg0 ^ 0xD8E1E8AF);
                int var77 = class293.field5127.method1755(true);
                int var78 = var77 >> 2;
                int var79 = var77 & 0x3;
                int var80 = class121.field2070[var78];
                byte var81 = class293.field5127.method1767(-656304304);
                byte var82 = class293.field5127.method1721((byte) 86);
                byte var83 = class293.field5127.method1721((byte) 96);
                int var84 = class293.field5127.method1712(-1);
                int var85 = class293.field5127.method1725(-109);
                class51 var86;
                if (class185.field3409 == var71) {
                    var86 = class95.field1513;
                } else {
                    var86 = class96.field1558[var71];
                }
                if (!class231.field4051 && var86 != null) {
                    class60 var87 = class201.method1424(var84, (byte) 103);
                    int var88;
                    int var89;
                    if (var79 == 1 || var79 == 3) {
                        var88 = var87.field939;
                        var89 = var87.field899;
                    } else {
                        var88 = var87.field899;
                        var89 = var87.field939;
                    }
                    int var90 = (var89 + 1 >> 1) + var75;
                    int var91 = (var89 >> 1) + var75;
                    int var92 = (var88 >> 1) + var74;
                    int var93 = var74 + (var88 + 1 >> 1);
                    int[][] var94 = class278.field4883[class295.field5159];
                    int[][] var95 = (int[][]) null;
                    if (class295.field5159 < 3) {
                        var95 = class278.field4883[class295.field5159 + 1];
                    }
                    int var96 = var94[var90][var92] + var94[var91][var92] + var94[var91][var93] + var94[var90][var93] >> 2;
                    int var97 = (var74 << 7) + (var88 << 6);
                    int var98 = (var75 << 7) + (var89 << 6);
                    class155 var99 = var87.method410(var95, var79, false, (byte) -90, var78, (class257) null, var87.field921, var97, var94, var96, var98);
                    if (var99 != null) {
                        if (var82 < var76) {
                            byte var100 = var76;
                            var76 = var82;
                            var82 = var100;
                        }
                        class260.method1846(var75, (byte) 127, var72 + 1, var85 + 1, 0, 0, -1, class295.field5159, var74, var80);
                        var86.field742 = class116.field2000 + var85;
                        if (var83 > var81) {
                            byte var101 = var83;
                            var83 = var81;
                            var81 = var101;
                        }
                        var86.field758 = var74 + var81;
                        var86.field751 = var75 + var76;
                        var86.field727 = var74 * 128 + (var88 * 64);
                        var86.field750 = var75 + var82;
                        var86.field743 = var75 * 128 + (var89 * 64);
                        var86.field738 = var74 + var83;
                        var86.field729 = var72 + class116.field2000;
                        var86.field746 = (class113) var99.field2788;
                        var86.field733 = var96;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "(I)V", line = 563)
    public final void method454(int arg0) {
        if (arg0 != 11887) {
            field1061 = (String) null;
        }
        field1048++;
        int var2 = class81.method547(true);
        if ((var2 & 0x1) == 0) {
            class231.method1597(this.field1054);
        }
        if ((var2 & 0x2) == 0) {
            class231.method1589(0);
        }
        if ((var2 & 0x4) == 0) {
            class231.method1572(0);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IZLik;I)Lvd;", line = 584)
    public static final class135 method455(int arg0, boolean arg1, class262 arg2, int arg3) {
        field1060++;
        if (class167.method1166(arg2, arg3, (byte) 98, arg0)) {
            if (arg1) {
                method457((class249) null, 94);
            }
            return class55.method386(255);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(BZ)V", line = 601)
    public static final void method456(byte arg0, boolean arg1) {
        class255.field4439 = (int[][][]) null;
        class159.field2859 = null;
        class316.field5444 = null;
        class5.field69 = (byte[][][]) null;
        class183.field3360 = (byte[][][]) null;
        if (arg1 && class132.field2261 != null) {
            class78.field1181 = class132.field2261.field3170;
        } else {
            class78.field1181 = null;
        }
        if (arg0 != -73) {
            return;
        }
        class317.field5455 = 0;
        class132.field2261 = null;
        class143.field2517 = (short[][][]) null;
        field1058++;
        class280.field4905 = (int[][][]) null;
        class304.field5273 = (byte[][][]) null;
        class190.field3449 = (byte[][][]) null;
        class202.field3650 = (byte[][][]) null;
        class249.field4372.method9((byte) -121);
        class99.field1749 = null;
        class121.field2074 = null;
        class25.field382 = -1;
        class236.field4145 = null;
        class9.field114 = null;
        class174.field3186 = null;
        class162.field2902 = null;
        class301.field5243 = -1;
        class306.field5332 = null;
        class64.field1030 = null;
        class122.field2089 = null;
        class156.field2807 = null;
        class42.field559 = null;
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(I)V", line = 735)
    public class68(int arg0) {
        GL var2 = class231.field4052;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        this.field1054 = var3[0];
        this.field1051 = class124.field2099;
        class231.method1597(this.field1054);
        int var4 = class263.field4657[arg0];
        byte[] var5 = new byte[] { (byte) (var4 >> 16), (byte) (var4 >> 8), (byte) var4, -1 };
        ByteBuffer var6 = ByteBuffer.wrap(var5);
        var2.glTexImage2D(3553, 0, 6408, 1, 1, 0, 6408, 5121, var6);
        var2.glTexParameteri(3553, 10241, 9729);
        var2.glTexParameteri(3553, 10240, 9729);
        class124.field2103 += var6.limit() - this.field1052;
        this.field1052 = var6.limit();
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lrm;I)Lbl;", line = 649)
    public static final class315 method457(class249 arg0, int arg1) {
        field1055++;
        return arg1 == 104 ? new class315(arg0.method1728(true), arg0.method1728(true), arg0.method1728(true), arg0.method1728(true), arg0.method1749(false), arg0.method1749(false), arg0.method1731(true)) : (class315) null;
    }

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "(I)V", line = 660)
    public static void method458(int arg0) {
        field1061 = null;
        field1047 = null;
        if (arg0 != 104) {
            field1056 = false;
        }
    }

    @OriginalMember(owner = "client!ri", name = "finalize", descriptor = "()V", line = 672)
    protected final void finalize() throws Throwable {
        field1053++;
        if (this.field1054 != -1) {
            class124.method864(this.field1054, this.field1052, this.field1051);
            this.field1054 = -1;
            this.field1052 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(Z)V", line = 687)
    public static final void method459(boolean arg0) {
        if (arg0) {
            field1057 = -104;
        }
        for (int var1 = 0; var1 < 100; var1++) {
            class47.field692[var1] = true;
        }
        field1049++;
    }

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "(B)V", line = 706)
    public static final void method460(byte arg0) {
        if (arg0 <= 120) {
            field1061 = (String) null;
        }
        field1059++;
        class223.field3949.method639(-70);
    }
}
