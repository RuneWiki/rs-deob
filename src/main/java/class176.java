import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public abstract class class176 {

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "I")
    public static int field2394 = 0;

    @OriginalMember(owner = "client!tr", name = "d", descriptor = "[I")
    public static int[] field2396 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!tr", name = "g", descriptor = "[[I")
    public static int[][] field2399 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "I")
    public int field2393;

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!tr", name = "f", descriptor = "I")
    public static int field2398;

    @OriginalMember(owner = "client!tr", name = "i", descriptor = "I")
    public int field2401;

    @OriginalMember(owner = "client!tr", name = "h", descriptor = "Lr;")
    public static class110 field2400;

    @OriginalMember(owner = "client!tr", name = "e", descriptor = "[I")
    public int[] field2397;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(ILjava/lang/String;)V", line = 20)
    public static final void method1012(int arg0, String arg1) {
        if (arg0 != 2) {
            field2398 = 12;
        }
        field2395++;
        System.out.println("Error: " + class490.method2856(arg1, (byte) -119, "\n", "%0a"));
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(I)V", line = 36)
    public static void method1013(int arg0) {
        field2400 = null;
        field2396 = null;
        if (arg0 != 6) {
            method1012(68, (String) null);
        }
        field2399 = null;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(Ljava/awt/Canvas;B)V")
    public abstract void method1009(Canvas arg0, byte arg1);

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
    public abstract void method1010(int arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5);

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
    public abstract void method1011(Graphics arg0, int arg1, int arg2, int arg3);
}
