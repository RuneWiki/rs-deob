import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class17 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!be", name = "f", descriptor = "[Z")
    public static boolean[] field255 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!be", name = "j", descriptor = "Li;")
    public static class88 field259 = class208.method1425(105, "<col=00ffff>");

    @OriginalMember(owner = "client!be", name = "a", descriptor = "Li;")
    public static class88 field250 = class208.method1425(105, "Neuer Benutzer");

    @OriginalMember(owner = "client!be", name = "k", descriptor = "Li;")
    public static class88 field260 = class208.method1425(105, "mapscene");

    @OriginalMember(owner = "client!be", name = "p", descriptor = "I")
    public static int field265 = 0;

    @OriginalMember(owner = "client!be", name = "l", descriptor = "I")
    public static int field261 = 0;

    @OriginalMember(owner = "client!be", name = "w", descriptor = "Li;")
    private static class88 field272 = class208.method1425(105, "scroll:");

    @OriginalMember(owner = "client!be", name = "r", descriptor = "Li;")
    public static class88 field267 = field272;

    @OriginalMember(owner = "client!be", name = "v", descriptor = "Li;")
    public static class88 field271 = class208.method1425(105, "Sie haben gerade eine andere Welt verlassen)3");

    @OriginalMember(owner = "client!be", name = "n", descriptor = "Li;")
    public static class88 field263 = field272;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "Lid;")
    public static class92 field251 = new class92(64);

    @OriginalMember(owner = "client!be", name = "c", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!be", name = "g", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "client!be", name = "h", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!be", name = "i", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!be", name = "m", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!be", name = "o", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!be", name = "q", descriptor = "I")
    public static int field266;

    @OriginalMember(owner = "client!be", name = "t", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "client!be", name = "u", descriptor = "I")
    public static int field270;

    @OriginalMember(owner = "client!be", name = "x", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!be", name = "z", descriptor = "I")
    public static int field275;

    @OriginalMember(owner = "client!be", name = "A", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!be", name = "y", descriptor = "Lbj;")
    public static class22 field274;

    @OriginalMember(owner = "client!be", name = "B", descriptor = "Z")
    public static boolean field277;

    @OriginalMember(owner = "client!be", name = "s", descriptor = "[[I")
    public static int[][] field268;

    @OriginalMember(owner = "client!be", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class43.field732 != null) {
            class190.field3670 = 0;
            class46.field833 = arg0.getX();
            class139.field2577 = arg0.getY();
            class186.field3633 = class206.method1420(false);
            if (arg0.isMetaDown()) {
                class158.field3046 = 2;
                class46.field807 = 2;
            } else {
                class158.field3046 = 1;
                class46.field807 = 1;
            }
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field264++;
    }

    @OriginalMember(owner = "client!be", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field258++;
        if (class43.field732 != null) {
            class46.field807 = 0;
        }
    }

    @OriginalMember(owner = "client!be", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field253++;
        if (class43.field732 != null) {
            class190.field3670 = 0;
            class232.field4355 = arg0.getX();
            class170.field3299 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(B)V")
    public static void method80(byte arg0) {
        field255 = null;
        field251 = null;
        field271 = null;
        field263 = null;
        if (arg0 <= 34) {
            method83(46, -118, false, -62, -8, 64);
        }
        field260 = null;
        field250 = null;
        field259 = null;
        field274 = null;
        field267 = null;
        field268 = null;
        field272 = null;
    }

    @OriginalMember(owner = "client!be", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field252++;
        if (class43.field732 != null) {
            class190.field3670 = 0;
            class232.field4355 = arg0.getX();
            class170.field3299 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!be", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class43.field732 != null) {
            class190.field3670 = 0;
            class232.field4355 = arg0.getX();
            class170.field3299 = arg0.getY();
        }
        field276++;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(BI)I")
    public static final int method81(byte arg0, int arg1) {
        if (arg0 >= 0) {
            method84(21, -70, -47, true, 3, null);
        }
        field273++;
        return arg1 >> 17 & 0x7;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ILi;I)V")
    public static final void method82(int arg0, class88 arg1, int arg2) {
        field256++;
        class88 var3 = arg1.method611(false).method614((byte) 83);
        boolean var4 = false;
        int var5 = 0;
        if (arg0 != 1) {
            return;
        }
        while (var5 < class55.field1027) {
            class44 var6 = class244.field4493[class174.field3430[var5]];
            if (var6 != null && var6.field766 != null && var6.field766.method624(var3, (byte) -91)) {
                class207.method1423(3044, 1, 0, var6.field4143[0], var6.field4089[0], class240.field4458.field4089[0], 1, 0, 2, false, 0, class240.field4458.field4143[0]);
                var4 = true;
                if (arg2 == 1) {
                    class44.field770++;
                    class146.field2749.method30((byte) -31, 65);
                    class146.field2749.method314(class174.field3430[var5], (byte) 71);
                } else if (arg2 == 4) {
                    class28.field463++;
                    class146.field2749.method30((byte) -51, 214);
                    class146.field2749.method331(class174.field3430[var5], 18975);
                } else if (arg2 == 6) {
                    class146.field2749.method30((byte) -125, 161);
                    class146.field2749.method331(class174.field3430[var5], 18975);
                    class28.field462++;
                } else if (arg2 == 7) {
                    class209.field3975++;
                    class146.field2749.method30((byte) -69, 47);
                    class146.field2749.method344(class174.field3430[var5], (byte) -51);
                }
                break;
            }
            var5++;
        }
        if (!var4) {
            class223.method1501(class166.method1142(new class88[] { class114.field2065, var3 }, arg0 ^ 0xFFFFFFFC), arg0 + 11, 0, class174.field3455);
        }
    }

    @OriginalMember(owner = "client!be", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field275++;
    }

    @OriginalMember(owner = "client!be", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field266++;
        if (class43.field732 != null) {
            class190.field3670 = 0;
            class232.field4355 = -1;
            class170.field3299 = -1;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIZIII)V")
    public static final void method83(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        int var6 = arg4;
        if (arg2) {
            field251 = null;
        }
        while (arg1 + arg4 >= var6) {
            for (int var11 = arg5; var11 <= arg3 + arg5; var11++) {
                if (var11 >= 0 && var11 < 104 && var6 >= 0 && var6 < 104) {
                    class111.field2022[arg0][var11][var6] = 127;
                }
            }
            var6++;
        }
        field269++;
        for (int var7 = arg4; var7 < arg1 + arg4; var7++) {
            for (int var10 = arg5; var10 < arg3 + arg5; var10++) {
                if (var10 >= 0 && var10 < 104 && var7 >= 0 && var7 < 104) {
                    class62.field1137[arg0][var10][var7] = arg0 <= 0 ? 0 : class62.field1137[arg0 - 1][var10][var7];
                }
            }
        }
        if (arg5 > 0 && arg5 < 104) {
            for (int var8 = arg4 + 1; var8 < arg1 + arg4; var8++) {
                if (var8 >= 0 && var8 < 104) {
                    class62.field1137[arg0][arg5][var8] = class62.field1137[arg0][arg5 - 1][var8];
                }
            }
        }
        if (arg4 > 0 && arg4 < 104) {
            for (int var9 = arg5 + 1; var9 < arg3 + arg5; var9++) {
                if (var9 >= 0 && var9 < 104) {
                    class62.field1137[arg0][var9][arg4] = class62.field1137[arg0][var9][arg4 - 1];
                }
            }
        }
        if (arg5 < 0 || arg4 < 0 || arg5 >= 104 || arg4 >= 104) {
            return;
        }
        if (arg0 == 0) {
            if (arg5 > 0 && class62.field1137[arg0][arg5 - 1][arg4] != 0) {
                class62.field1137[arg0][arg5][arg4] = class62.field1137[arg0][arg5 - 1][arg4];
                return;
            }
            if (arg4 > 0 && class62.field1137[arg0][arg5][arg4 - 1] != 0) {
                class62.field1137[arg0][arg5][arg4] = class62.field1137[arg0][arg5][arg4 - 1];
                return;
            }
            if (arg5 > 0 && arg4 > 0 && class62.field1137[arg0][arg5 - 1][arg4 - 1] != 0) {
                class62.field1137[arg0][arg5][arg4] = class62.field1137[arg0][arg5 - 1][arg4 - 1];
                return;
            }
            return;
        }
        if (arg5 > 0 && class62.field1137[arg0][arg5 - 1][arg4] != class62.field1137[arg0 - 1][arg5 - 1][arg4]) {
            class62.field1137[arg0][arg5][arg4] = class62.field1137[arg0][arg5 - 1][arg4];
            return;
        }
        if (arg4 > 0 && class62.field1137[arg0 - 1][arg5][arg4 - 1] != class62.field1137[arg0][arg5][arg4 - 1]) {
            class62.field1137[arg0][arg5][arg4] = class62.field1137[arg0][arg5][arg4 - 1];
            return;
        }
        if (arg5 > 0 && arg4 > 0 && class62.field1137[arg0 - 1][arg5 - 1][arg4 - 1] != class62.field1137[arg0][arg5 - 1][arg4 - 1]) {
            class62.field1137[arg0][arg5][arg4] = class62.field1137[arg0][arg5 - 1][arg4 - 1];
            return;
        }
    }

    @OriginalMember(owner = "client!be", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field270++;
    }

    @OriginalMember(owner = "client!be", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field254++;
        if (class43.field732 != null) {
            class190.field3670 = 0;
            class46.field807 = 0;
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIZILnf;)V")
    public static final void method84(int arg0, int arg1, int arg2, boolean arg3, int arg4, class148 arg5) {
        class143 var6 = new class143();
        var6.field2640 = arg5.field2773 * 128;
        var6.field2637 = arg5.field2817;
        var6.field2649 = arg1;
        var6.field2631 = arg5.field2808;
        int var7 = arg5.field2776;
        var6.field2634 = arg4 * 128;
        var6.field2657 = arg0 * 128;
        field262++;
        var6.field2642 = arg5.field2797;
        var6.field2647 = arg5.field2809;
        int var8 = arg5.field2796;
        if (arg2 == 1 || arg2 == 3) {
            var8 = arg5.field2776;
            var7 = arg5.field2796;
        }
        var6.field2641 = (arg0 + var7) * 128;
        var6.field2632 = (arg4 + var8) * 128;
        if (arg5.field2772 != null) {
            var6.field2636 = arg5;
            var6.method940(-64);
        }
        if (arg3) {
            field267 = null;
        }
        class66.field1196.method1624(var6, 97);
        if (var6.field2637 != null) {
            var6.field2630 = var6.field2647 + (int) ((double) (var6.field2642 - var6.field2647) * Math.random());
        }
    }
}
