import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class183 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "I")
    public static int field3143 = 0;

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "Le;")
    public static class191 field3145 = class54.method368(" steht bereits auf Ihrer Freunde)2Liste(Q", 2047);

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "Le;")
    public static class191 field3144 = class54.method368("rect_debug=", 2047);

    @OriginalMember(owner = "client!qj", name = "r", descriptor = "Le;")
    public static class191 field3158 = class54.method368("<)4col>", 2047);

    @OriginalMember(owner = "client!qj", name = "n", descriptor = "Z")
    public static boolean field3154 = true;

    @OriginalMember(owner = "client!qj", name = "q", descriptor = "J")
    public static long field3157 = 0L;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "I")
    public static int field3141;

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "I")
    public static int field3146;

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "I")
    public static int field3149;

    @OriginalMember(owner = "client!qj", name = "j", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!qj", name = "l", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!qj", name = "m", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!qj", name = "o", descriptor = "I")
    public static int field3155;

    @OriginalMember(owner = "client!qj", name = "p", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!qj", name = "s", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!qj", name = "t", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!qj", name = "u", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "Lbd;")
    public static class24 field3147;

    @OriginalMember(owner = "client!qj", name = "k", descriptor = "Lmg;")
    public static class49 field3151;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIIIIIILbe;IZJ)Z")
    public static final boolean method1232(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class16 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class32.field453 == class12.field143;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var24 = arg2; var24 < arg2 + arg4; var24++) {
                if (var15 < 0 || var24 < 0 || var15 >= class217.field3821 || var24 >= class85.field1406) {
                    return false;
                }
                class199 var25 = class201.field3608[arg0][var15][var24];
                if (var25 != null && var25.field3550 >= 5) {
                    return false;
                }
            }
        }
        class12 var16 = new class12();
        var16.field136 = arg11;
        var16.field142 = arg0;
        var16.field154 = arg5;
        var16.field151 = arg6;
        var16.field147 = arg7;
        var16.field155 = arg8;
        var16.field153 = arg9;
        var16.field152 = arg1;
        var16.field144 = arg2;
        var16.field146 = arg1 + arg3 - 1;
        var16.field150 = arg2 + arg4 - 1;
        for (int var17 = arg1; var17 < arg1 + arg3; var17++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var17 > arg1) {
                    var21++;
                }
                if (var17 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class201.field3608[var22][var17][var20] == null) {
                        class201.field3608[var22][var17][var20] = new class199(var22, var17, var20);
                    }
                }
                class199 var23 = class201.field3608[arg0][var17][var20];
                var23.field3549[var23.field3550] = var16;
                var23.field3536[var23.field3550] = var21;
                var23.field3542 |= var21;
                var23.field3550++;
                if (var13 && class129.field2147[var17][var20] != 0) {
                    var14 = class129.field2147[var17][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var18 = arg1; var18 < arg1 + arg3; var18++) {
                for (int var19 = arg2; var19 < arg2 + arg4; var19++) {
                    if (class129.field2147[var18][var19] == 0) {
                        class129.field2147[var18][var19] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class33.field573[class179.field3068++] = var16;
        }
        return true;
    }

    @OriginalMember(owner = "client!qj", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field3142++;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1233(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3146++;
        if (arg7 < 128 || arg3 < 128 || arg7 > 13056 || arg3 > 13056) {
            class114.field1885 = -1;
            class5.field52 = -1;
            return;
        }
        int var8 = class222.method1546(class261.field4598, arg7, arg3, 247425607) - arg6;
        int var9 = arg3 - class244.field4353;
        int var10 = class15.field204[class170.field2876];
        int var11 = arg7 - class137.field2306;
        int var12 = var8 - class229.field4116;
        if (arg0 >= -83) {
            field3151 = null;
        }
        int var13 = class15.field206[class170.field2876];
        int var14 = class15.field204[class81.field1371];
        int var15 = class15.field206[class81.field1371];
        int var16 = var9 * var14 + var11 * var15 >> 16;
        int var17 = var9 * var15 - (var11 * var14) >> 16;
        int var19 = var12 * var13 - (var10 * var17) >> 16;
        int var20 = var10 * var12 + var13 * var17 >> 16;
        if (var20 < 50) {
            class114.field1885 = -1;
            class5.field52 = -1;
        } else {
            class114.field1885 = (var19 << 9) / var20 + arg2;
            class5.field52 = (var16 << 9) / var20 + arg1;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)V")
    public static final void method1234(int arg0, int arg1) {
        field3160++;
        if (arg1 == -1 && !class141.field2360) {
            class235.method1659(127);
        } else if (arg1 != -1 && (class11.field128 != arg1 || !class45.method310(-9488)) && class255.field4532 != 0 && !class141.field2360) {
            class134.method903(class102.field1653, false, arg1, 2, (byte) 60, 0, class255.field4532);
        }
        if (arg0 == 1) {
            class11.field128 = arg1;
        }
    }

    @OriginalMember(owner = "client!qj", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class17.field226 != null) {
            class185.field3232 = 0;
            class261.field4596 = arg0.getX();
            class99.field1586 = arg0.getY();
        }
        field3148++;
    }

    @OriginalMember(owner = "client!qj", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class17.field226 != null) {
            class185.field3232 = 0;
            class127.field2108 = 0;
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field3159++;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V")
    public static void method1235(int arg0) {
        field3151 = null;
        field3145 = null;
        field3158 = null;
        field3144 = null;
        if (arg0 != 0) {
            method1236(-104);
        }
        field3147 = null;
    }

    @OriginalMember(owner = "client!qj", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field3149++;
        if (class17.field226 != null) {
            class127.field2108 = 0;
        }
    }

    @OriginalMember(owner = "client!qj", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field3150++;
        if (class17.field226 != null) {
            class185.field3232 = 0;
            class261.field4596 = arg0.getX();
            class99.field1586 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!qj", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field3152++;
        if (class17.field226 != null) {
            class185.field3232 = 0;
            class245.field4358 = arg0.getX();
            class269.field4753 = arg0.getY();
            class25.field363 = class27.method198((byte) -122);
            if (arg0.isMetaDown()) {
                class168.field2829 = 2;
                class127.field2108 = 2;
            } else {
                class168.field2829 = 1;
                class127.field2108 = 1;
            }
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!qj", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class17.field226 != null) {
            class185.field3232 = 0;
            class261.field4596 = arg0.getX();
            class99.field1586 = arg0.getY();
        }
        field3156++;
    }

    @OriginalMember(owner = "client!qj", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field3155++;
        if (class17.field226 != null) {
            class185.field3232 = 0;
            class261.field4596 = -1;
            class99.field1586 = -1;
        }
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(I)V")
    public static final void method1236(int arg0) {
        if (class199.field3539 != null) {
            class199.field3539.method347(-121);
        }
        if (class93.field1527 != null) {
            class93.field1527.method347(arg0 ^ 0xFFFFF78C);
        }
        field3141++;
        class5.method16(class126.field2088, 2, 22050, 15899);
        class199.field3539 = class128.method870((byte) 48, class51.field909, 22050, class167.field2820, 0);
        class199.field3539.method340(true, class19.field266);
        class93.field1527 = class128.method870((byte) 50, class51.field909, arg0, class167.field2820, 1);
        class93.field1527.method340(true, class270.field4764);
    }

    @OriginalMember(owner = "client!qj", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        field3153++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }
}
