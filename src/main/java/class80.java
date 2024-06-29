import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class80 {

    @OriginalMember(owner = "client!u", name = "b", descriptor = "Z")
    private boolean field1140 = true;

    @OriginalMember(owner = "client!u", name = "e", descriptor = "I")
    public int field1143 = 443;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "I")
    public int field1139 = 43594;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "Z")
    private boolean field1142 = false;

    @OriginalMember(owner = "client!u", name = "g", descriptor = "I")
    public static int field1145;

    @OriginalMember(owner = "client!u", name = "h", descriptor = "I")
    public static int field1146;

    @OriginalMember(owner = "client!u", name = "i", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!u", name = "j", descriptor = "I")
    public int field1148;

    @OriginalMember(owner = "client!u", name = "f", descriptor = "Ljava/lang/Object;")
    public static Object field1144;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "Ljava/lang/String;")
    public String field1141;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BLqn;)Leba;", line = 11)
    public final class615 method677(byte arg0, class70 arg1) {
        if (arg0 != 104) {
            field1144 = null;
        }
        field1146++;
        return arg1.method624(this.field1141, this.field1140 ? this.field1143 : this.field1139, 51, this.field1142);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V", line = 22)
    public static void method678(byte arg0) {
        if (arg0 >= -33) {
            method678((byte) -26);
        }
        field1144 = null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lu;I)Z", line = 32)
    public final boolean method679(class80 arg0, int arg1) {
        field1145++;
        int var3 = -4 / ((-arg1 - 63) / 41);
        if (arg0 == null) {
            return false;
        } else {
            return this.field1148 == arg0.field1148 && this.field1141.equals(arg0.field1141);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V", line = 58)
    public final void method680(int arg0) {
        field1147++;
        if (!this.field1140) {
            this.field1140 = true;
            this.field1142 = true;
        } else if (this.field1142) {
            this.field1142 = false;
        } else {
            this.field1140 = false;
        }
        if (arg0 != 43594) {
            this.method680(-8);
        }
    }
}
