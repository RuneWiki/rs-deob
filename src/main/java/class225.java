import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class225 {

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "[I")
    public static int[] field2869 = new int[25];

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "[I")
    public static int[] field2871 = new int[2];

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "[[B")
    public static byte[][] field2872;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "[[[I")
    public static int[][][] field2867;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V", line = 3)
    public static void method1373(int arg0) {
        field2869 = null;
        field2871 = null;
        if (arg0 == -22437) {
            field2872 = null;
            field2867 = null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIZ)Z", line = 17)
    public static final boolean method1374(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            field2872 = null;
        }
        field2870++;
        return (class240.method1448(arg1, (byte) 119, arg0) | (arg0 & 0x2000) != 0 | class361.method2072(65536, arg1, arg0)) & class179.method1145(arg0, 22136, arg1);
    }
}
