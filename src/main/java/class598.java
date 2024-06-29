import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public abstract class class598 {

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "[I")
    public static int[] field8429 = new int[2];

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
    public static int field8426;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
    public static int field8427;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "Ldga;")
    public static class444 field8428;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
    public static void method3353(byte arg0) {
        if (arg0 <= -61) {
            field8428 = null;
            field8429 = null;
        }
    }
}
