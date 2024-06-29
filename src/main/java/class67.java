import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class67 {

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "I")
    public static int field982 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "I")
    public static int field979;

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "I")
    public static int field980;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
    public static int field981;

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "[I")
    public static int[] field984;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIIIII)V")
    public static final void method423(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class230 var7 = new class230();
        var7.field3692 = arg1 / 128;
        var7.field3682 = arg2 / 128;
        var7.field3694 = arg3 / 128;
        var7.field3673 = arg4 / 128;
        var7.field3666 = arg0;
        var7.field3672 = arg1;
        var7.field3685 = arg2;
        var7.field3674 = arg3;
        var7.field3696 = arg4;
        var7.field3681 = arg5;
        var7.field3669 = arg6;
        class75.field1179[class262.field4328++] = var7;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V")
    public static void method424(int arg0) {
        if (arg0 == 26734) {
            field984 = null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILfa;Lfa;)I")
    public static final int method425(int arg0, class273 arg1, class273 arg2) {
        field983++;
        int var3 = 0;
        if (arg2.method1874(class174.field2725, arg0 + 3891)) {
            var3++;
        }
        if (arg2.method1874(class192.field3032, arg0 ^ 0xFFFFF0D3)) {
            var3++;
        }
        if (arg0 != -8) {
            return -7;
        }
        if (arg2.method1874(class53.field717, 3883)) {
            var3++;
        }
        if (arg1.method1874(class174.field2725, 3883)) {
            var3++;
        }
        if (arg1.method1874(class192.field3032, arg0 + 3891)) {
            var3++;
        }
        if (arg1.method1874(class53.field717, 3883)) {
            var3++;
        }
        return var3;
    }
}
