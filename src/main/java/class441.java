import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public abstract class class441 {

    @OriginalMember(owner = "client!up", name = "d", descriptor = "[I")
    public static int[] field6441 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!up", name = "a", descriptor = "I")
    public int field6438;

    @OriginalMember(owner = "client!up", name = "c", descriptor = "I")
    public int field6440;

    @OriginalMember(owner = "client!up", name = "b", descriptor = "Lin;")
    public static class180 field6439;

    @OriginalMember(owner = "client!up", name = "f", descriptor = "[I")
    public int[] field6443;

    @OriginalMember(owner = "client!up", name = "e", descriptor = "[[B")
    public static byte[][] field6442;

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(I)V", line = 6)
    public static void method2729(int arg0) {
        if (arg0 != -2696) {
            field6442 = null;
        }
        field6441 = null;
        field6439 = null;
        field6442 = null;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
    public abstract void method475(int arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5);

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public abstract void method479(int arg0, Graphics arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
    public abstract void method478(Canvas arg0, int arg1);
}
