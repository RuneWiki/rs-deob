import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class263 extends class381 {

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "S")
    public short field3409;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "Z")
    public static boolean field3411 = false;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "[Lofa;")
    public static class128[] field3410 = new class128[14];

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "[[I")
    public static int[][] field3413 = new int[128][128];

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "Lcea;")
    public static class94 field3414;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)V", line = 5)
    public static void method1581(byte arg0) {
        field3410 = null;
        field3413 = null;
        if (arg0 <= -99) {
            field3414 = null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V", line = 27)
    public class263() {
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(S)V", line = 32)
    public class263(short arg0) {
        this.field3409 = arg0;
    }
}
