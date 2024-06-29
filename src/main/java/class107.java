import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class107 extends class29 implements MouseWheelListener {

    @OriginalMember(owner = "client!ji", name = "r", descriptor = "I")
    private int field1934 = 0;

    @OriginalMember(owner = "client!ji", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1934 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(ILjava/awt/Component;)V")
    public final void method177(int arg0, Component arg1) {
        arg1.removeMouseWheelListener(this);
        if (arg0 != -99999999) {
            this.method173(-92, null);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)I")
    public final synchronized int method176(byte arg0) {
        int var2 = this.field1934;
        if (arg0 != -59) {
            this.method177(-98, null);
        }
        this.field1934 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public final void method173(int arg0, Component arg1) {
        arg1.addMouseWheelListener(this);
        if (arg0 != 64) {
            this.field1934 = -84;
        }
    }
}
