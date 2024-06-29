import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class747 extends class415 {

    @OriginalMember(owner = "client!ks", name = "g", descriptor = "I")
    public static int field10205 = -2;

    @OriginalMember(owner = "client!ks", name = "d", descriptor = "I")
    public static int field10202;

    @OriginalMember(owner = "client!ks", name = "e", descriptor = "I")
    public static int field10203;

    @OriginalMember(owner = "client!ks", name = "f", descriptor = "I")
    public static int field10204;

    @OriginalMember(owner = "client!ks", name = "h", descriptor = "I")
    public static int field10206;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(B)V")
    public static final void method4057(byte arg0) {
        class276.field3595 = null;
        field10206++;
        if (class602.field7657 && class400.method2313((byte) -101) != 1) {
            class292.method1764(class488.method2732(1), class332.field4052 == 3 || class332.field4052 == 7, 113, 0, class474.method2672(42), 0);
        }
        if (arg0 != 28) {
            return;
        }
        int var1 = 0;
        int var2 = 0;
        if (class602.field7657) {
            var1 = class498.method2765((byte) -77);
            var2 = class507.method2806((byte) -100);
        }
        class65.method381(class463.field6021 + var2, client.field6070, var1, var2, -1, class372.field4550 + var1, (byte) 125, var1, var2);
        if (class276.field3595 != null) {
            class568.method3060(class564.field7160, class198.field2759.field5109, class225.field3047, 1, var1, -1412584499, class276.field3595, var2, class463.field6021 + var2, true, var1 + class372.field4550);
            class276.field3595 = null;
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "([Ljava/lang/Object;[JI)V")
    public static final void method4058(Object[] arg0, long[] arg1, int arg2) {
        if (arg2 != 11883) {
            method4057((byte) -50);
        }
        class740.method4016(0, arg1.length - 1, arg1, (byte) 55, arg0);
        field10204++;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(ILwm;Lwm;[I)V")
    public static final void method4059(int arg0, class30 arg1, class30 arg2, int[] arg3) {
        class467.field6057 = arg1;
        if (arg3 != null) {
            class207.field2852 = arg3;
        }
        if (arg0 == 0) {
            field10202++;
            class633.field8028 = arg2;
        }
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(I)V")
    public static final void method4060(int arg0) {
        field10203++;
        class793 var1 = (class793) class600.field7629.method3591(0);
        if (arg0 != 30479) {
            return;
        }
        boolean var2 = class430.field5649 != null || class412.field5459 > 0;
        int var3 = var1.method1592(-19898);
        int var4 = var1.method1591(arg0 ^ 0x7764);
        if (var2) {
            class484.field6250 = 1;
        }
        if (var2) {
            class597.field7584 = class643.field8232;
        } else {
            class576.method3097(var4, (byte) -81, var3, class643.field8232);
        }
    }
}
