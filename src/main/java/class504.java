import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class504 {

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "I")
    public static int field7267 = 0;

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "I")
    public int field7265;

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "I")
    public static int field7266;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "Ljava/lang/String;")
    public String field7264;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method2895(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field7266++;
        if (!class321.field3945) {
            return false;
        } else if (class697.field9783 < 100) {
            return false;
        } else if (class64.method349(arg1 ^ 0x30EB, arg0, arg2, arg3)) {
            if (arg1 != 12532) {
                field7267 = 127;
            }
            int var5 = arg0 << class559.field7984;
            int var6 = arg3 << class559.field7984;
            if (class300.method1744(arg4, var6, -22975, class171.field1904, class171.field1904, class156.field1743[arg2].method1608(arg3, arg1 ^ 0x33BC, arg0), var5)) {
                class676.field9402++;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
