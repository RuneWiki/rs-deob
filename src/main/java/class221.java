import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class221 extends class261 implements class294 {

    @OriginalMember(owner = "client!b", name = "m", descriptor = "Ljava/awt/Canvas;")
    public Canvas field3467;

    @OriginalMember(owner = "client!b", name = "l", descriptor = "Z")
    private static boolean field3466 = false;

    @OriginalMember(owner = "client!b", name = "k", descriptor = "J")
    private static long field3465;

    @OriginalMember(owner = "client!b", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Ljava/lang/Exception;)V")
    private final void method1472(Exception arg0) {
        if (!field3466) {
            field3465 = class423.method2578(-19698);
            field3466 = true;
        } else if (class423.method2578(-19698) - field3465 < 30000L) {
            this.field3467.repaint();
        } else {
            throw new RuntimeException(arg0.getMessage());
        }
    }

    @OriginalMember(owner = "client!b", name = "FA", descriptor = "(Lw;Ljava/awt/Canvas;II)V")
    private final native void method1473(class197 arg0, Canvas arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!b", name = "p", descriptor = "()V")
    public final native void method615();

    @OriginalMember(owner = "client!b", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class157.method1134((byte) 90, this);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "()V")
    public final void method1474() {
        try {
            synchronized (this.field3467.getTreeLock()) {
                this.method1479();
                field3466 = false;
            }
        } catch (Exception var4) {
            this.method1472(var4);
        }
    }

    @OriginalMember(owner = "client!b", name = "U", descriptor = "(Ljava/awt/Canvas;II)V")
    public final native void method1475(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!b", name = "b", descriptor = "()V")
    public final void method1476() {
        this.method615();
        this.nativeid = 0L;
        this.field3467 = null;
    }

    @OriginalMember(owner = "client!b", name = "TA", descriptor = "(IIII)V")
    private final native void method1477(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!b", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method1478(Rectangle[] arg0, int arg1) {
        try {
            synchronized (this.field3467.getTreeLock()) {
                for (int var4 = 0; var4 < arg1; var4++) {
                    Rectangle var5 = arg0[var4];
                    if (var5.width > 0 && var5.height > 0) {
                        this.method1477(var5.x, var5.y, var5.width, var5.height);
                    }
                }
                field3466 = false;
            }
        } catch (Exception var8) {
            this.method1472(var8);
        }
    }

    @OriginalMember(owner = "client!b", name = "ya", descriptor = "()V")
    private final native void method1479();

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lw;Ljava/awt/Canvas;)V")
    public class221(class197 arg0, Canvas arg1) {
        this.field3467 = arg1;
        Dimension var3 = arg1.getSize();
        this.method1473(arg0, this.field3467, var3.width, var3.height);
    }
}
