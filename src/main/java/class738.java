import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mga")
public class class738 {

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "I")
    public static int field10290 = 0;

    @OriginalMember(owner = "client!mga", name = "c", descriptor = "I")
    public static int field10292;

    @OriginalMember(owner = "client!mga", name = "d", descriptor = "I")
    public static int field10293;

    @OriginalMember(owner = "client!mga", name = "b", descriptor = "Lsw;")
    public static class787 field10291;

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(ZZI)V", line = 3)
    public static final void method4150(boolean arg0, boolean arg1, int arg2) {
        if (arg1) {
            class581.field7916--;
            if (class581.field7916 == 0) {
                class12.field211 = null;
            }
        }
        field10292++;
        if (arg0) {
            class728.field10201--;
            if (class728.field10201 == 0) {
                class437.field5749 = null;
            }
        }
        if (arg2 != 0) {
            method4150(true, true, -79);
        }
    }

    @OriginalMember(owner = "client!mga", name = "toString", descriptor = "()Ljava/lang/String;", line = 35)
    public final String toString() {
        field10293++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(I)V", line = 54)
    public static void method4151(int arg0) {
        if (arg0 == 18026) {
            field10291 = null;
        }
    }
}
