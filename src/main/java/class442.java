import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class442 extends class238 {

    @OriginalMember(owner = "client!gi", name = "m", descriptor = "Lkr;")
    public class486 field6126 = new class486();

    @OriginalMember(owner = "client!gi", name = "l", descriptor = "I")
    public static int field6125 = 0;

    @OriginalMember(owner = "client!gi", name = "q", descriptor = "[I")
    public static int[] field6130 = new int[14];

    @OriginalMember(owner = "client!gi", name = "n", descriptor = "F")
    public static float field6127;

    @OriginalMember(owner = "client!gi", name = "o", descriptor = "I")
    public static int field6128;

    @OriginalMember(owner = "client!gi", name = "p", descriptor = "I")
    public static int field6129;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)I")
    public static final int method2600(int arg0) {
        if (arg0 != -4967) {
            method2600(19);
        }
        field6129++;
        return 2;
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(B)V")
    public static void method2601(byte arg0) {
        field6130 = null;
        if (arg0 != -22) {
            method2601((byte) -71);
        }
    }
}
