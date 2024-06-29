import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class304 extends class508 {

    @OriginalMember(owner = "client!la", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!la", name = "finalize", descriptor = "()V", line = 3)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            this.method1824();
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "()V", line = 13)
    public final void method1823() {
        this.method1824();
        this.nativeid = 0L;
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lh;Ljava/awt/Canvas;)V", line = 17)
    public class304(class373 arg0, Canvas arg1) {
        Dimension var3 = arg1.getSize();
        this.method1819(arg0, arg1, var3.width, var3.height);
    }

    @OriginalMember(owner = "client!la", name = "ia", descriptor = "(Lh;Ljava/awt/Canvas;II)V")
    private final native void method1819(class373 arg0, Canvas arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!la", name = "xa", descriptor = "(IIII)V")
    public final native void method1820(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!la", name = "SA", descriptor = "()V")
    public final native void method1821();

    @OriginalMember(owner = "client!la", name = "ZA", descriptor = "(Ljava/awt/Canvas;II)V")
    public final native void method1822(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!la", name = "U", descriptor = "()V")
    private final native void method1824();
}
