import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class598 {

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "[I")
    public static int[] field8108 = new int[1];

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "Z")
    public static boolean field8107;

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "[[I")
    public static int[][] field8109;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)V", line = 9)
    public static void method3423(byte arg0) {
        if (arg0 >= -88) {
            method3423((byte) -72);
        }
        field8108 = null;
        field8109 = null;
    }
}
