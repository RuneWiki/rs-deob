import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class713 extends class406 {

    @OriginalMember(owner = "client!rl", name = "p", descriptor = "I")
    public int field9922;

    @OriginalMember(owner = "client!rl", name = "s", descriptor = "I")
    public int field9925;

    @OriginalMember(owner = "client!rl", name = "r", descriptor = "Lada;")
    public static class267 field9924 = new class267();

    @OriginalMember(owner = "client!rl", name = "t", descriptor = "Z")
    public static boolean field9926 = false;

    @OriginalMember(owner = "client!rl", name = "n", descriptor = "I")
    public static int field9920;

    @OriginalMember(owner = "client!rl", name = "o", descriptor = "I")
    public static int field9921;

    @OriginalMember(owner = "client!rl", name = "q", descriptor = "I")
    public static int field9923;

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(Lada;Loe;IIIIIIIIII)V")
    public class713(class267 arg0, class15 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field9922 = arg11;
        this.field9925 = arg10;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lkf;Lro;IILib;IIZ)V")
    public static final void method4002(class359 arg0, class286 arg1, int arg2, int arg3, class723 arg4, int arg5, int arg6, boolean arg7) {
        field9921++;
        class571 var8 = new class571();
        if (arg7) {
            method4003(null, -95, null, -39, 103, null);
        }
        var8.field8025 = arg6;
        var8.field8036 = arg2 << 9;
        var8.field8033 = arg3 << 9;
        if (arg1 != null) {
            var8.field8038 = arg1;
            int var9 = arg1.field4146;
            int var10 = arg1.field4148;
            if (arg5 == 1 || arg5 == 3) {
                var9 = arg1.field4148;
                var10 = arg1.field4146;
            }
            var8.field8054 = arg2 + var9 << 9;
            var8.field8031 = arg1.field4157;
            var8.field8032 = arg1.field4172;
            var8.field8053 = arg3 + var10 << 9;
            var8.field8024 = arg1.field4142;
            var8.field8046 = arg1.field4139;
            var8.field8037 = arg1.field4153;
            var8.field8051 = arg1.field4123 << 9;
            var8.field8042 = arg1.field4155;
            var8.field8044 = arg1.field4141 << 9;
            var8.field8030 = arg1.field4196;
            var8.field8052 = arg1.field4180;
            var8.field8039 = arg1.field4175;
            if (arg1.field4136 != null) {
                var8.field8045 = true;
                var8.method3357(-1236336695);
            }
            if (var8.field8042 != null) {
                var8.field8040 = var8.field8052 + (int) ((double) (var8.field8046 - var8.field8052) * Math.random());
            }
            class566.field7987.method1039(var8, 0);
        } else if (arg0 != null) {
            var8.field8034 = arg0;
            class636 var11 = arg0.field5172;
            if (var11.field8872 != null) {
                var8.field8045 = true;
                var11 = var11.method3650(class173.field2192, (byte) 55);
            }
            if (var11 != null) {
                var8.field8054 = var11.field8899 + arg2 << 9;
                var8.field8053 = var11.field8899 + arg3 << 9;
                var8.field8037 = class342.method2169((byte) -113, arg0);
                var8.field8051 = var11.field8893 << 9;
                var8.field8039 = var11.field8911;
                var8.field8031 = var11.field8939;
                var8.field8030 = var11.field8947;
                var8.field8044 = var11.field8882 << 9;
                var8.field8024 = var11.field8946;
            }
            class536.field7419.method1039(var8, 0);
        } else if (arg4 != null) {
            var8.field8035 = arg4;
            var8.field8054 = arg2 + arg4.method3744(1) << 9;
            var8.field8053 = arg3 + arg4.method3744(1) << 9;
            var8.field8037 = class107.method761((byte) 26, arg4);
            var8.field8031 = 256;
            var8.field8051 = 0;
            var8.field8030 = arg4.field9970;
            var8.field8024 = arg4.field9981;
            var8.field8039 = 256;
            var8.field8044 = arg4.field9974 << 9;
            class12.field74.method3666((byte) 65, (long) arg4.field9186, var8);
            return;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lae;ILd;IILjava/awt/Canvas;)Lha;")
    public static final class473 method4003(class283 arg0, int arg1, class101 arg2, int arg3, int arg4, Canvas arg5) {
        field9923++;
        int var6 = 0;
        int var7 = 0;
        if (arg1 >= -25) {
            return null;
        }
        if (arg5 != null) {
            Dimension var8 = arg5.getSize();
            var7 = var8.height;
            var6 = var8.width;
        }
        return class473.method2814(var6, arg4, 0, var7, arg0, arg5, arg2, arg3);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)Lof;")
    public final class475 method473(int arg0) {
        field9920++;
        return arg0 == 6 ? class227.field3443 : null;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Z)V")
    public static void method4004(boolean arg0) {
        field9924 = null;
        if (!arg0) {
            method4003(null, 0, null, -46, 21, null);
        }
    }
}
