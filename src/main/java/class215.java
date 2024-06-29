import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class215 {

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "[[I")
    public static int[][] field3056 = new int[6][];

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "I")
    public static int field3054;

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "Ljq;")
    public static class367 field3058;

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "Ldk;")
    public static class421 field3057;

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "[Lo;")
    public static class359[] field3055;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(B)V", line = 13)
    public static void method1352(byte arg0) {
        if (arg0 < -91) {
            field3055 = null;
            field3058 = null;
            field3056 = null;
            field3057 = null;
        }
    }
}
