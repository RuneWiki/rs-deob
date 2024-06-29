import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class195 extends class401 implements class200 {

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "Ljava/awt/Canvas;")
    public Canvas field2747;

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "Z")
    private static boolean field2748 = false;

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "J")
    private static long field2749;

    @OriginalMember(owner = "client!ta", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ta", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class429.method2464(-31, this);
        }
    }

    @OriginalMember(owner = "client!ta", name = "AA", descriptor = "(Ljava/awt/Canvas;II)V")
    public final native void method1295(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method1296(Rectangle[] arg0, int arg1) {
        try {
            synchronized (this.field2747.getTreeLock()) {
                for (int var4 = 0; var4 < arg1; var4++) {
                    Rectangle var5 = arg0[var4];
                    if (var5.width > 0 && var5.height > 0) {
                        this.method1301(var5.x, var5.y, var5.width, var5.height);
                    }
                }
                field2748 = false;
            }
        } catch (Exception var8) {
            this.method1298(var8);
        }
    }

    @OriginalMember(owner = "client!ta", name = "da", descriptor = "(Ll;Ljava/awt/Canvas;II)V")
    private final native void method1297(class18 arg0, Canvas arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/lang/Exception;)V")
    private final void method1298(Exception arg0) {
        if (!field2748) {
            field2749 = class577.method3295((byte) 15);
            field2748 = true;
        } else if (class577.method3295((byte) 15) - field2749 < 30000L) {
            this.field2747.repaint();
        } else {
            throw new RuntimeException(arg0.getMessage());
        }
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Ll;Ljava/awt/Canvas;)V")
    public class195(class18 arg0, Canvas arg1) {
        this.field2747 = arg1;
        Dimension var3 = arg1.getSize();
        this.method1297(arg0, this.field2747, var3.width, var3.height);
    }

    @OriginalMember(owner = "client!ta", name = "H", descriptor = "()V")
    private final native void method1299();

    @OriginalMember(owner = "client!ta", name = "UA", descriptor = "(Z)V")
    public final native void method188(boolean arg0);

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "()V")
    public final void method1300() {
        try {
            synchronized (this.field2747.getTreeLock()) {
                this.method1299();
                field2748 = false;
            }
        } catch (Exception var4) {
            this.method1298(var4);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIII)V")
    private final native void method1301(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "()V")
    public final void method1302() {
        this.method188(true);
        this.nativeid = 0L;
        this.field2747 = null;
    }
}
