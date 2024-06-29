import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public abstract class class492 {

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field6793 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "Luda;")
    public static class549 field6794 = new class549();

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z)V", line = 11)
    public static void method2809(boolean arg0) {
        if (!arg0) {
            method2809(false);
        }
        field6794 = null;
        field6793 = null;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILwca;)Lwca;")
    public abstract class336 method1198(int arg0, class336 arg1);
}
