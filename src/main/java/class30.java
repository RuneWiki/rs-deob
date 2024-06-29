import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class30 extends class248 {

    @OriginalMember(owner = "client!ha", name = "x", descriptor = "I")
    private final int field434;

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "I")
    private final int field430;

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "I")
    private final int field429;

    @OriginalMember(owner = "client!ha", name = "B", descriptor = "I")
    private final int field438;

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "I")
    private final int field432;

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "I")
    private final int field427;

    @OriginalMember(owner = "client!ha", name = "D", descriptor = "I")
    private final int field440;

    @OriginalMember(owner = "client!ha", name = "E", descriptor = "I")
    private final int field441;

    @OriginalMember(owner = "client!ha", name = "w", descriptor = "[I")
    public static int[] field433 = new int[200];

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "Lqh;")
    public static class189 field428 = new class189(500);

    @OriginalMember(owner = "client!ha", name = "C", descriptor = "[I")
    public static int[] field439 = new int[2000];

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!ha", name = "y", descriptor = "I")
    public static int field435;

    @OriginalMember(owner = "client!ha", name = "z", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "client!ha", name = "F", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!ha", name = "G", descriptor = "J")
    public static long field443;

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "[Ljg;")
    public static class158[] field437;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
    public static void method150(int arg0) {
        field437 = null;
        field433 = null;
        if (arg0 >= 39) {
            field428 = null;
            field439 = null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIZIIII)V")
    public static final void method151(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        if (!arg3) {
            ++field436;
            if (~arg0 == ~arg7) {
                class42.method217(-1, arg1, arg7, arg2, arg6, arg5, arg4);
            } else if (-arg7 + arg2 >= class28.field408 && ~class115.field1954 <= ~(arg2 + arg7) && ~class36.field542 >= ~(-arg0 + arg1) && ~class175.field2867 <= ~(arg0 + arg1)) {
                class108.method774(arg5, arg6, arg0, arg1, arg2, arg4, 2, arg7);
            } else {
                class108.method773(arg2, arg1, arg0, (byte) 45, arg5, arg4, arg6, arg7);
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class30(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field434 = arg1;
        this.field430 = arg2;
        this.field429 = arg5;
        this.field438 = arg7;
        this.field432 = arg0;
        this.field427 = arg4;
        this.field440 = arg3;
        this.field441 = arg6;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(III)V")
    public final void method152(int arg0, int arg1, int arg2) {
        ++field442;
        int var4 = -106 % ((arg2 - 66) / 40);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IBI)V")
    public final void method153(int arg0, byte arg1, int arg2) {
        if (arg1 != 98) {
            field428 = null;
        }
        ++field431;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(III)V")
    public final void method154(int arg0, int arg1, int arg2) {
        ++field435;
        int var4 = this.field434 * arg0 >> 12;
        int var5 = this.field432 * arg2 >> 12;
        int var6 = this.field430 * arg2 >> 12;
        int var7 = -108 / ((arg1 - 20) / 59);
        int var8 = this.field429 * arg0 >> 12;
        int var9 = this.field441 * arg2 >> 12;
        int var10 = this.field440 * arg0 >> 12;
        int var11 = this.field427 * arg2 >> 12;
        int var12 = this.field438 * arg0 >> 12;
        class222.method1526(super.field4372, var12, var8, var5, true, var6, var9, var10, var11, var4);
    }
}
