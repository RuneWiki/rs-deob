import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class662 extends class60 {

    @OriginalMember(owner = "client!gj", name = "v", descriptor = "Lhj;")
    public static class596 field9091 = new class596(115, 0);

    @OriginalMember(owner = "client!gj", name = "w", descriptor = "I")
    public static int field9092 = 0;

    @OriginalMember(owner = "client!gj", name = "k", descriptor = "I")
    public static int field9080;

    @OriginalMember(owner = "client!gj", name = "l", descriptor = "I")
    public static int field9081;

    @OriginalMember(owner = "client!gj", name = "m", descriptor = "I")
    public static int field9082;

    @OriginalMember(owner = "client!gj", name = "n", descriptor = "I")
    public static int field9083;

    @OriginalMember(owner = "client!gj", name = "p", descriptor = "I")
    public static int field9085;

    @OriginalMember(owner = "client!gj", name = "q", descriptor = "I")
    public static int field9086;

    @OriginalMember(owner = "client!gj", name = "r", descriptor = "I")
    public static int field9087;

    @OriginalMember(owner = "client!gj", name = "s", descriptor = "I")
    public static int field9088;

    @OriginalMember(owner = "client!gj", name = "t", descriptor = "I")
    public static int field9089;

    @OriginalMember(owner = "client!gj", name = "o", descriptor = "Ltf;")
    public static class312 field9084;

    @OriginalMember(owner = "client!gj", name = "u", descriptor = "Ltf;")
    public static class312 field9090;

    @OriginalMember(owner = "client!gj", name = "x", descriptor = "Lcr;")
    public static class600 field9093;

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(ILhd;)V", line = 4)
    public class662(int arg0, class773 arg1) {
        super(arg1);
    }

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "(II)Z", line = 7)
    public static final boolean method3717(int arg0, int arg1) {
        ++field9088;
        if (arg0 != 1) {
            field9092 = -51;
        }
        for (class75 var2 = (class75) class5.field52.method2725(arg0 ^ 36); var2 != null; var2 = (class75) class5.field52.method2726(arg0 ^ -113)) {
            if (class247.method1488((byte) -33, var2.field1029) && ~((long) arg1) == ~var2.field1027) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)V", line = 30)
    public static void method3718(int arg0) {
        if (arg0 != -21962) {
            method3720(15, -112, -65);
        }
        field9091 = null;
        field9090 = null;
        field9093 = null;
        field9084 = null;
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(B)V", line = 44)
    public final void method409(byte arg0) {
        if (super.field799 != 1 && super.field799 != 0) {
            super.field799 = this.method405(false);
        }
        ++field9087;
        if (arg0 > -27) {
            method3720(-111, -114, -37);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Z)I", line = 58)
    public final int method405(boolean arg0) {
        ++field9080;
        return arg0 ? -17 : 1;
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(I)V", line = 72)
    public static final void method3719(int arg0) {
        ++field9085;
        int var1 = class235.field2787;
        int[] var2 = class75.field1040;
        for (int var3 = arg0; var3 < var1; ++var3) {
            class521 var4 = class61.field825[var2[var3]];
            if (var4 != null) {
                class123.method960(var4, (byte) -54, var4.method1665(1720746760));
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(BI)V", line = 99)
    public final void method407(byte arg0, int arg1) {
        super.field799 = arg1;
        ++field9082;
        int var3 = 29 / ((28 - arg0) / 50);
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(II)I", line = 110)
    public final int method406(int arg0, int arg1) {
        ++field9081;
        return arg0 != 0 ? 48 : 1;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(III)Lqja;", line = 124)
    public static final class328 method3720(int arg0, int arg1, int arg2) {
        class727 var3 = class107.field1351[arg0][arg1][arg2];
        return var3 != null && var3.field10177 != null ? var3.field10177 : null;
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(Lhd;)V", line = 132)
    public class662(class773 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "(I)I", line = 137)
    public final int method3721(int arg0) {
        ++field9086;
        if (arg0 != 0) {
            field9084 = null;
        }
        return super.field799;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIIII)V", line = 148)
    public static final void method3722(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (~arg0 <= ~class471.field6572 && arg4 <= class223.field2604 && ~arg5 <= ~class187.field2268 && class461.field6480 >= arg2) {
            class772.method4278((byte) 110, arg4, arg0, arg1, arg2, arg5);
        } else {
            class589.method3378(arg0, arg1, arg2, arg4, arg5, (byte) -54);
        }
        ++field9089;
        if (arg3 != 0) {
            method3719(-57);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIIIIII)V", line = 166)
    public static final void method3723(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field9083;
        int var8 = -112 / ((arg6 - -25) / 50);
        class88 var9 = null;
        for (class88 var10 = (class88) class83.field1126.method2725(37); var10 != null; var10 = (class88) class83.field1126.method2726(-118)) {
            if (~var10.field1182 == ~arg0 && var10.field1176 == arg3 && var10.field1179 == arg4 && ~var10.field1175 == ~arg7) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class88();
            var9.field1182 = arg0;
            var9.field1175 = arg7;
            var9.field1176 = arg3;
            var9.field1179 = arg4;
            if (arg3 >= 0 && arg4 >= 0 && ~class596.field8090 < ~arg3 && ~class107.field1350 < ~arg4) {
                class158.method1112((byte) -74, var9);
            }
            class83.field1126.method2732(var9, 21939);
        }
        var9.field1170 = true;
        var9.field1184 = false;
        var9.field1173 = arg2;
        var9.field1178 = arg5;
        var9.field1172 = arg1;
    }
}
