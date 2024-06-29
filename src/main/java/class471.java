import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vaa")
public class class471 {

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "I")
    public int field6314 = 0;

    @OriginalMember(owner = "client!vaa", name = "e", descriptor = "I")
    public int field6318 = 0;

    @OriginalMember(owner = "client!vaa", name = "j", descriptor = "I")
    public int field6323 = 2048;

    @OriginalMember(owner = "client!vaa", name = "d", descriptor = "I")
    public int field6317 = 2048;

    @OriginalMember(owner = "client!vaa", name = "h", descriptor = "I")
    public static int field6321 = 0;

    @OriginalMember(owner = "client!vaa", name = "i", descriptor = "Lhg;")
    public static class693 field6322 = new class693(80, -1);

    @OriginalMember(owner = "client!vaa", name = "b", descriptor = "I")
    public static int field6315;

    @OriginalMember(owner = "client!vaa", name = "f", descriptor = "I")
    public static int field6319;

    @OriginalMember(owner = "client!vaa", name = "g", descriptor = "I")
    public static int field6320;

    @OriginalMember(owner = "client!vaa", name = "k", descriptor = "I")
    public static int field6324;

    @OriginalMember(owner = "client!vaa", name = "c", descriptor = "[J")
    public static long[] field6316;

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(ZILsl;)V", line = 4)
    private final void method2681(boolean arg0, int arg1, class461 arg2) {
        if (arg1 == 1) {
            this.field6318 = arg2.method2600((byte) -123);
        } else if (arg1 == 2) {
            this.field6323 = arg2.method2566(-2);
        } else if (arg1 == 3) {
            this.field6317 = arg2.method2566(-2);
        } else if (arg1 == 4) {
            this.field6314 = arg2.method2577(2);
        }
        if (arg0) {
            method2684((byte) -53);
        }
        field6319++;
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(ILsl;)V", line = 34)
    public final void method2682(int arg0, class461 arg1) {
        while (true) {
            int var3 = arg1.method2600((byte) -127);
            if (var3 == 0) {
                if (arg0 != 10247) {
                    this.method2682(-56, null);
                }
                field6315++;
                return;
            }
            this.method2681(false, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IIII)I", line = 61)
    public static final int method2683(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 & 0x3;
        if (arg0 != -1) {
            field6321 = 87;
        }
        field6324++;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return 4095 - arg3;
        } else if (var4 == 2) {
            return 4095 - arg2;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(B)V", line = 86)
    public static void method2684(byte arg0) {
        if (arg0 >= 1) {
            field6322 = null;
            field6316 = null;
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IZI)I", line = 104)
    public static final int method2685(int arg0, boolean arg1, int arg2) {
        field6320++;
        int var3 = 1;
        if (!arg1) {
            method2683(-115, -123, -9, 28);
        }
        while (arg0 > 1) {
            if ((arg0 & 0x1) != 0) {
                var3 = arg2 * var3;
            }
            arg0 >>= 0x1;
            arg2 *= arg2;
        }
        if (arg0 == 1) {
            return arg2 * var3;
        } else {
            return var3;
        }
    }
}
