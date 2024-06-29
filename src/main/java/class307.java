import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class307 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!nf", name = "l", descriptor = "Z")
    public static boolean field4500 = false;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
    public static int field4489 = 0;

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "B")
    public static byte field4495;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "I")
    public static int field4490;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "I")
    public static int field4491;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "I")
    public static int field4492;

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "I")
    public static int field4493;

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "I")
    public static int field4494;

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "I")
    public static int field4497;

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "I")
    public static int field4498;

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "I")
    public static int field4499;

    @OriginalMember(owner = "client!nf", name = "m", descriptor = "I")
    public static int field4501;

    @OriginalMember(owner = "client!nf", name = "n", descriptor = "I")
    public static int field4502;

    @OriginalMember(owner = "client!nf", name = "o", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!nf", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 5)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field4501++;
        if (class226.field3250 != null) {
            class193.field2671 = 0;
            class64.field799 = arg0.getX();
            class30.field355 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!nf", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 25)
    public final void focusGained(FocusEvent arg0) {
        field4493++;
    }

    @OriginalMember(owner = "client!nf", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 36)
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field4497++;
    }

    @OriginalMember(owner = "client!nf", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 47)
    public final synchronized void mouseExited(MouseEvent arg0) {
        field4494++;
        if (class226.field3250 != null) {
            class193.field2671 = 0;
            class64.field799 = -1;
            class30.field355 = -1;
        }
    }

    @OriginalMember(owner = "client!nf", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 67)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class226.field3250 != null) {
            class193.field2671 = 0;
            class290.field4192 = 0;
            int var2 = arg0.getModifiers();
            if ((var2 & 0x8) != 0) {
            }
            if ((var2 & 0x4) != 0) {
            }
            if ((var2 & 0x10) != 0) {
            }
        }
        field4498++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IZ)Lpa;", line = 107)
    public static final class94 method2145(int arg0, boolean arg1) {
        field4496++;
        class94 var2 = (class94) class271.field3888.method2265((long) arg0, (byte) -85);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class289.field4183.method1089(1, (byte) 124, arg0);
        class94 var4 = new class94();
        if (var3 != null) {
            var4.method681(new class299(var3), 0, arg0);
        }
        if (!arg1) {
            method2147(-25);
        }
        class271.field3888.method2257(-126, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIII)V", line = 131)
    public static final void method2146(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4492++;
        class223 var5 = (class223) class240.field3489.method2279((long) arg1, -128);
        if (var5 == null) {
            var5 = new class223();
            class240.field3489.method2275(var5, 121, (long) arg1);
        }
        if (var5.field3216.length <= arg2) {
            int[] var6 = new int[arg2 + 1];
            int[] var7 = new int[arg2 + 1];
            for (int var8 = 0; var8 < var5.field3216.length; var8++) {
                var6[var8] = var5.field3216[var8];
                var7[var8] = var5.field3217[var8];
            }
            for (int var9 = var5.field3216.length; var9 < arg2; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field3217 = var7;
            var5.field3216 = var6;
        }
        if (arg0 != 14378) {
            field4500 = true;
        }
        var5.field3216[arg2] = arg3;
        var5.field3217[arg2] = arg4;
    }

    @OriginalMember(owner = "client!nf", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 182)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field4491++;
        if (class226.field3250 != null) {
            class193.field2671 = 0;
            class64.field799 = arg0.getX();
            class30.field355 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!nf", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 199)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class226.field3250 != null) {
            class290.field4192 = 0;
        }
        field4490++;
    }

    @OriginalMember(owner = "client!nf", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 212)
    public final synchronized void mousePressed(MouseEvent arg0) {
        field4502++;
        if (class226.field3250 != null) {
            class193.field2671 = 0;
            class99.field1299 = arg0.getX();
            class149.field2093 = arg0.getY();
            class66.field844 = class6.method37(10828);
            if (arg0.isMetaDown()) {
                class248.field3607 = 2;
                class290.field4192 = 2;
            } else {
                class248.field3607 = 1;
                class290.field4192 = 1;
            }
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
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V", line = 277)
    public static final void method2147(int arg0) {
        field4499++;
        if (class318.field4685) {
            return;
        }
        if (arg0 < 20) {
            field4500 = true;
        }
        class318.field4685 = true;
        class311.field4573 = true;
        if (class48.field638) {
            class302.field4426 = (float) ((int) class302.field4426 - 17 & 0xFFFFFFF0);
        } else {
            class33.field408 += (-class33.field408 - 12.0F) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!nf", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 302)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class226.field3250 != null) {
            class193.field2671 = 0;
            class64.field799 = arg0.getX();
            class30.field355 = arg0.getY();
        }
        field4503++;
    }
}
