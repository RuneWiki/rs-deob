import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vea")
public class class408 {

    @OriginalMember(owner = "client!vea", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field5119 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "Lpk;")
    public static class104 field5117 = new class104("LOCAL", 4);

    @OriginalMember(owner = "client!vea", name = "b", descriptor = "I")
    public static int field5118;

    @OriginalMember(owner = "client!vea", name = "d", descriptor = "I")
    public static int field5120;

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(Z)V")
    public static void method2166(boolean arg0) {
        if (!arg0) {
            method2167(23, 97);
        }
        field5117 = null;
        field5119 = null;
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(II)Z")
    public static final boolean method2167(int arg0, int arg1) {
        field5118++;
        if (arg0 != 5) {
            method2167(118, -113);
        }
        return arg1 == 1 || arg1 == 3 || arg1 == 5;
    }
}
