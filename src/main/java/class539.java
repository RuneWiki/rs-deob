import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class539 extends class390 implements MouseListener, MouseMotionListener, MouseWheelListener {

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "Loe;")
    private class183 field7836 = new class183();

    @OriginalMember(owner = "client!pm", name = "g", descriptor = "Loe;")
    private class183 field7839 = new class183();

    @OriginalMember(owner = "client!pm", name = "l", descriptor = "Z")
    private boolean field7844;

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "I")
    private int field7835;

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "I")
    private int field7837;

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "I")
    private int field7838;

    @OriginalMember(owner = "client!pm", name = "h", descriptor = "I")
    private int field7840;

    @OriginalMember(owner = "client!pm", name = "i", descriptor = "I")
    private int field7841;

    @OriginalMember(owner = "client!pm", name = "j", descriptor = "I")
    private int field7842;

    @OriginalMember(owner = "client!pm", name = "k", descriptor = "Ljava/awt/Component;")
    private Component field7843;

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "(I)Z", line = 5)
    public final boolean method1344(int arg0) {
        if (arg0 < 33) {
            this.method1338(5);
        }
        return (this.field7835 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)I", line = 17)
    public final int method1349(int arg0) {
        int var2 = 5 / ((-arg0 - 53) / 55);
        return this.field7838;
    }

    @OriginalMember(owner = "client!pm", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 25)
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method3163(arg0.getX(), (byte) 47, arg0.getY());
    }

    @OriginalMember(owner = "client!pm", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 34)
    public final synchronized void mousePressed(MouseEvent arg0) {
        int var2 = this.method3165(false, arg0);
        if (var2 == 1) {
            this.method3166(arg0.getY(), arg0.getClickCount(), 0, -80, arg0.getX());
        } else if (var2 == 4) {
            this.method3166(arg0.getY(), arg0.getClickCount(), 2, -128, arg0.getX());
        } else if (var2 == 2) {
            this.method3166(arg0.getY(), arg0.getClickCount(), 1, -113, arg0.getX());
        }
        this.field7841 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!pm", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 57)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method3163(arg0.getX(), (byte) 47, arg0.getY());
    }

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "(I)I", line = 64)
    public final int method1338(int arg0) {
        if (arg0 != 1) {
            this.field7835 = 42;
        }
        return this.field7837;
    }

    @OriginalMember(owner = "client!pm", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 76)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method3163(arg0.getX(), (byte) 47, arg0.getY());
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(B)Z", line = 84)
    public final boolean method1347(byte arg0) {
        int var2 = 78 / ((4 - arg0) / 58);
        return (this.field7835 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "(B)V", line = 92)
    private final void method3162(byte arg0) {
        if (this.field7843 == null) {
            return;
        }
        this.field7843.removeMouseWheelListener(this);
        this.field7843.removeMouseMotionListener(this);
        this.field7843.removeMouseListener(this);
        this.field7836 = null;
        this.field7838 = this.field7837 = this.field7835 = 0;
        if (arg0 != 45) {
            this.mouseReleased(null);
        }
        this.field7839 = null;
        this.field7842 = this.field7840 = this.field7841 = 0;
        this.field7843 = null;
    }

    @OriginalMember(owner = "client!pm", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 115)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method3163(arg0.getX(), (byte) 47, arg0.getY());
    }

    @OriginalMember(owner = "client!pm", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 122)
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(I)V", line = 131)
    public final void method1339(int arg0) {
        if (arg0 == 1) {
            this.method3162((byte) 45);
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Z)V", line = 141)
    public final synchronized void method1340(boolean arg0) {
        this.field7837 = this.field7840;
        this.field7838 = this.field7842;
        this.field7835 = this.field7841;
        class183 var2 = this.field7836;
        this.field7836 = this.field7839;
        this.field7839 = var2;
        if (!arg0) {
            this.field7839.method1131((byte) -109);
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IBI)V", line = 164)
    private final void method3163(int arg0, byte arg1, int arg2) {
        if (arg1 != 47) {
            this.field7842 = 50;
        }
        this.field7840 = arg2;
        this.field7842 = arg0;
        if (this.field7844) {
            this.method3166(arg2, 0, -1, -92, arg0);
        }
    }

    @OriginalMember(owner = "client!pm", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 179)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        int var2 = this.method3165(false, arg0);
        if ((var2 & this.field7841) == 0) {
            var2 = this.field7841;
        }
        if ((var2 & 0x1) != 0) {
            this.method3166(arg0.getY(), arg0.getClickCount(), 3, -86, arg0.getX());
        }
        if ((var2 & 0x4) != 0) {
            this.method3166(arg0.getY(), arg0.getClickCount(), 5, -88, arg0.getX());
        }
        if ((var2 & 0x2) != 0) {
            this.method3166(arg0.getY(), arg0.getClickCount(), 4, -107, arg0.getX());
        }
        this.field7841 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "(I)Z", line = 203)
    public final boolean method1343(int arg0) {
        if (arg0 != 0) {
            this.field7842 = -87;
        }
        return (this.field7835 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 213)
    private final void method3164(Component arg0, byte arg1) {
        this.method3162((byte) 45);
        this.field7843 = arg0;
        if (arg1 >= 83) {
            this.field7843.addMouseListener(this);
            this.field7843.addMouseMotionListener(this);
            this.field7843.addMouseWheelListener(this);
        }
    }

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "(I)Lek;", line = 228)
    public final class471 method1350(int arg0) {
        int var2 = 35 / ((74 - arg0) / 46);
        return (class471) this.field7836.method1137(-1);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(ZLjava/awt/event/MouseEvent;)I", line = 237)
    private final int method3165(boolean arg0, MouseEvent arg1) {
        if (arg1.getButton() == 1) {
            return arg1.isMetaDown() ? 4 : 1;
        } else if (arg0) {
            return 43;
        } else if (arg1.getButton() == 2) {
            return 2;
        } else if (arg1.getButton() == 3) {
            return 4;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIII)V", line = 265)
    private final void method3166(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class291 var6 = new class291();
        var6.field3946 = arg0;
        var6.field3942 = arg4;
        if (arg3 <= -55) {
            var6.field3943 = arg2;
            var6.field3944 = class301.method1787((byte) 96);
            var6.field3945 = arg1;
            this.field7839.method1129(var6, 262144);
        }
    }

    @OriginalMember(owner = "client!pm", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 283)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        int var2 = arg0.getX();
        int var3 = arg0.getY();
        int var4 = arg0.getWheelRotation();
        this.method3166(var3, var4, 6, -113, var2);
        arg0.consume();
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 308)
    public class539(Component arg0, boolean arg1) {
        this.method3164(arg0, (byte) 86);
        this.field7844 = arg1;
    }
}
