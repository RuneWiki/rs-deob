import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class149 extends class290 {

    @OriginalMember(owner = "client!qf", name = "A", descriptor = "I")
    private int field2717 = -32768;

    @OriginalMember(owner = "client!qf", name = "y", descriptor = "Lsf;")
    private static class108 field2715 = class140.method973(255, "Loading fonts )2 ");

    @OriginalMember(owner = "client!qf", name = "D", descriptor = "Lsf;")
    public static class108 field2720 = class140.method973(255, "zap");

    @OriginalMember(owner = "client!qf", name = "t", descriptor = "Lsf;")
    public static class108 field2710 = field2715;

    @OriginalMember(owner = "client!qf", name = "u", descriptor = "Lsf;")
    private static class108 field2711 = class140.method973(255, "Examine");

    @OriginalMember(owner = "client!qf", name = "J", descriptor = "Lsf;")
    public static class108 field2725 = field2711;

    @OriginalMember(owner = "client!qf", name = "v", descriptor = "I")
    public int field2712;

    @OriginalMember(owner = "client!qf", name = "w", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!qf", name = "x", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!qf", name = "z", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!qf", name = "B", descriptor = "I")
    public static int field2718;

    @OriginalMember(owner = "client!qf", name = "F", descriptor = "I")
    public static int field2721;

    @OriginalMember(owner = "client!qf", name = "G", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!qf", name = "H", descriptor = "I")
    public static int field2723;

    @OriginalMember(owner = "client!qf", name = "I", descriptor = "I")
    public int field2724;

    @OriginalMember(owner = "client!qf", name = "K", descriptor = "I")
    public static int field2726;

    @OriginalMember(owner = "client!qf", name = "s", descriptor = "Lik;")
    public static class262 field2709;

    @OriginalMember(owner = "client!qf", name = "C", descriptor = "[[[I")
    public static int[][][] field2719;

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(II)Ljh;", line = 12)
    public static final class272 method1063(int arg0, int arg1) {
        field2713++;
        class272 var2 = (class272) class99.field1750.method642((long) arg0, (byte) -79);
        if (var2 != null) {
            return var2;
        }
        if (arg1 != -18767) {
            method1064(62);
        }
        byte[] var3 = class218.field3890.method1868(12236, class277.method2004(arg0, (byte) -15), class155.method1079(0, arg0));
        class272 var4 = new class272();
        if (var3 != null) {
            var4.method1961(new class249(var3), 124);
        }
        var4.method1967((byte) 59);
        class99.field1750.method643((byte) -49, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "()I", line = 37)
    public final int method95() {
        field2714++;
        return this.field2717;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIII)V", line = 50)
    public final void method99(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2721++;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)V", line = 60)
    public static void method1064(int arg0) {
        field2725 = null;
        field2715 = null;
        field2710 = null;
        if (arg0 <= -27) {
            field2719 = (int[][][]) null;
            field2720 = null;
            field2711 = null;
            field2709 = null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIIIIIJILac;)V", line = 104)
    public final void method98(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class165 arg10) {
        class113 var13 = class144.method994(true, this.field2724).method1008(-114, 0, (class272) null, this.field2712);
        field2718++;
        if (var13 != null) {
            var13.method98(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
            this.field2717 = var13.method95();
        }
    }
}
