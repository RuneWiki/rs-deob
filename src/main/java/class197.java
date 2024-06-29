import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class197 extends class107 implements MouseWheelListener {

    @OriginalMember(owner = "client!w", name = "m", descriptor = "I")
    private int field3874 = 0;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(B)I")
    public final synchronized int method700(byte arg0) {
        int var2 = this.field3874;
        if (arg0 >= -15) {
            this.field3874 = 100;
        }
        this.field3874 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!w", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field3874 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ZLjava/awt/Component;)V")
    public final void method698(boolean arg0, Component arg1) {
        if (arg0) {
            arg1.addMouseWheelListener(this);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public final void method702(int arg0, Component arg1) {
        if (arg0 != 12035) {
            this.method702(88, null);
        }
        arg1.removeMouseWheelListener(this);
    }
}
