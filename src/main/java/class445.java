import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class445 {

    @OriginalMember(owner = "client!am", name = "g", descriptor = "I")
    public static int field6098 = 0;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "I")
    public static int field6092;

    @OriginalMember(owner = "client!am", name = "c", descriptor = "I")
    public static int field6094;

    @OriginalMember(owner = "client!am", name = "d", descriptor = "I")
    public static int field6095;

    @OriginalMember(owner = "client!am", name = "e", descriptor = "I")
    public int field6096;

    @OriginalMember(owner = "client!am", name = "b", descriptor = "Lrn;")
    public class174 field6093;

    @OriginalMember(owner = "client!am", name = "f", descriptor = "[I")
    public int[] field6097;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(BII)Z")
    public static final boolean method2563(byte arg0, int arg1, int arg2) {
        if (arg0 >= -103) {
            field6098 = 120;
        }
        field6095++;
        return (arg1 & 0x84080) != 0;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IZ)I")
    public static final int method2564(int arg0, boolean arg1) {
        if (!arg1) {
            field6098 = 60;
        }
        field6094++;
        return arg0 >>> 8;
    }
}
