import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class246 extends class277 implements MouseWheelListener {

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
    private int field3930 = 0;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)I")
    public final synchronized int method1688(int arg0) {
        if (arg0 == -2) {
            int var2 = this.field3930;
            this.field3930 = 0;
            return var2;
        } else {
            return 31;
        }
    }

    @OriginalMember(owner = "client!pe", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field3930 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public final void method1689(int arg0, Component arg1) {
        arg1.addMouseWheelListener(this);
        if (arg0 <= 16) {
            this.field3930 = 65;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public final void method1690(Component arg0, byte arg1) {
        arg0.removeMouseWheelListener(this);
        int var3 = 123 / ((-arg1 - 47) / 61);
    }
}
