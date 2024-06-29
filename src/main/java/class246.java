import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class246 extends class130 {

    @OriginalMember(owner = "client!rn", name = "n", descriptor = "Ljava/lang/String;")
    public String field3691;

    @OriginalMember(owner = "client!rn", name = "k", descriptor = "I")
    public static int field3688;

    @OriginalMember(owner = "client!rn", name = "l", descriptor = "I")
    public static int field3689;

    @OriginalMember(owner = "client!rn", name = "m", descriptor = "I")
    public static int field3690;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIBIII)Z", line = 4)
    public static final boolean method1663(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        if (arg2 != 71) {
            return true;
        }
        field3689++;
        for (int var6 = arg1; var6 <= arg0; var6++) {
            for (int var7 = arg3; var7 <= arg5; var7++) {
                if (class456.field6783[var6][var7] == arg4 && class118.field1823[var6][var7] <= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "()V", line = 40)
    public class246() {
    }

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 42)
    public class246(String arg0, int arg1) {
        this.field3691 = arg0;
    }
}
