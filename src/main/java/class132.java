import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class132 extends class276 implements class242 {

    @OriginalMember(owner = "client!b", name = "n", descriptor = "Ljava/awt/Canvas;")
    public Canvas field2249;

    @OriginalMember(owner = "client!b", name = "o", descriptor = "Z")
    private static boolean field2250 = false;

    @OriginalMember(owner = "client!b", name = "p", descriptor = "J")
    private static long field2251;

    @OriginalMember(owner = "client!b", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "()V")
    public final void method1001() {
        try {
            synchronized (this.field2249.getTreeLock()) {
                this.method1007();
                field2250 = false;
            }
        } catch (Exception var4) {
            this.method1006(var4);
        }
    }

    @OriginalMember(owner = "client!b", name = "p", descriptor = "()V")
    public final native void method224();

    @OriginalMember(owner = "client!b", name = "U", descriptor = "(Ljava/awt/Canvas;II)V")
    public final native void method1002(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!b", name = "FA", descriptor = "(Lw;Ljava/awt/Canvas;II)V")
    private final native void method1003(class454 arg0, Canvas arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!b", name = "TA", descriptor = "(IIII)V")
    private final native void method1004(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!b", name = "b", descriptor = "()V")
    public final void method1005() {
        this.method224();
        this.nativeid = 0L;
        this.field2249 = null;
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lw;Ljava/awt/Canvas;)V")
    public class132(class454 arg0, Canvas arg1) {
        this.field2249 = arg1;
        Dimension var3 = arg1.getSize();
        this.method1003(arg0, this.field2249, var3.width, var3.height);
    }

    @OriginalMember(owner = "client!b", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class248.method1686(false, this);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Ljava/lang/Exception;)V")
    private final void method1006(Exception arg0) {
        if (!field2250) {
            field2251 = class19.method91((byte) 109);
            field2250 = true;
        } else if (class19.method91((byte) 99) - field2251 < 30000L) {
            this.field2249.repaint();
        } else {
            throw new RuntimeException(arg0.getMessage());
        }
    }

    @OriginalMember(owner = "client!b", name = "ya", descriptor = "()V")
    private final native void method1007();

    @OriginalMember(owner = "client!b", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method1008(Rectangle[] arg0, int arg1) {
        try {
            synchronized (this.field2249.getTreeLock()) {
                for (int var4 = 0; var4 < arg1; var4++) {
                    Rectangle var5 = arg0[var4];
                    if (var5.width > 0 && var5.height > 0) {
                        this.method1004(var5.x, var5.y, var5.width, var5.height);
                    }
                }
                field2250 = false;
            }
        } catch (Exception var8) {
            this.method1006(var8);
        }
    }
}
