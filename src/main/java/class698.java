import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vfa")
public class class698 {

    @OriginalMember(owner = "client!vfa", name = "c", descriptor = "I")
    public static int field9255 = 0;

    @OriginalMember(owner = "client!vfa", name = "b", descriptor = "I")
    public static int field9254;

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "Lef;")
    public static class513 field9253;

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(B)V")
    public static void method3789(byte arg0) {
        if (arg0 != 19) {
            method3789((byte) 53);
        }
        field9253 = null;
    }
}
