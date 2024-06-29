import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!s")
public class class33 extends class6 {

    @OriginalMember(owner = "mapview!s", name = "l", descriptor = "Lh;")
    public static class15 field421 = class18.method153("Mini)2Game", 1);

    @OriginalMember(owner = "mapview!s", name = "m", descriptor = "I")
    public static int field422 = 0;

    @OriginalMember(owner = "mapview!s", name = "q", descriptor = "I")
    public static int field426 = 0;

    @OriginalMember(owner = "mapview!s", name = "t", descriptor = "I")
    public static int field429 = 0;

    @OriginalMember(owner = "mapview!s", name = "u", descriptor = "I")
    public static int field430 = -1;

    @OriginalMember(owner = "mapview!s", name = "v", descriptor = "Lh;")
    public static class15 field431 = class18.method153("Anvil", 1);

    @OriginalMember(owner = "mapview!s", name = "n", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "mapview!s", name = "r", descriptor = "Lh;")
    public class15 field427;

    @OriginalMember(owner = "mapview!s", name = "s", descriptor = "Lca;")
    public static class18 field428;

    @OriginalMember(owner = "mapview!s", name = "o", descriptor = "Ljava/awt/Font;")
    public static Font field424;

    @OriginalMember(owner = "mapview!s", name = "p", descriptor = "Ljava/lang/String;")
    public static String field425;

    @OriginalMember(owner = "mapview!s", name = "c", descriptor = "(I)V", line = 68)
    public static void method225(int arg0) {
        field428 = null;
        field431 = null;
        field421 = null;
        field425 = null;
        field424 = null;
        if (arg0 != 20071) {
            method226(-19, (byte) -21);
        }
    }

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(IB)Lh;", line = 87)
    public static final class15 method226(int arg0, byte arg1) {
        return arg1 < 52 ? (class15) null : class12.method98(false, false, 10, arg0);
    }
}
