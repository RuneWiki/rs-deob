import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class335 {

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "Lob;")
    public static class521 field4995 = new class521(41, 3);

    @OriginalMember(owner = "client!qq", name = "e", descriptor = "[Ljava/awt/Color;")
    public static Color[] field4997 = new Color[] { new Color(9179409), new Color(3289650) };

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "I")
    public static int field4993;

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "I")
    public static int field4994;

    @OriginalMember(owner = "client!qq", name = "d", descriptor = "I")
    public static int field4996;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(I)V", line = 7)
    public static void method2116(int arg0) {
        if (arg0 == 3) {
            field4995 = null;
            field4997 = null;
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIIII)V", line = 29)
    public static final void method2117(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class442.field6494 = arg3;
        class373.field5552 = arg2;
        class502.field7225 = arg1;
        field4994++;
        class176.field2629 = arg4;
        if (arg0 != 9179409) {
            method2117(32, 11, 39, 35, -58);
        }
    }
}
