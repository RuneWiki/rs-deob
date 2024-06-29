import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class404 {

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "Z")
    public static boolean field5954 = true;

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "[[I")
    public static int[][] field5953 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!uo", name = "e", descriptor = "I")
    public static int field5956 = 0;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "I")
    public static int field5952;

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "I")
    public static int field5955;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(I)V", line = 15)
    public static void method2518(int arg0) {
        field5953 = null;
        if (arg0 != 4) {
            field5953 = null;
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(II)V", line = 28)
    public static final void method2519(int arg0, int arg1) {
        field5955++;
        if (arg0 == 8) {
            class434 var2 = class483.method2888(arg1, 76, 1);
            var2.method2628(50);
        }
    }
}
