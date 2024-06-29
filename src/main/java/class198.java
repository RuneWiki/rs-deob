import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public class class198 {

    @OriginalMember(owner = "client!su", name = "b", descriptor = "[I")
    public static int[] field2883 = new int[5];

    @OriginalMember(owner = "client!su", name = "a", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!su", name = "c", descriptor = "I")
    public static int field2884;

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(I)V")
    public static void method1281(int arg0) {
        field2883 = null;
        if (arg0 != -1) {
            method1282((byte) -105);
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(B)V")
    public static final void method1282(byte arg0) {
        field2884++;
        class458 var1 = (class458) class399.field5298.method3257(-37);
        boolean var2 = class109.field1591 != null || class562.field7461 > 0;
        if (var2) {
            class479.field6386 = 1;
        }
        if (arg0 > -51) {
            field2883 = null;
        }
        if (class363.field4912 && class561.field7444.method3271(81, 0) && class398.field5290 > 2) {
            if (var2) {
                class350.field4794 = (class117) class480.field6411.field7850.field6723.field6723;
            } else {
                class611.method3346(var1.method1654((byte) 96), var1.method1650(0), (class117) class480.field6411.field7850.field6723.field6723, (byte) 104);
            }
        } else if (var2) {
            class350.field4794 = (class117) class480.field6411.field7850.field6723;
        } else {
            class611.method3346(var1.method1654((byte) 96), var1.method1650(0), (class117) class480.field6411.field7850.field6723, (byte) 80);
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(B[[I)V")
    public static final void method1283(byte arg0, int[][] arg1) {
        field2882++;
        class236.field3325 = arg1;
        if (arg0 >= -29) {
            method1281(-56);
        }
    }
}
