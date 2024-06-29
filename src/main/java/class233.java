import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class233 extends class229 implements MouseWheelListener {

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "I")
    private int field3705 = 0;

    @OriginalMember(owner = "client!rg", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field3705 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public final void method1529(Component arg0, byte arg1) {
        arg0.addMouseWheelListener(this);
        if (arg1 > -2) {
            this.method1529((Component) null, (byte) -94);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)I")
    public final synchronized int method1527(int arg0) {
        int var2 = this.field3705;
        if (arg0 < 118) {
            return 86;
        } else {
            this.field3705 = 0;
            return var2;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public final void method1530(Component arg0, int arg1) {
        arg0.removeMouseWheelListener(this);
        if (arg1 != 6) {
            this.method1529((Component) null, (byte) -28);
        }
    }
}
