import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class87 extends class186 {

    @OriginalMember(owner = "client!ii", name = "R", descriptor = "Ljd;")
    public static class92 field1721 = class202.method1325((byte) 90, "titlebox");

    @OriginalMember(owner = "client!ii", name = "O", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!ii", name = "P", descriptor = "I")
    public int field1719;

    @OriginalMember(owner = "client!ii", name = "Q", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!ii", name = "S", descriptor = "I")
    public static int field1722;

    @OriginalMember(owner = "client!ii", name = "T", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!ii", name = "U", descriptor = "I")
    public static int field1724;

    @OriginalMember(owner = "client!ii", name = "V", descriptor = "I")
    public int field1725;

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "(B)V")
    public static void method585(byte arg0) {
        field1721 = null;
        if (arg0 >= -42) {
            field1722 = 4;
        }
    }

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "(I)Ldg;")
    public final class38 method221(int arg0) {
        field1723++;
        return arg0 > -51 ? null : class92.method626((byte) 59, this.field1725).method732(0, this.field1719, null, -10990);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(III)J")
    public static final long method586(int arg0, int arg1, int arg2) {
        class43 var3 = class31.field698[arg0][arg1][arg2];
        return var3 == null || var3.field969 == null ? 0L : var3.field969.field632;
    }
}
