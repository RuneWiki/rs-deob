import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class102 {

    @OriginalMember(owner = "client!al", name = "e", descriptor = "I")
    public int field1416;

    @OriginalMember(owner = "client!al", name = "g", descriptor = "Ljava/lang/String;")
    public String field1418;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "F")
    public static float field1412;

    @OriginalMember(owner = "client!al", name = "b", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!al", name = "c", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!al", name = "d", descriptor = "I")
    public static int field1415;

    @OriginalMember(owner = "client!al", name = "f", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!al", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1417++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IB)Z")
    public static final boolean method816(int arg0, byte arg1) {
        field1413++;
        int var2 = 102 / ((86 - arg1) / 36);
        return arg0 == 10 || arg0 == 11 || arg0 == 12;
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class102(String arg0, int arg1) {
        this.field1416 = arg1;
        this.field1418 = arg0;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(II)V")
    public static final void method817(int arg0, int arg1) {
        field1415++;
        class137.field1969 = arg1;
        class373.field4792.method3065(true);
        if (arg0 != 10) {
            method817(12, -58);
        }
    }
}
