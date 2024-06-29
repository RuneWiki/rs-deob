import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class433 extends class60 implements MouseWheelListener {

    @OriginalMember(owner = "client!te", name = "e", descriptor = "I")
    private int field6302 = 0;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Z)I", line = 4)
    public final synchronized int method537(boolean arg0) {
        if (!arg0) {
            this.field6302 = 121;
        }
        int var2 = this.field6302;
        this.field6302 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!te", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 17)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field6302 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ZLjava/awt/Component;)V", line = 30)
    public final void method539(boolean arg0, Component arg1) {
        if (!arg0) {
            this.method537(false);
        }
        arg1.removeMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 40)
    public final void method541(byte arg0, Component arg1) {
        arg1.addMouseWheelListener(this);
        if (arg0 < 60) {
            this.method541((byte) 68, null);
        }
    }
}
