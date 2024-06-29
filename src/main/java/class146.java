import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class146 extends class424 implements class128 {

    @OriginalMember(owner = "client!v", name = "n", descriptor = "Ljava/awt/Canvas;")
    public Canvas field1900;

    @OriginalMember(owner = "client!v", name = "o", descriptor = "Z")
    private static boolean field1901 = false;

    @OriginalMember(owner = "client!v", name = "p", descriptor = "J")
    private static long field1902;

    @OriginalMember(owner = "client!v", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Ljava/lang/Exception;)V")
    private final void method1084(Exception arg0) {
        if (!field1901) {
            field1902 = class584.method3191(1);
            field1901 = true;
        } else if (class584.method3191(1) - field1902 < 30000L) {
            this.field1900.repaint();
        } else {
            throw new RuntimeException(arg0.getMessage());
        }
    }

    @OriginalMember(owner = "client!v", name = "QA", descriptor = "()V")
    private final native void method1085();

    @OriginalMember(owner = "client!v", name = "KA", descriptor = "(IIII)V")
    private final native void method1086(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method1087(Rectangle[] arg0, int arg1) {
        try {
            synchronized (this.field1900.getTreeLock()) {
                for (int var4 = 0; var4 < arg1; var4++) {
                    Rectangle var5 = arg0[var4];
                    if (var5.width > 0 && var5.height > 0) {
                        this.method1086(var5.x, var5.y, var5.width, var5.height);
                    }
                }
                field1901 = false;
            }
        } catch (Exception var8) {
            this.method1084(var8);
        }
    }

    @OriginalMember(owner = "client!v", name = "ya", descriptor = "(Lda;Ljava/awt/Canvas;II)V")
    private final native void method1088(class396 arg0, Canvas arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "()V")
    public final void method1089() {
        try {
            synchronized (this.field1900.getTreeLock()) {
                this.method1085();
                field1901 = false;
            }
        } catch (Exception var4) {
            this.method1084(var4);
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "()V")
    public final void method1090() {
        this.method599(true);
        this.nativeid = 0L;
        this.field1900 = null;
    }

    @OriginalMember(owner = "client!v", name = "H", descriptor = "(Z)V")
    public final native void method599(boolean arg0);

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lda;Ljava/awt/Canvas;)V")
    public class146(class396 arg0, Canvas arg1) {
        this.field1900 = arg1;
        Dimension var3 = arg1.getSize();
        this.method1088(arg0, this.field1900, var3.width, var3.height);
    }

    @OriginalMember(owner = "client!v", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class29.method241(-119, this);
        }
    }

    @OriginalMember(owner = "client!v", name = "D", descriptor = "(Ljava/awt/Canvas;II)V")
    public final native void method1091(Canvas arg0, int arg1, int arg2);
}
