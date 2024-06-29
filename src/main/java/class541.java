import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class541 {

    @OriginalMember(owner = "client!am", name = "e", descriptor = "Llu;")
    public static class610 field8115 = new class610(72, 3);

    @OriginalMember(owner = "client!am", name = "a", descriptor = "I")
    public static int field8111;

    @OriginalMember(owner = "client!am", name = "c", descriptor = "I")
    public static int field8113;

    @OriginalMember(owner = "client!am", name = "f", descriptor = "I")
    public static int field8116;

    @OriginalMember(owner = "client!am", name = "i", descriptor = "Lks;")
    public static class373 field8119;

    @OriginalMember(owner = "client!am", name = "g", descriptor = "[B")
    public byte[] field8117;

    @OriginalMember(owner = "client!am", name = "b", descriptor = "[S")
    public short[] field8112;

    @OriginalMember(owner = "client!am", name = "d", descriptor = "[S")
    public short[] field8114;

    @OriginalMember(owner = "client!am", name = "h", descriptor = "[S")
    public short[] field8118;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(BI)Llt;")
    public static final class581 method3288(byte arg0, int arg1) {
        field8113++;
        class581[] var2 = class430.method2519((byte) 85);
        int var3 = 0;
        int var4 = 75 / ((14 - arg0) / 49);
        while (var3 < var2.length) {
            class581 var5 = var2[var3];
            if (var5.field8541 == arg1) {
                return var5;
            }
            var3++;
        }
        return null;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(B)V")
    public static void method3289(byte arg0) {
        field8119 = null;
        field8115 = null;
        if (arg0 != -101) {
            method3289((byte) -46);
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Lcu;IILcu;ZZI)I")
    public static final int method3290(class187 arg0, int arg1, int arg2, class187 arg3, boolean arg4, boolean arg5, int arg6) {
        field8111++;
        int var7 = class505.method2998(arg5, arg0, arg3, -40, arg1);
        if (arg6 != var7) {
            return arg5 ? -var7 : var7;
        } else if (arg2 == -1) {
            return 0;
        } else {
            int var8 = class505.method2998(arg4, arg0, arg3, -33, arg2);
            return arg4 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(III)V")
    public static final void method3291(int arg0, int arg1, int arg2) {
        field8116++;
        if (arg0 == 3 && class325.method1953(arg2, (byte) 118)) {
            class142.method972(arg1, class302.field4135[arg2], 0);
        }
    }
}
