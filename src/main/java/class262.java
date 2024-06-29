import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class262 {

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "I")
    public static int field3552 = 0;

    @OriginalMember(owner = "client!bq", name = "c", descriptor = "Lhw;")
    public static class115 field3553 = new class115();

    @OriginalMember(owner = "client!bq", name = "d", descriptor = "Z")
    public static volatile boolean field3554 = true;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "Lkl;")
    public static class70 field3551;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(I)V")
    public static void method1599(int arg0) {
        int var1 = 28 % ((arg0 - 35) / 52);
        field3551 = null;
        field3553 = null;
    }
}
