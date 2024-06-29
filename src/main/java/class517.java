import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hca")
public class class517 extends class502 {

    @OriginalMember(owner = "client!hca", name = "o", descriptor = "I")
    public static int field7030 = -1;

    @OriginalMember(owner = "client!hca", name = "m", descriptor = "Lrha;")
    public static class235 field7028 = new class235("LIVE", "", "", 0);

    @OriginalMember(owner = "client!hca", name = "s", descriptor = "I")
    public static int field7034 = 0;

    @OriginalMember(owner = "client!hca", name = "t", descriptor = "[F")
    public static float[] field7035 = new float[4];

    @OriginalMember(owner = "client!hca", name = "i", descriptor = "I")
    public static int field7024;

    @OriginalMember(owner = "client!hca", name = "j", descriptor = "I")
    public static int field7025;

    @OriginalMember(owner = "client!hca", name = "k", descriptor = "I")
    public static int field7026;

    @OriginalMember(owner = "client!hca", name = "l", descriptor = "I")
    public static int field7027;

    @OriginalMember(owner = "client!hca", name = "n", descriptor = "I")
    public static int field7029;

    @OriginalMember(owner = "client!hca", name = "p", descriptor = "I")
    public static int field7031;

    @OriginalMember(owner = "client!hca", name = "q", descriptor = "I")
    public static int field7032;

    @OriginalMember(owner = "client!hca", name = "r", descriptor = "Lfo;")
    public static class545 field7033;

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(JBI)Ljava/lang/String;", line = 3)
    public static final String method2947(long arg0, byte arg1, int arg2) {
        class127.method1087((byte) 83, arg0);
        ++field7025;
        int var4 = class60.field821.get(5);
        if (arg1 < 8) {
            field7035 = null;
        }
        int var5 = class60.field821.get(2);
        int var6 = class60.field821.get(1);
        return ~arg2 == -4 ? class102.method889(1, arg2, arg0) : Integer.toString(var4 / 10) + var4 % 10 + "-" + class594.field8336[arg2][var5] + "-" + var6;
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(IB)V", line = 24)
    public static final void method2948(int arg0, byte arg1) {
        ++field7029;
        if (arg1 != 81) {
            method2947(119L, (byte) -33, -127);
        }
        class281 var2 = class54.method395((byte) -53, (long) arg0, 2);
        var2.method1818((byte) 126);
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(Lkm;)V", line = 37)
    public static final void method2949(class375 arg0) {
        class677.field9437 = arg0;
    }

    @OriginalMember(owner = "client!hca", name = "<init>", descriptor = "(ILeka;)V", line = 40)
    public class517(int arg0, class492 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(I)I", line = 46)
    public final int method55(int arg0) {
        ++field7027;
        if (arg0 != -2) {
            return -18;
        } else {
            return !super.field6863.method2824((byte) 75).method192((byte) 71) ? 2 : 3;
        }
    }

    @OriginalMember(owner = "client!hca", name = "b", descriptor = "(I)V", line = 58)
    public static void method2950(int arg0) {
        field7035 = null;
        field7028 = null;
        if (arg0 > -65) {
            field7034 = 17;
        }
        field7033 = null;
    }

    @OriginalMember(owner = "client!hca", name = "c", descriptor = "(II)V", line = 74)
    public final void method52(int arg0, int arg1) {
        ++field7026;
        super.field6865 = arg0;
        if (arg1 != 0) {
            field7035 = null;
        }
    }

    @OriginalMember(owner = "client!hca", name = "c", descriptor = "(B)I", line = 85)
    public final int method2951(byte arg0) {
        ++field7032;
        return arg0 < 49 ? -111 : super.field6865;
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(II)I", line = 97)
    public final int method57(int arg0, int arg1) {
        if (arg1 != 0) {
            return 52;
        } else {
            ++field7024;
            return 1;
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(Z)V", line = 109)
    public final void method58(boolean arg0) {
        if (~super.field6865 > -2 || super.field6865 > 3) {
            super.field6865 = this.method55(-2);
        }
        ++field7031;
        if (!arg0) {
            method2947(-26L, (byte) -72, -42);
        }
    }

    @OriginalMember(owner = "client!hca", name = "<init>", descriptor = "(Leka;)V", line = 132)
    public class517(class492 arg0) {
        super(arg0);
    }
}
