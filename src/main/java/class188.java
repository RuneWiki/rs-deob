import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public class class188 {

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "Z")
    public boolean field2706 = true;

    @OriginalMember(owner = "client!hv", name = "d", descriptor = "I")
    public static int field2708 = 1407;

    @OriginalMember(owner = "client!hv", name = "h", descriptor = "Lcb;")
    public static class78 field2712 = new class78(16);

    @OriginalMember(owner = "client!hv", name = "i", descriptor = "C")
    private char field2713;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!hv", name = "e", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!hv", name = "f", descriptor = "I")
    public int field2710;

    @OriginalMember(owner = "client!hv", name = "g", descriptor = "I")
    public static int field2711;

    @OriginalMember(owner = "client!hv", name = "j", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!hv", name = "c", descriptor = "Ljava/lang/String;")
    public String field2707;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(ILco;I)V", line = 4)
    private final void method1253(int arg0, class268 arg1, int arg2) {
        field2709++;
        if (arg2 == 1) {
            this.field2713 = class149.method1074(arg1.method1714(-31536), -9345);
        } else if (arg2 == 2) {
            this.field2710 = arg1.method1748(102);
        } else if (arg2 == 4) {
            this.field2706 = false;
        } else if (arg2 == 5) {
            this.field2707 = arg1.method1752(false);
        }
        if (arg0 != -5) {
            this.field2707 = null;
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(I)Z", line = 32)
    public final boolean method1254(int arg0) {
        if (arg0 != -10634) {
            method1256(75);
        }
        field2705++;
        return this.field2713 == 's';
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(ILco;)V", line = 44)
    public final void method1255(int arg0, class268 arg1) {
        field2714++;
        while (true) {
            int var3 = arg1.method1738(255);
            if (var3 == 0) {
                if (arg0 == 3) {
                    return;
                } else {
                    this.method1255(125, null);
                    return;
                }
            }
            this.method1253(arg0 - 8, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "(I)V", line = 66)
    public static void method1256(int arg0) {
        if (arg0 <= -91) {
            field2712 = null;
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(II)I", line = 77)
    public static final int method1257(int arg0, int arg1) {
        field2711++;
        if (arg1 != -12746) {
            method1256(-93);
        }
        int var2 = arg0 & 0x3F;
        int var3 = arg0 >> 6 & 0x3;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "(II)I", line = 136)
    public static int method1258(int arg0, int arg1) {
        return arg0 | arg1;
    }
}
