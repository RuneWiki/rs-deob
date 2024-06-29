import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class572 extends class108 implements class438 {

    @OriginalMember(owner = "client!b", name = "m", descriptor = "Ljava/awt/Canvas;")
    public Canvas field8154;

    @OriginalMember(owner = "client!b", name = "l", descriptor = "Z")
    private static boolean field8153 = false;

    @OriginalMember(owner = "client!b", name = "k", descriptor = "J")
    private static long field8152;

    @OriginalMember(owner = "client!b", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "()V", line = 4)
    public final void method3269() {
        try {
            synchronized (this.field8154.getTreeLock()) {
                this.method3274();
                field8153 = false;
            }
        } catch (Exception var4) {
            this.method3271(var4);
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "()V", line = 14)
    public final void method3270() {
        this.method810(true);
        this.nativeid = 0L;
        this.field8154 = null;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Ljava/lang/Exception;)V", line = 19)
    private final void method3271(Exception arg0) {
        if (!field8153) {
            field8152 = class508.method2860(false);
            field8153 = true;
        } else if (class508.method2860(false) - field8152 < 30000L) {
            this.field8154.repaint();
        } else {
            throw new RuntimeException(arg0.getMessage());
        }
    }

    @OriginalMember(owner = "client!b", name = "finalize", descriptor = "()V", line = 39)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class124.method989(-125, this);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 47)
    public final void method3273(Rectangle[] arg0, int arg1) {
        try {
            synchronized (this.field8154.getTreeLock()) {
                for (int var4 = 0; var4 < arg1; var4++) {
                    Rectangle var5 = arg0[var4];
                    if (var5.width > 0 && var5.height > 0) {
                        this.method3272(var5.x, var5.y, var5.width, var5.height);
                    }
                }
                field8153 = false;
            }
        } catch (Exception var8) {
            this.method3271(var8);
        }
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(La;Ljava/awt/Canvas;)V", line = 78)
    public class572(class326 arg0, Canvas arg1) {
        this.field8154 = arg1;
        Dimension var3 = arg1.getSize();
        this.method3275(arg0, this.field8154, var3.width, var3.height);
    }

    @OriginalMember(owner = "client!b", name = "xa", descriptor = "(Ljava/awt/Canvas;II)V")
    public final native void method3268(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!b", name = "ea", descriptor = "(IIII)V")
    private final native void method3272(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!b", name = "ga", descriptor = "()V")
    private final native void method3274();

    @OriginalMember(owner = "client!b", name = "BA", descriptor = "(La;Ljava/awt/Canvas;II)V")
    private final native void method3275(class326 arg0, Canvas arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!b", name = "NA", descriptor = "(Z)V")
    public final native void method810(boolean arg0);
}
