import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class164 extends class77 implements MouseWheelListener {

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
    private int field2823 = 0;

    @OriginalMember(owner = "client!pc", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2823 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public final void method591(Component arg0, byte arg1) {
        int var3 = 38 % ((arg1 - 25) / 57);
        arg0.removeMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZLjava/awt/Component;)V")
    public final void method594(boolean arg0, Component arg1) {
        arg1.addMouseWheelListener(this);
        if (arg0) {
            this.field2823 = -79;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)I")
    public final synchronized int method589(int arg0) {
        int var2 = -61 / ((-arg0 - 37) / 59);
        int var3 = this.field2823;
        this.field2823 = 0;
        return var3;
    }
}
