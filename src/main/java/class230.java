import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class230 extends class7 implements MouseWheelListener {

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "I")
    private int field3865 = 0;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public final void method39(Component arg0, byte arg1) {
        if (arg1 > -37) {
            this.method38((byte) -123);
        }
        arg0.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)I")
    public final synchronized int method38(byte arg0) {
        if (arg0 < 32) {
            this.method46((Component) null, 35);
        }
        int var2 = this.field3865;
        this.field3865 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!wi", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field3865 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public final void method46(Component arg0, int arg1) {
        arg0.removeMouseWheelListener(this);
        if (arg1 > -87) {
            this.field3865 = 94;
        }
    }
}
