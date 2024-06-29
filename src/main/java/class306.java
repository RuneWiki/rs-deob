import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class306 {

    @OriginalMember(owner = "client!qq", name = "d", descriptor = "I")
    public static int field4053 = 0;

    @OriginalMember(owner = "client!qq", name = "e", descriptor = "[I")
    public static int[] field4054 = new int[100];

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "[Ljava/awt/Color;")
    public static Color[] field4052 = new Color[] { new Color(9179409), new Color(16777215) };

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "I")
    public static int field4051;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "[I")
    public static int[] field4050;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(I)V")
    public static void method1697(int arg0) {
        field4050 = null;
        field4052 = null;
        if (arg0 != -16898) {
            method1697(14);
        }
        field4054 = null;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Z)V")
    public static final void method1698(boolean arg0) {
        class453.field6147.method2087(((float) class488.field6789.field6664 * 0.1F + 0.7F) * class467.field6466);
        field4051++;
        class453.field6147.method2075(class392.field5439, class48.field641, class18.field257, (float) class429.field5856, (float) class70.field966, (float) class196.field2669);
        class453.field6147.method2112(class27.field357);
        if (!arg0) {
            field4050 = null;
        }
    }
}
