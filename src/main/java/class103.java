import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qda")
public class class103 {

    @OriginalMember(owner = "client!qda", name = "m", descriptor = "Lbq;")
    public static class289 field1077 = new class289();

    @OriginalMember(owner = "client!qda", name = "n", descriptor = "Luh;")
    public static class166 field1078 = new class166();

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "I")
    public int field1065;

    @OriginalMember(owner = "client!qda", name = "b", descriptor = "I")
    public int field1066;

    @OriginalMember(owner = "client!qda", name = "c", descriptor = "I")
    public int field1067;

    @OriginalMember(owner = "client!qda", name = "d", descriptor = "I")
    public int field1068;

    @OriginalMember(owner = "client!qda", name = "e", descriptor = "I")
    public int field1069;

    @OriginalMember(owner = "client!qda", name = "f", descriptor = "I")
    public int field1070;

    @OriginalMember(owner = "client!qda", name = "g", descriptor = "I")
    public int field1071;

    @OriginalMember(owner = "client!qda", name = "h", descriptor = "I")
    public int field1072;

    @OriginalMember(owner = "client!qda", name = "i", descriptor = "I")
    public int field1073;

    @OriginalMember(owner = "client!qda", name = "j", descriptor = "I")
    public int field1074;

    @OriginalMember(owner = "client!qda", name = "k", descriptor = "I")
    public int field1075;

    @OriginalMember(owner = "client!qda", name = "l", descriptor = "I")
    public int field1076;

    @OriginalMember(owner = "client!qda", name = "o", descriptor = "I")
    public static int field1079;

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(I)V", line = 5)
    public static void method714(int arg0) {
        if (arg0 != 646) {
            field1078 = null;
        }
        field1078 = null;
        field1077 = null;
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(Lqda;B)Z", line = 20)
    public final boolean method715(class103 arg0, byte arg1) {
        field1079++;
        if (this.field1070 == arg0.field1070 && this.field1066 == arg0.field1066 && this.field1071 == arg0.field1071) {
            return true;
        } else {
            if (arg1 != 56) {
                method714(84);
            }
            return false;
        }
    }
}
