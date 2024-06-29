import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class140 extends class197 implements MouseWheelListener {

    @OriginalMember(owner = "client!vh", name = "o", descriptor = "I")
    private int field2068 = 0;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)I", line = 9)
    public final synchronized int method902(byte arg0) {
        if (arg0 < 122) {
            return -3;
        } else {
            int var2 = this.field2068;
            this.field2068 = 0;
            return var2;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 21)
    public final void method903(int arg0, Component arg1) {
        arg1.addMouseWheelListener(this);
        if (arg0 <= 38) {
            this.mouseWheelMoved((MouseWheelEvent) null);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 31)
    public final void method904(Component arg0, int arg1) {
        if (arg1 != 23375) {
            this.field2068 = -120;
        }
        arg0.removeMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!vh", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 41)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2068 += arg0.getWheelRotation();
    }
}
