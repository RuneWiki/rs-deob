import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class194 extends class513 implements class199 {

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "Ljava/awt/Canvas;")
    public Canvas field2358;

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "Z")
    private static boolean field2359 = false;

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "J")
    private static long field2360;

    @OriginalMember(owner = "client!ta", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "()V")
    public final void method1187() {
        try {
            synchronized (this.field2358.getTreeLock()) {
                this.method1193();
                field2359 = false;
            }
        } catch (Exception var4) {
            this.method1192(var4);
        }
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "()V")
    public final void method1188() {
        this.method221(true);
        this.nativeid = 0L;
        this.field2358 = null;
    }

    @OriginalMember(owner = "client!ta", name = "AA", descriptor = "(Ljava/awt/Canvas;II)V")
    public final native void method1189(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIII)V")
    private final native void method1190(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method1191(Rectangle[] arg0, int arg1) {
        try {
            synchronized (this.field2358.getTreeLock()) {
                for (int var4 = 0; var4 < arg1; var4++) {
                    Rectangle var5 = arg0[var4];
                    if (var5.width > 0 && var5.height > 0) {
                        this.method1190(var5.x, var5.y, var5.width, var5.height);
                    }
                }
                field2359 = false;
            }
        } catch (Exception var8) {
            this.method1192(var8);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/lang/Exception;)V")
    private final void method1192(Exception arg0) {
        if (!field2359) {
            field2360 = class301.method1787((byte) 50);
            field2359 = true;
        } else if (class301.method1787((byte) 38) - field2360 < 30000L) {
            this.field2358.repaint();
        } else {
            throw new RuntimeException(arg0.getMessage());
        }
    }

    @OriginalMember(owner = "client!ta", name = "H", descriptor = "()V")
    private final native void method1193();

    @OriginalMember(owner = "client!ta", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class542.method3175(this, 0);
        }
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Ll;Ljava/awt/Canvas;)V")
    public class194(class18 arg0, Canvas arg1) {
        this.field2358 = arg1;
        Dimension var3 = arg1.getSize();
        this.method1194(arg0, this.field2358, var3.width, var3.height);
    }

    @OriginalMember(owner = "client!ta", name = "UA", descriptor = "(Z)V")
    public final native void method221(boolean arg0);

    @OriginalMember(owner = "client!ta", name = "da", descriptor = "(Ll;Ljava/awt/Canvas;II)V")
    private final native void method1194(class18 arg0, Canvas arg1, int arg2, int arg3);
}
