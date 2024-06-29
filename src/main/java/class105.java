import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class105 {

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
    public static int field2408 = 1;

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "I")
    public static int field2410 = 0;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "Lch;")
    public static class29 field2407 = new class29(500);

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
    public static int field2409;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)V")
    public static void method865(byte arg0) {
        if (arg0 != 35) {
            method865((byte) -75);
        }
        field2407 = null;
    }
}
