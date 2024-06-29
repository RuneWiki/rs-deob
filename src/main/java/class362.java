import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public class class362 {

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "[S")
    public static short[] field5363 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "I")
    public static int field5362;

    @OriginalMember(owner = "client!hv", name = "c", descriptor = "I")
    public static int field5364;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(B)V")
    public static void method2271(byte arg0) {
        field5363 = null;
        int var1 = 103 % ((-arg0 - 89) / 33);
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lst;ILya;)I")
    public static final int method2272(class300 arg0, int arg1, class38 arg2) {
        field5364++;
        int var3 = -20 % ((-arg1 - 69) / 45);
        if (arg0.field4566 != -1) {
            return arg0.field4566;
        }
        if (arg0.field4547 != -1) {
            class281 var4 = arg2.field524.method584(true, arg2.method347() ? arg0.field4547 : arg0.field4557);
            if (!var4.field4259) {
                return var4.field4263;
            }
        }
        return arg0.field4554;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(III)Z")
    public static final boolean method2273(int arg0, int arg1, int arg2) {
        if (arg0 != 22464) {
            method2273(73, 75, -27);
        }
        field5362++;
        return (arg2 & 0x800) != 0;
    }
}
