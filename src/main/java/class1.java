import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class1 extends class16 implements MouseWheelListener {

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "I")
    private int field1 = 0;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public final void method1(int arg0, Component arg1) {
        arg1.addMouseWheelListener(this);
        if (arg0 != 1) {
            this.field1 = 115;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Z)I")
    public final synchronized int method2(boolean arg0) {
        int var2 = this.field1;
        this.field1 = 0;
        if (!arg0) {
            this.field1 = -18;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(ILjava/awt/Component;)V")
    public final void method3(int arg0, Component arg1) {
        int var3 = -107 % ((arg0 + 87) / 39);
        arg1.removeMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!wf", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1 += arg0.getWheelRotation();
    }
}
