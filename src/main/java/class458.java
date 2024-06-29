import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rca")
public class class458 {

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "[I")
    public static int[] field6255 = new int[200];

    @OriginalMember(owner = "client!rca", name = "b", descriptor = "I")
    public int field6256;

    @OriginalMember(owner = "client!rca", name = "c", descriptor = "I")
    public int field6257;

    @OriginalMember(owner = "client!rca", name = "d", descriptor = "I")
    public static int field6258;

    @OriginalMember(owner = "client!rca", name = "e", descriptor = "I")
    public int field6259;

    @OriginalMember(owner = "client!rca", name = "f", descriptor = "I")
    public int field6260;

    @OriginalMember(owner = "client!rca", name = "g", descriptor = "I")
    public int field6261;

    @OriginalMember(owner = "client!rca", name = "h", descriptor = "I")
    public int field6262;

    @OriginalMember(owner = "client!rca", name = "i", descriptor = "[[[J")
    public static long[][][] field6263;

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(B)V")
    public static void method2604(byte arg0) {
        field6263 = null;
        field6255 = null;
        if (arg0 != -126) {
            method2604((byte) 118);
        }
    }
}
