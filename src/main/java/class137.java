import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public abstract class class137 extends class504 {

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "Lcu;")
    public static class206 field2219 = new class206(31, 11);

    @OriginalMember(owner = "client!mg", name = "n", descriptor = "Los;")
    public static class412 field2224 = new class412(1, 2);

    @OriginalMember(owner = "client!mg", name = "o", descriptor = "Z")
    public static boolean field2225 = false;

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "I")
    public int field2220;

    @OriginalMember(owner = "client!mg", name = "m", descriptor = "I")
    public int field2223;

    @OriginalMember(owner = "client!mg", name = "l", descriptor = "Ltga;")
    public static class54 field2222;

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "[I")
    public int[] field2221;

    @OriginalMember(owner = "client!mg", name = "p", descriptor = "[[[I")
    public static int[][][] field2226;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Z)V", line = 7)
    public static void method1013(boolean arg0) {
        if (!arg0) {
            field2226 = null;
        }
        field2222 = null;
        field2219 = null;
        field2226 = null;
        field2224 = null;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
    public abstract void method1014(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5);

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public abstract void method1015(int arg0, int arg1, Graphics arg2, int arg3);

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
    public abstract void method1016(int arg0, Canvas arg1);
}
