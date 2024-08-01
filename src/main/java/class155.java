import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("qg")
public class class155 extends class96 implements MouseWheelListener {

    @OriginalMember(owner = "qg", name = "j", descriptor = "I")
    private int field2930 = 0;

    @OriginalMember(owner = "qg", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public final void method688(byte arg0, Component arg1) {
        arg1.removeMouseWheelListener(this);
        if (arg0 < 114) {
            this.method687((byte) 45);
        }
    }

    @OriginalMember(owner = "qg", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2930 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "qg", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public final void method686(Component arg0, int arg1) {
        int var3 = -61 % ((arg1 + 85) / 36);
        arg0.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "qg", name = "b", descriptor = "(B)I")
    public final synchronized int method687(byte arg0) {
        if (arg0 < 26) {
            return 96;
        } else {
            int var2 = this.field2930;
            this.field2930 = 0;
            return var2;
        }
    }
}
