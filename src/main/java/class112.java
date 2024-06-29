import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class112 extends class337 implements class2 {

    @OriginalMember(owner = "client!p", name = "l", descriptor = "Ljava/awt/Canvas;")
    public Canvas field1490;

    @OriginalMember(owner = "client!p", name = "n", descriptor = "I")
    public int field1492;

    @OriginalMember(owner = "client!p", name = "o", descriptor = "I")
    public int field1493;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "Z")
    private static boolean field1491 = false;

    @OriginalMember(owner = "client!p", name = "p", descriptor = "J")
    private static long field1494;

    @OriginalMember(owner = "client!p", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!p", name = "finalize", descriptor = "()V", line = 3)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class18.method80(-1, this);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/lang/Exception;)V", line = 13)
    private final void method653(Exception arg0) {
        if (!field1491) {
            field1494 = class502.method2786(-7114);
            field1491 = true;
        } else if (class502.method2786(-7114) - field1494 < 30000L) {
            this.field1490.repaint();
        } else {
            throw new RuntimeException(arg0.getMessage());
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "()V", line = 33)
    public final void method654() {
        this.method5(true);
        this.nativeid = 0L;
        this.field1490 = null;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/awt/Canvas;II)V", line = 39)
    public final void method655(Canvas arg0, int arg1, int arg2) {
        this.field1492 = arg1;
        this.field1493 = arg2;
        this.method651(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V", line = 51)
    public final void method657(Rectangle[] arg0, int arg1, int arg2, int arg3) {
        try {
            synchronized (this.field1490.getTreeLock()) {
                for (int var6 = 0; var6 < arg1; var6++) {
                    Rectangle var7 = arg0[var6];
                    if (var7.width > 0 && var7.height > 0) {
                        this.method652(var7.x, var7.y, var7.width, var7.height, arg2, arg3);
                    }
                }
                field1491 = false;
            }
        } catch (Exception var10) {
            this.method653(var10);
        }
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Loa;Ljava/awt/Canvas;II)V", line = 75)
    public class112(class426 arg0, Canvas arg1, int arg2, int arg3) {
        this.field1490 = arg1;
        this.field1492 = arg2;
        this.field1493 = arg3;
        this.method650(arg0, this.field1490, arg2, arg3);
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(II)V", line = 82)
    public final void method658(int arg0, int arg1) {
        try {
            synchronized (this.field1490.getTreeLock()) {
                Dimension var4 = this.field1490.getSize();
                this.method656(arg0, arg1, var4.width, var4.height);
                field1491 = false;
            }
        } catch (Exception var7) {
            this.method653(var7);
        }
    }

    @OriginalMember(owner = "client!p", name = "sa", descriptor = "(Loa;Ljava/awt/Canvas;II)V")
    private final native void method650(class426 arg0, Canvas arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!p", name = "oa", descriptor = "(Ljava/awt/Canvas;II)V")
    private final native void method651(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!p", name = "K", descriptor = "(IIIIII)V")
    private final native void method652(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!p", name = "H", descriptor = "(IIII)V")
    private final native void method656(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!p", name = "w", descriptor = "(Z)V")
    public final native void method5(boolean arg0);
}
