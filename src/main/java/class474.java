import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class474 {

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "I")
    public int field6791;

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "I")
    public static int field6793 = 0;

    @OriginalMember(owner = "client!ap", name = "d", descriptor = "Lcw;")
    public static class179 field6794 = new class179("game4", 3);

    @OriginalMember(owner = "client!ap", name = "g", descriptor = "Lqe;")
    public static class465 field6797 = new class465(92, 4);

    @OriginalMember(owner = "client!ap", name = "h", descriptor = "I")
    public static int field6798 = 0;

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "I")
    public static int field6792;

    @OriginalMember(owner = "client!ap", name = "e", descriptor = "I")
    public static int field6795;

    @OriginalMember(owner = "client!ap", name = "f", descriptor = "[Lkr;")
    public static class743[] field6796;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(I)V", line = 4)
    public static void method2865(int arg0) {
        field6794 = null;
        field6796 = null;
        field6797 = null;
        if (arg0 != 0) {
            method2865(-61);
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(B)I", line = 16)
    public final int method2866(byte arg0) {
        field6795++;
        int var2 = 32 % ((25 - arg0) / 54);
        return this.field6791;
    }

    @OriginalMember(owner = "client!ap", name = "toString", descriptor = "()Ljava/lang/String;", line = 29)
    public final String toString() {
        field6792++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 43)
    public class474(String arg0, int arg1) {
        this.field6791 = arg1;
    }
}
