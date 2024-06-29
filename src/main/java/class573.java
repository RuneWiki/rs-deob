import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class573 extends class496 implements class439 {

    @OriginalMember(owner = "client!b", name = "i", descriptor = "Ljava/awt/Canvas;")
    public Canvas field8455;

    @OriginalMember(owner = "client!b", name = "j", descriptor = "Z")
    private static boolean field8456 = false;

    @OriginalMember(owner = "client!b", name = "k", descriptor = "J")
    private static long field8457;

    @OriginalMember(owner = "client!b", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "()V", line = 3)
    public final void method3348() {
        try {
            synchronized (this.field8455.getTreeLock()) {
                this.method3351();
                field8456 = false;
            }
        } catch (Exception var4) {
            this.method3349(var4);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Ljava/lang/Exception;)V", line = 15)
    private final void method3349(Exception arg0) {
        if (!field8456) {
            field8457 = class450.method2719((byte) -19);
            field8456 = true;
        } else if (class450.method2719((byte) -25) - field8457 < 30000L) {
            this.field8455.repaint();
        } else {
            throw new RuntimeException(arg0.getMessage());
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 37)
    public final void method3352(Rectangle[] arg0, int arg1) {
        try {
            synchronized (this.field8455.getTreeLock()) {
                for (int var4 = 0; var4 < arg1; var4++) {
                    Rectangle var5 = arg0[var4];
                    if (var5.width > 0 && var5.height > 0) {
                        this.method3354(var5.x, var5.y, var5.width, var5.height);
                    }
                }
                field8456 = false;
            }
        } catch (Exception var8) {
            this.method3349(var8);
        }
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(La;Ljava/awt/Canvas;)V", line = 63)
    public class573(class329 arg0, Canvas arg1) {
        this.field8455 = arg1;
        Dimension var3 = arg1.getSize();
        this.method3350(arg0, this.field8455, var3.width, var3.height);
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "()V", line = 71)
    public final void method3355() {
        this.method530(true);
        this.nativeid = 0L;
        this.field8455 = null;
    }

    @OriginalMember(owner = "client!b", name = "finalize", descriptor = "()V", line = 80)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class75.method437(this, -1);
        }
    }

    @OriginalMember(owner = "client!b", name = "NA", descriptor = "(Z)V")
    public final native void method530(boolean arg0);

    @OriginalMember(owner = "client!b", name = "BA", descriptor = "(La;Ljava/awt/Canvas;II)V")
    private final native void method3350(class329 arg0, Canvas arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!b", name = "ga", descriptor = "()V")
    private final native void method3351();

    @OriginalMember(owner = "client!b", name = "xa", descriptor = "(Ljava/awt/Canvas;II)V")
    public final native void method3353(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!b", name = "ea", descriptor = "(IIII)V")
    private final native void method3354(int arg0, int arg1, int arg2, int arg3);
}
