import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class29 extends class164 implements MouseWheelListener {

    @OriginalMember(owner = "client!fb", name = "u", descriptor = "I")
    private int field627 = 0;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public final void method190(Component arg0, byte arg1) {
        if (arg1 != -22) {
            this.method191((byte) 95);
        }
        arg0.removeMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)I")
    public final synchronized int method191(byte arg0) {
        if (arg0 != 83) {
            this.method192((Component) null, false);
        }
        int var2 = this.field627;
        this.field627 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!fb", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field627 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    public final void method192(Component arg0, boolean arg1) {
        if (arg1) {
            this.mouseWheelMoved((MouseWheelEvent) null);
        }
        arg0.addMouseWheelListener(this);
    }
}
