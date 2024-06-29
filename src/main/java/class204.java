import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class204 extends class42 implements class416 {

    @OriginalMember(owner = "client!ca", name = "q", descriptor = "Ljava/awt/Canvas;")
    public Canvas field3137;

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "Z")
    private static boolean field3135 = false;

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "J")
    private static long field3136;

    @OriginalMember(owner = "client!ca", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Ljava/lang/Exception;)V", line = 4)
    private final void method1405(Exception arg0) {
        if (!field3135) {
            field3136 = class165.method1188((byte) 26);
            field3135 = true;
        } else if (class165.method1188((byte) 26) - field3136 < 30000L) {
            this.field3137.repaint();
        } else {
            throw new RuntimeException(arg0.getMessage());
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "()V", line = 25)
    public final void method1406() {
        this.method382();
        this.nativeid = 0L;
        this.field3137 = null;
    }

    @OriginalMember(owner = "client!ca", name = "finalize", descriptor = "()V", line = 35)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class493.method2895(this, false);
        }
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Lc;Ljava/awt/Canvas;)V", line = 43)
    public class204(class125 arg0, Canvas arg1) {
        this.field3137 = arg1;
        Dimension var3 = arg1.getSize();
        this.method1409(arg0, this.field3137, var3.width, var3.height);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 51)
    public final void method1411(Rectangle[] arg0, int arg1) {
        try {
            synchronized (this.field3137.getTreeLock()) {
                for (int var4 = 0; var4 < arg1; var4++) {
                    Rectangle var5 = arg0[var4];
                    if (var5.width > 0 && var5.height > 0) {
                        this.method1407(var5.x, var5.y, var5.width, var5.height);
                    }
                }
                field3135 = false;
            }
        } catch (Exception var8) {
            this.method1405(var8);
        }
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "()V", line = 75)
    public final void method1412() {
        try {
            synchronized (this.field3137.getTreeLock()) {
                this.method1410();
                field3135 = false;
            }
        } catch (Exception var4) {
            this.method1405(var4);
        }
    }

    @OriginalMember(owner = "client!ca", name = "S", descriptor = "(IIII)V")
    private final native void method1407(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public final native void method1408(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ca", name = "pa", descriptor = "()V")
    public final native void method382();

    @OriginalMember(owner = "client!ca", name = "ya", descriptor = "(Lc;Ljava/awt/Canvas;II)V")
    private final native void method1409(class125 arg0, Canvas arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "()V")
    private final native void method1410();
}
