import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class235 {

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
    public static int field3095;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    public static int field3096;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "Lsa;")
    public static class381 field3094;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z)V")
    public static void method1514(boolean arg0) {
        field3094 = null;
        if (arg0) {
            field3094 = null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IB)Loo;")
    public static final class27 method1515(int arg0, byte arg1) {
        field3096++;
        if (class236.field3103 && arg0 >= class137.field1552 && arg0 <= class282.field3686) {
            int var2 = 34 / ((arg1 - 75) / 44);
            return class134.field1537[arg0 - class137.field1552];
        } else {
            return null;
        }
    }
}
