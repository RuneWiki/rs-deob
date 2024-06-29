import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public abstract class class418 extends class154 {

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "Lmo;")
    public static class780 field5706 = new class780("", 13);

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "I")
    public int field5705;

    @OriginalMember(owner = "client!hf", name = "l", descriptor = "I")
    public static int field5708;

    @OriginalMember(owner = "client!hf", name = "m", descriptor = "I")
    public int field5709;

    @OriginalMember(owner = "client!hf", name = "k", descriptor = "Lpo;")
    public static class585 field5707;

    @OriginalMember(owner = "client!hf", name = "n", descriptor = "[I")
    public int[] field5710;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V", line = 6)
    public static void method2459(byte arg0) {
        if (arg0 < -63) {
            field5706 = null;
            field5707 = null;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IZZII)V", line = 19)
    public static final void method2461(int arg0, boolean arg1, boolean arg2, int arg3, int arg4) {
        class449.method2607(arg1, arg3, 0, arg2, arg4, (byte) 56, class18.field426.length - 1);
        if (arg0 < 86) {
            field5706 = null;
        }
        field5708++;
        class224.field3278 = null;
        class344.field4633 = 0;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILjava/awt/Graphics;IIIIII)V")
    public abstract void method2460(int arg0, Graphics arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILjava/awt/Canvas;II)V")
    public abstract void method2462(int arg0, Canvas arg1, int arg2, int arg3);
}
