import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class37 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "[J")
    public static long[] field675 = new long[500];

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "I")
    public static int field682 = 0;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public static int field673;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    public static int field674;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "I")
    public static int field684;

    @OriginalMember(owner = "client!tc", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 4)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class66.field1117 != null) {
            class75.field1217 = 0;
            class66.field1120 = arg0.getX();
            class140.field2326 = arg0.getY();
        }
        field680++;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Z)V", line = 34)
    public static void method262(boolean arg0) {
        field675 = null;
        if (!arg0) {
            method263((byte) -2, 24);
        }
    }

    @OriginalMember(owner = "client!tc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 46)
    public final void focusGained(FocusEvent arg0) {
        field678++;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(BI)Z", line = 53)
    public static final boolean method263(byte arg0, int arg1) {
        field673++;
        int var2 = -31 / ((-arg0 - 8) / 42);
        return ((arg1 & 0x6061557D) >> 30) != 0;
    }

    @OriginalMember(owner = "client!tc", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 63)
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field674++;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)[F", line = 77)
    public static final float[] method264(int arg0, int arg1) {
        field683++;
        int var2 = -71 / ((arg0 + 60) / 63);
        float var3 = 0.58823526F;
        float var4 = class231.method1698() + class231.method1695();
        int var5 = class231.method1694();
        class36.field660[3] = 1.0F;
        float var6 = (float) (var5 & 0xFF) / 255.0F;
        float var7 = (float) ((var5 & 0xFF4019) >> 16) / 255.0F;
        class36.field660[0] = var3 * (float) class82.method582(arg1 >> 16, 255) / 255.0F * var7 * var4;
        float var8 = (float) (var5 >> 8 & 0xFF) / 255.0F;
        class36.field660[2] = var6 * ((float) class82.method582(255, arg1) / 255.0F) * var3 * var4;
        class36.field660[1] = var4 * var3 * var8 * ((float) class82.method582(255, arg1 >> 8) / 255.0F);
        return class36.field660;
    }

    @OriginalMember(owner = "client!tc", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 113)
    public final synchronized void mouseExited(MouseEvent arg0) {
        field676++;
        if (class66.field1117 != null) {
            class75.field1217 = 0;
            class66.field1120 = -1;
            class140.field2326 = -1;
        }
    }

    @OriginalMember(owner = "client!tc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 130)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class66.field1117 != null) {
            class35.field652 = 0;
        }
        field681++;
    }

    @OriginalMember(owner = "client!tc", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 141)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class66.field1117 != null) {
            class75.field1217 = 0;
            class66.field1120 = arg0.getX();
            class140.field2326 = arg0.getY();
        }
        field677++;
    }

    @OriginalMember(owner = "client!tc", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 171)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field672++;
        if (class66.field1117 != null) {
            class75.field1217 = 0;
            class66.field1120 = arg0.getX();
            class140.field2326 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!tc", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 187)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class66.field1117 != null) {
            class75.field1217 = 0;
            class35.field652 = 0;
            int var2 = arg0.getModifiers();
            if ((var2 & 0x4) == 0) {
            }
            if ((var2 & 0x10) != 0) {
            }
            if ((var2 & 0x8) != 0) {
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field684++;
    }

    @OriginalMember(owner = "client!tc", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 222)
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class66.field1117 != null) {
            class75.field1217 = 0;
            class217.field3580 = arg0.getX();
            class118.field1893 = arg0.getY();
            class321.field5488 = class67.method501(-110);
            if (arg0.isMetaDown()) {
                class3.field25 = 2;
                class35.field652 = 2;
            } else {
                class3.field25 = 1;
                class35.field652 = 1;
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
        field679++;
    }
}
