import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class199 extends class124 implements MouseWheelListener {

    @OriginalMember(owner = "client!j", name = "j", descriptor = "I")
    private int field3466 = 0;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public final void method955(Component arg0, int arg1) {
        arg0.removeMouseWheelListener(this);
        if (arg1 != 26871) {
            this.mouseWheelMoved((MouseWheelEvent) null);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public final void method959(Component arg0, byte arg1) {
        if (arg1 < 11) {
            this.method954((byte) -77);
        }
        arg0.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(B)I")
    public final synchronized int method954(byte arg0) {
        int var2 = this.field3466;
        this.field3466 = 0;
        if (arg0 != 80) {
            this.field3466 = 4;
        }
        return var2;
    }

    @OriginalMember(owner = "client!j", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field3466 += arg0.getWheelRotation();
    }
}
