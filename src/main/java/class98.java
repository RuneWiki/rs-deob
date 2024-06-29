import java.awt.Component;
import java.awt.Cursor;
import java.awt.Point;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class98 {

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "Ljava/awt/Robot;")
    private Robot field1057 = new Robot();

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "Ljava/awt/Component;")
    private Component field1056;

    @OriginalMember(owner = "client!ln", name = "setcustomcursor", descriptor = "(Ljava/awt/Component;[IIILjava/awt/Point;)V")
    public final void setcustomcursor(Component arg0, int[] arg1, int arg2, int arg3, Point arg4) {
        if (arg1 == null) {
            arg0.setCursor(null);
        } else {
            BufferedImage var6 = new BufferedImage(arg2, arg3, 2);
            var6.setRGB(0, 0, arg2, arg3, arg1, 0, arg2);
            arg0.setCursor(arg0.getToolkit().createCustomCursor(var6, arg4, null));
        }
    }

    @OriginalMember(owner = "client!ln", name = "movemouse", descriptor = "(II)V")
    public final void movemouse(int arg0, int arg1) {
        this.field1057.mouseMove(arg0, arg1);
    }

    @OriginalMember(owner = "client!ln", name = "showcursor", descriptor = "(Ljava/awt/Component;Z)V")
    public final void showcursor(Component arg0, boolean arg1) {
        if (arg1) {
            arg0 = null;
        } else if (arg0 == null) {
            throw new NullPointerException();
        }
        if (this.field1056 == arg0) {
            return;
        }
        if (this.field1056 != null) {
            this.field1056.setCursor(null);
            this.field1056 = null;
        }
        if (arg0 != null) {
            arg0.setCursor(arg0.getToolkit().createCustomCursor(new BufferedImage(1, 1, 2), new Point(0, 0), null));
            this.field1056 = arg0;
        }
    }

    @OriginalMember(owner = "client!ln", name = "<init>", descriptor = "()V")
    public class98() throws Exception {
    }
}
