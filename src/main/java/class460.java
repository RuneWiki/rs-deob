import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class460 {

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "[I")
    public static int[] field6319 = new int[8];

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "F")
    public static float field6320;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
    public static int field6318;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lig;ZZ)V")
    public static final void method2756(class674 arg0, boolean arg1, boolean arg2) {
        arg0.field9496 = arg2;
        if (!class659.field9305) {
            class425.method2591(arg0, class1.field2);
        } else if (arg1) {
            class66.field912[class66.field912.length - 1].method1651(-128, arg0);
        } else {
            int var3 = class688.method3919(arg0.field9487);
            int var4 = class190.field2759[2] * arg0.method282(-1) / arg0.field9491;
            int var5 = class688.method3919(arg0.field9487 - var4);
            int var6 = class688.method3919(arg0.field9487 + var4);
            if (var5 == var6) {
                class66.field912[var3].method1651(-127, arg0);
            } else if (var6 - var5 == 1) {
                class66.field912[class314.field4050 + var5].method1651(-127, arg0);
            } else {
                class66.field912[class66.field912.length - 1].method1651(-128, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)V")
    public static final void method2757(int arg0, int arg1) {
        field6318++;
        if (arg1 != -11864) {
            method2757(-87, 5);
        }
        class118 var2 = class126.method814(true, arg0, 10);
        var2.method778(27970);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
    public static void method2758(int arg0) {
        field6319 = null;
        if (arg0 != 2) {
            field6320 = -0.63144314F;
        }
    }
}
