import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class204 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!td", name = "c", descriptor = "I")
    public static int field3120 = 0;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field3122 = new String[500];

    @OriginalMember(owner = "client!td", name = "k", descriptor = "I")
    public static int field3128 = 0;

    @OriginalMember(owner = "client!td", name = "q", descriptor = "[I")
    public static int[] field3134 = new int[5];

    @OriginalMember(owner = "client!td", name = "g", descriptor = "Lfa;")
    public static class98 field3124 = new class98(64);

    @OriginalMember(owner = "client!td", name = "s", descriptor = "Ltk;")
    public static class151 field3136 = new class151(5000);

    @OriginalMember(owner = "client!td", name = "a", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "I")
    public static int field3119;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!td", name = "h", descriptor = "I")
    public static int field3125;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!td", name = "j", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!td", name = "l", descriptor = "I")
    public static int field3129;

    @OriginalMember(owner = "client!td", name = "m", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!td", name = "n", descriptor = "I")
    public static int field3131;

    @OriginalMember(owner = "client!td", name = "o", descriptor = "I")
    public static int field3132;

    @OriginalMember(owner = "client!td", name = "p", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!td", name = "r", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!td", name = "t", descriptor = "I")
    public static int field3137;

    @OriginalMember(owner = "client!td", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 4)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field3131++;
        if (class209.field3195 != null) {
            class83.field1221 = 0;
            class183.field2889 = arg0.getX();
            class231.field3514 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!td", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 20)
    public final synchronized void mousePressed(MouseEvent arg0) {
        field3135++;
        if (class209.field3195 != null) {
            class83.field1221 = 0;
            class148.field2246 = arg0.getX();
            class269.field4189 = arg0.getY();
            class5.field73 = class105.method789((byte) 55);
            if (arg0.isMetaDown()) {
                class139.field2083 = 2;
                class161.field2489 = 2;
            } else {
                class139.field2083 = 1;
                class161.field2489 = 1;
            }
            int var2 = arg0.getModifiers();
            if ((var2 & 0x4) == 0) {
            }
            if ((var2 & 0x8) != 0) {
            }
            if ((var2 & 0x10) == 0) {
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!td", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 70)
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field3126++;
    }

    @OriginalMember(owner = "client!td", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 81)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field3127++;
        if (class209.field3195 != null) {
            class83.field1221 = 0;
            class161.field2489 = 0;
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

    @OriginalMember(owner = "client!td", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 116)
    public final void focusGained(FocusEvent arg0) {
        field3119++;
    }

    @OriginalMember(owner = "client!td", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 127)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field3125++;
        if (class209.field3195 != null) {
            class83.field1221 = 0;
            class183.field2889 = arg0.getX();
            class231.field3514 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!td", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 147)
    public final synchronized void focusLost(FocusEvent arg0) {
        field3121++;
        if (class209.field3195 != null) {
            class161.field2489 = 0;
        }
    }

    @OriginalMember(owner = "client!td", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 157)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field3118++;
        if (class209.field3195 != null) {
            class83.field1221 = 0;
            class183.field2889 = arg0.getX();
            class231.field3514 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIIIIIIIIII)V", line = 177)
    public static final void method1470(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        class65 var13 = new class65();
        var13.field940 = arg6;
        var13.field947 = arg0;
        var13.field943 = arg1;
        var13.field934 = arg7;
        var13.field931 = arg12;
        int var14 = 14 % ((-arg4) / 34);
        var13.field932 = arg5;
        var13.field936 = arg9;
        var13.field946 = arg2;
        var13.field949 = arg8;
        var13.field935 = arg10;
        var13.field945 = arg11;
        var13.field929 = arg3;
        class112.field1697.method1952(var13, -109);
        field3137++;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V", line = 200)
    public static void method1471(byte arg0) {
        field3136 = null;
        field3122 = null;
        field3124 = null;
        field3134 = null;
        if (arg0 > -94) {
            method1474((byte) 20, 49, -43, (class95) null);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lwm;B)Lwf;", line = 213)
    public static final class56 method1472(class254 arg0, byte arg1) {
        if (arg1 < 64) {
            field3122 = (String[]) null;
        }
        field3129++;
        return new class56(arg0.method1768(65536), arg0.method1768(65536), arg0.method1768(65536), arg0.method1768(65536), arg0.method1758((byte) 85), arg0.method1774((byte) -109));
    }

    @OriginalMember(owner = "client!td", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 225)
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class209.field3195 != null) {
            class83.field1221 = 0;
            class183.field2889 = -1;
            class231.field3514 = -1;
        }
        field3132++;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)V", line = 253)
    public static final void method1473(boolean arg0) {
        class189.field2972.method752(false);
        class240.field3655.method752(false);
        field3123++;
        if (!arg0) {
            field3124 = (class98) null;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(BIILjd;)Laf;", line = 266)
    public static final class195 method1474(byte arg0, int arg1, int arg2, class95 arg3) {
        field3130++;
        if (arg0 != -9) {
            method1473(true);
        }
        return class31.method233(arg2, 0, arg1, arg3) ? class118.method899(false) : null;
    }
}
