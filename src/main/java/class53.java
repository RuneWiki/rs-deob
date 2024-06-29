import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aha")
public class class53 {

    @OriginalMember(owner = "client!aha", name = "f", descriptor = "I")
    public static int field641 = 0;

    @OriginalMember(owner = "client!aha", name = "b", descriptor = "Lqk;")
    public static class1 field637 = new class1(18, 8);

    @OriginalMember(owner = "client!aha", name = "h", descriptor = "Lsha;")
    public static class115 field643 = null;

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "client!aha", name = "c", descriptor = "I")
    public static int field638;

    @OriginalMember(owner = "client!aha", name = "d", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!aha", name = "e", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "client!aha", name = "g", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!aha", name = "i", descriptor = "Lqha;")
    public static class396 field644;

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(III)Z", line = 10)
    public static final boolean method454(int arg0, int arg1, int arg2) {
        field639++;
        if (arg2 != 33) {
            method454(85, -18, 67);
        }
        return (arg1 & 0x21) != 0;
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(III[B)[B", line = 22)
    public static final byte[] method455(int arg0, int arg1, int arg2, byte[] arg3) {
        field636++;
        if (arg1 == 4) {
            byte[] var4 = new byte[arg2];
            class335.method2118(arg3, arg0, var4, 0, arg2);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(I)I", line = 36)
    public static final int method456(int arg0) {
        field640++;
        if (class263.field3850) {
            return 6;
        } else if (class99.field1151 == null) {
            return 0;
        } else {
            int var1 = -56 / ((39 - arg0) / 35);
            int var2 = class99.field1151.field2174;
            if (class529.method3140(-31534, var2)) {
                return 1;
            } else if (class557.method3281(var2, 24)) {
                return 2;
            } else if (class593.method3465(var2, (byte) -126)) {
                return 3;
            } else if (class651.method3728((byte) 125, var2)) {
                return 4;
            } else {
                return 5;
            }
        }
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(B)V", line = 74)
    public static void method457(byte arg0) {
        field643 = null;
        field644 = null;
        if (arg0 == -49) {
            field637 = null;
        }
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "([ILlba;II[IB)Lpca;", line = 89)
    public static final class592 method458(int[] arg0, class223 arg1, int arg2, int arg3, int[] arg4, byte arg5) {
        if (arg5 > -99) {
            field641 = -11;
        }
        field638++;
        if (!arg1.method1491(class612.field8616, 1, class29.field238)) {
            int[] var10 = new int[arg2 * arg3];
            for (int var11 = 0; var11 < arg3; var11++) {
                int var12 = arg2 * var11 + arg4[var11];
                for (int var13 = 0; var13 < arg0[var11]; var13++) {
                    var10[var12++] = -16777216;
                }
            }
            return new class592(arg1, arg2, arg3, var10);
        }
        byte[] var6 = new byte[arg2 * arg3];
        for (int var7 = 0; var7 < arg3; var7++) {
            int var8 = arg2 * var7 + arg4[var7];
            for (int var9 = 0; var9 < arg0[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        return new class592(arg1, arg2, arg3, var6);
    }
}
