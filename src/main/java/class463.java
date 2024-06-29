import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class463 implements class549 {

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "I")
    public int field6491;

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "[[I")
    public static int[][] field6492 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "I")
    public static int field6490;

    @OriginalMember(owner = "client!ks", name = "d", descriptor = "I")
    public static int field6493;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)Llf;")
    public final class251 method94(int arg0) {
        if (arg0 != 1024) {
            this.method94(111);
        }
        field6490++;
        return class66.field895;
    }

    @OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(I)V")
    public class463(int arg0) {
        this.field6491 = arg0;
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(I)V")
    public static void method2788(int arg0) {
        if (arg0 != -1) {
            field6493 = -86;
        }
        field6492 = null;
    }
}
