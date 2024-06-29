import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public class class475 {

    @OriginalMember(owner = "client!lt", name = "e", descriptor = "[Ljava/lang/String;")
    private String[] field6993;

    @OriginalMember(owner = "client!lt", name = "c", descriptor = "Lri;")
    public static class73 field6991 = new class73(12, 8);

    @OriginalMember(owner = "client!lt", name = "g", descriptor = "[I")
    public static int[] field6995 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "I")
    public static int field6989;

    @OriginalMember(owner = "client!lt", name = "d", descriptor = "I")
    public static int field6992;

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "Lrm;")
    public static class281 field6990;

    @OriginalMember(owner = "client!lt", name = "f", descriptor = "Lf;")
    public static class529 field6994;

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(ZI)Ljava/lang/String;", line = 19)
    public final String method2838(boolean arg0, int arg1) {
        field6989++;
        if (arg0) {
            field6994 = null;
        }
        return this.field6993[arg1];
    }

    @OriginalMember(owner = "client!lt", name = "toString", descriptor = "()Ljava/lang/String;", line = 52)
    public final String toString() {
        field6992++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(I)V", line = 94)
    public static void method2839(int arg0) {
        field6991 = null;
        field6994 = null;
        if (arg0 >= 92) {
            field6990 = null;
            field6995 = null;
        }
    }

    @OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", line = 120)
    public class475(String arg0, String arg1, String arg2, String arg3) {
        this.field6993 = new String[] { arg0, arg1, arg2, arg3 };
    }
}
