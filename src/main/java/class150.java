import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class150 {

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "I")
    public static int field2324 = 0;

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "I")
    public static int field2323;

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "[I")
    public static int[] field2321;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "[Lbf;")
    public static class58[] field2319;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ZI)V", line = 4)
    public static final void method1092(boolean arg0, int arg1) {
        class335.method2338(class20.field276, arg1 ^ 0x4B60E648, arg0, class147.field2287, class133.field2095);
        field2325++;
        if (arg1 != -1264641594) {
            field2321 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIIIIIIIII)V", line = 22)
    public static final void method1093(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = 121 % ((8 - arg7) / 52);
        field2322++;
        if (arg2 >= class336.field5249 && class191.field3131 >= arg2 && arg0 >= class336.field5249 && class191.field3131 >= arg0 && arg3 >= class336.field5249 && class191.field3131 >= arg3 && arg1 >= class336.field5249 && arg1 <= class191.field3131 && class98.field1410 <= arg6 && arg6 <= class279.field4497 && arg4 >= class98.field1410 && class279.field4497 >= arg4 && class98.field1410 <= arg5 && class279.field4497 >= arg5 && class98.field1410 <= arg8 && arg8 <= class279.field4497) {
            class214.method1538(-119, arg0, arg1, arg2, arg6, arg4, arg9, arg8, arg3, arg5);
        } else {
            class90.method607(arg8, arg2, arg3, arg1, arg6, arg0, (byte) -120, arg9, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIIFIIIZ)[I", line = 40)
    public static final int[] method1094(int arg0, int arg1, int arg2, float arg3, int arg4, int arg5, int arg6, boolean arg7) {
        field2323++;
        class288 var8 = new class288();
        var8.field4619 = (int) (arg3 * 4096.0F);
        var8.field4605 = arg6;
        var8.field4608 = arg7;
        var8.field4622 = arg0;
        if (arg2 != -1881046778) {
            field2319 = (class58[]) null;
        }
        int[] var9 = new int[arg5];
        var8.field4610 = arg1;
        var8.field4614 = arg4;
        var8.method361(-56);
        class324.method2271((byte) -59, arg5, 1);
        var8.method2066(var9, 0, 0);
        return var9;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V", line = 72)
    public static void method1095(int arg0) {
        field2319 = null;
        int var1 = -55 % ((arg0 - 41) / 43);
        field2321 = null;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)V", line = 82)
    public static final void method1096(int arg0, int arg1) {
        if (arg1 != -1264641594) {
            field2319 = (class58[]) null;
        }
        field2320++;
        class331 var2 = class63.field917;
        synchronized (class63.field917) {
            class184.field3061 = arg0;
        }
    }
}
