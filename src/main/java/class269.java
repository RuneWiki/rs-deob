import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class269 extends class396 {

    @OriginalMember(owner = "client!qg", name = "z", descriptor = "I")
    public int field3786 = 1;

    @OriginalMember(owner = "client!qg", name = "s", descriptor = "[I")
    public static int[] field3779 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!qg", name = "D", descriptor = "I")
    public static int field3790 = 0;

    @OriginalMember(owner = "client!qg", name = "C", descriptor = "Z")
    public static boolean field3789 = false;

    @OriginalMember(owner = "client!qg", name = "y", descriptor = "C")
    public char field3785;

    @OriginalMember(owner = "client!qg", name = "r", descriptor = "I")
    public static int field3778;

    @OriginalMember(owner = "client!qg", name = "t", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!qg", name = "u", descriptor = "I")
    public static int field3781;

    @OriginalMember(owner = "client!qg", name = "v", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!qg", name = "w", descriptor = "I")
    public static int field3783;

    @OriginalMember(owner = "client!qg", name = "x", descriptor = "I")
    public static int field3784;

    @OriginalMember(owner = "client!qg", name = "A", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!qg", name = "B", descriptor = "Lgg;")
    public static class95 field3788;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IILhm;IILjf;III)V", line = 5)
    public static final void method1707(int arg0, int arg1, class121 arg2, int arg3, int arg4, class119 arg5, int arg6, int arg7, int arg8) {
        field3781++;
        int var9 = arg6 * arg6 + (arg8 * arg8);
        if (arg3 < var9) {
            return;
        }
        int var10 = Math.min(arg5.field1552 / 2, arg5.field1498 / 2);
        if (arg7 != 1093438415) {
            return;
        }
        if (var10 * var10 >= var9) {
            class327.method2016(arg4, arg0, arg8, arg2, arg5, (byte) -109, arg6, class248.field3369[arg1]);
            return;
        }
        var10 -= 10;
        int var11;
        if (class231.field3128 == 4) {
            var11 = (int) class276.field3893 & 0x3FFF;
        } else {
            var11 = (int) class276.field3893 + class260.field3585 & 0x3FFF;
        }
        int var12 = class286.field4025[var11];
        int var13 = class286.field4035[var11];
        if (class231.field3128 != 4) {
            var12 = var12 * 256 / (class164.field2288 + 256);
            var13 = var13 * 256 / (class164.field2288 + 256);
        }
        int var14 = arg8 * var12 + (arg6 * var13) >> 15;
        int var15 = arg8 * var13 - (arg6 * var12) >> 15;
        double var16 = Math.atan2((double) var14, (double) var15);
        int var18 = (int) (Math.sin(var16) * (double) var10);
        int var19 = (int) (Math.cos(var16) * (double) var10);
        class166.field2328[arg1].method94((float) arg5.field1552 / 2.0F + (float) arg4 + (float) var18, (float) arg5.field1498 / 2.0F + (float) arg0 + (float) (-var19), 4096, (int) (-var16 / 6.283185307179586D * 65535.0D));
    }

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "(B)Z", line = 59)
    public static final boolean method1708(byte arg0) {
        field3782++;
        if (class30.field272 == 0) {
            if (arg0 != -113) {
                method1707(-5, -126, (class121) null, -122, -51, (class119) null, 45, 59, 105);
            }
            return class443.field6477.method1651(true);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "(I)V", line = 74)
    public static void method1709(int arg0) {
        if (arg0 == 2) {
            field3779 = null;
            field3788 = null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lbk;IZ)V", line = 87)
    private final void method1710(class211 arg0, int arg1, boolean arg2) {
        if (arg1 == 1) {
            this.field3785 = class392.method2501(21802, arg0.method1373((byte) 30));
        } else if (arg1 == 2) {
            this.field3786 = 0;
        }
        field3778++;
        if (!arg2) {
            field3788 = null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILbk;)V", line = 122)
    public final void method1711(int arg0, class211 arg1) {
        field3780++;
        if (arg0 != 256) {
            this.field3786 = 115;
        }
        while (true) {
            int var3 = arg1.method1342((byte) -128);
            if (var3 == 0) {
                return;
            }
            this.method1710(arg1, var3, true);
        }
    }
}
