import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lea")
public abstract class class637 extends class159 {

    @OriginalMember(owner = "client!lea", name = "m", descriptor = "[Lbea;")
    public static class236[] field8585 = new class236[14];

    @OriginalMember(owner = "client!lea", name = "o", descriptor = "[I")
    public static int[] field8587 = new int[2];

    @OriginalMember(owner = "client!lea", name = "p", descriptor = "[Ljh;")
    public static class170[] field8588 = new class170[2048];

    @OriginalMember(owner = "client!lea", name = "k", descriptor = "I")
    public int field8583;

    @OriginalMember(owner = "client!lea", name = "l", descriptor = "I")
    public int field8584;

    @OriginalMember(owner = "client!lea", name = "n", descriptor = "[I")
    public int[] field8586;

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(Z)V", line = 7)
    public static void method3508(boolean arg0) {
        if (!arg0) {
            field8587 = null;
            field8588 = null;
            field8585 = null;
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIILjava/awt/Canvas;)V")
    public abstract void method1261(int arg0, int arg1, int arg2, Canvas arg3);

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIIIILjava/awt/Graphics;II)V")
    public abstract void method1260(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5, int arg6, int arg7);
}
