import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class227 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!d", name = "e", descriptor = "Ljd;")
    public static class86 field4109 = class122.method868("leuchten1:", true);

    @OriginalMember(owner = "client!d", name = "h", descriptor = "Ljd;")
    public static class86 field4112 = class122.method868("m-Ochte mit Ihnen handeln)3", true);

    @OriginalMember(owner = "client!d", name = "o", descriptor = "I")
    public static int field4119 = 0;

    @OriginalMember(owner = "client!d", name = "l", descriptor = "I")
    public static int field4116 = -2;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "I")
    public static int field4105;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "I")
    public static int field4106;

    @OriginalMember(owner = "client!d", name = "c", descriptor = "I")
    public static int field4107;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "I")
    public static int field4108;

    @OriginalMember(owner = "client!d", name = "f", descriptor = "I")
    public static int field4110;

    @OriginalMember(owner = "client!d", name = "g", descriptor = "I")
    public static int field4111;

    @OriginalMember(owner = "client!d", name = "i", descriptor = "I")
    public static int field4113;

    @OriginalMember(owner = "client!d", name = "k", descriptor = "I")
    public static int field4115;

    @OriginalMember(owner = "client!d", name = "m", descriptor = "I")
    public static int field4117;

    @OriginalMember(owner = "client!d", name = "n", descriptor = "I")
    public static int field4118;

    @OriginalMember(owner = "client!d", name = "p", descriptor = "I")
    public static int field4120;

    @OriginalMember(owner = "client!d", name = "q", descriptor = "I")
    public static int field4121;

    @OriginalMember(owner = "client!d", name = "j", descriptor = "Lea;")
    public static class37 field4114;

    @OriginalMember(owner = "client!d", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field4106++;
        if (class75.field1502 != null) {
            class147.field2767 = 0;
            class150.field2804 = arg0.getX();
            class105.field2014 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!d", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field4107++;
    }

    @OriginalMember(owner = "client!d", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class75.field1502 != null) {
            class147.field2767 = 0;
            class150.field2804 = -1;
            class105.field2014 = -1;
        }
        field4105++;
    }

    @OriginalMember(owner = "client!d", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field4117++;
        if (class75.field1502 != null) {
            class147.field2767 = 0;
            class150.field2804 = arg0.getX();
            class105.field2014 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!d", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class75.field1502 != null) {
            class147.field2767 = 0;
            class180.field3240 = 0;
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field4108++;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
    public static final void method1588(int arg0) {
        if (class213.field3837 > 0) {
            class213.field3837--;
        }
        field4110++;
        if (class226.field4104 > 1) {
            class226.field4104--;
            class111.field2127 = class27.field621;
        }
        if (class45.field1010) {
            class45.field1010 = false;
            class130.method915(-14139);
            return;
        }
        for (int var1 = 0; var1 < 100 && class217.method1533(arg0 + 14); var1++) {
        }
        if (class84.field1634 != 30) {
            return;
        }
        class55.method404(class36.field809, 184, 108);
        Object var2 = class258.field4578.field3528;
        synchronized (class258.field4578.field3528) {
            if (!class180.field3242) {
                class258.field4578.field3529 = 0;
            } else if (class143.field2712 != 0 || class258.field4578.field3529 >= 40) {
                class36.field809.method1356(114, true);
                class79.field1546++;
                class36.field809.method1388(-63, 0);
                int var3 = class36.field809.field3565;
                int var4 = 0;
                for (int var5 = 0; class258.field4578.field3529 > var5 && class36.field809.field3565 - var3 < 240; var5++) {
                    int var6 = class258.field4578.field3531[var5];
                    var4++;
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    int var7 = class258.field4578.field3530[var5];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 65534) {
                        var7 = 65534;
                    }
                    boolean var8 = false;
                    if (class258.field4578.field3531[var5] == -1 && class258.field4578.field3530[var5] == -1) {
                        var8 = true;
                        var6 = -1;
                        var7 = -1;
                    }
                    if (class82.field1610 != var7 || class55.field1130 != var6) {
                        int var9 = var7 - class82.field1610;
                        class82.field1610 = var7;
                        int var10 = var6 - class55.field1130;
                        class55.field1130 = var6;
                        if (class108.field2078 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var9 += 32;
                            var10 += 32;
                            class36.field809.method1428((byte) 22, (class108.field2078 << 12) + (var9 << 6) + var10);
                            class108.field2078 = 0;
                        } else if (class108.field2078 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                            class36.field809.method1388(-81, class108.field2078 + 128);
                            var10 += 128;
                            var9 += 128;
                            class36.field809.method1428((byte) 58, (var9 << 8) + var10);
                            class108.field2078 = 0;
                        } else if (class108.field2078 < 32) {
                            class36.field809.method1388(-79, class108.field2078 + 192);
                            if (var8) {
                                class36.field809.method1406(arg0 ^ 0xA83AE9FA, Integer.MIN_VALUE);
                            } else {
                                class36.field809.method1406(1472534024, var7 | var6 << 16);
                            }
                            class108.field2078 = 0;
                        } else {
                            class36.field809.method1428((byte) -103, class108.field2078 + 57344);
                            if (var8) {
                                class36.field809.method1406(1472534024, Integer.MIN_VALUE);
                            } else {
                                class36.field809.method1406(1472534024, var6 << 16 | var7);
                            }
                            class108.field2078 = 0;
                        }
                    } else if (class108.field2078 < 2047) {
                        class108.field2078++;
                    }
                }
                class36.field809.method1400(126, class36.field809.field3565 - var3);
                if (var4 >= class258.field4578.field3529) {
                    class258.field4578.field3529 = 0;
                } else {
                    class258.field4578.field3529 -= var4;
                    for (int var11 = 0; var11 < class258.field4578.field3529; var11++) {
                        class258.field4578.field3530[var11] = class258.field4578.field3530[var4 + var11];
                        class258.field4578.field3531[var11] = class258.field4578.field3531[var4 + var11];
                    }
                }
            }
        }
        if (class143.field2712 != 0) {
            int var12 = class39.field906;
            if (var12 < 0) {
                var12 = 0;
            } else if (var12 > 65535) {
                var12 = 65535;
            }
            long var13 = (class133.field2520 - class226.field4096) / 50L;
            byte var15 = 0;
            if (var13 > 32767L) {
                var13 = 32767L;
            }
            class226.field4096 = class133.field2520;
            class35.field799++;
            if (class143.field2712 == 2) {
                var15 = 1;
            }
            int var16 = class185.field3288;
            class36.field809.method1356(145, true);
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 65535) {
                var16 = 65535;
            }
            class36.field809.method1394(var16 | var12 << 16, 128);
            int var17 = (int) var13;
            class36.field809.method1418(arg0 ^ 0xFFFFFF85, var15 << 15 | var17);
        }
        if (class9.field295[96] || class9.field295[97] || class9.field295[98] || class9.field295[99]) {
            class173.field3177 = true;
        }
        if (class138.field2626 > 0) {
            class138.field2626--;
        }
        if (class173.field3177 && class138.field2626 <= 0) {
            class173.field3177 = false;
            class133.field2521++;
            class138.field2626 = 20;
            class36.field809.method1356(116, true);
            class36.field809.method1428((byte) 6, class139.field2641);
            class36.field809.method1396(class86.field1664, -718541592);
        }
        if (class228.field4130 && !class55.field1122) {
            class241.field4322++;
            class55.field1122 = true;
            class36.field809.method1356(55, true);
            class36.field809.method1388(arg0 ^ 0x3C, 1);
        }
        if (!class228.field4130 && class55.field1122) {
            class241.field4322++;
            class55.field1122 = false;
            class36.field809.method1356(55, true);
            class36.field809.method1388(-66, 0);
        }
        if (!class111.field2129) {
            class198.field3516++;
            class36.field809.method1356(23, true);
            class36.field809.method1394(class252.method1706((byte) 57), arg0 + 142);
            class111.field2129 = true;
        }
        class55.method409(0);
        if (class84.field1634 != 30) {
            return;
        }
        class189.method1297(87);
        class263.method1789((byte) -121);
        class34.field784++;
        if (class34.field784 > 750) {
            class130.method915(arg0 ^ 0x3737);
            return;
        }
        class273.method1861(8);
        class268.method1843(-12530);
        class158.method1145((byte) 111);
        if (class239.field4310 != null) {
            class93.method686((byte) -45);
        }
        for (int var18 = class115.method815(-127, true); var18 != -1; var18 = class115.method815(-97, false)) {
            class67.method477((byte) 125, var18);
            class240.field4313[class1.method5(class111.field2128++, 31)] = var18;
        }
        for (class161 var19 = class64.method457(arg0 - 52); var19 != null; var19 = class64.method457(80)) {
            int var20 = var19.method1176((byte) -126);
            int var21 = var19.method1169(255);
            if (var20 == 1) {
                class208.field3775[var21] = var19.field3027;
                class96.field1909[class1.method5(31, class48.field1034++)] = var21;
            } else if (var20 == 2) {
                class246.field4374[var21] = var19.field3020;
                class221.field3969[class1.method5(31, class69.field1410++)] = var21;
            } else if (var20 == 3) {
                class6 var41 = class25.method178(arg0 ^ 0xFFFFFF9D, var21);
                if (!var19.field3020.method625((byte) 21, var41.field149)) {
                    var41.field149 = var19.field3020;
                    class62.method441(-29481, var41);
                }
            } else if (var20 == 4) {
                class6 var38 = class25.method178(arg0 ^ 0xFFFFFFB5, var21);
                int var39 = var19.field3016;
                int var40 = var19.field3027;
                if (var38.field162 != var40 || var38.field195 != var39) {
                    var38.field162 = var40;
                    var38.field195 = var39;
                    class62.method441(arg0 - 29467, var38);
                }
            } else if (var20 == 5) {
                class6 var22 = class25.method178(102, var21);
                if (var19.field3027 != var22.field79 || var19.field3027 == -1) {
                    var22.field119 = 0;
                    var22.field79 = var19.field3027;
                    var22.field88 = 0;
                    class62.method441(-29481, var22);
                }
            } else if (var20 == 6) {
                int var23 = var19.field3027;
                int var24 = var23 >> 10 & 0x1F;
                int var25 = (var23 & 0x3EE) >> 5;
                int var26 = var23 & 0x1F;
                int var27 = (var24 << 19) + (var25 << 11) + (var26 << 3);
                class6 var28 = class25.method178(92, var21);
                if (var28.field104 != var27) {
                    var28.field104 = var27;
                    class62.method441(-29481, var28);
                }
            } else if (var20 == 7) {
                class6 var29 = class25.method178(arg0 + 134, var21);
                boolean var30 = var19.field3027 == 1;
                if (var29.field231 != var30) {
                    var29.field231 = var30;
                    class62.method441(-29481, var29);
                }
            } else if (var20 == 8) {
                class6 var31 = class25.method178(86, var21);
                if (var19.field3027 != var31.field192 || var19.field3016 != var31.field110 || var19.field3015 != var31.field198) {
                    var31.field192 = var19.field3027;
                    var31.field110 = var19.field3016;
                    var31.field198 = var19.field3015;
                    if (var31.field154 != -1) {
                        if (var31.field214 > 0) {
                            var31.field198 = var31.field198 * 32 / var31.field214;
                        } else if (var31.field98 > 0) {
                            var31.field198 = var31.field198 * 32 / var31.field98;
                        }
                    }
                    class62.method441(-29481, var31);
                }
            } else if (var20 == 9) {
                class6 var32 = class25.method178(92, var21);
                if (var19.field3027 != var32.field154 || var19.field3016 != var32.field127) {
                    var32.field154 = var19.field3027;
                    var32.field127 = var19.field3016;
                    class62.method441(-29481, var32);
                }
            } else if (var20 == 10) {
                class6 var33 = class25.method178(arg0 ^ 0xFFFFFFBE, var21);
                if (var19.field3027 != var33.field136 || var19.field3016 != var33.field108 || var19.field3015 != var33.field126) {
                    var33.field136 = var19.field3027;
                    var33.field126 = var19.field3015;
                    var33.field108 = var19.field3016;
                    class62.method441(arg0 - 29467, var33);
                }
            } else if (var20 == 11) {
                class6 var34 = class25.method178(80, var21);
                var34.field168 = 0;
                var34.field158 = var34.field202 = var19.field3016;
                var34.field182 = 0;
                var34.field117 = var34.field87 = var19.field3027;
                class62.method441(-29481, var34);
            } else if (var20 == 12) {
                class6 var35 = class25.method178(118, var21);
                int var36 = var19.field3027;
                if (var35 != null && var35.field184 == 0) {
                    if (var36 > var35.field199 - var35.field131) {
                        var36 = var35.field199 - var35.field131;
                    }
                    if (var36 < 0) {
                        var36 = 0;
                    }
                    if (var35.field102 != var36) {
                        var35.field102 = var36;
                        class62.method441(arg0 ^ 0x7325, var35);
                    }
                }
            } else if (var20 == 13) {
                class6 var37 = class25.method178(71, var21);
                var37.field212 = var19.field3027;
            }
        }
        class194.field3474++;
        if (class198.field3523 != 0) {
            class141.field2673 += 20;
            if (class141.field2673 >= 400) {
                class198.field3523 = 0;
            }
        }
        if (client.field2855 != null) {
            class24.field595++;
            if (class24.field595 >= 15) {
                class62.method441(-29481, client.field2855);
                client.field2855 = null;
            }
        }
        if (class4.field64 != null) {
            class62.method441(-29481, class4.field64);
            class226.field4097++;
            if ((class274.field4810 + 5) < class6.field207 || class6.field207 < (class274.field4810 - 5) || class253.field4505 + 5 < class90.field1841 || class253.field4505 - 5 > class90.field1841) {
                class31.field651 = true;
            }
            if (class56.field1151 == 0) {
                if (class31.field651 && class226.field4097 >= 5) {
                    if (class4.field64 == class224.field4055 && class265.field4683 != class116.field2217) {
                        class6 var42 = class4.field64;
                        class73.field1478++;
                        byte var43 = 0;
                        if (class134.field2538 == 1 && var42.field100 == 206) {
                            var43 = 1;
                        }
                        if (var42.field232[class116.field2217] <= 0) {
                            var43 = 0;
                        }
                        if (class81.method568((byte) 32, client.method1111(var42))) {
                            int var46 = class265.field4683;
                            int var47 = class116.field2217;
                            var42.field232[var47] = var42.field232[var46];
                            var42.field201[var47] = var42.field201[var46];
                            var42.field232[var46] = -1;
                            var42.field201[var46] = 0;
                        } else if (var43 == 1) {
                            int var44 = class265.field4683;
                            int var45 = class116.field2217;
                            while (var44 != var45) {
                                if (var45 < var44) {
                                    var42.method38(var44 - 1, 0, var44);
                                    var44--;
                                } else if (var44 < var45) {
                                    var42.method38(var44 + 1, 0, var44);
                                    var44++;
                                }
                            }
                        } else {
                            var42.method38(class116.field2217, 0, class265.field4683);
                        }
                        class36.field809.method1356(224, true);
                        class36.field809.method1418(94, class265.field4683);
                        class36.field809.method1390((byte) 104, var43);
                        class36.field809.method1428((byte) -126, class116.field2217);
                        class36.field809.method1394(class4.field64.field222, arg0 ^ 0xFFFFFF72);
                    }
                } else if ((class141.field2670 == 1 || class156.method1137(-111, class16.field463 - 1)) && class16.field463 > 2) {
                    class104.method744((byte) 120);
                } else if (class16.field463 > 0) {
                    class43.method347(false);
                }
                class24.field595 = 10;
                class143.field2712 = 0;
                class4.field64 = null;
            }
        }
        class114.field2181 = false;
        class6 var48 = class229.field4162;
        class229.field4162 = null;
        class20.field532 = false;
        class83.field1615 = 0;
        class98.field1943 = null;
        class6 var49 = class38.field901;
        class38.field901 = null;
        while (class136.method975((byte) 73) && class83.field1615 < 128) {
            class20.field519[class83.field1615] = field4120;
            class15.field443[class83.field1615] = class268.field4720;
            class83.field1615++;
        }
        class213.field3843 = null;
        class239.field4310 = null;
        if (arg0 != -14) {
            field4119 = 20;
        }
        if (class178.field3225 != -1) {
            class70.method512(0, class4.field53, class178.field3225, 0, class248.field4414, false, 0, 0);
        }
        class27.field621++;
        if (class213.field3843 != null) {
            class109.method774(class213.field3843, class77.field1527, 4, class80.field1577);
            class213.field3843 = null;
        }
        while (true) {
            class55 var50;
            class6 var51;
            class6 var52;
            do {
                var50 = (class55) class147.field2762.method1735((byte) 62);
                if (var50 == null) {
                    while (true) {
                        class55 var53;
                        class6 var54;
                        class6 var55;
                        do {
                            var53 = (class55) class92.field1872.method1735((byte) 62);
                            if (var53 == null) {
                                while (true) {
                                    class55 var56;
                                    class6 var57;
                                    class6 var58;
                                    do {
                                        var56 = (class55) class42.field937.method1735((byte) 62);
                                        if (var56 == null) {
                                            if (class56.field1140 && class239.field4310 == null) {
                                                class56.field1140 = false;
                                            }
                                            if (class84.field1637 != null) {
                                                class143.method1019(arg0 ^ 0xFFFFFF41);
                                            }
                                            if (class38.field905 > 0 && class9.field295[82] && class9.field295[81] && class181.field3262 != 0) {
                                                int var59 = class180.field3244 - class181.field3262;
                                                if (var59 < 0) {
                                                    var59 = 0;
                                                } else if (var59 > 3) {
                                                    var59 = 3;
                                                }
                                                class16.method115(class79.field1554 + class124.field2412.field705[0], var59, class124.field2412.field707[0] + class252.field4481, (byte) 121);
                                            }
                                            if (class38.field897 != -1) {
                                                int var60 = class38.field897;
                                                int var61 = class46.field1026;
                                                if (class38.field905 > 0 && class9.field295[82] && class9.field295[81]) {
                                                    class16.method115(class79.field1554 + var61, class180.field3244, class252.field4481 + var60, (byte) 118);
                                                } else if (class118.field2321) {
                                                    class36.field809.method1356(9, true);
                                                    class36.field809.method1428((byte) -112, class20.field526);
                                                    class36.field809.method1380(class226.field4095, -2097152);
                                                    class36.field809.method1420((byte) 116, class252.field4481 + var60);
                                                    class36.field809.method1420((byte) 115, class79.field1554 + var61);
                                                    class235.field4247++;
                                                    class187.field3316 = class39.field906;
                                                    class141.field2673 = 0;
                                                    class198.field3523 = 1;
                                                    class162.field3051 = class185.field3288;
                                                } else {
                                                    boolean var62 = class48.method375(0, 0, true, class124.field2412.field707[0], var60, 0, 0, 0, var61, class124.field2412.field705[0], 0, -24761);
                                                    if (var62) {
                                                        class187.field3316 = class39.field906;
                                                        class198.field3523 = 1;
                                                        class141.field2673 = 0;
                                                        class162.field3051 = class185.field3288;
                                                    }
                                                }
                                                class118.field2321 = false;
                                                class38.field897 = -1;
                                            }
                                            class239.method1643(-5);
                                            if (class229.field4162 != var48) {
                                                if (var48 != null) {
                                                    class62.method441(-29481, var48);
                                                }
                                                if (class229.field4162 != null) {
                                                    class62.method441(arg0 ^ 0x7325, class229.field4162);
                                                }
                                            }
                                            if (class38.field901 != var49 && class238.field4290 == class214.field3872) {
                                                if (var49 != null) {
                                                    class62.method441(-29481, var49);
                                                }
                                                if (class38.field901 != null) {
                                                    class62.method441(-29481, class38.field901);
                                                }
                                            }
                                            if (class38.field901 == null) {
                                                if (class238.field4290 > 0) {
                                                    class238.field4290--;
                                                }
                                            } else if (class214.field3872 > class238.field4290) {
                                                class238.field4290++;
                                                if (class238.field4290 == class214.field3872) {
                                                    class62.method441(-29481, class38.field901);
                                                }
                                            }
                                            if (class152.field2874 == 1) {
                                                class57.method415((byte) 34);
                                            } else if (class152.field2874 == 2) {
                                                class188.method1296(-64);
                                            } else {
                                                class1.method7((byte) 10);
                                            }
                                            for (int var63 = 0; var63 < 5; var63++) {
                                                int var10002 = class50.field1051[var63]++;
                                            }
                                            int var64 = class4.method28(10);
                                            int var65 = class270.method1850(arg0 ^ 0xFFFFED23);
                                            if (var64 > 4500 && var65 > 4500) {
                                                class57.field1167++;
                                                class213.field3837 = 250;
                                                class30.method196(4000, 119);
                                                class36.field809.method1356(88, true);
                                            }
                                            if (class62.field1219 != null && class62.field1219.field613 == 1) {
                                                if (class62.field1219.field611 != null) {
                                                    class109.method778(class124.field2413, 3031, class97.field1931);
                                                }
                                                class97.field1931 = null;
                                                class62.field1219 = null;
                                                class124.field2413 = false;
                                            }
                                            class6.field165++;
                                            class157.field2955++;
                                            class56.field1144++;
                                            if (class56.field1144 > 500) {
                                                class56.field1144 = 0;
                                                int var66 = (int) (Math.random() * 8.0D);
                                                if ((var66 & 0x1) == 1) {
                                                    class80.field1571 += class137.field2615;
                                                }
                                                if ((var66 & 0x2) == 2) {
                                                    class244.field4362 += class39.field913;
                                                }
                                                if ((var66 & 0x4) == 4) {
                                                    class3.field28 += class251.field4452;
                                                }
                                            }
                                            if (class80.field1571 < -50) {
                                                class137.field2615 = 2;
                                            }
                                            if (class80.field1571 > 50) {
                                                class137.field2615 = -2;
                                            }
                                            if (class3.field28 < -40) {
                                                class251.field4452 = 1;
                                            }
                                            if (class157.field2955 > 500) {
                                                class157.field2955 = 0;
                                                int var67 = (int) (Math.random() * 8.0D);
                                                if ((var67 & 0x2) == 2) {
                                                    class76.field1515 += class234.field4228;
                                                }
                                                if ((var67 & 0x1) == 1) {
                                                    class56.field1145 += class137.field2618;
                                                }
                                            }
                                            if (class76.field1515 < -20) {
                                                class234.field4228 = 1;
                                            }
                                            if (class244.field4362 < -55) {
                                                class39.field913 = 2;
                                            }
                                            if (class244.field4362 > 55) {
                                                class39.field913 = -2;
                                            }
                                            if (class3.field28 > 40) {
                                                class251.field4452 = -1;
                                            }
                                            if (class76.field1515 > 10) {
                                                class234.field4228 = -1;
                                            }
                                            if (class56.field1145 < -60) {
                                                class137.field2618 = 2;
                                            }
                                            if (class56.field1145 > 60) {
                                                class137.field2618 = -2;
                                            }
                                            if (class6.field165 > 50) {
                                                class159.field2980++;
                                                class36.field809.method1356(118, true);
                                            }
                                            if (class229.field4149) {
                                                class124.method882(arg0 ^ 0xFFFFFFD8);
                                                class229.field4149 = false;
                                            }
                                            try {
                                                if (class248.field4415 != null && class36.field809.field3565 > 0) {
                                                    class248.field4415.method209(class36.field809.field3547, arg0 + 4914, class36.field809.field3565, 0);
                                                    class36.field809.field3565 = 0;
                                                    class6.field165 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var68) {
                                                class130.method915(-14139);
                                                return;
                                            }
                                        }
                                        var57 = var56.field1114;
                                        if (var57.field177 < 0) {
                                            break;
                                        }
                                        var58 = class25.method178(65, var57.field221);
                                    } while (var58 == null || var58.field216 == null || var57.field177 >= var58.field216.length || var58.field216[var57.field177] != var57);
                                    class59.method427(var56, 200000);
                                }
                            }
                            var54 = var53.field1114;
                            if (var54.field177 < 0) {
                                break;
                            }
                            var55 = class25.method178(124, var54.field221);
                        } while (var55 == null || var55.field216 == null || var54.field177 >= var55.field216.length || var55.field216[var54.field177] != var54);
                        class59.method427(var53, arg0 + 200014);
                    }
                }
                var51 = var50.field1114;
                if (var51.field177 < 0) {
                    break;
                }
                var52 = class25.method178(88, var51.field221);
            } while (var52 == null || var52.field216 == null || var51.field177 >= var52.field216.length || var52.field216[var51.field177] != var51);
            class59.method427(var50, 200000);
        }
    }

    @OriginalMember(owner = "client!d", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field4118++;
        if (class75.field1502 != null) {
            class147.field2767 = 0;
            class234.field4234 = arg0.getX();
            class46.field1016 = arg0.getY();
            class171.field3163 = class253.method1711((byte) -120);
            if (arg0.isMetaDown()) {
                class211.field3817 = 2;
                class180.field3240 = 2;
            } else {
                class211.field3817 = 1;
                class180.field3240 = 1;
            }
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(B)V")
    public static void method1589(byte arg0) {
        field4112 = null;
        int var1 = -104 / ((arg0 - 5) / 34);
        field4114 = null;
        field4109 = null;
    }

    @OriginalMember(owner = "client!d", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field4115++;
        if (class75.field1502 != null) {
            class180.field3240 = 0;
        }
    }

    @OriginalMember(owner = "client!d", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field4113++;
        if (class75.field1502 != null) {
            class147.field2767 = 0;
            class150.field2804 = arg0.getX();
            class105.field2014 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!d", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field4111++;
    }
}
