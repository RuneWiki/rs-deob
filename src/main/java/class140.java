import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class140 extends class80 {

    @OriginalMember(owner = "client!w", name = "v", descriptor = "I")
    private int field2658 = -32768;

    @OriginalMember(owner = "client!w", name = "z", descriptor = "Loe;")
    public static class139 field2662 = new class139();

    @OriginalMember(owner = "client!w", name = "B", descriptor = "[I")
    public static int[] field2664 = new int[200];

    @OriginalMember(owner = "client!w", name = "D", descriptor = "Ljd;")
    public static class86 field2666 = class122.method868(":clan:", true);

    @OriginalMember(owner = "client!w", name = "C", descriptor = "Luk;")
    public static class96 field2665 = new class96(260);

    @OriginalMember(owner = "client!w", name = "F", descriptor = "I")
    public static int field2667 = 0;

    @OriginalMember(owner = "client!w", name = "u", descriptor = "I")
    public int field2657;

    @OriginalMember(owner = "client!w", name = "w", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!w", name = "x", descriptor = "I")
    public int field2660;

    @OriginalMember(owner = "client!w", name = "y", descriptor = "I")
    public static int field2661;

    @OriginalMember(owner = "client!w", name = "A", descriptor = "I")
    public static int field2663;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(I)V")
    public static void method998(int arg0) {
        field2664 = null;
        field2662 = null;
        field2666 = null;
        if (arg0 == 260) {
            field2665 = null;
        }
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "()I")
    public final int method233() {
        field2663++;
        return this.field2658;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method230(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field2659++;
        class32 var11 = class272.method1853(0, this.field2660).method485(this.field2657, (byte) 3, 0, (class122) null);
        if (var11 != null) {
            var11.method230(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field2658 = var11.method233();
        }
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(II)V")
    public static final void method999(int arg0, int arg1) {
        field2661++;
        if (arg0 != -7657) {
            method999(52, -66);
        }
        class195.field3502.method693(6, arg1);
        class165.field3088.method693(6, arg1);
    }
}
