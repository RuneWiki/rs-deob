import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class5 {

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "I")
    private int field197;

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "I")
    private int field203;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    private int field192;

    @OriginalMember(owner = "client!ad", name = "q", descriptor = "I")
    private int field205;

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "[[I")
    public int[][] field202;

    @OriginalMember(owner = "client!ad", name = "z", descriptor = "Ljava/lang/Object;")
    public static Object field214 = new Object();

    @OriginalMember(owner = "client!ad", name = "B", descriptor = "La;")
    public static class1 field216 = class113.method934(-11538, "Konfig geladen)3");

    @OriginalMember(owner = "client!ad", name = "C", descriptor = "I")
    public static int field217 = 0;

    @OriginalMember(owner = "client!ad", name = "A", descriptor = "I")
    public static int field215 = -1;

    @OriginalMember(owner = "client!ad", name = "G", descriptor = "[B")
    public static byte[] field221 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!ad", name = "I", descriptor = "La;")
    private static class1 field223 = class113.method934(-11538, "Continue");

    @OriginalMember(owner = "client!ad", name = "E", descriptor = "La;")
    public static class1 field219 = field223;

    @OriginalMember(owner = "client!ad", name = "H", descriptor = "La;")
    public static class1 field222 = class113.method934(-11538, "(X");

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    public static int field190;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "I")
    public static int field194;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "I")
    public static int field198;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
    public static int field199;

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!ad", name = "r", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!ad", name = "s", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!ad", name = "t", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!ad", name = "u", descriptor = "I")
    public static int field209;

    @OriginalMember(owner = "client!ad", name = "v", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!ad", name = "w", descriptor = "I")
    public static int field211;

    @OriginalMember(owner = "client!ad", name = "x", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!ad", name = "y", descriptor = "I")
    public static int field213;

    @OriginalMember(owner = "client!ad", name = "F", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "client!ad", name = "J", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!ad", name = "D", descriptor = "Lca;")
    public static class14 field218;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZIII)V", line = 4)
    private final void method108(boolean arg0, int arg1, int arg2, int arg3) {
        field212++;
        if (!arg0) {
            this.field202 = null;
        }
        this.field202[arg1][arg2] = class76.method708(this.field202[arg1][arg2], arg3);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V", line = 20)
    public static final void method109(int arg0) {
        class14.field470 = null;
        field204++;
        class31.field843 = null;
        if (arg0 == 12433) {
            class53.field1400 = null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(III)V", line = 37)
    public final void method110(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field203;
        if (arg1 == 28227) {
            int var5 = arg2 - this.field192;
            this.field202[var5][var4] = class132.method1034(this.field202[var5][var4], 14680063);
            field196++;
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)V", line = 51)
    public final void method111(int arg0) {
        field195++;
        if (arg0 != 16777216) {
            return;
        }
        for (int var2 = 0; var2 < this.field205; var2++) {
            for (int var3 = 0; var3 < this.field197; var3++) {
                if (var2 == 0 || var3 == 0 || this.field205 - 1 == var2 || this.field197 - 1 == var3) {
                    this.field202[var2][var3] = 16777215;
                } else {
                    this.field202[var2][var3] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Z)Z", line = 82)
    public static final boolean method112(boolean arg0) {
        field211++;
        if (class57.field1453 == null) {
            return false;
        }
        try {
            int var1 = class57.field1453.method1023(-122);
            if (var1 == 0) {
                return false;
            }
            if (class112.field2764 == -1) {
                class57.field1453.method1017(0, 1, -127, class15.field489.field285);
                class15.field489.field268 = 0;
                var1--;
                class112.field2764 = class15.field489.method410((byte) 49);
                class100.field2550 = class50.field1355[class112.field2764];
            }
            if (class100.field2550 == -1) {
                if (var1 <= 0) {
                    return false;
                }
                class57.field1453.method1017(0, 1, -127, class15.field489.field285);
                class100.field2550 = class15.field489.field285[0] & 0xFF;
                var1--;
            }
            if (class100.field2550 == -2) {
                if (var1 <= 1) {
                    return false;
                }
                var1 -= 2;
                class57.field1453.method1017(0, 2, -127, class15.field489.field285);
                class15.field489.field268 = 0;
                class100.field2550 = class15.field489.method146(65280);
            }
            if (class100.field2550 > var1) {
                return false;
            }
            class15.field489.field268 = 0;
            class57.field1453.method1017(0, class100.field2550, -128, class15.field489.field285);
            class99.field2437 = class15.field499;
            class75.field1858 = 0;
            class15.field499 = class1.field36;
            class1.field36 = class112.field2764;
            if (class112.field2764 == 71) {
                long var2 = class15.field489.method175(1362367312);
                class1 var4 = class107.method896(82, class15.field489).method4(-16315);
                class89.method761(70, 6, var4, class118.method972(-42, var2).method36(-4305));
                class112.field2764 = -1;
                return true;
            }
            if (class112.field2764 == 156) {
                long var5 = class15.field489.method175(1362367312);
                int var7 = class15.field489.method146(65280);
                class1 var8 = class118.method972(-64, var5).method36(-4305);
                for (int var9 = 0; var9 < class59.field1495; var9++) {
                    if (class117.field2932[var9] == var5) {
                        if (class73.field1791[var9] != var7) {
                            class73.field1791[var9] = var7;
                            class39.field1056 = true;
                            if (var7 > 0) {
                                class89.method761(127, 5, class116.method959(124, new class1[] { var8, class85.field2129 }), class132.field3237);
                            }
                            if (var7 == 0) {
                                class89.method761(101, 5, class116.method959(85, new class1[] { var8, class60.field1513 }), class132.field3237);
                            }
                        }
                        var8 = null;
                        break;
                    }
                }
                boolean var10 = false;
                if (var8 != null && class59.field1495 < 200) {
                    class117.field2932[class59.field1495] = var5;
                    class119.field2954[class59.field1495] = var8;
                    class73.field1791[class59.field1495] = var7;
                    class59.field1495++;
                    class39.field1056 = true;
                }
                while (!var10) {
                    var10 = true;
                    for (int var11 = 0; var11 < class59.field1495 - 1; var11++) {
                        if (class73.field1791[var11] != class24.field724 && class73.field1791[var11 + 1] == class24.field724 || class73.field1791[var11] == 0 && class73.field1791[var11 + 1] != 0) {
                            var10 = false;
                            int var12 = class73.field1791[var11];
                            class73.field1791[var11] = class73.field1791[var11 + 1];
                            class73.field1791[var11 + 1] = var12;
                            class1 var13 = class119.field2954[var11];
                            class119.field2954[var11] = class119.field2954[var11 + 1];
                            class119.field2954[var11 + 1] = var13;
                            long var14 = class117.field2932[var11];
                            class117.field2932[var11] = class117.field2932[var11 + 1];
                            class117.field2932[var11 + 1] = var14;
                            class39.field1056 = true;
                        }
                    }
                }
                class112.field2764 = -1;
                return true;
            }
            if (class112.field2764 == 233) {
                class112.field2764 = -1;
                class35.field942 = 0;
                return true;
            }
            if (class112.field2764 == 7) {
                class81.field2046 = false;
                for (int var16 = 0; var16 < 5; var16++) {
                    class19.field633[var16] = false;
                }
                class112.field2764 = -1;
                return true;
            }
            if (class112.field2764 == 23) {
                class52.method527(true, 5688);
                class112.field2764 = -1;
                return true;
            }
            if (class112.field2764 == 222) {
                byte var17 = class15.field489.method169(128);
                int var18 = class15.field489.method138((byte) 119);
                class8.field305[var18] = var17;
                if (class113.field2806[var18] != var17) {
                    class113.field2806[var18] = var17;
                    class45.method478(-1, var18);
                    class39.field1056 = true;
                    if (class98.field2424 != -1) {
                        class105.field2640 = true;
                    }
                }
                class112.field2764 = -1;
                return true;
            }
            if (class112.field2764 == 115) {
                boolean var19 = class15.field489.method145(false) == 1;
                int var20 = class15.field489.method147(-123);
                class100 var21 = class134.method1056(var20, (byte) -92);
                var21.field2559 = var19;
                class112.field2764 = -1;
                return true;
            }
            if (class112.field2764 == 12) {
                class39.field1056 = true;
                int var22 = class15.field489.method168(-4750);
                class100 var23 = class134.method1056(var22, (byte) -128);
                if (var23.field2445) {
                    class100[] var25 = class117.field2925[var22 >> 16];
                    for (int var26 = 0; var26 < var25.length; var26++) {
                        class100 var27 = var25[var26];
                        if ((var23.field2498 & 0xFFFF) == (var27.field2457 & 0xFFFF) && var27.field2545 > 0) {
                            var27.field2543 = 0;
                            var27.field2527 = -1;
                        }
                    }
                } else {
                    for (int var24 = 0; var24 < var23.field2494.length; var24++) {
                        var23.field2494[var24] = 0;
                        var23.field2519[var24] = 0;
                    }
                }
                int var28 = class15.field489.method146(65280);
                for (int var29 = 0; var29 < var28; var29++) {
                    int var30 = class15.field489.method153(255);
                    if (var30 == 255) {
                        var30 = class15.field489.method168(-4750);
                    }
                    int var31 = class15.field489.method138((byte) 58);
                    if (var23.field2445) {
                        class100[] var32 = class117.field2925[var22 >> 16];
                        for (int var33 = 0; var33 < var32.length; var33++) {
                            class100 var34 = var32[var33];
                            if ((var23.field2498 & 0xFFFF) == (var34.field2457 & 0xFFFF) && var29 + 1 == var34.field2545) {
                                var34.field2543 = var30;
                                var34.field2527 = var31 - 1;
                            }
                        }
                    } else if (var23.field2494.length > var29) {
                        var23.field2494[var29] = var31;
                        var23.field2519[var29] = var30;
                    }
                }
                class112.field2764 = -1;
                return true;
            }
            if (class112.field2764 == 250) {
                int var35 = class15.field489.method167((byte) -70);
                int var36 = class15.field489.method147(-121);
                class100 var37 = class134.method1056(var36, (byte) -87);
                var37.field2482 = var35;
                var37.field2496 = 1;
                class112.field2764 = -1;
                return true;
            }
            if (class112.field2764 == 255) {
                int var38 = class15.field489.method145(arg0);
                int var39 = class15.field489.method145(false);
                int var40 = class15.field489.method145(false);
                int var41 = class15.field489.method145(false);
                class19.field633[var38] = true;
                class14.field472[var38] = var39;
                class64.field1602[var38] = var40;
                class113.field2785[var38] = var41;
                class38.field1020[var38] = 0;
                class112.field2764 = -1;
                return true;
            }
            if (arg0) {
                field224 = -96;
            }
            if (class112.field2764 == 235) {
                class63.field1590 = class15.field489.method145(false);
                class112.field2764 = -1;
                return true;
            }
            if (class112.field2764 == 48) {
                class57.field1473 = class15.field489.method145(false);
                class112.field2764 = -1;
                return true;
            }
            if (class112.field2764 == 82) {
                class1 var42 = class15.field489.method141(-10721);
                if (var42.method38(103, class47.field1231)) {
                    class1 var54 = var42.method19(0, 0, var42.method11(class86.field2168, 32));
                    long var55 = var54.method9((byte) 98);
                    boolean var57 = false;
                    for (int var58 = 0; var58 < class85.field2149; var58++) {
                        if (class106.field2686[var58] == var55) {
                            var57 = true;
                            break;
                        }
                    }
                    if (!var57 && class6.field234 == 0) {
                        class89.method761(94, 4, class6.field232, var54);
                    }
                } else if (var42.method38(104, class46.field1193)) {
                    class1 var49 = var42.method19(0, 0, var42.method11(class86.field2168, 32));
                    long var50 = var49.method9((byte) 120);
                    boolean var52 = false;
                    for (int var53 = 0; var53 < class85.field2149; var53++) {
                        if (class106.field2686[var53] == var50) {
                            var52 = true;
                            break;
                        }
                    }
                    if (!var52 && class6.field234 == 0) {
                        class89.method761(120, 8, class121.field3011, var49);
                    }
                } else if (var42.method38(81, class82.field2088)) {
                    class1 var43 = var42.method19(0, 0, var42.method11(class86.field2168, 32));
                    long var44 = var43.method9((byte) 121);
                    boolean var46 = false;
                    for (int var47 = 0; var47 < class85.field2149; var47++) {
                        if (class106.field2686[var47] == var44) {
                            var46 = true;
                            break;
                        }
                    }
                    if (!var46 && class6.field234 == 0) {
                        class1 var48 = var42.method19(0, var42.method11(class86.field2168, 32) + 1, var42.method10(-3136) + -9);
                        class89.method761(122, 8, var48, var43);
                    }
                } else {
                    class89.method761(72, 0, var42, class132.field3237);
                }
                class112.field2764 = -1;
                return true;
            }
            if (class112.field2764 == 182) {
                int var59 = class15.field489.method146(65280);
                int var60 = class15.field489.method162((byte) -48);
                class100 var61 = class134.method1056(var60, (byte) -61);
                class112.field2764 = -1;
                if (var61 != null && var61.field2492 == 0) {
                    if (var59 < 0) {
                        var59 = 0;
                    }
                    if (var61.field2529 - var61.field2452 < var59) {
                        var59 = var61.field2529 - var61.field2452;
                    }
                    var61.field2540 = var59;
                }
                return true;
            }
            if (class112.field2764 == 174) {
                int var62 = class15.field489.method147(-128);
                class100 var63 = class134.method1056(var62, (byte) -115);
                if (var63.field2445) {
                    class100[] var64 = class117.field2925[var62 >> 16];
                    for (int var65 = 0; var65 < var64.length; var65++) {
                        class100 var66 = var64[var65];
                        if ((var63.field2498 & 0xFFFF) == (var66.field2457 & 0xFFFF) && var66.field2545 > 0) {
                            var66.field2527 = -1;
                            var66.field2543 = 0;
                        }
                    }
                } else {
                    for (int var67 = 0; var67 < var63.field2494.length; var67++) {
                        var63.field2494[var67] = -1;
                        var63.field2494[var67] = 0;
                    }
                }
                class112.field2764 = -1;
                return true;
            }
            if (class112.field2764 == 130) {
                class74.field1847 = class15.field489.method167((byte) -70);
                class112.field2764 = -1;
                return true;
            }
            if (class112.field2764 == 129) {
                int var68 = class15.field489.method148((byte) 31);
                int var69 = class15.field489.method153(255);
                int var70 = class15.field489.method148((byte) 114);
                class2.field76 = var68 >> 1;
                class104.field2624.method732(var70, -7717, (var68 & 0x1) == 1, var69);
                class112.field2764 = -1;
                return true;
            }
            if (class112.field2764 == 181) {
                class98.method850(-7225);
                class112.field2764 = -1;
                return false;
            }
            if (class112.field2764 == 24) {
                int var71 = class15.field489.method140((byte) -118);
                int var72 = class15.field489.method168(-4750);
                class100 var73 = class134.method1056(var72, (byte) -82);
                if (var73.field2468 != var71 || var71 == -1) {
                    var73.field2469 = 0;
                    var73.field2463 = 0;
                    var73.field2468 = var71;
                }
                class112.field2764 = -1;
                return true;
            }
            if (class112.field2764 == 56) {
                int var74 = class15.field489.method137(-23843);
                if (var74 >= 0) {
                    class85.method749((byte) -121, var74);
                }
                if (class113.field2803 != var74) {
                    class108.method898(class113.field2803, -14222);
                    class113.field2803 = var74;
                }
                class112.field2764 = -1;
                return true;
            }
            if (class112.field2764 == 117) {
                int var75 = class15.field489.method146(65280);
                int var76 = class15.field489.method181(false);
                int var77 = class15.field489.method162((byte) -48);
                class100 var78 = class134.method1056(var77, (byte) -100);
                class112.field2764 = -1;
                var78.field2531 = (var75 << 16) + var76;
                return true;
            }
            if (class112.field2764 == 84) {
                int var79 = class15.field489.method146(65280);
                int var80 = class15.field489.method181(arg0);
                if (class86.field2169 != -1) {
                    class108.method898(class86.field2169, -14222);
                    class105.field2640 = true;
                    class86.field2169 = -1;
                }
                if (class42.field1144 != -1) {
                    class108.method898(class42.field1144, -14222);
                    class42.field1144 = -1;
                    class34.method400(30, 91);
                }
                if (class76.field1884 != -1) {
                    class108.method898(class76.field1884, -14222);
                    class76.field1884 = -1;
                }
                if (class132.field3230 != var80) {
                    class108.method898(class132.field3230, -14222);
                    class132.field3230 = var80;
                }
                if (class66.field1651 != var79) {
                    class108.method898(class66.field1651, -14222);
                    class66.field1651 = var79;
                }
                class120.field3001 = -1;
                if (class114.field2814 != 0) {
                    class105.field2640 = true;
                    class114.field2814 = 0;
                }
                class39.field1056 = true;
                class95.field2367 = true;
                class112.field2764 = -1;
                return true;
            }
            if (class112.field2764 == 64) {
                class34.field894 = class15.field489.method145(false);
                class57.field1474 = class15.field489.method153(255);
                for (int var81 = class57.field1474; var81 < class57.field1474 + 8; var81++) {
                    for (int var82 = class34.field894; var82 < class34.field894 + 8; var82++) {
                        if (class17.field553[class2.field76][var81][var82] != null) {
                            class17.field553[class2.field76][var81][var82] = null;
                            class127.method1014((byte) -80, var82, var81);
                        }
                    }
                }
                for (class22 var83 = (class22) class92.field2287.method805((byte) -90); var83 != null; var83 = (class22) class92.field2287.method812(-4)) {
                    if (var83.field701 >= class57.field1474 && class57.field1474 + 8 > var83.field701 && var83.field700 >= class34.field894 && class34.field894 + 8 > var83.field700 && class2.field76 == var83.field680) {
                        var83.field693 = 0;
                    }
                }
                class112.field2764 = -1;
                return true;
            }
            if (class112.field2764 == 223) {
                class1 var84 = class15.field489.method141(-10721);
                int var85 = class15.field489.method157((byte) -70);
                int var86 = class15.field489.method145(arg0);
                if (var86 >= 1 && var86 <= 5) {
                    if (var84.method14(class64.field1634, !arg0)) {
                        var84 = null;
                    }
                    client.field600[var86 - 1] = var84;
                    class24.field736[var86 - 1] = var85 == 0;
                }
                class112.field2764 = -1;
                return true;
            }
            if (class112.field2764 == 118) {
                int var87 = class15.field489.method146(65280);
                class85.method749((byte) -127, var87);
                if (class66.field1651 != -1) {
                    class108.method898(class66.field1651, -14222);
                    class95.field2367 = true;
                    class66.field1651 = -1;
                    class39.field1056 = true;
                }
                if (class86.field2169 != -1) {
                    class108.method898(class86.field2169, -14222);
                    class105.field2640 = true;
                    class86.field2169 = -1;
                }
                if (class42.field1144 != -1) {
                    class108.method898(class42.field1144, -14222);
                    class42.field1144 = -1;
                    class34.method400(30, -117);
                }
                if (class76.field1884 != -1) {
                    class108.method898(class76.field1884, -14222);
                    class76.field1884 = -1;
                }
                if (class132.field3230 != var87) {
                    class108.method898(class132.field3230, -14222);
                    class132.field3230 = var87;
                }
                class120.field3001 = -1;
                if (class114.field2814 != 0) {
                    class105.field2640 = true;
                    class114.field2814 = 0;
                }
                class129.method1021(class132.field3230, 2);
                class112.field2764 = -1;
                return true;
            }
            if (class112.field2764 == 18) {
                if (class9.field331 == 12) {
                    class39.field1056 = true;
                }
                class119.field2965 = class15.field489.method145(false);
                class112.field2764 = -1;
                return true;
            }
            if (class112.field2764 == 253) {
                class81.field2046 = true;
                class45.field1189 = class15.field489.method145(false);
                class70.field1749 = class15.field489.method145(arg0);
                class9.field317 = class15.field489.method146(65280);
                class6.field240 = class15.field489.method145(false);
                class117.field2921 = class15.field489.method145(false);
                if (class117.field2921 >= 100) {
                    class46.field1202 = class70.field1749 * 128 + 64;
                    class23.field710 = class45.field1189 * 128 + 64;
                    class70.field1751 = class78.method715((byte) -125, class2.field76, class23.field710, class46.field1202) - class9.field317;
                }
                class112.field2764 = -1;
                return true;
            }
            if (class112.field2764 == 185) {
                int var88 = class15.field489.method137(-23843);
                if (class98.field2424 != var88) {
                    class108.method898(class98.field2424, -14222);
                    class98.field2424 = var88;
                }
                class112.field2764 = -1;
                class105.field2640 = true;
                return true;
            }
            if (class112.field2764 == 195) {
                int var89 = class15.field489.method138((byte) 96);
                int var90 = class15.field489.method146(65280);
                class85.method749((byte) -120, var90);
                if (var89 != -1) {
                    class85.method749((byte) -124, var89);
                }
                if (class132.field3230 != -1) {
                    class108.method898(class132.field3230, -14222);
                    class132.field3230 = -1;
                }
                if (class66.field1651 != -1) {
                    class108.method898(class66.field1651, -14222);
                    class66.field1651 = -1;
                }
                if (class86.field2169 != -1) {
                    class108.method898(class86.field2169, -14222);
                    class86.field2169 = -1;
                }
                if (class42.field1144 != var90) {
                    class108.method898(class42.field1144, -14222);
                    class42.field1144 = var90;
                    class34.method400(35, -57);
                }
                if (class76.field1884 != var90) {
                    class108.method898(class76.field1884, -14222);
                    class76.field1884 = var89;
                }
                class120.field3001 = -1;
                class114.field2814 = 0;
                class112.field2764 = -1;
                return true;
            }
            if (class112.field2764 == 180) {
                if (class66.field1651 != -1) {
                    class108.method898(class66.field1651, -14222);
                    class39.field1056 = true;
                    class95.field2367 = true;
                    class66.field1651 = -1;
                }
                if (class86.field2169 != -1) {
                    class108.method898(class86.field2169, -14222);
                    class105.field2640 = true;
                    class86.field2169 = -1;
                }
                if (class42.field1144 != -1) {
                    class108.method898(class42.field1144, -14222);
                    class42.field1144 = -1;
                    class34.method400(30, -84);
                }
                if (class76.field1884 != -1) {
                    class108.method898(class76.field1884, -14222);
                    class76.field1884 = -1;
                }
                if (class132.field3230 != -1) {
                    class108.method898(class132.field3230, -14222);
                    class132.field3230 = -1;
                }
                class112.field2764 = -1;
                class120.field3001 = -1;
                if (class114.field2814 != 0) {
                    class105.field2640 = true;
                    class114.field2814 = 0;
                }
                return true;
            }
            if (class112.field2764 == 208) {
                int var91 = class15.field489.method138((byte) 94);
                class85.method749((byte) -119, var91);
                if (class66.field1651 != -1) {
                    class108.method898(class66.field1651, -14222);
                    class95.field2367 = true;
                    class66.field1651 = -1;
                    class39.field1056 = true;
                }
                if (class42.field1144 != -1) {
                    class108.method898(class42.field1144, -14222);
                    class42.field1144 = -1;
                    class34.method400(30, -53);
                }
                if (class76.field1884 != -1) {
                    class108.method898(class76.field1884, -14222);
                    class76.field1884 = -1;
                }
                if (class132.field3230 != -1) {
                    class108.method898(class132.field3230, -14222);
                    class132.field3230 = -1;
                }
                if (class86.field2169 != var91) {
                    class108.method898(class86.field2169, -14222);
                    class86.field2169 = var91;
                }
                class105.field2640 = true;
                class112.field2764 = -1;
                class120.field3001 = -1;
                return true;
            }
            if (class112.field2764 == 217) {
                int var92 = class15.field489.method167((byte) -70);
                if (var92 == 65535) {
                    var92 = -1;
                }
                class103.method877(257, var92);
                class112.field2764 = -1;
                return true;
            }
            if (class112.field2764 == 40) {
                int var93 = class15.field489.method165(true);
                int var94 = class15.field489.method138((byte) 58);
                if (var94 == 65535) {
                    var94 = -1;
                }
                class112.method931(var93, (byte) 110, var94);
                class112.field2764 = -1;
                return true;
            }
            if (class112.field2764 == 254) {
                class34.field894 = class15.field489.method157((byte) -70);
                class57.field1474 = class15.field489.method148((byte) -67);
                class112.field2764 = -1;
                return true;
            }
            if (class112.field2764 == 88) {
                class103.field2610 = class15.field489.method153(255);
                if (class9.field331 == class103.field2610) {
                    if (class103.field2610 == 3) {
                        class9.field331 = 1;
                    } else {
                        class9.field331 = 3;
                    }
                    class39.field1056 = true;
                }
                class112.field2764 = -1;
                return true;
            }
            if (class112.field2764 == 63) {
                class57.field1474 = class15.field489.method148((byte) -87);
                class34.field894 = class15.field489.method157((byte) -70);
                while (class15.field489.field268 < class100.field2550) {
                    class112.field2764 = class15.field489.method145(false);
                    class106.method889((byte) -125);
                }
                class112.field2764 = -1;
                return true;
            }
            if (class112.field2764 == 196) {
                class75.field1867 = class15.field489.method145(false);
                class6.field237 = class15.field489.method145(false);
                class115.field2831 = class15.field489.method145(arg0);
                class105.field2640 = true;
                class15.field505 = true;
                class112.field2764 = -1;
                return true;
            }
            if (class112.field2764 == 116) {
                class114.field2816 = class15.field489.method167((byte) -70) * 30;
                class112.field2764 = -1;
                return true;
            }
            if (class112.field2764 == 92) {
                class63.method603((byte) 57);
                class112.field2764 = -1;
                return true;
            }
            if (class112.field2764 == 2) {
                int var95 = class15.field489.method147(-121);
                int var96 = class15.field489.method146(65280);
                class8.field305[var96] = var95;
                if (class113.field2806[var96] != var95) {
                    class113.field2806[var96] = var95;
                    class45.method478(-1, var96);
                    if (class98.field2424 != -1) {
                        class105.field2640 = true;
                    }
                    class39.field1056 = true;
                }
                class112.field2764 = -1;
                return true;
            }
            if (class112.field2764 == 128) {
                class54.method535(89);
                class112.field2764 = -1;
                return true;
            }
            if (class112.field2764 == 131) {
                int var97 = class15.field489.method146(65280);
                int var98 = class15.field489.method145(false);
                int var99 = class15.field489.method146(65280);
                class106.method890(var97, (byte) 118, var98, var99);
                class112.field2764 = -1;
                return true;
            }
            if (class112.field2764 == 237) {
                int var100 = class15.field489.method146(65280);
                class85.method749((byte) 107, var100);
                if (class86.field2169 != -1) {
                    class108.method898(class86.field2169, -14222);
                    class86.field2169 = -1;
                    class105.field2640 = true;
                }
                if (class42.field1144 != -1) {
                    class108.method898(class42.field1144, -14222);
                    class42.field1144 = -1;
                    class34.method400(30, 81);
                }
                if (class76.field1884 != -1) {
                    class108.method898(class76.field1884, -14222);
                    class76.field1884 = -1;
                }
                if (class132.field3230 != -1) {
                    class108.method898(class132.field3230, -14222);
                    class132.field3230 = -1;
                }
                if (class66.field1651 != var100) {
                    class108.method898(class66.field1651, -14222);
                    class66.field1651 = var100;
                }
                class95.field2367 = true;
                if (class114.field2814 != 0) {
                    class105.field2640 = true;
                    class114.field2814 = 0;
                }
                class120.field3001 = -1;
                class112.field2764 = -1;
                class39.field1056 = true;
                return true;
            }
            if (class112.field2764 == 234) {
                class81.field2046 = true;
                class48.field1272 = class15.field489.method145(false);
                class76.field1898 = class15.field489.method145(false);
                class79.field1943 = class15.field489.method146(65280);
                class118.field2948 = class15.field489.method145(arg0);
                class38.field1030 = class15.field489.method145(false);
                if (class38.field1030 >= 100) {
                    int var101 = class48.field1272 * 128 + 64;
                    int var102 = class76.field1898 * 128 + 64;
                    int var103 = class78.method715((byte) -120, class2.field76, var101, var102) - class79.field1943;
                    int var104 = var101 - class23.field710;
                    int var105 = var102 - class46.field1202;
                    int var106 = var103 - class70.field1751;
                    int var107 = (int) Math.sqrt((double) (var104 * var104 + var105 * var105));
                    class53.field1403 = (int) (Math.atan2((double) var106, (double) var107) * 325.949D) & 0x7FF;
                    class4.field185 = (int) (Math.atan2((double) var104, (double) var105) * -325.949D) & 0x7FF;
                    if (class53.field1403 < 128) {
                        class53.field1403 = 128;
                    }
                    if (class53.field1403 > 383) {
                        class53.field1403 = 383;
                    }
                }
                class112.field2764 = -1;
                return true;
            }
            if (class112.field2764 == 142) {
                int var108 = class15.field489.method146(65280);
                int var109 = class15.field489.method167((byte) -70);
                int var110 = class15.field489.method146(65280);
                int var111 = class15.field489.method162((byte) -48);
                class100 var112 = class134.method1056(var111, (byte) -86);
                class112.field2764 = -1;
                var112.field2466 = var108;
                var112.field2537 = var109;
                var112.field2499 = var110;
                return true;
            }
            if (class112.field2764 == 6) {
                class9.field331 = class15.field489.method145(false);
                class95.field2367 = true;
                class39.field1056 = true;
                class112.field2764 = -1;
                return true;
            }
            if (class112.field2764 == 171) {
                if (class9.field331 == 12) {
                    class39.field1056 = true;
                }
                class105.field2641 = class15.field489.method140((byte) -108);
                class112.field2764 = -1;
                return true;
            }
            if (class112.field2764 == 9 || class112.field2764 == 99 || class112.field2764 == 229 || class112.field2764 == 19 || class112.field2764 == 202 || class112.field2764 == 1 || class112.field2764 == 74 || class112.field2764 == 175 || class112.field2764 == 49 || class112.field2764 == 143 || class112.field2764 == 241) {
                class106.method889((byte) -112);
                class112.field2764 = -1;
                return true;
            }
            if (class112.field2764 == 14) {
                for (int var113 = 0; var113 < class117.field2918; var113++) {
                    class97 var114 = class130.method1026((byte) -114, var113);
                    if (var114 != null && var114.field2407 == 0) {
                        class8.field305[var113] = 0;
                        class113.field2806[var113] = 0;
                    }
                }
                if (class98.field2424 != -1) {
                    class105.field2640 = true;
                }
                class39.field1056 = true;
                class112.field2764 = -1;
                return true;
            }
            if (class112.field2764 == 160) {
                int var115 = class15.field489.method167((byte) -70);
                int var116 = class15.field489.method162((byte) -48);
                class100 var117 = class134.method1056(var116, (byte) -67);
                var117.field2496 = 2;
                class112.field2764 = -1;
                var117.field2482 = var115;
                return true;
            }
            if (class112.field2764 == 132) {
                if (class86.field2169 != -1) {
                    class108.method898(class86.field2169, -14222);
                    class86.field2169 = -1;
                }
                class112.field2764 = -1;
                class132.field3213 = class132.field3237;
                class114.field2814 = 1;
                class105.field2640 = true;
                class37.field1002 = false;
                return true;
            }
            if (class112.field2764 == 186) {
                class2.field97 = class15.field489.method145(false);
                if (class2.field97 == 1) {
                    class132.field3215 = class15.field489.method146(65280);
                }
                if (class2.field97 >= 2 && class2.field97 <= 6) {
                    if (class2.field97 == 2) {
                        class75.field1860 = 64;
                        class102.field2575 = 64;
                    }
                    if (class2.field97 == 3) {
                        class75.field1860 = 64;
                        class102.field2575 = 0;
                    }
                    if (class2.field97 == 4) {
                        class75.field1860 = 64;
                        class102.field2575 = 128;
                    }
                    if (class2.field97 == 5) {
                        class102.field2575 = 64;
                        class75.field1860 = 0;
                    }
                    if (class2.field97 == 6) {
                        class102.field2575 = 64;
                        class75.field1860 = 128;
                    }
                    class2.field97 = 2;
                    class134.field3307 = class15.field489.method146(65280);
                    class6.field227 = class15.field489.method146(65280);
                    class42.field1115 = class15.field489.method145(false);
                }
                if (class2.field97 == 10) {
                    class134.field3293 = class15.field489.method146(65280);
                }
                class112.field2764 = -1;
                return true;
            }
            if (class112.field2764 == 210) {
                int var118 = class15.field489.method162((byte) -48);
                class100 var119 = class134.method1056(var118, (byte) -107);
                var119.field2496 = 3;
                var119.field2482 = class104.field2624.field91.method637(-20874);
                class112.field2764 = -1;
                return true;
            }
            if (class112.field2764 == 110) {
                int var120 = class15.field489.method162((byte) -48);
                class1 var121 = class15.field489.method141(-10721);
                class100 var122 = class134.method1056(var120, (byte) -73);
                var122.field2477 = var121;
                if (var120 >> 16 == class97.field2400[class9.field331]) {
                    class39.field1056 = true;
                }
                class112.field2764 = -1;
                return true;
            }
            if (class112.field2764 == 70) {
                class23.field702 = class15.field489.method145(false);
                class39.field1056 = true;
                class112.field2764 = -1;
                return true;
            }
            if (class112.field2764 == 120) {
                int var123 = class15.field489.method146(65280);
                int var124 = class15.field489.method167((byte) -70);
                int var125 = class15.field489.method162((byte) -48);
                if (var124 == 65535) {
                    var124 = -1;
                }
                class100 var126 = class134.method1056(var125, (byte) -102);
                if (var126.field2445) {
                    var126.field2543 = 1;
                    var126.field2527 = var124;
                } else if (var124 == -1) {
                    class112.field2764 = -1;
                    var126.field2496 = 0;
                    return true;
                } else {
                    class115 var127 = class89.method763(var124, 10);
                    var126.field2499 = var127.field2878;
                    var126.field2482 = var124;
                    var126.field2496 = 4;
                    var126.field2537 = var127.field2851 * 100 / var123;
                    var126.field2466 = var127.field2864;
                }
                class112.field2764 = -1;
                return true;
            }
            if (class112.field2764 == 51) {
                long var128 = class15.field489.method175(1362367312);
                long var130 = (long) class15.field489.method146(65280);
                long var132 = (long) class15.field489.method165(true);
                int var134 = class15.field489.method145(false);
                boolean var135 = false;
                long var136 = (var130 << 32) + var132;
                for (int var138 = 0; var138 < 100; var138++) {
                    if (class104.field2621[var138] == var136) {
                        var135 = true;
                        break;
                    }
                }
                if (var134 <= 1) {
                    for (int var139 = 0; var139 < class85.field2149; var139++) {
                        if (class106.field2686[var139] == var128) {
                            var135 = true;
                            break;
                        }
                    }
                }
                if (!var135 && class6.field234 == 0) {
                    class104.field2621[class22.field683] = var136;
                    class22.field683 = (class22.field683 + 1) % 100;
                    class1 var140 = class107.method896(67, class15.field489).method4(-16315);
                    if (var134 == 2 || var134 == 3) {
                        class89.method761(99, 7, var140, class116.method959(88, new class1[] { class100.field2538, class118.method972(-73, var128).method36(-4305) }));
                    } else if (var134 == 1) {
                        class89.method761(97, 7, var140, class116.method959(126, new class1[] { class103.field2615, class118.method972(-46, var128).method36(-4305) }));
                    } else {
                        class89.method761(72, 3, var140, class118.method972(-55, var128).method36(-4305));
                    }
                }
                class112.field2764 = -1;
                return true;
            }
            if (class112.field2764 == 27) {
                for (int var141 = 0; var141 < class80.field2033.length; var141++) {
                    if (class80.field2033[var141] != null) {
                        class80.field2033[var141].field2018 = -1;
                    }
                }
                for (int var142 = 0; var142 < class120.field2995.length; var142++) {
                    if (class120.field2995[var142] != null) {
                        class120.field2995[var142].field2018 = -1;
                    }
                }
                class112.field2764 = -1;
                return true;
            }
            if (class112.field2764 == 140) {
                int var143 = class15.field489.method146(65280);
                int var144 = class15.field489.method145(false);
                if (var143 == 65535) {
                    var143 = -1;
                }
                if (class97.field2400[var144] != var143) {
                    class108.method898(class97.field2400[var144], -14222);
                    class97.field2400[var144] = var143;
                }
                class95.field2367 = true;
                class112.field2764 = -1;
                class39.field1056 = true;
                return true;
            }
            if (class112.field2764 == 34) {
                class39.field1056 = true;
                int var145 = class15.field489.method153(255);
                int var146 = class15.field489.method145(false);
                int var147 = class15.field489.method147(-115);
                class59.field1486[var146] = var147;
                class24.field725[var146] = var145;
                class17.field550[var146] = 1;
                for (int var148 = 0; var148 < 98; var148++) {
                    if (class60.field1517[var148] <= var147) {
                        class17.field550[var146] = var148 + 2;
                    }
                }
                class112.field2764 = -1;
                return true;
            }
            if (class112.field2764 == 3) {
                int var149 = class15.field489.method168(-4750);
                int var150 = class15.field489.method161((byte) 94);
                int var151 = class15.field489.method161((byte) 123);
                class100 var152 = class134.method1056(var149, (byte) -86);
                var152.field2465 = var152.field2458 + var151;
                class112.field2764 = -1;
                var152.field2505 = var152.field2552 + var150;
                return true;
            }
            if (class112.field2764 == 72) {
                for (int var153 = 0; var153 < class113.field2806.length; var153++) {
                    if (class8.field305[var153] != class113.field2806[var153]) {
                        class113.field2806[var153] = class8.field305[var153];
                        class45.method478(-1, var153);
                        class39.field1056 = true;
                    }
                }
                class112.field2764 = -1;
                return true;
            }
            if (class112.field2764 == 240) {
                class42.method461(class39.field1072, (byte) -98, class15.field489, class100.field2550);
                class112.field2764 = -1;
                return true;
            }
            if (class112.field2764 == 58) {
                int var154 = class15.field489.method184(-64);
                class23.field716 = class39.field1072.method658(11545, var154);
                class112.field2764 = -1;
                return true;
            }
            if (class112.field2764 == 214) {
                class39.field1056 = true;
                int var155 = class15.field489.method168(-4750);
                class100 var156 = class134.method1056(var155, (byte) -112);
                while (true) {
                    while (class100.field2550 > class15.field489.field268) {
                        int var157 = class15.field489.method179((byte) -102);
                        int var158 = class15.field489.method146(65280);
                        int var159 = 0;
                        if (var158 != 0) {
                            var159 = class15.field489.method145(false);
                            if (var159 == 255) {
                                var159 = class15.field489.method168(-4750);
                            }
                        }
                        if (var156.field2445) {
                            class100[] var160 = class117.field2925[var155 >> 16];
                            for (int var161 = 0; var161 < var160.length; var161++) {
                                class100 var162 = var160[var161];
                                if ((var156.field2498 & 0xFFFF) == (var162.field2457 & 0xFFFF) && var157 + 1 == var162.field2545) {
                                    var162.field2543 = var159;
                                    var162.field2527 = var158 - 1;
                                }
                            }
                        } else if (var157 >= 0 && var156.field2494.length > var157) {
                            var156.field2494[var157] = var158;
                            var156.field2519[var157] = var159;
                        }
                    }
                    class112.field2764 = -1;
                    return true;
                }
            }
            if (class112.field2764 == 166) {
                class52.method527(false, 5688);
                class112.field2764 = -1;
                return true;
            }
            if (class112.field2764 == 231) {
                int var163 = class15.field489.method138((byte) 108);
                int var164 = class15.field489.method162((byte) -48);
                int var165 = var163 >> 10 & 0x1F;
                int var166 = var163 >> 5 & 0x1F;
                class100 var167 = class134.method1056(var164, (byte) -103);
                class112.field2764 = -1;
                int var168 = var163 & 0x1F;
                var167.field2456 = (var168 << 3) + (var165 << 19) + (var166 << 11);
                return true;
            }
            if (class112.field2764 == 211) {
                class85.field2149 = class100.field2550 / 8;
                for (int var169 = 0; var169 < class85.field2149; var169++) {
                    class106.field2686[var169] = class15.field489.method175(1362367312);
                }
                class112.field2764 = -1;
                return true;
            }
            if (class112.field2764 == 124) {
                if (class86.field2169 != -1) {
                    class108.method898(class86.field2169, -14222);
                    class86.field2169 = -1;
                }
                class105.field2640 = true;
                class132.field3213 = class132.field3237;
                class114.field2814 = 2;
                class112.field2764 = -1;
                class37.field1002 = false;
                return true;
            }
            class11.method215("T1 - " + class112.field2764 + "," + class15.field499 + "," + class99.field2437 + " - " + class100.field2550, (byte) -121, null);
            class98.method850(-7225);
        } catch (IOException var173) {
            class117.method963(2578);
        } catch (Exception var174) {
            String var171 = "T2 - " + class112.field2764 + "," + class15.field499 + "," + class99.field2437 + " - " + class100.field2550 + "," + (class104.field2624.field1965[0] + class28.field807) + "," + (class104.field2624.field2012[0] + class53.field1411) + " - ";
            for (int var172 = 0; class100.field2550 > var172 && var172 < 50; var172++) {
                var171 = var171 + class15.field489.field285[var172] + ",";
            }
            class11.method215(var171, (byte) -120, var174);
            class98.method850(-7225);
        }
        return true;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIZII)V", line = 1925)
    public final void method113(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field207++;
        int var7 = arg4 - this.field203;
        if (arg0 != -4) {
            field217 = 110;
        }
        int var8 = arg1 - this.field192;
        if (arg5 == 0) {
            if (arg2 == 0) {
                this.method121(var7, 128, var8, (byte) 124);
                this.method121(var7, 8, var8 - 1, (byte) 124);
            }
            if (arg2 == 1) {
                this.method121(var7, 2, var8, (byte) 124);
                this.method121(var7 + 1, 32, var8, (byte) 124);
            }
            if (arg2 == 2) {
                this.method121(var7, 8, var8, (byte) 124);
                this.method121(var7, 128, var8 + 1, (byte) 124);
            }
            if (arg2 == 3) {
                this.method121(var7, 32, var8, (byte) 124);
                this.method121(var7 - 1, 2, var8, (byte) 124);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg2 == 0) {
                this.method121(var7, 1, var8, (byte) 124);
                this.method121(var7 + 1, 16, var8 - 1, (byte) 124);
            }
            if (arg2 == 1) {
                this.method121(var7, 4, var8, (byte) 124);
                this.method121(var7 + 1, 64, var8 + 1, (byte) 124);
            }
            if (arg2 == 2) {
                this.method121(var7, 16, var8, (byte) 124);
                this.method121(var7 - 1, 1, var8 + 1, (byte) 124);
            }
            if (arg2 == 3) {
                this.method121(var7, 64, var8, (byte) 124);
                this.method121(var7 - 1, 4, var8 - 1, (byte) 124);
            }
        }
        if (arg5 == 2) {
            if (arg2 == 0) {
                this.method121(var7, 130, var8, (byte) 124);
                this.method121(var7, 8, var8 - 1, (byte) 124);
                this.method121(var7 + 1, 32, var8, (byte) 124);
            }
            if (arg2 == 1) {
                this.method121(var7, 10, var8, (byte) 124);
                this.method121(var7 + 1, 32, var8, (byte) 124);
                this.method121(var7, 128, var8 + 1, (byte) 124);
            }
            if (arg2 == 2) {
                this.method121(var7, 40, var8, (byte) 124);
                this.method121(var7, 128, var8 + 1, (byte) 124);
                this.method121(var7 - 1, 2, var8, (byte) 124);
            }
            if (arg2 == 3) {
                this.method121(var7, 160, var8, (byte) 124);
                this.method121(var7 - 1, 2, var8, (byte) 124);
                this.method121(var7, 8, var8 - 1, (byte) 124);
            }
        }
        if (!arg3) {
            return;
        }
        if (arg5 == 0) {
            if (arg2 == 0) {
                this.method121(var7, 65536, var8, (byte) 124);
                this.method121(var7, 4096, var8 - 1, (byte) 124);
            }
            if (arg2 == 1) {
                this.method121(var7, 1024, var8, (byte) 124);
                this.method121(var7 + 1, 16384, var8, (byte) 124);
            }
            if (arg2 == 2) {
                this.method121(var7, 4096, var8, (byte) 124);
                this.method121(var7, 65536, var8 + 1, (byte) 124);
            }
            if (arg2 == 3) {
                this.method121(var7, 16384, var8, (byte) 124);
                this.method121(var7 - 1, 1024, var8, (byte) 124);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg2 == 0) {
                this.method121(var7, 512, var8, (byte) 124);
                this.method121(var7 + 1, 8192, var8 - 1, (byte) 124);
            }
            if (arg2 == 1) {
                this.method121(var7, 2048, var8, (byte) 124);
                this.method121(var7 + 1, 32768, var8 + 1, (byte) 124);
            }
            if (arg2 == 2) {
                this.method121(var7, 8192, var8, (byte) 124);
                this.method121(var7 - 1, 512, var8 + 1, (byte) 124);
            }
            if (arg2 == 3) {
                this.method121(var7, 32768, var8, (byte) 124);
                this.method121(var7 - 1, 2048, var8 - 1, (byte) 124);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method121(var7, 66560, var8, (byte) 124);
            this.method121(var7, 4096, var8 - 1, (byte) 124);
            this.method121(var7 + 1, 16384, var8, (byte) 124);
        }
        if (arg2 == 1) {
            this.method121(var7, 5120, var8, (byte) 124);
            this.method121(var7 + 1, 16384, var8, (byte) 124);
            this.method121(var7, 65536, var8 + 1, (byte) 124);
        }
        if (arg2 == 2) {
            this.method121(var7, 20480, var8, (byte) 124);
            this.method121(var7, 65536, var8 + 1, (byte) 124);
            this.method121(var7 - 1, 1024, var8, (byte) 124);
        }
        if (arg2 == 3) {
            this.method121(var7, 81920, var8, (byte) 124);
            this.method121(var7 - 1, 1024, var8, (byte) 124);
            this.method121(var7, 4096, var8 - 1, (byte) 124);
            return;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZIIIIBI)V", line = 2133)
    public final void method114(boolean arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        int var8 = arg1 - this.field203;
        field209++;
        if (arg3 == 1 || arg3 == 3) {
            int var9 = arg4;
            arg4 = arg6;
            arg6 = var9;
        }
        int var10 = 256;
        if (arg0) {
            var10 += 131072;
        }
        int var11 = arg2 - this.field192;
        for (int var12 = var11; var12 < arg4 + var11; var12++) {
            if (var12 >= 0 && var12 < this.field205) {
                for (int var13 = var8; var13 < arg6 + var8; var13++) {
                    if (var13 >= 0 && this.field197 > var13) {
                        this.method121(var13, var10, var12, (byte) 124);
                    }
                }
            }
        }
        if (arg5 != -55) {
            field220 = 102;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIZB)V", line = 2190)
    public final void method115(int arg0, int arg1, int arg2, int arg3, boolean arg4, byte arg5) {
        int var7 = arg0 - this.field203;
        field213++;
        int var8 = arg3 - this.field192;
        if (arg5 != 95) {
            field215 = 47;
        }
        if (arg1 == 0) {
            if (arg2 == 0) {
                this.method108(true, var8, var7, 128);
                this.method108(true, var8 - 1, var7, 8);
            }
            if (arg2 == 1) {
                this.method108(true, var8, var7, 2);
                this.method108(true, var8, var7 + 1, 32);
            }
            if (arg2 == 2) {
                this.method108(true, var8, var7, 8);
                this.method108(true, var8 + 1, var7, 128);
            }
            if (arg2 == 3) {
                this.method108(true, var8, var7, 32);
                this.method108(true, var8, var7 - 1, 2);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg2 == 0) {
                this.method108(true, var8, var7, 1);
                this.method108(true, var8 - 1, var7 - -1, 16);
            }
            if (arg2 == 1) {
                this.method108(true, var8, var7, 4);
                this.method108(true, var8 + 1, var7 + 1, 64);
            }
            if (arg2 == 2) {
                this.method108(true, var8, var7, 16);
                this.method108(true, var8 + 1, var7 + -1, 1);
            }
            if (arg2 == 3) {
                this.method108(true, var8, var7, 64);
                this.method108(true, var8 - 1, var7 + -1, 4);
            }
        }
        if (arg1 == 2) {
            if (arg2 == 0) {
                this.method108(true, var8, var7, 130);
                this.method108(true, var8 - 1, var7, 8);
                this.method108(true, var8, var7 + 1, 32);
            }
            if (arg2 == 1) {
                this.method108(true, var8, var7, 10);
                this.method108(true, var8, var7 + 1, 32);
                this.method108(true, var8 + 1, var7, 128);
            }
            if (arg2 == 2) {
                this.method108(true, var8, var7, 40);
                this.method108(true, var8 + 1, var7, 128);
                this.method108(true, var8, var7 - 1, 2);
            }
            if (arg2 == 3) {
                this.method108(true, var8, var7, 160);
                this.method108(true, var8, var7 - 1, 2);
                this.method108(true, var8 - 1, var7, 8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg1 == 0) {
            if (arg2 == 0) {
                this.method108(true, var8, var7, 65536);
                this.method108(true, var8 - 1, var7, 4096);
            }
            if (arg2 == 1) {
                this.method108(true, var8, var7, 1024);
                this.method108(true, var8, var7 + 1, 16384);
            }
            if (arg2 == 2) {
                this.method108(true, var8, var7, 4096);
                this.method108(true, var8 + 1, var7, 65536);
            }
            if (arg2 == 3) {
                this.method108(true, var8, var7, 16384);
                this.method108(true, var8, var7 - 1, 1024);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg2 == 0) {
                this.method108(true, var8, var7, 512);
                this.method108(true, var8 - 1, var7 + 1, 8192);
            }
            if (arg2 == 1) {
                this.method108(true, var8, var7, 2048);
                this.method108(true, var8 + 1, var7 - -1, 32768);
            }
            if (arg2 == 2) {
                this.method108(true, var8, var7, 8192);
                this.method108(true, var8 + 1, var7 - 1, 512);
            }
            if (arg2 == 3) {
                this.method108(true, var8, var7, 32768);
                this.method108(true, var8 - 1, var7 + -1, 2048);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method108(true, var8, var7, 66560);
            this.method108(true, var8 - 1, var7, 4096);
            this.method108(true, var8, var7 + 1, 16384);
        }
        if (arg2 == 1) {
            this.method108(true, var8, var7, 5120);
            this.method108(true, var8, var7 + 1, 16384);
            this.method108(true, var8 + 1, var7, 65536);
        }
        if (arg2 == 2) {
            this.method108(true, var8, var7, 20480);
            this.method108(true, var8 + 1, var7, 65536);
            this.method108(true, var8, var7 - 1, 1024);
        }
        if (arg2 == 3) {
            this.method108(true, var8, var7, 81920);
            this.method108(true, var8, var7 - 1, 1024);
            this.method108(true, var8 - 1, var7, 4096);
            return;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BII)V", line = 2395)
    public final void method116(byte arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field203;
        field199++;
        int var5 = arg2 - this.field192;
        if (arg0 != -28) {
            this.field205 = -24;
        }
        this.field202[var5][var4] = class76.method708(this.field202[var5][var4], 2097152);
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)V", line = 2422)
    public static void method117(int arg0) {
        field221 = null;
        field214 = null;
        field219 = null;
        if (arg0 == -19156) {
            field222 = null;
            field216 = null;
            field223 = null;
            field218 = null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIIIII)Z", line = 2440)
    public final boolean method118(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field206++;
        if (arg0 > -3) {
            this.method118(67, -89, 45, -123, -39, -109, -38, -78);
        }
        int var9 = arg2 + arg3 - 1;
        int var10 = arg4 + arg1 - 1;
        if (arg7 >= arg2 && arg7 <= var9 && arg6 >= arg4 && var10 >= arg6) {
            return true;
        } else if (arg2 - 1 == arg7 && arg6 >= arg4 && var10 >= arg6 && (this.field202[arg7 - this.field192][arg6 - this.field203] & 0x8) == 0 && (arg5 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg7 && arg6 >= arg4 && arg6 <= var10 && (this.field202[arg7 - this.field192][arg6 - this.field203] & 0x80) == 0 && (arg5 & 0x2) == 0) {
            return true;
        } else if (arg4 - 1 == arg6 && arg7 >= arg2 && arg7 <= var9 && (this.field202[arg7 - this.field192][arg6 - this.field203] & 0x2) == 0 && (arg5 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg6 && arg2 <= arg7 && var9 >= arg7 && (this.field202[arg7 - this.field192][arg6 - this.field203] & 0x20) == 0 && (arg5 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IZIIIII)V", line = 2476)
    public final void method119(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = arg5 - this.field203;
        field200++;
        int var9 = 62 % ((arg2 - 5) / 40);
        if (arg4 == 1 || arg4 == 3) {
            int var10 = arg6;
            arg6 = arg3;
            arg3 = var10;
        }
        int var11 = arg0 - this.field192;
        int var12 = 256;
        if (arg1) {
            var12 += 131072;
        }
        for (int var13 = var11; var13 < var11 + arg6; var13++) {
            if (var13 >= 0 && var13 < this.field205) {
                for (int var14 = var8; var14 < arg3 + var8; var14++) {
                    if (var14 >= 0 && var14 < this.field197) {
                        this.method108(true, var13, var14, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(IZIIIII)Z", line = 2532)
    public final boolean method120(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field198++;
        if (arg0 == arg6 && arg3 == arg4) {
            return true;
        }
        if (arg1) {
            method112(true);
        }
        int var8 = arg4 - this.field203;
        int var9 = arg6 - this.field192;
        int var10 = arg0 - this.field192;
        int var11 = arg3 - this.field203;
        if (arg2 == 0) {
            if (arg5 == 0) {
                if (var9 - 1 == var10 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var11 + 1 == var8 && (this.field202[var10][var8] & 0x1280120) == 0) {
                    return true;
                }
                if (var9 == var10 && var11 - 1 == var8 && (this.field202[var10][var8] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg5 == 1) {
                if (var9 == var10 && var11 + 1 == var8) {
                    return true;
                }
                if (var9 - 1 == var10 && var8 == var11 && (this.field202[var10][var8] & 0x1280108) == 0) {
                    return true;
                }
                if (var9 + 1 == var10 && var8 == var11 && (this.field202[var10][var8] & 0x1280180) == 0) {
                    return true;
                }
            } else if (arg5 == 2) {
                if (var9 + 1 == var10 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var11 + 1 == var8 && (this.field202[var10][var8] & 0x1280120) == 0) {
                    return true;
                }
                if (var9 == var10 && var11 - 1 == var8 && (this.field202[var10][var8] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg5 == 3) {
                if (var9 == var10 && var11 - 1 == var8) {
                    return true;
                }
                if (var9 - 1 == var10 && var8 == var11 && (this.field202[var10][var8] & 0x1280108) == 0) {
                    return true;
                }
                if (var9 + 1 == var10 && var8 == var11 && (this.field202[var10][var8] & 0x1280180) == 0) {
                    return true;
                }
            }
        }
        if (arg2 == 2) {
            if (arg5 == 0) {
                if (var9 - 1 == var10 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var11 + 1 == var8) {
                    return true;
                }
                if (var9 + 1 == var10 && var8 == var11 && (this.field202[var10][var8] & 0x1280180) == 0) {
                    return true;
                }
                if (var9 == var10 && var11 - 1 == var8 && (this.field202[var10][var8] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg5 == 1) {
                if (var9 - 1 == var10 && var8 == var11 && (this.field202[var10][var8] & 0x1280108) == 0) {
                    return true;
                }
                if (var9 == var10 && var11 + 1 == var8) {
                    return true;
                }
                if (var9 + 1 == var10 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var11 - 1 == var8 && (this.field202[var10][var8] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg5 == 2) {
                if (var9 - 1 == var10 && var8 == var11 && (this.field202[var10][var8] & 0x1280108) == 0) {
                    return true;
                }
                if (var9 == var10 && var11 + 1 == var8 && (this.field202[var10][var8] & 0x1280120) == 0) {
                    return true;
                }
                if (var9 + 1 == var10 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var11 - 1 == var8) {
                    return true;
                }
            } else if (arg5 == 3) {
                if (var9 - 1 == var10 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var11 + 1 == var8 && (this.field202[var10][var8] & 0x1280120) == 0) {
                    return true;
                }
                if (var9 + 1 == var10 && var8 == var11 && (this.field202[var10][var8] & 0x1280180) == 0) {
                    return true;
                }
                if (var9 == var10 && var11 - 1 == var8) {
                    return true;
                }
            }
        }
        if (arg2 == 9) {
            if (var9 == var10 && var11 + 1 == var8 && (this.field202[var10][var8] & 0x20) == 0) {
                return true;
            }
            if (var9 == var10 && var11 - 1 == var8 && (this.field202[var10][var8] & 0x2) == 0) {
                return true;
            }
            if (var9 - 1 == var10 && var8 == var11 && (this.field202[var10][var8] & 0x8) == 0) {
                return true;
            }
            if (var9 + 1 == var10 && var8 == var11 && (this.field202[var10][var8] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIB)V", line = 2720)
    private final void method121(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 == 124) {
            this.field202[arg2][arg0] = class132.method1034(this.field202[arg2][arg0], 16777215 - arg1);
            field190++;
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(III)I", line = 2736)
    public static final int method122(int arg0, int arg1, int arg2) {
        field189++;
        int var3 = class85.method750(arg1 - 1, arg2 + -1, 37821) + class85.method750(arg1 + 1, arg2 - 1, 37821) + class85.method750(arg1 + -1, arg2 + 1, 37821) + class85.method750(arg1 + 1, arg2 - -1, 37821);
        if (arg0 == 0) {
            int var4 = class85.method750(arg1 - 1, arg2, 37821) + class85.method750(arg1 + 1, arg2, 37821) + class85.method750(arg1, arg2 - 1, 37821) + class85.method750(arg1, arg2 + 1, 37821);
            int var5 = class85.method750(arg1, arg2, 37821);
            return var3 / 16 + var4 / 8 + var5 / 4;
        } else {
            return 56;
        }
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(II)V", line = 2753)
    public class5(int arg0, int arg1) {
        this.field197 = arg1;
        this.field203 = 0;
        this.field192 = 0;
        this.field205 = arg0;
        this.field202 = new int[this.field205][this.field197];
        this.method111(16777216);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIIBI)Z", line = 2766)
    public final boolean method123(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field194++;
        if (arg3 == arg4 && arg0 == arg2) {
            return true;
        }
        int var8 = arg2 - this.field203;
        int var9 = arg3 - this.field192;
        int var10 = -23 / ((37 - arg5) / 56);
        int var11 = arg4 - this.field192;
        int var12 = arg0 - this.field203;
        if (arg6 == 6 || arg6 == 7) {
            if (arg6 == 7) {
                arg1 = arg1 + 2 & 0x3;
            }
            if (arg1 == 0) {
                if (var9 + 1 == var11 && var8 == var12 && (this.field202[var11][var8] & 0x80) == 0) {
                    return true;
                }
                if (var9 == var11 && var12 - 1 == var8 && (this.field202[var11][var8] & 0x2) == 0) {
                    return true;
                }
            } else if (arg1 == 1) {
                if (var9 - 1 == var11 && var8 == var12 && (this.field202[var11][var8] & 0x8) == 0) {
                    return true;
                }
                if (var9 == var11 && var12 - 1 == var8 && (this.field202[var11][var8] & 0x2) == 0) {
                    return true;
                }
            } else if (arg1 == 2) {
                if (var9 - 1 == var11 && var8 == var12 && (this.field202[var11][var8] & 0x8) == 0) {
                    return true;
                }
                if (var9 == var11 && var12 + 1 == var8 && (this.field202[var11][var8] & 0x20) == 0) {
                    return true;
                }
            } else if (arg1 == 3) {
                if (var9 + 1 == var11 && var8 == var12 && (this.field202[var11][var8] & 0x80) == 0) {
                    return true;
                }
                if (var9 == var11 && var12 + 1 == var8 && (this.field202[var11][var8] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg6 == 8) {
            if (var9 == var11 && var12 + 1 == var8 && (this.field202[var11][var8] & 0x20) == 0) {
                return true;
            }
            if (var9 == var11 && var12 - 1 == var8 && (this.field202[var11][var8] & 0x2) == 0) {
                return true;
            }
            if (var9 - 1 == var11 && var8 == var12 && (this.field202[var11][var8] & 0x8) == 0) {
                return true;
            }
            if (var9 + 1 == var11 && var8 == var12 && (this.field202[var11][var8] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }
}
