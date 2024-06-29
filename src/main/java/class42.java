import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public class class42 {

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "Lr;")
    public class182 field474;

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "Lka;")
    public class470 field475;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIIILaha;)V")
    public static final void method249(int arg0, int arg1, int arg2, int arg3, class380 arg4) {
        class691 var5 = class510.method3014(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        arg4.field4635 = (arg1 << class748.field10430) + class598.field8523;
        arg4.field4627 = arg3;
        arg4.field4629 = (arg2 << class748.field10430) + class598.field8523;
        var5.field9733 = arg4;
        int var6 = class504.field7120 == class159.field1758 ? 1 : 0;
        if (arg4.method986(78)) {
            if (arg4.method989(-114)) {
                arg4.field4634 = class300.field3729[var6];
                class300.field3729[var6] = arg4;
                return;
            }
            arg4.field4634 = class436.field6357[var6];
            class436.field6357[var6] = arg4;
            class568.field8076 = true;
            return;
        }
        arg4.field4634 = class228.field2626[var6];
        class228.field2626[var6] = arg4;
    }
}
