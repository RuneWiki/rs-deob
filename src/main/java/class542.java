import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class542 extends class504 implements class144 {

    @OriginalMember(owner = "client!v", name = "j", descriptor = "Ljava/awt/Canvas;")
    public Canvas field7134;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "Z")
    private static boolean field7133 = false;

    @OriginalMember(owner = "client!v", name = "k", descriptor = "J")
    private static long field7135;

    @OriginalMember(owner = "client!v", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!v", name = "D", descriptor = "(Ljava/awt/Canvas;II)V")
    public final native void method2991(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method2992(Rectangle[] arg0, int arg1) {
        try {
            synchronized (this.field7134.getTreeLock()) {
                for (int var4 = 0; var4 < arg1; var4++) {
                    Rectangle var5 = arg0[var4];
                    if (var5.width > 0 && var5.height > 0) {
                        this.method2995(var5.x, var5.y, var5.width, var5.height);
                    }
                }
                field7133 = false;
            }
        } catch (Exception var8) {
            this.method2997(var8);
        }
    }

    @OriginalMember(owner = "client!v", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class550.method3055((byte) -20, this);
        }
    }

    @OriginalMember(owner = "client!v", name = "H", descriptor = "(Z)V")
    public final native void method132(boolean arg0);

    @OriginalMember(owner = "client!v", name = "QA", descriptor = "()V")
    private final native void method2993();

    @OriginalMember(owner = "client!v", name = "ya", descriptor = "(Lda;Ljava/awt/Canvas;II)V")
    private final native void method2994(class57 arg0, Canvas arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!v", name = "KA", descriptor = "(IIII)V")
    private final native void method2995(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "()V")
    public final void method2996() {
        try {
            synchronized (this.field7134.getTreeLock()) {
                this.method2993();
                field7133 = false;
            }
        } catch (Exception var4) {
            this.method2997(var4);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Ljava/lang/Exception;)V")
    private final void method2997(Exception arg0) {
        if (!field7133) {
            field7135 = class681.method3802(-23600);
            field7133 = true;
        } else if (class681.method3802(-23600) - field7135 < 30000L) {
            this.field7134.repaint();
        } else {
            throw new RuntimeException(arg0.getMessage());
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "()V")
    public final void method2998() {
        this.method132(true);
        this.nativeid = 0L;
        this.field7134 = null;
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lda;Ljava/awt/Canvas;)V")
    public class542(class57 arg0, Canvas arg1) {
        this.field7134 = arg1;
        Dimension var3 = arg1.getSize();
        this.method2994(arg0, this.field7134, var3.width, var3.height);
    }
}
