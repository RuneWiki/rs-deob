import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class175 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!k", name = "j", descriptor = "Lpj;")
    public static class237 field3070 = class33.method353("(U", 69);

    @OriginalMember(owner = "client!k", name = "l", descriptor = "Lpj;")
    public static class237 field3072 = class33.method353("gleiten:", 52);

    @OriginalMember(owner = "client!k", name = "m", descriptor = "S")
    public static short field3073 = 1;

    @OriginalMember(owner = "client!k", name = "r", descriptor = "Lpj;")
    public static class237 field3078 = class33.method353("Benutzeroberfl-=che geladen)3", 63);

    @OriginalMember(owner = "client!k", name = "a", descriptor = "I")
    public static int field3061;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "I")
    public static int field3062;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "I")
    public static int field3064;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "I")
    public static int field3065;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "I")
    public static int field3066;

    @OriginalMember(owner = "client!k", name = "g", descriptor = "I")
    public static int field3067;

    @OriginalMember(owner = "client!k", name = "h", descriptor = "I")
    public static int field3068;

    @OriginalMember(owner = "client!k", name = "i", descriptor = "I")
    public static int field3069;

    @OriginalMember(owner = "client!k", name = "k", descriptor = "I")
    public static int field3071;

    @OriginalMember(owner = "client!k", name = "n", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!k", name = "o", descriptor = "I")
    public static int field3075;

    @OriginalMember(owner = "client!k", name = "p", descriptor = "I")
    public static int field3076;

    @OriginalMember(owner = "client!k", name = "q", descriptor = "I")
    public static int field3077;

    @OriginalMember(owner = "client!k", name = "s", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "[I")
    public static int[] field3063;

    @OriginalMember(owner = "client!k", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field3065++;
        if (class210.field3585 != null) {
            class24.field441 = 0;
            class260.field4456 = arg0.getX();
            class114.field2009 = arg0.getY();
            class105.field1853 = class181.method1244((byte) -23);
            if (arg0.isMetaDown()) {
                class271.field4661 = 2;
                class135.field2356 = 2;
            } else {
                class271.field4661 = 1;
                class135.field2356 = 1;
            }
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lpj;Lw;I)Lpj;")
    public static final class237 method1209(class237 arg0, class141 arg1, int arg2) {
        if (arg0.method1604((byte) 109, field3070) != -1) {
            label62: while (true) {
                int var3 = arg0.method1604((byte) 118, class210.field3589);
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg0.method1604((byte) 124, class160.field2883);
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg0.method1604((byte) 86, class231.field3980);
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg0.method1604((byte) 53, class107.field1912);
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg0.method1604((byte) 37, class80.field1512);
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg0.method1604((byte) 70, class120.field2115);
                                                        if (var8 == -1) {
                                                            break label62;
                                                        }
                                                        class237 var9 = class239.field4202;
                                                        if (class208.field3545 != null) {
                                                            var9 = class139.method959(false, class208.field3545.field1824);
                                                            try {
                                                                if (class208.field3545.field1826 != null) {
                                                                    byte[] var10 = ((String) class208.field3545.field1826).getBytes("ISO-8859-1");
                                                                    var9 = class97.method723(0, var10.length, (byte) -91, var10);
                                                                }
                                                            } catch (UnsupportedEncodingException var11) {
                                                            }
                                                        }
                                                        arg0 = class238.method1626(new class237[] { arg0.method1620(83, var8, 0), var9, arg0.method1610(var8 + 4, arg2 ^ 0xFFFFB1EA) }, -39);
                                                    }
                                                }
                                                arg0 = class238.method1626(new class237[] { arg0.method1620(77, var7, 0), class53.method472(arg2 - 999979922, class101.method768(4, 709041672, arg1)), arg0.method1610(var7 + 2, 117) }, arg2 ^ 0x4E48);
                                            }
                                        }
                                        arg0 = class238.method1626(new class237[] { arg0.method1620(90, var6, 0), class53.method472(-1000000000, class101.method768(3, 709041672, arg1)), arg0.method1610(var6 + 2, 117) }, -93);
                                    }
                                }
                                arg0 = class238.method1626(new class237[] { arg0.method1620(arg2 ^ 0xFFFFB1AD, var5, 0), class53.method472(-1000000000, class101.method768(2, 709041672, arg1)), arg0.method1610(var5 + 2, arg2 + 20197) }, arg2 + 19997);
                            }
                        }
                        arg0 = class238.method1626(new class237[] { arg0.method1620(107, var4, 0), class53.method472(-1000000000, class101.method768(1, arg2 + 709061750, arg1)), arg0.method1610(var4 + 2, 118) }, -34);
                    }
                }
                arg0 = class238.method1626(new class237[] { arg0.method1620(94, var3, 0), class53.method472(-1000000000, class101.method768(0, 709041672, arg1)), arg0.method1610(var3 + 2, 123) }, -104);
            }
        }
        if (arg2 != -20078) {
            field3070 = null;
        }
        field3077++;
        return arg0;
    }

    @OriginalMember(owner = "client!k", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field3074++;
        if (class210.field3585 != null) {
            class24.field441 = 0;
            class208.field3544 = -1;
            class106.field1880 = -1;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIBIII)I")
    public static final int method1210(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        if ((arg4 & 0x1) == 1) {
            int var7 = arg0;
            arg0 = arg2;
            arg2 = var7;
        }
        if (arg3 != -89) {
            method1212((class237) null, (class237) null, (byte) -56, 47);
        }
        int var8 = arg5 & 0x3;
        field3062++;
        if (var8 == 0) {
            return arg6;
        } else if (var8 == 1) {
            return arg1;
        } else if (var8 == 2) {
            return 1 + 7 - arg0 - arg6;
        } else {
            return 1 + 7 - arg1 - arg2;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V")
    public static void method1211(int arg0) {
        if (arg0 != 29421) {
            field3063 = null;
        }
        field3078 = null;
        field3063 = null;
        field3070 = null;
        field3072 = null;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lpj;Lpj;BI)V")
    public static final void method1212(class237 arg0, class237 arg1, byte arg2, int arg3) {
        if (arg2 <= 97) {
            method1210(-101, -1, 51, (byte) -111, 117, -120, -59);
        }
        class220.method1467(arg0, arg1, 1, -1, (class237) null, arg3);
        field3068++;
    }

    @OriginalMember(owner = "client!k", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field3079++;
    }

    @OriginalMember(owner = "client!k", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field3071++;
        if (class210.field3585 != null) {
            class24.field441 = 0;
            class208.field3544 = arg0.getX();
            class106.field1880 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!k", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field3075++;
        if (class210.field3585 != null) {
            class135.field2356 = 0;
        }
    }

    @OriginalMember(owner = "client!k", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field3066++;
        if (class210.field3585 != null) {
            class24.field441 = 0;
            class135.field2356 = 0;
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!k", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field3069++;
        if (class210.field3585 != null) {
            class24.field441 = 0;
            class208.field3544 = arg0.getX();
            class106.field1880 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!k", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field3061++;
    }

    @OriginalMember(owner = "client!k", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field3067++;
        if (class210.field3585 != null) {
            class24.field441 = 0;
            class208.field3544 = arg0.getX();
            class106.field1880 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(B)V")
    public static final void method1213(byte arg0) {
        field3064++;
        if (class209.field3571 == 133) {
            int var1 = class65.field1288.method316((byte) 120);
            int var2 = (var1 >> 4 & 0x7) + class237.field4150;
            int var3 = (var1 & 0x7) + class27.field495;
            int var4 = class65.field1288.method339(-16777216);
            int var5 = class65.field1288.method339(-16777216);
            int var6 = class65.field1288.method339(-16777216);
            if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
                class88 var7 = class32.field674[class274.field4798][var2][var3];
                if (var7 != null) {
                    for (class10 var8 = (class10) var7.method673(false); var8 != null; var8 = (class10) var7.method680(109)) {
                        class54 var9 = var8.field195;
                        if ((var4 & 0x7FFF) == var9.field1129 && var9.field1124 == var5) {
                            var9.field1124 = var6;
                            break;
                        }
                    }
                    class169.method1175(54, var3, var2);
                }
            }
            return;
        }
        if (class209.field3571 == 243) {
            byte var10 = class65.field1288.method325(-92);
            byte var11 = class65.field1288.method307((byte) -46);
            int var12 = class65.field1288.method295(14179);
            int var13 = class27.field495 + (var12 & 0x7);
            int var14 = class237.field4150 + ((var12 & 0x7B) >> 4);
            int var15 = class65.field1288.method343((byte) 73);
            int var16 = var15 & 0x3;
            int var17 = var15 >> 2;
            int var18 = class71.field1396[var17];
            byte var19 = class65.field1288.method325(-102);
            byte var20 = class65.field1288.method330(1);
            int var21 = class65.field1288.method339(-16777216);
            int var22 = class65.field1288.method339(-16777216);
            int var23 = class65.field1288.method339(-16777216);
            int var24 = class65.field1288.method321((byte) 60);
            class271 var25;
            if (class272.field4679 == var23) {
                var25 = class229.field3911;
            } else {
                var25 = class232.field4025[var23];
            }
            if (var25 != null) {
                class28 var26 = class94.method700(90, var21);
                int var27;
                int var28;
                if (var16 == 1 || var16 == 3) {
                    var27 = var26.field571;
                    var28 = var26.field507;
                } else {
                    var27 = var26.field507;
                    var28 = var26.field571;
                }
                int var29 = (var27 >> 1) + var14;
                int var30 = (var27 + 1 >> 1) + var14;
                int var31 = var13 + (var28 + 1 >> 1);
                int[][] var32 = class99.field1773[class274.field4798];
                int var33 = (var28 >> 1) + var13;
                int var34 = var32[var29][var33] + var32[var29][var31] + var32[var30][var31] + var32[var30][var33] >> 2;
                int[][] var35 = null;
                if (class274.field4798 < 3) {
                    var35 = class99.field1773[class274.field4798 + 1];
                }
                int var36 = (var13 << 7) + (var28 << 6);
                int var37 = (var14 << 7) + (var27 << 6);
                class129 var38 = var26.method264(var17, (class154) null, var36, false, var26.field561, var32, (byte) -28, var34, var37, var35, var16);
                if (var38 != null) {
                    class129.method914(var24 + 1, var14, -127, var18, var13, class274.field4798, 0, var22 + 1, 0, -1);
                    if (var20 < var11) {
                        byte var39 = var11;
                        var11 = var20;
                        var20 = var39;
                    }
                    var25.field4634 = var13 * 128 + var28 * 64;
                    var25.field4670 = var14 + var20;
                    var25.field4642 = var34;
                    var25.field4638 = class241.field4246 + var24;
                    var25.field4659 = (class201) var38.field2256;
                    var25.field4656 = var14 + var11;
                    var25.field4663 = var14 * 128 + (var27 * 64);
                    var25.field4636 = class241.field4246 + var22;
                    if (var10 > var19) {
                        byte var40 = var10;
                        var10 = var19;
                        var19 = var40;
                    }
                    var25.field4672 = var10 + var13;
                    var25.field4674 = var13 + var19;
                }
            }
        }
        if (class209.field3571 == 166) {
            int var41 = class65.field1288.method343((byte) 63);
            int var42 = class237.field4150 + ((var41 & 0x73) >> 4);
            int var43 = (var41 & 0x7) + class27.field495;
            int var44 = class65.field1288.method316((byte) -29);
            int var45 = var44 & 0x3;
            int var46 = var44 >> 2;
            int var47 = class71.field1396[var46];
            int var48 = class65.field1288.method321((byte) 107);
            if (var48 == 65535) {
                var48 = -1;
            }
            class97.method734(var46, 2, class274.field4798, var47, var45, var43, var48, var42);
        } else if (class209.field3571 == 117) {
            int var49 = class65.field1288.method316((byte) 113);
            int var50 = (var49 & 0x7) + class27.field495;
            int var51 = (var49 >> 4 & 0x7) + class237.field4150;
            int var52 = var51 + class65.field1288.method325(-114);
            int var53 = class65.field1288.method325(72) + var50;
            int var54 = class65.field1288.method309(-489706920);
            int var55 = class65.field1288.method339(-16777216);
            int var56 = class65.field1288.method316((byte) -12) * 4;
            int var57 = class65.field1288.method316((byte) -91) * 4;
            int var58 = class65.field1288.method339(-16777216);
            int var59 = class65.field1288.method339(-16777216);
            int var60 = class65.field1288.method316((byte) 112);
            int var61 = class65.field1288.method316((byte) 2);
            if (var51 >= 0 && var50 >= 0 && var51 < 104 && var50 < 104 && var52 >= 0 && var53 >= 0 && var52 < 104 && var53 < 104 && var55 != 65535) {
                int var62 = var51 * 128 + 64;
                int var63 = var52 * 128 + 64;
                int var64 = var53 * 128 + 64;
                int var65 = var50 * 128 + 64;
                class106 var66 = new class106(var55, class274.field4798, var62, var65, class23.method216(-117, var65, var62, class274.field4798) - var56, class241.field4246 + var58, class241.field4246 + var59, var60, var61, var54, var57);
                var66.method792(class241.field4246 + var58, (byte) 50, var63, class23.method216(-26, var64, var63, class274.field4798) - var57, var64);
                class182.field3202.method675(new class121(var66), (byte) -126);
            }
        } else if (class209.field3571 == 254) {
            int var67 = class65.field1288.method316((byte) 119);
            int var68 = (var67 >> 4 & 0x7) + class237.field4150;
            int var69 = (var67 & 0x7) + class27.field495;
            int var70 = class65.field1288.method339(-16777216);
            int var71 = class65.field1288.method316((byte) -96);
            int var72 = var71 & 0x7;
            int var73 = class65.field1288.method316((byte) -25);
            int var74 = (var71 & 0xF4) >> 4;
            if (var70 == 65535) {
                var70 = -1;
            }
            if (var68 >= 0 && var69 >= 0 && var68 < 104 && var69 < 104) {
                int var75 = var74 + 1;
                if ((var68 - var75) <= class229.field3911.field3715[0] && (var68 + var75) >= class229.field3911.field3715[0] && (var69 - var75) <= class229.field3911.field3743[0] && (var69 + var75) >= class229.field3911.field3743[0] && class204.field3497 != 0 && var72 > 0 && class264.field4517 < 50 && var70 != -1) {
                    class230.field3935[class264.field4517] = var70;
                    class52.field1102[class264.field4517] = var72;
                    class147.field2619[class264.field4517] = var73;
                    class166.field2942[class264.field4517] = null;
                    class19.field371[class264.field4517] = (var69 << 8) + ((var68 << 16) + var74);
                    class264.field4517++;
                }
            }
        } else if (class209.field3571 == 188) {
            int var76 = class65.field1288.method339(-16777216);
            int var77 = class65.field1288.method300(128);
            int var78 = class65.field1288.method343((byte) 83);
            int var79 = ((var78 & 0x76) >> 4) + class237.field4150;
            int var80 = (var78 & 0x7) + class27.field495;
            if (var79 >= 0 && var80 >= 0 && var79 < 104 && var80 < 104) {
                class54 var81 = new class54();
                var81.field1129 = var76;
                var81.field1124 = var77;
                if (class32.field674[class274.field4798][var79][var80] == null) {
                    class32.field674[class274.field4798][var79][var80] = new class88();
                }
                class32.field674[class274.field4798][var79][var80].method675(new class10(var81), (byte) -82);
                class169.method1175(80, var80, var79);
            }
        } else if (class209.field3571 == 72) {
            int var82 = class65.field1288.method321((byte) 104);
            int var83 = class65.field1288.method295(14179);
            int var84 = var83 >> 2;
            int var85 = var83 & 0x3;
            int var86 = class71.field1396[var84];
            int var87 = class65.field1288.method295(14179);
            int var88 = (var87 >> 4 & 0x7) + class237.field4150;
            int var89 = class27.field495 + (var87 & 0x7);
            if (var88 >= 0 && var89 >= 0 && var88 < 104 && var89 < 104) {
                class129.method914(-1, var88, -117, var86, var89, class274.field4798, var84, 0, var85, var82);
            }
        } else if (class209.field3571 == 229) {
            int var90 = class65.field1288.method316((byte) -92);
            int var91 = (var90 >> 4 & 0xF) + class237.field4150 * 2;
            int var92 = (var90 & 0xF) + class27.field495 * 2;
            int var93 = var91 + class65.field1288.method325(-103);
            int var94 = var92 + class65.field1288.method325(-116);
            int var95 = class65.field1288.method309(-489706920);
            int var96 = class65.field1288.method339(-16777216);
            int var97 = class65.field1288.method316((byte) -81) * 4;
            int var98 = class65.field1288.method316((byte) -113) * 4;
            int var99 = class65.field1288.method339(-16777216);
            int var100 = class65.field1288.method339(-16777216);
            int var101 = class65.field1288.method316((byte) 118);
            int var102 = class65.field1288.method316((byte) -79);
            if (var91 >= 0 && var92 >= 0 && var91 < 208 && var92 < 208 && var93 >= 0 && var94 >= 0 && var93 < 208 && var94 < 208 && var96 != 65535) {
                int var103 = var91 * 64;
                int var104 = var94 * 64;
                int var105 = var92 * 64;
                class106 var106 = new class106(var96, class274.field4798, var103, var105, class23.method216(-61, var105, var103, class274.field4798) - var97, class241.field4246 + var99, class241.field4246 + var100, var101, var102, var95, var98);
                int var107 = var93 * 64;
                var106.method792(class241.field4246 + var99, (byte) 123, var107, class23.method216(-2, var104, var107, class274.field4798) - var98, var104);
                class182.field3202.method675(new class121(var106), (byte) -74);
            }
        } else if (class209.field3571 == 0) {
            int var108 = class65.field1288.method343((byte) 125);
            int var109 = ((var108 & 0x7B) >> 4) + class237.field4150;
            int var110 = (var108 & 0x7) + class27.field495;
            int var111 = class65.field1288.method339(-16777216);
            int var112 = class65.field1288.method321((byte) -73);
            int var113 = class65.field1288.method314(-754926392);
            if (var109 >= 0 && var110 >= 0 && var109 < 104 && var110 < 104 && class272.field4679 != var113) {
                class54 var114 = new class54();
                var114.field1124 = var112;
                var114.field1129 = var111;
                if (class32.field674[class274.field4798][var109][var110] == null) {
                    class32.field674[class274.field4798][var109][var110] = new class88();
                }
                class32.field674[class274.field4798][var109][var110].method675(new class10(var114), (byte) -35);
                class169.method1175(63, var110, var109);
            }
        } else if (class209.field3571 == 5) {
            int var115 = class65.field1288.method343((byte) 106);
            int var116 = (var115 & 0x7) + class27.field495;
            int var117 = (var115 >> 4 & 0x7) + class237.field4150;
            int var118 = class65.field1288.method343((byte) 88);
            int var119 = var118 >> 2;
            int var120 = var118 & 0x3;
            int var121 = class71.field1396[var119];
            if (var117 >= 0 && var116 >= 0 && var117 < 104 && var116 < 104) {
                class129.method914(-1, var117, -125, var121, var116, class274.field4798, var119, 0, var120, -1);
            }
        } else if (class209.field3571 == 179) {
            int var122 = class65.field1288.method316((byte) 103);
            int var123 = (var122 >> 4 & 0x7) + class237.field4150;
            int var124 = class27.field495 + (var122 & 0x7);
            int var125 = class65.field1288.method339(-16777216);
            int var126 = class65.field1288.method316((byte) 106);
            int var127 = class65.field1288.method339(-16777216);
            if (var123 >= 0 && var124 >= 0 && var123 < 104 && var124 < 104) {
                int var128 = var124 * 128 + 64;
                int var129 = var123 * 128 + 64;
                class39 var130 = new class39(var125, class274.field4798, var129, var128, class23.method216(-24, var128, var129, class274.field4798) - var126, var127, class241.field4246);
                class47.field1017.method675(new class11(var130), (byte) -41);
            }
        } else {
            int var131 = -88 / ((-arg0 - 18) / 38);
            if (class209.field3571 == 79) {
                int var132 = class65.field1288.method300(128);
                int var133 = class65.field1288.method347(255);
                int var134 = (var133 & 0x7) + class27.field495;
                int var135 = class237.field4150 + (var133 >> 4 & 0x7);
                if (var135 >= 0 && var134 >= 0 && var135 < 104 && var134 < 104) {
                    class88 var136 = class32.field674[class274.field4798][var135][var134];
                    if (var136 != null) {
                        for (class10 var137 = (class10) var136.method673(false); var137 != null; var137 = (class10) var136.method680(95)) {
                            if ((var132 & 0x7FFF) == var137.field195.field1129) {
                                var137.method629(0);
                                break;
                            }
                        }
                        if (var136.method673(false) == null) {
                            class32.field674[class274.field4798][var135][var134] = null;
                        }
                        class169.method1175(59, var134, var135);
                    }
                }
            }
        }
    }
}
