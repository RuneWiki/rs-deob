import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class41 {

    @OriginalMember(owner = "client!oo", name = "d", descriptor = "[[B")
    public static byte[][] field571 = new byte[1000][];

    @OriginalMember(owner = "client!oo", name = "e", descriptor = "[I")
    public static int[] field572 = new int[200];

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "I")
    public int field569;

    @OriginalMember(owner = "client!oo", name = "c", descriptor = "I")
    public int field570;

    @OriginalMember(owner = "client!oo", name = "f", descriptor = "I")
    public int field573;

    @OriginalMember(owner = "client!oo", name = "g", descriptor = "I")
    public int field574;

    @OriginalMember(owner = "client!oo", name = "h", descriptor = "I")
    public static int field575;

    @OriginalMember(owner = "client!oo", name = "i", descriptor = "J")
    public static long field576;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(I)V", line = 13)
    public static void method373(int arg0) {
        if (arg0 != -24294) {
            field571 = null;
        }
        field572 = null;
        field571 = null;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(III)Z", line = 27)
    public static final boolean method374(int arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            field576 = -103L;
        }
        field575++;
        return (arg1 & 0x180) != 0;
    }
}
