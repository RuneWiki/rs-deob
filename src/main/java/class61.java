import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class61 {

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field834 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "Lqe;")
    private static class168 field839 = class66.method448("Hidden", -124);

    @OriginalMember(owner = "client!tg", name = "k", descriptor = "Lqe;")
    public static class168 field840 = class66.method448(":clanreq:", 42);

    @OriginalMember(owner = "client!tg", name = "m", descriptor = "Lqe;")
    public static class168 field842 = field839;

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "Z")
    public static volatile boolean field838 = false;

    @OriginalMember(owner = "client!tg", name = "l", descriptor = "Lqe;")
    private static class168 field841 = class66.method448("Loaded fonts", 24);

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "Lqe;")
    public static class168 field837 = field841;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "I")
    public int field830;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "I")
    public int field833;

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "I")
    public int field836;

    @OriginalMember(owner = "client!tg", name = "n", descriptor = "I")
    public static int field843;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V")
    public static final void method413(int arg0) {
        if (arg0 != 19392) {
            method413(55);
        }
        class6.field66.method14(false);
        field832++;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Z)V")
    public static void method414(boolean arg0) {
        field839 = null;
        field842 = null;
        if (!arg0) {
            field841 = null;
        }
        field834 = null;
        field837 = null;
        field840 = null;
        field841 = null;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)V")
    public static final void method415(byte arg0) {
        field831++;
        if (!class18.field186) {
            return;
        }
        if (arg0 <= 27) {
            field839 = null;
        }
        class46.field610 = null;
        class18.field186 = false;
        class194.field3387 = null;
    }
}
