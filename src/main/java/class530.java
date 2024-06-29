import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class530 extends class539 implements class141 {

    @OriginalMember(owner = "client!v", name = "m", descriptor = "Ljava/awt/Canvas;")
    public Canvas field7235;

    @OriginalMember(owner = "client!v", name = "o", descriptor = "Z")
    private static boolean field7237 = false;

    @OriginalMember(owner = "client!v", name = "n", descriptor = "J")
    private static long field7236;

    @OriginalMember(owner = "client!v", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "()V")
    public final void method2932() {
        this.method58(true);
        this.nativeid = 0L;
        this.field7235 = null;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "()V")
    public final void method2933() {
        try {
            synchronized (this.field7235.getTreeLock()) {
                this.method2936();
                field7237 = false;
            }
        } catch (Exception var4) {
            this.method2935(var4);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method2934(Rectangle[] arg0, int arg1) {
        try {
            synchronized (this.field7235.getTreeLock()) {
                for (int var4 = 0; var4 < arg1; var4++) {
                    Rectangle var5 = arg0[var4];
                    if (var5.width > 0 && var5.height > 0) {
                        this.method2937(var5.x, var5.y, var5.width, var5.height);
                    }
                }
                field7237 = false;
            }
        } catch (Exception var8) {
            this.method2935(var8);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Ljava/lang/Exception;)V")
    private final void method2935(Exception arg0) {
        if (!field7237) {
            field7236 = class680.method3756(-25);
            field7237 = true;
        } else if (class680.method3756(-18) - field7236 < 30000L) {
            this.field7235.repaint();
        } else {
            throw new RuntimeException(arg0.getMessage());
        }
    }

    @OriginalMember(owner = "client!v", name = "QA", descriptor = "()V")
    private final native void method2936();

    @OriginalMember(owner = "client!v", name = "KA", descriptor = "(IIII)V")
    private final native void method2937(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!v", name = "H", descriptor = "(Z)V")
    public final native void method58(boolean arg0);

    @OriginalMember(owner = "client!v", name = "D", descriptor = "(Ljava/awt/Canvas;II)V")
    public final native void method2938(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!v", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class373.method2177(this, (byte) -27);
        }
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lda;Ljava/awt/Canvas;)V")
    public class530(class55 arg0, Canvas arg1) {
        this.field7235 = arg1;
        Dimension var3 = arg1.getSize();
        this.method2939(arg0, this.field7235, var3.width, var3.height);
    }

    @OriginalMember(owner = "client!v", name = "ya", descriptor = "(Lda;Ljava/awt/Canvas;II)V")
    private final native void method2939(class55 arg0, Canvas arg1, int arg2, int arg3);
}
