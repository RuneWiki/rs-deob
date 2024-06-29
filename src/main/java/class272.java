import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public class class272 {

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "Ltda;")
    public static class546 field3844 = new class546(8, 0, 4, 1);

    @OriginalMember(owner = "client!vv", name = "d", descriptor = "Laq;")
    public static class141 field3847 = new class141(1);

    @OriginalMember(owner = "client!vv", name = "e", descriptor = "Lbu;")
    public static class19 field3848 = new class19();

    @OriginalMember(owner = "client!vv", name = "b", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!vv", name = "c", descriptor = "I")
    public static int field3846;

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(B)V")
    public static void method1711(byte arg0) {
        field3844 = null;
        field3848 = null;
        int var1 = 118 / ((86 - arg0) / 32);
        field3847 = null;
    }

    @OriginalMember(owner = "client!vv", name = "b", descriptor = "(B)V")
    public static final void method1712(byte arg0) {
        class24.field237.method1786((byte) -127);
        field3846++;
        class623.field9182.method1596((byte) 61);
        class460.field6511.method3007(-1);
        class79.field1069.setBackground(Color.black);
        class409.field5589 = -1;
        class24.field237 = class268.method1697(true, class79.field1069);
        class623.field9182 = class371.method2215(class79.field1069, 3553, true);
        int var1 = 83 % ((arg0 - 6) / 46);
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(Lgw;I)Lpv;")
    public static final class62 method1713(class148 arg0, int arg1) {
        field3845++;
        arg0.method1032((byte) -33);
        int var2 = arg0.method1032((byte) -33);
        class62 var3 = class403.method2372(var2, -33);
        var3.field781 = arg0.method1032((byte) -33);
        int var4 = arg0.method1032((byte) -33);
        if (arg1 != -23402) {
            field3847 = null;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg0.method1032((byte) -33);
            var3.method11(arg0, -1, var6);
        }
        var3.method395(-49);
        return var3;
    }
}
