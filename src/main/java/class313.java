import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class313 extends class42 {

    @OriginalMember(owner = "client!la", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "()V")
    public final void method1811() {
        this.method1814();
        this.nativeid = 0L;
    }

    @OriginalMember(owner = "client!la", name = "ZA", descriptor = "(Ljava/awt/Canvas;II)V")
    public final native void method1812(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!la", name = "ia", descriptor = "(Lh;Ljava/awt/Canvas;II)V")
    private final native void method1813(class469 arg0, Canvas arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!la", name = "U", descriptor = "()V")
    private final native void method1814();

    @OriginalMember(owner = "client!la", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            this.method1814();
        }
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lh;Ljava/awt/Canvas;)V")
    public class313(class469 arg0, Canvas arg1) {
        Dimension var3 = arg1.getSize();
        this.method1813(arg0, arg1, var3.width, var3.height);
    }

    @OriginalMember(owner = "client!la", name = "SA", descriptor = "()V")
    public final native void method1815();

    @OriginalMember(owner = "client!la", name = "xa", descriptor = "(IIII)V")
    public final native void method1816(int arg0, int arg1, int arg2, int arg3);
}
