import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class98 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "Lid;")
    private static class149 field1733 = class60.method382(" from your friend list first)3", (byte) 95);

    @OriginalMember(owner = "client!uk", name = "j", descriptor = "Lid;")
    public static class149 field1742 = field1733;

    @OriginalMember(owner = "client!uk", name = "k", descriptor = "Lve;")
    public static class189 field1743 = new class189(50);

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "I")
    public static int field1738;

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!uk", name = "h", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!uk", name = "i", descriptor = "I")
    public static int field1741;

    @OriginalMember(owner = "client!uk", name = "l", descriptor = "I")
    public static int field1744;

    @OriginalMember(owner = "client!uk", name = "m", descriptor = "I")
    public static int field1745;

    @OriginalMember(owner = "client!uk", name = "n", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!uk", name = "o", descriptor = "I")
    public static int field1747;

    @OriginalMember(owner = "client!uk", name = "p", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "Lal;")
    public static class230 field1736;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V")
    public static void method710(int arg0) {
        field1743 = null;
        field1733 = null;
        field1742 = null;
        field1736 = null;
        if (arg0 >= -11) {
            field1742 = null;
        }
    }

    @OriginalMember(owner = "client!uk", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field1748++;
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)Lch;")
    public static final class282 method711(int arg0) {
        field1745++;
        class282 var1 = new class282(class251.field4406, class286.field5082, class147.field2651[0], class18.field259[0], class283.field5005[0], class55.field991[arg0], class73.field1276[0], class108.field1865);
        class103.method731(false);
        return var1;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(II)Lja;")
    public static final class59 method712(int arg0, int arg1) {
        field1738++;
        class59 var2 = (class59) class124.field2189.method1293((long) arg0, false);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class10.field142.method1562(-809612665, class36.method210(arg0, 127), class213.method1444(arg0, 23614));
        class59 var4 = new class59();
        var4.field1043 = arg0;
        if (var3 != null) {
            var4.method368(new class74(var3), (byte) -28);
        }
        var4.method373((byte) 46);
        int var5 = 25 / ((arg1 - 48) / 38);
        class124.field2189.method1295((long) arg0, var4, (byte) -71);
        return var4;
    }

    @OriginalMember(owner = "client!uk", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field1740++;
        if (class86.field1570 != null) {
            class183.field3314 = 0;
            class41.field640 = -1;
            class30.field447 = -1;
        }
    }

    @OriginalMember(owner = "client!uk", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field1741++;
    }

    @OriginalMember(owner = "client!uk", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class86.field1570 != null) {
            class264.field4734 = 0;
        }
        field1735++;
    }

    @OriginalMember(owner = "client!uk", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class86.field1570 != null) {
            class183.field3314 = 0;
            class41.field640 = arg0.getX();
            class30.field447 = arg0.getY();
        }
        field1737++;
    }

    @OriginalMember(owner = "client!uk", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class86.field1570 != null) {
            class183.field3314 = 0;
            class41.field640 = arg0.getX();
            class30.field447 = arg0.getY();
        }
        field1734++;
    }

    @OriginalMember(owner = "client!uk", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field1747++;
        if (class86.field1570 != null) {
            class183.field3314 = 0;
            class41.field640 = arg0.getX();
            class30.field447 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public static final void method713(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class188 var20 = new class188(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class261.field4664[var21][arg1][arg2] == null) {
                    class261.field4664[var21][arg1][arg2] = new class231(var21, arg1, arg2);
                }
            }
            class261.field4664[arg0][arg1][arg2].field4059 = var20;
        } else if (arg3 == 1) {
            class188 var22 = new class188(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class261.field4664[var23][arg1][arg2] == null) {
                    class261.field4664[var23][arg1][arg2] = new class231(var23, arg1, arg2);
                }
            }
            class261.field4664[arg0][arg1][arg2].field4059 = var22;
        } else {
            class53 var24 = new class53(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class261.field4664[var25][arg1][arg2] == null) {
                    class261.field4664[var25][arg1][arg2] = new class231(var25, arg1, arg2);
                }
            }
            class261.field4664[arg0][arg1][arg2].field4051 = var24;
        }
    }

    @OriginalMember(owner = "client!uk", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field1739++;
        if (class86.field1570 != null) {
            class183.field3314 = 0;
            class183.field3306 = arg0.getX();
            class92.field1634 = arg0.getY();
            class52.field944 = class81.method608(19644);
            if (arg0.isMetaDown()) {
                class131.field2382 = 2;
                class264.field4734 = 2;
            } else {
                class131.field2382 = 1;
                class264.field4734 = 1;
            }
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!uk", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field1744++;
        if (class86.field1570 != null) {
            class183.field3314 = 0;
            class264.field4734 = 0;
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }
}
