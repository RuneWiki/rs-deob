import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class307 {

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "I")
    public static int field4272;

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "I")
    public static int field4273;

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "I")
    public static int field4274;

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "I")
    public static int field4275;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIBIII)V")
    public static final void method1863(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        if (arg2 >= -75) {
            field4274 = 104;
        }
        field4273++;
        if (class512.field7620 <= arg5 && class94.field1398 >= arg0 && class198.field3084 <= arg3 && arg4 <= class627.field8931) {
            class215.method1457(113, arg0, arg5, arg1, arg4, arg3);
        } else {
            class447.method2605(arg1, arg5, arg3, -84, arg4, arg0);
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Z)V")
    public static final void method1864(boolean arg0) {
        class627.field8925++;
        field4275++;
        class699 var1 = class452.method2630(class699.field9897, class258.field3699, (byte) 121);
        var1.field9908.method2753((byte) 106, class154.method1160(39));
        var1.field9908.method2739((byte) -86, class465.field6689);
        if (arg0) {
            field4274 = -70;
        }
        var1.field9908.method2739((byte) -86, class597.field8633);
        var1.field9908.method2753((byte) 94, class525.field7713.field5969);
        class149.method1134(var1, true);
    }
}
