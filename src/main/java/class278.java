import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class278 extends class544 implements class28 {

    @OriginalMember(owner = "client!b", name = "o", descriptor = "Ljava/awt/Canvas;")
    public Canvas field3658;

    @OriginalMember(owner = "client!b", name = "m", descriptor = "Z")
    private static boolean field3656 = false;

    @OriginalMember(owner = "client!b", name = "n", descriptor = "J")
    private static long field3657;

    @OriginalMember(owner = "client!b", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "()V")
    public final void method1573() {
        try {
            synchronized (this.field3658.getTreeLock()) {
                this.method1576();
                field3656 = false;
            }
        } catch (Exception var4) {
            this.method1577(var4);
        }
    }

    @OriginalMember(owner = "client!b", name = "xa", descriptor = "(Ljava/awt/Canvas;II)V")
    public final native void method1574(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!b", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method1575(Rectangle[] arg0, int arg1) {
        try {
            synchronized (this.field3658.getTreeLock()) {
                for (int var4 = 0; var4 < arg1; var4++) {
                    Rectangle var5 = arg0[var4];
                    if (var5.width > 0 && var5.height > 0) {
                        this.method1578(var5.x, var5.y, var5.width, var5.height);
                    }
                }
                field3656 = false;
            }
        } catch (Exception var8) {
            this.method1577(var8);
        }
    }

    @OriginalMember(owner = "client!b", name = "NA", descriptor = "(Z)V")
    public final native void method61(boolean arg0);

    @OriginalMember(owner = "client!b", name = "ga", descriptor = "()V")
    private final native void method1576();

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(La;Ljava/awt/Canvas;)V")
    public class278(class526 arg0, Canvas arg1) {
        this.field3658 = arg1;
        Dimension var3 = arg1.getSize();
        this.method1580(arg0, this.field3658, var3.width, var3.height);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Ljava/lang/Exception;)V")
    private final void method1577(Exception arg0) {
        if (!field3656) {
            field3657 = class190.method1030(false);
            field3656 = true;
        } else if (class190.method1030(false) - field3657 < 30000L) {
            this.field3658.repaint();
        } else {
            throw new RuntimeException(arg0.getMessage());
        }
    }

    @OriginalMember(owner = "client!b", name = "ea", descriptor = "(IIII)V")
    private final native void method1578(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!b", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class49.method261(0, this);
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "()V")
    public final void method1579() {
        this.method61(true);
        this.nativeid = 0L;
        this.field3658 = null;
    }

    @OriginalMember(owner = "client!b", name = "BA", descriptor = "(La;Ljava/awt/Canvas;II)V")
    private final native void method1580(class526 arg0, Canvas arg1, int arg2, int arg3);
}
