import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public class class54 {

    @OriginalMember(owner = "client!iu", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field749 = new String[] { method571(method570("23J@")), method571(method570("'h\b\u0002C")), method571(method570("53\bn\u0016")), method571(method570("53\bm\u0016")) };

    @OriginalMember(owner = "client!iu", name = "c", descriptor = "[F")
    public static float[] field747 = new float[2];

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "[I")
    public static int[] field746 = new int[16];

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "I")
    public static int field748;

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(Lem;IIILih;Lfw;IZ)V")
    public static final void method568(class339 arg0, int arg1, int arg2, int arg3, class717 arg4, class789 arg5, int arg6, boolean arg7) {
        try {
            if (arg7) {
                field746 = null;
            }
            field748++;
            class576 var8 = new class576();
            var8.field8340 = arg6;
            var8.field8338 = arg1 << 9;
            var8.field8337 = arg3 << 9;
            if (arg5 != null) {
                var8.field8347 = arg5;
                int var9 = arg5.field11452;
                int var10 = arg5.field11390;
                if (arg2 == 1 || arg2 == 3) {
                    var10 = arg5.field11452;
                    var9 = arg5.field11390;
                }
                var8.field8334 = arg5.field11472;
                var8.field8321 = arg5.field11441;
                var8.field8349 = arg5.field11406;
                var8.field8328 = arg5.field11435 << 9;
                var8.field8335 = arg3 + var9 << 9;
                var8.field8326 = arg5.field11400;
                var8.field8352 = arg5.field11439;
                var8.field8330 = arg5.field11414;
                var8.field8339 = arg5.field11455;
                var8.field8348 = arg5.field11384;
                var8.field8331 = arg5.field11388;
                var8.field8322 = arg5.field11454 << 9;
                var8.field8320 = arg1 + var10 << 9;
                if (arg5.field11465 != null) {
                    var8.field8342 = true;
                    var8.method4279(-1);
                }
                if (var8.field8326 != null) {
                    var8.field8341 = (int) (Math.random() * (double) (var8.field8339 - var8.field8349)) + var8.field8349;
                }
                class614.field8777.method3984(var8, 0);
            } else if (arg4 != null) {
                var8.field8329 = arg4;
                class134 var11 = arg4.field10229;
                if (var11.field1659 != null) {
                    var8.field8342 = true;
                    var11 = var11.method1178(class734.field10459, (byte) -116);
                }
                if (var11 != null) {
                    var8.field8320 = var11.field1717 + arg1 << 9;
                    var8.field8335 = var11.field1717 + arg3 << 9;
                    var8.field8321 = class453.method3507(arg4, -1);
                    var8.field8322 = var11.field1701 << 9;
                    var8.field8331 = var11.field1706;
                    var8.field8330 = var11.field1709;
                    var8.field8352 = var11.field1693;
                    var8.field8328 = var11.field1673 << 9;
                    var8.field8334 = var11.field1664;
                }
                class364.field5278.method3984(var8, 0);
            } else if (arg0 != null) {
                var8.field8353 = arg0;
                var8.field8335 = arg3 + arg0.method1437((byte) -28) << 9;
                var8.field8320 = arg0.method1437((byte) -28) + arg1 << 9;
                var8.field8321 = class608.method4491(arg0, 0);
                var8.field8328 = arg0.field4930 << 9;
                var8.field8352 = 256;
                var8.field8331 = arg0.field4907;
                var8.field8334 = 256;
                var8.field8322 = 0;
                var8.field8330 = arg0.field4947;
                class572.field8289.method3691(var8, (long) arg0.field2200, -1);
                return;
            }
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field749[2] + (arg0 == null ? field749[0] : field749[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field749[0] : field749[1]) + ',' + (arg5 == null ? field749[0] : field749[1]) + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(B)V")
    public static void method569(byte arg0) {
        try {
            field746 = null;
            field747 = null;
            if (arg0 >= -69) {
                method569((byte) -57);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field749[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!iu", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method570(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!iu", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method571(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 92;
                    break;
                case 1:
                    var10005 = 70;
                    break;
                case 2:
                    var10005 = 38;
                    break;
                case 3:
                    var10005 = 44;
                    break;
                default:
                    var10005 = 62;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
