import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class780 extends class578 implements class65 {

    @OriginalMember(owner = "client!p", name = "l", descriptor = "Ljava/awt/Canvas;")
    public Canvas field11119;

    @OriginalMember(owner = "client!p", name = "k", descriptor = "I")
    public int field11116;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "I")
    public int field11115;

    @OriginalMember(owner = "client!p", name = "i", descriptor = "Z")
    private static boolean field11117 = false;

    @OriginalMember(owner = "client!p", name = "j", descriptor = "J")
    private static long field11118;

    @OriginalMember(owner = "client!p", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "()V", line = 10)
    public final void method5612() {
        this.method690(true);
        this.nativeid = 0L;
        this.field11119 = null;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II)V", line = 15)
    public final void method5613(int arg0, int arg1) {
        try {
            synchronized (this.field11119.getTreeLock()) {
                Dimension var4 = this.field11119.getSize();
                this.method5617(arg0, arg1, var4.width, var4.height);
                field11117 = false;
            }
        } catch (Exception var7) {
            this.method5614(var7);
        }
    }

    @OriginalMember(owner = "client!p", name = "finalize", descriptor = "()V", line = 27)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class579.method4297(this, -111);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/lang/Exception;)V", line = 32)
    private final void method5614(Exception arg0) {
        if (!field11117) {
            field11118 = class614.method4531(-62);
            field11117 = true;
        } else if (class614.method4531(-101) - field11118 < 30000L) {
            this.field11119.repaint();
        } else {
            throw new RuntimeException(arg0.getMessage());
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/awt/Canvas;II)V", line = 53)
    public final void method5616(Canvas arg0, int arg1, int arg2) {
        this.field11116 = arg1;
        this.field11115 = arg2;
        this.method5611(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V", line = 63)
    public final void method5618(Rectangle[] arg0, int arg1, int arg2, int arg3) {
        try {
            synchronized (this.field11119.getTreeLock()) {
                for (int var6 = 0; var6 < arg1; var6++) {
                    Rectangle var7 = arg0[var6];
                    if (var7.width > 0 && var7.height > 0) {
                        this.method5619(var7.x, var7.y, var7.width, var7.height, arg2, arg3);
                    }
                }
                field11117 = false;
            }
        } catch (Exception var10) {
            this.method5614(var10);
        }
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Loa;Ljava/awt/Canvas;II)V", line = 87)
    public class780(class473 arg0, Canvas arg1, int arg2, int arg3) {
        this.field11119 = arg1;
        this.field11116 = arg2;
        this.field11115 = arg3;
        this.method5615(arg0, this.field11119, arg2, arg3);
    }

    @OriginalMember(owner = "client!p", name = "w", descriptor = "(Z)V")
    public final native void method690(boolean arg0);

    @OriginalMember(owner = "client!p", name = "oa", descriptor = "(Ljava/awt/Canvas;II)V")
    private final native void method5611(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!p", name = "sa", descriptor = "(Loa;Ljava/awt/Canvas;II)V")
    private final native void method5615(class473 arg0, Canvas arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!p", name = "H", descriptor = "(IIII)V")
    private final native void method5617(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!p", name = "K", descriptor = "(IIIIII)V")
    private final native void method5619(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}
