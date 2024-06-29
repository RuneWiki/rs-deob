import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pfa")
public abstract class class242 extends class173 {

    @OriginalMember(owner = "client!pfa", name = "r", descriptor = "I")
    public int field3334;

    @OriginalMember(owner = "client!pfa", name = "s", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!pfa", name = "<init>", descriptor = "(I)V", line = 5)
    public class242(int arg0) {
        this.field3334 = arg0;
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(Ljava/lang/String;Z)Z", line = 14)
    public static final boolean method1594(String arg0, boolean arg1) {
        field3335++;
        if (!arg1) {
            method1594(null, false);
        }
        if (arg0 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class738.field9988; var2++) {
            if (arg0.equalsIgnoreCase(class278.field3616[var2])) {
                return true;
            }
            if (arg0.equalsIgnoreCase(class294.field3739[var2])) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(Z)Ljava/lang/Object;")
    public abstract Object method1380(boolean arg0);

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(B)Z")
    public abstract boolean method1377(byte arg0);
}
