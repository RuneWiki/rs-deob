import jaggl.OpenGL;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aea")
public abstract class class45 implements class502 {

    @OriginalMember(owner = "client!aea", name = "o", descriptor = "Llba;")
    private class477 field484 = class450.field6724;

    @OriginalMember(owner = "client!aea", name = "d", descriptor = "Z")
    private boolean field473;

    @OriginalMember(owner = "client!aea", name = "c", descriptor = "I")
    private int field472;

    @OriginalMember(owner = "client!aea", name = "t", descriptor = "Lkp;")
    public class421 field489;

    @OriginalMember(owner = "client!aea", name = "f", descriptor = "I")
    public int field475;

    @OriginalMember(owner = "client!aea", name = "l", descriptor = "Lvt;")
    public class256 field481;

    @OriginalMember(owner = "client!aea", name = "k", descriptor = "Lgf;")
    public class234 field480;

    @OriginalMember(owner = "client!aea", name = "q", descriptor = "I")
    private int field486;

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "I")
    public static int field470;

    @OriginalMember(owner = "client!aea", name = "b", descriptor = "I")
    public static int field471;

    @OriginalMember(owner = "client!aea", name = "e", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!aea", name = "g", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!aea", name = "h", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!aea", name = "i", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "client!aea", name = "j", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!aea", name = "m", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!aea", name = "n", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!aea", name = "p", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!aea", name = "r", descriptor = "I")
    public static int field487;

    @OriginalMember(owner = "client!aea", name = "s", descriptor = "I")
    public static int field488;

    @OriginalMember(owner = "client!aea", name = "u", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(IZI)I")
    public static final int method234(int arg0, boolean arg1, int arg2) {
        field483++;
        if (class555.field7871 == -1) {
            return 1;
        }
        if (class81.field908 != arg0) {
            class418.method2644(arg0, (byte) 80);
            if (class81.field908 != arg0) {
                return -1;
            }
        }
        try {
            Dimension var3 = class30.field348.getSize();
            class120.method745(arg1, -52, class445.field6665, class296.field4391.method2902(class35.field396, -20139));
            class557 var4 = class471.method2890(0, class555.field7871, -123, class30.field345);
            long var5 = class84.method550((byte) -105);
            class413.field6264.method404();
            class495.field7240.method2014(0, class170.field2095, 0);
            class413.field6264.method382(class495.field7240);
            class413.field6264.method309(var3.width / 2, var3.height / 2, 512, 512);
            class413.field6264.method315(1.0F);
            class413.field6264.method310(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
            class327 var7 = class413.field6264.method326(var4, 2048, 64, 64, 768);
            int var8 = 0;
            label41: for (int var9 = 0; var9 < 500; var9++) {
                class413.field6264.method344(0);
                class413.field6264.method349();
                for (int var10 = 15; var10 >= 0; var10--) {
                    for (int var11 = 0; var11 <= var10; var11++) {
                        class270.field3782.method2014((int) (((float) var11 - ((float) var10 / 2.0F)) * (float) class193.field2559), 0, (var10 + 1) * class193.field2559);
                        var7.method1380(class270.field3782, null, 0);
                        var8++;
                        if (class84.method550((byte) -98) - var5 >= (long) arg2) {
                            break label41;
                        }
                    }
                }
            }
            class413.field6264.method362();
            long var12 = (long) (var8 * 1000) / (class84.method550((byte) -96) - var5);
            class413.field6264.method344(0);
            class413.field6264.method349();
            return (int) var12;
        } catch (Throwable var15) {
            var15.printStackTrace();
            return -1;
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(Llba;I)V")
    public final void method154(class477 arg0, int arg1) {
        if (this.field484 != arg0) {
            this.field484 = arg0;
            this.method236(10241);
        }
        field490++;
        if (arg1 != -8457) {
            this.field484 = null;
        }
    }

    @OriginalMember(owner = "client!aea", name = "e", descriptor = "(I)V")
    private final void method235(int arg0) {
        if (this.field486 > 0) {
            this.field480.method1542(this.method242((byte) 63), this.field486, -19775);
            this.field486 = 0;
        }
        if (arg0 <= 8) {
            this.field472 = 109;
        }
        field477++;
    }

    @OriginalMember(owner = "client!aea", name = "d", descriptor = "(I)V")
    public final void method152(int arg0) {
        field479++;
        int var2 = this.field480.method1972(-18556);
        int var3 = this.field480.field3371[var2];
        if (arg0 != 24784) {
            this.field486 = 11;
        }
        if (this.field475 != var3) {
            if (var3 != 0) {
                OpenGL.glBindTexture(var3, 0);
                OpenGL.glDisable(var3);
            }
            OpenGL.glEnable(this.field475);
            this.field480.field3371[var2] = this.field475;
        }
        OpenGL.glBindTexture(this.field475, this.field486);
    }

    @OriginalMember(owner = "client!aea", name = "f", descriptor = "(I)V")
    private final void method236(int arg0) {
        if (arg0 != 10241) {
            this.field481 = null;
        }
        this.field480.method1971((byte) -122, this);
        field485++;
        if (class450.field6724 == this.field484) {
            OpenGL.glTexParameteri(this.field475, 10241, this.field473 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field475, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field475, 10241, this.field473 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field475, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(ILhb;)V")
    public static final void method237(int arg0, class629 arg1) {
        field482++;
        if (class202.field2697 == arg1) {
            int var2 = class46.field498.method1177(255);
            int var3 = ((var2 & 0x76) >> 4) + class454.field6786;
            int var4 = class646.field9359 + (var2 & 0x7);
            int var5 = class46.field498.method1220(arg0 - 111);
            int var6 = class46.field498.method1177(255);
            int var7 = class46.field498.method1220(-80);
            int var8 = class46.field498.method1177(255);
            if (var3 >= 0 && var4 >= 0 && class90.field1032 > var3 && class30.field349 > var4) {
                int var9 = var3 * 512 + 256;
                int var10 = var4 * 512 + 256;
                int var11 = class323.field4667;
                if (var11 < 3 && class647.method3709(var3, var4, -17206)) {
                    var11++;
                }
                class56 var12 = new class56(var5, var7, class287.field3982, class323.field4667, var11, var9, class399.method2547(var10, var9, (byte) 118, class323.field4667) - var6, var10, var3, var3, var4, var4, var8);
                class518.field7540.method706(new class276(var12), true);
            }
        } else if (class151.field1859 == arg1) {
            int var13 = class46.field498.method1220(115);
            if (var13 == 65535) {
                var13 = -1;
            }
            int var14 = class46.field498.method1209(arg0 - 24740);
            int var15 = class454.field6786 + (var14 >> 4 & 0x7);
            int var16 = class646.field9359 + (var14 & 0x7);
            int var17 = class46.field498.method1177(255);
            int var18 = var17 >> 2;
            int var19 = var17 & 0x3;
            int var20 = class547.field7838[var18];
            class139.method835(class323.field4667, arg0 + 126, var13, var19, var18, var20, var16, var15);
        } else if (class309.field4543 == arg1) {
            int var21 = class46.field498.method1209(arg0 - 24740);
            int var22 = (var21 & 0x7) + class646.field9359;
            int var23 = class250.field3549 + var22;
            int var24 = (var21 >> 4 & 0x7) + class454.field6786;
            int var25 = class287.field3980 + var24;
            int var26 = class46.field498.method1239((byte) 120);
            int var27 = class46.field498.method1239((byte) 109);
            boolean var28 = var24 >= 0 && var22 >= 0 && class90.field1032 > var24 && class30.field349 > var22;
            if (var28 || class327.method2122(class251.field3570, 7510)) {
                class107.method658(arg0 ^ 0x7E10, new class236(var26, var27), var23, class323.field4667, var25);
                if (var28) {
                    class187.method1083(class323.field4667, var24, var22, 23);
                }
            }
        } else if (class91.field1041 == arg1) {
            int var29 = class46.field498.method1177(255);
            boolean var30 = (var29 & 0x80) != 0;
            int var31 = ((var29 & 0x3F) >> 3) + class454.field6786;
            int var32 = class646.field9359 + (var29 & 0x7);
            int var33 = class46.field498.method1213((byte) 25) + var31;
            int var34 = class46.field498.method1213((byte) 54) + var32;
            int var35 = class46.field498.method1233(65280);
            int var36 = class46.field498.method1220(-103);
            int var37 = class46.field498.method1177(arg0 + 253) * 4;
            int var38 = class46.field498.method1177(arg0 ^ 0xFD) * 4;
            int var39 = class46.field498.method1220(111);
            int var40 = class46.field498.method1220(117);
            int var41 = class46.field498.method1177(255);
            if (var41 == 255) {
                var41 = -1;
            }
            int var42 = class46.field498.method1220(-55);
            if (var31 >= 0 && var32 >= 0 && class90.field1032 > var31 && var32 < class30.field349 && var33 >= 0 && var34 >= 0 && var33 < class90.field1032 && class30.field349 > var34 && var36 != 65535) {
                int var43 = var38 << 2;
                int var44 = var34 * 512 + 256;
                int var45 = var37 << 2;
                int var46 = var32 * 512 + 256;
                int var47 = var31 * 512 + 256;
                int var48 = var33 * 512 + 256;
                int var49 = var42 << 2;
                class640 var50 = new class640(var36, class323.field4667, var47, var46, var45, var39 + class287.field3982, class287.field3982 + var40, var41, var49, var35, var43, var30);
                var50.method3646(-1, var48, class399.method2547(var44, var48, (byte) -128, class323.field4667) - var43, class287.field3982 + var39, var44);
                class276.field3851.method706(new class637(var50), true);
            }
        } else if (class96.field1133 == arg1) {
            int var51 = class46.field498.method1220(arg0 - 23);
            int var52 = class46.field498.method1226(128);
            int var53 = class646.field9359 + (var52 & 0x7);
            int var54 = var53 + class250.field3549;
            int var55 = (var52 >> 4 & 0x7) + class454.field6786;
            int var56 = var55 + class287.field3980;
            class446 var57 = (class446) class294.field4247.method524((byte) 123, (long) (class323.field4667 << 28 | var54 << 14 | var56));
            if (var57 != null) {
                for (class236 var58 = (class236) var57.field6669.method719(false); var58 != null; var58 = (class236) var57.field6669.method716(14)) {
                    if ((var51 & 0x7FFF) == var58.field3385) {
                        var58.method2108(true);
                        break;
                    }
                }
                if (var57.field6669.method715(true)) {
                    var57.method2108(true);
                }
                if (var55 >= 0 && var53 >= 0 && var55 < class90.field1032 && class30.field349 > var53) {
                    class187.method1083(class323.field4667, var55, var53, arg0 + 12);
                }
            }
        } else if (class287.field3968 == arg1) {
            int var59 = class46.field498.method1177(255);
            int var60 = class454.field6786 + (var59 >> 4 & 0x7);
            int var61 = (var59 & 0x7) + class646.field9359;
            int var62 = class46.field498.method1220(-82);
            if (var62 == 65535) {
                var62 = -1;
            }
            int var63 = class46.field498.method1177(255);
            int var64 = var63 >> 4 & 0xF;
            int var65 = var63 & 0x7;
            int var66 = class46.field498.method1177(arg0 ^ 0xFD);
            int var67 = class46.field498.method1177(arg0 ^ 0xFD);
            if (var60 >= 0 && var61 >= 0 && class90.field1032 > var60 && var61 < class30.field349) {
                int var68 = var64 + 1;
                if (var60 - var68 <= class439.field6548.field2515[0] && (var60 + var68) >= class439.field6548.field2515[0] && class439.field6548.field2524[0] >= (var61 - var68) && class439.field6548.field2524[0] <= var61 + var68) {
                    class402.method2552((class323.field4667 << 24) + (var60 << 16) - (-(var61 << 8) + -var64), var62, var66, var67, true, var65);
                }
            }
        } else if (class72.field774 == arg1) {
            int var69 = class46.field498.method1190(false);
            int var70 = (var69 & 0x7) + class646.field9359;
            int var71 = class250.field3549 + var70;
            int var72 = (var69 >> 4 & 0x7) + class454.field6786;
            int var73 = class287.field3980 + var72;
            int var74 = class46.field498.method1195((byte) -125);
            int var75 = class46.field498.method1239((byte) 116);
            int var76 = class46.field498.method1197(true);
            if (class244.field3460 != var74) {
                boolean var77 = var72 >= 0 && var70 >= 0 && var72 < class90.field1032 && class30.field349 > var70;
                if (var77 || class327.method2122(class251.field3570, 7510)) {
                    class107.method658(32274, new class236(var75, var76), var71, class323.field4667, var73);
                    if (var77) {
                        class187.method1083(class323.field4667, var72, var70, arg0 ^ 0x43);
                    }
                }
            }
        } else if (class261.field3711 == arg1) {
            int var78 = class46.field498.method1226(128);
            int var79 = class454.field6786 + ((var78 & 0x79) >> 4);
            int var80 = (var78 & 0x7) + class646.field9359;
            int var81 = class46.field498.method1177(255);
            int var82 = var81 >> 2;
            int var83 = var81 & 0x3;
            int var84 = class547.field7838[var82];
            int var85 = class46.field498.method1197(true);
            if (class327.method2122(class251.field3570, 7510) || var79 >= 0 && var80 >= 0 && var79 < class90.field1032 && class30.field349 > var80) {
                class178.method1019(var83, 0, -1, var84, (byte) 45, var79, var85, class323.field4667, var80, var82);
            }
        } else if (class93.field1096 == arg1) {
            class46.field498.method1177(255);
            int var86 = class46.field498.method1177(arg0 ^ 0xFD);
            int var87 = (var86 >> 4 & 0x7) + class454.field6786;
            int var88 = (var86 & 0x7) + class646.field9359;
            int var89 = class46.field498.method1220(-65);
            int var90 = class46.field498.method1177(255);
            int var91 = class46.field498.method1180(arg0 ^ 0xCE5F0D26);
            String var92 = class46.field498.method1218(false);
            class515.method3058(var89, var88, var92, class323.field4667, var91, var90, var87, arg0 + 4);
        } else if (class111.field1369 == arg1) {
            byte var93 = class46.field498.method1227((byte) 98);
            int var94 = class46.field498.method1238(255);
            byte var95 = class46.field498.method1186(arg0 + 27027);
            byte var96 = class46.field498.method1227((byte) 98);
            byte var97 = class46.field498.method1186(27029);
            int var98 = class46.field498.method1190(false);
            int var99 = var98 >> 2;
            int var100 = var98 & 0x3;
            int var101 = class46.field498.method1220(-50);
            int var102 = class46.field498.method1220(arg0 ^ 0x79);
            int var103 = class46.field498.method1226(arg0 ^ 0x82);
            int var104 = class454.field6786 + ((var103 & 0x70) >> 4);
            int var105 = (var103 & 0x7) + class646.field9359;
            int var106 = class46.field498.method1197(true);
            if (!class413.field6264.method370()) {
                class523.method3088(var105, var97, class323.field4667, var102, (byte) -104, var106, var104, var94, var100, var101, var93, var99, var95, var96);
            }
        } else if (class421.field6301 == arg1) {
            int var107 = class46.field498.method1177(255);
            int var108 = (var107 >> 4 & 0xF) + class454.field6786 * 2;
            int var109 = (var107 & 0xF) + class646.field9359 * 2;
            boolean var110 = class46.field498.method1177(255) != 0;
            int var111 = var108 + class46.field498.method1213((byte) 113);
            int var112 = var109 + class46.field498.method1213((byte) 64);
            int var113 = class46.field498.method1233(65280);
            int var114 = class46.field498.method1220(arg0 + 119);
            int var115 = class46.field498.method1177(arg0 ^ 0xFD) * 4;
            int var116 = class46.field498.method1177(255) * 4;
            int var117 = class46.field498.method1220(arg0 + 110);
            int var118 = class46.field498.method1220(122);
            int var119 = class46.field498.method1177(arg0 + 253);
            if (var119 == 255) {
                var119 = -1;
            }
            int var120 = class46.field498.method1220(-105);
            if (var108 >= 0 && var109 >= 0 && var108 < class90.field1032 * 2 && var109 < (class90.field1032 * 2) && var111 >= 0 && var112 >= 0 && var111 < (class30.field349 * 2) && class30.field349 * 2 > var112 && var114 != 65535) {
                int var121 = var115 << 2;
                int var122 = var120 << 2;
                int var123 = var112 * 256;
                int var124 = var111 * 256;
                int var125 = var108 * 256;
                int var126 = var109 * 256;
                int var127 = var116 << 2;
                class640 var128 = new class640(var114, class323.field4667, var125, var126, var121, var117 + class287.field3982, class287.field3982 + var118, var119, var122, var113, var127, var110);
                var128.method3646(arg0 ^ 0xFFFFFFFD, var124, class399.method2547(var123, var124, (byte) -128, class323.field4667) - var127, class287.field3982 + var117, var123);
                class276.field3851.method706(new class637(var128), true);
            }
        } else if (class351.field5012 == arg1) {
            int var129 = class46.field498.method1220(112);
            int var130 = class46.field498.method1177(255);
            class575.field8301.method1499(arg0 ^ 0xFFFFE296, var129).method2458(var130, arg0 ^ 0xFFFFFF88);
        } else if (class301.field4426 == arg1) {
            int var131 = class46.field498.method1226(arg0 ^ 0x82);
            int var132 = class454.field6786 + (var131 >> 4 & 0x7);
            int var133 = (var131 & 0x7) + class646.field9359;
            int var134 = class46.field498.method1190(false);
            int var135 = var134 >> 2;
            int var136 = var134 & 0x3;
            int var137 = class547.field7838[var135];
            if (class327.method2122(class251.field3570, 7510) || var132 >= 0 && var133 >= 0 && class90.field1032 > var132 && var133 < class30.field349) {
                class178.method1019(var136, 0, -1, var137, (byte) 45, var132, -1, class323.field4667, var133, var135);
            }
        } else if (class390.field5968 == arg1) {
            int var138 = class46.field498.method1177(255);
            int var139 = (var138 & 0x7) + class646.field9359;
            int var140 = class250.field3549 + var139;
            int var141 = ((var138 & 0x7C) >> 4) + class454.field6786;
            int var142 = var141 + class287.field3980;
            int var143 = class46.field498.method1220(120);
            int var144 = class46.field498.method1220(115);
            int var145 = class46.field498.method1220(115);
            if (class294.field4247 != null) {
                class446 var146 = (class446) class294.field4247.method524((byte) 90, (long) (var142 | var140 << 14 | class323.field4667 << 28));
                if (var146 != null) {
                    for (class236 var147 = (class236) var146.field6669.method719(false); var147 != null; var147 = (class236) var146.field6669.method716(14)) {
                        if ((var143 & 0x7FFF) == var147.field3385 && var147.field3379 == var144) {
                            var147.method2108(true);
                            var147.field3379 = var145;
                            class107.method658(32274, var147, var140, class323.field4667, var142);
                            break;
                        }
                    }
                    if (var141 >= 0 && var139 >= 0 && class90.field1032 > var141 && class30.field349 > var139) {
                        class187.method1083(class323.field4667, var141, var139, 51);
                    }
                }
            }
        } else if (class10.field85 == arg1) {
            int var148 = class46.field498.method1177(arg0 + 253);
            int var149 = class454.field6786 + ((var148 & 0x74) >> 4);
            int var150 = (var148 & 0x7) + class646.field9359;
            int var151 = class46.field498.method1220(-62);
            if (var151 == 65535) {
                var151 = -1;
            }
            int var152 = class46.field498.method1177(arg0 ^ 0xFD);
            int var153 = (var152 & 0xFB) >> 4;
            int var154 = var152 & 0x7;
            int var155 = class46.field498.method1177(255);
            int var156 = class46.field498.method1177(255);
            if (var149 >= 0 && var150 >= 0 && class90.field1032 > var149 && class30.field349 > var150) {
                int var157 = var153 + 1;
                if (var149 - var157 <= class439.field6548.field2515[0] && class439.field6548.field2515[0] <= (var149 + var157) && var150 - var157 <= class439.field6548.field2524[0] && class439.field6548.field2524[0] <= (var150 + var157)) {
                    class10.method59(var151, var155, arg0 ^ 0x5A, var156, false, var154, (class323.field4667 << 24) - (-(var149 << 16) - ((var150 << 8) + var153)));
                }
            }
        } else if (class135.field1690 == arg1) {
            int var158 = class46.field498.method1177(255);
            int var159 = (var158 >> 4 & 0xF) + class454.field6786 * 2;
            int var160 = class646.field9359 * 2 + (var158 & 0xF);
            boolean var161 = class46.field498.method1177(arg0 + 253) != 0;
            int var162 = var159 + class46.field498.method1213((byte) 21);
            int var163 = var160 + class46.field498.method1213((byte) 115);
            int var164 = class46.field498.method1233(65280);
            int var165 = class46.field498.method1233(65280);
            int var166 = class46.field498.method1220(arg0 ^ 0x77);
            byte var167 = class46.field498.method1213((byte) 53);
            int var168 = class46.field498.method1177(255) * 4;
            int var169 = class46.field498.method1220(arg0 - 51);
            int var170 = class46.field498.method1220(115);
            int var171 = class46.field498.method1177(255);
            if (var171 == 255) {
                var171 = -1;
            }
            int var172 = class46.field498.method1220(121);
            if (var159 >= 0 && var160 >= 0 && class90.field1032 * 2 > var159 && var160 < class90.field1032 * 2 && var162 >= 0 && var163 >= 0 && class30.field349 * 2 > var162 && var163 < class30.field349 * 2 && var166 != 65535) {
                int var173 = var159 * 256;
                int var174 = var168 << 2;
                int var175 = var162 * 256;
                int var176 = var167 << 2;
                int var177 = var160 * 256;
                int var178 = var172 << 2;
                int var179 = var163 * 256;
                if (var164 != 0) {
                    class191 var180 = null;
                    int var183;
                    if (var164 < 0) {
                        int var181 = -var164 - 1;
                        int var182 = var181 & 0x7FF;
                        var183 = var181 >> 11 & 0xF;
                        if (class244.field3460 == var182) {
                            var180 = class439.field6548;
                        } else {
                            var180 = class142.field1749[var182];
                        }
                    } else {
                        int var184 = var164 - 1;
                        var183 = var184 >> 11 & 0xF;
                        int var185 = var184 & 0x7FF;
                        class411 var186 = (class411) class42.field456.method524((byte) 85, (long) var185);
                        if (var186 != null) {
                            var180 = var186.field6254;
                        }
                    }
                    if (var180 != null) {
                        class154 var187 = var180.method1158((byte) 91);
                        if (var187.field1892 != null && var187.field1892[var183] != null) {
                            int var188 = var187.field1892[var183][0];
                            int var189 = var187.field1892[var183][2];
                            int var190 = var180.field2501.method877(-95);
                            int var191 = class605.field8859[var190];
                            int var192 = class605.field8858[var190];
                            int var193 = var188 * var192 + var189 * var191 >> 14;
                            int var194 = var189 * var192 - (var188 * var191) >> 14;
                            var173 += var193;
                            var177 += var194;
                            var176 -= var187.field1892[var183][1];
                        }
                    }
                }
                class640 var196 = new class640(var166, class323.field4667, var173, var177, var176, class287.field3982 + var169, class287.field3982 + var170, var171, var178, var165, var174, var161);
                var196.method3646(-1, var175, class399.method2547(var179, var175, (byte) -128, class323.field4667) - var174, class287.field3982 + var169, var179);
                class276.field3851.method706(new class637(var196), true);
            }
        } else {
            class630.method3607(arg0 + 5, null, "T3 - " + arg1);
            if (arg0 != 2) {
                method237(78, null);
            }
            class177.method1007((byte) -50, false);
        }
    }

    @OriginalMember(owner = "client!aea", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method235(34);
        field470++;
        super.finalize();
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(I[FZII)V")
    public final void method238(int arg0, float[] arg1, boolean arg2, int arg3, int arg4) {
        field488++;
        if (arg4 > 0 && !class229.method1482(arg4, 81)) {
            throw new IllegalArgumentException("");
        } else if (arg3 <= 0 || class229.method1482(arg3, 104)) {
            int var6 = this.field489.field6300;
            int var7 = 0;
            int var8 = arg4 >= arg3 ? arg3 : arg4;
            if (!arg2) {
                this.method243((byte) -90);
            }
            int var9 = arg4 >> 1;
            int var10 = arg3 >> 1;
            float[] var11 = arg1;
            float[] var12 = new float[var6 * var10 * var9];
            while (true) {
                OpenGL.glTexImage2Df(arg0, var7, this.method243((byte) -108), arg4, arg3, 0, class442.method2756(this.field489, 107), 5126, var11, 0);
                if (var8 <= 1) {
                    return;
                }
                int var13 = arg4 * var6;
                for (int var14 = 0; var14 < var6; var14++) {
                    int var16 = var14;
                    int var17 = var14;
                    int var18 = var13 + var14;
                    for (int var19 = 0; var19 < var10; var19++) {
                        for (int var20 = 0; var20 < var9; var20++) {
                            float var21 = var11[var17];
                            int var22 = var6 + var17;
                            float var23 = var11[var22] + var21;
                            var17 = var6 + var22;
                            float var24 = var11[var18] + var23;
                            int var25 = var6 + var18;
                            float var26 = var11[var25] + var24;
                            var18 = var6 + var25;
                            var12[var16] = var26 * 0.25F;
                            var16 += var6;
                        }
                        var18 += var13;
                        var17 += var13;
                    }
                }
                float[] var15 = var12;
                var12 = var11;
                var11 = var15;
                arg4 = var9;
                arg3 = var10;
                var7++;
                var9 >>= 0x1;
                var8 >>= 0x1;
                var10 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "([BIIII)V")
    public final void method239(byte[] arg0, int arg1, int arg2, int arg3, int arg4) {
        field487++;
        if (arg2 > 0 && !class229.method1482(arg2, 116)) {
            throw new IllegalArgumentException("");
        } else if (arg4 <= 0 || class229.method1482(arg4, 103)) {
            int var6 = this.field489.field6300;
            int var7 = 0;
            int var8 = arg4 > arg2 ? arg2 : arg4;
            if (arg3 >= -49) {
                this.method154(null, 26);
            }
            int var9 = arg2 >> 1;
            int var10 = arg4 >> 1;
            byte[] var11 = arg0;
            byte[] var12 = new byte[var9 * var10 * var6];
            while (true) {
                OpenGL.glTexImage2Dub(arg1, var7, this.method243((byte) -98), arg2, arg4, 0, class442.method2756(this.field489, 122), 5121, var11, 0);
                if (var8 <= 1) {
                    return;
                }
                int var13 = arg2 * var6;
                byte[] var14 = var12;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = var15;
                    int var17 = var15;
                    int var18 = var15 + var13;
                    for (int var19 = 0; var19 < var10; var19++) {
                        for (int var20 = 0; var20 < var9; var20++) {
                            byte var21 = var11[var17];
                            int var22 = var6 + var17;
                            int var23 = var11[var22] + var21;
                            int var24 = var11[var18] + var23;
                            var17 = var6 + var22;
                            int var25 = var6 + var18;
                            int var26 = var11[var25] + var24;
                            var18 = var6 + var25;
                            var12[var16] = (byte) (var26 >> 2);
                            var16 += var6;
                        }
                        var17 += var13;
                        var18 += var13;
                    }
                }
                var12 = var11;
                arg2 = var9;
                var11 = var14;
                arg4 = var10;
                var7++;
                var10 >>= 0x1;
                var9 >>= 0x1;
                var8 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(II)V")
    private final void method240(int arg0, int arg1) {
        this.field480.field4250 -= arg1;
        field476++;
        if (arg0 != 15) {
            this.method243((byte) 26);
        }
        this.field480.field4250 += this.method242((byte) 63);
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIII[I)V")
    public final void method241(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        field478++;
        if (arg2 > 0 && !class229.method1482(arg2, arg1 - 11924)) {
            throw new IllegalArgumentException("");
        } else if (arg0 > 0 && !class229.method1482(arg0, arg1 - 11965)) {
            throw new IllegalArgumentException("");
        } else if (class538.field7742 == this.field489) {
            int var6 = 0;
            if (arg1 == 12041) {
                int var7 = arg0 > arg2 ? arg2 : arg0;
                int var8 = arg2 >> 1;
                int var9 = arg0 >> 1;
                int[] var10 = arg4;
                int[] var11 = new int[var8 * var9];
                while (true) {
                    OpenGL.glTexImage2Di(arg3, var6, this.method243((byte) -62), arg2, arg0, 0, 32993, this.field480.field3367, var10, 0);
                    if (var7 <= 1) {
                        return;
                    }
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = arg2 + var13;
                    for (int var15 = 0; var15 < var9; var15++) {
                        for (int var17 = 0; var17 < var8; var17++) {
                            int var18 = var10[var13++];
                            int var19 = var10[var13++];
                            int var20 = var10[var14++];
                            int var21 = var18 >> 8 & 0xFF;
                            int var22 = var18 & 0xFF;
                            int var23 = var18 >> 24 & 0xFF;
                            int var24 = (var18 & 0xFF8707) >> 16;
                            int var25 = var10[var14++];
                            int var26 = (var19 >> 24 & 0xFF) + var23;
                            int var27 = (var19 & 0xFF) + var22;
                            int var28 = ((var19 & 0xFF83) >> 8) + var21;
                            int var29 = (var19 >> 16 & 0xFF) + var24;
                            int var30 = ((var20 & 0xFF171B) >> 16) + var29;
                            int var31 = (var20 >> 8 & 0xFF) + var28;
                            int var32 = (var20 >> 24 & 0xFF) + var26;
                            int var33 = (var20 & 0xFF) + var27;
                            int var34 = (var25 >> 24 & 0xFF) + var32;
                            int var35 = (var25 >> 16 & 0xFF) + var30;
                            int var36 = (var25 & 0xFF) + var33;
                            int var37 = ((var25 & 0xFF98) >> 8) + var31;
                            var11[var12++] = class283.method1834(class283.method1834(class283.method1834(class643.method3659(-16777216, var34 << 22), class643.method3659(1020, var35) << 14), class643.method3659(1020, var37) << 6), class643.method3659(1020, var36) >> 2);
                        }
                        var13 += arg2;
                        var14 += arg2;
                    }
                    int[] var16 = var11;
                    var11 = var10;
                    arg0 = var9;
                    arg2 = var8;
                    var10 = var16;
                    var7 >>= 0x1;
                    var8 >>= 0x1;
                    var9 >>= 0x1;
                    var6++;
                }
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(B)I")
    private final int method242(byte arg0) {
        field471++;
        int var2 = this.field489.field6300 * this.field481.field3652 * this.field472;
        if (arg0 != 63) {
            this.method241(95, -120, 126, 87, null);
        }
        return this.field473 ? var2 * 4 / 3 : var2;
    }

    @OriginalMember(owner = "client!aea", name = "<init>", descriptor = "(Lgf;ILkp;Lvt;IZ)V")
    public class45(class234 arg0, int arg1, class421 arg2, class256 arg3, int arg4, boolean arg5) {
        this.field473 = arg5;
        this.field472 = arg4;
        this.field489 = arg2;
        this.field475 = arg1;
        this.field481 = arg3;
        this.field480 = arg0;
        OpenGL.glGenTextures(1, class87.field988, 0);
        this.field486 = class87.field988[0];
        this.method236(10241);
        this.method240(15, 0);
    }

    @OriginalMember(owner = "client!aea", name = "b", descriptor = "(B)I")
    public final int method243(byte arg0) {
        if (arg0 > -57) {
            this.method242((byte) 5);
        }
        field474++;
        if (class256.field3653 == this.field481) {
            if (class602.field8784 == this.field489) {
                return 6407;
            }
            if (class538.field7742 == this.field489) {
                return 6408;
            }
            if (class562.field8019 == this.field489) {
                return 6406;
            }
            if (class339.field4850 == this.field489) {
                return 6409;
            }
            if (class162.field1982 == this.field489) {
                return 6410;
            }
            if (class547.field7824 == this.field489) {
                return 6145;
            }
        } else if (class256.field3656 == this.field481) {
            if (class602.field8784 == this.field489) {
                return 34843;
            }
            if (class538.field7742 == this.field489) {
                return 34842;
            }
            if (class562.field8019 == this.field489) {
                return 34844;
            }
            if (class339.field4850 == this.field489) {
                return 34846;
            }
            if (class162.field1982 == this.field489) {
                return 34847;
            }
            if (class547.field7824 == this.field489) {
                return 6145;
            }
        } else if (class256.field3657 == this.field481) {
            if (class602.field8784 == this.field489) {
                return 34837;
            }
            if (class538.field7742 == this.field489) {
                return 34836;
            }
            if (class562.field8019 == this.field489) {
                return 34838;
            }
            if (class339.field4850 == this.field489) {
                return 34840;
            }
            if (class162.field1982 == this.field489) {
                return 34841;
            }
            if (class547.field7824 == this.field489) {
                return 6145;
            }
        }
        throw new IllegalStateException();
    }
}
