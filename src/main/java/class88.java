import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class88 extends class471 {

    @OriginalMember(owner = "client!hk", name = "l", descriptor = "I")
    public static int field1072;

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "Lri;")
    public static class97 field1071;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V", line = 6)
    public static void method802(int arg0) {
        field1071 = null;
        if (arg0 != 4323) {
            field1071 = null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(II)Lcca;", line = 19)
    public static final class226 method803(int arg0, int arg1) {
        field1072++;
        if (class405.field6243 && class78.field993 <= arg1 && class402.field6202 >= arg1) {
            if (arg0 >= -9) {
                field1071 = null;
            }
            return class634.field8913[arg1 - class78.field993];
        } else {
            return null;
        }
    }
}
