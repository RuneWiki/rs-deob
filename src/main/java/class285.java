import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!za")
public class class285 extends class223 {

    @OriginalMember(owner = "client!za", name = "l", descriptor = "Ljava/awt/Canvas;")
    private Canvas field4135;

    @OriginalMember(owner = "client!za", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!za", name = "d", descriptor = "(IIII)V")
    public final native void method1816(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!za", name = "a", descriptor = "()V")
    public final void method1817() {
        this.method1820();
        this.nativeid = 0L;
        this.field4135 = null;
    }

    @OriginalMember(owner = "client!za", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            this.method1820();
        }
    }

    @OriginalMember(owner = "client!za", name = "H", descriptor = "(Ljava/awt/Canvas;II)V")
    public final native void method1818(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!za", name = "ka", descriptor = "()V")
    public final native void method1819();

    @OriginalMember(owner = "client!za", name = "ca", descriptor = "()V")
    private final native void method1820();

    @OriginalMember(owner = "client!za", name = "r", descriptor = "(Lqa;Ljava/awt/Canvas;II)V")
    private final native void method1821(class163 arg0, Canvas arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!za", name = "<init>", descriptor = "(Lqa;Ljava/awt/Canvas;)V")
    public class285(class163 arg0, Canvas arg1) {
        this.field4135 = arg1;
        Dimension var3 = arg1.getSize();
        this.method1821(arg0, this.field4135, var3.width, var3.height);
    }
}
