import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class59 extends class72 implements MouseWheelListener {

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
    private int field775 = 0;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)I", line = 4)
    public final synchronized int method331(int arg0) {
        if (arg0 == 32713) {
            int var2 = this.field775;
            this.field775 = 0;
            return var2;
        } else {
            return -102;
        }
    }

    @OriginalMember(owner = "client!fd", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 21)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field775 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 30)
    public final void method332(Component arg0, int arg1) {
        if (arg1 == 21014) {
            arg0.addMouseWheelListener(this);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Ljava/awt/Component;Z)V", line = 40)
    public final void method333(Component arg0, boolean arg1) {
        if (arg1) {
            this.method331(-79);
        }
        arg0.removeMouseWheelListener(this);
    }
}
