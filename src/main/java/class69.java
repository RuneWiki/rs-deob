import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class69 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "Z")
    public static boolean field1111 = false;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "Lda;")
    private static class275 field1109 = class255.method1672(117, "yellow:");

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "Lda;")
    public static class275 field1116 = field1109;

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "Lda;")
    public static class275 field1117 = field1109;

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "Lqe;")
    public static class42 field1114 = new class42(128);

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!ib", name = "m", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!ib", name = "n", descriptor = "I")
    public static int field1121;

    @OriginalMember(owner = "client!ib", name = "o", descriptor = "I")
    public static int field1122;

    @OriginalMember(owner = "client!ib", name = "p", descriptor = "I")
    public static int field1123;

    @OriginalMember(owner = "client!ib", name = "q", descriptor = "I")
    public static int field1124;

    @OriginalMember(owner = "client!ib", name = "r", descriptor = "I")
    public static int field1125;

    @OriginalMember(owner = "client!ib", name = "s", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "Lwb;")
    public static class179 field1110;

    @OriginalMember(owner = "client!ib", name = "t", descriptor = "[I")
    public static int[] field1127;

    @OriginalMember(owner = "client!ib", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field1113++;
        if (class108.field1869 != null) {
            class102.field1705 = 0;
            class250.field4418 = arg0.getX();
            class89.field1502 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!ib", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field1125++;
        if (class108.field1869 != null) {
            class102.field1705 = 0;
            class250.field4418 = -1;
            class89.field1502 = -1;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I[IZIIIIIIII)V")
    public static final void method455(int arg0, int[] arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var11 = arg5;
        field1108++;
        if (class47.field789 <= arg5) {
            return;
        }
        int var12 = arg3 + arg5;
        if (class47.field792 > arg5) {
            var11 = class47.field792;
        }
        if (class47.field792 >= var12) {
            return;
        }
        if (var12 > class47.field789) {
            var12 = class47.field789;
        }
        int var13 = arg4;
        if (arg4 >= class47.field785) {
            return;
        }
        if (arg4 < class47.field788) {
            var13 = class47.field788;
        }
        int var14 = arg4 + arg8;
        if (var14 <= class47.field788) {
            return;
        }
        if (arg7 == 9) {
            arg7 = 1;
            arg0 = arg0 + 1 & 0x3;
        }
        if (class47.field785 < var14) {
            var14 = class47.field785;
        }
        if (arg7 == 10) {
            arg0 = arg0 + 3 & 0x3;
            arg7 = 1;
        }
        if (arg7 == 11) {
            arg7 = 8;
            arg0 = arg0 + 3 & 0x3;
        }
        int var15 = class47.field790 * var13 + var11;
        int var16 = var14 - arg4;
        int var17 = var13 - arg4;
        int var18 = class47.field790 + var11 - var12;
        int var19 = arg8 - var16;
        int var20 = var11 - arg5;
        if (arg9 != -22045) {
            return;
        }
        int var21 = var12 - arg5;
        int var22 = arg3 - var20;
        int var23 = arg3 - var21;
        int var24 = arg8 - var17;
        if (arg7 == 1) {
            if (arg0 == 0) {
                for (int var25 = var17; var25 < var16; var25++) {
                    for (int var26 = var20; var26 < var21; var26++) {
                        if (var25 >= var26) {
                            arg1[var15] = arg6;
                        } else if (arg2) {
                            arg1[var15] = arg10;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg0 == 1) {
                for (int var27 = var24 - 1; var27 >= var19; var27--) {
                    for (int var28 = var20; var28 < var21; var28++) {
                        if (var27 >= var28) {
                            arg1[var15] = arg6;
                        } else if (arg2) {
                            arg1[var15] = arg10;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg0 == 2) {
                for (int var29 = var17; var29 < var16; var29++) {
                    for (int var30 = var20; var30 < var21; var30++) {
                        if (var30 >= var29) {
                            arg1[var15] = arg6;
                        } else if (arg2) {
                            arg1[var15] = arg10;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg0 == 3) {
                for (int var31 = var24 - 1; var31 >= var19; var31--) {
                    for (int var32 = var20; var32 < var21; var32++) {
                        if (var31 <= var32) {
                            arg1[var15] = arg6;
                        } else if (arg2) {
                            arg1[var15] = arg10;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            }
        } else if (arg7 == 2) {
            if (arg0 == 0) {
                for (int var33 = var24 - 1; var33 >= var19; var33--) {
                    for (int var34 = var20; var34 < var21; var34++) {
                        if (var34 <= (var33 >> 1)) {
                            arg1[var15] = arg6;
                        } else if (arg2) {
                            arg1[var15] = arg10;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg0 == 1) {
                for (int var35 = var17; var35 < var16; var35++) {
                    for (int var36 = var20; var36 < var21; var36++) {
                        if (var15 >= 0 && var15 < arg1.length) {
                            if ((var35 << 1) <= var36) {
                                arg1[var15] = arg6;
                            } else if (arg2) {
                                arg1[var15] = arg10;
                            }
                            var15++;
                        } else {
                            var15++;
                        }
                    }
                    var15 += var18;
                }
            } else if (arg0 == 2) {
                for (int var37 = var17; var37 < var16; var37++) {
                    for (int var38 = var22 - 1; var38 >= var23; var38--) {
                        if ((var37 >> 1) >= var38) {
                            arg1[var15] = arg6;
                        } else if (arg2) {
                            arg1[var15] = arg10;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg0 == 3) {
                for (int var39 = var24 - 1; var39 >= var19; var39--) {
                    for (int var40 = var22 - 1; var40 >= var23; var40--) {
                        if ((var39 << 1) <= var40) {
                            arg1[var15] = arg6;
                        } else if (arg2) {
                            arg1[var15] = arg10;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            }
        } else if (arg7 == 3) {
            if (arg0 == 0) {
                for (int var41 = var24 - 1; var41 >= var19; var41--) {
                    for (int var42 = var22 - 1; var42 >= var23; var42--) {
                        if (var42 <= (var41 >> 1)) {
                            arg1[var15] = arg6;
                        } else if (arg2) {
                            arg1[var15] = arg10;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg0 == 1) {
                for (int var43 = var24 - 1; var43 >= var19; var43--) {
                    for (int var44 = var20; var44 < var21; var44++) {
                        if ((var43 << 1) <= var44) {
                            arg1[var15] = arg6;
                        } else if (arg2) {
                            arg1[var15] = arg10;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg0 == 2) {
                for (int var45 = var17; var45 < var16; var45++) {
                    for (int var46 = var20; var46 < var21; var46++) {
                        if (var46 <= (var45 >> 1)) {
                            arg1[var15] = arg6;
                        } else if (arg2) {
                            arg1[var15] = arg10;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg0 == 3) {
                for (int var47 = var17; var47 < var16; var47++) {
                    for (int var48 = var22 - 1; var48 >= var23; var48--) {
                        if (var48 >= var47 << 1) {
                            arg1[var15] = arg6;
                        } else if (arg2) {
                            arg1[var15] = arg10;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            }
        } else if (arg7 == 4) {
            if (arg0 == 0) {
                for (int var49 = var24 - 1; var49 >= var19; var49--) {
                    for (int var50 = var20; var50 < var21; var50++) {
                        if (var49 >> 1 <= var50) {
                            arg1[var15] = arg6;
                        } else if (arg2) {
                            arg1[var15] = arg10;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg0 == 1) {
                for (int var51 = var17; var51 < var16; var51++) {
                    for (int var52 = var20; var52 < var21; var52++) {
                        if (var52 <= var51 << 1) {
                            arg1[var15] = arg6;
                        } else if (arg2) {
                            arg1[var15] = arg10;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg0 == 2) {
                for (int var53 = var17; var53 < var16; var53++) {
                    for (int var54 = var22 - 1; var54 >= var23; var54--) {
                        if ((var53 >> 1) <= var54) {
                            arg1[var15] = arg6;
                        } else if (arg2) {
                            arg1[var15] = arg10;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg0 == 3) {
                for (int var55 = var24 - 1; var55 >= var19; var55--) {
                    for (int var56 = var22 - 1; var56 >= var23; var56--) {
                        if ((var55 << 1) >= var56) {
                            arg1[var15] = arg6;
                        } else if (arg2) {
                            arg1[var15] = arg10;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            }
        } else if (arg7 != 5) {
            if (arg7 == 6) {
                if (arg0 == 0) {
                    for (int var65 = var17; var65 < var16; var65++) {
                        for (int var66 = var20; var66 < var21; var66++) {
                            if (arg3 / 2 >= var66) {
                                arg1[var15] = arg6;
                            } else if (arg2) {
                                arg1[var15] = arg10;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg0 == 1) {
                    for (int var67 = var17; var67 < var16; var67++) {
                        for (int var68 = var20; var68 < var21; var68++) {
                            if ((arg8 / 2) >= var67) {
                                arg1[var15] = arg6;
                            } else if (arg2) {
                                arg1[var15] = arg10;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg0 == 2) {
                    for (int var69 = var17; var69 < var16; var69++) {
                        for (int var70 = var20; var70 < var21; var70++) {
                            if (var70 >= arg3 / 2) {
                                arg1[var15] = arg6;
                            } else if (arg2) {
                                arg1[var15] = arg10;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg0 == 3) {
                    for (int var71 = var17; var71 < var16; var71++) {
                        for (int var72 = var20; var72 < var21; var72++) {
                            if (var71 >= (arg8 / 2)) {
                                arg1[var15] = arg6;
                            } else if (arg2) {
                                arg1[var15] = arg10;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
            }
            if (arg7 == 7) {
                if (arg0 == 0) {
                    for (int var73 = var17; var73 < var16; var73++) {
                        for (int var74 = var20; var74 < var21; var74++) {
                            if ((var73 - (arg8 / 2)) >= var74) {
                                arg1[var15] = arg6;
                            } else if (arg2) {
                                arg1[var15] = arg10;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg0 == 1) {
                    for (int var75 = var24 - 1; var75 >= var19; var75--) {
                        for (int var76 = var20; var76 < var21; var76++) {
                            if ((var75 - arg8 / 2) >= var76) {
                                arg1[var15] = arg6;
                            } else if (arg2) {
                                arg1[var15] = arg10;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg0 == 2) {
                    for (int var77 = var24 - 1; var77 >= var19; var77--) {
                        for (int var78 = var22 - 1; var78 >= var23; var78--) {
                            if (var78 <= (var77 - (arg8 / 2))) {
                                arg1[var15] = arg6;
                            } else if (arg2) {
                                arg1[var15] = arg10;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg0 == 3) {
                    for (int var79 = var17; var79 < var16; var79++) {
                        for (int var80 = var22 - 1; var80 >= var23; var80--) {
                            if (var80 <= (var79 - arg8 / 2)) {
                                arg1[var15] = arg6;
                            } else if (arg2) {
                                arg1[var15] = arg10;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
            }
            if (arg7 == 8) {
                if (arg0 == 0) {
                    for (int var81 = var17; var81 < var16; var81++) {
                        for (int var82 = var20; var82 < var21; var82++) {
                            if (var82 >= (var81 - (arg8 / 2))) {
                                arg1[var15] = arg6;
                            } else if (arg2) {
                                arg1[var15] = arg10;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg0 == 1) {
                    for (int var83 = var24 - 1; var83 >= var19; var83--) {
                        for (int var84 = var20; var84 < var21; var84++) {
                            if (var84 >= var83 - (arg8 / 2)) {
                                arg1[var15] = arg6;
                            } else if (arg2) {
                                arg1[var15] = arg10;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg0 == 2) {
                    for (int var85 = var24 - 1; var85 >= var19; var85--) {
                        for (int var86 = var22 - 1; var86 >= var23; var86--) {
                            if (var86 >= (var85 - (arg8 / 2))) {
                                arg1[var15] = arg6;
                            } else if (arg2) {
                                arg1[var15] = arg10;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg0 == 3) {
                    for (int var87 = var17; var87 < var16; var87++) {
                        for (int var88 = var22 - 1; var88 >= var23; var88--) {
                            if (var87 - (arg8 / 2) <= var88) {
                                arg1[var15] = arg6;
                            } else if (arg2) {
                                arg1[var15] = arg10;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
            }
        } else if (arg0 == 0) {
            for (int var57 = var24 - 1; var57 >= var19; var57--) {
                for (int var58 = var22 - 1; var58 >= var23; var58--) {
                    if (var58 >= var57 >> 1) {
                        arg1[var15] = arg6;
                    } else if (arg2) {
                        arg1[var15] = arg10;
                    }
                    var15++;
                }
                var15 += var18;
            }
        } else if (arg0 == 1) {
            for (int var59 = var24 - 1; var59 >= var19; var59--) {
                for (int var60 = var20; var60 < var21; var60++) {
                    if ((var59 << 1) >= var60) {
                        arg1[var15] = arg6;
                    } else if (arg2) {
                        arg1[var15] = arg10;
                    }
                    var15++;
                }
                var15 += var18;
            }
        } else if (arg0 == 2) {
            for (int var61 = var17; var61 < var16; var61++) {
                for (int var62 = var20; var62 < var21; var62++) {
                    if (var62 >= (var61 >> 1)) {
                        arg1[var15] = arg6;
                    } else if (arg2) {
                        arg1[var15] = arg10;
                    }
                    var15++;
                }
                var15 += var18;
            }
        } else if (arg0 == 3) {
            for (int var63 = var17; var63 < var16; var63++) {
                for (int var64 = var22 - 1; var64 >= var23; var64--) {
                    if ((var63 << 1) >= var64) {
                        arg1[var15] = arg6;
                    } else if (arg2) {
                        arg1[var15] = arg10;
                    }
                    var15++;
                }
                var15 += var18;
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class108.field1869 != null) {
            class102.field1705 = 0;
            class201.field3442 = arg0.getX();
            class1.field1 = arg0.getY();
            class127.field2256 = class121.method888((byte) -119);
            if (arg0.isMetaDown()) {
                class177.field3042 = 2;
                class115.field2035 = 2;
            } else {
                class177.field3042 = 1;
                class115.field2035 = 1;
            }
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field1126++;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lda;I)Lda;")
    public static final class275 method456(class275 arg0, int arg1) {
        if (arg1 != -6195) {
            method456((class275) null, 66);
        }
        field1119++;
        int var2 = class249.method1629(arg0, 0);
        return var2 == -1 ? class41.field702 : class215.field3655.field1061[var2].method1821(class124.field2213, -57, class118.field2093);
    }

    @OriginalMember(owner = "client!ib", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field1112++;
    }

    @OriginalMember(owner = "client!ib", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class108.field1869 != null) {
            class115.field2035 = 0;
        }
        field1124++;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method457(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1115++;
        if (arg1 != -4) {
            method459((byte) -85);
        }
        if (arg3 == arg4) {
            class148.method1052(arg6, arg2, arg3, arg0, arg5, 10183, arg7);
        } else if (class246.field4355 <= arg2 - arg3 && arg2 + arg3 <= class96.field1632 && class149.field2603 <= arg0 - arg4 && class141.field2493 >= (arg0 + arg4)) {
            class196.method1276(arg3, arg2, (byte) -93, arg4, arg0, arg5, arg7, arg6);
        } else {
            class197.method1290(arg6, arg4, arg3, arg2, arg0, arg5, -111, arg7);
        }
    }

    @OriginalMember(owner = "client!ib", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class108.field1869 != null) {
            class102.field1705 = 0;
            class115.field2035 = 0;
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field1118++;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZLrh;Z)V")
    public static final void method458(boolean arg0, class21 arg1, boolean arg2) {
        field1121++;
        if (arg2) {
            int var3 = class212.field3587;
            int var4 = var3 * 956 / 503;
            class218.field3701.method1205((class249.field4391 - var4) / 2, 0, var4, var3);
            class124.field2217.method62(class249.field4391 / 2 - (class124.field2217.field210 / 2), 18);
        }
        arg1.method116(class124.field2211, class249.field4391 / 2, class212.field3587 / 2 - 26, 16777215, -1);
        int var5 = class212.field3587 / 2 - 18;
        class47.method298(class249.field4391 / 2 - 152, var5, 304, 34, 9179409);
        if (arg0) {
            field1117 = null;
        }
        class47.method298(class249.field4391 / 2 - 151, var5 + 1, 302, 32, 0);
        class47.method299(class249.field4391 / 2 - 150, var5 + 2, class13.field197 * 3, 30, 9179409);
        class47.method299(class13.field197 * 3 + class249.field4391 / 2 - 150, var5 + 2, 300 - (class13.field197 * 3), 30, 0);
        arg1.method116(class189.field3269, class249.field4391 / 2, class212.field3587 / 2 + 4, 16777215, -1);
    }

    @OriginalMember(owner = "client!ib", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field1123++;
        if (class108.field1869 != null) {
            class102.field1705 = 0;
            class250.field4418 = arg0.getX();
            class89.field1502 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!ib", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field1122++;
        if (class108.field1869 != null) {
            class102.field1705 = 0;
            class250.field4418 = arg0.getX();
            class89.field1502 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!ib", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field1120++;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V")
    public static void method459(byte arg0) {
        field1127 = null;
        field1109 = null;
        field1117 = null;
        field1116 = null;
        field1114 = null;
        if (arg0 >= 26) {
            field1110 = null;
        }
    }
}
