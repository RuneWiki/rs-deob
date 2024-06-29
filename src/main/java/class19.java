import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class19 extends class38 implements MouseWheelListener {

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "I")
    private int field321 = 0;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)I")
    public final synchronized int method137(int arg0) {
        int var2 = this.field321;
        if (arg0 > -31) {
            this.field321 = 31;
        }
        this.field321 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!uf", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field321 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public final void method138(int arg0, Component arg1) {
        arg1.removeMouseWheelListener(this);
        if (arg0 != -26216) {
            this.field321 = -29;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public final void method139(byte arg0, Component arg1) {
        arg1.addMouseWheelListener(this);
        if (arg0 <= 26) {
            this.method137(-39);
        }
    }
}
