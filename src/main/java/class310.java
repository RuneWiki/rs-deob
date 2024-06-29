import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class310 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "Lwa;")
    public static class75 field5274 = class66.method560("Bitte entfernen Sie ", false);

    @OriginalMember(owner = "client!dj", name = "p", descriptor = "Lwa;")
    public static class75 field5284 = class66.method560("underlay", false);

    @OriginalMember(owner = "client!dj", name = "n", descriptor = "Lwa;")
    public static class75 field5282 = class66.method560("leuchten3:", false);

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "Lvd;")
    public static class126 field5269 = new class126(32);

    @OriginalMember(owner = "client!dj", name = "s", descriptor = "Lwa;")
    public static class75 field5287 = null;

    @OriginalMember(owner = "client!dj", name = "t", descriptor = "Lwa;")
    public static class75 field5288 = class66.method560("blinken3:", false);

    @OriginalMember(owner = "client!dj", name = "y", descriptor = "I")
    public static int field5293 = 0;

    @OriginalMember(owner = "client!dj", name = "w", descriptor = "I")
    public static int field5291 = 0;

    @OriginalMember(owner = "client!dj", name = "x", descriptor = "Lwa;")
    private static class75 field5292 = class66.method560("Loading textures )2 ", false);

    @OriginalMember(owner = "client!dj", name = "u", descriptor = "Lwa;")
    public static class75 field5289 = field5292;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "I")
    public static int field5270;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
    public static int field5271;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "I")
    public static int field5272;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "I")
    public static int field5273;

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "I")
    public static int field5275;

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "I")
    public static int field5276;

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "I")
    public static int field5277;

    @OriginalMember(owner = "client!dj", name = "j", descriptor = "I")
    public static int field5278;

    @OriginalMember(owner = "client!dj", name = "k", descriptor = "I")
    public static int field5279;

    @OriginalMember(owner = "client!dj", name = "l", descriptor = "I")
    public static int field5280;

    @OriginalMember(owner = "client!dj", name = "m", descriptor = "I")
    public static int field5281;

    @OriginalMember(owner = "client!dj", name = "o", descriptor = "I")
    public static int field5283;

    @OriginalMember(owner = "client!dj", name = "q", descriptor = "I")
    public static int field5285;

    @OriginalMember(owner = "client!dj", name = "r", descriptor = "I")
    public static int field5286;

    @OriginalMember(owner = "client!dj", name = "z", descriptor = "Z")
    public static boolean field5294;

    @OriginalMember(owner = "client!dj", name = "v", descriptor = "[Lrg;")
    public static class89[] field5290;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "([[B[[FI[[FI[Lsa;[[F[[II[[B[[B[[B)V", line = 10)
    public static final void method2108(byte[][] arg0, float[][] arg1, int arg2, float[][] arg3, int arg4, class102[] arg5, float[][] arg6, int[][] arg7, int arg8, byte[][] arg9, byte[][] arg10, byte[][] arg11) {
        for (int var12 = 0; var12 < arg4; var12++) {
            class102 var13 = arg5[var12];
            if (var13.field1715 == arg8) {
                int var14 = 0;
                class192 var15 = new class192();
                int var16 = (var13.field1719 >> 7) - var13.field1717;
                int var17 = (var13.field1730 >> 7) - var13.field1717;
                int var18 = (var13.field1719 >> 7) + var13.field1717;
                if (var16 < 0) {
                    var14 -= var16;
                    var16 = 0;
                }
                if (var18 > 103) {
                    var18 = 103;
                }
                for (int var19 = var16; var19 <= var18; var19++) {
                    short var20 = var13.field1726[var14];
                    int var21 = (var20 >> 8) + var17;
                    int var22 = (var20 & 0xFF) + var21 - 1;
                    if (var22 > 103) {
                        var22 = 103;
                    }
                    if (var21 < 0) {
                        var21 = 0;
                    }
                    for (int var23 = var21; var23 <= var22; var23++) {
                        int var24 = arg10[var23][var19] & 0xFF;
                        int var25 = arg0[var23][var19] & 0xFF;
                        boolean var26 = false;
                        if (var24 == 0) {
                            if (var25 == 0) {
                                continue;
                            }
                            class87 var31 = class282.method1999(-3, var25 - 1);
                            if (var31.field1436 == -1) {
                                continue;
                            }
                            if (arg9[var23][var19] != 0) {
                                int[] var55 = class238.field4010[arg9[var23][var19]];
                                var15.field3193 += (var55.length >> 1) * 3 - 6;
                                var15.field3188 += var55.length >> 1;
                                continue;
                            }
                        } else if (var25 != 0) {
                            class87 var27 = class282.method1999(-3, var25 - 1);
                            if (var27.field1436 == -1) {
                                byte var29 = arg9[var23][var19];
                                if (var29 != 0) {
                                    int[] var30 = class136.field2337[var29];
                                    var15.field3193 += (var30.length >> 1) * 3 - 6;
                                    var15.field3188 += var30.length >> 1;
                                }
                                continue;
                            }
                            byte var28 = arg9[var23][var19];
                            if (var28 != 0) {
                                var26 = true;
                            }
                        }
                        class285 var32 = class188.method1423(arg8, var23, var19);
                        if (var32 != null) {
                            int var33 = (int) (var32.field4914 >> 14) & 0x3F;
                            if (var33 == 9) {
                                int[] var37 = null;
                                int var38 = (int) (var32.field4914 >> 20) & 0x3;
                                if ((var38 & 0x1) == 0) {
                                    boolean var39 = var21 <= var23 - 1;
                                    boolean var40 = var22 >= var23 + 1;
                                    if (!var39 && var19 + 1 <= var18) {
                                        short var41 = var13.field1726[var14 + 1];
                                        int var42 = var17 + (var41 >> 8);
                                        int var43 = var42 + (var41 & 0xFF);
                                        var39 = var23 > var42 && var23 < var43;
                                    }
                                    if (!var40 && (var19 - 1) >= var16) {
                                        short var44 = var13.field1726[var14 - 1];
                                        int var45 = (var44 >> 8) + var17;
                                        int var46 = var45 + (var44 & 0xFF);
                                        var40 = var45 < var23 && var46 > var23;
                                    }
                                    if (var39 && var40) {
                                        var37 = class238.field4010[0];
                                    } else if (var39) {
                                        var37 = class238.field4010[1];
                                    } else if (var40) {
                                        var37 = class238.field4010[1];
                                    }
                                } else {
                                    boolean var47 = var21 <= (var23 - 1);
                                    boolean var48 = (var23 + 1) <= var22;
                                    if (!var47 && (var19 - 1) >= var16) {
                                        short var49 = var13.field1726[var14 - 1];
                                        int var50 = (var49 >> 8) + var17;
                                        int var51 = (var49 & 0xFF) + var50;
                                        var47 = var23 > var50 && var51 > var23;
                                    }
                                    if (!var48 && var19 + 1 <= var18) {
                                        short var52 = var13.field1726[var14 + 1];
                                        int var53 = var17 + (var52 >> 8);
                                        int var54 = (var52 & 0xFF) + var53;
                                        var48 = var23 > var53 && var23 < var54;
                                    }
                                    if (var47 && var48) {
                                        var37 = class238.field4010[0];
                                    } else if (var47) {
                                        var37 = class238.field4010[1];
                                    } else if (var48) {
                                        var37 = class238.field4010[1];
                                    }
                                }
                                if (var37 != null) {
                                    var15.field3193 += ((var37.length >> 1) - 2) * 3;
                                    var15.field3188 += var37.length >> 1;
                                }
                                continue;
                            }
                        }
                        if (var26) {
                            int[] var35 = class238.field4010[arg9[var23][var19]];
                            int[] var36 = class136.field2337[arg9[var23][var19]];
                            var15.field3193 += ((var35.length >> 1) - 2) * 3;
                            var15.field3193 += ((var36.length >> 1) - 2) * 3;
                            var15.field3188 += var35.length >> 1;
                            var15.field3188 += var36.length >> 1;
                        } else {
                            int[] var34 = class238.field4010[0];
                            var15.field3193 += ((var34.length >> 1) - 2) * 3;
                            var15.field3188 += var34.length >> 1;
                        }
                    }
                    var14++;
                }
                var15.method1446();
                int var56 = 0;
                if ((var13.field1719 >> 7) - var13.field1717 < 0) {
                    var56 -= (var13.field1719 >> 7) - var13.field1717;
                }
                for (int var57 = var16; var57 <= var18; var57++) {
                    short var58 = var13.field1726[var56];
                    int var59 = (var58 >> 8) + var17;
                    int var60 = (var58 & 0xFF) + var59 - 1;
                    if (var59 < 0) {
                        var59 = 0;
                    }
                    if (var60 > 103) {
                        var60 = 103;
                    }
                    for (int var61 = var59; var61 <= var60; var61++) {
                        byte var62 = arg11[var61][var57];
                        int var63 = arg10[var61][var57] & 0xFF;
                        boolean var64 = false;
                        int var65 = arg0[var61][var57] & 0xFF;
                        if (var63 == 0) {
                            if (var65 == 0) {
                                continue;
                            }
                            class87 var68 = class282.method1999(arg2 - 2, var65 + -1);
                            if (var68.field1436 == -1) {
                                continue;
                            }
                            if (arg9[var61][var57] != 0) {
                                class64.method552(arg11[var61][var57], var15, class238.field4010[arg9[var61][var57]], var57, var13, 128, arg6, arg1, arg3, var61, arg7);
                                continue;
                            }
                        } else if (var65 == 0) {
                            var62 = 0;
                        } else {
                            class87 var66 = class282.method1999(arg2 - 2, var65 - 1);
                            if (var66.field1436 == -1) {
                                class64.method552(arg11[var61][var57], var15, class136.field2337[arg9[var61][var57]], var57, var13, 128, arg6, arg1, arg3, var61, arg7);
                                continue;
                            }
                            byte var67 = arg9[var61][var57];
                            if (var67 != 0) {
                                var64 = true;
                            }
                        }
                        class285 var69 = class188.method1423(arg8, var61, var57);
                        if (var69 != null) {
                            int var70 = (int) (var69.field4914 >> 14) & 0x3F;
                            if (var70 == 9) {
                                int[] var71 = null;
                                int var72 = (int) (var69.field4914 >> 20) & 0x3;
                                if ((var72 & 0x1) == 0) {
                                    boolean var73 = var59 <= var61 - 1;
                                    if (!var73 && var18 >= (var57 + 1)) {
                                        short var74 = var13.field1726[var56 + 1];
                                        int var75 = (var74 >> 8) + var17;
                                        int var76 = (var74 & 0xFF) + var75;
                                        var73 = var61 > var75 && var76 > var61;
                                    }
                                    boolean var77 = var61 + 1 <= var60;
                                    if (!var77 && var16 <= (var57 - 1)) {
                                        short var78 = var13.field1726[var56 - 1];
                                        int var79 = (var78 >> 8) + var17;
                                        int var80 = (var78 & 0xFF) + var79;
                                        var77 = var79 < var61 && var80 > var61;
                                    }
                                    if (var73 && var77) {
                                        var71 = class238.field4010[0];
                                    } else if (var73) {
                                        var62 = 1;
                                        var71 = class238.field4010[1];
                                    } else if (var77) {
                                        var62 = 3;
                                        var71 = class238.field4010[1];
                                    }
                                } else {
                                    boolean var81 = var59 <= (var61 - 1);
                                    boolean var82 = var61 + 1 <= var60;
                                    if (!var81 && (var57 - 1) >= var16) {
                                        short var83 = var13.field1726[var56 - 1];
                                        int var84 = (var83 >> 8) + var17;
                                        int var85 = var84 + (var83 & 0xFF);
                                        var81 = var61 > var84 && var85 > var61;
                                    }
                                    if (!var82 && (var57 + 1) <= var18) {
                                        short var86 = var13.field1726[var56 + 1];
                                        int var87 = var17 + (var86 >> 8);
                                        int var88 = (var86 & 0xFF) + var87;
                                        var82 = var87 < var61 && var61 < var88;
                                    }
                                    if (var81 && var82) {
                                        var71 = class238.field4010[0];
                                    } else if (var81) {
                                        var71 = class238.field4010[1];
                                        var62 = 0;
                                    } else if (var82) {
                                        var71 = class238.field4010[1];
                                        var62 = 2;
                                    }
                                }
                                if (var71 != null) {
                                    class64.method552(var62, var15, var71, var57, var13, 128, arg6, arg1, arg3, var61, arg7);
                                }
                                continue;
                            }
                        }
                        if (var64) {
                            class64.method552(arg11[var61][var57], var15, class136.field2337[arg9[var61][var57]], var57, var13, arg2 + 129, arg6, arg1, arg3, var61, arg7);
                            class64.method552(arg11[var61][var57], var15, class238.field4010[arg9[var61][var57]], var57, var13, 128, arg6, arg1, arg3, var61, arg7);
                        } else {
                            class64.method552(var62, var15, class238.field4010[0], var57, var13, arg2 ^ 0xFFFFFF7F, arg6, arg1, arg3, var61, arg7);
                        }
                    }
                    var56++;
                }
                if (var15.field3201 > 0 && var15.field3189 > 0) {
                    var15.method1445();
                    var13.field1739 = var15;
                }
            }
        }
        if (arg2 != -1) {
            method2110((byte[]) null, 89, -117, -72, false, 19, 99, (class104[]) null, (byte) 74, -2, -14);
        }
        field5278++;
    }

    @OriginalMember(owner = "client!dj", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 539)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field5272++;
        if (class263.field4546 != null) {
            class203.field3439 = 0;
            class29.field416 = arg0.getX();
            class126.field2184 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIBIIIIII)V", line = 556)
    public static final void method2109(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field5286++;
        class85 var10 = (class85) class216.field3701.method1250(true);
        class85 var11 = null;
        while (var10 != null) {
            if (var10.field1411 == arg5 && var10.field1396 == arg6 && var10.field1406 == arg0 && var10.field1401 == arg7) {
                var11 = var10;
                break;
            }
            var10 = (class85) class216.field3701.method1256((byte) -124);
        }
        if (arg3 < 20) {
            return;
        }
        if (var11 == null) {
            var11 = new class85();
            var11.field1406 = arg0;
            var11.field1411 = arg5;
            var11.field1401 = arg7;
            var11.field1396 = arg6;
            class32.method214(var11, true);
            class216.field3701.method1251(var11, -123);
        }
        var11.field1408 = arg2;
        var11.field1398 = arg1;
        var11.field1399 = arg9;
        var11.field1391 = arg8;
        var11.field1410 = arg4;
    }

    @OriginalMember(owner = "client!dj", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 601)
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class263.field4546 != null) {
            class203.field3439 = 0;
            class78.field1332 = arg0.getX();
            class20.field271 = arg0.getY();
            class178.field3012 = class78.method669(2047);
            if (arg0.isMetaDown()) {
                class120.field2017 = 2;
                class34.field494 = 2;
            } else {
                class120.field2017 = 1;
                class34.field494 = 1;
            }
            int var2 = arg0.getModifiers();
            if ((var2 & 0x10) != 0) {
            }
            if ((var2 & 0x8) == 0) {
            }
            if ((var2 & 0x4) == 0) {
            }
        }
        field5275++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!dj", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 654)
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class263.field4546 != null) {
            class203.field3439 = 0;
            class29.field416 = -1;
            class126.field2184 = -1;
        }
        field5276++;
    }

    @OriginalMember(owner = "client!dj", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 672)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class263.field4546 != null) {
            class203.field3439 = 0;
            class29.field416 = arg0.getX();
            class126.field2184 = arg0.getY();
        }
        field5270++;
    }

    @OriginalMember(owner = "client!dj", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 695)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class263.field4546 != null) {
            class203.field3439 = 0;
            class34.field494 = 0;
            int var2 = arg0.getModifiers();
            if ((var2 & 0x8) == 0) {
            }
            if ((var2 & 0x10) == 0) {
            }
            if ((var2 & 0x4) == 0) {
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field5285++;
    }

    @OriginalMember(owner = "client!dj", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 731)
    public final void focusGained(FocusEvent arg0) {
        field5283++;
    }

    @OriginalMember(owner = "client!dj", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 741)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class263.field4546 != null) {
            class203.field3439 = 0;
            class29.field416 = arg0.getX();
            class126.field2184 = arg0.getY();
        }
        field5271++;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "([BIIIZII[Lpk;BII)V", line = 759)
    public static final void method2110(byte[] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, class104[] arg7, byte arg8, int arg9, int arg10) {
        field5279++;
        byte var11;
        if (arg4) {
            var11 = 1;
        } else {
            var11 = 4;
        }
        if (!arg4) {
            for (int var12 = 0; var12 < 8; var12++) {
                for (int var13 = 0; var13 < 8; var13++) {
                    if (arg9 + var12 > 0 && (arg9 + var12) < 103 && arg1 + var13 > 0 && (arg1 + var13) < 103) {
                        arg7[arg6].field1766[arg9 + var12][arg1 + var13] = class235.method1710(arg7[arg6].field1766[arg9 + var12][arg1 + var13], -16777217);
                    }
                }
            }
        }
        class60 var14 = new class60(arg0);
        for (int var15 = 0; var15 < var11; var15++) {
            for (int var16 = 0; var16 < 64; var16++) {
                for (int var17 = 0; var17 < 64; var17++) {
                    if (arg2 == var15 && var16 >= arg10 && arg10 + 8 > var16 && arg5 <= var17 && var17 < arg5 + 8) {
                        class24.method168(arg3, arg6, 0, 0, var14, arg4, arg1 + class34.method229(var17 & 0x7, arg3, var16 & 0x7, (byte) 57), 0, arg9 + class240.method1753(var17 & 0x7, arg3, var16 & 0x7, 60));
                    } else {
                        class24.method168(0, 0, 0, 0, var14, arg4, -1, 0, -1);
                    }
                }
            }
        }
        if (arg8 > -75) {
            field5290 = (class89[]) null;
        }
        if (arg4) {
            return;
        }
        class230 var18 = null;
        while (true) {
            while (var14.field1012 < var14.field997.length) {
                int var19 = var14.method501(0);
                if (var19 == 0) {
                    var18 = new class230(var14);
                } else if (var19 == 1) {
                    int var20 = var14.method501(0);
                    if (var20 > 0) {
                        for (int var21 = 0; var21 < var20; var21++) {
                            class102 var22 = new class102(var14);
                            int var23 = var22.field1730 >> 7;
                            int var24 = var22.field1719 >> 7;
                            if (var22.field1715 == arg2 && var23 >= arg10 && (arg10 + 8) > var23 && var24 >= arg5 && var24 < (arg5 + 8)) {
                                int var25 = class273.method1946(-1, var22.field1719 & 0x3FF, arg3, var22.field1730 & 0x3FF) + (arg9 << 7);
                                int var26 = class197.method1470(var22.field1730 & 0x3FF, 24466, arg3, var22.field1719 & 0x3FF) + (arg1 << 7);
                                var22.field1730 = var25;
                                var22.field1719 = var26;
                                int var27 = var22.field1719 >> 7;
                                int var28 = var22.field1730 >> 7;
                                if (var28 >= 0 && var27 >= 0 && var28 < 104 && var27 < 104) {
                                    var22.field1736 = class53.field879[var22.field1715][var28][var27] - var22.field1736;
                                    class209.method1542(var22);
                                }
                            }
                        }
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            if (var18 == null) {
                var18 = new class230();
            }
            class213.field3629[arg9 >> 3][arg1 >> 3] = var18;
            break;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)V", line = 908)
    public static void method2111(byte arg0) {
        if (arg0 <= 46) {
            method2110((byte[]) null, -94, 55, 86, true, -7, -31, (class104[]) null, (byte) 6, 42, -52);
        }
        field5288 = null;
        field5282 = null;
        field5287 = null;
        field5292 = null;
        field5290 = null;
        field5274 = null;
        field5284 = null;
        field5289 = null;
        field5269 = null;
    }

    @OriginalMember(owner = "client!dj", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 927)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class263.field4546 != null) {
            class34.field494 = 0;
        }
        field5277++;
    }

    @OriginalMember(owner = "client!dj", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 947)
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field5280++;
    }
}
