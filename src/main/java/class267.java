import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fga")
public class class267 {

    @OriginalMember(owner = "client!fga", name = "c", descriptor = "Lok;")
    public static class266 field3891 = new class266();

    @OriginalMember(owner = "client!fga", name = "d", descriptor = "[I")
    public static int[] field3892 = new int[] { 3, 7, 15 };

    @OriginalMember(owner = "client!fga", name = "e", descriptor = "Loo;")
    public static class652 field3893 = new class652(64);

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "I")
    public static int field3889;

    @OriginalMember(owner = "client!fga", name = "b", descriptor = "I")
    public static int field3890;

    @OriginalMember(owner = "client!fga", name = "f", descriptor = "I")
    public static int field3894;

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(I)V", line = 6)
    public static void method1738(int arg0) {
        field3892 = null;
        field3893 = null;
        field3891 = null;
        if (arg0 >= -18) {
            field3891 = null;
        }
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;", line = 21)
    public static final String[] method1739(int arg0, String[] arg1) {
        field3889++;
        String[] var2 = new String[5];
        if (arg0 < 87) {
            field3892 = null;
        }
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = var2[var3] + arg1[var3];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!fga", name = "toString", descriptor = "()Ljava/lang/String;", line = 46)
    public final String toString() {
        field3890++;
        throw new IllegalStateException();
    }
}
