import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class376 {

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "[I")
    public static int[] field5860 = new int[8];

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "Lvg;")
    public static class49 field5862 = new class49(32);

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "I")
    public static int field5861;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "[[S")
    public static short[][] field5859;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V")
    public static void method2468(int arg0) {
        field5860 = null;
        field5862 = null;
        field5859 = null;
        if (arg0 != 10656) {
            method2468(-77);
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(CB)I")
    public static final int method2469(char arg0, byte arg1) {
        if (arg1 != 29) {
            field5862 = null;
        }
        field5861++;
        return arg0 >= '\u0000' && arg0 < class386.field5992.length ? class386.field5992[arg0] : -1;
    }
}
