import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class196 extends class66 implements class201 {

    @OriginalMember(owner = "client!ta", name = "s", descriptor = "Ljava/awt/Canvas;")
    public Canvas field3229;

    @OriginalMember(owner = "client!ta", name = "r", descriptor = "Z")
    private static boolean field3228 = false;

    @OriginalMember(owner = "client!ta", name = "q", descriptor = "J")
    private static long field3227;

    @OriginalMember(owner = "client!ta", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIII)V")
    private final native void method1540(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ta", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class222.method1638(-1, this);
        }
    }

    @OriginalMember(owner = "client!ta", name = "UA", descriptor = "(Z)V")
    public final native void method312(boolean arg0);

    @OriginalMember(owner = "client!ta", name = "H", descriptor = "()V")
    private final native void method1541();

    @OriginalMember(owner = "client!ta", name = "da", descriptor = "(Ll;Ljava/awt/Canvas;II)V")
    private final native void method1542(class18 arg0, Canvas arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method1543(Rectangle[] arg0, int arg1) {
        try {
            synchronized (this.field3229.getTreeLock()) {
                for (int var4 = 0; var4 < arg1; var4++) {
                    Rectangle var5 = arg0[var4];
                    if (var5.width > 0 && var5.height > 0) {
                        this.method1540(var5.x, var5.y, var5.width, var5.height);
                    }
                }
                field3228 = false;
            }
        } catch (Exception var8) {
            this.method1546(var8);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "()V")
    public final void method1544() {
        this.method312(true);
        this.nativeid = 0L;
        this.field3229 = null;
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "()V")
    public final void method1545() {
        try {
            synchronized (this.field3229.getTreeLock()) {
                this.method1541();
                field3228 = false;
            }
        } catch (Exception var4) {
            this.method1546(var4);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/lang/Exception;)V")
    private final void method1546(Exception arg0) {
        if (!field3228) {
            field3227 = class112.method1033(-11752);
            field3228 = true;
        } else if (class112.method1033(-11752) - field3227 < 30000L) {
            this.field3229.repaint();
        } else {
            throw new RuntimeException(arg0.getMessage());
        }
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Ll;Ljava/awt/Canvas;)V")
    public class196(class18 arg0, Canvas arg1) {
        this.field3229 = arg1;
        Dimension var3 = arg1.getSize();
        this.method1542(arg0, this.field3229, var3.width, var3.height);
    }

    @OriginalMember(owner = "client!ta", name = "AA", descriptor = "(Ljava/awt/Canvas;II)V")
    public final native void method1547(Canvas arg0, int arg1, int arg2);
}
