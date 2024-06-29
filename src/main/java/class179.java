import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public abstract class class179 {

    @OriginalMember(owner = "client!je", name = "a", descriptor = "Loh;")
    public static class263 field3275 = class253.method1681(-124, "loc");

    @OriginalMember(owner = "client!je", name = "b", descriptor = "I")
    public static int field3276 = 500;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    public static int field3277 = 0;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V")
    public static void method1202(byte arg0) {
        field3275 = null;
        if (arg0 >= -41) {
            method1202((byte) -101);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(BLqc;)Lqc;")
    public abstract class61 method1203(byte arg0, class61 arg1);
}
