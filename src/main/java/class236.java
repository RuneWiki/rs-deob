import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class236 {

    @OriginalMember(owner = "client!pr", name = "d", descriptor = "I")
    public int field3873;

    @OriginalMember(owner = "client!pr", name = "h", descriptor = "Ljava/lang/String;")
    public String field3877;

    @OriginalMember(owner = "client!pr", name = "e", descriptor = "I")
    public static int field3874 = -1;

    @OriginalMember(owner = "client!pr", name = "i", descriptor = "I")
    public static int field3878 = 1;

    @OriginalMember(owner = "client!pr", name = "f", descriptor = "F")
    public static float field3875;

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "I")
    public static int field3871;

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!pr", name = "g", descriptor = "Lmn;")
    public static class162 field3876;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "Lsc;")
    public static class29 field3870;

    @OriginalMember(owner = "client!pr", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3872++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(I)V")
    public static void method1666(int arg0) {
        field3870 = null;
        field3876 = null;
        if (arg0 <= 103) {
            field3870 = null;
        }
    }

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "(I)V")
    public static final void method1667(int arg0) {
        field3871++;
        if (arg0 == 2318) {
            for (int var1 = 0; var1 < 100; var1++) {
                class520.field7707[var1] = true;
            }
        }
    }

    @OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class236(String arg0, int arg1) {
        this.field3873 = arg1;
        this.field3877 = arg0;
    }
}
