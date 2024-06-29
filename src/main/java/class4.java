import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public class class4 {

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "Z")
    public static volatile boolean field45 = true;

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "client!ft", name = "c", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!ft", name = "f", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!ft", name = "d", descriptor = "Lbt;")
    public static class48 field48;

    @OriginalMember(owner = "client!ft", name = "e", descriptor = "[[I")
    public static int[][] field49;

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Z)V", line = 3)
    public static void method100(boolean arg0) {
        field48 = null;
        if (arg0) {
            field48 = null;
        }
        field49 = null;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(I)Lol;", line = 17)
    public static final class301 method101(int arg0) {
        field50++;
        try {
            if (arg0 != 0) {
                method100(false);
            }
            return (class301) Class.forName("qa").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(IBI)I", line = 43)
    public final int method102(int arg0, byte arg1, int arg2) {
        if (arg1 < 37) {
            field45 = false;
        }
        field46++;
        int var4 = class705.field9921 <= arg2 ? arg2 : class705.field9921;
        if (class209.field2476 == this) {
            return 0;
        } else if (class120.field1539 == this) {
            return var4 - arg0;
        } else if (class219.field2571 == this) {
            return (var4 - arg0) / 2;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ft", name = "toString", descriptor = "()Ljava/lang/String;", line = 70)
    public final String toString() {
        field47++;
        throw new IllegalStateException();
    }
}
