import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class109 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "Z")
    public static boolean field2555 = false;

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "Lec;")
    private static class32 field2563 = class73.method594("Loaded input handler", true);

    @OriginalMember(owner = "client!pe", name = "p", descriptor = "Lec;")
    private static class32 field2566 = class73.method594("Connection timed out)3", true);

    @OriginalMember(owner = "client!pe", name = "r", descriptor = "I")
    public static int field2568 = 3353893;

    @OriginalMember(owner = "client!pe", name = "u", descriptor = "I")
    public static int field2571 = 0;

    @OriginalMember(owner = "client!pe", name = "q", descriptor = "Lec;")
    private static class32 field2567 = class73.method594("Unexpected server response", true);

    @OriginalMember(owner = "client!pe", name = "v", descriptor = "Lec;")
    public static class32 field2572 = field2567;

    @OriginalMember(owner = "client!pe", name = "s", descriptor = "Lec;")
    public static class32 field2569 = class73.method594("welle:", true);

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "Lec;")
    public static class32 field2558 = field2566;

    @OriginalMember(owner = "client!pe", name = "t", descriptor = "Lec;")
    public static class32 field2570 = field2563;

    @OriginalMember(owner = "client!pe", name = "o", descriptor = "Lec;")
    public static class32 field2565 = class73.method594(": ", true);

    @OriginalMember(owner = "client!pe", name = "y", descriptor = "Lec;")
    public static class32 field2575 = class73.method594("W-=hlen Sie eine Option", true);

    @OriginalMember(owner = "client!pe", name = "w", descriptor = "Lwc;")
    public static class156 field2573 = new class156(8);

    @OriginalMember(owner = "client!pe", name = "A", descriptor = "[Lec;")
    public static class32[] field2577 = new class32[500];

    @OriginalMember(owner = "client!pe", name = "z", descriptor = "Lec;")
    public static class32 field2576 = class73.method594("Unerwartete Antwort vom Anmelde)2Server", true);

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
    public static int field2559;

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "I")
    public static int field2560;

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!pe", name = "x", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!pe", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class38.field910 != null) {
            class139.field3211 = 0;
            class126.field2917 = arg0.getX();
            class44.field1038 = arg0.getY();
        }
        field2574++;
    }

    @OriginalMember(owner = "client!pe", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class38.field910 != null) {
            class139.field3211 = 0;
            class151.field3469 = arg0.getX();
            class15.field288 = arg0.getY();
            class31.field610 = class52.method408((byte) -45);
            if (arg0.isMetaDown()) {
                class158.field3615 = 2;
                class82.field1918 = 2;
            } else {
                class158.field3615 = 1;
                class82.field1918 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field2559++;
    }

    @OriginalMember(owner = "client!pe", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field2557++;
        if (class38.field910 != null) {
            class82.field1918 = 0;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
    public static void method869(int arg0) {
        field2569 = null;
        field2565 = null;
        field2572 = null;
        field2573 = null;
        field2575 = null;
        field2566 = null;
        field2576 = null;
        field2563 = null;
        field2577 = null;
        field2558 = null;
        if (arg0 != 4) {
            field2576 = null;
        }
        field2570 = null;
        field2567 = null;
    }

    @OriginalMember(owner = "client!pe", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field2554++;
    }

    @OriginalMember(owner = "client!pe", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class38.field910 != null) {
            class139.field3211 = 0;
            class82.field1918 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field2551++;
    }

    @OriginalMember(owner = "client!pe", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field2562++;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lvd;IIIILqf;IIB)V")
    public static final void method870(class150 arg0, int arg1, int arg2, int arg3, int arg4, class117 arg5, int arg6, int arg7, byte arg8) {
        field2553++;
        if (class154.field3531 && (class3.field50[0][arg7][arg1] & 0x2) == 0) {
            if ((class3.field50[arg6][arg7][arg1] & 0x10) != 0) {
                return;
            }
            if (class34.method288(arg6, 115, arg1, arg7) != class115.field2745) {
                return;
            }
        }
        if (class151.field3474 > arg6) {
            class151.field3474 = arg6;
        }
        class53 var9 = class5.method22(arg8 ^ 0x34, arg3);
        if (arg8 != -76) {
            method870(null, -127, 79, -120, 18, null, 15, -120, (byte) 1);
        }
        int var10;
        int var11;
        if (arg4 == 1 || arg4 == 3) {
            var10 = var9.field1234;
            var11 = var9.field1223;
        } else {
            var10 = var9.field1223;
            var11 = var9.field1234;
        }
        int var12;
        int var13;
        if (arg7 + var10 > 104) {
            var12 = arg7;
            var13 = arg7 + 1;
        } else {
            var13 = (var10 + 1 >> 1) + arg7;
            var12 = (var10 >> 1) + arg7;
        }
        int var14;
        int var15;
        if (arg1 + var11 <= 104) {
            var14 = (var11 + 1 >> 1) + arg1;
            var15 = arg1 + (var11 >> 1);
        } else {
            var14 = arg1 + 1;
            var15 = arg1;
        }
        int[][] var16 = class70.field1631[arg6];
        int var17 = (arg7 << 7) + (var10 << 6);
        int var18 = (arg1 << 7) + (var11 << 6);
        int var19 = (arg3 << 14) + (arg1 << 7) + arg7 + 1073741824;
        if (var9.field1194 == 0) {
            var19 += Integer.MIN_VALUE;
        }
        int var20 = var16[var12][var14] + var16[var12][var15] + var16[var13][var14] + var16[var13][var15] >> 2;
        int var21 = (arg4 << 6) + arg2;
        if (var9.field1253 == 1) {
            var21 += 256;
        }
        if (var9.method412((byte) 126)) {
            class75.method604(arg8 ^ 0x48, arg4, var9, arg6, arg7, arg1);
        }
        if (arg2 == 22) {
            if (!class154.field3531 || var9.field1194 != 0 || var9.field1236 == 1 || var9.field1205) {
                class26 var22;
                if (var9.field1226 == -1 && var9.field1252 == null) {
                    var22 = var9.method422(true, var18, var20, arg4, var16, var17, 22);
                } else {
                    var22 = new class106(arg3, 22, arg4, arg6, arg7, arg1, var9.field1226, true, null);
                }
                arg0.method1140(arg6, arg7, arg1, var20, var22, var19, var21);
                if (var9.field1236 == 1 && arg5 != null) {
                    arg5.method933(arg7, arg1, true);
                }
            }
        } else if (arg2 == 10 || arg2 == 11) {
            class26 var45;
            if (var9.field1226 == -1 && var9.field1252 == null) {
                var45 = var9.method422(true, var18, var20, arg4, var16, var17, 10);
            } else {
                var45 = new class106(arg3, 10, arg4, arg6, arg7, arg1, var9.field1226, true, null);
            }
            if (var45 != null && arg0.method1153(arg6, arg7, arg1, var20, var10, var11, var45, arg2 == 11 ? 256 : 0, var19, var21) && var9.field1254) {
                int var46 = 15;
                if (var45 instanceof class101) {
                    var46 = ((class101) var45).method818() / 4;
                    if (var46 > 30) {
                        var46 = 30;
                    }
                }
                for (int var47 = 0; var47 <= var10; var47++) {
                    for (int var48 = 0; var48 <= var11; var48++) {
                        if (class85.field1986[arg6][arg7 + var47][arg1 + var48] < var46) {
                            class85.field1986[arg6][arg7 + var47][arg1 + var48] = (byte) var46;
                        }
                    }
                }
            }
            if (var9.field1236 != 0 && arg5 != null) {
                arg5.method916(var11, var9.field1220, arg7, arg1, var10, (byte) -73);
            }
        } else if (arg2 >= 12) {
            class26 var23;
            if (var9.field1226 == -1 && var9.field1252 == null) {
                var23 = var9.method422(true, var18, var20, arg4, var16, var17, arg2);
            } else {
                var23 = new class106(arg3, arg2, arg4, arg6, arg7, arg1, var9.field1226, true, null);
            }
            arg0.method1153(arg6, arg7, arg1, var20, 1, 1, var23, 0, var19, var21);
            if (arg2 >= 12 && arg2 <= 17 && arg2 != 13 && arg6 > 0) {
                class103.field2428[arg6][arg7][arg1] = class107.method864(class103.field2428[arg6][arg7][arg1], 2340);
            }
            if (var9.field1236 != 0 && arg5 != null) {
                arg5.method916(var11, var9.field1220, arg7, arg1, var10, (byte) -73);
            }
        } else if (arg2 == 0) {
            class26 var24;
            if (var9.field1226 == -1 && var9.field1252 == null) {
                var24 = var9.method422(true, var18, var20, arg4, var16, var17, 0);
            } else {
                var24 = new class106(arg3, 0, arg4, arg6, arg7, arg1, var9.field1226, true, null);
            }
            arg0.method1119(arg6, arg7, arg1, var20, var24, null, class137.field3178[arg4], 0, var19, var21);
            if (arg4 == 0) {
                if (var9.field1254) {
                    class85.field1986[arg6][arg7][arg1] = 50;
                    class85.field1986[arg6][arg7][arg1 + 1] = 50;
                }
                if (var9.field1211) {
                    class103.field2428[arg6][arg7][arg1] = class107.method864(class103.field2428[arg6][arg7][arg1], 585);
                }
            } else if (arg4 == 1) {
                if (var9.field1254) {
                    class85.field1986[arg6][arg7][arg1 + 1] = 50;
                    class85.field1986[arg6][arg7 + 1][arg1 + 1] = 50;
                }
                if (var9.field1211) {
                    class103.field2428[arg6][arg7][arg1 + 1] = class107.method864(class103.field2428[arg6][arg7][arg1 + 1], 1170);
                }
            } else if (arg4 == 2) {
                if (var9.field1254) {
                    class85.field1986[arg6][arg7 + 1][arg1] = 50;
                    class85.field1986[arg6][arg7 + 1][arg1 + 1] = 50;
                }
                if (var9.field1211) {
                    class103.field2428[arg6][arg7 + 1][arg1] = class107.method864(class103.field2428[arg6][arg7 + 1][arg1], 585);
                }
            } else if (arg4 == 3) {
                if (var9.field1254) {
                    class85.field1986[arg6][arg7][arg1] = 50;
                    class85.field1986[arg6][arg7 + 1][arg1] = 50;
                }
                if (var9.field1211) {
                    class103.field2428[arg6][arg7][arg1] = class107.method864(class103.field2428[arg6][arg7][arg1], 1170);
                }
            }
            if (var9.field1236 != 0 && arg5 != null) {
                arg5.method922(var9.field1220, arg2, arg7, true, arg1, arg4);
            }
            if (var9.field1246 != 16) {
                arg0.method1154(arg6, arg7, arg1, var9.field1246);
            }
        } else if (arg2 == 1) {
            class26 var25;
            if (var9.field1226 == -1 && var9.field1252 == null) {
                var25 = var9.method422(true, var18, var20, arg4, var16, var17, 1);
            } else {
                var25 = new class106(arg3, 1, arg4, arg6, arg7, arg1, var9.field1226, true, null);
            }
            arg0.method1119(arg6, arg7, arg1, var20, var25, null, class121.field2879[arg4], 0, var19, var21);
            if (var9.field1254) {
                if (arg4 == 0) {
                    class85.field1986[arg6][arg7][arg1 + 1] = 50;
                } else if (arg4 == 1) {
                    class85.field1986[arg6][arg7 + 1][arg1 + 1] = 50;
                } else if (arg4 == 2) {
                    class85.field1986[arg6][arg7 + 1][arg1] = 50;
                } else if (arg4 == 3) {
                    class85.field1986[arg6][arg7][arg1] = 50;
                }
            }
            if (var9.field1236 != 0 && arg5 != null) {
                arg5.method922(var9.field1220, arg2, arg7, true, arg1, arg4);
            }
        } else if (arg2 == 2) {
            int var26 = arg4 + 1 & 0x3;
            class26 var27;
            class26 var28;
            if (var9.field1226 == -1 && var9.field1252 == null) {
                var27 = var9.method422(true, var18, var20, arg4 + 4, var16, var17, 2);
                var28 = var9.method422(true, var18, var20, var26, var16, var17, 2);
            } else {
                var27 = new class106(arg3, 2, arg4 + 4, arg6, arg7, arg1, var9.field1226, true, null);
                var28 = new class106(arg3, 2, var26, arg6, arg7, arg1, var9.field1226, true, null);
            }
            arg0.method1119(arg6, arg7, arg1, var20, var27, var28, class137.field3178[arg4], class137.field3178[var26], var19, var21);
            if (var9.field1211) {
                if (arg4 == 0) {
                    class103.field2428[arg6][arg7][arg1] = class107.method864(class103.field2428[arg6][arg7][arg1], 585);
                    class103.field2428[arg6][arg7][arg1 + 1] = class107.method864(class103.field2428[arg6][arg7][arg1 + 1], 1170);
                } else if (arg4 == 1) {
                    class103.field2428[arg6][arg7][arg1 + 1] = class107.method864(class103.field2428[arg6][arg7][arg1 + 1], 1170);
                    class103.field2428[arg6][arg7 + 1][arg1] = class107.method864(class103.field2428[arg6][arg7 + 1][arg1], 585);
                } else if (arg4 == 2) {
                    class103.field2428[arg6][arg7 + 1][arg1] = class107.method864(class103.field2428[arg6][arg7 + 1][arg1], 585);
                    class103.field2428[arg6][arg7][arg1] = class107.method864(class103.field2428[arg6][arg7][arg1], 1170);
                } else if (arg4 == 3) {
                    class103.field2428[arg6][arg7][arg1] = class107.method864(class103.field2428[arg6][arg7][arg1], 1170);
                    class103.field2428[arg6][arg7][arg1] = class107.method864(class103.field2428[arg6][arg7][arg1], 585);
                }
            }
            if (var9.field1236 != 0 && arg5 != null) {
                arg5.method922(var9.field1220, arg2, arg7, true, arg1, arg4);
            }
            if (var9.field1246 != 16) {
                arg0.method1154(arg6, arg7, arg1, var9.field1246);
            }
        } else if (arg2 == 3) {
            class26 var29;
            if (var9.field1226 == -1 && var9.field1252 == null) {
                var29 = var9.method422(true, var18, var20, arg4, var16, var17, 3);
            } else {
                var29 = new class106(arg3, 3, arg4, arg6, arg7, arg1, var9.field1226, true, null);
            }
            arg0.method1119(arg6, arg7, arg1, var20, var29, null, class121.field2879[arg4], 0, var19, var21);
            if (var9.field1254) {
                if (arg4 == 0) {
                    class85.field1986[arg6][arg7][arg1 + 1] = 50;
                } else if (arg4 == 1) {
                    class85.field1986[arg6][arg7 + 1][arg1 + 1] = 50;
                } else if (arg4 == 2) {
                    class85.field1986[arg6][arg7 + 1][arg1] = 50;
                } else if (arg4 == 3) {
                    class85.field1986[arg6][arg7][arg1] = 50;
                }
            }
            if (var9.field1236 != 0 && arg5 != null) {
                arg5.method922(var9.field1220, arg2, arg7, true, arg1, arg4);
            }
        } else if (arg2 == 9) {
            class26 var30;
            if (var9.field1226 == -1 && var9.field1252 == null) {
                var30 = var9.method422(true, var18, var20, arg4, var16, var17, arg2);
            } else {
                var30 = new class106(arg3, arg2, arg4, arg6, arg7, arg1, var9.field1226, true, null);
            }
            arg0.method1153(arg6, arg7, arg1, var20, 1, 1, var30, 0, var19, var21);
            if (var9.field1236 != 0 && arg5 != null) {
                arg5.method916(var11, var9.field1220, arg7, arg1, var10, (byte) -73);
            }
            if (var9.field1246 != 16) {
                arg0.method1154(arg6, arg7, arg1, var9.field1246);
            }
        } else if (arg2 == 4) {
            class26 var31;
            if (var9.field1226 == -1 && var9.field1252 == null) {
                var31 = var9.method422(true, var18, var20, arg4, var16, var17, 4);
            } else {
                var31 = new class106(arg3, 4, arg4, arg6, arg7, arg1, var9.field1226, true, null);
            }
            arg0.method1160(arg6, arg7, arg1, var20, var31, null, class137.field3178[arg4], 0, 0, 0, var19, var21);
        } else if (arg2 == 5) {
            int var32 = 16;
            int var33 = arg0.method1155(arg6, arg7, arg1);
            if (var33 != 0) {
                var32 = class5.method22(123, var33 >> 14 & 0x7FFF).field1246;
            }
            class26 var34;
            if (var9.field1226 == -1 && var9.field1252 == null) {
                var34 = var9.method422(true, var18, var20, arg4, var16, var17, 4);
            } else {
                var34 = new class106(arg3, 4, arg4, arg6, arg7, arg1, var9.field1226, true, null);
            }
            arg0.method1160(arg6, arg7, arg1, var20, var34, null, class137.field3178[arg4], 0, class129.field2976[arg4] * var32, class83.field1928[arg4] * var32, var19, var21);
        } else if (arg2 == 6) {
            int var35 = 8;
            int var36 = arg0.method1155(arg6, arg7, arg1);
            if (var36 != 0) {
                var35 = class5.method22(arg8 - 51, var36 >> 14 & 0x7FFF).field1246 / 2;
            }
            class26 var37;
            if (var9.field1226 == -1 && var9.field1252 == null) {
                var37 = var9.method422(true, var18, var20, arg4 + 4, var16, var17, 4);
            } else {
                var37 = new class106(arg3, 4, arg4 + 4, arg6, arg7, arg1, var9.field1226, true, null);
            }
            arg0.method1160(arg6, arg7, arg1, var20, var37, null, 256, arg4, class143.field3281[arg4] * var35, class41.field956[arg4] * var35, var19, var21);
        } else if (arg2 == 7) {
            int var38 = arg4 + 2 & 0x3;
            class26 var39;
            if (var9.field1226 == -1 && var9.field1252 == null) {
                var39 = var9.method422(true, var18, var20, var38 + 4, var16, var17, 4);
            } else {
                var39 = new class106(arg3, 4, var38 + 4, arg6, arg7, arg1, var9.field1226, true, null);
            }
            arg0.method1160(arg6, arg7, arg1, var20, var39, null, 256, var38, 0, 0, var19, var21);
        } else if (arg2 == 8) {
            int var40 = 8;
            int var41 = arg0.method1155(arg6, arg7, arg1);
            if (var41 != 0) {
                var40 = class5.method22(118, var41 >> 14 & 0x7FFF).field1246 / 2;
            }
            int var42 = arg4 + 2 & 0x3;
            class26 var43;
            class26 var44;
            if (var9.field1226 == -1 && var9.field1252 == null) {
                var43 = var9.method422(true, var18, var20, arg4 + 4, var16, var17, 4);
                var44 = var9.method422(true, var18, var20, var42 + 4, var16, var17, 4);
            } else {
                var43 = new class106(arg3, 4, arg4 + 4, arg6, arg7, arg1, var9.field1226, true, null);
                var44 = new class106(arg3, 4, var42 + 4, arg6, arg7, arg1, var9.field1226, true, null);
            }
            arg0.method1160(arg6, arg7, arg1, var20, var43, var44, 256, arg4, class143.field3281[arg4] * var40, class41.field956[arg4] * var40, var19, var21);
        }
    }

    @OriginalMember(owner = "client!pe", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class38.field910 != null) {
            class139.field3211 = 0;
            class126.field2917 = arg0.getX();
            class44.field1038 = arg0.getY();
        }
        field2552++;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)V")
    public static final void method871(int arg0, int arg1) {
        field2561++;
        if (class28.method192(arg1, -18020)) {
            if (arg0 > -120) {
                method869(70);
            }
            class106.method861(-1, class79.field1826[arg1], 2047);
        }
    }

    @OriginalMember(owner = "client!pe", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class38.field910 != null) {
            class139.field3211 = 0;
            class126.field2917 = arg0.getX();
            class44.field1038 = arg0.getY();
        }
        field2560++;
    }

    @OriginalMember(owner = "client!pe", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class38.field910 != null) {
            class139.field3211 = 0;
            class126.field2917 = -1;
            class44.field1038 = -1;
        }
        field2556++;
    }
}
