import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class245 {

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "S")
    public short field3168;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "Lrl;")
    public class659 field3163;

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "B")
    public byte field3165;

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "B")
    public byte field3167;

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "Llc;")
    public static class590 field3170 = new class590("RC", 1);

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "I")
    public static int field3166;

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "I")
    public static int field3169;

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "Z")
    public static boolean field3171;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(III)I")
    public static final int method1417(int arg0, int arg1, int arg2) {
        field3164++;
        if (arg2 != 25001) {
            return 41;
        }
        int var3 = 1;
        while (arg0 > 1) {
            if ((arg0 & 0x1) != 0) {
                var3 = arg1 * var3;
            }
            arg1 *= arg1;
            arg0 >>= 0x1;
        }
        if (arg0 == 1) {
            return arg1 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)V")
    public static void method1418(byte arg0) {
        field3170 = null;
        if (arg0 <= 42) {
            method1418((byte) -81);
        }
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(B)I")
    public static final int method1419(byte arg0) {
        field3169++;
        if (arg0 != -13) {
            field3171 = false;
        }
        return 14;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V")
    public static final void method1420(int arg0) {
        if (arg0 != -16981) {
            method1417(-87, 6, -106);
        }
        field3166++;
        class153.field1732.method3227((byte) 64);
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(Lrl;III)V")
    public class245(class659 arg0, int arg1, int arg2, int arg3) {
        this.field3168 = (short) arg1;
        this.field3163 = arg0;
        this.field3165 = (byte) arg3;
        this.field3167 = (byte) arg2;
    }
}
