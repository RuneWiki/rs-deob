import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class210 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!td", name = "g", descriptor = "I")
    public static int field3022 = 0;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "[Lmf;")
    public static class39[] field3024 = new class39[4];

    @OriginalMember(owner = "client!td", name = "d", descriptor = "Lag;")
    public static class97 field3019 = new class97();

    @OriginalMember(owner = "client!td", name = "k", descriptor = "[I")
    public static int[] field3026 = new int[2000];

    @OriginalMember(owner = "client!td", name = "a", descriptor = "I")
    public static int field3016;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "I")
    public static int field3017;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "I")
    public static int field3020;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "I")
    public static int field3021;

    @OriginalMember(owner = "client!td", name = "h", descriptor = "I")
    public static int field3023;

    @OriginalMember(owner = "client!td", name = "j", descriptor = "I")
    public static int field3025;

    @OriginalMember(owner = "client!td", name = "m", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!td", name = "n", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!td", name = "l", descriptor = "Lve;")
    public static class233 field3027;

    @OriginalMember(owner = "client!td", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field3021++;
        if (class107.field1553 != null) {
            class115.field1712 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class204.field2955.length > var2) {
                var3 = class204.field2955[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class16.field236 >= 0 && var3 >= 0) {
                class214.field3089[class16.field236] = ~var3;
                class16.field236 = class16.field236 + 1 & 0x7F;
                if (class206.field2990 == class16.field236) {
                    class16.field236 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V")
    public static void method1341(int arg0) {
        field3024 = null;
        if (arg0 < -111) {
            field3026 = null;
            field3027 = null;
            field3019 = null;
        }
    }

    @OriginalMember(owner = "client!td", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field3025++;
    }

    @OriginalMember(owner = "client!td", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field3028++;
        if (class107.field1553 != null) {
            class16.field236 = -1;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIIIIIIII)V")
    public static final void method1342(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field3020++;
        int var11 = arg4 - arg8;
        if (arg4 < class63.field1009) {
            var11++;
        }
        int var12 = arg0 - arg5;
        if (arg0 < class99.field1482) {
            var12++;
        }
        if (arg3 != 1268787088) {
            field3019 = null;
        }
        int var10000;
        for (int var13 = 0; var13 < var12; var13++) {
            int var40 = arg10 * var13 + arg6 >> 16;
            int var41 = (var13 + 1) * arg10 + arg6 >> 16;
            int var42 = var41 - var40;
            if (var42 > 0) {
                int var43 = arg5 + var13 >> 6;
                if (var43 >= 0 && (class120.field1757.length - 1) >= var43) {
                    int[][] var44 = class120.field1757[var43];
                    int var45 = arg1 + var40;
                    int var46 = arg1 + var41;
                    byte[][] var47 = class236.field3560[var43];
                    byte[][] var48 = class225.field3387[var43];
                    byte[][] var49 = class63.field1014[var43];
                    byte[][] var50 = class193.field2759[var43];
                    byte[][] var51 = class76.field1175[var43];
                    for (int var52 = 0; var52 < var11; var52++) {
                        int var53 = (var52 + 1) * arg2 + arg9 >> 16;
                        int var54 = arg2 * var52 + arg9 >> 16;
                        int var55 = var53 - var54;
                        if (var55 > 0) {
                            int var56 = arg7 + var54;
                            int var57 = arg8 + var52 >> 6;
                            int var58 = arg7 + var53;
                            int var59 = arg5 + var13 & 0x3F;
                            int var60 = arg8 + var52 & 0x3F;
                            int var61 = (var60 << 6) + var59;
                            int var62;
                            if (var57 < 0 || (var44.length - 1) < var57 || var44[var57] == null) {
                                if (class70.field1099.field3374 != -1) {
                                    var62 = class70.field1099.field3374;
                                } else if ((arg5 + var13 & 0x4) == (arg8 + var52 & 0x4)) {
                                    var62 = class152.field2193[class148.field2119 + 1];
                                } else {
                                    var62 = 4936552;
                                }
                                if (var57 < 0 || var57 > (var44.length - 1)) {
                                    if (var62 == 0) {
                                        var62 = 1;
                                    }
                                    class144.method955(var45, var56, var42, var55, var62);
                                    continue;
                                }
                            } else {
                                var62 = var44[var57][var61];
                            }
                            int var63 = var49[var57] == null ? 0 : class152.field2193[var49[var57][var61] & 0xFF];
                            int var64 = var48[var57] == null ? 0 : class152.field2193[var48[var57][var61] & 0xFF];
                            if (var62 == 0) {
                                var62 = 1;
                            }
                            if (var63 == 0 && var64 == 0) {
                                class144.method955(var45, var56, var42, var55, var62);
                            } else {
                                if (var63 != 0) {
                                    if (var63 == -1) {
                                        var63 = 1;
                                    }
                                    byte var65 = var47[var57] == null ? 0 : var47[var57][var61];
                                    int var66 = var65 & 0xFC;
                                    if (var66 == 0 || var42 <= 1 || var55 <= 1) {
                                        class144.method955(var45, var56, var42, var55, var63);
                                    } else {
                                        class128.method889(var65 & 0x3, (byte) 32, var56, var45, var63, true, var42, var62, var55, class144.field2070, var66 >> 2);
                                    }
                                }
                                if (var64 != 0) {
                                    byte var67 = var50[var57][var61];
                                    int var68 = var67 & 0xFC;
                                    if (var64 == -1) {
                                        var64 = var62;
                                    }
                                    if (var68 == 0 || var42 <= 1 || var55 <= 1) {
                                        class144.method955(var45, var56, var42, var55, var64);
                                    }
                                    class128.method889(var67 & 0x3, (byte) 32, var56, var45, var64, var63 == 0, var42, 0, var55, class144.field2070, var68 >> 2);
                                }
                            }
                            if (var51[var57] != null) {
                                int var69 = var51[var57][var61] & 0xFF;
                                if (var69 != 0) {
                                    int var70;
                                    if (var55 == 1) {
                                        var70 = var56;
                                    } else {
                                        var70 = var58 - 1;
                                    }
                                    int var71;
                                    if (var42 == 1) {
                                        var71 = var45;
                                    } else {
                                        var71 = var46 - 1;
                                    }
                                    int var72 = 13421772;
                                    if (var69 >= 5 && var69 <= 8 || var69 >= 13 && var69 <= 16 || var69 >= 21 && var69 <= 24 || var69 == 27 || var69 == 28) {
                                        var69 -= 4;
                                        var72 = 13369344;
                                    }
                                    if (var69 == 1) {
                                        class144.method948(var45, var56, var55, var72);
                                    } else if (var69 == 2) {
                                        class144.method968(var45, var56, var42, var72);
                                    } else if (var69 == 3) {
                                        class144.method948(var71, var56, var55, var72);
                                    } else if (var69 == 4) {
                                        class144.method968(var45, var70, var42, var72);
                                    } else if (var69 == 9) {
                                        class144.method948(var45, var56, var55, 16777215);
                                        class144.method968(var45, var56, var42, var72);
                                    } else if (var69 == 10) {
                                        class144.method948(var71, var56, var55, 16777215);
                                        class144.method968(var45, var56, var42, var72);
                                    } else if (var69 == 11) {
                                        class144.method948(var71, var56, var55, 16777215);
                                        class144.method968(var45, var70, var42, var72);
                                    } else if (var69 == 12) {
                                        class144.method948(var45, var56, var55, 16777215);
                                        class144.method968(var45, var70, var42, var72);
                                    } else if (var69 == 17) {
                                        class144.method968(var45, var56, 1, var72);
                                    } else if (var69 == 18) {
                                        class144.method968(var71, var56, 1, var72);
                                    } else if (var69 == 19) {
                                        class144.method968(var71, var70, 1, var72);
                                    } else if (var69 == 20) {
                                        class144.method968(var45, var70, 1, var72);
                                    } else if (var69 == 25) {
                                        for (int var74 = 0; var74 < var55; var74++) {
                                            class144.method968(var45 + var74, var70 - var74, 1, var72);
                                        }
                                    } else if (var69 == 26) {
                                        for (int var73 = 0; var73 < var55; var73++) {
                                            class144.method968(var45 + var73, var56 + var73, 1, var72);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    var10000 = arg1 + var41;
                    int var76 = arg1 + var40;
                    for (int var77 = 0; var77 < var11; var77++) {
                        int var78 = (arg2 * var77 + arg9 >> 16) + arg7;
                        int var79;
                        if (class70.field1099.field3374 != -1) {
                            var79 = class70.field1099.field3374;
                        } else if ((var77 + arg8 & 0x4) == (arg5 + var13 & 0x4)) {
                            var79 = class152.field2193[class148.field2119 + 1];
                        } else {
                            var79 = 4936552;
                        }
                        int var80 = ((var77 + 1) * arg2 + arg9 >> 16) + arg7;
                        if (var79 == 0) {
                            var79 = 1;
                        }
                        int var81 = var80 - var78;
                        class144.method955(var76, var78, var42, var81, var79);
                    }
                }
            }
        }
        for (int var14 = -2; var14 < var12 + 2; var14++) {
            int var15 = arg10 * var14 + arg6 >> 16;
            int var16 = (var14 + 1) * arg10 + arg6 >> 16;
            int var17 = var16 - var15;
            if (var17 > 0) {
                int var18 = arg1 + var15;
                var10000 = arg1 + var16;
                int var20 = arg5 + var14 >> 6;
                if (var20 >= 0 && class228.field3421.length - 1 >= var20) {
                    int[][] var21 = class228.field3421[var20];
                    for (int var22 = -2; var22 < var11 + 2; var22++) {
                        int var23 = arg2 * var22 + arg9 >> 16;
                        int var24 = (var22 + 1) * arg2 + arg9 >> 16;
                        int var25 = var24 - var23;
                        if (var25 > 0) {
                            int var26 = arg7 + var23;
                            var10000 = arg7 + var24;
                            int var28 = arg8 + var22 >> 6;
                            if (var28 >= 0 && var28 <= var21.length - 1) {
                                int var29 = (var22 + arg8 & 0x3F << 6) + (arg5 + var14 & 0x3F);
                                if (var21[var28] != null) {
                                    int var30 = var21[var28][var29];
                                    int var31 = var30 & 0x3FFF;
                                    if (var31 != 0) {
                                        class185 var32 = class269.method1797(var31 - 1, -30718);
                                        int var33 = (var30 & 0xFFCB) >> 14;
                                        class117 var34 = var32.method1195((byte) -126, var33);
                                        if (var34 != null) {
                                            int var35 = var34.field2492 * var25 / 4;
                                            int var36 = var34.field2499 * var17 / 4;
                                            if (var32.field2643) {
                                                int var37 = (var30 & 0xF747E) >> 16;
                                                int var38 = (var30 & 0xFFD6C6) >> 20;
                                                if ((var33 & 0x1) == 1) {
                                                    int var39 = var37;
                                                    var37 = var38;
                                                    var38 = var39;
                                                }
                                                var36 = var17 * var37;
                                                var35 = var25 * var38;
                                            }
                                            if (var36 != 0 && var35 != 0) {
                                                if (var32.field2639 == 0) {
                                                    var34.method803(var18, var26 + var25 - var35, var36, var35);
                                                } else {
                                                    var34.method804(var18, var25 + var26 - var35, var36, var35, var32.field2639);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        if (class107.field1553 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != '\u0000' && var2 != '\uFFFF' && class32.method228(-15077, var2)) {
                int var3 = class222.field3309 + 1 & 0x7F;
                if (class206.field2980 != var3) {
                    class66.field1035[class222.field3309] = -1;
                    class37.field547[class222.field3309] = var2;
                    class222.field3309 = var3;
                }
            }
        }
        field3016++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!td", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        field3018++;
        if (class107.field1553 == null) {
            return;
        }
        class115.field1712 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && class204.field2955.length > var2) {
            var3 = class204.field2955[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class16.field236 >= 0 && var3 >= 0) {
            class214.field3089[class16.field236] = var3;
            class16.field236 = class16.field236 + 1 & 0x7F;
            if (class206.field2990 == class16.field236) {
                class16.field236 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class222.field3309 + 1 & 0x7F;
            if (class206.field2980 != var4) {
                class66.field1035[class222.field3309] = var3;
                class37.field547[class222.field3309] = '\u0000';
                class222.field3309 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ICLjava/lang/String;)[Ljava/lang/String;")
    public static final String[] method1343(int arg0, char arg1, String arg2) {
        field3029++;
        int var3 = class10.method88(arg2, 0, arg1);
        int var4 = 0;
        int var5 = 0;
        String[] var6 = new String[var3 + 1];
        if (arg0 != 16777215) {
            return null;
        }
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var5; arg1 != arg2.charAt(var8); var8++) {
            }
            var6[var4++] = arg2.substring(var5, var8);
            var5 = var8 + 1;
        }
        var6[var3] = arg2.substring(var5);
        return var6;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IZ)V")
    public static final void method1344(int arg0, boolean arg1) {
        field3023++;
        if (!arg1) {
            method1342(47, -34, 84, 84, -125, 13, -52, -38, -57, -17, 22);
        }
        class270 var2 = class190.method1213(25702, arg0, 2);
        var2.method1806(-8173);
    }
}
