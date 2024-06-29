import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public abstract class class246 extends class539 {

    @OriginalMember(owner = "client!kg", name = "s", descriptor = "[I")
    public static int[] field3504 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!kg", name = "m", descriptor = "I")
    public int field3498;

    @OriginalMember(owner = "client!kg", name = "n", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!kg", name = "o", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!kg", name = "q", descriptor = "I")
    public int field3502;

    @OriginalMember(owner = "client!kg", name = "r", descriptor = "[I")
    public int[] field3503;

    @OriginalMember(owner = "client!kg", name = "p", descriptor = "[[[B")
    public static byte[][][] field3501;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)V", line = 7)
    public static void method1521(int arg0) {
        if (arg0 == 5) {
            field3501 = null;
            field3504 = null;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIILjava/awt/Graphics;BI)V")
    public abstract void method1522(int arg0, int arg1, int arg2, Graphics arg3, byte arg4, int arg5);

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Ljava/awt/Canvas;Z)V")
    public abstract void method1523(Canvas arg0, boolean arg1);

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
    public abstract void method1524(Graphics arg0, int arg1, int arg2, int arg3);
}
