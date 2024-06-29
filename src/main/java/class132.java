import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class132 {

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "Lkha;")
    private class687 field1575;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "I")
    public int field1570;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "Ljava/lang/Object;")
    public static volatile Object field1572 = null;

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "[I")
    public static int[] field1571;

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "[I")
    public static int[] field1574;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V")
    public static void method838(int arg0) {
        field1574 = null;
        field1572 = null;
        int var1 = 48 % ((arg0 - 42) / 62);
        field1571 = null;
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(Ldh;ILkha;)V")
    public class132(class286 arg0, int arg1, class687 arg2) {
        new class114(64);
        this.field1575 = arg2;
        this.field1570 = this.field1575.method3812(0, 15);
    }
}
