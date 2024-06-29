import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class137 extends class197 {

    @OriginalMember(owner = "client!mg", name = "z", descriptor = "I")
    private final int field2671;

    @OriginalMember(owner = "client!mg", name = "r", descriptor = "I")
    private final int field2663;

    @OriginalMember(owner = "client!mg", name = "s", descriptor = "I")
    private final int field2664;

    @OriginalMember(owner = "client!mg", name = "v", descriptor = "I")
    private final int field2667;

    @OriginalMember(owner = "client!mg", name = "u", descriptor = "Ldc;")
    private static class37 field2666 = class185.method1233((byte) 86, "The server is being updated)3");

    @OriginalMember(owner = "client!mg", name = "H", descriptor = "Ldc;")
    public static class37 field2676 = class185.method1233((byte) 86, "<col=00ffff>");

    @OriginalMember(owner = "client!mg", name = "F", descriptor = "Ldc;")
    public static class37 field2675 = field2666;

    @OriginalMember(owner = "client!mg", name = "x", descriptor = "Lqb;")
    public static class176 field2669 = new class176(50);

    @OriginalMember(owner = "client!mg", name = "q", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!mg", name = "t", descriptor = "I")
    public static int field2665;

    @OriginalMember(owner = "client!mg", name = "w", descriptor = "I")
    public static int field2668;

    @OriginalMember(owner = "client!mg", name = "y", descriptor = "I")
    public static int field2670;

    @OriginalMember(owner = "client!mg", name = "C", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!mg", name = "D", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!mg", name = "I", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!mg", name = "B", descriptor = "Lwa;")
    public static class238 field2672;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)V")
    public static void method955(byte arg0) {
        field2675 = null;
        field2669 = null;
        field2676 = null;
        if (arg0 != 64) {
            field2666 = null;
        }
        field2666 = null;
        field2672 = null;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Ldc;B)Ldc;")
    public static final class37 method956(class37 arg0, byte arg1) {
        ++field2662;
        class141 var2 = class24.method169(arg0, (byte) 79);
        if (var2 == null) {
            return class70.field1265;
        } else {
            if (arg1 <= 74) {
                field2675 = null;
            }
            return var2.field2727;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IB)Lpd;")
    public static final class167 method957(int arg0, byte arg1) {
        ++field2670;
        if (arg1 > -4) {
            method955((byte) 42);
        }
        class167 var2 = (class167) class144.field2760.method87(-3, (long) arg0);
        if (var2 != null) {
            return var2;
        } else {
            class167 var3 = class147.method1016((byte) 123, arg0, class161.field3048, false, class96.field1687);
            if (var3 != null) {
                class144.field2760.method92((long) arg0, var3, true);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(III)V")
    public final void method714(int arg0, int arg1, int arg2) {
        ++field2673;
        if (arg2 >= -101) {
            this.method713(-80, 75, -40);
        }
        int var4 = this.field2671 * arg0 >> 12;
        int var5 = this.field2664 * arg0 >> 12;
        int var6 = this.field2663 * arg1 >> 12;
        int var7 = this.field2667 * arg1 >> 12;
        class41.method363(super.field3688, var5, super.field3675, var4, super.field3681, 2048, var6, var7);
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(IB)I")
    public static final int method958(int arg0, byte arg1) {
        if (arg1 <= 49) {
            field2666 = null;
        }
        ++field2677;
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(III)V")
    public final void method713(int arg0, int arg1, int arg2) {
        ++field2674;
        int var4 = this.field2664 * arg0 >> 12;
        int var5 = this.field2667 * arg2 >> 12;
        int var6 = this.field2663 * arg2 >> 12;
        int var7 = this.field2671 * arg0 >> 12;
        if (arg1 >= 31) {
            class244.method1589(super.field3681, var7, (byte) -40, var4, var5, var6, super.field3688);
        }
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(IIIIIII)V")
    public class137(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field2671 = arg2;
        this.field2663 = arg1;
        this.field2664 = arg0;
        this.field2667 = arg3;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(III)V")
    public final void method715(int arg0, int arg1, int arg2) {
        int var4 = this.field2664 * arg2 >> 12;
        int var5 = this.field2671 * arg2 >> 12;
        int var6 = this.field2663 * arg1 >> 12;
        int var7 = this.field2667 * arg1 >> 12;
        if (arg0 != 1) {
            field2676 = null;
        }
        ++field2668;
        class170.method1155(var6, var7, var4, (byte) 111, var5, super.field3675);
    }
}
