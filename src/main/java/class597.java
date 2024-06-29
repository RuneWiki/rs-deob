import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class597 {

    @OriginalMember(owner = "client!as", name = "b", descriptor = "I")
    public static int field8365 = -1;

    @OriginalMember(owner = "client!as", name = "g", descriptor = "I")
    public static int field8370 = 0;

    @OriginalMember(owner = "client!as", name = "d", descriptor = "I")
    public static int field8367 = 0;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "I")
    public int field8364;

    @OriginalMember(owner = "client!as", name = "c", descriptor = "I")
    public int field8366;

    @OriginalMember(owner = "client!as", name = "e", descriptor = "I")
    public static int field8368;

    @OriginalMember(owner = "client!as", name = "f", descriptor = "I")
    public static int field8369;

    @OriginalMember(owner = "client!as", name = "h", descriptor = "I")
    public int field8371;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Z)Lrfa;")
    public static final class550 method3473(boolean arg0) {
        field8369++;
        try {
            return new class515();
        } catch (Throwable var2) {
            if (!arg0) {
                method3473(false);
            }
            try {
                return (class550) Class.forName("ab").getDeclaredConstructor().newInstance();
            } catch (Throwable var1) {
                return new class369();
            }
        }
    }
}
