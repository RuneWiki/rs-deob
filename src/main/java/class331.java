import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class331 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!md", name = "c", descriptor = "[S")
    public static short[] field5162 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!md", name = "k", descriptor = "I")
    public static int field5170 = 0;

    @OriginalMember(owner = "client!md", name = "b", descriptor = "I")
    public static int field5161 = -1;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "I")
    public static int field5160;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "I")
    public static int field5163;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "I")
    public static int field5164;

    @OriginalMember(owner = "client!md", name = "f", descriptor = "I")
    public static int field5165;

    @OriginalMember(owner = "client!md", name = "h", descriptor = "I")
    public static int field5167;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "I")
    public static int field5168;

    @OriginalMember(owner = "client!md", name = "j", descriptor = "I")
    public static int field5169;

    @OriginalMember(owner = "client!md", name = "l", descriptor = "I")
    public static int field5171;

    @OriginalMember(owner = "client!md", name = "m", descriptor = "I")
    public static int field5172;

    @OriginalMember(owner = "client!md", name = "n", descriptor = "I")
    public static int field5173;

    @OriginalMember(owner = "client!md", name = "o", descriptor = "I")
    public static int field5174;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "[I")
    public static int[] field5166;

    @OriginalMember(owner = "client!md", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 5)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class63.field917 != null) {
            class184.field3061 = 0;
            class196.field3193 = arg0.getX();
            class177.field2954 = arg0.getY();
        }
        field5168++;
    }

    @OriginalMember(owner = "client!md", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 21)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class63.field917 != null) {
            class184.field3061 = 0;
            class320.field4967 = 0;
            int var2 = arg0.getModifiers();
            if ((var2 & 0x4) == 0) {
            }
            if ((var2 & 0x8) == 0) {
            }
            if ((var2 & 0x10) == 0) {
            }
        }
        field5164++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!md", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 66)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field5171++;
        if (class63.field917 != null) {
            class184.field3061 = 0;
            class196.field3193 = arg0.getX();
            class177.field2954 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!md", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 84)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class63.field917 != null) {
            class184.field3061 = 0;
            class196.field3193 = arg0.getX();
            class177.field2954 = arg0.getY();
        }
        field5169++;
    }

    @OriginalMember(owner = "client!md", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 101)
    public final void focusGained(FocusEvent arg0) {
        field5167++;
    }

    @OriginalMember(owner = "client!md", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 109)
    public final synchronized void focusLost(FocusEvent arg0) {
        field5172++;
        if (class63.field917 != null) {
            class320.field4967 = 0;
        }
    }

    @OriginalMember(owner = "client!md", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 123)
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class63.field917 != null) {
            class184.field3061 = 0;
            class196.field3193 = -1;
            class177.field2954 = -1;
        }
        field5173++;
    }

    @OriginalMember(owner = "client!md", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 149)
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field5174++;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIIIII)V", line = 168)
    public static final void method2320(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5160++;
        int var8 = arg3 + arg4;
        int var9 = arg6 - arg4;
        int var10 = arg7 - arg4;
        int var11 = arg5 + arg4;
        for (int var12 = arg3; var12 < var8; var12++) {
            class80.method545(arg1, -105, arg7, arg5, class281.field4523[var12]);
        }
        for (int var13 = arg6; var13 > var9; var13--) {
            class80.method545(arg1, arg2 ^ 0x2544, arg7, arg5, class281.field4523[var13]);
        }
        if (arg2 != -9509) {
            method2320(31, 106, 81, 102, -96, 75, 127, 92);
        }
        for (int var14 = var8; var14 <= var9; var14++) {
            int[] var15 = class281.field4523[var14];
            class80.method545(arg1, -86, var11, arg5, var15);
            class80.method545(arg0, -87, var10, var11, var15);
            class80.method545(arg1, -122, arg7, var10, var15);
        }
    }

    @OriginalMember(owner = "client!md", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 211)
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class63.field917 != null) {
            class184.field3061 = 0;
            class274.field4414 = arg0.getX();
            class217.field3517 = arg0.getY();
            class297.field4692 = class283.method2038((byte) 125);
            if (arg0.isMetaDown()) {
                class77.field1093 = 2;
                class320.field4967 = 2;
            } else {
                class77.field1093 = 1;
                class320.field4967 = 1;
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
        field5163++;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V", line = 264)
    public static void method2321(byte arg0) {
        field5162 = null;
        field5166 = null;
        if (arg0 != -45) {
            method2321((byte) -55);
        }
    }
}
