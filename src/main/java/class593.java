import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class593 extends class381 implements class52 {

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "Ljava/awt/Canvas;")
    public Canvas field8604;

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "Z")
    private static boolean field8603 = false;

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "J")
    private static long field8602;

    @OriginalMember(owner = "client!ta", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 3)
    public final void method3372(Rectangle[] arg0, int arg1) {
        try {
            synchronized (this.field8604.getTreeLock()) {
                for (int var4 = 0; var4 < arg1; var4++) {
                    Rectangle var5 = arg0[var4];
                    if (var5.width > 0 && var5.height > 0) {
                        this.method3378(var5.x, var5.y, var5.width, var5.height);
                    }
                }
                field8603 = false;
            }
        } catch (Exception var8) {
            this.method3374(var8);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "()V", line = 27)
    public final void method3373() {
        try {
            synchronized (this.field8604.getTreeLock()) {
                this.method3377();
                field8603 = false;
            }
        } catch (Exception var4) {
            this.method3374(var4);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/lang/Exception;)V", line = 39)
    private final void method3374(Exception arg0) {
        if (!field8603) {
            field8602 = class60.method371(false);
            field8603 = true;
        } else if (class60.method371(false) - field8602 < 30000L) {
            this.field8604.repaint();
        } else {
            throw new RuntimeException(arg0.getMessage());
        }
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "()V", line = 59)
    public final void method3375() {
        this.method306(true);
        this.nativeid = 0L;
        this.field8604 = null;
    }

    @OriginalMember(owner = "client!ta", name = "finalize", descriptor = "()V", line = 70)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class493.method2818(false, this);
        }
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Ll;Ljava/awt/Canvas;)V", line = 78)
    public class593(class260 arg0, Canvas arg1) {
        this.field8604 = arg1;
        Dimension var3 = arg1.getSize();
        this.method3376(arg0, this.field8604, var3.width, var3.height);
    }

    @OriginalMember(owner = "client!ta", name = "UA", descriptor = "(Z)V")
    public final native void method306(boolean arg0);

    @OriginalMember(owner = "client!ta", name = "da", descriptor = "(Ll;Ljava/awt/Canvas;II)V")
    private final native void method3376(class260 arg0, Canvas arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ta", name = "H", descriptor = "()V")
    private final native void method3377();

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIII)V")
    private final native void method3378(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ta", name = "AA", descriptor = "(Ljava/awt/Canvas;II)V")
    public final native void method3379(Canvas arg0, int arg1, int arg2);
}
