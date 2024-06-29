import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public abstract class class458 extends class439 {

    @OriginalMember(owner = "client!pl", name = "r", descriptor = "Lvp;")
    public static class123 field6758 = new class123(78, 11);

    @OriginalMember(owner = "client!pl", name = "v", descriptor = "[Z")
    public static boolean[] field6762 = new boolean[8];

    @OriginalMember(owner = "client!pl", name = "n", descriptor = "I")
    public int field6754;

    @OriginalMember(owner = "client!pl", name = "o", descriptor = "I")
    public int field6755;

    @OriginalMember(owner = "client!pl", name = "q", descriptor = "I")
    public static int field6757;

    @OriginalMember(owner = "client!pl", name = "s", descriptor = "I")
    public static int field6759;

    @OriginalMember(owner = "client!pl", name = "u", descriptor = "Lci;")
    public static class312 field6761;

    @OriginalMember(owner = "client!pl", name = "t", descriptor = "Lqh;")
    public static class48 field6760;

    @OriginalMember(owner = "client!pl", name = "p", descriptor = "[I")
    public int[] field6756;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
    public abstract void method1419(Canvas arg0, int arg1);

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "(I)V")
    public static void method2748(int arg0) {
        if (arg0 >= 54) {
            field6761 = null;
            field6758 = null;
            field6760 = null;
            field6762 = null;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Ljava/lang/String;ILqg;I)Lub;")
    public static final class18 method2749(String arg0, int arg1, class321 arg2, int arg3) {
        field6757++;
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg3, var4);
        OpenGL.glProgramStringARB(arg3, 34933, arg0);
        OpenGL.glGetIntegerv(34379, class128.field1959, 0);
        if (~class128.field1959[0] == arg1) {
            OpenGL.glBindProgramARB(arg3, 0);
            return new class18(arg2, arg3, var4);
        } else {
            OpenGL.glBindProgramARB(arg3, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
    public abstract void method1420(int arg0, int arg1, int arg2, Graphics arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Ljava/awt/Graphics;IBI)V")
    public abstract void method1417(Graphics arg0, int arg1, byte arg2, int arg3);
}
