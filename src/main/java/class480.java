import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public abstract class class480 {

    @OriginalMember(owner = "client!si", name = "b", descriptor = "I")
    public static int field6764 = 0;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "Lcba;")
    public static class471 field6763 = new class471(64, 7);

    @OriginalMember(owner = "client!si", name = "e", descriptor = "Z")
    public static boolean field6767 = false;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "Z")
    public static boolean field6766 = false;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "Ldea;")
    public static class205 field6765 = new class205(16);

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V")
    public static void method2792(int arg0) {
        if (arg0 == -32747) {
            field6763 = null;
            field6765 = null;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Lks;B)Lks;")
    public abstract class371 method2793(class371 arg0, byte arg1);
}
