import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class504 extends class49 {

    @OriginalMember(owner = "client!gh", name = "z", descriptor = "I")
    public int field6870 = 0;

    @OriginalMember(owner = "client!gh", name = "A", descriptor = "[I")
    public static int[] field6871 = new int[13];

    @OriginalMember(owner = "client!gh", name = "w", descriptor = "I")
    public static int field6867;

    @OriginalMember(owner = "client!gh", name = "x", descriptor = "I")
    public static int field6868;

    @OriginalMember(owner = "client!gh", name = "y", descriptor = "I")
    public static int field6869;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V")
    public static void method2941(int arg0) {
        field6871 = null;
        if (arg0 < 77) {
            method2941(79);
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IILgga;)V")
    private final void method2942(int arg0, int arg1, class511 arg2) {
        if (arg0 == 2) {
            this.field6870 = arg2.method3002(-1);
        }
        field6868++;
        if (arg1 != 635) {
            this.method2943(null, false);
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lgga;Z)V")
    public final void method2943(class511 arg0, boolean arg1) {
        while (true) {
            int var3 = arg0.method3013(-124);
            if (var3 == 0) {
                field6867++;
                if (!arg1) {
                    this.method2943(null, true);
                    return;
                }
                return;
            }
            this.method2942(var3, 635, arg0);
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(III)I")
    public static final int method2944(int arg0, int arg1, int arg2) {
        field6869++;
        if (arg2 > arg0) {
            int var3 = arg0;
            arg0 = arg2;
            arg2 = var3;
        }
        if (arg1 != 0) {
            return -91;
        }
        while (arg2 != 0) {
            int var4 = arg0 % arg2;
            arg0 = arg2;
            arg2 = var4;
        }
        return arg0;
    }
}
