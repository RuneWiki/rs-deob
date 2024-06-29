import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class131 extends class145 {

    @OriginalMember(owner = "client!g", name = "o", descriptor = "I")
    private final int field2579;

    @OriginalMember(owner = "client!g", name = "r", descriptor = "I")
    private final int field2582;

    @OriginalMember(owner = "client!g", name = "w", descriptor = "I")
    private final int field2587;

    @OriginalMember(owner = "client!g", name = "k", descriptor = "I")
    private final int field2575;

    @OriginalMember(owner = "client!g", name = "z", descriptor = "I")
    private final int field2590;

    @OriginalMember(owner = "client!g", name = "q", descriptor = "I")
    private final int field2581;

    @OriginalMember(owner = "client!g", name = "l", descriptor = "I")
    private final int field2576;

    @OriginalMember(owner = "client!g", name = "u", descriptor = "I")
    private final int field2585;

    @OriginalMember(owner = "client!g", name = "m", descriptor = "J")
    public static volatile long field2577 = 0L;

    @OriginalMember(owner = "client!g", name = "s", descriptor = "Lsg;")
    public static class30 field2583 = class167.method1221((byte) 33, "::noclip");

    @OriginalMember(owner = "client!g", name = "n", descriptor = "I")
    public static int field2578;

    @OriginalMember(owner = "client!g", name = "p", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!g", name = "t", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!g", name = "v", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!g", name = "y", descriptor = "I")
    public static int field2589;

    @OriginalMember(owner = "client!g", name = "x", descriptor = "[I")
    public static int[] field2588;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(ZII)V")
    public final void method790(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            field2588 = null;
        }
        ++field2589;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ZII)V")
    public final void method792(boolean arg0, int arg1, int arg2) {
        ++field2584;
        if (arg0) {
            field2588 = null;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(BJ)Lsg;")
    public static final class30 method997(byte arg0, long arg1) {
        if (arg0 <= 117) {
            field2583 = null;
        }
        ++field2580;
        return class210.method1486(arg1, false, 10, 9);
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(III)V")
    public static final void method998(int arg0, int arg1, int arg2) {
        ++field2578;
        if (arg1 != 26074) {
            method997((byte) -115, 4L);
        }
        class4 var3 = class50.method503((byte) 115, arg2);
        int var4 = var3.field63;
        int var5 = var3.field59;
        int var6 = var3.field60;
        int var7 = class97.field1978[-var4 + var6];
        if (~arg0 > -1 || ~arg0 < ~var7) {
            arg0 = 0;
        }
        int var8 = var7 << var4;
        class243.method1718(true, var8 & arg0 << var4 | class254.field4477[var5] & ~var8, var5);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(III)V")
    public final void method788(int arg0, int arg1, int arg2) {
        int var4 = this.field2587 * arg0 >> 12;
        int var5 = this.field2579 * arg2 >> 12;
        if (arg1 < 120) {
            field2577 = 48L;
        }
        ++field2586;
        int var6 = this.field2575 * arg2 >> 12;
        int var7 = this.field2576 * arg0 >> 12;
        int var8 = this.field2582 * arg2 >> 12;
        int var9 = this.field2590 * arg2 >> 12;
        int var10 = this.field2585 * arg0 >> 12;
        int var11 = this.field2581 * arg0 >> 12;
        class43.method441(var5, var9, var10, super.field2779, 224, var8, var4, var6, var7, var11);
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class131(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field2579 = arg0;
        this.field2582 = arg4;
        this.field2587 = arg1;
        this.field2575 = arg2;
        this.field2590 = arg6;
        this.field2581 = arg7;
        this.field2576 = arg3;
        this.field2585 = arg5;
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(I)V")
    public static void method999(int arg0) {
        field2588 = null;
        field2583 = null;
        if (arg0 > -36) {
            method998(16, 80, 42);
        }
    }
}
