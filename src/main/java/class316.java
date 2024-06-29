import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public class class316 extends class463 {

    @OriginalMember(owner = "client!vv", name = "s", descriptor = "Lqu;")
    public static class219 field4930 = new class219(65, 11);

    @OriginalMember(owner = "client!vv", name = "x", descriptor = "[Lnb;")
    public static class249[] field4935 = new class249[14];

    @OriginalMember(owner = "client!vv", name = "v", descriptor = "Lof;")
    public static class328 field4933 = new class328(8);

    @OriginalMember(owner = "client!vv", name = "r", descriptor = "I")
    public static int field4929;

    @OriginalMember(owner = "client!vv", name = "t", descriptor = "I")
    public static int field4931;

    @OriginalMember(owner = "client!vv", name = "u", descriptor = "I")
    public static int field4932;

    @OriginalMember(owner = "client!vv", name = "w", descriptor = "I")
    public static int field4934;

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(Lwq;B)I")
    public static final int method2109(class378 arg0, byte arg1) {
        field4932++;
        class191 var2 = arg0.field5809;
        if (var2.field2798 != null) {
            var2 = var2.method1190(-1, class96.field1394);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field2774;
        if (arg1 <= 71) {
            method2109(null, (byte) -81);
        }
        class289 var4 = arg0.method418((byte) -41);
        if (arg0.field822) {
            var3 = var2.field2807;
        } else if (arg0.field837 == var4.field4526 || arg0.field837 == var4.field4543 || arg0.field837 == var4.field4540 || arg0.field837 == var4.field4559) {
            var3 = var2.field2769;
        } else if (arg0.field837 == var4.field4519 || arg0.field837 == var4.field4531 || arg0.field837 == var4.field4568 || arg0.field837 == var4.field4575) {
            var3 = var2.field2796;
        }
        return var3;
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(B)V")
    public static void method2110(byte arg0) {
        if (arg0 > 73) {
            field4935 = null;
            field4933 = null;
            field4930 = null;
        }
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(IILhw;)Ljava/lang/String;")
    public static final String method2111(int arg0, int arg1, class208 arg2) {
        field4929++;
        try {
            if (arg1 != -23682) {
                method2111(-10, 82, null);
            }
            int var3 = arg2.method1481(false);
            if (var3 > arg0) {
                var3 = arg0;
            }
            byte[] var4 = new byte[var3];
            arg2.field3162 += class502.field7530.method2949(0, var4, arg1 ^ 0xFFFF8E62, arg2.field3193, arg2.field3162, var3);
            return class520.method3115(var4, (byte) -114, 0, var3);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!vv", name = "b", descriptor = "(III)Lor;")
    public static final class304 method2112(int arg0, int arg1, int arg2) {
        class409 var3 = class217.field3699[arg0][arg1][arg2];
        return var3 == null ? null : var3.field6192;
    }
}
