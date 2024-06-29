import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class296 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!fo", name = "h", descriptor = "I")
    public static int field4656 = 0;

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "F")
    public static float field4650 = 0.0F;

    @OriginalMember(owner = "client!fo", name = "r", descriptor = "Ljava/lang/String;")
    public static String field4666 = "";

    @OriginalMember(owner = "client!fo", name = "g", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field4655 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!fo", name = "t", descriptor = "I")
    public static int field4668 = 0;

    @OriginalMember(owner = "client!fo", name = "u", descriptor = "[I")
    public static int[] field4669 = new int[500];

    @OriginalMember(owner = "client!fo", name = "s", descriptor = "I")
    public static int field4667 = 0;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "I")
    public static int field4649;

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "I")
    public static int field4651;

    @OriginalMember(owner = "client!fo", name = "e", descriptor = "I")
    public static int field4653;

    @OriginalMember(owner = "client!fo", name = "f", descriptor = "I")
    public static int field4654;

    @OriginalMember(owner = "client!fo", name = "i", descriptor = "I")
    public static int field4657;

    @OriginalMember(owner = "client!fo", name = "j", descriptor = "I")
    public static int field4658;

    @OriginalMember(owner = "client!fo", name = "k", descriptor = "I")
    public static int field4659;

    @OriginalMember(owner = "client!fo", name = "l", descriptor = "I")
    public static int field4660;

    @OriginalMember(owner = "client!fo", name = "m", descriptor = "I")
    public static int field4661;

    @OriginalMember(owner = "client!fo", name = "n", descriptor = "I")
    public static int field4662;

    @OriginalMember(owner = "client!fo", name = "o", descriptor = "I")
    public static int field4663;

    @OriginalMember(owner = "client!fo", name = "p", descriptor = "I")
    public static int field4664;

    @OriginalMember(owner = "client!fo", name = "q", descriptor = "I")
    public static int field4665;

    @OriginalMember(owner = "client!fo", name = "d", descriptor = "[[Lob;")
    public static class322[][] field4652;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(B)V", line = 5)
    public static void method2100(byte arg0) {
        if (arg0 != -23) {
            method2102(false);
        }
        field4669 = null;
        field4655 = null;
        field4666 = null;
        field4652 = (class322[][]) null;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(II)V", line = 18)
    public static final void method2101(int arg0, int arg1) {
        field4657++;
        if (arg1 <= 38) {
            field4667 = 40;
        }
        class168.field2579 = -1;
        class168.field2579 = -1;
        class63.field752 = arg0;
        class349.method2424((byte) 113);
    }

    @OriginalMember(owner = "client!fo", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 34)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class101.field1354 != null) {
            class360.field5706 = 0;
        }
        field4651++;
    }

    @OriginalMember(owner = "client!fo", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 54)
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field4661++;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Z)V", line = 64)
    public static final void method2102(boolean arg0) {
        field4662++;
        if (class246.field3866 == 164) {
            int var1 = class282.field4499.method1051(1);
            if (var1 == 65535) {
                var1 = -1;
            }
            int var2 = class282.field4499.method1046(2);
            int var3 = ((var2 & 0x7E) >> 4) + class41.field452;
            int var4 = (var2 & 0x7) + class30.field356;
            int var5 = class282.field4499.method1043(true);
            int var6 = var5 & 0x3;
            int var7 = var5 >> 2;
            int var8 = class346.field5487[var7];
            class95.method620(class219.field3290, var7, var8, (byte) -122, var6, var3, var4, var1);
        } else if (class246.field3866 == 73) {
            int var147 = class282.field4499.method1043(!arg0);
            int var148 = (var147 >> 4 & 0x7) + class41.field452;
            int var149 = class30.field356 + (var147 & 0x7);
            int var150 = class282.field4499.method1051(1);
            int var151 = class282.field4499.method1043(true);
            int var152 = class282.field4499.method1051(1);
            if (var148 >= 0 && var149 >= 0 && var148 < 104 && var149 < 104) {
                int var153 = var149 * 128 + 64;
                int var154 = var148 * 128 + 64;
                class227 var155 = new class227(var150, class219.field3290, var154, var153, class14.method80(var153, class219.field3290, var154, (byte) -126) - var151, var152, class102.field1381);
                class91.field1197.method1814(new class110(var155), !arg0);
            }
        } else if (class246.field3866 == 3) {
            int var9 = class282.field4499.method1043(true);
            int var10 = (var9 >> 4 & 0xF) + class41.field452 * 2;
            int var11 = class30.field356 * 2 + (var9 & 0xF);
            int var12 = class282.field4499.method1028(79030408) + var10;
            int var13 = class282.field4499.method1028(79030408) + var11;
            int var14 = class282.field4499.method1021(-1);
            int var15 = class282.field4499.method1051(1);
            int var16 = class282.field4499.method1043(true) * 4;
            int var17 = class282.field4499.method1043(true) * 4;
            int var18 = class282.field4499.method1051(1);
            int var19 = class282.field4499.method1051(1);
            int var20 = class282.field4499.method1043(true);
            if (var20 == 255) {
                var20 = -1;
            }
            int var21 = class282.field4499.method1043(true);
            if (var10 >= 0 && var11 >= 0 && var10 < 208 && var11 < 208 && var12 >= 0 && var13 >= 0 && var12 < 208 && var13 < 208 && var15 != 65535) {
                int var22 = var12 * 64;
                int var23 = var13 * 64;
                int var24 = var11 * 64;
                int var25 = var10 * 64;
                class349 var26 = new class349(var15, class219.field3290, var25, var24, class14.method80(var24, class219.field3290, var25, (byte) -126) - var16, class102.field1381 + var18, class102.field1381 + var19, var20, var21, var14, var17);
                var26.method2416(var22, class102.field1381 + var18, -var17 + class14.method80(var23, class219.field3290, var22, (byte) -126), -73, var23);
                class50.field570.method1814(new class298(var26), true);
            }
        } else if (class246.field3866 == 149) {
            int var27 = class282.field4499.method1043(!arg0);
            int var28 = (var27 & 0x7) + class30.field356;
            int var29 = ((var27 & 0x76) >> 4) + class41.field452;
            int var30 = class282.field4499.method1051(1);
            int var31 = class282.field4499.method1051(1);
            int var32 = class282.field4499.method1051(1);
            if (var29 >= 0 && var28 >= 0 && var29 < 104 && var28 < 104) {
                class257 var33 = class345.field5472[class219.field3290][var29][var28];
                if (var33 != null) {
                    for (class91 var34 = (class91) var33.method1812(1); var34 != null; var34 = (class91) var33.method1809(128)) {
                        class339 var35 = var34.field1193;
                        if ((var30 & 0x7FFF) == var35.field5409 && var35.field5406 == var31) {
                            var35.field5406 = var32;
                            break;
                        }
                    }
                    class130.method893(var29, var28, -99999999);
                }
            }
        } else if (class246.field3866 == 153) {
            int var140 = class282.field4499.method1043(true);
            int var141 = (var140 >> 4 & 0x7) + class41.field452;
            int var142 = (var140 & 0x7) + class30.field356;
            int var143 = class282.field4499.method1059((byte) 72);
            int var144 = var143 >> 2;
            int var145 = class346.field5487[var144];
            int var146 = var143 & 0x3;
            if (var141 >= 0 && var142 >= 0 && var141 < 104 && var142 < 104) {
                class13.method74(var145, var146, -1, var141, 0, -120, class219.field3290, var144, var142, -1);
            }
        } else if (class246.field3866 == 121) {
            int var134 = class282.field4499.method1046(2);
            int var135 = class41.field452 + ((var134 & 0x74) >> 4);
            int var136 = (var134 & 0x7) + class30.field356;
            int var137 = class282.field4499.method1048(74);
            int var138 = class282.field4499.method1048(76);
            if (var135 >= 0 && var136 >= 0 && var135 < 104 && var136 < 104) {
                class339 var139 = new class339();
                var139.field5409 = var137;
                var139.field5406 = var138;
                if (class345.field5472[class219.field3290][var135][var136] == null) {
                    class345.field5472[class219.field3290][var135][var136] = new class257();
                }
                class345.field5472[class219.field3290][var135][var136].method1814(new class91(var139), !arg0);
                class130.method893(var135, var136, -99999999);
            }
        } else if (class246.field3866 == 188) {
            int var36 = class282.field4499.method1043(true);
            int var37 = (var36 & 0x7) + class30.field356;
            int var38 = (var36 >> 4 & 0x7) + class41.field452;
            int var39 = class282.field4499.method1051(1);
            int var40 = class282.field4499.method1043(!arg0);
            int var41 = var40 & 0x7;
            int var42 = (var40 & 0xFD) >> 4;
            int var43 = class282.field4499.method1043(!arg0);
            if (var39 == 65535) {
                var39 = -1;
            }
            int var44 = class282.field4499.method1043(true);
            if (var38 >= 0 && var37 >= 0 && var38 < 104 && var37 < 104) {
                int var45 = var42 + 1;
                if (class11.field113.field3747[0] >= var38 - var45 && (var38 + var45) >= class11.field113.field3747[0] && (var37 - var45) <= class11.field113.field3786[0] && var37 + var45 >= class11.field113.field3786[0] && class213.field3240 != 0 && var41 > 0 && class298.field4681 < 50 && var39 != -1) {
                    class187.field2811[class298.field4681] = var39;
                    class88.field1161[class298.field4681] = var41;
                    class14.field150[class298.field4681] = var43;
                    class247.field3913[class298.field4681] = null;
                    class87.field1144[class298.field4681] = (var37 << 8) + (var38 << 16) + var42;
                    class327.field5239[class298.field4681] = var44;
                    class298.field4681++;
                }
            }
        } else if (class246.field3866 == 127) {
            int var46 = class282.field4499.method1043(true);
            int var47 = (var46 >> 4 & 0x7) + class41.field452;
            int var48 = (var46 & 0x7) + class30.field356;
            int var49 = var47 + class282.field4499.method1028(79030408);
            int var50 = var48 + class282.field4499.method1028(79030408);
            int var51 = class282.field4499.method1021(-1);
            int var52 = class282.field4499.method1051(1);
            int var53 = class282.field4499.method1043(true) * 4;
            int var54 = class282.field4499.method1043(!arg0) * 4;
            int var55 = class282.field4499.method1051(1);
            int var56 = class282.field4499.method1051(1);
            int var57 = class282.field4499.method1043(true);
            if (var57 == 255) {
                var57 = -1;
            }
            int var58 = class282.field4499.method1043(true);
            if (var47 >= 0 && var48 >= 0 && var47 < 104 && var48 < 104 && var49 >= 0 && var50 >= 0 && var49 < 104 && var50 < 104 && var52 != 65535) {
                int var59 = var49 * 128 + 64;
                int var60 = var50 * 128 + 64;
                int var61 = var48 * 128 + 64;
                int var62 = var47 * 128 + 64;
                class349 var63 = new class349(var52, class219.field3290, var62, var61, class14.method80(var61, class219.field3290, var62, (byte) -126) - var53, class102.field1381 + var55, class102.field1381 + var56, var57, var58, var51, var54);
                var63.method2416(var59, var55 + class102.field1381, -var54 + class14.method80(var60, class219.field3290, var59, (byte) -126), -61, var60);
                class50.field570.method1814(new class298(var63), true);
            }
        } else if (class246.field3866 == 182) {
            int var64 = class282.field4499.method1051(1);
            int var65 = class282.field4499.method1043(true);
            class123.method795(0, var64).method1625(-4, var65);
        } else if (class246.field3866 == 36) {
            int var127 = class282.field4499.method1031(false);
            int var128 = class282.field4499.method1051(1);
            int var129 = class282.field4499.method1048(42);
            int var130 = class282.field4499.method1059((byte) 110);
            int var131 = class41.field452 + (var130 >> 4 & 0x7);
            int var132 = (var130 & 0x7) + class30.field356;
            if (var131 >= 0 && var132 >= 0 && var131 < 104 && var132 < 104 && class50.field573 != var128) {
                class339 var133 = new class339();
                var133.field5409 = var129;
                var133.field5406 = var127;
                if (class345.field5472[class219.field3290][var131][var132] == null) {
                    class345.field5472[class219.field3290][var131][var132] = new class257();
                }
                class345.field5472[class219.field3290][var131][var132].method1814(new class91(var133), true);
                class130.method893(var131, var132, -99999999);
            }
        } else if (class246.field3866 == 54) {
            int var121 = class282.field4499.method1059((byte) 98);
            int var122 = class41.field452 + (var121 >> 4 & 0x7);
            int var123 = class30.field356 + (var121 & 0x7);
            int var124 = class282.field4499.method1031(false);
            if (var122 >= 0 && var123 >= 0 && var122 < 104 && var123 < 104) {
                class257 var125 = class345.field5472[class219.field3290][var122][var123];
                if (var125 != null) {
                    for (class91 var126 = (class91) var125.method1812(1); var126 != null; var126 = (class91) var125.method1809(128)) {
                        if ((var124 & 0x7FFF) == var126.field1193.field5409) {
                            var126.method1290(-9);
                            break;
                        }
                    }
                    if (var125.method1812(1) == null) {
                        class345.field5472[class219.field3290][var122][var123] = null;
                    }
                    class130.method893(var122, var123, -99999999);
                }
            }
        } else if (class246.field3866 == 135) {
            int var66 = class282.field4499.method1043(!arg0);
            int var67 = var66 & 0x3;
            int var68 = var66 >> 2;
            int var69 = class346.field5487[var68];
            int var70 = class282.field4499.method1059((byte) 63);
            int var71 = (var70 & 0x7) + class30.field356;
            int var72 = (var70 >> 4 & 0x7) + class41.field452;
            int var73 = class282.field4499.method1032(0);
            if (var72 >= 0 && var71 >= 0 && var72 < 104 && var71 < 104) {
                class13.method74(var69, var67, var73, var72, 0, -109, class219.field3290, var68, var71, -1);
            }
        } else {
            if (arg0) {
                method2101(-122, 2);
            }
            if (class246.field3866 == 101) {
                byte var74 = class282.field4499.method1029(32193);
                byte var75 = class282.field4499.method1029(32193);
                byte var76 = class282.field4499.method1029(32193);
                int var77 = class282.field4499.method1048(-110);
                byte var78 = class282.field4499.method1036(942099376);
                int var79 = class282.field4499.method1051(1);
                int var80 = class282.field4499.method1001(true);
                int var81 = class282.field4499.method1048(-81);
                int var82 = class282.field4499.method1059((byte) 111);
                int var83 = class41.field452 + (var82 >> 4 & 0x7);
                int var84 = (var82 & 0x7) + class30.field356;
                int var85 = class282.field4499.method1046(2);
                int var86 = var85 & 0x3;
                int var87 = var85 >> 2;
                if (!class272.field4317) {
                    class214.method1496(var74, var84, var78, var79, var81, var75, var83, var87, var80, var86, var76, (byte) -78, var77);
                }
            }
            if (class246.field3866 == 205) {
                int var88 = class282.field4499.method1043(true);
                int var89 = (var88 & 0xF) + class30.field356 * 2;
                int var90 = class41.field452 * 2 + ((var88 & 0xF1) >> 4);
                int var91 = var90 + class282.field4499.method1028(79030408);
                int var92 = class282.field4499.method1028(79030408) + var89;
                int var93 = class282.field4499.method1021(-1);
                int var94 = class282.field4499.method1021(-1);
                int var95 = class282.field4499.method1051(1);
                int var96 = class282.field4499.method1028(79030408);
                int var97 = class282.field4499.method1043(!arg0) * 4;
                int var98 = class282.field4499.method1051(1);
                int var99 = class282.field4499.method1051(1);
                int var100 = class282.field4499.method1043(true);
                int var101 = class282.field4499.method1043(!arg0);
                if (var100 == 255) {
                    var100 = -1;
                }
                if (var90 >= 0 && var89 >= 0 && var90 < 208 && var89 < 208 && var91 >= 0 && var92 >= 0 && var91 < 208 && var92 < 208 && var95 != 65535) {
                    int var102 = var91 * 64;
                    int var103 = var90 * 64;
                    int var104 = var92 * 64;
                    int var105 = var89 * 64;
                    if (var93 != 0) {
                        int var107;
                        class242 var109;
                        if (var93 < 0) {
                            int var106 = -var93 - 1;
                            var107 = (var106 & 0x7DFB) >> 11;
                            int var108 = var106 & 0x7FF;
                            if (class50.field573 == var108) {
                                var109 = class11.field113;
                            } else {
                                var109 = class105.field1443[var108];
                            }
                        } else {
                            int var110 = var93 - 1;
                            var107 = var110 >> 11 & 0xF;
                            int var111 = var110 & 0x7FF;
                            var109 = class251.field3974[var111];
                        }
                        if (var109 != null) {
                            class282 var112 = var109.method1719(-1);
                            if (var112.field4485 != null && var112.field4485[var107] != null) {
                                var96 -= var112.field4485[var107][1];
                                int var113 = var112.field4485[var107][0];
                                int var114 = class104.field1426[var109.field3760];
                                int var115 = var112.field4485[var107][2];
                                int var116 = class104.field1435[var109.field3760];
                                int var117 = var114 * var115 + (var113 * var116) >> 16;
                                int var118 = var115 * var116 - var113 * var114 >> 16;
                                var105 += var118;
                                var103 += var117;
                            }
                        }
                    }
                    class349 var120 = new class349(var95, class219.field3290, var103, var105, class14.method80(var105, class219.field3290, var103, (byte) -126) - var96, var98 - -class102.field1381, class102.field1381 + var99, var100, var101, var94, var97);
                    var120.method2416(var102, var98 + class102.field1381, class14.method80(var104, class219.field3290, var102, (byte) -126) + -var97, -116, var104);
                    class50.field570.method1814(new class298(var120), !arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fo", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 660)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class101.field1354 != null) {
            class304.field4737 = 0;
            class360.field5706 = 0;
            int var2 = arg0.getModifiers();
            if ((var2 & 0x10) != 0) {
            }
            if ((var2 & 0x8) == 0) {
            }
            if ((var2 & 0x4) != 0) {
            }
        }
        field4653++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!fo", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 693)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field4659++;
        if (class101.field1354 != null) {
            class304.field4737 = 0;
            class88.field1163 = arg0.getX();
            class44.field493 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!fo", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 713)
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class101.field1354 != null) {
            class304.field4737 = 0;
            class170.field2598 = arg0.getX();
            class169.field2587 = arg0.getY();
            class145.field2310 = class9.method57(-14133);
            if (arg0.isMetaDown()) {
                class337.field5378 = 2;
                class360.field5706 = 2;
            } else {
                class337.field5378 = 1;
                class360.field5706 = 1;
            }
            int var2 = arg0.getModifiers();
            if ((var2 & 0x4) != 0) {
            }
            if ((var2 & 0x10) != 0) {
            }
            if ((var2 & 0x8) == 0) {
            }
        }
        field4663++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!fo", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 761)
    public final synchronized void mouseExited(MouseEvent arg0) {
        field4664++;
        if (class101.field1354 != null) {
            class304.field4737 = 0;
            class88.field1163 = -1;
            class44.field493 = -1;
        }
    }

    @OriginalMember(owner = "client!fo", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 781)
    public final void focusGained(FocusEvent arg0) {
        field4660++;
    }

    @OriginalMember(owner = "client!fo", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 792)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field4649++;
        if (class101.field1354 != null) {
            class304.field4737 = 0;
            class88.field1163 = arg0.getX();
            class44.field493 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!fo", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 819)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class101.field1354 != null) {
            class304.field4737 = 0;
            class88.field1163 = arg0.getX();
            class44.field493 = arg0.getY();
        }
        field4654++;
    }

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "(B)V", line = 838)
    public static final void method2103(byte arg0) {
        class112.field1565 = "jaune:";
        class309.field4808 = "Fermer";
        class256.field4046 = "Chargement de la liste des serveurs";
        class311.field4885 = "tremblement:";
        class322.field5007 = "Prendre";
        class226.field3422 = "Librairie 3D démarrée";
        class32.field374 = "Votre liste noire est pleine (100 noms maximum).";
        class174.field2628 = "Chargement en cours. Veuillez patienter.";
        class99.field1341 = "Annuler";
        class332.field5316 = "brillant2:";
        class54.field621 = "Chargement en cours...";
        class102.field1379 = "Connexion perdue.";
        class108.field1479 = " de votre liste d'amis.";
        class331.field5305 = "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).";
        class171.field2604 = "brillant1:";
        class185.field2795 = " autres options";
        class181.field2731 = "Chargement des interfaces - ";
        class5.field51 = "Chargement des sprites - ";
        class237.field3640 = "Chargement des polices - ";
        class247.field3916 = "Vérification des mises à jour - ";
        class77.field1004 = "Vous ne pouvez pas ajouter votre nom à votre liste noire.";
        class293.field4617 = "Veuillez commencer par supprimer ";
        class60.field711 = "Atteindre";
        class28.field341 = "Écran-titre chargé";
        class77.field1005 = "Sprites chargés";
        class325.field5218 = "Monde de jeu créé";
        class274.field4344 = "cyan:";
        class6.field73 = "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.";
        class291.field4584 = "Examiner";
        class106.field1462 = "Sélectionner";
        class35.field393 = "Impossible de trouver ";
        class316.field4954 = "Veuillez patienter - tentative de rétablissement.";
        class321.field4988 = "Textures chargées";
        class357.field5672 = " ";
        class212.field3226 = "Regarder dans cette direction";
        class259.field4096 = "Mémoire attribuée";
        class180.field2698 = " est déjà dans votre liste d'amis.";
        class125.field1776 = "ondulation:";
        class210.field3170 = "déroulement:";
        class355.field5648 = "niveau ";
        class25.field294 = "classement ";
        class246.field3873 = "M";
        class106.field1464 = "Objet d'abonnés";
        class247.field3918 = "Interfaces chargées";
        class228.field3455 = "vert:";
        class353.field5635 = " est déjà dans votre liste noire.";
        class220.field3311 = "ondulation2:";
        class233.field3523 = "Paramètres par défaut chargés";
        class355.field5647 = "Démarrage de la librairie 3D";
        class109.field1491 = "OK";
        class16.field170 = "clignotant3:";
        class146.field2314 = "Connexion au serveur de mise à jour en cours";
        class258.field4077 = "Écran-titre ouvert";
        class300.field4686 = "Mémoire en cours d'attribution";
        class6.field69 = "Veuillez patienter...";
        class73.field912 = "clignotant1:";
        class74.field942 = "K";
        class19.field235 = " s'est connecté.";
        class63.field756 = " s'est déconnecté.";
        class70.field878 = "Chargement de RuneScape en cours - veuillez patienter...";
        class265.field4185 = "voudrait faire un échange avec vous.";
        class179.field2686 = "Chargement de l'écran-titre - ";
        class308.field4788 = "M";
        class291.field4580 = "compétence ";
        if (arg0 != -94) {
            field4652 = (class322[][]) ((class322[][]) null);
        }
        class110.field1513 = "Choisir une option";
        class274.field4340 = "violet:";
        class331.field5303 = "Chargement des fichiers config - ";
        class314.field4915 = " de votre liste noire.";
        class192.field2879 = "Moteur son préparé";
        class154.field2438 = "Liste des mises à jour chargée";
        class226.field3417 = "blanc:";
        class107.field1475 = "Chargement du module texte - ";
        class93.field1253 = "Liste des serveurs chargée";
        class79.field1054 = "brillant3:";
        class290.field4571 = "Continuer";
        class50.field576 = "Utiliser";
        field4658++;
        class188.field2838 = "Caché";
        class12.field122 = "Chargement des textures - ";
        class333.field5327 = "Poser";
        class91.field1201 = "Attaquer";
        class223.field3381 = "Gestionnaire de saisie chargé";
        class184.field2771 = "Veuillez commencer par supprimer ";
        class7.field83 = "glissement:";
        class166.field2563 = "Connecté au serveur de mise à jour";
        class156.field2450 = "Chargement des paramètres par défaut - ";
        class120.field1668 = "clignotant2:";
        class135.field2025 = "Jeter";
        class236.field3638 = "K";
        class232.field3511 = "rouge:";
        class263.field4174 = "Chargement de Mechscape en cours - veuillez patienter...";
        class106.field1461 = "Module texte chargé";
        class180.field2710 = "Polices chargées";
        class126.field1790 = "Fichiers config chargés";
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(BI)Z", line = 1175)
    public static final boolean method2104(byte arg0, int arg1) {
        field4665++;
        if (class251.field3975[arg1]) {
            return true;
        } else if (!class127.field1861.method118(2, arg1)) {
            return false;
        } else if (arg0 == -64) {
            int var2 = class127.field1861.method110(false, arg1);
            if (var2 == 0) {
                class251.field3975[arg1] = true;
                return true;
            }
            if (class232.field3512[arg1] == null) {
                class232.field3512[arg1] = new class323[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class232.field3512[arg1][var3] == null) {
                    byte[] var4 = class127.field1861.method100(arg1, var3, (byte) -107);
                    if (var4 != null) {
                        class323 var5 = class232.field3512[arg1][var3] = new class323();
                        var5.field5073 = (arg1 << 16) + var3;
                        if (var4[0] == -1) {
                            var5.method2245(arg0 + 62, new class143(var4));
                        } else {
                            var5.method2250(new class143(var4), -1880);
                        }
                    }
                }
            }
            class251.field3975[arg1] = true;
            return true;
        } else {
            return true;
        }
    }
}
