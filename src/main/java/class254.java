import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class254 extends class168 {

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "Z")
    public static boolean field3244 = false;

    @OriginalMember(owner = "client!ae", name = "s", descriptor = "[[I")
    public static int[][] field3247 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "I")
    public int field3240;

    @OriginalMember(owner = "client!ae", name = "r", descriptor = "I")
    public int field3246;

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "[I")
    public int[] field3238;

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "[I")
    public int[] field3243;

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "[I")
    public int[] field3245;

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "[Lsq;")
    public class181[] field3241;

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "[Lsq;")
    public class181[] field3242;

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "[[[B")
    public byte[][][] field3239;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Z)V")
    public static void method1554(boolean arg0) {
        if (!arg0) {
            field3244 = true;
        }
        field3247 = null;
    }
}
