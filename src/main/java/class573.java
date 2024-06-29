import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class573 extends class108 implements class439 {

    @OriginalMember(owner = "client!b", name = "j", descriptor = "Ljava/awt/Canvas;")
    public Canvas field8008;

    @OriginalMember(owner = "client!b", name = "k", descriptor = "Z")
    private static boolean field8009 = false;

    @OriginalMember(owner = "client!b", name = "l", descriptor = "J")
    private static long field8010;

    @OriginalMember(owner = "client!b", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "()V")
    public final void method3232() {
        this.method503(true);
        this.nativeid = 0L;
        this.field8008 = null;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Ljava/lang/Exception;)V")
    private final void method3233(Exception arg0) {
        if (!field8009) {
            field8010 = class348.method2175(-120);
            field8009 = true;
        } else if (class348.method2175(-124) - field8010 < 30000L) {
            this.field8008.repaint();
        } else {
            throw new RuntimeException(arg0.getMessage());
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method3234(Rectangle[] arg0, int arg1) {
        try {
            synchronized (this.field8008.getTreeLock()) {
                for (int var4 = 0; var4 < arg1; var4++) {
                    Rectangle var5 = arg0[var4];
                    if (var5.width > 0 && var5.height > 0) {
                        this.method3235(var5.x, var5.y, var5.width, var5.height);
                    }
                }
                field8009 = false;
            }
        } catch (Exception var8) {
            this.method3233(var8);
        }
    }

    @OriginalMember(owner = "client!b", name = "ea", descriptor = "(IIII)V")
    private final native void method3235(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!b", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class243.method1506(this, 0);
        }
    }

    @OriginalMember(owner = "client!b", name = "ga", descriptor = "()V")
    private final native void method3236();

    @OriginalMember(owner = "client!b", name = "BA", descriptor = "(La;Ljava/awt/Canvas;II)V")
    private final native void method3237(class328 arg0, Canvas arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!b", name = "NA", descriptor = "(Z)V")
    public final native void method503(boolean arg0);

    @OriginalMember(owner = "client!b", name = "xa", descriptor = "(Ljava/awt/Canvas;II)V")
    public final native void method3238(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!b", name = "b", descriptor = "()V")
    public final void method3239() {
        try {
            synchronized (this.field8008.getTreeLock()) {
                this.method3236();
                field8009 = false;
            }
        } catch (Exception var4) {
            this.method3233(var4);
        }
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(La;Ljava/awt/Canvas;)V")
    public class573(class328 arg0, Canvas arg1) {
        this.field8008 = arg1;
        Dimension var3 = arg1.getSize();
        this.method3237(arg0, this.field8008, var3.width, var3.height);
    }
}
