import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class96 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!q", name = "c", descriptor = "Lad;")
    public static class5 field2280 = class88.method674("mapedge", 116);

    @OriginalMember(owner = "client!q", name = "h", descriptor = "Lad;")
    public static class5 field2285 = class88.method674("backbase2", 18);

    @OriginalMember(owner = "client!q", name = "k", descriptor = "[I")
    public static int[] field2288 = new int[128];

    @OriginalMember(owner = "client!q", name = "q", descriptor = "Lad;")
    public static class5 field2294 = class88.method674("Benutzen Sie die (WPasswort -=ndern(W Option", 123);

    @OriginalMember(owner = "client!q", name = "e", descriptor = "[Lad;")
    public static class5[] field2282 = new class5[100];

    @OriginalMember(owner = "client!q", name = "w", descriptor = "Lad;")
    public static class5 field2300 = class88.method674("backbase1", -83);

    @OriginalMember(owner = "client!q", name = "v", descriptor = "I")
    public static int field2299 = 0;

    @OriginalMember(owner = "client!q", name = "x", descriptor = "Lad;")
    private static class5 field2301 = class88.method674("Add friend", -123);

    @OriginalMember(owner = "client!q", name = "d", descriptor = "Lad;")
    public static class5 field2281 = field2301;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "I")
    public static int field2278;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "I")
    public static int field2279;

    @OriginalMember(owner = "client!q", name = "f", descriptor = "I")
    public static int field2283;

    @OriginalMember(owner = "client!q", name = "g", descriptor = "I")
    public static int field2284;

    @OriginalMember(owner = "client!q", name = "i", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!q", name = "j", descriptor = "I")
    public static int field2287;

    @OriginalMember(owner = "client!q", name = "l", descriptor = "I")
    public static int field2289;

    @OriginalMember(owner = "client!q", name = "n", descriptor = "I")
    public static int field2291;

    @OriginalMember(owner = "client!q", name = "o", descriptor = "I")
    public static int field2292;

    @OriginalMember(owner = "client!q", name = "p", descriptor = "I")
    public static int field2293;

    @OriginalMember(owner = "client!q", name = "r", descriptor = "I")
    public static int field2295;

    @OriginalMember(owner = "client!q", name = "s", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!q", name = "t", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!q", name = "u", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!q", name = "m", descriptor = "Lrc;")
    public static class105 field2290;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IILtd;II)V", line = 8)
    public static final void method733(int arg0, int arg1, class118 arg2, int arg3, int arg4) {
        field2298++;
        if (class4.field145 >= 400) {
            return;
        }
        if (arg2.field2895 != null) {
            arg2 = arg2.method933(11840);
        }
        if (arg2 == null || !arg2.field2913) {
            return;
        }
        class5 var5 = arg2.field2940;
        if (arg2.field2941 != 0) {
            var5 = class69.method546(true, new class5[] { var5, class5.method41(arg2.field2941, 32636, class82.field1932.field2790), class50.field1292, class12.field366, class106.method864(18413, arg2.field2941), class42.field1063 });
        }
        if (~class112.field2814 == arg4) {
            class72.method580(class69.method546(true, new class5[] { class53.field1337, class102.field2477, var5 }), 63, class9.field318, -124, arg1, arg3, arg0);
            class35.field877++;
        } else if (class118.field2920 != 1) {
            class5[] var6 = arg2.field2902;
            if (class16.field438) {
                var6 = class95.method729(true, var6);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && !var6[var7].method75(false, class8.field292)) {
                        class78.field1830++;
                        byte var8 = 0;
                        if (var7 == 0) {
                            var8 = 57;
                        }
                        if (var7 == 1) {
                            var8 = 34;
                        }
                        if (var7 == 2) {
                            var8 = 12;
                        }
                        if (var7 == 3) {
                            var8 = 38;
                        }
                        if (var7 == 4) {
                            var8 = 9;
                        }
                        class72.method580(class69.method546(true, new class5[] { class75.field1801, var5 }), var8, var6[var7], arg4 - 124, arg1, arg3, arg0);
                    }
                }
            }
            if (var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method75(false, class8.field292)) {
                        class56.field1391++;
                        int var10 = 0;
                        short var11 = 0;
                        if (class82.field1932.field2790 < arg2.field2941) {
                            var11 = 2000;
                        }
                        if (var9 == 0) {
                            var10 = var11 + 57;
                        }
                        if (var9 == 1) {
                            var10 = var11 + 34;
                        }
                        if (var9 == 2) {
                            var10 = var11 + 12;
                        }
                        if (var9 == 3) {
                            var10 = var11 + 38;
                        }
                        if (var9 == 4) {
                            var10 = var11 + 9;
                        }
                        class72.method580(class69.method546(true, new class5[] { class75.field1801, var5 }), var10, var6[var9], -118, arg1, arg3, arg0);
                    }
                }
            }
            class72.method580(class69.method546(true, new class5[] { class75.field1801, var5 }), 1001, class52.field1307, -119, arg1, arg3, arg0);
            class30.field735++;
        } else if ((class73.field1752 & 0x2) == 2) {
            class72.method580(class69.method546(true, new class5[] { class38.field940, class102.field2477, var5 }), 5, class105.field2631, -109, arg1, arg3, arg0);
            class72.field1717++;
        }
    }

    @OriginalMember(owner = "client!q", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 148)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field2286++;
        if (class116.field2860 != null) {
            class110.field2755 = 0;
            class27.field705 = arg0.getX();
            class43.field1089 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIBIII)V", line = 167)
    public static final void method734(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field2287++;
        if (arg2 != 99) {
            method734(92, -96, (byte) -16, 85, 127, 40);
        }
        int var6 = class42.field1065.method776(arg3, arg4, arg5);
        if (var6 != 0) {
            int var7 = class42.field1065.method756(arg3, arg4, arg5, var6);
            int var8 = var7 >> 6 & 0x3;
            int var9 = var7 & 0x1F;
            int var10 = arg1;
            int[] var11 = class5.field208.field3014;
            if (var6 > 0) {
                var10 = arg0;
            }
            int var12 = arg4 * 4 + (-arg5 + 103) * 512 * 4 + 24624;
            int var13 = var6 >> 14 & 0x7FFF;
            class70 var14 = class42.method357(var13, (byte) -42);
            if (var14.field1661 == -1) {
                if (var9 == 0 || var9 == 2) {
                    if (var8 == 0) {
                        var11[var12] = var10;
                        var11[var12 + 512] = var10;
                        var11[var12 + 1024] = var10;
                        var11[var12 + 1536] = var10;
                    } else if (var8 == 1) {
                        var11[var12] = var10;
                        var11[var12 + 1] = var10;
                        var11[var12 + 2] = var10;
                        var11[var12 + 3] = var10;
                    } else if (var8 == 2) {
                        var11[var12 + 3] = var10;
                        var11[var12 + 3 + 512] = var10;
                        var11[var12 + 1027] = var10;
                        var11[var12 + 1536 + 3] = var10;
                    } else if (var8 == 3) {
                        var11[var12 + 1536] = var10;
                        var11[var12 + 1 + 1536] = var10;
                        var11[var12 + 1538] = var10;
                        var11[var12 + 3 + 1536] = var10;
                    }
                }
                if (var9 == 3) {
                    if (var8 == 0) {
                        var11[var12] = var10;
                    } else if (var8 == 1) {
                        var11[var12 + 3] = var10;
                    } else if (var8 == 2) {
                        var11[var12 + 1536 + 3] = var10;
                    } else if (var8 == 3) {
                        var11[var12 + 1536] = var10;
                    }
                }
                if (var9 == 2) {
                    if (var8 == 3) {
                        var11[var12] = var10;
                        var11[var12 + 512] = var10;
                        var11[var12 + 1024] = var10;
                        var11[var12 + 1536] = var10;
                    } else if (var8 == 0) {
                        var11[var12] = var10;
                        var11[var12 + 1] = var10;
                        var11[var12 + 2] = var10;
                        var11[var12 + 3] = var10;
                    } else if (var8 == 1) {
                        var11[var12 + 3] = var10;
                        var11[var12 + 512 + 3] = var10;
                        var11[var12 + 3 + 1024] = var10;
                        var11[var12 + 1539] = var10;
                    } else if (var8 == 2) {
                        var11[var12 + 1536] = var10;
                        var11[var12 + 1536 + 1] = var10;
                        var11[var12 + 2 + 1536] = var10;
                        var11[var12 + 1539] = var10;
                    }
                }
            } else {
                class123 var15 = class53.field1328[var14.field1661];
                if (var15 != null) {
                    int var16 = (var14.field1693 * 4 - var15.field3026) / 2;
                    int var17 = (var14.field1705 * 4 - var15.field3023) / 2;
                    var15.method976(arg4 * 4 + var17 + 48, 48 - -((-arg5 + 104 + -var14.field1693) * 4) - -var16);
                }
            }
        }
        int var18 = class42.field1065.method780(arg3, arg4, arg5);
        if (var18 != 0) {
            int var19 = var18 >> 14 & 0x7FFF;
            int var20 = class42.field1065.method756(arg3, arg4, arg5, var18);
            int var21 = var20 >> 6 & 0x3;
            class70 var22 = class42.method357(var19, (byte) -42);
            int var23 = var20 & 0x1F;
            if (var22.field1661 != -1) {
                class123 var27 = class53.field1328[var22.field1661];
                if (var27 != null) {
                    int var28 = (var22.field1693 * 4 - var27.field3026) / 2;
                    int var29 = (var22.field1705 * 4 - var27.field3023) / 2;
                    var27.method976(arg4 * 4 + var29 + 48, (104 - (var22.field1693 + arg5)) * 4 - -var28 + 48);
                }
            } else if (var23 == 9) {
                int[] var24 = class5.field208.field3014;
                int var25 = arg4 * 4 + (-(arg5 * 512) + 52736) * 4 + 24624;
                int var26 = 15658734;
                if (var18 > 0) {
                    var26 = 15597568;
                }
                if (var21 == 0 || var21 == 2) {
                    var24[var25 + 1536] = var26;
                    var24[var25 + 1024 + 1] = var26;
                    var24[var25 + 512 + 2] = var26;
                    var24[var25 + 3] = var26;
                } else {
                    var24[var25] = var26;
                    var24[var25 + 512 + 1] = var26;
                    var24[var25 + 1024 + 2] = var26;
                    var24[var25 + 1536 + 3] = var26;
                }
            }
        }
        int var30 = class42.field1065.method772(arg3, arg4, arg5);
        if (var30 == 0) {
            return;
        }
        int var31 = var30 >> 14 & 0x7FFF;
        class70 var32 = class42.method357(var31, (byte) -42);
        if (var32.field1661 == -1) {
            return;
        }
        class123 var33 = class53.field1328[var32.field1661];
        if (var33 != null) {
            int var34 = (var32.field1705 * 4 - var33.field3023) / 2;
            int var35 = (var32.field1693 * 4 - var33.field3026) / 2;
            var33.method976(arg4 * 4 + var34 + 48, (-var32.field1693 + 104 + -arg5) * 4 + 48 + var35);
            return;
        }
    }

    @OriginalMember(owner = "client!q", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 420)
    public final synchronized void focusLost(FocusEvent arg0) {
        field2295++;
        if (class116.field2860 != null) {
            class129.field3131 = 0;
        }
    }

    @OriginalMember(owner = "client!q", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 432)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class116.field2860 != null) {
            class110.field2755 = 0;
            class27.field705 = arg0.getX();
            class43.field1089 = arg0.getY();
        }
        field2289++;
    }

    @OriginalMember(owner = "client!q", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 455)
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field2291++;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V", line = 466)
    public static void method735(int arg0) {
        field2290 = null;
        field2300 = null;
        field2288 = null;
        if (arg0 <= 30) {
            field2301 = null;
        }
        field2294 = null;
        field2280 = null;
        field2282 = null;
        field2301 = null;
        field2285 = null;
        field2281 = null;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 488)
    public static final void method736(byte arg0, Component arg1) {
        field2297++;
        if (arg0 < 84) {
            field2280 = null;
        }
        arg1.removeKeyListener(class5.field209);
        arg1.removeFocusListener(class5.field209);
    }

    @OriginalMember(owner = "client!q", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 516)
    public final synchronized void mouseExited(MouseEvent arg0) {
        field2278++;
        if (class116.field2860 != null) {
            class110.field2755 = 0;
            class27.field705 = -1;
            class43.field1089 = -1;
        }
    }

    @OriginalMember(owner = "client!q", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 533)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class116.field2860 != null) {
            class110.field2755 = 0;
            class129.field3131 = 0;
        }
        field2283++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!q", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 552)
    public final synchronized void mousePressed(MouseEvent arg0) {
        field2279++;
        if (class116.field2860 != null) {
            class110.field2755 = 0;
            class79.field1870 = arg0.getX();
            class21.field545 = arg0.getY();
            class6.field220 = class95.method728(128);
            if (arg0.isMetaDown()) {
                class134.field3246 = 2;
                class129.field3131 = 2;
            } else {
                class134.field3246 = 1;
                class129.field3131 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!q", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 597)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class116.field2860 != null) {
            class110.field2755 = 0;
            class27.field705 = arg0.getX();
            class43.field1089 = arg0.getY();
        }
        field2296++;
    }

    @OriginalMember(owner = "client!q", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 619)
    public final void focusGained(FocusEvent arg0) {
        field2292++;
    }
}
