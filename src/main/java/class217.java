import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class217 extends class140 implements MouseWheelListener {

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "I")
    private int field3650 = 0;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)I")
    public final synchronized int method893(int arg0) {
        int var2 = 42 % ((36 - arg0) / 56);
        int var3 = this.field3650;
        this.field3650 = 0;
        return var3;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public final void method891(int arg0, Component arg1) {
        if (arg0 != -23225) {
            this.method893(6);
        }
        arg1.removeMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public final void method890(byte arg0, Component arg1) {
        arg1.addMouseWheelListener(this);
        int var3 = 117 % ((41 - arg0) / 52);
    }

    @OriginalMember(owner = "client!wd", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field3650 += arg0.getWheelRotation();
    }
}
