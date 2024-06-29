import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vca")
public class class760 {

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "I")
    public int field10436 = -1;

    @OriginalMember(owner = "client!vca", name = "h", descriptor = "I")
    public int field10443 = -1;

    @OriginalMember(owner = "client!vca", name = "e", descriptor = "Lo;")
    public static class208 field10440 = new class208(0, 2, 2, 1);

    @OriginalMember(owner = "client!vca", name = "b", descriptor = "I")
    public static int field10437;

    @OriginalMember(owner = "client!vca", name = "c", descriptor = "I")
    public static int field10438;

    @OriginalMember(owner = "client!vca", name = "d", descriptor = "I")
    public static int field10439;

    @OriginalMember(owner = "client!vca", name = "g", descriptor = "I")
    public static int field10442;

    @OriginalMember(owner = "client!vca", name = "f", descriptor = "[I")
    public int[] field10441;

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(II)Z")
    public static final boolean method4198(int arg0, int arg1) {
        if (arg1 != 2) {
            method4199((byte) 84);
        }
        field10438++;
        return arg0 == 3 || arg0 == 4 || arg0 == 5 || arg0 == 6;
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(B)V")
    public static void method4199(byte arg0) {
        field10440 = null;
        if (arg0 >= -29) {
            method4198(-109, -95);
        }
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(Lgga;I)V")
    public final void method4200(class511 arg0, int arg1) {
        if (arg1 != 11649) {
            return;
        }
        field10439++;
        while (true) {
            int var3 = arg0.method3013(43);
            if (var3 == 0) {
                return;
            }
            this.method4201(var3, (byte) 124, arg0);
        }
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(IBLgga;)V")
    private final void method4201(int arg0, byte arg1, class511 arg2) {
        field10437++;
        if (arg1 < 81) {
            method4198(38, -43);
        }
        if (arg0 == 1) {
            this.field10436 = arg2.method3002(-1);
        } else if (arg0 == 2) {
            this.field10441 = new int[arg2.method3013(-108)];
            for (int var4 = 0; var4 < this.field10441.length; var4++) {
                this.field10441[var4] = arg2.method3002(-1);
            }
        } else if (arg0 == 3) {
            this.field10443 = arg2.method3013(-120);
        }
    }
}
