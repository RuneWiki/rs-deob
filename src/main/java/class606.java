import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public class class606 {

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "Z")
    public static boolean field8447 = false;

    @OriginalMember(owner = "client!ht", name = "d", descriptor = "I")
    public static int field8449;

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "Lha;")
    public class117 field8446;

    @OriginalMember(owner = "client!ht", name = "c", descriptor = "Lda;")
    public class470 field8448;

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(IIIB)I")
    public static final int method3371(int arg0, int arg1, int arg2, byte arg3) {
        field8449++;
        if (arg3 != -77) {
            method3371(24, -40, -25, (byte) -118);
        }
        if (arg0 > 243) {
            arg1 >>= 0x4;
        } else if (arg0 > 217) {
            arg1 >>= 0x3;
        } else if (arg0 > 192) {
            arg1 >>= 0x2;
        } else if (arg0 > 179) {
            arg1 >>= 0x1;
        }
        return ((arg2 & 0xFF) >> 2 << 10) + (arg1 >> 5 << 7) + (arg0 >> 1);
    }
}
