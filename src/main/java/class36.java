import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class36 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!aa", name = "n", descriptor = "F")
    public static float field535 = 0.0F;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
    public static int field524;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "I")
    public static int field526;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!aa", name = "l", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "client!aa", name = "o", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "client!aa", name = "p", descriptor = "I")
    public static int field537;

    @OriginalMember(owner = "client!aa", name = "q", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!aa", name = "r", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!aa", name = "m", descriptor = "Lvl;")
    public static class165 field534;

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "Lph;")
    public static class361 field530;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "[Lwg;")
    public static class267[] field528;

    @OriginalMember(owner = "client!aa", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 5)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class255.field3805 != null) {
            class290.field4388 = 0;
            class181.field2619 = 0;
            int var2 = arg0.getModifiers();
            if ((var2 & 0x4) == 0) {
            }
            if ((var2 & 0x10) == 0) {
            }
            if ((var2 & 0x8) == 0) {
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field523++;
    }

    @OriginalMember(owner = "client!aa", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 45)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field525++;
        if (class255.field3805 != null) {
            class290.field4388 = 0;
            class98.field1387 = arg0.getX();
            class259.field3867 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!aa", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 63)
    public final void focusGained(FocusEvent arg0) {
        field526++;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Z)I", line = 70)
    public static final int method264(boolean arg0) {
        if (!arg0) {
            field530 = (class361) null;
        }
        field527++;
        return class57.field845.method456(0);
    }

    @OriginalMember(owner = "client!aa", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 87)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field532++;
        if (class255.field3805 != null) {
            class290.field4388 = 0;
            class98.field1387 = arg0.getX();
            class259.field3867 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!aa", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 103)
    public final void mouseClicked(MouseEvent arg0) {
        field524++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V", line = 114)
    public static final void method265(byte arg0) {
        if (arg0 <= 37) {
            method267(false);
        }
        field529++;
        class315.field4680.method462(24);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILph;)V", line = 126)
    public static final void method266(int arg0, class361 arg1) {
        if (arg0 > -125) {
            field535 = 1.0328778F;
        }
        class110.field1611 = arg1;
        field522++;
    }

    @OriginalMember(owner = "client!aa", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 139)
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class255.field3805 != null) {
            class290.field4388 = 0;
            class98.field1387 = -1;
            class259.field3867 = -1;
        }
        field539++;
    }

    @OriginalMember(owner = "client!aa", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 155)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class255.field3805 != null) {
            class290.field4388 = 0;
            class98.field1387 = arg0.getX();
            class259.field3867 = arg0.getY();
        }
        field537++;
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(Z)V", line = 175)
    public static void method267(boolean arg0) {
        if (!arg0) {
            field534 = (class165) null;
        }
        field528 = null;
        field530 = null;
        field534 = null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 189)
    public static final int method268(String arg0, byte arg1) {
        int var2 = arg0.length();
        field533++;
        int var3 = 0;
        if (arg1 == 21) {
            for (int var4 = 0; var4 < var2; var4++) {
                var3 = (var3 << 5) - (var3 - arg0.charAt(var4));
            }
            return var3;
        } else {
            return -67;
        }
    }

    @OriginalMember(owner = "client!aa", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 214)
    public final synchronized void mousePressed(MouseEvent arg0) {
        field538++;
        if (class255.field3805 != null) {
            class290.field4388 = 0;
            class92.field1281 = arg0.getX();
            class68.field992 = arg0.getY();
            class310.field4629 = class176.method1234(5574);
            if (arg0.isMetaDown()) {
                class275.field4168 = 2;
                class181.field2619 = 2;
            } else {
                class275.field4168 = 1;
                class181.field2619 = 1;
            }
            int var2 = arg0.getModifiers();
            if ((var2 & 0x8) != 0) {
            }
            if ((var2 & 0x4) != 0) {
            }
            if ((var2 & 0x10) == 0) {
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!aa", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 262)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class255.field3805 != null) {
            class181.field2619 = 0;
        }
        field531++;
    }
}
