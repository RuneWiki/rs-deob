import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!afa")
public class class363 extends class97 {

    @OriginalMember(owner = "client!afa", name = "f", descriptor = "[I")
    public static int[] field5252 = new int[16];

    @OriginalMember(owner = "client!afa", name = "e", descriptor = "Ljb;")
    public static class519 field5251 = new class519(66, 3);

    @OriginalMember(owner = "client!afa", name = "b", descriptor = "(I)V")
    public static void method2298(int arg0) {
        field5251 = null;
        if (arg0 != 3) {
            field5251 = null;
        }
        field5252 = null;
    }
}
