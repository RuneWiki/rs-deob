import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public abstract class class119 extends class508 {

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "Lwea;")
    public static class259 field1525 = new class259(9, 2);

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "Z")
    public static boolean field1528 = true;

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "I")
    public static int field1527;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IZ)Lvj;")
    public static final class422 method644(int arg0, boolean arg1) {
        field1526++;
        class422 var2 = (class422) class318.field4070.method2418((long) arg0, (byte) 100);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class512.field6953.method3365(arg0, 117, 1);
        class422 var4 = new class422();
        var4.field5298 = arg0;
        if (var3 != null) {
            var4.method2244((byte) -125, new class630(var3));
        }
        var4.method2240((byte) 110);
        if (var4.field5290 == 2 && class78.field1076.method399(-32748, (long) arg0) == null) {
            class78.field1076.method402(new class262(class66.field901), (byte) -39, (long) arg0);
            class463.field5907[class66.field901++] = var4;
        }
        class318.field4070.method2409((long) arg0, var4, 1);
        return arg1 ? null : var4;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
    public static void method645(int arg0) {
        field1525 = null;
        if (arg0 != 2) {
            field1527 = 69;
        }
    }
}
