import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class107 {

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
    public static int field2548 = 0;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "[Ltd;")
    public static class135[] field2550 = new class135[4];

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    public static int field2544 = -1;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
    public static int field2553 = 0;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "Lqf;")
    public static class117 field2547 = class72.method514(124, "leuchten2:");

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "[I")
    public static int[] field2552 = new int[500];

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "Lqf;")
    private static class117 field2556 = class72.method514(120, "Loading textures )2 ");

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "Lqf;")
    private static class117 field2557 = class72.method514(108, "Trade)4compete");

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "Lqf;")
    public static class117 field2546 = field2557;

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "Lqf;")
    public static class117 field2554 = class72.method514(107, ":: (X");

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "Lqf;")
    public static class117 field2549 = field2556;

    @OriginalMember(owner = "client!pc", name = "q", descriptor = "Lqf;")
    private static class117 field2560 = class72.method514(109, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "Lqf;")
    public static class117 field2559 = field2560;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "I")
    public static int field2558;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "Ljb;")
    public static class64 field2545;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V")
    public static void method809(int arg0) {
        field2559 = null;
        field2560 = null;
        field2545 = null;
        if (arg0 != 0) {
            return;
        }
        field2547 = null;
        field2556 = null;
        field2552 = null;
        field2550 = null;
        field2549 = null;
        field2546 = null;
        field2554 = null;
        field2557 = null;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)Z")
    public static final boolean method810(int arg0, int arg1) {
        field2555++;
        int var2 = -34 % ((arg1 - 31) / 36);
        if (arg0 < 0) {
            return false;
        }
        int var3 = class3.field54[arg0];
        if (var3 >= 2000) {
            var3 -= 2000;
        }
        return var3 == 10;
    }
}
