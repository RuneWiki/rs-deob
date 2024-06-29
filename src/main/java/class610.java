import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tca")
public class class610 extends class69 {

    @OriginalMember(owner = "client!tca", name = "k", descriptor = "I")
    public static volatile int field8597 = -1;

    @OriginalMember(owner = "client!tca", name = "j", descriptor = "I")
    public static int field8596;

    @OriginalMember(owner = "client!tca", name = "l", descriptor = "I")
    public int field8598;

    @OriginalMember(owner = "client!tca", name = "m", descriptor = "I")
    public static int field8599;

    @OriginalMember(owner = "client!tca", name = "n", descriptor = "I")
    public int field8600;

    @OriginalMember(owner = "client!tca", name = "o", descriptor = "I")
    public static int field8601;

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method3533(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg5 != -2) {
            return;
        }
        if (class177.field2236 <= arg4 && arg0 <= class627.field8783 && class727.field10060 <= arg1 && class474.field6576 >= arg7) {
            class289.method1919(arg6, arg2, (byte) 76, arg7, arg0, arg4, arg3, arg1);
        } else {
            class425.method2567(arg4, arg0, arg3, arg2, arg6, arg1, (byte) -90, arg7);
        }
        field8601++;
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(IIIII)V")
    public static final void method3534(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field8599++;
        if (arg3 != -2) {
            field8597 = 83;
        }
        int var5 = class702.field9784;
        if (var5 == 0) {
            return;
        }
        if (var5 == 1) {
            class419.field5839 = arg1;
            class500.field6850 = arg0;
            class525.field7237 = arg4;
            class455.field6369 = arg2;
            class702.field9784 = 2;
        } else if (var5 == 2) {
            if (arg4 < class525.field7237) {
                class525.field7237 = arg4;
            }
            if (arg2 > class455.field6369) {
                class455.field6369 = arg2;
            }
            if (arg1 > class419.field5839) {
                class419.field5839 = arg1;
            }
            if (arg0 < class500.field6850) {
                class500.field6850 = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(BII)V")
    public static final void method3535(byte arg0, int arg1, int arg2) {
        class672.field9439++;
        int var3 = 40 / ((-arg0 - 23) / 44);
        field8596++;
        class116 var4 = class248.method1672(class84.field1023, class739.field10178, -20647);
        var4.field1575.method2996(arg1, true);
        var4.field1575.method2977(false, arg2);
        class443.method2655(0, var4);
    }
}
