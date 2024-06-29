import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class557 {

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "I")
    public static int field7747 = 0;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field7749 = new String[100];

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "I")
    public static int field7745;

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "I")
    public static int field7746;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "I")
    public static int field7748;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ZII)I", line = 5)
    public final int method3281(boolean arg0, int arg1, int arg2) {
        field7746++;
        int var4 = class118.field1561 > arg1 ? class118.field1561 : arg1;
        if (class15.field148 == this) {
            return 0;
        }
        if (arg0) {
            field7747 = -75;
        }
        if (class8.field80 == this) {
            return var4 - arg2;
        } else if (class447.field6202 == this) {
            return (var4 - arg2) / 2;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!rg", name = "toString", descriptor = "()Ljava/lang/String;", line = 30)
    public final String toString() {
        field7748++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V", line = 43)
    public static void method3282(int arg0) {
        field7749 = null;
        if (arg0 != 0) {
            field7749 = null;
        }
    }
}
