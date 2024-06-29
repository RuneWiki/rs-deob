import java.awt.Component;
import java.awt.Cursor;
import java.awt.Point;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class438 {

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "Ljava/awt/Robot;")
    private Robot field5825 = new Robot();

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "Ljava/awt/Component;")
    private Component field5826;

    @OriginalMember(owner = "client!wk", name = "setcustomcursor", descriptor = "(Ljava/awt/Component;[IIILjava/awt/Point;)V", line = 6)
    public final void setcustomcursor(Component arg0, int[] arg1, int arg2, int arg3, Point arg4) {
        if (arg1 == null) {
            arg0.setCursor(null);
        } else {
            BufferedImage var6 = new BufferedImage(arg2, arg3, 2);
            var6.setRGB(0, 0, arg2, arg3, arg1, 0, arg2);
            arg0.setCursor(arg0.getToolkit().createCustomCursor(var6, arg4, null));
        }
    }

    @OriginalMember(owner = "client!wk", name = "movemouse", descriptor = "(II)V", line = 22)
    public final void movemouse(int arg0, int arg1) {
        this.field5825.mouseMove(arg0, arg1);
    }

    @OriginalMember(owner = "client!wk", name = "showcursor", descriptor = "(Ljava/awt/Component;Z)V", line = 29)
    public final void showcursor(Component arg0, boolean arg1) {
        if (arg1) {
            arg0 = null;
        } else if (arg0 == null) {
            throw new NullPointerException();
        }
        if (this.field5826 == arg0) {
            return;
        }
        if (this.field5826 != null) {
            this.field5826.setCursor(null);
            this.field5826 = null;
        }
        if (arg0 != null) {
            arg0.setCursor(arg0.getToolkit().createCustomCursor(new BufferedImage(1, 1, 2), new Point(0, 0), null));
            this.field5826 = arg0;
        }
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "()V", line = 61)
    public class438() throws Exception {
    }
}
