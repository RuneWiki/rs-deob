import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class18 extends class190 implements MouseWheelListener {

    @OriginalMember(owner = "client!ak", name = "l", descriptor = "I")
    private int field257 = 0;

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(Ljava/awt/Component;I)V")
    public final void method93(Component arg0, int arg1) {
        if (arg1 == 65480) {
            arg0.addMouseWheelListener(this);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public final void method94(Component arg0, int arg1) {
        arg0.removeMouseWheelListener(this);
        if (arg1 != 28786) {
            this.field257 = -87;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)I")
    public final synchronized int method95(int arg0) {
        int var2 = this.field257;
        int var3 = -42 / ((-arg0 - 23) / 58);
        this.field257 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!ak", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field257 += arg0.getWheelRotation();
    }
}
