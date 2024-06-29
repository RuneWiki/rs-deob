import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class141 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "[S")
    public static short[] field2331 = new short[256];

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "I")
    public static int field2332 = 2;

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "Lab;")
    public static class279 field2333 = new class279(64);

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "I")
    public static int field2329;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "I")
    public static int field2334;

    @OriginalMember(owner = "client!ff", name = "l", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!ff", name = "m", descriptor = "I")
    public static int field2337;

    @OriginalMember(owner = "client!ff", name = "n", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!ff", name = "o", descriptor = "I")
    public static int field2339;

    @OriginalMember(owner = "client!ff", name = "q", descriptor = "I")
    public static int field2341;

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "[Ljb;")
    public static class323[] field2335;

    @OriginalMember(owner = "client!ff", name = "p", descriptor = "[[Lml;")
    public static class16[][] field2340;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)V", line = 4)
    public static void method915(byte arg0) {
        field2335 = null;
        field2331 = null;
        field2333 = null;
        if (arg0 >= -46) {
            field2335 = (class323[]) null;
        }
        field2340 = (class16[][]) null;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lbm;B)V", line = 20)
    public static final void method916(class307 arg0, byte arg1) {
        if (arg1 != 39) {
            field2331 = (short[]) null;
        }
        class118.field2054 = arg0.method2052("runes", true);
        field2325++;
    }

    @OriginalMember(owner = "client!ff", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 31)
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class95.field1710 != null) {
            class298.field4530 = 0;
            class90.field1667 = -1;
            class260.field4047 = -1;
        }
        field2336++;
    }

    @OriginalMember(owner = "client!ff", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 50)
    public final synchronized void mousePressed(MouseEvent arg0) {
        field2330++;
        if (class95.field1710 != null) {
            class298.field4530 = 0;
            class6.field138 = arg0.getX();
            class38.field740 = arg0.getY();
            class23.field460 = class338.method2339((byte) -120);
            if (arg0.isMetaDown()) {
                class156.field2531 = 2;
                class75.field1528 = 2;
            } else {
                class156.field2531 = 1;
                class75.field1528 = 1;
            }
            int var2 = arg0.getModifiers();
            if ((var2 & 0x10) != 0) {
            }
            if ((var2 & 0x8) != 0) {
            }
            if ((var2 & 0x4) != 0) {
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "([FI)[F", line = 99)
    public static final float[] method917(float[] arg0, int arg1) {
        field2341++;
        if (arg0 == null) {
            return null;
        }
        if (arg1 <= 13) {
            field2331 = (short[]) null;
        }
        float[] var2 = new float[arg0.length];
        class129.method852(arg0, 0, var2, 0, arg0.length);
        return var2;
    }

    @OriginalMember(owner = "client!ff", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 117)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class95.field1710 != null) {
            class75.field1528 = 0;
        }
        field2339++;
    }

    @OriginalMember(owner = "client!ff", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 128)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class95.field1710 != null) {
            class298.field4530 = 0;
            class90.field1667 = arg0.getX();
            class260.field4047 = arg0.getY();
        }
        field2334++;
    }

    @OriginalMember(owner = "client!ff", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 160)
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field2329++;
    }

    @OriginalMember(owner = "client!ff", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 170)
    public final void focusGained(FocusEvent arg0) {
        field2326++;
    }

    @OriginalMember(owner = "client!ff", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 180)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class95.field1710 != null) {
            class298.field4530 = 0;
            class75.field1528 = 0;
            int var2 = arg0.getModifiers();
            if ((var2 & 0x10) != 0) {
            }
            if ((var2 & 0x4) == 0) {
            }
            if ((var2 & 0x8) != 0) {
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field2328++;
    }

    @OriginalMember(owner = "client!ff", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 214)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field2338++;
        if (class95.field1710 != null) {
            class298.field4530 = 0;
            class90.field1667 = arg0.getX();
            class260.field4047 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!ff", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 232)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field2337++;
        if (class95.field1710 != null) {
            class298.field4530 = 0;
            class90.field1667 = arg0.getX();
            class260.field4047 = arg0.getY();
        }
    }
}
