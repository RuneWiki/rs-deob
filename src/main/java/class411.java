import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class411 {

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "Lhu;")
    public class85 field5648 = new class85();

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "Z")
    public boolean field5649 = false;

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "Lcu;")
    public static class145 field5651 = new class145(56, 2);

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "Lff;")
    public static class9 field5652 = new class9(79, 18);

    @OriginalMember(owner = "client!pm", name = "g", descriptor = "[I")
    public static int[] field5654 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "I")
    public int field5650;

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "I")
    public static int field5653;

    @OriginalMember(owner = "client!pm", name = "i", descriptor = "I")
    public static int field5656;

    @OriginalMember(owner = "client!pm", name = "j", descriptor = "I")
    public int field5657;

    @OriginalMember(owner = "client!pm", name = "h", descriptor = "Lf;")
    public static class529 field5655;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIBII)V", line = 3)
    public static final void method2374(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field5653++;
        if (arg2 != -32) {
            return;
        }
        for (int var5 = 0; var5 < class210.field2871; var5++) {
            Rectangle var6 = class108.field1564[var5];
            if (arg4 < (var6.x + var6.width) && var6.x < arg0 + arg4 && var6.y + var6.height > arg1 && var6.y < (arg1 + arg3)) {
                class153.field2231[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)V", line = 49)
    public static void method2375(int arg0) {
        if (arg0 != 8823) {
            method2374(-28, 61, (byte) 54, -42, -14);
        }
        field5654 = null;
        field5655 = null;
        field5652 = null;
        field5651 = null;
    }
}
