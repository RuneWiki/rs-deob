import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class488 {

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "I")
    public static int field6586 = 0;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "I")
    public static int field6581;

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "I")
    public static int field6583;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "I")
    public static int field6584;

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "I")
    public static int field6585;

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "Lq;")
    public static class111 field6582;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)Z")
    public final boolean method2716(int arg0) {
        int var2 = -114 % ((arg0 - 8) / 49);
        field6581++;
        return class580.field8005 == this | class304.field4085 == this;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)V")
    public static void method2717(byte arg0) {
        if (arg0 != 118) {
            field6585 = 17;
        }
        field6582 = null;
    }

    @OriginalMember(owner = "client!dk", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6583++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(II)Z")
    public static final boolean method2718(int arg0, int arg1) {
        field6584++;
        if (arg0 == 17 || arg0 == 45 || arg0 == 44 || arg0 == 8 || arg0 == 1012) {
            return true;
        } else {
            return ~arg0 == arg1 || arg0 == 1006;
        }
    }
}
