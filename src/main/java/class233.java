import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lw")
public class class233 {

    @OriginalMember(owner = "client!lw", name = "c", descriptor = "I")
    public int field3750;

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "Z")
    public static boolean field3749 = false;

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!lw", name = "d", descriptor = "I")
    public static int field3751;

    @OriginalMember(owner = "client!lw", name = "e", descriptor = "[[S")
    public static short[][] field3752;

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(I)V", line = 4)
    public static void method1615(int arg0) {
        field3752 = null;
        if (arg0 < 113) {
            field3752 = null;
        }
    }

    @OriginalMember(owner = "client!lw", name = "toString", descriptor = "()Ljava/lang/String;", line = 18)
    public final String toString() {
        field3748++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lw", name = "<init>", descriptor = "(I)V", line = 28)
    public class233(int arg0) {
        this.field3750 = arg0;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(II)V", line = 37)
    public static final void method1616(int arg0, int arg1) {
        field3751++;
        class118 var2 = class86.method755(true, arg1, arg0);
        var2.method936(0);
    }
}
