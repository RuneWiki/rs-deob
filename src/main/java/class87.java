import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class87 extends class275 {

    @OriginalMember(owner = "client!jn", name = "C", descriptor = "Lbi;")
    public static class104 field1263 = new class104(90, 5);

    @OriginalMember(owner = "client!jn", name = "z", descriptor = "B")
    public byte field1260;

    @OriginalMember(owner = "client!jn", name = "x", descriptor = "I")
    public int field1258;

    @OriginalMember(owner = "client!jn", name = "y", descriptor = "I")
    public static int field1259;

    @OriginalMember(owner = "client!jn", name = "B", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!jn", name = "D", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!jn", name = "A", descriptor = "Lhw;")
    public class208 field1261;

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(II)Z")
    public static final boolean method602(int arg0, int arg1) {
        if (arg0 != 10) {
            method602(51, 124);
        }
        ++field1262;
        return ~arg1 == -4 || arg1 == 7 || arg1 == 10;
    }

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "(I)I")
    public final int method540(int arg0) {
        ++field1264;
        if (arg0 > -12) {
            this.field1261 = null;
        }
        return this.field1261 == null ? 0 : this.field1261.field3162 * 100 / (this.field1261.field3193.length + -this.field1260);
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)[B")
    public final byte[] method539(int arg0) {
        ++field1259;
        if (!super.field4368 && this.field1261.field3162 >= this.field1261.field3193.length - this.field1260) {
            if (arg0 < 22) {
                this.method540(-92);
            }
            return this.field1261.field3193;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jn", name = "g", descriptor = "(I)V")
    public static void method603(int arg0) {
        if (arg0 <= 81) {
            field1263 = null;
        }
        field1263 = null;
    }
}
