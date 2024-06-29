import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class202 extends class5 implements class415 {

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "Ljava/awt/Canvas;")
    public Canvas field2711;

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "Z")
    private static boolean field2710 = false;

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "J")
    private static long field2712;

    @OriginalMember(owner = "client!ca", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "()V", line = 5)
    public final void method1365() {
        try {
            synchronized (this.field2711.getTreeLock()) {
                this.method1371();
                field2710 = false;
            }
        } catch (Exception var4) {
            this.method1370(var4);
        }
    }

    @OriginalMember(owner = "client!ca", name = "finalize", descriptor = "()V", line = 15)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class93.method626(this, 0);
        }
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "()V", line = 24)
    public final void method1368() {
        this.method304();
        this.nativeid = 0L;
        this.field2711 = null;
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Lc;Ljava/awt/Canvas;)V", line = 28)
    public class202(class124 arg0, Canvas arg1) {
        this.field2711 = arg1;
        Dimension var3 = arg1.getSize();
        this.method1372(arg0, this.field2711, var3.width, var3.height);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 35)
    public final void method1369(Rectangle[] arg0, int arg1) {
        try {
            synchronized (this.field2711.getTreeLock()) {
                for (int var4 = 0; var4 < arg1; var4++) {
                    Rectangle var5 = arg0[var4];
                    if (var5.width > 0 && var5.height > 0) {
                        this.method1367(var5.x, var5.y, var5.width, var5.height);
                    }
                }
                field2710 = false;
            }
        } catch (Exception var8) {
            this.method1370(var8);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Ljava/lang/Exception;)V", line = 60)
    private final void method1370(Exception arg0) {
        if (!field2710) {
            field2712 = class58.method427((byte) -19);
            field2710 = true;
        } else if (class58.method427((byte) -19) - field2712 < 30000L) {
            this.field2711.repaint();
        } else {
            throw new RuntimeException(arg0.getMessage());
        }
    }

    @OriginalMember(owner = "client!ca", name = "pa", descriptor = "()V")
    public final native void method304();

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public final native void method1366(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ca", name = "S", descriptor = "(IIII)V")
    private final native void method1367(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "()V")
    private final native void method1371();

    @OriginalMember(owner = "client!ca", name = "ya", descriptor = "(Lc;Ljava/awt/Canvas;II)V")
    private final native void method1372(class124 arg0, Canvas arg1, int arg2, int arg3);
}
