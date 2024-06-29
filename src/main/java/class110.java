import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class110 {

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1788 = " has logged out.";

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "Lpd;")
    public static class3 field1786 = new class3(16);

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
    public static int field1790 = 0;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "F")
    public static float field1792;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "Lpk;")
    public static class120 field1793;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "Ljj;")
    public static class159 field1791;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "[[Ltk;")
    public static class266[][] field1789;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(III)J", line = 6)
    public static final long method865(int arg0, int arg1, int arg2) {
        class42 var3 = class34.field521[arg0][arg1][arg2];
        return var3 == null || var3.field655 == null ? 0L : var3.field655.field3605;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V", line = 25)
    public static void method866(int arg0) {
        if (arg0 != 0) {
            field1793 = (class120) null;
        }
        field1791 = null;
        field1788 = null;
        field1793 = null;
        field1786 = null;
        field1789 = (class266[][]) null;
    }
}
