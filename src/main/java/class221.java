import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class221 extends class435 implements class350 {

    @OriginalMember(owner = "client!b", name = "l", descriptor = "Ljava/awt/Canvas;")
    public Canvas field2975;

    @OriginalMember(owner = "client!b", name = "n", descriptor = "Z")
    private static boolean field2977 = false;

    @OriginalMember(owner = "client!b", name = "m", descriptor = "J")
    private static long field2976;

    @OriginalMember(owner = "client!b", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "()V", line = 4)
    public final void method1389() {
        try {
            synchronized (this.field2975.getTreeLock()) {
                this.method1393();
                field2977 = false;
            }
        } catch (Exception var4) {
            this.method1392(var4);
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "()V", line = 14)
    public final void method1390() {
        this.method426();
        this.nativeid = 0L;
        this.field2975 = null;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Ljava/lang/Exception;)V", line = 20)
    private final void method1392(Exception arg0) {
        if (!field2977) {
            field2976 = class45.method252((byte) -8);
            field2977 = true;
        } else if (class45.method252((byte) -8) - field2976 < 30000L) {
            this.field2975.repaint();
        } else {
            throw new RuntimeException(arg0.getMessage());
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 41)
    public final void method1394(Rectangle[] arg0, int arg1) {
        try {
            synchronized (this.field2975.getTreeLock()) {
                for (int var4 = 0; var4 < arg1; var4++) {
                    Rectangle var5 = arg0[var4];
                    if (var5.width > 0 && var5.height > 0) {
                        this.method1391(var5.x, var5.y, var5.width, var5.height);
                    }
                }
                field2977 = false;
            }
        } catch (Exception var8) {
            this.method1392(var8);
        }
    }

    @OriginalMember(owner = "client!b", name = "finalize", descriptor = "()V", line = 68)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class269.method1636(this, true);
        }
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lw;Ljava/awt/Canvas;)V", line = 75)
    public class221(class197 arg0, Canvas arg1) {
        this.field2975 = arg1;
        Dimension var3 = arg1.getSize();
        this.method1395(arg0, this.field2975, var3.width, var3.height);
    }

    @OriginalMember(owner = "client!b", name = "U", descriptor = "(Ljava/awt/Canvas;II)V")
    public final native void method1388(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!b", name = "TA", descriptor = "(IIII)V")
    private final native void method1391(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!b", name = "ya", descriptor = "()V")
    private final native void method1393();

    @OriginalMember(owner = "client!b", name = "p", descriptor = "()V")
    public final native void method426();

    @OriginalMember(owner = "client!b", name = "FA", descriptor = "(Lw;Ljava/awt/Canvas;II)V")
    private final native void method1395(class197 arg0, Canvas arg1, int arg2, int arg3);
}
