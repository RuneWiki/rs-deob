import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class13 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!em", name = "d", descriptor = "I")
    public static int field210 = 0;

    @OriginalMember(owner = "client!em", name = "h", descriptor = "[I")
    public static int[] field214 = new int[1000];

    @OriginalMember(owner = "client!em", name = "e", descriptor = "I")
    public static volatile int field211 = -1;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!em", name = "b", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!em", name = "c", descriptor = "I")
    public static int field209;

    @OriginalMember(owner = "client!em", name = "g", descriptor = "I")
    public static int field213;

    @OriginalMember(owner = "client!em", name = "i", descriptor = "I")
    public static int field215;

    @OriginalMember(owner = "client!em", name = "j", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "client!em", name = "k", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!em", name = "l", descriptor = "I")
    public static int field218;

    @OriginalMember(owner = "client!em", name = "m", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "client!em", name = "f", descriptor = "[Lql;")
    public static class20[] field212;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIIIIIIIII)V", line = 7)
    public static final void method128(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var11 = arg2 - arg4;
        if (arg2 < class304.field4825) {
            var11++;
        }
        if (arg3 <= 78) {
            return;
        }
        int var12 = arg6 - arg0;
        field213++;
        if (class113.field1893 > arg6) {
            var12++;
        }
        int var10000;
        for (int var13 = 0; var13 < var12; var13++) {
            int var14 = arg9 * var13 + arg5 >> 16;
            int var15 = (var13 + 1) * arg9 + arg5 >> 16;
            int var16 = var15 - var14;
            if (var16 > 0) {
                int var17 = arg0 + var13 >> 6;
                if (var17 >= 0 && class159.field2812.length - 1 >= var17) {
                    int var18 = arg7 + var14;
                    int[][] var19 = class159.field2812[var17];
                    int var20 = arg7 + var15;
                    byte[][] var21 = class122.field2116[var17];
                    byte[][] var22 = class90.field1425[var17];
                    byte[][] var23 = class336.field5368[var17];
                    byte[][] var24 = class66.field1064[var17];
                    byte[][] var25 = class40.field602[var17];
                    for (int var26 = 0; var26 < var11; var26++) {
                        int var27 = arg1 * var26 + arg10 >> 16;
                        int var28 = (var26 + 1) * arg1 + arg10 >> 16;
                        int var29 = var28 - var27;
                        if (var29 > 0) {
                            int var30 = arg8 + var27;
                            int var31 = arg4 + var26 >> 6;
                            int var32 = arg8 + var28;
                            int var33 = arg4 + var26 & 0x3F;
                            int var34 = arg0 + var13 & 0x3F;
                            int var35 = (var33 << 6) + var34;
                            int var36;
                            if (var31 < 0 || var31 > (var19.length - 1) || var19[var31] == null) {
                                if (class38.field552.field5169 != -1) {
                                    var36 = class38.field552.field5169;
                                } else if ((var26 + arg4 & 0x4) == (arg0 + var13 & 0x4)) {
                                    var36 = class282.field4470[class287.field4567 + 1];
                                } else {
                                    var36 = 4936552;
                                }
                                if (var31 < 0 || var31 > var19.length - 1) {
                                    if (var36 == 0) {
                                        var36 = 1;
                                    }
                                    class47.method422(var18, var30, var16, var29, var36);
                                    continue;
                                }
                            } else {
                                var36 = var19[var31][var35];
                            }
                            if (var36 == 0) {
                                var36 = 1;
                            }
                            int var37 = var22[var31] == null ? 0 : class282.field4470[var22[var31][var35] & 0xFF];
                            int var38 = var21[var31] == null ? 0 : class282.field4470[var21[var31][var35] & 0xFF];
                            if (var38 == 0 && var37 == 0) {
                                class47.method422(var18, var30, var16, var29, var36);
                            } else {
                                if (var38 != 0) {
                                    if (var38 == -1) {
                                        var38 = 1;
                                    }
                                    byte var39 = var23[var31] == null ? 0 : var23[var31][var35];
                                    int var40 = var39 & 0xFC;
                                    if (var40 == 0 || var16 <= 1 || var29 <= 1) {
                                        class47.method422(var18, var30, var16, var29, var38);
                                    } else {
                                        class327.method2271(var18, class47.field725, var16, var38, -4781, var36, var29, var30, true, var40 >> 2, var39 & 0x3);
                                    }
                                }
                                if (var37 != 0) {
                                    if (var37 == -1) {
                                        var37 = var36;
                                    }
                                    byte var41 = var24[var31][var35];
                                    int var42 = var41 & 0xFC;
                                    if (var42 == 0 || var16 <= 1 || var29 <= 1) {
                                        class47.method422(var18, var30, var16, var29, var37);
                                    }
                                    class327.method2271(var18, class47.field725, var16, var37, -4781, 0, var29, var30, var38 == 0, var42 >> 2, var41 & 0x3);
                                }
                            }
                            if (var25[var31] != null) {
                                int var43 = var25[var31][var35] & 0xFF;
                                if (var43 != 0) {
                                    int var44;
                                    if (var29 == 1) {
                                        var44 = var30;
                                    } else {
                                        var44 = var32 - 1;
                                    }
                                    int var45 = 13421772;
                                    if (var43 >= 5 && var43 <= 8 || var43 >= 13 && var43 <= 16 || var43 >= 21 && var43 <= 24 || var43 == 27 || var43 == 28) {
                                        var43 -= 4;
                                        var45 = 13369344;
                                    }
                                    int var46;
                                    if (var16 == 1) {
                                        var46 = var18;
                                    } else {
                                        var46 = var20 - 1;
                                    }
                                    if (var43 == 1) {
                                        class47.method409(var18, var30, var29, var45);
                                    } else if (var43 == 2) {
                                        class47.method412(var18, var30, var16, var45);
                                    } else if (var43 == 3) {
                                        class47.method409(var46, var30, var29, var45);
                                    } else if (var43 == 4) {
                                        class47.method412(var18, var44, var16, var45);
                                    } else if (var43 == 9) {
                                        class47.method409(var18, var30, var29, 16777215);
                                        class47.method412(var18, var30, var16, var45);
                                    } else if (var43 == 10) {
                                        class47.method409(var46, var30, var29, 16777215);
                                        class47.method412(var18, var30, var16, var45);
                                    } else if (var43 == 11) {
                                        class47.method409(var46, var30, var29, 16777215);
                                        class47.method412(var18, var44, var16, var45);
                                    } else if (var43 == 12) {
                                        class47.method409(var18, var30, var29, 16777215);
                                        class47.method412(var18, var44, var16, var45);
                                    } else if (var43 == 17) {
                                        class47.method412(var18, var30, 1, var45);
                                    } else if (var43 == 18) {
                                        class47.method412(var46, var30, 1, var45);
                                    } else if (var43 == 19) {
                                        class47.method412(var46, var44, 1, var45);
                                    } else if (var43 == 20) {
                                        class47.method412(var18, var44, 1, var45);
                                    } else if (var43 == 25) {
                                        for (int var48 = 0; var48 < var29; var48++) {
                                            class47.method412(var18 + var48, -var48 + var44, 1, var45);
                                        }
                                    } else if (var43 == 26) {
                                        for (int var47 = 0; var47 < var29; var47++) {
                                            class47.method412(var18 + var47, var30 + var47, 1, var45);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    var10000 = arg7 + var15;
                    int var50 = arg7 + var14;
                    for (int var51 = 0; var51 < var11; var51++) {
                        int var52;
                        if (class38.field552.field5169 != -1) {
                            var52 = class38.field552.field5169;
                        } else if ((arg0 + var13 & 0x4) == (arg4 + var51 & 0x4)) {
                            var52 = class282.field4470[class287.field4567 + 1];
                        } else {
                            var52 = 4936552;
                        }
                        int var53 = (arg1 * var51 + arg10 >> 16) + arg8;
                        if (var52 == 0) {
                            var52 = 1;
                        }
                        int var54 = (arg10 + ((var51 + 1) * arg1) >> 16) + arg8;
                        int var55 = var54 - var53;
                        class47.method422(var50, var53, var16, var55, var52);
                    }
                }
            }
        }
        for (int var56 = -2; var56 < (var12 + 2); var56++) {
            int var57 = arg9 * var56 + arg5 >> 16;
            int var58 = arg5 + ((var56 + 1) * arg9) >> 16;
            int var59 = var58 - var57;
            if (var59 > 0) {
                var10000 = arg7 + var58;
                int var61 = arg7 + var57;
                int var62 = arg0 + var56 >> 6;
                if (var62 >= 0 && var62 <= (class290.field4636.length - 1)) {
                    int[][] var63 = class290.field4636[var62];
                    for (int var64 = -2; var64 < var11 + 2; var64++) {
                        int var65 = arg10 + (arg1 * var64) >> 16;
                        int var66 = (var64 + 1) * arg1 + arg10 >> 16;
                        int var67 = var66 - var65;
                        if (var67 > 0) {
                            var10000 = arg8 + var66;
                            int var69 = arg4 + var64 >> 6;
                            int var70 = arg8 + var65;
                            if (var69 >= 0 && var69 <= var63.length - 1) {
                                int var71 = ((var64 + arg4 & 0x3F) << 6) + (arg0 + var56 & 0x3F);
                                if (var63[var69] != null) {
                                    int var72 = var63[var69][var71];
                                    int var73 = var72 & 0x1FFF;
                                    if (var73 != 0) {
                                        class162 var74 = class126.method1047(34, var73 - 1);
                                        boolean var75 = (var72 >> 15 & 0x1) == 1;
                                        int var76 = (var72 & 0x7DCC) >> 13;
                                        class217 var77 = var74.method1287(var75, -2715, var76);
                                        if (var77 != null) {
                                            int var78 = var77.field4054 * var59 / 4;
                                            int var79 = var77.field4048 * var67 / 4;
                                            if (var74.field2874) {
                                                int var80 = var72 >> 16 & 0xF;
                                                int var81 = (var72 & 0xF81602) >> 20;
                                                if ((var76 & 0x1) == 1) {
                                                    int var82 = var80;
                                                    var80 = var81;
                                                    var81 = var82;
                                                }
                                                var78 = var59 * var80;
                                                var79 = var67 * var81;
                                            }
                                            if (var78 != 0 && var79 != 0) {
                                                if (var74.field2869 == 0) {
                                                    var77.method1600(var61, var70 + var67 - var79, var78, var79);
                                                } else {
                                                    var77.method1602(var61, var67 + var70 - var79, var78, var79, var74.field2869);
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

    @OriginalMember(owner = "client!em", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 426)
    public final synchronized void keyReleased(KeyEvent arg0) {
        field216++;
        if (class296.field4723 != null) {
            class18.field299 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class239.field3910.length) {
                var3 = class239.field3910[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class140.field2569 >= 0 && var3 >= 0) {
                class176.field2995[class140.field2569] = ~var3;
                class140.field2569 = class140.field2569 + 1 & 0x7F;
                if (class17.field282 == class140.field2569) {
                    class140.field2569 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Z)V", line = 456)
    public static final void method129(boolean arg0) {
        field215++;
        class6.method43();
        class259.field4204 = new class236[9];
        class259.field4204[1] = new class319();
        class259.field4204[2] = new class115();
        if (!arg0) {
            return;
        }
        class259.field4204[3] = new class275();
        class259.field4204[4] = new class87();
        class259.field4204[5] = new class26();
        class259.field4204[6] = new class294();
        class259.field4204[7] = new class109();
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(II)V", line = 477)
    public static final void method130(int arg0, int arg1) {
        int var2 = 95 / ((-arg0 - 55) / 53);
        field217++;
        class341.field5438.method469(-11815, arg1);
    }

    @OriginalMember(owner = "client!em", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 488)
    public final synchronized void keyPressed(KeyEvent arg0) {
        field218++;
        if (class296.field4723 == null) {
            return;
        }
        class18.field299 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && class239.field3910.length > var2) {
            var3 = class239.field3910[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class140.field2569 >= 0 && var3 >= 0) {
            class176.field2995[class140.field2569] = var3;
            class140.field2569 = class140.field2569 + 1 & 0x7F;
            if (class17.field282 == class140.field2569) {
                class140.field2569 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class331.field5276 + 1 & 0x7F;
            if (class253.field4075 != var4) {
                class297.field4730[class331.field5276] = var3;
                class148.field2662[class331.field5276] = '\u0000';
                class331.field5276 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!em", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 544)
    public final void focusGained(FocusEvent arg0) {
        field219++;
    }

    @OriginalMember(owner = "client!em", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 551)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class296.field4723 != null) {
            class140.field2569 = -1;
        }
        field209++;
    }

    @OriginalMember(owner = "client!em", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 571)
    public final void keyTyped(KeyEvent arg0) {
        field207++;
        if (class296.field4723 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != '\u0000' && var2 != '\uFFFF' && class353.method2459(var2, 0)) {
                int var3 = class331.field5276 + 1 & 0x7F;
                if (class253.field4075 != var3) {
                    class297.field4730[class331.field5276] = -1;
                    class148.field2662[class331.field5276] = var2;
                    class331.field5276 = var3;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(I)V", line = 599)
    public static void method131(int arg0) {
        if (arg0 == -1) {
            field214 = null;
            field212 = null;
        }
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(II)V", line = 614)
    public static final void method132(int arg0, int arg1) {
        field208++;
        class161.field2862.method469(-11815, arg0);
        if (arg1 > -45) {
            field214 = (int[]) null;
        }
        class17.field259.method469(-11815, arg0);
    }
}
