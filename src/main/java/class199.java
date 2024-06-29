import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class199 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    public static int field2985 = 0;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "I")
    public static int field2988 = 0;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "I")
    public static int field2984;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "I")
    public static int field2987;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "I")
    public static int field2991;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "I")
    public static int field2993;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "I")
    public static int field2994;

    @OriginalMember(owner = "client!je", name = "m", descriptor = "I")
    public static int field2995;

    @OriginalMember(owner = "client!je", name = "n", descriptor = "I")
    public static int field2996;

    @OriginalMember(owner = "client!je", name = "o", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!je", name = "p", descriptor = "I")
    public static int field2998;

    @OriginalMember(owner = "client!je", name = "q", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "Lwf;")
    public static class306 field2990;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IZ)I", line = 4)
    public static final int method1339(int arg0, boolean arg1) {
        if (arg1) {
            field2998++;
            return arg0 >>> 8;
        } else {
            return 22;
        }
    }

    @OriginalMember(owner = "client!je", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 15)
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class275.field4238 != null) {
            class208.field3306 = 0;
            class179.field2740 = arg0.getX();
            class190.field2896 = arg0.getY();
            class106.field1621 = class195.method1322(125);
            if (arg0.isMetaDown()) {
                class266.field4109 = 2;
                class109.field1677 = 2;
            } else {
                class266.field4109 = 1;
                class109.field1677 = 1;
            }
            int var2 = arg0.getModifiers();
            if ((var2 & 0x8) == 0) {
            }
            if ((var2 & 0x4) != 0) {
            }
            if ((var2 & 0x10) != 0) {
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field2999++;
    }

    @OriginalMember(owner = "client!je", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 70)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class275.field4238 != null) {
            class208.field3306 = 0;
            class109.field1677 = 0;
            int var2 = arg0.getModifiers();
            if ((var2 & 0x8) != 0) {
            }
            if ((var2 & 0x10) == 0) {
            }
            if ((var2 & 0x4) != 0) {
            }
        }
        field2993++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!je", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 105)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class275.field4238 != null) {
            class208.field3306 = 0;
            class94.field1444 = arg0.getX();
            class228.field3664 = arg0.getY();
        }
        field2983++;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 133)
    public static final void method1340(int arg0, Component arg1) {
        field2987++;
        arg1.removeMouseListener(class275.field4238);
        arg1.removeMouseMotionListener(class275.field4238);
        arg1.removeFocusListener(class275.field4238);
        class109.field1677 = arg0;
    }

    @OriginalMember(owner = "client!je", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 146)
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class275.field4238 != null) {
            class208.field3306 = 0;
            class94.field1444 = -1;
            class228.field3664 = -1;
        }
        field2996++;
    }

    @OriginalMember(owner = "client!je", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 162)
    public final void focusGained(FocusEvent arg0) {
        field2992++;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(III)Lpf;", line = 171)
    public static final class157 method1341(int arg0, int arg1, int arg2) {
        class174 var3 = class90.field1375[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2672;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lgn;I)Lt;", line = 180)
    public static final class83 method1342(class303 arg0, int arg1) {
        if (arg1 != 0) {
            method1345((byte) -114);
        }
        field2991++;
        return new class83(arg0.method2042(7), arg0.method2042(7), arg0.method2042(7), arg0.method2042(7), arg0.method2059(255), arg0.method2043((byte) -109));
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ZIIII)V", line = 195)
    public static final void method1343(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        class75 var5 = class204.method1371(4, 7, arg4);
        var5.method524((byte) 57);
        field2995++;
        var5.field1117 = arg3;
        var5.field1124 = arg2;
        if (arg0) {
            field2990 = (class306) null;
        }
        var5.field1122 = arg1;
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(III)Lpf;", line = 211)
    public static final class157 method1344(int arg0, int arg1, int arg2) {
        class174 var3 = class90.field1375[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class157 var4 = var3.field2672;
            var3.field2672 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V", line = 222)
    public static void method1345(byte arg0) {
        if (arg0 != 116) {
            method1345((byte) -101);
        }
        field2990 = null;
    }

    @OriginalMember(owner = "client!je", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 234)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class275.field4238 != null) {
            class109.field1677 = 0;
        }
        field2994++;
    }

    @OriginalMember(owner = "client!je", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 244)
    public final void mouseClicked(MouseEvent arg0) {
        field2986++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!je", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 261)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field2984++;
        if (class275.field4238 != null) {
            class208.field3306 = 0;
            class94.field1444 = arg0.getX();
            class228.field3664 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!je", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 278)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class275.field4238 != null) {
            class208.field3306 = 0;
            class94.field1444 = arg0.getX();
            class228.field3664 = arg0.getY();
        }
        field2997++;
    }
}
