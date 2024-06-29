import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class137 extends class29 implements MouseWheelListener {

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "I")
    private int field2092 = 0;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)I", line = 4)
    public final synchronized int method185(int arg0) {
        if (arg0 != -13199) {
            this.field2092 = -4;
        }
        int var2 = this.field2092;
        this.field2092 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 17)
    public final void method187(Component arg0, int arg1) {
        if (arg1 != -3325) {
            this.method185(-30);
        }
        arg0.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 27)
    public final void method188(Component arg0, byte arg1) {
        arg0.removeMouseWheelListener(this);
        if (arg1 > -29) {
            this.field2092 = -120;
        }
    }

    @OriginalMember(owner = "client!bb", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 43)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2092 += arg0.getWheelRotation();
    }
}
