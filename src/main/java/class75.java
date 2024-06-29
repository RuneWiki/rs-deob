import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class75 {

    @OriginalMember(owner = "client!v", name = "c", descriptor = "I")
    public static volatile int field1528 = 0;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "Loj;")
    public static class283 field1527;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "Lbm;")
    public static class307 field1530;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V", line = 24)
    public static void method564(int arg0) {
        if (arg0 == 0) {
            field1527 = null;
            field1530 = null;
        }
    }
}
