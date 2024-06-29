import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wga")
public class class779 {

    @OriginalMember(owner = "client!wga", name = "c", descriptor = "I")
    public static int field10689 = -1;

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "I")
    public static int field10687;

    @OriginalMember(owner = "client!wga", name = "b", descriptor = "I")
    public static int field10688;

    @OriginalMember(owner = "client!wga", name = "d", descriptor = "I")
    public static int field10690;

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(II)Z", line = 9)
    public static final boolean method4306(int arg0, int arg1) {
        if (arg1 < 63) {
            method4306(108, 27);
        }
        field10690++;
        return arg0 == 7 || arg0 == 8 || arg0 == 9;
    }

    @OriginalMember(owner = "client!wga", name = "toString", descriptor = "()Ljava/lang/String;", line = 24)
    public final String toString() {
        field10687++;
        throw new IllegalStateException();
    }
}
