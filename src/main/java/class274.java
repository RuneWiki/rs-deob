import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fga")
public class class274 extends class664 {

    @OriginalMember(owner = "client!fga", name = "P", descriptor = "[C")
    public static char[] field3872 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!fga", name = "Q", descriptor = "I")
    public static int field3873;

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(ILha;)V")
    public static final void method1775(int arg0, class543 arg1) {
        field3873++;
        if (!(class456.field6499 >= 2 || class549.field7997) || class131.field1810 != null || arg0 < 113) {
            return;
        }
        String var2;
        if (class549.field7997 && class456.field6499 < 2) {
            var2 = class297.field4060 + class608.field8652.method3543(-24350, class45.field748) + class377.field5459 + " ->";
        } else if (class235.field3514 && class253.field3661.method2780(81, 105) && class456.field6499 > 2) {
            var2 = class353.method2253(class242.field3576, 119);
        } else {
            class304 var3 = class242.field3576;
            if (var3 == null) {
                return;
            }
            var2 = class353.method2253(var3, 112);
            int[] var4 = null;
            if (class238.method1657(var3.field4152, -52)) {
                var4 = class425.field6147.method4144((int) var3.field4156, 127).field6117;
            } else if (var3.field4147 != -1) {
                var4 = class425.field6147.method4144(var3.field4147, 123).field6117;
            } else if (class145.method1017(var3.field4152, 65)) {
                class63 var7 = (class63) class389.field5608.method4020((long) ((int) var3.field4156), (byte) -121);
                if (var7 != null) {
                    class571 var8 = var7.field1004;
                    class521 var9 = var8.field8235;
                    if (var9.field7535 != null) {
                        var9 = var9.method3166(class226.field3372, true);
                    }
                    if (var9 != null) {
                        var4 = var9.field7521;
                    }
                }
            } else if (class503.method3076(var3.field4152, (byte) 119)) {
                Object var5 = null;
                class482 var6;
                if (var3.field4152 == 1009) {
                    var6 = class375.field5421.method2680((int) var3.field4156, (byte) 84);
                } else {
                    var6 = class375.field5421.method2680((int) (var3.field4156 >>> 32 & 0x7FFFFFFFL), (byte) 125);
                }
                if (var6.field6900 != null) {
                    var6 = var6.method2952(-1, class226.field3372);
                }
                if (var6 != null) {
                    var4 = var6.field6961;
                }
            }
            if (var4 != null) {
                var2 = var2 + class718.method4032(var4, 0);
            }
        }
        if (class456.field6499 > 2) {
            var2 = var2 + "<col=ffffff> / " + (class456.field6499 - 2) + class608.field8645.method3543(-24350, class45.field748);
        }
        if (class493.field7098 != null) {
            class400 var11 = class493.field7098.method1035((byte) 92, arg1);
            if (var11 == null) {
                var11 = class193.field2838;
            }
            var11.method2423(class493.field7098.field1997, var2, class493.field7098.field2016, class382.field5533, class493.field7098.field2039, class387.field5591, class493.field7098.field2013, 9408, class637.field9005, class656.field9404, class219.field3262, class42.field708, class493.field7098.field2136, class493.field7098.field2053, class293.field4024);
            class517.method3144(class219.field3262[1], -117, class219.field3262[3], class219.field3262[2], class219.field3262[0]);
        } else if (class451.field6455 != null && class528.field7683 == class391.field5635) {
            int var10 = class193.field2838.method2422(class637.field9005, (byte) 60, class387.field5591, 0, var2, 16777215, class42.field708, class510.field7391 + 4, class382.field5533, class756.field10525 + 16);
            class517.method3144(class756.field10525, -125, 16, class119.field1635.method3063(0, var2) + var10, class510.field7391 + 4);
            return;
        }
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(B)V")
    public static void method1776(byte arg0) {
        if (arg0 != 36) {
            field3872 = null;
        }
        field3872 = null;
    }
}
