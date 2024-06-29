import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class360 {

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "[Z")
    public static boolean[] field4653 = new boolean[8];

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "Lgq;")
    public static class357 field4654;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(I)V")
    public static void method2069(int arg0) {
        field4654 = null;
        int var1 = 100 % ((19 - arg0) / 45);
        field4653 = null;
    }
}
