import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class218 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "Ljava/lang/String;")
    public static String field3631 = "Opened title screen";

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "I")
    public static int field3635 = 0;

    @OriginalMember(owner = "client!fa", name = "n", descriptor = "Ljava/lang/String;")
    public static String field3638 = "flash2:";

    @OriginalMember(owner = "client!fa", name = "p", descriptor = "F")
    public static float field3640;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "I")
    public static int field3626;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
    public static int field3627;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "I")
    public static int field3630;

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "I")
    public static int field3633;

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "I")
    public static int field3634;

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!fa", name = "m", descriptor = "I")
    public static int field3637;

    @OriginalMember(owner = "client!fa", name = "o", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!fa", name = "q", descriptor = "I")
    public static int field3641;

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "Lqe;")
    public static class205 field3632;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V", line = 4)
    public static final void method1605(int arg0) {
        field3628++;
        if (class95.field1483 < 0) {
            class255.field4115 = -1;
            class95.field1483 = 0;
            class199.field3404 = -1;
        }
        if (class113.field1893 < class95.field1483) {
            class199.field3404 = -1;
            class95.field1483 = class113.field1893;
            class255.field4115 = -1;
        }
        if (arg0 > class318.field5042) {
            class199.field3404 = -1;
            class255.field4115 = -1;
            class318.field5042 = 0;
        }
        if (class318.field5042 > class304.field4825) {
            class318.field5042 = class304.field4825;
            class255.field4115 = -1;
            class199.field3404 = -1;
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)V", line = 41)
    public static void method1606(int arg0) {
        field3631 = null;
        if (arg0 != 0) {
            field3640 = -0.15944198F;
        }
        field3638 = null;
        field3632 = null;
    }

    @OriginalMember(owner = "client!fa", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 59)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class119.field2062 != null) {
            class50.field782 = 0;
            class293.field4683 = 0;
            int var2 = arg0.getModifiers();
            if ((var2 & 0x10) != 0) {
            }
            if ((var2 & 0x8) == 0) {
            }
            if ((var2 & 0x4) == 0) {
            }
        }
        field3637++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!fa", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 95)
    public final synchronized void focusLost(FocusEvent arg0) {
        field3626++;
        if (class119.field2062 != null) {
            class293.field4683 = 0;
        }
    }

    @OriginalMember(owner = "client!fa", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 108)
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class119.field2062 != null) {
            class50.field782 = 0;
            class310.field4915 = arg0.getX();
            class356.field5616 = arg0.getY();
            class162.field2871 = class306.method2102(-289);
            if (arg0.isMetaDown()) {
                class308.field4902 = 2;
                class293.field4683 = 2;
            } else {
                class308.field4902 = 1;
                class293.field4683 = 1;
            }
            int var2 = arg0.getModifiers();
            if ((var2 & 0x8) != 0) {
            }
            if ((var2 & 0x10) == 0) {
            }
            if ((var2 & 0x4) == 0) {
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field3627++;
    }

    @OriginalMember(owner = "client!fa", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 158)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class119.field2062 != null) {
            class50.field782 = 0;
            class13.field211 = arg0.getX();
            class303.field4809 = arg0.getY();
        }
        field3625++;
    }

    @OriginalMember(owner = "client!fa", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 181)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class119.field2062 != null) {
            class50.field782 = 0;
            class13.field211 = arg0.getX();
            class303.field4809 = arg0.getY();
        }
        field3634++;
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(I)V", line = 199)
    public static final void method1607(int arg0) {
        int[] var1 = new int[class8.field111];
        int var2 = 0;
        field3639++;
        if (arg0 <= 58) {
            field3638 = (String) null;
        }
        for (int var3 = 0; var3 < class8.field111; var3++) {
            class134 var4 = class5.method31(-1731690365, var3);
            if (var4.field2322 >= 0 || var4.field2309 >= 0) {
                var1[var2++] = var3;
            }
        }
        class123.field2137 = new int[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            class123.field2137[var5] = var1[var5];
        }
    }

    @OriginalMember(owner = "client!fa", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 239)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class119.field2062 != null) {
            class50.field782 = 0;
            class13.field211 = arg0.getX();
            class303.field4809 = arg0.getY();
        }
        field3636++;
    }

    @OriginalMember(owner = "client!fa", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 263)
    public final void mouseClicked(MouseEvent arg0) {
        field3633++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!fa", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 275)
    public final synchronized void mouseExited(MouseEvent arg0) {
        field3629++;
        if (class119.field2062 != null) {
            class50.field782 = 0;
            class13.field211 = -1;
            class303.field4809 = -1;
        }
    }

    @OriginalMember(owner = "client!fa", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 292)
    public final void focusGained(FocusEvent arg0) {
        field3630++;
    }
}
