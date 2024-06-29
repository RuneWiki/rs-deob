import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class146 {

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
    public int field1827;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "[I")
    public int[] field1830;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "[I")
    public int[] field1828;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "Lhj;")
    public static class596 field1829 = new class596(80, 3);

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
    public static int field1831 = 1403;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V")
    public static void method1063(int arg0) {
        field1829 = null;
        if (arg0 != 1403) {
            field1831 = 79;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Z)V")
    public static final void method1064(boolean arg0) {
        if (arg0) {
            class107.field1351 = class50.field707;
            class621.field8523 = class704.field9910;
        } else {
            class107.field1351 = class172.field2057;
            class621.field8523 = class707.field9933;
        }
        class368.field4569 = class107.field1351.length;
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(I)V")
    public class146(int arg0) {
        this.field1827 = arg0;
        this.field1830 = new int[this.field1827];
        this.field1828 = new int[this.field1827];
    }
}
