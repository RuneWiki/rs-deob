import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!za")
public class class287 extends class383 {

    @OriginalMember(owner = "client!za", name = "j", descriptor = "Ljava/awt/Canvas;")
    private Canvas field3669;

    @OriginalMember(owner = "client!za", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!za", name = "H", descriptor = "(Ljava/awt/Canvas;II)V")
    public final native void method1693(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!za", name = "r", descriptor = "(Lqa;Ljava/awt/Canvas;II)V")
    private final native void method1694(class164 arg0, Canvas arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "()V")
    public final void method1695() {
        this.method1696();
        this.nativeid = 0L;
        this.field3669 = null;
    }

    @OriginalMember(owner = "client!za", name = "ca", descriptor = "()V")
    private final native void method1696();

    @OriginalMember(owner = "client!za", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            this.method1696();
        }
    }

    @OriginalMember(owner = "client!za", name = "d", descriptor = "(IIII)V")
    public final native void method1697(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!za", name = "ka", descriptor = "()V")
    public final native void method1698();

    @OriginalMember(owner = "client!za", name = "<init>", descriptor = "(Lqa;Ljava/awt/Canvas;)V")
    public class287(class164 arg0, Canvas arg1) {
        this.field3669 = arg1;
        Dimension var3 = arg1.getSize();
        this.method1694(arg0, this.field3669, var3.width, var3.height);
    }
}
