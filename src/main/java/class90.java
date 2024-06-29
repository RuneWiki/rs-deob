import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class90 extends class85 implements MouseWheelListener {

    @OriginalMember(owner = "client!n", name = "v", descriptor = "I")
    private int field1979 = 0;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public final void method593(byte arg0, Component arg1) {
        int var3 = 30 % ((54 - arg0) / 59);
        arg1.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public final void method598(int arg0, Component arg1) {
        arg1.removeMouseWheelListener(this);
        if (arg0 != -16597) {
            this.field1979 = -57;
        }
    }

    @OriginalMember(owner = "client!n", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1979 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)I")
    public final synchronized int method595(int arg0) {
        int var2 = 98 / ((4 - arg0) / 46);
        int var3 = this.field1979;
        this.field1979 = 0;
        return var3;
    }
}
