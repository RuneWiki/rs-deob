import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public abstract class class711 extends class430 {

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "Lhe;")
    public static class573 field10014 = new class573("WTWIP", 3);

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "I")
    public int field10016;

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "I")
    public int field10017;

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "[I")
    public int[] field10015;

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "[Ltd;")
    public static class515[] field10018;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)V")
    public static void method3977(byte arg0) {
        field10018 = null;
        field10014 = null;
        if (arg0 != 110) {
            field10014 = null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Ljava/awt/Graphics;IIIIIII)V")
    public abstract void method86(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILjava/awt/Canvas;II)V")
    public abstract void method87(int arg0, Canvas arg1, int arg2, int arg3);
}
