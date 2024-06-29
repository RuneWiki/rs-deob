import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class196 extends class425 implements class201 {

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "Ljava/awt/Canvas;")
    public Canvas field3071;

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "Z")
    private static boolean field3069 = false;

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "J")
    private static long field3070;

    @OriginalMember(owner = "client!ta", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ta", name = "AA", descriptor = "(Ljava/awt/Canvas;II)V")
    public final native void method1403(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ta", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class541.method3123(14336, this);
        }
    }

    @OriginalMember(owner = "client!ta", name = "H", descriptor = "()V")
    private final native void method1404();

    @OriginalMember(owner = "client!ta", name = "da", descriptor = "(Ll;Ljava/awt/Canvas;II)V")
    private final native void method1405(class18 arg0, Canvas arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Ll;Ljava/awt/Canvas;)V")
    public class196(class18 arg0, Canvas arg1) {
        this.field3071 = arg1;
        Dimension var3 = arg1.getSize();
        this.method1405(arg0, this.field3071, var3.width, var3.height);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/lang/Exception;)V")
    private final void method1406(Exception arg0) {
        if (!field3069) {
            field3070 = class525.method3074((byte) -101);
            field3069 = true;
        } else if (class525.method3074((byte) -101) - field3070 < 30000L) {
            this.field3071.repaint();
        } else {
            throw new RuntimeException(arg0.getMessage());
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "()V")
    public final void method1407() {
        try {
            synchronized (this.field3071.getTreeLock()) {
                this.method1404();
                field3069 = false;
            }
        } catch (Exception var4) {
            this.method1406(var4);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method1408(Rectangle[] arg0, int arg1) {
        try {
            synchronized (this.field3071.getTreeLock()) {
                for (int var4 = 0; var4 < arg1; var4++) {
                    Rectangle var5 = arg0[var4];
                    if (var5.width > 0 && var5.height > 0) {
                        this.method1409(var5.x, var5.y, var5.width, var5.height);
                    }
                }
                field3069 = false;
            }
        } catch (Exception var8) {
            this.method1406(var8);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIII)V")
    private final native void method1409(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "()V")
    public final void method1410() {
        this.method420(true);
        this.nativeid = 0L;
        this.field3071 = null;
    }

    @OriginalMember(owner = "client!ta", name = "UA", descriptor = "(Z)V")
    public final native void method420(boolean arg0);
}
