import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public class class21 {

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "Llc;")
    public static class435 field194 = new class435(5, 0);

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "I")
    public int field195;

    @OriginalMember(owner = "client!cw", name = "d", descriptor = "Lks;")
    public class714 field197;

    @OriginalMember(owner = "client!cw", name = "e", descriptor = "[I")
    public int[] field198;

    @OriginalMember(owner = "client!cw", name = "c", descriptor = "[[I")
    public static int[][] field196;

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(Z)V")
    public static void method98(boolean arg0) {
        field194 = null;
        field196 = null;
        if (!arg0) {
            field194 = null;
        }
    }
}
