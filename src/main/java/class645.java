import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public class class645 extends class173 {

    @OriginalMember(owner = "client!jv", name = "s", descriptor = "I")
    public int field8246 = 0;

    @OriginalMember(owner = "client!jv", name = "w", descriptor = "[I")
    public static int[] field8250 = new int[1000];

    @OriginalMember(owner = "client!jv", name = "u", descriptor = "[I")
    public static int[] field8248 = new int[200];

    @OriginalMember(owner = "client!jv", name = "r", descriptor = "I")
    public static int field8245;

    @OriginalMember(owner = "client!jv", name = "t", descriptor = "I")
    public static int field8247;

    @OriginalMember(owner = "client!jv", name = "v", descriptor = "I")
    public static int field8249;

    @OriginalMember(owner = "client!jv", name = "x", descriptor = "I")
    public static int field8251;

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "(II)S")
    public static final short method3487(int arg0, int arg1) {
        field8249++;
        int var2 = (arg1 & 0xFC0C) >> 10;
        int var3 = arg1 >> 3 & 0x70;
        int var4 = arg1 & 0x7F;
        int var5 = var4 > 64 ? (127 - var4) * var3 >> 7 : var3 * var4 >> 7;
        int var6 = 102 / ((54 - arg0) / 58);
        int var7 = var4 + var5;
        int var8;
        if (var7 == 0) {
            var8 = var5 << 1;
        } else {
            var8 = (var5 << 8) / var7;
        }
        return (short) (var8 >> 4 << 7 | var2 << 10 | var7);
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(Lmc;II)V")
    private final void method3488(class234 arg0, int arg1, int arg2) {
        field8247++;
        if (arg1 == 2) {
            this.field8246 = arg0.method1553((byte) -113);
        }
        if (arg2 > -112) {
            this.method3488(null, 111, -94);
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(Lmc;I)V")
    public final void method3489(class234 arg0, int arg1) {
        if (arg1 != 679180298) {
            this.method3489(null, -115);
        }
        field8251++;
        while (true) {
            int var3 = arg0.method1509(true);
            if (var3 == 0) {
                return;
            }
            this.method3488(arg0, var3, -116);
        }
    }

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "(III)Z")
    public static final boolean method3490(int arg0, int arg1, int arg2) {
        field8245++;
        if (arg2 > -15) {
            field8248 = null;
        }
        return (arg0 & 0x84080) != 0;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(I)V")
    public static void method3491(int arg0) {
        field8248 = null;
        field8250 = null;
        if (arg0 != -658883001) {
            field8250 = null;
        }
    }
}
