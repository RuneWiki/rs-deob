import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class229 extends class99 implements MouseWheelListener {

    @OriginalMember(owner = "client!eo", name = "l", descriptor = "I")
    private int field3834 = 0;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(B)I", line = 6)
    public final synchronized int method858(byte arg0) {
        int var2 = this.field3834;
        this.field3834 = 0;
        return arg0 < 39 ? -48 : var2;
    }

    @OriginalMember(owner = "client!eo", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 21)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field3834 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 29)
    public final void method855(Component arg0, byte arg1) {
        int var3 = 51 % ((-arg1 - 38) / 36);
        arg0.removeMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "(Ljava/awt/Component;B)V", line = 37)
    public final void method859(Component arg0, byte arg1) {
        arg0.addMouseWheelListener(this);
        if (arg1 != 58) {
            this.field3834 = 36;
        }
    }
}
