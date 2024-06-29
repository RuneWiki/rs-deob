import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class361 {

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "Lqe;")
    public static class465 field5059 = new class465(44, 2);

    @OriginalMember(owner = "client!rr", name = "e", descriptor = "Lqe;")
    public static class465 field5062 = new class465(119, 6);

    @OriginalMember(owner = "client!rr", name = "f", descriptor = "[I")
    public static int[] field5063 = new int[2];

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "I")
    public static int field5058;

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "I")
    public static int field5060;

    @OriginalMember(owner = "client!rr", name = "d", descriptor = "Leq;")
    public static class209 field5061;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(B)V")
    public static final void method2247(byte arg0) {
        field5060++;
        if (class401.field5610 == -1) {
            return;
        }
        int var1 = class422.field5917.method1597(122);
        int var2 = class422.field5917.method1592(true);
        class709 var3 = (class709) class119.field1862.method1522(true);
        if (var3 != null) {
            var1 = var3.method2007(-24956);
            var2 = var3.method2002((byte) -104);
        }
        int var4 = 0;
        if (arg0 != -8) {
            return;
        }
        int var5 = 0;
        if (class200.field2876) {
            var4 = class228.method1570((byte) 73);
            var5 = class252.method1712((byte) 37);
        }
        class187.method1326(true, var1, var5, var1 + var4, class363.field5105 + var5, var5, var4, class401.field5610, var2, var4, var2 + var5, class206.field2956 + var4);
        if (class512.field7312 != null) {
            class229.method1573(var1 + var4, var2 + var5, arg0 ^ 0xFFFF995C);
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)V")
    public static final void method2248(int arg0) {
        class729.method4068(true);
        field5058++;
        class34.field450 = false;
        class89.method833(class380.field5300, class396.field5544, class681.field9590, class321.field4557, 127);
        if (arg0 != -16874) {
            method2247((byte) 110);
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Z)V")
    public static void method2249(boolean arg0) {
        field5059 = null;
        field5061 = null;
        if (!arg0) {
            method2248(-56);
        }
        field5062 = null;
        field5063 = null;
    }
}
