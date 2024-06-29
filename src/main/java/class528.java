import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class528 extends class270 implements class142 {

    @OriginalMember(owner = "client!v", name = "m", descriptor = "Ljava/awt/Canvas;")
    public Canvas field7534;

    @OriginalMember(owner = "client!v", name = "o", descriptor = "Z")
    private static boolean field7536 = false;

    @OriginalMember(owner = "client!v", name = "n", descriptor = "J")
    private static long field7535;

    @OriginalMember(owner = "client!v", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!v", name = "D", descriptor = "(Ljava/awt/Canvas;II)V")
    public final native void method3002(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!v", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class409.method2220(this, (byte) 83);
        }
    }

    @OriginalMember(owner = "client!v", name = "QA", descriptor = "()V")
    private final native void method3003();

    @OriginalMember(owner = "client!v", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method3004(Rectangle[] arg0, int arg1) {
        try {
            synchronized (this.field7534.getTreeLock()) {
                for (int var4 = 0; var4 < arg1; var4++) {
                    Rectangle var5 = arg0[var4];
                    if (var5.width > 0 && var5.height > 0) {
                        this.method3009(var5.x, var5.y, var5.width, var5.height);
                    }
                }
                field7536 = false;
            }
        } catch (Exception var8) {
            this.method3007(var8);
        }
    }

    @OriginalMember(owner = "client!v", name = "H", descriptor = "(Z)V")
    public final native void method59(boolean arg0);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "()V")
    public final void method3005() {
        this.method59(true);
        this.nativeid = 0L;
        this.field7534 = null;
    }

    @OriginalMember(owner = "client!v", name = "ya", descriptor = "(Lda;Ljava/awt/Canvas;II)V")
    private final native void method3006(class56 arg0, Canvas arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Ljava/lang/Exception;)V")
    private final void method3007(Exception arg0) {
        if (!field7536) {
            field7535 = class641.method3604(false);
            field7536 = true;
        } else if (class641.method3604(false) - field7535 < 30000L) {
            this.field7534.repaint();
        } else {
            throw new RuntimeException(arg0.getMessage());
        }
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lda;Ljava/awt/Canvas;)V")
    public class528(class56 arg0, Canvas arg1) {
        this.field7534 = arg1;
        Dimension var3 = arg1.getSize();
        this.method3006(arg0, this.field7534, var3.width, var3.height);
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "()V")
    public final void method3008() {
        try {
            synchronized (this.field7534.getTreeLock()) {
                this.method3003();
                field7536 = false;
            }
        } catch (Exception var4) {
            this.method3007(var4);
        }
    }

    @OriginalMember(owner = "client!v", name = "KA", descriptor = "(IIII)V")
    private final native void method3009(int arg0, int arg1, int arg2, int arg3);
}
