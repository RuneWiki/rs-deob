import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public class class444 {

    @OriginalMember(owner = "client!eu", name = "c", descriptor = "I")
    public int field6750;

    @OriginalMember(owner = "client!eu", name = "e", descriptor = "Lhga;")
    public static class158 field6752 = new class158(77, 4);

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "I")
    public static int field6748;

    @OriginalMember(owner = "client!eu", name = "d", descriptor = "I")
    public static int field6751;

    @OriginalMember(owner = "client!eu", name = "f", descriptor = "I")
    public static int field6753;

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "[I")
    public static int[] field6749;

    @OriginalMember(owner = "client!eu", name = "toString", descriptor = "()Ljava/lang/String;", line = 4)
    public final String toString() {
        field6751++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(II)V", line = 24)
    public class444(int arg0, int arg1) {
        this.field6750 = arg1;
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(Z)V", line = 35)
    public static void method2801(boolean arg0) {
        field6749 = null;
        field6752 = null;
        if (!arg0) {
            field6749 = null;
        }
    }
}
