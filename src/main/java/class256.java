import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public abstract class class256 {

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "Z")
    public static boolean field4029 = true;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "Lnha;")
    public static class686 field4031 = new class686();

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "Lcl;")
    public static class746 field4030;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Z)V", line = 8)
    public static void method1728(boolean arg0) {
        field4030 = null;
        field4031 = null;
        if (!arg0) {
            method1728(true);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Llia;I)Llia;")
    public abstract class186 method901(class186 arg0, int arg1);
}
