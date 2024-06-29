import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class312 extends class320 {

    @OriginalMember(owner = "client!la", name = "l", descriptor = "Ljava/awt/Canvas;")
    private Canvas field4733;

    @OriginalMember(owner = "client!la", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!la", name = "finalize", descriptor = "()V", line = 3)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            this.method2046();
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "()V", line = 11)
    public final void method2049() {
        this.method2046();
        this.nativeid = 0L;
        this.field4733 = null;
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lh;Ljava/awt/Canvas;)V", line = 19)
    public class312(class469 arg0, Canvas arg1) {
        this.field4733 = arg1;
        Dimension var3 = arg1.getSize();
        this.method2047(arg0, this.field4733, var3.width, var3.height);
    }

    @OriginalMember(owner = "client!la", name = "U", descriptor = "()V")
    private final native void method2046();

    @OriginalMember(owner = "client!la", name = "ia", descriptor = "(Lh;Ljava/awt/Canvas;II)V")
    private final native void method2047(class469 arg0, Canvas arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!la", name = "ZA", descriptor = "(Ljava/awt/Canvas;II)V")
    public final native void method2048(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!la", name = "xa", descriptor = "(IIII)V")
    public final native void method2050(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!la", name = "SA", descriptor = "()V")
    public final native void method2051();
}
