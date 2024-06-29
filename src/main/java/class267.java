import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ada")
public class class267 {

    @OriginalMember(owner = "client!ada", name = "c", descriptor = "Lqk;")
    public static class1 field3876 = new class1(0, 5);

    @OriginalMember(owner = "client!ada", name = "d", descriptor = "[I")
    public static int[] field3877 = new int[3];

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!ada", name = "b", descriptor = "I")
    public static int field3875;

    @OriginalMember(owner = "client!ada", name = "e", descriptor = "Loo;")
    public static class12 field3878;

    @OriginalMember(owner = "client!ada", name = "toString", descriptor = "()Ljava/lang/String;", line = 5)
    public final String toString() {
        field3875++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(IIB)I", line = 13)
    public final int method1744(int arg0, int arg1, byte arg2) {
        field3874++;
        int var4 = arg0 < class742.field10226 ? class742.field10226 : arg0;
        if (class521.field7185 == this) {
            return 0;
        }
        if (arg2 <= 69) {
            method1745(true);
        }
        if (class713.field9924 == this) {
            return var4 - arg1;
        } else if (class132.field1693 == this) {
            return (var4 - arg1) / 2;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(Z)V", line = 43)
    public static void method1745(boolean arg0) {
        if (!arg0) {
            method1745(false);
        }
        field3878 = null;
        field3876 = null;
        field3877 = null;
    }
}
