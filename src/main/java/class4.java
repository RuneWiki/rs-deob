import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class4 extends class213 implements MouseWheelListener {

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
    private int field33 = 0;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZLjava/awt/Component;)V")
    public final void method14(boolean arg0, Component arg1) {
        arg1.removeMouseWheelListener(this);
        if (!arg0) {
            this.method15(null, 104);
        }
    }

    @OriginalMember(owner = "client!ce", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field33 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public final void method15(Component arg0, int arg1) {
        arg0.addMouseWheelListener(this);
        if (arg1 != 0) {
            this.mouseWheelMoved(null);
        }
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(B)I")
    public final synchronized int method16(byte arg0) {
        if (arg0 >= -92) {
            this.field33 = 108;
        }
        int var2 = this.field33;
        this.field33 = 0;
        return var2;
    }
}
