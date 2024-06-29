import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class249 extends class502 {

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "[I")
    public static int[] field3507 = new int[25];

    @OriginalMember(owner = "client!ec", name = "n", descriptor = "Lvl;")
    public static class15 field3510 = new class15(60, 4);

    @OriginalMember(owner = "client!ec", name = "s", descriptor = "Lfja;")
    public static class783 field3515 = new class783(102, 2);

    @OriginalMember(owner = "client!ec", name = "t", descriptor = "[I")
    public static int[] field3516 = new int[32];

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!ec", name = "l", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!ec", name = "o", descriptor = "I")
    public static int field3511;

    @OriginalMember(owner = "client!ec", name = "p", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!ec", name = "q", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!ec", name = "r", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!ec", name = "u", descriptor = "Lgj;")
    public static class662 field3517;

    @OriginalMember(owner = "client!ec", name = "m", descriptor = "Ljava/lang/Object;")
    public static Object field3509;

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(ILeka;)V", line = 4)
    public class249(int arg0, class492 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(B)I", line = 10)
    public final int method1648(byte arg0) {
        if (arg0 < 49) {
            return -55;
        } else {
            ++field3513;
            return super.field6865;
        }
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)V", line = 24)
    public static final void method1649(int arg0) {
        if (arg0 < 59) {
            field3507 = null;
        }
        class241.method1608(-4342);
        ++field3508;
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Leka;)V", line = 37)
    public class249(class492 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(I)V", line = 40)
    public static void method1650(int arg0) {
        field3510 = null;
        field3517 = null;
        field3516 = null;
        field3515 = null;
        field3509 = null;
        if (arg0 == 29707) {
            field3507 = null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BIIIII)V", line = 55)
    public static final void method1651(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3511;
        int var9 = arg1 + 1;
        class679.method3826(class298.field4105[arg1], arg4, 11, arg2, arg5);
        int var10 = arg3 - 1;
        class679.method3826(class298.field4105[arg3], arg4, 11, arg2, arg5);
        for (int var6 = var9; var10 >= var6; ++var6) {
            int[] var8 = class298.field4105[var6];
            var8[arg2] = var8[arg4] = arg5;
        }
        int var7 = -55 % ((-73 - arg0) / 39);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)I", line = 78)
    public final int method55(int arg0) {
        ++field3505;
        return arg0 > ~super.field6863.method2824((byte) 104).method194(0) ? 4 : 2;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)I", line = 91)
    public final int method57(int arg0, int arg1) {
        ++field3512;
        return arg1 != 0 ? -26 : 1;
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(II)V", line = 106)
    public final void method52(int arg0, int arg1) {
        ++field3506;
        if (arg1 == 0) {
            super.field6865 = arg0;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)V", line = 120)
    public final void method58(boolean arg0) {
        if (super.field6865 < 0 && super.field6865 > 4) {
            super.field6865 = this.method55(-2);
        }
        if (arg0) {
            ++field3514;
        }
    }
}
