import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cda")
public class class173 {

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!cda", name = "b", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!cda", name = "c", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!cda", name = "toString", descriptor = "()Ljava/lang/String;", line = 8)
    public final String toString() {
        field2636++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(B)Z", line = 16)
    public final boolean method1217(byte arg0) {
        field2637++;
        if (arg0 != 0) {
            this.method1217((byte) -85);
        }
        return class62.field759 == this | class169.field2604 == this;
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(I)Ljava/lang/String;", line = 27)
    public static final String method1218(int arg0) {
        if (arg0 > -5) {
            return null;
        } else {
            field2635++;
            return class403.field5625 || class218.field3147 == null ? "" : class218.field3147.field5960;
        }
    }
}
