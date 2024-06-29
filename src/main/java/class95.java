import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class95 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "Ldd;")
    public static class35 field2085 = class180.method1196((byte) 126, ": ");

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "J")
    public static long field2087 = 0L;

    @OriginalMember(owner = "client!jf", name = "o", descriptor = "Ldd;")
    public static class35 field2099 = class180.method1196((byte) -91, "Weiter");

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "Ldd;")
    public static class35 field2097 = class180.method1196((byte) 127, "<col=ff7000>");

    @OriginalMember(owner = "client!jf", name = "q", descriptor = "Lfd;")
    public static class55 field2101 = null;

    @OriginalMember(owner = "client!jf", name = "r", descriptor = "Ldd;")
    public static class35 field2102 = class180.method1196((byte) -34, "<col=00ff80>");

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "[[I")
    public static int[][] field2090 = new int[104][104];

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "Ldd;")
    public static class35 field2092 = class180.method1196((byte) 127, "scape main");

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
    public static int field2089;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "I")
    public static int field2094;

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "I")
    public static int field2095;

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "I")
    public static int field2096;

    @OriginalMember(owner = "client!jf", name = "n", descriptor = "I")
    public static int field2098;

    @OriginalMember(owner = "client!jf", name = "p", descriptor = "I")
    public static int field2100;

    @OriginalMember(owner = "client!jf", name = "s", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!jf", name = "t", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!jf", name = "v", descriptor = "I")
    public static int field2106;

    @OriginalMember(owner = "client!jf", name = "w", descriptor = "I")
    public static int field2107;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "Lag;")
    public static class8 field2088;

    @OriginalMember(owner = "client!jf", name = "u", descriptor = "Lag;")
    public static class8 field2105;

    @OriginalMember(owner = "client!jf", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class158.field3210 != null) {
            class17.field343 = 0;
            class37.field809 = arg0.getX();
            class99.field2171 = arg0.getY();
            class75.field1797 = class190.method1253((byte) 18);
            if (arg0.isMetaDown()) {
                class124.field2728 = 2;
                class207.field4124 = 2;
            } else {
                class124.field2728 = 1;
                class207.field4124 = 1;
            }
        }
        field2100++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V")
    public static void method727(int arg0) {
        field2102 = null;
        field2092 = null;
        field2105 = null;
        field2099 = null;
        field2097 = null;
        if (arg0 == -85) {
            field2088 = null;
            field2090 = null;
            field2101 = null;
            field2085 = null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field2095++;
    }

    @OriginalMember(owner = "client!jf", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class158.field3210 != null) {
            class207.field4124 = 0;
        }
        field2093++;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(II[BZIIIII[Ld;)V")
    public static final void method728(int arg0, int arg1, byte[] arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class31[] arg9) {
        for (int var10 = 0; var10 < 8; var10++) {
            for (int var15 = 0; var15 < 8; var15++) {
                if (arg0 + var10 > 0 && arg0 + var10 < 103 && arg4 + var15 > 0 && arg4 + var15 < 103) {
                    arg9[arg7].field656[arg0 + var10][arg4 + var15] = class208.method1372(arg9[arg7].field656[arg0 + var10][arg4 + var15], -16777217);
                }
            }
        }
        class26 var11 = new class26(arg2);
        field2089++;
        if (arg3) {
            return;
        }
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg6 == var12 && var13 >= arg5 && var13 < arg5 + 8 && var14 >= arg1 && arg1 + 8 > var14) {
                        class44.method404(arg4 + class106.method782(arg8, 23446, var14 & 0x7, var13 & 0x7), arg8, 0, class166.method1092(var13 & 0x7, arg8, 2, var14 & 0x7) + arg0, var11, arg7, 91, 0);
                    } else {
                        class44.method404(-1, 0, 0, -1, var11, 0, 83, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class158.field3210 != null) {
            class17.field343 = 0;
            class207.field4124 = 0;
        }
        field2103++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Z)V")
    public static final void method729(boolean arg0) {
        field2094++;
        if (class207.field4121 == 232) {
            int var1 = class172.field3441.method214((byte) -117);
            int var2 = (var1 >> 4 & 0x7) + class13.field241;
            int var3 = class120.field2641 + (var1 & 0x7);
            int var4 = class172.field3441.method217((byte) 46);
            int var5 = var4 >> 2;
            int var6 = var4 & 0x3;
            int var7 = class57.field1429[var5];
            if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
                class80.method603(var3, -1, var6, var2, 0, true, class175.field3585, var5, var7, -1);
            }
            return;
        }
        if (arg0) {
            field2088 = null;
        }
        if (class207.field4121 == 130) {
            int var8 = class172.field3441.method250(28198);
            int var9 = class172.field3441.method217((byte) 60);
            int var10 = (var9 & 0x7) + class120.field2641;
            int var11 = (var9 >> 4 & 0x7) + class13.field241;
            int var12 = class172.field3441.method250(28198);
            int var13 = class172.field3441.method250(28198);
            if (var11 >= 0 && var10 >= 0 && var11 < 104 && var10 < 104 && client.field614 != var12) {
                class176 var14 = new class176();
                var14.field3586 = var13;
                var14.field3589 = var8;
                if (class145.field3074[class175.field3585][var11][var10] == null) {
                    class145.field3074[class175.field3585][var11][var10] = new class187();
                }
                class145.field3074[class175.field3585][var11][var10].method1236((byte) 123, var14);
                class181.method1201(var10, var11, 2048);
            }
        } else if (class207.field4121 == 84) {
            int var15 = class172.field3441.method221(-82);
            int var16 = (var15 >> 4 & 0x7) + class13.field241;
            int var17 = (var15 & 0x7) + class120.field2641;
            int var18 = class172.field3441.method256((byte) -78);
            int var19 = class172.field3441.method221(-98);
            int var20 = class172.field3441.method256((byte) -78);
            if (var16 >= 0 && var17 >= 0 && var16 < 104 && var17 < 104) {
                int var21 = var16 * 128 + 64;
                int var22 = var17 * 128 + 64;
                class40 var23 = new class40(var18, class175.field3585, var21, var22, class73.method583(class175.field3585, var22, var21, (byte) 1) - var19, var20, class89.field1988);
                class25.field503.method1236((byte) 125, var23);
            }
        } else if (class207.field4121 == 97) {
            int var24 = class172.field3441.method221(-80);
            int var25 = (var24 & 0x7) + class120.field2641;
            int var26 = (var24 >> 4 & 0x7) + class13.field241;
            int var27 = class172.field3441.method256((byte) -78);
            int var28 = class172.field3441.method256((byte) -78);
            int var29 = class172.field3441.method256((byte) -78);
            if (var26 >= 0 && var25 >= 0 && var26 < 104 && var25 < 104) {
                class187 var30 = class145.field3074[class175.field3585][var26][var25];
                if (var30 != null) {
                    for (class176 var31 = (class176) var30.method1232(25831); var31 != null; var31 = (class176) var30.method1238(22622)) {
                        if ((var27 & 0x7FFF) == var31.field3586 && var31.field3589 == var28) {
                            var31.field3589 = var29;
                            break;
                        }
                    }
                    class181.method1201(var25, var26, 2048);
                }
            }
        } else if (class207.field4121 == 85) {
            int var32 = class172.field3441.method252(255);
            int var33 = (var32 & 0x7) + class120.field2641;
            int var34 = (var32 >> 4 & 0x7) + class13.field241;
            int var35 = class172.field3441.method250(28198);
            int var36 = class172.field3441.method221(-106);
            int var37 = var36 >> 2;
            int var38 = class57.field1429[var37];
            int var39 = var36 & 0x3;
            if (var34 >= 0 && var33 >= 0 && var34 < 104 && var33 < 104) {
                class80.method603(var33, -1, var39, var34, 0, true, class175.field3585, var37, var38, var35);
            }
        } else {
            if (class207.field4121 == 235) {
                int var40 = class172.field3441.method221(-100);
                int var41 = (var40 >> 4 & 0x7) + class13.field241;
                int var42 = (var40 & 0x7) + class120.field2641;
                int var43 = class172.field3441.method256((byte) -78);
                if (var43 == 65535) {
                    var43 = -1;
                }
                int var44 = class172.field3441.method221(-93);
                int var45 = var44 >> 4 & 0xF;
                int var46 = class172.field3441.method221(-84);
                int var47 = var44 & 0x7;
                if (var41 >= 0 && var42 >= 0 && var41 < 104 && var42 < 104) {
                    int var48 = var45 + 1;
                    if (var41 - var48 <= class71.field1704.field1603[0] && class71.field1704.field1603[0] <= var41 + var48 && class71.field1704.field1605[0] >= var42 - var48 && var42 + var48 >= class71.field1704.field1605[0] && class25.field507 != 0 && var47 > 0 && class197.field3934 < 50 && var43 != -1) {
                        class175.field3582[class197.field3934] = var43;
                        class21.field422[class197.field3934] = var47;
                        class79.field1859[class197.field3934] = var46;
                        class126.field2745[class197.field3934] = null;
                        class187.field3802[class197.field3934] = (var41 << 16) - (-(var42 << 8) - var45);
                        class197.field3934++;
                    }
                }
            }
            if (class207.field4121 == 32) {
                int var49 = class172.field3441.method256((byte) -78);
                int var50 = class172.field3441.method248(true);
                int var51 = class172.field3441.method214((byte) -120);
                int var52 = (var51 & 0x7) + class120.field2641;
                int var53 = class13.field241 + (var51 >> 4 & 0x7);
                if (var53 >= 0 && var52 >= 0 && var53 < 104 && var52 < 104) {
                    class176 var54 = new class176();
                    var54.field3586 = var50;
                    var54.field3589 = var49;
                    if (class145.field3074[class175.field3585][var53][var52] == null) {
                        class145.field3074[class175.field3585][var53][var52] = new class187();
                    }
                    class145.field3074[class175.field3585][var53][var52].method1236((byte) 120, var54);
                    class181.method1201(var52, var53, 2048);
                }
            } else if (class207.field4121 == 200) {
                int var55 = class172.field3441.method248(true);
                int var56 = class172.field3441.method252(255);
                int var57 = (var56 & 0x7) + class120.field2641;
                int var58 = class13.field241 + (var56 >> 4 & 0x7);
                if (var58 >= 0 && var57 >= 0 && var58 < 104 && var57 < 104) {
                    class187 var59 = class145.field3074[class175.field3585][var58][var57];
                    if (var59 != null) {
                        for (class176 var60 = (class176) var59.method1232(25831); var60 != null; var60 = (class176) var59.method1238(22622)) {
                            if ((var55 & 0x7FFF) == var60.field3586) {
                                var60.method799(-24265);
                                break;
                            }
                        }
                        if (var59.method1232(25831) == null) {
                            class145.field3074[class175.field3585][var58][var57] = null;
                        }
                        class181.method1201(var57, var58, 2048);
                    }
                }
            } else {
                if (class207.field4121 == 170) {
                    byte var61 = class172.field3441.method225((byte) -106);
                    byte var62 = class172.field3441.method262(-63);
                    byte var63 = class172.field3441.method261(arg0);
                    int var64 = class172.field3441.method252(255);
                    int var65 = class120.field2641 + (var64 & 0x7);
                    int var66 = (var64 >> 4 & 0x7) + class13.field241;
                    byte var67 = class172.field3441.method261(false);
                    int var68 = class172.field3441.method248(true);
                    int var69 = class172.field3441.method256((byte) -78);
                    int var70 = class172.field3441.method250(28198);
                    int var71 = class172.field3441.method248(true);
                    int var72 = class172.field3441.method252(255);
                    class102 var73;
                    if (client.field614 == var69) {
                        var73 = class71.field1704;
                    } else {
                        var73 = class51.field1154[var69];
                    }
                    int var74 = var72 & 0x3;
                    int var75 = var72 >> 2;
                    int var76 = class57.field1429[var75];
                    if (var73 != null) {
                        class145 var77 = class4.method23((byte) -94, var71);
                        int var78;
                        int var79;
                        if (var74 == 1 || var74 == 3) {
                            var79 = var77.field3034;
                            var78 = var77.field3017;
                        } else {
                            var78 = var77.field3034;
                            var79 = var77.field3017;
                        }
                        int var80 = var66 + (var79 >> 1);
                        int var81 = var66 + (var79 + 1 >> 1);
                        int var82 = (var78 + 1 >> 1) + var65;
                        int var83 = (var78 >> 1) + var65;
                        int[][] var84 = class206.field4109[class175.field3585];
                        int var85 = var84[var80][var83] + var84[var80][var82] + var84[var81][var82] + var84[var81][var83] >> 2;
                        int var86 = (var66 << 7) + (var79 << 6);
                        int var87 = (var65 << 7) + (var78 << 6);
                        class81 var88 = var77.method990(var74, var85, -118, var84, var87, var75, var86);
                        if (var88 != null) {
                            class80.method603(var65, var68 + 1, 0, var66, var70 + 1, true, class175.field3585, 0, var76, -1);
                            var73.field2268 = var88;
                            var73.field2253 = class89.field1988 + var70;
                            var73.field2259 = var65 * 128 + var78 * 64;
                            if (var63 > var67) {
                                byte var89 = var63;
                                var63 = var67;
                                var67 = var89;
                            }
                            var73.field2265 = var85;
                            var73.field2258 = var63 + var66;
                            if (var61 < var62) {
                                byte var90 = var62;
                                var62 = var61;
                                var61 = var90;
                            }
                            var73.field2276 = class89.field1988 + var68;
                            var73.field2271 = var66 + var67;
                            var73.field2291 = var61 + var65;
                            var73.field2290 = var62 + var65;
                            var73.field2278 = var66 * 128 + var79 * 64;
                        }
                    }
                }
                if (class207.field4121 == 148) {
                    int var91 = class172.field3441.method221(-76);
                    int var92 = (var91 >> 4 & 0x7) + class13.field241;
                    int var93 = (var91 & 0x7) + class120.field2641;
                    int var94 = class172.field3441.method225((byte) -122) + var92;
                    int var95 = var93 + class172.field3441.method225((byte) -108);
                    int var96 = class172.field3441.method241(false);
                    int var97 = class172.field3441.method256((byte) -78);
                    int var98 = class172.field3441.method221(-85) * 4;
                    int var99 = class172.field3441.method221(-88) * 4;
                    int var100 = class172.field3441.method256((byte) -78);
                    int var101 = class172.field3441.method256((byte) -78);
                    int var102 = class172.field3441.method221(-115);
                    int var103 = class172.field3441.method221(-79);
                    if (var92 >= 0 && var93 >= 0 && var92 < 104 && var93 < 104 && var94 >= 0 && var95 >= 0 && var94 < 104 && var95 < 104 && var97 != 65535) {
                        int var104 = var95 * 128 + 64;
                        int var105 = var92 * 128 + 64;
                        int var106 = var94 * 128 + 64;
                        int var107 = var93 * 128 + 64;
                        class24 var108 = new class24(var97, class175.field3585, var105, var107, class73.method583(class175.field3585, var107, var105, (byte) 1) - var98, var100 - -class89.field1988, class89.field1988 + var101, var102, var103, var96, var99);
                        var108.method207(var100 + class89.field1988, -1, var106, var104, class73.method583(class175.field3585, var104, var106, (byte) 1) - var99);
                        class4.field76.method1236((byte) 120, var108);
                    }
                } else if (class207.field4121 == 206) {
                    int var109 = class172.field3441.method214((byte) -104);
                    int var110 = var109 & 0x3;
                    int var111 = var109 >> 2;
                    int var112 = class57.field1429[var111];
                    int var113 = class172.field3441.method248(true);
                    int var114 = class172.field3441.method252(255);
                    int var115 = (var114 & 0x7) + class120.field2641;
                    int var116 = (var114 >> 4 & 0x7) + class13.field241;
                    if (var116 >= 0 && var115 >= 0 && var116 < 103 && var115 < 103) {
                        if (var112 == 0) {
                            class22 var117 = class15.method124(class175.field3585, var116, var115);
                            if (var117 != null) {
                                int var118 = (int) (var117.field444 >>> 32) & Integer.MAX_VALUE;
                                if (var111 == 2) {
                                    var117.field448 = new class97(var118, 2, var110 + 4, class175.field3585, var116, var115, var113, false, var117.field448);
                                    var117.field446 = new class97(var118, 2, var110 + 1 & 0x3, class175.field3585, var116, var115, var113, false, var117.field446);
                                } else {
                                    var117.field448 = new class97(var118, var111, var110, class175.field3585, var116, var115, var113, false, var117.field448);
                                }
                            }
                        }
                        if (var112 == 1) {
                            class150 var119 = class100.method749(class175.field3585, var116, var115);
                            if (var119 != null) {
                                int var120 = Integer.MAX_VALUE & (int) (var119.field3139 >>> 32);
                                if (var111 == 4 || var111 == 5) {
                                    var119.field3137 = new class97(var120, 4, var110, class175.field3585, var116, var115, var113, false, var119.field3137);
                                } else if (var111 == 6) {
                                    var119.field3137 = new class97(var120, 4, var110 + 4, class175.field3585, var116, var115, var113, false, var119.field3137);
                                } else if (var111 == 7) {
                                    var119.field3137 = new class97(var120, 4, (var110 + 2 & 0x3) + 4, class175.field3585, var116, var115, var113, false, var119.field3137);
                                } else if (var111 == 8) {
                                    var119.field3137 = new class97(var120, 4, var110 + 4, class175.field3585, var116, var115, var113, false, var119.field3137);
                                    var119.field3121 = new class97(var120, 4, (var110 + 2 & 0x3) + 4, class175.field3585, var116, var115, var113, false, var119.field3121);
                                }
                            }
                        }
                        if (var112 == 2) {
                            class131 var121 = class24.method203(class175.field3585, var116, var115);
                            if (var111 == 11) {
                                var111 = 10;
                            }
                            if (var121 != null) {
                                var121.field2814 = new class97(Integer.MAX_VALUE & (int) (var121.field2822 >>> 32), var111, var110, class175.field3585, var116, var115, var113, false, var121.field2814);
                            }
                        }
                        if (var112 == 3) {
                            class127 var122 = class17.method154(class175.field3585, var116, var115);
                            if (var122 != null) {
                                var122.field2751 = new class97((int) (var122.field2747 >>> 32) & Integer.MAX_VALUE, 22, var110, class175.field3585, var116, var115, var113, false, var122.field2751);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        field2096++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!jf", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field2086++;
        if (class158.field3210 != null) {
            class17.field343 = 0;
            class132.field2840 = arg0.getX();
            class63.field1518 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!jf", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class158.field3210 != null) {
            class17.field343 = 0;
            class132.field2840 = arg0.getX();
            class63.field1518 = arg0.getY();
        }
        field2091++;
    }

    @OriginalMember(owner = "client!jf", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field2107++;
        if (class158.field3210 != null) {
            class17.field343 = 0;
            class132.field2840 = arg0.getX();
            class63.field1518 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!jf", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field2098++;
        if (class158.field3210 != null) {
            class17.field343 = 0;
            class132.field2840 = -1;
            class63.field1518 = -1;
        }
    }
}
