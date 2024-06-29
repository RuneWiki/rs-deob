import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class106 extends class13 {

    @OriginalMember(owner = "client!uk", name = "db", descriptor = "Lce;")
    public static class126 field1671 = class206.method1445(-7923, "<)4col>");

    @OriginalMember(owner = "client!uk", name = "cb", descriptor = "[I")
    public static int[] field1670 = new int[5];

    @OriginalMember(owner = "client!uk", name = "fb", descriptor = "I")
    public static int field1673;

    @OriginalMember(owner = "client!uk", name = "gb", descriptor = "I")
    public int field1674;

    @OriginalMember(owner = "client!uk", name = "ib", descriptor = "I")
    public static int field1676;

    @OriginalMember(owner = "client!uk", name = "L", descriptor = "Ldl;")
    public static class29 field1668;

    @OriginalMember(owner = "client!uk", name = "N", descriptor = "Lki;")
    public static class307 field1669;

    @OriginalMember(owner = "client!uk", name = "eb", descriptor = "Lwh;")
    public class58 field1672;

    @OriginalMember(owner = "client!uk", name = "hb", descriptor = "[B")
    public byte[] field1675;

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "(I)I", line = 9)
    public final int method78(int arg0) {
        if (arg0 == 0) {
            field1673++;
            return this.field176 ? 0 : 100;
        } else {
            return 75;
        }
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(Z)V", line = 24)
    public static void method707(boolean arg0) {
        field1670 = null;
        field1669 = null;
        field1668 = null;
        field1671 = null;
        if (arg0) {
            field1671 = (class126) null;
        }
    }

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "(I)[B", line = 47)
    public final byte[] method77(int arg0) {
        field1676++;
        if (this.field176) {
            throw new RuntimeException();
        } else if (arg0 >= -115) {
            return (byte[]) null;
        } else {
            return this.field1675;
        }
    }
}
