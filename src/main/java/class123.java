import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class123 extends class33 implements MouseWheelListener {

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "I")
    private int field2453 = 0;

    @OriginalMember(owner = "client!ne", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2453 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZLjava/awt/Component;)V")
    public final void method186(boolean arg0, Component arg1) {
        arg1.removeMouseWheelListener(this);
        if (!arg0) {
            this.method191(true);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Z)I")
    public final synchronized int method191(boolean arg0) {
        if (!arg0) {
            this.method190(null, 121);
        }
        int var2 = this.field2453;
        this.field2453 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public final void method190(Component arg0, int arg1) {
        if (arg1 != -9) {
            this.field2453 = 22;
        }
        arg0.addMouseWheelListener(this);
    }
}
