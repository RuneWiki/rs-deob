import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public class class410 {

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "I")
    public static int field5300;

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "I")
    public static int field5301;

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(ILoa;)V")
    public static final void method2325(int arg0, class43 arg1) {
        field5301++;
        if (!(class291.field3758 >= 2 || class499.field6560) || class655.field9114 != null) {
            return;
        }
        String var2;
        if (class499.field6560 && class291.field3758 < 2) {
            var2 = class295.field3842 + class604.field8156.method3280((byte) -76, class144.field1890) + class542.field7044 + " ->";
        } else if (class465.field6070 && class390.field4990.method3168(256, 81) && class291.field3758 > 2) {
            var2 = class45.method419(false, (class57) class658.field9176.field4702.field5497.field5497);
        } else {
            class57 var3 = (class57) class658.field9176.field4702.field5497;
            var2 = class45.method419(false, var3);
            int[] var4 = null;
            if (class302.method1770(1002, var3.field776)) {
                var4 = class232.field3109.method1292(0, (int) var3.field774).field9520;
            } else if (var3.field759 != -1) {
                var4 = class232.field3109.method1292(0, var3.field759).field9520;
            } else if (class478.method2652(107, var3.field776)) {
                class234 var7 = (class234) class505.field6640.method39((long) ((int) var3.field774), arg0 ^ 0xFFFF83FB);
                if (var7 != null) {
                    class532 var8 = var7.field3131;
                    class699 var9 = var8.field6914;
                    if (var9.field9714 != null) {
                        var9 = var9.method3823(class397.field5054, arg0 ^ 0x7F3F);
                    }
                    if (var9 != null) {
                        var4 = var9.field9700;
                    }
                }
            } else if (class226.method1419(var3.field776, (byte) 119)) {
                Object var5 = null;
                class698 var6;
                if (var3.field776 == 1004) {
                    var6 = class348.field4436.method1900(113, (int) var3.field774);
                } else {
                    var6 = class348.field4436.method1900(-115, (int) (var3.field774 >>> 32 & 0x7FFFFFFFL));
                }
                if (var6.field9630 != null) {
                    var6 = var6.method3815(65535, class397.field5054);
                }
                if (var6 != null) {
                    var4 = var6.field9669;
                }
            }
            if (var4 != null) {
                var2 = var2 + class37.method301((byte) -126, var4);
            }
        }
        if (~class291.field3758 < arg0) {
            var2 = var2 + "<col=ffffff> / " + (class291.field3758 - 2) + class604.field8149.method3280((byte) 115, class144.field1890);
        }
        if (class507.field6662 != null) {
            class597 var10 = class507.field6662.method2646((byte) 104, arg1);
            if (var10 == null) {
                var10 = class456.field5983;
            }
            var10.method3237(var2, class665.field9234, class141.field1853, class507.field6662.field6370, class631.field8802, class171.field2122, class507.field6662.field6248, class386.field4958, class507.field6662.field6224, false, class507.field6662.field6247, class521.field6806, class256.field3469, class507.field6662.field6372, class507.field6662.field6302);
            class197.method1303(class521.field6806[0], class521.field6806[1], arg0 ^ 0x3B, class521.field6806[2], class521.field6806[3]);
        } else if (class37.field538 != null && class245.field3273 == class153.field1947) {
            int var11 = class456.field5983.method3242(var2, arg0 + 128, class665.field9234, class518.field6789 + 16, class631.field8802, class256.field3469, 16777215, class686.field9409 + 4, 0, class386.field4958);
            class197.method1303(class686.field9409 + 4, class518.field6789, -58, var11 + class411.field5305.method2900(true, var2), 16);
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(ILwk;IIIII)V")
    public static final void method2326(int arg0, class227 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class89.method677(0, arg2, 0, arg0, arg3, arg1.field506, arg4, arg1.field508, arg5, arg1.field503);
        if (arg6 == 2693) {
            field5300++;
        }
    }
}
