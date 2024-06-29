import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class176 implements class117 {

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
    public int field2222;

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "Lada;")
    public class267 field2228;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "I")
    public int field2227;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "Loe;")
    public class15 field2221;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public int field2220;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "Lo;")
    public static class208 field2225 = new class208(13, 0, 1, 0);

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "Z")
    public static boolean field2226 = true;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)V", line = 11)
    public static void method1127(boolean arg0) {
        if (!arg0) {
            field2226 = true;
        }
        field2225 = null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)Lof;", line = 22)
    public class475 method473(int arg0) {
        field2224++;
        if (arg0 != 6) {
            this.field2221 = null;
        }
        return class558.field7853;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BIII)I", line = 43)
    public static final int method1128(byte arg0, int arg1, int arg2, int arg3) {
        if (arg3 > 243) {
            arg1 >>= 0x4;
        } else if (arg3 > 217) {
            arg1 >>= 0x3;
        } else if (arg3 > 192) {
            arg1 >>= 0x2;
        } else if (arg3 > 179) {
            arg1 >>= 0x1;
        }
        field2223++;
        if (arg0 < 1) {
            method1128((byte) -32, -29, -16, -5);
        }
        return ((arg2 >> 2 & 0x3F) << 10) + (arg1 >> 5 << 7) + (arg3 >> 1);
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(ILada;Loe;II)V", line = 70)
    public class176(int arg0, class267 arg1, class15 arg2, int arg3, int arg4) {
        this.field2222 = arg3;
        this.field2228 = arg1;
        this.field2227 = arg4;
        this.field2221 = arg2;
        this.field2220 = arg0;
    }
}
