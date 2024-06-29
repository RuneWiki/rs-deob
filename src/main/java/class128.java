import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class128 extends class349 {

    @OriginalMember(owner = "client!uj", name = "l", descriptor = "I")
    public static int field1668 = 52;

    @OriginalMember(owner = "client!uj", name = "k", descriptor = "Ljava/lang/String;")
    public static String field1667 = "purple:";

    @OriginalMember(owner = "client!uj", name = "j", descriptor = "F")
    public static float field1666;

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "I")
    public static int field1664;

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "Luj;")
    public class128 field1663;

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "Luj;")
    public class128 field1665;

    @OriginalMember(owner = "client!uj", name = "m", descriptor = "Lir;")
    public static class185 field1669;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)V")
    public final void method902(byte arg0) {
        field1664++;
        if (this.field1665 == null) {
            return;
        }
        this.field1665.field1663 = this.field1663;
        this.field1663.field1665 = this.field1665;
        this.field1663 = null;
        this.field1665 = null;
        if (arg0 > -32) {
            field1667 = null;
        }
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(B)V")
    public static void method903(byte arg0) {
        field1669 = null;
        field1667 = null;
        int var1 = 121 % ((50 - arg0) / 60);
    }
}
