import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class103 extends class99 implements MouseWheelListener {

    @OriginalMember(owner = "client!pb", name = "r", descriptor = "I")
    private int field2585 = 0;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    public final void method839(Component arg0, boolean arg1) {
        if (!arg1) {
            this.field2585 = -126;
        }
        arg0.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public final void method845(Component arg0, int arg1) {
        arg0.removeMouseWheelListener(this);
        if (arg1 != 25384) {
            this.field2585 = -125;
        }
    }

    @OriginalMember(owner = "client!pb", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2585 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)I")
    public final synchronized int method838(int arg0) {
        int var2 = this.field2585;
        if (arg0 != -10813) {
            this.mouseWheelMoved(null);
        }
        this.field2585 = 0;
        return var2;
    }
}
