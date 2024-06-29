import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class362 extends class349 {

    @OriginalMember(owner = "client!me", name = "k", descriptor = "[I")
    public static int[] field4990 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!me", name = "n", descriptor = "I")
    public static int field4993 = 0;

    @OriginalMember(owner = "client!me", name = "j", descriptor = "I")
    public static int field4989 = 0;

    @OriginalMember(owner = "client!me", name = "l", descriptor = "I")
    public static int field4991;

    @OriginalMember(owner = "client!me", name = "m", descriptor = "Lwo;")
    public static class52 field4992;

    @OriginalMember(owner = "client!me", name = "i", descriptor = "[[[B")
    public static byte[][][] field4988;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V", line = 19)
    public static void method2228(int arg0) {
        field4990 = null;
        if (arg0 == 38) {
            field4988 = null;
            field4992 = null;
        }
    }
}
