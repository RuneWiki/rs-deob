import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public class class542 extends class540 {

    @OriginalMember(owner = "client!hv", name = "o", descriptor = "Z")
    public boolean field7598;

    @OriginalMember(owner = "client!hv", name = "n", descriptor = "Leq;")
    public class220 field7597;

    @OriginalMember(owner = "client!hv", name = "k", descriptor = "I")
    public int field7594;

    @OriginalMember(owner = "client!hv", name = "i", descriptor = "I")
    public int field7592;

    @OriginalMember(owner = "client!hv", name = "q", descriptor = "Z")
    public static boolean field7600 = false;

    @OriginalMember(owner = "client!hv", name = "m", descriptor = "Lke;")
    public static class622 field7596 = new class622(10, -2);

    @OriginalMember(owner = "client!hv", name = "r", descriptor = "I")
    public static int field7601;

    @OriginalMember(owner = "client!hv", name = "s", descriptor = "I")
    public static int field7602;

    @OriginalMember(owner = "client!hv", name = "j", descriptor = "Z")
    public boolean field7593;

    @OriginalMember(owner = "client!hv", name = "l", descriptor = "Z")
    public boolean field7595;

    @OriginalMember(owner = "client!hv", name = "p", descriptor = "Z")
    public boolean field7599;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lha;IIIIZI)V")
    public static final void method3123(class66 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field7601++;
        if ((class296.field4462 == null || class491.field6977 == null || class161.field2373 == null) && class491.field6972.method3131(124, class203.field2974) && class491.field6972.method3131(-61, class367.field5283) && class491.field6972.method3131(-128, class666.field9381)) {
            class625 var7 = class625.method3580(class491.field6972, class367.field5283, 0);
            class491.field6977 = arg0.method482(var7, true);
            var7.method3585();
            class297.field4483 = arg0.method482(var7, true);
            class296.field4462 = arg0.method482(class625.method3580(class491.field6972, class203.field2974, 0), true);
            class625 var8 = class625.method3580(class491.field6972, class666.field9381, 0);
            class161.field2373 = arg0.method482(var8, true);
            var8.method3585();
            class569.field8062 = arg0.method482(var8, true);
        }
        if (!arg5) {
            field7602 = -11;
        }
        if (class296.field4462 == null || class491.field6977 == null || class161.field2373 == null) {
            return;
        }
        int var9 = (arg6 - (class161.field2373.method777() * 2)) / class296.field4462.method777();
        for (int var10 = 0; var10 < var9; var10++) {
            class296.field4462.method785(class161.field2373.method777() + arg4 + (var10 * class296.field4462.method777()), arg2 + (arg1 - class296.field4462.method789()));
        }
        int var11 = (arg2 - class161.field2373.method789() - arg3) / class491.field6977.method789();
        for (int var12 = 0; var12 < var11; var12++) {
            class491.field6977.method785(arg4, class491.field6977.method789() * var12 + (arg1 + arg3));
            class297.field4483.method785(arg6 + (arg4 - class297.field4483.method777()), class491.field6977.method789() * var12 + (arg1 - -arg3));
        }
        class161.field2373.method785(arg4, arg2 + arg1 - class161.field2373.method789());
        class569.field8062.method785(arg4 + arg6 - class161.field2373.method777(), arg2 + arg1 + -class161.field2373.method789());
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(I)V")
    public static void method3124(int arg0) {
        field7596 = null;
        if (arg0 != -24618) {
            method3123(null, -84, 49, 1, 24, false, -61);
        }
    }

    @OriginalMember(owner = "client!hv", name = "<init>", descriptor = "(ILeq;IZ)V")
    public class542(int arg0, class220 arg1, int arg2, boolean arg3) {
        this.field7598 = arg3;
        this.field7597 = arg1;
        this.field7594 = arg0;
        this.field7592 = arg2;
    }
}
