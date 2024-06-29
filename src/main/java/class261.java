import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cca")
public class class261 {

    @OriginalMember(owner = "client!cca", name = "b", descriptor = "Lmw;")
    public static class517 field3860 = new class517(72, 2);

    @OriginalMember(owner = "client!cca", name = "f", descriptor = "[Z")
    public static boolean[] field3864 = new boolean[100];

    @OriginalMember(owner = "client!cca", name = "g", descriptor = "[I")
    public static int[] field3865 = new int[3];

    @OriginalMember(owner = "client!cca", name = "c", descriptor = "[B")
    public byte[] field3861;

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "[S")
    public short[] field3859;

    @OriginalMember(owner = "client!cca", name = "d", descriptor = "[S")
    public short[] field3862;

    @OriginalMember(owner = "client!cca", name = "e", descriptor = "[S")
    public short[] field3863;

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(B)V")
    public static void method1767(byte arg0) {
        field3865 = null;
        if (arg0 < -92) {
            field3864 = null;
            field3860 = null;
        }
    }
}
