import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!za")
public class class286 extends class260 {

    @OriginalMember(owner = "client!za", name = "k", descriptor = "Ljava/awt/Canvas;")
    private Canvas field3975;

    @OriginalMember(owner = "client!za", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!za", name = "finalize", descriptor = "()V", line = 7)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            this.method1702();
        }
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "()V", line = 13)
    public final void method1706() {
        this.method1702();
        this.nativeid = 0L;
        this.field3975 = null;
    }

    @OriginalMember(owner = "client!za", name = "<init>", descriptor = "(Lqa;Ljava/awt/Canvas;)V", line = 19)
    public class286(class163 arg0, Canvas arg1) {
        this.field3975 = arg1;
        Dimension var3 = arg1.getSize();
        this.method1707(arg0, this.field3975, var3.width, var3.height);
    }

    @OriginalMember(owner = "client!za", name = "ca", descriptor = "()V")
    private final native void method1702();

    @OriginalMember(owner = "client!za", name = "ka", descriptor = "()V")
    public final native void method1703();

    @OriginalMember(owner = "client!za", name = "H", descriptor = "(Ljava/awt/Canvas;II)V")
    public final native void method1704(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!za", name = "d", descriptor = "(IIII)V")
    public final native void method1705(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!za", name = "r", descriptor = "(Lqa;Ljava/awt/Canvas;II)V")
    private final native void method1707(class163 arg0, Canvas arg1, int arg2, int arg3);
}
