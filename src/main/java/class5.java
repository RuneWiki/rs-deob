import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class5 {

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "[I")
    public static int[] field77 = new int[4096];

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "I")
    public static int field79 = 0;

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "[I")
    public static int[] field78;

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "[Z")
    public static boolean[] field80;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)V")
    public static void method36(byte arg0) {
        field78 = null;
        if (arg0 != 118) {
            method36((byte) 106);
        }
        field77 = null;
        field80 = null;
    }
}
