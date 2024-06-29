import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class542 extends class263 implements class145 {

    @OriginalMember(owner = "client!v", name = "i", descriptor = "Ljava/awt/Canvas;")
    public Canvas field6831;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "Z")
    private static boolean field6829 = false;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "J")
    private static long field6830;

    @OriginalMember(owner = "client!v", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!v", name = "finalize", descriptor = "()V", line = 3)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class368.method2146((byte) -99, this);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Ljava/lang/Exception;)V", line = 10)
    private final void method2908(Exception arg0) {
        if (!field6829) {
            field6830 = class321.method1854(-44);
            field6829 = true;
        } else if (class321.method1854(-72) - field6830 < 30000L) {
            this.field6831.repaint();
        } else {
            throw new RuntimeException(arg0.getMessage());
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 32)
    public final void method2910(Rectangle[] arg0, int arg1) {
        try {
            synchronized (this.field6831.getTreeLock()) {
                for (int var4 = 0; var4 < arg1; var4++) {
                    Rectangle var5 = arg0[var4];
                    if (var5.width > 0 && var5.height > 0) {
                        this.method2914(var5.x, var5.y, var5.width, var5.height);
                    }
                }
                field6829 = false;
            }
        } catch (Exception var8) {
            this.method2908(var8);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "()V", line = 61)
    public final void method2912() {
        this.method57(true);
        this.nativeid = 0L;
        this.field6831 = null;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "()V", line = 66)
    public final void method2913() {
        try {
            synchronized (this.field6831.getTreeLock()) {
                this.method2911();
                field6829 = false;
            }
        } catch (Exception var4) {
            this.method2908(var4);
        }
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lda;Ljava/awt/Canvas;)V", line = 78)
    public class542(class57 arg0, Canvas arg1) {
        this.field6831 = arg1;
        Dimension var3 = arg1.getSize();
        this.method2915(arg0, this.field6831, var3.width, var3.height);
    }

    @OriginalMember(owner = "client!v", name = "H", descriptor = "(Z)V")
    public final native void method57(boolean arg0);

    @OriginalMember(owner = "client!v", name = "D", descriptor = "(Ljava/awt/Canvas;II)V")
    public final native void method2909(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!v", name = "QA", descriptor = "()V")
    private final native void method2911();

    @OriginalMember(owner = "client!v", name = "KA", descriptor = "(IIII)V")
    private final native void method2914(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!v", name = "ya", descriptor = "(Lda;Ljava/awt/Canvas;II)V")
    private final native void method2915(class57 arg0, Canvas arg1, int arg2, int arg3);
}
