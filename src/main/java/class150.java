import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class150 {

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "[I")
    public static int[] field2579 = new int[100];

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "[Ljf;")
    public static class229[] field2584 = new class229[500];

    @OriginalMember(owner = "client!jj", name = "l", descriptor = "Lni;")
    public static class24 field2590 = new class24(64);

    @OriginalMember(owner = "client!jj", name = "x", descriptor = "Ljf;")
    public static class229 field2602 = class212.method1457((byte) 125, "<br>");

    @OriginalMember(owner = "client!jj", name = "y", descriptor = "Ljf;")
    public static class229 field2603 = class212.method1457((byte) 101, "<col=ff0000>");

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "I")
    public int field2580;

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "I")
    public int field2581;

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "I")
    public int field2582;

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "I")
    public int field2583;

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "I")
    public int field2585;

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "I")
    public int field2586;

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!jj", name = "j", descriptor = "I")
    public int field2588;

    @OriginalMember(owner = "client!jj", name = "k", descriptor = "I")
    public int field2589;

    @OriginalMember(owner = "client!jj", name = "m", descriptor = "I")
    public int field2591;

    @OriginalMember(owner = "client!jj", name = "n", descriptor = "I")
    public int field2592;

    @OriginalMember(owner = "client!jj", name = "o", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!jj", name = "p", descriptor = "I")
    public int field2594;

    @OriginalMember(owner = "client!jj", name = "q", descriptor = "I")
    public int field2595;

    @OriginalMember(owner = "client!jj", name = "r", descriptor = "I")
    public int field2596;

    @OriginalMember(owner = "client!jj", name = "s", descriptor = "I")
    public int field2597;

    @OriginalMember(owner = "client!jj", name = "t", descriptor = "I")
    public int field2598;

    @OriginalMember(owner = "client!jj", name = "u", descriptor = "I")
    public int field2599;

    @OriginalMember(owner = "client!jj", name = "v", descriptor = "I")
    public int field2600;

    @OriginalMember(owner = "client!jj", name = "w", descriptor = "I")
    public int field2601;

    @OriginalMember(owner = "client!jj", name = "z", descriptor = "I")
    public static int field2604;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V", line = 27)
    public static void method1023(int arg0) {
        field2579 = null;
        field2584 = null;
        field2603 = null;
        field2602 = null;
        field2590 = null;
        if (arg0 != 0) {
            method1023(27);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIIIIII)V", line = 53)
    public static final void method1024(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2587++;
        int var9 = arg3 - arg5;
        int var10 = (arg2 - arg1 << 16) / var9;
        int var11 = arg7 - arg8;
        if (arg6 != -11655) {
            field2579 = (int[]) null;
        }
        int var12 = (arg4 - arg0 << 16) / var11;
        class225.method1554(var12, arg0, 0, arg7, arg1, arg3, arg5, var10, 0, arg8, 0);
    }
}
