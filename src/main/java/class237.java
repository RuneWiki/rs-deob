import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class237 extends class180 implements MouseWheelListener {

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "I")
    private int field4218 = 0;

    @OriginalMember(owner = "client!ph", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field4218 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(Z)I")
    public final synchronized int method1211(boolean arg0) {
        if (!arg0) {
            this.field4218 = 41;
        }
        int var2 = this.field4218;
        this.field4218 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZLjava/awt/Component;)V")
    public final void method1208(boolean arg0, Component arg1) {
        arg1.removeMouseWheelListener(this);
        if (!arg0) {
            this.mouseWheelMoved((MouseWheelEvent) null);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public final void method1210(int arg0, Component arg1) {
        if (arg0 != 0) {
            this.method1208(false, (Component) null);
        }
        arg1.addMouseWheelListener(this);
    }
}
