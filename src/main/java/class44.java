import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class44 extends class116 implements MouseWheelListener {

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "I")
    private int field1019 = 0;

    @OriginalMember(owner = "client!gb", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1019 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZLjava/awt/Component;)V")
    public final void method322(boolean arg0, Component arg1) {
        if (arg0) {
            this.field1019 = -36;
        }
        arg1.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "(I)I")
    public final synchronized int method323(int arg0) {
        int var2 = this.field1019;
        this.field1019 = 0;
        int var3 = 68 % (arg0 / 38);
        return var2;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public final void method324(Component arg0, int arg1) {
        if (arg1 != 15) {
            this.method324(null, 106);
        }
        arg0.removeMouseWheelListener(this);
    }
}
