import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class13 extends class28 implements class89 {

    @OriginalMember(owner = "client!v", name = "l", descriptor = "Ljava/awt/Canvas;")
    public Canvas field119;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "Z")
    private static boolean field117 = false;

    @OriginalMember(owner = "client!v", name = "k", descriptor = "J")
    private static long field118;

    @OriginalMember(owner = "client!v", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!v", name = "D", descriptor = "(Ljava/awt/Canvas;II)V")
    public final native void method73(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!v", name = "QA", descriptor = "()V")
    private final native void method74();

    @OriginalMember(owner = "client!v", name = "a", descriptor = "()V")
    public final void method75() {
        this.method80(true);
        this.nativeid = 0L;
        this.field119 = null;
    }

    @OriginalMember(owner = "client!v", name = "KA", descriptor = "(IIII)V")
    private final native void method76(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Ljava/lang/Exception;)V")
    private final void method77(Exception arg0) {
        if (!field117) {
            field118 = class669.method3713(0);
            field117 = true;
        } else if (class669.method3713(0) - field118 < 30000L) {
            this.field119.repaint();
        } else {
            throw new RuntimeException(arg0.getMessage());
        }
    }

    @OriginalMember(owner = "client!v", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class146.method989((byte) 89, this);
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "()V")
    public final void method78() {
        try {
            synchronized (this.field119.getTreeLock()) {
                this.method74();
                field117 = false;
            }
        } catch (Exception var4) {
            this.method77(var4);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method79(Rectangle[] arg0, int arg1) {
        try {
            synchronized (this.field119.getTreeLock()) {
                for (int var4 = 0; var4 < arg1; var4++) {
                    Rectangle var5 = arg0[var4];
                    if (var5.width > 0 && var5.height > 0) {
                        this.method76(var5.x, var5.y, var5.width, var5.height);
                    }
                }
                field117 = false;
            }
        } catch (Exception var8) {
            this.method77(var8);
        }
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lda;Ljava/awt/Canvas;)V")
    public class13(class682 arg0, Canvas arg1) {
        this.field119 = arg1;
        Dimension var3 = arg1.getSize();
        this.method81(arg0, this.field119, var3.width, var3.height);
    }

    @OriginalMember(owner = "client!v", name = "H", descriptor = "(Z)V")
    public final native void method80(boolean arg0);

    @OriginalMember(owner = "client!v", name = "ya", descriptor = "(Lda;Ljava/awt/Canvas;II)V")
    private final native void method81(class682 arg0, Canvas arg1, int arg2, int arg3);
}
