import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!za")
public class class288 extends class431 {

    @OriginalMember(owner = "client!za", name = "k", descriptor = "Ljava/awt/Canvas;")
    private Canvas field4352;

    @OriginalMember(owner = "client!za", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!za", name = "finalize", descriptor = "()V", line = 8)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            this.method1860();
        }
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "()V", line = 14)
    public final void method1862() {
        this.method1860();
        this.nativeid = 0L;
        this.field4352 = null;
    }

    @OriginalMember(owner = "client!za", name = "<init>", descriptor = "(Lqa;Ljava/awt/Canvas;)V", line = 19)
    public class288(class166 arg0, Canvas arg1) {
        this.field4352 = arg1;
        Dimension var3 = arg1.getSize();
        this.method1859(arg0, this.field4352, var3.width, var3.height);
    }

    @OriginalMember(owner = "client!za", name = "H", descriptor = "(Ljava/awt/Canvas;II)V")
    public final native void method1857(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!za", name = "ka", descriptor = "()V")
    public final native void method1858();

    @OriginalMember(owner = "client!za", name = "r", descriptor = "(Lqa;Ljava/awt/Canvas;II)V")
    private final native void method1859(class166 arg0, Canvas arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!za", name = "ca", descriptor = "()V")
    private final native void method1860();

    @OriginalMember(owner = "client!za", name = "d", descriptor = "(IIII)V")
    public final native void method1861(int arg0, int arg1, int arg2, int arg3);
}
