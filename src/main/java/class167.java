import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class167 {

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "Loj;")
    public static class246 field2722 = new class246();

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "[I")
    public static int[] field2723 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    public static int field2726 = 0;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "Ldk;")
    public static class251 field2724;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field2725;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "[I")
    public static int[] field2727;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
    public static void method1220(int arg0) {
        field2727 = null;
        field2723 = null;
        if (arg0 <= -1) {
            field2724 = null;
            field2725 = null;
            field2722 = null;
        }
    }
}
