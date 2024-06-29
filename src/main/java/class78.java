import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class78 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "Ljf;")
    private static class229 field1425 = class212.method1457((byte) 96, "flash2:");

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "Ljf;")
    public static class229 field1435 = field1425;

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "I")
    public static int field1436 = 0;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "Ljf;")
    public static class229 field1431 = class212.method1457((byte) 121, "Benutzen");

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
    public static int field1430 = 7759444;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
    public static volatile int field1426 = -1;

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "Ljf;")
    public static class229 field1437 = field1425;

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "Ljf;")
    private static class229 field1439 = class212.method1457((byte) 63, "Loaded input handler");

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "Ljf;")
    public static class229 field1424 = field1439;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "I")
    public static int field1438;

    @OriginalMember(owner = "client!pb", name = "q", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!pb", name = "r", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!pb", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 9)
    public final synchronized void keyPressed(KeyEvent arg0) {
        field1434++;
        if (class217.field3720 == null) {
            return;
        }
        class46.field851 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < class47.field859.length) {
            var3 = class47.field859[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class130.field2303 >= 0 && var3 >= 0) {
            class16.field264[class130.field2303] = var3;
            class130.field2303 = class130.field2303 + 1 & 0x7F;
            if (class130.field2309 == class130.field2303) {
                class130.field2303 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class188.field3286 + 1 & 0x7F;
            if (class128.field2293 != var4) {
                class222.field3795[class188.field3286] = var3;
                class220.field3744[class188.field3286] = -1;
                class188.field3286 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!pb", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 71)
    public final void keyTyped(KeyEvent arg0) {
        if (class217.field3720 != null) {
            int var2 = class259.method1846(arg0, (byte) 43);
            if (var2 >= 0) {
                int var3 = class188.field3286 + 1 & 0x7F;
                if (class128.field2293 != var3) {
                    class222.field3795[class188.field3286] = -1;
                    class220.field3744[class188.field3286] = var2;
                    class188.field3286 = var3;
                }
            }
        }
        field1438++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!pb", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 100)
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class217.field3720 != null) {
            class46.field851 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class47.field859.length > var2) {
                var3 = class47.field859[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class130.field2303 >= 0 && var3 >= 0) {
                class16.field264[class130.field2303] = ~var3;
                class130.field2303 = class130.field2303 + 1 & 0x7F;
                if (class130.field2309 == class130.field2303) {
                    class130.field2303 = -1;
                }
            }
        }
        field1428++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lhg;IIIII)V", line = 133)
    public static final void method556(class174 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class45.field828 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class170.field2971) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class10.field119 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class125 var14 = class312.field5246[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class132.field2328[var11][var12 + 1][var13] + class132.field2328[var11][var12][var13] + class132.field2328[var11][var12][var13 + 1] + class132.field2328[var11][var12 + 1][var13 + 1]) / 4 - (class132.field2328[arg1][arg2 + 1][arg3] + class132.field2328[arg1][arg2][arg3] + class132.field2328[arg1][arg2][arg3 + 1] + class132.field2328[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class167 var16 = var14.field2198;
                                    if (var16 != null) {
                                        if (var16.field2865.method1183()) {
                                            arg0.method1180(var16.field2865, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field2874 != null && var16.field2874.method1183()) {
                                            arg0.method1180(var16.field2874, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field2201; var17++) {
                                        class104 var18 = var14.field2204[var17];
                                        if (var18 != null && var18.field1806.method1183() && (var18.field1800 == var12 || var7 == var12) && (var18.field1791 == var13 || var9 == var13)) {
                                            int var19 = var18.field1802 + 1 - var18.field1800;
                                            int var20 = var18.field1812 + 1 - var18.field1791;
                                            arg0.method1180(var18.field1806, (var18.field1800 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field1791 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIILhg;Lhg;IIIIJ)V", line = 248)
    public static final void method557(int arg0, int arg1, int arg2, int arg3, class174 arg4, class174 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class232 var12 = new class232();
        var12.field4027 = arg10;
        var12.field4036 = arg1 * 128 + 64;
        var12.field4037 = arg2 * 128 + 64;
        var12.field4019 = arg3;
        var12.field4016 = arg4;
        var12.field4028 = arg5;
        var12.field4038 = arg6;
        var12.field4013 = arg7;
        var12.field4021 = arg8;
        var12.field4029 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class312.field5246[var13][arg1][arg2] == null) {
                class312.field5246[var13][arg1][arg2] = new class125(var13, arg1, arg2);
            }
        }
        class312.field5246[arg0][arg1][arg2].field2192 = var12;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V", line = 276)
    public static final void method558(int arg0) {
        field1427++;
        if (class107.field1879 == 109) {
            int var1 = class171.field2972.method93(false);
            int var2 = class146.field2530 + ((var1 & 0x72) >> 4);
            int var3 = (var1 & 0x7) + class203.field3544;
            int var4 = var2 + class171.field2972.method98(true);
            int var5 = class171.field2972.method98(true) + var3;
            int var6 = class171.field2972.method113((byte) 122);
            int var7 = class171.field2972.method116(-1);
            int var8 = class171.field2972.method93(false) * 4;
            int var9 = class171.field2972.method93(false) * 4;
            int var10 = class171.field2972.method116(-1);
            int var11 = class171.field2972.method116(-1);
            int var12 = class171.field2972.method93(false);
            int var13 = class171.field2972.method93(false);
            if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104 && var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104 && var7 != 65535) {
                int var14 = var5 * 128 + 64;
                int var15 = var3 * 128 + 64;
                int var16 = var2 * 128 + 64;
                int var17 = var4 * 128 + 64;
                class22 var18 = new class22(var7, class16.field254, var16, var15, class282.method1984((byte) -84, var15, var16, class16.field254) - var8, class199.field3475 + var10, class199.field3475 + var11, var12, var13, var6, var9);
                var18.method212(class282.method1984((byte) -90, var14, var17, class16.field254) - var9, var14, (byte) -108, var17, class199.field3475 + var10);
                class48.field870.method2079(new class215(var18), 46);
            }
        } else if (class107.field1879 == 176) {
            int var131 = class171.field2972.method102(1192240584);
            int var132 = class171.field2972.method102(1192240584);
            int var133 = class171.field2972.method131(-128);
            int var134 = ((var133 & 0x7B) >> 4) + class146.field2530;
            int var135 = (var133 & 0x7) + class203.field3544;
            if (var134 >= 0 && var135 >= 0 && var134 < 104 && var135 < 104) {
                class51 var136 = new class51();
                var136.field898 = var131;
                var136.field894 = var132;
                if (class105.field1822[class16.field254][var134][var135] == null) {
                    class105.field1822[class16.field254][var134][var135] = new class303();
                }
                class105.field1822[class16.field254][var134][var135].method2079(new class277(var136), 42);
                class234.method1672((byte) 60, var134, var135);
            }
        } else if (class107.field1879 == 36) {
            int var124 = class171.field2972.method145(46);
            int var125 = class171.field2972.method93(false);
            int var126 = (var125 >> 4 & 0x7) + class146.field2530;
            int var127 = (var125 & 0x7) + class203.field3544;
            int var128 = class171.field2972.method142((byte) 35);
            int var129 = class171.field2972.method116(-1);
            if (var126 >= 0 && var127 >= 0 && var126 < 104 && var127 < 104 && class112.field1963 != var129) {
                class51 var130 = new class51();
                var130.field894 = var128;
                var130.field898 = var124;
                if (class105.field1822[class16.field254][var126][var127] == null) {
                    class105.field1822[class16.field254][var126][var127] = new class303();
                }
                class105.field1822[class16.field254][var126][var127].method2079(new class277(var130), 95);
                class234.method1672((byte) 30, var126, var127);
            }
        } else if (class107.field1879 == 68) {
            int var116 = class171.field2972.method145(93);
            if (var116 == 65535) {
                var116 = -1;
            }
            int var117 = class171.field2972.method131(-128);
            int var118 = var117 >> 2;
            int var119 = class240.field4239[var118];
            int var120 = class171.field2972.method93(false);
            int var121 = var117 & 0x3;
            int var122 = (var120 >> 4 & 0x7) + class146.field2530;
            int var123 = (var120 & 0x7) + class203.field3544;
            class312.method2115(var121, var118, var122, var123, var119, var116, Integer.MAX_VALUE, class16.field254);
        } else if (class107.field1879 == 94) {
            int var19 = class171.field2972.method93(false);
            int var20 = (var19 & 0x7) + class203.field3544;
            int var21 = (var19 >> 4 & 0x7) + class146.field2530;
            int var22 = class171.field2972.method116(-1);
            int var23 = class171.field2972.method93(false);
            int var24 = class171.field2972.method116(-1);
            if (var21 >= 0 && var20 >= 0 && var21 < 104 && var20 < 104) {
                int var25 = var20 * 128 + 64;
                int var26 = var21 * 128 + 64;
                class69 var27 = new class69(var22, class16.field254, var26, var25, class282.method1984((byte) -99, var25, var26, class16.field254) - var23, var24, class199.field3475);
                class282.field4844.method2079(new class27(var27), 70);
            }
        } else if (class107.field1879 == 23) {
            int var98 = class171.field2972.method93(false);
            int var99 = (var98 & 0xF) + class203.field3544 * 2;
            int var100 = (var98 >> 4 & 0xF) + class146.field2530 * 2;
            int var101 = class171.field2972.method98(true) + var100;
            int var102 = class171.field2972.method98(true) + var99;
            int var103 = class171.field2972.method113((byte) 91);
            int var104 = class171.field2972.method116(-1);
            int var105 = class171.field2972.method93(false) * 4;
            int var106 = class171.field2972.method93(false) * 4;
            int var107 = class171.field2972.method116(-1);
            int var108 = class171.field2972.method116(-1);
            int var109 = class171.field2972.method93(false);
            int var110 = class171.field2972.method93(false);
            if (var100 >= 0 && var99 >= 0 && var100 < 208 && var99 < 208 && var101 >= 0 && var102 >= 0 && var101 < 208 && var102 < 208 && var104 != 65535) {
                int var111 = var102 * 64;
                int var112 = var99 * 64;
                int var113 = var101 * 64;
                int var114 = var100 * 64;
                class22 var115 = new class22(var104, class16.field254, var114, var112, class282.method1984((byte) -86, var112, var114, class16.field254) - var105, class199.field3475 + var107, class199.field3475 + var108, var109, var110, var103, var106);
                var115.method212(class282.method1984((byte) -103, var111, var113, class16.field254) - var106, var111, (byte) -108, var113, var107 + class199.field3475);
                class48.field870.method2079(new class215(var115), 93);
            }
        } else if (arg0 >= 107) {
            if (class107.field1879 == 212) {
                int var28 = class171.field2972.method139((byte) -116);
                int var29 = var28 >> 2;
                int var30 = var28 & 0x3;
                int var31 = class240.field4239[var29];
                int var32 = class171.field2972.method131(-128);
                int var33 = class146.field2530 + (var32 >> 4 & 0x7);
                int var34 = class203.field3544 + (var32 & 0x7);
                if (var33 >= 0 && var34 >= 0 && var33 < 104 && var34 < 104) {
                    class330.method2253(var34, -1, var33, class16.field254, var29, var30, -1, 0, var31, -126);
                }
            } else if (class107.field1879 == 147) {
                int var35 = class171.field2972.method143(0);
                int var36 = (var35 >> 4 & 0x7) + class146.field2530;
                int var37 = class203.field3544 + (var35 & 0x7);
                int var38 = class171.field2972.method102(1192240584);
                if (var36 >= 0 && var37 >= 0 && var36 < 104 && var37 < 104) {
                    class303 var39 = class105.field1822[class16.field254][var36][var37];
                    if (var39 != null) {
                        for (class277 var40 = (class277) var39.method2078(-112); var40 != null; var40 = (class277) var39.method2080(5)) {
                            if ((var38 & 0x7FFF) == var40.field4764.field894) {
                                var40.method1747((byte) -48);
                                break;
                            }
                        }
                        if (var39.method2078(-123) == null) {
                            class105.field1822[class16.field254][var36][var37] = null;
                        }
                        class234.method1672((byte) 41, var36, var37);
                    }
                }
            } else if (class107.field1879 == 125) {
                int var90 = class171.field2972.method143(0);
                int var91 = var90 >> 2;
                int var92 = var90 & 0x3;
                int var93 = class240.field4239[var91];
                int var94 = class171.field2972.method102(1192240584);
                int var95 = class171.field2972.method139((byte) -116);
                int var96 = (var95 >> 4 & 0x7) + class146.field2530;
                int var97 = (var95 & 0x7) + class203.field3544;
                if (var96 >= 0 && var97 >= 0 && var96 < 104 && var97 < 104) {
                    class330.method2253(var97, var94, var96, class16.field254, var91, var92, -1, 0, var93, -126);
                }
            } else {
                if (class107.field1879 == 126) {
                    int var41 = class171.field2972.method142((byte) 35);
                    byte var42 = class171.field2972.method98(true);
                    int var43 = class171.field2972.method93(false);
                    int var44 = var43 >> 2;
                    int var45 = class240.field4239[var44];
                    int var46 = var43 & 0x3;
                    int var47 = class171.field2972.method102(1192240584);
                    byte var48 = class171.field2972.method98(true);
                    byte var49 = class171.field2972.method94(123);
                    int var50 = class171.field2972.method142((byte) 35);
                    byte var51 = class171.field2972.method98(true);
                    int var52 = class171.field2972.method143(0);
                    int var53 = ((var52 & 0x74) >> 4) + class146.field2530;
                    int var54 = class203.field3544 + (var52 & 0x7);
                    int var55 = class171.field2972.method102(1192240584);
                    class33 var56;
                    if (class112.field1963 == var41) {
                        var56 = class301.field5124;
                    } else {
                        var56 = class192.field3334[var41];
                    }
                    if (!class108.field1900 && var56 != null) {
                        class83 var57 = class271.method1909(-30, var55);
                        int var58;
                        int var59;
                        if (var46 == 1 || var46 == 3) {
                            var59 = var57.field1572;
                            var58 = var57.field1528;
                        } else {
                            var58 = var57.field1572;
                            var59 = var57.field1528;
                        }
                        int var60 = var53 + (var59 + 1 >> 1);
                        int var61 = (var58 + 1 >> 1) + var54;
                        int var62 = (var59 >> 1) + var53;
                        int[][] var63 = class132.field2328[class16.field254];
                        int[][] var64 = (int[][]) null;
                        int var65 = (var58 >> 1) + var54;
                        if (class16.field254 < 3) {
                            var64 = class132.field2328[class16.field254 + 1];
                        }
                        int var66 = var63[var60][var65] + var63[var62][var61] + var63[var60][var61] + var63[var62][var65] >> 2;
                        int var67 = (var53 << 7) + (var59 << 6);
                        int var68 = (var54 << 7) + (var58 << 6);
                        class72 var69 = var57.method600(var67, var64, var57.field1537, var44, var66, 0, false, var68, var46, (class248) null, var63);
                        if (var69 != null) {
                            if (var42 > var48) {
                                byte var70 = var42;
                                var42 = var48;
                                var48 = var70;
                            }
                            if (var49 < var51) {
                                byte var71 = var51;
                                var51 = var49;
                                var49 = var71;
                            }
                            class330.method2253(var54, -1, var53, class16.field254, 0, 0, var47 + 1, var50 + 1, var45, -105);
                            var56.field608 = var51 + var54;
                            var56.field625 = var54 * 128 + var58 * 64;
                            var56.field615 = var48 + var53;
                            var56.field639 = var47 + class199.field3475;
                            var56.field619 = var49 + var54;
                            var56.field643 = class199.field3475 + var50;
                            var56.field628 = var53 * 128 + (var59 * 64);
                            var56.field612 = (class196) var69.field1383;
                            var56.field635 = var66;
                            var56.field629 = var53 + var42;
                        }
                    }
                }
                if (class107.field1879 == 10) {
                    int var72 = class171.field2972.method93(false);
                    int var73 = ((var72 & 0x74) >> 4) + class146.field2530;
                    int var74 = (var72 & 0x7) + class203.field3544;
                    int var75 = class171.field2972.method116(-1);
                    int var76 = class171.field2972.method93(false);
                    int var77 = var76 & 0x7;
                    int var78 = var76 >> 4 & 0xF;
                    int var79 = class171.field2972.method93(false);
                    if (var75 == 65535) {
                        var75 = -1;
                    }
                    if (var73 >= 0 && var74 >= 0 && var73 < 104 && var74 < 104) {
                        int var80 = var78 + 1;
                        if (var73 - var80 <= class301.field5124.field2018[0] && class301.field5124.field2018[0] <= var73 + var80 && (var74 - var80) <= class301.field5124.field2017[0] && (var74 + var80) >= class301.field5124.field2017[0] && class31.field531 != 0 && var77 > 0 && class131.field2313 < 50 && var75 != -1) {
                            class232.field4039[class131.field2313] = var75;
                            class47.field857[class131.field2313] = var77;
                            class234.field4047[class131.field2313] = var79;
                            class245.field4359[class131.field2313] = null;
                            class226.field3866[class131.field2313] = (var73 << 16) + (var74 << 8) + var78;
                            class131.field2313++;
                        }
                    }
                } else if (class107.field1879 == 134) {
                    int var81 = class171.field2972.method93(false);
                    int var82 = class203.field3544 + (var81 & 0x7);
                    int var83 = class146.field2530 + ((var81 & 0x7B) >> 4);
                    int var84 = class171.field2972.method116(-1);
                    int var85 = class171.field2972.method116(-1);
                    int var86 = class171.field2972.method116(-1);
                    if (var83 >= 0 && var82 >= 0 && var83 < 104 && var82 < 104) {
                        class303 var87 = class105.field1822[class16.field254][var83][var82];
                        if (var87 != null) {
                            for (class277 var88 = (class277) var87.method2078(-125); var88 != null; var88 = (class277) var87.method2080(5)) {
                                class51 var89 = var88.field4764;
                                if ((var84 & 0x7FFF) == var89.field894 && var89.field898 == var85) {
                                    var89.field898 = var86;
                                    break;
                                }
                            }
                            class234.method1672((byte) 101, var83, var82);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 841)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class217.field3720 != null) {
            class130.field2303 = -1;
        }
        field1432++;
    }

    @OriginalMember(owner = "client!pb", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 862)
    public final void focusGained(FocusEvent arg0) {
        field1433++;
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)V", line = 921)
    public static void method559(int arg0) {
        field1424 = null;
        field1425 = null;
        if (arg0 != 64) {
            field1431 = (class229) null;
        }
        field1435 = null;
        field1431 = null;
        field1437 = null;
        field1439 = null;
    }
}
