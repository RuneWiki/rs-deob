import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class104 extends class430 implements class2 {

    @OriginalMember(owner = "client!p", name = "g", descriptor = "Ljava/awt/Canvas;")
    public Canvas field1466;

    @OriginalMember(owner = "client!p", name = "i", descriptor = "I")
    public int field1468;

    @OriginalMember(owner = "client!p", name = "h", descriptor = "I")
    public int field1467;

    @OriginalMember(owner = "client!p", name = "k", descriptor = "Z")
    private static boolean field1470 = false;

    @OriginalMember(owner = "client!p", name = "j", descriptor = "J")
    private static long field1469;

    @OriginalMember(owner = "client!p", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(II)V")
    public final void method764(int arg0, int arg1) {
        try {
            synchronized (this.field1466.getTreeLock()) {
                Dimension var4 = this.field1466.getSize();
                this.method765(arg0, arg1, var4.width, var4.height);
                field1470 = false;
            }
        } catch (Exception var7) {
            this.method772(var7);
        }
    }

    @OriginalMember(owner = "client!p", name = "H", descriptor = "(IIII)V")
    private final native void method765(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!p", name = "oa", descriptor = "(Ljava/awt/Canvas;II)V")
    private final native void method766(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method767(Canvas arg0, int arg1, int arg2) {
        this.field1468 = arg1;
        this.field1467 = arg2;
        this.method766(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public final void method768(Rectangle[] arg0, int arg1, int arg2, int arg3) {
        try {
            synchronized (this.field1466.getTreeLock()) {
                for (int var6 = 0; var6 < arg1; var6++) {
                    Rectangle var7 = arg0[var6];
                    if (var7.width > 0 && var7.height > 0) {
                        this.method771(var7.x, var7.y, var7.width, var7.height, arg2, arg3);
                    }
                }
                field1470 = false;
            }
        } catch (Exception var10) {
            this.method772(var10);
        }
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Loa;Ljava/awt/Canvas;II)V")
    public class104(class406 arg0, Canvas arg1, int arg2, int arg3) {
        this.field1466 = arg1;
        this.field1468 = arg2;
        this.field1467 = arg3;
        this.method770(arg0, this.field1466, arg2, arg3);
    }

    @OriginalMember(owner = "client!p", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class260.method1726(this, false);
        }
    }

    @OriginalMember(owner = "client!p", name = "w", descriptor = "(Z)V")
    public final native void method9(boolean arg0);

    @OriginalMember(owner = "client!p", name = "b", descriptor = "()V")
    public final void method769() {
        this.method9(true);
        this.nativeid = 0L;
        this.field1466 = null;
    }

    @OriginalMember(owner = "client!p", name = "sa", descriptor = "(Loa;Ljava/awt/Canvas;II)V")
    private final native void method770(class406 arg0, Canvas arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!p", name = "K", descriptor = "(IIIIII)V")
    private final native void method771(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/lang/Exception;)V")
    private final void method772(Exception arg0) {
        if (!field1470) {
            field1469 = class465.method2818(255);
            field1470 = true;
        } else if (class465.method2818(255) - field1469 < 30000L) {
            this.field1466.repaint();
        } else {
            throw new RuntimeException(arg0.getMessage());
        }
    }
}
