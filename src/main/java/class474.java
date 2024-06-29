import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jea")
public class class474 {

    @OriginalMember(owner = "client!jea", name = "c", descriptor = "[I")
    public static int[] field6661 = new int[8];

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "Lofa;")
    public static class347 field6659 = null;

    @OriginalMember(owner = "client!jea", name = "b", descriptor = "I")
    public static int field6660;

    @OriginalMember(owner = "client!jea", name = "d", descriptor = "I")
    public static int field6662;

    @OriginalMember(owner = "client!jea", name = "toString", descriptor = "()Ljava/lang/String;", line = 4)
    public final String toString() {
        field6662++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(Z)V", line = 13)
    public static void method2755(boolean arg0) {
        field6661 = null;
        field6659 = null;
        if (!arg0) {
            field6661 = null;
        }
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "([BB)Ljava/lang/String;", line = 31)
    public static final String method2756(byte[] arg0, byte arg1) {
        if (arg1 >= -93) {
            field6659 = null;
        }
        field6660++;
        return class755.method4143((byte) 111, arg0, arg0.length, 0);
    }

    @OriginalMember(owner = "client!jea", name = "<init>", descriptor = "(II)V", line = 41)
    public class474(int arg0, int arg1) {
    }
}
