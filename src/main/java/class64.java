import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public abstract class class64 extends class544 {

    @OriginalMember(owner = "client!u", name = "n", descriptor = "Lcu;")
    public static class185 field631 = new class185(1, 2);

    @OriginalMember(owner = "client!u", name = "r", descriptor = "I")
    public static int field635 = 0;

    @OriginalMember(owner = "client!u", name = "s", descriptor = "S")
    public static short field636 = 205;

    @OriginalMember(owner = "client!u", name = "m", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!u", name = "o", descriptor = "I")
    public static int field632;

    @OriginalMember(owner = "client!u", name = "q", descriptor = "I")
    public static int field634;

    @OriginalMember(owner = "client!u", name = "p", descriptor = "[J")
    public static long[] field633;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V", line = 8)
    public static void method368(byte arg0) {
        field633 = null;
        if (arg0 != -48) {
            field633 = null;
        }
        field631 = null;
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(B)I", line = 19)
    public static final int method369(byte arg0) {
        if (arg0 != 70) {
            field634 = -101;
        }
        field630++;
        return 14;
    }
}
