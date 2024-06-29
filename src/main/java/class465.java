import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class465 {

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "I")
    public int field6068;

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "[[Z")
    public static boolean[][] field6067 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "Lrba;")
    public static class101 field6066 = new class101("", 16);

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "Z")
    public static boolean field6070 = false;

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "I")
    public static int field6069;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)V", line = 5)
    public static void method2592(int arg0) {
        field6066 = null;
        if (arg0 == 16) {
            field6067 = null;
        }
    }

    @OriginalMember(owner = "client!bn", name = "toString", descriptor = "()Ljava/lang/String;", line = 17)
    public final String toString() {
        field6069++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(II)V", line = 35)
    public class465(int arg0, int arg1) {
        this.field6068 = arg0;
    }
}
