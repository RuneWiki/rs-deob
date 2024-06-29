import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class672 {

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "F")
    public static float field9182;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "I")
    public static int field9181;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIII)I")
    public static final int method3727(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 > 243) {
            arg1 >>= 0x4;
        } else if (arg0 > 217) {
            arg1 >>= 0x3;
        } else if (arg0 > 192) {
            arg1 >>= 0x2;
        } else if (arg0 > 179) {
            arg1 >>= 0x1;
        }
        field9181++;
        return arg3 == 3935 ? (arg0 >> 1) + (((arg2 >> 2 & 0x3F) << 10) + (arg1 >> 5 << 7)) : -14;
    }
}
