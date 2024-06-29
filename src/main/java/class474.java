import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class474 extends class476 implements class194 {

    @OriginalMember(owner = "client!b", name = "k", descriptor = "Ljava/awt/Canvas;")
    public Canvas field6867;

    @OriginalMember(owner = "client!b", name = "i", descriptor = "Z")
    private static boolean field6865 = false;

    @OriginalMember(owner = "client!b", name = "j", descriptor = "J")
    private static long field6866;

    @OriginalMember(owner = "client!b", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!b", name = "finalize", descriptor = "()V", line = 7)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class260.method1547(-1, this);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Ljava/lang/Exception;)V", line = 14)
    private final void method2783(Exception arg0) {
        if (!field6865) {
            field6866 = class254.method1522((byte) -51);
            field6865 = true;
        } else if (class254.method1522((byte) -51) - field6866 < 30000L) {
            this.field6867.repaint();
        } else {
            throw new RuntimeException(arg0.getMessage());
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "()V", line = 37)
    public final void method2784() {
        try {
            synchronized (this.field6867.getTreeLock()) {
                this.method2781();
                field6865 = false;
            }
        } catch (Exception var4) {
            this.method2783(var4);
        }
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lw;Ljava/awt/Canvas;)V", line = 48)
    public class474(class69 arg0, Canvas arg1) {
        this.field6867 = arg1;
        Dimension var3 = arg1.getSize();
        this.method2780(arg0, this.field6867, var3.width, var3.height);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 55)
    public final void method2785(Rectangle[] arg0, int arg1) {
        try {
            synchronized (this.field6867.getTreeLock()) {
                for (int var4 = 0; var4 < arg1; var4++) {
                    Rectangle var5 = arg0[var4];
                    if (var5.width > 0 && var5.height > 0) {
                        this.method2782(var5.x, var5.y, var5.width, var5.height);
                    }
                }
                field6865 = false;
            }
        } catch (Exception var8) {
            this.method2783(var8);
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "()V", line = 79)
    public final void method2786() {
        this.method442();
        this.nativeid = 0L;
        this.field6867 = null;
    }

    @OriginalMember(owner = "client!b", name = "FA", descriptor = "(Lw;Ljava/awt/Canvas;II)V")
    private final native void method2780(class69 arg0, Canvas arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!b", name = "ya", descriptor = "()V")
    private final native void method2781();

    @OriginalMember(owner = "client!b", name = "TA", descriptor = "(IIII)V")
    private final native void method2782(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!b", name = "p", descriptor = "()V")
    public final native void method442();

    @OriginalMember(owner = "client!b", name = "U", descriptor = "(Ljava/awt/Canvas;II)V")
    public final native void method2787(Canvas arg0, int arg1, int arg2);
}
