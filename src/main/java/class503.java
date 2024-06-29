import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class503 extends class324 implements class137 {

    @OriginalMember(owner = "client!v", name = "k", descriptor = "Ljava/awt/Canvas;")
    public Canvas field7294;

    @OriginalMember(owner = "client!v", name = "l", descriptor = "Z")
    private static boolean field7295 = false;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "J")
    private static long field7293;

    @OriginalMember(owner = "client!v", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!v", name = "finalize", descriptor = "()V", line = 4)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class284.method1838(this, -119);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "()V", line = 11)
    public final void method2996() {
        this.method70(true);
        this.nativeid = 0L;
        this.field7294 = null;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "()V", line = 21)
    public final void method2999() {
        try {
            synchronized (this.field7294.getTreeLock()) {
                this.method2995();
                field7295 = false;
            }
        } catch (Exception var4) {
            this.method3000(var4);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Ljava/lang/Exception;)V", line = 31)
    private final void method3000(Exception arg0) {
        if (!field7295) {
            field7293 = class84.method550((byte) -117);
            field7295 = true;
        } else if (class84.method550((byte) -88) - field7293 < 30000L) {
            this.field7294.repaint();
        } else {
            throw new RuntimeException(arg0.getMessage());
        }
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lda;Ljava/awt/Canvas;)V", line = 51)
    public class503(class54 arg0, Canvas arg1) {
        this.field7294 = arg1;
        Dimension var3 = arg1.getSize();
        this.method2994(arg0, this.field7294, var3.width, var3.height);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 61)
    public final void method3001(Rectangle[] arg0, int arg1) {
        try {
            synchronized (this.field7294.getTreeLock()) {
                for (int var4 = 0; var4 < arg1; var4++) {
                    Rectangle var5 = arg0[var4];
                    if (var5.width > 0 && var5.height > 0) {
                        this.method2997(var5.x, var5.y, var5.width, var5.height);
                    }
                }
                field7295 = false;
            }
        } catch (Exception var8) {
            this.method3000(var8);
        }
    }

    @OriginalMember(owner = "client!v", name = "ya", descriptor = "(Lda;Ljava/awt/Canvas;II)V")
    private final native void method2994(class54 arg0, Canvas arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!v", name = "QA", descriptor = "()V")
    private final native void method2995();

    @OriginalMember(owner = "client!v", name = "KA", descriptor = "(IIII)V")
    private final native void method2997(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!v", name = "D", descriptor = "(Ljava/awt/Canvas;II)V")
    public final native void method2998(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!v", name = "H", descriptor = "(Z)V")
    public final native void method70(boolean arg0);
}
