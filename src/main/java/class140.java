import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class140 extends class10 {

    @OriginalMember(owner = "client!oh", name = "x", descriptor = "I")
    private final int field2487;

    @OriginalMember(owner = "client!oh", name = "w", descriptor = "I")
    private final int field2486;

    @OriginalMember(owner = "client!oh", name = "A", descriptor = "I")
    private final int field2490;

    @OriginalMember(owner = "client!oh", name = "o", descriptor = "I")
    private final int field2478;

    @OriginalMember(owner = "client!oh", name = "t", descriptor = "I")
    private final int field2483;

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "I")
    private final int field2473;

    @OriginalMember(owner = "client!oh", name = "s", descriptor = "I")
    private final int field2482;

    @OriginalMember(owner = "client!oh", name = "z", descriptor = "I")
    private final int field2489;

    @OriginalMember(owner = "client!oh", name = "u", descriptor = "Lsb;")
    private static class98 field2484 = class47.method368("Loaded sprites", 0);

    @OriginalMember(owner = "client!oh", name = "r", descriptor = "I")
    public static int field2481 = 0;

    @OriginalMember(owner = "client!oh", name = "l", descriptor = "[J")
    public static long[] field2475 = new long[32];

    @OriginalMember(owner = "client!oh", name = "m", descriptor = "Lsb;")
    public static class98 field2476 = field2484;

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!oh", name = "n", descriptor = "I")
    public static int field2477;

    @OriginalMember(owner = "client!oh", name = "p", descriptor = "I")
    public static int field2479;

    @OriginalMember(owner = "client!oh", name = "q", descriptor = "I")
    public static int field2480;

    @OriginalMember(owner = "client!oh", name = "v", descriptor = "I")
    public static int field2485;

    @OriginalMember(owner = "client!oh", name = "y", descriptor = "I")
    public static int field2488;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IZI)V")
    public final void method101(int arg0, boolean arg1, int arg2) {
        int var4 = this.field2486 * arg0 >> 12;
        ++field2485;
        int var5 = this.field2473 * arg0 >> 12;
        int var6 = this.field2478 * arg2 >> 12;
        int var7 = this.field2483 * arg2 >> 12;
        int var8 = this.field2489 * arg0 >> 12;
        int var9 = this.field2487 * arg0 >> 12;
        if (!arg1) {
            method1052(-102);
        }
        int var10 = this.field2490 * arg2 >> 12;
        int var11 = this.field2482 * arg2 >> 12;
        class206.method1388(super.field211, var11, var9, var4, var10, var8, 10180, var5, var7, var6);
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class140(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field2487 = arg6;
        this.field2486 = arg0;
        this.field2490 = arg3;
        this.field2478 = arg1;
        this.field2483 = arg5;
        this.field2473 = arg4;
        this.field2482 = arg7;
        this.field2489 = arg2;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V")
    public static void method1052(int arg0) {
        field2484 = null;
        field2476 = null;
        field2475 = null;
        if (arg0 != 90) {
            method1052(-58);
        }
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(II)Z")
    public static final boolean method1053(int arg0, int arg1) {
        ++field2477;
        if (arg0 >= -106) {
            return true;
        } else if (~arg1 <= -98 && ~arg1 >= -123) {
            return true;
        } else if (arg1 >= 65 && arg1 <= 90) {
            return true;
        } else {
            return arg1 >= 48 && arg1 <= 57;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(III)V")
    public final void method94(int arg0, int arg1, int arg2) {
        ++field2480;
        if (arg2 != -1) {
            method1052(-16);
        }
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(IZI)V")
    public final void method102(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            ++field2479;
        }
    }
}
