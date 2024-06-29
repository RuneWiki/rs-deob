import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class167 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "I")
    public static int field2954 = 0;

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "[I")
    public static int[] field2957 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!ga", name = "o", descriptor = "Lke;")
    public static class256 field2964 = class316.method2202("Wordpack geladen)3", 27626);

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "Z")
    public static boolean field2951 = false;

    @OriginalMember(owner = "client!ga", name = "r", descriptor = "I")
    public static int field2967 = -1;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "Lke;")
    public static class256 field2953 = class316.method2202("Clientscript error in: ", 27626);

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
    public static int field2950;

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "I")
    public static int field2955;

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "I")
    public static int field2958;

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "I")
    public static int field2959;

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!ga", name = "l", descriptor = "I")
    public static int field2961;

    @OriginalMember(owner = "client!ga", name = "m", descriptor = "I")
    public static int field2962;

    @OriginalMember(owner = "client!ga", name = "p", descriptor = "I")
    public static int field2965;

    @OriginalMember(owner = "client!ga", name = "q", descriptor = "I")
    public static int field2966;

    @OriginalMember(owner = "client!ga", name = "s", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!ga", name = "n", descriptor = "Lng;")
    public static class138 field2963;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "[I")
    public static int[] field2952;

    @OriginalMember(owner = "client!ga", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 5)
    public final synchronized void mousePressed(MouseEvent arg0) {
        field2968++;
        if (class129.field2261 != null) {
            class31.field500 = 0;
            client.field2141 = arg0.getX();
            class155.field2767 = arg0.getY();
            class101.field1824 = class224.method1536(false);
            if (arg0.isMetaDown()) {
                class292.field5048 = 2;
                class15.field195 = 2;
            } else {
                class292.field5048 = 1;
                class15.field195 = 1;
            }
            int var2 = arg0.getModifiers();
            if ((var2 & 0x8) == 0) {
            }
            if ((var2 & 0x4) == 0) {
            }
            if ((var2 & 0x10) != 0) {
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ga", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 59)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class129.field2261 != null) {
            class31.field500 = 0;
            class15.field195 = 0;
            int var2 = arg0.getModifiers();
            if ((var2 & 0x10) == 0) {
            }
            if ((var2 & 0x8) != 0) {
            }
            if ((var2 & 0x4) == 0) {
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field2966++;
    }

    @OriginalMember(owner = "client!ga", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 100)
    public final void mouseClicked(MouseEvent arg0) {
        field2960++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ga", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 113)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field2955++;
        if (class129.field2261 != null) {
            class31.field500 = 0;
            class59.field1075 = arg0.getX();
            class86.field1544 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V", line = 131)
    public static void method1216(int arg0) {
        if (arg0 != 80) {
            field2964 = (class256) null;
        }
        field2953 = null;
        field2952 = null;
        field2964 = null;
        field2957 = null;
        field2963 = null;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIBI)V", line = 145)
    public static final void method1217(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg4 - arg2 >= class244.field4161 && class175.field3106 >= arg4 + arg2 && (arg0 - arg2) >= class105.field1887 && class274.field4748 >= arg0 + arg2) {
            class142.method1043(arg1, -46, arg4, arg0, arg2);
        } else {
            class261.method1834(arg4, arg2, true, arg1, arg0);
        }
        if (arg3 >= -11) {
            field2953 = (class256) null;
        }
        field2961++;
    }

    @OriginalMember(owner = "client!ga", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 164)
    public final void focusGained(FocusEvent arg0) {
        field2956++;
    }

    @OriginalMember(owner = "client!ga", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 172)
    public final synchronized void mouseExited(MouseEvent arg0) {
        field2959++;
        if (class129.field2261 != null) {
            class31.field500 = 0;
            class59.field1075 = -1;
            class86.field1544 = -1;
        }
    }

    @OriginalMember(owner = "client!ga", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 189)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field2965++;
        if (class129.field2261 != null) {
            class31.field500 = 0;
            class59.field1075 = arg0.getX();
            class86.field1544 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!ga", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 217)
    public final synchronized void focusLost(FocusEvent arg0) {
        field2962++;
        if (class129.field2261 != null) {
            class15.field195 = 0;
        }
    }

    @OriginalMember(owner = "client!ga", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 243)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field2950++;
        if (class129.field2261 != null) {
            class31.field500 = 0;
            class59.field1075 = arg0.getX();
            class86.field1544 = arg0.getY();
        }
    }
}
