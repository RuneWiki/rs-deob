import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class739 {

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "Laq;")
    private class494 field10237 = new class494(64);

    @OriginalMember(owner = "client!sn", name = "g", descriptor = "Lgga;")
    private class513 field10242;

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "Lgga;")
    private class513 field10240;

    @OriginalMember(owner = "client!sn", name = "f", descriptor = "[I")
    public static int[] field10241 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "I")
    public static int field10236;

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "I")
    public static int field10238;

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "I")
    public static int field10239;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(II)Lak;")
    public final class762 method4069(int arg0, int arg1) {
        field10238++;
        class762 var3 = (class762) this.field10237.method2882((long) arg1, (byte) -73);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg1 >= 32768) {
            var4 = this.field10240.method3019(0, arg1 & 0x7FFF, 84);
        } else {
            var4 = this.field10242.method3019(0, arg1, 74);
        }
        if (arg0 <= 39) {
            return null;
        }
        class762 var5 = new class762();
        if (var4 != null) {
            var5.method4215(new class431(var4), (byte) -39);
        }
        if (arg1 >= 32768) {
            var5.method4217(-28188);
        }
        this.field10237.method2890(-7307, (long) arg1, var5);
        return var5;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IZIIIII)V")
    public static final void method4070(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 - arg0 >= class742.field10301 && class435.field6058 >= arg0 + arg4 && class515.field7102 <= arg3 - arg0 && arg0 + arg3 <= class698.field9801) {
            class610.method3530(arg4, arg2, arg5, arg0, 434430412, arg6, arg3);
        } else {
            class766.method4231(arg6, arg4, arg5, -1, arg2, arg3, arg0);
        }
        if (!arg1) {
            field10236++;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)V")
    public static void method4071(int arg0) {
        if (arg0 == 32768) {
            field10241 = null;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "([J[IB)V")
    public static final void method4072(long[] arg0, int[] arg1, byte arg2) {
        field10239++;
        int var3 = 77 / ((arg2 - 71) / 49);
        class700.method3922(-1, arg0, arg0.length - 1, 0, arg1);
    }

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(ILgga;Lgga;)V")
    public class739(int arg0, class513 arg1, class513 arg2) {
        this.field10242 = arg1;
        this.field10240 = arg2;
        if (this.field10242 != null) {
            this.field10242.method3007(-1, 0);
        }
        if (this.field10240 != null) {
            this.field10240.method3007(-1, 0);
        }
    }
}
